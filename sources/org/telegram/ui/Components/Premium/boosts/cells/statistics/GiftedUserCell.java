package org.telegram.ui.Components.Premium.boosts.cells.statistics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.LayoutHelper;

public final class GiftedUserCell extends UserCell {
    public final FrameLayout badgeLayout;
    public final TextView badgeTextView;
    public TL_stories.Boost boost;
    public final CounterDrawable counterDrawable;
    public Drawable giftDrawable;
    public Drawable giveawayDrawable;

    public GiftedUserCell(Context context) {
        super(0, 0, context, null, false, false);
        this.counterDrawable = new CounterDrawable(getContext());
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.badgeLayout = frameLayout;
        TextView textView = new TextView(getContext());
        this.badgeTextView = textView;
        textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(12.0f);
        textView.setGravity(17);
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, 22.0f));
        frameLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        boolean z = LocaleController.isRTL;
        addView(frameLayout, LayoutHelper.createFrame(-2, -2.0f, (z ? 3 : 5) | 48, z ? 9 : 0, 9.0f, z ? 0 : 9, 0.0f));
    }

    private void setAvatarColorByMonths(int i) {
        if (i == 12) {
            this.avatarDrawable.setColor(-31392, -2796986);
        } else if (i == 6) {
            this.avatarDrawable.setColor(-10703110, -12481584);
        } else {
            this.avatarDrawable.setColor(-6631068, -11945404);
        }
    }

    public TL_stories.Boost getBoost() {
        return this.boost;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.needDivider) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(70.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }

    public void setStatus(TL_stories.Boost boost) {
        this.boost = boost;
        boolean z = boost.gift;
        FrameLayout frameLayout = this.badgeLayout;
        TextView textView = this.badgeTextView;
        if (z || boost.giveaway) {
            frameLayout.setVisibility(0);
            int i = ((boost.expires - boost.date) / 30) / 86400;
            long j = boost.stars;
            if (j > 0) {
                this.nameTextView.setText(LocaleController.formatPluralString("BoostingBoostStars", (int) j, new Object[0]));
                this.avatarDrawable.setAvatarType(26);
                this.avatarImageView.setForUserOrChat(null, this.avatarDrawable);
                this.nameTextView.setRightDrawable((Drawable) null);
            } else if (boost.unclaimed) {
                this.nameTextView.setText(LocaleController.getString(R.string.BoostingUnclaimed));
                this.avatarDrawable.setAvatarType(18);
                setAvatarColorByMonths(i);
                this.avatarImageView.setForUserOrChat(null, this.avatarDrawable);
                this.nameTextView.setRightDrawable((Drawable) null);
            } else if (boost.user_id == -1) {
                this.nameTextView.setText(LocaleController.getString(R.string.BoostingToBeDistributed));
                this.avatarDrawable.setAvatarType(19);
                setAvatarColorByMonths(i);
                this.avatarImageView.setForUserOrChat(null, this.avatarDrawable);
                this.nameTextView.setRightDrawable((Drawable) null);
            }
            String str = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(((long) boost.expires) * 1000));
            if (boost.stars > 0) {
                this.statusTextView.setText(LocaleController.formatString(R.string.BoostingStarsExpires, str));
            } else {
                this.statusTextView.setText(LocaleController.formatString(R.string.BoostingExpires, str));
            }
            if (boost.gift) {
                if (this.giftDrawable == null) {
                    Drawable drawable = getResources().getDrawable(R.drawable.mini_gift);
                    this.giftDrawable = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(-3240417, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-3240417);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.giftDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setText(LocaleController.getString(R.string.BoostingGift));
                frameLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Theme.multAlpha(0.2f, -3240417)));
            }
            if (boost.giveaway) {
                if (this.giveawayDrawable == null) {
                    Drawable drawable2 = getResources().getDrawable(R.drawable.mini_giveaway);
                    this.giveawayDrawable = drawable2;
                    drawable2.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-13397548);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.giveawayDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setText(LocaleController.getString(R.string.BoostingGiveaway));
                frameLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Theme.multAlpha(0.2f, -13397548)));
            }
        } else {
            frameLayout.setVisibility(8);
        }
        int i2 = boost.multiplier;
        if (i2 > 0) {
            String strValueOf = String.valueOf(i2);
            CounterDrawable counterDrawable = this.counterDrawable;
            counterDrawable.text = strValueOf;
            counterDrawable.textWith = counterDrawable.textPaint.measureText(strValueOf);
            counterDrawable.invalidateSelf();
            this.nameTextView.setRightDrawable(counterDrawable);
        } else {
            this.nameTextView.setRightDrawable((Drawable) null);
        }
        if (frameLayout.getVisibility() != 0) {
            SimpleTextView simpleTextView = this.nameTextView;
            simpleTextView.setPadding(0, simpleTextView.getPaddingTop(), 0, this.nameTextView.getPaddingBottom());
        } else {
            int iDp = AndroidUtilities.dp(22.0f) + ((int) textView.getPaint().measureText(textView.getText().toString()));
            SimpleTextView simpleTextView2 = this.nameTextView;
            simpleTextView2.setPadding(LocaleController.isRTL ? iDp : 0, simpleTextView2.getPaddingTop(), LocaleController.isRTL ? 0 : iDp, this.nameTextView.getPaddingBottom());
        }
    }
}
