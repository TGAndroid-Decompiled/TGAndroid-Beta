package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.nk;
import org.telegram.ui.fb1;
import org.telegram.ui.kc1;
import org.telegram.ui.qn;
public final class p0 extends FrameLayout {
    public final int f21664a;
    public boolean f21665b;
    public final Object f21666c;

    public p0(Object obj, Context context, int i10) {
        super(context);
        this.f21664a = i10;
        this.f21666c = obj;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        int i10;
        switch (this.f21664a) {
            case 2:
                boolean drawChild = super.drawChild(canvas, view, j10);
                kc1 kc1Var = (kc1) this.f21666c;
                if (view == kc1Var.f38571s0 && kc1.r0(kc1Var) != null) {
                    d5 s02 = kc1.s0(kc1Var);
                    if (kc1Var.f38571s0.getVisibility() == 0) {
                        i10 = (int) (kc1Var.f38571s0.getTranslationY() + kc1Var.f38571s0.getMeasuredHeight());
                    } else {
                        i10 = 0;
                    }
                    ((ActionBarLayout) s02).q(canvas, i10);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f21664a) {
            case 0:
                u0 u0Var = (u0) this.f21666c;
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = 0;
                if (!LocaleController.isRTL && u0Var.h.getVisibility() == 0) {
                    i14 = AndroidUtilities.dp(4.0f) + u0Var.h.getMeasuredWidth();
                }
                if (u0Var.f21742f.getVisibility() == 0) {
                    i14 += u0Var.f21742f.getMeasuredWidth();
                }
                ei.e2 e2Var = u0Var.e;
                e2Var.layout(i14, e2Var.getTop(), u0Var.e.getMeasuredWidth() + i14, u0Var.e.getBottom());
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        TextView textView;
        float f7;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        switch (this.f21664a) {
            case 0:
                u0 u0Var = (u0) this.f21666c;
                measureChildWithMargins(u0Var.f21757s, i10, 0, i11, 0);
                View view = u0Var.f21761w;
                if (view != null) {
                    measureChildWithMargins(view, i10, 0, i11, 0);
                }
                if (!LocaleController.isRTL) {
                    if (u0Var.h.getVisibility() == 0) {
                        measureChildWithMargins(u0Var.h, i10, View.MeasureSpec.getSize(i10) / 2, i11, 0);
                        i14 = AndroidUtilities.dp(4.0f) + u0Var.h.getMeasuredWidth();
                    } else {
                        i14 = 0;
                    }
                    int size = View.MeasureSpec.getSize(i10);
                    this.f21665b = true;
                    measureChildWithMargins(u0Var.f21742f, i10, i14, i11, 0);
                    if (u0Var.f21742f.getVisibility() == 0) {
                        i15 = u0Var.f21742f.getMeasuredWidth();
                    } else {
                        i15 = 0;
                    }
                    ei.e2 e2Var = u0Var.e;
                    int i25 = i14 + i15;
                    View view2 = u0Var.f21761w;
                    if (view2 != null) {
                        i16 = view2.getMeasuredWidth();
                    } else {
                        i16 = 0;
                    }
                    measureChildWithMargins(e2Var, i10, i25 + i16, i11, 0);
                    this.f21665b = false;
                    setMeasuredDimension(Math.max(u0Var.e.getMeasuredWidth() + i15, size), View.MeasureSpec.getSize(i11));
                    return;
                }
                if (u0Var.h.getVisibility() == 0) {
                    measureChildWithMargins(u0Var.h, i10, View.MeasureSpec.getSize(i10) / 2, i11, 0);
                    i12 = AndroidUtilities.dp(4.0f) + u0Var.h.getMeasuredWidth();
                } else {
                    i12 = 0;
                }
                int size2 = View.MeasureSpec.getSize(i10);
                this.f21665b = true;
                measureChildWithMargins(u0Var.f21742f, i10, i12, i11, 0);
                if (u0Var.f21742f.getVisibility() == 0) {
                    i13 = u0Var.f21742f.getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                measureChildWithMargins(u0Var.e, nk.c(12.0f, size2, 0), i12 + i13, i11, 0);
                this.f21665b = false;
                setMeasuredDimension(Math.max(u0Var.e.getMeasuredWidth() + i13, size2), View.MeasureSpec.getSize(i11));
                return;
            case 1:
                int size3 = View.MeasureSpec.getSize(i10);
                qn qnVar = (qn) this.f21666c;
                if (qnVar.H9()) {
                    size3 -= AndroidUtilities.dp(71.0f);
                    i17 = AndroidUtilities.dp(32.0f);
                } else {
                    i17 = 0;
                }
                TextView textView2 = qnVar.L1;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = qnVar.N1) != null && textView.getVisibility() == 0) {
                    size3 = nk.A(31.0f, size3, 2);
                }
                this.f21665b = true;
                TextView textView3 = qnVar.N1;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qnVar.N1.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = qnVar.L1;
                    if (textView4 != null && textView4.getVisibility() == 0) {
                        qnVar.N1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        layoutParams.leftMargin = i17 + size3;
                        layoutParams.width -= AndroidUtilities.dp(15.0f);
                    } else {
                        qnVar.N1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                        layoutParams.leftMargin = i17;
                    }
                }
                TextView textView5 = qnVar.L1;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) qnVar.L1.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = qnVar.N1;
                    if (textView6 != null && textView6.getVisibility() == 0) {
                        qnVar.L1.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    } else {
                        qnVar.L1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                    }
                    layoutParams2.leftMargin = i17;
                }
                this.f21665b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                int size4 = View.MeasureSpec.getSize(i10);
                int size5 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size4, size5);
                if (((kc1) this.f21666c).e != null) {
                    this.f21665b = true;
                    if (!AndroidUtilities.isTablet()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((kc1) this.f21666c).e.getLayoutParams();
                        layoutParams3.topMargin = AndroidUtilities.statusBarHeight;
                        ((kc1) this.f21666c).e.setLayoutParams(layoutParams3);
                    }
                    if (!AndroidUtilities.isTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 2) {
                        ((kc1) this.f21666c).h.setTextSize(1, 18.0f);
                    } else {
                        ((kc1) this.f21666c).h.setTextSize(1, 20.0f);
                    }
                    this.f21665b = false;
                }
                measureChildWithMargins(((kc1) this.f21666c).f38571s0, i10, 0, i11, 0);
                int measuredHeight = ((kc1) this.f21666c).f38571s0.getMeasuredHeight();
                if (((kc1) this.f21666c).f38571s0.getVisibility() == 0) {
                    size5 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((kc1) this.f21666c).f38575u0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                kc1 kc1Var = (kc1) this.f21666c;
                int i26 = 58;
                if (kc1Var.f38524b == 2) {
                    fb1 fb1Var = kc1Var.f38575u0;
                    int dp = AndroidUtilities.dp(4.0f);
                    kc1 kc1Var2 = (kc1) this.f21666c;
                    if (!kc1Var2.K1 && kc1Var2.J1 > 0) {
                        i23 = 58;
                    } else {
                        i23 = 0;
                    }
                    int dp2 = AndroidUtilities.dp(i23 + 72) - 12;
                    if (((kc1) this.f21666c).U0()) {
                        i24 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i24 = 0;
                    }
                    fb1Var.setPadding(0, dp, 0, dp2 + i24);
                }
                ((kc1) this.f21666c).f38575u0.measure(View.MeasureSpec.makeMeasureSpec(size4, 1073741824), View.MeasureSpec.makeMeasureSpec(size5 - layoutParams4.bottomMargin, 1073741824));
                ((FrameLayout.LayoutParams) ((kc1) this.f21666c).f38583x0.getLayoutParams()).topMargin = measuredHeight;
                ((kc1) this.f21666c).f38583x0.measure(View.MeasureSpec.makeMeasureSpec(size4, 1073741824), View.MeasureSpec.makeMeasureSpec(size5, 1073741824));
                ai.o5 o5Var = ((kc1) this.f21666c).Q1;
                if (o5Var != null) {
                    ((FrameLayout.LayoutParams) o5Var.getLayoutParams()).topMargin = measuredHeight;
                    ((kc1) this.f21666c).Q1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(222.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824));
                }
                org.telegram.ui.z4 z4Var = ((kc1) this.f21666c).C0;
                if (z4Var != null) {
                    int dp3 = AndroidUtilities.dp(12.0f);
                    int dp4 = AndroidUtilities.dp(12.0f);
                    int dp5 = AndroidUtilities.dp(12.0f);
                    int dp6 = AndroidUtilities.dp(12.0f);
                    if (((kc1) this.f21666c).U0()) {
                        i21 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i21 = 0;
                    }
                    z4Var.setPadding(dp3, dp4, dp5, dp6 + i21);
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((kc1) this.f21666c).C0.getLayoutParams();
                    kc1 kc1Var3 = (kc1) this.f21666c;
                    if (kc1Var3.K1 || kc1Var3.J1 <= 0) {
                        i26 = 0;
                    }
                    int dp7 = AndroidUtilities.dp(72 + i26);
                    if (((kc1) this.f21666c).U0()) {
                        i22 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i22 = 0;
                    }
                    layoutParams5.height = dp7 + i22;
                    measureChildWithMargins(((kc1) this.f21666c).C0, i10, 0, i11, 0);
                }
                Drawable drawable = ((kc1) this.f21666c).f38567r;
                if (drawable != null) {
                    drawable.getPadding(AndroidUtilities.rectTmp2);
                }
                int i27 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((kc1) this.f21666c).L0;
                    if (i27 < frameLayoutArr.length) {
                        FrameLayout frameLayout = frameLayoutArr[i27];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i27 == 0) {
                                if (((kc1) this.f21666c).f38524b == 2) {
                                    i20 = 321;
                                } else {
                                    i20 = 273;
                                }
                                f7 = i20;
                            } else {
                                f7 = 316.0f;
                            }
                            layoutParams6.height = AndroidUtilities.dp(f7);
                            if (((kc1) this.f21666c).U0()) {
                                layoutParams6.height += AndroidUtilities.navigationBarHeight;
                            }
                            if (i27 == 0) {
                                layoutParams6.height = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top + layoutParams6.height;
                            }
                            FrameLayout frameLayout2 = ((kc1) this.f21666c).L0[i27];
                            if (i27 == 0) {
                                i18 = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top;
                            } else {
                                i18 = 0;
                            }
                            if (((kc1) this.f21666c).U0()) {
                                i19 = AndroidUtilities.navigationBarHeight;
                            } else {
                                i19 = 0;
                            }
                            frameLayout2.setPadding(0, i18, 0, i19);
                            measureChildWithMargins(((kc1) this.f21666c).L0[i27], i10, 0, i11, 0);
                        }
                        i27++;
                    } else {
                        return;
                    }
                }
                break;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f21664a) {
            case 0:
                if (!this.f21665b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f21665b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f21665b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f21664a) {
            case 0:
                super.setAlpha(f7);
                u0 u0Var = (u0) this.f21666c;
                j0 j0Var = u0Var.f21757s;
                if (j0Var != null && j0Var.getTag() != null) {
                    u0Var.f21757s.setAlpha(f7);
                    u0Var.f21757s.setScaleX(f7);
                    u0Var.f21757s.setScaleY(f7);
                    return;
                }
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f21664a) {
            case 0:
                super.setVisibility(i10);
                u0 u0Var = (u0) this.f21666c;
                j0 j0Var = u0Var.f21757s;
                if (j0Var != null) {
                    j0Var.setVisibility(i10);
                }
                View view = u0Var.f21761w;
                if (view != null) {
                    view.setVisibility(i10);
                }
                FrameLayout frameLayout = u0Var.f21734a;
                if (frameLayout != null) {
                    frameLayout.setVisibility(i10);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
