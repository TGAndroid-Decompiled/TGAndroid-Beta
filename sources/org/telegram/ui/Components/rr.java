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
public final class rr implements Runnable {
    public final Utilities.Callback E;
    public final org.telegram.ui.ActionBar.e3 F;
    public final nd G;
    public final org.telegram.ui.ActionBar.d6 H;
    public final org.telegram.ui.Cells.e9 I;
    public final Context J;
    public final boolean[] f30610a;
    public final int[] f30611b;
    public final org.telegram.ui.Cells.j3 f30612c;
    public final TreeSet d;
    public final String[] f30613e;
    public final qr f30614f;
    public final org.telegram.ui.Cells.j3 h;
    public final int[] f30615n;
    public final ai.d9 f30616r;
    public final ci.d f30617s;
    public final boolean v;
    public final int f30618w;
    public final TLRPC.User f30619x;
    public final boolean[] f30620y;

    public rr(boolean[] zArr, int[] iArr, org.telegram.ui.Cells.j3 j3Var, TreeSet treeSet, String[] strArr, qr qrVar, org.telegram.ui.Cells.j3 j3Var2, int[] iArr2, ai.d9 d9Var, ci.d dVar, boolean z10, int i10, TLRPC.User user, boolean[] zArr2, Utilities.Callback callback, org.telegram.ui.ActionBar.e3 e3Var, nd ndVar, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Cells.e9 e9Var, Context context) {
        this.f30610a = zArr;
        this.f30611b = iArr;
        this.f30612c = j3Var;
        this.d = treeSet;
        this.f30613e = strArr;
        this.f30614f = qrVar;
        this.h = j3Var2;
        this.f30615n = iArr2;
        this.f30616r = d9Var;
        this.f30617s = dVar;
        this.v = z10;
        this.f30618w = i10;
        this.f30619x = user;
        this.f30620y = zArr2;
        this.E = callback;
        this.F = e3Var;
        this.G = ndVar;
        this.H = d6Var;
        this.I = e9Var;
        this.J = context;
    }

