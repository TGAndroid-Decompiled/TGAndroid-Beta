package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import org.telegram.ui.zh1;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;

public final class gs0 implements Runnable {

    public final int f28806a;

    public final Object f28807b;

    public final Object f28808c;
    public final Object d;

    public gs0(Object obj, Object obj2, Object obj3, int i10) {
        this.f28806a = i10;
        this.f28807b = obj;
        this.f28808c = obj2;
        this.d = obj3;
    }

    private final void a() {
        ArrayList arrayList;
        pf.u0 u0Var = (pf.u0) this.f28807b;
        String str = (String) this.f28808c;
        TLObject tLObject = (TLObject) this.d;
        u0Var.A0 = 0;
        if (str.equals(u0Var.f45954z0) && (tLObject instanceof TLRPC.TL_messages_stickers)) {
            TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
            ArrayList arrayList2 = u0Var.f45949w0;
            int size = arrayList2 != null ? arrayList2.size() : 0;
            u0Var.F("sticker_search_".concat(str), tL_messages_stickers.stickers);
            ArrayList arrayList3 = u0Var.f45949w0;
            int size2 = arrayList3 != null ? arrayList3.size() : 0;
            if (!u0Var.f45934k0 && (arrayList = u0Var.f45949w0) != null && !arrayList.isEmpty()) {
                u0Var.H();
                u0Var.R.a(u0Var.K() > 0);
                u0Var.f45934k0 = true;
            }
            if (size != size2) {
                u0Var.l();
            }
        }
    }

