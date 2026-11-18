package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public class mp extends View {
    public final CheckBoxBase f37598a;
    public Drawable f37599b;
    public int f37600c;

    public mp(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f37598a = new CheckBoxBase(i7, this, i6Var);
    }

    public final void a(boolean z10, boolean z11) {
        this.f37598a.f(-1, z10, z11);
    }

    public final void b(int i7, int i10, int i11) {
        this.f37598a.h(i7, i10, i11);
    }

    public CheckBoxBase getCheckBoxBase() {
        return this.f37598a;
    }

    public boolean getDrawUnchecked() {
        return this.f37598a.f32846z;
    }

    public float getProgress() {
        return this.f37598a.getProgress();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37598a.f32833l = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37598a.f32833l = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37599b != null) {
            int measuredWidth = getMeasuredWidth() >> 1;
            int measuredHeight = getMeasuredHeight() >> 1;
            Drawable drawable = this.f37599b;
            drawable.setBounds(org.telegram.ui.Cells.c0.C(2, measuredWidth, drawable), org.telegram.ui.Cells.c0.A(2, measuredHeight, this.f37599b), org.telegram.ui.Cells.c0.y(2, measuredWidth, this.f37599b), org.telegram.ui.Cells.c0.j(2, measuredHeight, this.f37599b));
            this.f37599b.draw(canvas);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(1.2f));
            paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.U6, false));
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth - org.telegram.messenger.g0.L(1.5f), paint);
            return;
        }
        this.f37598a.a(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f37598a.f32838q);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f37598a.e(0, 0, i11 - i7, i12 - i10);
    }

    public void setCirclePaintProvider(org.telegram.messenger.i9 i9Var) {
        CheckBoxBase checkBoxBase = this.f37598a;
        if (checkBoxBase.G == i9Var) {
            return;
        }
        checkBoxBase.G = i9Var;
        checkBoxBase.b();
    }

    public void setDrawBackgroundAsArc(int i7) {
        this.f37598a.d(i7);
    }

    public void setDrawUnchecked(boolean z10) {
        this.f37598a.k(z10);
    }

    public void setDuration(long j3) {
        this.f37598a.H = j3;
    }

    @Override
    public void setEnabled(boolean z10) {
        CheckBoxBase checkBoxBase = this.f37598a;
        if (checkBoxBase.f32832k != z10) {
            checkBoxBase.f32832k = z10;
            checkBoxBase.b();
        }
        super.setEnabled(z10);
    }

    public void setForbidden(boolean z10) {
        CheckBoxBase checkBoxBase = this.f37598a;
        if (checkBoxBase.f32835n == z10) {
            return;
        }
        checkBoxBase.f32835n = z10;
        checkBoxBase.b();
    }

    public void setIcon(int i7) {
        if (i7 != this.f37600c) {
            this.f37600c = i7;
            if (i7 == 0) {
                this.f37599b = null;
                return;
            }
            Drawable mutate = getContext().getDrawable(i7).mutate();
            this.f37599b = mutate;
            org.telegram.ui.ActionBar.u6.x(this, mutate, org.telegram.ui.ActionBar.n6.U6, null, PorterDuff.Mode.MULTIPLY);
        }
    }

    public void setNum(int i7) {
        String str;
        CheckBoxBase checkBoxBase = this.f37598a;
        if (i7 >= 0) {
            checkBoxBase.getClass();
            str = "" + (i7 + 1);
        } else if (checkBoxBase.f32837p != null) {
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

    public void setProgressDelegate(np npVar) {
        this.f37598a.D = npVar;
    }
}
