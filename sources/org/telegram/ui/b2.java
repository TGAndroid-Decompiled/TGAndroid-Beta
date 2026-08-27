package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;

public final class b2 extends ViewGroup implements org.telegram.ui.Cells.i9, i3 {

    public final d70 f36667a;

    public final k4 f36668b;

    public f3 f36669c;
    public org.telegram.ui.Components.lk0 d;

    public int f36670e;

    public int f36671f;
    public int h;

    public int f36672n;

    public int f36673r;

    public boolean f36674s;
    public int v;

    public c4 f36675w;

    public boolean f36676x;

    public CheckBoxBase f36677y;

    public b2(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f36667a = d70Var;
        this.f36668b = k4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        c4 c4Var = this.f36675w;
        f3 f3Var = c4Var != null ? c4Var.f36933i : null;
        if (f3Var == null) {
            return 0;
        }
        d70 d70Var = this.f36667a;
        k4 k4Var = this.f36668b;
        if (k4Var == null || !k4Var.C) {
            d70Var.getClass();
            return org.telegram.messenger.y1.D(12.0f, this.f36675w.f36930c.f37254f, (AndroidUtilities.dp(15) + this.f36675w.f36930c.f37252c) - ((int) Math.ceil(f3Var.d.getLineWidth(0))));
        }
        int measuredWidth = getMeasuredWidth();
        d70Var.getClass();
        int iDp = measuredWidth - AndroidUtilities.dp(15);
        d4 d4Var = this.f36675w.f36930c;
        return org.telegram.messenger.rl.z(12.0f, d4Var.f37254f, iDp - d4Var.f37252c);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.lk0 lk0Var = this.d;
        if (lk0Var != null) {
            KeyEvent.Callback callback = lk0Var.f5789a;
            if (callback instanceof org.telegram.ui.Cells.i9) {
                ((org.telegram.ui.Cells.i9) callback).fillTextLayoutBlocks(arrayList);
            }
        }
        f3 f3Var = this.f36669c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int boundLeft;
        this.f36667a.getClass();
        int iDp = AndroidUtilities.dp(18);
        int iMin = this.f36677y != null ? Math.min(Integer.MAX_VALUE, (this.f36670e - AndroidUtilities.dp(26.0f)) - iDp) : Integer.MAX_VALUE;
        c4 c4Var = this.f36675w;
        if (c4Var != null && c4Var.f36933i != null) {
            iMin = Math.min(iMin, (this.f36675w.f36933i.a() + a()) - iDp);
        }
        f3 f3Var = this.f36669c;
        if (f3Var != null) {
            iMin = Math.min(iMin, (f3Var.a() + f3Var.f37923s) - iDp);
        }
        org.telegram.ui.Components.lk0 lk0Var = this.d;
        if (lk0Var != null) {
            KeyEvent.Callback callback = lk0Var.f5789a;
            if ((callback instanceof i3) && (boundLeft = ((i3) callback).getBoundLeft()) != -1) {
                iMin = Math.min(iMin, this.f36672n + boundLeft);
            }
        }
        if (iMin == Integer.MAX_VALUE) {
            return -1;
        }
        return iMin;
    }

    @Override
    public int getBoundRight() {
        int boundRight;
        this.f36667a.getClass();
        int iDp = AndroidUtilities.dp(18);
        c4 c4Var = this.f36675w;
        int iMax = (c4Var == null || c4Var.f36933i == null) ? Integer.MIN_VALUE : Math.max(Integer.MIN_VALUE, this.f36675w.f36933i.b() + a() + iDp);
        f3 f3Var = this.f36669c;
        if (f3Var != null) {
            iMax = Math.max(iMax, f3Var.b() + f3Var.f37923s + iDp);
        }
        org.telegram.ui.Components.lk0 lk0Var = this.d;
        if (lk0Var != null) {
            KeyEvent.Callback callback = lk0Var.f5789a;
            if ((callback instanceof i3) && (boundRight = ((i3) callback).getBoundRight()) != -1) {
                iMax = Math.max(iMax, this.f36672n + boundRight);
            }
        }
        if (iMax == Integer.MIN_VALUE) {
            return -1;
        }
        return iMax;
    }

