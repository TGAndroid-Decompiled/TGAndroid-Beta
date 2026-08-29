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
public final class l2 extends View implements org.telegram.ui.Cells.j9, i3 {
    public final d70 f40064a;
    public final k4 f40065b;
    public f3 f40066c;
    public f3 d;
    public int f40067e;
    public int f40068f;
    public int h;
    public TL_iv.pageBlockPullquote f40069n;

    public l2(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f40064a = d70Var;
        this.f40065b = k4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f40066c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            arrayList.add(f3Var2);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        f3 f3Var = this.f40066c;
        if (f3Var != null) {
            i10 = Math.min(Integer.MAX_VALUE, f3Var.a() + f3Var.f37974s);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            i10 = Math.min(i10, f3Var2.a() + f3Var2.f37974s);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        this.f40064a.getClass();
        return i10 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        int i10;
        f3 f3Var = this.f40066c;
        if (f3Var != null) {
            i10 = Math.max(Integer.MIN_VALUE, f3Var.b() + f3Var.f37974s);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            i10 = Math.max(i10, f3Var2.b() + f3Var2.f37974s);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        this.f40064a.getClass();
        return AndroidUtilities.dp(18) + i10;
    }

    @Override
    public int getLastLineBoundRight() {
        int c3;
        int dp;
        f3 f3Var = this.d;
        d70 d70Var = this.f40064a;
        if (f3Var != null) {
            c3 = f3Var.c() + f3Var.f37974s;
            d70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            f3 f3Var2 = this.f40066c;
            if (f3Var2 != null) {
                c3 = f3Var2.c() + f3Var2.f37974s;
                d70Var.getClass();
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
        f3 f3Var = this.f40066c;
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
        f3 f3Var = this.f40066c;
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
        if (this.f40069n != null) {
            f3 f3Var = this.f40066c;
            d70 d70Var = this.f40064a;
            int i10 = 0;
            if (f3Var != null) {
                canvas.save();
                canvas.translate(this.f40068f, this.h);
                m4.v(d70Var, canvas, this, 0);
                this.f40066c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f40068f, this.f40067e);
                m4.v(d70Var, canvas, this, i10);
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
        f3 f3Var = this.f40066c;
        k4 k4Var = this.f40065b;
        d70 d70Var = this.f40064a;
        if (f3Var != null && (j11 = m4.j(d70Var, k4Var, f3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null && (j10 = m4.j(d70Var, k4Var, f3Var2)) != null) {
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
        d70 d70Var = this.f40064a;
        d70Var.getClass();
        this.f40068f = AndroidUtilities.dp(18);
        d70Var.getClass();
        float f9 = 8;
        this.h = AndroidUtilities.dp(f9);
        TL_iv.pageBlockPullquote pageblockpullquote = this.f40069n;
        if (pageblockpullquote != null) {
            TL_iv.RichText richText = pageblockpullquote.text;
            d70 d70Var2 = this.f40064a;
            d70Var2.getClass();
            float f10 = 36;
            f3 q6 = m4.q(d70Var2, this, null, richText, size - AndroidUtilities.dp(f10), this.h, this.f40069n, this.f40065b);
            this.f40066c = q6;
            if (q6 != null) {
                d70Var.getClass();
                int height = this.f40066c.d.getHeight() + AndroidUtilities.dp(f9);
                f3 f3Var = this.f40066c;
                f3Var.f37974s = this.f40068f;
                f3Var.v = this.h;
                i12 = height;
            } else {
                i12 = 0;
            }
            this.f40067e = AndroidUtilities.dp(2.0f) + i12;
            TL_iv.RichText richText2 = this.f40069n.caption;
            d70 d70Var3 = this.f40064a;
            d70Var3.getClass();
            f3 q9 = m4.q(d70Var3, this, null, richText2, size - AndroidUtilities.dp(f10), this.f40067e, this.f40069n, this.f40065b);
            this.d = q9;
            if (q9 != null) {
                d70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f9);
                f3 f3Var2 = this.d;
                f3Var2.f37974s = this.f40068f;
                f3Var2.v = this.f40067e;
            }
            if (i12 != 0) {
                d70Var.getClass();
                i12 += AndroidUtilities.dp(f9);
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!m4.l(this.f40064a, this.f40065b, motionEvent, this, this.f40066c, this.f40068f, this.h)) {
            if (!m4.l(this.f40064a, this.f40065b, motionEvent, this, this.d, this.f40068f, this.f40067e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockPullquote pageblockpullquote) {
        this.f40069n = pageblockpullquote;
        requestLayout();
    }
}
