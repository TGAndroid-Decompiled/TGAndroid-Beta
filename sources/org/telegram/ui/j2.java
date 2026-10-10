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
public final class j2 extends View implements org.telegram.ui.Cells.n9, e3 {
    public final t70 f38852a;
    public final g4 f38853b;
    public b3 f38854c;
    public final int d;
    public int f38855e;
    public TL_iv.pageBlockRelatedArticles f38856f;

    public j2(Context context, t70 t70Var, g4 g4Var) {
        super(context);
        this.d = AndroidUtilities.dp(18.0f);
        this.f38852a = t70Var;
        this.f38853b = g4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f38854c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        b3 b3Var = this.f38854c;
        if (b3Var == null) {
            return -1;
        }
        int a2 = b3Var.a() + b3Var.f36161s;
        this.f38852a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        b3 b3Var = this.f38854c;
        if (b3Var == null) {
            return -1;
        }
        int b10 = b3Var.b() + b3Var.f36161s;
        this.f38852a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        b3 b3Var = this.f38854c;
        if (b3Var == null) {
            return -1;
        }
        int c10 = b3Var.c() + b3Var.f36161s;
        this.f38852a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.bi.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f38854c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f38854c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f38856f != null && this.f38854c != null) {
            canvas.save();
            canvas.translate(this.d, this.f38855e);
            i4.v(this.f38852a, canvas, this, 0);
            this.f38854c.draw(canvas, this);
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
        b3 b3Var = this.f38854c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.i(R.string.AccDescrIVRelatedArticles, i4.j(this.f38852a, this.f38853b, b3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        j2 j2Var;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = this.f38856f;
        if (pageblockrelatedarticles != null) {
            TL_iv.pageBlockRelatedArticles pageblockrelatedarticles2 = this.f38856f;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            g4 g4Var = this.f38853b;
            j2Var = this;
            b3 p5 = i4.p(this.f38852a, j2Var, null, pageblockrelatedarticles.title, size - AndroidUtilities.dp(52.0f), 0, pageblockrelatedarticles2, alignment, 1, g4Var);
            j2Var.f38854c = p5;
            if (p5 != null) {
                j2Var.f38855e = ((AndroidUtilities.dp(32.0f) - j2Var.f38854c.d.getHeight()) / 2) + AndroidUtilities.dp(6.0f);
            }
        } else {
            j2Var = this;
        }
        if (j2Var.f38854c != null) {
            setMeasuredDimension(size, AndroidUtilities.dp(38.0f));
            b3 b3Var = j2Var.f38854c;
            b3Var.f36161s = j2Var.d;
            b3Var.v = j2Var.f38855e;
            return;
        }
        setMeasuredDimension(size, 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.l(this.f38852a, this.f38853b, motionEvent, this, this.f38854c, this.d, this.f38855e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockRelatedArticles pageblockrelatedarticles) {
        this.f38856f = pageblockrelatedarticles;
        requestLayout();
    }
}
