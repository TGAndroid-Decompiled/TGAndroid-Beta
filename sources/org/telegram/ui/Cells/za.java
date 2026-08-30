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
public abstract class za extends FrameLayout {
    public int f22706a;
    public boolean f22707b;
    public final ya[] f22708c;
    public int d;
    public boolean e;
    public boolean f22709f;
    public int h;
    public final Paint f22710n;
    public final Paint f22711r;
    public final Paint f22712s;
    public final Drawable v;

    public za(Context context, int i10) {
        super(context);
        this.f22707b = true;
        this.d = 3;
        this.f22708c = new ya[i10];
        int i11 = 0;
        while (true) {
            ya[] yaVarArr = this.f22708c;
            if (i11 < yaVarArr.length) {
                ya yaVar = new ya(this, context);
                yaVarArr[i11] = yaVar;
                addView(yaVar);
                yaVar.setOnClickListener(new dg.m2(this, yaVar, i11, 5));
                yaVar.setOnLongClickListener(new kh.j2(this, yaVar, i11));
                i11++;
            } else {
                Paint paint = new Paint();
                this.f22710n = paint;
                paint.setColor(855638016);
                this.f22711r = new Paint(1);
                this.v = context.getResources().getDrawable(R.drawable.background_selected).mutate();
                Paint paint2 = new Paint();
                this.f22712s = paint2;
                paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lh, false));
                return;
            }
        }
    }

    public abstract void a(int i10, Object obj);

    public boolean b(Object obj, int i10) {
        return false;
    }

    public final void c(int i10, boolean z4, boolean z10) {
        float f10;
        float f11;
        ya yaVar = this.f22708c[i10];
        nh.y3 y3Var = yaVar.f22633a;
        CheckBox checkBox = yaVar.f22635c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z4, z10);
        AnimatorSet animatorSet = yaVar.f22636f;
        if (animatorSet != null) {
            animatorSet.cancel();
            yaVar.f22636f = null;
        }
        float f12 = 1.0f;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            yaVar.f22636f = animatorSet2;
            if (z4) {
                f11 = 0.8875f;
            } else {
                f11 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y3Var, "scaleX", f11);
            if (z4) {
                f12 = 0.8875f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(y3Var, "scaleY", f12));
            yaVar.f22636f.setDuration(200L);
            yaVar.f22636f.addListener(new dg.w2(17, yaVar, z4));
            yaVar.f22636f.start();
        } else {
            if (z4) {
                f10 = 0.8875f;
            } else {
                f10 = 1.0f;
            }
            y3Var.setScaleX(f10);
            if (z4) {
                f12 = 0.8875f;
            }
            y3Var.setScaleY(f12);
        }
        yaVar.invalidate();
    }

    public final void d(int i10, boolean z4, boolean z10) {
        int i11;
        this.d = i10;
        this.e = z4;
        this.f22709f = z10;
        int i12 = 0;
        while (true) {
            ya[] yaVarArr = this.f22708c;
            if (i12 < yaVarArr.length) {
                ya yaVar = yaVarArr[i12];
                if (i12 < i10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                yaVar.setVisibility(i11);
                yaVarArr[i12].clearAnimation();
                i12++;
            } else {
                return;
            }
        }
    }

    public final void e(int i10, Object obj, Object obj2, int i11) {
        this.h = i10;
        ya[] yaVarArr = this.f22708c;
        if (obj == null) {
            yaVarArr[i11].setVisibility(8);
            yaVarArr[i11].clearAnimation();
            return;
        }
        yaVarArr[i11].setVisibility(0);
        yaVarArr[i11].a(obj, obj2);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        for (int i10 = 0; i10 < this.d; i10++) {
            this.f22708c[i10].invalidate();
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        if (this.d == 1) {
            super.onLayout(z4, i10, i11, i12, i13);
            return;
        }
        int dp = AndroidUtilities.dp(14.0f);
        if (this.e) {
            i14 = AndroidUtilities.dp(14.0f);
        } else {
            i14 = 0;
        }
        for (int i15 = 0; i15 < this.d; i15++) {
            ya[] yaVarArr = this.f22708c;
            int measuredWidth = yaVarArr[i15].getMeasuredWidth();
            ya yaVar = yaVarArr[i15];
            yaVar.layout(dp, i14, dp + measuredWidth, yaVar.getMeasuredHeight() + i14);
            dp = org.telegram.messenger.y3.C(6.0f, measuredWidth, dp);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int i12;
        int i13;
        float f10 = 6.0f;
        int i14 = 0;
        if (this.d == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f22706a, 1073741824), org.telegram.ui.b.B(6.0f, this.f22706a, 1073741824));
            setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int dp2 = size - AndroidUtilities.dp(e2.c.e(this.d, 1, 6, 28));
        int i15 = dp2 / this.d;
        int i16 = this.h;
        if (i16 != 0 && i16 != 2 && i16 != 3) {
            dp = i15;
        } else {
            dp = AndroidUtilities.dp(180.0f);
        }
        if (this.e) {
            i12 = AndroidUtilities.dp(14.0f);
        } else {
            i12 = 0;
        }
        int i17 = i12 + dp;
        if (this.f22709f) {
            f10 = 14.0f;
        }
        setMeasuredDimension(size, AndroidUtilities.dp(f10) + i17);
        while (true) {
            int i18 = this.d;
            if (i14 < i18) {
                ya yaVar = this.f22708c[i14];
                if (i14 == i18 - 1) {
                    i13 = dp2;
                } else {
                    i13 = i15;
                }
                yaVar.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                dp2 -= i15;
                i14++;
            } else {
                return;
            }
        }
    }

    public void setSize(int i10) {
        if (this.f22706a != i10) {
            this.f22706a = i10;
            requestLayout();
        }
    }
}
