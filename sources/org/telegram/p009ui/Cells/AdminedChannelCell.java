package org.telegram.p009ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.p009ui.ActionBar.SimpleTextView;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.AvatarDrawable;
import org.telegram.p009ui.Components.BackupImageView;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.URLSpanNoUnderline;
import org.telegram.tgnet.TLRPC$Chat;

public class AdminedChannelCell extends FrameLayout {
    private BackupImageView avatarImageView;
    private TLRPC$Chat currentChannel;
    private ImageView deleteButton;
    private boolean isLast;
    private SimpleTextView nameTextView;
    private SimpleTextView statusTextView;
    private int currentAccount = UserConfig.selectedAccount;
    private AvatarDrawable avatarDrawable = new AvatarDrawable();

    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }

    public AdminedChannelCell(Context context, View.OnClickListener onClickListener) {
        super(context);
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarImageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.m34dp(24.0f));
        BackupImageView backupImageView2 = this.avatarImageView;
        boolean z = LocaleController.isRTL;
        int i = 5;
        addView(backupImageView2, LayoutHelper.createFrame(48, 48.0f, (z ? 5 : 3) | 48, z ? 0.0f : 12.0f, 12.0f, z ? 12.0f : 0.0f, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.nameTextView = simpleTextView;
        simpleTextView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        this.nameTextView.setTextSize(17);
        this.nameTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        SimpleTextView simpleTextView2 = this.nameTextView;
        boolean z2 = LocaleController.isRTL;
        float f = 62.0f;
        addView(simpleTextView2, LayoutHelper.createFrame(-1, 20.0f, (z2 ? 5 : 3) | 48, z2 ? 62.0f : 73.0f, 15.5f, z2 ? 73.0f : 62.0f, 0.0f));
        SimpleTextView simpleTextView3 = new SimpleTextView(context);
        this.statusTextView = simpleTextView3;
        simpleTextView3.setTextSize(14);
        this.statusTextView.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText"));
        this.statusTextView.setLinkTextColor(Theme.getColor("windowBackgroundWhiteLinkText"));
        this.statusTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        SimpleTextView simpleTextView4 = this.statusTextView;
        boolean z3 = LocaleController.isRTL;
        addView(simpleTextView4, LayoutHelper.createFrame(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 62.0f : 73.0f, 38.5f, z3 ? 73.0f : f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.deleteButton = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.deleteButton.setImageResource(C0952R.C0953drawable.msg_panel_clear);
        this.deleteButton.setOnClickListener(onClickListener);
        this.deleteButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor("windowBackgroundWhiteGrayText"), PorterDuff.Mode.MULTIPLY));
        ImageView imageView2 = this.deleteButton;
        boolean z4 = LocaleController.isRTL;
        addView(imageView2, LayoutHelper.createFrame(48, 48.0f, (z4 ? 3 : i) | 48, z4 ? 7.0f : 0.0f, 12.0f, z4 ? 0.0f : 7.0f, 0.0f));
    }

    public void setChannel(TLRPC$Chat tLRPC$Chat, boolean z) {
        String str = MessagesController.getInstance(this.currentAccount).linkPrefix + "/";
        this.currentChannel = tLRPC$Chat;
        this.avatarDrawable.setInfo(tLRPC$Chat);
        this.nameTextView.setText(tLRPC$Chat.title);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + tLRPC$Chat.username);
        spannableStringBuilder.setSpan(new URLSpanNoUnderline(""), str.length(), spannableStringBuilder.length(), 33);
        this.statusTextView.setText(spannableStringBuilder);
        this.avatarImageView.setForUserOrChat(tLRPC$Chat, this.avatarDrawable);
        this.isLast = z;
    }

    public void update() {
        this.avatarDrawable.setInfo(this.currentChannel);
        this.avatarImageView.invalidate();
    }

    public TLRPC$Chat getCurrentChannel() {
        return this.currentChannel;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp((this.isLast ? 12 : 0) + 60), 1073741824));
    }

    public SimpleTextView getNameTextView() {
        return this.nameTextView;
    }

    public SimpleTextView getStatusTextView() {
        return this.statusTextView;
    }

    public ImageView getDeleteButton() {
        return this.deleteButton;
    }
}