    @Override
    public final void run() {
        er0 er0Var;
        long peerId;
        org.telegram.ui.ActionBar.n2 n2Var;
        char c10;
        boolean zContains;
        String str;
        Uri uri;
        String stickerExt;
        int i10;
        int iCeil;
        String absolutePath;
        String absolutePath2;
        boolean zOptBoolean;
        org.telegram.ui.web.i2 i2Var;
        Object obj;
        int i11 = this.f28806a;
        int i12 = 3;
        int i13 = 2;
        String str2 = null;
        Object parentObject = null;
        Boolean boolValueOf = null;
        str2 = null;
        int i14 = 0;
        boolean zOptBoolean2 = true;
        zOptBoolean2 = true;
        Object obj2 = this.d;
        Object obj3 = this.f28808c;
        Object obj4 = this.f28807b;
        switch (i11) {
            case 0:
                ks0 ks0Var = (ks0) obj4;
                hu0 hu0Var = ks0Var.d;
                y4.S(hu0Var.getContext(), hu0Var.f29145r1, (org.telegram.ui.ActionBar.c6) obj3, new vu(ks0Var, 20));
                ((b70) obj2).u();
                break;
            case 1:
                rs0 rs0Var = (rs0) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                hu0 hu0Var2 = rs0Var.f32263n;
                int iH = rs0Var.h();
                if (tL_error == null) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    hu0Var2.f29145r1.getMessagesController().putChats(messages_chats.chats, false);
                    rs0Var.h = messages_chats.chats.isEmpty() || messages_chats.chats.size() != 100;
                    rs0Var.d.addAll(messages_chats.chats);
                } else {
                    rs0Var.h = true;
                }
                int i15 = 0;
                while (true) {
                    zs0[] zs0VarArr = hu0Var2.f29122g0;
                    if (i15 >= zs0VarArr.length) {
                        rs0Var.f32261e = false;
                        rs0Var.f32262f = true;
                        rs0Var.l();
                    } else {
                        zs0 zs0Var = zs0VarArr[i15];
                        if (zs0Var.B == 6 && (er0Var = zs0Var.h) != null && (rs0Var.f32262f || iH == 0)) {
                            hu0Var2.z(er0Var, 0, null);
                        }
                        i15++;
                    }
                    break;
                }
                break;
            case 2:
                xs0 xs0Var = (xs0) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                org.telegram.ui.ActionBar.n2 n2Var2 = xs0Var.f34697s.f29145r1;
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new gs0(xs0Var, new ArrayList(), new ArrayList(), i12));
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i16 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i16];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList.size();
                    int i17 = 0;
                    while (i17 < size) {
                        TLObject tLObject2 = (TLObject) arrayList.get(i17);
                        if (tLObject2 instanceof TLRPC.ChatParticipant) {
                            peerId = ((TLRPC.ChatParticipant) tLObject2).user_id;
                        } else {
                            if (!(tLObject2 instanceof TLRPC.ChannelParticipant)) {
                                n2Var = n2Var2;
                            }
                            peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer);
                            break;
                            i17++;
                            i16 = i16;
                            n2Var2 = n2Var;
                        }
                        TLRPC.User user = n2Var2.getMessagesController().getUser(Long.valueOf(peerId));
                        if (user.f22527id == n2Var2.getUserConfig().getClientUserId()) {
                            n2Var = n2Var2;
                        }
                        String lowerCase2 = UserObject.getUserName(user).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        if (lowerCase2.equals(translitString2)) {
                            translitString2 = null;
                        }
                        int i18 = 0;
                        char c11 = 0;
                        while (true) {
                            if (i18 >= i16) {
                                n2Var = n2Var2;
                            }
                            n2Var = n2Var2;
                            String str3 = strArr[i18];
                            if (lowerCase2.startsWith(str3) || org.telegram.messenger.y1.x(" ", str3, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str3) || org.telegram.messenger.y1.x(" ", str3, translitString2)))) {
                                c10 = 1;
                            } else {
                                String publicUsername = UserObject.getPublicUsername(user);
                                c10 = (publicUsername == null || !publicUsername.startsWith(str3)) ? c11 : (char) 2;
                            }
                            if (c10 != 0) {
                                if (c10 == 1) {
                                    arrayList2.add(AndroidUtilities.generateSearchName(user.first_name, user.last_name, str3));
                                } else {
                                    arrayList2.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user), null, "@" + str3));
                                }
                                arrayList3.add(tLObject2);
                            }
                            i18++;
                            n2Var2 = n2Var;
                            c11 = c10;
                            break;
                            break;
                        }
                        break;
                        i17++;
                        i16 = i16;
                        n2Var2 = n2Var;
                    }
                    AndroidUtilities.runOnUIThread(new gs0(xs0Var, arrayList2, arrayList3, 3));
                }
                break;
            case 3:
                xs0 xs0Var2 = (xs0) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                hu0 hu0Var3 = xs0Var2.f34697s;
                if (hu0Var3.R0) {
                    xs0Var2.d = arrayList4;
                    xs0Var2.f34696r--;
                    if (!ChatObject.isChannel(xs0Var2.f34695n)) {
                        ArrayList arrayList6 = xs0Var2.f34693e.f45841g;
                        arrayList6.clear();
                        arrayList6.addAll(arrayList5);
                    }
                    if (xs0Var2.f34696r == 0) {
                        int i19 = 0;
                        while (true) {
                            zs0[] zs0VarArr2 = hu0Var3.f29122g0;
                            if (i19 < zs0VarArr2.length) {
                                zs0 zs0Var2 = zs0VarArr2[i19];
                                if (zs0Var2.B == 7) {
                                    if (xs0Var2.h == 0) {
                                        zs0Var2.f35342w.e(false, true);
                                    } else {
                                        hu0Var3.z(zs0Var2.h, 0, null);
                                    }
                                }
                                i19++;
                            }
                        }
                    }
                    xs0Var2.l();
                    break;
                }
                break;
            case 4:
                ct0 ct0Var = (ct0) obj4;
                ArrayList arrayList7 = (ArrayList) obj2;
                ct0Var.getClass();
                String lowerCase3 = ((String) obj3).trim().toLowerCase();
                int i20 = 16;
                if (lowerCase3.length() == 0) {
                    AndroidUtilities.runOnUIThread(new lg0(i20, ct0Var, new ArrayList()));
                } else {
                    String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                    if (!lowerCase3.equals(translitString3) && translitString3.length() != 0) {
                        str2 = translitString3;
                    }
                    int i21 = (str2 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i21];
                    strArr2[0] = lowerCase3;
                    if (str2 != null) {
                        strArr2[1] = str2;
                    }
                    ArrayList arrayList8 = new ArrayList();
                    for (int i22 = 0; i22 < arrayList7.size(); i22++) {
                        MessageObject messageObject = (MessageObject) arrayList7.get(i22);
                        for (int i23 = 0; i23 < i21; i23++) {
                            String str4 = strArr2[i23];
                            String documentName = messageObject.getDocumentName();
                            if (documentName != null && documentName.length() != 0) {
                                if (documentName.toLowerCase().contains(str4)) {
                                    arrayList8.add(messageObject);
                                }
                                if (ct0Var.f27544r == 4) {
                                    TLRPC.Document document = messageObject.type == 0 ? MessageObject.getMedia(messageObject.messageOwner).webpage.document : MessageObject.getMedia(messageObject.messageOwner).document;
                                    int i24 = 0;
                                    while (true) {
                                        if (i24 < document.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i24);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                String str5 = documentAttribute.performer;
                                                zContains = str5 != null ? str5.toLowerCase().contains(str4) : false;
                                                if (!zContains && (str = documentAttribute.title) != null) {
                                                    zContains = str.toLowerCase().contains(str4);
                                                }
                                            } else {
                                                i24++;
                                            }
                                        } else {
                                            zContains = false;
                                        }
                                    }
                                    if (zContains) {
                                        arrayList8.add(messageObject);
                                    }
                                } else {
                                    continue;
                                }
                                break;
                                break;
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new lg0(i20, ct0Var, arrayList8));
                }
                break;
            case 5:
                ex0 ex0Var = (ex0) obj4;
                String str6 = (String) obj3;
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) obj2;
                if (!ex0Var.isDismissed()) {
                    ex0Var.V.remove(str6);
                    if ("application/x-tgsticker".equals(importingSticker.mimeType)) {
                        importingSticker.validated = true;
                        int iIndexOf = ex0Var.U.indexOf(importingSticker);
                        if (iIndexOf >= 0) {
                            f2.o1 o1VarK = ex0Var.f28173c.K(iIndexOf);
                            if (o1VarK != null) {
                                ((org.telegram.ui.Cells.a8) o1VarK.f5789a).setSticker(importingSticker);
                            }
                        } else {
                            ex0Var.d.l();
                        }
                    } else {
                        ex0Var.u0(importingSticker);
                    }
                    if (ex0Var.V.isEmpty()) {
                        ex0Var.B0();
                    }
                    break;
                }
                break;
            case 6:
                ex0.x((ex0) obj4, (ArrayList) obj3, (Boolean) obj2);
                break;
            case 7:
                ex0.E((ex0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2);
                break;
            case 8:
                ex0.G((ex0) obj4, (String) obj3, (TextView) obj2);
                break;
            case 9:
                ex0 ex0Var2 = (ex0) obj4;
                ArrayList arrayList9 = (ArrayList) obj3;
                ArrayList arrayList10 = (ArrayList) obj2;
                ArrayList arrayList11 = new ArrayList();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                int size2 = arrayList9.size();
                while (i14 < size2) {
                    Object obj5 = arrayList9.get(i14);
                    if ((obj5 instanceof Uri) && (stickerExt = MediaController.getStickerExt((uri = (Uri) obj5))) != null) {
                        boolean zEquals = "tgs".equals(stickerExt);
                        if (boolValueOf == null) {
                            boolValueOf = Boolean.valueOf(zEquals);
                        } else if (boolValueOf.booleanValue() != zEquals) {
                            continue;
                        }
                        if (!ex0Var2.isDismissed()) {
                            SendMessagesHelper.ImportingSticker importingSticker2 = new SendMessagesHelper.ImportingSticker();
                            importingSticker2.animated = zEquals;
                            Boolean bool = boolValueOf;
                            String strCopyFileToCache = MediaController.copyFileToCache(uri, stickerExt, (zEquals ? 64 : 512) * 1024);
                            importingSticker2.path = strCopyFileToCache;
                            if (strCopyFileToCache != null) {
                                if (zEquals) {
                                    importingSticker2.mimeType = "application/x-tgsticker";
                                } else {
                                    BitmapFactory.decodeFile(strCopyFileToCache, options);
                                    int i25 = options.outWidth;
                                    if ((i25 == 512 && (i10 = options.outHeight) > 0 && i10 <= 512) || (options.outHeight == 512 && i25 > 0 && i25 <= 512)) {
                                        importingSticker2.mimeType = "image/".concat(stickerExt);
                                        importingSticker2.validated = true;
                                    }
                                }
                                if (arrayList10 != null && arrayList10.size() == size2 && (arrayList10.get(i14) instanceof String)) {
                                    importingSticker2.emoji = (String) arrayList10.get(i14);
                                } else {
                                    importingSticker2.emoji = "#️⃣";
                                }
                                arrayList11.add(importingSticker2);
                                if (arrayList11.size() >= 200) {
                                    boolValueOf = bool;
                                    AndroidUtilities.runOnUIThread(new gs0(ex0Var2, arrayList11, boolValueOf, 6));
                                }
                            }
                            boolValueOf = bool;
                            break;
                        }
                        break;
                    }
                    i14++;
                }
                AndroidUtilities.runOnUIThread(new gs0(ex0Var2, arrayList11, boolValueOf, 6));
                break;
            case 10:
                i41 i41Var = (i41) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                SparseArray sparseArray = i41Var.f29219f;
                ArrayList arrayList12 = i41Var.f29218e;
                ArrayList arrayList13 = i41Var.f29220n;
                SparseArray sparseArray2 = i41Var.d;
                i41Var.f29221r = false;
                if (tL_error2 == null && (tLObject3 instanceof TLRPC.TL_messages_featuredStickers)) {
                    ArrayList<TLRPC.StickerSetCovered> arrayList14 = ((TLRPC.TL_messages_featuredStickers) tLObject3).sets;
                    if (arrayList14.size() < 40) {
                        i41Var.f29222s = true;
                    }
                    if (!arrayList14.isEmpty()) {
                        if (arrayList13.isEmpty()) {
                            int i26 = i41Var.f29223w;
                            i41Var.f29223w = i26 + 1;
                            sparseArray2.put(i26, -1);
                        }
                        arrayList13.addAll(arrayList14);
                        int size3 = arrayList12.size();
                        for (int i27 = 0; i27 < arrayList14.size(); i27++) {
                            TLRPC.StickerSetCovered stickerSetCovered = arrayList14.get(i27);
                            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                                arrayList12.add(stickerSetCovered);
                                sparseArray.put(i41Var.f29223w, stickerSetCovered);
                                int i28 = i41Var.f29223w;
                                i41Var.f29223w = i28 + 1;
                                int i29 = size3 + 1;
                                sparseArray2.put(i28, Integer.valueOf(size3));
                                if (stickerSetCovered.covers.isEmpty()) {
                                    sparseArray2.put(i41Var.f29223w, stickerSetCovered.cover);
                                    iCeil = 1;
                                } else {
                                    iCeil = (int) Math.ceil(stickerSetCovered.covers.size() / i41Var.v);
                                    for (int i30 = 0; i30 < stickerSetCovered.covers.size(); i30++) {
                                        sparseArray2.put(i41Var.f29223w + i30, stickerSetCovered.covers.get(i30));
                                    }
                                }
                                int i31 = 0;
                                while (true) {
                                    int i32 = i41Var.v * iCeil;
                                    if (i31 < i32) {
                                        sparseArray.put(i41Var.f29223w + i31, stickerSetCovered);
                                        i31++;
                                    } else {
                                        i41Var.f29223w = i32 + i41Var.f29223w;
                                        size3 = i29;
                                    }
                                }
                            }
                        }
                        i41Var.l();
                    }
                } else {
                    i41Var.f29222s = true;
                }
                break;
            case 11:
                t61 t61Var = (t61) obj4;
                Uri uri2 = (Uri) obj3;
                MessageObject messageObject2 = (MessageObject) obj2;
                t61Var.getClass();
                if ("tg".equals(uri2.getScheme())) {
                    int iIntValue = Utilities.parseInt((CharSequence) uri2.getQueryParameter("account")).intValue();
                    Object parentObject2 = FileLoader.getInstance(iIntValue).getParentObject(Utilities.parseInt((CharSequence) uri2.getQueryParameter("rid")).intValue());
                    TLRPC.TL_document tL_document = new TLRPC.TL_document();
                    tL_document.access_hash = Utilities.parseLong(uri2.getQueryParameter("hash")).longValue();
                    tL_document.f22386id = Utilities.parseLong(uri2.getQueryParameter("id")).longValue();
                    tL_document.size = Utilities.parseLong(uri2.getQueryParameter("size")).longValue();
                    tL_document.dc_id = Utilities.parseInt((CharSequence) uri2.getQueryParameter("dc")).intValue();
                    tL_document.mime_type = uri2.getQueryParameter("mime");
                    tL_document.file_reference = Utilities.hexToBytes(uri2.getQueryParameter("reference"));
                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                    tL_documentAttributeFilename.file_name = uri2.getQueryParameter("name");
                    tL_document.attributes.add(tL_documentAttributeFilename);
                    tL_document.attributes.add(new TLRPC.TL_documentAttributeVideo());
                    if (FileLoader.getInstance(iIntValue).isLoadingFile(FileLoader.getAttachFileName(tL_document))) {
                        File directory = FileLoader.getDirectory(4);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(tL_document.dc_id);
                        sb2.append("_");
                        absolutePath = new File(directory, a9.p.o(sb2, tL_document.f22386id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath = FileLoader.getInstance(iIntValue).getPathToAttach(tL_document, false).getAbsolutePath();
                    }
                    t61Var.f32662b = new x5(new File(absolutePath), true, tL_document.size, 1, tL_document, null, parentObject2, 0L, iIntValue, true);
                } else {
                    t61Var.f32662b = new x5(new File(uri2.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                }
                t61Var.f32664c = t61Var.f32662b.d[4];
                float f10 = t61Var.h;
                if (f10 != 0.0f) {
                    t61Var.e(messageObject2, f10, t61Var.f32669r);
                    t61Var.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new p61(t61Var, true ? 1 : 0));
                break;
            case 12:
                t61 t61Var2 = (t61) obj4;
                k61 k61Var = (k61) obj3;
                MessageObject messageObject3 = (MessageObject) obj2;
                t61Var2.getClass();
                if (k61Var.b()) {
                    t61Var2.f32662b = new x5(new File(k61Var.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                } else {
                    int iIntValue2 = UserConfig.selectedAccount;
                    try {
                        iIntValue2 = Utilities.parseInt((CharSequence) k61Var.d.getQueryParameter("account")).intValue();
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                    int i33 = iIntValue2;
                    try {
                        parentObject = FileLoader.getInstance(i33).getParentObject(Utilities.parseInt((CharSequence) k61Var.d.getQueryParameter("rid")).intValue());
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    Object obj6 = parentObject;
                    TLRPC.Document document2 = k61Var.f30012g;
                    if (FileLoader.getInstance(i33).isLoadingFile(FileLoader.getAttachFileName(document2))) {
                        File directory2 = FileLoader.getDirectory(4);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(document2.dc_id);
                        sb3.append("_");
                        absolutePath2 = new File(directory2, a9.p.o(sb3, document2.f22386id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath2 = FileLoader.getInstance(i33).getPathToAttach(document2, false).getAbsolutePath();
                    }
                    t61Var2.f32662b = new x5(new File(absolutePath2), true, document2.size, 1, document2, null, obj6, 0L, i33, true);
                }
                t61Var2.f32664c = t61Var2.f32662b.d[4];
                float f11 = t61Var2.h;
                if (f11 != 0.0f) {
                    t61Var2.e(messageObject3, f11, t61Var2.f32669r);
                    t61Var2.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new p61(t61Var2, i13));
                break;
            case 13:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) obj4;
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) obj3;
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) obj2;
                ValueAnimator valueAnimator = k0Var.J0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                tVar.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new org.telegram.ui.Components.voip.j0(k0Var, tVar)).setDuration(100L).start();
                if (tVar2 != null) {
                    tVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).setListener(new org.telegram.ui.Components.voip.w(tVar2)).start();
                }
                break;
            case 14:
                ((org.telegram.ui.web.w0) obj4).d("window.Telegram.WebView.receiveEvent('" + ((String) obj3) + "', " + ((JSONObject) obj2) + ");");
                break;
            case 15:
                ((q0.a) obj3).accept(Boolean.valueOf(((org.telegram.ui.web.z0) obj4).d((String[]) obj2)));
                break;
            case 16:
                AnimatedFileNative.d(((File) obj4).getAbsolutePath(), (int[]) obj3, 0L);
                AndroidUtilities.runOnUIThread((cg.h0) obj2);
                break;
            case 17:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj4;
                String str7 = (String) obj3;
                String str8 = (String) obj2;
                botWebViewContainer$BotWebViewProxy.getClass();
                try {
                    org.telegram.ui.web.z0 z0Var = botWebViewContainer$BotWebViewProxy.f43764a;
                    if (z0Var != null) {
                        boolean z10 = org.telegram.ui.web.z0.I0;
                        z0Var.B(botWebViewContainer$BotWebViewProxy, str7, str8);
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
                break;
            case 18:
                String str9 = (String) obj3;
                String str10 = (String) obj2;
                org.telegram.ui.web.z0 z0Var2 = ((BotWebViewContainer$WebViewProxy) obj4).f43765a;
                if (!z0Var2.f44072k0 && z0Var2.f44061c != null) {
                    if (z0Var2.f44092z0 != null && !TextUtils.equals(z0Var2.getOriginHost(), z0Var2.f44092z0)) {
                        z0Var2.g("onWebEventReceived ignore " + str9);
                        break;
                    } else {
                        z0Var2.g("onWebEventReceived " + str9 + " " + str10);
                        str9.getClass();
                        switch (str9) {
                            case "actionBarColor":
                            case "navigationBarColor":
                                try {
                                    JSONArray jSONArray = new JSONArray(str10);
                                    boolean zEquals2 = TextUtils.equals(str9, "actionBarColor");
                                    int iArgb = Color.argb((int) Math.round(jSONArray.optDouble(3, 1.0d) * 255.0d), (int) Math.round(jSONArray.optDouble(0)), (int) Math.round(jSONArray.optDouble(1)), (int) Math.round(jSONArray.optDouble(2)));
                                    org.telegram.ui.web.w0 w0Var = z0Var2.f44057a;
                                    if (w0Var != null) {
                                        if (zEquals2) {
                                            w0Var.f44030s = true;
                                            w0Var.f44031w = iArgb;
                                        } else {
                                            w0Var.v = true;
                                            w0Var.f44032x = iArgb;
                                        }
                                        org.telegram.ui.web.w0.a(w0Var);
                                    }
                                    z0Var2.f44061c.o(iArgb, zEquals2);
                                    break;
                                } catch (Exception unused) {
                                    return;
                                }
                                break;
                            case "oauth_request":
                                z0Var2.g("oauth_request " + str10);
                                if (z0Var2.f44057a != null) {
                                    String originHost = z0Var2.getOriginHost();
                                    if (!TextUtils.isEmpty(originHost)) {
                                        try {
                                            String strOptString = new JSONObject(str10).optString("url");
                                            z0Var2.v("oauth_supported", org.telegram.ui.web.z0.x(1, "version"));
                                            if (!TextUtils.isEmpty(strOptString)) {
                                                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                                                tL_messages_requestUrlAuth.url = strOptString;
                                                int i34 = tL_messages_requestUrlAuth.flags;
                                                tL_messages_requestUrlAuth.in_app_origin = originHost;
                                                tL_messages_requestUrlAuth.flags = i34 | 12;
                                                ConnectionsManager.getInstance(z0Var2.I).sendRequest(tL_messages_requestUrlAuth, new gh.f1(z0Var2, tL_messages_requestUrlAuth, strOptString, originHost, 17), 2);
                                            }
                                        } catch (Exception e12) {
                                            FileLog.e(e12);
                                            return;
                                        }
                                        break;
                                    }
                                }
                                break;
                            case "siteName":
                                z0Var2.g("siteName " + str10);
                                org.telegram.ui.web.w0 w0Var2 = z0Var2.f44057a;
                                if (w0Var2 != null) {
                                    w0Var2.f44029r = str10;
                                    org.telegram.ui.web.w0.a(w0Var2);
                                    break;
                                }
                                break;
                            case "allowScroll":
                                try {
                                    JSONArray jSONArray2 = new JSONArray(str10);
                                    zOptBoolean = jSONArray2.optBoolean(0, true);
                                    try {
                                        zOptBoolean2 = jSONArray2.optBoolean(1, true);
                                        break;
                                    } catch (Exception unused2) {
                                    }
                                } catch (Exception unused3) {
                                    zOptBoolean = true;
                                }
                                if (z0Var2.getParent() instanceof nh.d4) {
                                    nh.d4 d4Var = (nh.d4) z0Var2.getParent();
                                    d4Var.K = zOptBoolean;
                                    d4Var.L = zOptBoolean2;
                                    break;
                                }
                                break;
                        }
                    }
                }
                break;
            case 19:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj4;
                ArrayList arrayList15 = (ArrayList) obj3;
                String str11 = (String) obj2;
                ArrayList arrayList16 = new ArrayList();
                while (i14 < arrayList15.size()) {
                    org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) arrayList15.get(i14);
                    if (org.telegram.ui.web.c1.t(a1Var.f43776c, str11) || ((i2Var = a1Var.d) != null && (org.telegram.ui.web.c1.t(i2Var.f43868c, str11) || org.telegram.ui.web.c1.t(a1Var.d.d, str11)))) {
                        arrayList16.add(a1Var);
                    }
                    i14++;
                }
                AndroidUtilities.runOnUIThread(new zh1(5, c1Var, arrayList16));
                break;
            case 20:
                org.telegram.ui.web.e2 e2Var = (org.telegram.ui.web.e2) obj4;
                org.telegram.ui.web.d2 d2Var = (org.telegram.ui.web.d2) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                e2Var.getClass();
                if (org.telegram.ui.web.e2.f43823f != null) {
                    char c12 = ((d2Var.d > 0 && d2Var.f43815e > 0) || bitmap == null) ? (char) 0 : (char) 1;
                    if (bitmap != null) {
                        e2Var.d.put(d2Var.f43813b, bitmap);
                        if (c12 != 0) {
                            int i35 = d2Var.d;
                            if (i35 == 0 && d2Var.f43815e == 0) {
                                d2Var.d = bitmap.getWidth();
                                d2Var.f43815e = bitmap.getHeight();
                            } else if (i35 == 0) {
                                d2Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * d2Var.f43815e);
                            } else if (d2Var.f43815e == 0) {
                                d2Var.f43815e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * d2Var.d);
                            }
                        }
                    }
                    ArrayList arrayList17 = (ArrayList) org.telegram.ui.web.e2.f43823f.remove(d2Var.f43813b);
                    if (arrayList17 != null) {
                        int size4 = arrayList17.size();
                        while (i14 < size4) {
                            Object obj7 = arrayList17.get(i14);
                            i14++;
                            Pair pair = (Pair) obj7;
                            ((ImageReceiver) pair.first).setImageBitmap(bitmap);
                            if (c12 != 0 && (obj = pair.second) != null) {
                                ((Runnable) obj).run();
                            }
                        }
                        break;
                    }
                }
                break;
            case 21:
                ((EglRenderer) obj4).lambda$init$0((EglBase.Context) obj3, (int[]) obj2);
                break;
            case 22:
                ((EglRenderer) obj4).lambda$removeFrameListener$4((CountDownLatch) obj3, (EglRenderer.FrameListener) obj2);
                break;
            case 23:
                ((VideoFileRenderer) obj4).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) obj3, (VideoFrame) obj2);
                break;
            case 24:
                org.telegram.messenger.l7 l7Var = (org.telegram.messenger.l7) obj2;
                int i36 = ((pf.z) obj4).f45996o0;
                MessagesController messagesController = MessagesController.getInstance(i36);
                for (Pair pair2 : (HashSet) obj3) {
                    boolean zBooleanValue = ((Boolean) pair2.first).booleanValue();
                    Long l10 = (Long) pair2.second;
                    (zBooleanValue ? messagesController.dialogs_read_outbox_max : messagesController.dialogs_read_inbox_max).put(l10, Integer.valueOf(MessagesStorage.getInstance(i36).getDialogReadMaxSync(zBooleanValue, l10.longValue())));
                }
                AndroidUtilities.runOnUIThread(l7Var);
                break;
            case 25:
                ((pf.x) obj4).b((a0.h) obj2, (ArrayList) obj3);
                break;
            case 26:
                a();
                break;
            case 27:
                pf.u0 u0Var = (pf.u0) obj4;
                u0Var.f45935l0 = null;
                u0Var.Y((a0.h) obj2, (ArrayList) obj3, true);
                break;
            case 28:
                pf.j1 j1Var = (pf.j1) obj4;
                ArrayList arrayList18 = (ArrayList) obj3;
                j1Var.f45850q = arrayList18;
                j1Var.f45851r = (HashMap) obj2;
                j1Var.f45852s = true;
                j1Var.f45836a.V0(arrayList18);
                break;
            default:
                pf.k1 k1Var = (pf.k1) obj4;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) obj2;
                String str12 = ((TLRPC.TL_messages_searchStickerSets) obj3).f22492q;
                pf.l1 l1Var = k1Var.f45863a;
                String str13 = l1Var.N;
                x31 x31Var = l1Var.f45868e;
                if (str12.equals(str13)) {
                    k1Var.a();
                    x31Var.f34463b.h.getProgressDrawable().f32851e = false;
                    l1Var.J = 0;
                    x31Var.b(true);
                    l1Var.A.addAll(tL_messages_foundStickerSets.sets);
                    l1Var.l();
                }
                break;
        }
    }
}
