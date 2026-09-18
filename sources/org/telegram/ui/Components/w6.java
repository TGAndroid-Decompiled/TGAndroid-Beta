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
public final class w6 extends View {
    public final ImageReceiver f29866a;
    public final Drawable f29867b;
    public final Paint f29868c;
    public final Paint d;

    public w6(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f29868c = paint;
        this.d = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f29866a = imageReceiver;
        imageReceiver.setAlpha(0.0f);
        imageReceiver.setDelegate(new s(this, 12));
        this.f29867b = context.getDrawable(R.drawable.input_attach).mutate().getConstantState().newDrawable();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29866a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29866a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(10.0f) + getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.d);
        ImageReceiver imageReceiver = this.f29866a;
        imageReceiver.setImageCoords((getWidth() / 2.0f) - AndroidUtilities.dp(66.0f), (getHeight() / 2.0f) - (AndroidUtilities.dp(42.0f) / 2.0f), AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
        imageReceiver.draw(canvas);
        Paint paint = this.f29868c;
        canvas.drawLine((getWidth() / 2.0f) - AndroidUtilities.dp(8.0f), getHeight() / 2.0f, (getWidth() / 2.0f) + AndroidUtilities.dp(8.0f), getHeight() / 2.0f, paint);
        canvas.drawLine(getWidth() / 2.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(8.0f), getWidth() / 2.0f, AndroidUtilities.dp(8.0f) + (getHeight() / 2.0f), paint);
        int dp = AndroidUtilities.dp(24.0f) + (getWidth() / 2);
        int height = (getHeight() / 2) - (AndroidUtilities.dp(42.0f) / 2);
        int dp2 = AndroidUtilities.dp(66.0f) + (getWidth() / 2);
        int dp3 = (AndroidUtilities.dp(42.0f) / 2) + (getHeight() / 2);
        Drawable drawable = this.f29867b;
        drawable.setBounds(dp, height, dp2, dp3);
        drawable.draw(canvas);
    }

    public void setAttachBot(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_attachMenuBotIcon staticAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(tL_attachMenuBot);
        if (staticAttachMenuBotIcon != null) {
            this.f29866a.setImage(ImageLocation.getForDocument(staticAttachMenuBotIcon.icon), "42_42", DocumentObject.getSvgThumb(staticAttachMenuBotIcon.icon, org.telegram.ui.ActionBar.j6.f19300q5, 1.0f), "svg", tL_attachMenuBot, 0);
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.d.setColor(i10);
    }

    public void setColor(int i10) {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f29867b.setColorFilter(i10, mode);
        this.f29868c.setColor(i10);
        this.f29866a.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }
}
