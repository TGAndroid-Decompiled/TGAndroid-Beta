package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.LayoutHelper;

public class CheckBoxUserCell extends FrameLayout {
    private AvatarDrawable avatarDrawable;
    private CheckBoxSquare checkBox;
    private TLRPC$User currentUser;
    private BackupImageView imageView;
    private boolean needDivider;
    private TextView textView;

    public CheckBoxUserCell(Context context, boolean z) {
        super(context);
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextColor(Theme.getColor(z ? "dialogTextBlack" : "windowBackgroundWhiteBlackText"));
        this.textView.setTextSize(1, 16.0f);
        this.textView.setLines(1);
        this.textView.setMaxLines(1);
        this.textView.setSingleLine(true);
        this.textView.setEllipsize(TextUtils.TruncateAt.END);
        int i = 5;
        this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        View view = this.textView;
        boolean z2 = LocaleController.isRTL;
        int i2 = 21;
        addView(view, LayoutHelper.createFrame(-1, -1.0f, (z2 ? 5 : 3) | 48, z2 ? 21 : 94, 0.0f, !z2 ? 21 : 94, 0.0f));
        this.avatarDrawable = new AvatarDrawable();
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(36.0f));
        addView(this.imageView, LayoutHelper.createFrame(36, 36.0f, (LocaleController.isRTL ? 5 : 3) | 48, 48.0f, 7.0f, 48.0f, 0.0f));
        CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, z, null);
        this.checkBox = checkBoxSquare;
        boolean z3 = LocaleController.isRTL;
        addView(checkBoxSquare, LayoutHelper.createFrame(18, 18.0f, (!z3 ? 3 : i) | 48, z3 ? 0 : 21, 16.0f, !z3 ? 0 : i2, 0.0f));
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

    public void setUser(TLRPC$User tLRPC$User, boolean z, boolean z2) {
        this.currentUser = tLRPC$User;
        this.textView.setText(ContactsController.formatName(tLRPC$User.first_name, tLRPC$User.last_name));
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

    public TextView getTextView() {
        return this.textView;
    }

    public CheckBoxSquare getCheckBox() {
        return this.checkBox;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.needDivider) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }
}
