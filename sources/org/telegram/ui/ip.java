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
    public org.telegram.ui.Components.y90 G;
    public org.telegram.ui.Cells.r8 H;
    public org.telegram.ui.Cells.e9 I;
    public org.telegram.ui.Cells.b7 J;
    public hp K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public oa O;
    public ArrayList P;
    public LinearLayout Q;
    public org.telegram.ui.Cells.m4 R;
    public org.telegram.ui.Cells.w8 S;
    public org.telegram.ui.Cells.e9 T;
    public ep U;
    public boolean V;
    public boolean W;
    public TLRPC.Chat X;
    public TLRPC.ChatFull Y;
    public long Z;
    public ci.g2 f38752a;
    public boolean f38753a0;
    public EditTextBoldCursor f38754b;
    public boolean f38755b0;
    public org.telegram.ui.Cells.e9 f38756c;
    public boolean f38757c0;
    public org.telegram.ui.Cells.m4 d;
    public boolean f38758d0;
    public org.telegram.ui.Cells.m4 f38759e;
    public org.telegram.ui.Cells.b7 f38760e0;
    public cp f38761f;
    public ArrayList f38762f0;
    public org.telegram.ui.Cells.s4 f38763g0;
    public yd h;
    public int f38764h0;
    public String f38765i0;
    public sg f38766j0;
    public boolean f38767k0;
    public TLRPC.TL_chatInviteExported f38768l0;
    public boolean m0;
    public org.telegram.ui.ActionBar.v0 f38769n;
    public boolean f38770n0;
    public HashMap f38771o0;
    public org.telegram.ui.Components.u70 f38772p0;
    public xo f38773q0;
    public org.telegram.ui.Components.hs f38774r;
    public ValueAnimator f38775r0;
    public LinearLayout f38776s;
    public Boolean f38777s0;
    public boolean f38778t0;
    public org.telegram.ui.Cells.j6 v;
    public org.telegram.ui.Cells.j6 f38779w;
    public LinearLayout f38780x;
    public LinearLayout f38781y;

    public final void V() {
        if (!this.V && this.f38752a.length() <= 0) {
            ArrayList arrayList = this.N;
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            this.f38769n.setEnabled(false);
            this.f38769n.setAlpha(0.5f);
            return;
        }
        this.f38769n.setEnabled(true);
        this.f38769n.setAlpha(1.0f);
    }

    public final boolean W(String str) {
        if (str != null && str.length() > 0) {
            this.f38761f.setVisibility(0);
        } else {
            this.f38761f.setVisibility(8);
        }
        sg sgVar = this.f38766j0;
        if (sgVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sgVar);
            this.f38766j0 = null;
            this.f38765i0 = null;
            if (this.f38764h0 != 0) {
                getConnectionsManager().cancelRequest(this.f38764h0, true);
            }
        }
        this.f38767k0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (this.f38753a0) {
                            this.f38761f.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                        } else {
                            this.f38761f.setText(LocaleController.getString(R.string.LinkInvalidStartNumberMega));
                        }
                        this.f38761f.setTextColorByKey(org.telegram.ui.ActionBar.i6.f21022p7);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.f38761f.setText(LocaleController.getString(R.string.LinkInvalid));
                        this.f38761f.setTextColorByKey(org.telegram.ui.ActionBar.i6.f21022p7);
                        return false;
                    }
                }
            } else {
                this.f38761f.setText(LocaleController.getString(R.string.LinkInvalid));
                this.f38761f.setTextColorByKey(org.telegram.ui.ActionBar.i6.f21022p7);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.f38761f.setText(LocaleController.getString(R.string.LinkInvalidLong));
                this.f38761f.setTextColorByKey(org.telegram.ui.ActionBar.i6.f21022p7);
                return false;
            }
            this.f38761f.setText(LocaleController.getString(R.string.LinkChecking));
            this.f38761f.setTextColorByKey(org.telegram.ui.ActionBar.i6.F6);
            this.f38765i0 = str;
            sg sgVar2 = new sg(17, this, str);
            this.f38766j0 = sgVar2;
            AndroidUtilities.runOnUIThread(sgVar2, 300L);
            return true;
        }
        if (this.f38753a0) {
            this.f38761f.setText(LocaleController.getString(R.string.LinkInvalidShort));
        } else {
            this.f38761f.setText(LocaleController.getString(R.string.LinkInvalidShortMega));
        }
        this.f38761f.setTextColorByKey(org.telegram.ui.ActionBar.i6.f21022p7);
        return false;
    }

    public final void X(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.Z);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ci.s3(6, this, z10)), this.classGuid);
    }

    public final void Y() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ip.Y():void");
    }

    public final void Z() {
        if (getParentActivity() == null) {
            return;
        }
        rg.j0 j0Var = new rg.j0(2, this.currentAccount, getParentActivity(), this, null);
        j0Var.f47338v0 = this.f38753a0;
        j0Var.H0 = new xo(this, 0);
        showDialog(j0Var);
    }

    public final void a0(boolean z10) {
        float f7;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.f38773q0);
        }
        if (this.f38774r != null) {
            ValueAnimator valueAnimator = this.f38775r0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f38774r.f27135c;
            float f11 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f38775r0 = ofFloat;
            ofFloat.addUpdateListener(new c3(this, 7));
            ValueAnimator valueAnimator2 = this.f38775r0;
            float f12 = this.f38774r.f27135c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.f38775r0.setInterpolator(org.telegram.ui.Components.is.f27443f);
            this.f38775r0.start();
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
        if (!this.V && !this.f38757c0 && getUserConfig().isPremium()) {
            this.f38756c.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.e9 e9Var = this.f38756c;
            int i20 = org.telegram.ui.ActionBar.i6.f21022p7;
            e9Var.setTag(Integer.valueOf(i20));
            this.f38756c.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i20, false));
            this.f38781y.setVisibility(8);
            this.f38761f.setVisibility(8);
            this.J.setVisibility(8);
            this.f38760e0.setVisibility(0);
            if (this.f38758d0) {
                this.f38763g0.setVisibility(0);
                this.f38780x.setVisibility(8);
            } else {
                this.f38763g0.setVisibility(8);
                this.f38780x.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var2 = this.f38756c;
            int i21 = org.telegram.ui.ActionBar.i6.B6;
            e9Var2.setTag(Integer.valueOf(i21));
            this.f38756c.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i21, false));
            if (this.f38770n0) {
                this.J.setVisibility(8);
            } else {
                this.J.setVisibility(0);
            }
            this.f38760e0.setVisibility(8);
            this.f38780x.setVisibility(8);
            this.f38781y.setVisibility(0);
            this.f38763g0.setVisibility(8);
            if (this.f38753a0) {
                org.telegram.ui.Cells.e9 e9Var3 = this.f38756c;
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
                org.telegram.ui.Cells.e9 e9Var4 = this.f38756c;
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
            LinearLayout linearLayout3 = this.f38781y;
            if (this.V) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.y90 y90Var = this.G;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f38768l0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            y90Var.setLink(str);
            this.G.c(this.f38768l0, this.Z);
            cp cpVar = this.f38761f;
            if (!this.V && cpVar.f22050a.length() != 0) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            cpVar.setVisibility(i14);
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
        this.f38779w.a(this.V);
        this.f38752a.clearFocus();
        ep epVar = this.U;
        if (epVar != null) {
            if (this.f38753a0 && !this.V) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            epVar.setVisibility(i18);
            ep epVar2 = this.U;
            TLRPC.ChatFull chatFull2 = this.Y;
            if (chatFull2 == null || chatFull2.linked_chat_id == 0 || this.f38753a0) {
                z10 = false;
            }
            epVar2.c(z10);
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
        org.telegram.ui.ActionBar.z o9 = this.actionBar.o();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i13 = org.telegram.ui.ActionBar.i6.f21134v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, i13, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.hs hsVar = new org.telegram.ui.Components.hs(mutate, new org.telegram.ui.Components.jq(org.telegram.ui.ActionBar.i6.x0(null, i13, false)));
        this.f38774r = hsVar;
        this.f38769n = o9.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), hsVar);
        this.h = new yd(context);
        ap apVar = new ap(this, context, this.h, this.resourceProvider);
        this.fragmentView = apVar;
        apVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20745a7, false));
        org.telegram.ui.Components.fp0 fp0Var = (org.telegram.ui.Components.fp0) this.fragmentView;
        fp0Var.setFillViewport(true);
        fp0Var.addView(this.h, new FrameLayout.LayoutParams(-1, -2));
        this.actionBar.setAdaptiveBackground(fp0Var);
        this.h.setOrientation(1);
        boolean z11 = this.f38770n0;
        if (z11) {
            this.actionBar.setTitle(LocaleController.getString(R.string.TypeLocationGroup));
        } else if (this.f38753a0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSettingsTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.GroupSettingsTitle));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f38776s = linearLayout;
        linearLayout.setOrientation(1);
        this.h.addView(this.f38776s, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
        this.f38759e = m4Var;
        m4Var.setHeight(46);
        if (this.f38753a0) {
            this.f38759e.setText(LocaleController.getString(R.string.ChannelTypeHeader));
        } else {
            this.f38759e.setText(LocaleController.getString(R.string.GroupTypeHeader));
        }
        this.f38776s.addView(this.f38759e);
        org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, false);
        this.f38779w = j6Var;
        if (this.f38753a0) {
            j6Var.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, this.V);
        } else {
            j6Var.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, this.V);
        }
        this.f38776s.addView(this.f38779w, w7.x5.n(-1, -2));
        this.f38779w.setOnClickListener(new zo(this, 1));
        org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(context, false);
        this.v = j6Var2;
        if (this.f38753a0) {
            j6Var2.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !this.V);
        } else {
            j6Var2.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !this.V);
        }
        this.f38776s.addView(this.v, w7.x5.n(-1, -2));
        this.v.setOnClickListener(new zo(this, 2));
        org.telegram.ui.Cells.b7 b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
        this.J = b7Var;
        this.h.addView(b7Var, w7.x5.n(-1, -2));
        if (z11) {
            this.f38779w.setVisibility(8);
            this.v.setVisibility(8);
            this.J.setVisibility(8);
            this.f38759e.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f38781y = linearLayout2;
        linearLayout2.setOrientation(1);
        this.h.addView(this.f38781y, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context, 23);
        this.d = m4Var2;
        this.f38781y.addView(m4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setOrientation(0);
        this.f38781y.addView(this.E, w7.x5.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f38754b = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().linkPrefix + "/");
        this.f38754b.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f38754b;
        int i14 = org.telegram.ui.ActionBar.i6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.i6.x0(null, i14, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f38754b;
        int i15 = org.telegram.ui.ActionBar.i6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i15, false));
        this.f38754b.setMaxLines(1);
        this.f38754b.setLines(1);
        this.f38754b.setEnabled(false);
        this.f38754b.setBackground(null);
        this.f38754b.setPadding(0, 0, 0, 0);
        this.f38754b.setSingleLine(true);
        this.f38754b.setInputType(163840);
        this.f38754b.setImeOptions(6);
        this.E.addView(this.f38754b, w7.x5.n(-2, 36));
        ci.g2 g2Var = new ci.g2(this, context, 3);
        this.f38752a = g2Var;
        g2Var.setTextSize(1, 18.0f);
        this.f38752a.setHintTextColor(org.telegram.ui.ActionBar.i6.x0(null, i14, false));
        this.f38752a.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i15, false));
        this.f38752a.setMaxLines(1);
        this.f38752a.setLines(1);
        this.f38752a.setBackground(null);
        this.f38752a.setPadding(0, 0, 0, 0);
        this.f38752a.setSingleLine(true);
        this.f38752a.setInputType(163872);
        this.f38752a.setImeOptions(6);
        this.f38752a.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
        this.f38752a.setCursorColor(org.telegram.ui.ActionBar.i6.x0(null, i15, false));
        this.f38752a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f38752a.setCursorWidth(1.5f);
        this.E.addView(this.f38752a, w7.x5.n(-1, 36));
        this.f38752a.addTextChangedListener(new m0(this, 3));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.F = linearLayout4;
        linearLayout4.setOrientation(1);
        this.f38781y.addView(this.F, w7.x5.n(-1, -2));
        org.telegram.ui.Components.y90 y90Var = new org.telegram.ui.Components.y90(context, this, null, true, ChatObject.isChannel(this.X));
        this.G = y90Var;
        y90Var.setDelegate(new bp(this, context));
        this.G.d(0, null, false);
        this.F.addView(this.G);
        cp cpVar = new cp(this, context, this.resourceProvider);
        this.f38761f = cpVar;
        cpVar.setBottomPadding(6);
        this.h.addView(this.f38761f, w7.x5.n(-2, -2));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.f38756c = e9Var;
        e9Var.setImportantForAccessibility(1);
        this.h.addView(this.f38756c, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.s4 s4Var = new org.telegram.ui.Cells.s4(context);
        this.f38763g0 = s4Var;
        this.h.addView(s4Var, w7.x5.n(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.f38780x = linearLayout5;
        linearLayout5.setOrientation(1);
        this.h.addView(this.f38780x, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.b7 b7Var2 = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
        this.f38760e0 = b7Var2;
        this.h.addView(b7Var2, w7.x5.n(-1, -2));
        yd ydVar = this.h;
        hp hpVar = new hp(this, context);
        this.K = hpVar;
        ydVar.addView(hpVar, w7.x5.n(-1, -2));
        hp hpVar2 = this.K;
        if (!this.V && !this.N.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        hpVar2.setVisibility(i10);
        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
        this.H = r8Var;
        r8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ManageInviteLinks), false);
        this.H.setOnClickListener(new zo(this, 3));
        this.h.addView(this.H, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        this.I = e9Var2;
        this.h.addView(e9Var2, w7.x5.n(-1, -2));
        ep epVar = new ep(this, context, this.X, context);
        this.U = epVar;
        TLRPC.ChatFull chatFull = this.Y;
        if (chatFull != null && chatFull.linked_chat_id != 0 && !this.f38753a0) {
            z10 = true;
        } else {
            z10 = false;
        }
        epVar.c(z10);
        ep epVar2 = this.U;
        TLRPC.ChatFull chatFull2 = this.Y;
        org.telegram.ui.Cells.e9 e9Var3 = epVar2.f29076e;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(epVar2.f29078n);
        boolean isPublic = ChatObject.isPublic(epVar2.f29078n);
        if (chatFull2 != null && chatFull2.guard_bot_id != 0) {
            String str = "@" + DialogObject.getPublicUsername(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(chatFull2.guard_bot_id)));
            if (isChannelAndNotMegaGroup) {
                i12 = R.string.ChannelSettingsJoinRequestInfoManagedBy;
            } else if (isPublic) {
                i12 = R.string.GroupPublicSettingsJoinRequestInfoManagedBy;
            } else {
                i12 = R.string.GroupPrivateSettingsJoinRequestInfoManagedBy;
            }
            e9Var3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i12, str), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.il, false), new org.telegram.ui.Components.as(24, chatFull2, this)));
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
        this.Q.addView(this.R, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context);
        this.S = w8Var;
        w8Var.f(LocaleController.getString(R.string.RestrictSavingContent), this.f38755b0, false);
        this.S.setOnClickListener(new zo(this, 4));
        this.Q.addView(this.S, w7.x5.n(-1, -2));
        this.T = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        if (this.f38753a0 && !ChatObject.isMegagroup(this.X)) {
            this.T.setText(LocaleController.getString(R.string.RestrictSavingContentInfoChannel));
        } else {
            this.T.setText(LocaleController.getString(R.string.RestrictSavingContentInfoGroup));
        }
        this.Q.addView(this.T, w7.x5.n(-1, -2));
        String publicUsername = ChatObject.getPublicUsername(this.X, true);
        if (!this.V && publicUsername != null) {
            this.m0 = true;
            this.f38752a.setText(publicUsername);
            this.f38752a.setSelection(publicUsername.length());
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
                this.f38768l0 = chatFull.exported_invite;
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
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20745a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21134v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21098t8));
        int i10 = org.telegram.ui.ActionBar.i6.f20765b7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.J, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.i6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.i6.f20892i6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 4096, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.i6.f21022p7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 4, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 4096, null, null, null, null, i12));
        int i14 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 4, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38752a, 4, null, null, null, null, i14));
        ci.g2 g2Var = this.f38752a;
        int i15 = org.telegram.ui.ActionBar.i6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(g2Var, 8388608, null, null, null, null, i15));
        LinearLayout linearLayout = this.f38776s;
        int i16 = org.telegram.ui.ActionBar.i6.f20801d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(linearLayout, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38781y, 1, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.i6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38759e, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.R, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38754b, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38754b, 8388608, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38761f, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38761f, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38761f, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21150w6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38756c, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38756c, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38756c, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.I, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.I, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.I, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.T, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.T, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.T, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38760e0, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38780x, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38763g0, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20873h6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 4096, null, null, null, null, i12));
        int i18 = org.telegram.ui.ActionBar.i6.f20858g7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        int i19 = org.telegram.ui.ActionBar.i6.f20874h7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        int i20 = org.telegram.ui.ActionBar.i6.f21203z6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38779w, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38779w, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38779w, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38779w, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38779w, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38780x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i14));
        int i21 = org.telegram.ui.ActionBar.i6.f21185y6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38780x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38780x, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38780x, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, org.telegram.ui.ActionBar.i6.f21053r0, eVar, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.H, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.H, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.H, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20966m6));
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
        if (this.f38770n0 && (g2Var = this.f38752a) != null) {
            g2Var.requestFocus();
            AndroidUtilities.showKeyboard(this.f38752a);
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
            this.f38768l0 = tL_chatInviteExported;
            org.telegram.ui.Components.y90 y90Var = this.G;
            if (tL_chatInviteExported == null) {
                str = null;
            } else {
                str = tL_chatInviteExported.link;
            }
            y90Var.setLink(str);
            this.G.c(this.f38768l0, this.Z);
        }
    }
}
