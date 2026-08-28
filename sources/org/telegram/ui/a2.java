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
public final class a2 extends ViewGroup implements org.telegram.ui.Cells.m9, h3 {
    public final a70 f36331a;
    public final j4 f36332b;
    public e3 f36333c;
    public org.telegram.ui.Components.ik0 d;
    public int f36334e;
    public int f36335f;
    public int h;
    public int f36336n;
    public int f36337r;
    public boolean f36338s;
    public int v;
    public b4 f36339w;
    public boolean f36340x;
    public CheckBoxBase f36341y;

    public a2(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.f36331a = a70Var;
        this.f36332b = j4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        e3 e3Var;
        b4 b4Var = this.f36339w;
        if (b4Var != null) {
            e3Var = b4Var.f36630i;
        } else {
            e3Var = null;
        }
        if (e3Var == null) {
            return 0;
        }
        a70 a70Var = this.f36331a;
        j4 j4Var = this.f36332b;
        if (j4Var != null && j4Var.C) {
            int measuredWidth = getMeasuredWidth();
            a70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(15);
            c4 c4Var = this.f36339w.f36627c;
            return org.telegram.messenger.ll.A(12.0f, c4Var.f37058f, dp - c4Var.f37056c);
        }
        a70Var.getClass();
        return org.telegram.messenger.l0.D(12.0f, this.f36339w.f36627c.f37058f, (AndroidUtilities.dp(15) + this.f36339w.f36627c.f37056c) - ((int) Math.ceil(e3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.ik0 ik0Var = this.d;
        if (ik0Var != null) {
            View view = ik0Var.f5501a;
            if (view instanceof org.telegram.ui.Cells.m9) {
                ((org.telegram.ui.Cells.m9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        e3 e3Var = this.f36333c;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i9;
        int boundLeft;
        this.f36331a.getClass();
        int dp = AndroidUtilities.dp(18);
        if (this.f36341y != null) {
            i9 = Math.min(Integer.MAX_VALUE, (this.f36334e - AndroidUtilities.dp(26.0f)) - dp);
        } else {
            i9 = Integer.MAX_VALUE;
        }
        b4 b4Var = this.f36339w;
        if (b4Var != null && b4Var.f36630i != null) {
            i9 = Math.min(i9, (this.f36339w.f36630i.a() + a()) - dp);
        }
        e3 e3Var = this.f36333c;
        if (e3Var != null) {
            i9 = Math.min(i9, (e3Var.a() + e3Var.f37805s) - dp);
        }
        org.telegram.ui.Components.ik0 ik0Var = this.d;
        if (ik0Var != null) {
            View view = ik0Var.f5501a;
            if ((view instanceof h3) && (boundLeft = ((h3) view).getBoundLeft()) != -1) {
                i9 = Math.min(i9, this.f36336n + boundLeft);
            }
        }
        if (i9 == Integer.MAX_VALUE) {
            return -1;
        }
        return i9;
    }

    @Override
    public int getBoundRight() {
        int i9;
        int boundRight;
        this.f36331a.getClass();
        int dp = AndroidUtilities.dp(18);
        b4 b4Var = this.f36339w;
        if (b4Var != null && b4Var.f36630i != null) {
            i9 = Math.max(Integer.MIN_VALUE, this.f36339w.f36630i.b() + a() + dp);
        } else {
            i9 = Integer.MIN_VALUE;
        }
        e3 e3Var = this.f36333c;
        if (e3Var != null) {
            i9 = Math.max(i9, e3Var.b() + e3Var.f37805s + dp);
        }
        org.telegram.ui.Components.ik0 ik0Var = this.d;
        if (ik0Var != null) {
            View view = ik0Var.f5501a;
            if ((view instanceof h3) && (boundRight = ((h3) view).getBoundRight()) != -1) {
                i9 = Math.max(i9, this.f36336n + boundRight);
            }
        }
        if (i9 == Integer.MIN_VALUE) {
            return -1;
        }
        return i9;
    }

    @Override
    public int getLastLineBoundRight() {
        int lastLineBoundRight;
        int i9;
        e3 e3Var = this.f36333c;
        if (e3Var != null) {
            lastLineBoundRight = e3Var.c() + e3Var.f37805s;
            this.f36331a.getClass();
            i9 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.ik0 ik0Var = this.d;
            if (ik0Var != null) {
                View view = ik0Var.f5501a;
                if ((view instanceof h3) && (lastLineBoundRight = ((h3) view).getLastLineBoundRight()) != -1) {
                    i9 = this.f36336n;
                }
            }
            return -1;
        }
        return i9 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ll.b(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.ik0 ik0Var = this.d;
        if (ik0Var != null) {
            ik0Var.f5501a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.f36333c;
        if (e3Var != null) {
            e3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.f36333c;
        if (e3Var != null) {
            e3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        b4 b4Var;
        int i9;
        int i10;
        if (this.f36339w != null) {
            int measuredWidth = getMeasuredWidth();
            e3 e3Var = this.f36339w.f36630i;
            a70 a70Var = this.f36331a;
            if (e3Var != null) {
                canvas.save();
                j4 j4Var = this.f36332b;
                if (j4Var != null && j4Var.C) {
                    a70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(15);
                    c4 c4Var = this.f36339w.f36627c;
                    float A = org.telegram.messenger.ll.A(12.0f, c4Var.f37058f, dp - c4Var.f37056c);
                    int i11 = this.f36335f + this.h;
                    if (this.f36340x) {
                        i10 = AndroidUtilities.dp(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(A, i11 - i10);
                } else {
                    a70Var.getClass();
                    float D = org.telegram.messenger.l0.D(12.0f, this.f36339w.f36627c.f37058f, (AndroidUtilities.dp(15) + this.f36339w.f36627c.f37056c) - ((int) Math.ceil(b4Var.f36630i.d.getLineWidth(0))));
                    int i12 = this.f36335f + this.h;
                    if (this.f36340x) {
                        i9 = AndroidUtilities.dp(1.0f);
                    } else {
                        i9 = 0;
                    }
                    canvas.translate(D, i12 - i9);
                }
                this.f36339w.f36630i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f36341y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f36334e - AndroidUtilities.dp(26.0f), this.f36335f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f36341y.a(canvas);
            }
            if (this.f36333c != null) {
                canvas.save();
                canvas.translate(this.f36334e, this.f36335f);
                l4.v(a70Var, canvas, this, 0);
                this.f36333c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        e3 e3Var = this.f36333c;
        if (e3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.j(this.f36331a, this.f36332b, e3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        org.telegram.ui.Components.ik0 ik0Var = this.d;
        if (ik0Var != null) {
            View view = ik0Var.f5501a;
            int i13 = this.f36336n;
            view.layout(i13, this.f36337r, view.getMeasuredWidth() + i13, this.d.f5501a.getMeasuredHeight() + this.f36337r);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        a70 a70Var;
        TextPaint textPaint;
        a70 a70Var2;
        e3 q10;
        int i12;
        int dp;
        int dp2;
        int i13;
        int i14;
        int i15;
        e3 e3Var;
        e2 e2Var;
        e3 e3Var2;
        int i16;
        org.telegram.ui.Cells.n9 n9Var;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i9);
        b4 b4Var = this.f36339w;
        int i17 = 1;
        if (b4Var != null) {
            this.f36333c = null;
            int i18 = b4Var.f36631j;
            a70 a70Var3 = this.f36331a;
            int i19 = 0;
            if (i18 == 0 && b4Var.f36627c.f37058f == 0) {
                a70Var3.getClass();
                i11 = AndroidUtilities.dp(10);
            } else {
                i11 = 0;
            }
            this.f36335f = i11;
            this.h = 0;
            c4 c4Var = this.f36339w.f36627c;
            if (c4Var.d == size && c4Var.f37057e == SharedConfig.ivFontSize) {
                a70Var = a70Var3;
            } else {
                c4Var.d = size;
                c4Var.f37057e = SharedConfig.ivFontSize;
                c4Var.f37056c = 0;
                int size2 = c4Var.f37055b.size();
                boolean z10 = true;
                int i20 = 0;
                while (i20 < size2) {
                    b4 b4Var2 = (b4) this.f36339w.f36627c.f37055b.get(i20);
                    String str = b4Var2.f36629f;
                    if (str != null) {
                        if (b4Var2.f36625a && "•".equalsIgnoreCase(str)) {
                            b4Var2.f36630i = null;
                        } else {
                            String str2 = b4Var2.f36629f;
                            a70Var3.getClass();
                            a70 a70Var4 = a70Var3;
                            a70Var2 = a70Var4;
                            b4Var2.f36630i = l4.q(a70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f36335f, this.f36339w, this.f36332b);
                            c4 c4Var2 = this.f36339w.f36627c;
                            c4Var2.f37056c = Math.max(c4Var2.f37056c, (int) Math.ceil(q10.d.getLineWidth(0)));
                            z10 = false;
                            i20++;
                            a70Var3 = a70Var2;
                        }
                    }
                    a70Var2 = a70Var3;
                    i20++;
                    a70Var3 = a70Var2;
                }
                a70Var = a70Var3;
                if (l4.f39997j1 != null && !z10) {
                    c4 c4Var3 = this.f36339w.f36627c;
                    c4Var3.f37056c = Math.max(c4Var3.f37056c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            b4 b4Var3 = this.f36339w;
            this.f36340x = !b4Var3.f36627c.f37054a.ordered;
            if (b4Var3.f36625a) {
                if (this.f36341y == null) {
                    a70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.f36341y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.f6.hl, org.telegram.ui.ActionBar.f6.f23385z5, org.telegram.ui.ActionBar.f6.f23128k7);
                    this.f36341y.d(10);
                    this.f36341y.k(true);
                    this.f36341y.i(AndroidUtilities.dp(5.0f));
                }
                this.f36341y.f(-1, this.f36339w.f36626b, false);
            } else {
                this.f36341y = null;
            }
            int i21 = 26;
            j4 j4Var = this.f36332b;
            if (j4Var != null && j4Var.C) {
                a70Var.getClass();
                if (this.f36341y == null) {
                    i21 = 0;
                }
                this.f36334e = AndroidUtilities.dp(i21 + 18);
            } else {
                a70Var.getClass();
                if (this.f36341y == null) {
                    i21 = 0;
                }
                int dp3 = AndroidUtilities.dp(i21 + 24);
                c4 c4Var4 = this.f36339w.f36627c;
                this.f36334e = org.telegram.messenger.l0.D(12.0f, c4Var4.f37058f, dp3 + c4Var4.f37056c);
            }
            a70Var.getClass();
            float f10 = 18;
            int dp4 = (size - AndroidUtilities.dp(f10)) - this.f36334e;
            if (j4Var != null && j4Var.C) {
                int dp5 = AndroidUtilities.dp(6.0f);
                c4 c4Var5 = this.f36339w.f36627c;
                dp4 -= (AndroidUtilities.dp(12.0f) * c4Var5.f37058f) + (dp5 + c4Var5.f37056c);
            }
            b4 b4Var4 = this.f36339w;
            int i22 = dp4;
            TL_iv.RichText richText = b4Var4.f36628e;
            if (richText != null) {
                if (j4Var != null && j4Var.C) {
                    alignment = org.telegram.ui.Components.rv0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                e3 p6 = l4.p(this.f36331a, this, null, richText, i22, 0, b4Var4, alignment, 0, this.f36332b);
                this.f36333c = p6;
                if (p6 != null && p6.d.getLineCount() > 0) {
                    e3 e3Var3 = this.f36339w.f36630i;
                    if (e3Var3 != null && e3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.f36339w.f36630i.d.getLineAscent(0)) - this.f36333c.d.getLineAscent(0);
                    }
                    i12 = this.f36333c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i16 = dp + i12;
                }
                i16 = 0;
            } else {
                TL_iv.PageBlock pageBlock = b4Var4.d;
                if (pageBlock != null) {
                    int i23 = this.f36334e;
                    this.f36336n = i23;
                    int i24 = this.f36335f;
                    this.f36337r = i24;
                    org.telegram.ui.Components.ik0 ik0Var = this.d;
                    if (ik0Var != null) {
                        View view = ik0Var.f5501a;
                        if (view instanceof e2) {
                            float f11 = 8;
                            this.f36337r = i24 - AndroidUtilities.dp(f11);
                            if (j4Var == null || !j4Var.C) {
                                this.f36336n -= AndroidUtilities.dp(f10);
                            }
                            int dp6 = i22 + AndroidUtilities.dp(f10);
                            i14 = 0 - AndroidUtilities.dp(f11);
                            i13 = dp6;
                        } else {
                            if (!(view instanceof y1) && !(view instanceof u2) && !(view instanceof y2) && !(view instanceof v2)) {
                                if (l4.L(pageBlock)) {
                                    this.f36336n = 0;
                                    this.f36337r = 0;
                                    this.f36335f = 0;
                                    b4 b4Var5 = this.f36339w;
                                    if (b4Var5.f36631j == 0 && b4Var5.f36627c.f37058f == 0) {
                                        i15 = 0 - AndroidUtilities.dp(10);
                                    } else {
                                        i15 = 0;
                                    }
                                    i14 = i15 - AndroidUtilities.dp(8);
                                    i13 = size;
                                } else if (this.d.f5501a instanceof x2) {
                                    this.f36336n -= AndroidUtilities.dp(f10);
                                    dp2 = AndroidUtilities.dp(36);
                                } else {
                                    i13 = i22;
                                    i14 = 0;
                                }
                            } else {
                                if (j4Var == null || !j4Var.C) {
                                    this.f36336n = i23 - AndroidUtilities.dp(f10);
                                }
                                dp2 = AndroidUtilities.dp(f10);
                            }
                            i13 = dp2 + i22;
                            i14 = 0;
                        }
                        this.d.f5501a.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f5501a instanceof e2) && (e3Var = this.f36339w.f36630i) != null && e3Var.d.getLineCount() > 0 && (e3Var2 = (e2Var = (e2) this.d.f5501a).f37792c) != null && e3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.f36339w.f36630i.d.getLineAscent(0)) - e2Var.f37792c.d.getLineAscent(0);
                        }
                        b4 b4Var6 = this.f36339w;
                        if (b4Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f36338s = true;
                            this.f36337r = 0;
                            if (b4Var6.f36631j == 0 && b4Var6.f36627c.f37058f == 0) {
                                i14 -= AndroidUtilities.dp(10);
                            }
                            i14 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.f5501a;
                            if (view2 instanceof d2) {
                                this.f36338s = ((d2) view2).v;
                            } else if (view2 instanceof a2) {
                                this.f36338s = ((a2) view2).f36338s;
                            }
                        }
                        if (this.f36338s && this.f36339w.f36630i != null) {
                            this.f36335f = ((this.d.f5501a.getMeasuredHeight() - this.f36339w.f36630i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.f36340x = false;
                        }
                        i12 = this.d.f5501a.getMeasuredHeight() + i14;
                    } else {
                        i12 = 0;
                    }
                    dp = AndroidUtilities.dp(8);
                    i16 = dp + i12;
                }
                i16 = 0;
            }
            if (j3.r0.j(1, this.f36339w.f36627c.f37055b) == this.f36339w) {
                i16 += AndroidUtilities.dp(8);
            }
            b4 b4Var7 = this.f36339w;
            if (b4Var7.f36631j == 0 && b4Var7.f36627c.f37058f == 0) {
                i17 = AndroidUtilities.dp(10) + i16;
            } else {
                i17 = i16;
            }
            e3 e3Var4 = this.f36333c;
            if (e3Var4 != null) {
                e3Var4.f37805s = this.f36334e;
                e3Var4.v = this.f36335f;
            }
            org.telegram.ui.Components.ik0 ik0Var2 = this.d;
            if (ik0Var2 != null && (ik0Var2.f5501a instanceof org.telegram.ui.Cells.m9) && (n9Var = ((l4) a70Var).K0) != null) {
                ArrayList arrayList = n9Var.F0;
                arrayList.clear();
                ((org.telegram.ui.Cells.m9) this.d.f5501a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i19 < size3) {
                    Object obj = arrayList.get(i19);
                    i19++;
                    org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) obj;
                    if (y9Var instanceof e3) {
                        e3 e3Var5 = (e3) y9Var;
                        e3Var5.f37805s += this.f36336n;
                        e3Var5.v += this.f36337r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i17);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (l4.l(this.f36331a, this.f36332b, motionEvent, this, this.f36333c, this.f36334e, this.f36335f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(b4 b4Var) {
        b4 b4Var2 = this.f36339w;
        j4 j4Var = this.f36332b;
        if (b4Var2 != b4Var) {
            this.f36339w = b4Var;
            org.telegram.ui.Components.ik0 ik0Var = this.d;
            if (ik0Var != null) {
                removeView(ik0Var.f5501a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f36339w.d;
            if (pageBlock != null && j4Var != null) {
                int I = j4.I(pageBlock);
                this.v = I;
                f2.q1 x10 = j4Var.x(this, I);
                this.d = (org.telegram.ui.Components.ik0) x10;
                addView(x10.f5501a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f36339w.d;
        if (pageBlock2 != null && j4Var != null) {
            j4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
