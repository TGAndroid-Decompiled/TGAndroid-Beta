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

public final class l2 extends View implements org.telegram.ui.Cells.i9, i3 {

    public final d70 f39915a;

    public final k4 f39916b;

    public f3 f39917c;
    public f3 d;

    public int f39918e;

    public int f39919f;
    public int h;

    public TL_iv.pageBlockPullquote f39920n;

    public l2(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f39915a = d70Var;
        this.f39916b = k4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f39917c;
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
        f3 f3Var = this.f39917c;
        if (f3Var != null) {
            iMin = Math.min(Integer.MAX_VALUE, f3Var.a() + f3Var.f37923s);
        } else {
            iMin = Integer.MAX_VALUE;
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            iMin = Math.min(iMin, f3Var2.a() + f3Var2.f37923s);
        }
        if (iMin == Integer.MAX_VALUE) {
            return -1;
        }
        this.f39915a.getClass();
        return iMin - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        int iMax;
        f3 f3Var = this.f39917c;
        if (f3Var != null) {
            iMax = Math.max(Integer.MIN_VALUE, f3Var.b() + f3Var.f37923s);
        } else {
            iMax = Integer.MIN_VALUE;
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            iMax = Math.max(iMax, f3Var2.b() + f3Var2.f37923s);
        }
        if (iMax == Integer.MIN_VALUE) {
            return -1;
        }
        this.f39915a.getClass();
        return AndroidUtilities.dp(18) + iMax;
    }

    @Override
    public int getLastLineBoundRight() {
        int iC;
        int iDp;
        f3 f3Var = this.d;
        d70 d70Var = this.f39915a;
        if (f3Var != null) {
            iC = f3Var.c() + f3Var.f37923s;
            d70Var.getClass();
            iDp = AndroidUtilities.dp(18);
        } else {
            f3 f3Var2 = this.f39917c;
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
        f3 f3Var = this.f39917c;
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
        f3 f3Var = this.f39917c;
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
        if (this.f39920n == null) {
            return;
        }
        f3 f3Var = this.f39917c;
        d70 d70Var = this.f39915a;
        int i10 = 0;
        if (f3Var != null) {
            canvas.save();
            canvas.translate(this.f39919f, this.h);
            m4.v(d70Var, canvas, this, 0);
            this.f39917c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f39919f, this.f39918e);
            m4.v(d70Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
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
        f3 f3Var = this.f39917c;
        k4 k4Var = this.f39916b;
        d70 d70Var = this.f39915a;
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
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) LocaleController.getString(R.string.AccDescrIVPullquote));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iDp;
        int size = View.MeasureSpec.getSize(i10);
        d70 d70Var = this.f39915a;
        d70Var.getClass();
        this.f39919f = AndroidUtilities.dp(18);
        d70Var.getClass();
        float f10 = 8;
        this.h = AndroidUtilities.dp(f10);
        TL_iv.pageBlockPullquote pageblockpullquote = this.f39920n;
        if (pageblockpullquote != null) {
            TL_iv.RichText richText = pageblockpullquote.text;
            d70 d70Var2 = this.f39915a;
            d70Var2.getClass();
            float f11 = 36;
            f3 f3VarQ = m4.q(d70Var2, this, null, richText, size - AndroidUtilities.dp(f11), this.h, this.f39920n, this.f39916b);
            this.f39917c = f3VarQ;
            if (f3VarQ != null) {
                d70Var.getClass();
                int height = this.f39917c.d.getHeight() + AndroidUtilities.dp(f10);
                f3 f3Var = this.f39917c;
                f3Var.f37923s = this.f39919f;
                f3Var.v = this.h;
                iDp = height;
            } else {
                iDp = 0;
            }
            this.f39918e = AndroidUtilities.dp(2.0f) + iDp;
            TL_iv.RichText richText2 = this.f39920n.caption;
            d70 d70Var3 = this.f39915a;
            d70Var3.getClass();
            f3 f3VarQ2 = m4.q(d70Var3, this, null, richText2, size - AndroidUtilities.dp(f11), this.f39918e, this.f39920n, this.f39916b);
            this.d = f3VarQ2;
            if (f3VarQ2 != null) {
                d70Var.getClass();
                iDp += this.d.d.getHeight() + AndroidUtilities.dp(f10);
                f3 f3Var2 = this.d;
                f3Var2.f37923s = this.f39919f;
                f3Var2.v = this.f39918e;
            }
            if (iDp != 0) {
                d70Var.getClass();
                iDp += AndroidUtilities.dp(f10);
            }
        } else {
            iDp = 1;
        }
        setMeasuredDimension(size, iDp);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (m4.l(this.f39915a, this.f39916b, motionEvent, this, this.f39917c, this.f39919f, this.h)) {
            return true;
        }
        return m4.l(this.f39915a, this.f39916b, motionEvent, this, this.d, this.f39919f, this.f39918e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockPullquote pageblockpullquote) {
        this.f39920n = pageblockpullquote;
        requestLayout();
    }
}
