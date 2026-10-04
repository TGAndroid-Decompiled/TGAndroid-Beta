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
    public final t70 f36830a;
    public final g4 f36831b;
    public b3 f36832c;
    public b3 d;
    public int f36833e;
    public int f36834f;
    public int h;
    public TL_iv.pageBlockPullquote f36835n;

    public h2(Context context, t70 t70Var, g4 g4Var) {
        super(context);
        this.f36830a = t70Var;
        this.f36831b = g4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f36832c;
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
        b3 b3Var = this.f36832c;
        if (b3Var != null) {
            i10 = Math.min(Integer.MAX_VALUE, b3Var.a() + b3Var.f34979s);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            i10 = Math.min(i10, b3Var2.a() + b3Var2.f34979s);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        this.f36830a.getClass();
        return i10 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        int i10;
        b3 b3Var = this.f36832c;
        if (b3Var != null) {
            i10 = Math.max(Integer.MIN_VALUE, b3Var.b() + b3Var.f34979s);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            i10 = Math.max(i10, b3Var2.b() + b3Var2.f34979s);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        this.f36830a.getClass();
        return AndroidUtilities.dp(18) + i10;
    }

    @Override
    public int getLastLineBoundRight() {
        int c10;
        int dp;
        b3 b3Var = this.d;
        t70 t70Var = this.f36830a;
        if (b3Var != null) {
            c10 = b3Var.c() + b3Var.f34979s;
            t70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            b3 b3Var2 = this.f36832c;
            if (b3Var2 != null) {
                c10 = b3Var2.c() + b3Var2.f34979s;
                t70Var.getClass();
                dp = AndroidUtilities.dp(18);
            } else {
                return -1;
            }
        }
        return dp + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ok.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f36832c;
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
        b3 b3Var = this.f36832c;
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
        if (this.f36835n != null) {
            b3 b3Var = this.f36832c;
            t70 t70Var = this.f36830a;
            int i10 = 0;
            if (b3Var != null) {
                canvas.save();
                canvas.translate(this.f36834f, this.h);
                i4.v(t70Var, canvas, this, 0);
                this.f36832c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f36834f, this.f36833e);
                i4.v(t70Var, canvas, this, i10);
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
        b3 b3Var = this.f36832c;
        g4 g4Var = this.f36831b;
        t70 t70Var = this.f36830a;
        if (b3Var != null && (j10 = i4.j(t70Var, g4Var, b3Var)) != null) {
            spannableStringBuilder.append(j10);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null && (j3 = i4.j(t70Var, g4Var, b3Var2)) != null) {
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
        t70 t70Var = this.f36830a;
        t70Var.getClass();
        this.f36834f = AndroidUtilities.dp(18);
        t70Var.getClass();
        float f7 = 8;
        this.h = AndroidUtilities.dp(f7);
        TL_iv.pageBlockPullquote pageblockpullquote = this.f36835n;
        if (pageblockpullquote != null) {
            TL_iv.RichText richText = pageblockpullquote.text;
            t70 t70Var2 = this.f36830a;
            t70Var2.getClass();
            float f10 = 36;
            b3 q6 = i4.q(t70Var2, this, null, richText, size - AndroidUtilities.dp(f10), this.h, this.f36835n, this.f36831b);
            this.f36832c = q6;
            if (q6 != null) {
                t70Var.getClass();
                int height = this.f36832c.d.getHeight() + AndroidUtilities.dp(f7);
                b3 b3Var = this.f36832c;
                b3Var.f34979s = this.f36834f;
                b3Var.v = this.h;
                i12 = height;
            } else {
                i12 = 0;
            }
            this.f36833e = AndroidUtilities.dp(2.0f) + i12;
            TL_iv.RichText richText2 = this.f36835n.caption;
            t70 t70Var3 = this.f36830a;
            t70Var3.getClass();
            b3 q10 = i4.q(t70Var3, this, null, richText2, size - AndroidUtilities.dp(f10), this.f36833e, this.f36835n, this.f36831b);
            this.d = q10;
            if (q10 != null) {
                t70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f7);
                b3 b3Var2 = this.d;
                b3Var2.f34979s = this.f36834f;
                b3Var2.v = this.f36833e;
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
        if (!i4.l(this.f36830a, this.f36831b, motionEvent, this, this.f36832c, this.f36834f, this.h)) {
            if (!i4.l(this.f36830a, this.f36831b, motionEvent, this, this.d, this.f36834f, this.f36833e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockPullquote pageblockpullquote) {
        this.f36835n = pageblockpullquote;
        requestLayout();
    }
}
