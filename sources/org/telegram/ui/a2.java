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
public final class a2 extends ViewGroup implements org.telegram.ui.Cells.n9, g3 {
    public final z70 f34014a;
    public final i4 f34015b;
    public d3 f34016c;
    public org.telegram.ui.Components.wl0 d;
    public int e;
    public int f34017f;
    public int h;
    public int f34018n;
    public int f34019r;
    public boolean f34020s;
    public int v;
    public a4 f34021w;
    public boolean f34022x;
    public CheckBoxBase f34023y;

    public a2(Context context, z70 z70Var, i4 i4Var) {
        super(context);
        this.f34014a = z70Var;
        this.f34015b = i4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        d3 d3Var;
        a4 a4Var = this.f34021w;
        if (a4Var != null) {
            d3Var = a4Var.f34035i;
        } else {
            d3Var = null;
        }
        if (d3Var == null) {
            return 0;
        }
        z70 z70Var = this.f34014a;
        i4 i4Var = this.f34015b;
        if (i4Var != null && i4Var.G) {
            int measuredWidth = getMeasuredWidth();
            z70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(15);
            b4 b4Var = this.f34021w.f34033c;
            return org.telegram.messenger.yh.C(12.0f, b4Var.f34411f, dp - b4Var.f34410c);
        }
        z70Var.getClass();
        return org.telegram.messenger.yh.y(12.0f, this.f34021w.f34033c.f34411f, (AndroidUtilities.dp(15) + this.f34021w.f34033c.f34410c) - ((int) Math.ceil(d3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            View view = wl0Var.f44838a;
            if (view instanceof org.telegram.ui.Cells.n9) {
                ((org.telegram.ui.Cells.n9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        d3 d3Var = this.f34016c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f34014a.getClass();
        int dp = AndroidUtilities.dp(18);
        if (this.f34023y != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.e - AndroidUtilities.dp(26.0f)) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        a4 a4Var = this.f34021w;
        if (a4Var != null && a4Var.f34035i != null) {
            i10 = Math.min(i10, (this.f34021w.f34035i.a() + a()) - dp);
        }
        d3 d3Var = this.f34016c;
        if (d3Var != null) {
            i10 = Math.min(i10, (d3Var.a() + d3Var.f35132s) - dp);
        }
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            View view = wl0Var.f44838a;
            if ((view instanceof g3) && (boundLeft = ((g3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f34018n + boundLeft);
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
        this.f34014a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f34021w;
        if (a4Var != null && a4Var.f34035i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f34021w.f34035i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        d3 d3Var = this.f34016c;
        if (d3Var != null) {
            i10 = Math.max(i10, d3Var.b() + d3Var.f35132s + dp);
        }
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            View view = wl0Var.f44838a;
            if ((view instanceof g3) && (boundRight = ((g3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f34018n + boundRight);
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
        d3 d3Var = this.f34016c;
        if (d3Var != null) {
            lastLineBoundRight = d3Var.c() + d3Var.f35132s;
            this.f34014a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.wl0 wl0Var = this.d;
            if (wl0Var != null) {
                View view = wl0Var.f44838a;
                if ((view instanceof g3) && (lastLineBoundRight = ((g3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f34018n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.yh.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            wl0Var.f44838a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f34016c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f34016c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a4 a4Var;
        int i10;
        int i11;
        if (this.f34021w != null) {
            int measuredWidth = getMeasuredWidth();
            d3 d3Var = this.f34021w.f34035i;
            z70 z70Var = this.f34014a;
            if (d3Var != null) {
                canvas.save();
                i4 i4Var = this.f34015b;
                if (i4Var != null && i4Var.G) {
                    z70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(15);
                    b4 b4Var = this.f34021w.f34033c;
                    float C = org.telegram.messenger.yh.C(12.0f, b4Var.f34411f, dp - b4Var.f34410c);
                    int i12 = this.f34017f + this.h;
                    if (this.f34022x) {
                        i11 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = 0;
                    }
                    canvas.translate(C, i12 - i11);
                } else {
                    z70Var.getClass();
                    float y3 = org.telegram.messenger.yh.y(12.0f, this.f34021w.f34033c.f34411f, (AndroidUtilities.dp(15) + this.f34021w.f34033c.f34410c) - ((int) Math.ceil(a4Var.f34035i.d.getLineWidth(0))));
                    int i13 = this.f34017f + this.h;
                    if (this.f34022x) {
                        i10 = AndroidUtilities.dp(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(y3, i13 - i10);
                }
                this.f34021w.f34035i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f34023y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f34017f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f34023y.a(canvas);
            }
            if (this.f34016c != null) {
                canvas.save();
                canvas.translate(this.e, this.f34017f);
                k4.v(z70Var, canvas, this, 0);
                this.f34016c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        d3 d3Var = this.f34016c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(k4.j(this.f34014a, this.f34015b, d3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            View view = wl0Var.f44838a;
            int i14 = this.f34018n;
            view.layout(i14, this.f34019r, view.getMeasuredWidth() + i14, this.d.f44838a.getMeasuredHeight() + this.f34019r);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        z70 z70Var;
        TextPaint textPaint;
        z70 z70Var2;
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
        org.telegram.ui.Cells.o9 o9Var;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        a4 a4Var = this.f34021w;
        int i18 = 1;
        if (a4Var != null) {
            this.f34016c = null;
            int i19 = a4Var.f34036j;
            z70 z70Var3 = this.f34014a;
            int i20 = 0;
            if (i19 == 0 && a4Var.f34033c.f34411f == 0) {
                z70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f34017f = i12;
            this.h = 0;
            b4 b4Var = this.f34021w.f34033c;
            if (b4Var.d == size && b4Var.e == SharedConfig.ivFontSize) {
                z70Var = z70Var3;
            } else {
                b4Var.d = size;
                b4Var.e = SharedConfig.ivFontSize;
                b4Var.f34410c = 0;
                int size2 = b4Var.f34409b.size();
                boolean z10 = true;
                int i21 = 0;
                while (i21 < size2) {
                    a4 a4Var2 = (a4) this.f34021w.f34033c.f34409b.get(i21);
                    String str = a4Var2.f34034f;
                    if (str != null) {
                        if (a4Var2.f34031a && "•".equalsIgnoreCase(str)) {
                            a4Var2.f34035i = null;
                        } else {
                            String str2 = a4Var2.f34034f;
                            z70Var3.getClass();
                            z70 z70Var4 = z70Var3;
                            z70Var2 = z70Var4;
                            a4Var2.f34035i = k4.q(z70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f34017f, this.f34021w, this.f34015b);
                            b4 b4Var2 = this.f34021w.f34033c;
                            b4Var2.f34410c = Math.max(b4Var2.f34410c, (int) Math.ceil(q6.d.getLineWidth(0)));
                            z10 = false;
                            i21++;
                            z70Var3 = z70Var2;
                        }
                    }
                    z70Var2 = z70Var3;
                    i21++;
                    z70Var3 = z70Var2;
                }
                z70Var = z70Var3;
                if (k4.f37524n1 != null && !z10) {
                    b4 b4Var3 = this.f34021w.f34033c;
                    b4Var3.f34410c = Math.max(b4Var3.f34410c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            a4 a4Var3 = this.f34021w;
            this.f34022x = !a4Var3.f34033c.f34408a.ordered;
            if (a4Var3.f34031a) {
                if (this.f34023y == null) {
                    z70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.f34023y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.g6.hl, org.telegram.ui.ActionBar.g6.f20304z5, org.telegram.ui.ActionBar.g6.f20029k7);
                    this.f34023y.d(10);
                    this.f34023y.k(true);
                    this.f34023y.i(AndroidUtilities.dp(5.0f));
                }
                this.f34023y.f(-1, this.f34021w.f34032b, false);
            } else {
                this.f34023y = null;
            }
            int i22 = 26;
            i4 i4Var = this.f34015b;
            if (i4Var != null && i4Var.G) {
                z70Var.getClass();
                if (this.f34023y == null) {
                    i22 = 0;
                }
                this.e = AndroidUtilities.dp(i22 + 18);
            } else {
                z70Var.getClass();
                if (this.f34023y == null) {
                    i22 = 0;
                }
                int dp3 = AndroidUtilities.dp(i22 + 24);
                b4 b4Var4 = this.f34021w.f34033c;
                this.e = org.telegram.messenger.yh.y(12.0f, b4Var4.f34411f, dp3 + b4Var4.f34410c);
            }
            z70Var.getClass();
            float f7 = 18;
            int dp4 = (size - AndroidUtilities.dp(f7)) - this.e;
            if (i4Var != null && i4Var.G) {
                int dp5 = AndroidUtilities.dp(6.0f);
                b4 b4Var5 = this.f34021w.f34033c;
                dp4 -= (AndroidUtilities.dp(12.0f) * b4Var5.f34411f) + (dp5 + b4Var5.f34410c);
            }
            a4 a4Var4 = this.f34021w;
            int i23 = dp4;
            TL_iv.RichText richText = a4Var4.e;
            if (richText != null) {
                if (i4Var != null && i4Var.G) {
                    alignment = org.telegram.ui.Components.ix0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                d3 p5 = k4.p(this.f34014a, this, null, richText, i23, 0, a4Var4, alignment, 0, this.f34015b);
                this.f34016c = p5;
                if (p5 != null && p5.d.getLineCount() > 0) {
                    d3 d3Var3 = this.f34021w.f34035i;
                    if (d3Var3 != null && d3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.f34021w.f34035i.d.getLineAscent(0)) - this.f34016c.d.getLineAscent(0);
                    }
                    i13 = this.f34016c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            } else {
                TL_iv.PageBlock pageBlock = a4Var4.d;
                if (pageBlock != null) {
                    int i24 = this.e;
                    this.f34018n = i24;
                    int i25 = this.f34017f;
                    this.f34019r = i25;
                    org.telegram.ui.Components.wl0 wl0Var = this.d;
                    if (wl0Var != null) {
                        View view = wl0Var.f44838a;
                        if (view instanceof e2) {
                            float f10 = 8;
                            this.f34019r = i25 - AndroidUtilities.dp(f10);
                            if (i4Var == null || !i4Var.G) {
                                this.f34018n -= AndroidUtilities.dp(f7);
                            }
                            int dp6 = i23 + AndroidUtilities.dp(f7);
                            i15 = 0 - AndroidUtilities.dp(f10);
                            i14 = dp6;
                        } else {
                            if (!(view instanceof y1) && !(view instanceof t2) && !(view instanceof x2) && !(view instanceof u2)) {
                                if (k4.L(pageBlock)) {
                                    this.f34018n = 0;
                                    this.f34019r = 0;
                                    this.f34017f = 0;
                                    a4 a4Var5 = this.f34021w;
                                    if (a4Var5.f34036j == 0 && a4Var5.f34033c.f34411f == 0) {
                                        i16 = 0 - AndroidUtilities.dp(10);
                                    } else {
                                        i16 = 0;
                                    }
                                    i15 = i16 - AndroidUtilities.dp(8);
                                    i14 = size;
                                } else if (this.d.f44838a instanceof w2) {
                                    this.f34018n -= AndroidUtilities.dp(f7);
                                    dp2 = AndroidUtilities.dp(36);
                                } else {
                                    i14 = i23;
                                    i15 = 0;
                                }
                            } else {
                                if (i4Var == null || !i4Var.G) {
                                    this.f34018n = i24 - AndroidUtilities.dp(f7);
                                }
                                dp2 = AndroidUtilities.dp(f7);
                            }
                            i14 = dp2 + i23;
                            i15 = 0;
                        }
                        this.d.f44838a.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f44838a instanceof e2) && (d3Var = this.f34021w.f34035i) != null && d3Var.d.getLineCount() > 0 && (d3Var2 = (e2Var = (e2) this.d.f44838a).f35437c) != null && d3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.f34021w.f34035i.d.getLineAscent(0)) - e2Var.f35437c.d.getLineAscent(0);
                        }
                        a4 a4Var6 = this.f34021w;
                        if (a4Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f34020s = true;
                            this.f34019r = 0;
                            if (a4Var6.f34036j == 0 && a4Var6.f34033c.f34411f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.f44838a;
                            if (view2 instanceof d2) {
                                this.f34020s = ((d2) view2).v;
                            } else if (view2 instanceof a2) {
                                this.f34020s = ((a2) view2).f34020s;
                            }
                        }
                        if (this.f34020s && this.f34021w.f34035i != null) {
                            this.f34017f = ((this.d.f44838a.getMeasuredHeight() - this.f34021w.f34035i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.f34022x = false;
                        }
                        i13 = this.d.f44838a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            }
            if (i2.d.g(1, this.f34021w.f34033c.f34409b) == this.f34021w) {
                i17 += AndroidUtilities.dp(8);
            }
            a4 a4Var7 = this.f34021w;
            if (a4Var7.f34036j == 0 && a4Var7.f34033c.f34411f == 0) {
                i18 = AndroidUtilities.dp(10) + i17;
            } else {
                i18 = i17;
            }
            d3 d3Var4 = this.f34016c;
            if (d3Var4 != null) {
                d3Var4.f35132s = this.e;
                d3Var4.v = this.f34017f;
            }
            org.telegram.ui.Components.wl0 wl0Var2 = this.d;
            if (wl0Var2 != null && (wl0Var2.f44838a instanceof org.telegram.ui.Cells.n9) && (o9Var = ((k4) z70Var).O0) != null) {
                ArrayList arrayList = o9Var.A0;
                arrayList.clear();
                ((org.telegram.ui.Cells.n9) this.d.f44838a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i20 < size3) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) obj;
                    if (z9Var instanceof d3) {
                        d3 d3Var5 = (d3) z9Var;
                        d3Var5.f35132s += this.f34018n;
                        d3Var5.v += this.f34019r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (k4.l(this.f34014a, this.f34015b, motionEvent, this, this.f34016c, this.e, this.f34017f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(a4 a4Var) {
        a4 a4Var2 = this.f34021w;
        i4 i4Var = this.f34015b;
        if (a4Var2 != a4Var) {
            this.f34021w = a4Var;
            org.telegram.ui.Components.wl0 wl0Var = this.d;
            if (wl0Var != null) {
                removeView(wl0Var.f44838a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f34021w.d;
            if (pageBlock != null && i4Var != null) {
                int I = i4.I(pageBlock);
                this.v = I;
                s4.b1 x10 = i4Var.x(this, I);
                this.d = (org.telegram.ui.Components.wl0) x10;
                addView(x10.f44838a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f34021w.d;
        if (pageBlock2 != null && i4Var != null) {
            i4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
