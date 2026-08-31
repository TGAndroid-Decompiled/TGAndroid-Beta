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
public final class d1 extends View implements org.telegram.ui.Cells.l9, g3 {
    public final o70 f35955a;
    public final j4 f35956b;
    public d3 f35957c;
    public d3 d;
    public int f35958e;
    public int f35959f;
    public int h;
    public TL_iv.pageBlockBlockquote f35960n;

    public d1(Context context, o70 o70Var, j4 j4Var) {
        super(context);
        this.f35955a = o70Var;
        this.f35956b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f35957c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            arrayList.add(d3Var2);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        o70 o70Var = this.f35955a;
        o70Var.getClass();
        float f10 = 18;
        int dp = AndroidUtilities.dp(f10);
        d3 d3Var = this.f35957c;
        if (d3Var != null) {
            i10 = Math.min(Integer.MAX_VALUE, (d3Var.a() + d3Var.f35986s) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            i10 = Math.min(i10, (d3Var2.a() + d3Var2.f35986s) - dp);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        o70Var.getClass();
        return i10 - AndroidUtilities.dp(f10);
    }

    @Override
    public int getBoundRight() {
        int i10;
        o70 o70Var = this.f35955a;
        o70Var.getClass();
        float f10 = 18;
        int dp = AndroidUtilities.dp(f10);
        d3 d3Var = this.f35957c;
        if (d3Var != null) {
            i10 = Math.max(Integer.MIN_VALUE, d3Var.b() + d3Var.f35986s + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            i10 = Math.max(i10, d3Var2.b() + d3Var2.f35986s + dp);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        o70Var.getClass();
        return AndroidUtilities.dp(f10) + i10;
    }

    @Override
    public int getLastLineBoundRight() {
        int c3;
        int dp;
        d3 d3Var = this.d;
        o70 o70Var = this.f35955a;
        if (d3Var != null) {
            c3 = d3Var.c() + d3Var.f35986s;
            o70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            d3 d3Var2 = this.f35957c;
            if (d3Var2 != null) {
                c3 = d3Var2.c() + d3Var2.f35986s;
                o70Var.getClass();
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
        d3 d3Var = this.f35957c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            d3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f35957c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            d3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f35960n == null) {
            return;
        }
        d3 d3Var = this.f35957c;
        o70 o70Var = this.f35955a;
        int i10 = 0;
        if (d3Var != null) {
            canvas.save();
            canvas.translate(this.f35959f, this.h);
            l4.v(o70Var, canvas, this, 0);
            this.f35957c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f35959f, this.f35958e);
            l4.v(o70Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        j4 j4Var = this.f35956b;
        if (j4Var != null && j4Var.D) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(20.0f);
            canvas.drawRect(measuredWidth, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + measuredWidth, getMeasuredHeight() - AndroidUtilities.dp(6.0f), l4.f38591n1);
        } else {
            o70Var.getClass();
            o70Var.getClass();
            canvas.drawRect(AndroidUtilities.dp((this.f35960n.level * 14) + 18), AndroidUtilities.dp(6.0f), AndroidUtilities.dp((this.f35960n.level * 14) + 20), getMeasuredHeight() - AndroidUtilities.dp(6.0f), l4.f38591n1);
        }
        l4.u(canvas, o70Var, this.f35960n, getMeasuredHeight());
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
        d3 d3Var = this.f35957c;
        j4 j4Var = this.f35956b;
        o70 o70Var = this.f35955a;
        if (d3Var != null && (j11 = l4.j(o70Var, j4Var, d3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null && (j10 = l4.j(o70Var, j4Var, d3Var2)) != null) {
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
        o70 o70Var = this.f35955a;
        o70Var.getClass();
        float f10 = 8;
        this.h = AndroidUtilities.dp(f10);
        if (this.f35960n != null) {
            o70Var.getClass();
            int dp = size - AndroidUtilities.dp(50);
            if (this.f35960n.level > 0) {
                dp -= AndroidUtilities.dp(i13 * 14);
            }
            int i14 = dp;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.f35960n;
            d3 q10 = l4.q(this.f35955a, this, null, pageblockblockquote.text, i14, this.h, pageblockblockquote, this.f35956b);
            this.f35957c = q10;
            if (q10 != null) {
                o70Var.getClass();
                i12 = this.f35957c.d.getHeight() + AndroidUtilities.dp(f10);
            } else {
                i12 = 0;
            }
            int i15 = this.f35960n.level;
            j4 j4Var = this.f35956b;
            if (i15 > 0) {
                if (j4Var != null && j4Var.D) {
                    this.f35959f = AndroidUtilities.dp((i15 * 14) + 14);
                } else {
                    int dp2 = AndroidUtilities.dp(i15 * 14);
                    o70Var.getClass();
                    this.f35959f = AndroidUtilities.dp(32) + dp2;
                }
            } else if (j4Var != null && j4Var.D) {
                this.f35959f = AndroidUtilities.dp(14.0f);
            } else {
                o70Var.getClass();
                this.f35959f = AndroidUtilities.dp(32);
            }
            o70Var.getClass();
            int dp3 = AndroidUtilities.dp(f10) + i12;
            this.f35958e = dp3;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = this.f35960n;
            d3 q11 = l4.q(this.f35955a, this, null, pageblockblockquote2.caption, i14, dp3, pageblockblockquote2, this.f35956b);
            this.d = q11;
            if (q11 != null) {
                o70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f10);
            }
            if (i12 != 0) {
                o70Var.getClass();
                i12 += AndroidUtilities.dp(f10);
            }
            d3 d3Var = this.f35957c;
            if (d3Var != null) {
                d3Var.f35986s = this.f35959f;
                d3Var.v = this.h;
            }
            d3 d3Var2 = this.d;
            if (d3Var2 != null) {
                d3Var2.f35986s = this.f35959f;
                d3Var2.v = this.f35958e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.f35955a, this.f35956b, motionEvent, this, this.f35957c, this.f35959f, this.h)) {
            if (!l4.l(this.f35955a, this.f35956b, motionEvent, this, this.d, this.f35959f, this.f35958e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
        this.f35960n = pageblockblockquote;
        requestLayout();
    }
}
