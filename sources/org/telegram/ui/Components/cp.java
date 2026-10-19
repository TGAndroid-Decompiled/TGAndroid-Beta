package org.telegram.ui.Components;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class cp extends LinearLayout {
    public cl0 f25294a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f25295b;
    public FrameLayout f25296c;
    public int d;
    public float e;
    public float f25297f;
    public float h;
    public float f25298n;
    public float f25299r;

    public final void a() {
        FrameLayout frameLayout = this.f25296c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.f25298n + this.f25299r);
        }
    }

    public final void b() {
        float f7 = (1.0f - this.f25297f) * this.e;
        this.f25295b.setTranslationX(f7);
        FrameLayout frameLayout = this.f25296c;
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
        cl0 cl0Var;
        int i14 = i10;
        int i15 = this.d;
        if (i15 != 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
        } else {
            i12 = i11;
        }
        cl0 cl0Var2 = this.f25294a;
        if (cl0Var2 != null && this.f25295b != null) {
            cl0Var2.getLayoutParams().width = -2;
            int i16 = 0;
            ((LinearLayout.LayoutParams) this.f25294a.getLayoutParams()).rightMargin = 0;
            this.e = 0.0f;
            super.onMeasure(i14, i12);
            int measuredWidth = this.f25294a.getMeasuredWidth();
            if (this.f25295b.getSwipeBack() != null && this.f25295b.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f25295b.getSwipeBack().getMeasuredWidth();
            }
            if (this.f25295b.getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f25295b.getMeasuredWidth();
            }
            if (this.f25294a.q()) {
                i14 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            }
            cl0 cl0Var3 = this.f25294a;
            if (!cl0Var3.f25247e1 && cl0Var3.Q0 && cl0Var3.getMeasuredWidth() > 0) {
                int min = Math.min(AndroidUtilities.dp(320.0f), cl0Var3.getMeasuredWidth() - AndroidUtilities.dp(16.0f));
                StaticLayout staticLayout = new StaticLayout(cl0Var3.R0.getText(), cl0Var3.R0.getPaint(), min, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                cl0Var3.T0 = staticLayout.getHeight();
                cl0Var3.S0 = 0;
                for (int i17 = 0; i17 < staticLayout.getLineCount(); i17++) {
                    cl0Var3.S0 = Math.max(cl0Var3.S0, (int) Math.ceil(staticLayout.getLineWidth(i17)));
                }
                if (staticLayout.getLineCount() > 1 && !cl0Var3.R0.getText().toString().contains("\n")) {
                    int a2 = ei.x3.a(cl0Var3.R0.getText(), cl0Var3.R0.getPaint());
                    StaticLayout staticLayout2 = new StaticLayout(cl0Var3.R0.getText(), cl0Var3.R0.getPaint(), a2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    cl0Var3.T0 = staticLayout2.getHeight();
                    cl0Var3.S0 = 0;
                    for (int i18 = 0; i18 < staticLayout2.getLineCount(); i18++) {
                        cl0Var3.S0 = Math.max(cl0Var3.S0, (int) Math.ceil(staticLayout2.getLineWidth(i18)));
                    }
                    cl0Var3.R0.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                    cl0Var3.R0.setWidth(AndroidUtilities.dp(48.0f) + a2);
                } else {
                    cl0Var3.R0.setWidth(AndroidUtilities.dp(16.0f) + min);
                }
                int max = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(7.0f) + cl0Var3.T0);
                int i19 = cl0Var3.M0;
                if (i19 != 1 && i19 != 2) {
                    cl0Var3.getLayoutParams().height = AndroidUtilities.dp(22.0f) + AndroidUtilities.dp(52.0f) + max;
                } else {
                    max = AndroidUtilities.dp(20.0f);
                }
                ((FrameLayout.LayoutParams) cl0Var3.f25279z0.getLayoutParams()).topMargin = max;
                ((FrameLayout.LayoutParams) cl0Var3.f25238b.getLayoutParams()).topMargin = max;
                cl0Var3.f25247e1 = true;
            }
            int totalWidth = this.f25294a.getTotalWidth();
            if (this.f25295b.getSwipeBack() != null) {
                viewGroup = this.f25295b.getSwipeBack();
            } else {
                viewGroup = this.f25295b;
            }
            View childAt = viewGroup.getChildAt(0);
            int dp = AndroidUtilities.dp(36.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
            int hintTextWidth = this.f25294a.getHintTextWidth();
            if (hintTextWidth > dp) {
                dp = hintTextWidth;
            } else if (dp > measuredWidth) {
                dp = measuredWidth;
            }
            this.f25294a.G = AndroidUtilities.dp(36.0f);
            if (this.f25294a.q()) {
                this.f25294a.getLayoutParams().width = totalWidth;
                this.f25294a.G = Math.max((totalWidth - childAt.getMeasuredWidth()) - AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
            } else if (totalWidth > dp) {
                int dp2 = ((dp - AndroidUtilities.dp(16.0f)) / AndroidUtilities.dp(36.0f)) + 1;
                int dp3 = AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(36.0f) * dp2);
                if (AndroidUtilities.dp(24.0f) + hintTextWidth > dp3) {
                    dp3 = AndroidUtilities.dp(24.0f) + hintTextWidth;
                }
                if (dp3 <= totalWidth && dp2 != this.f25294a.getItemsCount()) {
                    totalWidth = dp3;
                }
                this.f25294a.getLayoutParams().width = totalWidth;
            } else {
                this.f25294a.getLayoutParams().width = -2;
            }
            if (this.f25294a.getMeasuredWidth() == measuredWidth && this.f25294a.q()) {
                float measuredWidth2 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                this.e = measuredWidth2;
                int i20 = (int) (cl0Var.G - measuredWidth2);
                this.f25294a.G = i20;
                if (i20 < AndroidUtilities.dp(36.0f)) {
                    this.e = 0.0f;
                    this.f25294a.G = AndroidUtilities.dp(36.0f);
                }
                b();
            } else {
                if (this.f25295b.getSwipeBack() != null) {
                    i13 = this.f25295b.getSwipeBack().getMeasuredWidth() - this.f25295b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                if (this.f25294a.getLayoutParams().width != -2 && this.f25294a.getLayoutParams().width + i13 > measuredWidth) {
                    i13 = AndroidUtilities.dp(8.0f) + (measuredWidth - this.f25294a.getLayoutParams().width);
                }
                if (i13 >= 0) {
                    i16 = i13;
                }
                ((LinearLayout.LayoutParams) this.f25294a.getLayoutParams()).rightMargin = i16;
                this.e = 0.0f;
                b();
            }
            if (this.f25296c != null) {
                if (this.f25294a.q()) {
                    this.f25296c.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                    b();
                } else {
                    this.f25296c.getLayoutParams().width = -1;
                }
                if (this.f25295b.getSwipeBack() != null) {
                    ((LinearLayout.LayoutParams) this.f25296c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f) + i16;
                } else {
                    ((LinearLayout.LayoutParams) this.f25296c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f);
                }
            }
            super.onMeasure(i14, i12);
        } else {
            super.onMeasure(i14, i12);
        }
        this.d = getMeasuredHeight();
    }

    public void setExpandSize(float f7) {
        this.f25295b.setTranslationY(f7);
        this.f25298n = f7;
        a();
    }

    public void setMaxHeight(int i10) {
        this.d = i10;
    }

    public void setPopupAlpha(float f7) {
        this.f25295b.setAlpha(f7);
        FrameLayout frameLayout = this.f25296c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f25295b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new q2(14, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            ph0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.f29282x.add(new oh0() {
                @Override
                public final void a(float f7, float f10) {
                    cp cpVar = cp.this;
                    FrameLayout frameLayout = cpVar.f25296c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f10);
                    }
                    cpVar.f25297f = f10;
                    cpVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(cl0 cl0Var) {
        this.f25294a = cl0Var;
        if (cl0Var != null) {
            cl0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f7) {
        this.f25295b.setReactionsTransitionProgress(f7);
        FrameLayout frameLayout = this.f25296c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
            float f10 = (f7 * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.f25296c;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.f25296c.setPivotY(0.0f);
            this.f25299r = (1.0f - f7) * (-this.f25295b.getMeasuredHeight());
            a();
            this.f25296c.setScaleX(f10);
            this.f25296c.setScaleY(f10);
        }
    }
}
