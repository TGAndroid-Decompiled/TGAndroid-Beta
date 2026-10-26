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
public final class ap extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout E;
    public LinearLayout F;
    public org.telegram.ui.Components.r90 G;
    public org.telegram.ui.Cells.v8 H;
    public org.telegram.ui.Cells.i9 I;
    public org.telegram.ui.Cells.f7 J;
    public zo K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public qa O;
    public ArrayList P;
    public LinearLayout Q;
    public org.telegram.ui.Cells.q4 R;
    public org.telegram.ui.Cells.a9 S;
    public org.telegram.ui.Cells.i9 T;
    public wo U;
    public boolean V;
    public boolean W;
    public TLRPC.Chat X;
    public TLRPC.ChatFull Y;
    public long Z;
    public so f37844a;
    public boolean f37845a0;
    public fi.c2 f37846b;
    public boolean f37847b0;
    public EditTextBoldCursor f37848c;
    public boolean f37849c0;
    public org.telegram.ui.Cells.i9 d;
    public boolean f37850d0;
    public org.telegram.ui.Cells.q4 e;
    public org.telegram.ui.Cells.f7 f37851e0;
    public org.telegram.ui.Cells.q4 f37852f;
    public ArrayList f37853f0;
    public org.telegram.ui.Cells.w4 f37854g0;
    public uo h;
    public int f37855h0;
    public String f37856i0;
    public ed f37857j0;
    public boolean f37858k0;
    public TLRPC.TL_chatInviteExported f37859l0;
    public boolean m0;
    public org.telegram.ui.Components.fp0 f37860n;
    public boolean f37861n0;
    public HashMap f37862o0;
    public org.telegram.ui.Components.n70 f37863p0;
    public po f37864q0;
    public org.telegram.ui.ActionBar.u5 f37865r;
    public Boolean f37866r0;
    public LinearLayout f37867s;
    public boolean f37868s0;
    public org.telegram.ui.Cells.n6 v;
    public org.telegram.ui.Cells.n6 f37869w;
    public LinearLayout f37870x;
    public LinearLayout f37871y;

    public static org.telegram.ui.ActionBar.u6 V(ap apVar) {
        return apVar.resourceProvider;
    }

    public final void X() {
        boolean z10;
        org.telegram.ui.ActionBar.u5 u5Var = this.f37865r;
        if (!this.V && this.f37846b.length() <= 0) {
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
        ed edVar = this.f37857j0;
        if (edVar != null) {
            AndroidUtilities.cancelRunOnUIThread(edVar);
            this.f37857j0 = null;
            this.f37856i0 = null;
            if (this.f37855h0 != 0) {
                getConnectionsManager().cancelRequest(this.f37855h0, true);
            }
        }
        this.f37858k0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (this.f37845a0) {
                            this.h.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                        } else {
                            this.h.setText(LocaleController.getString(R.string.LinkInvalidStartNumberMega));
                        }
                        this.h.setTextColorByKey(org.telegram.ui.ActionBar.y6.f23581p7);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.h.setText(LocaleController.getString(R.string.LinkInvalid));
                        this.h.setTextColorByKey(org.telegram.ui.ActionBar.y6.f23581p7);
                        return false;
                    }
                }
            } else {
                this.h.setText(LocaleController.getString(R.string.LinkInvalid));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.y6.f23581p7);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.h.setText(LocaleController.getString(R.string.LinkInvalidLong));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.y6.f23581p7);
                return false;
            }
            this.h.setText(LocaleController.getString(R.string.LinkChecking));
            this.h.setTextColorByKey(org.telegram.ui.ActionBar.y6.F6);
            this.f37856i0 = str;
            ed edVar2 = new ed(23, this, str);
            this.f37857j0 = edVar2;
            AndroidUtilities.runOnUIThread(edVar2, 300L);
            return true;
        }
        if (this.f37845a0) {
            this.h.setText(LocaleController.getString(R.string.LinkInvalidShort));
        } else {
            this.h.setText(LocaleController.getString(R.string.LinkInvalidShortMega));
        }
        this.h.setTextColorByKey(org.telegram.ui.ActionBar.y6.f23581p7);
        return false;
    }

    public final void Z(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.Z);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new fi.m3(6, this, z10)), this.classGuid);
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ap.a0():void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23520m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23748y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23767z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23429h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23318b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23711w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23656t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
    }

    public final void b0() {
        if (getParentActivity() == null) {
            return;
        }
        tg.j0 j0Var = new tg.j0(2, this.currentAccount, getParentActivity(), this, null);
        j0Var.f48904v0 = this.f37845a0;
        j0Var.H0 = new po(this, 0);
        showDialog(j0Var);
    }

    public final void c0(boolean z10) {
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.f37864q0);
        }
        org.telegram.ui.ActionBar.u5 u5Var = this.f37865r;
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
        this.f37865r = this.simpleActionBar.i(LocaleController.getString(R.string.Save));
        this.f37860n = new org.telegram.ui.Components.fp0(context);
        this.f37844a = new so(this, context, this.f37860n, this.resourceProvider);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(this.f37844a, org.telegram.ui.Components.gb1.k());
        this.fragmentView = frameLayout;
        this.f37844a.setFillViewport(true);
        this.f37844a.setDrawBackground(true);
        this.f37844a.setOverScrollMode(0);
        this.f37844a.addView(this.f37860n, new FrameLayout.LayoutParams(-1, -2));
        this.f37860n.setOrientation(1);
        boolean z12 = this.f37861n0;
        if (z12) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.TypeLocationGroup));
        } else if (this.f37845a0) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.ChannelSettingsTitle));
        } else {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.GroupSettingsTitle));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f37867s = linearLayout;
        linearLayout.setOrientation(1);
        this.f37860n.addView(this.f37867s, org.telegram.ui.Components.gb1.r(-1, -2));
        org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context, 23);
        this.f37852f = q4Var;
        q4Var.setHeight(46);
        if (this.f37845a0) {
            this.f37852f.setText(LocaleController.getString(R.string.ChannelTypeHeader));
        } else {
            this.f37852f.setText(LocaleController.getString(R.string.GroupTypeHeader));
        }
        this.f37867s.addView(this.f37852f);
        org.telegram.ui.Cells.n6 n6Var = new org.telegram.ui.Cells.n6(context, false);
        this.f37869w = n6Var;
        if (this.f37845a0) {
            n6Var.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, this.V);
        } else {
            n6Var.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, this.V);
        }
        this.f37867s.addView(this.f37869w, org.telegram.ui.Components.gb1.r(-1, -2));
        this.f37869w.setOnClickListener(new ro(this, 1));
        org.telegram.ui.Cells.n6 n6Var2 = new org.telegram.ui.Cells.n6(context, false);
        this.v = n6Var2;
        if (this.f37845a0) {
            n6Var2.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !this.V);
        } else {
            n6Var2.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !this.V);
        }
        this.f37867s.addView(this.v, org.telegram.ui.Components.gb1.r(-1, -2));
        this.v.setOnClickListener(new ro(this, 2));
        org.telegram.ui.Cells.f7 f7Var = new org.telegram.ui.Cells.f7(context, (d3) null);
        this.J = f7Var;
        this.f37860n.addView(f7Var, org.telegram.ui.Components.gb1.r(-1, -2));
        if (z12) {
            this.f37869w.setVisibility(8);
            this.v.setVisibility(8);
            this.J.setVisibility(8);
            this.f37852f.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f37871y = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f37860n.addView(this.f37871y, org.telegram.ui.Components.gb1.r(-1, -2));
        org.telegram.ui.Cells.q4 q4Var2 = new org.telegram.ui.Cells.q4(context, 23);
        this.e = q4Var2;
        this.f37871y.addView(q4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setOrientation(0);
        this.f37871y.addView(this.E, org.telegram.ui.Components.gb1.o(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f37848c = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().linkPrefix + "/");
        this.f37848c.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f37848c;
        int i13 = org.telegram.ui.ActionBar.y6.H6;
        org.telegram.ui.ActionBar.f7.E(editTextBoldCursor2, i13, null);
        EditTextBoldCursor editTextBoldCursor3 = this.f37848c;
        int i14 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(editTextBoldCursor3, i14, null);
        this.f37848c.setMaxLines(1);
        this.f37848c.setLines(1);
        this.f37848c.setEnabled(false);
        this.f37848c.setBackground(null);
        this.f37848c.setPadding(0, 0, 0, 0);
        this.f37848c.setSingleLine(true);
        this.f37848c.setInputType(163840);
        this.f37848c.setImeOptions(6);
        this.E.addView(this.f37848c, org.telegram.ui.Components.gb1.r(-2, 36));
        fi.c2 c2Var = new fi.c2(this, context, 4);
        this.f37846b = c2Var;
        c2Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.f7.E(this.f37846b, i13, null);
        org.telegram.ui.ActionBar.f7.V(this.f37846b, i14, null);
        this.f37846b.setMaxLines(1);
        this.f37846b.setLines(1);
        this.f37846b.setBackground(null);
        this.f37846b.setPadding(0, 0, 0, 0);
        this.f37846b.setSingleLine(true);
        this.f37846b.setInputType(163872);
        this.f37846b.setImeOptions(6);
        this.f37846b.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
        org.telegram.ui.ActionBar.f7.w(this.f37846b, i14, null);
        this.f37846b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f37846b.setCursorWidth(1.5f);
        this.E.addView(this.f37846b, org.telegram.ui.Components.gb1.r(-1, 36));
        this.f37846b.addTextChangedListener(new m0(this, 3));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.F = linearLayout4;
        linearLayout4.setOrientation(1);
        this.f37871y.addView(this.F, org.telegram.ui.Components.gb1.r(-1, -2));
        org.telegram.ui.Components.r90 r90Var = new org.telegram.ui.Components.r90(context, this, null, true, ChatObject.isChannel(this.X));
        this.G = r90Var;
        r90Var.setDelegate(new to(this, context));
        this.G.d(0, null, false);
        this.F.addView(this.G);
        uo uoVar = new uo(this, context, this.resourceProvider);
        this.h = uoVar;
        uoVar.setBottomPadding(6);
        this.f37860n.addView(this.h, org.telegram.ui.Components.gb1.r(-2, -2));
        org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context, 12, this.resourceProvider);
        this.d = i9Var;
        i9Var.setImportantForAccessibility(1);
        this.f37860n.addView(this.d, org.telegram.ui.Components.gb1.r(-1, -2));
        org.telegram.ui.Cells.w4 w4Var = new org.telegram.ui.Cells.w4(context);
        this.f37854g0 = w4Var;
        this.f37860n.addView(w4Var, org.telegram.ui.Components.gb1.r(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.f37870x = linearLayout5;
        linearLayout5.setOrientation(1);
        this.f37860n.addView(this.f37870x, org.telegram.ui.Components.gb1.r(-1, -2));
        org.telegram.ui.Cells.f7 f7Var2 = new org.telegram.ui.Cells.f7(context, (d3) null);
        this.f37851e0 = f7Var2;
        this.f37860n.addView(f7Var2, org.telegram.ui.Components.gb1.r(-1, -2));
        org.telegram.ui.Components.fp0 fp0Var = this.f37860n;
        zo zoVar = new zo(this, context);
        this.K = zoVar;
        fp0Var.addView(zoVar, org.telegram.ui.Components.gb1.r(-1, -2));
        zo zoVar2 = this.K;
        if (!this.V && !this.N.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        zoVar2.setVisibility(i10);
        org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(context);
        this.H = v8Var;
        v8Var.o(R.drawable.msg_link2, LocaleController.getString(R.string.ManageInviteLinks), false);
        this.H.setOnClickListener(new ro(this, 3));
        this.f37860n.addView(this.H, org.telegram.ui.Components.gb1.r(-1, -2));
        org.telegram.ui.Cells.i9 i9Var2 = new org.telegram.ui.Cells.i9(context, 12, this.resourceProvider);
        this.I = i9Var2;
        this.f37860n.addView(i9Var2, org.telegram.ui.Components.gb1.r(-1, -2));
        wo woVar = new wo(this, context, this.X, context);
        this.U = woVar;
        TLRPC.ChatFull chatFull = this.Y;
        if (chatFull != null && chatFull.linked_chat_id != 0 && !this.f37845a0) {
            z10 = true;
        } else {
            z10 = false;
        }
        woVar.c(z10);
        wo woVar2 = this.U;
        TLRPC.ChatFull chatFull2 = this.Y;
        org.telegram.ui.Cells.i9 i9Var3 = woVar2.e;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(woVar2.f28505n);
        boolean isPublic = ChatObject.isPublic(woVar2.f28505n);
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
        this.f37860n.addView(this.U);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.Q = linearLayout6;
        linearLayout6.setOrientation(1);
        this.f37860n.addView(this.Q);
        org.telegram.ui.Cells.q4 q4Var3 = new org.telegram.ui.Cells.q4(context, 23);
        this.R = q4Var3;
        q4Var3.setHeight(46);
        this.R.setText(LocaleController.getString(R.string.SavingContentTitle));
        this.Q.addView(this.R, org.telegram.ui.Components.gb1.r(-1, -2));
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
        this.S = a9Var;
        a9Var.f(LocaleController.getString(R.string.RestrictSavingContent), this.f37847b0, z11);
        this.S.setOnClickListener(new ro(this, 4));
        this.Q.addView(this.S, org.telegram.ui.Components.gb1.r(-1, -2));
        this.T = new org.telegram.ui.Cells.i9(context, 12, this.resourceProvider);
        if (this.f37845a0 && !ChatObject.isMegagroup(this.X)) {
            this.T.setText(LocaleController.getString(R.string.RestrictSavingContentInfoChannel));
        } else {
            this.T.setText(LocaleController.getString(R.string.RestrictSavingContentInfoGroup));
        }
        this.Q.addView(this.T, org.telegram.ui.Components.gb1.r(-1, -2));
        String publicUsername = ChatObject.getPublicUsername(this.X, true);
        if (!this.V && publicUsername != null) {
            this.m0 = true;
            this.f37846b.setText(publicUsername);
            this.f37846b.setSelection(publicUsername.length());
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
        if (!this.V && !this.f37849c0 && getUserConfig().isPremium()) {
            this.d.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.i9 i9Var = this.d;
            int i20 = org.telegram.ui.ActionBar.y6.f23581p7;
            i9Var.setTag(Integer.valueOf(i20));
            org.telegram.ui.ActionBar.f7.V(this.d.getTextView(), i20, null);
            this.f37871y.setVisibility(8);
            this.h.setVisibility(8);
            this.J.setVisibility(8);
            this.f37851e0.setVisibility(0);
            if (this.f37850d0) {
                this.f37854g0.setVisibility(0);
                this.f37870x.setVisibility(8);
            } else {
                this.f37854g0.setVisibility(8);
                this.f37870x.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.i9 i9Var2 = this.d;
            int i21 = org.telegram.ui.ActionBar.y6.B6;
            i9Var2.setTag(Integer.valueOf(i21));
            org.telegram.ui.ActionBar.f7.V(this.d.getTextView(), i21, null);
            if (this.f37861n0) {
                this.J.setVisibility(8);
            } else {
                this.J.setVisibility(0);
            }
            this.f37851e0.setVisibility(8);
            this.f37870x.setVisibility(8);
            this.f37871y.setVisibility(0);
            this.f37854g0.setVisibility(8);
            if (this.f37845a0) {
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
            LinearLayout linearLayout3 = this.f37871y;
            if (this.V) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.r90 r90Var = this.G;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f37859l0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            r90Var.setLink(str);
            this.G.c(this.f37859l0, this.Z);
            uo uoVar = this.h;
            if (!this.V && uoVar.f24253a.length() != 0) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            uoVar.setVisibility(i14);
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
        this.f37869w.a(this.V);
        this.f37846b.clearFocus();
        wo woVar = this.U;
        if (woVar != null) {
            if (this.f37845a0 && !this.V) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            woVar.setVisibility(i18);
            wo woVar2 = this.U;
            TLRPC.ChatFull chatFull2 = this.Y;
            if (chatFull2 == null || chatFull2.linked_chat_id == 0 || this.f37845a0) {
                z10 = false;
            }
            woVar2.c(z10);
        }
        zo zoVar = this.K;
        if (zoVar != null) {
            if (!this.V && !this.N.isEmpty()) {
                i19 = 0;
            }
            zoVar.setVisibility(i19);
        }
        X();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f22028id == this.Z) {
                this.Y = chatFull;
                this.f37859l0 = chatFull.exported_invite;
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
    public final org.telegram.ui.Components.gp0 getScrollViewForSimpleGlass() {
        return this.f37844a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.y6.f23448i6;
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 4, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23581p7));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        LinearLayout linearLayout = this.f37867s;
        int i11 = org.telegram.ui.ActionBar.y6.f23356d6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f37871y, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.S, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.S, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.S, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f37870x, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f37854g0, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23428h6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f37869w, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
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
        if (this.f37861n0 && (c2Var = this.f37846b) != null) {
            c2Var.requestFocus();
            AndroidUtilities.showKeyboard(this.f37846b);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ap.onFragmentCreate():boolean");
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
            this.f37859l0 = tL_chatInviteExported;
            org.telegram.ui.Components.r90 r90Var = this.G;
            if (tL_chatInviteExported == null) {
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            r90Var.setLink(str);
            this.G.c(this.f37859l0, this.Z);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Cells.w4 w4Var = this.f37854g0;
            if (w4Var != null && w4Var.getChildCount() > 0 && (this.f37854g0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.f37854g0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23428h6, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            super.onThemeColorsChanged();
            LinearLayout linearLayout = this.f37870x;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = this.f37870x.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.n) {
                        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                        nVar.d.k(nVar.f24495n, nVar.f24494f);
                        nVar.f24491a.invalidate();
                    }
                }
            }
            org.telegram.ui.Components.n70 n70Var = this.f37863p0;
            if (n70Var != null) {
                n70Var.updateColors();
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
