package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;

public class PlayingGameDrawable extends StatusDrawable {
    private final boolean isDialogScreen;
    private float progress;
    Theme.ResourcesProvider resourcesProvider;
    private boolean isChat = false;
    private Paint paint = new Paint(1);
    private int currentAccount = UserConfig.selectedAccount;
    private long lastUpdateTime = 0;
    private boolean started = false;
    private RectF rect = new RectF();

    public PlayingGameDrawable(boolean z, Theme.ResourcesProvider resourcesProvider) {
        this.isDialogScreen = z;
        this.resourcesProvider = resourcesProvider;
    }

    public void checkUpdate() {
        if (this.started) {
            if (NotificationCenter.getInstance(this.currentAccount).isAnimationInProgress()) {
                AndroidUtilities.runOnUIThread(new Tooltip$$ExternalSyntheticLambda0(this, 2), 100L);
            } else {
                update();
            }
        }
    }

    private void update() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.lastUpdateTime;
        this.lastUpdateTime = jCurrentTimeMillis;
        if (j > 50) {
            j = 50;
        }
        if (this.progress >= 1.0f) {
            this.progress = 0.0f;
        }
        float f = (j / 300.0f) + this.progress;
        this.progress = f;
        if (f > 1.0f) {
            this.progress = 1.0f;
        }
        invalidateLimited();
    }

    @Override
    public void draw(Canvas canvas) {
        int iDp = AndroidUtilities.dp(10.0f);
        int intrinsicHeight = ((getIntrinsicHeight() - iDp) / 2) + getBounds().top;
        if (!this.isChat) {
            intrinsicHeight += AndroidUtilities.dp(1.0f);
        }
        int i = intrinsicHeight;
        this.paint.setColor(Theme.getColor(this.isDialogScreen ? Theme.key_chats_actionMessage : Theme.key_chat_status, this.resourcesProvider));
        this.rect.set(0.0f, i, iDp, i + iDp);
        float f = this.progress;
        int iM$1 = (int) (f < 0.5f ? OKLCH.m$1(f, 0.5f, 1.0f, 35.0f) : ((f - 0.5f) * 35.0f) / 0.5f);
        for (int i2 = 0; i2 < 3; i2++) {
            float fDp = AndroidUtilities.dp(9.2f) + (AndroidUtilities.dp(5.0f) * i2);
            float fDp2 = AndroidUtilities.dp(5.0f);
            float f2 = this.progress;
            float f3 = fDp - (fDp2 * f2);
            if (i2 == 2) {
                this.paint.setAlpha(Math.min(255, (int) ((f2 * 255.0f) / 0.5f)));
            } else if (i2 != 0) {
                this.paint.setAlpha(255);
            } else if (f2 > 0.5f) {
                this.paint.setAlpha((int) ((1.0f - ((f2 - 0.5f) / 0.5f)) * 255.0f));
            } else {
                this.paint.setAlpha(255);
            }
            canvas.drawCircle(f3, (iDp / 2) + i, AndroidUtilities.dp(1.2f), this.paint);
        }
        this.paint.setAlpha(255);
        canvas.drawArc(this.rect, iM$1, 360 - (iM$1 * 2), true, this.paint);
        this.paint.setColor(Theme.getColor(null, this.isDialogScreen ? Theme.key_windowBackgroundWhite : Theme.key_actionBarDefault, false));
        canvas.drawCircle(AndroidUtilities.dp(4.0f), ((iDp / 2) + i) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), this.paint);
        checkUpdate();
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(18.0f);
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(20.0f);
    }

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i) {
    }

    @Override
    public void setColor(int i) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override
    public void setIsChat(boolean z) {
        this.isChat = z;
    }

    @Override
    public void start() {
        this.lastUpdateTime = System.currentTimeMillis();
        this.started = true;
        invalidateSelf();
    }

    @Override
    public void stop() {
        this.progress = 0.0f;
        this.started = false;
    }
}
