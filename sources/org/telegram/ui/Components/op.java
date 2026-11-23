package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public class op extends View {
    public final CheckBoxBase f38291a;
    public Drawable f38292b;
    public int f38293c;

    public op(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f38291a = new CheckBoxBase(i7, this, h6Var);
    }

    public final void a(boolean z10, boolean z11) {
        this.f38291a.f(-1, z10, z11);
    }

    public final void b(int i7, int i10, int i11) {
        this.f38291a.h(i7, i10, i11);
    }

    public CheckBoxBase getCheckBoxBase() {
        return this.f38291a;
    }

    public boolean getDrawUnchecked() {
        return this.f38291a.f32848z;
    }

    public float getProgress() {
        return this.f38291a.getProgress();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38291a.f32835l = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38291a.f32835l = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f38292b != null) {
            int measuredWidth = getMeasuredWidth() >> 1;
            int measuredHeight = getMeasuredHeight() >> 1;
            Drawable drawable = this.f38292b;
            drawable.setBounds(org.telegram.ui.Cells.c0.C(2, measuredWidth, drawable), org.telegram.ui.Cells.c0.A(2, measuredHeight, this.f38292b), org.telegram.ui.Cells.c0.y(2, measuredWidth, this.f38292b), org.telegram.ui.Cells.c0.j(2, measuredHeight, this.f38292b));
            this.f38292b.draw(canvas);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(1.2f));
            paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.U6, false));
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth - org.telegram.messenger.g0.L(1.5f), paint);
            return;
        }
        this.f38291a.a(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f38291a.f32840q);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f38291a.e(0, 0, i11 - i7, i12 - i10);
    }

    public void setCirclePaintProvider(org.telegram.messenger.j9 j9Var) {
        CheckBoxBase checkBoxBase = this.f38291a;
        if (checkBoxBase.G == j9Var) {
            return;
        }
        checkBoxBase.G = j9Var;
        checkBoxBase.b();
    }

    public void setDrawBackgroundAsArc(int i7) {
        this.f38291a.d(i7);
    }

    public void setDrawUnchecked(boolean z10) {
        this.f38291a.k(z10);
    }

    public void setDuration(long j3) {
        this.f38291a.H = j3;
    }

    @Override
    public void setEnabled(boolean z10) {
        CheckBoxBase checkBoxBase = this.f38291a;
        if (checkBoxBase.f32834k != z10) {
            checkBoxBase.f32834k = z10;
            checkBoxBase.b();
        }
        super.setEnabled(z10);
    }

    public void setForbidden(boolean z10) {
        CheckBoxBase checkBoxBase = this.f38291a;
        if (checkBoxBase.f32837n == z10) {
            return;
        }
        checkBoxBase.f32837n = z10;
        checkBoxBase.b();
    }

    public void setIcon(int i7) {
        if (i7 != this.f38293c) {
            this.f38293c = i7;
            if (i7 == 0) {
                this.f38292b = null;
                return;
            }
            Drawable mutate = getContext().getDrawable(i7).mutate();
            this.f38292b = mutate;
            org.telegram.ui.ActionBar.t6.x(this, mutate, org.telegram.ui.ActionBar.m6.U6, null, PorterDuff.Mode.MULTIPLY);
        }
    }

    public void setNum(int i7) {
        String str;
        CheckBoxBase checkBoxBase = this.f38291a;
        if (i7 >= 0) {
            checkBoxBase.getClass();
            str = "" + (i7 + 1);
        } else if (checkBoxBase.f32839p != null) {
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
        this.f38291a.D = ppVar;
    }
}
