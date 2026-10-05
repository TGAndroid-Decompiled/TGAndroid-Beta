package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
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
public final class ar implements Runnable {
    public final String[] f24705a;
    public final org.telegram.messenger.fe f24706b;
    public final org.telegram.ui.Cells.j3 f24707c;
    public final int[] d;
    public final ci.d f24708e;
    public final boolean f24709f;
    public final int h;
    public final TLRPC.User f24710n;
    public final int[] f24711r;
    public final boolean[] f24712s;
    public final Utilities.Callback v;
    public final org.telegram.ui.ActionBar.f3 f24713w;
    public final org.telegram.ui.ActionBar.d6 f24714x;
    public final Context f24715y;

    public ar(String[] strArr, org.telegram.messenger.fe feVar, org.telegram.ui.Cells.j3 j3Var, int[] iArr, ci.d dVar, boolean z10, int i10, TLRPC.User user, int[] iArr2, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.d6 d6Var, Context context) {
        this.f24705a = strArr;
        this.f24706b = feVar;
        this.f24707c = j3Var;
        this.d = iArr;
        this.f24708e = dVar;
        this.f24709f = z10;
        this.h = i10;
        this.f24710n = user;
        this.f24711r = iArr2;
        this.f24712s = zArr;
        this.v = callback;
        this.f24713w = f3Var;
        this.f24714x = d6Var;
        this.f24715y = context;
    }

    @Override
    public final void run() {
        String[] strArr = this.f24705a;
        if (strArr[0] == null) {
            this.f24706b.run();
            return;
        }
        org.telegram.ui.Cells.j3 j3Var = this.f24707c;
        String trim = j3Var.f22315b.getText().toString().trim();
        if (TextUtils.isEmpty(trim)) {
            int[] iArr = this.d;
            int i10 = -iArr[0];
            iArr[0] = i10;
            AndroidUtilities.shakeViewSpring(j3Var, i10);
            return;
        }
        final ci.d dVar = this.f24708e;
        dVar.setLoading(true);
        TL_bots.createBot createbot = new TL_bots.createBot();
        createbot.via_deeplink = this.f24709f;
        createbot.username = strArr[0];
        createbot.name = trim;
        final int i11 = this.h;
        MessagesController messagesController = MessagesController.getInstance(i11);
        final TLRPC.User user = this.f24710n;
        createbot.manager_id = messagesController.getInputUser(user);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
        ?? obj = new Object();
        final int[] iArr2 = this.f24711r;
        final boolean[] zArr = this.f24712s;
        final Utilities.Callback callback = this.v;
        final org.telegram.ui.ActionBar.f3 f3Var = this.f24713w;
        final org.telegram.ui.ActionBar.d6 d6Var = this.f24714x;
        final Context context = this.f24715y;
        iArr2[0] = connectionsManager.sendRequestTyped(createbot, obj, new Utilities.Callback2() {
            @Override
            public final void run(Object obj2, Object obj3) {
                String userName;
                String formatString;
                TLRPC.User user2 = (TLRPC.User) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                iArr2[0] = -1;
                dVar.setLoading(false);
                int i12 = i11;
                org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
                if (user2 != null) {
                    zArr[0] = true;
                    MessagesController.getInstance(i12).putUser(user2, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user2);
                    MessagesStorage.getInstance(i12).putUsersAndChats(arrayList, null, false, false);
                    callback.run(user2);
                    f3Var2.dismiss();
                } else if (tL_error != null) {
                    boolean equalsIgnoreCase = "BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text);
                    org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
                    if (equalsIgnoreCase) {
                        MessagesController messagesController2 = MessagesController.getInstance(i12);
                        boolean isPremium = UserConfig.getInstance(i12).isPremium();
                        yc ycVar = new yc(f3Var2.topBulletinContainer, d6Var2);
                        int i13 = R.raw.error;
                        String string = LocaleController.getString(R.string.CreateManagedBotLimitTitle);
                        if (isPremium) {
                            formatString = LocaleController.formatString(R.string.CreateManagedBotLimitText, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get()));
                        } else {
                            formatString = LocaleController.formatString(R.string.CreateManagedBotLimitTextPremium, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get()), Integer.valueOf(messagesController2.config.botsCreateLimitDefault.get()));
                        }
                        SpannableStringBuilder replaceSingleLink = AndroidUtilities.replaceSingleLink(formatString, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Gi, d6Var2), new aq(f3Var2, 2));
                        be beVar = new be(20, f3Var2, context);
                        if (replaceSingleLink == null) {
                            replaceSingleLink = new SpannableStringBuilder(replaceSingleLink);
                        }
                        int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(replaceSingleLink, "@BotFather");
                        if (charSequenceIndexOf >= 0) {
                            replaceSingleLink.setSpan(new org.telegram.ui.Cells.i(d6Var2, beVar, 6), charSequenceIndexOf, charSequenceIndexOf + 10, 33);
                        }
                        rc M = ycVar.M(string, replaceSingleLink, i13);
                        M.f30427j = 8000;
                        M.j();
                    } else {
                        String str = tL_error.text;
                        if (str != null && str.startsWith("FLOOD_WAIT_")) {
                            new yc(f3Var2.topBulletinContainer, d6Var2).M(LocaleController.getString(R.string.CreateManagedBotLimitTitle), LocaleController.formatString(R.string.CreateManagedBotLimitTextTime, LocaleController.formatDuration(Integer.parseInt(tL_error.text.substring(11)))), R.raw.error).j();
                        } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                            TLRPC.User user3 = user;
                            if (!TextUtils.isEmpty(UserObject.getPublicUsername(user3))) {
                                userName = "@" + UserObject.getPublicUsername(user3);
                            } else {
                                userName = UserObject.getUserName(user3);
                            }
                            new yc(f3Var2.topBulletinContainer, d6Var2).Q(R.raw.error, 36, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, userName), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Gi, d6Var2))).j();
                        } else {
                            org.telegram.ui.Cells.c1.r(f3Var2.topBulletinContainer, d6Var2, tL_error, false);
                        }
                    }
                    AndroidUtilities.hideKeyboard(f3Var2.getCurrentFocus());
                }
            }
        }, 1024);
    }
}
