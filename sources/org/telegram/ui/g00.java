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
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class g00 implements Runnable {
    public final int f34428a;
    public final Object f34429b;
    public final Object f34430c;

    public g00(int i10, Object obj, Object obj2) {
        this.f34428a = i10;
        this.f34429b = obj;
        this.f34430c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i10 = this.f34428a;
        int i11 = 0;
        Object obj = this.f34430c;
        Object obj2 = this.f34429b;
        switch (i10) {
            case 0:
                b10 b10Var = (b10) obj2;
                b10Var.getClass();
                b10Var.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f31605x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.f31605x = true;
                    return;
                }
                return;
            case 2:
                FiltersSetupActivity filtersSetupActivity2 = ((z10) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                return;
            case 3:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = ((c60) obj2).V1;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    if (((org.telegram.ui.Components.voip.t) arrayList2.get(i12)).f29947w != null) {
                        arrayList.remove(((org.telegram.ui.Components.voip.t) arrayList2.get(i12)).f29947w);
                    }
                }
                while (i11 < arrayList.size()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i11);
                    if (videoParticipant.participant.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, videoParticipant.presentation);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
                    }
                    i11++;
                }
                return;
            case 4:
                c60 c60Var = (c60) obj2;
                c60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                c60Var.dismiss();
                return;
            case 5:
                z5 z5Var = (z5) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.s2) obj).e.getBitmap(100, 100);
                    if (bitmap != null) {
                        AndroidUtilities.runOnUIThread(new g00(6, z5Var, ph.g0.b(bitmap, true)));
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 6:
                ((c60) ((z5) obj2).f40674b).R0.setNewColors((int[]) obj);
                return;
            case 7:
                m70.V((m70) obj2, (TLRPC.TL_error) obj);
                return;
            case 8:
                i70 i70Var = (i70) obj2;
                String str = (String) obj;
                j70 j70Var = i70Var.f35036a;
                j70Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                j70Var.f35251c = j70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new lo(24, i70Var, str), 66);
                return;
            case 9:
                TLObject tLObject = (TLObject) obj;
                j70 j70Var2 = ((i70) obj2).f35036a;
                if (tLObject != null) {
                    m70.a0(j70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject);
                    return;
                } else {
                    m70.a0(j70Var2.h, null);
                    return;
                }
            case 10:
                l70 l70Var = (l70) obj2;
                String str2 = (String) obj;
                l70Var.h = str2;
                m70 m70Var = l70Var.f35973r;
                if (m70Var.K) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.f19294q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.f19296q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                l70Var.f35972n = m70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new ba(l70Var, str2, str2, 14), 66);
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.b(20, (d80) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                return;
            case 12:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.e = (ArrayList) obj;
                languageSelectActivity.f31608c.l();
                return;
            case 13:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) obj2;
                String str3 = (String) obj;
                if (str3.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new g00(12, languageSelectActivity2, new ArrayList()));
                    return;
                }
                System.currentTimeMillis();
                ArrayList arrayList3 = new ArrayList();
                int size = languageSelectActivity2.h.size();
                for (int i13 = 0; i13 < size; i13++) {
                    LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) languageSelectActivity2.h.get(i13);
                    if (localeInfo.name.toLowerCase().startsWith(str3) || localeInfo.nameEnglish.toLowerCase().startsWith(str3)) {
                        arrayList3.add(localeInfo);
                    }
                }
                int size2 = languageSelectActivity2.f31609f.size();
                while (i11 < size2) {
                    LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.f31609f.get(i11);
                    if (localeInfo2.name.toLowerCase().startsWith(str3) || localeInfo2.nameEnglish.toLowerCase().startsWith(str3)) {
                        arrayList3.add(localeInfo2);
                    }
                    i11++;
                }
                AndroidUtilities.runOnUIThread(new g00(12, languageSelectActivity2, arrayList3));
                return;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject2 = (TLObject) obj;
                Pattern pattern = LaunchActivity.f31612y1;
                if (tLObject2 instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject2;
                    MessagesController.getInstance(launchActivity.L).putUsers(resolvedbusinesschatlinks.users, false);
                    MessagesController.getInstance(launchActivity.L).putChats(resolvedbusinesschatlinks.chats, false);
                    MessagesStorage.getInstance(launchActivity.L).putUsersAndChats(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle.putLong("chat_id", peer.channel_id);
                    }
                    xn xnVar = new xn(bundle);
                    xnVar.fa = resolvedbusinesschatlinks;
                    launchActivity.q0(xnVar, false, true);
                    return;
                }
                launchActivity.B0(org.telegram.ui.Components.z4.N(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                return;
            case 15:
                LaunchActivity launchActivity2 = (LaunchActivity) obj2;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) obj;
                Pattern pattern2 = LaunchActivity.f31612y1;
                MessagesController.getInstance(launchActivity2.L).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.L);
                long j10 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j10, j10, tL_chatInviteJoinResultWebView.query_id);
                return;
            case 16:
                Pattern pattern3 = LaunchActivity.f31612y1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb = new StringBuilder();
                b.i(R.string.ErrorOccurred, "\n", sb);
                sb.append(((TLRPC.TL_error) obj).text);
                org.telegram.ui.Components.z4.u0((i) obj2, string, sb.toString(), null);
                return;
            case 17:
                LaunchActivity launchActivity3 = (LaunchActivity) obj2;
                String str4 = (String) obj;
                if (!launchActivity3.f31638n0.getFragmentStack().isEmpty()) {
                    launchActivity3.f31638n0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str4).getQueryParameter("ref")));
                    return;
                }
                return;
            case 18:
                Pattern pattern4 = LaunchActivity.f31612y1;
                ((LaunchActivity) obj2).j0((TL_account.Password) obj);
                return;
            case 19:
                LaunchActivity launchActivity4 = (LaunchActivity) obj2;
                Runnable runnable = (Runnable) obj;
                launchActivity4.f31638n0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity4.f31640o0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.f31640o0.getView().getVisibility() == 0) {
                        launchActivity4.f31640o0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.f31642p0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.f31642p0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.ic icVar = (org.telegram.ui.Components.ic) obj;
                if (!((LaunchActivity) obj2).N && LaunchActivity.B1) {
                    icVar.j();
                    return;
                }
                return;
            case 21:
                Pattern pattern5 = LaunchActivity.f31612y1;
                ((LaunchActivity) obj2).p0((cd1) obj);
                return;
            case 22:
                LaunchActivity launchActivity5 = (LaunchActivity) obj2;
                af.f fVar = (af.f) obj;
                launchActivity5.M0 = null;
                launchActivity5.N0 = null;
                launchActivity5.O0 = null;
                launchActivity5.P0 = null;
                launchActivity5.S0 = null;
                launchActivity5.Q0 = null;
                if (fVar != null) {
                    fVar.b();
                    return;
                }
                return;
            case 23:
                af.f fVar2 = (af.f) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                Pattern pattern6 = LaunchActivity.f31612y1;
                if (fVar2 != null) {
                    fVar2.b();
                }
                if (d2Var != null) {
                    d2Var.dismiss();
                    return;
                }
                return;
            case 24:
                wb0 wb0Var = (wb0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                wb0Var.a();
                if (tLObject3 != null) {
                    wb0Var.f39389a.j0((TL_account.Password) tLObject3);
                    return;
                }
                return;
            case 25:
                ((FiltersSetupActivity) obj).X(((wb0) obj2).f39389a.O());
                return;
            case 26:
                ad0 ad0Var = (ad0) obj2;
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
                    AndroidUtilities.runOnUIThread(new rq(ad0Var, createBitmap2, gLSurfaceView, 21));
                    return;
                }
                return;
            case 27:
                ad0 ad0Var2 = (ad0) obj2;
                ad0Var2.f32525c.setImageResource(R.drawable.msg_location_alert2);
                ad0Var2.e0(((LocationController.SharingLocationInfo) obj).proximityMeters);
                ad0Var2.D = false;
                return;
            case 28:
                ((EditText) obj2).removeTextChangedListener((cg.b0) obj);
                return;
            default:
                Runnable runnable2 = (Runnable) obj;
                vd0 vd0Var = ((yd0) obj2).f40482a;
                int i14 = 0;
                while (true) {
                    bs[] bsVarArr = vd0Var.f40565f;
                    if (i14 < bsVarArr.length) {
                        bsVarArr[i14].l(0.0f);
                        i14++;
                    } else {
                        runnable2.run();
                        vd0Var.e = false;
                        return;
                    }
                }
        }
    }
}
