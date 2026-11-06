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
public final class wt extends View {
    public final org.telegram.ui.ActionBar.f6 D;
    public org.telegram.messenger.v10 E;
    public int F;
    public boolean G;
    public long H;
    public boolean I;
    public final int f40074a;
    public final Drawable[] f40075b;
    public final Drawable f40076c;
    public final Drawable d;
    public String f40077e;
    public boolean f40078f;
    public int h;
    public final int[] f40079n;
    public final int[] f40080r;
    public final Paint f40081s;
    public final RectF f40082w;
    public final w5 f40083x;
    public final w5 f40084y;

    public wt(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        float f10;
        if (org.telegram.messenger.g0.Q1()) {
            f10 = 40.0f;
        } else {
            f10 = 32.0f;
        }
        this.f40074a = org.telegram.messenger.g0.L(f10);
        this.f40075b = new Drawable[11];
        this.f40079n = new int[]{0, 0};
        this.f40080r = new int[]{0, 0};
        this.f40081s = new Paint(1);
        this.f40082w = new RectF();
        xq xqVar = xq.h;
        this.f40083x = new w5(this, 125L, xqVar);
        this.f40084y = new w5(this, 125L, xqVar);
        this.F = -1;
        this.G = true;
        this.D = f6Var;
        this.f40076c = getResources().getDrawable(2131232756);
        this.d = getResources().getDrawable(2131232757);
        a();
    }

