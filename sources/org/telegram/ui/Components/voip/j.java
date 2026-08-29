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
    public org.telegram.ui.Cells.z f33760a;
    public final Paint f33761b;
    public final Paint f33762c;
    public final Paint d;
    public final RectF f33763e;
    public final Drawable f33764f;
    public final String h;
    public int f33765n;
    public int f33766r;
    public int f33767s;
    public int v;

    public j(Context context) {
        super(context);
        this.f33761b = new Paint(1);
        Paint paint = new Paint(1);
        this.f33762c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f33763e = new RectF();
        this.f33765n = -761748;
        this.f33766r = AndroidUtilities.dp(26.0f);
        this.f33767s = 255;
        this.v = 0;
        Drawable mutate = getContext().getDrawable(R.drawable.calls_decline).mutate();
        this.f33764f = mutate;
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
        org.telegram.ui.Cells.z zVar = this.f33760a;
        if (zVar != null) {
            zVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.f33760a;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        int i10 = this.f33765n;
        Paint paint = this.f33761b;
        paint.setColor(i10);
        RectF rectF = this.f33763e;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float f9 = this.f33766r;
        canvas.drawRoundRect(rectF, f9, f9, paint);
        Drawable drawable = this.f33764f;
        drawable.setBounds((int) (width - (drawable.getIntrinsicWidth() / 2.0f)), (int) (height - (drawable.getIntrinsicHeight() / 2)), (int) ((drawable.getIntrinsicWidth() / 2) + width), (int) ((drawable.getIntrinsicHeight() / 2) + height));
        drawable.setAlpha(this.f33767s);
        drawable.draw(canvas);
        int i11 = this.v;
        Paint paint2 = this.f33762c;
        paint2.setAlpha(i11);
        Paint paint3 = this.d;
        paint3.setAlpha((this.v / 255) * 38);
        String str = this.h;
        canvas.drawText(str, width, AndroidUtilities.dp(6.0f) + height, paint2);
        canvas.drawText(str, width, height + AndroidUtilities.dp(6.0f), paint3);
        if (this.f33760a == null) {
            org.telegram.ui.Cells.z Y = g6.Y(g6.w0(null, g6.f23152i6, false), 8, 8);
            this.f33760a = Y;
            Y.setCallback(this);
        }
        this.f33760a.setBounds(0, 0, getWidth(), getHeight());
        this.f33760a.draw(canvas);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f33760a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