    @Override
    public int getLastLineBoundRight() {
        int lastLineBoundRight;
        int iDp;
        f3 f3Var = this.f36669c;
        if (f3Var == null) {
            org.telegram.ui.Components.lk0 lk0Var = this.d;
            if (lk0Var != null) {
                KeyEvent.Callback callback = lk0Var.f5789a;
                if ((callback instanceof i3) && (lastLineBoundRight = ((i3) callback).getLastLineBoundRight()) != -1) {
                    iDp = this.f36672n;
                }
            }
            return -1;
        }
        lastLineBoundRight = f3Var.c() + f3Var.f37923s;
        this.f36667a.getClass();
        iDp = AndroidUtilities.dp(18);
        return iDp + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.rl.b(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.lk0 lk0Var = this.d;
        if (lk0Var != null) {
            lk0Var.f5789a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f36669c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f36669c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f36675w == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        f3 f3Var = this.f36675w.f36933i;
        d70 d70Var = this.f36667a;
        if (f3Var != null) {
            canvas.save();
            k4 k4Var = this.f36668b;
            if (k4Var == null || !k4Var.C) {
                d70Var.getClass();
                int iDp = AndroidUtilities.dp(15);
                c4 c4Var = this.f36675w;
                canvas.translate(org.telegram.messenger.y1.D(12.0f, this.f36675w.f36930c.f37254f, (iDp + c4Var.f36930c.f37252c) - ((int) Math.ceil(c4Var.f36933i.d.getLineWidth(0)))), (this.f36671f + this.h) - (this.f36676x ? AndroidUtilities.dp(1.0f) : 0));
            } else {
                d70Var.getClass();
                int iDp2 = measuredWidth - AndroidUtilities.dp(15);
                d4 d4Var = this.f36675w.f36930c;
                canvas.translate(org.telegram.messenger.rl.z(12.0f, d4Var.f37254f, iDp2 - d4Var.f37252c), (this.f36671f + this.h) - (this.f36676x ? AndroidUtilities.dp(1.0f) : 0));
            }
            this.f36675w.f36933i.draw(canvas, this);
            canvas.restore();
        }
        CheckBoxBase checkBoxBase = this.f36677y;
        if (checkBoxBase != null) {
            checkBoxBase.e(this.f36670e - AndroidUtilities.dp(26.0f), this.f36671f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
            this.f36677y.a(canvas);
        }
        if (this.f36669c != null) {
            canvas.save();
            canvas.translate(this.f36670e, this.f36671f);
            m4.v(d70Var, canvas, this, 0);
            this.f36669c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        f3 f3Var = this.f36669c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(m4.j(this.f36667a, this.f36668b, f3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.lk0 lk0Var = this.d;
        if (lk0Var != null) {
            View view = lk0Var.f5789a;
            int i14 = this.f36672n;
            view.layout(i14, this.f36673r, view.getMeasuredWidth() + i14, this.d.f5789a.getMeasuredHeight() + this.f36673r);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iDp;
        d70 d70Var;
        d70 d70Var2;
        int measuredHeight;
        int iDp2;
        int iDp3;
        int i12;
        int iDp4;
        f3 f3Var;
        f2 f2Var;
        f3 f3Var2;
        int iDp5;
        org.telegram.ui.Cells.j9 j9Var;
        int size = View.MeasureSpec.getSize(i10);
        c4 c4Var = this.f36675w;
        int iDp6 = 1;
        if (c4Var != null) {
            this.f36669c = null;
            int i13 = c4Var.f36934j;
            d70 d70Var3 = this.f36667a;
            int i14 = 0;
            if (i13 == 0 && c4Var.f36930c.f37254f == 0) {
                d70Var3.getClass();
                iDp = AndroidUtilities.dp(10);
            } else {
                iDp = 0;
            }
            this.f36671f = iDp;
            this.h = 0;
            d4 d4Var = this.f36675w.f36930c;
            if (d4Var.d == size && d4Var.f37253e == SharedConfig.ivFontSize) {
                d70Var = d70Var3;
            } else {
                d4Var.d = size;
                d4Var.f37253e = SharedConfig.ivFontSize;
                d4Var.f37252c = 0;
                int size2 = d4Var.f37251b.size();
                boolean z10 = true;
                int i15 = 0;
                while (i15 < size2) {
                    c4 c4Var2 = (c4) this.f36675w.f36930c.f37251b.get(i15);
                    String str = c4Var2.f36932f;
                    if (str == null) {
                        d70Var2 = d70Var3;
                    } else if (c4Var2.f36928a && "•".equalsIgnoreCase(str)) {
                        c4Var2.f36933i = null;
                        d70Var2 = d70Var3;
                    } else {
                        String str2 = c4Var2.f36932f;
                        d70Var3.getClass();
                        d70 d70Var4 = d70Var3;
                        f3 f3VarQ = m4.q(d70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f36671f, this.f36675w, this.f36668b);
                        d70Var2 = d70Var4;
                        c4Var2.f36933i = f3VarQ;
                        d4 d4Var2 = this.f36675w.f36930c;
                        d4Var2.f37252c = Math.max(d4Var2.f37252c, (int) Math.ceil(f3VarQ.d.getLineWidth(0)));
                        z10 = false;
                    }
                    i15++;
                    d70Var3 = d70Var2;
                }
                d70Var = d70Var3;
                TextPaint textPaint = m4.f40318j1;
                if (textPaint != null && !z10) {
                    d4 d4Var3 = this.f36675w.f36930c;
                    d4Var3.f37252c = Math.max(d4Var3.f37252c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            c4 c4Var3 = this.f36675w;
            this.f36676x = !c4Var3.f36930c.f37250a.ordered;
            if (c4Var3.f36928a) {
                if (this.f36677y == null) {
                    d70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.f36677y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.g6.hl, org.telegram.ui.ActionBar.g6.f23440z5, org.telegram.ui.ActionBar.g6.f23182k7);
                    this.f36677y.d(10);
                    this.f36677y.k(true);
                    this.f36677y.i(AndroidUtilities.dp(5.0f));
                }
                this.f36677y.f(-1, this.f36675w.f36929b, false);
            } else {
                this.f36677y = null;
            }
            k4 k4Var = this.f36668b;
            if (k4Var == null || !k4Var.C) {
                d70Var.getClass();
                int iDp7 = AndroidUtilities.dp((this.f36677y == null ? 0 : 26) + 24);
                d4 d4Var4 = this.f36675w.f36930c;
                this.f36670e = org.telegram.messenger.y1.D(12.0f, d4Var4.f37254f, iDp7 + d4Var4.f37252c);
            } else {
                d70Var.getClass();
                this.f36670e = AndroidUtilities.dp((this.f36677y == null ? 0 : 26) + 18);
            }
            d70Var.getClass();
            float f10 = 18;
            int iDp8 = (size - AndroidUtilities.dp(f10)) - this.f36670e;
            if (k4Var != null && k4Var.C) {
                int iDp9 = AndroidUtilities.dp(6.0f);
                d4 d4Var5 = this.f36675w.f36930c;
                iDp8 -= (AndroidUtilities.dp(12.0f) * d4Var5.f37254f) + (iDp9 + d4Var5.f37252c);
            }
            c4 c4Var4 = this.f36675w;
            int i16 = iDp8;
            TL_iv.RichText richText = c4Var4.f36931e;
            if (richText != null) {
                f3 f3VarP = m4.p(this.f36667a, this, null, richText, i16, 0, c4Var4, (k4Var == null || !k4Var.C) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.tv0.a(), 0, this.f36668b);
                this.f36669c = f3VarP;
                if (f3VarP == null || f3VarP.d.getLineCount() <= 0) {
                    iDp5 = 0;
                } else {
                    f3 f3Var3 = this.f36675w.f36933i;
                    if (f3Var3 != null && f3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.f36675w.f36933i.d.getLineAscent(0)) - this.f36669c.d.getLineAscent(0);
                    }
                    measuredHeight = this.f36669c.d.getHeight();
                    iDp2 = AndroidUtilities.dp(8);
                    iDp5 = iDp2 + measuredHeight;
                }
            } else {
                TL_iv.PageBlock pageBlock = c4Var4.d;
                if (pageBlock != null) {
                    int i17 = this.f36670e;
                    this.f36672n = i17;
                    int i18 = this.f36671f;
                    this.f36673r = i18;
                    org.telegram.ui.Components.lk0 lk0Var = this.d;
                    if (lk0Var != null) {
                        View view = lk0Var.f5789a;
                        if (view instanceof f2) {
                            float f11 = 8;
                            this.f36673r = i18 - AndroidUtilities.dp(f11);
                            if (k4Var == null || !k4Var.C) {
                                this.f36672n -= AndroidUtilities.dp(f10);
                            }
                            int iDp10 = i16 + AndroidUtilities.dp(f10);
                            iDp4 = 0 - AndroidUtilities.dp(f11);
                            i12 = iDp10;
                        } else {
                            if ((view instanceof z1) || (view instanceof v2) || (view instanceof z2) || (view instanceof w2)) {
                                if (k4Var == null || !k4Var.C) {
                                    this.f36672n = i17 - AndroidUtilities.dp(f10);
                                }
                                iDp3 = AndroidUtilities.dp(f10);
                            } else if (m4.L(pageBlock)) {
                                this.f36672n = 0;
                                this.f36673r = 0;
                                this.f36671f = 0;
                                c4 c4Var5 = this.f36675w;
                                iDp4 = ((c4Var5.f36934j == 0 && c4Var5.f36930c.f37254f == 0) ? 0 - AndroidUtilities.dp(10) : 0) - AndroidUtilities.dp(8);
                                i12 = size;
                            } else {
                                if (this.d.f5789a instanceof y2) {
                                    this.f36672n -= AndroidUtilities.dp(f10);
                                    iDp3 = AndroidUtilities.dp(36);
                                } else {
                                    i12 = i16;
                                }
                                iDp4 = 0;
                            }
                            i12 = iDp3 + i16;
                            iDp4 = 0;
                        }
                        this.d.f5789a.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f5789a instanceof f2) && (f3Var = this.f36675w.f36933i) != null && f3Var.d.getLineCount() > 0 && (f3Var2 = (f2Var = (f2) this.d.f5789a).f37909c) != null && f3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.f36675w.f36933i.d.getLineAscent(0)) - f2Var.f37909c.d.getLineAscent(0);
                        }
                        c4 c4Var6 = this.f36675w;
                        if (c4Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f36674s = true;
                            this.f36673r = 0;
                            if (c4Var6.f36934j == 0 && c4Var6.f36930c.f37254f == 0) {
                                iDp4 -= AndroidUtilities.dp(10);
                            }
                            iDp4 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.f5789a;
                            if (view2 instanceof e2) {
                                this.f36674s = ((e2) view2).v;
                            } else if (view2 instanceof b2) {
                                this.f36674s = ((b2) view2).f36674s;
                            }
                        }
                        if (this.f36674s && this.f36675w.f36933i != null) {
                            this.f36671f = ((this.d.f5789a.getMeasuredHeight() - this.f36675w.f36933i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.f36676x = false;
                        }
                        measuredHeight = this.d.f5789a.getMeasuredHeight() + iDp4;
                    } else {
                        measuredHeight = 0;
                    }
                    iDp2 = AndroidUtilities.dp(8);
                    iDp5 = iDp2 + measuredHeight;
                } else {
                    iDp5 = 0;
                }
            }
            if (i0.a.i(1, this.f36675w.f36930c.f37251b) == this.f36675w) {
                iDp5 += AndroidUtilities.dp(8);
            }
            c4 c4Var7 = this.f36675w;
            iDp6 = (c4Var7.f36934j == 0 && c4Var7.f36930c.f37254f == 0) ? AndroidUtilities.dp(10) + iDp5 : iDp5;
            f3 f3Var4 = this.f36669c;
            if (f3Var4 != null) {
                f3Var4.f37923s = this.f36670e;
                f3Var4.v = this.f36671f;
            }
            org.telegram.ui.Components.lk0 lk0Var2 = this.d;
            if (lk0Var2 != null && (lk0Var2.f5789a instanceof org.telegram.ui.Cells.i9) && (j9Var = ((m4) d70Var).K0) != null) {
                ArrayList arrayList = j9Var.F0;
                arrayList.clear();
                ((org.telegram.ui.Cells.i9) this.d.f5789a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i14 < size3) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) obj;
                    if (u9Var instanceof f3) {
                        f3 f3Var5 = (f3) u9Var;
                        f3Var5.f37923s += this.f36672n;
                        f3Var5.v += this.f36673r;
                    }
                }
            }
        }
        setMeasuredDimension(size, iDp6);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (m4.l(this.f36667a, this.f36668b, motionEvent, this, this.f36669c, this.f36670e, this.f36671f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(c4 c4Var) {
        c4 c4Var2 = this.f36675w;
        k4 k4Var = this.f36668b;
        if (c4Var2 != c4Var) {
            this.f36675w = c4Var;
            org.telegram.ui.Components.lk0 lk0Var = this.d;
            if (lk0Var != null) {
                removeView(lk0Var.f5789a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f36675w.d;
            if (pageBlock != null && k4Var != null) {
                int I = k4.I(pageBlock);
                this.v = I;
                f2.o1 o1VarX = k4Var.x(this, I);
                this.d = (org.telegram.ui.Components.lk0) o1VarX;
                addView(o1VarX.f5789a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f36675w.d;
        if (pageBlock2 != null && k4Var != null) {
            k4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
