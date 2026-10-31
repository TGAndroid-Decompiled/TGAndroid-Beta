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
public class UserInfoActivity extends org.telegram.ui.Components.r51 implements org.telegram.messenger.us {
    public String E;
    public String F;
    public String G;
    public TL_account.TL_birthday H;
    public long I;
    public TL_account.TL_birthday J;
    public TLRPC.Chat K;
    public boolean L;
    public boolean M;
    public boolean O;
    public int addAccountRow;
    public int bioRow;
    public int birthdayRow;
    public int channelRow;
    public yc1 e;
    public yc1 f34139f;
    public int firstNameRow;
    public yc1 h;
    public int lastNameRow;
    public int logoutRow;
    public int numberRow;
    public CharSequence f34141r;
    public SpannableStringBuilder f34142s;
    public int usernameRow;
    public org.telegram.ui.ActionBar.l5 f34144x;
    public org.telegram.ui.Components.ii f34145y;
    public int f34140n = Integer.MIN_VALUE;
    public ArrayList f34143w = new ArrayList();
    public final ArrayList D = new ArrayList();
    public final zc1 N = new zc1(this.currentAccount);
    public boolean P = false;
    public int Q = -4;

    public static void c0(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        String str;
        if (tL_error != null) {
            userInfoActivity.f34144x.b(false);
            boolean z10 = tLObject instanceof TL_account.updateBirthday;
            if (z10 && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                if (userInfoActivity.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, userInfoActivity.getParentActivity(), userInfoActivity.resourceProvider);
                    String L0 = org.telegram.messenger.cd.L0(2131746867, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    x1Var.R = L0;
                    x1Var.T = org.telegram.messenger.cd.L0(2131746868, null);
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                    userInfoActivity.showDialog(x1Var);
                }
            } else {
                org.telegram.ui.Components.cc.d0(tL_error);
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
            userInfoActivity.f34144x.b(false);
            org.telegram.messenger.m5.o(null, 2131743904, org.telegram.ui.Components.cc.a0(userInfoActivity), null);
        } else {
            userInfoActivity.P = true;
            int i10 = iArr[0] + 1;
            iArr[0] = i10;
            if (i10 == arrayList.size()) {
                userInfoActivity.finishFragment();
            }
        }
    }

    public static String d0(TL_account.TL_birthday tL_birthday) {
        if (tL_birthday == null) {
            return "—";
        }
        if ((tL_birthday.flags & 1) != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(1, tL_birthday.year);
            calendar.set(2, tL_birthday.month - 1);
            calendar.set(5, tL_birthday.day);
            return org.telegram.messenger.cd.D0().n0().format(calendar.getTimeInMillis());
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2, tL_birthday.month - 1);
        calendar2.set(5, tL_birthday.day);
        return org.telegram.messenger.cd.D0().p0().format(calendar2.getTimeInMillis());
    }

    public static boolean e0(TL_account.TL_birthday tL_birthday, TL_account.TL_birthday tL_birthday2) {
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
    public final void Y(ArrayList arrayList, org.telegram.ui.Components.p51 p51Var) {
        boolean z10;
        int i10;
        int max;
        String str;
        ArrayList v;
        this.addAccountRow = -1;
        this.numberRow = -1;
        ArrayList arrayList2 = this.D;
        arrayList2.clear();
        for (int i11 = 0; i11 < 4; i11++) {
            if (org.telegram.messenger.d20.i(i11).p() && this.currentAccount != i11) {
                arrayList2.add(Integer.valueOf(i11));
            }
        }
        Collections.sort(arrayList2, new ex0(4));
        arrayList.add(org.telegram.ui.Components.a51.u(org.telegram.messenger.cd.L0(2131751225, null)));
        this.firstNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.a51.k(this.e));
        this.lastNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.a51.k(this.f34139f));
        arrayList.add(org.telegram.ui.Components.a51.B(-1, null));
        this.bioRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.a51.k(this.h));
        arrayList.add(org.telegram.ui.Components.a51.C(this.f34141r));
        TLRPC.User f7 = getUserConfig().f();
        arrayList.add(org.telegram.ui.Components.a51.u(org.telegram.messenger.cd.L0(2131751334, null)));
        if (f7 != null) {
            this.numberRow = arrayList.size();
            arrayList.add(a51.i(7, -11154873, -14175180, 2131232697, org.telegram.messenger.m5.h(new StringBuilder("+"), f7.phone, af.b.c()), org.telegram.messenger.cd.L0(2131744286, null), null));
        }
        this.usernameRow = arrayList.size();
        if (org.telegram.messenger.h20.n(f7) != null) {
            arrayList.add(a51.i(8, -1007845, -1996271, 2131231098, "@" + org.telegram.messenger.h20.n(f7), org.telegram.messenger.cd.L0(2131743700, null), null));
        } else {
            arrayList.add(a51.i(8, -1007845, -1996271, 2131231098, org.telegram.messenger.cd.L0(2131754363, null), null, null));
        }
        this.birthdayRow = arrayList.size();
        TL_account.TL_birthday tL_birthday = this.J;
        if (tL_birthday != null) {
            arrayList.add(a51.i(9, -14899731, -15431455, 2131231082, d0(tL_birthday), org.telegram.messenger.cd.L0(2131751803, null), null));
        } else {
            arrayList.add(a51.i(9, -14899731, -15431455, 2131231082, org.telegram.messenger.cd.L0(2131754464, null), null, null));
        }
        if (!getContactsController().t(11) && (v = getContactsController().v(11)) != null && this.f34142s == null) {
            String L0 = org.telegram.messenger.cd.L0(2131751242, null);
            if (!v.isEmpty()) {
                int i12 = 0;
                while (true) {
                    if (i12 >= v.size()) {
                        break;
                    } else if (v.get(i12) instanceof TLRPC.TL_privacyValueAllowContacts) {
                        L0 = org.telegram.messenger.cd.L0(2131751242, null);
                        break;
                    } else {
                        if ((v.get(i12) instanceof TLRPC.TL_privacyValueAllowAll) || (v.get(i12) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                            L0 = org.telegram.messenger.cd.L0(2131751243, null);
                        }
                        i12++;
                    }
                }
            }
            this.f34142s = org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(L0, new wc1(this, 2)), true);
        }
        arrayList.add(org.telegram.ui.Components.a51.C(this.f34142s));
        this.channelRow = arrayList.size();
        if (this.K == null) {
            arrayList.add(a51.i(3, -1007845, -1996271, 2131232146, org.telegram.messenger.cd.L0(2131751232, null), null, org.telegram.messenger.cd.L0(2131751237, null)));
        } else {
            arrayList.add(a51.i(3, -1007845, -1996271, 2131232146, org.telegram.messenger.cd.L0(2131751232, null), this.K.title, null));
        }
        if (this.L) {
            arrayList.add(a51.i(4, -881871, -1940716, 2131231148, org.telegram.messenger.cd.L0(2131751228, null), null, null));
        }
        if (this.M) {
            arrayList.add(a51.i(5, -765355, -2148011, 2131231129, org.telegram.messenger.cd.L0(2131751226, null), null, null));
        }
        ArrayList arrayList3 = this.f34143w;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList4 = this.f34143w;
            int size = arrayList4.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList4.get(i13);
                i13++;
                TLRPC.User Z1 = org.telegram.messenger.vp.r1(this.currentAccount).Z1(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                if (Z1 != null) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.h20.p(Z1));
                }
            }
            arrayList.add(a51.i(6, -3903756, -6335009, 2131232565, org.telegram.messenger.cd.L0(2131751231, null), sb2, null));
        } else {
            arrayList.add(a51.i(6, -3903756, -6335009, 2131232565, org.telegram.ui.Cells.p8.b(org.telegram.messenger.cd.L0(2131751231, null)), null, null));
        }
        arrayList.add(org.telegram.ui.Components.a51.B(-3, org.telegram.messenger.cd.L0(2131751230, null)));
        if (org.telegram.messenger.d20.c() < 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.addAccountRow = arrayList.size();
            String L02 = org.telegram.messenger.cd.L0(2131754484, null);
            int i14 = ad1.f35631b;
            org.telegram.ui.Components.a51 K = org.telegram.ui.Components.a51.K(ad1.class);
            K.d = 10;
            K.f24291k = 2131232474;
            K.f24292l = L02;
            K.f24293m = null;
            K.f24305z = 0;
            K.f24297q = true;
            arrayList.add(K);
        }
        if (!arrayList2.isEmpty()) {
            if (!z10) {
                arrayList.add(org.telegram.ui.Components.a51.u(org.telegram.messenger.cd.L0(2131745509, null)));
            }
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                int intValue = ((Integer) arrayList2.get(i15)).intValue();
                int i16 = y41.f43706b;
                org.telegram.ui.Components.a51 K2 = org.telegram.ui.Components.a51.K(y41.class);
                K2.d = i15;
                K2.f24305z = intValue;
                arrayList.add(K2);
            }
            if (!org.telegram.messenger.d20.o()) {
                int i17 = 5;
                if (org.telegram.messenger.d20.o()) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                if (Math.max(0, i10 - org.telegram.messenger.d20.c()) > 0) {
                    str = org.telegram.messenger.cd.H(',', "AddAccountInfo1", max) + " ";
                } else {
                    str = "";
                }
                if (!org.telegram.messenger.d20.o()) {
                    i17 = 3;
                }
                arrayList.add(org.telegram.ui.Components.a51.C(TextUtils.concat(str, org.telegram.messenger.i0.T2(org.telegram.messenger.cd.H(',', "AddAccountInfo2", i17), new wc1(this, 3)))));
            } else {
                arrayList.add(org.telegram.ui.Components.a51.C(null));
            }
        }
        this.logoutRow = arrayList.size();
        String L03 = org.telegram.messenger.cd.L0(2131748754, null);
        int i18 = ad1.f35631b;
        org.telegram.ui.Components.a51 K3 = org.telegram.ui.Components.a51.K(ad1.class);
        K3.d = 11;
        K3.f24291k = 2131232194;
        K3.f24292l = L03;
        K3.f24293m = null;
        K3.f24305z = 0;
        K3.f24298r = true;
        arrayList.add(K3);
        arrayList.add(org.telegram.ui.Components.a51.B(-4, null));
    }

    @Override
    public final CharSequence Z() {
        return org.telegram.messenger.cd.L0(2131751335, null);
    }

    @Override
    public final void a0(org.telegram.ui.Components.a51 a51Var, View view) {
        boolean z10;
        long j10;
        int i10 = 0;
        Integer num = null;
        if (a51Var.d == 10) {
            for (int i11 = 3; i11 >= 0; i11--) {
                if (!org.telegram.messenger.d20.i(i11).p()) {
                    i10++;
                    if (num == null) {
                        num = Integer.valueOf(i11);
                    }
                }
            }
            if (!org.telegram.messenger.d20.o()) {
                i10--;
            }
            if (i10 > 0 && num != null) {
                presentFragment(new hf0(num.intValue()));
            } else if (!org.telegram.messenger.d20.o()) {
                showDialog(new kg.q0(7, this.currentAccount, getParentActivity(), this, null));
            }
        } else if (a51Var.H(y41.class)) {
            int i12 = a51Var.f24305z;
            LaunchActivity launchActivity = LaunchActivity.I1;
            if (launchActivity != null) {
                launchActivity.O0(i12);
            }
        } else {
            int i13 = a51Var.d;
            if (i13 != 1 && i13 != 9) {
                if (i13 == 2) {
                    this.J = null;
                    org.telegram.ui.Components.ii iiVar = this.f34145y;
                    if (iiVar != null) {
                        iiVar.f30819f3.O(true);
                    }
                    f0(true);
                    return;
                } else if (i13 == 3) {
                    TLRPC.Chat chat = this.K;
                    if (chat == null) {
                        j10 = 0;
                    } else {
                        j10 = chat.f19793id;
                    }
                    presentFragment(new rr(this.N, j10, new xc1(this, 1)));
                    return;
                } else if (i13 == 5) {
                    presentFragment(new ag.f2());
                    return;
                } else if (i13 == 4) {
                    presentFragment(new ag.h2());
                    return;
                } else if (i13 == 6) {
                    presentFragment(new ag.t1());
                    return;
                } else if (i13 == 7) {
                    presentFragment(new f(3));
                    return;
                } else if (i13 == 8) {
                    presentFragment(new oa(null));
                    return;
                } else if (i13 == 11) {
                    presentFragment(new org.telegram.ui.ActionBar.k2(null));
                    return;
                } else {
                    return;
                }
            }
            Activity parentActivity = getParentActivity();
            String L0 = org.telegram.messenger.cd.L0(2131751239, null);
            String L02 = org.telegram.messenger.cd.L0(2131751244, null);
            TL_account.TL_birthday tL_birthday = this.J;
            xc1 xc1Var = new xc1(this, 0);
            if (tL_birthday != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            showDialog((org.telegram.ui.ActionBar.z2) org.telegram.ui.Components.s4.l(parentActivity, L0, L02, tL_birthday, xc1Var, null, false, z10, getResourceProvider()).f11587b);
        }
    }

    @Override
    public final boolean b0(org.telegram.ui.Components.a51 a51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        yc1 yc1Var = new yc1(this, context, org.telegram.messenger.cd.L0(2131751229, null), this.resourceProvider, 0);
        this.e = yc1Var;
        yc1Var.setDivider(true);
        yc1 yc1Var2 = this.e;
        yc1Var2.getClass();
        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(yc1Var2, 4);
        org.telegram.ui.Cells.k3 k3Var = yc1Var2.d;
        k3Var.setImeOptions(6);
        k3Var.setOnEditorActionListener(new m.s2(fVar, 2));
        yc1 yc1Var3 = new yc1(this, context, org.telegram.messenger.cd.L0(2131751227, null), this.resourceProvider, 1);
        this.f34139f = yc1Var3;
        org.telegram.ui.Cells.f fVar2 = new org.telegram.ui.Cells.f(yc1Var3, 4);
        org.telegram.ui.Cells.k3 k3Var2 = yc1Var3.d;
        k3Var2.setImeOptions(6);
        k3Var2.setOnEditorActionListener(new m.s2(fVar2, 2));
        String L0 = org.telegram.messenger.cd.L0(2131751255, null);
        org.telegram.messenger.vp messagesController = getMessagesController();
        if (messagesController.getUserConfig().q()) {
            i10 = messagesController.Z4;
        } else {
            i10 = messagesController.Y4;
        }
        yc1 yc1Var4 = new yc1(this, context, L0, i10, this.resourceProvider);
        this.h = yc1Var4;
        yc1Var4.setShowLimitWhenEmpty(true);
        i0();
        this.f34141r = org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131751254, null), new wc1(this, 0));
        super.createView(context);
        org.telegram.ui.Components.ii iiVar = this.f29837a;
        this.f34145y = iiVar;
        iiVar.r1();
        this.f34145y.setSectionsDrawBackground(true);
        this.f34145y.setClipToPadding(false);
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).T0) {
            this.simpleActionBar.setBackButtonImage(2131231242);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new y01(this, 9));
        this.f34144x = this.simpleActionBar.n(org.telegram.messenger.cd.L0(2131745963, null));
        f0(false);
        h0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList<TL_account.TL_connectedBot> arrayList;
        if (i10 == org.telegram.messenger.zs.E0) {
            h0();
        } else if (i10 == org.telegram.messenger.zs.f19676r) {
            org.telegram.ui.Components.ii iiVar = this.f34145y;
            if (iiVar != null) {
                iiVar.f30819f3.O(true);
            }
        } else if (i10 == org.telegram.messenger.zs.f19638k0) {
            i0();
            org.telegram.ui.Components.ii iiVar2 = this.f34145y;
            if (iiVar2 != null) {
                iiVar2.f30819f3.O(true);
            }
        } else if (i10 == org.telegram.messenger.zs.Z3) {
            TL_account.connectedBots connectedbots = ag.k.a(this.currentAccount).f596c;
            if (connectedbots == null || (arrayList = connectedbots.connected_bots) == null) {
                arrayList = new ArrayList<>();
            }
            this.f34143w = arrayList;
            org.telegram.ui.Components.ii iiVar3 = this.f34145y;
            if (iiVar3 != null) {
                iiVar3.f30819f3.O(true);
            }
        }
    }

    public final void f0(boolean z10) {
        boolean z11;
        long j10;
        if (this.f34144x == null) {
            return;
        }
        String str = this.E;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (TextUtils.equals(str, this.e.getText().toString())) {
            String str3 = this.F;
            if (str3 == null) {
                str3 = "";
            }
            if (TextUtils.equals(str3, this.f34139f.getText().toString())) {
                String str4 = this.G;
                if (str4 != null) {
                    str2 = str4;
                }
                if (TextUtils.equals(str2, this.h.getText().toString()) && e0(this.H, this.J)) {
                    long j11 = this.I;
                    TLRPC.Chat chat = this.K;
                    if (chat != null) {
                        j10 = chat.f19793id;
                    } else {
                        j10 = 0;
                    }
                    if (j11 == j10) {
                        z11 = false;
                        this.f34144x.a(z11, z10);
                    }
                }
            }
        }
        z11 = true;
        this.f34144x.a(z11, z10);
    }

    public final void g0(boolean z10) {
        long j10;
        int i10;
        if (!this.f34144x.f20547y.f7021f) {
            if (z10 && TextUtils.isEmpty(this.e.getText())) {
                org.telegram.messenger.t2.APP_ERROR.a();
                yc1 yc1Var = this.e;
                int i11 = -this.Q;
                this.Q = i11;
                org.telegram.messenger.i0.F3(i11, yc1Var, null);
                return;
            }
            this.f34144x.b(true);
            TLRPC.User f7 = getUserConfig().f();
            TLRPC.UserFull a2 = getMessagesController().a2(getUserConfig().e());
            if (f7 != null && a2 != null) {
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(this.e.getText()) && (!TextUtils.equals(this.E, this.e.getText().toString()) || !TextUtils.equals(this.F, this.f34139f.getText().toString()) || !TextUtils.equals(this.G, this.h.getText().toString()))) {
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.flags |= 1;
                    String charSequence = this.e.getText().toString();
                    f7.first_name = charSequence;
                    updateprofile.first_name = charSequence;
                    updateprofile.flags |= 2;
                    String charSequence2 = this.f34139f.getText().toString();
                    f7.last_name = charSequence2;
                    updateprofile.last_name = charSequence2;
                    updateprofile.flags |= 4;
                    String charSequence3 = this.h.getText().toString();
                    a2.about = charSequence3;
                    updateprofile.about = charSequence3;
                    if (TextUtils.isEmpty(charSequence3)) {
                        i10 = a2.flags & (-3);
                    } else {
                        i10 = a2.flags | 2;
                    }
                    a2.flags = i10;
                    arrayList.add(updateprofile);
                }
                TL_account.TL_birthday tL_birthday = a2.birthday;
                if (!e0(this.H, this.J)) {
                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                    TL_account.TL_birthday tL_birthday2 = this.J;
                    if (tL_birthday2 != null) {
                        a2.flags2 |= 32;
                        a2.birthday = tL_birthday2;
                        updatebirthday.flags |= 1;
                        updatebirthday.birthday = tL_birthday2;
                    } else {
                        a2.flags2 &= -33;
                        a2.birthday = null;
                    }
                    arrayList.add(updatebirthday);
                    getMessagesController().l2();
                    org.telegram.messenger.zs.f(this.currentAccount).k(org.telegram.messenger.zs.f19619g5, new Object[0]);
                }
                long j11 = this.I;
                TLRPC.Chat chat = this.K;
                if (chat != null) {
                    j10 = chat.f19793id;
                } else {
                    j10 = 0;
                }
                if (j11 != j10) {
                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                    updatepersonalchannel.channel = org.telegram.messenger.vp.h1(this.K);
                    TLRPC.Chat chat2 = this.K;
                    if (chat2 != null) {
                        a2.flags |= 64;
                        long j12 = a2.personal_channel_id;
                        long j13 = chat2.f19793id;
                        if (j12 != j13) {
                            a2.personal_channel_message = 0;
                        }
                        a2.personal_channel_id = j13;
                    } else {
                        a2.flags &= -65;
                        a2.personal_channel_message = 0;
                        a2.personal_channel_id = 0L;
                    }
                    arrayList.add(updatepersonalchannel);
                }
                if (arrayList.isEmpty()) {
                    finishFragment();
                    return;
                }
                int[] iArr = {0};
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    TLObject tLObject = (TLObject) arrayList.get(i12);
                    getConnectionsManager().sendRequest(tLObject, new mg.e0(this, tLObject, tL_birthday, a2, iArr, arrayList, 2), 1024);
                }
                getMessagesStorage().j2(a2, false);
                getUserConfig().v(true);
                org.telegram.messenger.zs.f(this.currentAccount).k(org.telegram.messenger.zs.f19632j0, new Object[0]);
                org.telegram.messenger.zs f10 = org.telegram.messenger.zs.f(this.currentAccount);
                int i13 = org.telegram.messenger.vp.D8;
                f10.k(org.telegram.messenger.zs.f19676r, 1);
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.f34145y;
    }

    public final void h0() {
        boolean z10;
        org.telegram.ui.Components.p51 p51Var;
        if (!this.O) {
            TLRPC.UserFull a2 = getMessagesController().a2(getUserConfig().e());
            if (a2 == null) {
                getMessagesController().e3(getUserConfig().f(), true, getClassGuid());
                return;
            }
            TLRPC.User user = a2.user;
            if (user == null) {
                user = getUserConfig().f();
            }
            if (user == null) {
                return;
            }
            yc1 yc1Var = this.e;
            String str = user.first_name;
            this.E = str;
            yc1Var.setText(str);
            yc1 yc1Var2 = this.f34139f;
            String str2 = user.last_name;
            this.F = str2;
            yc1Var2.setText(str2);
            yc1 yc1Var3 = this.h;
            String str3 = a2.about;
            this.G = str3;
            yc1Var3.setText(str3);
            TL_account.TL_birthday tL_birthday = a2.birthday;
            this.H = tL_birthday;
            this.J = tL_birthday;
            if ((a2.flags2 & 64) != 0) {
                this.I = a2.personal_channel_id;
                this.K = getMessagesController().L0(Long.valueOf(this.I));
            } else {
                this.I = 0L;
                this.K = null;
            }
            boolean z11 = false;
            if (a2.business_work_hours != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.L = z10;
            if (a2.business_location != null) {
                z11 = true;
            }
            this.M = z11;
            f0(true);
            org.telegram.ui.Components.ii iiVar = this.f34145y;
            if (iiVar != null && (p51Var = iiVar.f30819f3) != null) {
                p51Var.O(true);
            }
            this.O = true;
        }
    }

    public final void i0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UserInfoActivity.i0():void");
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.zs.E0);
        getNotificationCenter().c(this, org.telegram.messenger.zs.f19638k0);
        getNotificationCenter().c(this, org.telegram.messenger.zs.f19676r);
        getNotificationCenter().c(this, org.telegram.messenger.zs.Z3);
        getContactsController().D(false);
        ag.k.a(this.currentAccount).c(null);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.zs.E0);
        getNotificationCenter().n(this, org.telegram.messenger.zs.f19638k0);
        getNotificationCenter().n(this, org.telegram.messenger.zs.f19676r);
        getNotificationCenter().n(this, org.telegram.messenger.zs.Z3);
        super.onFragmentDestroy();
        if (!this.P) {
            g0(false);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        zc1 zc1Var = this.N;
        zc1Var.f44124c = false;
        zc1Var.f44125f.add(new wc1(this, 1));
        if (!zc1Var.f44124c && !zc1Var.d) {
            zc1Var.d = true;
            TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
            tL_channels_getAdminedPublicChannels.for_personal = zc1Var.f44123b;
            ConnectionsManager.getInstance(zc1Var.f44122a).sendRequest(tL_channels_getAdminedPublicChannels, new k(zc1Var, 24));
        }
        this.f34142s = null;
        org.telegram.ui.Components.ii iiVar = this.f34145y;
        if (iiVar != null) {
            iiVar.f30819f3.O(true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
