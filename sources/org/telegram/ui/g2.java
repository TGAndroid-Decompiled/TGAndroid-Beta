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
public final class g2 extends View implements org.telegram.ui.Cells.p9, d3 {
    public final w70 f33818a;
    public final f4 f33819b;
    public a3 f33820c;
    public a3 d;
    public int e;
    public int f33821f;
    public int h;
    public TL_iv.pageBlockPullquote f33822n;

    public g2(Context context, w70 w70Var, f4 f4Var) {
        super(context);
        this.f33818a = w70Var;
        this.f33819b = f4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f33820c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        a3 a3Var = this.f33820c;
        if (a3Var != null) {
            i10 = Math.min(Integer.MAX_VALUE, a3Var.a() + a3Var.f31694s);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            i10 = Math.min(i10, a3Var2.a() + a3Var2.f31694s);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        this.f33818a.getClass();
        return i10 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        int i10;
        a3 a3Var = this.f33820c;
        if (a3Var != null) {
            i10 = Math.max(Integer.MIN_VALUE, a3Var.b() + a3Var.f31694s);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            i10 = Math.max(i10, a3Var2.b() + a3Var2.f31694s);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        this.f33818a.getClass();
        return AndroidUtilities.dp(18) + i10;
    }

    @Override
    public int getLastLineBoundRight() {
        int c10;
        int dp;
        a3 a3Var = this.d;
        w70 w70Var = this.f33818a;
        if (a3Var != null) {
            c10 = a3Var.c() + a3Var.f31694s;
            w70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            a3 a3Var2 = this.f33820c;
            if (a3Var2 != null) {
                c10 = a3Var2.c() + a3Var2.f31694s;
                w70Var.getClass();
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
        a3 a3Var = this.f33820c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f33820c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f33822n != null) {
            a3 a3Var = this.f33820c;
            w70 w70Var = this.f33818a;
            int i10 = 0;
            if (a3Var != null) {
                canvas.save();
                canvas.translate(this.f33821f, this.h);
                h4.v(w70Var, canvas, this, 0);
                this.f33820c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f33821f, this.e);
                h4.v(w70Var, canvas, this, i10);
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
        a3 a3Var = this.f33820c;
        f4 f4Var = this.f33819b;
        w70 w70Var = this.f33818a;
        if (a3Var != null && (j10 = h4.j(w70Var, f4Var, a3Var)) != null) {
            spannableStringBuilder.append(j10);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null && (j3 = h4.j(w70Var, f4Var, a3Var2)) != null) {
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
        w70 w70Var = this.f33818a;
        w70Var.getClass();
        this.f33821f = AndroidUtilities.dp(18);
        w70Var.getClass();
        float f7 = 8;
        this.h = AndroidUtilities.dp(f7);
        TL_iv.pageBlockPullquote pageblockpullquote = this.f33822n;
        if (pageblockpullquote != null) {
            TL_iv.RichText richText = pageblockpullquote.text;
            w70 w70Var2 = this.f33818a;
            w70Var2.getClass();
            float f10 = 36;
            a3 q6 = h4.q(w70Var2, this, null, richText, size - AndroidUtilities.dp(f10), this.h, this.f33822n, this.f33819b);
            this.f33820c = q6;
            if (q6 != null) {
                w70Var.getClass();
                int height = this.f33820c.d.getHeight() + AndroidUtilities.dp(f7);
                a3 a3Var = this.f33820c;
                a3Var.f31694s = this.f33821f;
                a3Var.v = this.h;
                i12 = height;
            } else {
                i12 = 0;
            }
            this.e = AndroidUtilities.dp(2.0f) + i12;
            TL_iv.RichText richText2 = this.f33822n.caption;
            w70 w70Var3 = this.f33818a;
            w70Var3.getClass();
            a3 q10 = h4.q(w70Var3, this, null, richText2, size - AndroidUtilities.dp(f10), this.e, this.f33822n, this.f33819b);
            this.d = q10;
            if (q10 != null) {
                w70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f7);
                a3 a3Var2 = this.d;
                a3Var2.f31694s = this.f33821f;
                a3Var2.v = this.e;
            }
            if (i12 != 0) {
                w70Var.getClass();
                i12 += AndroidUtilities.dp(f7);
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!h4.l(this.f33818a, this.f33819b, motionEvent, this, this.f33820c, this.f33821f, this.h)) {
            if (!h4.l(this.f33818a, this.f33819b, motionEvent, this, this.d, this.f33821f, this.e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockPullquote pageblockpullquote) {
        this.f33822n = pageblockpullquote;
        requestLayout();
    }
}
