package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

public final class dl0 extends Drawable {

    public final lv f27794e;

    public final lv f27795f;
    public float h;

    public float f27797i;

    public final Rect f27791a = new Rect();

    public final er f27792b = ws.f34317b;

    public final int f27793c = AndroidUtilities.dp(24.0f);
    public final int d = AndroidUtilities.dp(24.0f);

    public long f27796g = -1;

    public dl0() {
        lv lvVar = new lv();
        this.f27794e = lvVar;
        lvVar.f30473c.setColor(-2130706433);
        lv lvVar2 = new lv();
        this.f27795f = lvVar2;
        lvVar2.f30473c.setColor(-2130706433);
    }

    public final void a(Canvas canvas, float f10) {
        Rect bounds = getBounds();
        float interpolation = this.f27792b.getInterpolation(f10);
        int iDp = (int) (AndroidUtilities.dp(2.0f) * this.h);
        Rect rect = this.f27791a;
        rect.left = iDp;
        int iDp2 = bounds.bottom - ((int) (AndroidUtilities.dp(6.0f) * this.f27797i));
        rect.bottom = iDp2;
        rect.right = bounds.right - rect.left;
        rect.top = iDp2 - ((int) (AndroidUtilities.dp(4.0f) * this.f27797i));
        lv lvVar = this.f27795f;
        lvVar.setBounds(rect);
        lvVar.draw(canvas);
        int iDp3 = AndroidUtilities.dp(12.0f);
        rect.right = iDp3;
        rect.left = iDp3;
        int iDp4 = AndroidUtilities.dp(8.0f);
        rect.bottom = iDp4;
        rect.top = iDp4;
        rect.inset(-AndroidUtilities.dp(AndroidUtilities.lerp(10, 11, interpolation)), -AndroidUtilities.dp(AndroidUtilities.lerp(2, 3, interpolation)));
        lv lvVar2 = this.f27794e;
        lvVar2.setBounds(rect);
        lvVar2.setAlpha(AndroidUtilities.lerp(128, 255, interpolation));
        lvVar2.draw(canvas);
    }

    public final void b(Canvas canvas, float f10) {
        Rect bounds = getBounds();
        float interpolation = this.f27792b.getInterpolation(f10);
        int iDp = (int) (AndroidUtilities.dp(2.0f) * this.h);
        Rect rect = this.f27791a;
        rect.left = iDp;
        int iDp2 = bounds.bottom - ((int) (AndroidUtilities.dp(6.0f) * this.f27797i));
        rect.bottom = iDp2;
        rect.right = bounds.right - rect.left;
        rect.top = iDp2 - ((int) (AndroidUtilities.dp(4.0f) * this.f27797i));
        rect.offset(0, AndroidUtilities.dp(AndroidUtilities.lerp(0, -8, interpolation)));
        lv lvVar = this.f27795f;
        lvVar.setBounds(rect);
        lvVar.draw(canvas);
        rect.left = (int) (AndroidUtilities.dpf2(AndroidUtilities.lerp(1, 2, interpolation)) * this.h);
        int iDpf2 = (int) (AndroidUtilities.dpf2(AndroidUtilities.lerp(5, 6, interpolation)) * this.f27797i);
        rect.top = iDpf2;
        rect.right = bounds.right - rect.left;
        rect.bottom = iDpf2 + ((int) (AndroidUtilities.dpf2(AndroidUtilities.lerp(6, 4, interpolation)) * this.f27797i));
        rect.offset(0, AndroidUtilities.dp(AndroidUtilities.lerp(0, 8, interpolation)));
        lv lvVar2 = this.f27794e;
        lvVar2.setBounds(rect);
        lvVar2.setAlpha(255);
        lvVar2.draw(canvas);
    }

    public final void c(Canvas canvas, float f10) {
        Rect bounds = getBounds();
        float interpolation = this.f27792b.getInterpolation(f10);
        int iDp = (int) (AndroidUtilities.dp(2.0f) * this.h);
        Rect rect = this.f27791a;
        rect.left = iDp;
        int iDp2 = bounds.bottom - ((int) (AndroidUtilities.dp(6.0f) * this.f27797i));
        rect.bottom = iDp2;
        rect.right = bounds.right - rect.left;
        rect.top = iDp2 - ((int) (AndroidUtilities.dp(4.0f) * this.f27797i));
        rect.offset(0, AndroidUtilities.dp(-8.0f));
        lv lvVar = this.f27795f;
        lvVar.setBounds(rect);
        lvVar.draw(canvas);
        rect.left = (int) (AndroidUtilities.dpf2(2.0f) * this.h);
        int iDpf2 = (int) (AndroidUtilities.dpf2(6.0f) * this.f27797i);
        rect.top = iDpf2;
        rect.right = bounds.right - rect.left;
        rect.bottom = iDpf2 + ((int) (AndroidUtilities.dpf2(4.0f) * this.f27797i));
        rect.offset(0, AndroidUtilities.dp(8.0f));
        lv lvVar2 = this.f27794e;
        lvVar2.setBounds(rect);
        lvVar2.setAlpha(AndroidUtilities.lerp(255, 128, interpolation));
        lvVar2.draw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f27796g <= 0) {
            a(canvas, 0.0f);
            return;
        }
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.f27796g);
        int i10 = iCurrentTimeMillis - 300;
        if (i10 < 0) {
            a(canvas, 0.0f);
        } else if (i10 < 150) {
            a(canvas, i10 / 150.0f);
        } else {
            int i11 = iCurrentTimeMillis - 750;
            if (i11 < 0) {
                a(canvas, 1.0f);
            } else if (i11 < 200) {
                b(canvas, i11 / 200.0f);
            } else {
                int i12 = iCurrentTimeMillis - 1250;
                if (i12 < 0) {
                    b(canvas, 1.0f);
                } else if (i12 < 150) {
                    c(canvas, i12 / 150.0f);
                } else {
                    c(canvas, 1.0f);
                    if (iCurrentTimeMillis - 1400 >= 100) {
                        this.f27796g = System.currentTimeMillis();
                    }
                }
            }
        }
        invalidateSelf();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.d;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f27793c;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.h = rect.width() / this.f27793c;
        this.f27797i = rect.height() / this.d;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27794e.setColorFilter(colorFilter);
        this.f27795f.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
