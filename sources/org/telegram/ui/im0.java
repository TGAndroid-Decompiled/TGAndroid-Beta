package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public final class im0 extends View implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 f48776a;
    public final Paint f48777b;
    public final int f48778c;
    public final int d;
    public boolean f48779e;
    public hm0[] f48780f;
    public final int[] h;
    public final Paint f48781n;
    public boolean f48782r;
    public int f48783s;
    public org.telegram.messenger.x10 f48784w;
    public hm0 f48785x;

    public im0(int i7, int i10, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f48777b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f48781n = new Paint(1);
        this.f48782r = true;
        this.f48783s = 0;
        this.f48778c = i7;
        this.d = i10;
        this.f48776a = h6Var;
    }

    public final void a(int i7, boolean z10) {
        boolean z11;
        this.f48783s = i7;
        if (this.f48780f != null) {
            int i10 = 0;
            while (true) {
                hm0[] hm0VarArr = this.f48780f;
                if (i10 < hm0VarArr.length) {
                    hm0 hm0Var = hm0VarArr[i10];
                    if (hm0Var.f48491o == i7) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    hm0Var.f48489m = z11;
                    if (!z10) {
                        hm0Var.f48490n.f(z11, true);
                    }
                    hm0Var.f48494r.invalidate();
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f48780f != null) {
            int i7 = 0;
            while (true) {
                hm0[] hm0VarArr = this.f48780f;
                if (i7 >= hm0VarArr.length) {
                    break;
                }
                hm0 hm0Var = hm0VarArr[i7];
                im0 im0Var = hm0Var.f48494r;
                Path path = hm0Var.f48482e;
                canvas.save();
                float a10 = hm0Var.f48488l.a(0.05f);
                RectF rectF = hm0Var.f48492p;
                canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = hm0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(hm0Var.f48479a);
                if (hm0Var.f48483f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, hm0Var.f48480b);
                }
                canvas.restore();
                if (hm0Var.f48484g) {
                    canvas.save();
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(2.33f), org.telegram.messenger.g0.L(2.33f), hm0Var.f48481c);
                    canvas.restore();
                }
                float d = hm0Var.f48490n.d(hm0Var.f48489m);
                if (d > 0.0f) {
                    Paint paint = im0Var.f48777b;
                    Paint paint2 = im0Var.f48777b;
                    paint.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29378d6, im0Var.f48776a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (org.telegram.messenger.g0.T1(0.5f, -2.0f, d) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (hm0Var.h) {
                    if (im0Var.f48779e) {
                        if (hm0Var.f48487k == null) {
                            Drawable drawable = im0Var.getContext().getResources().getDrawable(2131232245);
                            hm0Var.f48487k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        hm0Var.f48487k.setBounds((int) org.telegram.messenger.n10.w(hm0Var.f48487k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.n10.w(hm0Var.f48487k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) com.google.android.gms.internal.vision.e2.c(hm0Var.f48487k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) com.google.android.gms.internal.vision.e2.c(hm0Var.f48487k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        hm0Var.f48487k.draw(canvas);
                    } else {
                        if (hm0Var.f48485i == null) {
                            hm0Var.f48485i = new Path();
                        }
                        if (hm0Var.f48486j == null) {
                            Paint paint3 = new Paint(1);
                            hm0Var.f48486j = paint3;
                            paint3.setColor(-1);
                            hm0Var.f48486j.setStyle(Paint.Style.STROKE);
                            hm0Var.f48486j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        hm0Var.f48486j.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                        hm0Var.f48485i.rewind();
                        float W1 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(4.0f));
                        hm0Var.f48485i.moveTo(rectF.centerX() - W1, rectF.centerY() - W1);
                        hm0Var.f48485i.lineTo(rectF.centerX() + W1, rectF.centerY() + W1);
                        hm0Var.f48485i.moveTo(rectF.centerX() + W1, rectF.centerY() - W1);
                        hm0Var.f48485i.lineTo(rectF.centerX() - W1, rectF.centerY() + W1);
                        canvas.drawPath(hm0Var.f48485i, hm0Var.f48486j);
                    }
                }
                canvas.restore();
                i7++;
            }
        }
        if (this.f48782r) {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29379d7, this.f48776a);
            Paint paint4 = this.f48781n;
            paint4.setColor(w02);
            canvas.drawRect(org.telegram.messenger.g0.L(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.im0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.f48783s;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        org.telegram.messenger.cp cpVar;
        int size;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int size2 = View.MeasureSpec.getSize(i7);
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(this.d);
        int i13 = this.f48778c;
        if (i13 == 1) {
            cpVar = u12.f25795t4;
        } else {
            cpVar = u12.f25803u4;
        }
        if (cpVar == null) {
            size = 0;
        } else {
            size = cpVar.f23426c.size();
        }
        int i14 = 8;
        int i15 = 2;
        if (i13 == 2) {
            size = 8;
        }
        if (i13 != 2 && i13 == 1) {
            i14 = 7;
        }
        float f10 = size2;
        float f11 = i14;
        float f12 = i14 + 1;
        float min = Math.min(org.telegram.messenger.g0.L(54.0f), f10 / ((f12 * 0.28947f) + f11));
        float min2 = Math.min(0.28947f * min, org.telegram.messenger.g0.L(8.0f));
        float min3 = Math.min(0.31578946f * min, org.telegram.messenger.g0.L(11.33f));
        boolean z12 = true;
        setMeasuredDimension(size2, (int) (((i11 + 1) * min3) + ((size / i14) * min)));
        hm0[] hm0VarArr = this.f48780f;
        if (hm0VarArr == null || hm0VarArr.length != size) {
            this.f48780f = new hm0[size];
            int i16 = 0;
            while (i16 < size) {
                this.f48780f[i16] = new hm0(this);
                if (i13 == i15) {
                    hm0 hm0Var = this.f48780f[i16];
                    int i17 = this.h[i16];
                    hm0Var.f48491o = i17;
                    if (i17 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    hm0Var.h = z10;
                    if (i17 < 0) {
                        i12 = org.telegram.ui.ActionBar.m6.f29362c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.m6.f29639r8;
                        i12 = iArr[i17 % iArr.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.m6.w0(i12, this.f48776a);
                    hm0Var.f48484g = false;
                    hm0Var.f48483f = false;
                    hm0Var.f48479a.setColor(w02);
                } else if (cpVar != null) {
                    ArrayList arrayList = cpVar.f23426c;
                    if (i16 >= 0 && i16 < arrayList.size()) {
                        this.f48780f[i16].f48491o = ((org.telegram.messenger.bp) arrayList.get(i16)).f23141c;
                        this.f48780f[i16].a((org.telegram.messenger.bp) arrayList.get(i16));
                    }
                }
                i16++;
                i15 = 2;
            }
        }
        float f13 = ((f10 - ((f12 * min2) + (f11 * min))) / 2.0f) + min2;
        if (this.f48780f != null) {
            int i18 = 0;
            float f14 = f13;
            float f15 = min3;
            while (i18 < this.f48780f.length) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(f14, f15, f14 + min, f15 + min);
                this.f48780f[i18].f48492p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f48780f[i18].f48493q.set(rectF);
                hm0 hm0Var2 = this.f48780f[i18];
                if (hm0Var2.f48491o == this.f48783s) {
                    z11 = z12;
                } else {
                    z11 = false;
                }
                hm0Var2.f48489m = z11;
                boolean z13 = z12;
                hm0Var2.f48490n.f(z11, z13);
                hm0Var2.f48494r.invalidate();
                if (i18 % i14 == i14 - 1) {
                    f15 += min + min3;
                    f14 = f13;
                } else {
                    f14 = min + min2 + f14;
                }
                i18++;
                z12 = z13;
            }
        }
    }

    public void setCloseAsLock(boolean z10) {
        this.f48779e = z10;
    }

    public void setDivider(boolean z10) {
        this.f48782r = z10;
        invalidate();
    }

    public void setOnColorClick(org.telegram.messenger.x10 x10Var) {
        this.f48784w = x10Var;
    }

    @Override
    public final void updateColors() {
        org.telegram.messenger.cp cpVar;
        boolean z10;
        int i7;
        if (this.f48780f == null) {
            return;
        }
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(this.d);
        int i10 = this.f48778c;
        if (i10 == 1) {
            cpVar = u12.f25795t4;
        } else {
            cpVar = u12.f25803u4;
        }
        int i11 = 0;
        while (true) {
            hm0[] hm0VarArr = this.f48780f;
            if (i11 < hm0VarArr.length) {
                org.telegram.ui.ActionBar.h6 h6Var = this.f48776a;
                int[] iArr = this.h;
                if (i10 == 2) {
                    hm0 hm0Var = hm0VarArr[i11];
                    int i12 = iArr[i11];
                    hm0Var.f48491o = i12;
                    if (i12 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    hm0Var.h = z10;
                    if (i12 < 0) {
                        i7 = org.telegram.ui.ActionBar.m6.f29362c8;
                    } else {
                        int[] iArr2 = org.telegram.ui.ActionBar.m6.f29639r8;
                        i7 = iArr2[i12 % iArr2.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
                    hm0Var.f48484g = false;
                    hm0Var.f48483f = false;
                    hm0Var.f48479a.setColor(w02);
                } else if (i11 < 7 && i10 == 1) {
                    hm0 hm0Var2 = hm0VarArr[i11];
                    int i13 = iArr[i11];
                    hm0Var2.f48491o = i13;
                    int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29639r8[i13], h6Var);
                    hm0Var2.f48484g = false;
                    hm0Var2.f48483f = false;
                    hm0Var2.f48479a.setColor(w03);
                } else if (cpVar != null) {
                    ArrayList arrayList = cpVar.f23426c;
                    if (i11 >= 0 && i11 < arrayList.size()) {
                        this.f48780f[i11].f48491o = ((org.telegram.messenger.bp) arrayList.get(i11)).f23141c;
                        this.f48780f[i11].a((org.telegram.messenger.bp) arrayList.get(i11));
                    }
                }
                i11++;
            } else {
                invalidate();
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
