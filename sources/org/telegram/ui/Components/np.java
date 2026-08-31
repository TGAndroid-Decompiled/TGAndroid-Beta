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
    public final CheckBoxBase f29606a;
    public Drawable f29607b;
    public int f29608c;

    public np(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f29606a = new CheckBoxBase(i10, this, g6Var);
    }

    public final void a(boolean z4, boolean z10) {
        this.f29606a.f(-1, z4, z10);
    }

    public final void b(int i10, int i11, int i12) {
        this.f29606a.h(i10, i11, i12);
    }

    public CheckBoxBase getCheckBoxBase() {
        return this.f29606a;
    }

    public boolean getDrawUnchecked() {
        return this.f29606a.f24817z;
    }

    public float getProgress() {
        return this.f29606a.getProgress();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29606a.f24804l = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29606a.f24804l = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f29607b != null) {
            int measuredWidth = getMeasuredWidth() >> 1;
            int measuredHeight = getMeasuredHeight() >> 1;
            Drawable drawable = this.f29607b;
            drawable.setBounds(org.telegram.ui.b.u(2, measuredWidth, drawable), org.telegram.ui.b.f(2, measuredHeight, this.f29607b), org.telegram.ui.b.A(2, measuredWidth, this.f29607b), org.telegram.ui.b.y(2, measuredHeight, this.f29607b));
            this.f29607b.draw(canvas);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(1.2f));
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.U6, false));
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth - AndroidUtilities.dp(1.5f), paint);
            return;
        }
        this.f29606a.a(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f29606a.f24809q);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.f29606a.e(0, 0, i12 - i10, i13 - i11);
    }

    public void setCirclePaintProvider(GenericProvider<Void, Paint> genericProvider) {
        CheckBoxBase checkBoxBase = this.f29606a;
        if (checkBoxBase.G == genericProvider) {
            return;
        }
        checkBoxBase.G = genericProvider;
        checkBoxBase.b();
    }

    public void setDrawBackgroundAsArc(int i10) {
        this.f29606a.d(i10);
    }

    public void setDrawUnchecked(boolean z4) {
        this.f29606a.k(z4);
    }

    public void setDuration(long j10) {
        this.f29606a.H = j10;
    }

    @Override
    public void setEnabled(boolean z4) {
        CheckBoxBase checkBoxBase = this.f29606a;
        if (checkBoxBase.f24803k != z4) {
            checkBoxBase.f24803k = z4;
            checkBoxBase.b();
        }
        super.setEnabled(z4);
    }

    public void setForbidden(boolean z4) {
        CheckBoxBase checkBoxBase = this.f29606a;
        if (checkBoxBase.f24806n == z4) {
            return;
        }
        checkBoxBase.f24806n = z4;
        checkBoxBase.b();
    }

    public void setIcon(int i10) {
        if (i10 != this.f29608c) {
            this.f29608c = i10;
            if (i10 == 0) {
                this.f29607b = null;
                return;
            }
            Drawable mutate = getContext().getDrawable(i10).mutate();
            this.f29607b = mutate;
            mutate.setColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.U6, false), PorterDuff.Mode.MULTIPLY);
        }
    }

    public void setNum(int i10) {
        String str;
        CheckBoxBase checkBoxBase = this.f29606a;
        if (i10 >= 0) {
            checkBoxBase.getClass();
            str = "" + (i10 + 1);
        } else if (checkBoxBase.f24808p != null) {
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
        this.f29606a.D = opVar;
    }
}
