package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.CheckBox;
public abstract class wa extends FrameLayout {
    public int f25888a;
    public boolean f25889b;
    public final va[] f25890c;
    public int d;
    public boolean f25891e;
    public boolean f25892f;
    public int h;
    public final Paint f25893n;
    public final Paint f25894r;
    public final Paint f25895s;
    public final Drawable v;

    public wa(Context context, int i10) {
        super(context);
        this.f25889b = true;
        this.d = 3;
        this.f25890c = new va[i10];
        int i11 = 0;
        while (true) {
            va[] vaVarArr = this.f25890c;
            if (i11 < vaVarArr.length) {
                va vaVar = new va(this, context);
                vaVarArr[i11] = vaVar;
                addView(vaVar);
                vaVar.setOnClickListener(new bg.p2(this, vaVar, i11, 5));
                vaVar.setOnLongClickListener(new ih.j2(this, vaVar, i11));
                i11++;
            } else {
                Paint paint = new Paint();
                this.f25893n = paint;
                paint.setColor(855638016);
                this.f25894r = new Paint(1);
                this.v = context.getResources().getDrawable(R.drawable.background_selected).mutate();
                Paint paint2 = new Paint();
                this.f25895s = paint2;
                paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Lh, false));
                return;
            }
        }
    }

    public abstract void a(int i10, Object obj);

    public boolean b(Object obj, int i10) {
        return false;
    }

    public final void c(int i10, boolean z10, boolean z11) {
        float f9;
        float f10;
        va vaVar = this.f25890c[i10];
        lh.y3 y3Var = vaVar.f25843a;
        CheckBox checkBox = vaVar.f25845c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z10, z11);
        AnimatorSet animatorSet = vaVar.f25847f;
        if (animatorSet != null) {
            animatorSet.cancel();
            vaVar.f25847f = null;
        }
        float f11 = 1.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            vaVar.f25847f = animatorSet2;
            if (z10) {
                f10 = 0.8875f;
            } else {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y3Var, "scaleX", f10);
            if (z10) {
                f11 = 0.8875f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(y3Var, "scaleY", f11));
            vaVar.f25847f.setDuration(200L);
            vaVar.f25847f.addListener(new bg.z2(25, vaVar, z10));
            vaVar.f25847f.start();
        } else {
            if (z10) {
                f9 = 0.8875f;
            } else {
                f9 = 1.0f;
            }
            y3Var.setScaleX(f9);
            if (z10) {
                f11 = 0.8875f;
            }
            y3Var.setScaleY(f11);
        }
        vaVar.invalidate();
    }

    public final void d(int i10, boolean z10, boolean z11) {
        int i11;
        this.d = i10;
        this.f25891e = z10;
        this.f25892f = z11;
        int i12 = 0;
        while (true) {
            va[] vaVarArr = this.f25890c;
            if (i12 < vaVarArr.length) {
                va vaVar = vaVarArr[i12];
                if (i12 < i10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                vaVar.setVisibility(i11);
                vaVarArr[i12].clearAnimation();
                i12++;
            } else {
                return;
            }
        }
    }

    public final void e(int i10, Object obj, Object obj2, int i11) {
        this.h = i10;
        va[] vaVarArr = this.f25890c;
        if (obj == null) {
            vaVarArr[i11].setVisibility(8);
            vaVarArr[i11].clearAnimation();
            return;
        }
        vaVarArr[i11].setVisibility(0);
        vaVarArr[i11].a(obj, obj2);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        for (int i10 = 0; i10 < this.d; i10++) {
            this.f25890c[i10].invalidate();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        if (this.d == 1) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int dp = AndroidUtilities.dp(14.0f);
        if (this.f25891e) {
            i14 = AndroidUtilities.dp(14.0f);
        } else {
            i14 = 0;
        }
        for (int i15 = 0; i15 < this.d; i15++) {
            va[] vaVarArr = this.f25890c;
            int measuredWidth = vaVarArr[i15].getMeasuredWidth();
            va vaVar = vaVarArr[i15];
            vaVar.layout(dp, i14, dp + measuredWidth, vaVar.getMeasuredHeight() + i14);
            dp = org.telegram.messenger.x3.C(6.0f, measuredWidth, dp);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int i12;
        int i13;
        float f9 = 6.0f;
        int i14 = 0;
        if (this.d == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f25888a, 1073741824), org.telegram.ui.b.B(6.0f, this.f25888a, 1073741824));
            setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int dp2 = size - AndroidUtilities.dp(com.google.android.recaptcha.internal.a.f(this.d, 1, 6, 28));
        int i15 = dp2 / this.d;
        int i16 = this.h;
        if (i16 != 0 && i16 != 2 && i16 != 3) {
            dp = i15;
        } else {
            dp = AndroidUtilities.dp(180.0f);
        }
        if (this.f25891e) {
            i12 = AndroidUtilities.dp(14.0f);
        } else {
            i12 = 0;
        }
        int i17 = i12 + dp;
        if (this.f25892f) {
            f9 = 14.0f;
        }
        setMeasuredDimension(size, AndroidUtilities.dp(f9) + i17);
        while (true) {
            int i18 = this.d;
            if (i14 < i18) {
                va vaVar = this.f25890c[i14];
                if (i14 == i18 - 1) {
                    i13 = dp2;
                } else {
                    i13 = i15;
                }
                vaVar.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                dp2 -= i15;
                i14++;
            } else {
                return;
            }
        }
    }

    public void setSize(int i10) {
        if (this.f25888a != i10) {
            this.f25888a = i10;
            requestLayout();
        }
    }
}
