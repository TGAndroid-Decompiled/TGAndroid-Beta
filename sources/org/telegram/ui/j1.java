package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
public final class j1 extends FrameLayout implements org.telegram.ui.Cells.q9 {
    public final ai.w0 f34747a;
    public final g1 f34748b;
    public a3 f34749c;
    public a3 d;
    public int e;
    public int f34750f;
    public int h;
    public int f34751n;
    public boolean f34752r;
    public TL_iv.pageBlockCollage f34753s;
    public final i1 v;
    public final f4 f34754w;
    public final h4 f34755x;

    public j1(h4 h4Var, Context context, f4 f4Var) {
        super(context);
        this.f34755x = h4Var;
        this.v = new i1(this);
        this.f34754w = f4Var;
        ai.w0 w0Var = new ai.w0(this, context, 4);
        this.f34747a = w0Var;
        w0Var.i(new d1(this));
        e1 e1Var = new e1(this);
        e1Var.O = new f1(this);
        w0Var.setLayoutManager(e1Var);
        g1 g1Var = new g1(this);
        this.f34748b = g1Var;
        w0Var.setAdapter(g1Var);
        addView(w0Var, w7.y5.c(-2.0f, -1));
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f34749c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f34749c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f34749c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f34753s != null) {
            a3 a3Var = this.f34749c;
            h4 h4Var = this.f34755x;
            int i10 = 0;
            if (a3Var != null) {
                canvas.save();
                canvas.translate(this.f34750f, this.h);
                h4.v(h4Var, canvas, this, 0);
                this.f34749c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f34750f, this.h + this.f34751n);
                h4.v(h4Var, canvas, this, i10);
                this.d.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrCollage));
        if (this.f34749c != null) {
            sb2.append(", ");
            sb2.append(this.f34749c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = this.e;
        int dp = AndroidUtilities.dp(8.0f);
        int i15 = this.e;
        ai.w0 w0Var = this.f34747a;
        w0Var.layout(i14, dp, w0Var.getMeasuredWidth() + i15, AndroidUtilities.dp(8.0f) + w0Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        j1 j1Var;
        int dp;
        int i12;
        int i13 = 1;
        this.f34752r = true;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockCollage pageblockcollage = this.f34753s;
        if (pageblockcollage != null) {
            int i14 = pageblockcollage.level;
            if (i14 > 0) {
                int dp2 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i14 * 14);
                this.e = dp2;
                this.f34750f = dp2;
                i12 = org.telegram.messenger.rk.x(18.0f, dp2, size);
                dp = i12;
            } else {
                this.e = 0;
                this.f34750f = AndroidUtilities.dp(18.0f);
                dp = size - AndroidUtilities.dp(36.0f);
                i12 = size;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            ai.w0 w0Var = this.f34747a;
            w0Var.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredHeight = w0Var.getMeasuredHeight();
            int dp3 = AndroidUtilities.dp(8.0f) + measuredHeight;
            this.h = dp3;
            TL_iv.pageBlockCollage pageblockcollage2 = this.f34753s;
            TL_iv.RichText richText = pageblockcollage2.caption.text;
            HashSet hashSet = h4.f34086b1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            h4 h4Var = this.f34755x;
            j1Var = this;
            a3 p5 = h4.p(h4Var, j1Var, null, richText, dp, dp3, pageblockcollage2, alignment, 0, this.f34754w);
            j1Var.f34749c = p5;
            if (p5 != null) {
                int height = j1Var.f34749c.d.getHeight() + AndroidUtilities.dp(4.0f);
                j1Var.f34751n = height;
                measuredHeight = org.telegram.messenger.l0.C(4.0f, height, measuredHeight);
                a3 a3Var = j1Var.f34749c;
                a3Var.f31996s = j1Var.f34750f;
                a3Var.v = j1Var.h;
            } else {
                j1Var.f34751n = 0;
            }
            TL_iv.pageBlockCollage pageblockcollage3 = j1Var.f34753s;
            TL_iv.RichText richText2 = pageblockcollage3.caption.credit;
            if (j1Var.f34754w.G) {
                alignment = org.telegram.ui.Components.ww0.a();
            }
            a3 p10 = h4.p(h4Var, j1Var, null, richText2, dp, 0, pageblockcollage3, alignment, 0, j1Var.f34754w);
            j1Var.d = p10;
            if (p10 != null) {
                measuredHeight += j1Var.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                a3 a3Var2 = j1Var.d;
                a3Var2.f31996s = j1Var.f34750f;
                a3Var2.v = j1Var.h + j1Var.f34751n;
            }
            int dp4 = AndroidUtilities.dp(16.0f) + measuredHeight;
            TL_iv.pageBlockCollage pageblockcollage4 = j1Var.f34753s;
            if (pageblockcollage4.level > 0 && !pageblockcollage4.bottom) {
                i13 = AndroidUtilities.dp(8.0f) + dp4;
            } else {
                i13 = dp4;
            }
        } else {
            j1Var = this;
        }
        setMeasuredDimension(size, i13);
        j1Var.f34752r = false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a3 a3Var = this.f34749c;
        int i10 = this.f34750f;
        int i11 = this.h;
        h4 h4Var = this.f34755x;
        if (!h4.l(h4Var, this.f34754w, motionEvent, this, a3Var, i10, i11)) {
            if (!h4.l(h4Var, this.f34754w, motionEvent, this, this.d, this.f34750f, this.h + this.f34751n) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
