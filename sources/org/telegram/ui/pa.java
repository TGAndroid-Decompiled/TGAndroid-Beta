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
public final class pa extends org.telegram.ui.ActionBar.p2 {
    public static final Paint E = new Paint(1);
    public static final Paint F = new Paint(1);
    public static final Paint G = new Paint(1);
    public ma B;
    public oa C;
    public org.telegram.ui.Cells.x1 D;
    public org.telegram.ui.ActionBar.w0 f39951a;
    public org.telegram.ui.Components.sl0 f39952b;
    public ga f39953c;
    public boolean d;
    public int f39954e;
    public String f39955f;
    public org.telegram.messenger.voip.h h;
    public boolean f39956n;
    public String f39957r;
    public final ArrayList f39958s;
    public final ArrayList v;
    public final ArrayList f39959w;
    public final long f39960x;
    public ja f39961y;

    public pa(Bundle bundle) {
        super(bundle);
        this.f39957r = "";
        this.f39958s = new ArrayList();
        this.v = new ArrayList();
        this.f39959w = new ArrayList();
        if (bundle != null) {
            this.f39960x = bundle.getLong("bot_id");
        }
    }

    public static void U(pa paVar, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            d2Var.dismiss();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        org.telegram.ui.Components.z4.f0(paVar.currentAccount, tL_error, paVar, updateusername, new Object[0]);
        paVar.h0();
    }

    public static void V(pa paVar, int i10) {
        ConnectionsManager.getInstance(paVar.currentAccount).cancelRequest(i10, true);
    }

    public static void W(pa paVar, String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        paVar.f39954e = ConnectionsManager.getInstance(paVar.currentAccount).sendRequest(checkusername, new ba(paVar, str, checkusername, 0), 2);
    }

