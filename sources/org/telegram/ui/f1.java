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
public final class f1 extends View implements org.telegram.ui.Cells.j9, i3 {
    public final d70 f37949a;
    public final k4 f37950b;
    public f3 f37951c;
    public f3 d;
    public int f37952e;
    public int f37953f;
    public int h;
    public TL_iv.pageBlockBlockquote f37954n;

    public f1(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f37949a = d70Var;
        this.f37950b = k4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f37951c;
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
        d70 d70Var = this.f37949a;
        d70Var.getClass();
        float f9 = 18;
        int dp = AndroidUtilities.dp(f9);
        f3 f3Var = this.f37951c;
        if (f3Var != null) {
            i10 = Math.min(Integer.MAX_VALUE, (f3Var.a() + f3Var.f37974s) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            i10 = Math.min(i10, (f3Var2.a() + f3Var2.f37974s) - dp);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        d70Var.getClass();
        return i10 - AndroidUtilities.dp(f9);
    }

    @Override
    public int getBoundRight() {
        int i10;
        d70 d70Var = this.f37949a;
        d70Var.getClass();
        float f9 = 18;
        int dp = AndroidUtilities.dp(f9);
        f3 f3Var = this.f37951c;
        if (f3Var != null) {
            i10 = Math.max(Integer.MIN_VALUE, f3Var.b() + f3Var.f37974s + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            i10 = Math.max(i10, f3Var2.b() + f3Var2.f37974s + dp);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        d70Var.getClass();
        return AndroidUtilities.dp(f9) + i10;
    }

    @Override
    public int getLastLineBoundRight() {
        int c3;
        int dp;
        f3 f3Var = this.d;
        d70 d70Var = this.f37949a;
        if (f3Var != null) {
            c3 = f3Var.c() + f3Var.f37974s;
            d70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            f3 f3Var2 = this.f37951c;
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
        f3 f3Var = this.f37951c;
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
        f3 f3Var = this.f37951c;
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
        if (this.f37954n == null) {
            return;
        }
        f3 f3Var = this.f37951c;
        d70 d70Var = this.f37949a;
        int i10 = 0;
        if (f3Var != null) {
            canvas.save();
            canvas.translate(this.f37953f, this.h);
            m4.v(d70Var, canvas, this, 0);
            this.f37951c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f37953f, this.f37952e);
            m4.v(d70Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        k4 k4Var = this.f37950b;
        if (k4Var != null && k4Var.C) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(20.0f);
            canvas.drawRect(measuredWidth, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + measuredWidth, getMeasuredHeight() - AndroidUtilities.dp(6.0f), m4.f40377m1);
        } else {
            d70Var.getClass();
            d70Var.getClass();
            canvas.drawRect(AndroidUtilities.dp((this.f37954n.level * 14) + 18), AndroidUtilities.dp(6.0f), AndroidUtilities.dp((this.f37954n.level * 14) + 20), getMeasuredHeight() - AndroidUtilities.dp(6.0f), m4.f40377m1);
        }
        m4.u(canvas, d70Var, this.f37954n, getMeasuredHeight());
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
        f3 f3Var = this.f37951c;
        k4 k4Var = this.f37950b;
        d70 d70Var = this.f37949a;
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
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) LocaleController.getString(R.string.AccDescrIVBlockquote));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        d70 d70Var = this.f37949a;
        d70Var.getClass();
        float f9 = 8;
        this.h = AndroidUtilities.dp(f9);
        if (this.f37954n != null) {
            d70Var.getClass();
            int dp = size - AndroidUtilities.dp(50);
            if (this.f37954n.level > 0) {
                dp -= AndroidUtilities.dp(i13 * 14);
            }
            int i14 = dp;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.f37954n;
            f3 q6 = m4.q(this.f37949a, this, null, pageblockblockquote.text, i14, this.h, pageblockblockquote, this.f37950b);
            this.f37951c = q6;
            if (q6 != null) {
                d70Var.getClass();
                i12 = this.f37951c.d.getHeight() + AndroidUtilities.dp(f9);
            } else {
                i12 = 0;
            }
            int i15 = this.f37954n.level;
            k4 k4Var = this.f37950b;
            if (i15 > 0) {
                if (k4Var != null && k4Var.C) {
                    this.f37953f = AndroidUtilities.dp((i15 * 14) + 14);
                } else {
                    int dp2 = AndroidUtilities.dp(i15 * 14);
                    d70Var.getClass();
                    this.f37953f = AndroidUtilities.dp(32) + dp2;
                }
            } else if (k4Var != null && k4Var.C) {
                this.f37953f = AndroidUtilities.dp(14.0f);
            } else {
                d70Var.getClass();
                this.f37953f = AndroidUtilities.dp(32);
            }
            d70Var.getClass();
            int dp3 = AndroidUtilities.dp(f9) + i12;
            this.f37952e = dp3;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = this.f37954n;
            f3 q9 = m4.q(this.f37949a, this, null, pageblockblockquote2.caption, i14, dp3, pageblockblockquote2, this.f37950b);
            this.d = q9;
            if (q9 != null) {
                d70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f9);
            }
            if (i12 != 0) {
                d70Var.getClass();
                i12 += AndroidUtilities.dp(f9);
            }
            f3 f3Var = this.f37951c;
            if (f3Var != null) {
                f3Var.f37974s = this.f37953f;
                f3Var.v = this.h;
            }
            f3 f3Var2 = this.d;
            if (f3Var2 != null) {
                f3Var2.f37974s = this.f37953f;
                f3Var2.v = this.f37952e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!m4.l(this.f37949a, this.f37950b, motionEvent, this, this.f37951c, this.f37953f, this.h)) {
            if (!m4.l(this.f37949a, this.f37950b, motionEvent, this, this.d, this.f37953f, this.f37952e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
        this.f37954n = pageblockblockquote;
        requestLayout();
    }
}
