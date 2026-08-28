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
public final class e1 extends View implements org.telegram.ui.Cells.m9, h3 {
    public final a70 f37782a;
    public final j4 f37783b;
    public e3 f37784c;
    public e3 d;
    public int f37785e;
    public int f37786f;
    public int h;
    public TL_iv.pageBlockBlockquote f37787n;

    public e1(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.f37782a = a70Var;
        this.f37783b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.f37784c;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            arrayList.add(e3Var2);
        }
    }

    @Override
    public int getBoundLeft() {
        int i9;
        a70 a70Var = this.f37782a;
        a70Var.getClass();
        float f10 = 18;
        int dp = AndroidUtilities.dp(f10);
        e3 e3Var = this.f37784c;
        if (e3Var != null) {
            i9 = Math.min(Integer.MAX_VALUE, (e3Var.a() + e3Var.f37805s) - dp);
        } else {
            i9 = Integer.MAX_VALUE;
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            i9 = Math.min(i9, (e3Var2.a() + e3Var2.f37805s) - dp);
        }
        if (i9 == Integer.MAX_VALUE) {
            return -1;
        }
        a70Var.getClass();
        return i9 - AndroidUtilities.dp(f10);
    }

    @Override
    public int getBoundRight() {
        int i9;
        a70 a70Var = this.f37782a;
        a70Var.getClass();
        float f10 = 18;
        int dp = AndroidUtilities.dp(f10);
        e3 e3Var = this.f37784c;
        if (e3Var != null) {
            i9 = Math.max(Integer.MIN_VALUE, e3Var.b() + e3Var.f37805s + dp);
        } else {
            i9 = Integer.MIN_VALUE;
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            i9 = Math.max(i9, e3Var2.b() + e3Var2.f37805s + dp);
        }
        if (i9 == Integer.MIN_VALUE) {
            return -1;
        }
        a70Var.getClass();
        return AndroidUtilities.dp(f10) + i9;
    }

    @Override
    public int getLastLineBoundRight() {
        int c10;
        int dp;
        e3 e3Var = this.d;
        a70 a70Var = this.f37782a;
        if (e3Var != null) {
            c10 = e3Var.c() + e3Var.f37805s;
            a70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            e3 e3Var2 = this.f37784c;
            if (e3Var2 != null) {
                c10 = e3Var2.c() + e3Var2.f37805s;
                a70Var.getClass();
                dp = AndroidUtilities.dp(18);
            } else {
                return -1;
            }
        }
        return dp + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ll.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.f37784c;
        if (e3Var != null) {
            e3Var.attach(this);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            e3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.f37784c;
        if (e3Var != null) {
            e3Var.detach(this);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            e3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37787n == null) {
            return;
        }
        e3 e3Var = this.f37784c;
        a70 a70Var = this.f37782a;
        int i9 = 0;
        if (e3Var != null) {
            canvas.save();
            canvas.translate(this.f37786f, this.h);
            l4.v(a70Var, canvas, this, 0);
            this.f37784c.draw(canvas, this);
            canvas.restore();
            i9 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f37786f, this.f37785e);
            l4.v(a70Var, canvas, this, i9);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        j4 j4Var = this.f37783b;
        if (j4Var != null && j4Var.C) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(20.0f);
            canvas.drawRect(measuredWidth, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + measuredWidth, getMeasuredHeight() - AndroidUtilities.dp(6.0f), l4.f39999m1);
        } else {
            a70Var.getClass();
            a70Var.getClass();
            canvas.drawRect(AndroidUtilities.dp((this.f37787n.level * 14) + 18), AndroidUtilities.dp(6.0f), AndroidUtilities.dp((this.f37787n.level * 14) + 20), getMeasuredHeight() - AndroidUtilities.dp(6.0f), l4.f39999m1);
        }
        l4.u(canvas, a70Var, this.f37787n, getMeasuredHeight());
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
        e3 e3Var = this.f37784c;
        j4 j4Var = this.f37783b;
        a70 a70Var = this.f37782a;
        if (e3Var != null && (j11 = l4.j(a70Var, j4Var, e3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null && (j10 = l4.j(a70Var, j4Var, e3Var2)) != null) {
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
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i9);
        a70 a70Var = this.f37782a;
        a70Var.getClass();
        float f10 = 8;
        this.h = AndroidUtilities.dp(f10);
        if (this.f37787n != null) {
            a70Var.getClass();
            int dp = size - AndroidUtilities.dp(50);
            if (this.f37787n.level > 0) {
                dp -= AndroidUtilities.dp(i12 * 14);
            }
            int i13 = dp;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.f37787n;
            e3 q10 = l4.q(this.f37782a, this, null, pageblockblockquote.text, i13, this.h, pageblockblockquote, this.f37783b);
            this.f37784c = q10;
            if (q10 != null) {
                a70Var.getClass();
                i11 = this.f37784c.d.getHeight() + AndroidUtilities.dp(f10);
            } else {
                i11 = 0;
            }
            int i14 = this.f37787n.level;
            j4 j4Var = this.f37783b;
            if (i14 > 0) {
                if (j4Var != null && j4Var.C) {
                    this.f37786f = AndroidUtilities.dp((i14 * 14) + 14);
                } else {
                    int dp2 = AndroidUtilities.dp(i14 * 14);
                    a70Var.getClass();
                    this.f37786f = AndroidUtilities.dp(32) + dp2;
                }
            } else if (j4Var != null && j4Var.C) {
                this.f37786f = AndroidUtilities.dp(14.0f);
            } else {
                a70Var.getClass();
                this.f37786f = AndroidUtilities.dp(32);
            }
            a70Var.getClass();
            int dp3 = AndroidUtilities.dp(f10) + i11;
            this.f37785e = dp3;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = this.f37787n;
            e3 q11 = l4.q(this.f37782a, this, null, pageblockblockquote2.caption, i13, dp3, pageblockblockquote2, this.f37783b);
            this.d = q11;
            if (q11 != null) {
                a70Var.getClass();
                i11 += this.d.d.getHeight() + AndroidUtilities.dp(f10);
            }
            if (i11 != 0) {
                a70Var.getClass();
                i11 += AndroidUtilities.dp(f10);
            }
            e3 e3Var = this.f37784c;
            if (e3Var != null) {
                e3Var.f37805s = this.f37786f;
                e3Var.v = this.h;
            }
            e3 e3Var2 = this.d;
            if (e3Var2 != null) {
                e3Var2.f37805s = this.f37786f;
                e3Var2.v = this.f37785e;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.f37782a, this.f37783b, motionEvent, this, this.f37784c, this.f37786f, this.h)) {
            if (!l4.l(this.f37782a, this.f37783b, motionEvent, this, this.d, this.f37786f, this.f37785e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
        this.f37787n = pageblockblockquote;
        requestLayout();
    }
}