    public final void a() {
        int i7 = org.telegram.ui.ActionBar.k6.f27921h5;
        org.telegram.ui.ActionBar.f6 f6Var = this.D;
        org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.w0(i7, f6Var), this.f40076c);
        org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.w0(i7, f6Var), this.d);
        org.telegram.messenger.h4.f22828b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bf, f6Var), PorterDuff.Mode.SRC_IN));
    }

    public String getEmoji() {
        return this.f40077e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        w5 w5Var;
        float f10;
        int L2;
        int W1;
        wt wtVar = this;
        int measuredWidth = wtVar.getMeasuredWidth();
        int measuredHeight = wtVar.getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f);
        Drawable drawable = wtVar.f40076c;
        boolean z9 = false;
        drawable.setBounds(0, 0, measuredWidth, measuredHeight);
        drawable.draw(canvas);
        int L3 = wtVar.h - org.telegram.messenger.g0.L(9.0f);
        int measuredHeight2 = wtVar.getMeasuredHeight() - org.telegram.messenger.g0.L(6.34f);
        int L4 = org.telegram.messenger.g0.L(9.0f) + wtVar.h;
        int measuredHeight3 = wtVar.getMeasuredHeight();
        Drawable drawable2 = wtVar.d;
        drawable2.setBounds(L3, measuredHeight2, L4, measuredHeight3);
        drawable2.draw(canvas);
        if (wtVar.f40077e != null) {
            boolean z10 = wtVar.f40078f;
            org.telegram.ui.ActionBar.f6 f6Var = wtVar.D;
            int[] iArr = wtVar.f40079n;
            w5 w5Var2 = wtVar.f40083x;
            Paint paint = wtVar.f40081s;
            Drawable[] drawableArr = wtVar.f40075b;
            RectF rectF = wtVar.f40082w;
            float f11 = 1.0f;
            int i7 = wtVar.f40074a;
            if (z10) {
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        w5Var = w5Var2;
                    } else {
                        w5Var = wtVar.f40084y;
                    }
                    float e10 = w5Var.e(z9, iArr[i10]);
                    boolean z11 = z9;
                    float max = Math.max(0.0f, Math.min(f11, -e10));
                    rectF.set((int) ((i7 * (e10 + f11)) + org.telegram.messenger.g0.L((f10 * 4.0f) + (Math.max(0.0f, Math.min(f11, f10)) * 3.0f) + 5.0f)), org.telegram.messenger.g0.W1(max, ((org.telegram.messenger.g0.L(f11) + i7) * i10) + org.telegram.messenger.g0.L(3.0f), (wtVar.getMeasuredHeight() - i7) / 2), L2 + i7, W1 + i7);
                    rectF.inset(org.telegram.messenger.g0.L(-2.0f), org.telegram.messenger.g0.L(max * (-2.0f)));
                    paint.setColor(org.telegram.ui.ActionBar.k6.r1(org.telegram.messenger.g0.T1(f11, 0.5f, max), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27940i6, f6Var)));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                    int i11 = z11;
                    while (i11 < 5) {
                        i11++;
                        int i12 = (i10 * 5) + i11;
                        int L5 = org.telegram.messenger.g0.L((i11 * 4) + 8) + (i7 * i11);
                        int L6 = ((org.telegram.messenger.g0.L(f11) + i7) * i10) + org.telegram.messenger.g0.L(3.0f);
                        drawableArr[i12].setBounds(L5, L6, L5 + i7, L6 + i7);
                        drawableArr[i12].draw(canvas);
                        f11 = f11;
                    }
                    i10++;
                    wtVar = this;
                    z9 = z11;
                }
                boolean z12 = z9;
                drawableArr[z12 ? 1 : 0].setBounds(org.telegram.messenger.g0.L(5.0f), (getMeasuredHeight() - i7) / 2, org.telegram.messenger.g0.L(5.0f) + i7, (getMeasuredHeight() + i7) / 2);
                drawableArr[z12 ? 1 : 0].draw(canvas);
                canvas.drawRect(org.telegram.messenger.g0.L(8.45f) + i7, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(8.45f) + i7 + 1, getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f), org.telegram.ui.ActionBar.k6.f27971k0);
                return;
            }
            float e11 = w5Var2.e(false, iArr[0]);
            int L7 = org.telegram.messenger.g0.L(5.0f);
            float f12 = L7;
            rectF.set((int) ((i7 * e11) + org.telegram.messenger.g0.L((e11 * 4.0f) + 5.0f)), f12, L + i7, L7 + i7);
            rectF.inset(org.telegram.messenger.g0.L(-2.0f), org.telegram.messenger.g0.L(-2.0f));
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27940i6, f6Var));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
            for (int i13 = 0; i13 < 6; i13++) {
                Drawable drawable3 = drawableArr[i13];
                if (drawable3 != null) {
                    int L8 = org.telegram.messenger.g0.L((i13 * 4) + 5) + (i7 * i13);
                    float min = ((1.0f - (Math.min(0.5f, Math.abs(i13 - e11)) * 2.0f)) * 0.1f) + 0.9f;
                    canvas.save();
                    canvas.scale(min, min, (i7 / 2.0f) + L8, (i7 / 2.0f) + f12);
                    drawable3.setBounds(L8, L7, L8 + i7, L7 + i7);
                    drawable3.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        int i7;
        int i10;
        boolean z10;
        int i11;
        if (this.I) {
            this.I = false;
            return false;
        } else if (!this.f40078f) {
            return super.onTouchEvent(motionEvent);
        } else {
            int i12 = 0;
            while (true) {
                Drawable[] drawableArr = this.f40075b;
                if (i12 < drawableArr.length) {
                    if (drawableArr[i12].getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) || ((i11 = this.F) != -1 && ((i12 == 0 || ((i11 == 0 && i12 >= 1 && i12 <= 5) || (i11 == 1 && i12 >= 6 && i12 <= 10))) && ((int) motionEvent.getX()) >= drawableArr[i12].getBounds().left && ((int) motionEvent.getX()) <= drawableArr[i12].getBounds().right))) {
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
            int[] iArr = this.f40079n;
            if (action == 0) {
                this.F = -1;
                this.H = System.currentTimeMillis();
                if (iArr[0] == iArr[1]) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.G = z10;
            }
            int i13 = iArr[0];
            int[] iArr2 = this.f40080r;
            iArr2[0] = i13;
            iArr2[1] = iArr[1];
            if (System.currentTimeMillis() - this.H > 300 && motionEvent.getAction() == 2) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (i12 == 0) {
                iArr[0] = -1;
                iArr[1] = -1;
            } else if (i12 >= 1 && i12 <= 5 && ((i10 = this.F) == -1 || i10 == 0)) {
                this.F = 0;
                int i14 = i12 - 1;
                iArr[0] = i14;
                if (iArr[1] == -1 || (this.G && z9)) {
                    iArr[1] = i14;
                }
            } else if (i12 >= 6 && i12 <= 10 && ((i7 = this.F) == -1 || i7 == 1)) {
                this.F = 1;
                int i15 = i12 - 6;
                iArr[1] = i15;
                if (iArr[0] == -1 || (this.G && z9)) {
                    iArr[0] = i15;
                }
            }
            if (iArr2[0] != iArr[0] || iArr2[1] != iArr[1]) {
                org.telegram.messenger.g0.c4(this);
                org.telegram.messenger.v10 v10Var = this.E;
                if (v10Var != null) {
                    v10Var.a(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
                }
            }
            invalidate();
            if (motionEvent.getAction() == 1) {
                this.F = -1;
            }
            return true;
        }
    }

    public void setArrowX(int i7) {
        this.h = i7;
        invalidate();
    }

    public void setOnSelectionUpdateListener(org.telegram.messenger.v10 v10Var) {
        this.E = v10Var;
    }
}
