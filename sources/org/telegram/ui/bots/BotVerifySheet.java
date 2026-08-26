package org.telegram.ui.bots;

import android.app.Activity;
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
import org.telegram.ui.ThemeSetUrlActivity$$ExternalSyntheticLambda6;

public abstract class BotVerifySheet {
    public static void openRemoveVerify(Activity activity, final int i, final long j, final long j2, TL_bots.botVerifierSettings botverifiersettings, final BotVerifySheet$$ExternalSyntheticLambda1 botVerifySheet$$ExternalSyntheticLambda1) {
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
        FrameLayout frameLayout = new FrameLayout(activity);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), Theme.getColor(null, Theme.key_groupcreate_spanBackground, false)));
        BackupImageView backupImageView = new BackupImageView(activity);
        backupImageView.setRoundRadius(AndroidUtilities.dp(28.0f));
        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        avatarDrawable.setInfo(tLObject);
        backupImageView.imageReceiver.setForUserOrChat(tLObject, avatarDrawable);
        backupImageView.onNewImageSet();
        frameLayout2.addView(backupImageView, LayoutHelper.createFrame(28, 28, 51));
        BackupImageView backupImageView2 = new BackupImageView(activity);
        backupImageView2.setEmojiColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chats_verifiedBackground, false), PorterDuff.Mode.SRC_IN));
        backupImageView2.setAnimatedEmojiDrawable(AnimatedEmojiDrawable.make(i, botverifiersettings.icon, null, 3));
        frameLayout2.addView(backupImageView2, LayoutHelper.createFrame(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(activity);
        simpleTextView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        simpleTextView.setTextSize(13);
        simpleTextView.setEllipsizeByGradient(true);
        simpleTextView.setText(forcedFirstName, false);
        simpleTextView.setWidthWrapContent(true);
        frameLayout2.addView(simpleTextView, LayoutHelper.createFrame(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-2, -2.0f, 17, 16.0f, 0.0f, 16.0f, 0.0f));
        final boolean[] zArr = new boolean[1];
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, null);
        String string = LocaleController.getString(R.string.BotRemoveVerificationTitle);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = LocaleController.getString(j2 >= 0 ? R.string.BotRemoveVerificationText : R.string.BotRemoveVerificationChatText);
        builder.setView(frameLayout);
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(R.string.Remove), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog2, int i2) {
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
                ConnectionsManager.getInstance(i3).sendRequest(setcustomverification, new ThemeSetUrlActivity$$ExternalSyntheticLambda6(10, zArr2, botVerifySheet$$ExternalSyntheticLambda1));
            }
        });
        builder.makeRed(-1);
        builder.show();
    }
}
