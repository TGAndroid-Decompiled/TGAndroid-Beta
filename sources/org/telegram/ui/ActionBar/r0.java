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
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.cd1;
import org.telegram.ui.h21;
import org.telegram.ui.m21;
import org.telegram.ui.wb1;
import org.telegram.ui.xn;
public final class r0 extends FrameLayout {
    public final int f20540a;
    public boolean f20541b;
    public final Object f20542c;

    public r0(Object obj, Context context, int i10) {
        super(context);
        this.f20540a = i10;
        this.f20542c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f20540a) {
            case 2:
                super.dispatchTouchEvent(motionEvent);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        e5 e5Var;
        e5 e5Var2;
        int i10;
        switch (this.f20540a) {
            case 3:
                boolean drawChild = super.drawChild(canvas, view, j10);
                cd1 cd1Var = (cd1) this.f20542c;
                if (view == cd1Var.f33326p0) {
                    e5Var = cd1Var.parentLayout;
                    if (e5Var != null) {
                        e5Var2 = cd1Var.parentLayout;
                        if (cd1Var.f33326p0.getVisibility() == 0) {
                            i10 = (int) (cd1Var.f33326p0.getTranslationY() + cd1Var.f33326p0.getMeasuredHeight());
                        } else {
                            i10 = 0;
                        }
                        ((ActionBarLayout) e5Var2).q(canvas, i10);
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
        switch (this.f20540a) {
            case 0:
                w0 w0Var = (w0) this.f20542c;
                super.onLayout(z4, i10, i11, i12, i13);
                int i14 = 0;
                if (!LocaleController.isRTL && w0Var.h.getVisibility() == 0) {
                    i14 = AndroidUtilities.dp(4.0f) + w0Var.h.getMeasuredWidth();
                }
                if (w0Var.f20655f.getVisibility() == 0) {
                    i14 += w0Var.f20655f.getMeasuredWidth();
                }
                kg.f fVar = w0Var.e;
                fVar.layout(i14, fVar.getTop(), w0Var.e.getMeasuredWidth() + i14, w0Var.e.getBottom());
                return;
            case 1:
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
            case 2:
                m21 m21Var = (m21) this.f20542c;
                int measuredWidth2 = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                int i15 = 0;
                if (measuredWidth2 < measuredHeight2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (m21Var.f36177x.getVisibility() == 0) {
                    if (z10) {
                        AndroidUtilities.rectTmp2.set(0, 0, measuredWidth2, AndroidUtilities.dp(25.0f) + (measuredHeight2 - m21Var.f36177x.getMeasuredHeight()));
                    } else {
                        AndroidUtilities.rectTmp2.set(0, 0, AndroidUtilities.dp(25.0f) + (measuredWidth2 - m21Var.f36177x.getWidth()), measuredHeight2);
                    }
                    m21Var.f36176w.setClipBounds(AndroidUtilities.rectTmp2);
                } else {
                    m21Var.f36176w.setClipBounds(null);
                }
                m21Var.f36176w.layout(0, 0, measuredWidth2, measuredHeight2);
                if (m21Var.f36177x.getVisibility() == 0) {
                    i15 = m21Var.f36177x.getMeasuredHeight();
                }
                if (z10) {
                    measuredWidth = (measuredWidth2 - m21Var.B.getMeasuredWidth()) / 2;
                } else {
                    measuredWidth = m21Var.N.f7213a + ((((measuredWidth2 - m21Var.f36177x.getMeasuredWidth()) - m21Var.N.f7213a) - m21Var.B.getMeasuredWidth()) / 2);
                }
                if (z10) {
                    int i16 = m21Var.N.f7214b;
                    measuredHeight = AndroidUtilities.dp(52.0f) + (((((measuredHeight2 - i15) - i16) - m21Var.B.getMeasuredHeight()) - AndroidUtilities.dp(48.0f)) / 2) + i16;
                } else {
                    measuredHeight = (measuredHeight2 - m21Var.B.getMeasuredHeight()) / 2;
                }
                h21 h21Var = m21Var.B;
                h21Var.layout(measuredWidth, measuredHeight, h21Var.getMeasuredWidth() + measuredWidth, m21Var.B.getMeasuredHeight() + measuredHeight);
                if (z10) {
                    int measuredWidth3 = (measuredWidth2 - m21Var.f36178y.getMeasuredWidth()) / 2;
                    int dp = measuredHeight - AndroidUtilities.dp(48.0f);
                    p9 p9Var = m21Var.f36178y;
                    p9Var.layout(measuredWidth3, dp, p9Var.getMeasuredWidth() + measuredWidth3, m21Var.f36178y.getMeasuredHeight() + dp);
                }
                if (m21Var.f36177x.getVisibility() == 0) {
                    if (z10) {
                        int measuredWidth4 = (measuredWidth2 - m21Var.f36177x.getMeasuredWidth()) / 2;
                        m21Var.f36177x.layout(measuredWidth4, getMeasuredHeight() - i15, m21Var.f36177x.getMeasuredWidth() + measuredWidth4, getMeasuredHeight());
                    } else {
                        int measuredHeight3 = (measuredHeight2 - m21Var.f36177x.getMeasuredHeight()) / 2;
                        m21Var.f36177x.layout(getMeasuredWidth() - m21Var.f36177x.getMeasuredWidth(), measuredHeight3, getMeasuredWidth(), m21Var.f36177x.getMeasuredHeight() + measuredHeight3);
                    }
                }
                jj0 jj0Var = m21Var.C;
                Rect rect = m21Var.f36171c;
                jj0Var.layout(rect.left + measuredWidth, rect.top + measuredHeight, measuredWidth + rect.right, measuredHeight + rect.bottom);
                int dp2 = AndroidUtilities.dp(11.0f) + m21Var.N.f7213a;
                int dp3 = AndroidUtilities.dp(11.0f) + m21Var.N.f7214b;
                ImageView imageView = m21Var.D;
                imageView.layout(dp2, dp3, imageView.getMeasuredWidth() + dp2, m21Var.D.getMeasuredHeight() + dp3);
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
        switch (this.f20540a) {
            case 0:
                w0 w0Var = (w0) this.f20542c;
                measureChildWithMargins(w0Var.f20670s, i10, 0, i11, 0);
                View view = w0Var.f20671w;
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
                    r0Var.f20541b = true;
                    r0Var.measureChildWithMargins(w0Var.f20655f, i10, i14, i11, 0);
                    if (w0Var.f20655f.getVisibility() == 0) {
                        i15 = w0Var.f20655f.getMeasuredWidth();
                    } else {
                        i15 = 0;
                    }
                    kg.f fVar = w0Var.e;
                    int i26 = i14 + i15;
                    View view2 = w0Var.f20671w;
                    if (view2 != null) {
                        i16 = view2.getMeasuredWidth();
                    } else {
                        i16 = 0;
                    }
                    measureChildWithMargins(fVar, i10, i26 + i16, i11, 0);
                    this.f20541b = false;
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
                this.f20541b = true;
                measureChildWithMargins(w0Var.f20655f, i10, i12, i11, 0);
                if (w0Var.f20655f.getVisibility() == 0) {
                    i13 = w0Var.f20655f.getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                measureChildWithMargins(w0Var.e, org.telegram.ui.b.d(12.0f, size2, 0), i12 + i13, i11, 0);
                this.f20541b = false;
                setMeasuredDimension(Math.max(w0Var.e.getMeasuredWidth() + i13, size2), View.MeasureSpec.getSize(i11));
                return;
            case 1:
                int size3 = View.MeasureSpec.getSize(i10);
                xn xnVar = (xn) this.f20542c;
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
                this.f20541b = true;
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
                this.f20541b = false;
                super.onMeasure(i10, i11);
                return;
            case 2:
                m21 m21Var = (m21) this.f20542c;
                int size4 = View.MeasureSpec.getSize(i10);
                int size5 = View.MeasureSpec.getSize(i11);
                if (size4 < size5) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                m21Var.M = z4;
                p9 p9Var = m21Var.f36178y;
                if (z4) {
                    i18 = 0;
                } else {
                    i18 = 8;
                }
                p9Var.setVisibility(i18);
                super.onMeasure(i10, i11);
                if (z4) {
                    this.f20541b = true;
                    ah.d dVar = m21Var.f36177x;
                    int i27 = m21Var.N.f7213a;
                    int dp = AndroidUtilities.dp(8.0f);
                    i0.b bVar = m21Var.N;
                    dVar.setPadding(i27, dp, bVar.f7215c, bVar.d);
                    this.f20541b = false;
                    m21Var.f36177x.measure(View.MeasureSpec.makeMeasureSpec(size4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size5 + m21Var.N.d, Integer.MIN_VALUE));
                    m21Var.B.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(330.0f), 1073741824));
                    return;
                }
                this.f20541b = true;
                ah.d dVar2 = m21Var.f36177x;
                i0.b bVar2 = m21Var.N;
                dVar2.setPadding(0, (bVar2.f7214b * 2) / 3, bVar2.f7215c, bVar2.d);
                this.f20541b = false;
                m21Var.f36177x.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(273.0f) + m21Var.N.f7215c, 1073741824), i11);
                m21Var.B.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(310.0f), 1073741824));
                return;
            default:
                int size6 = View.MeasureSpec.getSize(i10);
                int size7 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size6, size7);
                if (((cd1) this.f20542c).e != null) {
                    this.f20541b = true;
                    if (!AndroidUtilities.isTablet()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((cd1) this.f20542c).e.getLayoutParams();
                        layoutParams3.topMargin = AndroidUtilities.statusBarHeight;
                        ((cd1) this.f20542c).e.setLayoutParams(layoutParams3);
                    }
                    if (!AndroidUtilities.isTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 2) {
                        ((cd1) this.f20542c).h.setTextSize(1, 18.0f);
                    } else {
                        ((cd1) this.f20542c).h.setTextSize(1, 20.0f);
                    }
                    this.f20541b = false;
                }
                measureChildWithMargins(((cd1) this.f20542c).f33326p0, i10, 0, i11, 0);
                int measuredHeight = ((cd1) this.f20542c).f33326p0.getMeasuredHeight();
                if (((cd1) this.f20542c).f33326p0.getVisibility() == 0) {
                    size7 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((cd1) this.f20542c).f33331r0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                cd1 cd1Var = (cd1) this.f20542c;
                int i28 = 58;
                if (cd1Var.f33290b == 2) {
                    wb1 wb1Var = cd1Var.f33331r0;
                    int dp2 = AndroidUtilities.dp(4.0f);
                    cd1 cd1Var2 = (cd1) this.f20542c;
                    if (!cd1Var2.H1 && cd1Var2.G1 > 0) {
                        i24 = 58;
                    } else {
                        i24 = 0;
                    }
                    int dp3 = AndroidUtilities.dp(i24 + 72) - 12;
                    if (((cd1) this.f20542c).U0()) {
                        i25 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i25 = 0;
                    }
                    wb1Var.setPadding(0, dp2, 0, dp3 + i25);
                }
                ((cd1) this.f20542c).f33331r0.measure(View.MeasureSpec.makeMeasureSpec(size6, 1073741824), View.MeasureSpec.makeMeasureSpec(size7 - layoutParams4.bottomMargin, 1073741824));
                ((FrameLayout.LayoutParams) ((cd1) this.f20542c).f33338u0.getLayoutParams()).topMargin = measuredHeight;
                ((cd1) this.f20542c).f33338u0.measure(View.MeasureSpec.makeMeasureSpec(size6, 1073741824), View.MeasureSpec.makeMeasureSpec(size7, 1073741824));
                dg.s1 s1Var = ((cd1) this.f20542c).N1;
                if (s1Var != null) {
                    ((FrameLayout.LayoutParams) s1Var.getLayoutParams()).topMargin = measuredHeight;
                    ((cd1) this.f20542c).N1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(222.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824));
                }
                org.telegram.ui.w4 w4Var = ((cd1) this.f20542c).f33351z0;
                if (w4Var != null) {
                    int dp4 = AndroidUtilities.dp(12.0f);
                    int dp5 = AndroidUtilities.dp(12.0f);
                    int dp6 = AndroidUtilities.dp(12.0f);
                    int dp7 = AndroidUtilities.dp(12.0f);
                    if (((cd1) this.f20542c).U0()) {
                        i22 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i22 = 0;
                    }
                    w4Var.setPadding(dp4, dp5, dp6, dp7 + i22);
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((cd1) this.f20542c).f33351z0.getLayoutParams();
                    cd1 cd1Var3 = (cd1) this.f20542c;
                    int dp8 = AndroidUtilities.dp(72 + ((cd1Var3.H1 || cd1Var3.G1 <= 0) ? 0 : 0));
                    if (((cd1) this.f20542c).U0()) {
                        i23 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i23 = 0;
                    }
                    layoutParams5.height = dp8 + i23;
                    measureChildWithMargins(((cd1) this.f20542c).f33351z0, i10, 0, i11, 0);
                }
                Drawable drawable = ((cd1) this.f20542c).f33330r;
                if (drawable != null) {
                    drawable.getPadding(AndroidUtilities.rectTmp2);
                }
                int i29 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((cd1) this.f20542c).I0;
                    if (i29 < frameLayoutArr.length) {
                        FrameLayout frameLayout = frameLayoutArr[i29];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i29 == 0) {
                                if (((cd1) this.f20542c).f33290b == 2) {
                                    i21 = 321;
                                } else {
                                    i21 = 273;
                                }
                                f10 = i21;
                            } else {
                                f10 = 316.0f;
                            }
                            layoutParams6.height = AndroidUtilities.dp(f10);
                            if (((cd1) this.f20542c).U0()) {
                                layoutParams6.height += AndroidUtilities.navigationBarHeight;
                            }
                            if (i29 == 0) {
                                layoutParams6.height = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top + layoutParams6.height;
                            }
                            FrameLayout frameLayout2 = ((cd1) this.f20542c).I0[i29];
                            if (i29 == 0) {
                                i19 = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top;
                            } else {
                                i19 = 0;
                            }
                            if (((cd1) this.f20542c).U0()) {
                                i20 = AndroidUtilities.navigationBarHeight;
                            } else {
                                i20 = 0;
                            }
                            frameLayout2.setPadding(0, i19, 0, i20);
                            measureChildWithMargins(((cd1) this.f20542c).I0[i29], i10, 0, i11, 0);
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
        switch (this.f20540a) {
            case 0:
                if (!this.f20541b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f20541b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 2:
                if (!this.f20541b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f20541b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f20540a) {
            case 0:
                super.setAlpha(f10);
                w0 w0Var = (w0) this.f20542c;
                l0 l0Var = w0Var.f20670s;
                if (l0Var != null && l0Var.getTag() != null) {
                    w0Var.f20670s.setAlpha(f10);
                    w0Var.f20670s.setScaleX(f10);
                    w0Var.f20670s.setScaleY(f10);
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
        switch (this.f20540a) {
            case 0:
                super.setVisibility(i10);
                w0 w0Var = (w0) this.f20542c;
                l0 l0Var = w0Var.f20670s;
                if (l0Var != null) {
                    l0Var.setVisibility(i10);
                }
                View view = w0Var.f20671w;
                if (view != null) {
                    view.setVisibility(i10);
                }
                FrameLayout frameLayout = w0Var.f20647a;
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
