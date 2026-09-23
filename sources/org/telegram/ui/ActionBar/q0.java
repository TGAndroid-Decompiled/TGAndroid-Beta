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
import org.telegram.messenger.ul;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.jc1;
import org.telegram.ui.od1;
import org.telegram.ui.r21;
import org.telegram.ui.x21;
import org.telegram.ui.xn;
public final class q0 extends FrameLayout {
    public final int f19468a;
    public boolean f19469b;
    public final Object f19470c;

    public q0(Object obj, Context context, int i10) {
        super(context);
        this.f19468a = i10;
        this.f19470c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f19468a) {
            case 2:
                super.dispatchTouchEvent(motionEvent);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        c5 c5Var;
        c5 c5Var2;
        int i10;
        switch (this.f19468a) {
            case 3:
                boolean drawChild = super.drawChild(canvas, view, j3);
                od1 od1Var = (od1) this.f19470c;
                if (view == od1Var.f35830s0) {
                    c5Var = od1Var.parentLayout;
                    if (c5Var != null) {
                        c5Var2 = od1Var.parentLayout;
                        if (od1Var.f35830s0.getVisibility() == 0) {
                            i10 = (int) (od1Var.f35830s0.getTranslationY() + od1Var.f35830s0.getMeasuredHeight());
                        } else {
                            i10 = 0;
                        }
                        ((ActionBarLayout) c5Var2).q(canvas, i10);
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
        switch (this.f19468a) {
            case 0:
                v0 v0Var = (v0) this.f19470c;
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = 0;
                if (!LocaleController.isRTL && v0Var.h.getVisibility() == 0) {
                    i14 = AndroidUtilities.dp(4.0f) + v0Var.h.getMeasuredWidth();
                }
                if (v0Var.f19567f.getVisibility() == 0) {
                    i14 += v0Var.f19567f.getMeasuredWidth();
                }
                ci.h2 h2Var = v0Var.e;
                h2Var.layout(i14, h2Var.getTop(), v0Var.e.getMeasuredWidth() + i14, v0Var.e.getBottom());
                return;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 2:
                x21 x21Var = (x21) this.f19470c;
                int measuredWidth2 = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                int i15 = 0;
                if (measuredWidth2 < measuredHeight2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (x21Var.f39177x.getVisibility() == 0) {
                    if (z11) {
                        AndroidUtilities.rectTmp2.set(0, 0, measuredWidth2, AndroidUtilities.dp(25.0f) + (measuredHeight2 - x21Var.f39177x.getMeasuredHeight()));
                    } else {
                        AndroidUtilities.rectTmp2.set(0, 0, AndroidUtilities.dp(25.0f) + (measuredWidth2 - x21Var.f39177x.getWidth()), measuredHeight2);
                    }
                    x21Var.f39176w.setClipBounds(AndroidUtilities.rectTmp2);
                } else {
                    x21Var.f39176w.setClipBounds(null);
                }
                x21Var.f39176w.layout(0, 0, measuredWidth2, measuredHeight2);
                if (x21Var.f39177x.getVisibility() == 0) {
                    i15 = x21Var.f39177x.getMeasuredHeight();
                }
                if (z11) {
                    measuredWidth = (measuredWidth2 - x21Var.E.getMeasuredWidth()) / 2;
                } else {
                    measuredWidth = x21Var.Q.f10576a + ((((measuredWidth2 - x21Var.f39177x.getMeasuredWidth()) - x21Var.Q.f10576a) - x21Var.E.getMeasuredWidth()) / 2);
                }
                if (z11) {
                    int i16 = x21Var.Q.f10577b;
                    measuredHeight = AndroidUtilities.dp(52.0f) + (((((measuredHeight2 - i15) - i16) - x21Var.E.getMeasuredHeight()) - AndroidUtilities.dp(48.0f)) / 2) + i16;
                } else {
                    measuredHeight = (measuredHeight2 - x21Var.E.getMeasuredHeight()) / 2;
                }
                r21 r21Var = x21Var.E;
                r21Var.layout(measuredWidth, measuredHeight, r21Var.getMeasuredWidth() + measuredWidth, x21Var.E.getMeasuredHeight() + measuredHeight);
                if (z11) {
                    int measuredWidth3 = (measuredWidth2 - x21Var.f39178y.getMeasuredWidth()) / 2;
                    int dp = measuredHeight - AndroidUtilities.dp(48.0f);
                    w9 w9Var = x21Var.f39178y;
                    w9Var.layout(measuredWidth3, dp, w9Var.getMeasuredWidth() + measuredWidth3, x21Var.f39178y.getMeasuredHeight() + dp);
                }
                if (x21Var.f39177x.getVisibility() == 0) {
                    if (z11) {
                        int measuredWidth4 = (measuredWidth2 - x21Var.f39177x.getMeasuredWidth()) / 2;
                        x21Var.f39177x.layout(measuredWidth4, getMeasuredHeight() - i15, x21Var.f39177x.getMeasuredWidth() + measuredWidth4, getMeasuredHeight());
                    } else {
                        int measuredHeight3 = (measuredHeight2 - x21Var.f39177x.getMeasuredHeight()) / 2;
                        x21Var.f39177x.layout(getMeasuredWidth() - x21Var.f39177x.getMeasuredWidth(), measuredHeight3, getMeasuredWidth(), x21Var.f39177x.getMeasuredHeight() + measuredHeight3);
                    }
                }
                bj0 bj0Var = x21Var.F;
                Rect rect = x21Var.f39171c;
                bj0Var.layout(rect.left + measuredWidth, rect.top + measuredHeight, measuredWidth + rect.right, measuredHeight + rect.bottom);
                int dp2 = AndroidUtilities.dp(11.0f) + x21Var.Q.f10576a;
                int dp3 = AndroidUtilities.dp(11.0f) + x21Var.Q.f10577b;
                ImageView imageView = x21Var.G;
                imageView.layout(dp2, dp3, imageView.getMeasuredWidth() + dp2, x21Var.G.getMeasuredHeight() + dp3);
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
        switch (this.f19468a) {
            case 0:
                v0 v0Var = (v0) this.f19470c;
                measureChildWithMargins(v0Var.f19582s, i10, 0, i11, 0);
                View view = v0Var.f19586w;
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
                    q0Var.f19469b = true;
                    q0Var.measureChildWithMargins(v0Var.f19567f, i10, i14, i11, 0);
                    if (v0Var.f19567f.getVisibility() == 0) {
                        i15 = v0Var.f19567f.getMeasuredWidth();
                    } else {
                        i15 = 0;
                    }
                    ci.h2 h2Var = v0Var.e;
                    int i26 = i14 + i15;
                    View view2 = v0Var.f19586w;
                    if (view2 != null) {
                        i16 = view2.getMeasuredWidth();
                    } else {
                        i16 = 0;
                    }
                    measureChildWithMargins(h2Var, i10, i26 + i16, i11, 0);
                    this.f19469b = false;
                    setMeasuredDimension(Math.max(v0Var.e.getMeasuredWidth() + i15, size), View.MeasureSpec.getSize(i11));
                    return;
                }
                if (v0Var.h.getVisibility() == 0) {
                    measureChildWithMargins(v0Var.h, i10, View.MeasureSpec.getSize(i10) / 2, i11, 0);
                    i12 = AndroidUtilities.dp(4.0f) + v0Var.h.getMeasuredWidth();
                } else {
                    i12 = 0;
                }
                int size2 = View.MeasureSpec.getSize(i10);
                this.f19469b = true;
                measureChildWithMargins(v0Var.f19567f, i10, i12, i11, 0);
                if (v0Var.f19567f.getVisibility() == 0) {
                    i13 = v0Var.f19567f.getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                measureChildWithMargins(v0Var.e, ul.d(12.0f, size2, 0), i12 + i13, i11, 0);
                this.f19469b = false;
                setMeasuredDimension(Math.max(v0Var.e.getMeasuredWidth() + i13, size2), View.MeasureSpec.getSize(i11));
                return;
            case 1:
                int size3 = View.MeasureSpec.getSize(i10);
                xn xnVar = (xn) this.f19470c;
                if (xnVar.C9()) {
                    size3 -= AndroidUtilities.dp(71.0f);
                    i17 = AndroidUtilities.dp(32.0f);
                } else {
                    i17 = 0;
                }
                TextView textView2 = xnVar.L1;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = xnVar.N1) != null && textView.getVisibility() == 0) {
                    size3 = ul.y(31.0f, size3, 2);
                }
                this.f19469b = true;
                TextView textView3 = xnVar.N1;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) xnVar.N1.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = xnVar.L1;
                    if (textView4 != null && textView4.getVisibility() == 0) {
                        xnVar.N1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        layoutParams.leftMargin = i17 + size3;
                        layoutParams.width -= AndroidUtilities.dp(15.0f);
                    } else {
                        xnVar.N1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                        layoutParams.leftMargin = i17;
                    }
                }
                TextView textView5 = xnVar.L1;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) xnVar.L1.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = xnVar.N1;
                    if (textView6 != null && textView6.getVisibility() == 0) {
                        xnVar.L1.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    } else {
                        xnVar.L1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                    }
                    layoutParams2.leftMargin = i17;
                }
                this.f19469b = false;
                super.onMeasure(i10, i11);
                return;
            case 2:
                x21 x21Var = (x21) this.f19470c;
                int size4 = View.MeasureSpec.getSize(i10);
                int size5 = View.MeasureSpec.getSize(i11);
                if (size4 < size5) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                x21Var.P = z10;
                w9 w9Var = x21Var.f39178y;
                if (z10) {
                    i18 = 0;
                } else {
                    i18 = 8;
                }
                w9Var.setVisibility(i18);
                super.onMeasure(i10, i11);
                if (z10) {
                    this.f19469b = true;
                    m6 m6Var = x21Var.f39177x;
                    int i27 = x21Var.Q.f10576a;
                    int dp = AndroidUtilities.dp(8.0f);
                    i0.b bVar = x21Var.Q;
                    m6Var.setPadding(i27, dp, bVar.f10578c, bVar.d);
                    this.f19469b = false;
                    x21Var.f39177x.measure(View.MeasureSpec.makeMeasureSpec(size4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size5 + x21Var.Q.d, Integer.MIN_VALUE));
                    x21Var.E.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(330.0f), 1073741824));
                    return;
                }
                this.f19469b = true;
                m6 m6Var2 = x21Var.f39177x;
                i0.b bVar2 = x21Var.Q;
                m6Var2.setPadding(0, (bVar2.f10577b * 2) / 3, bVar2.f10578c, bVar2.d);
                this.f19469b = false;
                x21Var.f39177x.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(273.0f) + x21Var.Q.f10578c, 1073741824), i11);
                x21Var.E.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(310.0f), 1073741824));
                return;
            default:
                int size6 = View.MeasureSpec.getSize(i10);
                int size7 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size6, size7);
                if (((od1) this.f19470c).e != null) {
                    this.f19469b = true;
                    if (!AndroidUtilities.isTablet()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((od1) this.f19470c).e.getLayoutParams();
                        layoutParams3.topMargin = AndroidUtilities.statusBarHeight;
                        ((od1) this.f19470c).e.setLayoutParams(layoutParams3);
                    }
                    if (!AndroidUtilities.isTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 2) {
                        ((od1) this.f19470c).h.setTextSize(1, 18.0f);
                    } else {
                        ((od1) this.f19470c).h.setTextSize(1, 20.0f);
                    }
                    this.f19469b = false;
                }
                measureChildWithMargins(((od1) this.f19470c).f35830s0, i10, 0, i11, 0);
                int measuredHeight = ((od1) this.f19470c).f35830s0.getMeasuredHeight();
                if (((od1) this.f19470c).f35830s0.getVisibility() == 0) {
                    size7 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((od1) this.f19470c).f35834u0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                od1 od1Var = (od1) this.f19470c;
                int i28 = 58;
                if (od1Var.f35783b == 2) {
                    jc1 jc1Var = od1Var.f35834u0;
                    int dp2 = AndroidUtilities.dp(4.0f);
                    od1 od1Var2 = (od1) this.f19470c;
                    if (!od1Var2.K1 && od1Var2.J1 > 0) {
                        i24 = 58;
                    } else {
                        i24 = 0;
                    }
                    int dp3 = AndroidUtilities.dp(i24 + 72) - 12;
                    if (((od1) this.f19470c).U0()) {
                        i25 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i25 = 0;
                    }
                    jc1Var.setPadding(0, dp2, 0, dp3 + i25);
                }
                ((od1) this.f19470c).f35834u0.measure(View.MeasureSpec.makeMeasureSpec(size6, 1073741824), View.MeasureSpec.makeMeasureSpec(size7 - layoutParams4.bottomMargin, 1073741824));
                ((FrameLayout.LayoutParams) ((od1) this.f19470c).f35842x0.getLayoutParams()).topMargin = measuredHeight;
                ((od1) this.f19470c).f35842x0.measure(View.MeasureSpec.makeMeasureSpec(size6, 1073741824), View.MeasureSpec.makeMeasureSpec(size7, 1073741824));
                org.telegram.ui.u5 u5Var = ((od1) this.f19470c).Q1;
                if (u5Var != null) {
                    ((FrameLayout.LayoutParams) u5Var.getLayoutParams()).topMargin = measuredHeight;
                    ((od1) this.f19470c).Q1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(222.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824));
                }
                org.telegram.ui.v4 v4Var = ((od1) this.f19470c).C0;
                if (v4Var != null) {
                    int dp4 = AndroidUtilities.dp(12.0f);
                    int dp5 = AndroidUtilities.dp(12.0f);
                    int dp6 = AndroidUtilities.dp(12.0f);
                    int dp7 = AndroidUtilities.dp(12.0f);
                    if (((od1) this.f19470c).U0()) {
                        i22 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i22 = 0;
                    }
                    v4Var.setPadding(dp4, dp5, dp6, dp7 + i22);
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((od1) this.f19470c).C0.getLayoutParams();
                    od1 od1Var3 = (od1) this.f19470c;
                    int dp8 = AndroidUtilities.dp(72 + ((od1Var3.K1 || od1Var3.J1 <= 0) ? 0 : 0));
                    if (((od1) this.f19470c).U0()) {
                        i23 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i23 = 0;
                    }
                    layoutParams5.height = dp8 + i23;
                    measureChildWithMargins(((od1) this.f19470c).C0, i10, 0, i11, 0);
                }
                Drawable drawable = ((od1) this.f19470c).f35826r;
                if (drawable != null) {
                    drawable.getPadding(AndroidUtilities.rectTmp2);
                }
                int i29 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((od1) this.f19470c).L0;
                    if (i29 < frameLayoutArr.length) {
                        FrameLayout frameLayout = frameLayoutArr[i29];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i29 == 0) {
                                if (((od1) this.f19470c).f35783b == 2) {
                                    i21 = 321;
                                } else {
                                    i21 = 273;
                                }
                                f7 = i21;
                            } else {
                                f7 = 316.0f;
                            }
                            layoutParams6.height = AndroidUtilities.dp(f7);
                            if (((od1) this.f19470c).U0()) {
                                layoutParams6.height += AndroidUtilities.navigationBarHeight;
                            }
                            if (i29 == 0) {
                                layoutParams6.height = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top + layoutParams6.height;
                            }
                            FrameLayout frameLayout2 = ((od1) this.f19470c).L0[i29];
                            if (i29 == 0) {
                                i19 = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top;
                            } else {
                                i19 = 0;
                            }
                            if (((od1) this.f19470c).U0()) {
                                i20 = AndroidUtilities.navigationBarHeight;
                            } else {
                                i20 = 0;
                            }
                            frameLayout2.setPadding(0, i19, 0, i20);
                            measureChildWithMargins(((od1) this.f19470c).L0[i29], i10, 0, i11, 0);
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
        switch (this.f19468a) {
            case 0:
                if (!this.f19469b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f19469b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f19469b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f19469b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f19468a) {
            case 0:
                super.setAlpha(f7);
                v0 v0Var = (v0) this.f19470c;
                k0 k0Var = v0Var.f19582s;
                if (k0Var != null && k0Var.getTag() != null) {
                    v0Var.f19582s.setAlpha(f7);
                    v0Var.f19582s.setScaleX(f7);
                    v0Var.f19582s.setScaleY(f7);
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
        switch (this.f19468a) {
            case 0:
                super.setVisibility(i10);
                v0 v0Var = (v0) this.f19470c;
                k0 k0Var = v0Var.f19582s;
                if (k0Var != null) {
                    k0Var.setVisibility(i10);
                }
                View view = v0Var.f19586w;
                if (view != null) {
                    view.setVisibility(i10);
                }
                FrameLayout frameLayout = v0Var.f19559a;
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
