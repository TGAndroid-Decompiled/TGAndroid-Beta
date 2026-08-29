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
public final class nu extends View {
    public Utilities.Callback2 A;
    public int B;
    public boolean C;
    public long D;
    public boolean E;
    public final int f31138a;
    public final Drawable[] f31139b;
    public final Drawable f31140c;
    public final Drawable d;
    public String f31141e;
    public boolean f31142f;
    public int h;
    public final int[] f31143n;
    public final int[] f31144r;
    public final Paint f31145s;
    public final RectF v;
    public final d6 f31146w;
    public final d6 f31147x;
    public final org.telegram.ui.ActionBar.c6 f31148y;

    public nu(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        float f9;
        if (AndroidUtilities.isTablet()) {
            f9 = 40.0f;
        } else {
            f9 = 32.0f;
        }
        this.f31138a = AndroidUtilities.dp(f9);
        this.f31139b = new Drawable[11];
        this.f31143n = new int[]{0, 0};
        this.f31144r = new int[]{0, 0};
        this.f31145s = new Paint(1);
        this.v = new RectF();
        jr jrVar = jr.h;
        this.f31146w = new d6(this, 125L, jrVar);
        this.f31147x = new d6(this, 125L, jrVar);
        this.B = -1;
        this.C = true;
        this.f31148y = c6Var;
        this.f31140c = getResources().getDrawable(R.drawable.stickers_back_all);
        this.d = getResources().getDrawable(R.drawable.stickers_back_arrow);
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.g6.f23133h5;
        org.telegram.ui.ActionBar.c6 c6Var = this.f31148y;
        org.telegram.ui.ActionBar.g6.w1(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), this.f31140c);
        org.telegram.ui.ActionBar.g6.w1(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), this.d);
        CompoundEmoji.setPlaceholderColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Me, c6Var));
    }

    public String getEmoji() {
        return this.f31141e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        d6 d6Var;
        float f9;
        int dp2;
        int lerp;
        nu nuVar = this;
        int measuredWidth = nuVar.getMeasuredWidth();
        int measuredHeight = nuVar.getMeasuredHeight() - AndroidUtilities.dp(2.0f);
        Drawable drawable = nuVar.f31140c;
        boolean z10 = false;
        drawable.setBounds(0, 0, measuredWidth, measuredHeight);
        drawable.draw(canvas);
        int dp3 = nuVar.h - AndroidUtilities.dp(9.0f);
        int measuredHeight2 = nuVar.getMeasuredHeight() - AndroidUtilities.dp(6.34f);
        int dp4 = AndroidUtilities.dp(9.0f) + nuVar.h;
        int measuredHeight3 = nuVar.getMeasuredHeight();
        Drawable drawable2 = nuVar.d;
        drawable2.setBounds(dp3, measuredHeight2, dp4, measuredHeight3);
        drawable2.draw(canvas);
        if (nuVar.f31141e != null) {
            boolean z11 = nuVar.f31142f;
            org.telegram.ui.ActionBar.c6 c6Var = nuVar.f31148y;
            int[] iArr = nuVar.f31143n;
            d6 d6Var2 = nuVar.f31146w;
            Paint paint = nuVar.f31145s;
            Drawable[] drawableArr = nuVar.f31139b;
            RectF rectF = nuVar.v;
            float f10 = 1.0f;
            int i10 = nuVar.f31138a;
            if (z11) {
                int i11 = 0;
                while (i11 < 2) {
                    if (i11 == 0) {
                        d6Var = d6Var2;
                    } else {
                        d6Var = nuVar.f31147x;
                    }
                    float d = d6Var.d(iArr[i11], z10);
                    float max = Math.max(0.0f, Math.min(f10, -d));
                    rectF.set((int) ((i10 * (d + f10)) + AndroidUtilities.dp((f9 * 4.0f) + (Math.max(0.0f, Math.min(f10, f9)) * 3.0f) + 5.0f)), AndroidUtilities.lerp(((AndroidUtilities.dp(f10) + i10) * i11) + AndroidUtilities.dp(3.0f), (nuVar.getMeasuredHeight() - i10) / 2, max), dp2 + i10, lerp + i10);
                    rectF.inset(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(max * (-2.0f)));
                    paint.setColor(org.telegram.ui.ActionBar.g6.l1(AndroidUtilities.lerp(f10, 0.5f, max), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var)));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                    int i12 = 0;
                    while (i12 < 5) {
                        i12++;
                        int i13 = (i11 * 5) + i12;
                        int dp5 = AndroidUtilities.dp((i12 * 4) + 8) + (i10 * i12);
                        int dp6 = ((AndroidUtilities.dp(f10) + i10) * i11) + AndroidUtilities.dp(3.0f);
                        drawableArr[i13].setBounds(dp5, dp6, dp5 + i10, dp6 + i10);
                        drawableArr[i13].draw(canvas);
                        f10 = 1.0f;
                    }
                    i11++;
                    f10 = 1.0f;
                    z10 = false;
                    nuVar = this;
                }
                drawableArr[0].setBounds(AndroidUtilities.dp(5.0f), (getMeasuredHeight() - i10) / 2, AndroidUtilities.dp(5.0f) + i10, (getMeasuredHeight() + i10) / 2);
                drawableArr[0].draw(canvas);
                canvas.drawRect(AndroidUtilities.dp(8.45f) + i10, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.45f) + i10 + 1, getMeasuredHeight() - AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.g6.f23183k0);
                return;
            }
            float d10 = d6Var2.d(iArr[0], false);
            int dp7 = AndroidUtilities.dp(5.0f);
            float f11 = dp7;
            rectF.set((int) ((i10 * d10) + AndroidUtilities.dp((d10 * 4.0f) + 5.0f)), f11, dp + i10, dp7 + i10);
            rectF.inset(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(-2.0f));
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
            for (int i14 = 0; i14 < 6; i14++) {
                Drawable drawable3 = drawableArr[i14];
                if (drawable3 != null) {
                    int dp8 = AndroidUtilities.dp((i14 * 4) + 5) + (i10 * i14);
                    float min = ((1.0f - (Math.min(0.5f, Math.abs(i14 - d10)) * 2.0f)) * 0.1f) + 0.9f;
                    canvas.save();
                    canvas.scale(min, min, (i10 / 2.0f) + dp8, (i10 / 2.0f) + f11);
                    drawable3.setBounds(dp8, dp7, dp8 + i10, dp7 + i10);
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
        if (this.E) {
            this.E = false;
            return false;
        } else if (!this.f31142f) {
            return super.onTouchEvent(motionEvent);
        } else {
            int i13 = 0;
            while (true) {
                Drawable[] drawableArr = this.f31139b;
                if (i13 < drawableArr.length) {
                    if (drawableArr[i13].getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) || ((i12 = this.B) != -1 && ((i13 == 0 || ((i12 == 0 && i13 >= 1 && i13 <= 5) || (i12 == 1 && i13 >= 6 && i13 <= 10))) && ((int) motionEvent.getX()) >= drawableArr[i13].getBounds().left && ((int) motionEvent.getX()) <= drawableArr[i13].getBounds().right))) {
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
            int[] iArr = this.f31143n;
            if (action == 0) {
                this.B = -1;
                this.D = System.currentTimeMillis();
                if (iArr[0] == iArr[1]) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.C = z11;
            }
            int i14 = iArr[0];
            int[] iArr2 = this.f31144r;
            iArr2[0] = i14;
            iArr2[1] = iArr[1];
            if (System.currentTimeMillis() - this.D > 300 && motionEvent.getAction() == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
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
    }

    public void setArrowX(int i10) {
        this.h = i10;
        invalidate();
    }

    public void setOnSelectionUpdateListener(Utilities.Callback2<Integer, Integer> callback2) {
        this.A = callback2;
    }
}
