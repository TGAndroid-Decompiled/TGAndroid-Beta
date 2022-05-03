package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.CounterView;
import org.telegram.ui.Components.LayoutHelper;

public class HintDialogCell extends FrameLayout {
    CheckBox2 checkBox;
    CounterView counterView;
    private TLRPC$User currentUser;
    private long dialogId;
    private final boolean drawCheckbox;
    private BackupImageView imageView;
    private int lastUnreadCount;
    private TextView nameTextView;
    float showOnlineProgress;
    boolean wasDraw;
    private AvatarDrawable avatarDrawable = new AvatarDrawable();
    private int currentAccount = UserConfig.selectedAccount;

    public HintDialogCell(Context context, boolean z) {
        super(context);
        new RectF();
        this.drawCheckbox = z;
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(27.0f));
        addView(this.imageView, LayoutHelper.createFrame(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.nameTextView = textView;
        textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        this.nameTextView.setTextSize(1, 12.0f);
        this.nameTextView.setMaxLines(1);
        this.nameTextView.setGravity(49);
        this.nameTextView.setLines(1);
        this.nameTextView.setEllipsize(TextUtils.TruncateAt.END);
        addView(this.nameTextView, LayoutHelper.createFrame(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        CounterView counterView = new CounterView(context, null);
        this.counterView = counterView;
        addView(counterView, LayoutHelper.createFrame(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        this.counterView.setColors("chats_unreadCounterText", "chats_unreadCounter");
        this.counterView.setGravity(5);
        if (z) {
            CheckBox2 checkBox2 = new CheckBox2(context, 21);
            this.checkBox = checkBox2;
            checkBox2.setColor("dialogRoundCheckBox", "dialogBackground", "dialogRoundCheckBoxCheck");
            this.checkBox.setDrawUnchecked(false);
            this.checkBox.setDrawBackgroundAsArc(4);
            this.checkBox.setProgressDelegate(new CheckBoxBase.ProgressDelegate() {
                @Override
                public final void setProgress(float f) {
                    HintDialogCell.this.lambda$new$0(f);
                }
            });
            addView(this.checkBox, LayoutHelper.createFrame(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            this.checkBox.setChecked(true, false);
            setWillNotDraw(false);
        }
    }

    public void lambda$new$0(float f) {
        float progress = 1.0f - (this.checkBox.getProgress() * 0.143f);
        this.imageView.setScaleX(progress);
        this.imageView.setScaleY(progress);
        invalidate();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
        this.counterView.counterDrawable.horizontalPadding = AndroidUtilities.dp(13.0f);
    }

    public void update(int i) {
        int i2;
        if (!((MessagesController.UPDATE_MASK_STATUS & i) == 0 || this.currentUser == null)) {
            this.currentUser = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.currentUser.id));
            this.imageView.invalidate();
            invalidate();
        }
        if (i == 0 || (MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE & i) != 0 || (i & MessagesController.UPDATE_MASK_NEW_MESSAGE) != 0) {
            TLRPC$Dialog tLRPC$Dialog = MessagesController.getInstance(this.currentAccount).dialogs_dict.get(this.dialogId);
            if (tLRPC$Dialog == null || (i2 = tLRPC$Dialog.unread_count) == 0) {
                this.lastUnreadCount = 0;
                this.counterView.setCount(0, this.wasDraw);
            } else if (this.lastUnreadCount != i2) {
                this.lastUnreadCount = i2;
                this.counterView.setCount(i2, this.wasDraw);
            }
        }
    }

    public void update() {
        if (DialogObject.isUserDialog(this.dialogId)) {
            TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId));
            this.currentUser = user;
            this.avatarDrawable.setInfo(user);
            return;
        }
        this.avatarDrawable.setInfo(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId)));
        this.currentUser = null;
    }

    public void setDialog(long j, boolean z, CharSequence charSequence) {
        if (this.dialogId != j) {
            this.wasDraw = false;
            invalidate();
        }
        this.dialogId = j;
        if (DialogObject.isUserDialog(j)) {
            TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
            this.currentUser = user;
            if (charSequence != null) {
                this.nameTextView.setText(charSequence);
            } else if (user != null) {
                this.nameTextView.setText(UserObject.getFirstName(user));
            } else {
                this.nameTextView.setText("");
            }
            this.avatarDrawable.setInfo(this.currentUser);
            this.imageView.setForUserOrChat(this.currentUser, this.avatarDrawable);
        } else {
            TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
            if (charSequence != null) {
                this.nameTextView.setText(charSequence);
            } else if (chat != null) {
                this.nameTextView.setText(chat.title);
            } else {
                this.nameTextView.setText("");
            }
            this.avatarDrawable.setInfo(chat);
            this.currentUser = null;
            this.imageView.setForUserOrChat(chat, this.avatarDrawable);
        }
        if (z) {
            update(0);
        }
    }

    @Override
    protected boolean drawChild(android.graphics.Canvas r6, android.view.View r7, long r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.HintDialogCell.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.drawCheckbox) {
            int left = this.imageView.getLeft() + (this.imageView.getMeasuredWidth() / 2);
            int top = this.imageView.getTop() + (this.imageView.getMeasuredHeight() / 2);
            Theme.checkboxSquare_checkPaint.setColor(Theme.getColor("dialogRoundCheckBox"));
            Theme.checkboxSquare_checkPaint.setAlpha((int) (this.checkBox.getProgress() * 255.0f));
            canvas.drawCircle(left, top, AndroidUtilities.dp(28.0f), Theme.checkboxSquare_checkPaint);
        }
    }

    public void setChecked(boolean z, boolean z2) {
        if (this.drawCheckbox) {
            this.checkBox.setChecked(z, z2);
        }
    }

    public long getDialogId() {
        return this.dialogId;
    }
}
