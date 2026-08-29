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
public final class n1 extends FrameLayout implements org.telegram.ui.Cells.j9 {
    public final jh.e1 f40675a;
    public final k1 f40676b;
    public f3 f40677c;
    public f3 d;
    public int f40678e;
    public int f40679f;
    public int h;
    public int f40680n;
    public boolean f40681r;
    public TL_iv.pageBlockCollage f40682s;
    public final m1 v;
    public final k4 f40683w;
    public final m4 f40684x;

    public n1(m4 m4Var, Context context, k4 k4Var) {
        super(context);
        this.f40684x = m4Var;
        this.v = new m1(this);
        this.f40683w = k4Var;
        jh.e1 e1Var = new jh.e1(this, context, 3);
        this.f40675a = e1Var;
        e1Var.i(new h1(this));
        i1 i1Var = new i1(this);
        i1Var.O = new j1(this);
        e1Var.setLayoutManager(i1Var);
        k1 k1Var = new k1(this);
        this.f40676b = k1Var;
        e1Var.setAdapter(k1Var);
        addView(e1Var, i7.f6.c(-2.0f, -1));
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f40677c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            arrayList.add(f3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f40677c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            f3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f40677c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            f3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40682s != null) {
            f3 f3Var = this.f40677c;
            m4 m4Var = this.f40684x;
            int i10 = 0;
            if (f3Var != null) {
                canvas.save();
                canvas.translate(this.f40679f, this.h);
                m4.v(m4Var, canvas, this, 0);
                this.f40677c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f40679f, this.h + this.f40680n);
                m4.v(m4Var, canvas, this, i10);
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
        if (this.f40677c != null) {
            sb2.append(", ");
            sb2.append(this.f40677c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = this.f40678e;
        int dp = AndroidUtilities.dp(8.0f);
        int i15 = this.f40678e;
        jh.e1 e1Var = this.f40675a;
        e1Var.layout(i14, dp, e1Var.getMeasuredWidth() + i15, AndroidUtilities.dp(8.0f) + e1Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        n1 n1Var;
        int dp;
        int i12;
        int i13 = 1;
        this.f40681r = true;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockCollage pageblockcollage = this.f40682s;
        if (pageblockcollage != null) {
            int i14 = pageblockcollage.level;
            if (i14 > 0) {
                int dp2 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i14 * 14);
                this.f40678e = dp2;
                this.f40679f = dp2;
                i12 = b.u(18.0f, dp2, size);
                dp = i12;
            } else {
                this.f40678e = 0;
                this.f40679f = AndroidUtilities.dp(18.0f);
                dp = size - AndroidUtilities.dp(36.0f);
                i12 = size;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            jh.e1 e1Var = this.f40675a;
            e1Var.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredHeight = e1Var.getMeasuredHeight();
            int dp3 = AndroidUtilities.dp(8.0f) + measuredHeight;
            this.h = dp3;
            TL_iv.pageBlockCollage pageblockcollage2 = this.f40682s;
            TL_iv.RichText richText = pageblockcollage2.caption.text;
            HashSet hashSet = m4.X0;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            m4 m4Var = this.f40684x;
            n1Var = this;
            f3 p10 = m4.p(m4Var, n1Var, null, richText, dp, dp3, pageblockcollage2, alignment, 0, this.f40683w);
            n1Var.f40677c = p10;
            if (p10 != null) {
                int height = n1Var.f40677c.d.getHeight() + AndroidUtilities.dp(4.0f);
                n1Var.f40680n = height;
                measuredHeight = org.telegram.messenger.x3.C(4.0f, height, measuredHeight);
                f3 f3Var = n1Var.f40677c;
                f3Var.f37974s = n1Var.f40679f;
                f3Var.v = n1Var.h;
            } else {
                n1Var.f40680n = 0;
            }
            TL_iv.pageBlockCollage pageblockcollage3 = n1Var.f40682s;
            TL_iv.RichText richText2 = pageblockcollage3.caption.credit;
            if (n1Var.f40683w.C) {
                alignment = org.telegram.ui.Components.bw0.a();
            }
            f3 p11 = m4.p(m4Var, n1Var, null, richText2, dp, 0, pageblockcollage3, alignment, 0, n1Var.f40683w);
            n1Var.d = p11;
            if (p11 != null) {
                measuredHeight += n1Var.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                f3 f3Var2 = n1Var.d;
                f3Var2.f37974s = n1Var.f40679f;
                f3Var2.v = n1Var.h + n1Var.f40680n;
            }
            int dp4 = AndroidUtilities.dp(16.0f) + measuredHeight;
            TL_iv.pageBlockCollage pageblockcollage4 = n1Var.f40682s;
            if (pageblockcollage4.level > 0 && !pageblockcollage4.bottom) {
                i13 = AndroidUtilities.dp(8.0f) + dp4;
            } else {
                i13 = dp4;
            }
        } else {
            n1Var = this;
        }
        setMeasuredDimension(size, i13);
        n1Var.f40681r = false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f3 f3Var = this.f40677c;
        int i10 = this.f40679f;
        int i11 = this.h;
        m4 m4Var = this.f40684x;
        if (!m4.l(m4Var, this.f40683w, motionEvent, this, f3Var, i10, i11)) {
            if (!m4.l(m4Var, this.f40683w, motionEvent, this, this.d, this.f40679f, this.h + this.f40680n) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
