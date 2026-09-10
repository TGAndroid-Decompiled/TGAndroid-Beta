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
public final class l1 extends FrameLayout implements org.telegram.ui.Cells.r9 {
    public final bi.y1 f34501a;
    public final i1 f34502b;
    public c3 f34503c;
    public c3 d;
    public int e;
    public int f34504f;
    public int h;
    public int f34505n;
    public boolean f34506r;
    public TL_iv.pageBlockCollage f34507s;
    public final k1 v;
    public final h4 f34508w;
    public final j4 f34509x;

    public l1(j4 j4Var, Context context, h4 h4Var) {
        super(context);
        this.f34509x = j4Var;
        this.v = new k1(this);
        this.f34508w = h4Var;
        bi.y1 y1Var = new bi.y1(this, context, 3);
        this.f34501a = y1Var;
        y1Var.i(new f1(this));
        g1 g1Var = new g1(this);
        g1Var.O = new h1(this);
        y1Var.setLayoutManager(g1Var);
        i1 i1Var = new i1(this);
        this.f34502b = i1Var;
        y1Var.setAdapter(i1Var);
        addView(y1Var, w7.a6.c(-2.0f, -1));
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f34503c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            arrayList.add(c3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f34503c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            c3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f34503c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            c3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f34507s != null) {
            c3 c3Var = this.f34503c;
            j4 j4Var = this.f34509x;
            int i10 = 0;
            if (c3Var != null) {
                canvas.save();
                canvas.translate(this.f34504f, this.h);
                j4.v(j4Var, canvas, this, 0);
                this.f34503c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f34504f, this.h + this.f34505n);
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
        if (this.f34503c != null) {
            sb2.append(", ");
            sb2.append(this.f34503c.d.getText());
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
        bi.y1 y1Var = this.f34501a;
        y1Var.layout(i14, dp, y1Var.getMeasuredWidth() + i15, AndroidUtilities.dp(8.0f) + y1Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        l1 l1Var;
        int dp;
        int i12;
        int i13 = 1;
        this.f34506r = true;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockCollage pageblockcollage = this.f34507s;
        if (pageblockcollage != null) {
            int i14 = pageblockcollage.level;
            if (i14 > 0) {
                int dp2 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i14 * 14);
                this.e = dp2;
                this.f34504f = dp2;
                i12 = org.telegram.messenger.em.v(18.0f, dp2, size);
                dp = i12;
            } else {
                this.e = 0;
                this.f34504f = AndroidUtilities.dp(18.0f);
                dp = size - AndroidUtilities.dp(36.0f);
                i12 = size;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            bi.y1 y1Var = this.f34501a;
            y1Var.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredHeight = y1Var.getMeasuredHeight();
            int dp3 = AndroidUtilities.dp(8.0f) + measuredHeight;
            this.h = dp3;
            TL_iv.pageBlockCollage pageblockcollage2 = this.f34507s;
            TL_iv.RichText richText = pageblockcollage2.caption.text;
            HashSet hashSet = j4.f33876b1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            j4 j4Var = this.f34509x;
            l1Var = this;
            c3 p5 = j4.p(j4Var, l1Var, null, richText, dp, dp3, pageblockcollage2, alignment, 0, this.f34508w);
            l1Var.f34503c = p5;
            if (p5 != null) {
                int height = l1Var.f34503c.d.getHeight() + AndroidUtilities.dp(4.0f);
                l1Var.f34505n = height;
                measuredHeight = org.telegram.messenger.a2.C(4.0f, height, measuredHeight);
                c3 c3Var = l1Var.f34503c;
                c3Var.f31515s = l1Var.f34504f;
                c3Var.v = l1Var.h;
            } else {
                l1Var.f34505n = 0;
            }
            TL_iv.pageBlockCollage pageblockcollage3 = l1Var.f34507s;
            TL_iv.RichText richText2 = pageblockcollage3.caption.credit;
            if (l1Var.f34508w.G) {
                alignment = org.telegram.ui.Components.uw0.a();
            }
            c3 p10 = j4.p(j4Var, l1Var, null, richText2, dp, 0, pageblockcollage3, alignment, 0, l1Var.f34508w);
            l1Var.d = p10;
            if (p10 != null) {
                measuredHeight += l1Var.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                c3 c3Var2 = l1Var.d;
                c3Var2.f31515s = l1Var.f34504f;
                c3Var2.v = l1Var.h + l1Var.f34505n;
            }
            int dp4 = AndroidUtilities.dp(16.0f) + measuredHeight;
            TL_iv.pageBlockCollage pageblockcollage4 = l1Var.f34507s;
            if (pageblockcollage4.level > 0 && !pageblockcollage4.bottom) {
                i13 = AndroidUtilities.dp(8.0f) + dp4;
            } else {
                i13 = dp4;
            }
        } else {
            l1Var = this;
        }
        setMeasuredDimension(size, i13);
        l1Var.f34506r = false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c3 c3Var = this.f34503c;
        int i10 = this.f34504f;
        int i11 = this.h;
        j4 j4Var = this.f34509x;
        if (!j4.l(j4Var, this.f34508w, motionEvent, this, c3Var, i10, i11)) {
            if (!j4.l(j4Var, this.f34508w, motionEvent, this, this.d, this.f34504f, this.h + this.f34505n) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
