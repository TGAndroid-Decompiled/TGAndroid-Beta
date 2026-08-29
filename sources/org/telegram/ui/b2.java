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
public final class b2 extends ViewGroup implements org.telegram.ui.Cells.j9, i3 {
    public final d70 f36648a;
    public final k4 f36649b;
    public f3 f36650c;
    public org.telegram.ui.Components.vk0 d;
    public int f36651e;
    public int f36652f;
    public int h;
    public int f36653n;
    public int f36654r;
    public boolean f36655s;
    public int v;
    public c4 f36656w;
    public boolean f36657x;
    public CheckBoxBase f36658y;

    public b2(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f36648a = d70Var;
        this.f36649b = k4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        f3 f3Var;
        c4 c4Var = this.f36656w;
        if (c4Var != null) {
            f3Var = c4Var.f36986i;
        } else {
            f3Var = null;
        }
        if (f3Var == null) {
            return 0;
        }
        d70 d70Var = this.f36648a;
        k4 k4Var = this.f36649b;
        if (k4Var != null && k4Var.C) {
            int measuredWidth = getMeasuredWidth();
            d70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(15);
            d4 d4Var = this.f36656w.f36983c;
            return b.z(12.0f, d4Var.f37290f, dp - d4Var.f37288c);
        }
        d70Var.getClass();
        return org.telegram.messenger.x3.D(12.0f, this.f36656w.f36983c.f37290f, (AndroidUtilities.dp(15) + this.f36656w.f36983c.f37288c) - ((int) Math.ceil(f3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f6432a;
            if (view instanceof org.telegram.ui.Cells.j9) {
                ((org.telegram.ui.Cells.j9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        f3 f3Var = this.f36650c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f36648a.getClass();
        int dp = AndroidUtilities.dp(18);
        if (this.f36658y != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f36651e - AndroidUtilities.dp(26.0f)) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        c4 c4Var = this.f36656w;
        if (c4Var != null && c4Var.f36986i != null) {
            i10 = Math.min(i10, (this.f36656w.f36986i.a() + a()) - dp);
        }
        f3 f3Var = this.f36650c;
        if (f3Var != null) {
            i10 = Math.min(i10, (f3Var.a() + f3Var.f37974s) - dp);
        }
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f6432a;
            if ((view instanceof i3) && (boundLeft = ((i3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f36653n + boundLeft);
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
        this.f36648a.getClass();
        int dp = AndroidUtilities.dp(18);
        c4 c4Var = this.f36656w;
        if (c4Var != null && c4Var.f36986i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f36656w.f36986i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        f3 f3Var = this.f36650c;
        if (f3Var != null) {
            i10 = Math.max(i10, f3Var.b() + f3Var.f37974s + dp);
        }
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f6432a;
            if ((view instanceof i3) && (boundRight = ((i3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f36653n + boundRight);
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
        f3 f3Var = this.f36650c;
        if (f3Var != null) {
            lastLineBoundRight = f3Var.c() + f3Var.f37974s;
            this.f36648a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.vk0 vk0Var = this.d;
            if (vk0Var != null) {
                View view = vk0Var.f6432a;
                if ((view instanceof i3) && (lastLineBoundRight = ((i3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f36653n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            vk0Var.f6432a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f36650c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f36650c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        c4 c4Var;
        int i10;
        int i11;
        if (this.f36656w != null) {
            int measuredWidth = getMeasuredWidth();
            f3 f3Var = this.f36656w.f36986i;
            d70 d70Var = this.f36648a;
            if (f3Var != null) {
                canvas.save();
                k4 k4Var = this.f36649b;
                if (k4Var != null && k4Var.C) {
                    d70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(15);
                    d4 d4Var = this.f36656w.f36983c;
                    float z10 = b.z(12.0f, d4Var.f37290f, dp - d4Var.f37288c);
                    int i12 = this.f36652f + this.h;
                    if (this.f36657x) {
                        i11 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = 0;
                    }
                    canvas.translate(z10, i12 - i11);
                } else {
                    d70Var.getClass();
                    float D = org.telegram.messenger.x3.D(12.0f, this.f36656w.f36983c.f37290f, (AndroidUtilities.dp(15) + this.f36656w.f36983c.f37288c) - ((int) Math.ceil(c4Var.f36986i.d.getLineWidth(0))));
                    int i13 = this.f36652f + this.h;
                    if (this.f36657x) {
                        i10 = AndroidUtilities.dp(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(D, i13 - i10);
                }
                this.f36656w.f36986i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f36658y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f36651e - AndroidUtilities.dp(26.0f), this.f36652f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f36658y.a(canvas);
            }
            if (this.f36650c != null) {
                canvas.save();
                canvas.translate(this.f36651e, this.f36652f);
                m4.v(d70Var, canvas, this, 0);
                this.f36650c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        f3 f3Var = this.f36650c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(m4.j(this.f36648a, this.f36649b, f3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f6432a;
            int i14 = this.f36653n;
            view.layout(i14, this.f36654r, view.getMeasuredWidth() + i14, this.d.f6432a.getMeasuredHeight() + this.f36654r);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        d70 d70Var;
        TextPaint textPaint;
        d70 d70Var2;
        f3 q6;
        int i13;
        int dp;
        int dp2;
        int i14;
        int i15;
        int i16;
        f3 f3Var;
        f2 f2Var;
        f3 f3Var2;
        int i17;
        org.telegram.ui.Cells.k9 k9Var;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        c4 c4Var = this.f36656w;
        int i18 = 1;
        if (c4Var != null) {
            this.f36650c = null;
            int i19 = c4Var.f36987j;
            d70 d70Var3 = this.f36648a;
            int i20 = 0;
            if (i19 == 0 && c4Var.f36983c.f37290f == 0) {
                d70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f36652f = i12;
            this.h = 0;
            d4 d4Var = this.f36656w.f36983c;
            if (d4Var.d == size && d4Var.f37289e == SharedConfig.ivFontSize) {
                d70Var = d70Var3;
            } else {
                d4Var.d = size;
                d4Var.f37289e = SharedConfig.ivFontSize;
                d4Var.f37288c = 0;
                int size2 = d4Var.f37287b.size();
                boolean z10 = true;
                int i21 = 0;
                while (i21 < size2) {
                    c4 c4Var2 = (c4) this.f36656w.f36983c.f37287b.get(i21);
                    String str = c4Var2.f36985f;
                    if (str != null) {
                        if (c4Var2.f36981a && "•".equalsIgnoreCase(str)) {
                            c4Var2.f36986i = null;
                        } else {
                            String str2 = c4Var2.f36985f;
                            d70Var3.getClass();
                            d70 d70Var4 = d70Var3;
                            d70Var2 = d70Var4;
                            c4Var2.f36986i = m4.q(d70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f36652f, this.f36656w, this.f36649b);
                            d4 d4Var2 = this.f36656w.f36983c;
                            d4Var2.f37288c = Math.max(d4Var2.f37288c, (int) Math.ceil(q6.d.getLineWidth(0)));
                            z10 = false;
                            i21++;
                            d70Var3 = d70Var2;
                        }
                    }
                    d70Var2 = d70Var3;
                    i21++;
                    d70Var3 = d70Var2;
                }
                d70Var = d70Var3;
                if (m4.f40375j1 != null && !z10) {
                    d4 d4Var3 = this.f36656w.f36983c;
                    d4Var3.f37288c = Math.max(d4Var3.f37288c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            c4 c4Var3 = this.f36656w;
            this.f36657x = !c4Var3.f36983c.f37286a.ordered;
            if (c4Var3.f36981a) {
                if (this.f36658y == null) {
                    d70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.f36658y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.g6.hl, org.telegram.ui.ActionBar.g6.f23449z5, org.telegram.ui.ActionBar.g6.f23190k7);
                    this.f36658y.d(10);
                    this.f36658y.k(true);
                    this.f36658y.i(AndroidUtilities.dp(5.0f));
                }
                this.f36658y.f(-1, this.f36656w.f36982b, false);
            } else {
                this.f36658y = null;
            }
            int i22 = 26;
            k4 k4Var = this.f36649b;
            if (k4Var != null && k4Var.C) {
                d70Var.getClass();
                if (this.f36658y == null) {
                    i22 = 0;
                }
                this.f36651e = AndroidUtilities.dp(i22 + 18);
            } else {
                d70Var.getClass();
                if (this.f36658y == null) {
                    i22 = 0;
                }
                int dp3 = AndroidUtilities.dp(i22 + 24);
                d4 d4Var4 = this.f36656w.f36983c;
                this.f36651e = org.telegram.messenger.x3.D(12.0f, d4Var4.f37290f, dp3 + d4Var4.f37288c);
            }
            d70Var.getClass();
            float f9 = 18;
            int dp4 = (size - AndroidUtilities.dp(f9)) - this.f36651e;
            if (k4Var != null && k4Var.C) {
                int dp5 = AndroidUtilities.dp(6.0f);
                d4 d4Var5 = this.f36656w.f36983c;
                dp4 -= (AndroidUtilities.dp(12.0f) * d4Var5.f37290f) + (dp5 + d4Var5.f37288c);
            }
            c4 c4Var4 = this.f36656w;
            int i23 = dp4;
            TL_iv.RichText richText = c4Var4.f36984e;
            if (richText != null) {
                if (k4Var != null && k4Var.C) {
                    alignment = org.telegram.ui.Components.bw0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                f3 p10 = m4.p(this.f36648a, this, null, richText, i23, 0, c4Var4, alignment, 0, this.f36649b);
                this.f36650c = p10;
                if (p10 != null && p10.d.getLineCount() > 0) {
                    f3 f3Var3 = this.f36656w.f36986i;
                    if (f3Var3 != null && f3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.f36656w.f36986i.d.getLineAscent(0)) - this.f36650c.d.getLineAscent(0);
                    }
                    i13 = this.f36650c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            } else {
                TL_iv.PageBlock pageBlock = c4Var4.d;
                if (pageBlock != null) {
                    int i24 = this.f36651e;
                    this.f36653n = i24;
                    int i25 = this.f36652f;
                    this.f36654r = i25;
                    org.telegram.ui.Components.vk0 vk0Var = this.d;
                    if (vk0Var != null) {
                        View view = vk0Var.f6432a;
                        if (view instanceof f2) {
                            float f10 = 8;
                            this.f36654r = i25 - AndroidUtilities.dp(f10);
                            if (k4Var == null || !k4Var.C) {
                                this.f36653n -= AndroidUtilities.dp(f9);
                            }
                            int dp6 = i23 + AndroidUtilities.dp(f9);
                            i15 = 0 - AndroidUtilities.dp(f10);
                            i14 = dp6;
                        } else {
                            if (!(view instanceof z1) && !(view instanceof v2) && !(view instanceof z2) && !(view instanceof w2)) {
                                if (m4.L(pageBlock)) {
                                    this.f36653n = 0;
                                    this.f36654r = 0;
                                    this.f36652f = 0;
                                    c4 c4Var5 = this.f36656w;
                                    if (c4Var5.f36987j == 0 && c4Var5.f36983c.f37290f == 0) {
                                        i16 = 0 - AndroidUtilities.dp(10);
                                    } else {
                                        i16 = 0;
                                    }
                                    i15 = i16 - AndroidUtilities.dp(8);
                                    i14 = size;
                                } else if (this.d.f6432a instanceof y2) {
                                    this.f36653n -= AndroidUtilities.dp(f9);
                                    dp2 = AndroidUtilities.dp(36);
                                } else {
                                    i14 = i23;
                                    i15 = 0;
                                }
                            } else {
                                if (k4Var == null || !k4Var.C) {
                                    this.f36653n = i24 - AndroidUtilities.dp(f9);
                                }
                                dp2 = AndroidUtilities.dp(f9);
                            }
                            i14 = dp2 + i23;
                            i15 = 0;
                        }
                        this.d.f6432a.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f6432a instanceof f2) && (f3Var = this.f36656w.f36986i) != null && f3Var.d.getLineCount() > 0 && (f3Var2 = (f2Var = (f2) this.d.f6432a).f37960c) != null && f3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.f36656w.f36986i.d.getLineAscent(0)) - f2Var.f37960c.d.getLineAscent(0);
                        }
                        c4 c4Var6 = this.f36656w;
                        if (c4Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f36655s = true;
                            this.f36654r = 0;
                            if (c4Var6.f36987j == 0 && c4Var6.f36983c.f37290f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.f6432a;
                            if (view2 instanceof e2) {
                                this.f36655s = ((e2) view2).v;
                            } else if (view2 instanceof b2) {
                                this.f36655s = ((b2) view2).f36655s;
                            }
                        }
                        if (this.f36655s && this.f36656w.f36986i != null) {
                            this.f36652f = ((this.d.f6432a.getMeasuredHeight() - this.f36656w.f36986i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.f36657x = false;
                        }
                        i13 = this.d.f6432a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            }
            if (j7.l1.i(1, this.f36656w.f36983c.f37287b) == this.f36656w) {
                i17 += AndroidUtilities.dp(8);
            }
            c4 c4Var7 = this.f36656w;
            if (c4Var7.f36987j == 0 && c4Var7.f36983c.f37290f == 0) {
                i18 = AndroidUtilities.dp(10) + i17;
            } else {
                i18 = i17;
            }
            f3 f3Var4 = this.f36650c;
            if (f3Var4 != null) {
                f3Var4.f37974s = this.f36651e;
                f3Var4.v = this.f36652f;
            }
            org.telegram.ui.Components.vk0 vk0Var2 = this.d;
            if (vk0Var2 != null && (vk0Var2.f6432a instanceof org.telegram.ui.Cells.j9) && (k9Var = ((m4) d70Var).K0) != null) {
                ArrayList arrayList = k9Var.F0;
                arrayList.clear();
                ((org.telegram.ui.Cells.j9) this.d.f6432a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i20 < size3) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) obj;
                    if (v9Var instanceof f3) {
                        f3 f3Var5 = (f3) v9Var;
                        f3Var5.f37974s += this.f36653n;
                        f3Var5.v += this.f36654r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (m4.l(this.f36648a, this.f36649b, motionEvent, this, this.f36650c, this.f36651e, this.f36652f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(c4 c4Var) {
        c4 c4Var2 = this.f36656w;
        k4 k4Var = this.f36649b;
        if (c4Var2 != c4Var) {
            this.f36656w = c4Var;
            org.telegram.ui.Components.vk0 vk0Var = this.d;
            if (vk0Var != null) {
                removeView(vk0Var.f6432a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f36656w.d;
            if (pageBlock != null && k4Var != null) {
                int I = k4.I(pageBlock);
                this.v = I;
                f2.n1 x4 = k4Var.x(this, I);
                this.d = (org.telegram.ui.Components.vk0) x4;
                addView(x4.f6432a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f36656w.d;
        if (pageBlock2 != null && k4Var != null) {
            k4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
