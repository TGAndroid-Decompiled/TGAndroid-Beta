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
public final class xq implements Runnable {
    public final String[] f33149a;
    public final mh.s6 f33150b;
    public final org.telegram.ui.Cells.i3 f33151c;
    public final int[] d;
    public final qh.d f33152e;
    public final boolean f33153f;
    public final int h;
    public final TLRPC.User f33154n;
    public final int[] f33155r;
    public final boolean[] f33156s;
    public final Utilities.Callback v;
    public final org.telegram.ui.ActionBar.h3 f33157w;
    public final org.telegram.ui.ActionBar.g6 f33158x;
    public final Context f33159y;

    public xq(String[] strArr, mh.s6 s6Var, org.telegram.ui.Cells.i3 i3Var, int[] iArr, qh.d dVar, boolean z4, int i10, TLRPC.User user, int[] iArr2, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.ActionBar.h3 h3Var, org.telegram.ui.ActionBar.g6 g6Var, Context context) {
        this.f33149a = strArr;
        this.f33150b = s6Var;
        this.f33151c = i3Var;
        this.d = iArr;
        this.f33152e = dVar;
        this.f33153f = z4;
        this.h = i10;
        this.f33154n = user;
        this.f33155r = iArr2;
        this.f33156s = zArr;
        this.v = callback;
        this.f33157w = h3Var;
        this.f33158x = g6Var;
        this.f33159y = context;
    }

    @Override
    public final void run() {
        String[] strArr = this.f33149a;
        if (strArr[0] == null) {
            this.f33150b.run();
            return;
        }
        org.telegram.ui.Cells.i3 i3Var = this.f33151c;
        String trim = i3Var.f22957b.getText().toString().trim();
        if (TextUtils.isEmpty(trim)) {
            int[] iArr = this.d;
            int i10 = -iArr[0];
            iArr[0] = i10;
            AndroidUtilities.shakeViewSpring(i3Var, i10);
            return;
        }
        final qh.d dVar = this.f33152e;
        dVar.setLoading(true);
        TL_bots.createBot createbot = new TL_bots.createBot();
        createbot.via_deeplink = this.f33153f;
        createbot.username = strArr[0];
        createbot.name = trim;
        final int i11 = this.h;
        MessagesController messagesController = MessagesController.getInstance(i11);
        final TLRPC.User user = this.f33154n;
        createbot.manager_id = messagesController.getInputUser(user);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
        ?? obj = new Object();
        final int[] iArr2 = this.f33155r;
        final boolean[] zArr = this.f33156s;
        final Utilities.Callback callback = this.v;
        final org.telegram.ui.ActionBar.h3 h3Var = this.f33157w;
        final org.telegram.ui.ActionBar.g6 g6Var = this.f33158x;
        final Context context = this.f33159y;
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
                org.telegram.ui.ActionBar.h3 h3Var2 = h3Var;
                if (user2 != null) {
                    zArr[0] = true;
                    MessagesController.getInstance(i12).putUser(user2, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user2);
                    MessagesStorage.getInstance(i12).putUsersAndChats(arrayList, null, false, false);
                    callback.run(user2);
                    h3Var2.dismiss();
                } else if (tL_error != null) {
                    boolean equalsIgnoreCase = "BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text);
                    org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                    if (equalsIgnoreCase) {
                        MessagesController messagesController2 = MessagesController.getInstance(i12);
                        boolean isPremium = UserConfig.getInstance(i12).isPremium();
                        qc qcVar = new qc(h3Var2.topBulletinContainer, g6Var2);
                        int i13 = R.raw.error;
                        String string = LocaleController.getString(R.string.CreateManagedBotLimitTitle);
                        if (isPremium) {
                            formatString = LocaleController.formatString(R.string.CreateManagedBotLimitText, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get()));
                        } else {
                            formatString = LocaleController.formatString(R.string.CreateManagedBotLimitTextPremium, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get()), Integer.valueOf(messagesController2.config.botsCreateLimitDefault.get()));
                        }
                        SpannableStringBuilder replaceSingleLink = AndroidUtilities.replaceSingleLink(formatString, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Gi, g6Var2), new xp(h3Var2, 2));
                        eo eoVar = new eo(3, h3Var2, context);
                        if (replaceSingleLink == null) {
                            replaceSingleLink = new SpannableStringBuilder(replaceSingleLink);
                        }
                        int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(replaceSingleLink, "@BotFather");
                        if (charSequenceIndexOf >= 0) {
                            replaceSingleLink.setSpan(new org.telegram.ui.Cells.i(g6Var2, eoVar, 6), charSequenceIndexOf, charSequenceIndexOf + 10, 33);
                        }
                        ic M = qcVar.M(string, replaceSingleLink, i13);
                        M.f27778j = 8000;
                        M.j();
                    } else {
                        String str = tL_error.text;
                        if (str != null && str.startsWith("FLOOD_WAIT_")) {
                            new qc(h3Var2.topBulletinContainer, g6Var2).M(LocaleController.getString(R.string.CreateManagedBotLimitTitle), LocaleController.formatString(R.string.CreateManagedBotLimitTextTime, LocaleController.formatDuration(Integer.parseInt(tL_error.text.substring(11)))), R.raw.error).j();
                        } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                            TLRPC.User user3 = user;
                            if (!TextUtils.isEmpty(UserObject.getPublicUsername(user3))) {
                                userName = "@" + UserObject.getPublicUsername(user3);
                            } else {
                                userName = UserObject.getUserName(user3);
                            }
                            new qc(h3Var2.topBulletinContainer, g6Var2).Q(R.raw.error, 36, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, userName), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Gi, g6Var2))).j();
                        } else {
                            org.telegram.ui.yh.u(h3Var2.topBulletinContainer, g6Var2, tL_error, false);
                        }
                    }
                    AndroidUtilities.hideKeyboard(h3Var2.getCurrentFocus());
                }
            }
        }, 1024);
    }
}
