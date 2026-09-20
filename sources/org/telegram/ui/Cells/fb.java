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
import org.telegram.messenger.rk;
import org.telegram.ui.Components.CheckBox;
public abstract class fb extends FrameLayout {
    public int f20311a;
    public boolean f20312b;
    public final eb[] f20313c;
    public int d;
    public boolean e;
    public boolean f20314f;
    public int h;
    public final Paint f20315n;
    public final Paint f20316r;
    public final Paint f20317s;
    public final Drawable v;

    public fb(Context context, int i10) {
        super(context);
        this.f20312b = true;
        this.d = 3;
        this.f20313c = new eb[i10];
        int i11 = 0;
        while (true) {
            eb[] ebVarArr = this.f20313c;
            if (i11 < ebVarArr.length) {
                eb ebVar = new eb(this, context);
                ebVarArr[i11] = ebVar;
                ebVar.setClipToOutline(true);
                addView(ebVar);
                ebVar.setOnClickListener(new va(this, ebVar, i11, 1));
                ebVar.setOnLongClickListener(new db(this, ebVar, i11));
                i11++;
            } else {
                Paint paint = new Paint();
                this.f20315n = paint;
                paint.setColor(855638016);
                this.f20316r = new Paint(1);
                this.v = context.getResources().getDrawable(R.drawable.background_selected).mutate();
                Paint paint2 = new Paint();
                this.f20317s = paint2;
                paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lh, false));
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
        eb ebVar = this.f20313c[i10];
        ai.z5 z5Var = ebVar.f20244a;
        CheckBox checkBox = ebVar.f20246c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z10, z11);
        AnimatorSet animatorSet = ebVar.f20247f;
        if (animatorSet != null) {
            animatorSet.cancel();
            ebVar.f20247f = null;
        }
        float f11 = 1.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            ebVar.f20247f = animatorSet2;
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
            ebVar.f20247f.setDuration(200L);
            ebVar.f20247f.addListener(new ai.n(25, ebVar, z10));
            ebVar.f20247f.start();
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
        ebVar.invalidate();
    }

    public final void d(int i10, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i11;
        this.d = i10;
        this.e = z10;
        this.f20314f = z11;
        int i12 = 0;
        while (true) {
            eb[] ebVarArr = this.f20313c;
            if (i12 < ebVarArr.length) {
                yf.i0 i0Var = null;
                if ((!z10 && !z11) || (i12 != 0 && i12 != i10 - 1)) {
                    ebVarArr[i12].setOutlineProvider(null);
                    z14 = z10;
                    z15 = z11;
                } else {
                    eb ebVar = ebVarArr[i12];
                    int dp = AndroidUtilities.dp(16.0f);
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
                    ai.k2 k2Var = yf.j0.f47140a;
                    if ((!z12 && !z13) || (!z10 && !z11)) {
                        z14 = z10;
                        z15 = z11;
                    } else {
                        z14 = z10;
                        z15 = z11;
                        i0Var = new yf.i0(dp, z12, z14, z13, z15);
                    }
                    ebVar.setOutlineProvider(i0Var);
                }
                eb ebVar2 = ebVarArr[i12];
                if (i12 < i10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                ebVar2.setVisibility(i11);
                ebVarArr[i12].clearAnimation();
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
        eb[] ebVarArr = this.f20313c;
        if (obj == null) {
            ebVarArr[i11].setVisibility(8);
            ebVarArr[i11].clearAnimation();
            return;
        }
        ebVarArr[i11].setVisibility(0);
        ebVarArr[i11].a(obj, obj2);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        for (int i10 = 0; i10 < this.d; i10++) {
            this.f20313c[i10].invalidate();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        if (this.d == 1) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int dp = AndroidUtilities.dp(12.0f);
        if (this.e) {
            i14 = AndroidUtilities.dp(12.0f);
        } else {
            i14 = 0;
        }
        for (int i15 = 0; i15 < this.d; i15++) {
            eb[] ebVarArr = this.f20313c;
            int measuredWidth = ebVarArr[i15].getMeasuredWidth();
            eb ebVar = ebVarArr[i15];
            ebVar.layout(dp, i14, dp + measuredWidth, ebVar.getMeasuredHeight() + i14);
            dp = org.telegram.messenger.l0.C(3.0f, measuredWidth, dp);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        int i12;
        int i13;
        float f7 = 3.0f;
        int i14 = 0;
        if (this.d == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f20311a, 1073741824), rk.C(3.0f, this.f20311a, 1073741824));
            setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int dp2 = size - AndroidUtilities.dp(hg.k0.f(this.d, 1, 3, 24));
        int i15 = dp2 / this.d;
        int i16 = this.h;
        if (i16 != 0 && i16 != 2 && i16 != 3) {
            dp = i15;
        } else {
            dp = AndroidUtilities.dp(180.0f);
        }
        if (this.e) {
            i12 = AndroidUtilities.dp(12.0f);
        } else {
            i12 = 0;
        }
        int i17 = i12 + dp;
        if (this.f20314f) {
            f7 = 12.0f;
        }
        setMeasuredDimension(size, AndroidUtilities.dp(f7) + i17);
        while (true) {
            int i18 = this.d;
            if (i14 < i18) {
                eb ebVar = this.f20313c[i14];
                if (i14 == i18 - 1) {
                    i13 = dp2;
                } else {
                    i13 = i15;
                }
                ebVar.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                dp2 -= i15;
                i14++;
            } else {
                return;
            }
        }
    }

    public void setSize(int i10) {
        if (this.f20311a != i10) {
            this.f20311a = i10;
            requestLayout();
        }
    }
}
