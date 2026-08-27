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

public final class a2 extends View implements org.telegram.ui.Cells.i9, i3 {

    public final d70 f36335a;

    public final k4 f36336b;

    public f3 f36337c;
    public TL_iv.pageBlockKicker d;

    public int f36338e;

    public int f36339f;

    public a2(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f36335a = d70Var;
        this.f36336b = k4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f36337c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        f3 f3Var = this.f36337c;
        if (f3Var == null) {
            return -1;
        }
        int iA = f3Var.a() + f3Var.f37923s;
        this.f36335a.getClass();
        return iA - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        f3 f3Var = this.f36337c;
        if (f3Var == null) {
            return -1;
        }
        int iB = f3Var.b() + f3Var.f37923s;
        this.f36335a.getClass();
        return AndroidUtilities.dp(18) + iB;
    }

    @Override
    public int getLastLineBoundRight() {
        f3 f3Var = this.f36337c;
        if (f3Var == null) {
            return -1;
        }
        int iC = f3Var.c() + f3Var.f37923s;
        this.f36335a.getClass();
        return AndroidUtilities.dp(18) + iC;
    }

    public int getMinWidth() {
        return org.telegram.messenger.rl.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f36337c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f36337c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d == null || this.f36337c == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.f36338e, this.f36339f);
        m4.v(this.f36335a, canvas, this, 0);
        this.f36337c.draw(canvas, this);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        f3 f3Var = this.f36337c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(m4.i(R.string.AccDescrIVKicker, m4.j(this.f36335a, this.f36336b, f3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int height;
        int size = View.MeasureSpec.getSize(i10);
        d70 d70Var = this.f36335a;
        d70Var.getClass();
        this.f36338e = AndroidUtilities.dp(18);
        TL_iv.pageBlockKicker pageblockkicker = this.d;
        if (pageblockkicker != null) {
            if (pageblockkicker.first) {
                this.f36339f = AndroidUtilities.dp(16.0f);
                height = AndroidUtilities.dp(8.0f);
            } else {
                this.f36339f = AndroidUtilities.dp(8.0f);
                height = 0;
            }
            TL_iv.RichText richText = this.d.text;
            d70 d70Var2 = this.f36335a;
            d70Var2.getClass();
            int iDp = size - AndroidUtilities.dp(36);
            int i12 = this.f36339f;
            TL_iv.pageBlockKicker pageblockkicker2 = this.d;
            k4 k4Var = this.f36336b;
            f3 f3VarP = m4.p(d70Var2, this, null, richText, iDp, i12, pageblockkicker2, (k4Var == null || !k4Var.C) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.tv0.a(), 0, this.f36336b);
            this.f36337c = f3VarP;
            if (f3VarP != null) {
                d70Var.getClass();
                height += this.f36337c.d.getHeight() + AndroidUtilities.dp(16);
                f3 f3Var = this.f36337c;
                f3Var.f37923s = this.f36338e;
                f3Var.v = this.f36339f;
            }
        } else {
            height = 1;
        }
        setMeasuredDimension(size, height);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return m4.l(this.f36335a, this.f36336b, motionEvent, this, this.f36337c, this.f36338e, this.f36339f) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockKicker pageblockkicker) {
        this.d = pageblockkicker;
        requestLayout();
    }
}
