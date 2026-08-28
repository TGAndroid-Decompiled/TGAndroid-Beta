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
public final class k2 extends View implements org.telegram.ui.Cells.m9, h3 {
    public final a70 f39676a;
    public final j4 f39677b;
    public e3 f39678c;
    public e3 d;
    public int f39679e;
    public int f39680f;
    public int h;
    public TL_iv.pageBlockPullquote f39681n;

    public k2(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.f39676a = a70Var;
        this.f39677b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.f39678c;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            arrayList.add(e3Var2);
        }
    }

    @Override
    public int getBoundLeft() {
        int i9;
        e3 e3Var = this.f39678c;
        if (e3Var != null) {
            i9 = Math.min(Integer.MAX_VALUE, e3Var.a() + e3Var.f37805s);
        } else {
            i9 = Integer.MAX_VALUE;
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            i9 = Math.min(i9, e3Var2.a() + e3Var2.f37805s);
        }
        if (i9 == Integer.MAX_VALUE) {
            return -1;
        }
        this.f39676a.getClass();
        return i9 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        int i9;
        e3 e3Var = this.f39678c;
        if (e3Var != null) {
            i9 = Math.max(Integer.MIN_VALUE, e3Var.b() + e3Var.f37805s);
        } else {
            i9 = Integer.MIN_VALUE;
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            i9 = Math.max(i9, e3Var2.b() + e3Var2.f37805s);
        }
        if (i9 == Integer.MIN_VALUE) {
            return -1;
        }
        this.f39676a.getClass();
        return AndroidUtilities.dp(18) + i9;
    }

    @Override
    public int getLastLineBoundRight() {
        int c10;
        int dp;
        e3 e3Var = this.d;
        a70 a70Var = this.f39676a;
        if (e3Var != null) {
            c10 = e3Var.c() + e3Var.f37805s;
            a70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            e3 e3Var2 = this.f39678c;
            if (e3Var2 != null) {
                c10 = e3Var2.c() + e3Var2.f37805s;
                a70Var.getClass();
                dp = AndroidUtilities.dp(18);
            } else {
                return -1;
            }
        }
        return dp + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ll.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.f39678c;
        if (e3Var != null) {
            e3Var.attach(this);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            e3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.f39678c;
        if (e3Var != null) {
            e3Var.detach(this);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            e3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f39681n != null) {
            e3 e3Var = this.f39678c;
            a70 a70Var = this.f39676a;
            int i9 = 0;
            if (e3Var != null) {
                canvas.save();
                canvas.translate(this.f39680f, this.h);
                l4.v(a70Var, canvas, this, 0);
                this.f39678c.draw(canvas, this);
                canvas.restore();
                i9 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f39680f, this.f39679e);
                l4.v(a70Var, canvas, this, i9);
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
        e3 e3Var = this.f39678c;
        j4 j4Var = this.f39677b;
        a70 a70Var = this.f39676a;
        if (e3Var != null && (j11 = l4.j(a70Var, j4Var, e3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null && (j10 = l4.j(a70Var, j4Var, e3Var2)) != null) {
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
    public final void onMeasure(int i9, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i9);
        a70 a70Var = this.f39676a;
        a70Var.getClass();
        this.f39680f = AndroidUtilities.dp(18);
        a70Var.getClass();
        float f10 = 8;
        this.h = AndroidUtilities.dp(f10);
        TL_iv.pageBlockPullquote pageblockpullquote = this.f39681n;
        if (pageblockpullquote != null) {
            TL_iv.RichText richText = pageblockpullquote.text;
            a70 a70Var2 = this.f39676a;
            a70Var2.getClass();
            float f11 = 36;
            e3 q10 = l4.q(a70Var2, this, null, richText, size - AndroidUtilities.dp(f11), this.h, this.f39681n, this.f39677b);
            this.f39678c = q10;
            if (q10 != null) {
                a70Var.getClass();
                int height = this.f39678c.d.getHeight() + AndroidUtilities.dp(f10);
                e3 e3Var = this.f39678c;
                e3Var.f37805s = this.f39680f;
                e3Var.v = this.h;
                i11 = height;
            } else {
                i11 = 0;
            }
            this.f39679e = AndroidUtilities.dp(2.0f) + i11;
            TL_iv.RichText richText2 = this.f39681n.caption;
            a70 a70Var3 = this.f39676a;
            a70Var3.getClass();
            e3 q11 = l4.q(a70Var3, this, null, richText2, size - AndroidUtilities.dp(f11), this.f39679e, this.f39681n, this.f39677b);
            this.d = q11;
            if (q11 != null) {
                a70Var.getClass();
                i11 += this.d.d.getHeight() + AndroidUtilities.dp(f10);
                e3 e3Var2 = this.d;
                e3Var2.f37805s = this.f39680f;
                e3Var2.v = this.f39679e;
            }
            if (i11 != 0) {
                a70Var.getClass();
                i11 += AndroidUtilities.dp(f10);
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.f39676a, this.f39677b, motionEvent, this, this.f39678c, this.f39680f, this.h)) {
            if (!l4.l(this.f39676a, this.f39677b, motionEvent, this, this.d, this.f39680f, this.f39679e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockPullquote pageblockpullquote) {
        this.f39681n = pageblockpullquote;
        requestLayout();
    }
}
