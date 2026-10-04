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
    public final boolean f29729a0;
    public String f29730b0;
    public String f29731c0;
    public SpannableStringBuilder f29732d0;
    public u61 f29733e0;
    public final boolean f29734f0;
    public or f29735g0;

    public pr(Context context, int i10, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, ai.g3 g3Var, ai.d dVar) {
        int i11;
        pr cbVar = new cb(context, null, false, false, dVar);
        cbVar.X = true;
        cbVar.v = 0.126f;
        cbVar.Y = null;
        cbVar.f29729a0 = false;
        long peerDialogId = DialogObject.getPeerDialogId(getgroupcallstreamrtmpurl.peer);
        boolean z10 = g3Var != null && (peerDialogId >= 0 || ChatObject.isCreator(MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId))));
        if (g3Var != null) {
            cbVar.f29734f0 = true;
            ci.d dVar2 = new ci.d(context, dVar, true);
            dVar2.g(LocaleController.getString(R.string.LiveStoryRTMPEnable), false, true);
            cbVar.containerView.addView(dVar2, w7.z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z10 ? 52 : 0) + 12));
            dVar2.setOnClickListener(new ai.d0(cbVar, g3Var, dVar2, 18));
            if (z10) {
                ci.d dVar3 = new ci.d(context, dVar, false);
                dVar3.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21083r7, false));
                dVar3.d.u(AndroidUtilities.bold());
                dVar3.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
                cbVar = this;
                dVar3.setOnClickListener(new ei.n3(this, context, dVar, dVar3, getgroupcallstreamrtmpurl, i10));
                cbVar.containerView.addView(dVar3, w7.z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        s4.j jVar = new s4.j();
        jVar.f46570m = false;
        jVar.C = false;
        jVar.o(tr.h);
        jVar.n(350L);
        cbVar.d.setItemAnimator(jVar);
        zl0 zl0Var = cbVar.d;
        int i12 = cbVar.backgroundPaddingLeft;
        if (cbVar.f29734f0) {
            i11 = AndroidUtilities.dp(z10 ? 124.0f : 72.0f);
        } else {
            i11 = 0;
        }
        zl0Var.setPadding(i12, 0, i12, i11);
        cbVar.fixNavigationBar();
        cbVar.L();
        cbVar.f29730b0 = groupcallstreamrtmpurl.url;
        cbVar.f29731c0 = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cbVar.f29731c0);
        cbVar.f29732d0 = spannableStringBuilder;
        ?? obj = new Object();
        obj.f28502a |= 256;
        obj.f28503b = 0;
        obj.f28504c = spannableStringBuilder.length();
        cbVar.f29732d0.setSpan(new n11(obj, 0), 0, cbVar.f29732d0.length(), 0);
        cbVar.f29733e0.N(false);
    }

    public static void N(pr prVar, TLRPC.Peer peer) {
        prVar.Z = MessagesController.getInstance(prVar.currentAccount).getInputPeer(MessageObject.getPeerId(peer));
        prVar.dismiss();
    }

    public static void O(pr prVar, ci.d dVar, long j3) {
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(prVar.currentAccount).getInputPeer(j3);
        getgroupcallstreamrtmpurl.revoke = true;
        ConnectionsManager.getInstance(prVar.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new kr(prVar, dVar, 0));
    }

    public static void P(pr prVar, ArrayList arrayList) {
        int i10;
        String str = null;
        if (prVar.f29735g0 == null) {
            Context context = prVar.getContext();
            org.telegram.ui.ActionBar.d6 d6Var = prVar.resourcesProvider;
            ?? linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_streaming, 112, 112, null);
            imageView.d();
            linearLayout.addView(imageView, w7.z5.t(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.formatString(R.string.Streaming, new Object[0]));
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, d6Var));
            linearLayout.addView(textView, w7.z5.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20930j5, d6Var));
            textView2.setText(LocaleController.formatString(R.string.VoipStreamStart, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            linearLayout.addView(textView2, w7.z5.t(-2, -2, 1, 28, 0, 28, 17));
            prVar.f29735g0 = linearLayout;
        }
        arrayList.add(g61.k(prVar.f29735g0));
        arrayList.add(g61.B(null));
        com.google.android.gms.internal.vision.e2.n(R.string.VoipChatStreamSettings, arrayList);
        String str2 = prVar.f29730b0;
        String string = LocaleController.getString(R.string.VoipChatStreamServerUrl);
        int i11 = nr.f29052a;
        g61 J = g61.J(nr.class);
        J.f26674l = str2;
        J.f26676n = string;
        J.f26672j = false;
        J.f26670g = false;
        arrayList.add(J);
        SpannableStringBuilder spannableStringBuilder = prVar.f29732d0;
        String string2 = LocaleController.getString(R.string.VoipChatStreamKey);
        g61 J2 = g61.J(nr.class);
        J2.f26674l = spannableStringBuilder;
        J2.f26676n = string2;
        J2.f26672j = true;
        J2.f26670g = false;
        arrayList.add(J2);
        if (prVar.f29734f0) {
            if (prVar.X) {
                i10 = R.string.VoipChatStreamWithAnotherAppDescriptionStory;
            } else {
                i10 = R.string.VoipChatStreamWithAnotherAppDescription;
            }
            str = LocaleController.getString(i10);
        }
        arrayList.add(g61.B(str));
    }

    public static void Q(pr prVar, Context context, ci.d dVar, long j3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, prVar.resourcesProvider);
        alertDialog$Builder.f20372a.R = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
        alertDialog$Builder.f20372a.T = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new ci.p9(prVar, dVar, j3, 3));
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
            i80Var.a(inputPeer, this.f29729a0, false, true);
        }
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        u61 u61Var = new u61(zl0Var, getContext(), this.currentAccount, 0, true, new d(this, 7), this.resourcesProvider);
        this.f29733e0 = u61Var;
        return u61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Streaming);
    }

    public pr(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.Peer peer, long j3, boolean z10, i80 i80Var) {
        super(n2Var, false);
        this.X = false;
        this.v = 0.26f;
        this.Y = i80Var;
        this.f29729a0 = z10;
        Context context = this.containerView.getContext();
        boolean isCreator = ChatObject.isCreator(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3)));
        this.f29734f0 = true;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.VoipChannelStartStreaming));
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Sh, this.resourcesProvider));
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, this.resourcesProvider);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20822d6, false), 120);
        textView.setBackground(org.telegram.ui.ActionBar.i6.i0(dp, dp, dp, dp, v02, k10, k10));
        this.containerView.addView(textView, w7.z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (isCreator ? 52 : 0) + 12));
        textView.setOnClickListener(new org.telegram.ui.qf(26, this, peer));
        if (isCreator) {
            ci.d dVar = new ci.d(context, this.resourcesProvider, false);
            dVar.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21083r7, false));
            dVar.d.u(AndroidUtilities.bold());
            dVar.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
            dVar.setOnClickListener(new mr(this, context, dVar, j3, 0));
            this.containerView.addView(dVar, w7.z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        zl0 zl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i10, 0, i10, AndroidUtilities.dp((isCreator ? 52 : 0) + 72));
        s4.j jVar = new s4.j();
        jVar.f46570m = false;
        jVar.C = false;
        jVar.o(tr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        fixNavigationBar();
        L();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j3);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new y1(this, 2));
    }
}
