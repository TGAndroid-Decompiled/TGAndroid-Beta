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
public final class y6 extends View {
    public final ImageReceiver f33123a;
    public final Drawable f33124b;
    public final Paint f33125c;
    public final Paint d;

    public y6(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f33125c = paint;
        this.d = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f33123a = imageReceiver;
        imageReceiver.setAlpha(0.0f);
        imageReceiver.setDelegate(new s(this, 12));
        this.f33124b = context.getDrawable(R.drawable.input_attach).mutate().getConstantState().newDrawable();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33123a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33123a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(10.0f) + getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.d);
        ImageReceiver imageReceiver = this.f33123a;
        imageReceiver.setImageCoords((getWidth() / 2.0f) - AndroidUtilities.dp(66.0f), (getHeight() / 2.0f) - (AndroidUtilities.dp(42.0f) / 2.0f), AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
        imageReceiver.draw(canvas);
        Paint paint = this.f33125c;
        canvas.drawLine((getWidth() / 2.0f) - AndroidUtilities.dp(8.0f), getHeight() / 2.0f, (getWidth() / 2.0f) + AndroidUtilities.dp(8.0f), getHeight() / 2.0f, paint);
        canvas.drawLine(getWidth() / 2.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(8.0f), getWidth() / 2.0f, AndroidUtilities.dp(8.0f) + (getHeight() / 2.0f), paint);
        int dp = AndroidUtilities.dp(24.0f) + (getWidth() / 2);
        int height = (getHeight() / 2) - (AndroidUtilities.dp(42.0f) / 2);
        int dp2 = AndroidUtilities.dp(66.0f) + (getWidth() / 2);
        int dp3 = (AndroidUtilities.dp(42.0f) / 2) + (getHeight() / 2);
        Drawable drawable = this.f33124b;
        drawable.setBounds(dp, height, dp2, dp3);
        drawable.draw(canvas);
    }

    public void setAttachBot(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_attachMenuBotIcon staticAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(tL_attachMenuBot);
        if (staticAttachMenuBotIcon != null) {
            this.f33123a.setImage(ImageLocation.getForDocument(staticAttachMenuBotIcon.icon), "42_42", DocumentObject.getSvgThumb(staticAttachMenuBotIcon.icon, org.telegram.ui.ActionBar.i6.f21036q5, 1.0f), "svg", tL_attachMenuBot, 0);
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.d.setColor(i10);
    }

    public void setColor(int i10) {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f33124b.setColorFilter(i10, mode);
        this.f33125c.setColor(i10);
        this.f33123a.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }
}
