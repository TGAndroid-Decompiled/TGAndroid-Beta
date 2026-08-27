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

public final class lq implements Runnable {

    public final String[] f30439a;

    public final hh.t6 f30440b;

    public final org.telegram.ui.Cells.g3 f30441c;
    public final int[] d;

    public final lh.d f30442e;

    public final boolean f30443f;
    public final int h;

    public final TLRPC.User f30444n;

    public final int[] f30445r;

    public final boolean[] f30446s;
    public final Utilities.Callback v;

    public final org.telegram.ui.ActionBar.e3 f30447w;

    public final org.telegram.ui.ActionBar.c6 f30448x;

    public final Context f30449y;

    public lq(String[] strArr, hh.t6 t6Var, org.telegram.ui.Cells.g3 g3Var, int[] iArr, lh.d dVar, boolean z10, int i10, TLRPC.User user, int[] iArr2, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.c6 c6Var, Context context) {
        this.f30439a = strArr;
        this.f30440b = t6Var;
        this.f30441c = g3Var;
        this.d = iArr;
        this.f30442e = dVar;
        this.f30443f = z10;
        this.h = i10;
        this.f30444n = user;
        this.f30445r = iArr2;
        this.f30446s = zArr;
        this.v = callback;
        this.f30447w = e3Var;
        this.f30448x = c6Var;
        this.f30449y = context;
    }

    @Override
    public final void run() {
        String[] strArr = this.f30439a;
        if (strArr[0] == null) {
            this.f30440b.run();
            return;
        }
        org.telegram.ui.Cells.g3 g3Var = this.f30441c;
        String strTrim = g3Var.f24370b.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            int[] iArr = this.d;
            int i10 = -iArr[0];
            iArr[0] = i10;
            AndroidUtilities.shakeViewSpring(g3Var, i10);
            return;
        }
        final lh.d dVar = this.f30442e;
        dVar.setLoading(true);
        TL_bots.createBot createbot = new TL_bots.createBot();
        createbot.via_deeplink = this.f30443f;
        createbot.username = strArr[0];
        createbot.name = strTrim;
        final int i11 = this.h;
        MessagesController messagesController = MessagesController.getInstance(i11);
        final TLRPC.User user = this.f30444n;
        createbot.manager_id = messagesController.getInputUser(user);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
        org.telegram.messenger.a aVar = new org.telegram.messenger.a();
        final int[] iArr2 = this.f30445r;
        final boolean[] zArr = this.f30446s;
        final Utilities.Callback callback = this.v;
        final org.telegram.ui.ActionBar.e3 e3Var = this.f30447w;
        final org.telegram.ui.ActionBar.c6 c6Var = this.f30448x;
        final Context context = this.f30449y;
        iArr2[0] = connectionsManager.sendRequestTyped(createbot, aVar, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                String userName;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                iArr2[0] = -1;
                dVar.setLoading(false);
                int i12 = i11;
                org.telegram.ui.ActionBar.e3 e3Var2 = e3Var;
                if (user2 != null) {
                    zArr[0] = true;
                    MessagesController.getInstance(i12).putUser(user2, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user2);
                    MessagesStorage.getInstance(i12).putUsersAndChats(arrayList, null, false, false);
                    callback.run(user2);
                    e3Var2.dismiss();
                    return;
                }
                if (tL_error != null) {
                    boolean zEqualsIgnoreCase = "BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text);
                    org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                    if (zEqualsIgnoreCase) {
                        MessagesController messagesController2 = MessagesController.getInstance(i12);
                        boolean zIsPremium = UserConfig.getInstance(i12).isPremium();
                        mc mcVar = new mc(e3Var2.topBulletinContainer, c6Var2);
                        int i13 = R.raw.error;
                        String string = LocaleController.getString(R.string.CreateManagedBotLimitTitle);
                        SpannableStringBuilder spannableStringBuilderReplaceSingleLink = AndroidUtilities.replaceSingleLink(zIsPremium ? LocaleController.formatString(R.string.CreateManagedBotLimitText, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get())) : LocaleController.formatString(R.string.CreateManagedBotLimitTextPremium, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get()), Integer.valueOf(messagesController2.config.botsCreateLimitDefault.get())), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Gi, c6Var2), new lp(e3Var2, 2));
                        org.telegram.ui.yq yqVar = new org.telegram.ui.yq(29, e3Var2, context);
                        if (spannableStringBuilderReplaceSingleLink == null) {
                            spannableStringBuilderReplaceSingleLink = new SpannableStringBuilder(spannableStringBuilderReplaceSingleLink);
                        }
                        int iCharSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(spannableStringBuilderReplaceSingleLink, "@BotFather");
                        if (iCharSequenceIndexOf >= 0) {
                            spannableStringBuilderReplaceSingleLink.setSpan(new org.telegram.ui.Cells.i(c6Var2, yqVar, 6), iCharSequenceIndexOf, iCharSequenceIndexOf + 10, 33);
                        }
                        ec ecVarM = mcVar.M(string, spannableStringBuilderReplaceSingleLink, i13);
                        ecVarM.f28020j = 8000;
                        ecVarM.j();
                    } else {
                        String str = tL_error.text;
                        if (str != null && str.startsWith("FLOOD_WAIT_")) {
                            new mc(e3Var2.topBulletinContainer, c6Var2).M(LocaleController.getString(R.string.CreateManagedBotLimitTitle), LocaleController.formatString(R.string.CreateManagedBotLimitTextTime, LocaleController.formatDuration(Integer.parseInt(tL_error.text.substring(11)))), R.raw.error).j();
                        } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                            TLRPC.User user3 = user;
                            if (TextUtils.isEmpty(UserObject.getPublicUsername(user3))) {
                                userName = UserObject.getUserName(user3);
                            } else {
                                userName = "@" + UserObject.getPublicUsername(user3);
                            }
                            new mc(e3Var2.topBulletinContainer, c6Var2).Q(R.raw.error, 36, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, userName), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Gi, c6Var2))).j();
                        } else {
                            org.telegram.ui.Cells.pa.t(e3Var2.topBulletinContainer, c6Var2, tL_error, false);
                        }
                    }
                    AndroidUtilities.hideKeyboard(e3Var2.getCurrentFocus());
                }
            }
        }, 1024);
    }
}
