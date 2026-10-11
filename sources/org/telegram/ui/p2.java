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
    public final k2 f40686a;
    public final n2 f40687b;
    public final o2 f40688c;
    public TL_iv.pageBlockSlideshow d;
    public a3 f40689e;
    public a3 f40690f;
    public final int h;
    public int f40691n;
    public int f40692r;
    public float f40693s;
    public int v;
    public final f4 f40694w;
    public final h4 f40695x;

    public p2(h4 h4Var, Context context, f4 f4Var) {
        super(context);
        this.f40695x = h4Var;
        this.h = AndroidUtilities.dp(18.0f);
        this.f40694w = f4Var;
        if (h4.B1 == null) {
            Paint paint = new Paint(1);
            h4.B1 = paint;
            paint.setColor(-1);
        }
        k2 k2Var = new k2(this, context);
        this.f40686a = k2Var;
        k2Var.b(new l2(this, 0));
        n2 n2Var = new n2(this);
        this.f40687b = n2Var;
        k2Var.setAdapter(n2Var);
        AndroidUtilities.setViewPagerEdgeEffectColor(k2Var, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20786d6, false));
        addView(k2Var);
        o2 o2Var = new o2(this, context);
        this.f40688c = o2Var;
        addView(o2Var);
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f40689e;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.f40690f;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f40689e;
        if (a3Var != null) {
            a3Var.attach(this);
        }
        a3 a3Var2 = this.f40690f;
        if (a3Var2 != null) {
            a3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f40689e;
        if (a3Var != null) {
            a3Var.detach(this);
        }
        a3 a3Var2 = this.f40690f;
        if (a3Var2 != null) {
            a3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null) {
            a3 a3Var = this.f40689e;
            h4 h4Var = this.f40695x;
            int i10 = this.h;
            int i11 = 0;
            if (a3Var != null) {
                canvas.save();
                canvas.translate(i10, this.f40691n);
                h4.v(h4Var, canvas, this, 0);
                this.f40689e.draw(canvas, this);
                canvas.restore();
                i11 = 1;
            }
            if (this.f40690f != null) {
                canvas.save();
                canvas.translate(i10, this.f40691n + this.f40692r);
                h4.v(h4Var, canvas, this, i11);
                this.f40690f.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVSlideshow));
        if (this.f40689e != null) {
            sb2.append(", ");
            sb2.append(this.f40689e.d.getText());
        }
        if (this.f40690f != null) {
            sb2.append(", ");
            sb2.append(this.f40690f.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp = AndroidUtilities.dp(8.0f);
        k2 k2Var = this.f40686a;
        k2Var.layout(0, dp, k2Var.getMeasuredWidth(), k2Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        int bottom = k2Var.getBottom() - AndroidUtilities.dp(23.0f);
        o2 o2Var = this.f40688c;
        o2Var.layout(0, bottom, o2Var.getMeasuredWidth(), o2Var.getMeasuredHeight() + bottom);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        if (this.d != null) {
            int dp = AndroidUtilities.dp(310.0f);
            this.f40686a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
            this.d.items.size();
            this.f40688c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f), 1073741824));
            int dp2 = size - AndroidUtilities.dp(36.0f);
            int dp3 = AndroidUtilities.dp(16.0f) + dp;
            this.f40691n = dp3;
            TL_iv.pageBlockSlideshow pageblockslideshow = this.d;
            TL_iv.RichText richText = pageblockslideshow.caption.text;
            HashSet hashSet = h4.f38241b1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            h4 h4Var = this.f40695x;
            a3 p5 = h4.p(h4Var, this, null, richText, dp2, dp3, pageblockslideshow, alignment, 0, this.f40694w);
            this.f40689e = p5;
            int i13 = this.h;
            if (p5 != null) {
                int height = this.f40689e.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.f40692r = height;
                dp = org.telegram.messenger.q.C(4.0f, height, dp);
                a3 a3Var = this.f40689e;
                a3Var.f35862s = i13;
                a3Var.v = this.f40691n;
            } else {
                this.f40692r = 0;
            }
            TL_iv.pageBlockSlideshow pageblockslideshow2 = this.d;
            TL_iv.RichText richText2 = pageblockslideshow2.caption.credit;
            if (this.f40694w.G) {
                alignment = org.telegram.ui.Components.ox0.a();
            }
            a3 p10 = h4.p(h4Var, this, null, richText2, dp2, 0, pageblockslideshow2, alignment, 0, this.f40694w);
            this.f40690f = p10;
            if (p10 != null) {
                dp += this.f40690f.d.getHeight() + AndroidUtilities.dp(4.0f);
                a3 a3Var2 = this.f40690f;
                a3Var2.f35862s = i13;
                a3Var2.v = this.f40691n + this.f40692r;
            }
            i12 = AndroidUtilities.dp(16.0f) + dp;
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a3 a3Var = this.f40689e;
        int i10 = this.h;
        int i11 = this.f40691n;
        h4 h4Var = this.f40695x;
        if (!h4.l(h4Var, this.f40694w, motionEvent, this, a3Var, i10, i11)) {
            if (!h4.l(h4Var, this.f40694w, motionEvent, this, this.f40690f, this.h, this.f40691n + this.f40692r) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
