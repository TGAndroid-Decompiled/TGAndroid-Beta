package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;

public class AccountSelectCell extends FrameLayout {
    private int accountNumber;
    private AvatarDrawable avatarDrawable;
    private ImageView checkImageView;
    private BackupImageView imageView;
    private TextView infoTextView;
    private SimpleTextView textView;

    public AccountSelectCell(Context context, boolean z) {
        super(context);
        setMinimumWidth(AndroidUtilities.dp(196.0f));
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        this.avatarDrawable = avatarDrawable;
        avatarDrawable.setTextSize(AndroidUtilities.dp(12.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(this.imageView, LayoutHelper.createFrame(36, 36.0f, 51, 10.0f, 10.0f, 0.0f, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.textView = simpleTextView;
        simpleTextView.setTextSize(15);
        this.textView.setTypeface(AndroidUtilities.bold());
        this.textView.setEllipsizeByGradient(true);
        this.textView.setMaxLines(1);
        this.textView.setGravity(19);
        if (z) {
            addView(this.textView, LayoutHelper.createFrame(-2, -2.0f, 51, 61.0f, 7.0f, 8.0f, 0.0f));
            this.textView.setTextColor(Theme.getColor(Theme.key_voipgroup_nameText));
            this.textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            TextView textView = new TextView(context);
            this.infoTextView = textView;
            textView.setTextColor(Theme.getColor(Theme.key_voipgroup_lastSeenText));
            this.infoTextView.setTextSize(1, 15.0f);
            this.infoTextView.setLines(1);
            this.infoTextView.setMaxLines(1);
            this.infoTextView.setSingleLine(true);
            this.infoTextView.setMaxWidth(AndroidUtilities.dp(320.0f));
            this.infoTextView.setGravity(51);
            this.infoTextView.setEllipsize(TextUtils.TruncateAt.END);
            addView(this.infoTextView, LayoutHelper.createFrame(-2, -2.0f, 51, 61.0f, 27.0f, 8.0f, 0.0f));
            return;
        }
        addView(this.textView, LayoutHelper.createFrame(-1, -1.0f, 51, 61.0f, 0.0f, 52.0f, 0.0f));
        this.textView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem));
        ImageView imageView = new ImageView(context);
        this.checkImageView = imageView;
        imageView.setImageResource(R.drawable.account_check);
        this.checkImageView.setScaleType(ImageView.ScaleType.CENTER);
        this.checkImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chats_menuItemCheck), PorterDuff.Mode.MULTIPLY));
        addView(this.checkImageView, LayoutHelper.createFrame(40, -1.0f, 53, 0.0f, 0.0f, 6.0f, 0.0f));
    }

    private int width() {
        float dp = AndroidUtilities.dp(196.0f);
        float dp2 = AndroidUtilities.dp((this.checkImageView != null ? 50 : 0) + 69);
        float measureText = this.textView.getTextPaint().measureText(this.textView.getText().toString());
        TextView textView = this.infoTextView;
        return (int) Math.max(dp, dp2 + Math.max(measureText, textView != null ? textView.getPaint().measureText(this.infoTextView.getText().toString()) : 0.0f));
    }

    @Override
    protected void onMeasure(int i, int i2) {
        if (this.checkImageView != null || (this.infoTextView != null && getLayoutParams().width != -2)) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
        } else if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(width(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.infoTextView == null) {
            this.textView.setTextColor(Theme.getColor(Theme.key_chats_menuItemText));
        }
    }

    public void setObject(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            this.avatarDrawable.setInfo(user);
            this.infoTextView.setText(ContactsController.formatName(user.first_name, user.last_name));
            this.imageView.setForUserOrChat(user, this.avatarDrawable);
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
        this.avatarDrawable.setInfo(chat);
        this.infoTextView.setText(chat == null ? "" : chat.title);
        this.imageView.setForUserOrChat(chat, this.avatarDrawable);
    }

    public void setAccount(int i, boolean z) {
        this.accountNumber = i;
        TLRPC.User currentUser = UserConfig.getInstance(i).getCurrentUser();
        this.avatarDrawable.setInfo(i, currentUser);
        this.textView.setText(ContactsController.formatName(currentUser.first_name, currentUser.last_name));
        this.imageView.getImageReceiver().setCurrentAccount(i);
        this.imageView.setForUserOrChat(currentUser, this.avatarDrawable);
        this.checkImageView.setVisibility((z && i == UserConfig.selectedAccount) ? 0 : 4);
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
}
