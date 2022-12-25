package org.telegram.p009ui.Components.Premium;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.AvatarDrawable;
import org.telegram.p009ui.Components.BackupImageView;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.Premium.StarParticlesView;
import org.telegram.tgnet.TLRPC$User;

public class PremiumGiftHeaderCell extends LinearLayout {
    private AvatarDrawable avatarDrawable;
    private BackupImageView avatarImageView;
    private StarParticlesView.Drawable drawable;
    private TextView subtitleView;
    private TextView titleView;

    public PremiumGiftHeaderCell(Context context) {
        super(context);
        setOrientation(1);
        this.avatarDrawable = new AvatarDrawable();
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarImageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.m35dp(50.0f));
        addView(this.avatarImageView, LayoutHelper.createLinear(100, 100, 1, 0, 28, 0, 0));
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.titleView.setTextSize(1, 22.0f);
        this.titleView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        this.titleView.setGravity(1);
        addView(this.titleView, LayoutHelper.createLinear(-2, -2, 1, 24, 24, 24, 0));
        TextView textView2 = new TextView(context);
        this.subtitleView = textView2;
        textView2.setTextSize(1, 15.0f);
        this.subtitleView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        this.subtitleView.setGravity(1);
        addView(this.subtitleView, LayoutHelper.createFrame(-2, -2.0f, 1, 24.0f, 8.0f, 24.0f, 28.0f));
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        StarParticlesView.Drawable drawable = new StarParticlesView.Drawable(50);
        this.drawable = drawable;
        drawable.useGradient = true;
        drawable.roundEffect = true;
        drawable.init();
        setWillNotDraw(false);
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float x = this.avatarImageView.getX() + (this.avatarImageView.getWidth() / 2.0f);
        float paddingTop = ((this.avatarImageView.getPaddingTop() + this.avatarImageView.getY()) + (this.avatarImageView.getHeight() / 2.0f)) - AndroidUtilities.m35dp(3.0f);
        float m35dp = AndroidUtilities.m35dp(32.0f);
        this.drawable.rect.set(x - m35dp, paddingTop - m35dp, x + m35dp, paddingTop + m35dp);
        if (z) {
            this.drawable.resetPositions();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.drawable.onDraw(canvas);
        invalidate();
    }

    public void bind(TLRPC$User tLRPC$User) {
        this.avatarDrawable.setInfo(tLRPC$User);
        this.avatarImageView.setForUserOrChat(tLRPC$User, this.avatarDrawable);
        this.titleView.setText(AndroidUtilities.replaceTags(LocaleController.getString(C1072R.string.GiftTelegramPremiumTitle)));
        this.subtitleView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(C1072R.string.GiftTelegramPremiumDescription, tLRPC$User.first_name)));
    }
}
