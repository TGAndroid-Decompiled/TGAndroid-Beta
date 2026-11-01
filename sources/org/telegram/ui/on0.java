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
public final class on0 extends View implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 f40194a;
    public final Paint f40195b;
    public final int f40196c;
    public final int d;
    public boolean e;
    public nn0[] f40197f;
    public final int[] h;
    public final Paint f40198n;
    public boolean f40199r;
    public int f40200s;
    public org.telegram.messenger.r20 f40201w;
    public nn0 f40202x;

    public on0(int i10, int i11, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f40195b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.f40198n = new Paint(1);
        this.f40199r = true;
        this.f40200s = 0;
        this.f40196c = i10;
        this.d = i11;
        this.f40194a = p6Var;
    }

    public final void a(int i10, boolean z10) {
        boolean z11;
        this.f40200s = i10;
        if (this.f40197f != null) {
            int i11 = 0;
            while (true) {
                nn0[] nn0VarArr = this.f40197f;
                if (i11 < nn0VarArr.length) {
                    nn0 nn0Var = nn0VarArr[i11];
                    if (nn0Var.f39946o == i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    nn0Var.f39944m = z11;
                    if (!z10) {
                        nn0Var.f39945n.f(z11, true);
                    }
                    nn0Var.f39949r.invalidate();
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f40197f != null) {
            int i10 = 0;
            while (true) {
                nn0[] nn0VarArr = this.f40197f;
                if (i10 >= nn0VarArr.length) {
                    break;
                }
                nn0 nn0Var = nn0VarArr[i10];
                on0 on0Var = nn0Var.f39949r;
                Path path = nn0Var.e;
                canvas.save();
                float a2 = nn0Var.f39943l.a(0.05f);
                RectF rectF = nn0Var.f39947p;
                canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = nn0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(nn0Var.f39935a);
                if (nn0Var.f39938f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, nn0Var.f39936b);
                }
                canvas.restore();
                if (nn0Var.f39939g) {
                    canvas.save();
                    RectF rectF2 = org.telegram.messenger.i0.P;
                    float width = (rectF.width() * 0.315f) / 2.0f;
                    rectF2.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(2.33f), org.telegram.messenger.i0.L(2.33f), nn0Var.f39937c);
                    canvas.restore();
                }
                float d = nn0Var.f39945n.d(nn0Var.f39944m);
                if (d > 0.0f) {
                    Paint paint = on0Var.f40195b;
                    Paint paint2 = on0Var.f40195b;
                    paint.setStrokeWidth(org.telegram.messenger.i0.N(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, on0Var.f40194a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (org.telegram.messenger.i0.T1(0.5f, -2.0f, d) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (nn0Var.h) {
                    if (on0Var.e) {
                        if (nn0Var.f39942k == null) {
                            Drawable drawable = on0Var.getContext().getResources().getDrawable(2131232242);
                            nn0Var.f39942k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        nn0Var.f39942k.setBounds((int) org.telegram.messenger.a30.v(nn0Var.f39942k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.a30.v(nn0Var.f39942k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) a1.g.c(nn0Var.f39942k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) a1.g.c(nn0Var.f39942k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        nn0Var.f39942k.draw(canvas);
                    } else {
                        if (nn0Var.f39940i == null) {
                            nn0Var.f39940i = new Path();
                        }
                        if (nn0Var.f39941j == null) {
                            Paint paint3 = new Paint(1);
                            nn0Var.f39941j = paint3;
                            paint3.setColor(-1);
                            nn0Var.f39941j.setStyle(Paint.Style.STROKE);
                            nn0Var.f39941j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        nn0Var.f39941j.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
                        nn0Var.f39940i.rewind();
                        float W1 = org.telegram.messenger.i0.W1(d, org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(4.0f));
                        nn0Var.f39940i.moveTo(rectF.centerX() - W1, rectF.centerY() - W1);
                        nn0Var.f39940i.lineTo(rectF.centerX() + W1, rectF.centerY() + W1);
                        nn0Var.f39940i.moveTo(rectF.centerX() + W1, rectF.centerY() - W1);
                        nn0Var.f39940i.lineTo(rectF.centerX() - W1, rectF.centerY() + W1);
                        canvas.drawPath(nn0Var.f39940i, nn0Var.f39941j);
                    }
                }
                canvas.restore();
                i10++;
            }
        }
        if (this.f40199r) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20931d7, this.f40194a);
            Paint paint4 = this.f40198n;
            paint4.setColor(w02);
            canvas.drawRect(org.telegram.messenger.i0.L(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.i0.L(21.0f), getMeasuredHeight(), paint4);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.on0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getColorId() {
        return this.f40200s;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.messenger.mp mpVar;
        int size;
        int i12;
        boolean z10;
        int i13;
        boolean z11;
        int size2 = View.MeasureSpec.getSize(i10);
        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(this.d);
        int i14 = this.f40196c;
        if (i14 == 1) {
            mpVar = r12.f19231r4;
        } else {
            mpVar = r12.f19241s4;
        }
        if (mpVar == null) {
            size = 0;
        } else {
            size = mpVar.f17166c.size();
        }
        int i15 = 8;
        int i16 = 2;
        if (i14 == 2) {
            size = 8;
        }
        if (i14 != 2 && i14 == 1) {
            i15 = 7;
        }
        float f7 = size2;
        float f10 = i15;
        float f11 = i15 + 1;
        float min = Math.min(org.telegram.messenger.i0.L(54.0f), f7 / ((f11 * 0.28947f) + f10));
        float min2 = Math.min(0.28947f * min, org.telegram.messenger.i0.L(8.0f));
        float min3 = Math.min(0.31578946f * min, org.telegram.messenger.i0.L(11.33f));
        boolean z12 = true;
        setMeasuredDimension(size2, (int) (((i12 + 1) * min3) + ((size / i15) * min)));
        nn0[] nn0VarArr = this.f40197f;
        if (nn0VarArr == null || nn0VarArr.length != size) {
            this.f40197f = new nn0[size];
            int i17 = 0;
            while (i17 < size) {
                this.f40197f[i17] = new nn0(this);
                if (i14 == i16) {
                    nn0 nn0Var = this.f40197f[i17];
                    int i18 = this.h[i17];
                    nn0Var.f39946o = i18;
                    if (i18 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    nn0Var.h = z10;
                    if (i18 < 0) {
                        i13 = org.telegram.ui.ActionBar.t6.f20913c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.t6.f21189r8;
                        i13 = iArr[i18 % iArr.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.t6.w0(i13, this.f40194a);
                    nn0Var.f39939g = false;
                    nn0Var.f39938f = false;
                    nn0Var.f39935a.setColor(w02);
                } else if (mpVar != null) {
                    ArrayList arrayList = mpVar.f17166c;
                    if (i17 >= 0 && i17 < arrayList.size()) {
                        this.f40197f[i17].f39946o = ((org.telegram.messenger.lp) arrayList.get(i17)).f16986c;
                        this.f40197f[i17].a((org.telegram.messenger.lp) arrayList.get(i17));
                    }
                }
                i17++;
                i16 = 2;
            }
        }
        float f12 = ((f7 - ((f11 * min2) + (f10 * min))) / 2.0f) + min2;
        if (this.f40197f != null) {
            int i19 = 0;
            float f13 = f12;
            float f14 = min3;
            while (i19 < this.f40197f.length) {
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(f13, f14, f13 + min, f14 + min);
                this.f40197f[i19].f39947p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f40197f[i19].f39948q.set(rectF);
                nn0 nn0Var2 = this.f40197f[i19];
                if (nn0Var2.f39946o == this.f40200s) {
                    z11 = z12;
                } else {
                    z11 = false;
                }
                nn0Var2.f39944m = z11;
                boolean z13 = z12;
                nn0Var2.f39945n.f(z11, z13);
                nn0Var2.f39949r.invalidate();
                if (i19 % i15 == i15 - 1) {
                    f14 += min + min3;
                    f13 = f12;
                } else {
                    f13 = min + min2 + f13;
                }
                i19++;
                z12 = z13;
            }
        }
    }

    public void setCloseAsLock(boolean z10) {
        this.e = z10;
    }

    public void setDivider(boolean z10) {
        this.f40199r = z10;
        invalidate();
    }

    public void setOnColorClick(org.telegram.messenger.r20 r20Var) {
        this.f40201w = r20Var;
    }

    @Override
    public final void updateColors() {
        org.telegram.messenger.mp mpVar;
        boolean z10;
        int i10;
        if (this.f40197f == null) {
            return;
        }
        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(this.d);
        int i11 = this.f40196c;
        if (i11 == 1) {
            mpVar = r12.f19231r4;
        } else {
            mpVar = r12.f19241s4;
        }
        int i12 = 0;
        while (true) {
            nn0[] nn0VarArr = this.f40197f;
            if (i12 < nn0VarArr.length) {
                org.telegram.ui.ActionBar.p6 p6Var = this.f40194a;
                int[] iArr = this.h;
                if (i11 == 2) {
                    nn0 nn0Var = nn0VarArr[i12];
                    int i13 = iArr[i12];
                    nn0Var.f39946o = i13;
                    if (i13 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    nn0Var.h = z10;
                    if (i13 < 0) {
                        i10 = org.telegram.ui.ActionBar.t6.f20913c8;
                    } else {
                        int[] iArr2 = org.telegram.ui.ActionBar.t6.f21189r8;
                        i10 = iArr2[i13 % iArr2.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
                    nn0Var.f39939g = false;
                    nn0Var.f39938f = false;
                    nn0Var.f39935a.setColor(w02);
                } else if (i12 < 7 && i11 == 1) {
                    nn0 nn0Var2 = nn0VarArr[i12];
                    int i14 = iArr[i12];
                    nn0Var2.f39946o = i14;
                    int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21189r8[i14], p6Var);
                    nn0Var2.f39939g = false;
                    nn0Var2.f39938f = false;
                    nn0Var2.f39935a.setColor(w03);
                } else if (mpVar != null) {
                    ArrayList arrayList = mpVar.f17166c;
                    if (i12 >= 0 && i12 < arrayList.size()) {
                        this.f40197f[i12].f39946o = ((org.telegram.messenger.lp) arrayList.get(i12)).f16986c;
                        this.f40197f[i12].a((org.telegram.messenger.lp) arrayList.get(i12));
                    }
                }
                i12++;
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
