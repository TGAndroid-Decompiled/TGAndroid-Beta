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
public final class h2 extends View implements org.telegram.ui.Cells.p9, e3 {
    public final v70 f36890a;
    public final g4 f36891b;
    public b3 f36892c;
    public b3 d;
    public int f36893e;
    public int f36894f;
    public int h;
    public TL_iv.pageBlockPullquote f36895n;

    public h2(Context context, v70 v70Var, g4 g4Var) {
        super(context);
        this.f36890a = v70Var;
        this.f36891b = g4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f36892c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            arrayList.add(b3Var2);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        b3 b3Var = this.f36892c;
        if (b3Var != null) {
            i10 = Math.min(Integer.MAX_VALUE, b3Var.a() + b3Var.f34644s);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            i10 = Math.min(i10, b3Var2.a() + b3Var2.f34644s);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        this.f36890a.getClass();
        return i10 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        int i10;
        b3 b3Var = this.f36892c;
        if (b3Var != null) {
            i10 = Math.max(Integer.MIN_VALUE, b3Var.b() + b3Var.f34644s);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            i10 = Math.max(i10, b3Var2.b() + b3Var2.f34644s);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        this.f36890a.getClass();
        return AndroidUtilities.dp(18) + i10;
    }

    @Override
    public int getLastLineBoundRight() {
        int c10;
        int dp;
        b3 b3Var = this.d;
        v70 v70Var = this.f36890a;
        if (b3Var != null) {
            c10 = b3Var.c() + b3Var.f34644s;
            v70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            b3 b3Var2 = this.f36892c;
            if (b3Var2 != null) {
                c10 = b3Var2.c() + b3Var2.f34644s;
                v70Var.getClass();
                dp = AndroidUtilities.dp(18);
            } else {
                return -1;
            }
        }
        return dp + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.wl.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f36892c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            b3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f36892c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            b3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f36895n != null) {
            b3 b3Var = this.f36892c;
            v70 v70Var = this.f36890a;
            int i10 = 0;
            if (b3Var != null) {
                canvas.save();
                canvas.translate(this.f36894f, this.h);
                i4.v(v70Var, canvas, this, 0);
                this.f36892c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f36894f, this.f36893e);
                i4.v(v70Var, canvas, this, i10);
                this.d.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence j3;
        CharSequence j10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        b3 b3Var = this.f36892c;
        g4 g4Var = this.f36891b;
        v70 v70Var = this.f36890a;
        if (b3Var != null && (j10 = i4.j(v70Var, g4Var, b3Var)) != null) {
            spannableStringBuilder.append(j10);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null && (j3 = i4.j(v70Var, g4Var, b3Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(j3);
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
        v70 v70Var = this.f36890a;
        v70Var.getClass();
        this.f36894f = AndroidUtilities.dp(18);
        v70Var.getClass();
        float f7 = 8;
        this.h = AndroidUtilities.dp(f7);
        TL_iv.pageBlockPullquote pageblockpullquote = this.f36895n;
        if (pageblockpullquote != null) {
            TL_iv.RichText richText = pageblockpullquote.text;
            v70 v70Var2 = this.f36890a;
            v70Var2.getClass();
            float f10 = 36;
            b3 q6 = i4.q(v70Var2, this, null, richText, size - AndroidUtilities.dp(f10), this.h, this.f36895n, this.f36891b);
            this.f36892c = q6;
            if (q6 != null) {
                v70Var.getClass();
                int height = this.f36892c.d.getHeight() + AndroidUtilities.dp(f7);
                b3 b3Var = this.f36892c;
                b3Var.f34644s = this.f36894f;
                b3Var.v = this.h;
                i12 = height;
            } else {
                i12 = 0;
            }
            this.f36893e = AndroidUtilities.dp(2.0f) + i12;
            TL_iv.RichText richText2 = this.f36895n.caption;
            v70 v70Var3 = this.f36890a;
            v70Var3.getClass();
            b3 q10 = i4.q(v70Var3, this, null, richText2, size - AndroidUtilities.dp(f10), this.f36893e, this.f36895n, this.f36891b);
            this.d = q10;
            if (q10 != null) {
                v70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f7);
                b3 b3Var2 = this.d;
                b3Var2.f34644s = this.f36894f;
                b3Var2.v = this.f36893e;
            }
            if (i12 != 0) {
                v70Var.getClass();
                i12 += AndroidUtilities.dp(f7);
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.l(this.f36890a, this.f36891b, motionEvent, this, this.f36892c, this.f36894f, this.h)) {
            if (!i4.l(this.f36890a, this.f36891b, motionEvent, this, this.d, this.f36894f, this.f36893e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockPullquote pageblockpullquote) {
        this.f36895n = pageblockpullquote;
        requestLayout();
    }
}
