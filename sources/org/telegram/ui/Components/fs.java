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
public final class fs extends db {
    public final boolean X;
    public final a90 Y;
    public TLRPC.InputPeer Z;
    public final boolean f26159a0;
    public String f26160b0;
    public String f26161c0;
    public SpannableStringBuilder f26162d0;
    public h71 f26163e0;
    public final boolean f26164f0;
    public es f26165g0;

    public fs(Context context, int i10, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, ai.h3 h3Var, ai.d dVar) {
        int i11;
        fs dbVar = new db(context, null, false, false, dVar);
        dbVar.X = true;
        dbVar.v = 0.126f;
        dbVar.Y = null;
        dbVar.f26159a0 = false;
        long peerDialogId = DialogObject.getPeerDialogId(getgroupcallstreamrtmpurl.peer);
        boolean z10 = h3Var != null && (peerDialogId >= 0 || ChatObject.isCreator(MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId))));
        if (h3Var != null) {
            dbVar.f26164f0 = true;
            ci.d dVar2 = new ci.d(context, dVar, true);
            dVar2.g(LocaleController.getString(R.string.LiveStoryRTMPEnable), false, true);
            dbVar.containerView.addView(dVar2, w7.w5.a(48.0f, 16.0f, 0.0f, 16.0f, (z10 ? 52 : 0) + 12, -1, 80));
            dVar2.setOnClickListener(new ai.d0(dbVar, h3Var, dVar2, 18));
            if (z10) {
                ci.d dVar3 = new ci.d(context, dVar, false);
                dVar3.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20820r7, false));
                dVar3.d.x(AndroidUtilities.bold());
                dVar3.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
                dbVar = this;
                dVar3.setOnClickListener(new ei.m3(this, i10, context, dVar, dVar3, getgroupcallstreamrtmpurl, 3));
                dbVar.containerView.addView(dVar3, w7.w5.a(48.0f, 16.0f, 0.0f, 16.0f, 12.0f, -1, 80));
            }
        }
        s4.j jVar = new s4.j();
        jVar.f47937m = false;
        jVar.C = false;
        jVar.o(js.h);
        jVar.n(350L);
        dbVar.d.setItemAnimator(jVar);
        wm0 wm0Var = dbVar.d;
        int i12 = dbVar.backgroundPaddingLeft;
        if (dbVar.f26164f0) {
            i11 = AndroidUtilities.dp(z10 ? 124.0f : 72.0f);
        } else {
            i11 = 0;
        }
        wm0Var.setPadding(i12, 0, i12, i11);
        dbVar.fixNavigationBar();
        dbVar.O();
        dbVar.f26160b0 = groupcallstreamrtmpurl.url;
        dbVar.f26161c0 = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dbVar.f26161c0);
        dbVar.f26162d0 = spannableStringBuilder;
        ?? obj = new Object();
        obj.f33255a |= 256;
        obj.f33256b = 0;
        obj.f33257c = spannableStringBuilder.length();
        dbVar.f26162d0.setSpan(new a21(obj, 0), 0, dbVar.f26162d0.length(), 0);
        dbVar.f26163e0.N(false);
    }

    public static void Q(fs fsVar, TLRPC.Peer peer) {
        fsVar.Z = MessagesController.getInstance(fsVar.currentAccount).getInputPeer(MessageObject.getPeerId(peer));
        fsVar.dismiss();
    }

    public static void R(fs fsVar, ci.d dVar, long j3) {
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(fsVar.currentAccount).getInputPeer(j3);
        getgroupcallstreamrtmpurl.revoke = true;
        ConnectionsManager.getInstance(fsVar.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new as(fsVar, dVar, 0));
    }

    public static void S(fs fsVar, ArrayList arrayList) {
        int i10;
        String str = null;
        if (fsVar.f26165g0 == null) {
            Context context = fsVar.getContext();
            org.telegram.ui.ActionBar.c6 c6Var = fsVar.resourcesProvider;
            ?? linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_streaming, 112, 112, null);
            imageView.d();
            linearLayout.addView(imageView, w7.w5.t(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.formatString(R.string.Streaming, new Object[0]));
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, c6Var));
            linearLayout.addView(textView, w7.w5.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20668j5, c6Var));
            textView2.setText(LocaleController.formatString(R.string.VoipStreamStart, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            linearLayout.addView(textView2, w7.w5.t(-2, -2, 1, 28, 0, 28, 17));
            fsVar.f26165g0 = linearLayout;
        }
        arrayList.add(u61.k(fsVar.f26165g0));
        arrayList.add(u61.B(null));
        com.google.android.gms.internal.vision.e2.n(R.string.VoipChatStreamSettings, arrayList);
        String str2 = fsVar.f26160b0;
        String string = LocaleController.getString(R.string.VoipChatStreamServerUrl);
        int i11 = ds.f25458a;
        u61 J = u61.J(ds.class);
        J.f31071l = str2;
        J.f31073n = string;
        J.f31069j = false;
        J.f31067g = false;
        arrayList.add(J);
        SpannableStringBuilder spannableStringBuilder = fsVar.f26162d0;
        String string2 = LocaleController.getString(R.string.VoipChatStreamKey);
        u61 J2 = u61.J(ds.class);
        J2.f31071l = spannableStringBuilder;
        J2.f31073n = string2;
        J2.f31069j = true;
        J2.f31067g = false;
        arrayList.add(J2);
        if (fsVar.f26164f0) {
            if (fsVar.X) {
                i10 = R.string.VoipChatStreamWithAnotherAppDescriptionStory;
            } else {
                i10 = R.string.VoipChatStreamWithAnotherAppDescription;
            }
            str = LocaleController.getString(i10);
        }
        arrayList.add(u61.B(str));
    }

    public static void T(fs fsVar, Context context, ci.d dVar, long j3) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, fsVar.resourcesProvider);
        alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
        alertDialog$Builder.f20142a.T = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new ci.q9(fsVar, dVar, j3, 3));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    @Override
    public final CharSequence A() {
        return LocaleController.getString(R.string.Streaming);
    }

    @Override
    public final void dismissInternal() {
        TLRPC.InputPeer inputPeer;
        super.dismissInternal();
        a90 a90Var = this.Y;
        if (a90Var != null && (inputPeer = this.Z) != null) {
            a90Var.a(inputPeer, this.f26159a0, false, true);
        }
    }

    @Override
    public final vm0 x(wm0 wm0Var) {
        h71 h71Var = new h71(wm0Var, getContext(), this.currentAccount, 0, true, new d(this, 7), this.resourcesProvider);
        this.f26163e0 = h71Var;
        return h71Var;
    }

    public fs(org.telegram.ui.ActionBar.m2 m2Var, TLRPC.Peer peer, long j3, boolean z10, a90 a90Var) {
        super(m2Var, false);
        this.X = false;
        this.v = 0.26f;
        this.Y = a90Var;
        this.f26159a0 = z10;
        Context context = this.containerView.getContext();
        boolean isCreator = ChatObject.isCreator(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3)));
        this.f26164f0 = true;
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
        int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20560d6, false), 120);
        textView.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, w02, k10, k10));
        this.containerView.addView(textView, w7.w5.a(48.0f, 16.0f, 0.0f, 16.0f, (isCreator ? 52 : 0) + 12, -1, 80));
        textView.setOnClickListener(new org.telegram.ui.wf(26, this, peer));
        if (isCreator) {
            ci.d dVar = new ci.d(context, this.resourcesProvider, false);
            dVar.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20820r7, false));
            dVar.d.x(AndroidUtilities.bold());
            dVar.g(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
            dVar.setOnClickListener(new cs(this, context, dVar, j3, 0));
            this.containerView.addView(dVar, w7.w5.a(48.0f, 16.0f, 0.0f, 16.0f, 12.0f, -1, 80));
        }
        wm0 wm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        wm0Var.setPadding(i10, 0, i10, AndroidUtilities.dp((isCreator ? 52 : 0) + 72));
        s4.j jVar = new s4.j();
        jVar.f47937m = false;
        jVar.C = false;
        jVar.o(js.h);
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
