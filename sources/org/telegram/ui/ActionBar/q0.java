package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.wl;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.x9;
import org.telegram.ui.a31;
import org.telegram.ui.co;
import org.telegram.ui.g31;
import org.telegram.ui.rc1;
import org.telegram.ui.wd1;
public final class q0 extends FrameLayout {
    public final int f21329a;
    public boolean f21330b;
    public final Object f21331c;

    public q0(Object obj, Context context, int i10) {
        super(context);
        this.f21329a = i10;
        this.f21331c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f21329a) {
            case 2:
                super.dispatchTouchEvent(motionEvent);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        d5 d5Var;
        d5 d5Var2;
        int i10;
        switch (this.f21329a) {
            case 3:
                boolean drawChild = super.drawChild(canvas, view, j3);
                wd1 wd1Var = (wd1) this.f21331c;
                if (view == wd1Var.f41992s0) {
                    d5Var = wd1Var.parentLayout;
                    if (d5Var != null) {
                        d5Var2 = wd1Var.parentLayout;
                        if (wd1Var.f41992s0.getVisibility() == 0) {
                            i10 = (int) (wd1Var.f41992s0.getTranslationY() + wd1Var.f41992s0.getMeasuredHeight());
                        } else {
                            i10 = 0;
                        }
                        ((ActionBarLayout) d5Var2).q(canvas, i10);
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        int measuredWidth;
        int measuredHeight;
        switch (this.f21329a) {
            case 0:
                v0 v0Var = (v0) this.f21331c;
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = 0;
                if (!LocaleController.isRTL && v0Var.h.getVisibility() == 0) {
                    i14 = AndroidUtilities.dp(4.0f) + v0Var.h.getMeasuredWidth();
                }
                if (v0Var.f21412f.getVisibility() == 0) {
                    i14 += v0Var.f21412f.getMeasuredWidth();
                }
                di.h2 h2Var = v0Var.f21410e;
                h2Var.layout(i14, h2Var.getTop(), v0Var.f21410e.getMeasuredWidth() + i14, v0Var.f21410e.getBottom());
                return;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 2:
                g31 g31Var = (g31) this.f21331c;
                int measuredWidth2 = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                int i15 = 0;
                if (measuredWidth2 < measuredHeight2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (g31Var.f36574x.getVisibility() == 0) {
                    if (z11) {
                        AndroidUtilities.rectTmp2.set(0, 0, measuredWidth2, AndroidUtilities.dp(25.0f) + (measuredHeight2 - g31Var.f36574x.getMeasuredHeight()));
                    } else {
                        AndroidUtilities.rectTmp2.set(0, 0, AndroidUtilities.dp(25.0f) + (measuredWidth2 - g31Var.f36574x.getWidth()), measuredHeight2);
                    }
                    g31Var.f36573w.setClipBounds(AndroidUtilities.rectTmp2);
                } else {
                    g31Var.f36573w.setClipBounds(null);
                }
                g31Var.f36573w.layout(0, 0, measuredWidth2, measuredHeight2);
                if (g31Var.f36574x.getVisibility() == 0) {
                    i15 = g31Var.f36574x.getMeasuredHeight();
                }
                if (z11) {
                    measuredWidth = (measuredWidth2 - g31Var.E.getMeasuredWidth()) / 2;
                } else {
                    measuredWidth = g31Var.Q.f11451a + ((((measuredWidth2 - g31Var.f36574x.getMeasuredWidth()) - g31Var.Q.f11451a) - g31Var.E.getMeasuredWidth()) / 2);
                }
                if (z11) {
                    int i16 = g31Var.Q.f11452b;
                    measuredHeight = AndroidUtilities.dp(52.0f) + (((((measuredHeight2 - i15) - i16) - g31Var.E.getMeasuredHeight()) - AndroidUtilities.dp(48.0f)) / 2) + i16;
                } else {
                    measuredHeight = (measuredHeight2 - g31Var.E.getMeasuredHeight()) / 2;
                }
                a31 a31Var = g31Var.E;
                a31Var.layout(measuredWidth, measuredHeight, a31Var.getMeasuredWidth() + measuredWidth, g31Var.E.getMeasuredHeight() + measuredHeight);
                if (z11) {
                    int measuredWidth3 = (measuredWidth2 - g31Var.f36575y.getMeasuredWidth()) / 2;
                    int dp = measuredHeight - AndroidUtilities.dp(48.0f);
                    x9 x9Var = g31Var.f36575y;
                    x9Var.layout(measuredWidth3, dp, x9Var.getMeasuredWidth() + measuredWidth3, g31Var.f36575y.getMeasuredHeight() + dp);
                }
                if (g31Var.f36574x.getVisibility() == 0) {
                    if (z11) {
                        int measuredWidth4 = (measuredWidth2 - g31Var.f36574x.getMeasuredWidth()) / 2;
                        g31Var.f36574x.layout(measuredWidth4, getMeasuredHeight() - i15, g31Var.f36574x.getMeasuredWidth() + measuredWidth4, getMeasuredHeight());
                    } else {
                        int measuredHeight3 = (measuredHeight2 - g31Var.f36574x.getMeasuredHeight()) / 2;
                        g31Var.f36574x.layout(getMeasuredWidth() - g31Var.f36574x.getMeasuredWidth(), measuredHeight3, getMeasuredWidth(), g31Var.f36574x.getMeasuredHeight() + measuredHeight3);
                    }
                }
                aj0 aj0Var = g31Var.F;
                Rect rect = g31Var.f36567c;
                aj0Var.layout(rect.left + measuredWidth, rect.top + measuredHeight, measuredWidth + rect.right, measuredHeight + rect.bottom);
                int dp2 = AndroidUtilities.dp(11.0f) + g31Var.Q.f11451a;
                int dp3 = AndroidUtilities.dp(11.0f) + g31Var.Q.f11452b;
                ImageView imageView = g31Var.G;
                imageView.layout(dp2, dp3, imageView.getMeasuredWidth() + dp2, g31Var.G.getMeasuredHeight() + dp3);
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        q0 q0Var;
        int i14;
        int i15;
        int i16;
        int i17;
        TextView textView;
        boolean z10;
        int i18;
        float f7;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        switch (this.f21329a) {
            case 0:
                v0 v0Var = (v0) this.f21331c;
                measureChildWithMargins(v0Var.f21427s, i10, 0, i11, 0);
                View view = v0Var.f21431w;
                if (view != null) {
                    measureChildWithMargins(view, i10, 0, i11, 0);
                }
                if (!LocaleController.isRTL) {
                    if (v0Var.h.getVisibility() == 0) {
                        q0Var = this;
                        q0Var.measureChildWithMargins(v0Var.h, i10, View.MeasureSpec.getSize(i10) / 2, i11, 0);
                        i14 = AndroidUtilities.dp(4.0f) + v0Var.h.getMeasuredWidth();
                    } else {
                        q0Var = this;
                        i14 = 0;
                    }
                    int size = View.MeasureSpec.getSize(i10);
                    q0Var.f21330b = true;
                    q0Var.measureChildWithMargins(v0Var.f21412f, i10, i14, i11, 0);
                    if (v0Var.f21412f.getVisibility() == 0) {
                        i15 = v0Var.f21412f.getMeasuredWidth();
                    } else {
                        i15 = 0;
                    }
                    di.h2 h2Var = v0Var.f21410e;
                    int i26 = i14 + i15;
                    View view2 = v0Var.f21431w;
                    if (view2 != null) {
                        i16 = view2.getMeasuredWidth();
                    } else {
                        i16 = 0;
                    }
                    measureChildWithMargins(h2Var, i10, i26 + i16, i11, 0);
                    this.f21330b = false;
                    setMeasuredDimension(Math.max(v0Var.f21410e.getMeasuredWidth() + i15, size), View.MeasureSpec.getSize(i11));
                    return;
                }
                if (v0Var.h.getVisibility() == 0) {
                    measureChildWithMargins(v0Var.h, i10, View.MeasureSpec.getSize(i10) / 2, i11, 0);
                    i12 = AndroidUtilities.dp(4.0f) + v0Var.h.getMeasuredWidth();
                } else {
                    i12 = 0;
                }
                int size2 = View.MeasureSpec.getSize(i10);
                this.f21330b = true;
                measureChildWithMargins(v0Var.f21412f, i10, i12, i11, 0);
                if (v0Var.f21412f.getVisibility() == 0) {
                    i13 = v0Var.f21412f.getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                measureChildWithMargins(v0Var.f21410e, wl.d(12.0f, size2, 0), i12 + i13, i11, 0);
                this.f21330b = false;
                setMeasuredDimension(Math.max(v0Var.f21410e.getMeasuredWidth() + i13, size2), View.MeasureSpec.getSize(i11));
                return;
            case 1:
                int size3 = View.MeasureSpec.getSize(i10);
                co coVar = (co) this.f21331c;
                if (coVar.C9()) {
                    size3 -= AndroidUtilities.dp(71.0f);
                    i17 = AndroidUtilities.dp(32.0f);
                } else {
                    i17 = 0;
                }
                TextView textView2 = coVar.L1;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = coVar.N1) != null && textView.getVisibility() == 0) {
                    size3 = wl.y(31.0f, size3, 2);
                }
                this.f21330b = true;
                TextView textView3 = coVar.N1;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) coVar.N1.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = coVar.L1;
                    if (textView4 != null && textView4.getVisibility() == 0) {
                        coVar.N1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        layoutParams.leftMargin = i17 + size3;
                        layoutParams.width -= AndroidUtilities.dp(15.0f);
                    } else {
                        coVar.N1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                        layoutParams.leftMargin = i17;
                    }
                }
                TextView textView5 = coVar.L1;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) coVar.L1.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = coVar.N1;
                    if (textView6 != null && textView6.getVisibility() == 0) {
                        coVar.L1.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    } else {
                        coVar.L1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                    }
                    layoutParams2.leftMargin = i17;
                }
                this.f21330b = false;
                super.onMeasure(i10, i11);
                return;
            case 2:
                g31 g31Var = (g31) this.f21331c;
                int size4 = View.MeasureSpec.getSize(i10);
                int size5 = View.MeasureSpec.getSize(i11);
                if (size4 < size5) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g31Var.P = z10;
                x9 x9Var = g31Var.f36575y;
                if (z10) {
                    i18 = 0;
                } else {
                    i18 = 8;
                }
                x9Var.setVisibility(i18);
                super.onMeasure(i10, i11);
                if (z10) {
                    this.f21330b = true;
                    ah.w wVar = g31Var.f36574x;
                    int i27 = g31Var.Q.f11451a;
                    int dp = AndroidUtilities.dp(8.0f);
                    i0.c cVar = g31Var.Q;
                    wVar.setPadding(i27, dp, cVar.f11453c, cVar.d);
                    this.f21330b = false;
                    g31Var.f36574x.measure(View.MeasureSpec.makeMeasureSpec(size4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size5 + g31Var.Q.d, Integer.MIN_VALUE));
                    g31Var.E.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(330.0f), 1073741824));
                    return;
                }
                this.f21330b = true;
                ah.w wVar2 = g31Var.f36574x;
                i0.c cVar2 = g31Var.Q;
                wVar2.setPadding(0, (cVar2.f11452b * 2) / 3, cVar2.f11453c, cVar2.d);
                this.f21330b = false;
                g31Var.f36574x.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(273.0f) + g31Var.Q.f11453c, 1073741824), i11);
                g31Var.E.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(310.0f), 1073741824));
                return;
            default:
                int size6 = View.MeasureSpec.getSize(i10);
                int size7 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size6, size7);
                if (((wd1) this.f21331c).f41955e != null) {
                    this.f21330b = true;
                    if (!AndroidUtilities.isTablet()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((wd1) this.f21331c).f41955e.getLayoutParams();
                        layoutParams3.topMargin = AndroidUtilities.statusBarHeight;
                        ((wd1) this.f21331c).f41955e.setLayoutParams(layoutParams3);
                    }
                    if (!AndroidUtilities.isTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 2) {
                        ((wd1) this.f21331c).h.setTextSize(1, 18.0f);
                    } else {
                        ((wd1) this.f21331c).h.setTextSize(1, 20.0f);
                    }
                    this.f21330b = false;
                }
                measureChildWithMargins(((wd1) this.f21331c).f41992s0, i10, 0, i11, 0);
                int measuredHeight = ((wd1) this.f21331c).f41992s0.getMeasuredHeight();
                if (((wd1) this.f21331c).f41992s0.getVisibility() == 0) {
                    size7 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((wd1) this.f21331c).f41996u0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                wd1 wd1Var = (wd1) this.f21331c;
                int i28 = 58;
                if (wd1Var.f41944b == 2) {
                    rc1 rc1Var = wd1Var.f41996u0;
                    int dp2 = AndroidUtilities.dp(4.0f);
                    wd1 wd1Var2 = (wd1) this.f21331c;
                    if (!wd1Var2.K1 && wd1Var2.J1 > 0) {
                        i24 = 58;
                    } else {
                        i24 = 0;
                    }
                    int dp3 = AndroidUtilities.dp(i24 + 72) - 12;
                    if (((wd1) this.f21331c).U0()) {
                        i25 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i25 = 0;
                    }
                    rc1Var.setPadding(0, dp2, 0, dp3 + i25);
                }
                ((wd1) this.f21331c).f41996u0.measure(View.MeasureSpec.makeMeasureSpec(size6, 1073741824), View.MeasureSpec.makeMeasureSpec(size7 - layoutParams4.bottomMargin, 1073741824));
                ((FrameLayout.LayoutParams) ((wd1) this.f21331c).f42004x0.getLayoutParams()).topMargin = measuredHeight;
                ((wd1) this.f21331c).f42004x0.measure(View.MeasureSpec.makeMeasureSpec(size6, 1073741824), View.MeasureSpec.makeMeasureSpec(size7, 1073741824));
                org.telegram.ui.t5 t5Var = ((wd1) this.f21331c).Q1;
                if (t5Var != null) {
                    ((FrameLayout.LayoutParams) t5Var.getLayoutParams()).topMargin = measuredHeight;
                    ((wd1) this.f21331c).Q1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(222.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824));
                }
                org.telegram.ui.u4 u4Var = ((wd1) this.f21331c).C0;
                if (u4Var != null) {
                    int dp4 = AndroidUtilities.dp(12.0f);
                    int dp5 = AndroidUtilities.dp(12.0f);
                    int dp6 = AndroidUtilities.dp(12.0f);
                    int dp7 = AndroidUtilities.dp(12.0f);
                    if (((wd1) this.f21331c).U0()) {
                        i22 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i22 = 0;
                    }
                    u4Var.setPadding(dp4, dp5, dp6, dp7 + i22);
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((wd1) this.f21331c).C0.getLayoutParams();
                    wd1 wd1Var3 = (wd1) this.f21331c;
                    int dp8 = AndroidUtilities.dp(72 + ((wd1Var3.K1 || wd1Var3.J1 <= 0) ? 0 : 0));
                    if (((wd1) this.f21331c).U0()) {
                        i23 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i23 = 0;
                    }
                    layoutParams5.height = dp8 + i23;
                    measureChildWithMargins(((wd1) this.f21331c).C0, i10, 0, i11, 0);
                }
                Drawable drawable = ((wd1) this.f21331c).f41988r;
                if (drawable != null) {
                    drawable.getPadding(AndroidUtilities.rectTmp2);
                }
                int i29 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((wd1) this.f21331c).L0;
                    if (i29 < frameLayoutArr.length) {
                        FrameLayout frameLayout = frameLayoutArr[i29];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i29 == 0) {
                                if (((wd1) this.f21331c).f41944b == 2) {
                                    i21 = 321;
                                } else {
                                    i21 = 273;
                                }
                                f7 = i21;
                            } else {
                                f7 = 316.0f;
                            }
                            layoutParams6.height = AndroidUtilities.dp(f7);
                            if (((wd1) this.f21331c).U0()) {
                                layoutParams6.height += AndroidUtilities.navigationBarHeight;
                            }
                            if (i29 == 0) {
                                layoutParams6.height = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top + layoutParams6.height;
                            }
                            FrameLayout frameLayout2 = ((wd1) this.f21331c).L0[i29];
                            if (i29 == 0) {
                                i19 = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top;
                            } else {
                                i19 = 0;
                            }
                            if (((wd1) this.f21331c).U0()) {
                                i20 = AndroidUtilities.navigationBarHeight;
                            } else {
                                i20 = 0;
                            }
                            frameLayout2.setPadding(0, i19, 0, i20);
                            measureChildWithMargins(((wd1) this.f21331c).L0[i29], i10, 0, i11, 0);
                        }
                        i29++;
                    } else {
                        return;
                    }
                }
                break;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f21329a) {
            case 0:
                if (!this.f21330b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f21330b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f21330b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f21330b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f21329a) {
            case 0:
                super.setAlpha(f7);
                v0 v0Var = (v0) this.f21331c;
                k0 k0Var = v0Var.f21427s;
                if (k0Var != null && k0Var.getTag() != null) {
                    v0Var.f21427s.setAlpha(f7);
                    v0Var.f21427s.setScaleX(f7);
                    v0Var.f21427s.setScaleY(f7);
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
        switch (this.f21329a) {
            case 0:
                super.setVisibility(i10);
                v0 v0Var = (v0) this.f21331c;
                k0 k0Var = v0Var.f21427s;
                if (k0Var != null) {
                    k0Var.setVisibility(i10);
                }
                View view = v0Var.f21431w;
                if (view != null) {
                    view.setVisibility(i10);
                }
                FrameLayout frameLayout = v0Var.f21403a;
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
