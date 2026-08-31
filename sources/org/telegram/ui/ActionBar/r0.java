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
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.ed1;
import org.telegram.ui.j21;
import org.telegram.ui.o21;
import org.telegram.ui.xb1;
import org.telegram.ui.xn;
public final class r0 extends FrameLayout {
    public final int f22246a;
    public boolean f22247b;
    public final Object f22248c;

    public r0(Object obj, Context context, int i10) {
        super(context);
        this.f22246a = i10;
        this.f22248c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f22246a) {
            case 2:
                super.dispatchTouchEvent(motionEvent);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        f5 f5Var;
        f5 f5Var2;
        int i10;
        switch (this.f22246a) {
            case 3:
                boolean drawChild = super.drawChild(canvas, view, j10);
                ed1 ed1Var = (ed1) this.f22248c;
                if (view == ed1Var.f36526p0) {
                    f5Var = ed1Var.parentLayout;
                    if (f5Var != null) {
                        f5Var2 = ed1Var.parentLayout;
                        if (ed1Var.f36526p0.getVisibility() == 0) {
                            i10 = (int) (ed1Var.f36526p0.getTranslationY() + ed1Var.f36526p0.getMeasuredHeight());
                        } else {
                            i10 = 0;
                        }
                        ((ActionBarLayout) f5Var2).q(canvas, i10);
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        boolean z10;
        int measuredWidth;
        int measuredHeight;
        switch (this.f22246a) {
            case 0:
                w0 w0Var = (w0) this.f22248c;
                super.onLayout(z4, i10, i11, i12, i13);
                int i14 = 0;
                if (!LocaleController.isRTL && w0Var.h.getVisibility() == 0) {
                    i14 = AndroidUtilities.dp(4.0f) + w0Var.h.getMeasuredWidth();
                }
                if (w0Var.f22351f.getVisibility() == 0) {
                    i14 += w0Var.f22351f.getMeasuredWidth();
                }
                lg.f fVar = w0Var.f22349e;
                fVar.layout(i14, fVar.getTop(), w0Var.f22349e.getMeasuredWidth() + i14, w0Var.f22349e.getBottom());
                return;
            case 1:
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
            case 2:
                o21 o21Var = (o21) this.f22248c;
                int measuredWidth2 = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                int i15 = 0;
                if (measuredWidth2 < measuredHeight2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (o21Var.f39574x.getVisibility() == 0) {
                    if (z10) {
                        AndroidUtilities.rectTmp2.set(0, 0, measuredWidth2, AndroidUtilities.dp(25.0f) + (measuredHeight2 - o21Var.f39574x.getMeasuredHeight()));
                    } else {
                        AndroidUtilities.rectTmp2.set(0, 0, AndroidUtilities.dp(25.0f) + (measuredWidth2 - o21Var.f39574x.getWidth()), measuredHeight2);
                    }
                    o21Var.f39573w.setClipBounds(AndroidUtilities.rectTmp2);
                } else {
                    o21Var.f39573w.setClipBounds(null);
                }
                o21Var.f39573w.layout(0, 0, measuredWidth2, measuredHeight2);
                if (o21Var.f39574x.getVisibility() == 0) {
                    i15 = o21Var.f39574x.getMeasuredHeight();
                }
                if (z10) {
                    measuredWidth = (measuredWidth2 - o21Var.B.getMeasuredWidth()) / 2;
                } else {
                    measuredWidth = o21Var.N.f7757a + ((((measuredWidth2 - o21Var.f39574x.getMeasuredWidth()) - o21Var.N.f7757a) - o21Var.B.getMeasuredWidth()) / 2);
                }
                if (z10) {
                    int i16 = o21Var.N.f7758b;
                    measuredHeight = AndroidUtilities.dp(52.0f) + (((((measuredHeight2 - i15) - i16) - o21Var.B.getMeasuredHeight()) - AndroidUtilities.dp(48.0f)) / 2) + i16;
                } else {
                    measuredHeight = (measuredHeight2 - o21Var.B.getMeasuredHeight()) / 2;
                }
                j21 j21Var = o21Var.B;
                j21Var.layout(measuredWidth, measuredHeight, j21Var.getMeasuredWidth() + measuredWidth, o21Var.B.getMeasuredHeight() + measuredHeight);
                if (z10) {
                    int measuredWidth3 = (measuredWidth2 - o21Var.f39575y.getMeasuredWidth()) / 2;
                    int dp = measuredHeight - AndroidUtilities.dp(48.0f);
                    p9 p9Var = o21Var.f39575y;
                    p9Var.layout(measuredWidth3, dp, p9Var.getMeasuredWidth() + measuredWidth3, o21Var.f39575y.getMeasuredHeight() + dp);
                }
                if (o21Var.f39574x.getVisibility() == 0) {
                    if (z10) {
                        int measuredWidth4 = (measuredWidth2 - o21Var.f39574x.getMeasuredWidth()) / 2;
                        o21Var.f39574x.layout(measuredWidth4, getMeasuredHeight() - i15, o21Var.f39574x.getMeasuredWidth() + measuredWidth4, getMeasuredHeight());
                    } else {
                        int measuredHeight3 = (measuredHeight2 - o21Var.f39574x.getMeasuredHeight()) / 2;
                        o21Var.f39574x.layout(getMeasuredWidth() - o21Var.f39574x.getMeasuredWidth(), measuredHeight3, getMeasuredWidth(), o21Var.f39574x.getMeasuredHeight() + measuredHeight3);
                    }
                }
                lj0 lj0Var = o21Var.C;
                Rect rect = o21Var.f39567c;
                lj0Var.layout(rect.left + measuredWidth, rect.top + measuredHeight, measuredWidth + rect.right, measuredHeight + rect.bottom);
                int dp2 = AndroidUtilities.dp(11.0f) + o21Var.N.f7757a;
                int dp3 = AndroidUtilities.dp(11.0f) + o21Var.N.f7758b;
                ImageView imageView = o21Var.D;
                imageView.layout(dp2, dp3, imageView.getMeasuredWidth() + dp2, o21Var.D.getMeasuredHeight() + dp3);
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
        boolean z4;
        int i18;
        float f10;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        switch (this.f22246a) {
            case 0:
                w0 w0Var = (w0) this.f22248c;
                measureChildWithMargins(w0Var.f22366s, i10, 0, i11, 0);
                View view = w0Var.f22367w;
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
                    r0Var.f22247b = true;
                    r0Var.measureChildWithMargins(w0Var.f22351f, i10, i14, i11, 0);
                    if (w0Var.f22351f.getVisibility() == 0) {
                        i15 = w0Var.f22351f.getMeasuredWidth();
                    } else {
                        i15 = 0;
                    }
                    lg.f fVar = w0Var.f22349e;
                    int i26 = i14 + i15;
                    View view2 = w0Var.f22367w;
                    if (view2 != null) {
                        i16 = view2.getMeasuredWidth();
                    } else {
                        i16 = 0;
                    }
                    measureChildWithMargins(fVar, i10, i26 + i16, i11, 0);
                    this.f22247b = false;
                    setMeasuredDimension(Math.max(w0Var.f22349e.getMeasuredWidth() + i15, size), View.MeasureSpec.getSize(i11));
                    return;
                }
                if (w0Var.h.getVisibility() == 0) {
                    measureChildWithMargins(w0Var.h, i10, View.MeasureSpec.getSize(i10) / 2, i11, 0);
                    i12 = AndroidUtilities.dp(4.0f) + w0Var.h.getMeasuredWidth();
                } else {
                    i12 = 0;
                }
                int size2 = View.MeasureSpec.getSize(i10);
                this.f22247b = true;
                measureChildWithMargins(w0Var.f22351f, i10, i12, i11, 0);
                if (w0Var.f22351f.getVisibility() == 0) {
                    i13 = w0Var.f22351f.getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                measureChildWithMargins(w0Var.f22349e, org.telegram.ui.b.d(12.0f, size2, 0), i12 + i13, i11, 0);
                this.f22247b = false;
                setMeasuredDimension(Math.max(w0Var.f22349e.getMeasuredWidth() + i13, size2), View.MeasureSpec.getSize(i11));
                return;
            case 1:
                int size3 = View.MeasureSpec.getSize(i10);
                xn xnVar = (xn) this.f22248c;
                if (xnVar.C9()) {
                    size3 -= AndroidUtilities.dp(71.0f);
                    i17 = AndroidUtilities.dp(32.0f);
                } else {
                    i17 = 0;
                }
                TextView textView2 = xnVar.I1;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = xnVar.K1) != null && textView.getVisibility() == 0) {
                    size3 = org.telegram.ui.b.x(31.0f, size3, 2);
                }
                this.f22247b = true;
                TextView textView3 = xnVar.K1;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) xnVar.K1.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = xnVar.I1;
                    if (textView4 != null && textView4.getVisibility() == 0) {
                        xnVar.K1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        layoutParams.leftMargin = i17 + size3;
                        layoutParams.width -= AndroidUtilities.dp(15.0f);
                    } else {
                        xnVar.K1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                        layoutParams.leftMargin = i17;
                    }
                }
                TextView textView5 = xnVar.I1;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) xnVar.I1.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = xnVar.K1;
                    if (textView6 != null && textView6.getVisibility() == 0) {
                        xnVar.I1.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    } else {
                        xnVar.I1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                    }
                    layoutParams2.leftMargin = i17;
                }
                this.f22247b = false;
                super.onMeasure(i10, i11);
                return;
            case 2:
                o21 o21Var = (o21) this.f22248c;
                int size4 = View.MeasureSpec.getSize(i10);
                int size5 = View.MeasureSpec.getSize(i11);
                if (size4 < size5) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                o21Var.M = z4;
                p9 p9Var = o21Var.f39575y;
                if (z4) {
                    i18 = 0;
                } else {
                    i18 = 8;
                }
                p9Var.setVisibility(i18);
                super.onMeasure(i10, i11);
                if (z4) {
                    this.f22247b = true;
                    ag.l lVar = o21Var.f39574x;
                    int i27 = o21Var.N.f7757a;
                    int dp = AndroidUtilities.dp(8.0f);
                    i0.b bVar = o21Var.N;
                    lVar.setPadding(i27, dp, bVar.f7759c, bVar.d);
                    this.f22247b = false;
                    o21Var.f39574x.measure(View.MeasureSpec.makeMeasureSpec(size4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size5 + o21Var.N.d, Integer.MIN_VALUE));
                    o21Var.B.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(330.0f), 1073741824));
                    return;
                }
                this.f22247b = true;
                ag.l lVar2 = o21Var.f39574x;
                i0.b bVar2 = o21Var.N;
                lVar2.setPadding(0, (bVar2.f7758b * 2) / 3, bVar2.f7759c, bVar2.d);
                this.f22247b = false;
                o21Var.f39574x.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(273.0f) + o21Var.N.f7759c, 1073741824), i11);
                o21Var.B.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(310.0f), 1073741824));
                return;
            default:
                int size6 = View.MeasureSpec.getSize(i10);
                int size7 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size6, size7);
                if (((ed1) this.f22248c).f36500e != null) {
                    this.f22247b = true;
                    if (!AndroidUtilities.isTablet()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((ed1) this.f22248c).f36500e.getLayoutParams();
                        layoutParams3.topMargin = AndroidUtilities.statusBarHeight;
                        ((ed1) this.f22248c).f36500e.setLayoutParams(layoutParams3);
                    }
                    if (!AndroidUtilities.isTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 2) {
                        ((ed1) this.f22248c).h.setTextSize(1, 18.0f);
                    } else {
                        ((ed1) this.f22248c).h.setTextSize(1, 20.0f);
                    }
                    this.f22247b = false;
                }
                measureChildWithMargins(((ed1) this.f22248c).f36526p0, i10, 0, i11, 0);
                int measuredHeight = ((ed1) this.f22248c).f36526p0.getMeasuredHeight();
                if (((ed1) this.f22248c).f36526p0.getVisibility() == 0) {
                    size7 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((ed1) this.f22248c).f36531r0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                ed1 ed1Var = (ed1) this.f22248c;
                int i28 = 58;
                if (ed1Var.f36489b == 2) {
                    xb1 xb1Var = ed1Var.f36531r0;
                    int dp2 = AndroidUtilities.dp(4.0f);
                    ed1 ed1Var2 = (ed1) this.f22248c;
                    if (!ed1Var2.H1 && ed1Var2.G1 > 0) {
                        i24 = 58;
                    } else {
                        i24 = 0;
                    }
                    int dp3 = AndroidUtilities.dp(i24 + 72) - 12;
                    if (((ed1) this.f22248c).U0()) {
                        i25 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i25 = 0;
                    }
                    xb1Var.setPadding(0, dp2, 0, dp3 + i25);
                }
                ((ed1) this.f22248c).f36531r0.measure(View.MeasureSpec.makeMeasureSpec(size6, 1073741824), View.MeasureSpec.makeMeasureSpec(size7 - layoutParams4.bottomMargin, 1073741824));
                ((FrameLayout.LayoutParams) ((ed1) this.f22248c).f36538u0.getLayoutParams()).topMargin = measuredHeight;
                ((ed1) this.f22248c).f36538u0.measure(View.MeasureSpec.makeMeasureSpec(size6, 1073741824), View.MeasureSpec.makeMeasureSpec(size7, 1073741824));
                eg.q1 q1Var = ((ed1) this.f22248c).N1;
                if (q1Var != null) {
                    ((FrameLayout.LayoutParams) q1Var.getLayoutParams()).topMargin = measuredHeight;
                    ((ed1) this.f22248c).N1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(222.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824));
                }
                org.telegram.ui.w4 w4Var = ((ed1) this.f22248c).f36551z0;
                if (w4Var != null) {
                    int dp4 = AndroidUtilities.dp(12.0f);
                    int dp5 = AndroidUtilities.dp(12.0f);
                    int dp6 = AndroidUtilities.dp(12.0f);
                    int dp7 = AndroidUtilities.dp(12.0f);
                    if (((ed1) this.f22248c).U0()) {
                        i22 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i22 = 0;
                    }
                    w4Var.setPadding(dp4, dp5, dp6, dp7 + i22);
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((ed1) this.f22248c).f36551z0.getLayoutParams();
                    ed1 ed1Var3 = (ed1) this.f22248c;
                    int dp8 = AndroidUtilities.dp(72 + ((ed1Var3.H1 || ed1Var3.G1 <= 0) ? 0 : 0));
                    if (((ed1) this.f22248c).U0()) {
                        i23 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i23 = 0;
                    }
                    layoutParams5.height = dp8 + i23;
                    measureChildWithMargins(((ed1) this.f22248c).f36551z0, i10, 0, i11, 0);
                }
                Drawable drawable = ((ed1) this.f22248c).f36530r;
                if (drawable != null) {
                    drawable.getPadding(AndroidUtilities.rectTmp2);
                }
                int i29 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((ed1) this.f22248c).I0;
                    if (i29 < frameLayoutArr.length) {
                        FrameLayout frameLayout = frameLayoutArr[i29];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i29 == 0) {
                                if (((ed1) this.f22248c).f36489b == 2) {
                                    i21 = 321;
                                } else {
                                    i21 = 273;
                                }
                                f10 = i21;
                            } else {
                                f10 = 316.0f;
                            }
                            layoutParams6.height = AndroidUtilities.dp(f10);
                            if (((ed1) this.f22248c).U0()) {
                                layoutParams6.height += AndroidUtilities.navigationBarHeight;
                            }
                            if (i29 == 0) {
                                layoutParams6.height = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top + layoutParams6.height;
                            }
                            FrameLayout frameLayout2 = ((ed1) this.f22248c).I0[i29];
                            if (i29 == 0) {
                                i19 = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top;
                            } else {
                                i19 = 0;
                            }
                            if (((ed1) this.f22248c).U0()) {
                                i20 = AndroidUtilities.navigationBarHeight;
                            } else {
                                i20 = 0;
                            }
                            frameLayout2.setPadding(0, i19, 0, i20);
                            measureChildWithMargins(((ed1) this.f22248c).I0[i29], i10, 0, i11, 0);
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
        switch (this.f22246a) {
            case 0:
                if (!this.f22247b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f22247b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f22247b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f22247b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f22246a) {
            case 0:
                super.setAlpha(f10);
                w0 w0Var = (w0) this.f22248c;
                l0 l0Var = w0Var.f22366s;
                if (l0Var != null && l0Var.getTag() != null) {
                    w0Var.f22366s.setAlpha(f10);
                    w0Var.f22366s.setScaleX(f10);
                    w0Var.f22366s.setScaleY(f10);
                    return;
                }
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f22246a) {
            case 0:
                super.setVisibility(i10);
                w0 w0Var = (w0) this.f22248c;
                l0 l0Var = w0Var.f22366s;
                if (l0Var != null) {
                    l0Var.setVisibility(i10);
                }
                View view = w0Var.f22367w;
                if (view != null) {
                    view.setVisibility(i10);
                }
                FrameLayout frameLayout = w0Var.f22342a;
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
