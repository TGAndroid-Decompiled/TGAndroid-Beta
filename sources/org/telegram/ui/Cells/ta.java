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
public abstract class ta extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public int f30615a;
    public boolean f30616b;
    public final sa[] f30617c;
    public int d;
    public boolean f30618e;
    public boolean f30619f;
    public int h;
    public final Paint f30620n;
    public final Paint f30621r;
    public final Paint f30622s;
    public final Drawable f30623w;

    public ta(Context context, int i3) {
        super(context);
        this.f30616b = true;
        this.d = 3;
        this.f30617c = new sa[i3];
        int i10 = 0;
        while (true) {
            sa[] saVarArr = this.f30617c;
            if (i10 < saVarArr.length) {
                sa saVar = new sa(this, context);
                saVarArr[i10] = saVar;
                saVar.setClipToOutline(true);
                addView(saVar);
                saVar.setOnClickListener(new ai.h3(this, saVar, i10, 5));
                saVar.setOnLongClickListener(new ai.i3(this, saVar, i10));
                i10++;
            } else {
                Paint paint = new Paint();
                this.f30620n = paint;
                paint.setColor(855638016);
                this.f30621r = new Paint(1);
                this.f30623w = k2.p1.g(context, 2131230880);
                Paint paint2 = new Paint();
                this.f30622s = paint2;
                paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zi, false));
                return;
            }
        }
    }

    public abstract void a(int i3, Object obj);

    public boolean b(Object obj, int i3) {
        return false;
    }

    public final void c(int i3, boolean z10, boolean z11) {
        float f10;
        float f11;
        sa saVar = this.f30617c[i3];
        ei.d4 d4Var = saVar.f30358a;
        CheckBox checkBox = saVar.f30360c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z10, z11);
        AnimatorSet animatorSet = saVar.f30362f;
        if (animatorSet != null) {
            animatorSet.cancel();
            saVar.f30362f = null;
        }
        float f12 = 1.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            saVar.f30362f = animatorSet2;
            if (z10) {
                f11 = 0.8875f;
            } else {
                f11 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(d4Var, "scaleX", f11);
            if (z10) {
                f12 = 0.8875f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(d4Var, "scaleY", f12));
            saVar.f30362f.setDuration(200L);
            saVar.f30362f.addListener(new dh.x(25, saVar, z10));
            saVar.f30362f.start();
        } else {
            if (z10) {
                f10 = 0.8875f;
            } else {
                f10 = 1.0f;
            }
            d4Var.setScaleX(f10);
            if (z10) {
                f12 = 0.8875f;
            }
            d4Var.setScaleY(f12);
        }
        saVar.invalidate();
    }

    public final void d(int i3, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i10;
        this.d = i3;
        this.f30618e = z10;
        this.f30619f = z11;
        int i11 = 0;
        while (true) {
            sa[] saVarArr = this.f30617c;
            if (i11 < saVarArr.length) {
                cg.s0 s0Var = null;
                if ((!z10 && !z11) || (i11 != 0 && i11 != i3 - 1)) {
                    saVarArr[i11].setOutlineProvider(null);
                    z14 = z10;
                    z15 = z11;
                } else {
                    sa saVar = saVarArr[i11];
                    int L = org.telegram.messenger.g0.L(16.0f);
                    if (i11 == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (i11 == i3 - 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    cg.p0 p0Var = cg.t0.f4745a;
                    if ((!z12 && !z13) || (!z10 && !z11)) {
                        z14 = z10;
                        z15 = z11;
                    } else {
                        z14 = z10;
                        z15 = z11;
                        s0Var = new cg.s0(L, z12, z14, z13, z15);
                    }
                    saVar.setOutlineProvider(s0Var);
                }
                sa saVar2 = saVarArr[i11];
                if (i11 < i3) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                saVar2.setVisibility(i10);
                saVarArr[i11].clearAnimation();
                i11++;
                z10 = z14;
                z11 = z15;
            } else {
                return;
            }
        }
    }

    public final void e(int i3, Object obj, Object obj2, int i10) {
        this.h = i3;
        sa[] saVarArr = this.f30617c;
        if (obj == null) {
            saVarArr[i10].setVisibility(8);
            saVarArr[i10].clearAnimation();
            return;
        }
        saVarArr[i10].setVisibility(0);
        saVarArr[i10].a(obj, obj2);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        for (int i3 = 0; i3 < this.d; i3++) {
            this.f30617c[i3].invalidate();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        if (this.d == 1) {
            super.onLayout(z10, i3, i10, i11, i12);
            return;
        }
        int L = org.telegram.messenger.g0.L(12.0f);
        if (this.f30618e) {
            i13 = org.telegram.messenger.g0.L(12.0f);
        } else {
            i13 = 0;
        }
        for (int i14 = 0; i14 < this.d; i14++) {
            sa[] saVarArr = this.f30617c;
            int measuredWidth = saVarArr[i14].getMeasuredWidth();
            sa saVar = saVarArr[i14];
            saVar.layout(L, i13, L + measuredWidth, saVar.getMeasuredHeight() + i13);
            L = org.telegram.messenger.k5.C(3.0f, measuredWidth, L);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int L;
        int i11;
        int i12;
        float f10 = 3.0f;
        int i13 = 0;
        if (this.d == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f30615a, 1073741824), org.telegram.messenger.camera.q.B(3.0f, this.f30615a, 1073741824));
            setPadding(0, 0, 0, org.telegram.messenger.g0.L(3.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i3);
        int L2 = size - org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(this.d, 1, 3, 24));
        int i14 = L2 / this.d;
        int i15 = this.h;
        if (i15 != 0 && i15 != 2 && i15 != 3) {
            L = i14;
        } else {
            L = org.telegram.messenger.g0.L(180.0f);
        }
        if (this.f30618e) {
            i11 = org.telegram.messenger.g0.L(12.0f);
        } else {
            i11 = 0;
        }
        int i16 = i11 + L;
        if (this.f30619f) {
            f10 = 12.0f;
        }
        setMeasuredDimension(size, org.telegram.messenger.g0.L(f10) + i16);
        while (true) {
            int i17 = this.d;
            if (i13 < i17) {
                sa saVar = this.f30617c[i13];
                if (i13 == i17 - 1) {
                    i12 = L2;
                } else {
                    i12 = i14;
                }
                saVar.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(L, 1073741824));
                L2 -= i14;
                i13++;
            } else {
                return;
            }
        }
    }

    public void setSize(int i3) {
        if (this.f30615a != i3) {
            this.f30615a = i3;
            requestLayout();
        }
    }

    @Override
    public final void updateColors() {
        try {
            this.f30622s.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zi, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
