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
public class np extends View {
    public final CheckBoxBase f26861a;
    public Drawable f26862b;
    public int f26863c;

    public np(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f26861a = new CheckBoxBase(i10, this, f6Var);
    }

    public final void a(boolean z10, boolean z11) {
        this.f26861a.f(-1, z10, z11);
    }

    public final void b(int i10, int i11, int i12) {
        this.f26861a.h(i10, i11, i12);
    }

    public CheckBoxBase getCheckBoxBase() {
        return this.f26861a;
    }

    public boolean getDrawUnchecked() {
        return this.f26861a.f22217z;
    }

    public float getProgress() {
        return this.f26861a.getProgress();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26861a.f22204l = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26861a.f22204l = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f26862b != null) {
            int measuredWidth = getMeasuredWidth() >> 1;
            int measuredHeight = getMeasuredHeight() >> 1;
            Drawable drawable = this.f26862b;
            drawable.setBounds(org.telegram.messenger.rk.y(2, measuredWidth, drawable), org.telegram.messenger.rk.d(2, measuredHeight, this.f26862b), org.telegram.ui.Cells.c1.d(2, measuredWidth, this.f26862b), org.telegram.messenger.rk.A(2, measuredHeight, this.f26862b));
            this.f26862b.draw(canvas);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(1.2f));
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.U6, false));
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth - AndroidUtilities.dp(1.5f), paint);
            return;
        }
        this.f26861a.a(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f26861a.f22209q);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f26861a.e(0, 0, i12 - i10, i13 - i11);
    }

    public void setCirclePaintProvider(GenericProvider<Void, Paint> genericProvider) {
        CheckBoxBase checkBoxBase = this.f26861a;
        if (checkBoxBase.G == genericProvider) {
            return;
        }
        checkBoxBase.G = genericProvider;
        checkBoxBase.b();
    }

    public void setDrawBackgroundAsArc(int i10) {
        this.f26861a.d(i10);
    }

    public void setDrawUnchecked(boolean z10) {
        this.f26861a.k(z10);
    }

    public void setDuration(long j3) {
        this.f26861a.H = j3;
    }

    @Override
    public void setEnabled(boolean z10) {
        CheckBoxBase checkBoxBase = this.f26861a;
        if (checkBoxBase.f22203k != z10) {
            checkBoxBase.f22203k = z10;
            checkBoxBase.b();
        }
        super.setEnabled(z10);
    }

    public void setForbidden(boolean z10) {
        CheckBoxBase checkBoxBase = this.f26861a;
        if (checkBoxBase.f22206n == z10) {
            return;
        }
        checkBoxBase.f22206n = z10;
        checkBoxBase.b();
    }

    public void setIcon(int i10) {
        if (i10 != this.f26863c) {
            this.f26863c = i10;
            if (i10 == 0) {
                this.f26862b = null;
                return;
            }
            Drawable mutate = getContext().getDrawable(i10).mutate();
            this.f26862b = mutate;
            mutate.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.U6, false), PorterDuff.Mode.MULTIPLY);
        }
    }

    public void setNum(int i10) {
        String str;
        CheckBoxBase checkBoxBase = this.f26861a;
        if (i10 >= 0) {
            checkBoxBase.getClass();
            str = "" + (i10 + 1);
        } else if (checkBoxBase.f22208p != null) {
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

    public void setProgressDelegate(op opVar) {
        this.f26861a.D = opVar;
    }
}
