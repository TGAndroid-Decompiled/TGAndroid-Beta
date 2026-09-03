package org.telegram.ui.Components;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class no extends LinearLayout {
    public pk0 f27318a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f27319b;
    public FrameLayout f27320c;
    public int d;
    public float e;
    public float f27321f;
    public float h;
    public float f27322n;
    public float f27323r;

    public final void a() {
        FrameLayout frameLayout = this.f27320c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.f27322n + this.f27323r);
        }
    }

    public final void b() {
        float f10 = (1.0f - this.f27321f) * this.e;
        this.f27319b.setTranslationX(f10);
        FrameLayout frameLayout = this.f27320c;
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
        pk0 pk0Var = this.f27318a;
        if (pk0Var != null && this.f27319b != null) {
            pk0Var.getLayoutParams().width = -2;
            int i16 = 0;
            ((LinearLayout.LayoutParams) this.f27318a.getLayoutParams()).rightMargin = 0;
            this.e = 0.0f;
            super.onMeasure(i14, i12);
            int measuredWidth = this.f27318a.getMeasuredWidth();
            if (this.f27319b.getSwipeBack() != null && this.f27319b.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f27319b.getSwipeBack().getMeasuredWidth();
            }
            if (this.f27319b.getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f27319b.getMeasuredWidth();
            }
            if (this.f27318a.q()) {
                i14 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            }
            pk0 pk0Var2 = this.f27318a;
            if (!pk0Var2.f27885b1 && pk0Var2.N0 && pk0Var2.getMeasuredWidth() > 0) {
                int min = Math.min(AndroidUtilities.dp(320.0f), pk0Var2.getMeasuredWidth() - AndroidUtilities.dp(16.0f));
                StaticLayout staticLayout = new StaticLayout(pk0Var2.O0.getText(), pk0Var2.O0.getPaint(), min, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                pk0Var2.Q0 = staticLayout.getHeight();
                pk0Var2.P0 = 0;
                for (int i17 = 0; i17 < staticLayout.getLineCount(); i17++) {
                    pk0Var2.P0 = Math.max(pk0Var2.P0, (int) Math.ceil(staticLayout.getLineWidth(i17)));
                }
                if (staticLayout.getLineCount() > 1 && !pk0Var2.O0.getText().toString().contains("\n")) {
                    int a2 = ph.f3.a(pk0Var2.O0.getText(), pk0Var2.O0.getPaint());
                    StaticLayout staticLayout2 = new StaticLayout(pk0Var2.O0.getText(), pk0Var2.O0.getPaint(), a2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    pk0Var2.Q0 = staticLayout2.getHeight();
                    pk0Var2.P0 = 0;
                    for (int i18 = 0; i18 < staticLayout2.getLineCount(); i18++) {
                        pk0Var2.P0 = Math.max(pk0Var2.P0, (int) Math.ceil(staticLayout2.getLineWidth(i18)));
                    }
                    pk0Var2.O0.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                    pk0Var2.O0.setWidth(AndroidUtilities.dp(48.0f) + a2);
                } else {
                    pk0Var2.O0.setWidth(AndroidUtilities.dp(16.0f) + min);
                }
                int max = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(7.0f) + pk0Var2.Q0);
                int i19 = pk0Var2.J0;
                if (i19 != 1 && i19 != 2) {
                    pk0Var2.getLayoutParams().height = AndroidUtilities.dp(22.0f) + AndroidUtilities.dp(52.0f) + max;
                } else {
                    max = AndroidUtilities.dp(20.0f);
                }
                ((FrameLayout.LayoutParams) pk0Var2.f27916w0.getLayoutParams()).topMargin = max;
                ((FrameLayout.LayoutParams) pk0Var2.f27883b.getLayoutParams()).topMargin = max;
                pk0Var2.f27885b1 = true;
            }
            int totalWidth = this.f27318a.getTotalWidth();
            if (this.f27319b.getSwipeBack() != null) {
                viewGroup = this.f27319b.getSwipeBack();
            } else {
                viewGroup = this.f27319b;
            }
            View childAt = viewGroup.getChildAt(0);
            int dp = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
            int dp2 = AndroidUtilities.dp(36.0f) + AndroidUtilities.dp(16.0f) + dp;
            int hintTextWidth = this.f27318a.getHintTextWidth();
            if (hintTextWidth > dp2) {
                dp2 = hintTextWidth;
            } else if (dp2 > measuredWidth) {
                dp2 = measuredWidth;
            }
            this.f27318a.D = AndroidUtilities.dp(36.0f);
            if (this.f27318a.q()) {
                this.f27318a.getLayoutParams().width = totalWidth;
                this.f27318a.D = Math.max((totalWidth - childAt.getMeasuredWidth()) - AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
            } else if (totalWidth > dp2) {
                int dp3 = ((dp2 - AndroidUtilities.dp(16.0f)) / AndroidUtilities.dp(36.0f)) + 1;
                int dp4 = AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(36.0f) * dp3);
                if (AndroidUtilities.dp(24.0f) + hintTextWidth > dp4) {
                    dp4 = AndroidUtilities.dp(24.0f) + hintTextWidth;
                }
                if (dp4 <= totalWidth && dp3 != this.f27318a.getItemsCount()) {
                    totalWidth = dp4;
                }
                this.f27318a.getLayoutParams().width = totalWidth;
            } else {
                this.f27318a.getLayoutParams().width = -2;
            }
            if (this.f27318a.getMeasuredWidth() == measuredWidth && this.f27318a.q()) {
                float measuredWidth2 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                this.e = measuredWidth2;
                pk0 pk0Var3 = this.f27318a;
                int i20 = (int) (pk0Var3.D - measuredWidth2);
                pk0Var3.D = i20;
                if (i20 < AndroidUtilities.dp(36.0f)) {
                    this.e = 0.0f;
                    this.f27318a.D = AndroidUtilities.dp(36.0f);
                }
                b();
            } else {
                if (this.f27319b.getSwipeBack() != null) {
                    i13 = this.f27319b.getSwipeBack().getMeasuredWidth() - this.f27319b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                if (this.f27318a.getLayoutParams().width != -2 && this.f27318a.getLayoutParams().width + i13 > measuredWidth) {
                    i13 = AndroidUtilities.dp(8.0f) + (measuredWidth - this.f27318a.getLayoutParams().width);
                }
                if (i13 >= 0) {
                    i16 = i13;
                }
                ((LinearLayout.LayoutParams) this.f27318a.getLayoutParams()).rightMargin = i16;
                this.e = 0.0f;
                b();
            }
            if (this.f27320c != null) {
                if (this.f27318a.q()) {
                    this.f27320c.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                    b();
                } else {
                    this.f27320c.getLayoutParams().width = -1;
                }
                if (this.f27319b.getSwipeBack() != null) {
                    ((LinearLayout.LayoutParams) this.f27320c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f) + i16;
                } else {
                    ((LinearLayout.LayoutParams) this.f27320c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f);
                }
            }
            super.onMeasure(i14, i12);
        } else {
            super.onMeasure(i14, i12);
        }
        this.d = getMeasuredHeight();
    }

    public void setExpandSize(float f10) {
        this.f27319b.setTranslationY(f10);
        this.f27322n = f10;
        a();
    }

    public void setMaxHeight(int i10) {
        this.d = i10;
    }

    public void setPopupAlpha(float f10) {
        this.f27319b.setAlpha(f10);
        FrameLayout frameLayout = this.f27320c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f10);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f27319b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new o1(17, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            bh0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.f23690x.add(new ah0() {
                @Override
                public final void a(float f10, float f11) {
                    no noVar = no.this;
                    FrameLayout frameLayout = noVar.f27320c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f11);
                    }
                    noVar.f27321f = f11;
                    noVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(pk0 pk0Var) {
        this.f27318a = pk0Var;
        if (pk0Var != null) {
            pk0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f10) {
        this.f27319b.setReactionsTransitionProgress(f10);
        FrameLayout frameLayout = this.f27320c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f10);
            float f11 = (f10 * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.f27320c;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.f27320c.setPivotY(0.0f);
            this.f27323r = (1.0f - f10) * (-this.f27319b.getMeasuredHeight());
            a();
            this.f27320c.setScaleX(f11);
            this.f27320c.setScaleY(f11);
        }
    }
}
