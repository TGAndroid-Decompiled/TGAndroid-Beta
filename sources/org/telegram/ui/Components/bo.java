package org.telegram.ui.Components;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class bo extends LinearLayout {
    public ji0 f32334a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f32335b;
    public FrameLayout f32336c;
    public int d;
    public float f32337e;
    public float f32338f;
    public float h;
    public float f32339n;
    public float f32340r;

    public final void a() {
        FrameLayout frameLayout = this.f32336c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.f32339n + this.f32340r);
        }
    }

    public final void b() {
        float f10 = (1.0f - this.f32338f) * this.f32337e;
        this.f32335b.setTranslationX(f10);
        FrameLayout frameLayout = this.f32336c;
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
        ji0 ji0Var;
        int i13 = i7;
        int i14 = this.d;
        if (i14 != 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE);
        } else {
            i11 = i10;
        }
        ji0 ji0Var2 = this.f32334a;
        if (ji0Var2 != null && this.f32335b != null) {
            ji0Var2.getLayoutParams().width = -2;
            int i15 = 0;
            ((LinearLayout.LayoutParams) this.f32334a.getLayoutParams()).rightMargin = 0;
            this.f32337e = 0.0f;
            super.onMeasure(i13, i11);
            int measuredWidth = this.f32334a.getMeasuredWidth();
            if (this.f32335b.getSwipeBack() != null && this.f32335b.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f32335b.getSwipeBack().getMeasuredWidth();
            }
            if (this.f32335b.getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f32335b.getMeasuredWidth();
            }
            if (this.f32334a.q()) {
                i13 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            }
            ji0 ji0Var3 = this.f32334a;
            if (!ji0Var3.f35041f1 && ji0Var3.Q0 && ji0Var3.getMeasuredWidth() > 0) {
                int C = org.telegram.messenger.camera.q.C(16.0f, ji0Var3.getMeasuredWidth(), org.telegram.messenger.g0.L(320.0f));
                StaticLayout staticLayout = new StaticLayout(ji0Var3.R0.getText(), ji0Var3.R0.getPaint(), C, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                ji0Var3.T0 = staticLayout.getHeight();
                ji0Var3.S0 = 0;
                for (int i16 = 0; i16 < staticLayout.getLineCount(); i16++) {
                    ji0Var3.S0 = Math.max(ji0Var3.S0, (int) Math.ceil(staticLayout.getLineWidth(i16)));
                }
                if (staticLayout.getLineCount() > 1 && !ji0Var3.R0.getText().toString().contains("\n")) {
                    int a10 = fi.m3.a(ji0Var3.R0.getText(), ji0Var3.R0.getPaint());
                    StaticLayout staticLayout2 = new StaticLayout(ji0Var3.R0.getText(), ji0Var3.R0.getPaint(), a10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    ji0Var3.T0 = staticLayout2.getHeight();
                    ji0Var3.S0 = 0;
                    for (int i17 = 0; i17 < staticLayout2.getLineCount(); i17++) {
                        ji0Var3.S0 = Math.max(ji0Var3.S0, (int) Math.ceil(staticLayout2.getLineWidth(i17)));
                    }
                    ji0Var3.R0.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
                    ji0Var3.R0.setWidth(org.telegram.messenger.g0.L(48.0f) + a10);
                } else {
                    ji0Var3.R0.setWidth(org.telegram.messenger.g0.L(16.0f) + C);
                }
                int max = Math.max(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(7.0f) + ji0Var3.T0);
                int i18 = ji0Var3.M0;
                if (i18 != 1 && i18 != 2) {
                    ji0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(22.0f) + org.telegram.messenger.g0.L(52.0f) + max;
                } else {
                    max = org.telegram.messenger.g0.L(20.0f);
                }
                ((FrameLayout.LayoutParams) ji0Var3.f35071z0.getLayoutParams()).topMargin = max;
                ((FrameLayout.LayoutParams) ji0Var3.f35028b.getLayoutParams()).topMargin = max;
                ji0Var3.f35041f1 = true;
            }
            int totalWidth = this.f32334a.getTotalWidth();
            if (this.f32335b.getSwipeBack() != null) {
                viewGroup = this.f32335b.getSwipeBack();
            } else {
                viewGroup = this.f32335b;
            }
            View childAt = viewGroup.getChildAt(0);
            int L = org.telegram.messenger.g0.L(36.0f) + org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.L(16.0f) + childAt.getMeasuredWidth();
            int hintTextWidth = this.f32334a.getHintTextWidth();
            if (hintTextWidth > L) {
                L = hintTextWidth;
            } else if (L > measuredWidth) {
                L = measuredWidth;
            }
            this.f32334a.G = org.telegram.messenger.g0.L(36.0f);
            if (this.f32334a.q()) {
                this.f32334a.getLayoutParams().width = totalWidth;
                this.f32334a.G = Math.max((totalWidth - childAt.getMeasuredWidth()) - org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f));
            } else if (totalWidth > L) {
                int L2 = ((L - org.telegram.messenger.g0.L(16.0f)) / org.telegram.messenger.g0.L(36.0f)) + 1;
                int L3 = org.telegram.messenger.g0.L(8.0f) + (org.telegram.messenger.g0.L(36.0f) * L2);
                if (org.telegram.messenger.g0.L(24.0f) + hintTextWidth > L3) {
                    L3 = org.telegram.messenger.g0.L(24.0f) + hintTextWidth;
                }
                if (L3 <= totalWidth && L2 != this.f32334a.getItemsCount()) {
                    totalWidth = L3;
                }
                this.f32334a.getLayoutParams().width = totalWidth;
            } else {
                this.f32334a.getLayoutParams().width = -2;
            }
            if (this.f32334a.getMeasuredWidth() == measuredWidth && this.f32334a.q()) {
                float measuredWidth2 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                this.f32337e = measuredWidth2;
                int i19 = (int) (ji0Var.G - measuredWidth2);
                this.f32334a.G = i19;
                if (i19 < org.telegram.messenger.g0.L(36.0f)) {
                    this.f32337e = 0.0f;
                    this.f32334a.G = org.telegram.messenger.g0.L(36.0f);
                }
                b();
            } else {
                if (this.f32335b.getSwipeBack() != null) {
                    i12 = this.f32335b.getSwipeBack().getMeasuredWidth() - this.f32335b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    i12 = 0;
                }
                if (this.f32334a.getLayoutParams().width != -2 && this.f32334a.getLayoutParams().width + i12 > measuredWidth) {
                    i12 = org.telegram.messenger.g0.L(8.0f) + (measuredWidth - this.f32334a.getLayoutParams().width);
                }
                if (i12 >= 0) {
                    i15 = i12;
                }
                ((LinearLayout.LayoutParams) this.f32334a.getLayoutParams()).rightMargin = i15;
                this.f32337e = 0.0f;
                b();
            }
            if (this.f32336c != null) {
                if (this.f32334a.q()) {
                    this.f32336c.getLayoutParams().width = org.telegram.messenger.g0.L(16.0f) + childAt.getMeasuredWidth();
                    b();
                } else {
                    this.f32336c.getLayoutParams().width = -1;
                }
                if (this.f32335b.getSwipeBack() != null) {
                    ((LinearLayout.LayoutParams) this.f32336c.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(36.0f) + i15;
                } else {
                    ((LinearLayout.LayoutParams) this.f32336c.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(36.0f);
                }
            }
            super.onMeasure(i13, i11);
        } else {
            super.onMeasure(i13, i11);
        }
        this.d = getMeasuredHeight();
    }

    public void setExpandSize(float f10) {
        this.f32335b.setTranslationY(f10);
        this.f32339n = f10;
        a();
    }

    public void setMaxHeight(int i7) {
        this.d = i7;
    }

    public void setPopupAlpha(float f10) {
        this.f32335b.setAlpha(f10);
        FrameLayout frameLayout = this.f32336c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f10);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f32335b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new f2(12, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            we0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.f40049y.add(new ve0() {
                @Override
                public final void a(float f10, float f11) {
                    bo boVar = bo.this;
                    FrameLayout frameLayout = boVar.f32336c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f11);
                    }
                    boVar.f32338f = f11;
                    boVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(ji0 ji0Var) {
        this.f32334a = ji0Var;
        if (ji0Var != null) {
            ji0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f10) {
        this.f32335b.setReactionsTransitionProgress(f10);
        FrameLayout frameLayout = this.f32336c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f10);
            float f11 = (f10 * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.f32336c;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.f32336c.setPivotY(0.0f);
            this.f32340r = (1.0f - f10) * (-this.f32335b.getMeasuredHeight());
            a();
            this.f32336c.setScaleX(f11);
            this.f32336c.setScaleY(f11);
        }
    }
}
