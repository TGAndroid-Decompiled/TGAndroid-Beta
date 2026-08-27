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
import org.telegram.messenger.rl;
import org.telegram.ui.Components.CheckBox;

public abstract class wa extends FrameLayout {

    public int f25900a;

    public boolean f25901b;

    public final va[] f25902c;
    public int d;

    public boolean f25903e;

    public boolean f25904f;
    public int h;

    public final Paint f25905n;

    public final Paint f25906r;

    public final Paint f25907s;
    public final Drawable v;

    public wa(Context context, int i10) {
        super(context);
        this.f25901b = true;
        this.d = 3;
        this.f25902c = new va[i10];
        int i11 = 0;
        while (true) {
            va[] vaVarArr = this.f25902c;
            if (i11 >= vaVarArr.length) {
                Paint paint = new Paint();
                this.f25905n = paint;
                paint.setColor(855638016);
                this.f25906r = new Paint(1);
                this.v = context.getResources().getDrawable(R.drawable.background_selected).mutate();
                Paint paint2 = new Paint();
                this.f25907s = paint2;
                paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Lh, false));
                return;
            }
            va vaVar = new va(this, context);
            vaVarArr[i11] = vaVar;
            addView(vaVar);
            vaVar.setOnClickListener(new gh.v2(this, vaVar, i11, 4));
            vaVar.setOnLongClickListener(new gh.m2(this, vaVar, i11));
            i11++;
        }
    }

    public abstract void a(int i10, Object obj);

    public boolean b(Object obj, int i10) {
        return false;
    }

    public final void c(int i10, boolean z10, boolean z11) {
        va vaVar = this.f25902c[i10];
        jh.z3 z3Var = vaVar.f25827a;
        CheckBox checkBox = vaVar.f25829c;
        if (checkBox.getVisibility() != 0) {
            checkBox.setVisibility(0);
        }
        checkBox.b(z10, z11);
        AnimatorSet animatorSet = vaVar.f25831f;
        if (animatorSet != null) {
            animatorSet.cancel();
            vaVar.f25831f = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            vaVar.f25831f = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(z3Var, "scaleX", z10 ? 0.8875f : 1.0f), ObjectAnimator.ofFloat(z3Var, "scaleY", z10 ? 0.8875f : 1.0f));
            vaVar.f25831f.setDuration(200L);
            vaVar.f25831f.addListener(new ag.x(26, vaVar, z10));
            vaVar.f25831f.start();
        } else {
            z3Var.setScaleX(z10 ? 0.8875f : 1.0f);
            z3Var.setScaleY(z10 ? 0.8875f : 1.0f);
        }
        vaVar.invalidate();
    }

    public final void d(int i10, boolean z10, boolean z11) {
        this.d = i10;
        this.f25903e = z10;
        this.f25904f = z11;
        int i11 = 0;
        while (true) {
            va[] vaVarArr = this.f25902c;
            if (i11 >= vaVarArr.length) {
                return;
            }
            vaVarArr[i11].setVisibility(i11 < i10 ? 0 : 8);
            vaVarArr[i11].clearAnimation();
            i11++;
        }
    }

    public final void e(int i10, Object obj, Object obj2, int i11) {
        this.h = i10;
        va[] vaVarArr = this.f25902c;
        if (obj == null) {
            vaVarArr[i11].setVisibility(8);
            vaVarArr[i11].clearAnimation();
        } else {
            vaVarArr[i11].setVisibility(0);
            vaVarArr[i11].a(obj, obj2);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        for (int i10 = 0; i10 < this.d; i10++) {
            this.f25902c[i10].invalidate();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.d == 1) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int iDp = AndroidUtilities.dp(14.0f);
        int iDp2 = this.f25903e ? AndroidUtilities.dp(14.0f) : 0;
        for (int i14 = 0; i14 < this.d; i14++) {
            va[] vaVarArr = this.f25902c;
            int measuredWidth = vaVarArr[i14].getMeasuredWidth();
            va vaVar = vaVarArr[i14];
            vaVar.layout(iDp, iDp2, iDp + measuredWidth, vaVar.getMeasuredHeight() + iDp2);
            iDp = org.telegram.messenger.y1.C(6.0f, measuredWidth, iDp);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = 0;
        if (this.d == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f25900a, 1073741824), rl.B(6.0f, this.f25900a, 1073741824));
            setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int iDp = size - AndroidUtilities.dp(i0.a.e(this.d, 1, 6, 28));
        int i13 = iDp / this.d;
        int i14 = this.h;
        int iDp2 = (i14 == 0 || i14 == 2 || i14 == 3) ? AndroidUtilities.dp(180.0f) : i13;
        setMeasuredDimension(size, AndroidUtilities.dp(this.f25904f ? 14.0f : 6.0f) + (this.f25903e ? AndroidUtilities.dp(14.0f) : 0) + iDp2);
        while (true) {
            int i15 = this.d;
            if (i12 >= i15) {
                return;
            }
            this.f25902c[i12].measure(View.MeasureSpec.makeMeasureSpec(i12 == i15 + (-1) ? iDp : i13, 1073741824), View.MeasureSpec.makeMeasureSpec(iDp2, 1073741824));
            iDp -= i13;
            i12++;
        }
    }

    public void setSize(int i10) {
        if (this.f25900a != i10) {
            this.f25900a = i10;
            requestLayout();
        }
    }
}
