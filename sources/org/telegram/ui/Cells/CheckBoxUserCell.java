package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Switch;
public class CheckBoxUserCell extends FrameLayout {
    private static Drawable verifiedDrawable;
    private AvatarDrawable avatarDrawable;
    private Switch checkBox;
    private TLRPC$User currentUser;
    private BackupImageView imageView;
    private boolean needDivider;
    private SimpleTextView textView;

    public CheckBoxUserCell(Context context, boolean z) {
        super(context);
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.textView = simpleTextView;
        simpleTextView.setTextColor(Theme.getColor(z ? Theme.key_dialogTextBlack : Theme.key_windowBackgroundWhiteBlackText));
        this.textView.setTextSize(16);
        this.textView.setEllipsizeByGradient(true);
        this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        SimpleTextView simpleTextView2 = this.textView;
        boolean z2 = LocaleController.isRTL;
        addView(simpleTextView2, LayoutHelper.createFrame(-1, -1.0f, (z2 ? 5 : 3) | 48, z2 ? 21 : 69, 0.0f, z2 ? 69 : 21, 0.0f));
        this.avatarDrawable = new AvatarDrawable();
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(36.0f));
        addView(this.imageView, LayoutHelper.createFrame(36, 36.0f, (LocaleController.isRTL ? 5 : 3) | 48, 23.0f, 7.0f, 23.0f, 0.0f));
        Switch r14 = new Switch(context, null);
        this.checkBox = r14;
        int i = Theme.key_switchTrack;
        int i2 = Theme.key_switchTrackChecked;
        int i3 = Theme.key_windowBackgroundWhite;
        r14.setColors(i, i2, i3, i3);
        addView(this.checkBox, LayoutHelper.createFrame(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.needDivider ? 1 : 0), 1073741824));
    }

    public void setTextColor(int i) {
        this.textView.setTextColor(i);
    }

    public TLRPC$User getCurrentUser() {
        return this.currentUser;
    }

    private Drawable getVerifiedDrawable() {
        if (verifiedDrawable == null) {
            verifiedDrawable = new CombinedDrawable(Theme.dialogs_verifiedDrawable, Theme.dialogs_verifiedCheckDrawable);
        }
        return verifiedDrawable;
    }

    public void setUser(TLRPC$User tLRPC$User, boolean z, boolean z2) {
        this.currentUser = tLRPC$User;
        if (tLRPC$User != null) {
            this.textView.setText(ContactsController.formatName(tLRPC$User.first_name, tLRPC$User.last_name));
        } else {
            this.textView.setText("");
        }
        this.textView.setRightDrawable((tLRPC$User == null || !tLRPC$User.verified) ? null : getVerifiedDrawable());
        this.checkBox.setChecked(z, false);
        this.avatarDrawable.setInfo(tLRPC$User);
        this.imageView.setForUserOrChat(tLRPC$User, this.avatarDrawable);
        this.needDivider = z2;
        setWillNotDraw(!z2);
    }

    public void setChecked(boolean z, boolean z2) {
        this.checkBox.setChecked(z, z2);
    }

    public boolean isChecked() {
        return this.checkBox.isChecked();
    }

    public SimpleTextView getTextView() {
        return this.textView;
    }

    public Switch getCheckBox() {
        return this.checkBox;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.needDivider) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }
}
