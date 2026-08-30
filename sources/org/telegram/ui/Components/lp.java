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
public class lp extends View {
    public final CheckBoxBase f26837a;
    public Drawable f26838b;
    public int f26839c;

    public lp(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f26837a = new CheckBoxBase(i10, this, f6Var);
    }

    public final void a(boolean z4, boolean z10) {
        this.f26837a.f(-1, z4, z10);
    }

    public final void b(int i10, int i11, int i12) {
        this.f26837a.h(i10, i11, i12);
    }

    public CheckBoxBase getCheckBoxBase() {
        return this.f26837a;
    }

    public boolean getDrawUnchecked() {
        return this.f26837a.f22973z;
    }

    public float getProgress() {
        return this.f26837a.getProgress();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26837a.f22960l = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26837a.f22960l = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f26838b != null) {
            int measuredWidth = getMeasuredWidth() >> 1;
            int measuredHeight = getMeasuredHeight() >> 1;
            Drawable drawable = this.f26838b;
            drawable.setBounds(org.telegram.ui.b.u(2, measuredWidth, drawable), org.telegram.ui.b.f(2, measuredHeight, this.f26838b), org.telegram.ui.b.A(2, measuredWidth, this.f26838b), org.telegram.ui.b.y(2, measuredHeight, this.f26838b));
            this.f26838b.draw(canvas);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(1.2f));
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.U6, false));
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth - AndroidUtilities.dp(1.5f), paint);
            return;
        }
        this.f26837a.a(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f26837a.f22965q);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.f26837a.e(0, 0, i12 - i10, i13 - i11);
    }

    public void setCirclePaintProvider(GenericProvider<Void, Paint> genericProvider) {
        CheckBoxBase checkBoxBase = this.f26837a;
        if (checkBoxBase.G == genericProvider) {
            return;
        }
        checkBoxBase.G = genericProvider;
        checkBoxBase.b();
    }

    public void setDrawBackgroundAsArc(int i10) {
        this.f26837a.d(i10);
    }

    public void setDrawUnchecked(boolean z4) {
        this.f26837a.k(z4);
    }

    public void setDuration(long j10) {
        this.f26837a.H = j10;
    }

    @Override
    public void setEnabled(boolean z4) {
        CheckBoxBase checkBoxBase = this.f26837a;
        if (checkBoxBase.f22959k != z4) {
            checkBoxBase.f22959k = z4;
            checkBoxBase.b();
        }
        super.setEnabled(z4);
    }

    public void setForbidden(boolean z4) {
        CheckBoxBase checkBoxBase = this.f26837a;
        if (checkBoxBase.f22962n == z4) {
            return;
        }
        checkBoxBase.f22962n = z4;
        checkBoxBase.b();
    }

    public void setIcon(int i10) {
        if (i10 != this.f26839c) {
            this.f26839c = i10;
            if (i10 == 0) {
                this.f26838b = null;
                return;
            }
            Drawable mutate = getContext().getDrawable(i10).mutate();
            this.f26838b = mutate;
            mutate.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.U6, false), PorterDuff.Mode.MULTIPLY);
        }
    }

    public void setNum(int i10) {
        String str;
        CheckBoxBase checkBoxBase = this.f26837a;
        if (i10 >= 0) {
            checkBoxBase.getClass();
            str = "" + (i10 + 1);
        } else if (checkBoxBase.f22964p != null) {
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

    public void setProgressDelegate(mp mpVar) {
        this.f26837a.D = mpVar;
    }
}
