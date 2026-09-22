package org.telegram.ui.Components;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class so extends LinearLayout {
    public sk0 f28281a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f28282b;
    public FrameLayout f28283c;
    public int d;
    public float e;
    public float f28284f;
    public float h;
    public float f28285n;
    public float f28286r;

    public final void a() {
        FrameLayout frameLayout = this.f28283c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.f28285n + this.f28286r);
        }
    }

    public final void b() {
        float f7 = (1.0f - this.f28284f) * this.e;
        this.f28282b.setTranslationX(f7);
        FrameLayout frameLayout = this.f28283c;
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
        sk0 sk0Var = this.f28281a;
        if (sk0Var != null && this.f28282b != null) {
            sk0Var.getLayoutParams().width = -2;
            int i16 = 0;
            ((LinearLayout.LayoutParams) this.f28281a.getLayoutParams()).rightMargin = 0;
            this.e = 0.0f;
            super.onMeasure(i14, i12);
            int measuredWidth = this.f28281a.getMeasuredWidth();
            if (this.f28282b.getSwipeBack() != null && this.f28282b.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f28282b.getSwipeBack().getMeasuredWidth();
            }
            if (this.f28282b.getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f28282b.getMeasuredWidth();
            }
            if (this.f28281a.q()) {
                i14 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            }
            sk0 sk0Var2 = this.f28281a;
            if (!sk0Var2.f28238e1 && sk0Var2.Q0 && sk0Var2.getMeasuredWidth() > 0) {
                int min = Math.min(AndroidUtilities.dp(320.0f), sk0Var2.getMeasuredWidth() - AndroidUtilities.dp(16.0f));
                StaticLayout staticLayout = new StaticLayout(sk0Var2.R0.getText(), sk0Var2.R0.getPaint(), min, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                sk0Var2.T0 = staticLayout.getHeight();
                sk0Var2.S0 = 0;
                for (int i17 = 0; i17 < staticLayout.getLineCount(); i17++) {
                    sk0Var2.S0 = Math.max(sk0Var2.S0, (int) Math.ceil(staticLayout.getLineWidth(i17)));
                }
                if (staticLayout.getLineCount() > 1 && !sk0Var2.R0.getText().toString().contains("\n")) {
                    int a2 = ci.f4.a(sk0Var2.R0.getText(), sk0Var2.R0.getPaint());
                    StaticLayout staticLayout2 = new StaticLayout(sk0Var2.R0.getText(), sk0Var2.R0.getPaint(), a2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    sk0Var2.T0 = staticLayout2.getHeight();
                    sk0Var2.S0 = 0;
                    for (int i18 = 0; i18 < staticLayout2.getLineCount(); i18++) {
                        sk0Var2.S0 = Math.max(sk0Var2.S0, (int) Math.ceil(staticLayout2.getLineWidth(i18)));
                    }
                    sk0Var2.R0.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                    sk0Var2.R0.setWidth(AndroidUtilities.dp(48.0f) + a2);
                } else {
                    sk0Var2.R0.setWidth(AndroidUtilities.dp(16.0f) + min);
                }
                int max = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(7.0f) + sk0Var2.T0);
                int i19 = sk0Var2.M0;
                if (i19 != 1 && i19 != 2) {
                    sk0Var2.getLayoutParams().height = AndroidUtilities.dp(22.0f) + AndroidUtilities.dp(52.0f) + max;
                } else {
                    max = AndroidUtilities.dp(20.0f);
                }
                ((FrameLayout.LayoutParams) sk0Var2.f28270z0.getLayoutParams()).topMargin = max;
                ((FrameLayout.LayoutParams) sk0Var2.f28229b.getLayoutParams()).topMargin = max;
                sk0Var2.f28238e1 = true;
            }
            int totalWidth = this.f28281a.getTotalWidth();
            if (this.f28282b.getSwipeBack() != null) {
                viewGroup = this.f28282b.getSwipeBack();
            } else {
                viewGroup = this.f28282b;
            }
            View childAt = viewGroup.getChildAt(0);
            int dp = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
            int dp2 = AndroidUtilities.dp(36.0f) + AndroidUtilities.dp(16.0f) + dp;
            int hintTextWidth = this.f28281a.getHintTextWidth();
            if (hintTextWidth > dp2) {
                dp2 = hintTextWidth;
            } else if (dp2 > measuredWidth) {
                dp2 = measuredWidth;
            }
            this.f28281a.G = AndroidUtilities.dp(36.0f);
            if (this.f28281a.q()) {
                this.f28281a.getLayoutParams().width = totalWidth;
                this.f28281a.G = Math.max((totalWidth - childAt.getMeasuredWidth()) - AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
            } else if (totalWidth > dp2) {
                int dp3 = ((dp2 - AndroidUtilities.dp(16.0f)) / AndroidUtilities.dp(36.0f)) + 1;
                int dp4 = AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(36.0f) * dp3);
                if (AndroidUtilities.dp(24.0f) + hintTextWidth > dp4) {
                    dp4 = AndroidUtilities.dp(24.0f) + hintTextWidth;
                }
                if (dp4 <= totalWidth && dp3 != this.f28281a.getItemsCount()) {
                    totalWidth = dp4;
                }
                this.f28281a.getLayoutParams().width = totalWidth;
            } else {
                this.f28281a.getLayoutParams().width = -2;
            }
            if (this.f28281a.getMeasuredWidth() == measuredWidth && this.f28281a.q()) {
                float measuredWidth2 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                this.e = measuredWidth2;
                sk0 sk0Var3 = this.f28281a;
                int i20 = (int) (sk0Var3.G - measuredWidth2);
                sk0Var3.G = i20;
                if (i20 < AndroidUtilities.dp(36.0f)) {
                    this.e = 0.0f;
                    this.f28281a.G = AndroidUtilities.dp(36.0f);
                }
                b();
            } else {
                if (this.f28282b.getSwipeBack() != null) {
                    i13 = this.f28282b.getSwipeBack().getMeasuredWidth() - this.f28282b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                if (this.f28281a.getLayoutParams().width != -2 && this.f28281a.getLayoutParams().width + i13 > measuredWidth) {
                    i13 = AndroidUtilities.dp(8.0f) + (measuredWidth - this.f28281a.getLayoutParams().width);
                }
                if (i13 >= 0) {
                    i16 = i13;
                }
                ((LinearLayout.LayoutParams) this.f28281a.getLayoutParams()).rightMargin = i16;
                this.e = 0.0f;
                b();
            }
            if (this.f28283c != null) {
                if (this.f28281a.q()) {
                    this.f28283c.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                    b();
                } else {
                    this.f28283c.getLayoutParams().width = -1;
                }
                if (this.f28282b.getSwipeBack() != null) {
                    ((LinearLayout.LayoutParams) this.f28283c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f) + i16;
                } else {
                    ((LinearLayout.LayoutParams) this.f28283c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f);
                }
            }
            super.onMeasure(i14, i12);
        } else {
            super.onMeasure(i14, i12);
        }
        this.d = getMeasuredHeight();
    }

    public void setExpandSize(float f7) {
        this.f28282b.setTranslationY(f7);
        this.f28285n = f7;
        a();
    }

    public void setMaxHeight(int i10) {
        this.d = i10;
    }

    public void setPopupAlpha(float f7) {
        this.f28282b.setAlpha(f7);
        FrameLayout frameLayout = this.f28283c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f28282b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new a3(9, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            hh0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.f24835x.add(new gh0() {
                @Override
                public final void a(float f7, float f10) {
                    so soVar = so.this;
                    FrameLayout frameLayout = soVar.f28283c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f10);
                    }
                    soVar.f28284f = f10;
                    soVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(sk0 sk0Var) {
        this.f28281a = sk0Var;
        if (sk0Var != null) {
            sk0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f7) {
        this.f28282b.setReactionsTransitionProgress(f7);
        FrameLayout frameLayout = this.f28283c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
            float f10 = (f7 * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.f28283c;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.f28283c.setPivotY(0.0f);
            this.f28286r = (1.0f - f7) * (-this.f28282b.getMeasuredHeight());
            a();
            this.f28283c.setScaleX(f10);
            this.f28283c.setScaleY(f10);
        }
    }
}
