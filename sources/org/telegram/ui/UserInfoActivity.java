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
public class UserInfoActivity extends org.telegram.ui.Components.n41 implements org.telegram.messenger.ls {
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
    public db1 f42066e;
    public db1 f42067f;
    public int firstNameRow;
    public db1 h;
    public int lastNameRow;
    public int logoutRow;
    public int numberRow;
    public CharSequence f42069r;
    public SpannableStringBuilder f42070s;
    public int usernameRow;
    public org.telegram.ui.ActionBar.b5 f42072x;
    public fi.w3 f42073y;
    public int f42068n = Integer.MIN_VALUE;
    public ArrayList f42071w = new ArrayList();
    public final ArrayList D = new ArrayList();
    public final eb1 N = new eb1(this.currentAccount);
    public boolean P = false;
    public int Q = -4;

    public static void d0(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        String str;
        if (tL_error != null) {
            userInfoActivity.f42072x.b(false);
            boolean z9 = tLObject instanceof TL_account.updateBirthday;
            if (z9 && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                if (userInfoActivity.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, userInfoActivity.getParentActivity(), userInfoActivity.resourceProvider);
                    String M0 = org.telegram.messenger.id.M0(2131746853, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.id.M0(2131746854, null);
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), null);
                    userInfoActivity.showDialog(u1Var);
                }
            } else {
                org.telegram.ui.Components.hc.d0(tL_error);
            }
            if (z9) {
                if (tL_birthday != null) {
                    userFull.flags |= 32;
                } else {
                    userFull.flags &= -33;
                }
                userFull.birthday = tL_birthday;
                userInfoActivity.getMessagesStorage().j2(userFull, false);
            }
        } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
            userInfoActivity.f42072x.b(false);
            org.telegram.messenger.k5.p(null, 2131743882, org.telegram.ui.Components.hc.a0(userInfoActivity), null);
        } else {
            userInfoActivity.P = true;
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
            return org.telegram.messenger.id.E0().o0().format(calendar.getTimeInMillis());
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2, tL_birthday.month - 1);
        calendar2.set(5, tL_birthday.day);
        return org.telegram.messenger.id.E0().q0().format(calendar2.getTimeInMillis());
    }

    public static boolean f0(TL_account.TL_birthday tL_birthday, TL_account.TL_birthday tL_birthday2) {
        boolean z9;
        boolean z10;
        if (tL_birthday == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (tL_birthday2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 == z10 || (tL_birthday != null && (tL_birthday.day != tL_birthday2.day || tL_birthday.month != tL_birthday2.month || tL_birthday.year != tL_birthday2.year))) {
            return false;
        }
        return true;
    }

    @Override
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.l41 l41Var) {
        boolean z9;
        int i7;
        int max;
        String str;
        int i10;
        ArrayList v;
        this.addAccountRow = -1;
        this.numberRow = -1;
        ArrayList arrayList2 = this.D;
        arrayList2.clear();
        for (int i11 = 0; i11 < 4; i11++) {
            if (org.telegram.messenger.p10.i(i11).p() && this.currentAccount != i11) {
                arrayList2.add(Integer.valueOf(i11));
            }
        }
        Collections.sort(arrayList2, new un0(5));
        arrayList.add(org.telegram.ui.Components.x31.u(org.telegram.messenger.id.M0(2131751225, null)));
        this.firstNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.x31.k(this.f42066e));
        this.lastNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.x31.k(this.f42067f));
        arrayList.add(org.telegram.ui.Components.x31.B(-1, null));
        this.bioRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.x31.k(this.h));
        arrayList.add(org.telegram.ui.Components.x31.C(this.f42069r));
        TLRPC.User f10 = getUserConfig().f();
        arrayList.add(org.telegram.ui.Components.x31.u(org.telegram.messenger.id.M0(2131751334, null)));
        if (f10 != null) {
            this.numberRow = arrayList.size();
            arrayList.add(i31.i(7, -11154873, -14175180, 2131232700, org.telegram.messenger.k5.i(new StringBuilder("+"), f10.phone, pf.b.c()), org.telegram.messenger.id.M0(2131744263, null), null));
        }
        this.usernameRow = arrayList.size();
        if (org.telegram.messenger.t10.n(f10) != null) {
            arrayList.add(i31.i(8, -1007845, -1996271, 2131231098, "@" + org.telegram.messenger.t10.n(f10), org.telegram.messenger.id.M0(2131743677, null), null));
        } else {
            arrayList.add(i31.i(8, -1007845, -1996271, 2131231098, org.telegram.messenger.id.M0(2131754363, null), null, null));
        }
        this.birthdayRow = arrayList.size();
        TL_account.TL_birthday tL_birthday = this.J;
        if (tL_birthday != null) {
            arrayList.add(i31.i(9, -14899731, -15431455, 2131231082, e0(tL_birthday), org.telegram.messenger.id.M0(2131751803, null), null));
        } else {
            arrayList.add(i31.i(9, -14899731, -15431455, 2131231082, org.telegram.messenger.id.M0(2131754464, null), null, null));
        }
        if (!getContactsController().t(11) && (v = getContactsController().v(11)) != null && this.f42070s == null) {
            String M0 = org.telegram.messenger.id.M0(2131751242, null);
            if (!v.isEmpty()) {
                int i12 = 0;
                while (true) {
                    if (i12 >= v.size()) {
                        break;
                    } else if (v.get(i12) instanceof TLRPC.TL_privacyValueAllowContacts) {
                        M0 = org.telegram.messenger.id.M0(2131751242, null);
                        break;
                    } else {
                        if ((v.get(i12) instanceof TLRPC.TL_privacyValueAllowAll) || (v.get(i12) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                            M0 = org.telegram.messenger.id.M0(2131751243, null);
                        }
                        i12++;
                    }
                }
            }
            this.f42070s = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(M0, new bb1(this, 2)), true);
        }
        arrayList.add(org.telegram.ui.Components.x31.C(this.f42070s));
        this.channelRow = arrayList.size();
        if (this.K == null) {
            arrayList.add(i31.i(3, -1007845, -1996271, 2131232147, org.telegram.messenger.id.M0(2131751232, null), null, org.telegram.messenger.id.M0(2131751237, null)));
        } else {
            arrayList.add(i31.i(3, -1007845, -1996271, 2131232147, org.telegram.messenger.id.M0(2131751232, null), this.K.title, null));
        }
        if (this.L) {
            arrayList.add(i31.i(4, -881871, -1940716, 2131231148, org.telegram.messenger.id.M0(2131751228, null), null, null));
        }
        if (this.M) {
            arrayList.add(i31.i(5, -765355, -2148011, 2131231129, org.telegram.messenger.id.M0(2131751226, null), null, null));
        }
        ArrayList arrayList3 = this.f42071w;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList4 = this.f42071w;
            int size = arrayList4.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList4.get(i13);
                i13++;
                TLRPC.User a22 = org.telegram.messenger.qp.s1(this.currentAccount).a2(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                if (a22 != null) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.t10.p(a22));
                }
            }
            arrayList.add(i31.i(6, -3903756, -6335009, 2131232568, org.telegram.messenger.id.M0(2131751231, null), sb2, null));
        } else {
            arrayList.add(i31.i(6, -3903756, -6335009, 2131232568, org.telegram.ui.Cells.m8.b(org.telegram.messenger.id.M0(2131751231, null)), null, null));
        }
        arrayList.add(org.telegram.ui.Components.x31.B(-3, org.telegram.messenger.id.M0(2131751230, null)));
        if (org.telegram.messenger.p10.c() < 4) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            this.addAccountRow = arrayList.size();
            String M02 = org.telegram.messenger.id.M0(2131754484, null);
            int i14 = fb1.f45531b;
            org.telegram.ui.Components.x31 K = org.telegram.ui.Components.x31.K(fb1.class);
            K.d = 10;
            K.f40179k = 2131232475;
            K.f40180l = M02;
            K.f40181m = null;
            K.f40193z = 0;
            K.f40185q = true;
            arrayList.add(K);
        }
        if (!arrayList2.isEmpty()) {
            if (!z9) {
                arrayList.add(org.telegram.ui.Components.x31.u(org.telegram.messenger.id.M0(2131745495, null)));
            }
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                int intValue = ((Integer) arrayList2.get(i15)).intValue();
                int i16 = g31.f45775b;
                org.telegram.ui.Components.x31 K2 = org.telegram.ui.Components.x31.K(g31.class);
                K2.d = i15;
                K2.f40193z = intValue;
                arrayList.add(K2);
            }
            if (!org.telegram.messenger.p10.o()) {
                if (org.telegram.messenger.p10.o()) {
                    i7 = 5;
                } else {
                    i7 = 3;
                }
                if (Math.max(0, i7 - org.telegram.messenger.p10.c()) > 0) {
                    str = org.telegram.messenger.id.H(',', "AddAccountInfo1", max) + " ";
                } else {
                    str = "";
                }
                if (org.telegram.messenger.p10.o()) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                arrayList.add(org.telegram.ui.Components.x31.C(TextUtils.concat(str, org.telegram.messenger.g0.U2(org.telegram.messenger.id.H(',', "AddAccountInfo2", i10), new bb1(this, 3)))));
            } else {
                arrayList.add(org.telegram.ui.Components.x31.C(null));
            }
        }
        this.logoutRow = arrayList.size();
        String M03 = org.telegram.messenger.id.M0(2131748744, null);
        int i17 = fb1.f45531b;
        org.telegram.ui.Components.x31 K3 = org.telegram.ui.Components.x31.K(fb1.class);
        K3.d = 11;
        K3.f40179k = 2131232195;
        K3.f40180l = M03;
        K3.f40181m = null;
        K3.f40193z = 0;
        K3.f40186r = true;
        arrayList.add(K3);
        arrayList.add(org.telegram.ui.Components.x31.B(-4, null));
    }

    @Override
    public final CharSequence a0() {
        return org.telegram.messenger.id.M0(2131751335, null);
    }

    @Override
    public final void b0(org.telegram.ui.Components.x31 x31Var, View view) {
        boolean z9;
        long j3;
        int i7 = 0;
        Integer num = null;
        if (x31Var.d == 10) {
            for (int i10 = 3; i10 >= 0; i10--) {
                if (!org.telegram.messenger.p10.i(i10).p()) {
                    i7++;
                    if (num == null) {
                        num = Integer.valueOf(i10);
                    }
                }
            }
            if (!org.telegram.messenger.p10.o()) {
                i7--;
            }
            if (i7 > 0 && num != null) {
                presentFragment(new ce0(num.intValue()));
            } else if (!org.telegram.messenger.p10.o()) {
                showDialog(new ug.i0(7, this.currentAccount, getParentActivity(), this, null));
            }
        } else if (x31Var.H(g31.class)) {
            int i11 = x31Var.f40193z;
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.O0(i11);
            }
        } else {
            int i12 = x31Var.d;
            if (i12 != 1 && i12 != 9) {
                if (i12 == 2) {
                    this.J = null;
                    fi.w3 w3Var = this.f42073y;
                    if (w3Var != null) {
                        w3Var.f37190f3.O(true);
                    }
                    g0(true);
                    return;
                } else if (i12 == 3) {
                    TLRPC.Chat chat = this.K;
                    if (chat == null) {
                        j3 = 0;
                    } else {
                        j3 = chat.f26956id;
                    }
                    presentFragment(new qq(this.N, j3, new cb1(this, 1)));
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
                    presentFragment(new org.telegram.ui.ActionBar.f2(null));
                    return;
                } else {
                    return;
                }
            }
            Activity parentActivity = getParentActivity();
            String M0 = org.telegram.messenger.id.M0(2131751239, null);
            String M02 = org.telegram.messenger.id.M0(2131751244, null);
            TL_account.TL_birthday tL_birthday = this.J;
            cb1 cb1Var = new cb1(this, 0);
            if (tL_birthday != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            showDialog((org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.l(parentActivity, M0, M02, tL_birthday, cb1Var, null, false, z9, getResourceProvider()).f14323b);
        }
    }

    @Override
    public final boolean c0(org.telegram.ui.Components.x31 x31Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        db1 db1Var = new db1(this, context, org.telegram.messenger.id.M0(2131751229, null), this.resourceProvider, 0);
        this.f42066e = db1Var;
        db1Var.setDivider(true);
        db1 db1Var2 = this.f42066e;
        db1Var2.getClass();
        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(db1Var2, 4);
        org.telegram.ui.Cells.i3 i3Var = db1Var2.d;
        i3Var.setImeOptions(6);
        i3Var.setOnEditorActionListener(new m.s2(fVar, 2));
        db1 db1Var3 = new db1(this, context, org.telegram.messenger.id.M0(2131751227, null), this.resourceProvider, 1);
        this.f42067f = db1Var3;
        org.telegram.ui.Cells.f fVar2 = new org.telegram.ui.Cells.f(db1Var3, 4);
        org.telegram.ui.Cells.i3 i3Var2 = db1Var3.d;
        i3Var2.setImeOptions(6);
        i3Var2.setOnEditorActionListener(new m.s2(fVar2, 2));
        String M0 = org.telegram.messenger.id.M0(2131751255, null);
        org.telegram.messenger.qp messagesController = getMessagesController();
        if (messagesController.getUserConfig().q()) {
            i7 = messagesController.Y4;
        } else {
            i7 = messagesController.X4;
        }
        db1 db1Var4 = new db1(this, context, M0, i7, this.resourceProvider);
        this.h = db1Var4;
        db1Var4.setShowLimitWhenEmpty(true);
        j0();
        this.f42069r = org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131751254, null), new bb1(this, 0));
        super.createView(context);
        fi.w3 w3Var = this.f36243a;
        this.f42073y = w3Var;
        w3Var.r1();
        this.f42073y.setSectionsDrawBackground(true);
        this.f42073y.setClipToPadding(false);
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new nt0(this, 18));
        this.f42072x = this.simpleActionBar.n(org.telegram.messenger.id.M0(2131745949, null));
        g0(false);
        i0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ArrayList<TL_account.TL_connectedBot> arrayList;
        if (i7 == org.telegram.messenger.qs.E0) {
            i0();
        } else if (i7 == org.telegram.messenger.qs.f25063r) {
            fi.w3 w3Var = this.f42073y;
            if (w3Var != null) {
                w3Var.f37190f3.O(true);
            }
        } else if (i7 == org.telegram.messenger.qs.f25025k0) {
            j0();
            fi.w3 w3Var2 = this.f42073y;
            if (w3Var2 != null) {
                w3Var2.f37190f3.O(true);
            }
        } else if (i7 == org.telegram.messenger.qs.Z3) {
            TL_account.connectedBots connectedbots = kg.f.a(this.currentAccount).f17368c;
            if (connectedbots == null || (arrayList = connectedbots.connected_bots) == null) {
                arrayList = new ArrayList<>();
            }
            this.f42071w = arrayList;
            fi.w3 w3Var3 = this.f42073y;
            if (w3Var3 != null) {
                w3Var3.f37190f3.O(true);
            }
        }
    }

    public final void g0(boolean z9) {
        boolean z10;
        long j3;
        if (this.f42072x == null) {
            return;
        }
        String str = this.E;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (TextUtils.equals(str, this.f42066e.getText().toString())) {
            String str3 = this.F;
            if (str3 == null) {
                str3 = "";
            }
            if (TextUtils.equals(str3, this.f42067f.getText().toString())) {
                String str4 = this.G;
                if (str4 != null) {
                    str2 = str4;
                }
                if (TextUtils.equals(str2, this.h.getText().toString()) && f0(this.H, this.J)) {
                    long j10 = this.I;
                    TLRPC.Chat chat = this.K;
                    if (chat != null) {
                        j3 = chat.f26956id;
                    } else {
                        j3 = 0;
                    }
                    if (j10 == j3) {
                        z10 = false;
                        this.f42072x.a(z10, z9);
                    }
                }
            }
        }
        z10 = true;
        this.f42072x.a(z10, z9);
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f42073y;
    }

    public final void h0(boolean z9) {
        long j3;
        int i7;
        if (!this.f42072x.f27358y.f55488f) {
            if (z9 && TextUtils.isEmpty(this.f42066e.getText())) {
                org.telegram.messenger.p2.APP_ERROR.a();
                db1 db1Var = this.f42066e;
                int i10 = -this.Q;
                this.Q = i10;
                org.telegram.messenger.g0.G3(i10, db1Var, null);
                return;
            }
            this.f42072x.b(true);
            TLRPC.User f10 = getUserConfig().f();
            TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
            if (f10 != null && b22 != null) {
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(this.f42066e.getText()) && (!TextUtils.equals(this.E, this.f42066e.getText().toString()) || !TextUtils.equals(this.F, this.f42067f.getText().toString()) || !TextUtils.equals(this.G, this.h.getText().toString()))) {
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.flags |= 1;
                    String charSequence = this.f42066e.getText().toString();
                    f10.first_name = charSequence;
                    updateprofile.first_name = charSequence;
                    updateprofile.flags |= 2;
                    String charSequence2 = this.f42067f.getText().toString();
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
                if (!f0(this.H, this.J)) {
                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                    TL_account.TL_birthday tL_birthday2 = this.J;
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
                    org.telegram.messenger.qs.f(this.currentAccount).k(org.telegram.messenger.qs.f25007g5, new Object[0]);
                }
                long j10 = this.I;
                TLRPC.Chat chat = this.K;
                if (chat != null) {
                    j3 = chat.f26956id;
                } else {
                    j3 = 0;
                }
                if (j10 != j3) {
                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                    updatepersonalchannel.channel = org.telegram.messenger.qp.i1(this.K);
                    TLRPC.Chat chat2 = this.K;
                    if (chat2 != null) {
                        b22.flags |= 64;
                        long j11 = b22.personal_channel_id;
                        long j12 = chat2.f26956id;
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
                    getConnectionsManager().sendRequest(tLObject, new bi.c8(this, tLObject, tL_birthday, b22, iArr, arrayList, 2), 1024);
                }
                getMessagesStorage().j2(b22, false);
                getUserConfig().v(true);
                org.telegram.messenger.qs.f(this.currentAccount).k(org.telegram.messenger.qs.f25020j0, new Object[0]);
                org.telegram.messenger.qs f11 = org.telegram.messenger.qs.f(this.currentAccount);
                int i12 = org.telegram.messenger.qp.C8;
                f11.k(org.telegram.messenger.qs.f25063r, 1);
            }
        }
    }

    public final void i0() {
        boolean z9;
        org.telegram.ui.Components.l41 l41Var;
        if (!this.O) {
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
            db1 db1Var = this.f42066e;
            String str = user.first_name;
            this.E = str;
            db1Var.setText(str);
            db1 db1Var2 = this.f42067f;
            String str2 = user.last_name;
            this.F = str2;
            db1Var2.setText(str2);
            db1 db1Var3 = this.h;
            String str3 = b22.about;
            this.G = str3;
            db1Var3.setText(str3);
            TL_account.TL_birthday tL_birthday = b22.birthday;
            this.H = tL_birthday;
            this.J = tL_birthday;
            if ((b22.flags2 & 64) != 0) {
                this.I = b22.personal_channel_id;
                this.K = getMessagesController().M0(Long.valueOf(this.I));
            } else {
                this.I = 0L;
                this.K = null;
            }
            boolean z10 = false;
            if (b22.business_work_hours != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.L = z9;
            if (b22.business_location != null) {
                z10 = true;
            }
            this.M = z10;
            g0(true);
            fi.w3 w3Var = this.f42073y;
            if (w3Var != null && (l41Var = w3Var.f37190f3) != null) {
                l41Var.O(true);
            }
            this.O = true;
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
        getNotificationCenter().c(this, org.telegram.messenger.qs.E0);
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25025k0);
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25063r);
        getNotificationCenter().c(this, org.telegram.messenger.qs.Z3);
        getContactsController().D(false);
        kg.f.a(this.currentAccount).c(null);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.qs.E0);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25025k0);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25063r);
        getNotificationCenter().n(this, org.telegram.messenger.qs.Z3);
        super.onFragmentDestroy();
        if (!this.P) {
            h0(false);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        eb1 eb1Var = this.N;
        eb1Var.f45258c = false;
        eb1Var.f45260f.add(new bb1(this, 1));
        if (!eb1Var.f45258c && !eb1Var.d) {
            eb1Var.d = true;
            TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
            tL_channels_getAdminedPublicChannels.for_personal = eb1Var.f45257b;
            ConnectionsManager.getInstance(eb1Var.f45256a).sendRequest(tL_channels_getAdminedPublicChannels, new l(eb1Var, 23));
        }
        this.f42070s = null;
        fi.w3 w3Var = this.f42073y;
        if (w3Var != null) {
            w3Var.f37190f3.O(true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
