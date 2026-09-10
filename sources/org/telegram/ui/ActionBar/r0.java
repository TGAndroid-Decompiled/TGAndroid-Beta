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
import bi.n7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.em;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.ae1;
import org.telegram.ui.e31;
import org.telegram.ui.eo;
import org.telegram.ui.k31;
import org.telegram.ui.vc1;
public final class r0 extends FrameLayout {
    public final int f18589a;
    public boolean f18590b;
    public final Object f18591c;

    public r0(Object obj, Context context, int i10) {
        super(context);
        this.f18589a = i10;
        this.f18591c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f18589a) {
            case 2:
                super.dispatchTouchEvent(motionEvent);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        f5 f5Var;
        f5 f5Var2;
        int i10;
        switch (this.f18589a) {
            case 3:
                boolean drawChild = super.drawChild(canvas, view, j3);
                ae1 ae1Var = (ae1) this.f18591c;
                if (view == ae1Var.f30964s0) {
                    f5Var = ae1Var.parentLayout;
                    if (f5Var != null) {
                        f5Var2 = ae1Var.parentLayout;
                        if (ae1Var.f30964s0.getVisibility() == 0) {
                            i10 = (int) (ae1Var.f30964s0.getTranslationY() + ae1Var.f30964s0.getMeasuredHeight());
                        } else {
                            i10 = 0;
                        }
                        ((ActionBarLayout) f5Var2).q(canvas, i10);
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
        switch (this.f18589a) {
            case 0:
                w0 w0Var = (w0) this.f18591c;
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = 0;
                if (!LocaleController.isRTL && w0Var.h.getVisibility() == 0) {
                    i14 = AndroidUtilities.dp(4.0f) + w0Var.h.getMeasuredWidth();
                }
                if (w0Var.f18692f.getVisibility() == 0) {
                    i14 += w0Var.f18692f.getMeasuredWidth();
                }
                bi.t2 t2Var = w0Var.e;
                t2Var.layout(i14, t2Var.getTop(), w0Var.e.getMeasuredWidth() + i14, w0Var.e.getBottom());
                return;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 2:
                k31 k31Var = (k31) this.f18591c;
                int measuredWidth2 = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                int i15 = 0;
                if (measuredWidth2 < measuredHeight2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (k31Var.f34217x.getVisibility() == 0) {
                    if (z11) {
                        AndroidUtilities.rectTmp2.set(0, 0, measuredWidth2, AndroidUtilities.dp(25.0f) + (measuredHeight2 - k31Var.f34217x.getMeasuredHeight()));
                    } else {
                        AndroidUtilities.rectTmp2.set(0, 0, AndroidUtilities.dp(25.0f) + (measuredWidth2 - k31Var.f34217x.getWidth()), measuredHeight2);
                    }
                    k31Var.f34216w.setClipBounds(AndroidUtilities.rectTmp2);
                } else {
                    k31Var.f34216w.setClipBounds(null);
                }
                k31Var.f34216w.layout(0, 0, measuredWidth2, measuredHeight2);
                if (k31Var.f34217x.getVisibility() == 0) {
                    i15 = k31Var.f34217x.getMeasuredHeight();
                }
                if (z11) {
                    measuredWidth = (measuredWidth2 - k31Var.E.getMeasuredWidth()) / 2;
                } else {
                    measuredWidth = k31Var.Q.f10074a + ((((measuredWidth2 - k31Var.f34217x.getMeasuredWidth()) - k31Var.Q.f10074a) - k31Var.E.getMeasuredWidth()) / 2);
                }
                if (z11) {
                    int i16 = k31Var.Q.f10075b;
                    measuredHeight = AndroidUtilities.dp(52.0f) + (((((measuredHeight2 - i15) - i16) - k31Var.E.getMeasuredHeight()) - AndroidUtilities.dp(48.0f)) / 2) + i16;
                } else {
                    measuredHeight = (measuredHeight2 - k31Var.E.getMeasuredHeight()) / 2;
                }
                e31 e31Var = k31Var.E;
                e31Var.layout(measuredWidth, measuredHeight, e31Var.getMeasuredWidth() + measuredWidth, k31Var.E.getMeasuredHeight() + measuredHeight);
                if (z11) {
                    int measuredWidth3 = (measuredWidth2 - k31Var.f34218y.getMeasuredWidth()) / 2;
                    int dp = measuredHeight - AndroidUtilities.dp(48.0f);
                    w9 w9Var = k31Var.f34218y;
                    w9Var.layout(measuredWidth3, dp, w9Var.getMeasuredWidth() + measuredWidth3, k31Var.f34218y.getMeasuredHeight() + dp);
                }
                if (k31Var.f34217x.getVisibility() == 0) {
                    if (z11) {
                        int measuredWidth4 = (measuredWidth2 - k31Var.f34217x.getMeasuredWidth()) / 2;
                        k31Var.f34217x.layout(measuredWidth4, getMeasuredHeight() - i15, k31Var.f34217x.getMeasuredWidth() + measuredWidth4, getMeasuredHeight());
                    } else {
                        int measuredHeight3 = (measuredHeight2 - k31Var.f34217x.getMeasuredHeight()) / 2;
                        k31Var.f34217x.layout(getMeasuredWidth() - k31Var.f34217x.getMeasuredWidth(), measuredHeight3, getMeasuredWidth(), k31Var.f34217x.getMeasuredHeight() + measuredHeight3);
                    }
                }
                kj0 kj0Var = k31Var.F;
                Rect rect = k31Var.f34211c;
                kj0Var.layout(rect.left + measuredWidth, rect.top + measuredHeight, measuredWidth + rect.right, measuredHeight + rect.bottom);
                int dp2 = AndroidUtilities.dp(11.0f) + k31Var.Q.f10074a;
                int dp3 = AndroidUtilities.dp(11.0f) + k31Var.Q.f10075b;
                ImageView imageView = k31Var.G;
                imageView.layout(dp2, dp3, imageView.getMeasuredWidth() + dp2, k31Var.G.getMeasuredHeight() + dp3);
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
        float f7;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        switch (this.f18589a) {
            case 0:
                w0 w0Var = (w0) this.f18591c;
                measureChildWithMargins(w0Var.f18707s, i10, 0, i11, 0);
                View view = w0Var.f18711w;
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
                    r0Var.f18590b = true;
                    r0Var.measureChildWithMargins(w0Var.f18692f, i10, i14, i11, 0);
                    if (w0Var.f18692f.getVisibility() == 0) {
                        i15 = w0Var.f18692f.getMeasuredWidth();
                    } else {
                        i15 = 0;
                    }
                    bi.t2 t2Var = w0Var.e;
                    int i26 = i14 + i15;
                    View view2 = w0Var.f18711w;
                    if (view2 != null) {
                        i16 = view2.getMeasuredWidth();
                    } else {
                        i16 = 0;
                    }
                    measureChildWithMargins(t2Var, i10, i26 + i16, i11, 0);
                    this.f18590b = false;
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
                this.f18590b = true;
                measureChildWithMargins(w0Var.f18692f, i10, i12, i11, 0);
                if (w0Var.f18692f.getVisibility() == 0) {
                    i13 = w0Var.f18692f.getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                measureChildWithMargins(w0Var.e, em.d(12.0f, size2, 0), i12 + i13, i11, 0);
                this.f18590b = false;
                setMeasuredDimension(Math.max(w0Var.e.getMeasuredWidth() + i13, size2), View.MeasureSpec.getSize(i11));
                return;
            case 1:
                int size3 = View.MeasureSpec.getSize(i10);
                eo eoVar = (eo) this.f18591c;
                if (eoVar.C9()) {
                    size3 -= AndroidUtilities.dp(71.0f);
                    i17 = AndroidUtilities.dp(32.0f);
                } else {
                    i17 = 0;
                }
                TextView textView2 = eoVar.L1;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = eoVar.N1) != null && textView.getVisibility() == 0) {
                    size3 = em.y(31.0f, size3, 2);
                }
                this.f18590b = true;
                TextView textView3 = eoVar.N1;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) eoVar.N1.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = eoVar.L1;
                    if (textView4 != null && textView4.getVisibility() == 0) {
                        eoVar.N1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        layoutParams.leftMargin = i17 + size3;
                        layoutParams.width -= AndroidUtilities.dp(15.0f);
                    } else {
                        eoVar.N1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                        layoutParams.leftMargin = i17;
                    }
                }
                TextView textView5 = eoVar.L1;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) eoVar.L1.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = eoVar.N1;
                    if (textView6 != null && textView6.getVisibility() == 0) {
                        eoVar.L1.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    } else {
                        eoVar.L1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                    }
                    layoutParams2.leftMargin = i17;
                }
                this.f18590b = false;
                super.onMeasure(i10, i11);
                return;
            case 2:
                k31 k31Var = (k31) this.f18591c;
                int size4 = View.MeasureSpec.getSize(i10);
                int size5 = View.MeasureSpec.getSize(i11);
                if (size4 < size5) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                k31Var.P = z10;
                w9 w9Var = k31Var.f34218y;
                if (z10) {
                    i18 = 0;
                } else {
                    i18 = 8;
                }
                w9Var.setVisibility(i18);
                super.onMeasure(i10, i11);
                if (z10) {
                    this.f18590b = true;
                    n7 n7Var = k31Var.f34217x;
                    int i27 = k31Var.Q.f10074a;
                    int dp = AndroidUtilities.dp(8.0f);
                    i0.c cVar = k31Var.Q;
                    n7Var.setPadding(i27, dp, cVar.f10076c, cVar.d);
                    this.f18590b = false;
                    k31Var.f34217x.measure(View.MeasureSpec.makeMeasureSpec(size4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size5 + k31Var.Q.d, Integer.MIN_VALUE));
                    k31Var.E.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(330.0f), 1073741824));
                    return;
                }
                this.f18590b = true;
                n7 n7Var2 = k31Var.f34217x;
                i0.c cVar2 = k31Var.Q;
                n7Var2.setPadding(0, (cVar2.f10075b * 2) / 3, cVar2.f10076c, cVar2.d);
                this.f18590b = false;
                k31Var.f34217x.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(273.0f) + k31Var.Q.f10076c, 1073741824), i11);
                k31Var.E.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(310.0f), 1073741824));
                return;
            default:
                int size6 = View.MeasureSpec.getSize(i10);
                int size7 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size6, size7);
                if (((ae1) this.f18591c).e != null) {
                    this.f18590b = true;
                    if (!AndroidUtilities.isTablet()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((ae1) this.f18591c).e.getLayoutParams();
                        layoutParams3.topMargin = AndroidUtilities.statusBarHeight;
                        ((ae1) this.f18591c).e.setLayoutParams(layoutParams3);
                    }
                    if (!AndroidUtilities.isTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 2) {
                        ((ae1) this.f18591c).h.setTextSize(1, 18.0f);
                    } else {
                        ((ae1) this.f18591c).h.setTextSize(1, 20.0f);
                    }
                    this.f18590b = false;
                }
                measureChildWithMargins(((ae1) this.f18591c).f30964s0, i10, 0, i11, 0);
                int measuredHeight = ((ae1) this.f18591c).f30964s0.getMeasuredHeight();
                if (((ae1) this.f18591c).f30964s0.getVisibility() == 0) {
                    size7 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((ae1) this.f18591c).f30968u0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                ae1 ae1Var = (ae1) this.f18591c;
                int i28 = 58;
                if (ae1Var.f30917b == 2) {
                    vc1 vc1Var = ae1Var.f30968u0;
                    int dp2 = AndroidUtilities.dp(4.0f);
                    ae1 ae1Var2 = (ae1) this.f18591c;
                    if (!ae1Var2.K1 && ae1Var2.J1 > 0) {
                        i24 = 58;
                    } else {
                        i24 = 0;
                    }
                    int dp3 = AndroidUtilities.dp(i24 + 72) - 12;
                    if (((ae1) this.f18591c).U0()) {
                        i25 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i25 = 0;
                    }
                    vc1Var.setPadding(0, dp2, 0, dp3 + i25);
                }
                ((ae1) this.f18591c).f30968u0.measure(View.MeasureSpec.makeMeasureSpec(size6, 1073741824), View.MeasureSpec.makeMeasureSpec(size7 - layoutParams4.bottomMargin, 1073741824));
                ((FrameLayout.LayoutParams) ((ae1) this.f18591c).f30976x0.getLayoutParams()).topMargin = measuredHeight;
                ((ae1) this.f18591c).f30976x0.measure(View.MeasureSpec.makeMeasureSpec(size6, 1073741824), View.MeasureSpec.makeMeasureSpec(size7, 1073741824));
                org.telegram.ui.u5 u5Var = ((ae1) this.f18591c).Q1;
                if (u5Var != null) {
                    ((FrameLayout.LayoutParams) u5Var.getLayoutParams()).topMargin = measuredHeight;
                    ((ae1) this.f18591c).Q1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(222.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824));
                }
                org.telegram.ui.u4 u4Var = ((ae1) this.f18591c).C0;
                if (u4Var != null) {
                    int dp4 = AndroidUtilities.dp(12.0f);
                    int dp5 = AndroidUtilities.dp(12.0f);
                    int dp6 = AndroidUtilities.dp(12.0f);
                    int dp7 = AndroidUtilities.dp(12.0f);
                    if (((ae1) this.f18591c).U0()) {
                        i22 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i22 = 0;
                    }
                    u4Var.setPadding(dp4, dp5, dp6, dp7 + i22);
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((ae1) this.f18591c).C0.getLayoutParams();
                    ae1 ae1Var3 = (ae1) this.f18591c;
                    int dp8 = AndroidUtilities.dp(72 + ((ae1Var3.K1 || ae1Var3.J1 <= 0) ? 0 : 0));
                    if (((ae1) this.f18591c).U0()) {
                        i23 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i23 = 0;
                    }
                    layoutParams5.height = dp8 + i23;
                    measureChildWithMargins(((ae1) this.f18591c).C0, i10, 0, i11, 0);
                }
                Drawable drawable = ((ae1) this.f18591c).f30960r;
                if (drawable != null) {
                    drawable.getPadding(AndroidUtilities.rectTmp2);
                }
                int i29 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((ae1) this.f18591c).L0;
                    if (i29 < frameLayoutArr.length) {
                        FrameLayout frameLayout = frameLayoutArr[i29];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i29 == 0) {
                                if (((ae1) this.f18591c).f30917b == 2) {
                                    i21 = 321;
                                } else {
                                    i21 = 273;
                                }
                                f7 = i21;
                            } else {
                                f7 = 316.0f;
                            }
                            layoutParams6.height = AndroidUtilities.dp(f7);
                            if (((ae1) this.f18591c).U0()) {
                                layoutParams6.height += AndroidUtilities.navigationBarHeight;
                            }
                            if (i29 == 0) {
                                layoutParams6.height = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top + layoutParams6.height;
                            }
                            FrameLayout frameLayout2 = ((ae1) this.f18591c).L0[i29];
                            if (i29 == 0) {
                                i19 = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top;
                            } else {
                                i19 = 0;
                            }
                            if (((ae1) this.f18591c).U0()) {
                                i20 = AndroidUtilities.navigationBarHeight;
                            } else {
                                i20 = 0;
                            }
                            frameLayout2.setPadding(0, i19, 0, i20);
                            measureChildWithMargins(((ae1) this.f18591c).L0[i29], i10, 0, i11, 0);
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
        switch (this.f18589a) {
            case 0:
                if (!this.f18590b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f18590b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f18590b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f18590b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f18589a) {
            case 0:
                super.setAlpha(f7);
                w0 w0Var = (w0) this.f18591c;
                l0 l0Var = w0Var.f18707s;
                if (l0Var != null && l0Var.getTag() != null) {
                    w0Var.f18707s.setAlpha(f7);
                    w0Var.f18707s.setScaleX(f7);
                    w0Var.f18707s.setScaleY(f7);
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
        switch (this.f18589a) {
            case 0:
                super.setVisibility(i10);
                w0 w0Var = (w0) this.f18591c;
                l0 l0Var = w0Var.f18707s;
                if (l0Var != null) {
                    l0Var.setVisibility(i10);
                }
                View view = w0Var.f18711w;
                if (view != null) {
                    view.setVisibility(i10);
                }
                FrameLayout frameLayout = w0Var.f18684a;
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
