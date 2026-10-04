package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.webkit.WebView;
import android.widget.TextView;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;
public final class in0 implements Runnable {
    public final int f27443a;
    public final Object f27444b;
    public final Object f27445c;
    public final Object d;

    public in0(Object obj, Serializable serializable, ArrayList arrayList, int i10) {
        this.f27443a = i10;
        this.f27444b = obj;
        this.d = serializable;
        this.f27445c = arrayList;
    }

    private final void a() {
        boolean z10;
        Object obj;
        org.telegram.ui.web.j2 j2Var = (org.telegram.ui.web.j2) this.f27444b;
        org.telegram.ui.web.i2 i2Var = (org.telegram.ui.web.i2) this.f27445c;
        Bitmap bitmap = (Bitmap) this.d;
        j2Var.getClass();
        if (org.telegram.ui.web.j2.f42239f != null) {
            int i10 = 0;
            if ((i2Var.d <= 0 || i2Var.f42228e <= 0) && bitmap != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (bitmap != null) {
                j2Var.d.put(i2Var.f42226b, bitmap);
                if (z10) {
                    int i11 = i2Var.d;
                    if (i11 == 0 && i2Var.f42228e == 0) {
                        i2Var.d = bitmap.getWidth();
                        i2Var.f42228e = bitmap.getHeight();
                    } else if (i11 == 0) {
                        i2Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * i2Var.f42228e);
                    } else if (i2Var.f42228e == 0) {
                        i2Var.f42228e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * i2Var.d);
                    }
                }
            }
            ArrayList arrayList = (ArrayList) org.telegram.ui.web.j2.f42239f.remove(i2Var.f42226b);
            if (arrayList != null) {
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    Pair pair = (Pair) obj2;
                    ((ImageReceiver) pair.first).setImageBitmap(bitmap);
                    if (z10 && (obj = pair.second) != null) {
                        ((Runnable) obj).run();
                    }
                }
            }
        }
    }

    @Override
    public final void run() {
        os0 os0Var;
        boolean z10;
        int i10;
        org.telegram.ui.ActionBar.n2 n2Var;
        long peerId;
        String str;
        ArrayList arrayList;
        int i11;
        char c10;
        int i12;
        TLRPC.Document document;
        boolean z11;
        String str2;
        Uri uri;
        String stickerExt;
        int i13;
        int i14;
        int i15;
        String absolutePath;
        String absolutePath2;
        boolean z12;
        org.telegram.ui.web.n2 n2Var2;
        TLRPC.User user;
        char c11 = 65535;
        int i16 = 4;
        String str3 = null;
        Object obj = null;
        Boolean bool = null;
        r8 = null;
        String str4 = null;
        int i17 = 0;
        boolean z13 = true;
        switch (this.f27443a) {
            case 0:
                on0 on0Var = (on0) this.f27444b;
                ArrayList arrayList2 = (ArrayList) this.f27445c;
                ArrayList<MessageObject> arrayList3 = (ArrayList) this.d;
                int i18 = on0Var.d;
                for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                    DownloadController.getInstance(i18).onDownloadComplete((MessageObject) arrayList2.get(i19));
                }
                if (!arrayList3.isEmpty()) {
                    DownloadController.getInstance(i18).deleteRecentFiles(arrayList3);
                }
                on0Var.O = false;
                on0Var.d(true);
                return;
            case 1:
                jo0 jo0Var = (jo0) this.f27444b;
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.f27445c;
                b80 b80Var = (b80) this.d;
                if (UserConfig.getInstance(jo0Var.K0.I0).isPremium()) {
                    uyVar.getMessagesController().disableAds(true);
                    jo0Var.T();
                    yc.a0(uyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                } else {
                    new rg.y0((org.telegram.ui.ActionBar.n2) uyVar, 3, true).show();
                }
                b80Var.u();
                return;
            case 2:
                pv0 pv0Var = (pv0) this.f27444b;
                e5.S(pv0Var.getContext(), null, pv0Var.F1, new rr0(pv0Var, (TL_stories.StoryItem) this.f27445c));
                ((b80) this.d).u();
                return;
            case 3:
                pv0 pv0Var2 = (pv0) this.f27444b;
                String str5 = (String) this.f27445c;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) this.d;
                st0 st0Var = new st0(pv0Var2.getContext(), str5, str5, pv0Var2.F1, n2Var3);
                if (n2Var3 != null) {
                    n2Var3.showDialog(st0Var);
                    return;
                } else {
                    st0Var.show();
                    return;
                }
            case 4:
                tt0 tt0Var = (tt0) this.f27444b;
                pv0 pv0Var3 = tt0Var.d;
                e5.S(pv0Var3.getContext(), pv0Var3.f29800v1, (org.telegram.ui.ActionBar.d6) this.f27445c, new pv(tt0Var, 21));
                ((b80) this.d).u();
                return;
            case 5:
                au0 au0Var = (au0) this.f27444b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f27445c;
                TLObject tLObject = (TLObject) this.d;
                pv0 pv0Var4 = au0Var.f24663n;
                int h = au0Var.h();
                if (tL_error == null) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    pv0Var4.f29800v1.getMessagesController().putChats(messages_chats.chats, false);
                    if (!messages_chats.chats.isEmpty() && messages_chats.chats.size() == 100) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    au0Var.h = z10;
                    au0Var.d.addAll(messages_chats.chats);
                } else {
                    au0Var.h = true;
                }
                int i20 = 0;
                while (true) {
                    iu0[] iu0VarArr = pv0Var4.f29776k0;
                    if (i20 < iu0VarArr.length) {
                        iu0 iu0Var = iu0VarArr[i20];
                        if (iu0Var.F == 6 && (os0Var = iu0Var.h) != null && (au0Var.f24662f || h == 0)) {
                            pv0Var4.z(os0Var, 0, null);
                        }
                        i20++;
                    } else {
                        au0Var.f24661e = false;
                        au0Var.f24662f = true;
                        au0Var.l();
                        return;
                    }
                }
                break;
            case 6:
                gu0 gu0Var = (gu0) this.f27444b;
                ArrayList arrayList4 = (ArrayList) this.f27445c;
                String str6 = " ";
                org.telegram.ui.ActionBar.n2 n2Var4 = gu0Var.f26925s.f29800v1;
                String lowerCase = ((String) this.d).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new in0((Object) gu0Var, (Object) new ArrayList(), (Object) new ArrayList(), 7));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                translitString = (lowerCase.equals(translitString) || translitString.length() == 0) ? null : null;
                if (translitString != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                int i21 = i10 + 1;
                String[] strArr = new String[i21];
                strArr[0] = lowerCase;
                if (translitString != null) {
                    strArr[1] = translitString;
                }
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                int size = arrayList4.size();
                int i22 = 0;
                while (i22 < size) {
                    TLObject tLObject2 = (TLObject) arrayList4.get(i22);
                    if (tLObject2 instanceof TLRPC.ChatParticipant) {
                        n2Var = n2Var4;
                        peerId = ((TLRPC.ChatParticipant) tLObject2).user_id;
                    } else {
                        n2Var = n2Var4;
                        if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                            peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer);
                        }
                        arrayList = arrayList4;
                        str = str6;
                        i11 = i22;
                        i22 = i11 + 1;
                        n2Var4 = n2Var;
                        arrayList4 = arrayList;
                        str6 = str;
                        str3 = null;
                    }
                    TLRPC.User user2 = n2Var.getMessagesController().getUser(Long.valueOf(peerId));
                    if (user2.f20184id != n2Var.getUserConfig().getClientUserId()) {
                        String lowerCase2 = UserObject.getUserName(user2).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        if (lowerCase2.equals(translitString2)) {
                            translitString2 = str3;
                        }
                        int i23 = 0;
                        char c12 = 0;
                        while (i23 < i21) {
                            arrayList = arrayList4;
                            String str7 = strArr[i23];
                            if (lowerCase2.startsWith(str7) || org.telegram.messenger.f0.w(str6, str7, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str7) || org.telegram.messenger.f0.w(str6, str7, translitString2)))) {
                                str = str6;
                                c10 = 1;
                            } else {
                                str = str6;
                                String publicUsername = UserObject.getPublicUsername(user2);
                                if (publicUsername != null && publicUsername.startsWith(str7)) {
                                    c10 = 2;
                                } else {
                                    c10 = c12;
                                }
                            }
                            if (c10 != 0) {
                                i11 = i22;
                                if (c10 == 1) {
                                    arrayList5.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str7));
                                } else {
                                    arrayList5.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user2), null, "@" + str7));
                                }
                                arrayList6.add(tLObject2);
                                i22 = i11 + 1;
                                n2Var4 = n2Var;
                                arrayList4 = arrayList;
                                str6 = str;
                                str3 = null;
                            } else {
                                i23++;
                                arrayList4 = arrayList;
                                c12 = c10;
                                str6 = str;
                            }
                        }
                    }
                    arrayList = arrayList4;
                    str = str6;
                    i11 = i22;
                    i22 = i11 + 1;
                    n2Var4 = n2Var;
                    arrayList4 = arrayList;
                    str6 = str;
                    str3 = null;
                }
                AndroidUtilities.runOnUIThread(new in0((Object) gu0Var, (Object) arrayList5, (Object) arrayList6, 7));
                return;
            case 7:
                gu0 gu0Var2 = (gu0) this.f27444b;
                ArrayList arrayList7 = (ArrayList) this.f27445c;
                ArrayList arrayList8 = (ArrayList) this.d;
                pv0 pv0Var5 = gu0Var2.f26925s;
                if (pv0Var5.V0) {
                    gu0Var2.d = arrayList7;
                    gu0Var2.f26924r--;
                    if (!ChatObject.isChannel(gu0Var2.f26923n)) {
                        ArrayList arrayList9 = gu0Var2.f26921e.f10536g;
                        arrayList9.clear();
                        arrayList9.addAll(arrayList8);
                    }
                    if (gu0Var2.f26924r == 0) {
                        int i24 = 0;
                        while (true) {
                            iu0[] iu0VarArr2 = pv0Var5.f29776k0;
                            if (i24 < iu0VarArr2.length) {
                                iu0 iu0Var2 = iu0VarArr2[i24];
                                if (iu0Var2.F == 7) {
                                    if (gu0Var2.h == 0) {
                                        iu0Var2.f27503w.e(false, true);
                                    } else {
                                        pv0Var5.z(iu0Var2.h, 0, null);
                                    }
                                }
                                i24++;
                            }
                        }
                    }
                    gu0Var2.l();
                    return;
                }
                return;
            case 8:
                lu0 lu0Var = (lu0) this.f27444b;
                ArrayList arrayList10 = (ArrayList) this.f27445c;
                lu0Var.getClass();
                String lowerCase3 = ((String) this.d).trim().toLowerCase();
                if (lowerCase3.length() == 0) {
                    AndroidUtilities.runOnUIThread(new uo0(8, lu0Var, new ArrayList()));
                    return;
                }
                String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                if (!lowerCase3.equals(translitString3) && translitString3.length() != 0) {
                    str4 = translitString3;
                }
                if (str4 != null) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                int i25 = i12 + 1;
                String[] strArr2 = new String[i25];
                strArr2[0] = lowerCase3;
                if (str4 != null) {
                    strArr2[1] = str4;
                }
                ArrayList arrayList11 = new ArrayList();
                int i26 = 0;
                while (i26 < arrayList10.size()) {
                    MessageObject messageObject = (MessageObject) arrayList10.get(i26);
                    int i27 = 0;
                    while (true) {
                        if (i27 < i25) {
                            String str8 = strArr2[i27];
                            String documentName = messageObject.getDocumentName();
                            if (documentName != null && documentName.length() != 0) {
                                if (documentName.toLowerCase().contains(str8)) {
                                    arrayList11.add(messageObject);
                                } else if (lu0Var.f28435r != i16) {
                                    continue;
                                } else {
                                    if (messageObject.type == 0) {
                                        document = MessageObject.getMedia(messageObject.messageOwner).webpage.document;
                                    } else {
                                        document = MessageObject.getMedia(messageObject.messageOwner).document;
                                    }
                                    int i28 = 0;
                                    while (true) {
                                        if (i28 < document.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i28);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                String str9 = documentAttribute.performer;
                                                if (str9 != null) {
                                                    z11 = str9.toLowerCase().contains(str8);
                                                } else {
                                                    z11 = false;
                                                }
                                                if (!z11 && (str2 = documentAttribute.title) != null) {
                                                    z11 = str2.toLowerCase().contains(str8);
                                                }
                                            } else {
                                                i28++;
                                            }
                                        } else {
                                            z11 = false;
                                        }
                                    }
                                    if (z11) {
                                        arrayList11.add(messageObject);
                                    }
                                }
                            }
                            i27++;
                            i16 = 4;
                        }
                    }
                    i26++;
                    i16 = 4;
                }
                AndroidUtilities.runOnUIThread(new uo0(8, lu0Var, arrayList11));
                return;
            case 9:
                qy0 qy0Var = (qy0) this.f27444b;
                String str10 = (String) this.f27445c;
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) this.d;
                if (!qy0Var.isDismissed()) {
                    qy0Var.Z.remove(str10);
                    if (!"application/x-tgsticker".equals(importingSticker.mimeType)) {
                        qy0Var.u0(importingSticker);
                    } else {
                        importingSticker.validated = true;
                        int indexOf = qy0Var.Y.indexOf(importingSticker);
                        if (indexOf >= 0) {
                            s4.c1 K = qy0Var.f30188c.K(indexOf);
                            if (K != null) {
                                ((org.telegram.ui.Cells.f8) K.f46523a).setSticker(importingSticker);
                            }
                        } else {
                            qy0Var.d.l();
                        }
                    }
                    if (qy0Var.Z.isEmpty()) {
                        qy0Var.B0();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                qy0.w((qy0) this.f27444b, (ArrayList) this.f27445c, (Boolean) this.d);
                return;
            case 11:
                qy0.C((qy0) this.f27444b, (TLRPC.TL_error) this.f27445c, (TLObject) this.d);
                return;
            case 12:
                qy0.E((qy0) this.f27444b, (String) this.f27445c, (TextView) this.d);
                return;
            case 13:
                qy0 qy0Var2 = (qy0) this.f27444b;
                ArrayList arrayList12 = (ArrayList) this.f27445c;
                ArrayList arrayList13 = (ArrayList) this.d;
                ArrayList arrayList14 = new ArrayList();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                int size2 = arrayList12.size();
                while (i17 < size2) {
                    Object obj2 = arrayList12.get(i17);
                    if ((obj2 instanceof Uri) && (stickerExt = MediaController.getStickerExt((uri = (Uri) obj2))) != null) {
                        boolean equals = "tgs".equals(stickerExt);
                        if (bool == null) {
                            bool = Boolean.valueOf(equals);
                        } else if (bool.booleanValue() != equals) {
                            continue;
                        }
                        if (!qy0Var2.isDismissed()) {
                            SendMessagesHelper.ImportingSticker importingSticker2 = new SendMessagesHelper.ImportingSticker();
                            importingSticker2.animated = equals;
                            if (equals) {
                                i13 = 64;
                            } else {
                                i13 = 512;
                            }
                            String copyFileToCache = MediaController.copyFileToCache(uri, stickerExt, i13 * 1024);
                            importingSticker2.path = copyFileToCache;
                            if (copyFileToCache != null) {
                                if (!equals) {
                                    BitmapFactory.decodeFile(copyFileToCache, options);
                                    int i29 = options.outWidth;
                                    if ((i29 == 512 && (i14 = options.outHeight) > 0 && i14 <= 512) || (options.outHeight == 512 && i29 > 0 && i29 <= 512)) {
                                        importingSticker2.mimeType = "image/".concat(stickerExt);
                                        importingSticker2.validated = true;
                                    }
                                } else {
                                    importingSticker2.mimeType = "application/x-tgsticker";
                                }
                                if (arrayList13 != null && arrayList13.size() == size2 && (arrayList13.get(i17) instanceof String)) {
                                    importingSticker2.emoji = (String) arrayList13.get(i17);
                                } else {
                                    importingSticker2.emoji = "#️⃣";
                                }
                                arrayList14.add(importingSticker2);
                                if (arrayList14.size() >= 200) {
                                    AndroidUtilities.runOnUIThread(new in0(qy0Var2, arrayList14, bool, 10));
                                    return;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            return;
                        }
                    }
                    i17++;
                }
                AndroidUtilities.runOnUIThread(new in0(qy0Var2, arrayList14, bool, 10));
                return;
            case 14:
                b61 b61Var = (b61) this.f27444b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f27445c;
                TLObject tLObject3 = (TLObject) this.d;
                SparseArray sparseArray = b61Var.f24802f;
                ArrayList arrayList15 = b61Var.f24801e;
                ArrayList arrayList16 = b61Var.f24803n;
                SparseArray sparseArray2 = b61Var.d;
                b61Var.f24804r = false;
                if (tL_error2 == null && (tLObject3 instanceof TLRPC.TL_messages_featuredStickers)) {
                    ArrayList<TLRPC.StickerSetCovered> arrayList17 = ((TLRPC.TL_messages_featuredStickers) tLObject3).sets;
                    if (arrayList17.size() < 40) {
                        b61Var.f24805s = true;
                    }
                    if (!arrayList17.isEmpty()) {
                        if (arrayList16.isEmpty()) {
                            int i30 = b61Var.f24806w;
                            b61Var.f24806w = i30 + 1;
                            sparseArray2.put(i30, -1);
                        }
                        arrayList16.addAll(arrayList17);
                        int size3 = arrayList15.size();
                        for (int i31 = 0; i31 < arrayList17.size(); i31++) {
                            TLRPC.StickerSetCovered stickerSetCovered = arrayList17.get(i31);
                            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                                arrayList15.add(stickerSetCovered);
                                sparseArray.put(b61Var.f24806w, stickerSetCovered);
                                int i32 = b61Var.f24806w;
                                b61Var.f24806w = i32 + 1;
                                int i33 = size3 + 1;
                                sparseArray2.put(i32, Integer.valueOf(size3));
                                if (!stickerSetCovered.covers.isEmpty()) {
                                    i15 = (int) Math.ceil(stickerSetCovered.covers.size() / b61Var.v);
                                    for (int i34 = 0; i34 < stickerSetCovered.covers.size(); i34++) {
                                        sparseArray2.put(b61Var.f24806w + i34, stickerSetCovered.covers.get(i34));
                                    }
                                } else {
                                    sparseArray2.put(b61Var.f24806w, stickerSetCovered.cover);
                                    i15 = 1;
                                }
                                int i35 = 0;
                                while (true) {
                                    int i36 = b61Var.v * i15;
                                    if (i35 < i36) {
                                        sparseArray.put(b61Var.f24806w + i35, stickerSetCovered);
                                        i35++;
                                    } else {
                                        b61Var.f24806w = i36 + b61Var.f24806w;
                                        size3 = i33;
                                    }
                                }
                            }
                        }
                        b61Var.l();
                        return;
                    }
                    return;
                }
                b61Var.f24805s = true;
                return;
            case 15:
                k81 k81Var = (k81) this.f27444b;
                Uri uri2 = (Uri) this.f27445c;
                MessageObject messageObject2 = (MessageObject) this.d;
                k81Var.getClass();
                if ("tg".equals(uri2.getScheme())) {
                    int intValue = Utilities.parseInt((CharSequence) uri2.getQueryParameter("account")).intValue();
                    Object parentObject = FileLoader.getInstance(intValue).getParentObject(Utilities.parseInt((CharSequence) uri2.getQueryParameter("rid")).intValue());
                    TLRPC.TL_document tL_document = new TLRPC.TL_document();
                    tL_document.access_hash = Utilities.parseLong(uri2.getQueryParameter("hash")).longValue();
                    tL_document.f20043id = Utilities.parseLong(uri2.getQueryParameter("id")).longValue();
                    tL_document.size = Utilities.parseLong(uri2.getQueryParameter("size")).longValue();
                    tL_document.dc_id = Utilities.parseInt((CharSequence) uri2.getQueryParameter("dc")).intValue();
                    tL_document.mime_type = uri2.getQueryParameter("mime");
                    tL_document.file_reference = Utilities.hexToBytes(uri2.getQueryParameter("reference"));
                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                    tL_documentAttributeFilename.file_name = uri2.getQueryParameter("name");
                    tL_document.attributes.add(tL_documentAttributeFilename);
                    tL_document.attributes.add(new TLRPC.TL_documentAttributeVideo());
                    if (FileLoader.getInstance(intValue).isLoadingFile(FileLoader.getAttachFileName(tL_document))) {
                        File directory = FileLoader.getDirectory(4);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(tL_document.dc_id);
                        sb2.append("_");
                        absolutePath = new File(directory, a4.a.r(sb2, tL_document.f20043id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath = FileLoader.getInstance(intValue).getPathToAttach(tL_document, false).getAbsolutePath();
                    }
                    k81Var.f28009b = new d6(new File(absolutePath), true, tL_document.size, 1, tL_document, null, parentObject, 0L, intValue, true);
                } else {
                    k81Var.f28009b = new d6(new File(uri2.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                }
                k81Var.f28011c = k81Var.f28009b.d[4];
                float f7 = k81Var.h;
                if (f7 != 0.0f) {
                    k81Var.e(messageObject2, f7, k81Var.f28020r);
                    k81Var.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new g81(k81Var, 1));
                return;
            case 16:
                k81 k81Var2 = (k81) this.f27444b;
                b81 b81Var = (b81) this.f27445c;
                MessageObject messageObject3 = (MessageObject) this.d;
                k81Var2.getClass();
                if (b81Var.b()) {
                    k81Var2.f28009b = new d6(new File(b81Var.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                } else {
                    int i37 = UserConfig.selectedAccount;
                    try {
                        i37 = Utilities.parseInt((CharSequence) b81Var.d.getQueryParameter("account")).intValue();
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    int i38 = i37;
                    try {
                        obj = FileLoader.getInstance(i38).getParentObject(Utilities.parseInt((CharSequence) b81Var.d.getQueryParameter("rid")).intValue());
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    Object obj3 = obj;
                    TLRPC.Document document2 = b81Var.f24856g;
                    if (FileLoader.getInstance(i38).isLoadingFile(FileLoader.getAttachFileName(document2))) {
                        File directory2 = FileLoader.getDirectory(4);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(document2.dc_id);
                        sb3.append("_");
                        absolutePath2 = new File(directory2, a4.a.r(sb3, document2.f20043id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath2 = FileLoader.getInstance(i38).getPathToAttach(document2, false).getAbsolutePath();
                    }
                    k81Var2.f28009b = new d6(new File(absolutePath2), true, document2.size, 1, document2, null, obj3, 0L, i38, true);
                }
                k81Var2.f28011c = k81Var2.f28009b.d[4];
                float f10 = k81Var2.h;
                if (f10 != 0.0f) {
                    k81Var2.e(messageObject3, f10, k81Var2.f28020r);
                    k81Var2.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new g81(k81Var2, 2));
                return;
            case 17:
                org.telegram.ui.Components.voip.m0 m0Var = (org.telegram.ui.Components.voip.m0) this.f27444b;
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.f27445c;
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) this.d;
                ValueAnimator valueAnimator = m0Var.N0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                uVar.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new org.telegram.ui.Components.voip.l0(m0Var, uVar)).setDuration(100L).start();
                if (uVar2 != null) {
                    uVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).setListener(new org.telegram.ui.Components.voip.y(uVar2)).start();
                    return;
                }
                return;
            case 18:
                AnimatedFileNative.d(((File) this.f27444b).getAbsolutePath(), (int[]) this.f27445c, 0L);
                AndroidUtilities.runOnUIThread((org.telegram.ui.bf) this.d);
                return;
            case 19:
                ((q0.a) this.f27445c).accept(Boolean.valueOf(((org.telegram.ui.web.c1) this.f27444b).d((String[]) this.d)));
                return;
            case 20:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.f27444b;
                String str11 = (String) this.f27445c;
                String str12 = (String) this.d;
                botWebViewContainer$BotWebViewProxy.getClass();
                try {
                    org.telegram.ui.web.c1 c1Var = botWebViewContainer$BotWebViewProxy.f42081a;
                    if (c1Var != null) {
                        boolean z14 = org.telegram.ui.web.c1.P0;
                        c1Var.F(botWebViewContainer$BotWebViewProxy, c1Var.g(), str11, str12);
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 21:
                String str13 = (String) this.f27445c;
                String str14 = (String) this.d;
                org.telegram.ui.web.c1 c1Var2 = ((BotWebViewContainer$WebViewProxy) this.f27444b).f42082a;
                if (c1Var2 != null && !c1Var2.f42137o0 && c1Var2.f42122c != null) {
                    if (c1Var2.F0 != null && !TextUtils.equals(c1Var2.getOriginHost(), c1Var2.F0)) {
                        c1Var2.h("onWebEventReceived ignore " + str13);
                        return;
                    }
                    c1Var2.h("onWebEventReceived " + str13 + " " + str14);
                    str13.getClass();
                    switch (str13.hashCode()) {
                        case -1695046810:
                            if (str13.equals("actionBarColor")) {
                                c11 = 0;
                                break;
                            }
                            break;
                        case -462720700:
                            if (str13.equals("navigationBarColor")) {
                                c11 = 1;
                                break;
                            }
                            break;
                        case 479731943:
                            if (str13.equals("oauth_request")) {
                                c11 = 2;
                                break;
                            }
                            break;
                        case 675009138:
                            if (str13.equals("siteName")) {
                                c11 = 3;
                                break;
                            }
                            break;
                        case 997530486:
                            if (str13.equals("allowScroll")) {
                                c11 = 4;
                                break;
                            }
                            break;
                    }
                    switch (c11) {
                        case 0:
                        case 1:
                            try {
                                JSONArray jSONArray = new JSONArray(str14);
                                boolean equals2 = TextUtils.equals(str13, "actionBarColor");
                                int argb = Color.argb((int) Math.round(jSONArray.optDouble(3, 1.0d) * 255.0d), (int) Math.round(jSONArray.optDouble(0)), (int) Math.round(jSONArray.optDouble(1)), (int) Math.round(jSONArray.optDouble(2)));
                                org.telegram.ui.web.z0 z0Var = c1Var2.f42118a;
                                if (z0Var != null) {
                                    if (equals2) {
                                        z0Var.f42430s = true;
                                        z0Var.f42431w = argb;
                                    } else {
                                        z0Var.v = true;
                                        z0Var.f42432x = argb;
                                    }
                                    org.telegram.ui.web.z0.a(z0Var);
                                }
                                c1Var2.f42122c.o(argb, equals2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        case 2:
                            c1Var2.h("oauth_request " + str14);
                            if (c1Var2.f42118a != null) {
                                String originHost = c1Var2.getOriginHost();
                                if (!TextUtils.isEmpty(originHost)) {
                                    try {
                                        String optString = new JSONObject(str14).optString("url");
                                        c1Var2.z("oauth_supported", org.telegram.ui.web.c1.B(1, "version"));
                                        if (!TextUtils.isEmpty(optString)) {
                                            TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                                            tL_messages_requestUrlAuth.url = optString;
                                            int i39 = tL_messages_requestUrlAuth.flags;
                                            tL_messages_requestUrlAuth.in_app_origin = originHost;
                                            tL_messages_requestUrlAuth.flags = i39 | 12;
                                            ConnectionsManager.getInstance(c1Var2.M).sendRequest(tL_messages_requestUrlAuth, new ai.p3(c1Var2, tL_messages_requestUrlAuth, optString, originHost, 14), 2);
                                            return;
                                        }
                                        return;
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                        return;
                                    }
                                }
                                return;
                            }
                            return;
                        case 3:
                            c1Var2.h("siteName " + str14);
                            org.telegram.ui.web.z0 z0Var2 = c1Var2.f42118a;
                            if (z0Var2 != null) {
                                z0Var2.f42429r = str14;
                                org.telegram.ui.web.z0.a(z0Var2);
                                return;
                            }
                            return;
                        case 4:
                            try {
                                JSONArray jSONArray2 = new JSONArray(str14);
                                z12 = jSONArray2.optBoolean(0, true);
                                try {
                                    z13 = jSONArray2.optBoolean(1, true);
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                                z12 = true;
                            }
                            if (c1Var2.getParent() instanceof ei.q4) {
                                ei.q4 q4Var = (ei.q4) c1Var2.getParent();
                                q4Var.O = z12;
                                q4Var.P = z13;
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                return;
            case 22:
                org.telegram.ui.web.g1 g1Var = (org.telegram.ui.web.g1) this.f27444b;
                ArrayList arrayList18 = (ArrayList) this.f27445c;
                String str15 = (String) this.d;
                ArrayList arrayList19 = new ArrayList();
                while (i17 < arrayList18.size()) {
                    org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) arrayList18.get(i17);
                    if (org.telegram.ui.web.g1.t(d1Var.f42165c, str15) || ((n2Var2 = d1Var.d) != null && (org.telegram.ui.web.g1.t(n2Var2.f42282c, str15) || org.telegram.ui.web.g1.t(d1Var.d.d, str15)))) {
                        arrayList19.add(d1Var);
                    }
                    i17++;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.g91(27, g1Var, arrayList19));
                return;
            case 23:
                a();
                return;
            case 24:
                ((EglRenderer) this.f27444b).lambda$init$0((EglBase.Context) this.f27445c, (int[]) this.d);
                return;
            case 25:
                ((EglRenderer) this.f27444b).lambda$removeFrameListener$4((CountDownLatch) this.f27445c, (EglRenderer.FrameListener) this.d);
                return;
            case 26:
                ((VideoFileRenderer) this.f27444b).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) this.f27445c, (VideoFrame) this.d);
                return;
            case 27:
                qi.j jVar = (qi.j) this.f27444b;
                WebView webView = (WebView) this.f27445c;
                b5.h hVar = (b5.h) this.d;
                synchronized (jVar.f45537a) {
                    if (!jVar.f45555u && jVar.f45549o == webView && jVar.f45550p == hVar && !jVar.f45552r) {
                        if (jVar.f45553s) {
                            FileLog.e("WEB proxy: Base64 bridge installation timed out again; transport stopped");
                            jVar.o();
                            return;
                        }
                        jVar.f45553s = true;
                        FileLog.e("WEB proxy: Base64 bridge installation timed out; retrying once");
                        jVar.f();
                        return;
                    }
                    return;
                }
            case 28:
                ((tg.x0) this.f27444b).run(new Pair((HashMap) this.d, (ArrayList) this.f27445c));
                return;
            default:
                TLObject tLObject4 = (TLObject) this.f27444b;
                MessagesController messagesController = (MessagesController) this.f27445c;
                tg.x0 x0Var = (tg.x0) this.d;
                if (tLObject4 instanceof TLRPC.TL_channels_channelParticipants) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                    messagesController.putUsers(tL_channels_channelParticipants.users, false);
                    messagesController.putChats(tL_channels_channelParticipants.chats, false);
                    long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                    ArrayList arrayList20 = new ArrayList();
                    while (i17 < tL_channels_channelParticipants.participants.size()) {
                        TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i17).peer;
                        if (peer != null && MessageObject.getPeerId(peer) != clientUserId && (user = messagesController.getUser(Long.valueOf(peer.user_id))) != null && !UserObject.isDeleted(user) && !user.bot) {
                            arrayList20.add(messagesController.getInputPeer(peer));
                        }
                        i17++;
                    }
                    x0Var.run(arrayList20);
                    return;
                }
                return;
        }
    }

    public in0(Object obj, Object obj2, Object obj3, int i10) {
        this.f27443a = i10;
        this.f27444b = obj;
        this.f27445c = obj2;
        this.d = obj3;
    }
}
