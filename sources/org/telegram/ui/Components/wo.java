package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public class wo extends View {
    public final CheckBoxBase f40026a;
    public Drawable f40027b;
    public int f40028c;

    public wo(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f40026a = new CheckBoxBase(i7, this, h6Var);
    }

    public final void a(boolean z9, boolean z10) {
        this.f40026a.f(-1, z9, z10);
    }

    public final void b(int i7, int i10, int i11) {
        this.f40026a.h(i7, i10, i11);
    }

    public CheckBoxBase getCheckBoxBase() {
        return this.f40026a;
    }

    public boolean getDrawUnchecked() {
        return this.f40026a.f31287z;
    }

    public float getProgress() {
        return this.f40026a.getProgress();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40026a.f31274l = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40026a.f31274l = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40027b != null) {
            int measuredWidth = getMeasuredWidth() >> 1;
            int measuredHeight = getMeasuredHeight() >> 1;
            Drawable drawable = this.f40027b;
            drawable.setBounds(org.telegram.ui.Cells.f1.z(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.y(2, measuredHeight, this.f40027b), org.telegram.ui.Cells.f1.w(2, measuredWidth, this.f40027b), org.telegram.ui.Cells.f1.f(2, measuredHeight, this.f40027b));
            this.f40027b.draw(canvas);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(1.2f));
            paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.U6, false));
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth - org.telegram.messenger.g0.L(1.5f), paint);
            return;
        }
        this.f40026a.a(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f40026a.f31279q);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.f40026a.e(0, 0, i11 - i7, i12 - i10);
    }

    public void setCirclePaintProvider(org.telegram.messenger.k9 k9Var) {
        CheckBoxBase checkBoxBase = this.f40026a;
        if (checkBoxBase.G == k9Var) {
            return;
        }
        checkBoxBase.G = k9Var;
        checkBoxBase.b();
    }

    public void setDrawBackgroundAsArc(int i7) {
        this.f40026a.d(i7);
    }

    public void setDrawUnchecked(boolean z9) {
        this.f40026a.k(z9);
    }

    public void setDuration(long j3) {
        this.f40026a.H = j3;
    }

    @Override
    public void setEnabled(boolean z9) {
        CheckBoxBase checkBoxBase = this.f40026a;
        if (checkBoxBase.f31273k != z9) {
            checkBoxBase.f31273k = z9;
            checkBoxBase.b();
        }
        super.setEnabled(z9);
    }

    public void setForbidden(boolean z9) {
        CheckBoxBase checkBoxBase = this.f40026a;
        if (checkBoxBase.f31276n == z9) {
            return;
        }
        checkBoxBase.f31276n = z9;
        checkBoxBase.b();
    }

    public void setIcon(int i7) {
        if (i7 != this.f40028c) {
            this.f40028c = i7;
            if (i7 == 0) {
                this.f40027b = null;
                return;
            }
            Drawable mutate = getContext().getDrawable(i7).mutate();
            this.f40027b = mutate;
            org.telegram.ui.ActionBar.t6.x(this, mutate, org.telegram.ui.ActionBar.m6.U6, null, PorterDuff.Mode.MULTIPLY);
        }
    }

    public void setNum(int i7) {
        String str;
        CheckBoxBase checkBoxBase = this.f40026a;
        if (i7 >= 0) {
            checkBoxBase.getClass();
            str = "" + (i7 + 1);
        } else if (checkBoxBase.f31278p != null) {
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
        this.f40026a.D = xoVar;
    }
}
