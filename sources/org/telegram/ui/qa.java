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
public final class qa extends org.telegram.ui.ActionBar.n2 {
    public static final Paint H = new Paint(1);
    public static final Paint I = new Paint(1);
    public static final Paint J = new Paint(1);
    public na E;
    public pa F;
    public org.telegram.ui.Cells.x1 G;
    public org.telegram.ui.ActionBar.v0 f39826a;
    public org.telegram.ui.Components.ll0 f39827b;
    public ha f39828c;
    public boolean d;
    public int f39829e;
    public String f39830f;
    public org.telegram.ui.ActionBar.c6 h;
    public boolean f39831n;
    public String f39832r;
    public final ArrayList f39833s;
    public final ArrayList v;
    public final ArrayList f39834w;
    public final long f39835x;
    public ka f39836y;

    public qa(Bundle bundle) {
        super(bundle);
        this.f39832r = "";
        this.f39833s = new ArrayList();
        this.v = new ArrayList();
        this.f39834w = new ArrayList();
        if (bundle != null) {
            this.f39835x = bundle.getLong("bot_id");
        }
    }

    public static void U(qa qaVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            b2Var.dismiss();
        } catch (Exception e7) {
            FileLog.e(e7);
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
        qaVar.f39829e = ConnectionsManager.getInstance(qaVar.currentAccount).sendRequest(checkusername, new aa(qaVar, str, checkusername, 0), 2);
    }

    public static void X(qa qaVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user) {
        try {
            b2Var.dismiss();
        } catch (Exception e7) {
            FileLog.e(e7);
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
        long j3 = qaVar.f39835x;
        ArrayList arrayList = qaVar.v;
        ArrayList arrayList2 = qaVar.f39833s;
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
        qaVar.getConnectionsManager().sendRequest(reorderusernames, new bi.c7(9));
        ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList);
        TLRPC.User user = MessagesController.getInstance(qaVar.currentAccount).getUser(Long.valueOf(qaVar.g0()));
        user.usernames = arrayList4;
        MessagesController.getInstance(qaVar.currentAccount).putUser(user, false, true);
    }

