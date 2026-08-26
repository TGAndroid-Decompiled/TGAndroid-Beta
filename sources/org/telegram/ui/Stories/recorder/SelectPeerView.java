package org.telegram.ui.Stories.recorder;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;

public final class SelectPeerView extends FrameLayout {
    public final AvatarDrawable avatarDrawable;
    public final int currentAccount;
    public final BackupImageView imageView;
    public ViewPropertyAnimator showAnimator;
    public final TextView titleView;

    public SelectPeerView(Activity activity, int i) {
        super(activity);
        this.currentAccount = i;
        this.avatarDrawable = new AvatarDrawable();
        BackupImageView backupImageView = new BackupImageView(activity);
        this.imageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(15.0f));
        addView(backupImageView, LayoutHelper.createFrame(30, 30.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.titleView = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, LayoutHelper.createFrame(-1, -2.0f, 51, 53.0f, 11.33f, 12.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(Theme.multAlpha(0.85f, -1));
        addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 51, 53.0f, 29.33f, 12.0f, 0.0f));
        textView2.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.LiveStoryPeerChange), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.33f), 1.0f));
        set(null);
    }

    public void set(TLRPC.InputPeer inputPeer) {
        int i = this.currentAccount;
        long clientUserId = inputPeer == null ? UserConfig.getInstance(i).getClientUserId() : DialogObject.getPeerDialogId(inputPeer);
        TextView textView = this.titleView;
        BackupImageView backupImageView = this.imageView;
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        if (clientUserId >= 0) {
            TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(clientUserId));
            avatarDrawable.setInfo(user);
            backupImageView.setForUserOrChat(user, avatarDrawable);
            textView.setText(UserObject.getUserName(user));
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-clientUserId));
        avatarDrawable.setInfo(chat);
        backupImageView.setForUserOrChat(chat, avatarDrawable);
        textView.setText(chat == null ? "" : chat.title);
    }

    public final void setShowing(boolean z, boolean z2) {
        ViewPropertyAnimator viewPropertyAnimator = this.showAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.showAnimator = null;
        }
        if (!z2) {
            setVisibility(z ? 0 : 8);
            setAlpha(z ? 1.0f : 0.0f);
        } else {
            setVisibility(0);
            ViewPropertyAnimator duration = animate().alpha(z ? 1.0f : 0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).withEndAction(new FileLoader$$ExternalSyntheticLambda1(this, z, 20)).setDuration(320L);
            this.showAnimator = duration;
            duration.start();
        }
    }
}
