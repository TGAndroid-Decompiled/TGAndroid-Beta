package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class mp extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout E;
    public LinearLayout F;
    public org.telegram.ui.Components.f90 G;
    public org.telegram.ui.Cells.s8 H;
    public org.telegram.ui.Cells.f9 I;
    public org.telegram.ui.Cells.c7 J;
    public lp K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public oa O;
    public ArrayList P;
    public LinearLayout Q;
    public org.telegram.ui.Cells.m4 R;
    public org.telegram.ui.Cells.x8 S;
    public org.telegram.ui.Cells.f9 T;
    public ip U;
    public boolean V;
    public boolean W;
    public TLRPC.Chat X;
    public TLRPC.ChatFull Y;
    public long Z;
    public bi.t2 f35015a;
    public boolean f35016a0;
    public EditTextBoldCursor f35017b;
    public boolean f35018b0;
    public org.telegram.ui.Cells.f9 f35019c;
    public boolean f35020c0;
    public org.telegram.ui.Cells.m4 d;
    public boolean f35021d0;
    public org.telegram.ui.Cells.m4 e;
    public org.telegram.ui.Cells.c7 f35022e0;
    public gp f35023f;
    public ArrayList f35024f0;
    public org.telegram.ui.Cells.s4 f35025g0;
    public zd h;
    public int f35026h0;
    public String f35027i0;
    public qh f35028j0;
    public boolean f35029k0;
    public TLRPC.TL_chatInviteExported f35030l0;
    public boolean m0;
    public org.telegram.ui.ActionBar.w0 f35031n;
    public boolean f35032n0;
    public HashMap f35033o0;
    public org.telegram.ui.Components.a70 f35034p0;
    public bp f35035q0;
    public org.telegram.ui.Components.vr f35036r;
    public ValueAnimator f35037r0;
    public LinearLayout f35038s;
    public Boolean f35039s0;
    public boolean f35040t0;
    public org.telegram.ui.Cells.k6 v;
    public org.telegram.ui.Cells.k6 f35041w;
    public LinearLayout f35042x;
    public LinearLayout f35043y;

    public final void V() {
        if (!this.V && this.f35015a.length() <= 0) {
            ArrayList arrayList = this.N;
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            this.f35031n.setEnabled(false);
            this.f35031n.setAlpha(0.5f);
            return;
        }
        this.f35031n.setEnabled(true);
        this.f35031n.setAlpha(1.0f);
    }

    public final boolean W(String str) {
        if (str != null && str.length() > 0) {
            this.f35023f.setVisibility(0);
        } else {
            this.f35023f.setVisibility(8);
        }
        qh qhVar = this.f35028j0;
        if (qhVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qhVar);
            this.f35028j0 = null;
            this.f35027i0 = null;
            if (this.f35026h0 != 0) {
                getConnectionsManager().cancelRequest(this.f35026h0, true);
            }
        }
        this.f35029k0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (this.f35016a0) {
                            this.f35023f.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                        } else {
                            this.f35023f.setText(LocaleController.getString(R.string.LinkInvalidStartNumberMega));
                        }
                        this.f35023f.setTextColorByKey(org.telegram.ui.ActionBar.j6.f18144p7);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.f35023f.setText(LocaleController.getString(R.string.LinkInvalid));
                        this.f35023f.setTextColorByKey(org.telegram.ui.ActionBar.j6.f18144p7);
                        return false;
                    }
                }
            } else {
                this.f35023f.setText(LocaleController.getString(R.string.LinkInvalid));
                this.f35023f.setTextColorByKey(org.telegram.ui.ActionBar.j6.f18144p7);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.f35023f.setText(LocaleController.getString(R.string.LinkInvalidLong));
                this.f35023f.setTextColorByKey(org.telegram.ui.ActionBar.j6.f18144p7);
                return false;
            }
            this.f35023f.setText(LocaleController.getString(R.string.LinkChecking));
            this.f35023f.setTextColorByKey(org.telegram.ui.ActionBar.j6.F6);
            this.f35027i0 = str;
            qh qhVar2 = new qh(12, this, str);
            this.f35028j0 = qhVar2;
            AndroidUtilities.runOnUIThread(qhVar2, 300L);
            return true;
        }
        if (this.f35016a0) {
            this.f35023f.setText(LocaleController.getString(R.string.LinkInvalidShort));
        } else {
            this.f35023f.setText(LocaleController.getString(R.string.LinkInvalidShortMega));
        }
        this.f35023f.setTextColorByKey(org.telegram.ui.ActionBar.j6.f18144p7);
        return false;
    }

    public final void X(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.Z);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new bi.m4(6, this, z10)), this.classGuid);
    }

    public final void Y() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mp.Y():void");
    }

    public final void Z() {
        if (getParentActivity() == null) {
            return;
        }
        qg.k0 k0Var = new qg.k0(2, this.currentAccount, getParentActivity(), this, null);
        k0Var.f40784v0 = this.f35016a0;
        k0Var.H0 = new bp(this, 0);
        showDialog(k0Var);
    }

    public final void a0(boolean z10) {
        float f7;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.f35035q0);
        }
        if (this.f35036r != null) {
            ValueAnimator valueAnimator = this.f35037r0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f35036r.f28591c;
            float f11 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f35037r0 = ofFloat;
            ofFloat.addUpdateListener(new d3(this, 7));
            ValueAnimator valueAnimator2 = this.f35037r0;
            float f12 = this.f35036r.f28591c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.f35037r0.setInterpolator(org.telegram.ui.Components.wr.f28819f);
            this.f35037r0.start();
        }
    }

    public final void b0() {
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
        if (!this.V && !this.f35020c0 && getUserConfig().isPremium()) {
            this.f35019c.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.f9 f9Var = this.f35019c;
            int i20 = org.telegram.ui.ActionBar.j6.f18144p7;
            f9Var.setTag(Integer.valueOf(i20));
            this.f35019c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i20, false));
            this.f35043y.setVisibility(8);
            this.f35023f.setVisibility(8);
            this.J.setVisibility(8);
            this.f35022e0.setVisibility(0);
            if (this.f35021d0) {
                this.f35025g0.setVisibility(0);
                this.f35042x.setVisibility(8);
            } else {
                this.f35025g0.setVisibility(8);
                this.f35042x.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.f9 f9Var2 = this.f35019c;
            int i21 = org.telegram.ui.ActionBar.j6.B6;
            f9Var2.setTag(Integer.valueOf(i21));
            this.f35019c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i21, false));
            if (this.f35032n0) {
                this.J.setVisibility(8);
            } else {
                this.J.setVisibility(0);
            }
            this.f35022e0.setVisibility(8);
            this.f35042x.setVisibility(8);
            this.f35043y.setVisibility(0);
            this.f35025g0.setVisibility(8);
            if (this.f35016a0) {
                org.telegram.ui.Cells.f9 f9Var3 = this.f35019c;
                if (this.V) {
                    i16 = R.string.ChannelPrivateLinkHelp;
                } else {
                    i16 = R.string.ChannelUsernameHelp;
                }
                f9Var3.setText(LocaleController.getString(i16));
                org.telegram.ui.Cells.m4 m4Var = this.d;
                if (this.V) {
                    i17 = R.string.ChannelInviteLinkTitle;
                } else {
                    i17 = R.string.ChannelLinkTitle;
                }
                m4Var.setText(LocaleController.getString(i17));
            } else {
                org.telegram.ui.Cells.f9 f9Var4 = this.f35019c;
                if (this.V) {
                    i10 = R.string.MegaPrivateLinkHelp;
                } else {
                    i10 = R.string.MegaUsernameHelp;
                }
                f9Var4.setText(LocaleController.getString(i10));
                org.telegram.ui.Cells.m4 m4Var2 = this.d;
                if (this.V) {
                    i11 = R.string.ChannelInviteLinkTitle;
                } else {
                    i11 = R.string.ChannelLinkTitle;
                }
                m4Var2.setText(LocaleController.getString(i11));
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
            LinearLayout linearLayout3 = this.f35043y;
            if (this.V) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.f90 f90Var = this.G;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f35030l0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            f90Var.setLink(str);
            this.G.c(this.f35030l0, this.Z);
            gp gpVar = this.f35023f;
            if (!this.V && gpVar.f19121a.length() != 0) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            gpVar.setVisibility(i14);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.Z);
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.Z));
            org.telegram.ui.Cells.f9 f9Var5 = this.I;
            if (chatFull != null && chatFull.paid_media_allowed && ChatObject.isChannelAndNotMegaGroup(chat)) {
                i15 = R.string.ManageLinksInfoHelpPaid;
            } else {
                i15 = R.string.ManageLinksInfoHelp;
            }
            f9Var5.setText(LocaleController.getString(i15));
        }
        boolean z10 = true;
        this.v.a(!this.V);
        this.f35041w.a(this.V);
        this.f35015a.clearFocus();
        ip ipVar = this.U;
        if (ipVar != null) {
            if (this.f35016a0 && !this.V) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            ipVar.setVisibility(i18);
            ip ipVar2 = this.U;
            TLRPC.ChatFull chatFull2 = this.Y;
            ipVar2.c((chatFull2 == null || chatFull2.linked_chat_id == 0 || this.f35016a0) ? false : false);
        }
        lp lpVar = this.K;
        if (lpVar != null) {
            if (!this.V && !this.N.isEmpty()) {
                i19 = 0;
            }
            lpVar.setVisibility(i19);
        }
        V();
    }

    @Override
    public final View createView(Context context) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new vo(this, 1));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i13 = org.telegram.ui.ActionBar.j6.f18256v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i13, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.vr vrVar = new org.telegram.ui.Components.vr(mutate, new org.telegram.ui.Components.zp(org.telegram.ui.ActionBar.j6.w0(null, i13, false)));
        this.f35036r = vrVar;
        this.f35031n = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), vrVar);
        this.h = new zd(context);
        ep epVar = new ep(this, context, this.h, this.resourceProvider);
        this.fragmentView = epVar;
        epVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
        org.telegram.ui.Components.io0 io0Var = (org.telegram.ui.Components.io0) this.fragmentView;
        io0Var.setFillViewport(true);
        io0Var.addView(this.h, new FrameLayout.LayoutParams(-1, -2));
        this.actionBar.setAdaptiveBackground(io0Var);
        this.h.setOrientation(1);
        boolean z11 = this.f35032n0;
        if (z11) {
            this.actionBar.setTitle(LocaleController.getString(R.string.TypeLocationGroup));
        } else if (this.f35016a0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSettingsTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.GroupSettingsTitle));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f35038s = linearLayout;
        linearLayout.setOrientation(1);
        this.h.addView(this.f35038s, w7.a6.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
        this.e = m4Var;
        m4Var.setHeight(46);
        if (this.f35016a0) {
            this.e.setText(LocaleController.getString(R.string.ChannelTypeHeader));
        } else {
            this.e.setText(LocaleController.getString(R.string.GroupTypeHeader));
        }
        this.f35038s.addView(this.e);
        org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, false);
        this.f35041w = k6Var;
        if (this.f35016a0) {
            k6Var.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, this.V);
        } else {
            k6Var.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, this.V);
        }
        this.f35038s.addView(this.f35041w, w7.a6.n(-1, -2));
        this.f35041w.setOnClickListener(new dp(this, 1));
        org.telegram.ui.Cells.k6 k6Var2 = new org.telegram.ui.Cells.k6(context, false);
        this.v = k6Var2;
        if (this.f35016a0) {
            k6Var2.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !this.V);
        } else {
            k6Var2.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !this.V);
        }
        this.f35038s.addView(this.v, w7.a6.n(-1, -2));
        this.v.setOnClickListener(new dp(this, 2));
        org.telegram.ui.Cells.c7 c7Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
        this.J = c7Var;
        this.h.addView(c7Var, w7.a6.n(-1, -2));
        if (z11) {
            this.f35041w.setVisibility(8);
            this.v.setVisibility(8);
            this.J.setVisibility(8);
            this.e.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f35043y = linearLayout2;
        linearLayout2.setOrientation(1);
        this.h.addView(this.f35043y, w7.a6.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context, 23);
        this.d = m4Var2;
        this.f35043y.addView(m4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setOrientation(0);
        this.f35043y.addView(this.E, w7.a6.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f35017b = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().linkPrefix + "/");
        this.f35017b.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f35017b;
        int i14 = org.telegram.ui.ActionBar.j6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f35017b;
        int i15 = org.telegram.ui.ActionBar.j6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.f35017b.setMaxLines(1);
        this.f35017b.setLines(1);
        this.f35017b.setEnabled(false);
        this.f35017b.setBackground(null);
        this.f35017b.setPadding(0, 0, 0, 0);
        this.f35017b.setSingleLine(true);
        this.f35017b.setInputType(163840);
        this.f35017b.setImeOptions(6);
        this.E.addView(this.f35017b, w7.a6.n(-2, 36));
        bi.t2 t2Var = new bi.t2(this, context, 3);
        this.f35015a = t2Var;
        t2Var.setTextSize(1, 18.0f);
        this.f35015a.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        this.f35015a.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.f35015a.setMaxLines(1);
        this.f35015a.setLines(1);
        this.f35015a.setBackground(null);
        this.f35015a.setPadding(0, 0, 0, 0);
        this.f35015a.setSingleLine(true);
        this.f35015a.setInputType(163872);
        this.f35015a.setImeOptions(6);
        this.f35015a.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
        this.f35015a.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.f35015a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f35015a.setCursorWidth(1.5f);
        this.E.addView(this.f35015a, w7.a6.n(-1, 36));
        this.f35015a.addTextChangedListener(new m0(this, 3));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.F = linearLayout4;
        linearLayout4.setOrientation(1);
        this.f35043y.addView(this.F, w7.a6.n(-1, -2));
        org.telegram.ui.Components.f90 f90Var = new org.telegram.ui.Components.f90(context, this, null, true, ChatObject.isChannel(this.X));
        this.G = f90Var;
        f90Var.setDelegate(new fp(this, context));
        this.G.d(0, null, false);
        this.F.addView(this.G);
        gp gpVar = new gp(this, context, this.resourceProvider);
        this.f35023f = gpVar;
        gpVar.setBottomPadding(6);
        this.h.addView(this.f35023f, w7.a6.n(-2, -2));
        org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context, 12, this.resourceProvider);
        this.f35019c = f9Var;
        f9Var.setImportantForAccessibility(1);
        this.h.addView(this.f35019c, w7.a6.n(-1, -2));
        org.telegram.ui.Cells.s4 s4Var = new org.telegram.ui.Cells.s4(context);
        this.f35025g0 = s4Var;
        this.h.addView(s4Var, w7.a6.n(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.f35042x = linearLayout5;
        linearLayout5.setOrientation(1);
        this.h.addView(this.f35042x, w7.a6.n(-1, -2));
        org.telegram.ui.Cells.c7 c7Var2 = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
        this.f35022e0 = c7Var2;
        this.h.addView(c7Var2, w7.a6.n(-1, -2));
        zd zdVar = this.h;
        lp lpVar = new lp(this, context);
        this.K = lpVar;
        zdVar.addView(lpVar, w7.a6.n(-1, -2));
        lp lpVar2 = this.K;
        if (!this.V && !this.N.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        lpVar2.setVisibility(i10);
        org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
        this.H = s8Var;
        s8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ManageInviteLinks), false);
        this.H.setOnClickListener(new dp(this, 3));
        this.h.addView(this.H, w7.a6.n(-1, -2));
        org.telegram.ui.Cells.f9 f9Var2 = new org.telegram.ui.Cells.f9(context, 12, this.resourceProvider);
        this.I = f9Var2;
        this.h.addView(f9Var2, w7.a6.n(-1, -2));
        ip ipVar = new ip(this, context, this.X, context);
        this.U = ipVar;
        TLRPC.ChatFull chatFull = this.Y;
        if (chatFull != null && chatFull.linked_chat_id != 0 && !this.f35016a0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ipVar.c(z10);
        ip ipVar2 = this.U;
        TLRPC.ChatFull chatFull2 = this.Y;
        org.telegram.ui.Cells.f9 f9Var3 = ipVar2.e;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(ipVar2.f27610n);
        boolean isPublic = ChatObject.isPublic(ipVar2.f27610n);
        if (chatFull2 != null && chatFull2.guard_bot_id != 0) {
            String str = "@" + DialogObject.getPublicUsername(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(chatFull2.guard_bot_id)));
            if (isChannelAndNotMegaGroup) {
                i12 = R.string.ChannelSettingsJoinRequestInfoManagedBy;
            } else if (isPublic) {
                i12 = R.string.GroupPublicSettingsJoinRequestInfoManagedBy;
            } else {
                i12 = R.string.GroupPrivateSettingsJoinRequestInfoManagedBy;
            }
            f9Var3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i12, str), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.il, false), new org.telegram.ui.Components.hy(15, chatFull2, this)));
        } else {
            if (isChannelAndNotMegaGroup) {
                i11 = R.string.ChannelSettingsJoinRequestInfo2;
            } else if (isPublic) {
                i11 = R.string.GroupPublicSettingsJoinRequestInfo2;
            } else {
                i11 = R.string.GroupPrivateSettingsJoinRequestInfo2;
            }
            f9Var3.setText(LocaleController.getString(i11));
        }
        this.h.addView(this.U);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.Q = linearLayout6;
        linearLayout6.setOrientation(1);
        this.h.addView(this.Q);
        org.telegram.ui.Cells.m4 m4Var3 = new org.telegram.ui.Cells.m4(context, 23);
        this.R = m4Var3;
        m4Var3.setHeight(46);
        this.R.setText(LocaleController.getString(R.string.SavingContentTitle));
        this.Q.addView(this.R, w7.a6.n(-1, -2));
        org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
        this.S = x8Var;
        x8Var.f(LocaleController.getString(R.string.RestrictSavingContent), this.f35018b0, false);
        this.S.setOnClickListener(new dp(this, 4));
        this.Q.addView(this.S, w7.a6.n(-1, -2));
        this.T = new org.telegram.ui.Cells.f9(context, 12, this.resourceProvider);
        if (this.f35016a0 && !ChatObject.isMegagroup(this.X)) {
            this.T.setText(LocaleController.getString(R.string.RestrictSavingContentInfoChannel));
        } else {
            this.T.setText(LocaleController.getString(R.string.RestrictSavingContentInfoGroup));
        }
        this.Q.addView(this.T, w7.a6.n(-1, -2));
        String publicUsername = ChatObject.getPublicUsername(this.X, true);
        if (!this.V && publicUsername != null) {
            this.m0 = true;
            this.f35015a.setText(publicUsername);
            this.f35015a.setSelection(publicUsername.length());
            this.m0 = false;
        }
        b0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f17196id == this.Z) {
                this.Y = chatFull;
                this.f35030l0 = chatFull.exported_invite;
                b0();
            }
        } else if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.Z) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
                if (f5Var != null && f5Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 6);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17872a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        int i10 = org.telegram.ui.ActionBar.j6.f17892b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.J, 32, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.f18017i6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4096, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.f18144p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4096, null, null, null, null, i12));
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35015a, 4, null, null, null, null, i14));
        bi.t2 t2Var = this.f35015a;
        int i15 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(t2Var, 8388608, null, null, null, null, i15));
        LinearLayout linearLayout = this.f35038s;
        int i16 = org.telegram.ui.ActionBar.j6.f17928d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(linearLayout, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35043y, 1, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.j6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35017b, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35017b, 8388608, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35023f, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35023f, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35023f, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18271w6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35019c, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35019c, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35019c, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35022e0, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35042x, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35025g0, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f17999h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 4096, null, null, null, null, i12));
        int i18 = org.telegram.ui.ActionBar.j6.f17983g7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 8192, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        int i19 = org.telegram.ui.ActionBar.j6.f18000h7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 16384, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 4, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        int i20 = org.telegram.ui.ActionBar.j6.f18325z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 4, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35041w, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35041w, 8192, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35041w, 16384, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35041w, 4, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35041w, 4, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35042x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i14));
        int i21 = org.telegram.ui.ActionBar.j6.f18306y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35042x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35042x, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35042x, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, org.telegram.ui.ActionBar.j6.f18174r0, eVar, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 4, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18091m6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        bi.t2 t2Var;
        super.onBecomeFullyVisible();
        if (this.f35032n0 && (t2Var = this.f35015a) != null) {
            t2Var.requestFocus();
            AndroidUtilities.showKeyboard(this.f35015a);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mp.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        zd zdVar = this.h;
        if (zdVar != null) {
            zdVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i13);
        }
    }

    @Override
    public final void onResume() {
        String str;
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        TLRPC.ChatFull chatFull = this.Y;
        if (chatFull != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
            this.f35030l0 = tL_chatInviteExported;
            org.telegram.ui.Components.f90 f90Var = this.G;
            if (tL_chatInviteExported == null) {
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            f90Var.setLink(str);
            this.G.c(this.f35030l0, this.Z);
        }
    }
}
