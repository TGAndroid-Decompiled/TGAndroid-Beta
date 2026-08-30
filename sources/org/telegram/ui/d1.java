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
public final class d1 extends View implements org.telegram.ui.Cells.l9, g3 {
    public final n70 f33474a;
    public final j4 f33475b;
    public d3 f33476c;
    public d3 d;
    public int e;
    public int f33477f;
    public int h;
    public TL_iv.pageBlockBlockquote f33478n;

    public d1(Context context, n70 n70Var, j4 j4Var) {
        super(context);
        this.f33474a = n70Var;
        this.f33475b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f33476c;
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
        n70 n70Var = this.f33474a;
        n70Var.getClass();
        float f10 = 18;
        int dp = AndroidUtilities.dp(f10);
        d3 d3Var = this.f33476c;
        if (d3Var != null) {
            i10 = Math.min(Integer.MAX_VALUE, (d3Var.a() + d3Var.f33499s) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            i10 = Math.min(i10, (d3Var2.a() + d3Var2.f33499s) - dp);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        n70Var.getClass();
        return i10 - AndroidUtilities.dp(f10);
    }

    @Override
    public int getBoundRight() {
        int i10;
        n70 n70Var = this.f33474a;
        n70Var.getClass();
        float f10 = 18;
        int dp = AndroidUtilities.dp(f10);
        d3 d3Var = this.f33476c;
        if (d3Var != null) {
            i10 = Math.max(Integer.MIN_VALUE, d3Var.b() + d3Var.f33499s + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            i10 = Math.max(i10, d3Var2.b() + d3Var2.f33499s + dp);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        n70Var.getClass();
        return AndroidUtilities.dp(f10) + i10;
    }

    @Override
    public int getLastLineBoundRight() {
        int c3;
        int dp;
        d3 d3Var = this.d;
        n70 n70Var = this.f33474a;
        if (d3Var != null) {
            c3 = d3Var.c() + d3Var.f33499s;
            n70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            d3 d3Var2 = this.f33476c;
            if (d3Var2 != null) {
                c3 = d3Var2.c() + d3Var2.f33499s;
                n70Var.getClass();
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
        d3 d3Var = this.f33476c;
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
        d3 d3Var = this.f33476c;
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
        if (this.f33478n == null) {
            return;
        }
        d3 d3Var = this.f33476c;
        n70 n70Var = this.f33474a;
        int i10 = 0;
        if (d3Var != null) {
            canvas.save();
            canvas.translate(this.f33477f, this.h);
            l4.v(n70Var, canvas, this, 0);
            this.f33476c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f33477f, this.e);
            l4.v(n70Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        j4 j4Var = this.f33475b;
        if (j4Var != null && j4Var.D) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(20.0f);
            canvas.drawRect(measuredWidth, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + measuredWidth, getMeasuredHeight() - AndroidUtilities.dp(6.0f), l4.f35917n1);
        } else {
            n70Var.getClass();
            n70Var.getClass();
            canvas.drawRect(AndroidUtilities.dp((this.f33478n.level * 14) + 18), AndroidUtilities.dp(6.0f), AndroidUtilities.dp((this.f33478n.level * 14) + 20), getMeasuredHeight() - AndroidUtilities.dp(6.0f), l4.f35917n1);
        }
        l4.u(canvas, n70Var, this.f33478n, getMeasuredHeight());
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
        d3 d3Var = this.f33476c;
        j4 j4Var = this.f33475b;
        n70 n70Var = this.f33474a;
        if (d3Var != null && (j11 = l4.j(n70Var, j4Var, d3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null && (j10 = l4.j(n70Var, j4Var, d3Var2)) != null) {
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
        n70 n70Var = this.f33474a;
        n70Var.getClass();
        float f10 = 8;
        this.h = AndroidUtilities.dp(f10);
        if (this.f33478n != null) {
            n70Var.getClass();
            int dp = size - AndroidUtilities.dp(50);
            if (this.f33478n.level > 0) {
                dp -= AndroidUtilities.dp(i13 * 14);
            }
            int i14 = dp;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.f33478n;
            d3 q10 = l4.q(this.f33474a, this, null, pageblockblockquote.text, i14, this.h, pageblockblockquote, this.f33475b);
            this.f33476c = q10;
            if (q10 != null) {
                n70Var.getClass();
                i12 = this.f33476c.d.getHeight() + AndroidUtilities.dp(f10);
            } else {
                i12 = 0;
            }
            int i15 = this.f33478n.level;
            j4 j4Var = this.f33475b;
            if (i15 > 0) {
                if (j4Var != null && j4Var.D) {
                    this.f33477f = AndroidUtilities.dp((i15 * 14) + 14);
                } else {
                    int dp2 = AndroidUtilities.dp(i15 * 14);
                    n70Var.getClass();
                    this.f33477f = AndroidUtilities.dp(32) + dp2;
                }
            } else if (j4Var != null && j4Var.D) {
                this.f33477f = AndroidUtilities.dp(14.0f);
            } else {
                n70Var.getClass();
                this.f33477f = AndroidUtilities.dp(32);
            }
            n70Var.getClass();
            int dp3 = AndroidUtilities.dp(f10) + i12;
            this.e = dp3;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = this.f33478n;
            d3 q11 = l4.q(this.f33474a, this, null, pageblockblockquote2.caption, i14, dp3, pageblockblockquote2, this.f33475b);
            this.d = q11;
            if (q11 != null) {
                n70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f10);
            }
            if (i12 != 0) {
                n70Var.getClass();
                i12 += AndroidUtilities.dp(f10);
            }
            d3 d3Var = this.f33476c;
            if (d3Var != null) {
                d3Var.f33499s = this.f33477f;
                d3Var.v = this.h;
            }
            d3 d3Var2 = this.d;
            if (d3Var2 != null) {
                d3Var2.f33499s = this.f33477f;
                d3Var2.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.f33474a, this.f33475b, motionEvent, this, this.f33476c, this.f33477f, this.h)) {
            if (!l4.l(this.f33474a, this.f33475b, motionEvent, this, this.d, this.f33477f, this.e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
        this.f33478n = pageblockblockquote;
        requestLayout();
    }
}
