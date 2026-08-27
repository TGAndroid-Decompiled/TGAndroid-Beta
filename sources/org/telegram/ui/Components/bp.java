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

public class bp extends View {

    public final CheckBoxBase f27188a;

    public Drawable f27189b;

    public int f27190c;

    public bp(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f27188a = new CheckBoxBase(i10, this, c6Var);
    }

    public final void a(boolean z10, boolean z11) {
        this.f27188a.f(-1, z10, z11);
    }

    public final void b(int i10, int i11, int i12) {
        this.f27188a.h(i10, i11, i12);
    }

    public CheckBoxBase getCheckBoxBase() {
        return this.f27188a;
    }

    public boolean getDrawUnchecked() {
        return this.f27188a.f26317z;
    }

    public float getProgress() {
        return this.f27188a.getProgress();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27188a.f26304l = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27188a.f26304l = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f27189b == null) {
            this.f27188a.a(canvas);
            return;
        }
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() >> 1;
        Drawable drawable = this.f27189b;
        drawable.setBounds(org.telegram.messenger.rl.v(2, measuredWidth, drawable), org.telegram.messenger.rl.e(2, measuredHeight, this.f27189b), org.telegram.messenger.rl.A(2, measuredWidth, this.f27189b), org.telegram.messenger.rl.y(2, measuredHeight, this.f27189b));
        this.f27189b.draw(canvas);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.2f));
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.U6, false));
        canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth - AndroidUtilities.dp(1.5f), paint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f27188a.f26309q);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f27188a.e(0, 0, i12 - i10, i13 - i11);
    }

    public void setCirclePaintProvider(GenericProvider<Void, Paint> genericProvider) {
        CheckBoxBase checkBoxBase = this.f27188a;
        if (checkBoxBase.G == genericProvider) {
            return;
        }
        checkBoxBase.G = genericProvider;
        checkBoxBase.b();
    }

    public void setDrawBackgroundAsArc(int i10) {
        this.f27188a.d(i10);
    }

    public void setDrawUnchecked(boolean z10) {
        this.f27188a.k(z10);
    }

    public void setDuration(long j10) {
        this.f27188a.H = j10;
    }

    @Override
    public void setEnabled(boolean z10) {
        CheckBoxBase checkBoxBase = this.f27188a;
        if (checkBoxBase.f26303k != z10) {
            checkBoxBase.f26303k = z10;
            checkBoxBase.b();
        }
        super.setEnabled(z10);
    }

    public void setForbidden(boolean z10) {
        CheckBoxBase checkBoxBase = this.f27188a;
        if (checkBoxBase.f26306n == z10) {
            return;
        }
        checkBoxBase.f26306n = z10;
        checkBoxBase.b();
    }

    public void setIcon(int i10) {
        if (i10 != this.f27190c) {
            this.f27190c = i10;
            if (i10 == 0) {
                this.f27189b = null;
                return;
            }
            Drawable drawableMutate = getContext().getDrawable(i10).mutate();
            this.f27189b = drawableMutate;
            drawableMutate.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.U6, false), PorterDuff.Mode.MULTIPLY);
        }
    }

    public void setNum(int i10) {
        String str;
        CheckBoxBase checkBoxBase = this.f27188a;
        if (i10 >= 0) {
            checkBoxBase.getClass();
            str = "" + (i10 + 1);
        } else {
            str = checkBoxBase.f26308p != null ? checkBoxBase.C : null;
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

    public void setProgressDelegate(cp cpVar) {
        this.f27188a.D = cpVar;
    }
}
