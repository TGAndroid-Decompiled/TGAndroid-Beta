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
public final class zr extends bb {
    public final boolean X;
    public final r80 Y;
    public TLRPC.InputPeer Z;
    public final boolean f35385a0;
    public String f35386b0;
    public String f35387c0;
    public SpannableStringBuilder f35388d0;
    public j71 f35389e0;
    public final boolean f35390f0;
    public yr f35391g0;

    public zr(Context context, int i10, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, ai.n1 n1Var, di.b bVar) {
        int i11;
        zr bbVar = new bb(context, null, false, false, bVar);
        bbVar.X = true;
        bbVar.v = 0.126f;
        bbVar.Y = null;
        bbVar.f35385a0 = false;
        long peerDialogId = DialogObject.getPeerDialogId(getgroupcallstreamrtmpurl.peer);
        boolean z10 = n1Var != null && (peerDialogId >= 0 || ChatObject.isCreator(MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId))));
        if (n1Var != null) {
            bbVar.f35390f0 = true;
            fi.d dVar = new fi.d(context, bVar, true);
            dVar.i(LocaleController.getString(R.string.LiveStoryRTMPEnable), false, true);
            bbVar.containerView.addView(dVar, gb1.h(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (z10 ? 52 : 0) + 12));
            dVar.setOnClickListener(new bi.w0(bbVar, n1Var, dVar, 21));
            if (z10) {
                fi.d dVar2 = new fi.d(context, bVar, false);
                dVar2.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23613r7, false));
                dVar2.d.x(AndroidUtilities.bold());
                dVar2.i(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
                bbVar = this;
                dVar2.setOnClickListener(new bi.mb(this, context, bVar, dVar2, getgroupcallstreamrtmpurl, i10));
                bbVar.containerView.addView(dVar2, gb1.h(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
            }
        }
        s4.l lVar = new s4.l();
        lVar.f47760m = false;
        lVar.C = false;
        lVar.o(ds.h);
        lVar.n(350L);
        bbVar.d.setItemAnimator(lVar);
        mm0 mm0Var = bbVar.d;
        int i12 = bbVar.backgroundPaddingLeft;
        if (bbVar.f35390f0) {
            i11 = AndroidUtilities.dp(z10 ? 124.0f : 72.0f);
        } else {
            i11 = 0;
        }
        mm0Var.setPadding(i12, 0, i12, i11);
        bbVar.fixNavigationBar();
        bbVar.N();
        bbVar.f35386b0 = groupcallstreamrtmpurl.url;
        bbVar.f35387c0 = groupcallstreamrtmpurl.key;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bbVar.f35387c0);
        bbVar.f35388d0 = spannableStringBuilder;
        ?? obj = new Object();
        obj.f34904a |= 256;
        obj.f34905b = 0;
        obj.f34906c = spannableStringBuilder.length();
        bbVar.f35388d0.setSpan(new z11(obj, 0), 0, bbVar.f35388d0.length(), 0);
        bbVar.f35389e0.O(false);
    }

    public static void P(zr zrVar, TLRPC.Peer peer) {
        zrVar.Z = MessagesController.getInstance(zrVar.currentAccount).getInputPeer(MessageObject.getPeerId(peer));
        zrVar.dismiss();
    }

    public static void Q(zr zrVar, fi.d dVar, long j10) {
        if (dVar.Q) {
            return;
        }
        dVar.setLoading(true);
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(zrVar.currentAccount).getInputPeer(j10);
        getgroupcallstreamrtmpurl.revoke = true;
        ConnectionsManager.getInstance(zrVar.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new ur(zrVar, dVar, 0));
    }

    public static void R(zr zrVar, ArrayList arrayList) {
        int i10;
        String str = null;
        if (zrVar.f35391g0 == null) {
            Context context = zrVar.getContext();
            org.telegram.ui.ActionBar.u6 u6Var = zrVar.resourcesProvider;
            ?? linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(R.raw.utyan_streaming, 112, 112, null);
            imageView.d();
            linearLayout.addView(imageView, gb1.x(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.formatString(R.string.Streaming, new Object[0]));
            textView.setTextSize(1, 20.0f);
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, u6Var);
            linearLayout.addView(textView, gb1.x(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23462j5, u6Var);
            textView2.setText(LocaleController.formatString(R.string.VoipStreamStart, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            linearLayout.addView(textView2, gb1.x(-2, -2, 1, 28, 0, 28, 17));
            zrVar.f35391g0 = linearLayout;
        }
        arrayList.add(t61.k(zrVar.f35391g0));
        arrayList.add(t61.C(null));
        ic.a.p(R.string.VoipChatStreamSettings, arrayList);
        String str2 = zrVar.f35386b0;
        String string = LocaleController.getString(R.string.VoipChatStreamServerUrl);
        int i11 = xr.f34804a;
        t61 K = t61.K(xr.class);
        K.f32872l = str2;
        K.f32874n = string;
        K.f32870j = false;
        K.f32868g = false;
        arrayList.add(K);
        SpannableStringBuilder spannableStringBuilder = zrVar.f35388d0;
        String string2 = LocaleController.getString(R.string.VoipChatStreamKey);
        t61 K2 = t61.K(xr.class);
        K2.f32872l = spannableStringBuilder;
        K2.f32874n = string2;
        K2.f32870j = true;
        K2.f32868g = false;
        arrayList.add(K2);
        if (zrVar.f35390f0) {
            if (zrVar.X) {
                i10 = R.string.VoipChatStreamWithAnotherAppDescriptionStory;
            } else {
                i10 = R.string.VoipChatStreamWithAnotherAppDescription;
            }
            str = LocaleController.getString(i10);
        }
        arrayList.add(t61.C(str));
    }

    public static void S(zr zrVar, Context context, fi.d dVar, long j10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, zrVar.resourcesProvider);
        alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
        alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new bi.i(zrVar, dVar, j10, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }

    @Override
    public final void dismissInternal() {
        TLRPC.InputPeer inputPeer;
        super.dismissInternal();
        r80 r80Var = this.Y;
        if (r80Var != null && (inputPeer = this.Z) != null) {
            r80Var.a(inputPeer, this.f35385a0, false, true);
        }
    }

    @Override
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(mm0Var, getContext(), this.currentAccount, 0, true, new d(this, 7), this.resourcesProvider);
        this.f35389e0 = j71Var;
        return j71Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Streaming);
    }

    public zr(org.telegram.ui.ActionBar.r2 r2Var, TLRPC.Peer peer, long j10, boolean z10, r80 r80Var) {
        super(r2Var, false);
        this.X = false;
        this.v = 0.26f;
        this.Y = r80Var;
        this.f35385a0 = z10;
        Context context = this.containerView.getContext();
        boolean isCreator = ChatObject.isCreator(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10)));
        this.f35390f0 = true;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.VoipChannelStartStreaming));
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.Sh, this.resourcesProvider);
        int dp = AndroidUtilities.dp(8.0f);
        int i10 = org.telegram.ui.ActionBar.y6.Oh;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, this.resourcesProvider);
        int i11 = org.telegram.ui.ActionBar.y6.f23354d6;
        int o10 = i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i11, false), 120);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, w02, o10, o10);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i11, 120);
        org.telegram.ui.ActionBar.u6 u6Var = this.resourcesProvider;
        textView.setBackground(j02);
        org.telegram.ui.ActionBar.f7.k(textView, j02, N, h, u6Var);
        this.containerView.addView(textView, gb1.h(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (isCreator ? 52 : 0) + 12));
        textView.setOnClickListener(new ga(8, this, peer));
        if (isCreator) {
            fi.d dVar = new fi.d(context, this.resourcesProvider, false);
            dVar.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23613r7, false));
            dVar.d.x(AndroidUtilities.bold());
            dVar.i(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false, true);
            dVar.setOnClickListener(new wr(this, context, dVar, j10, 0));
            this.containerView.addView(dVar, gb1.h(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        mm0 mm0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i12, 0, i12, AndroidUtilities.dp((isCreator ? 52 : 0) + 72));
        s4.l lVar = new s4.l();
        lVar.f47760m = false;
        lVar.C = false;
        lVar.o(ds.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        fixNavigationBar();
        N();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new b2(this, 2));
    }
}
