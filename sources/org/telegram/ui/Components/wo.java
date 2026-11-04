package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public class wo extends View {
    public final CheckBoxBase f40035a;
    public Drawable f40036b;
    public int f40037c;

    public wo(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f40035a = new CheckBoxBase(i3, this, e6Var);
    }

    public final void a(boolean z10, boolean z11) {
        this.f40035a.f(-1, z10, z11);
    }

    public final void b(int i3, int i10, int i11) {
        this.f40035a.h(i3, i10, i11);
    }

    public CheckBoxBase getCheckBoxBase() {
        return this.f40035a;
    }

    public boolean getDrawUnchecked() {
        return this.f40035a.f31342z;
    }

    public float getProgress() {
        return this.f40035a.getProgress();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40035a.f31329l = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40035a.f31329l = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40036b != null) {
            int measuredWidth = getMeasuredWidth() >> 1;
            int measuredHeight = getMeasuredHeight() >> 1;
            Drawable drawable = this.f40036b;
            drawable.setBounds(org.telegram.ui.Cells.f1.C(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.B(2, measuredHeight, this.f40036b), org.telegram.ui.Cells.f1.z(2, measuredWidth, this.f40036b), org.telegram.ui.Cells.f1.i(2, measuredHeight, this.f40036b));
            this.f40036b.draw(canvas);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(1.2f));
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.U6, false));
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth - org.telegram.messenger.g0.L(1.5f), paint);
            return;
        }
        this.f40035a.a(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f40035a.f31334q);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        this.f40035a.e(0, 0, i11 - i3, i12 - i10);
    }

    public void setCirclePaintProvider(org.telegram.messenger.e9 e9Var) {
        CheckBoxBase checkBoxBase = this.f40035a;
        if (checkBoxBase.G == e9Var) {
            return;
        }
        checkBoxBase.G = e9Var;
        checkBoxBase.b();
    }

    public void setDrawBackgroundAsArc(int i3) {
        this.f40035a.d(i3);
    }

    public void setDrawUnchecked(boolean z10) {
        this.f40035a.k(z10);
    }

    public void setDuration(long j10) {
        this.f40035a.H = j10;
    }

    @Override
    public void setEnabled(boolean z10) {
        CheckBoxBase checkBoxBase = this.f40035a;
        if (checkBoxBase.f31328k != z10) {
            checkBoxBase.f31328k = z10;
            checkBoxBase.b();
        }
        super.setEnabled(z10);
    }

    public void setForbidden(boolean z10) {
        CheckBoxBase checkBoxBase = this.f40035a;
        if (checkBoxBase.f31331n == z10) {
            return;
        }
        checkBoxBase.f31331n = z10;
        checkBoxBase.b();
    }

    public void setIcon(int i3) {
        if (i3 != this.f40037c) {
            this.f40037c = i3;
            if (i3 == 0) {
                this.f40036b = null;
                return;
            }
            Drawable mutate = getContext().getDrawable(i3).mutate();
            this.f40036b = mutate;
            org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.U6, null, PorterDuff.Mode.MULTIPLY);
        }
    }

    public void setNum(int i3) {
        String str;
        CheckBoxBase checkBoxBase = this.f40035a;
        if (i3 >= 0) {
            checkBoxBase.getClass();
            str = "" + (i3 + 1);
        } else if (checkBoxBase.f31333p != null) {
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

    public void setProgressDelegate(xo xoVar) {
        this.f40035a.D = xoVar;
    }
}
