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
public final class bu0 implements Runnable {
    public final int f35591a;
    public final Object f35592b;
    public final int f35593c;
    public final Object d;

    public bu0(Object obj, int i10, Object obj2, int i11) {
        this.f35591a = i11;
        this.f35592b = obj;
        this.f35593c = i10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.qc a02;
        int i10;
        int i11;
        switch (this.f35591a) {
            case 0:
                cu0 cu0Var = (cu0) this.f35592b;
                Uri uri = (Uri) this.d;
                int i12 = this.f35593c;
                cu0Var.getClass();
                try {
                    File file = new File(uri.getPath());
                    int i13 = UserConfig.selectedAccount;
                    Point point = AndroidUtilities.displaySize;
                    org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(file, true, 0L, 0, null, null, null, 0L, i13, false, point.x, point.y, null, 0, true);
                    Bitmap q10 = y5Var.q(0L, false);
                    y5Var.u();
                    AndroidUtilities.runOnUIThread(new bu0(cu0Var, i12, q10, 1));
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new gl0(cu0Var, 23));
                    return;
                }
            case 1:
                cu0 cu0Var2 = (cu0) this.f35592b;
                Bitmap bitmap = (Bitmap) this.d;
                if (this.f35593c == cu0Var2.f35909a) {
                    cu0Var2.setImageBitmap(bitmap);
                    cu0Var2.f35911c = true;
                    cu0Var2.f35910b = false;
                    return;
                }
                return;
            case 2:
                tv0 tv0Var = (tv0) this.f35592b;
                int i14 = this.f35593c;
                ((xe) this.d).run(Integer.valueOf(i14));
                boolean z4 = true;
                if (i14 != 1 && i14 != 13) {
                    z4 = false;
                }
                tv0Var.c(z4);
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.f35592b;
                AndroidUtilities.addToClipboard((String) this.d);
                if (this.f35593c == profileActivity.T2) {
                    a02 = org.telegram.ui.Components.qc.a0(profileActivity);
                    i10 = R.string.BioCopied;
                } else {
                    a02 = org.telegram.ui.Components.qc.a0(profileActivity);
                    i10 = R.string.TextCopied;
                }
                b.m(i10, a02);
                return;
            case 4:
                i01 i01Var = (i01) this.f35592b;
                f2.m1 m1Var = (f2.m1) this.d;
                i01Var.getClass();
                int b10 = m1Var.b();
                int i15 = this.f35593c;
                if (b10 == i15 && i01Var.f37715e.R2 == i15 && m1Var.f5879f == 2) {
                    i01Var.v(m1Var, i15);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.qc.a0((org.telegram.ui.ActionBar.p2) this.f35592b).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f35593c).disableAds(false);
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.a90) this.d);
                return;
            case 6:
                ((org.telegram.messenger.video.a) this.f35592b).run();
                ((org.telegram.ui.Components.qc) this.d).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f35593c).disableAds(false);
                return;
            case 7:
                ud1 ud1Var = (ud1) this.f35592b;
                int i16 = this.f35593c;
                ((xe) this.d).run(Integer.valueOf(i16));
                boolean z10 = true;
                if (i16 != 1 && i16 != 13) {
                    z10 = false;
                }
                ud1Var.c(z10);
                return;
            case 8:
                si1 si1Var = (si1) this.f35592b;
                TLObject tLObject = (TLObject) this.d;
                HashMap hashMap = si1Var.f41302e;
                WallpapersListActivity wallpapersListActivity = si1Var.B;
                ArrayList arrayList = si1Var.d;
                if (this.f35593c == si1Var.v) {
                    boolean z11 = false;
                    si1Var.f41306s = 0;
                    int size = arrayList.size();
                    if (tLObject != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        si1Var.f41305r = messages_botresults.next_offset;
                        int size2 = messages_botresults.results.size();
                        for (int i17 = 0; i17 < size2; i17++) {
                            TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i17);
                            if ("photo".equals(botInlineResult.type) && !hashMap.containsKey(botInlineResult.f20841id)) {
                                MediaController.SearchImage searchImage = new MediaController.SearchImage();
                                TLRPC.Photo photo = botInlineResult.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(botInlineResult.photo.sizes, 320);
                                    if (closestPhotoSizeWithSize != null) {
                                        searchImage.width = closestPhotoSizeWithSize.f20868w;
                                        searchImage.height = closestPhotoSizeWithSize.h;
                                        searchImage.photoSize = closestPhotoSizeWithSize;
                                        searchImage.photo = botInlineResult.photo;
                                        searchImage.size = closestPhotoSizeWithSize.size;
                                        searchImage.thumbPhotoSize = closestPhotoSizeWithSize2;
                                        searchImage.f18049id = botInlineResult.f20841id;
                                        searchImage.type = 0;
                                        arrayList.add(searchImage);
                                        hashMap.put(searchImage.f18049id, searchImage);
                                    }
                                } else if (botInlineResult.content != null) {
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 < botInlineResult.content.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = botInlineResult.content.attributes.get(i18);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                                searchImage.width = documentAttribute.f20850w;
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
                                    searchImage.f18049id = botInlineResult.f20841id;
                                    searchImage.type = 0;
                                    arrayList.add(searchImage);
                                    hashMap.put(searchImage.f18049id, searchImage);
                                }
                            }
                        }
                        si1Var.f41303f = (size == arrayList.size() || si1Var.f41305r == null) ? true : true;
                    }
                    if (size != arrayList.size()) {
                        int i19 = size % wallpapersListActivity.O;
                        float f10 = size;
                        int ceil = (int) Math.ceil(f10 / i11);
                        if (i19 != 0) {
                            si1Var.m(((int) Math.ceil(f10 / wallpapersListActivity.O)) - 1);
                        }
                        wallpapersListActivity.G.s(ceil, ((int) Math.ceil(arrayList.size() / wallpapersListActivity.O)) - ceil);
                    }
                    wallpapersListActivity.K.c();
                    return;
                }
                return;
            case 9:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f35592b;
                int i20 = this.f35593c;
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.d;
                SendMessagesHelper.getInstance(a1Var.J).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(a1Var.J).getCurrentUser(), a1Var.R.f20990id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
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
                ((FfmpegAudioWaveformLoader) this.f35592b).lambda$new$0((String) this.d, this.f35593c);
                return;
            case 11:
                ((FfmpegAudioWaveformLoader) this.f35592b).lambda$receiveChunk$1((short[]) this.d, this.f35593c);
                return;
            case 12:
                qh.b5 b5Var = (qh.b5) this.f35592b;
                dg.l lVar = (dg.l) this.d;
                if (b5Var.L0.getCurrentBrush() instanceof dg.l) {
                    b5Var.Z0 = true;
                }
                b5Var.g(lVar);
                eg.m2 m2Var = b5Var.f44958h1;
                int i21 = m2Var.d + 1;
                m2Var.a(i21);
                AndroidUtilities.updateImageViewImageAnimated(m2Var.f5349a[i21], this.f35593c);
                m2Var.f5352e = true;
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new qh.e8(this.f35593c, ((MessagesStorage) this.f35592b).getUsers(new ArrayList<>((HashSet) this.d))));
                return;
            case 14:
                ((qh.fa) this.f35592b).b((short[]) this.d, this.f35593c);
                return;
            case 15:
                int[] iArr = (int[]) this.f35592b;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.d;
                int i22 = iArr[0];
                int i23 = this.f35593c;
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
                sh.n3 n3Var = (sh.n3) this.f35592b;
                TLObject tLObject2 = (TLObject) this.d;
                sh.i3 i3Var = n3Var.f47542n;
                if (tLObject2 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject2;
                    n3Var.f47546x = tL_webViewResultUrl.query_id;
                    if (tL_webViewResultUrl.same_origin) {
                        i3Var.setTrustedOrigin(tL_webViewResultUrl.url);
                    }
                    i3Var.r(this.f35593c, tL_webViewResultUrl.url);
                    AndroidUtilities.runOnUIThread(n3Var.R);
                    return;
                }
                return;
            case 17:
                uf.z zVar = (uf.z) this.f35592b;
                String str = (String) this.d;
                int i24 = zVar.f48769p0;
                zVar.f48771r = null;
                int i25 = zVar.f48751a0;
                int i26 = this.f35593c;
                if (i26 == i25) {
                    if (zVar.f48766n >= 0) {
                        ConnectionsManager.getInstance(i24).cancelRequest(zVar.f48766n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    zVar.f48766n = ConnectionsManager.getInstance(i24).sendRequest(tL_channels_searchPosts, new hg.l0(zVar, i26, str, 10));
                    return;
                }
                return;
            case 18:
                vf.t tVar = (vf.t) this.f35592b;
                tVar.f49202b.add(this.f35593c, (TL_account.TL_businessChatLink) this.d);
                NotificationCenter.getInstance(tVar.f49201a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                return;
            case 19:
                wh.l5 m9 = ((wh.i5) this.f35592b).getGrid().m((TL_iv.pageTableCell) this.d);
                if (m9 != null) {
                    wh.e1 e1Var = m9.f49866a;
                    e1Var.r();
                    e1Var.setSelection(Math.max(0, Math.min(this.f35593c, e1Var.length())));
                    return;
                }
                return;
            default:
                wh.a aVar = (wh.a) this.d;
                wh.v5 v5Var = ((wh.q5) this.f35592b).f49955a;
                if (v5Var.f50119y != null) {
                    wh.v5.f(aVar.f49616b, "");
                    ((wh.a3) v5Var.f50119y).c(aVar, this.f35593c);
                    return;
                }
                return;
        }
    }

    public bu0(Object obj, Object obj2, int i10, int i11) {
        this.f35591a = i11;
        this.f35592b = obj;
        this.d = obj2;
        this.f35593c = i10;
    }
}
