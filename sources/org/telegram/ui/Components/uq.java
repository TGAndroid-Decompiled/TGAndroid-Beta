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
public final class uq implements Runnable {
    public final String[] f29277a;
    public final lh.s6 f29278b;
    public final org.telegram.ui.Cells.h3 f29279c;
    public final int[] d;
    public final ph.d e;
    public final boolean f29280f;
    public final int h;
    public final TLRPC.User f29281n;
    public final int[] f29282r;
    public final boolean[] f29283s;
    public final Utilities.Callback v;
    public final org.telegram.ui.ActionBar.g3 f29284w;
    public final org.telegram.ui.ActionBar.f6 f29285x;
    public final Context f29286y;

    public uq(String[] strArr, lh.s6 s6Var, org.telegram.ui.Cells.h3 h3Var, int[] iArr, ph.d dVar, boolean z4, int i10, TLRPC.User user, int[] iArr2, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.ActionBar.g3 g3Var, org.telegram.ui.ActionBar.f6 f6Var, Context context) {
        this.f29277a = strArr;
        this.f29278b = s6Var;
        this.f29279c = h3Var;
        this.d = iArr;
        this.e = dVar;
        this.f29280f = z4;
        this.h = i10;
        this.f29281n = user;
        this.f29282r = iArr2;
        this.f29283s = zArr;
        this.v = callback;
        this.f29284w = g3Var;
        this.f29285x = f6Var;
        this.f29286y = context;
    }

    @Override
    public final void run() {
        String[] strArr = this.f29277a;
        if (strArr[0] == null) {
            this.f29278b.run();
            return;
        }
        org.telegram.ui.Cells.h3 h3Var = this.f29279c;
        String trim = h3Var.f21132b.getText().toString().trim();
        if (TextUtils.isEmpty(trim)) {
            int[] iArr = this.d;
            int i10 = -iArr[0];
            iArr[0] = i10;
            AndroidUtilities.shakeViewSpring(h3Var, i10);
            return;
        }
        final ph.d dVar = this.e;
        dVar.setLoading(true);
        TL_bots.createBot createbot = new TL_bots.createBot();
        createbot.via_deeplink = this.f29280f;
        createbot.username = strArr[0];
        createbot.name = trim;
        final int i11 = this.h;
        MessagesController messagesController = MessagesController.getInstance(i11);
        final TLRPC.User user = this.f29281n;
        createbot.manager_id = messagesController.getInputUser(user);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
        ?? obj = new Object();
        final int[] iArr2 = this.f29282r;
        final boolean[] zArr = this.f29283s;
        final Utilities.Callback callback = this.v;
        final org.telegram.ui.ActionBar.g3 g3Var = this.f29284w;
        final org.telegram.ui.ActionBar.f6 f6Var = this.f29285x;
        final Context context = this.f29286y;
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
                org.telegram.ui.ActionBar.g3 g3Var2 = g3Var;
                if (user2 != null) {
                    zArr[0] = true;
                    MessagesController.getInstance(i12).putUser(user2, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user2);
                    MessagesStorage.getInstance(i12).putUsersAndChats(arrayList, null, false, false);
                    callback.run(user2);
                    g3Var2.dismiss();
                } else if (tL_error != null) {
                    boolean equalsIgnoreCase = "BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text);
                    org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                    if (equalsIgnoreCase) {
                        MessagesController messagesController2 = MessagesController.getInstance(i12);
                        boolean isPremium = UserConfig.getInstance(i12).isPremium();
                        qc qcVar = new qc(g3Var2.topBulletinContainer, f6Var2);
                        int i13 = R.raw.error;
                        String string = LocaleController.getString(R.string.CreateManagedBotLimitTitle);
                        if (isPremium) {
                            formatString = LocaleController.formatString(R.string.CreateManagedBotLimitText, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get()));
                        } else {
                            formatString = LocaleController.formatString(R.string.CreateManagedBotLimitTextPremium, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get()), Integer.valueOf(messagesController2.config.botsCreateLimitDefault.get()));
                        }
                        SpannableStringBuilder replaceSingleLink = AndroidUtilities.replaceSingleLink(formatString, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, f6Var2), new up(g3Var2, 2));
                        em emVar = new em(4, g3Var2, context);
                        if (replaceSingleLink == null) {
                            replaceSingleLink = new SpannableStringBuilder(replaceSingleLink);
                        }
                        int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(replaceSingleLink, "@BotFather");
                        if (charSequenceIndexOf >= 0) {
                            replaceSingleLink.setSpan(new org.telegram.ui.Cells.i(f6Var2, emVar, 6), charSequenceIndexOf, charSequenceIndexOf + 10, 33);
                        }
                        ic M = qcVar.M(string, replaceSingleLink, i13);
                        M.f25671j = 8000;
                        M.j();
                    } else {
                        String str = tL_error.text;
                        if (str != null && str.startsWith("FLOOD_WAIT_")) {
                            new qc(g3Var2.topBulletinContainer, f6Var2).M(LocaleController.getString(R.string.CreateManagedBotLimitTitle), LocaleController.formatString(R.string.CreateManagedBotLimitTextTime, LocaleController.formatDuration(Integer.parseInt(tL_error.text.substring(11)))), R.raw.error).j();
                        } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                            TLRPC.User user3 = user;
                            if (!TextUtils.isEmpty(UserObject.getPublicUsername(user3))) {
                                userName = "@" + UserObject.getPublicUsername(user3);
                            } else {
                                userName = UserObject.getUserName(user3);
                            }
                            new qc(g3Var2.topBulletinContainer, f6Var2).Q(R.raw.error, 36, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, userName), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, f6Var2))).j();
                        } else {
                            org.telegram.ui.ai.u(g3Var2.topBulletinContainer, f6Var2, tL_error, false);
                        }
                    }
                    AndroidUtilities.hideKeyboard(g3Var2.getCurrentFocus());
                }
            }
        }, 1024);
    }
}
