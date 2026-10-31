package org.telegram.ui.Components;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class ko extends LinearLayout {
    public mj0 f27853a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f27854b;
    public FrameLayout f27855c;
    public int d;
    public float e;
    public float f27856f;
    public float h;
    public float f27857n;
    public float f27858r;

    public final void a() {
        FrameLayout frameLayout = this.f27855c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.f27857n + this.f27858r);
        }
    }

    public final void b() {
        float f7 = (1.0f - this.f27856f) * this.e;
        this.f27854b.setTranslationX(f7);
        FrameLayout frameLayout = this.f27855c;
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
        mj0 mj0Var;
        int i14 = i10;
        int i15 = this.d;
        if (i15 != 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
        } else {
            i12 = i11;
        }
        mj0 mj0Var2 = this.f27853a;
        if (mj0Var2 != null && this.f27854b != null) {
            mj0Var2.getLayoutParams().width = -2;
            int i16 = 0;
            ((LinearLayout.LayoutParams) this.f27853a.getLayoutParams()).rightMargin = 0;
            this.e = 0.0f;
            super.onMeasure(i14, i12);
            int measuredWidth = this.f27853a.getMeasuredWidth();
            if (this.f27854b.getSwipeBack() != null && this.f27854b.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f27854b.getSwipeBack().getMeasuredWidth();
            }
            if (this.f27854b.getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f27854b.getMeasuredWidth();
            }
            if (this.f27853a.q()) {
                i14 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            }
            mj0 mj0Var3 = this.f27853a;
            if (!mj0Var3.f28512f1 && mj0Var3.Q0 && mj0Var3.getMeasuredWidth() > 0) {
                int C = org.telegram.messenger.z20.C(16.0f, mj0Var3.getMeasuredWidth(), org.telegram.messenger.i0.L(320.0f));
                StaticLayout staticLayout = new StaticLayout(mj0Var3.R0.getText(), mj0Var3.R0.getPaint(), C, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                mj0Var3.T0 = staticLayout.getHeight();
                mj0Var3.S0 = 0;
                for (int i17 = 0; i17 < staticLayout.getLineCount(); i17++) {
                    mj0Var3.S0 = Math.max(mj0Var3.S0, (int) Math.ceil(staticLayout.getLineWidth(i17)));
                }
                if (staticLayout.getLineCount() > 1 && !mj0Var3.R0.getText().toString().contains("\n")) {
                    int a2 = vh.p2.a(mj0Var3.R0.getText(), mj0Var3.R0.getPaint());
                    StaticLayout staticLayout2 = new StaticLayout(mj0Var3.R0.getText(), mj0Var3.R0.getPaint(), a2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    mj0Var3.T0 = staticLayout2.getHeight();
                    mj0Var3.S0 = 0;
                    for (int i18 = 0; i18 < staticLayout2.getLineCount(); i18++) {
                        mj0Var3.S0 = Math.max(mj0Var3.S0, (int) Math.ceil(staticLayout2.getLineWidth(i18)));
                    }
                    mj0Var3.R0.setPadding(org.telegram.messenger.i0.L(24.0f), 0, org.telegram.messenger.i0.L(24.0f), 0);
                    mj0Var3.R0.setWidth(org.telegram.messenger.i0.L(48.0f) + a2);
                } else {
                    mj0Var3.R0.setWidth(org.telegram.messenger.i0.L(16.0f) + C);
                }
                int max = Math.max(org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(7.0f) + mj0Var3.T0);
                int i19 = mj0Var3.M0;
                if (i19 != 1 && i19 != 2) {
                    mj0Var3.getLayoutParams().height = org.telegram.messenger.i0.L(22.0f) + org.telegram.messenger.i0.L(52.0f) + max;
                } else {
                    max = org.telegram.messenger.i0.L(20.0f);
                }
                ((FrameLayout.LayoutParams) mj0Var3.f28542z0.getLayoutParams()).topMargin = max;
                ((FrameLayout.LayoutParams) mj0Var3.f28500b.getLayoutParams()).topMargin = max;
                mj0Var3.f28512f1 = true;
            }
            int totalWidth = this.f27853a.getTotalWidth();
            if (this.f27854b.getSwipeBack() != null) {
                viewGroup = this.f27854b.getSwipeBack();
            } else {
                viewGroup = this.f27854b;
            }
            View childAt = viewGroup.getChildAt(0);
            int L = org.telegram.messenger.i0.L(36.0f) + org.telegram.messenger.i0.L(16.0f) + org.telegram.messenger.i0.L(16.0f) + childAt.getMeasuredWidth();
            int hintTextWidth = this.f27853a.getHintTextWidth();
            if (hintTextWidth > L) {
                L = hintTextWidth;
            } else if (L > measuredWidth) {
                L = measuredWidth;
            }
            this.f27853a.G = org.telegram.messenger.i0.L(36.0f);
            if (this.f27853a.q()) {
                this.f27853a.getLayoutParams().width = totalWidth;
                this.f27853a.G = Math.max((totalWidth - childAt.getMeasuredWidth()) - org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(36.0f));
            } else if (totalWidth > L) {
                int L2 = ((L - org.telegram.messenger.i0.L(16.0f)) / org.telegram.messenger.i0.L(36.0f)) + 1;
                int L3 = org.telegram.messenger.i0.L(8.0f) + (org.telegram.messenger.i0.L(36.0f) * L2);
                if (org.telegram.messenger.i0.L(24.0f) + hintTextWidth > L3) {
                    L3 = org.telegram.messenger.i0.L(24.0f) + hintTextWidth;
                }
                if (L3 <= totalWidth && L2 != this.f27853a.getItemsCount()) {
                    totalWidth = L3;
                }
                this.f27853a.getLayoutParams().width = totalWidth;
            } else {
                this.f27853a.getLayoutParams().width = -2;
            }
            if (this.f27853a.getMeasuredWidth() == measuredWidth && this.f27853a.q()) {
                float measuredWidth2 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                this.e = measuredWidth2;
                int i20 = (int) (mj0Var.G - measuredWidth2);
                this.f27853a.G = i20;
                if (i20 < org.telegram.messenger.i0.L(36.0f)) {
                    this.e = 0.0f;
                    this.f27853a.G = org.telegram.messenger.i0.L(36.0f);
                }
                b();
            } else {
                if (this.f27854b.getSwipeBack() != null) {
                    i13 = this.f27854b.getSwipeBack().getMeasuredWidth() - this.f27854b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                if (this.f27853a.getLayoutParams().width != -2 && this.f27853a.getLayoutParams().width + i13 > measuredWidth) {
                    i13 = org.telegram.messenger.i0.L(8.0f) + (measuredWidth - this.f27853a.getLayoutParams().width);
                }
                if (i13 >= 0) {
                    i16 = i13;
                }
                ((LinearLayout.LayoutParams) this.f27853a.getLayoutParams()).rightMargin = i16;
                this.e = 0.0f;
                b();
            }
            if (this.f27855c != null) {
                if (this.f27853a.q()) {
                    this.f27855c.getLayoutParams().width = org.telegram.messenger.i0.L(16.0f) + childAt.getMeasuredWidth();
                    b();
                } else {
                    this.f27855c.getLayoutParams().width = -1;
                }
                if (this.f27854b.getSwipeBack() != null) {
                    ((LinearLayout.LayoutParams) this.f27855c.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(36.0f) + i16;
                } else {
                    ((LinearLayout.LayoutParams) this.f27855c.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(36.0f);
                }
            }
            super.onMeasure(i14, i12);
        } else {
            super.onMeasure(i14, i12);
        }
        this.d = getMeasuredHeight();
    }

    public void setExpandSize(float f7) {
        this.f27854b.setTranslationY(f7);
        this.f27857n = f7;
        a();
    }

    public void setMaxHeight(int i10) {
        this.d = i10;
    }

    public void setPopupAlpha(float f7) {
        this.f27854b.setAlpha(f7);
        FrameLayout frameLayout = this.f27855c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f27854b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new f2(13, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            yf0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.f32727y.add(new xf0() {
                @Override
                public final void a(float f7, float f10) {
                    ko koVar = ko.this;
                    FrameLayout frameLayout = koVar.f27855c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f10);
                    }
                    koVar.f27856f = f10;
                    koVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(mj0 mj0Var) {
        this.f27853a = mj0Var;
        if (mj0Var != null) {
            mj0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f7) {
        this.f27854b.setReactionsTransitionProgress(f7);
        FrameLayout frameLayout = this.f27855c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
            float f10 = (f7 * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.f27855c;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.f27855c.setPivotY(0.0f);
            this.f27858r = (1.0f - f7) * (-this.f27854b.getMeasuredHeight());
            a();
            this.f27855c.setScaleX(f10);
            this.f27855c.setScaleY(f10);
        }
    }
}
