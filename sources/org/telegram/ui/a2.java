package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;
public final class a2 extends ViewGroup implements org.telegram.ui.Cells.m9, g3 {
    public final b70 f35239a;
    public final j4 f35240b;
    public d3 f35241c;
    public org.telegram.ui.Components.sl0 d;
    public int e;
    public int f35242f;
    public int h;
    public int f35243n;
    public int f35244r;
    public boolean f35245s;
    public int v;
    public a4 f35246w;
    public boolean f35247x;
    public CheckBoxBase f35248y;

    public a2(Context context, b70 b70Var, j4 j4Var) {
        super(context);
        this.f35239a = b70Var;
        this.f35240b = j4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        d3 d3Var;
        a4 a4Var = this.f35246w;
        if (a4Var != null) {
            d3Var = a4Var.f35263i;
        } else {
            d3Var = null;
        }
        if (d3Var == null) {
            return 0;
        }
        b70 b70Var = this.f35239a;
        j4 j4Var = this.f35240b;
        if (j4Var != null && j4Var.G) {
            int measuredWidth = getMeasuredWidth();
            b70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(15);
            b4 b4Var = this.f35246w.f35261c;
            return org.telegram.messenger.kk.B(12.0f, b4Var.f35489f, dp - b4Var.f35488c);
        }
        b70Var.getClass();
        return org.telegram.messenger.g0.D(12.0f, this.f35246w.f35261c.f35489f, (AndroidUtilities.dp(15) + this.f35246w.f35261c.f35488c) - ((int) Math.ceil(d3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.sl0 sl0Var = this.d;
        if (sl0Var != null) {
            View view = sl0Var.f45912a;
            if (view instanceof org.telegram.ui.Cells.m9) {
                ((org.telegram.ui.Cells.m9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        d3 d3Var = this.f35241c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f35239a.getClass();
        int dp = AndroidUtilities.dp(18);
        if (this.f35248y != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.e - AndroidUtilities.dp(26.0f)) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        a4 a4Var = this.f35246w;
        if (a4Var != null && a4Var.f35263i != null) {
            i10 = Math.min(i10, (this.f35246w.f35263i.a() + a()) - dp);
        }
        d3 d3Var = this.f35241c;
        if (d3Var != null) {
            i10 = Math.min(i10, (d3Var.a() + d3Var.f36235s) - dp);
        }
        org.telegram.ui.Components.sl0 sl0Var = this.d;
        if (sl0Var != null) {
            View view = sl0Var.f45912a;
            if ((view instanceof g3) && (boundLeft = ((g3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f35243n + boundLeft);
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10;
    }

    @Override
    public int getBoundRight() {
        int i10;
        int boundRight;
        this.f35239a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f35246w;
        if (a4Var != null && a4Var.f35263i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f35246w.f35263i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        d3 d3Var = this.f35241c;
        if (d3Var != null) {
            i10 = Math.max(i10, d3Var.b() + d3Var.f36235s + dp);
        }
        org.telegram.ui.Components.sl0 sl0Var = this.d;
        if (sl0Var != null) {
            View view = sl0Var.f45912a;
            if ((view instanceof g3) && (boundRight = ((g3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f35243n + boundRight);
            }
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        return i10;
    }

    @Override
    public int getLastLineBoundRight() {
        int lastLineBoundRight;
        int i10;
        d3 d3Var = this.f35241c;
        if (d3Var != null) {
            lastLineBoundRight = d3Var.c() + d3Var.f36235s;
            this.f35239a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.sl0 sl0Var = this.d;
            if (sl0Var != null) {
                View view = sl0Var.f45912a;
                if ((view instanceof g3) && (lastLineBoundRight = ((g3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f35243n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.kk.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.sl0 sl0Var = this.d;
        if (sl0Var != null) {
            sl0Var.f45912a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f35241c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f35241c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a4 a4Var;
        int i10;
        int i11;
        if (this.f35246w != null) {
            int measuredWidth = getMeasuredWidth();
            d3 d3Var = this.f35246w.f35263i;
            b70 b70Var = this.f35239a;
            if (d3Var != null) {
                canvas.save();
                j4 j4Var = this.f35240b;
                if (j4Var != null && j4Var.G) {
                    b70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(15);
                    b4 b4Var = this.f35246w.f35261c;
                    float B = org.telegram.messenger.kk.B(12.0f, b4Var.f35489f, dp - b4Var.f35488c);
                    int i12 = this.f35242f + this.h;
                    if (this.f35247x) {
                        i11 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = 0;
                    }
                    canvas.translate(B, i12 - i11);
                } else {
                    b70Var.getClass();
                    float D = org.telegram.messenger.g0.D(12.0f, this.f35246w.f35261c.f35489f, (AndroidUtilities.dp(15) + this.f35246w.f35261c.f35488c) - ((int) Math.ceil(a4Var.f35263i.d.getLineWidth(0))));
                    int i13 = this.f35242f + this.h;
                    if (this.f35247x) {
                        i10 = AndroidUtilities.dp(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(D, i13 - i10);
                }
                this.f35246w.f35263i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f35248y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f35242f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f35248y.a(canvas);
            }
            if (this.f35241c != null) {
                canvas.save();
                canvas.translate(this.e, this.f35242f);
                l4.v(b70Var, canvas, this, 0);
                this.f35241c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        d3 d3Var = this.f35241c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.j(this.f35239a, this.f35240b, d3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.sl0 sl0Var = this.d;
        if (sl0Var != null) {
            View view = sl0Var.f45912a;
            int i14 = this.f35243n;
            view.layout(i14, this.f35244r, view.getMeasuredWidth() + i14, this.d.f45912a.getMeasuredHeight() + this.f35244r);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        b70 b70Var;
        TextPaint textPaint;
        b70 b70Var2;
        d3 q6;
        int i13;
        int dp;
        int dp2;
        int i14;
        int i15;
        int i16;
        d3 d3Var;
        e2 e2Var;
        d3 d3Var2;
        int i17;
        org.telegram.ui.Cells.n9 n9Var;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        a4 a4Var = this.f35246w;
        int i18 = 1;
        if (a4Var != null) {
            this.f35241c = null;
            int i19 = a4Var.f35264j;
            b70 b70Var3 = this.f35239a;
            int i20 = 0;
            if (i19 == 0 && a4Var.f35261c.f35489f == 0) {
                b70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f35242f = i12;
            this.h = 0;
            b4 b4Var = this.f35246w.f35261c;
            if (b4Var.d == size && b4Var.e == SharedConfig.ivFontSize) {
                b70Var = b70Var3;
            } else {
                b4Var.d = size;
                b4Var.e = SharedConfig.ivFontSize;
                b4Var.f35488c = 0;
                int size2 = b4Var.f35487b.size();
                boolean z10 = true;
                int i21 = 0;
                while (i21 < size2) {
                    a4 a4Var2 = (a4) this.f35246w.f35261c.f35487b.get(i21);
                    String str = a4Var2.f35262f;
                    if (str != null) {
                        if (a4Var2.f35259a && "•".equalsIgnoreCase(str)) {
                            a4Var2.f35263i = null;
                        } else {
                            String str2 = a4Var2.f35262f;
                            b70Var3.getClass();
                            b70 b70Var4 = b70Var3;
                            b70Var2 = b70Var4;
                            a4Var2.f35263i = l4.q(b70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f35242f, this.f35246w, this.f35240b);
                            b4 b4Var2 = this.f35246w.f35261c;
                            b4Var2.f35488c = Math.max(b4Var2.f35488c, (int) Math.ceil(q6.d.getLineWidth(0)));
                            z10 = false;
                            i21++;
                            b70Var3 = b70Var2;
                        }
                    }
                    b70Var2 = b70Var3;
                    i21++;
                    b70Var3 = b70Var2;
                }
                b70Var = b70Var3;
                if (l4.f38739n1 != null && !z10) {
                    b4 b4Var3 = this.f35246w.f35261c;
                    b4Var3.f35488c = Math.max(b4Var3.f35488c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            a4 a4Var3 = this.f35246w;
            this.f35247x = !a4Var3.f35261c.f35486a.ordered;
            if (a4Var3.f35259a) {
                if (this.f35248y == null) {
                    b70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.f35248y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.h6.hl, org.telegram.ui.ActionBar.h6.f21391z5, org.telegram.ui.ActionBar.h6.f21115k7);
                    this.f35248y.d(10);
                    this.f35248y.k(true);
                    this.f35248y.i(AndroidUtilities.dp(5.0f));
                }
                this.f35248y.f(-1, this.f35246w.f35260b, false);
            } else {
                this.f35248y = null;
            }
            int i22 = 26;
            j4 j4Var = this.f35240b;
            if (j4Var != null && j4Var.G) {
                b70Var.getClass();
                if (this.f35248y == null) {
                    i22 = 0;
                }
                this.e = AndroidUtilities.dp(i22 + 18);
            } else {
                b70Var.getClass();
                if (this.f35248y == null) {
                    i22 = 0;
                }
                int dp3 = AndroidUtilities.dp(i22 + 24);
                b4 b4Var4 = this.f35246w.f35261c;
                this.e = org.telegram.messenger.g0.D(12.0f, b4Var4.f35489f, dp3 + b4Var4.f35488c);
            }
            b70Var.getClass();
            float f7 = 18;
            int dp4 = (size - AndroidUtilities.dp(f7)) - this.e;
            if (j4Var != null && j4Var.G) {
                int dp5 = AndroidUtilities.dp(6.0f);
                b4 b4Var5 = this.f35246w.f35261c;
                dp4 -= (AndroidUtilities.dp(12.0f) * b4Var5.f35489f) + (dp5 + b4Var5.f35488c);
            }
            a4 a4Var4 = this.f35246w;
            int i23 = dp4;
            TL_iv.RichText richText = a4Var4.e;
            if (richText != null) {
                if (j4Var != null && j4Var.G) {
                    alignment = org.telegram.ui.Components.ex0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                d3 p5 = l4.p(this.f35239a, this, null, richText, i23, 0, a4Var4, alignment, 0, this.f35240b);
                this.f35241c = p5;
                if (p5 != null && p5.d.getLineCount() > 0) {
                    d3 d3Var3 = this.f35246w.f35263i;
                    if (d3Var3 != null && d3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.f35246w.f35263i.d.getLineAscent(0)) - this.f35241c.d.getLineAscent(0);
                    }
                    i13 = this.f35241c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            } else {
                TL_iv.PageBlock pageBlock = a4Var4.d;
                if (pageBlock != null) {
                    int i24 = this.e;
                    this.f35243n = i24;
                    int i25 = this.f35242f;
                    this.f35244r = i25;
                    org.telegram.ui.Components.sl0 sl0Var = this.d;
                    if (sl0Var != null) {
                        View view = sl0Var.f45912a;
                        if (view instanceof e2) {
                            float f10 = 8;
                            this.f35244r = i25 - AndroidUtilities.dp(f10);
                            if (j4Var == null || !j4Var.G) {
                                this.f35243n -= AndroidUtilities.dp(f7);
                            }
                            int dp6 = i23 + AndroidUtilities.dp(f7);
                            i15 = 0 - AndroidUtilities.dp(f10);
                            i14 = dp6;
                        } else {
                            if (!(view instanceof y1) && !(view instanceof t2) && !(view instanceof x2) && !(view instanceof u2)) {
                                if (l4.L(pageBlock)) {
                                    this.f35243n = 0;
                                    this.f35244r = 0;
                                    this.f35242f = 0;
                                    a4 a4Var5 = this.f35246w;
                                    if (a4Var5.f35264j == 0 && a4Var5.f35261c.f35489f == 0) {
                                        i16 = 0 - AndroidUtilities.dp(10);
                                    } else {
                                        i16 = 0;
                                    }
                                    i15 = i16 - AndroidUtilities.dp(8);
                                    i14 = size;
                                } else if (this.d.f45912a instanceof w2) {
                                    this.f35243n -= AndroidUtilities.dp(f7);
                                    dp2 = AndroidUtilities.dp(36);
                                } else {
                                    i14 = i23;
                                    i15 = 0;
                                }
                            } else {
                                if (j4Var == null || !j4Var.G) {
                                    this.f35243n = i24 - AndroidUtilities.dp(f7);
                                }
                                dp2 = AndroidUtilities.dp(f7);
                            }
                            i14 = dp2 + i23;
                            i15 = 0;
                        }
                        this.d.f45912a.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f45912a instanceof e2) && (d3Var = this.f35246w.f35263i) != null && d3Var.d.getLineCount() > 0 && (d3Var2 = (e2Var = (e2) this.d.f45912a).f36520c) != null && d3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.f35246w.f35263i.d.getLineAscent(0)) - e2Var.f36520c.d.getLineAscent(0);
                        }
                        a4 a4Var6 = this.f35246w;
                        if (a4Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f35245s = true;
                            this.f35244r = 0;
                            if (a4Var6.f35264j == 0 && a4Var6.f35261c.f35489f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.f45912a;
                            if (view2 instanceof d2) {
                                this.f35245s = ((d2) view2).v;
                            } else if (view2 instanceof a2) {
                                this.f35245s = ((a2) view2).f35245s;
                            }
                        }
                        if (this.f35245s && this.f35246w.f35263i != null) {
                            this.f35242f = ((this.d.f45912a.getMeasuredHeight() - this.f35246w.f35263i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.f35247x = false;
                        }
                        i13 = this.d.f45912a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            }
            if (i2.e.h(1, this.f35246w.f35261c.f35487b) == this.f35246w) {
                i17 += AndroidUtilities.dp(8);
            }
            a4 a4Var7 = this.f35246w;
            if (a4Var7.f35264j == 0 && a4Var7.f35261c.f35489f == 0) {
                i18 = AndroidUtilities.dp(10) + i17;
            } else {
                i18 = i17;
            }
            d3 d3Var4 = this.f35241c;
            if (d3Var4 != null) {
                d3Var4.f36235s = this.e;
                d3Var4.v = this.f35242f;
            }
            org.telegram.ui.Components.sl0 sl0Var2 = this.d;
            if (sl0Var2 != null && (sl0Var2.f45912a instanceof org.telegram.ui.Cells.m9) && (n9Var = ((l4) b70Var).O0) != null) {
                ArrayList arrayList = n9Var.A0;
                arrayList.clear();
                ((org.telegram.ui.Cells.m9) this.d.f45912a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i20 < size3) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) obj;
                    if (y9Var instanceof d3) {
                        d3 d3Var5 = (d3) y9Var;
                        d3Var5.f36235s += this.f35243n;
                        d3Var5.v += this.f35244r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (l4.l(this.f35239a, this.f35240b, motionEvent, this, this.f35241c, this.e, this.f35242f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(a4 a4Var) {
        a4 a4Var2 = this.f35246w;
        j4 j4Var = this.f35240b;
        if (a4Var2 != a4Var) {
            this.f35246w = a4Var;
            org.telegram.ui.Components.sl0 sl0Var = this.d;
            if (sl0Var != null) {
                removeView(sl0Var.f45912a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f35246w.d;
            if (pageBlock != null && j4Var != null) {
                int I = j4.I(pageBlock);
                this.v = I;
                s4.b1 x10 = j4Var.x(this, I);
                this.d = (org.telegram.ui.Components.sl0) x10;
                addView(x10.f45912a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f35246w.d;
        if (pageBlock2 != null && j4Var != null) {
            j4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
