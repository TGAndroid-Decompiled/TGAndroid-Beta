package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.sl;
import org.telegram.ui.Components.CheckBox;
public abstract class bb extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public int f22189a;
    public boolean f22190b;
    public final ab[] f22191c;
    public int d;
    public boolean e;
    public boolean f22192f;
    public int h;
    public final Paint f22193n;
    public final Paint f22194r;
    public final Paint f22195s;
    public final Drawable v;

    public bb(Context context, int i10) {
        super(context);
        this.f22190b = true;
        this.d = 3;
        this.f22191c = new ab[i10];
        int i11 = 0;
        while (true) {
            ab[] abVarArr = this.f22191c;
            if (i11 < abVarArr.length) {
                ab abVar = new ab(this, context);
                abVarArr[i11] = abVar;
                addView(abVar);
                abVar.setOnClickListener(new ai.ia(this, abVar, i11, 2));
                abVar.setOnLongClickListener(new za(this, abVar, i11));
                i11++;
            } else {
                Paint paint = new Paint();
                this.f22193n = paint;
                paint.setColor(855638016);
                this.f22194r = new Paint(1);
                this.v = context.getResources().getDrawable(R.drawable.background_selected).mutate();
                Paint paint2 = new Paint();
                this.f22195s = paint2;
                paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Lh, false));
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
        ab abVar = this.f22191c[i10];
        ci.j4 j4Var = abVar.f22108a;
        CheckBox checkBox = abVar.f22110c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z10, z11);
        AnimatorSet animatorSet = abVar.f22111f;
        if (animatorSet != null) {
            animatorSet.cancel();
            abVar.f22111f = null;
        }
        float f11 = 1.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            abVar.f22111f = animatorSet2;
            if (z10) {
                f10 = 0.8875f;
            } else {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(j4Var, "scaleX", f10);
            if (z10) {
                f11 = 0.8875f;
            }
            animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(j4Var, "scaleY", f11));
            abVar.f22111f.setDuration(200L);
            abVar.f22111f.addListener(new ah.p0(26, abVar, z10));
            abVar.f22111f.start();
        } else {
            if (z10) {
                f7 = 0.8875f;
            } else {
                f7 = 1.0f;
            }
            j4Var.setScaleX(f7);
            if (z10) {
                f11 = 0.8875f;
            }
            j4Var.setScaleY(f11);
        }
        abVar.invalidate();
    }

    public final void d(int i10, boolean z10, boolean z11) {
        int i11;
        this.d = i10;
        this.e = z10;
        this.f22192f = z11;
        int i12 = 0;
        while (true) {
            ab[] abVarArr = this.f22191c;
            if (i12 < abVarArr.length) {
                ab abVar = abVarArr[i12];
                if (i12 < i10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                abVar.setVisibility(i11);
                abVarArr[i12].clearAnimation();
                i12++;
            } else {
                return;
            }
        }
    }

    public final void e(int i10, Object obj, Object obj2, int i11) {
        this.h = i10;
        ab[] abVarArr = this.f22191c;
        if (obj == null) {
            abVarArr[i11].setVisibility(8);
            abVarArr[i11].clearAnimation();
            return;
        }
        abVarArr[i11].setVisibility(0);
        abVarArr[i11].a(obj, obj2);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        for (int i10 = 0; i10 < this.d; i10++) {
            this.f22191c[i10].invalidate();
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
            ab[] abVarArr = this.f22191c;
            int measuredWidth = abVarArr[i15].getMeasuredWidth();
            ab abVar = abVarArr[i15];
            abVar.layout(dp, i14, dp + measuredWidth, abVar.getMeasuredHeight() + i14);
            dp = org.telegram.messenger.v0.C(6.0f, measuredWidth, dp);
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
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f22189a, 1073741824), sl.C(6.0f, this.f22189a, 1073741824));
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
        if (this.f22192f) {
            f7 = 14.0f;
        }
        setMeasuredDimension(size, AndroidUtilities.dp(f7) + i17);
        while (true) {
            int i18 = this.d;
            if (i14 < i18) {
                ab abVar = this.f22191c[i14];
                if (i14 == i18 - 1) {
                    i13 = dp2;
                } else {
                    i13 = i15;
                }
                abVar.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                dp2 -= i15;
                i14++;
            } else {
                return;
            }
        }
    }

    public void setSize(int i10) {
        if (this.f22189a != i10) {
            this.f22189a = i10;
            requestLayout();
        }
    }

    @Override
    public final void updateColors() {
        try {
            this.f22195s.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Lh, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
