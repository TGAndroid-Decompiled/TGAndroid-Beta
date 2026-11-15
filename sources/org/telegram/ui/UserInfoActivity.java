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
public class UserInfoActivity extends org.telegram.ui.Components.r41 implements org.telegram.messenger.is {
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
    public bb1 f43440e;
    public bb1 f43441f;
    public int firstNameRow;
    public bb1 h;
    public int lastNameRow;
    public int logoutRow;
    public int numberRow;
    public CharSequence f43443r;
    public SpannableStringBuilder f43444s;
    public int usernameRow;
    public org.telegram.ui.ActionBar.z4 f43446x;
    public bi.v3 f43447y;
    public int f43442n = Integer.MIN_VALUE;
    public ArrayList f43445w = new ArrayList();
    public final ArrayList E = new ArrayList();
    public final cb1 O = new cb1(this.currentAccount);
    public boolean Q = false;
    public int R = -4;

    public static void d0(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        String str;
        if (tL_error != null) {
            userInfoActivity.f43446x.b(false);
            boolean z10 = tLObject instanceof TL_account.updateBirthday;
            if (z10 && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                if (userInfoActivity.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, userInfoActivity.getParentActivity(), userInfoActivity.resourceProvider);
                    String M0 = org.telegram.messenger.hd.M0(2131746852, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    t1Var.S = M0;
                    t1Var.U = org.telegram.messenger.hd.M0(2131746853, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                    userInfoActivity.showDialog(t1Var);
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
            userInfoActivity.f43446x.b(false);
            org.telegram.messenger.k5.o(null, 2131743879, org.telegram.ui.Components.cc.a0(userInfoActivity), null);
        } else {
            userInfoActivity.Q = true;
            int i7 = iArr[0] + 1;
            iArr[0] = i7;
            if (i7 == arrayList.size()) {
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
            return org.telegram.messenger.hd.E0().o0().format(calendar.getTimeInMillis());
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2, tL_birthday.month - 1);
        calendar2.set(5, tL_birthday.day);
        return org.telegram.messenger.hd.E0().q0().format(calendar2.getTimeInMillis());
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
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.p41 p41Var) {
        boolean z10;
        int i7;
        int max;
        String str;
        ArrayList v;
        this.addAccountRow = -1;
        this.numberRow = -1;
        ArrayList arrayList2 = this.E;
        arrayList2.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (org.telegram.messenger.m10.i(i10).p() && this.currentAccount != i10) {
                arrayList2.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList2, new qv0(4));
        arrayList.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131751224, null)));
        this.firstNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.b41.k(this.f43440e));
        this.lastNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.b41.k(this.f43441f));
        arrayList.add(org.telegram.ui.Components.b41.B(-1, null));
        this.bioRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.b41.k(this.h));
        arrayList.add(org.telegram.ui.Components.b41.C(this.f43443r));
        TLRPC.User f10 = getUserConfig().f();
        arrayList.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131751333, null)));
        if (f10 != null) {
            this.numberRow = arrayList.size();
            arrayList.add(g31.i(7, -11154873, -14175180, 2131232701, org.telegram.messenger.k5.h(new StringBuilder("+"), f10.phone, pf.b.c()), org.telegram.messenger.hd.M0(2131744260, null), null));
        }
        this.usernameRow = arrayList.size();
        if (org.telegram.messenger.q10.n(f10) != null) {
            arrayList.add(g31.i(8, -1007845, -1996271, 2131231098, "@" + org.telegram.messenger.q10.n(f10), org.telegram.messenger.hd.M0(2131743674, null), null));
        } else {
            arrayList.add(g31.i(8, -1007845, -1996271, 2131231098, org.telegram.messenger.hd.M0(2131754363, null), null, null));
        }
        this.birthdayRow = arrayList.size();
        TL_account.TL_birthday tL_birthday = this.K;
        if (tL_birthday != null) {
            arrayList.add(g31.i(9, -14899731, -15431455, 2131231082, e0(tL_birthday), org.telegram.messenger.hd.M0(2131751803, null), null));
        } else {
            arrayList.add(g31.i(9, -14899731, -15431455, 2131231082, org.telegram.messenger.hd.M0(2131754464, null), null, null));
        }
        if (!getContactsController().t(11) && (v = getContactsController().v(11)) != null && this.f43444s == null) {
            String M0 = org.telegram.messenger.hd.M0(2131751241, null);
            if (!v.isEmpty()) {
                int i11 = 0;
                while (true) {
                    if (i11 >= v.size()) {
                        break;
                    } else if (v.get(i11) instanceof TLRPC.TL_privacyValueAllowContacts) {
                        M0 = org.telegram.messenger.hd.M0(2131751241, null);
                        break;
                    } else {
                        if ((v.get(i11) instanceof TLRPC.TL_privacyValueAllowAll) || (v.get(i11) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                            M0 = org.telegram.messenger.hd.M0(2131751242, null);
                        }
                        i11++;
                    }
                }
            }
            this.f43444s = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(M0, new za1(this, 2)), true);
        }
        arrayList.add(org.telegram.ui.Components.b41.C(this.f43444s));
        this.channelRow = arrayList.size();
        if (this.L == null) {
            arrayList.add(g31.i(3, -1007845, -1996271, 2131232148, org.telegram.messenger.hd.M0(2131751231, null), null, org.telegram.messenger.hd.M0(2131751236, null)));
        } else {
            arrayList.add(g31.i(3, -1007845, -1996271, 2131232148, org.telegram.messenger.hd.M0(2131751231, null), this.L.title, null));
        }
        if (this.M) {
            arrayList.add(g31.i(4, -881871, -1940716, 2131231148, org.telegram.messenger.hd.M0(2131751227, null), null, null));
        }
        if (this.N) {
            arrayList.add(g31.i(5, -765355, -2148011, 2131231129, org.telegram.messenger.hd.M0(2131751225, null), null, null));
        }
        ArrayList arrayList3 = this.f43445w;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList4 = this.f43445w;
            int size = arrayList4.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList4.get(i12);
                i12++;
                TLRPC.User a22 = org.telegram.messenger.np.s1(this.currentAccount).a2(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                if (a22 != null) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.q10.p(a22));
                }
            }
            arrayList.add(g31.i(6, -3903756, -6335009, 2131232569, org.telegram.messenger.hd.M0(2131751230, null), sb2, null));
        } else {
            arrayList.add(g31.i(6, -3903756, -6335009, 2131232569, org.telegram.ui.Cells.l8.b(org.telegram.messenger.hd.M0(2131751230, null)), null, null));
        }
        arrayList.add(org.telegram.ui.Components.b41.B(-3, org.telegram.messenger.hd.M0(2131751229, null)));
        if (org.telegram.messenger.m10.c() < 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.addAccountRow = arrayList.size();
            String M02 = org.telegram.messenger.hd.M0(2131754484, null);
            int i13 = db1.f46352b;
            org.telegram.ui.Components.b41 K = org.telegram.ui.Components.b41.K(db1.class);
            K.d = 10;
            K.f33180k = 2131232476;
            K.f33181l = M02;
            K.f33182m = null;
            K.f33194z = 0;
            K.f33186q = true;
            arrayList.add(K);
        }
        if (!arrayList2.isEmpty()) {
            if (!z10) {
                arrayList.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131745492, null)));
            }
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                int intValue = ((Integer) arrayList2.get(i14)).intValue();
                int i15 = e31.f46539b;
                org.telegram.ui.Components.b41 K2 = org.telegram.ui.Components.b41.K(e31.class);
                K2.d = i14;
                K2.f33194z = intValue;
                arrayList.add(K2);
            }
            if (!org.telegram.messenger.m10.o()) {
                int i16 = 5;
                if (org.telegram.messenger.m10.o()) {
                    i7 = 5;
                } else {
                    i7 = 3;
                }
                if (Math.max(0, i7 - org.telegram.messenger.m10.c()) > 0) {
                    str = org.telegram.messenger.hd.H(',', "AddAccountInfo1", max) + " ";
                } else {
                    str = "";
                }
                if (!org.telegram.messenger.m10.o()) {
                    i16 = 3;
                }
                arrayList.add(org.telegram.ui.Components.b41.C(TextUtils.concat(str, org.telegram.messenger.g0.U2(org.telegram.messenger.hd.H(',', "AddAccountInfo2", i16), new za1(this, 3)))));
            } else {
                arrayList.add(org.telegram.ui.Components.b41.C(null));
            }
        }
        this.logoutRow = arrayList.size();
        String M03 = org.telegram.messenger.hd.M0(2131748743, null);
        int i17 = db1.f46352b;
        org.telegram.ui.Components.b41 K3 = org.telegram.ui.Components.b41.K(db1.class);
        K3.d = 11;
        K3.f33180k = 2131232196;
        K3.f33181l = M03;
        K3.f33182m = null;
        K3.f33194z = 0;
        K3.f33187r = true;
        arrayList.add(K3);
        arrayList.add(org.telegram.ui.Components.b41.B(-4, null));
    }

    @Override
    public final CharSequence a0() {
        return org.telegram.messenger.hd.M0(2131751334, null);
    }

    @Override
    public final void b0(org.telegram.ui.Components.b41 b41Var, View view) {
        boolean z10;
        long j3;
        int i7 = 0;
        Integer num = null;
        if (b41Var.d == 10) {
            for (int i10 = 3; i10 >= 0; i10--) {
                if (!org.telegram.messenger.m10.i(i10).p()) {
                    i7++;
                    if (num == null) {
                        num = Integer.valueOf(i10);
                    }
                }
            }
            if (!org.telegram.messenger.m10.o()) {
                i7--;
            }
            if (i7 > 0 && num != null) {
                presentFragment(new ce0(num.intValue()));
            } else if (!org.telegram.messenger.m10.o()) {
                showDialog(new ug.j0(7, this.currentAccount, getParentActivity(), this, null));
            }
        } else if (b41Var.H(e31.class)) {
            int i11 = b41Var.f33194z;
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                launchActivity.O0(i11);
            }
        } else {
            int i12 = b41Var.d;
            if (i12 != 1 && i12 != 9) {
                if (i12 == 2) {
                    this.K = null;
                    bi.v3 v3Var = this.f43447y;
                    if (v3Var != null) {
                        v3Var.f39895g3.O(true);
                    }
                    g0(true);
                    return;
                } else if (i12 == 3) {
                    TLRPC.Chat chat = this.L;
                    if (chat == null) {
                        j3 = 0;
                    } else {
                        j3 = chat.f28051id;
                    }
                    presentFragment(new sq(this.O, j3, new ab1(this, 1)));
                    return;
                } else if (i12 == 5) {
                    presentFragment(new kg.a1());
                    return;
                } else if (i12 == 4) {
                    presentFragment(new kg.c1());
                    return;
                } else if (i12 == 6) {
                    presentFragment(new kg.q0());
                    return;
                } else if (i12 == 7) {
                    presentFragment(new g(3));
                    return;
                } else if (i12 == 8) {
                    presentFragment(new la(null));
                    return;
                } else if (i12 == 11) {
                    presentFragment(new org.telegram.ui.ActionBar.e2(null));
                    return;
                } else {
                    return;
                }
            }
            Activity parentActivity = getParentActivity();
            String M0 = org.telegram.messenger.hd.M0(2131751238, null);
            String M02 = org.telegram.messenger.hd.M0(2131751243, null);
            TL_account.TL_birthday tL_birthday = this.K;
            ab1 ab1Var = new ab1(this, 0);
            if (tL_birthday != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            showDialog((org.telegram.ui.ActionBar.u2) org.telegram.ui.Components.t4.l(parentActivity, M0, M02, tL_birthday, ab1Var, null, false, z10, getResourceProvider()).f25804b);
        }
    }

    @Override
    public final boolean c0(org.telegram.ui.Components.b41 b41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        bb1 bb1Var = new bb1(this, context, org.telegram.messenger.hd.M0(2131751228, null), this.resourceProvider, 0);
        this.f43440e = bb1Var;
        bb1Var.setDivider(true);
        bb1 bb1Var2 = this.f43440e;
        bb1Var2.getClass();
        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(bb1Var2, 5);
        org.telegram.ui.Cells.i3 i3Var = bb1Var2.d;
        i3Var.setImeOptions(6);
        i3Var.setOnEditorActionListener(new m.r2(fVar, 2));
        bb1 bb1Var3 = new bb1(this, context, org.telegram.messenger.hd.M0(2131751226, null), this.resourceProvider, 1);
        this.f43441f = bb1Var3;
        org.telegram.ui.Cells.f fVar2 = new org.telegram.ui.Cells.f(bb1Var3, 5);
        org.telegram.ui.Cells.i3 i3Var2 = bb1Var3.d;
        i3Var2.setImeOptions(6);
        i3Var2.setOnEditorActionListener(new m.r2(fVar2, 2));
        String M0 = org.telegram.messenger.hd.M0(2131751254, null);
        org.telegram.messenger.np messagesController = getMessagesController();
        if (messagesController.getUserConfig().q()) {
            i7 = messagesController.Z4;
        } else {
            i7 = messagesController.Y4;
        }
        bb1 bb1Var4 = new bb1(this, context, M0, i7, this.resourceProvider);
        this.h = bb1Var4;
        bb1Var4.setShowLimitWhenEmpty(true);
        j0();
        this.f43443r = org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131751253, null), new za1(this, 0));
        super.createView(context);
        bi.v3 v3Var = this.f38882a;
        this.f43447y = v3Var;
        v3Var.r1();
        this.f43447y.setSectionsDrawBackground(true);
        this.f43447y.setClipToPadding(false);
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var != null && ((ActionBarLayout) o4Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ct0(this, 19));
        this.f43446x = this.simpleActionBar.q(org.telegram.messenger.hd.M0(2131745946, null));
        g0(false);
        i0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ArrayList<TL_account.TL_connectedBot> arrayList;
        if (i7 == org.telegram.messenger.ns.E0) {
            i0();
        } else if (i7 == org.telegram.messenger.ns.f25559r) {
            bi.v3 v3Var = this.f43447y;
            if (v3Var != null) {
                v3Var.f39895g3.O(true);
            }
        } else if (i7 == org.telegram.messenger.ns.f25521k0) {
            j0();
            bi.v3 v3Var2 = this.f43447y;
            if (v3Var2 != null) {
                v3Var2.f39895g3.O(true);
            }
        } else if (i7 == org.telegram.messenger.ns.Z3) {
            TL_account.connectedBots connectedbots = kg.f.a(this.currentAccount).f17927c;
            if (connectedbots == null || (arrayList = connectedbots.connected_bots) == null) {
                arrayList = new ArrayList<>();
            }
            this.f43445w = arrayList;
            bi.v3 v3Var3 = this.f43447y;
            if (v3Var3 != null) {
                v3Var3.f39895g3.O(true);
            }
        }
    }

    public final void g0(boolean z10) {
        boolean z11;
        long j3;
        if (this.f43446x == null) {
            return;
        }
        String str = this.F;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (TextUtils.equals(str, this.f43440e.getText().toString())) {
            String str3 = this.G;
            if (str3 == null) {
                str3 = "";
            }
            if (TextUtils.equals(str3, this.f43441f.getText().toString())) {
                String str4 = this.H;
                if (str4 != null) {
                    str2 = str4;
                }
                if (TextUtils.equals(str2, this.h.getText().toString()) && f0(this.I, this.K)) {
                    long j10 = this.J;
                    TLRPC.Chat chat = this.L;
                    if (chat != null) {
                        j3 = chat.f28051id;
                    } else {
                        j3 = 0;
                    }
                    if (j10 == j3) {
                        z11 = false;
                        this.f43446x.a(z11, z10);
                    }
                }
            }
        }
        z11 = true;
        this.f43446x.a(z11, z10);
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f43447y;
    }

    public final void h0(boolean z10) {
        long j3;
        int i7;
        if (!this.f43446x.f29950y.f57082f) {
            if (z10 && TextUtils.isEmpty(this.f43440e.getText())) {
                org.telegram.messenger.p2.APP_ERROR.a();
                bb1 bb1Var = this.f43440e;
                int i10 = -this.R;
                this.R = i10;
                org.telegram.messenger.g0.F3(i10, bb1Var, null);
                return;
            }
            this.f43446x.b(true);
            TLRPC.User f10 = getUserConfig().f();
            TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
            if (f10 != null && b22 != null) {
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(this.f43440e.getText()) && (!TextUtils.equals(this.F, this.f43440e.getText().toString()) || !TextUtils.equals(this.G, this.f43441f.getText().toString()) || !TextUtils.equals(this.H, this.h.getText().toString()))) {
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.flags |= 1;
                    String charSequence = this.f43440e.getText().toString();
                    f10.first_name = charSequence;
                    updateprofile.first_name = charSequence;
                    updateprofile.flags |= 2;
                    String charSequence2 = this.f43441f.getText().toString();
                    f10.last_name = charSequence2;
                    updateprofile.last_name = charSequence2;
                    updateprofile.flags |= 4;
                    String charSequence3 = this.h.getText().toString();
                    b22.about = charSequence3;
                    updateprofile.about = charSequence3;
                    if (TextUtils.isEmpty(charSequence3)) {
                        i7 = b22.flags & (-3);
                    } else {
                        i7 = b22.flags | 2;
                    }
                    b22.flags = i7;
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
                    org.telegram.messenger.ns.f(this.currentAccount).k(org.telegram.messenger.ns.f25503g5, new Object[0]);
                }
                long j10 = this.J;
                TLRPC.Chat chat = this.L;
                if (chat != null) {
                    j3 = chat.f28051id;
                } else {
                    j3 = 0;
                }
                if (j10 != j3) {
                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                    updatepersonalchannel.channel = org.telegram.messenger.np.i1(this.L);
                    TLRPC.Chat chat2 = this.L;
                    if (chat2 != null) {
                        b22.flags |= 64;
                        long j11 = b22.personal_channel_id;
                        long j12 = chat2.f28051id;
                        if (j11 != j12) {
                            b22.personal_channel_message = 0;
                        }
                        b22.personal_channel_id = j12;
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
                    getConnectionsManager().sendRequest(tLObject, new di.u6(this, tLObject, tL_birthday, b22, iArr, arrayList, 2), 1024);
                }
                getMessagesStorage().j2(b22, false);
                getUserConfig().v(true);
                org.telegram.messenger.ns.f(this.currentAccount).k(org.telegram.messenger.ns.f25516j0, new Object[0]);
                org.telegram.messenger.ns f11 = org.telegram.messenger.ns.f(this.currentAccount);
                int i12 = org.telegram.messenger.np.D8;
                f11.k(org.telegram.messenger.ns.f25559r, 1);
            }
        }
    }

    public final void i0() {
        boolean z10;
        org.telegram.ui.Components.p41 p41Var;
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
            bb1 bb1Var = this.f43440e;
            String str = user.first_name;
            this.F = str;
            bb1Var.setText(str);
            bb1 bb1Var2 = this.f43441f;
            String str2 = user.last_name;
            this.G = str2;
            bb1Var2.setText(str2);
            bb1 bb1Var3 = this.h;
            String str3 = b22.about;
            this.H = str3;
            bb1Var3.setText(str3);
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
            bi.v3 v3Var = this.f43447y;
            if (v3Var != null && (p41Var = v3Var.f39895g3) != null) {
                p41Var.O(true);
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
        getNotificationCenter().c(this, org.telegram.messenger.ns.E0);
        getNotificationCenter().c(this, org.telegram.messenger.ns.f25521k0);
        getNotificationCenter().c(this, org.telegram.messenger.ns.f25559r);
        getNotificationCenter().c(this, org.telegram.messenger.ns.Z3);
        getContactsController().D(false);
        kg.f.a(this.currentAccount).c(null);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.ns.E0);
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25521k0);
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25559r);
        getNotificationCenter().n(this, org.telegram.messenger.ns.Z3);
        super.onFragmentDestroy();
        if (!this.Q) {
            h0(false);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        cb1 cb1Var = this.O;
        cb1Var.f46071c = false;
        cb1Var.f46073f.add(new za1(this, 1));
        if (!cb1Var.f46071c && !cb1Var.d) {
            cb1Var.d = true;
            TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
            tL_channels_getAdminedPublicChannels.for_personal = cb1Var.f46070b;
            ConnectionsManager.getInstance(cb1Var.f46069a).sendRequest(tL_channels_getAdminedPublicChannels, new l(cb1Var, 23));
        }
        this.f43444s = null;
        bi.v3 v3Var = this.f43447y;
        if (v3Var != null) {
            v3Var.f39895g3.O(true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
