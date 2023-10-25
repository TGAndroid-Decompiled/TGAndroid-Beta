package org.telegram.ui.Components.Premium.boosts.cells.statistics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stories$TL_prepaidGiveaway;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
@SuppressLint({"ViewConstructor"})
public class GiveawayCell extends UserCell {
    private CounterDrawable counterDrawable;
    private TL_stories$TL_prepaidGiveaway prepaidGiveaway;

    public GiveawayCell(Context context, int i, int i2, boolean z) {
        super(context, i, i2, z);
        init(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.needDivider) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(70.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }

    private void init(Context context) {
        this.counterDrawable = new CounterDrawable(context);
    }

    public TL_stories$TL_prepaidGiveaway getPrepaidGiveaway() {
        return this.prepaidGiveaway;
    }

    public void setImage(TL_stories$TL_prepaidGiveaway tL_stories$TL_prepaidGiveaway) {
        this.prepaidGiveaway = tL_stories$TL_prepaidGiveaway;
        this.avatarDrawable.setAvatarType(16);
        int i = tL_stories$TL_prepaidGiveaway.months;
        if (i == 12) {
            this.avatarDrawable.setColor(-31392, -2796986);
        } else if (i == 6) {
            this.avatarDrawable.setColor(-10703110, -12481584);
        } else {
            this.avatarDrawable.setColor(-6631068, -11945404);
        }
        this.counterDrawable.setText(String.valueOf(tL_stories$TL_prepaidGiveaway.quantity * BoostRepository.giveawayBoostsPerPremium()));
        this.nameTextView.setRightDrawable(this.counterDrawable);
    }
}
