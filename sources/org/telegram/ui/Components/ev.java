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
public final class ev extends View {
    public Utilities.Callback2 E;
    public int F;
    public boolean G;
    public long H;
    public boolean I;
    public final int f27987a;
    public final Drawable[] f27988b;
    public final Drawable f27989c;
    public final Drawable d;
    public String e;
    public boolean f27990f;
    public int h;
    public final int[] f27991n;
    public final int[] f27992r;
    public final Paint f27993s;
    public final RectF v;
    public final h6 f27994w;
    public final h6 f27995x;
    public final org.telegram.ui.ActionBar.u6 f27996y;

    public ev(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        float f7;
        if (AndroidUtilities.isTablet()) {
            f7 = 40.0f;
        } else {
            f7 = 32.0f;
        }
        this.f27987a = AndroidUtilities.dp(f7);
        this.f27988b = new Drawable[11];
        this.f27991n = new int[]{0, 0};
        this.f27992r = new int[]{0, 0};
        this.f27993s = new Paint(1);
        this.v = new RectF();
        ds dsVar = ds.h;
        this.f27994w = new h6(this, 125L, dsVar);
        this.f27995x = new h6(this, 125L, dsVar);
        this.F = -1;
        this.G = true;
        this.f27996y = u6Var;
        this.f27989c = getResources().getDrawable(R.drawable.stickers_back_all);
        this.d = getResources().getDrawable(R.drawable.stickers_back_arrow);
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.y6.f23427h5;
        org.telegram.ui.ActionBar.u6 u6Var = this.f27996y;
        org.telegram.ui.ActionBar.y6.z1(org.telegram.ui.ActionBar.y6.w0(i10, u6Var), this.f27989c);
        org.telegram.ui.ActionBar.y6.z1(org.telegram.ui.ActionBar.y6.w0(i10, u6Var), this.d);
        CompoundEmoji.setPlaceholderColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Me, u6Var));
    }

    public String getEmoji() {
        return this.e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        h6 h6Var;
        float f7;
        int dp2;
        int lerp;
        ev evVar = this;
        int measuredWidth = evVar.getMeasuredWidth();
        int measuredHeight = evVar.getMeasuredHeight() - AndroidUtilities.dp(2.0f);
        Drawable drawable = evVar.f27989c;
        boolean z10 = false;
        drawable.setBounds(0, 0, measuredWidth, measuredHeight);
        drawable.draw(canvas);
        int dp3 = evVar.h - AndroidUtilities.dp(9.0f);
        int measuredHeight2 = evVar.getMeasuredHeight() - AndroidUtilities.dp(6.34f);
        int dp4 = AndroidUtilities.dp(9.0f) + evVar.h;
        int measuredHeight3 = evVar.getMeasuredHeight();
        Drawable drawable2 = evVar.d;
        drawable2.setBounds(dp3, measuredHeight2, dp4, measuredHeight3);
        drawable2.draw(canvas);
        if (evVar.e != null) {
            boolean z11 = evVar.f27990f;
            org.telegram.ui.ActionBar.u6 u6Var = evVar.f27996y;
            int[] iArr = evVar.f27991n;
            h6 h6Var2 = evVar.f27994w;
            Paint paint = evVar.f27993s;
            Drawable[] drawableArr = evVar.f27988b;
            RectF rectF = evVar.v;
            float f10 = 1.0f;
            int i10 = evVar.f27987a;
            if (z11) {
                int i11 = 0;
                while (i11 < 2) {
                    if (i11 == 0) {
                        h6Var = h6Var2;
                    } else {
                        h6Var = evVar.f27995x;
                    }
                    float d = h6Var.d(iArr[i11], z10);
                    boolean z12 = z10;
                    float max = Math.max(0.0f, Math.min(f10, -d));
                    rectF.set((int) ((i10 * (d + f10)) + AndroidUtilities.dp((f7 * 4.0f) + (Math.max(0.0f, Math.min(f10, f7)) * 3.0f) + 5.0f)), AndroidUtilities.lerp(((AndroidUtilities.dp(f10) + i10) * i11) + AndroidUtilities.dp(3.0f), (evVar.getMeasuredHeight() - i10) / 2, max), dp2 + i10, lerp + i10);
                    rectF.inset(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(max * (-2.0f)));
                    paint.setColor(org.telegram.ui.ActionBar.y6.o1(AndroidUtilities.lerp(f10, 0.5f, max), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23448i6, u6Var)));
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
                    evVar = this;
                    z10 = z12;
                }
                boolean z13 = z10;
                drawableArr[z13 ? 1 : 0].setBounds(AndroidUtilities.dp(5.0f), (getMeasuredHeight() - i10) / 2, AndroidUtilities.dp(5.0f) + i10, (getMeasuredHeight() + i10) / 2);
                drawableArr[z13 ? 1 : 0].draw(canvas);
                canvas.drawRect(AndroidUtilities.dp(8.45f) + i10, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.45f) + i10 + 1, getMeasuredHeight() - AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.y6.f23478k0);
                return;
            }
            float d10 = h6Var2.d(iArr[0], false);
            int dp7 = AndroidUtilities.dp(5.0f);
            float f11 = dp7;
            rectF.set((int) ((i10 * d10) + AndroidUtilities.dp((d10 * 4.0f) + 5.0f)), f11, dp + i10, dp7 + i10);
            rectF.inset(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(-2.0f));
            paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23448i6, u6Var));
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
        } else if (!this.f27990f) {
            return super.onTouchEvent(motionEvent);
        } else {
            int i13 = 0;
            while (true) {
                Drawable[] drawableArr = this.f27988b;
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
            int[] iArr = this.f27991n;
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
            int[] iArr2 = this.f27992r;
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