    public static void Z(qa qaVar) {
        if (qaVar.f39835x != 0) {
            qaVar.finishFragment();
            return;
        }
        if (qaVar.f39832r.startsWith("@")) {
            qaVar.f39832r = qaVar.f39832r.substring(1);
        }
        if (!qaVar.f39832r.isEmpty() && !qaVar.d0(qaVar.f39832r)) {
            qaVar.h0();
            return;
        }
        TLRPC.User f02 = qaVar.f0();
        if (qaVar.getParentActivity() != null && f02 != null) {
            String publicUsername = UserObject.getPublicUsername(f02);
            if (publicUsername == null) {
                publicUsername = "";
            }
            if (publicUsername.equals(qaVar.f39832r)) {
                qaVar.finishFragment();
                return;
            }
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(qaVar.getParentActivity(), 3, null);
            TL_account.updateUsername updateusername = new TL_account.updateUsername();
            updateusername.username = qaVar.f39832r;
            NotificationCenter.getInstance(qaVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            int sendRequest = ConnectionsManager.getInstance(qaVar.currentAccount).sendRequest(updateusername, new aa(qaVar, b2Var, updateusername, 1), 2);
            ConnectionsManager.getInstance(qaVar.currentAccount).bindRequestToGuid(sendRequest, qaVar.classGuid);
            b2Var.setOnCancelListener(new ba(qaVar, sendRequest, 0));
            b2Var.show();
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
        this.actionBar.setActionBarMenuOnItemClick(new ah.t(this, 28));
        this.f39826a = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(g0()));
        if (user == null) {
            user = f0();
        }
        if (user != null) {
            this.f39832r = null;
            if (user.usernames != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= user.usernames.size()) {
                        break;
                    }
                    TLRPC.TL_username tL_username = user.usernames.get(i10);
                    if (tL_username != null && tL_username.editable) {
                        this.f39832r = tL_username.username;
                        break;
                    }
                    i10++;
                }
            }
            if (this.f39832r == null && (str = user.username) != null) {
                this.f39832r = str;
            }
            if (this.f39832r == null) {
                this.f39832r = "";
            }
            this.f39833s.clear();
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
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.f39827b = ll0Var;
        ll0Var.o1();
        this.actionBar.setAdaptiveBackground(this.f39827b);
        this.fragmentView.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20634a7));
        this.f39827b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.ll0 ll0Var2 = this.f39827b;
        ha haVar = new ha(this);
        this.f39828c = haVar;
        ll0Var2.setAdapter(haVar);
        this.f39827b.setSelectorDrawableColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20780i6));
        new s4.y(new la(this)).d(this.f39827b);
        ((FrameLayout) this.fragmentView).addView(this.f39827b, w7.x5.c(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new ci.d(6));
        this.f39827b.setOnItemClickListener(new fa(this));
        AndroidUtilities.runOnUIThread(new lu0(this, 19), 40L);
        return this.fragmentView;
    }

    public final boolean d0(String str) {
        int i10;
        if (str != null && str.startsWith("@")) {
            str = str.substring(1);
        }
        org.telegram.ui.Cells.x1 x1Var = this.G;
        if (x1Var != null) {
            if (!TextUtils.isEmpty(str)) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            x1Var.setVisibility(i10);
            pa paVar = this.F;
            if (paVar != null) {
                pa.a(paVar);
            }
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.h;
        if (c6Var != null) {
            AndroidUtilities.cancelRunOnUIThread(c6Var);
            this.h = null;
            this.f39830f = null;
            if (this.f39829e != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f39829e, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i11 = 0; i11 < str.length(); i11++) {
                    char charAt = str.charAt(i11);
                    if (i11 == 0 && charAt >= '0' && charAt <= '9') {
                        org.telegram.ui.Cells.x1 x1Var2 = this.G;
                        if (x1Var2 != null) {
                            x1Var2.setText(LocaleController.getString(R.string.UsernameInvalidStartNumber));
                            org.telegram.ui.Cells.x1 x1Var3 = this.G;
                            int i12 = org.telegram.ui.ActionBar.j6.f20907p7;
                            x1Var3.setTag(Integer.valueOf(i12));
                            this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                            pa paVar2 = this.F;
                            if (paVar2 != null) {
                                pa.a(paVar2);
                                return false;
                            }
                        }
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        org.telegram.ui.Cells.x1 x1Var4 = this.G;
                        if (x1Var4 != null) {
                            x1Var4.setText(LocaleController.getString(R.string.UsernameInvalid));
                            org.telegram.ui.Cells.x1 x1Var5 = this.G;
                            int i13 = org.telegram.ui.ActionBar.j6.f20907p7;
                            x1Var5.setTag(Integer.valueOf(i13));
                            this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                            pa paVar3 = this.F;
                            if (paVar3 != null) {
                                pa.a(paVar3);
                                return false;
                            }
                        }
                    }
                }
            } else {
                org.telegram.ui.Cells.x1 x1Var6 = this.G;
                if (x1Var6 != null) {
                    x1Var6.setText(LocaleController.getString(R.string.UsernameInvalid));
                    org.telegram.ui.Cells.x1 x1Var7 = this.G;
                    int i14 = org.telegram.ui.ActionBar.j6.f20907p7;
                    x1Var7.setTag(Integer.valueOf(i14));
                    this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
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
                org.telegram.ui.Cells.x1 x1Var8 = this.G;
                if (x1Var8 != null) {
                    x1Var8.setText(LocaleController.getString(R.string.UsernameInvalidLong));
                    org.telegram.ui.Cells.x1 x1Var9 = this.G;
                    int i15 = org.telegram.ui.ActionBar.j6.f20907p7;
                    x1Var9.setTag(Integer.valueOf(i15));
                    this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
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
                    org.telegram.ui.Cells.x1 x1Var10 = this.G;
                    if (x1Var10 != null) {
                        x1Var10.setText(LocaleController.formatString("UsernameAvailable", R.string.UsernameAvailable, str));
                        org.telegram.ui.Cells.x1 x1Var11 = this.G;
                        int i16 = org.telegram.ui.ActionBar.j6.f21035w6;
                        x1Var11.setTag(Integer.valueOf(i16));
                        this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                        pa paVar6 = this.F;
                        if (paVar6 != null) {
                            pa.a(paVar6);
                        }
                    }
                    return true;
                }
                org.telegram.ui.Cells.x1 x1Var12 = this.G;
                if (x1Var12 != null) {
                    x1Var12.setText(LocaleController.getString(R.string.UsernameChecking));
                    org.telegram.ui.Cells.x1 x1Var13 = this.G;
                    int i17 = org.telegram.ui.ActionBar.j6.F6;
                    x1Var13.setTag(Integer.valueOf(i17));
                    this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
                    pa paVar7 = this.F;
                    if (paVar7 != null) {
                        pa.a(paVar7);
                    }
                }
                this.f39830f = str;
                org.telegram.ui.ActionBar.c6 c6Var2 = new org.telegram.ui.ActionBar.c6(15, this, str);
                this.h = c6Var2;
                AndroidUtilities.runOnUIThread(c6Var2, 300L);
                return true;
            }
        } else {
            org.telegram.ui.Cells.x1 x1Var14 = this.G;
            if (x1Var14 != null) {
                x1Var14.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                org.telegram.ui.Cells.x1 x1Var15 = this.G;
                int i18 = org.telegram.ui.ActionBar.j6.f20907p7;
                x1Var15.setTag(Integer.valueOf(i18));
                this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
                pa paVar8 = this.F;
                if (paVar8 != null) {
                    pa.a(paVar8);
                }
            }
        }
        return false;
    }

    public final void e0(boolean z10) {
        ka kaVar = this.f39836y;
        if (kaVar != null) {
            if (!kaVar.f38008a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.f39836y.f38008a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.f39836y.f38008a.requestFocus();
            if (z10) {
                AndroidUtilities.showKeyboard(this.f39836y.f38008a);
            }
        }
    }

    public final TLRPC.User f0() {
        long j3 = this.f39835x;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i11 = this.currentAccount;
        if (i10 != 0) {
            return MessagesController.getInstance(i11).getUser(Long.valueOf(j3));
        }
        return UserConfig.getInstance(i11).getCurrentUser();
    }

    public final long g0() {
        long j3 = this.f39835x;
        if (j3 != 0) {
            return j3;
        }
        return UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20690d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f21019v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20983t8));
        return arrayList;
    }

    public final void h0() {
        if (this.f39827b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f39827b.getChildCount(); i10++) {
            View childAt = this.f39827b.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.l4) && i10 == 0) {
                AndroidUtilities.shakeViewSpring(((org.telegram.ui.Cells.l4) childAt).getTextView());
            } else if (childAt instanceof pa) {
                AndroidUtilities.shakeViewSpring(childAt);
            } else if (childAt instanceof ka) {
                ka kaVar = (ka) childAt;
                AndroidUtilities.shakeViewSpring(kaVar.f38008a);
                AndroidUtilities.shakeViewSpring(kaVar.f38009b);
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
