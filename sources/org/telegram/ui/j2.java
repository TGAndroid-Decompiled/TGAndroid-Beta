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
public final class j2 extends View implements org.telegram.ui.Cells.m9, g3 {
    public final b70 f38138a;
    public final j4 f38139b;
    public d3 f38140c;
    public d3 d;
    public int e;
    public int f38141f;
    public int h;
    public TL_iv.pageBlockPullquote f38142n;

    public j2(Context context, b70 b70Var, j4 j4Var) {
        super(context);
        this.f38138a = b70Var;
        this.f38139b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f38140c;
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
        d3 d3Var = this.f38140c;
        if (d3Var != null) {
            i10 = Math.min(Integer.MAX_VALUE, d3Var.a() + d3Var.f36235s);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            i10 = Math.min(i10, d3Var2.a() + d3Var2.f36235s);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        this.f38138a.getClass();
        return i10 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        int i10;
        d3 d3Var = this.f38140c;
        if (d3Var != null) {
            i10 = Math.max(Integer.MIN_VALUE, d3Var.b() + d3Var.f36235s);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            i10 = Math.max(i10, d3Var2.b() + d3Var2.f36235s);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        this.f38138a.getClass();
        return AndroidUtilities.dp(18) + i10;
    }

    @Override
    public int getLastLineBoundRight() {
        int c10;
        int dp;
        d3 d3Var = this.d;
        b70 b70Var = this.f38138a;
        if (d3Var != null) {
            c10 = d3Var.c() + d3Var.f36235s;
            b70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            d3 d3Var2 = this.f38140c;
            if (d3Var2 != null) {
                c10 = d3Var2.c() + d3Var2.f36235s;
                b70Var.getClass();
                dp = AndroidUtilities.dp(18);
            } else {
                return -1;
            }
        }
        return dp + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.kk.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f38140c;
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
        d3 d3Var = this.f38140c;
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
        if (this.f38142n != null) {
            d3 d3Var = this.f38140c;
            b70 b70Var = this.f38138a;
            int i10 = 0;
            if (d3Var != null) {
                canvas.save();
                canvas.translate(this.f38141f, this.h);
                l4.v(b70Var, canvas, this, 0);
                this.f38140c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f38141f, this.e);
                l4.v(b70Var, canvas, this, i10);
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
        d3 d3Var = this.f38140c;
        j4 j4Var = this.f38139b;
        b70 b70Var = this.f38138a;
        if (d3Var != null && (j11 = l4.j(b70Var, j4Var, d3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null && (j10 = l4.j(b70Var, j4Var, d3Var2)) != null) {
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
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        b70 b70Var = this.f38138a;
        b70Var.getClass();
        this.f38141f = AndroidUtilities.dp(18);
        b70Var.getClass();
        float f7 = 8;
        this.h = AndroidUtilities.dp(f7);
        TL_iv.pageBlockPullquote pageblockpullquote = this.f38142n;
        if (pageblockpullquote != null) {
            TL_iv.RichText richText = pageblockpullquote.text;
            b70 b70Var2 = this.f38138a;
            b70Var2.getClass();
            float f10 = 36;
            d3 q6 = l4.q(b70Var2, this, null, richText, size - AndroidUtilities.dp(f10), this.h, this.f38142n, this.f38139b);
            this.f38140c = q6;
            if (q6 != null) {
                b70Var.getClass();
                i13 = this.f38140c.d.getHeight() + AndroidUtilities.dp(f7);
                d3 d3Var = this.f38140c;
                d3Var.f36235s = this.f38141f;
                d3Var.v = this.h;
            } else {
                i13 = 0;
            }
            i12 = i13;
            this.e = AndroidUtilities.dp(2.0f) + i12;
            TL_iv.RichText richText2 = this.f38142n.caption;
            b70 b70Var3 = this.f38138a;
            b70Var3.getClass();
            d3 q10 = l4.q(b70Var3, this, null, richText2, size - AndroidUtilities.dp(f10), this.e, this.f38142n, this.f38139b);
            this.d = q10;
            if (q10 != null) {
                b70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f7);
                d3 d3Var2 = this.d;
                d3Var2.f36235s = this.f38141f;
                d3Var2.v = this.e;
            }
            if (i12 != 0) {
                b70Var.getClass();
                i12 += AndroidUtilities.dp(f7);
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.f38138a, this.f38139b, motionEvent, this, this.f38140c, this.f38141f, this.h)) {
            if (!l4.l(this.f38138a, this.f38139b, motionEvent, this, this.d, this.f38141f, this.e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockPullquote pageblockpullquote) {
        this.f38142n = pageblockpullquote;
        requestLayout();
    }
}
