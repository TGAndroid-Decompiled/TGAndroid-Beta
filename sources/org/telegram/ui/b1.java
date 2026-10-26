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
public final class b1 extends View implements org.telegram.ui.Cells.r9, e3 {
    public final h70 f37938a;
    public final h4 f37939b;
    public a3 f37940c;
    public a3 d;
    public int e;
    public int f37941f;
    public int h;
    public TL_iv.pageBlockBlockquote f37942n;

    public b1(Context context, h70 h70Var, h4 h4Var) {
        super(context);
        this.f37938a = h70Var;
        this.f37939b = h4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f37940c;
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
        h70 h70Var = this.f37938a;
        h70Var.getClass();
        float f7 = 18;
        int dp = AndroidUtilities.dp(f7);
        a3 a3Var = this.f37940c;
        if (a3Var != null) {
            i10 = Math.min(Integer.MAX_VALUE, (a3Var.a() + a3Var.f37634s) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            i10 = Math.min(i10, (a3Var2.a() + a3Var2.f37634s) - dp);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        h70Var.getClass();
        return i10 - AndroidUtilities.dp(f7);
    }

    @Override
    public int getBoundRight() {
        int i10;
        h70 h70Var = this.f37938a;
        h70Var.getClass();
        float f7 = 18;
        int dp = AndroidUtilities.dp(f7);
        a3 a3Var = this.f37940c;
        if (a3Var != null) {
            i10 = Math.max(Integer.MIN_VALUE, a3Var.b() + a3Var.f37634s + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            i10 = Math.max(i10, a3Var2.b() + a3Var2.f37634s + dp);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        h70Var.getClass();
        return AndroidUtilities.dp(f7) + i10;
    }

    @Override
    public int getLastLineBoundRight() {
        int c10;
        int dp;
        a3 a3Var = this.d;
        h70 h70Var = this.f37938a;
        if (a3Var != null) {
            c10 = a3Var.c() + a3Var.f37634s;
            h70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            a3 a3Var2 = this.f37940c;
            if (a3Var2 != null) {
                c10 = a3Var2.c() + a3Var2.f37634s;
                h70Var.getClass();
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
        a3 a3Var = this.f37940c;
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
        a3 a3Var = this.f37940c;
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
        if (this.f37942n == null) {
            return;
        }
        a3 a3Var = this.f37940c;
        h70 h70Var = this.f37938a;
        int i10 = 0;
        if (a3Var != null) {
            canvas.save();
            canvas.translate(this.f37941f, this.h);
            j4.v(h70Var, canvas, this, 0);
            this.f37940c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f37941f, this.e);
            j4.v(h70Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        h4 h4Var = this.f37939b;
        if (h4Var != null && h4Var.G) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(20.0f);
            canvas.drawRect(measuredWidth, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + measuredWidth, getMeasuredHeight() - AndroidUtilities.dp(6.0f), j4.f40419r1);
        } else {
            h70Var.getClass();
            h70Var.getClass();
            canvas.drawRect(AndroidUtilities.dp((this.f37942n.level * 14) + 18), AndroidUtilities.dp(6.0f), AndroidUtilities.dp((this.f37942n.level * 14) + 20), getMeasuredHeight() - AndroidUtilities.dp(6.0f), j4.f40419r1);
        }
        j4.u(canvas, h70Var, this.f37942n, getMeasuredHeight());
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
        a3 a3Var = this.f37940c;
        h4 h4Var = this.f37939b;
        h70 h70Var = this.f37938a;
        if (a3Var != null && (j11 = j4.j(h70Var, h4Var, a3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null && (j10 = j4.j(h70Var, h4Var, a3Var2)) != null) {
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
        h70 h70Var = this.f37938a;
        h70Var.getClass();
        float f7 = 8;
        this.h = AndroidUtilities.dp(f7);
        if (this.f37942n != null) {
            h70Var.getClass();
            int dp = size - AndroidUtilities.dp(50);
            if (this.f37942n.level > 0) {
                dp -= AndroidUtilities.dp(i13 * 14);
            }
            int i15 = dp;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.f37942n;
            a3 q5 = j4.q(this.f37938a, this, null, pageblockblockquote.text, i15, this.h, pageblockblockquote, this.f37939b);
            this.f37940c = q5;
            if (q5 != null) {
                h70Var.getClass();
                i14 = this.f37940c.d.getHeight() + AndroidUtilities.dp(f7);
            } else {
                i14 = 0;
            }
            i12 = i14;
            int i16 = this.f37942n.level;
            h4 h4Var = this.f37939b;
            if (i16 > 0) {
                if (h4Var != null && h4Var.G) {
                    this.f37941f = AndroidUtilities.dp((i16 * 14) + 14);
                } else {
                    int dp2 = AndroidUtilities.dp(i16 * 14);
                    h70Var.getClass();
                    this.f37941f = AndroidUtilities.dp(32) + dp2;
                }
            } else if (h4Var != null && h4Var.G) {
                this.f37941f = AndroidUtilities.dp(14.0f);
            } else {
                h70Var.getClass();
                this.f37941f = AndroidUtilities.dp(32);
            }
            h70Var.getClass();
            int dp3 = AndroidUtilities.dp(f7) + i12;
            this.e = dp3;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = this.f37942n;
            a3 q9 = j4.q(this.f37938a, this, null, pageblockblockquote2.caption, i15, dp3, pageblockblockquote2, this.f37939b);
            this.d = q9;
            if (q9 != null) {
                h70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f7);
            }
            if (i12 != 0) {
                h70Var.getClass();
                i12 += AndroidUtilities.dp(f7);
            }
            a3 a3Var = this.f37940c;
            if (a3Var != null) {
                a3Var.f37634s = this.f37941f;
                a3Var.v = this.h;
            }
            a3 a3Var2 = this.d;
            if (a3Var2 != null) {
                a3Var2.f37634s = this.f37941f;
                a3Var2.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!j4.l(this.f37938a, this.f37939b, motionEvent, this, this.f37940c, this.f37941f, this.h)) {
            if (!j4.l(this.f37938a, this.f37939b, motionEvent, this, this.d, this.f37941f, this.e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
        this.f37942n = pageblockblockquote;
        requestLayout();
    }
}
