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
public class UserInfoActivity extends n5c implements gk7 {
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
    public b7c e;
    public b7c f;
    public int firstNameRow;
    public b7c h;
    public int lastNameRow;
    public int logoutRow;
    public int numberRow;
    public CharSequence r;
    public SpannableStringBuilder s;
    public int usernameRow;
    public sha x;
    public va y;
    public int n = Integer.MIN_VALUE;
    public ArrayList w = new ArrayList();
    public final ArrayList E = new ArrayList();
    public final c7c O = new c7c(this.currentAccount);
    public boolean Q = false;
    public int R = -4;

    public static String c0(TL_account.TL_birthday tL_birthday) {
        if (tL_birthday == null) {
            return "—";
        }
        if ((tL_birthday.flags & 1) != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(1, tL_birthday.year);
            calendar.set(2, tL_birthday.month - 1);
            calendar.set(5, tL_birthday.day);
            return k96.D0().n0().format(calendar.getTimeInMillis());
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2, tL_birthday.month - 1);
        calendar2.set(5, tL_birthday.day);
        return k96.D0().p0().format(calendar2.getTimeInMillis());
    }

    public static boolean d0(TL_account.TL_birthday tL_birthday, TL_account.TL_birthday tL_birthday2) {
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
    public final void Y(ArrayList arrayList, l5c l5cVar) {
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
            if (y6c.h(i2).o() && this.currentAccount != i2) {
                arrayList3.add(Integer.valueOf(i2));
            }
        }
        Collections.sort(arrayList3, new pva((byte) 9));
        arrayList.add(c4c.u(k96.M0(2131751212, null)));
        this.firstNameRow = arrayList.size();
        arrayList.add(c4c.k(this.e));
        this.lastNameRow = arrayList.size();
        arrayList.add(c4c.k(this.f));
        arrayList.add(c4c.B(-1, null));
        this.bioRow = arrayList.size();
        arrayList.add(c4c.k(this.h));
        arrayList.add(c4c.C(this.r));
        TLRPC.User f = getUserConfig().f();
        oo1.o(2131751321, null, arrayList);
        if (f != null) {
            this.numberRow = arrayList.size();
            arrayList.add(z7a.i(7, -11154873, -14175180, 2131232705, yjb.k(new StringBuilder("+"), f.phone, p38.f()), k96.M0(2131744019, null), null));
        }
        this.usernameRow = arrayList.size();
        if (l7c.p(f) != null) {
            arrayList.add(z7a.i(8, -1007845, -1996271, 2131231100, "@" + l7c.p(f), k96.M0(2131743435, null), null));
        } else {
            arrayList.add(z7a.i(8, -1007845, -1996271, 2131231100, k96.M0(2131754360, null), null, null));
        }
        this.birthdayRow = arrayList.size();
        TL_account.TL_birthday tL_birthday = this.K;
        if (tL_birthday != null) {
            arrayList.add(z7a.i(9, -14899731, -15431455, 2131231084, c0(tL_birthday), k96.M0(2131751791, null), null));
        } else {
            arrayList.add(z7a.i(9, -14899731, -15431455, 2131231084, k96.M0(2131754461, null), null, null));
        }
        if (!getContactsController().t(11) && (v = getContactsController().v(11)) != null && this.s == null) {
            String M0 = k96.M0(2131751229, null);
            if (!v.isEmpty()) {
                int i3 = 0;
                while (true) {
                    if (i3 >= v.size()) {
                        break;
                    } else if (v.get(i3) instanceof TLRPC.TL_privacyValueAllowContacts) {
                        M0 = k96.M0(2131751229, null);
                        break;
                    } else {
                        if ((v.get(i3) instanceof TLRPC.TL_privacyValueAllowAll) || (v.get(i3) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                            M0 = k96.M0(2131751230, null);
                        }
                        i3++;
                    }
                }
            }
            this.s = gl.D2(gl.N2(M0, -1, 0, new z6c(this, (byte) 2), null), true);
        }
        arrayList.add(c4c.C(this.s));
        this.channelRow = arrayList.size();
        if (this.L == null) {
            arrayList.add(z7a.i(3, -1007845, -1996271, 2131232152, k96.M0(2131751219, null), null, k96.M0(2131751224, null)));
        } else {
            arrayList.add(z7a.i(3, -1007845, -1996271, 2131232152, k96.M0(2131751219, null), this.L.title, null));
        }
        if (this.M) {
            arrayList.add(z7a.i(4, -881871, -1940716, 2131231150, k96.M0(2131751215, null), null, null));
        }
        if (this.N) {
            arrayList.add(z7a.i(5, -765355, -2148011, 2131231131, k96.M0(2131751213, null), null, null));
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
                TLRPC.User V1 = na7.q1(this.currentAccount).V1(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                if (V1 != null) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(l7c.r(V1));
                }
                arrayList3 = arrayList6;
            }
            arrayList2 = arrayList3;
            arrayList.add(z7a.i(6, -3903756, -6335009, 2131232573, k96.M0(2131751218, null), sb, null));
        } else {
            arrayList2 = arrayList3;
            arrayList.add(z7a.i(6, -3903756, -6335009, 2131232573, wgb.b(k96.M0(2131751218, null)), null, null));
        }
        arrayList.add(c4c.B(-3, k96.M0(2131751217, null)));
        if (y6c.c() < 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.addAccountRow = arrayList.size();
            String M02 = k96.M0(2131754481, null);
            int i5 = d7c.b;
            c4c K = c4c.K(d7c.class);
            K.d = 10;
            K.k = 2131232480;
            K.m = M02;
            K.n = null;
            K.A = 0;
            K.r = true;
            arrayList.add(K);
        }
        if (!arrayList2.isEmpty()) {
            if (!z) {
                oo1.o(2131745300, null, arrayList);
            }
            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                int intValue = ((Integer) arrayList2.get(i6)).intValue();
                int i7 = x7a.b;
                c4c K2 = c4c.K(x7a.class);
                K2.d = i6;
                K2.A = intValue;
                arrayList.add(K2);
            }
            if (!y6c.n()) {
                int i8 = 5;
                if (y6c.n()) {
                    i = 5;
                } else {
                    i = 3;
                }
                int max = Math.max(0, i - y6c.c());
                if (max > 0) {
                    str = k96.H(',', "AddAccountInfo1", max).concat(" ");
                } else {
                    str = "";
                }
                if (!y6c.n()) {
                    i8 = 3;
                }
                arrayList.add(c4c.C(TextUtils.concat(str, gl.N2(k96.H(',', "AddAccountInfo2", i8), -1, 0, new z6c(this, (byte) 3), null))));
            } else {
                arrayList.add(c4c.C(null));
            }
        }
        this.logoutRow = arrayList.size();
        String M03 = k96.M0(2131748551, null);
        int i9 = d7c.b;
        c4c K3 = c4c.K(d7c.class);
        K3.d = 11;
        K3.k = 2131232200;
        K3.m = M03;
        K3.n = null;
        K3.A = 0;
        K3.s = true;
        arrayList.add(K3);
        arrayList.add(c4c.B(-4, null));
    }

    @Override
    public final CharSequence Z() {
        return k96.M0(2131751322, null);
    }

    @Override
    public final void a0(c4c c4cVar, View view) {
        boolean z;
        long j;
        int i = 0;
        Integer num = null;
        if (c4cVar.d == 10) {
            for (int i2 = 3; i2 >= 0; i2--) {
                if (!y6c.h(i2).o()) {
                    i++;
                    if (num == null) {
                        num = Integer.valueOf(i2);
                    }
                }
            }
            if (!y6c.n()) {
                i--;
            }
            if (i > 0 && num != null) {
                presentFragment(new mf6(num.intValue()));
            } else if (!y6c.n()) {
                showDialog(new h26(7, this.currentAccount, null, getParentActivity(), this));
            }
        } else if (c4cVar.H(x7a.class)) {
            int i3 = c4cVar.A;
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                launchActivity.N0(i3);
            }
        } else {
            int i4 = c4cVar.d;
            if (i4 != 1 && i4 != 9) {
                if (i4 == 2) {
                    this.K = null;
                    va vaVar = this.y;
                    if (vaVar != null) {
                        vaVar.g3.O(true);
                    }
                    e0(true);
                    return;
                } else if (i4 == 3) {
                    TLRPC.Chat chat = this.L;
                    if (chat == null) {
                        j = 0;
                    } else {
                        j = chat.id;
                    }
                    presentFragment(new kg2(this.O, j, new a7c(this, (byte) 1)));
                    return;
                } else if (i4 == 5) {
                    presentFragment(new pa6());
                    return;
                } else if (i4 == 4) {
                    presentFragment(new qq7());
                    return;
                } else if (i4 == 6) {
                    presentFragment(new uf2());
                    return;
                } else if (i4 == 7) {
                    presentFragment(new u8(3));
                    return;
                } else if (i4 == 8) {
                    presentFragment(new me1(null));
                    return;
                } else if (i4 == 11) {
                    presentFragment(new org.telegram.ui.ActionBar.d(null));
                    return;
                } else {
                    return;
                }
            }
            Activity parentActivity = getParentActivity();
            String M0 = k96.M0(2131751226, null);
            String M02 = k96.M0(2131751231, null);
            TL_account.TL_birthday tL_birthday = this.K;
            a7c a7cVar = new a7c(this, (byte) 0);
            if (tL_birthday != null) {
                z = true;
            } else {
                z = false;
            }
            showDialog((fx0) ij.l(parentActivity, M0, M02, tL_birthday, a7cVar, null, false, z, getResourceProvider()).a);
        }
    }

    @Override
    public final boolean b0(c4c c4cVar, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        kr2 kr2Var;
        setHasOwnBackground(true);
        b7c b7cVar = new b7c(this, context, k96.M0(2131751216, null), this.resourceProvider, (byte) 0);
        this.e = b7cVar;
        b7cVar.setDivider(true);
        b7c b7cVar2 = this.e;
        b7cVar2.getClass();
        r62 r62Var = new r62(b7cVar2, (byte) 1);
        ht3 ht3Var = b7cVar2.d;
        ht3Var.setImeOptions(6);
        ht3Var.setOnEditorActionListener(new gx1(r62Var, (byte) 2));
        b7c b7cVar3 = new b7c(this, context, k96.M0(2131751214, null), this.resourceProvider, (byte) 1);
        this.f = b7cVar3;
        r62 r62Var2 = new r62(b7cVar3, (byte) 1);
        ht3 ht3Var2 = b7cVar3.d;
        ht3Var2.setImeOptions(6);
        ht3Var2.setOnEditorActionListener(new gx1(r62Var2, (byte) 2));
        String M0 = k96.M0(2131751242, null);
        na7 messagesController = getMessagesController();
        boolean p = messagesController.getUserConfig().p();
        gr grVar = messagesController.k4;
        if (p) {
            kr2Var = grVar.l1;
        } else {
            kr2Var = grVar.k1;
        }
        b7c b7cVar4 = new b7c(this, context, M0, kr2Var.f(), this.resourceProvider);
        this.h = b7cVar4;
        b7cVar4.setShowLimitWhenEmpty(true);
        i0();
        this.r = gl.N2(k96.M0(2131751241, null), -1, 0, new z6c(this, (byte) 0), null);
        super.createView(context);
        va vaVar = this.a;
        this.y = vaVar;
        vaVar.r1();
        this.y.setSectionsDrawBackground(true);
        this.y.setClipToPadding(false);
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231244);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new kk8(this, (byte) 24));
        this.x = this.simpleActionBar.s(k96.M0(2131745754, null));
        e0(false);
        h0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ArrayList<TL_account.TL_connectedBot> arrayList;
        if (i == kk7.D0) {
            h0();
        } else if (i == 2) {
            va vaVar = this.y;
            if (vaVar != null) {
                vaVar.g3.O(true);
            }
        } else if (i == kk7.j0) {
            i0();
            va vaVar2 = this.y;
            if (vaVar2 != null) {
                vaVar2.g3.O(true);
            }
        } else if (i == kk7.b4) {
            TL_account.connectedBots connectedbots = p31.a(this.currentAccount).c;
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

    public final void e0(boolean z) {
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
                if (TextUtils.equals(str2, this.h.getText().toString()) && d0(this.I, this.K)) {
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

    public final void f0(TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        String str;
        if (tL_error != null) {
            this.x.b(false);
            boolean z = tLObject instanceof TL_account.updateBirthday;
            if (z && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, getParentActivity());
                    String M0 = k96.M0(2131746661, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M0;
                    hdVar.U = k96.M0(2131746662, null);
                    alertDialog$Builder.j(k96.M0(2131747638, null), null);
                    showDialog(hdVar);
                }
            } else {
                u21.e0(tL_error);
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
            yjb.x(null, 2131743640, u21.b0(this), null);
        } else {
            this.Q = true;
            int i2 = iArr[0] + 1;
            iArr[0] = i2;
            if (i2 == arrayList.size()) {
                finishFragment();
            }
        }
    }

    public final void g0(boolean z) {
        long j;
        int i;
        if (!this.x.y.f) {
            if (z && TextUtils.isEmpty(this.e.getText())) {
                pw0.APP_ERROR.a();
                b7c b7cVar = this.e;
                int i2 = -this.R;
                this.R = i2;
                gl.A3(i2, b7cVar, null);
                return;
            }
            this.x.b(true);
            TLRPC.User f = getUserConfig().f();
            TLRPC.UserFull W1 = getMessagesController().W1(getUserConfig().e());
            if (f != null && W1 != null) {
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
                    W1.about = charSequence3;
                    updateprofile.about = charSequence3;
                    boolean isEmpty = TextUtils.isEmpty(charSequence3);
                    int i3 = W1.flags;
                    if (isEmpty) {
                        i = i3 & (-3);
                    } else {
                        i = i3 | 2;
                    }
                    W1.flags = i;
                    arrayList.add(updateprofile);
                }
                TL_account.TL_birthday tL_birthday = W1.birthday;
                if (!d0(this.I, this.K)) {
                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                    TL_account.TL_birthday tL_birthday2 = this.K;
                    int i4 = W1.flags2;
                    if (tL_birthday2 != null) {
                        W1.flags2 = i4 | 32;
                        W1.birthday = tL_birthday2;
                        updatebirthday.flags |= 1;
                        updatebirthday.birthday = tL_birthday2;
                    } else {
                        W1.flags2 = i4 & (-33);
                        W1.birthday = null;
                    }
                    arrayList.add(updatebirthday);
                    getMessagesController().h2();
                    kk7.f(this.currentAccount).k(kk7.i5, new Object[0]);
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
                    updatepersonalchannel.channel = na7.g1(this.L);
                    TLRPC.Chat chat2 = this.L;
                    int i5 = W1.flags;
                    if (chat2 != null) {
                        W1.flags = i5 | 64;
                        long j3 = W1.personal_channel_id;
                        long j4 = chat2.id;
                        if (j3 != j4) {
                            W1.personal_channel_message = 0;
                        }
                        W1.personal_channel_id = j4;
                    } else {
                        W1.flags = i5 & (-65);
                        W1.personal_channel_message = 0;
                        W1.personal_channel_id = 0L;
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
                    this.getConnectionsManager().sendRequest(tLObject, new kn0(userInfoActivity, tLObject, tL_birthday, W1, iArr, arrayList, (byte) 6), 1024);
                    i6++;
                    this = userInfoActivity;
                }
                UserInfoActivity userInfoActivity2 = this;
                userInfoActivity2.getMessagesStorage().g2(W1, false);
                userInfoActivity2.getUserConfig().u(true);
                kk7.f(userInfoActivity2.currentAccount).k(kk7.i0, new Object[0]);
                kk7 f2 = kk7.f(userInfoActivity2.currentAccount);
                int i7 = na7.q5;
                f2.k(2, 1);
            }
        }
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.y;
    }

    public final void h0() {
        boolean z;
        l5c l5cVar;
        if (!this.P) {
            TLRPC.UserFull W1 = getMessagesController().W1(getUserConfig().e());
            if (W1 == null) {
                getMessagesController().i3(getClassGuid(), getUserConfig().f(), true);
                return;
            }
            TLRPC.User user = W1.user;
            if (user == null) {
                user = getUserConfig().f();
            }
            if (user == null) {
                return;
            }
            b7c b7cVar = this.e;
            String str = user.first_name;
            this.F = str;
            b7cVar.setText(str);
            b7c b7cVar2 = this.f;
            String str2 = user.last_name;
            this.G = str2;
            b7cVar2.setText(str2);
            b7c b7cVar3 = this.h;
            String str3 = W1.about;
            this.H = str3;
            b7cVar3.setText(str3);
            TL_account.TL_birthday tL_birthday = W1.birthday;
            this.I = tL_birthday;
            this.K = tL_birthday;
            if ((W1.flags2 & 64) != 0) {
                this.J = W1.personal_channel_id;
                this.L = getMessagesController().K0(Long.valueOf(this.J));
            } else {
                this.J = 0L;
                this.L = null;
            }
            boolean z2 = false;
            if (W1.business_work_hours != null) {
                z = true;
            } else {
                z = false;
            }
            this.M = z;
            if (W1.business_location != null) {
                z2 = true;
            }
            this.N = z2;
            e0(true);
            va vaVar = this.y;
            if (vaVar != null && (l5cVar = vaVar.g3) != null) {
                l5cVar.O(true);
            }
            this.P = true;
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
        getNotificationCenter().b(this, kk7.D0);
        getNotificationCenter().b(this, kk7.j0);
        getNotificationCenter().b(this, 2);
        getNotificationCenter().b(this, kk7.b4);
        getContactsController().D(false);
        p31.a(this.currentAccount).c(null);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, kk7.D0);
        getNotificationCenter().n(this, kk7.j0);
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, kk7.b4);
        super.onFragmentDestroy();
        if (!this.Q) {
            g0(false);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        c7c c7cVar = this.O;
        c7cVar.b = false;
        c7cVar.e.add(new z6c(this, (byte) 1));
        if (!c7cVar.b && !c7cVar.c) {
            c7cVar.c = true;
            TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
            tL_channels_getAdminedPublicChannels.for_personal = true;
            ConnectionsManager.getInstance(c7cVar.a).sendRequest(tL_channels_getAdminedPublicChannels, new wx9(c7cVar, (byte) 20));
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
