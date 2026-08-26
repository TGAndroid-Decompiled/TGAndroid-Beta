package org.telegram.ui.Components;

import android.animation.ValueAnimator;
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
import org.telegram.ui.ActionBar.Theme;

public class AttachBotIntroTopView extends View {
    private static final int ICONS_SIDE_PADDING = 24;
    private static final int ICONS_SIZE_DP = 42;
    private Drawable attachDrawable;
    private Paint backgroundPaint;
    private ImageReceiver imageReceiver;
    private Paint paint;

    public AttachBotIntroTopView(Context context) {
        super(context);
        this.paint = new Paint(1);
        this.backgroundPaint = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.imageReceiver = imageReceiver;
        imageReceiver.setAlpha(0.0f);
        this.imageReceiver.setDelegate(new EmojiView$$ExternalSyntheticLambda11(this, 1));
        this.attachDrawable = context.getDrawable(R.drawable.input_attach).mutate().getConstantState().newDrawable();
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        this.paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public void lambda$new$0(ValueAnimator valueAnimator) {
        this.imageReceiver.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        invalidate();
    }

    public void lambda$new$1(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new ButtonBounce$$ExternalSyntheticLambda0(this, 22));
        duration.start();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.imageReceiver.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.imageReceiver.onDetachedFromWindow();
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(10.0f) + getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.backgroundPaint);
        this.imageReceiver.setImageCoords((getWidth() / 2.0f) - AndroidUtilities.dp(66.0f), (getHeight() / 2.0f) - (AndroidUtilities.dp(42.0f) / 2.0f), AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
        this.imageReceiver.draw(canvas);
        canvas.drawLine((getWidth() / 2.0f) - AndroidUtilities.dp(8.0f), getHeight() / 2.0f, (getWidth() / 2.0f) + AndroidUtilities.dp(8.0f), getHeight() / 2.0f, this.paint);
        canvas.drawLine(getWidth() / 2.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(8.0f), getWidth() / 2.0f, AndroidUtilities.dp(8.0f) + (getHeight() / 2.0f), this.paint);
        this.attachDrawable.setBounds(AndroidUtilities.dp(24.0f) + (getWidth() / 2), (getHeight() / 2) - (AndroidUtilities.dp(42.0f) / 2), AndroidUtilities.dp(66.0f) + (getWidth() / 2), (AndroidUtilities.dp(42.0f) / 2) + (getHeight() / 2));
        this.attachDrawable.draw(canvas);
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
        Drawable drawable = this.attachDrawable;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(i, mode);
        this.paint.setColor(i);
        this.imageReceiver.setColorFilter(new PorterDuffColorFilter(i, mode));
    }
}
