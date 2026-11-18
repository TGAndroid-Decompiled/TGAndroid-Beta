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
public class UserInfoActivity extends org.telegram.ui.Components.b51 implements org.telegram.messenger.fs {
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
    public fb1 f43886e;
    public fb1 f43887f;
    public int firstNameRow;
    public fb1 h;
    public int lastNameRow;
    public int logoutRow;
    public int numberRow;
    public CharSequence f43889r;
    public SpannableStringBuilder f43890s;
    public int usernameRow;
    public org.telegram.ui.ActionBar.d5 f43892x;
    public bi.d6 f43893y;
    public int f43888n = Integer.MIN_VALUE;
    public ArrayList f43891w = new ArrayList();
    public final ArrayList E = new ArrayList();
    public final gb1 O = new gb1(this.currentAccount);
    public boolean Q = false;
    public int R = -4;

    public static void d0(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        String str;
        if (tL_error != null) {
            userInfoActivity.f43892x.b(false);
            boolean z10 = tLObject instanceof TL_account.updateBirthday;
            if (z10 && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                if (userInfoActivity.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, userInfoActivity.getParentActivity(), userInfoActivity.resourceProvider);
                    String M0 = org.telegram.messenger.gd.M0(2131746659, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                    u1Var.S = M0;
                    u1Var.U = org.telegram.messenger.gd.M0(2131746660, null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), null);
                    userInfoActivity.showDialog(u1Var);
                }
            } else {
                org.telegram.ui.Components.lc.e0(tL_error);
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
            userInfoActivity.f43892x.b(false);
            org.telegram.messenger.f3.o(null, 2131743642, org.telegram.ui.Components.lc.b0(userInfoActivity), null);
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
            return org.telegram.messenger.gd.E0().o0().format(calendar.getTimeInMillis());
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2, tL_birthday.month - 1);
        calendar2.set(5, tL_birthday.day);
        return org.telegram.messenger.gd.E0().q0().format(calendar2.getTimeInMillis());
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
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.z41 z41Var) {
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
            if (org.telegram.messenger.j10.i(i10).p() && this.currentAccount != i10) {
                arrayList2.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList2, new qw0(3));
        arrayList.add(org.telegram.ui.Components.l41.u(org.telegram.messenger.gd.M0(2131751213, null)));
        this.firstNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.l41.k(this.f43886e));
        this.lastNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.l41.k(this.f43887f));
        arrayList.add(org.telegram.ui.Components.l41.B(-1, null));
        this.bioRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.l41.k(this.h));
        arrayList.add(org.telegram.ui.Components.l41.C(this.f43889r));
        TLRPC.User f10 = getUserConfig().f();
        i5.c.s(2131751322, null, arrayList);
        if (f10 != null) {
            this.numberRow = arrayList.size();
            arrayList.add(k31.i(7, -11154873, -14175180, 2131232702, org.telegram.messenger.n10.h(new StringBuilder("+"), f10.phone, pf.b.c()), org.telegram.messenger.gd.M0(2131744025, null), null));
        }
        this.usernameRow = arrayList.size();
        if (org.telegram.messenger.o10.o(f10) != null) {
            arrayList.add(k31.i(8, -1007845, -1996271, 2131231098, "@" + org.telegram.messenger.o10.o(f10), org.telegram.messenger.gd.M0(2131743437, null), null));
        } else {
            arrayList.add(k31.i(8, -1007845, -1996271, 2131231098, org.telegram.messenger.gd.M0(2131754361, null), null, null));
        }
        this.birthdayRow = arrayList.size();
        TL_account.TL_birthday tL_birthday = this.K;
        if (tL_birthday != null) {
            arrayList.add(k31.i(9, -14899731, -15431455, 2131231082, e0(tL_birthday), org.telegram.messenger.gd.M0(2131751792, null), null));
        } else {
            arrayList.add(k31.i(9, -14899731, -15431455, 2131231082, org.telegram.messenger.gd.M0(2131754462, null), null, null));
        }
        if (!getContactsController().t(11) && (v = getContactsController().v(11)) != null && this.f43890s == null) {
            String M0 = org.telegram.messenger.gd.M0(2131751230, null);
            if (!v.isEmpty()) {
                int i11 = 0;
                while (true) {
                    if (i11 >= v.size()) {
                        break;
                    } else if (v.get(i11) instanceof TLRPC.TL_privacyValueAllowContacts) {
                        M0 = org.telegram.messenger.gd.M0(2131751230, null);
                        break;
                    } else {
                        if ((v.get(i11) instanceof TLRPC.TL_privacyValueAllowAll) || (v.get(i11) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                            M0 = org.telegram.messenger.gd.M0(2131751231, null);
                        }
                        i11++;
                    }
                }
            }
            this.f43890s = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(M0, new db1(this, 2)), true);
        }
        arrayList.add(org.telegram.ui.Components.l41.C(this.f43890s));
        this.channelRow = arrayList.size();
        if (this.L == null) {
            arrayList.add(k31.i(3, -1007845, -1996271, 2131232149, org.telegram.messenger.gd.M0(2131751220, null), null, org.telegram.messenger.gd.M0(2131751225, null)));
        } else {
            arrayList.add(k31.i(3, -1007845, -1996271, 2131232149, org.telegram.messenger.gd.M0(2131751220, null), this.L.title, null));
        }
        if (this.M) {
            arrayList.add(k31.i(4, -881871, -1940716, 2131231148, org.telegram.messenger.gd.M0(2131751216, null), null, null));
        }
        if (this.N) {
            arrayList.add(k31.i(5, -765355, -2148011, 2131231129, org.telegram.messenger.gd.M0(2131751214, null), null, null));
        }
        ArrayList arrayList3 = this.f43891w;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList4 = this.f43891w;
            int size = arrayList4.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList4.get(i12);
                i12++;
                TLRPC.User c22 = org.telegram.messenger.mp.u1(this.currentAccount).c2(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                if (c22 != null) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.o10.q(c22));
                }
            }
            arrayList.add(k31.i(6, -3903756, -6335009, 2131232570, org.telegram.messenger.gd.M0(2131751219, null), sb2, null));
        } else {
            arrayList.add(k31.i(6, -3903756, -6335009, 2131232570, org.telegram.ui.Cells.m8.b(org.telegram.messenger.gd.M0(2131751219, null)), null, null));
        }
        arrayList.add(org.telegram.ui.Components.l41.B(-3, org.telegram.messenger.gd.M0(2131751218, null)));
        if (org.telegram.messenger.j10.c() < 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.addAccountRow = arrayList.size();
            String M02 = org.telegram.messenger.gd.M0(2131754482, null);
            int i13 = hb1.f48324b;
            org.telegram.ui.Components.l41 K = org.telegram.ui.Components.l41.K(hb1.class);
            K.d = 10;
            K.f37016k = 2131232477;
            K.f37018m = M02;
            K.f37019n = null;
            K.A = 0;
            K.f37023r = true;
            arrayList.add(K);
        }
        if (!arrayList2.isEmpty()) {
            if (!z10) {
                i5.c.s(2131745297, null, arrayList);
            }
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                int intValue = ((Integer) arrayList2.get(i14)).intValue();
                int i15 = i31.f48570b;
                org.telegram.ui.Components.l41 K2 = org.telegram.ui.Components.l41.K(i31.class);
                K2.d = i14;
                K2.A = intValue;
                arrayList.add(K2);
            }
            if (!org.telegram.messenger.j10.o()) {
                int i16 = 5;
                if (org.telegram.messenger.j10.o()) {
                    i7 = 5;
                } else {
                    i7 = 3;
                }
                if (Math.max(0, i7 - org.telegram.messenger.j10.c()) > 0) {
                    str = org.telegram.messenger.gd.H(',', "AddAccountInfo1", max) + " ";
                } else {
                    str = "";
                }
                if (!org.telegram.messenger.j10.o()) {
                    i16 = 3;
                }
                arrayList.add(org.telegram.ui.Components.l41.C(TextUtils.concat(str, org.telegram.messenger.g0.T2(org.telegram.messenger.gd.H(',', "AddAccountInfo2", i16), new db1(this, 3)))));
            } else {
                arrayList.add(org.telegram.ui.Components.l41.C(null));
            }
        }
        this.logoutRow = arrayList.size();
        String M03 = org.telegram.messenger.gd.M0(2131748551, null);
        int i17 = hb1.f48324b;
        org.telegram.ui.Components.l41 K3 = org.telegram.ui.Components.l41.K(hb1.class);
        K3.d = 11;
        K3.f37016k = 2131232197;
        K3.f37018m = M03;
        K3.f37019n = null;
        K3.A = 0;
        K3.f37024s = true;
        arrayList.add(K3);
        arrayList.add(org.telegram.ui.Components.l41.B(-4, null));
    }

    @Override
    public final CharSequence a0() {
        return org.telegram.messenger.gd.M0(2131751323, null);
    }

    @Override
    public final void b0(org.telegram.ui.Components.l41 l41Var, View view) {
        boolean z10;
        long j3;
        int i7 = 0;
        Integer num = null;
        if (l41Var.d == 10) {
            for (int i10 = 3; i10 >= 0; i10--) {
                if (!org.telegram.messenger.j10.i(i10).p()) {
                    i7++;
                    if (num == null) {
                        num = Integer.valueOf(i10);
                    }
                }
            }
            if (!org.telegram.messenger.j10.o()) {
                i7--;
            }
            if (i7 > 0 && num != null) {
                presentFragment(new de0(num.intValue()));
            } else if (!org.telegram.messenger.j10.o()) {
                showDialog(new ug.l0(7, this.currentAccount, getParentActivity(), this, null));
            }
        } else if (l41Var.H(i31.class)) {
            int i11 = l41Var.A;
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                launchActivity.O0(i11);
            }
        } else {
            int i12 = l41Var.d;
            if (i12 != 1 && i12 != 9) {
                if (i12 == 2) {
                    this.K = null;
                    bi.d6 d6Var = this.f43893y;
                    if (d6Var != null) {
                        d6Var.f34607g3.O(true);
                    }
                    g0(true);
                    return;
                } else if (i12 == 3) {
                    TLRPC.Chat chat = this.L;
                    if (chat == null) {
                        j3 = 0;
                    } else {
                        j3 = chat.f28405id;
                    }
                    presentFragment(new tq(this.O, j3, new eb1(this, 1)));
                    return;
                } else if (i12 == 5) {
                    presentFragment(new kg.d1());
                    return;
                } else if (i12 == 4) {
                    presentFragment(new kg.f1());
                    return;
                } else if (i12 == 6) {
                    presentFragment(new kg.t0());
                    return;
                } else if (i12 == 7) {
                    presentFragment(new g(3));
                    return;
                } else if (i12 == 8) {
                    presentFragment(new la(null));
                    return;
                } else if (i12 == 11) {
                    presentFragment(new org.telegram.ui.ActionBar.h2(null));
                    return;
                } else {
                    return;
                }
            }
            Activity parentActivity = getParentActivity();
            String M0 = org.telegram.messenger.gd.M0(2131751227, null);
            String M02 = org.telegram.messenger.gd.M0(2131751232, null);
            TL_account.TL_birthday tL_birthday = this.K;
            eb1 eb1Var = new eb1(this, 0);
            if (tL_birthday != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            showDialog((org.telegram.ui.ActionBar.x2) org.telegram.ui.Components.b5.l(parentActivity, M0, M02, tL_birthday, eb1Var, null, false, z10, getResourceProvider()).f15645b);
        }
    }

    @Override
    public final boolean c0(org.telegram.ui.Components.l41 l41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        fb1 fb1Var = new fb1(this, context, org.telegram.messenger.gd.M0(2131751217, null), this.resourceProvider, 0);
        this.f43886e = fb1Var;
        fb1Var.setDivider(true);
        fb1 fb1Var2 = this.f43886e;
        fb1Var2.getClass();
        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(fb1Var2, 5);
        org.telegram.ui.Cells.i3 i3Var = fb1Var2.d;
        i3Var.setImeOptions(6);
        i3Var.setOnEditorActionListener(new m.r2(fVar, 2));
        fb1 fb1Var3 = new fb1(this, context, org.telegram.messenger.gd.M0(2131751215, null), this.resourceProvider, 1);
        this.f43887f = fb1Var3;
        org.telegram.ui.Cells.f fVar2 = new org.telegram.ui.Cells.f(fb1Var3, 5);
        org.telegram.ui.Cells.i3 i3Var2 = fb1Var3.d;
        i3Var2.setImeOptions(6);
        i3Var2.setOnEditorActionListener(new m.r2(fVar2, 2));
        String M0 = org.telegram.messenger.gd.M0(2131751243, null);
        org.telegram.messenger.mp messagesController = getMessagesController();
        if (messagesController.getUserConfig().q()) {
            i7 = messagesController.f25611b5;
        } else {
            i7 = messagesController.f25601a5;
        }
        fb1 fb1Var4 = new fb1(this, context, M0, i7, this.resourceProvider);
        this.h = fb1Var4;
        fb1Var4.setShowLimitWhenEmpty(true);
        j0();
        this.f43889r = org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(2131751242, null), new db1(this, 0));
        super.createView(context);
        bi.d6 d6Var = this.f33530a;
        this.f43893y = d6Var;
        d6Var.r1();
        this.f43893y.setSectionsDrawBackground(true);
        this.f43893y.setClipToPadding(false);
        org.telegram.ui.ActionBar.s4 s4Var = this.parentLayout;
        if (s4Var != null && ((ActionBarLayout) s4Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new hs0(this, 21));
        this.f43892x = this.simpleActionBar.s(org.telegram.messenger.gd.M0(2131745751, null));
        g0(false);
        i0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ArrayList<TL_account.TL_connectedBot> arrayList;
        if (i7 == org.telegram.messenger.ks.E0) {
            i0();
        } else if (i7 == org.telegram.messenger.ks.f25179r) {
            bi.d6 d6Var = this.f43893y;
            if (d6Var != null) {
                d6Var.f34607g3.O(true);
            }
        } else if (i7 == org.telegram.messenger.ks.f25141k0) {
            j0();
            bi.d6 d6Var2 = this.f43893y;
            if (d6Var2 != null) {
                d6Var2.f34607g3.O(true);
            }
        } else if (i7 == org.telegram.messenger.ks.f25093b4) {
            TL_account.connectedBots connectedbots = kg.f.a(this.currentAccount).f18309c;
            if (connectedbots == null || (arrayList = connectedbots.connected_bots) == null) {
                arrayList = new ArrayList<>();
            }
            this.f43891w = arrayList;
            bi.d6 d6Var3 = this.f43893y;
            if (d6Var3 != null) {
                d6Var3.f34607g3.O(true);
            }
        }
    }

    public final void g0(boolean z10) {
        boolean z11;
        long j3;
        if (this.f43892x == null) {
            return;
        }
        String str = this.F;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (TextUtils.equals(str, this.f43886e.getText().toString())) {
            String str3 = this.G;
            if (str3 == null) {
                str3 = "";
            }
            if (TextUtils.equals(str3, this.f43887f.getText().toString())) {
                String str4 = this.H;
                if (str4 != null) {
                    str2 = str4;
                }
                if (TextUtils.equals(str2, this.h.getText().toString()) && f0(this.I, this.K)) {
                    long j10 = this.J;
                    TLRPC.Chat chat = this.L;
                    if (chat != null) {
                        j3 = chat.f28405id;
                    } else {
                        j3 = 0;
                    }
                    if (j10 == j3) {
                        z11 = false;
                        this.f43892x.a(z11, z10);
                    }
                }
            }
        }
        z11 = true;
        this.f43892x.a(z11, z10);
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.f43893y;
    }

    public final void h0(boolean z10) {
        long j3;
        int i7;
        if (!this.f43892x.f28873y.f57658f) {
            if (z10 && TextUtils.isEmpty(this.f43886e.getText())) {
                org.telegram.messenger.q2.APP_ERROR.a();
                fb1 fb1Var = this.f43886e;
                int i10 = -this.R;
                this.R = i10;
                org.telegram.messenger.g0.E3(i10, fb1Var, null);
                return;
            }
            this.f43892x.b(true);
            TLRPC.User f10 = getUserConfig().f();
            TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
            if (f10 != null && d2 != null) {
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(this.f43886e.getText()) && (!TextUtils.equals(this.F, this.f43886e.getText().toString()) || !TextUtils.equals(this.G, this.f43887f.getText().toString()) || !TextUtils.equals(this.H, this.h.getText().toString()))) {
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.flags |= 1;
                    String charSequence = this.f43886e.getText().toString();
                    f10.first_name = charSequence;
                    updateprofile.first_name = charSequence;
                    updateprofile.flags |= 2;
                    String charSequence2 = this.f43887f.getText().toString();
                    f10.last_name = charSequence2;
                    updateprofile.last_name = charSequence2;
                    updateprofile.flags |= 4;
                    String charSequence3 = this.h.getText().toString();
                    d2.about = charSequence3;
                    updateprofile.about = charSequence3;
                    if (TextUtils.isEmpty(charSequence3)) {
                        i7 = d2.flags & (-3);
                    } else {
                        i7 = d2.flags | 2;
                    }
                    d2.flags = i7;
                    arrayList.add(updateprofile);
                }
                TL_account.TL_birthday tL_birthday = d2.birthday;
                if (!f0(this.I, this.K)) {
                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                    TL_account.TL_birthday tL_birthday2 = this.K;
                    if (tL_birthday2 != null) {
                        d2.flags2 |= 32;
                        d2.birthday = tL_birthday2;
                        updatebirthday.flags |= 1;
                        updatebirthday.birthday = tL_birthday2;
                    } else {
                        d2.flags2 &= -33;
                        d2.birthday = null;
                    }
                    arrayList.add(updatebirthday);
                    getMessagesController().o2();
                    org.telegram.messenger.ks.f(this.currentAccount).k(org.telegram.messenger.ks.f25135i5, new Object[0]);
                }
                long j10 = this.J;
                TLRPC.Chat chat = this.L;
                if (chat != null) {
                    j3 = chat.f28405id;
                } else {
                    j3 = 0;
                }
                if (j10 != j3) {
                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                    updatepersonalchannel.channel = org.telegram.messenger.mp.k1(this.L);
                    TLRPC.Chat chat2 = this.L;
                    if (chat2 != null) {
                        d2.flags |= 64;
                        long j11 = d2.personal_channel_id;
                        long j12 = chat2.f28405id;
                        if (j11 != j12) {
                            d2.personal_channel_message = 0;
                        }
                        d2.personal_channel_id = j12;
                    } else {
                        d2.flags &= -65;
                        d2.personal_channel_message = 0;
                        d2.personal_channel_id = 0L;
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
                    getConnectionsManager().sendRequest(tLObject, new di.x6(this, tLObject, tL_birthday, d2, iArr, arrayList, 2), 1024);
                }
                getMessagesStorage().j2(d2, false);
                getUserConfig().v(true);
                org.telegram.messenger.ks.f(this.currentAccount).k(org.telegram.messenger.ks.f25136j0, new Object[0]);
                org.telegram.messenger.ks f11 = org.telegram.messenger.ks.f(this.currentAccount);
                int i12 = org.telegram.messenger.mp.I8;
                f11.k(org.telegram.messenger.ks.f25179r, 1);
            }
        }
    }

    public final void i0() {
        boolean z10;
        org.telegram.ui.Components.z41 z41Var;
        if (!this.P) {
            TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
            if (d2 == null) {
                getMessagesController().n3(getUserConfig().f(), true, getClassGuid());
                return;
            }
            TLRPC.User user = d2.user;
            if (user == null) {
                user = getUserConfig().f();
            }
            if (user == null) {
                return;
            }
            fb1 fb1Var = this.f43886e;
            String str = user.first_name;
            this.F = str;
            fb1Var.setText(str);
            fb1 fb1Var2 = this.f43887f;
            String str2 = user.last_name;
            this.G = str2;
            fb1Var2.setText(str2);
            fb1 fb1Var3 = this.h;
            String str3 = d2.about;
            this.H = str3;
            fb1Var3.setText(str3);
            TL_account.TL_birthday tL_birthday = d2.birthday;
            this.I = tL_birthday;
            this.K = tL_birthday;
            if ((d2.flags2 & 64) != 0) {
                this.J = d2.personal_channel_id;
                this.L = getMessagesController().O0(Long.valueOf(this.J));
            } else {
                this.J = 0L;
                this.L = null;
            }
            boolean z11 = false;
            if (d2.business_work_hours != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.M = z10;
            if (d2.business_location != null) {
                z11 = true;
            }
            this.N = z11;
            g0(true);
            bi.d6 d6Var = this.f43893y;
            if (d6Var != null && (z41Var = d6Var.f34607g3) != null) {
                z41Var.O(true);
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
        getNotificationCenter().c(this, org.telegram.messenger.ks.E0);
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25141k0);
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25179r);
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25093b4);
        getContactsController().D(false);
        kg.f.a(this.currentAccount).c(null);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.ks.E0);
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25141k0);
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25179r);
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25093b4);
        super.onFragmentDestroy();
        if (!this.Q) {
            h0(false);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        gb1 gb1Var = this.O;
        gb1Var.f48020c = false;
        gb1Var.f48022f.add(new db1(this, 1));
        if (!gb1Var.f48020c && !gb1Var.d) {
            gb1Var.d = true;
            TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
            tL_channels_getAdminedPublicChannels.for_personal = gb1Var.f48019b;
            ConnectionsManager.getInstance(gb1Var.f48018a).sendRequest(tL_channels_getAdminedPublicChannels, new l(gb1Var, 23));
        }
        this.f43890s = null;
        bi.d6 d6Var = this.f43893y;
        if (d6Var != null) {
            d6Var.f34607g3.O(true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
