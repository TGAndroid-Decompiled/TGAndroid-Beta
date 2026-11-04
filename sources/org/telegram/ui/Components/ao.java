package org.telegram.ui.Components;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class ao extends LinearLayout {
    public li0 f31952a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f31953b;
    public FrameLayout f31954c;
    public int d;
    public float f31955e;
    public float f31956f;
    public float h;
    public float f31957n;
    public float f31958r;

    public final void a() {
        FrameLayout frameLayout = this.f31954c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.f31957n + this.f31958r);
        }
    }

    public final void b() {
        float f10 = (1.0f - this.f31956f) * this.f31955e;
        this.f31953b.setTranslationX(f10);
        FrameLayout frameLayout = this.f31954c;
        if (frameLayout != null) {
            frameLayout.setTranslationX(f10);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        ViewGroup viewGroup;
        int i12;
        li0 li0Var;
        int i13 = i3;
        int i14 = this.d;
        if (i14 != 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE);
        } else {
            i11 = i10;
        }
        li0 li0Var2 = this.f31952a;
        if (li0Var2 != null && this.f31953b != null) {
            li0Var2.getLayoutParams().width = -2;
            int i15 = 0;
            ((LinearLayout.LayoutParams) this.f31952a.getLayoutParams()).rightMargin = 0;
            this.f31955e = 0.0f;
            super.onMeasure(i13, i11);
            int measuredWidth = this.f31952a.getMeasuredWidth();
            if (this.f31953b.getSwipeBack() != null && this.f31953b.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f31953b.getSwipeBack().getMeasuredWidth();
            }
            if (this.f31953b.getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f31953b.getMeasuredWidth();
            }
            if (this.f31952a.q()) {
                i13 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            }
            li0 li0Var3 = this.f31952a;
            if (!li0Var3.f35751g1 && li0Var3.R0 && li0Var3.getMeasuredWidth() > 0) {
                int C = org.telegram.messenger.camera.q.C(16.0f, li0Var3.getMeasuredWidth(), org.telegram.messenger.g0.L(320.0f));
                StaticLayout staticLayout = new StaticLayout(li0Var3.S0.getText(), li0Var3.S0.getPaint(), C, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                li0Var3.U0 = staticLayout.getHeight();
                li0Var3.T0 = 0;
                for (int i16 = 0; i16 < staticLayout.getLineCount(); i16++) {
                    li0Var3.T0 = Math.max(li0Var3.T0, (int) Math.ceil(staticLayout.getLineWidth(i16)));
                }
                if (staticLayout.getLineCount() > 1 && !li0Var3.S0.getText().toString().contains("\n")) {
                    int a10 = gi.l3.a(li0Var3.S0.getText(), li0Var3.S0.getPaint());
                    StaticLayout staticLayout2 = new StaticLayout(li0Var3.S0.getText(), li0Var3.S0.getPaint(), a10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    li0Var3.U0 = staticLayout2.getHeight();
                    li0Var3.T0 = 0;
                    for (int i17 = 0; i17 < staticLayout2.getLineCount(); i17++) {
                        li0Var3.T0 = Math.max(li0Var3.T0, (int) Math.ceil(staticLayout2.getLineWidth(i17)));
                    }
                    li0Var3.S0.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
                    li0Var3.S0.setWidth(org.telegram.messenger.g0.L(48.0f) + a10);
                } else {
                    li0Var3.S0.setWidth(org.telegram.messenger.g0.L(16.0f) + C);
                }
                int max = Math.max(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(7.0f) + li0Var3.U0);
                int i18 = li0Var3.N0;
                if (i18 != 1 && i18 != 2) {
                    li0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(22.0f) + org.telegram.messenger.g0.L(52.0f) + max;
                } else {
                    max = org.telegram.messenger.g0.L(20.0f);
                }
                ((FrameLayout.LayoutParams) li0Var3.A0.getLayoutParams()).topMargin = max;
                ((FrameLayout.LayoutParams) li0Var3.f35736b.getLayoutParams()).topMargin = max;
                li0Var3.f35751g1 = true;
            }
            int totalWidth = this.f31952a.getTotalWidth();
            if (this.f31953b.getSwipeBack() != null) {
                viewGroup = this.f31953b.getSwipeBack();
            } else {
                viewGroup = this.f31953b;
            }
            View childAt = viewGroup.getChildAt(0);
            int L = org.telegram.messenger.g0.L(36.0f) + org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.L(16.0f) + childAt.getMeasuredWidth();
            int hintTextWidth = this.f31952a.getHintTextWidth();
            if (hintTextWidth > L) {
                L = hintTextWidth;
            } else if (L > measuredWidth) {
                L = measuredWidth;
            }
            this.f31952a.H = org.telegram.messenger.g0.L(36.0f);
            if (this.f31952a.q()) {
                this.f31952a.getLayoutParams().width = totalWidth;
                this.f31952a.H = Math.max((totalWidth - childAt.getMeasuredWidth()) - org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f));
            } else if (totalWidth > L) {
                int L2 = ((L - org.telegram.messenger.g0.L(16.0f)) / org.telegram.messenger.g0.L(36.0f)) + 1;
                int L3 = org.telegram.messenger.g0.L(8.0f) + (org.telegram.messenger.g0.L(36.0f) * L2);
                if (org.telegram.messenger.g0.L(24.0f) + hintTextWidth > L3) {
                    L3 = org.telegram.messenger.g0.L(24.0f) + hintTextWidth;
                }
                if (L3 <= totalWidth && L2 != this.f31952a.getItemsCount()) {
                    totalWidth = L3;
                }
                this.f31952a.getLayoutParams().width = totalWidth;
            } else {
                this.f31952a.getLayoutParams().width = -2;
            }
            if (this.f31952a.getMeasuredWidth() == measuredWidth && this.f31952a.q()) {
                float measuredWidth2 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                this.f31955e = measuredWidth2;
                int i19 = (int) (li0Var.H - measuredWidth2);
                this.f31952a.H = i19;
                if (i19 < org.telegram.messenger.g0.L(36.0f)) {
                    this.f31955e = 0.0f;
                    this.f31952a.H = org.telegram.messenger.g0.L(36.0f);
                }
                b();
            } else {
                if (this.f31953b.getSwipeBack() != null) {
                    i12 = this.f31953b.getSwipeBack().getMeasuredWidth() - this.f31953b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    i12 = 0;
                }
                if (this.f31952a.getLayoutParams().width != -2 && this.f31952a.getLayoutParams().width + i12 > measuredWidth) {
                    i12 = org.telegram.messenger.g0.L(8.0f) + (measuredWidth - this.f31952a.getLayoutParams().width);
                }
                if (i12 >= 0) {
                    i15 = i12;
                }
                ((LinearLayout.LayoutParams) this.f31952a.getLayoutParams()).rightMargin = i15;
                this.f31955e = 0.0f;
                b();
            }
            if (this.f31954c != null) {
                if (this.f31952a.q()) {
                    this.f31954c.getLayoutParams().width = org.telegram.messenger.g0.L(16.0f) + childAt.getMeasuredWidth();
                    b();
                } else {
                    this.f31954c.getLayoutParams().width = -1;
                }
                if (this.f31953b.getSwipeBack() != null) {
                    ((LinearLayout.LayoutParams) this.f31954c.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(36.0f) + i15;
                } else {
                    ((LinearLayout.LayoutParams) this.f31954c.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(36.0f);
                }
            }
            super.onMeasure(i13, i11);
        } else {
            super.onMeasure(i13, i11);
        }
        this.d = getMeasuredHeight();
    }

    public void setExpandSize(float f10) {
        this.f31953b.setTranslationY(f10);
        this.f31957n = f10;
        a();
    }

    public void setMaxHeight(int i3) {
        this.d = i3;
    }

    public void setPopupAlpha(float f10) {
        this.f31953b.setAlpha(f10);
        FrameLayout frameLayout = this.f31954c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f10);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f31953b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new org.telegram.ui.jo(22, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            xe0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.f40338y.add(new we0() {
                @Override
                public final void a(float f10, float f11) {
                    ao aoVar = ao.this;
                    FrameLayout frameLayout = aoVar.f31954c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f11);
                    }
                    aoVar.f31956f = f11;
                    aoVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(li0 li0Var) {
        this.f31952a = li0Var;
        if (li0Var != null) {
            li0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f10) {
        this.f31953b.setReactionsTransitionProgress(f10);
        FrameLayout frameLayout = this.f31954c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f10);
            float f11 = (f10 * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.f31954c;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.f31954c.setPivotY(0.0f);
            this.f31958r = (1.0f - f10) * (-this.f31953b.getMeasuredHeight());
            a();
            this.f31954c.setScaleX(f11);
            this.f31954c.setScaleY(f11);
        }
    }
}
