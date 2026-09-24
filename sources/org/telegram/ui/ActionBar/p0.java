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
import ci.m6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.ok;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.jc1;
import org.telegram.ui.od1;
import org.telegram.ui.q21;
import org.telegram.ui.w21;
import org.telegram.ui.wn;
public final class p0 extends FrameLayout {
    public final int f19681a;
    public boolean f19682b;
    public final Object f19683c;

    public p0(Object obj, Context context, int i10) {
        super(context);
        this.f19681a = i10;
        this.f19683c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f19681a) {
            case 2:
                super.dispatchTouchEvent(motionEvent);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        b5 b5Var;
        b5 b5Var2;
        int i10;
        switch (this.f19681a) {
            case 3:
                boolean drawChild = super.drawChild(canvas, view, j3);
                od1 od1Var = (od1) this.f19683c;
                if (view == od1Var.f36178s0) {
                    b5Var = od1Var.parentLayout;
                    if (b5Var != null) {
                        b5Var2 = od1Var.parentLayout;
                        if (od1Var.f36178s0.getVisibility() == 0) {
                            i10 = (int) (od1Var.f36178s0.getTranslationY() + od1Var.f36178s0.getMeasuredHeight());
                        } else {
                            i10 = 0;
                        }
                        ((ActionBarLayout) b5Var2).q(canvas, i10);
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
        switch (this.f19681a) {
            case 0:
                u0 u0Var = (u0) this.f19683c;
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = 0;
                if (!LocaleController.isRTL && u0Var.h.getVisibility() == 0) {
                    i14 = AndroidUtilities.dp(4.0f) + u0Var.h.getMeasuredWidth();
                }
                if (u0Var.f19780f.getVisibility() == 0) {
                    i14 += u0Var.f19780f.getMeasuredWidth();
                }
                ci.h2 h2Var = u0Var.e;
                h2Var.layout(i14, h2Var.getTop(), u0Var.e.getMeasuredWidth() + i14, u0Var.e.getBottom());
                return;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 2:
                w21 w21Var = (w21) this.f19683c;
                int measuredWidth2 = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                int i15 = 0;
                if (measuredWidth2 < measuredHeight2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (w21Var.f38865x.getVisibility() == 0) {
                    if (z11) {
                        AndroidUtilities.rectTmp2.set(0, 0, measuredWidth2, AndroidUtilities.dp(25.0f) + (measuredHeight2 - w21Var.f38865x.getMeasuredHeight()));
                    } else {
                        AndroidUtilities.rectTmp2.set(0, 0, AndroidUtilities.dp(25.0f) + (measuredWidth2 - w21Var.f38865x.getWidth()), measuredHeight2);
                    }
                    w21Var.f38864w.setClipBounds(AndroidUtilities.rectTmp2);
                } else {
                    w21Var.f38864w.setClipBounds(null);
                }
                w21Var.f38864w.layout(0, 0, measuredWidth2, measuredHeight2);
                if (w21Var.f38865x.getVisibility() == 0) {
                    i15 = w21Var.f38865x.getMeasuredHeight();
                }
                if (z11) {
                    measuredWidth = (measuredWidth2 - w21Var.E.getMeasuredWidth()) / 2;
                } else {
                    measuredWidth = w21Var.Q.f10576a + ((((measuredWidth2 - w21Var.f38865x.getMeasuredWidth()) - w21Var.Q.f10576a) - w21Var.E.getMeasuredWidth()) / 2);
                }
                if (z11) {
                    int i16 = w21Var.Q.f10577b;
                    measuredHeight = AndroidUtilities.dp(52.0f) + (((((measuredHeight2 - i15) - i16) - w21Var.E.getMeasuredHeight()) - AndroidUtilities.dp(48.0f)) / 2) + i16;
                } else {
                    measuredHeight = (measuredHeight2 - w21Var.E.getMeasuredHeight()) / 2;
                }
                q21 q21Var = w21Var.E;
                q21Var.layout(measuredWidth, measuredHeight, q21Var.getMeasuredWidth() + measuredWidth, w21Var.E.getMeasuredHeight() + measuredHeight);
                if (z11) {
                    int measuredWidth3 = (measuredWidth2 - w21Var.f38866y.getMeasuredWidth()) / 2;
                    int dp = measuredHeight - AndroidUtilities.dp(48.0f);
                    w9 w9Var = w21Var.f38866y;
                    w9Var.layout(measuredWidth3, dp, w9Var.getMeasuredWidth() + measuredWidth3, w21Var.f38866y.getMeasuredHeight() + dp);
                }
                if (w21Var.f38865x.getVisibility() == 0) {
                    if (z11) {
                        int measuredWidth4 = (measuredWidth2 - w21Var.f38865x.getMeasuredWidth()) / 2;
                        w21Var.f38865x.layout(measuredWidth4, getMeasuredHeight() - i15, w21Var.f38865x.getMeasuredWidth() + measuredWidth4, getMeasuredHeight());
                    } else {
                        int measuredHeight3 = (measuredHeight2 - w21Var.f38865x.getMeasuredHeight()) / 2;
                        w21Var.f38865x.layout(getMeasuredWidth() - w21Var.f38865x.getMeasuredWidth(), measuredHeight3, getMeasuredWidth(), w21Var.f38865x.getMeasuredHeight() + measuredHeight3);
                    }
                }
                lj0 lj0Var = w21Var.F;
                Rect rect = w21Var.f38859c;
                lj0Var.layout(rect.left + measuredWidth, rect.top + measuredHeight, measuredWidth + rect.right, measuredHeight + rect.bottom);
                int dp2 = AndroidUtilities.dp(11.0f) + w21Var.Q.f10576a;
                int dp3 = AndroidUtilities.dp(11.0f) + w21Var.Q.f10577b;
                ImageView imageView = w21Var.G;
                imageView.layout(dp2, dp3, imageView.getMeasuredWidth() + dp2, w21Var.G.getMeasuredHeight() + dp3);
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        p0 p0Var;
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
        switch (this.f19681a) {
            case 0:
                u0 u0Var = (u0) this.f19683c;
                measureChildWithMargins(u0Var.f19795s, i10, 0, i11, 0);
                View view = u0Var.f19799w;
                if (view != null) {
                    measureChildWithMargins(view, i10, 0, i11, 0);
                }
                if (!LocaleController.isRTL) {
                    if (u0Var.h.getVisibility() == 0) {
                        p0Var = this;
                        p0Var.measureChildWithMargins(u0Var.h, i10, View.MeasureSpec.getSize(i10) / 2, i11, 0);
                        i14 = AndroidUtilities.dp(4.0f) + u0Var.h.getMeasuredWidth();
                    } else {
                        p0Var = this;
                        i14 = 0;
                    }
                    int size = View.MeasureSpec.getSize(i10);
                    p0Var.f19682b = true;
                    p0Var.measureChildWithMargins(u0Var.f19780f, i10, i14, i11, 0);
                    if (u0Var.f19780f.getVisibility() == 0) {
                        i15 = u0Var.f19780f.getMeasuredWidth();
                    } else {
                        i15 = 0;
                    }
                    ci.h2 h2Var = u0Var.e;
                    int i26 = i14 + i15;
                    View view2 = u0Var.f19799w;
                    if (view2 != null) {
                        i16 = view2.getMeasuredWidth();
                    } else {
                        i16 = 0;
                    }
                    measureChildWithMargins(h2Var, i10, i26 + i16, i11, 0);
                    this.f19682b = false;
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
                this.f19682b = true;
                measureChildWithMargins(u0Var.f19780f, i10, i12, i11, 0);
                if (u0Var.f19780f.getVisibility() == 0) {
                    i13 = u0Var.f19780f.getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                measureChildWithMargins(u0Var.e, ok.c(12.0f, size2, 0), i12 + i13, i11, 0);
                this.f19682b = false;
                setMeasuredDimension(Math.max(u0Var.e.getMeasuredWidth() + i13, size2), View.MeasureSpec.getSize(i11));
                return;
            case 1:
                int size3 = View.MeasureSpec.getSize(i10);
                wn wnVar = (wn) this.f19683c;
                if (wnVar.C9()) {
                    size3 -= AndroidUtilities.dp(71.0f);
                    i17 = AndroidUtilities.dp(32.0f);
                } else {
                    i17 = 0;
                }
                TextView textView2 = wnVar.L1;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = wnVar.N1) != null && textView.getVisibility() == 0) {
                    size3 = ok.A(31.0f, size3, 2);
                }
                this.f19682b = true;
                TextView textView3 = wnVar.N1;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) wnVar.N1.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = wnVar.L1;
                    if (textView4 != null && textView4.getVisibility() == 0) {
                        wnVar.N1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        layoutParams.leftMargin = i17 + size3;
                        layoutParams.width -= AndroidUtilities.dp(15.0f);
                    } else {
                        wnVar.N1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                        layoutParams.leftMargin = i17;
                    }
                }
                TextView textView5 = wnVar.L1;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) wnVar.L1.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = wnVar.N1;
                    if (textView6 != null && textView6.getVisibility() == 0) {
                        wnVar.L1.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    } else {
                        wnVar.L1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                    }
                    layoutParams2.leftMargin = i17;
                }
                this.f19682b = false;
                super.onMeasure(i10, i11);
                return;
            case 2:
                w21 w21Var = (w21) this.f19683c;
                int size4 = View.MeasureSpec.getSize(i10);
                int size5 = View.MeasureSpec.getSize(i11);
                if (size4 < size5) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                w21Var.P = z10;
                w9 w9Var = w21Var.f38866y;
                if (z10) {
                    i18 = 0;
                } else {
                    i18 = 8;
                }
                w9Var.setVisibility(i18);
                super.onMeasure(i10, i11);
                if (z10) {
                    this.f19682b = true;
                    m6 m6Var = w21Var.f38865x;
                    int i27 = w21Var.Q.f10576a;
                    int dp = AndroidUtilities.dp(8.0f);
                    i0.b bVar = w21Var.Q;
                    m6Var.setPadding(i27, dp, bVar.f10578c, bVar.d);
                    this.f19682b = false;
                    w21Var.f38865x.measure(View.MeasureSpec.makeMeasureSpec(size4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size5 + w21Var.Q.d, Integer.MIN_VALUE));
                    w21Var.E.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(330.0f), 1073741824));
                    return;
                }
                this.f19682b = true;
                m6 m6Var2 = w21Var.f38865x;
                i0.b bVar2 = w21Var.Q;
                m6Var2.setPadding(0, (bVar2.f10577b * 2) / 3, bVar2.f10578c, bVar2.d);
                this.f19682b = false;
                w21Var.f38865x.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(273.0f) + w21Var.Q.f10578c, 1073741824), i11);
                w21Var.E.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(310.0f), 1073741824));
                return;
            default:
                int size6 = View.MeasureSpec.getSize(i10);
                int size7 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size6, size7);
                if (((od1) this.f19683c).e != null) {
                    this.f19682b = true;
                    if (!AndroidUtilities.isTablet()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((od1) this.f19683c).e.getLayoutParams();
                        layoutParams3.topMargin = AndroidUtilities.statusBarHeight;
                        ((od1) this.f19683c).e.setLayoutParams(layoutParams3);
                    }
                    if (!AndroidUtilities.isTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 2) {
                        ((od1) this.f19683c).h.setTextSize(1, 18.0f);
                    } else {
                        ((od1) this.f19683c).h.setTextSize(1, 20.0f);
                    }
                    this.f19682b = false;
                }
                measureChildWithMargins(((od1) this.f19683c).f36178s0, i10, 0, i11, 0);
                int measuredHeight = ((od1) this.f19683c).f36178s0.getMeasuredHeight();
                if (((od1) this.f19683c).f36178s0.getVisibility() == 0) {
                    size7 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((od1) this.f19683c).f36182u0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                od1 od1Var = (od1) this.f19683c;
                int i28 = 58;
                if (od1Var.f36131b == 2) {
                    jc1 jc1Var = od1Var.f36182u0;
                    int dp2 = AndroidUtilities.dp(4.0f);
                    od1 od1Var2 = (od1) this.f19683c;
                    if (!od1Var2.K1 && od1Var2.J1 > 0) {
                        i24 = 58;
                    } else {
                        i24 = 0;
                    }
                    int dp3 = AndroidUtilities.dp(i24 + 72) - 12;
                    if (((od1) this.f19683c).U0()) {
                        i25 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i25 = 0;
                    }
                    jc1Var.setPadding(0, dp2, 0, dp3 + i25);
                }
                ((od1) this.f19683c).f36182u0.measure(View.MeasureSpec.makeMeasureSpec(size6, 1073741824), View.MeasureSpec.makeMeasureSpec(size7 - layoutParams4.bottomMargin, 1073741824));
                ((FrameLayout.LayoutParams) ((od1) this.f19683c).f36190x0.getLayoutParams()).topMargin = measuredHeight;
                ((od1) this.f19683c).f36190x0.measure(View.MeasureSpec.makeMeasureSpec(size6, 1073741824), View.MeasureSpec.makeMeasureSpec(size7, 1073741824));
                org.telegram.ui.t5 t5Var = ((od1) this.f19683c).Q1;
                if (t5Var != null) {
                    ((FrameLayout.LayoutParams) t5Var.getLayoutParams()).topMargin = measuredHeight;
                    ((od1) this.f19683c).Q1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(222.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824));
                }
                org.telegram.ui.u4 u4Var = ((od1) this.f19683c).C0;
                if (u4Var != null) {
                    int dp4 = AndroidUtilities.dp(12.0f);
                    int dp5 = AndroidUtilities.dp(12.0f);
                    int dp6 = AndroidUtilities.dp(12.0f);
                    int dp7 = AndroidUtilities.dp(12.0f);
                    if (((od1) this.f19683c).U0()) {
                        i22 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i22 = 0;
                    }
                    u4Var.setPadding(dp4, dp5, dp6, dp7 + i22);
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((od1) this.f19683c).C0.getLayoutParams();
                    od1 od1Var3 = (od1) this.f19683c;
                    int dp8 = AndroidUtilities.dp(72 + ((od1Var3.K1 || od1Var3.J1 <= 0) ? 0 : 0));
                    if (((od1) this.f19683c).U0()) {
                        i23 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i23 = 0;
                    }
                    layoutParams5.height = dp8 + i23;
                    measureChildWithMargins(((od1) this.f19683c).C0, i10, 0, i11, 0);
                }
                Drawable drawable = ((od1) this.f19683c).f36174r;
                if (drawable != null) {
                    drawable.getPadding(AndroidUtilities.rectTmp2);
                }
                int i29 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((od1) this.f19683c).L0;
                    if (i29 < frameLayoutArr.length) {
                        FrameLayout frameLayout = frameLayoutArr[i29];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i29 == 0) {
                                if (((od1) this.f19683c).f36131b == 2) {
                                    i21 = 321;
                                } else {
                                    i21 = 273;
                                }
                                f7 = i21;
                            } else {
                                f7 = 316.0f;
                            }
                            layoutParams6.height = AndroidUtilities.dp(f7);
                            if (((od1) this.f19683c).U0()) {
                                layoutParams6.height += AndroidUtilities.navigationBarHeight;
                            }
                            if (i29 == 0) {
                                layoutParams6.height = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top + layoutParams6.height;
                            }
                            FrameLayout frameLayout2 = ((od1) this.f19683c).L0[i29];
                            if (i29 == 0) {
                                i19 = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top;
                            } else {
                                i19 = 0;
                            }
                            if (((od1) this.f19683c).U0()) {
                                i20 = AndroidUtilities.navigationBarHeight;
                            } else {
                                i20 = 0;
                            }
                            frameLayout2.setPadding(0, i19, 0, i20);
                            measureChildWithMargins(((od1) this.f19683c).L0[i29], i10, 0, i11, 0);
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
        switch (this.f19681a) {
            case 0:
                if (!this.f19682b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f19682b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f19682b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f19682b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f19681a) {
            case 0:
                super.setAlpha(f7);
                u0 u0Var = (u0) this.f19683c;
                j0 j0Var = u0Var.f19795s;
                if (j0Var != null && j0Var.getTag() != null) {
                    u0Var.f19795s.setAlpha(f7);
                    u0Var.f19795s.setScaleX(f7);
                    u0Var.f19795s.setScaleY(f7);
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
        switch (this.f19681a) {
            case 0:
                super.setVisibility(i10);
                u0 u0Var = (u0) this.f19683c;
                j0 j0Var = u0Var.f19795s;
                if (j0Var != null) {
                    j0Var.setVisibility(i10);
                }
                View view = u0Var.f19799w;
                if (view != null) {
                    view.setVisibility(i10);
                }
                FrameLayout frameLayout = u0Var.f19772a;
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
