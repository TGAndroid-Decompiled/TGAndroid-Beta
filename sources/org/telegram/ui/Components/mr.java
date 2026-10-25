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
public final class mr implements Runnable {
    public final Utilities.Callback E;
    public final org.telegram.ui.ActionBar.k3 F;
    public final h2 G;
    public final org.telegram.ui.ActionBar.u6 H;
    public final org.telegram.ui.Cells.i9 I;
    public final Context J;
    public final boolean[] f30687a;
    public final int[] f30688b;
    public final org.telegram.ui.Cells.g3 f30689c;
    public final TreeSet d;
    public final String[] e;
    public final lr f30690f;
    public final org.telegram.ui.Cells.g3 h;
    public final int[] f30691n;
    public final ai.h1 f30692r;
    public final fi.d f30693s;
    public final boolean v;
    public final int f30694w;
    public final TLRPC.User f30695x;
    public final boolean[] f30696y;

    public mr(boolean[] zArr, int[] iArr, org.telegram.ui.Cells.g3 g3Var, TreeSet treeSet, String[] strArr, lr lrVar, org.telegram.ui.Cells.g3 g3Var2, int[] iArr2, ai.h1 h1Var, fi.d dVar, boolean z10, int i10, TLRPC.User user, boolean[] zArr2, Utilities.Callback callback, org.telegram.ui.ActionBar.k3 k3Var, h2 h2Var, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.Cells.i9 i9Var, Context context) {
        this.f30687a = zArr;
        this.f30688b = iArr;
        this.f30689c = g3Var;
        this.d = treeSet;
        this.e = strArr;
        this.f30690f = lrVar;
        this.h = g3Var2;
        this.f30691n = iArr2;
        this.f30692r = h1Var;
        this.f30693s = dVar;
        this.v = z10;
        this.f30694w = i10;
        this.f30695x = user;
        this.f30696y = zArr2;
        this.E = callback;
        this.F = k3Var;
        this.G = h2Var;
        this.H = u6Var;
        this.I = i9Var;
        this.J = context;
    }

