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
public final class wq implements Runnable {
    public final String[] f32307a;
    public final org.telegram.messenger.ib f32308b;
    public final org.telegram.ui.Cells.i3 f32309c;
    public final int[] d;
    public final di.d f32310e;
    public final boolean f32311f;
    public final int h;
    public final TLRPC.User f32312n;
    public final int[] f32313r;
    public final boolean[] f32314s;
    public final Utilities.Callback v;
    public final org.telegram.ui.ActionBar.f3 f32315w;
    public final org.telegram.ui.ActionBar.f6 f32316x;
    public final Context f32317y;

    public wq(String[] strArr, org.telegram.messenger.ib ibVar, org.telegram.ui.Cells.i3 i3Var, int[] iArr, di.d dVar, boolean z10, int i10, TLRPC.User user, int[] iArr2, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.f6 f6Var, Context context) {
        this.f32307a = strArr;
        this.f32308b = ibVar;
        this.f32309c = i3Var;
        this.d = iArr;
        this.f32310e = dVar;
        this.f32311f = z10;
        this.h = i10;
        this.f32312n = user;
        this.f32313r = iArr2;
        this.f32314s = zArr;
        this.v = callback;
        this.f32315w = f3Var;
        this.f32316x = f6Var;
        this.f32317y = context;
    }

    @Override
    public final void run() {
        String[] strArr = this.f32307a;
        if (strArr[0] == null) {
            this.f32308b.run();
            return;
        }
        org.telegram.ui.Cells.i3 i3Var = this.f32309c;
        String trim = i3Var.f22074b.getText().toString().trim();
        if (TextUtils.isEmpty(trim)) {
            int[] iArr = this.d;
            int i10 = -iArr[0];
            iArr[0] = i10;
            AndroidUtilities.shakeViewSpring(i3Var, i10);
            return;
        }
        final di.d dVar = this.f32310e;
        dVar.setLoading(true);
        TL_bots.createBot createbot = new TL_bots.createBot();
        createbot.via_deeplink = this.f32311f;
        createbot.username = strArr[0];
        createbot.name = trim;
        final int i11 = this.h;
        MessagesController messagesController = MessagesController.getInstance(i11);
        final TLRPC.User user = this.f32312n;
        createbot.manager_id = messagesController.getInputUser(user);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
        ?? obj = new Object();
        final int[] iArr2 = this.f32313r;
        final boolean[] zArr = this.f32314s;
        final Utilities.Callback callback = this.v;
        final org.telegram.ui.ActionBar.f3 f3Var = this.f32315w;
        final org.telegram.ui.ActionBar.f6 f6Var = this.f32316x;
        final Context context = this.f32317y;
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
                    org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                    if (equalsIgnoreCase) {
                        MessagesController messagesController2 = MessagesController.getInstance(i12);
                        boolean isPremium = UserConfig.getInstance(i12).isPremium();
                        yc ycVar = new yc(f3Var2.topBulletinContainer, f6Var2);
                        int i13 = R.raw.error;
                        String string = LocaleController.getString(R.string.CreateManagedBotLimitTitle);
                        if (isPremium) {
                            formatString = LocaleController.formatString(R.string.CreateManagedBotLimitText, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get()));
                        } else {
                            formatString = LocaleController.formatString(R.string.CreateManagedBotLimitTextPremium, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get()), Integer.valueOf(messagesController2.config.botsCreateLimitDefault.get()));
                        }
                        SpannableStringBuilder replaceSingleLink = AndroidUtilities.replaceSingleLink(formatString, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, f6Var2), new wp(f3Var2, 2));
                        uc ucVar = new uc(23, f3Var2, context);
                        if (replaceSingleLink == null) {
                            replaceSingleLink = new SpannableStringBuilder(replaceSingleLink);
                        }
                        int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(replaceSingleLink, "@BotFather");
                        if (charSequenceIndexOf >= 0) {
                            replaceSingleLink.setSpan(new org.telegram.ui.Cells.i(f6Var2, ucVar, 6), charSequenceIndexOf, charSequenceIndexOf + 10, 33);
                        }
                        qc M = ycVar.M(string, replaceSingleLink, i13);
                        M.f29679j = 8000;
                        M.j();
                    } else {
                        String str = tL_error.text;
                        if (str != null && str.startsWith("FLOOD_WAIT_")) {
                            new yc(f3Var2.topBulletinContainer, f6Var2).M(LocaleController.getString(R.string.CreateManagedBotLimitTitle), LocaleController.formatString(R.string.CreateManagedBotLimitTextTime, LocaleController.formatDuration(Integer.parseInt(tL_error.text.substring(11)))), R.raw.error).j();
                        } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                            TLRPC.User user3 = user;
                            if (!TextUtils.isEmpty(UserObject.getPublicUsername(user3))) {
                                userName = "@" + UserObject.getPublicUsername(user3);
                            } else {
                                userName = UserObject.getUserName(user3);
                            }
                            new yc(f3Var2.topBulletinContainer, f6Var2).Q(R.raw.error, 36, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, userName), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, f6Var2))).j();
                        } else {
                            org.telegram.ui.Cells.p6.q(f3Var2.topBulletinContainer, f6Var2, tL_error, false);
                        }
                    }
                    AndroidUtilities.hideKeyboard(f3Var2.getCurrentFocus());
                }
            }
        }, 1024);
    }
}
