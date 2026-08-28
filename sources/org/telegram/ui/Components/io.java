package org.telegram.ui.Components;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class io extends LinearLayout {
    public uj0 f29486a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f29487b;
    public FrameLayout f29488c;
    public int d;
    public float f29489e;
    public float f29490f;
    public float h;
    public float f29491n;
    public float f29492r;

    public final void a() {
        FrameLayout frameLayout = this.f29488c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.f29491n + this.f29492r);
        }
    }

    public final void b() {
        float f10 = (1.0f - this.f29490f) * this.f29489e;
        this.f29487b.setTranslationX(f10);
        FrameLayout frameLayout = this.f29488c;
        if (frameLayout != null) {
            frameLayout.setTranslationX(f10);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        ViewGroup viewGroup;
        int i12;
        int i13 = i9;
        int i14 = this.d;
        if (i14 != 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE);
        } else {
            i11 = i10;
        }
        uj0 uj0Var = this.f29486a;
        if (uj0Var != null && this.f29487b != null) {
            uj0Var.getLayoutParams().width = -2;
            int i15 = 0;
            ((LinearLayout.LayoutParams) this.f29486a.getLayoutParams()).rightMargin = 0;
            this.f29489e = 0.0f;
            super.onMeasure(i13, i11);
            int measuredWidth = this.f29486a.getMeasuredWidth();
            if (this.f29487b.getSwipeBack() != null && this.f29487b.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f29487b.getSwipeBack().getMeasuredWidth();
            }
            if (this.f29487b.getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f29487b.getMeasuredWidth();
            }
            if (this.f29486a.q()) {
                i13 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            }
            uj0 uj0Var2 = this.f29486a;
            if (!uj0Var2.f33044a1 && uj0Var2.M0 && uj0Var2.getMeasuredWidth() > 0) {
                int min = Math.min(AndroidUtilities.dp(320.0f), uj0Var2.getMeasuredWidth() - AndroidUtilities.dp(16.0f));
                StaticLayout staticLayout = new StaticLayout(uj0Var2.N0.getText(), uj0Var2.N0.getPaint(), min, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                uj0Var2.P0 = staticLayout.getHeight();
                uj0Var2.O0 = 0;
                for (int i16 = 0; i16 < staticLayout.getLineCount(); i16++) {
                    uj0Var2.O0 = Math.max(uj0Var2.O0, (int) Math.ceil(staticLayout.getLineWidth(i16)));
                }
                if (staticLayout.getLineCount() > 1 && !uj0Var2.N0.getText().toString().contains("\n")) {
                    int a2 = kh.x3.a(uj0Var2.N0.getText(), uj0Var2.N0.getPaint());
                    StaticLayout staticLayout2 = new StaticLayout(uj0Var2.N0.getText(), uj0Var2.N0.getPaint(), a2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    uj0Var2.P0 = staticLayout2.getHeight();
                    uj0Var2.O0 = 0;
                    for (int i17 = 0; i17 < staticLayout2.getLineCount(); i17++) {
                        uj0Var2.O0 = Math.max(uj0Var2.O0, (int) Math.ceil(staticLayout2.getLineWidth(i17)));
                    }
                    uj0Var2.N0.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                    uj0Var2.N0.setWidth(AndroidUtilities.dp(48.0f) + a2);
                } else {
                    uj0Var2.N0.setWidth(AndroidUtilities.dp(16.0f) + min);
                }
                int max = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(7.0f) + uj0Var2.P0);
                int i18 = uj0Var2.I0;
                if (i18 != 1 && i18 != 2) {
                    uj0Var2.getLayoutParams().height = AndroidUtilities.dp(22.0f) + AndroidUtilities.dp(52.0f) + max;
                } else {
                    max = AndroidUtilities.dp(20.0f);
                }
                ((FrameLayout.LayoutParams) uj0Var2.f33076v0.getLayoutParams()).topMargin = max;
                ((FrameLayout.LayoutParams) uj0Var2.f33045b.getLayoutParams()).topMargin = max;
                uj0Var2.f33044a1 = true;
            }
            int totalWidth = this.f29486a.getTotalWidth();
            if (this.f29487b.getSwipeBack() != null) {
                viewGroup = this.f29487b.getSwipeBack();
            } else {
                viewGroup = this.f29487b;
            }
            View childAt = viewGroup.getChildAt(0);
            int dp = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
            int dp2 = AndroidUtilities.dp(36.0f) + AndroidUtilities.dp(16.0f) + dp;
            int hintTextWidth = this.f29486a.getHintTextWidth();
            if (hintTextWidth > dp2) {
                dp2 = hintTextWidth;
            } else if (dp2 > measuredWidth) {
                dp2 = measuredWidth;
            }
            this.f29486a.C = AndroidUtilities.dp(36.0f);
            if (this.f29486a.q()) {
                this.f29486a.getLayoutParams().width = totalWidth;
                this.f29486a.C = Math.max((totalWidth - childAt.getMeasuredWidth()) - AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
            } else if (totalWidth > dp2) {
                int dp3 = ((dp2 - AndroidUtilities.dp(16.0f)) / AndroidUtilities.dp(36.0f)) + 1;
                int dp4 = AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(36.0f) * dp3);
                if (AndroidUtilities.dp(24.0f) + hintTextWidth > dp4) {
                    dp4 = AndroidUtilities.dp(24.0f) + hintTextWidth;
                }
                if (dp4 <= totalWidth && dp3 != this.f29486a.getItemsCount()) {
                    totalWidth = dp4;
                }
                this.f29486a.getLayoutParams().width = totalWidth;
            } else {
                this.f29486a.getLayoutParams().width = -2;
            }
            if (this.f29486a.getMeasuredWidth() == measuredWidth && this.f29486a.q()) {
                float measuredWidth2 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                this.f29489e = measuredWidth2;
                uj0 uj0Var3 = this.f29486a;
                int i19 = (int) (uj0Var3.C - measuredWidth2);
                uj0Var3.C = i19;
                if (i19 < AndroidUtilities.dp(36.0f)) {
                    this.f29489e = 0.0f;
                    this.f29486a.C = AndroidUtilities.dp(36.0f);
                }
                b();
            } else {
                if (this.f29487b.getSwipeBack() != null) {
                    i12 = this.f29487b.getSwipeBack().getMeasuredWidth() - this.f29487b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    i12 = 0;
                }
                if (this.f29486a.getLayoutParams().width != -2 && this.f29486a.getLayoutParams().width + i12 > measuredWidth) {
                    i12 = AndroidUtilities.dp(8.0f) + (measuredWidth - this.f29486a.getLayoutParams().width);
                }
                if (i12 >= 0) {
                    i15 = i12;
                }
                ((LinearLayout.LayoutParams) this.f29486a.getLayoutParams()).rightMargin = i15;
                this.f29489e = 0.0f;
                b();
            }
            if (this.f29488c != null) {
                if (this.f29486a.q()) {
                    this.f29488c.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                    b();
                } else {
                    this.f29488c.getLayoutParams().width = -1;
                }
                if (this.f29487b.getSwipeBack() != null) {
                    ((LinearLayout.LayoutParams) this.f29488c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f) + i15;
                } else {
                    ((LinearLayout.LayoutParams) this.f29488c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f);
                }
            }
            super.onMeasure(i13, i11);
        } else {
            super.onMeasure(i13, i11);
        }
        this.d = getMeasuredHeight();
    }

    public void setExpandSize(float f10) {
        this.f29487b.setTranslationY(f10);
        this.f29491n = f10;
        a();
    }

    public void setMaxHeight(int i9) {
        this.d = i9;
    }

    public void setPopupAlpha(float f10) {
        this.f29487b.setAlpha(f10);
        FrameLayout frameLayout = this.f29488c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f10);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f29487b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new g1(18, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            fg0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.f28425x.add(new eg0() {
                @Override
                public final void a(float f10, float f11) {
                    io ioVar = io.this;
                    FrameLayout frameLayout = ioVar.f29488c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f11);
                    }
                    ioVar.f29490f = f11;
                    ioVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(uj0 uj0Var) {
        this.f29486a = uj0Var;
        if (uj0Var != null) {
            uj0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f10) {
        this.f29487b.setReactionsTransitionProgress(f10);
        FrameLayout frameLayout = this.f29488c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f10);
            float f11 = (f10 * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.f29488c;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.f29488c.setPivotY(0.0f);
            this.f29492r = (1.0f - f10) * (-this.f29487b.getMeasuredHeight());
            a();
            this.f29488c.setScaleX(f11);
            this.f29488c.setScaleY(f11);
        }
    }
}
