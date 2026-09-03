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
public final class b2 extends ViewGroup implements org.telegram.ui.Cells.k9, i3 {
    public final p70 f32697a;
    public final l4 f32698b;
    public f3 f32699c;
    public org.telegram.ui.Components.dl0 d;
    public int e;
    public int f32700f;
    public int h;
    public int f32701n;
    public int f32702r;
    public boolean f32703s;
    public int v;
    public d4 f32704w;
    public boolean f32705x;
    public CheckBoxBase f32706y;

    public b2(Context context, p70 p70Var, l4 l4Var) {
        super(context);
        this.f32697a = p70Var;
        this.f32698b = l4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        f3 f3Var;
        d4 d4Var = this.f32704w;
        if (d4Var != null) {
            f3Var = d4Var.f33320i;
        } else {
            f3Var = null;
        }
        if (f3Var == null) {
            return 0;
        }
        p70 p70Var = this.f32697a;
        l4 l4Var = this.f32698b;
        if (l4Var != null && l4Var.D) {
            int measuredWidth = getMeasuredWidth();
            p70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(15);
            e4 e4Var = this.f32704w.f33318c;
            return b.z(12.0f, e4Var.f33606f, dp - e4Var.f33605c);
        }
        p70Var.getClass();
        return org.telegram.messenger.y3.D(12.0f, this.f32704w.f33318c.f33606f, (AndroidUtilities.dp(15) + this.f32704w.f33318c.f33605c) - ((int) Math.ceil(f3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.dl0 dl0Var = this.d;
        if (dl0Var != null) {
            View view = dl0Var.f5774a;
            if (view instanceof org.telegram.ui.Cells.k9) {
                ((org.telegram.ui.Cells.k9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        f3 f3Var = this.f32699c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f32697a.getClass();
        int dp = AndroidUtilities.dp(18);
        if (this.f32706y != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.e - AndroidUtilities.dp(26.0f)) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        d4 d4Var = this.f32704w;
        if (d4Var != null && d4Var.f33320i != null) {
            i10 = Math.min(i10, (this.f32704w.f33320i.a() + a()) - dp);
        }
        f3 f3Var = this.f32699c;
        if (f3Var != null) {
            i10 = Math.min(i10, (f3Var.a() + f3Var.f33933s) - dp);
        }
        org.telegram.ui.Components.dl0 dl0Var = this.d;
        if (dl0Var != null) {
            View view = dl0Var.f5774a;
            if ((view instanceof i3) && (boundLeft = ((i3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f32701n + boundLeft);
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
        this.f32697a.getClass();
        int dp = AndroidUtilities.dp(18);
        d4 d4Var = this.f32704w;
        if (d4Var != null && d4Var.f33320i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f32704w.f33320i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        f3 f3Var = this.f32699c;
        if (f3Var != null) {
            i10 = Math.max(i10, f3Var.b() + f3Var.f33933s + dp);
        }
        org.telegram.ui.Components.dl0 dl0Var = this.d;
        if (dl0Var != null) {
            View view = dl0Var.f5774a;
            if ((view instanceof i3) && (boundRight = ((i3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f32701n + boundRight);
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
        f3 f3Var = this.f32699c;
        if (f3Var != null) {
            lastLineBoundRight = f3Var.c() + f3Var.f33933s;
            this.f32697a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.dl0 dl0Var = this.d;
            if (dl0Var != null) {
                View view = dl0Var.f5774a;
                if ((view instanceof i3) && (lastLineBoundRight = ((i3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f32701n;
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
        org.telegram.ui.Components.dl0 dl0Var = this.d;
        if (dl0Var != null) {
            dl0Var.f5774a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f32699c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f32699c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        d4 d4Var;
        int i10;
        int i11;
        if (this.f32704w != null) {
            int measuredWidth = getMeasuredWidth();
            f3 f3Var = this.f32704w.f33320i;
            p70 p70Var = this.f32697a;
            if (f3Var != null) {
                canvas.save();
                l4 l4Var = this.f32698b;
                if (l4Var != null && l4Var.D) {
                    p70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(15);
                    e4 e4Var = this.f32704w.f33318c;
                    float z4 = b.z(12.0f, e4Var.f33606f, dp - e4Var.f33605c);
                    int i12 = this.f32700f + this.h;
                    if (this.f32705x) {
                        i11 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = 0;
                    }
                    canvas.translate(z4, i12 - i11);
                } else {
                    p70Var.getClass();
                    float D = org.telegram.messenger.y3.D(12.0f, this.f32704w.f33318c.f33606f, (AndroidUtilities.dp(15) + this.f32704w.f33318c.f33605c) - ((int) Math.ceil(d4Var.f33320i.d.getLineWidth(0))));
                    int i13 = this.f32700f + this.h;
                    if (this.f32705x) {
                        i10 = AndroidUtilities.dp(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(D, i13 - i10);
                }
                this.f32704w.f33320i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f32706y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f32700f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f32706y.a(canvas);
            }
            if (this.f32699c != null) {
                canvas.save();
                canvas.translate(this.e, this.f32700f);
                n4.v(p70Var, canvas, this, 0);
                this.f32699c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        f3 f3Var = this.f32699c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(n4.j(this.f32697a, this.f32698b, f3Var));
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.dl0 dl0Var = this.d;
        if (dl0Var != null) {
            View view = dl0Var.f5774a;
            int i14 = this.f32701n;
            view.layout(i14, this.f32702r, view.getMeasuredWidth() + i14, this.d.f5774a.getMeasuredHeight() + this.f32702r);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        p70 p70Var;
        TextPaint textPaint;
        p70 p70Var2;
        f3 q10;
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
        org.telegram.ui.Cells.l9 l9Var;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        d4 d4Var = this.f32704w;
        int i18 = 1;
        if (d4Var != null) {
            this.f32699c = null;
            int i19 = d4Var.f33321j;
            p70 p70Var3 = this.f32697a;
            int i20 = 0;
            if (i19 == 0 && d4Var.f33318c.f33606f == 0) {
                p70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f32700f = i12;
            this.h = 0;
            e4 e4Var = this.f32704w.f33318c;
            if (e4Var.d == size && e4Var.e == SharedConfig.ivFontSize) {
                p70Var = p70Var3;
            } else {
                e4Var.d = size;
                e4Var.e = SharedConfig.ivFontSize;
                e4Var.f33605c = 0;
                int size2 = e4Var.f33604b.size();
                boolean z4 = true;
                int i21 = 0;
                while (i21 < size2) {
                    d4 d4Var2 = (d4) this.f32704w.f33318c.f33604b.get(i21);
                    String str = d4Var2.f33319f;
                    if (str != null) {
                        if (d4Var2.f33316a && "•".equalsIgnoreCase(str)) {
                            d4Var2.f33320i = null;
                        } else {
                            String str2 = d4Var2.f33319f;
                            p70Var3.getClass();
                            p70 p70Var4 = p70Var3;
                            p70Var2 = p70Var4;
                            d4Var2.f33320i = n4.q(p70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f32700f, this.f32704w, this.f32698b);
                            e4 e4Var2 = this.f32704w.f33318c;
                            e4Var2.f33605c = Math.max(e4Var2.f33605c, (int) Math.ceil(q10.d.getLineWidth(0)));
                            z4 = false;
                            i21++;
                            p70Var3 = p70Var2;
                        }
                    }
                    p70Var2 = p70Var3;
                    i21++;
                    p70Var3 = p70Var2;
                }
                p70Var = p70Var3;
                if (n4.f36345k1 != null && !z4) {
                    e4 e4Var3 = this.f32704w.f33318c;
                    e4Var3.f33605c = Math.max(e4Var3.f33605c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            d4 d4Var3 = this.f32704w;
            this.f32705x = !d4Var3.f33318c.f33603a.ordered;
            if (d4Var3.f33316a) {
                if (this.f32706y == null) {
                    p70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.f32706y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.j6.hl, org.telegram.ui.ActionBar.j6.f20272z5, org.telegram.ui.ActionBar.j6.f20007k7);
                    this.f32706y.d(10);
                    this.f32706y.k(true);
                    this.f32706y.i(AndroidUtilities.dp(5.0f));
                }
                this.f32706y.f(-1, this.f32704w.f33317b, false);
            } else {
                this.f32706y = null;
            }
            int i22 = 26;
            l4 l4Var = this.f32698b;
            if (l4Var != null && l4Var.D) {
                p70Var.getClass();
                if (this.f32706y == null) {
                    i22 = 0;
                }
                this.e = AndroidUtilities.dp(i22 + 18);
            } else {
                p70Var.getClass();
                if (this.f32706y == null) {
                    i22 = 0;
                }
                int dp3 = AndroidUtilities.dp(i22 + 24);
                e4 e4Var4 = this.f32704w.f33318c;
                this.e = org.telegram.messenger.y3.D(12.0f, e4Var4.f33606f, dp3 + e4Var4.f33605c);
            }
            p70Var.getClass();
            float f10 = 18;
            int dp4 = (size - AndroidUtilities.dp(f10)) - this.e;
            if (l4Var != null && l4Var.D) {
                int dp5 = AndroidUtilities.dp(6.0f);
                e4 e4Var5 = this.f32704w.f33318c;
                dp4 -= (AndroidUtilities.dp(12.0f) * e4Var5.f33606f) + (dp5 + e4Var5.f33605c);
            }
            d4 d4Var4 = this.f32704w;
            int i23 = dp4;
            TL_iv.RichText richText = d4Var4.e;
            if (richText != null) {
                if (l4Var != null && l4Var.D) {
                    alignment = org.telegram.ui.Components.kw0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                f3 p10 = n4.p(this.f32697a, this, null, richText, i23, 0, d4Var4, alignment, 0, this.f32698b);
                this.f32699c = p10;
                if (p10 != null && p10.d.getLineCount() > 0) {
                    f3 f3Var3 = this.f32704w.f33320i;
                    if (f3Var3 != null && f3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.f32704w.f33320i.d.getLineAscent(0)) - this.f32699c.d.getLineAscent(0);
                    }
                    i13 = this.f32699c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            } else {
                TL_iv.PageBlock pageBlock = d4Var4.d;
                if (pageBlock != null) {
                    int i24 = this.e;
                    this.f32701n = i24;
                    int i25 = this.f32700f;
                    this.f32702r = i25;
                    org.telegram.ui.Components.dl0 dl0Var = this.d;
                    if (dl0Var != null) {
                        View view = dl0Var.f5774a;
                        if (view instanceof f2) {
                            float f11 = 8;
                            this.f32702r = i25 - AndroidUtilities.dp(f11);
                            if (l4Var == null || !l4Var.D) {
                                this.f32701n -= AndroidUtilities.dp(f10);
                            }
                            int dp6 = i23 + AndroidUtilities.dp(f10);
                            i15 = 0 - AndroidUtilities.dp(f11);
                            i14 = dp6;
                        } else {
                            if (!(view instanceof z1) && !(view instanceof v2) && !(view instanceof z2) && !(view instanceof w2)) {
                                if (n4.L(pageBlock)) {
                                    this.f32701n = 0;
                                    this.f32702r = 0;
                                    this.f32700f = 0;
                                    d4 d4Var5 = this.f32704w;
                                    if (d4Var5.f33321j == 0 && d4Var5.f33318c.f33606f == 0) {
                                        i16 = 0 - AndroidUtilities.dp(10);
                                    } else {
                                        i16 = 0;
                                    }
                                    i15 = i16 - AndroidUtilities.dp(8);
                                    i14 = size;
                                } else if (this.d.f5774a instanceof y2) {
                                    this.f32701n -= AndroidUtilities.dp(f10);
                                    dp2 = AndroidUtilities.dp(36);
                                } else {
                                    i14 = i23;
                                    i15 = 0;
                                }
                            } else {
                                if (l4Var == null || !l4Var.D) {
                                    this.f32701n = i24 - AndroidUtilities.dp(f10);
                                }
                                dp2 = AndroidUtilities.dp(f10);
                            }
                            i14 = dp2 + i23;
                            i15 = 0;
                        }
                        this.d.f5774a.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f5774a instanceof f2) && (f3Var = this.f32704w.f33320i) != null && f3Var.d.getLineCount() > 0 && (f3Var2 = (f2Var = (f2) this.d.f5774a).f33923c) != null && f3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.f32704w.f33320i.d.getLineAscent(0)) - f2Var.f33923c.d.getLineAscent(0);
                        }
                        d4 d4Var6 = this.f32704w;
                        if (d4Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f32703s = true;
                            this.f32702r = 0;
                            if (d4Var6.f33321j == 0 && d4Var6.f33318c.f33606f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.f5774a;
                            if (view2 instanceof e2) {
                                this.f32703s = ((e2) view2).v;
                            } else if (view2 instanceof b2) {
                                this.f32703s = ((b2) view2).f32703s;
                            }
                        }
                        if (this.f32703s && this.f32704w.f33320i != null) {
                            this.f32700f = ((this.d.f5774a.getMeasuredHeight() - this.f32704w.f33320i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.f32705x = false;
                        }
                        i13 = this.d.f5774a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            }
            if (kf.k0.i(1, this.f32704w.f33318c.f33604b) == this.f32704w) {
                i17 += AndroidUtilities.dp(8);
            }
            d4 d4Var7 = this.f32704w;
            if (d4Var7.f33321j == 0 && d4Var7.f33318c.f33606f == 0) {
                i18 = AndroidUtilities.dp(10) + i17;
            } else {
                i18 = i17;
            }
            f3 f3Var4 = this.f32699c;
            if (f3Var4 != null) {
                f3Var4.f33933s = this.e;
                f3Var4.v = this.f32700f;
            }
            org.telegram.ui.Components.dl0 dl0Var2 = this.d;
            if (dl0Var2 != null && (dl0Var2.f5774a instanceof org.telegram.ui.Cells.k9) && (l9Var = ((n4) p70Var).L0) != null) {
                ArrayList arrayList = l9Var.F0;
                arrayList.clear();
                ((org.telegram.ui.Cells.k9) this.d.f5774a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i20 < size3) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) obj;
                    if (w9Var instanceof f3) {
                        f3 f3Var5 = (f3) w9Var;
                        f3Var5.f33933s += this.f32701n;
                        f3Var5.v += this.f32702r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (n4.l(this.f32697a, this.f32698b, motionEvent, this, this.f32699c, this.e, this.f32700f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(d4 d4Var) {
        d4 d4Var2 = this.f32704w;
        l4 l4Var = this.f32698b;
        if (d4Var2 != d4Var) {
            this.f32704w = d4Var;
            org.telegram.ui.Components.dl0 dl0Var = this.d;
            if (dl0Var != null) {
                removeView(dl0Var.f5774a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f32704w.d;
            if (pageBlock != null && l4Var != null) {
                int I = l4.I(pageBlock);
                this.v = I;
                f2.l1 x10 = l4Var.x(this, I);
                this.d = (org.telegram.ui.Components.dl0) x10;
                addView(x10.f5774a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f32704w.d;
        if (pageBlock2 != null && l4Var != null) {
            l4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
