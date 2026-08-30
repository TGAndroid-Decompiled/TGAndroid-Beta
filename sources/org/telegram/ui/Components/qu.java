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
public final class qu extends View {
    public Utilities.Callback2 B;
    public int C;
    public boolean D;
    public long E;
    public boolean F;
    public final int f28247a;
    public final Drawable[] f28248b;
    public final Drawable f28249c;
    public final Drawable d;
    public String e;
    public boolean f28250f;
    public int h;
    public final int[] f28251n;
    public final int[] f28252r;
    public final Paint f28253s;
    public final RectF v;
    public final z5 f28254w;
    public final z5 f28255x;
    public final org.telegram.ui.ActionBar.f6 f28256y;

    public qu(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        float f10;
        if (AndroidUtilities.isTablet()) {
            f10 = 40.0f;
        } else {
            f10 = 32.0f;
        }
        this.f28247a = AndroidUtilities.dp(f10);
        this.f28248b = new Drawable[11];
        this.f28251n = new int[]{0, 0};
        this.f28252r = new int[]{0, 0};
        this.f28253s = new Paint(1);
        this.v = new RectF();
        nr nrVar = nr.h;
        this.f28254w = new z5(this, 125L, nrVar);
        this.f28255x = new z5(this, 125L, nrVar);
        this.C = -1;
        this.D = true;
        this.f28256y = f6Var;
        this.f28249c = getResources().getDrawable(R.drawable.stickers_back_all);
        this.d = getResources().getDrawable(R.drawable.stickers_back_arrow);
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.j6.f19977h5;
        org.telegram.ui.ActionBar.f6 f6Var = this.f28256y;
        org.telegram.ui.ActionBar.j6.w1(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), this.f28249c);
        org.telegram.ui.ActionBar.j6.w1(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), this.d);
        CompoundEmoji.setPlaceholderColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Me, f6Var));
    }

    public String getEmoji() {
        return this.e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        z5 z5Var;
        float f10;
        int dp2;
        int lerp;
        qu quVar = this;
        int measuredWidth = quVar.getMeasuredWidth();
        int measuredHeight = quVar.getMeasuredHeight() - AndroidUtilities.dp(2.0f);
        Drawable drawable = quVar.f28249c;
        boolean z4 = false;
        drawable.setBounds(0, 0, measuredWidth, measuredHeight);
        drawable.draw(canvas);
        int dp3 = quVar.h - AndroidUtilities.dp(9.0f);
        int measuredHeight2 = quVar.getMeasuredHeight() - AndroidUtilities.dp(6.34f);
        int dp4 = AndroidUtilities.dp(9.0f) + quVar.h;
        int measuredHeight3 = quVar.getMeasuredHeight();
        Drawable drawable2 = quVar.d;
        drawable2.setBounds(dp3, measuredHeight2, dp4, measuredHeight3);
        drawable2.draw(canvas);
        if (quVar.e != null) {
            boolean z10 = quVar.f28250f;
            org.telegram.ui.ActionBar.f6 f6Var = quVar.f28256y;
            int[] iArr = quVar.f28251n;
            z5 z5Var2 = quVar.f28254w;
            Paint paint = quVar.f28253s;
            Drawable[] drawableArr = quVar.f28248b;
            RectF rectF = quVar.v;
            float f11 = 1.0f;
            int i10 = quVar.f28247a;
            if (z10) {
                int i11 = 0;
                while (i11 < 2) {
                    if (i11 == 0) {
                        z5Var = z5Var2;
                    } else {
                        z5Var = quVar.f28255x;
                    }
                    float d = z5Var.d(iArr[i11], z4);
                    float max = Math.max(0.0f, Math.min(f11, -d));
                    rectF.set((int) ((i10 * (d + f11)) + AndroidUtilities.dp((f10 * 4.0f) + (Math.max(0.0f, Math.min(f11, f10)) * 3.0f) + 5.0f)), AndroidUtilities.lerp(((AndroidUtilities.dp(f11) + i10) * i11) + AndroidUtilities.dp(3.0f), (quVar.getMeasuredHeight() - i10) / 2, max), dp2 + i10, lerp + i10);
                    rectF.inset(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(max * (-2.0f)));
                    paint.setColor(org.telegram.ui.ActionBar.j6.l1(AndroidUtilities.lerp(f11, 0.5f, max), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19996i6, f6Var)));
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
                    quVar = this;
                }
                drawableArr[0].setBounds(AndroidUtilities.dp(5.0f), (getMeasuredHeight() - i10) / 2, AndroidUtilities.dp(5.0f) + i10, (getMeasuredHeight() + i10) / 2);
                drawableArr[0].draw(canvas);
                canvas.drawRect(AndroidUtilities.dp(8.45f) + i10, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.45f) + i10 + 1, getMeasuredHeight() - AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.f20025k0);
                return;
            }
            float d10 = z5Var2.d(iArr[0], false);
            int dp7 = AndroidUtilities.dp(5.0f);
            float f12 = dp7;
            rectF.set((int) ((i10 * d10) + AndroidUtilities.dp((d10 * 4.0f) + 5.0f)), f12, dp + i10, dp7 + i10);
            rectF.inset(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(-2.0f));
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19996i6, f6Var));
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
        } else if (!this.f28250f) {
            return super.onTouchEvent(motionEvent);
        } else {
            int i13 = 0;
            while (true) {
                Drawable[] drawableArr = this.f28248b;
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
            int[] iArr = this.f28251n;
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
            int[] iArr2 = this.f28252r;
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
