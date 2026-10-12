package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.TreeSet;
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
public final class or implements Runnable {
    public final Utilities.Callback E;
    public final org.telegram.ui.ActionBar.e3 F;
    public final o8 G;
    public final org.telegram.ui.ActionBar.c6 H;
    public final org.telegram.ui.Cells.e9 I;
    public final Context J;
    public final boolean[] f28020a;
    public final int[] f28021b;
    public final org.telegram.ui.Cells.j3 f28022c;
    public final TreeSet d;
    public final String[] e;
    public final nr f28023f;
    public final org.telegram.ui.Cells.j3 h;
    public final int[] f28024n;
    public final bi.n8 f28025r;
    public final di.d f28026s;
    public final boolean v;
    public final int f28027w;
    public final TLRPC.User f28028x;
    public final boolean[] f28029y;

    public or(boolean[] zArr, int[] iArr, org.telegram.ui.Cells.j3 j3Var, TreeSet treeSet, String[] strArr, nr nrVar, org.telegram.ui.Cells.j3 j3Var2, int[] iArr2, bi.n8 n8Var, di.d dVar, boolean z10, int i10, TLRPC.User user, boolean[] zArr2, Utilities.Callback callback, org.telegram.ui.ActionBar.e3 e3Var, o8 o8Var, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Cells.e9 e9Var, Context context) {
        this.f28020a = zArr;
        this.f28021b = iArr;
        this.f28022c = j3Var;
        this.d = treeSet;
        this.e = strArr;
        this.f28023f = nrVar;
        this.h = j3Var2;
        this.f28024n = iArr2;
        this.f28025r = n8Var;
        this.f28026s = dVar;
        this.v = z10;
        this.f28027w = i10;
        this.f28028x = user;
        this.f28029y = zArr2;
        this.E = callback;
        this.F = e3Var;
        this.G = o8Var;
        this.H = c6Var;
        this.I = e9Var;
        this.J = context;
    }

