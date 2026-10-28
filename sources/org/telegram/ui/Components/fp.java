package org.telegram.ui.Components;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class fp extends LinearLayout {
    public gl0 f28234a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f28235b;
    public FrameLayout f28236c;
    public int d;
    public float e;
    public float f28237f;
    public float h;
    public float f28238n;
    public float f28239r;

    public final void a() {
        FrameLayout frameLayout = this.f28236c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.f28238n + this.f28239r);
        }
    }

    public final void b() {
        float f7 = (1.0f - this.f28237f) * this.e;
        this.f28235b.setTranslationX(f7);
        FrameLayout frameLayout = this.f28236c;
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
        gl0 gl0Var;
        int i14 = i10;
        int i15 = this.d;
        if (i15 != 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
        } else {
            i12 = i11;
        }
        gl0 gl0Var2 = this.f28234a;
        if (gl0Var2 != null && this.f28235b != null) {
            gl0Var2.getLayoutParams().width = -2;
            int i16 = 0;
            ((LinearLayout.LayoutParams) this.f28234a.getLayoutParams()).rightMargin = 0;
            this.e = 0.0f;
            super.onMeasure(i14, i12);
            int measuredWidth = this.f28234a.getMeasuredWidth();
            if (this.f28235b.getSwipeBack() != null && this.f28235b.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f28235b.getSwipeBack().getMeasuredWidth();
            }
            if (this.f28235b.getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f28235b.getMeasuredWidth();
            }
            if (this.f28234a.q()) {
                i14 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            }
            gl0 gl0Var3 = this.f28234a;
            if (!gl0Var3.f28621f1 && gl0Var3.Q0 && gl0Var3.getMeasuredWidth() > 0) {
                int g7 = org.telegram.ui.d3.g(16.0f, gl0Var3.getMeasuredWidth(), AndroidUtilities.dp(320.0f));
                StaticLayout staticLayout = new StaticLayout(gl0Var3.R0.getText(), gl0Var3.R0.getPaint(), g7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                gl0Var3.T0 = staticLayout.getHeight();
                gl0Var3.S0 = 0;
                for (int i17 = 0; i17 < staticLayout.getLineCount(); i17++) {
                    gl0Var3.S0 = Math.max(gl0Var3.S0, (int) Math.ceil(staticLayout.getLineWidth(i17)));
                }
                if (staticLayout.getLineCount() > 1 && !gl0Var3.R0.getText().toString().contains("\n")) {
                    int a2 = fi.v3.a(gl0Var3.R0.getText(), gl0Var3.R0.getPaint());
                    StaticLayout staticLayout2 = new StaticLayout(gl0Var3.R0.getText(), gl0Var3.R0.getPaint(), a2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    gl0Var3.T0 = staticLayout2.getHeight();
                    gl0Var3.S0 = 0;
                    for (int i18 = 0; i18 < staticLayout2.getLineCount(); i18++) {
                        gl0Var3.S0 = Math.max(gl0Var3.S0, (int) Math.ceil(staticLayout2.getLineWidth(i18)));
                    }
                    gl0Var3.R0.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                    gl0Var3.R0.setWidth(AndroidUtilities.dp(48.0f) + a2);
                } else {
                    gl0Var3.R0.setWidth(AndroidUtilities.dp(16.0f) + g7);
                }
                int max = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(7.0f) + gl0Var3.T0);
                int i19 = gl0Var3.M0;
                if (i19 != 1 && i19 != 2) {
                    gl0Var3.getLayoutParams().height = AndroidUtilities.dp(22.0f) + AndroidUtilities.dp(52.0f) + max;
                } else {
                    max = AndroidUtilities.dp(20.0f);
                }
                ((FrameLayout.LayoutParams) gl0Var3.f28651z0.getLayoutParams()).topMargin = max;
                ((FrameLayout.LayoutParams) gl0Var3.f28609b.getLayoutParams()).topMargin = max;
                gl0Var3.f28621f1 = true;
            }
            int totalWidth = this.f28234a.getTotalWidth();
            if (this.f28235b.getSwipeBack() != null) {
                viewGroup = this.f28235b.getSwipeBack();
            } else {
                viewGroup = this.f28235b;
            }
            View childAt = viewGroup.getChildAt(0);
            int dp = AndroidUtilities.dp(36.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
            int hintTextWidth = this.f28234a.getHintTextWidth();
            if (hintTextWidth > dp) {
                dp = hintTextWidth;
            } else if (dp > measuredWidth) {
                dp = measuredWidth;
            }
            this.f28234a.G = AndroidUtilities.dp(36.0f);
            if (this.f28234a.q()) {
                this.f28234a.getLayoutParams().width = totalWidth;
                this.f28234a.G = Math.max((totalWidth - childAt.getMeasuredWidth()) - AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
            } else if (totalWidth > dp) {
                int dp2 = ((dp - AndroidUtilities.dp(16.0f)) / AndroidUtilities.dp(36.0f)) + 1;
                int dp3 = AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(36.0f) * dp2);
                if (AndroidUtilities.dp(24.0f) + hintTextWidth > dp3) {
                    dp3 = AndroidUtilities.dp(24.0f) + hintTextWidth;
                }
                if (dp3 <= totalWidth && dp2 != this.f28234a.getItemsCount()) {
                    totalWidth = dp3;
                }
                this.f28234a.getLayoutParams().width = totalWidth;
            } else {
                this.f28234a.getLayoutParams().width = -2;
            }
            if (this.f28234a.getMeasuredWidth() == measuredWidth && this.f28234a.q()) {
                float measuredWidth2 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                this.e = measuredWidth2;
                int i20 = (int) (gl0Var.G - measuredWidth2);
                this.f28234a.G = i20;
                if (i20 < AndroidUtilities.dp(36.0f)) {
                    this.e = 0.0f;
                    this.f28234a.G = AndroidUtilities.dp(36.0f);
                }
                b();
            } else {
                if (this.f28235b.getSwipeBack() != null) {
                    i13 = this.f28235b.getSwipeBack().getMeasuredWidth() - this.f28235b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                if (this.f28234a.getLayoutParams().width != -2 && this.f28234a.getLayoutParams().width + i13 > measuredWidth) {
                    i13 = AndroidUtilities.dp(8.0f) + (measuredWidth - this.f28234a.getLayoutParams().width);
                }
                if (i13 >= 0) {
                    i16 = i13;
                }
                ((LinearLayout.LayoutParams) this.f28234a.getLayoutParams()).rightMargin = i16;
                this.e = 0.0f;
                b();
            }
            if (this.f28236c != null) {
                if (this.f28234a.q()) {
                    this.f28236c.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                    b();
                } else {
                    this.f28236c.getLayoutParams().width = -1;
                }
                if (this.f28235b.getSwipeBack() != null) {
                    ((LinearLayout.LayoutParams) this.f28236c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f) + i16;
                } else {
                    ((LinearLayout.LayoutParams) this.f28236c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f);
                }
            }
            super.onMeasure(i14, i12);
        } else {
            super.onMeasure(i14, i12);
        }
        this.d = getMeasuredHeight();
    }

    public void setExpandSize(float f7) {
        this.f28235b.setTranslationY(f7);
        this.f28238n = f7;
        a();
    }

    public void setMaxHeight(int i10) {
        this.d = i10;
    }

    public void setPopupAlpha(float f7) {
        this.f28235b.setAlpha(f7);
        FrameLayout frameLayout = this.f28236c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f28235b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new p1(18, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            th0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.f32971x.add(new sh0() {
                @Override
                public final void a(float f7, float f10) {
                    fp fpVar = fp.this;
                    FrameLayout frameLayout = fpVar.f28236c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f10);
                    }
                    fpVar.f28237f = f10;
                    fpVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(gl0 gl0Var) {
        this.f28234a = gl0Var;
        if (gl0Var != null) {
            gl0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f7) {
        this.f28235b.setReactionsTransitionProgress(f7);
        FrameLayout frameLayout = this.f28236c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
            float f10 = (f7 * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.f28236c;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.f28236c.setPivotY(0.0f);
            this.f28239r = (1.0f - f7) * (-this.f28235b.getMeasuredHeight());
            a();
            this.f28236c.setScaleX(f10);
            this.f28236c.setScaleY(f10);
        }
    }
}
