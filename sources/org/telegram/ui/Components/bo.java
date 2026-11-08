package org.telegram.ui.Components;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class bo extends LinearLayout {
    public ii0 f32283a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f32284b;
    public FrameLayout f32285c;
    public int d;
    public float f32286e;
    public float f32287f;
    public float h;
    public float f32288n;
    public float f32289r;

    public final void a() {
        FrameLayout frameLayout = this.f32285c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.f32288n + this.f32289r);
        }
    }

    public final void b() {
        float f10 = (1.0f - this.f32287f) * this.f32286e;
        this.f32284b.setTranslationX(f10);
        FrameLayout frameLayout = this.f32285c;
        if (frameLayout != null) {
            frameLayout.setTranslationX(f10);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        ViewGroup viewGroup;
        int i12;
        ii0 ii0Var;
        int i13 = i7;
        int i14 = this.d;
        if (i14 != 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE);
        } else {
            i11 = i10;
        }
        ii0 ii0Var2 = this.f32283a;
        if (ii0Var2 != null && this.f32284b != null) {
            ii0Var2.getLayoutParams().width = -2;
            int i15 = 0;
            ((LinearLayout.LayoutParams) this.f32283a.getLayoutParams()).rightMargin = 0;
            this.f32286e = 0.0f;
            super.onMeasure(i13, i11);
            int measuredWidth = this.f32283a.getMeasuredWidth();
            if (this.f32284b.getSwipeBack() != null && this.f32284b.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f32284b.getSwipeBack().getMeasuredWidth();
            }
            if (this.f32284b.getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f32284b.getMeasuredWidth();
            }
            if (this.f32283a.q()) {
                i13 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            }
            ii0 ii0Var3 = this.f32283a;
            if (!ii0Var3.f34695f1 && ii0Var3.Q0 && ii0Var3.getMeasuredWidth() > 0) {
                int C = org.telegram.messenger.camera.q.C(16.0f, ii0Var3.getMeasuredWidth(), org.telegram.messenger.g0.L(320.0f));
                StaticLayout staticLayout = new StaticLayout(ii0Var3.R0.getText(), ii0Var3.R0.getPaint(), C, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                ii0Var3.T0 = staticLayout.getHeight();
                ii0Var3.S0 = 0;
                for (int i16 = 0; i16 < staticLayout.getLineCount(); i16++) {
                    ii0Var3.S0 = Math.max(ii0Var3.S0, (int) Math.ceil(staticLayout.getLineWidth(i16)));
                }
                if (staticLayout.getLineCount() > 1 && !ii0Var3.R0.getText().toString().contains("\n")) {
                    int a10 = fi.m3.a(ii0Var3.R0.getText(), ii0Var3.R0.getPaint());
                    StaticLayout staticLayout2 = new StaticLayout(ii0Var3.R0.getText(), ii0Var3.R0.getPaint(), a10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    ii0Var3.T0 = staticLayout2.getHeight();
                    ii0Var3.S0 = 0;
                    for (int i17 = 0; i17 < staticLayout2.getLineCount(); i17++) {
                        ii0Var3.S0 = Math.max(ii0Var3.S0, (int) Math.ceil(staticLayout2.getLineWidth(i17)));
                    }
                    ii0Var3.R0.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
                    ii0Var3.R0.setWidth(org.telegram.messenger.g0.L(48.0f) + a10);
                } else {
                    ii0Var3.R0.setWidth(org.telegram.messenger.g0.L(16.0f) + C);
                }
                int max = Math.max(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(7.0f) + ii0Var3.T0);
                int i18 = ii0Var3.M0;
                if (i18 != 1 && i18 != 2) {
                    ii0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(22.0f) + org.telegram.messenger.g0.L(52.0f) + max;
                } else {
                    max = org.telegram.messenger.g0.L(20.0f);
                }
                ((FrameLayout.LayoutParams) ii0Var3.f34725z0.getLayoutParams()).topMargin = max;
                ((FrameLayout.LayoutParams) ii0Var3.f34682b.getLayoutParams()).topMargin = max;
                ii0Var3.f34695f1 = true;
            }
            int totalWidth = this.f32283a.getTotalWidth();
            if (this.f32284b.getSwipeBack() != null) {
                viewGroup = this.f32284b.getSwipeBack();
            } else {
                viewGroup = this.f32284b;
            }
            View childAt = viewGroup.getChildAt(0);
            int L = org.telegram.messenger.g0.L(36.0f) + org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.L(16.0f) + childAt.getMeasuredWidth();
            int hintTextWidth = this.f32283a.getHintTextWidth();
            if (hintTextWidth > L) {
                L = hintTextWidth;
            } else if (L > measuredWidth) {
                L = measuredWidth;
            }
            this.f32283a.G = org.telegram.messenger.g0.L(36.0f);
            if (this.f32283a.q()) {
                this.f32283a.getLayoutParams().width = totalWidth;
                this.f32283a.G = Math.max((totalWidth - childAt.getMeasuredWidth()) - org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f));
            } else if (totalWidth > L) {
                int L2 = ((L - org.telegram.messenger.g0.L(16.0f)) / org.telegram.messenger.g0.L(36.0f)) + 1;
                int L3 = org.telegram.messenger.g0.L(8.0f) + (org.telegram.messenger.g0.L(36.0f) * L2);
                if (org.telegram.messenger.g0.L(24.0f) + hintTextWidth > L3) {
                    L3 = org.telegram.messenger.g0.L(24.0f) + hintTextWidth;
                }
                if (L3 <= totalWidth && L2 != this.f32283a.getItemsCount()) {
                    totalWidth = L3;
                }
                this.f32283a.getLayoutParams().width = totalWidth;
            } else {
                this.f32283a.getLayoutParams().width = -2;
            }
            if (this.f32283a.getMeasuredWidth() == measuredWidth && this.f32283a.q()) {
                float measuredWidth2 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                this.f32286e = measuredWidth2;
                int i19 = (int) (ii0Var.G - measuredWidth2);
                this.f32283a.G = i19;
                if (i19 < org.telegram.messenger.g0.L(36.0f)) {
                    this.f32286e = 0.0f;
                    this.f32283a.G = org.telegram.messenger.g0.L(36.0f);
                }
                b();
            } else {
                if (this.f32284b.getSwipeBack() != null) {
                    i12 = this.f32284b.getSwipeBack().getMeasuredWidth() - this.f32284b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    i12 = 0;
                }
                if (this.f32283a.getLayoutParams().width != -2 && this.f32283a.getLayoutParams().width + i12 > measuredWidth) {
                    i12 = org.telegram.messenger.g0.L(8.0f) + (measuredWidth - this.f32283a.getLayoutParams().width);
                }
                if (i12 >= 0) {
                    i15 = i12;
                }
                ((LinearLayout.LayoutParams) this.f32283a.getLayoutParams()).rightMargin = i15;
                this.f32286e = 0.0f;
                b();
            }
            if (this.f32285c != null) {
                if (this.f32283a.q()) {
                    this.f32285c.getLayoutParams().width = org.telegram.messenger.g0.L(16.0f) + childAt.getMeasuredWidth();
                    b();
                } else {
                    this.f32285c.getLayoutParams().width = -1;
                }
                if (this.f32284b.getSwipeBack() != null) {
                    ((LinearLayout.LayoutParams) this.f32285c.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(36.0f) + i15;
                } else {
                    ((LinearLayout.LayoutParams) this.f32285c.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(36.0f);
                }
            }
            super.onMeasure(i13, i11);
        } else {
            super.onMeasure(i13, i11);
        }
        this.d = getMeasuredHeight();
    }

    public void setExpandSize(float f10) {
        this.f32284b.setTranslationY(f10);
        this.f32288n = f10;
        a();
    }

    public void setMaxHeight(int i7) {
        this.d = i7;
    }

    public void setPopupAlpha(float f10) {
        this.f32284b.setAlpha(f10);
        FrameLayout frameLayout = this.f32285c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f10);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f32284b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new f2(12, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            ve0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.f38997y.add(new ue0() {
                @Override
                public final void a(float f10, float f11) {
                    bo boVar = bo.this;
                    FrameLayout frameLayout = boVar.f32285c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f11);
                    }
                    boVar.f32287f = f11;
                    boVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(ii0 ii0Var) {
        this.f32283a = ii0Var;
        if (ii0Var != null) {
            ii0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f10) {
        this.f32284b.setReactionsTransitionProgress(f10);
        FrameLayout frameLayout = this.f32285c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f10);
            float f11 = (f10 * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.f32285c;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.f32285c.setPivotY(0.0f);
            this.f32289r = (1.0f - f10) * (-this.f32284b.getMeasuredHeight());
            a();
            this.f32285c.setScaleX(f11);
            this.f32285c.setScaleY(f11);
        }
    }
}
