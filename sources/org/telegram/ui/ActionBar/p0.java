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
import org.telegram.messenger.ai;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.d31;
import org.telegram.ui.rc1;
import org.telegram.ui.wd1;
import org.telegram.ui.x21;
import org.telegram.ui.zn;
public final class p0 extends FrameLayout {
    public final int f21435a;
    public boolean f21436b;
    public final Object f21437c;

    public p0(Object obj, Context context, int i10) {
        super(context);
        this.f21435a = i10;
        this.f21437c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f21435a) {
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
        switch (this.f21435a) {
            case 3:
                boolean drawChild = super.drawChild(canvas, view, j3);
                wd1 wd1Var = (wd1) this.f21437c;
                if (view == wd1Var.f43376s0) {
                    b5Var = wd1Var.parentLayout;
                    if (b5Var != null) {
                        b5Var2 = wd1Var.parentLayout;
                        if (wd1Var.f43376s0.getVisibility() == 0) {
                            i10 = (int) (wd1Var.f43376s0.getTranslationY() + wd1Var.f43376s0.getMeasuredHeight());
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
        switch (this.f21435a) {
            case 0:
                u0 u0Var = (u0) this.f21437c;
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = 0;
                if (!LocaleController.isRTL && u0Var.h.getVisibility() == 0) {
                    i14 = AndroidUtilities.dp(4.0f) + u0Var.h.getMeasuredWidth();
                }
                if (u0Var.f21542f.getVisibility() == 0) {
                    i14 += u0Var.f21542f.getMeasuredWidth();
                }
                ci.g2 g2Var = u0Var.f21540e;
                g2Var.layout(i14, g2Var.getTop(), u0Var.f21540e.getMeasuredWidth() + i14, u0Var.f21540e.getBottom());
                return;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 2:
                d31 d31Var = (d31) this.f21437c;
                int measuredWidth2 = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                int i15 = 0;
                if (measuredWidth2 < measuredHeight2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (d31Var.f36891x.getVisibility() == 0) {
                    if (z11) {
                        AndroidUtilities.rectTmp2.set(0, 0, measuredWidth2, AndroidUtilities.dp(25.0f) + (measuredHeight2 - d31Var.f36891x.getMeasuredHeight()));
                    } else {
                        AndroidUtilities.rectTmp2.set(0, 0, AndroidUtilities.dp(25.0f) + (measuredWidth2 - d31Var.f36891x.getWidth()), measuredHeight2);
                    }
                    d31Var.f36890w.setClipBounds(AndroidUtilities.rectTmp2);
                } else {
                    d31Var.f36890w.setClipBounds(null);
                }
                d31Var.f36890w.layout(0, 0, measuredWidth2, measuredHeight2);
                if (d31Var.f36891x.getVisibility() == 0) {
                    i15 = d31Var.f36891x.getMeasuredHeight();
                }
                if (z11) {
                    measuredWidth = (measuredWidth2 - d31Var.E.getMeasuredWidth()) / 2;
                } else {
                    measuredWidth = d31Var.Q.f11575a + ((((measuredWidth2 - d31Var.f36891x.getMeasuredWidth()) - d31Var.Q.f11575a) - d31Var.E.getMeasuredWidth()) / 2);
                }
                if (z11) {
                    int i16 = d31Var.Q.f11576b;
                    measuredHeight = AndroidUtilities.dp(52.0f) + (((((measuredHeight2 - i15) - i16) - d31Var.E.getMeasuredHeight()) - AndroidUtilities.dp(48.0f)) / 2) + i16;
                } else {
                    measuredHeight = (measuredHeight2 - d31Var.E.getMeasuredHeight()) / 2;
                }
                x21 x21Var = d31Var.E;
                x21Var.layout(measuredWidth, measuredHeight, x21Var.getMeasuredWidth() + measuredWidth, d31Var.E.getMeasuredHeight() + measuredHeight);
                if (z11) {
                    int measuredWidth3 = (measuredWidth2 - d31Var.f36892y.getMeasuredWidth()) / 2;
                    int dp = measuredHeight - AndroidUtilities.dp(48.0f);
                    y9 y9Var = d31Var.f36892y;
                    y9Var.layout(measuredWidth3, dp, y9Var.getMeasuredWidth() + measuredWidth3, d31Var.f36892y.getMeasuredHeight() + dp);
                }
                if (d31Var.f36891x.getVisibility() == 0) {
                    if (z11) {
                        int measuredWidth4 = (measuredWidth2 - d31Var.f36891x.getMeasuredWidth()) / 2;
                        d31Var.f36891x.layout(measuredWidth4, getMeasuredHeight() - i15, d31Var.f36891x.getMeasuredWidth() + measuredWidth4, getMeasuredHeight());
                    } else {
                        int measuredHeight3 = (measuredHeight2 - d31Var.f36891x.getMeasuredHeight()) / 2;
                        d31Var.f36891x.layout(getMeasuredWidth() - d31Var.f36891x.getMeasuredWidth(), measuredHeight3, getMeasuredWidth(), d31Var.f36891x.getMeasuredHeight() + measuredHeight3);
                    }
                }
                hk0 hk0Var = d31Var.F;
                Rect rect = d31Var.f36884c;
                hk0Var.layout(rect.left + measuredWidth, rect.top + measuredHeight, measuredWidth + rect.right, measuredHeight + rect.bottom);
                int dp2 = AndroidUtilities.dp(11.0f) + d31Var.Q.f11575a;
                int dp3 = AndroidUtilities.dp(11.0f) + d31Var.Q.f11576b;
                ImageView imageView = d31Var.G;
                imageView.layout(dp2, dp3, imageView.getMeasuredWidth() + dp2, d31Var.G.getMeasuredHeight() + dp3);
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
        switch (this.f21435a) {
            case 0:
                u0 u0Var = (u0) this.f21437c;
                measureChildWithMargins(u0Var.f21557s, i10, 0, i11, 0);
                View view = u0Var.f21561w;
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
                    this.f21436b = true;
                    measureChildWithMargins(u0Var.f21542f, i10, i14, i11, 0);
                    if (u0Var.f21542f.getVisibility() == 0) {
                        i15 = u0Var.f21542f.getMeasuredWidth();
                    } else {
                        i15 = 0;
                    }
                    ci.g2 g2Var = u0Var.f21540e;
                    int i26 = i14 + i15;
                    View view2 = u0Var.f21561w;
                    if (view2 != null) {
                        i16 = view2.getMeasuredWidth();
                    } else {
                        i16 = 0;
                    }
                    measureChildWithMargins(g2Var, i10, i26 + i16, i11, 0);
                    this.f21436b = false;
                    setMeasuredDimension(Math.max(u0Var.f21540e.getMeasuredWidth() + i15, size), View.MeasureSpec.getSize(i11));
                    return;
                }
                if (u0Var.h.getVisibility() == 0) {
                    measureChildWithMargins(u0Var.h, i10, View.MeasureSpec.getSize(i10) / 2, i11, 0);
                    i12 = AndroidUtilities.dp(4.0f) + u0Var.h.getMeasuredWidth();
                } else {
                    i12 = 0;
                }
                int size2 = View.MeasureSpec.getSize(i10);
                this.f21436b = true;
                measureChildWithMargins(u0Var.f21542f, i10, i12, i11, 0);
                if (u0Var.f21542f.getVisibility() == 0) {
                    i13 = u0Var.f21542f.getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                measureChildWithMargins(u0Var.f21540e, ai.c(12.0f, size2, 0), i12 + i13, i11, 0);
                this.f21436b = false;
                setMeasuredDimension(Math.max(u0Var.f21540e.getMeasuredWidth() + i13, size2), View.MeasureSpec.getSize(i11));
                return;
            case 1:
                int size3 = View.MeasureSpec.getSize(i10);
                zn znVar = (zn) this.f21437c;
                if (znVar.H9()) {
                    size3 -= AndroidUtilities.dp(71.0f);
                    i17 = AndroidUtilities.dp(32.0f);
                } else {
                    i17 = 0;
                }
                TextView textView2 = znVar.L1;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = znVar.N1) != null && textView.getVisibility() == 0) {
                    size3 = ai.A(31.0f, size3, 2);
                }
                this.f21436b = true;
                TextView textView3 = znVar.N1;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) znVar.N1.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = znVar.L1;
                    if (textView4 != null && textView4.getVisibility() == 0) {
                        znVar.N1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        layoutParams.leftMargin = i17 + size3;
                        layoutParams.width -= AndroidUtilities.dp(15.0f);
                    } else {
                        znVar.N1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                        layoutParams.leftMargin = i17;
                    }
                }
                TextView textView5 = znVar.L1;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) znVar.L1.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = znVar.N1;
                    if (textView6 != null && textView6.getVisibility() == 0) {
                        znVar.L1.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    } else {
                        znVar.L1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                    }
                    layoutParams2.leftMargin = i17;
                }
                this.f21436b = false;
                super.onMeasure(i10, i11);
                return;
            case 2:
                d31 d31Var = (d31) this.f21437c;
                int size4 = View.MeasureSpec.getSize(i10);
                int size5 = View.MeasureSpec.getSize(i11);
                if (size4 < size5) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                d31Var.P = z10;
                y9 y9Var = d31Var.f36892y;
                if (z10) {
                    i18 = 0;
                } else {
                    i18 = 8;
                }
                y9Var.setVisibility(i18);
                super.onMeasure(i10, i11);
                if (z10) {
                    this.f21436b = true;
                    m6 m6Var = d31Var.f36891x;
                    int i27 = d31Var.Q.f11575a;
                    int dp = AndroidUtilities.dp(8.0f);
                    i0.b bVar = d31Var.Q;
                    m6Var.setPadding(i27, dp, bVar.f11577c, bVar.d);
                    this.f21436b = false;
                    d31Var.f36891x.measure(View.MeasureSpec.makeMeasureSpec(size4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size5 + d31Var.Q.d, Integer.MIN_VALUE));
                    d31Var.E.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(330.0f), 1073741824));
                    return;
                }
                this.f21436b = true;
                m6 m6Var2 = d31Var.f36891x;
                i0.b bVar2 = d31Var.Q;
                m6Var2.setPadding(0, (bVar2.f11576b * 2) / 3, bVar2.f11577c, bVar2.d);
                this.f21436b = false;
                d31Var.f36891x.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(273.0f) + d31Var.Q.f11577c, 1073741824), i11);
                d31Var.E.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(310.0f), 1073741824));
                return;
            default:
                int size6 = View.MeasureSpec.getSize(i10);
                int size7 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size6, size7);
                if (((wd1) this.f21437c).f43339e != null) {
                    this.f21436b = true;
                    if (!AndroidUtilities.isTablet()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((wd1) this.f21437c).f43339e.getLayoutParams();
                        layoutParams3.topMargin = AndroidUtilities.statusBarHeight;
                        ((wd1) this.f21437c).f43339e.setLayoutParams(layoutParams3);
                    }
                    if (!AndroidUtilities.isTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 2) {
                        ((wd1) this.f21437c).h.setTextSize(1, 18.0f);
                    } else {
                        ((wd1) this.f21437c).h.setTextSize(1, 20.0f);
                    }
                    this.f21436b = false;
                }
                measureChildWithMargins(((wd1) this.f21437c).f43376s0, i10, 0, i11, 0);
                int measuredHeight = ((wd1) this.f21437c).f43376s0.getMeasuredHeight();
                if (((wd1) this.f21437c).f43376s0.getVisibility() == 0) {
                    size7 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((wd1) this.f21437c).f43380u0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                wd1 wd1Var = (wd1) this.f21437c;
                int i28 = 58;
                if (wd1Var.f43328b == 2) {
                    rc1 rc1Var = wd1Var.f43380u0;
                    int dp2 = AndroidUtilities.dp(4.0f);
                    wd1 wd1Var2 = (wd1) this.f21437c;
                    if (!wd1Var2.K1 && wd1Var2.J1 > 0) {
                        i24 = 58;
                    } else {
                        i24 = 0;
                    }
                    int dp3 = AndroidUtilities.dp(i24 + 72) - 12;
                    if (((wd1) this.f21437c).U0()) {
                        i25 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i25 = 0;
                    }
                    rc1Var.setPadding(0, dp2, 0, dp3 + i25);
                }
                ((wd1) this.f21437c).f43380u0.measure(View.MeasureSpec.makeMeasureSpec(size6, 1073741824), View.MeasureSpec.makeMeasureSpec(size7 - layoutParams4.bottomMargin, 1073741824));
                ((FrameLayout.LayoutParams) ((wd1) this.f21437c).f43388x0.getLayoutParams()).topMargin = measuredHeight;
                ((wd1) this.f21437c).f43388x0.measure(View.MeasureSpec.makeMeasureSpec(size6, 1073741824), View.MeasureSpec.makeMeasureSpec(size7, 1073741824));
                org.telegram.ui.s5 s5Var = ((wd1) this.f21437c).Q1;
                if (s5Var != null) {
                    ((FrameLayout.LayoutParams) s5Var.getLayoutParams()).topMargin = measuredHeight;
                    ((wd1) this.f21437c).Q1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(222.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824));
                }
                org.telegram.ui.t4 t4Var = ((wd1) this.f21437c).C0;
                if (t4Var != null) {
                    int dp4 = AndroidUtilities.dp(12.0f);
                    int dp5 = AndroidUtilities.dp(12.0f);
                    int dp6 = AndroidUtilities.dp(12.0f);
                    int dp7 = AndroidUtilities.dp(12.0f);
                    if (((wd1) this.f21437c).U0()) {
                        i22 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i22 = 0;
                    }
                    t4Var.setPadding(dp4, dp5, dp6, dp7 + i22);
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((wd1) this.f21437c).C0.getLayoutParams();
                    wd1 wd1Var3 = (wd1) this.f21437c;
                    if (wd1Var3.K1 || wd1Var3.J1 <= 0) {
                        i28 = 0;
                    }
                    int dp8 = AndroidUtilities.dp(72 + i28);
                    if (((wd1) this.f21437c).U0()) {
                        i23 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i23 = 0;
                    }
                    layoutParams5.height = dp8 + i23;
                    measureChildWithMargins(((wd1) this.f21437c).C0, i10, 0, i11, 0);
                }
                Drawable drawable = ((wd1) this.f21437c).f43372r;
                if (drawable != null) {
                    drawable.getPadding(AndroidUtilities.rectTmp2);
                }
                int i29 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((wd1) this.f21437c).L0;
                    if (i29 < frameLayoutArr.length) {
                        FrameLayout frameLayout = frameLayoutArr[i29];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i29 == 0) {
                                if (((wd1) this.f21437c).f43328b == 2) {
                                    i21 = 321;
                                } else {
                                    i21 = 273;
                                }
                                f7 = i21;
                            } else {
                                f7 = 316.0f;
                            }
                            layoutParams6.height = AndroidUtilities.dp(f7);
                            if (((wd1) this.f21437c).U0()) {
                                layoutParams6.height += AndroidUtilities.navigationBarHeight;
                            }
                            if (i29 == 0) {
                                layoutParams6.height = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top + layoutParams6.height;
                            }
                            FrameLayout frameLayout2 = ((wd1) this.f21437c).L0[i29];
                            if (i29 == 0) {
                                i19 = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top;
                            } else {
                                i19 = 0;
                            }
                            if (((wd1) this.f21437c).U0()) {
                                i20 = AndroidUtilities.navigationBarHeight;
                            } else {
                                i20 = 0;
                            }
                            frameLayout2.setPadding(0, i19, 0, i20);
                            measureChildWithMargins(((wd1) this.f21437c).L0[i29], i10, 0, i11, 0);
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
        switch (this.f21435a) {
            case 0:
                if (!this.f21436b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f21436b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f21436b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f21436b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f21435a) {
            case 0:
                super.setAlpha(f7);
                u0 u0Var = (u0) this.f21437c;
                j0 j0Var = u0Var.f21557s;
                if (j0Var != null && j0Var.getTag() != null) {
                    u0Var.f21557s.setAlpha(f7);
                    u0Var.f21557s.setScaleX(f7);
                    u0Var.f21557s.setScaleY(f7);
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
        switch (this.f21435a) {
            case 0:
                super.setVisibility(i10);
                u0 u0Var = (u0) this.f21437c;
                j0 j0Var = u0Var.f21557s;
                if (j0Var != null) {
                    j0Var.setVisibility(i10);
                }
                View view = u0Var.f21561w;
                if (view != null) {
                    view.setVisibility(i10);
                }
                FrameLayout frameLayout = u0Var.f21533a;
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
