package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class q6 extends View {
    public final ImageReceiver f31839a;
    public final Drawable f31840b;
    public final Paint f31841c;
    public final Paint d;

    public q6(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f31841c = paint;
        this.d = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f31839a = imageReceiver;
        imageReceiver.setAlpha(0.0f);
        imageReceiver.setDelegate(new s(this, 12));
        this.f31840b = context.getDrawable(R.drawable.input_attach).mutate().getConstantState().newDrawable();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31839a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31839a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(10.0f) + getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.d);
        ImageReceiver imageReceiver = this.f31839a;
        imageReceiver.setImageCoords((getWidth() / 2.0f) - AndroidUtilities.dp(66.0f), (getHeight() / 2.0f) - (AndroidUtilities.dp(42.0f) / 2.0f), AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
        imageReceiver.draw(canvas);
        Paint paint = this.f31841c;
        canvas.drawLine((getWidth() / 2.0f) - AndroidUtilities.dp(8.0f), getHeight() / 2.0f, (getWidth() / 2.0f) + AndroidUtilities.dp(8.0f), getHeight() / 2.0f, paint);
        canvas.drawLine(getWidth() / 2.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(8.0f), getWidth() / 2.0f, AndroidUtilities.dp(8.0f) + (getHeight() / 2.0f), paint);
        int dp = AndroidUtilities.dp(24.0f) + (getWidth() / 2);
        int height = (getHeight() / 2) - (AndroidUtilities.dp(42.0f) / 2);
        int dp2 = AndroidUtilities.dp(66.0f) + (getWidth() / 2);
        int dp3 = (AndroidUtilities.dp(42.0f) / 2) + (getHeight() / 2);
        Drawable drawable = this.f31840b;
        drawable.setBounds(dp, height, dp2, dp3);
        drawable.draw(canvas);
    }

    public void setAttachBot(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_attachMenuBotIcon staticAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(tL_attachMenuBot);
        if (staticAttachMenuBotIcon != null) {
            this.f31839a.setImage(ImageLocation.getForDocument(staticAttachMenuBotIcon.icon), "42_42", DocumentObject.getSvgThumb(staticAttachMenuBotIcon.icon, org.telegram.ui.ActionBar.f6.f23228q5, 1.0f), "svg", tL_attachMenuBot, 0);
        }
    }

    @Override
    public void setBackgroundColor(int i9) {
        this.d.setColor(i9);
    }

    public void setColor(int i9) {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f31840b.setColorFilter(i9, mode);
        this.f31841c.setColor(i9);
        this.f31839a.setColorFilter(new PorterDuffColorFilter(i9, mode));
    }
}
