package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.a30;
import org.telegram.ui.Components.CheckBox;
public abstract class ua extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public int f23151a;
    public boolean f23152b;
    public final ta[] f23153c;
    public int d;
    public boolean e;
    public boolean f23154f;
    public int h;
    public final Paint f23155n;
    public final Paint f23156r;
    public final Paint f23157s;
    public final Drawable f23158w;

    public ua(Context context, int i10) {
        super(context);
        this.f23152b = true;
        this.d = 3;
        this.f23153c = new ta[i10];
        int i11 = 0;
        while (true) {
            ta[] taVarArr = this.f23153c;
            if (i11 < taVarArr.length) {
                ta taVar = new ta(this, context);
                taVarArr[i11] = taVar;
                taVar.setClipToOutline(true);
                addView(taVar);
                taVar.setOnClickListener(new jg.w1(this, taVar, i11, 3));
                taVar.setOnLongClickListener(new sa(this, taVar, i11));
                i11++;
            } else {
                Paint paint = new Paint();
                this.f23155n = paint;
                paint.setColor(855638016);
                this.f23156r = new Paint(1);
                this.f23158w = i0.a.f(context, 2131230880);
                Paint paint2 = new Paint();
                this.f23157s = paint2;
                paint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.zi, false));
                return;
            }
        }
    }

    public abstract void a(int i10, Object obj);

    public boolean b(Object obj, int i10) {
        return false;
    }

    public final void c(int i10, boolean z10, boolean z11) {
        float f7;
        float f10;
        ta taVar = this.f23153c[i10];
        ag.d2 d2Var = taVar.f23111a;
        CheckBox checkBox = taVar.f23113c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z10, z11);
        AnimatorSet animatorSet = taVar.f23114f;
        if (animatorSet != null) {
            animatorSet.cancel();
            taVar.f23114f = null;
        }
        float f11 = 1.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            taVar.f23114f = animatorSet2;
            if (z10) {
                f10 = 0.8875f;
            } else {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(d2Var, "scaleX", f10);
            if (z10) {
                f11 = 0.8875f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(d2Var, "scaleY", f11));
            taVar.f23114f.setDuration(200L);
            taVar.f23114f.addListener(new eg.m(11, taVar, z10));
            taVar.f23114f.start();
        } else {
            if (z10) {
                f7 = 0.8875f;
            } else {
                f7 = 1.0f;
            }
            d2Var.setScaleX(f7);
            if (z10) {
                f11 = 0.8875f;
            }
            d2Var.setScaleY(f11);
        }
        taVar.invalidate();
    }

    public final void d(int i10, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i11;
        this.d = i10;
        this.e = z10;
        this.f23154f = z11;
        int i12 = 0;
        while (true) {
            ta[] taVarArr = this.f23153c;
            if (i12 < taVarArr.length) {
                rf.d0 d0Var = null;
                if ((!z10 && !z11) || (i12 != 0 && i12 != i10 - 1)) {
                    taVarArr[i12].setOutlineProvider(null);
                    z14 = z10;
                    z15 = z11;
                } else {
                    ta taVar = taVarArr[i12];
                    int L = org.telegram.messenger.i0.L(16.0f);
                    if (i12 == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (i12 == i10 - 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    bi.d2 d2Var = rf.e0.f46537a;
                    if ((!z12 && !z13) || (!z10 && !z11)) {
                        z14 = z10;
                        z15 = z11;
                    } else {
                        z14 = z10;
                        z15 = z11;
                        d0Var = new rf.d0(L, z12, z14, z13, z15);
                    }
                    taVar.setOutlineProvider(d0Var);
                }
                ta taVar2 = taVarArr[i12];
                if (i12 < i10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                taVar2.setVisibility(i11);
                taVarArr[i12].clearAnimation();
                i12++;
                z10 = z14;
                z11 = z15;
            } else {
                return;
            }
        }
    }

    public final void e(int i10, Object obj, Object obj2, int i11) {
        this.h = i10;
        ta[] taVarArr = this.f23153c;
        if (obj == null) {
            taVarArr[i11].setVisibility(8);
            taVarArr[i11].clearAnimation();
            return;
        }
        taVarArr[i11].setVisibility(0);
        taVarArr[i11].a(obj, obj2);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        for (int i10 = 0; i10 < this.d; i10++) {
            this.f23153c[i10].invalidate();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        if (this.d == 1) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int L = org.telegram.messenger.i0.L(12.0f);
        if (this.e) {
            i14 = org.telegram.messenger.i0.L(12.0f);
        } else {
            i14 = 0;
        }
        for (int i15 = 0; i15 < this.d; i15++) {
            ta[] taVarArr = this.f23153c;
            int measuredWidth = taVarArr[i15].getMeasuredWidth();
            ta taVar = taVarArr[i15];
            taVar.layout(L, i14, L + measuredWidth, taVar.getMeasuredHeight() + i14);
            L = org.telegram.messenger.m5.C(3.0f, measuredWidth, L);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int L;
        int i12;
        int i13;
        float f7 = 3.0f;
        int i14 = 0;
        if (this.d == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f23151a, 1073741824), a30.B(3.0f, this.f23151a, 1073741824));
            setPadding(0, 0, 0, org.telegram.messenger.i0.L(3.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int L2 = size - org.telegram.messenger.i0.L(i0.a.e(this.d, 1, 3, 24));
        int i15 = L2 / this.d;
        int i16 = this.h;
        if (i16 != 0 && i16 != 2 && i16 != 3) {
            L = i15;
        } else {
            L = org.telegram.messenger.i0.L(180.0f);
        }
        if (this.e) {
            i12 = org.telegram.messenger.i0.L(12.0f);
        } else {
            i12 = 0;
        }
        int i17 = i12 + L;
        if (this.f23154f) {
            f7 = 12.0f;
        }
        setMeasuredDimension(size, org.telegram.messenger.i0.L(f7) + i17);
        while (true) {
            int i18 = this.d;
            if (i14 < i18) {
                ta taVar = this.f23153c[i14];
                if (i14 == i18 - 1) {
                    i13 = L2;
                } else {
                    i13 = i15;
                }
                taVar.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(L, 1073741824));
                L2 -= i15;
                i14++;
            } else {
                return;
            }
        }
    }

    public void setSize(int i10) {
        if (this.f23151a != i10) {
            this.f23151a = i10;
            requestLayout();
        }
    }

    @Override
    public final void updateColors() {
        try {
            this.f23157s.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.zi, false));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
