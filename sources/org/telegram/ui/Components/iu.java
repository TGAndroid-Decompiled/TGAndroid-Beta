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
public final class iu extends View {
    public final org.telegram.ui.ActionBar.p6 D;
    public org.telegram.messenger.j20 E;
    public int F;
    public boolean G;
    public long H;
    public boolean I;
    public final int f27085a;
    public final Drawable[] f27086b;
    public final Drawable f27087c;
    public final Drawable d;
    public String e;
    public boolean f27088f;
    public int h;
    public final int[] f27089n;
    public final int[] f27090r;
    public final Paint f27091s;
    public final RectF f27092w;
    public final t5 f27093x;
    public final t5 f27094y;

    public iu(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        float f7;
        if (org.telegram.messenger.i0.Q1()) {
            f7 = 40.0f;
        } else {
            f7 = 32.0f;
        }
        this.f27085a = org.telegram.messenger.i0.L(f7);
        this.f27086b = new Drawable[11];
        this.f27089n = new int[]{0, 0};
        this.f27090r = new int[]{0, 0};
        this.f27091s = new Paint(1);
        this.f27092w = new RectF();
        gr grVar = gr.h;
        this.f27093x = new t5(this, 125L, grVar);
        this.f27094y = new t5(this, 125L, grVar);
        this.F = -1;
        this.G = true;
        this.D = p6Var;
        this.f27087c = getResources().getDrawable(2131232753);
        this.d = getResources().getDrawable(2131232754);
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.t6.f21001h5;
        org.telegram.ui.ActionBar.p6 p6Var = this.D;
        org.telegram.ui.ActionBar.t6.C1(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), this.f27087c);
        org.telegram.ui.ActionBar.t6.C1(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), this.d);
        org.telegram.messenger.k4.f16524b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Bf, p6Var), PorterDuff.Mode.SRC_IN));
    }

    public String getEmoji() {
        return this.e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        t5 t5Var;
        float f7;
        int L2;
        int W1;
        iu iuVar = this;
        int measuredWidth = iuVar.getMeasuredWidth();
        int measuredHeight = iuVar.getMeasuredHeight() - org.telegram.messenger.i0.L(2.0f);
        Drawable drawable = iuVar.f27087c;
        boolean z10 = false;
        drawable.setBounds(0, 0, measuredWidth, measuredHeight);
        drawable.draw(canvas);
        int L3 = iuVar.h - org.telegram.messenger.i0.L(9.0f);
        int measuredHeight2 = iuVar.getMeasuredHeight() - org.telegram.messenger.i0.L(6.34f);
        int L4 = org.telegram.messenger.i0.L(9.0f) + iuVar.h;
        int measuredHeight3 = iuVar.getMeasuredHeight();
        Drawable drawable2 = iuVar.d;
        drawable2.setBounds(L3, measuredHeight2, L4, measuredHeight3);
        drawable2.draw(canvas);
        if (iuVar.e != null) {
            boolean z11 = iuVar.f27088f;
            org.telegram.ui.ActionBar.p6 p6Var = iuVar.D;
            int[] iArr = iuVar.f27089n;
            t5 t5Var2 = iuVar.f27093x;
            Paint paint = iuVar.f27091s;
            Drawable[] drawableArr = iuVar.f27086b;
            RectF rectF = iuVar.f27092w;
            float f10 = 1.0f;
            int i10 = iuVar.f27085a;
            if (z11) {
                int i11 = 0;
                while (i11 < 2) {
                    if (i11 == 0) {
                        t5Var = t5Var2;
                    } else {
                        t5Var = iuVar.f27094y;
                    }
                    float e = t5Var.e(z10, iArr[i11]);
                    boolean z12 = z10;
                    float max = Math.max(0.0f, Math.min(f10, -e));
                    rectF.set((int) ((i10 * (e + f10)) + org.telegram.messenger.i0.L((f7 * 4.0f) + (Math.max(0.0f, Math.min(f10, f7)) * 3.0f) + 5.0f)), org.telegram.messenger.i0.W1(max, ((org.telegram.messenger.i0.L(f10) + i10) * i11) + org.telegram.messenger.i0.L(3.0f), (iuVar.getMeasuredHeight() - i10) / 2), L2 + i10, W1 + i10);
                    rectF.inset(org.telegram.messenger.i0.L(-2.0f), org.telegram.messenger.i0.L(max * (-2.0f)));
                    paint.setColor(org.telegram.ui.ActionBar.t6.r1(org.telegram.messenger.i0.T1(f10, 0.5f, max), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21020i6, p6Var)));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint);
                    int i12 = z12;
                    while (i12 < 5) {
                        i12++;
                        int i13 = (i11 * 5) + i12;
                        int L5 = org.telegram.messenger.i0.L((i12 * 4) + 8) + (i10 * i12);
                        int L6 = ((org.telegram.messenger.i0.L(f10) + i10) * i11) + org.telegram.messenger.i0.L(3.0f);
                        drawableArr[i13].setBounds(L5, L6, L5 + i10, L6 + i10);
                        drawableArr[i13].draw(canvas);
                        f10 = f10;
                    }
                    i11++;
                    iuVar = this;
                    z10 = z12;
                }
                boolean z13 = z10;
                drawableArr[z13 ? 1 : 0].setBounds(org.telegram.messenger.i0.L(5.0f), (getMeasuredHeight() - i10) / 2, org.telegram.messenger.i0.L(5.0f) + i10, (getMeasuredHeight() + i10) / 2);
                drawableArr[z13 ? 1 : 0].draw(canvas);
                canvas.drawRect(org.telegram.messenger.i0.L(8.45f) + i10, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(8.45f) + i10 + 1, getMeasuredHeight() - org.telegram.messenger.i0.L(6.0f), org.telegram.ui.ActionBar.t6.f21052k0);
                return;
            }
            float e7 = t5Var2.e(false, iArr[0]);
            int L7 = org.telegram.messenger.i0.L(5.0f);
            float f11 = L7;
            rectF.set((int) ((i10 * e7) + org.telegram.messenger.i0.L((e7 * 4.0f) + 5.0f)), f11, L + i10, L7 + i10);
            rectF.inset(org.telegram.messenger.i0.L(-2.0f), org.telegram.messenger.i0.L(-2.0f));
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21020i6, p6Var));
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint);
            for (int i14 = 0; i14 < 6; i14++) {
                Drawable drawable3 = drawableArr[i14];
                if (drawable3 != null) {
                    int L8 = org.telegram.messenger.i0.L((i14 * 4) + 5) + (i10 * i14);
                    float min = ((1.0f - (Math.min(0.5f, Math.abs(i14 - e7)) * 2.0f)) * 0.1f) + 0.9f;
                    canvas.save();
                    canvas.scale(min, min, (i10 / 2.0f) + L8, (i10 / 2.0f) + f11);
                    drawable3.setBounds(L8, L7, L8 + i10, L7 + i10);
                    drawable3.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10;
        int i11;
        boolean z11;
        int i12;
        if (this.I) {
            this.I = false;
            return false;
        } else if (!this.f27088f) {
            return super.onTouchEvent(motionEvent);
        } else {
            int i13 = 0;
            while (true) {
                Drawable[] drawableArr = this.f27086b;
                if (i13 < drawableArr.length) {
                    if (drawableArr[i13].getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) || ((i12 = this.F) != -1 && ((i13 == 0 || ((i12 == 0 && i13 >= 1 && i13 <= 5) || (i12 == 1 && i13 >= 6 && i13 <= 10))) && ((int) motionEvent.getX()) >= drawableArr[i13].getBounds().left && ((int) motionEvent.getX()) <= drawableArr[i13].getBounds().right))) {
                        break;
                    }
                    i13++;
                } else {
                    i13 = -1;
                    break;
                }
            }
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2 && motionEvent.getAction() != 1) {
                return false;
            }
            int action = motionEvent.getAction();
            int[] iArr = this.f27089n;
            if (action == 0) {
                this.F = -1;
                this.H = System.currentTimeMillis();
                if (iArr[0] == iArr[1]) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.G = z11;
            }
            int i14 = iArr[0];
            int[] iArr2 = this.f27090r;
            iArr2[0] = i14;
            iArr2[1] = iArr[1];
            if (System.currentTimeMillis() - this.H > 300 && motionEvent.getAction() == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i13 == 0) {
                iArr[0] = -1;
                iArr[1] = -1;
            } else if (i13 >= 1 && i13 <= 5 && ((i11 = this.F) == -1 || i11 == 0)) {
                this.F = 0;
                int i15 = i13 - 1;
                iArr[0] = i15;
                if (iArr[1] == -1 || (this.G && z10)) {
                    iArr[1] = i15;
                }
            } else if (i13 >= 6 && i13 <= 10 && ((i10 = this.F) == -1 || i10 == 1)) {
                this.F = 1;
                int i16 = i13 - 6;
                iArr[1] = i16;
                if (iArr[0] == -1 || (this.G && z10)) {
                    iArr[0] = i16;
                }
            }
            if (iArr2[0] != iArr[0] || iArr2[1] != iArr[1]) {
                org.telegram.messenger.i0.b4(this);
                org.telegram.messenger.j20 j20Var = this.E;
                if (j20Var != null) {
                    j20Var.a(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
                }
            }
            invalidate();
            if (motionEvent.getAction() == 1) {
                this.F = -1;
            }
            return true;
        }
    }

    public void setArrowX(int i10) {
        this.h = i10;
        invalidate();
    }

    public void setOnSelectionUpdateListener(org.telegram.messenger.j20 j20Var) {
        this.E = j20Var;
    }
}
