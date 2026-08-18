package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.FloatingToolbar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.QuoteCollapseButton;
import org.telegram.ui.Components.QuoteSpan;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ReplyMessageLine;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;

public class RichTextCell extends FrameLayout implements Theme.Colorable, TextSelectionHelper.ArticleSelectableView {
    private boolean applyingCollapsedDecoration;
    private final RichEditText authorEditText;
    private final Paint bgPaint;
    private final TextView bullet;
    private final CheckBoxView checkBoxView;
    private QuoteCollapseButton collapseButton;
    private final RectF collapseButtonBounds;
    private boolean collapseButtonPressed;
    private int collapseExtraHeight;
    private CharacterStyle collapsedPart;
    private int collapsedPartEnd;
    private int collapsedPartStart;
    private BlockRow currentRow;
    private Delegate delegate;
    private final RichEditText editText;
    private boolean forceHint;
    private int highlightGeneration;
    private Runnable highlightScheduled;
    private String highlightedSnapshot;
    private boolean hijackingAuthorSelection;
    private boolean hijackingSelection;
    private final View indentSpacer;
    private LinearLayout languageButton;
    private ImageView languageButtonIcon;
    private TextView languageButtonText;
    private Drawable quoteIcon;
    private ReplyMessageLine quoteLine;
    private final Theme.ResourcesProvider resourcesProvider;
    private final LinearLayout row;
    private boolean showCommandBackground;
    private final ArrayList tmpBlocks;

    public static boolean lambda$updateLanguageButton$5(View view) {
        return true;
    }

    public int[] getColorKeys() {
        return Theme.Colorable.CC.$default$getColorKeys(this);
    }

    public interface Delegate {
        int getListPaddingBottom(BlockRow blockRow);

        int getListPaddingTop(BlockRow blockRow);

        int getOrderedListMarkerWidth(BlockRow blockRow, Paint paint);

        TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper();

        void onBackspace(BlockRow blockRow);

        boolean onBackspaceAtStart(BlockRow blockRow);

        void onCheckboxToggle(BlockRow blockRow, boolean z);

        void onCommand(BlockRow blockRow, int i);

        void onEnter(BlockRow blockRow);

        boolean onIndent(BlockRow blockRow, boolean z);

        void onLanguageClick(BlockRow blockRow, View view);

        void onLockedInsert(CharSequence charSequence);

        boolean onPaste(BlockRow blockRow, RichEditText richEditText);

        void onQuoteAuthorEnter(BlockRow blockRow);

        void onRequestWindowFocusable(RichEditText richEditText, boolean z);

        boolean onSelectAll(BlockRow blockRow);

        void onSlashSuggest(RichTextCell richTextCell, String str);

        void onSpansChanged(BlockRow blockRow);

        void onTextChanged(BlockRow blockRow);

        void onTextWillChange(BlockRow blockRow, int i, int i2);

        void onTransform(BlockRow blockRow, TL_iv.PageBlock pageBlock, int i, int i2, boolean z, boolean z2);

        public abstract class CC {
            public static int $default$getOrderedListMarkerWidth(Delegate delegate, BlockRow blockRow, Paint paint) {
                StringBuilder sb = new StringBuilder();
                sb.append(blockRow != null ? blockRow.num : 1);
                sb.append(".");
                return Math.max(AndroidUtilities.dp(28.0f), ((int) Math.ceil(paint.measureText(sb.toString()))) + AndroidUtilities.dp(10.0f));
            }
        }
    }

