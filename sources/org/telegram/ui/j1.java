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
public final class j1 extends FrameLayout implements org.telegram.ui.Cells.r9 {
    public final bi.r1 f40377a;
    public final g1 f40378b;
    public a3 f40379c;
    public a3 d;
    public int e;
    public int f40380f;
    public int h;
    public int f40381n;
    public boolean f40382r;
    public TL_iv.pageBlockCollage f40383s;
    public final i1 v;
    public final h4 f40384w;
    public final j4 f40385x;

    public j1(j4 j4Var, Context context, h4 h4Var) {
        super(context);
        this.f40385x = j4Var;
        this.v = new i1(this);
        this.f40384w = h4Var;
        bi.r1 r1Var = new bi.r1(this, context, 5);
        this.f40377a = r1Var;
        r1Var.i(new d1(this));
        e1 e1Var = new e1(this);
        e1Var.O = new f1(this);
        r1Var.setLayoutManager(e1Var);
        g1 g1Var = new g1(this);
        this.f40378b = g1Var;
        r1Var.setAdapter(g1Var);
        addView(r1Var, org.telegram.ui.Components.gb1.g(-2.0f, -1));
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f40379c;
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
        a3 a3Var = this.f40379c;
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
        a3 a3Var = this.f40379c;
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
        if (this.f40383s != null) {
            a3 a3Var = this.f40379c;
            j4 j4Var = this.f40385x;
            int i10 = 0;
            if (a3Var != null) {
                canvas.save();
                canvas.translate(this.f40380f, this.h);
                j4.v(j4Var, canvas, this, 0);
                this.f40379c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f40380f, this.h + this.f40381n);
                j4.v(j4Var, canvas, this, i10);
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
        if (this.f40379c != null) {
            sb2.append(", ");
            sb2.append(this.f40379c.d.getText());
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
        bi.r1 r1Var = this.f40377a;
        r1Var.layout(i14, dp, r1Var.getMeasuredWidth() + i15, AndroidUtilities.dp(8.0f) + r1Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        j1 j1Var;
        int dp;
        int i12;
        int i13 = 1;
        this.f40382r = true;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockCollage pageblockcollage = this.f40383s;
        if (pageblockcollage != null) {
            int i14 = pageblockcollage.level;
            if (i14 > 0) {
                int dp2 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i14 * 14);
                this.e = dp2;
                this.f40380f = dp2;
                i12 = org.telegram.messenger.vh.z(18.0f, dp2, size);
                dp = i12;
            } else {
                this.e = 0;
                this.f40380f = AndroidUtilities.dp(18.0f);
                dp = size - AndroidUtilities.dp(36.0f);
                i12 = size;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            bi.r1 r1Var = this.f40377a;
            r1Var.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredHeight = r1Var.getMeasuredHeight();
            int dp3 = AndroidUtilities.dp(8.0f) + measuredHeight;
            this.h = dp3;
            TL_iv.pageBlockCollage pageblockcollage2 = this.f40383s;
            TL_iv.RichText richText = pageblockcollage2.caption.text;
            HashSet hashSet = j4.f40402c1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            j4 j4Var = this.f40385x;
            j1Var = this;
            a3 p10 = j4.p(j4Var, j1Var, null, richText, dp, dp3, pageblockcollage2, alignment, 0, this.f40384w);
            j1Var.f40379c = p10;
            if (p10 != null) {
                int height = j1Var.f40379c.d.getHeight() + AndroidUtilities.dp(4.0f);
                j1Var.f40381n = height;
                measuredHeight = org.telegram.messenger.t.D(4.0f, height, measuredHeight);
                a3 a3Var = j1Var.f40379c;
                a3Var.f37631s = j1Var.f40380f;
                a3Var.v = j1Var.h;
            } else {
                j1Var.f40381n = 0;
            }
            TL_iv.pageBlockCollage pageblockcollage3 = j1Var.f40383s;
            TL_iv.RichText richText2 = pageblockcollage3.caption.credit;
            if (j1Var.f40384w.G) {
                alignment = org.telegram.ui.Components.px0.a();
            }
            a3 p11 = j4.p(j4Var, j1Var, null, richText2, dp, 0, pageblockcollage3, alignment, 0, j1Var.f40384w);
            j1Var.d = p11;
            if (p11 != null) {
                measuredHeight += j1Var.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                a3 a3Var2 = j1Var.d;
                a3Var2.f37631s = j1Var.f40380f;
                a3Var2.v = j1Var.h + j1Var.f40381n;
            }
            int dp4 = AndroidUtilities.dp(16.0f) + measuredHeight;
            TL_iv.pageBlockCollage pageblockcollage4 = j1Var.f40383s;
            if (pageblockcollage4.level > 0 && !pageblockcollage4.bottom) {
                i13 = AndroidUtilities.dp(8.0f) + dp4;
            } else {
                i13 = dp4;
            }
        } else {
            j1Var = this;
        }
        setMeasuredDimension(size, i13);
        j1Var.f40382r = false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a3 a3Var = this.f40379c;
        int i10 = this.f40380f;
        int i11 = this.h;
        j4 j4Var = this.f40385x;
        if (!j4.l(j4Var, this.f40384w, motionEvent, this, a3Var, i10, i11)) {
            if (!j4.l(j4Var, this.f40384w, motionEvent, this, this.d, this.f40380f, this.h + this.f40381n) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
