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
public final class m2 extends View implements org.telegram.ui.Cells.m9, h3 {
    public final a70 f40300a;
    public final j4 f40301b;
    public e3 f40302c;
    public final int d;
    public int f40303e;
    public TL_iv.pageBlockRelatedArticles f40304f;

    public m2(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.d = AndroidUtilities.dp(18.0f);
        this.f40300a = a70Var;
        this.f40301b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.f40302c;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        e3 e3Var = this.f40302c;
        if (e3Var == null) {
            return -1;
        }
        int a2 = e3Var.a() + e3Var.f37805s;
        this.f40300a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        e3 e3Var = this.f40302c;
        if (e3Var == null) {
            return -1;
        }
        int b10 = e3Var.b() + e3Var.f37805s;
        this.f40300a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        e3 e3Var = this.f40302c;
        if (e3Var == null) {
            return -1;
        }
        int c10 = e3Var.c() + e3Var.f37805s;
        this.f40300a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ll.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.f40302c;
        if (e3Var != null) {
            e3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.f40302c;
        if (e3Var != null) {
            e3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40304f != null && this.f40302c != null) {
            canvas.save();
            canvas.translate(this.d, this.f40303e);
            l4.v(this.f40300a, canvas, this, 0);
            this.f40302c.draw(canvas, this);
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
        e3 e3Var = this.f40302c;
        if (e3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrIVRelatedArticles, l4.j(this.f40300a, this.f40301b, e3Var)));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        m2 m2Var;
        int size = View.MeasureSpec.getSize(i9);
        TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = this.f40304f;
        if (pageblockrelatedarticles != null) {
            TL_iv.pageBlockRelatedArticles pageblockrelatedarticles2 = this.f40304f;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            j4 j4Var = this.f40301b;
            m2Var = this;
            e3 p6 = l4.p(this.f40300a, m2Var, null, pageblockrelatedarticles.title, size - AndroidUtilities.dp(52.0f), 0, pageblockrelatedarticles2, alignment, 1, j4Var);
            m2Var.f40302c = p6;
            if (p6 != null) {
                m2Var.f40303e = ((AndroidUtilities.dp(32.0f) - m2Var.f40302c.d.getHeight()) / 2) + AndroidUtilities.dp(6.0f);
            }
        } else {
            m2Var = this;
        }
        if (m2Var.f40302c != null) {
            setMeasuredDimension(size, AndroidUtilities.dp(38.0f));
            e3 e3Var = m2Var.f40302c;
            e3Var.f37805s = m2Var.d;
            e3Var.v = m2Var.f40303e;
            return;
        }
        setMeasuredDimension(size, 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.f40300a, this.f40301b, motionEvent, this, this.f40302c, this.d, this.f40303e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockRelatedArticles pageblockrelatedarticles) {
        this.f40304f = pageblockrelatedarticles;
        requestLayout();
    }
}
