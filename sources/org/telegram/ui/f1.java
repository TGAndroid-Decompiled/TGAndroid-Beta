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
public final class f1 extends View implements org.telegram.ui.Cells.k9, i3 {
    public final p70 f33902a;
    public final l4 f33903b;
    public f3 f33904c;
    public f3 d;
    public int e;
    public int f33905f;
    public int h;
    public TL_iv.pageBlockBlockquote f33906n;

    public f1(Context context, p70 p70Var, l4 l4Var) {
        super(context);
        this.f33902a = p70Var;
        this.f33903b = l4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f33904c;
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
        p70 p70Var = this.f33902a;
        p70Var.getClass();
        float f10 = 18;
        int dp = AndroidUtilities.dp(f10);
        f3 f3Var = this.f33904c;
        if (f3Var != null) {
            i10 = Math.min(Integer.MAX_VALUE, (f3Var.a() + f3Var.f33933s) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            i10 = Math.min(i10, (f3Var2.a() + f3Var2.f33933s) - dp);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        p70Var.getClass();
        return i10 - AndroidUtilities.dp(f10);
    }

    @Override
    public int getBoundRight() {
        int i10;
        p70 p70Var = this.f33902a;
        p70Var.getClass();
        float f10 = 18;
        int dp = AndroidUtilities.dp(f10);
        f3 f3Var = this.f33904c;
        if (f3Var != null) {
            i10 = Math.max(Integer.MIN_VALUE, f3Var.b() + f3Var.f33933s + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            i10 = Math.max(i10, f3Var2.b() + f3Var2.f33933s + dp);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        p70Var.getClass();
        return AndroidUtilities.dp(f10) + i10;
    }

    @Override
    public int getLastLineBoundRight() {
        int c3;
        int dp;
        f3 f3Var = this.d;
        p70 p70Var = this.f33902a;
        if (f3Var != null) {
            c3 = f3Var.c() + f3Var.f33933s;
            p70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            f3 f3Var2 = this.f33904c;
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
        f3 f3Var = this.f33904c;
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
        f3 f3Var = this.f33904c;
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
        if (this.f33906n == null) {
            return;
        }
        f3 f3Var = this.f33904c;
        p70 p70Var = this.f33902a;
        int i10 = 0;
        if (f3Var != null) {
            canvas.save();
            canvas.translate(this.f33905f, this.h);
            n4.v(p70Var, canvas, this, 0);
            this.f33904c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f33905f, this.e);
            n4.v(p70Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        l4 l4Var = this.f33903b;
        if (l4Var != null && l4Var.D) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(20.0f);
            canvas.drawRect(measuredWidth, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + measuredWidth, getMeasuredHeight() - AndroidUtilities.dp(6.0f), n4.f36347n1);
        } else {
            p70Var.getClass();
            p70Var.getClass();
            canvas.drawRect(AndroidUtilities.dp((this.f33906n.level * 14) + 18), AndroidUtilities.dp(6.0f), AndroidUtilities.dp((this.f33906n.level * 14) + 20), getMeasuredHeight() - AndroidUtilities.dp(6.0f), n4.f36347n1);
        }
        n4.u(canvas, p70Var, this.f33906n, getMeasuredHeight());
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
        f3 f3Var = this.f33904c;
        l4 l4Var = this.f33903b;
        p70 p70Var = this.f33902a;
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
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) LocaleController.getString(R.string.AccDescrIVBlockquote));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        p70 p70Var = this.f33902a;
        p70Var.getClass();
        float f10 = 8;
        this.h = AndroidUtilities.dp(f10);
        if (this.f33906n != null) {
            p70Var.getClass();
            int dp = size - AndroidUtilities.dp(50);
            if (this.f33906n.level > 0) {
                dp -= AndroidUtilities.dp(i13 * 14);
            }
            int i14 = dp;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.f33906n;
            f3 q10 = n4.q(this.f33902a, this, null, pageblockblockquote.text, i14, this.h, pageblockblockquote, this.f33903b);
            this.f33904c = q10;
            if (q10 != null) {
                p70Var.getClass();
                i12 = this.f33904c.d.getHeight() + AndroidUtilities.dp(f10);
            } else {
                i12 = 0;
            }
            int i15 = this.f33906n.level;
            l4 l4Var = this.f33903b;
            if (i15 > 0) {
                if (l4Var != null && l4Var.D) {
                    this.f33905f = AndroidUtilities.dp((i15 * 14) + 14);
                } else {
                    int dp2 = AndroidUtilities.dp(i15 * 14);
                    p70Var.getClass();
                    this.f33905f = AndroidUtilities.dp(32) + dp2;
                }
            } else if (l4Var != null && l4Var.D) {
                this.f33905f = AndroidUtilities.dp(14.0f);
            } else {
                p70Var.getClass();
                this.f33905f = AndroidUtilities.dp(32);
            }
            p70Var.getClass();
            int dp3 = AndroidUtilities.dp(f10) + i12;
            this.e = dp3;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = this.f33906n;
            f3 q11 = n4.q(this.f33902a, this, null, pageblockblockquote2.caption, i14, dp3, pageblockblockquote2, this.f33903b);
            this.d = q11;
            if (q11 != null) {
                p70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f10);
            }
            if (i12 != 0) {
                p70Var.getClass();
                i12 += AndroidUtilities.dp(f10);
            }
            f3 f3Var = this.f33904c;
            if (f3Var != null) {
                f3Var.f33933s = this.f33905f;
                f3Var.v = this.h;
            }
            f3 f3Var2 = this.d;
            if (f3Var2 != null) {
                f3Var2.f33933s = this.f33905f;
                f3Var2.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!n4.l(this.f33902a, this.f33903b, motionEvent, this, this.f33904c, this.f33905f, this.h)) {
            if (!n4.l(this.f33902a, this.f33903b, motionEvent, this, this.d, this.f33905f, this.e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
        this.f33906n = pageblockblockquote;
        requestLayout();
    }
}
