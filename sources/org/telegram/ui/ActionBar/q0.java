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
import org.telegram.messenger.rl;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.gb1;
import org.telegram.ui.nc1;
import org.telegram.ui.rn;
import org.telegram.ui.t11;
import org.telegram.ui.y11;

public final class q0 extends FrameLayout {

    public final int f23734a;

    public boolean f23735b;

    public final Object f23736c;

    public q0(Object obj, Context context, int i10) {
        super(context);
        this.f23734a = i10;
        this.f23736c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f23734a) {
            case 2:
                super.dispatchTouchEvent(motionEvent);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        int translationY;
        switch (this.f23734a) {
            case 3:
                boolean zDrawChild = super.drawChild(canvas, view, j10);
                nc1 nc1Var = (nc1) this.f23736c;
                if (view == nc1Var.f40772o0 && nc1Var.parentLayout != null) {
                    b5 b5Var = nc1Var.parentLayout;
                    if (nc1Var.f40772o0.getVisibility() == 0) {
                        translationY = (int) (nc1Var.f40772o0.getTranslationY() + nc1Var.f40772o0.getMeasuredHeight());
                    } else {
                        translationY = 0;
                    }
                    ((ActionBarLayout) b5Var).q(canvas, translationY);
                }
                return zDrawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        switch (this.f23734a) {
            case 0:
                v0 v0Var = (v0) this.f23736c;
                super.onLayout(z10, i10, i11, i12, i13);
                int measuredWidth = 0;
                if (!LocaleController.isRTL && v0Var.h.getVisibility() == 0) {
                    measuredWidth = AndroidUtilities.dp(4.0f) + v0Var.h.getMeasuredWidth();
                }
                if (v0Var.f23861f.getVisibility() == 0) {
                    measuredWidth += v0Var.f23861f.getMeasuredWidth();
                }
                gg.g gVar = v0Var.f23859e;
                gVar.layout(measuredWidth, gVar.getTop(), v0Var.f23859e.getMeasuredWidth() + measuredWidth, v0Var.f23859e.getBottom());
                break;
            case 1:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 2:
                y11 y11Var = (y11) this.f23736c;
                int measuredWidth2 = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                boolean z11 = measuredWidth2 < measuredHeight2;
                if (y11Var.f44675x.getVisibility() == 0) {
                    if (z11) {
                        AndroidUtilities.rectTmp2.set(0, 0, measuredWidth2, AndroidUtilities.dp(25.0f) + (measuredHeight2 - y11Var.f44675x.getMeasuredHeight()));
                    } else {
                        AndroidUtilities.rectTmp2.set(0, 0, AndroidUtilities.dp(25.0f) + (measuredWidth2 - y11Var.f44675x.getWidth()), measuredHeight2);
                    }
                    y11Var.f44674w.setClipBounds(AndroidUtilities.rectTmp2);
                } else {
                    y11Var.f44674w.setClipBounds(null);
                }
                y11Var.f44674w.layout(0, 0, measuredWidth2, measuredHeight2);
                int measuredHeight3 = y11Var.f44675x.getVisibility() == 0 ? y11Var.f44675x.getMeasuredHeight() : 0;
                int measuredWidth3 = z11 ? (measuredWidth2 - y11Var.A.getMeasuredWidth()) / 2 : y11Var.M.f10489a + ((((measuredWidth2 - y11Var.f44675x.getMeasuredWidth()) - y11Var.M.f10489a) - y11Var.A.getMeasuredWidth()) / 2);
                if (z11) {
                    int i14 = y11Var.M.f10490b;
                    measuredHeight = AndroidUtilities.dp(52.0f) + (((((measuredHeight2 - measuredHeight3) - i14) - y11Var.A.getMeasuredHeight()) - AndroidUtilities.dp(48.0f)) / 2) + i14;
                } else {
                    measuredHeight = (measuredHeight2 - y11Var.A.getMeasuredHeight()) / 2;
                }
                t11 t11Var = y11Var.A;
                t11Var.layout(measuredWidth3, measuredHeight, t11Var.getMeasuredWidth() + measuredWidth3, y11Var.A.getMeasuredHeight() + measuredHeight);
                if (z11) {
                    int measuredWidth4 = (measuredWidth2 - y11Var.f44676y.getMeasuredWidth()) / 2;
                    int iDp = measuredHeight - AndroidUtilities.dp(48.0f);
                    n9 n9Var = y11Var.f44676y;
                    n9Var.layout(measuredWidth4, iDp, n9Var.getMeasuredWidth() + measuredWidth4, y11Var.f44676y.getMeasuredHeight() + iDp);
                }
                if (y11Var.f44675x.getVisibility() == 0) {
                    if (z11) {
                        int measuredWidth5 = (measuredWidth2 - y11Var.f44675x.getMeasuredWidth()) / 2;
                        y11Var.f44675x.layout(measuredWidth5, getMeasuredHeight() - measuredHeight3, y11Var.f44675x.getMeasuredWidth() + measuredWidth5, getMeasuredHeight());
                    } else {
                        int measuredHeight4 = (measuredHeight2 - y11Var.f44675x.getMeasuredHeight()) / 2;
                        y11Var.f44675x.layout(getMeasuredWidth() - y11Var.f44675x.getMeasuredWidth(), measuredHeight4, getMeasuredWidth(), y11Var.f44675x.getMeasuredHeight() + measuredHeight4);
                    }
                }
                ri0 ri0Var = y11Var.B;
                Rect rect = y11Var.f44668c;
                ri0Var.layout(rect.left + measuredWidth3, rect.top + measuredHeight, measuredWidth3 + rect.right, measuredHeight + rect.bottom);
                int iDp2 = AndroidUtilities.dp(11.0f) + y11Var.M.f10489a;
                int iDp3 = AndroidUtilities.dp(11.0f) + y11Var.M.f10490b;
                ImageView imageView = y11Var.C;
                imageView.layout(iDp2, iDp3, imageView.getMeasuredWidth() + iDp2, y11Var.C.getMeasuredHeight() + iDp3);
                break;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iDp;
        q0 q0Var;
        int iDp2;
        int iDp3;
        TextView textView;
        switch (this.f23734a) {
            case 0:
                v0 v0Var = (v0) this.f23736c;
                measureChildWithMargins(v0Var.f23875s, i10, 0, i11, 0);
                View view = v0Var.f23876w;
                if (view != null) {
                    measureChildWithMargins(view, i10, 0, i11, 0);
                }
                if (!LocaleController.isRTL) {
                    if (v0Var.h.getVisibility() == 0) {
                        q0Var = this;
                        q0Var.measureChildWithMargins(v0Var.h, i10, View.MeasureSpec.getSize(i10) / 2, i11, 0);
                        iDp2 = AndroidUtilities.dp(4.0f) + v0Var.h.getMeasuredWidth();
                    } else {
                        q0Var = this;
                        iDp2 = 0;
                    }
                    int size = View.MeasureSpec.getSize(i10);
                    q0Var.f23735b = true;
                    q0Var.measureChildWithMargins(v0Var.f23861f, i10, iDp2, i11, 0);
                    int measuredWidth = v0Var.f23861f.getVisibility() == 0 ? v0Var.f23861f.getMeasuredWidth() : 0;
                    gg.g gVar = v0Var.f23859e;
                    int i12 = iDp2 + measuredWidth;
                    View view2 = v0Var.f23876w;
                    measureChildWithMargins(gVar, i10, i12 + (view2 != null ? view2.getMeasuredWidth() : 0), i11, 0);
                    this.f23735b = false;
                    setMeasuredDimension(Math.max(v0Var.f23859e.getMeasuredWidth() + measuredWidth, size), View.MeasureSpec.getSize(i11));
                } else {
                    if (v0Var.h.getVisibility() == 0) {
                        measureChildWithMargins(v0Var.h, i10, View.MeasureSpec.getSize(i10) / 2, i11, 0);
                        iDp = AndroidUtilities.dp(4.0f) + v0Var.h.getMeasuredWidth();
                    } else {
                        iDp = 0;
                    }
                    int size2 = View.MeasureSpec.getSize(i10);
                    this.f23735b = true;
                    measureChildWithMargins(v0Var.f23861f, i10, iDp, i11, 0);
                    int measuredWidth2 = v0Var.f23861f.getVisibility() == 0 ? v0Var.f23861f.getMeasuredWidth() : 0;
                    measureChildWithMargins(v0Var.f23859e, rl.d(12.0f, size2, 0), iDp + measuredWidth2, i11, 0);
                    this.f23735b = false;
                    setMeasuredDimension(Math.max(v0Var.f23859e.getMeasuredWidth() + measuredWidth2, size2), View.MeasureSpec.getSize(i11));
                }
                break;
            case 1:
                int size3 = View.MeasureSpec.getSize(i10);
                rn rnVar = (rn) this.f23736c;
                if (rnVar.C9()) {
                    size3 -= AndroidUtilities.dp(71.0f);
                    iDp3 = AndroidUtilities.dp(32.0f);
                } else {
                    iDp3 = 0;
                }
                TextView textView2 = rnVar.H1;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = rnVar.J1) != null && textView.getVisibility() == 0) {
                    size3 = rl.x(31.0f, size3, 2);
                }
                this.f23735b = true;
                TextView textView3 = rnVar.J1;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rnVar.J1.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = rnVar.H1;
                    if (textView4 == null || textView4.getVisibility() != 0) {
                        rnVar.J1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                        layoutParams.leftMargin = iDp3;
                    } else {
                        rnVar.J1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                        layoutParams.leftMargin = iDp3 + size3;
                        layoutParams.width -= AndroidUtilities.dp(15.0f);
                    }
                }
                TextView textView5 = rnVar.H1;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) rnVar.H1.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = rnVar.J1;
                    if (textView6 == null || textView6.getVisibility() != 0) {
                        rnVar.H1.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
                    } else {
                        rnVar.H1.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    }
                    layoutParams2.leftMargin = iDp3;
                }
                this.f23735b = false;
                super.onMeasure(i10, i11);
                break;
            case 2:
                y11 y11Var = (y11) this.f23736c;
                int size4 = View.MeasureSpec.getSize(i10);
                int size5 = View.MeasureSpec.getSize(i11);
                boolean z10 = size4 < size5;
                y11Var.L = z10;
                y11Var.f44676y.setVisibility(z10 ? 0 : 8);
                super.onMeasure(i10, i11);
                if (!z10) {
                    this.f23735b = true;
                    ag.y1 y1Var = y11Var.f44675x;
                    i0.c cVar = y11Var.M;
                    y1Var.setPadding(0, (cVar.f10490b * 2) / 3, cVar.f10491c, cVar.d);
                    this.f23735b = false;
                    y11Var.f44675x.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(273.0f) + y11Var.M.f10491c, 1073741824), i11);
                    y11Var.A.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(310.0f), 1073741824));
                } else {
                    this.f23735b = true;
                    ag.y1 y1Var2 = y11Var.f44675x;
                    int i13 = y11Var.M.f10489a;
                    int iDp4 = AndroidUtilities.dp(8.0f);
                    i0.c cVar2 = y11Var.M;
                    y1Var2.setPadding(i13, iDp4, cVar2.f10491c, cVar2.d);
                    this.f23735b = false;
                    y11Var.f44675x.measure(View.MeasureSpec.makeMeasureSpec(size4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size5 + y11Var.M.d, Integer.MIN_VALUE));
                    y11Var.A.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(260.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(330.0f), 1073741824));
                }
                break;
            default:
                int size6 = View.MeasureSpec.getSize(i10);
                int size7 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size6, size7);
                if (((nc1) this.f23736c).f40749e != null) {
                    this.f23735b = true;
                    if (!AndroidUtilities.isTablet()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((nc1) this.f23736c).f40749e.getLayoutParams();
                        layoutParams3.topMargin = AndroidUtilities.statusBarHeight;
                        ((nc1) this.f23736c).f40749e.setLayoutParams(layoutParams3);
                    }
                    if (AndroidUtilities.isTablet() || ApplicationLoader.applicationContext.getResources().getConfiguration().orientation != 2) {
                        ((nc1) this.f23736c).h.setTextSize(1, 20.0f);
                    } else {
                        ((nc1) this.f23736c).h.setTextSize(1, 18.0f);
                    }
                    this.f23735b = false;
                }
                measureChildWithMargins(((nc1) this.f23736c).f40772o0, i10, 0, i11, 0);
                int measuredHeight = ((nc1) this.f23736c).f40772o0.getMeasuredHeight();
                if (((nc1) this.f23736c).f40772o0.getVisibility() == 0) {
                    size7 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((nc1) this.f23736c).f40776q0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                nc1 nc1Var = (nc1) this.f23736c;
                if (nc1Var.f40738b == 2) {
                    gb1 gb1Var = nc1Var.f40776q0;
                    int iDp5 = AndroidUtilities.dp(4.0f);
                    nc1 nc1Var2 = (nc1) this.f23736c;
                    gb1Var.setPadding(0, iDp5, 0, (AndroidUtilities.dp(((nc1Var2.G1 || nc1Var2.F1 <= 0) ? 0 : 58) + 72) - 12) + (((nc1) this.f23736c).U0() ? AndroidUtilities.navigationBarHeight : 0));
                }
                ((nc1) this.f23736c).f40776q0.measure(View.MeasureSpec.makeMeasureSpec(size6, 1073741824), View.MeasureSpec.makeMeasureSpec(size7 - layoutParams4.bottomMargin, 1073741824));
                ((FrameLayout.LayoutParams) ((nc1) this.f23736c).f40784t0.getLayoutParams()).topMargin = measuredHeight;
                ((nc1) this.f23736c).f40784t0.measure(View.MeasureSpec.makeMeasureSpec(size6, 1073741824), View.MeasureSpec.makeMeasureSpec(size7, 1073741824));
                ag.w wVar = ((nc1) this.f23736c).M1;
                if (wVar != null) {
                    ((FrameLayout.LayoutParams) wVar.getLayoutParams()).topMargin = measuredHeight;
                    ((nc1) this.f23736c).M1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(222.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824));
                }
                org.telegram.ui.u4 u4Var = ((nc1) this.f23736c).f40797y0;
                if (u4Var != null) {
                    u4Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + (((nc1) this.f23736c).U0() ? AndroidUtilities.navigationBarHeight : 0));
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((nc1) this.f23736c).f40797y0.getLayoutParams();
                    nc1 nc1Var3 = (nc1) this.f23736c;
                    layoutParams5.height = AndroidUtilities.dp(72 + ((nc1Var3.G1 || nc1Var3.F1 <= 0) ? 0 : 58)) + (((nc1) this.f23736c).U0() ? AndroidUtilities.navigationBarHeight : 0);
                    measureChildWithMargins(((nc1) this.f23736c).f40797y0, i10, 0, i11, 0);
                }
                Drawable drawable = ((nc1) this.f23736c).f40778r;
                if (drawable != null) {
                    drawable.getPadding(AndroidUtilities.rectTmp2);
                }
                int i14 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((nc1) this.f23736c).H0;
                    if (i14 < frameLayoutArr.length) {
                        FrameLayout frameLayout = frameLayoutArr[i14];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            layoutParams6.height = AndroidUtilities.dp(i14 == 0 ? ((nc1) this.f23736c).f40738b == 2 ? 321 : 273 : 316.0f);
                            if (((nc1) this.f23736c).U0()) {
                                layoutParams6.height += AndroidUtilities.navigationBarHeight;
                            }
                            if (i14 == 0) {
                                layoutParams6.height = AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top + layoutParams6.height;
                            }
                            ((nc1) this.f23736c).H0[i14].setPadding(0, i14 == 0 ? AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top : 0, 0, ((nc1) this.f23736c).U0() ? AndroidUtilities.navigationBarHeight : 0);
                            measureChildWithMargins(((nc1) this.f23736c).H0[i14], i10, 0, i11, 0);
                        }
                        i14++;
                    }
                    break;
                }
                break;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f23734a) {
            case 0:
                if (!this.f23735b) {
                    super.requestLayout();
                    break;
                }
                break;
            case 1:
                if (!this.f23735b) {
                    super.requestLayout();
                    break;
                }
                break;
            case 2:
                if (!this.f23735b) {
                    super.requestLayout();
                }
                break;
            default:
                if (!this.f23735b) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f23734a) {
            case 0:
                super.setAlpha(f10);
                v0 v0Var = (v0) this.f23736c;
                l0 l0Var = v0Var.f23875s;
                if (l0Var != null && l0Var.getTag() != null) {
                    v0Var.f23875s.setAlpha(f10);
                    v0Var.f23875s.setScaleX(f10);
                    v0Var.f23875s.setScaleY(f10);
                    break;
                }
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f23734a) {
            case 0:
                super.setVisibility(i10);
                v0 v0Var = (v0) this.f23736c;
                l0 l0Var = v0Var.f23875s;
                if (l0Var != null) {
                    l0Var.setVisibility(i10);
                }
                View view = v0Var.f23876w;
                if (view != null) {
                    view.setVisibility(i10);
                }
                FrameLayout frameLayout = v0Var.f23852a;
                if (frameLayout != null) {
                    frameLayout.setVisibility(i10);
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }
}
