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
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline1;
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
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda9;
import org.telegram.ui.VoIPFragment$8$$ExternalSyntheticLambda1;
import org.telegram.ui.iv.RichEditorListView.BlockButtonEdit;

public final class RichButtonRowCell extends RichBlockCell implements Theme.Colorable {
    public final RichEditor.Button addButton;
    public final ArrayList buttonViews;
    public final LinearLayout buttonsLayout;
    public final int currentAccount;
    public Delegate delegate;
    public final TextView emptyAddButton;
    public final Theme.ResourcesProvider resourcesProvider;
    public final HorizontalScrollView scrollView;

    public final class ButtonView extends View {
        public final RichMessageLayout.RichButton button;
        public final int index;
        public final VoIPFragment$$ExternalSyntheticLambda9 longPressRunnable;
        public boolean longPressed;
        public boolean pressed;

        public ButtonView(Context context, TL_keyboard.PageButton pageButton, int i) {
            super(context);
            this.index = i;
            RichMessageLayout.RichButton richButtonCreateEditorPageButton = RichMessageLayout.createEditorPageButton(RichButtonRowCell.this.currentAccount, BotFullscreenButtons$$ExternalSyntheticOutline1.m(AndroidUtilities.displaySize.x, 32.0f, AndroidUtilities.dp(240.0f)), RichButtonRowCell.this.resourcesProvider, pageButton, new VoIPFragment$8$$ExternalSyntheticLambda1(this, 15));
            this.button = richButtonCreateEditorPageButton;
            this.longPressRunnable = new VoIPFragment$$ExternalSyntheticLambda9(this, i, 4);
            richButtonCreateEditorPageButton.width = richButtonCreateEditorPageButton.getPreferredWidth();
            setContentDescription(RichTextStyle.plainOf(pageButton.text));
            setClickable(true);
            setLongClickable(true);
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.button.attach(this);
        }

