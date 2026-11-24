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
public class UserInfoActivity extends n7c implements jm7 {
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
    public c9c e;
    public c9c f;
    public int firstNameRow;
    public c9c h;
    public int lastNameRow;
    public int logoutRow;
    public int numberRow;
    public CharSequence r;
    public SpannableStringBuilder s;
    public int usernameRow;
    public uja x;
    public va y;
    public int n = Integer.MIN_VALUE;
    public ArrayList w = new ArrayList();
    public final ArrayList E = new ArrayList();
    public final d9c O = new d9c(this.currentAccount);
    public boolean Q = false;
    public int R = -4;

    public static String d0(TL_account.TL_birthday tL_birthday) {
        if (tL_birthday == null) {
            return "—";
        }
        if ((tL_birthday.flags & 1) != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(1, tL_birthday.year);
            calendar.set(2, tL_birthday.month - 1);
            calendar.set(5, tL_birthday.day);
            return jb6.D0().n0().format(calendar.getTimeInMillis());
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2, tL_birthday.month - 1);
        calendar2.set(5, tL_birthday.day);
        return jb6.D0().p0().format(calendar2.getTimeInMillis());
    }

    public static boolean e0(TL_account.TL_birthday tL_birthday, TL_account.TL_birthday tL_birthday2) {
        boolean z;
        boolean z2;
        if (tL_birthday == null) {
            z = true;
        } else {
            z = false;
        }
        if (tL_birthday2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z == z2 || (tL_birthday != null && (tL_birthday.day != tL_birthday2.day || tL_birthday.month != tL_birthday2.month || tL_birthday.year != tL_birthday2.year))) {
            return false;
        }
        return true;
    }