    public static void X(pa paVar, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user) {
        try {
            d2Var.dismiss();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        arrayList.add(user);
        MessagesController.getInstance(paVar.currentAccount).putUsers(arrayList, false);
        MessagesStorage.getInstance(paVar.currentAccount).putUsersAndChats(arrayList, null, false, true);
        UserConfig.getInstance(paVar.currentAccount).saveConfig(true);
        paVar.finishFragment();
    }

    public static void Y(pa paVar) {
        TL_bots.reorderUsernames reorderusernames;
        long j10 = paVar.f39960x;
        ArrayList arrayList = paVar.v;
        ArrayList arrayList2 = paVar.f39958s;
        if (!paVar.d) {
            return;
        }
        paVar.d = false;
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
            reorderusernames3.bot = MessagesController.getInstance(paVar.currentAccount).getInputUser(j10);
            reorderusernames3.order = arrayList3;
            reorderusernames = reorderusernames3;
        }
        paVar.getConnectionsManager().sendRequest(reorderusernames, new oh.p5(5));
        ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList);
        TLRPC.User user = MessagesController.getInstance(paVar.currentAccount).getUser(Long.valueOf(paVar.g0()));
        user.usernames = arrayList4;
        MessagesController.getInstance(paVar.currentAccount).putUser(user, false, true);
    }

    public static void Z(pa paVar) {
        if (paVar.f39960x != 0) {
            paVar.finishFragment();
            return;
        }
        if (paVar.f39957r.startsWith("@")) {
            paVar.f39957r = paVar.f39957r.substring(1);
        }
        if (!paVar.f39957r.isEmpty() && !paVar.d0(paVar.f39957r)) {
            paVar.h0();
            return;
        }
        TLRPC.User f02 = paVar.f0();
        if (paVar.getParentActivity() != null && f02 != null) {
            String publicUsername = UserObject.getPublicUsername(f02);
            if (publicUsername == null) {
                publicUsername = "";
            }
            if (publicUsername.equals(paVar.f39957r)) {
                paVar.finishFragment();
                return;
            }
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(paVar.getParentActivity(), 3, null);
            TL_account.updateUsername updateusername = new TL_account.updateUsername();
            updateusername.username = paVar.f39957r;
            NotificationCenter.getInstance(paVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            int sendRequest = ConnectionsManager.getInstance(paVar.currentAccount).sendRequest(updateusername, new ba(paVar, d2Var, updateusername, 1), 2);
            ConnectionsManager.getInstance(paVar.currentAccount).bindRequestToGuid(sendRequest, paVar.classGuid);
            d2Var.setOnCancelListener(new mh.v(paVar, sendRequest, 1));
            d2Var.show();
        }
    }

    public static int b0(pa paVar) {
        return paVar.currentAccount;
    }

    @Override
    public final View createView(Context context) {
        String str;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Username));
        this.actionBar.setActionBarMenuOnItemClick(new fg.l1(this, 14));
        this.f39951a = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(g0()));
        if (user == null) {
            user = f0();
        }
        if (user != null) {
            this.f39957r = null;
            if (user.usernames != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= user.usernames.size()) {
                        break;
                    }
                    TLRPC.TL_username tL_username = user.usernames.get(i10);
                    if (tL_username != null && tL_username.editable) {
                        this.f39957r = tL_username.username;
                        break;
                    }
                    i10++;
                }
            }
            if (this.f39957r == null && (str = user.username) != null) {
                this.f39957r = str;
            }
            if (this.f39957r == null) {
                this.f39957r = "";
            }
            this.f39958s.clear();
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
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.f39952b = sl0Var;
        sl0Var.o1();
        this.actionBar.setAdaptiveBackground(this.f39952b);
        this.fragmentView.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21607a7));
        this.f39952b.setLayoutManager(new f2.j0());
        org.telegram.ui.Components.sl0 sl0Var2 = this.f39952b;
        ga gaVar = new ga(this);
        this.f39953c = gaVar;
        sl0Var2.setAdapter(gaVar);
        this.f39952b.setSelectorDrawableColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21752i6));
        new f2.f0(new ka(this)).d(this.f39952b);
        ((FrameLayout) this.fragmentView).addView(this.f39952b, k7.c6.c(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new org.telegram.ui.ActionBar.s2(5));
        this.f39952b.setOnItemClickListener(new ea(this));
        AndroidUtilities.runOnUIThread(new yt0(this, 19), 40L);
        return this.fragmentView;
    }

    public final boolean d0(String str) {
        int i10;
        if (str != null && str.startsWith("@")) {
            str = str.substring(1);
        }
        org.telegram.ui.Cells.x1 x1Var = this.D;
        if (x1Var != null) {
            if (!TextUtils.isEmpty(str)) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            x1Var.setVisibility(i10);
            oa oaVar = this.C;
            if (oaVar != null) {
                oa.a(oaVar);
            }
        }
        org.telegram.messenger.voip.h hVar = this.h;
        if (hVar != null) {
            AndroidUtilities.cancelRunOnUIThread(hVar);
            this.h = null;
            this.f39955f = null;
            if (this.f39954e != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f39954e, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i11 = 0; i11 < str.length(); i11++) {
                    char charAt = str.charAt(i11);
                    if (i11 == 0 && charAt >= '0' && charAt <= '9') {
                        org.telegram.ui.Cells.x1 x1Var2 = this.D;
                        if (x1Var2 != null) {
                            x1Var2.setText(LocaleController.getString(R.string.UsernameInvalidStartNumber));
                            org.telegram.ui.Cells.x1 x1Var3 = this.D;
                            int i12 = org.telegram.ui.ActionBar.k6.f21878p7;
                            x1Var3.setTag(Integer.valueOf(i12));
                            this.D.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
                            oa oaVar2 = this.C;
                            if (oaVar2 != null) {
                                oa.a(oaVar2);
                                return false;
                            }
                        }
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        org.telegram.ui.Cells.x1 x1Var4 = this.D;
                        if (x1Var4 != null) {
                            x1Var4.setText(LocaleController.getString(R.string.UsernameInvalid));
                            org.telegram.ui.Cells.x1 x1Var5 = this.D;
                            int i13 = org.telegram.ui.ActionBar.k6.f21878p7;
                            x1Var5.setTag(Integer.valueOf(i13));
                            this.D.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
                            oa oaVar3 = this.C;
                            if (oaVar3 != null) {
                                oa.a(oaVar3);
                                return false;
                            }
                        }
                    }
                }
            } else {
                org.telegram.ui.Cells.x1 x1Var6 = this.D;
                if (x1Var6 != null) {
                    x1Var6.setText(LocaleController.getString(R.string.UsernameInvalid));
                    org.telegram.ui.Cells.x1 x1Var7 = this.D;
                    int i14 = org.telegram.ui.ActionBar.k6.f21878p7;
                    x1Var7.setTag(Integer.valueOf(i14));
                    this.D.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
                    oa oaVar4 = this.C;
                    if (oaVar4 != null) {
                        oa.a(oaVar4);
                        return false;
                    }
                }
            }
            return false;
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                org.telegram.ui.Cells.x1 x1Var8 = this.D;
                if (x1Var8 != null) {
                    x1Var8.setText(LocaleController.getString(R.string.UsernameInvalidLong));
                    org.telegram.ui.Cells.x1 x1Var9 = this.D;
                    int i15 = org.telegram.ui.ActionBar.k6.f21878p7;
                    x1Var9.setTag(Integer.valueOf(i15));
                    this.D.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
                    oa oaVar5 = this.C;
                    if (oaVar5 != null) {
                        oa.a(oaVar5);
                        return false;
                    }
                }
            } else {
                String str2 = f0().username;
                if (str2 == null) {
                    str2 = "";
                }
                if (str.equals(str2)) {
                    org.telegram.ui.Cells.x1 x1Var10 = this.D;
                    if (x1Var10 != null) {
                        x1Var10.setText(LocaleController.formatString("UsernameAvailable", R.string.UsernameAvailable, str));
                        org.telegram.ui.Cells.x1 x1Var11 = this.D;
                        int i16 = org.telegram.ui.ActionBar.k6.f22000w6;
                        x1Var11.setTag(Integer.valueOf(i16));
                        this.D.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
                        oa oaVar6 = this.C;
                        if (oaVar6 != null) {
                            oa.a(oaVar6);
                        }
                    }
                    return true;
                }
                org.telegram.ui.Cells.x1 x1Var12 = this.D;
                if (x1Var12 != null) {
                    x1Var12.setText(LocaleController.getString(R.string.UsernameChecking));
                    org.telegram.ui.Cells.x1 x1Var13 = this.D;
                    int i17 = org.telegram.ui.ActionBar.k6.F6;
                    x1Var13.setTag(Integer.valueOf(i17));
                    this.D.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i17, false));
                    oa oaVar7 = this.C;
                    if (oaVar7 != null) {
                        oa.a(oaVar7);
                    }
                }
                this.f39955f = str;
                org.telegram.messenger.voip.h hVar2 = new org.telegram.messenger.voip.h(25, this, str);
                this.h = hVar2;
                AndroidUtilities.runOnUIThread(hVar2, 300L);
                return true;
            }
        } else {
            org.telegram.ui.Cells.x1 x1Var14 = this.D;
            if (x1Var14 != null) {
                x1Var14.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                org.telegram.ui.Cells.x1 x1Var15 = this.D;
                int i18 = org.telegram.ui.ActionBar.k6.f21878p7;
                x1Var15.setTag(Integer.valueOf(i18));
                this.D.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i18, false));
                oa oaVar8 = this.C;
                if (oaVar8 != null) {
                    oa.a(oaVar8);
                }
            }
        }
        return false;
    }

    public final void e0(boolean z4) {
        ja jaVar = this.f39961y;
        if (jaVar != null) {
            if (!jaVar.f37889a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.f39961y.f37889a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.f39961y.f37889a.requestFocus();
            if (z4) {
                AndroidUtilities.showKeyboard(this.f39961y.f37889a);
            }
        }
    }

    public final TLRPC.User f0() {
        long j10 = this.f39960x;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.currentAccount;
        if (i10 != 0) {
            return MessagesController.getInstance(i11).getUser(Long.valueOf(j10));
        }
        return UserConfig.getInstance(i11).getCurrentUser();
    }

    public final long g0() {
        long j10 = this.f39960x;
        if (j10 != 0) {
            return j10;
        }
        return UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21661d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21983v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21948t8));
        return arrayList;
    }

    public final void h0() {
        if (this.f39952b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f39952b.getChildCount(); i10++) {
            View childAt = this.f39952b.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.m4) && i10 == 0) {
                AndroidUtilities.shakeViewSpring(((org.telegram.ui.Cells.m4) childAt).getTextView());
            } else if (childAt instanceof oa) {
                AndroidUtilities.shakeViewSpring(childAt);
            } else if (childAt instanceof ja) {
                ja jaVar = (ja) childAt;
                AndroidUtilities.shakeViewSpring(jaVar.f37889a);
                AndroidUtilities.shakeViewSpring(jaVar.f37890b);
            }
        }
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
    }

    public final void i0(int r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pa.i0(int, boolean, boolean):void");
    }

    public final void j0(TLRPC.TL_username tL_username, boolean z4, boolean z10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) == tL_username) {
                    i0(i10 + 4, z4, z10);
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
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4) {
            e0(false);
        }
    }
}
