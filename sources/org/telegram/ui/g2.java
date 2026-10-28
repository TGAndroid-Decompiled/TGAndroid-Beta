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
public final class g2 extends View implements org.telegram.ui.Cells.r9, e3 {
    public final j70 f39475a;
    public final h4 f39476b;
    public a3 f39477c;
    public a3 d;
    public int e;
    public int f39478f;
    public int h;
    public TL_iv.pageBlockPullquote f39479n;

    public g2(Context context, j70 j70Var, h4 h4Var) {
        super(context);
        this.f39475a = j70Var;
        this.f39476b = h4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f39477c;
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
        a3 a3Var = this.f39477c;
        if (a3Var != null) {
            i10 = Math.min(Integer.MAX_VALUE, a3Var.a() + a3Var.f37666s);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            i10 = Math.min(i10, a3Var2.a() + a3Var2.f37666s);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        this.f39475a.getClass();
        return i10 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        int i10;
        a3 a3Var = this.f39477c;
        if (a3Var != null) {
            i10 = Math.max(Integer.MIN_VALUE, a3Var.b() + a3Var.f37666s);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            i10 = Math.max(i10, a3Var2.b() + a3Var2.f37666s);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        this.f39475a.getClass();
        return AndroidUtilities.dp(18) + i10;
    }

    @Override
    public int getLastLineBoundRight() {
        int c10;
        int dp;
        a3 a3Var = this.d;
        j70 j70Var = this.f39475a;
        if (a3Var != null) {
            c10 = a3Var.c() + a3Var.f37666s;
            j70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            a3 a3Var2 = this.f39477c;
            if (a3Var2 != null) {
                c10 = a3Var2.c() + a3Var2.f37666s;
                j70Var.getClass();
                dp = AndroidUtilities.dp(18);
            } else {
                return -1;
            }
        }
        return dp + c10;
    }

    public int getMinWidth() {
        return d3.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f39477c;
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
        a3 a3Var = this.f39477c;
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
        if (this.f39479n != null) {
            a3 a3Var = this.f39477c;
            j70 j70Var = this.f39475a;
            int i10 = 0;
            if (a3Var != null) {
                canvas.save();
                canvas.translate(this.f39478f, this.h);
                j4.v(j70Var, canvas, this, 0);
                this.f39477c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f39478f, this.e);
                j4.v(j70Var, canvas, this, i10);
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
        a3 a3Var = this.f39477c;
        h4 h4Var = this.f39476b;
        j70 j70Var = this.f39475a;
        if (a3Var != null && (j11 = j4.j(j70Var, h4Var, a3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null && (j10 = j4.j(j70Var, h4Var, a3Var2)) != null) {
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
        j70 j70Var = this.f39475a;
        j70Var.getClass();
        this.f39478f = AndroidUtilities.dp(18);
        j70Var.getClass();
        float f7 = 8;
        this.h = AndroidUtilities.dp(f7);
        TL_iv.pageBlockPullquote pageblockpullquote = this.f39479n;
        if (pageblockpullquote != null) {
            TL_iv.RichText richText = pageblockpullquote.text;
            j70 j70Var2 = this.f39475a;
            j70Var2.getClass();
            float f10 = 36;
            a3 q5 = j4.q(j70Var2, this, null, richText, size - AndroidUtilities.dp(f10), this.h, this.f39479n, this.f39476b);
            this.f39477c = q5;
            if (q5 != null) {
                j70Var.getClass();
                i13 = this.f39477c.d.getHeight() + AndroidUtilities.dp(f7);
                a3 a3Var = this.f39477c;
                a3Var.f37666s = this.f39478f;
                a3Var.v = this.h;
            } else {
                i13 = 0;
            }
            i12 = i13;
            this.e = AndroidUtilities.dp(2.0f) + i12;
            TL_iv.RichText richText2 = this.f39479n.caption;
            j70 j70Var3 = this.f39475a;
            j70Var3.getClass();
            a3 q9 = j4.q(j70Var3, this, null, richText2, size - AndroidUtilities.dp(f10), this.e, this.f39479n, this.f39476b);
            this.d = q9;
            if (q9 != null) {
                j70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f7);
                a3 a3Var2 = this.d;
                a3Var2.f37666s = this.f39478f;
                a3Var2.v = this.e;
            }
            if (i12 != 0) {
                j70Var.getClass();
                i12 += AndroidUtilities.dp(f7);
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!j4.l(this.f39475a, this.f39476b, motionEvent, this, this.f39477c, this.f39478f, this.h)) {
            if (!j4.l(this.f39475a, this.f39476b, motionEvent, this, this.d, this.f39478f, this.e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockPullquote pageblockpullquote) {
        this.f39479n = pageblockpullquote;
        requestLayout();
    }
}
