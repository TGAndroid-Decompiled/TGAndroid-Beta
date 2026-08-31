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
    public int f24542a;
    public boolean f24543b;
    public final ya[] f24544c;
    public int d;
    public boolean f24545e;
    public boolean f24546f;
    public int h;
    public final Paint f24547n;
    public final Paint f24548r;
    public final Paint f24549s;
    public final Drawable v;

    public za(Context context, int i10) {
        super(context);
        this.f24543b = true;
        this.d = 3;
        this.f24544c = new ya[i10];
        int i11 = 0;
        while (true) {
            ya[] yaVarArr = this.f24544c;
            if (i11 < yaVarArr.length) {
                ya yaVar = new ya(this, context);
                yaVarArr[i11] = yaVar;
                addView(yaVar);
                yaVar.setOnClickListener(new eg.k2(this, yaVar, i11, 5));
                yaVar.setOnLongClickListener(new lh.i2(this, yaVar, i11));
                i11++;
            } else {
                Paint paint = new Paint();
                this.f24547n = paint;
                paint.setColor(855638016);
                this.f24548r = new Paint(1);
                this.v = context.getResources().getDrawable(R.drawable.background_selected).mutate();
                Paint paint2 = new Paint();
                this.f24549s = paint2;
                paint2.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Lh, false));
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
        ya yaVar = this.f24544c[i10];
        oh.a4 a4Var = yaVar.f24463a;
        CheckBox checkBox = yaVar.f24465c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z4, z10);
        AnimatorSet animatorSet = yaVar.f24467f;
        if (animatorSet != null) {
            animatorSet.cancel();
            yaVar.f24467f = null;
        }
        float f12 = 1.0f;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            yaVar.f24467f = animatorSet2;
            if (z4) {
                f11 = 0.8875f;
            } else {
                f11 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a4Var, "scaleX", f11);
            if (z4) {
                f12 = 0.8875f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(a4Var, "scaleY", f12));
            yaVar.f24467f.setDuration(200L);
            yaVar.f24467f.addListener(new eg.u2(15, yaVar, z4));
            yaVar.f24467f.start();
        } else {
            if (z4) {
                f10 = 0.8875f;
            } else {
                f10 = 1.0f;
            }
            a4Var.setScaleX(f10);
            if (z4) {
                f12 = 0.8875f;
            }
            a4Var.setScaleY(f12);
        }
        yaVar.invalidate();
    }

    public final void d(int i10, boolean z4, boolean z10) {
        int i11;
        this.d = i10;
        this.f24545e = z4;
        this.f24546f = z10;
        int i12 = 0;
        while (true) {
            ya[] yaVarArr = this.f24544c;
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
        ya[] yaVarArr = this.f24544c;
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
            this.f24544c[i10].invalidate();
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
        if (this.f24545e) {
            i14 = AndroidUtilities.dp(14.0f);
        } else {
            i14 = 0;
        }
        for (int i15 = 0; i15 < this.d; i15++) {
            ya[] yaVarArr = this.f24544c;
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
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f24542a, 1073741824), org.telegram.ui.b.B(6.0f, this.f24542a, 1073741824));
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
        if (this.f24545e) {
            i12 = AndroidUtilities.dp(14.0f);
        } else {
            i12 = 0;
        }
        int i17 = i12 + dp;
        if (this.f24546f) {
            f10 = 14.0f;
        }
        setMeasuredDimension(size, AndroidUtilities.dp(f10) + i17);
        while (true) {
            int i18 = this.d;
            if (i14 < i18) {
                ya yaVar = this.f24544c[i14];
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
        if (this.f24542a != i10) {
            this.f24542a = i10;
            requestLayout();
        }
    }
}
