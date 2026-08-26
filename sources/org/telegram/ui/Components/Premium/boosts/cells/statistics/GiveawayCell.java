package org.telegram.ui.Components.Premium.boosts.cells.statistics;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.UserCell;

public final class GiveawayCell extends UserCell {
    public final CounterDrawable counterDrawable;
    public TL_stories.PrepaidGiveaway prepaidGiveaway;

    public GiveawayCell(Context context) {
        super(0, 0, context, null, false, false);
        this.counterDrawable = new CounterDrawable(context);
    }

    public TL_stories.PrepaidGiveaway getPrepaidGiveaway() {
        return this.prepaidGiveaway;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.needDivider) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(70.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.prepaidGiveaway = prepaidGiveaway;
        boolean z = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        CounterDrawable counterDrawable = this.counterDrawable;
        if (z) {
            this.avatarDrawable.setAvatarType(26);
            String strValueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            counterDrawable.text = strValueOf;
            counterDrawable.textWith = counterDrawable.textPaint.measureText(strValueOf);
            counterDrawable.invalidateSelf();
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            this.avatarDrawable.setAvatarType(16);
            int i = ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months;
            if (i == 12) {
                this.avatarDrawable.setColor(-31392, -2796986);
            } else if (i == 6) {
                this.avatarDrawable.setColor(-10703110, -12481584);
            } else {
                this.avatarDrawable.setColor(-6631068, -11945404);
            }
            String strValueOf2 = String.valueOf(prepaidGiveaway.quantity * ((int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayBoostsPerPremium));
            counterDrawable.text = strValueOf2;
            counterDrawable.textWith = counterDrawable.textPaint.measureText(strValueOf2);
            counterDrawable.invalidateSelf();
        }
        this.nameTextView.setRightDrawable(counterDrawable);
    }
}
