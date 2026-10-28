package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
public final class cp extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout E;
    public LinearLayout F;
    public org.telegram.ui.Components.s90 G;
    public org.telegram.ui.Cells.v8 H;
    public org.telegram.ui.Cells.i9 I;
    public org.telegram.ui.Cells.f7 J;
    public bp K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public qa O;
    public ArrayList P;
    public LinearLayout Q;
    public org.telegram.ui.Cells.q4 R;
    public org.telegram.ui.Cells.a9 S;
    public org.telegram.ui.Cells.i9 T;
    public yo U;
    public boolean V;
    public boolean W;
    public TLRPC.Chat X;
    public TLRPC.ChatFull Y;
    public long Z;
    public uo f38401a;
    public boolean f38402a0;
    public fi.c2 f38403b;
    public boolean f38404b0;
    public EditTextBoldCursor f38405c;
    public boolean f38406c0;
    public org.telegram.ui.Cells.i9 d;
    public boolean f38407d0;
    public org.telegram.ui.Cells.q4 e;
    public org.telegram.ui.Cells.f7 f38408e0;
    public org.telegram.ui.Cells.q4 f38409f;
    public ArrayList f38410f0;
    public org.telegram.ui.Cells.w4 f38411g0;
    public wo h;
    public int f38412h0;
    public String f38413i0;
    public ed f38414j0;
    public boolean f38415k0;
    public TLRPC.TL_chatInviteExported f38416l0;
    public boolean m0;
    public org.telegram.ui.Components.gp0 f38417n;
    public boolean f38418n0;
    public HashMap f38419o0;
    public org.telegram.ui.Components.o70 f38420p0;
    public ro f38421q0;
    public org.telegram.ui.ActionBar.u5 f38422r;
    public Boolean f38423r0;
    public LinearLayout f38424s;
    public boolean f38425s0;
    public org.telegram.ui.Cells.n6 v;
    public org.telegram.ui.Cells.n6 f38426w;
    public LinearLayout f38427x;
    public LinearLayout f38428y;

    public static org.telegram.ui.ActionBar.u6 V(cp cpVar) {
        return cpVar.resourceProvider;
    }

    public final void X() {
        boolean z10;
        org.telegram.ui.ActionBar.u5 u5Var = this.f38422r;
        if (!this.V && this.f38403b.length() <= 0) {
            ArrayList arrayList = this.N;
            z10 = false;
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            u5Var.a(z10, true);
        }
        z10 = true;
        u5Var.a(z10, true);
    }

    public final boolean Y(String str) {
        if (str != null && str.length() > 0) {
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(8);
        }
        ed edVar = this.f38414j0;
        if (edVar != null) {
            AndroidUtilities.cancelRunOnUIThread(edVar);
            this.f38414j0 = null;
            this.f38413i0 = null;
            if (this.f38412h0 != 0) {
                getConnectionsManager().cancelRequest(this.f38412h0, true);
            }
        }
        this.f38415k0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (this.f38402a0) {
                            this.h.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                        } else {
                            this.h.setText(LocaleController.getString(R.string.LinkInvalidStartNumberMega));
                        }
                        this.h.setTextColorByKey(org.telegram.ui.ActionBar.y6.f23582p7);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.h.setText(LocaleController.getString(R.string.LinkInvalid));
                        this.h.setTextColorByKey(org.telegram.ui.ActionBar.y6.f23582p7);
                        return false;
                    }
                }
            } else {
                this.h.setText(LocaleController.getString(R.string.LinkInvalid));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.y6.f23582p7);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.h.setText(LocaleController.getString(R.string.LinkInvalidLong));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.y6.f23582p7);
                return false;
            }
            this.h.setText(LocaleController.getString(R.string.LinkChecking));
            this.h.setTextColorByKey(org.telegram.ui.ActionBar.y6.F6);
            this.f38413i0 = str;
            ed edVar2 = new ed(23, this, str);
            this.f38414j0 = edVar2;
            AndroidUtilities.runOnUIThread(edVar2, 300L);
            return true;
        }
        if (this.f38402a0) {
            this.h.setText(LocaleController.getString(R.string.LinkInvalidShort));
        } else {
            this.h.setText(LocaleController.getString(R.string.LinkInvalidShortMega));
        }
        this.h.setTextColorByKey(org.telegram.ui.ActionBar.y6.f23582p7);
        return false;
    }

    public final void Z(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.Z);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new fi.m3(6, this, z10)), this.classGuid);
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cp.a0():void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23521m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23749y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23768z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23430h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23319b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23712w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23657t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
    }

    public final void b0() {
        if (getParentActivity() == null) {
            return;
        }
        tg.j0 j0Var = new tg.j0(2, this.currentAccount, getParentActivity(), this, null);
        j0Var.f48939v0 = this.f38402a0;
        j0Var.H0 = new ro(this, 0);
        showDialog(j0Var);
    }

    public final void c0(boolean z10) {
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.f38421q0);
        }
        org.telegram.ui.ActionBar.u5 u5Var = this.f38422r;
        if (u5Var != null) {
            u5Var.b(z10);
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new ga(this, 4));
        this.f38422r = this.simpleActionBar.i(LocaleController.getString(R.string.Save));
        this.f38417n = new org.telegram.ui.Components.gp0(context);
        this.f38401a = new uo(this, context, this.f38417n, this.resourceProvider);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(this.f38401a, org.telegram.ui.Components.kb1.k());
        this.fragmentView = frameLayout;
        this.f38401a.setFillViewport(true);
        this.f38401a.setDrawBackground(true);
        this.f38401a.setOverScrollMode(0);
        this.f38401a.addView(this.f38417n, new FrameLayout.LayoutParams(-1, -2));
        this.f38417n.setOrientation(1);
        boolean z12 = this.f38418n0;
        if (z12) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.TypeLocationGroup));
        } else if (this.f38402a0) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.ChannelSettingsTitle));
        } else {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.GroupSettingsTitle));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f38424s = linearLayout;
        linearLayout.setOrientation(1);
        this.f38417n.addView(this.f38424s, org.telegram.ui.Components.kb1.r(-1, -2));
        org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context, 23);
        this.f38409f = q4Var;
        q4Var.setHeight(46);
        if (this.f38402a0) {
            this.f38409f.setText(LocaleController.getString(R.string.ChannelTypeHeader));
        } else {
            this.f38409f.setText(LocaleController.getString(R.string.GroupTypeHeader));
        }
        this.f38424s.addView(this.f38409f);
        org.telegram.ui.Cells.n6 n6Var = new org.telegram.ui.Cells.n6(context, false);
        this.f38426w = n6Var;
        if (this.f38402a0) {
            n6Var.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, this.V);
        } else {
            n6Var.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, this.V);
        }
        this.f38424s.addView(this.f38426w, org.telegram.ui.Components.kb1.r(-1, -2));
        this.f38426w.setOnClickListener(new to(this, 1));
        org.telegram.ui.Cells.n6 n6Var2 = new org.telegram.ui.Cells.n6(context, false);
        this.v = n6Var2;
        if (this.f38402a0) {
            n6Var2.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !this.V);
        } else {
            n6Var2.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !this.V);
        }
        this.f38424s.addView(this.v, org.telegram.ui.Components.kb1.r(-1, -2));
        this.v.setOnClickListener(new to(this, 2));
        org.telegram.ui.Cells.f7 f7Var = new org.telegram.ui.Cells.f7(context, (d3) null);
        this.J = f7Var;
        this.f38417n.addView(f7Var, org.telegram.ui.Components.kb1.r(-1, -2));
        if (z12) {
            this.f38426w.setVisibility(8);
            this.v.setVisibility(8);
            this.J.setVisibility(8);
            this.f38409f.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f38428y = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f38417n.addView(this.f38428y, org.telegram.ui.Components.kb1.r(-1, -2));
        org.telegram.ui.Cells.q4 q4Var2 = new org.telegram.ui.Cells.q4(context, 23);
        this.e = q4Var2;
        this.f38428y.addView(q4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setOrientation(0);
        this.f38428y.addView(this.E, org.telegram.ui.Components.kb1.o(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f38405c = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().linkPrefix + "/");
        this.f38405c.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f38405c;
        int i13 = org.telegram.ui.ActionBar.y6.H6;
        org.telegram.ui.ActionBar.f7.E(editTextBoldCursor2, i13, null);
        EditTextBoldCursor editTextBoldCursor3 = this.f38405c;
        int i14 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(editTextBoldCursor3, i14, null);
        this.f38405c.setMaxLines(1);
        this.f38405c.setLines(1);
        this.f38405c.setEnabled(false);
        this.f38405c.setBackground(null);
        this.f38405c.setPadding(0, 0, 0, 0);
        this.f38405c.setSingleLine(true);
        this.f38405c.setInputType(163840);
        this.f38405c.setImeOptions(6);
        this.E.addView(this.f38405c, org.telegram.ui.Components.kb1.r(-2, 36));
        fi.c2 c2Var = new fi.c2(this, context, 4);
        this.f38403b = c2Var;
        c2Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.f7.E(this.f38403b, i13, null);
        org.telegram.ui.ActionBar.f7.V(this.f38403b, i14, null);
        this.f38403b.setMaxLines(1);
        this.f38403b.setLines(1);
        this.f38403b.setBackground(null);
        this.f38403b.setPadding(0, 0, 0, 0);
        this.f38403b.setSingleLine(true);
        this.f38403b.setInputType(163872);
        this.f38403b.setImeOptions(6);
        this.f38403b.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
        org.telegram.ui.ActionBar.f7.w(this.f38403b, i14, null);
        this.f38403b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f38403b.setCursorWidth(1.5f);
        this.E.addView(this.f38403b, org.telegram.ui.Components.kb1.r(-1, 36));
        this.f38403b.addTextChangedListener(new m0(this, 3));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.F = linearLayout4;
        linearLayout4.setOrientation(1);
        this.f38428y.addView(this.F, org.telegram.ui.Components.kb1.r(-1, -2));
        org.telegram.ui.Components.s90 s90Var = new org.telegram.ui.Components.s90(context, this, null, true, ChatObject.isChannel(this.X));
        this.G = s90Var;
        s90Var.setDelegate(new vo(this, context));
        this.G.d(0, null, false);
        this.F.addView(this.G);
        wo woVar = new wo(this, context, this.resourceProvider);
        this.h = woVar;
        woVar.setBottomPadding(6);
        this.f38417n.addView(this.h, org.telegram.ui.Components.kb1.r(-2, -2));
        org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context, 12, this.resourceProvider);
        this.d = i9Var;
        i9Var.setImportantForAccessibility(1);
        this.f38417n.addView(this.d, org.telegram.ui.Components.kb1.r(-1, -2));
        org.telegram.ui.Cells.w4 w4Var = new org.telegram.ui.Cells.w4(context);
        this.f38411g0 = w4Var;
        this.f38417n.addView(w4Var, org.telegram.ui.Components.kb1.r(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.f38427x = linearLayout5;
        linearLayout5.setOrientation(1);
        this.f38417n.addView(this.f38427x, org.telegram.ui.Components.kb1.r(-1, -2));
        org.telegram.ui.Cells.f7 f7Var2 = new org.telegram.ui.Cells.f7(context, (d3) null);
        this.f38408e0 = f7Var2;
        this.f38417n.addView(f7Var2, org.telegram.ui.Components.kb1.r(-1, -2));
        org.telegram.ui.Components.gp0 gp0Var = this.f38417n;
        bp bpVar = new bp(this, context);
        this.K = bpVar;
        gp0Var.addView(bpVar, org.telegram.ui.Components.kb1.r(-1, -2));
        bp bpVar2 = this.K;
        if (!this.V && !this.N.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        bpVar2.setVisibility(i10);
        org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(context);
        this.H = v8Var;
        v8Var.o(R.drawable.msg_link2, LocaleController.getString(R.string.ManageInviteLinks), false);
        this.H.setOnClickListener(new to(this, 3));
        this.f38417n.addView(this.H, org.telegram.ui.Components.kb1.r(-1, -2));
        org.telegram.ui.Cells.i9 i9Var2 = new org.telegram.ui.Cells.i9(context, 12, this.resourceProvider);
        this.I = i9Var2;
        this.f38417n.addView(i9Var2, org.telegram.ui.Components.kb1.r(-1, -2));
        yo yoVar = new yo(this, context, this.X, context);
        this.U = yoVar;
        TLRPC.ChatFull chatFull = this.Y;
        if (chatFull != null && chatFull.linked_chat_id != 0 && !this.f38402a0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yoVar.c(z10);
        yo yoVar2 = this.U;
        TLRPC.ChatFull chatFull2 = this.Y;
        org.telegram.ui.Cells.i9 i9Var3 = yoVar2.e;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(yoVar2.f28919n);
        boolean isPublic = ChatObject.isPublic(yoVar2.f28919n);
        if (chatFull2 != null && chatFull2.guard_bot_id != 0) {
            StringBuilder sb2 = new StringBuilder("@");
            z11 = false;
            sb2.append(DialogObject.getPublicUsername(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(chatFull2.guard_bot_id))));
            String sb3 = sb2.toString();
            if (isChannelAndNotMegaGroup) {
                i12 = R.string.ChannelSettingsJoinRequestInfoManagedBy;
            } else if (isPublic) {
                i12 = R.string.GroupPublicSettingsJoinRequestInfoManagedBy;
            } else {
                i12 = R.string.GroupPrivateSettingsJoinRequestInfoManagedBy;
            }
            i9Var3.setText(AndroidUtilities.replaceSingleLinkKey(LocaleController.formatString(i12, sb3), org.telegram.ui.ActionBar.y6.il, null, new org.telegram.ui.Components.so(29, chatFull2, this)));
        } else {
            z11 = false;
            if (isChannelAndNotMegaGroup) {
                i11 = R.string.ChannelSettingsJoinRequestInfo2;
            } else if (isPublic) {
                i11 = R.string.GroupPublicSettingsJoinRequestInfo2;
            } else {
                i11 = R.string.GroupPrivateSettingsJoinRequestInfo2;
            }
            i9Var3.setText(LocaleController.getString(i11));
        }
        this.f38417n.addView(this.U);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.Q = linearLayout6;
        linearLayout6.setOrientation(1);
        this.f38417n.addView(this.Q);
        org.telegram.ui.Cells.q4 q4Var3 = new org.telegram.ui.Cells.q4(context, 23);
        this.R = q4Var3;
        q4Var3.setHeight(46);
        this.R.setText(LocaleController.getString(R.string.SavingContentTitle));
        this.Q.addView(this.R, org.telegram.ui.Components.kb1.r(-1, -2));
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
        this.S = a9Var;
        a9Var.f(LocaleController.getString(R.string.RestrictSavingContent), this.f38404b0, z11);
        this.S.setOnClickListener(new to(this, 4));
        this.Q.addView(this.S, org.telegram.ui.Components.kb1.r(-1, -2));
        this.T = new org.telegram.ui.Cells.i9(context, 12, this.resourceProvider);
        if (this.f38402a0 && !ChatObject.isMegagroup(this.X)) {
            this.T.setText(LocaleController.getString(R.string.RestrictSavingContentInfoChannel));
        } else {
            this.T.setText(LocaleController.getString(R.string.RestrictSavingContentInfoGroup));
        }
        this.Q.addView(this.T, org.telegram.ui.Components.kb1.r(-1, -2));
        String publicUsername = ChatObject.getPublicUsername(this.X, true);
        if (!this.V && publicUsername != null) {
            this.m0 = true;
            this.f38403b.setText(publicUsername);
            this.f38403b.setSelection(publicUsername.length());
            this.m0 = false;
        }
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        int i10;
        int i11;
        int i12;
        int i13;
        int dp;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (this.J == null) {
            return;
        }
        String str = null;
        int i19 = 8;
        if (!this.V && !this.f38406c0 && getUserConfig().isPremium()) {
            this.d.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.i9 i9Var = this.d;
            int i20 = org.telegram.ui.ActionBar.y6.f23582p7;
            i9Var.setTag(Integer.valueOf(i20));
            org.telegram.ui.ActionBar.f7.V(this.d.getTextView(), i20, null);
            this.f38428y.setVisibility(8);
            this.h.setVisibility(8);
            this.J.setVisibility(8);
            this.f38408e0.setVisibility(0);
            if (this.f38407d0) {
                this.f38411g0.setVisibility(0);
                this.f38427x.setVisibility(8);
            } else {
                this.f38411g0.setVisibility(8);
                this.f38427x.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.i9 i9Var2 = this.d;
            int i21 = org.telegram.ui.ActionBar.y6.B6;
            i9Var2.setTag(Integer.valueOf(i21));
            org.telegram.ui.ActionBar.f7.V(this.d.getTextView(), i21, null);
            if (this.f38418n0) {
                this.J.setVisibility(8);
            } else {
                this.J.setVisibility(0);
            }
            this.f38408e0.setVisibility(8);
            this.f38427x.setVisibility(8);
            this.f38428y.setVisibility(0);
            this.f38411g0.setVisibility(8);
            if (this.f38402a0) {
                org.telegram.ui.Cells.i9 i9Var3 = this.d;
                if (this.V) {
                    i16 = R.string.ChannelPrivateLinkHelp;
                } else {
                    i16 = R.string.ChannelUsernameHelp;
                }
                i9Var3.setText(LocaleController.getString(i16));
                org.telegram.ui.Cells.q4 q4Var = this.e;
                if (this.V) {
                    i17 = R.string.ChannelInviteLinkTitle;
                } else {
                    i17 = R.string.ChannelLinkTitle;
                }
                q4Var.setText(LocaleController.getString(i17));
            } else {
                org.telegram.ui.Cells.i9 i9Var4 = this.d;
                if (this.V) {
                    i10 = R.string.MegaPrivateLinkHelp;
                } else {
                    i10 = R.string.MegaUsernameHelp;
                }
                i9Var4.setText(LocaleController.getString(i10));
                org.telegram.ui.Cells.q4 q4Var2 = this.e;
                if (this.V) {
                    i11 = R.string.ChannelInviteLinkTitle;
                } else {
                    i11 = R.string.ChannelLinkTitle;
                }
                q4Var2.setText(LocaleController.getString(i11));
            }
            LinearLayout linearLayout = this.E;
            if (this.V) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            linearLayout.setVisibility(i12);
            LinearLayout linearLayout2 = this.F;
            if (this.V) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            linearLayout2.setVisibility(i13);
            this.Q.setVisibility(0);
            this.H.setVisibility(0);
            this.I.setVisibility(0);
            LinearLayout linearLayout3 = this.f38428y;
            if (this.V) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.s90 s90Var = this.G;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f38416l0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            s90Var.setLink(str);
            this.G.c(this.f38416l0, this.Z);
            wo woVar = this.h;
            if (!this.V && woVar.f24255a.length() != 0) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            woVar.setVisibility(i14);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.Z);
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.Z));
            org.telegram.ui.Cells.i9 i9Var5 = this.I;
            if (chatFull != null && chatFull.paid_media_allowed && ChatObject.isChannelAndNotMegaGroup(chat)) {
                i15 = R.string.ManageLinksInfoHelpPaid;
            } else {
                i15 = R.string.ManageLinksInfoHelp;
            }
            i9Var5.setText(LocaleController.getString(i15));
        }
        boolean z10 = true;
        this.v.a(!this.V);
        this.f38426w.a(this.V);
        this.f38403b.clearFocus();
        yo yoVar = this.U;
        if (yoVar != null) {
            if (this.f38402a0 && !this.V) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            yoVar.setVisibility(i18);
            yo yoVar2 = this.U;
            TLRPC.ChatFull chatFull2 = this.Y;
            if (chatFull2 == null || chatFull2.linked_chat_id == 0 || this.f38402a0) {
                z10 = false;
            }
            yoVar2.c(z10);
        }
        bp bpVar = this.K;
        if (bpVar != null) {
            if (!this.V && !this.N.isEmpty()) {
                i19 = 0;
            }
            bpVar.setVisibility(i19);
        }
        X();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f22029id == this.Z) {
                this.Y = chatFull;
                this.f38416l0 = chatFull.exported_invite;
                d0();
            }
        } else if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.Z) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
                if (j5Var != null && j5Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.hp0 getScrollViewForSimpleGlass() {
        return this.f38401a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.y6.f23449i6;
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 4, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23582p7));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        LinearLayout linearLayout = this.f38424s;
        int i11 = org.telegram.ui.ActionBar.y6.f23357d6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f38428y, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.S, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.S, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.S, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f38427x, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f38411g0, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23429h6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f38426w, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.H, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        fi.c2 c2Var;
        super.onBecomeFullyVisible();
        if (this.f38418n0 && (c2Var = this.f38403b) != null) {
            c2Var.requestFocus();
            AndroidUtilities.showKeyboard(this.f38403b);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cp.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onResume() {
        String str;
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        TLRPC.ChatFull chatFull = this.Y;
        if (chatFull != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
            this.f38416l0 = tL_chatInviteExported;
            org.telegram.ui.Components.s90 s90Var = this.G;
            if (tL_chatInviteExported == null) {
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            s90Var.setLink(str);
            this.G.c(this.f38416l0, this.Z);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Cells.w4 w4Var = this.f38411g0;
            if (w4Var != null && w4Var.getChildCount() > 0 && (this.f38411g0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.f38411g0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23429h6, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            super.onThemeColorsChanged();
            LinearLayout linearLayout = this.f38427x;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = this.f38427x.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.n) {
                        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                        nVar.d.k(nVar.f24497n, nVar.f24496f);
                        nVar.f24493a.invalidate();
                    }
                }
            }
            org.telegram.ui.Components.o70 o70Var = this.f38420p0;
            if (o70Var != null) {
                o70Var.updateColors();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
