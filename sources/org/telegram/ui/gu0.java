package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class gu0 implements Runnable {
    public final int f37165a;
    public final Object f37166b;
    public final int f37167c;
    public final Object d;

    public gu0(Object obj, int i10, Object obj2, int i11) {
        this.f37165a = i11;
        this.f37166b = obj;
        this.f37167c = i10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.qc a02;
        int i10;
        int i11;
        switch (this.f37165a) {
            case 0:
                hu0 hu0Var = (hu0) this.f37166b;
                Uri uri = (Uri) this.d;
                int i12 = this.f37167c;
                hu0Var.getClass();
                try {
                    File file = new File(uri.getPath());
                    int i13 = UserConfig.selectedAccount;
                    Point point = AndroidUtilities.displaySize;
                    org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(file, true, 0L, 0, null, null, null, 0L, i13, false, point.x, point.y, null, 0, true);
                    Bitmap q10 = y5Var.q(0L, false);
                    y5Var.u();
                    AndroidUtilities.runOnUIThread(new gu0(hu0Var, i12, q10, 1));
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new gl0(hu0Var, 22));
                    return;
                }
            case 1:
                hu0 hu0Var2 = (hu0) this.f37166b;
                Bitmap bitmap = (Bitmap) this.d;
                if (this.f37167c == hu0Var2.f37478a) {
                    hu0Var2.setImageBitmap(bitmap);
                    hu0Var2.f37480c = true;
                    hu0Var2.f37479b = false;
                    return;
                }
                return;
            case 2:
                yv0 yv0Var = (yv0) this.f37166b;
                int i14 = this.f37167c;
                ((xe) this.d).run(Integer.valueOf(i14));
                boolean z4 = true;
                if (i14 != 1 && i14 != 13) {
                    z4 = false;
                }
                yv0Var.c(z4);
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.f37166b;
                AndroidUtilities.addToClipboard((String) this.d);
                if (this.f37167c == profileActivity.T2) {
                    a02 = org.telegram.ui.Components.qc.a0(profileActivity);
                    i10 = R.string.BioCopied;
                } else {
                    a02 = org.telegram.ui.Components.qc.a0(profileActivity);
                    i10 = R.string.TextCopied;
                }
                b.m(i10, a02);
                return;
            case 4:
                n01 n01Var = (n01) this.f37166b;
                f2.m1 m1Var = (f2.m1) this.d;
                n01Var.getClass();
                int b10 = m1Var.b();
                int i15 = this.f37167c;
                if (b10 == i15 && n01Var.f39152e.R2 == i15 && m1Var.f5879f == 2) {
                    n01Var.v(m1Var, i15);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.qc.a0((org.telegram.ui.ActionBar.p2) this.f37166b).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f37167c).disableAds(false);
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.b90) this.d);
                return;
            case 6:
                ((org.telegram.messenger.video.a) this.f37166b).run();
                ((org.telegram.ui.Components.qc) this.d).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f37167c).disableAds(false);
                return;
            case 7:
                zd1 zd1Var = (zd1) this.f37166b;
                int i16 = this.f37167c;
                ((xe) this.d).run(Integer.valueOf(i16));
                boolean z10 = true;
                if (i16 != 1 && i16 != 13) {
                    z10 = false;
                }
                zd1Var.c(z10);
                return;
            case 8:
                yi1 yi1Var = (yi1) this.f37166b;
                TLObject tLObject = (TLObject) this.d;
                HashMap hashMap = yi1Var.f43634e;
                WallpapersListActivity wallpapersListActivity = yi1Var.B;
                ArrayList arrayList = yi1Var.d;
                if (this.f37167c == yi1Var.v) {
                    boolean z11 = false;
                    yi1Var.f43638s = 0;
                    int size = arrayList.size();
                    if (tLObject != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        yi1Var.f43637r = messages_botresults.next_offset;
                        int size2 = messages_botresults.results.size();
                        for (int i17 = 0; i17 < size2; i17++) {
                            TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i17);
                            if ("photo".equals(botInlineResult.type) && !hashMap.containsKey(botInlineResult.f20843id)) {
                                MediaController.SearchImage searchImage = new MediaController.SearchImage();
                                TLRPC.Photo photo = botInlineResult.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(botInlineResult.photo.sizes, 320);
                                    if (closestPhotoSizeWithSize != null) {
                                        searchImage.width = closestPhotoSizeWithSize.f20870w;
                                        searchImage.height = closestPhotoSizeWithSize.h;
                                        searchImage.photoSize = closestPhotoSizeWithSize;
                                        searchImage.photo = botInlineResult.photo;
                                        searchImage.size = closestPhotoSizeWithSize.size;
                                        searchImage.thumbPhotoSize = closestPhotoSizeWithSize2;
                                        searchImage.f18051id = botInlineResult.f20843id;
                                        searchImage.type = 0;
                                        arrayList.add(searchImage);
                                        hashMap.put(searchImage.f18051id, searchImage);
                                    }
                                } else if (botInlineResult.content != null) {
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 < botInlineResult.content.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = botInlineResult.content.attributes.get(i18);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                                searchImage.width = documentAttribute.f20852w;
                                                searchImage.height = documentAttribute.h;
                                            } else {
                                                i18++;
                                            }
                                        }
                                    }
                                    TLRPC.WebDocument webDocument = botInlineResult.thumb;
                                    if (webDocument != null) {
                                        searchImage.thumbUrl = webDocument.url;
                                    } else {
                                        searchImage.thumbUrl = null;
                                    }
                                    TLRPC.WebDocument webDocument2 = botInlineResult.content;
                                    searchImage.imageUrl = webDocument2.url;
                                    searchImage.size = webDocument2.size;
                                    searchImage.f18051id = botInlineResult.f20843id;
                                    searchImage.type = 0;
                                    arrayList.add(searchImage);
                                    hashMap.put(searchImage.f18051id, searchImage);
                                }
                            }
                        }
                        yi1Var.f43635f = (size == arrayList.size() || yi1Var.f43637r == null) ? true : true;
                    }
                    if (size != arrayList.size()) {
                        int i19 = size % wallpapersListActivity.O;
                        float f10 = size;
                        int ceil = (int) Math.ceil(f10 / i11);
                        if (i19 != 0) {
                            yi1Var.m(((int) Math.ceil(f10 / wallpapersListActivity.O)) - 1);
                        }
                        wallpapersListActivity.G.s(ceil, ((int) Math.ceil(arrayList.size() / wallpapersListActivity.O)) - ceil);
                    }
                    wallpapersListActivity.K.c();
                    return;
                }
                return;
            case 9:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f37166b;
                int i20 = this.f37167c;
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.d;
                SendMessagesHelper.getInstance(a1Var.J).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(a1Var.J).getCurrentUser(), a1Var.R.f20992id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", "sent");
                    org.telegram.ui.web.a1.u(i20, x0Var, "phone_requested", jSONObject);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 10:
                ((FfmpegAudioWaveformLoader) this.f37166b).lambda$new$0((String) this.d, this.f37167c);
                return;
            case 11:
                ((FfmpegAudioWaveformLoader) this.f37166b).lambda$receiveChunk$1((short[]) this.d, this.f37167c);
                return;
            case 12:
                qh.a5 a5Var = (qh.a5) this.f37166b;
                dg.l lVar = (dg.l) this.d;
                if (a5Var.L0.getCurrentBrush() instanceof dg.l) {
                    a5Var.Z0 = true;
                }
                a5Var.g(lVar);
                eg.m2 m2Var = a5Var.f44935h1;
                int i21 = m2Var.d + 1;
                m2Var.a(i21);
                AndroidUtilities.updateImageViewImageAnimated(m2Var.f5349a[i21], this.f37167c);
                m2Var.f5352e = true;
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new qh.d8(this.f37167c, ((MessagesStorage) this.f37166b).getUsers(new ArrayList<>((HashSet) this.d))));
                return;
            case 14:
                ((qh.ea) this.f37166b).b((short[]) this.d, this.f37167c);
                return;
            case 15:
                int[] iArr = (int[]) this.f37166b;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.d;
                int i22 = iArr[0];
                int i23 = this.f37167c;
                if (i22 >= 0) {
                    ConnectionsManager.getInstance(i23).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                }
                if (notificationCenterDelegateArr[0] != null) {
                    NotificationCenter.getInstance(i23).addObserver(notificationCenterDelegateArr[0], NotificationCenter.didReceivedWebpagesInUpdates);
                    notificationCenterDelegateArr[0] = null;
                    return;
                }
                return;
            case 16:
                sh.n3 n3Var = (sh.n3) this.f37166b;
                TLObject tLObject2 = (TLObject) this.d;
                sh.i3 i3Var = n3Var.f47578n;
                if (tLObject2 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject2;
                    n3Var.f47582x = tL_webViewResultUrl.query_id;
                    if (tL_webViewResultUrl.same_origin) {
                        i3Var.setTrustedOrigin(tL_webViewResultUrl.url);
                    }
                    i3Var.r(this.f37167c, tL_webViewResultUrl.url);
                    AndroidUtilities.runOnUIThread(n3Var.R);
                    return;
                }
                return;
            case 17:
                uf.z zVar = (uf.z) this.f37166b;
                String str = (String) this.d;
                int i24 = zVar.f48805p0;
                zVar.f48807r = null;
                int i25 = zVar.f48787a0;
                int i26 = this.f37167c;
                if (i26 == i25) {
                    if (zVar.f48802n >= 0) {
                        ConnectionsManager.getInstance(i24).cancelRequest(zVar.f48802n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    zVar.f48802n = ConnectionsManager.getInstance(i24).sendRequest(tL_channels_searchPosts, new hg.l0(zVar, i26, str, 10));
                    return;
                }
                return;
            case 18:
                vf.t tVar = (vf.t) this.f37166b;
                tVar.f49239b.add(this.f37167c, (TL_account.TL_businessChatLink) this.d);
                NotificationCenter.getInstance(tVar.f49238a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                return;
            case 19:
                wh.l5 m9 = ((wh.i5) this.f37166b).getGrid().m((TL_iv.pageTableCell) this.d);
                if (m9 != null) {
                    wh.e1 e1Var = m9.f49903a;
                    e1Var.r();
                    e1Var.setSelection(Math.max(0, Math.min(this.f37167c, e1Var.length())));
                    return;
                }
                return;
            default:
                wh.a aVar = (wh.a) this.d;
                wh.v5 v5Var = ((wh.q5) this.f37166b).f49992a;
                if (v5Var.f50156y != null) {
                    wh.v5.f(aVar.f49653b, "");
                    ((wh.a3) v5Var.f50156y).c(aVar, this.f37167c);
                    return;
                }
                return;
        }
    }

    public gu0(Object obj, Object obj2, int i10, int i11) {
        this.f37165a = i11;
        this.f37166b = obj;
        this.d = obj2;
        this.f37167c = i10;
    }
}
