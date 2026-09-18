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
import org.telegram.messenger.wh;
import org.telegram.ui.Components.CheckBox;
public abstract class eb extends FrameLayout {
    public int f20229a;
    public boolean f20230b;
    public final db[] f20231c;
    public int d;
    public boolean e;
    public boolean f20232f;
    public int h;
    public final Paint f20233n;
    public final Paint f20234r;
    public final Paint f20235s;
    public final Drawable v;

    public eb(Context context, int i10) {
        super(context);
        this.f20230b = true;
        this.d = 3;
        this.f20231c = new db[i10];
        int i11 = 0;
        while (true) {
            db[] dbVarArr = this.f20231c;
            if (i11 < dbVarArr.length) {
                db dbVar = new db(this, context);
                dbVarArr[i11] = dbVar;
                dbVar.setClipToOutline(true);
                addView(dbVar);
                dbVar.setOnClickListener(new ua(this, dbVar, i11, 1));
                dbVar.setOnLongClickListener(new cb(this, dbVar, i11));
                i11++;
            } else {
                Paint paint = new Paint();
                this.f20233n = paint;
                paint.setColor(855638016);
                this.f20234r = new Paint(1);
                this.v = context.getResources().getDrawable(R.drawable.background_selected).mutate();
                Paint paint2 = new Paint();
                this.f20235s = paint2;
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
        db dbVar = this.f20231c[i10];
        ai.z5 z5Var = dbVar.f20160a;
        CheckBox checkBox = dbVar.f20162c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z10, z11);
        AnimatorSet animatorSet = dbVar.f20163f;
        if (animatorSet != null) {
            animatorSet.cancel();
            dbVar.f20163f = null;
        }
        float f11 = 1.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            dbVar.f20163f = animatorSet2;
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
            dbVar.f20163f.setDuration(200L);
            dbVar.f20163f.addListener(new ai.n(25, dbVar, z10));
            dbVar.f20163f.start();
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
        dbVar.invalidate();
    }

    public final void d(int i10, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i11;
        this.d = i10;
        this.e = z10;
        this.f20232f = z11;
        int i12 = 0;
        while (true) {
            db[] dbVarArr = this.f20231c;
            if (i12 < dbVarArr.length) {
                yf.j0 j0Var = null;
                if ((!z10 && !z11) || (i12 != 0 && i12 != i10 - 1)) {
                    dbVarArr[i12].setOutlineProvider(null);
                    z14 = z10;
                    z15 = z11;
                } else {
                    db dbVar = dbVarArr[i12];
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
                    ai.k2 k2Var = yf.k0.f47097a;
                    if ((!z12 && !z13) || (!z10 && !z11)) {
                        z14 = z10;
                        z15 = z11;
                    } else {
                        z14 = z10;
                        z15 = z11;
                        j0Var = new yf.j0(dp, z12, z14, z13, z15);
                    }
                    dbVar.setOutlineProvider(j0Var);
                }
                db dbVar2 = dbVarArr[i12];
                if (i12 < i10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                dbVar2.setVisibility(i11);
                dbVarArr[i12].clearAnimation();
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
        db[] dbVarArr = this.f20231c;
        if (obj == null) {
            dbVarArr[i11].setVisibility(8);
            dbVarArr[i11].clearAnimation();
            return;
        }
        dbVarArr[i11].setVisibility(0);
        dbVarArr[i11].a(obj, obj2);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        for (int i10 = 0; i10 < this.d; i10++) {
            this.f20231c[i10].invalidate();
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
            db[] dbVarArr = this.f20231c;
            int measuredWidth = dbVarArr[i15].getMeasuredWidth();
            db dbVar = dbVarArr[i15];
            dbVar.layout(dp, i14, dp + measuredWidth, dbVar.getMeasuredHeight() + i14);
            dp = org.telegram.messenger.q.D(3.0f, measuredWidth, dp);
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
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f20229a, 1073741824), wh.C(3.0f, this.f20229a, 1073741824));
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
        if (this.f20232f) {
            f7 = 12.0f;
        }
        setMeasuredDimension(size, AndroidUtilities.dp(f7) + i17);
        while (true) {
            int i18 = this.d;
            if (i14 < i18) {
                db dbVar = this.f20231c[i14];
                if (i14 == i18 - 1) {
                    i13 = dp2;
                } else {
                    i13 = i15;
                }
                dbVar.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                dp2 -= i15;
                i14++;
            } else {
                return;
            }
        }
    }

    public void setSize(int i10) {
        if (this.f20229a != i10) {
            this.f20229a = i10;
            requestLayout();
        }
    }
}
