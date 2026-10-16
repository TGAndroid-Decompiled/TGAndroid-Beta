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
public final class as extends db {
    public final boolean X;
    public final t80 Y;
    public TLRPC.InputPeer Z;
    public final boolean f23289a0;
    public String f23290b0;
    public String f23291c0;
    public SpannableStringBuilder f23292d0;
    public a71 f23293e0;
    public final boolean f23294f0;
    public zr f23295g0;

    public as(Context context, int i10, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, bi.v2 v2Var, bi.b bVar) {
        int i11;
        as dbVar = new db(context, null, false, false, bVar);
        dbVar.X = true;
        dbVar.v = 0.126f;
        dbVar.Y = null;
        dbVar.f23289a0 = false;
        long peerDialogId = DialogObject.getPeerDialogId(getgroupcallstreamrtmpurl.peer);
        boolean z10 = v2Var != null && (peerDialogId >= 0 || ChatObject.isCreator(MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId))));
        if (v2Var != null) {
            dbVar.f23294f0 = true;
            di.d dVar = new di.d(context, bVar, true);
            dVar.g(LocaleController.getString(R.string.LiveStoryRTMPEnable), false, true);
            dbVar.containerView.addView(dVar, w7.z5.a(48.0f, 16.0f, 0.0f, 16.0f, (z10 ? 52 : 0) + 12, -1, 80));
            dVar.setOnClickListener(new bi.x(dbVar, v2Var, dVar, 18));
            if (z10) {
                di.d dVar2 = new di.d(context, bVar, false);
                dVar2.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19859r7, false));
                dVar2.d.x(AndroidUtilities.bold());
                dVar2.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
                dbVar = this;
                dVar2.setOnClickListener(new fi.m3(this, i10, context, bVar, dVar2, getgroupcallstreamrtmpurl, 3));
                dbVar.containerView.addView(dVar2, w7.z5.a(48.0f, 16.0f, 0.0f, 16.0f, 12.0f, -1, 80));
            }
        }
        s4.k kVar = new s4.k();
        kVar.f44872m = false;
        kVar.C = false;
        kVar.o(es.h);
        kVar.n(350L);
        dbVar.d.setItemAnimator(kVar);
        mm0 mm0Var = dbVar.d;
        int i12 = dbVar.backgroundPaddingLeft;
        if (dbVar.f23294f0) {
            i11 = AndroidUtilities.dp(z10 ? 124.0f : 72.0f);
        } else {
            i11 = 0;
        }
        mm0Var.setPadding(i12, 0, i12, i11);
        dbVar.fixNavigationBar();
        dbVar.O();
        dbVar.f23290b0 = groupcallstreamrtmpurl.url;
        dbVar.f23291c0 = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dbVar.f23291c0);
        dbVar.f23292d0 = spannableStringBuilder;
        ?? obj = new Object();
        obj.f28163a |= 256;
        obj.f28164b = 0;
        obj.f28165c = spannableStringBuilder.length();
        dbVar.f23292d0.setSpan(new r11(obj, 0), 0, dbVar.f23292d0.length(), 0);
        dbVar.f23293e0.N(false);
    }

    public static void Q(as asVar, TLRPC.Peer peer) {
        asVar.Z = MessagesController.getInstance(asVar.currentAccount).getInputPeer(MessageObject.getPeerId(peer));
        asVar.dismiss();
    }

    public static void R(as asVar, di.d dVar, long j10) {
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(asVar.currentAccount).getInputPeer(j10);
        getgroupcallstreamrtmpurl.revoke = true;
        ConnectionsManager.getInstance(asVar.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new vr(asVar, dVar, 0));
    }

    public static void S(as asVar, ArrayList arrayList) {
        int i10;
        String str = null;
        if (asVar.f23295g0 == null) {
            Context context = asVar.getContext();
            org.telegram.ui.ActionBar.c6 c6Var = asVar.resourcesProvider;
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
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
            linearLayout.addView(textView, w7.z5.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19707j5, c6Var));
            textView2.setText(LocaleController.formatString(R.string.VoipStreamStart, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            linearLayout.addView(textView2, w7.z5.t(-2, -2, 1, 28, 0, 28, 17));
            asVar.f23295g0 = linearLayout;
        }
        arrayList.add(m61.k(asVar.f23295g0));
        arrayList.add(m61.B(null));
        i2.d.p(R.string.VoipChatStreamSettings, arrayList);
        String str2 = asVar.f23290b0;
        String string = LocaleController.getString(R.string.VoipChatStreamServerUrl);
        int i11 = yr.f31351a;
        m61 J = m61.J(yr.class);
        J.f26946l = str2;
        J.f26948n = string;
        J.f26944j = false;
        J.f26942g = false;
        arrayList.add(J);
        SpannableStringBuilder spannableStringBuilder = asVar.f23292d0;
        String string2 = LocaleController.getString(R.string.VoipChatStreamKey);
        m61 J2 = m61.J(yr.class);
        J2.f26946l = spannableStringBuilder;
        J2.f26948n = string2;
        J2.f26944j = true;
        J2.f26942g = false;
        arrayList.add(J2);
        if (asVar.f23294f0) {
            if (asVar.X) {
                i10 = R.string.VoipChatStreamWithAnotherAppDescriptionStory;
            } else {
                i10 = R.string.VoipChatStreamWithAnotherAppDescription;
            }
            str = LocaleController.getString(i10);
        }
        arrayList.add(m61.B(str));
    }

    public static void T(as asVar, Context context, di.d dVar, long j10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, asVar.resourcesProvider);
        alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
        alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new di.p9(asVar, dVar, j10, 3));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.Streaming);
    }

    @Override
    public final void dismissInternal() {
        TLRPC.InputPeer inputPeer;
        super.dismissInternal();
        t80 t80Var = this.Y;
        if (t80Var != null && (inputPeer = this.Z) != null) {
            t80Var.a(inputPeer, this.f23289a0, false, true);
        }
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        a71 a71Var = new a71(mm0Var, getContext(), this.currentAccount, 0, true, new d(this, 7), this.resourcesProvider);
        this.f23293e0 = a71Var;
        return a71Var;
    }

    public as(org.telegram.ui.ActionBar.m2 m2Var, TLRPC.Peer peer, long j10, boolean z10, t80 t80Var) {
        super(m2Var, false);
        this.X = false;
        this.v = 0.26f;
        this.Y = t80Var;
        this.f23289a0 = z10;
        Context context = this.containerView.getContext();
        boolean isCreator = ChatObject.isCreator(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10)));
        this.f23294f0 = true;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.VoipChannelStartStreaming));
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Sh, this.resourcesProvider));
        int dp = AndroidUtilities.dp(8.0f);
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false), 120);
        textView.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, w02, k10, k10));
        this.containerView.addView(textView, w7.z5.a(48.0f, 16.0f, 0.0f, 16.0f, (isCreator ? 52 : 0) + 12, -1, 80));
        textView.setOnClickListener(new org.telegram.ui.xf(26, this, peer));
        if (isCreator) {
            di.d dVar = new di.d(context, this.resourcesProvider, false);
            dVar.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19859r7, false));
            dVar.d.x(AndroidUtilities.bold());
            dVar.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
            dVar.setOnClickListener(new xr(this, context, dVar, j10, 0));
            this.containerView.addView(dVar, w7.z5.a(48.0f, 16.0f, 0.0f, 16.0f, 12.0f, -1, 80));
        }
        mm0 mm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i10, 0, i10, AndroidUtilities.dp((isCreator ? 52 : 0) + 72));
        s4.k kVar = new s4.k();
        kVar.f44872m = false;
        kVar.C = false;
        kVar.o(es.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        fixNavigationBar();
        O();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new y1(this, 2));
    }
}