    @Override
    public final void run() {
        final org.telegram.ui.Cells.j3 j3Var = this.h;
        org.telegram.ui.Cells.h3 h3Var = j3Var.f21368b;
        final boolean[] zArr = this.f28020a;
        if (!zArr[0]) {
            final int[] iArr = this.f28021b;
            if (iArr[0] < 0) {
                final org.telegram.ui.Cells.j3 j3Var2 = this.f28022c;
                String charSequence = j3Var2.getText().toString();
                StringBuilder u10 = a1.g.u(charSequence);
                String str = "bot";
                boolean a2 = qr.a(charSequence, "bot");
                final TreeSet treeSet = this.d;
                u10.append((a2 || qr.c(charSequence, treeSet) != null) ? "" : "");
                String sb2 = u10.toString();
                final String[] strArr = this.e;
                if (!TextUtils.equals(strArr[0], sb2)) {
                    this.f28023f.run();
                    return;
                }
                String trim = h3Var.getText().toString().trim();
                boolean isEmpty = TextUtils.isEmpty(trim);
                final int[] iArr2 = this.f28024n;
                if (isEmpty) {
                    int i10 = -iArr2[0];
                    iArr2[0] = i10;
                    AndroidUtilities.shakeViewSpring(j3Var, i10);
                    return;
                }
                this.f28025r.run();
                final di.d dVar = this.f28026s;
                dVar.setLoading(true);
                dVar.setEnabled(false);
                h3Var.setEnabled(false);
                j3Var2.f21368b.setEnabled(false);
                final TL_bots.createBot createbot = new TL_bots.createBot();
                createbot.via_deeplink = this.v;
                createbot.username = strArr[0];
                createbot.name = trim;
                final int i11 = this.f28027w;
                MessagesController messagesController = MessagesController.getInstance(i11);
                final TLRPC.User user = this.f28028x;
                createbot.manager_id = messagesController.getInputUser(user);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                ?? obj = new Object();
                final boolean[] zArr2 = this.f28029y;
                final Utilities.Callback callback = this.E;
                final org.telegram.ui.ActionBar.e3 e3Var = this.F;
                final o8 o8Var = this.G;
                final org.telegram.ui.ActionBar.c6 c6Var = this.H;
                final org.telegram.ui.Cells.e9 e9Var = this.I;
                final Context context = this.J;
                iArr[0] = connectionsManager.sendRequestTyped(createbot, obj, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj2, Object obj3) {
                        String userName;
                        String formatString;
                        TLRPC.User user2 = (TLRPC.User) obj2;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                        if (!zArr[0]) {
                            iArr[0] = -1;
                            di.d dVar2 = dVar;
                            dVar2.setLoading(false);
                            dVar2.setEnabled(true);
                            j3Var.f21368b.setEnabled(true);
                            j3Var2.f21368b.setEnabled(true);
                            int i12 = i11;
                            org.telegram.ui.ActionBar.e3 e3Var2 = e3Var;
                            if (user2 != null) {
                                zArr2[0] = true;
                                MessagesController.getInstance(i12).putUser(user2, false);
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(user2);
                                MessagesStorage.getInstance(i12).putUsersAndChats(arrayList, null, false, false);
                                callback.run(user2);
                                e3Var2.dismiss();
                            } else if (tL_error != null) {
                                String str2 = createbot.username;
                                String str3 = tL_error.text;
                                TreeSet treeSet2 = treeSet;
                                o8 o8Var2 = o8Var;
                                org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                                CharSequence d = qr.d(i12, str2, treeSet2, str3, o8Var2, c6Var2);
                                if (d != null) {
                                    strArr[0] = null;
                                    dVar2.setEnabled(false);
                                    org.telegram.ui.Cells.e9 e9Var2 = e9Var;
                                    e9Var2.setText(d);
                                    e9Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20139q7, c6Var2));
                                    int[] iArr3 = iArr2;
                                    int i13 = -iArr3[0];
                                    iArr3[0] = i13;
                                    AndroidUtilities.shakeViewSpring(e9Var2, i13);
                                } else if ("BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text)) {
                                    MessagesController messagesController2 = MessagesController.getInstance(i12);
                                    boolean isPremium = UserConfig.getInstance(i12).isPremium();
                                    zc zcVar = new zc(e3Var2.topBulletinContainer, c6Var2);
                                    int i14 = R.raw.error;
                                    String string = LocaleController.getString(R.string.CreateManagedBotLimitTitle);
                                    if (isPremium) {
                                        formatString = LocaleController.formatString(R.string.CreateManagedBotLimitText, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get()));
                                    } else {
                                        formatString = LocaleController.formatString(R.string.CreateManagedBotLimitTextPremium, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get()), Integer.valueOf(messagesController2.config.botsCreateLimitDefault.get()));
                                    }
                                    SpannableStringBuilder replaceSingleLink = AndroidUtilities.replaceSingleLink(formatString, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Gi, c6Var2), new kq(e3Var2, 2));
                                    sk skVar = new sk(9, e3Var2, context);
                                    if (replaceSingleLink == null) {
                                        replaceSingleLink = new SpannableStringBuilder(replaceSingleLink);
                                    }
                                    int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(replaceSingleLink, "@BotFather");
                                    if (charSequenceIndexOf >= 0) {
                                        replaceSingleLink.setSpan(new org.telegram.ui.Cells.i(c6Var2, skVar, 6), charSequenceIndexOf, charSequenceIndexOf + 10, 33);
                                    }
                                    sc M = zcVar.M(string, replaceSingleLink, i14);
                                    M.f29102j = 8000;
                                    M.j();
                                } else {
                                    String str4 = tL_error.text;
                                    if (str4 != null && str4.startsWith("FLOOD_WAIT_")) {
                                        new zc(e3Var2.topBulletinContainer, c6Var2).M(LocaleController.getString(R.string.CreateManagedBotLimitTitle), LocaleController.formatString(R.string.CreateManagedBotLimitTextTime, LocaleController.formatDuration(Integer.parseInt(tL_error.text.substring(11)))), R.raw.error).j();
                                    } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                                        TLRPC.User user3 = user;
                                        if (!TextUtils.isEmpty(UserObject.getPublicUsername(user3))) {
                                            userName = "@" + UserObject.getPublicUsername(user3);
                                        } else {
                                            userName = UserObject.getUserName(user3);
                                        }
                                        new zc(e3Var2.topBulletinContainer, c6Var2).Q(R.raw.error, 36, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, userName), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Gi, c6Var2))).j();
                                    } else {
                                        org.telegram.ui.Cells.d0.r(e3Var2.topBulletinContainer, c6Var2, tL_error, false);
                                    }
                                }
                                AndroidUtilities.hideKeyboard(e3Var2.getCurrentFocus());
                            }
                        }
                    }
                }, 1024);
            }
        }
    }
}
