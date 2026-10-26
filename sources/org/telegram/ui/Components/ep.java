package org.telegram.ui.Components;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class ep extends LinearLayout {
    public fl0 f27926a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f27927b;
    public FrameLayout f27928c;
    public int d;
    public float e;
    public float f27929f;
    public float h;
    public float f27930n;
    public float f27931r;

    public final void a() {
        FrameLayout frameLayout = this.f27928c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.f27930n + this.f27931r);
        }
    }

    public final void b() {
        float f7 = (1.0f - this.f27929f) * this.e;
        this.f27927b.setTranslationX(f7);
        FrameLayout frameLayout = this.f27928c;
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
        fl0 fl0Var;
        int i14 = i10;
        int i15 = this.d;
        if (i15 != 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
        } else {
            i12 = i11;
        }
        fl0 fl0Var2 = this.f27926a;
        if (fl0Var2 != null && this.f27927b != null) {
            fl0Var2.getLayoutParams().width = -2;
            int i16 = 0;
            ((LinearLayout.LayoutParams) this.f27926a.getLayoutParams()).rightMargin = 0;
            this.e = 0.0f;
            super.onMeasure(i14, i12);
            int measuredWidth = this.f27926a.getMeasuredWidth();
            if (this.f27927b.getSwipeBack() != null && this.f27927b.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f27927b.getSwipeBack().getMeasuredWidth();
            }
            if (this.f27927b.getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f27927b.getMeasuredWidth();
            }
            if (this.f27926a.q()) {
                i14 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            }
            fl0 fl0Var3 = this.f27926a;
            if (!fl0Var3.f28243f1 && fl0Var3.Q0 && fl0Var3.getMeasuredWidth() > 0) {
                int g7 = org.telegram.ui.d3.g(16.0f, fl0Var3.getMeasuredWidth(), AndroidUtilities.dp(320.0f));
                StaticLayout staticLayout = new StaticLayout(fl0Var3.R0.getText(), fl0Var3.R0.getPaint(), g7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                fl0Var3.T0 = staticLayout.getHeight();
                fl0Var3.S0 = 0;
                for (int i17 = 0; i17 < staticLayout.getLineCount(); i17++) {
                    fl0Var3.S0 = Math.max(fl0Var3.S0, (int) Math.ceil(staticLayout.getLineWidth(i17)));
                }
                if (staticLayout.getLineCount() > 1 && !fl0Var3.R0.getText().toString().contains("\n")) {
                    int a2 = fi.v3.a(fl0Var3.R0.getText(), fl0Var3.R0.getPaint());
                    StaticLayout staticLayout2 = new StaticLayout(fl0Var3.R0.getText(), fl0Var3.R0.getPaint(), a2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    fl0Var3.T0 = staticLayout2.getHeight();
                    fl0Var3.S0 = 0;
                    for (int i18 = 0; i18 < staticLayout2.getLineCount(); i18++) {
                        fl0Var3.S0 = Math.max(fl0Var3.S0, (int) Math.ceil(staticLayout2.getLineWidth(i18)));
                    }
                    fl0Var3.R0.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                    fl0Var3.R0.setWidth(AndroidUtilities.dp(48.0f) + a2);
                } else {
                    fl0Var3.R0.setWidth(AndroidUtilities.dp(16.0f) + g7);
                }
                int max = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(7.0f) + fl0Var3.T0);
                int i19 = fl0Var3.M0;
                if (i19 != 1 && i19 != 2) {
                    fl0Var3.getLayoutParams().height = AndroidUtilities.dp(22.0f) + AndroidUtilities.dp(52.0f) + max;
                } else {
                    max = AndroidUtilities.dp(20.0f);
                }
                ((FrameLayout.LayoutParams) fl0Var3.f28273z0.getLayoutParams()).topMargin = max;
                ((FrameLayout.LayoutParams) fl0Var3.f28231b.getLayoutParams()).topMargin = max;
                fl0Var3.f28243f1 = true;
            }
            int totalWidth = this.f27926a.getTotalWidth();
            if (this.f27927b.getSwipeBack() != null) {
                viewGroup = this.f27927b.getSwipeBack();
            } else {
                viewGroup = this.f27927b;
            }
            View childAt = viewGroup.getChildAt(0);
            int dp = AndroidUtilities.dp(36.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
            int hintTextWidth = this.f27926a.getHintTextWidth();
            if (hintTextWidth > dp) {
                dp = hintTextWidth;
            } else if (dp > measuredWidth) {
                dp = measuredWidth;
            }
            this.f27926a.G = AndroidUtilities.dp(36.0f);
            if (this.f27926a.q()) {
                this.f27926a.getLayoutParams().width = totalWidth;
                this.f27926a.G = Math.max((totalWidth - childAt.getMeasuredWidth()) - AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
            } else if (totalWidth > dp) {
                int dp2 = ((dp - AndroidUtilities.dp(16.0f)) / AndroidUtilities.dp(36.0f)) + 1;
                int dp3 = AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(36.0f) * dp2);
                if (AndroidUtilities.dp(24.0f) + hintTextWidth > dp3) {
                    dp3 = AndroidUtilities.dp(24.0f) + hintTextWidth;
                }
                if (dp3 <= totalWidth && dp2 != this.f27926a.getItemsCount()) {
                    totalWidth = dp3;
                }
                this.f27926a.getLayoutParams().width = totalWidth;
            } else {
                this.f27926a.getLayoutParams().width = -2;
            }
            if (this.f27926a.getMeasuredWidth() == measuredWidth && this.f27926a.q()) {
                float measuredWidth2 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                this.e = measuredWidth2;
                int i20 = (int) (fl0Var.G - measuredWidth2);
                this.f27926a.G = i20;
                if (i20 < AndroidUtilities.dp(36.0f)) {
                    this.e = 0.0f;
                    this.f27926a.G = AndroidUtilities.dp(36.0f);
                }
                b();
            } else {
                if (this.f27927b.getSwipeBack() != null) {
                    i13 = this.f27927b.getSwipeBack().getMeasuredWidth() - this.f27927b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                if (this.f27926a.getLayoutParams().width != -2 && this.f27926a.getLayoutParams().width + i13 > measuredWidth) {
                    i13 = AndroidUtilities.dp(8.0f) + (measuredWidth - this.f27926a.getLayoutParams().width);
                }
                if (i13 >= 0) {
                    i16 = i13;
                }
                ((LinearLayout.LayoutParams) this.f27926a.getLayoutParams()).rightMargin = i16;
                this.e = 0.0f;
                b();
            }
            if (this.f27928c != null) {
                if (this.f27926a.q()) {
                    this.f27928c.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                    b();
                } else {
                    this.f27928c.getLayoutParams().width = -1;
                }
                if (this.f27927b.getSwipeBack() != null) {
                    ((LinearLayout.LayoutParams) this.f27928c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f) + i16;
                } else {
                    ((LinearLayout.LayoutParams) this.f27928c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f);
                }
            }
            super.onMeasure(i14, i12);
        } else {
            super.onMeasure(i14, i12);
        }
        this.d = getMeasuredHeight();
    }

    public void setExpandSize(float f7) {
        this.f27927b.setTranslationY(f7);
        this.f27930n = f7;
        a();
    }

    public void setMaxHeight(int i10) {
        this.d = i10;
    }

    public void setPopupAlpha(float f7) {
        this.f27927b.setAlpha(f7);
        FrameLayout frameLayout = this.f27928c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f27927b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new p1(18, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            sh0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.f32566x.add(new rh0() {
                @Override
                public final void a(float f7, float f10) {
                    ep epVar = ep.this;
                    FrameLayout frameLayout = epVar.f27928c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f10);
                    }
                    epVar.f27929f = f10;
                    epVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(fl0 fl0Var) {
        this.f27926a = fl0Var;
        if (fl0Var != null) {
            fl0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f7) {
        this.f27927b.setReactionsTransitionProgress(f7);
        FrameLayout frameLayout = this.f27928c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
            float f10 = (f7 * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.f27928c;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.f27928c.setPivotY(0.0f);
            this.f27931r = (1.0f - f7) * (-this.f27927b.getMeasuredHeight());
            a();
            this.f27928c.setScaleX(f10);
            this.f27928c.setScaleY(f10);
        }
    }
}
