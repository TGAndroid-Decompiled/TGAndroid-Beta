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
public class zp extends View {
    public final CheckBoxBase f35379a;
    public Drawable f35380b;
    public int f35381c;

    public zp(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f35379a = new CheckBoxBase(i10, this, u6Var);
    }

    public final void a(boolean z10, boolean z11) {
        this.f35379a.f(-1, z10, z11);
    }

    public final void b(int i10, int i11, int i12) {
        this.f35379a.h(i10, i11, i12);
    }

    public CheckBoxBase getCheckBoxBase() {
        return this.f35379a;
    }

    public boolean getDrawUnchecked() {
        return this.f35379a.f26095z;
    }

    public float getProgress() {
        return this.f35379a.getProgress();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35379a.f26082l = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35379a.f26082l = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f35380b != null) {
            int measuredWidth = getMeasuredWidth() >> 1;
            int measuredHeight = getMeasuredHeight() >> 1;
            Drawable drawable = this.f35380b;
            drawable.setBounds(org.telegram.ui.d3.x(2, measuredWidth, drawable), org.telegram.ui.d3.i(2, measuredHeight, this.f35380b), org.telegram.ui.d3.C(2, measuredWidth, this.f35380b), org.telegram.ui.d3.B(2, measuredHeight, this.f35380b));
            this.f35380b.draw(canvas);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(1.2f));
            paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.U6, false));
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth - AndroidUtilities.dp(1.5f), paint);
            return;
        }
        this.f35379a.a(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f35379a.f26087q);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f35379a.e(0, 0, i12 - i10, i13 - i11);
    }

    public void setCirclePaintProvider(GenericProvider<Void, Paint> genericProvider) {
        CheckBoxBase checkBoxBase = this.f35379a;
        if (checkBoxBase.G == genericProvider) {
            return;
        }
        checkBoxBase.G = genericProvider;
        checkBoxBase.b();
    }

    public void setDrawBackgroundAsArc(int i10) {
        this.f35379a.d(i10);
    }

    public void setDrawUnchecked(boolean z10) {
        this.f35379a.k(z10);
    }

    public void setDuration(long j10) {
        this.f35379a.H = j10;
    }

    @Override
    public void setEnabled(boolean z10) {
        CheckBoxBase checkBoxBase = this.f35379a;
        if (checkBoxBase.f26081k != z10) {
            checkBoxBase.f26081k = z10;
            checkBoxBase.b();
        }
        super.setEnabled(z10);
    }

    public void setForbidden(boolean z10) {
        CheckBoxBase checkBoxBase = this.f35379a;
        if (checkBoxBase.f26084n == z10) {
            return;
        }
        checkBoxBase.f26084n = z10;
        checkBoxBase.b();
    }

    public void setIcon(int i10) {
        if (i10 != this.f35381c) {
            this.f35381c = i10;
            if (i10 == 0) {
                this.f35380b = null;
                return;
            }
            Drawable mutate = getContext().getDrawable(i10).mutate();
            this.f35380b = mutate;
            org.telegram.ui.ActionBar.f7.y(this, mutate, org.telegram.ui.ActionBar.y6.U6, null, PorterDuff.Mode.MULTIPLY);
        }
    }

    public void setNum(int i10) {
        String str;
        CheckBoxBase checkBoxBase = this.f35379a;
        if (i10 >= 0) {
            checkBoxBase.getClass();
            str = "" + (i10 + 1);
        } else if (checkBoxBase.f26086p != null) {
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

    public void setProgressDelegate(aq aqVar) {
        this.f35379a.D = aqVar;
    }
}
