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
public final class lp extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout E;
    public LinearLayout F;
    public org.telegram.ui.Components.w80 G;
    public org.telegram.ui.Cells.r8 H;
    public org.telegram.ui.Cells.e9 I;
    public org.telegram.ui.Cells.a7 J;
    public kp K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public na O;
    public ArrayList P;
    public LinearLayout Q;
    public org.telegram.ui.Cells.l4 R;
    public org.telegram.ui.Cells.w8 S;
    public org.telegram.ui.Cells.e9 T;
    public hp U;
    public boolean V;
    public boolean W;
    public TLRPC.Chat X;
    public TLRPC.ChatFull Y;
    public long Z;
    public di.h2 f38424a;
    public boolean f38425a0;
    public EditTextBoldCursor f38426b;
    public boolean f38427b0;
    public org.telegram.ui.Cells.e9 f38428c;
    public boolean f38429c0;
    public org.telegram.ui.Cells.l4 d;
    public boolean f38430d0;
    public org.telegram.ui.Cells.l4 f38431e;
    public org.telegram.ui.Cells.a7 f38432e0;
    public fp f38433f;
    public ArrayList f38434f0;
    public org.telegram.ui.Cells.r4 f38435g0;
    public yd h;
    public int f38436h0;
    public String f38437i0;
    public fh f38438j0;
    public boolean f38439k0;
    public TLRPC.TL_chatInviteExported f38440l0;
    public boolean m0;
    public org.telegram.ui.ActionBar.v0 f38441n;
    public boolean f38442n0;
    public HashMap f38443o0;
    public org.telegram.ui.Components.r60 f38444p0;
    public ap f38445q0;
    public org.telegram.ui.Components.or f38446r;
    public ValueAnimator f38447r0;
    public LinearLayout f38448s;
    public Boolean f38449s0;
    public boolean f38450t0;
    public org.telegram.ui.Cells.i6 v;
    public org.telegram.ui.Cells.i6 f38451w;
    public LinearLayout f38452x;
    public LinearLayout f38453y;

    public final void V() {
        if (!this.V && this.f38424a.length() <= 0) {
            ArrayList arrayList = this.N;
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            this.f38441n.setEnabled(false);
            this.f38441n.setAlpha(0.5f);
            return;
        }
        this.f38441n.setEnabled(true);
        this.f38441n.setAlpha(1.0f);
    }

    public final boolean W(String str) {
        if (str != null && str.length() > 0) {
            this.f38433f.setVisibility(0);
        } else {
            this.f38433f.setVisibility(8);
        }
        fh fhVar = this.f38438j0;
        if (fhVar != null) {
            AndroidUtilities.cancelRunOnUIThread(fhVar);
            this.f38438j0 = null;
            this.f38437i0 = null;
            if (this.f38436h0 != 0) {
                getConnectionsManager().cancelRequest(this.f38436h0, true);
            }
        }
        this.f38439k0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (this.f38425a0) {
                            this.f38433f.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                        } else {
                            this.f38433f.setText(LocaleController.getString(R.string.LinkInvalidStartNumberMega));
                        }
                        this.f38433f.setTextColorByKey(org.telegram.ui.ActionBar.j6.f20881p7);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.f38433f.setText(LocaleController.getString(R.string.LinkInvalid));
                        this.f38433f.setTextColorByKey(org.telegram.ui.ActionBar.j6.f20881p7);
                        return false;
                    }
                }
            } else {
                this.f38433f.setText(LocaleController.getString(R.string.LinkInvalid));
                this.f38433f.setTextColorByKey(org.telegram.ui.ActionBar.j6.f20881p7);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.f38433f.setText(LocaleController.getString(R.string.LinkInvalidLong));
                this.f38433f.setTextColorByKey(org.telegram.ui.ActionBar.j6.f20881p7);
                return false;
            }
            this.f38433f.setText(LocaleController.getString(R.string.LinkChecking));
            this.f38433f.setTextColorByKey(org.telegram.ui.ActionBar.j6.F6);
            this.f38437i0 = str;
            fh fhVar2 = new fh(15, this, str);
            this.f38438j0 = fhVar2;
            AndroidUtilities.runOnUIThread(fhVar2, 300L);
            return true;
        }
        if (this.f38425a0) {
            this.f38433f.setText(LocaleController.getString(R.string.LinkInvalidShort));
        } else {
            this.f38433f.setText(LocaleController.getString(R.string.LinkInvalidShortMega));
        }
        this.f38433f.setTextColorByKey(org.telegram.ui.ActionBar.j6.f20881p7);
        return false;
    }

    public final void X(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.Z);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new di.u3(6, this, z10)), this.classGuid);
    }

    public final void Y() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lp.Y():void");
    }

    public final void Z() {
        if (getParentActivity() == null) {
            return;
        }
        sg.k0 k0Var = new sg.k0(2, this.currentAccount, getParentActivity(), this, null);
        k0Var.f46151v0 = this.f38425a0;
        k0Var.H0 = new ap(this, 0);
        showDialog(k0Var);
    }

    public final void a0(boolean z10) {
        float f7;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.f38445q0);
        }
        if (this.f38446r != null) {
            ValueAnimator valueAnimator = this.f38447r0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f38446r.f29172c;
            float f11 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f38447r0 = ofFloat;
            ofFloat.addUpdateListener(new c3(this, 7));
            ValueAnimator valueAnimator2 = this.f38447r0;
            float f12 = this.f38446r.f29172c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.f38447r0.setInterpolator(org.telegram.ui.Components.pr.f29467f);
            this.f38447r0.start();
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
        if (!this.V && !this.f38429c0 && getUserConfig().isPremium()) {
            this.f38428c.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.e9 e9Var = this.f38428c;
            int i20 = org.telegram.ui.ActionBar.j6.f20881p7;
            e9Var.setTag(Integer.valueOf(i20));
            this.f38428c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i20, false));
            this.f38453y.setVisibility(8);
            this.f38433f.setVisibility(8);
            this.J.setVisibility(8);
            this.f38432e0.setVisibility(0);
            if (this.f38430d0) {
                this.f38435g0.setVisibility(0);
                this.f38452x.setVisibility(8);
            } else {
                this.f38435g0.setVisibility(8);
                this.f38452x.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var2 = this.f38428c;
            int i21 = org.telegram.ui.ActionBar.j6.B6;
            e9Var2.setTag(Integer.valueOf(i21));
            this.f38428c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i21, false));
            if (this.f38442n0) {
                this.J.setVisibility(8);
            } else {
                this.J.setVisibility(0);
            }
            this.f38432e0.setVisibility(8);
            this.f38452x.setVisibility(8);
            this.f38453y.setVisibility(0);
            this.f38435g0.setVisibility(8);
            if (this.f38425a0) {
                org.telegram.ui.Cells.e9 e9Var3 = this.f38428c;
                if (this.V) {
                    i16 = R.string.ChannelPrivateLinkHelp;
                } else {
                    i16 = R.string.ChannelUsernameHelp;
                }
                e9Var3.setText(LocaleController.getString(i16));
                org.telegram.ui.Cells.l4 l4Var = this.d;
                if (this.V) {
                    i17 = R.string.ChannelInviteLinkTitle;
                } else {
                    i17 = R.string.ChannelLinkTitle;
                }
                l4Var.setText(LocaleController.getString(i17));
            } else {
                org.telegram.ui.Cells.e9 e9Var4 = this.f38428c;
                if (this.V) {
                    i10 = R.string.MegaPrivateLinkHelp;
                } else {
                    i10 = R.string.MegaUsernameHelp;
                }
                e9Var4.setText(LocaleController.getString(i10));
                org.telegram.ui.Cells.l4 l4Var2 = this.d;
                if (this.V) {
                    i11 = R.string.ChannelInviteLinkTitle;
                } else {
                    i11 = R.string.ChannelLinkTitle;
                }
                l4Var2.setText(LocaleController.getString(i11));
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
            LinearLayout linearLayout3 = this.f38453y;
            if (this.V) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.w80 w80Var = this.G;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f38440l0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            w80Var.setLink(str);
            this.G.c(this.f38440l0, this.Z);
            fp fpVar = this.f38433f;
            if (!this.V && fpVar.f21867a.length() != 0) {
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
        this.f38451w.a(this.V);
        this.f38424a.clearFocus();
        hp hpVar = this.U;
        if (hpVar != null) {
            if (this.f38425a0 && !this.V) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            hpVar.setVisibility(i18);
            hp hpVar2 = this.U;
            TLRPC.ChatFull chatFull2 = this.Y;
            hpVar2.c((chatFull2 == null || chatFull2.linked_chat_id == 0 || this.f38425a0) ? false : false);
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
        this.actionBar.setActionBarMenuOnItemClick(new ic(this, 2));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i13 = org.telegram.ui.ActionBar.j6.f20993v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i13, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.or orVar = new org.telegram.ui.Components.or(mutate, new org.telegram.ui.Components.sp(org.telegram.ui.ActionBar.j6.w0(null, i13, false)));
        this.f38446r = orVar;
        this.f38441n = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), orVar);
        this.h = new yd(context);
        dp dpVar = new dp(this, context, this.h, this.resourceProvider);
        this.fragmentView = dpVar;
        dpVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20608a7, false));
        org.telegram.ui.Components.zn0 zn0Var = (org.telegram.ui.Components.zn0) this.fragmentView;
        zn0Var.setFillViewport(true);
        zn0Var.addView(this.h, new FrameLayout.LayoutParams(-1, -2));
        this.actionBar.setAdaptiveBackground(zn0Var);
        this.h.setOrientation(1);
        boolean z11 = this.f38442n0;
        if (z11) {
            this.actionBar.setTitle(LocaleController.getString(R.string.TypeLocationGroup));
        } else if (this.f38425a0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSettingsTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.GroupSettingsTitle));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f38448s = linearLayout;
        linearLayout.setOrientation(1);
        this.h.addView(this.f38448s, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, 23);
        this.f38431e = l4Var;
        l4Var.setHeight(46);
        if (this.f38425a0) {
            this.f38431e.setText(LocaleController.getString(R.string.ChannelTypeHeader));
        } else {
            this.f38431e.setText(LocaleController.getString(R.string.GroupTypeHeader));
        }
        this.f38448s.addView(this.f38431e);
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, false);
        this.f38451w = i6Var;
        if (this.f38425a0) {
            i6Var.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, this.V);
        } else {
            i6Var.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, this.V);
        }
        this.f38448s.addView(this.f38451w, w7.x5.n(-1, -2));
        this.f38451w.setOnClickListener(new cp(this, 1));
        org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(context, false);
        this.v = i6Var2;
        if (this.f38425a0) {
            i6Var2.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !this.V);
        } else {
            i6Var2.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !this.V);
        }
        this.f38448s.addView(this.v, w7.x5.n(-1, -2));
        this.v.setOnClickListener(new cp(this, 2));
        org.telegram.ui.Cells.a7 a7Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
        this.J = a7Var;
        this.h.addView(a7Var, w7.x5.n(-1, -2));
        if (z11) {
            this.f38451w.setVisibility(8);
            this.v.setVisibility(8);
            this.J.setVisibility(8);
            this.f38431e.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f38453y = linearLayout2;
        linearLayout2.setOrientation(1);
        this.h.addView(this.f38453y, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context, 23);
        this.d = l4Var2;
        this.f38453y.addView(l4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setOrientation(0);
        this.f38453y.addView(this.E, w7.x5.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f38426b = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().linkPrefix + "/");
        this.f38426b.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f38426b;
        int i14 = org.telegram.ui.ActionBar.j6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f38426b;
        int i15 = org.telegram.ui.ActionBar.j6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.f38426b.setMaxLines(1);
        this.f38426b.setLines(1);
        this.f38426b.setEnabled(false);
        this.f38426b.setBackground(null);
        this.f38426b.setPadding(0, 0, 0, 0);
        this.f38426b.setSingleLine(true);
        this.f38426b.setInputType(163840);
        this.f38426b.setImeOptions(6);
        this.E.addView(this.f38426b, w7.x5.n(-2, 36));
        di.h2 h2Var = new di.h2(this, context, 3);
        this.f38424a = h2Var;
        h2Var.setTextSize(1, 18.0f);
        this.f38424a.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        this.f38424a.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.f38424a.setMaxLines(1);
        this.f38424a.setLines(1);
        this.f38424a.setBackground(null);
        this.f38424a.setPadding(0, 0, 0, 0);
        this.f38424a.setSingleLine(true);
        this.f38424a.setInputType(163872);
        this.f38424a.setImeOptions(6);
        this.f38424a.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
        this.f38424a.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.f38424a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f38424a.setCursorWidth(1.5f);
        this.E.addView(this.f38424a, w7.x5.n(-1, 36));
        this.f38424a.addTextChangedListener(new l0(this, 3));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.F = linearLayout4;
        linearLayout4.setOrientation(1);
        this.f38453y.addView(this.F, w7.x5.n(-1, -2));
        org.telegram.ui.Components.w80 w80Var = new org.telegram.ui.Components.w80(context, this, null, true, ChatObject.isChannel(this.X));
        this.G = w80Var;
        w80Var.setDelegate(new ep(this, context));
        this.G.d(0, null, false);
        this.F.addView(this.G);
        fp fpVar = new fp(this, context, this.resourceProvider);
        this.f38433f = fpVar;
        fpVar.setBottomPadding(6);
        this.h.addView(this.f38433f, w7.x5.n(-2, -2));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.f38428c = e9Var;
        e9Var.setImportantForAccessibility(1);
        this.h.addView(this.f38428c, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.r4 r4Var = new org.telegram.ui.Cells.r4(context);
        this.f38435g0 = r4Var;
        this.h.addView(r4Var, w7.x5.n(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.f38452x = linearLayout5;
        linearLayout5.setOrientation(1);
        this.h.addView(this.f38452x, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.a7 a7Var2 = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
        this.f38432e0 = a7Var2;
        this.h.addView(a7Var2, w7.x5.n(-1, -2));
        yd ydVar = this.h;
        kp kpVar = new kp(this, context);
        this.K = kpVar;
        ydVar.addView(kpVar, w7.x5.n(-1, -2));
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
        this.h.addView(this.H, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.I = e9Var2;
        this.h.addView(e9Var2, w7.x5.n(-1, -2));
        hp hpVar = new hp(this, context, this.X, context);
        this.U = hpVar;
        TLRPC.ChatFull chatFull = this.Y;
        if (chatFull != null && chatFull.linked_chat_id != 0 && !this.f38425a0) {
            z10 = true;
        } else {
            z10 = false;
        }
        hpVar.c(z10);
        hp hpVar2 = this.U;
        TLRPC.ChatFull chatFull2 = this.Y;
        org.telegram.ui.Cells.e9 e9Var3 = hpVar2.f27752e;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(hpVar2.f27754n);
        boolean isPublic = ChatObject.isPublic(hpVar2.f27754n);
        if (chatFull2 != null && chatFull2.guard_bot_id != 0) {
            String str = "@" + DialogObject.getPublicUsername(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(chatFull2.guard_bot_id)));
            if (isChannelAndNotMegaGroup) {
                i12 = R.string.ChannelSettingsJoinRequestInfoManagedBy;
            } else if (isPublic) {
                i12 = R.string.GroupPublicSettingsJoinRequestInfoManagedBy;
            } else {
                i12 = R.string.GroupPrivateSettingsJoinRequestInfoManagedBy;
            }
            e9Var3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i12, str), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.il, false), new org.telegram.ui.Components.zu(18, chatFull2, this)));
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
        org.telegram.ui.Cells.l4 l4Var3 = new org.telegram.ui.Cells.l4(context, 23);
        this.R = l4Var3;
        l4Var3.setHeight(46);
        this.R.setText(LocaleController.getString(R.string.SavingContentTitle));
        this.Q.addView(this.R, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context);
        this.S = w8Var;
        w8Var.f(LocaleController.getString(R.string.RestrictSavingContent), this.f38427b0, false);
        this.S.setOnClickListener(new cp(this, 4));
        this.Q.addView(this.S, w7.x5.n(-1, -2));
        this.T = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        if (this.f38425a0 && !ChatObject.isMegagroup(this.X)) {
            this.T.setText(LocaleController.getString(R.string.RestrictSavingContentInfoChannel));
        } else {
            this.T.setText(LocaleController.getString(R.string.RestrictSavingContentInfoGroup));
        }
        this.Q.addView(this.T, w7.x5.n(-1, -2));
        String publicUsername = ChatObject.getPublicUsername(this.X, true);
        if (!this.V && publicUsername != null) {
            this.m0 = true;
            this.f38424a.setText(publicUsername);
            this.f38424a.setSelection(publicUsername.length());
            this.m0 = false;
        }
        b0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f19870id == this.Z) {
                this.Y = chatFull;
                this.f38440l0 = chatFull.exported_invite;
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20608a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20993v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20957t8));
        int i10 = org.telegram.ui.ActionBar.j6.f20628b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.J, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.f20754i6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4096, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.f20881p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4096, null, null, null, null, i12));
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38424a, 4, null, null, null, null, i14));
        di.h2 h2Var = this.f38424a;
        int i15 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(h2Var, 8388608, null, null, null, null, i15));
        LinearLayout linearLayout = this.f38448s;
        int i16 = org.telegram.ui.ActionBar.j6.f20664d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(linearLayout, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38453y, 1, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.j6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38431e, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38426b, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38426b, 8388608, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38433f, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38433f, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38433f, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f21009w6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38428c, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38428c, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38428c, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38432e0, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38452x, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38435g0, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20736h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 4096, null, null, null, null, i12));
        int i18 = org.telegram.ui.ActionBar.j6.f20720g7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        int i19 = org.telegram.ui.ActionBar.j6.f20737h7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        int i20 = org.telegram.ui.ActionBar.j6.f21062z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38451w, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38451w, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38451w, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38451w, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38451w, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38452x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i14));
        int i21 = org.telegram.ui.ActionBar.j6.f21043y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38452x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38452x, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38452x, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, org.telegram.ui.ActionBar.j6.f20911r0, eVar, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20828m6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        di.h2 h2Var;
        super.onBecomeFullyVisible();
        if (this.f38442n0 && (h2Var = this.f38424a) != null) {
            h2Var.requestFocus();
            AndroidUtilities.showKeyboard(this.f38424a);
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
            this.f38440l0 = tL_chatInviteExported;
            org.telegram.ui.Components.w80 w80Var = this.G;
            if (tL_chatInviteExported == null) {
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            w80Var.setLink(str);
            this.G.c(this.f38440l0, this.Z);
        }
    }
}
