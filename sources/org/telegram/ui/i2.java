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
public final class i2 extends View implements org.telegram.ui.Cells.n9, f3 {
    public final f70 f38122a;
    public final i4 f38123b;
    public c3 f38124c;
    public c3 d;
    public int e;
    public int f38125f;
    public int h;
    public TL_iv.pageBlockPullquote f38126n;

    public i2(Context context, f70 f70Var, i4 i4Var) {
        super(context);
        this.f38122a = f70Var;
        this.f38123b = i4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f38124c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            arrayList.add(c3Var2);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        c3 c3Var = this.f38124c;
        if (c3Var != null) {
            i10 = Math.min(Integer.MAX_VALUE, c3Var.a() + c3Var.f36208s);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            i10 = Math.min(i10, c3Var2.a() + c3Var2.f36208s);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        this.f38122a.getClass();
        return i10 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        int i10;
        c3 c3Var = this.f38124c;
        if (c3Var != null) {
            i10 = Math.max(Integer.MIN_VALUE, c3Var.b() + c3Var.f36208s);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            i10 = Math.max(i10, c3Var2.b() + c3Var2.f36208s);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        this.f38122a.getClass();
        return AndroidUtilities.dp(18) + i10;
    }

    @Override
    public int getLastLineBoundRight() {
        int c10;
        int dp;
        c3 c3Var = this.d;
        f70 f70Var = this.f38122a;
        if (c3Var != null) {
            c10 = c3Var.c() + c3Var.f36208s;
            f70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            c3 c3Var2 = this.f38124c;
            if (c3Var2 != null) {
                c10 = c3Var2.c() + c3Var2.f36208s;
                f70Var.getClass();
                dp = AndroidUtilities.dp(18);
            } else {
                return -1;
            }
        }
        return dp + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.tl.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f38124c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            c3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f38124c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            c3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f38126n != null) {
            c3 c3Var = this.f38124c;
            f70 f70Var = this.f38122a;
            int i10 = 0;
            if (c3Var != null) {
                canvas.save();
                canvas.translate(this.f38125f, this.h);
                k4.v(f70Var, canvas, this, 0);
                this.f38124c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f38125f, this.e);
                k4.v(f70Var, canvas, this, i10);
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
        c3 c3Var = this.f38124c;
        i4 i4Var = this.f38123b;
        f70 f70Var = this.f38122a;
        if (c3Var != null && (j11 = k4.j(f70Var, i4Var, c3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null && (j10 = k4.j(f70Var, i4Var, c3Var2)) != null) {
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
        f70 f70Var = this.f38122a;
        f70Var.getClass();
        this.f38125f = AndroidUtilities.dp(18);
        f70Var.getClass();
        float f7 = 8;
        this.h = AndroidUtilities.dp(f7);
        TL_iv.pageBlockPullquote pageblockpullquote = this.f38126n;
        if (pageblockpullquote != null) {
            TL_iv.RichText richText = pageblockpullquote.text;
            f70 f70Var2 = this.f38122a;
            f70Var2.getClass();
            float f10 = 36;
            c3 q6 = k4.q(f70Var2, this, null, richText, size - AndroidUtilities.dp(f10), this.h, this.f38126n, this.f38123b);
            this.f38124c = q6;
            if (q6 != null) {
                f70Var.getClass();
                i13 = this.f38124c.d.getHeight() + AndroidUtilities.dp(f7);
                c3 c3Var = this.f38124c;
                c3Var.f36208s = this.f38125f;
                c3Var.v = this.h;
            } else {
                i13 = 0;
            }
            i12 = i13;
            this.e = AndroidUtilities.dp(2.0f) + i12;
            TL_iv.RichText richText2 = this.f38126n.caption;
            f70 f70Var3 = this.f38122a;
            f70Var3.getClass();
            c3 q10 = k4.q(f70Var3, this, null, richText2, size - AndroidUtilities.dp(f10), this.e, this.f38126n, this.f38123b);
            this.d = q10;
            if (q10 != null) {
                f70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f7);
                c3 c3Var2 = this.d;
                c3Var2.f36208s = this.f38125f;
                c3Var2.v = this.e;
            }
            if (i12 != 0) {
                f70Var.getClass();
                i12 += AndroidUtilities.dp(f7);
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!k4.l(this.f38122a, this.f38123b, motionEvent, this, this.f38124c, this.f38125f, this.h)) {
            if (!k4.l(this.f38122a, this.f38123b, motionEvent, this, this.d, this.f38125f, this.e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockPullquote pageblockpullquote) {
        this.f38126n = pageblockpullquote;
        requestLayout();
    }
}
