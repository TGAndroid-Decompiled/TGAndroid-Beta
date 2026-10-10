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
public final class es extends eb {
    public final boolean X;
    public final x80 Y;
    public TLRPC.InputPeer Z;
    public final boolean f26155a0;
    public String f26156b0;
    public String f26157c0;
    public SpannableStringBuilder f26158d0;
    public d71 f26159e0;
    public final boolean f26160f0;
    public ds f26161g0;

    public es(Context context, int i10, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, ai.h3 h3Var, ai.d dVar) {
        int i11;
        es ebVar = new eb(context, null, false, false, dVar);
        ebVar.X = true;
        ebVar.v = 0.126f;
        ebVar.Y = null;
        ebVar.f26155a0 = false;
        long peerDialogId = DialogObject.getPeerDialogId(getgroupcallstreamrtmpurl.peer);
        boolean z10 = h3Var != null && (peerDialogId >= 0 || ChatObject.isCreator(MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId))));
        if (h3Var != null) {
            ebVar.f26160f0 = true;
            ci.d dVar2 = new ci.d(context, dVar, true);
            dVar2.g(LocaleController.getString(R.string.LiveStoryRTMPEnable), false, true);
            ebVar.containerView.addView(dVar2, w7.x5.a(48.0f, 16.0f, 0.0f, 16.0f, (z10 ? 52 : 0) + 12, -1, 80));
            dVar2.setOnClickListener(new ai.d0(ebVar, h3Var, dVar2, 18));
            if (z10) {
                ci.d dVar3 = new ci.d(context, dVar, false);
                dVar3.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21060r7, false));
                dVar3.d.x(AndroidUtilities.bold());
                dVar3.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
                ebVar = this;
                dVar3.setOnClickListener(new ei.m3(this, i10, context, dVar, dVar3, getgroupcallstreamrtmpurl, 3));
                ebVar.containerView.addView(dVar3, w7.x5.a(48.0f, 16.0f, 0.0f, 16.0f, 12.0f, -1, 80));
            }
        }
        s4.j jVar = new s4.j();
        jVar.f47742m = false;
        jVar.C = false;
        jVar.o(is.h);
        jVar.n(350L);
        ebVar.d.setItemAnimator(jVar);
        rm0 rm0Var = ebVar.d;
        int i12 = ebVar.backgroundPaddingLeft;
        if (ebVar.f26160f0) {
            i11 = AndroidUtilities.dp(z10 ? 124.0f : 72.0f);
        } else {
            i11 = 0;
        }
        rm0Var.setPadding(i12, 0, i12, i11);
        ebVar.fixNavigationBar();
        ebVar.O();
        ebVar.f26156b0 = groupcallstreamrtmpurl.url;
        ebVar.f26157c0 = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ebVar.f26157c0);
        ebVar.f26158d0 = spannableStringBuilder;
        ?? obj = new Object();
        obj.f31299a |= 256;
        obj.f31300b = 0;
        obj.f31301c = spannableStringBuilder.length();
        ebVar.f26158d0.setSpan(new v11(obj, 0), 0, ebVar.f26158d0.length(), 0);
        ebVar.f26159e0.N(false);
    }

    public static void Q(es esVar, TLRPC.Peer peer) {
        esVar.Z = MessagesController.getInstance(esVar.currentAccount).getInputPeer(MessageObject.getPeerId(peer));
        esVar.dismiss();
    }

    public static void R(es esVar, ci.d dVar, long j3) {
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(esVar.currentAccount).getInputPeer(j3);
        getgroupcallstreamrtmpurl.revoke = true;
        ConnectionsManager.getInstance(esVar.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new yr(esVar, dVar, 0));
    }

    public static void S(es esVar, ArrayList arrayList) {
        int i10;
        String str = null;
        if (esVar.f26161g0 == null) {
            Context context = esVar.getContext();
            org.telegram.ui.ActionBar.e6 e6Var = esVar.resourcesProvider;
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
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
            linearLayout.addView(textView, w7.x5.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20909j5, e6Var));
            textView2.setText(LocaleController.formatString(R.string.VoipStreamStart, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            linearLayout.addView(textView2, w7.x5.t(-2, -2, 1, 28, 0, 28, 17));
            esVar.f26161g0 = linearLayout;
        }
        arrayList.add(q61.k(esVar.f26161g0));
        arrayList.add(q61.B(null));
        com.google.android.gms.internal.vision.e2.n(R.string.VoipChatStreamSettings, arrayList);
        String str2 = esVar.f26156b0;
        String string = LocaleController.getString(R.string.VoipChatStreamServerUrl);
        int i11 = cs.f25402a;
        q61 J = q61.J(cs.class);
        J.f30063l = str2;
        J.f30065n = string;
        J.f30061j = false;
        J.f30059g = false;
        arrayList.add(J);
        SpannableStringBuilder spannableStringBuilder = esVar.f26158d0;
        String string2 = LocaleController.getString(R.string.VoipChatStreamKey);
        q61 J2 = q61.J(cs.class);
        J2.f30063l = spannableStringBuilder;
        J2.f30065n = string2;
        J2.f30061j = true;
        J2.f30059g = false;
        arrayList.add(J2);
        if (esVar.f26160f0) {
            if (esVar.X) {
                i10 = R.string.VoipChatStreamWithAnotherAppDescriptionStory;
            } else {
                i10 = R.string.VoipChatStreamWithAnotherAppDescription;
            }
            str = LocaleController.getString(i10);
        }
        arrayList.add(q61.B(str));
    }

    public static void T(es esVar, Context context, ci.d dVar, long j3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, esVar.resourcesProvider);
        alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
        alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new ci.q9(esVar, dVar, j3, 3));
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
        x80 x80Var = this.Y;
        if (x80Var != null && (inputPeer = this.Z) != null) {
            x80Var.a(inputPeer, this.f26155a0, false, true);
        }
    }

    @Override
    public final qm0 x(rm0 rm0Var) {
        d71 d71Var = new d71(rm0Var, getContext(), this.currentAccount, 0, true, new d(this, 7), this.resourcesProvider);
        this.f26159e0 = d71Var;
        return d71Var;
    }

    public es(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.Peer peer, long j3, boolean z10, x80 x80Var) {
        super(n2Var, false);
        this.X = false;
        this.v = 0.26f;
        this.Y = x80Var;
        this.f26155a0 = z10;
        Context context = this.containerView.getContext();
        boolean isCreator = ChatObject.isCreator(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3)));
        this.f26160f0 = true;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.VoipChannelStartStreaming));
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Sh, this.resourcesProvider));
        int dp = AndroidUtilities.dp(8.0f);
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, this.resourcesProvider);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, false), 120);
        textView.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, w02, k10, k10));
        this.containerView.addView(textView, w7.x5.a(48.0f, 16.0f, 0.0f, 16.0f, (isCreator ? 52 : 0) + 12, -1, 80));
        textView.setOnClickListener(new org.telegram.ui.sf(26, this, peer));
        if (isCreator) {
            ci.d dVar = new ci.d(context, this.resourcesProvider, false);
            dVar.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21060r7, false));
            dVar.d.x(AndroidUtilities.bold());
            dVar.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
            dVar.setOnClickListener(new bs(this, context, dVar, j3, 0));
            this.containerView.addView(dVar, w7.x5.a(48.0f, 16.0f, 0.0f, 16.0f, 12.0f, -1, 80));
        }
        rm0 rm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        rm0Var.setPadding(i10, 0, i10, AndroidUtilities.dp((isCreator ? 52 : 0) + 72));
        s4.j jVar = new s4.j();
        jVar.f47742m = false;
        jVar.C = false;
        jVar.o(is.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        fixNavigationBar();
        O();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j3);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new y1(this, 2));
    }
}
