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
public final class nr extends bb {
    public final boolean X;
    public final v70 Y;
    public TLRPC.InputPeer Z;
    public final boolean f26497a0;
    public String f26498b0;
    public String f26499c0;
    public SpannableStringBuilder f26500d0;
    public v51 f26501e0;
    public final boolean f26502f0;
    public mr f26503g0;

    public nr(Context context, int i10, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, ai.g3 g3Var, ai.d dVar) {
        int i11;
        nr bbVar = new bb(context, null, false, false, dVar);
        bbVar.X = true;
        bbVar.v = 0.126f;
        bbVar.Y = null;
        bbVar.f26497a0 = false;
        long peerDialogId = DialogObject.getPeerDialogId(getgroupcallstreamrtmpurl.peer);
        boolean z10 = g3Var != null && (peerDialogId >= 0 || ChatObject.isCreator(MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId))));
        if (g3Var != null) {
            bbVar.f26502f0 = true;
            ci.d dVar2 = new ci.d(context, dVar, true);
            dVar2.g(LocaleController.getString(R.string.LiveStoryRTMPEnable), false, true);
            bbVar.containerView.addView(dVar2, w7.x5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z10 ? 52 : 0) + 12));
            dVar2.setOnClickListener(new ai.d0(bbVar, g3Var, dVar2, 18));
            if (z10) {
                ci.d dVar3 = new ci.d(context, dVar, false);
                dVar3.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19045r7, false));
                dVar3.d.u(AndroidUtilities.bold());
                dVar3.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
                bbVar = this;
                dVar3.setOnClickListener(new ei.m3(this, context, dVar, dVar3, getgroupcallstreamrtmpurl, i10));
                bbVar.containerView.addView(dVar3, w7.x5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        s4.j jVar = new s4.j();
        jVar.f42662m = false;
        jVar.C = false;
        jVar.o(rr.h);
        jVar.n(350L);
        bbVar.d.setItemAnimator(jVar);
        ml0 ml0Var = bbVar.d;
        int i12 = bbVar.backgroundPaddingLeft;
        if (bbVar.f26502f0) {
            i11 = AndroidUtilities.dp(z10 ? 124.0f : 72.0f);
        } else {
            i11 = 0;
        }
        ml0Var.setPadding(i12, 0, i12, i11);
        bbVar.fixNavigationBar();
        bbVar.N();
        bbVar.f26498b0 = groupcallstreamrtmpurl.url;
        bbVar.f26499c0 = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bbVar.f26499c0);
        bbVar.f26500d0 = spannableStringBuilder;
        ?? obj = new Object();
        obj.f26312a |= 256;
        obj.f26313b = 0;
        obj.f26314c = spannableStringBuilder.length();
        bbVar.f26500d0.setSpan(new o01(obj, 0), 0, bbVar.f26500d0.length(), 0);
        bbVar.f26501e0.N(false);
    }

    public static void P(nr nrVar, TLRPC.Peer peer) {
        nrVar.Z = MessagesController.getInstance(nrVar.currentAccount).getInputPeer(MessageObject.getPeerId(peer));
        nrVar.dismiss();
    }

    public static void Q(nr nrVar, ci.d dVar, long j3) {
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(nrVar.currentAccount).getInputPeer(j3);
        getgroupcallstreamrtmpurl.revoke = true;
        ConnectionsManager.getInstance(nrVar.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new ir(nrVar, dVar, 0));
    }

    public static void R(nr nrVar, ArrayList arrayList) {
        int i10;
        String str = null;
        if (nrVar.f26503g0 == null) {
            Context context = nrVar.getContext();
            org.telegram.ui.ActionBar.d6 d6Var = nrVar.resourcesProvider;
            ?? linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_streaming, 112, 112, null);
            imageView.d();
            linearLayout.addView(imageView, w7.x5.t(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.formatString(R.string.Streaming, new Object[0]));
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
            linearLayout.addView(textView, w7.x5.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18895j5, d6Var));
            textView2.setText(LocaleController.formatString(R.string.VoipStreamStart, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            linearLayout.addView(textView2, w7.x5.t(-2, -2, 1, 28, 0, 28, 17));
            nrVar.f26503g0 = linearLayout;
        }
        arrayList.add(h51.k(nrVar.f26503g0));
        arrayList.add(h51.B(null));
        com.google.android.gms.internal.vision.e2.n(R.string.VoipChatStreamSettings, arrayList);
        String str2 = nrVar.f26498b0;
        String string = LocaleController.getString(R.string.VoipChatStreamServerUrl);
        int i11 = lr.f25935a;
        h51 J = h51.J(lr.class);
        J.f24507l = str2;
        J.f24509n = string;
        J.f24505j = false;
        J.f24503g = false;
        arrayList.add(J);
        SpannableStringBuilder spannableStringBuilder = nrVar.f26500d0;
        String string2 = LocaleController.getString(R.string.VoipChatStreamKey);
        h51 J2 = h51.J(lr.class);
        J2.f24507l = spannableStringBuilder;
        J2.f24509n = string2;
        J2.f24505j = true;
        J2.f24503g = false;
        arrayList.add(J2);
        if (nrVar.f26502f0) {
            if (nrVar.X) {
                i10 = R.string.VoipChatStreamWithAnotherAppDescriptionStory;
            } else {
                i10 = R.string.VoipChatStreamWithAnotherAppDescription;
            }
            str = LocaleController.getString(i10);
        }
        arrayList.add(h51.B(str));
    }

    public static void S(nr nrVar, Context context, ci.d dVar, long j3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, nrVar.resourcesProvider);
        alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
        alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new ci.q9(nrVar, dVar, j3, 3));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    @Override
    public final void dismissInternal() {
        TLRPC.InputPeer inputPeer;
        super.dismissInternal();
        v70 v70Var = this.Y;
        if (v70Var != null && (inputPeer = this.Z) != null) {
            v70Var.a(inputPeer, this.f26497a0, false, true);
        }
    }

    @Override
    public final ll0 v(ml0 ml0Var) {
        v51 v51Var = new v51(ml0Var, getContext(), this.currentAccount, 0, true, new d(this, 7), this.resourcesProvider);
        this.f26501e0 = v51Var;
        return v51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Streaming);
    }

    public nr(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.Peer peer, long j3, boolean z10, v70 v70Var) {
        super(n2Var, false);
        this.X = false;
        this.v = 0.26f;
        this.Y = v70Var;
        this.f26497a0 = z10;
        Context context = this.containerView.getContext();
        boolean isCreator = ChatObject.isCreator(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3)));
        this.f26502f0 = true;
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
        int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false), 120);
        textView.setBackground(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, v02, k10, k10));
        this.containerView.addView(textView, w7.x5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (isCreator ? 52 : 0) + 12));
        textView.setOnClickListener(new org.telegram.ui.qf(26, this, peer));
        if (isCreator) {
            ci.d dVar = new ci.d(context, this.resourcesProvider, false);
            dVar.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19045r7, false));
            dVar.d.u(AndroidUtilities.bold());
            dVar.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
            dVar.setOnClickListener(new kr(this, context, dVar, j3, 0));
            this.containerView.addView(dVar, w7.x5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        ml0 ml0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        ml0Var.setPadding(i10, 0, i10, AndroidUtilities.dp((isCreator ? 52 : 0) + 72));
        s4.j jVar = new s4.j();
        jVar.f42662m = false;
        jVar.C = false;
        jVar.o(rr.h);
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
