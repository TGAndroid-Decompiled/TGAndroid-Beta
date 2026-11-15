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
public final class gm0 extends View implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f47469a;
    public final Paint f47470b;
    public final int f47471c;
    public final int d;
    public boolean f47472e;
    public fm0[] f47473f;
    public final int[] h;
    public final Paint f47474n;
    public boolean f47475r;
    public int f47476s;
    public org.telegram.messenger.z10 f47477w;
    public fm0 f47478x;

    public gm0(int i7, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f47470b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f47474n = new Paint(1);
        this.f47475r = true;
        this.f47476s = 0;
        this.f47471c = i7;
        this.d = i10;
        this.f47469a = e6Var;
    }

    public final void a(int i7, boolean z10) {
        boolean z11;
        this.f47476s = i7;
        if (this.f47473f != null) {
            int i10 = 0;
            while (true) {
                fm0[] fm0VarArr = this.f47473f;
                if (i10 < fm0VarArr.length) {
                    fm0 fm0Var = fm0VarArr[i10];
                    if (fm0Var.f47154o == i7) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    fm0Var.f47152m = z11;
                    if (!z10) {
                        fm0Var.f47153n.f(z11, true);
                    }
                    fm0Var.f47157r.invalidate();
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f47473f != null) {
            int i7 = 0;
            while (true) {
                fm0[] fm0VarArr = this.f47473f;
                if (i7 >= fm0VarArr.length) {
                    break;
                }
                fm0 fm0Var = fm0VarArr[i7];
                gm0 gm0Var = fm0Var.f47157r;
                Path path = fm0Var.f47145e;
                canvas.save();
                float a10 = fm0Var.f47151l.a(0.05f);
                RectF rectF = fm0Var.f47155p;
                canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = fm0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(fm0Var.f47142a);
                if (fm0Var.f47146f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, fm0Var.f47143b);
                }
                canvas.restore();
                if (fm0Var.f47147g) {
                    canvas.save();
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(2.33f), org.telegram.messenger.g0.L(2.33f), fm0Var.f47144c);
                    canvas.restore();
                }
                float d = fm0Var.f47153n.d(fm0Var.f47152m);
                if (d > 0.0f) {
                    Paint paint = gm0Var.f47470b;
                    Paint paint2 = gm0Var.f47470b;
                    paint.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, gm0Var.f47469a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (org.telegram.messenger.g0.T1(0.5f, -2.0f, d) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (fm0Var.h) {
                    if (gm0Var.f47472e) {
                        if (fm0Var.f47150k == null) {
                            Drawable drawable = gm0Var.getContext().getResources().getDrawable(2131232244);
                            fm0Var.f47150k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        fm0Var.f47150k.setBounds((int) org.telegram.messenger.i20.v(fm0Var.f47150k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.i20.v(fm0Var.f47150k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) com.google.android.gms.internal.vision.e2.c(fm0Var.f47150k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) com.google.android.gms.internal.vision.e2.c(fm0Var.f47150k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        fm0Var.f47150k.draw(canvas);
                    } else {
                        if (fm0Var.f47148i == null) {
                            fm0Var.f47148i = new Path();
                        }
                        if (fm0Var.f47149j == null) {
                            Paint paint3 = new Paint(1);
                            fm0Var.f47149j = paint3;
                            paint3.setColor(-1);
                            fm0Var.f47149j.setStyle(Paint.Style.STROKE);
                            fm0Var.f47149j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        fm0Var.f47149j.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                        fm0Var.f47148i.rewind();
                        float W1 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(4.0f));
                        fm0Var.f47148i.moveTo(rectF.centerX() - W1, rectF.centerY() - W1);
                        fm0Var.f47148i.lineTo(rectF.centerX() + W1, rectF.centerY() + W1);
                        fm0Var.f47148i.moveTo(rectF.centerX() + W1, rectF.centerY() - W1);
                        fm0Var.f47148i.lineTo(rectF.centerX() - W1, rectF.centerY() + W1);
                        canvas.drawPath(fm0Var.f47148i, fm0Var.f47149j);
                    }
                }
                canvas.restore();
                i7++;
            }
        }
        if (this.f47475r) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28850d7, this.f47469a);
            Paint paint4 = this.f47474n;
            paint4.setColor(w02);
            canvas.drawRect(org.telegram.messenger.g0.L(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gm0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.f47476s;
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
        int i13 = this.f47471c;
        if (i13 == 1) {
            dpVar = s12.f25383r4;
        } else {
            dpVar = s12.f25393s4;
        }
        if (dpVar == null) {
            size = 0;
        } else {
            size = dpVar.f23126c.size();
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
        fm0[] fm0VarArr = this.f47473f;
        if (fm0VarArr == null || fm0VarArr.length != size) {
            this.f47473f = new fm0[size];
            int i16 = 0;
            while (i16 < size) {
                this.f47473f[i16] = new fm0(this);
                if (i13 == i15) {
                    fm0 fm0Var = this.f47473f[i16];
                    int i17 = this.h[i16];
                    fm0Var.f47154o = i17;
                    if (i17 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    fm0Var.h = z10;
                    if (i17 < 0) {
                        i12 = org.telegram.ui.ActionBar.j6.f28833c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.j6.f29110r8;
                        i12 = iArr[i17 % iArr.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.j6.w0(i12, this.f47469a);
                    fm0Var.f47147g = false;
                    fm0Var.f47146f = false;
                    fm0Var.f47142a.setColor(w02);
                } else if (dpVar != null) {
                    ArrayList arrayList = dpVar.f23126c;
                    if (i16 >= 0 && i16 < arrayList.size()) {
                        this.f47473f[i16].f47154o = ((org.telegram.messenger.cp) arrayList.get(i16)).f22919c;
                        this.f47473f[i16].a((org.telegram.messenger.cp) arrayList.get(i16));
                    }
                }
                i16++;
                i15 = 2;
            }
        }
        float f13 = ((f10 - ((f12 * min2) + (f11 * min))) / 2.0f) + min2;
        if (this.f47473f != null) {
            int i18 = 0;
            float f14 = f13;
            float f15 = min3;
            while (i18 < this.f47473f.length) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(f14, f15, f14 + min, f15 + min);
                this.f47473f[i18].f47155p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f47473f[i18].f47156q.set(rectF);
                fm0 fm0Var2 = this.f47473f[i18];
                if (fm0Var2.f47154o == this.f47476s) {
                    z11 = z12;
                } else {
                    z11 = false;
                }
                fm0Var2.f47152m = z11;
                boolean z13 = z12;
                fm0Var2.f47153n.f(z11, z13);
                fm0Var2.f47157r.invalidate();
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
        this.f47472e = z10;
    }

    public void setDivider(boolean z10) {
        this.f47475r = z10;
        invalidate();
    }

    public void setOnColorClick(org.telegram.messenger.z10 z10Var) {
        this.f47477w = z10Var;
    }

    @Override
    public final void updateColors() {
        org.telegram.messenger.dp dpVar;
        boolean z10;
        int i7;
        if (this.f47473f == null) {
            return;
        }
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(this.d);
        int i10 = this.f47471c;
        if (i10 == 1) {
            dpVar = s12.f25383r4;
        } else {
            dpVar = s12.f25393s4;
        }
        int i11 = 0;
        while (true) {
            fm0[] fm0VarArr = this.f47473f;
            if (i11 < fm0VarArr.length) {
                org.telegram.ui.ActionBar.e6 e6Var = this.f47469a;
                int[] iArr = this.h;
                if (i10 == 2) {
                    fm0 fm0Var = fm0VarArr[i11];
                    int i12 = iArr[i11];
                    fm0Var.f47154o = i12;
                    if (i12 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    fm0Var.h = z10;
                    if (i12 < 0) {
                        i7 = org.telegram.ui.ActionBar.j6.f28833c8;
                    } else {
                        int[] iArr2 = org.telegram.ui.ActionBar.j6.f29110r8;
                        i7 = iArr2[i12 % iArr2.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
                    fm0Var.f47147g = false;
                    fm0Var.f47146f = false;
                    fm0Var.f47142a.setColor(w02);
                } else if (i11 < 7 && i10 == 1) {
                    fm0 fm0Var2 = fm0VarArr[i11];
                    int i13 = iArr[i11];
                    fm0Var2.f47154o = i13;
                    int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29110r8[i13], e6Var);
                    fm0Var2.f47147g = false;
                    fm0Var2.f47146f = false;
                    fm0Var2.f47142a.setColor(w03);
                } else if (dpVar != null) {
                    ArrayList arrayList = dpVar.f23126c;
                    if (i11 >= 0 && i11 < arrayList.size()) {
                        this.f47473f[i11].f47154o = ((org.telegram.messenger.cp) arrayList.get(i11)).f22919c;
                        this.f47473f[i11].a((org.telegram.messenger.cp) arrayList.get(i11));
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