    @Override
    public final void run() {
        final org.telegram.ui.Cells.j3 j3Var = this.h;
        org.telegram.ui.Cells.h3 h3Var = j3Var.f22325b;
        final boolean[] zArr = this.f30610a;
        if (!zArr[0]) {
            final int[] iArr = this.f30611b;
            if (iArr[0] < 0) {
                final org.telegram.ui.Cells.j3 j3Var2 = this.f30612c;
                String charSequence = j3Var2.getText().toString();
                StringBuilder v = a1.g.v(charSequence);
                String str = "bot";
                boolean a2 = tr.a(charSequence, "bot");
                final TreeSet treeSet = this.d;
                v.append((a2 || tr.c(charSequence, treeSet) != null) ? "" : "");
                String sb2 = v.toString();
                final String[] strArr = this.f30613e;
                if (!TextUtils.equals(strArr[0], sb2)) {
                    this.f30614f.run();
                    return;
                }
                String trim = h3Var.getText().toString().trim();
                boolean isEmpty = TextUtils.isEmpty(trim);
                final int[] iArr2 = this.f30615n;
                if (isEmpty) {
                    int i10 = -iArr2[0];
                    iArr2[0] = i10;
                    AndroidUtilities.shakeViewSpring(j3Var, i10);
                    return;
                }
                this.f30616r.run();
                final ci.d dVar = this.f30617s;
                dVar.setLoading(true);
                dVar.setEnabled(false);
                h3Var.setEnabled(false);
                j3Var2.f22325b.setEnabled(false);
                final TL_bots.createBot createbot = new TL_bots.createBot();
                createbot.via_deeplink = this.v;
                createbot.username = strArr[0];
                createbot.name = trim;
                final int i11 = this.f30618w;
                MessagesController messagesController = MessagesController.getInstance(i11);
                final TLRPC.User user = this.f30619x;
                createbot.manager_id = messagesController.getInputUser(user);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                ?? obj = new Object();
                final boolean[] zArr2 = this.f30620y;
                final Utilities.Callback callback = this.E;
                final org.telegram.ui.ActionBar.e3 e3Var = this.F;
                final nd ndVar = this.G;
                final org.telegram.ui.ActionBar.d6 d6Var = this.H;
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
                            ci.d dVar2 = dVar;
                            dVar2.setLoading(false);
                            dVar2.setEnabled(true);
                            j3Var.f22325b.setEnabled(true);
                            j3Var2.f22325b.setEnabled(true);
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
                                nd ndVar2 = ndVar;
                                org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
                                CharSequence d = tr.d(i12, str2, treeSet2, str3, ndVar2, d6Var2);
                                if (d != null) {
                                    strArr[0] = null;
                                    dVar2.setEnabled(false);
                                    org.telegram.ui.Cells.e9 e9Var2 = e9Var;
                                    e9Var2.setText(d);
                                    e9Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21062q7, d6Var2));
                                    int[] iArr3 = iArr2;
                                    int i13 = -iArr3[0];
                                    iArr3[0] = i13;
                                    AndroidUtilities.shakeViewSpring(e9Var2, i13);
                                } else if ("BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text)) {
                                    MessagesController messagesController2 = MessagesController.getInstance(i12);
                                    boolean isPremium = UserConfig.getInstance(i12).isPremium();
                                    ad adVar = new ad(e3Var2.topBulletinContainer, d6Var2);
                                    int i14 = R.raw.error;
                                    String string = LocaleController.getString(R.string.CreateManagedBotLimitTitle);
                                    if (isPremium) {
                                        formatString = LocaleController.formatString(R.string.CreateManagedBotLimitText, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get()));
                                    } else {
                                        formatString = LocaleController.formatString(R.string.CreateManagedBotLimitTextPremium, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get()), Integer.valueOf(messagesController2.config.botsCreateLimitDefault.get()));
                                    }
                                    SpannableStringBuilder replaceSingleLink = AndroidUtilities.replaceSingleLink(formatString, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, d6Var2), new nq(e3Var2, 2));
                                    wc wcVar = new wc(27, e3Var2, context);
                                    if (replaceSingleLink == null) {
                                        replaceSingleLink = new SpannableStringBuilder(replaceSingleLink);
                                    }
                                    int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(replaceSingleLink, "@BotFather");
                                    if (charSequenceIndexOf >= 0) {
                                        replaceSingleLink.setSpan(new org.telegram.ui.Cells.i(d6Var2, wcVar, 6), charSequenceIndexOf, charSequenceIndexOf + 10, 33);
                                    }
                                    sc M = adVar.M(string, replaceSingleLink, i14);
                                    M.f30833j = 8000;
                                    M.j();
                                } else {
                                    String str4 = tL_error.text;
                                    if (str4 != null && str4.startsWith("FLOOD_WAIT_")) {
                                        new ad(e3Var2.topBulletinContainer, d6Var2).M(LocaleController.getString(R.string.CreateManagedBotLimitTitle), LocaleController.formatString(R.string.CreateManagedBotLimitTextTime, LocaleController.formatDuration(Integer.parseInt(tL_error.text.substring(11)))), R.raw.error).j();
                                    } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                                        TLRPC.User user3 = user;
                                        if (!TextUtils.isEmpty(UserObject.getPublicUsername(user3))) {
                                            userName = "@" + UserObject.getPublicUsername(user3);
                                        } else {
                                            userName = UserObject.getUserName(user3);
                                        }
                                        new ad(e3Var2.topBulletinContainer, d6Var2).Q(R.raw.error, 36, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, userName), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, d6Var2))).j();
                                    } else {
                                        org.telegram.ui.Cells.c1.p(e3Var2.topBulletinContainer, d6Var2, tL_error, false);
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
