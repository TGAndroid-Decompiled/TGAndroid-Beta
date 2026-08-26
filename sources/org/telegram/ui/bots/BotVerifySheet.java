package org.telegram.ui.bots;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;

public abstract class BotVerifySheet {
    public static void openRemoveVerify(Context context, final int i, final long j, final long j2, TL_bots.botVerifierSettings botverifiersettings, final BotVerifySheet$$ExternalSyntheticLambda1 botVerifySheet$$ExternalSyntheticLambda1) {
        String forcedFirstName;
        TLObject tLObject;
        if (j2 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(j2));
            forcedFirstName = UserObject.getForcedFirstName(user);
            tLObject = user;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j2));
            if (chat == null) {
                forcedFirstName = "";
                tLObject = chat;
            } else {
                forcedFirstName = chat.title;
                tLObject = chat;
            }
        }
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), Theme.getColor(null, Theme.key_groupcreate_spanBackground, false)));
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setRoundRadius(AndroidUtilities.dp(28.0f));
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setInfo(tLObject);
        backupImageView.setForUserOrChat(tLObject, avatarDrawable);
        frameLayout2.addView(backupImageView, LayoutHelper.createFrame(28, 28, 51));
        BackupImageView backupImageView2 = new BackupImageView(context);
        backupImageView2.setEmojiColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chats_verifiedBackground, false), PorterDuff.Mode.SRC_IN));
        backupImageView2.setAnimatedEmojiDrawable(AnimatedEmojiDrawable.make(i, 3, botverifiersettings.icon));
        frameLayout2.addView(backupImageView2, LayoutHelper.createFrame(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(context);
        simpleTextView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        simpleTextView.setTextSize(13);
        simpleTextView.setEllipsizeByGradient(true);
        simpleTextView.setText(forcedFirstName);
        simpleTextView.setWidthWrapContent(true);
        frameLayout2.addView(simpleTextView, LayoutHelper.createFrame(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-2, -2.0f, 17, 16.0f, 0.0f, 16.0f, 0.0f));
        final boolean[] zArr = new boolean[1];
        new AlertDialog.Builder(context, 0, null).setTitle(LocaleController.getString(R.string.BotRemoveVerificationTitle)).setMessage(LocaleController.getString(j2 >= 0 ? R.string.BotRemoveVerificationText : R.string.BotRemoveVerificationChatText)).setView(frameLayout).setNegativeButton(LocaleController.getString(R.string.Cancel), null).setPositiveButton(LocaleController.getString(R.string.Remove), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = false;
                setcustomverification.flags |= 1;
                int i3 = i;
                setcustomverification.bot = MessagesController.getInstance(i3).getInputUser(j);
                setcustomverification.peer = MessagesController.getInstance(i3).getInputPeer(j2);
                ConnectionsManager.getInstance(i3).sendRequest(setcustomverification, new BotVerifySheet$$ExternalSyntheticLambda6(0, zArr2, botVerifySheet$$ExternalSyntheticLambda1));
            }
        }).makeRed(-1).show();
    }
}
