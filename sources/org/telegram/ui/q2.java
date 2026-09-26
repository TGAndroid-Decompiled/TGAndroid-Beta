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
public final class q2 extends FrameLayout implements org.telegram.ui.Cells.p9 {
    public final l2 f36726a;
    public final o2 f36727b;
    public final p2 f36728c;
    public TL_iv.pageBlockSlideshow d;
    public b3 e;
    public b3 f36729f;
    public final int h;
    public int f36730n;
    public int f36731r;
    public float f36732s;
    public int v;
    public final g4 f36733w;
    public final i4 f36734x;

    public q2(i4 i4Var, Context context, g4 g4Var) {
        super(context);
        this.f36734x = i4Var;
        this.h = AndroidUtilities.dp(18.0f);
        this.f36733w = g4Var;
        if (i4.B1 == null) {
            Paint paint = new Paint(1);
            i4.B1 = paint;
            paint.setColor(-1);
        }
        l2 l2Var = new l2(this, context);
        this.f36726a = l2Var;
        l2Var.b(new m2(this, 0));
        o2 o2Var = new o2(this);
        this.f36727b = o2Var;
        l2Var.setAdapter(o2Var);
        AndroidUtilities.setViewPagerEdgeEffectColor(l2Var, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19059d6, false));
        addView(l2Var);
        p2 p2Var = new p2(this, context);
        this.f36728c = p2Var;
        addView(p2Var);
        setWillNotDraw(false);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.e;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
        b3 b3Var2 = this.f36729f;
        if (b3Var2 != null) {
            arrayList.add(b3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.e;
        if (b3Var != null) {
            b3Var.attach(this);
        }
        b3 b3Var2 = this.f36729f;
        if (b3Var2 != null) {
            b3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.e;
        if (b3Var != null) {
            b3Var.detach(this);
        }
        b3 b3Var2 = this.f36729f;
        if (b3Var2 != null) {
            b3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null) {
            b3 b3Var = this.e;
            i4 i4Var = this.f36734x;
            int i10 = this.h;
            int i11 = 0;
            if (b3Var != null) {
                canvas.save();
                canvas.translate(i10, this.f36730n);
                i4.v(i4Var, canvas, this, 0);
                this.e.draw(canvas, this);
                canvas.restore();
                i11 = 1;
            }
            if (this.f36729f != null) {
                canvas.save();
                canvas.translate(i10, this.f36730n + this.f36731r);
                i4.v(i4Var, canvas, this, i11);
                this.f36729f.draw(canvas, this);
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
        if (this.f36729f != null) {
            sb2.append(", ");
            sb2.append(this.f36729f.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp = AndroidUtilities.dp(8.0f);
        l2 l2Var = this.f36726a;
        l2Var.layout(0, dp, l2Var.getMeasuredWidth(), l2Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        int bottom = l2Var.getBottom() - AndroidUtilities.dp(23.0f);
        p2 p2Var = this.f36728c;
        p2Var.layout(0, bottom, p2Var.getMeasuredWidth(), p2Var.getMeasuredHeight() + bottom);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        if (this.d != null) {
            int dp = AndroidUtilities.dp(310.0f);
            this.f36726a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
            this.d.items.size();
            this.f36728c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f), 1073741824));
            int dp2 = size - AndroidUtilities.dp(36.0f);
            int dp3 = AndroidUtilities.dp(16.0f) + dp;
            this.f36730n = dp3;
            TL_iv.pageBlockSlideshow pageblockslideshow = this.d;
            TL_iv.RichText richText = pageblockslideshow.caption.text;
            HashSet hashSet = i4.f34363b1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            i4 i4Var = this.f36734x;
            b3 p5 = i4.p(i4Var, this, null, richText, dp2, dp3, pageblockslideshow, alignment, 0, this.f36733w);
            this.e = p5;
            int i13 = this.h;
            if (p5 != null) {
                int height = this.e.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.f36731r = height;
                dp = org.telegram.messenger.f0.C(4.0f, height, dp);
                b3 b3Var = this.e;
                b3Var.f32304s = i13;
                b3Var.v = this.f36730n;
            } else {
                this.f36731r = 0;
            }
            TL_iv.pageBlockSlideshow pageblockslideshow2 = this.d;
            TL_iv.RichText richText2 = pageblockslideshow2.caption.credit;
            if (this.f36733w.G) {
                alignment = org.telegram.ui.Components.uw0.a();
            }
            b3 p10 = i4.p(i4Var, this, null, richText2, dp2, 0, pageblockslideshow2, alignment, 0, this.f36733w);
            this.f36729f = p10;
            if (p10 != null) {
                dp += this.f36729f.d.getHeight() + AndroidUtilities.dp(4.0f);
                b3 b3Var2 = this.f36729f;
                b3Var2.f32304s = i13;
                b3Var2.v = this.f36730n + this.f36731r;
            }
            i12 = AndroidUtilities.dp(16.0f) + dp;
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b3 b3Var = this.e;
        int i10 = this.h;
        int i11 = this.f36730n;
        i4 i4Var = this.f36734x;
        if (!i4.l(i4Var, this.f36733w, motionEvent, this, b3Var, i10, i11)) {
            if (!i4.l(i4Var, this.f36733w, motionEvent, this, this.f36729f, this.h, this.f36730n + this.f36731r) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
