package org.telegram.ui.Components;

import android.app.Activity;
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
import org.telegram.ui.ActionBar.Theme;

public final class AttachBotIntroTopView extends View {
    public final Drawable attachDrawable;
    public final Paint backgroundPaint;
    public final ImageReceiver imageReceiver;
    public final Paint paint;

    public AttachBotIntroTopView(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.paint = paint;
        this.backgroundPaint = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.imageReceiver = imageReceiver;
        imageReceiver.setAlpha(0.0f);
        imageReceiver.setDelegate(new ColorPicker$$ExternalSyntheticLambda6(this, 6));
        this.attachDrawable = activity.getDrawable(R.drawable.input_attach).mutate().getConstantState().newDrawable();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.imageReceiver.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.imageReceiver.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(10.0f) + getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.backgroundPaint);
        ImageReceiver imageReceiver = this.imageReceiver;
        imageReceiver.setImageCoords((getWidth() / 2.0f) - AndroidUtilities.dp(66.0f), (getHeight() / 2.0f) - (AndroidUtilities.dp(42.0f) / 2.0f), AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
        imageReceiver.draw(canvas);
        float width = (getWidth() / 2.0f) - AndroidUtilities.dp(8.0f);
        float height = getHeight() / 2.0f;
        float width2 = (getWidth() / 2.0f) + AndroidUtilities.dp(8.0f);
        float height2 = getHeight() / 2.0f;
        Paint paint = this.paint;
        canvas.drawLine(width, height, width2, height2, paint);
        canvas.drawLine(getWidth() / 2.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(8.0f), getWidth() / 2.0f, AndroidUtilities.dp(8.0f) + (getHeight() / 2.0f), paint);
        int iDp = AndroidUtilities.dp(24.0f) + (getWidth() / 2);
        int height3 = (getHeight() / 2) - (AndroidUtilities.dp(42.0f) / 2);
        int iDp2 = AndroidUtilities.dp(66.0f) + (getWidth() / 2);
        int iDp3 = (AndroidUtilities.dp(42.0f) / 2) + (getHeight() / 2);
        Drawable drawable = this.attachDrawable;
        drawable.setBounds(iDp, height3, iDp2, iDp3);
        drawable.draw(canvas);
    }

    public void setAttachBot(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_attachMenuBotIcon staticAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(tL_attachMenuBot);
        if (staticAttachMenuBotIcon != null) {
            this.imageReceiver.setImage(ImageLocation.getForDocument(staticAttachMenuBotIcon.icon), "42_42", DocumentObject.getSvgThumb(staticAttachMenuBotIcon.icon, Theme.key_dialogTextGray2, 1.0f), "svg", tL_attachMenuBot, 0);
        }
    }

    @Override
    public void setBackgroundColor(int i) {
        this.backgroundPaint.setColor(i);
    }

    public void setColor(int i) {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.attachDrawable.setColorFilter(i, mode);
        this.paint.setColor(i);
        this.imageReceiver.setColorFilter(new PorterDuffColorFilter(i, mode));
    }
}
