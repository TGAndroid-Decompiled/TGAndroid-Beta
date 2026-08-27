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

public final class f1 extends View implements org.telegram.ui.Cells.i9, i3 {

    public final d70 f37897a;

    public final k4 f37898b;

    public f3 f37899c;
    public f3 d;

    public int f37900e;

    public int f37901f;
    public int h;

    public TL_iv.pageBlockBlockquote f37902n;

    public f1(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f37897a = d70Var;
        this.f37898b = k4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f37899c;
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
        int iMin;
        d70 d70Var = this.f37897a;
        d70Var.getClass();
        float f10 = 18;
        int iDp = AndroidUtilities.dp(f10);
        f3 f3Var = this.f37899c;
        if (f3Var != null) {
            iMin = Math.min(Integer.MAX_VALUE, (f3Var.a() + f3Var.f37923s) - iDp);
        } else {
            iMin = Integer.MAX_VALUE;
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            iMin = Math.min(iMin, (f3Var2.a() + f3Var2.f37923s) - iDp);
        }
        if (iMin == Integer.MAX_VALUE) {
            return -1;
        }
        d70Var.getClass();
        return iMin - AndroidUtilities.dp(f10);
    }

    @Override
    public int getBoundRight() {
        int iMax;
        d70 d70Var = this.f37897a;
        d70Var.getClass();
        float f10 = 18;
        int iDp = AndroidUtilities.dp(f10);
        f3 f3Var = this.f37899c;
        if (f3Var != null) {
            iMax = Math.max(Integer.MIN_VALUE, f3Var.b() + f3Var.f37923s + iDp);
        } else {
            iMax = Integer.MIN_VALUE;
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            iMax = Math.max(iMax, f3Var2.b() + f3Var2.f37923s + iDp);
        }
        if (iMax == Integer.MIN_VALUE) {
            return -1;
        }
        d70Var.getClass();
        return AndroidUtilities.dp(f10) + iMax;
    }

    @Override
    public int getLastLineBoundRight() {
        int iC;
        int iDp;
        f3 f3Var = this.d;
        d70 d70Var = this.f37897a;
        if (f3Var != null) {
            iC = f3Var.c() + f3Var.f37923s;
            d70Var.getClass();
            iDp = AndroidUtilities.dp(18);
        } else {
            f3 f3Var2 = this.f37899c;
            if (f3Var2 == null) {
                return -1;
            }
            iC = f3Var2.c() + f3Var2.f37923s;
            d70Var.getClass();
            iDp = AndroidUtilities.dp(18);
        }
        return iDp + iC;
    }

    public int getMinWidth() {
        return org.telegram.messenger.rl.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f37899c;
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
        f3 f3Var = this.f37899c;
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
        if (this.f37902n == null) {
            return;
        }
        f3 f3Var = this.f37899c;
        d70 d70Var = this.f37897a;
        int i10 = 0;
        if (f3Var != null) {
            canvas.save();
            canvas.translate(this.f37901f, this.h);
            m4.v(d70Var, canvas, this, 0);
            this.f37899c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f37901f, this.f37900e);
            m4.v(d70Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        k4 k4Var = this.f37898b;
        if (k4Var == null || !k4Var.C) {
            d70Var.getClass();
            float fDp = AndroidUtilities.dp((this.f37902n.level * 14) + 18);
            float fDp2 = AndroidUtilities.dp(6.0f);
            d70Var.getClass();
            canvas.drawRect(fDp, fDp2, AndroidUtilities.dp((this.f37902n.level * 14) + 20), getMeasuredHeight() - AndroidUtilities.dp(6.0f), m4.f40320m1);
        } else {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(20.0f);
            canvas.drawRect(measuredWidth, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + measuredWidth, getMeasuredHeight() - AndroidUtilities.dp(6.0f), m4.f40320m1);
        }
        m4.u(canvas, d70Var, this.f37902n, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequenceJ;
        CharSequence charSequenceJ2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        f3 f3Var = this.f37899c;
        k4 k4Var = this.f37898b;
        d70 d70Var = this.f37897a;
        if (f3Var != null && (charSequenceJ2 = m4.j(d70Var, k4Var, f3Var)) != null) {
            spannableStringBuilder.append(charSequenceJ2);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null && (charSequenceJ = m4.j(d70Var, k4Var, f3Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(charSequenceJ);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) LocaleController.getString(R.string.AccDescrIVBlockquote));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iDp;
        int size = View.MeasureSpec.getSize(i10);
        d70 d70Var = this.f37897a;
        d70Var.getClass();
        float f10 = 8;
        this.h = AndroidUtilities.dp(f10);
        if (this.f37902n != null) {
            d70Var.getClass();
            int iDp2 = size - AndroidUtilities.dp(50);
            int i12 = this.f37902n.level;
            if (i12 > 0) {
                iDp2 -= AndroidUtilities.dp(i12 * 14);
            }
            int i13 = iDp2;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.f37902n;
            f3 f3VarQ = m4.q(this.f37897a, this, null, pageblockblockquote.text, i13, this.h, pageblockblockquote, this.f37898b);
            this.f37899c = f3VarQ;
            if (f3VarQ != null) {
                d70Var.getClass();
                iDp = this.f37899c.d.getHeight() + AndroidUtilities.dp(f10);
            } else {
                iDp = 0;
            }
            int i14 = this.f37902n.level;
            k4 k4Var = this.f37898b;
            if (i14 > 0) {
                if (k4Var == null || !k4Var.C) {
                    int iDp3 = AndroidUtilities.dp(i14 * 14);
                    d70Var.getClass();
                    this.f37901f = AndroidUtilities.dp(32) + iDp3;
                } else {
                    this.f37901f = AndroidUtilities.dp((i14 * 14) + 14);
                }
            } else if (k4Var == null || !k4Var.C) {
                d70Var.getClass();
                this.f37901f = AndroidUtilities.dp(32);
            } else {
                this.f37901f = AndroidUtilities.dp(14.0f);
            }
            d70Var.getClass();
            int iDp4 = AndroidUtilities.dp(f10) + iDp;
            this.f37900e = iDp4;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = this.f37902n;
            f3 f3VarQ2 = m4.q(this.f37897a, this, null, pageblockblockquote2.caption, i13, iDp4, pageblockblockquote2, this.f37898b);
            this.d = f3VarQ2;
            if (f3VarQ2 != null) {
                d70Var.getClass();
                iDp += this.d.d.getHeight() + AndroidUtilities.dp(f10);
            }
            if (iDp != 0) {
                d70Var.getClass();
                iDp += AndroidUtilities.dp(f10);
            }
            f3 f3Var = this.f37899c;
            if (f3Var != null) {
                f3Var.f37923s = this.f37901f;
                f3Var.v = this.h;
            }
            f3 f3Var2 = this.d;
            if (f3Var2 != null) {
                f3Var2.f37923s = this.f37901f;
                f3Var2.v = this.f37900e;
            }
        } else {
            iDp = 1;
        }
        setMeasuredDimension(size, iDp);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (m4.l(this.f37897a, this.f37898b, motionEvent, this, this.f37899c, this.f37901f, this.h)) {
            return true;
        }
        return m4.l(this.f37897a, this.f37898b, motionEvent, this, this.d, this.f37901f, this.f37900e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
        this.f37902n = pageblockblockquote;
        requestLayout();
    }
}
