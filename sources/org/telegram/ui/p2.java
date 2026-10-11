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
public final class p2 extends FrameLayout implements org.telegram.ui.Cells.n9 {
    public final k2 f40720a;
    public final n2 f40721b;
    public final o2 f40722c;
    public TL_iv.pageBlockSlideshow d;
    public a3 f40723e;
    public a3 f40724f;
    public final int h;
    public int f40725n;
    public int f40726r;
    public float f40727s;
    public int v;
    public final f4 f40728w;
    public final h4 f40729x;

    public p2(h4 h4Var, Context context, f4 f4Var) {
        super(context);
        this.f40729x = h4Var;
        this.h = AndroidUtilities.dp(18.0f);
        this.f40728w = f4Var;
        if (h4.B1 == null) {
            Paint paint = new Paint(1);
            h4.B1 = paint;
            paint.setColor(-1);
        }
        k2 k2Var = new k2(this, context);
        this.f40720a = k2Var;
        k2Var.b(new l2(this, 0));
        n2 n2Var = new n2(this);
        this.f40721b = n2Var;
        k2Var.setAdapter(n2Var);
        AndroidUtilities.setViewPagerEdgeEffectColor(k2Var, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20822d6, false));
        addView(k2Var);
        o2 o2Var = new o2(this, context);
        this.f40722c = o2Var;
        addView(o2Var);
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f40723e;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.f40724f;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f40723e;
        if (a3Var != null) {
            a3Var.attach(this);
        }
        a3 a3Var2 = this.f40724f;
        if (a3Var2 != null) {
            a3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f40723e;
        if (a3Var != null) {
            a3Var.detach(this);
        }
        a3 a3Var2 = this.f40724f;
        if (a3Var2 != null) {
            a3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null) {
            a3 a3Var = this.f40723e;
            h4 h4Var = this.f40729x;
            int i10 = this.h;
            int i11 = 0;
            if (a3Var != null) {
                canvas.save();
                canvas.translate(i10, this.f40725n);
                h4.v(h4Var, canvas, this, 0);
                this.f40723e.draw(canvas, this);
                canvas.restore();
                i11 = 1;
            }
            if (this.f40724f != null) {
                canvas.save();
                canvas.translate(i10, this.f40725n + this.f40726r);
                h4.v(h4Var, canvas, this, i11);
                this.f40724f.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVSlideshow));
        if (this.f40723e != null) {
            sb2.append(", ");
            sb2.append(this.f40723e.d.getText());
        }
        if (this.f40724f != null) {
            sb2.append(", ");
            sb2.append(this.f40724f.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp = AndroidUtilities.dp(8.0f);
        k2 k2Var = this.f40720a;
        k2Var.layout(0, dp, k2Var.getMeasuredWidth(), k2Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        int bottom = k2Var.getBottom() - AndroidUtilities.dp(23.0f);
        o2 o2Var = this.f40722c;
        o2Var.layout(0, bottom, o2Var.getMeasuredWidth(), o2Var.getMeasuredHeight() + bottom);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        if (this.d != null) {
            int dp = AndroidUtilities.dp(310.0f);
            this.f40720a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
            this.d.items.size();
            this.f40722c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f), 1073741824));
            int dp2 = size - AndroidUtilities.dp(36.0f);
            int dp3 = AndroidUtilities.dp(16.0f) + dp;
            this.f40725n = dp3;
            TL_iv.pageBlockSlideshow pageblockslideshow = this.d;
            TL_iv.RichText richText = pageblockslideshow.caption.text;
            HashSet hashSet = h4.f38275b1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            h4 h4Var = this.f40729x;
            a3 p5 = h4.p(h4Var, this, null, richText, dp2, dp3, pageblockslideshow, alignment, 0, this.f40728w);
            this.f40723e = p5;
            int i13 = this.h;
            if (p5 != null) {
                int height = this.f40723e.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.f40726r = height;
                dp = org.telegram.messenger.q.C(4.0f, height, dp);
                a3 a3Var = this.f40723e;
                a3Var.f35896s = i13;
                a3Var.v = this.f40725n;
            } else {
                this.f40726r = 0;
            }
            TL_iv.pageBlockSlideshow pageblockslideshow2 = this.d;
            TL_iv.RichText richText2 = pageblockslideshow2.caption.credit;
            if (this.f40728w.G) {
                alignment = org.telegram.ui.Components.nx0.a();
            }
            a3 p10 = h4.p(h4Var, this, null, richText2, dp2, 0, pageblockslideshow2, alignment, 0, this.f40728w);
            this.f40724f = p10;
            if (p10 != null) {
                dp += this.f40724f.d.getHeight() + AndroidUtilities.dp(4.0f);
                a3 a3Var2 = this.f40724f;
                a3Var2.f35896s = i13;
                a3Var2.v = this.f40725n + this.f40726r;
            }
            i12 = AndroidUtilities.dp(16.0f) + dp;
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a3 a3Var = this.f40723e;
        int i10 = this.h;
        int i11 = this.f40725n;
        h4 h4Var = this.f40729x;
        if (!h4.l(h4Var, this.f40728w, motionEvent, this, a3Var, i10, i11)) {
            if (!h4.l(h4Var, this.f40728w, motionEvent, this, this.f40724f, this.h, this.f40725n + this.f40726r) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
