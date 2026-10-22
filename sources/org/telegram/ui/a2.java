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
    public final b70 f35249a;
    public final j4 f35250b;
    public d3 f35251c;
    public org.telegram.ui.Components.tl0 d;
    public int e;
    public int f35252f;
    public int h;
    public int f35253n;
    public int f35254r;
    public boolean f35255s;
    public int v;
    public a4 f35256w;
    public boolean f35257x;
    public CheckBoxBase f35258y;

    public a2(Context context, b70 b70Var, j4 j4Var) {
        super(context);
        this.f35249a = b70Var;
        this.f35250b = j4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        d3 d3Var;
        a4 a4Var = this.f35256w;
        if (a4Var != null) {
            d3Var = a4Var.f35273i;
        } else {
            d3Var = null;
        }
        if (d3Var == null) {
            return 0;
        }
        b70 b70Var = this.f35249a;
        j4 j4Var = this.f35250b;
        if (j4Var != null && j4Var.G) {
            int measuredWidth = getMeasuredWidth();
            b70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(15);
            b4 b4Var = this.f35256w.f35271c;
            return org.telegram.messenger.ok.B(12.0f, b4Var.f35499f, dp - b4Var.f35498c);
        }
        b70Var.getClass();
        return org.telegram.messenger.g0.D(12.0f, this.f35256w.f35271c.f35499f, (AndroidUtilities.dp(15) + this.f35256w.f35271c.f35498c) - ((int) Math.ceil(d3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.tl0 tl0Var = this.d;
        if (tl0Var != null) {
            View view = tl0Var.f45920a;
            if (view instanceof org.telegram.ui.Cells.m9) {
                ((org.telegram.ui.Cells.m9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        d3 d3Var = this.f35251c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f35249a.getClass();
        int dp = AndroidUtilities.dp(18);
        if (this.f35258y != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.e - AndroidUtilities.dp(26.0f)) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        a4 a4Var = this.f35256w;
        if (a4Var != null && a4Var.f35273i != null) {
            i10 = Math.min(i10, (this.f35256w.f35273i.a() + a()) - dp);
        }
        d3 d3Var = this.f35251c;
        if (d3Var != null) {
            i10 = Math.min(i10, (d3Var.a() + d3Var.f36245s) - dp);
        }
        org.telegram.ui.Components.tl0 tl0Var = this.d;
        if (tl0Var != null) {
            View view = tl0Var.f45920a;
            if ((view instanceof g3) && (boundLeft = ((g3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f35253n + boundLeft);
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
        this.f35249a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f35256w;
        if (a4Var != null && a4Var.f35273i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f35256w.f35273i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        d3 d3Var = this.f35251c;
        if (d3Var != null) {
            i10 = Math.max(i10, d3Var.b() + d3Var.f36245s + dp);
        }
        org.telegram.ui.Components.tl0 tl0Var = this.d;
        if (tl0Var != null) {
            View view = tl0Var.f45920a;
            if ((view instanceof g3) && (boundRight = ((g3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f35253n + boundRight);
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
        d3 d3Var = this.f35251c;
        if (d3Var != null) {
            lastLineBoundRight = d3Var.c() + d3Var.f36245s;
            this.f35249a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.tl0 tl0Var = this.d;
            if (tl0Var != null) {
                View view = tl0Var.f45920a;
                if ((view instanceof g3) && (lastLineBoundRight = ((g3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f35253n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ok.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.tl0 tl0Var = this.d;
        if (tl0Var != null) {
            tl0Var.f45920a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f35251c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f35251c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        a4 a4Var;
        int i10;
        int i11;
        if (this.f35256w != null) {
            int measuredWidth = getMeasuredWidth();
            d3 d3Var = this.f35256w.f35273i;
            b70 b70Var = this.f35249a;
            if (d3Var != null) {
                canvas.save();
                j4 j4Var = this.f35250b;
                if (j4Var != null && j4Var.G) {
                    b70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(15);
                    b4 b4Var = this.f35256w.f35271c;
                    float B = org.telegram.messenger.ok.B(12.0f, b4Var.f35499f, dp - b4Var.f35498c);
                    int i12 = this.f35252f + this.h;
                    if (this.f35257x) {
                        i11 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = 0;
                    }
                    canvas.translate(B, i12 - i11);
                } else {
                    b70Var.getClass();
                    float D = org.telegram.messenger.g0.D(12.0f, this.f35256w.f35271c.f35499f, (AndroidUtilities.dp(15) + this.f35256w.f35271c.f35498c) - ((int) Math.ceil(a4Var.f35273i.d.getLineWidth(0))));
                    int i13 = this.f35252f + this.h;
                    if (this.f35257x) {
                        i10 = AndroidUtilities.dp(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(D, i13 - i10);
                }
                this.f35256w.f35273i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f35258y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f35252f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f35258y.a(canvas);
            }
            if (this.f35251c != null) {
                canvas.save();
                canvas.translate(this.e, this.f35252f);
                l4.v(b70Var, canvas, this, 0);
                this.f35251c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        d3 d3Var = this.f35251c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.j(this.f35249a, this.f35250b, d3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.tl0 tl0Var = this.d;
        if (tl0Var != null) {
            View view = tl0Var.f45920a;
            int i14 = this.f35253n;
            view.layout(i14, this.f35254r, view.getMeasuredWidth() + i14, this.d.f45920a.getMeasuredHeight() + this.f35254r);
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
        a4 a4Var = this.f35256w;
        int i18 = 1;
        if (a4Var != null) {
            this.f35251c = null;
            int i19 = a4Var.f35274j;
            b70 b70Var3 = this.f35249a;
            int i20 = 0;
            if (i19 == 0 && a4Var.f35271c.f35499f == 0) {
                b70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f35252f = i12;
            this.h = 0;
            b4 b4Var = this.f35256w.f35271c;
            if (b4Var.d == size && b4Var.e == SharedConfig.ivFontSize) {
                b70Var = b70Var3;
            } else {
                b4Var.d = size;
                b4Var.e = SharedConfig.ivFontSize;
                b4Var.f35498c = 0;
                int size2 = b4Var.f35497b.size();
                boolean z10 = true;
                int i21 = 0;
                while (i21 < size2) {
                    a4 a4Var2 = (a4) this.f35256w.f35271c.f35497b.get(i21);
                    String str = a4Var2.f35272f;
                    if (str != null) {
                        if (a4Var2.f35269a && "•".equalsIgnoreCase(str)) {
                            a4Var2.f35273i = null;
                        } else {
                            String str2 = a4Var2.f35272f;
                            b70Var3.getClass();
                            b70 b70Var4 = b70Var3;
                            b70Var2 = b70Var4;
                            a4Var2.f35273i = l4.q(b70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f35252f, this.f35256w, this.f35250b);
                            b4 b4Var2 = this.f35256w.f35271c;
                            b4Var2.f35498c = Math.max(b4Var2.f35498c, (int) Math.ceil(q6.d.getLineWidth(0)));
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
                if (l4.f38749n1 != null && !z10) {
                    b4 b4Var3 = this.f35256w.f35271c;
                    b4Var3.f35498c = Math.max(b4Var3.f35498c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            a4 a4Var3 = this.f35256w;
            this.f35257x = !a4Var3.f35271c.f35496a.ordered;
            if (a4Var3.f35269a) {
                if (this.f35258y == null) {
                    b70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.f35258y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.h6.hl, org.telegram.ui.ActionBar.h6.f21397z5, org.telegram.ui.ActionBar.h6.f21121k7);
                    this.f35258y.d(10);
                    this.f35258y.k(true);
                    this.f35258y.i(AndroidUtilities.dp(5.0f));
                }
                this.f35258y.f(-1, this.f35256w.f35270b, false);
            } else {
                this.f35258y = null;
            }
            int i22 = 26;
            j4 j4Var = this.f35250b;
            if (j4Var != null && j4Var.G) {
                b70Var.getClass();
                if (this.f35258y == null) {
                    i22 = 0;
                }
                this.e = AndroidUtilities.dp(i22 + 18);
            } else {
                b70Var.getClass();
                if (this.f35258y == null) {
                    i22 = 0;
                }
                int dp3 = AndroidUtilities.dp(i22 + 24);
                b4 b4Var4 = this.f35256w.f35271c;
                this.e = org.telegram.messenger.g0.D(12.0f, b4Var4.f35499f, dp3 + b4Var4.f35498c);
            }
            b70Var.getClass();
            float f7 = 18;
            int dp4 = (size - AndroidUtilities.dp(f7)) - this.e;
            if (j4Var != null && j4Var.G) {
                int dp5 = AndroidUtilities.dp(6.0f);
                b4 b4Var5 = this.f35256w.f35271c;
                dp4 -= (AndroidUtilities.dp(12.0f) * b4Var5.f35499f) + (dp5 + b4Var5.f35498c);
            }
            a4 a4Var4 = this.f35256w;
            int i23 = dp4;
            TL_iv.RichText richText = a4Var4.e;
            if (richText != null) {
                if (j4Var != null && j4Var.G) {
                    alignment = org.telegram.ui.Components.fx0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                d3 p5 = l4.p(this.f35249a, this, null, richText, i23, 0, a4Var4, alignment, 0, this.f35250b);
                this.f35251c = p5;
                if (p5 != null && p5.d.getLineCount() > 0) {
                    d3 d3Var3 = this.f35256w.f35273i;
                    if (d3Var3 != null && d3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.f35256w.f35273i.d.getLineAscent(0)) - this.f35251c.d.getLineAscent(0);
                    }
                    i13 = this.f35251c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            } else {
                TL_iv.PageBlock pageBlock = a4Var4.d;
                if (pageBlock != null) {
                    int i24 = this.e;
                    this.f35253n = i24;
                    int i25 = this.f35252f;
                    this.f35254r = i25;
                    org.telegram.ui.Components.tl0 tl0Var = this.d;
                    if (tl0Var != null) {
                        View view = tl0Var.f45920a;
                        if (view instanceof e2) {
                            float f10 = 8;
                            this.f35254r = i25 - AndroidUtilities.dp(f10);
                            if (j4Var == null || !j4Var.G) {
                                this.f35253n -= AndroidUtilities.dp(f7);
                            }
                            int dp6 = i23 + AndroidUtilities.dp(f7);
                            i15 = 0 - AndroidUtilities.dp(f10);
                            i14 = dp6;
                        } else {
                            if (!(view instanceof y1) && !(view instanceof t2) && !(view instanceof x2) && !(view instanceof u2)) {
                                if (l4.L(pageBlock)) {
                                    this.f35253n = 0;
                                    this.f35254r = 0;
                                    this.f35252f = 0;
                                    a4 a4Var5 = this.f35256w;
                                    if (a4Var5.f35274j == 0 && a4Var5.f35271c.f35499f == 0) {
                                        i16 = 0 - AndroidUtilities.dp(10);
                                    } else {
                                        i16 = 0;
                                    }
                                    i15 = i16 - AndroidUtilities.dp(8);
                                    i14 = size;
                                } else if (this.d.f45920a instanceof w2) {
                                    this.f35253n -= AndroidUtilities.dp(f7);
                                    dp2 = AndroidUtilities.dp(36);
                                } else {
                                    i14 = i23;
                                    i15 = 0;
                                }
                            } else {
                                if (j4Var == null || !j4Var.G) {
                                    this.f35253n = i24 - AndroidUtilities.dp(f7);
                                }
                                dp2 = AndroidUtilities.dp(f7);
                            }
                            i14 = dp2 + i23;
                            i15 = 0;
                        }
                        this.d.f45920a.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f45920a instanceof e2) && (d3Var = this.f35256w.f35273i) != null && d3Var.d.getLineCount() > 0 && (d3Var2 = (e2Var = (e2) this.d.f45920a).f36530c) != null && d3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.f35256w.f35273i.d.getLineAscent(0)) - e2Var.f36530c.d.getLineAscent(0);
                        }
                        a4 a4Var6 = this.f35256w;
                        if (a4Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f35255s = true;
                            this.f35254r = 0;
                            if (a4Var6.f35274j == 0 && a4Var6.f35271c.f35499f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.f45920a;
                            if (view2 instanceof d2) {
                                this.f35255s = ((d2) view2).v;
                            } else if (view2 instanceof a2) {
                                this.f35255s = ((a2) view2).f35255s;
                            }
                        }
                        if (this.f35255s && this.f35256w.f35273i != null) {
                            this.f35252f = ((this.d.f45920a.getMeasuredHeight() - this.f35256w.f35273i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.f35257x = false;
                        }
                        i13 = this.d.f45920a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            }
            if (i2.e.h(1, this.f35256w.f35271c.f35497b) == this.f35256w) {
                i17 += AndroidUtilities.dp(8);
            }
            a4 a4Var7 = this.f35256w;
            if (a4Var7.f35274j == 0 && a4Var7.f35271c.f35499f == 0) {
                i18 = AndroidUtilities.dp(10) + i17;
            } else {
                i18 = i17;
            }
            d3 d3Var4 = this.f35251c;
            if (d3Var4 != null) {
                d3Var4.f36245s = this.e;
                d3Var4.v = this.f35252f;
            }
            org.telegram.ui.Components.tl0 tl0Var2 = this.d;
            if (tl0Var2 != null && (tl0Var2.f45920a instanceof org.telegram.ui.Cells.m9) && (n9Var = ((l4) b70Var).O0) != null) {
                ArrayList arrayList = n9Var.A0;
                arrayList.clear();
                ((org.telegram.ui.Cells.m9) this.d.f45920a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i20 < size3) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) obj;
                    if (y9Var instanceof d3) {
                        d3 d3Var5 = (d3) y9Var;
                        d3Var5.f36245s += this.f35253n;
                        d3Var5.v += this.f35254r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (l4.l(this.f35249a, this.f35250b, motionEvent, this, this.f35251c, this.e, this.f35252f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(a4 a4Var) {
        a4 a4Var2 = this.f35256w;
        j4 j4Var = this.f35250b;
        if (a4Var2 != a4Var) {
            this.f35256w = a4Var;
            org.telegram.ui.Components.tl0 tl0Var = this.d;
            if (tl0Var != null) {
                removeView(tl0Var.f45920a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f35256w.d;
            if (pageBlock != null && j4Var != null) {
                int I = j4.I(pageBlock);
                this.v = I;
                s4.b1 x10 = j4Var.x(this, I);
                this.d = (org.telegram.ui.Components.tl0) x10;
                addView(x10.f45920a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f35256w.d;
        if (pageBlock2 != null && j4Var != null) {
            j4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
