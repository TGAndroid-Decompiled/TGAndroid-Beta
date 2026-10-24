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
public final class k2 extends View implements org.telegram.ui.Cells.n9, f3 {
    public final f70 f38718a;
    public final i4 f38719b;
    public c3 f38720c;
    public final int d;
    public int e;
    public TL_iv.pageBlockRelatedArticles f38721f;

    public k2(Context context, f70 f70Var, i4 i4Var) {
        super(context);
        this.d = AndroidUtilities.dp(18.0f);
        this.f38718a = f70Var;
        this.f38719b = i4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f38720c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        c3 c3Var = this.f38720c;
        if (c3Var == null) {
            return -1;
        }
        int a2 = c3Var.a() + c3Var.f36208s;
        this.f38718a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        c3 c3Var = this.f38720c;
        if (c3Var == null) {
            return -1;
        }
        int b10 = c3Var.b() + c3Var.f36208s;
        this.f38718a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        c3 c3Var = this.f38720c;
        if (c3Var == null) {
            return -1;
        }
        int c10 = c3Var.c() + c3Var.f36208s;
        this.f38718a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.tl.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f38720c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f38720c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f38721f != null && this.f38720c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            k4.v(this.f38718a, canvas, this, 0);
            this.f38720c.draw(canvas, this);
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
        c3 c3Var = this.f38720c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(k4.i(R.string.AccDescrIVRelatedArticles, k4.j(this.f38718a, this.f38719b, c3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        k2 k2Var;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = this.f38721f;
        if (pageblockrelatedarticles != null) {
            TL_iv.pageBlockRelatedArticles pageblockrelatedarticles2 = this.f38721f;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            i4 i4Var = this.f38719b;
            k2Var = this;
            c3 p5 = k4.p(this.f38718a, k2Var, null, pageblockrelatedarticles.title, size - AndroidUtilities.dp(52.0f), 0, pageblockrelatedarticles2, alignment, 1, i4Var);
            k2Var.f38720c = p5;
            if (p5 != null) {
                k2Var.e = ((AndroidUtilities.dp(32.0f) - k2Var.f38720c.d.getHeight()) / 2) + AndroidUtilities.dp(6.0f);
            }
        } else {
            k2Var = this;
        }
        if (k2Var.f38720c != null) {
            setMeasuredDimension(size, AndroidUtilities.dp(38.0f));
            c3 c3Var = k2Var.f38720c;
            c3Var.f36208s = k2Var.d;
            c3Var.v = k2Var.e;
            return;
        }
        setMeasuredDimension(size, 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!k4.l(this.f38718a, this.f38719b, motionEvent, this, this.f38720c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockRelatedArticles pageblockrelatedarticles) {
        this.f38721f = pageblockrelatedarticles;
        requestLayout();
    }
}
