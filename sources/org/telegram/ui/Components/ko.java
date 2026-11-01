package org.telegram.ui.Components;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class ko extends LinearLayout {
    public nj0 f27907a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f27908b;
    public FrameLayout f27909c;
    public int d;
    public float e;
    public float f27910f;
    public float h;
    public float f27911n;
    public float f27912r;

    public final void a() {
        FrameLayout frameLayout = this.f27909c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.f27911n + this.f27912r);
        }
    }

    public final void b() {
        float f7 = (1.0f - this.f27910f) * this.e;
        this.f27908b.setTranslationX(f7);
        FrameLayout frameLayout = this.f27909c;
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
        nj0 nj0Var;
        int i14 = i10;
        int i15 = this.d;
        if (i15 != 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
        } else {
            i12 = i11;
        }
        nj0 nj0Var2 = this.f27907a;
        if (nj0Var2 != null && this.f27908b != null) {
            nj0Var2.getLayoutParams().width = -2;
            int i16 = 0;
            ((LinearLayout.LayoutParams) this.f27907a.getLayoutParams()).rightMargin = 0;
            this.e = 0.0f;
            super.onMeasure(i14, i12);
            int measuredWidth = this.f27907a.getMeasuredWidth();
            if (this.f27908b.getSwipeBack() != null && this.f27908b.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f27908b.getSwipeBack().getMeasuredWidth();
            }
            if (this.f27908b.getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f27908b.getMeasuredWidth();
            }
            if (this.f27907a.q()) {
                i14 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            }
            nj0 nj0Var3 = this.f27907a;
            if (!nj0Var3.f28873f1 && nj0Var3.Q0 && nj0Var3.getMeasuredWidth() > 0) {
                int C = org.telegram.messenger.a30.C(16.0f, nj0Var3.getMeasuredWidth(), org.telegram.messenger.i0.L(320.0f));
                StaticLayout staticLayout = new StaticLayout(nj0Var3.R0.getText(), nj0Var3.R0.getPaint(), C, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                nj0Var3.T0 = staticLayout.getHeight();
                nj0Var3.S0 = 0;
                for (int i17 = 0; i17 < staticLayout.getLineCount(); i17++) {
                    nj0Var3.S0 = Math.max(nj0Var3.S0, (int) Math.ceil(staticLayout.getLineWidth(i17)));
                }
                if (staticLayout.getLineCount() > 1 && !nj0Var3.R0.getText().toString().contains("\n")) {
                    int a2 = vh.p2.a(nj0Var3.R0.getText(), nj0Var3.R0.getPaint());
                    StaticLayout staticLayout2 = new StaticLayout(nj0Var3.R0.getText(), nj0Var3.R0.getPaint(), a2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    nj0Var3.T0 = staticLayout2.getHeight();
                    nj0Var3.S0 = 0;
                    for (int i18 = 0; i18 < staticLayout2.getLineCount(); i18++) {
                        nj0Var3.S0 = Math.max(nj0Var3.S0, (int) Math.ceil(staticLayout2.getLineWidth(i18)));
                    }
                    nj0Var3.R0.setPadding(org.telegram.messenger.i0.L(24.0f), 0, org.telegram.messenger.i0.L(24.0f), 0);
                    nj0Var3.R0.setWidth(org.telegram.messenger.i0.L(48.0f) + a2);
                } else {
                    nj0Var3.R0.setWidth(org.telegram.messenger.i0.L(16.0f) + C);
                }
                int max = Math.max(org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(7.0f) + nj0Var3.T0);
                int i19 = nj0Var3.M0;
                if (i19 != 1 && i19 != 2) {
                    nj0Var3.getLayoutParams().height = org.telegram.messenger.i0.L(22.0f) + org.telegram.messenger.i0.L(52.0f) + max;
                } else {
                    max = org.telegram.messenger.i0.L(20.0f);
                }
                ((FrameLayout.LayoutParams) nj0Var3.f28903z0.getLayoutParams()).topMargin = max;
                ((FrameLayout.LayoutParams) nj0Var3.f28861b.getLayoutParams()).topMargin = max;
                nj0Var3.f28873f1 = true;
            }
            int totalWidth = this.f27907a.getTotalWidth();
            if (this.f27908b.getSwipeBack() != null) {
                viewGroup = this.f27908b.getSwipeBack();
            } else {
                viewGroup = this.f27908b;
            }
            View childAt = viewGroup.getChildAt(0);
            int L = org.telegram.messenger.i0.L(36.0f) + org.telegram.messenger.i0.L(16.0f) + org.telegram.messenger.i0.L(16.0f) + childAt.getMeasuredWidth();
            int hintTextWidth = this.f27907a.getHintTextWidth();
            if (hintTextWidth > L) {
                L = hintTextWidth;
            } else if (L > measuredWidth) {
                L = measuredWidth;
            }
            this.f27907a.G = org.telegram.messenger.i0.L(36.0f);
            if (this.f27907a.q()) {
                this.f27907a.getLayoutParams().width = totalWidth;
                this.f27907a.G = Math.max((totalWidth - childAt.getMeasuredWidth()) - org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(36.0f));
            } else if (totalWidth > L) {
                int L2 = ((L - org.telegram.messenger.i0.L(16.0f)) / org.telegram.messenger.i0.L(36.0f)) + 1;
                int L3 = org.telegram.messenger.i0.L(8.0f) + (org.telegram.messenger.i0.L(36.0f) * L2);
                if (org.telegram.messenger.i0.L(24.0f) + hintTextWidth > L3) {
                    L3 = org.telegram.messenger.i0.L(24.0f) + hintTextWidth;
                }
                if (L3 <= totalWidth && L2 != this.f27907a.getItemsCount()) {
                    totalWidth = L3;
                }
                this.f27907a.getLayoutParams().width = totalWidth;
            } else {
                this.f27907a.getLayoutParams().width = -2;
            }
            if (this.f27907a.getMeasuredWidth() == measuredWidth && this.f27907a.q()) {
                float measuredWidth2 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                this.e = measuredWidth2;
                int i20 = (int) (nj0Var.G - measuredWidth2);
                this.f27907a.G = i20;
                if (i20 < org.telegram.messenger.i0.L(36.0f)) {
                    this.e = 0.0f;
                    this.f27907a.G = org.telegram.messenger.i0.L(36.0f);
                }
                b();
            } else {
                if (this.f27908b.getSwipeBack() != null) {
                    i13 = this.f27908b.getSwipeBack().getMeasuredWidth() - this.f27908b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                if (this.f27907a.getLayoutParams().width != -2 && this.f27907a.getLayoutParams().width + i13 > measuredWidth) {
                    i13 = org.telegram.messenger.i0.L(8.0f) + (measuredWidth - this.f27907a.getLayoutParams().width);
                }
                if (i13 >= 0) {
                    i16 = i13;
                }
                ((LinearLayout.LayoutParams) this.f27907a.getLayoutParams()).rightMargin = i16;
                this.e = 0.0f;
                b();
            }
            if (this.f27909c != null) {
                if (this.f27907a.q()) {
                    this.f27909c.getLayoutParams().width = org.telegram.messenger.i0.L(16.0f) + childAt.getMeasuredWidth();
                    b();
                } else {
                    this.f27909c.getLayoutParams().width = -1;
                }
                if (this.f27908b.getSwipeBack() != null) {
                    ((LinearLayout.LayoutParams) this.f27909c.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(36.0f) + i16;
                } else {
                    ((LinearLayout.LayoutParams) this.f27909c.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(36.0f);
                }
            }
            super.onMeasure(i14, i12);
        } else {
            super.onMeasure(i14, i12);
        }
        this.d = getMeasuredHeight();
    }

    public void setExpandSize(float f7) {
        this.f27908b.setTranslationY(f7);
        this.f27911n = f7;
        a();
    }

    public void setMaxHeight(int i10) {
        this.d = i10;
    }

    public void setPopupAlpha(float f7) {
        this.f27908b.setAlpha(f7);
        FrameLayout frameLayout = this.f27909c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f27908b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new f2(13, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            yf0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.f32843y.add(new xf0() {
                @Override
                public final void a(float f7, float f10) {
                    ko koVar = ko.this;
                    FrameLayout frameLayout = koVar.f27909c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f10);
                    }
                    koVar.f27910f = f10;
                    koVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(nj0 nj0Var) {
        this.f27907a = nj0Var;
        if (nj0Var != null) {
            nj0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f7) {
        this.f27908b.setReactionsTransitionProgress(f7);
        FrameLayout frameLayout = this.f27909c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
            float f10 = (f7 * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.f27909c;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.f27909c.setPivotY(0.0f);
            this.f27912r = (1.0f - f7) * (-this.f27908b.getMeasuredHeight());
            a();
            this.f27909c.setScaleX(f10);
            this.f27909c.setScaleY(f10);
        }
    }
}
