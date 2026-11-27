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
public class UserInfoActivity extends n9c implements fn7 {
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
    public bbc e;
    public bbc f;
    public int firstNameRow;
    public bbc h;
    public int lastNameRow;
    public int logoutRow;
    public int numberRow;
    public CharSequence r;
    public SpannableStringBuilder s;
    public int usernameRow;
    public nla x;
    public wa y;
    public int n = Integer.MIN_VALUE;
    public ArrayList w = new ArrayList();
    public final ArrayList E = new ArrayList();
    public final cbc O = new cbc(this.currentAccount);
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
            return ob6.D0().n0().format(calendar.getTimeInMillis());
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2, tL_birthday.month - 1);
        calendar2.set(5, tL_birthday.day);
        return ob6.D0().p0().format(calendar2.getTimeInMillis());
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
    public final void Y(ArrayList arrayList, l9c l9cVar) {
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
            if (yac.h(i2).o() && this.currentAccount != i2) {
                arrayList3.add(Integer.valueOf(i2));
            }
        }
        Collections.sort(arrayList3, new fna((byte) 12));
        arrayList.add(b8c.u(ob6.M0(2131751189, null)));
        this.firstNameRow = arrayList.size();
        arrayList.add(b8c.k(this.e));
        this.lastNameRow = arrayList.size();
        arrayList.add(b8c.k(this.f));
        arrayList.add(b8c.B(-1, null));
        this.bioRow = arrayList.size();
        arrayList.add(b8c.k(this.h));
        arrayList.add(b8c.C(this.r));
        TLRPC.User f = getUserConfig().f();
        bp1.o(2131751298, null, arrayList);
        if (f != null) {
            this.numberRow = arrayList.size();
            arrayList.add(qba.i(7, -11154873, -14175180, 2131232716, xnb.k(new StringBuilder("+"), f.phone, f78.f()), ob6.M0(2131743913, null), null));
        }
        this.usernameRow = arrayList.size();
        if (lbc.p(f) != null) {
            arrayList.add(qba.i(8, -1007845, -1996271, 2131231100, "@" + lbc.p(f), ob6.M0(2131743329, null), null));
        } else {
            arrayList.add(qba.i(8, -1007845, -1996271, 2131231100, ob6.M0(2131754356, null), null, null));
        }
        this.birthdayRow = arrayList.size();
        TL_account.TL_birthday tL_birthday = this.K;
        if (tL_birthday != null) {
            arrayList.add(qba.i(9, -14899731, -15431455, 2131231084, c0(tL_birthday), ob6.M0(2131751768, null), null));
        } else {
            arrayList.add(qba.i(9, -14899731, -15431455, 2131231084, ob6.M0(2131754457, null), null, null));
        }
        if (!getContactsController().t(11) && (v = getContactsController().v(11)) != null && this.s == null) {
            String M0 = ob6.M0(2131751206, null);
            if (!v.isEmpty()) {
                int i3 = 0;
                while (true) {
                    if (i3 >= v.size()) {
                        break;
                    } else if (v.get(i3) instanceof TLRPC.TL_privacyValueAllowContacts) {
                        M0 = ob6.M0(2131751206, null);
                        break;
                    } else {
                        if ((v.get(i3) instanceof TLRPC.TL_privacyValueAllowAll) || (v.get(i3) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                            M0 = ob6.M0(2131751207, null);
                        }
                        i3++;
                    }
                }
            }
            this.s = hl.D2(hl.N2(M0, -1, 0, new zac(this, (byte) 2), null), true);
        }
        arrayList.add(b8c.C(this.s));
        this.channelRow = arrayList.size();
        if (this.L == null) {
            arrayList.add(qba.i(3, -1007845, -1996271, 2131232152, ob6.M0(2131751196, null), null, ob6.M0(2131751201, null)));
        } else {
            arrayList.add(qba.i(3, -1007845, -1996271, 2131232152, ob6.M0(2131751196, null), this.L.title, null));
        }
        if (this.M) {
            arrayList.add(qba.i(4, -881871, -1940716, 2131231150, ob6.M0(2131751192, null), null, null));
        }
        if (this.N) {
            arrayList.add(qba.i(5, -765355, -2148011, 2131231131, ob6.M0(2131751190, null), null, null));
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
                TLRPC.User X1 = uc7.s1(this.currentAccount).X1(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                if (X1 != null) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(lbc.r(X1));
                }
                arrayList3 = arrayList6;
            }
            arrayList2 = arrayList3;
            arrayList.add(qba.i(6, -3903756, -6335009, 2131232584, ob6.M0(2131751195, null), sb, null));
        } else {
            arrayList2 = arrayList3;
            arrayList.add(qba.i(6, -3903756, -6335009, 2131232584, skb.b(ob6.M0(2131751195, null)), null, null));
        }
        arrayList.add(b8c.B(-3, ob6.M0(2131751194, null)));
        if (yac.c() < 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.addAccountRow = arrayList.size();
            String M02 = ob6.M0(2131754477, null);
            int i5 = dbc.b;
            b8c K = b8c.K(dbc.class);
            K.d = 10;
            K.k = 2131232491;
            K.m = M02;
            K.n = null;
            K.A = 0;
            K.r = true;
            arrayList.add(K);
        }
        if (!arrayList2.isEmpty()) {
            if (!z) {
                bp1.o(2131745220, null, arrayList);
            }
            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                int intValue = ((Integer) arrayList2.get(i6)).intValue();
                int i7 = oba.b;
                b8c K2 = b8c.K(oba.class);
                K2.d = i6;
                K2.A = intValue;
                arrayList.add(K2);
            }
            if (!yac.n()) {
                int i8 = 5;
                if (yac.n()) {
                    i = 5;
                } else {
                    i = 3;
                }
                int max = Math.max(0, i - yac.c());
                if (max > 0) {
                    str = ob6.H(',', "AddAccountInfo1", max).concat(" ");
                } else {
                    str = "";
                }
                if (!yac.n()) {
                    i8 = 3;
                }
                arrayList.add(b8c.C(TextUtils.concat(str, hl.N2(ob6.H(',', "AddAccountInfo2", i8), -1, 0, new zac(this, (byte) 3), null))));
            } else {
                arrayList.add(b8c.C(null));
            }
        }
        this.logoutRow = arrayList.size();
        String M03 = ob6.M0(2131748497, null);
        int i9 = dbc.b;
        b8c K3 = b8c.K(dbc.class);
        K3.d = 11;
        K3.k = 2131232200;
        K3.m = M03;
        K3.n = null;
        K3.A = 0;
        K3.s = true;
        arrayList.add(K3);
        arrayList.add(b8c.B(-4, null));
    }

    @Override
    public final CharSequence Z() {
        return ob6.M0(2131751299, null);
    }

    @Override
    public final void a0(b8c b8cVar, View view) {
        boolean z;
        long j;
        int i = 0;
        Integer num = null;
        if (b8cVar.d == 10) {
            for (int i2 = 3; i2 >= 0; i2--) {
                if (!yac.h(i2).o()) {
                    i++;
                    if (num == null) {
                        num = Integer.valueOf(i2);
                    }
                }
            }
            if (!yac.n()) {
                i--;
            }
            if (i > 0 && num != null) {
                presentFragment(new qh6(num.intValue()));
            } else if (!yac.n()) {
                showDialog(new l46(7, this.currentAccount, null, getParentActivity(), this));
            }
        } else if (b8cVar.H(oba.class)) {
            int i3 = b8cVar.A;
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                launchActivity.N0(i3);
            }
        } else {
            int i4 = b8cVar.d;
            if (i4 != 1 && i4 != 9) {
                if (i4 == 2) {
                    this.K = null;
                    wa waVar = this.y;
                    if (waVar != null) {
                        waVar.g3.O(true);
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
                    presentFragment(new ch2(this.O, j, new abc(this, (byte) 1)));
                    return;
                } else if (i4 == 5) {
                    presentFragment(new tc6());
                    return;
                } else if (i4 == 4) {
                    presentFragment(new vt7());
                    return;
                } else if (i4 == 6) {
                    presentFragment(new mg2());
                    return;
                } else if (i4 == 7) {
                    presentFragment(new v8(3));
                    return;
                } else if (i4 == 8) {
                    presentFragment(new ve1(null));
                    return;
                } else if (i4 == 11) {
                    presentFragment(new org.telegram.ui.ActionBar.e(null));
                    return;
                } else {
                    return;
                }
            }
            Activity parentActivity = getParentActivity();
            String M0 = ob6.M0(2131751203, null);
            String M02 = ob6.M0(2131751208, null);
            TL_account.TL_birthday tL_birthday = this.K;
            abc abcVar = new abc(this, (byte) 0);
            if (tL_birthday != null) {
                z = true;
            } else {
                z = false;
            }
            showDialog((nx0) jj.l(parentActivity, M0, M02, tL_birthday, abcVar, null, false, z, getResourceProvider()).b);
        }
    }

    @Override
    public final boolean b0(b8c b8cVar, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        ds2 ds2Var;
        setHasOwnBackground(true);
        bbc bbcVar = new bbc(this, context, ob6.M0(2131751193, null), this.resourceProvider, (byte) 0);
        this.e = bbcVar;
        bbcVar.setDivider(true);
        bbc bbcVar2 = this.e;
        bbcVar2.getClass();
        i72 i72Var = new i72(bbcVar2, (byte) 1);
        yt3 yt3Var = bbcVar2.d;
        yt3Var.setImeOptions(6);
        yt3Var.setOnEditorActionListener(new vx1(i72Var, (byte) 2));
        bbc bbcVar3 = new bbc(this, context, ob6.M0(2131751191, null), this.resourceProvider, (byte) 1);
        this.f = bbcVar3;
        i72 i72Var2 = new i72(bbcVar3, (byte) 1);
        yt3 yt3Var2 = bbcVar3.d;
        yt3Var2.setImeOptions(6);
        yt3Var2.setOnEditorActionListener(new vx1(i72Var2, (byte) 2));
        String M0 = ob6.M0(2131751219, null);
        uc7 messagesController = getMessagesController();
        boolean p = messagesController.getUserConfig().p();
        hr hrVar = messagesController.l4;
        if (p) {
            ds2Var = hrVar.t1;
        } else {
            ds2Var = hrVar.s1;
        }
        bbc bbcVar4 = new bbc(this, context, M0, ds2Var.f(), this.resourceProvider);
        this.h = bbcVar4;
        bbcVar4.setShowLimitWhenEmpty(true);
        i0();
        this.r = hl.N2(ob6.M0(2131751218, null), -1, 0, new zac(this, (byte) 0), null);
        super.createView(context);
        wa waVar = this.a;
        this.y = waVar;
        waVar.s1();
        this.y.setSectionsDrawBackground(true);
        this.y.setClipToPadding(false);
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231244);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 26));
        this.x = this.simpleActionBar.u(ob6.M0(2131745674, null));
        e0(false);
        h0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ArrayList<TL_account.TL_connectedBot> arrayList;
        if (i == jn7.E0) {
            h0();
        } else if (i == 2) {
            wa waVar = this.y;
            if (waVar != null) {
                waVar.g3.O(true);
            }
        } else if (i == jn7.k0) {
            i0();
            wa waVar2 = this.y;
            if (waVar2 != null) {
                waVar2.g3.O(true);
            }
        } else if (i == jn7.c4) {
            TL_account.connectedBots connectedbots = y31.a(this.currentAccount).c;
            if (connectedbots == null || (arrayList = connectedbots.connected_bots) == null) {
                arrayList = new ArrayList<>();
            }
            this.w = arrayList;
            wa waVar3 = this.y;
            if (waVar3 != null) {
                waVar3.g3.O(true);
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
                    String M0 = ob6.M0(2131746581, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M0;
                    idVar.U = ob6.M0(2131746582, null);
                    alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                    showDialog(idVar);
                }
            } else {
                d31.e0(tL_error);
            }
            if (z) {
                int i = userFull.flags;
                if (tL_birthday != null) {
                    userFull.flags = i | 32;
                } else {
                    userFull.flags = i & (-33);
                }
                userFull.birthday = tL_birthday;
                getMessagesStorage().l2(userFull, false);
            }
        } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
            this.x.b(false);
            xnb.x(null, 2131743534, d31.b0(this), null);
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
                yw0.APP_ERROR.a();
                bbc bbcVar = this.e;
                int i2 = -this.R;
                this.R = i2;
                hl.A3(i2, bbcVar, null);
                return;
            }
            this.x.b(true);
            TLRPC.User f = getUserConfig().f();
            TLRPC.UserFull Y1 = getMessagesController().Y1(getUserConfig().e());
            if (f != null && Y1 != null) {
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
                    Y1.about = charSequence3;
                    updateprofile.about = charSequence3;
                    boolean isEmpty = TextUtils.isEmpty(charSequence3);
                    int i3 = Y1.flags;
                    if (isEmpty) {
                        i = i3 & (-3);
                    } else {
                        i = i3 | 2;
                    }
                    Y1.flags = i;
                    arrayList.add(updateprofile);
                }
                TL_account.TL_birthday tL_birthday = Y1.birthday;
                if (!d0(this.I, this.K)) {
                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                    TL_account.TL_birthday tL_birthday2 = this.K;
                    int i4 = Y1.flags2;
                    if (tL_birthday2 != null) {
                        Y1.flags2 = i4 | 32;
                        Y1.birthday = tL_birthday2;
                        updatebirthday.flags |= 1;
                        updatebirthday.birthday = tL_birthday2;
                    } else {
                        Y1.flags2 = i4 & (-33);
                        Y1.birthday = null;
                    }
                    arrayList.add(updatebirthday);
                    getMessagesController().j2();
                    jn7.f(this.currentAccount).k(jn7.j5, new Object[0]);
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
                    updatepersonalchannel.channel = uc7.i1(this.L);
                    TLRPC.Chat chat2 = this.L;
                    int i5 = Y1.flags;
                    if (chat2 != null) {
                        Y1.flags = i5 | 64;
                        long j3 = Y1.personal_channel_id;
                        long j4 = chat2.id;
                        if (j3 != j4) {
                            Y1.personal_channel_message = 0;
                        }
                        Y1.personal_channel_id = j4;
                    } else {
                        Y1.flags = i5 & (-65);
                        Y1.personal_channel_message = 0;
                        Y1.personal_channel_id = 0L;
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
                    this.getConnectionsManager().sendRequest(tLObject, new mn0(userInfoActivity, tLObject, tL_birthday, Y1, iArr, arrayList, (byte) 6), 1024);
                    i6++;
                    this = userInfoActivity;
                }
                UserInfoActivity userInfoActivity2 = this;
                userInfoActivity2.getMessagesStorage().l2(Y1, false);
                userInfoActivity2.getUserConfig().u(true);
                jn7.f(userInfoActivity2.currentAccount).k(jn7.j0, new Object[0]);
                jn7 f2 = jn7.f(userInfoActivity2.currentAccount);
                int i7 = uc7.s5;
                f2.k(2, 1);
            }
        }
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.y;
    }

    public final void h0() {
        boolean z;
        l9c l9cVar;
        if (!this.P) {
            TLRPC.UserFull Y1 = getMessagesController().Y1(getUserConfig().e());
            if (Y1 == null) {
                getMessagesController().o3(getClassGuid(), getUserConfig().f(), true);
                return;
            }
            TLRPC.User user = Y1.user;
            if (user == null) {
                user = getUserConfig().f();
            }
            if (user == null) {
                return;
            }
            bbc bbcVar = this.e;
            String str = user.first_name;
            this.F = str;
            bbcVar.setText(str);
            bbc bbcVar2 = this.f;
            String str2 = user.last_name;
            this.G = str2;
            bbcVar2.setText(str2);
            bbc bbcVar3 = this.h;
            String str3 = Y1.about;
            this.H = str3;
            bbcVar3.setText(str3);
            TL_account.TL_birthday tL_birthday = Y1.birthday;
            this.I = tL_birthday;
            this.K = tL_birthday;
            if ((Y1.flags2 & 64) != 0) {
                this.J = Y1.personal_channel_id;
                this.L = getMessagesController().M0(Long.valueOf(this.J));
            } else {
                this.J = 0L;
                this.L = null;
            }
            boolean z2 = false;
            if (Y1.business_work_hours != null) {
                z = true;
            } else {
                z = false;
            }
            this.M = z;
            if (Y1.business_location != null) {
                z2 = true;
            }
            this.N = z2;
            e0(true);
            wa waVar = this.y;
            if (waVar != null && (l9cVar = waVar.g3) != null) {
                l9cVar.O(true);
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
        getNotificationCenter().b(this, jn7.E0);
        getNotificationCenter().b(this, jn7.k0);
        getNotificationCenter().b(this, 2);
        getNotificationCenter().b(this, jn7.c4);
        getContactsController().D(false);
        y31.a(this.currentAccount).c(null);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, jn7.E0);
        getNotificationCenter().n(this, jn7.k0);
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, jn7.c4);
        super.onFragmentDestroy();
        if (!this.Q) {
            g0(false);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        cbc cbcVar = this.O;
        cbcVar.b = false;
        cbcVar.e.add(new zac(this, (byte) 1));
        if (!cbcVar.b && !cbcVar.c) {
            cbcVar.c = true;
            TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
            tL_channels_getAdminedPublicChannels.for_personal = true;
            ConnectionsManager.getInstance(cbcVar.a).sendRequest(tL_channels_getAdminedPublicChannels, new yp9(cbcVar, (byte) 21));
        }
        this.s = null;
        wa waVar = this.y;
        if (waVar != null) {
            waVar.g3.O(true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
