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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.CheckBox;
public abstract class za extends FrameLayout {
    public int f26048a;
    public boolean f26049b;
    public final ya[] f26050c;
    public int d;
    public boolean f26051e;
    public boolean f26052f;
    public int h;
    public final Paint f26053n;
    public final Paint f26054r;
    public final Paint f26055s;
    public final Drawable v;

    public za(Context context, int i9) {
        super(context);
        this.f26049b = true;
        this.d = 3;
        this.f26050c = new ya[i9];
        int i10 = 0;
        while (true) {
            ya[] yaVarArr = this.f26050c;
            if (i10 < yaVarArr.length) {
                ya yaVar = new ya(this, context);
                yaVarArr[i10] = yaVar;
                addView(yaVar);
                yaVar.setOnClickListener(new fh.a3(this, yaVar, i10, 4));
                yaVar.setOnLongClickListener(new fh.r2(this, yaVar, i10));
                i10++;
            } else {
                Paint paint = new Paint();
                this.f26053n = paint;
                paint.setColor(855638016);
                this.f26054r = new Paint(1);
                this.v = context.getResources().getDrawable(R.drawable.background_selected).mutate();
                Paint paint2 = new Paint();
                this.f26055s = paint2;
                paint2.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Lh, false));
                return;
            }
        }
    }

    public abstract void a(int i9, Object obj);

    public boolean b(Object obj, int i9) {
        return false;
    }

    public final void c(int i9, boolean z10, boolean z11) {
        float f10;
        float f11;
        ya yaVar = this.f26050c[i9];
        ih.d4 d4Var = yaVar.f26000a;
        CheckBox checkBox = yaVar.f26002c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z10, z11);
        AnimatorSet animatorSet = yaVar.f26004f;
        if (animatorSet != null) {
            animatorSet.cancel();
            yaVar.f26004f = null;
        }
        float f12 = 1.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            yaVar.f26004f = animatorSet2;
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
            yaVar.f26004f.setDuration(200L);
            yaVar.f26004f.addListener(new hg.b0(25, yaVar, z10));
            yaVar.f26004f.start();
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
        yaVar.invalidate();
    }

    public final void d(int i9, boolean z10, boolean z11) {
        int i10;
        this.d = i9;
        this.f26051e = z10;
        this.f26052f = z11;
        int i11 = 0;
        while (true) {
            ya[] yaVarArr = this.f26050c;
            if (i11 < yaVarArr.length) {
                ya yaVar = yaVarArr[i11];
                if (i11 < i9) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                yaVar.setVisibility(i10);
                yaVarArr[i11].clearAnimation();
                i11++;
            } else {
                return;
            }
        }
    }

    public final void e(int i9, Object obj, Object obj2, int i10) {
        this.h = i9;
        ya[] yaVarArr = this.f26050c;
        if (obj == null) {
            yaVarArr[i10].setVisibility(8);
            yaVarArr[i10].clearAnimation();
            return;
        }
        yaVarArr[i10].setVisibility(0);
        yaVarArr[i10].a(obj, obj2);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        for (int i9 = 0; i9 < this.d; i9++) {
            this.f26050c[i9].invalidate();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        if (this.d == 1) {
            super.onLayout(z10, i9, i10, i11, i12);
            return;
        }
        int dp = AndroidUtilities.dp(14.0f);
        if (this.f26051e) {
            i13 = AndroidUtilities.dp(14.0f);
        } else {
            i13 = 0;
        }
        for (int i14 = 0; i14 < this.d; i14++) {
            ya[] yaVarArr = this.f26050c;
            int measuredWidth = yaVarArr[i14].getMeasuredWidth();
            ya yaVar = yaVarArr[i14];
            yaVar.layout(dp, i13, dp + measuredWidth, yaVar.getMeasuredHeight() + i13);
            dp = org.telegram.messenger.l0.C(6.0f, measuredWidth, dp);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int dp;
        int i11;
        int i12;
        float f10 = 6.0f;
        int i13 = 0;
        if (this.d == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f26048a, 1073741824), ll.C(6.0f, this.f26048a, 1073741824));
            setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i9);
        int dp2 = size - AndroidUtilities.dp(e2.c.e(this.d, 1, 6, 28));
        int i14 = dp2 / this.d;
        int i15 = this.h;
        if (i15 != 0 && i15 != 2 && i15 != 3) {
            dp = i14;
        } else {
            dp = AndroidUtilities.dp(180.0f);
        }
        if (this.f26051e) {
            i11 = AndroidUtilities.dp(14.0f);
        } else {
            i11 = 0;
        }
        int i16 = i11 + dp;
        if (this.f26052f) {
            f10 = 14.0f;
        }
        setMeasuredDimension(size, AndroidUtilities.dp(f10) + i16);
        while (true) {
            int i17 = this.d;
            if (i13 < i17) {
                ya yaVar = this.f26050c[i13];
                if (i13 == i17 - 1) {
                    i12 = dp2;
                } else {
                    i12 = i14;
                }
                yaVar.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                dp2 -= i14;
                i13++;
            } else {
                return;
            }
        }
    }

    public void setSize(int i9) {
        if (this.f26048a != i9) {
            this.f26048a = i9;
            requestLayout();
        }
    }
}
