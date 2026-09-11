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
public final class j2 extends View implements org.telegram.ui.Cells.p9, e3 {
    public final v70 f37490a;
    public final g4 f37491b;
    public b3 f37492c;
    public final int d;
    public int f37493e;
    public TL_iv.pageBlockRelatedArticles f37494f;

    public j2(Context context, v70 v70Var, g4 g4Var) {
        super(context);
        this.d = AndroidUtilities.dp(18.0f);
        this.f37490a = v70Var;
        this.f37491b = g4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f37492c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        b3 b3Var = this.f37492c;
        if (b3Var == null) {
            return -1;
        }
        int a2 = b3Var.a() + b3Var.f34617s;
        this.f37490a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        b3 b3Var = this.f37492c;
        if (b3Var == null) {
            return -1;
        }
        int b10 = b3Var.b() + b3Var.f34617s;
        this.f37490a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        b3 b3Var = this.f37492c;
        if (b3Var == null) {
            return -1;
        }
        int c10 = b3Var.c() + b3Var.f34617s;
        this.f37490a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.vl.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f37492c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f37492c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37494f != null && this.f37492c != null) {
            canvas.save();
            canvas.translate(this.d, this.f37493e);
            i4.v(this.f37490a, canvas, this, 0);
            this.f37492c.draw(canvas, this);
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
        b3 b3Var = this.f37492c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.i(R.string.AccDescrIVRelatedArticles, i4.j(this.f37490a, this.f37491b, b3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        j2 j2Var;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = this.f37494f;
        if (pageblockrelatedarticles != null) {
            TL_iv.pageBlockRelatedArticles pageblockrelatedarticles2 = this.f37494f;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            g4 g4Var = this.f37491b;
            j2Var = this;
            b3 p5 = i4.p(this.f37490a, j2Var, null, pageblockrelatedarticles.title, size - AndroidUtilities.dp(52.0f), 0, pageblockrelatedarticles2, alignment, 1, g4Var);
            j2Var.f37492c = p5;
            if (p5 != null) {
                j2Var.f37493e = ((AndroidUtilities.dp(32.0f) - j2Var.f37492c.d.getHeight()) / 2) + AndroidUtilities.dp(6.0f);
            }
        } else {
            j2Var = this;
        }
        if (j2Var.f37492c != null) {
            setMeasuredDimension(size, AndroidUtilities.dp(38.0f));
            b3 b3Var = j2Var.f37492c;
            b3Var.f34617s = j2Var.d;
            b3Var.v = j2Var.f37493e;
            return;
        }
        setMeasuredDimension(size, 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.l(this.f37490a, this.f37491b, motionEvent, this, this.f37492c, this.d, this.f37493e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockRelatedArticles pageblockrelatedarticles) {
        this.f37494f = pageblockrelatedarticles;
        requestLayout();
    }
}