        @Override
        public final void onDetachedFromWindow() {
            AndroidUtilities.cancelRunOnUIThread(this.longPressRunnable);
            this.button.detach(this);
            super.onDetachedFromWindow();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.save();
            int height = getHeight();
            RichMessageLayout.RichButton richButton = this.button;
            canvas.translate(0.0f, (height - richButton.getHeight()) / 2.0f);
            richButton.draw(canvas);
            canvas.restore();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            RichMessageLayout.RichButton richButton = this.button;
            setMeasuredDimension(richButton.width, AndroidUtilities.dp(8.0f) + richButton.getHeight());
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            RichButtonRowCell richButtonRowCell;
            Delegate delegate;
            BlockRow blockRow;
            char c;
            int actionMasked = motionEvent.getActionMasked();
            VoIPFragment$$ExternalSyntheticLambda9 voIPFragment$$ExternalSyntheticLambda9 = this.longPressRunnable;
            RichMessageLayout.RichButton richButton = this.button;
            if (actionMasked == 0) {
                this.pressed = true;
                this.longPressed = false;
                richButton.setPressed(true);
                AndroidUtilities.runOnUIThread(voIPFragment$$ExternalSyntheticLambda9, ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (actionMasked == 1) {
                boolean z = this.pressed && !this.longPressed;
                this.pressed = false;
                richButton.setPressed(false);
                AndroidUtilities.cancelRunOnUIThread(voIPFragment$$ExternalSyntheticLambda9);
                if (z && (delegate = (richButtonRowCell = RichButtonRowCell.this).delegate) != null && (blockRow = richButtonRowCell.currentRow) != null) {
                    RichEditorListView.AnonymousClass5 anonymousClass5 = (RichEditorListView.AnonymousClass5) delegate;
                    TL_iv.PageBlock pageBlock = blockRow.block;
                    if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                        TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                        int i = this.index;
                        if (i >= 0 && i < pageblockbuttonrow.buttons.size()) {
                            RichEditorListView richEditorListView = RichEditorListView.this;
                            RichEditorHistory richEditorHistory = richEditorListView.history;
                            if (richEditorHistory != null) {
                                AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                                richEditorHistory.commit();
                            }
                            TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i);
                            if (pageButton != null) {
                                TL_keyboard.RichButtonStyle richButtonStyle = pageButton.style;
                                if (richButtonStyle != null && richButtonStyle.bg_primary) {
                                    c = 2;
                                } else if (richButtonStyle == null || !richButtonStyle.bg_danger) {
                                    c = (richButtonStyle == null || !richButtonStyle.bg_success) ? (char) 1 : (char) 0;
                                } else {
                                    c = 3;
                                }
                                if (richButtonStyle == null) {
                                    richButtonStyle = new TL_keyboard.RichButtonStyle();
                                }
                                richButtonStyle.flags = 0;
                                richButtonStyle.bg_primary = c == 1;
                                richButtonStyle.bg_danger = c == 2;
                                richButtonStyle.bg_success = c == 3;
                                richButtonStyle.link = false;
                                pageButton.style = richButtonStyle;
                            }
                            richEditorListView.adapter.update(false);
                            RichEditorHistory richEditorHistory2 = richEditorListView.history;
                            if (richEditorHistory2 != null) {
                                richEditorHistory2.record();
                            }
                            richEditorListView.delegate.onContentChanged();
                        }
                    }
                }
            } else {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                    this.pressed = false;
                    richButton.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(voIPFragment$$ExternalSyntheticLambda9);
                    return true;
                }
                if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                    this.pressed = false;
                    richButton.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(voIPFragment$$ExternalSyntheticLambda9);
                    return true;
                }
            }
            return true;
        }
    }

    public interface Delegate {
    }

    public final class Factory extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            RichButtonRowCell richButtonRowCell = (RichButtonRowCell) view;
            BlockRow blockRow = (BlockRow) uItem.object;
            Delegate delegate = (Delegate) uItem.object2;
            richButtonRowCell.currentRow = blockRow;
            richButtonRowCell.delegate = delegate;
            richButtonRowCell.bindBlockInset(blockRow);
            richButtonRowCell.rebuildButtons();
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            RichButtonRowCell richButtonRowCell = new RichButtonRowCell(context, i, resourcesProvider);
            richButtonRowCell.setBackground(new RichEditor.DraggingDrawable(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider)));
            return richButtonRowCell;
        }

        @Override
        public final boolean isClickable() {
            return false;
        }
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
        RichEditor.Button button = new RichEditor.Button(context, R.drawable.msg_add, resourcesProvider);
        button.roundRadius = 19;
        button.updateColors$1();
        this.addButton = button;
        button.setSelected(true);
        button.setContentDescription(LocaleController.getString(R.string.Add));
        final int i2 = 0;
        button.setOnClickListener(new View.OnClickListener(this) {
            public final RichButtonRowCell f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                BlockRow blockRow;
                BlockRow blockRow2;
                switch (i2) {
                    case 0:
                        RichButtonRowCell richButtonRowCell = this.f$0;
                        RichButtonRowCell.Delegate delegate = richButtonRowCell.delegate;
                        if (delegate != null && (blockRow = richButtonRowCell.currentRow) != null) {
                            RichEditorListView richEditorListView = RichEditorListView.this;
                            richEditorListView.hideTextSelectionUi(false);
                            richEditorListView.delegate.onBlockButtonEditRequested(richEditorListView.new BlockButtonEdit(blockRow, -1), view);
                            break;
                        }
                        break;
                    default:
                        RichButtonRowCell richButtonRowCell2 = this.f$0;
                        RichButtonRowCell.Delegate delegate2 = richButtonRowCell2.delegate;
                        if (delegate2 != null && (blockRow2 = richButtonRowCell2.currentRow) != null) {
                            RichEditorListView richEditorListView2 = RichEditorListView.this;
                            richEditorListView2.hideTextSelectionUi(false);
                            richEditorListView2.delegate.onBlockButtonEditRequested(richEditorListView2.new BlockButtonEdit(blockRow2, -1), view);
                            break;
                        }
                        break;
                }
            }
        });
        addView(button, LayoutHelper.createFrame(38, 38, 21));
        TextView textView = new TextView(context);
        this.emptyAddButton = textView;
        textView.setText(LocaleController.getString(R.string.RichEditorAddButton));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(7.0f));
        textView.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        final int i3 = 1;
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final RichButtonRowCell f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                BlockRow blockRow;
                BlockRow blockRow2;
                switch (i3) {
                    case 0:
                        RichButtonRowCell richButtonRowCell = this.f$0;
                        RichButtonRowCell.Delegate delegate = richButtonRowCell.delegate;
                        if (delegate != null && (blockRow = richButtonRowCell.currentRow) != null) {
                            RichEditorListView richEditorListView = RichEditorListView.this;
                            richEditorListView.hideTextSelectionUi(false);
                            richEditorListView.delegate.onBlockButtonEditRequested(richEditorListView.new BlockButtonEdit(blockRow, -1), view);
                            break;
                        }
                        break;
                    default:
                        RichButtonRowCell richButtonRowCell2 = this.f$0;
                        RichButtonRowCell.Delegate delegate2 = richButtonRowCell2.delegate;
                        if (delegate2 != null && (blockRow2 = richButtonRowCell2.currentRow) != null) {
                            RichEditorListView richEditorListView2 = RichEditorListView.this;
                            richEditorListView2.hideTextSelectionUi(false);
                            richEditorListView2.delegate.onBlockButtonEditRequested(richEditorListView2.new BlockButtonEdit(blockRow2, -1), view);
                            break;
                        }
                        break;
                }
            }
        });
        addView(textView, LayoutHelper.createFrame(-2, 38, 17));
        updateAddButtonColors();
    }

    public static boolean isPointInside(View view, float f, float f2) {
        if (view.getVisibility() != 0) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        if (f >= i && f <= view.getWidth() + i) {
            int i2 = iArr[1];
            if (f2 >= i2 && f2 <= view.getHeight() + i2) {
                return true;
            }
        }
        return false;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int iDp;
        int iDp2;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        ArrayList arrayList = this.buttonViews;
        int size2 = arrayList.size();
        int iDp3 = (size2 <= 0 || size2 >= 8) ? 0 : AndroidUtilities.dp(45.0f);
        HorizontalScrollView horizontalScrollView = this.scrollView;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) horizontalScrollView.getLayoutParams();
        if (layoutParams.rightMargin != iDp3) {
            layoutParams.rightMargin = iDp3;
            horizontalScrollView.setLayoutParams(layoutParams);
        }
        if (size2 > 0) {
            int iMax = Math.max(0, ((size - getPaddingLeft()) - getPaddingRight()) - iDp3);
            int size3 = arrayList.size();
            if (size3 != 0) {
                int i4 = size3 - 1;
                int iMax2 = Math.max(0, iMax - (AndroidUtilities.dp(7.0f) * i4));
                int[] iArr = new int[size3];
                int i5 = 0;
                for (int i6 = 0; i6 < size3; i6++) {
                    ButtonView buttonView = (ButtonView) arrayList.get(i6);
                    buttonView.getClass();
                    int iMax3 = Math.max(AndroidUtilities.dp(34.0f), buttonView.button.getPreferredWidth());
                    iArr[i6] = iMax3;
                    i5 += iMax3;
                }
                if (i5 <= iMax2) {
                    boolean[] zArr = new boolean[size3];
                    int i7 = size3;
                    boolean z = true;
                    while (z && i7 > 0) {
                        int i8 = iMax2 / i7;
                        int i9 = i7;
                        boolean z2 = false;
                        for (int i10 = 0; i10 < size3; i10++) {
                            if (!zArr[i10] && (i3 = iArr[i10]) > i8) {
                                zArr[i10] = true;
                                iMax2 -= i3;
                                i9--;
                                z2 = true;
                            }
                        }
                        z = z2;
                        i7 = i9;
                    }
                    if (i7 > 0) {
                        int i11 = iMax2 / i7;
                        int i12 = iMax2 - (i7 * i11);
                        for (int i13 = 0; i13 < size3; i13++) {
                            if (!zArr[i13]) {
                                int i14 = i12 - 1;
                                iArr[i13] = (i12 > 0 ? 1 : 0) + i11;
                                i12 = i14;
                            }
                        }
                    }
                } else {
                    int iMax4 = 0;
                    for (int i15 = 0; i15 < size3; i15++) {
                        int i16 = iArr[i15];
                        ButtonView buttonView2 = (ButtonView) arrayList.get(i15);
                        buttonView2.getClass();
                        iMax4 += i16 - Math.max(AndroidUtilities.dp(34.0f), buttonView2.button.getMinWidth());
                    }
                    if (iMax4 <= 0) {
                        for (int i17 = 0; i17 < size3; i17++) {
                            ButtonView buttonView3 = (ButtonView) arrayList.get(i17);
                            buttonView3.getClass();
                            iArr[i17] = Math.max(AndroidUtilities.dp(34.0f), buttonView3.button.getMinWidth());
                        }
                    } else {
                        int iMin = Math.min(i5 - iMax2, iMax4);
                        int i18 = 0;
                        int i19 = 0;
                        while (i18 < size3) {
                            int i20 = iArr[i18];
                            ButtonView buttonView4 = (ButtonView) arrayList.get(i18);
                            buttonView4.getClass();
                            int iMax5 = i20 - Math.max(AndroidUtilities.dp(34.0f), buttonView4.button.getMinWidth());
                            int iMin2 = Math.min(i18 == i4 ? iMin - i19 : (int) ((((long) iMin) * ((long) iMax5)) / ((long) iMax4)), iMax5);
                            iArr[i18] = iArr[i18] - iMin2;
                            i19 += iMin2;
                            i18++;
                            iMin = iMin;
                        }
                    }
                }
                for (int i21 = 0; i21 < size3; i21++) {
                    ButtonView buttonView5 = (ButtonView) arrayList.get(i21);
                    buttonView5.button.width = Math.max(AndroidUtilities.dp(34.0f), iArr[i21]);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) buttonView5.getLayoutParams();
                    if (layoutParams2 != null) {
                        int i22 = layoutParams2.width;
                        int i23 = buttonView5.button.width;
                        if (i22 != i23) {
                            layoutParams2.width = i23;
                            buttonView5.setLayoutParams(layoutParams2);
                        }
                    }
                }
            }
        }
        if (size2 > 0) {
            iDp = ((ButtonView) arrayList.get(0)).button.getHeight();
            iDp2 = AndroidUtilities.dp(8.0f);
        } else {
            iDp = AndroidUtilities.dp(SharedConfig.fontSize + 18);
            iDp2 = AndroidUtilities.dp(8.0f);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iDp2 + iDp;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        setMeasuredDimension(size, paddingBottom);
    }

    public final void rebuildButtons() {
        TL_iv.pageBlockButtonRow pageblockbuttonrow;
        ArrayList<TL_keyboard.PageButton> arrayList;
        LinearLayout linearLayout = this.buttonsLayout;
        linearLayout.removeAllViews();
        ArrayList arrayList2 = this.buttonViews;
        arrayList2.clear();
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
            arrayList2.add(buttonView);
            linearLayout.addView(buttonView, LayoutHelper.createLinear(-2, -1, 16, i == 0 ? 0 : 7, 0, 0, 0));
            i++;
        }
        boolean z = size < 8;
        this.scrollView.setVisibility(size > 0 ? 0 : 8);
        this.emptyAddButton.setVisibility(size == 0 ? 0 : 8);
        this.addButton.setVisibility((size <= 0 || !z) ? 8 : 0);
        requestLayout();
    }

    public final void updateAddButtonColors() {
        int i = Theme.key_featuredStickers_addButton;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int color = Theme.getColor(i, resourcesProvider);
        int iBlendOver = Theme.blendOver(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider), Theme.multAlpha(0.1f, color));
        TextView textView = this.emptyAddButton;
        textView.setTextColor(color);
        textView.setBackground(Theme.createRadSelectorDrawable(iBlendOver, Theme.multAlpha(0.16f, color), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f)));
        Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_add).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableMutate, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override
    public final void updateColors$1() {
        this.addButton.updateColors$1();
        updateAddButtonColors();
        rebuildButtons();
    }
}
