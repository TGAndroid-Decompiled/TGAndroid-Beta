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
public final class hu extends View {
    public Utilities.Callback2 A;
    public int B;
    public boolean C;
    public long D;
    public boolean E;
    public final int f29185a;
    public final Drawable[] f29186b;
    public final Drawable f29187c;
    public final Drawable d;
    public String f29188e;
    public boolean f29189f;
    public int h;
    public final int[] f29190n;
    public final int[] f29191r;
    public final Paint f29192s;
    public final RectF v;
    public final y5 f29193w;
    public final y5 f29194x;
    public final org.telegram.ui.ActionBar.b6 f29195y;

    public hu(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        float f10;
        if (AndroidUtilities.isTablet()) {
            f10 = 40.0f;
        } else {
            f10 = 32.0f;
        }
        this.f29185a = AndroidUtilities.dp(f10);
        this.f29186b = new Drawable[11];
        this.f29190n = new int[]{0, 0};
        this.f29191r = new int[]{0, 0};
        this.f29192s = new Paint(1);
        this.v = new RectF();
        gr grVar = gr.h;
        this.f29193w = new y5(this, 125L, grVar);
        this.f29194x = new y5(this, 125L, grVar);
        this.B = -1;
        this.C = true;
        this.f29195y = b6Var;
        this.f29187c = getResources().getDrawable(R.drawable.stickers_back_all);
        this.d = getResources().getDrawable(R.drawable.stickers_back_arrow);
        a();
    }

