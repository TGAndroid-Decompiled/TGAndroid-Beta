package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class na extends org.telegram.ui.ActionBar.n2 {
    public static final Paint D = new Paint(1);
    public static final Paint E = new Paint(1);
    public static final Paint F = new Paint(1);
    public ka A;
    public ma B;
    public org.telegram.ui.Cells.w1 C;

    public org.telegram.ui.ActionBar.v0 f40700a;

    public org.telegram.ui.Components.zk0 f40701b;

    public ea f40702c;
    public boolean d;

    public int f40703e;

    public String f40704f;
    public org.telegram.messenger.voip.l0 h;

    public boolean f40705n;

    public String f40706r;

    public final ArrayList f40707s;
    public final ArrayList v;

    public final ArrayList f40708w;

    public final long f40709x;

    public ha f40710y;

    public na(Bundle bundle) {
        super(bundle);
        this.f40706r = "";
        this.f40707s = new ArrayList();
        this.v = new ArrayList();
        this.f40708w = new ArrayList();
        if (bundle != null) {
            this.f40709x = bundle.getLong("bot_id");
        }
    }

    public static void U(na naVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            b2Var.dismiss();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        org.telegram.ui.Components.y4.f0(naVar.currentAccount, tL_error, naVar, updateusername, new Object[0]);
        naVar.h0();
    }

    public static void W(na naVar, String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        naVar.f40703e = ConnectionsManager.getInstance(naVar.currentAccount).sendRequest(checkusername, new z9(naVar, str, checkusername, 0), 2);
    }

    public static void X(na naVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user) {
        try {
            b2Var.dismiss();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        arrayList.add(user);
        MessagesController.getInstance(naVar.currentAccount).putUsers(arrayList, false);
        MessagesStorage.getInstance(naVar.currentAccount).putUsersAndChats(arrayList, null, false, true);
        UserConfig.getInstance(naVar.currentAccount).saveConfig(true);
        naVar.finishFragment();
    }

    public static void Y(na naVar) {
        TLObject tLObject;
        long j10 = naVar.f40709x;
        ArrayList arrayList = naVar.v;
        ArrayList arrayList2 = naVar.f40707s;
        if (naVar.d) {
            naVar.d = false;
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
                TL_account.reorderUsernames reorderusernames = new TL_account.reorderUsernames();
                reorderusernames.order = arrayList3;
                tLObject = reorderusernames;
            } else {
                TL_bots.reorderUsernames reorderusernames2 = new TL_bots.reorderUsernames();
                reorderusernames2.bot = MessagesController.getInstance(naVar.currentAccount).getInputUser(j10);
                reorderusernames2.order = arrayList3;
                tLObject = reorderusernames2;
            }
            naVar.getConnectionsManager().sendRequest(tLObject, new jh.m5(6));
            ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
            arrayList4.addAll(arrayList2);
            arrayList4.addAll(arrayList);
            TLRPC.User user = MessagesController.getInstance(naVar.currentAccount).getUser(Long.valueOf(naVar.g0()));
            user.usernames = arrayList4;
            MessagesController.getInstance(naVar.currentAccount).putUser(user, false, true);
        }
    }

    public static void Z(na naVar) {
        if (naVar.f40709x != 0) {
            naVar.finishFragment();
            return;
        }
        int i10 = 1;
        if (naVar.f40706r.startsWith("@")) {
            naVar.f40706r = naVar.f40706r.substring(1);
        }
        if (!naVar.f40706r.isEmpty() && !naVar.d0(naVar.f40706r)) {
            naVar.h0();
            return;
        }
        TLRPC.User userF0 = naVar.f0();
        if (naVar.getParentActivity() == null || userF0 == null) {
            return;
        }
        String publicUsername = UserObject.getPublicUsername(userF0);
        if (publicUsername == null) {
            publicUsername = "";
        }
        if (publicUsername.equals(naVar.f40706r)) {
            naVar.finishFragment();
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(naVar.getParentActivity(), 3, null);
        TL_account.updateUsername updateusername = new TL_account.updateUsername();
        updateusername.username = naVar.f40706r;
        NotificationCenter.getInstance(naVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        int iSendRequest = ConnectionsManager.getInstance(naVar.currentAccount).sendRequest(updateusername, new z9(naVar, b2Var, updateusername, i10), 2);
        ConnectionsManager.getInstance(naVar.currentAccount).bindRequestToGuid(iSendRequest, naVar.classGuid);
        b2Var.setOnCancelListener(new hh.x(naVar, iSendRequest, i10));
        b2Var.show();
    }

    @Override
    public final View createView(Context context) {
        String str;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Username));
        this.actionBar.setActionBarMenuOnItemClick(new ag.e2(this, 23));
        this.f40700a = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(g0()));
        if (user == null) {
            user = f0();
        }
        if (user != null) {
            this.f40706r = null;
            if (user.usernames != null) {
                for (int i10 = 0; i10 < user.usernames.size(); i10++) {
                    TLRPC.TL_username tL_username = user.usernames.get(i10);
                    if (tL_username != null && tL_username.editable) {
                        this.f40706r = tL_username.username;
                        break;
                    }
                }
            }
            if (this.f40706r == null && (str = user.username) != null) {
                this.f40706r = str;
            }
            if (this.f40706r == null) {
                this.f40706r = "";
            }
            this.f40707s.clear();
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
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.f40701b = zk0Var;
        zk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f40701b);
        this.fragmentView.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f22999a7));
        this.f40701b.setLayoutManager(new f2.k0());
        org.telegram.ui.Components.zk0 zk0Var2 = this.f40701b;
        ea eaVar = new ea(this);
        this.f40702c = eaVar;
        zk0Var2.setAdapter(eaVar);
        this.f40701b.setSelectorDrawableColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23144i6));
        new f2.f0(new ia(this)).d(this.f40701b);
        ((FrameLayout) this.fragmentView).addView(this.f40701b, h7.z5.c(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new kh.e(6));
        this.f40701b.setOnItemClickListener(new ca(this));
        AndroidUtilities.runOnUIThread(new lt0(this, 19), 40L);
        return this.fragmentView;
    }

    public final boolean d0(String str) {
        org.telegram.ui.Cells.w1 w1Var;
        ma maVar;
        if (str != null && str.startsWith("@")) {
            str = str.substring(1);
        }
        org.telegram.ui.Cells.w1 w1Var2 = this.C;
        if (w1Var2 != null) {
            w1Var2.setVisibility(!TextUtils.isEmpty(str) ? 0 : 8);
            ma maVar2 = this.B;
            if (maVar2 != null) {
                ma.a(maVar2);
            }
        }
        org.telegram.messenger.voip.l0 l0Var = this.h;
        if (l0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(l0Var);
            this.h = null;
            this.f40704f = null;
            if (this.f40703e != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f40703e, true);
            }
        }
        if (str == null) {
            if (str != null || str.length() < 4) {
                w1Var = this.C;
                if (w1Var != null) {
                    w1Var.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                    org.telegram.ui.Cells.w1 w1Var3 = this.C;
                    int i10 = org.telegram.ui.ActionBar.g6.f23269p7;
                    w1Var3.setTag(Integer.valueOf(i10));
                    this.C.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
                    maVar = this.B;
                    if (maVar != null) {
                        ma.a(maVar);
                    }
                }
            } else {
                if (str.length() <= 32) {
                    String str2 = f0().username;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (str.equals(str2)) {
                        org.telegram.ui.Cells.w1 w1Var4 = this.C;
                        if (w1Var4 != null) {
                            w1Var4.setText(LocaleController.formatString("UsernameAvailable", R.string.UsernameAvailable, str));
                            org.telegram.ui.Cells.w1 w1Var5 = this.C;
                            int i11 = org.telegram.ui.ActionBar.g6.f23391w6;
                            w1Var5.setTag(Integer.valueOf(i11));
                            this.C.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                            ma maVar3 = this.B;
                            if (maVar3 != null) {
                                ma.a(maVar3);
                            }
                        }
                        return true;
                    }
                    org.telegram.ui.Cells.w1 w1Var6 = this.C;
                    if (w1Var6 != null) {
                        w1Var6.setText(LocaleController.getString(R.string.UsernameChecking));
                        org.telegram.ui.Cells.w1 w1Var7 = this.C;
                        int i12 = org.telegram.ui.ActionBar.g6.F6;
                        w1Var7.setTag(Integer.valueOf(i12));
                        this.C.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                        ma maVar4 = this.B;
                        if (maVar4 != null) {
                            ma.a(maVar4);
                        }
                    }
                    this.f40704f = str;
                    org.telegram.messenger.voip.l0 l0Var2 = new org.telegram.messenger.voip.l0(21, this, str);
                    this.h = l0Var2;
                    AndroidUtilities.runOnUIThread(l0Var2, 300L);
                    return true;
                }
                org.telegram.ui.Cells.w1 w1Var8 = this.C;
                if (w1Var8 != null) {
                    w1Var8.setText(LocaleController.getString(R.string.UsernameInvalidLong));
                    org.telegram.ui.Cells.w1 w1Var9 = this.C;
                    int i13 = org.telegram.ui.ActionBar.g6.f23269p7;
                    w1Var9.setTag(Integer.valueOf(i13));
                    this.C.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
                    ma maVar5 = this.B;
                    if (maVar5 != null) {
                        ma.a(maVar5);
                        return false;
                    }
                }
            }
        } else if (str.startsWith("_") || str.endsWith("_")) {
            org.telegram.ui.Cells.w1 w1Var10 = this.C;
            if (w1Var10 != null) {
                w1Var10.setText(LocaleController.getString(R.string.UsernameInvalid));
                org.telegram.ui.Cells.w1 w1Var11 = this.C;
                int i14 = org.telegram.ui.ActionBar.g6.f23269p7;
                w1Var11.setTag(Integer.valueOf(i14));
                this.C.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
                ma maVar6 = this.B;
                if (maVar6 != null) {
                    ma.a(maVar6);
                    return false;
                }
            }
        } else {
            for (int i15 = 0; i15 < str.length(); i15++) {
                char cCharAt = str.charAt(i15);
                if (i15 == 0 && cCharAt >= '0' && cCharAt <= '9') {
                    org.telegram.ui.Cells.w1 w1Var12 = this.C;
                    if (w1Var12 != null) {
                        w1Var12.setText(LocaleController.getString(R.string.UsernameInvalidStartNumber));
                        org.telegram.ui.Cells.w1 w1Var13 = this.C;
                        int i16 = org.telegram.ui.ActionBar.g6.f23269p7;
                        w1Var13.setTag(Integer.valueOf(i16));
                        this.C.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
                        ma maVar7 = this.B;
                        if (maVar7 != null) {
                            ma.a(maVar7);
                            return false;
                        }
                    }
                } else if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && cCharAt != '_'))) {
                    org.telegram.ui.Cells.w1 w1Var14 = this.C;
                    if (w1Var14 != null) {
                        w1Var14.setText(LocaleController.getString(R.string.UsernameInvalid));
                        org.telegram.ui.Cells.w1 w1Var15 = this.C;
                        int i17 = org.telegram.ui.ActionBar.g6.f23269p7;
                        w1Var15.setTag(Integer.valueOf(i17));
                        this.C.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
                        ma maVar8 = this.B;
                        if (maVar8 != null) {
                            ma.a(maVar8);
                            return false;
                        }
                    }
                }
            }
            if (str != null) {
                w1Var = this.C;
                if (w1Var != null) {
                    w1Var.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                    org.telegram.ui.Cells.w1 w1Var16 = this.C;
                    int i18 = org.telegram.ui.ActionBar.g6.f23269p7;
                    w1Var16.setTag(Integer.valueOf(i18));
                    this.C.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i18, false));
                    maVar = this.B;
                    if (maVar != null) {
                        ma.a(maVar);
                    }
                }
            } else {
                w1Var = this.C;
                if (w1Var != null) {
                    w1Var.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                    org.telegram.ui.Cells.w1 w1Var17 = this.C;
                    int i19 = org.telegram.ui.ActionBar.g6.f23269p7;
                    w1Var17.setTag(Integer.valueOf(i19));
                    this.C.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i19, false));
                    maVar = this.B;
                    if (maVar != null) {
                        ma.a(maVar);
                    }
                }
            }
        }
        return false;
    }

    public final void e0(boolean z10) {
        ha haVar = this.f40710y;
        if (haVar != null) {
            if (!haVar.f38761a.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.f40710y.f38761a;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.f40710y.f38761a.requestFocus();
            if (z10) {
                AndroidUtilities.showKeyboard(this.f40710y.f38761a);
            }
        }
    }

    public final TLRPC.User f0() {
        long j10 = this.f40709x;
        int i10 = this.currentAccount;
        return j10 != 0 ? MessagesController.getInstance(i10).getUser(Long.valueOf(j10)) : UserConfig.getInstance(i10).getCurrentUser();
    }

    public final long g0() {
        long j10 = this.f40709x;
        return j10 != 0 ? j10 : UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        return arrayList;
    }

    public final void h0() {
        if (this.f40701b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f40701b.getChildCount(); i10++) {
            View childAt = this.f40701b.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.j4) && i10 == 0) {
                AndroidUtilities.shakeViewSpring(((org.telegram.ui.Cells.j4) childAt).getTextView());
            } else if (childAt instanceof ma) {
                AndroidUtilities.shakeViewSpring(childAt);
            } else if (childAt instanceof ha) {
                ha haVar = (ha) childAt;
                AndroidUtilities.shakeViewSpring(haVar.f38761a);
                AndroidUtilities.shakeViewSpring(haVar.f38762b);
            }
        }
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
    }

    public final void i0(int i10, boolean z10, boolean z11) {
        TLRPC.TL_username tL_username;
        int iMin;
        int i11 = i10 - 4;
        if (i11 >= 0) {
            ArrayList arrayList = this.v;
            if (i11 < arrayList.size() && (tL_username = (TLRPC.TL_username) arrayList.get(i11)) != null) {
                tL_username.active = z10;
                int i12 = -1;
                if (z10) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= arrayList.size()) {
                            i13 = -1;
                            break;
                        } else if (!((TLRPC.TL_username) arrayList.get(i13)).active) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    if (i13 >= 0) {
                        iMin = Math.max(0, i13 - 1);
                        i12 = iMin + 4;
                    }
                } else {
                    int i14 = -1;
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        if (((TLRPC.TL_username) arrayList.get(i15)).active) {
                            i14 = i15;
                        }
                    }
                    if (i14 >= 0) {
                        iMin = Math.min(arrayList.size() - 1, i14 + 1);
                        i12 = iMin + 4;
                    }
                }
                if (this.f40701b != null) {
                    for (int i16 = 0; i16 < this.f40701b.getChildCount(); i16++) {
                        View childAt = this.f40701b.getChildAt(i16);
                        this.f40701b.getClass();
                        if (RecyclerView.R(childAt) == i10) {
                            if (z11) {
                                AndroidUtilities.shakeView(childAt);
                            }
                            if (!(childAt instanceof ka)) {
                                break;
                            }
                            ka kaVar = (ka) childAt;
                            kaVar.setLoading(this.f40708w.contains(tL_username.username));
                            TLRPC.TL_username tL_username2 = kaVar.v;
                            if (tL_username2 == null) {
                                break;
                            }
                            kaVar.a(tL_username2, kaVar.f39677w, true, kaVar.f39678x);
                            break;
                        }
                    }
                }
                if (i12 < 0 || i10 == i12) {
                    return;
                }
                ea eaVar = this.f40702c;
                int i17 = i12 - 4;
                ArrayList arrayList2 = eaVar.f37689c.v;
                if (i11 >= arrayList2.size() || i17 >= arrayList2.size()) {
                    return;
                }
                arrayList2.add(i17, (TLRPC.TL_username) arrayList2.remove(i11));
                eaVar.p(i10, i12);
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    eaVar.m(i18 + 4);
                }
            }
        }
    }

    public final void j0(TLRPC.TL_username tL_username, boolean z10, boolean z11) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (arrayList.get(i10) == tL_username) {
                i0(i10 + 4, z10, z11);
                return;
            }
            i10++;
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            return;
        }
        e0(false);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            e0(false);
        }
    }
}
