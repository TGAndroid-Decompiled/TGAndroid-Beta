package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda14;

public final class SuggestBirthdayActionLayout {
    public TL_account.TL_birthday birthday;
    public final ButtonBounce bounce;
    public Text button;
    public final int currentAccount;
    public boolean hasButton;
    public final Theme.ResourcesProvider resourcesProvider;
    public final RLottieDrawable sticker;
    public Text text;
    public Text[] titles;
    public Text[] values;
    public final ChatActionCell view;
    public final RectF buttonRect = new RectF();
    public final Paint buttonPaint = new Paint(1);

    public SuggestBirthdayActionLayout(int i, ChatActionCell chatActionCell, Theme.ResourcesProvider resourcesProvider) {
        this.currentAccount = i;
        this.view = chatActionCell;
        this.resourcesProvider = resourcesProvider;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(R.raw.cake, "cake", AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.sticker = rLottieDrawable;
        rLottieDrawable.restart(false);
        this.bounce = new ButtonBounce(chatActionCell, 1.0f, 5.0f);
    }

    public final void draw(Canvas canvas) {
        int iDp = AndroidUtilities.dp(66.0f);
        ChatActionCell chatActionCell = this.view;
        int width = (chatActionCell.getWidth() - iDp) / 2;
        RLottieDrawable rLottieDrawable = this.sticker;
        rLottieDrawable.setBounds(width, AndroidUtilities.dp(13.0f), width + iDp, AndroidUtilities.dp(13.0f) + iDp);
        rLottieDrawable.draw(canvas);
        this.text.draw((chatActionCell.getWidth() - this.text.getWidth()) / 2.0f, AndroidUtilities.dp(19.0f) + iDp, 1.0f, -1, canvas);
        int iDp2 = (int) (AndroidUtilities.dp(19.0f) + iDp + this.text.layout.getHeight() + AndroidUtilities.dp(17.0f));
        int iMax = 0;
        for (int i = 0; i < this.titles.length; i++) {
            iMax = (int) (Math.max(this.titles[i].getWidth(), this.values[i].getWidth()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f) + iMax);
        }
        int width2 = (chatActionCell.getWidth() - iMax) / 2;
        int i2 = 0;
        while (i2 < this.titles.length) {
            float fMax = Math.max(this.titles[i2].getWidth(), this.values[i2].getWidth()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f);
            float f = width2;
            float f2 = (fMax / 2.0f) + f;
            int i3 = (int) (f + fMax);
            Text text = this.titles[i2];
            text.draw(f2 - (text.getWidth() / 2.0f), iDp2, 0.75f, -1, canvas);
            Text text2 = this.values[i2];
            text2.draw(f2 - (text2.getWidth() / 2.0f), AndroidUtilities.dp(16.0f) + iDp2, 1.0f, -1, canvas);
            i2++;
            width2 = i3;
        }
        if (this.hasButton) {
            int iDp3 = AndroidUtilities.dp(38.0f) + iDp2;
            canvas.save();
            float width3 = this.button.getWidth() + AndroidUtilities.dp(26.0f);
            float fDp = AndroidUtilities.dp(30.0f);
            RectF rectF = this.buttonRect;
            float f3 = iDp3;
            rectF.set((chatActionCell.getWidth() - width3) / 2.0f, f3, (chatActionCell.getWidth() + width3) / 2.0f, f3 + fDp);
            float scale = this.bounce.getScale(0.1f);
            canvas.scale(scale, scale, rectF.centerX(), rectF.centerY());
            float f4 = fDp / 2.0f;
            canvas.drawRoundRect(rectF, f4, f4, this.buttonPaint);
            this.button.draw(rectF.left + AndroidUtilities.dp(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void open() {
        AlertsCreator.createBirthdayPickerDialog(this.view.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.birthday, new PollItemMenu$$ExternalSyntheticLambda14(this, 5), null, true, false, this.resourcesProvider).bottomSheet.show();
    }
}
