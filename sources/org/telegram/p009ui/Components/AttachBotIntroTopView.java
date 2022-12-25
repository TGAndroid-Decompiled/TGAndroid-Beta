package org.telegram.p009ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.ContextCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1010R;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC$TL_attachMenuBot;
import org.telegram.tgnet.TLRPC$TL_attachMenuBotIcon;

public class AttachBotIntroTopView extends View {
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
        this.imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() {
            @Override
            public final void didSetImage(ImageReceiver imageReceiver2, boolean z, boolean z2, boolean z3) {
                AttachBotIntroTopView.this.lambda$new$1(imageReceiver2, z, z2, z3);
            }

            @Override
            public void onAnimationReady(ImageReceiver imageReceiver2) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver2);
            }
        });
        this.attachDrawable = ContextCompat.getDrawable(context, C1010R.C1011drawable.input_attach).mutate().getConstantState().newDrawable();
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(AndroidUtilities.m35dp(3.0f));
        this.paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public void lambda$new$1(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AttachBotIntroTopView.this.lambda$new$0(valueAnimator);
            }
        });
        duration.start();
    }

    public void lambda$new$0(ValueAnimator valueAnimator) {
        this.imageReceiver.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        invalidate();
    }

    public void setAttachBot(TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot) {
        TLRPC$TL_attachMenuBotIcon staticAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(tLRPC$TL_attachMenuBot);
        if (staticAttachMenuBotIcon != null) {
            this.imageReceiver.setImage(ImageLocation.getForDocument(staticAttachMenuBotIcon.icon), "42_42", DocumentObject.getSvgThumb(staticAttachMenuBotIcon.icon, "dialogTextGray2", 1.0f), "svg", tLRPC$TL_attachMenuBot, 0);
        }
    }

    @Override
    public void setBackgroundColor(int i) {
        this.backgroundPaint.setColor(i);
    }

    public void setColor(int i) {
        this.attachDrawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        this.paint.setColor(i);
        this.imageReceiver.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.imageReceiver.onAttachedToWindow();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.imageReceiver.onDetachedFromWindow();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight() + AndroidUtilities.m35dp(6.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.m35dp(6.0f), AndroidUtilities.m35dp(6.0f), this.backgroundPaint);
        this.imageReceiver.setImageCoords((getWidth() / 2.0f) - AndroidUtilities.m35dp(66.0f), (getHeight() / 2.0f) - (AndroidUtilities.m35dp(42.0f) / 2.0f), AndroidUtilities.m35dp(42.0f), AndroidUtilities.m35dp(42.0f));
        this.imageReceiver.draw(canvas);
        canvas.drawLine((getWidth() / 2.0f) - AndroidUtilities.m35dp(8.0f), getHeight() / 2.0f, (getWidth() / 2.0f) + AndroidUtilities.m35dp(8.0f), getHeight() / 2.0f, this.paint);
        canvas.drawLine(getWidth() / 2.0f, (getHeight() / 2.0f) - AndroidUtilities.m35dp(8.0f), getWidth() / 2.0f, (getHeight() / 2.0f) + AndroidUtilities.m35dp(8.0f), this.paint);
        this.attachDrawable.setBounds((getWidth() / 2) + AndroidUtilities.m35dp(24.0f), (getHeight() / 2) - (AndroidUtilities.m35dp(42.0f) / 2), (getWidth() / 2) + AndroidUtilities.m35dp(66.0f), (getHeight() / 2) + (AndroidUtilities.m35dp(42.0f) / 2));
        this.attachDrawable.draw(canvas);
    }
}
