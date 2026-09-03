package org.telegram.ui.Components;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class qo extends LinearLayout {
    public qk0 f30473a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f30474b;
    public FrameLayout f30475c;
    public int d;
    public float f30476e;
    public float f30477f;
    public float h;
    public float f30478n;
    public float f30479r;

    public final void a() {
        FrameLayout frameLayout = this.f30475c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.f30478n + this.f30479r);
        }
    }

    public final void b() {
        float f10 = (1.0f - this.f30477f) * this.f30476e;
        this.f30474b.setTranslationX(f10);
        FrameLayout frameLayout = this.f30475c;
        if (frameLayout != null) {
            frameLayout.setTranslationX(f10);
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
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
        qk0 qk0Var = this.f30473a;
        if (qk0Var != null && this.f30474b != null) {
            qk0Var.getLayoutParams().width = -2;
            int i16 = 0;
            ((LinearLayout.LayoutParams) this.f30473a.getLayoutParams()).rightMargin = 0;
            this.f30476e = 0.0f;
            super.onMeasure(i14, i12);
            int measuredWidth = this.f30473a.getMeasuredWidth();
            if (this.f30474b.getSwipeBack() != null && this.f30474b.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f30474b.getSwipeBack().getMeasuredWidth();
            }
            if (this.f30474b.getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f30474b.getMeasuredWidth();
            }
            if (this.f30473a.q()) {
                i14 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            }
            qk0 qk0Var2 = this.f30473a;
            if (!qk0Var2.f30428b1 && qk0Var2.N0 && qk0Var2.getMeasuredWidth() > 0) {
                int min = Math.min(AndroidUtilities.dp(320.0f), qk0Var2.getMeasuredWidth() - AndroidUtilities.dp(16.0f));
                StaticLayout staticLayout = new StaticLayout(qk0Var2.O0.getText(), qk0Var2.O0.getPaint(), min, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                qk0Var2.Q0 = staticLayout.getHeight();
                qk0Var2.P0 = 0;
                for (int i17 = 0; i17 < staticLayout.getLineCount(); i17++) {
                    qk0Var2.P0 = Math.max(qk0Var2.P0, (int) Math.ceil(staticLayout.getLineWidth(i17)));
                }
                if (staticLayout.getLineCount() > 1 && !qk0Var2.O0.getText().toString().contains("\n")) {
                    int a2 = qh.e3.a(qk0Var2.O0.getText(), qk0Var2.O0.getPaint());
                    StaticLayout staticLayout2 = new StaticLayout(qk0Var2.O0.getText(), qk0Var2.O0.getPaint(), a2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    qk0Var2.Q0 = staticLayout2.getHeight();
                    qk0Var2.P0 = 0;
                    for (int i18 = 0; i18 < staticLayout2.getLineCount(); i18++) {
                        qk0Var2.P0 = Math.max(qk0Var2.P0, (int) Math.ceil(staticLayout2.getLineWidth(i18)));
                    }
                    qk0Var2.O0.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                    qk0Var2.O0.setWidth(AndroidUtilities.dp(48.0f) + a2);
                } else {
                    qk0Var2.O0.setWidth(AndroidUtilities.dp(16.0f) + min);
                }
                int max = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(7.0f) + qk0Var2.Q0);
                int i19 = qk0Var2.J0;
                if (i19 != 1 && i19 != 2) {
                    qk0Var2.getLayoutParams().height = AndroidUtilities.dp(22.0f) + AndroidUtilities.dp(52.0f) + max;
                } else {
                    max = AndroidUtilities.dp(20.0f);
                }
                ((FrameLayout.LayoutParams) qk0Var2.f30460w0.getLayoutParams()).topMargin = max;
                ((FrameLayout.LayoutParams) qk0Var2.f30426b.getLayoutParams()).topMargin = max;
                qk0Var2.f30428b1 = true;
            }
            int totalWidth = this.f30473a.getTotalWidth();
            if (this.f30474b.getSwipeBack() != null) {
                viewGroup = this.f30474b.getSwipeBack();
            } else {
                viewGroup = this.f30474b;
            }
            View childAt = viewGroup.getChildAt(0);
            int dp = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
            int dp2 = AndroidUtilities.dp(36.0f) + AndroidUtilities.dp(16.0f) + dp;
            int hintTextWidth = this.f30473a.getHintTextWidth();
            if (hintTextWidth > dp2) {
                dp2 = hintTextWidth;
            } else if (dp2 > measuredWidth) {
                dp2 = measuredWidth;
            }
            this.f30473a.D = AndroidUtilities.dp(36.0f);
            if (this.f30473a.q()) {
                this.f30473a.getLayoutParams().width = totalWidth;
                this.f30473a.D = Math.max((totalWidth - childAt.getMeasuredWidth()) - AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
            } else if (totalWidth > dp2) {
                int dp3 = ((dp2 - AndroidUtilities.dp(16.0f)) / AndroidUtilities.dp(36.0f)) + 1;
                int dp4 = AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(36.0f) * dp3);
                if (AndroidUtilities.dp(24.0f) + hintTextWidth > dp4) {
                    dp4 = AndroidUtilities.dp(24.0f) + hintTextWidth;
                }
                if (dp4 <= totalWidth && dp3 != this.f30473a.getItemsCount()) {
                    totalWidth = dp4;
                }
                this.f30473a.getLayoutParams().width = totalWidth;
            } else {
                this.f30473a.getLayoutParams().width = -2;
            }
            if (this.f30473a.getMeasuredWidth() == measuredWidth && this.f30473a.q()) {
                float measuredWidth2 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                this.f30476e = measuredWidth2;
                qk0 qk0Var3 = this.f30473a;
                int i20 = (int) (qk0Var3.D - measuredWidth2);
                qk0Var3.D = i20;
                if (i20 < AndroidUtilities.dp(36.0f)) {
                    this.f30476e = 0.0f;
                    this.f30473a.D = AndroidUtilities.dp(36.0f);
                }
                b();
            } else {
                if (this.f30474b.getSwipeBack() != null) {
                    i13 = this.f30474b.getSwipeBack().getMeasuredWidth() - this.f30474b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                if (this.f30473a.getLayoutParams().width != -2 && this.f30473a.getLayoutParams().width + i13 > measuredWidth) {
                    i13 = AndroidUtilities.dp(8.0f) + (measuredWidth - this.f30473a.getLayoutParams().width);
                }
                if (i13 >= 0) {
                    i16 = i13;
                }
                ((LinearLayout.LayoutParams) this.f30473a.getLayoutParams()).rightMargin = i16;
                this.f30476e = 0.0f;
                b();
            }
            if (this.f30475c != null) {
                if (this.f30473a.q()) {
                    this.f30475c.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                    b();
                } else {
                    this.f30475c.getLayoutParams().width = -1;
                }
                if (this.f30474b.getSwipeBack() != null) {
                    ((LinearLayout.LayoutParams) this.f30475c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f) + i16;
                } else {
                    ((LinearLayout.LayoutParams) this.f30475c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f);
                }
            }
            super.onMeasure(i14, i12);
        } else {
            super.onMeasure(i14, i12);
        }
        this.d = getMeasuredHeight();
    }

    public void setExpandSize(float f10) {
        this.f30474b.setTranslationY(f10);
        this.f30478n = f10;
        a();
    }

    public void setMaxHeight(int i10) {
        this.d = i10;
    }

    public void setPopupAlpha(float f10) {
        this.f30474b.setAlpha(f10);
        FrameLayout frameLayout = this.f30475c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f10);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f30474b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new o1(17, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            ch0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.f25949x.add(new bh0() {
                @Override
                public final void a(float f10, float f11) {
                    qo qoVar = qo.this;
                    FrameLayout frameLayout = qoVar.f30475c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f11);
                    }
                    qoVar.f30477f = f11;
                    qoVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(qk0 qk0Var) {
        this.f30473a = qk0Var;
        if (qk0Var != null) {
            qk0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f10) {
        this.f30474b.setReactionsTransitionProgress(f10);
        FrameLayout frameLayout = this.f30475c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f10);
            float f11 = (f10 * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.f30475c;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.f30475c.setPivotY(0.0f);
            this.f30479r = (1.0f - f10) * (-this.f30474b.getMeasuredHeight());
            a();
            this.f30475c.setScaleX(f11);
            this.f30475c.setScaleY(f11);
        }
    }
}
