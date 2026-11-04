package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.bd;
import org.telegram.ui.g61;
import org.telegram.ui.l71;
import org.telegram.ui.wm;
public final class k0 extends FrameLayout {
    public final int f27757a;
    public boolean f27758b;
    public final Object f27759c;

    public k0(int i3, Context context, Object obj) {
        super(context);
        this.f27757a = i3;
        this.f27759c = obj;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        int i3;
        switch (this.f27757a) {
            case 2:
                boolean drawChild = super.drawChild(canvas, view, j10);
                l71 l71Var = (l71) this.f27759c;
                if (view == l71Var.f47197u0 && l71.v0(l71Var) != null) {
                    q4 w02 = l71.w0(l71Var);
                    if (l71Var.f47197u0.getVisibility() == 0) {
                        i3 = (int) (l71Var.f47197u0.getTranslationY() + l71Var.f47197u0.getMeasuredHeight());
                    } else {
                        i3 = 0;
                    }
                    ((ActionBarLayout) w02).q(canvas, i3);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.f27757a) {
            case 0:
                q0 q0Var = (q0) this.f27759c;
                super.onLayout(z10, i3, i10, i11, i12);
                int i13 = 0;
                if (!bd.f21784a0 && q0Var.h.getVisibility() == 0) {
                    i13 = org.telegram.messenger.g0.L(4.0f) + q0Var.h.getMeasuredWidth();
                }
                if (q0Var.f28447f.getVisibility() == 0) {
                    i13 += q0Var.f28447f.getMeasuredWidth();
                }
                bh.g gVar = q0Var.f28445e;
                gVar.layout(i13, gVar.getTop(), q0Var.f28445e.getMeasuredWidth() + i13, q0Var.f28445e.getBottom());
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
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
        switch (this.f27757a) {
            case 0:
                q0 q0Var = (q0) this.f27759c;
                measureChildWithMargins(q0Var.f28462s, i3, 0, i10, 0);
                View view = q0Var.f28469x;
                if (view != null) {
                    measureChildWithMargins(view, i3, 0, i10, 0);
                }
                if (!bd.f21784a0) {
                    if (q0Var.h.getVisibility() == 0) {
                        measureChildWithMargins(q0Var.h, i3, View.MeasureSpec.getSize(i3) / 2, i10, 0);
                        i13 = org.telegram.messenger.g0.L(4.0f) + q0Var.h.getMeasuredWidth();
                    } else {
                        i13 = 0;
                    }
                    int size = View.MeasureSpec.getSize(i3);
                    this.f27758b = true;
                    measureChildWithMargins(q0Var.f28447f, i3, i13, i10, 0);
                    if (q0Var.f28447f.getVisibility() == 0) {
                        i14 = q0Var.f28447f.getMeasuredWidth();
                    } else {
                        i14 = 0;
                    }
                    bh.g gVar = q0Var.f28445e;
                    int i24 = i13 + i14;
                    View view2 = q0Var.f28469x;
                    if (view2 != null) {
                        i15 = view2.getMeasuredWidth();
                    } else {
                        i15 = 0;
                    }
                    measureChildWithMargins(gVar, i3, i24 + i15, i10, 0);
                    this.f27758b = false;
                    setMeasuredDimension(Math.max(q0Var.f28445e.getMeasuredWidth() + i14, size), View.MeasureSpec.getSize(i10));
                    return;
                }
                if (q0Var.h.getVisibility() == 0) {
                    measureChildWithMargins(q0Var.h, i3, View.MeasureSpec.getSize(i3) / 2, i10, 0);
                    i11 = org.telegram.messenger.g0.L(4.0f) + q0Var.h.getMeasuredWidth();
                } else {
                    i11 = 0;
                }
                int size2 = View.MeasureSpec.getSize(i3);
                this.f27758b = true;
                measureChildWithMargins(q0Var.f28447f, i3, i11, i10, 0);
                if (q0Var.f28447f.getVisibility() == 0) {
                    i12 = q0Var.f28447f.getMeasuredWidth();
                } else {
                    i12 = 0;
                }
                measureChildWithMargins(q0Var.f28445e, org.telegram.messenger.camera.q.c(12.0f, size2, 0), i11 + i12, i10, 0);
                this.f27758b = false;
                setMeasuredDimension(Math.max(q0Var.f28445e.getMeasuredWidth() + i12, size2), View.MeasureSpec.getSize(i10));
                return;
            case 1:
                int size3 = View.MeasureSpec.getSize(i3);
                wm wmVar = (wm) this.f27759c;
                if (wmVar.Z9()) {
                    size3 -= org.telegram.messenger.g0.L(71.0f);
                    i16 = org.telegram.messenger.g0.L(32.0f);
                } else {
                    i16 = 0;
                }
                TextView textView2 = wmVar.f51239a2;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = wmVar.c2) != null && textView.getVisibility() == 0) {
                    size3 = org.telegram.messenger.camera.q.y(31.0f, size3, 2);
                }
                this.f27758b = true;
                TextView textView3 = wmVar.c2;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) wmVar.c2.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = wmVar.f51239a2;
                    if (textView4 != null && textView4.getVisibility() == 0) {
                        wmVar.c2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        layoutParams.leftMargin = i16 + size3;
                        layoutParams.width -= org.telegram.messenger.g0.L(15.0f);
                    } else {
                        wmVar.c2.setPadding(org.telegram.messenger.g0.L(48.0f), 0, org.telegram.messenger.g0.L(48.0f), 0);
                        layoutParams.leftMargin = i16;
                    }
                }
                TextView textView5 = wmVar.f51239a2;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) wmVar.f51239a2.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = wmVar.c2;
                    if (textView6 != null && textView6.getVisibility() == 0) {
                        wmVar.f51239a2.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                    } else {
                        wmVar.f51239a2.setPadding(org.telegram.messenger.g0.L(48.0f), 0, org.telegram.messenger.g0.L(48.0f), 0);
                    }
                    layoutParams2.leftMargin = i16;
                }
                this.f27758b = false;
                super.onMeasure(i3, i10);
                return;
            default:
                int size4 = View.MeasureSpec.getSize(i3);
                int size5 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size4, size5);
                if (((l71) this.f27759c).f47155e != null) {
                    this.f27758b = true;
                    if (!org.telegram.messenger.g0.Q1()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((l71) this.f27759c).f47155e.getLayoutParams();
                        layoutParams3.topMargin = org.telegram.messenger.g0.f22602m;
                        ((l71) this.f27759c).f47155e.setLayoutParams(layoutParams3);
                    }
                    if (!org.telegram.messenger.g0.Q1() && org.telegram.messenger.t0.f25457b.getResources().getConfiguration().orientation == 2) {
                        ((l71) this.f27759c).h.setTextSize(1, 18.0f);
                    } else {
                        ((l71) this.f27759c).h.setTextSize(1, 20.0f);
                    }
                    this.f27758b = false;
                }
                measureChildWithMargins(((l71) this.f27759c).f47197u0, i3, 0, i10, 0);
                int measuredHeight = ((l71) this.f27759c).f47197u0.getMeasuredHeight();
                if (((l71) this.f27759c).f47197u0.getVisibility() == 0) {
                    size5 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((l71) this.f27759c).f47202w0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                l71 l71Var = (l71) this.f27759c;
                int i25 = 58;
                if (l71Var.f47145b == 2) {
                    g61 g61Var = l71Var.f47202w0;
                    int L = org.telegram.messenger.g0.L(4.0f);
                    l71 l71Var2 = (l71) this.f27759c;
                    if (!l71Var2.M1 && l71Var2.L1 > 0) {
                        i22 = 58;
                    } else {
                        i22 = 0;
                    }
                    int L2 = org.telegram.messenger.g0.L(i22 + 72) - 12;
                    if (((l71) this.f27759c).Z0()) {
                        i23 = org.telegram.messenger.g0.f22603n;
                    } else {
                        i23 = 0;
                    }
                    g61Var.setPadding(0, L, 0, L2 + i23);
                }
                ((l71) this.f27759c).f47202w0.measure(View.MeasureSpec.makeMeasureSpec(size4, 1073741824), View.MeasureSpec.makeMeasureSpec(size5 - layoutParams4.bottomMargin, 1073741824));
                ((FrameLayout.LayoutParams) ((l71) this.f27759c).f47210z0.getLayoutParams()).topMargin = measuredHeight;
                ((l71) this.f27759c).f47210z0.measure(View.MeasureSpec.makeMeasureSpec(size4, 1073741824), View.MeasureSpec.makeMeasureSpec(size5, 1073741824));
                ci.t4 t4Var = ((l71) this.f27759c).S1;
                if (t4Var != null) {
                    ((FrameLayout.LayoutParams) t4Var.getLayoutParams()).topMargin = measuredHeight;
                    ((l71) this.f27759c).S1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(222.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(76.0f), 1073741824));
                }
                org.telegram.ui.v4 v4Var = ((l71) this.f27759c).E0;
                if (v4Var != null) {
                    int L3 = org.telegram.messenger.g0.L(12.0f);
                    int L4 = org.telegram.messenger.g0.L(12.0f);
                    int L5 = org.telegram.messenger.g0.L(12.0f);
                    int L6 = org.telegram.messenger.g0.L(12.0f);
                    if (((l71) this.f27759c).Z0()) {
                        i20 = org.telegram.messenger.g0.f22603n;
                    } else {
                        i20 = 0;
                    }
                    v4Var.setPadding(L3, L4, L5, L6 + i20);
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((l71) this.f27759c).E0.getLayoutParams();
                    l71 l71Var3 = (l71) this.f27759c;
                    if (l71Var3.M1 || l71Var3.L1 <= 0) {
                        i25 = 0;
                    }
                    int L7 = org.telegram.messenger.g0.L(72 + i25);
                    if (((l71) this.f27759c).Z0()) {
                        i21 = org.telegram.messenger.g0.f22603n;
                    } else {
                        i21 = 0;
                    }
                    layoutParams5.height = L7 + i21;
                    measureChildWithMargins(((l71) this.f27759c).E0, i3, 0, i10, 0);
                }
                Drawable drawable = ((l71) this.f27759c).f47189r;
                if (drawable != null) {
                    drawable.getPadding(org.telegram.messenger.g0.Q);
                }
                int i26 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((l71) this.f27759c).N0;
                    if (i26 < frameLayoutArr.length) {
                        FrameLayout frameLayout = frameLayoutArr[i26];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i26 == 0) {
                                if (((l71) this.f27759c).f47145b == 2) {
                                    i19 = 321;
                                } else {
                                    i19 = 273;
                                }
                                f10 = i19;
                            } else {
                                f10 = 316.0f;
                            }
                            layoutParams6.height = org.telegram.messenger.g0.L(f10);
                            if (((l71) this.f27759c).Z0()) {
                                layoutParams6.height += org.telegram.messenger.g0.f22603n;
                            }
                            if (i26 == 0) {
                                layoutParams6.height = org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.Q.top + layoutParams6.height;
                            }
                            FrameLayout frameLayout2 = ((l71) this.f27759c).N0[i26];
                            if (i26 == 0) {
                                i17 = org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.Q.top;
                            } else {
                                i17 = 0;
                            }
                            if (((l71) this.f27759c).Z0()) {
                                i18 = org.telegram.messenger.g0.f22603n;
                            } else {
                                i18 = 0;
                            }
                            frameLayout2.setPadding(0, i17, 0, i18);
                            measureChildWithMargins(((l71) this.f27759c).N0[i26], i3, 0, i10, 0);
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
        switch (this.f27757a) {
            case 0:
                if (!this.f27758b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f27758b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f27758b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f27757a) {
            case 0:
                super.setAlpha(f10);
                q0 q0Var = (q0) this.f27759c;
                e0 e0Var = q0Var.f28462s;
                if (e0Var != null && e0Var.getTag() != null) {
                    q0Var.f28462s.setAlpha(f10);
                    q0Var.f28462s.setScaleX(f10);
                    q0Var.f28462s.setScaleY(f10);
                    return;
                }
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i3) {
        switch (this.f27757a) {
            case 0:
                super.setVisibility(i3);
                q0 q0Var = (q0) this.f27759c;
                e0 e0Var = q0Var.f28462s;
                if (e0Var != null) {
                    e0Var.setVisibility(i3);
                }
                View view = q0Var.f28469x;
                if (view != null) {
                    view.setVisibility(i3);
                }
                FrameLayout frameLayout = q0Var.f28438a;
                if (frameLayout != null) {
                    frameLayout.setVisibility(i3);
                    return;
                }
                return;
            default:
                super.setVisibility(i3);
                return;
        }
    }
}
