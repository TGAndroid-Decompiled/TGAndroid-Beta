package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public class op extends View {
    public final CheckBoxBase f38327a;
    public Drawable f38328b;
    public int f38329c;

    public op(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f38327a = new CheckBoxBase(i7, this, h6Var);
    }

    public final void a(boolean z10, boolean z11) {
        this.f38327a.f(-1, z10, z11);
    }

    public final void b(int i7, int i10, int i11) {
        this.f38327a.h(i7, i10, i11);
    }

    public CheckBoxBase getCheckBoxBase() {
        return this.f38327a;
    }

    public boolean getDrawUnchecked() {
        return this.f38327a.f32879z;
    }

    public float getProgress() {
        return this.f38327a.getProgress();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38327a.f32866l = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38327a.f32866l = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f38328b != null) {
            int measuredWidth = getMeasuredWidth() >> 1;
            int measuredHeight = getMeasuredHeight() >> 1;
            Drawable drawable = this.f38328b;
            drawable.setBounds(org.telegram.ui.Cells.c0.C(2, measuredWidth, drawable), org.telegram.ui.Cells.c0.A(2, measuredHeight, this.f38328b), org.telegram.ui.Cells.c0.y(2, measuredWidth, this.f38328b), org.telegram.ui.Cells.c0.j(2, measuredHeight, this.f38328b));
            this.f38328b.draw(canvas);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(1.2f));
            paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.U6, false));
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth - org.telegram.messenger.g0.L(1.5f), paint);
            return;
        }
        this.f38327a.a(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f38327a.f32871q);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f38327a.e(0, 0, i11 - i7, i12 - i10);
    }

    public void setCirclePaintProvider(org.telegram.messenger.i9 i9Var) {
        CheckBoxBase checkBoxBase = this.f38327a;
        if (checkBoxBase.G == i9Var) {
            return;
        }
        checkBoxBase.G = i9Var;
        checkBoxBase.b();
    }

    public void setDrawBackgroundAsArc(int i7) {
        this.f38327a.d(i7);
    }

    public void setDrawUnchecked(boolean z10) {
        this.f38327a.k(z10);
    }

    public void setDuration(long j3) {
        this.f38327a.H = j3;
    }

    @Override
    public void setEnabled(boolean z10) {
        CheckBoxBase checkBoxBase = this.f38327a;
        if (checkBoxBase.f32865k != z10) {
            checkBoxBase.f32865k = z10;
            checkBoxBase.b();
        }
        super.setEnabled(z10);
    }

    public void setForbidden(boolean z10) {
        CheckBoxBase checkBoxBase = this.f38327a;
        if (checkBoxBase.f32868n == z10) {
            return;
        }
        checkBoxBase.f32868n = z10;
        checkBoxBase.b();
    }

    public void setIcon(int i7) {
        if (i7 != this.f38329c) {
            this.f38329c = i7;
            if (i7 == 0) {
                this.f38328b = null;
                return;
            }
            Drawable mutate = getContext().getDrawable(i7).mutate();
            this.f38328b = mutate;
            org.telegram.ui.ActionBar.t6.x(this, mutate, org.telegram.ui.ActionBar.m6.U6, null, PorterDuff.Mode.MULTIPLY);
        }
    }

    public void setNum(int i7) {
        String str;
        CheckBoxBase checkBoxBase = this.f38327a;
        if (i7 >= 0) {
            checkBoxBase.getClass();
            str = "" + (i7 + 1);
        } else if (checkBoxBase.f32870p != null) {
            str = checkBoxBase.C;
        } else {
            str = null;
        }
        String str2 = checkBoxBase.C;
        if (str2 == null) {
            if (str == null) {
                return;
            }
        } else if (str2.equals(str)) {
            return;
        }
        checkBoxBase.C = str;
        checkBoxBase.b();
    }

    public void setProgressDelegate(pp ppVar) {
        this.f38327a.D = ppVar;
    }
}
