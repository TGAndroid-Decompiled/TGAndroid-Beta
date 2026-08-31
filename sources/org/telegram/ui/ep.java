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
public final class ep extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout B;
    public LinearLayout C;
    public org.telegram.ui.Components.y80 D;
    public org.telegram.ui.Cells.o8 E;
    public org.telegram.ui.Cells.a9 F;
    public org.telegram.ui.Cells.z6 G;
    public dp H;
    public boolean I;
    public ArrayList J;
    public ArrayList K;
    public ma L;
    public ArrayList M;
    public LinearLayout N;
    public org.telegram.ui.Cells.m4 O;
    public org.telegram.ui.Cells.s8 P;
    public org.telegram.ui.Cells.a9 Q;
    public zo R;
    public boolean S;
    public boolean T;
    public TLRPC.Chat U;
    public TLRPC.ChatFull V;
    public long W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public lg.f f36629a;
    public boolean f36630a0;
    public EditTextBoldCursor f36631b;
    public org.telegram.ui.Cells.z6 f36632b0;
    public org.telegram.ui.Cells.a9 f36633c;
    public ArrayList f36634c0;
    public org.telegram.ui.Cells.m4 d;
    public org.telegram.ui.Cells.s4 f36635d0;
    public org.telegram.ui.Cells.m4 f36636e;
    public int f36637e0;
    public xo f36638f;
    public String f36639f0;
    public fc f36640g0;
    public eg.s3 h;
    public boolean f36641h0;
    public TLRPC.TL_chatInviteExported f36642i0;
    public boolean f36643j0;
    public boolean f36644k0;
    public HashMap f36645l0;
    public org.telegram.ui.Components.u60 m0;
    public org.telegram.ui.ActionBar.w0 f36646n;
    public so f36647n0;
    public ValueAnimator f36648o0;
    public Boolean f36649p0;
    public boolean f36650q0;
    public org.telegram.ui.Components.or f36651r;
    public LinearLayout f36652s;
    public org.telegram.ui.Cells.i6 v;
    public org.telegram.ui.Cells.i6 f36653w;
    public LinearLayout f36654x;
    public LinearLayout f36655y;

    public final void V() {
        if (!this.S && this.f36629a.length() <= 0) {
            ArrayList arrayList = this.K;
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            this.f36646n.setEnabled(false);
            this.f36646n.setAlpha(0.5f);
            return;
        }
        this.f36646n.setEnabled(true);
        this.f36646n.setAlpha(1.0f);
    }

    public final boolean W(String str) {
        if (str != null && str.length() > 0) {
            this.f36638f.setVisibility(0);
        } else {
            this.f36638f.setVisibility(8);
        }
        fc fcVar = this.f36640g0;
        if (fcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(fcVar);
            this.f36640g0 = null;
            this.f36639f0 = null;
            if (this.f36637e0 != 0) {
                getConnectionsManager().cancelRequest(this.f36637e0, true);
            }
        }
        this.f36641h0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (this.X) {
                            this.f36638f.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                        } else {
                            this.f36638f.setText(LocaleController.getString(R.string.LinkInvalidStartNumberMega));
                        }
                        this.f36638f.setTextColorByKey(org.telegram.ui.ActionBar.k6.f21876p7);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.f36638f.setText(LocaleController.getString(R.string.LinkInvalid));
                        this.f36638f.setTextColorByKey(org.telegram.ui.ActionBar.k6.f21876p7);
                        return false;
                    }
                }
            } else {
                this.f36638f.setText(LocaleController.getString(R.string.LinkInvalid));
                this.f36638f.setTextColorByKey(org.telegram.ui.ActionBar.k6.f21876p7);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.f36638f.setText(LocaleController.getString(R.string.LinkInvalidLong));
                this.f36638f.setTextColorByKey(org.telegram.ui.ActionBar.k6.f21876p7);
                return false;
            }
            this.f36638f.setText(LocaleController.getString(R.string.LinkChecking));
            this.f36638f.setTextColorByKey(org.telegram.ui.ActionBar.k6.F6);
            this.f36639f0 = str;
            fc fcVar2 = new fc(26, this, str);
            this.f36640g0 = fcVar2;
            AndroidUtilities.runOnUIThread(fcVar2, 300L);
            return true;
        }
        if (this.X) {
            this.f36638f.setText(LocaleController.getString(R.string.LinkInvalidShort));
        } else {
            this.f36638f.setText(LocaleController.getString(R.string.LinkInvalidShortMega));
        }
        this.f36638f.setTextColorByKey(org.telegram.ui.ActionBar.k6.f21876p7);
        return false;
    }

    public final void X(boolean z4) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.W);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new org.telegram.messenger.zd(5, this, z4)), this.classGuid);
    }

    public final void Y() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ep.Y():void");
    }

    public final void Z() {
        if (getParentActivity() == null) {
            return;
        }
        fg.v0 v0Var = new fg.v0(2, this.currentAccount, getParentActivity(), this, null);
        v0Var.f6598s0 = this.X;
        v0Var.E0 = new so(this, 0);
        showDialog(v0Var);
    }

    public final void a0(boolean z4) {
        float f10;
        if (!z4) {
            AndroidUtilities.cancelRunOnUIThread(this.f36647n0);
        }
        if (this.f36651r != null) {
            ValueAnimator valueAnimator = this.f36648o0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f36651r.f29840c;
            float f12 = 0.0f;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f36648o0 = ofFloat;
            ofFloat.addUpdateListener(new e3(this, 7));
            ValueAnimator valueAnimator2 = this.f36648o0;
            float f13 = this.f36651r.f29840c;
            if (z4) {
                f12 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f13 - f12) * 200.0f);
            this.f36648o0.setInterpolator(org.telegram.ui.Components.pr.f30183f);
            this.f36648o0.start();
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
            this.f36633c.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.a9 a9Var = this.f36633c;
            int i20 = org.telegram.ui.ActionBar.k6.f21876p7;
            a9Var.setTag(Integer.valueOf(i20));
            this.f36633c.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i20, false));
            this.f36655y.setVisibility(8);
            this.f36638f.setVisibility(8);
            this.G.setVisibility(8);
            this.f36632b0.setVisibility(0);
            if (this.f36630a0) {
                this.f36635d0.setVisibility(0);
                this.f36654x.setVisibility(8);
            } else {
                this.f36635d0.setVisibility(8);
                this.f36654x.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.a9 a9Var2 = this.f36633c;
            int i21 = org.telegram.ui.ActionBar.k6.B6;
            a9Var2.setTag(Integer.valueOf(i21));
            this.f36633c.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i21, false));
            if (this.f36644k0) {
                this.G.setVisibility(8);
            } else {
                this.G.setVisibility(0);
            }
            this.f36632b0.setVisibility(8);
            this.f36654x.setVisibility(8);
            this.f36655y.setVisibility(0);
            this.f36635d0.setVisibility(8);
            if (this.X) {
                org.telegram.ui.Cells.a9 a9Var3 = this.f36633c;
                if (this.S) {
                    i16 = R.string.ChannelPrivateLinkHelp;
                } else {
                    i16 = R.string.ChannelUsernameHelp;
                }
                a9Var3.setText(LocaleController.getString(i16));
                org.telegram.ui.Cells.m4 m4Var = this.d;
                if (this.S) {
                    i17 = R.string.ChannelInviteLinkTitle;
                } else {
                    i17 = R.string.ChannelLinkTitle;
                }
                m4Var.setText(LocaleController.getString(i17));
            } else {
                org.telegram.ui.Cells.a9 a9Var4 = this.f36633c;
                if (this.S) {
                    i10 = R.string.MegaPrivateLinkHelp;
                } else {
                    i10 = R.string.MegaUsernameHelp;
                }
                a9Var4.setText(LocaleController.getString(i10));
                org.telegram.ui.Cells.m4 m4Var2 = this.d;
                if (this.S) {
                    i11 = R.string.ChannelInviteLinkTitle;
                } else {
                    i11 = R.string.ChannelLinkTitle;
                }
                m4Var2.setText(LocaleController.getString(i11));
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
            LinearLayout linearLayout3 = this.f36655y;
            if (this.S) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.y80 y80Var = this.D;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f36642i0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            y80Var.setLink(str);
            this.D.c(this.f36642i0, this.W);
            xo xoVar = this.f36638f;
            if (!this.S && xoVar.f22558a.length() != 0) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            xoVar.setVisibility(i14);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.W);
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.W));
            org.telegram.ui.Cells.a9 a9Var5 = this.F;
            if (chatFull != null && chatFull.paid_media_allowed && ChatObject.isChannelAndNotMegaGroup(chat)) {
                i15 = R.string.ManageLinksInfoHelpPaid;
            } else {
                i15 = R.string.ManageLinksInfoHelp;
            }
            a9Var5.setText(LocaleController.getString(i15));
        }
        boolean z4 = true;
        this.v.a(!this.S);
        this.f36653w.a(this.S);
        this.f36629a.clearFocus();
        zo zoVar = this.R;
        if (zoVar != null) {
            if (this.X && !this.S) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            zoVar.setVisibility(i18);
            zo zoVar2 = this.R;
            TLRPC.ChatFull chatFull2 = this.V;
            zoVar2.c((chatFull2 == null || chatFull2.linked_chat_id == 0 || this.X) ? false : false);
        }
        dp dpVar = this.H;
        if (dpVar != null) {
            if (!this.S && !this.K.isEmpty()) {
                i19 = 0;
            }
            dpVar.setVisibility(i19);
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
        this.actionBar.setActionBarMenuOnItemClick(new fg.l1(this, 18));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i13 = org.telegram.ui.ActionBar.k6.f21981v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i13, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.or orVar = new org.telegram.ui.Components.or(mutate, new org.telegram.ui.Components.tp(org.telegram.ui.ActionBar.k6.w0(null, i13, false)));
        this.f36651r = orVar;
        this.f36646n = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), orVar);
        this.h = new eg.s3(context);
        vo voVar = new vo(this, context, this.h, this.resourceProvider);
        this.fragmentView = voVar;
        voVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false));
        org.telegram.ui.Components.fo0 fo0Var = (org.telegram.ui.Components.fo0) this.fragmentView;
        fo0Var.setFillViewport(true);
        fo0Var.addView(this.h, new FrameLayout.LayoutParams(-1, -2));
        this.actionBar.setAdaptiveBackground(fo0Var);
        this.h.setOrientation(1);
        boolean z10 = this.f36644k0;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.TypeLocationGroup));
        } else if (this.X) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSettingsTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.GroupSettingsTitle));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f36652s = linearLayout;
        linearLayout.setOrientation(1);
        this.h.addView(this.f36652s, k7.c6.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
        this.f36636e = m4Var;
        m4Var.setHeight(46);
        if (this.X) {
            this.f36636e.setText(LocaleController.getString(R.string.ChannelTypeHeader));
        } else {
            this.f36636e.setText(LocaleController.getString(R.string.GroupTypeHeader));
        }
        this.f36652s.addView(this.f36636e);
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, false);
        this.f36653w = i6Var;
        if (this.X) {
            i6Var.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, this.S);
        } else {
            i6Var.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, this.S);
        }
        this.f36652s.addView(this.f36653w, k7.c6.n(-1, -2));
        this.f36653w.setOnClickListener(new uo(this, 1));
        org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(context, false);
        this.v = i6Var2;
        if (this.X) {
            i6Var2.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !this.S);
        } else {
            i6Var2.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !this.S);
        }
        this.f36652s.addView(this.v, k7.c6.n(-1, -2));
        this.v.setOnClickListener(new uo(this, 2));
        org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (b) null);
        this.G = z6Var;
        this.h.addView(z6Var, k7.c6.n(-1, -2));
        if (z10) {
            this.f36653w.setVisibility(8);
            this.v.setVisibility(8);
            this.G.setVisibility(8);
            this.f36636e.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f36655y = linearLayout2;
        linearLayout2.setOrientation(1);
        this.h.addView(this.f36655y, k7.c6.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context, 23);
        this.d = m4Var2;
        this.f36655y.addView(m4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.B = linearLayout3;
        linearLayout3.setOrientation(0);
        this.f36655y.addView(this.B, k7.c6.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f36631b = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().linkPrefix + "/");
        this.f36631b.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f36631b;
        int i14 = org.telegram.ui.ActionBar.k6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f36631b;
        int i15 = org.telegram.ui.ActionBar.k6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
        this.f36631b.setMaxLines(1);
        this.f36631b.setLines(1);
        this.f36631b.setEnabled(false);
        this.f36631b.setBackground(null);
        this.f36631b.setPadding(0, 0, 0, 0);
        this.f36631b.setSingleLine(true);
        this.f36631b.setInputType(163840);
        this.f36631b.setImeOptions(6);
        this.B.addView(this.f36631b, k7.c6.n(-2, 36));
        lg.f fVar = new lg.f(this, context, 2);
        this.f36629a = fVar;
        fVar.setTextSize(1, 18.0f);
        this.f36629a.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        this.f36629a.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
        this.f36629a.setMaxLines(1);
        this.f36629a.setLines(1);
        this.f36629a.setBackground(null);
        this.f36629a.setPadding(0, 0, 0, 0);
        this.f36629a.setSingleLine(true);
        this.f36629a.setInputType(163872);
        this.f36629a.setImeOptions(6);
        this.f36629a.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
        this.f36629a.setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
        this.f36629a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f36629a.setCursorWidth(1.5f);
        this.B.addView(this.f36629a, k7.c6.n(-1, 36));
        this.f36629a.addTextChangedListener(new n0(this, 3));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.C = linearLayout4;
        linearLayout4.setOrientation(1);
        this.f36655y.addView(this.C, k7.c6.n(-1, -2));
        org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(context, this, null, true, ChatObject.isChannel(this.U));
        this.D = y80Var;
        y80Var.setDelegate(new wo(this, context));
        this.D.d(0, null, false);
        this.C.addView(this.D);
        xo xoVar = new xo(this, context, this.resourceProvider);
        this.f36638f = xoVar;
        xoVar.setBottomPadding(6);
        this.h.addView(this.f36638f, k7.c6.n(-2, -2));
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context, 12, this.resourceProvider);
        this.f36633c = a9Var;
        a9Var.setImportantForAccessibility(1);
        this.h.addView(this.f36633c, k7.c6.n(-1, -2));
        org.telegram.ui.Cells.s4 s4Var = new org.telegram.ui.Cells.s4(context);
        this.f36635d0 = s4Var;
        this.h.addView(s4Var, k7.c6.n(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.f36654x = linearLayout5;
        linearLayout5.setOrientation(1);
        this.h.addView(this.f36654x, k7.c6.n(-1, -2));
        org.telegram.ui.Cells.z6 z6Var2 = new org.telegram.ui.Cells.z6(context, (b) null);
        this.f36632b0 = z6Var2;
        this.h.addView(z6Var2, k7.c6.n(-1, -2));
        eg.s3 s3Var = this.h;
        dp dpVar = new dp(this, context);
        this.H = dpVar;
        s3Var.addView(dpVar, k7.c6.n(-1, -2));
        dp dpVar2 = this.H;
        if (!this.S && !this.K.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        dpVar2.setVisibility(i10);
        org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(context);
        this.E = o8Var;
        o8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ManageInviteLinks), false);
        this.E.setOnClickListener(new uo(this, 3));
        this.h.addView(this.E, k7.c6.n(-1, -2));
        org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context, 12, this.resourceProvider);
        this.F = a9Var2;
        this.h.addView(a9Var2, k7.c6.n(-1, -2));
        zo zoVar = new zo(this, context, this.U, context);
        this.R = zoVar;
        TLRPC.ChatFull chatFull = this.V;
        if (chatFull != null && chatFull.linked_chat_id != 0 && !this.X) {
            z4 = true;
        } else {
            z4 = false;
        }
        zoVar.c(z4);
        zo zoVar2 = this.R;
        TLRPC.ChatFull chatFull2 = this.V;
        org.telegram.ui.Cells.a9 a9Var3 = zoVar2.f29427e;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(zoVar2.f29429n);
        boolean isPublic = ChatObject.isPublic(zoVar2.f29429n);
        if (chatFull2 != null && chatFull2.guard_bot_id != 0) {
            String str = "@" + DialogObject.getPublicUsername(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(chatFull2.guard_bot_id)));
            if (isChannelAndNotMegaGroup) {
                i12 = R.string.ChannelSettingsJoinRequestInfoManagedBy;
            } else if (isPublic) {
                i12 = R.string.GroupPublicSettingsJoinRequestInfoManagedBy;
            } else {
                i12 = R.string.GroupPrivateSettingsJoinRequestInfoManagedBy;
            }
            a9Var3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i12, str), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.il, false), new org.telegram.ui.Components.gm(29, chatFull2, this)));
        } else {
            if (isChannelAndNotMegaGroup) {
                i11 = R.string.ChannelSettingsJoinRequestInfo2;
            } else if (isPublic) {
                i11 = R.string.GroupPublicSettingsJoinRequestInfo2;
            } else {
                i11 = R.string.GroupPrivateSettingsJoinRequestInfo2;
            }
            a9Var3.setText(LocaleController.getString(i11));
        }
        this.h.addView(this.R);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.N = linearLayout6;
        linearLayout6.setOrientation(1);
        this.h.addView(this.N);
        org.telegram.ui.Cells.m4 m4Var3 = new org.telegram.ui.Cells.m4(context, 23);
        this.O = m4Var3;
        m4Var3.setHeight(46);
        this.O.setText(LocaleController.getString(R.string.SavingContentTitle));
        this.N.addView(this.O, k7.c6.n(-1, -2));
        org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
        this.P = s8Var;
        s8Var.f(LocaleController.getString(R.string.RestrictSavingContent), this.Y, false);
        this.P.setOnClickListener(new uo(this, 4));
        this.N.addView(this.P, k7.c6.n(-1, -2));
        this.Q = new org.telegram.ui.Cells.a9(context, 12, this.resourceProvider);
        if (this.X && !ChatObject.isMegagroup(this.U)) {
            this.Q.setText(LocaleController.getString(R.string.RestrictSavingContentInfoChannel));
        } else {
            this.Q.setText(LocaleController.getString(R.string.RestrictSavingContentInfoGroup));
        }
        this.N.addView(this.Q, k7.c6.n(-1, -2));
        String publicUsername = ChatObject.getPublicUsername(this.U, true);
        if (!this.S && publicUsername != null) {
            this.f36643j0 = true;
            this.f36629a.setText(publicUsername);
            this.f36629a.setSelection(publicUsername.length());
            this.f36643j0 = false;
        }
        b0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f20844id == this.W) {
                this.V = chatFull;
                this.f36642i0 = chatFull.exported_invite;
                b0();
            }
        } else if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.W) == ((Long) objArr[0]).longValue()) {
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
        f fVar = new f(this, 6);
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21605a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21981v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21946t8));
        int i10 = org.telegram.ui.ActionBar.k6.f21624b7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.G, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.f21750i6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 4096, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.k6.f21876p7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 4, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 4096, null, null, null, null, i12));
        int i14 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 4, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36629a, 4, null, null, null, null, i14));
        lg.f fVar2 = this.f36629a;
        int i15 = org.telegram.ui.ActionBar.k6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(fVar2, 8388608, null, null, null, null, i15));
        LinearLayout linearLayout = this.f36652s;
        int i16 = org.telegram.ui.ActionBar.k6.f21659d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(linearLayout, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36655y, 1, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.k6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36636e, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.O, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36631b, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36631b, 8388608, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36638f, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36638f, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36638f, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21998w6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36633c, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36633c, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36633c, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.F, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.F, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.F, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Q, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Q, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Q, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36632b0, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36654x, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36635d0, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21732h6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.v, 4096, null, null, null, null, i12));
        int i18 = org.telegram.ui.ActionBar.k6.f21715g7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.v, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        int i19 = org.telegram.ui.ActionBar.k6.f21733h7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.v, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.v, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        int i20 = org.telegram.ui.ActionBar.k6.f22053z6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.v, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36653w, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36653w, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36653w, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36653w, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36653w, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36654x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i14));
        int i21 = org.telegram.ui.ActionBar.k6.f22036y6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36654x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36654x, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36654x, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, org.telegram.ui.ActionBar.k6.f21906r0, fVar, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.E, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.E, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.E, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21821m6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        lg.f fVar;
        super.onBecomeFullyVisible();
        if (this.f36644k0 && (fVar = this.f36629a) != null) {
            fVar.requestFocus();
            AndroidUtilities.showKeyboard(this.f36629a);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ep.onFragmentCreate():boolean");
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
        eg.s3 s3Var = this.h;
        if (s3Var != null) {
            s3Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i13);
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
            this.f36642i0 = tL_chatInviteExported;
            org.telegram.ui.Components.y80 y80Var = this.D;
            if (tL_chatInviteExported == null) {
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            y80Var.setLink(str);
            this.D.c(this.f36642i0, this.W);
        }
    }
}
