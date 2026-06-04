package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.iv.RichEditText;

public class RichTextCell extends FrameLayout implements Theme.Colorable, TextSelectionHelper.ArticleSelectableView {
    private final TextView bullet;
    private BlockRow currentRow;
    private Delegate delegate;
    private final RichEditText editText;
    private boolean forceHint;
    private boolean hijackingSelection;
    private final View indentSpacer;
    private final Theme.ResourcesProvider resourcesProvider;
    private final LinearLayout row;

    public interface Delegate {
        TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper();

        void onBackspace(BlockRow blockRow);

        boolean onBackspaceAtStart(BlockRow blockRow);

        void onEnter(BlockRow blockRow);

        boolean onIndent(BlockRow blockRow, boolean z);

        void onRequestWindowFocusable(RichEditText richEditText, boolean z);

        void onTextChanged(BlockRow blockRow);

        void onTransform(BlockRow blockRow, TL_iv.PageBlock pageBlock, int i, int i2);
    }

    public RichTextCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        LinearLayout linearLayout = new LinearLayout(context);
        this.row = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.indentSpacer = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        TextView textView = new TextView(context);
        this.bullet = textView;
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        textView.setTextSize(1, 16.0f);
        linearLayout.addView(textView, LayoutHelper.createLinear(28, -2));
        RichEditText richEditText = new RichEditText(context, resourcesProvider);
        this.editText = richEditText;
        richEditText.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        richEditText.setListener(new AnonymousClass1());
        richEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public final void onFocusChange(View view2, boolean z) {
                this.f$0.lambda$new$0(view2, z);
            }
        });
        linearLayout.addView(richEditText, LayoutHelper.createLinear(0, -2, 1.0f));
        addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 51, 16.0f, 6.0f, 16.0f, 0.0f));
        updateColors();
    }

    class AnonymousClass1 implements RichEditText.Listener {
        AnonymousClass1() {
        }

        @Override
        public void onEnterPressed(RichEditText richEditText) {
            if (RichTextCell.this.delegate == null || RichTextCell.this.currentRow == null) {
                return;
            }
            Transform transformMatchEnterTrigger = RichTextCell.matchEnterTrigger(richEditText.getText().toString(), RichTextCell.this.currentRow);
            if (transformMatchEnterTrigger != null) {
                RichTextCell.this.delegate.onTransform(RichTextCell.this.currentRow, transformMatchEnterTrigger.block, transformMatchEnterTrigger.level, transformMatchEnterTrigger.num);
            } else {
                RichTextCell.this.delegate.onEnter(RichTextCell.this.currentRow);
            }
        }

        @Override
        public void onBackspaceOnEmpty(RichEditText richEditText) {
            if (RichTextCell.this.delegate == null || RichTextCell.this.currentRow == null) {
                return;
            }
            RichTextCell.this.delegate.onBackspace(RichTextCell.this.currentRow);
        }

        @Override
        public boolean onBackspaceAtStart(RichEditText richEditText) {
            if (RichTextCell.this.delegate == null || RichTextCell.this.currentRow == null) {
                return false;
            }
            return RichTextCell.this.delegate.onBackspaceAtStart(RichTextCell.this.currentRow);
        }

        @Override
        public void onTextChanged(RichEditText richEditText, Editable editable) {
            if (RichTextCell.this.currentRow == null) {
                return;
            }
            RichTextCell.applyTextToBlock(RichTextCell.this.currentRow.block, editable.toString());
            if (RichTextCell.this.delegate != null) {
                RichTextCell.this.delegate.onTextChanged(RichTextCell.this.currentRow);
            }
            final Transform transformMatchMarkdownTrigger = RichTextCell.matchMarkdownTrigger(editable.toString(), RichTextCell.this.currentRow);
            if (transformMatchMarkdownTrigger == null || RichTextCell.this.delegate == null) {
                return;
            }
            final BlockRow blockRow = RichTextCell.this.currentRow;
            RichTextCell.this.post(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onTextChanged$0(blockRow, transformMatchMarkdownTrigger);
                }
            });
        }

        public void lambda$onTextChanged$0(BlockRow blockRow, Transform transform) {
            if (RichTextCell.this.delegate != null) {
                RichTextCell.this.delegate.onTransform(blockRow, transform.block, transform.level, transform.num);
            }
        }

        @Override
        public boolean onTab(RichEditText richEditText, boolean z) {
            if (RichTextCell.this.delegate == null || RichTextCell.this.currentRow == null) {
                return false;
            }
            return RichTextCell.this.delegate.onIndent(RichTextCell.this.currentRow, z);
        }

        @Override
        public void onRequestWindowFocusable(RichEditText richEditText, boolean z) {
            if (RichTextCell.this.delegate != null) {
                RichTextCell.this.delegate.onRequestWindowFocusable(richEditText, z);
            }
        }

        @Override
        public void onSelectionChanged(final RichEditText richEditText, final int i, final int i2) {
            final TextSelectionHelper.ArticleTextSelectionHelper selectionHelper;
            if (RichTextCell.this.hijackingSelection || i == i2 || RichTextCell.this.delegate == null || (selectionHelper = RichTextCell.this.delegate.getSelectionHelper()) == null) {
                return;
            }
            if (selectionHelper.isInSelectionMode() && selectionHelper.getSelectedCell() == RichTextCell.this) {
                return;
            }
            RichTextCell.this.post(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onSelectionChanged$1(richEditText, i2, selectionHelper, i);
                }
            });
        }

        public void lambda$onSelectionChanged$1(RichEditText richEditText, int i, TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper, int i2) {
            if (richEditText.length() < i || richEditText.getSelectionStart() == richEditText.getSelectionEnd() || !articleTextSelectionHelper.selectRangeOf(RichTextCell.this, i2, i)) {
                return;
            }
            RichTextCell.this.hijackingSelection = true;
            richEditText.setSelection(i);
            RichTextCell.this.hijackingSelection = false;
        }
    }

    public void lambda$new$0(View view, boolean z) {
        this.editText.setHint(getHint());
    }

    public void bind(BlockRow blockRow, Delegate delegate, boolean z) {
        this.currentRow = blockRow;
        this.delegate = delegate;
        this.forceHint = z;
        applyStyle(blockRow.block);
        applyListDecoration(blockRow.level, blockRow.num);
        String plainText = readPlainText(blockRow.block);
        if (String.valueOf(this.editText.getText()).equals(plainText)) {
            return;
        }
        this.editText.setTextSilently(plainText);
    }

    public BlockRow getRow() {
        return this.currentRow;
    }

    public RichEditText getEditText() {
        return this.editText;
    }

    public void requestEditFocus() {
        this.editText.requestEditFocus();
    }

    public void setLocked(boolean z) {
        this.editText.setLocked(z);
    }

    @Override
    public void fillTextLayoutBlocks(ArrayList arrayList) {
        final Layout layout = this.editText.getLayout();
        if (layout == null) {
            return;
        }
        final int left = this.row.getLeft() + this.editText.getLeft() + this.editText.getPaddingLeft();
        final int top = this.row.getTop() + this.editText.getTop() + this.editText.getPaddingTop();
        arrayList.add(new TextSelectionHelper.TextLayoutBlock() {
            @Override
            public CharSequence getPrefix() {
                return TextSelectionHelper.TextLayoutBlock.CC.$default$getPrefix(this);
            }

            @Override
            public int getRow() {
                return 0;
            }

            @Override
            public Layout getLayout() {
                return layout;
            }

            @Override
            public int getX() {
                return left;
            }

            @Override
            public int getY() {
                return top;
            }
        });
    }

    @Override
    public void updateColors() {
        this.editText.applyColors();
        this.bullet.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
    }

    private void applyListDecoration(int i, int i2) {
        String str;
        if (i <= 0) {
            this.indentSpacer.setVisibility(8);
            this.bullet.setVisibility(8);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.indentSpacer.getLayoutParams();
        layoutParams.width = (i - 1) * AndroidUtilities.dp(24.0f);
        this.indentSpacer.setLayoutParams(layoutParams);
        this.indentSpacer.setVisibility(i > 1 ? 0 : 8);
        this.bullet.setVisibility(0);
        TextView textView = this.bullet;
        if (i2 == 0) {
            str = "•";
        } else {
            str = i2 + ".";
        }
        textView.setText(str);
    }

    private String getHint() {
        BlockRow blockRow = this.currentRow;
        if (blockRow == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = blockRow.block;
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return "Heading 1";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return "Heading 2";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return "Heading 3";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return "Heading 4";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return "Heading 5";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return "Heading 6";
        }
        if (!this.forceHint) {
            if (this.editText.isFocused() && !this.currentRow.isInList()) {
                return "Type something…";
            }
            return null;
        }
        return "Type something…";
    }

    private void applyStyle(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            this.editText.setTextSize(1, 24.0f);
            this.editText.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            this.editText.setTextSize(1, 22.0f);
            this.editText.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        } else if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            this.editText.setTextSize(1, 20.0f);
            this.editText.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        } else if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            this.editText.setTextSize(1, 18.0f);
            this.editText.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        } else if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            this.editText.setTextSize(1, 16.0f);
            this.editText.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        } else if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            this.editText.setTextSize(1, 14.0f);
            this.editText.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        } else {
            this.editText.setTextSize(1, 16.0f);
            this.editText.setTypeface(null);
        }
        this.editText.setHint(getHint());
    }

    static class Transform {
        final TL_iv.PageBlock block;
        final int level;
        final int num;

        Transform(TL_iv.PageBlock pageBlock, int i, int i2) {
            this.block = pageBlock;
            this.level = i;
            this.num = i2;
        }
    }

    public static Transform matchMarkdownTrigger(String str, BlockRow blockRow) {
        int length;
        char cCharAt;
        char cCharAt2;
        char cCharAt3;
        if (blockRow != null && (blockRow.block instanceof TL_iv.pageBlockParagraph) && str != null && (length = str.length()) >= 2) {
            int i = length - 1;
            if (str.charAt(i) == ' ') {
                if (str.charAt(0) == '#') {
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        if (str.charAt(i3) != '#') {
                            return null;
                        }
                        i2++;
                    }
                    if (i2 < 1 || i2 > 6) {
                        return null;
                    }
                    return new Transform(newHeading(i2), blockRow.level, blockRow.num);
                }
                if (blockRow.level == 0 && length == 2 && ((cCharAt3 = str.charAt(0)) == '-' || cCharAt3 == '*' || cCharAt3 == '+')) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    applyTextToBlock(pageblockparagraph, "");
                    return new Transform(pageblockparagraph, 1, 0);
                }
                if (blockRow.level == 0 && length == 3 && Character.isDigit(str.charAt(0)) && ((cCharAt2 = str.charAt(1)) == '.' || cCharAt2 == ')')) {
                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                    applyTextToBlock(pageblockparagraph2, "");
                    return new Transform(pageblockparagraph2, 1, 1);
                }
                if (blockRow.level == 0 && length == 4 && (((cCharAt = str.charAt(0)) == '-' || cCharAt == '*' || cCharAt == '_') && str.charAt(1) == cCharAt && str.charAt(2) == cCharAt)) {
                    return new Transform(new TL_iv.pageBlockDivider(), 0, 0);
                }
            }
        }
        return null;
    }

    public static org.telegram.ui.iv.RichTextCell.Transform matchEnterTrigger(java.lang.String r7, org.telegram.ui.iv.BlockRow r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iv.RichTextCell.matchEnterTrigger(java.lang.String, org.telegram.ui.iv.BlockRow):org.telegram.ui.iv.RichTextCell$Transform");
    }

    private static TL_iv.pageBlockTable newEmptyTable(int i, int i2) {
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.bordered = true;
        pageblocktable.striped = false;
        pageblocktable.title = new TL_iv.textEmpty();
        pageblocktable.rows = new ArrayList<>();
        for (int i3 = 0; i3 < i; i3++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            for (int i4 = 0; i4 < i2; i4++) {
                pagetablerow.cells.add(TableModel.newEmptyCell());
            }
            pageblocktable.rows.add(pagetablerow);
        }
        return pageblocktable;
    }

    private static TL_iv.PageBlock newHeading(int i) {
        switch (i) {
            case 1:
                return new TL_iv.pageBlockHeading1();
            case 2:
                return new TL_iv.pageBlockHeading2();
            case 3:
                return new TL_iv.pageBlockHeading3();
            case 4:
                return new TL_iv.pageBlockHeading4();
            case 5:
                return new TL_iv.pageBlockHeading5();
            case 6:
                return new TL_iv.pageBlockHeading6();
            default:
                return null;
        }
    }

    static String readPlainText(TL_iv.PageBlock pageBlock) {
        TL_iv.RichText richTextExtractRichText = extractRichText(pageBlock);
        if (richTextExtractRichText instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richTextExtractRichText).text;
        }
        return "";
    }

    static void applyTextToBlock(TL_iv.PageBlock pageBlock, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            ((TL_iv.pageBlockParagraph) pageBlock).text = textplain;
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            ((TL_iv.pageBlockHeading1) pageBlock).text = textplain;
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            ((TL_iv.pageBlockHeading2) pageBlock).text = textplain;
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            ((TL_iv.pageBlockHeading3) pageBlock).text = textplain;
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            ((TL_iv.pageBlockHeading4) pageBlock).text = textplain;
        } else if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            ((TL_iv.pageBlockHeading5) pageBlock).text = textplain;
        } else if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            ((TL_iv.pageBlockHeading6) pageBlock).text = textplain;
        }
    }

    private static TL_iv.RichText extractRichText(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            return ((TL_iv.pageBlockParagraph) pageBlock).text;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return ((TL_iv.pageBlockHeading1) pageBlock).text;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return ((TL_iv.pageBlockHeading2) pageBlock).text;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return ((TL_iv.pageBlockHeading3) pageBlock).text;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return ((TL_iv.pageBlockHeading4) pageBlock).text;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return ((TL_iv.pageBlockHeading5) pageBlock).text;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return ((TL_iv.pageBlockHeading6) pageBlock).text;
        }
        return null;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        Delegate delegate = this.delegate;
        TextSelectionHelper.ArticleTextSelectionHelper selectionHelper = delegate != null ? delegate.getSelectionHelper() : null;
        if (selectionHelper != null && this.editText.getLayout() != null) {
            canvas.save();
            canvas.translate(this.row.getLeft() + this.editText.getLeft() + this.editText.getPaddingLeft(), this.row.getTop() + this.editText.getTop() + this.editText.getPaddingTop());
            selectionHelper.draw(canvas, this, 0);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
    }

    public static final class Factory extends UItem.UItemFactory {
        @Override
        public boolean isClickable() {
            return false;
        }

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public RichTextCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new RichTextCell(context, resourcesProvider);
        }

        @Override
        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            ((RichTextCell) view).bind((BlockRow) uItem.object, (Delegate) uItem.object2, uItem.red);
        }

        public static UItem of(BlockRow blockRow, Delegate delegate, boolean z) {
            UItem uItemOfFactory = UItem.ofFactory(Factory.class);
            uItemOfFactory.object = blockRow;
            uItemOfFactory.object2 = delegate;
            uItemOfFactory.red = z;
            return uItemOfFactory;
        }
    }
}
