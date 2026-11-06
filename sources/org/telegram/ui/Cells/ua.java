package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.ui.Components.CheckBox;
public abstract class ua extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public int f30589a;
    public boolean f30590b;
    public final ta[] f30591c;
    public int d;
    public boolean f30592e;
    public boolean f30593f;
    public int h;
    public final Paint f30594n;
    public final Paint f30595r;
    public final Paint f30596s;
    public final Drawable f30597w;

    public ua(Context context, int i7) {
        super(context);
        this.f30590b = true;
        this.d = 3;
        this.f30591c = new ta[i7];
        int i10 = 0;
        while (true) {
            ta[] taVarArr = this.f30591c;
            if (i10 < taVarArr.length) {
                ta taVar = new ta(this, context);
                taVarArr[i10] = taVar;
                taVar.setClipToOutline(true);
                addView(taVar);
                taVar.setOnClickListener(new bi.la(this, taVar, i10, 3));
                taVar.setOnLongClickListener(new sa(this, taVar, i10));
                i10++;
            } else {
                Paint paint = new Paint();
                this.f30594n = paint;
                paint.setColor(855638016);
                this.f30595r = new Paint(1);
                this.f30597w = jg.g.h(context, 2131230880);
                Paint paint2 = new Paint();
                this.f30596s = paint2;
                paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zi, false));
                return;
            }
        }
    }

    public abstract void a(int i7, Object obj);

    public boolean b(Object obj, int i7) {
        return false;
    }

    public final void c(int i7, boolean z9, boolean z10) {
        float f10;
        float f11;
        ta taVar = this.f30591c[i7];
        di.c4 c4Var = taVar.f30540a;
        CheckBox checkBox = taVar.f30542c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z9, z10);
        AnimatorSet animatorSet = taVar.f30544f;
        if (animatorSet != null) {
            animatorSet.cancel();
            taVar.f30544f = null;
        }
        float f12 = 1.0f;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            taVar.f30544f = animatorSet2;
            if (z9) {
                f11 = 0.8875f;
            } else {
                f11 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c4Var, "scaleX", f11);
            if (z9) {
                f12 = 0.8875f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(c4Var, "scaleY", f12));
            taVar.f30544f.setDuration(200L);
            taVar.f30544f.addListener(new ch.y(25, taVar, z9));
            taVar.f30544f.start();
        } else {
            if (z9) {
                f10 = 0.8875f;
            } else {
                f10 = 1.0f;
            }
            c4Var.setScaleX(f10);
            if (z9) {
                f12 = 0.8875f;
            }
            c4Var.setScaleY(f12);
        }
        taVar.invalidate();
    }

    public final void d(int i7, boolean z9, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        this.d = i7;
        this.f30592e = z9;
        this.f30593f = z10;
        int i11 = 0;
        while (true) {
            ta[] taVarArr = this.f30591c;
            if (i11 < taVarArr.length) {
                bg.t0 t0Var = null;
                if ((!z9 && !z10) || (i11 != 0 && i11 != i7 - 1)) {
                    taVarArr[i11].setOutlineProvider(null);
                    z13 = z9;
                    z14 = z10;
                } else {
                    ta taVar = taVarArr[i11];
                    int L = org.telegram.messenger.g0.L(16.0f);
                    if (i11 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (i11 == i7 - 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    bg.q0 q0Var = bg.u0.f3380a;
                    if ((!z11 && !z12) || (!z9 && !z10)) {
                        z13 = z9;
                        z14 = z10;
                    } else {
                        z13 = z9;
                        z14 = z10;
                        t0Var = new bg.t0(L, z11, z13, z12, z14);
                    }
                    taVar.setOutlineProvider(t0Var);
                }
                ta taVar2 = taVarArr[i11];
                if (i11 < i7) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                taVar2.setVisibility(i10);
                taVarArr[i11].clearAnimation();
                i11++;
                z9 = z13;
                z10 = z14;
            } else {
                return;
            }
        }
    }

    public final void e(int i7, Object obj, Object obj2, int i10) {
        this.h = i7;
        ta[] taVarArr = this.f30591c;
        if (obj == null) {
            taVarArr[i10].setVisibility(8);
            taVarArr[i10].clearAnimation();
            return;
        }
        taVarArr[i10].setVisibility(0);
        taVarArr[i10].a(obj, obj2);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        for (int i7 = 0; i7 < this.d; i7++) {
            this.f30591c[i7].invalidate();
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        if (this.d == 1) {
            super.onLayout(z9, i7, i10, i11, i12);
            return;
        }
        int L = org.telegram.messenger.g0.L(12.0f);
        if (this.f30592e) {
            i13 = org.telegram.messenger.g0.L(12.0f);
        } else {
            i13 = 0;
        }
        for (int i14 = 0; i14 < this.d; i14++) {
            ta[] taVarArr = this.f30591c;
            int measuredWidth = taVarArr[i14].getMeasuredWidth();
            ta taVar = taVarArr[i14];
            taVar.layout(L, i13, L + measuredWidth, taVar.getMeasuredHeight() + i13);
            L = org.telegram.messenger.k5.C(3.0f, measuredWidth, L);
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
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f30589a, 1073741824), org.telegram.messenger.camera.q.B(3.0f, this.f30589a, 1073741824));
            setPadding(0, 0, 0, org.telegram.messenger.g0.L(3.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i7);
        int L2 = size - org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(this.d, 1, 3, 24));
        int i14 = L2 / this.d;
        int i15 = this.h;
        if (i15 != 0 && i15 != 2 && i15 != 3) {
            L = i14;
        } else {
            L = org.telegram.messenger.g0.L(180.0f);
        }
        if (this.f30592e) {
            i11 = org.telegram.messenger.g0.L(12.0f);
        } else {
            i11 = 0;
        }
        int i16 = i11 + L;
        if (this.f30593f) {
            f10 = 12.0f;
        }
        setMeasuredDimension(size, org.telegram.messenger.g0.L(f10) + i16);
        while (true) {
            int i17 = this.d;
            if (i13 < i17) {
                ta taVar = this.f30591c[i13];
                if (i13 == i17 - 1) {
                    i12 = L2;
                } else {
                    i12 = i14;
                }
                taVar.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(L, 1073741824));
                L2 -= i14;
                i13++;
            } else {
                return;
            }
        }
    }

    public void setSize(int i7) {
        if (this.f30589a != i7) {
            this.f30589a = i7;
            requestLayout();
        }
    }

    @Override
    public final void updateColors() {
        try {
            this.f30596s.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zi, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
