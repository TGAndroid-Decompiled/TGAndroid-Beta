package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
public class xp extends View {
    public final CheckBoxBase f32618a;
    public Drawable f32619b;
    public int f32620c;

    public xp(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f32618a = new CheckBoxBase(i10, this, g6Var);
    }

    public final void a(boolean z10, boolean z11) {
        this.f32618a.f(-1, z10, z11);
    }

    public final void b(int i10, int i11, int i12) {
        this.f32618a.h(i10, i11, i12);
    }

    public CheckBoxBase getCheckBoxBase() {
        return this.f32618a;
    }

    public boolean getDrawUnchecked() {
        return this.f32618a.f24304z;
    }

    public float getProgress() {
        return this.f32618a.getProgress();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32618a.f24291l = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32618a.f24291l = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f32619b != null) {
            int measuredWidth = getMeasuredWidth() >> 1;
            int measuredHeight = getMeasuredHeight() >> 1;
            Drawable drawable = this.f32619b;
            drawable.setBounds(org.telegram.ui.Cells.b1.f(2, measuredWidth, drawable), org.telegram.messenger.sl.d(2, measuredHeight, this.f32619b), org.telegram.ui.Cells.b1.y(2, measuredWidth, this.f32619b), org.telegram.ui.Cells.b1.u(2, measuredHeight, this.f32619b));
            this.f32619b.draw(canvas);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(1.2f));
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.U6, false));
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth - AndroidUtilities.dp(1.5f), paint);
            return;
        }
        this.f32618a.a(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f32618a.f24296q);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f32618a.e(0, 0, i12 - i10, i13 - i11);
    }

    public void setCirclePaintProvider(GenericProvider<Void, Paint> genericProvider) {
        CheckBoxBase checkBoxBase = this.f32618a;
        if (checkBoxBase.G == genericProvider) {
            return;
        }
        checkBoxBase.G = genericProvider;
        checkBoxBase.b();
    }

    public void setDrawBackgroundAsArc(int i10) {
        this.f32618a.d(i10);
    }

    public void setDrawUnchecked(boolean z10) {
        this.f32618a.k(z10);
    }

    public void setDuration(long j10) {
        this.f32618a.H = j10;
    }

    @Override
    public void setEnabled(boolean z10) {
        CheckBoxBase checkBoxBase = this.f32618a;
        if (checkBoxBase.f24290k != z10) {
            checkBoxBase.f24290k = z10;
            checkBoxBase.b();
        }
        super.setEnabled(z10);
    }

    public void setForbidden(boolean z10) {
        CheckBoxBase checkBoxBase = this.f32618a;
        if (checkBoxBase.f24293n == z10) {
            return;
        }
        checkBoxBase.f24293n = z10;
        checkBoxBase.b();
    }

    public void setIcon(int i10) {
        if (i10 != this.f32620c) {
            this.f32620c = i10;
            if (i10 == 0) {
                this.f32619b = null;
                return;
            }
            Drawable mutate = getContext().getDrawable(i10).mutate();
            this.f32619b = mutate;
            org.telegram.ui.ActionBar.r6.z(this, mutate, org.telegram.ui.ActionBar.k6.U6, null, PorterDuff.Mode.MULTIPLY);
        }
    }

    public void setNum(int i10) {
        String str;
        CheckBoxBase checkBoxBase = this.f32618a;
        if (i10 >= 0) {
            checkBoxBase.getClass();
            str = "" + (i10 + 1);
        } else if (checkBoxBase.f24295p != null) {
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

    public void setProgressDelegate(yp ypVar) {
        this.f32618a.D = ypVar;
    }
}
