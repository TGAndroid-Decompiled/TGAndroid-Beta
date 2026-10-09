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
public final class mv extends View {
    public Utilities.Callback2 E;
    public int F;
    public boolean G;
    public long H;
    public boolean I;
    public final int f28943a;
    public final Drawable[] f28944b;
    public final Drawable f28945c;
    public final Drawable d;
    public String f28946e;
    public boolean f28947f;
    public int h;
    public final int[] f28948n;
    public final int[] f28949r;
    public final Paint f28950s;
    public final RectF v;
    public final g6 f28951w;
    public final g6 f28952x;
    public final org.telegram.ui.ActionBar.e6 f28953y;

    public mv(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        float f7;
        if (AndroidUtilities.isTablet()) {
            f7 = 40.0f;
        } else {
            f7 = 32.0f;
        }
        this.f28943a = AndroidUtilities.dp(f7);
        this.f28944b = new Drawable[11];
        this.f28948n = new int[]{0, 0};
        this.f28949r = new int[]{0, 0};
        this.f28950s = new Paint(1);
        this.v = new RectF();
        hs hsVar = hs.h;
        this.f28951w = new g6(this, 125L, hsVar);
        this.f28952x = new g6(this, 125L, hsVar);
        this.F = -1;
        this.G = true;
        this.f28953y = e6Var;
        this.f28945c = getResources().getDrawable(R.drawable.stickers_back_all);
        this.d = getResources().getDrawable(R.drawable.stickers_back_arrow);
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.i6.f20868h5;
        org.telegram.ui.ActionBar.e6 e6Var = this.f28953y;
        org.telegram.ui.ActionBar.i6.x1(org.telegram.ui.ActionBar.i6.w0(i10, e6Var), this.f28945c);
        org.telegram.ui.ActionBar.i6.x1(org.telegram.ui.ActionBar.i6.w0(i10, e6Var), this.d);
        CompoundEmoji.setPlaceholderColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Me, e6Var));
    }

    public String getEmoji() {
        return this.f28946e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        g6 g6Var;
        float f7;
        int dp2;
        int lerp;
        mv mvVar = this;
        int measuredWidth = mvVar.getMeasuredWidth();
        int measuredHeight = mvVar.getMeasuredHeight() - AndroidUtilities.dp(2.0f);
        Drawable drawable = mvVar.f28945c;
        boolean z10 = false;
        drawable.setBounds(0, 0, measuredWidth, measuredHeight);
        drawable.draw(canvas);
        int dp3 = mvVar.h - AndroidUtilities.dp(9.0f);
        int measuredHeight2 = mvVar.getMeasuredHeight() - AndroidUtilities.dp(6.34f);
        int dp4 = AndroidUtilities.dp(9.0f) + mvVar.h;
        int measuredHeight3 = mvVar.getMeasuredHeight();
        Drawable drawable2 = mvVar.d;
        drawable2.setBounds(dp3, measuredHeight2, dp4, measuredHeight3);
        drawable2.draw(canvas);
        if (mvVar.f28946e != null) {
            boolean z11 = mvVar.f28947f;
            org.telegram.ui.ActionBar.e6 e6Var = mvVar.f28953y;
            int[] iArr = mvVar.f28948n;
            g6 g6Var2 = mvVar.f28951w;
            Paint paint = mvVar.f28950s;
            Drawable[] drawableArr = mvVar.f28944b;
            RectF rectF = mvVar.v;
            float f10 = 1.0f;
            int i10 = mvVar.f28943a;
            if (z11) {
                int i11 = 0;
                while (i11 < 2) {
                    if (i11 == 0) {
                        g6Var = g6Var2;
                    } else {
                        g6Var = mvVar.f28952x;
                    }
                    float d = g6Var.d(iArr[i11], z10);
                    boolean z12 = z10;
                    float max = Math.max(0.0f, Math.min(f10, -d));
                    rectF.set((int) ((i10 * (d + f10)) + AndroidUtilities.dp((f7 * 4.0f) + (Math.max(0.0f, Math.min(f10, f7)) * 3.0f) + 5.0f)), AndroidUtilities.lerp(((AndroidUtilities.dp(f10) + i10) * i11) + AndroidUtilities.dp(3.0f), (mvVar.getMeasuredHeight() - i10) / 2, max), dp2 + i10, lerp + i10);
                    rectF.inset(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(max * (-2.0f)));
                    paint.setColor(org.telegram.ui.ActionBar.i6.m1(AndroidUtilities.lerp(f10, 0.5f, max), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20888i6, e6Var)));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                    int i12 = z12;
                    while (i12 < 5) {
                        i12++;
                        int i13 = (i11 * 5) + i12;
                        int dp5 = AndroidUtilities.dp((i12 * 4) + 8) + (i10 * i12);
                        int dp6 = ((AndroidUtilities.dp(f10) + i10) * i11) + AndroidUtilities.dp(3.0f);
                        drawableArr[i13].setBounds(dp5, dp6, dp5 + i10, dp6 + i10);
                        drawableArr[i13].draw(canvas);
                        f10 = f10;
                    }
                    i11++;
                    mvVar = this;
                    z10 = z12;
                }
                boolean z13 = z10;
                drawableArr[z13 ? 1 : 0].setBounds(AndroidUtilities.dp(5.0f), (getMeasuredHeight() - i10) / 2, AndroidUtilities.dp(5.0f) + i10, (getMeasuredHeight() + i10) / 2);
                drawableArr[z13 ? 1 : 0].draw(canvas);
                canvas.drawRect(AndroidUtilities.dp(8.45f) + i10, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.45f) + i10 + 1, getMeasuredHeight() - AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.i6.f20919k0);
                return;
            }
            float d10 = g6Var2.d(iArr[0], false);
            int dp7 = AndroidUtilities.dp(5.0f);
            float f11 = dp7;
            rectF.set((int) ((i10 * d10) + AndroidUtilities.dp((d10 * 4.0f) + 5.0f)), f11, dp + i10, dp7 + i10);
            rectF.inset(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(-2.0f));
            paint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20888i6, e6Var));
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
        if (this.I) {
            this.I = false;
            return false;
        } else if (!this.f28947f) {
            return super.onTouchEvent(motionEvent);
        } else {
            int i13 = 0;
            while (true) {
                Drawable[] drawableArr = this.f28944b;
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
            int[] iArr = this.f28948n;
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
            int[] iArr2 = this.f28949r;
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
                AndroidUtilities.vibrateCursor(this);
                Utilities.Callback2 callback2 = this.E;
                if (callback2 != null) {
                    callback2.run(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
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

    public void setOnSelectionUpdateListener(Utilities.Callback2<Integer, Integer> callback2) {
        this.E = callback2;
    }
}
