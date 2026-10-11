package org.telegram.ui.Components;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class ip extends LinearLayout {
    public ml0 f27409a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f27410b;
    public FrameLayout f27411c;
    public int d;
    public float f27412e;
    public float f27413f;
    public float h;
    public float f27414n;
    public float f27415r;

    public final void a() {
        FrameLayout frameLayout = this.f27411c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.f27414n + this.f27415r);
        }
    }

    public final void b() {
        float f7 = (1.0f - this.f27413f) * this.f27412e;
        this.f27410b.setTranslationX(f7);
        FrameLayout frameLayout = this.f27411c;
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
        ml0 ml0Var;
        int i14 = i10;
        int i15 = this.d;
        if (i15 != 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
        } else {
            i12 = i11;
        }
        ml0 ml0Var2 = this.f27409a;
        if (ml0Var2 != null && this.f27410b != null) {
            ml0Var2.getLayoutParams().width = -2;
            int i16 = 0;
            ((LinearLayout.LayoutParams) this.f27409a.getLayoutParams()).rightMargin = 0;
            this.f27412e = 0.0f;
            super.onMeasure(i14, i12);
            int measuredWidth = this.f27409a.getMeasuredWidth();
            if (this.f27410b.getSwipeBack() != null && this.f27410b.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f27410b.getSwipeBack().getMeasuredWidth();
            }
            if (this.f27410b.getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f27410b.getMeasuredWidth();
            }
            if (this.f27409a.q()) {
                i14 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            }
            ml0 ml0Var3 = this.f27409a;
            if (!ml0Var3.f28763e1 && ml0Var3.Q0 && ml0Var3.getMeasuredWidth() > 0) {
                int min = Math.min(AndroidUtilities.dp(320.0f), ml0Var3.getMeasuredWidth() - AndroidUtilities.dp(16.0f));
                StaticLayout staticLayout = new StaticLayout(ml0Var3.R0.getText(), ml0Var3.R0.getPaint(), min, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                ml0Var3.T0 = staticLayout.getHeight();
                ml0Var3.S0 = 0;
                for (int i17 = 0; i17 < staticLayout.getLineCount(); i17++) {
                    ml0Var3.S0 = Math.max(ml0Var3.S0, (int) Math.ceil(staticLayout.getLineWidth(i17)));
                }
                if (staticLayout.getLineCount() > 1 && !ml0Var3.R0.getText().toString().contains("\n")) {
                    int a2 = ci.d4.a(ml0Var3.R0.getText(), ml0Var3.R0.getPaint());
                    StaticLayout staticLayout2 = new StaticLayout(ml0Var3.R0.getText(), ml0Var3.R0.getPaint(), a2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    ml0Var3.T0 = staticLayout2.getHeight();
                    ml0Var3.S0 = 0;
                    for (int i18 = 0; i18 < staticLayout2.getLineCount(); i18++) {
                        ml0Var3.S0 = Math.max(ml0Var3.S0, (int) Math.ceil(staticLayout2.getLineWidth(i18)));
                    }
                    ml0Var3.R0.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                    ml0Var3.R0.setWidth(AndroidUtilities.dp(48.0f) + a2);
                } else {
                    ml0Var3.R0.setWidth(AndroidUtilities.dp(16.0f) + min);
                }
                int max = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(7.0f) + ml0Var3.T0);
                int i19 = ml0Var3.M0;
                if (i19 != 1 && i19 != 2) {
                    ml0Var3.getLayoutParams().height = AndroidUtilities.dp(22.0f) + AndroidUtilities.dp(52.0f) + max;
                } else {
                    max = AndroidUtilities.dp(20.0f);
                }
                ((FrameLayout.LayoutParams) ml0Var3.f28795z0.getLayoutParams()).topMargin = max;
                ((FrameLayout.LayoutParams) ml0Var3.f28753b.getLayoutParams()).topMargin = max;
                ml0Var3.f28763e1 = true;
            }
            int totalWidth = this.f27409a.getTotalWidth();
            if (this.f27410b.getSwipeBack() != null) {
                viewGroup = this.f27410b.getSwipeBack();
            } else {
                viewGroup = this.f27410b;
            }
            View childAt = viewGroup.getChildAt(0);
            int dp = AndroidUtilities.dp(36.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
            int hintTextWidth = this.f27409a.getHintTextWidth();
            if (hintTextWidth > dp) {
                dp = hintTextWidth;
            } else if (dp > measuredWidth) {
                dp = measuredWidth;
            }
            this.f27409a.G = AndroidUtilities.dp(36.0f);
            if (this.f27409a.q()) {
                this.f27409a.getLayoutParams().width = totalWidth;
                this.f27409a.G = Math.max((totalWidth - childAt.getMeasuredWidth()) - AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
            } else if (totalWidth > dp) {
                int dp2 = ((dp - AndroidUtilities.dp(16.0f)) / AndroidUtilities.dp(36.0f)) + 1;
                int dp3 = AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(36.0f) * dp2);
                if (AndroidUtilities.dp(24.0f) + hintTextWidth > dp3) {
                    dp3 = AndroidUtilities.dp(24.0f) + hintTextWidth;
                }
                if (dp3 <= totalWidth && dp2 != this.f27409a.getItemsCount()) {
                    totalWidth = dp3;
                }
                this.f27409a.getLayoutParams().width = totalWidth;
            } else {
                this.f27409a.getLayoutParams().width = -2;
            }
            if (this.f27409a.getMeasuredWidth() == measuredWidth && this.f27409a.q()) {
                float measuredWidth2 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                this.f27412e = measuredWidth2;
                int i20 = (int) (ml0Var.G - measuredWidth2);
                this.f27409a.G = i20;
                if (i20 < AndroidUtilities.dp(36.0f)) {
                    this.f27412e = 0.0f;
                    this.f27409a.G = AndroidUtilities.dp(36.0f);
                }
                b();
            } else {
                if (this.f27410b.getSwipeBack() != null) {
                    i13 = this.f27410b.getSwipeBack().getMeasuredWidth() - this.f27410b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                if (this.f27409a.getLayoutParams().width != -2 && this.f27409a.getLayoutParams().width + i13 > measuredWidth) {
                    i13 = AndroidUtilities.dp(8.0f) + (measuredWidth - this.f27409a.getLayoutParams().width);
                }
                if (i13 >= 0) {
                    i16 = i13;
                }
                ((LinearLayout.LayoutParams) this.f27409a.getLayoutParams()).rightMargin = i16;
                this.f27412e = 0.0f;
                b();
            }
            if (this.f27411c != null) {
                if (this.f27409a.q()) {
                    this.f27411c.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                    b();
                } else {
                    this.f27411c.getLayoutParams().width = -1;
                }
                if (this.f27410b.getSwipeBack() != null) {
                    ((LinearLayout.LayoutParams) this.f27411c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f) + i16;
                } else {
                    ((LinearLayout.LayoutParams) this.f27411c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f);
                }
            }
            super.onMeasure(i14, i12);
        } else {
            super.onMeasure(i14, i12);
        }
        this.d = getMeasuredHeight();
    }

    public void setExpandSize(float f7) {
        this.f27410b.setTranslationY(f7);
        this.f27414n = f7;
        a();
    }

    public void setMaxHeight(int i10) {
        this.d = i10;
    }

    public void setPopupAlpha(float f7) {
        this.f27410b.setAlpha(f7);
        FrameLayout frameLayout = this.f27411c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f27410b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new y2(11, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            zh0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.f33537x.add(new yh0() {
                @Override
                public final void a(float f7, float f10) {
                    ip ipVar = ip.this;
                    FrameLayout frameLayout = ipVar.f27411c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f10);
                    }
                    ipVar.f27413f = f10;
                    ipVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(ml0 ml0Var) {
        this.f27409a = ml0Var;
        if (ml0Var != null) {
            ml0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f7) {
        this.f27410b.setReactionsTransitionProgress(f7);
        FrameLayout frameLayout = this.f27411c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
            float f10 = (f7 * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.f27411c;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.f27411c.setPivotY(0.0f);
            this.f27415r = (1.0f - f7) * (-this.f27410b.getMeasuredHeight());
            a();
            this.f27411c.setScaleX(f10);
            this.f27411c.setScaleY(f10);
        }
    }
}
