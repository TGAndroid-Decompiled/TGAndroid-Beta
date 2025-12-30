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
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Text;

public class BotAskCellDrawable extends Drawable {
    private final Drawable botLogo;
    private final int currentAccount;
    private final Drawable groupsArrow;
    private int height;
    private final Theme.ResourcesProvider resourcesProvider;
    private final Text text;
    private final Text title;
    private int width;
    private final RectF tmpRect = new RectF();
    private Paint dPaint = new Paint(1);

    @Override
    public int getOpacity() {
        return 0;
    }

    @Override
    public void setAlpha(int i) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public BotAskCellDrawable(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
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
        this.dPaint.setColor(-16777216);
        this.dPaint.setAlpha(30);
    }

    public void set(long j) {
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
        this.text.multiline(1);
        this.text.setMaxWidth(9999.0f);
        this.text.setText(LocaleController.formatString(R.string.BotForumAskForStartNewChat, UserObject.getUserName(user)));
        float fCalculateRealWidth = (this.text.calculateRealWidth() / 2.0f) * 1.2f;
        this.text.multiline(4);
        float f = (int) (AndroidUtilities.displaySize.x * 0.95f);
        this.text.setMaxWidth(Math.min(f, fCalculateRealWidth));
        if (this.text.getLineCount() > 2) {
            this.text.setMaxWidth(Math.min(f, fCalculateRealWidth * 1.2f));
        }
        float fMin = Math.min(Math.max(Math.max(0.0f, this.text.calculateRealWidth()), this.title.calculateRealWidth()) + AndroidUtilities.dp(32.0f), f);
        float fDp = AndroidUtilities.dp(17.0f) + 0.0f + AndroidUtilities.dp(70.0f) + AndroidUtilities.dp(14.0f) + this.title.getHeight() + AndroidUtilities.dp(4.0f) + this.text.getHeight() + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(5.0f);
        this.width = (int) fMin;
        this.height = (int) fDp;
    }

    public int getBubbleWidth() {
        return this.width;
    }

    public int getBubbleHeight() {
        return this.height;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawRoundRect(this.tmpRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Theme.getThemePaint("paintChatActionBackground", this.resourcesProvider));
        if (hasGradientService()) {
            canvas.drawRoundRect(this.tmpRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Theme.getThemePaint("paintChatActionBackgroundDarken", this.resourcesProvider));
        }
        canvas.save();
        canvas.translate(0.0f, this.tmpRect.top + AndroidUtilities.dp(17.0f));
        canvas.drawCircle(this.tmpRect.centerX(), AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), this.dPaint);
        int iCenterX = (int) (this.tmpRect.centerX() - AndroidUtilities.dp(20.0f));
        int iDp = AndroidUtilities.dp(15.0f);
        this.botLogo.setBounds(iCenterX, iDp, AndroidUtilities.dp(40.0f) + iCenterX, AndroidUtilities.dp(40.0f) + iDp);
        this.botLogo.draw(canvas);
        canvas.translate(0.0f, AndroidUtilities.dp(70.0f));
        canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
        this.title.draw(canvas, this.tmpRect.centerX() - (this.title.getWidth() / 2.0f), this.title.getHeight() / 2.0f, -1, 1.0f);
        canvas.translate(0.0f, this.title.getHeight());
        canvas.translate(0.0f, AndroidUtilities.dp(4.0f));
        this.text.draw(canvas, this.tmpRect.centerX() - (this.text.getWidth() / 2.0f), 0.0f, -1, 1.0f);
        canvas.translate(0.0f, this.text.getHeight());
        canvas.translate(0.0f, AndroidUtilities.dp(2.0f));
        this.groupsArrow.setBounds((int) (this.tmpRect.centerX() - AndroidUtilities.dp(10.0f)), 0, (int) (this.tmpRect.centerX() + AndroidUtilities.dp(10.0f)), AndroidUtilities.dp(20.0f));
        this.groupsArrow.draw(canvas);
        canvas.restore();
    }

    private boolean hasGradientService() {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        return resourcesProvider != null ? resourcesProvider.hasGradientService() : Theme.hasGradientService();
    }

    @Override
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.tmpRect.set(rect);
    }
}
