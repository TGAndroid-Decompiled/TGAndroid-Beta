package org.telegram.ui.Components;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class kp extends LinearLayout {
    public nl0 f27904a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f27905b;
    public FrameLayout f27906c;
    public int d;
    public float f27907e;
    public float f27908f;
    public float h;
    public float f27909n;
    public float f27910r;

    public final void a() {
        FrameLayout frameLayout = this.f27906c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.f27909n + this.f27910r);
        }
    }

    public final void b() {
        float f7 = (1.0f - this.f27908f) * this.f27907e;
        this.f27905b.setTranslationX(f7);
        FrameLayout frameLayout = this.f27906c;
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
        nl0 nl0Var;
        int i14 = i10;
        int i15 = this.d;
        if (i15 != 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
        } else {
            i12 = i11;
        }
        nl0 nl0Var2 = this.f27904a;
        if (nl0Var2 != null && this.f27905b != null) {
            nl0Var2.getLayoutParams().width = -2;
            int i16 = 0;
            ((LinearLayout.LayoutParams) this.f27904a.getLayoutParams()).rightMargin = 0;
            this.f27907e = 0.0f;
            super.onMeasure(i14, i12);
            int measuredWidth = this.f27904a.getMeasuredWidth();
            if (this.f27905b.getSwipeBack() != null && this.f27905b.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f27905b.getSwipeBack().getMeasuredWidth();
            }
            if (this.f27905b.getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f27905b.getMeasuredWidth();
            }
            if (this.f27904a.q()) {
                i14 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            }
            nl0 nl0Var3 = this.f27904a;
            if (!nl0Var3.f28833e1 && nl0Var3.Q0 && nl0Var3.getMeasuredWidth() > 0) {
                int min = Math.min(AndroidUtilities.dp(320.0f), nl0Var3.getMeasuredWidth() - AndroidUtilities.dp(16.0f));
                StaticLayout staticLayout = new StaticLayout(nl0Var3.R0.getText(), nl0Var3.R0.getPaint(), min, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                nl0Var3.T0 = staticLayout.getHeight();
                nl0Var3.S0 = 0;
                for (int i17 = 0; i17 < staticLayout.getLineCount(); i17++) {
                    nl0Var3.S0 = Math.max(nl0Var3.S0, (int) Math.ceil(staticLayout.getLineWidth(i17)));
                }
                if (staticLayout.getLineCount() > 1 && !nl0Var3.R0.getText().toString().contains("\n")) {
                    int a2 = ci.d4.a(nl0Var3.R0.getText(), nl0Var3.R0.getPaint());
                    StaticLayout staticLayout2 = new StaticLayout(nl0Var3.R0.getText(), nl0Var3.R0.getPaint(), a2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    nl0Var3.T0 = staticLayout2.getHeight();
                    nl0Var3.S0 = 0;
                    for (int i18 = 0; i18 < staticLayout2.getLineCount(); i18++) {
                        nl0Var3.S0 = Math.max(nl0Var3.S0, (int) Math.ceil(staticLayout2.getLineWidth(i18)));
                    }
                    nl0Var3.R0.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                    nl0Var3.R0.setWidth(AndroidUtilities.dp(48.0f) + a2);
                } else {
                    nl0Var3.R0.setWidth(AndroidUtilities.dp(16.0f) + min);
                }
                int max = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(7.0f) + nl0Var3.T0);
                int i19 = nl0Var3.M0;
                if (i19 != 1 && i19 != 2) {
                    nl0Var3.getLayoutParams().height = AndroidUtilities.dp(22.0f) + AndroidUtilities.dp(52.0f) + max;
                } else {
                    max = AndroidUtilities.dp(20.0f);
                }
                ((FrameLayout.LayoutParams) nl0Var3.f28865z0.getLayoutParams()).topMargin = max;
                ((FrameLayout.LayoutParams) nl0Var3.f28823b.getLayoutParams()).topMargin = max;
                nl0Var3.f28833e1 = true;
            }
            int totalWidth = this.f27904a.getTotalWidth();
            if (this.f27905b.getSwipeBack() != null) {
                viewGroup = this.f27905b.getSwipeBack();
            } else {
                viewGroup = this.f27905b;
            }
            View childAt = viewGroup.getChildAt(0);
            int dp = AndroidUtilities.dp(36.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
            int hintTextWidth = this.f27904a.getHintTextWidth();
            if (hintTextWidth > dp) {
                dp = hintTextWidth;
            } else if (dp > measuredWidth) {
                dp = measuredWidth;
            }
            this.f27904a.G = AndroidUtilities.dp(36.0f);
            if (this.f27904a.q()) {
                this.f27904a.getLayoutParams().width = totalWidth;
                this.f27904a.G = Math.max((totalWidth - childAt.getMeasuredWidth()) - AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
            } else if (totalWidth > dp) {
                int dp2 = ((dp - AndroidUtilities.dp(16.0f)) / AndroidUtilities.dp(36.0f)) + 1;
                int dp3 = AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(36.0f) * dp2);
                if (AndroidUtilities.dp(24.0f) + hintTextWidth > dp3) {
                    dp3 = AndroidUtilities.dp(24.0f) + hintTextWidth;
                }
                if (dp3 <= totalWidth && dp2 != this.f27904a.getItemsCount()) {
                    totalWidth = dp3;
                }
                this.f27904a.getLayoutParams().width = totalWidth;
            } else {
                this.f27904a.getLayoutParams().width = -2;
            }
            if (this.f27904a.getMeasuredWidth() == measuredWidth && this.f27904a.q()) {
                float measuredWidth2 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                this.f27907e = measuredWidth2;
                int i20 = (int) (nl0Var.G - measuredWidth2);
                this.f27904a.G = i20;
                if (i20 < AndroidUtilities.dp(36.0f)) {
                    this.f27907e = 0.0f;
                    this.f27904a.G = AndroidUtilities.dp(36.0f);
                }
                b();
            } else {
                if (this.f27905b.getSwipeBack() != null) {
                    i13 = this.f27905b.getSwipeBack().getMeasuredWidth() - this.f27905b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                if (this.f27904a.getLayoutParams().width != -2 && this.f27904a.getLayoutParams().width + i13 > measuredWidth) {
                    i13 = AndroidUtilities.dp(8.0f) + (measuredWidth - this.f27904a.getLayoutParams().width);
                }
                if (i13 >= 0) {
                    i16 = i13;
                }
                ((LinearLayout.LayoutParams) this.f27904a.getLayoutParams()).rightMargin = i16;
                this.f27907e = 0.0f;
                b();
            }
            if (this.f27906c != null) {
                if (this.f27904a.q()) {
                    this.f27906c.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                    b();
                } else {
                    this.f27906c.getLayoutParams().width = -1;
                }
                if (this.f27905b.getSwipeBack() != null) {
                    ((LinearLayout.LayoutParams) this.f27906c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f) + i16;
                } else {
                    ((LinearLayout.LayoutParams) this.f27906c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f);
                }
            }
            super.onMeasure(i14, i12);
        } else {
            super.onMeasure(i14, i12);
        }
        this.d = getMeasuredHeight();
    }

    public void setExpandSize(float f7) {
        this.f27905b.setTranslationY(f7);
        this.f27909n = f7;
        a();
    }

    public void setMaxHeight(int i10) {
        this.d = i10;
    }

    public void setPopupAlpha(float f7) {
        this.f27905b.setAlpha(f7);
        FrameLayout frameLayout = this.f27906c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f27905b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new y2(10, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            bi0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.f24667x.add(new ai0() {
                @Override
                public final void a(float f7, float f10) {
                    kp kpVar = kp.this;
                    FrameLayout frameLayout = kpVar.f27906c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f10);
                    }
                    kpVar.f27908f = f10;
                    kpVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(nl0 nl0Var) {
        this.f27904a = nl0Var;
        if (nl0Var != null) {
            nl0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f7) {
        this.f27905b.setReactionsTransitionProgress(f7);
        FrameLayout frameLayout = this.f27906c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
            float f10 = (f7 * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.f27906c;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.f27906c.setPivotY(0.0f);
            this.f27910r = (1.0f - f7) * (-this.f27905b.getMeasuredHeight());
            a();
            this.f27906c.setScaleX(f10);
            this.f27906c.setScaleY(f10);
        }
    }
}
