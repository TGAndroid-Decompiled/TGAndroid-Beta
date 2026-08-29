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
public final class a2 extends View implements org.telegram.ui.Cells.j9, i3 {
    public final d70 f36396a;
    public final k4 f36397b;
    public f3 f36398c;
    public TL_iv.pageBlockKicker d;
    public int f36399e;
    public int f36400f;

    public a2(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f36396a = d70Var;
        this.f36397b = k4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f36398c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        f3 f3Var = this.f36398c;
        if (f3Var == null) {
            return -1;
        }
        int a2 = f3Var.a() + f3Var.f37974s;
        this.f36396a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        f3 f3Var = this.f36398c;
        if (f3Var == null) {
            return -1;
        }
        int b10 = f3Var.b() + f3Var.f37974s;
        this.f36396a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        f3 f3Var = this.f36398c;
        if (f3Var == null) {
            return -1;
        }
        int c3 = f3Var.c() + f3Var.f37974s;
        this.f36396a.getClass();
        return AndroidUtilities.dp(18) + c3;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f36398c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f36398c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null && this.f36398c != null) {
            canvas.save();
            canvas.translate(this.f36399e, this.f36400f);
            m4.v(this.f36396a, canvas, this, 0);
            this.f36398c.draw(canvas, this);
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
        f3 f3Var = this.f36398c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(m4.i(R.string.AccDescrIVKicker, m4.j(this.f36396a, this.f36397b, f3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        d70 d70Var = this.f36396a;
        d70Var.getClass();
        this.f36399e = AndroidUtilities.dp(18);
        TL_iv.pageBlockKicker pageblockkicker = this.d;
        if (pageblockkicker != null) {
            if (pageblockkicker.first) {
                this.f36400f = AndroidUtilities.dp(16.0f);
                i12 = AndroidUtilities.dp(8.0f);
            } else {
                this.f36400f = AndroidUtilities.dp(8.0f);
                i12 = 0;
            }
            TL_iv.RichText richText = this.d.text;
            d70 d70Var2 = this.f36396a;
            d70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            int i13 = this.f36400f;
            TL_iv.pageBlockKicker pageblockkicker2 = this.d;
            k4 k4Var = this.f36397b;
            if (k4Var != null && k4Var.C) {
                alignment = org.telegram.ui.Components.bw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            f3 p10 = m4.p(d70Var2, this, null, richText, dp, i13, pageblockkicker2, alignment, 0, this.f36397b);
            this.f36398c = p10;
            if (p10 != null) {
                d70Var.getClass();
                i12 += this.f36398c.d.getHeight() + AndroidUtilities.dp(16);
                f3 f3Var = this.f36398c;
                f3Var.f37974s = this.f36399e;
                f3Var.v = this.f36400f;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!m4.l(this.f36396a, this.f36397b, motionEvent, this, this.f36398c, this.f36399e, this.f36400f) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockKicker pageblockkicker) {
        this.d = pageblockkicker;
        requestLayout();
    }
}
