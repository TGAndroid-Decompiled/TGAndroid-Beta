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
public final class i2 extends View implements org.telegram.ui.Cells.p9, d3 {
    public final u70 f34296a;
    public final f4 f34297b;
    public a3 f34298c;
    public final int d;
    public int e;
    public TL_iv.pageBlockRelatedArticles f34299f;

    public i2(Context context, u70 u70Var, f4 f4Var) {
        super(context);
        this.d = AndroidUtilities.dp(18.0f);
        this.f34296a = u70Var;
        this.f34297b = f4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f34298c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        a3 a3Var = this.f34298c;
        if (a3Var == null) {
            return -1;
        }
        int a2 = a3Var.a() + a3Var.f31935s;
        this.f34296a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        a3 a3Var = this.f34298c;
        if (a3Var == null) {
            return -1;
        }
        int b10 = a3Var.b() + a3Var.f31935s;
        this.f34296a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        a3 a3Var = this.f34298c;
        if (a3Var == null) {
            return -1;
        }
        int c10 = a3Var.c() + a3Var.f31935s;
        this.f34296a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.wh.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f34298c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f34298c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f34299f != null && this.f34298c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            h4.v(this.f34296a, canvas, this, 0);
            this.f34298c.draw(canvas, this);
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
        a3 a3Var = this.f34298c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.i(R.string.AccDescrIVRelatedArticles, h4.j(this.f34296a, this.f34297b, a3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        i2 i2Var;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = this.f34299f;
        if (pageblockrelatedarticles != null) {
            TL_iv.pageBlockRelatedArticles pageblockrelatedarticles2 = this.f34299f;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            f4 f4Var = this.f34297b;
            i2Var = this;
            a3 p5 = h4.p(this.f34296a, i2Var, null, pageblockrelatedarticles.title, size - AndroidUtilities.dp(52.0f), 0, pageblockrelatedarticles2, alignment, 1, f4Var);
            i2Var.f34298c = p5;
            if (p5 != null) {
                i2Var.e = ((AndroidUtilities.dp(32.0f) - i2Var.f34298c.d.getHeight()) / 2) + AndroidUtilities.dp(6.0f);
            }
        } else {
            i2Var = this;
        }
        if (i2Var.f34298c != null) {
            setMeasuredDimension(size, AndroidUtilities.dp(38.0f));
            a3 a3Var = i2Var.f34298c;
            a3Var.f31935s = i2Var.d;
            a3Var.v = i2Var.e;
            return;
        }
        setMeasuredDimension(size, 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!h4.l(this.f34296a, this.f34297b, motionEvent, this, this.f34298c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockRelatedArticles pageblockrelatedarticles) {
        this.f34299f = pageblockrelatedarticles;
        requestLayout();
    }
}
