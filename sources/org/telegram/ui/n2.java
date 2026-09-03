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
public final class n2 extends View implements org.telegram.ui.Cells.k9, i3 {
    public final p70 f36312a;
    public final l4 f36313b;
    public f3 f36314c;
    public final int d;
    public int e;
    public TL_iv.pageBlockRelatedArticles f36315f;

    public n2(Context context, p70 p70Var, l4 l4Var) {
        super(context);
        this.d = AndroidUtilities.dp(18.0f);
        this.f36312a = p70Var;
        this.f36313b = l4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f36314c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        f3 f3Var = this.f36314c;
        if (f3Var == null) {
            return -1;
        }
        int a2 = f3Var.a() + f3Var.f33933s;
        this.f36312a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        f3 f3Var = this.f36314c;
        if (f3Var == null) {
            return -1;
        }
        int b10 = f3Var.b() + f3Var.f33933s;
        this.f36312a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        f3 f3Var = this.f36314c;
        if (f3Var == null) {
            return -1;
        }
        int c3 = f3Var.c() + f3Var.f33933s;
        this.f36312a.getClass();
        return AndroidUtilities.dp(18) + c3;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f36314c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f36314c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f36315f != null && this.f36314c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            n4.v(this.f36312a, canvas, this, 0);
            this.f36314c.draw(canvas, this);
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
        f3 f3Var = this.f36314c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(n4.i(R.string.AccDescrIVRelatedArticles, n4.j(this.f36312a, this.f36313b, f3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        n2 n2Var;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = this.f36315f;
        if (pageblockrelatedarticles != null) {
            TL_iv.pageBlockRelatedArticles pageblockrelatedarticles2 = this.f36315f;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            l4 l4Var = this.f36313b;
            n2Var = this;
            f3 p10 = n4.p(this.f36312a, n2Var, null, pageblockrelatedarticles.title, size - AndroidUtilities.dp(52.0f), 0, pageblockrelatedarticles2, alignment, 1, l4Var);
            n2Var.f36314c = p10;
            if (p10 != null) {
                n2Var.e = ((AndroidUtilities.dp(32.0f) - n2Var.f36314c.d.getHeight()) / 2) + AndroidUtilities.dp(6.0f);
            }
        } else {
            n2Var = this;
        }
        if (n2Var.f36314c != null) {
            setMeasuredDimension(size, AndroidUtilities.dp(38.0f));
            f3 f3Var = n2Var.f36314c;
            f3Var.f33933s = n2Var.d;
            f3Var.v = n2Var.e;
            return;
        }
        setMeasuredDimension(size, 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!n4.l(this.f36312a, this.f36313b, motionEvent, this, this.f36314c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockRelatedArticles pageblockrelatedarticles) {
        this.f36315f = pageblockrelatedarticles;
        requestLayout();
    }
}
