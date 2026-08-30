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
public final class l1 extends FrameLayout implements org.telegram.ui.Cells.l9 {
    public final lh.e1 f35863a;
    public final i1 f35864b;
    public d3 f35865c;
    public d3 d;
    public int e;
    public int f35866f;
    public int h;
    public int f35867n;
    public boolean f35868r;
    public TL_iv.pageBlockCollage f35869s;
    public final k1 v;
    public final j4 f35870w;
    public final l4 f35871x;

    public l1(l4 l4Var, Context context, j4 j4Var) {
        super(context);
        this.f35871x = l4Var;
        this.v = new k1(this);
        this.f35870w = j4Var;
        lh.e1 e1Var = new lh.e1(this, context, 2);
        this.f35863a = e1Var;
        e1Var.i(new f1(this));
        g1 g1Var = new g1(this);
        g1Var.O = new h1(this);
        e1Var.setLayoutManager(g1Var);
        i1 i1Var = new i1(this);
        this.f35864b = i1Var;
        e1Var.setAdapter(i1Var);
        addView(e1Var, k7.b6.c(-2.0f, -1));
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f35865c;
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
        d3 d3Var = this.f35865c;
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
        d3 d3Var = this.f35865c;
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
        if (this.f35869s != null) {
            d3 d3Var = this.f35865c;
            l4 l4Var = this.f35871x;
            int i10 = 0;
            if (d3Var != null) {
                canvas.save();
                canvas.translate(this.f35866f, this.h);
                l4.v(l4Var, canvas, this, 0);
                this.f35865c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f35866f, this.h + this.f35867n);
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
        StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AccDescrCollage));
        if (this.f35865c != null) {
            sb.append(", ");
            sb.append(this.f35865c.d.getText());
        }
        if (this.d != null) {
            sb.append(", ");
            sb.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14 = this.e;
        int dp = AndroidUtilities.dp(8.0f);
        int i15 = this.e;
        lh.e1 e1Var = this.f35863a;
        e1Var.layout(i14, dp, e1Var.getMeasuredWidth() + i15, AndroidUtilities.dp(8.0f) + e1Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        l1 l1Var;
        int dp;
        int i12;
        int i13 = 1;
        this.f35868r = true;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockCollage pageblockcollage = this.f35869s;
        if (pageblockcollage != null) {
            int i14 = pageblockcollage.level;
            if (i14 > 0) {
                int dp2 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i14 * 14);
                this.e = dp2;
                this.f35866f = dp2;
                i12 = b.t(18.0f, dp2, size);
                dp = i12;
            } else {
                this.e = 0;
                this.f35866f = AndroidUtilities.dp(18.0f);
                dp = size - AndroidUtilities.dp(36.0f);
                i12 = size;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            lh.e1 e1Var = this.f35863a;
            e1Var.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredHeight = e1Var.getMeasuredHeight();
            int dp3 = AndroidUtilities.dp(8.0f) + measuredHeight;
            this.h = dp3;
            TL_iv.pageBlockCollage pageblockcollage2 = this.f35869s;
            TL_iv.RichText richText = pageblockcollage2.caption.text;
            HashSet hashSet = l4.Y0;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            l4 l4Var = this.f35871x;
            l1Var = this;
            d3 p10 = l4.p(l4Var, l1Var, null, richText, dp, dp3, pageblockcollage2, alignment, 0, this.f35870w);
            l1Var.f35865c = p10;
            if (p10 != null) {
                int height = l1Var.f35865c.d.getHeight() + AndroidUtilities.dp(4.0f);
                l1Var.f35867n = height;
                measuredHeight = org.telegram.messenger.y3.C(4.0f, height, measuredHeight);
                d3 d3Var = l1Var.f35865c;
                d3Var.f33499s = l1Var.f35866f;
                d3Var.v = l1Var.h;
            } else {
                l1Var.f35867n = 0;
            }
            TL_iv.pageBlockCollage pageblockcollage3 = l1Var.f35869s;
            TL_iv.RichText richText2 = pageblockcollage3.caption.credit;
            if (l1Var.f35870w.D) {
                alignment = org.telegram.ui.Components.kw0.a();
            }
            d3 p11 = l4.p(l4Var, l1Var, null, richText2, dp, 0, pageblockcollage3, alignment, 0, l1Var.f35870w);
            l1Var.d = p11;
            if (p11 != null) {
                measuredHeight += l1Var.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                d3 d3Var2 = l1Var.d;
                d3Var2.f33499s = l1Var.f35866f;
                d3Var2.v = l1Var.h + l1Var.f35867n;
            }
            int dp4 = AndroidUtilities.dp(16.0f) + measuredHeight;
            TL_iv.pageBlockCollage pageblockcollage4 = l1Var.f35869s;
            if (pageblockcollage4.level > 0 && !pageblockcollage4.bottom) {
                i13 = AndroidUtilities.dp(8.0f) + dp4;
            } else {
                i13 = dp4;
            }
        } else {
            l1Var = this;
        }
        setMeasuredDimension(size, i13);
        l1Var.f35868r = false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d3 d3Var = this.f35865c;
        int i10 = this.f35866f;
        int i11 = this.h;
        l4 l4Var = this.f35871x;
        if (!l4.l(l4Var, this.f35870w, motionEvent, this, d3Var, i10, i11)) {
            if (!l4.l(l4Var, this.f35870w, motionEvent, this, this.d, this.f35866f, this.h + this.f35867n) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
