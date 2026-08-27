package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
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

public final class e2 extends ViewGroup implements org.telegram.ui.Cells.i9, i3 {

    public final d70 f37594a;

    public final k4 f37595b;

    public f3 f37596c;
    public org.telegram.ui.Components.lk0 d;

    public int f37597e;

    public int f37598f;
    public int h;

    public int f37599n;

    public int f37600r;

    public int f37601s;
    public boolean v;

    public e4 f37602w;

    public CheckBoxBase f37603x;

    public e2(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f37594a = d70Var;
        this.f37595b = k4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        e4 e4Var = this.f37602w;
        f3 f3Var = e4Var != null ? e4Var.f37618i : null;
        if (f3Var == null) {
            return 0;
        }
        d70 d70Var = this.f37594a;
        k4 k4Var = this.f37595b;
        if (k4Var == null || !k4Var.C) {
            d70Var.getClass();
            return org.telegram.messenger.y1.D(20.0f, this.f37602w.f37615c.f37932e, (AndroidUtilities.dp(18) + this.f37602w.f37615c.f37930b) - ((int) Math.ceil(f3Var.d.getLineWidth(0))));
        }
        int measuredWidth = getMeasuredWidth();
        d70Var.getClass();
        int iDp = measuredWidth - AndroidUtilities.dp(18);
        f4 f4Var = this.f37602w.f37615c;
        return org.telegram.messenger.rl.z(20.0f, f4Var.f37932e, iDp - f4Var.f37930b);
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
        f3 f3Var = this.f37596c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int boundLeft;
        this.f37594a.getClass();
        int iDp = AndroidUtilities.dp(18);
        e4 e4Var = this.f37602w;
        int iMin = (e4Var == null || e4Var.f37618i == null) ? Integer.MAX_VALUE : Math.min(Integer.MAX_VALUE, (this.f37602w.f37618i.a() + a()) - iDp);
        f3 f3Var = this.f37596c;
        if (f3Var != null) {
            iMin = Math.min(iMin, (f3Var.a() + f3Var.f37923s) - iDp);
        }
        org.telegram.ui.Components.lk0 lk0Var = this.d;
        if (lk0Var != null) {
            KeyEvent.Callback callback = lk0Var.f5789a;
            if ((callback instanceof i3) && (boundLeft = ((i3) callback).getBoundLeft()) != -1) {
                iMin = Math.min(iMin, this.f37599n + boundLeft);
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
        this.f37594a.getClass();
        int iDp = AndroidUtilities.dp(18);
        e4 e4Var = this.f37602w;
        int iMax = (e4Var == null || e4Var.f37618i == null) ? Integer.MIN_VALUE : Math.max(Integer.MIN_VALUE, this.f37602w.f37618i.b() + a() + iDp);
        f3 f3Var = this.f37596c;
        if (f3Var != null) {
            iMax = Math.max(iMax, f3Var.b() + f3Var.f37923s + iDp);
        }
        org.telegram.ui.Components.lk0 lk0Var = this.d;
        if (lk0Var != null) {
            KeyEvent.Callback callback = lk0Var.f5789a;
            if ((callback instanceof i3) && (boundRight = ((i3) callback).getBoundRight()) != -1) {
                iMax = Math.max(iMax, this.f37599n + boundRight);
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
        f3 f3Var = this.f37596c;
        if (f3Var == null) {
            org.telegram.ui.Components.lk0 lk0Var = this.d;
            if (lk0Var != null) {
                KeyEvent.Callback callback = lk0Var.f5789a;
                if ((callback instanceof i3) && (lastLineBoundRight = ((i3) callback).getLastLineBoundRight()) != -1) {
                    iDp = this.f37599n;
                }
            }
            return -1;
        }
        lastLineBoundRight = f3Var.c() + f3Var.f37923s;
        this.f37594a.getClass();
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
        f3 f3Var = this.f37596c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f37596c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37602w == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        f3 f3Var = this.f37602w.f37618i;
        d70 d70Var = this.f37594a;
        if (f3Var != null) {
            canvas.save();
            k4 k4Var = this.f37595b;
            if (k4Var == null || !k4Var.C) {
                d70Var.getClass();
                int iDp = AndroidUtilities.dp(18);
                e4 e4Var = this.f37602w;
                canvas.translate(org.telegram.messenger.y1.D(20.0f, this.f37602w.f37615c.f37932e, (iDp + e4Var.f37615c.f37930b) - ((int) Math.ceil(e4Var.f37618i.d.getLineWidth(0)))), this.f37598f + this.h);
            } else {
                d70Var.getClass();
                int iDp2 = measuredWidth - AndroidUtilities.dp(18);
                f4 f4Var = this.f37602w.f37615c;
                canvas.translate(org.telegram.messenger.rl.z(20.0f, f4Var.f37932e, iDp2 - f4Var.f37930b), this.f37598f + this.h);
            }
            this.f37602w.f37618i.draw(canvas, this);
            canvas.restore();
        }
        CheckBoxBase checkBoxBase = this.f37603x;
        if (checkBoxBase != null) {
            checkBoxBase.e(this.f37597e - AndroidUtilities.dp(26.0f), this.f37598f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
            this.f37603x.a(canvas);
        }
        if (this.f37596c != null) {
            canvas.save();
            canvas.translate(this.f37597e, this.f37598f);
            m4.v(d70Var, canvas, this, 0);
            this.f37596c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        f3 f3Var = this.f37596c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(m4.j(this.f37594a, this.f37595b, f3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.lk0 lk0Var = this.d;
        if (lk0Var != null) {
            View view = lk0Var.f5789a;
            int i14 = this.f37599n;
            view.layout(i14, this.f37600r, view.getMeasuredWidth() + i14, this.d.f5789a.getMeasuredHeight() + this.f37600r);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        d70 d70Var;
        d70 d70Var2;
        int measuredHeight;
        int iDp;
        int iDp2;
        int iDp3;
        int iDp4;
        f3 f3Var;
        f2 f2Var;
        f3 f3Var2;
        org.telegram.ui.Cells.j9 j9Var;
        int size = View.MeasureSpec.getSize(i10);
        e4 e4Var = this.f37602w;
        int iDp5 = 1;
        if (e4Var != null) {
            this.f37596c = null;
            int i12 = 0;
            this.f37598f = (e4Var.f37619j == 0 && e4Var.f37615c.f37932e == 0) ? AndroidUtilities.dp(10.0f) : 0;
            this.h = 0;
            f4 f4Var = this.f37602w.f37615c;
            int i13 = f4Var.f37931c;
            d70 d70Var3 = this.f37594a;
            if (i13 == size && f4Var.d == SharedConfig.ivFontSize) {
                d70Var = d70Var3;
            } else {
                f4Var.f37931c = size;
                f4Var.d = SharedConfig.ivFontSize;
                f4Var.f37930b = 0;
                int size2 = f4Var.f37929a.size();
                int i14 = 0;
                while (i14 < size2) {
                    e4 e4Var2 = (e4) this.f37602w.f37615c.f37929a.get(i14);
                    String str = e4Var2.f37617f;
                    if (str == null) {
                        d70Var2 = d70Var3;
                    } else {
                        d70Var3.getClass();
                        d70 d70Var4 = d70Var3;
                        f3 f3VarQ = m4.q(d70Var4, this, str, null, size - AndroidUtilities.dp(54), this.f37598f, this.f37602w, this.f37595b);
                        d70Var2 = d70Var4;
                        e4Var2.f37618i = f3VarQ;
                        f4 f4Var2 = this.f37602w.f37615c;
                        f4Var2.f37930b = Math.max(f4Var2.f37930b, (int) Math.ceil(f3VarQ.d.getLineWidth(0)));
                    }
                    i14++;
                    d70Var3 = d70Var2;
                }
                d70Var = d70Var3;
                f4 f4Var3 = this.f37602w.f37615c;
                f4Var3.f37930b = Math.max(f4Var3.f37930b, (int) Math.ceil(m4.f40318j1.measureText("00.")));
            }
            if (this.f37602w.f37613a) {
                if (this.f37603x == null) {
                    d70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.f37603x = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.g6.hl, org.telegram.ui.ActionBar.g6.f23440z5, org.telegram.ui.ActionBar.g6.f23182k7);
                    this.f37603x.d(10);
                    this.f37603x.k(true);
                    this.f37603x.i(AndroidUtilities.dp(5.0f));
                }
                this.f37603x.f(-1, this.f37602w.f37614b, false);
            } else {
                this.f37603x = null;
            }
            k4 k4Var = this.f37595b;
            if (k4Var == null || !k4Var.C) {
                d70Var.getClass();
                int iDp6 = AndroidUtilities.dp((this.f37603x == null ? 0 : 26) + 24);
                f4 f4Var4 = this.f37602w.f37615c;
                this.f37597e = org.telegram.messenger.y1.D(20.0f, f4Var4.f37932e, iDp6 + f4Var4.f37930b);
            } else {
                d70Var.getClass();
                this.f37597e = AndroidUtilities.dp((this.f37603x == null ? 0 : 26) + 18);
            }
            this.v = false;
            d70Var.getClass();
            float f10 = 18;
            int iDp7 = (size - AndroidUtilities.dp(f10)) - this.f37597e;
            if (k4Var != null && k4Var.C) {
                int iDp8 = AndroidUtilities.dp(6.0f);
                f4 f4Var5 = this.f37602w.f37615c;
                iDp7 -= (AndroidUtilities.dp(20.0f) * f4Var5.f37932e) + (iDp8 + f4Var5.f37930b);
            }
            e4 e4Var3 = this.f37602w;
            int i15 = iDp7;
            TL_iv.RichText richText = e4Var3.f37616e;
            if (richText != null) {
                f3 f3VarP = m4.p(this.f37594a, this, null, richText, i15, 0, e4Var3, (k4Var == null || !k4Var.C) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.tv0.a(), 0, this.f37595b);
                this.f37596c = f3VarP;
                if (f3VarP == null || f3VarP.d.getLineCount() <= 0) {
                    iDp = 0;
                } else {
                    f3 f3Var3 = this.f37602w.f37618i;
                    if (f3Var3 != null && f3Var3.d.getLineCount() > 0) {
                        this.h = this.f37602w.f37618i.d.getLineAscent(0) - this.f37596c.d.getLineAscent(0);
                    }
                    iDp = AndroidUtilities.dp(8.0f) + this.f37596c.d.getHeight();
                }
            } else {
                TL_iv.PageBlock pageBlock = e4Var3.d;
                if (pageBlock != null) {
                    int i16 = this.f37597e;
                    this.f37599n = i16;
                    int i17 = this.f37598f;
                    this.f37600r = i17;
                    org.telegram.ui.Components.lk0 lk0Var = this.d;
                    if (lk0Var != null) {
                        View view = lk0Var.f5789a;
                        if (view instanceof f2) {
                            this.f37600r = i17 - AndroidUtilities.dp(8.0f);
                            if (k4Var == null || !k4Var.C) {
                                this.f37599n -= AndroidUtilities.dp(f10);
                            }
                            iDp3 = AndroidUtilities.dp(18.0f) + i15;
                            iDp4 = 0 - AndroidUtilities.dp(8.0f);
                        } else {
                            if ((view instanceof z1) || (view instanceof v2) || (view instanceof z2) || (view instanceof w2)) {
                                if (k4Var == null || !k4Var.C) {
                                    this.f37599n = i16 - AndroidUtilities.dp(f10);
                                }
                                iDp2 = AndroidUtilities.dp(f10);
                            } else if (m4.L(pageBlock)) {
                                this.f37599n = 0;
                                this.f37600r = 0;
                                this.f37598f = 0;
                                iDp4 = 0 - AndroidUtilities.dp(8.0f);
                                iDp3 = size;
                            } else {
                                if (this.d.f5789a instanceof y2) {
                                    this.f37599n -= AndroidUtilities.dp(f10);
                                    iDp2 = AndroidUtilities.dp(36.0f);
                                } else {
                                    iDp3 = i15;
                                }
                                iDp4 = 0;
                            }
                            iDp3 = iDp2 + i15;
                            iDp4 = 0;
                        }
                        this.d.f5789a.measure(View.MeasureSpec.makeMeasureSpec(iDp3, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f5789a instanceof f2) && (f3Var = this.f37602w.f37618i) != null && f3Var.d.getLineCount() > 0 && (f3Var2 = (f2Var = (f2) this.d.f5789a).f37909c) != null && f3Var2.d.getLineCount() > 0) {
                            this.h = this.f37602w.f37618i.d.getLineAscent(0) - f2Var.f37909c.d.getLineAscent(0);
                        }
                        if (this.f37602w.d instanceof TL_iv.pageBlockDetails) {
                            this.v = true;
                            this.f37600r = 0;
                            iDp4 -= AndroidUtilities.dp(8.0f);
                        } else {
                            View view2 = this.d.f5789a;
                            if (view2 instanceof e2) {
                                this.v = ((e2) view2).v;
                            } else if (view2 instanceof b2) {
                                this.v = ((b2) view2).f36674s;
                            }
                        }
                        if (this.v && this.f37602w.f37618i != null) {
                            this.f37598f = (this.d.f5789a.getMeasuredHeight() - this.f37602w.f37618i.d.getHeight()) / 2;
                        }
                        measuredHeight = this.d.f5789a.getMeasuredHeight() + iDp4;
                    } else {
                        measuredHeight = 0;
                    }
                    iDp = measuredHeight + AndroidUtilities.dp(8.0f);
                } else {
                    iDp = 0;
                }
            }
            if (i0.a.i(1, this.f37602w.f37615c.f37929a) == this.f37602w) {
                iDp += AndroidUtilities.dp(8.0f);
            }
            e4 e4Var4 = this.f37602w;
            iDp5 = (e4Var4.f37619j == 0 && e4Var4.f37615c.f37932e == 0) ? AndroidUtilities.dp(10.0f) + iDp : iDp;
            f3 f3Var4 = this.f37596c;
            if (f3Var4 != null) {
                f3Var4.f37923s = this.f37597e;
                f3Var4.v = this.f37598f;
                f3 f3Var5 = this.f37602w.f37618i;
                if (f3Var5 != null) {
                    f3Var4.f37925x = f3Var5.d.getText();
                }
            }
            org.telegram.ui.Components.lk0 lk0Var2 = this.d;
            if (lk0Var2 != null && (lk0Var2.f5789a instanceof org.telegram.ui.Cells.i9) && (j9Var = ((m4) d70Var).K0) != null) {
                ArrayList arrayList = j9Var.F0;
                arrayList.clear();
                ((org.telegram.ui.Cells.i9) this.d.f5789a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i12 < size3) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) obj;
                    if (u9Var instanceof f3) {
                        f3 f3Var6 = (f3) u9Var;
                        f3Var6.f37923s += this.f37599n;
                        f3Var6.v += this.f37600r;
                    }
                }
            }
        }
        setMeasuredDimension(size, iDp5);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (m4.l(this.f37594a, this.f37595b, motionEvent, this, this.f37596c, this.f37597e, this.f37598f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(e4 e4Var) {
        e4 e4Var2 = this.f37602w;
        k4 k4Var = this.f37595b;
        if (e4Var2 != e4Var) {
            this.f37602w = e4Var;
            org.telegram.ui.Components.lk0 lk0Var = this.d;
            if (lk0Var != null) {
                removeView(lk0Var.f5789a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f37602w.d;
            if (pageBlock != null && k4Var != null) {
                int I = k4.I(pageBlock);
                this.f37601s = I;
                f2.o1 o1VarX = k4Var.x(this, I);
                this.d = (org.telegram.ui.Components.lk0) o1VarX;
                addView(o1VarX.f5789a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f37602w.d;
        if (pageBlock2 != null && k4Var != null) {
            k4Var.H(this.f37601s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
