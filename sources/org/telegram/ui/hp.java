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
public final class hp extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout E;
    public LinearLayout F;
    public org.telegram.ui.Components.j90 G;
    public org.telegram.ui.Cells.r8 H;
    public org.telegram.ui.Cells.e9 I;
    public org.telegram.ui.Cells.b7 J;
    public gp K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public pa O;
    public ArrayList P;
    public LinearLayout Q;
    public org.telegram.ui.Cells.m4 R;
    public org.telegram.ui.Cells.w8 S;
    public org.telegram.ui.Cells.e9 T;
    public dp U;
    public boolean V;
    public boolean W;
    public TLRPC.Chat X;
    public TLRPC.ChatFull Y;
    public long Z;
    public ci.h2 f37130a;
    public boolean f37131a0;
    public EditTextBoldCursor f37132b;
    public boolean f37133b0;
    public org.telegram.ui.Cells.e9 f37134c;
    public boolean f37135c0;
    public org.telegram.ui.Cells.m4 d;
    public boolean f37136d0;
    public org.telegram.ui.Cells.m4 f37137e;
    public org.telegram.ui.Cells.b7 f37138e0;
    public bp f37139f;
    public ArrayList f37140f0;
    public org.telegram.ui.Cells.s4 f37141g0;
    public zd h;
    public int f37142h0;
    public String f37143i0;
    public oh f37144j0;
    public boolean f37145k0;
    public TLRPC.TL_chatInviteExported f37146l0;
    public boolean m0;
    public org.telegram.ui.ActionBar.v0 f37147n;
    public boolean f37148n0;
    public HashMap f37149o0;
    public org.telegram.ui.Components.f70 f37150p0;
    public wo f37151q0;
    public org.telegram.ui.Components.sr f37152r;
    public ValueAnimator f37153r0;
    public LinearLayout f37154s;
    public Boolean f37155s0;
    public boolean f37156t0;
    public org.telegram.ui.Cells.j6 v;
    public org.telegram.ui.Cells.j6 f37157w;
    public LinearLayout f37158x;
    public LinearLayout f37159y;

    public final void T() {
        if (!this.V && this.f37130a.length() <= 0) {
            ArrayList arrayList = this.N;
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            this.f37147n.setEnabled(false);
            this.f37147n.setAlpha(0.5f);
            return;
        }
        this.f37147n.setEnabled(true);
        this.f37147n.setAlpha(1.0f);
    }

    public final boolean U(String str) {
        if (str != null && str.length() > 0) {
            this.f37139f.setVisibility(0);
        } else {
            this.f37139f.setVisibility(8);
        }
        oh ohVar = this.f37144j0;
        if (ohVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ohVar);
            this.f37144j0 = null;
            this.f37143i0 = null;
            if (this.f37142h0 != 0) {
                getConnectionsManager().cancelRequest(this.f37142h0, true);
            }
        }
        this.f37145k0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (this.f37131a0) {
                            this.f37139f.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                        } else {
                            this.f37139f.setText(LocaleController.getString(R.string.LinkInvalidStartNumberMega));
                        }
                        this.f37139f.setTextColorByKey(org.telegram.ui.ActionBar.i6.f21044p7);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.f37139f.setText(LocaleController.getString(R.string.LinkInvalid));
                        this.f37139f.setTextColorByKey(org.telegram.ui.ActionBar.i6.f21044p7);
                        return false;
                    }
                }
            } else {
                this.f37139f.setText(LocaleController.getString(R.string.LinkInvalid));
                this.f37139f.setTextColorByKey(org.telegram.ui.ActionBar.i6.f21044p7);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.f37139f.setText(LocaleController.getString(R.string.LinkInvalidLong));
                this.f37139f.setTextColorByKey(org.telegram.ui.ActionBar.i6.f21044p7);
                return false;
            }
            this.f37139f.setText(LocaleController.getString(R.string.LinkChecking));
            this.f37139f.setTextColorByKey(org.telegram.ui.ActionBar.i6.F6);
            this.f37143i0 = str;
            oh ohVar2 = new oh(13, this, str);
            this.f37144j0 = ohVar2;
            AndroidUtilities.runOnUIThread(ohVar2, 300L);
            return true;
        }
        if (this.f37131a0) {
            this.f37139f.setText(LocaleController.getString(R.string.LinkInvalidShort));
        } else {
            this.f37139f.setText(LocaleController.getString(R.string.LinkInvalidShortMega));
        }
        this.f37139f.setTextColorByKey(org.telegram.ui.ActionBar.i6.f21044p7);
        return false;
    }

    public final void W(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.Z);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ci.t3(6, this, z10)), this.classGuid);
    }

    public final void X() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hp.X():void");
    }

    public final void Y() {
        if (getParentActivity() == null) {
            return;
        }
        rg.k0 k0Var = new rg.k0(2, this.currentAccount, getParentActivity(), this, null);
        k0Var.f46171v0 = this.f37131a0;
        k0Var.H0 = new wo(this, 0);
        showDialog(k0Var);
    }

    public final void Z(boolean z10) {
        float f7;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.f37151q0);
        }
        if (this.f37152r != null) {
            ValueAnimator valueAnimator = this.f37153r0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f37152r.f30870c;
            float f11 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f37153r0 = ofFloat;
            ofFloat.addUpdateListener(new c3(this, 6));
            ValueAnimator valueAnimator2 = this.f37153r0;
            float f12 = this.f37152r.f30870c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.f37153r0.setInterpolator(org.telegram.ui.Components.tr.f31147f);
            this.f37153r0.start();
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
        if (!this.V && !this.f37135c0 && getUserConfig().isPremium()) {
            this.f37134c.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.e9 e9Var = this.f37134c;
            int i20 = org.telegram.ui.ActionBar.i6.f21044p7;
            e9Var.setTag(Integer.valueOf(i20));
            this.f37134c.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i20, false));
            this.f37159y.setVisibility(8);
            this.f37139f.setVisibility(8);
            this.J.setVisibility(8);
            this.f37138e0.setVisibility(0);
            if (this.f37136d0) {
                this.f37141g0.setVisibility(0);
                this.f37158x.setVisibility(8);
            } else {
                this.f37141g0.setVisibility(8);
                this.f37158x.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var2 = this.f37134c;
            int i21 = org.telegram.ui.ActionBar.i6.B6;
            e9Var2.setTag(Integer.valueOf(i21));
            this.f37134c.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i21, false));
            if (this.f37148n0) {
                this.J.setVisibility(8);
            } else {
                this.J.setVisibility(0);
            }
            this.f37138e0.setVisibility(8);
            this.f37158x.setVisibility(8);
            this.f37159y.setVisibility(0);
            this.f37141g0.setVisibility(8);
            if (this.f37131a0) {
                org.telegram.ui.Cells.e9 e9Var3 = this.f37134c;
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
                org.telegram.ui.Cells.e9 e9Var4 = this.f37134c;
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
            LinearLayout linearLayout3 = this.f37159y;
            if (this.V) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.j90 j90Var = this.G;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f37146l0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            j90Var.setLink(str);
            this.G.c(this.f37146l0, this.Z);
            bp bpVar = this.f37139f;
            if (!this.V && bpVar.f22044a.length() != 0) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            bpVar.setVisibility(i14);
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
        this.f37157w.a(this.V);
        this.f37130a.clearFocus();
        dp dpVar = this.U;
        if (dpVar != null) {
            if (this.f37131a0 && !this.V) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            dpVar.setVisibility(i18);
            dp dpVar2 = this.U;
            TLRPC.ChatFull chatFull2 = this.Y;
            dpVar2.c((chatFull2 == null || chatFull2.linked_chat_id == 0 || this.f37131a0) ? false : false);
        }
        gp gpVar = this.K;
        if (gpVar != null) {
            if (!this.V && !this.N.isEmpty()) {
                i19 = 0;
            }
            gpVar.setVisibility(i19);
        }
        T();
    }

    @Override
    public final View createView(Context context) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new qo(this, 1));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i13 = org.telegram.ui.ActionBar.i6.f21159v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i13, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.sr srVar = new org.telegram.ui.Components.sr(mutate, new org.telegram.ui.Components.wp(org.telegram.ui.ActionBar.i6.w0(null, i13, false)));
        this.f37152r = srVar;
        this.f37147n = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), srVar);
        this.h = new zd(context);
        zo zoVar = new zo(this, context, this.h, this.resourceProvider);
        this.fragmentView = zoVar;
        zoVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20766a7, false));
        org.telegram.ui.Components.ro0 ro0Var = (org.telegram.ui.Components.ro0) this.fragmentView;
        ro0Var.setFillViewport(true);
        ro0Var.addView(this.h, new FrameLayout.LayoutParams(-1, -2));
        this.actionBar.setAdaptiveBackground(ro0Var);
        this.h.setOrientation(1);
        boolean z11 = this.f37148n0;
        if (z11) {
            this.actionBar.setTitle(LocaleController.getString(R.string.TypeLocationGroup));
        } else if (this.f37131a0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSettingsTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.GroupSettingsTitle));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f37154s = linearLayout;
        linearLayout.setOrientation(1);
        this.h.addView(this.f37154s, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
        this.f37137e = m4Var;
        m4Var.setHeight(46);
        if (this.f37131a0) {
            this.f37137e.setText(LocaleController.getString(R.string.ChannelTypeHeader));
        } else {
            this.f37137e.setText(LocaleController.getString(R.string.GroupTypeHeader));
        }
        this.f37154s.addView(this.f37137e);
        org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, false);
        this.f37157w = j6Var;
        if (this.f37131a0) {
            j6Var.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, this.V);
        } else {
            j6Var.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, this.V);
        }
        this.f37154s.addView(this.f37157w, w7.z5.n(-1, -2));
        this.f37157w.setOnClickListener(new yo(this, 1));
        org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(context, false);
        this.v = j6Var2;
        if (this.f37131a0) {
            j6Var2.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !this.V);
        } else {
            j6Var2.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !this.V);
        }
        this.f37154s.addView(this.v, w7.z5.n(-1, -2));
        this.v.setOnClickListener(new yo(this, 2));
        org.telegram.ui.Cells.b7 b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
        this.J = b7Var;
        this.h.addView(b7Var, w7.z5.n(-1, -2));
        if (z11) {
            this.f37157w.setVisibility(8);
            this.v.setVisibility(8);
            this.J.setVisibility(8);
            this.f37137e.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f37159y = linearLayout2;
        linearLayout2.setOrientation(1);
        this.h.addView(this.f37159y, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context, 23);
        this.d = m4Var2;
        this.f37159y.addView(m4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setOrientation(0);
        this.f37159y.addView(this.E, w7.z5.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f37132b = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().linkPrefix + "/");
        this.f37132b.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f37132b;
        int i14 = org.telegram.ui.ActionBar.i6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f37132b;
        int i15 = org.telegram.ui.ActionBar.i6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i15, false));
        this.f37132b.setMaxLines(1);
        this.f37132b.setLines(1);
        this.f37132b.setEnabled(false);
        this.f37132b.setBackground(null);
        this.f37132b.setPadding(0, 0, 0, 0);
        this.f37132b.setSingleLine(true);
        this.f37132b.setInputType(163840);
        this.f37132b.setImeOptions(6);
        this.E.addView(this.f37132b, w7.z5.n(-2, 36));
        ci.h2 h2Var = new ci.h2(this, context, 3);
        this.f37130a = h2Var;
        h2Var.setTextSize(1, 18.0f);
        this.f37130a.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
        this.f37130a.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i15, false));
        this.f37130a.setMaxLines(1);
        this.f37130a.setLines(1);
        this.f37130a.setBackground(null);
        this.f37130a.setPadding(0, 0, 0, 0);
        this.f37130a.setSingleLine(true);
        this.f37130a.setInputType(163872);
        this.f37130a.setImeOptions(6);
        this.f37130a.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
        this.f37130a.setCursorColor(org.telegram.ui.ActionBar.i6.w0(null, i15, false));
        this.f37130a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f37130a.setCursorWidth(1.5f);
        this.E.addView(this.f37130a, w7.z5.n(-1, 36));
        this.f37130a.addTextChangedListener(new m0(this, 3));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.F = linearLayout4;
        linearLayout4.setOrientation(1);
        this.f37159y.addView(this.F, w7.z5.n(-1, -2));
        org.telegram.ui.Components.j90 j90Var = new org.telegram.ui.Components.j90(context, this, null, true, ChatObject.isChannel(this.X));
        this.G = j90Var;
        j90Var.setDelegate(new ap(this, context));
        this.G.d(0, null, false);
        this.F.addView(this.G);
        bp bpVar = new bp(this, context, this.resourceProvider);
        this.f37139f = bpVar;
        bpVar.setBottomPadding(6);
        this.h.addView(this.f37139f, w7.z5.n(-2, -2));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.f37134c = e9Var;
        e9Var.setImportantForAccessibility(1);
        this.h.addView(this.f37134c, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.s4 s4Var = new org.telegram.ui.Cells.s4(context);
        this.f37141g0 = s4Var;
        this.h.addView(s4Var, w7.z5.n(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.f37158x = linearLayout5;
        linearLayout5.setOrientation(1);
        this.h.addView(this.f37158x, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.b7 b7Var2 = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
        this.f37138e0 = b7Var2;
        this.h.addView(b7Var2, w7.z5.n(-1, -2));
        zd zdVar = this.h;
        gp gpVar = new gp(this, context);
        this.K = gpVar;
        zdVar.addView(gpVar, w7.z5.n(-1, -2));
        gp gpVar2 = this.K;
        if (!this.V && !this.N.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        gpVar2.setVisibility(i10);
        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
        this.H = r8Var;
        r8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ManageInviteLinks), false);
        this.H.setOnClickListener(new yo(this, 3));
        this.h.addView(this.H, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.I = e9Var2;
        this.h.addView(e9Var2, w7.z5.n(-1, -2));
        dp dpVar = new dp(this, context, this.X, context);
        this.U = dpVar;
        TLRPC.ChatFull chatFull = this.Y;
        if (chatFull != null && chatFull.linked_chat_id != 0 && !this.f37131a0) {
            z10 = true;
        } else {
            z10 = false;
        }
        dpVar.c(z10);
        dp dpVar2 = this.U;
        TLRPC.ChatFull chatFull2 = this.Y;
        org.telegram.ui.Cells.e9 e9Var3 = dpVar2.f33113e;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(dpVar2.f33115n);
        boolean isPublic = ChatObject.isPublic(dpVar2.f33115n);
        if (chatFull2 != null && chatFull2.guard_bot_id != 0) {
            String str = "@" + DialogObject.getPublicUsername(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(chatFull2.guard_bot_id)));
            if (isChannelAndNotMegaGroup) {
                i12 = R.string.ChannelSettingsJoinRequestInfoManagedBy;
            } else if (isPublic) {
                i12 = R.string.GroupPublicSettingsJoinRequestInfoManagedBy;
            } else {
                i12 = R.string.GroupPrivateSettingsJoinRequestInfoManagedBy;
            }
            e9Var3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i12, str), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.il, false), new org.telegram.ui.Components.yw(16, chatFull2, this)));
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
        this.Q.addView(this.R, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context);
        this.S = w8Var;
        w8Var.f(LocaleController.getString(R.string.RestrictSavingContent), this.f37133b0, false);
        this.S.setOnClickListener(new yo(this, 4));
        this.Q.addView(this.S, w7.z5.n(-1, -2));
        this.T = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        if (this.f37131a0 && !ChatObject.isMegagroup(this.X)) {
            this.T.setText(LocaleController.getString(R.string.RestrictSavingContentInfoChannel));
        } else {
            this.T.setText(LocaleController.getString(R.string.RestrictSavingContentInfoGroup));
        }
        this.Q.addView(this.T, w7.z5.n(-1, -2));
        String publicUsername = ChatObject.getPublicUsername(this.X, true);
        if (!this.V && publicUsername != null) {
            this.m0 = true;
            this.f37130a.setText(publicUsername);
            this.f37130a.setSelection(publicUsername.length());
            this.m0 = false;
        }
        b0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f20043id == this.Z) {
                this.Y = chatFull;
                this.f37146l0 = chatFull.exported_invite;
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
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20766a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21159v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21123t8));
        int i10 = org.telegram.ui.ActionBar.i6.f20786b7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.J, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.i6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.i6.f20913i6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 4096, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.i6.f21044p7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 4, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 4096, null, null, null, null, i12));
        int i14 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 4, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37130a, 4, null, null, null, null, i14));
        ci.h2 h2Var = this.f37130a;
        int i15 = org.telegram.ui.ActionBar.i6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(h2Var, 8388608, null, null, null, null, i15));
        LinearLayout linearLayout = this.f37154s;
        int i16 = org.telegram.ui.ActionBar.i6.f20822d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(linearLayout, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37159y, 1, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.i6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37137e, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.R, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37132b, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37132b, 8388608, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37139f, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37139f, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37139f, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21175w6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37134c, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37134c, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37134c, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.I, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.I, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.I, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.T, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.T, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.T, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37138e0, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37158x, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37141g0, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20895h6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 4096, null, null, null, null, i12));
        int i18 = org.telegram.ui.ActionBar.i6.f20878g7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        int i19 = org.telegram.ui.ActionBar.i6.f20896h7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        int i20 = org.telegram.ui.ActionBar.i6.f21228z6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37157w, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37157w, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37157w, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37157w, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37157w, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37158x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i14));
        int i21 = org.telegram.ui.ActionBar.i6.f21209y6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37158x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37158x, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37158x, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, org.telegram.ui.ActionBar.i6.f21076r0, eVar, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.H, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.H, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.H, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20988m6));
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
        if (this.f37148n0 && (h2Var = this.f37130a) != null) {
            h2Var.requestFocus();
            AndroidUtilities.showKeyboard(this.f37130a);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hp.onFragmentCreate():boolean");
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
            this.f37146l0 = tL_chatInviteExported;
            org.telegram.ui.Components.j90 j90Var = this.G;
            if (tL_chatInviteExported == null) {
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            j90Var.setLink(str);
            this.G.c(this.f37146l0, this.Z);
        }
    }
}
