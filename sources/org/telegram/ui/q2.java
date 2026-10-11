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
public final class q2 extends View implements org.telegram.ui.Cells.n9, d3 {
    public final t70 f41022a;
    public final f4 f41023b;
    public a3 f41024c;
    public int d;
    public int f41025e;
    public TL_iv.pageBlockSubheader f41026f;

    public q2(Context context, t70 t70Var, f4 f4Var) {
        super(context);
        this.f41022a = t70Var;
        this.f41023b = f4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f41024c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        a3 a3Var = this.f41024c;
        if (a3Var == null) {
            return -1;
        }
        int a2 = a3Var.a() + a3Var.f35862s;
        this.f41022a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        a3 a3Var = this.f41024c;
        if (a3Var == null) {
            return -1;
        }
        int b10 = a3Var.b() + a3Var.f35862s;
        this.f41022a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        a3 a3Var = this.f41024c;
        if (a3Var == null) {
            return -1;
        }
        int c10 = a3Var.c() + a3Var.f35862s;
        this.f41022a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ai.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f41024c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f41024c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f41026f != null && this.f41024c != null) {
            canvas.save();
            canvas.translate(this.d, this.f41025e);
            h4.v(this.f41022a, canvas, this, 0);
            this.f41024c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f41024c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.i(R.string.AccDescrIVHeading, h4.j(this.f41022a, this.f41023b, a3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        t70 t70Var = this.f41022a;
        t70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        t70Var.getClass();
        this.f41025e = AndroidUtilities.dp(8);
        TL_iv.pageBlockSubheader pageblocksubheader = this.f41026f;
        if (pageblocksubheader != null) {
            TL_iv.RichText richText = pageblocksubheader.text;
            t70 t70Var2 = this.f41022a;
            t70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockSubheader pageblocksubheader2 = this.f41026f;
            f4 f4Var = this.f41023b;
            if (f4Var != null && f4Var.G) {
                alignment = org.telegram.ui.Components.ox0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            a3 p5 = h4.p(t70Var2, this, null, richText, dp, 0, pageblocksubheader2, alignment, 0, this.f41023b);
            this.f41024c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight() + this.f41025e;
                int i13 = this.f41025e;
                i12 = height + i13;
                a3 a3Var = this.f41024c;
                a3Var.f35862s = this.d;
                a3Var.v = i13;
            } else {
                i12 = 0;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!h4.l(this.f41022a, this.f41023b, motionEvent, this, this.f41024c, this.d, this.f41025e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockSubheader pageblocksubheader) {
        this.f41026f = pageblocksubheader;
        requestLayout();
    }
}
