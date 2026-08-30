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
    public org.telegram.ui.ActionBar.w0 f37251a;
    public org.telegram.ui.Components.sl0 f37252b;
    public ga f37253c;
    public boolean d;
    public int e;
    public String f37254f;
    public org.telegram.messenger.voip.b h;
    public boolean f37255n;
    public String f37256r;
    public final ArrayList f37257s;
    public final ArrayList v;
    public final ArrayList f37258w;
    public final long f37259x;
    public ja f37260y;

    public pa(Bundle bundle) {
        super(bundle);
        this.f37256r = "";
        this.f37257s = new ArrayList();
        this.v = new ArrayList();
        this.f37258w = new ArrayList();
        if (bundle != null) {
            this.f37259x = bundle.getLong("bot_id");
        }
    }

    public static void U(pa paVar, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            d2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
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
        paVar.e = ConnectionsManager.getInstance(paVar.currentAccount).sendRequest(checkusername, new ba(paVar, str, checkusername, 0), 2);
    }

    public static void X(pa paVar, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user) {
        try {
            d2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
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
        long j10 = paVar.f37259x;
        ArrayList arrayList = paVar.v;
        ArrayList arrayList2 = paVar.f37257s;
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
        paVar.getConnectionsManager().sendRequest(reorderusernames, new nh.p5(5));
        ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList);
        TLRPC.User user = MessagesController.getInstance(paVar.currentAccount).getUser(Long.valueOf(paVar.g0()));
        user.usernames = arrayList4;
        MessagesController.getInstance(paVar.currentAccount).putUser(user, false, true);
    }

    public static void Z(pa paVar) {
        if (paVar.f37259x != 0) {
            paVar.finishFragment();
            return;
        }
        if (paVar.f37256r.startsWith("@")) {
            paVar.f37256r = paVar.f37256r.substring(1);
        }
        if (!paVar.f37256r.isEmpty() && !paVar.d0(paVar.f37256r)) {
            paVar.h0();
            return;
        }
        TLRPC.User f02 = paVar.f0();
        if (paVar.getParentActivity() != null && f02 != null) {
            String publicUsername = UserObject.getPublicUsername(f02);
            if (publicUsername == null) {
                publicUsername = "";
            }
            if (publicUsername.equals(paVar.f37256r)) {
                paVar.finishFragment();
                return;
            }
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(paVar.getParentActivity(), 3, null);
            TL_account.updateUsername updateusername = new TL_account.updateUsername();
            updateusername.username = paVar.f37256r;
            NotificationCenter.getInstance(paVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            int sendRequest = ConnectionsManager.getInstance(paVar.currentAccount).sendRequest(updateusername, new ba(paVar, d2Var, updateusername, 1), 2);
            ConnectionsManager.getInstance(paVar.currentAccount).bindRequestToGuid(sendRequest, paVar.classGuid);
            d2Var.setOnCancelListener(new lh.w(paVar, sendRequest, 1));
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
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 14));
        this.f37251a = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(g0()));
        if (user == null) {
            user = f0();
        }
        if (user != null) {
            this.f37256r = null;
            if (user.usernames != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= user.usernames.size()) {
                        break;
                    }
                    TLRPC.TL_username tL_username = user.usernames.get(i10);
                    if (tL_username != null && tL_username.editable) {
                        this.f37256r = tL_username.username;
                        break;
                    }
                    i10++;
                }
            }
            if (this.f37256r == null && (str = user.username) != null) {
                this.f37256r = str;
            }
            if (this.f37256r == null) {
                this.f37256r = "";
            }
            this.f37257s.clear();
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
        this.f37252b = sl0Var;
        sl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f37252b);
        this.fragmentView.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19852a7));
        this.f37252b.setLayoutManager(new f2.i0());
        org.telegram.ui.Components.sl0 sl0Var2 = this.f37252b;
        ga gaVar = new ga(this);
        this.f37253c = gaVar;
        sl0Var2.setAdapter(gaVar);
        this.f37252b.setSelectorDrawableColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19996i6));
        new f2.e0(new ka(this)).d(this.f37252b);
        ((FrameLayout) this.fragmentView).addView(this.f37252b, k7.b6.c(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new oh.d(6));
        this.f37252b.setOnItemClickListener(new ea(this));
        AndroidUtilities.runOnUIThread(new rt0(this, 19), 40L);
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
        org.telegram.messenger.voip.b bVar = this.h;
        if (bVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bVar);
            this.h = null;
            this.f37254f = null;
            if (this.e != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.e, true);
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
                            int i12 = org.telegram.ui.ActionBar.j6.f20122p7;
                            x1Var3.setTag(Integer.valueOf(i12));
                            this.D.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
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
                            int i13 = org.telegram.ui.ActionBar.j6.f20122p7;
                            x1Var5.setTag(Integer.valueOf(i13));
                            this.D.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
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
                    int i14 = org.telegram.ui.ActionBar.j6.f20122p7;
                    x1Var7.setTag(Integer.valueOf(i14));
                    this.D.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
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
                    int i15 = org.telegram.ui.ActionBar.j6.f20122p7;
                    x1Var9.setTag(Integer.valueOf(i15));
                    this.D.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
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
                        int i16 = org.telegram.ui.ActionBar.j6.f20244w6;
                        x1Var11.setTag(Integer.valueOf(i16));
                        this.D.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
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
                    int i17 = org.telegram.ui.ActionBar.j6.F6;
                    x1Var13.setTag(Integer.valueOf(i17));
                    this.D.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
                    oa oaVar7 = this.C;
                    if (oaVar7 != null) {
                        oa.a(oaVar7);
                    }
                }
                this.f37254f = str;
                org.telegram.messenger.voip.b bVar2 = new org.telegram.messenger.voip.b(27, this, str);
                this.h = bVar2;
                AndroidUtilities.runOnUIThread(bVar2, 300L);
                return true;
            }
        } else {
            org.telegram.ui.Cells.x1 x1Var14 = this.D;
            if (x1Var14 != null) {
                x1Var14.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                org.telegram.ui.Cells.x1 x1Var15 = this.D;
                int i18 = org.telegram.ui.ActionBar.j6.f20122p7;
                x1Var15.setTag(Integer.valueOf(i18));
                this.D.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
                oa oaVar8 = this.C;
                if (oaVar8 != null) {
                    oa.a(oaVar8);
                }
            }
        }
        return false;
    }

    public final void e0(boolean z4) {
        ja jaVar = this.f37260y;
        if (jaVar != null) {
            if (!jaVar.f35303a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.f37260y.f35303a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.f37260y.f35303a.requestFocus();
            if (z4) {
                AndroidUtilities.showKeyboard(this.f37260y.f35303a);
            }
        }
    }

    public final TLRPC.User f0() {
        long j10 = this.f37259x;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.currentAccount;
        if (i10 != 0) {
            return MessagesController.getInstance(i11).getUser(Long.valueOf(j10));
        }
        return UserConfig.getInstance(i11).getCurrentUser();
    }

    public final long g0() {
        long j10 = this.f37259x;
        if (j10 != 0) {
            return j10;
        }
        return UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19906d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        return arrayList;
    }

    public final void h0() {
        if (this.f37252b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f37252b.getChildCount(); i10++) {
            View childAt = this.f37252b.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.m4) && i10 == 0) {
                AndroidUtilities.shakeViewSpring(((org.telegram.ui.Cells.m4) childAt).getTextView());
            } else if (childAt instanceof oa) {
                AndroidUtilities.shakeViewSpring(childAt);
            } else if (childAt instanceof ja) {
                ja jaVar = (ja) childAt;
                AndroidUtilities.shakeViewSpring(jaVar.f35303a);
                AndroidUtilities.shakeViewSpring(jaVar.f35304b);
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
