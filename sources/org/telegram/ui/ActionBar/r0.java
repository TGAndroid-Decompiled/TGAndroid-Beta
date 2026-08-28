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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.ib1;
import org.telegram.ui.oc1;
import org.telegram.ui.qn;
import org.telegram.ui.u11;
import org.telegram.ui.z11;
public final class r0 extends FrameLayout {
    public final int f23743a;
    public boolean f23744b;
    public final Object f23745c;

    public r0(Object obj, Context context, int i9) {
        super(context);
        this.f23743a = i9;
        this.f23745c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f23743a) {
            case 2:
                super.dispatchTouchEvent(motionEvent);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        b5 b5Var;
        b5 b5Var2;
        int i9;
        switch (this.f23743a) {
            case 3:
                boolean drawChild = super.drawChild(canvas, view, j10);
                oc1 oc1Var = (oc1) this.f23745c;
                if (view == oc1Var.f41093o0) {
                    b5Var = oc1Var.parentLayout;
                    if (b5Var != null) {
                        b5Var2 = oc1Var.parentLayout;
                        if (oc1Var.f41093o0.getVisibility() == 0) {
                            i9 = (int) (oc1Var.f41093o0.getTranslationY() + oc1Var.f41093o0.getMeasuredHeight());
                        } else {
                            i9 = 0;
                        }
                        ((ActionBarLayout) b5Var2).q(canvas, i9);
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        boolean z11;
        int measuredWidth;
        int measuredHeight;
        switch (this.f23743a) {
            case 0:
                w0 w0Var = (w0) this.f23745c;
                super.onLayout(z10, i9, i10, i11, i12);
                int i13 = 0;
                if (!LocaleController.isRTL && w0Var.h.getVisibility() == 0) {
                    i13 = AndroidUtilities.dp(4.0f) + w0Var.h.getMeasuredWidth();
                }
                if (w0Var.f23908f.getVisibility() == 0) {
                    i13 += w0Var.f23908f.getMeasuredWidth();
                }
                fg.g gVar = w0Var.f23906e;
                gVar.layout(i13, gVar.getTop(), w0Var.f23906e.getMeasuredWidth() + i13, w0Var.f23906e.getBottom());
                return;
            case 1:
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
            case 2:
                z11 z11Var = (z11) this.f23745c;
                int measuredWidth2 = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                int i14 = 0;
                if (measuredWidth2 < measuredHeight2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11Var.f45009x.getVisibility() == 0) {
                    if (z11) {
                        AndroidUtilities.rectTmp2.set(0, 0, measuredWidth2, AndroidUtilities.dp(25.0f) + (measuredHeight2 - z11Var.f45009x.getMeasuredHeight()));
                    } else {
                        AndroidUtilities.rectTmp2.set(0, 0, AndroidUtilities.dp(25.0f) + (measuredWidth2 - z11Var.f45009x.getWidth()), measuredHeight2);
                    }
                    z11Var.f45008w.setClipBounds(AndroidUtilities.rectTmp2);
                } else {
                    z11Var.f45008w.setClipBounds(null);
                }
                z11Var.f45008w.layout(0, 0, measuredWidth2, measuredHeight2);
                if (z11Var.f45009x.getVisibility() == 0) {
                    i14 = z11Var.f45009x.getMeasuredHeight();
                }
                if (z11) {
                    measuredWidth = (measuredWidth2 - z11Var.A.getMeasuredWidth()) / 2;
                } else {
                    measuredWidth = z11Var.M.f10848a + ((((measuredWidth2 - z11Var.f45009x.getMeasuredWidth()) - z11Var.M.f10848a) - z11Var.A.getMeasuredWidth()) / 2);
                }
                if (z11) {
                    int i15 = z11Var.M.f10849b;
                    measuredHeight = AndroidUtilities.dp(52.0f) + (((((measuredHeight2 - i14) - i15) - z11Var.A.getMeasuredHeight()) - AndroidUtilities.dp(48.0f)) / 2) + i15;
                } else {
                    measuredHeight = (measuredHeight2 - z11Var.A.getMeasuredHeight()) / 2;
                }
                u11 u11Var = z11Var.A;
                u11Var.layout(measuredWidth, measuredHeight, u11Var.getMeasuredWidth() + measuredWidth, z11Var.A.getMeasuredHeight() + measuredHeight);
                if (z11) {
                    int measuredWidth3 = (measuredWidth2 - z11Var.f45010y.getMeasuredWidth()) / 2;
                    int dp = measuredHeight - AndroidUtilities.dp(48.0f);
                    o9 o9Var = z11Var.f45010y;
                    o9Var.layout(measuredWidth3, dp, o9Var.getMeasuredWidth() + measuredWidth3, z11Var.f45010y.getMeasuredHeight() + dp);
                }
                if (z11Var.f45009x.getVisibility() == 0) {
                    if (z11) {
                        int measuredWidth4 = (measuredWidth2 - z11Var.f45009x.getMeasuredWidth()) / 2;
                        z11Var.f45009x.layout(measuredWidth4, getMeasuredHeight() - i14, z11Var.f45009x.getMeasuredWidth() + measuredWidth4, getMeasuredHeight());
                    } else {
                        int measuredHeight3 = (measuredHeight2 - z11Var.f45009x.getMeasuredHeight()) / 2;
                        z11Var.f45009x.layout(getMeasuredWidth() - z11Var.f45009x.getMeasuredWidth(), measuredHeight3, getMeasuredWidth(), z11Var.f45009x.getMeasuredHeight() + measuredHeight3);
                    }
                }
                pi0 pi0Var = z11Var.B;
                Rect rect = z11Var.f45002c;
                pi0Var.layout(rect.left + measuredWidth, rect.top + measuredHeight, measuredWidth + rect.right, measuredHeight + rect.bottom);
                int dp2 = AndroidUtilities.dp(11.0f) + z11Var.M.f10848a;
                int dp3 = AndroidUtilities.dp(11.0f) + z11Var.M.f10849b;
                ImageView imageView = z11Var.C;
                imageView.layout(dp2, dp3, imageView.getMeasuredWidth() + dp2, z11Var.C.getMeasuredHeight() + dp3);
                return;
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        r0 r0Var;
        int i13;
        int i14;
        int i15;
        int i16;
        TextView textView;
        boolean z10;
        int i17;
        float f10;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        switch (this.f23743a) {
            case 0:
                w0 w0Var = (w0) this.f23745c;
                measureChildWithMargins(w0Var.f23922s, i9, 0, i10, 0);
                View view = w0Var.f23923w;
                if (view != null) {
                    measureChildWithMargins(view, i9, 0, i10, 0);
                }
                if (!LocaleController.isRTL) {
                    if (w0Var.h.getVisibility() == 0) {
                        r0Var = this;
                        r0Var.measureChildWithMargins(w0Var.h, i9, View.MeasureSpec.getSize(i9) / 2, i10, 0);
                        i13 = AndroidUtilities.dp(4.0f) + w0Var.h.getMeasuredWidth();
                    } else {
                        r0Var = this;
                        i13 = 0;
                    }
                    int size = View.MeasureSpec.getSize(i9);
                    r0Var.f23744b = true;
                    r0Var.measureChildWithMargins(w0Var.f23908f, i9, i13, i10, 0);
                    if (w0Var.f23908f.getVisibility() == 0) {
                        i14 = w0Var.f23908f.getMeasuredWidth();
                    } else {
                        i14 = 0;
                    }
                    fg.g gVar = w0Var.f23906e;
                    int i25 = i13 + i14;
                    View view2 = w0Var.f23923w;
                    if (view2 != null) {
                        i15 = view2.getMeasuredWidth();
                    } else {
                        i15 = 0;
                    }
                    measureChildWithMargins(gVar, i9, i25 + i15, i10, 0);
                    this.f23744b = false;
                    setMeasuredDimension(Math.max(w0Var.f23906e.getMeasuredWidth() + i14, size), View.MeasureSpec.getSize(i10));
                    return;
                }
                if (w0Var.h.getVisibility() == 0) {
                    measureChildWithMargins(w0Var.h, i9, View.MeasureSpec.getSize(i9) / 2, i10, 0);
                    i11 = AndroidUtilities.dp(4.0f) + w0Var.h.getMeasuredWidth();
                } else {
                    i11 = 0;
                }
                int size2 = View.MeasureSpec.getSize(i9);
                this.f23744b = true;
                measureChildWithMargins(w0Var.f23908f, i9, i11, i10, 0);
                if (w0Var.f23908f.getVisibility() == 0) {
                    i12 = w0Var.f23908f.getMeasuredWidth();
                } else {
                    i12 = 0;
                }
                measureChildWithMargins(w0Var.f23906e, ll.d(12.0f, size2, 0), i11 + i12, i10, 0);
                this.f23744b = false;
                setMeasuredDimension(Math.max(w0Var.f23906e.getMeasuredWidth() + i12, size2), View.MeasureSpec.getSize(i10));
                return;
            case 1:
                int size3 = View.MeasureSpec.getSize(i9);
                qn qnVar = (qn) this.f23745c;
                if (qnVar.C9()) {
                    size3 -= AndroidUtilities.dp(71.0f);
                    i16 = AndroidUtilities.dp(32.0f);
                } else {
                    i16 = 0;
                }
                TextView textView2 = qnVar.H1;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = qnVar.J1) != null && textView.getVisibility() == 0) {
                    size3 = ll.y(31.0f, size3, 2);
                }
                this.f23744b = true;
                TextView textView3 = qnVar.J1;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qnVar.J1.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = qnVar.H1;
                    if (textView4 != null && textView4.getVisibility() == 0) {
                        qnVar.J1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        layoutParams.leftMargin = i16 + size3;
                        layoutParams.width -= AndroidUtilities.dp(15.0f);
                    } else {
                        qnVar.J1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                        layoutParams.leftMargin = i16;
                    }
                }
                TextView textView5 = qnVar.H1;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) qnVar.H1.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = qnVar.J1;
                    if (textView6 != null && textView6.getVisibility() == 0) {
                        qnVar.H1.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    } else {
                        qnVar.H1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                    }
                    layoutParams2.leftMargin = i16;
                }
                this.f23744b = false;
                super.onMeasure(i9, i10);
                return;
            case 2:
                z11 z11Var = (z11) this.f23745c;
                int size4 = View.MeasureSpec.getSize(i9);
                int size5 = View.MeasureSpec.getSize(i10);
                if (size4 < size5) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11Var.L = z10;
                o9 o9Var = z11Var.f45010y;
                if (z10) {
                    i17 = 0;
                } else {
                    i17 = 8;
                }
                o9Var.setVisibility(i17);
                super.onMeasure(i9, i10);
                if (z10) {
                    this.f23744b = true;
                    fh.v vVar = z11Var.f45009x;
                    int i26 = z11Var.M.f10848a;
                    int dp = AndroidUtilities.dp(8.0f);
                    i0.b bVar = z11Var.M;
                    vVar.setPadding(i26, dp, bVar.f10850c, bVar.d);
                    this.f23744b = false;
                    z11Var.f45009x.measure(View.MeasureSpec.makeMeasureSpec(size4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size5 + z11Var.M.d, Integer.MIN_VALUE));
                    z11Var.A.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(330.0f), 1073741824));
                    return;
                }
                this.f23744b = true;
                fh.v vVar2 = z11Var.f45009x;
                i0.b bVar2 = z11Var.M;
                vVar2.setPadding(0, (bVar2.f10849b * 2) / 3, bVar2.f10850c, bVar2.d);
                this.f23744b = false;
                z11Var.f45009x.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(273.0f) + z11Var.M.f10850c, 1073741824), i10);
                z11Var.A.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(310.0f), 1073741824));
                return;
            default:
                int size6 = View.MeasureSpec.getSize(i9);
                int size7 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size6, size7);
                if (((oc1) this.f23745c).f41070e != null) {
                    this.f23744b = true;
                    if (!AndroidUtilities.isTablet()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((oc1) this.f23745c).f41070e.getLayoutParams();
                        layoutParams3.topMargin = AndroidUtilities.statusBarHeight;
                        ((oc1) this.f23745c).f41070e.setLayoutParams(layoutParams3);
                    }
                    if (!AndroidUtilities.isTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 2) {
                        ((oc1) this.f23745c).h.setTextSize(1, 18.0f);
                    } else {
                        ((oc1) this.f23745c).h.setTextSize(1, 20.0f);
                    }
                    this.f23744b = false;
                }
                measureChildWithMargins(((oc1) this.f23745c).f41093o0, i9, 0, i10, 0);
                int measuredHeight = ((oc1) this.f23745c).f41093o0.getMeasuredHeight();
                if (((oc1) this.f23745c).f41093o0.getVisibility() == 0) {
                    size7 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((oc1) this.f23745c).f41097q0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                oc1 oc1Var = (oc1) this.f23745c;
                int i27 = 58;
                if (oc1Var.f41059b == 2) {
                    ib1 ib1Var = oc1Var.f41097q0;
                    int dp2 = AndroidUtilities.dp(4.0f);
                    oc1 oc1Var2 = (oc1) this.f23745c;
                    if (!oc1Var2.G1 && oc1Var2.F1 > 0) {
                        i23 = 58;
                    } else {
                        i23 = 0;
                    }
                    int dp3 = AndroidUtilities.dp(i23 + 72) - 12;
                    if (((oc1) this.f23745c).U0()) {
                        i24 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i24 = 0;
                    }
                    ib1Var.setPadding(0, dp2, 0, dp3 + i24);
                }
                ((oc1) this.f23745c).f41097q0.measure(View.MeasureSpec.makeMeasureSpec(size6, 1073741824), View.MeasureSpec.makeMeasureSpec(size7 - layoutParams4.bottomMargin, 1073741824));
                ((FrameLayout.LayoutParams) ((oc1) this.f23745c).f41105t0.getLayoutParams()).topMargin = measuredHeight;
                ((oc1) this.f23745c).f41105t0.measure(View.MeasureSpec.makeMeasureSpec(size6, 1073741824), View.MeasureSpec.makeMeasureSpec(size7, 1073741824));
                bh.g gVar2 = ((oc1) this.f23745c).M1;
                if (gVar2 != null) {
                    ((FrameLayout.LayoutParams) gVar2.getLayoutParams()).topMargin = measuredHeight;
                    ((oc1) this.f23745c).M1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(222.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824));
                }
                org.telegram.ui.t4 t4Var = ((oc1) this.f23745c).f41118y0;
                if (t4Var != null) {
                    int dp4 = AndroidUtilities.dp(12.0f);
                    int dp5 = AndroidUtilities.dp(12.0f);
                    int dp6 = AndroidUtilities.dp(12.0f);
                    int dp7 = AndroidUtilities.dp(12.0f);
                    if (((oc1) this.f23745c).U0()) {
                        i21 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i21 = 0;
                    }
                    t4Var.setPadding(dp4, dp5, dp6, dp7 + i21);
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((oc1) this.f23745c).f41118y0.getLayoutParams();
                    oc1 oc1Var3 = (oc1) this.f23745c;
                    int dp8 = AndroidUtilities.dp(72 + ((oc1Var3.G1 || oc1Var3.F1 <= 0) ? 0 : 0));
                    if (((oc1) this.f23745c).U0()) {
                        i22 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i22 = 0;
                    }
                    layoutParams5.height = dp8 + i22;
                    measureChildWithMargins(((oc1) this.f23745c).f41118y0, i9, 0, i10, 0);
                }
                Drawable drawable = ((oc1) this.f23745c).f41099r;
                if (drawable != null) {
                    drawable.getPadding(AndroidUtilities.rectTmp2);
                }
                int i28 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((oc1) this.f23745c).H0;
                    if (i28 < frameLayoutArr.length) {
                        FrameLayout frameLayout = frameLayoutArr[i28];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i28 == 0) {
                                if (((oc1) this.f23745c).f41059b == 2) {
                                    i20 = 321;
                                } else {
                                    i20 = 273;
                                }
                                f10 = i20;
                            } else {
                                f10 = 316.0f;
                            }
                            layoutParams6.height = AndroidUtilities.dp(f10);
                            if (((oc1) this.f23745c).U0()) {
                                layoutParams6.height += AndroidUtilities.navigationBarHeight;
                            }
                            if (i28 == 0) {
                                layoutParams6.height = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top + layoutParams6.height;
                            }
                            FrameLayout frameLayout2 = ((oc1) this.f23745c).H0[i28];
                            if (i28 == 0) {
                                i18 = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top;
                            } else {
                                i18 = 0;
                            }
                            if (((oc1) this.f23745c).U0()) {
                                i19 = AndroidUtilities.navigationBarHeight;
                            } else {
                                i19 = 0;
                            }
                            frameLayout2.setPadding(0, i18, 0, i19);
                            measureChildWithMargins(((oc1) this.f23745c).H0[i28], i9, 0, i10, 0);
                        }
                        i28++;
                    } else {
                        return;
                    }
                }
                break;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f23743a) {
            case 0:
                if (!this.f23744b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f23744b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f23744b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f23744b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f23743a) {
            case 0:
                super.setAlpha(f10);
                w0 w0Var = (w0) this.f23745c;
                l0 l0Var = w0Var.f23922s;
                if (l0Var != null && l0Var.getTag() != null) {
                    w0Var.f23922s.setAlpha(f10);
                    w0Var.f23922s.setScaleX(f10);
                    w0Var.f23922s.setScaleY(f10);
                    return;
                }
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i9) {
        switch (this.f23743a) {
            case 0:
                super.setVisibility(i9);
                w0 w0Var = (w0) this.f23745c;
                l0 l0Var = w0Var.f23922s;
                if (l0Var != null) {
                    l0Var.setVisibility(i9);
                }
                View view = w0Var.f23923w;
                if (view != null) {
                    view.setVisibility(i9);
                }
                FrameLayout frameLayout = w0Var.f23899a;
                if (frameLayout != null) {
                    frameLayout.setVisibility(i9);
                    return;
                }
                return;
            default:
                super.setVisibility(i9);
                return;
        }
    }
}
