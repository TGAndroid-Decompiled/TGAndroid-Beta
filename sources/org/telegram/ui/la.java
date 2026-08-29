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
public final class la extends org.telegram.ui.ActionBar.o2 {
    public static final Paint D = new Paint(1);
    public static final Paint E = new Paint(1);
    public static final Paint F = new Paint(1);
    public ia A;
    public ka B;
    public org.telegram.ui.Cells.w1 C;
    public org.telegram.ui.ActionBar.w0 f40139a;
    public org.telegram.ui.Components.jl0 f40140b;
    public ca f40141c;
    public boolean d;
    public int f40142e;
    public String f40143f;
    public org.telegram.ui.ActionBar.c h;
    public boolean f40144n;
    public String f40145r;
    public final ArrayList f40146s;
    public final ArrayList v;
    public final ArrayList f40147w;
    public final long f40148x;
    public fa f40149y;

    public la(Bundle bundle) {
        super(bundle);
        this.f40145r = "";
        this.f40146s = new ArrayList();
        this.v = new ArrayList();
        this.f40147w = new ArrayList();
        if (bundle != null) {
            this.f40148x = bundle.getLong("bot_id");
        }
    }

    public static void U(la laVar, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            c2Var.dismiss();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        org.telegram.ui.Components.c5.f0(laVar.currentAccount, tL_error, laVar, updateusername, new Object[0]);
        laVar.h0();
    }

    public static void V(la laVar, int i10) {
        ConnectionsManager.getInstance(laVar.currentAccount).cancelRequest(i10, true);
    }

    public static void W(la laVar, String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        laVar.f40142e = ConnectionsManager.getInstance(laVar.currentAccount).sendRequest(checkusername, new x9(laVar, str, checkusername, 0), 2);
    }

