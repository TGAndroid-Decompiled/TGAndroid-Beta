package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.ui.an;
import org.telegram.ui.r61;
import org.telegram.ui.v71;
public final class l0 extends FrameLayout {
    public final int f28274a;
    public boolean f28275b;
    public final Object f28276c;

    public l0(int i7, Context context, Object obj) {
        super(context);
        this.f28274a = i7;
        this.f28276c = obj;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        int i7;
        switch (this.f28274a) {
            case 2:
                boolean drawChild = super.drawChild(canvas, view, j3);
                v71 v71Var = (v71) this.f28276c;
                if (view == v71Var.f50573t0 && v71.v0(v71Var) != null) {
                    q4 w02 = v71.w0(v71Var);
                    if (v71Var.f50573t0.getVisibility() == 0) {
                        i7 = (int) (v71Var.f50573t0.getTranslationY() + v71Var.f50573t0.getMeasuredHeight());
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
        switch (this.f28274a) {
            case 0:
                r0 r0Var = (r0) this.f28276c;
                super.onLayout(z9, i7, i10, i11, i12);
                int i13 = 0;
                if (!id.f23157a0 && r0Var.h.getVisibility() == 0) {
                    i13 = org.telegram.messenger.g0.L(4.0f) + r0Var.h.getMeasuredWidth();
                }
                if (r0Var.f28431f.getVisibility() == 0) {
                    i13 += r0Var.f28431f.getMeasuredWidth();
                }
                ah.i iVar = r0Var.f28429e;
                iVar.layout(i13, iVar.getTop(), r0Var.f28429e.getMeasuredWidth() + i13, r0Var.f28429e.getBottom());
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
        switch (this.f28274a) {
            case 0:
                r0 r0Var = (r0) this.f28276c;
                measureChildWithMargins(r0Var.f28446s, i7, 0, i10, 0);
                View view = r0Var.f28453x;
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
                    this.f28275b = true;
                    measureChildWithMargins(r0Var.f28431f, i7, i13, i10, 0);
                    if (r0Var.f28431f.getVisibility() == 0) {
                        i14 = r0Var.f28431f.getMeasuredWidth();
                    } else {
                        i14 = 0;
                    }
                    ah.i iVar = r0Var.f28429e;
                    int i24 = i13 + i14;
                    View view2 = r0Var.f28453x;
                    if (view2 != null) {
                        i15 = view2.getMeasuredWidth();
                    } else {
                        i15 = 0;
                    }
                    measureChildWithMargins(iVar, i7, i24 + i15, i10, 0);
                    this.f28275b = false;
                    setMeasuredDimension(Math.max(r0Var.f28429e.getMeasuredWidth() + i14, size), View.MeasureSpec.getSize(i10));
                    return;
                }
                if (r0Var.h.getVisibility() == 0) {
                    measureChildWithMargins(r0Var.h, i7, View.MeasureSpec.getSize(i7) / 2, i10, 0);
                    i11 = org.telegram.messenger.g0.L(4.0f) + r0Var.h.getMeasuredWidth();
                } else {
                    i11 = 0;
                }
                int size2 = View.MeasureSpec.getSize(i7);
                this.f28275b = true;
                measureChildWithMargins(r0Var.f28431f, i7, i11, i10, 0);
                if (r0Var.f28431f.getVisibility() == 0) {
                    i12 = r0Var.f28431f.getMeasuredWidth();
                } else {
                    i12 = 0;
                }
                measureChildWithMargins(r0Var.f28429e, org.telegram.messenger.camera.q.c(12.0f, size2, 0), i11 + i12, i10, 0);
                this.f28275b = false;
                setMeasuredDimension(Math.max(r0Var.f28429e.getMeasuredWidth() + i12, size2), View.MeasureSpec.getSize(i10));
                return;
            case 1:
                int size3 = View.MeasureSpec.getSize(i7);
                an anVar = (an) this.f28276c;
                if (anVar.Z9()) {
                    size3 -= org.telegram.messenger.g0.L(71.0f);
                    i16 = org.telegram.messenger.g0.L(32.0f);
                } else {
                    i16 = 0;
                }
                TextView textView2 = anVar.Z1;
                if (textView2 != null && textView2.getVisibility() == 0 && (textView = anVar.f43739b2) != null && textView.getVisibility() == 0) {
                    size3 = org.telegram.messenger.camera.q.y(31.0f, size3, 2);
                }
                this.f28275b = true;
                TextView textView3 = anVar.f43739b2;
                if (textView3 != null && textView3.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) anVar.f43739b2.getLayoutParams();
                    layoutParams.width = size3;
                    TextView textView4 = anVar.Z1;
                    if (textView4 != null && textView4.getVisibility() == 0) {
                        anVar.f43739b2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                        layoutParams.leftMargin = i16 + size3;
                        layoutParams.width -= org.telegram.messenger.g0.L(15.0f);
                    } else {
                        anVar.f43739b2.setPadding(org.telegram.messenger.g0.L(48.0f), 0, org.telegram.messenger.g0.L(48.0f), 0);
                        layoutParams.leftMargin = i16;
                    }
                }
                TextView textView5 = anVar.Z1;
                if (textView5 != null && textView5.getVisibility() == 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) anVar.Z1.getLayoutParams();
                    layoutParams2.width = size3;
                    TextView textView6 = anVar.f43739b2;
                    if (textView6 != null && textView6.getVisibility() == 0) {
                        anVar.Z1.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                    } else {
                        anVar.Z1.setPadding(org.telegram.messenger.g0.L(48.0f), 0, org.telegram.messenger.g0.L(48.0f), 0);
                    }
                    layoutParams2.leftMargin = i16;
                }
                this.f28275b = false;
                super.onMeasure(i7, i10);
                return;
            default:
                int size4 = View.MeasureSpec.getSize(i7);
                int size5 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size4, size5);
                if (((v71) this.f28276c).f50534e != null) {
                    this.f28275b = true;
                    if (!org.telegram.messenger.g0.Q1()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((v71) this.f28276c).f50534e.getLayoutParams();
                        layoutParams3.topMargin = org.telegram.messenger.g0.f22557m;
                        ((v71) this.f28276c).f50534e.setLayoutParams(layoutParams3);
                    }
                    if (!org.telegram.messenger.g0.Q1() && org.telegram.messenger.t0.f25566b.getResources().getConfiguration().orientation == 2) {
                        ((v71) this.f28276c).h.setTextSize(1, 18.0f);
                    } else {
                        ((v71) this.f28276c).h.setTextSize(1, 20.0f);
                    }
                    this.f28275b = false;
                }
                measureChildWithMargins(((v71) this.f28276c).f50573t0, i7, 0, i10, 0);
                int measuredHeight = ((v71) this.f28276c).f50573t0.getMeasuredHeight();
                if (((v71) this.f28276c).f50573t0.getVisibility() == 0) {
                    size5 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((v71) this.f28276c).f50577v0.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                v71 v71Var = (v71) this.f28276c;
                int i25 = 58;
                if (v71Var.f50524b == 2) {
                    r61 r61Var = v71Var.f50577v0;
                    int L = org.telegram.messenger.g0.L(4.0f);
                    v71 v71Var2 = (v71) this.f28276c;
                    if (!v71Var2.L1 && v71Var2.K1 > 0) {
                        i22 = 58;
                    } else {
                        i22 = 0;
                    }
                    int L2 = org.telegram.messenger.g0.L(i22 + 72) - 12;
                    if (((v71) this.f28276c).Z0()) {
                        i23 = org.telegram.messenger.g0.f22558n;
                    } else {
                        i23 = 0;
                    }
                    r61Var.setPadding(0, L, 0, L2 + i23);
                }
                ((v71) this.f28276c).f50577v0.measure(View.MeasureSpec.makeMeasureSpec(size4, 1073741824), View.MeasureSpec.makeMeasureSpec(size5 - layoutParams4.bottomMargin, 1073741824));
                ((FrameLayout.LayoutParams) ((v71) this.f28276c).f50586y0.getLayoutParams()).topMargin = measuredHeight;
                ((v71) this.f28276c).f50586y0.measure(View.MeasureSpec.makeMeasureSpec(size4, 1073741824), View.MeasureSpec.makeMeasureSpec(size5, 1073741824));
                bi.m5 m5Var = ((v71) this.f28276c).R1;
                if (m5Var != null) {
                    ((FrameLayout.LayoutParams) m5Var.getLayoutParams()).topMargin = measuredHeight;
                    ((v71) this.f28276c).R1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(222.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(76.0f), 1073741824));
                }
                org.telegram.ui.t4 t4Var = ((v71) this.f28276c).D0;
                if (t4Var != null) {
                    int L3 = org.telegram.messenger.g0.L(12.0f);
                    int L4 = org.telegram.messenger.g0.L(12.0f);
                    int L5 = org.telegram.messenger.g0.L(12.0f);
                    int L6 = org.telegram.messenger.g0.L(12.0f);
                    if (((v71) this.f28276c).Z0()) {
                        i20 = org.telegram.messenger.g0.f22558n;
                    } else {
                        i20 = 0;
                    }
                    t4Var.setPadding(L3, L4, L5, L6 + i20);
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((v71) this.f28276c).D0.getLayoutParams();
                    v71 v71Var3 = (v71) this.f28276c;
                    if (v71Var3.L1 || v71Var3.K1 <= 0) {
                        i25 = 0;
                    }
                    int L7 = org.telegram.messenger.g0.L(72 + i25);
                    if (((v71) this.f28276c).Z0()) {
                        i21 = org.telegram.messenger.g0.f22558n;
                    } else {
                        i21 = 0;
                    }
                    layoutParams5.height = L7 + i21;
                    measureChildWithMargins(((v71) this.f28276c).D0, i7, 0, i10, 0);
                }
                Drawable drawable = ((v71) this.f28276c).f50567r;
                if (drawable != null) {
                    drawable.getPadding(org.telegram.messenger.g0.Q);
                }
                int i26 = 0;
                while (true) {
                    FrameLayout[] frameLayoutArr = ((v71) this.f28276c).M0;
                    if (i26 < frameLayoutArr.length) {
                        FrameLayout frameLayout = frameLayoutArr[i26];
                        if (frameLayout != null) {
                            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                            if (i26 == 0) {
                                if (((v71) this.f28276c).f50524b == 2) {
                                    i19 = 321;
                                } else {
                                    i19 = 273;
                                }
                                f10 = i19;
                            } else {
                                f10 = 316.0f;
                            }
                            layoutParams6.height = org.telegram.messenger.g0.L(f10);
                            if (((v71) this.f28276c).Z0()) {
                                layoutParams6.height += org.telegram.messenger.g0.f22558n;
                            }
                            if (i26 == 0) {
                                layoutParams6.height = org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.Q.top + layoutParams6.height;
                            }
                            FrameLayout frameLayout2 = ((v71) this.f28276c).M0[i26];
                            if (i26 == 0) {
                                i17 = org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.Q.top;
                            } else {
                                i17 = 0;
                            }
                            if (((v71) this.f28276c).Z0()) {
                                i18 = org.telegram.messenger.g0.f22558n;
                            } else {
                                i18 = 0;
                            }
                            frameLayout2.setPadding(0, i17, 0, i18);
                            measureChildWithMargins(((v71) this.f28276c).M0[i26], i7, 0, i10, 0);
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
        switch (this.f28274a) {
            case 0:
                if (!this.f28275b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f28275b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f28275b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f28274a) {
            case 0:
                super.setAlpha(f10);
                r0 r0Var = (r0) this.f28276c;
                f0 f0Var = r0Var.f28446s;
                if (f0Var != null && f0Var.getTag() != null) {
                    r0Var.f28446s.setAlpha(f10);
                    r0Var.f28446s.setScaleX(f10);
                    r0Var.f28446s.setScaleY(f10);
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
        switch (this.f28274a) {
            case 0:
                super.setVisibility(i7);
                r0 r0Var = (r0) this.f28276c;
                f0 f0Var = r0Var.f28446s;
                if (f0Var != null) {
                    f0Var.setVisibility(i7);
                }
                View view = r0Var.f28453x;
                if (view != null) {
                    view.setVisibility(i7);
                }
                FrameLayout frameLayout = r0Var.f28422a;
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