    @Override
    public final void Z(ArrayList arrayList, l7c l7cVar) {
        ArrayList arrayList2;
        boolean z;
        int i;
        String str;
        ArrayList v;
        this.addAccountRow = -1;
        this.numberRow = -1;
        ArrayList arrayList3 = this.E;
        arrayList3.clear();
        for (int i2 = 0; i2 < 4; i2++) {
            if (z8c.h(i2).o() && this.currentAccount != i2) {
                arrayList3.add(Integer.valueOf(i2));
            }
        }
        Collections.sort(arrayList3, new zua((byte) 10));
        arrayList.add(c6c.u(jb6.M0(2131751161, null)));
        this.firstNameRow = arrayList.size();
        arrayList.add(c6c.k(this.e));
        this.lastNameRow = arrayList.size();
        arrayList.add(c6c.k(this.f));
        arrayList.add(c6c.B(-1, null));
        this.bioRow = arrayList.size();
        arrayList.add(c6c.k(this.h));
        arrayList.add(c6c.C(this.r));
        TLRPC.User f = getUserConfig().f();
        aq1.o(2131751270, null, arrayList);
        if (f != null) {
            this.numberRow = arrayList.size();
            arrayList.add(z9a.i(7, -11154873, -14175180, 2131232717, mlb.l(new StringBuilder("+"), f.phone, r58.f()), jb6.M0(2131743945, null), null));
        }
        this.usernameRow = arrayList.size();
        if (m9c.p(f) != null) {
            arrayList.add(z9a.i(8, -1007845, -1996271, 2131231101, "@" + m9c.p(f), jb6.M0(2131743361, null), null));
        } else {
            arrayList.add(z9a.i(8, -1007845, -1996271, 2131231101, jb6.M0(2131754360, null), null, null));
        }
        this.birthdayRow = arrayList.size();
        TL_account.TL_birthday tL_birthday = this.K;
        if (tL_birthday != null) {
            arrayList.add(z9a.i(9, -14899731, -15431455, 2131231085, d0(tL_birthday), jb6.M0(2131751740, null), null));
        } else {
            arrayList.add(z9a.i(9, -14899731, -15431455, 2131231085, jb6.M0(2131754461, null), null, null));
        }
        if (!getContactsController().t(11) && (v = getContactsController().v(11)) != null && this.s == null) {
            String M0 = jb6.M0(2131751178, null);
            if (!v.isEmpty()) {
                int i3 = 0;
                while (true) {
                    if (i3 >= v.size()) {
                        break;
                    } else if (v.get(i3) instanceof TLRPC.TL_privacyValueAllowContacts) {
                        M0 = jb6.M0(2131751178, null);
                        break;
                    } else {
                        if ((v.get(i3) instanceof TLRPC.TL_privacyValueAllowAll) || (v.get(i3) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                            M0 = jb6.M0(2131751179, null);
                        }
                        i3++;
                    }
                }
            }
            this.s = gm.D2(gm.N2(M0, -1, 0, new a9c(this, (byte) 2), null), true);
        }
        arrayList.add(c6c.C(this.s));
        this.channelRow = arrayList.size();
        if (this.L == null) {
            arrayList.add(z9a.i(3, -1007845, -1996271, 2131232153, jb6.M0(2131751168, null), null, jb6.M0(2131751173, null)));
        } else {
            arrayList.add(z9a.i(3, -1007845, -1996271, 2131232153, jb6.M0(2131751168, null), this.L.title, null));
        }
        if (this.M) {
            arrayList.add(z9a.i(4, -881871, -1940716, 2131231151, jb6.M0(2131751164, null), null, null));
        }
        if (this.N) {
            arrayList.add(z9a.i(5, -765355, -2148011, 2131231132, jb6.M0(2131751162, null), null, null));
        }
        ArrayList arrayList4 = this.w;
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList5 = this.w;
            int size = arrayList5.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList5.get(i4);
                i4++;
                ArrayList arrayList6 = arrayList3;
                TLRPC.User W1 = oc7.r1(this.currentAccount).W1(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                if (W1 != null) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(m9c.r(W1));
                }
                arrayList3 = arrayList6;
            }
            arrayList2 = arrayList3;
            arrayList.add(z9a.i(6, -3903756, -6335009, 2131232585, jb6.M0(2131751167, null), sb, null));
        } else {
            arrayList2 = arrayList3;
            arrayList.add(z9a.i(6, -3903756, -6335009, 2131232585, xib.b(jb6.M0(2131751167, null)), null, null));
        }
        arrayList.add(c6c.B(-3, jb6.M0(2131751166, null)));
        if (z8c.c() < 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.addAccountRow = arrayList.size();
            String M02 = jb6.M0(2131754481, null);
            int i5 = e9c.b;
            c6c K = c6c.K(e9c.class);
            K.d = 10;
            K.k = 2131232492;
            K.m = M02;
            K.n = null;
            K.A = 0;
            K.r = true;
            arrayList.add(K);
        }
        if (!arrayList2.isEmpty()) {
            if (!z) {
                aq1.o(2131745226, null, arrayList);
            }
            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                int intValue = ((Integer) arrayList2.get(i6)).intValue();
                int i7 = x9a.b;
                c6c K2 = c6c.K(x9a.class);
                K2.d = i6;
                K2.A = intValue;
                arrayList.add(K2);
            }
            if (!z8c.n()) {
                int i8 = 5;
                if (z8c.n()) {
                    i = 5;
                } else {
                    i = 3;
                }
                int max = Math.max(0, i - z8c.c());
                if (max > 0) {
                    str = jb6.H(',', "AddAccountInfo1", max).concat(" ");
                } else {
                    str = "";
                }
                if (!z8c.n()) {
                    i8 = 3;
                }
                arrayList.add(c6c.C(TextUtils.concat(str, gm.N2(jb6.H(',', "AddAccountInfo2", i8), -1, 0, new a9c(this, (byte) 3), null))));
            } else {
                arrayList.add(c6c.C(null));
            }
        }
        this.logoutRow = arrayList.size();
        String M03 = jb6.M0(2131748500, null);
        int i9 = e9c.b;
        c6c K3 = c6c.K(e9c.class);
        K3.d = 11;
        K3.k = 2131232201;
        K3.m = M03;
        K3.n = null;
        K3.A = 0;
        K3.s = true;
        arrayList.add(K3);
        arrayList.add(c6c.B(-4, null));
    }

    @Override
    public final CharSequence a0() {
        return jb6.M0(2131751271, null);
    }

    @Override
    public final void b0(c6c c6cVar, View view) {
        boolean z;
        long j;
        int i = 0;
        Integer num = null;
        if (c6cVar.d == 10) {
            for (int i2 = 3; i2 >= 0; i2--) {
                if (!z8c.h(i2).o()) {
                    i++;
                    if (num == null) {
                        num = Integer.valueOf(i2);
                    }
                }
            }
            if (!z8c.n()) {
                i--;
            }
            if (i > 0 && num != null) {
                presentFragment(new mh6(num.intValue()));
            } else if (!z8c.n()) {
                showDialog(new i46(7, this.currentAccount, null, getParentActivity(), this));
            }
        } else if (c6cVar.H(x9a.class)) {
            int i3 = c6cVar.A;
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                launchActivity.N0(i3);
            }
        } else {
            int i4 = c6cVar.d;
            if (i4 != 1 && i4 != 9) {
                if (i4 == 2) {
                    this.K = null;
                    va vaVar = this.y;
                    if (vaVar != null) {
                        vaVar.g3.O(true);
                    }
                    f0(true);
                    return;
                } else if (i4 == 3) {
                    TLRPC.Chat chat = this.L;
                    if (chat == null) {
                        j = 0;
                    } else {
                        j = chat.id;
                    }
                    presentFragment(new yh2(this.O, j, new b9c(this, (byte) 1)));
                    return;
                } else if (i4 == 5) {
                    presentFragment(new oc6());
                    return;
                } else if (i4 == 4) {
                    presentFragment(new ss7());
                    return;
                } else if (i4 == 6) {
                    presentFragment(new hh2());
                    return;
                } else if (i4 == 7) {
                    presentFragment(new u8(3));
                    return;
                } else if (i4 == 8) {
                    presentFragment(new uf1(null));
                    return;
                } else if (i4 == 11) {
                    presentFragment(new org.telegram.ui.ActionBar.d(null));
                    return;
                } else {
                    return;
                }
            }
            Activity parentActivity = getParentActivity();
            String M0 = jb6.M0(2131751175, null);
            String M02 = jb6.M0(2131751180, null);
            TL_account.TL_birthday tL_birthday = this.K;
            b9c b9cVar = new b9c(this, (byte) 0);
            if (tL_birthday != null) {
                z = true;
            } else {
                z = false;
            }
            showDialog((my0) ik.l(parentActivity, M0, M02, tL_birthday, b9cVar, null, false, z, getResourceProvider()).b);
        }
    }

    @Override
    public final boolean c0(c6c c6cVar, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        vs2 vs2Var;
        setHasOwnBackground(true);
        c9c c9cVar = new c9c(this, context, jb6.M0(2131751165, null), this.resourceProvider, (byte) 0);
        this.e = c9cVar;
        c9cVar.setDivider(true);
        c9c c9cVar2 = this.e;
        c9cVar2.getClass();
        c9cVar2.d(new c82(c9cVar2, (byte) 1));
        c9c c9cVar3 = new c9c(this, context, jb6.M0(2131751163, null), this.resourceProvider, (byte) 1);
        this.f = c9cVar3;
        c9cVar3.d(new c82(c9cVar3, (byte) 1));
        String M0 = jb6.M0(2131751191, null);
        oc7 messagesController = getMessagesController();
        boolean p = messagesController.getUserConfig().p();
        gs gsVar = messagesController.l4;
        if (p) {
            vs2Var = gsVar.l1;
        } else {
            vs2Var = gsVar.k1;
        }
        c9c c9cVar4 = new c9c(this, context, M0, vs2Var.f(), this.resourceProvider);
        this.h = c9cVar4;
        c9cVar4.setShowLimitWhenEmpty(true);
        j0();
        this.r = gm.N2(jb6.M0(2131751190, null), -1, 0, new a9c(this, (byte) 0), null);
        super.createView(context);
        va vaVar = this.a;
        this.y = vaVar;
        vaVar.r1();
        this.y.setSectionsDrawBackground(true);
        this.y.setClipToPadding(false);
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231245);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new im8(this, (byte) 25));
        this.x = this.simpleActionBar.s(jb6.M0(2131745680, null));
        f0(false);
        i0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ArrayList<TL_account.TL_connectedBot> arrayList;
        if (i == nm7.E0) {
            i0();
        } else if (i == 2) {
            va vaVar = this.y;
            if (vaVar != null) {
                vaVar.g3.O(true);
            }
        } else if (i == nm7.k0) {
            j0();
            va vaVar2 = this.y;
            if (vaVar2 != null) {
                vaVar2.g3.O(true);
            }
        } else if (i == nm7.d4) {
            TL_account.connectedBots connectedbots = x41.a(this.currentAccount).c;
            if (connectedbots == null || (arrayList = connectedbots.connected_bots) == null) {
                arrayList = new ArrayList<>();
            }
            this.w = arrayList;
            va vaVar3 = this.y;
            if (vaVar3 != null) {
                vaVar3.g3.O(true);
            }
        }
    }

    public final void f0(boolean z) {
        boolean z2;
        long j;
        if (this.x == null) {
            return;
        }
        String str = this.F;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (TextUtils.equals(str, this.e.getText().toString())) {
            String str3 = this.G;
            if (str3 == null) {
                str3 = "";
            }
            if (TextUtils.equals(str3, this.f.getText().toString())) {
                String str4 = this.H;
                if (str4 != null) {
                    str2 = str4;
                }
                if (TextUtils.equals(str2, this.h.getText().toString()) && e0(this.I, this.K)) {
                    long j2 = this.J;
                    TLRPC.Chat chat = this.L;
                    if (chat != null) {
                        j = chat.id;
                    } else {
                        j = 0;
                    }
                    if (j2 == j) {
                        z2 = false;
                        this.x.a(z2, z);
                    }
                }
            }
        }
        z2 = true;
        this.x.a(z2, z);
    }

    public final void g0(TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        String str;
        if (tL_error != null) {
            this.x.b(false);
            boolean z = tLObject instanceof TL_account.updateBirthday;
            if (z && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, getParentActivity());
                    String M0 = jb6.M0(2131746587, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.S = M0;
                    heVar.U = jb6.M0(2131746588, null);
                    alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                    showDialog(heVar);
                }
            } else {
                c41.e0(tL_error);
            }
            if (z) {
                int i = userFull.flags;
                if (tL_birthday != null) {
                    userFull.flags = i | 32;
                } else {
                    userFull.flags = i & (-33);
                }
                userFull.birthday = tL_birthday;
                getMessagesStorage().g2(userFull, false);
            }
        } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
            this.x.b(false);
            mlb.y(null, 2131743566, c41.b0(this), null);
        } else {
            this.Q = true;
            int i2 = iArr[0] + 1;
            iArr[0] = i2;
            if (i2 == arrayList.size()) {
                finishFragment();
            }
        }
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.y;
    }

    public final void h0(boolean z) {
        long j;
        int i;
        if (!this.x.y.f) {
            if (z && TextUtils.isEmpty(this.e.getText())) {
                xx0.APP_ERROR.a();
                c9c c9cVar = this.e;
                int i2 = -this.R;
                this.R = i2;
                gm.A3(i2, c9cVar, null);
                return;
            }
            this.x.b(true);
            TLRPC.User f = getUserConfig().f();
            TLRPC.UserFull X1 = getMessagesController().X1(getUserConfig().e());
            if (f != null && X1 != null) {
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(this.e.getText()) && (!TextUtils.equals(this.F, this.e.getText().toString()) || !TextUtils.equals(this.G, this.f.getText().toString()) || !TextUtils.equals(this.H, this.h.getText().toString()))) {
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.flags |= 1;
                    String charSequence = this.e.getText().toString();
                    f.first_name = charSequence;
                    updateprofile.first_name = charSequence;
                    updateprofile.flags |= 2;
                    String charSequence2 = this.f.getText().toString();
                    f.last_name = charSequence2;
                    updateprofile.last_name = charSequence2;
                    updateprofile.flags |= 4;
                    String charSequence3 = this.h.getText().toString();
                    X1.about = charSequence3;
                    updateprofile.about = charSequence3;
                    boolean isEmpty = TextUtils.isEmpty(charSequence3);
                    int i3 = X1.flags;
                    if (isEmpty) {
                        i = i3 & (-3);
                    } else {
                        i = i3 | 2;
                    }
                    X1.flags = i;
                    arrayList.add(updateprofile);
                }
                TL_account.TL_birthday tL_birthday = X1.birthday;
                if (!e0(this.I, this.K)) {
                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                    TL_account.TL_birthday tL_birthday2 = this.K;
                    int i4 = X1.flags2;
                    if (tL_birthday2 != null) {
                        X1.flags2 = i4 | 32;
                        X1.birthday = tL_birthday2;
                        updatebirthday.flags |= 1;
                        updatebirthday.birthday = tL_birthday2;
                    } else {
                        X1.flags2 = i4 & (-33);
                        X1.birthday = null;
                    }
                    arrayList.add(updatebirthday);
                    getMessagesController().i2();
                    nm7.f(this.currentAccount).k(nm7.k5, new Object[0]);
                }
                long j2 = this.J;
                TLRPC.Chat chat = this.L;
                if (chat != null) {
                    j = chat.id;
                } else {
                    j = 0;
                }
                if (j2 != j) {
                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                    updatepersonalchannel.channel = oc7.h1(this.L);
                    TLRPC.Chat chat2 = this.L;
                    int i5 = X1.flags;
                    if (chat2 != null) {
                        X1.flags = i5 | 64;
                        long j3 = X1.personal_channel_id;
                        long j4 = chat2.id;
                        if (j3 != j4) {
                            X1.personal_channel_message = 0;
                        }
                        X1.personal_channel_id = j4;
                    } else {
                        X1.flags = i5 & (-65);
                        X1.personal_channel_message = 0;
                        X1.personal_channel_id = 0L;
                    }
                    arrayList.add(updatepersonalchannel);
                }
                if (arrayList.isEmpty()) {
                    finishFragment();
                    return;
                }
                int[] iArr = {0};
                int i6 = 0;
                while (i6 < arrayList.size()) {
                    TLObject tLObject = (TLObject) arrayList.get(i6);
                    UserInfoActivity userInfoActivity = this;
                    this.getConnectionsManager().sendRequest(tLObject, new ko0(userInfoActivity, tLObject, tL_birthday, X1, iArr, arrayList, (byte) 6), 1024);
                    i6++;
                    this = userInfoActivity;
                }
                UserInfoActivity userInfoActivity2 = this;
                userInfoActivity2.getMessagesStorage().g2(X1, false);
                userInfoActivity2.getUserConfig().u(true);
                nm7.f(userInfoActivity2.currentAccount).k(nm7.j0, new Object[0]);
                nm7 f2 = nm7.f(userInfoActivity2.currentAccount);
                int i7 = oc7.s5;
                f2.k(2, 1);
            }
        }
    }

    public final void i0() {
        boolean z;
        l7c l7cVar;
        if (!this.P) {
            TLRPC.UserFull X1 = getMessagesController().X1(getUserConfig().e());
            if (X1 == null) {
                getMessagesController().k3(getClassGuid(), getUserConfig().f(), true);
                return;
            }
            TLRPC.User user = X1.user;
            if (user == null) {
                user = getUserConfig().f();
            }
            if (user == null) {
                return;
            }
            c9c c9cVar = this.e;
            String str = user.first_name;
            this.F = str;
            c9cVar.setText(str);
            c9c c9cVar2 = this.f;
            String str2 = user.last_name;
            this.G = str2;
            c9cVar2.setText(str2);
            c9c c9cVar3 = this.h;
            String str3 = X1.about;
            this.H = str3;
            c9cVar3.setText(str3);
            TL_account.TL_birthday tL_birthday = X1.birthday;
            this.I = tL_birthday;
            this.K = tL_birthday;
            if ((X1.flags2 & 64) != 0) {
                this.J = X1.personal_channel_id;
                this.L = getMessagesController().L0(Long.valueOf(this.J));
            } else {
                this.J = 0L;
                this.L = null;
            }
            boolean z2 = false;
            if (X1.business_work_hours != null) {
                z = true;
            } else {
                z = false;
            }
            this.M = z;
            if (X1.business_location != null) {
                z2 = true;
            }
            this.N = z2;
            f0(true);
            va vaVar = this.y;
            if (vaVar != null && (l7cVar = vaVar.g3) != null) {
                l7cVar.O(true);
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
        getNotificationCenter().b(this, nm7.E0);
        getNotificationCenter().b(this, nm7.k0);
        getNotificationCenter().b(this, 2);
        getNotificationCenter().b(this, nm7.d4);
        getContactsController().D(false);
        x41.a(this.currentAccount).c(null);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, nm7.E0);
        getNotificationCenter().n(this, nm7.k0);
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, nm7.d4);
        super.onFragmentDestroy();
        if (!this.Q) {
            h0(false);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        d9c d9cVar = this.O;
        d9cVar.b = false;
        d9cVar.e.add(new a9c(this, (byte) 1));
        if (!d9cVar.b && !d9cVar.c) {
            d9cVar.c = true;
            TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
            tL_channels_getAdminedPublicChannels.for_personal = true;
            ConnectionsManager.getInstance(d9cVar.a).sendRequest(tL_channels_getAdminedPublicChannels, new go9(d9cVar, (byte) 21));
        }
        this.s = null;
        va vaVar = this.y;
        if (vaVar != null) {
            vaVar.g3.O(true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
