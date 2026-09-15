package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
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
public final class p2 extends FrameLayout implements org.telegram.ui.Cells.p9 {
    public final k2 f36390a;
    public final n2 f36391b;
    public final o2 f36392c;
    public TL_iv.pageBlockSlideshow d;
    public a3 e;
    public a3 f36393f;
    public final int h;
    public int f36394n;
    public int f36395r;
    public float f36396s;
    public int v;
    public final f4 f36397w;
    public final h4 f36398x;

    public p2(h4 h4Var, Context context, f4 f4Var) {
        super(context);
        this.f36398x = h4Var;
        this.h = AndroidUtilities.dp(18.0f);
        this.f36397w = f4Var;
        if (h4.B1 == null) {
            Paint paint = new Paint(1);
            h4.B1 = paint;
            paint.setColor(-1);
        }
        k2 k2Var = new k2(this, context);
        this.f36390a = k2Var;
        k2Var.b(new l2(this, 0));
        n2 n2Var = new n2(this);
        this.f36391b = n2Var;
        k2Var.setAdapter(n2Var);
        AndroidUtilities.setViewPagerEdgeEffectColor(k2Var, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18836d6, false));
        addView(k2Var);
        o2 o2Var = new o2(this, context);
        this.f36392c = o2Var;
        addView(o2Var);
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.e;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.f36393f;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.e;
        if (a3Var != null) {
            a3Var.attach(this);
        }
        a3 a3Var2 = this.f36393f;
        if (a3Var2 != null) {
            a3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.e;
        if (a3Var != null) {
            a3Var.detach(this);
        }
        a3 a3Var2 = this.f36393f;
        if (a3Var2 != null) {
            a3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null) {
            a3 a3Var = this.e;
            h4 h4Var = this.f36398x;
            int i10 = this.h;
            int i11 = 0;
            if (a3Var != null) {
                canvas.save();
                canvas.translate(i10, this.f36394n);
                h4.v(h4Var, canvas, this, 0);
                this.e.draw(canvas, this);
                canvas.restore();
                i11 = 1;
            }
            if (this.f36393f != null) {
                canvas.save();
                canvas.translate(i10, this.f36394n + this.f36395r);
                h4.v(h4Var, canvas, this, i11);
                this.f36393f.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVSlideshow));
        if (this.e != null) {
            sb2.append(", ");
            sb2.append(this.e.d.getText());
        }
        if (this.f36393f != null) {
            sb2.append(", ");
            sb2.append(this.f36393f.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp = AndroidUtilities.dp(8.0f);
        k2 k2Var = this.f36390a;
        k2Var.layout(0, dp, k2Var.getMeasuredWidth(), k2Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        int bottom = k2Var.getBottom() - AndroidUtilities.dp(23.0f);
        o2 o2Var = this.f36392c;
        o2Var.layout(0, bottom, o2Var.getMeasuredWidth(), o2Var.getMeasuredHeight() + bottom);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        if (this.d != null) {
            int dp = AndroidUtilities.dp(310.0f);
            this.f36390a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
            this.d.items.size();
            this.f36392c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f), 1073741824));
            int dp2 = size - AndroidUtilities.dp(36.0f);
            int dp3 = AndroidUtilities.dp(16.0f) + dp;
            this.f36394n = dp3;
            TL_iv.pageBlockSlideshow pageblockslideshow = this.d;
            TL_iv.RichText richText = pageblockslideshow.caption.text;
            HashSet hashSet = h4.f34107b1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            h4 h4Var = this.f36398x;
            a3 p5 = h4.p(h4Var, this, null, richText, dp2, dp3, pageblockslideshow, alignment, 0, this.f36397w);
            this.e = p5;
            int i13 = this.h;
            if (p5 != null) {
                int height = this.e.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.f36395r = height;
                dp = org.telegram.messenger.w1.C(4.0f, height, dp);
                a3 a3Var = this.e;
                a3Var.f31679s = i13;
                a3Var.v = this.f36394n;
            } else {
                this.f36395r = 0;
            }
            TL_iv.pageBlockSlideshow pageblockslideshow2 = this.d;
            TL_iv.RichText richText2 = pageblockslideshow2.caption.credit;
            if (this.f36397w.G) {
                alignment = org.telegram.ui.Components.jw0.a();
            }
            a3 p10 = h4.p(h4Var, this, null, richText2, dp2, 0, pageblockslideshow2, alignment, 0, this.f36397w);
            this.f36393f = p10;
            if (p10 != null) {
                dp += this.f36393f.d.getHeight() + AndroidUtilities.dp(4.0f);
                a3 a3Var2 = this.f36393f;
                a3Var2.f31679s = i13;
                a3Var2.v = this.f36394n + this.f36395r;
            }
            i12 = AndroidUtilities.dp(16.0f) + dp;
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a3 a3Var = this.e;
        int i10 = this.h;
        int i11 = this.f36394n;
        h4 h4Var = this.f36398x;
        if (!h4.l(h4Var, this.f36397w, motionEvent, this, a3Var, i10, i11)) {
            if (!h4.l(h4Var, this.f36397w, motionEvent, this, this.f36393f, this.h, this.f36394n + this.f36395r) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
