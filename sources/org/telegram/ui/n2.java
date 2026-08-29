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
public final class n2 extends View implements org.telegram.ui.Cells.j9, i3 {
    public final d70 f40688a;
    public final k4 f40689b;
    public f3 f40690c;
    public final int d;
    public int f40691e;
    public TL_iv.pageBlockRelatedArticles f40692f;

    public n2(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.d = AndroidUtilities.dp(18.0f);
        this.f40688a = d70Var;
        this.f40689b = k4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f40690c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        f3 f3Var = this.f40690c;
        if (f3Var == null) {
            return -1;
        }
        int a2 = f3Var.a() + f3Var.f37974s;
        this.f40688a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        f3 f3Var = this.f40690c;
        if (f3Var == null) {
            return -1;
        }
        int b10 = f3Var.b() + f3Var.f37974s;
        this.f40688a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        f3 f3Var = this.f40690c;
        if (f3Var == null) {
            return -1;
        }
        int c3 = f3Var.c() + f3Var.f37974s;
        this.f40688a.getClass();
        return AndroidUtilities.dp(18) + c3;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f40690c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f40690c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40692f != null && this.f40690c != null) {
            canvas.save();
            canvas.translate(this.d, this.f40691e);
            m4.v(this.f40688a, canvas, this, 0);
            this.f40690c.draw(canvas, this);
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
        f3 f3Var = this.f40690c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(m4.i(R.string.AccDescrIVRelatedArticles, m4.j(this.f40688a, this.f40689b, f3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        n2 n2Var;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = this.f40692f;
        if (pageblockrelatedarticles != null) {
            TL_iv.pageBlockRelatedArticles pageblockrelatedarticles2 = this.f40692f;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            k4 k4Var = this.f40689b;
            n2Var = this;
            f3 p10 = m4.p(this.f40688a, n2Var, null, pageblockrelatedarticles.title, size - AndroidUtilities.dp(52.0f), 0, pageblockrelatedarticles2, alignment, 1, k4Var);
            n2Var.f40690c = p10;
            if (p10 != null) {
                n2Var.f40691e = ((AndroidUtilities.dp(32.0f) - n2Var.f40690c.d.getHeight()) / 2) + AndroidUtilities.dp(6.0f);
            }
        } else {
            n2Var = this;
        }
        if (n2Var.f40690c != null) {
            setMeasuredDimension(size, AndroidUtilities.dp(38.0f));
            f3 f3Var = n2Var.f40690c;
            f3Var.f37974s = n2Var.d;
            f3Var.v = n2Var.f40691e;
            return;
        }
        setMeasuredDimension(size, 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!m4.l(this.f40688a, this.f40689b, motionEvent, this, this.f40690c, this.d, this.f40691e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockRelatedArticles pageblockrelatedarticles) {
        this.f40692f = pageblockrelatedarticles;
        requestLayout();
    }
}
