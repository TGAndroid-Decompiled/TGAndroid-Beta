package org.telegram.ui;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class jj0 extends org.telegram.ui.Components.sa {
    public static jj0 f35297r0;
    public final hj0 U;
    public final gj0 V;
    public final eg.h0 W;
    public final fj0 X;
    public final ArrayList Y;
    public final ArrayList Z;
    public final HashSet f35298a0;
    public final ArrayList f35299b0;
    public final ArrayList f35300c0;
    public final HashMap f35301d0;
    public final ArrayList f35302e0;
    public final LinkedHashMap f35303f0;
    public String f35304g0;
    public hg.h f35305h0;
    public int f35306i0;
    public int f35307j0;
    public float f35308k0;
    public gg.o2 f35309l0;
    public final int m0;
    public final ij0 f35310n0;
    public final Boolean f35311o0;
    public final Boolean f35312p0;
    public final b6 f35313q0;

    public jj0(org.telegram.ui.ActionBar.p2 p2Var, int i10, Boolean bool, Boolean bool2, ij0 ij0Var) {
        super(p2Var.getParentActivity(), p2Var, true, false, false, 1, p2Var.getResourceProvider());
        this.Y = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.Z = arrayList;
        HashSet hashSet = new HashSet();
        this.f35298a0 = hashSet;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.f35299b0 = arrayList3;
        this.f35300c0 = new ArrayList();
        HashMap hashMap = new HashMap();
        this.f35301d0 = hashMap;
        ArrayList arrayList4 = new ArrayList();
        this.f35302e0 = arrayList4;
        this.f35303f0 = new LinkedHashMap();
        this.f35306i0 = AndroidUtilities.dp(120.0f);
        this.f35307j0 = -1;
        this.f35313q0 = new b6(this, 11);
        this.m0 = i10;
        this.f35311o0 = bool;
        this.f35312p0 = bool2;
        this.f35310n0 = ij0Var;
        this.e.setTitle(y());
        ?? dVar = new kg.d(getContext(), this.resourcesProvider);
        this.X = dVar;
        dVar.setOnCloseClickListener(new dj0(this, 0));
        dVar.setText(y());
        dVar.setCloseImageVisible(false);
        dVar.e.c(0.0f, false);
        this.f35309l0 = new gg.o2(this, 2);
        gj0 gj0Var = new gj0(this, getContext(), this.resourcesProvider);
        this.V = gj0Var;
        int i11 = org.telegram.ui.ActionBar.j6.f19952h5;
        gj0Var.setBackgroundColor(getThemedColor(i11));
        gj0Var.setOnSearchTextChange(new y3(this, 10));
        gj0Var.f10546b.setHintText(LocaleController.getString(R.string.Search), false);
        eg.h0 h0Var = new eg.h0(this, getContext(), 26);
        this.W = h0Var;
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.addView((View) dVar, 0, k7.b6.f(-2.0f, 55, i12, 0, i12, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup2.addView(gj0Var, k7.b6.f(-2.0f, 55, i13, 0, i13, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup3.addView(h0Var, k7.b6.f(1.0f, 55, i14, 0, i14, 0));
        kg.a aVar = new kg.a(getContext(), this.resourcesProvider, (org.telegram.ui.Components.rl0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        aVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i11, this.resourcesProvider));
        hj0 hj0Var = new hj0(this, getContext(), this.resourcesProvider);
        this.U = hj0Var;
        hj0Var.setOnClickListener(new ej0(this, 0));
        aVar.addView(hj0Var, k7.b6.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup4.addView(aVar, k7.b6.f(-2.0f, 87, i15, 0, i15, 0));
        hg.h hVar = this.f35305h0;
        org.telegram.ui.Components.rl0 rl0Var = this.d;
        hVar.h = arrayList;
        hVar.f7085f = rl0Var;
        int i16 = this.backgroundPaddingLeft;
        rl0Var.setPadding(i16, 0, i16, AndroidUtilities.dp(60.0f));
        this.d.j(new n3(this, 21));
        this.d.setOnItemClickListener(new gg.m2(this, i10, 14));
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.mr.h);
        lVar.C = false;
        lVar.f5807m = false;
        this.d.setItemAnimator(lVar);
        this.d.i(new gg.e2(this, 6));
        gj0Var.setText("");
        gj0Var.d.b(false);
        gj0Var.b(false, hashSet, new dj0(this, 1), null);
        dVar.setText(y());
        S(false);
        arrayList2.addAll(ContactsController.getInstance(this.currentAccount).contacts);
        hashMap.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
        arrayList4.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
        arrayList3.addAll(MediaDataController.getInstance(this.currentAccount).hints);
        if (bool != null && bool.booleanValue()) {
            arrayList3.addAll(MediaDataController.getInstance(this.currentAccount).webapps);
        }
        U(false, true);
        fixNavigationBar();
    }

    public static void P(jj0 jj0Var, int i10, View view) {
        gj0 gj0Var = jj0Var.V;
        HashSet hashSet = jj0Var.f35298a0;
        if (view instanceof kg.n) {
            TLRPC.User user = ((kg.n) view).getUser();
            long j10 = user.f19306id;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                jj0Var.f35303f0.put(Long.valueOf(j10), user);
            }
            if (hashSet.size() == i10 + 1) {
                hashSet.remove(Long.valueOf(j10));
                new org.telegram.ui.Components.qc(jj0Var.container, jj0Var.resourcesProvider).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralString("BotMultiContactsSelectorLimit", jj0Var.m0, new Object[0])).k(true);
                try {
                    jj0Var.container.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            gj0Var.b(true, hashSet, new dj0(jj0Var, 2), null);
            jj0Var.U(true, false);
            if (!TextUtils.isEmpty(jj0Var.f35304g0)) {
                jj0Var.f35304g0 = null;
                gj0Var.setText("");
                AndroidUtilities.cancelRunOnUIThread(jj0Var.f35313q0);
                jj0Var.T(true, true);
            }
        }
    }

    public static void Q(jj0 jj0Var, String str) {
        TLRPC.User user;
        boolean z4 = true;
        if (jj0Var.f35307j0 >= 0) {
            ConnectionsManager.getInstance(jj0Var.currentAccount).cancelRequest(jj0Var.f35307j0, true);
            jj0Var.f35307j0 = -1;
        }
        Boolean bool = jj0Var.f35311o0;
        z4 = (bool == null || !bool.booleanValue()) ? false : false;
        org.telegram.ui.Components.vk vkVar = new org.telegram.ui.Components.vk(16, jj0Var, str);
        int i10 = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        ArrayList<TLRPC.TL_contact> arrayList2 = ContactsController.getInstance(i10).contacts;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            ContactsController.getInstance(i10).loadContacts(false, 0L);
        }
        MessagesController messagesController = MessagesController.getInstance(i10);
        String lowerCase = str.toLowerCase();
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        if (arrayList2 != null) {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TLRPC.TL_contact tL_contact = arrayList2.get(i11);
                if (tL_contact != null && (user = messagesController.getUser(Long.valueOf(tL_contact.user_id))) != null && ((z4 || !user.bot) && !UserObject.isService(user.f19306id) && !UserObject.isUserSelf(user))) {
                    String lowerCase2 = UserObject.getUserName(user).toLowerCase();
                    String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase) && !org.telegram.messenger.y3.w(" ", lowerCase, lowerCase2) && !translitSafe2.startsWith(translitSafe) && !org.telegram.messenger.y3.w(" ", translitSafe, translitSafe2)) {
                        if (user.usernames != null) {
                            for (int i12 = 0; i12 < user.usernames.size(); i12++) {
                                TLRPC.TL_username tL_username = user.usernames.get(i12);
                                if (tL_username != null && tL_username.active) {
                                    String lowerCase3 = tL_username.username.toLowerCase();
                                    if (lowerCase3.startsWith(lowerCase) || org.telegram.messenger.y3.w("_", lowerCase, lowerCase3) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, lowerCase3)) {
                                        arrayList.add(user);
                                        break;
                                    }
                                }
                            }
                        } else {
                            String str2 = user.username;
                            if (str2 != null) {
                                String lowerCase4 = str2.toLowerCase();
                                if (lowerCase4.startsWith(lowerCase) || org.telegram.messenger.y3.w("_", lowerCase, lowerCase4) || lowerCase4.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, lowerCase4)) {
                                    arrayList.add(user);
                                }
                            }
                        }
                    } else {
                        arrayList.add(user);
                    }
                }
            }
        }
        vkVar.run(arrayList);
    }

    @Override
    public final void C(Canvas canvas, int i10) {
        fj0 fj0Var = this.X;
        fj0Var.setTranslationY(Math.max(i10, (((fj0Var.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + AndroidUtilities.statusBarHeight) + AndroidUtilities.dp(8.0f));
        float translationY = fj0Var.getTranslationY() + fj0Var.getMeasuredHeight();
        gj0 gj0Var = this.V;
        gj0Var.setTranslationY(translationY);
        float translationY2 = gj0Var.getTranslationY() + gj0Var.getMeasuredHeight();
        eg.h0 h0Var = this.W;
        h0Var.setTranslationY(translationY2);
        int measuredHeight = gj0Var.getMeasuredHeight() + fj0Var.getMeasuredHeight();
        this.d.setTranslationY((h0Var.getMeasuredHeight() + measuredHeight) - AndroidUtilities.dp(8.0f));
    }

    public final boolean R(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        Boolean bool = this.f35311o0;
        if (bool != null && UserObject.isBot(user) != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = this.f35312p0;
        if (bool2 != null && user.premium != bool2.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void S(boolean z4) {
        int i10;
        hj0 hj0Var = this.U;
        hj0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        HashSet hashSet = this.f35298a0;
        if (hashSet.size() == 0) {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.f35309l0, 0, 1, 33);
            Boolean bool = this.f35311o0;
            if (bool != null && bool.booleanValue()) {
                if (this.m0 > 1) {
                    i10 = R.string.ChooseBots;
                } else {
                    i10 = R.string.ChooseBot;
                }
                spannableStringBuilder.append((CharSequence) LocaleController.getString(i10));
            } else {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ChooseUsers));
            }
        } else {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GiftPremiumProceedBtn));
        }
        hj0Var.c(hashSet.size(), true);
        hj0Var.g(spannableStringBuilder, z4, false);
        hj0Var.setEnabled(true);
    }

    public final void T(boolean z4, boolean z10) {
        int i10;
        float f10;
        int i11;
        ArrayList arrayList;
        ArrayList<TLRPC.Dialog> arrayList2;
        hg.h hVar;
        ArrayList arrayList3 = this.Y;
        arrayList3.clear();
        ArrayList arrayList4 = this.Z;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f35304g0);
        HashSet hashSet = this.f35298a0;
        if (!isEmpty) {
            ArrayList arrayList5 = this.f35300c0;
            int size = arrayList5.size();
            i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList5.get(i12);
                i12++;
                TLRPC.User user = (TLRPC.User) obj;
                i11 += AndroidUtilities.dp(56.0f);
                arrayList4.add(hg.g.c(user, hashSet.contains(Long.valueOf(user.f19306id))));
            }
        } else {
            ArrayList arrayList6 = this.f35299b0;
            if (!arrayList6.isEmpty()) {
                ArrayList arrayList7 = new ArrayList();
                int size2 = arrayList6.size();
                i10 = 0;
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList6.get(i13);
                    i13++;
                    TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TLRPC.TL_topPeer) obj2).peer.user_id));
                    if (!user2.self && !user2.bot && !UserObject.isService(user2.f19306id) && !UserObject.isDeleted(user2) && R(user2)) {
                        i10 += AndroidUtilities.dp(56.0f);
                        arrayList7.add(hg.g.c(user2, hashSet.contains(Long.valueOf(user2.f19306id))));
                    }
                }
                if (!arrayList7.isEmpty()) {
                    i10 += AndroidUtilities.dp(32.0f);
                    arrayList4.add(hg.g.b(LocaleController.getString(R.string.GiftPremiumFrequentContacts)));
                    arrayList4.addAll(arrayList7);
                }
            } else {
                i10 = 0;
            }
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            Boolean bool = this.f35311o0;
            if (bool != null && bool.booleanValue()) {
                ArrayList arrayList8 = new ArrayList();
                ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(this.currentAccount).getAllDialogs();
                int size3 = allDialogs.size();
                int i14 = 0;
                while (i14 < size3) {
                    TLRPC.Dialog dialog = allDialogs.get(i14);
                    i14++;
                    TLRPC.Dialog dialog2 = dialog;
                    int i15 = size3;
                    if (dialog2.f19163id < 0) {
                        arrayList2 = allDialogs;
                    } else {
                        arrayList2 = allDialogs;
                        TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog2.f19163id));
                        if (R(user3)) {
                            i10 += AndroidUtilities.dp(56.0f);
                            arrayList8.add(hg.g.c(user3, hashSet.contains(Long.valueOf(user3.f19306id))));
                        }
                    }
                    size3 = i15;
                    allDialogs = arrayList2;
                }
                f10 = 32.0f;
                if (!arrayList8.isEmpty()) {
                    i10 += AndroidUtilities.dp(32.0f);
                    arrayList4.add(hg.g.b(LocaleController.getString(R.string.SearchApps)));
                    arrayList4.addAll(arrayList8);
                }
            } else {
                f10 = 32.0f;
            }
            ArrayList arrayList9 = this.f35302e0;
            int size4 = arrayList9.size();
            i11 = i10;
            int i16 = 0;
            while (i16 < size4) {
                Object obj3 = arrayList9.get(i16);
                i16++;
                String str = (String) obj3;
                ArrayList arrayList10 = new ArrayList();
                List<TLRPC.TL_contact> list = (List) this.f35301d0.get(str);
                if (list != null) {
                    for (TLRPC.TL_contact tL_contact : list) {
                        String str2 = str;
                        if (tL_contact.user_id == clientUserId) {
                            arrayList = arrayList9;
                        } else {
                            arrayList = arrayList9;
                            TLRPC.User user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
                            if (R(user4)) {
                                i11 += AndroidUtilities.dp(56.0f);
                                arrayList10.add(hg.g.c(user4, hashSet.contains(Long.valueOf(user4.f19306id))));
                                size4 = size4;
                                arrayList9 = arrayList;
                                str = str2;
                                i16 = i16;
                            }
                        }
                        arrayList9 = arrayList;
                        str = str2;
                    }
                    int i17 = size4;
                    int i18 = i16;
                    String str3 = str;
                    ArrayList arrayList11 = arrayList9;
                    if (!arrayList10.isEmpty()) {
                        String upperCase = str3.toUpperCase();
                        hg.g gVar = new hg.g(7, false);
                        gVar.f7074g = upperCase;
                        arrayList4.add(gVar);
                        arrayList4.addAll(arrayList10);
                        i11 = AndroidUtilities.dp(f10) + i11;
                    }
                    size4 = i17;
                    arrayList9 = arrayList11;
                    i16 = i18;
                }
            }
        }
        if (arrayList4.isEmpty()) {
            arrayList4.add(new hg.g(5, false));
            i11 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i11);
        hg.g gVar2 = new hg.g(-1, false);
        gVar2.f7078l = max;
        arrayList4.add(gVar2);
        if (hashSet != null) {
            if (hashSet.size() > 0) {
                hg.h hVar2 = this.f35305h0;
                ej0 ej0Var = new ej0(this, 1);
                org.telegram.ui.Cells.t3 t3Var = hVar2.f7088s;
                if (t3Var != null) {
                    t3Var.b(LocaleController.getString(R.string.UsersDeselectAll), ej0Var);
                }
            } else {
                org.telegram.ui.Cells.t3 t3Var2 = this.f35305h0.f7088s;
                if (t3Var2 != null) {
                    t3Var2.setRightText(null);
                }
            }
        }
        if (z10 && (hVar = this.f35305h0) != null) {
            if (z4) {
                hVar.E(arrayList3, arrayList4);
            } else {
                hVar.l();
            }
        }
    }

    public final void U(boolean z4, boolean z10) {
        int R;
        T(z4, z10);
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.rl0 rl0Var = this.d;
            if (i10 >= rl0Var.getChildCount()) {
                break;
            }
            View childAt = rl0Var.getChildAt(i10);
            if ((childAt instanceof kg.n) && (R = RecyclerView.R(childAt)) > 0) {
                if (i11 == -1) {
                    i11 = R;
                }
                int i13 = R - 1;
                if (i13 >= 0) {
                    ArrayList arrayList = this.Z;
                    if (i13 < arrayList.size()) {
                        hg.g gVar = (hg.g) arrayList.get(i13);
                        kg.n nVar = (kg.n) childAt;
                        nVar.c(gVar.f7077k, z4);
                        TLRPC.Chat chat = gVar.e;
                        float f10 = 1.0f;
                        if (chat != null) {
                            if (this.f35305h0.F(chat) > 200) {
                                f10 = 0.3f;
                            }
                            nVar.i(f10, z4);
                        } else {
                            nVar.i(1.0f, z4);
                        }
                    }
                }
                i12 = R;
            }
            i10++;
        }
        if (z4) {
            this.f35305h0.q(0, i11);
            hg.h hVar = this.f35305h0;
            hVar.q(i12, hVar.h() - i12);
        }
        S(z4);
    }

    @Override
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.V.getEditText());
        super.dismiss();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        f35297r0 = null;
        AndroidUtilities.cancelRunOnUIThread(this.f35313q0);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        T(false, true);
    }

    @Override
    public final org.telegram.ui.Components.ql0 v(org.telegram.ui.Components.rl0 rl0Var) {
        hg.h hVar = new hg.h(getContext(), this.resourcesProvider, true);
        this.f35305h0 = hVar;
        hVar.f7087r = true;
        return hVar;
    }

    @Override
    public final CharSequence y() {
        int i10;
        Boolean bool = this.f35311o0;
        if (bool != null && bool.booleanValue()) {
            if (this.m0 > 1) {
                i10 = R.string.ChooseBots;
            } else {
                i10 = R.string.ChooseBot;
            }
            return LocaleController.getString(i10);
        }
        return LocaleController.getString(R.string.ChooseUsers);
    }
}
