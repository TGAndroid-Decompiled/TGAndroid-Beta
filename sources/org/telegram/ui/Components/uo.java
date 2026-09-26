package org.telegram.ui.Components;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class uo extends LinearLayout {
    public rk0 f28866a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f28867b;
    public FrameLayout f28868c;
    public int d;
    public float e;
    public float f28869f;
    public float h;
    public float f28870n;
    public float f28871r;

    public final void a() {
        FrameLayout frameLayout = this.f28868c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.f28870n + this.f28871r);
        }
    }

    public final void b() {
        float f7 = (1.0f - this.f28869f) * this.e;
        this.f28867b.setTranslationX(f7);
        FrameLayout frameLayout = this.f28868c;
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
        int i14 = i10;
        int i15 = this.d;
        if (i15 != 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
        } else {
            i12 = i11;
        }
        rk0 rk0Var = this.f28866a;
        if (rk0Var != null && this.f28867b != null) {
            rk0Var.getLayoutParams().width = -2;
            int i16 = 0;
            ((LinearLayout.LayoutParams) this.f28866a.getLayoutParams()).rightMargin = 0;
            this.e = 0.0f;
            super.onMeasure(i14, i12);
            int measuredWidth = this.f28866a.getMeasuredWidth();
            if (this.f28867b.getSwipeBack() != null && this.f28867b.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f28867b.getSwipeBack().getMeasuredWidth();
            }
            if (this.f28867b.getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f28867b.getMeasuredWidth();
            }
            if (this.f28866a.q()) {
                i14 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            }
            rk0 rk0Var2 = this.f28866a;
            if (!rk0Var2.f27960e1 && rk0Var2.Q0 && rk0Var2.getMeasuredWidth() > 0) {
                int min = Math.min(AndroidUtilities.dp(320.0f), rk0Var2.getMeasuredWidth() - AndroidUtilities.dp(16.0f));
                StaticLayout staticLayout = new StaticLayout(rk0Var2.R0.getText(), rk0Var2.R0.getPaint(), min, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                rk0Var2.T0 = staticLayout.getHeight();
                rk0Var2.S0 = 0;
                for (int i17 = 0; i17 < staticLayout.getLineCount(); i17++) {
                    rk0Var2.S0 = Math.max(rk0Var2.S0, (int) Math.ceil(staticLayout.getLineWidth(i17)));
                }
                if (staticLayout.getLineCount() > 1 && !rk0Var2.R0.getText().toString().contains("\n")) {
                    int a2 = ci.e4.a(rk0Var2.R0.getText(), rk0Var2.R0.getPaint());
                    StaticLayout staticLayout2 = new StaticLayout(rk0Var2.R0.getText(), rk0Var2.R0.getPaint(), a2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    rk0Var2.T0 = staticLayout2.getHeight();
                    rk0Var2.S0 = 0;
                    for (int i18 = 0; i18 < staticLayout2.getLineCount(); i18++) {
                        rk0Var2.S0 = Math.max(rk0Var2.S0, (int) Math.ceil(staticLayout2.getLineWidth(i18)));
                    }
                    rk0Var2.R0.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                    rk0Var2.R0.setWidth(AndroidUtilities.dp(48.0f) + a2);
                } else {
                    rk0Var2.R0.setWidth(AndroidUtilities.dp(16.0f) + min);
                }
                int max = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(7.0f) + rk0Var2.T0);
                int i19 = rk0Var2.M0;
                if (i19 != 1 && i19 != 2) {
                    rk0Var2.getLayoutParams().height = AndroidUtilities.dp(22.0f) + AndroidUtilities.dp(52.0f) + max;
                } else {
                    max = AndroidUtilities.dp(20.0f);
                }
                ((FrameLayout.LayoutParams) rk0Var2.f27992z0.getLayoutParams()).topMargin = max;
                ((FrameLayout.LayoutParams) rk0Var2.f27951b.getLayoutParams()).topMargin = max;
                rk0Var2.f27960e1 = true;
            }
            int totalWidth = this.f28866a.getTotalWidth();
            if (this.f28867b.getSwipeBack() != null) {
                viewGroup = this.f28867b.getSwipeBack();
            } else {
                viewGroup = this.f28867b;
            }
            View childAt = viewGroup.getChildAt(0);
            int dp = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
            int dp2 = AndroidUtilities.dp(36.0f) + AndroidUtilities.dp(16.0f) + dp;
            int hintTextWidth = this.f28866a.getHintTextWidth();
            if (hintTextWidth > dp2) {
                dp2 = hintTextWidth;
            } else if (dp2 > measuredWidth) {
                dp2 = measuredWidth;
            }
            this.f28866a.G = AndroidUtilities.dp(36.0f);
            if (this.f28866a.q()) {
                this.f28866a.getLayoutParams().width = totalWidth;
                this.f28866a.G = Math.max((totalWidth - childAt.getMeasuredWidth()) - AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
            } else if (totalWidth > dp2) {
                int dp3 = ((dp2 - AndroidUtilities.dp(16.0f)) / AndroidUtilities.dp(36.0f)) + 1;
                int dp4 = AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(36.0f) * dp3);
                if (AndroidUtilities.dp(24.0f) + hintTextWidth > dp4) {
                    dp4 = AndroidUtilities.dp(24.0f) + hintTextWidth;
                }
                if (dp4 <= totalWidth && dp3 != this.f28866a.getItemsCount()) {
                    totalWidth = dp4;
                }
                this.f28866a.getLayoutParams().width = totalWidth;
            } else {
                this.f28866a.getLayoutParams().width = -2;
            }
            if (this.f28866a.getMeasuredWidth() == measuredWidth && this.f28866a.q()) {
                float measuredWidth2 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                this.e = measuredWidth2;
                rk0 rk0Var3 = this.f28866a;
                int i20 = (int) (rk0Var3.G - measuredWidth2);
                rk0Var3.G = i20;
                if (i20 < AndroidUtilities.dp(36.0f)) {
                    this.e = 0.0f;
                    this.f28866a.G = AndroidUtilities.dp(36.0f);
                }
                b();
            } else {
                if (this.f28867b.getSwipeBack() != null) {
                    i13 = this.f28867b.getSwipeBack().getMeasuredWidth() - this.f28867b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                if (this.f28866a.getLayoutParams().width != -2 && this.f28866a.getLayoutParams().width + i13 > measuredWidth) {
                    i13 = AndroidUtilities.dp(8.0f) + (measuredWidth - this.f28866a.getLayoutParams().width);
                }
                if (i13 >= 0) {
                    i16 = i13;
                }
                ((LinearLayout.LayoutParams) this.f28866a.getLayoutParams()).rightMargin = i16;
                this.e = 0.0f;
                b();
            }
            if (this.f28868c != null) {
                if (this.f28866a.q()) {
                    this.f28868c.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                    b();
                } else {
                    this.f28868c.getLayoutParams().width = -1;
                }
                if (this.f28867b.getSwipeBack() != null) {
                    ((LinearLayout.LayoutParams) this.f28868c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f) + i16;
                } else {
                    ((LinearLayout.LayoutParams) this.f28868c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f);
                }
            }
            super.onMeasure(i14, i12);
        } else {
            super.onMeasure(i14, i12);
        }
        this.d = getMeasuredHeight();
    }

    public void setExpandSize(float f7) {
        this.f28867b.setTranslationY(f7);
        this.f28870n = f7;
        a();
    }

    public void setMaxHeight(int i10) {
        this.d = i10;
    }

    public void setPopupAlpha(float f7) {
        this.f28867b.setAlpha(f7);
        FrameLayout frameLayout = this.f28868c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f28867b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new w2(10, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            gh0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.f24509x.add(new fh0() {
                @Override
                public final void a(float f7, float f10) {
                    uo uoVar = uo.this;
                    FrameLayout frameLayout = uoVar.f28868c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f10);
                    }
                    uoVar.f28869f = f10;
                    uoVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(rk0 rk0Var) {
        this.f28866a = rk0Var;
        if (rk0Var != null) {
            rk0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f7) {
        this.f28867b.setReactionsTransitionProgress(f7);
        FrameLayout frameLayout = this.f28868c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
            float f10 = (f7 * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.f28868c;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.f28868c.setPivotY(0.0f);
            this.f28871r = (1.0f - f7) * (-this.f28867b.getMeasuredHeight());
            a();
            this.f28868c.setScaleX(f10);
            this.f28868c.setScaleY(f10);
        }
    }
}
