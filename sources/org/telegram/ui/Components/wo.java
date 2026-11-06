package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public class wo extends View {
    public final CheckBoxBase f40050a;
    public Drawable f40051b;
    public int f40052c;

    public wo(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f40050a = new CheckBoxBase(i7, this, f6Var);
    }

    public final void a(boolean z9, boolean z10) {
        this.f40050a.f(-1, z9, z10);
    }

    public final void b(int i7, int i10, int i11) {
        this.f40050a.h(i7, i10, i11);
    }

    public CheckBoxBase getCheckBoxBase() {
        return this.f40050a;
    }

    public boolean getDrawUnchecked() {
        return this.f40050a.f31266z;
    }

    public float getProgress() {
        return this.f40050a.getProgress();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40050a.f31253l = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40050a.f31253l = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40051b != null) {
            int measuredWidth = getMeasuredWidth() >> 1;
            int measuredHeight = getMeasuredHeight() >> 1;
            Drawable drawable = this.f40051b;
            drawable.setBounds(org.telegram.ui.Cells.f1.z(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.y(2, measuredHeight, this.f40051b), org.telegram.ui.Cells.f1.w(2, measuredWidth, this.f40051b), org.telegram.ui.Cells.f1.f(2, measuredHeight, this.f40051b));
            this.f40051b.draw(canvas);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(1.2f));
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.U6, false));
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth - org.telegram.messenger.g0.L(1.5f), paint);
            return;
        }
        this.f40050a.a(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f40050a.f31258q);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.f40050a.e(0, 0, i11 - i7, i12 - i10);
    }

    public void setCirclePaintProvider(org.telegram.messenger.k9 k9Var) {
        CheckBoxBase checkBoxBase = this.f40050a;
        if (checkBoxBase.G == k9Var) {
            return;
        }
        checkBoxBase.G = k9Var;
        checkBoxBase.b();
    }

    public void setDrawBackgroundAsArc(int i7) {
        this.f40050a.d(i7);
    }

    public void setDrawUnchecked(boolean z9) {
        this.f40050a.k(z9);
    }

    public void setDuration(long j3) {
        this.f40050a.H = j3;
    }

    @Override
    public void setEnabled(boolean z9) {
        CheckBoxBase checkBoxBase = this.f40050a;
        if (checkBoxBase.f31252k != z9) {
            checkBoxBase.f31252k = z9;
            checkBoxBase.b();
        }
        super.setEnabled(z9);
    }

    public void setForbidden(boolean z9) {
        CheckBoxBase checkBoxBase = this.f40050a;
        if (checkBoxBase.f31255n == z9) {
            return;
        }
        checkBoxBase.f31255n = z9;
        checkBoxBase.b();
    }

    public void setIcon(int i7) {
        if (i7 != this.f40052c) {
            this.f40052c = i7;
            if (i7 == 0) {
                this.f40051b = null;
                return;
            }
            Drawable mutate = getContext().getDrawable(i7).mutate();
            this.f40051b = mutate;
            org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.U6, null, PorterDuff.Mode.MULTIPLY);
        }
    }

    public void setNum(int i7) {
        String str;
        CheckBoxBase checkBoxBase = this.f40050a;
        if (i7 >= 0) {
            checkBoxBase.getClass();
            str = "" + (i7 + 1);
        } else if (checkBoxBase.f31257p != null) {
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
        this.f40050a.D = xoVar;
    }
}
