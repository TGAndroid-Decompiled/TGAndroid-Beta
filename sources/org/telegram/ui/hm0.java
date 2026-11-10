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
public final class hm0 extends View implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.h6 f46383a;
    public final Paint f46384b;
    public final int f46385c;
    public final int d;
    public boolean f46386e;
    public gm0[] f46387f;
    public final int[] h;
    public final Paint f46388n;
    public boolean f46389r;
    public int f46390s;
    public org.telegram.messenger.c20 f46391w;
    public gm0 f46392x;

    public hm0(int i7, int i10, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f46384b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f46388n = new Paint(1);
        this.f46389r = true;
        this.f46390s = 0;
        this.f46385c = i7;
        this.d = i10;
        this.f46383a = h6Var;
    }

    public final void a(int i7, boolean z9) {
        boolean z10;
        this.f46390s = i7;
        if (this.f46387f != null) {
            int i10 = 0;
            while (true) {
                gm0[] gm0VarArr = this.f46387f;
                if (i10 < gm0VarArr.length) {
                    gm0 gm0Var = gm0VarArr[i10];
                    if (gm0Var.f46129o == i7) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    gm0Var.f46127m = z10;
                    if (!z9) {
                        gm0Var.f46128n.f(z10, true);
                    }
                    gm0Var.f46132r.invalidate();
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f46387f != null) {
            int i7 = 0;
            while (true) {
                gm0[] gm0VarArr = this.f46387f;
                if (i7 >= gm0VarArr.length) {
                    break;
                }
                gm0 gm0Var = gm0VarArr[i7];
                hm0 hm0Var = gm0Var.f46132r;
                Path path = gm0Var.f46120e;
                canvas.save();
                float a10 = gm0Var.f46126l.a(0.05f);
                RectF rectF = gm0Var.f46130p;
                canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = gm0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(gm0Var.f46117a);
                if (gm0Var.f46121f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, gm0Var.f46118b);
                }
                canvas.restore();
                if (gm0Var.f46122g) {
                    canvas.save();
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(2.33f), org.telegram.messenger.g0.L(2.33f), gm0Var.f46119c);
                    canvas.restore();
                }
                float d = gm0Var.f46128n.d(gm0Var.f46127m);
                if (d > 0.0f) {
                    Paint paint = hm0Var.f46384b;
                    Paint paint2 = hm0Var.f46384b;
                    paint.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27890d6, hm0Var.f46383a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (org.telegram.messenger.g0.T1(0.5f, -2.0f, d) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (gm0Var.h) {
                    if (hm0Var.f46386e) {
                        if (gm0Var.f46125k == null) {
                            Drawable drawable = hm0Var.getContext().getResources().getDrawable(2131232243);
                            gm0Var.f46125k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        gm0Var.f46125k.setBounds((int) org.telegram.messenger.camera.q.v(gm0Var.f46125k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.camera.q.v(gm0Var.f46125k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) com.google.android.recaptcha.internal.a.c(gm0Var.f46125k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) com.google.android.recaptcha.internal.a.c(gm0Var.f46125k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        gm0Var.f46125k.draw(canvas);
                    } else {
                        if (gm0Var.f46123i == null) {
                            gm0Var.f46123i = new Path();
                        }
                        if (gm0Var.f46124j == null) {
                            Paint paint3 = new Paint(1);
                            gm0Var.f46124j = paint3;
                            paint3.setColor(-1);
                            gm0Var.f46124j.setStyle(Paint.Style.STROKE);
                            gm0Var.f46124j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        gm0Var.f46124j.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                        gm0Var.f46123i.rewind();
                        float W1 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(4.0f));
                        gm0Var.f46123i.moveTo(rectF.centerX() - W1, rectF.centerY() - W1);
                        gm0Var.f46123i.lineTo(rectF.centerX() + W1, rectF.centerY() + W1);
                        gm0Var.f46123i.moveTo(rectF.centerX() + W1, rectF.centerY() - W1);
                        gm0Var.f46123i.lineTo(rectF.centerX() - W1, rectF.centerY() + W1);
                        canvas.drawPath(gm0Var.f46123i, gm0Var.f46124j);
                    }
                }
                canvas.restore();
                i7++;
            }
        }
        if (this.f46389r) {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27891d7, this.f46383a);
            Paint paint4 = this.f46388n;
            paint4.setColor(w02);
            canvas.drawRect(org.telegram.messenger.g0.L(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hm0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.f46390s;
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
        int i13 = this.f46385c;
        if (i13 == 1) {
            gpVar = s12.f24878q4;
        } else {
            gpVar = s12.f24888r4;
        }
        if (gpVar == null) {
            size = 0;
        } else {
            size = gpVar.f22710c.size();
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
        gm0[] gm0VarArr = this.f46387f;
        if (gm0VarArr == null || gm0VarArr.length != size) {
            this.f46387f = new gm0[size];
            int i16 = 0;
            while (i16 < size) {
                this.f46387f[i16] = new gm0(this);
                if (i13 == i15) {
                    gm0 gm0Var = this.f46387f[i16];
                    int i17 = this.h[i16];
                    gm0Var.f46129o = i17;
                    if (i17 < 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    gm0Var.h = z9;
                    if (i17 < 0) {
                        i12 = org.telegram.ui.ActionBar.m6.f27874c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.m6.f28151r8;
                        i12 = iArr[i17 % iArr.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.m6.w0(i12, this.f46383a);
                    gm0Var.f46122g = false;
                    gm0Var.f46121f = false;
                    gm0Var.f46117a.setColor(w02);
                } else if (gpVar != null) {
                    ArrayList arrayList = gpVar.f22710c;
                    if (i16 >= 0 && i16 < arrayList.size()) {
                        this.f46387f[i16].f46129o = ((org.telegram.messenger.fp) arrayList.get(i16)).f22455c;
                        this.f46387f[i16].a((org.telegram.messenger.fp) arrayList.get(i16));
                    }
                }
                i16++;
                i15 = 2;
            }
        }
        float f13 = ((f10 - ((f12 * min2) + (f11 * min))) / 2.0f) + min2;
        if (this.f46387f != null) {
            int i18 = 0;
            float f14 = f13;
            float f15 = min3;
            while (i18 < this.f46387f.length) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(f14, f15, f14 + min, f15 + min);
                this.f46387f[i18].f46130p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f46387f[i18].f46131q.set(rectF);
                gm0 gm0Var2 = this.f46387f[i18];
                if (gm0Var2.f46129o == this.f46390s) {
                    z10 = z11;
                } else {
                    z10 = false;
                }
                gm0Var2.f46127m = z10;
                boolean z12 = z11;
                gm0Var2.f46128n.f(z10, z12);
                gm0Var2.f46132r.invalidate();
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
        this.f46386e = z9;
    }

    public void setDivider(boolean z9) {
        this.f46389r = z9;
        invalidate();
    }

    public void setOnColorClick(org.telegram.messenger.c20 c20Var) {
        this.f46391w = c20Var;
    }

    @Override
    public final void updateColors() {
        org.telegram.messenger.gp gpVar;
        boolean z9;
        int i7;
        if (this.f46387f == null) {
            return;
        }
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(this.d);
        int i10 = this.f46385c;
        if (i10 == 1) {
            gpVar = s12.f24878q4;
        } else {
            gpVar = s12.f24888r4;
        }
        int i11 = 0;
        while (true) {
            gm0[] gm0VarArr = this.f46387f;
            if (i11 < gm0VarArr.length) {
                org.telegram.ui.ActionBar.h6 h6Var = this.f46383a;
                int[] iArr = this.h;
                if (i10 == 2) {
                    gm0 gm0Var = gm0VarArr[i11];
                    int i12 = iArr[i11];
                    gm0Var.f46129o = i12;
                    if (i12 < 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    gm0Var.h = z9;
                    if (i12 < 0) {
                        i7 = org.telegram.ui.ActionBar.m6.f27874c8;
                    } else {
                        int[] iArr2 = org.telegram.ui.ActionBar.m6.f28151r8;
                        i7 = iArr2[i12 % iArr2.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
                    gm0Var.f46122g = false;
                    gm0Var.f46121f = false;
                    gm0Var.f46117a.setColor(w02);
                } else if (i11 < 7 && i10 == 1) {
                    gm0 gm0Var2 = gm0VarArr[i11];
                    int i13 = iArr[i11];
                    gm0Var2.f46129o = i13;
                    int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28151r8[i13], h6Var);
                    gm0Var2.f46122g = false;
                    gm0Var2.f46121f = false;
                    gm0Var2.f46117a.setColor(w03);
                } else if (gpVar != null) {
                    ArrayList arrayList = gpVar.f22710c;
                    if (i11 >= 0 && i11 < arrayList.size()) {
                        this.f46387f[i11].f46129o = ((org.telegram.messenger.fp) arrayList.get(i11)).f22455c;
                        this.f46387f[i11].a((org.telegram.messenger.fp) arrayList.get(i11));
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
