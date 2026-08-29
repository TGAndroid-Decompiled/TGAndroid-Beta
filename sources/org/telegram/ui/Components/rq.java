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
public final class rq implements Runnable {
    public final String[] f32355a;
    public final jh.r6 f32356b;
    public final org.telegram.ui.Cells.g3 f32357c;
    public final int[] d;
    public final nh.d f32358e;
    public final boolean f32359f;
    public final int h;
    public final TLRPC.User f32360n;
    public final int[] f32361r;
    public final boolean[] f32362s;
    public final Utilities.Callback v;
    public final org.telegram.ui.ActionBar.f3 f32363w;
    public final org.telegram.ui.ActionBar.c6 f32364x;
    public final Context f32365y;

    public rq(String[] strArr, jh.r6 r6Var, org.telegram.ui.Cells.g3 g3Var, int[] iArr, nh.d dVar, boolean z10, int i10, TLRPC.User user, int[] iArr2, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.c6 c6Var, Context context) {
        this.f32355a = strArr;
        this.f32356b = r6Var;
        this.f32357c = g3Var;
        this.d = iArr;
        this.f32358e = dVar;
        this.f32359f = z10;
        this.h = i10;
        this.f32360n = user;
        this.f32361r = iArr2;
        this.f32362s = zArr;
        this.v = callback;
        this.f32363w = f3Var;
        this.f32364x = c6Var;
        this.f32365y = context;
    }

    @Override
    public final void run() {
        String[] strArr = this.f32355a;
        if (strArr[0] == null) {
            this.f32356b.run();
            return;
        }
        org.telegram.ui.Cells.g3 g3Var = this.f32357c;
        String trim = g3Var.f24387b.getText().toString().trim();
        if (TextUtils.isEmpty(trim)) {
            int[] iArr = this.d;
            int i10 = -iArr[0];
            iArr[0] = i10;
            AndroidUtilities.shakeViewSpring(g3Var, i10);
            return;
        }
        final nh.d dVar = this.f32358e;
        dVar.setLoading(true);
        TL_bots.createBot createbot = new TL_bots.createBot();
        createbot.via_deeplink = this.f32359f;
        createbot.username = strArr[0];
        createbot.name = trim;
        final int i11 = this.h;
        MessagesController messagesController = MessagesController.getInstance(i11);
        final TLRPC.User user = this.f32360n;
        createbot.manager_id = messagesController.getInputUser(user);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
        ?? obj = new Object();
        final int[] iArr2 = this.f32361r;
        final boolean[] zArr = this.f32362s;
        final Utilities.Callback callback = this.v;
        final org.telegram.ui.ActionBar.f3 f3Var = this.f32363w;
        final org.telegram.ui.ActionBar.c6 c6Var = this.f32364x;
        final Context context = this.f32365y;
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
                    org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                    if (equalsIgnoreCase) {
                        MessagesController messagesController2 = MessagesController.getInstance(i12);
                        boolean isPremium = UserConfig.getInstance(i12).isPremium();
                        tc tcVar = new tc(f3Var2.topBulletinContainer, c6Var2);
                        int i13 = R.raw.error;
                        String string = LocaleController.getString(R.string.CreateManagedBotLimitTitle);
                        if (isPremium) {
                            formatString = LocaleController.formatString(R.string.CreateManagedBotLimitText, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get()));
                        } else {
                            formatString = LocaleController.formatString(R.string.CreateManagedBotLimitTextPremium, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get()), Integer.valueOf(messagesController2.config.botsCreateLimitDefault.get()));
                        }
                        SpannableStringBuilder replaceSingleLink = AndroidUtilities.replaceSingleLink(formatString, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Gi, c6Var2), new rp(f3Var2, 2));
                        z2 z2Var = new z2(26, f3Var2, context);
                        if (replaceSingleLink == null) {
                            replaceSingleLink = new SpannableStringBuilder(replaceSingleLink);
                        }
                        int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(replaceSingleLink, "@BotFather");
                        if (charSequenceIndexOf >= 0) {
                            replaceSingleLink.setSpan(new org.telegram.ui.Cells.i(c6Var2, z2Var, 6), charSequenceIndexOf, charSequenceIndexOf + 10, 33);
                        }
                        mc M = tcVar.M(string, replaceSingleLink, i13);
                        M.f30652j = 8000;
                        M.j();
                    } else {
                        String str = tL_error.text;
                        if (str != null && str.startsWith("FLOOD_WAIT_")) {
                            new tc(f3Var2.topBulletinContainer, c6Var2).M(LocaleController.getString(R.string.CreateManagedBotLimitTitle), LocaleController.formatString(R.string.CreateManagedBotLimitTextTime, LocaleController.formatDuration(Integer.parseInt(tL_error.text.substring(11)))), R.raw.error).j();
                        } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                            TLRPC.User user3 = user;
                            if (!TextUtils.isEmpty(UserObject.getPublicUsername(user3))) {
                                userName = "@" + UserObject.getPublicUsername(user3);
                            } else {
                                userName = UserObject.getUserName(user3);
                            }
                            new tc(f3Var2.topBulletinContainer, c6Var2).Q(R.raw.error, 36, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, userName), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Gi, c6Var2))).j();
                        } else {
                            org.telegram.ui.th.t(f3Var2.topBulletinContainer, c6Var2, tL_error, false);
                        }
                    }
                    AndroidUtilities.hideKeyboard(f3Var2.getCurrentFocus());
                }
            }
        }, 1024);
    }
}
