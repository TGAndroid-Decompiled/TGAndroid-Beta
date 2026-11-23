package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.m10;
import org.telegram.ui.Components.CheckBox;
public abstract class wa extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public int f32364a;
    public boolean f32365b;
    public final va[] f32366c;
    public int d;
    public boolean f32367e;
    public boolean f32368f;
    public int h;
    public final Paint f32369n;
    public final Paint f32370r;
    public final Paint f32371s;
    public final Drawable f32372w;

    public wa(Context context, int i7) {
        super(context);
        this.f32365b = true;
        this.d = 3;
        this.f32366c = new va[i7];
        int i10 = 0;
        while (true) {
            va[] vaVarArr = this.f32366c;
            if (i10 < vaVarArr.length) {
                va vaVar = new va(this, context);
                vaVarArr[i10] = vaVar;
                vaVar.setClipToOutline(true);
                addView(vaVar);
                vaVar.setOnClickListener(new bi.k5(this, vaVar, i10, 5));
                vaVar.setOnLongClickListener(new bi.l5(this, vaVar, i10));
                i10++;
            } else {
                Paint paint = new Paint();
                this.f32369n = paint;
                paint.setColor(855638016);
                this.f32370r = new Paint(1);
                this.f32372w = i5.c.g(context, 2131230880);
                Paint paint2 = new Paint();
                this.f32371s = paint2;
                paint2.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ci, false));
                return;
            }
        }
    }

    public abstract void a(int i7, Object obj);

    public boolean b(Object obj, int i7) {
        return false;
    }

    public final void c(int i7, boolean z10, boolean z11) {
        float f10;
        float f11;
        va vaVar = this.f32366c[i7];
        fi.t3 t3Var = vaVar.f32294a;
        CheckBox checkBox = vaVar.f32296c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z10, z11);
        AnimatorSet animatorSet = vaVar.f32298f;
        if (animatorSet != null) {
            animatorSet.cancel();
            vaVar.f32298f = null;
        }
        float f12 = 1.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            vaVar.f32298f = animatorSet2;
            if (z10) {
                f11 = 0.8875f;
            } else {
                f11 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(t3Var, "scaleX", f11);
            if (z10) {
                f12 = 0.8875f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(t3Var, "scaleY", f12));
            vaVar.f32298f.setDuration(200L);
            vaVar.f32298f.addListener(new bi.j7(26, vaVar, z10));
            vaVar.f32298f.start();
        } else {
            if (z10) {
                f10 = 0.8875f;
            } else {
                f10 = 1.0f;
            }
            t3Var.setScaleX(f10);
            if (z10) {
                f12 = 0.8875f;
            }
            t3Var.setScaleY(f12);
        }
        vaVar.invalidate();
    }

    public final void d(int i7, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i10;
        this.d = i7;
        this.f32367e = z10;
        this.f32368f = z11;
        int i11 = 0;
        while (true) {
            va[] vaVarArr = this.f32366c;
            if (i11 < vaVarArr.length) {
                bg.t0 t0Var = null;
                if ((!z10 && !z11) || (i11 != 0 && i11 != i7 - 1)) {
                    vaVarArr[i11].setOutlineProvider(null);
                    z14 = z10;
                    z15 = z11;
                } else {
                    va vaVar = vaVarArr[i11];
                    int L = org.telegram.messenger.g0.L(16.0f);
                    if (i11 == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (i11 == i7 - 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    bg.q0 q0Var = bg.u0.f3313a;
                    if ((!z12 && !z13) || (!z10 && !z11)) {
                        z14 = z10;
                        z15 = z11;
                    } else {
                        z14 = z10;
                        z15 = z11;
                        t0Var = new bg.t0(L, z12, z14, z13, z15);
                    }
                    vaVar.setOutlineProvider(t0Var);
                }
                va vaVar2 = vaVarArr[i11];
                if (i11 < i7) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                vaVar2.setVisibility(i10);
                vaVarArr[i11].clearAnimation();
                i11++;
                z10 = z14;
                z11 = z15;
            } else {
                return;
            }
        }
    }

    public final void e(int i7, Object obj, Object obj2, int i10) {
        this.h = i7;
        va[] vaVarArr = this.f32366c;
        if (obj == null) {
            vaVarArr[i10].setVisibility(8);
            vaVarArr[i10].clearAnimation();
            return;
        }
        vaVarArr[i10].setVisibility(0);
        vaVarArr[i10].a(obj, obj2);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        for (int i7 = 0; i7 < this.d; i7++) {
            this.f32366c[i7].invalidate();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        if (this.d == 1) {
            super.onLayout(z10, i7, i10, i11, i12);
            return;
        }
        int L = org.telegram.messenger.g0.L(12.0f);
        if (this.f32367e) {
            i13 = org.telegram.messenger.g0.L(12.0f);
        } else {
            i13 = 0;
        }
        for (int i14 = 0; i14 < this.d; i14++) {
            va[] vaVarArr = this.f32366c;
            int measuredWidth = vaVarArr[i14].getMeasuredWidth();
            va vaVar = vaVarArr[i14];
            vaVar.layout(L, i13, L + measuredWidth, vaVar.getMeasuredHeight() + i13);
            L = org.telegram.messenger.f3.C(3.0f, measuredWidth, L);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        int i11;
        int i12;
        float f10 = 3.0f;
        int i13 = 0;
        if (this.d == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f32364a, 1073741824), m10.C(3.0f, this.f32364a, 1073741824));
            setPadding(0, 0, 0, org.telegram.messenger.g0.L(3.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i7);
        int L2 = size - org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(this.d, 1, 3, 24));
        int i14 = L2 / this.d;
        int i15 = this.h;
        if (i15 != 0 && i15 != 2 && i15 != 3) {
            L = i14;
        } else {
            L = org.telegram.messenger.g0.L(180.0f);
        }
        if (this.f32367e) {
            i11 = org.telegram.messenger.g0.L(12.0f);
        } else {
            i11 = 0;
        }
        int i16 = i11 + L;
        if (this.f32368f) {
            f10 = 12.0f;
        }
        setMeasuredDimension(size, org.telegram.messenger.g0.L(f10) + i16);
        while (true) {
            int i17 = this.d;
            if (i13 < i17) {
                va vaVar = this.f32366c[i13];
                if (i13 == i17 - 1) {
                    i12 = L2;
                } else {
                    i12 = i14;
                }
                vaVar.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(L, 1073741824));
                L2 -= i14;
                i13++;
            } else {
                return;
            }
        }
    }

    public void setSize(int i7) {
        if (this.f32364a != i7) {
            this.f32364a = i7;
            requestLayout();
        }
    }

    @Override
    public final void updateColors() {
        try {
            this.f32371s.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ci, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
