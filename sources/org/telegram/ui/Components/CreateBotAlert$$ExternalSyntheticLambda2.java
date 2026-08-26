package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.google.android.gms.internal.mlkit_vision_common.zzlu;
import java.util.ArrayList;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.AboutLinkCell;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda101;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class CreateBotAlert$$ExternalSyntheticLambda2 implements Runnable {
    public final String[] f$0;
    public final LaunchActivity$$ExternalSyntheticLambda101 f$1;
    public final Utilities.Callback f$10;
    public final BottomSheet f$11;
    public final Theme.ResourcesProvider f$12;
    public final Context f$13;
    public final EditTextCell f$2;
    public final int[] f$3;
    public final ButtonWithCounterView f$4;
    public final boolean f$5;
    public final int f$6;
    public final TLRPC.User f$7;
    public final int[] f$8;
    public final boolean[] f$9;

    public CreateBotAlert$$ExternalSyntheticLambda2(String[] strArr, LaunchActivity$$ExternalSyntheticLambda101 launchActivity$$ExternalSyntheticLambda101, EditTextCell editTextCell, int[] iArr, ButtonWithCounterView buttonWithCounterView, boolean z, int i, TLRPC.User user, int[] iArr2, boolean[] zArr, Utilities.Callback callback, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider, Context context) {
        this.f$0 = strArr;
        this.f$1 = launchActivity$$ExternalSyntheticLambda101;
        this.f$2 = editTextCell;
        this.f$3 = iArr;
        this.f$4 = buttonWithCounterView;
        this.f$5 = z;
        this.f$6 = i;
        this.f$7 = user;
        this.f$8 = iArr2;
        this.f$9 = zArr;
        this.f$10 = callback;
        this.f$11 = bottomSheet;
        this.f$12 = resourcesProvider;
        this.f$13 = context;
    }

    @Override
    public final void run() {
        String[] strArr = this.f$0;
        if (strArr[0] == null) {
            this.f$1.run();
            return;
        }
        EditTextCell editTextCell = this.f$2;
        String strTrim = editTextCell.editText.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            int[] iArr = this.f$3;
            int i = -iArr[0];
            iArr[0] = i;
            AndroidUtilities.shakeViewSpring(editTextCell, i);
            return;
        }
        final ButtonWithCounterView buttonWithCounterView = this.f$4;
        buttonWithCounterView.setLoading(true);
        TL_bots.createBot createbot = new TL_bots.createBot();
        createbot.via_deeplink = this.f$5;
        createbot.username = strArr[0];
        createbot.name = strTrim;
        final int i2 = this.f$6;
        MessagesController messagesController = MessagesController.getInstance(i2);
        final TLRPC.User user = this.f$7;
        createbot.manager_id = messagesController.getInputUser(user);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
        AiTonesController$$ExternalSyntheticLambda0 aiTonesController$$ExternalSyntheticLambda0 = new AiTonesController$$ExternalSyntheticLambda0();
        final int[] iArr2 = this.f$8;
        final boolean[] zArr = this.f$9;
        final Utilities.Callback callback = this.f$10;
        final BottomSheet bottomSheet = this.f$11;
        final Theme.ResourcesProvider resourcesProvider = this.f$12;
        final Context context = this.f$13;
        iArr2[0] = connectionsManager.sendRequestTyped(createbot, aiTonesController$$ExternalSyntheticLambda0, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                String userName;
                int i3 = 0;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                iArr2[0] = -1;
                buttonWithCounterView.setLoading(false);
                BottomSheet bottomSheet2 = bottomSheet;
                int i4 = i2;
                if (user2 != null) {
                    zArr[0] = true;
                    MessagesController.getInstance(i4).putUser(user2, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user2);
                    MessagesStorage.getInstance(i4).putUsersAndChats(arrayList, null, false, false);
                    callback.run(user2);
                    bottomSheet2.lambda$showGiftOfferSheet$15();
                    return;
                }
                if (tL_error != null) {
                    boolean zEqualsIgnoreCase = "BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text);
                    Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                    if (zEqualsIgnoreCase) {
                        MessagesController messagesController2 = MessagesController.getInstance(i4);
                        boolean zIsPremium = UserConfig.getInstance(i4).isPremium();
                        BulletinFactory bulletinFactory = new BulletinFactory(bottomSheet2.topBulletinContainer, resourcesProvider2);
                        int i5 = R.raw.error;
                        String string = LocaleController.getString(R.string.CreateManagedBotLimitTitle);
                        SpannableStringBuilder spannableStringBuilderReplaceSingleLink = AndroidUtilities.replaceSingleLink(zIsPremium ? LocaleController.formatString(R.string.CreateManagedBotLimitText, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get())) : LocaleController.formatString(R.string.CreateManagedBotLimitTextPremium, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get()), Integer.valueOf(messagesController2.config.botsCreateLimitDefault.get())), Theme.getColor(Theme.key_undo_cancelColor, resourcesProvider2), new CreateBotAlert$$ExternalSyntheticLambda9(bottomSheet2, i3));
                        EmojiView$2$$ExternalSyntheticLambda1 emojiView$2$$ExternalSyntheticLambda1 = new EmojiView$2$$ExternalSyntheticLambda1(13, bottomSheet2, context);
                        if (spannableStringBuilderReplaceSingleLink == null) {
                            spannableStringBuilderReplaceSingleLink = new SpannableStringBuilder(spannableStringBuilderReplaceSingleLink);
                        }
                        int iCharSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(spannableStringBuilderReplaceSingleLink, "@BotFather");
                        if (iCharSequenceIndexOf >= 0) {
                            spannableStringBuilderReplaceSingleLink.setSpan(new AboutLinkCell.AnonymousClass5(resourcesProvider2, emojiView$2$$ExternalSyntheticLambda1, 6), iCharSequenceIndexOf, iCharSequenceIndexOf + 10, 33);
                        }
                        Bulletin bulletinCreateSimpleBulletin = bulletinFactory.createSimpleBulletin(string, spannableStringBuilderReplaceSingleLink, i5);
                        bulletinCreateSimpleBulletin.duration = 8000;
                        bulletinCreateSimpleBulletin.show();
                    } else {
                        String str = tL_error.text;
                        if (str != null && str.startsWith("FLOOD_WAIT_")) {
                            new BulletinFactory(bottomSheet2.topBulletinContainer, resourcesProvider2).createSimpleBulletin(LocaleController.getString(R.string.CreateManagedBotLimitTitle), LocaleController.formatString(R.string.CreateManagedBotLimitTextTime, LocaleController.formatDuration(Integer.parseInt(tL_error.text.substring(11)))), R.raw.error).show();
                        } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                            TLRPC.User user3 = user;
                            if (TextUtils.isEmpty(UserObject.getPublicUsername(user3))) {
                                userName = UserObject.getUserName(user3);
                            } else {
                                userName = "@" + UserObject.getPublicUsername(user3);
                            }
                            new BulletinFactory(bottomSheet2.topBulletinContainer, resourcesProvider2).createSimpleBulletinWithIconSize(R.raw.error, 36, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, userName), Theme.getColor(Theme.key_undo_cancelColor, resourcesProvider2))).show();
                        } else {
                            zzlu.m(bottomSheet2.topBulletinContainer, resourcesProvider2, tL_error);
                        }
                    }
                    AndroidUtilities.hideKeyboard(bottomSheet2.getCurrentFocus());
                }
            }
        }, 1024);
    }
}
