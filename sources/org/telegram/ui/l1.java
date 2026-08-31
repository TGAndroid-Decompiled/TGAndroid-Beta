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
    public final mh.d1 f38547a;
    public final i1 f38548b;
    public d3 f38549c;
    public d3 d;
    public int f38550e;
    public int f38551f;
    public int h;
    public int f38552n;
    public boolean f38553r;
    public TL_iv.pageBlockCollage f38554s;
    public final k1 v;
    public final j4 f38555w;
    public final l4 f38556x;

    public l1(l4 l4Var, Context context, j4 j4Var) {
        super(context);
        this.f38556x = l4Var;
        this.v = new k1(this);
        this.f38555w = j4Var;
        mh.d1 d1Var = new mh.d1(this, context, 2);
        this.f38547a = d1Var;
        d1Var.i(new f1(this));
        g1 g1Var = new g1(this);
        g1Var.O = new h1(this);
        d1Var.setLayoutManager(g1Var);
        i1 i1Var = new i1(this);
        this.f38548b = i1Var;
        d1Var.setAdapter(i1Var);
        addView(d1Var, k7.c6.c(-2.0f, -1));
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f38549c;
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
        d3 d3Var = this.f38549c;
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
        d3 d3Var = this.f38549c;
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
        if (this.f38554s != null) {
            d3 d3Var = this.f38549c;
            l4 l4Var = this.f38556x;
            int i10 = 0;
            if (d3Var != null) {
                canvas.save();
                canvas.translate(this.f38551f, this.h);
                l4.v(l4Var, canvas, this, 0);
                this.f38549c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f38551f, this.h + this.f38552n);
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
        if (this.f38549c != null) {
            sb.append(", ");
            sb.append(this.f38549c.d.getText());
        }
        if (this.d != null) {
            sb.append(", ");
            sb.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14 = this.f38550e;
        int dp = AndroidUtilities.dp(8.0f);
        int i15 = this.f38550e;
        mh.d1 d1Var = this.f38547a;
        d1Var.layout(i14, dp, d1Var.getMeasuredWidth() + i15, AndroidUtilities.dp(8.0f) + d1Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        l1 l1Var;
        int dp;
        int i12;
        int i13 = 1;
        this.f38553r = true;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockCollage pageblockcollage = this.f38554s;
        if (pageblockcollage != null) {
            int i14 = pageblockcollage.level;
            if (i14 > 0) {
                int dp2 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i14 * 14);
                this.f38550e = dp2;
                this.f38551f = dp2;
                i12 = b.t(18.0f, dp2, size);
                dp = i12;
            } else {
                this.f38550e = 0;
                this.f38551f = AndroidUtilities.dp(18.0f);
                dp = size - AndroidUtilities.dp(36.0f);
                i12 = size;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            mh.d1 d1Var = this.f38547a;
            d1Var.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredHeight = d1Var.getMeasuredHeight();
            int dp3 = AndroidUtilities.dp(8.0f) + measuredHeight;
            this.h = dp3;
            TL_iv.pageBlockCollage pageblockcollage2 = this.f38554s;
            TL_iv.RichText richText = pageblockcollage2.caption.text;
            HashSet hashSet = l4.Y0;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            l4 l4Var = this.f38556x;
            l1Var = this;
            d3 p10 = l4.p(l4Var, l1Var, null, richText, dp, dp3, pageblockcollage2, alignment, 0, this.f38555w);
            l1Var.f38549c = p10;
            if (p10 != null) {
                int height = l1Var.f38549c.d.getHeight() + AndroidUtilities.dp(4.0f);
                l1Var.f38552n = height;
                measuredHeight = org.telegram.messenger.y3.C(4.0f, height, measuredHeight);
                d3 d3Var = l1Var.f38549c;
                d3Var.f35986s = l1Var.f38551f;
                d3Var.v = l1Var.h;
            } else {
                l1Var.f38552n = 0;
            }
            TL_iv.pageBlockCollage pageblockcollage3 = l1Var.f38554s;
            TL_iv.RichText richText2 = pageblockcollage3.caption.credit;
            if (l1Var.f38555w.D) {
                alignment = org.telegram.ui.Components.lw0.a();
            }
            d3 p11 = l4.p(l4Var, l1Var, null, richText2, dp, 0, pageblockcollage3, alignment, 0, l1Var.f38555w);
            l1Var.d = p11;
            if (p11 != null) {
                measuredHeight += l1Var.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                d3 d3Var2 = l1Var.d;
                d3Var2.f35986s = l1Var.f38551f;
                d3Var2.v = l1Var.h + l1Var.f38552n;
            }
            int dp4 = AndroidUtilities.dp(16.0f) + measuredHeight;
            TL_iv.pageBlockCollage pageblockcollage4 = l1Var.f38554s;
            if (pageblockcollage4.level > 0 && !pageblockcollage4.bottom) {
                i13 = AndroidUtilities.dp(8.0f) + dp4;
            } else {
                i13 = dp4;
            }
        } else {
            l1Var = this;
        }
        setMeasuredDimension(size, i13);
        l1Var.f38553r = false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d3 d3Var = this.f38549c;
        int i10 = this.f38551f;
        int i11 = this.h;
        l4 l4Var = this.f38556x;
        if (!l4.l(l4Var, this.f38555w, motionEvent, this, d3Var, i10, i11)) {
            if (!l4.l(l4Var, this.f38555w, motionEvent, this, this.d, this.f38551f, this.h + this.f38552n) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
