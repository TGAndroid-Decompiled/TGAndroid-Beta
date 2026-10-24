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
import org.telegram.messenger.tl;
import org.telegram.ui.kb1;
import org.telegram.ui.pc1;
import org.telegram.ui.sn;
public final class p0 extends FrameLayout {
    public final int f21748a;
    public boolean f21749b;
    public final Object f21750c;

    public p0(Object obj, Context context, int i10) {
        super(context);
        this.f21748a = i10;
        this.f21750c = obj;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        int i10;
        switch (this.f21748a) {
            case 2:
                boolean drawChild = super.drawChild(canvas, view, j10);
                pc1 pc1Var = (pc1) this.f21750c;
                if (view == pc1Var.f40495t0 && pc1.q0(pc1Var) != null) {
                    h5 r02 = pc1.r0(pc1Var);
                    if (pc1Var.f40495t0.getVisibility() == 0) {
                        i10 = (int) (pc1Var.f40495t0.getTranslationY() + pc1Var.f40495t0.getMeasuredHeight());
                    } else {
                        i10 = 0;
                    }
                    ((ActionBarLayout) r02).q(canvas, i10);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f21748a) {
            case 0:
                u0 u0Var = (u0) this.f21750c;
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = 0;
                if (!LocaleController.isRTL && u0Var.h.getVisibility() == 0) {
                    i14 = AndroidUtilities.dp(4.0f) + u0Var.h.getMeasuredWidth();
                }
                if (u0Var.f21881f.getVisibility() == 0) {
                    i14 += u0Var.f21881f.getMeasuredWidth();
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
        switch (this.f21748a) {
            case 0:
                u0 u0Var = (u0) this.f21750c;
                measureChildWithMargins(u0Var.f21896s, i10, 0, i11, 0);
                View view = u0Var.f21901w;
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
                    this.f21749b = true;
                    measureChildWithMargins(u0Var.f21881f, i10, i14, i11, 0);
                    if (u0Var.f21881f.getVisibility() == 0) {
                        i15 = u0Var.f21881f.getMeasuredWidth();
                    } else {
                        i15 = 0;
                    }
                    ei.e2 e2Var = u0Var.e;
                    int i25 = i14 + i15;
                    View view2 = u0Var.f21901w;
                    if (view2 != null) {
                        i16 = view2.getMeasuredWidth();
                    } else {
                        i16 = 0;
                    }
                    measureChildWithMargins(e2Var, i10, i25 + i16, i11, 0);
                    this.f21749b = false;
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
                this.f21749b = true;
                measureChildWithMargins(u0Var.f21881f, i10, i12, i11, 0);
                if (u0Var.f21881f.getVisibility() == 0) {
                    i13 = u0Var.f21881f.getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                measureChildWithMargins(u0Var.e, tl.c(12.0f, size2, 0), i12 + i13, i11, 0);
                this.f21749b = false;
                setMeasuredDimension(Math.max(u0Var.e.getMeasuredWidth() + i13, size2), View.MeasureSpec.getSize(i11));
                return;
            case 1:
                int size3 = View.MeasureSpec.getSize(i10);
                sn snVar = (sn) this.f21750c;
                if (snVar.H9()) {
                    size3 -= AndroidUtilities.dp(71.0f);
                    i17 = AndroidUtilities.dp(32.0f);
                } else {
                    i17 = 0;
                }
                TextView textView2 = snVar.X1;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = snVar.Z1) != null && textView.getVisibility() == 0) {
                    size3 = tl.A(31.0f, size3, 2);
                }
                this.f21749b = true;
                TextView textView3 = snVar.Z1;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) snVar.Z1.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = snVar.X1;
                    if (textView4 != null && textView4.getVisibility() == 0) {
                        snVar.Z1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        layoutParams.leftMargin = i17 + size3;
                        layoutParams.width -= AndroidUtilities.dp(15.0f);
                    } else {
                        snVar.Z1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                        layoutParams.leftMargin = i17;
                    }
                }
                TextView textView5 = snVar.X1;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) snVar.X1.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = snVar.Z1;
                    if (textView6 != null && textView6.getVisibility() == 0) {
                        snVar.X1.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    } else {
                        snVar.X1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                    }
                    layoutParams2.leftMargin = i17;
                }
                this.f21749b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                int size4 = View.MeasureSpec.getSize(i10);
                int size5 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size4, size5);
                if (((pc1) this.f21750c).e != null) {
                    this.f21749b = true;
                    if (!AndroidUtilities.isTablet()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((pc1) this.f21750c).e.getLayoutParams();
                        layoutParams3.topMargin = AndroidUtilities.statusBarHeight;
                        ((pc1) this.f21750c).e.setLayoutParams(layoutParams3);
                    }
                    if (!AndroidUtilities.isTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 2) {
                        ((pc1) this.f21750c).h.setTextSize(1, 18.0f);
                    } else {
                        ((pc1) this.f21750c).h.setTextSize(1, 20.0f);
                    }
                    this.f21749b = false;
                }
                measureChildWithMargins(((pc1) this.f21750c).f40495t0, i10, 0, i11, 0);
                int measuredHeight = ((pc1) this.f21750c).f40495t0.getMeasuredHeight();
                if (((pc1) this.f21750c).f40495t0.getVisibility() == 0) {
                    size5 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((pc1) this.f21750c).f40499v0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                pc1 pc1Var = (pc1) this.f21750c;
                int i26 = 58;
                if (pc1Var.f40445b == 2) {
                    kb1 kb1Var = pc1Var.f40499v0;
                    int dp = AndroidUtilities.dp(4.0f);
                    pc1 pc1Var2 = (pc1) this.f21750c;
                    if (!pc1Var2.L1 && pc1Var2.K1 > 0) {
                        i23 = 58;
                    } else {
                        i23 = 0;
                    }
                    int dp2 = AndroidUtilities.dp(i23 + 72) - 12;
                    if (((pc1) this.f21750c).U0()) {
                        i24 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i24 = 0;
                    }
                    kb1Var.setPadding(0, dp, 0, dp2 + i24);
                }
                ((pc1) this.f21750c).f40499v0.measure(View.MeasureSpec.makeMeasureSpec(size4, 1073741824), View.MeasureSpec.makeMeasureSpec(size5 - layoutParams4.bottomMargin, 1073741824));
                ((FrameLayout.LayoutParams) ((pc1) this.f21750c).f40508y0.getLayoutParams()).topMargin = measuredHeight;
                ((pc1) this.f21750c).f40508y0.measure(View.MeasureSpec.makeMeasureSpec(size4, 1073741824), View.MeasureSpec.makeMeasureSpec(size5, 1073741824));
                ai.o5 o5Var = ((pc1) this.f21750c).R1;
                if (o5Var != null) {
                    ((FrameLayout.LayoutParams) o5Var.getLayoutParams()).topMargin = measuredHeight;
                    ((pc1) this.f21750c).R1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(222.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824));
                }
                org.telegram.ui.y4 y4Var = ((pc1) this.f21750c).D0;
                if (y4Var != null) {
                    int dp3 = AndroidUtilities.dp(12.0f);
                    int dp4 = AndroidUtilities.dp(12.0f);
                    int dp5 = AndroidUtilities.dp(12.0f);
                    int dp6 = AndroidUtilities.dp(12.0f);
                    if (((pc1) this.f21750c).U0()) {
                        i21 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i21 = 0;
                    }
                    y4Var.setPadding(dp3, dp4, dp5, dp6 + i21);
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((pc1) this.f21750c).D0.getLayoutParams();
                    pc1 pc1Var3 = (pc1) this.f21750c;
                    if (pc1Var3.L1 || pc1Var3.K1 <= 0) {
                        i26 = 0;
                    }
                    int dp7 = AndroidUtilities.dp(72 + i26);
                    if (((pc1) this.f21750c).U0()) {
                        i22 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i22 = 0;
                    }
                    layoutParams5.height = dp7 + i22;
                    measureChildWithMargins(((pc1) this.f21750c).D0, i10, 0, i11, 0);
                }
                Drawable drawable = ((pc1) this.f21750c).f40489r;
                if (drawable != null) {
                    drawable.getPadding(AndroidUtilities.rectTmp2);
                }
                int i27 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((pc1) this.f21750c).M0;
                    if (i27 < frameLayoutArr.length) {
                        FrameLayout frameLayout = frameLayoutArr[i27];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i27 == 0) {
                                if (((pc1) this.f21750c).f40445b == 2) {
                                    i20 = 321;
                                } else {
                                    i20 = 273;
                                }
                                f7 = i20;
                            } else {
                                f7 = 316.0f;
                            }
                            layoutParams6.height = AndroidUtilities.dp(f7);
                            if (((pc1) this.f21750c).U0()) {
                                layoutParams6.height += AndroidUtilities.navigationBarHeight;
                            }
                            if (i27 == 0) {
                                layoutParams6.height = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top + layoutParams6.height;
                            }
                            FrameLayout frameLayout2 = ((pc1) this.f21750c).M0[i27];
                            if (i27 == 0) {
                                i18 = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top;
                            } else {
                                i18 = 0;
                            }
                            if (((pc1) this.f21750c).U0()) {
                                i19 = AndroidUtilities.navigationBarHeight;
                            } else {
                                i19 = 0;
                            }
                            frameLayout2.setPadding(0, i18, 0, i19);
                            measureChildWithMargins(((pc1) this.f21750c).M0[i27], i10, 0, i11, 0);
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
        switch (this.f21748a) {
            case 0:
                if (!this.f21749b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f21749b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f21749b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f21748a) {
            case 0:
                super.setAlpha(f7);
                u0 u0Var = (u0) this.f21750c;
                j0 j0Var = u0Var.f21896s;
                if (j0Var != null && j0Var.getTag() != null) {
                    u0Var.f21896s.setAlpha(f7);
                    u0Var.f21896s.setScaleX(f7);
                    u0Var.f21896s.setScaleY(f7);
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
        switch (this.f21748a) {
            case 0:
                super.setVisibility(i10);
                u0 u0Var = (u0) this.f21750c;
                j0 j0Var = u0Var.f21896s;
                if (j0Var != null) {
                    j0Var.setVisibility(i10);
                }
                View view = u0Var.f21901w;
                if (view != null) {
                    view.setVisibility(i10);
                }
                FrameLayout frameLayout = u0Var.f21873a;
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
