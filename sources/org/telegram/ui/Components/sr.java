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
public final class sr extends ab {
    public final boolean X;
    public final d80 Y;
    public TLRPC.InputPeer Z;
    public final boolean f27200a0;
    public String f27201b0;
    public String f27202c0;
    public SpannableStringBuilder f27203d0;
    public j61 f27204e0;
    public final boolean f27205f0;
    public rr f27206g0;

    public sr(Context context, int i10, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, bi.y2 y2Var, zh.b bVar) {
        int i11;
        sr abVar = new ab(context, null, false, false, bVar);
        abVar.X = true;
        abVar.v = 0.126f;
        abVar.Y = null;
        abVar.f27200a0 = false;
        long peerDialogId = DialogObject.getPeerDialogId(getgroupcallstreamrtmpurl.peer);
        boolean z10 = y2Var != null && (peerDialogId >= 0 || ChatObject.isCreator(MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId))));
        if (y2Var != null) {
            abVar.f27205f0 = true;
            bi.d dVar = new bi.d(context, bVar, true);
            dVar.g(LocaleController.getString(R.string.LiveStoryRTMPEnable), false, true);
            abVar.containerView.addView(dVar, w7.a6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z10 ? 52 : 0) + 12));
            dVar.setOnClickListener(new bi.q(abVar, y2Var, dVar, 14));
            if (z10) {
                bi.d dVar2 = new bi.d(context, bVar, false);
                dVar2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18181r7, false));
                dVar2.d.u(AndroidUtilities.bold());
                dVar2.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
                abVar = this;
                dVar2.setOnClickListener(new di.p3(this, context, bVar, dVar2, getgroupcallstreamrtmpurl, i10));
                abVar.containerView.addView(dVar2, w7.a6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        s4.j jVar = new s4.j();
        jVar.f41645m = false;
        jVar.C = false;
        jVar.o(wr.h);
        jVar.n(350L);
        abVar.d.setItemAnimator(jVar);
        vl0 vl0Var = abVar.d;
        int i12 = abVar.backgroundPaddingLeft;
        if (abVar.f27205f0) {
            i11 = AndroidUtilities.dp(z10 ? 124.0f : 72.0f);
        } else {
            i11 = 0;
        }
        vl0Var.setPadding(i12, 0, i12, i11);
        abVar.fixNavigationBar();
        abVar.N();
        abVar.f27201b0 = groupcallstreamrtmpurl.url;
        abVar.f27202c0 = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(abVar.f27202c0);
        abVar.f27203d0 = spannableStringBuilder;
        ?? obj = new Object();
        obj.f21677a |= 256;
        obj.f21678b = 0;
        obj.f21679c = spannableStringBuilder.length();
        abVar.f27203d0.setSpan(new c11(obj, 0), 0, abVar.f27203d0.length(), 0);
        abVar.f27204e0.N(false);
    }

    public static void P(sr srVar, TLRPC.Peer peer) {
        srVar.Z = MessagesController.getInstance(srVar.currentAccount).getInputPeer(MessageObject.getPeerId(peer));
        srVar.dismiss();
    }

    public static void Q(sr srVar, bi.d dVar, long j3) {
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(srVar.currentAccount).getInputPeer(j3);
        getgroupcallstreamrtmpurl.revoke = true;
        ConnectionsManager.getInstance(srVar.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new nr(srVar, dVar, 0));
    }

    public static void R(sr srVar, ArrayList arrayList) {
        int i10;
        String str = null;
        if (srVar.f27206g0 == null) {
            Context context = srVar.getContext();
            org.telegram.ui.ActionBar.f6 f6Var = srVar.resourcesProvider;
            ?? linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_streaming, 112, 112, null);
            imageView.d();
            linearLayout.addView(imageView, w7.a6.t(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.formatString(R.string.Streaming, new Object[0]));
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
            linearLayout.addView(textView, w7.a6.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18034j5, f6Var));
            textView2.setText(LocaleController.formatString(R.string.VoipStreamStart, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            linearLayout.addView(textView2, w7.a6.t(-2, -2, 1, 28, 0, 28, 17));
            srVar.f27206g0 = linearLayout;
        }
        arrayList.add(v51.k(srVar.f27206g0));
        arrayList.add(v51.B(null));
        com.google.android.gms.internal.vision.e2.m(R.string.VoipChatStreamSettings, arrayList);
        String str2 = srVar.f27201b0;
        String string = LocaleController.getString(R.string.VoipChatStreamServerUrl);
        int i11 = qr.f26476a;
        v51 J = v51.J(qr.class);
        J.f27829l = str2;
        J.f27831n = string;
        J.f27827j = false;
        J.f27825g = false;
        arrayList.add(J);
        SpannableStringBuilder spannableStringBuilder = srVar.f27203d0;
        String string2 = LocaleController.getString(R.string.VoipChatStreamKey);
        v51 J2 = v51.J(qr.class);
        J2.f27829l = spannableStringBuilder;
        J2.f27831n = string2;
        J2.f27827j = true;
        J2.f27825g = false;
        arrayList.add(J2);
        if (srVar.f27205f0) {
            if (srVar.X) {
                i10 = R.string.VoipChatStreamWithAnotherAppDescriptionStory;
            } else {
                i10 = R.string.VoipChatStreamWithAnotherAppDescription;
            }
            str = LocaleController.getString(i10);
        }
        arrayList.add(v51.B(str));
    }

    public static void S(sr srVar, Context context, bi.d dVar, long j3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, srVar.resourcesProvider);
        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
        alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new bi.bb(srVar, dVar, j3, 3));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    @Override
    public final void dismissInternal() {
        TLRPC.InputPeer inputPeer;
        super.dismissInternal();
        d80 d80Var = this.Y;
        if (d80Var != null && (inputPeer = this.Z) != null) {
            d80Var.a(inputPeer, this.f27200a0, false, true);
        }
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        j61 j61Var = new j61(vl0Var, getContext(), this.currentAccount, 0, true, new e(this, 7), this.resourcesProvider);
        this.f27204e0 = j61Var;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Streaming);
    }

    public sr(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.Peer peer, long j3, boolean z10, d80 d80Var) {
        super(p2Var, false);
        this.X = false;
        this.v = 0.26f;
        this.Y = d80Var;
        this.f27200a0 = z10;
        Context context = this.containerView.getContext();
        boolean isCreator = ChatObject.isCreator(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3)));
        this.f27205f0 = true;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.VoipChannelStartStreaming));
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, this.resourcesProvider));
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.resourcesProvider);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false), 120);
        textView.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v02, k10, k10));
        this.containerView.addView(textView, w7.a6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (isCreator ? 52 : 0) + 12));
        textView.setOnClickListener(new org.telegram.ui.sh(23, this, peer));
        if (isCreator) {
            bi.d dVar = new bi.d(context, this.resourcesProvider, false);
            dVar.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18181r7, false));
            dVar.d.u(AndroidUtilities.bold());
            dVar.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
            dVar.setOnClickListener(new pr(this, context, dVar, j3, 0));
            this.containerView.addView(dVar, w7.a6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        vl0 vl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i10, 0, i10, AndroidUtilities.dp((isCreator ? 52 : 0) + 72));
        s4.j jVar = new s4.j();
        jVar.f41645m = false;
        jVar.C = false;
        jVar.o(wr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        fixNavigationBar();
        N();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j3);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new z1(this, 2));
    }
}
