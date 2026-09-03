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
public final class l2 extends View implements org.telegram.ui.Cells.k9, i3 {
    public final p70 f35628a;
    public final l4 f35629b;
    public f3 f35630c;
    public f3 d;
    public int e;
    public int f35631f;
    public int h;
    public TL_iv.pageBlockPullquote f35632n;

    public l2(Context context, p70 p70Var, l4 l4Var) {
        super(context);
        this.f35628a = p70Var;
        this.f35629b = l4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f35630c;
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
        f3 f3Var = this.f35630c;
        if (f3Var != null) {
            i10 = Math.min(Integer.MAX_VALUE, f3Var.a() + f3Var.f33933s);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            i10 = Math.min(i10, f3Var2.a() + f3Var2.f33933s);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        this.f35628a.getClass();
        return i10 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        int i10;
        f3 f3Var = this.f35630c;
        if (f3Var != null) {
            i10 = Math.max(Integer.MIN_VALUE, f3Var.b() + f3Var.f33933s);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            i10 = Math.max(i10, f3Var2.b() + f3Var2.f33933s);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        this.f35628a.getClass();
        return AndroidUtilities.dp(18) + i10;
    }

    @Override
    public int getLastLineBoundRight() {
        int c3;
        int dp;
        f3 f3Var = this.d;
        p70 p70Var = this.f35628a;
        if (f3Var != null) {
            c3 = f3Var.c() + f3Var.f33933s;
            p70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            f3 f3Var2 = this.f35630c;
            if (f3Var2 != null) {
                c3 = f3Var2.c() + f3Var2.f33933s;
                p70Var.getClass();
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
        f3 f3Var = this.f35630c;
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
        f3 f3Var = this.f35630c;
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
        if (this.f35632n != null) {
            f3 f3Var = this.f35630c;
            p70 p70Var = this.f35628a;
            int i10 = 0;
            if (f3Var != null) {
                canvas.save();
                canvas.translate(this.f35631f, this.h);
                n4.v(p70Var, canvas, this, 0);
                this.f35630c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f35631f, this.e);
                n4.v(p70Var, canvas, this, i10);
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
        f3 f3Var = this.f35630c;
        l4 l4Var = this.f35629b;
        p70 p70Var = this.f35628a;
        if (f3Var != null && (j11 = n4.j(p70Var, l4Var, f3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null && (j10 = n4.j(p70Var, l4Var, f3Var2)) != null) {
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
        int size = View.MeasureSpec.getSize(i10);
        p70 p70Var = this.f35628a;
        p70Var.getClass();
        this.f35631f = AndroidUtilities.dp(18);
        p70Var.getClass();
        float f10 = 8;
        this.h = AndroidUtilities.dp(f10);
        TL_iv.pageBlockPullquote pageblockpullquote = this.f35632n;
        if (pageblockpullquote != null) {
            TL_iv.RichText richText = pageblockpullquote.text;
            p70 p70Var2 = this.f35628a;
            p70Var2.getClass();
            float f11 = 36;
            f3 q10 = n4.q(p70Var2, this, null, richText, size - AndroidUtilities.dp(f11), this.h, this.f35632n, this.f35629b);
            this.f35630c = q10;
            if (q10 != null) {
                p70Var.getClass();
                int height = this.f35630c.d.getHeight() + AndroidUtilities.dp(f10);
                f3 f3Var = this.f35630c;
                f3Var.f33933s = this.f35631f;
                f3Var.v = this.h;
                i12 = height;
            } else {
                i12 = 0;
            }
            this.e = AndroidUtilities.dp(2.0f) + i12;
            TL_iv.RichText richText2 = this.f35632n.caption;
            p70 p70Var3 = this.f35628a;
            p70Var3.getClass();
            f3 q11 = n4.q(p70Var3, this, null, richText2, size - AndroidUtilities.dp(f11), this.e, this.f35632n, this.f35629b);
            this.d = q11;
            if (q11 != null) {
                p70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f10);
                f3 f3Var2 = this.d;
                f3Var2.f33933s = this.f35631f;
                f3Var2.v = this.e;
            }
            if (i12 != 0) {
                p70Var.getClass();
                i12 += AndroidUtilities.dp(f10);
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!n4.l(this.f35628a, this.f35629b, motionEvent, this, this.f35630c, this.f35631f, this.h)) {
            if (!n4.l(this.f35628a, this.f35629b, motionEvent, this, this.d, this.f35631f, this.e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockPullquote pageblockpullquote) {
        this.f35632n = pageblockpullquote;
        requestLayout();
    }
}
