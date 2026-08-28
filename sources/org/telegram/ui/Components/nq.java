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
public final class nq implements Runnable {
    public final String[] f31154a;
    public final gh.u6 f31155b;
    public final org.telegram.ui.Cells.j3 f31156c;
    public final int[] d;
    public final kh.d f31157e;
    public final boolean f31158f;
    public final int h;
    public final TLRPC.User f31159n;
    public final int[] f31160r;
    public final boolean[] f31161s;
    public final Utilities.Callback v;
    public final org.telegram.ui.ActionBar.f3 f31162w;
    public final org.telegram.ui.ActionBar.b6 f31163x;
    public final Context f31164y;

    public nq(String[] strArr, gh.u6 u6Var, org.telegram.ui.Cells.j3 j3Var, int[] iArr, kh.d dVar, boolean z10, int i9, TLRPC.User user, int[] iArr2, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.b6 b6Var, Context context) {
        this.f31154a = strArr;
        this.f31155b = u6Var;
        this.f31156c = j3Var;
        this.d = iArr;
        this.f31157e = dVar;
        this.f31158f = z10;
        this.h = i9;
        this.f31159n = user;
        this.f31160r = iArr2;
        this.f31161s = zArr;
        this.v = callback;
        this.f31162w = f3Var;
        this.f31163x = b6Var;
        this.f31164y = context;
    }

    @Override
    public final void run() {
        String[] strArr = this.f31154a;
        if (strArr[0] == null) {
            this.f31155b.run();
            return;
        }
        org.telegram.ui.Cells.j3 j3Var = this.f31156c;
        String trim = j3Var.f24544b.getText().toString().trim();
        if (TextUtils.isEmpty(trim)) {
            int[] iArr = this.d;
            int i9 = -iArr[0];
            iArr[0] = i9;
            AndroidUtilities.shakeViewSpring(j3Var, i9);
            return;
        }
        final kh.d dVar = this.f31157e;
        dVar.setLoading(true);
        TL_bots.createBot createbot = new TL_bots.createBot();
        createbot.via_deeplink = this.f31158f;
        createbot.username = strArr[0];
        createbot.name = trim;
        final int i10 = this.h;
        MessagesController messagesController = MessagesController.getInstance(i10);
        final TLRPC.User user = this.f31159n;
        createbot.manager_id = messagesController.getInputUser(user);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        ?? obj = new Object();
        final int[] iArr2 = this.f31160r;
        final boolean[] zArr = this.f31161s;
        final Utilities.Callback callback = this.v;
        final org.telegram.ui.ActionBar.f3 f3Var = this.f31162w;
        final org.telegram.ui.ActionBar.b6 b6Var = this.f31163x;
        final Context context = this.f31164y;
        iArr2[0] = connectionsManager.sendRequestTyped(createbot, obj, new Utilities.Callback2() {
            @Override
            public final void run(Object obj2, Object obj3) {
                String userName;
                String formatString;
                TLRPC.User user2 = (TLRPC.User) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                iArr2[0] = -1;
                dVar.setLoading(false);
                int i11 = i10;
                org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
                if (user2 != null) {
                    zArr[0] = true;
                    MessagesController.getInstance(i11).putUser(user2, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user2);
                    MessagesStorage.getInstance(i11).putUsersAndChats(arrayList, null, false, false);
                    callback.run(user2);
                    f3Var2.dismiss();
                } else if (tL_error != null) {
                    boolean equalsIgnoreCase = "BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text);
                    org.telegram.ui.ActionBar.b6 b6Var2 = b6Var;
                    if (equalsIgnoreCase) {
                        MessagesController messagesController2 = MessagesController.getInstance(i11);
                        boolean isPremium = UserConfig.getInstance(i11).isPremium();
                        oc ocVar = new oc(f3Var2.topBulletinContainer, b6Var2);
                        int i12 = R.raw.error;
                        String string = LocaleController.getString(R.string.CreateManagedBotLimitTitle);
                        if (isPremium) {
                            formatString = LocaleController.formatString(R.string.CreateManagedBotLimitText, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get()));
                        } else {
                            formatString = LocaleController.formatString(R.string.CreateManagedBotLimitTextPremium, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get()), Integer.valueOf(messagesController2.config.botsCreateLimitDefault.get()));
                        }
                        SpannableStringBuilder replaceSingleLink = AndroidUtilities.replaceSingleLink(formatString, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Gi, b6Var2), new np(f3Var2, 2));
                        org.telegram.ui.wq wqVar = new org.telegram.ui.wq(29, f3Var2, context);
                        if (replaceSingleLink == null) {
                            replaceSingleLink = new SpannableStringBuilder(replaceSingleLink);
                        }
                        int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(replaceSingleLink, "@BotFather");
                        if (charSequenceIndexOf >= 0) {
                            replaceSingleLink.setSpan(new org.telegram.ui.Cells.i(b6Var2, wqVar, 6), charSequenceIndexOf, charSequenceIndexOf + 10, 33);
                        }
                        gc M = ocVar.M(string, replaceSingleLink, i12);
                        M.f28737j = 8000;
                        M.j();
                    } else {
                        String str = tL_error.text;
                        if (str != null && str.startsWith("FLOOD_WAIT_")) {
                            new oc(f3Var2.topBulletinContainer, b6Var2).M(LocaleController.getString(R.string.CreateManagedBotLimitTitle), LocaleController.formatString(R.string.CreateManagedBotLimitTextTime, LocaleController.formatDuration(Integer.parseInt(tL_error.text.substring(11)))), R.raw.error).j();
                        } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                            TLRPC.User user3 = user;
                            if (!TextUtils.isEmpty(UserObject.getPublicUsername(user3))) {
                                userName = "@" + UserObject.getPublicUsername(user3);
                            } else {
                                userName = UserObject.getUserName(user3);
                            }
                            new oc(f3Var2.topBulletinContainer, b6Var2).Q(R.raw.error, 36, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, userName), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Gi, b6Var2))).j();
                        } else {
                            org.telegram.ui.Cells.j2.s(f3Var2.topBulletinContainer, b6Var2, tL_error, false);
                        }
                    }
                    AndroidUtilities.hideKeyboard(f3Var2.getCurrentFocus());
                }
            }
        }, 1024);
    }
}
