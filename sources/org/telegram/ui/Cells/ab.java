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
import org.telegram.messenger.nk;
import org.telegram.ui.Components.CheckBox;
public abstract class ab extends FrameLayout {
    public int f22022a;
    public boolean f22023b;
    public final za[] f22024c;
    public int d;
    public boolean e;
    public boolean f22025f;
    public int h;
    public final Paint f22026n;
    public final Paint f22027r;
    public final Paint f22028s;
    public final Drawable v;

    public ab(Context context, int i10) {
        super(context);
        this.f22023b = true;
        this.d = 3;
        this.f22024c = new za[i10];
        int i11 = 0;
        while (true) {
            za[] zaVarArr = this.f22024c;
            if (i11 < zaVarArr.length) {
                za zaVar = new za(this, context);
                zaVarArr[i11] = zaVar;
                addView(zaVar);
                zaVar.setOnClickListener(new ai.ha(this, zaVar, i11, 2));
                zaVar.setOnLongClickListener(new ya(this, zaVar, i11));
                i11++;
            } else {
                Paint paint = new Paint();
                this.f22026n = paint;
                paint.setColor(855638016);
                this.f22027r = new Paint(1);
                this.v = context.getResources().getDrawable(R.drawable.background_selected).mutate();
                Paint paint2 = new Paint();
                this.f22028s = paint2;
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
        za zaVar = this.f22024c[i10];
        ci.k4 k4Var = zaVar.f23891a;
        CheckBox checkBox = zaVar.f23893c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z10, z11);
        AnimatorSet animatorSet = zaVar.f23894f;
        if (animatorSet != null) {
            animatorSet.cancel();
            zaVar.f23894f = null;
        }
        float f11 = 1.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            zaVar.f23894f = animatorSet2;
            if (z10) {
                f10 = 0.8875f;
            } else {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(k4Var, "scaleX", f10);
            if (z10) {
                f11 = 0.8875f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(k4Var, "scaleY", f11));
            zaVar.f23894f.setDuration(200L);
            zaVar.f23894f.addListener(new ah.p0(26, zaVar, z10));
            zaVar.f23894f.start();
        } else {
            if (z10) {
                f7 = 0.8875f;
            } else {
                f7 = 1.0f;
            }
            k4Var.setScaleX(f7);
            if (z10) {
                f11 = 0.8875f;
            }
            k4Var.setScaleY(f11);
        }
        zaVar.invalidate();
    }

    public final void d(int i10, boolean z10, boolean z11) {
        int i11;
        this.d = i10;
        this.e = z10;
        this.f22025f = z11;
        int i12 = 0;
        while (true) {
            za[] zaVarArr = this.f22024c;
            if (i12 < zaVarArr.length) {
                za zaVar = zaVarArr[i12];
                if (i12 < i10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                zaVar.setVisibility(i11);
                zaVarArr[i12].clearAnimation();
                i12++;
            } else {
                return;
            }
        }
    }

    public final void e(int i10, Object obj, Object obj2, int i11) {
        this.h = i10;
        za[] zaVarArr = this.f22024c;
        if (obj == null) {
            zaVarArr[i11].setVisibility(8);
            zaVarArr[i11].clearAnimation();
            return;
        }
        zaVarArr[i11].setVisibility(0);
        zaVarArr[i11].a(obj, obj2);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        for (int i10 = 0; i10 < this.d; i10++) {
            this.f22024c[i10].invalidate();
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
            za[] zaVarArr = this.f22024c;
            int measuredWidth = zaVarArr[i15].getMeasuredWidth();
            za zaVar = zaVarArr[i15];
            zaVar.layout(dp, i14, dp + measuredWidth, zaVar.getMeasuredHeight() + i14);
            dp = org.telegram.messenger.g0.C(6.0f, measuredWidth, dp);
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
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f22022a, 1073741824), nk.C(6.0f, this.f22022a, 1073741824));
            setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int dp2 = size - AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(this.d, 1, 6, 28));
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
        if (this.f22025f) {
            f7 = 14.0f;
        }
        setMeasuredDimension(size, AndroidUtilities.dp(f7) + i17);
        while (true) {
            int i18 = this.d;
            if (i14 < i18) {
                za zaVar = this.f22024c[i14];
                if (i14 == i18 - 1) {
                    i13 = dp2;
                } else {
                    i13 = i15;
                }
                zaVar.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                dp2 -= i15;
                i14++;
            } else {
                return;
            }
        }
    }

    public void setSize(int i10) {
        if (this.f22022a != i10) {
            this.f22022a = i10;
            requestLayout();
        }
    }
}
