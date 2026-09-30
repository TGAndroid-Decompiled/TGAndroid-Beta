package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class pr extends cb {
    public final boolean X;
    public final i80 Y;
    public TLRPC.InputPeer Z;
    public final boolean f27460a0;
    public String f27461b0;
    public String f27462c0;
    public SpannableStringBuilder f27463d0;
    public m61 f27464e0;
    public final boolean f27465f0;
    public or f27466g0;

    public pr(Context context, int i10, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, ai.g3 g3Var, ai.d dVar) {
        int i11;
        pr cbVar = new cb(context, null, false, false, dVar);
        cbVar.X = true;
        cbVar.v = 0.126f;
        cbVar.Y = null;
        cbVar.f27460a0 = false;
        long peerDialogId = DialogObject.getPeerDialogId(getgroupcallstreamrtmpurl.peer);
        boolean z10 = g3Var != null && (peerDialogId >= 0 || ChatObject.isCreator(MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId))));
        if (g3Var != null) {
            cbVar.f27465f0 = true;
            ci.d dVar2 = new ci.d(context, dVar, true);
            dVar2.g(LocaleController.getString(R.string.LiveStoryRTMPEnable), false, true);
            cbVar.containerView.addView(dVar2, w7.y5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z10 ? 52 : 0) + 12));
            dVar2.setOnClickListener(new ai.d0(cbVar, g3Var, dVar2, 18));
            if (z10) {
                ci.d dVar3 = new ci.d(context, dVar, false);
                dVar3.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19334r7, false));
                dVar3.d.u(AndroidUtilities.bold());
                dVar3.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
                cbVar = this;
                dVar3.setOnClickListener(new ei.m3(this, context, dVar, dVar3, getgroupcallstreamrtmpurl, i10));
                cbVar.containerView.addView(dVar3, w7.y5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        s4.j jVar = new s4.j();
        jVar.f43103m = false;
        jVar.C = false;
        jVar.o(tr.h);
        jVar.n(350L);
        cbVar.d.setItemAnimator(jVar);
        zl0 zl0Var = cbVar.d;
        int i12 = cbVar.backgroundPaddingLeft;
        if (cbVar.f27465f0) {
            i11 = AndroidUtilities.dp(z10 ? 124.0f : 72.0f);
        } else {
            i11 = 0;
        }
        zl0Var.setPadding(i12, 0, i12, i11);
        cbVar.fixNavigationBar();
        cbVar.N();
        cbVar.f27461b0 = groupcallstreamrtmpurl.url;
        cbVar.f27462c0 = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cbVar.f27462c0);
        cbVar.f27463d0 = spannableStringBuilder;
        ?? obj = new Object();
        obj.f23824a |= 256;
        obj.f23825b = 0;
        obj.f23826c = spannableStringBuilder.length();
        cbVar.f27463d0.setSpan(new f11(obj, 0), 0, cbVar.f27463d0.length(), 0);
        cbVar.f27464e0.N(false);
    }

    public static void P(pr prVar, TLRPC.Peer peer) {
        prVar.Z = MessagesController.getInstance(prVar.currentAccount).getInputPeer(MessageObject.getPeerId(peer));
        prVar.dismiss();
    }

    public static void Q(pr prVar, ci.d dVar, long j3) {
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(prVar.currentAccount).getInputPeer(j3);
        getgroupcallstreamrtmpurl.revoke = true;
        ConnectionsManager.getInstance(prVar.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new kr(prVar, dVar, 0));
    }

    public static void R(pr prVar, ArrayList arrayList) {
        int i10;
        String str = null;
        if (prVar.f27466g0 == null) {
            Context context = prVar.getContext();
            org.telegram.ui.ActionBar.d6 d6Var = prVar.resourcesProvider;
            ?? linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_streaming, 112, 112, null);
            imageView.d();
            linearLayout.addView(imageView, w7.y5.t(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.formatString(R.string.Streaming, new Object[0]));
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
            linearLayout.addView(textView, w7.y5.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19182j5, d6Var));
            textView2.setText(LocaleController.formatString(R.string.VoipStreamStart, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            linearLayout.addView(textView2, w7.y5.t(-2, -2, 1, 28, 0, 28, 17));
            prVar.f27466g0 = linearLayout;
        }
        arrayList.add(y51.k(prVar.f27466g0));
        arrayList.add(y51.B(null));
        com.google.android.gms.internal.vision.e2.n(R.string.VoipChatStreamSettings, arrayList);
        String str2 = prVar.f27461b0;
        String string = LocaleController.getString(R.string.VoipChatStreamServerUrl);
        int i11 = nr.f26771a;
        y51 J = y51.J(nr.class);
        J.f30637l = str2;
        J.f30639n = string;
        J.f30635j = false;
        J.f30633g = false;
        arrayList.add(J);
        SpannableStringBuilder spannableStringBuilder = prVar.f27463d0;
        String string2 = LocaleController.getString(R.string.VoipChatStreamKey);
        y51 J2 = y51.J(nr.class);
        J2.f30637l = spannableStringBuilder;
        J2.f30639n = string2;
        J2.f30635j = true;
        J2.f30633g = false;
        arrayList.add(J2);
        if (prVar.f27465f0) {
            if (prVar.X) {
                i10 = R.string.VoipChatStreamWithAnotherAppDescriptionStory;
            } else {
                i10 = R.string.VoipChatStreamWithAnotherAppDescription;
            }
            str = LocaleController.getString(i10);
        }
        arrayList.add(y51.B(str));
    }

    public static void S(pr prVar, Context context, ci.d dVar, long j3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, prVar.resourcesProvider);
        alertDialog$Builder.f18678a.R = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
        alertDialog$Builder.f18678a.T = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new ci.q9(prVar, dVar, j3, 3));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    @Override
    public final void dismissInternal() {
        TLRPC.InputPeer inputPeer;
        super.dismissInternal();
        i80 i80Var = this.Y;
        if (i80Var != null && (inputPeer = this.Z) != null) {
            i80Var.a(inputPeer, this.f27460a0, false, true);
        }
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        m61 m61Var = new m61(zl0Var, getContext(), this.currentAccount, 0, true, new d(this, 7), this.resourcesProvider);
        this.f27464e0 = m61Var;
        return m61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Streaming);
    }

    public pr(org.telegram.ui.ActionBar.m2 m2Var, TLRPC.Peer peer, long j3, boolean z10, i80 i80Var) {
        super(m2Var, false);
        this.X = false;
        this.v = 0.26f;
        this.Y = i80Var;
        this.f27460a0 = z10;
        Context context = this.containerView.getContext();
        boolean isCreator = ChatObject.isCreator(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3)));
        this.f27465f0 = true;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.VoipChannelStartStreaming));
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Sh, this.resourcesProvider));
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, this.resourcesProvider);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19076d6, false), 120);
        textView.setBackground(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, v02, k10, k10));
        this.containerView.addView(textView, w7.y5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (isCreator ? 52 : 0) + 12));
        textView.setOnClickListener(new org.telegram.ui.pf(26, this, peer));
        if (isCreator) {
            ci.d dVar = new ci.d(context, this.resourcesProvider, false);
            dVar.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19334r7, false));
            dVar.d.u(AndroidUtilities.bold());
            dVar.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
            dVar.setOnClickListener(new mr(this, context, dVar, j3, 0));
            this.containerView.addView(dVar, w7.y5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        zl0 zl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i10, 0, i10, AndroidUtilities.dp((isCreator ? 52 : 0) + 72));
        s4.j jVar = new s4.j();
        jVar.f43103m = false;
        jVar.C = false;
        jVar.o(tr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        fixNavigationBar();
        N();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j3);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new y1(this, 2));
    }
}
