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

public final class PlayingGameDrawable extends StatusDrawable {
    public final boolean isDialogScreen;
    public float progress;
    public final Theme.ResourcesProvider resourcesProvider;
    public boolean isChat = false;
    public final Paint paint = new Paint(1);
    public final int currentAccount = UserConfig.selectedAccount;
    public long lastUpdateTime = 0;
    public boolean started = false;
    public final RectF rect = new RectF();

    public PlayingGameDrawable(Theme.ResourcesProvider resourcesProvider, boolean z) {
        this.isDialogScreen = z;
        this.resourcesProvider = resourcesProvider;
    }

    public final void checkUpdate() {
        if (this.started) {
            if (NotificationCenter.getInstance(this.currentAccount).isAnimationInProgress()) {
                AndroidUtilities.runOnUIThread(new PasscodeView$9$$ExternalSyntheticLambda0(this, 12), 100L);
                return;
            }
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
    }

    @Override
    public final void draw(Canvas canvas) {
        int iDp = AndroidUtilities.dp(10.0f);
        int iDp2 = ((AndroidUtilities.dp(18.0f) - iDp) / 2) + getBounds().top;
        if (!this.isChat) {
            iDp2 += AndroidUtilities.dp(1.0f);
        }
        int i = iDp2;
        Paint paint = this.paint;
        boolean z = this.isDialogScreen;
        paint.setColor(Theme.getColor(z ? Theme.key_chats_actionMessage : Theme.key_chat_status, this.resourcesProvider));
        RectF rectF = this.rect;
        rectF.set(0.0f, i, iDp, i + iDp);
        float f = this.progress;
        int iM$1 = (int) (f < 0.5f ? OKLCH.m$1(f, 0.5f, 1.0f, 35.0f) : ((f - 0.5f) * 35.0f) / 0.5f);
        for (int i2 = 0; i2 < 3; i2++) {
            float fDp = AndroidUtilities.dp(9.2f) + (AndroidUtilities.dp(5.0f) * i2);
            float fDp2 = AndroidUtilities.dp(5.0f);
            float f2 = this.progress;
            float f3 = fDp - (fDp2 * f2);
            if (i2 == 2) {
                paint.setAlpha(Math.min(255, (int) ((f2 * 255.0f) / 0.5f)));
            } else if (i2 != 0) {
                paint.setAlpha(255);
            } else if (f2 > 0.5f) {
                paint.setAlpha((int) ((1.0f - ((f2 - 0.5f) / 0.5f)) * 255.0f));
            } else {
                paint.setAlpha(255);
            }
            canvas.drawCircle(f3, (iDp / 2) + i, AndroidUtilities.dp(1.2f), paint);
        }
        paint.setAlpha(255);
        canvas.drawArc(rectF, iM$1, 360 - (iM$1 * 2), true, paint);
        paint.setColor(Theme.getColor(null, z ? Theme.key_windowBackgroundWhite : Theme.key_actionBarDefault, false));
        canvas.drawCircle(AndroidUtilities.dp(4.0f), ((iDp / 2) + i) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), paint);
        checkUpdate();
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(18.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(20.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColor(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override
    public final void setIsChat(boolean z) {
        this.isChat = z;
    }

    @Override
    public final void start() {
        this.lastUpdateTime = System.currentTimeMillis();
        this.started = true;
        invalidateSelf();
    }

    @Override
    public final void stop() {
        this.progress = 0.0f;
        this.started = false;
    }
}
