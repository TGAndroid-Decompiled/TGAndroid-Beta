package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
public final class vt extends View {
    public final org.telegram.ui.ActionBar.e6 E;
    public org.telegram.messenger.n10 F;
    public int G;
    public boolean H;
    public long I;
    public boolean J;
    public final int f39784a;
    public final Drawable[] f39785b;
    public final Drawable f39786c;
    public final Drawable d;
    public String f39787e;
    public boolean f39788f;
    public int h;
    public final int[] f39789n;
    public final int[] f39790r;
    public final Paint f39791s;
    public final RectF f39792w;
    public final u5 f39793x;
    public final u5 f39794y;

    public vt(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        float f10;
        if (org.telegram.messenger.g0.Q1()) {
            f10 = 40.0f;
        } else {
            f10 = 32.0f;
        }
        this.f39784a = org.telegram.messenger.g0.L(f10);
        this.f39785b = new Drawable[11];
        this.f39789n = new int[]{0, 0};
        this.f39790r = new int[]{0, 0};
        this.f39791s = new Paint(1);
        this.f39792w = new RectF();
        xq xqVar = xq.h;
        this.f39793x = new u5(this, 125L, xqVar);
        this.f39794y = new u5(this, 125L, xqVar);
        this.G = -1;
        this.H = true;
        this.E = e6Var;
        this.f39786c = getResources().getDrawable(2131232754);
        this.d = getResources().getDrawable(2131232755);
        a();
    }

