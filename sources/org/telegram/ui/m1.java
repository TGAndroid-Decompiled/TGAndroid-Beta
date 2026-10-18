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
public final class m1 extends FrameLayout implements org.telegram.ui.Cells.m9 {
    public final ai.u1 f38953a;
    public final j1 f38954b;
    public d3 f38955c;
    public d3 d;
    public int e;
    public int f38956f;
    public int h;
    public int f38957n;
    public boolean f38958r;
    public TL_iv.pageBlockCollage f38959s;
    public final l1 v;
    public final j4 f38960w;
    public final l4 f38961x;

    public m1(l4 l4Var, Context context, j4 j4Var) {
        super(context);
        this.f38961x = l4Var;
        this.v = new l1(this);
        this.f38960w = j4Var;
        ai.u1 u1Var = new ai.u1(this, context, 5);
        this.f38953a = u1Var;
        u1Var.i(new g1(this));
        h1 h1Var = new h1(this);
        h1Var.O = new i1(this);
        u1Var.setLayoutManager(h1Var);
        j1 j1Var = new j1(this);
        this.f38954b = j1Var;
        u1Var.setAdapter(j1Var);
        addView(u1Var, w7.z5.c(-2.0f, -1));
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f38955c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            arrayList.add(d3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f38955c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            d3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f38955c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            d3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f38959s != null) {
            d3 d3Var = this.f38955c;
            l4 l4Var = this.f38961x;
            int i10 = 0;
            if (d3Var != null) {
                canvas.save();
                canvas.translate(this.f38956f, this.h);
                l4.v(l4Var, canvas, this, 0);
                this.f38955c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f38956f, this.h + this.f38957n);
                l4.v(l4Var, canvas, this, i10);
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
        if (this.f38955c != null) {
            sb2.append(", ");
            sb2.append(this.f38955c.d.getText());
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
        ai.u1 u1Var = this.f38953a;
        u1Var.layout(i14, dp, u1Var.getMeasuredWidth() + i15, AndroidUtilities.dp(8.0f) + u1Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        m1 m1Var;
        int dp;
        int i12;
        int i13 = 1;
        this.f38958r = true;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockCollage pageblockcollage = this.f38959s;
        if (pageblockcollage != null) {
            int i14 = pageblockcollage.level;
            if (i14 > 0) {
                int dp2 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i14 * 14);
                this.e = dp2;
                this.f38956f = dp2;
                i12 = org.telegram.messenger.lk.y(18.0f, dp2, size);
                dp = i12;
            } else {
                this.e = 0;
                this.f38956f = AndroidUtilities.dp(18.0f);
                dp = size - AndroidUtilities.dp(36.0f);
                i12 = size;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            ai.u1 u1Var = this.f38953a;
            u1Var.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredHeight = u1Var.getMeasuredHeight();
            int dp3 = AndroidUtilities.dp(8.0f) + measuredHeight;
            this.h = dp3;
            TL_iv.pageBlockCollage pageblockcollage2 = this.f38959s;
            TL_iv.RichText richText = pageblockcollage2.caption.text;
            HashSet hashSet = l4.f38681b1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            l4 l4Var = this.f38961x;
            m1Var = this;
            d3 p5 = l4.p(l4Var, m1Var, null, richText, dp, dp3, pageblockcollage2, alignment, 0, this.f38960w);
            m1Var.f38955c = p5;
            if (p5 != null) {
                int height = m1Var.f38955c.d.getHeight() + AndroidUtilities.dp(4.0f);
                m1Var.f38957n = height;
                measuredHeight = org.telegram.messenger.g0.C(4.0f, height, measuredHeight);
                d3 d3Var = m1Var.f38955c;
                d3Var.f36046s = m1Var.f38956f;
                d3Var.v = m1Var.h;
            } else {
                m1Var.f38957n = 0;
            }
            TL_iv.pageBlockCollage pageblockcollage3 = m1Var.f38959s;
            TL_iv.RichText richText2 = pageblockcollage3.caption.credit;
            if (m1Var.f38960w.G) {
                alignment = org.telegram.ui.Components.dx0.a();
            }
            d3 p9 = l4.p(l4Var, m1Var, null, richText2, dp, 0, pageblockcollage3, alignment, 0, m1Var.f38960w);
            m1Var.d = p9;
            if (p9 != null) {
                measuredHeight += m1Var.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                d3 d3Var2 = m1Var.d;
                d3Var2.f36046s = m1Var.f38956f;
                d3Var2.v = m1Var.h + m1Var.f38957n;
            }
            int dp4 = AndroidUtilities.dp(16.0f) + measuredHeight;
            TL_iv.pageBlockCollage pageblockcollage4 = m1Var.f38959s;
            if (pageblockcollage4.level > 0 && !pageblockcollage4.bottom) {
                i13 = AndroidUtilities.dp(8.0f) + dp4;
            } else {
                i13 = dp4;
            }
        } else {
            m1Var = this;
        }
        setMeasuredDimension(size, i13);
        m1Var.f38958r = false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d3 d3Var = this.f38955c;
        int i10 = this.f38956f;
        int i11 = this.h;
        l4 l4Var = this.f38961x;
        if (!l4.l(l4Var, this.f38960w, motionEvent, this, d3Var, i10, i11)) {
            if (!l4.l(l4Var, this.f38960w, motionEvent, this, this.d, this.f38956f, this.h + this.f38957n) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
