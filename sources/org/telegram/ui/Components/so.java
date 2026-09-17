package org.telegram.ui.Components;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class so extends LinearLayout {
    public gk0 f27889a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f27890b;
    public FrameLayout f27891c;
    public int d;
    public float e;
    public float f27892f;
    public float h;
    public float f27893n;
    public float f27894r;

    public final void a() {
        FrameLayout frameLayout = this.f27891c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.f27893n + this.f27894r);
        }
    }

    public final void b() {
        float f7 = (1.0f - this.f27892f) * this.e;
        this.f27890b.setTranslationX(f7);
        FrameLayout frameLayout = this.f27891c;
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
        int i14 = i10;
        int i15 = this.d;
        if (i15 != 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
        } else {
            i12 = i11;
        }
        gk0 gk0Var = this.f27889a;
        if (gk0Var != null && this.f27890b != null) {
            gk0Var.getLayoutParams().width = -2;
            int i16 = 0;
            ((LinearLayout.LayoutParams) this.f27889a.getLayoutParams()).rightMargin = 0;
            this.e = 0.0f;
            super.onMeasure(i14, i12);
            int measuredWidth = this.f27889a.getMeasuredWidth();
            if (this.f27890b.getSwipeBack() != null && this.f27890b.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f27890b.getSwipeBack().getMeasuredWidth();
            }
            if (this.f27890b.getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f27890b.getMeasuredWidth();
            }
            if (this.f27889a.q()) {
                i14 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            }
            gk0 gk0Var2 = this.f27889a;
            if (!gk0Var2.f24277e1 && gk0Var2.Q0 && gk0Var2.getMeasuredWidth() > 0) {
                int min = Math.min(AndroidUtilities.dp(320.0f), gk0Var2.getMeasuredWidth() - AndroidUtilities.dp(16.0f));
                StaticLayout staticLayout = new StaticLayout(gk0Var2.R0.getText(), gk0Var2.R0.getPaint(), min, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                gk0Var2.T0 = staticLayout.getHeight();
                gk0Var2.S0 = 0;
                for (int i17 = 0; i17 < staticLayout.getLineCount(); i17++) {
                    gk0Var2.S0 = Math.max(gk0Var2.S0, (int) Math.ceil(staticLayout.getLineWidth(i17)));
                }
                if (staticLayout.getLineCount() > 1 && !gk0Var2.R0.getText().toString().contains("\n")) {
                    int a2 = ci.f4.a(gk0Var2.R0.getText(), gk0Var2.R0.getPaint());
                    StaticLayout staticLayout2 = new StaticLayout(gk0Var2.R0.getText(), gk0Var2.R0.getPaint(), a2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    gk0Var2.T0 = staticLayout2.getHeight();
                    gk0Var2.S0 = 0;
                    for (int i18 = 0; i18 < staticLayout2.getLineCount(); i18++) {
                        gk0Var2.S0 = Math.max(gk0Var2.S0, (int) Math.ceil(staticLayout2.getLineWidth(i18)));
                    }
                    gk0Var2.R0.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                    gk0Var2.R0.setWidth(AndroidUtilities.dp(48.0f) + a2);
                } else {
                    gk0Var2.R0.setWidth(AndroidUtilities.dp(16.0f) + min);
                }
                int max = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(7.0f) + gk0Var2.T0);
                int i19 = gk0Var2.M0;
                if (i19 != 1 && i19 != 2) {
                    gk0Var2.getLayoutParams().height = AndroidUtilities.dp(22.0f) + AndroidUtilities.dp(52.0f) + max;
                } else {
                    max = AndroidUtilities.dp(20.0f);
                }
                ((FrameLayout.LayoutParams) gk0Var2.f24309z0.getLayoutParams()).topMargin = max;
                ((FrameLayout.LayoutParams) gk0Var2.f24268b.getLayoutParams()).topMargin = max;
                gk0Var2.f24277e1 = true;
            }
            int totalWidth = this.f27889a.getTotalWidth();
            if (this.f27890b.getSwipeBack() != null) {
                viewGroup = this.f27890b.getSwipeBack();
            } else {
                viewGroup = this.f27890b;
            }
            View childAt = viewGroup.getChildAt(0);
            int dp = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
            int dp2 = AndroidUtilities.dp(36.0f) + AndroidUtilities.dp(16.0f) + dp;
            int hintTextWidth = this.f27889a.getHintTextWidth();
            if (hintTextWidth > dp2) {
                dp2 = hintTextWidth;
            } else if (dp2 > measuredWidth) {
                dp2 = measuredWidth;
            }
            this.f27889a.G = AndroidUtilities.dp(36.0f);
            if (this.f27889a.q()) {
                this.f27889a.getLayoutParams().width = totalWidth;
                this.f27889a.G = Math.max((totalWidth - childAt.getMeasuredWidth()) - AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
            } else if (totalWidth > dp2) {
                int dp3 = ((dp2 - AndroidUtilities.dp(16.0f)) / AndroidUtilities.dp(36.0f)) + 1;
                int dp4 = AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(36.0f) * dp3);
                if (AndroidUtilities.dp(24.0f) + hintTextWidth > dp4) {
                    dp4 = AndroidUtilities.dp(24.0f) + hintTextWidth;
                }
                if (dp4 <= totalWidth && dp3 != this.f27889a.getItemsCount()) {
                    totalWidth = dp4;
                }
                this.f27889a.getLayoutParams().width = totalWidth;
            } else {
                this.f27889a.getLayoutParams().width = -2;
            }
            if (this.f27889a.getMeasuredWidth() == measuredWidth && this.f27889a.q()) {
                float measuredWidth2 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                this.e = measuredWidth2;
                gk0 gk0Var3 = this.f27889a;
                int i20 = (int) (gk0Var3.G - measuredWidth2);
                gk0Var3.G = i20;
                if (i20 < AndroidUtilities.dp(36.0f)) {
                    this.e = 0.0f;
                    this.f27889a.G = AndroidUtilities.dp(36.0f);
                }
                b();
            } else {
                if (this.f27890b.getSwipeBack() != null) {
                    i13 = this.f27890b.getSwipeBack().getMeasuredWidth() - this.f27890b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                if (this.f27889a.getLayoutParams().width != -2 && this.f27889a.getLayoutParams().width + i13 > measuredWidth) {
                    i13 = AndroidUtilities.dp(8.0f) + (measuredWidth - this.f27889a.getLayoutParams().width);
                }
                if (i13 >= 0) {
                    i16 = i13;
                }
                ((LinearLayout.LayoutParams) this.f27889a.getLayoutParams()).rightMargin = i16;
                this.e = 0.0f;
                b();
            }
            if (this.f27891c != null) {
                if (this.f27889a.q()) {
                    this.f27891c.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                    b();
                } else {
                    this.f27891c.getLayoutParams().width = -1;
                }
                if (this.f27890b.getSwipeBack() != null) {
                    ((LinearLayout.LayoutParams) this.f27891c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f) + i16;
                } else {
                    ((LinearLayout.LayoutParams) this.f27891c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f);
                }
            }
            super.onMeasure(i14, i12);
        } else {
            super.onMeasure(i14, i12);
        }
        this.d = getMeasuredHeight();
    }

    public void setExpandSize(float f7) {
        this.f27890b.setTranslationY(f7);
        this.f27893n = f7;
        a();
    }

    public void setMaxHeight(int i10) {
        this.d = i10;
    }

    public void setPopupAlpha(float f7) {
        this.f27890b.setAlpha(f7);
        FrameLayout frameLayout = this.f27891c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f27890b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new mf(8, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            vg0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.f28719x.add(new ug0() {
                @Override
                public final void a(float f7, float f10) {
                    so soVar = so.this;
                    FrameLayout frameLayout = soVar.f27891c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f10);
                    }
                    soVar.f27892f = f10;
                    soVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(gk0 gk0Var) {
        this.f27889a = gk0Var;
        if (gk0Var != null) {
            gk0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f7) {
        this.f27890b.setReactionsTransitionProgress(f7);
        FrameLayout frameLayout = this.f27891c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
            float f10 = (f7 * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.f27891c;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.f27891c.setPivotY(0.0f);
            this.f27894r = (1.0f - f7) * (-this.f27890b.getMeasuredHeight());
            a();
            this.f27891c.setScaleX(f10);
            this.f27891c.setScaleY(f10);
        }
    }
}
