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
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.t9;
import org.telegram.ui.a21;
import org.telegram.ui.jb1;
import org.telegram.ui.qc1;
import org.telegram.ui.tn;
import org.telegram.ui.v11;
public final class r0 extends FrameLayout {
    public final int f23766a;
    public boolean f23767b;
    public final Object f23768c;

    public r0(Object obj, Context context, int i10) {
        super(context);
        this.f23766a = i10;
        this.f23768c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f23766a) {
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
        int i10;
        switch (this.f23766a) {
            case 3:
                boolean drawChild = super.drawChild(canvas, view, j10);
                qc1 qc1Var = (qc1) this.f23768c;
                if (view == qc1Var.f41660o0) {
                    b5Var = qc1Var.parentLayout;
                    if (b5Var != null) {
                        b5Var2 = qc1Var.parentLayout;
                        if (qc1Var.f41660o0.getVisibility() == 0) {
                            i10 = (int) (qc1Var.f41660o0.getTranslationY() + qc1Var.f41660o0.getMeasuredHeight());
                        } else {
                            i10 = 0;
                        }
                        ((ActionBarLayout) b5Var2).q(canvas, i10);
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        int measuredWidth;
        int measuredHeight;
        switch (this.f23766a) {
            case 0:
                w0 w0Var = (w0) this.f23768c;
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = 0;
                if (!LocaleController.isRTL && w0Var.h.getVisibility() == 0) {
                    i14 = AndroidUtilities.dp(4.0f) + w0Var.h.getMeasuredWidth();
                }
                if (w0Var.f23922f.getVisibility() == 0) {
                    i14 += w0Var.f23922f.getMeasuredWidth();
                }
                ig.f fVar = w0Var.f23920e;
                fVar.layout(i14, fVar.getTop(), w0Var.f23920e.getMeasuredWidth() + i14, w0Var.f23920e.getBottom());
                return;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 2:
                a21 a21Var = (a21) this.f23768c;
                int measuredWidth2 = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                int i15 = 0;
                if (measuredWidth2 < measuredHeight2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (a21Var.f36412x.getVisibility() == 0) {
                    if (z11) {
                        AndroidUtilities.rectTmp2.set(0, 0, measuredWidth2, AndroidUtilities.dp(25.0f) + (measuredHeight2 - a21Var.f36412x.getMeasuredHeight()));
                    } else {
                        AndroidUtilities.rectTmp2.set(0, 0, AndroidUtilities.dp(25.0f) + (measuredWidth2 - a21Var.f36412x.getWidth()), measuredHeight2);
                    }
                    a21Var.f36411w.setClipBounds(AndroidUtilities.rectTmp2);
                } else {
                    a21Var.f36411w.setClipBounds(null);
                }
                a21Var.f36411w.layout(0, 0, measuredWidth2, measuredHeight2);
                if (a21Var.f36412x.getVisibility() == 0) {
                    i15 = a21Var.f36412x.getMeasuredHeight();
                }
                if (z11) {
                    measuredWidth = (measuredWidth2 - a21Var.A.getMeasuredWidth()) / 2;
                } else {
                    measuredWidth = a21Var.M.f8186a + ((((measuredWidth2 - a21Var.f36412x.getMeasuredWidth()) - a21Var.M.f8186a) - a21Var.A.getMeasuredWidth()) / 2);
                }
                if (z11) {
                    int i16 = a21Var.M.f8187b;
                    measuredHeight = AndroidUtilities.dp(52.0f) + (((((measuredHeight2 - i15) - i16) - a21Var.A.getMeasuredHeight()) - AndroidUtilities.dp(48.0f)) / 2) + i16;
                } else {
                    measuredHeight = (measuredHeight2 - a21Var.A.getMeasuredHeight()) / 2;
                }
                v11 v11Var = a21Var.A;
                v11Var.layout(measuredWidth, measuredHeight, v11Var.getMeasuredWidth() + measuredWidth, a21Var.A.getMeasuredHeight() + measuredHeight);
                if (z11) {
                    int measuredWidth3 = (measuredWidth2 - a21Var.f36413y.getMeasuredWidth()) / 2;
                    int dp = measuredHeight - AndroidUtilities.dp(48.0f);
                    t9 t9Var = a21Var.f36413y;
                    t9Var.layout(measuredWidth3, dp, t9Var.getMeasuredWidth() + measuredWidth3, a21Var.f36413y.getMeasuredHeight() + dp);
                }
                if (a21Var.f36412x.getVisibility() == 0) {
                    if (z11) {
                        int measuredWidth4 = (measuredWidth2 - a21Var.f36412x.getMeasuredWidth()) / 2;
                        a21Var.f36412x.layout(measuredWidth4, getMeasuredHeight() - i15, a21Var.f36412x.getMeasuredWidth() + measuredWidth4, getMeasuredHeight());
                    } else {
                        int measuredHeight3 = (measuredHeight2 - a21Var.f36412x.getMeasuredHeight()) / 2;
                        a21Var.f36412x.layout(getMeasuredWidth() - a21Var.f36412x.getMeasuredWidth(), measuredHeight3, getMeasuredWidth(), a21Var.f36412x.getMeasuredHeight() + measuredHeight3);
                    }
                }
                aj0 aj0Var = a21Var.B;
                Rect rect = a21Var.f36405c;
                aj0Var.layout(rect.left + measuredWidth, rect.top + measuredHeight, measuredWidth + rect.right, measuredHeight + rect.bottom);
                int dp2 = AndroidUtilities.dp(11.0f) + a21Var.M.f8186a;
                int dp3 = AndroidUtilities.dp(11.0f) + a21Var.M.f8187b;
                ImageView imageView = a21Var.C;
                imageView.layout(dp2, dp3, imageView.getMeasuredWidth() + dp2, a21Var.C.getMeasuredHeight() + dp3);
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        r0 r0Var;
        int i14;
        int i15;
        int i16;
        int i17;
        TextView textView;
        boolean z10;
        int i18;
        float f9;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        switch (this.f23766a) {
            case 0:
                w0 w0Var = (w0) this.f23768c;
                measureChildWithMargins(w0Var.f23936s, i10, 0, i11, 0);
                View view = w0Var.f23937w;
                if (view != null) {
                    measureChildWithMargins(view, i10, 0, i11, 0);
                }
                if (!LocaleController.isRTL) {
                    if (w0Var.h.getVisibility() == 0) {
                        r0Var = this;
                        r0Var.measureChildWithMargins(w0Var.h, i10, View.MeasureSpec.getSize(i10) / 2, i11, 0);
                        i14 = AndroidUtilities.dp(4.0f) + w0Var.h.getMeasuredWidth();
                    } else {
                        r0Var = this;
                        i14 = 0;
                    }
                    int size = View.MeasureSpec.getSize(i10);
                    r0Var.f23767b = true;
                    r0Var.measureChildWithMargins(w0Var.f23922f, i10, i14, i11, 0);
                    if (w0Var.f23922f.getVisibility() == 0) {
                        i15 = w0Var.f23922f.getMeasuredWidth();
                    } else {
                        i15 = 0;
                    }
                    ig.f fVar = w0Var.f23920e;
                    int i26 = i14 + i15;
                    View view2 = w0Var.f23937w;
                    if (view2 != null) {
                        i16 = view2.getMeasuredWidth();
                    } else {
                        i16 = 0;
                    }
                    measureChildWithMargins(fVar, i10, i26 + i16, i11, 0);
                    this.f23767b = false;
                    setMeasuredDimension(Math.max(w0Var.f23920e.getMeasuredWidth() + i15, size), View.MeasureSpec.getSize(i11));
                    return;
                }
                if (w0Var.h.getVisibility() == 0) {
                    measureChildWithMargins(w0Var.h, i10, View.MeasureSpec.getSize(i10) / 2, i11, 0);
                    i12 = AndroidUtilities.dp(4.0f) + w0Var.h.getMeasuredWidth();
                } else {
                    i12 = 0;
                }
                int size2 = View.MeasureSpec.getSize(i10);
                this.f23767b = true;
                measureChildWithMargins(w0Var.f23922f, i10, i12, i11, 0);
                if (w0Var.f23922f.getVisibility() == 0) {
                    i13 = w0Var.f23922f.getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                measureChildWithMargins(w0Var.f23920e, org.telegram.ui.b.d(12.0f, size2, 0), i12 + i13, i11, 0);
                this.f23767b = false;
                setMeasuredDimension(Math.max(w0Var.f23920e.getMeasuredWidth() + i13, size2), View.MeasureSpec.getSize(i11));
                return;
            case 1:
                int size3 = View.MeasureSpec.getSize(i10);
                tn tnVar = (tn) this.f23768c;
                if (tnVar.C9()) {
                    size3 -= AndroidUtilities.dp(71.0f);
                    i17 = AndroidUtilities.dp(32.0f);
                } else {
                    i17 = 0;
                }
                TextView textView2 = tnVar.H1;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = tnVar.J1) != null && textView.getVisibility() == 0) {
                    size3 = org.telegram.ui.b.x(31.0f, size3, 2);
                }
                this.f23767b = true;
                TextView textView3 = tnVar.J1;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tnVar.J1.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = tnVar.H1;
                    if (textView4 != null && textView4.getVisibility() == 0) {
                        tnVar.J1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        layoutParams.leftMargin = i17 + size3;
                        layoutParams.width -= AndroidUtilities.dp(15.0f);
                    } else {
                        tnVar.J1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                        layoutParams.leftMargin = i17;
                    }
                }
                TextView textView5 = tnVar.H1;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) tnVar.H1.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = tnVar.J1;
                    if (textView6 != null && textView6.getVisibility() == 0) {
                        tnVar.H1.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    } else {
                        tnVar.H1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                    }
                    layoutParams2.leftMargin = i17;
                }
                this.f23767b = false;
                super.onMeasure(i10, i11);
                return;
            case 2:
                a21 a21Var = (a21) this.f23768c;
                int size4 = View.MeasureSpec.getSize(i10);
                int size5 = View.MeasureSpec.getSize(i11);
                if (size4 < size5) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a21Var.L = z10;
                t9 t9Var = a21Var.f36413y;
                if (z10) {
                    i18 = 0;
                } else {
                    i18 = 8;
                }
                t9Var.setVisibility(i18);
                super.onMeasure(i10, i11);
                if (z10) {
                    this.f23767b = true;
                    bg.d1 d1Var = a21Var.f36412x;
                    int i27 = a21Var.M.f8186a;
                    int dp = AndroidUtilities.dp(8.0f);
                    i0.b bVar = a21Var.M;
                    d1Var.setPadding(i27, dp, bVar.f8188c, bVar.d);
                    this.f23767b = false;
                    a21Var.f36412x.measure(View.MeasureSpec.makeMeasureSpec(size4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size5 + a21Var.M.d, Integer.MIN_VALUE));
                    a21Var.A.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(330.0f), 1073741824));
                    return;
                }
                this.f23767b = true;
                bg.d1 d1Var2 = a21Var.f36412x;
                i0.b bVar2 = a21Var.M;
                d1Var2.setPadding(0, (bVar2.f8187b * 2) / 3, bVar2.f8188c, bVar2.d);
                this.f23767b = false;
                a21Var.f36412x.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(273.0f) + a21Var.M.f8188c, 1073741824), i11);
                a21Var.A.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(310.0f), 1073741824));
                return;
            default:
                int size6 = View.MeasureSpec.getSize(i10);
                int size7 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size6, size7);
                if (((qc1) this.f23768c).f41637e != null) {
                    this.f23767b = true;
                    if (!AndroidUtilities.isTablet()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((qc1) this.f23768c).f41637e.getLayoutParams();
                        layoutParams3.topMargin = AndroidUtilities.statusBarHeight;
                        ((qc1) this.f23768c).f41637e.setLayoutParams(layoutParams3);
                    }
                    if (!AndroidUtilities.isTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 2) {
                        ((qc1) this.f23768c).h.setTextSize(1, 18.0f);
                    } else {
                        ((qc1) this.f23768c).h.setTextSize(1, 20.0f);
                    }
                    this.f23767b = false;
                }
                measureChildWithMargins(((qc1) this.f23768c).f41660o0, i10, 0, i11, 0);
                int measuredHeight = ((qc1) this.f23768c).f41660o0.getMeasuredHeight();
                if (((qc1) this.f23768c).f41660o0.getVisibility() == 0) {
                    size7 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((qc1) this.f23768c).f41664q0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                qc1 qc1Var = (qc1) this.f23768c;
                int i28 = 58;
                if (qc1Var.f41626b == 2) {
                    jb1 jb1Var = qc1Var.f41664q0;
                    int dp2 = AndroidUtilities.dp(4.0f);
                    qc1 qc1Var2 = (qc1) this.f23768c;
                    if (!qc1Var2.G1 && qc1Var2.F1 > 0) {
                        i24 = 58;
                    } else {
                        i24 = 0;
                    }
                    int dp3 = AndroidUtilities.dp(i24 + 72) - 12;
                    if (((qc1) this.f23768c).U0()) {
                        i25 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i25 = 0;
                    }
                    jb1Var.setPadding(0, dp2, 0, dp3 + i25);
                }
                ((qc1) this.f23768c).f41664q0.measure(View.MeasureSpec.makeMeasureSpec(size6, 1073741824), View.MeasureSpec.makeMeasureSpec(size7 - layoutParams4.bottomMargin, 1073741824));
                ((FrameLayout.LayoutParams) ((qc1) this.f23768c).f41672t0.getLayoutParams()).topMargin = measuredHeight;
                ((qc1) this.f23768c).f41672t0.measure(View.MeasureSpec.makeMeasureSpec(size6, 1073741824), View.MeasureSpec.makeMeasureSpec(size7, 1073741824));
                bg.u1 u1Var = ((qc1) this.f23768c).M1;
                if (u1Var != null) {
                    ((FrameLayout.LayoutParams) u1Var.getLayoutParams()).topMargin = measuredHeight;
                    ((qc1) this.f23768c).M1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(222.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824));
                }
                org.telegram.ui.u4 u4Var = ((qc1) this.f23768c).f41685y0;
                if (u4Var != null) {
                    int dp4 = AndroidUtilities.dp(12.0f);
                    int dp5 = AndroidUtilities.dp(12.0f);
                    int dp6 = AndroidUtilities.dp(12.0f);
                    int dp7 = AndroidUtilities.dp(12.0f);
                    if (((qc1) this.f23768c).U0()) {
                        i22 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i22 = 0;
                    }
                    u4Var.setPadding(dp4, dp5, dp6, dp7 + i22);
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((qc1) this.f23768c).f41685y0.getLayoutParams();
                    qc1 qc1Var3 = (qc1) this.f23768c;
                    int dp8 = AndroidUtilities.dp(72 + ((qc1Var3.G1 || qc1Var3.F1 <= 0) ? 0 : 0));
                    if (((qc1) this.f23768c).U0()) {
                        i23 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i23 = 0;
                    }
                    layoutParams5.height = dp8 + i23;
                    measureChildWithMargins(((qc1) this.f23768c).f41685y0, i10, 0, i11, 0);
                }
                Drawable drawable = ((qc1) this.f23768c).f41666r;
                if (drawable != null) {
                    drawable.getPadding(AndroidUtilities.rectTmp2);
                }
                int i29 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((qc1) this.f23768c).H0;
                    if (i29 < frameLayoutArr.length) {
                        FrameLayout frameLayout = frameLayoutArr[i29];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i29 == 0) {
                                if (((qc1) this.f23768c).f41626b == 2) {
                                    i21 = 321;
                                } else {
                                    i21 = 273;
                                }
                                f9 = i21;
                            } else {
                                f9 = 316.0f;
                            }
                            layoutParams6.height = AndroidUtilities.dp(f9);
                            if (((qc1) this.f23768c).U0()) {
                                layoutParams6.height += AndroidUtilities.navigationBarHeight;
                            }
                            if (i29 == 0) {
                                layoutParams6.height = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top + layoutParams6.height;
                            }
                            FrameLayout frameLayout2 = ((qc1) this.f23768c).H0[i29];
                            if (i29 == 0) {
                                i19 = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top;
                            } else {
                                i19 = 0;
                            }
                            if (((qc1) this.f23768c).U0()) {
                                i20 = AndroidUtilities.navigationBarHeight;
                            } else {
                                i20 = 0;
                            }
                            frameLayout2.setPadding(0, i19, 0, i20);
                            measureChildWithMargins(((qc1) this.f23768c).H0[i29], i10, 0, i11, 0);
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
        switch (this.f23766a) {
            case 0:
                if (!this.f23767b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f23767b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f23767b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f23767b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setAlpha(float f9) {
        switch (this.f23766a) {
            case 0:
                super.setAlpha(f9);
                w0 w0Var = (w0) this.f23768c;
                m0 m0Var = w0Var.f23936s;
                if (m0Var != null && m0Var.getTag() != null) {
                    w0Var.f23936s.setAlpha(f9);
                    w0Var.f23936s.setScaleX(f9);
                    w0Var.f23936s.setScaleY(f9);
                    return;
                }
                return;
            default:
                super.setAlpha(f9);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f23766a) {
            case 0:
                super.setVisibility(i10);
                w0 w0Var = (w0) this.f23768c;
                m0 m0Var = w0Var.f23936s;
                if (m0Var != null) {
                    m0Var.setVisibility(i10);
                }
                View view = w0Var.f23937w;
                if (view != null) {
                    view.setVisibility(i10);
                }
                FrameLayout frameLayout = w0Var.f23913a;
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
