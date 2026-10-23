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
public final class fj0 extends org.telegram.ui.Components.bb {
    public static fj0 f37344u0;
    public final dj0 X;
    public final cj0 Y;
    public final e50 Z;
    public final bj0 f37345a0;
    public final ArrayList f37346b0;
    public final ArrayList f37347c0;
    public final HashSet f37348d0;
    public final ArrayList f37349e0;
    public final ArrayList f37350f0;
    public final HashMap f37351g0;
    public final ArrayList f37352h0;
    public final LinkedHashMap f37353i0;
    public String f37354j0;
    public vg.h f37355k0;
    public int f37356l0;
    public int m0;
    public float f37357n0;
    public org.telegram.ui.Components.nb0 f37358o0;
    public final int f37359p0;
    public final ej0 f37360q0;
    public final Boolean f37361r0;
    public final Boolean f37362s0;
    public final z5 f37363t0;

    public fj0(org.telegram.ui.ActionBar.o2 o2Var, int i10, Boolean bool, Boolean bool2, ej0 ej0Var) {
        super(o2Var, true, false, o2Var.getResourceProvider());
        this.f37346b0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f37347c0 = arrayList;
        HashSet hashSet = new HashSet();
        this.f37348d0 = hashSet;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.f37349e0 = arrayList3;
        this.f37350f0 = new ArrayList();
        HashMap hashMap = new HashMap();
        this.f37351g0 = hashMap;
        ArrayList arrayList4 = new ArrayList();
        this.f37352h0 = arrayList4;
        this.f37353i0 = new LinkedHashMap();
        this.f37356l0 = AndroidUtilities.dp(120.0f);
        this.m0 = -1;
        this.f37363t0 = new z5(this, 12);
        this.f37359p0 = i10;
        this.f37361r0 = bool;
        this.f37362s0 = bool2;
        this.f37360q0 = ej0Var;
        this.e.setTitle(z());
        ?? cVar = new yg.c(getContext(), this.resourcesProvider);
        this.f37345a0 = cVar;
        cVar.setOnCloseClickListener(new zi0(this, 0));
        cVar.setText(z());
        cVar.setCloseImageVisible(false);
        cVar.f50586f.c(0.0f, false);
        this.f37358o0 = new org.telegram.ui.Components.nb0(this, 1);
        cj0 cj0Var = new cj0(this, getContext(), this.resourcesProvider);
        this.Y = cj0Var;
        int i11 = org.telegram.ui.ActionBar.k6.f21254h5;
        org.telegram.ui.ActionBar.r6.i(i11, cj0Var, this.resourcesProvider);
        cj0Var.setOnSearchTextChange(new u3(this, 12));
        cj0Var.f50597b.setHintText(LocaleController.getString(R.string.Search), false);
        e50 e50Var = new e50(this, getContext(), 1);
        this.Z = e50Var;
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.addView((View) cVar, 0, w7.z5.f(-2.0f, 55, i12, 0, i12, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup2.addView(cj0Var, w7.z5.f(-2.0f, 55, i13, 0, i13, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup3.addView(e50Var, w7.z5.f(1.0f, 55, i14, 0, i14, 0));
        ai.cd cdVar = new ai.cd(getContext(), this.resourcesProvider, (org.telegram.ui.Components.mm0) null);
        cdVar.setClickable(true);
        cdVar.setOrientation(1);
        cdVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        org.telegram.ui.ActionBar.r6.i(i11, cdVar, this.resourcesProvider);
        dj0 dj0Var = new dj0(this, getContext(), this.resourcesProvider);
        this.X = dj0Var;
        dj0Var.setOnClickListener(new aj0(this, 0));
        cdVar.addView(dj0Var, w7.z5.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup4.addView(cdVar, w7.z5.f(-2.0f, 87, i15, 0, i15, 0));
        vg.h hVar = this.f37355k0;
        org.telegram.ui.Components.mm0 mm0Var = this.d;
        hVar.f48824n = arrayList;
        hVar.f48823f = mm0Var;
        int i16 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i16, 0, i16, AndroidUtilities.dp(60.0f));
        this.d.j(new j3(this, 21));
        this.d.setOnItemClickListener(new i2.r(this, i10, 15));
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.bs.h);
        kVar.C = false;
        kVar.f46377m = false;
        this.d.setItemAnimator(kVar);
        this.d.i(new ei.q1(this, 6));
        cj0Var.setText("");
        cj0Var.d.b(false);
        cj0Var.b(false, hashSet, new zi0(this, 1), null);
        cVar.setText(z());
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

    public static void P(fj0 fj0Var, int i10, View view) {
        cj0 cj0Var = fj0Var.Y;
        HashSet hashSet = fj0Var.f37348d0;
        if (view instanceof yg.k) {
            TLRPC.User user = ((yg.k) view).getUser();
            long j10 = user.f20490id;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                fj0Var.f37353i0.put(Long.valueOf(j10), user);
            }
            if (hashSet.size() == i10 + 1) {
                hashSet.remove(Long.valueOf(j10));
                new org.telegram.ui.Components.xc(fj0Var.container, fj0Var.resourcesProvider).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralString("BotMultiContactsSelectorLimit", fj0Var.f37359p0, new Object[0])).k(true);
                try {
                    fj0Var.container.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            cj0Var.b(true, hashSet, new zi0(fj0Var, 2), null);
            fj0Var.U(true, false);
            if (!TextUtils.isEmpty(fj0Var.f37354j0)) {
                fj0Var.f37354j0 = null;
                cj0Var.setText("");
                AndroidUtilities.cancelRunOnUIThread(fj0Var.f37363t0);
                fj0Var.T(true, true);
            }
        }
    }

    public static void Q(fj0 fj0Var, String str) {
        TLRPC.User user;
        boolean z10 = true;
        if (fj0Var.m0 >= 0) {
            ConnectionsManager.getInstance(fj0Var.currentAccount).cancelRequest(fj0Var.m0, true);
            fj0Var.m0 = -1;
        }
        Boolean bool = fj0Var.f37361r0;
        z10 = (bool == null || !bool.booleanValue()) ? false : false;
        org.telegram.ui.Components.qy qyVar = new org.telegram.ui.Components.qy(12, fj0Var, str);
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
                if (tL_contact != null && (user = messagesController.getUser(Long.valueOf(tL_contact.user_id))) != null && ((z10 || !user.bot) && !UserObject.isService(user.f20490id) && !UserObject.isUserSelf(user))) {
                    String lowerCase2 = UserObject.getUserName(user).toLowerCase();
                    String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase) && !org.telegram.messenger.v0.w(" ", lowerCase, lowerCase2) && !translitSafe2.startsWith(translitSafe) && !org.telegram.messenger.v0.w(" ", translitSafe, translitSafe2)) {
                        if (user.usernames != null) {
                            for (int i12 = 0; i12 < user.usernames.size(); i12++) {
                                TLRPC.TL_username tL_username = user.usernames.get(i12);
                                if (tL_username != null && tL_username.active) {
                                    String lowerCase3 = tL_username.username.toLowerCase();
                                    if (lowerCase3.startsWith(lowerCase) || org.telegram.messenger.v0.w("_", lowerCase, lowerCase3) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.v0.w(" ", translitSafe, lowerCase3)) {
                                        arrayList.add(user);
                                        break;
                                    }
                                }
                            }
                        } else {
                            String str2 = user.username;
                            if (str2 != null) {
                                String lowerCase4 = str2.toLowerCase();
                                if (lowerCase4.startsWith(lowerCase) || org.telegram.messenger.v0.w("_", lowerCase, lowerCase4) || lowerCase4.startsWith(translitSafe) || org.telegram.messenger.v0.w(" ", translitSafe, lowerCase4)) {
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
        qyVar.run(arrayList);
    }

    @Override
    public final void C(Canvas canvas, int i10) {
        bj0 bj0Var = this.f37345a0;
        bj0Var.setTranslationY(Math.max(i10, (((bj0Var.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + AndroidUtilities.statusBarHeight) + AndroidUtilities.dp(8.0f));
        float translationY = bj0Var.getTranslationY() + bj0Var.getMeasuredHeight();
        cj0 cj0Var = this.Y;
        cj0Var.setTranslationY(translationY);
        float translationY2 = cj0Var.getTranslationY() + cj0Var.getMeasuredHeight();
        e50 e50Var = this.Z;
        e50Var.setTranslationY(translationY2);
        int measuredHeight = cj0Var.getMeasuredHeight() + bj0Var.getMeasuredHeight();
        this.d.setTranslationY((e50Var.getMeasuredHeight() + measuredHeight) - AndroidUtilities.dp(8.0f));
    }

    public final boolean R(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        Boolean bool = this.f37361r0;
        if (bool != null && UserObject.isBot(user) != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = this.f37362s0;
        if (bool2 != null && user.premium != bool2.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void S(boolean z10) {
        int i10;
        dj0 dj0Var = this.X;
        dj0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        HashSet hashSet = this.f37348d0;
        if (hashSet.size() == 0) {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.f37358o0, 0, 1, 33);
            Boolean bool = this.f37361r0;
            if (bool != null && bool.booleanValue()) {
                if (this.f37359p0 > 1) {
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
        dj0Var.b(hashSet.size(), true);
        dj0Var.i(spannableStringBuilder, z10, false);
        dj0Var.setEnabled(true);
    }

    public final void T(boolean z10, boolean z11) {
        int i10;
        float f7;
        int i11;
        ArrayList arrayList;
        ArrayList<TLRPC.Dialog> arrayList2;
        vg.h hVar;
        ArrayList arrayList3 = this.f37346b0;
        arrayList3.clear();
        ArrayList arrayList4 = this.f37347c0;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f37354j0);
        float f10 = 56.0f;
        HashSet hashSet = this.f37348d0;
        if (!isEmpty) {
            ArrayList arrayList5 = this.f37350f0;
            int size = arrayList5.size();
            i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList5.get(i12);
                i12++;
                TLRPC.User user = (TLRPC.User) obj;
                i11 += AndroidUtilities.dp(56.0f);
                arrayList4.add(vg.g.c(user, hashSet.contains(Long.valueOf(user.f20490id))));
            }
        } else {
            ArrayList arrayList6 = this.f37349e0;
            float f11 = 32.0f;
            if (!arrayList6.isEmpty()) {
                ArrayList arrayList7 = new ArrayList();
                int size2 = arrayList6.size();
                i10 = 0;
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList6.get(i13);
                    i13++;
                    TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TLRPC.TL_topPeer) obj2).peer.user_id));
                    if (!user2.self && !user2.bot && !UserObject.isService(user2.f20490id) && !UserObject.isDeleted(user2) && R(user2)) {
                        i10 += AndroidUtilities.dp(56.0f);
                        arrayList7.add(vg.g.c(user2, hashSet.contains(Long.valueOf(user2.f20490id))));
                    }
                }
                if (!arrayList7.isEmpty()) {
                    i10 += AndroidUtilities.dp(32.0f);
                    arrayList4.add(vg.g.b(LocaleController.getString(R.string.GiftPremiumFrequentContacts)));
                    arrayList4.addAll(arrayList7);
                }
            } else {
                i10 = 0;
            }
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            Boolean bool = this.f37361r0;
            if (bool != null && bool.booleanValue()) {
                ArrayList arrayList8 = new ArrayList();
                ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(this.currentAccount).getAllDialogs();
                int size3 = allDialogs.size();
                int i14 = 0;
                while (i14 < size3) {
                    TLRPC.Dialog dialog = allDialogs.get(i14);
                    i14++;
                    TLRPC.Dialog dialog2 = dialog;
                    float f12 = f11;
                    int i15 = size3;
                    if (dialog2.f20347id < 0) {
                        arrayList2 = allDialogs;
                    } else {
                        arrayList2 = allDialogs;
                        TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog2.f20347id));
                        if (R(user3)) {
                            i10 += AndroidUtilities.dp(56.0f);
                            arrayList8.add(vg.g.c(user3, hashSet.contains(Long.valueOf(user3.f20490id))));
                        }
                    }
                    f11 = f12;
                    size3 = i15;
                    allDialogs = arrayList2;
                }
                f7 = f11;
                if (!arrayList8.isEmpty()) {
                    i10 += AndroidUtilities.dp(f7);
                    arrayList4.add(vg.g.b(LocaleController.getString(R.string.SearchApps)));
                    arrayList4.addAll(arrayList8);
                }
            } else {
                f7 = 32.0f;
            }
            ArrayList arrayList9 = this.f37352h0;
            int size4 = arrayList9.size();
            i11 = i10;
            int i16 = 0;
            while (i16 < size4) {
                Object obj3 = arrayList9.get(i16);
                i16++;
                String str = (String) obj3;
                ArrayList arrayList10 = new ArrayList();
                List<TLRPC.TL_contact> list = (List) this.f37351g0.get(str);
                if (list != null) {
                    for (TLRPC.TL_contact tL_contact : list) {
                        float f13 = f10;
                        String str2 = str;
                        if (tL_contact.user_id == clientUserId) {
                            arrayList = arrayList9;
                        } else {
                            arrayList = arrayList9;
                            TLRPC.User user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
                            if (R(user4)) {
                                i11 += AndroidUtilities.dp(f13);
                                arrayList10.add(vg.g.c(user4, hashSet.contains(Long.valueOf(user4.f20490id))));
                                size4 = size4;
                                arrayList9 = arrayList;
                                f10 = f13;
                                str = str2;
                                i16 = i16;
                            }
                        }
                        arrayList9 = arrayList;
                        f10 = f13;
                        str = str2;
                    }
                    float f14 = f10;
                    int i17 = size4;
                    int i18 = i16;
                    String str3 = str;
                    ArrayList arrayList11 = arrayList9;
                    if (!arrayList10.isEmpty()) {
                        String upperCase = str3.toUpperCase();
                        vg.g gVar = new vg.g(7, false);
                        gVar.f48812g = upperCase;
                        arrayList4.add(gVar);
                        arrayList4.addAll(arrayList10);
                        i11 = AndroidUtilities.dp(f7) + i11;
                    }
                    size4 = i17;
                    arrayList9 = arrayList11;
                    f10 = f14;
                    i16 = i18;
                }
            }
        }
        if (arrayList4.isEmpty()) {
            arrayList4.add(new vg.g(5, false));
            i11 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i11);
        vg.g gVar2 = new vg.g(-1, false);
        gVar2.f48816l = max;
        arrayList4.add(gVar2);
        if (hashSet != null) {
            if (hashSet.size() > 0) {
                vg.h hVar2 = this.f37355k0;
                aj0 aj0Var = new aj0(this, 1);
                org.telegram.ui.Cells.u3 u3Var = hVar2.v;
                if (u3Var != null) {
                    u3Var.a(LocaleController.getString(R.string.UsersDeselectAll), aj0Var);
                }
            } else {
                org.telegram.ui.Cells.u3 u3Var2 = this.f37355k0.v;
                if (u3Var2 != null) {
                    u3Var2.setRightText(null);
                }
            }
        }
        if (z11 && (hVar = this.f37355k0) != null) {
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
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.mm0 mm0Var = this.d;
            if (i11 >= mm0Var.getChildCount()) {
                break;
            }
            View childAt = mm0Var.getChildAt(i11);
            if ((childAt instanceof yg.k) && (R = RecyclerView.R(childAt)) > 0) {
                if (i10 == -1) {
                    i10 = R;
                }
                int i13 = R - 1;
                if (i13 >= 0) {
                    ArrayList arrayList = this.f37347c0;
                    if (i13 < arrayList.size()) {
                        vg.g gVar = (vg.g) arrayList.get(i13);
                        yg.k kVar = (yg.k) childAt;
                        kVar.c(gVar.f48815k, z10);
                        TLRPC.Chat chat = gVar.e;
                        float f7 = 1.0f;
                        if (chat != null) {
                            if (this.f37355k0.F(chat) > 200) {
                                f7 = 0.3f;
                            }
                            kVar.i(f7, z10);
                        } else {
                            kVar.i(1.0f, z10);
                        }
                    }
                }
                i12 = R;
            }
            i11++;
        }
        if (z10) {
            this.f37355k0.q(0, i10);
            vg.h hVar = this.f37355k0;
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
        f37344u0 = null;
        AndroidUtilities.cancelRunOnUIThread(this.f37363t0);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        T(false, true);
    }

    @Override
    public final org.telegram.ui.Components.lm0 w(org.telegram.ui.Components.mm0 mm0Var) {
        vg.h hVar = new vg.h(getContext(), this.resourcesProvider, true);
        this.f37355k0 = hVar;
        hVar.f48826s = true;
        return hVar;
    }

    @Override
    public final CharSequence z() {
        int i10;
        Boolean bool = this.f37361r0;
        if (bool != null && bool.booleanValue()) {
            if (this.f37359p0 > 1) {
                i10 = R.string.ChooseBots;
            } else {
                i10 = R.string.ChooseBot;
            }
            return LocaleController.getString(i10);
        }
        return LocaleController.getString(R.string.ChooseUsers);
    }
}