    public final void a() {
        int i9 = org.telegram.ui.ActionBar.f6.f23072h5;
        org.telegram.ui.ActionBar.b6 b6Var = this.f29195y;
        org.telegram.ui.ActionBar.f6.w1(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), this.f29187c);
        org.telegram.ui.ActionBar.f6.w1(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), this.d);
        CompoundEmoji.setPlaceholderColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Me, b6Var));
    }

    public String getEmoji() {
        return this.f29188e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        y5 y5Var;
        float f10;
        int dp2;
        int lerp;
        hu huVar = this;
        int measuredWidth = huVar.getMeasuredWidth();
        int measuredHeight = huVar.getMeasuredHeight() - AndroidUtilities.dp(2.0f);
        Drawable drawable = huVar.f29187c;
        boolean z10 = false;
        drawable.setBounds(0, 0, measuredWidth, measuredHeight);
        drawable.draw(canvas);
        int dp3 = huVar.h - AndroidUtilities.dp(9.0f);
        int measuredHeight2 = huVar.getMeasuredHeight() - AndroidUtilities.dp(6.34f);
        int dp4 = AndroidUtilities.dp(9.0f) + huVar.h;
        int measuredHeight3 = huVar.getMeasuredHeight();
        Drawable drawable2 = huVar.d;
        drawable2.setBounds(dp3, measuredHeight2, dp4, measuredHeight3);
        drawable2.draw(canvas);
        if (huVar.f29188e != null) {
            boolean z11 = huVar.f29189f;
            org.telegram.ui.ActionBar.b6 b6Var = huVar.f29195y;
            int[] iArr = huVar.f29190n;
            y5 y5Var2 = huVar.f29193w;
            Paint paint = huVar.f29192s;
            Drawable[] drawableArr = huVar.f29186b;
            RectF rectF = huVar.v;
            float f11 = 1.0f;
            int i9 = huVar.f29185a;
            if (z11) {
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == 0) {
                        y5Var = y5Var2;
                    } else {
                        y5Var = huVar.f29194x;
                    }
                    float d = y5Var.d(iArr[i10], z10);
                    float max = Math.max(0.0f, Math.min(f11, -d));
                    rectF.set((int) ((i9 * (d + f11)) + AndroidUtilities.dp((f10 * 4.0f) + (Math.max(0.0f, Math.min(f11, f10)) * 3.0f) + 5.0f)), AndroidUtilities.lerp(((AndroidUtilities.dp(f11) + i9) * i10) + AndroidUtilities.dp(3.0f), (huVar.getMeasuredHeight() - i9) / 2, max), dp2 + i9, lerp + i9);
                    rectF.inset(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(max * (-2.0f)));
                    paint.setColor(org.telegram.ui.ActionBar.f6.l1(AndroidUtilities.lerp(f11, 0.5f, max), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var)));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                    int i11 = 0;
                    while (i11 < 5) {
                        i11++;
                        int i12 = (i10 * 5) + i11;
                        int dp5 = AndroidUtilities.dp((i11 * 4) + 8) + (i9 * i11);
                        int dp6 = ((AndroidUtilities.dp(f11) + i9) * i10) + AndroidUtilities.dp(3.0f);
                        drawableArr[i12].setBounds(dp5, dp6, dp5 + i9, dp6 + i9);
                        drawableArr[i12].draw(canvas);
                        f11 = 1.0f;
                    }
                    i10++;
                    f11 = 1.0f;
                    z10 = false;
                    huVar = this;
                }
                drawableArr[0].setBounds(AndroidUtilities.dp(5.0f), (getMeasuredHeight() - i9) / 2, AndroidUtilities.dp(5.0f) + i9, (getMeasuredHeight() + i9) / 2);
                drawableArr[0].draw(canvas);
                canvas.drawRect(AndroidUtilities.dp(8.45f) + i9, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.45f) + i9 + 1, getMeasuredHeight() - AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.f6.f23121k0);
                return;
            }
            float d9 = y5Var2.d(iArr[0], false);
            int dp7 = AndroidUtilities.dp(5.0f);
            float f12 = dp7;
            rectF.set((int) ((i9 * d9) + AndroidUtilities.dp((d9 * 4.0f) + 5.0f)), f12, dp + i9, dp7 + i9);
            rectF.inset(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(-2.0f));
            paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
            for (int i13 = 0; i13 < 6; i13++) {
                Drawable drawable3 = drawableArr[i13];
                if (drawable3 != null) {
                    int dp8 = AndroidUtilities.dp((i13 * 4) + 5) + (i9 * i13);
                    float min = ((1.0f - (Math.min(0.5f, Math.abs(i13 - d9)) * 2.0f)) * 0.1f) + 0.9f;
                    canvas.save();
                    canvas.scale(min, min, (i9 / 2.0f) + dp8, (i9 / 2.0f) + f12);
                    drawable3.setBounds(dp8, dp7, dp8 + i9, dp7 + i9);
                    drawable3.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i9;
        int i10;
        boolean z11;
        int i11;
        if (this.E) {
            this.E = false;
            return false;
        } else if (!this.f29189f) {
            return super.onTouchEvent(motionEvent);
        } else {
            int i12 = 0;
            while (true) {
                Drawable[] drawableArr = this.f29186b;
                if (i12 < drawableArr.length) {
                    if (drawableArr[i12].getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) || ((i11 = this.B) != -1 && ((i12 == 0 || ((i11 == 0 && i12 >= 1 && i12 <= 5) || (i11 == 1 && i12 >= 6 && i12 <= 10))) && ((int) motionEvent.getX()) >= drawableArr[i12].getBounds().left && ((int) motionEvent.getX()) <= drawableArr[i12].getBounds().right))) {
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
            int[] iArr = this.f29190n;
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
            int i13 = iArr[0];
            int[] iArr2 = this.f29191r;
            iArr2[0] = i13;
            iArr2[1] = iArr[1];
            if (System.currentTimeMillis() - this.D > 300 && motionEvent.getAction() == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i12 == 0) {
                iArr[0] = -1;
                iArr[1] = -1;
            } else if (i12 >= 1 && i12 <= 5 && ((i10 = this.B) == -1 || i10 == 0)) {
                this.B = 0;
                int i14 = i12 - 1;
                iArr[0] = i14;
                if (iArr[1] == -1 || (this.C && z10)) {
                    iArr[1] = i14;
                }
            } else if (i12 >= 6 && i12 <= 10 && ((i9 = this.B) == -1 || i9 == 1)) {
                this.B = 1;
                int i15 = i12 - 6;
                iArr[1] = i15;
                if (iArr[0] == -1 || (this.C && z10)) {
                    iArr[0] = i15;
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

    public void setArrowX(int i9) {
        this.h = i9;
        invalidate();
    }

    public void setOnSelectionUpdateListener(Utilities.Callback2<Integer, Integer> callback2) {
        this.A = callback2;
    }
}
