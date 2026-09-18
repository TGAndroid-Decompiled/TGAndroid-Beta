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
    public qk0 f28203a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f28204b;
    public FrameLayout f28205c;
    public int d;
    public float e;
    public float f28206f;
    public float h;
    public float f28207n;
    public float f28208r;

    public final void a() {
        FrameLayout frameLayout = this.f28205c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.f28207n + this.f28208r);
        }
    }

    public final void b() {
        float f7 = (1.0f - this.f28206f) * this.e;
        this.f28204b.setTranslationX(f7);
        FrameLayout frameLayout = this.f28205c;
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
        qk0 qk0Var = this.f28203a;
        if (qk0Var != null && this.f28204b != null) {
            qk0Var.getLayoutParams().width = -2;
            int i16 = 0;
            ((LinearLayout.LayoutParams) this.f28203a.getLayoutParams()).rightMargin = 0;
            this.e = 0.0f;
            super.onMeasure(i14, i12);
            int measuredWidth = this.f28203a.getMeasuredWidth();
            if (this.f28204b.getSwipeBack() != null && this.f28204b.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f28204b.getSwipeBack().getMeasuredWidth();
            }
            if (this.f28204b.getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f28204b.getMeasuredWidth();
            }
            if (this.f28203a.q()) {
                i14 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            }
            qk0 qk0Var2 = this.f28203a;
            if (!qk0Var2.f27646e1 && qk0Var2.Q0 && qk0Var2.getMeasuredWidth() > 0) {
                int min = Math.min(AndroidUtilities.dp(320.0f), qk0Var2.getMeasuredWidth() - AndroidUtilities.dp(16.0f));
                StaticLayout staticLayout = new StaticLayout(qk0Var2.R0.getText(), qk0Var2.R0.getPaint(), min, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                qk0Var2.T0 = staticLayout.getHeight();
                qk0Var2.S0 = 0;
                for (int i17 = 0; i17 < staticLayout.getLineCount(); i17++) {
                    qk0Var2.S0 = Math.max(qk0Var2.S0, (int) Math.ceil(staticLayout.getLineWidth(i17)));
                }
                if (staticLayout.getLineCount() > 1 && !qk0Var2.R0.getText().toString().contains("\n")) {
                    int a2 = ci.f4.a(qk0Var2.R0.getText(), qk0Var2.R0.getPaint());
                    StaticLayout staticLayout2 = new StaticLayout(qk0Var2.R0.getText(), qk0Var2.R0.getPaint(), a2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    qk0Var2.T0 = staticLayout2.getHeight();
                    qk0Var2.S0 = 0;
                    for (int i18 = 0; i18 < staticLayout2.getLineCount(); i18++) {
                        qk0Var2.S0 = Math.max(qk0Var2.S0, (int) Math.ceil(staticLayout2.getLineWidth(i18)));
                    }
                    qk0Var2.R0.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                    qk0Var2.R0.setWidth(AndroidUtilities.dp(48.0f) + a2);
                } else {
                    qk0Var2.R0.setWidth(AndroidUtilities.dp(16.0f) + min);
                }
                int max = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(7.0f) + qk0Var2.T0);
                int i19 = qk0Var2.M0;
                if (i19 != 1 && i19 != 2) {
                    qk0Var2.getLayoutParams().height = AndroidUtilities.dp(22.0f) + AndroidUtilities.dp(52.0f) + max;
                } else {
                    max = AndroidUtilities.dp(20.0f);
                }
                ((FrameLayout.LayoutParams) qk0Var2.f27678z0.getLayoutParams()).topMargin = max;
                ((FrameLayout.LayoutParams) qk0Var2.f27637b.getLayoutParams()).topMargin = max;
                qk0Var2.f27646e1 = true;
            }
            int totalWidth = this.f28203a.getTotalWidth();
            if (this.f28204b.getSwipeBack() != null) {
                viewGroup = this.f28204b.getSwipeBack();
            } else {
                viewGroup = this.f28204b;
            }
            View childAt = viewGroup.getChildAt(0);
            int dp = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
            int dp2 = AndroidUtilities.dp(36.0f) + AndroidUtilities.dp(16.0f) + dp;
            int hintTextWidth = this.f28203a.getHintTextWidth();
            if (hintTextWidth > dp2) {
                dp2 = hintTextWidth;
            } else if (dp2 > measuredWidth) {
                dp2 = measuredWidth;
            }
            this.f28203a.G = AndroidUtilities.dp(36.0f);
            if (this.f28203a.q()) {
                this.f28203a.getLayoutParams().width = totalWidth;
                this.f28203a.G = Math.max((totalWidth - childAt.getMeasuredWidth()) - AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
            } else if (totalWidth > dp2) {
                int dp3 = ((dp2 - AndroidUtilities.dp(16.0f)) / AndroidUtilities.dp(36.0f)) + 1;
                int dp4 = AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(36.0f) * dp3);
                if (AndroidUtilities.dp(24.0f) + hintTextWidth > dp4) {
                    dp4 = AndroidUtilities.dp(24.0f) + hintTextWidth;
                }
                if (dp4 <= totalWidth && dp3 != this.f28203a.getItemsCount()) {
                    totalWidth = dp4;
                }
                this.f28203a.getLayoutParams().width = totalWidth;
            } else {
                this.f28203a.getLayoutParams().width = -2;
            }
            if (this.f28203a.getMeasuredWidth() == measuredWidth && this.f28203a.q()) {
                float measuredWidth2 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                this.e = measuredWidth2;
                qk0 qk0Var3 = this.f28203a;
                int i20 = (int) (qk0Var3.G - measuredWidth2);
                qk0Var3.G = i20;
                if (i20 < AndroidUtilities.dp(36.0f)) {
                    this.e = 0.0f;
                    this.f28203a.G = AndroidUtilities.dp(36.0f);
                }
                b();
            } else {
                if (this.f28204b.getSwipeBack() != null) {
                    i13 = this.f28204b.getSwipeBack().getMeasuredWidth() - this.f28204b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                if (this.f28203a.getLayoutParams().width != -2 && this.f28203a.getLayoutParams().width + i13 > measuredWidth) {
                    i13 = AndroidUtilities.dp(8.0f) + (measuredWidth - this.f28203a.getLayoutParams().width);
                }
                if (i13 >= 0) {
                    i16 = i13;
                }
                ((LinearLayout.LayoutParams) this.f28203a.getLayoutParams()).rightMargin = i16;
                this.e = 0.0f;
                b();
            }
            if (this.f28205c != null) {
                if (this.f28203a.q()) {
                    this.f28205c.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                    b();
                } else {
                    this.f28205c.getLayoutParams().width = -1;
                }
                if (this.f28204b.getSwipeBack() != null) {
                    ((LinearLayout.LayoutParams) this.f28205c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f) + i16;
                } else {
                    ((LinearLayout.LayoutParams) this.f28205c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f);
                }
            }
            super.onMeasure(i14, i12);
        } else {
            super.onMeasure(i14, i12);
        }
        this.d = getMeasuredHeight();
    }

    public void setExpandSize(float f7) {
        this.f28204b.setTranslationY(f7);
        this.f28207n = f7;
        a();
    }

    public void setMaxHeight(int i10) {
        this.d = i10;
    }

    public void setPopupAlpha(float f7) {
        this.f28204b.setAlpha(f7);
        FrameLayout frameLayout = this.f28205c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f28204b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new b3(9, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            fh0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.f24169x.add(new eh0() {
                @Override
                public final void a(float f7, float f10) {
                    so soVar = so.this;
                    FrameLayout frameLayout = soVar.f28205c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f10);
                    }
                    soVar.f28206f = f10;
                    soVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(qk0 qk0Var) {
        this.f28203a = qk0Var;
        if (qk0Var != null) {
            qk0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f7) {
        this.f28204b.setReactionsTransitionProgress(f7);
        FrameLayout frameLayout = this.f28205c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
            float f10 = (f7 * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.f28205c;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.f28205c.setPivotY(0.0f);
            this.f28208r = (1.0f - f7) * (-this.f28204b.getMeasuredHeight());
            a();
            this.f28205c.setScaleX(f10);
            this.f28205c.setScaleY(f10);
        }
    }
}
