package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

public final class gu extends View {
    public Utilities.Callback2 A;
    public int B;
    public boolean C;
    public long D;
    public boolean E;

    public final int f28814a;

    public final Drawable[] f28815b;

    public final Drawable f28816c;
    public final Drawable d;

    public String f28817e;

    public boolean f28818f;
    public int h;

    public final int[] f28819n;

    public final int[] f28820r;

    public final Paint f28821s;
    public final RectF v;

    public final y5 f28822w;

    public final y5 f28823x;

    public final org.telegram.ui.ActionBar.c6 f28824y;

    public gu(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f28814a = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        this.f28815b = new Drawable[11];
        this.f28819n = new int[]{0, 0};
        this.f28820r = new int[]{0, 0};
        this.f28821s = new Paint(1);
        this.v = new RectF();
        er erVar = er.h;
        this.f28822w = new y5(this, 125L, erVar);
        this.f28823x = new y5(this, 125L, erVar);
        this.B = -1;
        this.C = true;
        this.f28824y = c6Var;
        this.f28816c = getResources().getDrawable(R.drawable.stickers_back_all);
        this.d = getResources().getDrawable(R.drawable.stickers_back_arrow);
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.g6.f23124h5;
        org.telegram.ui.ActionBar.c6 c6Var = this.f28824y;
        org.telegram.ui.ActionBar.g6.w1(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), this.f28816c);
        org.telegram.ui.ActionBar.g6.w1(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), this.d);
        CompoundEmoji.setPlaceholderColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Me, c6Var));
    }

    public String getEmoji() {
        return this.f28817e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        gu guVar = this;
        int measuredWidth = guVar.getMeasuredWidth();
        int measuredHeight = guVar.getMeasuredHeight() - AndroidUtilities.dp(2.0f);
        Drawable drawable = guVar.f28816c;
        boolean z10 = false;
        drawable.setBounds(0, 0, measuredWidth, measuredHeight);
        drawable.draw(canvas);
        int iDp = guVar.h - AndroidUtilities.dp(9.0f);
        int measuredHeight2 = guVar.getMeasuredHeight() - AndroidUtilities.dp(6.34f);
        int iDp2 = AndroidUtilities.dp(9.0f) + guVar.h;
        int measuredHeight3 = guVar.getMeasuredHeight();
        Drawable drawable2 = guVar.d;
        drawable2.setBounds(iDp, measuredHeight2, iDp2, measuredHeight3);
        drawable2.draw(canvas);
        if (guVar.f28817e != null) {
            boolean z11 = guVar.f28818f;
            org.telegram.ui.ActionBar.c6 c6Var = guVar.f28824y;
            int[] iArr = guVar.f28819n;
            y5 y5Var = guVar.f28822w;
            Paint paint = guVar.f28821s;
            Drawable[] drawableArr = guVar.f28815b;
            RectF rectF = guVar.v;
            float f10 = 1.0f;
            int i10 = guVar.f28814a;
            if (!z11) {
                float fD = y5Var.d(iArr[0], false);
                int iDp3 = (int) ((i10 * fD) + AndroidUtilities.dp((fD * 4.0f) + 5.0f));
                int iDp4 = AndroidUtilities.dp(5.0f);
                float f11 = iDp4;
                rectF.set(iDp3, f11, iDp3 + i10, iDp4 + i10);
                rectF.inset(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(-2.0f));
                paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                for (int i11 = 0; i11 < 6; i11++) {
                    Drawable drawable3 = drawableArr[i11];
                    if (drawable3 != null) {
                        int iDp5 = AndroidUtilities.dp((i11 * 4) + 5) + (i10 * i11);
                        float fMin = ((1.0f - (Math.min(0.5f, Math.abs(i11 - fD)) * 2.0f)) * 0.1f) + 0.9f;
                        canvas.save();
                        canvas.scale(fMin, fMin, (i10 / 2.0f) + iDp5, (i10 / 2.0f) + f11);
                        drawable3.setBounds(iDp5, iDp4, iDp5 + i10, iDp4 + i10);
                        drawable3.draw(canvas);
                        canvas.restore();
                    }
                }
                return;
            }
            int i12 = 0;
            while (i12 < 2) {
                float fD2 = (i12 == 0 ? y5Var : guVar.f28823x).d(iArr[i12], z10);
                float f12 = fD2 + f10;
                int iDp6 = (int) ((i10 * f12) + AndroidUtilities.dp((f12 * 4.0f) + (Math.max(0.0f, Math.min(f10, f12)) * 3.0f) + 5.0f));
                float fMax = Math.max(0.0f, Math.min(f10, -fD2));
                int iLerp = AndroidUtilities.lerp(((AndroidUtilities.dp(f10) + i10) * i12) + AndroidUtilities.dp(3.0f), (guVar.getMeasuredHeight() - i10) / 2, fMax);
                rectF.set(iDp6, iLerp, iDp6 + i10, iLerp + i10);
                rectF.inset(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(fMax * (-2.0f)));
                paint.setColor(org.telegram.ui.ActionBar.g6.l1(AndroidUtilities.lerp(f10, 0.5f, fMax), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var)));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                int i13 = 0;
                while (i13 < 5) {
                    i13++;
                    int i14 = (i12 * 5) + i13;
                    int iDp7 = AndroidUtilities.dp((i13 * 4) + 8) + (i10 * i13);
                    int iDp8 = ((AndroidUtilities.dp(f10) + i10) * i12) + AndroidUtilities.dp(3.0f);
                    drawableArr[i14].setBounds(iDp7, iDp8, iDp7 + i10, iDp8 + i10);
                    drawableArr[i14].draw(canvas);
                    f10 = 1.0f;
                }
                i12++;
                f10 = 1.0f;
                z10 = false;
                guVar = this;
            }
            drawableArr[0].setBounds(AndroidUtilities.dp(5.0f), (getMeasuredHeight() - i10) / 2, AndroidUtilities.dp(5.0f) + i10, (getMeasuredHeight() + i10) / 2);
            drawableArr[0].draw(canvas);
            canvas.drawRect(AndroidUtilities.dp(8.45f) + i10, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.45f) + i10 + 1, getMeasuredHeight() - AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.g6.f23175k0);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        int i11;
        int i12;
        if (this.E) {
            this.E = false;
            return false;
        }
        if (!this.f28818f) {
            return super.onTouchEvent(motionEvent);
        }
        int i13 = 0;
        while (true) {
            Drawable[] drawableArr = this.f28815b;
            if (i13 >= drawableArr.length) {
                i13 = -1;
                break;
            }
            if (drawableArr[i13].getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) || ((i12 = this.B) != -1 && ((i13 == 0 || ((i12 == 0 && i13 >= 1 && i13 <= 5) || (i12 == 1 && i13 >= 6 && i13 <= 10))) && ((int) motionEvent.getX()) >= drawableArr[i13].getBounds().left && ((int) motionEvent.getX()) <= drawableArr[i13].getBounds().right))) {
                break;
            }
            i13++;
        }
        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2 && motionEvent.getAction() != 1) {
            return false;
        }
        int action = motionEvent.getAction();
        int[] iArr = this.f28819n;
        if (action == 0) {
            this.B = -1;
            this.D = System.currentTimeMillis();
            this.C = iArr[0] == iArr[1];
        }
        int i14 = iArr[0];
        int[] iArr2 = this.f28820r;
        iArr2[0] = i14;
        iArr2[1] = iArr[1];
        boolean z10 = System.currentTimeMillis() - this.D > 300 && motionEvent.getAction() == 2;
        if (i13 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
        } else if (i13 >= 1 && i13 <= 5 && ((i11 = this.B) == -1 || i11 == 0)) {
            this.B = 0;
            int i15 = i13 - 1;
            iArr[0] = i15;
            if (iArr[1] == -1 || (this.C && z10)) {
                iArr[1] = i15;
            }
        } else if (i13 >= 6 && i13 <= 10 && ((i10 = this.B) == -1 || i10 == 1)) {
            this.B = 1;
            int i16 = i13 - 6;
            iArr[1] = i16;
            if (iArr[0] == -1 || (this.C && z10)) {
                iArr[0] = i16;
            }
        }
        if (iArr2[0] != iArr[0] || iArr2[1] != iArr[1]) {
            AndroidUtilities.vibrateCursor(this);
            Utilities.Callback2 callback2 = this.A;
            if (callback2 != null) {
                callback2.run(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
            }
        }
        invalidate();
        if (motionEvent.getAction() == 1) {
            this.B = -1;
        }
        return true;
    }

    public void setArrowX(int i10) {
        this.h = i10;
        invalidate();
    }

    public void setOnSelectionUpdateListener(Utilities.Callback2<Integer, Integer> callback2) {
        this.A = callback2;
    }
}
