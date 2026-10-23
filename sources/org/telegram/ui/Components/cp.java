package org.telegram.ui.Components;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class cp extends LinearLayout {
    public dl0 f25233a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f25234b;
    public FrameLayout f25235c;
    public int d;
    public float e;
    public float f25236f;
    public float h;
    public float f25237n;
    public float f25238r;

    public final void a() {
        FrameLayout frameLayout = this.f25235c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.f25237n + this.f25238r);
        }
    }

    public final void b() {
        float f7 = (1.0f - this.f25236f) * this.e;
        this.f25234b.setTranslationX(f7);
        FrameLayout frameLayout = this.f25235c;
        if (frameLayout != null) {
            frameLayout.setTranslationX(f7);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        ViewGroup viewGroup;
        int i13;
        dl0 dl0Var;
        int i14 = i10;
        int i15 = this.d;
        if (i15 != 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
        } else {
            i12 = i11;
        }
        dl0 dl0Var2 = this.f25233a;
        if (dl0Var2 != null && this.f25234b != null) {
            dl0Var2.getLayoutParams().width = -2;
            int i16 = 0;
            ((LinearLayout.LayoutParams) this.f25233a.getLayoutParams()).rightMargin = 0;
            this.e = 0.0f;
            super.onMeasure(i14, i12);
            int measuredWidth = this.f25233a.getMeasuredWidth();
            if (this.f25234b.getSwipeBack() != null && this.f25234b.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f25234b.getSwipeBack().getMeasuredWidth();
            }
            if (this.f25234b.getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f25234b.getMeasuredWidth();
            }
            if (this.f25233a.q()) {
                i14 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            }
            dl0 dl0Var3 = this.f25233a;
            if (!dl0Var3.f25538e1 && dl0Var3.Q0 && dl0Var3.getMeasuredWidth() > 0) {
                int min = Math.min(AndroidUtilities.dp(320.0f), dl0Var3.getMeasuredWidth() - AndroidUtilities.dp(16.0f));
                StaticLayout staticLayout = new StaticLayout(dl0Var3.R0.getText(), dl0Var3.R0.getPaint(), min, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                dl0Var3.T0 = staticLayout.getHeight();
                dl0Var3.S0 = 0;
                for (int i17 = 0; i17 < staticLayout.getLineCount(); i17++) {
                    dl0Var3.S0 = Math.max(dl0Var3.S0, (int) Math.ceil(staticLayout.getLineWidth(i17)));
                }
                if (staticLayout.getLineCount() > 1 && !dl0Var3.R0.getText().toString().contains("\n")) {
                    int a2 = ei.x3.a(dl0Var3.R0.getText(), dl0Var3.R0.getPaint());
                    StaticLayout staticLayout2 = new StaticLayout(dl0Var3.R0.getText(), dl0Var3.R0.getPaint(), a2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    dl0Var3.T0 = staticLayout2.getHeight();
                    dl0Var3.S0 = 0;
                    for (int i18 = 0; i18 < staticLayout2.getLineCount(); i18++) {
                        dl0Var3.S0 = Math.max(dl0Var3.S0, (int) Math.ceil(staticLayout2.getLineWidth(i18)));
                    }
                    dl0Var3.R0.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                    dl0Var3.R0.setWidth(AndroidUtilities.dp(48.0f) + a2);
                } else {
                    dl0Var3.R0.setWidth(AndroidUtilities.dp(16.0f) + min);
                }
                int max = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(7.0f) + dl0Var3.T0);
                int i19 = dl0Var3.M0;
                if (i19 != 1 && i19 != 2) {
                    dl0Var3.getLayoutParams().height = AndroidUtilities.dp(22.0f) + AndroidUtilities.dp(52.0f) + max;
                } else {
                    max = AndroidUtilities.dp(20.0f);
                }
                ((FrameLayout.LayoutParams) dl0Var3.f25570z0.getLayoutParams()).topMargin = max;
                ((FrameLayout.LayoutParams) dl0Var3.f25529b.getLayoutParams()).topMargin = max;
                dl0Var3.f25538e1 = true;
            }
            int totalWidth = this.f25233a.getTotalWidth();
            if (this.f25234b.getSwipeBack() != null) {
                viewGroup = this.f25234b.getSwipeBack();
            } else {
                viewGroup = this.f25234b;
            }
            View childAt = viewGroup.getChildAt(0);
            int dp = AndroidUtilities.dp(36.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
            int hintTextWidth = this.f25233a.getHintTextWidth();
            if (hintTextWidth > dp) {
                dp = hintTextWidth;
            } else if (dp > measuredWidth) {
                dp = measuredWidth;
            }
            this.f25233a.G = AndroidUtilities.dp(36.0f);
            if (this.f25233a.q()) {
                this.f25233a.getLayoutParams().width = totalWidth;
                this.f25233a.G = Math.max((totalWidth - childAt.getMeasuredWidth()) - AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
            } else if (totalWidth > dp) {
                int dp2 = ((dp - AndroidUtilities.dp(16.0f)) / AndroidUtilities.dp(36.0f)) + 1;
                int dp3 = AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(36.0f) * dp2);
                if (AndroidUtilities.dp(24.0f) + hintTextWidth > dp3) {
                    dp3 = AndroidUtilities.dp(24.0f) + hintTextWidth;
                }
                if (dp3 <= totalWidth && dp2 != this.f25233a.getItemsCount()) {
                    totalWidth = dp3;
                }
                this.f25233a.getLayoutParams().width = totalWidth;
            } else {
                this.f25233a.getLayoutParams().width = -2;
            }
            if (this.f25233a.getMeasuredWidth() == measuredWidth && this.f25233a.q()) {
                float measuredWidth2 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                this.e = measuredWidth2;
                int i20 = (int) (dl0Var.G - measuredWidth2);
                this.f25233a.G = i20;
                if (i20 < AndroidUtilities.dp(36.0f)) {
                    this.e = 0.0f;
                    this.f25233a.G = AndroidUtilities.dp(36.0f);
                }
                b();
            } else {
                if (this.f25234b.getSwipeBack() != null) {
                    i13 = this.f25234b.getSwipeBack().getMeasuredWidth() - this.f25234b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                if (this.f25233a.getLayoutParams().width != -2 && this.f25233a.getLayoutParams().width + i13 > measuredWidth) {
                    i13 = AndroidUtilities.dp(8.0f) + (measuredWidth - this.f25233a.getLayoutParams().width);
                }
                if (i13 >= 0) {
                    i16 = i13;
                }
                ((LinearLayout.LayoutParams) this.f25233a.getLayoutParams()).rightMargin = i16;
                this.e = 0.0f;
                b();
            }
            if (this.f25235c != null) {
                if (this.f25233a.q()) {
                    this.f25235c.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                    b();
                } else {
                    this.f25235c.getLayoutParams().width = -1;
                }
                if (this.f25234b.getSwipeBack() != null) {
                    ((LinearLayout.LayoutParams) this.f25235c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f) + i16;
                } else {
                    ((LinearLayout.LayoutParams) this.f25235c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f);
                }
            }
            super.onMeasure(i14, i12);
        } else {
            super.onMeasure(i14, i12);
        }
        this.d = getMeasuredHeight();
    }

    public void setExpandSize(float f7) {
        this.f25234b.setTranslationY(f7);
        this.f25237n = f7;
        a();
    }

    public void setMaxHeight(int i10) {
        this.d = i10;
    }

    public void setPopupAlpha(float f7) {
        this.f25234b.setAlpha(f7);
        FrameLayout frameLayout = this.f25235c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f25234b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new q2(14, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            qh0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.f29603x.add(new ph0() {
                @Override
                public final void a(float f7, float f10) {
                    cp cpVar = cp.this;
                    FrameLayout frameLayout = cpVar.f25235c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f10);
                    }
                    cpVar.f25236f = f10;
                    cpVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(dl0 dl0Var) {
        this.f25233a = dl0Var;
        if (dl0Var != null) {
            dl0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f7) {
        this.f25234b.setReactionsTransitionProgress(f7);
        FrameLayout frameLayout = this.f25235c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
            float f10 = (f7 * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.f25235c;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.f25235c.setPivotY(0.0f);
            this.f25238r = (1.0f - f7) * (-this.f25234b.getMeasuredHeight());
            a();
            this.f25235c.setScaleX(f10);
            this.f25235c.setScaleY(f10);
        }
    }
}
