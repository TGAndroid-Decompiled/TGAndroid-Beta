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
public final class k2 extends View implements org.telegram.ui.Cells.r9, f3 {
    public final t70 f34198a;
    public final h4 f34199b;
    public c3 f34200c;
    public final int d;
    public int e;
    public TL_iv.pageBlockRelatedArticles f34201f;

    public k2(Context context, t70 t70Var, h4 h4Var) {
        super(context);
        this.d = AndroidUtilities.dp(18.0f);
        this.f34198a = t70Var;
        this.f34199b = h4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f34200c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        c3 c3Var = this.f34200c;
        if (c3Var == null) {
            return -1;
        }
        int a2 = c3Var.a() + c3Var.f31515s;
        this.f34198a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        c3 c3Var = this.f34200c;
        if (c3Var == null) {
            return -1;
        }
        int b10 = c3Var.b() + c3Var.f31515s;
        this.f34198a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        c3 c3Var = this.f34200c;
        if (c3Var == null) {
            return -1;
        }
        int c10 = c3Var.c() + c3Var.f31515s;
        this.f34198a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.em.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f34200c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f34200c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f34201f != null && this.f34200c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            j4.v(this.f34198a, canvas, this, 0);
            this.f34200c.draw(canvas, this);
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
        c3 c3Var = this.f34200c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.i(R.string.AccDescrIVRelatedArticles, j4.j(this.f34198a, this.f34199b, c3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        k2 k2Var;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = this.f34201f;
        if (pageblockrelatedarticles != null) {
            TL_iv.pageBlockRelatedArticles pageblockrelatedarticles2 = this.f34201f;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            h4 h4Var = this.f34199b;
            k2Var = this;
            c3 p5 = j4.p(this.f34198a, k2Var, null, pageblockrelatedarticles.title, size - AndroidUtilities.dp(52.0f), 0, pageblockrelatedarticles2, alignment, 1, h4Var);
            k2Var.f34200c = p5;
            if (p5 != null) {
                k2Var.e = ((AndroidUtilities.dp(32.0f) - k2Var.f34200c.d.getHeight()) / 2) + AndroidUtilities.dp(6.0f);
            }
        } else {
            k2Var = this;
        }
        if (k2Var.f34200c != null) {
            setMeasuredDimension(size, AndroidUtilities.dp(38.0f));
            c3 c3Var = k2Var.f34200c;
            c3Var.f31515s = k2Var.d;
            c3Var.v = k2Var.e;
            return;
        }
        setMeasuredDimension(size, 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!j4.l(this.f34198a, this.f34199b, motionEvent, this, this.f34200c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockRelatedArticles pageblockrelatedarticles) {
        this.f34201f = pageblockrelatedarticles;
        requestLayout();
    }
}
