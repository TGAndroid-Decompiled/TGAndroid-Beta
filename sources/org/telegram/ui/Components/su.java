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
public final class su extends View {
    public Utilities.Callback2 B;
    public int C;
    public boolean D;
    public long E;
    public boolean F;
    public final int f31177a;
    public final Drawable[] f31178b;
    public final Drawable f31179c;
    public final Drawable d;
    public String f31180e;
    public boolean f31181f;
    public int h;
    public final int[] f31182n;
    public final int[] f31183r;
    public final Paint f31184s;
    public final RectF v;
    public final z5 f31185w;
    public final z5 f31186x;
    public final org.telegram.ui.ActionBar.g6 f31187y;

    public su(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        float f10;
        if (AndroidUtilities.isTablet()) {
            f10 = 40.0f;
        } else {
            f10 = 32.0f;
        }
        this.f31177a = AndroidUtilities.dp(f10);
        this.f31178b = new Drawable[11];
        this.f31182n = new int[]{0, 0};
        this.f31183r = new int[]{0, 0};
        this.f31184s = new Paint(1);
        this.v = new RectF();
        pr prVar = pr.h;
        this.f31185w = new z5(this, 125L, prVar);
        this.f31186x = new z5(this, 125L, prVar);
        this.C = -1;
        this.D = true;
        this.f31187y = g6Var;
        this.f31179c = getResources().getDrawable(R.drawable.stickers_back_all);
        this.d = getResources().getDrawable(R.drawable.stickers_back_arrow);
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.k6.f21733h5;
        org.telegram.ui.ActionBar.g6 g6Var = this.f31187y;
        org.telegram.ui.ActionBar.k6.w1(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), this.f31179c);
        org.telegram.ui.ActionBar.k6.w1(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), this.d);
        CompoundEmoji.setPlaceholderColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Me, g6Var));
    }

    public String getEmoji() {
        return this.f31180e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        z5 z5Var;
        float f10;
        int dp2;
        int lerp;
        su suVar = this;
        int measuredWidth = suVar.getMeasuredWidth();
        int measuredHeight = suVar.getMeasuredHeight() - AndroidUtilities.dp(2.0f);
        Drawable drawable = suVar.f31179c;
        boolean z4 = false;
        drawable.setBounds(0, 0, measuredWidth, measuredHeight);
        drawable.draw(canvas);
        int dp3 = suVar.h - AndroidUtilities.dp(9.0f);
        int measuredHeight2 = suVar.getMeasuredHeight() - AndroidUtilities.dp(6.34f);
        int dp4 = AndroidUtilities.dp(9.0f) + suVar.h;
        int measuredHeight3 = suVar.getMeasuredHeight();
        Drawable drawable2 = suVar.d;
        drawable2.setBounds(dp3, measuredHeight2, dp4, measuredHeight3);
        drawable2.draw(canvas);
        if (suVar.f31180e != null) {
            boolean z10 = suVar.f31181f;
            org.telegram.ui.ActionBar.g6 g6Var = suVar.f31187y;
            int[] iArr = suVar.f31182n;
            z5 z5Var2 = suVar.f31185w;
            Paint paint = suVar.f31184s;
            Drawable[] drawableArr = suVar.f31178b;
            RectF rectF = suVar.v;
            float f11 = 1.0f;
            int i10 = suVar.f31177a;
            if (z10) {
                int i11 = 0;
                while (i11 < 2) {
                    if (i11 == 0) {
                        z5Var = z5Var2;
                    } else {
                        z5Var = suVar.f31186x;
                    }
                    float d = z5Var.d(iArr[i11], z4);
                    float max = Math.max(0.0f, Math.min(f11, -d));
                    rectF.set((int) ((i10 * (d + f11)) + AndroidUtilities.dp((f10 * 4.0f) + (Math.max(0.0f, Math.min(f11, f10)) * 3.0f) + 5.0f)), AndroidUtilities.lerp(((AndroidUtilities.dp(f11) + i10) * i11) + AndroidUtilities.dp(3.0f), (suVar.getMeasuredHeight() - i10) / 2, max), dp2 + i10, lerp + i10);
                    rectF.inset(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(max * (-2.0f)));
                    paint.setColor(org.telegram.ui.ActionBar.k6.l1(AndroidUtilities.lerp(f11, 0.5f, max), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21752i6, g6Var)));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                    int i12 = 0;
                    while (i12 < 5) {
                        i12++;
                        int i13 = (i11 * 5) + i12;
                        int dp5 = AndroidUtilities.dp((i12 * 4) + 8) + (i10 * i12);
                        int dp6 = ((AndroidUtilities.dp(f11) + i10) * i11) + AndroidUtilities.dp(3.0f);
                        drawableArr[i13].setBounds(dp5, dp6, dp5 + i10, dp6 + i10);
                        drawableArr[i13].draw(canvas);
                        f11 = 1.0f;
                    }
                    i11++;
                    f11 = 1.0f;
                    z4 = false;
                    suVar = this;
                }
                drawableArr[0].setBounds(AndroidUtilities.dp(5.0f), (getMeasuredHeight() - i10) / 2, AndroidUtilities.dp(5.0f) + i10, (getMeasuredHeight() + i10) / 2);
                drawableArr[0].draw(canvas);
                canvas.drawRect(AndroidUtilities.dp(8.45f) + i10, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.45f) + i10 + 1, getMeasuredHeight() - AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.k6.f21781k0);
                return;
            }
            float d10 = z5Var2.d(iArr[0], false);
            int dp7 = AndroidUtilities.dp(5.0f);
            float f12 = dp7;
            rectF.set((int) ((i10 * d10) + AndroidUtilities.dp((d10 * 4.0f) + 5.0f)), f12, dp + i10, dp7 + i10);
            rectF.inset(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(-2.0f));
            paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21752i6, g6Var));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
            for (int i14 = 0; i14 < 6; i14++) {
                Drawable drawable3 = drawableArr[i14];
                if (drawable3 != null) {
                    int dp8 = AndroidUtilities.dp((i14 * 4) + 5) + (i10 * i14);
                    float min = ((1.0f - (Math.min(0.5f, Math.abs(i14 - d10)) * 2.0f)) * 0.1f) + 0.9f;
                    canvas.save();
                    canvas.scale(min, min, (i10 / 2.0f) + dp8, (i10 / 2.0f) + f12);
                    drawable3.setBounds(dp8, dp7, dp8 + i10, dp7 + i10);
                    drawable3.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        int i10;
        int i11;
        boolean z10;
        int i12;
        if (this.F) {
            this.F = false;
            return false;
        } else if (!this.f31181f) {
            return super.onTouchEvent(motionEvent);
        } else {
            int i13 = 0;
            while (true) {
                Drawable[] drawableArr = this.f31178b;
                if (i13 < drawableArr.length) {
                    if (drawableArr[i13].getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) || ((i12 = this.C) != -1 && ((i13 == 0 || ((i12 == 0 && i13 >= 1 && i13 <= 5) || (i12 == 1 && i13 >= 6 && i13 <= 10))) && ((int) motionEvent.getX()) >= drawableArr[i13].getBounds().left && ((int) motionEvent.getX()) <= drawableArr[i13].getBounds().right))) {
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
            int[] iArr = this.f31182n;
            if (action == 0) {
                this.C = -1;
                this.E = System.currentTimeMillis();
                if (iArr[0] == iArr[1]) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.D = z10;
            }
            int i14 = iArr[0];
            int[] iArr2 = this.f31183r;
            iArr2[0] = i14;
            iArr2[1] = iArr[1];
            if (System.currentTimeMillis() - this.E > 300 && motionEvent.getAction() == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i13 == 0) {
                iArr[0] = -1;
                iArr[1] = -1;
            } else if (i13 >= 1 && i13 <= 5 && ((i11 = this.C) == -1 || i11 == 0)) {
                this.C = 0;
                int i15 = i13 - 1;
                iArr[0] = i15;
                if (iArr[1] == -1 || (this.D && z4)) {
                    iArr[1] = i15;
                }
            } else if (i13 >= 6 && i13 <= 10 && ((i10 = this.C) == -1 || i10 == 1)) {
                this.C = 1;
                int i16 = i13 - 6;
                iArr[1] = i16;
                if (iArr[0] == -1 || (this.D && z4)) {
                    iArr[0] = i16;
                }
            }
            if (iArr2[0] != iArr[0] || iArr2[1] != iArr[1]) {
                AndroidUtilities.vibrateCursor(this);
                Utilities.Callback2 callback2 = this.B;
                if (callback2 != null) {
                    callback2.run(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
                }
            }
            invalidate();
            if (motionEvent.getAction() == 1) {
                this.C = -1;
            }
            return true;
        }
    }

    public void setArrowX(int i10) {
        this.h = i10;
        invalidate();
    }

    public void setOnSelectionUpdateListener(Utilities.Callback2<Integer, Integer> callback2) {
        this.B = callback2;
    }
}
