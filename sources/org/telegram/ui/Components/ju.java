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
public final class ju extends View {
    public final org.telegram.ui.ActionBar.h6 E;
    public org.telegram.messenger.r10 F;
    public int G;
    public boolean H;
    public long I;
    public boolean J;
    public final int f36686a;
    public final Drawable[] f36687b;
    public final Drawable f36688c;
    public final Drawable d;
    public String f36689e;
    public boolean f36690f;
    public int h;
    public final int[] f36691n;
    public final int[] f36692r;
    public final Paint f36693s;
    public final RectF f36694w;
    public final d6 f36695x;
    public final d6 f36696y;

    public ju(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        float f10;
        if (org.telegram.messenger.g0.Q1()) {
            f10 = 40.0f;
        } else {
            f10 = 32.0f;
        }
        this.f36686a = org.telegram.messenger.g0.L(f10);
        this.f36687b = new Drawable[11];
        this.f36691n = new int[]{0, 0};
        this.f36692r = new int[]{0, 0};
        this.f36693s = new Paint(1);
        this.f36694w = new RectF();
        nr nrVar = nr.h;
        this.f36695x = new d6(this, 125L, nrVar);
        this.f36696y = new d6(this, 125L, nrVar);
        this.G = -1;
        this.H = true;
        this.E = h6Var;
        this.f36688c = getResources().getDrawable(2131232758);
        this.d = getResources().getDrawable(2131232759);
        a();
    }

    public final void a() {
        int i7 = org.telegram.ui.ActionBar.m6.f29454h5;
        org.telegram.ui.ActionBar.h6 h6Var = this.E;
        org.telegram.ui.ActionBar.m6.C1(org.telegram.ui.ActionBar.m6.w0(i7, h6Var), this.f36688c);
        org.telegram.ui.ActionBar.m6.C1(org.telegram.ui.ActionBar.m6.w0(i7, h6Var), this.d);
        org.telegram.messenger.j4.f24827b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ef, h6Var), PorterDuff.Mode.SRC_IN));
    }

    public String getEmoji() {
        return this.f36689e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        d6 d6Var;
        float f10;
        int L2;
        int W1;
        ju juVar = this;
        int measuredWidth = juVar.getMeasuredWidth();
        int measuredHeight = juVar.getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f);
        Drawable drawable = juVar.f36688c;
        boolean z10 = false;
        drawable.setBounds(0, 0, measuredWidth, measuredHeight);
        drawable.draw(canvas);
        int L3 = juVar.h - org.telegram.messenger.g0.L(9.0f);
        int measuredHeight2 = juVar.getMeasuredHeight() - org.telegram.messenger.g0.L(6.34f);
        int L4 = org.telegram.messenger.g0.L(9.0f) + juVar.h;
        int measuredHeight3 = juVar.getMeasuredHeight();
        Drawable drawable2 = juVar.d;
        drawable2.setBounds(L3, measuredHeight2, L4, measuredHeight3);
        drawable2.draw(canvas);
        if (juVar.f36689e != null) {
            boolean z11 = juVar.f36690f;
            org.telegram.ui.ActionBar.h6 h6Var = juVar.E;
            int[] iArr = juVar.f36691n;
            d6 d6Var2 = juVar.f36695x;
            Paint paint = juVar.f36693s;
            Drawable[] drawableArr = juVar.f36687b;
            RectF rectF = juVar.f36694w;
            float f11 = 1.0f;
            int i7 = juVar.f36686a;
            if (z11) {
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        d6Var = d6Var2;
                    } else {
                        d6Var = juVar.f36696y;
                    }
                    float e10 = d6Var.e(z10, iArr[i10]);
                    boolean z12 = z10;
                    float max = Math.max(0.0f, Math.min(f11, -e10));
                    rectF.set((int) ((i7 * (e10 + f11)) + org.telegram.messenger.g0.L((f10 * 4.0f) + (Math.max(0.0f, Math.min(f11, f10)) * 3.0f) + 5.0f)), org.telegram.messenger.g0.W1(max, ((org.telegram.messenger.g0.L(f11) + i7) * i10) + org.telegram.messenger.g0.L(3.0f), (juVar.getMeasuredHeight() - i7) / 2), L2 + i7, W1 + i7);
                    rectF.inset(org.telegram.messenger.g0.L(-2.0f), org.telegram.messenger.g0.L(max * (-2.0f)));
                    paint.setColor(org.telegram.ui.ActionBar.m6.r1(org.telegram.messenger.g0.T1(f11, 0.5f, max), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29473i6, h6Var)));
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
                    juVar = this;
                    z10 = z12;
                }
                boolean z13 = z10;
                drawableArr[z13 ? 1 : 0].setBounds(org.telegram.messenger.g0.L(5.0f), (getMeasuredHeight() - i7) / 2, org.telegram.messenger.g0.L(5.0f) + i7, (getMeasuredHeight() + i7) / 2);
                drawableArr[z13 ? 1 : 0].draw(canvas);
                canvas.drawRect(org.telegram.messenger.g0.L(8.45f) + i7, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(8.45f) + i7 + 1, getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f), org.telegram.ui.ActionBar.m6.f29504k0);
                return;
            }
            float e11 = d6Var2.e(false, iArr[0]);
            int L7 = org.telegram.messenger.g0.L(5.0f);
            float f12 = L7;
            rectF.set((int) ((i7 * e11) + org.telegram.messenger.g0.L((e11 * 4.0f) + 5.0f)), f12, L + i7, L7 + i7);
            rectF.inset(org.telegram.messenger.g0.L(-2.0f), org.telegram.messenger.g0.L(-2.0f));
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29473i6, h6Var));
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
        } else if (!this.f36690f) {
            return super.onTouchEvent(motionEvent);
        } else {
            int i12 = 0;
            while (true) {
                Drawable[] drawableArr = this.f36687b;
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
            int[] iArr = this.f36691n;
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
            int[] iArr2 = this.f36692r;
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
                org.telegram.messenger.r10 r10Var = this.F;
                if (r10Var != null) {
                    r10Var.a(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
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

    public void setOnSelectionUpdateListener(org.telegram.messenger.r10 r10Var) {
        this.F = r10Var;
    }
}
