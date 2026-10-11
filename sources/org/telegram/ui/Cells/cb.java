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
import org.telegram.messenger.ai;
import org.telegram.ui.Components.CheckBox;
public abstract class cb extends FrameLayout {
    public int f21940a;
    public boolean f21941b;
    public final bb[] f21942c;
    public int d;
    public boolean f21943e;
    public boolean f21944f;
    public int h;
    public final Paint f21945n;
    public final Paint f21946r;
    public final Paint f21947s;
    public final Drawable v;

    public cb(Context context, int i10) {
        super(context);
        this.f21941b = true;
        this.d = 3;
        this.f21942c = new bb[i10];
        int i11 = 0;
        while (true) {
            bb[] bbVarArr = this.f21942c;
            if (i11 < bbVarArr.length) {
                bb bbVar = new bb(this, context);
                bbVarArr[i11] = bbVar;
                addView(bbVar);
                bbVar.setOnClickListener(new sa(this, bbVar, i11, 1));
                bbVar.setOnLongClickListener(new ab(this, bbVar, i11));
                i11++;
            } else {
                Paint paint = new Paint();
                this.f21945n = paint;
                paint.setColor(855638016);
                this.f21946r = new Paint(1);
                this.v = context.getResources().getDrawable(R.drawable.background_selected).mutate();
                Paint paint2 = new Paint();
                this.f21947s = paint2;
                paint2.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Lh, false));
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
        bb bbVar = this.f21942c[i10];
        ai.z5 z5Var = bbVar.f21881a;
        CheckBox checkBox = bbVar.f21883c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z10, z11);
        AnimatorSet animatorSet = bbVar.f21885f;
        if (animatorSet != null) {
            animatorSet.cancel();
            bbVar.f21885f = null;
        }
        float f11 = 1.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            bbVar.f21885f = animatorSet2;
            if (z10) {
                f10 = 0.8875f;
            } else {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z5Var, "scaleX", f10);
            if (z10) {
                f11 = 0.8875f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(z5Var, "scaleY", f11));
            bbVar.f21885f.setDuration(200L);
            bbVar.f21885f.addListener(new ai.n(25, bbVar, z10));
            bbVar.f21885f.start();
        } else {
            if (z10) {
                f7 = 0.8875f;
            } else {
                f7 = 1.0f;
            }
            z5Var.setScaleX(f7);
            if (z10) {
                f11 = 0.8875f;
            }
            z5Var.setScaleY(f11);
        }
        bbVar.invalidate();
    }

    public final void d(int i10, boolean z10, boolean z11) {
        int i11;
        this.d = i10;
        this.f21943e = z10;
        this.f21944f = z11;
        int i12 = 0;
        while (true) {
            bb[] bbVarArr = this.f21942c;
            if (i12 < bbVarArr.length) {
                bb bbVar = bbVarArr[i12];
                if (i12 < i10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                bbVar.setVisibility(i11);
                bbVarArr[i12].clearAnimation();
                i12++;
            } else {
                return;
            }
        }
    }

    public final void e(int i10, Object obj, Object obj2, int i11) {
        this.h = i10;
        bb[] bbVarArr = this.f21942c;
        if (obj == null) {
            bbVarArr[i11].setVisibility(8);
            bbVarArr[i11].clearAnimation();
            return;
        }
        bbVarArr[i11].setVisibility(0);
        bbVarArr[i11].a(obj, obj2);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        for (int i10 = 0; i10 < this.d; i10++) {
            this.f21942c[i10].invalidate();
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
        if (this.f21943e) {
            i14 = AndroidUtilities.dp(14.0f);
        } else {
            i14 = 0;
        }
        for (int i15 = 0; i15 < this.d; i15++) {
            bb[] bbVarArr = this.f21942c;
            int measuredWidth = bbVarArr[i15].getMeasuredWidth();
            bb bbVar = bbVarArr[i15];
            bbVar.layout(dp, i14, dp + measuredWidth, bbVar.getMeasuredHeight() + i14);
            dp = org.telegram.messenger.q.C(6.0f, measuredWidth, dp);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int i12;
        int i13;
        float f7 = 6.0f;
        int i14 = 0;
        if (this.d == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f21940a, 1073741824), ai.C(6.0f, this.f21940a, 1073741824));
            setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int dp2 = size - AndroidUtilities.dp(hg.c.f(this.d, 1, 6, 28));
        int i15 = dp2 / this.d;
        int i16 = this.h;
        if (i16 != 0 && i16 != 2 && i16 != 3) {
            dp = i15;
        } else {
            dp = AndroidUtilities.dp(180.0f);
        }
        if (this.f21943e) {
            i12 = AndroidUtilities.dp(14.0f);
        } else {
            i12 = 0;
        }
        int i17 = i12 + dp;
        if (this.f21944f) {
            f7 = 14.0f;
        }
        setMeasuredDimension(size, AndroidUtilities.dp(f7) + i17);
        while (true) {
            int i18 = this.d;
            if (i14 < i18) {
                bb bbVar = this.f21942c[i14];
                if (i14 == i18 - 1) {
                    i13 = dp2;
                } else {
                    i13 = i15;
                }
                bbVar.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                dp2 -= i15;
                i14++;
            } else {
                return;
            }
        }
    }

    public void setSize(int i10) {
        if (this.f21940a != i10) {
            this.f21940a = i10;
            requestLayout();
        }
    }
}
