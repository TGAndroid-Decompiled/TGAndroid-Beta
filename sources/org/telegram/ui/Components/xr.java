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
public final class xr extends bb {
    public final boolean X;
    public final q80 Y;
    public TLRPC.InputPeer Z;
    public final boolean f32629a0;
    public String f32630b0;
    public String f32631c0;
    public SpannableStringBuilder f32632d0;
    public b71 f32633e0;
    public final boolean f32634f0;
    public wr f32635g0;

    public xr(Context context, int i10, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, ai.o2 o2Var, ci.b bVar) {
        int i11;
        xr bbVar = new bb(context, null, false, false, bVar);
        bbVar.X = true;
        bbVar.v = 0.126f;
        bbVar.Y = null;
        bbVar.f32629a0 = false;
        long peerDialogId = DialogObject.getPeerDialogId(getgroupcallstreamrtmpurl.peer);
        boolean z10 = o2Var != null && (peerDialogId >= 0 || ChatObject.isCreator(MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId))));
        if (o2Var != null) {
            bbVar.f32634f0 = true;
            ei.d dVar = new ei.d(context, bVar, true);
            dVar.i(LocaleController.getString(R.string.LiveStoryRTMPEnable), false, true);
            bbVar.containerView.addView(dVar, w7.z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z10 ? 52 : 0) + 12));
            dVar.setOnClickListener(new ai.v0(bbVar, o2Var, dVar, 21));
            if (z10) {
                ei.d dVar2 = new ei.d(context, bVar, false);
                dVar2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21441r7, false));
                dVar2.d.x(AndroidUtilities.bold());
                dVar2.i(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
                bbVar = this;
                dVar2.setOnClickListener(new ai.ob(this, context, bVar, dVar2, getgroupcallstreamrtmpurl, i10));
                bbVar.containerView.addView(dVar2, w7.z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        s4.k kVar = new s4.k();
        kVar.f46377m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        bbVar.d.setItemAnimator(kVar);
        mm0 mm0Var = bbVar.d;
        int i12 = bbVar.backgroundPaddingLeft;
        if (bbVar.f32634f0) {
            i11 = AndroidUtilities.dp(z10 ? 124.0f : 72.0f);
        } else {
            i11 = 0;
        }
        mm0Var.setPadding(i12, 0, i12, i11);
        bbVar.fixNavigationBar();
        bbVar.N();
        bbVar.f32630b0 = groupcallstreamrtmpurl.url;
        bbVar.f32631c0 = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bbVar.f32631c0);
        bbVar.f32632d0 = spannableStringBuilder;
        ?? obj = new Object();
        obj.f29754a |= 256;
        obj.f29755b = 0;
        obj.f29756c = spannableStringBuilder.length();
        bbVar.f32632d0.setSpan(new r11(obj, 0), 0, bbVar.f32632d0.length(), 0);
        bbVar.f32633e0.N(false);
    }

    public static void P(xr xrVar, TLRPC.Peer peer) {
        xrVar.Z = MessagesController.getInstance(xrVar.currentAccount).getInputPeer(MessageObject.getPeerId(peer));
        xrVar.dismiss();
    }

    public static void Q(xr xrVar, ei.d dVar, long j10) {
        if (dVar.Q) {
            return;
        }
        dVar.setLoading(true);
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(xrVar.currentAccount).getInputPeer(j10);
        getgroupcallstreamrtmpurl.revoke = true;
        ConnectionsManager.getInstance(xrVar.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new sr(xrVar, dVar, 0));
    }

    public static void R(xr xrVar, ArrayList arrayList) {
        int i10;
        String str = null;
        if (xrVar.f32635g0 == null) {
            Context context = xrVar.getContext();
            org.telegram.ui.ActionBar.g6 g6Var = xrVar.resourcesProvider;
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
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, g6Var);
            linearLayout.addView(textView, w7.z5.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21289j5, g6Var);
            textView2.setText(LocaleController.formatString(R.string.VoipStreamStart, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            linearLayout.addView(textView2, w7.z5.t(-2, -2, 1, 28, 0, 28, 17));
            xrVar.f32635g0 = linearLayout;
        }
        arrayList.add(m61.k(xrVar.f32635g0));
        arrayList.add(m61.B(null));
        i2.o1.q(R.string.VoipChatStreamSettings, arrayList);
        String str2 = xrVar.f32630b0;
        String string = LocaleController.getString(R.string.VoipChatStreamServerUrl);
        int i11 = vr.f32042a;
        m61 J = m61.J(vr.class);
        J.f28559l = str2;
        J.f28561n = string;
        J.f28557j = false;
        J.f28555g = false;
        arrayList.add(J);
        SpannableStringBuilder spannableStringBuilder = xrVar.f32632d0;
        String string2 = LocaleController.getString(R.string.VoipChatStreamKey);
        m61 J2 = m61.J(vr.class);
        J2.f28559l = spannableStringBuilder;
        J2.f28561n = string2;
        J2.f28557j = true;
        J2.f28555g = false;
        arrayList.add(J2);
        if (xrVar.f32634f0) {
            if (xrVar.X) {
                i10 = R.string.VoipChatStreamWithAnotherAppDescriptionStory;
            } else {
                i10 = R.string.VoipChatStreamWithAnotherAppDescription;
            }
            str = LocaleController.getString(i10);
        }
        arrayList.add(m61.B(str));
    }

    public static void S(xr xrVar, Context context, ei.d dVar, long j10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, xrVar.resourcesProvider);
        alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
        alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new ai.f(xrVar, dVar, j10, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }

    @Override
    public final void dismissInternal() {
        TLRPC.InputPeer inputPeer;
        super.dismissInternal();
        q80 q80Var = this.Y;
        if (q80Var != null && (inputPeer = this.Z) != null) {
            q80Var.a(inputPeer, this.f32629a0, false, true);
        }
    }

    @Override
    public final lm0 w(mm0 mm0Var) {
        b71 b71Var = new b71(mm0Var, getContext(), this.currentAccount, 0, true, new d(this, 7), this.resourcesProvider);
        this.f32633e0 = b71Var;
        return b71Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.Streaming);
    }

    public xr(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.Peer peer, long j10, boolean z10, q80 q80Var) {
        super(o2Var, false);
        this.X = false;
        this.v = 0.26f;
        this.Y = q80Var;
        this.f32629a0 = z10;
        Context context = this.containerView.getContext();
        boolean isCreator = ChatObject.isCreator(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10)));
        this.f32634f0 = true;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.VoipChannelStartStreaming));
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.Sh, this.resourcesProvider);
        int dp = AndroidUtilities.dp(8.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Oh;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, this.resourcesProvider);
        int i11 = org.telegram.ui.ActionBar.k6.f21183d6;
        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 120);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, w02, o10, o10);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i11, 120);
        org.telegram.ui.ActionBar.g6 g6Var = this.resourcesProvider;
        textView.setBackground(j02);
        org.telegram.ui.ActionBar.r6.k(textView, j02, O, h, g6Var);
        this.containerView.addView(textView, w7.z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (isCreator ? 52 : 0) + 12));
        textView.setOnClickListener(new ca(7, this, peer));
        if (isCreator) {
            ei.d dVar = new ei.d(context, this.resourcesProvider, false);
            dVar.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21441r7, false));
            dVar.d.x(AndroidUtilities.bold());
            dVar.i(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
            dVar.setOnClickListener(new ur(this, context, dVar, j10, 0));
            this.containerView.addView(dVar, w7.z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        mm0 mm0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i12, 0, i12, AndroidUtilities.dp((isCreator ? 52 : 0) + 72));
        s4.k kVar = new s4.k();
        kVar.f46377m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        fixNavigationBar();
        N();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new x1(this, 2));
    }
}
