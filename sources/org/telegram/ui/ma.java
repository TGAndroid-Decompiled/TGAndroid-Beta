package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ma extends org.telegram.ui.ActionBar.o2 {
    public static final Paint D = new Paint(1);
    public static final Paint E = new Paint(1);
    public static final Paint F = new Paint(1);
    public ja A;
    public la B;
    public org.telegram.ui.Cells.x1 C;
    public org.telegram.ui.ActionBar.w0 f40361a;
    public org.telegram.ui.Components.wk0 f40362b;
    public da f40363c;
    public boolean d;
    public int f40364e;
    public String f40365f;
    public org.telegram.messenger.voip.l0 h;
    public boolean f40366n;
    public String f40367r;
    public final ArrayList f40368s;
    public final ArrayList v;
    public final ArrayList f40369w;
    public final long f40370x;
    public ga f40371y;

    public ma(Bundle bundle) {
        super(bundle);
        this.f40367r = "";
        this.f40368s = new ArrayList();
        this.v = new ArrayList();
        this.f40369w = new ArrayList();
        if (bundle != null) {
            this.f40370x = bundle.getLong("bot_id");
        }
    }

    public static void T(ma maVar, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            c2Var.dismiss();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        org.telegram.ui.Components.y4.f0(maVar.currentAccount, tL_error, maVar, updateusername, new Object[0]);
        maVar.g0();
    }

    public static void U(ma maVar, int i9) {
        ConnectionsManager.getInstance(maVar.currentAccount).cancelRequest(i9, true);
    }

    public static void V(ma maVar, String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        maVar.f40364e = ConnectionsManager.getInstance(maVar.currentAccount).sendRequest(checkusername, new y9(maVar, str, checkusername, 0), 2);
    }

    public static void W(ma maVar, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.User user) {
        try {
            c2Var.dismiss();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        arrayList.add(user);
        MessagesController.getInstance(maVar.currentAccount).putUsers(arrayList, false);
        MessagesStorage.getInstance(maVar.currentAccount).putUsersAndChats(arrayList, null, false, true);
        UserConfig.getInstance(maVar.currentAccount).saveConfig(true);
        maVar.finishFragment();
    }

    public static void X(ma maVar) {
        TL_bots.reorderUsernames reorderusernames;
        long j10 = maVar.f40370x;
        ArrayList arrayList = maVar.v;
        ArrayList arrayList2 = maVar.f40368s;
        if (!maVar.d) {
            return;
        }
        maVar.d = false;
        ArrayList<String> arrayList3 = new ArrayList<>();
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            if (((TLRPC.TL_username) arrayList2.get(i9)).active) {
                arrayList3.add(((TLRPC.TL_username) arrayList2.get(i9)).username);
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((TLRPC.TL_username) arrayList.get(i10)).active) {
                arrayList3.add(((TLRPC.TL_username) arrayList.get(i10)).username);
            }
        }
        if (j10 == 0) {
            TL_account.reorderUsernames reorderusernames2 = new TL_account.reorderUsernames();
            reorderusernames2.order = arrayList3;
            reorderusernames = reorderusernames2;
        } else {
            TL_bots.reorderUsernames reorderusernames3 = new TL_bots.reorderUsernames();
            reorderusernames3.bot = MessagesController.getInstance(maVar.currentAccount).getInputUser(j10);
            reorderusernames3.order = arrayList3;
            reorderusernames = reorderusernames3;
        }
        maVar.getConnectionsManager().sendRequest(reorderusernames, new ih.q5(6));
        ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList);
        TLRPC.User user = MessagesController.getInstance(maVar.currentAccount).getUser(Long.valueOf(maVar.f0()));
        user.usernames = arrayList4;
        MessagesController.getInstance(maVar.currentAccount).putUser(user, false, true);
    }

    public static void Y(ma maVar) {
        if (maVar.f40370x != 0) {
            maVar.finishFragment();
            return;
        }
        if (maVar.f40367r.startsWith("@")) {
            maVar.f40367r = maVar.f40367r.substring(1);
        }
        if (!maVar.f40367r.isEmpty() && !maVar.c0(maVar.f40367r)) {
            maVar.g0();
            return;
        }
        TLRPC.User e02 = maVar.e0();
        if (maVar.getParentActivity() != null && e02 != null) {
            String publicUsername = UserObject.getPublicUsername(e02);
            if (publicUsername == null) {
                publicUsername = "";
            }
            if (publicUsername.equals(maVar.f40367r)) {
                maVar.finishFragment();
                return;
            }
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(maVar.getParentActivity(), 3, null);
            TL_account.updateUsername updateusername = new TL_account.updateUsername();
            updateusername.username = maVar.f40367r;
            NotificationCenter.getInstance(maVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            int sendRequest = ConnectionsManager.getInstance(maVar.currentAccount).sendRequest(updateusername, new y9(maVar, c2Var, updateusername, 1), 2);
            ConnectionsManager.getInstance(maVar.currentAccount).bindRequestToGuid(sendRequest, maVar.classGuid);
            c2Var.setOnCancelListener(new gh.x(maVar, sendRequest, 1));
            c2Var.show();
        }
    }

    public static int a0(ma maVar) {
        return maVar.currentAccount;
    }

    public final boolean c0(String str) {
        int i9;
        if (str != null && str.startsWith("@")) {
            str = str.substring(1);
        }
        org.telegram.ui.Cells.x1 x1Var = this.C;
        if (x1Var != null) {
            if (!TextUtils.isEmpty(str)) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            x1Var.setVisibility(i9);
            la laVar = this.B;
            if (laVar != null) {
                la.a(laVar);
            }
        }
        org.telegram.messenger.voip.l0 l0Var = this.h;
        if (l0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(l0Var);
            this.h = null;
            this.f40365f = null;
            if (this.f40364e != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f40364e, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        org.telegram.ui.Cells.x1 x1Var2 = this.C;
                        if (x1Var2 != null) {
                            x1Var2.setText(LocaleController.getString(R.string.UsernameInvalidStartNumber));
                            org.telegram.ui.Cells.x1 x1Var3 = this.C;
                            int i11 = org.telegram.ui.ActionBar.f6.f23212p7;
                            x1Var3.setTag(Integer.valueOf(i11));
                            this.C.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                            la laVar2 = this.B;
                            if (laVar2 != null) {
                                la.a(laVar2);
                                return false;
                            }
                        }
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        org.telegram.ui.Cells.x1 x1Var4 = this.C;
                        if (x1Var4 != null) {
                            x1Var4.setText(LocaleController.getString(R.string.UsernameInvalid));
                            org.telegram.ui.Cells.x1 x1Var5 = this.C;
                            int i12 = org.telegram.ui.ActionBar.f6.f23212p7;
                            x1Var5.setTag(Integer.valueOf(i12));
                            this.C.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
                            la laVar3 = this.B;
                            if (laVar3 != null) {
                                la.a(laVar3);
                                return false;
                            }
                        }
                    }
                }
            } else {
                org.telegram.ui.Cells.x1 x1Var6 = this.C;
                if (x1Var6 != null) {
                    x1Var6.setText(LocaleController.getString(R.string.UsernameInvalid));
                    org.telegram.ui.Cells.x1 x1Var7 = this.C;
                    int i13 = org.telegram.ui.ActionBar.f6.f23212p7;
                    x1Var7.setTag(Integer.valueOf(i13));
                    this.C.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
                    la laVar4 = this.B;
                    if (laVar4 != null) {
                        la.a(laVar4);
                        return false;
                    }
                }
            }
            return false;
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                org.telegram.ui.Cells.x1 x1Var8 = this.C;
                if (x1Var8 != null) {
                    x1Var8.setText(LocaleController.getString(R.string.UsernameInvalidLong));
                    org.telegram.ui.Cells.x1 x1Var9 = this.C;
                    int i14 = org.telegram.ui.ActionBar.f6.f23212p7;
                    x1Var9.setTag(Integer.valueOf(i14));
                    this.C.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
                    la laVar5 = this.B;
                    if (laVar5 != null) {
                        la.a(laVar5);
                        return false;
                    }
                }
            } else {
                String str2 = e0().username;
                if (str2 == null) {
                    str2 = "";
                }
                if (str.equals(str2)) {
                    org.telegram.ui.Cells.x1 x1Var10 = this.C;
                    if (x1Var10 != null) {
                        x1Var10.setText(LocaleController.formatString("UsernameAvailable", R.string.UsernameAvailable, str));
                        org.telegram.ui.Cells.x1 x1Var11 = this.C;
                        int i15 = org.telegram.ui.ActionBar.f6.f23334w6;
                        x1Var11.setTag(Integer.valueOf(i15));
                        this.C.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
                        la laVar6 = this.B;
                        if (laVar6 != null) {
                            la.a(laVar6);
                        }
                    }
                    return true;
                }
                org.telegram.ui.Cells.x1 x1Var12 = this.C;
                if (x1Var12 != null) {
                    x1Var12.setText(LocaleController.getString(R.string.UsernameChecking));
                    org.telegram.ui.Cells.x1 x1Var13 = this.C;
                    int i16 = org.telegram.ui.ActionBar.f6.F6;
                    x1Var13.setTag(Integer.valueOf(i16));
                    this.C.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
                    la laVar7 = this.B;
                    if (laVar7 != null) {
                        la.a(laVar7);
                    }
                }
                this.f40365f = str;
                org.telegram.messenger.voip.l0 l0Var2 = new org.telegram.messenger.voip.l0(21, this, str);
                this.h = l0Var2;
                AndroidUtilities.runOnUIThread(l0Var2, 300L);
                return true;
            }
        } else {
            org.telegram.ui.Cells.x1 x1Var14 = this.C;
            if (x1Var14 != null) {
                x1Var14.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                org.telegram.ui.Cells.x1 x1Var15 = this.C;
                int i17 = org.telegram.ui.ActionBar.f6.f23212p7;
                x1Var15.setTag(Integer.valueOf(i17));
                this.C.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i17, false));
                la laVar8 = this.B;
                if (laVar8 != null) {
                    la.a(laVar8);
                }
            }
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        String str;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Username));
        this.actionBar.setActionBarMenuOnItemClick(new fh.w4(this, 22));
        this.f40361a = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(f0()));
        if (user == null) {
            user = e0();
        }
        if (user != null) {
            this.f40367r = null;
            if (user.usernames != null) {
                int i9 = 0;
                while (true) {
                    if (i9 >= user.usernames.size()) {
                        break;
                    }
                    TLRPC.TL_username tL_username = user.usernames.get(i9);
                    if (tL_username != null && tL_username.editable) {
                        this.f40367r = tL_username.username;
                        break;
                    }
                    i9++;
                }
            }
            if (this.f40367r == null && (str = user.username) != null) {
                this.f40367r = str;
            }
            if (this.f40367r == null) {
                this.f40367r = "";
            }
            this.f40368s.clear();
            ArrayList arrayList = this.v;
            arrayList.clear();
            for (int i10 = 0; i10 < user.usernames.size(); i10++) {
                if (user.usernames.get(i10).active) {
                    arrayList.add(user.usernames.get(i10));
                }
            }
            for (int i11 = 0; i11 < user.usernames.size(); i11++) {
                if (!user.usernames.get(i11).active) {
                    arrayList.add(user.usernames.get(i11));
                }
            }
        }
        this.fragmentView = new FrameLayout(context);
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.f40362b = wk0Var;
        wk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f40362b);
        this.fragmentView.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.f22947a7));
        this.f40362b.setLayoutManager(new f2.m0());
        org.telegram.ui.Components.wk0 wk0Var2 = this.f40362b;
        da daVar = new da(this);
        this.f40363c = daVar;
        wk0Var2.setAdapter(daVar);
        this.f40362b.setSelectorDrawableColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23092i6));
        new f2.h0(new ha(this)).d(this.f40362b);
        ((FrameLayout) this.fragmentView).addView(this.f40362b, g7.e6.c(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new jh.d(6));
        this.f40362b.setOnItemClickListener(new ba(this));
        AndroidUtilities.runOnUIThread(new kt0(this, 19), 40L);
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        ga gaVar = this.f40371y;
        if (gaVar != null) {
            if (!gaVar.f38487a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.f40371y.f38487a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.f40371y.f38487a.requestFocus();
            if (z10) {
                AndroidUtilities.showKeyboard(this.f40371y.f38487a);
            }
        }
    }

    public final TLRPC.User e0() {
        long j10 = this.f40370x;
        int i9 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i10 = this.currentAccount;
        if (i9 != 0) {
            return MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        }
        return UserConfig.getInstance(i10).getCurrentUser();
    }

    public final long f0() {
        long j10 = this.f40370x;
        if (j10 != 0) {
            return j10;
        }
        return UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    public final void g0() {
        if (this.f40362b == null) {
            return;
        }
        for (int i9 = 0; i9 < this.f40362b.getChildCount(); i9++) {
            View childAt = this.f40362b.getChildAt(i9);
            if ((childAt instanceof org.telegram.ui.Cells.m4) && i9 == 0) {
                AndroidUtilities.shakeViewSpring(((org.telegram.ui.Cells.m4) childAt).getTextView());
            } else if (childAt instanceof la) {
                AndroidUtilities.shakeViewSpring(childAt);
            } else if (childAt instanceof ga) {
                ga gaVar = (ga) childAt;
                AndroidUtilities.shakeViewSpring(gaVar.f38487a);
                AndroidUtilities.shakeViewSpring(gaVar.f38488b);
            }
        }
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        return arrayList;
    }

    public final void h0(int r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ma.h0(int, boolean, boolean):void");
    }

    public final void i0(TLRPC.TL_username tL_username, boolean z10, boolean z11) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.v;
            if (i9 < arrayList.size()) {
                if (arrayList.get(i9) == tL_username) {
                    h0(i9 + 4, z10, z11);
                    return;
                }
                i9++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            d0(false);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            d0(false);
        }
    }
}
