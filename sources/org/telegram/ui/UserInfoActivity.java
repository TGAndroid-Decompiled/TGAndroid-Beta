package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class UserInfoActivity extends org.telegram.ui.Components.h41 implements org.telegram.messenger.cs {
    public String F;
    public String G;
    public String H;
    public TL_account.TL_birthday I;
    public long J;
    public TL_account.TL_birthday K;
    public TLRPC.Chat L;
    public boolean M;
    public boolean N;
    public boolean P;
    public int addAccountRow;
    public int bioRow;
    public int birthdayRow;
    public int channelRow;
    public va1 f42097e;
    public va1 f42098f;
    public int firstNameRow;
    public va1 h;
    public int lastNameRow;
    public int logoutRow;
    public int numberRow;
    public CharSequence f42100r;
    public SpannableStringBuilder f42101s;
    public int usernameRow;
    public org.telegram.ui.ActionBar.b5 f42103x;
    public ai.h4 f42104y;
    public int f42099n = Integer.MIN_VALUE;
    public ArrayList f42102w = new ArrayList();
    public final ArrayList E = new ArrayList();
    public final wa1 O = new wa1(this.currentAccount);
    public boolean Q = false;
    public int R = -4;

    public static void d0(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        String str;
        if (tL_error != null) {
            userInfoActivity.f42103x.b(false);
            boolean z10 = tLObject instanceof TL_account.updateBirthday;
            if (z10 && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                if (userInfoActivity.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, userInfoActivity.getParentActivity(), userInfoActivity.resourceProvider);
                    String M0 = org.telegram.messenger.bd.M0(2131746860, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.S = M0;
                    s1Var.U = org.telegram.messenger.bd.M0(2131746861, null);
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                    userInfoActivity.showDialog(s1Var);
                }
            } else {
                org.telegram.ui.Components.fc.d0(tL_error);
            }
            if (z10) {
                if (tL_birthday != null) {
                    userFull.flags |= 32;
                } else {
                    userFull.flags &= -33;
                }
                userFull.birthday = tL_birthday;
                userInfoActivity.getMessagesStorage().j2(userFull, false);
            }
        } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
            userInfoActivity.f42103x.b(false);
            org.telegram.messenger.k5.p(null, 2131743889, org.telegram.ui.Components.fc.a0(userInfoActivity), null);
        } else {
            userInfoActivity.Q = true;
            int i3 = iArr[0] + 1;
            iArr[0] = i3;
            if (i3 == arrayList.size()) {
                userInfoActivity.finishFragment();
            }
        }
    }

    public static String e0(TL_account.TL_birthday tL_birthday) {
        if (tL_birthday == null) {
            return "—";
        }
        if ((tL_birthday.flags & 1) != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(1, tL_birthday.year);
            calendar.set(2, tL_birthday.month - 1);
            calendar.set(5, tL_birthday.day);
            return org.telegram.messenger.bd.E0().o0().format(calendar.getTimeInMillis());
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2, tL_birthday.month - 1);
        calendar2.set(5, tL_birthday.day);
        return org.telegram.messenger.bd.E0().q0().format(calendar2.getTimeInMillis());
    }

    public static boolean f0(TL_account.TL_birthday tL_birthday, TL_account.TL_birthday tL_birthday2) {
        boolean z10;
        boolean z11;
        if (tL_birthday == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (tL_birthday2 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11 || (tL_birthday != null && (tL_birthday.day != tL_birthday2.day || tL_birthday.month != tL_birthday2.month || tL_birthday.year != tL_birthday2.year))) {
            return false;
        }
        return true;
    }

    @Override
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.f41 f41Var) {
        boolean z10;
        int i3;
        int max;
        String str;
        ArrayList v;
        this.addAccountRow = -1;
        this.numberRow = -1;
        ArrayList arrayList2 = this.E;
        arrayList2.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (org.telegram.messenger.h10.i(i10).p() && this.currentAccount != i10) {
                arrayList2.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList2, new org.telegram.ui.Components.d80(22));
        arrayList.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.bd.M0(2131751225, null)));
        this.firstNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.r31.k(this.f42097e));
        this.lastNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.r31.k(this.f42098f));
        arrayList.add(org.telegram.ui.Components.r31.B(-1, null));
        this.bioRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.r31.k(this.h));
        arrayList.add(org.telegram.ui.Components.r31.C(this.f42100r));
        TLRPC.User f10 = getUserConfig().f();
        arrayList.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.bd.M0(2131751334, null)));
        if (f10 != null) {
            this.numberRow = arrayList.size();
            arrayList.add(y21.i(7, -11154873, -14175180, 2131232698, org.telegram.messenger.k5.i(new StringBuilder("+"), f10.phone, mf.b.c()), org.telegram.messenger.bd.M0(2131744270, null), null));
        }
        this.usernameRow = arrayList.size();
        if (org.telegram.messenger.l10.n(f10) != null) {
            arrayList.add(y21.i(8, -1007845, -1996271, 2131231098, "@" + org.telegram.messenger.l10.n(f10), org.telegram.messenger.bd.M0(2131743684, null), null));
        } else {
            arrayList.add(y21.i(8, -1007845, -1996271, 2131231098, org.telegram.messenger.bd.M0(2131754363, null), null, null));
        }
        this.birthdayRow = arrayList.size();
        TL_account.TL_birthday tL_birthday = this.K;
        if (tL_birthday != null) {
            arrayList.add(y21.i(9, -14899731, -15431455, 2131231082, e0(tL_birthday), org.telegram.messenger.bd.M0(2131751803, null), null));
        } else {
            arrayList.add(y21.i(9, -14899731, -15431455, 2131231082, org.telegram.messenger.bd.M0(2131754464, null), null, null));
        }
        if (!getContactsController().t(11) && (v = getContactsController().v(11)) != null && this.f42101s == null) {
            String M0 = org.telegram.messenger.bd.M0(2131751242, null);
            if (!v.isEmpty()) {
                int i11 = 0;
                while (true) {
                    if (i11 >= v.size()) {
                        break;
                    } else if (v.get(i11) instanceof TLRPC.TL_privacyValueAllowContacts) {
                        M0 = org.telegram.messenger.bd.M0(2131751242, null);
                        break;
                    } else {
                        if ((v.get(i11) instanceof TLRPC.TL_privacyValueAllowAll) || (v.get(i11) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                            M0 = org.telegram.messenger.bd.M0(2131751243, null);
                        }
                        i11++;
                    }
                }
            }
            this.f42101s = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(M0, new ta1(this, 2)), true);
        }
        arrayList.add(org.telegram.ui.Components.r31.C(this.f42101s));
        this.channelRow = arrayList.size();
        if (this.L == null) {
            arrayList.add(y21.i(3, -1007845, -1996271, 2131232147, org.telegram.messenger.bd.M0(2131751232, null), null, org.telegram.messenger.bd.M0(2131751237, null)));
        } else {
            arrayList.add(y21.i(3, -1007845, -1996271, 2131232147, org.telegram.messenger.bd.M0(2131751232, null), this.L.title, null));
        }
        if (this.M) {
            arrayList.add(y21.i(4, -881871, -1940716, 2131231148, org.telegram.messenger.bd.M0(2131751228, null), null, null));
        }
        if (this.N) {
            arrayList.add(y21.i(5, -765355, -2148011, 2131231129, org.telegram.messenger.bd.M0(2131751226, null), null, null));
        }
        ArrayList arrayList3 = this.f42102w;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList4 = this.f42102w;
            int size = arrayList4.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList4.get(i12);
                i12++;
                TLRPC.User a22 = org.telegram.messenger.hp.s1(this.currentAccount).a2(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                if (a22 != null) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.l10.p(a22));
                }
            }
            arrayList.add(y21.i(6, -3903756, -6335009, 2131232566, org.telegram.messenger.bd.M0(2131751231, null), sb2, null));
        } else {
            arrayList.add(y21.i(6, -3903756, -6335009, 2131232566, org.telegram.ui.Cells.l8.b(org.telegram.messenger.bd.M0(2131751231, null)), null, null));
        }
        arrayList.add(org.telegram.ui.Components.r31.B(-3, org.telegram.messenger.bd.M0(2131751230, null)));
        if (org.telegram.messenger.h10.c() < 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.addAccountRow = arrayList.size();
            String M02 = org.telegram.messenger.bd.M0(2131754484, null);
            int i13 = xa1.f51902b;
            org.telegram.ui.Components.r31 K = org.telegram.ui.Components.r31.K(xa1.class);
            K.d = 10;
            K.f37626k = 2131232475;
            K.f37627l = M02;
            K.f37628m = null;
            K.f37640z = 0;
            K.f37632q = true;
            arrayList.add(K);
        }
        if (!arrayList2.isEmpty()) {
            if (!z10) {
                arrayList.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.bd.M0(2131745502, null)));
            }
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                int intValue = ((Integer) arrayList2.get(i14)).intValue();
                int i15 = w21.f50682b;
                org.telegram.ui.Components.r31 K2 = org.telegram.ui.Components.r31.K(w21.class);
                K2.d = i14;
                K2.f37640z = intValue;
                arrayList.add(K2);
            }
            if (!org.telegram.messenger.h10.o()) {
                int i16 = 5;
                if (org.telegram.messenger.h10.o()) {
                    i3 = 5;
                } else {
                    i3 = 3;
                }
                if (Math.max(0, i3 - org.telegram.messenger.h10.c()) > 0) {
                    str = org.telegram.messenger.bd.H(',', "AddAccountInfo1", max) + " ";
                } else {
                    str = "";
                }
                if (!org.telegram.messenger.h10.o()) {
                    i16 = 3;
                }
                arrayList.add(org.telegram.ui.Components.r31.C(TextUtils.concat(str, org.telegram.messenger.g0.U2(org.telegram.messenger.bd.H(',', "AddAccountInfo2", i16), new ta1(this, 3)))));
            } else {
                arrayList.add(org.telegram.ui.Components.r31.C(null));
            }
        }
        this.logoutRow = arrayList.size();
        String M03 = org.telegram.messenger.bd.M0(2131748751, null);
        int i17 = xa1.f51902b;
        org.telegram.ui.Components.r31 K3 = org.telegram.ui.Components.r31.K(xa1.class);
        K3.d = 11;
        K3.f37626k = 2131232195;
        K3.f37627l = M03;
        K3.f37628m = null;
        K3.f37640z = 0;
        K3.f37633r = true;
        arrayList.add(K3);
        arrayList.add(org.telegram.ui.Components.r31.B(-4, null));
    }

    @Override
    public final CharSequence a0() {
        return org.telegram.messenger.bd.M0(2131751335, null);
    }

    @Override
    public final void b0(org.telegram.ui.Components.r31 r31Var, View view) {
        boolean z10;
        long j10;
        int i3 = 0;
        Integer num = null;
        if (r31Var.d == 10) {
            for (int i10 = 3; i10 >= 0; i10--) {
                if (!org.telegram.messenger.h10.i(i10).p()) {
                    i3++;
                    if (num == null) {
                        num = Integer.valueOf(i10);
                    }
                }
            }
            if (!org.telegram.messenger.h10.o()) {
                i3--;
            }
            if (i3 > 0 && num != null) {
                presentFragment(new xd0(num.intValue()));
            } else if (!org.telegram.messenger.h10.o()) {
                showDialog(new vg.i0(7, this.currentAccount, getParentActivity(), this, null));
            }
        } else if (r31Var.H(w21.class)) {
            int i11 = r31Var.f37640z;
            LaunchActivity launchActivity = LaunchActivity.K1;
            if (launchActivity != null) {
                launchActivity.O0(i11);
            }
        } else {
            int i12 = r31Var.d;
            if (i12 != 1 && i12 != 9) {
                if (i12 == 2) {
                    this.K = null;
                    ai.h4 h4Var = this.f42104y;
                    if (h4Var != null) {
                        h4Var.f35594g3.O(true);
                    }
                    g0(true);
                    return;
                } else if (i12 == 3) {
                    TLRPC.Chat chat = this.L;
                    if (chat == null) {
                        j10 = 0;
                    } else {
                        j10 = chat.f27001id;
                    }
                    presentFragment(new pq(this.O, j10, new ua1(this, 1)));
                    return;
                } else if (i12 == 5) {
                    presentFragment(new lg.b1());
                    return;
                } else if (i12 == 4) {
                    presentFragment(new lg.d1());
                    return;
                } else if (i12 == 6) {
                    presentFragment(new lg.r0());
                    return;
                } else if (i12 == 7) {
                    presentFragment(new g(3));
                    return;
                } else if (i12 == 8) {
                    presentFragment(new ka(null));
                    return;
                } else if (i12 == 11) {
                    presentFragment(new org.telegram.ui.ActionBar.d2(null));
                    return;
                } else {
                    return;
                }
            }
            Activity parentActivity = getParentActivity();
            String M0 = org.telegram.messenger.bd.M0(2131751239, null);
            String M02 = org.telegram.messenger.bd.M0(2131751244, null);
            TL_account.TL_birthday tL_birthday = this.K;
            ua1 ua1Var = new ua1(this, 0);
            if (tL_birthday != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            showDialog((org.telegram.ui.ActionBar.t2) org.telegram.ui.Components.t4.l(parentActivity, M0, M02, tL_birthday, ua1Var, null, false, z10, getResourceProvider()).f14429b);
        }
    }

    @Override
    public final boolean c0(org.telegram.ui.Components.r31 r31Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i3;
        setHasOwnBackground(true);
        va1 va1Var = new va1(this, context, org.telegram.messenger.bd.M0(2131751229, null), this.resourceProvider, 0);
        this.f42097e = va1Var;
        va1Var.setDivider(true);
        va1 va1Var2 = this.f42097e;
        va1Var2.getClass();
        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(va1Var2, 4);
        org.telegram.ui.Cells.i3 i3Var = va1Var2.d;
        i3Var.setImeOptions(6);
        i3Var.setOnEditorActionListener(new m.r2(fVar, 2));
        va1 va1Var3 = new va1(this, context, org.telegram.messenger.bd.M0(2131751227, null), this.resourceProvider, 1);
        this.f42098f = va1Var3;
        org.telegram.ui.Cells.f fVar2 = new org.telegram.ui.Cells.f(va1Var3, 4);
        org.telegram.ui.Cells.i3 i3Var2 = va1Var3.d;
        i3Var2.setImeOptions(6);
        i3Var2.setOnEditorActionListener(new m.r2(fVar2, 2));
        String M0 = org.telegram.messenger.bd.M0(2131751255, null);
        org.telegram.messenger.hp messagesController = getMessagesController();
        if (messagesController.getUserConfig().q()) {
            i3 = messagesController.Y4;
        } else {
            i3 = messagesController.X4;
        }
        va1 va1Var4 = new va1(this, context, M0, i3, this.resourceProvider);
        this.h = va1Var4;
        va1Var4.setShowLimitWhenEmpty(true);
        j0();
        this.f42100r = org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131751254, null), new ta1(this, 0));
        super.createView(context);
        ai.h4 h4Var = this.f34298a;
        this.f42104y = h4Var;
        h4Var.r1();
        this.f42104y.setSectionsDrawBackground(true);
        this.f42104y.setClipToPadding(false);
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new vs0(this, 19));
        this.f42103x = this.simpleActionBar.n(org.telegram.messenger.bd.M0(2131745956, null));
        g0(false);
        i0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        ArrayList<TL_account.TL_connectedBot> arrayList;
        if (i3 == org.telegram.messenger.hs.E0) {
            i0();
        } else if (i3 == org.telegram.messenger.hs.f23292r) {
            ai.h4 h4Var = this.f42104y;
            if (h4Var != null) {
                h4Var.f35594g3.O(true);
            }
        } else if (i3 == org.telegram.messenger.hs.f23254k0) {
            j0();
            ai.h4 h4Var2 = this.f42104y;
            if (h4Var2 != null) {
                h4Var2.f35594g3.O(true);
            }
        } else if (i3 == org.telegram.messenger.hs.Z3) {
            TL_account.connectedBots connectedbots = lg.f.a(this.currentAccount).f18292c;
            if (connectedbots == null || (arrayList = connectedbots.connected_bots) == null) {
                arrayList = new ArrayList<>();
            }
            this.f42102w = arrayList;
            ai.h4 h4Var3 = this.f42104y;
            if (h4Var3 != null) {
                h4Var3.f35594g3.O(true);
            }
        }
    }

    public final void g0(boolean z10) {
        boolean z11;
        long j10;
        if (this.f42103x == null) {
            return;
        }
        String str = this.F;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (TextUtils.equals(str, this.f42097e.getText().toString())) {
            String str3 = this.G;
            if (str3 == null) {
                str3 = "";
            }
            if (TextUtils.equals(str3, this.f42098f.getText().toString())) {
                String str4 = this.H;
                if (str4 != null) {
                    str2 = str4;
                }
                if (TextUtils.equals(str2, this.h.getText().toString()) && f0(this.I, this.K)) {
                    long j11 = this.J;
                    TLRPC.Chat chat = this.L;
                    if (chat != null) {
                        j10 = chat.f27001id;
                    } else {
                        j10 = 0;
                    }
                    if (j11 == j10) {
                        z11 = false;
                        this.f42103x.a(z11, z10);
                    }
                }
            }
        }
        z11 = true;
        this.f42103x.a(z11, z10);
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f42104y;
    }

    public final void h0(boolean z10) {
        long j10;
        int i3;
        if (!this.f42103x.f27421y.f53841f) {
            if (z10 && TextUtils.isEmpty(this.f42097e.getText())) {
                org.telegram.messenger.p2.APP_ERROR.a();
                va1 va1Var = this.f42097e;
                int i10 = -this.R;
                this.R = i10;
                org.telegram.messenger.g0.G3(i10, va1Var, null);
                return;
            }
            this.f42103x.b(true);
            TLRPC.User f10 = getUserConfig().f();
            TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
            if (f10 != null && b22 != null) {
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(this.f42097e.getText()) && (!TextUtils.equals(this.F, this.f42097e.getText().toString()) || !TextUtils.equals(this.G, this.f42098f.getText().toString()) || !TextUtils.equals(this.H, this.h.getText().toString()))) {
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.flags |= 1;
                    String charSequence = this.f42097e.getText().toString();
                    f10.first_name = charSequence;
                    updateprofile.first_name = charSequence;
                    updateprofile.flags |= 2;
                    String charSequence2 = this.f42098f.getText().toString();
                    f10.last_name = charSequence2;
                    updateprofile.last_name = charSequence2;
                    updateprofile.flags |= 4;
                    String charSequence3 = this.h.getText().toString();
                    b22.about = charSequence3;
                    updateprofile.about = charSequence3;
                    if (TextUtils.isEmpty(charSequence3)) {
                        i3 = b22.flags & (-3);
                    } else {
                        i3 = b22.flags | 2;
                    }
                    b22.flags = i3;
                    arrayList.add(updateprofile);
                }
                TL_account.TL_birthday tL_birthday = b22.birthday;
                if (!f0(this.I, this.K)) {
                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                    TL_account.TL_birthday tL_birthday2 = this.K;
                    if (tL_birthday2 != null) {
                        b22.flags2 |= 32;
                        b22.birthday = tL_birthday2;
                        updatebirthday.flags |= 1;
                        updatebirthday.birthday = tL_birthday2;
                    } else {
                        b22.flags2 &= -33;
                        b22.birthday = null;
                    }
                    arrayList.add(updatebirthday);
                    getMessagesController().m2();
                    org.telegram.messenger.hs.f(this.currentAccount).k(org.telegram.messenger.hs.f23236g5, new Object[0]);
                }
                long j11 = this.J;
                TLRPC.Chat chat = this.L;
                if (chat != null) {
                    j10 = chat.f27001id;
                } else {
                    j10 = 0;
                }
                if (j11 != j10) {
                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                    updatepersonalchannel.channel = org.telegram.messenger.hp.i1(this.L);
                    TLRPC.Chat chat2 = this.L;
                    if (chat2 != null) {
                        b22.flags |= 64;
                        long j12 = b22.personal_channel_id;
                        long j13 = chat2.f27001id;
                        if (j12 != j13) {
                            b22.personal_channel_message = 0;
                        }
                        b22.personal_channel_id = j13;
                    } else {
                        b22.flags &= -65;
                        b22.personal_channel_message = 0;
                        b22.personal_channel_id = 0L;
                    }
                    arrayList.add(updatepersonalchannel);
                }
                if (arrayList.isEmpty()) {
                    finishFragment();
                    return;
                }
                int[] iArr = {0};
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    TLObject tLObject = (TLObject) arrayList.get(i11);
                    getConnectionsManager().sendRequest(tLObject, new ci.d7(this, tLObject, tL_birthday, b22, iArr, arrayList, 2), 1024);
                }
                getMessagesStorage().j2(b22, false);
                getUserConfig().v(true);
                org.telegram.messenger.hs.f(this.currentAccount).k(org.telegram.messenger.hs.f23248j0, new Object[0]);
                org.telegram.messenger.hs f11 = org.telegram.messenger.hs.f(this.currentAccount);
                int i12 = org.telegram.messenger.hp.C8;
                f11.k(org.telegram.messenger.hs.f23292r, 1);
            }
        }
    }

    public final void i0() {
        boolean z10;
        org.telegram.ui.Components.f41 f41Var;
        if (!this.P) {
            TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
            if (b22 == null) {
                getMessagesController().g3(getUserConfig().f(), true, getClassGuid());
                return;
            }
            TLRPC.User user = b22.user;
            if (user == null) {
                user = getUserConfig().f();
            }
            if (user == null) {
                return;
            }
            va1 va1Var = this.f42097e;
            String str = user.first_name;
            this.F = str;
            va1Var.setText(str);
            va1 va1Var2 = this.f42098f;
            String str2 = user.last_name;
            this.G = str2;
            va1Var2.setText(str2);
            va1 va1Var3 = this.h;
            String str3 = b22.about;
            this.H = str3;
            va1Var3.setText(str3);
            TL_account.TL_birthday tL_birthday = b22.birthday;
            this.I = tL_birthday;
            this.K = tL_birthday;
            if ((b22.flags2 & 64) != 0) {
                this.J = b22.personal_channel_id;
                this.L = getMessagesController().M0(Long.valueOf(this.J));
            } else {
                this.J = 0L;
                this.L = null;
            }
            boolean z11 = false;
            if (b22.business_work_hours != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.M = z10;
            if (b22.business_location != null) {
                z11 = true;
            }
            this.N = z11;
            g0(true);
            ai.h4 h4Var = this.f42104y;
            if (h4Var != null && (f41Var = h4Var.f35594g3) != null) {
                f41Var.O(true);
            }
            this.P = true;
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UserInfoActivity.j0():void");
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.hs.E0);
        getNotificationCenter().c(this, org.telegram.messenger.hs.f23254k0);
        getNotificationCenter().c(this, org.telegram.messenger.hs.f23292r);
        getNotificationCenter().c(this, org.telegram.messenger.hs.Z3);
        getContactsController().D(false);
        lg.f.a(this.currentAccount).c(null);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.hs.E0);
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23254k0);
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23292r);
        getNotificationCenter().n(this, org.telegram.messenger.hs.Z3);
        super.onFragmentDestroy();
        if (!this.Q) {
            h0(false);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        wa1 wa1Var = this.O;
        wa1Var.f50763c = false;
        wa1Var.f50765f.add(new ta1(this, 1));
        if (!wa1Var.f50763c && !wa1Var.d) {
            wa1Var.d = true;
            TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
            tL_channels_getAdminedPublicChannels.for_personal = wa1Var.f50762b;
            ConnectionsManager.getInstance(wa1Var.f50761a).sendRequest(tL_channels_getAdminedPublicChannels, new l(wa1Var, 24));
        }
        this.f42101s = null;
        ai.h4 h4Var = this.f42104y;
        if (h4Var != null) {
            h4Var.f35594g3.O(true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
