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
import org.telegram.messenger.vh;
import org.telegram.ui.nb1;
import org.telegram.ui.tc1;
import org.telegram.ui.un;
public final class q0 extends FrameLayout {
    public final int f22960a;
    public boolean f22961b;
    public final Object f22962c;

    public q0(Object obj, Context context, int i10) {
        super(context);
        this.f22960a = i10;
        this.f22962c = obj;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        int i10;
        switch (this.f22960a) {
            case 2:
                boolean drawChild = super.drawChild(canvas, view, j10);
                tc1 tc1Var = (tc1) this.f22962c;
                if (view == tc1Var.f43789t0 && tc1.r0(tc1Var) != null) {
                    j5 s02 = tc1.s0(tc1Var);
                    if (tc1Var.f43789t0.getVisibility() == 0) {
                        i10 = (int) (tc1Var.f43789t0.getTranslationY() + tc1Var.f43789t0.getMeasuredHeight());
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
        switch (this.f22960a) {
            case 0:
                w0 w0Var = (w0) this.f22962c;
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = 0;
                if (!LocaleController.isRTL && w0Var.h.getVisibility() == 0) {
                    i14 = AndroidUtilities.dp(4.0f) + w0Var.h.getMeasuredWidth();
                }
                if (w0Var.f23182f.getVisibility() == 0) {
                    i14 += w0Var.f23182f.getMeasuredWidth();
                }
                fi.c2 c2Var = w0Var.e;
                c2Var.layout(i14, c2Var.getTop(), w0Var.e.getMeasuredWidth() + i14, w0Var.e.getBottom());
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
        switch (this.f22960a) {
            case 0:
                w0 w0Var = (w0) this.f22962c;
                measureChildWithMargins(w0Var.f23197s, i10, 0, i11, 0);
                View view = w0Var.f23202w;
                if (view != null) {
                    measureChildWithMargins(view, i10, 0, i11, 0);
                }
                if (!LocaleController.isRTL) {
                    if (w0Var.h.getVisibility() == 0) {
                        measureChildWithMargins(w0Var.h, i10, View.MeasureSpec.getSize(i10) / 2, i11, 0);
                        i14 = AndroidUtilities.dp(4.0f) + w0Var.h.getMeasuredWidth();
                    } else {
                        i14 = 0;
                    }
                    int size = View.MeasureSpec.getSize(i10);
                    this.f22961b = true;
                    measureChildWithMargins(w0Var.f23182f, i10, i14, i11, 0);
                    if (w0Var.f23182f.getVisibility() == 0) {
                        i15 = w0Var.f23182f.getMeasuredWidth();
                    } else {
                        i15 = 0;
                    }
                    fi.c2 c2Var = w0Var.e;
                    int i25 = i14 + i15;
                    View view2 = w0Var.f23202w;
                    if (view2 != null) {
                        i16 = view2.getMeasuredWidth();
                    } else {
                        i16 = 0;
                    }
                    measureChildWithMargins(c2Var, i10, i25 + i16, i11, 0);
                    this.f22961b = false;
                    setMeasuredDimension(Math.max(w0Var.e.getMeasuredWidth() + i15, size), View.MeasureSpec.getSize(i11));
                    return;
                }
                if (w0Var.h.getVisibility() == 0) {
                    measureChildWithMargins(w0Var.h, i10, View.MeasureSpec.getSize(i10) / 2, i11, 0);
                    i12 = AndroidUtilities.dp(4.0f) + w0Var.h.getMeasuredWidth();
                } else {
                    i12 = 0;
                }
                int size2 = View.MeasureSpec.getSize(i10);
                this.f22961b = true;
                measureChildWithMargins(w0Var.f23182f, i10, i12, i11, 0);
                if (w0Var.f23182f.getVisibility() == 0) {
                    i13 = w0Var.f23182f.getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                measureChildWithMargins(w0Var.e, vh.x(12.0f, size2, 0), i12 + i13, i11, 0);
                this.f22961b = false;
                setMeasuredDimension(Math.max(w0Var.e.getMeasuredWidth() + i13, size2), View.MeasureSpec.getSize(i11));
                return;
            case 1:
                int size3 = View.MeasureSpec.getSize(i10);
                un unVar = (un) this.f22962c;
                if (unVar.L9()) {
                    size3 -= AndroidUtilities.dp(71.0f);
                    i17 = AndroidUtilities.dp(32.0f);
                } else {
                    i17 = 0;
                }
                TextView textView2 = unVar.X1;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = unVar.Z1) != null && textView.getVisibility() == 0) {
                    size3 = vh.B(31.0f, size3, 2);
                }
                this.f22961b = true;
                TextView textView3 = unVar.Z1;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) unVar.Z1.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = unVar.X1;
                    if (textView4 != null && textView4.getVisibility() == 0) {
                        unVar.Z1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        layoutParams.leftMargin = i17 + size3;
                        layoutParams.width -= AndroidUtilities.dp(15.0f);
                    } else {
                        unVar.Z1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                        layoutParams.leftMargin = i17;
                    }
                }
                TextView textView5 = unVar.X1;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) unVar.X1.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = unVar.Z1;
                    if (textView6 != null && textView6.getVisibility() == 0) {
                        unVar.X1.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    } else {
                        unVar.X1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                    }
                    layoutParams2.leftMargin = i17;
                }
                this.f22961b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                int size4 = View.MeasureSpec.getSize(i10);
                int size5 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size4, size5);
                if (((tc1) this.f22962c).e != null) {
                    this.f22961b = true;
                    if (!AndroidUtilities.isTablet()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((tc1) this.f22962c).e.getLayoutParams();
                        layoutParams3.topMargin = AndroidUtilities.statusBarHeight;
                        ((tc1) this.f22962c).e.setLayoutParams(layoutParams3);
                    }
                    if (!AndroidUtilities.isTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 2) {
                        ((tc1) this.f22962c).h.setTextSize(1, 18.0f);
                    } else {
                        ((tc1) this.f22962c).h.setTextSize(1, 20.0f);
                    }
                    this.f22961b = false;
                }
                measureChildWithMargins(((tc1) this.f22962c).f43789t0, i10, 0, i11, 0);
                int measuredHeight = ((tc1) this.f22962c).f43789t0.getMeasuredHeight();
                if (((tc1) this.f22962c).f43789t0.getVisibility() == 0) {
                    size5 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((tc1) this.f22962c).f43793v0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                tc1 tc1Var = (tc1) this.f22962c;
                int i26 = 58;
                if (tc1Var.f43739b == 2) {
                    nb1 nb1Var = tc1Var.f43793v0;
                    int dp = AndroidUtilities.dp(4.0f);
                    tc1 tc1Var2 = (tc1) this.f22962c;
                    if (!tc1Var2.L1 && tc1Var2.K1 > 0) {
                        i23 = 58;
                    } else {
                        i23 = 0;
                    }
                    int dp2 = AndroidUtilities.dp(i23 + 72) - 12;
                    if (((tc1) this.f22962c).V0()) {
                        i24 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i24 = 0;
                    }
                    nb1Var.setPadding(0, dp, 0, dp2 + i24);
                }
                ((tc1) this.f22962c).f43793v0.measure(View.MeasureSpec.makeMeasureSpec(size4, 1073741824), View.MeasureSpec.makeMeasureSpec(size5 - layoutParams4.bottomMargin, 1073741824));
                ((FrameLayout.LayoutParams) ((tc1) this.f22962c).f43802y0.getLayoutParams()).topMargin = measuredHeight;
                ((tc1) this.f22962c).f43802y0.measure(View.MeasureSpec.makeMeasureSpec(size4, 1073741824), View.MeasureSpec.makeMeasureSpec(size5, 1073741824));
                bi.j5 j5Var = ((tc1) this.f22962c).R1;
                if (j5Var != null) {
                    ((FrameLayout.LayoutParams) j5Var.getLayoutParams()).topMargin = measuredHeight;
                    ((tc1) this.f22962c).R1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(222.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824));
                }
                org.telegram.ui.x4 x4Var = ((tc1) this.f22962c).D0;
                if (x4Var != null) {
                    int dp3 = AndroidUtilities.dp(12.0f);
                    int dp4 = AndroidUtilities.dp(12.0f);
                    int dp5 = AndroidUtilities.dp(12.0f);
                    int dp6 = AndroidUtilities.dp(12.0f);
                    if (((tc1) this.f22962c).V0()) {
                        i21 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i21 = 0;
                    }
                    x4Var.setPadding(dp3, dp4, dp5, dp6 + i21);
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((tc1) this.f22962c).D0.getLayoutParams();
                    tc1 tc1Var3 = (tc1) this.f22962c;
                    if (tc1Var3.L1 || tc1Var3.K1 <= 0) {
                        i26 = 0;
                    }
                    int dp7 = AndroidUtilities.dp(72 + i26);
                    if (((tc1) this.f22962c).V0()) {
                        i22 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i22 = 0;
                    }
                    layoutParams5.height = dp7 + i22;
                    measureChildWithMargins(((tc1) this.f22962c).D0, i10, 0, i11, 0);
                }
                Drawable drawable = ((tc1) this.f22962c).f43783r;
                if (drawable != null) {
                    drawable.getPadding(AndroidUtilities.rectTmp2);
                }
                int i27 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((tc1) this.f22962c).M0;
                    if (i27 < frameLayoutArr.length) {
                        FrameLayout frameLayout = frameLayoutArr[i27];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i27 == 0) {
                                if (((tc1) this.f22962c).f43739b == 2) {
                                    i20 = 321;
                                } else {
                                    i20 = 273;
                                }
                                f7 = i20;
                            } else {
                                f7 = 316.0f;
                            }
                            layoutParams6.height = AndroidUtilities.dp(f7);
                            if (((tc1) this.f22962c).V0()) {
                                layoutParams6.height += AndroidUtilities.navigationBarHeight;
                            }
                            if (i27 == 0) {
                                layoutParams6.height = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top + layoutParams6.height;
                            }
                            FrameLayout frameLayout2 = ((tc1) this.f22962c).M0[i27];
                            if (i27 == 0) {
                                i18 = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top;
                            } else {
                                i18 = 0;
                            }
                            if (((tc1) this.f22962c).V0()) {
                                i19 = AndroidUtilities.navigationBarHeight;
                            } else {
                                i19 = 0;
                            }
                            frameLayout2.setPadding(0, i18, 0, i19);
                            measureChildWithMargins(((tc1) this.f22962c).M0[i27], i10, 0, i11, 0);
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
        switch (this.f22960a) {
            case 0:
                if (!this.f22961b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f22961b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f22961b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f22960a) {
            case 0:
                super.setAlpha(f7);
                w0 w0Var = (w0) this.f22962c;
                k0 k0Var = w0Var.f23197s;
                if (k0Var != null && k0Var.getTag() != null) {
                    w0Var.f23197s.setAlpha(f7);
                    w0Var.f23197s.setScaleX(f7);
                    w0Var.f23197s.setScaleY(f7);
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
        switch (this.f22960a) {
            case 0:
                super.setVisibility(i10);
                w0 w0Var = (w0) this.f22962c;
                k0 k0Var = w0Var.f23197s;
                if (k0Var != null) {
                    k0Var.setVisibility(i10);
                }
                View view = w0Var.f23202w;
                if (view != null) {
                    view.setVisibility(i10);
                }
                FrameLayout frameLayout = w0Var.f23174a;
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
