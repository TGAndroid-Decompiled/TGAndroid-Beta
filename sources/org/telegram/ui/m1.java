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
    public final gh.f1 f40284a;
    public final j1 f40285b;
    public e3 f40286c;
    public e3 d;
    public int f40287e;
    public int f40288f;
    public int h;
    public int f40289n;
    public boolean f40290r;
    public TL_iv.pageBlockCollage f40291s;
    public final l1 v;
    public final j4 f40292w;
    public final l4 f40293x;

    public m1(l4 l4Var, Context context, j4 j4Var) {
        super(context);
        this.f40293x = l4Var;
        this.v = new l1(this);
        this.f40292w = j4Var;
        gh.f1 f1Var = new gh.f1(this, context, 4);
        this.f40284a = f1Var;
        f1Var.i(new g1(this));
        h1 h1Var = new h1(this);
        h1Var.O = new i1(this);
        f1Var.setLayoutManager(h1Var);
        j1 j1Var = new j1(this);
        this.f40285b = j1Var;
        f1Var.setAdapter(j1Var);
        addView(f1Var, g7.e6.c(-2.0f, -1));
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.f40286c;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            arrayList.add(e3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.f40286c;
        if (e3Var != null) {
            e3Var.attach(this);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            e3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.f40286c;
        if (e3Var != null) {
            e3Var.detach(this);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            e3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40291s != null) {
            e3 e3Var = this.f40286c;
            l4 l4Var = this.f40293x;
            int i9 = 0;
            if (e3Var != null) {
                canvas.save();
                canvas.translate(this.f40288f, this.h);
                l4.v(l4Var, canvas, this, 0);
                this.f40286c.draw(canvas, this);
                canvas.restore();
                i9 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f40288f, this.h + this.f40289n);
                l4.v(l4Var, canvas, this, i9);
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
        if (this.f40286c != null) {
            sb2.append(", ");
            sb2.append(this.f40286c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13 = this.f40287e;
        int dp = AndroidUtilities.dp(8.0f);
        int i14 = this.f40287e;
        gh.f1 f1Var = this.f40284a;
        f1Var.layout(i13, dp, f1Var.getMeasuredWidth() + i14, AndroidUtilities.dp(8.0f) + f1Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        m1 m1Var;
        int dp;
        int i11;
        int i12 = 1;
        this.f40290r = true;
        int size = View.MeasureSpec.getSize(i9);
        TL_iv.pageBlockCollage pageblockcollage = this.f40291s;
        if (pageblockcollage != null) {
            int i13 = pageblockcollage.level;
            if (i13 > 0) {
                int dp2 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i13 * 14);
                this.f40287e = dp2;
                this.f40288f = dp2;
                i11 = org.telegram.messenger.ll.w(18.0f, dp2, size);
                dp = i11;
            } else {
                this.f40287e = 0;
                this.f40288f = AndroidUtilities.dp(18.0f);
                dp = size - AndroidUtilities.dp(36.0f);
                i11 = size;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            gh.f1 f1Var = this.f40284a;
            f1Var.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredHeight = f1Var.getMeasuredHeight();
            int dp3 = AndroidUtilities.dp(8.0f) + measuredHeight;
            this.h = dp3;
            TL_iv.pageBlockCollage pageblockcollage2 = this.f40291s;
            TL_iv.RichText richText = pageblockcollage2.caption.text;
            HashSet hashSet = l4.X0;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            l4 l4Var = this.f40293x;
            m1Var = this;
            e3 p6 = l4.p(l4Var, m1Var, null, richText, dp, dp3, pageblockcollage2, alignment, 0, this.f40292w);
            m1Var.f40286c = p6;
            if (p6 != null) {
                int height = m1Var.f40286c.d.getHeight() + AndroidUtilities.dp(4.0f);
                m1Var.f40289n = height;
                measuredHeight = org.telegram.messenger.l0.C(4.0f, height, measuredHeight);
                e3 e3Var = m1Var.f40286c;
                e3Var.f37805s = m1Var.f40288f;
                e3Var.v = m1Var.h;
            } else {
                m1Var.f40289n = 0;
            }
            TL_iv.pageBlockCollage pageblockcollage3 = m1Var.f40291s;
            TL_iv.RichText richText2 = pageblockcollage3.caption.credit;
            if (m1Var.f40292w.C) {
                alignment = org.telegram.ui.Components.rv0.a();
            }
            e3 p9 = l4.p(l4Var, m1Var, null, richText2, dp, 0, pageblockcollage3, alignment, 0, m1Var.f40292w);
            m1Var.d = p9;
            if (p9 != null) {
                measuredHeight += m1Var.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                e3 e3Var2 = m1Var.d;
                e3Var2.f37805s = m1Var.f40288f;
                e3Var2.v = m1Var.h + m1Var.f40289n;
            }
            int dp4 = AndroidUtilities.dp(16.0f) + measuredHeight;
            TL_iv.pageBlockCollage pageblockcollage4 = m1Var.f40291s;
            if (pageblockcollage4.level > 0 && !pageblockcollage4.bottom) {
                i12 = AndroidUtilities.dp(8.0f) + dp4;
            } else {
                i12 = dp4;
            }
        } else {
            m1Var = this;
        }
        setMeasuredDimension(size, i12);
        m1Var.f40290r = false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e3 e3Var = this.f40286c;
        int i9 = this.f40288f;
        int i10 = this.h;
        l4 l4Var = this.f40293x;
        if (!l4.l(l4Var, this.f40292w, motionEvent, this, e3Var, i9, i10)) {
            if (!l4.l(l4Var, this.f40292w, motionEvent, this, this.d, this.f40288f, this.h + this.f40289n) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