    @Override
    public final void run() {
        final org.telegram.ui.Cells.g3 g3Var = this.h;
        org.telegram.ui.Cells.e3 e3Var = g3Var.d;
        final boolean[] zArr = this.f30687a;
        if (!zArr[0]) {
            final int[] iArr = this.f30688b;
            if (iArr[0] < 0) {
                final org.telegram.ui.Cells.g3 g3Var2 = this.f30689c;
                String charSequence = g3Var2.getText().toString();
                StringBuilder u10 = a1.g.u(charSequence);
                String str = "bot";
                boolean a2 = pr.a(charSequence, "bot");
                final TreeSet treeSet = this.d;
                u10.append((a2 || pr.c(charSequence, treeSet) != null) ? "" : "");
                String sb2 = u10.toString();
                final String[] strArr = this.e;
                if (!TextUtils.equals(strArr[0], sb2)) {
                    this.f30690f.run();
                    return;
                }
                String trim = e3Var.getText().toString().trim();
                boolean isEmpty = TextUtils.isEmpty(trim);
                final int[] iArr2 = this.f30691n;
                if (isEmpty) {
                    int i10 = -iArr2[0];
                    iArr2[0] = i10;
                    AndroidUtilities.shakeViewSpring(g3Var, i10);
                    return;
                }
                this.f30692r.run();
                final fi.d dVar = this.f30693s;
                dVar.setLoading(true);
                dVar.setEnabled(false);
                e3Var.setEnabled(false);
                g3Var2.d.setEnabled(false);
                final TL_bots.createBot createbot = new TL_bots.createBot();
                createbot.via_deeplink = this.v;
                createbot.username = strArr[0];
                createbot.name = trim;
                final int i11 = this.f30694w;
                MessagesController messagesController = MessagesController.getInstance(i11);
                final TLRPC.User user = this.f30695x;
                createbot.manager_id = messagesController.getInputUser(user);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                ?? obj = new Object();
                final boolean[] zArr2 = this.f30696y;
                final Utilities.Callback callback = this.E;
                final org.telegram.ui.ActionBar.k3 k3Var = this.F;
                final h2 h2Var = this.G;
                final org.telegram.ui.ActionBar.u6 u6Var = this.H;
                final org.telegram.ui.Cells.i9 i9Var = this.I;
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
                            fi.d dVar2 = dVar;
                            dVar2.setLoading(false);
                            dVar2.setEnabled(true);
                            g3Var.d.setEnabled(true);
                            g3Var2.d.setEnabled(true);
                            int i12 = i11;
                            org.telegram.ui.ActionBar.k3 k3Var2 = k3Var;
                            if (user2 != null) {
                                zArr2[0] = true;
                                MessagesController.getInstance(i12).putUser(user2, false);
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(user2);
                                MessagesStorage.getInstance(i12).putUsersAndChats(arrayList, null, false, false);
                                callback.run(user2);
                                k3Var2.dismiss();
                            } else if (tL_error != null) {
                                String str2 = createbot.username;
                                String str3 = tL_error.text;
                                TreeSet treeSet2 = treeSet;
                                h2 h2Var2 = h2Var;
                                org.telegram.ui.ActionBar.u6 u6Var2 = u6Var;
                                CharSequence d = pr.d(i12, str2, treeSet2, str3, h2Var2, u6Var2);
                                if (d != null) {
                                    strArr[0] = null;
                                    dVar2.setEnabled(false);
                                    org.telegram.ui.Cells.i9 i9Var2 = i9Var;
                                    i9Var2.setText(d);
                                    org.telegram.ui.ActionBar.f7.V(i9Var2.getTextView(), org.telegram.ui.ActionBar.y6.f23596q7, u6Var2);
                                    int[] iArr3 = iArr2;
                                    int i13 = -iArr3[0];
                                    iArr3[0] = i13;
                                    AndroidUtilities.shakeViewSpring(i9Var2, i13);
                                } else if ("BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text)) {
                                    MessagesController messagesController2 = MessagesController.getInstance(i12);
                                    boolean isPremium = UserConfig.getInstance(i12).isPremium();
                                    wc wcVar = new wc(k3Var2.topBulletinContainer, u6Var2);
                                    int i14 = R.raw.error;
                                    String string = LocaleController.getString(R.string.CreateManagedBotLimitTitle);
                                    if (isPremium) {
                                        formatString = LocaleController.formatString(R.string.CreateManagedBotLimitText, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get()));
                                    } else {
                                        formatString = LocaleController.formatString(R.string.CreateManagedBotLimitTextPremium, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get()), Integer.valueOf(messagesController2.config.botsCreateLimitDefault.get()));
                                    }
                                    SpannableStringBuilder replaceSingleLink = AndroidUtilities.replaceSingleLink(formatString, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Gi, u6Var2), new bq(k3Var2, 3));
                                    so soVar = new so(3, k3Var2, context);
                                    if (replaceSingleLink == null) {
                                        replaceSingleLink = new SpannableStringBuilder(replaceSingleLink);
                                    }
                                    int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(replaceSingleLink, "@BotFather");
                                    if (charSequenceIndexOf >= 0) {
                                        replaceSingleLink.setSpan(new org.telegram.ui.Cells.i(u6Var2, soVar, 6), charSequenceIndexOf, charSequenceIndexOf + 10, 33);
                                    }
                                    qc M = wcVar.M(string, replaceSingleLink, i14);
                                    M.f31887j = 8000;
                                    M.j();
                                } else {
                                    String str4 = tL_error.text;
                                    if (str4 != null && str4.startsWith("FLOOD_WAIT_")) {
                                        new wc(k3Var2.topBulletinContainer, u6Var2).M(LocaleController.getString(R.string.CreateManagedBotLimitTitle), LocaleController.formatString(R.string.CreateManagedBotLimitTextTime, LocaleController.formatDuration(Integer.parseInt(tL_error.text.substring(11)))), R.raw.error).j();
                                    } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                                        TLRPC.User user3 = user;
                                        if (!TextUtils.isEmpty(UserObject.getPublicUsername(user3))) {
                                            userName = "@" + UserObject.getPublicUsername(user3);
                                        } else {
                                            userName = UserObject.getUserName(user3);
                                        }
                                        new wc(k3Var2.topBulletinContainer, u6Var2).R(R.raw.error, 36, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, userName), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Gi, u6Var2))).j();
                                    } else {
                                        org.telegram.ui.d3.t(k3Var2.topBulletinContainer, u6Var2, tL_error, false);
                                    }
                                }
                                AndroidUtilities.hideKeyboard(k3Var2.getCurrentFocus());
                            }
                        }
                    }
                }, 1024);
            }
        }
    }
}
