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
import org.telegram.ui.ActionBar.j6;
public final class j extends View {
    public org.telegram.ui.Cells.z f31554a;
    public final Paint f31555b;
    public final Paint f31556c;
    public final Paint d;
    public final RectF f31557e;
    public final Drawable f31558f;
    public final String h;
    public int f31559n;
    public int f31560r;
    public int f31561s;
    public int v;

    public j(Context context) {
        super(context);
        this.f31555b = new Paint(1);
        Paint paint = new Paint(1);
        this.f31556c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f31557e = new RectF();
        this.f31559n = -761748;
        this.f31560r = AndroidUtilities.dp(26.0f);
        this.f31561s = 255;
        this.v = 0;
        Drawable mutate = getContext().getDrawable(R.drawable.calls_decline).mutate();
        this.f31558f = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
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
        if (!isEnabled()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.z zVar = this.f31554a;
        if (zVar != null) {
            zVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.f31554a;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        int i10 = this.f31559n;
        Paint paint = this.f31555b;
        paint.setColor(i10);
        RectF rectF = this.f31557e;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float f7 = this.f31560r;
        canvas.drawRoundRect(rectF, f7, f7, paint);
        Drawable drawable = this.f31558f;
        drawable.setBounds((int) (width - (drawable.getIntrinsicWidth() / 2.0f)), (int) (height - (drawable.getIntrinsicHeight() / 2)), (int) ((drawable.getIntrinsicWidth() / 2) + width), (int) ((drawable.getIntrinsicHeight() / 2) + height));
        drawable.setAlpha(this.f31561s);
        drawable.draw(canvas);
        int i11 = this.v;
        Paint paint2 = this.f31556c;
        paint2.setAlpha(i11);
        Paint paint3 = this.d;
        paint3.setAlpha((this.v / 255) * 38);
        String str = this.h;
        canvas.drawText(str, width, AndroidUtilities.dp(6.0f) + height, paint2);
        canvas.drawText(str, width, height + AndroidUtilities.dp(6.0f), paint3);
        if (this.f31554a == null) {
            org.telegram.ui.Cells.z Y = j6.Y(j6.w0(null, j6.f20753i6, false), 8, 8);
            this.f31554a = Y;
            Y.setCallback(this);
        }
        this.f31554a.setBounds(0, 0, getWidth(), getHeight());
        this.f31554a.draw(canvas);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f31554a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
