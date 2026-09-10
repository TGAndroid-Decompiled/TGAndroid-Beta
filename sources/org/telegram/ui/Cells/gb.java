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
import org.telegram.messenger.em;
import org.telegram.ui.Components.CheckBox;
public abstract class gb extends FrameLayout {
    public int f19229a;
    public boolean f19230b;
    public final fb[] f19231c;
    public int d;
    public boolean e;
    public boolean f19232f;
    public int h;
    public final Paint f19233n;
    public final Paint f19234r;
    public final Paint f19235s;
    public final Drawable v;

    public gb(Context context, int i10) {
        super(context);
        this.f19230b = true;
        this.d = 3;
        this.f19231c = new fb[i10];
        int i11 = 0;
        while (true) {
            fb[] fbVarArr = this.f19231c;
            if (i11 < fbVarArr.length) {
                fb fbVar = new fb(this, context);
                fbVarArr[i11] = fbVar;
                addView(fbVar);
                fbVar.setOnClickListener(new wa(this, fbVar, i11, 1));
                fbVar.setOnLongClickListener(new eb(this, fbVar, i11));
                i11++;
            } else {
                Paint paint = new Paint();
                this.f19233n = paint;
                paint.setColor(855638016);
                this.f19234r = new Paint(1);
                this.v = context.getResources().getDrawable(R.drawable.background_selected).mutate();
                Paint paint2 = new Paint();
                this.f19235s = paint2;
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
        fb fbVar = this.f19231c[i10];
        gg.i1 i1Var = fbVar.f19169a;
        CheckBox checkBox = fbVar.f19171c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z10, z11);
        AnimatorSet animatorSet = fbVar.f19172f;
        if (animatorSet != null) {
            animatorSet.cancel();
            fbVar.f19172f = null;
        }
        float f11 = 1.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            fbVar.f19172f = animatorSet2;
            if (z10) {
                f10 = 0.8875f;
            } else {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(i1Var, "scaleX", f10);
            if (z10) {
                f11 = 0.8875f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(i1Var, "scaleY", f11));
            fbVar.f19172f.setDuration(200L);
            fbVar.f19172f.addListener(new ai.e(21, fbVar, z10));
            fbVar.f19172f.start();
        } else {
            if (z10) {
                f7 = 0.8875f;
            } else {
                f7 = 1.0f;
            }
            i1Var.setScaleX(f7);
            if (z10) {
                f11 = 0.8875f;
            }
            i1Var.setScaleY(f11);
        }
        fbVar.invalidate();
    }

    public final void d(int i10, boolean z10, boolean z11) {
        int i11;
        this.d = i10;
        this.e = z10;
        this.f19232f = z11;
        int i12 = 0;
        while (true) {
            fb[] fbVarArr = this.f19231c;
            if (i12 < fbVarArr.length) {
                fb fbVar = fbVarArr[i12];
                if (i12 < i10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                fbVar.setVisibility(i11);
                fbVarArr[i12].clearAnimation();
                i12++;
            } else {
                return;
            }
        }
    }

    public final void e(int i10, Object obj, Object obj2, int i11) {
        this.h = i10;
        fb[] fbVarArr = this.f19231c;
        if (obj == null) {
            fbVarArr[i11].setVisibility(8);
            fbVarArr[i11].clearAnimation();
            return;
        }
        fbVarArr[i11].setVisibility(0);
        fbVarArr[i11].a(obj, obj2);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        for (int i10 = 0; i10 < this.d; i10++) {
            this.f19231c[i10].invalidate();
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
        if (this.e) {
            i14 = AndroidUtilities.dp(14.0f);
        } else {
            i14 = 0;
        }
        for (int i15 = 0; i15 < this.d; i15++) {
            fb[] fbVarArr = this.f19231c;
            int measuredWidth = fbVarArr[i15].getMeasuredWidth();
            fb fbVar = fbVarArr[i15];
            fbVar.layout(dp, i14, dp + measuredWidth, fbVar.getMeasuredHeight() + i14);
            dp = org.telegram.messenger.a2.C(6.0f, measuredWidth, dp);
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
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f19229a, 1073741824), em.C(6.0f, this.f19229a, 1073741824));
            setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int dp2 = size - AndroidUtilities.dp(hc.b.B(this.d, 1, 6, 28));
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
        if (this.f19232f) {
            f7 = 14.0f;
        }
        setMeasuredDimension(size, AndroidUtilities.dp(f7) + i17);
        while (true) {
            int i18 = this.d;
            if (i14 < i18) {
                fb fbVar = this.f19231c[i14];
                if (i14 == i18 - 1) {
                    i13 = dp2;
                } else {
                    i13 = i15;
                }
                fbVar.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                dp2 -= i15;
                i14++;
            } else {
                return;
            }
        }
    }

    public void setSize(int i10) {
        if (this.f19229a != i10) {
            this.f19229a = i10;
            requestLayout();
        }
    }
}
