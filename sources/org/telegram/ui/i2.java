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
public final class i2 extends View implements org.telegram.ui.Cells.r9, e3 {
    public final h70 f40121a;
    public final h4 f40122b;
    public a3 f40123c;
    public final int d;
    public int e;
    public TL_iv.pageBlockRelatedArticles f40124f;

    public i2(Context context, h70 h70Var, h4 h4Var) {
        super(context);
        this.d = AndroidUtilities.dp(18.0f);
        this.f40121a = h70Var;
        this.f40122b = h4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f40123c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        a3 a3Var = this.f40123c;
        if (a3Var == null) {
            return -1;
        }
        int a2 = a3Var.a() + a3Var.f37634s;
        this.f40121a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        a3 a3Var = this.f40123c;
        if (a3Var == null) {
            return -1;
        }
        int b10 = a3Var.b() + a3Var.f37634s;
        this.f40121a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        a3 a3Var = this.f40123c;
        if (a3Var == null) {
            return -1;
        }
        int c10 = a3Var.c() + a3Var.f37634s;
        this.f40121a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return d3.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f40123c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f40123c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40124f != null && this.f40123c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            j4.v(this.f40121a, canvas, this, 0);
            this.f40123c.draw(canvas, this);
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
        a3 a3Var = this.f40123c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.i(R.string.AccDescrIVRelatedArticles, j4.j(this.f40121a, this.f40122b, a3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        i2 i2Var;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = this.f40124f;
        if (pageblockrelatedarticles != null) {
            TL_iv.pageBlockRelatedArticles pageblockrelatedarticles2 = this.f40124f;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            h4 h4Var = this.f40122b;
            i2Var = this;
            a3 p10 = j4.p(this.f40121a, i2Var, null, pageblockrelatedarticles.title, size - AndroidUtilities.dp(52.0f), 0, pageblockrelatedarticles2, alignment, 1, h4Var);
            i2Var.f40123c = p10;
            if (p10 != null) {
                i2Var.e = ((AndroidUtilities.dp(32.0f) - i2Var.f40123c.d.getHeight()) / 2) + AndroidUtilities.dp(6.0f);
            }
        } else {
            i2Var = this;
        }
        if (i2Var.f40123c != null) {
            setMeasuredDimension(size, AndroidUtilities.dp(38.0f));
            a3 a3Var = i2Var.f40123c;
            a3Var.f37634s = i2Var.d;
            a3Var.v = i2Var.e;
            return;
        }
        setMeasuredDimension(size, 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!j4.l(this.f40121a, this.f40122b, motionEvent, this, this.f40123c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockRelatedArticles pageblockrelatedarticles) {
        this.f40124f = pageblockrelatedarticles;
        requestLayout();
    }
}
