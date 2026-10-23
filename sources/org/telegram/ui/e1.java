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
public final class e1 extends View implements org.telegram.ui.Cells.m9, g3 {
    public final b70 f36490a;
    public final j4 f36491b;
    public d3 f36492c;
    public d3 d;
    public int e;
    public int f36493f;
    public int h;
    public TL_iv.pageBlockBlockquote f36494n;

    public e1(Context context, b70 b70Var, j4 j4Var) {
        super(context);
        this.f36490a = b70Var;
        this.f36491b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f36492c;
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
        b70 b70Var = this.f36490a;
        b70Var.getClass();
        float f7 = 18;
        int dp = AndroidUtilities.dp(f7);
        d3 d3Var = this.f36492c;
        if (d3Var != null) {
            i10 = Math.min(Integer.MAX_VALUE, (d3Var.a() + d3Var.f36246s) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            i10 = Math.min(i10, (d3Var2.a() + d3Var2.f36246s) - dp);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        b70Var.getClass();
        return i10 - AndroidUtilities.dp(f7);
    }

    @Override
    public int getBoundRight() {
        int i10;
        b70 b70Var = this.f36490a;
        b70Var.getClass();
        float f7 = 18;
        int dp = AndroidUtilities.dp(f7);
        d3 d3Var = this.f36492c;
        if (d3Var != null) {
            i10 = Math.max(Integer.MIN_VALUE, d3Var.b() + d3Var.f36246s + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            i10 = Math.max(i10, d3Var2.b() + d3Var2.f36246s + dp);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        b70Var.getClass();
        return AndroidUtilities.dp(f7) + i10;
    }

    @Override
    public int getLastLineBoundRight() {
        int c10;
        int dp;
        d3 d3Var = this.d;
        b70 b70Var = this.f36490a;
        if (d3Var != null) {
            c10 = d3Var.c() + d3Var.f36246s;
            b70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            d3 d3Var2 = this.f36492c;
            if (d3Var2 != null) {
                c10 = d3Var2.c() + d3Var2.f36246s;
                b70Var.getClass();
                dp = AndroidUtilities.dp(18);
            } else {
                return -1;
            }
        }
        return dp + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.nk.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f36492c;
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
        d3 d3Var = this.f36492c;
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
        if (this.f36494n == null) {
            return;
        }
        d3 d3Var = this.f36492c;
        b70 b70Var = this.f36490a;
        int i10 = 0;
        if (d3Var != null) {
            canvas.save();
            canvas.translate(this.f36493f, this.h);
            l4.v(b70Var, canvas, this, 0);
            this.f36492c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f36493f, this.e);
            l4.v(b70Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        j4 j4Var = this.f36491b;
        if (j4Var != null && j4Var.G) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(20.0f);
            canvas.drawRect(measuredWidth, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + measuredWidth, getMeasuredHeight() - AndroidUtilities.dp(6.0f), l4.f38753q1);
        } else {
            b70Var.getClass();
            b70Var.getClass();
            canvas.drawRect(AndroidUtilities.dp((this.f36494n.level * 14) + 18), AndroidUtilities.dp(6.0f), AndroidUtilities.dp((this.f36494n.level * 14) + 20), getMeasuredHeight() - AndroidUtilities.dp(6.0f), l4.f38753q1);
        }
        l4.u(canvas, b70Var, this.f36494n, getMeasuredHeight());
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
        d3 d3Var = this.f36492c;
        j4 j4Var = this.f36491b;
        b70 b70Var = this.f36490a;
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
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) LocaleController.getString(R.string.AccDescrIVBlockquote));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i10);
        b70 b70Var = this.f36490a;
        b70Var.getClass();
        float f7 = 8;
        this.h = AndroidUtilities.dp(f7);
        if (this.f36494n != null) {
            b70Var.getClass();
            int dp = size - AndroidUtilities.dp(50);
            if (this.f36494n.level > 0) {
                dp -= AndroidUtilities.dp(i13 * 14);
            }
            int i15 = dp;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.f36494n;
            d3 q6 = l4.q(this.f36490a, this, null, pageblockblockquote.text, i15, this.h, pageblockblockquote, this.f36491b);
            this.f36492c = q6;
            if (q6 != null) {
                b70Var.getClass();
                i14 = this.f36492c.d.getHeight() + AndroidUtilities.dp(f7);
            } else {
                i14 = 0;
            }
            i12 = i14;
            int i16 = this.f36494n.level;
            j4 j4Var = this.f36491b;
            if (i16 > 0) {
                if (j4Var != null && j4Var.G) {
                    this.f36493f = AndroidUtilities.dp((i16 * 14) + 14);
                } else {
                    int dp2 = AndroidUtilities.dp(i16 * 14);
                    b70Var.getClass();
                    this.f36493f = AndroidUtilities.dp(32) + dp2;
                }
            } else if (j4Var != null && j4Var.G) {
                this.f36493f = AndroidUtilities.dp(14.0f);
            } else {
                b70Var.getClass();
                this.f36493f = AndroidUtilities.dp(32);
            }
            b70Var.getClass();
            int dp3 = AndroidUtilities.dp(f7) + i12;
            this.e = dp3;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = this.f36494n;
            d3 q10 = l4.q(this.f36490a, this, null, pageblockblockquote2.caption, i15, dp3, pageblockblockquote2, this.f36491b);
            this.d = q10;
            if (q10 != null) {
                b70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f7);
            }
            if (i12 != 0) {
                b70Var.getClass();
                i12 += AndroidUtilities.dp(f7);
            }
            d3 d3Var = this.f36492c;
            if (d3Var != null) {
                d3Var.f36246s = this.f36493f;
                d3Var.v = this.h;
            }
            d3 d3Var2 = this.d;
            if (d3Var2 != null) {
                d3Var2.f36246s = this.f36493f;
                d3Var2.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.f36490a, this.f36491b, motionEvent, this, this.f36492c, this.f36493f, this.h)) {
            if (!l4.l(this.f36490a, this.f36491b, motionEvent, this, this.d, this.f36493f, this.e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
        this.f36494n = pageblockblockquote;
        requestLayout();
    }
}
