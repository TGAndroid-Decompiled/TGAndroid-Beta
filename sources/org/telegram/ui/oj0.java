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
public final class oj0 extends org.telegram.ui.Components.cb {
    public static oj0 f39205u0;
    public final mj0 X;
    public final lj0 Y;
    public final n20 Z;
    public final kj0 f39206a0;
    public final ArrayList f39207b0;
    public final ArrayList f39208c0;
    public final HashSet f39209d0;
    public final ArrayList f39210e0;
    public final ArrayList f39211f0;
    public final HashMap f39212g0;
    public final ArrayList f39213h0;
    public final LinkedHashMap f39214i0;
    public String f39215j0;
    public ug.h f39216k0;
    public int f39217l0;
    public int m0;
    public float f39218n0;
    public org.telegram.ui.Components.fb0 f39219o0;
    public final int f39220p0;
    public final nj0 f39221q0;
    public final Boolean f39222r0;
    public final Boolean f39223s0;
    public final x5 f39224t0;

    public oj0(org.telegram.ui.ActionBar.n2 n2Var, int i10, Boolean bool, Boolean bool2, nj0 nj0Var) {
        super(n2Var, true, false, n2Var.getResourceProvider());
        this.f39207b0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f39208c0 = arrayList;
        HashSet hashSet = new HashSet();
        this.f39209d0 = hashSet;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.f39210e0 = arrayList3;
        this.f39211f0 = new ArrayList();
        HashMap hashMap = new HashMap();
        this.f39212g0 = hashMap;
        ArrayList arrayList4 = new ArrayList();
        this.f39213h0 = arrayList4;
        this.f39214i0 = new LinkedHashMap();
        this.f39217l0 = AndroidUtilities.dp(120.0f);
        this.m0 = -1;
        this.f39224t0 = new x5(this, 11);
        this.f39220p0 = i10;
        this.f39222r0 = bool;
        this.f39223s0 = bool2;
        this.f39221q0 = nj0Var;
        this.f25302e.setTitle(y());
        ?? cVar = new xg.c(getContext(), this.resourcesProvider);
        this.f39206a0 = cVar;
        cVar.setOnCloseClickListener(new ij0(this, 0));
        cVar.setText(y());
        cVar.setCloseImageVisible(false);
        cVar.f49837e.c(0.0f, false);
        this.f39219o0 = new org.telegram.ui.Components.fb0(this, 1);
        lj0 lj0Var = new lj0(this, getContext(), this.resourcesProvider);
        this.Y = lj0Var;
        int i11 = org.telegram.ui.ActionBar.i6.f20890h5;
        lj0Var.setBackgroundColor(getThemedColor(i11));
        lj0Var.setOnSearchTextChange(new t3(this, 12));
        lj0Var.f49852b.setHintText(LocaleController.getString(R.string.Search), false);
        n20 n20Var = new n20(this, getContext(), 2);
        this.Z = n20Var;
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.addView((View) cVar, 0, w7.z5.f(-2.0f, 55, i12, 0, i12, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup2.addView(lj0Var, w7.z5.f(-2.0f, 55, i13, 0, i13, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup3.addView(n20Var, w7.z5.f(1.0f, 55, i14, 0, i14, 0));
        o20 o20Var = new o20(getContext(), this.resourcesProvider, (org.telegram.ui.Components.zl0) null);
        o20Var.setClickable(true);
        o20Var.setOrientation(1);
        o20Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        o20Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i11, this.resourcesProvider));
        mj0 mj0Var = new mj0(this, getContext(), this.resourcesProvider);
        this.X = mj0Var;
        mj0Var.setOnClickListener(new jj0(this, 0));
        o20Var.addView(mj0Var, w7.z5.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup4.addView(o20Var, w7.z5.f(-2.0f, 87, i15, 0, i15, 0));
        ug.h hVar = this.f39216k0;
        org.telegram.ui.Components.zl0 zl0Var = this.d;
        hVar.f47670n = arrayList;
        hVar.f47669f = zl0Var;
        int i16 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i16, 0, i16, AndroidUtilities.dp(60.0f));
        this.d.j(new i3(this, 22));
        this.d.setOnItemClickListener(new i2.s(this, i10, 15));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.tr.h);
        jVar.C = false;
        jVar.f46563m = false;
        this.d.setItemAnimator(jVar);
        this.d.i(new ci.r1(this, 6));
        lj0Var.setText("");
        lj0Var.d.b(false);
        lj0Var.b(false, hashSet, new ij0(this, 1), null);
        cVar.setText(y());
        Q(false);
        arrayList2.addAll(ContactsController.getInstance(this.currentAccount).contacts);
        hashMap.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
        arrayList4.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
        arrayList3.addAll(MediaDataController.getInstance(this.currentAccount).hints);
        if (bool != null && bool.booleanValue()) {
            arrayList3.addAll(MediaDataController.getInstance(this.currentAccount).webapps);
        }
        S(false, true);
        fixNavigationBar();
    }

    public static void N(oj0 oj0Var, int i10, View view) {
        lj0 lj0Var = oj0Var.Y;
        HashSet hashSet = oj0Var.f39209d0;
        if (view instanceof xg.l) {
            TLRPC.User user = ((xg.l) view).getUser();
            long j3 = user.f20185id;
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                oj0Var.f39214i0.put(Long.valueOf(j3), user);
            }
            if (hashSet.size() == i10 + 1) {
                hashSet.remove(Long.valueOf(j3));
                new org.telegram.ui.Components.yc(oj0Var.container, oj0Var.resourcesProvider).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralString("BotMultiContactsSelectorLimit", oj0Var.f39220p0, new Object[0])).k(true);
                try {
                    oj0Var.container.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            lj0Var.b(true, hashSet, new ij0(oj0Var, 2), null);
            oj0Var.S(true, false);
            if (!TextUtils.isEmpty(oj0Var.f39215j0)) {
                oj0Var.f39215j0 = null;
                lj0Var.setText("");
                AndroidUtilities.cancelRunOnUIThread(oj0Var.f39224t0);
                oj0Var.R(true, true);
            }
        }
    }

    public static void O(oj0 oj0Var, String str) {
        TLRPC.User user;
        boolean z10 = true;
        if (oj0Var.m0 >= 0) {
            ConnectionsManager.getInstance(oj0Var.currentAccount).cancelRequest(oj0Var.m0, true);
            oj0Var.m0 = -1;
        }
        Boolean bool = oj0Var.f39222r0;
        z10 = (bool == null || !bool.booleanValue()) ? false : false;
        ft ftVar = new ft(6, oj0Var, str);
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
                if (tL_contact != null && (user = messagesController.getUser(Long.valueOf(tL_contact.user_id))) != null && ((z10 || !user.bot) && !UserObject.isService(user.f20185id) && !UserObject.isUserSelf(user))) {
                    String lowerCase2 = UserObject.getUserName(user).toLowerCase();
                    String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase) && !org.telegram.messenger.f0.w(" ", lowerCase, lowerCase2) && !translitSafe2.startsWith(translitSafe) && !org.telegram.messenger.f0.w(" ", translitSafe, translitSafe2)) {
                        if (user.usernames != null) {
                            for (int i12 = 0; i12 < user.usernames.size(); i12++) {
                                TLRPC.TL_username tL_username = user.usernames.get(i12);
                                if (tL_username != null && tL_username.active) {
                                    String lowerCase3 = tL_username.username.toLowerCase();
                                    if (lowerCase3.startsWith(lowerCase) || org.telegram.messenger.f0.w("_", lowerCase, lowerCase3) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.f0.w(" ", translitSafe, lowerCase3)) {
                                        arrayList.add(user);
                                        break;
                                    }
                                }
                            }
                        } else {
                            String str2 = user.username;
                            if (str2 != null) {
                                String lowerCase4 = str2.toLowerCase();
                                if (lowerCase4.startsWith(lowerCase) || org.telegram.messenger.f0.w("_", lowerCase, lowerCase4) || lowerCase4.startsWith(translitSafe) || org.telegram.messenger.f0.w(" ", translitSafe, lowerCase4)) {
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
        ftVar.run(arrayList);
    }

    @Override
    public final void B(Canvas canvas, int i10) {
        kj0 kj0Var = this.f39206a0;
        kj0Var.setTranslationY(Math.max(i10, (((kj0Var.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + AndroidUtilities.statusBarHeight) + AndroidUtilities.dp(8.0f));
        float translationY = kj0Var.getTranslationY() + kj0Var.getMeasuredHeight();
        lj0 lj0Var = this.Y;
        lj0Var.setTranslationY(translationY);
        float translationY2 = lj0Var.getTranslationY() + lj0Var.getMeasuredHeight();
        n20 n20Var = this.Z;
        n20Var.setTranslationY(translationY2);
        int measuredHeight = lj0Var.getMeasuredHeight() + kj0Var.getMeasuredHeight();
        this.d.setTranslationY((n20Var.getMeasuredHeight() + measuredHeight) - AndroidUtilities.dp(8.0f));
    }

    public final boolean P(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        Boolean bool = this.f39222r0;
        if (bool != null && UserObject.isBot(user) != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = this.f39223s0;
        if (bool2 != null && user.premium != bool2.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void Q(boolean z10) {
        int i10;
        mj0 mj0Var = this.X;
        mj0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        HashSet hashSet = this.f39209d0;
        if (hashSet.size() == 0) {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.f39219o0, 0, 1, 33);
            Boolean bool = this.f39222r0;
            if (bool != null && bool.booleanValue()) {
                if (this.f39220p0 > 1) {
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
        mj0Var.b(hashSet.size(), true);
        mj0Var.g(spannableStringBuilder, z10, false);
        mj0Var.setEnabled(true);
    }

    public final void R(boolean z10, boolean z11) {
        int i10;
        float f7;
        int i11;
        ArrayList arrayList;
        ArrayList<TLRPC.Dialog> arrayList2;
        ug.h hVar;
        ArrayList arrayList3 = this.f39207b0;
        arrayList3.clear();
        ArrayList arrayList4 = this.f39208c0;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f39215j0);
        HashSet hashSet = this.f39209d0;
        if (!isEmpty) {
            ArrayList arrayList5 = this.f39211f0;
            int size = arrayList5.size();
            i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList5.get(i12);
                i12++;
                TLRPC.User user = (TLRPC.User) obj;
                i11 += AndroidUtilities.dp(56.0f);
                arrayList4.add(ug.g.c(user, hashSet.contains(Long.valueOf(user.f20185id))));
            }
        } else {
            ArrayList arrayList6 = this.f39210e0;
            if (!arrayList6.isEmpty()) {
                ArrayList arrayList7 = new ArrayList();
                int size2 = arrayList6.size();
                i10 = 0;
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList6.get(i13);
                    i13++;
                    TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TLRPC.TL_topPeer) obj2).peer.user_id));
                    if (!user2.self && !user2.bot && !UserObject.isService(user2.f20185id) && !UserObject.isDeleted(user2) && P(user2)) {
                        i10 += AndroidUtilities.dp(56.0f);
                        arrayList7.add(ug.g.c(user2, hashSet.contains(Long.valueOf(user2.f20185id))));
                    }
                }
                if (!arrayList7.isEmpty()) {
                    i10 += AndroidUtilities.dp(32.0f);
                    arrayList4.add(ug.g.b(LocaleController.getString(R.string.GiftPremiumFrequentContacts)));
                    arrayList4.addAll(arrayList7);
                }
            } else {
                i10 = 0;
            }
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            Boolean bool = this.f39222r0;
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
                    if (dialog2.f20042id < 0) {
                        arrayList2 = allDialogs;
                    } else {
                        arrayList2 = allDialogs;
                        TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog2.f20042id));
                        if (P(user3)) {
                            i10 += AndroidUtilities.dp(56.0f);
                            arrayList8.add(ug.g.c(user3, hashSet.contains(Long.valueOf(user3.f20185id))));
                        }
                    }
                    size3 = i15;
                    allDialogs = arrayList2;
                }
                f7 = 32.0f;
                if (!arrayList8.isEmpty()) {
                    i10 += AndroidUtilities.dp(32.0f);
                    arrayList4.add(ug.g.b(LocaleController.getString(R.string.SearchApps)));
                    arrayList4.addAll(arrayList8);
                }
            } else {
                f7 = 32.0f;
            }
            ArrayList arrayList9 = this.f39213h0;
            int size4 = arrayList9.size();
            i11 = i10;
            int i16 = 0;
            while (i16 < size4) {
                Object obj3 = arrayList9.get(i16);
                i16++;
                String str = (String) obj3;
                ArrayList arrayList10 = new ArrayList();
                List<TLRPC.TL_contact> list = (List) this.f39212g0.get(str);
                if (list != null) {
                    for (TLRPC.TL_contact tL_contact : list) {
                        String str2 = str;
                        if (tL_contact.user_id == clientUserId) {
                            arrayList = arrayList9;
                        } else {
                            arrayList = arrayList9;
                            TLRPC.User user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
                            if (P(user4)) {
                                i11 += AndroidUtilities.dp(56.0f);
                                arrayList10.add(ug.g.c(user4, hashSet.contains(Long.valueOf(user4.f20185id))));
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
                        ug.g gVar = new ug.g(7, false);
                        gVar.f47657g = upperCase;
                        arrayList4.add(gVar);
                        arrayList4.addAll(arrayList10);
                        i11 = AndroidUtilities.dp(f7) + i11;
                    }
                    size4 = i17;
                    arrayList9 = arrayList11;
                    i16 = i18;
                }
            }
        }
        if (arrayList4.isEmpty()) {
            arrayList4.add(new ug.g(5, false));
            i11 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i11);
        ug.g gVar2 = new ug.g(-1, false);
        gVar2.f47661l = max;
        arrayList4.add(gVar2);
        if (hashSet != null) {
            if (hashSet.size() > 0) {
                ug.h hVar2 = this.f39216k0;
                jj0 jj0Var = new jj0(this, 1);
                org.telegram.ui.Cells.v3 v3Var = hVar2.v;
                if (v3Var != null) {
                    v3Var.b(LocaleController.getString(R.string.UsersDeselectAll), jj0Var);
                }
            } else {
                org.telegram.ui.Cells.v3 v3Var2 = this.f39216k0.v;
                if (v3Var2 != null) {
                    v3Var2.setRightText(null);
                }
            }
        }
        if (z11 && (hVar = this.f39216k0) != null) {
            if (z10) {
                hVar.E(arrayList3, arrayList4);
            } else {
                hVar.l();
            }
        }
    }

    public final void S(boolean z10, boolean z11) {
        int R;
        R(z10, z11);
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.zl0 zl0Var = this.d;
            if (i10 >= zl0Var.getChildCount()) {
                break;
            }
            View childAt = zl0Var.getChildAt(i10);
            if ((childAt instanceof xg.l) && (R = RecyclerView.R(childAt)) > 0) {
                if (i11 == -1) {
                    i11 = R;
                }
                int i13 = R - 1;
                if (i13 >= 0) {
                    ArrayList arrayList = this.f39208c0;
                    if (i13 < arrayList.size()) {
                        ug.g gVar = (ug.g) arrayList.get(i13);
                        xg.l lVar = (xg.l) childAt;
                        lVar.c(gVar.f47660k, z10);
                        TLRPC.Chat chat = gVar.f47655e;
                        float f7 = 1.0f;
                        if (chat != null) {
                            if (this.f39216k0.F(chat) > 200) {
                                f7 = 0.3f;
                            }
                            lVar.i(f7, z10);
                        } else {
                            lVar.i(1.0f, z10);
                        }
                    }
                }
                i12 = R;
            }
            i10++;
        }
        if (z10) {
            this.f39216k0.q(0, i11);
            ug.h hVar = this.f39216k0;
            hVar.q(i12, hVar.h() - i12);
        }
        Q(z10);
    }

    @Override
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.Y.getEditText());
        super.dismiss();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        f39205u0 = null;
        AndroidUtilities.cancelRunOnUIThread(this.f39224t0);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        R(false, true);
    }

    @Override
    public final org.telegram.ui.Components.yl0 v(org.telegram.ui.Components.zl0 zl0Var) {
        ug.h hVar = new ug.h(getContext(), this.resourcesProvider, true);
        this.f39216k0 = hVar;
        hVar.f47672s = true;
        return hVar;
    }

    @Override
    public final CharSequence y() {
        int i10;
        Boolean bool = this.f39222r0;
        if (bool != null && bool.booleanValue()) {
            if (this.f39220p0 > 1) {
                i10 = R.string.ChooseBots;
            } else {
                i10 = R.string.ChooseBot;
            }
            return LocaleController.getString(i10);
        }
        return LocaleController.getString(R.string.ChooseUsers);
    }
}
