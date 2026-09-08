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
public final class c1 extends View implements org.telegram.ui.Cells.p9, e3 {
    public final v70 f34993a;
    public final g4 f34994b;
    public b3 f34995c;
    public b3 d;
    public int f34996e;
    public int f34997f;
    public int h;
    public TL_iv.pageBlockBlockquote f34998n;

    public c1(Context context, v70 v70Var, g4 g4Var) {
        super(context);
        this.f34993a = v70Var;
        this.f34994b = g4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f34995c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            arrayList.add(b3Var2);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        v70 v70Var = this.f34993a;
        v70Var.getClass();
        float f7 = 18;
        int dp = AndroidUtilities.dp(f7);
        b3 b3Var = this.f34995c;
        if (b3Var != null) {
            i10 = Math.min(Integer.MAX_VALUE, (b3Var.a() + b3Var.f34644s) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            i10 = Math.min(i10, (b3Var2.a() + b3Var2.f34644s) - dp);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        v70Var.getClass();
        return i10 - AndroidUtilities.dp(f7);
    }

    @Override
    public int getBoundRight() {
        int i10;
        v70 v70Var = this.f34993a;
        v70Var.getClass();
        float f7 = 18;
        int dp = AndroidUtilities.dp(f7);
        b3 b3Var = this.f34995c;
        if (b3Var != null) {
            i10 = Math.max(Integer.MIN_VALUE, b3Var.b() + b3Var.f34644s + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            i10 = Math.max(i10, b3Var2.b() + b3Var2.f34644s + dp);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        v70Var.getClass();
        return AndroidUtilities.dp(f7) + i10;
    }

    @Override
    public int getLastLineBoundRight() {
        int c10;
        int dp;
        b3 b3Var = this.d;
        v70 v70Var = this.f34993a;
        if (b3Var != null) {
            c10 = b3Var.c() + b3Var.f34644s;
            v70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            b3 b3Var2 = this.f34995c;
            if (b3Var2 != null) {
                c10 = b3Var2.c() + b3Var2.f34644s;
                v70Var.getClass();
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
        b3 b3Var = this.f34995c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            b3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f34995c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            b3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f34998n == null) {
            return;
        }
        b3 b3Var = this.f34995c;
        v70 v70Var = this.f34993a;
        int i10 = 0;
        if (b3Var != null) {
            canvas.save();
            canvas.translate(this.f34997f, this.h);
            i4.v(v70Var, canvas, this, 0);
            this.f34995c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f34997f, this.f34996e);
            i4.v(v70Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        g4 g4Var = this.f34994b;
        if (g4Var != null && g4Var.G) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(20.0f);
            canvas.drawRect(measuredWidth, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + measuredWidth, getMeasuredHeight() - AndroidUtilities.dp(6.0f), i4.f37229q1);
        } else {
            v70Var.getClass();
            v70Var.getClass();
            canvas.drawRect(AndroidUtilities.dp((this.f34998n.level * 14) + 18), AndroidUtilities.dp(6.0f), AndroidUtilities.dp((this.f34998n.level * 14) + 20), getMeasuredHeight() - AndroidUtilities.dp(6.0f), i4.f37229q1);
        }
        i4.u(canvas, v70Var, this.f34998n, getMeasuredHeight());
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
        b3 b3Var = this.f34995c;
        g4 g4Var = this.f34994b;
        v70 v70Var = this.f34993a;
        if (b3Var != null && (j10 = i4.j(v70Var, g4Var, b3Var)) != null) {
            spannableStringBuilder.append(j10);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null && (j3 = i4.j(v70Var, g4Var, b3Var2)) != null) {
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
        v70 v70Var = this.f34993a;
        v70Var.getClass();
        float f7 = 8;
        this.h = AndroidUtilities.dp(f7);
        if (this.f34998n != null) {
            v70Var.getClass();
            int dp = size - AndroidUtilities.dp(50);
            if (this.f34998n.level > 0) {
                dp -= AndroidUtilities.dp(i13 * 14);
            }
            int i14 = dp;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.f34998n;
            b3 q6 = i4.q(this.f34993a, this, null, pageblockblockquote.text, i14, this.h, pageblockblockquote, this.f34994b);
            this.f34995c = q6;
            if (q6 != null) {
                v70Var.getClass();
                i12 = this.f34995c.d.getHeight() + AndroidUtilities.dp(f7);
            } else {
                i12 = 0;
            }
            int i15 = this.f34998n.level;
            g4 g4Var = this.f34994b;
            if (i15 > 0) {
                if (g4Var != null && g4Var.G) {
                    this.f34997f = AndroidUtilities.dp((i15 * 14) + 14);
                } else {
                    int dp2 = AndroidUtilities.dp(i15 * 14);
                    v70Var.getClass();
                    this.f34997f = AndroidUtilities.dp(32) + dp2;
                }
            } else if (g4Var != null && g4Var.G) {
                this.f34997f = AndroidUtilities.dp(14.0f);
            } else {
                v70Var.getClass();
                this.f34997f = AndroidUtilities.dp(32);
            }
            v70Var.getClass();
            int dp3 = AndroidUtilities.dp(f7) + i12;
            this.f34996e = dp3;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = this.f34998n;
            b3 q10 = i4.q(this.f34993a, this, null, pageblockblockquote2.caption, i14, dp3, pageblockblockquote2, this.f34994b);
            this.d = q10;
            if (q10 != null) {
                v70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f7);
            }
            if (i12 != 0) {
                v70Var.getClass();
                i12 += AndroidUtilities.dp(f7);
            }
            b3 b3Var = this.f34995c;
            if (b3Var != null) {
                b3Var.f34644s = this.f34997f;
                b3Var.v = this.h;
            }
            b3 b3Var2 = this.d;
            if (b3Var2 != null) {
                b3Var2.f34644s = this.f34997f;
                b3Var2.v = this.f34996e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.l(this.f34993a, this.f34994b, motionEvent, this, this.f34995c, this.f34997f, this.h)) {
            if (!i4.l(this.f34993a, this.f34994b, motionEvent, this, this.d, this.f34997f, this.f34996e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
        this.f34998n = pageblockblockquote;
        requestLayout();
    }
}
