package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
public final class a2 extends View implements org.telegram.ui.Cells.k9, i3 {
    public final p70 f32428a;
    public final l4 f32429b;
    public f3 f32430c;
    public TL_iv.pageBlockKicker d;
    public int e;
    public int f32431f;

    public a2(Context context, p70 p70Var, l4 l4Var) {
        super(context);
        this.f32428a = p70Var;
        this.f32429b = l4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f32430c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        f3 f3Var = this.f32430c;
        if (f3Var == null) {
            return -1;
        }
        int a2 = f3Var.a() + f3Var.f33933s;
        this.f32428a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        f3 f3Var = this.f32430c;
        if (f3Var == null) {
            return -1;
        }
        int b10 = f3Var.b() + f3Var.f33933s;
        this.f32428a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        f3 f3Var = this.f32430c;
        if (f3Var == null) {
            return -1;
        }
        int c3 = f3Var.c() + f3Var.f33933s;
        this.f32428a.getClass();
        return AndroidUtilities.dp(18) + c3;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f32430c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f32430c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null && this.f32430c != null) {
            canvas.save();
            canvas.translate(this.e, this.f32431f);
            n4.v(this.f32428a, canvas, this, 0);
            this.f32430c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        f3 f3Var = this.f32430c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(n4.i(R.string.AccDescrIVKicker, n4.j(this.f32428a, this.f32429b, f3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        p70 p70Var = this.f32428a;
        p70Var.getClass();
        this.e = AndroidUtilities.dp(18);
        TL_iv.pageBlockKicker pageblockkicker = this.d;
        if (pageblockkicker != null) {
            if (pageblockkicker.first) {
                this.f32431f = AndroidUtilities.dp(16.0f);
                i12 = AndroidUtilities.dp(8.0f);
            } else {
                this.f32431f = AndroidUtilities.dp(8.0f);
                i12 = 0;
            }
            TL_iv.RichText richText = this.d.text;
            p70 p70Var2 = this.f32428a;
            p70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            int i13 = this.f32431f;
            TL_iv.pageBlockKicker pageblockkicker2 = this.d;
            l4 l4Var = this.f32429b;
            if (l4Var != null && l4Var.D) {
                alignment = org.telegram.ui.Components.kw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            f3 p10 = n4.p(p70Var2, this, null, richText, dp, i13, pageblockkicker2, alignment, 0, this.f32429b);
            this.f32430c = p10;
            if (p10 != null) {
                p70Var.getClass();
                i12 += this.f32430c.d.getHeight() + AndroidUtilities.dp(16);
                f3 f3Var = this.f32430c;
                f3Var.f33933s = this.e;
                f3Var.v = this.f32431f;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!n4.l(this.f32428a, this.f32429b, motionEvent, this, this.f32430c, this.e, this.f32431f) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockKicker pageblockkicker) {
        this.d = pageblockkicker;
        requestLayout();
    }
}
