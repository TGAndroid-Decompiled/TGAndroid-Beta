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
public final class jr extends sa {
    public final boolean U;
    public final w70 V;
    public TLRPC.InputPeer W;
    public final boolean X;
    public String Y;
    public String Z;
    public SpannableStringBuilder f26023a0;
    public w51 f26024b0;
    public final boolean f26025c0;
    public ir f26026d0;

    public jr(Context context, int i10, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, org.telegram.ui.web.u1 u1Var, nh.b bVar) {
        int i11;
        jr saVar = new sa(context, null, false, false, false, 1, bVar);
        saVar.U = true;
        saVar.v = 0.126f;
        saVar.V = null;
        saVar.X = false;
        long peerDialogId = DialogObject.getPeerDialogId(getgroupcallstreamrtmpurl.peer);
        boolean z4 = u1Var != null && (peerDialogId >= 0 || ChatObject.isCreator(MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId))));
        if (u1Var != null) {
            saVar.f26025c0 = true;
            ph.d dVar = new ph.d(context, bVar, true);
            dVar.g(LocaleController.getString(R.string.LiveStoryRTMPEnable), false, true);
            saVar.containerView.addView(dVar, k7.b6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z4 ? 52 : 0) + 12));
            dVar.setOnClickListener(new dg.p(saVar, u1Var, dVar, 21));
            if (z4) {
                ph.d dVar2 = new ph.d(context, bVar, false);
                dVar2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20159r7, false));
                dVar2.d.u(AndroidUtilities.bold());
                dVar2.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
                saVar = this;
                dVar2.setOnClickListener(new lh.s8(this, context, bVar, dVar2, getgroupcallstreamrtmpurl, i10, 3));
                saVar.containerView.addView(dVar2, k7.b6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        f2.l lVar = new f2.l();
        lVar.f5818m = false;
        lVar.C = false;
        lVar.o(nr.h);
        lVar.n(350L);
        saVar.d.setItemAnimator(lVar);
        sl0 sl0Var = saVar.d;
        int i12 = saVar.backgroundPaddingLeft;
        if (saVar.f26025c0) {
            i11 = AndroidUtilities.dp(z4 ? 124.0f : 72.0f);
        } else {
            i11 = 0;
        }
        sl0Var.setPadding(i12, 0, i12, i11);
        saVar.fixNavigationBar();
        saVar.N();
        saVar.Y = groupcallstreamrtmpurl.url;
        saVar.Z = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(saVar.Z);
        saVar.f26023a0 = spannableStringBuilder;
        ?? obj = new Object();
        obj.f28583a |= 256;
        obj.f28584b = 0;
        obj.f28585c = spannableStringBuilder.length();
        saVar.f26023a0.setSpan(new t01(obj, 0), 0, saVar.f26023a0.length(), 0);
        saVar.f26024b0.N(false);
    }

    public static void P(jr jrVar, TLRPC.Peer peer) {
        jrVar.W = MessagesController.getInstance(jrVar.currentAccount).getInputPeer(MessageObject.getPeerId(peer));
        jrVar.dismiss();
    }

    public static void Q(jr jrVar, ph.d dVar, long j10) {
        if (dVar.K) {
            return;
        }
        dVar.setLoading(true);
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(jrVar.currentAccount).getInputPeer(j10);
        getgroupcallstreamrtmpurl.revoke = true;
        ConnectionsManager.getInstance(jrVar.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new fr(jrVar, dVar, 0));
    }

    public static void R(jr jrVar, ArrayList arrayList) {
        int i10;
        String str = null;
        if (jrVar.f26026d0 == null) {
            Context context = jrVar.getContext();
            org.telegram.ui.ActionBar.f6 f6Var = jrVar.resourcesProvider;
            ?? linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_streaming, 112, 112, null);
            imageView.d();
            linearLayout.addView(imageView, k7.b6.t(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.formatString(R.string.Streaming, new Object[0]));
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
            linearLayout.addView(textView, k7.b6.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20012j5, f6Var));
            textView2.setText(LocaleController.formatString(R.string.VoipStreamStart, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            linearLayout.addView(textView2, k7.b6.t(-2, -2, 1, 28, 0, 28, 17));
            jrVar.f26026d0 = linearLayout;
        }
        arrayList.add(i51.k(jrVar.f26026d0));
        arrayList.add(i51.B(null));
        org.telegram.ui.yh.r(R.string.VoipChatStreamSettings, arrayList);
        String str2 = jrVar.Y;
        String string = LocaleController.getString(R.string.VoipChatStreamServerUrl);
        int i11 = hr.f25477a;
        i51 J = i51.J(hr.class);
        J.f25565l = str2;
        J.f25567n = string;
        J.f25563j = false;
        J.f25561g = false;
        arrayList.add(J);
        SpannableStringBuilder spannableStringBuilder = jrVar.f26023a0;
        String string2 = LocaleController.getString(R.string.VoipChatStreamKey);
        i51 J2 = i51.J(hr.class);
        J2.f25565l = spannableStringBuilder;
        J2.f25567n = string2;
        J2.f25563j = true;
        J2.f25561g = false;
        arrayList.add(J2);
        if (jrVar.f26025c0) {
            if (jrVar.U) {
                i10 = R.string.VoipChatStreamWithAnotherAppDescriptionStory;
            } else {
                i10 = R.string.VoipChatStreamWithAnotherAppDescription;
            }
            str = LocaleController.getString(i10);
        }
        arrayList.add(i51.B(str));
    }

    public static void S(jr jrVar, Context context, ph.d dVar, long j10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, jrVar.resourcesProvider);
        alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
        alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new e3.f(jrVar, dVar, j10, 6));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    @Override
    public final void dismissInternal() {
        TLRPC.InputPeer inputPeer;
        super.dismissInternal();
        w70 w70Var = this.V;
        if (w70Var != null && (inputPeer = this.W) != null) {
            w70Var.a(inputPeer, this.X, false, true);
        }
    }

    @Override
    public final rl0 v(sl0 sl0Var) {
        w51 w51Var = new w51(sl0Var, getContext(), this.currentAccount, 0, true, new d(this, 7), this.resourcesProvider);
        this.f26024b0 = w51Var;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Streaming);
    }

    public jr(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.Peer peer, long j10, boolean z4, w70 w70Var) {
        super(p2Var, false);
        this.U = false;
        this.v = 0.26f;
        this.V = w70Var;
        this.X = z4;
        Context context = this.containerView.getContext();
        boolean isCreator = ChatObject.isCreator(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10)));
        this.f26025c0 = true;
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
        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false), 120);
        textView.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v02, k10, k10));
        this.containerView.addView(textView, k7.b6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (isCreator ? 52 : 0) + 12));
        textView.setOnClickListener(new w2(11, this, peer));
        if (isCreator) {
            ph.d dVar = new ph.d(context, this.resourcesProvider, false);
            dVar.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20159r7, false));
            dVar.d.u(AndroidUtilities.bold());
            dVar.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
            dVar.setOnClickListener(new gg.z0(this, context, dVar, j10, 1));
            this.containerView.addView(dVar, k7.b6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        sl0 sl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i10, 0, i10, AndroidUtilities.dp((isCreator ? 52 : 0) + 72));
        f2.l lVar = new f2.l();
        lVar.f5818m = false;
        lVar.C = false;
        lVar.o(nr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        fixNavigationBar();
        N();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new y1(this, 2));
    }
}
