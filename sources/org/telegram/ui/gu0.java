package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class gu0 implements Runnable {
    public final int f34512a;
    public final Object f34513b;
    public final int f34514c;
    public final Object d;

    public gu0(Object obj, int i10, Object obj2, int i11) {
        this.f34512a = i11;
        this.f34513b = obj;
        this.f34514c = i10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.qc a02;
        int i10;
        int i11;
        switch (this.f34512a) {
            case 0:
                hu0 hu0Var = (hu0) this.f34513b;
                Uri uri = (Uri) this.d;
                int i12 = this.f34514c;
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
                hu0 hu0Var2 = (hu0) this.f34513b;
                Bitmap bitmap = (Bitmap) this.d;
                if (this.f34514c == hu0Var2.f34754a) {
                    hu0Var2.setImageBitmap(bitmap);
                    hu0Var2.f34756c = true;
                    hu0Var2.f34755b = false;
                    return;
                }
                return;
            case 2:
                yv0 yv0Var = (yv0) this.f34513b;
                int i14 = this.f34514c;
                ((ze) this.d).run(Integer.valueOf(i14));
                boolean z4 = true;
                if (i14 != 1 && i14 != 13) {
                    z4 = false;
                }
                yv0Var.c(z4);
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.f34513b;
                AndroidUtilities.addToClipboard((String) this.d);
                if (this.f34514c == profileActivity.T2) {
                    a02 = org.telegram.ui.Components.qc.a0(profileActivity);
                    i10 = R.string.BioCopied;
                } else {
                    a02 = org.telegram.ui.Components.qc.a0(profileActivity);
                    i10 = R.string.TextCopied;
                }
                b.m(i10, a02);
                return;
            case 4:
                n01 n01Var = (n01) this.f34513b;
                f2.l1 l1Var = (f2.l1) this.d;
                n01Var.getClass();
                int b10 = l1Var.b();
                int i15 = this.f34514c;
                if (b10 == i15 && n01Var.e.R2 == i15 && l1Var.f5777f == 2) {
                    n01Var.v(l1Var, i15);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.qc.a0((org.telegram.ui.ActionBar.p2) this.f34513b).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f34514c).disableAds(false);
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.z80) this.d);
                return;
            case 6:
                ((org.telegram.messenger.video.a) this.f34513b).run();
                ((org.telegram.ui.Components.qc) this.d).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.f34514c).disableAds(false);
                return;
            case 7:
                yd1 yd1Var = (yd1) this.f34513b;
                int i16 = this.f34514c;
                ((ze) this.d).run(Integer.valueOf(i16));
                boolean z10 = true;
                if (i16 != 1 && i16 != 13) {
                    z10 = false;
                }
                yd1Var.c(z10);
                return;
            case 8:
                xi1 xi1Var = (xi1) this.f34513b;
                TLObject tLObject = (TLObject) this.d;
                HashMap hashMap = xi1Var.e;
                WallpapersListActivity wallpapersListActivity = xi1Var.B;
                ArrayList arrayList = xi1Var.d;
                if (this.f34514c == xi1Var.v) {
                    boolean z11 = false;
                    xi1Var.f40001s = 0;
                    int size = arrayList.size();
                    if (tLObject != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        xi1Var.f40000r = messages_botresults.next_offset;
                        int size2 = messages_botresults.results.size();
                        for (int i17 = 0; i17 < size2; i17++) {
                            TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i17);
                            if ("photo".equals(botInlineResult.type) && !hashMap.containsKey(botInlineResult.f19157id)) {
                                MediaController.SearchImage searchImage = new MediaController.SearchImage();
                                TLRPC.Photo photo = botInlineResult.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(botInlineResult.photo.sizes, 320);
                                    if (closestPhotoSizeWithSize != null) {
                                        searchImage.width = closestPhotoSizeWithSize.f19184w;
                                        searchImage.height = closestPhotoSizeWithSize.h;
                                        searchImage.photoSize = closestPhotoSizeWithSize;
                                        searchImage.photo = botInlineResult.photo;
                                        searchImage.size = closestPhotoSizeWithSize.size;
                                        searchImage.thumbPhotoSize = closestPhotoSizeWithSize2;
                                        searchImage.f16643id = botInlineResult.f19157id;
                                        searchImage.type = 0;
                                        arrayList.add(searchImage);
                                        hashMap.put(searchImage.f16643id, searchImage);
                                    }
                                } else if (botInlineResult.content != null) {
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 < botInlineResult.content.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = botInlineResult.content.attributes.get(i18);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                                searchImage.width = documentAttribute.f19166w;
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
                                    searchImage.f16643id = botInlineResult.f19157id;
                                    searchImage.type = 0;
                                    arrayList.add(searchImage);
                                    hashMap.put(searchImage.f16643id, searchImage);
                                }
                            }
                        }
                        xi1Var.f39998f = (size == arrayList.size() || xi1Var.f40000r == null) ? true : true;
                    }
                    if (size != arrayList.size()) {
                        int i19 = size % wallpapersListActivity.O;
                        float f10 = size;
                        int ceil = (int) Math.ceil(f10 / i11);
                        if (i19 != 0) {
                            xi1Var.m(((int) Math.ceil(f10 / wallpapersListActivity.O)) - 1);
                        }
                        wallpapersListActivity.G.s(ceil, ((int) Math.ceil(arrayList.size() / wallpapersListActivity.O)) - ceil);
                    }
                    wallpapersListActivity.K.c();
                    return;
                }
                return;
            case 9:
                ((FfmpegAudioWaveformLoader) this.f34513b).lambda$new$0((String) this.d, this.f34514c);
                return;
            case 10:
                ((FfmpegAudioWaveformLoader) this.f34513b).lambda$receiveChunk$1((short[]) this.d, this.f34514c);
                return;
            case 11:
                ph.c5 c5Var = (ph.c5) this.f34513b;
                cg.l lVar = (cg.l) this.d;
                if (c5Var.L0.getCurrentBrush() instanceof cg.l) {
                    c5Var.Z0 = true;
                }
                c5Var.x(lVar);
                dg.o2 o2Var = c5Var.f41379h1;
                int i20 = o2Var.d + 1;
                o2Var.a(i20);
                AndroidUtilities.updateImageViewImageAnimated(o2Var.f4697a[i20], this.f34514c);
                o2Var.e = true;
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.dw(this.f34514c, ((MessagesStorage) this.f34513b).getUsers(new ArrayList<>((HashSet) this.d))));
                return;
            case 13:
                ((ph.ha) this.f34513b).b((short[]) this.d, this.f34514c);
                return;
            case 14:
                int[] iArr = (int[]) this.f34513b;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.d;
                int i21 = iArr[0];
                int i22 = this.f34514c;
                if (i21 >= 0) {
                    ConnectionsManager.getInstance(i22).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                }
                if (notificationCenterDelegateArr[0] != null) {
                    NotificationCenter.getInstance(i22).addObserver(notificationCenterDelegateArr[0], NotificationCenter.didReceivedWebpagesInUpdates);
                    notificationCenterDelegateArr[0] = null;
                    return;
                }
                return;
            case 15:
                rh.n3 n3Var = (rh.n3) this.f34513b;
                TLObject tLObject2 = (TLObject) this.d;
                if (tLObject2 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject2;
                    n3Var.f43697x = tL_webViewResultUrl.query_id;
                    n3Var.f43693n.u(this.f34514c, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    AndroidUtilities.runOnUIThread(n3Var.R);
                    return;
                }
                return;
            case 16:
                tf.z zVar = (tf.z) this.f34513b;
                String str = (String) this.d;
                int i23 = zVar.f44970p0;
                zVar.f44972r = null;
                int i24 = zVar.f44953a0;
                int i25 = this.f34514c;
                if (i25 == i24) {
                    if (zVar.f44967n >= 0) {
                        ConnectionsManager.getInstance(i23).cancelRequest(zVar.f44967n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    zVar.f44967n = ConnectionsManager.getInstance(i23).sendRequest(tL_channels_searchPosts, new gg.l0(zVar, i25, str, 9));
                    return;
                }
                return;
            case 17:
                uf.t tVar = (uf.t) this.f34513b;
                tVar.f45508b.add(this.f34514c, (TL_account.TL_businessChatLink) this.d);
                NotificationCenter.getInstance(tVar.f45507a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                return;
            case 18:
                vh.m5 m9 = ((vh.j5) this.f34513b).getGrid().m((TL_iv.pageTableCell) this.d);
                if (m9 != null) {
                    vh.e1 e1Var = m9.f46103a;
                    e1Var.r();
                    e1Var.setSelection(Math.max(0, Math.min(this.f34514c, e1Var.length())));
                    return;
                }
                return;
            default:
                vh.a aVar = (vh.a) this.d;
                vh.w5 w5Var = ((vh.r5) this.f34513b).f46196a;
                if (w5Var.f46347y != null) {
                    vh.w5.f(aVar.f45853b, "");
                    ((vh.b3) w5Var.f46347y).c(aVar, this.f34514c);
                    return;
                }
                return;
        }
    }

    public gu0(Object obj, Object obj2, int i10, int i11) {
        this.f34512a = i11;
        this.f34513b = obj;
        this.d = obj2;
        this.f34514c = i10;
    }
}
