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
public final class es extends db {
    public final boolean X;
    public final w80 Y;
    public TLRPC.InputPeer Z;
    public final boolean f26193a0;
    public String f26194b0;
    public String f26195c0;
    public SpannableStringBuilder f26196d0;
    public d71 f26197e0;
    public final boolean f26198f0;
    public ds f26199g0;

    public es(Context context, int i10, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, ai.h3 h3Var, ai.d dVar) {
        int i11;
        es dbVar = new db(context, null, false, false, dVar);
        dbVar.X = true;
        dbVar.v = 0.126f;
        dbVar.Y = null;
        dbVar.f26193a0 = false;
        long peerDialogId = DialogObject.getPeerDialogId(getgroupcallstreamrtmpurl.peer);
        boolean z10 = h3Var != null && (peerDialogId >= 0 || ChatObject.isCreator(MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId))));
        if (h3Var != null) {
            dbVar.f26198f0 = true;
            ci.d dVar2 = new ci.d(context, dVar, true);
            dVar2.g(LocaleController.getString(R.string.LiveStoryRTMPEnable), false, true);
            dbVar.containerView.addView(dVar2, w7.x5.a(48.0f, 16.0f, 0.0f, 16.0f, (z10 ? 52 : 0) + 12, -1, 80));
            dVar2.setOnClickListener(new ai.d0(dbVar, h3Var, dVar2, 18));
            if (z10) {
                ci.d dVar3 = new ci.d(context, dVar, false);
                dVar3.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21082r7, false));
                dVar3.d.x(AndroidUtilities.bold());
                dVar3.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
                dbVar = this;
                dVar3.setOnClickListener(new ei.m3(this, i10, context, dVar, dVar3, getgroupcallstreamrtmpurl, 3));
                dbVar.containerView.addView(dVar3, w7.x5.a(48.0f, 16.0f, 0.0f, 16.0f, 12.0f, -1, 80));
            }
        }
        s4.j jVar = new s4.j();
        jVar.f47822m = false;
        jVar.C = false;
        jVar.o(is.h);
        jVar.n(350L);
        dbVar.d.setItemAnimator(jVar);
        rm0 rm0Var = dbVar.d;
        int i12 = dbVar.backgroundPaddingLeft;
        if (dbVar.f26198f0) {
            i11 = AndroidUtilities.dp(z10 ? 124.0f : 72.0f);
        } else {
            i11 = 0;
        }
        rm0Var.setPadding(i12, 0, i12, i11);
        dbVar.fixNavigationBar();
        dbVar.O();
        dbVar.f26194b0 = groupcallstreamrtmpurl.url;
        dbVar.f26195c0 = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dbVar.f26195c0);
        dbVar.f26196d0 = spannableStringBuilder;
        ?? obj = new Object();
        obj.f31418a |= 256;
        obj.f31419b = 0;
        obj.f31420c = spannableStringBuilder.length();
        dbVar.f26196d0.setSpan(new v11(obj, 0), 0, dbVar.f26196d0.length(), 0);
        dbVar.f26197e0.N(false);
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
        if (esVar.f26199g0 == null) {
            Context context = esVar.getContext();
            org.telegram.ui.ActionBar.d6 d6Var = esVar.resourcesProvider;
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
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
            linearLayout.addView(textView, w7.x5.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20930j5, d6Var));
            textView2.setText(LocaleController.formatString(R.string.VoipStreamStart, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            linearLayout.addView(textView2, w7.x5.t(-2, -2, 1, 28, 0, 28, 17));
            esVar.f26199g0 = linearLayout;
        }
        arrayList.add(q61.k(esVar.f26199g0));
        arrayList.add(q61.B(null));
        com.google.android.gms.internal.vision.e2.n(R.string.VoipChatStreamSettings, arrayList);
        String str2 = esVar.f26194b0;
        String string = LocaleController.getString(R.string.VoipChatStreamServerUrl);
        int i11 = cs.f25464a;
        q61 J = q61.J(cs.class);
        J.f30167l = str2;
        J.f30169n = string;
        J.f30165j = false;
        J.f30163g = false;
        arrayList.add(J);
        SpannableStringBuilder spannableStringBuilder = esVar.f26196d0;
        String string2 = LocaleController.getString(R.string.VoipChatStreamKey);
        q61 J2 = q61.J(cs.class);
        J2.f30167l = spannableStringBuilder;
        J2.f30169n = string2;
        J2.f30165j = true;
        J2.f30163g = false;
        arrayList.add(J2);
        if (esVar.f26198f0) {
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
        alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
        alertDialog$Builder.f20404a.T = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
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
        w80 w80Var = this.Y;
        if (w80Var != null && (inputPeer = this.Z) != null) {
            w80Var.a(inputPeer, this.f26193a0, false, true);
        }
    }

    @Override
    public final qm0 x(rm0 rm0Var) {
        d71 d71Var = new d71(rm0Var, getContext(), this.currentAccount, 0, true, new d(this, 7), this.resourcesProvider);
        this.f26197e0 = d71Var;
        return d71Var;
    }

    public es(org.telegram.ui.ActionBar.m2 m2Var, TLRPC.Peer peer, long j3, boolean z10, w80 w80Var) {
        super(m2Var, false);
        this.X = false;
        this.v = 0.26f;
        this.Y = w80Var;
        this.f26193a0 = z10;
        Context context = this.containerView.getContext();
        boolean isCreator = ChatObject.isCreator(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3)));
        this.f26198f0 = true;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.VoipChannelStartStreaming));
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Sh, this.resourcesProvider));
        int dp = AndroidUtilities.dp(8.0f);
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.resourcesProvider);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20822d6, false), 120);
        textView.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, w02, k10, k10));
        this.containerView.addView(textView, w7.x5.a(48.0f, 16.0f, 0.0f, 16.0f, (isCreator ? 52 : 0) + 12, -1, 80));
        textView.setOnClickListener(new org.telegram.ui.rf(26, this, peer));
        if (isCreator) {
            ci.d dVar = new ci.d(context, this.resourcesProvider, false);
            dVar.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21082r7, false));
            dVar.d.x(AndroidUtilities.bold());
            dVar.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
            dVar.setOnClickListener(new as(this, context, dVar, j3, 0));
            this.containerView.addView(dVar, w7.x5.a(48.0f, 16.0f, 0.0f, 16.0f, 12.0f, -1, 80));
        }
        rm0 rm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        rm0Var.setPadding(i10, 0, i10, AndroidUtilities.dp((isCreator ? 52 : 0) + 72));
        s4.j jVar = new s4.j();
        jVar.f47822m = false;
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
