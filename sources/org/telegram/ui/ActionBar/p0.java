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
import org.telegram.messenger.sk;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.z9;
import org.telegram.ui.ce1;
import org.telegram.ui.fo;
import org.telegram.ui.g31;
import org.telegram.ui.l31;
import org.telegram.ui.xc1;
public final class p0 extends FrameLayout {
    public final int f20281a;
    public boolean f20282b;
    public final Object f20283c;

    public p0(Object obj, Context context, int i10) {
        super(context);
        this.f20281a = i10;
        this.f20283c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f20281a) {
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
        switch (this.f20281a) {
            case 3:
                boolean drawChild = super.drawChild(canvas, view, j10);
                ce1 ce1Var = (ce1) this.f20283c;
                if (view == ce1Var.f34627s0) {
                    b5Var = ce1Var.parentLayout;
                    if (b5Var != null) {
                        b5Var2 = ce1Var.parentLayout;
                        if (ce1Var.f34627s0.getVisibility() == 0) {
                            i10 = (int) (ce1Var.f34627s0.getTranslationY() + ce1Var.f34627s0.getMeasuredHeight());
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
        switch (this.f20281a) {
            case 0:
                u0 u0Var = (u0) this.f20283c;
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = 0;
                if (!LocaleController.isRTL && u0Var.h.getVisibility() == 0) {
                    i14 = AndroidUtilities.dp(4.0f) + u0Var.h.getMeasuredWidth();
                }
                if (u0Var.f20381f.getVisibility() == 0) {
                    i14 += u0Var.f20381f.getMeasuredWidth();
                }
                di.g2 g2Var = u0Var.e;
                g2Var.layout(i14, g2Var.getTop(), u0Var.e.getMeasuredWidth() + i14, u0Var.e.getBottom());
                return;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 2:
                l31 l31Var = (l31) this.f20283c;
                int measuredWidth2 = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                int i15 = 0;
                if (measuredWidth2 < measuredHeight2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (l31Var.f37600x.getVisibility() == 0) {
                    if (z11) {
                        AndroidUtilities.rectTmp2.set(0, 0, measuredWidth2, AndroidUtilities.dp(25.0f) + (measuredHeight2 - l31Var.f37600x.getMeasuredHeight()));
                    } else {
                        AndroidUtilities.rectTmp2.set(0, 0, AndroidUtilities.dp(25.0f) + (measuredWidth2 - l31Var.f37600x.getWidth()), measuredHeight2);
                    }
                    l31Var.f37599w.setClipBounds(AndroidUtilities.rectTmp2);
                } else {
                    l31Var.f37599w.setClipBounds(null);
                }
                l31Var.f37599w.layout(0, 0, measuredWidth2, measuredHeight2);
                if (l31Var.f37600x.getVisibility() == 0) {
                    i15 = l31Var.f37600x.getMeasuredHeight();
                }
                if (z11) {
                    measuredWidth = (measuredWidth2 - l31Var.E.getMeasuredWidth()) / 2;
                } else {
                    measuredWidth = l31Var.Q.f10892a + ((((measuredWidth2 - l31Var.f37600x.getMeasuredWidth()) - l31Var.Q.f10892a) - l31Var.E.getMeasuredWidth()) / 2);
                }
                if (z11) {
                    int i16 = l31Var.Q.f10893b;
                    measuredHeight = AndroidUtilities.dp(52.0f) + (((((measuredHeight2 - i15) - i16) - l31Var.E.getMeasuredHeight()) - AndroidUtilities.dp(48.0f)) / 2) + i16;
                } else {
                    measuredHeight = (measuredHeight2 - l31Var.E.getMeasuredHeight()) / 2;
                }
                g31 g31Var = l31Var.E;
                g31Var.layout(measuredWidth, measuredHeight, g31Var.getMeasuredWidth() + measuredWidth, l31Var.E.getMeasuredHeight() + measuredHeight);
                if (z11) {
                    int measuredWidth3 = (measuredWidth2 - l31Var.f37601y.getMeasuredWidth()) / 2;
                    int dp = measuredHeight - AndroidUtilities.dp(48.0f);
                    z9 z9Var = l31Var.f37601y;
                    z9Var.layout(measuredWidth3, dp, z9Var.getMeasuredWidth() + measuredWidth3, l31Var.f37601y.getMeasuredHeight() + dp);
                }
                if (l31Var.f37600x.getVisibility() == 0) {
                    if (z11) {
                        int measuredWidth4 = (measuredWidth2 - l31Var.f37600x.getMeasuredWidth()) / 2;
                        l31Var.f37600x.layout(measuredWidth4, getMeasuredHeight() - i15, l31Var.f37600x.getMeasuredWidth() + measuredWidth4, getMeasuredHeight());
                    } else {
                        int measuredHeight3 = (measuredHeight2 - l31Var.f37600x.getMeasuredHeight()) / 2;
                        l31Var.f37600x.layout(getMeasuredWidth() - l31Var.f37600x.getMeasuredWidth(), measuredHeight3, getMeasuredWidth(), l31Var.f37600x.getMeasuredHeight() + measuredHeight3);
                    }
                }
                bk0 bk0Var = l31Var.F;
                Rect rect = l31Var.f37594c;
                bk0Var.layout(rect.left + measuredWidth, rect.top + measuredHeight, measuredWidth + rect.right, measuredHeight + rect.bottom);
                int dp2 = AndroidUtilities.dp(11.0f) + l31Var.Q.f10892a;
                int dp3 = AndroidUtilities.dp(11.0f) + l31Var.Q.f10893b;
                ImageView imageView = l31Var.G;
                imageView.layout(dp2, dp3, imageView.getMeasuredWidth() + dp2, l31Var.G.getMeasuredHeight() + dp3);
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
        switch (this.f20281a) {
            case 0:
                u0 u0Var = (u0) this.f20283c;
                measureChildWithMargins(u0Var.f20396s, i10, 0, i11, 0);
                View view = u0Var.f20400w;
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
                    this.f20282b = true;
                    measureChildWithMargins(u0Var.f20381f, i10, i14, i11, 0);
                    if (u0Var.f20381f.getVisibility() == 0) {
                        i15 = u0Var.f20381f.getMeasuredWidth();
                    } else {
                        i15 = 0;
                    }
                    di.g2 g2Var = u0Var.e;
                    int i26 = i14 + i15;
                    View view2 = u0Var.f20400w;
                    if (view2 != null) {
                        i16 = view2.getMeasuredWidth();
                    } else {
                        i16 = 0;
                    }
                    measureChildWithMargins(g2Var, i10, i26 + i16, i11, 0);
                    this.f20282b = false;
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
                this.f20282b = true;
                measureChildWithMargins(u0Var.f20381f, i10, i12, i11, 0);
                if (u0Var.f20381f.getVisibility() == 0) {
                    i13 = u0Var.f20381f.getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                measureChildWithMargins(u0Var.e, sk.c(12.0f, size2, 0), i12 + i13, i11, 0);
                this.f20282b = false;
                setMeasuredDimension(Math.max(u0Var.e.getMeasuredWidth() + i13, size2), View.MeasureSpec.getSize(i11));
                return;
            case 1:
                int size3 = View.MeasureSpec.getSize(i10);
                fo foVar = (fo) this.f20283c;
                if (foVar.H9()) {
                    size3 -= AndroidUtilities.dp(71.0f);
                    i17 = AndroidUtilities.dp(32.0f);
                } else {
                    i17 = 0;
                }
                TextView textView2 = foVar.L1;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = foVar.N1) != null && textView.getVisibility() == 0) {
                    size3 = sk.A(31.0f, size3, 2);
                }
                this.f20282b = true;
                TextView textView3 = foVar.N1;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) foVar.N1.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = foVar.L1;
                    if (textView4 != null && textView4.getVisibility() == 0) {
                        foVar.N1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        layoutParams.leftMargin = i17 + size3;
                        layoutParams.width -= AndroidUtilities.dp(15.0f);
                    } else {
                        foVar.N1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                        layoutParams.leftMargin = i17;
                    }
                }
                TextView textView5 = foVar.L1;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) foVar.L1.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = foVar.N1;
                    if (textView6 != null && textView6.getVisibility() == 0) {
                        foVar.L1.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    } else {
                        foVar.L1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                    }
                    layoutParams2.leftMargin = i17;
                }
                this.f20282b = false;
                super.onMeasure(i10, i11);
                return;
            case 2:
                l31 l31Var = (l31) this.f20283c;
                int size4 = View.MeasureSpec.getSize(i10);
                int size5 = View.MeasureSpec.getSize(i11);
                if (size4 < size5) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                l31Var.P = z10;
                z9 z9Var = l31Var.f37601y;
                if (z10) {
                    i18 = 0;
                } else {
                    i18 = 8;
                }
                z9Var.setVisibility(i18);
                super.onMeasure(i10, i11);
                if (z10) {
                    this.f20282b = true;
                    ah.v vVar = l31Var.f37600x;
                    int i27 = l31Var.Q.f10892a;
                    int dp = AndroidUtilities.dp(8.0f);
                    i0.b bVar = l31Var.Q;
                    vVar.setPadding(i27, dp, bVar.f10894c, bVar.d);
                    this.f20282b = false;
                    l31Var.f37600x.measure(View.MeasureSpec.makeMeasureSpec(size4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size5 + l31Var.Q.d, Integer.MIN_VALUE));
                    l31Var.E.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(330.0f), 1073741824));
                    return;
                }
                this.f20282b = true;
                ah.v vVar2 = l31Var.f37600x;
                i0.b bVar2 = l31Var.Q;
                vVar2.setPadding(0, (bVar2.f10893b * 2) / 3, bVar2.f10894c, bVar2.d);
                this.f20282b = false;
                l31Var.f37600x.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(273.0f) + l31Var.Q.f10894c, 1073741824), i11);
                l31Var.E.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(310.0f), 1073741824));
                return;
            default:
                int size6 = View.MeasureSpec.getSize(i10);
                int size7 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size6, size7);
                if (((ce1) this.f20283c).e != null) {
                    this.f20282b = true;
                    if (!AndroidUtilities.isTablet()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((ce1) this.f20283c).e.getLayoutParams();
                        layoutParams3.topMargin = AndroidUtilities.statusBarHeight;
                        ((ce1) this.f20283c).e.setLayoutParams(layoutParams3);
                    }
                    if (!AndroidUtilities.isTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 2) {
                        ((ce1) this.f20283c).h.setTextSize(1, 18.0f);
                    } else {
                        ((ce1) this.f20283c).h.setTextSize(1, 20.0f);
                    }
                    this.f20282b = false;
                }
                measureChildWithMargins(((ce1) this.f20283c).f34627s0, i10, 0, i11, 0);
                int measuredHeight = ((ce1) this.f20283c).f34627s0.getMeasuredHeight();
                if (((ce1) this.f20283c).f34627s0.getVisibility() == 0) {
                    size7 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((ce1) this.f20283c).f34631u0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                ce1 ce1Var = (ce1) this.f20283c;
                int i28 = 58;
                if (ce1Var.f34580b == 2) {
                    xc1 xc1Var = ce1Var.f34631u0;
                    int dp2 = AndroidUtilities.dp(4.0f);
                    ce1 ce1Var2 = (ce1) this.f20283c;
                    if (!ce1Var2.K1 && ce1Var2.J1 > 0) {
                        i24 = 58;
                    } else {
                        i24 = 0;
                    }
                    int dp3 = AndroidUtilities.dp(i24 + 72) - 12;
                    if (((ce1) this.f20283c).U0()) {
                        i25 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i25 = 0;
                    }
                    xc1Var.setPadding(0, dp2, 0, dp3 + i25);
                }
                ((ce1) this.f20283c).f34631u0.measure(View.MeasureSpec.makeMeasureSpec(size6, 1073741824), View.MeasureSpec.makeMeasureSpec(size7 - layoutParams4.bottomMargin, 1073741824));
                ((FrameLayout.LayoutParams) ((ce1) this.f20283c).f34639x0.getLayoutParams()).topMargin = measuredHeight;
                ((ce1) this.f20283c).f34639x0.measure(View.MeasureSpec.makeMeasureSpec(size6, 1073741824), View.MeasureSpec.makeMeasureSpec(size7, 1073741824));
                org.telegram.ui.x5 x5Var = ((ce1) this.f20283c).Q1;
                if (x5Var != null) {
                    ((FrameLayout.LayoutParams) x5Var.getLayoutParams()).topMargin = measuredHeight;
                    ((ce1) this.f20283c).Q1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(222.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824));
                }
                org.telegram.ui.y4 y4Var = ((ce1) this.f20283c).C0;
                if (y4Var != null) {
                    int dp4 = AndroidUtilities.dp(12.0f);
                    int dp5 = AndroidUtilities.dp(12.0f);
                    int dp6 = AndroidUtilities.dp(12.0f);
                    int dp7 = AndroidUtilities.dp(12.0f);
                    if (((ce1) this.f20283c).U0()) {
                        i22 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i22 = 0;
                    }
                    y4Var.setPadding(dp4, dp5, dp6, dp7 + i22);
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((ce1) this.f20283c).C0.getLayoutParams();
                    ce1 ce1Var3 = (ce1) this.f20283c;
                    if (ce1Var3.K1 || ce1Var3.J1 <= 0) {
                        i28 = 0;
                    }
                    int dp8 = AndroidUtilities.dp(72 + i28);
                    if (((ce1) this.f20283c).U0()) {
                        i23 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i23 = 0;
                    }
                    layoutParams5.height = dp8 + i23;
                    measureChildWithMargins(((ce1) this.f20283c).C0, i10, 0, i11, 0);
                }
                Drawable drawable = ((ce1) this.f20283c).f34623r;
                if (drawable != null) {
                    drawable.getPadding(AndroidUtilities.rectTmp2);
                }
                int i29 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((ce1) this.f20283c).L0;
                    if (i29 < frameLayoutArr.length) {
                        FrameLayout frameLayout = frameLayoutArr[i29];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i29 == 0) {
                                if (((ce1) this.f20283c).f34580b == 2) {
                                    i21 = 321;
                                } else {
                                    i21 = 273;
                                }
                                f7 = i21;
                            } else {
                                f7 = 316.0f;
                            }
                            layoutParams6.height = AndroidUtilities.dp(f7);
                            if (((ce1) this.f20283c).U0()) {
                                layoutParams6.height += AndroidUtilities.navigationBarHeight;
                            }
                            if (i29 == 0) {
                                layoutParams6.height = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top + layoutParams6.height;
                            }
                            FrameLayout frameLayout2 = ((ce1) this.f20283c).L0[i29];
                            if (i29 == 0) {
                                i19 = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top;
                            } else {
                                i19 = 0;
                            }
                            if (((ce1) this.f20283c).U0()) {
                                i20 = AndroidUtilities.navigationBarHeight;
                            } else {
                                i20 = 0;
                            }
                            frameLayout2.setPadding(0, i19, 0, i20);
                            measureChildWithMargins(((ce1) this.f20283c).L0[i29], i10, 0, i11, 0);
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
        switch (this.f20281a) {
            case 0:
                if (!this.f20282b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f20282b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f20282b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f20282b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f20281a) {
            case 0:
                super.setAlpha(f7);
                u0 u0Var = (u0) this.f20283c;
                j0 j0Var = u0Var.f20396s;
                if (j0Var != null && j0Var.getTag() != null) {
                    u0Var.f20396s.setAlpha(f7);
                    u0Var.f20396s.setScaleX(f7);
                    u0Var.f20396s.setScaleY(f7);
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
        switch (this.f20281a) {
            case 0:
                super.setVisibility(i10);
                u0 u0Var = (u0) this.f20283c;
                j0 j0Var = u0Var.f20396s;
                if (j0Var != null) {
                    j0Var.setVisibility(i10);
                }
                View view = u0Var.f20400w;
                if (view != null) {
                    view.setVisibility(i10);
                }
                FrameLayout frameLayout = u0Var.f20373a;
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
