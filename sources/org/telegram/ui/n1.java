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

public final class n1 extends FrameLayout implements org.telegram.ui.Cells.i9 {

    public final hh.f1 f40627a;

    public final k1 f40628b;

    public f3 f40629c;
    public f3 d;

    public int f40630e;

    public int f40631f;
    public int h;

    public int f40632n;

    public boolean f40633r;

    public TL_iv.pageBlockCollage f40634s;
    public final m1 v;

    public final k4 f40635w;

    public final m4 f40636x;

    public n1(m4 m4Var, Context context, k4 k4Var) {
        super(context);
        this.f40636x = m4Var;
        this.v = new m1(this);
        this.f40635w = k4Var;
        hh.f1 f1Var = new hh.f1(this, context, 4);
        this.f40627a = f1Var;
        f1Var.i(new h1(this));
        i1 i1Var = new i1(this);
        i1Var.O = new j1(this);
        f1Var.setLayoutManager(i1Var);
        k1 k1Var = new k1(this);
        this.f40628b = k1Var;
        f1Var.setAdapter(k1Var);
        addView(f1Var, h7.z5.c(-2.0f, -1));
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f40629c;
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
        f3 f3Var = this.f40629c;
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
        f3 f3Var = this.f40629c;
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
        if (this.f40634s == null) {
            return;
        }
        f3 f3Var = this.f40629c;
        m4 m4Var = this.f40636x;
        int i10 = 0;
        if (f3Var != null) {
            canvas.save();
            canvas.translate(this.f40631f, this.h);
            m4.v(m4Var, canvas, this, 0);
            this.f40629c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f40631f, this.h + this.f40632n);
            m4.v(m4Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrCollage));
        if (this.f40629c != null) {
            sb2.append(", ");
            sb2.append(this.f40629c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = this.f40630e;
        int iDp = AndroidUtilities.dp(8.0f);
        int i15 = this.f40630e;
        hh.f1 f1Var = this.f40627a;
        f1Var.layout(i14, iDp, f1Var.getMeasuredWidth() + i15, AndroidUtilities.dp(8.0f) + f1Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        n1 n1Var;
        int iDp;
        int iU;
        int iDp2 = 1;
        this.f40633r = true;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockCollage pageblockcollage = this.f40634s;
        if (pageblockcollage != null) {
            int i12 = pageblockcollage.level;
            if (i12 > 0) {
                int iDp3 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i12 * 14);
                this.f40630e = iDp3;
                this.f40631f = iDp3;
                iU = org.telegram.messenger.rl.u(18.0f, iDp3, size);
                iDp = iU;
            } else {
                this.f40630e = 0;
                this.f40631f = AndroidUtilities.dp(18.0f);
                iDp = size - AndroidUtilities.dp(36.0f);
                iU = size;
            }
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iU, 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            hh.f1 f1Var = this.f40627a;
            f1Var.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredHeight = f1Var.getMeasuredHeight();
            int iDp4 = AndroidUtilities.dp(8.0f) + measuredHeight;
            this.h = iDp4;
            TL_iv.pageBlockCollage pageblockcollage2 = this.f40634s;
            TL_iv.RichText richText = pageblockcollage2.caption.text;
            HashSet hashSet = m4.X0;
            Layout.Alignment alignmentA = Layout.Alignment.ALIGN_NORMAL;
            m4 m4Var = this.f40636x;
            n1Var = this;
            f3 f3VarP = m4.p(m4Var, n1Var, null, richText, iDp, iDp4, pageblockcollage2, alignmentA, 0, this.f40635w);
            n1Var.f40629c = f3VarP;
            if (f3VarP != null) {
                int height = n1Var.f40629c.d.getHeight() + AndroidUtilities.dp(4.0f);
                n1Var.f40632n = height;
                measuredHeight = org.telegram.messenger.y1.C(4.0f, height, measuredHeight);
                f3 f3Var = n1Var.f40629c;
                f3Var.f37923s = n1Var.f40631f;
                f3Var.v = n1Var.h;
            } else {
                n1Var.f40632n = 0;
            }
            TL_iv.pageBlockCollage pageblockcollage3 = n1Var.f40634s;
            TL_iv.RichText richText2 = pageblockcollage3.caption.credit;
            if (n1Var.f40635w.C) {
                alignmentA = org.telegram.ui.Components.tv0.a();
            }
            f3 f3VarP2 = m4.p(m4Var, n1Var, null, richText2, iDp, 0, pageblockcollage3, alignmentA, 0, n1Var.f40635w);
            n1Var.d = f3VarP2;
            if (f3VarP2 != null) {
                measuredHeight += n1Var.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                f3 f3Var2 = n1Var.d;
                f3Var2.f37923s = n1Var.f40631f;
                f3Var2.v = n1Var.h + n1Var.f40632n;
            }
            int iDp5 = AndroidUtilities.dp(16.0f) + measuredHeight;
            TL_iv.pageBlockCollage pageblockcollage4 = n1Var.f40634s;
            iDp2 = (pageblockcollage4.level <= 0 || pageblockcollage4.bottom) ? iDp5 : AndroidUtilities.dp(8.0f) + iDp5;
        } else {
            n1Var = this;
        }
        setMeasuredDimension(size, iDp2);
        n1Var.f40633r = false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f3 f3Var = this.f40629c;
        int i10 = this.f40631f;
        int i11 = this.h;
        m4 m4Var = this.f40636x;
        if (m4.l(m4Var, this.f40635w, motionEvent, this, f3Var, i10, i11)) {
            return true;
        }
        return m4.l(m4Var, this.f40635w, motionEvent, this, this.d, this.f40631f, this.h + this.f40632n) || super.onTouchEvent(motionEvent);
    }
}
