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
public final class d1 extends View implements org.telegram.ui.Cells.n9, f3 {
    public final f70 f36463a;
    public final i4 f36464b;
    public c3 f36465c;
    public c3 d;
    public int e;
    public int f36466f;
    public int h;
    public TL_iv.pageBlockBlockquote f36467n;

    public d1(Context context, f70 f70Var, i4 i4Var) {
        super(context);
        this.f36463a = f70Var;
        this.f36464b = i4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f36465c;
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
        f70 f70Var = this.f36463a;
        f70Var.getClass();
        float f7 = 18;
        int dp = AndroidUtilities.dp(f7);
        c3 c3Var = this.f36465c;
        if (c3Var != null) {
            i10 = Math.min(Integer.MAX_VALUE, (c3Var.a() + c3Var.f36233s) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            i10 = Math.min(i10, (c3Var2.a() + c3Var2.f36233s) - dp);
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        f70Var.getClass();
        return i10 - AndroidUtilities.dp(f7);
    }

    @Override
    public int getBoundRight() {
        int i10;
        f70 f70Var = this.f36463a;
        f70Var.getClass();
        float f7 = 18;
        int dp = AndroidUtilities.dp(f7);
        c3 c3Var = this.f36465c;
        if (c3Var != null) {
            i10 = Math.max(Integer.MIN_VALUE, c3Var.b() + c3Var.f36233s + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            i10 = Math.max(i10, c3Var2.b() + c3Var2.f36233s + dp);
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        f70Var.getClass();
        return AndroidUtilities.dp(f7) + i10;
    }

    @Override
    public int getLastLineBoundRight() {
        int c10;
        int dp;
        c3 c3Var = this.d;
        f70 f70Var = this.f36463a;
        if (c3Var != null) {
            c10 = c3Var.c() + c3Var.f36233s;
            f70Var.getClass();
            dp = AndroidUtilities.dp(18);
        } else {
            c3 c3Var2 = this.f36465c;
            if (c3Var2 != null) {
                c10 = c3Var2.c() + c3Var2.f36233s;
                f70Var.getClass();
                dp = AndroidUtilities.dp(18);
            } else {
                return -1;
            }
        }
        return dp + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.sl.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f36465c;
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
        c3 c3Var = this.f36465c;
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
        if (this.f36467n == null) {
            return;
        }
        c3 c3Var = this.f36465c;
        f70 f70Var = this.f36463a;
        int i10 = 0;
        if (c3Var != null) {
            canvas.save();
            canvas.translate(this.f36466f, this.h);
            k4.v(f70Var, canvas, this, 0);
            this.f36465c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f36466f, this.e);
            k4.v(f70Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        i4 i4Var = this.f36464b;
        if (i4Var != null && i4Var.G) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(20.0f);
            canvas.drawRect(measuredWidth, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + measuredWidth, getMeasuredHeight() - AndroidUtilities.dp(6.0f), k4.f38775r1);
        } else {
            f70Var.getClass();
            f70Var.getClass();
            canvas.drawRect(AndroidUtilities.dp((this.f36467n.level * 14) + 18), AndroidUtilities.dp(6.0f), AndroidUtilities.dp((this.f36467n.level * 14) + 20), getMeasuredHeight() - AndroidUtilities.dp(6.0f), k4.f38775r1);
        }
        k4.u(canvas, f70Var, this.f36467n, getMeasuredHeight());
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
        c3 c3Var = this.f36465c;
        i4 i4Var = this.f36464b;
        f70 f70Var = this.f36463a;
        if (c3Var != null && (j11 = k4.j(f70Var, i4Var, c3Var)) != null) {
            spannableStringBuilder.append(j11);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null && (j10 = k4.j(f70Var, i4Var, c3Var2)) != null) {
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
        f70 f70Var = this.f36463a;
        f70Var.getClass();
        float f7 = 8;
        this.h = AndroidUtilities.dp(f7);
        if (this.f36467n != null) {
            f70Var.getClass();
            int dp = size - AndroidUtilities.dp(50);
            if (this.f36467n.level > 0) {
                dp -= AndroidUtilities.dp(i13 * 14);
            }
            int i15 = dp;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.f36467n;
            c3 q6 = k4.q(this.f36463a, this, null, pageblockblockquote.text, i15, this.h, pageblockblockquote, this.f36464b);
            this.f36465c = q6;
            if (q6 != null) {
                f70Var.getClass();
                i14 = this.f36465c.d.getHeight() + AndroidUtilities.dp(f7);
            } else {
                i14 = 0;
            }
            i12 = i14;
            int i16 = this.f36467n.level;
            i4 i4Var = this.f36464b;
            if (i16 > 0) {
                if (i4Var != null && i4Var.G) {
                    this.f36466f = AndroidUtilities.dp((i16 * 14) + 14);
                } else {
                    int dp2 = AndroidUtilities.dp(i16 * 14);
                    f70Var.getClass();
                    this.f36466f = AndroidUtilities.dp(32) + dp2;
                }
            } else if (i4Var != null && i4Var.G) {
                this.f36466f = AndroidUtilities.dp(14.0f);
            } else {
                f70Var.getClass();
                this.f36466f = AndroidUtilities.dp(32);
            }
            f70Var.getClass();
            int dp3 = AndroidUtilities.dp(f7) + i12;
            this.e = dp3;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = this.f36467n;
            c3 q10 = k4.q(this.f36463a, this, null, pageblockblockquote2.caption, i15, dp3, pageblockblockquote2, this.f36464b);
            this.d = q10;
            if (q10 != null) {
                f70Var.getClass();
                i12 += this.d.d.getHeight() + AndroidUtilities.dp(f7);
            }
            if (i12 != 0) {
                f70Var.getClass();
                i12 += AndroidUtilities.dp(f7);
            }
            c3 c3Var = this.f36465c;
            if (c3Var != null) {
                c3Var.f36233s = this.f36466f;
                c3Var.v = this.h;
            }
            c3 c3Var2 = this.d;
            if (c3Var2 != null) {
                c3Var2.f36233s = this.f36466f;
                c3Var2.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!k4.l(this.f36463a, this.f36464b, motionEvent, this, this.f36465c, this.f36466f, this.h)) {
            if (!k4.l(this.f36463a, this.f36464b, motionEvent, this, this.d, this.f36466f, this.e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
        this.f36467n = pageblockblockquote;
        requestLayout();
    }
}
