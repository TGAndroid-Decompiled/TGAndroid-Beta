package org.telegram.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;

public final class ol0 implements Runnable {

    public final int f41136a;

    public final int f41137b;

    public final Object f41138c;
    public final Object d;

    public ol0(Object obj, int i10, Object obj2, int i11) {
        this.f41136a = i11;
        this.f41138c = obj;
        this.f41137b = i10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        FrameLayout frameLayout;
        String str;
        org.telegram.ui.Components.mc mcVarA0;
        int i10;
        TLRPC.WebDocument webDocument;
        int i11 = this.f41136a;
        int i12 = 3;
        int i13 = 1;
        int i14 = this.f41137b;
        Object obj = this.d;
        Object obj2 = this.f41138c;
        switch (i11) {
            case 0:
                xm0.X((xm0) obj2, (SecureDocument) obj, i14);
                break;
            case 1:
                do0 do0Var = (do0) obj2;
                Intent intent = (Intent) obj;
                if (i14 != -1) {
                    z10 = true;
                    if (i14 == 1) {
                        int i15 = g8.a.f6714c;
                        Status status = intent != null ? (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status") : null;
                        StringBuilder sb2 = new StringBuilder("android pay error ");
                        sb2.append(status != null ? status.f3187b : "");
                        FileLog.e(sb2.toString());
                    }
                    do0Var.H0(z10, false);
                    do0Var.D0(false);
                    frameLayout = do0Var.L;
                    if (frameLayout != null) {
                        frameLayout.setClickable(z10);
                    }
                } else {
                    Parcelable.Creator<g8.i> creator = g8.i.CREATOR;
                    byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
                    g8.i iVar = (g8.i) (byteArrayExtra != null ? h7.s8.a(byteArrayExtra, creator) : null);
                    if (iVar != null && (str = iVar.h) != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(str).getJSONObject("paymentMethodData");
                            JSONObject jSONObject2 = jSONObject.getJSONObject("tokenizationData");
                            jSONObject2.getString("type");
                            String string = jSONObject2.getString("token");
                            if (do0Var.G0 == null && do0Var.I0 == null) {
                                a5.n nVarA = g7.v6.a(string);
                                do0Var.f37478s0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) nVarA.f101c, (String) nVarA.f100b);
                                dc.a aVar = (dc.a) nVarA.d;
                                do0Var.f37479t0 = aVar.a() + " *" + aVar.b();
                            } else {
                                TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = new TLRPC.TL_inputPaymentCredentialsGooglePay();
                                do0Var.F0 = tL_inputPaymentCredentialsGooglePay;
                                tL_inputPaymentCredentialsGooglePay.payment_token = new TLRPC.TL_dataJSON();
                                do0Var.F0.payment_token.data = jSONObject2.toString();
                                String strOptString = jSONObject.optString("description");
                                if (TextUtils.isEmpty(strOptString)) {
                                    do0Var.f37479t0 = "Android Pay";
                                } else {
                                    do0Var.f37479t0 = strOptString;
                                }
                            }
                            do0Var.t0();
                        } catch (JSONException e9) {
                            FileLog.e(e9);
                        }
                    }
                }
                z10 = true;
                do0Var.H0(z10, false);
                do0Var.D0(false);
                frameLayout = do0Var.L;
                if (frameLayout != null) {
                    frameLayout.setClickable(z10);
                }
                break;
            case 2:
                tt0 tt0Var = (tt0) obj2;
                Uri uri = (Uri) obj;
                tt0Var.getClass();
                try {
                    File file = new File(uri.getPath());
                    int i16 = UserConfig.selectedAccount;
                    Point point = AndroidUtilities.displaySize;
                    org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(file, true, 0L, 0, null, null, null, 0L, i16, false, point.x, point.y, null, 0, true);
                    Bitmap bitmapQ = x5Var.q(0L, false);
                    x5Var.u();
                    AndroidUtilities.runOnUIThread(new ol0(tt0Var, i14, bitmapQ, i12));
                } catch (Throwable th) {
                    FileLog.e(th);
                    AndroidUtilities.runOnUIThread(new zk0(tt0Var, 23));
                    return;
                }
                break;
            case 3:
                tt0 tt0Var2 = (tt0) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (i14 == tt0Var2.f43012a) {
                    tt0Var2.setImageBitmap(bitmap);
                    tt0Var2.f43014c = true;
                    tt0Var2.f43013b = false;
                }
                break;
            case 4:
                jv0 jv0Var = (jv0) obj2;
                ((se) obj).run(Integer.valueOf(i14));
                jv0Var.c(i14 == 1 || i14 == 13);
                break;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                AndroidUtilities.addToClipboard((String) obj);
                if (i14 == profileActivity.S2) {
                    mcVarA0 = org.telegram.ui.Components.mc.a0(profileActivity);
                    i10 = R.string.BioCopied;
                } else {
                    mcVarA0 = org.telegram.ui.Components.mc.a0(profileActivity);
                    i10 = R.string.TextCopied;
                }
                org.telegram.messenger.rl.m(i10, mcVarA0);
                break;
            case 6:
                vz0 vz0Var = (vz0) obj2;
                f2.o1 o1Var = (f2.o1) obj;
                vz0Var.getClass();
                if (o1Var.b() == i14 && vz0Var.f43554e.Q2 == i14 && o1Var.f5793f == 2) {
                    vz0Var.v(o1Var, i14);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.mc.a0((org.telegram.ui.ActionBar.n2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(i14).disableAds(false);
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.lg0) obj);
                break;
            case 8:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.mc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(i14).disableAds(false);
                break;
            case 9:
                dd1 dd1Var = (dd1) obj2;
                ((se) obj).run(Integer.valueOf(i14));
                dd1Var.c(i14 == 1 || i14 == 13);
                break;
            case 10:
                ai1 ai1Var = (ai1) obj2;
                TLObject tLObject = (TLObject) obj;
                HashMap map = ai1Var.f36543e;
                WallpapersListActivity wallpapersListActivity = ai1Var.A;
                ArrayList arrayList = ai1Var.d;
                if (i14 == ai1Var.v) {
                    ai1Var.f36547s = 0;
                    int size = arrayList.size();
                    if (tLObject != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        ai1Var.f36546r = messages_botresults.next_offset;
                        int size2 = messages_botresults.results.size();
                        for (int i17 = 0; i17 < size2; i17++) {
                            TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i17);
                            if ("photo".equals(botInlineResult.type) && !map.containsKey(botInlineResult.f22378id)) {
                                MediaController.SearchImage searchImage = new MediaController.SearchImage();
                                TLRPC.Photo photo = botInlineResult.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(botInlineResult.photo.sizes, 320);
                                    if (closestPhotoSizeWithSize != null) {
                                        searchImage.width = closestPhotoSizeWithSize.f22405w;
                                        searchImage.height = closestPhotoSizeWithSize.h;
                                        searchImage.photoSize = closestPhotoSizeWithSize;
                                        searchImage.photo = botInlineResult.photo;
                                        searchImage.size = closestPhotoSizeWithSize.size;
                                        searchImage.thumbPhotoSize = closestPhotoSizeWithSize2;
                                        searchImage.f19616id = botInlineResult.f22378id;
                                        searchImage.type = 0;
                                        arrayList.add(searchImage);
                                        map.put(searchImage.f19616id, searchImage);
                                    }
                                } else if (botInlineResult.content != null) {
                                    for (int i18 = 0; i18 < botInlineResult.content.attributes.size(); i18++) {
                                        TLRPC.DocumentAttribute documentAttribute = botInlineResult.content.attributes.get(i18);
                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                            searchImage.width = documentAttribute.f22387w;
                                            searchImage.height = documentAttribute.h;
                                            webDocument = botInlineResult.thumb;
                                            if (webDocument != null) {
                                                searchImage.thumbUrl = webDocument.url;
                                            } else {
                                                searchImage.thumbUrl = null;
                                            }
                                            TLRPC.WebDocument webDocument2 = botInlineResult.content;
                                            searchImage.imageUrl = webDocument2.url;
                                            searchImage.size = webDocument2.size;
                                            searchImage.f19616id = botInlineResult.f22378id;
                                            searchImage.type = 0;
                                            arrayList.add(searchImage);
                                            map.put(searchImage.f19616id, searchImage);
                                        }
                                    }
                                    webDocument = botInlineResult.thumb;
                                    if (webDocument != null) {
                                        searchImage.thumbUrl = webDocument.url;
                                    } else {
                                        searchImage.thumbUrl = null;
                                    }
                                    TLRPC.WebDocument webDocument3 = botInlineResult.content;
                                    searchImage.imageUrl = webDocument3.url;
                                    searchImage.size = webDocument3.size;
                                    searchImage.f19616id = botInlineResult.f22378id;
                                    searchImage.type = 0;
                                    arrayList.add(searchImage);
                                    map.put(searchImage.f19616id, searchImage);
                                }
                            }
                        }
                        ai1Var.f36544f = size == arrayList.size() || ai1Var.f36546r == null;
                    }
                    if (size != arrayList.size()) {
                        int i19 = wallpapersListActivity.N;
                        int i20 = size % i19;
                        float f10 = size;
                        int iCeil = (int) Math.ceil(f10 / i19);
                        if (i20 != 0) {
                            ai1Var.m(((int) Math.ceil(f10 / wallpapersListActivity.N)) - 1);
                        }
                        wallpapersListActivity.F.s(iCeil, ((int) Math.ceil(arrayList.size() / wallpapersListActivity.N)) - iCeil);
                    }
                    wallpapersListActivity.J.c();
                    break;
                }
                break;
            case 11:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj2;
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) obj;
                SendMessagesHelper.getInstance(z0Var.I).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(z0Var.I).getCurrentUser(), z0Var.Q.f22527id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("status", "sent");
                    org.telegram.ui.web.z0.u(i14, w0Var, "phone_requested", jSONObject3);
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            case 12:
                pf.z zVar = (pf.z) obj2;
                String str2 = (String) obj;
                int i21 = zVar.f45996o0;
                zVar.f45999r = null;
                if (i14 == zVar.Z) {
                    if (zVar.f45994n >= 0) {
                        ConnectionsManager.getInstance(i21).cancelRequest(zVar.f45994n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags |= 1;
                    tL_channels_searchPosts.hashtag = str2;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    zVar.f45994n = ConnectionsManager.getInstance(i21).sendRequest(tL_channels_searchPosts, new cg.m0(zVar, i14, str2, 10));
                    break;
                }
                break;
            case 13:
                qf.v vVar = (qf.v) obj2;
                vVar.f46466b.add(i14, (TL_account.TL_businessChatLink) obj);
                NotificationCenter.getInstance(vVar.f46465a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                break;
            case 14:
                rh.j5 j5VarM = ((rh.g5) obj2).getGrid().m((TL_iv.pageTableCell) obj);
                if (j5VarM != null) {
                    rh.d1 d1Var = j5VarM.f47226a;
                    d1Var.r();
                    d1Var.setSelection(Math.max(0, Math.min(i14, d1Var.length())));
                    break;
                }
                break;
            case 15:
                rh.a aVar2 = (rh.a) obj;
                rh.t5 t5Var = ((rh.o5) obj2).f47322a;
                if (t5Var.f47488y != null) {
                    rh.t5.f(aVar2.f47028b, "");
                    ((rh.y2) t5Var.f47488y).c(aVar2, i14);
                    break;
                }
                break;
            case 16:
                ((View) obj).postOnAnimation(new we.a((wg.a) obj2, i14, i13));
                break;
            case 17:
                yf.p0 p0Var = (yf.p0) obj2;
                p0Var.e((yf.e1) obj, i14, p0Var.h);
                p0Var.h = null;
                break;
            default:
                zf.l0 l0Var = (zf.l0) obj2;
                yf.l lVar = (yf.l) obj;
                if (l0Var.S0.getCurrentBrush() instanceof yf.l) {
                    l0Var.f50516g1 = true;
                }
                l0Var.l(lVar);
                zf.r1 r1Var = l0Var.f50528p1;
                int i22 = r1Var.d + 1;
                r1Var.a(i22);
                AndroidUtilities.updateImageViewImageAnimated(r1Var.f50684a[i22], i14);
                r1Var.f50687e = true;
                break;
        }
    }

    public ol0(Object obj, Object obj2, int i10, int i11) {
        this.f41136a = i11;
        this.f41138c = obj;
        this.d = obj2;
        this.f41137b = i10;
    }
}
