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

public final class n2 extends View implements org.telegram.ui.Cells.i9, i3 {

    public final d70 f40642a;

    public final k4 f40643b;

    public f3 f40644c;
    public final int d;

    public int f40645e;

    public TL_iv.pageBlockRelatedArticles f40646f;

    public n2(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.d = AndroidUtilities.dp(18.0f);
        this.f40642a = d70Var;
        this.f40643b = k4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f40644c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        f3 f3Var = this.f40644c;
        if (f3Var == null) {
            return -1;
        }
        int iA = f3Var.a() + f3Var.f37923s;
        this.f40642a.getClass();
        return iA - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        f3 f3Var = this.f40644c;
        if (f3Var == null) {
            return -1;
        }
        int iB = f3Var.b() + f3Var.f37923s;
        this.f40642a.getClass();
        return AndroidUtilities.dp(18) + iB;
    }

    @Override
    public int getLastLineBoundRight() {
        f3 f3Var = this.f40644c;
        if (f3Var == null) {
            return -1;
        }
        int iC = f3Var.c() + f3Var.f37923s;
        this.f40642a.getClass();
        return AndroidUtilities.dp(18) + iC;
    }

    public int getMinWidth() {
        return org.telegram.messenger.rl.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f40644c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f40644c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40646f == null || this.f40644c == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.d, this.f40645e);
        m4.v(this.f40642a, canvas, this, 0);
        this.f40644c.draw(canvas, this);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        f3 f3Var = this.f40644c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(m4.i(R.string.AccDescrIVRelatedArticles, m4.j(this.f40642a, this.f40643b, f3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        n2 n2Var;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = this.f40646f;
        if (pageblockrelatedarticles != null) {
            n2Var = this;
            f3 f3VarP = m4.p(this.f40642a, n2Var, null, pageblockrelatedarticles.title, size - AndroidUtilities.dp(52.0f), 0, this.f40646f, Layout.Alignment.ALIGN_NORMAL, 1, this.f40643b);
            n2Var.f40644c = f3VarP;
            if (f3VarP != null) {
                n2Var.f40645e = ((AndroidUtilities.dp(32.0f) - n2Var.f40644c.d.getHeight()) / 2) + AndroidUtilities.dp(6.0f);
            }
        } else {
            n2Var = this;
        }
        if (n2Var.f40644c == null) {
            setMeasuredDimension(size, 1);
            return;
        }
        setMeasuredDimension(size, AndroidUtilities.dp(38.0f));
        f3 f3Var = n2Var.f40644c;
        f3Var.f37923s = n2Var.d;
        f3Var.v = n2Var.f40645e;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return m4.l(this.f40642a, this.f40643b, motionEvent, this, this.f40644c, this.d, this.f40645e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockRelatedArticles pageblockrelatedarticles) {
        this.f40646f = pageblockrelatedarticles;
        requestLayout();
    }
}
