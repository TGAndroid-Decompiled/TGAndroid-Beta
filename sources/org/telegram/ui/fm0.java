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
public final class fm0 extends View implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f47158a;
    public final Paint f47159b;
    public final int f47160c;
    public final int d;
    public boolean f47161e;
    public em0[] f47162f;
    public final int[] h;
    public final Paint f47163n;
    public boolean f47164r;
    public int f47165s;
    public org.telegram.messenger.z10 f47166w;
    public em0 f47167x;

    public fm0(int i7, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f47159b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f47163n = new Paint(1);
        this.f47164r = true;
        this.f47165s = 0;
        this.f47160c = i7;
        this.d = i10;
        this.f47158a = e6Var;
    }

    public final void a(int i7, boolean z10) {
        boolean z11;
        this.f47165s = i7;
        if (this.f47162f != null) {
            int i10 = 0;
            while (true) {
                em0[] em0VarArr = this.f47162f;
                if (i10 < em0VarArr.length) {
                    em0 em0Var = em0VarArr[i10];
                    if (em0Var.f46880o == i7) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    em0Var.f46878m = z11;
                    if (!z10) {
                        em0Var.f46879n.f(z11, true);
                    }
                    em0Var.f46883r.invalidate();
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f47162f != null) {
            int i7 = 0;
            while (true) {
                em0[] em0VarArr = this.f47162f;
                if (i7 >= em0VarArr.length) {
                    break;
                }
                em0 em0Var = em0VarArr[i7];
                fm0 fm0Var = em0Var.f46883r;
                Path path = em0Var.f46871e;
                canvas.save();
                float a10 = em0Var.f46877l.a(0.05f);
                RectF rectF = em0Var.f46881p;
                canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = em0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(em0Var.f46868a);
                if (em0Var.f46872f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, em0Var.f46869b);
                }
                canvas.restore();
                if (em0Var.f46873g) {
                    canvas.save();
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(2.33f), org.telegram.messenger.g0.L(2.33f), em0Var.f46870c);
                    canvas.restore();
                }
                float d = em0Var.f46879n.d(em0Var.f46878m);
                if (d > 0.0f) {
                    Paint paint = fm0Var.f47159b;
                    Paint paint2 = fm0Var.f47159b;
                    paint.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, fm0Var.f47158a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (org.telegram.messenger.g0.T1(0.5f, -2.0f, d) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (em0Var.h) {
                    if (fm0Var.f47161e) {
                        if (em0Var.f46876k == null) {
                            Drawable drawable = fm0Var.getContext().getResources().getDrawable(2131232244);
                            em0Var.f46876k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        em0Var.f46876k.setBounds((int) org.telegram.messenger.i20.v(em0Var.f46876k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.i20.v(em0Var.f46876k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) com.google.android.gms.internal.vision.e2.c(em0Var.f46876k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) com.google.android.gms.internal.vision.e2.c(em0Var.f46876k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        em0Var.f46876k.draw(canvas);
                    } else {
                        if (em0Var.f46874i == null) {
                            em0Var.f46874i = new Path();
                        }
                        if (em0Var.f46875j == null) {
                            Paint paint3 = new Paint(1);
                            em0Var.f46875j = paint3;
                            paint3.setColor(-1);
                            em0Var.f46875j.setStyle(Paint.Style.STROKE);
                            em0Var.f46875j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        em0Var.f46875j.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                        em0Var.f46874i.rewind();
                        float W1 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(4.0f));
                        em0Var.f46874i.moveTo(rectF.centerX() - W1, rectF.centerY() - W1);
                        em0Var.f46874i.lineTo(rectF.centerX() + W1, rectF.centerY() + W1);
                        em0Var.f46874i.moveTo(rectF.centerX() + W1, rectF.centerY() - W1);
                        em0Var.f46874i.lineTo(rectF.centerX() - W1, rectF.centerY() + W1);
                        canvas.drawPath(em0Var.f46874i, em0Var.f46875j);
                    }
                }
                canvas.restore();
                i7++;
            }
        }
        if (this.f47164r) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28850d7, this.f47158a);
            Paint paint4 = this.f47163n;
            paint4.setColor(w02);
            canvas.drawRect(org.telegram.messenger.g0.L(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fm0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.f47165s;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        org.telegram.messenger.dp dpVar;
        int size;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int size2 = View.MeasureSpec.getSize(i7);
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(this.d);
        int i13 = this.f47160c;
        if (i13 == 1) {
            dpVar = s12.f25380r4;
        } else {
            dpVar = s12.f25390s4;
        }
        if (dpVar == null) {
            size = 0;
        } else {
            size = dpVar.f23118c.size();
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
        em0[] em0VarArr = this.f47162f;
        if (em0VarArr == null || em0VarArr.length != size) {
            this.f47162f = new em0[size];
            int i16 = 0;
            while (i16 < size) {
                this.f47162f[i16] = new em0(this);
                if (i13 == i15) {
                    em0 em0Var = this.f47162f[i16];
                    int i17 = this.h[i16];
                    em0Var.f46880o = i17;
                    if (i17 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    em0Var.h = z10;
                    if (i17 < 0) {
                        i12 = org.telegram.ui.ActionBar.j6.f28833c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.j6.f29110r8;
                        i12 = iArr[i17 % iArr.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.j6.w0(i12, this.f47158a);
                    em0Var.f46873g = false;
                    em0Var.f46872f = false;
                    em0Var.f46868a.setColor(w02);
                } else if (dpVar != null) {
                    ArrayList arrayList = dpVar.f23118c;
                    if (i16 >= 0 && i16 < arrayList.size()) {
                        this.f47162f[i16].f46880o = ((org.telegram.messenger.cp) arrayList.get(i16)).f22915c;
                        this.f47162f[i16].a((org.telegram.messenger.cp) arrayList.get(i16));
                    }
                }
                i16++;
                i15 = 2;
            }
        }
        float f13 = ((f10 - ((f12 * min2) + (f11 * min))) / 2.0f) + min2;
        if (this.f47162f != null) {
            int i18 = 0;
            float f14 = f13;
            float f15 = min3;
            while (i18 < this.f47162f.length) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(f14, f15, f14 + min, f15 + min);
                this.f47162f[i18].f46881p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f47162f[i18].f46882q.set(rectF);
                em0 em0Var2 = this.f47162f[i18];
                if (em0Var2.f46880o == this.f47165s) {
                    z11 = z12;
                } else {
                    z11 = false;
                }
                em0Var2.f46878m = z11;
                boolean z13 = z12;
                em0Var2.f46879n.f(z11, z13);
                em0Var2.f46883r.invalidate();
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
        this.f47161e = z10;
    }

    public void setDivider(boolean z10) {
        this.f47164r = z10;
        invalidate();
    }

    public void setOnColorClick(org.telegram.messenger.z10 z10Var) {
        this.f47166w = z10Var;
    }

    @Override
    public final void updateColors() {
        org.telegram.messenger.dp dpVar;
        boolean z10;
        int i7;
        if (this.f47162f == null) {
            return;
        }
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(this.d);
        int i10 = this.f47160c;
        if (i10 == 1) {
            dpVar = s12.f25380r4;
        } else {
            dpVar = s12.f25390s4;
        }
        int i11 = 0;
        while (true) {
            em0[] em0VarArr = this.f47162f;
            if (i11 < em0VarArr.length) {
                org.telegram.ui.ActionBar.e6 e6Var = this.f47158a;
                int[] iArr = this.h;
                if (i10 == 2) {
                    em0 em0Var = em0VarArr[i11];
                    int i12 = iArr[i11];
                    em0Var.f46880o = i12;
                    if (i12 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    em0Var.h = z10;
                    if (i12 < 0) {
                        i7 = org.telegram.ui.ActionBar.j6.f28833c8;
                    } else {
                        int[] iArr2 = org.telegram.ui.ActionBar.j6.f29110r8;
                        i7 = iArr2[i12 % iArr2.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
                    em0Var.f46873g = false;
                    em0Var.f46872f = false;
                    em0Var.f46868a.setColor(w02);
                } else if (i11 < 7 && i10 == 1) {
                    em0 em0Var2 = em0VarArr[i11];
                    int i13 = iArr[i11];
                    em0Var2.f46880o = i13;
                    int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29110r8[i13], e6Var);
                    em0Var2.f46873g = false;
                    em0Var2.f46872f = false;
                    em0Var2.f46868a.setColor(w03);
                } else if (dpVar != null) {
                    ArrayList arrayList = dpVar.f23118c;
                    if (i11 >= 0 && i11 < arrayList.size()) {
                        this.f47162f[i11].f46880o = ((org.telegram.messenger.cp) arrayList.get(i11)).f22915c;
                        this.f47162f[i11].a((org.telegram.messenger.cp) arrayList.get(i11));
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
