package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Text;

public final class BotAskCellDrawable extends Drawable {
    public final Drawable botLogo;
    public final int currentAccount;
    public final Paint dPaint;
    public final Drawable groupsArrow;
    public int height;
    public final Theme.ResourcesProvider resourcesProvider;
    public final Text text;
    public final Text title;
    public final RectF tmpRect = new RectF();
    public int width;

    public BotAskCellDrawable(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        Paint paint = new Paint(1);
        this.dPaint = paint;
        this.currentAccount = i;
        this.resourcesProvider = resourcesProvider;
        Text text = new Text(LocaleController.getString(R.string.BotForumAskForStartNewChatTitle), 14.0f, AndroidUtilities.bold());
        this.title = text;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        text.align(alignment);
        Text text2 = new Text("", 13.0f);
        this.text = text2;
        text2.multiline(4);
        text2.align(alignment);
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.filled_topic_new_24).mutate();
        this.botLogo = drawableMutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable drawableMutate2 = context.getResources().getDrawable(R.drawable.arrow_more).mutate();
        this.groupsArrow = drawableMutate2;
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        drawableMutate2.setAlpha(153);
        paint.setColor(-16777216);
        paint.setAlpha(30);
    }

    @Override
    public final void draw(Canvas canvas) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Paint themePaint = Theme.getThemePaint("paintChatActionBackground", resourcesProvider);
        RectF rectF = this.tmpRect;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), themePaint);
        if (resourcesProvider != null ? resourcesProvider.hasGradientService() : Theme.hasGradientService()) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Theme.getThemePaint("paintChatActionBackgroundDarken", resourcesProvider));
        }
        canvas.save();
        canvas.translate(0.0f, rectF.top + AndroidUtilities.dp(17.0f));
        canvas.drawCircle(rectF.centerX(), AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), this.dPaint);
        int iCenterX = (int) (rectF.centerX() - AndroidUtilities.dp(20.0f));
        int iDp = AndroidUtilities.dp(15.0f);
        int iDp2 = AndroidUtilities.dp(40.0f) + iCenterX;
        int iDp3 = AndroidUtilities.dp(40.0f) + iDp;
        Drawable drawable = this.botLogo;
        drawable.setBounds(iCenterX, iDp, iDp2, iDp3);
        drawable.draw(canvas);
        canvas.translate(0.0f, AndroidUtilities.dp(70.0f));
        canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
        float fCenterX = rectF.centerX();
        Text text = this.title;
        this.title.draw(canvas, fCenterX - (text.getWidth() / 2.0f), text.getHeight() / 2.0f, -1, 1.0f);
        canvas.translate(0.0f, text.getHeight());
        canvas.translate(0.0f, AndroidUtilities.dp(4.0f));
        float fCenterX2 = rectF.centerX();
        Text text2 = this.text;
        this.text.draw(canvas, fCenterX2 - (text2.getWidth() / 2.0f), 0.0f, -1, 1.0f);
        canvas.translate(0.0f, text2.getHeight());
        canvas.translate(0.0f, AndroidUtilities.dp(2.0f));
        int iCenterX2 = (int) (rectF.centerX() - AndroidUtilities.dp(10.0f));
        int iCenterX3 = (int) (rectF.centerX() + AndroidUtilities.dp(10.0f));
        int iDp4 = AndroidUtilities.dp(20.0f);
        Drawable drawable2 = this.groupsArrow;
        drawable2.setBounds(iCenterX2, 0, iCenterX3, iDp4);
        drawable2.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.tmpRect.set(rect);
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
