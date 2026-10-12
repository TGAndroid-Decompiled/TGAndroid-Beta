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
public final class l2 extends View implements org.telegram.ui.Cells.n9, g3 {
    public final z70 f37817a;
    public final i4 f37818b;
    public d3 f37819c;
    public final int d;
    public int e;
    public TL_iv.pageBlockRelatedArticles f37820f;

    public l2(Context context, z70 z70Var, i4 i4Var) {
        super(context);
        this.d = AndroidUtilities.dp(18.0f);
        this.f37817a = z70Var;
        this.f37818b = i4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f37819c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        d3 d3Var = this.f37819c;
        if (d3Var == null) {
            return -1;
        }
        int a2 = d3Var.a() + d3Var.f35132s;
        this.f37817a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        d3 d3Var = this.f37819c;
        if (d3Var == null) {
            return -1;
        }
        int b10 = d3Var.b() + d3Var.f35132s;
        this.f37817a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        d3 d3Var = this.f37819c;
        if (d3Var == null) {
            return -1;
        }
        int c10 = d3Var.c() + d3Var.f35132s;
        this.f37817a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.yh.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f37819c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f37819c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37820f != null && this.f37819c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            k4.v(this.f37817a, canvas, this, 0);
            this.f37819c.draw(canvas, this);
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
        d3 d3Var = this.f37819c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(k4.i(R.string.AccDescrIVRelatedArticles, k4.j(this.f37817a, this.f37818b, d3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        l2 l2Var;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = this.f37820f;
        if (pageblockrelatedarticles != null) {
            TL_iv.pageBlockRelatedArticles pageblockrelatedarticles2 = this.f37820f;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            i4 i4Var = this.f37818b;
            l2Var = this;
            d3 p5 = k4.p(this.f37817a, l2Var, null, pageblockrelatedarticles.title, size - AndroidUtilities.dp(52.0f), 0, pageblockrelatedarticles2, alignment, 1, i4Var);
            l2Var.f37819c = p5;
            if (p5 != null) {
                l2Var.e = ((AndroidUtilities.dp(32.0f) - l2Var.f37819c.d.getHeight()) / 2) + AndroidUtilities.dp(6.0f);
            }
        } else {
            l2Var = this;
        }
        if (l2Var.f37819c != null) {
            setMeasuredDimension(size, AndroidUtilities.dp(38.0f));
            d3 d3Var = l2Var.f37819c;
            d3Var.f35132s = l2Var.d;
            d3Var.v = l2Var.e;
            return;
        }
        setMeasuredDimension(size, 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!k4.l(this.f37817a, this.f37818b, motionEvent, this, this.f37819c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockRelatedArticles pageblockrelatedarticles) {
        this.f37820f = pageblockrelatedarticles;
        requestLayout();
    }
}
