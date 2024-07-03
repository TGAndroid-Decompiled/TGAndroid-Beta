package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Components.SlideChooseView;

public class ClearHistoryAlert extends BottomSheet {
    private boolean autoDeleteOnly;
    private CheckBoxCell cell;
    private int currentTimer;
    private ClearHistoryAlertDelegate delegate;
    private boolean dismissedDelayed;
    private LinearLayout linearLayout;
    private int[] location;
    private int newTimer;
    private int scrollOffsetY;
    private BottomSheetCell setTimerButton;
    private Drawable shadowDrawable;

    public interface ClearHistoryAlertDelegate {

        public final class CC {
            public static void $default$onClearHistory(ClearHistoryAlertDelegate clearHistoryAlertDelegate, boolean z) {
            }
        }

        void onAutoDeleteHistory(int i, int i2);

        void onClearHistory(boolean z);
    }

    @Override
    protected boolean canDismissWithSwipe() {
        return false;
    }

    public static class BottomSheetCell extends FrameLayout {
        private View background;
        private final Theme.ResourcesProvider resourcesProvider;
        private TextView textView;

        public BottomSheetCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            View view = new View(context);
            this.background = view;
            view.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(4.0f), getThemedColor(Theme.key_featuredStickers_addButton), getThemedColor(Theme.key_featuredStickers_addButtonPressed)));
            addView(this.background, LayoutHelper.createFrame(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setLines(1);
            this.textView.setSingleLine(true);
            this.textView.setGravity(1);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setGravity(17);
            this.textView.setTextColor(getThemedColor(Theme.key_featuredStickers_buttonText));
            this.textView.setTextSize(1, 14.0f);
            this.textView.setTypeface(AndroidUtilities.bold());
            addView(this.textView, LayoutHelper.createFrame(-2, -2, 17));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
        }

        public void setText(CharSequence charSequence) {
            this.textView.setText(charSequence);
        }

        protected int getThemedColor(int i) {
            return Theme.getColor(i, this.resourcesProvider);
        }
    }

    public ClearHistoryAlert(android.content.Context r26, org.telegram.tgnet.TLRPC$User r27, org.telegram.tgnet.TLRPC$Chat r28, boolean r29, org.telegram.ui.ActionBar.Theme.ResourcesProvider r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ClearHistoryAlert.<init>(android.content.Context, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, boolean, org.telegram.ui.ActionBar.Theme$ResourcesProvider):void");
    }

    public class AnonymousClass1 extends NestedScrollView {
        private boolean ignoreLayout;

        AnonymousClass1(Context context) {
            super(context);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && ClearHistoryAlert.this.scrollOffsetY != 0 && motionEvent.getY() < ClearHistoryAlert.this.scrollOffsetY) {
                ClearHistoryAlert.this.dismiss();
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return !ClearHistoryAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
        }

        @Override
        public void setTranslationY(float f) {
            super.setTranslationY(f);
            ClearHistoryAlert.this.updateLayout();
        }

        @Override
        public void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i2);
            measureChildWithMargins(ClearHistoryAlert.this.linearLayout, i, 0, i2, 0);
            int measuredHeight = ClearHistoryAlert.this.linearLayout.getMeasuredHeight();
            int i3 = (size / 5) * 3;
            int i4 = size - i3;
            if (ClearHistoryAlert.this.autoDeleteOnly || measuredHeight - i4 < AndroidUtilities.dp(90.0f) || measuredHeight < (size / 2) + AndroidUtilities.dp(90.0f) || i4 < (measuredHeight = (measuredHeight / 2) + AndroidUtilities.dp(108.0f))) {
                i3 = size - measuredHeight;
            }
            if (getPaddingTop() != i3) {
                this.ignoreLayout = true;
                setPadding(0, i3, 0, 0);
                this.ignoreLayout = false;
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ClearHistoryAlert.this.updateLayout();
        }

        @Override
        public void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int scrollY = (int) (((ClearHistoryAlert.this.scrollOffsetY - ((BottomSheet) ClearHistoryAlert.this).backgroundPaddingTop) + getScrollY()) - getTranslationY());
            ClearHistoryAlert.this.shadowDrawable.setBounds(0, scrollY, getMeasuredWidth(), ClearHistoryAlert.this.linearLayout.getMeasuredHeight() + scrollY + ((BottomSheet) ClearHistoryAlert.this).backgroundPaddingTop + AndroidUtilities.dp(19.0f));
            ClearHistoryAlert.this.shadowDrawable.draw(canvas);
        }

        @Override
        public void onScrollChanged(int i, int i2, int i3, int i4) {
            super.onScrollChanged(i, i2, i3, i4);
            ClearHistoryAlert.this.updateLayout();
        }
    }

    public class AnonymousClass2 extends LinearLayout {
        AnonymousClass2(Context context) {
            super(context);
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ClearHistoryAlert.this.updateLayout();
        }
    }

    public static void lambda$new$0(boolean[] zArr, View view) {
        zArr[0] = !zArr[0];
        ((CheckBoxCell) view).setChecked(zArr[0], true);
    }

    public void lambda$new$1(View view) {
        if (this.dismissedDelayed) {
            return;
        }
        ClearHistoryAlertDelegate clearHistoryAlertDelegate = this.delegate;
        CheckBoxCell checkBoxCell = this.cell;
        clearHistoryAlertDelegate.onClearHistory(checkBoxCell != null && checkBoxCell.isChecked());
        dismiss();
    }

    public class AnonymousClass3 implements SlideChooseView.Callback {
        final NestedScrollView val$scrollView;

        AnonymousClass3(NestedScrollView nestedScrollView) {
            r2 = nestedScrollView;
        }

        @Override
        public void onOptionSelected(int i) {
            ClearHistoryAlert.this.newTimer = i;
            ClearHistoryAlert.this.updateTimerButton(true);
        }

        @Override
        public void onTouchEnd() {
            r2.smoothScrollTo(0, ClearHistoryAlert.this.linearLayout.getMeasuredHeight());
        }
    }

    public void lambda$new$2(View view) {
        int i;
        if (this.dismissedDelayed) {
            return;
        }
        int i2 = this.newTimer;
        if (i2 != this.currentTimer) {
            this.dismissedDelayed = true;
            int i3 = 70;
            if (i2 == 3) {
                i = 2678400;
            } else if (i2 == 2) {
                i = 604800;
            } else if (i2 == 1) {
                i = 86400;
            } else {
                i = 0;
                i3 = 71;
            }
            this.delegate.onAutoDeleteHistory(i, i3);
        }
        if (this.dismissedDelayed) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ClearHistoryAlert.this.dismiss();
                }
            }, 200L);
        } else {
            dismiss();
        }
    }

    public void updateTimerButton(boolean z) {
        if (this.currentTimer != this.newTimer || this.autoDeleteOnly) {
            this.setTimerButton.setVisibility(0);
            if (z) {
                this.setTimerButton.animate().alpha(1.0f).setDuration(180L).start();
                return;
            } else {
                this.setTimerButton.setAlpha(1.0f);
                return;
            }
        }
        if (z) {
            this.setTimerButton.animate().alpha(0.0f).setDuration(180L).start();
        } else {
            this.setTimerButton.setVisibility(4);
            this.setTimerButton.setAlpha(0.0f);
        }
    }

    public void updateLayout() {
        this.linearLayout.getChildAt(0).getLocationInWindow(this.location);
        int max = Math.max(this.location[1] - AndroidUtilities.dp(this.autoDeleteOnly ? 6.0f : 19.0f), 0);
        if (this.scrollOffsetY != max) {
            this.scrollOffsetY = max;
            this.containerView.invalidate();
        }
    }

    public void setDelegate(ClearHistoryAlertDelegate clearHistoryAlertDelegate) {
        this.delegate = clearHistoryAlertDelegate;
    }
}