    public static void X(la laVar, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.User user) {
        try {
            c2Var.dismiss();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        arrayList.add(user);
        MessagesController.getInstance(laVar.currentAccount).putUsers(arrayList, false);
        MessagesStorage.getInstance(laVar.currentAccount).putUsersAndChats(arrayList, null, false, true);
        UserConfig.getInstance(laVar.currentAccount).saveConfig(true);
        laVar.finishFragment();
    }

    public static void Y(la laVar) {
        TL_bots.reorderUsernames reorderusernames;
        long j10 = laVar.f40148x;
        ArrayList arrayList = laVar.v;
        ArrayList arrayList2 = laVar.f40146s;
        if (!laVar.d) {
            return;
        }
        laVar.d = false;
        ArrayList<String> arrayList3 = new ArrayList<>();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            if (((TLRPC.TL_username) arrayList2.get(i10)).active) {
                arrayList3.add(((TLRPC.TL_username) arrayList2.get(i10)).username);
            }
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((TLRPC.TL_username) arrayList.get(i11)).active) {
                arrayList3.add(((TLRPC.TL_username) arrayList.get(i11)).username);
            }
        }
        if (j10 == 0) {
            TL_account.reorderUsernames reorderusernames2 = new TL_account.reorderUsernames();
            reorderusernames2.order = arrayList3;
            reorderusernames = reorderusernames2;
        } else {
            TL_bots.reorderUsernames reorderusernames3 = new TL_bots.reorderUsernames();
            reorderusernames3.bot = MessagesController.getInstance(laVar.currentAccount).getInputUser(j10);
            reorderusernames3.order = arrayList3;
            reorderusernames = reorderusernames3;
        }
        laVar.getConnectionsManager().sendRequest(reorderusernames, new lh.o5(6));
        ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList);
        TLRPC.User user = MessagesController.getInstance(laVar.currentAccount).getUser(Long.valueOf(laVar.g0()));
        user.usernames = arrayList4;
        MessagesController.getInstance(laVar.currentAccount).putUser(user, false, true);
    }

    public static void Z(la laVar) {
        if (laVar.f40148x != 0) {
            laVar.finishFragment();
            return;
        }
        if (laVar.f40145r.startsWith("@")) {
            laVar.f40145r = laVar.f40145r.substring(1);
        }
        if (!laVar.f40145r.isEmpty() && !laVar.d0(laVar.f40145r)) {
            laVar.h0();
            return;
        }
        TLRPC.User f02 = laVar.f0();
        if (laVar.getParentActivity() != null && f02 != null) {
            String publicUsername = UserObject.getPublicUsername(f02);
            if (publicUsername == null) {
                publicUsername = "";
            }
            if (publicUsername.equals(laVar.f40145r)) {
                laVar.finishFragment();
                return;
            }
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(laVar.getParentActivity(), 3, null);
            TL_account.updateUsername updateusername = new TL_account.updateUsername();
            updateusername.username = laVar.f40145r;
            NotificationCenter.getInstance(laVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            int sendRequest = ConnectionsManager.getInstance(laVar.currentAccount).sendRequest(updateusername, new x9(laVar, c2Var, updateusername, 1), 2);
            ConnectionsManager.getInstance(laVar.currentAccount).bindRequestToGuid(sendRequest, laVar.classGuid);
            c2Var.setOnCancelListener(new jh.w(laVar, sendRequest, 1));
            c2Var.show();
        }
    }

    public static int b0(la laVar) {
        return laVar.currentAccount;
    }

    @Override
    public final View createView(Context context) {
        String str;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Username));
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 14));
        this.f40139a = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(g0()));
        if (user == null) {
            user = f0();
        }
        if (user != null) {
            this.f40145r = null;
            if (user.usernames != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= user.usernames.size()) {
                        break;
                    }
                    TLRPC.TL_username tL_username = user.usernames.get(i10);
                    if (tL_username != null && tL_username.editable) {
                        this.f40145r = tL_username.username;
                        break;
                    }
                    i10++;
                }
            }
            if (this.f40145r == null && (str = user.username) != null) {
                this.f40145r = str;
            }
            if (this.f40145r == null) {
                this.f40145r = "";
            }
            this.f40146s.clear();
            ArrayList arrayList = this.v;
            arrayList.clear();
            for (int i11 = 0; i11 < user.usernames.size(); i11++) {
                if (user.usernames.get(i11).active) {
                    arrayList.add(user.usernames.get(i11));
                }
            }
            for (int i12 = 0; i12 < user.usernames.size(); i12++) {
                if (!user.usernames.get(i12).active) {
                    arrayList.add(user.usernames.get(i12));
                }
            }
        }
        this.fragmentView = new FrameLayout(context);
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.f40140b = jl0Var;
        jl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f40140b);
        this.fragmentView.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23009a7));
        this.f40140b.setLayoutManager(new f2.j0());
        org.telegram.ui.Components.jl0 jl0Var2 = this.f40140b;
        ca caVar = new ca(this);
        this.f40141c = caVar;
        jl0Var2.setAdapter(caVar);
        this.f40140b.setSelectorDrawableColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23152i6));
        new f2.e0(new ga(this)).d(this.f40140b);
        ((FrameLayout) this.fragmentView).addView(this.f40140b, i7.f6.c(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new mh.d(6));
        this.f40140b.setOnItemClickListener(new aa(this));
        AndroidUtilities.runOnUIThread(new it0(this, 19), 40L);
        return this.fragmentView;
    }

    public final boolean d0(String str) {
        int i10;
        if (str != null && str.startsWith("@")) {
            str = str.substring(1);
        }
        org.telegram.ui.Cells.w1 w1Var = this.C;
        if (w1Var != null) {
            if (!TextUtils.isEmpty(str)) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            w1Var.setVisibility(i10);
            ka kaVar = this.B;
            if (kaVar != null) {
                ka.a(kaVar);
            }
        }
        org.telegram.ui.ActionBar.c cVar = this.h;
        if (cVar != null) {
            AndroidUtilities.cancelRunOnUIThread(cVar);
            this.h = null;
            this.f40143f = null;
            if (this.f40142e != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f40142e, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i11 = 0; i11 < str.length(); i11++) {
                    char charAt = str.charAt(i11);
                    if (i11 == 0 && charAt >= '0' && charAt <= '9') {
                        org.telegram.ui.Cells.w1 w1Var2 = this.C;
                        if (w1Var2 != null) {
                            w1Var2.setText(LocaleController.getString(R.string.UsernameInvalidStartNumber));
                            org.telegram.ui.Cells.w1 w1Var3 = this.C;
                            int i12 = org.telegram.ui.ActionBar.g6.f23279p7;
                            w1Var3.setTag(Integer.valueOf(i12));
                            this.C.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                            ka kaVar2 = this.B;
                            if (kaVar2 != null) {
                                ka.a(kaVar2);
                                return false;
                            }
                        }
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        org.telegram.ui.Cells.w1 w1Var4 = this.C;
                        if (w1Var4 != null) {
                            w1Var4.setText(LocaleController.getString(R.string.UsernameInvalid));
                            org.telegram.ui.Cells.w1 w1Var5 = this.C;
                            int i13 = org.telegram.ui.ActionBar.g6.f23279p7;
                            w1Var5.setTag(Integer.valueOf(i13));
                            this.C.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
                            ka kaVar3 = this.B;
                            if (kaVar3 != null) {
                                ka.a(kaVar3);
                                return false;
                            }
                        }
                    }
                }
            } else {
                org.telegram.ui.Cells.w1 w1Var6 = this.C;
                if (w1Var6 != null) {
                    w1Var6.setText(LocaleController.getString(R.string.UsernameInvalid));
                    org.telegram.ui.Cells.w1 w1Var7 = this.C;
                    int i14 = org.telegram.ui.ActionBar.g6.f23279p7;
                    w1Var7.setTag(Integer.valueOf(i14));
                    this.C.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
                    ka kaVar4 = this.B;
                    if (kaVar4 != null) {
                        ka.a(kaVar4);
                        return false;
                    }
                }
            }
            return false;
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                org.telegram.ui.Cells.w1 w1Var8 = this.C;
                if (w1Var8 != null) {
                    w1Var8.setText(LocaleController.getString(R.string.UsernameInvalidLong));
                    org.telegram.ui.Cells.w1 w1Var9 = this.C;
                    int i15 = org.telegram.ui.ActionBar.g6.f23279p7;
                    w1Var9.setTag(Integer.valueOf(i15));
                    this.C.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
                    ka kaVar5 = this.B;
                    if (kaVar5 != null) {
                        ka.a(kaVar5);
                        return false;
                    }
                }
            } else {
                String str2 = f0().username;
                if (str2 == null) {
                    str2 = "";
                }
                if (str.equals(str2)) {
                    org.telegram.ui.Cells.w1 w1Var10 = this.C;
                    if (w1Var10 != null) {
                        w1Var10.setText(LocaleController.formatString("UsernameAvailable", R.string.UsernameAvailable, str));
                        org.telegram.ui.Cells.w1 w1Var11 = this.C;
                        int i16 = org.telegram.ui.ActionBar.g6.f23401w6;
                        w1Var11.setTag(Integer.valueOf(i16));
                        this.C.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
                        ka kaVar6 = this.B;
                        if (kaVar6 != null) {
                            ka.a(kaVar6);
                        }
                    }
                    return true;
                }
                org.telegram.ui.Cells.w1 w1Var12 = this.C;
                if (w1Var12 != null) {
                    w1Var12.setText(LocaleController.getString(R.string.UsernameChecking));
                    org.telegram.ui.Cells.w1 w1Var13 = this.C;
                    int i17 = org.telegram.ui.ActionBar.g6.F6;
                    w1Var13.setTag(Integer.valueOf(i17));
                    this.C.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
                    ka kaVar7 = this.B;
                    if (kaVar7 != null) {
                        ka.a(kaVar7);
                    }
                }
                this.f40143f = str;
                org.telegram.ui.ActionBar.c cVar2 = new org.telegram.ui.ActionBar.c(18, this, str);
                this.h = cVar2;
                AndroidUtilities.runOnUIThread(cVar2, 300L);
                return true;
            }
        } else {
            org.telegram.ui.Cells.w1 w1Var14 = this.C;
            if (w1Var14 != null) {
                w1Var14.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                org.telegram.ui.Cells.w1 w1Var15 = this.C;
                int i18 = org.telegram.ui.ActionBar.g6.f23279p7;
                w1Var15.setTag(Integer.valueOf(i18));
                this.C.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i18, false));
                ka kaVar8 = this.B;
                if (kaVar8 != null) {
                    ka.a(kaVar8);
                }
            }
        }
        return false;
    }

    public final void e0(boolean z10) {
        fa faVar = this.f40149y;
        if (faVar != null) {
            if (!faVar.f38082a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.f40149y.f38082a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.f40149y.f38082a.requestFocus();
            if (z10) {
                AndroidUtilities.showKeyboard(this.f40149y.f38082a);
            }
        }
    }

    public final TLRPC.User f0() {
        long j10 = this.f40148x;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.currentAccount;
        if (i10 != 0) {
            return MessagesController.getInstance(i11).getUser(Long.valueOf(j10));
        }
        return UserConfig.getInstance(i11).getCurrentUser();
    }

    public final long g0() {
        long j10 = this.f40148x;
        if (j10 != 0) {
            return j10;
        }
        return UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        return arrayList;
    }

    public final void h0() {
        if (this.f40140b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f40140b.getChildCount(); i10++) {
            View childAt = this.f40140b.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.k4) && i10 == 0) {
                AndroidUtilities.shakeViewSpring(((org.telegram.ui.Cells.k4) childAt).getTextView());
            } else if (childAt instanceof ka) {
                AndroidUtilities.shakeViewSpring(childAt);
            } else if (childAt instanceof fa) {
                fa faVar = (fa) childAt;
                AndroidUtilities.shakeViewSpring(faVar.f38082a);
                AndroidUtilities.shakeViewSpring(faVar.f38083b);
            }
        }
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
    }

    public final void i0(int r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.la.i0(int, boolean, boolean):void");
    }

    public final void j0(TLRPC.TL_username tL_username, boolean z10, boolean z11) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) == tL_username) {
                    i0(i10 + 4, z10, z11);
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            e0(false);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            e0(false);
        }
    }
}
