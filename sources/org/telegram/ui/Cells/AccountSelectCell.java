package org.telegram.ui.Cells;

import android.app.Activity;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BlurSettingsBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;

public final class AccountSelectCell extends FrameLayout {
    public int accountNumber;
    public final AvatarDrawable avatarDrawable;
    public final ImageView checkImageView;
    public final BackupImageView imageView;
    public final TextView infoTextView;
    public final SimpleTextView textView;

    public AccountSelectCell(Activity activity, boolean z) {
        super(activity);
        setMinimumWidth(AndroidUtilities.dp(196.0f));
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        this.avatarDrawable = avatarDrawable;
        avatarDrawable.setTextSize(AndroidUtilities.dp(12.0f));
        BackupImageView backupImageView = new BackupImageView(activity);
        this.imageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(backupImageView, LayoutHelper.createFrame(36, 36.0f, 51, 10.0f, 10.0f, 0.0f, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(activity);
        this.textView = simpleTextView;
        simpleTextView.setTextSize(15);
        simpleTextView.setTypeface(AndroidUtilities.bold());
        simpleTextView.setEllipsizeByGradient(true);
        simpleTextView.setMaxLines(1);
        simpleTextView.setGravity(19);
        if (!z) {
            addView(simpleTextView, LayoutHelper.createFrame(-1, -1.0f, 51, 61.0f, 0.0f, 52.0f, 0.0f));
            simpleTextView.setTextColor(Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false));
            ImageView imageView = new ImageView(activity);
            this.checkImageView = imageView;
            imageView.setImageResource(R.drawable.account_check);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chats_menuItemCheck, false), PorterDuff.Mode.MULTIPLY));
            addView(imageView, LayoutHelper.createFrame(40, -1.0f, 53, 0.0f, 0.0f, 6.0f, 0.0f));
            return;
        }
        addView(simpleTextView, LayoutHelper.createFrame(-2, -2.0f, 51, 61.0f, 7.0f, 8.0f, 0.0f));
        simpleTextView.setTextColor(Theme.getColor(null, Theme.key_voipgroup_nameText, false));
        simpleTextView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
        TextView textView = new TextView(activity);
        this.infoTextView = textView;
        BlurSettingsBottomSheet$$ExternalSyntheticOutline0.m(textView, Theme.getColor(null, Theme.key_voipgroup_lastSeenText, false), 1, 15.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setMaxWidth(AndroidUtilities.dp(320.0f));
        textView.setGravity(51);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 61.0f, 27.0f, 8.0f, 0.0f));
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.infoTextView == null) {
            this.textView.setTextColor(Theme.getColor(null, Theme.key_chats_menuItemText, false));
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        TextView textView;
        ImageView imageView = this.checkImageView;
        if (imageView != null || ((textView = this.infoTextView) != null && getLayoutParams().width != -2)) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
            return;
        }
        if (View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
            return;
        }
        float fDp = AndroidUtilities.dp(196.0f);
        float fDp2 = AndroidUtilities.dp((imageView != null ? 50 : 0) + 69);
        SimpleTextView simpleTextView = this.textView;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(fDp, Math.max(simpleTextView.getTextPaint().measureText(simpleTextView.getText().toString()), textView != null ? textView.getPaint().measureText(textView.getText().toString()) : 0.0f) + fDp2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }

    public void setObject(TLObject tLObject) {
        boolean z = tLObject instanceof TLRPC.User;
        BackupImageView backupImageView = this.imageView;
        TextView textView = this.infoTextView;
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        if (z) {
            TLRPC.User user = (TLRPC.User) tLObject;
            avatarDrawable.setInfo(user);
            textView.setText(ContactsController.formatName(user.first_name, user.last_name));
            backupImageView.setForUserOrChat(user, avatarDrawable);
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
        avatarDrawable.setInfo(chat);
        textView.setText(chat == null ? "" : chat.title);
        backupImageView.setForUserOrChat(chat, avatarDrawable);
    }
}