    public RichTextCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.tmpBlocks = new ArrayList();
        this.collapseButtonBounds = new RectF();
        this.collapsedPartStart = -1;
        this.collapsedPartEnd = -1;
        this.bgPaint = new Paint(1);
        this.resourcesProvider = resourcesProvider;
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.66f));
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.row = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.indentSpacer = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        TextView textView = new TextView(context) {
            private final Paint markerPaint = new Paint(1);

            @Override
            protected void onDraw(Canvas canvas) {
                if (RichTextCell.this.currentRow != null && RichTextCell.this.currentRow.level > 0 && RichTextCell.this.currentRow.num == 0 && !RichTextCell.this.currentRow.checkbox) {
                    this.markerPaint.setColor(getCurrentTextColor());
                    canvas.drawCircle(getWidth() / 2.0f, getBaseline() - (getTextSize() * 0.35f), AndroidUtilities.dpf2(4.3f) / 2.0f, this.markerPaint);
                    return;
                }
                super.onDraw(canvas);
            }
        };
        this.bullet = textView;
        textView.setGravity(8388627);
        textView.setPaddingRelative(AndroidUtilities.dp(6.0f), 0, 0, 0);
        textView.setSingleLine(true);
        textView.setIncludeFontPadding(false);
        textView.setTextSize(1, 16.0f);
        linearLayout.addView(textView, LayoutHelper.createLinear(18, -2));
        CheckBoxView checkBoxView = new CheckBoxView(context, resourcesProvider);
        this.checkBoxView = checkBoxView;
        checkBoxView.setVisibility(8);
        checkBoxView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$new$0(view2);
            }
        });
        linearLayout.addView(checkBoxView, LayoutHelper.createLinear(18, -2));
        RichEditText richEditText = new RichEditText(context, resourcesProvider);
        this.editText = richEditText;
        richEditText.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        richEditText.setListener(new AnonymousClass2());
        richEditText.setDelegate(new EditTextCaption.EditTextCaptionDelegate() {
            @Override
            public final void onSpansChanged() {
                this.f$0.lambda$new$1();
            }
        });
        richEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public final void onFocusChange(View view2, boolean z) {
                this.f$0.lambda$new$2(view2, z);
            }
        });
        linearLayout.addView(richEditText, LayoutHelper.createLinear(0, -2, 1.0f));
        addView(linearLayout, LayoutHelper.createFrame(-1, -2, 51));
        RichEditText richEditText2 = new RichEditText(context, resourcesProvider);
        this.authorEditText = richEditText2;
        richEditText2.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        richEditText2.setAllowNewlines(false);
        richEditText2.setInputType(147457);
        richEditText2.setListener(new AnonymousClass3());
        richEditText2.setDelegate(new EditTextCaption.EditTextCaptionDelegate() {
            @Override
            public final void onSpansChanged() {
                this.f$0.lambda$new$3();
            }
        });
        richEditText2.setVisibility(8);
        addView(richEditText2, LayoutHelper.createFrame(-1, -2, 51));
        updateColors();
    }

    public void lambda$new$0(View view) {
        BlockRow blockRow = this.currentRow;
        if (blockRow == null || !blockRow.checkbox) {
            return;
        }
        boolean z = !blockRow.checked;
        blockRow.checked = z;
        this.checkBoxView.setChecked(z, true);
        Delegate delegate = this.delegate;
        if (delegate != null) {
            BlockRow blockRow2 = this.currentRow;
            delegate.onCheckboxToggle(blockRow2, blockRow2.checked);
        }
    }

    class AnonymousClass2 implements RichEditText.Listener {
        AnonymousClass2() {
        }

        @Override
        public void onEnterPressed(RichEditText richEditText) {
            if (RichTextCell.this.delegate == null || RichTextCell.this.currentRow == null) {
                return;
            }
            String string = richEditText.getText().toString();
            RichTextCell.this.delegate.onSlashSuggest(RichTextCell.this, null);
            String strSlashQuery = RichTextCell.slashQuery(string);
            if (strSlashQuery != null) {
                ArrayList arrayListMatch = RichCommand.match(strSlashQuery);
                if (!arrayListMatch.isEmpty()) {
                    RichTextCell.this.selectCommand((RichCommand) arrayListMatch.get(0));
                    return;
                }
            }
            int iMatchCommand = RichTextCell.matchCommand(richEditText.getText().toString());
            if (iMatchCommand != 0) {
                RichTextCell.this.delegate.onCommand(RichTextCell.this.currentRow, iMatchCommand);
                return;
            }
            Transform transformMatchEnterTrigger = RichTextCell.matchEnterTrigger(richEditText.getText().toString(), RichTextCell.this.currentRow);
            if (transformMatchEnterTrigger != null) {
                RichTextCell.this.delegate.onTransform(RichTextCell.this.currentRow, transformMatchEnterTrigger.block, transformMatchEnterTrigger.level, transformMatchEnterTrigger.num, transformMatchEnterTrigger.checkbox, transformMatchEnterTrigger.checked);
            } else if (!(RichTextCell.this.currentRow.block instanceof TL_iv.pageBlockPullquote) || RichTextCell.this.editText.length() <= 0) {
                RichTextCell.this.delegate.onEnter(RichTextCell.this.currentRow);
            } else {
                RichTextCell.this.ensureAuthorVisibleAndFocus();
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
        public void onTextWillChange(RichEditText richEditText, int i, int i2) {
            if (RichTextCell.this.delegate == null || RichTextCell.this.currentRow == null) {
                return;
            }
            RichTextCell.this.delegate.onTextWillChange(RichTextCell.this.currentRow, i, i2);
        }

        @Override
        public void onTextChanged(RichEditText richEditText, Editable editable) {
            if (RichTextCell.this.currentRow == null) {
                return;
            }
            RichTextCell.this.sizeHeaderEmojiToText(editable);
            RichTextCell.this.updateListNumberStyle();
            RichTextCell.applyStyledTextToBlock(RichTextCell.this.currentRow.block, editable);
            RichTextCell.this.scheduleHighlight();
            RichTextCell.this.updateAuthorVisibility();
            RichTextCell.this.resetCollapsedIfTooShort();
            RichTextCell.this.updateCollapsedDecoration();
            if (RichTextCell.this.delegate != null) {
                RichTextCell.this.delegate.onTextChanged(RichTextCell.this.currentRow);
            }
            if (RichTextCell.this.delegate != null) {
                RichTextCell.this.delegate.onSlashSuggest(RichTextCell.this, RichTextCell.slashQuery(editable.toString()));
            }
            final int iMatchMarkdownCommand = RichTextCell.matchMarkdownCommand(editable.toString(), RichTextCell.this.currentRow);
            if (iMatchMarkdownCommand == 0 || RichTextCell.this.delegate == null) {
                final Transform transformMatchMarkdownTrigger = RichTextCell.matchMarkdownTrigger(editable.toString(), RichTextCell.this.currentRow);
                if (transformMatchMarkdownTrigger != null && RichTextCell.this.delegate != null) {
                    final BlockRow blockRow = RichTextCell.this.currentRow;
                    RichTextCell.this.post(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$onTextChanged$1(blockRow, transformMatchMarkdownTrigger);
                        }
                    });
                }
            } else {
                final BlockRow blockRow2 = RichTextCell.this.currentRow;
                RichTextCell.this.post(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onTextChanged$0(blockRow2, iMatchMarkdownCommand);
                    }
                });
            }
            if (RichTextCell.this.showCommandBackground || (RichTextCell.this.currentRow != null && (RichTextCell.this.currentRow.block instanceof TL_iv.pageBlockPullquote))) {
                RichTextCell.this.invalidate();
            }
        }

        public void lambda$onTextChanged$0(BlockRow blockRow, int i) {
            if (RichTextCell.this.delegate == null) {
                return;
            }
            RichTextCell.applyTextToBlock(blockRow.block, "");
            RichTextCell.this.delegate.onCommand(blockRow, i);
        }

        public void lambda$onTextChanged$1(BlockRow blockRow, Transform transform) {
            if (RichTextCell.this.delegate != null) {
                RichTextCell.this.delegate.onTransform(blockRow, transform.block, transform.level, transform.num, transform.checkbox, transform.checked);
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
        public void onLockedInsert(RichEditText richEditText, CharSequence charSequence) {
            if (RichTextCell.this.delegate != null) {
                RichTextCell.this.delegate.onLockedInsert(charSequence);
            }
        }

        @Override
        public boolean onSelectAll(RichEditText richEditText) {
            if (RichTextCell.this.delegate == null || RichTextCell.this.currentRow == null) {
                return false;
            }
            return RichTextCell.this.delegate.onSelectAll(RichTextCell.this.currentRow);
        }

        @Override
        public boolean onPaste(RichEditText richEditText) {
            if (RichTextCell.this.delegate == null || RichTextCell.this.currentRow == null) {
                return false;
            }
            return RichTextCell.this.delegate.onPaste(RichTextCell.this.currentRow, richEditText);
        }

        @Override
        public void onSelectionChanged(final RichEditText richEditText, final int i, final int i2) {
            final TextSelectionHelper.ArticleTextSelectionHelper selectionHelper;
            if (RichTextCell.this.hijackingSelection || i == i2 || RichTextCell.this.delegate == null || (selectionHelper = RichTextCell.this.delegate.getSelectionHelper()) == null) {
                return;
            }
            RichTextCell.this.post(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onSelectionChanged$2(richEditText, i2, selectionHelper, i);
                }
            });
        }

        public void lambda$onSelectionChanged$2(RichEditText richEditText, int i, TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper, int i2) {
            if (richEditText.length() < i || richEditText.getSelectionStart() == richEditText.getSelectionEnd()) {
                return;
            }
            if (articleTextSelectionHelper.isInSelectionMode()) {
                RichTextCell.this.hijackingSelection = true;
                richEditText.setSelection(i);
                RichTextCell.this.hijackingSelection = false;
            } else if (articleTextSelectionHelper.selectRangeOf(RichTextCell.this, i2, i)) {
                RichTextCell.this.hijackingSelection = true;
                richEditText.setSelection(i);
                RichTextCell.this.hijackingSelection = false;
            }
        }
    }

    public void lambda$new$1() {
        if (this.applyingCollapsedDecoration || this.currentRow == null) {
            return;
        }
        updateListNumberStyle();
        applyStyledTextToBlock(this.currentRow.block, this.editText.getText());
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onSpansChanged(this.currentRow);
        }
    }

    public void lambda$new$2(View view, boolean z) {
        Delegate delegate;
        this.editText.setHint(getHint());
        if (z || (delegate = this.delegate) == null) {
            return;
        }
        delegate.onSlashSuggest(this, null);
    }

    class AnonymousClass3 implements RichEditText.Listener {
        @Override
        public void onBackspaceOnEmpty(RichEditText richEditText) {
        }

        @Override
        public boolean onPaste(RichEditText richEditText) {
            return RichEditText.Listener.CC.$default$onPaste(this, richEditText);
        }

        @Override
        public boolean onTab(RichEditText richEditText, boolean z) {
            return RichEditText.Listener.CC.$default$onTab(this, richEditText, z);
        }

        AnonymousClass3() {
        }

        @Override
        public void onEnterPressed(RichEditText richEditText) {
            if (RichTextCell.this.delegate == null || RichTextCell.this.currentRow == null) {
                return;
            }
            RichTextCell.this.delegate.onQuoteAuthorEnter(RichTextCell.this.currentRow);
        }

        @Override
        public boolean onBackspaceAtStart(RichEditText richEditText) {
            RichTextCell.this.editText.requestEditFocus();
            RichTextCell.this.editText.setSelection(RichTextCell.this.editText.length());
            return true;
        }

        @Override
        public void onTextWillChange(RichEditText richEditText, int i, int i2) {
            if (RichTextCell.this.delegate == null || RichTextCell.this.currentRow == null) {
                return;
            }
            RichTextCell.this.delegate.onTextWillChange(RichTextCell.this.currentRow, i, i2);
        }

        @Override
        public void onTextChanged(RichEditText richEditText, Editable editable) {
            if (RichTextCell.this.currentRow == null) {
                return;
            }
            RichTextCell.this.persistAuthor();
            if (RichTextCell.this.delegate != null) {
                RichTextCell.this.delegate.onTextChanged(RichTextCell.this.currentRow);
            }
            if (!(RichTextCell.this.currentRow.block instanceof TL_iv.pageBlockPullquote)) {
                if (RichTextCell.this.currentRow.block instanceof TL_iv.pageBlockBlockquote) {
                    RichTextCell.this.invalidate();
                    if (RichTextCell.this.collapseButtonExtraHeightChanged()) {
                        RichTextCell.this.requestLayout();
                        return;
                    }
                    return;
                }
                return;
            }
            RichTextCell.this.invalidate();
        }

        @Override
        public void onRequestWindowFocusable(RichEditText richEditText, boolean z) {
            if (RichTextCell.this.delegate != null) {
                RichTextCell.this.delegate.onRequestWindowFocusable(richEditText, z);
            }
        }

        @Override
        public void onLockedInsert(RichEditText richEditText, CharSequence charSequence) {
            if (RichTextCell.this.delegate != null) {
                RichTextCell.this.delegate.onLockedInsert(charSequence);
            }
        }

        @Override
        public boolean onSelectAll(RichEditText richEditText) {
            if (RichTextCell.this.delegate == null || RichTextCell.this.currentRow == null) {
                return false;
            }
            return RichTextCell.this.delegate.onSelectAll(RichTextCell.this.currentRow);
        }

        @Override
        public void onSelectionChanged(final RichEditText richEditText, final int i, final int i2) {
            final TextSelectionHelper.ArticleTextSelectionHelper selectionHelper;
            if (RichTextCell.this.hijackingAuthorSelection || i == i2 || RichTextCell.this.delegate == null || (selectionHelper = RichTextCell.this.delegate.getSelectionHelper()) == null) {
                return;
            }
            richEditText.post(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onSelectionChanged$0(richEditText, i2, selectionHelper, i);
                }
            });
        }

        public void lambda$onSelectionChanged$0(RichEditText richEditText, int i, TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper, int i2) {
            if (richEditText.length() < i || richEditText.getSelectionStart() == richEditText.getSelectionEnd()) {
                return;
            }
            if (articleTextSelectionHelper.isInSelectionMode()) {
                RichTextCell.this.hijackingAuthorSelection = true;
                richEditText.setSelection(i);
                RichTextCell.this.hijackingAuthorSelection = false;
            } else if (articleTextSelectionHelper.selectRangeOf(RichTextCell.this, 1, i2, i)) {
                RichTextCell.this.hijackingAuthorSelection = true;
                richEditText.setSelection(i);
                RichTextCell.this.hijackingAuthorSelection = false;
            }
        }
    }

    public void lambda$new$3() {
        if (this.currentRow == null) {
            return;
        }
        persistAuthor();
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onSpansChanged(this.currentRow);
        }
    }

    private void updateLanguageButton(TL_iv.PageBlock pageBlock, boolean z) {
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
            LinearLayout linearLayout = this.languageButton;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.languageButton;
        if (linearLayout2 != null && z) {
            AndroidUtilities.removeFromParent(linearLayout2);
            this.languageButton = null;
        }
        if (this.languageButton == null) {
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            this.languageButton = linearLayout3;
            linearLayout3.setOrientation(0);
            this.languageButton.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, this.resourcesProvider), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f)));
            this.languageButton.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            addView(this.languageButton, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, -15.0f, -5.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.languageButtonText = textView;
            textView.setTextSize(1, 12.0f);
            this.languageButtonText.setGravity(17);
            this.languageButton.addView(this.languageButtonText, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.languageButtonIcon = imageView;
            imageView.setImageResource(R.drawable.arrows_select);
            this.languageButton.addView(this.languageButtonIcon, LayoutHelper.createLinear(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            CodeHighlighting.prepare();
            this.languageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$updateLanguageButton$4(view);
                }
            });
            this.languageButton.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public final boolean onLongClick(View view) {
                    return RichTextCell.lambda$updateLanguageButton$5(view);
                }
            });
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int iMultAlpha = Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider), TextUtils.isEmpty(str) ? 0.5f : 0.75f);
        this.languageButtonIcon.setColorFilter(new PorterDuffColorFilter(iMultAlpha, PorterDuff.Mode.SRC_IN));
        this.languageButtonText.setTextColor(iMultAlpha);
        if (TextUtils.isEmpty(str)) {
            this.languageButtonText.setText(LocaleController.getString(R.string.ArticleHintLanguage));
        } else {
            this.languageButtonText.setText(MessageObject.TextLayoutBlock.capitalizeLanguage(str));
        }
        this.languageButton.setVisibility(0);
    }

    public void lambda$updateLanguageButton$4(View view) {
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onLanguageClick(this.currentRow, view);
        }
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        QuoteCollapseButton quoteCollapseButton;
        return super.verifyDrawable(drawable) || ((quoteCollapseButton = this.collapseButton) != null && quoteCollapseButton.verifyDrawable(drawable));
    }

    public void bind(BlockRow blockRow, Delegate delegate, boolean z) {
        this.currentRow = blockRow;
        this.delegate = delegate;
        this.forceHint = z;
        this.collapsedPartEnd = -1;
        this.collapsedPartStart = -1;
        this.editText.setBlock(blockRow.block);
        applyStyle(blockRow.block);
        applyQuoteInset(blockRow);
        applyListDecoration(blockRow);
        updateLanguageButton(blockRow.block, false);
        if (!String.valueOf(this.editText.getText()).equals(readPlainText(blockRow.block))) {
            CharSequence styledText = readStyledText(blockRow.block);
            if (RichEditorListView.isHeading(blockRow.block)) {
                SpannableString spannableString = new SpannableString(styledText);
                RichTextStyle.setStyle(spannableString, 0, spannableString.length(), 1, false);
                RichTextStyle.setStyle(spannableString, 0, spannableString.length(), 2, false);
                styledText = spannableString;
            }
            this.editText.setTextSilently(Emoji.replaceEmoji(styledText, this.editText.getPaint().getFontMetricsInt(), false, RichEditorListView.isHeading(blockRow.block) ? 0.85f : 1.0f));
            sizeHeaderEmojiToText(this.editText.getText());
            this.editText.invalidateEffects();
            this.highlightedSnapshot = null;
        }
        sizeHeaderEmojiToText(this.editText.getText());
        updateListNumberStyle();
        bindAuthor(blockRow.block);
        scheduleHighlight();
    }

    public void rebindInPlace() {
        Delegate delegate;
        BlockRow blockRow = this.currentRow;
        if (blockRow == null || (delegate = this.delegate) == null) {
            return;
        }
        bind(blockRow, delegate, this.forceHint);
    }

    void refreshListVerticalPadding() {
        syncLiveListVerticalPadding();
    }

    private void bindAuthor(TL_iv.PageBlock pageBlock) {
        if (!isQuoteBlock(pageBlock)) {
            this.authorEditText.setVisibility(8);
            return;
        }
        ensureCaption(pageBlock);
        applyAuthorStyle(pageBlock);
        if (!String.valueOf(this.authorEditText.getText()).equals(readAuthorPlain(pageBlock))) {
            this.authorEditText.setTextSilently(Emoji.replaceEmoji(readAuthorStyled(pageBlock), this.authorEditText.getPaint().getFontMetricsInt(), false));
            this.authorEditText.invalidateEffects();
        }
        updateAuthorVisibility();
    }

    private void applyAuthorStyle(TL_iv.PageBlock pageBlock) {
        this.authorEditText.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        this.authorEditText.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.authorEditText.setTextColorKey(Theme.key_featuredStickers_addButton);
        this.authorEditText.setAccentHint(true);
        this.authorEditText.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            this.authorEditText.setGravity(49);
        } else {
            this.authorEditText.setGravity(8388659);
        }
    }

    public void updateAuthorVisibility() {
        BlockRow blockRow = this.currentRow;
        if (blockRow != null && isQuoteBlock(blockRow.block) && (this.editText.length() > 0 || this.authorEditText.length() > 0)) {
            if (this.authorEditText.getVisibility() != 0) {
                this.authorEditText.setVisibility(0);
                requestLayout();
                return;
            }
            return;
        }
        if (this.authorEditText.getVisibility() != 8) {
            if (this.authorEditText.isFocused()) {
                this.editText.requestFocus();
            }
            this.authorEditText.setVisibility(8);
            requestLayout();
        }
    }

    public void ensureAuthorVisibleAndFocus() {
        BlockRow blockRow = this.currentRow;
        if (blockRow != null) {
            ensureCaption(blockRow.block);
        }
        if (this.authorEditText.getVisibility() != 0) {
            this.authorEditText.setVisibility(0);
            requestLayout();
        }
        this.authorEditText.requestEditFocus();
        RichEditText richEditText = this.authorEditText;
        richEditText.setSelection(richEditText.length());
    }

    public void updateLanguage() {
        BlockRow blockRow = this.currentRow;
        if (blockRow != null) {
            updateLanguageButton(blockRow.block, true);
            this.highlightedSnapshot = null;
            scheduleHighlight();
        }
    }

    public BlockRow getRow() {
        return this.currentRow;
    }

    public RichEditText getEditText() {
        return this.editText;
    }

    public FloatingToolbar.StyleDelegate getStyleDelegate() {
        return this.editText;
    }

    public void persistStyle() {
        BlockRow blockRow = this.currentRow;
        if (blockRow != null) {
            applyStyledTextToBlock(blockRow.block, this.editText.getText());
        }
    }

    private boolean isHighlightableCode() {
        BlockRow blockRow = this.currentRow;
        if (blockRow != null) {
            TL_iv.PageBlock pageBlock = blockRow.block;
            if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                return true;
            }
        }
        return false;
    }

    public void scheduleHighlight() {
        Runnable runnable = this.highlightScheduled;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.highlightScheduled = null;
        }
        if (!isHighlightableCode()) {
            this.highlightGeneration++;
            clearHighlight();
            this.highlightedSnapshot = null;
        } else {
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.runHighlight();
                }
            };
            this.highlightScheduled = runnable2;
            postDelayed(runnable2, 100L);
        }
    }

    public void runHighlight() {
        this.highlightScheduled = null;
        if (isHighlightableCode()) {
            final String string = this.editText.getText().toString();
            if (string.equals(this.highlightedSnapshot)) {
                return;
            }
            final BlockRow blockRow = this.currentRow;
            String str = ((TL_iv.pageBlockPreformatted) blockRow.block).language;
            final int i = this.highlightGeneration + 1;
            this.highlightGeneration = i;
            CodeHighlighting.highlightEditable(string, str, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$runHighlight$6(i, blockRow, string, (SpannableString) obj);
                }
            });
        }
    }

    public void lambda$runHighlight$6(int i, BlockRow blockRow, String str, SpannableString spannableString) {
        if (i == this.highlightGeneration && this.currentRow == blockRow) {
            Editable text = this.editText.getText();
            if (TextUtils.equals(str, text)) {
                applyColorSpans(text, spannableString);
                this.highlightedSnapshot = str;
            }
        }
    }

    private void applyColorSpans(Editable editable, SpannableString spannableString) {
        for (CodeHighlighting.ColorSpan colorSpan : (CodeHighlighting.ColorSpan[]) editable.getSpans(0, editable.length(), CodeHighlighting.ColorSpan.class)) {
            editable.removeSpan(colorSpan);
        }
        CodeHighlighting.ColorSpan[] colorSpanArr = (CodeHighlighting.ColorSpan[]) spannableString.getSpans(0, spannableString.length(), CodeHighlighting.ColorSpan.class);
        int length = editable.length();
        for (int i = 0; i < colorSpanArr.length; i++) {
            int spanStart = spannableString.getSpanStart(colorSpanArr[i]);
            int spanEnd = spannableString.getSpanEnd(colorSpanArr[i]);
            if (spanStart >= 0 && spanEnd <= length && spanStart < spanEnd) {
                editable.setSpan(colorSpanArr[i], spanStart, spanEnd, 33);
            }
        }
    }

    private void clearHighlight() {
        Editable text = this.editText.getText();
        if (text == null) {
            return;
        }
        for (CodeHighlighting.ColorSpan colorSpan : (CodeHighlighting.ColorSpan[]) text.getSpans(0, text.length(), CodeHighlighting.ColorSpan.class)) {
            text.removeSpan(colorSpan);
        }
    }

    public void requestEditFocus() {
        this.editText.requestEditFocus();
    }

    public void setLocked(boolean z) {
        this.editText.setLocked(z);
        this.authorEditText.setLocked(z);
    }

    public void hideActionModes() {
        this.editText.hideActionMode();
        this.authorEditText.hideActionMode();
    }

    public void finishActionModes() {
        this.editText.finishActionMode();
        this.authorEditText.finishActionMode();
    }

    public boolean isPressOnText(int i, int i2) {
        if (pressOnLayout(this.editText, this.row.getLeft() + this.editText.getLeft(), this.row.getTop() + this.editText.getTop(), i, i2)) {
            return true;
        }
        if (this.authorEditText.getVisibility() != 0) {
            return false;
        }
        RichEditText richEditText = this.authorEditText;
        return pressOnLayout(richEditText, richEditText.getLeft(), this.authorEditText.getTop(), i, i2);
    }

    private static boolean pressOnLayout(RichEditText richEditText, int i, int i2, int i3, int i4) {
        int lineForVertical;
        Layout layout = richEditText.getLayout();
        if (layout == null || richEditText.length() == 0) {
            return false;
        }
        int paddingLeft = i3 - (i + richEditText.getPaddingLeft());
        int paddingTop = i4 - (i2 + richEditText.getPaddingTop());
        if (paddingTop < 0 || paddingTop >= layout.getHeight() || (lineForVertical = layout.getLineForVertical(paddingTop)) < 0 || lineForVertical >= layout.getLineCount()) {
            return false;
        }
        int iDp = AndroidUtilities.dp(24.0f);
        int iMax = Math.max(0, (richEditText.getWidth() - richEditText.getPaddingLeft()) - richEditText.getPaddingRight());
        float f = iDp;
        float fMax = Math.max(0.0f, layout.getLineLeft(lineForVertical) - f);
        float fMin = Math.min(iMax, layout.getLineRight(lineForVertical) + f);
        float f2 = paddingLeft;
        return f2 >= fMax && f2 <= fMin;
    }

    public boolean isPressOnEmptyEditText(int i, int i2) {
        if (insideEmpty(this.editText, this.row.getLeft() + this.editText.getLeft(), this.row.getTop() + this.editText.getTop(), i, i2)) {
            return true;
        }
        if (this.authorEditText.getVisibility() != 0) {
            return false;
        }
        RichEditText richEditText = this.authorEditText;
        return insideEmpty(richEditText, richEditText.getLeft(), this.authorEditText.getTop(), i, i2);
    }

    private static boolean insideEmpty(RichEditText richEditText, int i, int i2, int i3, int i4) {
        return richEditText.length() == 0 && i3 >= i && i3 <= i + richEditText.getWidth() && i4 >= i2 && i4 <= i2 + richEditText.getHeight();
    }

    @Override
    public void fillTextLayoutBlocks(ArrayList arrayList) {
        final Layout layout;
        final Layout layout2 = this.editText.getLayout();
        if (layout2 != null) {
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
                public Rect getSelectionBounds() {
                    return TextSelectionHelper.TextLayoutBlock.CC.$default$getSelectionBounds(this);
                }

                @Override
                public Layout getLayout() {
                    return layout2;
                }

                @Override
                public int getX() {
                    return left;
                }

                @Override
                public int getY() {
                    return top;
                }

                @Override
                public CharSequence getText() {
                    return layout2.getText();
                }
            });
        }
        if (this.authorEditText.getVisibility() != 0 || (layout = this.authorEditText.getLayout()) == null) {
            return;
        }
        final int left2 = this.authorEditText.getLeft() + this.authorEditText.getPaddingLeft();
        final int top2 = this.authorEditText.getTop() + this.authorEditText.getPaddingTop();
        arrayList.add(new TextSelectionHelper.TextLayoutBlock() {
            @Override
            public CharSequence getPrefix() {
                return TextSelectionHelper.TextLayoutBlock.CC.$default$getPrefix(this);
            }

            @Override
            public int getRow() {
                return 1;
            }

            @Override
            public Rect getSelectionBounds() {
                return TextSelectionHelper.TextLayoutBlock.CC.$default$getSelectionBounds(this);
            }

            @Override
            public Layout getLayout() {
                return layout;
            }

            @Override
            public int getX() {
                return left2;
            }

            @Override
            public int getY() {
                return top2;
            }

            @Override
            public CharSequence getText() {
                return layout.getText();
            }
        });
    }

    @Override
    public void updateColors() {
        this.editText.updateColors();
        RichEditText richEditText = this.authorEditText;
        if (richEditText != null) {
            richEditText.updateColors();
        }
        this.bullet.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
        Drawable drawable = this.quoteIcon;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
        }
        ReplyMessageLine replyMessageLine = this.quoteLine;
        if (replyMessageLine != null) {
            RichBlockChrome.applyEditorQuoteColor(replyMessageLine, this.resourcesProvider);
        }
    }

    private void applyListDecoration(BlockRow blockRow) {
        int iMax;
        String str;
        int i = blockRow.level;
        if (i <= 0) {
            this.indentSpacer.setVisibility(8);
            this.bullet.setVisibility(8);
            this.checkBoxView.setVisibility(8);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.indentSpacer.getLayoutParams();
        layoutParams.width = (i - 1) * AndroidUtilities.dp(24.0f);
        this.indentSpacer.setLayoutParams(layoutParams);
        this.indentSpacer.setVisibility(i > 1 ? 0 : 8);
        if (blockRow.checkbox) {
            this.bullet.setVisibility(8);
            this.checkBoxView.setVisibility(0);
            this.checkBoxView.setChecked(blockRow.checked, false);
            return;
        }
        this.checkBoxView.setVisibility(8);
        this.bullet.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.bullet.getLayoutParams();
        if (blockRow.num == 0) {
            iMax = AndroidUtilities.dp(18.0f);
        } else {
            Delegate delegate = this.delegate;
            if (delegate != null) {
                iMax = delegate.getOrderedListMarkerWidth(blockRow, this.bullet.getPaint());
            } else {
                iMax = Math.max(AndroidUtilities.dp(28.0f), ((int) Math.ceil(this.bullet.getPaint().measureText(blockRow.num + "."))) + AndroidUtilities.dp(10.0f));
            }
        }
        if (layoutParams2.width != iMax) {
            layoutParams2.width = iMax;
            this.bullet.setLayoutParams(layoutParams2);
        }
        TextView textView = this.bullet;
        if (blockRow.num == 0) {
            str = "";
        } else {
            str = blockRow.num + ".";
        }
        textView.setText(str);
    }

    public void updateListNumberStyle() {
        BlockRow blockRow = this.currentRow;
        boolean z = false;
        if (blockRow != null && blockRow.num > 0 && this.editText.length() > 0 && (this.editText.getCurrentStyle(0, 1) & 1) != 0) {
            z = true;
        }
        this.bullet.setTypeface(z ? AndroidUtilities.bold() : null);
        BlockRow blockRow2 = this.currentRow;
        if (blockRow2 == null || blockRow2.num <= 0) {
            return;
        }
        applyListDecoration(blockRow2);
    }

    private String getHint() {
        BlockRow blockRow = this.currentRow;
        if (blockRow == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = blockRow.block;
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return LocaleController.getString(blockRow.firstBlock ? R.string.ArticleHintTitle : R.string.ArticleHeading1);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return LocaleController.getString(R.string.ArticleHeading2);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return LocaleController.getString(R.string.ArticleHeading3);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return LocaleController.getString(R.string.ArticleHeading4);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return LocaleController.getString(R.string.ArticleHeading5);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return LocaleController.getString(R.string.ArticleHeading6);
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            return LocaleController.getString(R.string.ArticleHintCode);
        }
        if (!(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
            if (blockRow.singleParagraph) {
                return LocaleController.getString(R.string.ArticleHintText);
            }
            return null;
        }
        return LocaleController.getString(R.string.ArticleHintQuote);
    }

    private void applyQuoteInset(BlockRow blockRow) {
        int iQuoteInset = RichBlockChrome.quoteInset(blockRow);
        int iQuoteInsetEnd = RichBlockChrome.quoteInsetEnd(blockRow);
        if (iQuoteInset > 0 || iQuoteInsetEnd > 0) {
            boolean z = blockRow.block instanceof TL_iv.pageBlockPreformatted;
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            if (blockRow.quoteFirst) {
                paddingTop = RichBlockChrome.quoteTopPad(blockRow) + (z ? AndroidUtilities.dp(24.0f) : 0);
            }
            if (blockRow.quoteLast) {
                paddingBottom = RichBlockChrome.quoteBottomPad(blockRow);
            }
            if (z) {
                iQuoteInset += AndroidUtilities.dp(8.0f);
                iQuoteInsetEnd += AndroidUtilities.dp(8.0f);
            }
            if (RichBlockChrome.rtl()) {
                setPadding(getPaddingLeft() + iQuoteInsetEnd, paddingTop, getPaddingRight() + iQuoteInset, paddingBottom);
            } else {
                setPadding(getPaddingLeft() + iQuoteInset, paddingTop, getPaddingRight() + iQuoteInsetEnd, paddingBottom);
            }
        }
    }

    private void applyStyle(TL_iv.PageBlock pageBlock) {
        BlockRow blockRow;
        int i = SharedConfig.fontSize;
        this.editText.setCenterEmptyHint(false);
        this.editText.setHint(getHint());
        this.editText.setTextColorKey(Theme.key_windowBackgroundWhiteBlackText);
        this.editText.setLineSpacing(0.0f, 1.0f);
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(19.0f));
            this.editText.setInputType(655505);
            this.editText.setAllowNewlines(true);
            this.editText.setSoftEnterNewline(false);
            this.editText.setGravity(8388659);
            this.editText.setTextSize(1, i - 1);
            this.editText.setTypeface(Typeface.MONOSPACE);
            RichEditText richEditText = this.editText;
            richEditText.setLineSpacing(richEditText.getPaint().getFontSpacing() * 0.3f, 1.0f);
            this.editText.setAccentHint(false);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            this.editText.setInputType(147457);
            this.editText.setAllowNewlines(false);
            this.editText.setSoftEnterNewline(false);
            this.editText.setGravity(8388659);
            setPadding(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(16.0f));
            this.editText.setTextSize(1, Math.max(8, i - 2));
            this.editText.setTypeface(null);
            this.editText.setAccentHint(true);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            this.editText.setInputType(147457);
            this.editText.setAllowNewlines(false);
            this.editText.setSoftEnterNewline(true);
            this.editText.setGravity(49);
            this.editText.setCenterEmptyHint(true);
            setPadding(AndroidUtilities.dp(40.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(16.0f));
            this.editText.setTextSize(1, Math.max(8, i - 2));
            this.editText.setTypeface(AndroidUtilities.getTypeface("fonts/ritalic.ttf"));
            this.editText.setAccentHint(true);
            return;
        }
        this.editText.setInputType(147457);
        this.editText.setAllowNewlines(false);
        this.editText.setSoftEnterNewline(false);
        this.editText.setGravity(8388659);
        boolean z = pageBlock instanceof TL_iv.pageBlockHeading1;
        boolean z2 = z || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(z2 ? 11.0f : 5.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(z2 ? 7.0f : 4.66f));
        BlockRow blockRow2 = this.currentRow;
        if (blockRow2 != null && blockRow2.level > 0) {
            int iDp = AndroidUtilities.dp(16.0f);
            Delegate delegate = this.delegate;
            int listPaddingTop = delegate != null ? delegate.getListPaddingTop(this.currentRow) : AndroidUtilities.dp(8.0f);
            int iDp2 = AndroidUtilities.dp(16.0f);
            Delegate delegate2 = this.delegate;
            setPadding(iDp, listPaddingTop, iDp2, delegate2 != null ? delegate2.getListPaddingBottom(this.currentRow) : AndroidUtilities.dp(11.0f));
        }
        if (z) {
            this.editText.setTextSize(1, i + 3);
            this.editText.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            this.editText.setTextSize(1, i + 2);
            this.editText.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        } else if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            this.editText.setTextSize(1, i + 1);
            this.editText.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        } else if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            this.editText.setTextSize(1, i);
            this.editText.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        } else if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            this.editText.setTextSize(1, i - 1);
            this.editText.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        } else if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            this.editText.setTextSize(1, i - 2);
            this.editText.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        } else if (pageBlock instanceof TL_iv.pageBlockFooter) {
            this.editText.setTextSize(1, i - 2);
            this.editText.setTypeface(null);
            this.editText.setTextColorKey(Theme.key_chat_inReplyMessageText);
        } else {
            this.editText.setTextSize(1, (pageBlock instanceof TL_iv.pageBlockParagraph) && (blockRow = this.currentRow) != null && !blockRow.quoteIds.isEmpty() ? Math.max(8, i - 2) : i);
            this.editText.setTypeface(null);
        }
        this.editText.setAccentHint(false);
    }

    public void sizeHeaderEmojiToText(CharSequence charSequence) {
        BlockRow blockRow = this.currentRow;
        if (blockRow != null && RichEditorListView.isHeading(blockRow.block) && (charSequence instanceof Spanned)) {
            Paint.FontMetricsInt fontMetricsInt = this.editText.getPaint().getFontMetricsInt();
            int iMax = Math.max(1, Math.round((this.editText.getTextSize() * 0.85f) / 1.2f));
            Spanned spanned = (Spanned) charSequence;
            for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) spanned.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)) {
                emojiSpan.scale = 0.85f;
            }
            for (AnimatedEmojiSpan animatedEmojiSpan : (AnimatedEmojiSpan[]) spanned.getSpans(0, charSequence.length(), AnimatedEmojiSpan.class)) {
                animatedEmojiSpan.replaceFontMetrics(fontMetricsInt);
                animatedEmojiSpan.setSize(iMax);
            }
        }
    }

    static class Transform {
        final TL_iv.PageBlock block;
        final boolean checkbox;
        final boolean checked;
        final int level;
        final int num;

        Transform(TL_iv.PageBlock pageBlock, int i, int i2) {
            this(pageBlock, i, i2, false, false);
        }

        Transform(TL_iv.PageBlock pageBlock, int i, int i2, boolean z, boolean z2) {
            this.block = pageBlock;
            this.level = i;
            this.num = i2;
            this.checkbox = z;
            this.checked = z2;
        }
    }

    private static Transform newChecklistItem(boolean z) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        applyTextToBlock(pageblockparagraph, "");
        return new Transform(pageblockparagraph, 1, 0, true, z);
    }

    public static int matchMarkdownCommand(String str, BlockRow blockRow) {
        return (blockRow != null && str != null && blockRow.level == 0 && (blockRow.block instanceof TL_iv.pageBlockParagraph) && str.equals("> ")) ? 6 : 0;
    }

    public static Transform matchMarkdownTrigger(String str, BlockRow blockRow) {
        int length;
        char cCharAt;
        if (blockRow != null && str != null && (length = str.length()) >= 2) {
            int i = length - 1;
            if (str.charAt(i) == ' ') {
                TL_iv.PageBlock pageBlock = blockRow.block;
                boolean z = pageBlock instanceof TL_iv.pageBlockParagraph;
                boolean z2 = (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
                if (str.charAt(0) == '#' && (z || z2)) {
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
                if (!z) {
                    return null;
                }
                if (blockRow.level == 0 && length == 2) {
                    char cCharAt2 = str.charAt(0);
                    if (cCharAt2 == '-' || cCharAt2 == '*' || cCharAt2 == '+') {
                        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                        applyTextToBlock(pageblockparagraph, "");
                        return new Transform(pageblockparagraph, 1, 0);
                    }
                    if (cCharAt2 == '|') {
                        return new Transform(newBlockquote(), 0, 0);
                    }
                }
                if (blockRow.level == 0 && length == 3 && str.charAt(0) == '[' && str.charAt(1) == ']') {
                    return newChecklistItem(false);
                }
                if (blockRow.level == 0 && length == 4 && str.charAt(0) == '[' && str.charAt(2) == ']') {
                    char cCharAt3 = str.charAt(1);
                    if (cCharAt3 == ' ') {
                        return newChecklistItem(false);
                    }
                    if (cCharAt3 == 'x' || cCharAt3 == 'X') {
                        return newChecklistItem(true);
                    }
                }
                if (blockRow.level == 0 && length == 3 && Character.isDigit(str.charAt(0)) && ((cCharAt = str.charAt(1)) == '.' || cCharAt == ')')) {
                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                    applyTextToBlock(pageblockparagraph2, "");
                    return new Transform(pageblockparagraph2, 1, 1);
                }
                if (blockRow.level == 0 && length == 4) {
                    char cCharAt4 = str.charAt(0);
                    if ((cCharAt4 == '-' || cCharAt4 == '*' || cCharAt4 == '_') && str.charAt(1) == cCharAt4 && str.charAt(2) == cCharAt4) {
                        return new Transform(new TL_iv.pageBlockDivider(), 0, 0);
                    }
                    if (cCharAt4 == '`' && str.charAt(1) == '`' && str.charAt(2) == '`') {
                        return new Transform(new TL_iv.pageBlockPreformatted(), 0, 0);
                    }
                }
            }
        }
        return null;
    }

    public static Transform matchEnterTrigger(String str, BlockRow blockRow) {
        int iMax;
        int iMax2;
        char cCharAt;
        char cCharAt2;
        if (str == null || blockRow == null) {
            return null;
        }
        String strTrim = str.trim();
        int i = 2;
        if (strTrim.length() == 3 && (((cCharAt2 = strTrim.charAt(0)) == '-' || cCharAt2 == '*' || cCharAt2 == '_') && strTrim.charAt(1) == cCharAt2 && strTrim.charAt(2) == cCharAt2)) {
            return new Transform(new TL_iv.pageBlockDivider(), 0, 0);
        }
        String lowerCase = strTrim.toLowerCase();
        if (lowerCase.length() == 3 && lowerCase.charAt(0) == '/' && lowerCase.charAt(1) == 'h' && (cCharAt = lowerCase.charAt(2)) >= '1' && cCharAt <= '6') {
            return new Transform(newHeading(cCharAt - '0'), blockRow.level, blockRow.num);
        }
        if (lowerCase.equals("/code") || lowerCase.equals("/pre") || lowerCase.equals("/preformatted")) {
            return new Transform(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        if (lowerCase.equals("/footer")) {
            return new Transform(new TL_iv.pageBlockFooter(), 0, 0);
        }
        if (lowerCase.equals("/quote") || lowerCase.equals("/blockquote")) {
            return new Transform(newBlockquote(), 0, 0);
        }
        if (lowerCase.equals("/pullquote")) {
            return new Transform(newPullquote(), 0, 0);
        }
        if (!lowerCase.equals("/table") && !lowerCase.startsWith("/table ")) {
            return null;
        }
        if (lowerCase.length() <= 7) {
            iMax = 2;
        } else {
            String strTrim2 = lowerCase.substring(7).trim();
            int iIndexOf = strTrim2.indexOf(120);
            if (iIndexOf < 0) {
                iIndexOf = strTrim2.indexOf(88);
            }
            if (iIndexOf > 0) {
                try {
                    iMax2 = Math.max(1, Math.min(20, Integer.parseInt(strTrim2.substring(0, iIndexOf).trim())));
                    try {
                        iMax = Math.max(1, Math.min(20, Integer.parseInt(strTrim2.substring(iIndexOf + 1).trim())));
                        i = iMax2;
                    } catch (NumberFormatException unused) {
                        i = iMax2;
                        iMax = 2;
                    }
                } catch (NumberFormatException unused2) {
                    iMax2 = 2;
                }
            } else {
                iMax = 2;
            }
        }
        return new Transform(newEmptyTable(i, iMax), 0, 0);
    }

    public static String slashQuery(String str) {
        if (str != null && !str.isEmpty()) {
            if (str.charAt(0) == '/') {
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\t') {
                        return null;
                    }
                }
                return str;
            }
        }
        return null;
    }

    public void selectCommand(RichCommand richCommand) {
        if (this.delegate == null || this.currentRow == null || richCommand == null || richCommand.commands.isEmpty()) {
            return;
        }
        for (String str : richCommand.commands) {
            int iMatchCommand = matchCommand(str);
            if (iMatchCommand != 0) {
                this.delegate.onCommand(this.currentRow, iMatchCommand);
                return;
            }
            Transform transformMatchEnterTrigger = matchEnterTrigger(str, this.currentRow);
            if (transformMatchEnterTrigger == null) {
                transformMatchEnterTrigger = matchMarkdownTrigger(str + " ", this.currentRow);
            }
            if (transformMatchEnterTrigger != null) {
                this.delegate.onTransform(this.currentRow, transformMatchEnterTrigger.block, transformMatchEnterTrigger.level, transformMatchEnterTrigger.num, transformMatchEnterTrigger.checkbox, transformMatchEnterTrigger.checked);
                return;
            }
        }
    }

    public static int matchCommand(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.trim().toLowerCase();
        if (lowerCase.equals("/img") || lowerCase.equals("/pic") || lowerCase.equals("/image") || lowerCase.equals("/picture") || lowerCase.equals("/photo")) {
            return 4;
        }
        if (lowerCase.equals("/vid") || lowerCase.equals("/video")) {
            return 5;
        }
        if (lowerCase.equals("/audio") || lowerCase.equals("/music")) {
            return 1;
        }
        if (lowerCase.equals("/map") || lowerCase.equals("/location") || lowerCase.equals("/loc")) {
            return 2;
        }
        if (lowerCase.equals("/latex") || lowerCase.equals("/equation") || lowerCase.equals("/math")) {
            return 3;
        }
        if (lowerCase.equals("/toggle") || lowerCase.equals("/details")) {
            return 6;
        }
        return lowerCase.equals("/button") ? 7 : 0;
    }

    public static TL_iv.pageBlockTable newEmptyTable(int i, int i2) {
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
        if (pageBlock == null) {
            return null;
        }
        return RichTextStyle.plainOf(pageBlock.text);
    }

    static CharSequence readStyledText(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return RichTextStyle.toSpannable(pageBlock.text, pageBlock);
    }

    static void applyStyledTextToBlock(TL_iv.PageBlock pageBlock, CharSequence charSequence) {
        setRichText(pageBlock, RichTextStyle.fromSpannable(charSequence));
    }

    static boolean isQuoteBlock(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote);
    }

    static TL_iv.pageBlockBlockquote newBlockquote() {
        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
        pageblockblockquote.caption = new TL_iv.textEmpty();
        return pageblockblockquote;
    }

    static TL_iv.pageBlockPullquote newPullquote() {
        TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
        pageblockpullquote.caption = new TL_iv.textEmpty();
        return pageblockpullquote;
    }

    static void ensureCaption(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.caption == null) {
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            if (pageblockpullquote.caption == null) {
                pageblockpullquote.caption = new TL_iv.textEmpty();
            }
        }
    }

    static TL_iv.RichText extractCaption(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return ((TL_iv.pageBlockBlockquote) pageBlock).caption;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return ((TL_iv.pageBlockPullquote) pageBlock).caption;
        }
        return null;
    }

    static void setCaption(TL_iv.PageBlock pageBlock, TL_iv.RichText richText) {
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            ((TL_iv.pageBlockBlockquote) pageBlock).caption = richText;
        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            ((TL_iv.pageBlockPullquote) pageBlock).caption = richText;
        }
    }

    static String readAuthorPlain(TL_iv.PageBlock pageBlock) {
        return RichTextStyle.plainOf(extractCaption(pageBlock));
    }

    static CharSequence readAuthorStyled(TL_iv.PageBlock pageBlock) {
        return RichTextStyle.toSpannable(extractCaption(pageBlock));
    }

    public void persistAuthor() {
        BlockRow blockRow = this.currentRow;
        if (blockRow == null || !isQuoteBlock(blockRow.block)) {
            return;
        }
        setCaption(this.currentRow.block, RichTextStyle.fromSpannable(this.authorEditText.getText()));
    }

    public RichEditText getAuthorEditText() {
        return this.authorEditText;
    }

    public boolean isAuthorVisible() {
        return this.authorEditText.getVisibility() == 0;
    }

    public boolean isAuthorFocused() {
        return this.authorEditText.isFocused();
    }

    public void focusAuthorEnd() {
        ensureAuthorVisibleAndFocus();
    }

    public void focusAuthorFromBody() {
        final float fCaretX = caretX(this.editText);
        if (this.authorEditText.getVisibility() != 0) {
            this.authorEditText.setVisibility(0);
            requestLayout();
        }
        this.authorEditText.requestEditFocus();
        this.authorEditText.post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$focusAuthorFromBody$7(fCaretX);
            }
        });
    }

    public void lambda$focusAuthorFromBody$7(float f) {
        Layout layout = this.authorEditText.getLayout();
        int length = this.authorEditText.length();
        if (layout != null) {
            length = layout.getOffsetForHorizontal(0, f);
        }
        RichEditText richEditText = this.authorEditText;
        richEditText.setSelection(Math.max(0, Math.min(length, richEditText.length())));
    }

    public void focusBodyFromAuthor() {
        final float fCaretX = caretX(this.authorEditText);
        this.editText.requestEditFocus();
        this.editText.post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$focusBodyFromAuthor$8(fCaretX);
            }
        });
    }

    public void lambda$focusBodyFromAuthor$8(float f) {
        Layout layout = this.editText.getLayout();
        int length = this.editText.length();
        if (layout != null) {
            length = layout.getOffsetForHorizontal(Math.max(0, layout.getLineCount() - 1), f);
        }
        RichEditText richEditText = this.editText;
        richEditText.setSelection(Math.max(0, Math.min(length, richEditText.length())));
    }

    private static float caretX(RichEditText richEditText) {
        Layout layout = richEditText.getLayout();
        if (layout == null) {
            return 0.0f;
        }
        return layout.getPrimaryHorizontal(Math.max(0, Math.min(richEditText.getSelectionEnd(), richEditText.length())));
    }

    private static void setRichText(TL_iv.PageBlock pageBlock, TL_iv.RichText richText) {
        pageBlock.text = richText;
    }

    public static void applyTextToBlock(TL_iv.PageBlock pageBlock, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageBlock.text = textplain;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        syncLiveListVerticalPadding();
        int size = View.MeasureSpec.getSize(i);
        if (this.authorEditText.getVisibility() == 8) {
            this.collapseExtraHeight = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
            return;
        }
        int iMax = Math.max(0, (size - getPaddingLeft()) - getPaddingRight());
        this.row.measure(View.MeasureSpec.makeMeasureSpec(iMax, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.authorEditText.measure(View.MeasureSpec.makeMeasureSpec(iMax, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int paddingTop = getPaddingTop() + this.row.getMeasuredHeight() + this.authorEditText.getMeasuredHeight() + getPaddingBottom();
        int iCollapseButtonExtraHeight = collapseButtonExtraHeight(size, paddingTop);
        this.collapseExtraHeight = iCollapseButtonExtraHeight;
        setMeasuredDimension(size, paddingTop + iCollapseButtonExtraHeight);
    }

    private void syncLiveListVerticalPadding() {
        Delegate delegate;
        BlockRow blockRow = this.currentRow;
        if (blockRow == null || blockRow.level <= 0 || (delegate = this.delegate) == null) {
            return;
        }
        int listPaddingTop = delegate.getListPaddingTop(blockRow);
        int listPaddingBottom = this.delegate.getListPaddingBottom(this.currentRow);
        BlockRow blockRow2 = this.currentRow;
        if (blockRow2.quoteFirst) {
            listPaddingTop = RichBlockChrome.quoteTopPad(blockRow2);
        }
        BlockRow blockRow3 = this.currentRow;
        if (blockRow3.quoteLast) {
            listPaddingBottom = RichBlockChrome.quoteBottomPad(blockRow3);
        }
        if (listPaddingTop == getPaddingTop() && listPaddingBottom == getPaddingBottom()) {
            return;
        }
        setPadding(getPaddingLeft(), listPaddingTop, getPaddingRight(), listPaddingBottom);
    }

    private int collapseButtonExtraHeight(int i, int i2) {
        Layout layout;
        if (hasCollapseButton() && this.authorEditText.getVisibility() == 0 && (layout = this.authorEditText.getLayout()) != null && layout.getLineCount() > 0) {
            ensureCollapseButton();
            int lineCount = layout.getLineCount() - 1;
            int paddingTop = getPaddingTop() + this.row.getMeasuredHeight();
            float paddingLeft = getPaddingLeft() + this.authorEditText.getPaddingLeft() + layout.getLineRight(lineCount);
            float paddingTop2 = this.authorEditText.getPaddingTop() + paddingTop + layout.getLineTop(lineCount);
            float paddingTop3 = paddingTop + this.authorEditText.getPaddingTop() + layout.getLineBottom(lineCount);
            int iDp = AndroidUtilities.dp(3.333f);
            float fDp = ((i - AndroidUtilities.dp(16.0f)) - iDp) - this.collapseButton.width();
            int iHeight = this.collapseButton.height();
            int i3 = i2 - iDp;
            float f = i3 - iHeight;
            float f2 = i3;
            boolean z = paddingLeft > fDp;
            boolean z2 = paddingTop3 > f && paddingTop2 < f2;
            if (z && z2) {
                return (int) Math.ceil(Math.max(0.0f, (((paddingTop3 + AndroidUtilities.dp(4.0f)) + iHeight) + iDp) - i2));
            }
        }
        return 0;
    }

    public boolean collapseButtonExtraHeightChanged() {
        int measuredWidth = getMeasuredWidth();
        return measuredWidth <= 0 || collapseButtonExtraHeight(measuredWidth, ((getPaddingTop() + this.row.getMeasuredHeight()) + this.authorEditText.getMeasuredHeight()) + getPaddingBottom()) != this.collapseExtraHeight;
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        updateCollapsedDecoration();
        if (this.authorEditText.getVisibility() == 8) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        LinearLayout linearLayout = this.row;
        linearLayout.layout(paddingLeft, paddingTop, linearLayout.getMeasuredWidth() + paddingLeft, this.row.getMeasuredHeight() + paddingTop);
        int measuredHeight = paddingTop + this.row.getMeasuredHeight();
        RichEditText richEditText = this.authorEditText;
        richEditText.layout(paddingLeft, measuredHeight, richEditText.getMeasuredWidth() + paddingLeft, this.authorEditText.getMeasuredHeight() + measuredHeight);
    }

    public void setShowCommandBackground(boolean z) {
        if (this.showCommandBackground == z) {
            return;
        }
        this.showCommandBackground = z;
        invalidate();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        float fMax;
        float fMax2;
        float fMax3;
        int i;
        BlockRow blockRow = this.currentRow;
        if (blockRow != null && (blockRow.block instanceof TL_iv.pageBlockPreformatted)) {
            this.bgPaint.setColor(Theme.getColor(Theme.key_chat_inArticleCodeBackground, this.resourcesProvider));
            int iQuoteInset = RichBlockChrome.quoteInset(this.currentRow);
            int iQuoteInsetEnd = RichBlockChrome.quoteInsetEnd(this.currentRow);
            int width = getWidth();
            if (iQuoteInset > 0 || iQuoteInsetEnd > 0) {
                int iDp = AndroidUtilities.dp(16.0f) + iQuoteInset;
                int iDp2 = AndroidUtilities.dp(16.0f) + iQuoteInsetEnd;
                i = RichBlockChrome.rtl() ? iDp2 : iDp;
                int width2 = getWidth();
                if (!RichBlockChrome.rtl()) {
                    iDp = iDp2;
                }
                width = width2 - iDp;
            } else {
                i = 0;
            }
            float fDp = (i > 0 || width < getWidth()) ? AndroidUtilities.dp(8.0f) : 0;
            canvas.drawRoundRect(i, AndroidUtilities.dp(7.0f), width, getHeight() - AndroidUtilities.dp(7.0f), fDp, fDp, this.bgPaint);
        } else if (blockRow != null && (blockRow.block instanceof TL_iv.pageBlockBlockquote)) {
            if (this.quoteLine == null) {
                ReplyMessageLine replyMessageLine = new ReplyMessageLine(this);
                this.quoteLine = replyMessageLine;
                replyMessageLine.check(null, null, null, this.resourcesProvider, 1);
                RichBlockChrome.applyEditorQuoteColor(this.quoteLine, this.resourcesProvider);
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), getWidth() - AndroidUtilities.dp(16.0f), getHeight() - AndroidUtilities.dp(8.0f));
            float fFloor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
            this.quoteLine.drawBackground(canvas, rectF, fFloor, fFloor, fFloor, 1.0f);
            this.quoteLine.drawLine(canvas, rectF, 1.0f);
        } else if (blockRow != null && (blockRow.block instanceof TL_iv.pageBlockPullquote)) {
            if (this.quoteLine == null) {
                ReplyMessageLine replyMessageLine2 = new ReplyMessageLine(this);
                this.quoteLine = replyMessageLine2;
                replyMessageLine2.check(null, null, null, this.resourcesProvider, 1);
                RichBlockChrome.applyEditorQuoteColor(this.quoteLine, this.resourcesProvider);
            }
            if (this.quoteIcon == null) {
                Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.mini_quote).mutate();
                this.quoteIcon = drawableMutate;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            }
            Layout layout = this.editText.getLayout();
            float width3 = getWidth();
            if (layout != null && !TextUtils.isEmpty(layout.getText())) {
                fMax = 0.0f;
                for (int i2 = 0; i2 < layout.getLineCount(); i2++) {
                    width3 = Math.min(width3, this.row.getLeft() + this.editText.getLeft() + this.editText.getPaddingLeft() + layout.getLineLeft(i2));
                    fMax = Math.max(fMax, this.row.getLeft() + this.editText.getLeft() + this.editText.getPaddingLeft() + layout.getLineRight(i2));
                }
            } else if (this.editText.getHint() != null) {
                float fMeasureText = this.editText.getPaint().measureText(this.editText.getHint().toString());
                width3 = Math.min(width3, ((getWidth() - fMeasureText) / 2.0f) + AndroidUtilities.dp(2.0f));
                fMax = Math.max(0.0f, ((getWidth() + fMeasureText) / 2.0f) + AndroidUtilities.dp(2.0f));
            } else {
                fMax = 0.0f;
            }
            if (this.authorEditText.getVisibility() == 0) {
                Layout layout2 = this.authorEditText.getLayout();
                if (layout2 != null && !TextUtils.isEmpty(layout2.getText())) {
                    for (int i3 = 0; i3 < layout2.getLineCount(); i3++) {
                        width3 = Math.min(width3, this.authorEditText.getLeft() + this.authorEditText.getPaddingLeft() + layout2.getLineLeft(i3));
                        fMax = Math.max(fMax, this.authorEditText.getLeft() + this.authorEditText.getPaddingLeft() + layout2.getLineRight(i3));
                    }
                } else if (this.authorEditText.getHint() != null) {
                    float fMeasureText2 = this.authorEditText.getPaint().measureText(this.authorEditText.getHint().toString());
                    width3 = Math.min(width3, ((getWidth() - fMeasureText2) / 2.0f) + AndroidUtilities.dp(2.0f));
                    fMax = Math.max(fMax, ((getWidth() + fMeasureText2) / 2.0f) + AndroidUtilities.dp(2.0f));
                }
            }
            if (width3 < fMax) {
                float fDp2 = width3 - AndroidUtilities.dp(30.0f);
                float fDp3 = fMax + AndroidUtilities.dp(30.0f);
                float fFloor2 = (float) Math.floor(SharedConfig.bubbleRadius / 2.0f);
                int iDp3 = AndroidUtilities.dp(8.0f);
                int height = getHeight() - AndroidUtilities.dp(8.0f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(fDp2, iDp3, fDp3, height);
                this.quoteLine.drawBackground(canvas, rectF2, fFloor2, fFloor2, fFloor2, 1.0f);
                canvas.save();
                int i4 = (int) fDp2;
                this.quoteIcon.setBounds(AndroidUtilities.dp(8.0f) + i4, iDp3 + AndroidUtilities.dp(7.0f), i4 + AndroidUtilities.dp(8.0f) + this.quoteIcon.getIntrinsicWidth(), iDp3 + AndroidUtilities.dp(7.0f) + this.quoteIcon.getIntrinsicHeight());
                canvas.scale(-1.0f, -1.0f, this.quoteIcon.getBounds().centerX(), this.quoteIcon.getBounds().centerY());
                this.quoteIcon.draw(canvas);
                canvas.restore();
                canvas.save();
                int i5 = (int) fDp3;
                this.quoteIcon.setBounds((i5 - AndroidUtilities.dp(8.0f)) - this.quoteIcon.getIntrinsicWidth(), (height - AndroidUtilities.dp(7.0f)) - this.quoteIcon.getIntrinsicHeight(), i5 - AndroidUtilities.dp(8.0f), height - AndroidUtilities.dp(7.0f));
                canvas.scale(1.0f, -1.0f, this.quoteIcon.getBounds().centerX(), this.quoteIcon.getBounds().centerY());
                this.quoteIcon.draw(canvas);
                canvas.restore();
            }
        }
        if (this.showCommandBackground) {
            float width4 = getWidth();
            float height2 = getHeight();
            Layout layout3 = this.editText.getLayout();
            if (layout3 != null) {
                fMax2 = 0.0f;
                fMax3 = 0.0f;
                for (int i6 = 0; i6 < layout3.getLineCount(); i6++) {
                    height2 = Math.min(height2, getPaddingTop() + this.editText.getPaddingTop() + layout3.getLineTop(i6));
                    width4 = Math.min(width4, this.row.getLeft() + this.editText.getLeft() + this.editText.getPaddingLeft() + layout3.getLineLeft(i6));
                    fMax2 = Math.max(fMax2, this.row.getLeft() + this.editText.getLeft() + this.editText.getPaddingLeft() + layout3.getLineRight(i6));
                    fMax3 = Math.max(height2, getPaddingTop() + this.editText.getPaddingTop() + layout3.getLineBottom(i6));
                }
            } else {
                fMax2 = 0.0f;
                fMax3 = 0.0f;
            }
            if (width4 < fMax2 && height2 < fMax3) {
                float fDp4 = height2 - AndroidUtilities.dp(2.0f);
                float fDp5 = width4 - AndroidUtilities.dp(4.0f);
                float fDp6 = fMax2 + AndroidUtilities.dp(4.0f);
                float fDp7 = fMax3 + AndroidUtilities.dp(2.0f);
                this.bgPaint.setColor(Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider), 0.05f));
                canvas.drawRoundRect(fDp5, fDp4, fDp6, fDp7, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.bgPaint);
            }
        }
        Delegate delegate = this.delegate;
        TextSelectionHelper.ArticleTextSelectionHelper selectionHelper = delegate != null ? delegate.getSelectionHelper() : null;
        if (selectionHelper != null) {
            this.tmpBlocks.clear();
            fillTextLayoutBlocks(this.tmpBlocks);
            for (int i7 = 0; i7 < this.tmpBlocks.size(); i7++) {
                TextSelectionHelper.TextLayoutBlock textLayoutBlock = (TextSelectionHelper.TextLayoutBlock) this.tmpBlocks.get(i7);
                canvas.save();
                canvas.translate(textLayoutBlock.getX(), textLayoutBlock.getY());
                selectionHelper.draw(canvas, this, i7);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        drawCollapseButton(canvas);
    }

    private boolean isBlockquote() {
        BlockRow blockRow = this.currentRow;
        return blockRow != null && (blockRow.block instanceof TL_iv.pageBlockBlockquote);
    }

    private boolean hasCollapseButton() {
        Layout layout;
        return isBlockquote() && (layout = this.editText.getLayout()) != null && layout.getLineCount() > QuoteSpan.COLLAPSE_LINES;
    }

    private void ensureCollapseButton() {
        if (this.collapseButton == null) {
            this.collapseButton = new QuoteCollapseButton(this);
        }
    }

    private void drawCollapseButton(Canvas canvas) {
        if (isBlockquote()) {
            ensureCollapseButton();
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.currentRow.block;
            int color = Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider);
            int iDp = AndroidUtilities.dp(3.333f);
            this.collapseButton.draw(canvas, this.collapseButtonBounds, (getWidth() - AndroidUtilities.dp(16.0f)) - iDp, (getHeight() - AndroidUtilities.dp(8.0f)) - iDp, color, pageblockblockquote.collapsed, hasCollapseButton());
        }
    }

    public void resetCollapsedIfTooShort() {
        if (!isBlockquote() || hasCollapseButton()) {
            return;
        }
        ((TL_iv.pageBlockBlockquote) this.currentRow.block).collapsed = false;
    }

    private void toggleCollapsed() {
        if (isBlockquote()) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.currentRow.block;
            pageblockblockquote.collapsed = !pageblockblockquote.collapsed;
            updateCollapsedDecoration();
            invalidate();
            Delegate delegate = this.delegate;
            if (delegate != null) {
                delegate.onTextChanged(this.currentRow);
            }
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (hasCollapseButton() && this.collapseButton != null) {
            boolean zContains = this.collapseButtonBounds.contains(motionEvent.getX(), motionEvent.getY());
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        if (this.collapseButtonPressed) {
                            this.collapseButton.setPressed(zContains);
                            return true;
                        }
                    } else if (actionMasked == 3 && this.collapseButtonPressed) {
                        this.collapseButtonPressed = false;
                        this.collapseButton.setPressed(false);
                        return true;
                    }
                } else if (this.collapseButtonPressed) {
                    this.collapseButtonPressed = false;
                    this.collapseButton.setPressed(false);
                    if (zContains) {
                        toggleCollapsed();
                    }
                    return true;
                }
            } else if (zContains) {
                this.collapseButtonPressed = true;
                this.collapseButton.setPressed(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void updateCollapsedDecoration() {
        int length;
        Layout layout;
        int lineStart;
        if (this.editText.getText() instanceof Editable) {
            Editable text = this.editText.getText();
            int i = -1;
            if (isBlockquote() && ((TL_iv.pageBlockBlockquote) this.currentRow.block).collapsed && (layout = this.editText.getLayout()) != null) {
                int lineCount = layout.getLineCount();
                int i2 = QuoteSpan.COLLAPSE_LINES;
                if (lineCount <= i2 || (lineStart = layout.getLineStart(i2)) >= (length = text.length())) {
                    length = -1;
                } else {
                    i = lineStart;
                }
            } else {
                length = -1;
            }
            if (i == this.collapsedPartStart && length == this.collapsedPartEnd) {
                return;
            }
            this.applyingCollapsedDecoration = true;
            try {
                CharacterStyle characterStyle = this.collapsedPart;
                if (characterStyle != null) {
                    text.removeSpan(characterStyle);
                }
                if (i >= 0) {
                    if (this.collapsedPart == null) {
                        this.collapsedPart = new CollapsedTextPart();
                    }
                    text.setSpan(this.collapsedPart, i, length, 33);
                }
                this.applyingCollapsedDecoration = false;
                this.collapsedPartStart = i;
                this.collapsedPartEnd = length;
            } catch (Throwable th) {
                this.applyingCollapsedDecoration = false;
                throw th;
            }
        }
    }

    private class CollapsedTextPart extends CharacterStyle {
        private CollapsedTextPart() {
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(Theme.blendOver(Theme.multAlpha(textPaint.getColor(), 0.55f), Theme.multAlpha(Theme.getColor(Theme.key_featuredStickers_addButton, RichTextCell.this.resourcesProvider), 0.4f)));
        }
    }

    private static class CheckBoxView extends View {
        private final CheckBoxBase checkBox;

        CheckBoxView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            CheckBoxBase checkBoxBase = new CheckBoxBase(this, 20, resourcesProvider);
            this.checkBox = checkBoxBase;
            checkBoxBase.setColor(Theme.key_telegram_color, Theme.key_dialogCheckboxSquareDisabled, Theme.key_checkboxCheck);
            checkBoxBase.setBackgroundType(10);
            checkBoxBase.setDrawUnchecked(true);
            checkBoxBase.setCustomRadius(AndroidUtilities.dp(5.0f));
        }

        void setChecked(boolean z, boolean z2) {
            this.checkBox.setChecked(z, z2);
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.checkBox.onAttachedToWindow();
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.checkBox.onDetachedFromWindow();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(24.0f));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int iDp = AndroidUtilities.dp(20.0f);
            this.checkBox.setBounds((getWidth() - iDp) / 2, (getHeight() - iDp) / 2, iDp, iDp);
            this.checkBox.draw(canvas);
        }
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
            RichTextCell richTextCell = new RichTextCell(context, resourcesProvider);
            richTextCell.setBackground(new RichEditor.DraggingDrawable(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider)));
            return richTextCell;
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
