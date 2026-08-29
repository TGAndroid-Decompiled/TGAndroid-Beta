package org.telegram.ui.Components;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class mo extends LinearLayout {
    public fk0 f30734a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f30735b;
    public FrameLayout f30736c;
    public int d;
    public float f30737e;
    public float f30738f;
    public float h;
    public float f30739n;
    public float f30740r;

    public final void a() {
        FrameLayout frameLayout = this.f30736c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.f30739n + this.f30740r);
        }
    }

    public final void b() {
        float f9 = (1.0f - this.f30738f) * this.f30737e;
        this.f30735b.setTranslationX(f9);
        FrameLayout frameLayout = this.f30736c;
        if (frameLayout != null) {
            frameLayout.setTranslationX(f9);
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
        fk0 fk0Var = this.f30734a;
        if (fk0Var != null && this.f30735b != null) {
            fk0Var.getLayoutParams().width = -2;
            int i16 = 0;
            ((LinearLayout.LayoutParams) this.f30734a.getLayoutParams()).rightMargin = 0;
            this.f30737e = 0.0f;
            super.onMeasure(i14, i12);
            int measuredWidth = this.f30734a.getMeasuredWidth();
            if (this.f30735b.getSwipeBack() != null && this.f30735b.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f30735b.getSwipeBack().getMeasuredWidth();
            }
            if (this.f30735b.getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f30735b.getMeasuredWidth();
            }
            if (this.f30734a.q()) {
                i14 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            }
            fk0 fk0Var2 = this.f30734a;
            if (!fk0Var2.f28433a1 && fk0Var2.M0 && fk0Var2.getMeasuredWidth() > 0) {
                int min = Math.min(AndroidUtilities.dp(320.0f), fk0Var2.getMeasuredWidth() - AndroidUtilities.dp(16.0f));
                StaticLayout staticLayout = new StaticLayout(fk0Var2.N0.getText(), fk0Var2.N0.getPaint(), min, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                fk0Var2.P0 = staticLayout.getHeight();
                fk0Var2.O0 = 0;
                for (int i17 = 0; i17 < staticLayout.getLineCount(); i17++) {
                    fk0Var2.O0 = Math.max(fk0Var2.O0, (int) Math.ceil(staticLayout.getLineWidth(i17)));
                }
                if (staticLayout.getLineCount() > 1 && !fk0Var2.N0.getText().toString().contains("\n")) {
                    int a2 = nh.t3.a(fk0Var2.N0.getText(), fk0Var2.N0.getPaint());
                    StaticLayout staticLayout2 = new StaticLayout(fk0Var2.N0.getText(), fk0Var2.N0.getPaint(), a2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    fk0Var2.P0 = staticLayout2.getHeight();
                    fk0Var2.O0 = 0;
                    for (int i18 = 0; i18 < staticLayout2.getLineCount(); i18++) {
                        fk0Var2.O0 = Math.max(fk0Var2.O0, (int) Math.ceil(staticLayout2.getLineWidth(i18)));
                    }
                    fk0Var2.N0.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                    fk0Var2.N0.setWidth(AndroidUtilities.dp(48.0f) + a2);
                } else {
                    fk0Var2.N0.setWidth(AndroidUtilities.dp(16.0f) + min);
                }
                int max = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(7.0f) + fk0Var2.P0);
                int i19 = fk0Var2.I0;
                if (i19 != 1 && i19 != 2) {
                    fk0Var2.getLayoutParams().height = AndroidUtilities.dp(22.0f) + AndroidUtilities.dp(52.0f) + max;
                } else {
                    max = AndroidUtilities.dp(20.0f);
                }
                ((FrameLayout.LayoutParams) fk0Var2.f28465v0.getLayoutParams()).topMargin = max;
                ((FrameLayout.LayoutParams) fk0Var2.f28434b.getLayoutParams()).topMargin = max;
                fk0Var2.f28433a1 = true;
            }
            int totalWidth = this.f30734a.getTotalWidth();
            if (this.f30735b.getSwipeBack() != null) {
                viewGroup = this.f30735b.getSwipeBack();
            } else {
                viewGroup = this.f30735b;
            }
            View childAt = viewGroup.getChildAt(0);
            int dp = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
            int dp2 = AndroidUtilities.dp(36.0f) + AndroidUtilities.dp(16.0f) + dp;
            int hintTextWidth = this.f30734a.getHintTextWidth();
            if (hintTextWidth > dp2) {
                dp2 = hintTextWidth;
            } else if (dp2 > measuredWidth) {
                dp2 = measuredWidth;
            }
            this.f30734a.C = AndroidUtilities.dp(36.0f);
            if (this.f30734a.q()) {
                this.f30734a.getLayoutParams().width = totalWidth;
                this.f30734a.C = Math.max((totalWidth - childAt.getMeasuredWidth()) - AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
            } else if (totalWidth > dp2) {
                int dp3 = ((dp2 - AndroidUtilities.dp(16.0f)) / AndroidUtilities.dp(36.0f)) + 1;
                int dp4 = AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(36.0f) * dp3);
                if (AndroidUtilities.dp(24.0f) + hintTextWidth > dp4) {
                    dp4 = AndroidUtilities.dp(24.0f) + hintTextWidth;
                }
                if (dp4 <= totalWidth && dp3 != this.f30734a.getItemsCount()) {
                    totalWidth = dp4;
                }
                this.f30734a.getLayoutParams().width = totalWidth;
            } else {
                this.f30734a.getLayoutParams().width = -2;
            }
            if (this.f30734a.getMeasuredWidth() == measuredWidth && this.f30734a.q()) {
                float measuredWidth2 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                this.f30737e = measuredWidth2;
                fk0 fk0Var3 = this.f30734a;
                int i20 = (int) (fk0Var3.C - measuredWidth2);
                fk0Var3.C = i20;
                if (i20 < AndroidUtilities.dp(36.0f)) {
                    this.f30737e = 0.0f;
                    this.f30734a.C = AndroidUtilities.dp(36.0f);
                }
                b();
            } else {
                if (this.f30735b.getSwipeBack() != null) {
                    i13 = this.f30735b.getSwipeBack().getMeasuredWidth() - this.f30735b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                if (this.f30734a.getLayoutParams().width != -2 && this.f30734a.getLayoutParams().width + i13 > measuredWidth) {
                    i13 = AndroidUtilities.dp(8.0f) + (measuredWidth - this.f30734a.getLayoutParams().width);
                }
                if (i13 >= 0) {
                    i16 = i13;
                }
                ((LinearLayout.LayoutParams) this.f30734a.getLayoutParams()).rightMargin = i16;
                this.f30737e = 0.0f;
                b();
            }
            if (this.f30736c != null) {
                if (this.f30734a.q()) {
                    this.f30736c.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                    b();
                } else {
                    this.f30736c.getLayoutParams().width = -1;
                }
                if (this.f30735b.getSwipeBack() != null) {
                    ((LinearLayout.LayoutParams) this.f30736c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f) + i16;
                } else {
                    ((LinearLayout.LayoutParams) this.f30736c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f);
                }
            }
            super.onMeasure(i14, i12);
        } else {
            super.onMeasure(i14, i12);
        }
        this.d = getMeasuredHeight();
    }

    public void setExpandSize(float f9) {
        this.f30735b.setTranslationY(f9);
        this.f30739n = f9;
        a();
    }

    public void setMaxHeight(int i10) {
        this.d = i10;
    }

    public void setPopupAlpha(float f9) {
        this.f30735b.setAlpha(f9);
        FrameLayout frameLayout = this.f30736c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f9);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f30735b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new j1(18, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            qg0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.f31950x.add(new pg0() {
                @Override
                public final void a(float f9, float f10) {
                    mo moVar = mo.this;
                    FrameLayout frameLayout = moVar.f30736c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f10);
                    }
                    moVar.f30738f = f10;
                    moVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(fk0 fk0Var) {
        this.f30734a = fk0Var;
        if (fk0Var != null) {
            fk0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f9) {
        this.f30735b.setReactionsTransitionProgress(f9);
        FrameLayout frameLayout = this.f30736c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f9);
            float f10 = (f9 * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.f30736c;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.f30736c.setPivotY(0.0f);
            this.f30740r = (1.0f - f9) * (-this.f30735b.getMeasuredHeight());
            a();
            this.f30736c.setScaleX(f10);
            this.f30736c.setScaleY(f10);
        }
    }
}
