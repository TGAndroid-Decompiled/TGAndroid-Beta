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
public final class cr extends sa {
    public final boolean T;
    public final e70 U;
    public TLRPC.InputPeer V;
    public final boolean W;
    public String X;
    public String Y;
    public SpannableStringBuilder Z;
    public z41 f27556a0;
    public final boolean f27557b0;
    public br f27558c0;

    public cr(Context context, int i9, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, fh.f1 f1Var, ih.b bVar) {
        int i10;
        cr saVar = new sa(context, null, false, false, false, 1, bVar);
        saVar.T = true;
        saVar.v = 0.126f;
        saVar.U = null;
        saVar.W = false;
        long peerDialogId = DialogObject.getPeerDialogId(getgroupcallstreamrtmpurl.peer);
        boolean z10 = f1Var != null && (peerDialogId >= 0 || ChatObject.isCreator(MessagesController.getInstance(i9).getChat(Long.valueOf(-peerDialogId))));
        if (f1Var != null) {
            saVar.f27557b0 = true;
            kh.d dVar = new kh.d(context, bVar, true);
            dVar.g(LocaleController.getString(R.string.LiveStoryRTMPEnable), false, true);
            saVar.containerView.addView(dVar, g7.e6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z10 ? 52 : 0) + 12));
            dVar.setOnClickListener(new fg.f((Object) saVar, f1Var, dVar, 23));
            if (z10) {
                kh.d dVar2 = new kh.d(context, bVar, false);
                dVar2.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23249r7, false));
                dVar2.d.u(AndroidUtilities.bold());
                dVar2.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
                saVar = this;
                dVar2.setOnClickListener(new gh.v8(this, context, bVar, dVar2, getgroupcallstreamrtmpurl, i9, 4));
                saVar.containerView.addView(dVar2, g7.e6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        f2.n nVar = new f2.n();
        nVar.f5532m = false;
        nVar.C = false;
        nVar.o(gr.h);
        nVar.n(350L);
        saVar.d.setItemAnimator(nVar);
        wk0 wk0Var = saVar.d;
        int i11 = saVar.backgroundPaddingLeft;
        if (saVar.f27557b0) {
            i10 = AndroidUtilities.dp(z10 ? 124.0f : 72.0f);
        } else {
            i10 = 0;
        }
        wk0Var.setPadding(i11, 0, i11, i10);
        saVar.fixNavigationBar();
        saVar.M();
        saVar.X = groupcallstreamrtmpurl.url;
        saVar.Y = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(saVar.Y);
        saVar.Z = spannableStringBuilder;
        ?? obj = new Object();
        obj.f34062a |= 256;
        obj.f34063b = 0;
        obj.f34064c = spannableStringBuilder.length();
        saVar.Z.setSpan(new wz0(obj, 0), 0, saVar.Z.length(), 0);
        saVar.f27556a0.N(false);
    }

    public static void O(cr crVar, TLRPC.Peer peer) {
        crVar.V = MessagesController.getInstance(crVar.currentAccount).getInputPeer(MessageObject.getPeerId(peer));
        crVar.dismiss();
    }

    public static void P(cr crVar, kh.d dVar, long j10) {
        if (dVar.J) {
            return;
        }
        dVar.setLoading(true);
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(crVar.currentAccount).getInputPeer(j10);
        getgroupcallstreamrtmpurl.revoke = true;
        ConnectionsManager.getInstance(crVar.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new xq(crVar, dVar, 0));
    }

    public static void Q(cr crVar, ArrayList arrayList) {
        int i9;
        String str = null;
        if (crVar.f27558c0 == null) {
            Context context = crVar.getContext();
            org.telegram.ui.ActionBar.b6 b6Var = crVar.resourcesProvider;
            ?? linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_streaming, 112, 112, null);
            imageView.d();
            linearLayout.addView(imageView, g7.e6.t(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.formatString(R.string.Streaming, new Object[0]));
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
            linearLayout.addView(textView, g7.e6.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23108j5, b6Var));
            textView2.setText(LocaleController.formatString(R.string.VoipStreamStart, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            linearLayout.addView(textView2, g7.e6.t(-2, -2, 1, 28, 0, 28, 17));
            crVar.f27558c0 = linearLayout;
        }
        arrayList.add(l41.k(crVar.f27558c0));
        arrayList.add(l41.B(null));
        org.telegram.ui.Cells.j2.l(R.string.VoipChatStreamSettings, arrayList);
        String str2 = crVar.X;
        String string = LocaleController.getString(R.string.VoipChatStreamServerUrl);
        int i10 = ar.f26888a;
        l41 J = l41.J(ar.class);
        J.f30339l = str2;
        J.f30341n = string;
        J.f30337j = false;
        J.f30335g = false;
        arrayList.add(J);
        SpannableStringBuilder spannableStringBuilder = crVar.Z;
        String string2 = LocaleController.getString(R.string.VoipChatStreamKey);
        l41 J2 = l41.J(ar.class);
        J2.f30339l = spannableStringBuilder;
        J2.f30341n = string2;
        J2.f30337j = true;
        J2.f30335g = false;
        arrayList.add(J2);
        if (crVar.f27557b0) {
            if (crVar.T) {
                i9 = R.string.VoipChatStreamWithAnotherAppDescriptionStory;
            } else {
                i9 = R.string.VoipChatStreamWithAnotherAppDescription;
            }
            str = LocaleController.getString(i9);
        }
        arrayList.add(l41.B(str));
    }

    public static void R(cr crVar, Context context, kh.d dVar, long j10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, crVar.resourcesProvider);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new b9.a(crVar, dVar, j10, 7));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    @Override
    public final void dismissInternal() {
        TLRPC.InputPeer inputPeer;
        super.dismissInternal();
        e70 e70Var = this.U;
        if (e70Var != null && (inputPeer = this.V) != null) {
            e70Var.a(inputPeer, this.W, false, true);
        }
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(wk0Var, getContext(), this.currentAccount, 0, true, new d(this, 7), this.resourcesProvider);
        this.f27556a0 = z41Var;
        return z41Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Streaming);
    }

    public cr(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.Peer peer, long j10, boolean z10, e70 e70Var) {
        super(o2Var, false);
        this.T = false;
        this.v = 0.26f;
        this.U = e70Var;
        this.W = z10;
        Context context = this.containerView.getContext();
        boolean isCreator = ChatObject.isCreator(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10)));
        this.f27557b0 = true;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.VoipChannelStartStreaming));
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Sh, this.resourcesProvider));
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, this.resourcesProvider);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false), 120);
        textView.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, v02, k10, k10));
        this.containerView.addView(textView, g7.e6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (isCreator ? 52 : 0) + 12));
        textView.setOnClickListener(new s2(13, this, peer));
        if (isCreator) {
            kh.d dVar = new kh.d(context, this.resourcesProvider, false);
            dVar.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23249r7, false));
            dVar.d.u(AndroidUtilities.bold());
            dVar.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
            dVar.setOnClickListener(new bg.f1(this, context, dVar, j10, 1));
            this.containerView.addView(dVar, g7.e6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        wk0 wk0Var = this.d;
        int i9 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i9, 0, i9, AndroidUtilities.dp((isCreator ? 52 : 0) + 72));
        f2.n nVar = new f2.n();
        nVar.f5532m = false;
        nVar.C = false;
        nVar.o(gr.h);
        nVar.n(350L);
        this.d.setItemAnimator(nVar);
        fixNavigationBar();
        M();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new w1(this, 2));
    }
}
