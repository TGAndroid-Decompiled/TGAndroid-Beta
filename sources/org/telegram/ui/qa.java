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
public final class qa extends org.telegram.ui.ActionBar.m2 {
    public static final Paint H = new Paint(1);
    public static final Paint I = new Paint(1);
    public static final Paint J = new Paint(1);
    public na E;
    public pa F;
    public org.telegram.ui.Cells.y1 G;
    public org.telegram.ui.ActionBar.u0 f36830a;
    public org.telegram.ui.Components.wl0 f36831b;
    public ha f36832c;
    public boolean d;
    public int e;
    public String f36833f;
    public org.telegram.ui.ActionBar.a6 h;
    public boolean f36834n;
    public String f36835r;
    public final ArrayList f36836s;
    public final ArrayList v;
    public final ArrayList f36837w;
    public final long f36838x;
    public ka f36839y;

    public qa(Bundle bundle) {
        super(bundle);
        this.f36835r = "";
        this.f36836s = new ArrayList();
        this.v = new ArrayList();
        this.f36837w = new ArrayList();
        if (bundle != null) {
            this.f36838x = bundle.getLong("bot_id");
        }
    }

    public static void U(qa qaVar, org.telegram.ui.ActionBar.a2 a2Var, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            a2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.Components.e5.f0(qaVar.currentAccount, tL_error, qaVar, updateusername, new Object[0]);
        qaVar.h0();
    }

    public static void V(qa qaVar, int i10) {
        ConnectionsManager.getInstance(qaVar.currentAccount).cancelRequest(i10, true);
    }

    public static void W(qa qaVar, String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        qaVar.e = ConnectionsManager.getInstance(qaVar.currentAccount).sendRequest(checkusername, new aa(qaVar, str, checkusername, 0), 2);
    }

    public static void X(qa qaVar, org.telegram.ui.ActionBar.a2 a2Var, TLRPC.User user) {
        try {
            a2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        arrayList.add(user);
        MessagesController.getInstance(qaVar.currentAccount).putUsers(arrayList, false);
        MessagesStorage.getInstance(qaVar.currentAccount).putUsersAndChats(arrayList, null, false, true);
        UserConfig.getInstance(qaVar.currentAccount).saveConfig(true);
        qaVar.finishFragment();
    }

    public static void Y(qa qaVar) {
        TL_bots.reorderUsernames reorderusernames;
        long j3 = qaVar.f36838x;
        ArrayList arrayList = qaVar.v;
        ArrayList arrayList2 = qaVar.f36836s;
        if (!qaVar.d) {
            return;
        }
        qaVar.d = false;
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
        if (j3 == 0) {
            TL_account.reorderUsernames reorderusernames2 = new TL_account.reorderUsernames();
            reorderusernames2.order = arrayList3;
            reorderusernames = reorderusernames2;
        } else {
            TL_bots.reorderUsernames reorderusernames3 = new TL_bots.reorderUsernames();
            reorderusernames3.bot = MessagesController.getInstance(qaVar.currentAccount).getInputUser(j3);
            reorderusernames3.order = arrayList3;
            reorderusernames = reorderusernames3;
        }
        qaVar.getConnectionsManager().sendRequest(reorderusernames, new ai.u7(9));
        ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList);
        TLRPC.User user = MessagesController.getInstance(qaVar.currentAccount).getUser(Long.valueOf(qaVar.g0()));
        user.usernames = arrayList4;
        MessagesController.getInstance(qaVar.currentAccount).putUser(user, false, true);
    }

