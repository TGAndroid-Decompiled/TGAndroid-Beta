package org.telegram.ui.Components;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

public abstract class go extends LinearLayout {

    public wj0 f28772a;

    public ActionBarPopupWindow$ActionBarPopupWindowLayout f28773b;

    public FrameLayout f28774c;
    public int d;

    public float f28775e;

    public float f28776f;
    public float h;

    public float f28777n;

    public float f28778r;

    public final void a() {
        FrameLayout frameLayout = this.f28774c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.f28777n + this.f28778r);
        }
    }

    public final void b() {
        float f10 = (1.0f - this.f28776f) * this.f28775e;
        this.f28773b.setTranslationX(f10);
        FrameLayout frameLayout = this.f28774c;
        if (frameLayout != null) {
            frameLayout.setTranslationX(f10);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec = i10;
        int i12 = this.d;
        int iMakeMeasureSpec2 = i12 != 0 ? View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE) : i11;
        wj0 wj0Var = this.f28772a;
        if (wj0Var == null || this.f28773b == null) {
            super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        } else {
            wj0Var.getLayoutParams().width = -2;
            int i13 = 0;
            ((LinearLayout.LayoutParams) this.f28772a.getLayoutParams()).rightMargin = 0;
            this.f28775e = 0.0f;
            super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = this.f28772a.getMeasuredWidth();
            if (this.f28773b.getSwipeBack() != null && this.f28773b.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f28773b.getSwipeBack().getMeasuredWidth();
            }
            if (this.f28773b.getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f28773b.getMeasuredWidth();
            }
            if (this.f28772a.q()) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            }
            wj0 wj0Var2 = this.f28772a;
            if (!wj0Var2.f34235a1 && wj0Var2.M0 && wj0Var2.getMeasuredWidth() > 0) {
                int iMin = Math.min(AndroidUtilities.dp(320.0f), wj0Var2.getMeasuredWidth() - AndroidUtilities.dp(16.0f));
                StaticLayout staticLayout = new StaticLayout(wj0Var2.N0.getText(), wj0Var2.N0.getPaint(), iMin, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                wj0Var2.P0 = staticLayout.getHeight();
                wj0Var2.O0 = 0;
                for (int i14 = 0; i14 < staticLayout.getLineCount(); i14++) {
                    wj0Var2.O0 = Math.max(wj0Var2.O0, (int) Math.ceil(staticLayout.getLineWidth(i14)));
                }
                if (staticLayout.getLineCount() <= 1 || wj0Var2.N0.getText().toString().contains("\n")) {
                    wj0Var2.N0.setWidth(AndroidUtilities.dp(16.0f) + iMin);
                } else {
                    int iA = lh.w3.a(wj0Var2.N0.getText(), wj0Var2.N0.getPaint());
                    StaticLayout staticLayout2 = new StaticLayout(wj0Var2.N0.getText(), wj0Var2.N0.getPaint(), iA, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    wj0Var2.P0 = staticLayout2.getHeight();
                    wj0Var2.O0 = 0;
                    for (int i15 = 0; i15 < staticLayout2.getLineCount(); i15++) {
                        wj0Var2.O0 = Math.max(wj0Var2.O0, (int) Math.ceil(staticLayout2.getLineWidth(i15)));
                    }
                    wj0Var2.N0.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                    wj0Var2.N0.setWidth(AndroidUtilities.dp(48.0f) + iA);
                }
                int iMax = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(7.0f) + wj0Var2.P0);
                int i16 = wj0Var2.I0;
                if (i16 == 1 || i16 == 2) {
                    iMax = AndroidUtilities.dp(20.0f);
                } else {
                    wj0Var2.getLayoutParams().height = AndroidUtilities.dp(22.0f) + AndroidUtilities.dp(52.0f) + iMax;
                }
                ((FrameLayout.LayoutParams) wj0Var2.f34267v0.getLayoutParams()).topMargin = iMax;
                ((FrameLayout.LayoutParams) wj0Var2.f34236b.getLayoutParams()).topMargin = iMax;
                wj0Var2.f34235a1 = true;
            }
            int totalWidth = this.f28772a.getTotalWidth();
            View childAt = (this.f28773b.getSwipeBack() != null ? this.f28773b.getSwipeBack() : this.f28773b).getChildAt(0);
            int iDp = AndroidUtilities.dp(36.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
            int hintTextWidth = this.f28772a.getHintTextWidth();
            if (hintTextWidth > iDp) {
                iDp = hintTextWidth;
            } else if (iDp > measuredWidth) {
                iDp = measuredWidth;
            }
            this.f28772a.C = AndroidUtilities.dp(36.0f);
            if (this.f28772a.q()) {
                this.f28772a.getLayoutParams().width = totalWidth;
                this.f28772a.C = Math.max((totalWidth - childAt.getMeasuredWidth()) - AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
            } else if (totalWidth > iDp) {
                int iDp2 = ((iDp - AndroidUtilities.dp(16.0f)) / AndroidUtilities.dp(36.0f)) + 1;
                int iDp3 = AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(36.0f) * iDp2);
                if (AndroidUtilities.dp(24.0f) + hintTextWidth > iDp3) {
                    iDp3 = AndroidUtilities.dp(24.0f) + hintTextWidth;
                }
                if (iDp3 <= totalWidth && iDp2 != this.f28772a.getItemsCount()) {
                    totalWidth = iDp3;
                }
                this.f28772a.getLayoutParams().width = totalWidth;
            } else {
                this.f28772a.getLayoutParams().width = -2;
            }
            if (this.f28772a.getMeasuredWidth() == measuredWidth && this.f28772a.q()) {
                float measuredWidth2 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                this.f28775e = measuredWidth2;
                wj0 wj0Var3 = this.f28772a;
                int i17 = (int) (wj0Var3.C - measuredWidth2);
                wj0Var3.C = i17;
                if (i17 < AndroidUtilities.dp(36.0f)) {
                    this.f28775e = 0.0f;
                    this.f28772a.C = AndroidUtilities.dp(36.0f);
                }
                b();
            } else {
                int measuredWidth3 = this.f28773b.getSwipeBack() != null ? this.f28773b.getSwipeBack().getMeasuredWidth() - this.f28773b.getSwipeBack().getChildAt(0).getMeasuredWidth() : 0;
                if (this.f28772a.getLayoutParams().width != -2 && this.f28772a.getLayoutParams().width + measuredWidth3 > measuredWidth) {
                    measuredWidth3 = AndroidUtilities.dp(8.0f) + (measuredWidth - this.f28772a.getLayoutParams().width);
                }
                i13 = measuredWidth3 >= 0 ? measuredWidth3 : 0;
                ((LinearLayout.LayoutParams) this.f28772a.getLayoutParams()).rightMargin = i13;
                this.f28775e = 0.0f;
                b();
            }
            if (this.f28774c != null) {
                if (this.f28772a.q()) {
                    this.f28774c.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                    b();
                } else {
                    this.f28774c.getLayoutParams().width = -1;
                }
                if (this.f28773b.getSwipeBack() != null) {
                    ((LinearLayout.LayoutParams) this.f28774c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f) + i13;
                } else {
                    ((LinearLayout.LayoutParams) this.f28774c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f);
                }
            }
            super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        }
        this.d = getMeasuredHeight();
    }

    public void setExpandSize(float f10) {
        this.f28773b.setTranslationY(f10);
        this.f28777n = f10;
        a();
    }

    public void setMaxHeight(int i10) {
        this.d = i10;
    }

    public void setPopupAlpha(float f10) {
        this.f28773b.setAlpha(f10);
        FrameLayout frameLayout = this.f28774c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f10);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f28773b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new g1(18, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            hg0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.f29015x.add(new gg0() {
                @Override
                public final void a(float f10, float f11) {
                    go goVar = this.f28410a;
                    FrameLayout frameLayout = goVar.f28774c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f11);
                    }
                    goVar.f28776f = f11;
                    goVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(wj0 wj0Var) {
        this.f28772a = wj0Var;
        if (wj0Var != null) {
            wj0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f10) {
        this.f28773b.setReactionsTransitionProgress(f10);
        FrameLayout frameLayout = this.f28774c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f10);
            float f11 = (f10 * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.f28774c;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.f28774c.setPivotY(0.0f);
            this.f28778r = (1.0f - f10) * (-this.f28773b.getMeasuredHeight());
            a();
            this.f28774c.setScaleX(f11);
            this.f28774c.setScaleY(f11);
        }
    }
}
