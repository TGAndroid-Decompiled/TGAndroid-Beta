package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
public final class j2 extends View implements org.telegram.ui.Cells.l9, g3 {
    public final n70 f35207a;
    public final j4 f35208b;
    public d3 f35209c;
    public d3 d;
    public int e;
    public int f35210f;
    public int h;
    public TL_iv.pageBlockPullquote f35211n;

    public j2(Context context, n70 n70Var, j4 j4Var) {
        super(context);
        this.f35207a = n70Var;
        this.f35208b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f35209c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            arrayList.add(d3Var2);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        d3 d3Var = this.f35209c;
        if (d3Var != null) {
            i10 = Math.min(Integer.MAX_VALUE, d3Var.a() + d3Var.f33499s);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            i10 = Math.min(i10, d3Var2.a() + d3Var2.f33499s);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        this.f35207a.getClass();
        return i10 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        int i10;
        d3 d3Var = this.f35209c;
        if (d3Var != null) {
            i10 = Math.max(Integer.MIN_VALUE, d3Var.b() + d3Var.f33499s);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            i10 = Math.max(i10, d3Var2.b() + d3Var2.f33499s);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        this.f35207a.getClass();
        return AndroidUtilities.dp(18) + i10;
    }

    @Override
    public int getLastLineBoundRight() {
        int c3;
        int dp;
        d3 d3Var = this.d;
        n70 n70Var = this.f35207a;
        if (d3Var != null) {
            c3 = d3Var.c() + d3Var.f33499s;
            n70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            d3 d3Var2 = this.f35209c;
            if (d3Var2 != null) {
                c3 = d3Var2.c() + d3Var2.f33499s;
                n70Var.getClass();
                dp = AndroidUtilities.dp(18);
            } else {
                return -1;
            }
        }
        return dp + c3;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f35209c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            d3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f35209c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            d3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f35211n != null) {
            d3 d3Var = this.f35209c;
            n70 n70Var = this.f35207a;
            int i10 = 0;
            if (d3Var != null) {
                canvas.save();
                canvas.translate(this.f35210f, this.h);
                l4.v(n70Var, canvas, this, 0);
                this.f35209c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f35210f, this.e);
                l4.v(n70Var, canvas, this, i10);
                this.d.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence j10;
        CharSequence j11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        d3 d3Var = this.f35209c;
        j4 j4Var = this.f35208b;
        n70 n70Var = this.f35207a;
        if (d3Var != null && (j11 = l4.j(n70Var, j4Var, d3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null && (j10 = l4.j(n70Var, j4Var, d3Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(j10);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) LocaleController.getString(R.string.AccDescrIVPullquote));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        n70 n70Var = this.f35207a;
        n70Var.getClass();
        this.f35210f = AndroidUtilities.dp(18);
        n70Var.getClass();
        float f10 = 8;
        this.h = AndroidUtilities.dp(f10);
        TL_iv.pageBlockPullquote pageblockpullquote = this.f35211n;
        if (pageblockpullquote != null) {
            TL_iv.RichText richText = pageblockpullquote.text;
            n70 n70Var2 = this.f35207a;
            n70Var2.getClass();
            float f11 = 36;
            d3 q10 = l4.q(n70Var2, this, null, richText, size - AndroidUtilities.dp(f11), this.h, this.f35211n, this.f35208b);
            this.f35209c = q10;
            if (q10 != null) {
                n70Var.getClass();
                int height = this.f35209c.d.getHeight() + AndroidUtilities.dp(f10);
                d3 d3Var = this.f35209c;
                d3Var.f33499s = this.f35210f;
                d3Var.v = this.h;
                i12 = height;
            } else {
                i12 = 0;
            }
            this.e = AndroidUtilities.dp(2.0f) + i12;
            TL_iv.RichText richText2 = this.f35211n.caption;
            n70 n70Var3 = this.f35207a;
            n70Var3.getClass();
            d3 q11 = l4.q(n70Var3, this, null, richText2, size - AndroidUtilities.dp(f11), this.e, this.f35211n, this.f35208b);
            this.d = q11;
            if (q11 != null) {
                n70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f10);
                d3 d3Var2 = this.d;
                d3Var2.f33499s = this.f35210f;
                d3Var2.v = this.e;
            }
            if (i12 != 0) {
                n70Var.getClass();
                i12 += AndroidUtilities.dp(f10);
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.f35207a, this.f35208b, motionEvent, this, this.f35209c, this.f35210f, this.h)) {
            if (!l4.l(this.f35207a, this.f35208b, motionEvent, this, this.d, this.f35210f, this.e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockPullquote pageblockpullquote) {
        this.f35211n = pageblockpullquote;
        requestLayout();
    }
}
