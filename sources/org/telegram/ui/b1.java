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
public final class b1 extends View implements org.telegram.ui.Cells.n9, d3 {
    public final t70 f36231a;
    public final f4 f36232b;
    public a3 f36233c;
    public a3 d;
    public int f36234e;
    public int f36235f;
    public int h;
    public TL_iv.pageBlockBlockquote f36236n;

    public b1(Context context, t70 t70Var, f4 f4Var) {
        super(context);
        this.f36231a = t70Var;
        this.f36232b = f4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f36233c;
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
        t70 t70Var = this.f36231a;
        t70Var.getClass();
        float f7 = 18;
        int dp = AndroidUtilities.dp(f7);
        a3 a3Var = this.f36233c;
        if (a3Var != null) {
            i10 = Math.min(Integer.MAX_VALUE, (a3Var.a() + a3Var.f35862s) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            i10 = Math.min(i10, (a3Var2.a() + a3Var2.f35862s) - dp);
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
        t70 t70Var = this.f36231a;
        t70Var.getClass();
        float f7 = 18;
        int dp = AndroidUtilities.dp(f7);
        a3 a3Var = this.f36233c;
        if (a3Var != null) {
            i10 = Math.max(Integer.MIN_VALUE, a3Var.b() + a3Var.f35862s + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            i10 = Math.max(i10, a3Var2.b() + a3Var2.f35862s + dp);
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
        a3 a3Var = this.d;
        t70 t70Var = this.f36231a;
        if (a3Var != null) {
            c10 = a3Var.c() + a3Var.f35862s;
            t70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            a3 a3Var2 = this.f36233c;
            if (a3Var2 != null) {
                c10 = a3Var2.c() + a3Var2.f35862s;
                t70Var.getClass();
                dp = AndroidUtilities.dp(18);
            } else {
                return -1;
            }
        }
        return dp + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ai.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f36233c;
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
        a3 a3Var = this.f36233c;
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
        if (this.f36236n == null) {
            return;
        }
        a3 a3Var = this.f36233c;
        t70 t70Var = this.f36231a;
        int i10 = 0;
        if (a3Var != null) {
            canvas.save();
            canvas.translate(this.f36235f, this.h);
            h4.v(t70Var, canvas, this, 0);
            this.f36233c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f36235f, this.f36234e);
            h4.v(t70Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        f4 f4Var = this.f36232b;
        if (f4Var != null && f4Var.G) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(20.0f);
            canvas.drawRect(measuredWidth, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + measuredWidth, getMeasuredHeight() - AndroidUtilities.dp(6.0f), h4.f38255q1);
        } else {
            t70Var.getClass();
            t70Var.getClass();
            canvas.drawRect(AndroidUtilities.dp((this.f36236n.level * 14) + 18), AndroidUtilities.dp(6.0f), AndroidUtilities.dp((this.f36236n.level * 14) + 20), getMeasuredHeight() - AndroidUtilities.dp(6.0f), h4.f38255q1);
        }
        h4.u(canvas, t70Var, this.f36236n, getMeasuredHeight());
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
        a3 a3Var = this.f36233c;
        f4 f4Var = this.f36232b;
        t70 t70Var = this.f36231a;
        if (a3Var != null && (j10 = h4.j(t70Var, f4Var, a3Var)) != null) {
            spannableStringBuilder.append(j10);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null && (j3 = h4.j(t70Var, f4Var, a3Var2)) != null) {
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
        int i14;
        int size = View.MeasureSpec.getSize(i10);
        t70 t70Var = this.f36231a;
        t70Var.getClass();
        float f7 = 8;
        this.h = AndroidUtilities.dp(f7);
        if (this.f36236n != null) {
            t70Var.getClass();
            int dp = size - AndroidUtilities.dp(50);
            if (this.f36236n.level > 0) {
                dp -= AndroidUtilities.dp(i13 * 14);
            }
            int i15 = dp;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.f36236n;
            a3 q6 = h4.q(this.f36231a, this, null, pageblockblockquote.text, i15, this.h, pageblockblockquote, this.f36232b);
            this.f36233c = q6;
            if (q6 != null) {
                t70Var.getClass();
                i14 = this.f36233c.d.getHeight() + AndroidUtilities.dp(f7);
            } else {
                i14 = 0;
            }
            i12 = i14;
            int i16 = this.f36236n.level;
            f4 f4Var = this.f36232b;
            if (i16 > 0) {
                if (f4Var != null && f4Var.G) {
                    this.f36235f = AndroidUtilities.dp((i16 * 14) + 14);
                } else {
                    int dp2 = AndroidUtilities.dp(i16 * 14);
                    t70Var.getClass();
                    this.f36235f = AndroidUtilities.dp(32) + dp2;
                }
            } else if (f4Var != null && f4Var.G) {
                this.f36235f = AndroidUtilities.dp(14.0f);
            } else {
                t70Var.getClass();
                this.f36235f = AndroidUtilities.dp(32);
            }
            t70Var.getClass();
            int dp3 = AndroidUtilities.dp(f7) + i12;
            this.f36234e = dp3;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = this.f36236n;
            a3 q10 = h4.q(this.f36231a, this, null, pageblockblockquote2.caption, i15, dp3, pageblockblockquote2, this.f36232b);
            this.d = q10;
            if (q10 != null) {
                t70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f7);
            }
            if (i12 != 0) {
                t70Var.getClass();
                i12 += AndroidUtilities.dp(f7);
            }
            a3 a3Var = this.f36233c;
            if (a3Var != null) {
                a3Var.f35862s = this.f36235f;
                a3Var.v = this.h;
            }
            a3 a3Var2 = this.d;
            if (a3Var2 != null) {
                a3Var2.f35862s = this.f36235f;
                a3Var2.v = this.f36234e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!h4.l(this.f36231a, this.f36232b, motionEvent, this, this.f36233c, this.f36235f, this.h)) {
            if (!h4.l(this.f36231a, this.f36232b, motionEvent, this, this.d, this.f36235f, this.f36234e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
        this.f36236n = pageblockblockquote;
        requestLayout();
    }
}
