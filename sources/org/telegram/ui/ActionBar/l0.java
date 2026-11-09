package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.ui.cn;
import org.telegram.ui.s61;
import org.telegram.ui.w71;
public final class l0 extends FrameLayout {
    public final int f27758a;
    public boolean f27759b;
    public final Object f27760c;

    public l0(int i7, Context context, Object obj) {
        super(context);
        this.f27758a = i7;
        this.f27760c = obj;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        int i7;
        switch (this.f27758a) {
            case 2:
                boolean drawChild = super.drawChild(canvas, view, j3);
                w71 w71Var = (w71) this.f27760c;
                if (view == w71Var.f50955t0 && w71.v0(w71Var) != null) {
                    q4 w02 = w71.w0(w71Var);
                    if (w71Var.f50955t0.getVisibility() == 0) {
                        i7 = (int) (w71Var.f50955t0.getTranslationY() + w71Var.f50955t0.getMeasuredHeight());
                    } else {
                        i7 = 0;
                    }
                    ((ActionBarLayout) w02).q(canvas, i7);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f27758a) {
            case 0:
                r0 r0Var = (r0) this.f27760c;
                super.onLayout(z9, i7, i10, i11, i12);
                int i13 = 0;
                if (!id.f23157a0 && r0Var.h.getVisibility() == 0) {
                    i13 = org.telegram.messenger.g0.L(4.0f) + r0Var.h.getMeasuredWidth();
                }
                if (r0Var.f28432f.getVisibility() == 0) {
                    i13 += r0Var.f28432f.getMeasuredWidth();
                }
                ah.i iVar = r0Var.f28430e;
                iVar.layout(i13, iVar.getTop(), r0Var.f28430e.getMeasuredWidth() + i13, r0Var.f28430e.getBottom());
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        TextView textView;
        float f10;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        switch (this.f27758a) {
            case 0:
                r0 r0Var = (r0) this.f27760c;
                measureChildWithMargins(r0Var.f28447s, i7, 0, i10, 0);
                View view = r0Var.f28454x;
                if (view != null) {
                    measureChildWithMargins(view, i7, 0, i10, 0);
                }
                if (!id.f23157a0) {
                    if (r0Var.h.getVisibility() == 0) {
                        measureChildWithMargins(r0Var.h, i7, View.MeasureSpec.getSize(i7) / 2, i10, 0);
                        i13 = org.telegram.messenger.g0.L(4.0f) + r0Var.h.getMeasuredWidth();
                    } else {
                        i13 = 0;
                    }
                    int size = View.MeasureSpec.getSize(i7);
                    this.f27759b = true;
                    measureChildWithMargins(r0Var.f28432f, i7, i13, i10, 0);
                    if (r0Var.f28432f.getVisibility() == 0) {
                        i14 = r0Var.f28432f.getMeasuredWidth();
                    } else {
                        i14 = 0;
                    }
                    ah.i iVar = r0Var.f28430e;
                    int i24 = i13 + i14;
                    View view2 = r0Var.f28454x;
                    if (view2 != null) {
                        i15 = view2.getMeasuredWidth();
                    } else {
                        i15 = 0;
                    }
                    measureChildWithMargins(iVar, i7, i24 + i15, i10, 0);
                    this.f27759b = false;
                    setMeasuredDimension(Math.max(r0Var.f28430e.getMeasuredWidth() + i14, size), View.MeasureSpec.getSize(i10));
                    return;
                }
                if (r0Var.h.getVisibility() == 0) {
                    measureChildWithMargins(r0Var.h, i7, View.MeasureSpec.getSize(i7) / 2, i10, 0);
                    i11 = org.telegram.messenger.g0.L(4.0f) + r0Var.h.getMeasuredWidth();
                } else {
                    i11 = 0;
                }
                int size2 = View.MeasureSpec.getSize(i7);
                this.f27759b = true;
                measureChildWithMargins(r0Var.f28432f, i7, i11, i10, 0);
                if (r0Var.f28432f.getVisibility() == 0) {
                    i12 = r0Var.f28432f.getMeasuredWidth();
                } else {
                    i12 = 0;
                }
                measureChildWithMargins(r0Var.f28430e, org.telegram.messenger.camera.q.c(12.0f, size2, 0), i11 + i12, i10, 0);
                this.f27759b = false;
                setMeasuredDimension(Math.max(r0Var.f28430e.getMeasuredWidth() + i12, size2), View.MeasureSpec.getSize(i10));
                return;
            case 1:
                int size3 = View.MeasureSpec.getSize(i7);
                cn cnVar = (cn) this.f27760c;
                if (cnVar.aa()) {
                    size3 -= org.telegram.messenger.g0.L(71.0f);
                    i16 = org.telegram.messenger.g0.L(32.0f);
                } else {
                    i16 = 0;
                }
                TextView textView2 = cnVar.Z1;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = cnVar.f44394b2) != null && textView.getVisibility() == 0) {
                    size3 = org.telegram.messenger.camera.q.y(31.0f, size3, 2);
                }
                this.f27759b = true;
                TextView textView3 = cnVar.f44394b2;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) cnVar.f44394b2.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = cnVar.Z1;
                    if (textView4 != null && textView4.getVisibility() == 0) {
                        cnVar.f44394b2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        layoutParams.leftMargin = i16 + size3;
                        layoutParams.width -= org.telegram.messenger.g0.L(15.0f);
                    } else {
                        cnVar.f44394b2.setPadding(org.telegram.messenger.g0.L(48.0f), 0, org.telegram.messenger.g0.L(48.0f), 0);
                        layoutParams.leftMargin = i16;
                    }
                }
                TextView textView5 = cnVar.Z1;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) cnVar.Z1.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = cnVar.f44394b2;
                    if (textView6 != null && textView6.getVisibility() == 0) {
                        cnVar.Z1.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                    } else {
                        cnVar.Z1.setPadding(org.telegram.messenger.g0.L(48.0f), 0, org.telegram.messenger.g0.L(48.0f), 0);
                    }
                    layoutParams2.leftMargin = i16;
                }
                this.f27759b = false;
                super.onMeasure(i7, i10);
                return;
            default:
                int size4 = View.MeasureSpec.getSize(i7);
                int size5 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size4, size5);
                if (((w71) this.f27760c).f50916e != null) {
                    this.f27759b = true;
                    if (!org.telegram.messenger.g0.Q1()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((w71) this.f27760c).f50916e.getLayoutParams();
                        layoutParams3.topMargin = org.telegram.messenger.g0.f22557m;
                        ((w71) this.f27760c).f50916e.setLayoutParams(layoutParams3);
                    }
                    if (!org.telegram.messenger.g0.Q1() && org.telegram.messenger.t0.f25566b.getResources().getConfiguration().orientation == 2) {
                        ((w71) this.f27760c).h.setTextSize(1, 18.0f);
                    } else {
                        ((w71) this.f27760c).h.setTextSize(1, 20.0f);
                    }
                    this.f27759b = false;
                }
                measureChildWithMargins(((w71) this.f27760c).f50955t0, i7, 0, i10, 0);
                int measuredHeight = ((w71) this.f27760c).f50955t0.getMeasuredHeight();
                if (((w71) this.f27760c).f50955t0.getVisibility() == 0) {
                    size5 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((w71) this.f27760c).f50959v0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                w71 w71Var = (w71) this.f27760c;
                int i25 = 58;
                if (w71Var.f50906b == 2) {
                    s61 s61Var = w71Var.f50959v0;
                    int L = org.telegram.messenger.g0.L(4.0f);
                    w71 w71Var2 = (w71) this.f27760c;
                    if (!w71Var2.L1 && w71Var2.K1 > 0) {
                        i22 = 58;
                    } else {
                        i22 = 0;
                    }
                    int L2 = org.telegram.messenger.g0.L(i22 + 72) - 12;
                    if (((w71) this.f27760c).Z0()) {
                        i23 = org.telegram.messenger.g0.f22558n;
                    } else {
                        i23 = 0;
                    }
                    s61Var.setPadding(0, L, 0, L2 + i23);
                }
                ((w71) this.f27760c).f50959v0.measure(View.MeasureSpec.makeMeasureSpec(size4, 1073741824), View.MeasureSpec.makeMeasureSpec(size5 - layoutParams4.bottomMargin, 1073741824));
                ((FrameLayout.LayoutParams) ((w71) this.f27760c).f50968y0.getLayoutParams()).topMargin = measuredHeight;
                ((w71) this.f27760c).f50968y0.measure(View.MeasureSpec.makeMeasureSpec(size4, 1073741824), View.MeasureSpec.makeMeasureSpec(size5, 1073741824));
                bi.m5 m5Var = ((w71) this.f27760c).R1;
                if (m5Var != null) {
                    ((FrameLayout.LayoutParams) m5Var.getLayoutParams()).topMargin = measuredHeight;
                    ((w71) this.f27760c).R1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(222.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(76.0f), 1073741824));
                }
                org.telegram.ui.t4 t4Var = ((w71) this.f27760c).D0;
                if (t4Var != null) {
                    int L3 = org.telegram.messenger.g0.L(12.0f);
                    int L4 = org.telegram.messenger.g0.L(12.0f);
                    int L5 = org.telegram.messenger.g0.L(12.0f);
                    int L6 = org.telegram.messenger.g0.L(12.0f);
                    if (((w71) this.f27760c).Z0()) {
                        i20 = org.telegram.messenger.g0.f22558n;
                    } else {
                        i20 = 0;
                    }
                    t4Var.setPadding(L3, L4, L5, L6 + i20);
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((w71) this.f27760c).D0.getLayoutParams();
                    w71 w71Var3 = (w71) this.f27760c;
                    if (w71Var3.L1 || w71Var3.K1 <= 0) {
                        i25 = 0;
                    }
                    int L7 = org.telegram.messenger.g0.L(72 + i25);
                    if (((w71) this.f27760c).Z0()) {
                        i21 = org.telegram.messenger.g0.f22558n;
                    } else {
                        i21 = 0;
                    }
                    layoutParams5.height = L7 + i21;
                    measureChildWithMargins(((w71) this.f27760c).D0, i7, 0, i10, 0);
                }
                Drawable drawable = ((w71) this.f27760c).f50949r;
                if (drawable != null) {
                    drawable.getPadding(org.telegram.messenger.g0.Q);
                }
                int i26 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((w71) this.f27760c).M0;
                    if (i26 < frameLayoutArr.length) {
                        FrameLayout frameLayout = frameLayoutArr[i26];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i26 == 0) {
                                if (((w71) this.f27760c).f50906b == 2) {
                                    i19 = 321;
                                } else {
                                    i19 = 273;
                                }
                                f10 = i19;
                            } else {
                                f10 = 316.0f;
                            }
                            layoutParams6.height = org.telegram.messenger.g0.L(f10);
                            if (((w71) this.f27760c).Z0()) {
                                layoutParams6.height += org.telegram.messenger.g0.f22558n;
                            }
                            if (i26 == 0) {
                                layoutParams6.height = org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.Q.top + layoutParams6.height;
                            }
                            FrameLayout frameLayout2 = ((w71) this.f27760c).M0[i26];
                            if (i26 == 0) {
                                i17 = org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.Q.top;
                            } else {
                                i17 = 0;
                            }
                            if (((w71) this.f27760c).Z0()) {
                                i18 = org.telegram.messenger.g0.f22558n;
                            } else {
                                i18 = 0;
                            }
                            frameLayout2.setPadding(0, i17, 0, i18);
                            measureChildWithMargins(((w71) this.f27760c).M0[i26], i7, 0, i10, 0);
                        }
                        i26++;
                    } else {
                        return;
                    }
                }
                break;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f27758a) {
            case 0:
                if (!this.f27759b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f27759b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f27759b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f27758a) {
            case 0:
                super.setAlpha(f10);
                r0 r0Var = (r0) this.f27760c;
                f0 f0Var = r0Var.f28447s;
                if (f0Var != null && f0Var.getTag() != null) {
                    r0Var.f28447s.setAlpha(f10);
                    r0Var.f28447s.setScaleX(f10);
                    r0Var.f28447s.setScaleY(f10);
                    return;
                }
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f27758a) {
            case 0:
                super.setVisibility(i7);
                r0 r0Var = (r0) this.f27760c;
                f0 f0Var = r0Var.f28447s;
                if (f0Var != null) {
                    f0Var.setVisibility(i7);
                }
                View view = r0Var.f28454x;
                if (view != null) {
                    view.setVisibility(i7);
                }
                FrameLayout frameLayout = r0Var.f28423a;
                if (frameLayout != null) {
                    frameLayout.setVisibility(i7);
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }
}
