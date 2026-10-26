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
import org.telegram.messenger.vh;
import org.telegram.ui.Components.CheckBox;
public abstract class fb extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public int f24123a;
    public boolean f24124b;
    public final eb[] f24125c;
    public int d;
    public boolean e;
    public boolean f24126f;
    public int h;
    public final Paint f24127n;
    public final Paint f24128r;
    public final Paint f24129s;
    public final Drawable v;

    public fb(Context context, int i10) {
        super(context);
        this.f24124b = true;
        this.d = 3;
        this.f24125c = new eb[i10];
        int i11 = 0;
        while (true) {
            eb[] ebVarArr = this.f24125c;
            if (i11 < ebVarArr.length) {
                eb ebVar = new eb(this, context);
                ebVarArr[i11] = ebVar;
                ebVar.setClipToOutline(true);
                addView(ebVar);
                ebVar.setOnClickListener(new bi.pa(this, ebVar, i11, 3));
                ebVar.setOnLongClickListener(new db(this, ebVar, i11));
                i11++;
            } else {
                Paint paint = new Paint();
                this.f24127n = paint;
                paint.setColor(855638016);
                this.f24128r = new Paint(1);
                this.v = context.getResources().getDrawable(R.drawable.background_selected).mutate();
                Paint paint2 = new Paint();
                this.f24129s = paint2;
                paint2.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Lh, false));
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
        eb ebVar = this.f24125c[i10];
        di.k4 k4Var = ebVar.f24044a;
        CheckBox checkBox = ebVar.f24046c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z10, z11);
        AnimatorSet animatorSet = ebVar.f24047f;
        if (animatorSet != null) {
            animatorSet.cancel();
            ebVar.f24047f = null;
        }
        float f11 = 1.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            ebVar.f24047f = animatorSet2;
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
            ebVar.f24047f.setDuration(200L);
            ebVar.f24047f.addListener(new bh.f0(26, ebVar, z10));
            ebVar.f24047f.start();
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
        this.f24126f = z11;
        int i12 = 0;
        while (true) {
            eb[] ebVarArr = this.f24125c;
            if (i12 < ebVarArr.length) {
                ag.y0 y0Var = null;
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
                    ag.v0 v0Var = ag.z0.f1400a;
                    if ((!z12 && !z13) || (!z10 && !z11)) {
                        z14 = z10;
                        z15 = z11;
                    } else {
                        z14 = z10;
                        z15 = z11;
                        y0Var = new ag.y0(dp, z12, z14, z13, z15);
                    }
                    ebVar.setOutlineProvider(y0Var);
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
        eb[] ebVarArr = this.f24125c;
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
            this.f24125c[i10].invalidate();
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
            eb[] ebVarArr = this.f24125c;
            int measuredWidth = ebVarArr[i15].getMeasuredWidth();
            eb ebVar = ebVarArr[i15];
            ebVar.layout(dp, i14, dp + measuredWidth, ebVar.getMeasuredHeight() + i14);
            dp = org.telegram.messenger.t.D(3.0f, measuredWidth, dp);
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
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f24123a, 1073741824), vh.D(3.0f, this.f24123a, 1073741824));
            setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int dp2 = size - AndroidUtilities.dp(c3.h0.w(this.d, 1, 3, 24));
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
        if (this.f24126f) {
            f7 = 12.0f;
        }
        setMeasuredDimension(size, AndroidUtilities.dp(f7) + i17);
        while (true) {
            int i18 = this.d;
            if (i14 < i18) {
                eb ebVar = this.f24125c[i14];
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
        if (this.f24123a != i10) {
            this.f24123a = i10;
            requestLayout();
        }
    }

    @Override
    public final void updateColors() {
        try {
            this.f24129s.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Lh, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
