package org.telegram.ui.Components;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class xo extends LinearLayout {
    public pk0 f29109a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f29110b;
    public FrameLayout f29111c;
    public int d;
    public float e;
    public float f29112f;
    public float h;
    public float f29113n;
    public float f29114r;

    public final void a() {
        FrameLayout frameLayout = this.f29111c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.f29113n + this.f29114r);
        }
    }

    public final void b() {
        float f7 = (1.0f - this.f29112f) * this.e;
        this.f29110b.setTranslationX(f7);
        FrameLayout frameLayout = this.f29111c;
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
        pk0 pk0Var = this.f29109a;
        if (pk0Var != null && this.f29110b != null) {
            pk0Var.getLayoutParams().width = -2;
            int i16 = 0;
            ((LinearLayout.LayoutParams) this.f29109a.getLayoutParams()).rightMargin = 0;
            this.e = 0.0f;
            super.onMeasure(i14, i12);
            int measuredWidth = this.f29109a.getMeasuredWidth();
            if (this.f29110b.getSwipeBack() != null && this.f29110b.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f29110b.getSwipeBack().getMeasuredWidth();
            }
            if (this.f29110b.getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f29110b.getMeasuredWidth();
            }
            if (this.f29109a.q()) {
                i14 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            }
            pk0 pk0Var2 = this.f29109a;
            if (!pk0Var2.f26170e1 && pk0Var2.Q0 && pk0Var2.getMeasuredWidth() > 0) {
                int min = Math.min(AndroidUtilities.dp(320.0f), pk0Var2.getMeasuredWidth() - AndroidUtilities.dp(16.0f));
                StaticLayout staticLayout = new StaticLayout(pk0Var2.R0.getText(), pk0Var2.R0.getPaint(), min, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                pk0Var2.T0 = staticLayout.getHeight();
                pk0Var2.S0 = 0;
                for (int i17 = 0; i17 < staticLayout.getLineCount(); i17++) {
                    pk0Var2.S0 = Math.max(pk0Var2.S0, (int) Math.ceil(staticLayout.getLineWidth(i17)));
                }
                if (staticLayout.getLineCount() > 1 && !pk0Var2.R0.getText().toString().contains("\n")) {
                    int a2 = bi.x4.a(pk0Var2.R0.getText(), pk0Var2.R0.getPaint());
                    StaticLayout staticLayout2 = new StaticLayout(pk0Var2.R0.getText(), pk0Var2.R0.getPaint(), a2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    pk0Var2.T0 = staticLayout2.getHeight();
                    pk0Var2.S0 = 0;
                    for (int i18 = 0; i18 < staticLayout2.getLineCount(); i18++) {
                        pk0Var2.S0 = Math.max(pk0Var2.S0, (int) Math.ceil(staticLayout2.getLineWidth(i18)));
                    }
                    pk0Var2.R0.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                    pk0Var2.R0.setWidth(AndroidUtilities.dp(48.0f) + a2);
                } else {
                    pk0Var2.R0.setWidth(AndroidUtilities.dp(16.0f) + min);
                }
                int max = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(7.0f) + pk0Var2.T0);
                int i19 = pk0Var2.M0;
                if (i19 != 1 && i19 != 2) {
                    pk0Var2.getLayoutParams().height = AndroidUtilities.dp(22.0f) + AndroidUtilities.dp(52.0f) + max;
                } else {
                    max = AndroidUtilities.dp(20.0f);
                }
                ((FrameLayout.LayoutParams) pk0Var2.f26202z0.getLayoutParams()).topMargin = max;
                ((FrameLayout.LayoutParams) pk0Var2.f26161b.getLayoutParams()).topMargin = max;
                pk0Var2.f26170e1 = true;
            }
            int totalWidth = this.f29109a.getTotalWidth();
            if (this.f29110b.getSwipeBack() != null) {
                viewGroup = this.f29110b.getSwipeBack();
            } else {
                viewGroup = this.f29110b;
            }
            View childAt = viewGroup.getChildAt(0);
            int dp = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
            int dp2 = AndroidUtilities.dp(36.0f) + AndroidUtilities.dp(16.0f) + dp;
            int hintTextWidth = this.f29109a.getHintTextWidth();
            if (hintTextWidth > dp2) {
                dp2 = hintTextWidth;
            } else if (dp2 > measuredWidth) {
                dp2 = measuredWidth;
            }
            this.f29109a.G = AndroidUtilities.dp(36.0f);
            if (this.f29109a.q()) {
                this.f29109a.getLayoutParams().width = totalWidth;
                this.f29109a.G = Math.max((totalWidth - childAt.getMeasuredWidth()) - AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
            } else if (totalWidth > dp2) {
                int dp3 = ((dp2 - AndroidUtilities.dp(16.0f)) / AndroidUtilities.dp(36.0f)) + 1;
                int dp4 = AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(36.0f) * dp3);
                if (AndroidUtilities.dp(24.0f) + hintTextWidth > dp4) {
                    dp4 = AndroidUtilities.dp(24.0f) + hintTextWidth;
                }
                if (dp4 <= totalWidth && dp3 != this.f29109a.getItemsCount()) {
                    totalWidth = dp4;
                }
                this.f29109a.getLayoutParams().width = totalWidth;
            } else {
                this.f29109a.getLayoutParams().width = -2;
            }
            if (this.f29109a.getMeasuredWidth() == measuredWidth && this.f29109a.q()) {
                float measuredWidth2 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                this.e = measuredWidth2;
                pk0 pk0Var3 = this.f29109a;
                int i20 = (int) (pk0Var3.G - measuredWidth2);
                pk0Var3.G = i20;
                if (i20 < AndroidUtilities.dp(36.0f)) {
                    this.e = 0.0f;
                    this.f29109a.G = AndroidUtilities.dp(36.0f);
                }
                b();
            } else {
                if (this.f29110b.getSwipeBack() != null) {
                    i13 = this.f29110b.getSwipeBack().getMeasuredWidth() - this.f29110b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                if (this.f29109a.getLayoutParams().width != -2 && this.f29109a.getLayoutParams().width + i13 > measuredWidth) {
                    i13 = AndroidUtilities.dp(8.0f) + (measuredWidth - this.f29109a.getLayoutParams().width);
                }
                if (i13 >= 0) {
                    i16 = i13;
                }
                ((LinearLayout.LayoutParams) this.f29109a.getLayoutParams()).rightMargin = i16;
                this.e = 0.0f;
                b();
            }
            if (this.f29111c != null) {
                if (this.f29109a.q()) {
                    this.f29111c.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                    b();
                } else {
                    this.f29111c.getLayoutParams().width = -1;
                }
                if (this.f29110b.getSwipeBack() != null) {
                    ((LinearLayout.LayoutParams) this.f29111c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f) + i16;
                } else {
                    ((LinearLayout.LayoutParams) this.f29111c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f);
                }
            }
            super.onMeasure(i14, i12);
        } else {
            super.onMeasure(i14, i12);
        }
        this.d = getMeasuredHeight();
    }

    public void setExpandSize(float f7) {
        this.f29110b.setTranslationY(f7);
        this.f29113n = f7;
        a();
    }

    public void setMaxHeight(int i10) {
        this.d = i10;
    }

    public void setPopupAlpha(float f7) {
        this.f29110b.setAlpha(f7);
        FrameLayout frameLayout = this.f29111c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f29110b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new km(4, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            eh0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.f22710x.add(new dh0() {
                @Override
                public final void a(float f7, float f10) {
                    xo xoVar = xo.this;
                    FrameLayout frameLayout = xoVar.f29111c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f10);
                    }
                    xoVar.f29112f = f10;
                    xoVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(pk0 pk0Var) {
        this.f29109a = pk0Var;
        if (pk0Var != null) {
            pk0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f7) {
        this.f29110b.setReactionsTransitionProgress(f7);
        FrameLayout frameLayout = this.f29111c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
            float f10 = (f7 * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.f29111c;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.f29111c.setPivotY(0.0f);
            this.f29114r = (1.0f - f7) * (-this.f29110b.getMeasuredHeight());
            a();
            this.f29111c.setScaleX(f10);
            this.f29111c.setScaleY(f10);
        }
    }
}
