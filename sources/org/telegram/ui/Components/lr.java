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
public final class lr extends bb {
    public final boolean X;
    public final u70 Y;
    public TLRPC.InputPeer Z;
    public final boolean f28291a0;
    public String f28292b0;
    public String f28293c0;
    public SpannableStringBuilder f28294d0;
    public v51 f28295e0;
    public final boolean f28296f0;
    public kr f28297g0;

    public lr(Context context, int i10, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, di.m2 m2Var, bi.b bVar) {
        int i11;
        lr bbVar = new bb(context, null, false, false, bVar);
        bbVar.X = true;
        bbVar.v = 0.126f;
        bbVar.Y = null;
        bbVar.f28291a0 = false;
        long peerDialogId = DialogObject.getPeerDialogId(getgroupcallstreamrtmpurl.peer);
        boolean z10 = m2Var != null && (peerDialogId >= 0 || ChatObject.isCreator(MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId))));
        if (m2Var != null) {
            bbVar.f28296f0 = true;
            di.d dVar = new di.d(context, bVar, true);
            dVar.g(LocaleController.getString(R.string.LiveStoryRTMPEnable), false, true);
            bbVar.containerView.addView(dVar, w7.x5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z10 ? 52 : 0) + 12));
            dVar.setOnClickListener(new bi.x(bbVar, m2Var, dVar, 18));
            if (z10) {
                di.d dVar2 = new di.d(context, bVar, false);
                dVar2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20917r7, false));
                dVar2.d.u(AndroidUtilities.bold());
                dVar2.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
                bbVar = this;
                dVar2.setOnClickListener(new fi.m3(this, context, bVar, dVar2, getgroupcallstreamrtmpurl, i10));
                bbVar.containerView.addView(dVar2, w7.x5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        s4.j jVar = new s4.j();
        jVar.f45777m = false;
        jVar.C = false;
        jVar.o(pr.h);
        jVar.n(350L);
        bbVar.d.setItemAnimator(jVar);
        ll0 ll0Var = bbVar.d;
        int i12 = bbVar.backgroundPaddingLeft;
        if (bbVar.f28296f0) {
            i11 = AndroidUtilities.dp(z10 ? 124.0f : 72.0f);
        } else {
            i11 = 0;
        }
        ll0Var.setPadding(i12, 0, i12, i11);
        bbVar.fixNavigationBar();
        bbVar.N();
        bbVar.f28292b0 = groupcallstreamrtmpurl.url;
        bbVar.f28293c0 = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bbVar.f28293c0);
        bbVar.f28294d0 = spannableStringBuilder;
        ?? obj = new Object();
        obj.f28591a |= 256;
        obj.f28592b = 0;
        obj.f28593c = spannableStringBuilder.length();
        bbVar.f28294d0.setSpan(new o01(obj, 0), 0, bbVar.f28294d0.length(), 0);
        bbVar.f28295e0.N(false);
    }

    public static void P(lr lrVar, TLRPC.Peer peer) {
        lrVar.Z = MessagesController.getInstance(lrVar.currentAccount).getInputPeer(MessageObject.getPeerId(peer));
        lrVar.dismiss();
    }

    public static void Q(lr lrVar, di.d dVar, long j3) {
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(lrVar.currentAccount).getInputPeer(j3);
        getgroupcallstreamrtmpurl.revoke = true;
        ConnectionsManager.getInstance(lrVar.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new gr(lrVar, dVar, 0));
    }

    public static void R(lr lrVar, ArrayList arrayList) {
        int i10;
        String str = null;
        if (lrVar.f28297g0 == null) {
            Context context = lrVar.getContext();
            org.telegram.ui.ActionBar.f6 f6Var = lrVar.resourcesProvider;
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
            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
            linearLayout.addView(textView, w7.x5.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20770j5, f6Var));
            textView2.setText(LocaleController.formatString(R.string.VoipStreamStart, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            linearLayout.addView(textView2, w7.x5.t(-2, -2, 1, 28, 0, 28, 17));
            lrVar.f28297g0 = linearLayout;
        }
        arrayList.add(h51.k(lrVar.f28297g0));
        arrayList.add(h51.B(null));
        i2.g.p(R.string.VoipChatStreamSettings, arrayList);
        String str2 = lrVar.f28292b0;
        String string = LocaleController.getString(R.string.VoipChatStreamServerUrl);
        int i11 = jr.f27559a;
        h51 J = h51.J(jr.class);
        J.f26594l = str2;
        J.f26596n = string;
        J.f26592j = false;
        J.f26590g = false;
        arrayList.add(J);
        SpannableStringBuilder spannableStringBuilder = lrVar.f28294d0;
        String string2 = LocaleController.getString(R.string.VoipChatStreamKey);
        h51 J2 = h51.J(jr.class);
        J2.f26594l = spannableStringBuilder;
        J2.f26596n = string2;
        J2.f26592j = true;
        J2.f26590g = false;
        arrayList.add(J2);
        if (lrVar.f28296f0) {
            if (lrVar.X) {
                i10 = R.string.VoipChatStreamWithAnotherAppDescriptionStory;
            } else {
                i10 = R.string.VoipChatStreamWithAnotherAppDescription;
            }
            str = LocaleController.getString(i10);
        }
        arrayList.add(h51.B(str));
    }

    public static void S(lr lrVar, Context context, di.d dVar, long j3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, lrVar.resourcesProvider);
        alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
        alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new di.s9(lrVar, dVar, j3, 3));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    @Override
    public final void dismissInternal() {
        TLRPC.InputPeer inputPeer;
        super.dismissInternal();
        u70 u70Var = this.Y;
        if (u70Var != null && (inputPeer = this.Z) != null) {
            u70Var.a(inputPeer, this.f28291a0, false, true);
        }
    }

    @Override
    public final kl0 v(ll0 ll0Var) {
        v51 v51Var = new v51(ll0Var, getContext(), this.currentAccount, 0, true, new d(this, 7), this.resourcesProvider);
        this.f28295e0 = v51Var;
        return v51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Streaming);
    }

    public lr(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.Peer peer, long j3, boolean z10, u70 u70Var) {
        super(n2Var, false);
        this.X = false;
        this.v = 0.26f;
        this.Y = u70Var;
        this.f28291a0 = z10;
        Context context = this.containerView.getContext();
        boolean isCreator = ChatObject.isCreator(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3)));
        this.f28296f0 = true;
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
        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20663d6, false), 120);
        textView.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v02, k10, k10));
        this.containerView.addView(textView, w7.x5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (isCreator ? 52 : 0) + 12));
        textView.setOnClickListener(new org.telegram.ui.rf(26, this, peer));
        if (isCreator) {
            di.d dVar = new di.d(context, this.resourcesProvider, false);
            dVar.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20917r7, false));
            dVar.d.u(AndroidUtilities.bold());
            dVar.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
            dVar.setOnClickListener(new ir(this, context, dVar, j3, 0));
            this.containerView.addView(dVar, w7.x5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        ll0 ll0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i10, 0, i10, AndroidUtilities.dp((isCreator ? 52 : 0) + 72));
        s4.j jVar = new s4.j();
        jVar.f45777m = false;
        jVar.C = false;
        jVar.o(pr.h);
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
