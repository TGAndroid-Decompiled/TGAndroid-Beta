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
    public final CheckBoxBase f32428a;
    public Drawable f32429b;
    public int f32430c;

    public xp(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f32428a = new CheckBoxBase(i10, this, d6Var);
    }

    public final void a(boolean z10, boolean z11) {
        this.f32428a.f(-1, z10, z11);
    }

    public final void b(int i10, int i11, int i12) {
        this.f32428a.h(i10, i11, i12);
    }

    public CheckBoxBase getCheckBoxBase() {
        return this.f32428a;
    }

    public boolean getDrawUnchecked() {
        return this.f32428a.f24155z;
    }

    public float getProgress() {
        return this.f32428a.getProgress();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32428a.f24142l = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32428a.f24142l = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f32429b != null) {
            int measuredWidth = getMeasuredWidth() >> 1;
            int measuredHeight = getMeasuredHeight() >> 1;
            Drawable drawable = this.f32429b;
            drawable.setBounds(org.telegram.ui.Cells.t0.w(2, measuredWidth, drawable), org.telegram.ui.Cells.t0.g(2, measuredHeight, this.f32429b), org.telegram.ui.Cells.t0.B(2, measuredWidth, this.f32429b), org.telegram.ui.Cells.t0.A(2, measuredHeight, this.f32429b));
            this.f32429b.draw(canvas);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(1.2f));
            paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.U6, false));
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth - AndroidUtilities.dp(1.5f), paint);
            return;
        }
        this.f32428a.a(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f32428a.f24147q);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f32428a.e(0, 0, i12 - i10, i13 - i11);
    }

    public void setCirclePaintProvider(GenericProvider<Void, Paint> genericProvider) {
        CheckBoxBase checkBoxBase = this.f32428a;
        if (checkBoxBase.G == genericProvider) {
            return;
        }
        checkBoxBase.G = genericProvider;
        checkBoxBase.b();
    }

    public void setDrawBackgroundAsArc(int i10) {
        this.f32428a.d(i10);
    }

    public void setDrawUnchecked(boolean z10) {
        this.f32428a.k(z10);
    }

    public void setDuration(long j10) {
        this.f32428a.H = j10;
    }

    @Override
    public void setEnabled(boolean z10) {
        CheckBoxBase checkBoxBase = this.f32428a;
        if (checkBoxBase.f24141k != z10) {
            checkBoxBase.f24141k = z10;
            checkBoxBase.b();
        }
        super.setEnabled(z10);
    }

    public void setForbidden(boolean z10) {
        CheckBoxBase checkBoxBase = this.f32428a;
        if (checkBoxBase.f24144n == z10) {
            return;
        }
        checkBoxBase.f24144n = z10;
        checkBoxBase.b();
    }

    public void setIcon(int i10) {
        if (i10 != this.f32430c) {
            this.f32430c = i10;
            if (i10 == 0) {
                this.f32429b = null;
                return;
            }
            Drawable mutate = getContext().getDrawable(i10).mutate();
            this.f32429b = mutate;
            mutate.setColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.U6, false), PorterDuff.Mode.MULTIPLY);
        }
    }

    public void setNum(int i10) {
        String str;
        CheckBoxBase checkBoxBase = this.f32428a;
        if (i10 >= 0) {
            checkBoxBase.getClass();
            str = "" + (i10 + 1);
        } else if (checkBoxBase.f24146p != null) {
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
        this.f32428a.D = ypVar;
    }
}
