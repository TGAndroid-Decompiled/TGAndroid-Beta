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
public final class i2 extends View implements org.telegram.ui.Cells.p9, f3 {
    public final s70 f34336a;
    public final h4 f34337b;
    public c3 f34338c;
    public c3 d;
    public int e;
    public int f34339f;
    public int h;
    public TL_iv.pageBlockPullquote f34340n;

    public i2(Context context, s70 s70Var, h4 h4Var) {
        super(context);
        this.f34336a = s70Var;
        this.f34337b = h4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f34338c;
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
        c3 c3Var = this.f34338c;
        if (c3Var != null) {
            i10 = Math.min(Integer.MAX_VALUE, c3Var.a() + c3Var.f32507s);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            i10 = Math.min(i10, c3Var2.a() + c3Var2.f32507s);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        this.f34336a.getClass();
        return i10 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        int i10;
        c3 c3Var = this.f34338c;
        if (c3Var != null) {
            i10 = Math.max(Integer.MIN_VALUE, c3Var.b() + c3Var.f32507s);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            i10 = Math.max(i10, c3Var2.b() + c3Var2.f32507s);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        this.f34336a.getClass();
        return AndroidUtilities.dp(18) + i10;
    }

    @Override
    public int getLastLineBoundRight() {
        int c10;
        int dp;
        c3 c3Var = this.d;
        s70 s70Var = this.f34336a;
        if (c3Var != null) {
            c10 = c3Var.c() + c3Var.f32507s;
            s70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            c3 c3Var2 = this.f34338c;
            if (c3Var2 != null) {
                c10 = c3Var2.c() + c3Var2.f32507s;
                s70Var.getClass();
                dp = AndroidUtilities.dp(18);
            } else {
                return -1;
            }
        }
        return dp + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.qk.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f34338c;
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
        c3 c3Var = this.f34338c;
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
        if (this.f34340n != null) {
            c3 c3Var = this.f34338c;
            s70 s70Var = this.f34336a;
            int i10 = 0;
            if (c3Var != null) {
                canvas.save();
                canvas.translate(this.f34339f, this.h);
                j4.v(s70Var, canvas, this, 0);
                this.f34338c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f34339f, this.e);
                j4.v(s70Var, canvas, this, i10);
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
        c3 c3Var = this.f34338c;
        h4 h4Var = this.f34337b;
        s70 s70Var = this.f34336a;
        if (c3Var != null && (j10 = j4.j(s70Var, h4Var, c3Var)) != null) {
            spannableStringBuilder.append(j10);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null && (j3 = j4.j(s70Var, h4Var, c3Var2)) != null) {
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
        s70 s70Var = this.f34336a;
        s70Var.getClass();
        this.f34339f = AndroidUtilities.dp(18);
        s70Var.getClass();
        float f7 = 8;
        this.h = AndroidUtilities.dp(f7);
        TL_iv.pageBlockPullquote pageblockpullquote = this.f34340n;
        if (pageblockpullquote != null) {
            TL_iv.RichText richText = pageblockpullquote.text;
            s70 s70Var2 = this.f34336a;
            s70Var2.getClass();
            float f10 = 36;
            c3 q6 = j4.q(s70Var2, this, null, richText, size - AndroidUtilities.dp(f10), this.h, this.f34340n, this.f34337b);
            this.f34338c = q6;
            if (q6 != null) {
                s70Var.getClass();
                int height = this.f34338c.d.getHeight() + AndroidUtilities.dp(f7);
                c3 c3Var = this.f34338c;
                c3Var.f32507s = this.f34339f;
                c3Var.v = this.h;
                i12 = height;
            } else {
                i12 = 0;
            }
            this.e = AndroidUtilities.dp(2.0f) + i12;
            TL_iv.RichText richText2 = this.f34340n.caption;
            s70 s70Var3 = this.f34336a;
            s70Var3.getClass();
            c3 q10 = j4.q(s70Var3, this, null, richText2, size - AndroidUtilities.dp(f10), this.e, this.f34340n, this.f34337b);
            this.d = q10;
            if (q10 != null) {
                s70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f7);
                c3 c3Var2 = this.d;
                c3Var2.f32507s = this.f34339f;
                c3Var2.v = this.e;
            }
            if (i12 != 0) {
                s70Var.getClass();
                i12 += AndroidUtilities.dp(f7);
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!j4.l(this.f34336a, this.f34337b, motionEvent, this, this.f34338c, this.f34339f, this.h)) {
            if (!j4.l(this.f34336a, this.f34337b, motionEvent, this, this.d, this.f34339f, this.e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockPullquote pageblockpullquote) {
        this.f34340n = pageblockpullquote;
        requestLayout();
    }
}
