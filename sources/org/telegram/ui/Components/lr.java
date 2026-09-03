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
public final class lr extends sa {
    public final boolean U;
    public final y70 V;
    public TLRPC.InputPeer W;
    public final boolean X;
    public String Y;
    public String Z;
    public SpannableStringBuilder f28860a0;
    public w51 f28861b0;
    public final boolean f28862c0;
    public kr f28863d0;

    public lr(Context context, int i10, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, org.telegram.ui.web.a2 a2Var, oh.b bVar) {
        int i11;
        lr saVar = new sa(context, null, false, false, false, 1, bVar);
        saVar.U = true;
        saVar.v = 0.126f;
        saVar.V = null;
        saVar.X = false;
        long peerDialogId = DialogObject.getPeerDialogId(getgroupcallstreamrtmpurl.peer);
        boolean z4 = a2Var != null && (peerDialogId >= 0 || ChatObject.isCreator(MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId))));
        if (a2Var != null) {
            saVar.f28862c0 = true;
            qh.d dVar = new qh.d(context, bVar, true);
            dVar.g(LocaleController.getString(R.string.LiveStoryRTMPEnable), false, true);
            saVar.containerView.addView(dVar, k7.c6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z4 ? 52 : 0) + 12));
            dVar.setOnClickListener(new eg.o(saVar, a2Var, dVar, 21));
            if (z4) {
                qh.d dVar2 = new qh.d(context, bVar, false);
                dVar2.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21915r7, false));
                dVar2.d.u(AndroidUtilities.bold());
                dVar2.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
                saVar = this;
                dVar2.setOnClickListener(new mh.s8(this, context, bVar, dVar2, getgroupcallstreamrtmpurl, i10, 3));
                saVar.containerView.addView(dVar2, k7.c6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        f2.l lVar = new f2.l();
        lVar.f5910m = false;
        lVar.C = false;
        lVar.o(pr.h);
        lVar.n(350L);
        saVar.d.setItemAnimator(lVar);
        sl0 sl0Var = saVar.d;
        int i12 = saVar.backgroundPaddingLeft;
        if (saVar.f28862c0) {
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
        saVar.f28860a0 = spannableStringBuilder;
        ?? obj = new Object();
        obj.f30949a |= 256;
        obj.f30950b = 0;
        obj.f30951c = spannableStringBuilder.length();
        saVar.f28860a0.setSpan(new t01(obj, 0), 0, saVar.f28860a0.length(), 0);
        saVar.f28861b0.N(false);
    }

    public static void P(lr lrVar, TLRPC.Peer peer) {
        lrVar.W = MessagesController.getInstance(lrVar.currentAccount).getInputPeer(MessageObject.getPeerId(peer));
        lrVar.dismiss();
    }

    public static void Q(lr lrVar, qh.d dVar, long j10) {
        if (dVar.K) {
            return;
        }
        dVar.setLoading(true);
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(lrVar.currentAccount).getInputPeer(j10);
        getgroupcallstreamrtmpurl.revoke = true;
        ConnectionsManager.getInstance(lrVar.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new hr(lrVar, dVar, 0));
    }

    public static void R(lr lrVar, ArrayList arrayList) {
        int i10;
        String str = null;
        if (lrVar.f28863d0 == null) {
            Context context = lrVar.getContext();
            org.telegram.ui.ActionBar.g6 g6Var = lrVar.resourcesProvider;
            ?? linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_streaming, 112, 112, null);
            imageView.d();
            linearLayout.addView(imageView, k7.c6.t(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.formatString(R.string.Streaming, new Object[0]));
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
            linearLayout.addView(textView, k7.c6.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21768j5, g6Var));
            textView2.setText(LocaleController.formatString(R.string.VoipStreamStart, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            linearLayout.addView(textView2, k7.c6.t(-2, -2, 1, 28, 0, 28, 17));
            lrVar.f28863d0 = linearLayout;
        }
        arrayList.add(h51.k(lrVar.f28863d0));
        arrayList.add(h51.B(null));
        org.telegram.ui.yh.r(R.string.VoipChatStreamSettings, arrayList);
        String str2 = lrVar.Y;
        String string = LocaleController.getString(R.string.VoipChatStreamServerUrl);
        int i11 = jr.f28167a;
        h51 J = h51.J(jr.class);
        J.f27375l = str2;
        J.f27377n = string;
        J.f27373j = false;
        J.f27371g = false;
        arrayList.add(J);
        SpannableStringBuilder spannableStringBuilder = lrVar.f28860a0;
        String string2 = LocaleController.getString(R.string.VoipChatStreamKey);
        h51 J2 = h51.J(jr.class);
        J2.f27375l = spannableStringBuilder;
        J2.f27377n = string2;
        J2.f27373j = true;
        J2.f27371g = false;
        arrayList.add(J2);
        if (lrVar.f28862c0) {
            if (lrVar.U) {
                i10 = R.string.VoipChatStreamWithAnotherAppDescriptionStory;
            } else {
                i10 = R.string.VoipChatStreamWithAnotherAppDescription;
            }
            str = LocaleController.getString(i10);
        }
        arrayList.add(h51.B(str));
    }

    public static void S(lr lrVar, Context context, qh.d dVar, long j10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, lrVar.resourcesProvider);
        alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
        alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new e3.f(lrVar, dVar, j10, 6));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    @Override
    public final void dismissInternal() {
        TLRPC.InputPeer inputPeer;
        super.dismissInternal();
        y70 y70Var = this.V;
        if (y70Var != null && (inputPeer = this.W) != null) {
            y70Var.a(inputPeer, this.X, false, true);
        }
    }

    @Override
    public final rl0 v(sl0 sl0Var) {
        w51 w51Var = new w51(sl0Var, getContext(), this.currentAccount, 0, true, new d(this, 7), this.resourcesProvider);
        this.f28861b0 = w51Var;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Streaming);
    }

    public lr(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.Peer peer, long j10, boolean z4, y70 y70Var) {
        super(p2Var, false);
        this.U = false;
        this.v = 0.26f;
        this.V = y70Var;
        this.X = z4;
        Context context = this.containerView.getContext();
        boolean isCreator = ChatObject.isCreator(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10)));
        this.f28862c0 = true;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.VoipChannelStartStreaming));
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Sh, this.resourcesProvider));
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, this.resourcesProvider);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false), 120);
        textView.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, v02, k10, k10));
        this.containerView.addView(textView, k7.c6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (isCreator ? 52 : 0) + 12));
        textView.setOnClickListener(new w2(11, this, peer));
        if (isCreator) {
            qh.d dVar = new qh.d(context, this.resourcesProvider, false);
            dVar.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21915r7, false));
            dVar.d.u(AndroidUtilities.bold());
            dVar.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
            dVar.setOnClickListener(new hg.z0(this, context, dVar, j10, 1));
            this.containerView.addView(dVar, k7.c6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        sl0 sl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i10, 0, i10, AndroidUtilities.dp((isCreator ? 52 : 0) + 72));
        f2.l lVar = new f2.l();
        lVar.f5910m = false;
        lVar.C = false;
        lVar.o(pr.h);
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
