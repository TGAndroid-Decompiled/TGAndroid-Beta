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
public final class hu extends View {
    public final org.telegram.ui.ActionBar.i6 E;
    public org.telegram.messenger.p10 F;
    public int G;
    public boolean H;
    public long I;
    public boolean J;
    public final int f35820a;
    public final Drawable[] f35821b;
    public final Drawable f35822c;
    public final Drawable d;
    public String f35823e;
    public boolean f35824f;
    public int h;
    public final int[] f35825n;
    public final int[] f35826r;
    public final Paint f35827s;
    public final RectF f35828w;
    public final c6 f35829x;
    public final c6 f35830y;

    public hu(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        float f10;
        if (org.telegram.messenger.g0.Q1()) {
            f10 = 40.0f;
        } else {
            f10 = 32.0f;
        }
        this.f35820a = org.telegram.messenger.g0.L(f10);
        this.f35821b = new Drawable[11];
        this.f35825n = new int[]{0, 0};
        this.f35826r = new int[]{0, 0};
        this.f35827s = new Paint(1);
        this.f35828w = new RectF();
        kr krVar = kr.h;
        this.f35829x = new c6(this, 125L, krVar);
        this.f35830y = new c6(this, 125L, krVar);
        this.G = -1;
        this.H = true;
        this.E = i6Var;
        this.f35822c = getResources().getDrawable(2131232761);
        this.d = getResources().getDrawable(2131232762);
        a();
    }

    public final void a() {
        int i7 = org.telegram.ui.ActionBar.n6.f29524h5;
        org.telegram.ui.ActionBar.i6 i6Var = this.E;
        org.telegram.ui.ActionBar.n6.C1(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), this.f35822c);
        org.telegram.ui.ActionBar.n6.C1(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), this.d);
        org.telegram.messenger.j4.f24917b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ef, i6Var), PorterDuff.Mode.SRC_IN));
    }

    public String getEmoji() {
        return this.f35823e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        c6 c6Var;
        float f10;
        int L2;
        int W1;
        hu huVar = this;
        int measuredWidth = huVar.getMeasuredWidth();
        int measuredHeight = huVar.getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f);
        Drawable drawable = huVar.f35822c;
        boolean z10 = false;
        drawable.setBounds(0, 0, measuredWidth, measuredHeight);
        drawable.draw(canvas);
        int L3 = huVar.h - org.telegram.messenger.g0.L(9.0f);
        int measuredHeight2 = huVar.getMeasuredHeight() - org.telegram.messenger.g0.L(6.34f);
        int L4 = org.telegram.messenger.g0.L(9.0f) + huVar.h;
        int measuredHeight3 = huVar.getMeasuredHeight();
        Drawable drawable2 = huVar.d;
        drawable2.setBounds(L3, measuredHeight2, L4, measuredHeight3);
        drawable2.draw(canvas);
        if (huVar.f35823e != null) {
            boolean z11 = huVar.f35824f;
            org.telegram.ui.ActionBar.i6 i6Var = huVar.E;
            int[] iArr = huVar.f35825n;
            c6 c6Var2 = huVar.f35829x;
            Paint paint = huVar.f35827s;
            Drawable[] drawableArr = huVar.f35821b;
            RectF rectF = huVar.f35828w;
            float f11 = 1.0f;
            int i7 = huVar.f35820a;
            if (z11) {
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        c6Var = c6Var2;
                    } else {
                        c6Var = huVar.f35830y;
                    }
                    float e10 = c6Var.e(z10, iArr[i10]);
                    boolean z12 = z10;
                    float max = Math.max(0.0f, Math.min(f11, -e10));
                    rectF.set((int) ((i7 * (e10 + f11)) + org.telegram.messenger.g0.L((f10 * 4.0f) + (Math.max(0.0f, Math.min(f11, f10)) * 3.0f) + 5.0f)), org.telegram.messenger.g0.W1(max, ((org.telegram.messenger.g0.L(f11) + i7) * i10) + org.telegram.messenger.g0.L(3.0f), (huVar.getMeasuredHeight() - i7) / 2), L2 + i7, W1 + i7);
                    rectF.inset(org.telegram.messenger.g0.L(-2.0f), org.telegram.messenger.g0.L(max * (-2.0f)));
                    paint.setColor(org.telegram.ui.ActionBar.n6.r1(org.telegram.messenger.g0.T1(f11, 0.5f, max), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29543i6, i6Var)));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                    int i11 = z12;
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
                    huVar = this;
                    z10 = z12;
                }
                boolean z13 = z10;
                drawableArr[z13 ? 1 : 0].setBounds(org.telegram.messenger.g0.L(5.0f), (getMeasuredHeight() - i7) / 2, org.telegram.messenger.g0.L(5.0f) + i7, (getMeasuredHeight() + i7) / 2);
                drawableArr[z13 ? 1 : 0].draw(canvas);
                canvas.drawRect(org.telegram.messenger.g0.L(8.45f) + i7, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(8.45f) + i7 + 1, getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f), org.telegram.ui.ActionBar.n6.f29574k0);
                return;
            }
            float e11 = c6Var2.e(false, iArr[0]);
            int L7 = org.telegram.messenger.g0.L(5.0f);
            float f12 = L7;
            rectF.set((int) ((i7 * e11) + org.telegram.messenger.g0.L((e11 * 4.0f) + 5.0f)), f12, L + i7, L7 + i7);
            rectF.inset(org.telegram.messenger.g0.L(-2.0f), org.telegram.messenger.g0.L(-2.0f));
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29543i6, i6Var));
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
        boolean z10;
        int i7;
        int i10;
        boolean z11;
        int i11;
        if (this.J) {
            this.J = false;
            return false;
        } else if (!this.f35824f) {
            return super.onTouchEvent(motionEvent);
        } else {
            int i12 = 0;
            while (true) {
                Drawable[] drawableArr = this.f35821b;
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
            int[] iArr = this.f35825n;
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
            int[] iArr2 = this.f35826r;
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
            } else if (i12 >= 6 && i12 <= 10 && ((i7 = this.G) == -1 || i7 == 1)) {
                this.G = 1;
                int i15 = i12 - 6;
                iArr[1] = i15;
                if (iArr[0] == -1 || (this.H && z10)) {
                    iArr[0] = i15;
                }
            }
            if (iArr2[0] != iArr[0] || iArr2[1] != iArr[1]) {
                org.telegram.messenger.g0.a4(this);
                org.telegram.messenger.p10 p10Var = this.F;
                if (p10Var != null) {
                    p10Var.a(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
                }
            }
            invalidate();
            if (motionEvent.getAction() == 1) {
                this.G = -1;
            }
            return true;
        }
    }

    public void setArrowX(int i7) {
        this.h = i7;
        invalidate();
    }

    public void setOnSelectionUpdateListener(org.telegram.messenger.p10 p10Var) {
        this.F = p10Var;
    }
}
