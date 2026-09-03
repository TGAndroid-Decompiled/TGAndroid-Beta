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
public final class n1 extends FrameLayout implements org.telegram.ui.Cells.k9 {
    public final lh.e1 f36299a;
    public final k1 f36300b;
    public f3 f36301c;
    public f3 d;
    public int e;
    public int f36302f;
    public int h;
    public int f36303n;
    public boolean f36304r;
    public TL_iv.pageBlockCollage f36305s;
    public final m1 v;
    public final l4 f36306w;
    public final n4 f36307x;

    public n1(n4 n4Var, Context context, l4 l4Var) {
        super(context);
        this.f36307x = n4Var;
        this.v = new m1(this);
        this.f36306w = l4Var;
        lh.e1 e1Var = new lh.e1(this, context, 2);
        this.f36299a = e1Var;
        e1Var.i(new h1(this));
        i1 i1Var = new i1(this);
        i1Var.O = new j1(this);
        e1Var.setLayoutManager(i1Var);
        k1 k1Var = new k1(this);
        this.f36300b = k1Var;
        e1Var.setAdapter(k1Var);
        addView(e1Var, k7.b6.c(-2.0f, -1));
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f36301c;
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
        f3 f3Var = this.f36301c;
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
        f3 f3Var = this.f36301c;
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
        if (this.f36305s != null) {
            f3 f3Var = this.f36301c;
            n4 n4Var = this.f36307x;
            int i10 = 0;
            if (f3Var != null) {
                canvas.save();
                canvas.translate(this.f36302f, this.h);
                n4.v(n4Var, canvas, this, 0);
                this.f36301c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f36302f, this.h + this.f36303n);
                n4.v(n4Var, canvas, this, i10);
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
        if (this.f36301c != null) {
            sb.append(", ");
            sb.append(this.f36301c.d.getText());
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
        lh.e1 e1Var = this.f36299a;
        e1Var.layout(i14, dp, e1Var.getMeasuredWidth() + i15, AndroidUtilities.dp(8.0f) + e1Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        n1 n1Var;
        int dp;
        int i12;
        int i13 = 1;
        this.f36304r = true;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockCollage pageblockcollage = this.f36305s;
        if (pageblockcollage != null) {
            int i14 = pageblockcollage.level;
            if (i14 > 0) {
                int dp2 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i14 * 14);
                this.e = dp2;
                this.f36302f = dp2;
                i12 = b.t(18.0f, dp2, size);
                dp = i12;
            } else {
                this.e = 0;
                this.f36302f = AndroidUtilities.dp(18.0f);
                dp = size - AndroidUtilities.dp(36.0f);
                i12 = size;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            lh.e1 e1Var = this.f36299a;
            e1Var.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredHeight = e1Var.getMeasuredHeight();
            int dp3 = AndroidUtilities.dp(8.0f) + measuredHeight;
            this.h = dp3;
            TL_iv.pageBlockCollage pageblockcollage2 = this.f36305s;
            TL_iv.RichText richText = pageblockcollage2.caption.text;
            HashSet hashSet = n4.Y0;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            n4 n4Var = this.f36307x;
            n1Var = this;
            f3 p10 = n4.p(n4Var, n1Var, null, richText, dp, dp3, pageblockcollage2, alignment, 0, this.f36306w);
            n1Var.f36301c = p10;
            if (p10 != null) {
                int height = n1Var.f36301c.d.getHeight() + AndroidUtilities.dp(4.0f);
                n1Var.f36303n = height;
                measuredHeight = org.telegram.messenger.y3.C(4.0f, height, measuredHeight);
                f3 f3Var = n1Var.f36301c;
                f3Var.f33933s = n1Var.f36302f;
                f3Var.v = n1Var.h;
            } else {
                n1Var.f36303n = 0;
            }
            TL_iv.pageBlockCollage pageblockcollage3 = n1Var.f36305s;
            TL_iv.RichText richText2 = pageblockcollage3.caption.credit;
            if (n1Var.f36306w.D) {
                alignment = org.telegram.ui.Components.kw0.a();
            }
            f3 p11 = n4.p(n4Var, n1Var, null, richText2, dp, 0, pageblockcollage3, alignment, 0, n1Var.f36306w);
            n1Var.d = p11;
            if (p11 != null) {
                measuredHeight += n1Var.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                f3 f3Var2 = n1Var.d;
                f3Var2.f33933s = n1Var.f36302f;
                f3Var2.v = n1Var.h + n1Var.f36303n;
            }
            int dp4 = AndroidUtilities.dp(16.0f) + measuredHeight;
            TL_iv.pageBlockCollage pageblockcollage4 = n1Var.f36305s;
            if (pageblockcollage4.level > 0 && !pageblockcollage4.bottom) {
                i13 = AndroidUtilities.dp(8.0f) + dp4;
            } else {
                i13 = dp4;
            }
        } else {
            n1Var = this;
        }
        setMeasuredDimension(size, i13);
        n1Var.f36304r = false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f3 f3Var = this.f36301c;
        int i10 = this.f36302f;
        int i11 = this.h;
        n4 n4Var = this.f36307x;
        if (!n4.l(n4Var, this.f36306w, motionEvent, this, f3Var, i10, i11)) {
            if (!n4.l(n4Var, this.f36306w, motionEvent, this, this.d, this.f36302f, this.h + this.f36303n) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
