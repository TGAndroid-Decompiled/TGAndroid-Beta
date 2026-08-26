package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ProgressButton;

public final class InviteUserCell extends FrameLayout {
    public final AvatarDrawable avatarDrawable;
    public final BackupImageView avatarImageView;
    public final CheckBox2 checkBox;
    public ContactsController.Contact currentContact;
    public CharSequence currentName;
    public final SimpleTextView nameTextView;
    public final SimpleTextView statusTextView;

    public InviteUserCell(Context context, boolean z) {
        super(context);
        this.avatarDrawable = new AvatarDrawable();
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarImageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(backupImageView, LayoutHelper.createFrame(46, 46.0f, (LocaleController.isRTL ? 5 : 3) | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z2 = LocaleController.isRTL;
        addView(linearLayout, LayoutHelper.createFrame(-1, -1.0f, 119, z2 ? 0 : 72, 0.0f, z2 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(0, 58, 1.0f));
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.nameTextView = simpleTextView;
        simpleTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        simpleTextView.setTypeface(AndroidUtilities.bold());
        simpleTextView.setTextSize(15);
        simpleTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        frameLayout.addView(simpleTextView, LayoutHelper.createFrame(-1, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        SimpleTextView simpleTextView2 = new SimpleTextView(context);
        this.statusTextView = simpleTextView2;
        simpleTextView2.setTextSize(13);
        simpleTextView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        frameLayout.addView(simpleTextView2, LayoutHelper.createFrame(-1, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z) {
            CheckBox2 checkBox2 = new CheckBox2(context, 21);
            this.checkBox = checkBox2;
            checkBox2.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
            checkBox2.setDrawUnchecked(false);
            checkBox2.setDrawBackgroundAsArc(3);
            boolean z3 = LocaleController.isRTL;
            addView(checkBox2, LayoutHelper.createFrame(24, 24.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 40.0f, 32.0f, z3 ? 39.0f : 0.0f, 0.0f));
            return;
        }
        this.checkBox = null;
        ProgressButton progressButton = new ProgressButton(context);
        progressButton.setText(LocaleController.getString(R.string.Invite));
        progressButton.setTextSize(1, 14.0f);
        progressButton.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
        progressButton.setProgressColor(Theme.getColor(null, Theme.key_featuredStickers_buttonProgress, false));
        progressButton.setBackgroundRoundRect(Theme.getColor(null, Theme.key_telegram_color, false), Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false), 16.0f);
        progressButton.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        linearLayout.addView(progressButton, LayoutHelper.createLinear(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        progressButton.setOnClickListener(new AboutLinkCell$$ExternalSyntheticLambda1(this, 13));
    }

    public ContactsController.Contact getContact() {
        return this.currentContact;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void update() {
        ContactsController.Contact contact = this.currentContact;
        if (contact == null) {
            return;
        }
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        avatarDrawable.setInfo(contact.contact_id, contact.first_name, contact.last_name, null, null, null, false);
        CharSequence charSequence = this.currentName;
        SimpleTextView simpleTextView = this.nameTextView;
        if (charSequence != null) {
            simpleTextView.setText(charSequence, true);
        } else {
            ContactsController.Contact contact2 = this.currentContact;
            simpleTextView.setText(ContactsController.formatName(contact2.first_name, contact2.last_name));
        }
        SimpleTextView simpleTextView2 = this.statusTextView;
        int i = Theme.key_windowBackgroundWhiteGrayText;
        simpleTextView2.setTag(Integer.valueOf(i));
        simpleTextView2.setTextColor(Theme.getColor(null, i, false));
        ContactsController.Contact contact3 = this.currentContact;
        int i2 = contact3.imported;
        if (i2 > 0) {
            simpleTextView2.setText(LocaleController.formatPluralString("TelegramContacts", i2, new Object[0]));
        } else {
            simpleTextView2.setText(contact3.phones.get(0));
        }
        this.avatarImageView.setImageDrawable(avatarDrawable);
    }
}
