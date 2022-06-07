package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.URLSpanNoUnderline;

public class AdminedChannelCell extends FrameLayout {
    private BackupImageView avatarImageView;
    CheckBox2 checkBox;
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

    public AdminedChannelCell(Context context, View.OnClickListener onClickListener, boolean z, int i) {
        super(context);
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarImageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(24.0f));
        BackupImageView backupImageView2 = this.avatarImageView;
        boolean z2 = LocaleController.isRTL;
        int i2 = 5;
        addView(backupImageView2, LayoutHelper.createFrame(48, 48.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : i + 12, 6.0f, z2 ? i + 12 : 0.0f, 6.0f));
        if (z) {
            CheckBox2 checkBox2 = new CheckBox2(context, 21);
            this.checkBox = checkBox2;
            checkBox2.setColor(null, "windowBackgroundWhite", "checkboxCheck");
            this.checkBox.setDrawUnchecked(false);
            this.checkBox.setDrawBackgroundAsArc(3);
            CheckBox2 checkBox22 = this.checkBox;
            boolean z3 = LocaleController.isRTL;
            addView(checkBox22, LayoutHelper.createFrame(24, 24.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : i + 42, 32.0f, z3 ? i + 42 : 0.0f, 0.0f));
        }
        int i3 = onClickListener == null ? 24 : 62;
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.nameTextView = simpleTextView;
        simpleTextView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        this.nameTextView.setTextSize(17);
        this.nameTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        SimpleTextView simpleTextView2 = this.nameTextView;
        boolean z4 = LocaleController.isRTL;
        addView(simpleTextView2, LayoutHelper.createFrame(-1, 20.0f, (z4 ? 5 : 3) | 48, z4 ? i3 : i + 73, 9.5f, z4 ? i + 73 : i3, 0.0f));
        SimpleTextView simpleTextView3 = new SimpleTextView(context);
        this.statusTextView = simpleTextView3;
        simpleTextView3.setTextSize(14);
        this.statusTextView.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText"));
        this.statusTextView.setLinkTextColor(Theme.getColor("windowBackgroundWhiteLinkText"));
        this.statusTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        SimpleTextView simpleTextView4 = this.statusTextView;
        boolean z5 = LocaleController.isRTL;
        addView(simpleTextView4, LayoutHelper.createFrame(-1, 20.0f, (z5 ? 5 : 3) | 48, z5 ? i3 : i + 73, 32.5f, z5 ? i + 73 : i3, 6.0f));
        if (onClickListener != null) {
            ImageView imageView = new ImageView(context);
            this.deleteButton = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.deleteButton.setImageResource(R.drawable.msg_panel_clear);
            this.deleteButton.setOnClickListener(onClickListener);
            this.deleteButton.setBackground(Theme.createSelectorDrawable(Theme.getColor("listSelectorSDK21")));
            this.deleteButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor("windowBackgroundWhiteGrayText"), PorterDuff.Mode.MULTIPLY));
            ImageView imageView2 = this.deleteButton;
            boolean z6 = LocaleController.isRTL;
            addView(imageView2, LayoutHelper.createFrame(48, 48.0f, (z6 ? 3 : i2) | 48, z6 ? 7.0f : 0.0f, 6.0f, z6 ? 0.0f : 7.0f, 0.0f));
        }
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.isLast ? 12 : 0) + 60), 1073741824));
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

    public void setChecked(boolean z, boolean z2) {
        this.checkBox.setChecked(z, z2);
    }
}
