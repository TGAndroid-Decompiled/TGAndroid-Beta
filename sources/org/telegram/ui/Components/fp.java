package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public class fp extends View {
    public final CheckBoxBase f34663a;
    public Drawable f34664b;
    public int f34665c;

    public fp(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f34663a = new CheckBoxBase(i7, this, e6Var);
    }

    public final void a(boolean z10, boolean z11) {
        this.f34663a.f(-1, z10, z11);
    }

    public final void b(int i7, int i10, int i11) {
        this.f34663a.h(i7, i10, i11);
    }

    public CheckBoxBase getCheckBoxBase() {
        return this.f34663a;
    }

    public boolean getDrawUnchecked() {
        return this.f34663a.f32449z;
    }

    public float getProgress() {
        return this.f34663a.getProgress();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34663a.f32436l = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f34663a.f32436l = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f34664b != null) {
            int measuredWidth = getMeasuredWidth() >> 1;
            int measuredHeight = getMeasuredHeight() >> 1;
            Drawable drawable = this.f34664b;
            drawable.setBounds(org.telegram.ui.Cells.y0.A(2, measuredWidth, drawable), org.telegram.ui.Cells.y0.y(2, measuredHeight, this.f34664b), org.telegram.ui.Cells.y0.w(2, measuredWidth, this.f34664b), org.telegram.ui.Cells.y0.h(2, measuredHeight, this.f34664b));
            this.f34664b.draw(canvas);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(1.2f));
            paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.U6, false));
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth - org.telegram.messenger.g0.L(1.5f), paint);
            return;
        }
        this.f34663a.a(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f34663a.f32441q);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f34663a.e(0, 0, i11 - i7, i12 - i10);
    }

    public void setCirclePaintProvider(org.telegram.messenger.j9 j9Var) {
        CheckBoxBase checkBoxBase = this.f34663a;
        if (checkBoxBase.G == j9Var) {
            return;
        }
        checkBoxBase.G = j9Var;
        checkBoxBase.b();
    }

    public void setDrawBackgroundAsArc(int i7) {
        this.f34663a.d(i7);
    }

    public void setDrawUnchecked(boolean z10) {
        this.f34663a.k(z10);
    }

    public void setDuration(long j3) {
        this.f34663a.H = j3;
    }

    @Override
    public void setEnabled(boolean z10) {
        CheckBoxBase checkBoxBase = this.f34663a;
        if (checkBoxBase.f32435k != z10) {
            checkBoxBase.f32435k = z10;
            checkBoxBase.b();
        }
        super.setEnabled(z10);
    }

    public void setForbidden(boolean z10) {
        CheckBoxBase checkBoxBase = this.f34663a;
        if (checkBoxBase.f32438n == z10) {
            return;
        }
        checkBoxBase.f32438n = z10;
        checkBoxBase.b();
    }

    public void setIcon(int i7) {
        if (i7 != this.f34665c) {
            this.f34665c = i7;
            if (i7 == 0) {
                this.f34664b = null;
                return;
            }
            Drawable mutate = getContext().getDrawable(i7).mutate();
            this.f34664b = mutate;
            org.telegram.ui.ActionBar.q6.x(this, mutate, org.telegram.ui.ActionBar.j6.U6, null, PorterDuff.Mode.MULTIPLY);
        }
    }

    public void setNum(int i7) {
        String str;
        CheckBoxBase checkBoxBase = this.f34663a;
        if (i7 >= 0) {
            checkBoxBase.getClass();
            str = "" + (i7 + 1);
        } else if (checkBoxBase.f32440p != null) {
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

    public void setProgressDelegate(gp gpVar) {
        this.f34663a.D = gpVar;
    }
}
