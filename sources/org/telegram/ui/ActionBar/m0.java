package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.ui.g81;
import org.telegram.ui.k91;
import org.telegram.ui.un;
public final class m0 extends FrameLayout {
    public final int f20559a;
    public boolean f20560b;
    public final Object f20561c;

    public m0(Object obj, Context context, int i10) {
        super(context);
        this.f20559a = i10;
        this.f20561c = obj;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        int i10;
        switch (this.f20559a) {
            case 2:
                boolean drawChild = super.drawChild(canvas, view, j10);
                k91 k91Var = (k91) this.f20561c;
                if (view == k91Var.f38765t0 && k91.v0(k91Var) != null) {
                    z4 w02 = k91.w0(k91Var);
                    if (k91Var.f38765t0.getVisibility() == 0) {
                        i10 = (int) (k91Var.f38765t0.getTranslationY() + k91Var.f38765t0.getMeasuredHeight());
                    } else {
                        i10 = 0;
                    }
                    ((ActionBarLayout) w02).q(canvas, i10);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f20559a) {
            case 0:
                t0 t0Var = (t0) this.f20561c;
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = 0;
                if (!dd.X && t0Var.h.getVisibility() == 0) {
                    i14 = org.telegram.messenger.i0.L(4.0f) + t0Var.h.getMeasuredWidth();
                }
                if (t0Var.f20833f.getVisibility() == 0) {
                    i14 += t0Var.f20833f.getMeasuredWidth();
                }
                n0 n0Var = t0Var.e;
                n0Var.layout(i14, n0Var.getTop(), t0Var.e.getMeasuredWidth() + i14, t0Var.e.getBottom());
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
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
        float f7;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        switch (this.f20559a) {
            case 0:
                t0 t0Var = (t0) this.f20561c;
                measureChildWithMargins(t0Var.f20848s, i10, 0, i11, 0);
                View view = t0Var.f20855x;
                if (view != null) {
                    measureChildWithMargins(view, i10, 0, i11, 0);
                }
                if (!dd.X) {
                    if (t0Var.h.getVisibility() == 0) {
                        measureChildWithMargins(t0Var.h, i10, View.MeasureSpec.getSize(i10) / 2, i11, 0);
                        i14 = org.telegram.messenger.i0.L(4.0f) + t0Var.h.getMeasuredWidth();
                    } else {
                        i14 = 0;
                    }
                    int size = View.MeasureSpec.getSize(i10);
                    this.f20560b = true;
                    measureChildWithMargins(t0Var.f20833f, i10, i14, i11, 0);
                    if (t0Var.f20833f.getVisibility() == 0) {
                        i15 = t0Var.f20833f.getMeasuredWidth();
                    } else {
                        i15 = 0;
                    }
                    n0 n0Var = t0Var.e;
                    int i25 = i14 + i15;
                    View view2 = t0Var.f20855x;
                    if (view2 != null) {
                        i16 = view2.getMeasuredWidth();
                    } else {
                        i16 = 0;
                    }
                    measureChildWithMargins(n0Var, i10, i25 + i16, i11, 0);
                    this.f20560b = false;
                    setMeasuredDimension(Math.max(t0Var.e.getMeasuredWidth() + i15, size), View.MeasureSpec.getSize(i11));
                    return;
                }
                if (t0Var.h.getVisibility() == 0) {
                    measureChildWithMargins(t0Var.h, i10, View.MeasureSpec.getSize(i10) / 2, i11, 0);
                    i12 = org.telegram.messenger.i0.L(4.0f) + t0Var.h.getMeasuredWidth();
                } else {
                    i12 = 0;
                }
                int size2 = View.MeasureSpec.getSize(i10);
                this.f20560b = true;
                measureChildWithMargins(t0Var.f20833f, i10, i12, i11, 0);
                if (t0Var.f20833f.getVisibility() == 0) {
                    i13 = t0Var.f20833f.getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                measureChildWithMargins(t0Var.e, a30.c(12.0f, size2, 0), i12 + i13, i11, 0);
                this.f20560b = false;
                setMeasuredDimension(Math.max(t0Var.e.getMeasuredWidth() + i13, size2), View.MeasureSpec.getSize(i11));
                return;
            case 1:
                int size3 = View.MeasureSpec.getSize(i10);
                un unVar = (un) this.f20561c;
                if (unVar.U9()) {
                    size3 -= org.telegram.messenger.i0.L(71.0f);
                    i17 = org.telegram.messenger.i0.L(32.0f);
                } else {
                    i17 = 0;
                }
                TextView textView2 = unVar.Z1;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = unVar.f42005b2) != null && textView.getVisibility() == 0) {
                    size3 = a30.y(31.0f, size3, 2);
                }
                this.f20560b = true;
                TextView textView3 = unVar.f42005b2;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) unVar.f42005b2.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = unVar.Z1;
                    if (textView4 != null && textView4.getVisibility() == 0) {
                        unVar.f42005b2.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
                        layoutParams.leftMargin = i17 + size3;
                        layoutParams.width -= org.telegram.messenger.i0.L(15.0f);
                    } else {
                        unVar.f42005b2.setPadding(org.telegram.messenger.i0.L(48.0f), 0, org.telegram.messenger.i0.L(48.0f), 0);
                        layoutParams.leftMargin = i17;
                    }
                }
                TextView textView5 = unVar.Z1;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) unVar.Z1.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = unVar.f42005b2;
                    if (textView6 != null && textView6.getVisibility() == 0) {
                        unVar.Z1.setPadding(org.telegram.messenger.i0.L(11.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
                    } else {
                        unVar.Z1.setPadding(org.telegram.messenger.i0.L(48.0f), 0, org.telegram.messenger.i0.L(48.0f), 0);
                    }
                    layoutParams2.leftMargin = i17;
                }
                this.f20560b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                int size4 = View.MeasureSpec.getSize(i10);
                int size5 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size4, size5);
                if (((k91) this.f20561c).e != null) {
                    this.f20560b = true;
                    if (!org.telegram.messenger.i0.Q1()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((k91) this.f20561c).e.getLayoutParams();
                        layoutParams3.topMargin = org.telegram.messenger.i0.f16166m;
                        ((k91) this.f20561c).e.setLayoutParams(layoutParams3);
                    }
                    if (!org.telegram.messenger.i0.Q1() && org.telegram.messenger.w0.f18945b.getResources().getConfiguration().orientation == 2) {
                        ((k91) this.f20561c).h.setTextSize(1, 18.0f);
                    } else {
                        ((k91) this.f20561c).h.setTextSize(1, 20.0f);
                    }
                    this.f20560b = false;
                }
                measureChildWithMargins(((k91) this.f20561c).f38765t0, i10, 0, i11, 0);
                int measuredHeight = ((k91) this.f20561c).f38765t0.getMeasuredHeight();
                if (((k91) this.f20561c).f38765t0.getVisibility() == 0) {
                    size5 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((k91) this.f20561c).f38769v0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                k91 k91Var = (k91) this.f20561c;
                int i26 = 58;
                if (k91Var.f38715b == 2) {
                    g81 g81Var = k91Var.f38769v0;
                    int L = org.telegram.messenger.i0.L(4.0f);
                    k91 k91Var2 = (k91) this.f20561c;
                    if (!k91Var2.L1 && k91Var2.K1 > 0) {
                        i23 = 58;
                    } else {
                        i23 = 0;
                    }
                    int L2 = org.telegram.messenger.i0.L(i23 + 72) - 12;
                    if (((k91) this.f20561c).Z0()) {
                        i24 = org.telegram.messenger.i0.f16167n;
                    } else {
                        i24 = 0;
                    }
                    g81Var.setPadding(0, L, 0, L2 + i24);
                }
                ((k91) this.f20561c).f38769v0.measure(View.MeasureSpec.makeMeasureSpec(size4, 1073741824), View.MeasureSpec.makeMeasureSpec(size5 - layoutParams4.bottomMargin, 1073741824));
                ((FrameLayout.LayoutParams) ((k91) this.f20561c).f38778y0.getLayoutParams()).topMargin = measuredHeight;
                ((k91) this.f20561c).f38778y0.measure(View.MeasureSpec.makeMeasureSpec(size4, 1073741824), View.MeasureSpec.makeMeasureSpec(size5, 1073741824));
                jg.b1 b1Var = ((k91) this.f20561c).R1;
                if (b1Var != null) {
                    ((FrameLayout.LayoutParams) b1Var.getLayoutParams()).topMargin = measuredHeight;
                    ((k91) this.f20561c).R1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(222.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(76.0f), 1073741824));
                }
                ig.s sVar = ((k91) this.f20561c).D0;
                if (sVar != null) {
                    int L3 = org.telegram.messenger.i0.L(12.0f);
                    int L4 = org.telegram.messenger.i0.L(12.0f);
                    int L5 = org.telegram.messenger.i0.L(12.0f);
                    int L6 = org.telegram.messenger.i0.L(12.0f);
                    if (((k91) this.f20561c).Z0()) {
                        i21 = org.telegram.messenger.i0.f16167n;
                    } else {
                        i21 = 0;
                    }
                    sVar.setPadding(L3, L4, L5, L6 + i21);
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((k91) this.f20561c).D0.getLayoutParams();
                    k91 k91Var3 = (k91) this.f20561c;
                    if (k91Var3.L1 || k91Var3.K1 <= 0) {
                        i26 = 0;
                    }
                    int L7 = org.telegram.messenger.i0.L(72 + i26);
                    if (((k91) this.f20561c).Z0()) {
                        i22 = org.telegram.messenger.i0.f16167n;
                    } else {
                        i22 = 0;
                    }
                    layoutParams5.height = L7 + i22;
                    measureChildWithMargins(((k91) this.f20561c).D0, i10, 0, i11, 0);
                }
                Drawable drawable = ((k91) this.f20561c).f38759r;
                if (drawable != null) {
                    drawable.getPadding(org.telegram.messenger.i0.Q);
                }
                int i27 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((k91) this.f20561c).M0;
                    if (i27 < frameLayoutArr.length) {
                        FrameLayout frameLayout = frameLayoutArr[i27];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i27 == 0) {
                                if (((k91) this.f20561c).f38715b == 2) {
                                    i20 = 321;
                                } else {
                                    i20 = 273;
                                }
                                f7 = i20;
                            } else {
                                f7 = 316.0f;
                            }
                            layoutParams6.height = org.telegram.messenger.i0.L(f7);
                            if (((k91) this.f20561c).Z0()) {
                                layoutParams6.height += org.telegram.messenger.i0.f16167n;
                            }
                            if (i27 == 0) {
                                layoutParams6.height = org.telegram.messenger.i0.L(12.0f) + org.telegram.messenger.i0.Q.top + layoutParams6.height;
                            }
                            FrameLayout frameLayout2 = ((k91) this.f20561c).M0[i27];
                            if (i27 == 0) {
                                i18 = org.telegram.messenger.i0.L(12.0f) + org.telegram.messenger.i0.Q.top;
                            } else {
                                i18 = 0;
                            }
                            if (((k91) this.f20561c).Z0()) {
                                i19 = org.telegram.messenger.i0.f16167n;
                            } else {
                                i19 = 0;
                            }
                            frameLayout2.setPadding(0, i18, 0, i19);
                            measureChildWithMargins(((k91) this.f20561c).M0[i27], i10, 0, i11, 0);
                        }
                        i27++;
                    } else {
                        return;
                    }
                }
                break;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f20559a) {
            case 0:
                if (!this.f20560b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f20560b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f20560b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f20559a) {
            case 0:
                super.setAlpha(f7);
                t0 t0Var = (t0) this.f20561c;
                g0 g0Var = t0Var.f20848s;
                if (g0Var != null && g0Var.getTag() != null) {
                    t0Var.f20848s.setAlpha(f7);
                    t0Var.f20848s.setScaleX(f7);
                    t0Var.f20848s.setScaleY(f7);
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
        switch (this.f20559a) {
            case 0:
                super.setVisibility(i10);
                t0 t0Var = (t0) this.f20561c;
                g0 g0Var = t0Var.f20848s;
                if (g0Var != null) {
                    g0Var.setVisibility(i10);
                }
                View view = t0Var.f20855x;
                if (view != null) {
                    view.setVisibility(i10);
                }
                FrameLayout frameLayout = t0Var.f20825a;
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
