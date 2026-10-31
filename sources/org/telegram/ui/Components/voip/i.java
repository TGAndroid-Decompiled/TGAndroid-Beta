package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.cd;
import org.telegram.ui.ActionBar.t6;
public final class i extends View {
    public org.telegram.ui.Cells.y f31466a;
    public final Paint f31467b;
    public final Paint f31468c;
    public final Paint d;
    public final RectF e;
    public final Drawable f31469f;
    public final String h;
    public int f31470n;
    public int f31471r;
    public int f31472s;
    public int f31473w;

    public i(Context context) {
        super(context);
        this.f31467b = new Paint(1);
        Paint paint = new Paint(1);
        this.f31468c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.f31470n = -761748;
        this.f31471r = org.telegram.messenger.i0.L(26.0f);
        this.f31472s = 255;
        this.f31473w = 0;
        Drawable mutate = getContext().getDrawable(2131230918).mutate();
        this.f31469f = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        paint.setTextSize(org.telegram.messenger.i0.L(18.0f));
        paint.setTypeface(org.telegram.messenger.i0.o());
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setTextSize(org.telegram.messenger.i0.L(18.0f));
        paint2.setTypeface(org.telegram.messenger.i0.o());
        paint2.setTextAlign(align);
        paint2.setColor(-16777216);
        setLayerType(2, null);
        setClickable(true);
        this.h = cd.L0(2131752041, null);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.y yVar = this.f31466a;
        if (yVar != null) {
            yVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.f31466a;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        int i10 = this.f31470n;
        Paint paint = this.f31467b;
        paint.setColor(i10);
        RectF rectF = this.e;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float f7 = this.f31471r;
        canvas.drawRoundRect(rectF, f7, f7, paint);
        Drawable drawable = this.f31469f;
        drawable.setBounds((int) (width - (drawable.getIntrinsicWidth() / 2.0f)), (int) (height - (drawable.getIntrinsicHeight() / 2)), (int) ((drawable.getIntrinsicWidth() / 2) + width), (int) ((drawable.getIntrinsicHeight() / 2) + height));
        drawable.setAlpha(this.f31472s);
        drawable.draw(canvas);
        int i11 = this.f31473w;
        Paint paint2 = this.f31468c;
        paint2.setAlpha(i11);
        Paint paint3 = this.d;
        paint3.setAlpha((this.f31473w / 255) * 38);
        String str = this.h;
        canvas.drawText(str, width, org.telegram.messenger.i0.L(6.0f) + height, paint2);
        canvas.drawText(str, width, height + org.telegram.messenger.i0.L(6.0f), paint3);
        if (this.f31466a == null) {
            org.telegram.ui.Cells.y a02 = t6.a0(t6.x0(null, t6.f21020i6, false), 8, 8);
            this.f31466a = a02;
            a02.setCallback(this);
        }
        this.f31466a.setBounds(0, 0, getWidth(), getHeight());
        this.f31466a.draw(canvas);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f31466a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
