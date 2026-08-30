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
public final class l2 extends View implements org.telegram.ui.Cells.l9, g3 {
    public final n70 f35875a;
    public final j4 f35876b;
    public d3 f35877c;
    public final int d;
    public int e;
    public TL_iv.pageBlockRelatedArticles f35878f;

    public l2(Context context, n70 n70Var, j4 j4Var) {
        super(context);
        this.d = AndroidUtilities.dp(18.0f);
        this.f35875a = n70Var;
        this.f35876b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f35877c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        d3 d3Var = this.f35877c;
        if (d3Var == null) {
            return -1;
        }
        int a2 = d3Var.a() + d3Var.f33499s;
        this.f35875a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        d3 d3Var = this.f35877c;
        if (d3Var == null) {
            return -1;
        }
        int b10 = d3Var.b() + d3Var.f33499s;
        this.f35875a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        d3 d3Var = this.f35877c;
        if (d3Var == null) {
            return -1;
        }
        int c3 = d3Var.c() + d3Var.f33499s;
        this.f35875a.getClass();
        return AndroidUtilities.dp(18) + c3;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f35877c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f35877c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f35878f != null && this.f35877c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            l4.v(this.f35875a, canvas, this, 0);
            this.f35877c.draw(canvas, this);
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
        d3 d3Var = this.f35877c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrIVRelatedArticles, l4.j(this.f35875a, this.f35876b, d3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        l2 l2Var;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = this.f35878f;
        if (pageblockrelatedarticles != null) {
            TL_iv.pageBlockRelatedArticles pageblockrelatedarticles2 = this.f35878f;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            j4 j4Var = this.f35876b;
            l2Var = this;
            d3 p10 = l4.p(this.f35875a, l2Var, null, pageblockrelatedarticles.title, size - AndroidUtilities.dp(52.0f), 0, pageblockrelatedarticles2, alignment, 1, j4Var);
            l2Var.f35877c = p10;
            if (p10 != null) {
                l2Var.e = ((AndroidUtilities.dp(32.0f) - l2Var.f35877c.d.getHeight()) / 2) + AndroidUtilities.dp(6.0f);
            }
        } else {
            l2Var = this;
        }
        if (l2Var.f35877c != null) {
            setMeasuredDimension(size, AndroidUtilities.dp(38.0f));
            d3 d3Var = l2Var.f35877c;
            d3Var.f33499s = l2Var.d;
            d3Var.v = l2Var.e;
            return;
        }
        setMeasuredDimension(size, 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.f35875a, this.f35876b, motionEvent, this, this.f35877c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockRelatedArticles pageblockrelatedarticles) {
        this.f35878f = pageblockrelatedarticles;
        requestLayout();
    }
}
