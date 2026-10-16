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
    public final z70 f33718a;
    public final i4 f33719b;
    public d3 f33720c;
    public org.telegram.ui.Components.wl0 d;
    public int e;
    public int f33721f;
    public int h;
    public int f33722n;
    public int f33723r;
    public boolean f33724s;
    public int v;
    public a4 f33725w;
    public boolean f33726x;
    public CheckBoxBase f33727y;

    public a2(Context context, z70 z70Var, i4 i4Var) {
        super(context);
        this.f33718a = z70Var;
        this.f33719b = i4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        d3 d3Var;
        a4 a4Var = this.f33725w;
        if (a4Var != null) {
            d3Var = a4Var.f33738i;
        } else {
            d3Var = null;
        }
        if (d3Var == null) {
            return 0;
        }
        z70 z70Var = this.f33718a;
        i4 i4Var = this.f33719b;
        if (i4Var != null && i4Var.G) {
            int measuredWidth = getMeasuredWidth();
            z70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(15);
            b4 b4Var = this.f33725w.f33736c;
            return org.telegram.messenger.sk.B(12.0f, b4Var.f34195f, dp - b4Var.f34194c);
        }
        z70Var.getClass();
        return org.telegram.messenger.g0.D(12.0f, this.f33725w.f33736c.f34195f, (AndroidUtilities.dp(15) + this.f33725w.f33736c.f34194c) - ((int) Math.ceil(d3Var.d.getLineWidth(0))));
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
        d3 d3Var = this.f33720c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f33718a.getClass();
        int dp = AndroidUtilities.dp(18);
        if (this.f33727y != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.e - AndroidUtilities.dp(26.0f)) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        a4 a4Var = this.f33725w;
        if (a4Var != null && a4Var.f33738i != null) {
            i10 = Math.min(i10, (this.f33725w.f33738i.a() + a()) - dp);
        }
        d3 d3Var = this.f33720c;
        if (d3Var != null) {
            i10 = Math.min(i10, (d3Var.a() + d3Var.f34861s) - dp);
        }
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            View view = wl0Var.f44838a;
            if ((view instanceof g3) && (boundLeft = ((g3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f33722n + boundLeft);
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
        this.f33718a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f33725w;
        if (a4Var != null && a4Var.f33738i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f33725w.f33738i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        d3 d3Var = this.f33720c;
        if (d3Var != null) {
            i10 = Math.max(i10, d3Var.b() + d3Var.f34861s + dp);
        }
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            View view = wl0Var.f44838a;
            if ((view instanceof g3) && (boundRight = ((g3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f33722n + boundRight);
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
        d3 d3Var = this.f33720c;
        if (d3Var != null) {
            lastLineBoundRight = d3Var.c() + d3Var.f34861s;
            this.f33718a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.wl0 wl0Var = this.d;
            if (wl0Var != null) {
                View view = wl0Var.f44838a;
                if ((view instanceof g3) && (lastLineBoundRight = ((g3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f33722n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.sk.a(this);
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
        d3 d3Var = this.f33720c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f33720c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a4 a4Var;
        int i10;
        int i11;
        if (this.f33725w != null) {
            int measuredWidth = getMeasuredWidth();
            d3 d3Var = this.f33725w.f33738i;
            z70 z70Var = this.f33718a;
            if (d3Var != null) {
                canvas.save();
                i4 i4Var = this.f33719b;
                if (i4Var != null && i4Var.G) {
                    z70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(15);
                    b4 b4Var = this.f33725w.f33736c;
                    float B = org.telegram.messenger.sk.B(12.0f, b4Var.f34195f, dp - b4Var.f34194c);
                    int i12 = this.f33721f + this.h;
                    if (this.f33726x) {
                        i11 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = 0;
                    }
                    canvas.translate(B, i12 - i11);
                } else {
                    z70Var.getClass();
                    float D = org.telegram.messenger.g0.D(12.0f, this.f33725w.f33736c.f34195f, (AndroidUtilities.dp(15) + this.f33725w.f33736c.f34194c) - ((int) Math.ceil(a4Var.f33738i.d.getLineWidth(0))));
                    int i13 = this.f33721f + this.h;
                    if (this.f33726x) {
                        i10 = AndroidUtilities.dp(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(D, i13 - i10);
                }
                this.f33725w.f33738i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f33727y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f33721f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f33727y.a(canvas);
            }
            if (this.f33720c != null) {
                canvas.save();
                canvas.translate(this.e, this.f33721f);
                k4.v(z70Var, canvas, this, 0);
                this.f33720c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        d3 d3Var = this.f33720c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(k4.j(this.f33718a, this.f33719b, d3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            View view = wl0Var.f44838a;
            int i14 = this.f33722n;
            view.layout(i14, this.f33723r, view.getMeasuredWidth() + i14, this.d.f44838a.getMeasuredHeight() + this.f33723r);
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
        a4 a4Var = this.f33725w;
        int i18 = 1;
        if (a4Var != null) {
            this.f33720c = null;
            int i19 = a4Var.f33739j;
            z70 z70Var3 = this.f33718a;
            int i20 = 0;
            if (i19 == 0 && a4Var.f33736c.f34195f == 0) {
                z70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f33721f = i12;
            this.h = 0;
            b4 b4Var = this.f33725w.f33736c;
            if (b4Var.d == size && b4Var.e == SharedConfig.ivFontSize) {
                z70Var = z70Var3;
            } else {
                b4Var.d = size;
                b4Var.e = SharedConfig.ivFontSize;
                b4Var.f34194c = 0;
                int size2 = b4Var.f34193b.size();
                boolean z10 = true;
                int i21 = 0;
                while (i21 < size2) {
                    a4 a4Var2 = (a4) this.f33725w.f33736c.f34193b.get(i21);
                    String str = a4Var2.f33737f;
                    if (str != null) {
                        if (a4Var2.f33734a && "•".equalsIgnoreCase(str)) {
                            a4Var2.f33738i = null;
                        } else {
                            String str2 = a4Var2.f33737f;
                            z70Var3.getClass();
                            z70 z70Var4 = z70Var3;
                            z70Var2 = z70Var4;
                            a4Var2.f33738i = k4.q(z70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f33721f, this.f33725w, this.f33719b);
                            b4 b4Var2 = this.f33725w.f33736c;
                            b4Var2.f34194c = Math.max(b4Var2.f34194c, (int) Math.ceil(q6.d.getLineWidth(0)));
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
                if (k4.f37245n1 != null && !z10) {
                    b4 b4Var3 = this.f33725w.f33736c;
                    b4Var3.f34194c = Math.max(b4Var3.f34194c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            a4 a4Var3 = this.f33725w;
            this.f33726x = !a4Var3.f33736c.f34192a.ordered;
            if (a4Var3.f33734a) {
                if (this.f33727y == null) {
                    z70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.f33727y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.g6.hl, org.telegram.ui.ActionBar.g6.f20004z5, org.telegram.ui.ActionBar.g6.f19729k7);
                    this.f33727y.d(10);
                    this.f33727y.k(true);
                    this.f33727y.i(AndroidUtilities.dp(5.0f));
                }
                this.f33727y.f(-1, this.f33725w.f33735b, false);
            } else {
                this.f33727y = null;
            }
            int i22 = 26;
            i4 i4Var = this.f33719b;
            if (i4Var != null && i4Var.G) {
                z70Var.getClass();
                if (this.f33727y == null) {
                    i22 = 0;
                }
                this.e = AndroidUtilities.dp(i22 + 18);
            } else {
                z70Var.getClass();
                if (this.f33727y == null) {
                    i22 = 0;
                }
                int dp3 = AndroidUtilities.dp(i22 + 24);
                b4 b4Var4 = this.f33725w.f33736c;
                this.e = org.telegram.messenger.g0.D(12.0f, b4Var4.f34195f, dp3 + b4Var4.f34194c);
            }
            z70Var.getClass();
            float f7 = 18;
            int dp4 = (size - AndroidUtilities.dp(f7)) - this.e;
            if (i4Var != null && i4Var.G) {
                int dp5 = AndroidUtilities.dp(6.0f);
                b4 b4Var5 = this.f33725w.f33736c;
                dp4 -= (AndroidUtilities.dp(12.0f) * b4Var5.f34195f) + (dp5 + b4Var5.f34194c);
            }
            a4 a4Var4 = this.f33725w;
            int i23 = dp4;
            TL_iv.RichText richText = a4Var4.e;
            if (richText != null) {
                if (i4Var != null && i4Var.G) {
                    alignment = org.telegram.ui.Components.ix0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                d3 p5 = k4.p(this.f33718a, this, null, richText, i23, 0, a4Var4, alignment, 0, this.f33719b);
                this.f33720c = p5;
                if (p5 != null && p5.d.getLineCount() > 0) {
                    d3 d3Var3 = this.f33725w.f33738i;
                    if (d3Var3 != null && d3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.f33725w.f33738i.d.getLineAscent(0)) - this.f33720c.d.getLineAscent(0);
                    }
                    i13 = this.f33720c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            } else {
                TL_iv.PageBlock pageBlock = a4Var4.d;
                if (pageBlock != null) {
                    int i24 = this.e;
                    this.f33722n = i24;
                    int i25 = this.f33721f;
                    this.f33723r = i25;
                    org.telegram.ui.Components.wl0 wl0Var = this.d;
                    if (wl0Var != null) {
                        View view = wl0Var.f44838a;
                        if (view instanceof e2) {
                            float f10 = 8;
                            this.f33723r = i25 - AndroidUtilities.dp(f10);
                            if (i4Var == null || !i4Var.G) {
                                this.f33722n -= AndroidUtilities.dp(f7);
                            }
                            int dp6 = i23 + AndroidUtilities.dp(f7);
                            i15 = 0 - AndroidUtilities.dp(f10);
                            i14 = dp6;
                        } else {
                            if (!(view instanceof y1) && !(view instanceof t2) && !(view instanceof x2) && !(view instanceof u2)) {
                                if (k4.L(pageBlock)) {
                                    this.f33722n = 0;
                                    this.f33723r = 0;
                                    this.f33721f = 0;
                                    a4 a4Var5 = this.f33725w;
                                    if (a4Var5.f33739j == 0 && a4Var5.f33736c.f34195f == 0) {
                                        i16 = 0 - AndroidUtilities.dp(10);
                                    } else {
                                        i16 = 0;
                                    }
                                    i15 = i16 - AndroidUtilities.dp(8);
                                    i14 = size;
                                } else if (this.d.f44838a instanceof w2) {
                                    this.f33722n -= AndroidUtilities.dp(f7);
                                    dp2 = AndroidUtilities.dp(36);
                                } else {
                                    i14 = i23;
                                    i15 = 0;
                                }
                            } else {
                                if (i4Var == null || !i4Var.G) {
                                    this.f33722n = i24 - AndroidUtilities.dp(f7);
                                }
                                dp2 = AndroidUtilities.dp(f7);
                            }
                            i14 = dp2 + i23;
                            i15 = 0;
                        }
                        this.d.f44838a.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f44838a instanceof e2) && (d3Var = this.f33725w.f33738i) != null && d3Var.d.getLineCount() > 0 && (d3Var2 = (e2Var = (e2) this.d.f44838a).f35175c) != null && d3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.f33725w.f33738i.d.getLineAscent(0)) - e2Var.f35175c.d.getLineAscent(0);
                        }
                        a4 a4Var6 = this.f33725w;
                        if (a4Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f33724s = true;
                            this.f33723r = 0;
                            if (a4Var6.f33739j == 0 && a4Var6.f33736c.f34195f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.f44838a;
                            if (view2 instanceof d2) {
                                this.f33724s = ((d2) view2).v;
                            } else if (view2 instanceof a2) {
                                this.f33724s = ((a2) view2).f33724s;
                            }
                        }
                        if (this.f33724s && this.f33725w.f33738i != null) {
                            this.f33721f = ((this.d.f44838a.getMeasuredHeight() - this.f33725w.f33738i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.f33726x = false;
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
            if (i2.d.h(1, this.f33725w.f33736c.f34193b) == this.f33725w) {
                i17 += AndroidUtilities.dp(8);
            }
            a4 a4Var7 = this.f33725w;
            if (a4Var7.f33739j == 0 && a4Var7.f33736c.f34195f == 0) {
                i18 = AndroidUtilities.dp(10) + i17;
            } else {
                i18 = i17;
            }
            d3 d3Var4 = this.f33720c;
            if (d3Var4 != null) {
                d3Var4.f34861s = this.e;
                d3Var4.v = this.f33721f;
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
                        d3Var5.f34861s += this.f33722n;
                        d3Var5.v += this.f33723r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (k4.l(this.f33718a, this.f33719b, motionEvent, this, this.f33720c, this.e, this.f33721f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(a4 a4Var) {
        a4 a4Var2 = this.f33725w;
        i4 i4Var = this.f33719b;
        if (a4Var2 != a4Var) {
            this.f33725w = a4Var;
            org.telegram.ui.Components.wl0 wl0Var = this.d;
            if (wl0Var != null) {
                removeView(wl0Var.f44838a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f33725w.d;
            if (pageBlock != null && i4Var != null) {
                int I = i4.I(pageBlock);
                this.v = I;
                s4.b1 x10 = i4Var.x(this, I);
                this.d = (org.telegram.ui.Components.wl0) x10;
                addView(x10.f44838a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f33725w.d;
        if (pageBlock2 != null && i4Var != null) {
            i4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
