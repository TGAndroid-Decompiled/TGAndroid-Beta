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
public final class em0 extends View implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f45335a;
    public final Paint f45336b;
    public final int f45337c;
    public final int d;
    public boolean f45338e;
    public dm0[] f45339f;
    public final int[] h;
    public final Paint f45340n;
    public boolean f45341r;
    public int f45342s;
    public org.telegram.messenger.c20 f45343w;
    public dm0 f45344x;

    public em0(int i7, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f45336b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f45340n = new Paint(1);
        this.f45341r = true;
        this.f45342s = 0;
        this.f45337c = i7;
        this.d = i10;
        this.f45335a = f6Var;
    }

    public final void a(int i7, boolean z9) {
        boolean z10;
        this.f45342s = i7;
        if (this.f45339f != null) {
            int i10 = 0;
            while (true) {
                dm0[] dm0VarArr = this.f45339f;
                if (i10 < dm0VarArr.length) {
                    dm0 dm0Var = dm0VarArr[i10];
                    if (dm0Var.f45101o == i7) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dm0Var.f45099m = z10;
                    if (!z9) {
                        dm0Var.f45100n.f(z10, true);
                    }
                    dm0Var.f45104r.invalidate();
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f45339f != null) {
            int i7 = 0;
            while (true) {
                dm0[] dm0VarArr = this.f45339f;
                if (i7 >= dm0VarArr.length) {
                    break;
                }
                dm0 dm0Var = dm0VarArr[i7];
                em0 em0Var = dm0Var.f45104r;
                Path path = dm0Var.f45092e;
                canvas.save();
                float a10 = dm0Var.f45098l.a(0.05f);
                RectF rectF = dm0Var.f45102p;
                canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = dm0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(dm0Var.f45089a);
                if (dm0Var.f45093f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, dm0Var.f45090b);
                }
                canvas.restore();
                if (dm0Var.f45094g) {
                    canvas.save();
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(2.33f), org.telegram.messenger.g0.L(2.33f), dm0Var.f45091c);
                    canvas.restore();
                }
                float d = dm0Var.f45100n.d(dm0Var.f45099m);
                if (d > 0.0f) {
                    Paint paint = em0Var.f45336b;
                    Paint paint2 = em0Var.f45336b;
                    paint.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27852d6, em0Var.f45335a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (org.telegram.messenger.g0.T1(0.5f, -2.0f, d) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (dm0Var.h) {
                    if (em0Var.f45338e) {
                        if (dm0Var.f45097k == null) {
                            Drawable drawable = em0Var.getContext().getResources().getDrawable(2131232243);
                            dm0Var.f45097k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        dm0Var.f45097k.setBounds((int) org.telegram.messenger.camera.q.v(dm0Var.f45097k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.camera.q.v(dm0Var.f45097k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) com.google.android.recaptcha.internal.a.c(dm0Var.f45097k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) com.google.android.recaptcha.internal.a.c(dm0Var.f45097k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        dm0Var.f45097k.draw(canvas);
                    } else {
                        if (dm0Var.f45095i == null) {
                            dm0Var.f45095i = new Path();
                        }
                        if (dm0Var.f45096j == null) {
                            Paint paint3 = new Paint(1);
                            dm0Var.f45096j = paint3;
                            paint3.setColor(-1);
                            dm0Var.f45096j.setStyle(Paint.Style.STROKE);
                            dm0Var.f45096j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        dm0Var.f45096j.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                        dm0Var.f45095i.rewind();
                        float W1 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(4.0f));
                        dm0Var.f45095i.moveTo(rectF.centerX() - W1, rectF.centerY() - W1);
                        dm0Var.f45095i.lineTo(rectF.centerX() + W1, rectF.centerY() + W1);
                        dm0Var.f45095i.moveTo(rectF.centerX() + W1, rectF.centerY() - W1);
                        dm0Var.f45095i.lineTo(rectF.centerX() - W1, rectF.centerY() + W1);
                        canvas.drawPath(dm0Var.f45095i, dm0Var.f45096j);
                    }
                }
                canvas.restore();
                i7++;
            }
        }
        if (this.f45341r) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27853d7, this.f45335a);
            Paint paint4 = this.f45340n;
            paint4.setColor(w02);
            canvas.drawRect(org.telegram.messenger.g0.L(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.em0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.f45342s;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        org.telegram.messenger.gp gpVar;
        int size;
        int i11;
        boolean z9;
        int i12;
        boolean z10;
        int size2 = View.MeasureSpec.getSize(i7);
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(this.d);
        int i13 = this.f45337c;
        if (i13 == 1) {
            gpVar = s12.f24874q4;
        } else {
            gpVar = s12.f24884r4;
        }
        if (gpVar == null) {
            size = 0;
        } else {
            size = gpVar.f22706c.size();
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
        boolean z11 = true;
        setMeasuredDimension(size2, (int) (((i11 + 1) * min3) + ((size / i14) * min)));
        dm0[] dm0VarArr = this.f45339f;
        if (dm0VarArr == null || dm0VarArr.length != size) {
            this.f45339f = new dm0[size];
            int i16 = 0;
            while (i16 < size) {
                this.f45339f[i16] = new dm0(this);
                if (i13 == i15) {
                    dm0 dm0Var = this.f45339f[i16];
                    int i17 = this.h[i16];
                    dm0Var.f45101o = i17;
                    if (i17 < 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    dm0Var.h = z9;
                    if (i17 < 0) {
                        i12 = org.telegram.ui.ActionBar.k6.f27836c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.k6.f28113r8;
                        i12 = iArr[i17 % iArr.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.k6.w0(i12, this.f45335a);
                    dm0Var.f45094g = false;
                    dm0Var.f45093f = false;
                    dm0Var.f45089a.setColor(w02);
                } else if (gpVar != null) {
                    ArrayList arrayList = gpVar.f22706c;
                    if (i16 >= 0 && i16 < arrayList.size()) {
                        this.f45339f[i16].f45101o = ((org.telegram.messenger.fp) arrayList.get(i16)).f22451c;
                        this.f45339f[i16].a((org.telegram.messenger.fp) arrayList.get(i16));
                    }
                }
                i16++;
                i15 = 2;
            }
        }
        float f13 = ((f10 - ((f12 * min2) + (f11 * min))) / 2.0f) + min2;
        if (this.f45339f != null) {
            int i18 = 0;
            float f14 = f13;
            float f15 = min3;
            while (i18 < this.f45339f.length) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(f14, f15, f14 + min, f15 + min);
                this.f45339f[i18].f45102p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f45339f[i18].f45103q.set(rectF);
                dm0 dm0Var2 = this.f45339f[i18];
                if (dm0Var2.f45101o == this.f45342s) {
                    z10 = z11;
                } else {
                    z10 = false;
                }
                dm0Var2.f45099m = z10;
                boolean z12 = z11;
                dm0Var2.f45100n.f(z10, z12);
                dm0Var2.f45104r.invalidate();
                if (i18 % i14 == i14 - 1) {
                    f15 += min + min3;
                    f14 = f13;
                } else {
                    f14 = min + min2 + f14;
                }
                i18++;
                z11 = z12;
            }
        }
    }

    public void setCloseAsLock(boolean z9) {
        this.f45338e = z9;
    }

    public void setDivider(boolean z9) {
        this.f45341r = z9;
        invalidate();
    }

    public void setOnColorClick(org.telegram.messenger.c20 c20Var) {
        this.f45343w = c20Var;
    }

    @Override
    public final void updateColors() {
        org.telegram.messenger.gp gpVar;
        boolean z9;
        int i7;
        if (this.f45339f == null) {
            return;
        }
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(this.d);
        int i10 = this.f45337c;
        if (i10 == 1) {
            gpVar = s12.f24874q4;
        } else {
            gpVar = s12.f24884r4;
        }
        int i11 = 0;
        while (true) {
            dm0[] dm0VarArr = this.f45339f;
            if (i11 < dm0VarArr.length) {
                org.telegram.ui.ActionBar.f6 f6Var = this.f45335a;
                int[] iArr = this.h;
                if (i10 == 2) {
                    dm0 dm0Var = dm0VarArr[i11];
                    int i12 = iArr[i11];
                    dm0Var.f45101o = i12;
                    if (i12 < 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    dm0Var.h = z9;
                    if (i12 < 0) {
                        i7 = org.telegram.ui.ActionBar.k6.f27836c8;
                    } else {
                        int[] iArr2 = org.telegram.ui.ActionBar.k6.f28113r8;
                        i7 = iArr2[i12 % iArr2.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
                    dm0Var.f45094g = false;
                    dm0Var.f45093f = false;
                    dm0Var.f45089a.setColor(w02);
                } else if (i11 < 7 && i10 == 1) {
                    dm0 dm0Var2 = dm0VarArr[i11];
                    int i13 = iArr[i11];
                    dm0Var2.f45101o = i13;
                    int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28113r8[i13], f6Var);
                    dm0Var2.f45094g = false;
                    dm0Var2.f45093f = false;
                    dm0Var2.f45089a.setColor(w03);
                } else if (gpVar != null) {
                    ArrayList arrayList = gpVar.f22706c;
                    if (i11 >= 0 && i11 < arrayList.size()) {
                        this.f45339f[i11].f45101o = ((org.telegram.messenger.fp) arrayList.get(i11)).f22451c;
                        this.f45339f[i11].a((org.telegram.messenger.fp) arrayList.get(i11));
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
