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
    public final o70 f38469a;
    public final j4 f38470b;
    public d3 f38471c;
    public final int d;
    public int f38472e;
    public TL_iv.pageBlockRelatedArticles f38473f;

    public l2(Context context, o70 o70Var, j4 j4Var) {
        super(context);
        this.d = AndroidUtilities.dp(18.0f);
        this.f38469a = o70Var;
        this.f38470b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f38471c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        d3 d3Var = this.f38471c;
        if (d3Var == null) {
            return -1;
        }
        int a2 = d3Var.a() + d3Var.f35964s;
        this.f38469a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        d3 d3Var = this.f38471c;
        if (d3Var == null) {
            return -1;
        }
        int b10 = d3Var.b() + d3Var.f35964s;
        this.f38469a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        d3 d3Var = this.f38471c;
        if (d3Var == null) {
            return -1;
        }
        int c3 = d3Var.c() + d3Var.f35964s;
        this.f38469a.getClass();
        return AndroidUtilities.dp(18) + c3;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f38471c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f38471c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f38473f != null && this.f38471c != null) {
            canvas.save();
            canvas.translate(this.d, this.f38472e);
            l4.v(this.f38469a, canvas, this, 0);
            this.f38471c.draw(canvas, this);
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
        d3 d3Var = this.f38471c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrIVRelatedArticles, l4.j(this.f38469a, this.f38470b, d3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        l2 l2Var;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = this.f38473f;
        if (pageblockrelatedarticles != null) {
            TL_iv.pageBlockRelatedArticles pageblockrelatedarticles2 = this.f38473f;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            j4 j4Var = this.f38470b;
            l2Var = this;
            d3 p10 = l4.p(this.f38469a, l2Var, null, pageblockrelatedarticles.title, size - AndroidUtilities.dp(52.0f), 0, pageblockrelatedarticles2, alignment, 1, j4Var);
            l2Var.f38471c = p10;
            if (p10 != null) {
                l2Var.f38472e = ((AndroidUtilities.dp(32.0f) - l2Var.f38471c.d.getHeight()) / 2) + AndroidUtilities.dp(6.0f);
            }
        } else {
            l2Var = this;
        }
        if (l2Var.f38471c != null) {
            setMeasuredDimension(size, AndroidUtilities.dp(38.0f));
            d3 d3Var = l2Var.f38471c;
            d3Var.f35964s = l2Var.d;
            d3Var.v = l2Var.f38472e;
            return;
        }
        setMeasuredDimension(size, 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.f38469a, this.f38470b, motionEvent, this, this.f38471c, this.d, this.f38472e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockRelatedArticles pageblockrelatedarticles) {
        this.f38473f = pageblockrelatedarticles;
        requestLayout();
    }
}
