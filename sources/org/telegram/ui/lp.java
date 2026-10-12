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
public final class lp extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout E;
    public LinearLayout F;
    public org.telegram.ui.Components.ba0 G;
    public org.telegram.ui.Cells.r8 H;
    public org.telegram.ui.Cells.e9 I;
    public org.telegram.ui.Cells.a7 J;
    public kp K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public ra O;
    public ArrayList P;
    public LinearLayout Q;
    public org.telegram.ui.Cells.m4 R;
    public org.telegram.ui.Cells.w8 S;
    public org.telegram.ui.Cells.e9 T;
    public hp U;
    public boolean V;
    public boolean W;
    public TLRPC.Chat X;
    public TLRPC.ChatFull Y;
    public long Z;
    public ci.g2 f39800a;
    public boolean f39801a0;
    public EditTextBoldCursor f39802b;
    public boolean f39803b0;
    public org.telegram.ui.Cells.e9 f39804c;
    public boolean f39805c0;
    public org.telegram.ui.Cells.m4 d;
    public boolean f39806d0;
    public org.telegram.ui.Cells.m4 f39807e;
    public org.telegram.ui.Cells.a7 f39808e0;
    public fp f39809f;
    public ArrayList f39810f0;
    public org.telegram.ui.Cells.s4 f39811g0;
    public ce h;
    public int f39812h0;
    public String f39813i0;
    public nh f39814j0;
    public boolean f39815k0;
    public TLRPC.TL_chatInviteExported f39816l0;
    public boolean m0;
    public org.telegram.ui.ActionBar.u0 f39817n;
    public boolean f39818n0;
    public HashMap f39819o0;
    public org.telegram.ui.Components.w70 f39820p0;
    public ap f39821q0;
    public org.telegram.ui.Components.is f39822r;
    public ValueAnimator f39823r0;
    public LinearLayout f39824s;
    public Boolean f39825s0;
    public boolean f39826t0;
    public org.telegram.ui.Cells.j6 v;
    public org.telegram.ui.Cells.j6 f39827w;
    public LinearLayout f39828x;
    public LinearLayout f39829y;

    public final void V() {
        if (!this.V && this.f39800a.length() <= 0) {
            ArrayList arrayList = this.N;
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            this.f39817n.setEnabled(false);
            this.f39817n.setAlpha(0.5f);
            return;
        }
        this.f39817n.setEnabled(true);
        this.f39817n.setAlpha(1.0f);
    }

    public final boolean W(String str) {
        if (str != null && str.length() > 0) {
            this.f39809f.setVisibility(0);
        } else {
            this.f39809f.setVisibility(8);
        }
        nh nhVar = this.f39814j0;
        if (nhVar != null) {
            AndroidUtilities.cancelRunOnUIThread(nhVar);
            this.f39814j0 = null;
            this.f39813i0 = null;
            if (this.f39812h0 != 0) {
                getConnectionsManager().cancelRequest(this.f39812h0, true);
            }
        }
        this.f39815k0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (this.f39801a0) {
                            this.f39809f.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                        } else {
                            this.f39809f.setText(LocaleController.getString(R.string.LinkInvalidStartNumberMega));
                        }
                        this.f39809f.setTextColorByKey(org.telegram.ui.ActionBar.h6.f20781p7);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.f39809f.setText(LocaleController.getString(R.string.LinkInvalid));
                        this.f39809f.setTextColorByKey(org.telegram.ui.ActionBar.h6.f20781p7);
                        return false;
                    }
                }
            } else {
                this.f39809f.setText(LocaleController.getString(R.string.LinkInvalid));
                this.f39809f.setTextColorByKey(org.telegram.ui.ActionBar.h6.f20781p7);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.f39809f.setText(LocaleController.getString(R.string.LinkInvalidLong));
                this.f39809f.setTextColorByKey(org.telegram.ui.ActionBar.h6.f20781p7);
                return false;
            }
            this.f39809f.setText(LocaleController.getString(R.string.LinkChecking));
            this.f39809f.setTextColorByKey(org.telegram.ui.ActionBar.h6.F6);
            this.f39813i0 = str;
            nh nhVar2 = new nh(14, this, str);
            this.f39814j0 = nhVar2;
            AndroidUtilities.runOnUIThread(nhVar2, 300L);
            return true;
        }
        if (this.f39801a0) {
            this.f39809f.setText(LocaleController.getString(R.string.LinkInvalidShort));
        } else {
            this.f39809f.setText(LocaleController.getString(R.string.LinkInvalidShortMega));
        }
        this.f39809f.setTextColorByKey(org.telegram.ui.ActionBar.h6.f20781p7);
        return false;
    }

    public final void X(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.Z);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ci.s3(6, this, z10)), this.classGuid);
    }

    public final void Y() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lp.Y():void");
    }

    public final void Z() {
        if (getParentActivity() == null) {
            return;
        }
        rg.j0 j0Var = new rg.j0(2, this.currentAccount, getParentActivity(), this, null);
        j0Var.f47516v0 = this.f39801a0;
        j0Var.H0 = new ap(this, 0);
        showDialog(j0Var);
    }

    public final void a0(boolean z10) {
        float f7;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.f39821q0);
        }
        if (this.f39822r != null) {
            ValueAnimator valueAnimator = this.f39823r0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f39822r.f27268c;
            float f11 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f39823r0 = ofFloat;
            ofFloat.addUpdateListener(new c3(this, 7));
            ValueAnimator valueAnimator2 = this.f39823r0;
            float f12 = this.f39822r.f27268c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.f39823r0.setInterpolator(org.telegram.ui.Components.js.f27634f);
            this.f39823r0.start();
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
        if (!this.V && !this.f39805c0 && getUserConfig().isPremium()) {
            this.f39804c.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.e9 e9Var = this.f39804c;
            int i20 = org.telegram.ui.ActionBar.h6.f20781p7;
            e9Var.setTag(Integer.valueOf(i20));
            this.f39804c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i20, false));
            this.f39829y.setVisibility(8);
            this.f39809f.setVisibility(8);
            this.J.setVisibility(8);
            this.f39808e0.setVisibility(0);
            if (this.f39806d0) {
                this.f39811g0.setVisibility(0);
                this.f39828x.setVisibility(8);
            } else {
                this.f39811g0.setVisibility(8);
                this.f39828x.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var2 = this.f39804c;
            int i21 = org.telegram.ui.ActionBar.h6.B6;
            e9Var2.setTag(Integer.valueOf(i21));
            this.f39804c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i21, false));
            if (this.f39818n0) {
                this.J.setVisibility(8);
            } else {
                this.J.setVisibility(0);
            }
            this.f39808e0.setVisibility(8);
            this.f39828x.setVisibility(8);
            this.f39829y.setVisibility(0);
            this.f39811g0.setVisibility(8);
            if (this.f39801a0) {
                org.telegram.ui.Cells.e9 e9Var3 = this.f39804c;
                if (this.V) {
                    i16 = R.string.ChannelPrivateLinkHelp;
                } else {
                    i16 = R.string.ChannelUsernameHelp;
                }
                e9Var3.setText(LocaleController.getString(i16));
                org.telegram.ui.Cells.m4 m4Var = this.d;
                if (this.V) {
                    i17 = R.string.ChannelInviteLinkTitle;
                } else {
                    i17 = R.string.ChannelLinkTitle;
                }
                m4Var.setText(LocaleController.getString(i17));
            } else {
                org.telegram.ui.Cells.e9 e9Var4 = this.f39804c;
                if (this.V) {
                    i10 = R.string.MegaPrivateLinkHelp;
                } else {
                    i10 = R.string.MegaUsernameHelp;
                }
                e9Var4.setText(LocaleController.getString(i10));
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
            LinearLayout linearLayout3 = this.f39829y;
            if (this.V) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.ba0 ba0Var = this.G;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f39816l0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            ba0Var.setLink(str);
            this.G.c(this.f39816l0, this.Z);
            fp fpVar = this.f39809f;
            if (!this.V && fpVar.f21811a.length() != 0) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            fpVar.setVisibility(i14);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.Z);
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.Z));
            org.telegram.ui.Cells.e9 e9Var5 = this.I;
            if (chatFull != null && chatFull.paid_media_allowed && ChatObject.isChannelAndNotMegaGroup(chat)) {
                i15 = R.string.ManageLinksInfoHelpPaid;
            } else {
                i15 = R.string.ManageLinksInfoHelp;
            }
            e9Var5.setText(LocaleController.getString(i15));
        }
        boolean z10 = true;
        this.v.a(!this.V);
        this.f39827w.a(this.V);
        this.f39800a.clearFocus();
        hp hpVar = this.U;
        if (hpVar != null) {
            if (this.f39801a0 && !this.V) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            hpVar.setVisibility(i18);
            hp hpVar2 = this.U;
            TLRPC.ChatFull chatFull2 = this.Y;
            if (chatFull2 == null || chatFull2.linked_chat_id == 0 || this.f39801a0) {
                z10 = false;
            }
            hpVar2.c(z10);
        }
        kp kpVar = this.K;
        if (kpVar != null) {
            if (!this.V && !this.N.isEmpty()) {
                i19 = 0;
            }
            kpVar.setVisibility(i19);
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
        this.actionBar.setActionBarMenuOnItemClick(new lc(this, 2));
        org.telegram.ui.ActionBar.y p5 = this.actionBar.p();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i13 = org.telegram.ui.ActionBar.h6.f20895v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i13, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.is isVar = new org.telegram.ui.Components.is(mutate, new org.telegram.ui.Components.lq(org.telegram.ui.ActionBar.h6.x0(null, i13, false)));
        this.f39822r = isVar;
        this.f39817n = p5.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), isVar);
        this.h = new ce(context);
        dp dpVar = new dp(this, context, this.h, this.resourceProvider);
        this.fragmentView = dpVar;
        dpVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20504a7, false));
        org.telegram.ui.Components.kp0 kp0Var = (org.telegram.ui.Components.kp0) this.fragmentView;
        kp0Var.setFillViewport(true);
        kp0Var.addView(this.h, new FrameLayout.LayoutParams(-1, -2));
        this.actionBar.setAdaptiveBackground(kp0Var);
        this.h.setOrientation(1);
        boolean z11 = this.f39818n0;
        if (z11) {
            this.actionBar.setTitle(LocaleController.getString(R.string.TypeLocationGroup));
        } else if (this.f39801a0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSettingsTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.GroupSettingsTitle));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f39824s = linearLayout;
        linearLayout.setOrientation(1);
        this.h.addView(this.f39824s, w7.w5.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
        this.f39807e = m4Var;
        m4Var.setHeight(46);
        if (this.f39801a0) {
            this.f39807e.setText(LocaleController.getString(R.string.ChannelTypeHeader));
        } else {
            this.f39807e.setText(LocaleController.getString(R.string.GroupTypeHeader));
        }
        this.f39824s.addView(this.f39807e);
        org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, false);
        this.f39827w = j6Var;
        if (this.f39801a0) {
            j6Var.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, this.V);
        } else {
            j6Var.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, this.V);
        }
        this.f39824s.addView(this.f39827w, w7.w5.n(-1, -2));
        this.f39827w.setOnClickListener(new cp(this, 1));
        org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(context, false);
        this.v = j6Var2;
        if (this.f39801a0) {
            j6Var2.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !this.V);
        } else {
            j6Var2.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !this.V);
        }
        this.f39824s.addView(this.v, w7.w5.n(-1, -2));
        this.v.setOnClickListener(new cp(this, 2));
        org.telegram.ui.Cells.a7 a7Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
        this.J = a7Var;
        this.h.addView(a7Var, w7.w5.n(-1, -2));
        if (z11) {
            this.f39827w.setVisibility(8);
            this.v.setVisibility(8);
            this.J.setVisibility(8);
            this.f39807e.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f39829y = linearLayout2;
        linearLayout2.setOrientation(1);
        this.h.addView(this.f39829y, w7.w5.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context, 23);
        this.d = m4Var2;
        this.f39829y.addView(m4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setOrientation(0);
        this.f39829y.addView(this.E, w7.w5.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f39802b = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().linkPrefix + "/");
        this.f39802b.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f39802b;
        int i14 = org.telegram.ui.ActionBar.h6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f39802b;
        int i15 = org.telegram.ui.ActionBar.h6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
        this.f39802b.setMaxLines(1);
        this.f39802b.setLines(1);
        this.f39802b.setEnabled(false);
        this.f39802b.setBackground(null);
        this.f39802b.setPadding(0, 0, 0, 0);
        this.f39802b.setSingleLine(true);
        this.f39802b.setInputType(163840);
        this.f39802b.setImeOptions(6);
        this.E.addView(this.f39802b, w7.w5.n(-2, 36));
        ci.g2 g2Var = new ci.g2(this, context, 3);
        this.f39800a = g2Var;
        g2Var.setTextSize(1, 18.0f);
        this.f39800a.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        this.f39800a.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
        this.f39800a.setMaxLines(1);
        this.f39800a.setLines(1);
        this.f39800a.setBackground(null);
        this.f39800a.setPadding(0, 0, 0, 0);
        this.f39800a.setSingleLine(true);
        this.f39800a.setInputType(163872);
        this.f39800a.setImeOptions(6);
        this.f39800a.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
        this.f39800a.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
        this.f39800a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f39800a.setCursorWidth(1.5f);
        this.E.addView(this.f39800a, w7.w5.n(-1, 36));
        this.f39800a.addTextChangedListener(new m0(this, 3));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.F = linearLayout4;
        linearLayout4.setOrientation(1);
        this.f39829y.addView(this.F, w7.w5.n(-1, -2));
        org.telegram.ui.Components.ba0 ba0Var = new org.telegram.ui.Components.ba0(context, this, null, true, ChatObject.isChannel(this.X));
        this.G = ba0Var;
        ba0Var.setDelegate(new ep(this, context));
        this.G.d(0, null, false);
        this.F.addView(this.G);
        fp fpVar = new fp(this, context, this.resourceProvider);
        this.f39809f = fpVar;
        fpVar.setBottomPadding(6);
        this.h.addView(this.f39809f, w7.w5.n(-2, -2));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.f39804c = e9Var;
        e9Var.setImportantForAccessibility(1);
        this.h.addView(this.f39804c, w7.w5.n(-1, -2));
        org.telegram.ui.Cells.s4 s4Var = new org.telegram.ui.Cells.s4(context);
        this.f39811g0 = s4Var;
        this.h.addView(s4Var, w7.w5.n(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.f39828x = linearLayout5;
        linearLayout5.setOrientation(1);
        this.h.addView(this.f39828x, w7.w5.n(-1, -2));
        org.telegram.ui.Cells.a7 a7Var2 = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
        this.f39808e0 = a7Var2;
        this.h.addView(a7Var2, w7.w5.n(-1, -2));
        ce ceVar = this.h;
        kp kpVar = new kp(this, context);
        this.K = kpVar;
        ceVar.addView(kpVar, w7.w5.n(-1, -2));
        kp kpVar2 = this.K;
        if (!this.V && !this.N.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        kpVar2.setVisibility(i10);
        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
        this.H = r8Var;
        r8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ManageInviteLinks), false);
        this.H.setOnClickListener(new cp(this, 3));
        this.h.addView(this.H, w7.w5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.I = e9Var2;
        this.h.addView(e9Var2, w7.w5.n(-1, -2));
        hp hpVar = new hp(this, context, this.X, context);
        this.U = hpVar;
        TLRPC.ChatFull chatFull = this.Y;
        if (chatFull != null && chatFull.linked_chat_id != 0 && !this.f39801a0) {
            z10 = true;
        } else {
            z10 = false;
        }
        hpVar.c(z10);
        hp hpVar2 = this.U;
        TLRPC.ChatFull chatFull2 = this.Y;
        org.telegram.ui.Cells.e9 e9Var3 = hpVar2.f29779e;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(hpVar2.f29781n);
        boolean isPublic = ChatObject.isPublic(hpVar2.f29781n);
        if (chatFull2 != null && chatFull2.guard_bot_id != 0) {
            String str = "@" + DialogObject.getPublicUsername(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(chatFull2.guard_bot_id)));
            if (isChannelAndNotMegaGroup) {
                i12 = R.string.ChannelSettingsJoinRequestInfoManagedBy;
            } else if (isPublic) {
                i12 = R.string.GroupPublicSettingsJoinRequestInfoManagedBy;
            } else {
                i12 = R.string.GroupPrivateSettingsJoinRequestInfoManagedBy;
            }
            e9Var3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i12, str), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.il, false), new org.telegram.ui.Components.jt(22, chatFull2, this)));
        } else {
            if (isChannelAndNotMegaGroup) {
                i11 = R.string.ChannelSettingsJoinRequestInfo2;
            } else if (isPublic) {
                i11 = R.string.GroupPublicSettingsJoinRequestInfo2;
            } else {
                i11 = R.string.GroupPrivateSettingsJoinRequestInfo2;
            }
            e9Var3.setText(LocaleController.getString(i11));
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
        this.Q.addView(this.R, w7.w5.n(-1, -2));
        org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context);
        this.S = w8Var;
        w8Var.f(LocaleController.getString(R.string.RestrictSavingContent), this.f39803b0, false);
        this.S.setOnClickListener(new cp(this, 4));
        this.Q.addView(this.S, w7.w5.n(-1, -2));
        this.T = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        if (this.f39801a0 && !ChatObject.isMegagroup(this.X)) {
            this.T.setText(LocaleController.getString(R.string.RestrictSavingContentInfoChannel));
        } else {
            this.T.setText(LocaleController.getString(R.string.RestrictSavingContentInfoGroup));
        }
        this.Q.addView(this.T, w7.w5.n(-1, -2));
        String publicUsername = ChatObject.getPublicUsername(this.X, true);
        if (!this.V && publicUsername != null) {
            this.m0 = true;
            this.f39800a.setText(publicUsername);
            this.f39800a.setSelection(publicUsername.length());
            this.m0 = false;
        }
        b0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f19804id == this.Z) {
                this.Y = chatFull;
                this.f39816l0 = chatFull.exported_invite;
                b0();
            }
        } else if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.Z) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
                if (b5Var != null && b5Var.getLastFragment() == this) {
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
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20504a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f20895v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f20859t8));
        int i10 = org.telegram.ui.ActionBar.h6.f20524b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.J, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.h6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.f20651i6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4096, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.h6.f20781p7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4096, null, null, null, null, i12));
        int i14 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39800a, 4, null, null, null, null, i14));
        ci.g2 g2Var = this.f39800a;
        int i15 = org.telegram.ui.ActionBar.h6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(g2Var, 8388608, null, null, null, null, i15));
        LinearLayout linearLayout = this.f39824s;
        int i16 = org.telegram.ui.ActionBar.h6.f20560d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(linearLayout, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39829y, 1, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.h6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39807e, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39802b, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39802b, 8388608, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39809f, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39809f, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39809f, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20911w6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39804c, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39804c, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39804c, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39808e0, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39828x, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39811g0, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20632h6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 4096, null, null, null, null, i12));
        int i18 = org.telegram.ui.ActionBar.h6.f20617g7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        int i19 = org.telegram.ui.ActionBar.h6.f20633h7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        int i20 = org.telegram.ui.ActionBar.h6.f20964z6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39827w, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39827w, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39827w, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39827w, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39827w, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39828x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i14));
        int i21 = org.telegram.ui.ActionBar.h6.f20946y6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39828x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39828x, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39828x, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, org.telegram.ui.ActionBar.h6.f20813r0, eVar, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20725m6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        ci.g2 g2Var;
        super.onBecomeFullyVisible();
        if (this.f39818n0 && (g2Var = this.f39800a) != null) {
            g2Var.requestFocus();
            AndroidUtilities.showKeyboard(this.f39800a);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lp.onFragmentCreate():boolean");
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
        ce ceVar = this.h;
        if (ceVar != null) {
            ceVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i13);
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
            this.f39816l0 = tL_chatInviteExported;
            org.telegram.ui.Components.ba0 ba0Var = this.G;
            if (tL_chatInviteExported == null) {
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            ba0Var.setLink(str);
            this.G.c(this.f39816l0, this.Z);
        }
    }
}
