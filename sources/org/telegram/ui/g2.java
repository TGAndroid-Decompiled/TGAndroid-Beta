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
public final class g2 extends View implements org.telegram.ui.Cells.n9, d3 {
    public final t70 f37883a;
    public final f4 f37884b;
    public a3 f37885c;
    public a3 d;
    public int f37886e;
    public int f37887f;
    public int h;
    public TL_iv.pageBlockPullquote f37888n;

    public g2(Context context, t70 t70Var, f4 f4Var) {
        super(context);
        this.f37883a = t70Var;
        this.f37884b = f4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f37885c;
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
        a3 a3Var = this.f37885c;
        if (a3Var != null) {
            i10 = Math.min(Integer.MAX_VALUE, a3Var.a() + a3Var.f35896s);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            i10 = Math.min(i10, a3Var2.a() + a3Var2.f35896s);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        this.f37883a.getClass();
        return i10 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        int i10;
        a3 a3Var = this.f37885c;
        if (a3Var != null) {
            i10 = Math.max(Integer.MIN_VALUE, a3Var.b() + a3Var.f35896s);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            i10 = Math.max(i10, a3Var2.b() + a3Var2.f35896s);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        this.f37883a.getClass();
        return AndroidUtilities.dp(18) + i10;
    }

    @Override
    public int getLastLineBoundRight() {
        int c10;
        int dp;
        a3 a3Var = this.d;
        t70 t70Var = this.f37883a;
        if (a3Var != null) {
            c10 = a3Var.c() + a3Var.f35896s;
            t70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            a3 a3Var2 = this.f37885c;
            if (a3Var2 != null) {
                c10 = a3Var2.c() + a3Var2.f35896s;
                t70Var.getClass();
                dp = AndroidUtilities.dp(18);
            } else {
                return -1;
            }
        }
        return dp + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ai.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f37885c;
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
        a3 a3Var = this.f37885c;
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
        if (this.f37888n != null) {
            a3 a3Var = this.f37885c;
            t70 t70Var = this.f37883a;
            int i10 = 0;
            if (a3Var != null) {
                canvas.save();
                canvas.translate(this.f37887f, this.h);
                h4.v(t70Var, canvas, this, 0);
                this.f37885c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f37887f, this.f37886e);
                h4.v(t70Var, canvas, this, i10);
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
        a3 a3Var = this.f37885c;
        f4 f4Var = this.f37884b;
        t70 t70Var = this.f37883a;
        if (a3Var != null && (j10 = h4.j(t70Var, f4Var, a3Var)) != null) {
            spannableStringBuilder.append(j10);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null && (j3 = h4.j(t70Var, f4Var, a3Var2)) != null) {
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
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        t70 t70Var = this.f37883a;
        t70Var.getClass();
        this.f37887f = AndroidUtilities.dp(18);
        t70Var.getClass();
        float f7 = 8;
        this.h = AndroidUtilities.dp(f7);
        TL_iv.pageBlockPullquote pageblockpullquote = this.f37888n;
        if (pageblockpullquote != null) {
            TL_iv.RichText richText = pageblockpullquote.text;
            t70 t70Var2 = this.f37883a;
            t70Var2.getClass();
            float f10 = 36;
            a3 q6 = h4.q(t70Var2, this, null, richText, size - AndroidUtilities.dp(f10), this.h, this.f37888n, this.f37884b);
            this.f37885c = q6;
            if (q6 != null) {
                t70Var.getClass();
                i13 = this.f37885c.d.getHeight() + AndroidUtilities.dp(f7);
                a3 a3Var = this.f37885c;
                a3Var.f35896s = this.f37887f;
                a3Var.v = this.h;
            } else {
                i13 = 0;
            }
            i12 = i13;
            this.f37886e = AndroidUtilities.dp(2.0f) + i12;
            TL_iv.RichText richText2 = this.f37888n.caption;
            t70 t70Var3 = this.f37883a;
            t70Var3.getClass();
            a3 q10 = h4.q(t70Var3, this, null, richText2, size - AndroidUtilities.dp(f10), this.f37886e, this.f37888n, this.f37884b);
            this.d = q10;
            if (q10 != null) {
                t70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f7);
                a3 a3Var2 = this.d;
                a3Var2.f35896s = this.f37887f;
                a3Var2.v = this.f37886e;
            }
            if (i12 != 0) {
                t70Var.getClass();
                i12 += AndroidUtilities.dp(f7);
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!h4.l(this.f37883a, this.f37884b, motionEvent, this, this.f37885c, this.f37887f, this.h)) {
            if (!h4.l(this.f37883a, this.f37884b, motionEvent, this, this.d, this.f37887f, this.f37886e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockPullquote pageblockpullquote) {
        this.f37888n = pageblockpullquote;
        requestLayout();
    }
}
