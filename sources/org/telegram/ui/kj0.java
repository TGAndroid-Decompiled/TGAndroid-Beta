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
public final class kj0 extends org.telegram.ui.Components.bb {
    public static kj0 f35077u0;
    public final ij0 X;
    public final hj0 Y;
    public final n50 Z;
    public final gj0 f35078a0;
    public final ArrayList f35079b0;
    public final ArrayList f35080c0;
    public final HashSet f35081d0;
    public final ArrayList f35082e0;
    public final ArrayList f35083f0;
    public final HashMap f35084g0;
    public final ArrayList f35085h0;
    public final LinkedHashMap f35086i0;
    public String f35087j0;
    public ug.h f35088k0;
    public int f35089l0;
    public int m0;
    public float f35090n0;
    public org.telegram.ui.Components.eb0 f35091o0;
    public final int f35092p0;
    public final jj0 f35093q0;
    public final Boolean f35094r0;
    public final Boolean f35095s0;
    public final w5 f35096t0;

    public kj0(org.telegram.ui.ActionBar.m2 m2Var, int i10, Boolean bool, Boolean bool2, jj0 jj0Var) {
        super(m2Var, true, false, m2Var.getResourceProvider());
        this.f35079b0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f35080c0 = arrayList;
        HashSet hashSet = new HashSet();
        this.f35081d0 = hashSet;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.f35082e0 = arrayList3;
        this.f35083f0 = new ArrayList();
        HashMap hashMap = new HashMap();
        this.f35084g0 = hashMap;
        ArrayList arrayList4 = new ArrayList();
        this.f35085h0 = arrayList4;
        this.f35086i0 = new LinkedHashMap();
        this.f35089l0 = AndroidUtilities.dp(120.0f);
        this.m0 = -1;
        this.f35096t0 = new w5(this, 11);
        this.f35092p0 = i10;
        this.f35094r0 = bool;
        this.f35095s0 = bool2;
        this.f35093q0 = jj0Var;
        this.e.setTitle(y());
        ?? cVar = new xg.c(getContext(), this.resourcesProvider);
        this.f35078a0 = cVar;
        cVar.setOnCloseClickListener(new ej0(this, 0));
        cVar.setText(y());
        cVar.setCloseImageVisible(false);
        cVar.e.c(0.0f, false);
        this.f35091o0 = new org.telegram.ui.Components.eb0(this, 1);
        hj0 hj0Var = new hj0(this, getContext(), this.resourcesProvider);
        this.Y = hj0Var;
        int i11 = org.telegram.ui.ActionBar.h6.f19129h5;
        hj0Var.setBackgroundColor(getThemedColor(i11));
        hj0Var.setOnSearchTextChange(new t3(this, 12));
        hj0Var.f46050b.setHintText(LocaleController.getString(R.string.Search), false);
        n50 n50Var = new n50(this, getContext(), 1);
        this.Z = n50Var;
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.addView((View) cVar, 0, w7.y5.f(-2.0f, 55, i12, 0, i12, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup2.addView(hj0Var, w7.y5.f(-2.0f, 55, i13, 0, i13, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup3.addView(n50Var, w7.y5.f(1.0f, 55, i14, 0, i14, 0));
        j20 j20Var = new j20(getContext(), this.resourcesProvider, (org.telegram.ui.Components.xl0) null);
        j20Var.setClickable(true);
        j20Var.setOrientation(1);
        j20Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        j20Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(i11, this.resourcesProvider));
        ij0 ij0Var = new ij0(this, getContext(), this.resourcesProvider);
        this.X = ij0Var;
        ij0Var.setOnClickListener(new fj0(this, 0));
        j20Var.addView(ij0Var, w7.y5.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup4.addView(j20Var, w7.y5.f(-2.0f, 87, i15, 0, i15, 0));
        ug.h hVar = this.f35088k0;
        org.telegram.ui.Components.xl0 xl0Var = this.d;
        hVar.f44022n = arrayList;
        hVar.f44021f = xl0Var;
        int i16 = this.backgroundPaddingLeft;
        xl0Var.setPadding(i16, 0, i16, AndroidUtilities.dp(60.0f));
        this.d.j(new i3(this, 21));
        this.d.setOnItemClickListener(new i2.s(this, i10, 15));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.sr.h);
        jVar.C = false;
        jVar.f42994m = false;
        this.d.setItemAnimator(jVar);
        this.d.i(new ci.r1(this, 6));
        hj0Var.setText("");
        hj0Var.d.b(false);
        hj0Var.b(false, hashSet, new ej0(this, 1), null);
        cVar.setText(y());
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

    public static void P(kj0 kj0Var, int i10, View view) {
        hj0 hj0Var = kj0Var.Y;
        HashSet hashSet = kj0Var.f35081d0;
        if (view instanceof xg.l) {
            TLRPC.User user = ((xg.l) view).getUser();
            long j3 = user.f18482id;
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                kj0Var.f35086i0.put(Long.valueOf(j3), user);
            }
            if (hashSet.size() == i10 + 1) {
                hashSet.remove(Long.valueOf(j3));
                new org.telegram.ui.Components.xc(kj0Var.container, kj0Var.resourcesProvider).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralString("BotMultiContactsSelectorLimit", kj0Var.f35092p0, new Object[0])).k(true);
                try {
                    kj0Var.container.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            hj0Var.b(true, hashSet, new ej0(kj0Var, 2), null);
            kj0Var.U(true, false);
            if (!TextUtils.isEmpty(kj0Var.f35087j0)) {
                kj0Var.f35087j0 = null;
                hj0Var.setText("");
                AndroidUtilities.cancelRunOnUIThread(kj0Var.f35096t0);
                kj0Var.T(true, true);
            }
        }
    }

    public static void Q(kj0 kj0Var, String str) {
        TLRPC.User user;
        boolean z10 = true;
        if (kj0Var.m0 >= 0) {
            ConnectionsManager.getInstance(kj0Var.currentAccount).cancelRequest(kj0Var.m0, true);
            kj0Var.m0 = -1;
        }
        Boolean bool = kj0Var.f35094r0;
        z10 = (bool == null || !bool.booleanValue()) ? false : false;
        bt btVar = new bt(6, kj0Var, str);
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
                if (tL_contact != null && (user = messagesController.getUser(Long.valueOf(tL_contact.user_id))) != null && ((z10 || !user.bot) && !UserObject.isService(user.f18482id) && !UserObject.isUserSelf(user))) {
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
        btVar.run(arrayList);
    }

    @Override
    public final void B(Canvas canvas, int i10) {
        gj0 gj0Var = this.f35078a0;
        gj0Var.setTranslationY(Math.max(i10, (((gj0Var.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + AndroidUtilities.statusBarHeight) + AndroidUtilities.dp(8.0f));
        float translationY = gj0Var.getTranslationY() + gj0Var.getMeasuredHeight();
        hj0 hj0Var = this.Y;
        hj0Var.setTranslationY(translationY);
        float translationY2 = hj0Var.getTranslationY() + hj0Var.getMeasuredHeight();
        n50 n50Var = this.Z;
        n50Var.setTranslationY(translationY2);
        int measuredHeight = hj0Var.getMeasuredHeight() + gj0Var.getMeasuredHeight();
        this.d.setTranslationY((n50Var.getMeasuredHeight() + measuredHeight) - AndroidUtilities.dp(8.0f));
    }

    public final boolean R(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        Boolean bool = this.f35094r0;
        if (bool != null && UserObject.isBot(user) != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = this.f35095s0;
        if (bool2 != null && user.premium != bool2.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void S(boolean z10) {
        int i10;
        ij0 ij0Var = this.X;
        ij0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        HashSet hashSet = this.f35081d0;
        if (hashSet.size() == 0) {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.f35091o0, 0, 1, 33);
            Boolean bool = this.f35094r0;
            if (bool != null && bool.booleanValue()) {
                if (this.f35092p0 > 1) {
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
        ij0Var.b(hashSet.size(), true);
        ij0Var.g(spannableStringBuilder, z10, false);
        ij0Var.setEnabled(true);
    }

    public final void T(boolean z10, boolean z11) {
        int i10;
        float f7;
        int i11;
        ArrayList arrayList;
        ArrayList<TLRPC.Dialog> arrayList2;
        ug.h hVar;
        ArrayList arrayList3 = this.f35079b0;
        arrayList3.clear();
        ArrayList arrayList4 = this.f35080c0;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f35087j0);
        HashSet hashSet = this.f35081d0;
        if (!isEmpty) {
            ArrayList arrayList5 = this.f35083f0;
            int size = arrayList5.size();
            i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList5.get(i12);
                i12++;
                TLRPC.User user = (TLRPC.User) obj;
                i11 += AndroidUtilities.dp(56.0f);
                arrayList4.add(ug.g.c(user, hashSet.contains(Long.valueOf(user.f18482id))));
            }
        } else {
            ArrayList arrayList6 = this.f35082e0;
            if (!arrayList6.isEmpty()) {
                ArrayList arrayList7 = new ArrayList();
                int size2 = arrayList6.size();
                i10 = 0;
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList6.get(i13);
                    i13++;
                    TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TLRPC.TL_topPeer) obj2).peer.user_id));
                    if (!user2.self && !user2.bot && !UserObject.isService(user2.f18482id) && !UserObject.isDeleted(user2) && R(user2)) {
                        i10 += AndroidUtilities.dp(56.0f);
                        arrayList7.add(ug.g.c(user2, hashSet.contains(Long.valueOf(user2.f18482id))));
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
            Boolean bool = this.f35094r0;
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
                    if (dialog2.f18339id < 0) {
                        arrayList2 = allDialogs;
                    } else {
                        arrayList2 = allDialogs;
                        TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog2.f18339id));
                        if (R(user3)) {
                            i10 += AndroidUtilities.dp(56.0f);
                            arrayList8.add(ug.g.c(user3, hashSet.contains(Long.valueOf(user3.f18482id))));
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
            ArrayList arrayList9 = this.f35085h0;
            int size4 = arrayList9.size();
            i11 = i10;
            int i16 = 0;
            while (i16 < size4) {
                Object obj3 = arrayList9.get(i16);
                i16++;
                String str = (String) obj3;
                ArrayList arrayList10 = new ArrayList();
                List<TLRPC.TL_contact> list = (List) this.f35084g0.get(str);
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
                                arrayList10.add(ug.g.c(user4, hashSet.contains(Long.valueOf(user4.f18482id))));
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
                        gVar.f44010g = upperCase;
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
        gVar2.f44014l = max;
        arrayList4.add(gVar2);
        if (hashSet != null) {
            if (hashSet.size() > 0) {
                ug.h hVar2 = this.f35088k0;
                fj0 fj0Var = new fj0(this, 1);
                org.telegram.ui.Cells.v3 v3Var = hVar2.v;
                if (v3Var != null) {
                    v3Var.b(LocaleController.getString(R.string.UsersDeselectAll), fj0Var);
                }
            } else {
                org.telegram.ui.Cells.v3 v3Var2 = this.f35088k0.v;
                if (v3Var2 != null) {
                    v3Var2.setRightText(null);
                }
            }
        }
        if (z11 && (hVar = this.f35088k0) != null) {
            if (z10) {
                hVar.E(arrayList3, arrayList4);
            } else {
                hVar.l();
            }
        }
    }

    public final void U(boolean z10, boolean z11) {
        int R;
        T(z10, z11);
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.xl0 xl0Var = this.d;
            if (i10 >= xl0Var.getChildCount()) {
                break;
            }
            View childAt = xl0Var.getChildAt(i10);
            if ((childAt instanceof xg.l) && (R = RecyclerView.R(childAt)) > 0) {
                if (i11 == -1) {
                    i11 = R;
                }
                int i13 = R - 1;
                if (i13 >= 0) {
                    ArrayList arrayList = this.f35080c0;
                    if (i13 < arrayList.size()) {
                        ug.g gVar = (ug.g) arrayList.get(i13);
                        xg.l lVar = (xg.l) childAt;
                        lVar.c(gVar.f44013k, z10);
                        TLRPC.Chat chat = gVar.e;
                        float f7 = 1.0f;
                        if (chat != null) {
                            if (this.f35088k0.F(chat) > 200) {
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
            this.f35088k0.q(0, i11);
            ug.h hVar = this.f35088k0;
            hVar.q(i12, hVar.h() - i12);
        }
        S(z10);
    }

    @Override
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.Y.getEditText());
        super.dismiss();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        f35077u0 = null;
        AndroidUtilities.cancelRunOnUIThread(this.f35096t0);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        T(false, true);
    }

    @Override
    public final org.telegram.ui.Components.wl0 v(org.telegram.ui.Components.xl0 xl0Var) {
        ug.h hVar = new ug.h(getContext(), this.resourcesProvider, true);
        this.f35088k0 = hVar;
        hVar.f44024s = true;
        return hVar;
    }

    @Override
    public final CharSequence y() {
        int i10;
        Boolean bool = this.f35094r0;
        if (bool != null && bool.booleanValue()) {
            if (this.f35092p0 > 1) {
                i10 = R.string.ChooseBots;
            } else {
                i10 = R.string.ChooseBot;
            }
            return LocaleController.getString(i10);
        }
        return LocaleController.getString(R.string.ChooseUsers);
    }
}
