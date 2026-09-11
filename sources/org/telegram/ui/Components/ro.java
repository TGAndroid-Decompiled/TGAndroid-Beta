package org.telegram.ui.Components;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class ro extends LinearLayout {
    public fk0 f30054a;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f30055b;
    public FrameLayout f30056c;
    public int d;
    public float f30057e;
    public float f30058f;
    public float h;
    public float f30059n;
    public float f30060r;

    public final void a() {
        FrameLayout frameLayout = this.f30056c;
        if (frameLayout != null) {
            frameLayout.setTranslationY(this.h + this.f30059n + this.f30060r);
        }
    }

    public final void b() {
        float f7 = (1.0f - this.f30058f) * this.f30057e;
        this.f30055b.setTranslationX(f7);
        FrameLayout frameLayout = this.f30056c;
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
        fk0 fk0Var = this.f30054a;
        if (fk0Var != null && this.f30055b != null) {
            fk0Var.getLayoutParams().width = -2;
            int i16 = 0;
            ((LinearLayout.LayoutParams) this.f30054a.getLayoutParams()).rightMargin = 0;
            this.f30057e = 0.0f;
            super.onMeasure(i14, i12);
            int measuredWidth = this.f30054a.getMeasuredWidth();
            if (this.f30055b.getSwipeBack() != null && this.f30055b.getSwipeBack().getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f30055b.getSwipeBack().getMeasuredWidth();
            }
            if (this.f30055b.getMeasuredWidth() > measuredWidth) {
                measuredWidth = this.f30055b.getMeasuredWidth();
            }
            if (this.f30054a.q()) {
                i14 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            }
            fk0 fk0Var2 = this.f30054a;
            if (!fk0Var2.f26090e1 && fk0Var2.Q0 && fk0Var2.getMeasuredWidth() > 0) {
                int min = Math.min(AndroidUtilities.dp(320.0f), fk0Var2.getMeasuredWidth() - AndroidUtilities.dp(16.0f));
                StaticLayout staticLayout = new StaticLayout(fk0Var2.R0.getText(), fk0Var2.R0.getPaint(), min, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                fk0Var2.T0 = staticLayout.getHeight();
                fk0Var2.S0 = 0;
                for (int i17 = 0; i17 < staticLayout.getLineCount(); i17++) {
                    fk0Var2.S0 = Math.max(fk0Var2.S0, (int) Math.ceil(staticLayout.getLineWidth(i17)));
                }
                if (staticLayout.getLineCount() > 1 && !fk0Var2.R0.getText().toString().contains("\n")) {
                    int a2 = di.f4.a(fk0Var2.R0.getText(), fk0Var2.R0.getPaint());
                    StaticLayout staticLayout2 = new StaticLayout(fk0Var2.R0.getText(), fk0Var2.R0.getPaint(), a2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    fk0Var2.T0 = staticLayout2.getHeight();
                    fk0Var2.S0 = 0;
                    for (int i18 = 0; i18 < staticLayout2.getLineCount(); i18++) {
                        fk0Var2.S0 = Math.max(fk0Var2.S0, (int) Math.ceil(staticLayout2.getLineWidth(i18)));
                    }
                    fk0Var2.R0.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                    fk0Var2.R0.setWidth(AndroidUtilities.dp(48.0f) + a2);
                } else {
                    fk0Var2.R0.setWidth(AndroidUtilities.dp(16.0f) + min);
                }
                int max = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(7.0f) + fk0Var2.T0);
                int i19 = fk0Var2.M0;
                if (i19 != 1 && i19 != 2) {
                    fk0Var2.getLayoutParams().height = AndroidUtilities.dp(22.0f) + AndroidUtilities.dp(52.0f) + max;
                } else {
                    max = AndroidUtilities.dp(20.0f);
                }
                ((FrameLayout.LayoutParams) fk0Var2.f26122z0.getLayoutParams()).topMargin = max;
                ((FrameLayout.LayoutParams) fk0Var2.f26080b.getLayoutParams()).topMargin = max;
                fk0Var2.f26090e1 = true;
            }
            int totalWidth = this.f30054a.getTotalWidth();
            if (this.f30055b.getSwipeBack() != null) {
                viewGroup = this.f30055b.getSwipeBack();
            } else {
                viewGroup = this.f30055b;
            }
            View childAt = viewGroup.getChildAt(0);
            int dp = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
            int dp2 = AndroidUtilities.dp(36.0f) + AndroidUtilities.dp(16.0f) + dp;
            int hintTextWidth = this.f30054a.getHintTextWidth();
            if (hintTextWidth > dp2) {
                dp2 = hintTextWidth;
            } else if (dp2 > measuredWidth) {
                dp2 = measuredWidth;
            }
            this.f30054a.G = AndroidUtilities.dp(36.0f);
            if (this.f30054a.q()) {
                this.f30054a.getLayoutParams().width = totalWidth;
                this.f30054a.G = Math.max((totalWidth - childAt.getMeasuredWidth()) - AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
            } else if (totalWidth > dp2) {
                int dp3 = ((dp2 - AndroidUtilities.dp(16.0f)) / AndroidUtilities.dp(36.0f)) + 1;
                int dp4 = AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(36.0f) * dp3);
                if (AndroidUtilities.dp(24.0f) + hintTextWidth > dp4) {
                    dp4 = AndroidUtilities.dp(24.0f) + hintTextWidth;
                }
                if (dp4 <= totalWidth && dp3 != this.f30054a.getItemsCount()) {
                    totalWidth = dp4;
                }
                this.f30054a.getLayoutParams().width = totalWidth;
            } else {
                this.f30054a.getLayoutParams().width = -2;
            }
            if (this.f30054a.getMeasuredWidth() == measuredWidth && this.f30054a.q()) {
                float measuredWidth2 = (measuredWidth - childAt.getMeasuredWidth()) * 0.25f;
                this.f30057e = measuredWidth2;
                fk0 fk0Var3 = this.f30054a;
                int i20 = (int) (fk0Var3.G - measuredWidth2);
                fk0Var3.G = i20;
                if (i20 < AndroidUtilities.dp(36.0f)) {
                    this.f30057e = 0.0f;
                    this.f30054a.G = AndroidUtilities.dp(36.0f);
                }
                b();
            } else {
                if (this.f30055b.getSwipeBack() != null) {
                    i13 = this.f30055b.getSwipeBack().getMeasuredWidth() - this.f30055b.getSwipeBack().getChildAt(0).getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                if (this.f30054a.getLayoutParams().width != -2 && this.f30054a.getLayoutParams().width + i13 > measuredWidth) {
                    i13 = AndroidUtilities.dp(8.0f) + (measuredWidth - this.f30054a.getLayoutParams().width);
                }
                if (i13 >= 0) {
                    i16 = i13;
                }
                ((LinearLayout.LayoutParams) this.f30054a.getLayoutParams()).rightMargin = i16;
                this.f30057e = 0.0f;
                b();
            }
            if (this.f30056c != null) {
                if (this.f30054a.q()) {
                    this.f30056c.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                    b();
                } else {
                    this.f30056c.getLayoutParams().width = -1;
                }
                if (this.f30055b.getSwipeBack() != null) {
                    ((LinearLayout.LayoutParams) this.f30056c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f) + i16;
                } else {
                    ((LinearLayout.LayoutParams) this.f30056c.getLayoutParams()).rightMargin = AndroidUtilities.dp(36.0f);
                }
            }
            super.onMeasure(i14, i12);
        } else {
            super.onMeasure(i14, i12);
        }
        this.d = getMeasuredHeight();
    }

    public void setExpandSize(float f7) {
        this.f30055b.setTranslationY(f7);
        this.f30059n = f7;
        a();
    }

    public void setMaxHeight(int i10) {
        this.d = i10;
    }

    public void setPopupAlpha(float f7) {
        this.f30055b.setAlpha(f7);
        FrameLayout frameLayout = this.f30056c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
        }
    }

    public void setPopupWindowLayout(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        this.f30055b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnSizeChangedListener(new b3(9, this, actionBarPopupWindow$ActionBarPopupWindowLayout));
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            ug0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            swipeBack.f30896x.add(new tg0() {
                @Override
                public final void a(float f7, float f10) {
                    ro roVar = ro.this;
                    FrameLayout frameLayout = roVar.f30056c;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(1.0f - f10);
                    }
                    roVar.f30058f = f10;
                    roVar.b();
                }
            });
        }
    }

    public void setReactionsLayout(fk0 fk0Var) {
        this.f30054a = fk0Var;
        if (fk0Var != null) {
            fk0Var.setChatScrimView(this);
        }
    }

    public void setReactionsTransitionProgress(float f7) {
        this.f30055b.setReactionsTransitionProgress(f7);
        FrameLayout frameLayout = this.f30056c;
        if (frameLayout != null) {
            frameLayout.setAlpha(f7);
            float f10 = (f7 * 0.5f) + 0.5f;
            FrameLayout frameLayout2 = this.f30056c;
            frameLayout2.setPivotX(frameLayout2.getMeasuredWidth());
            this.f30056c.setPivotY(0.0f);
            this.f30060r = (1.0f - f7) * (-this.f30055b.getMeasuredHeight());
            a();
            this.f30056c.setScaleX(f10);
            this.f30056c.setScaleY(f10);
        }
    }
}
