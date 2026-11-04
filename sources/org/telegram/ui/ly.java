package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.widget.EditText;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ly implements Runnable {
    public final int f47465a;
    public final Object f47466b;
    public final Object f47467c;

    public ly(int i3, Object obj, Object obj2) {
        this.f47465a = i3;
        this.f47466b = obj;
        this.f47467c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i3 = this.f47465a;
        int i10 = 0;
        Object obj = this.f47467c;
        Object obj2 = this.f47466b;
        switch (i3) {
            case 0:
                ez ezVar = (ez) obj2;
                ezVar.getClass();
                ezVar.s0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f41275y) {
                    filtersSetupActivity.f41275y = true;
                    filtersSetupActivity.f0(new xz(filtersSetupActivity, 3));
                    return;
                }
                return;
            case 2:
                FiltersSetupActivity filtersSetupActivity2 = ((c00) obj2).f44184e;
                filtersSetupActivity2.getMessagesController().W0.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().k(184, new Object[0]);
                return;
            case 3:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = ((x30) obj2).Q3;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (((org.telegram.ui.Components.voip.r) arrayList2.get(i11)).f39577x != null) {
                        arrayList.remove(((org.telegram.ui.Components.voip.r) arrayList2.get(i11)).f39577x);
                    }
                }
                while (i10 < arrayList.size()) {
                    org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) arrayList.get(i10);
                    if (s3Var.f25270a.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, s3Var.f25271b);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(s3Var.f25270a, s3Var.f25271b);
                    }
                    i10++;
                }
                return;
            case 4:
                x30 x30Var = (x30) obj2;
                org.telegram.messenger.hs.f(x30Var.f51759l1.f21919a).k(75, 6, ((TLRPC.TL_error) obj).text);
                x30Var.dismiss();
                return;
            case 5:
                o4 o4Var = (o4) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.z1) obj).f39737e.getBitmap(100, 100);
                    if (bitmap != null) {
                        org.telegram.messenger.g0.h3(new ly(6, o4Var, b8.nc.b(bitmap, true)));
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 6:
                ((x30) ((o4) obj2).f48181b).M2.setNewColors((int[]) obj);
                return;
            case 7:
                g50.a0((g50) obj2, (TLRPC.TL_error) obj);
                return;
            case 8:
                c50 c50Var = (c50) obj2;
                String str = (String) obj;
                d50 d50Var = c50Var.f44238a;
                d50Var.f44565e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                d50Var.f44564c = d50Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new xy(3, c50Var, str), 66);
                return;
            case 9:
                TLObject tLObject = (TLObject) obj;
                d50 d50Var2 = ((c50) obj2).f44238a;
                if (tLObject != null) {
                    g50.f0(d50Var2.h, (TLRPC.TL_messages_stickerSet) tLObject);
                    return;
                } else {
                    g50.f0(d50Var2.h, null);
                    return;
                }
            case 10:
                f50 f50Var = (f50) obj2;
                String str2 = (String) obj;
                f50Var.h = str2;
                g50 g50Var = f50Var.f45150r;
                if (g50Var.O) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f27113q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f27115q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                f50Var.f45149n = g50Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new y9(f50Var, str2, str2, 14), 66);
                return;
            case 11:
                org.telegram.messenger.g0.i3(new org.telegram.messenger.voip.l0(16, (u50) obj2, (org.telegram.messenger.s2) obj), 150L);
                return;
            case 12:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.f41279e = (ArrayList) obj;
                languageSelectActivity.f41278c.f();
                return;
            case 13:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) obj2;
                String str3 = (String) obj;
                if (str3.trim().toLowerCase().length() == 0) {
                    org.telegram.messenger.g0.h3(new ly(12, languageSelectActivity2, new ArrayList()));
                    return;
                }
                System.currentTimeMillis();
                ArrayList arrayList3 = new ArrayList();
                int size = languageSelectActivity2.h.size();
                for (int i12 = 0; i12 < size; i12++) {
                    org.telegram.messenger.yc ycVar = (org.telegram.messenger.yc) languageSelectActivity2.h.get(i12);
                    if (ycVar.f26561a.toLowerCase().startsWith(str3) || ycVar.f26562b.toLowerCase().startsWith(str3)) {
                        arrayList3.add(ycVar);
                    }
                }
                int size2 = languageSelectActivity2.f41280f.size();
                while (i10 < size2) {
                    org.telegram.messenger.yc ycVar2 = (org.telegram.messenger.yc) languageSelectActivity2.f41280f.get(i10);
                    if (ycVar2.f26561a.toLowerCase().startsWith(str3) || ycVar2.f26562b.toLowerCase().startsWith(str3)) {
                        arrayList3.add(ycVar2);
                    }
                    i10++;
                }
                org.telegram.messenger.g0.h3(new ly(12, languageSelectActivity2, arrayList3));
                return;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject2 = (TLObject) obj;
                String str4 = LaunchActivity.E1;
                if (tLObject2 instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject2;
                    org.telegram.messenger.hp.s1(launchActivity.P).Y3(resolvedbusinesschatlinks.users, false);
                    org.telegram.messenger.hp.s1(launchActivity.P).S3(resolvedbusinesschatlinks.chats, false);
                    org.telegram.messenger.qr.a0(launchActivity.P).m1(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle.putLong("chat_id", peer.channel_id);
                    }
                    wm wmVar = new wm(bundle);
                    wmVar.Ca = resolvedbusinesschatlinks;
                    launchActivity.u0(wmVar, false, true);
                    return;
                }
                launchActivity.F0(org.telegram.ui.Components.t4.M(launchActivity, org.telegram.messenger.bd.M0(2131752716, null), org.telegram.messenger.bd.M0(2131752712, null)));
                return;
            case 15:
                LaunchActivity launchActivity2 = (LaunchActivity) obj2;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) obj;
                String str5 = LaunchActivity.E1;
                org.telegram.messenger.hp.s1(launchActivity2.P).Y3(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.k2 b10 = org.telegram.messenger.k2.b(launchActivity2.P);
                long j10 = tL_chatInviteJoinResultWebView.bot_id;
                b10.c(j10, j10, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            case 16:
                String str6 = LaunchActivity.E1;
                String M0 = org.telegram.messenger.bd.M0(2131753894, null);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131751106, sb2, "\n");
                sb2.append(((TLRPC.TL_error) obj).text);
                org.telegram.ui.Components.t4.t0((g) obj2, M0, sb2.toString(), null);
                return;
            case 17:
                LaunchActivity launchActivity3 = (LaunchActivity) obj2;
                String str7 = (String) obj;
                if (!launchActivity3.f41314r0.getFragmentStack().isEmpty()) {
                    launchActivity3.f41314r0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str7).getQueryParameter("ref")));
                    return;
                }
                return;
            case 18:
                String str8 = LaunchActivity.E1;
                ((LaunchActivity) obj2).k0((TL_account.Password) obj);
                return;
            case 19:
                org.telegram.ui.Components.ac acVar = (org.telegram.ui.Components.ac) obj;
                if (!((LaunchActivity) obj2).R && LaunchActivity.I1) {
                    acVar.j();
                    return;
                }
                return;
            case 20:
                LaunchActivity launchActivity4 = (LaunchActivity) obj2;
                Runnable runnable = (Runnable) obj;
                launchActivity4.f41314r0.getView().setVisibility(4);
                if (org.telegram.messenger.g0.Q1()) {
                    ActionBarLayout actionBarLayout = launchActivity4.f41316s0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.f41316s0.getView().getVisibility() == 0) {
                        launchActivity4.f41316s0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.f41318t0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.f41318t0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 21:
                String str9 = LaunchActivity.E1;
                ((LaunchActivity) obj2).t0((l71) obj);
                return;
            case 22:
                LaunchActivity launchActivity5 = (LaunchActivity) obj2;
                sf.b bVar = (sf.b) obj;
                launchActivity5.R0 = null;
                launchActivity5.S0 = null;
                launchActivity5.T0 = null;
                launchActivity5.U0 = null;
                launchActivity5.X0 = null;
                launchActivity5.V0 = null;
                if (bVar != null) {
                    bVar.b();
                    return;
                }
                return;
            case 23:
                sf.b bVar2 = (sf.b) obj2;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) obj;
                String str10 = LaunchActivity.E1;
                if (bVar2 != null) {
                    bVar2.b();
                }
                if (s1Var != null) {
                    s1Var.dismiss();
                    return;
                }
                return;
            case 24:
                m90 m90Var = (m90) obj2;
                TLObject tLObject3 = (TLObject) obj;
                m90Var.c();
                if (tLObject3 != null) {
                    m90Var.f47566a.k0((TL_account.Password) tLObject3);
                    return;
                }
                return;
            case 25:
                ((FiltersSetupActivity) obj).d0(((m90) obj2).f47566a.M());
                return;
            case 26:
                la0 la0Var = (la0) obj2;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) obj;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    org.telegram.messenger.g0.h3(new pp(la0Var, createBitmap2, gLSurfaceView, 23));
                    return;
                }
                return;
            case 27:
                la0 la0Var2 = (la0) obj2;
                la0Var2.f47243c.setImageResource(2131232211);
                la0Var2.m0(((org.telegram.messenger.kd) obj).f23814f);
                la0Var2.f47272y = false;
                return;
            case 28:
                ((EditText) obj2).removeTextChangedListener((ai.a0) obj);
                return;
            default:
                Runnable runnable2 = (Runnable) obj;
                ib0 ib0Var = ((lb0) obj2).f47283a;
                int i13 = 0;
                while (true) {
                    zq[] zqVarArr = ib0Var.f52078f;
                    if (i13 < zqVarArr.length) {
                        zqVarArr[i13].C(0.0f);
                        i13++;
                    } else {
                        runnable2.run();
                        ib0Var.f52077e = false;
                        return;
                    }
                }
        }
    }
}
