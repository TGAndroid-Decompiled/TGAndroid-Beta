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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
public final class p2 extends FrameLayout implements org.telegram.ui.Cells.r9, org.telegram.ui.ActionBar.p6 {
    public int f42323a;
    public final k2 f42324b;
    public final n2 f42325c;
    public final o2 d;
    public TL_iv.pageBlockSlideshow e;
    public a3 f42326f;
    public a3 h;
    public final int f42327n;
    public int f42328r;
    public int f42329s;
    public float v;
    public int f42330w;
    public final h4 f42331x;
    public final j4 f42332y;

    public p2(j4 j4Var, Context context, h4 h4Var) {
        super(context);
        this.f42332y = j4Var;
        this.f42327n = AndroidUtilities.dp(18.0f);
        this.f42331x = h4Var;
        if (j4.C1 == null) {
            Paint paint = new Paint(1);
            j4.C1 = paint;
            paint.setColor(-1);
        }
        k2 k2Var = new k2(this, context);
        this.f42324b = k2Var;
        k2Var.b(new l2(this, 0));
        n2 n2Var = new n2(this);
        this.f42325c = n2Var;
        k2Var.setAdapter(n2Var);
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23354d6, false);
        this.f42323a = x02;
        AndroidUtilities.setViewPagerEdgeEffectColor(k2Var, x02);
        addView(k2Var);
        o2 o2Var = new o2(this, context);
        this.d = o2Var;
        addView(o2Var);
        setWillNotDraw(false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23354d6));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f42326f;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.h;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f42326f;
        if (a3Var != null) {
            a3Var.attach(this);
        }
        a3 a3Var2 = this.h;
        if (a3Var2 != null) {
            a3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f42326f;
        if (a3Var != null) {
            a3Var.detach(this);
        }
        a3 a3Var2 = this.h;
        if (a3Var2 != null) {
            a3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.e != null) {
            a3 a3Var = this.f42326f;
            j4 j4Var = this.f42332y;
            int i10 = this.f42327n;
            int i11 = 0;
            if (a3Var != null) {
                canvas.save();
                canvas.translate(i10, this.f42328r);
                j4.v(j4Var, canvas, this, 0);
                this.f42326f.draw(canvas, this);
                canvas.restore();
                i11 = 1;
            }
            if (this.h != null) {
                canvas.save();
                canvas.translate(i10, this.f42328r + this.f42329s);
                j4.v(j4Var, canvas, this, i11);
                this.h.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVSlideshow));
        if (this.f42326f != null) {
            sb2.append(", ");
            sb2.append(this.f42326f.d.getText());
        }
        if (this.h != null) {
            sb2.append(", ");
            sb2.append(this.h.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp = AndroidUtilities.dp(8.0f);
        k2 k2Var = this.f42324b;
        k2Var.layout(0, dp, k2Var.getMeasuredWidth(), k2Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        int bottom = k2Var.getBottom() - AndroidUtilities.dp(23.0f);
        o2 o2Var = this.d;
        o2Var.layout(0, bottom, o2Var.getMeasuredWidth(), o2Var.getMeasuredHeight() + bottom);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        if (this.e != null) {
            int dp = AndroidUtilities.dp(310.0f);
            this.f42324b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
            this.e.items.size();
            this.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f), 1073741824));
            int dp2 = size - AndroidUtilities.dp(36.0f);
            int dp3 = AndroidUtilities.dp(16.0f) + dp;
            this.f42328r = dp3;
            TL_iv.pageBlockSlideshow pageblockslideshow = this.e;
            TL_iv.RichText richText = pageblockslideshow.caption.text;
            HashSet hashSet = j4.f40402c1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            j4 j4Var = this.f42332y;
            a3 p10 = j4.p(j4Var, this, null, richText, dp2, dp3, pageblockslideshow, alignment, 0, this.f42331x);
            this.f42326f = p10;
            int i13 = this.f42327n;
            if (p10 != null) {
                int height = this.f42326f.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.f42329s = height;
                dp = org.telegram.messenger.t.D(4.0f, height, dp);
                a3 a3Var = this.f42326f;
                a3Var.f37631s = i13;
                a3Var.v = this.f42328r;
            } else {
                this.f42329s = 0;
            }
            TL_iv.pageBlockSlideshow pageblockslideshow2 = this.e;
            TL_iv.RichText richText2 = pageblockslideshow2.caption.credit;
            if (this.f42331x.G) {
                alignment = org.telegram.ui.Components.px0.a();
            }
            a3 p11 = j4.p(j4Var, this, null, richText2, dp2, 0, pageblockslideshow2, alignment, 0, this.f42331x);
            this.h = p11;
            if (p11 != null) {
                dp += this.h.d.getHeight() + AndroidUtilities.dp(4.0f);
                a3 a3Var2 = this.h;
                a3Var2.f37631s = i13;
                a3Var2.v = this.f42328r + this.f42329s;
            }
            i12 = AndroidUtilities.dp(16.0f) + dp;
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a3 a3Var = this.f42326f;
        int i10 = this.f42327n;
        int i11 = this.f42328r;
        j4 j4Var = this.f42332y;
        if (!j4.l(j4Var, this.f42331x, motionEvent, this, a3Var, i10, i11)) {
            if (!j4.l(j4Var, this.f42331x, motionEvent, this, this.h, this.f42327n, this.f42328r + this.f42329s) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        k2 k2Var = this.f42324b;
        if (k2Var != null) {
            try {
                int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23354d6, false);
                if (x02 != this.f42323a) {
                    this.f42323a = x02;
                    AndroidUtilities.setViewPagerEdgeEffectColor(k2Var, x02);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
