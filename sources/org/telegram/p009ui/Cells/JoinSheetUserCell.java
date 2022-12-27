package org.telegram.p009ui.Cells;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.AvatarDrawable;
import org.telegram.p009ui.Components.BackupImageView;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.tgnet.TLRPC$User;

public class JoinSheetUserCell extends FrameLayout {
    private AvatarDrawable avatarDrawable;
    private BackupImageView imageView;
    private TextView nameTextView;
    private int[] result;

    public JoinSheetUserCell(Context context) {
        super(context);
        this.avatarDrawable = new AvatarDrawable();
        this.result = new int[1];
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.m36dp(27.0f));
        addView(this.imageView, LayoutHelper.createFrame(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.nameTextView = textView;
        textView.setTextColor(Theme.getColor("dialogTextBlack"));
        this.nameTextView.setTextSize(1, 12.0f);
        this.nameTextView.setMaxLines(1);
        this.nameTextView.setGravity(49);
        this.nameTextView.setLines(1);
        this.nameTextView.setSingleLine(true);
        this.nameTextView.setEllipsize(TextUtils.TruncateAt.END);
        addView(this.nameTextView, LayoutHelper.createFrame(-1, -2.0f, 51, 6.0f, 65.0f, 6.0f, 0.0f));
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m36dp(100.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m36dp(90.0f), 1073741824));
    }

    public void setUser(TLRPC$User tLRPC$User) {
        this.nameTextView.setText(ContactsController.formatName(tLRPC$User.first_name, tLRPC$User.last_name));
        this.avatarDrawable.setInfo(tLRPC$User);
        this.imageView.setForUserOrChat(tLRPC$User, this.avatarDrawable);
    }

    public void setCount(int i) {
        this.nameTextView.setText("");
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        avatarDrawable.setInfo(0L, null, null, "+" + LocaleController.formatShortNumber(i, this.result));
        this.imageView.setImage((ImageLocation) null, "50_50", this.avatarDrawable, (Object) null);
    }
}