    public final void a() {
        int i3 = org.telegram.ui.ActionBar.k6.f27954h5;
        org.telegram.ui.ActionBar.e6 e6Var = this.E;
        org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.w0(i3, e6Var), this.f39786c);
        org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.w0(i3, e6Var), this.d);
        org.telegram.messenger.h4.f22884b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bf, e6Var), PorterDuff.Mode.SRC_IN));
    }

    public String getEmoji() {
        return this.f39787e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        u5 u5Var;
        float f10;
        int L2;
        int W1;
        vt vtVar = this;
        int measuredWidth = vtVar.getMeasuredWidth();
        int measuredHeight = vtVar.getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f);
        Drawable drawable = vtVar.f39786c;
        boolean z10 = false;
        drawable.setBounds(0, 0, measuredWidth, measuredHeight);
        drawable.draw(canvas);
        int L3 = vtVar.h - org.telegram.messenger.g0.L(9.0f);
        int measuredHeight2 = vtVar.getMeasuredHeight() - org.telegram.messenger.g0.L(6.34f);
        int L4 = org.telegram.messenger.g0.L(9.0f) + vtVar.h;
        int measuredHeight3 = vtVar.getMeasuredHeight();
        Drawable drawable2 = vtVar.d;
        drawable2.setBounds(L3, measuredHeight2, L4, measuredHeight3);
        drawable2.draw(canvas);
        if (vtVar.f39787e != null) {
            boolean z11 = vtVar.f39788f;
            org.telegram.ui.ActionBar.e6 e6Var = vtVar.E;
            int[] iArr = vtVar.f39789n;
            u5 u5Var2 = vtVar.f39793x;
            Paint paint = vtVar.f39791s;
            Drawable[] drawableArr = vtVar.f39785b;
            RectF rectF = vtVar.f39792w;
            float f11 = 1.0f;
            int i3 = vtVar.f39784a;
            if (z11) {
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        u5Var = u5Var2;
                    } else {
                        u5Var = vtVar.f39794y;
                    }
                    float e10 = u5Var.e(z10, iArr[i10]);
                    boolean z12 = z10;
                    float max = Math.max(0.0f, Math.min(f11, -e10));
                    rectF.set((int) ((i3 * (e10 + f11)) + org.telegram.messenger.g0.L((f10 * 4.0f) + (Math.max(0.0f, Math.min(f11, f10)) * 3.0f) + 5.0f)), org.telegram.messenger.g0.W1(max, ((org.telegram.messenger.g0.L(f11) + i3) * i10) + org.telegram.messenger.g0.L(3.0f), (vtVar.getMeasuredHeight() - i3) / 2), L2 + i3, W1 + i3);
                    rectF.inset(org.telegram.messenger.g0.L(-2.0f), org.telegram.messenger.g0.L(max * (-2.0f)));
                    paint.setColor(org.telegram.ui.ActionBar.k6.r1(org.telegram.messenger.g0.T1(f11, 0.5f, max), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27972i6, e6Var)));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                    int i11 = z12;
                    while (i11 < 5) {
                        i11++;
                        int i12 = (i10 * 5) + i11;
                        int L5 = org.telegram.messenger.g0.L((i11 * 4) + 8) + (i3 * i11);
                        int L6 = ((org.telegram.messenger.g0.L(f11) + i3) * i10) + org.telegram.messenger.g0.L(3.0f);
                        drawableArr[i12].setBounds(L5, L6, L5 + i3, L6 + i3);
                        drawableArr[i12].draw(canvas);
                        f11 = f11;
                    }
                    i10++;
                    vtVar = this;
                    z10 = z12;
                }
                boolean z13 = z10;
                drawableArr[z13 ? 1 : 0].setBounds(org.telegram.messenger.g0.L(5.0f), (getMeasuredHeight() - i3) / 2, org.telegram.messenger.g0.L(5.0f) + i3, (getMeasuredHeight() + i3) / 2);
                drawableArr[z13 ? 1 : 0].draw(canvas);
                canvas.drawRect(org.telegram.messenger.g0.L(8.45f) + i3, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(8.45f) + i3 + 1, getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f), org.telegram.ui.ActionBar.k6.f28002k0);
                return;
            }
            float e11 = u5Var2.e(false, iArr[0]);
            int L7 = org.telegram.messenger.g0.L(5.0f);
            float f12 = L7;
            rectF.set((int) ((i3 * e11) + org.telegram.messenger.g0.L((e11 * 4.0f) + 5.0f)), f12, L + i3, L7 + i3);
            rectF.inset(org.telegram.messenger.g0.L(-2.0f), org.telegram.messenger.g0.L(-2.0f));
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27972i6, e6Var));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
            for (int i13 = 0; i13 < 6; i13++) {
                Drawable drawable3 = drawableArr[i13];
                if (drawable3 != null) {
                    int L8 = org.telegram.messenger.g0.L((i13 * 4) + 5) + (i3 * i13);
                    float min = ((1.0f - (Math.min(0.5f, Math.abs(i13 - e11)) * 2.0f)) * 0.1f) + 0.9f;
                    canvas.save();
                    canvas.scale(min, min, (i3 / 2.0f) + L8, (i3 / 2.0f) + f12);
                    drawable3.setBounds(L8, L7, L8 + i3, L7 + i3);
                    drawable3.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i3;
        int i10;
        boolean z11;
        int i11;
        if (this.J) {
            this.J = false;
            return false;
        } else if (!this.f39788f) {
            return super.onTouchEvent(motionEvent);
        } else {
            int i12 = 0;
            while (true) {
                Drawable[] drawableArr = this.f39785b;
                if (i12 < drawableArr.length) {
                    if (drawableArr[i12].getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) || ((i11 = this.G) != -1 && ((i12 == 0 || ((i11 == 0 && i12 >= 1 && i12 <= 5) || (i11 == 1 && i12 >= 6 && i12 <= 10))) && ((int) motionEvent.getX()) >= drawableArr[i12].getBounds().left && ((int) motionEvent.getX()) <= drawableArr[i12].getBounds().right))) {
                        break;
                    }
                    i12++;
                } else {
                    i12 = -1;
                    break;
                }
            }
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2 && motionEvent.getAction() != 1) {
                return false;
            }
            int action = motionEvent.getAction();
            int[] iArr = this.f39789n;
            if (action == 0) {
                this.G = -1;
                this.I = System.currentTimeMillis();
                if (iArr[0] == iArr[1]) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.H = z11;
            }
            int i13 = iArr[0];
            int[] iArr2 = this.f39790r;
            iArr2[0] = i13;
            iArr2[1] = iArr[1];
            if (System.currentTimeMillis() - this.I > 300 && motionEvent.getAction() == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i12 == 0) {
                iArr[0] = -1;
                iArr[1] = -1;
            } else if (i12 >= 1 && i12 <= 5 && ((i10 = this.G) == -1 || i10 == 0)) {
                this.G = 0;
                int i14 = i12 - 1;
                iArr[0] = i14;
                if (iArr[1] == -1 || (this.H && z10)) {
                    iArr[1] = i14;
                }
            } else if (i12 >= 6 && i12 <= 10 && ((i3 = this.G) == -1 || i3 == 1)) {
                this.G = 1;
                int i15 = i12 - 6;
                iArr[1] = i15;
                if (iArr[0] == -1 || (this.H && z10)) {
                    iArr[0] = i15;
                }
            }
            if (iArr2[0] != iArr[0] || iArr2[1] != iArr[1]) {
                org.telegram.messenger.g0.c4(this);
                org.telegram.messenger.n10 n10Var = this.F;
                if (n10Var != null) {
                    n10Var.a(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
                }
            }
            invalidate();
            if (motionEvent.getAction() == 1) {
                this.G = -1;
            }
            return true;
        }
    }

    public void setArrowX(int i3) {
        this.h = i3;
        invalidate();
    }

    public void setOnSelectionUpdateListener(org.telegram.messenger.n10 n10Var) {
        this.F = n10Var;
    }
}
