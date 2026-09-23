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
public final class gp extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout E;
    public LinearLayout F;
    public org.telegram.ui.Components.w80 G;
    public org.telegram.ui.Cells.s8 H;
    public org.telegram.ui.Cells.f9 I;
    public org.telegram.ui.Cells.a7 J;
    public fp K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public na O;
    public ArrayList P;
    public LinearLayout Q;
    public org.telegram.ui.Cells.m4 R;
    public org.telegram.ui.Cells.x8 S;
    public org.telegram.ui.Cells.f9 T;
    public cp U;
    public boolean V;
    public boolean W;
    public TLRPC.Chat X;
    public TLRPC.ChatFull Y;
    public long Z;
    public ci.h2 f33603a;
    public boolean f33604a0;
    public EditTextBoldCursor f33605b;
    public boolean f33606b0;
    public org.telegram.ui.Cells.f9 f33607c;
    public boolean f33608c0;
    public org.telegram.ui.Cells.m4 d;
    public boolean f33609d0;
    public org.telegram.ui.Cells.m4 e;
    public org.telegram.ui.Cells.a7 f33610e0;
    public ap f33611f;
    public ArrayList f33612f0;
    public org.telegram.ui.Cells.s4 f33613g0;
    public xd h;
    public int f33614h0;
    public String f33615i0;
    public rh f33616j0;
    public boolean f33617k0;
    public TLRPC.TL_chatInviteExported f33618l0;
    public boolean m0;
    public org.telegram.ui.ActionBar.v0 f33619n;
    public boolean f33620n0;
    public HashMap f33621o0;
    public org.telegram.ui.Components.s60 f33622p0;
    public vo f33623q0;
    public org.telegram.ui.Components.qr f33624r;
    public ValueAnimator f33625r0;
    public LinearLayout f33626s;
    public Boolean f33627s0;
    public boolean f33628t0;
    public org.telegram.ui.Cells.j6 v;
    public org.telegram.ui.Cells.j6 f33629w;
    public LinearLayout f33630x;
    public LinearLayout f33631y;

    public final void V() {
        if (!this.V && this.f33603a.length() <= 0) {
            ArrayList arrayList = this.N;
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            this.f33619n.setEnabled(false);
            this.f33619n.setAlpha(0.5f);
            return;
        }
        this.f33619n.setEnabled(true);
        this.f33619n.setAlpha(1.0f);
    }

    public final boolean W(String str) {
        if (str != null && str.length() > 0) {
            this.f33611f.setVisibility(0);
        } else {
            this.f33611f.setVisibility(8);
        }
        rh rhVar = this.f33616j0;
        if (rhVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rhVar);
            this.f33616j0 = null;
            this.f33615i0 = null;
            if (this.f33614h0 != 0) {
                getConnectionsManager().cancelRequest(this.f33614h0, true);
            }
        }
        this.f33617k0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (this.f33604a0) {
                            this.f33611f.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                        } else {
                            this.f33611f.setText(LocaleController.getString(R.string.LinkInvalidStartNumberMega));
                        }
                        this.f33611f.setTextColorByKey(org.telegram.ui.ActionBar.h6.f19008p7);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.f33611f.setText(LocaleController.getString(R.string.LinkInvalid));
                        this.f33611f.setTextColorByKey(org.telegram.ui.ActionBar.h6.f19008p7);
                        return false;
                    }
                }
            } else {
                this.f33611f.setText(LocaleController.getString(R.string.LinkInvalid));
                this.f33611f.setTextColorByKey(org.telegram.ui.ActionBar.h6.f19008p7);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.f33611f.setText(LocaleController.getString(R.string.LinkInvalidLong));
                this.f33611f.setTextColorByKey(org.telegram.ui.ActionBar.h6.f19008p7);
                return false;
            }
            this.f33611f.setText(LocaleController.getString(R.string.LinkChecking));
            this.f33611f.setTextColorByKey(org.telegram.ui.ActionBar.h6.F6);
            this.f33615i0 = str;
            rh rhVar2 = new rh(9, this, str);
            this.f33616j0 = rhVar2;
            AndroidUtilities.runOnUIThread(rhVar2, 300L);
            return true;
        }
        if (this.f33604a0) {
            this.f33611f.setText(LocaleController.getString(R.string.LinkInvalidShort));
        } else {
            this.f33611f.setText(LocaleController.getString(R.string.LinkInvalidShortMega));
        }
        this.f33611f.setTextColorByKey(org.telegram.ui.ActionBar.h6.f19008p7);
        return false;
    }

    public final void X(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.Z);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ci.t3(6, this, z10)), this.classGuid);
    }

    public final void Y() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gp.Y():void");
    }

    public final void Z() {
        if (getParentActivity() == null) {
            return;
        }
        rg.j0 j0Var = new rg.j0(2, this.currentAccount, getParentActivity(), this, null);
        j0Var.f42281v0 = this.f33604a0;
        j0Var.H0 = new vo(this, 0);
        showDialog(j0Var);
    }

    public final void a0(boolean z10) {
        float f7;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.f33623q0);
        }
        if (this.f33624r != null) {
            ValueAnimator valueAnimator = this.f33625r0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f33624r.f27437c;
            float f11 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f33625r0 = ofFloat;
            ofFloat.addUpdateListener(new c3(this, 7));
            ValueAnimator valueAnimator2 = this.f33625r0;
            float f12 = this.f33624r.f27437c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.f33625r0.setInterpolator(org.telegram.ui.Components.rr.f27701f);
            this.f33625r0.start();
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
        if (!this.V && !this.f33608c0 && getUserConfig().isPremium()) {
            this.f33607c.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.f9 f9Var = this.f33607c;
            int i20 = org.telegram.ui.ActionBar.h6.f19008p7;
            f9Var.setTag(Integer.valueOf(i20));
            this.f33607c.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i20, false));
            this.f33631y.setVisibility(8);
            this.f33611f.setVisibility(8);
            this.J.setVisibility(8);
            this.f33610e0.setVisibility(0);
            if (this.f33609d0) {
                this.f33613g0.setVisibility(0);
                this.f33630x.setVisibility(8);
            } else {
                this.f33613g0.setVisibility(8);
                this.f33630x.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.f9 f9Var2 = this.f33607c;
            int i21 = org.telegram.ui.ActionBar.h6.B6;
            f9Var2.setTag(Integer.valueOf(i21));
            this.f33607c.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i21, false));
            if (this.f33620n0) {
                this.J.setVisibility(8);
            } else {
                this.J.setVisibility(0);
            }
            this.f33610e0.setVisibility(8);
            this.f33630x.setVisibility(8);
            this.f33631y.setVisibility(0);
            this.f33613g0.setVisibility(8);
            if (this.f33604a0) {
                org.telegram.ui.Cells.f9 f9Var3 = this.f33607c;
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
                org.telegram.ui.Cells.f9 f9Var4 = this.f33607c;
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
            LinearLayout linearLayout3 = this.f33631y;
            if (this.V) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.w80 w80Var = this.G;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f33618l0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            w80Var.setLink(str);
            this.G.c(this.f33618l0, this.Z);
            ap apVar = this.f33611f;
            if (!this.V && apVar.f20052a.length() != 0) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            apVar.setVisibility(i14);
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
        this.f33629w.a(this.V);
        this.f33603a.clearFocus();
        cp cpVar = this.U;
        if (cpVar != null) {
            if (this.f33604a0 && !this.V) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            cpVar.setVisibility(i18);
            cp cpVar2 = this.U;
            TLRPC.ChatFull chatFull2 = this.Y;
            cpVar2.c((chatFull2 == null || chatFull2.linked_chat_id == 0 || this.f33604a0) ? false : false);
        }
        fp fpVar = this.K;
        if (fpVar != null) {
            if (!this.V && !this.N.isEmpty()) {
                i19 = 0;
            }
            fpVar.setVisibility(i19);
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
        this.actionBar.setActionBarMenuOnItemClick(new po(this, 1));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i13 = org.telegram.ui.ActionBar.h6.f19120v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i13, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.qr qrVar = new org.telegram.ui.Components.qr(mutate, new org.telegram.ui.Components.up(org.telegram.ui.ActionBar.h6.w0(null, i13, false)));
        this.f33624r = qrVar;
        this.f33619n = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), qrVar);
        this.h = new xd(context);
        yo yoVar = new yo(this, context, this.h, this.resourceProvider);
        this.fragmentView = yoVar;
        yoVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18733a7, false));
        org.telegram.ui.Components.zn0 zn0Var = (org.telegram.ui.Components.zn0) this.fragmentView;
        zn0Var.setFillViewport(true);
        zn0Var.addView(this.h, new FrameLayout.LayoutParams(-1, -2));
        this.actionBar.setAdaptiveBackground(zn0Var);
        this.h.setOrientation(1);
        boolean z11 = this.f33620n0;
        if (z11) {
            this.actionBar.setTitle(LocaleController.getString(R.string.TypeLocationGroup));
        } else if (this.f33604a0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSettingsTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.GroupSettingsTitle));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f33626s = linearLayout;
        linearLayout.setOrientation(1);
        this.h.addView(this.f33626s, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
        this.e = m4Var;
        m4Var.setHeight(46);
        if (this.f33604a0) {
            this.e.setText(LocaleController.getString(R.string.ChannelTypeHeader));
        } else {
            this.e.setText(LocaleController.getString(R.string.GroupTypeHeader));
        }
        this.f33626s.addView(this.e);
        org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, false);
        this.f33629w = j6Var;
        if (this.f33604a0) {
            j6Var.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, this.V);
        } else {
            j6Var.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, this.V);
        }
        this.f33626s.addView(this.f33629w, w7.x5.n(-1, -2));
        this.f33629w.setOnClickListener(new xo(this, 1));
        org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(context, false);
        this.v = j6Var2;
        if (this.f33604a0) {
            j6Var2.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !this.V);
        } else {
            j6Var2.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !this.V);
        }
        this.f33626s.addView(this.v, w7.x5.n(-1, -2));
        this.v.setOnClickListener(new xo(this, 2));
        org.telegram.ui.Cells.a7 a7Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
        this.J = a7Var;
        this.h.addView(a7Var, w7.x5.n(-1, -2));
        if (z11) {
            this.f33629w.setVisibility(8);
            this.v.setVisibility(8);
            this.J.setVisibility(8);
            this.e.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f33631y = linearLayout2;
        linearLayout2.setOrientation(1);
        this.h.addView(this.f33631y, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context, 23);
        this.d = m4Var2;
        this.f33631y.addView(m4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setOrientation(0);
        this.f33631y.addView(this.E, w7.x5.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f33605b = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().linkPrefix + "/");
        this.f33605b.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f33605b;
        int i14 = org.telegram.ui.ActionBar.h6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f33605b;
        int i15 = org.telegram.ui.ActionBar.h6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i15, false));
        this.f33605b.setMaxLines(1);
        this.f33605b.setLines(1);
        this.f33605b.setEnabled(false);
        this.f33605b.setBackground(null);
        this.f33605b.setPadding(0, 0, 0, 0);
        this.f33605b.setSingleLine(true);
        this.f33605b.setInputType(163840);
        this.f33605b.setImeOptions(6);
        this.E.addView(this.f33605b, w7.x5.n(-2, 36));
        ci.h2 h2Var = new ci.h2(this, context, 3);
        this.f33603a = h2Var;
        h2Var.setTextSize(1, 18.0f);
        this.f33603a.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
        this.f33603a.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i15, false));
        this.f33603a.setMaxLines(1);
        this.f33603a.setLines(1);
        this.f33603a.setBackground(null);
        this.f33603a.setPadding(0, 0, 0, 0);
        this.f33603a.setSingleLine(true);
        this.f33603a.setInputType(163872);
        this.f33603a.setImeOptions(6);
        this.f33603a.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
        this.f33603a.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i15, false));
        this.f33603a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f33603a.setCursorWidth(1.5f);
        this.E.addView(this.f33603a, w7.x5.n(-1, 36));
        this.f33603a.addTextChangedListener(new m0(this, 3));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.F = linearLayout4;
        linearLayout4.setOrientation(1);
        this.f33631y.addView(this.F, w7.x5.n(-1, -2));
        org.telegram.ui.Components.w80 w80Var = new org.telegram.ui.Components.w80(context, this, null, true, ChatObject.isChannel(this.X));
        this.G = w80Var;
        w80Var.setDelegate(new zo(this, context));
        this.G.d(0, null, false);
        this.F.addView(this.G);
        ap apVar = new ap(this, context, this.resourceProvider);
        this.f33611f = apVar;
        apVar.setBottomPadding(6);
        this.h.addView(this.f33611f, w7.x5.n(-2, -2));
        org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context, 12, this.resourceProvider);
        this.f33607c = f9Var;
        f9Var.setImportantForAccessibility(1);
        this.h.addView(this.f33607c, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.s4 s4Var = new org.telegram.ui.Cells.s4(context);
        this.f33613g0 = s4Var;
        this.h.addView(s4Var, w7.x5.n(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.f33630x = linearLayout5;
        linearLayout5.setOrientation(1);
        this.h.addView(this.f33630x, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.a7 a7Var2 = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
        this.f33610e0 = a7Var2;
        this.h.addView(a7Var2, w7.x5.n(-1, -2));
        xd xdVar = this.h;
        fp fpVar = new fp(this, context);
        this.K = fpVar;
        xdVar.addView(fpVar, w7.x5.n(-1, -2));
        fp fpVar2 = this.K;
        if (!this.V && !this.N.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        fpVar2.setVisibility(i10);
        org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
        this.H = s8Var;
        s8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ManageInviteLinks), false);
        this.H.setOnClickListener(new xo(this, 3));
        this.h.addView(this.H, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.f9 f9Var2 = new org.telegram.ui.Cells.f9(context, 12, this.resourceProvider);
        this.I = f9Var2;
        this.h.addView(f9Var2, w7.x5.n(-1, -2));
        cp cpVar = new cp(this, context, this.X, context);
        this.U = cpVar;
        TLRPC.ChatFull chatFull = this.Y;
        if (chatFull != null && chatFull.linked_chat_id != 0 && !this.f33604a0) {
            z10 = true;
        } else {
            z10 = false;
        }
        cpVar.c(z10);
        cp cpVar2 = this.U;
        TLRPC.ChatFull chatFull2 = this.Y;
        org.telegram.ui.Cells.f9 f9Var3 = cpVar2.e;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(cpVar2.f25842n);
        boolean isPublic = ChatObject.isPublic(cpVar2.f25842n);
        if (chatFull2 != null && chatFull2.guard_bot_id != 0) {
            String str = "@" + DialogObject.getPublicUsername(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(chatFull2.guard_bot_id)));
            if (isChannelAndNotMegaGroup) {
                i12 = R.string.ChannelSettingsJoinRequestInfoManagedBy;
            } else if (isPublic) {
                i12 = R.string.GroupPublicSettingsJoinRequestInfoManagedBy;
            } else {
                i12 = R.string.GroupPrivateSettingsJoinRequestInfoManagedBy;
            }
            f9Var3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i12, str), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.il, false), new org.telegram.ui.Components.oy(12, chatFull2, this)));
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
        this.Q.addView(this.R, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
        this.S = x8Var;
        x8Var.f(LocaleController.getString(R.string.RestrictSavingContent), this.f33606b0, false);
        this.S.setOnClickListener(new xo(this, 4));
        this.Q.addView(this.S, w7.x5.n(-1, -2));
        this.T = new org.telegram.ui.Cells.f9(context, 12, this.resourceProvider);
        if (this.f33604a0 && !ChatObject.isMegagroup(this.X)) {
            this.T.setText(LocaleController.getString(R.string.RestrictSavingContentInfoChannel));
        } else {
            this.T.setText(LocaleController.getString(R.string.RestrictSavingContentInfoGroup));
        }
        this.Q.addView(this.T, w7.x5.n(-1, -2));
        String publicUsername = ChatObject.getPublicUsername(this.X, true);
        if (!this.V && publicUsername != null) {
            this.m0 = true;
            this.f33603a.setText(publicUsername);
            this.f33603a.setSelection(publicUsername.length());
            this.m0 = false;
        }
        b0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f18084id == this.Z) {
                this.Y = chatFull;
                this.f33618l0 = chatFull.exported_invite;
                b0();
            }
        } else if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.Z) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
                if (c5Var != null && c5Var.getLastFragment() == this) {
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
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f18733a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19120v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19084t8));
        int i10 = org.telegram.ui.ActionBar.h6.f18753b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.J, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.h6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.f18878i6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4096, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.h6.f19008p7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4096, null, null, null, null, i12));
        int i14 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33603a, 4, null, null, null, null, i14));
        ci.h2 h2Var = this.f33603a;
        int i15 = org.telegram.ui.ActionBar.h6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(h2Var, 8388608, null, null, null, null, i15));
        LinearLayout linearLayout = this.f33626s;
        int i16 = org.telegram.ui.ActionBar.h6.f18789d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(linearLayout, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33631y, 1, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.h6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33605b, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33605b, 8388608, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33611f, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33611f, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33611f, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19136w6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33607c, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33607c, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33607c, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33610e0, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33630x, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33613g0, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f18860h6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 4096, null, null, null, null, i12));
        int i18 = org.telegram.ui.ActionBar.h6.f18844g7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        int i19 = org.telegram.ui.ActionBar.h6.f18861h7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        int i20 = org.telegram.ui.ActionBar.h6.f19189z6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33629w, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33629w, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33629w, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33629w, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33629w, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33630x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i14));
        int i21 = org.telegram.ui.ActionBar.h6.f19170y6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33630x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33630x, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33630x, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, org.telegram.ui.ActionBar.h6.f19038r0, eVar, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 4, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f18953m6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        ci.h2 h2Var;
        super.onBecomeFullyVisible();
        if (this.f33620n0 && (h2Var = this.f33603a) != null) {
            h2Var.requestFocus();
            AndroidUtilities.showKeyboard(this.f33603a);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gp.onFragmentCreate():boolean");
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
        xd xdVar = this.h;
        if (xdVar != null) {
            xdVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i13);
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
            this.f33618l0 = tL_chatInviteExported;
            org.telegram.ui.Components.w80 w80Var = this.G;
            if (tL_chatInviteExported == null) {
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            w80Var.setLink(str);
            this.G.c(this.f33618l0, this.Z);
        }
    }
}
