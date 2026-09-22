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
public final class ip extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout E;
    public LinearLayout F;
    public org.telegram.ui.Components.g90 G;
    public org.telegram.ui.Cells.s8 H;
    public org.telegram.ui.Cells.f9 I;
    public org.telegram.ui.Cells.c7 J;
    public hp K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public oa O;
    public ArrayList P;
    public LinearLayout Q;
    public org.telegram.ui.Cells.n4 R;
    public org.telegram.ui.Cells.x8 S;
    public org.telegram.ui.Cells.f9 T;
    public ep U;
    public boolean V;
    public boolean W;
    public TLRPC.Chat X;
    public TLRPC.ChatFull Y;
    public long Z;
    public ci.h2 f34654a;
    public boolean f34655a0;
    public EditTextBoldCursor f34656b;
    public boolean f34657b0;
    public org.telegram.ui.Cells.f9 f34658c;
    public boolean f34659c0;
    public org.telegram.ui.Cells.n4 d;
    public boolean f34660d0;
    public org.telegram.ui.Cells.n4 e;
    public org.telegram.ui.Cells.c7 f34661e0;
    public cp f34662f;
    public ArrayList f34663f0;
    public org.telegram.ui.Cells.t4 f34664g0;
    public yd h;
    public int f34665h0;
    public String f34666i0;
    public gh f34667j0;
    public boolean f34668k0;
    public TLRPC.TL_chatInviteExported f34669l0;
    public boolean m0;
    public org.telegram.ui.ActionBar.v0 f34670n;
    public boolean f34671n0;
    public HashMap f34672o0;
    public org.telegram.ui.Components.c70 f34673p0;
    public xo f34674q0;
    public org.telegram.ui.Components.pr f34675r;
    public ValueAnimator f34676r0;
    public LinearLayout f34677s;
    public Boolean f34678s0;
    public boolean f34679t0;
    public org.telegram.ui.Cells.k6 v;
    public org.telegram.ui.Cells.k6 f34680w;
    public LinearLayout f34681x;
    public LinearLayout f34682y;

    public final void V() {
        if (!this.V && this.f34654a.length() <= 0) {
            ArrayList arrayList = this.N;
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            this.f34670n.setEnabled(false);
            this.f34670n.setAlpha(0.5f);
            return;
        }
        this.f34670n.setEnabled(true);
        this.f34670n.setAlpha(1.0f);
    }

    public final boolean W(String str) {
        if (str != null && str.length() > 0) {
            this.f34662f.setVisibility(0);
        } else {
            this.f34662f.setVisibility(8);
        }
        gh ghVar = this.f34667j0;
        if (ghVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ghVar);
            this.f34667j0 = null;
            this.f34666i0 = null;
            if (this.f34665h0 != 0) {
                getConnectionsManager().cancelRequest(this.f34665h0, true);
            }
        }
        this.f34668k0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (this.f34655a0) {
                            this.f34662f.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                        } else {
                            this.f34662f.setText(LocaleController.getString(R.string.LinkInvalidStartNumberMega));
                        }
                        this.f34662f.setTextColorByKey(org.telegram.ui.ActionBar.j6.f19330p7);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.f34662f.setText(LocaleController.getString(R.string.LinkInvalid));
                        this.f34662f.setTextColorByKey(org.telegram.ui.ActionBar.j6.f19330p7);
                        return false;
                    }
                }
            } else {
                this.f34662f.setText(LocaleController.getString(R.string.LinkInvalid));
                this.f34662f.setTextColorByKey(org.telegram.ui.ActionBar.j6.f19330p7);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.f34662f.setText(LocaleController.getString(R.string.LinkInvalidLong));
                this.f34662f.setTextColorByKey(org.telegram.ui.ActionBar.j6.f19330p7);
                return false;
            }
            this.f34662f.setText(LocaleController.getString(R.string.LinkChecking));
            this.f34662f.setTextColorByKey(org.telegram.ui.ActionBar.j6.F6);
            this.f34666i0 = str;
            gh ghVar2 = new gh(15, this, str);
            this.f34667j0 = ghVar2;
            AndroidUtilities.runOnUIThread(ghVar2, 300L);
            return true;
        }
        if (this.f34655a0) {
            this.f34662f.setText(LocaleController.getString(R.string.LinkInvalidShort));
        } else {
            this.f34662f.setText(LocaleController.getString(R.string.LinkInvalidShortMega));
        }
        this.f34662f.setTextColorByKey(org.telegram.ui.ActionBar.j6.f19330p7);
        return false;
    }

    public final void X(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.Z);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ci.u3(6, this, z10)), this.classGuid);
    }

    public final void Y() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ip.Y():void");
    }

    public final void Z() {
        if (getParentActivity() == null) {
            return;
        }
        rg.j0 j0Var = new rg.j0(2, this.currentAccount, getParentActivity(), this, null);
        j0Var.f42649v0 = this.f34655a0;
        j0Var.H0 = new xo(this, 0);
        showDialog(j0Var);
    }

    public final void a0(boolean z10) {
        float f7;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.f34674q0);
        }
        if (this.f34675r != null) {
            ValueAnimator valueAnimator = this.f34676r0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f34675r.f27411c;
            float f11 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f34676r0 = ofFloat;
            ofFloat.addUpdateListener(new b3(this, 6));
            ValueAnimator valueAnimator2 = this.f34676r0;
            float f12 = this.f34675r.f27411c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.f34676r0.setInterpolator(org.telegram.ui.Components.qr.f27653f);
            this.f34676r0.start();
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
        if (!this.V && !this.f34659c0 && getUserConfig().isPremium()) {
            this.f34658c.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.f9 f9Var = this.f34658c;
            int i20 = org.telegram.ui.ActionBar.j6.f19330p7;
            f9Var.setTag(Integer.valueOf(i20));
            this.f34658c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i20, false));
            this.f34682y.setVisibility(8);
            this.f34662f.setVisibility(8);
            this.J.setVisibility(8);
            this.f34661e0.setVisibility(0);
            if (this.f34660d0) {
                this.f34664g0.setVisibility(0);
                this.f34681x.setVisibility(8);
            } else {
                this.f34664g0.setVisibility(8);
                this.f34681x.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.f9 f9Var2 = this.f34658c;
            int i21 = org.telegram.ui.ActionBar.j6.B6;
            f9Var2.setTag(Integer.valueOf(i21));
            this.f34658c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i21, false));
            if (this.f34671n0) {
                this.J.setVisibility(8);
            } else {
                this.J.setVisibility(0);
            }
            this.f34661e0.setVisibility(8);
            this.f34681x.setVisibility(8);
            this.f34682y.setVisibility(0);
            this.f34664g0.setVisibility(8);
            if (this.f34655a0) {
                org.telegram.ui.Cells.f9 f9Var3 = this.f34658c;
                if (this.V) {
                    i16 = R.string.ChannelPrivateLinkHelp;
                } else {
                    i16 = R.string.ChannelUsernameHelp;
                }
                f9Var3.setText(LocaleController.getString(i16));
                org.telegram.ui.Cells.n4 n4Var = this.d;
                if (this.V) {
                    i17 = R.string.ChannelInviteLinkTitle;
                } else {
                    i17 = R.string.ChannelLinkTitle;
                }
                n4Var.setText(LocaleController.getString(i17));
            } else {
                org.telegram.ui.Cells.f9 f9Var4 = this.f34658c;
                if (this.V) {
                    i10 = R.string.MegaPrivateLinkHelp;
                } else {
                    i10 = R.string.MegaUsernameHelp;
                }
                f9Var4.setText(LocaleController.getString(i10));
                org.telegram.ui.Cells.n4 n4Var2 = this.d;
                if (this.V) {
                    i11 = R.string.ChannelInviteLinkTitle;
                } else {
                    i11 = R.string.ChannelLinkTitle;
                }
                n4Var2.setText(LocaleController.getString(i11));
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
            LinearLayout linearLayout3 = this.f34682y;
            if (this.V) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.g90 g90Var = this.G;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f34669l0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            g90Var.setLink(str);
            this.G.c(this.f34669l0, this.Z);
            cp cpVar = this.f34662f;
            if (!this.V && cpVar.f20309a.length() != 0) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            cpVar.setVisibility(i14);
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
        this.f34680w.a(this.V);
        this.f34654a.clearFocus();
        ep epVar = this.U;
        if (epVar != null) {
            if (this.f34655a0 && !this.V) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            epVar.setVisibility(i18);
            ep epVar2 = this.U;
            TLRPC.ChatFull chatFull2 = this.Y;
            epVar2.c((chatFull2 == null || chatFull2.linked_chat_id == 0 || this.f34655a0) ? false : false);
        }
        hp hpVar = this.K;
        if (hpVar != null) {
            if (!this.V && !this.N.isEmpty()) {
                i19 = 0;
            }
            hpVar.setVisibility(i19);
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
        this.actionBar.setActionBarMenuOnItemClick(new ro(this, 1));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i13 = org.telegram.ui.ActionBar.j6.f19442v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i13, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.pr prVar = new org.telegram.ui.Components.pr(mutate, new org.telegram.ui.Components.tp(org.telegram.ui.ActionBar.j6.w0(null, i13, false)));
        this.f34675r = prVar;
        this.f34670n = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), prVar);
        this.h = new yd(context);
        ap apVar = new ap(this, context, this.h, this.resourceProvider);
        this.fragmentView = apVar;
        apVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19053a7, false));
        org.telegram.ui.Components.oo0 oo0Var = (org.telegram.ui.Components.oo0) this.fragmentView;
        oo0Var.setFillViewport(true);
        oo0Var.addView(this.h, new FrameLayout.LayoutParams(-1, -2));
        this.actionBar.setAdaptiveBackground(oo0Var);
        this.h.setOrientation(1);
        boolean z11 = this.f34671n0;
        if (z11) {
            this.actionBar.setTitle(LocaleController.getString(R.string.TypeLocationGroup));
        } else if (this.f34655a0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSettingsTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.GroupSettingsTitle));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f34677s = linearLayout;
        linearLayout.setOrientation(1);
        this.h.addView(this.f34677s, w7.y5.n(-1, -2));
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, 23);
        this.e = n4Var;
        n4Var.setHeight(46);
        if (this.f34655a0) {
            this.e.setText(LocaleController.getString(R.string.ChannelTypeHeader));
        } else {
            this.e.setText(LocaleController.getString(R.string.GroupTypeHeader));
        }
        this.f34677s.addView(this.e);
        org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, false);
        this.f34680w = k6Var;
        if (this.f34655a0) {
            k6Var.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, this.V);
        } else {
            k6Var.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, this.V);
        }
        this.f34677s.addView(this.f34680w, w7.y5.n(-1, -2));
        this.f34680w.setOnClickListener(new zo(this, 1));
        org.telegram.ui.Cells.k6 k6Var2 = new org.telegram.ui.Cells.k6(context, false);
        this.v = k6Var2;
        if (this.f34655a0) {
            k6Var2.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !this.V);
        } else {
            k6Var2.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !this.V);
        }
        this.f34677s.addView(this.v, w7.y5.n(-1, -2));
        this.v.setOnClickListener(new zo(this, 2));
        org.telegram.ui.Cells.c7 c7Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.c1) null);
        this.J = c7Var;
        this.h.addView(c7Var, w7.y5.n(-1, -2));
        if (z11) {
            this.f34680w.setVisibility(8);
            this.v.setVisibility(8);
            this.J.setVisibility(8);
            this.e.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f34682y = linearLayout2;
        linearLayout2.setOrientation(1);
        this.h.addView(this.f34682y, w7.y5.n(-1, -2));
        org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context, 23);
        this.d = n4Var2;
        this.f34682y.addView(n4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setOrientation(0);
        this.f34682y.addView(this.E, w7.y5.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f34656b = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().linkPrefix + "/");
        this.f34656b.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f34656b;
        int i14 = org.telegram.ui.ActionBar.j6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f34656b;
        int i15 = org.telegram.ui.ActionBar.j6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.f34656b.setMaxLines(1);
        this.f34656b.setLines(1);
        this.f34656b.setEnabled(false);
        this.f34656b.setBackground(null);
        this.f34656b.setPadding(0, 0, 0, 0);
        this.f34656b.setSingleLine(true);
        this.f34656b.setInputType(163840);
        this.f34656b.setImeOptions(6);
        this.E.addView(this.f34656b, w7.y5.n(-2, 36));
        ci.h2 h2Var = new ci.h2(this, context, 3);
        this.f34654a = h2Var;
        h2Var.setTextSize(1, 18.0f);
        this.f34654a.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        this.f34654a.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.f34654a.setMaxLines(1);
        this.f34654a.setLines(1);
        this.f34654a.setBackground(null);
        this.f34654a.setPadding(0, 0, 0, 0);
        this.f34654a.setSingleLine(true);
        this.f34654a.setInputType(163872);
        this.f34654a.setImeOptions(6);
        this.f34654a.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
        this.f34654a.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.f34654a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f34654a.setCursorWidth(1.5f);
        this.E.addView(this.f34654a, w7.y5.n(-1, 36));
        this.f34654a.addTextChangedListener(new l0(this, 3));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.F = linearLayout4;
        linearLayout4.setOrientation(1);
        this.f34682y.addView(this.F, w7.y5.n(-1, -2));
        org.telegram.ui.Components.g90 g90Var = new org.telegram.ui.Components.g90(context, this, null, true, ChatObject.isChannel(this.X));
        this.G = g90Var;
        g90Var.setDelegate(new bp(this, context));
        this.G.d(0, null, false);
        this.F.addView(this.G);
        cp cpVar = new cp(this, context, this.resourceProvider);
        this.f34662f = cpVar;
        cpVar.setBottomPadding(6);
        this.h.addView(this.f34662f, w7.y5.n(-2, -2));
        org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context, 12, this.resourceProvider);
        this.f34658c = f9Var;
        f9Var.setImportantForAccessibility(1);
        this.h.addView(this.f34658c, w7.y5.n(-1, -2));
        org.telegram.ui.Cells.t4 t4Var = new org.telegram.ui.Cells.t4(context);
        this.f34664g0 = t4Var;
        this.h.addView(t4Var, w7.y5.n(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.f34681x = linearLayout5;
        linearLayout5.setOrientation(1);
        this.h.addView(this.f34681x, w7.y5.n(-1, -2));
        org.telegram.ui.Cells.c7 c7Var2 = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.c1) null);
        this.f34661e0 = c7Var2;
        this.h.addView(c7Var2, w7.y5.n(-1, -2));
        yd ydVar = this.h;
        hp hpVar = new hp(this, context);
        this.K = hpVar;
        ydVar.addView(hpVar, w7.y5.n(-1, -2));
        hp hpVar2 = this.K;
        if (!this.V && !this.N.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        hpVar2.setVisibility(i10);
        org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
        this.H = s8Var;
        s8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ManageInviteLinks), false);
        this.H.setOnClickListener(new zo(this, 3));
        this.h.addView(this.H, w7.y5.n(-1, -2));
        org.telegram.ui.Cells.f9 f9Var2 = new org.telegram.ui.Cells.f9(context, 12, this.resourceProvider);
        this.I = f9Var2;
        this.h.addView(f9Var2, w7.y5.n(-1, -2));
        ep epVar = new ep(this, context, this.X, context);
        this.U = epVar;
        TLRPC.ChatFull chatFull = this.Y;
        if (chatFull != null && chatFull.linked_chat_id != 0 && !this.f34655a0) {
            z10 = true;
        } else {
            z10 = false;
        }
        epVar.c(z10);
        ep epVar2 = this.U;
        TLRPC.ChatFull chatFull2 = this.Y;
        org.telegram.ui.Cells.f9 f9Var3 = epVar2.e;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(epVar2.f29028n);
        boolean isPublic = ChatObject.isPublic(epVar2.f29028n);
        if (chatFull2 != null && chatFull2.guard_bot_id != 0) {
            String str = "@" + DialogObject.getPublicUsername(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(chatFull2.guard_bot_id)));
            if (isChannelAndNotMegaGroup) {
                i12 = R.string.ChannelSettingsJoinRequestInfoManagedBy;
            } else if (isPublic) {
                i12 = R.string.GroupPublicSettingsJoinRequestInfoManagedBy;
            } else {
                i12 = R.string.GroupPrivateSettingsJoinRequestInfoManagedBy;
            }
            f9Var3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i12, str), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.il, false), new org.telegram.ui.Components.bv(18, chatFull2, this)));
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
        org.telegram.ui.Cells.n4 n4Var3 = new org.telegram.ui.Cells.n4(context, 23);
        this.R = n4Var3;
        n4Var3.setHeight(46);
        this.R.setText(LocaleController.getString(R.string.SavingContentTitle));
        this.Q.addView(this.R, w7.y5.n(-1, -2));
        org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
        this.S = x8Var;
        x8Var.f(LocaleController.getString(R.string.RestrictSavingContent), this.f34657b0, false);
        this.S.setOnClickListener(new zo(this, 4));
        this.Q.addView(this.S, w7.y5.n(-1, -2));
        this.T = new org.telegram.ui.Cells.f9(context, 12, this.resourceProvider);
        if (this.f34655a0 && !ChatObject.isMegagroup(this.X)) {
            this.T.setText(LocaleController.getString(R.string.RestrictSavingContentInfoChannel));
        } else {
            this.T.setText(LocaleController.getString(R.string.RestrictSavingContentInfoGroup));
        }
        this.Q.addView(this.T, w7.y5.n(-1, -2));
        String publicUsername = ChatObject.getPublicUsername(this.X, true);
        if (!this.V && publicUsername != null) {
            this.m0 = true;
            this.f34654a.setText(publicUsername);
            this.f34654a.setSelection(publicUsername.length());
            this.m0 = false;
        }
        b0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f18344id == this.Z) {
                this.Y = chatFull;
                this.f34669l0 = chatFull.exported_invite;
                b0();
            }
        } else if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.Z) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
                if (d5Var != null && d5Var.getLastFragment() == this) {
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19053a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19442v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19406t8));
        int i10 = org.telegram.ui.ActionBar.j6.f19073b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.J, 32, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.f19199i6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4096, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.f19330p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4096, null, null, null, null, i12));
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34654a, 4, null, null, null, null, i14));
        ci.h2 h2Var = this.f34654a;
        int i15 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(h2Var, 8388608, null, null, null, null, i15));
        LinearLayout linearLayout = this.f34677s;
        int i16 = org.telegram.ui.ActionBar.j6.f19109d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(linearLayout, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34682y, 1, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.j6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 0, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 0, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34656b, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34656b, 8388608, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34662f, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34662f, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34662f, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19458w6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34658c, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34658c, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34658c, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34661e0, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34681x, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34664g0, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19181h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 4096, null, null, null, null, i12));
        int i18 = org.telegram.ui.ActionBar.j6.f19164g7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 8192, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        int i19 = org.telegram.ui.ActionBar.j6.f19182h7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 16384, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 4, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        int i20 = org.telegram.ui.ActionBar.j6.f19511z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 4, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34680w, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34680w, 8192, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34680w, 16384, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34680w, 4, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34680w, 4, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34681x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i14));
        int i21 = org.telegram.ui.ActionBar.j6.f19492y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34681x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34681x, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34681x, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, org.telegram.ui.ActionBar.j6.f19360r0, eVar, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 4, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19274m6));
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
        if (this.f34671n0 && (h2Var = this.f34654a) != null) {
            h2Var.requestFocus();
            AndroidUtilities.showKeyboard(this.f34654a);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ip.onFragmentCreate():boolean");
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
        yd ydVar = this.h;
        if (ydVar != null) {
            ydVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i13);
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
            this.f34669l0 = tL_chatInviteExported;
            org.telegram.ui.Components.g90 g90Var = this.G;
            if (tL_chatInviteExported == null) {
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            g90Var.setLink(str);
            this.G.c(this.f34669l0, this.Z);
        }
    }
}
