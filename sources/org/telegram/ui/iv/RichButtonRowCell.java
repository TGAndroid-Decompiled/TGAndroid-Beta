package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;

public class RichButtonRowCell extends RichBlockCell implements Theme.Colorable {
    private final RichEditor.Button addButton;
    private final ArrayList buttonViews;
    private final LinearLayout buttonsLayout;
    private final int currentAccount;
    private Delegate delegate;
    private final TextView emptyAddButton;
    private final Theme.ResourcesProvider resourcesProvider;
    private final HorizontalScrollView scrollView;

    public interface Delegate {
        void onAddButton(BlockRow blockRow, View view);

        void onCycleButtonStyle(BlockRow blockRow, int i);

        void onEditButton(BlockRow blockRow, int i, View view);
    }

    public int[] getColorKeys() {
        return Theme.Colorable.CC.$default$getColorKeys(this);
    }

    public RichButtonRowCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.buttonViews = new ArrayList();
        this.currentAccount = i;
        this.resourcesProvider = resourcesProvider;
        setBlockPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.scrollView = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.buttonsLayout = linearLayout;
        linearLayout.setOrientation(0);
        horizontalScrollView.addView(linearLayout, new FrameLayout.LayoutParams(-2, -1));
        addView(horizontalScrollView, LayoutHelper.createFrame(-1, -1, 23));
        RichEditor.Button roundRadius = new RichEditor.Button(context, R.drawable.msg_add, resourcesProvider).setRoundRadius(19);
        this.addButton = roundRadius;
        roundRadius.setSelected(true);
        roundRadius.setContentDescription(LocaleController.getString(R.string.Add));
        roundRadius.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                RichButtonRowCell.m4911$r8$lambda$sweDzUk5wK9QxbZkD2jEfSKnmk(this.f$0, view);
            }
        });
        addView(roundRadius, LayoutHelper.createFrame(38, 38, 21));
        TextView textView = new TextView(context);
        this.emptyAddButton = textView;
        textView.setText(LocaleController.getString(R.string.RichEditorAddButton));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(7.0f));
        textView.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                RichButtonRowCell.$r8$lambda$yqOYnXk5V_ceV8BUTZkkcNPBCL8(this.f$0, view);
            }
        });
        addView(textView, LayoutHelper.createFrame(-2, 38, 17));
        updateAddButtonColors();
    }

    public static void m4911$r8$lambda$sweDzUk5wK9QxbZkD2jEfSKnmk(RichButtonRowCell richButtonRowCell, View view) {
        BlockRow blockRow;
        Delegate delegate = richButtonRowCell.delegate;
        if (delegate == null || (blockRow = richButtonRowCell.currentRow) == null) {
            return;
        }
        delegate.onAddButton(blockRow, view);
    }

    public static void $r8$lambda$yqOYnXk5V_ceV8BUTZkkcNPBCL8(RichButtonRowCell richButtonRowCell, View view) {
        BlockRow blockRow;
        Delegate delegate = richButtonRowCell.delegate;
        if (delegate == null || (blockRow = richButtonRowCell.currentRow) == null) {
            return;
        }
        delegate.onAddButton(blockRow, view);
    }

    public void bind(BlockRow blockRow, Delegate delegate) {
        this.currentRow = blockRow;
        this.delegate = delegate;
        bindBlockInset(blockRow);
        rebuildButtons();
    }

    private void rebuildButtons() {
        TL_iv.pageBlockButtonRow pageblockbuttonrow;
        ArrayList<TL_keyboard.PageButton> arrayList;
        this.buttonsLayout.removeAllViews();
        this.buttonViews.clear();
        BlockRow blockRow = this.currentRow;
        if (blockRow != null) {
            TL_iv.PageBlock pageBlock = blockRow.block;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
            } else {
                pageblockbuttonrow = null;
            }
        } else {
            pageblockbuttonrow = null;
        }
        int size = (pageblockbuttonrow == null || (arrayList = pageblockbuttonrow.buttons) == null) ? 0 : arrayList.size();
        int i = 0;
        while (i < size) {
            ButtonView buttonView = new ButtonView(getContext(), pageblockbuttonrow.buttons.get(i), i);
            this.buttonViews.add(buttonView);
            this.buttonsLayout.addView(buttonView, LayoutHelper.createLinear(-2, -1, 16, i == 0 ? 0 : 7, 0, 0, 0));
            i++;
        }
        boolean z = size < 8;
        this.scrollView.setVisibility(size > 0 ? 0 : 8);
        this.emptyAddButton.setVisibility(size == 0 ? 0 : 8);
        this.addButton.setVisibility((size <= 0 || !z) ? 8 : 0);
        requestLayout();
    }

    @Override
    public void updateColors() {
        this.addButton.updateColors();
        updateAddButtonColors();
        rebuildButtons();
    }

    private void updateAddButtonColors() {
        int color = Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider);
        int iBlendOver = Theme.blendOver(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider), Theme.multAlpha(color, 0.1f));
        this.emptyAddButton.setTextColor(color);
        this.emptyAddButton.setBackground(Theme.createRadSelectorDrawable(iBlendOver, Theme.multAlpha(color, 0.16f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f)));
        Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_add).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        this.emptyAddButton.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableMutate, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int iDp;
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.buttonViews.size();
        int iDp2 = (size2 <= 0 || size2 >= 8) ? 0 : AndroidUtilities.dp(45.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.scrollView.getLayoutParams();
        if (layoutParams.rightMargin != iDp2) {
            layoutParams.rightMargin = iDp2;
            this.scrollView.setLayoutParams(layoutParams);
        }
        if (size2 > 0) {
            layoutButtonWidths(Math.max(0, ((size - getPaddingLeft()) - getPaddingRight()) - iDp2));
        }
        if (size2 > 0) {
            iDp = ((ButtonView) this.buttonViews.get(0)).getContentHeight();
        } else {
            iDp = AndroidUtilities.dp(SharedConfig.fontSize + 18) + AndroidUtilities.dp(8.0f);
        }
        int paddingTop = getPaddingTop() + iDp + getPaddingBottom();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
        setMeasuredDimension(size, paddingTop);
    }

    private void layoutButtonWidths(int i) {
        int size = this.buttonViews.size();
        if (size == 0) {
            return;
        }
        int iMax = Math.max(0, i - (AndroidUtilities.dp(7.0f) * (size - 1)));
        int[] iArr = new int[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int preferredWidth = ((ButtonView) this.buttonViews.get(i3)).getPreferredWidth();
            iArr[i3] = preferredWidth;
            i2 += preferredWidth;
        }
        if (i2 <= iMax) {
            stretchWidths(iArr, iMax);
        } else {
            squeezeWidths(iArr, iMax, i2);
        }
        for (int i4 = 0; i4 < size; i4++) {
            ((ButtonView) this.buttonViews.get(i4)).setButtonWidth(iArr[i4]);
        }
    }

    private void stretchWidths(int[] iArr, int i) {
        int i2;
        boolean[] zArr = new boolean[iArr.length];
        int length = iArr.length;
        boolean z = true;
        while (true) {
            boolean z2 = false;
            if (!z || length <= 0) {
                break;
            }
            int i3 = i / length;
            for (int i4 = 0; i4 < iArr.length; i4++) {
                if (!zArr[i4] && (i2 = iArr[i4]) > i3) {
                    zArr[i4] = true;
                    i -= i2;
                    length--;
                    z2 = true;
                }
            }
            z = z2;
        }
        if (length <= 0) {
            return;
        }
        int i5 = i / length;
        int i6 = i - (length * i5);
        for (int i7 = 0; i7 < iArr.length; i7++) {
            if (!zArr[i7]) {
                int i8 = i6 - 1;
                iArr[i7] = (i6 > 0 ? 1 : 0) + i5;
                i6 = i8;
            }
        }
    }

    private void squeezeWidths(int[] iArr, int i, int i2) {
        int i3 = 0;
        int minWidth = 0;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            minWidth += iArr[i4] - ((ButtonView) this.buttonViews.get(i4)).getMinWidth();
        }
        if (minWidth <= 0) {
            while (i3 < iArr.length) {
                iArr[i3] = ((ButtonView) this.buttonViews.get(i3)).getMinWidth();
                i3++;
            }
            return;
        }
        int iMin = Math.min(i2 - i, minWidth);
        int i5 = 0;
        while (i3 < iArr.length) {
            int minWidth2 = iArr[i3] - ((ButtonView) this.buttonViews.get(i3)).getMinWidth();
            int iMin2 = Math.min(i3 == iArr.length + (-1) ? iMin - i5 : (int) ((((long) iMin) * ((long) minWidth2)) / ((long) minWidth)), minWidth2);
            iArr[i3] = iArr[i3] - iMin2;
            i5 += iMin2;
            i3++;
        }
    }

    public boolean isPressOnButton(float f, float f2) {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        float f3 = iArr[0] + f;
        float f4 = iArr[1] + f2;
        if (isPointInside(this.addButton, f3, f4) || isPointInside(this.emptyAddButton, f3, f4)) {
            return true;
        }
        ArrayList arrayList = this.buttonViews;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (isPointInside((ButtonView) obj, f3, f4)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPointInside(View view, float f, float f2) {
        if (view.getVisibility() != 0) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        if (f >= i && f <= i + view.getWidth()) {
            int i2 = iArr[1];
            if (f2 >= i2 && f2 <= i2 + view.getHeight()) {
                return true;
            }
        }
        return false;
    }

    class ButtonView extends View {
        private final RichMessageLayout.RichButton button;
        private final int index;
        private final Runnable longPressRunnable;
        private boolean longPressed;
        private boolean pressed;

        ButtonView(Context context, TL_keyboard.PageButton pageButton, final int i) {
            super(context);
            this.index = i;
            RichMessageLayout.RichButton richButtonCreateEditorPageButton = RichMessageLayout.createEditorPageButton(RichButtonRowCell.this.currentAccount, Math.max(AndroidUtilities.dp(240.0f), AndroidUtilities.displaySize.x - AndroidUtilities.dp(32.0f)), RichButtonRowCell.this.resourcesProvider, pageButton, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.invalidate();
                }
            });
            this.button = richButtonCreateEditorPageButton;
            this.longPressRunnable = new Runnable() {
                @Override
                public final void run() {
                    RichButtonRowCell.ButtonView.$r8$lambda$b7cj_jUEwaI9wsHrlDuwlez8f4w(this.f$0, i);
                }
            };
            richButtonCreateEditorPageButton.width = richButtonCreateEditorPageButton.getPreferredWidth();
            setContentDescription(RichTextStyle.plainOf(pageButton.text));
            setClickable(true);
            setLongClickable(true);
        }

        public static void $r8$lambda$b7cj_jUEwaI9wsHrlDuwlez8f4w(ButtonView buttonView, int i) {
            if (!buttonView.pressed || RichButtonRowCell.this.delegate == null || RichButtonRowCell.this.currentRow == null) {
                return;
            }
            buttonView.longPressed = true;
            buttonView.button.setPressed(false);
            try {
                buttonView.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            RichButtonRowCell.this.delegate.onEditButton(RichButtonRowCell.this.currentRow, i, buttonView);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(this.button.width, getContentHeight());
        }

        int getContentHeight() {
            return this.button.getHeight() + AndroidUtilities.dp(8.0f);
        }

        int getPreferredWidth() {
            return Math.max(AndroidUtilities.dp(34.0f), this.button.getPreferredWidth());
        }

        int getMinWidth() {
            return Math.max(AndroidUtilities.dp(34.0f), this.button.getMinWidth());
        }

        void setButtonWidth(int i) {
            this.button.width = Math.max(AndroidUtilities.dp(34.0f), i);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getLayoutParams();
            if (layoutParams != null) {
                int i2 = layoutParams.width;
                int i3 = this.button.width;
                if (i2 != i3) {
                    layoutParams.width = i3;
                    setLayoutParams(layoutParams);
                }
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.save();
            canvas.translate(0.0f, (getHeight() - this.button.getHeight()) / 2.0f);
            this.button.draw(canvas);
            canvas.restore();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.pressed = true;
                this.longPressed = false;
                this.button.setPressed(true);
                AndroidUtilities.runOnUIThread(this.longPressRunnable, ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (actionMasked == 1) {
                boolean z = this.pressed && !this.longPressed;
                this.pressed = false;
                this.button.setPressed(false);
                AndroidUtilities.cancelRunOnUIThread(this.longPressRunnable);
                if (z && RichButtonRowCell.this.delegate != null) {
                    RichButtonRowCell richButtonRowCell = RichButtonRowCell.this;
                    if (richButtonRowCell.currentRow != null) {
                        richButtonRowCell.delegate.onCycleButtonStyle(RichButtonRowCell.this.currentRow, this.index);
                    }
                }
                return true;
            }
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    this.pressed = false;
                    this.button.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(this.longPressRunnable);
                    return true;
                }
                return super.onTouchEvent(motionEvent);
            }
            if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                this.pressed = false;
                this.button.setPressed(false);
                AndroidUtilities.cancelRunOnUIThread(this.longPressRunnable);
            }
            return true;
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.button.attach(this);
        }

        @Override
        protected void onDetachedFromWindow() {
            AndroidUtilities.cancelRunOnUIThread(this.longPressRunnable);
            this.button.detach(this);
            super.onDetachedFromWindow();
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
        public RichButtonRowCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            RichButtonRowCell richButtonRowCell = new RichButtonRowCell(context, i, resourcesProvider);
            richButtonRowCell.setBackground(new RichEditor.DraggingDrawable(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider)));
            return richButtonRowCell;
        }

        @Override
        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            ((RichButtonRowCell) view).bind((BlockRow) uItem.object, (Delegate) uItem.object2);
        }

        public static UItem of(BlockRow blockRow, Delegate delegate) {
            UItem uItemOfFactory = UItem.ofFactory(Factory.class);
            uItemOfFactory.object = blockRow;
            uItemOfFactory.object2 = delegate;
            return uItemOfFactory;
        }
    }
}
