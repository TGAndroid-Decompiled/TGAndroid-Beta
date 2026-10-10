package org.telegram.ui.Components;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class ip extends LinearLayout {
    public ll0 f27420a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f27421b;
    public FrameLayout f27422c;
    public int d;
    public float f27423e;
    public float f27424f;
    public float h;
    public float f27425n;
    public float f27426r;

    public final void a() {
        FrameLayout frameLayout = this.f27422c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.f27425n + this.f27426r);
        }
    }

    public final void b() {
        float f7 = (1.0f - this.f27424f) * this.f27423e;
        this.f27421b.setTranslationX(f7);
        FrameLayout frameLayout = this.f27422c;
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
        ll0 ll0Var;
        int i14 = i10;
        int i15 = this.d;
        if (i15 != 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
        } else {
            i12 = i11;
        }
        ll0 ll0Var2 = this.f27420a;
        if (ll0Var2 != null && this.f27421b != null) {
            ll0Var2.getLayoutParams().width = -2;
            int i16 = 0;
            ((LinearLayout.LayoutParams) this.f27420a.getLayoutParams()).rightMargin = 0;
            this.f27423e = 0.0f;
            super.onMeasure(i14, i12);
            int measuredWidth = this.f27420a.getMeasuredWidth();
            if (this.f27421b.getSwipeBack() != null && this.f27421b.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f27421b.getSwipeBack().getMeasuredWidth();
            }
            if (this.f27421b.getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f27421b.getMeasuredWidth();
            }
            if (this.f27420a.q()) {
                i14 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            }
            ll0 ll0Var3 = this.f27420a;
            if (!ll0Var3.f28392e1 && ll0Var3.Q0 && ll0Var3.getMeasuredWidth() > 0) {
                int min = Math.min(AndroidUtilities.dp(320.0f), ll0Var3.getMeasuredWidth() - AndroidUtilities.dp(16.0f));
                StaticLayout staticLayout = new StaticLayout(ll0Var3.R0.getText(), ll0Var3.R0.getPaint(), min, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                ll0Var3.T0 = staticLayout.getHeight();
                ll0Var3.S0 = 0;
                for (int i17 = 0; i17 < staticLayout.getLineCount(); i17++) {
                    ll0Var3.S0 = Math.max(ll0Var3.S0, (int) Math.ceil(staticLayout.getLineWidth(i17)));
                }
                if (staticLayout.getLineCount() > 1 && !ll0Var3.R0.getText().toString().contains("\n")) {
                    int a2 = ci.d4.a(ll0Var3.R0.getText(), ll0Var3.R0.getPaint());
                    StaticLayout staticLayout2 = new StaticLayout(ll0Var3.R0.getText(), ll0Var3.R0.getPaint(), a2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    ll0Var3.T0 = staticLayout2.getHeight();
                    ll0Var3.S0 = 0;
                    for (int i18 = 0; i18 < staticLayout2.getLineCount(); i18++) {
                        ll0Var3.S0 = Math.max(ll0Var3.S0, (int) Math.ceil(staticLayout2.getLineWidth(i18)));
                    }
                    ll0Var3.R0.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                    ll0Var3.R0.setWidth(AndroidUtilities.dp(48.0f) + a2);
                } else {
                    ll0Var3.R0.setWidth(AndroidUtilities.dp(16.0f) + min);
                }
                int max = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(7.0f) + ll0Var3.T0);
                int i19 = ll0Var3.M0;
                if (i19 != 1 && i19 != 2) {
                    ll0Var3.getLayoutParams().height = AndroidUtilities.dp(22.0f) + AndroidUtilities.dp(52.0f) + max;
                } else {
                    max = AndroidUtilities.dp(20.0f);
                }
                ((FrameLayout.LayoutParams) ll0Var3.f28424z0.getLayoutParams()).topMargin = max;
                ((FrameLayout.LayoutParams) ll0Var3.f28382b.getLayoutParams()).topMargin = max;
                ll0Var3.f28392e1 = true;
            }
            int totalWidth = this.f27420a.getTotalWidth();
            if (this.f27421b.getSwipeBack() != null) {
                viewGroup = this.f27421b.getSwipeBack();
            } else {
                viewGroup = this.f27421b;
            }
            View childAt = viewGroup.getChildAt(0);
            int dp = AndroidUtilities.dp(36.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
            int hintTextWidth = this.f27420a.getHintTextWidth();
            if (hintTextWidth > dp) {
                dp = hintTextWidth;
            } else if (dp > measuredWidth) {
                dp = measuredWidth;
            }
            this.f27420a.G = AndroidUtilities.dp(36.0f);
            if (this.f27420a.q()) {
                this.f27420a.getLayoutParams().width = totalWidth;
                this.f27420a.G = Math.max((totalWidth - childAt.getMeasuredWidth()) - AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
            } else if (totalWidth > dp) {
                int dp2 = ((dp - AndroidUtilities.dp(16.0f)) / AndroidUtilities.dp(36.0f)) + 1;
                int dp3 = AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(36.0f) * dp2);
                if (AndroidUtilities.dp(24.0f) + hintTextWidth > dp3) {
                    dp3 = AndroidUtilities.dp(24.0f) + hintTextWidth;
                }
                if (dp3 <= totalWidth && dp2 != this.f27420a.getItemsCount()) {
                    totalWidth = dp3;
                }
                this.f27420a.getLayoutParams().width = totalWidth;
            } else {
                this.f27420a.getLayoutParams().width = -2;
            }
            if (this.f27420a.getMeasuredWidth() == measuredWidth && this.f27420a.q()) {
                float measuredWidth2 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                this.f27423e = measuredWidth2;
                int i20 = (int) (ll0Var.G - measuredWidth2);
                this.f27420a.G = i20;
                if (i20 < AndroidUtilities.dp(36.0f)) {
                    this.f27423e = 0.0f;
                    this.f27420a.G = AndroidUtilities.dp(36.0f);
                }
                b();
            } else {
                if (this.f27421b.getSwipeBack() != null) {
                    i13 = this.f27421b.getSwipeBack().getMeasuredWidth() - this.f27421b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                if (this.f27420a.getLayoutParams().width != -2 && this.f27420a.getLayoutParams().width + i13 > measuredWidth) {
                    i13 = AndroidUtilities.dp(8.0f) + (measuredWidth - this.f27420a.getLayoutParams().width);
                }
                if (i13 >= 0) {
                    i16 = i13;
                }
                ((LinearLayout.LayoutParams) this.f27420a.getLayoutParams()).rightMargin = i16;
                this.f27423e = 0.0f;
                b();
            }
            if (this.f27422c != null) {
                if (this.f27420a.q()) {
                    this.f27422c.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                    b();
                } else {
                    this.f27422c.getLayoutParams().width = -1;
                }
                if (this.f27421b.getSwipeBack() != null) {
                    ((LinearLayout.LayoutParams) this.f27422c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f) + i16;
                } else {
                    ((LinearLayout.LayoutParams) this.f27422c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f);
                }
            }
            super.onMeasure(i14, i12);
        } else {
            super.onMeasure(i14, i12);
        }
        this.d = getMeasuredHeight();
    }

    public void setExpandSize(float f7) {
        this.f27421b.setTranslationY(f7);
        this.f27425n = f7;
        a();
    }

    public void setMaxHeight(int i10) {
        this.d = i10;
    }

    public void setPopupAlpha(float f7) {
        this.f27421b.setAlpha(f7);
        FrameLayout frameLayout = this.f27422c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f27421b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new y2(10, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            yh0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.f33215x.add(new xh0() {
                @Override
                public final void a(float f7, float f10) {
                    ip ipVar = ip.this;
                    FrameLayout frameLayout = ipVar.f27422c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f10);
                    }
                    ipVar.f27424f = f10;
                    ipVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(ll0 ll0Var) {
        this.f27420a = ll0Var;
        if (ll0Var != null) {
            ll0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f7) {
        this.f27421b.setReactionsTransitionProgress(f7);
        FrameLayout frameLayout = this.f27422c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
            float f10 = (f7 * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.f27422c;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.f27422c.setPivotY(0.0f);
            this.f27426r = (1.0f - f7) * (-this.f27421b.getMeasuredHeight());
            a();
            this.f27422c.setScaleX(f10);
            this.f27422c.setScaleY(f10);
        }
    }
}
