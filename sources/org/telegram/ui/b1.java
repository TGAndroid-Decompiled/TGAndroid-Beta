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
    public final j70 f37857a;
    public final h4 f37858b;
    public a3 f37859c;
    public a3 d;
    public int e;
    public int f37860f;
    public int h;
    public TL_iv.pageBlockBlockquote f37861n;

    public b1(Context context, j70 j70Var, h4 h4Var) {
        super(context);
        this.f37857a = j70Var;
        this.f37858b = h4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f37859c;
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
        j70 j70Var = this.f37857a;
        j70Var.getClass();
        float f7 = 18;
        int dp = AndroidUtilities.dp(f7);
        a3 a3Var = this.f37859c;
        if (a3Var != null) {
            i10 = Math.min(Integer.MAX_VALUE, (a3Var.a() + a3Var.f37666s) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            i10 = Math.min(i10, (a3Var2.a() + a3Var2.f37666s) - dp);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        j70Var.getClass();
        return i10 - AndroidUtilities.dp(f7);
    }

    @Override
    public int getBoundRight() {
        int i10;
        j70 j70Var = this.f37857a;
        j70Var.getClass();
        float f7 = 18;
        int dp = AndroidUtilities.dp(f7);
        a3 a3Var = this.f37859c;
        if (a3Var != null) {
            i10 = Math.max(Integer.MIN_VALUE, a3Var.b() + a3Var.f37666s + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            i10 = Math.max(i10, a3Var2.b() + a3Var2.f37666s + dp);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        j70Var.getClass();
        return AndroidUtilities.dp(f7) + i10;
    }

    @Override
    public int getLastLineBoundRight() {
        int c10;
        int dp;
        a3 a3Var = this.d;
        j70 j70Var = this.f37857a;
        if (a3Var != null) {
            c10 = a3Var.c() + a3Var.f37666s;
            j70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            a3 a3Var2 = this.f37859c;
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
        a3 a3Var = this.f37859c;
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
        a3 a3Var = this.f37859c;
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
        if (this.f37861n == null) {
            return;
        }
        a3 a3Var = this.f37859c;
        j70 j70Var = this.f37857a;
        int i10 = 0;
        if (a3Var != null) {
            canvas.save();
            canvas.translate(this.f37860f, this.h);
            j4.v(j70Var, canvas, this, 0);
            this.f37859c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f37860f, this.e);
            j4.v(j70Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        h4 h4Var = this.f37858b;
        if (h4Var != null && h4Var.G) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(20.0f);
            canvas.drawRect(measuredWidth, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + measuredWidth, getMeasuredHeight() - AndroidUtilities.dp(6.0f), j4.f40384r1);
        } else {
            j70Var.getClass();
            j70Var.getClass();
            canvas.drawRect(AndroidUtilities.dp((this.f37861n.level * 14) + 18), AndroidUtilities.dp(6.0f), AndroidUtilities.dp((this.f37861n.level * 14) + 20), getMeasuredHeight() - AndroidUtilities.dp(6.0f), j4.f40384r1);
        }
        j4.u(canvas, j70Var, this.f37861n, getMeasuredHeight());
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
        a3 a3Var = this.f37859c;
        h4 h4Var = this.f37858b;
        j70 j70Var = this.f37857a;
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
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) LocaleController.getString(R.string.AccDescrIVBlockquote));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i10);
        j70 j70Var = this.f37857a;
        j70Var.getClass();
        float f7 = 8;
        this.h = AndroidUtilities.dp(f7);
        if (this.f37861n != null) {
            j70Var.getClass();
            int dp = size - AndroidUtilities.dp(50);
            if (this.f37861n.level > 0) {
                dp -= AndroidUtilities.dp(i13 * 14);
            }
            int i15 = dp;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.f37861n;
            a3 q5 = j4.q(this.f37857a, this, null, pageblockblockquote.text, i15, this.h, pageblockblockquote, this.f37858b);
            this.f37859c = q5;
            if (q5 != null) {
                j70Var.getClass();
                i14 = this.f37859c.d.getHeight() + AndroidUtilities.dp(f7);
            } else {
                i14 = 0;
            }
            i12 = i14;
            int i16 = this.f37861n.level;
            h4 h4Var = this.f37858b;
            if (i16 > 0) {
                if (h4Var != null && h4Var.G) {
                    this.f37860f = AndroidUtilities.dp((i16 * 14) + 14);
                } else {
                    int dp2 = AndroidUtilities.dp(i16 * 14);
                    j70Var.getClass();
                    this.f37860f = AndroidUtilities.dp(32) + dp2;
                }
            } else if (h4Var != null && h4Var.G) {
                this.f37860f = AndroidUtilities.dp(14.0f);
            } else {
                j70Var.getClass();
                this.f37860f = AndroidUtilities.dp(32);
            }
            j70Var.getClass();
            int dp3 = AndroidUtilities.dp(f7) + i12;
            this.e = dp3;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = this.f37861n;
            a3 q9 = j4.q(this.f37857a, this, null, pageblockblockquote2.caption, i15, dp3, pageblockblockquote2, this.f37858b);
            this.d = q9;
            if (q9 != null) {
                j70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f7);
            }
            if (i12 != 0) {
                j70Var.getClass();
                i12 += AndroidUtilities.dp(f7);
            }
            a3 a3Var = this.f37859c;
            if (a3Var != null) {
                a3Var.f37666s = this.f37860f;
                a3Var.v = this.h;
            }
            a3 a3Var2 = this.d;
            if (a3Var2 != null) {
                a3Var2.f37666s = this.f37860f;
                a3Var2.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!j4.l(this.f37857a, this.f37858b, motionEvent, this, this.f37859c, this.f37860f, this.h)) {
            if (!j4.l(this.f37857a, this.f37858b, motionEvent, this, this.d, this.f37860f, this.e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
        this.f37861n = pageblockblockquote;
        requestLayout();
    }
}