    public static void Z(qa qaVar) {
        if (qaVar.f36838x != 0) {
            qaVar.finishFragment();
            return;
        }
        if (qaVar.f36835r.startsWith("@")) {
            qaVar.f36835r = qaVar.f36835r.substring(1);
        }
        if (!qaVar.f36835r.isEmpty() && !qaVar.d0(qaVar.f36835r)) {
            qaVar.h0();
            return;
        }
        TLRPC.User f02 = qaVar.f0();
        if (qaVar.getParentActivity() != null && f02 != null) {
            String publicUsername = UserObject.getPublicUsername(f02);
            if (publicUsername == null) {
                publicUsername = "";
            }
            if (publicUsername.equals(qaVar.f36835r)) {
                qaVar.finishFragment();
                return;
            }
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(qaVar.getParentActivity(), 3, null);
            TL_account.updateUsername updateusername = new TL_account.updateUsername();
            updateusername.username = qaVar.f36835r;
            NotificationCenter.getInstance(qaVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            int sendRequest = ConnectionsManager.getInstance(qaVar.currentAccount).sendRequest(updateusername, new aa(qaVar, a2Var, updateusername, 1), 2);
            ConnectionsManager.getInstance(qaVar.currentAccount).bindRequestToGuid(sendRequest, qaVar.classGuid);
            a2Var.setOnCancelListener(new ba(qaVar, sendRequest, 0));
            a2Var.show();
        }
    }

    public static int b0(qa qaVar) {
        return qaVar.currentAccount;
    }

    @Override
    public final View createView(Context context) {
        String str;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Username));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 27));
        this.f36830a = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(g0()));
        if (user == null) {
            user = f0();
        }
        if (user != null) {
            this.f36835r = null;
            if (user.usernames != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= user.usernames.size()) {
                        break;
                    }
                    TLRPC.TL_username tL_username = user.usernames.get(i10);
                    if (tL_username != null && tL_username.editable) {
                        this.f36835r = tL_username.username;
                        break;
                    }
                    i10++;
                }
            }
            if (this.f36835r == null && (str = user.username) != null) {
                this.f36835r = str;
            }
            if (this.f36835r == null) {
                this.f36835r = "";
            }
            this.f36836s.clear();
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
        org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(context, null);
        this.f36831b = wl0Var;
        wl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f36831b);
        this.fragmentView.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19003a7));
        this.f36831b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.wl0 wl0Var2 = this.f36831b;
        ha haVar = new ha(this);
        this.f36832c = haVar;
        wl0Var2.setAdapter(haVar);
        this.f36831b.setSelectorDrawableColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19148i6));
        new s4.y(new la(this)).e(this.f36831b);
        ((FrameLayout) this.fragmentView).addView(this.f36831b, w7.y5.c(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new bi.d(6));
        this.f36831b.setOnItemClickListener(new fa(this));
        AndroidUtilities.runOnUIThread(new eu0(this, 19), 40L);
        return this.fragmentView;
    }

    public final boolean d0(String str) {
        int i10;
        if (str != null && str.startsWith("@")) {
            str = str.substring(1);
        }
        org.telegram.ui.Cells.y1 y1Var = this.G;
        if (y1Var != null) {
            if (!TextUtils.isEmpty(str)) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            y1Var.setVisibility(i10);
            pa paVar = this.F;
            if (paVar != null) {
                pa.a(paVar);
            }
        }
        org.telegram.ui.ActionBar.a6 a6Var = this.h;
        if (a6Var != null) {
            AndroidUtilities.cancelRunOnUIThread(a6Var);
            this.h = null;
            this.f36833f = null;
            if (this.e != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.e, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i11 = 0; i11 < str.length(); i11++) {
                    char charAt = str.charAt(i11);
                    if (i11 == 0 && charAt >= '0' && charAt <= '9') {
                        org.telegram.ui.Cells.y1 y1Var2 = this.G;
                        if (y1Var2 != null) {
                            y1Var2.setText(LocaleController.getString(R.string.UsernameInvalidStartNumber));
                            org.telegram.ui.Cells.y1 y1Var3 = this.G;
                            int i12 = org.telegram.ui.ActionBar.h6.f19279p7;
                            y1Var3.setTag(Integer.valueOf(i12));
                            this.G.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
                            pa paVar2 = this.F;
                            if (paVar2 != null) {
                                pa.a(paVar2);
                                return false;
                            }
                        }
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        org.telegram.ui.Cells.y1 y1Var4 = this.G;
                        if (y1Var4 != null) {
                            y1Var4.setText(LocaleController.getString(R.string.UsernameInvalid));
                            org.telegram.ui.Cells.y1 y1Var5 = this.G;
                            int i13 = org.telegram.ui.ActionBar.h6.f19279p7;
                            y1Var5.setTag(Integer.valueOf(i13));
                            this.G.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
                            pa paVar3 = this.F;
                            if (paVar3 != null) {
                                pa.a(paVar3);
                                return false;
                            }
                        }
                    }
                }
            } else {
                org.telegram.ui.Cells.y1 y1Var6 = this.G;
                if (y1Var6 != null) {
                    y1Var6.setText(LocaleController.getString(R.string.UsernameInvalid));
                    org.telegram.ui.Cells.y1 y1Var7 = this.G;
                    int i14 = org.telegram.ui.ActionBar.h6.f19279p7;
                    y1Var7.setTag(Integer.valueOf(i14));
                    this.G.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
                    pa paVar4 = this.F;
                    if (paVar4 != null) {
                        pa.a(paVar4);
                        return false;
                    }
                }
            }
            return false;
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                org.telegram.ui.Cells.y1 y1Var8 = this.G;
                if (y1Var8 != null) {
                    y1Var8.setText(LocaleController.getString(R.string.UsernameInvalidLong));
                    org.telegram.ui.Cells.y1 y1Var9 = this.G;
                    int i15 = org.telegram.ui.ActionBar.h6.f19279p7;
                    y1Var9.setTag(Integer.valueOf(i15));
                    this.G.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i15, false));
                    pa paVar5 = this.F;
                    if (paVar5 != null) {
                        pa.a(paVar5);
                        return false;
                    }
                }
            } else {
                String str2 = f0().username;
                if (str2 == null) {
                    str2 = "";
                }
                if (str.equals(str2)) {
                    org.telegram.ui.Cells.y1 y1Var10 = this.G;
                    if (y1Var10 != null) {
                        y1Var10.setText(LocaleController.formatString("UsernameAvailable", R.string.UsernameAvailable, str));
                        org.telegram.ui.Cells.y1 y1Var11 = this.G;
                        int i16 = org.telegram.ui.ActionBar.h6.f19408w6;
                        y1Var11.setTag(Integer.valueOf(i16));
                        this.G.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i16, false));
                        pa paVar6 = this.F;
                        if (paVar6 != null) {
                            pa.a(paVar6);
                        }
                    }
                    return true;
                }
                org.telegram.ui.Cells.y1 y1Var12 = this.G;
                if (y1Var12 != null) {
                    y1Var12.setText(LocaleController.getString(R.string.UsernameChecking));
                    org.telegram.ui.Cells.y1 y1Var13 = this.G;
                    int i17 = org.telegram.ui.ActionBar.h6.F6;
                    y1Var13.setTag(Integer.valueOf(i17));
                    this.G.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i17, false));
                    pa paVar7 = this.F;
                    if (paVar7 != null) {
                        pa.a(paVar7);
                    }
                }
                this.f36833f = str;
                org.telegram.ui.ActionBar.a6 a6Var2 = new org.telegram.ui.ActionBar.a6(14, this, str);
                this.h = a6Var2;
                AndroidUtilities.runOnUIThread(a6Var2, 300L);
                return true;
            }
        } else {
            org.telegram.ui.Cells.y1 y1Var14 = this.G;
            if (y1Var14 != null) {
                y1Var14.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                org.telegram.ui.Cells.y1 y1Var15 = this.G;
                int i18 = org.telegram.ui.ActionBar.h6.f19279p7;
                y1Var15.setTag(Integer.valueOf(i18));
                this.G.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i18, false));
                pa paVar8 = this.F;
                if (paVar8 != null) {
                    pa.a(paVar8);
                }
            }
        }
        return false;
    }

    public final void e0(boolean z10) {
        ka kaVar = this.f36839y;
        if (kaVar != null) {
            if (!kaVar.f35010a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.f36839y.f35010a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.f36839y.f35010a.requestFocus();
            if (z10) {
                AndroidUtilities.showKeyboard(this.f36839y.f35010a);
            }
        }
    }

    public final TLRPC.User f0() {
        long j3 = this.f36838x;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i11 = this.currentAccount;
        if (i10 != 0) {
            return MessagesController.getInstance(i11).getUser(Long.valueOf(j3));
        }
        return UserConfig.getInstance(i11).getCurrentUser();
    }

    public final long g0() {
        long j3 = this.f36838x;
        if (j3 != 0) {
            return j3;
        }
        return UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f19059d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19392v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19356t8));
        return arrayList;
    }

    public final void h0() {
        if (this.f36831b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f36831b.getChildCount(); i10++) {
            View childAt = this.f36831b.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.m4) && i10 == 0) {
                AndroidUtilities.shakeViewSpring(((org.telegram.ui.Cells.m4) childAt).getTextView());
            } else if (childAt instanceof pa) {
                AndroidUtilities.shakeViewSpring(childAt);
            } else if (childAt instanceof ka) {
                ka kaVar = (ka) childAt;
                AndroidUtilities.shakeViewSpring(kaVar.f35010a);
                AndroidUtilities.shakeViewSpring(kaVar.f35011b);
            }
        }
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
    }

    public final void i0(int r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qa.i0(int, boolean, boolean):void");
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
