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
public final class fp extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout B;
    public LinearLayout C;
    public org.telegram.ui.Components.x80 D;
    public org.telegram.ui.Cells.n8 E;
    public org.telegram.ui.Cells.z8 F;
    public org.telegram.ui.Cells.y6 G;
    public ep H;
    public boolean I;
    public ArrayList J;
    public ArrayList K;
    public oa L;
    public ArrayList M;
    public LinearLayout N;
    public org.telegram.ui.Cells.l4 O;
    public org.telegram.ui.Cells.r8 P;
    public org.telegram.ui.Cells.z8 Q;
    public bp R;
    public boolean S;
    public boolean T;
    public TLRPC.Chat U;
    public TLRPC.ChatFull V;
    public long W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public kg.f f34177a;
    public boolean f34178a0;
    public EditTextBoldCursor f34179b;
    public org.telegram.ui.Cells.y6 f34180b0;
    public org.telegram.ui.Cells.z8 f34181c;
    public ArrayList f34182c0;
    public org.telegram.ui.Cells.l4 d;
    public org.telegram.ui.Cells.r4 f34183d0;
    public org.telegram.ui.Cells.l4 e;
    public int f34184e0;
    public zo f34185f;
    public String f34186f0;
    public hc f34187g0;
    public dg.u3 h;
    public boolean f34188h0;
    public TLRPC.TL_chatInviteExported f34189i0;
    public boolean f34190j0;
    public boolean f34191k0;
    public HashMap f34192l0;
    public org.telegram.ui.Components.t60 m0;
    public org.telegram.ui.ActionBar.w0 f34193n;
    public uo f34194n0;
    public ValueAnimator f34195o0;
    public Boolean f34196p0;
    public boolean f34197q0;
    public org.telegram.ui.Components.lr f34198r;
    public LinearLayout f34199s;
    public org.telegram.ui.Cells.h6 v;
    public org.telegram.ui.Cells.h6 f34200w;
    public LinearLayout f34201x;
    public LinearLayout f34202y;

    public final void V() {
        if (!this.S && this.f34177a.length() <= 0) {
            ArrayList arrayList = this.K;
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            this.f34193n.setEnabled(false);
            this.f34193n.setAlpha(0.5f);
            return;
        }
        this.f34193n.setEnabled(true);
        this.f34193n.setAlpha(1.0f);
    }

    public final boolean W(String str) {
        if (str != null && str.length() > 0) {
            this.f34185f.setVisibility(0);
        } else {
            this.f34185f.setVisibility(8);
        }
        hc hcVar = this.f34187g0;
        if (hcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(hcVar);
            this.f34187g0 = null;
            this.f34186f0 = null;
            if (this.f34184e0 != 0) {
                getConnectionsManager().cancelRequest(this.f34184e0, true);
            }
        }
        this.f34188h0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (this.X) {
                            this.f34185f.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                        } else {
                            this.f34185f.setText(LocaleController.getString(R.string.LinkInvalidStartNumberMega));
                        }
                        this.f34185f.setTextColorByKey(org.telegram.ui.ActionBar.j6.f20097p7);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.f34185f.setText(LocaleController.getString(R.string.LinkInvalid));
                        this.f34185f.setTextColorByKey(org.telegram.ui.ActionBar.j6.f20097p7);
                        return false;
                    }
                }
            } else {
                this.f34185f.setText(LocaleController.getString(R.string.LinkInvalid));
                this.f34185f.setTextColorByKey(org.telegram.ui.ActionBar.j6.f20097p7);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.f34185f.setText(LocaleController.getString(R.string.LinkInvalidLong));
                this.f34185f.setTextColorByKey(org.telegram.ui.ActionBar.j6.f20097p7);
                return false;
            }
            this.f34185f.setText(LocaleController.getString(R.string.LinkChecking));
            this.f34185f.setTextColorByKey(org.telegram.ui.ActionBar.j6.F6);
            this.f34186f0 = str;
            hc hcVar2 = new hc(26, this, str);
            this.f34187g0 = hcVar2;
            AndroidUtilities.runOnUIThread(hcVar2, 300L);
            return true;
        }
        if (this.X) {
            this.f34185f.setText(LocaleController.getString(R.string.LinkInvalidShort));
        } else {
            this.f34185f.setText(LocaleController.getString(R.string.LinkInvalidShortMega));
        }
        this.f34185f.setTextColorByKey(org.telegram.ui.ActionBar.j6.f20097p7);
        return false;
    }

    public final void X(boolean z4) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.W);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new org.telegram.messenger.zd(5, this, z4)), this.classGuid);
    }

    public final void Y() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fp.Y():void");
    }

    public final void Z() {
        if (getParentActivity() == null) {
            return;
        }
        eg.v0 v0Var = new eg.v0(2, this.currentAccount, getParentActivity(), this, null);
        v0Var.f5540s0 = this.X;
        v0Var.E0 = new uo(this, 0);
        showDialog(v0Var);
    }

    public final void a0(boolean z4) {
        float f10;
        if (!z4) {
            AndroidUtilities.cancelRunOnUIThread(this.f34194n0);
        }
        if (this.f34198r != null) {
            ValueAnimator valueAnimator = this.f34195o0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f34198r.f26868c;
            float f12 = 0.0f;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f34195o0 = ofFloat;
            ofFloat.addUpdateListener(new g3(this, 7));
            ValueAnimator valueAnimator2 = this.f34195o0;
            float f13 = this.f34198r.f26868c;
            if (z4) {
                f12 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f13 - f12) * 200.0f);
            this.f34195o0.setInterpolator(org.telegram.ui.Components.mr.f27122f);
            this.f34195o0.start();
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
        if (this.G == null) {
            return;
        }
        String str = null;
        int i19 = 8;
        if (!this.S && !this.Z && getUserConfig().isPremium()) {
            this.f34181c.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.z8 z8Var = this.f34181c;
            int i20 = org.telegram.ui.ActionBar.j6.f20097p7;
            z8Var.setTag(Integer.valueOf(i20));
            this.f34181c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i20, false));
            this.f34202y.setVisibility(8);
            this.f34185f.setVisibility(8);
            this.G.setVisibility(8);
            this.f34180b0.setVisibility(0);
            if (this.f34178a0) {
                this.f34183d0.setVisibility(0);
                this.f34201x.setVisibility(8);
            } else {
                this.f34183d0.setVisibility(8);
                this.f34201x.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.z8 z8Var2 = this.f34181c;
            int i21 = org.telegram.ui.ActionBar.j6.B6;
            z8Var2.setTag(Integer.valueOf(i21));
            this.f34181c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i21, false));
            if (this.f34191k0) {
                this.G.setVisibility(8);
            } else {
                this.G.setVisibility(0);
            }
            this.f34180b0.setVisibility(8);
            this.f34201x.setVisibility(8);
            this.f34202y.setVisibility(0);
            this.f34183d0.setVisibility(8);
            if (this.X) {
                org.telegram.ui.Cells.z8 z8Var3 = this.f34181c;
                if (this.S) {
                    i16 = R.string.ChannelPrivateLinkHelp;
                } else {
                    i16 = R.string.ChannelUsernameHelp;
                }
                z8Var3.setText(LocaleController.getString(i16));
                org.telegram.ui.Cells.l4 l4Var = this.d;
                if (this.S) {
                    i17 = R.string.ChannelInviteLinkTitle;
                } else {
                    i17 = R.string.ChannelLinkTitle;
                }
                l4Var.setText(LocaleController.getString(i17));
            } else {
                org.telegram.ui.Cells.z8 z8Var4 = this.f34181c;
                if (this.S) {
                    i10 = R.string.MegaPrivateLinkHelp;
                } else {
                    i10 = R.string.MegaUsernameHelp;
                }
                z8Var4.setText(LocaleController.getString(i10));
                org.telegram.ui.Cells.l4 l4Var2 = this.d;
                if (this.S) {
                    i11 = R.string.ChannelInviteLinkTitle;
                } else {
                    i11 = R.string.ChannelLinkTitle;
                }
                l4Var2.setText(LocaleController.getString(i11));
            }
            LinearLayout linearLayout = this.B;
            if (this.S) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            linearLayout.setVisibility(i12);
            LinearLayout linearLayout2 = this.C;
            if (this.S) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            linearLayout2.setVisibility(i13);
            this.N.setVisibility(0);
            this.E.setVisibility(0);
            this.F.setVisibility(0);
            LinearLayout linearLayout3 = this.f34202y;
            if (this.S) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.x80 x80Var = this.D;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f34189i0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            x80Var.setLink(str);
            this.D.c(this.f34189i0, this.W);
            zo zoVar = this.f34185f;
            if (!this.S && zoVar.f22669a.length() != 0) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            zoVar.setVisibility(i14);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.W);
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.W));
            org.telegram.ui.Cells.z8 z8Var5 = this.F;
            if (chatFull != null && chatFull.paid_media_allowed && ChatObject.isChannelAndNotMegaGroup(chat)) {
                i15 = R.string.ManageLinksInfoHelpPaid;
            } else {
                i15 = R.string.ManageLinksInfoHelp;
            }
            z8Var5.setText(LocaleController.getString(i15));
        }
        boolean z4 = true;
        this.v.a(!this.S);
        this.f34200w.a(this.S);
        this.f34177a.clearFocus();
        bp bpVar = this.R;
        if (bpVar != null) {
            if (this.X && !this.S) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            bpVar.setVisibility(i18);
            bp bpVar2 = this.R;
            TLRPC.ChatFull chatFull2 = this.V;
            bpVar2.c((chatFull2 == null || chatFull2.linked_chat_id == 0 || this.X) ? false : false);
        }
        ep epVar = this.H;
        if (epVar != null) {
            if (!this.S && !this.K.isEmpty()) {
                i19 = 0;
            }
            epVar.setVisibility(i19);
        }
        V();
    }

    @Override
    public final View createView(Context context) {
        int i10;
        boolean z4;
        int i11;
        int i12;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 18));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i13 = org.telegram.ui.ActionBar.j6.f20202v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i13, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.lr lrVar = new org.telegram.ui.Components.lr(mutate, new org.telegram.ui.Components.qp(org.telegram.ui.ActionBar.j6.w0(null, i13, false)));
        this.f34198r = lrVar;
        this.f34193n = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), lrVar);
        this.h = new dg.u3(context);
        xo xoVar = new xo(this, context, this.h, this.resourceProvider);
        this.fragmentView = xoVar;
        xoVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false));
        org.telegram.ui.Components.do0 do0Var = (org.telegram.ui.Components.do0) this.fragmentView;
        do0Var.setFillViewport(true);
        do0Var.addView(this.h, new FrameLayout.LayoutParams(-1, -2));
        this.actionBar.setAdaptiveBackground(do0Var);
        this.h.setOrientation(1);
        boolean z10 = this.f34191k0;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.TypeLocationGroup));
        } else if (this.X) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSettingsTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.GroupSettingsTitle));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f34199s = linearLayout;
        linearLayout.setOrientation(1);
        this.h.addView(this.f34199s, k7.b6.n(-1, -2));
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, 23);
        this.e = l4Var;
        l4Var.setHeight(46);
        if (this.X) {
            this.e.setText(LocaleController.getString(R.string.ChannelTypeHeader));
        } else {
            this.e.setText(LocaleController.getString(R.string.GroupTypeHeader));
        }
        this.f34199s.addView(this.e);
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, false);
        this.f34200w = h6Var;
        if (this.X) {
            h6Var.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, this.S);
        } else {
            h6Var.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, this.S);
        }
        this.f34199s.addView(this.f34200w, k7.b6.n(-1, -2));
        this.f34200w.setOnClickListener(new wo(this, 1));
        org.telegram.ui.Cells.h6 h6Var2 = new org.telegram.ui.Cells.h6(context, false);
        this.v = h6Var2;
        if (this.X) {
            h6Var2.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !this.S);
        } else {
            h6Var2.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !this.S);
        }
        this.f34199s.addView(this.v, k7.b6.n(-1, -2));
        this.v.setOnClickListener(new wo(this, 2));
        org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context, (b) null);
        this.G = y6Var;
        this.h.addView(y6Var, k7.b6.n(-1, -2));
        if (z10) {
            this.f34200w.setVisibility(8);
            this.v.setVisibility(8);
            this.G.setVisibility(8);
            this.e.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f34202y = linearLayout2;
        linearLayout2.setOrientation(1);
        this.h.addView(this.f34202y, k7.b6.n(-1, -2));
        org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context, 23);
        this.d = l4Var2;
        this.f34202y.addView(l4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.B = linearLayout3;
        linearLayout3.setOrientation(0);
        this.f34202y.addView(this.B, k7.b6.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f34179b = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().linkPrefix + "/");
        this.f34179b.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f34179b;
        int i14 = org.telegram.ui.ActionBar.j6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f34179b;
        int i15 = org.telegram.ui.ActionBar.j6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.f34179b.setMaxLines(1);
        this.f34179b.setLines(1);
        this.f34179b.setEnabled(false);
        this.f34179b.setBackground(null);
        this.f34179b.setPadding(0, 0, 0, 0);
        this.f34179b.setSingleLine(true);
        this.f34179b.setInputType(163840);
        this.f34179b.setImeOptions(6);
        this.B.addView(this.f34179b, k7.b6.n(-2, 36));
        kg.f fVar = new kg.f(this, context, 2);
        this.f34177a = fVar;
        fVar.setTextSize(1, 18.0f);
        this.f34177a.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        this.f34177a.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.f34177a.setMaxLines(1);
        this.f34177a.setLines(1);
        this.f34177a.setBackground(null);
        this.f34177a.setPadding(0, 0, 0, 0);
        this.f34177a.setSingleLine(true);
        this.f34177a.setInputType(163872);
        this.f34177a.setImeOptions(6);
        this.f34177a.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
        this.f34177a.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.f34177a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f34177a.setCursorWidth(1.5f);
        this.B.addView(this.f34177a, k7.b6.n(-1, 36));
        this.f34177a.addTextChangedListener(new p0(this, 3));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.C = linearLayout4;
        linearLayout4.setOrientation(1);
        this.f34202y.addView(this.C, k7.b6.n(-1, -2));
        org.telegram.ui.Components.x80 x80Var = new org.telegram.ui.Components.x80(context, this, null, true, ChatObject.isChannel(this.U));
        this.D = x80Var;
        x80Var.setDelegate(new yo(this, context));
        this.D.d(0, null, false);
        this.C.addView(this.D);
        zo zoVar = new zo(this, context, this.resourceProvider);
        this.f34185f = zoVar;
        zoVar.setBottomPadding(6);
        this.h.addView(this.f34185f, k7.b6.n(-2, -2));
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context, 12, this.resourceProvider);
        this.f34181c = z8Var;
        z8Var.setImportantForAccessibility(1);
        this.h.addView(this.f34181c, k7.b6.n(-1, -2));
        org.telegram.ui.Cells.r4 r4Var = new org.telegram.ui.Cells.r4(context);
        this.f34183d0 = r4Var;
        this.h.addView(r4Var, k7.b6.n(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.f34201x = linearLayout5;
        linearLayout5.setOrientation(1);
        this.h.addView(this.f34201x, k7.b6.n(-1, -2));
        org.telegram.ui.Cells.y6 y6Var2 = new org.telegram.ui.Cells.y6(context, (b) null);
        this.f34180b0 = y6Var2;
        this.h.addView(y6Var2, k7.b6.n(-1, -2));
        dg.u3 u3Var = this.h;
        ep epVar = new ep(this, context);
        this.H = epVar;
        u3Var.addView(epVar, k7.b6.n(-1, -2));
        ep epVar2 = this.H;
        if (!this.S && !this.K.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        epVar2.setVisibility(i10);
        org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(context);
        this.E = n8Var;
        n8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ManageInviteLinks), false);
        this.E.setOnClickListener(new wo(this, 3));
        this.h.addView(this.E, k7.b6.n(-1, -2));
        org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context, 12, this.resourceProvider);
        this.F = z8Var2;
        this.h.addView(z8Var2, k7.b6.n(-1, -2));
        bp bpVar = new bp(this, context, this.U, context);
        this.R = bpVar;
        TLRPC.ChatFull chatFull = this.V;
        if (chatFull != null && chatFull.linked_chat_id != 0 && !this.X) {
            z4 = true;
        } else {
            z4 = false;
        }
        bpVar.c(z4);
        bp bpVar2 = this.R;
        TLRPC.ChatFull chatFull2 = this.V;
        org.telegram.ui.Cells.z8 z8Var3 = bpVar2.e;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(bpVar2.f26988n);
        boolean isPublic = ChatObject.isPublic(bpVar2.f26988n);
        if (chatFull2 != null && chatFull2.guard_bot_id != 0) {
            String str = "@" + DialogObject.getPublicUsername(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(chatFull2.guard_bot_id)));
            if (isChannelAndNotMegaGroup) {
                i12 = R.string.ChannelSettingsJoinRequestInfoManagedBy;
            } else if (isPublic) {
                i12 = R.string.GroupPublicSettingsJoinRequestInfoManagedBy;
            } else {
                i12 = R.string.GroupPrivateSettingsJoinRequestInfoManagedBy;
            }
            z8Var3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i12, str), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.il, false), new org.telegram.ui.Components.em(29, chatFull2, this)));
        } else {
            if (isChannelAndNotMegaGroup) {
                i11 = R.string.ChannelSettingsJoinRequestInfo2;
            } else if (isPublic) {
                i11 = R.string.GroupPublicSettingsJoinRequestInfo2;
            } else {
                i11 = R.string.GroupPrivateSettingsJoinRequestInfo2;
            }
            z8Var3.setText(LocaleController.getString(i11));
        }
        this.h.addView(this.R);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.N = linearLayout6;
        linearLayout6.setOrientation(1);
        this.h.addView(this.N);
        org.telegram.ui.Cells.l4 l4Var3 = new org.telegram.ui.Cells.l4(context, 23);
        this.O = l4Var3;
        l4Var3.setHeight(46);
        this.O.setText(LocaleController.getString(R.string.SavingContentTitle));
        this.N.addView(this.O, k7.b6.n(-1, -2));
        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
        this.P = r8Var;
        r8Var.f(LocaleController.getString(R.string.RestrictSavingContent), this.Y, false);
        this.P.setOnClickListener(new wo(this, 4));
        this.N.addView(this.P, k7.b6.n(-1, -2));
        this.Q = new org.telegram.ui.Cells.z8(context, 12, this.resourceProvider);
        if (this.X && !ChatObject.isMegagroup(this.U)) {
            this.Q.setText(LocaleController.getString(R.string.RestrictSavingContentInfoChannel));
        } else {
            this.Q.setText(LocaleController.getString(R.string.RestrictSavingContentInfoGroup));
        }
        this.N.addView(this.Q, k7.b6.n(-1, -2));
        String publicUsername = ChatObject.getPublicUsername(this.U, true);
        if (!this.S && publicUsername != null) {
            this.f34190j0 = true;
            this.f34177a.setText(publicUsername);
            this.f34177a.setSelection(publicUsername.length());
            this.f34190j0 = false;
        }
        b0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f19160id == this.W) {
                this.V = chatFull;
                this.f34189i0 = chatFull.exported_invite;
                b0();
            }
        } else if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.W) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
                if (e5Var != null && e5Var.getLastFragment() == this) {
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
        f fVar = new f(this, 6);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19827a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20202v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20167t8));
        int i10 = org.telegram.ui.ActionBar.j6.f19846b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.G, 32, new Class[]{org.telegram.ui.Cells.y6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 32, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.f19971i6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4096, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.f20097p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4096, null, null, null, null, i12));
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34177a, 4, null, null, null, null, i14));
        kg.f fVar2 = this.f34177a;
        int i15 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(fVar2, 8388608, null, null, null, null, i15));
        LinearLayout linearLayout = this.f34199s;
        int i16 = org.telegram.ui.ActionBar.j6.f19881d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(linearLayout, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34202y, 1, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.j6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.O, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34179b, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34179b, 8388608, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34185f, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34185f, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34185f, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20219w6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34181c, 32, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34181c, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34181c, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 32, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 32, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34180b0, 32, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34201x, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34183d0, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19953h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 4096, null, null, null, null, i12));
        int i18 = org.telegram.ui.ActionBar.j6.f19936g7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 8192, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        int i19 = org.telegram.ui.ActionBar.j6.f19954h7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 16384, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 4, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        int i20 = org.telegram.ui.ActionBar.j6.f20273z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 4, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34200w, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34200w, 8192, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34200w, 16384, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34200w, 4, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34200w, 4, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34201x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i14));
        int i21 = org.telegram.ui.ActionBar.j6.f20256y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34201x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34201x, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34201x, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, org.telegram.ui.ActionBar.j6.f20126r0, fVar, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 4, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20042m6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        kg.f fVar;
        super.onBecomeFullyVisible();
        if (this.f34191k0 && (fVar = this.f34177a) != null) {
            fVar.requestFocus();
            AndroidUtilities.showKeyboard(this.f34177a);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fp.onFragmentCreate():boolean");
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
        dg.u3 u3Var = this.h;
        if (u3Var != null) {
            u3Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i13);
        }
    }

    @Override
    public final void onResume() {
        String str;
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        TLRPC.ChatFull chatFull = this.V;
        if (chatFull != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
            this.f34189i0 = tL_chatInviteExported;
            org.telegram.ui.Components.x80 x80Var = this.D;
            if (tL_chatInviteExported == null) {
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            x80Var.setLink(str);
            this.D.c(this.f34189i0, this.W);
        }
    }
}
