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
public final class k1 extends FrameLayout implements org.telegram.ui.Cells.p9 {
    public final ai.w0 f37811a;
    public final h1 f37812b;
    public b3 f37813c;
    public b3 d;
    public int f37814e;
    public int f37815f;
    public int h;
    public int f37816n;
    public boolean f37817r;
    public TL_iv.pageBlockCollage f37818s;
    public final j1 v;
    public final g4 f37819w;
    public final i4 f37820x;

    public k1(i4 i4Var, Context context, g4 g4Var) {
        super(context);
        this.f37820x = i4Var;
        this.v = new j1(this);
        this.f37819w = g4Var;
        ai.w0 w0Var = new ai.w0(this, context, 4);
        this.f37811a = w0Var;
        w0Var.i(new e1(this));
        f1 f1Var = new f1(this);
        f1Var.O = new g1(this);
        w0Var.setLayoutManager(f1Var);
        h1 h1Var = new h1(this);
        this.f37812b = h1Var;
        w0Var.setAdapter(h1Var);
        addView(w0Var, w7.z5.c(-2.0f, -1));
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f37813c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            arrayList.add(b3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f37813c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            b3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f37813c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            b3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37818s != null) {
            b3 b3Var = this.f37813c;
            i4 i4Var = this.f37820x;
            int i10 = 0;
            if (b3Var != null) {
                canvas.save();
                canvas.translate(this.f37815f, this.h);
                i4.v(i4Var, canvas, this, 0);
                this.f37813c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f37815f, this.h + this.f37816n);
                i4.v(i4Var, canvas, this, i10);
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
        if (this.f37813c != null) {
            sb2.append(", ");
            sb2.append(this.f37813c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = this.f37814e;
        int dp = AndroidUtilities.dp(8.0f);
        int i15 = this.f37814e;
        ai.w0 w0Var = this.f37811a;
        w0Var.layout(i14, dp, w0Var.getMeasuredWidth() + i15, AndroidUtilities.dp(8.0f) + w0Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        k1 k1Var;
        int dp;
        int i12;
        int i13 = 1;
        this.f37817r = true;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockCollage pageblockcollage = this.f37818s;
        if (pageblockcollage != null) {
            int i14 = pageblockcollage.level;
            if (i14 > 0) {
                int dp2 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i14 * 14);
                this.f37814e = dp2;
                this.f37815f = dp2;
                i12 = org.telegram.messenger.bi.y(18.0f, dp2, size);
                dp = i12;
            } else {
                this.f37814e = 0;
                this.f37815f = AndroidUtilities.dp(18.0f);
                dp = size - AndroidUtilities.dp(36.0f);
                i12 = size;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            ai.w0 w0Var = this.f37811a;
            w0Var.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredHeight = w0Var.getMeasuredHeight();
            int dp3 = AndroidUtilities.dp(8.0f) + measuredHeight;
            this.h = dp3;
            TL_iv.pageBlockCollage pageblockcollage2 = this.f37818s;
            TL_iv.RichText richText = pageblockcollage2.caption.text;
            HashSet hashSet = i4.f37239b1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            i4 i4Var = this.f37820x;
            k1Var = this;
            b3 p5 = i4.p(i4Var, k1Var, null, richText, dp, dp3, pageblockcollage2, alignment, 0, this.f37819w);
            k1Var.f37813c = p5;
            if (p5 != null) {
                int height = k1Var.f37813c.d.getHeight() + AndroidUtilities.dp(4.0f);
                k1Var.f37816n = height;
                measuredHeight = org.telegram.messenger.q.C(4.0f, height, measuredHeight);
                b3 b3Var = k1Var.f37813c;
                b3Var.f35035s = k1Var.f37815f;
                b3Var.v = k1Var.h;
            } else {
                k1Var.f37816n = 0;
            }
            TL_iv.pageBlockCollage pageblockcollage3 = k1Var.f37818s;
            TL_iv.RichText richText2 = pageblockcollage3.caption.credit;
            if (k1Var.f37819w.G) {
                alignment = org.telegram.ui.Components.gx0.a();
            }
            b3 p10 = i4.p(i4Var, k1Var, null, richText2, dp, 0, pageblockcollage3, alignment, 0, k1Var.f37819w);
            k1Var.d = p10;
            if (p10 != null) {
                measuredHeight += k1Var.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                b3 b3Var2 = k1Var.d;
                b3Var2.f35035s = k1Var.f37815f;
                b3Var2.v = k1Var.h + k1Var.f37816n;
            }
            int dp4 = AndroidUtilities.dp(16.0f) + measuredHeight;
            TL_iv.pageBlockCollage pageblockcollage4 = k1Var.f37818s;
            if (pageblockcollage4.level > 0 && !pageblockcollage4.bottom) {
                i13 = AndroidUtilities.dp(8.0f) + dp4;
            } else {
                i13 = dp4;
            }
        } else {
            k1Var = this;
        }
        setMeasuredDimension(size, i13);
        k1Var.f37817r = false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b3 b3Var = this.f37813c;
        int i10 = this.f37815f;
        int i11 = this.h;
        i4 i4Var = this.f37820x;
        if (!i4.l(i4Var, this.f37819w, motionEvent, this, b3Var, i10, i11)) {
            if (!i4.l(i4Var, this.f37819w, motionEvent, this, this.d, this.f37815f, this.h + this.f37816n) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
