package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public class ep extends View {
    public final CheckBoxBase f25895a;
    public Drawable f25896b;
    public int f25897c;

    public ep(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f25895a = new CheckBoxBase(i10, this, p6Var);
    }

    public final void a(boolean z10, boolean z11) {
        this.f25895a.f(-1, z10, z11);
    }

    public final void b(int i10, int i11, int i12) {
        this.f25895a.h(i10, i11, i12);
    }

    public CheckBoxBase getCheckBoxBase() {
        return this.f25895a;
    }

    public boolean getDrawUnchecked() {
        return this.f25895a.f23928z;
    }

    public float getProgress() {
        return this.f25895a.getProgress();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f25895a.f23915l = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25895a.f23915l = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f25896b != null) {
            int measuredWidth = getMeasuredWidth() >> 1;
            int measuredHeight = getMeasuredHeight() >> 1;
            Drawable drawable = this.f25896b;
            drawable.setBounds(org.telegram.ui.Cells.f1.z(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.y(2, measuredHeight, this.f25896b), org.telegram.ui.Cells.f1.w(2, measuredWidth, this.f25896b), org.telegram.ui.Cells.f1.f(2, measuredHeight, this.f25896b));
            this.f25896b.draw(canvas);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.i0.L(1.2f));
            paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.U6, false));
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth - org.telegram.messenger.i0.L(1.5f), paint);
            return;
        }
        this.f25895a.a(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f25895a.f23920q);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f25895a.e(0, 0, i12 - i10, i13 - i11);
    }

    public void setCirclePaintProvider(org.telegram.messenger.m9 m9Var) {
        CheckBoxBase checkBoxBase = this.f25895a;
        if (checkBoxBase.G == m9Var) {
            return;
        }
        checkBoxBase.G = m9Var;
        checkBoxBase.b();
    }

    public void setDrawBackgroundAsArc(int i10) {
        this.f25895a.d(i10);
    }

    public void setDrawUnchecked(boolean z10) {
        this.f25895a.k(z10);
    }

    public void setDuration(long j10) {
        this.f25895a.H = j10;
    }

    @Override
    public void setEnabled(boolean z10) {
        CheckBoxBase checkBoxBase = this.f25895a;
        if (checkBoxBase.f23914k != z10) {
            checkBoxBase.f23914k = z10;
            checkBoxBase.b();
        }
        super.setEnabled(z10);
    }

    public void setForbidden(boolean z10) {
        CheckBoxBase checkBoxBase = this.f25895a;
        if (checkBoxBase.f23917n == z10) {
            return;
        }
        checkBoxBase.f23917n = z10;
        checkBoxBase.b();
    }

    public void setIcon(int i10) {
        if (i10 != this.f25897c) {
            this.f25897c = i10;
            if (i10 == 0) {
                this.f25896b = null;
                return;
            }
            Drawable mutate = getContext().getDrawable(i10).mutate();
            this.f25896b = mutate;
            org.telegram.ui.ActionBar.a7.y(this, mutate, org.telegram.ui.ActionBar.t6.U6, null, PorterDuff.Mode.MULTIPLY);
        }
    }

    public void setNum(int i10) {
        String str;
        CheckBoxBase checkBoxBase = this.f25895a;
        if (i10 >= 0) {
            checkBoxBase.getClass();
            str = "" + (i10 + 1);
        } else if (checkBoxBase.f23919p != null) {
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

    public void setProgressDelegate(fp fpVar) {
        this.f25895a.D = fpVar;
    }
}
