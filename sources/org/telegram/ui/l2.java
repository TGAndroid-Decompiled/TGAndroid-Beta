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
public final class l2 extends View implements org.telegram.ui.Cells.m9, g3 {
    public final b70 f38721a;
    public final j4 f38722b;
    public d3 f38723c;
    public final int d;
    public int e;
    public TL_iv.pageBlockRelatedArticles f38724f;

    public l2(Context context, b70 b70Var, j4 j4Var) {
        super(context);
        this.d = AndroidUtilities.dp(18.0f);
        this.f38721a = b70Var;
        this.f38722b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f38723c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        d3 d3Var = this.f38723c;
        if (d3Var == null) {
            return -1;
        }
        int a2 = d3Var.a() + d3Var.f36241s;
        this.f38721a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        d3 d3Var = this.f38723c;
        if (d3Var == null) {
            return -1;
        }
        int b10 = d3Var.b() + d3Var.f36241s;
        this.f38721a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        d3 d3Var = this.f38723c;
        if (d3Var == null) {
            return -1;
        }
        int c10 = d3Var.c() + d3Var.f36241s;
        this.f38721a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.mk.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f38723c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f38723c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f38724f != null && this.f38723c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            l4.v(this.f38721a, canvas, this, 0);
            this.f38723c.draw(canvas, this);
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
        d3 d3Var = this.f38723c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrIVRelatedArticles, l4.j(this.f38721a, this.f38722b, d3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        l2 l2Var;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = this.f38724f;
        if (pageblockrelatedarticles != null) {
            TL_iv.pageBlockRelatedArticles pageblockrelatedarticles2 = this.f38724f;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            j4 j4Var = this.f38722b;
            l2Var = this;
            d3 p5 = l4.p(this.f38721a, l2Var, null, pageblockrelatedarticles.title, size - AndroidUtilities.dp(52.0f), 0, pageblockrelatedarticles2, alignment, 1, j4Var);
            l2Var.f38723c = p5;
            if (p5 != null) {
                l2Var.e = ((AndroidUtilities.dp(32.0f) - l2Var.f38723c.d.getHeight()) / 2) + AndroidUtilities.dp(6.0f);
            }
        } else {
            l2Var = this;
        }
        if (l2Var.f38723c != null) {
            setMeasuredDimension(size, AndroidUtilities.dp(38.0f));
            d3 d3Var = l2Var.f38723c;
            d3Var.f36241s = l2Var.d;
            d3Var.v = l2Var.e;
            return;
        }
        setMeasuredDimension(size, 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.f38721a, this.f38722b, motionEvent, this, this.f38723c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockRelatedArticles pageblockrelatedarticles) {
        this.f38724f = pageblockrelatedarticles;
        requestLayout();
    }
}
