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

    public final ImageReceiver f31805a;

    public final Drawable f31806b;

    public final Paint f31807c;
    public final Paint d;

    public q6(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f31807c = paint;
        this.d = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f31805a = imageReceiver;
        imageReceiver.setAlpha(0.0f);
        imageReceiver.setDelegate(new s(this, 12));
        this.f31806b = context.getDrawable(R.drawable.input_attach).mutate().getConstantState().newDrawable();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31805a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31805a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(10.0f) + getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.d);
        float width = (getWidth() / 2.0f) - AndroidUtilities.dp(66.0f);
        float height = (getHeight() / 2.0f) - (AndroidUtilities.dp(42.0f) / 2.0f);
        float fDp = AndroidUtilities.dp(42.0f);
        float fDp2 = AndroidUtilities.dp(42.0f);
        ImageReceiver imageReceiver = this.f31805a;
        imageReceiver.setImageCoords(width, height, fDp, fDp2);
        imageReceiver.draw(canvas);
        float width2 = (getWidth() / 2.0f) - AndroidUtilities.dp(8.0f);
        float height2 = getHeight() / 2.0f;
        float width3 = (getWidth() / 2.0f) + AndroidUtilities.dp(8.0f);
        float height3 = getHeight() / 2.0f;
        Paint paint = this.f31807c;
        canvas.drawLine(width2, height2, width3, height3, paint);
        canvas.drawLine(getWidth() / 2.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(8.0f), getWidth() / 2.0f, AndroidUtilities.dp(8.0f) + (getHeight() / 2.0f), paint);
        int iDp = AndroidUtilities.dp(24.0f) + (getWidth() / 2);
        int height4 = (getHeight() / 2) - (AndroidUtilities.dp(42.0f) / 2);
        int iDp2 = AndroidUtilities.dp(66.0f) + (getWidth() / 2);
        int iDp3 = (AndroidUtilities.dp(42.0f) / 2) + (getHeight() / 2);
        Drawable drawable = this.f31806b;
        drawable.setBounds(iDp, height4, iDp2, iDp3);
        drawable.draw(canvas);
    }

    public void setAttachBot(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_attachMenuBotIcon staticAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(tL_attachMenuBot);
        if (staticAttachMenuBotIcon != null) {
            this.f31805a.setImage(ImageLocation.getForDocument(staticAttachMenuBotIcon.icon), "42_42", DocumentObject.getSvgThumb(staticAttachMenuBotIcon.icon, org.telegram.ui.ActionBar.g6.f23283q5, 1.0f), "svg", tL_attachMenuBot, 0);
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.d.setColor(i10);
    }

    public void setColor(int i10) {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f31806b.setColorFilter(i10, mode);
        this.f31807c.setColor(i10);
        this.f31805a.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }
}
