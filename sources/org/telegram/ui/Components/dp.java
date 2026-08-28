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
public class dp extends View {
    public final CheckBoxBase f27781a;
    public Drawable f27782b;
    public int f27783c;

    public dp(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f27781a = new CheckBoxBase(i9, this, b6Var);
    }

    public final void a(boolean z10, boolean z11) {
        this.f27781a.f(-1, z10, z11);
    }

    public final void b(int i9, int i10, int i11) {
        this.f27781a.h(i9, i10, i11);
    }

    public CheckBoxBase getCheckBoxBase() {
        return this.f27781a;
    }

    public boolean getDrawUnchecked() {
        return this.f27781a.f26321z;
    }

    public float getProgress() {
        return this.f27781a.getProgress();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27781a.f26308l = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27781a.f26308l = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f27782b != null) {
            int measuredWidth = getMeasuredWidth() >> 1;
            int measuredHeight = getMeasuredHeight() >> 1;
            Drawable drawable = this.f27782b;
            drawable.setBounds(org.telegram.messenger.ll.x(2, measuredWidth, drawable), org.telegram.messenger.ll.e(2, measuredHeight, this.f27782b), org.telegram.messenger.ll.B(2, measuredWidth, this.f27782b), org.telegram.messenger.ll.z(2, measuredHeight, this.f27782b));
            this.f27782b.draw(canvas);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(1.2f));
            paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.U6, false));
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth - AndroidUtilities.dp(1.5f), paint);
            return;
        }
        this.f27781a.a(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f27781a.f26313q);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        this.f27781a.e(0, 0, i11 - i9, i12 - i10);
    }

    public void setCirclePaintProvider(GenericProvider<Void, Paint> genericProvider) {
        CheckBoxBase checkBoxBase = this.f27781a;
        if (checkBoxBase.G == genericProvider) {
            return;
        }
        checkBoxBase.G = genericProvider;
        checkBoxBase.b();
    }

    public void setDrawBackgroundAsArc(int i9) {
        this.f27781a.d(i9);
    }

    public void setDrawUnchecked(boolean z10) {
        this.f27781a.k(z10);
    }

    public void setDuration(long j10) {
        this.f27781a.H = j10;
    }

    @Override
    public void setEnabled(boolean z10) {
        CheckBoxBase checkBoxBase = this.f27781a;
        if (checkBoxBase.f26307k != z10) {
            checkBoxBase.f26307k = z10;
            checkBoxBase.b();
        }
        super.setEnabled(z10);
    }

    public void setForbidden(boolean z10) {
        CheckBoxBase checkBoxBase = this.f27781a;
        if (checkBoxBase.f26310n == z10) {
            return;
        }
        checkBoxBase.f26310n = z10;
        checkBoxBase.b();
    }

    public void setIcon(int i9) {
        if (i9 != this.f27783c) {
            this.f27783c = i9;
            if (i9 == 0) {
                this.f27782b = null;
                return;
            }
            Drawable mutate = getContext().getDrawable(i9).mutate();
            this.f27782b = mutate;
            mutate.setColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.U6, false), PorterDuff.Mode.MULTIPLY);
        }
    }

    public void setNum(int i9) {
        String str;
        CheckBoxBase checkBoxBase = this.f27781a;
        if (i9 >= 0) {
            checkBoxBase.getClass();
            str = "" + (i9 + 1);
        } else if (checkBoxBase.f26312p != null) {
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

    public void setProgressDelegate(ep epVar) {
        this.f27781a.D = epVar;
    }
}
