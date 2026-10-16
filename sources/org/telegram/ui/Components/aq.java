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
public class aq extends View {
    public final CheckBoxBase f23281a;
    public Drawable f23282b;
    public int f23283c;

    public aq(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f23281a = new CheckBoxBase(i10, this, c6Var);
    }

    public final void a(boolean z10, boolean z11) {
        this.f23281a.f(-1, z10, z11);
    }

    public final void b(int i10, int i11, int i12) {
        this.f23281a.h(i10, i11, i12);
    }

    public CheckBoxBase getCheckBoxBase() {
        return this.f23281a;
    }

    public boolean getDrawUnchecked() {
        return this.f23281a.f22800z;
    }

    public float getProgress() {
        return this.f23281a.getProgress();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23281a.f22787l = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23281a.f22787l = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f23282b != null) {
            int measuredWidth = getMeasuredWidth() >> 1;
            int measuredHeight = getMeasuredHeight() >> 1;
            Drawable drawable = this.f23282b;
            drawable.setBounds(org.telegram.ui.Cells.c1.r(2, measuredWidth, drawable), org.telegram.ui.Cells.c1.c(2, measuredHeight, this.f23282b), org.telegram.ui.Cells.c1.v(2, measuredWidth, this.f23282b), org.telegram.ui.Cells.c1.u(2, measuredHeight, this.f23282b));
            this.f23282b.draw(canvas);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(1.2f));
            paint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.U6, false));
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth - AndroidUtilities.dp(1.5f), paint);
            return;
        }
        this.f23281a.a(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f23281a.f22792q);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f23281a.e(0, 0, i12 - i10, i13 - i11);
    }

    public void setCirclePaintProvider(GenericProvider<Void, Paint> genericProvider) {
        CheckBoxBase checkBoxBase = this.f23281a;
        if (checkBoxBase.G == genericProvider) {
            return;
        }
        checkBoxBase.G = genericProvider;
        checkBoxBase.b();
    }

    public void setDrawBackgroundAsArc(int i10) {
        this.f23281a.d(i10);
    }

    public void setDrawUnchecked(boolean z10) {
        this.f23281a.k(z10);
    }

    public void setDuration(long j10) {
        this.f23281a.H = j10;
    }

    @Override
    public void setEnabled(boolean z10) {
        CheckBoxBase checkBoxBase = this.f23281a;
        if (checkBoxBase.f22786k != z10) {
            checkBoxBase.f22786k = z10;
            checkBoxBase.b();
        }
        super.setEnabled(z10);
    }

    public void setForbidden(boolean z10) {
        CheckBoxBase checkBoxBase = this.f23281a;
        if (checkBoxBase.f22789n == z10) {
            return;
        }
        checkBoxBase.f22789n = z10;
        checkBoxBase.b();
    }

    public void setIcon(int i10) {
        if (i10 != this.f23283c) {
            this.f23283c = i10;
            if (i10 == 0) {
                this.f23282b = null;
                return;
            }
            Drawable mutate = getContext().getDrawable(i10).mutate();
            this.f23282b = mutate;
            mutate.setColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.U6, false), PorterDuff.Mode.MULTIPLY);
        }
    }

    public void setNum(int i10) {
        String str;
        CheckBoxBase checkBoxBase = this.f23281a;
        if (i10 >= 0) {
            checkBoxBase.getClass();
            str = "" + (i10 + 1);
        } else if (checkBoxBase.f22791p != null) {
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

    public void setProgressDelegate(bq bqVar) {
        this.f23281a.D = bqVar;
    }
}
