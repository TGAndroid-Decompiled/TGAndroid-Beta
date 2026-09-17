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
public final class b1 extends View implements org.telegram.ui.Cells.p9, d3 {
    public final w70 f32016a;
    public final f4 f32017b;
    public a3 f32018c;
    public a3 d;
    public int e;
    public int f32019f;
    public int h;
    public TL_iv.pageBlockBlockquote f32020n;

    public b1(Context context, w70 w70Var, f4 f4Var) {
        super(context);
        this.f32016a = w70Var;
        this.f32017b = f4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f32018c;
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
        w70 w70Var = this.f32016a;
        w70Var.getClass();
        float f7 = 18;
        int dp = AndroidUtilities.dp(f7);
        a3 a3Var = this.f32018c;
        if (a3Var != null) {
            i10 = Math.min(Integer.MAX_VALUE, (a3Var.a() + a3Var.f31694s) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            i10 = Math.min(i10, (a3Var2.a() + a3Var2.f31694s) - dp);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        w70Var.getClass();
        return i10 - AndroidUtilities.dp(f7);
    }

    @Override
    public int getBoundRight() {
        int i10;
        w70 w70Var = this.f32016a;
        w70Var.getClass();
        float f7 = 18;
        int dp = AndroidUtilities.dp(f7);
        a3 a3Var = this.f32018c;
        if (a3Var != null) {
            i10 = Math.max(Integer.MIN_VALUE, a3Var.b() + a3Var.f31694s + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            i10 = Math.max(i10, a3Var2.b() + a3Var2.f31694s + dp);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        w70Var.getClass();
        return AndroidUtilities.dp(f7) + i10;
    }

    @Override
    public int getLastLineBoundRight() {
        int c10;
        int dp;
        a3 a3Var = this.d;
        w70 w70Var = this.f32016a;
        if (a3Var != null) {
            c10 = a3Var.c() + a3Var.f31694s;
            w70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            a3 a3Var2 = this.f32018c;
            if (a3Var2 != null) {
                c10 = a3Var2.c() + a3Var2.f31694s;
                w70Var.getClass();
                dp = AndroidUtilities.dp(18);
            } else {
                return -1;
            }
        }
        return dp + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.wl.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f32018c;
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
        a3 a3Var = this.f32018c;
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
        if (this.f32020n == null) {
            return;
        }
        a3 a3Var = this.f32018c;
        w70 w70Var = this.f32016a;
        int i10 = 0;
        if (a3Var != null) {
            canvas.save();
            canvas.translate(this.f32019f, this.h);
            h4.v(w70Var, canvas, this, 0);
            this.f32018c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f32019f, this.e);
            h4.v(w70Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        f4 f4Var = this.f32017b;
        if (f4Var != null && f4Var.G) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(20.0f);
            canvas.drawRect(measuredWidth, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + measuredWidth, getMeasuredHeight() - AndroidUtilities.dp(6.0f), h4.f34138q1);
        } else {
            w70Var.getClass();
            w70Var.getClass();
            canvas.drawRect(AndroidUtilities.dp((this.f32020n.level * 14) + 18), AndroidUtilities.dp(6.0f), AndroidUtilities.dp((this.f32020n.level * 14) + 20), getMeasuredHeight() - AndroidUtilities.dp(6.0f), h4.f34138q1);
        }
        h4.u(canvas, w70Var, this.f32020n, getMeasuredHeight());
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
        a3 a3Var = this.f32018c;
        f4 f4Var = this.f32017b;
        w70 w70Var = this.f32016a;
        if (a3Var != null && (j10 = h4.j(w70Var, f4Var, a3Var)) != null) {
            spannableStringBuilder.append(j10);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null && (j3 = h4.j(w70Var, f4Var, a3Var2)) != null) {
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
        w70 w70Var = this.f32016a;
        w70Var.getClass();
        float f7 = 8;
        this.h = AndroidUtilities.dp(f7);
        if (this.f32020n != null) {
            w70Var.getClass();
            int dp = size - AndroidUtilities.dp(50);
            if (this.f32020n.level > 0) {
                dp -= AndroidUtilities.dp(i13 * 14);
            }
            int i14 = dp;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.f32020n;
            a3 q6 = h4.q(this.f32016a, this, null, pageblockblockquote.text, i14, this.h, pageblockblockquote, this.f32017b);
            this.f32018c = q6;
            if (q6 != null) {
                w70Var.getClass();
                i12 = this.f32018c.d.getHeight() + AndroidUtilities.dp(f7);
            } else {
                i12 = 0;
            }
            int i15 = this.f32020n.level;
            f4 f4Var = this.f32017b;
            if (i15 > 0) {
                if (f4Var != null && f4Var.G) {
                    this.f32019f = AndroidUtilities.dp((i15 * 14) + 14);
                } else {
                    int dp2 = AndroidUtilities.dp(i15 * 14);
                    w70Var.getClass();
                    this.f32019f = AndroidUtilities.dp(32) + dp2;
                }
            } else if (f4Var != null && f4Var.G) {
                this.f32019f = AndroidUtilities.dp(14.0f);
            } else {
                w70Var.getClass();
                this.f32019f = AndroidUtilities.dp(32);
            }
            w70Var.getClass();
            int dp3 = AndroidUtilities.dp(f7) + i12;
            this.e = dp3;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = this.f32020n;
            a3 q10 = h4.q(this.f32016a, this, null, pageblockblockquote2.caption, i14, dp3, pageblockblockquote2, this.f32017b);
            this.d = q10;
            if (q10 != null) {
                w70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f7);
            }
            if (i12 != 0) {
                w70Var.getClass();
                i12 += AndroidUtilities.dp(f7);
            }
            a3 a3Var = this.f32018c;
            if (a3Var != null) {
                a3Var.f31694s = this.f32019f;
                a3Var.v = this.h;
            }
            a3 a3Var2 = this.d;
            if (a3Var2 != null) {
                a3Var2.f31694s = this.f32019f;
                a3Var2.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!h4.l(this.f32016a, this.f32017b, motionEvent, this, this.f32018c, this.f32019f, this.h)) {
            if (!h4.l(this.f32016a, this.f32017b, motionEvent, this, this.d, this.f32019f, this.e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
        this.f32020n = pageblockblockquote;
        requestLayout();
    }
}
