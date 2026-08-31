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
    public final o70 f37985a;
    public final j4 f37986b;
    public d3 f37987c;
    public d3 d;
    public int f37988e;
    public int f37989f;
    public int h;
    public TL_iv.pageBlockPullquote f37990n;

    public j2(Context context, o70 o70Var, j4 j4Var) {
        super(context);
        this.f37985a = o70Var;
        this.f37986b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f37987c;
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
        d3 d3Var = this.f37987c;
        if (d3Var != null) {
            i10 = Math.min(Integer.MAX_VALUE, d3Var.a() + d3Var.f35986s);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            i10 = Math.min(i10, d3Var2.a() + d3Var2.f35986s);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        this.f37985a.getClass();
        return i10 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        int i10;
        d3 d3Var = this.f37987c;
        if (d3Var != null) {
            i10 = Math.max(Integer.MIN_VALUE, d3Var.b() + d3Var.f35986s);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            i10 = Math.max(i10, d3Var2.b() + d3Var2.f35986s);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        this.f37985a.getClass();
        return AndroidUtilities.dp(18) + i10;
    }

    @Override
    public int getLastLineBoundRight() {
        int c3;
        int dp;
        d3 d3Var = this.d;
        o70 o70Var = this.f37985a;
        if (d3Var != null) {
            c3 = d3Var.c() + d3Var.f35986s;
            o70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            d3 d3Var2 = this.f37987c;
            if (d3Var2 != null) {
                c3 = d3Var2.c() + d3Var2.f35986s;
                o70Var.getClass();
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
        d3 d3Var = this.f37987c;
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
        d3 d3Var = this.f37987c;
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
        if (this.f37990n != null) {
            d3 d3Var = this.f37987c;
            o70 o70Var = this.f37985a;
            int i10 = 0;
            if (d3Var != null) {
                canvas.save();
                canvas.translate(this.f37989f, this.h);
                l4.v(o70Var, canvas, this, 0);
                this.f37987c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f37989f, this.f37988e);
                l4.v(o70Var, canvas, this, i10);
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
        d3 d3Var = this.f37987c;
        j4 j4Var = this.f37986b;
        o70 o70Var = this.f37985a;
        if (d3Var != null && (j11 = l4.j(o70Var, j4Var, d3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null && (j10 = l4.j(o70Var, j4Var, d3Var2)) != null) {
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
        o70 o70Var = this.f37985a;
        o70Var.getClass();
        this.f37989f = AndroidUtilities.dp(18);
        o70Var.getClass();
        float f10 = 8;
        this.h = AndroidUtilities.dp(f10);
        TL_iv.pageBlockPullquote pageblockpullquote = this.f37990n;
        if (pageblockpullquote != null) {
            TL_iv.RichText richText = pageblockpullquote.text;
            o70 o70Var2 = this.f37985a;
            o70Var2.getClass();
            float f11 = 36;
            d3 q10 = l4.q(o70Var2, this, null, richText, size - AndroidUtilities.dp(f11), this.h, this.f37990n, this.f37986b);
            this.f37987c = q10;
            if (q10 != null) {
                o70Var.getClass();
                int height = this.f37987c.d.getHeight() + AndroidUtilities.dp(f10);
                d3 d3Var = this.f37987c;
                d3Var.f35986s = this.f37989f;
                d3Var.v = this.h;
                i12 = height;
            } else {
                i12 = 0;
            }
            this.f37988e = AndroidUtilities.dp(2.0f) + i12;
            TL_iv.RichText richText2 = this.f37990n.caption;
            o70 o70Var3 = this.f37985a;
            o70Var3.getClass();
            d3 q11 = l4.q(o70Var3, this, null, richText2, size - AndroidUtilities.dp(f11), this.f37988e, this.f37990n, this.f37986b);
            this.d = q11;
            if (q11 != null) {
                o70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f10);
                d3 d3Var2 = this.d;
                d3Var2.f35986s = this.f37989f;
                d3Var2.v = this.f37988e;
            }
            if (i12 != 0) {
                o70Var.getClass();
                i12 += AndroidUtilities.dp(f10);
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.f37985a, this.f37986b, motionEvent, this, this.f37987c, this.f37989f, this.h)) {
            if (!l4.l(this.f37985a, this.f37986b, motionEvent, this, this.d, this.f37989f, this.f37988e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockPullquote pageblockpullquote) {
        this.f37990n = pageblockpullquote;
        requestLayout();
    }
}
