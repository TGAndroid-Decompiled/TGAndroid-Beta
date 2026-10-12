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
public final class iv extends View {
    public Utilities.Callback2 E;
    public int F;
    public boolean G;
    public long H;
    public boolean I;
    public final int f26098a;
    public final Drawable[] f26099b;
    public final Drawable f26100c;
    public final Drawable d;
    public String e;
    public boolean f26101f;
    public int h;
    public final int[] f26102n;
    public final int[] f26103r;
    public final Paint f26104s;
    public final RectF v;
    public final g6 f26105w;
    public final g6 f26106x;
    public final org.telegram.ui.ActionBar.c6 f26107y;

    public iv(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        float f7;
        if (AndroidUtilities.isTablet()) {
            f7 = 40.0f;
        } else {
            f7 = 32.0f;
        }
        this.f26098a = AndroidUtilities.dp(f7);
        this.f26099b = new Drawable[11];
        this.f26102n = new int[]{0, 0};
        this.f26103r = new int[]{0, 0};
        this.f26104s = new Paint(1);
        this.v = new RectF();
        es esVar = es.h;
        this.f26105w = new g6(this, 125L, esVar);
        this.f26106x = new g6(this, 125L, esVar);
        this.F = -1;
        this.G = true;
        this.f26107y = c6Var;
        this.f26100c = getResources().getDrawable(R.drawable.stickers_back_all);
        this.d = getResources().getDrawable(R.drawable.stickers_back_arrow);
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.g6.f19972h5;
        org.telegram.ui.ActionBar.c6 c6Var = this.f26107y;
        org.telegram.ui.ActionBar.g6.x1(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), this.f26100c);
        org.telegram.ui.ActionBar.g6.x1(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), this.d);
        CompoundEmoji.setPlaceholderColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Me, c6Var));
    }

    public String getEmoji() {
        return this.e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        g6 g6Var;
        float f7;
        int dp2;
        int lerp;
        iv ivVar = this;
        int measuredWidth = ivVar.getMeasuredWidth();
        int measuredHeight = ivVar.getMeasuredHeight() - AndroidUtilities.dp(2.0f);
        Drawable drawable = ivVar.f26100c;
        boolean z10 = false;
        drawable.setBounds(0, 0, measuredWidth, measuredHeight);
        drawable.draw(canvas);
        int dp3 = ivVar.h - AndroidUtilities.dp(9.0f);
        int measuredHeight2 = ivVar.getMeasuredHeight() - AndroidUtilities.dp(6.34f);
        int dp4 = AndroidUtilities.dp(9.0f) + ivVar.h;
        int measuredHeight3 = ivVar.getMeasuredHeight();
        Drawable drawable2 = ivVar.d;
        drawable2.setBounds(dp3, measuredHeight2, dp4, measuredHeight3);
        drawable2.draw(canvas);
        if (ivVar.e != null) {
            boolean z11 = ivVar.f26101f;
            org.telegram.ui.ActionBar.c6 c6Var = ivVar.f26107y;
            int[] iArr = ivVar.f26102n;
            g6 g6Var2 = ivVar.f26105w;
            Paint paint = ivVar.f26104s;
            Drawable[] drawableArr = ivVar.f26099b;
            RectF rectF = ivVar.v;
            float f10 = 1.0f;
            int i10 = ivVar.f26098a;
            if (z11) {
                int i11 = 0;
                while (i11 < 2) {
                    if (i11 == 0) {
                        g6Var = g6Var2;
                    } else {
                        g6Var = ivVar.f26106x;
                    }
                    float d = g6Var.d(iArr[i11], z10);
                    boolean z12 = z10;
                    float max = Math.max(0.0f, Math.min(f10, -d));
                    rectF.set((int) ((i10 * (d + f10)) + AndroidUtilities.dp((f7 * 4.0f) + (Math.max(0.0f, Math.min(f10, f7)) * 3.0f) + 5.0f)), AndroidUtilities.lerp(((AndroidUtilities.dp(f10) + i10) * i11) + AndroidUtilities.dp(3.0f), (ivVar.getMeasuredHeight() - i10) / 2, max), dp2 + i10, lerp + i10);
                    rectF.inset(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(max * (-2.0f)));
                    paint.setColor(org.telegram.ui.ActionBar.g6.m1(AndroidUtilities.lerp(f10, 0.5f, max), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19990i6, c6Var)));
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
                    ivVar = this;
                    z10 = z12;
                }
                boolean z13 = z10;
                drawableArr[z13 ? 1 : 0].setBounds(AndroidUtilities.dp(5.0f), (getMeasuredHeight() - i10) / 2, AndroidUtilities.dp(5.0f) + i10, (getMeasuredHeight() + i10) / 2);
                drawableArr[z13 ? 1 : 0].draw(canvas);
                canvas.drawRect(AndroidUtilities.dp(8.45f) + i10, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.45f) + i10 + 1, getMeasuredHeight() - AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.g6.f20022k0);
                return;
            }
            float d10 = g6Var2.d(iArr[0], false);
            int dp7 = AndroidUtilities.dp(5.0f);
            float f11 = dp7;
            rectF.set((int) ((i10 * d10) + AndroidUtilities.dp((d10 * 4.0f) + 5.0f)), f11, dp + i10, dp7 + i10);
            rectF.inset(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(-2.0f));
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19990i6, c6Var));
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
        } else if (!this.f26101f) {
            return super.onTouchEvent(motionEvent);
        } else {
            int i13 = 0;
            while (true) {
                Drawable[] drawableArr = this.f26099b;
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
            int[] iArr = this.f26102n;
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
            int[] iArr2 = this.f26103r;
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
