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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;

public final class j extends View {

    public org.telegram.ui.Cells.z f33627a;

    public final Paint f33628b;

    public final Paint f33629c;
    public final Paint d;

    public final RectF f33630e;

    public final Drawable f33631f;
    public final String h;

    public int f33632n;

    public int f33633r;

    public int f33634s;
    public int v;

    public j(Context context) {
        super(context);
        this.f33628b = new Paint(1);
        Paint paint = new Paint(1);
        this.f33629c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f33630e = new RectF();
        this.f33632n = -761748;
        this.f33633r = AndroidUtilities.dp(26.0f);
        this.f33634s = 255;
        this.v = 0;
        Drawable drawableMutate = getContext().getDrawable(R.drawable.calls_decline).mutate();
        this.f33631f = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        paint.setTextSize(AndroidUtilities.dp(18.0f));
        paint.setTypeface(AndroidUtilities.bold());
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setTextSize(AndroidUtilities.dp(18.0f));
        paint2.setTypeface(AndroidUtilities.bold());
        paint2.setTextAlign(align);
        paint2.setColor(-16777216);
        setLayerType(2, null);
        setClickable(true);
        this.h = LocaleController.getString(R.string.Close);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.z zVar = this.f33627a;
        if (zVar != null) {
            zVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.f33627a;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        int i10 = this.f33632n;
        Paint paint = this.f33628b;
        paint.setColor(i10);
        float width2 = getWidth();
        float height2 = getHeight();
        RectF rectF = this.f33630e;
        rectF.set(0.0f, 0.0f, width2, height2);
        float f10 = this.f33633r;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        Drawable drawable = this.f33631f;
        drawable.setBounds((int) (width - (drawable.getIntrinsicWidth() / 2.0f)), (int) (height - (drawable.getIntrinsicHeight() / 2)), (int) ((drawable.getIntrinsicWidth() / 2) + width), (int) ((drawable.getIntrinsicHeight() / 2) + height));
        drawable.setAlpha(this.f33634s);
        drawable.draw(canvas);
        int i11 = this.v;
        Paint paint2 = this.f33629c;
        paint2.setAlpha(i11);
        int i12 = (this.v / 255) * 38;
        Paint paint3 = this.d;
        paint3.setAlpha(i12);
        float fDp = AndroidUtilities.dp(6.0f) + height;
        String str = this.h;
        canvas.drawText(str, width, fDp, paint2);
        canvas.drawText(str, width, height + AndroidUtilities.dp(6.0f), paint3);
        if (this.f33627a == null) {
            org.telegram.ui.Cells.z zVarY = g6.Y(g6.w0(null, g6.f23144i6, false), 8, 8);
            this.f33627a = zVarY;
            zVarY.setCallback(this);
        }
        this.f33627a.setBounds(0, 0, getWidth(), getHeight());
        this.f33627a.draw(canvas);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return this.f33627a == drawable || super.verifyDrawable(drawable);
    }
}
