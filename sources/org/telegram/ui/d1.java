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
public final class d1 extends View implements org.telegram.ui.Cells.r9, f3 {
    public final t70 f31801a;
    public final h4 f31802b;
    public c3 f31803c;
    public c3 d;
    public int e;
    public int f31804f;
    public int h;
    public TL_iv.pageBlockBlockquote f31805n;

    public d1(Context context, t70 t70Var, h4 h4Var) {
        super(context);
        this.f31801a = t70Var;
        this.f31802b = h4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f31803c;
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
        t70 t70Var = this.f31801a;
        t70Var.getClass();
        float f7 = 18;
        int dp = AndroidUtilities.dp(f7);
        c3 c3Var = this.f31803c;
        if (c3Var != null) {
            i10 = Math.min(Integer.MAX_VALUE, (c3Var.a() + c3Var.f31515s) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            i10 = Math.min(i10, (c3Var2.a() + c3Var2.f31515s) - dp);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        t70Var.getClass();
        return i10 - AndroidUtilities.dp(f7);
    }

    @Override
    public int getBoundRight() {
        int i10;
        t70 t70Var = this.f31801a;
        t70Var.getClass();
        float f7 = 18;
        int dp = AndroidUtilities.dp(f7);
        c3 c3Var = this.f31803c;
        if (c3Var != null) {
            i10 = Math.max(Integer.MIN_VALUE, c3Var.b() + c3Var.f31515s + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            i10 = Math.max(i10, c3Var2.b() + c3Var2.f31515s + dp);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        t70Var.getClass();
        return AndroidUtilities.dp(f7) + i10;
    }

    @Override
    public int getLastLineBoundRight() {
        int c10;
        int dp;
        c3 c3Var = this.d;
        t70 t70Var = this.f31801a;
        if (c3Var != null) {
            c10 = c3Var.c() + c3Var.f31515s;
            t70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            c3 c3Var2 = this.f31803c;
            if (c3Var2 != null) {
                c10 = c3Var2.c() + c3Var2.f31515s;
                t70Var.getClass();
                dp = AndroidUtilities.dp(18);
            } else {
                return -1;
            }
        }
        return dp + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.em.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f31803c;
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
        c3 c3Var = this.f31803c;
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
        if (this.f31805n == null) {
            return;
        }
        c3 c3Var = this.f31803c;
        t70 t70Var = this.f31801a;
        int i10 = 0;
        if (c3Var != null) {
            canvas.save();
            canvas.translate(this.f31804f, this.h);
            j4.v(t70Var, canvas, this, 0);
            this.f31803c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f31804f, this.e);
            j4.v(t70Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        h4 h4Var = this.f31802b;
        if (h4Var != null && h4Var.G) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(20.0f);
            canvas.drawRect(measuredWidth, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + measuredWidth, getMeasuredHeight() - AndroidUtilities.dp(6.0f), j4.f33890q1);
        } else {
            t70Var.getClass();
            t70Var.getClass();
            canvas.drawRect(AndroidUtilities.dp((this.f31805n.level * 14) + 18), AndroidUtilities.dp(6.0f), AndroidUtilities.dp((this.f31805n.level * 14) + 20), getMeasuredHeight() - AndroidUtilities.dp(6.0f), j4.f33890q1);
        }
        j4.u(canvas, t70Var, this.f31805n, getMeasuredHeight());
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
        c3 c3Var = this.f31803c;
        h4 h4Var = this.f31802b;
        t70 t70Var = this.f31801a;
        if (c3Var != null && (j10 = j4.j(t70Var, h4Var, c3Var)) != null) {
            spannableStringBuilder.append(j10);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null && (j3 = j4.j(t70Var, h4Var, c3Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(j3);
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
        t70 t70Var = this.f31801a;
        t70Var.getClass();
        float f7 = 8;
        this.h = AndroidUtilities.dp(f7);
        if (this.f31805n != null) {
            t70Var.getClass();
            int dp = size - AndroidUtilities.dp(50);
            if (this.f31805n.level > 0) {
                dp -= AndroidUtilities.dp(i13 * 14);
            }
            int i14 = dp;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.f31805n;
            c3 q6 = j4.q(this.f31801a, this, null, pageblockblockquote.text, i14, this.h, pageblockblockquote, this.f31802b);
            this.f31803c = q6;
            if (q6 != null) {
                t70Var.getClass();
                i12 = this.f31803c.d.getHeight() + AndroidUtilities.dp(f7);
            } else {
                i12 = 0;
            }
            int i15 = this.f31805n.level;
            h4 h4Var = this.f31802b;
            if (i15 > 0) {
                if (h4Var != null && h4Var.G) {
                    this.f31804f = AndroidUtilities.dp((i15 * 14) + 14);
                } else {
                    int dp2 = AndroidUtilities.dp(i15 * 14);
                    t70Var.getClass();
                    this.f31804f = AndroidUtilities.dp(32) + dp2;
                }
            } else if (h4Var != null && h4Var.G) {
                this.f31804f = AndroidUtilities.dp(14.0f);
            } else {
                t70Var.getClass();
                this.f31804f = AndroidUtilities.dp(32);
            }
            t70Var.getClass();
            int dp3 = AndroidUtilities.dp(f7) + i12;
            this.e = dp3;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = this.f31805n;
            c3 q10 = j4.q(this.f31801a, this, null, pageblockblockquote2.caption, i14, dp3, pageblockblockquote2, this.f31802b);
            this.d = q10;
            if (q10 != null) {
                t70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f7);
            }
            if (i12 != 0) {
                t70Var.getClass();
                i12 += AndroidUtilities.dp(f7);
            }
            c3 c3Var = this.f31803c;
            if (c3Var != null) {
                c3Var.f31515s = this.f31804f;
                c3Var.v = this.h;
            }
            c3 c3Var2 = this.d;
            if (c3Var2 != null) {
                c3Var2.f31515s = this.f31804f;
                c3Var2.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!j4.l(this.f31801a, this.f31802b, motionEvent, this, this.f31803c, this.f31804f, this.h)) {
            if (!j4.l(this.f31801a, this.f31802b, motionEvent, this, this.d, this.f31804f, this.e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
        this.f31805n = pageblockblockquote;
        requestLayout();
    }
}
