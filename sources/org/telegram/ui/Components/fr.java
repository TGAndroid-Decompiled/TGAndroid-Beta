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
public final class fr extends xa {
    public final boolean T;
    public final r70 U;
    public TLRPC.InputPeer V;
    public final boolean W;
    public String X;
    public String Y;
    public SpannableStringBuilder Z;
    public k51 f28520a0;
    public final boolean f28521b0;
    public er f28522c0;

    public fr(Context context, int i10, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, ih.b1 b1Var, lh.b bVar) {
        int i11;
        fr xaVar = new xa(context, null, false, false, false, 1, bVar);
        xaVar.T = true;
        xaVar.v = 0.126f;
        xaVar.U = null;
        xaVar.W = false;
        long peerDialogId = DialogObject.getPeerDialogId(getgroupcallstreamrtmpurl.peer);
        boolean z10 = b1Var != null && (peerDialogId >= 0 || ChatObject.isCreator(MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId))));
        if (b1Var != null) {
            xaVar.f28521b0 = true;
            nh.d dVar = new nh.d(context, bVar, true);
            dVar.g(LocaleController.getString(R.string.LiveStoryRTMPEnable), false, true);
            xaVar.containerView.addView(dVar, i7.f6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z10 ? 52 : 0) + 12));
            dVar.setOnClickListener(new bg.q(xaVar, b1Var, dVar, 24));
            if (z10) {
                nh.d dVar2 = new nh.d(context, bVar, false);
                dVar2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23311r7, false));
                dVar2.d.u(AndroidUtilities.bold());
                dVar2.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
                xaVar = this;
                dVar2.setOnClickListener(new jh.r8(this, context, bVar, dVar2, getgroupcallstreamrtmpurl, i10, 3));
                xaVar.containerView.addView(dVar2, i7.f6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        f2.l lVar = new f2.l();
        lVar.f6463m = false;
        lVar.C = false;
        lVar.o(jr.h);
        lVar.n(350L);
        xaVar.d.setItemAnimator(lVar);
        jl0 jl0Var = xaVar.d;
        int i12 = xaVar.backgroundPaddingLeft;
        if (xaVar.f28521b0) {
            i11 = AndroidUtilities.dp(z10 ? 124.0f : 72.0f);
        } else {
            i11 = 0;
        }
        jl0Var.setPadding(i12, 0, i12, i11);
        xaVar.fixNavigationBar();
        xaVar.M();
        xaVar.X = groupcallstreamrtmpurl.url;
        xaVar.Y = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(xaVar.Y);
        xaVar.Z = spannableStringBuilder;
        ?? obj = new Object();
        obj.f29024a |= 256;
        obj.f29025b = 0;
        obj.f29026c = spannableStringBuilder.length();
        xaVar.Z.setSpan(new i01(obj, 0), 0, xaVar.Z.length(), 0);
        xaVar.f28520a0.N(false);
    }

    public static void P(fr frVar, TLRPC.Peer peer) {
        frVar.V = MessagesController.getInstance(frVar.currentAccount).getInputPeer(MessageObject.getPeerId(peer));
        frVar.dismiss();
    }

    public static void Q(fr frVar, nh.d dVar, long j10) {
        if (dVar.J) {
            return;
        }
        dVar.setLoading(true);
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(frVar.currentAccount).getInputPeer(j10);
        getgroupcallstreamrtmpurl.revoke = true;
        ConnectionsManager.getInstance(frVar.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new br(frVar, dVar, 0));
    }

    public static void R(fr frVar, ArrayList arrayList) {
        int i10;
        String str = null;
        if (frVar.f28522c0 == null) {
            Context context = frVar.getContext();
            org.telegram.ui.ActionBar.c6 c6Var = frVar.resourcesProvider;
            ?? linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_streaming, 112, 112, null);
            imageView.d();
            linearLayout.addView(imageView, i7.f6.t(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.formatString(R.string.Streaming, new Object[0]));
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
            linearLayout.addView(textView, i7.f6.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23169j5, c6Var));
            textView2.setText(LocaleController.formatString(R.string.VoipStreamStart, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            linearLayout.addView(textView2, i7.f6.t(-2, -2, 1, 28, 0, 28, 17));
            frVar.f28522c0 = linearLayout;
        }
        arrayList.add(w41.k(frVar.f28522c0));
        arrayList.add(w41.B(null));
        org.telegram.ui.th.p(R.string.VoipChatStreamSettings, arrayList);
        String str2 = frVar.X;
        String string = LocaleController.getString(R.string.VoipChatStreamServerUrl);
        int i11 = dr.f27862a;
        w41 J = w41.J(dr.class);
        J.f34300l = str2;
        J.f34302n = string;
        J.f34298j = false;
        J.f34296g = false;
        arrayList.add(J);
        SpannableStringBuilder spannableStringBuilder = frVar.Z;
        String string2 = LocaleController.getString(R.string.VoipChatStreamKey);
        w41 J2 = w41.J(dr.class);
        J2.f34300l = spannableStringBuilder;
        J2.f34302n = string2;
        J2.f34298j = true;
        J2.f34296g = false;
        arrayList.add(J2);
        if (frVar.f28521b0) {
            if (frVar.T) {
                i10 = R.string.VoipChatStreamWithAnotherAppDescriptionStory;
            } else {
                i10 = R.string.VoipChatStreamWithAnotherAppDescription;
            }
            str = LocaleController.getString(i10);
        }
        arrayList.add(w41.B(str));
    }

    public static void S(fr frVar, Context context, nh.d dVar, long j10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, frVar.resourcesProvider);
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new d9.a(frVar, dVar, j10, 7));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    @Override
    public final void dismissInternal() {
        TLRPC.InputPeer inputPeer;
        super.dismissInternal();
        r70 r70Var = this.U;
        if (r70Var != null && (inputPeer = this.V) != null) {
            r70Var.a(inputPeer, this.W, false, true);
        }
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(jl0Var, getContext(), this.currentAccount, 0, true, new d(this, 7), this.resourcesProvider);
        this.f28520a0 = k51Var;
        return k51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Streaming);
    }

    public fr(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.Peer peer, long j10, boolean z10, r70 r70Var) {
        super(o2Var, false);
        this.T = false;
        this.v = 0.26f;
        this.U = r70Var;
        this.W = z10;
        Context context = this.containerView.getContext();
        boolean isCreator = ChatObject.isCreator(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10)));
        this.f28521b0 = true;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.VoipChannelStartStreaming));
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, this.resourcesProvider));
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider);
        int k9 = i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false), 120);
        textView.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, v02, k9, k9));
        this.containerView.addView(textView, i7.f6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (isCreator ? 52 : 0) + 12));
        textView.setOnClickListener(new t2(14, this, peer));
        if (isCreator) {
            nh.d dVar = new nh.d(context, this.resourcesProvider, false);
            dVar.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23311r7, false));
            dVar.d.u(AndroidUtilities.bold());
            dVar.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
            dVar.setOnClickListener(new eg.a1(this, context, dVar, j10, 1));
            this.containerView.addView(dVar, i7.f6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        jl0 jl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i10, 0, i10, AndroidUtilities.dp((isCreator ? 52 : 0) + 72));
        f2.l lVar = new f2.l();
        lVar.f6463m = false;
        lVar.C = false;
        lVar.o(jr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        fixNavigationBar();
        M();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new a2(this, 2));
    }
}
