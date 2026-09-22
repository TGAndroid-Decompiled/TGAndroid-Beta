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
public final class en0 implements Runnable {
    public final int f23977a;
    public final Object f23978b;
    public final Object f23979c;
    public final Object d;

    public en0(Object obj, Serializable serializable, ArrayList arrayList, int i10) {
        this.f23977a = i10;
        this.f23978b = obj;
        this.d = serializable;
        this.f23979c = arrayList;
    }

    private final void a() {
        TLRPC.User user;
        TLObject tLObject = (TLObject) this.f23978b;
        MessagesController messagesController = (MessagesController) this.f23979c;
        tg.x0 x0Var = (tg.x0) this.d;
        if (tLObject instanceof TLRPC.TL_channels_channelParticipants) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            messagesController.putUsers(tL_channels_channelParticipants.users, false);
            messagesController.putChats(tL_channels_channelParticipants.chats, false);
            long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < tL_channels_channelParticipants.participants.size(); i10++) {
                TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i10).peer;
                if (peer != null && MessageObject.getPeerId(peer) != clientUserId && (user = messagesController.getUser(Long.valueOf(peer.user_id))) != null && !UserObject.isDeleted(user) && !user.bot) {
                    arrayList.add(messagesController.getInputPeer(peer));
                }
            }
            x0Var.run(arrayList);
        }
    }

    @Override
    public final void run() {
        ks0 ks0Var;
        boolean z10;
        int i10;
        ArrayList arrayList;
        long peerId;
        org.telegram.ui.ActionBar.n2 n2Var;
        int i11;
        TLRPC.Document document;
        boolean z11;
        String str;
        Uri uri;
        String stickerExt;
        int i12;
        int i13;
        int i14;
        String absolutePath;
        String absolutePath2;
        boolean z12;
        org.telegram.ui.web.n2 n2Var2;
        Object obj;
        int i15 = this.f23977a;
        String str2 = null;
        Object obj2 = null;
        Boolean bool = null;
        str2 = null;
        char c10 = 65535;
        boolean z13 = true;
        int i16 = 0;
        Object obj3 = this.d;
        Object obj4 = this.f23979c;
        Object obj5 = this.f23978b;
        switch (i15) {
            case 0:
                kn0 kn0Var = (kn0) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                ArrayList<MessageObject> arrayList3 = (ArrayList) obj3;
                int i17 = kn0Var.d;
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    DownloadController.getInstance(i17).onDownloadComplete((MessageObject) arrayList2.get(i18));
                }
                if (!arrayList3.isEmpty()) {
                    DownloadController.getInstance(i17).deleteRecentFiles(arrayList3);
                }
                kn0Var.O = false;
                kn0Var.d(true);
                return;
            case 1:
                go0 go0Var = (go0) obj5;
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) obj4;
                y70 y70Var = (y70) obj3;
                if (UserConfig.getInstance(go0Var.K0.I0).isPremium()) {
                    uyVar.getMessagesController().disableAds(true);
                    go0Var.T();
                    xc.a0(uyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                } else {
                    new rg.x0((org.telegram.ui.ActionBar.n2) uyVar, 3, true).show();
                }
                y70Var.u();
                return;
            case 2:
                lv0 lv0Var = (lv0) obj5;
                d5.S(lv0Var.getContext(), null, lv0Var.F1, new or0(lv0Var, (TL_stories.StoryItem) obj4));
                ((y70) obj3).u();
                return;
            case 3:
                lv0 lv0Var2 = (lv0) obj5;
                String str3 = (String) obj4;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) obj3;
                ot0 ot0Var = new ot0(lv0Var2.getContext(), str3, str3, lv0Var2.F1, n2Var3);
                if (n2Var3 != null) {
                    n2Var3.showDialog(ot0Var);
                    return;
                } else {
                    ot0Var.show();
                    return;
                }
            case 4:
                pt0 pt0Var = (pt0) obj5;
                lv0 lv0Var3 = pt0Var.d;
                d5.S(lv0Var3.getContext(), lv0Var3.f26234v1, (org.telegram.ui.ActionBar.f6) obj4, new mv(pt0Var, 21));
                ((y70) obj3).u();
                return;
            case 5:
                wt0 wt0Var = (wt0) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject = (TLObject) obj3;
                lv0 lv0Var4 = wt0Var.f30142n;
                int h = wt0Var.h();
                if (tL_error == null) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    lv0Var4.f26234v1.getMessagesController().putChats(messages_chats.chats, false);
                    if (!messages_chats.chats.isEmpty() && messages_chats.chats.size() == 100) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    wt0Var.h = z10;
                    wt0Var.d.addAll(messages_chats.chats);
                } else {
                    wt0Var.h = true;
                }
                int i19 = 0;
                while (true) {
                    eu0[] eu0VarArr = lv0Var4.f26210k0;
                    if (i19 < eu0VarArr.length) {
                        eu0 eu0Var = eu0VarArr[i19];
                        if (eu0Var.F == 6 && (ks0Var = eu0Var.h) != null && (wt0Var.f30141f || h == 0)) {
                            lv0Var4.z(ks0Var, 0, null);
                        }
                        i19++;
                    } else {
                        wt0Var.e = false;
                        wt0Var.f30141f = true;
                        wt0Var.l();
                        return;
                    }
                }
                break;
            case 6:
                cu0 cu0Var = (cu0) obj5;
                ArrayList arrayList4 = (ArrayList) obj4;
                org.telegram.ui.ActionBar.n2 n2Var4 = cu0Var.f23448s.f26234v1;
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new en0((Object) cu0Var, (Object) new ArrayList(), (Object) new ArrayList(), 7));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                translitString = (lowerCase.equals(translitString) || translitString.length() == 0) ? null : null;
                if (translitString != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                int i20 = i10 + 1;
                String[] strArr = new String[i20];
                strArr[0] = lowerCase;
                if (translitString != null) {
                    strArr[1] = translitString;
                }
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                int size = arrayList4.size();
                int i21 = 0;
                while (i21 < size) {
                    TLObject tLObject2 = (TLObject) arrayList4.get(i21);
                    if (tLObject2 instanceof TLRPC.ChatParticipant) {
                        arrayList = arrayList4;
                        peerId = ((TLRPC.ChatParticipant) tLObject2).user_id;
                    } else {
                        arrayList = arrayList4;
                        if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                            peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer);
                        }
                        n2Var = n2Var4;
                        i21++;
                        arrayList4 = arrayList;
                        n2Var4 = n2Var;
                    }
                    TLRPC.User user = n2Var4.getMessagesController().getUser(Long.valueOf(peerId));
                    if (user.f18490id != n2Var4.getUserConfig().getClientUserId()) {
                        String lowerCase2 = UserObject.getUserName(user).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        if (lowerCase2.equals(translitString2)) {
                            translitString2 = null;
                        }
                        char c11 = 0;
                        int i22 = 0;
                        while (i22 < i20) {
                            n2Var = n2Var4;
                            String str4 = strArr[i22];
                            if (!lowerCase2.startsWith(str4) && !org.telegram.messenger.l0.v(" ", str4, lowerCase2) && (translitString2 == null || (!translitString2.startsWith(str4) && !org.telegram.messenger.l0.v(" ", str4, translitString2)))) {
                                String publicUsername = UserObject.getPublicUsername(user);
                                if (publicUsername != null && publicUsername.startsWith(str4)) {
                                    c11 = 2;
                                }
                            } else {
                                c11 = 1;
                            }
                            if (c11 != 0) {
                                if (c11 == 1) {
                                    arrayList5.add(AndroidUtilities.generateSearchName(user.first_name, user.last_name, str4));
                                } else {
                                    arrayList5.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user), null, "@" + str4));
                                }
                                arrayList6.add(tLObject2);
                                i21++;
                                arrayList4 = arrayList;
                                n2Var4 = n2Var;
                            } else {
                                i22++;
                                n2Var4 = n2Var;
                            }
                        }
                    }
                    n2Var = n2Var4;
                    i21++;
                    arrayList4 = arrayList;
                    n2Var4 = n2Var;
                }
                AndroidUtilities.runOnUIThread(new en0((Object) cu0Var, (Object) arrayList5, (Object) arrayList6, 7));
                return;
            case 7:
                cu0 cu0Var2 = (cu0) obj5;
                ArrayList arrayList7 = (ArrayList) obj4;
                ArrayList arrayList8 = (ArrayList) obj3;
                lv0 lv0Var5 = cu0Var2.f23448s;
                if (lv0Var5.V0) {
                    cu0Var2.d = arrayList7;
                    cu0Var2.f23447r--;
                    if (!ChatObject.isChannel(cu0Var2.f23446n)) {
                        ArrayList arrayList9 = cu0Var2.e.f9694g;
                        arrayList9.clear();
                        arrayList9.addAll(arrayList8);
                    }
                    if (cu0Var2.f23447r == 0) {
                        int i23 = 0;
                        while (true) {
                            eu0[] eu0VarArr2 = lv0Var5.f26210k0;
                            if (i23 < eu0VarArr2.length) {
                                eu0 eu0Var2 = eu0VarArr2[i23];
                                if (eu0Var2.F == 7) {
                                    if (cu0Var2.h == 0) {
                                        eu0Var2.f24045w.e(false, true);
                                    } else {
                                        lv0Var5.z(eu0Var2.h, 0, null);
                                    }
                                }
                                i23++;
                            }
                        }
                    }
                    cu0Var2.l();
                    return;
                }
                return;
            case 8:
                hu0 hu0Var = (hu0) obj5;
                ArrayList arrayList10 = (ArrayList) obj4;
                hu0Var.getClass();
                String lowerCase3 = ((String) obj3).trim().toLowerCase();
                if (lowerCase3.length() == 0) {
                    AndroidUtilities.runOnUIThread(new yn0(10, hu0Var, new ArrayList()));
                    return;
                }
                String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                if (!lowerCase3.equals(translitString3) && translitString3.length() != 0) {
                    str2 = translitString3;
                }
                if (str2 != null) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                int i24 = i11 + 1;
                String[] strArr2 = new String[i24];
                strArr2[0] = lowerCase3;
                if (str2 != null) {
                    strArr2[1] = str2;
                }
                ArrayList arrayList11 = new ArrayList();
                for (int i25 = 0; i25 < arrayList10.size(); i25++) {
                    MessageObject messageObject = (MessageObject) arrayList10.get(i25);
                    int i26 = 0;
                    while (true) {
                        if (i26 < i24) {
                            String str5 = strArr2[i26];
                            String documentName = messageObject.getDocumentName();
                            if (documentName != null && documentName.length() != 0) {
                                if (documentName.toLowerCase().contains(str5)) {
                                    arrayList11.add(messageObject);
                                } else if (hu0Var.f24895r != 4) {
                                    continue;
                                } else {
                                    if (messageObject.type == 0) {
                                        document = MessageObject.getMedia(messageObject.messageOwner).webpage.document;
                                    } else {
                                        document = MessageObject.getMedia(messageObject.messageOwner).document;
                                    }
                                    int i27 = 0;
                                    while (true) {
                                        if (i27 < document.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i27);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                String str6 = documentAttribute.performer;
                                                if (str6 != null) {
                                                    z11 = str6.toLowerCase().contains(str5);
                                                } else {
                                                    z11 = false;
                                                }
                                                if (!z11 && (str = documentAttribute.title) != null) {
                                                    z11 = str.toLowerCase().contains(str5);
                                                }
                                            } else {
                                                i27++;
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
                            i26++;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new yn0(10, hu0Var, arrayList11));
                return;
            case 9:
                iy0 iy0Var = (iy0) obj5;
                String str7 = (String) obj4;
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) obj3;
                if (!iy0Var.isDismissed()) {
                    iy0Var.Z.remove(str7);
                    if (!"application/x-tgsticker".equals(importingSticker.mimeType)) {
                        iy0Var.u0(importingSticker);
                    } else {
                        importingSticker.validated = true;
                        int indexOf = iy0Var.Y.indexOf(importingSticker);
                        if (indexOf >= 0) {
                            s4.c1 L = iy0Var.f25199c.L(indexOf);
                            if (L != null) {
                                ((org.telegram.ui.Cells.g8) L.f42995a).setSticker(importingSticker);
                            }
                        } else {
                            iy0Var.d.l();
                        }
                    }
                    if (iy0Var.Z.isEmpty()) {
                        iy0Var.B0();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                iy0.w((iy0) obj5, (ArrayList) obj4, (Boolean) obj3);
                return;
            case 11:
                iy0.D((iy0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3);
                return;
            case 12:
                iy0.F((iy0) obj5, (String) obj4, (TextView) obj3);
                return;
            case 13:
                iy0 iy0Var2 = (iy0) obj5;
                ArrayList arrayList12 = (ArrayList) obj4;
                ArrayList arrayList13 = (ArrayList) obj3;
                ArrayList arrayList14 = new ArrayList();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                int size2 = arrayList12.size();
                while (true) {
                    if (i16 < size2) {
                        Object obj6 = arrayList12.get(i16);
                        if ((obj6 instanceof Uri) && (stickerExt = MediaController.getStickerExt((uri = (Uri) obj6))) != null) {
                            boolean equals = "tgs".equals(stickerExt);
                            if (bool == null) {
                                bool = Boolean.valueOf(equals);
                            } else if (bool.booleanValue() != equals) {
                                continue;
                            }
                            if (!iy0Var2.isDismissed()) {
                                SendMessagesHelper.ImportingSticker importingSticker2 = new SendMessagesHelper.ImportingSticker();
                                importingSticker2.animated = equals;
                                if (equals) {
                                    i12 = 64;
                                } else {
                                    i12 = 512;
                                }
                                Boolean bool2 = bool;
                                String copyFileToCache = MediaController.copyFileToCache(uri, stickerExt, i12 * 1024);
                                importingSticker2.path = copyFileToCache;
                                if (copyFileToCache != null) {
                                    if (!equals) {
                                        BitmapFactory.decodeFile(copyFileToCache, options);
                                        int i28 = options.outWidth;
                                        if ((i28 == 512 && (i13 = options.outHeight) > 0 && i13 <= 512) || (options.outHeight == 512 && i28 > 0 && i28 <= 512)) {
                                            importingSticker2.mimeType = "image/".concat(stickerExt);
                                            importingSticker2.validated = true;
                                        }
                                    } else {
                                        importingSticker2.mimeType = "application/x-tgsticker";
                                    }
                                    if (arrayList13 != null && arrayList13.size() == size2 && (arrayList13.get(i16) instanceof String)) {
                                        importingSticker2.emoji = (String) arrayList13.get(i16);
                                    } else {
                                        importingSticker2.emoji = "#️⃣";
                                    }
                                    arrayList14.add(importingSticker2);
                                    if (arrayList14.size() >= 200) {
                                        bool = bool2;
                                    }
                                }
                                bool = bool2;
                            } else {
                                return;
                            }
                        }
                        i16++;
                    }
                }
                AndroidUtilities.runOnUIThread(new en0(iy0Var2, arrayList14, bool, 10));
                return;
            case 14:
                t51 t51Var = (t51) obj5;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                SparseArray sparseArray = t51Var.f28399f;
                ArrayList arrayList15 = t51Var.e;
                ArrayList arrayList16 = t51Var.f28400n;
                SparseArray sparseArray2 = t51Var.d;
                t51Var.f28401r = false;
                if (tL_error2 == null && (tLObject3 instanceof TLRPC.TL_messages_featuredStickers)) {
                    ArrayList<TLRPC.StickerSetCovered> arrayList17 = ((TLRPC.TL_messages_featuredStickers) tLObject3).sets;
                    if (arrayList17.size() < 40) {
                        t51Var.f28402s = true;
                    }
                    if (!arrayList17.isEmpty()) {
                        if (arrayList16.isEmpty()) {
                            int i29 = t51Var.f28403w;
                            t51Var.f28403w = i29 + 1;
                            sparseArray2.put(i29, -1);
                        }
                        arrayList16.addAll(arrayList17);
                        int size3 = arrayList15.size();
                        for (int i30 = 0; i30 < arrayList17.size(); i30++) {
                            TLRPC.StickerSetCovered stickerSetCovered = arrayList17.get(i30);
                            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                                arrayList15.add(stickerSetCovered);
                                sparseArray.put(t51Var.f28403w, stickerSetCovered);
                                int i31 = t51Var.f28403w;
                                t51Var.f28403w = i31 + 1;
                                int i32 = size3 + 1;
                                sparseArray2.put(i31, Integer.valueOf(size3));
                                if (!stickerSetCovered.covers.isEmpty()) {
                                    i14 = (int) Math.ceil(stickerSetCovered.covers.size() / t51Var.v);
                                    for (int i33 = 0; i33 < stickerSetCovered.covers.size(); i33++) {
                                        sparseArray2.put(t51Var.f28403w + i33, stickerSetCovered.covers.get(i33));
                                    }
                                } else {
                                    sparseArray2.put(t51Var.f28403w, stickerSetCovered.cover);
                                    i14 = 1;
                                }
                                int i34 = 0;
                                while (true) {
                                    int i35 = t51Var.v * i14;
                                    if (i34 < i35) {
                                        sparseArray.put(t51Var.f28403w + i34, stickerSetCovered);
                                        i34++;
                                    } else {
                                        t51Var.f28403w = i35 + t51Var.f28403w;
                                        size3 = i32;
                                    }
                                }
                            }
                        }
                        t51Var.l();
                        return;
                    }
                    return;
                }
                t51Var.f28402s = true;
                return;
            case 15:
                d81 d81Var = (d81) obj5;
                Uri uri2 = (Uri) obj4;
                MessageObject messageObject2 = (MessageObject) obj3;
                d81Var.getClass();
                if ("tg".equals(uri2.getScheme())) {
                    int intValue = Utilities.parseInt((CharSequence) uri2.getQueryParameter("account")).intValue();
                    Object parentObject = FileLoader.getInstance(intValue).getParentObject(Utilities.parseInt((CharSequence) uri2.getQueryParameter("rid")).intValue());
                    TLRPC.TL_document tL_document = new TLRPC.TL_document();
                    tL_document.access_hash = Utilities.parseLong(uri2.getQueryParameter("hash")).longValue();
                    tL_document.f18349id = Utilities.parseLong(uri2.getQueryParameter("id")).longValue();
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
                        absolutePath = new File(directory, a4.a.r(sb2, tL_document.f18349id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath = FileLoader.getInstance(intValue).getPathToAttach(tL_document, false).getAbsolutePath();
                    }
                    d81Var.f23587b = new c6(new File(absolutePath), true, tL_document.size, 1, tL_document, null, parentObject, 0L, intValue, true);
                } else {
                    d81Var.f23587b = new c6(new File(uri2.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                }
                d81Var.f23589c = d81Var.f23587b.d[4];
                float f7 = d81Var.h;
                if (f7 != 0.0f) {
                    d81Var.e(messageObject2, f7, d81Var.f23597r);
                    d81Var.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new y71(d81Var, 1));
                return;
            case 16:
                d81 d81Var2 = (d81) obj5;
                t71 t71Var = (t71) obj4;
                MessageObject messageObject3 = (MessageObject) obj3;
                d81Var2.getClass();
                if (t71Var.b()) {
                    d81Var2.f23587b = new c6(new File(t71Var.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                } else {
                    int i36 = UserConfig.selectedAccount;
                    try {
                        i36 = Utilities.parseInt((CharSequence) t71Var.d.getQueryParameter("account")).intValue();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    int i37 = i36;
                    try {
                        obj2 = FileLoader.getInstance(i37).getParentObject(Utilities.parseInt((CharSequence) t71Var.d.getQueryParameter("rid")).intValue());
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    Object obj7 = obj2;
                    TLRPC.Document document2 = t71Var.f28413g;
                    if (FileLoader.getInstance(i37).isLoadingFile(FileLoader.getAttachFileName(document2))) {
                        File directory2 = FileLoader.getDirectory(4);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(document2.dc_id);
                        sb3.append("_");
                        absolutePath2 = new File(directory2, a4.a.r(sb3, document2.f18349id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath2 = FileLoader.getInstance(i37).getPathToAttach(document2, false).getAbsolutePath();
                    }
                    d81Var2.f23587b = new c6(new File(absolutePath2), true, document2.size, 1, document2, null, obj7, 0L, i37, true);
                }
                d81Var2.f23589c = d81Var2.f23587b.d[4];
                float f10 = d81Var2.h;
                if (f10 != 0.0f) {
                    d81Var2.e(messageObject3, f10, d81Var2.f23597r);
                    d81Var2.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new y71(d81Var2, 2));
                return;
            case 17:
                org.telegram.ui.Components.voip.m0 m0Var = (org.telegram.ui.Components.voip.m0) obj5;
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) obj4;
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) obj3;
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
                AnimatedFileNative.d(((File) obj5).getAbsolutePath(), (int[]) obj4, 0L);
                AndroidUtilities.runOnUIThread((org.telegram.ui.ze) obj3);
                return;
            case 19:
                ((q0.a) obj4).accept(Boolean.valueOf(((org.telegram.ui.web.d1) obj5).d((String[]) obj3)));
                return;
            case 20:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj5;
                String str8 = (String) obj4;
                String str9 = (String) obj3;
                botWebViewContainer$BotWebViewProxy.getClass();
                try {
                    org.telegram.ui.web.d1 d1Var = botWebViewContainer$BotWebViewProxy.f38831a;
                    if (d1Var != null) {
                        boolean z14 = org.telegram.ui.web.d1.P0;
                        d1Var.F(botWebViewContainer$BotWebViewProxy, d1Var.g(), str8, str9);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 21:
                String str10 = (String) obj4;
                String str11 = (String) obj3;
                org.telegram.ui.web.d1 d1Var2 = ((BotWebViewContainer$WebViewProxy) obj5).f38832a;
                if (d1Var2 != null && !d1Var2.f38890o0 && d1Var2.f38876c != null) {
                    if (d1Var2.F0 != null && !TextUtils.equals(d1Var2.getOriginHost(), d1Var2.F0)) {
                        d1Var2.h("onWebEventReceived ignore " + str10);
                        return;
                    }
                    d1Var2.h("onWebEventReceived " + str10 + " " + str11);
                    str10.getClass();
                    switch (str10.hashCode()) {
                        case -1695046810:
                            if (str10.equals("actionBarColor")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -462720700:
                            if (str10.equals("navigationBarColor")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 479731943:
                            if (str10.equals("oauth_request")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 675009138:
                            if (str10.equals("siteName")) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case 997530486:
                            if (str10.equals("allowScroll")) {
                                c10 = 4;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                        case 1:
                            try {
                                JSONArray jSONArray = new JSONArray(str11);
                                boolean equals2 = TextUtils.equals(str10, "actionBarColor");
                                int argb = Color.argb((int) Math.round(jSONArray.optDouble(3, 1.0d) * 255.0d), (int) Math.round(jSONArray.optDouble(0)), (int) Math.round(jSONArray.optDouble(1)), (int) Math.round(jSONArray.optDouble(2)));
                                org.telegram.ui.web.z0 z0Var = d1Var2.f38872a;
                                if (z0Var != null) {
                                    if (equals2) {
                                        z0Var.f39150s = true;
                                        z0Var.f39151w = argb;
                                    } else {
                                        z0Var.v = true;
                                        z0Var.f39152x = argb;
                                    }
                                    org.telegram.ui.web.z0.a(z0Var);
                                }
                                d1Var2.f38876c.o(argb, equals2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        case 2:
                            d1Var2.h("oauth_request " + str11);
                            if (d1Var2.f38872a != null) {
                                String originHost = d1Var2.getOriginHost();
                                if (!TextUtils.isEmpty(originHost)) {
                                    try {
                                        String optString = new JSONObject(str11).optString("url");
                                        d1Var2.z("oauth_supported", org.telegram.ui.web.d1.B(1, "version"));
                                        if (!TextUtils.isEmpty(optString)) {
                                            TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                                            tL_messages_requestUrlAuth.url = optString;
                                            int i38 = tL_messages_requestUrlAuth.flags;
                                            tL_messages_requestUrlAuth.in_app_origin = originHost;
                                            tL_messages_requestUrlAuth.flags = i38 | 12;
                                            ConnectionsManager.getInstance(d1Var2.M).sendRequest(tL_messages_requestUrlAuth, new ai.p3(d1Var2, tL_messages_requestUrlAuth, optString, originHost, 14), 2);
                                            return;
                                        }
                                        return;
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                        return;
                                    }
                                }
                                return;
                            }
                            return;
                        case 3:
                            d1Var2.h("siteName " + str11);
                            org.telegram.ui.web.z0 z0Var2 = d1Var2.f38872a;
                            if (z0Var2 != null) {
                                z0Var2.f39149r = str11;
                                org.telegram.ui.web.z0.a(z0Var2);
                                return;
                            }
                            return;
                        case 4:
                            try {
                                JSONArray jSONArray2 = new JSONArray(str11);
                                z12 = jSONArray2.optBoolean(0, true);
                                try {
                                    z13 = jSONArray2.optBoolean(1, true);
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                                z12 = true;
                            }
                            if (d1Var2.getParent() instanceof ei.p4) {
                                ei.p4 p4Var = (ei.p4) d1Var2.getParent();
                                p4Var.O = z12;
                                p4Var.P = z13;
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                return;
            case 22:
                org.telegram.ui.web.h1 h1Var = (org.telegram.ui.web.h1) obj5;
                ArrayList arrayList18 = (ArrayList) obj4;
                String str12 = (String) obj3;
                ArrayList arrayList19 = new ArrayList();
                for (int i39 = 0; i39 < arrayList18.size(); i39++) {
                    org.telegram.ui.web.e1 e1Var = (org.telegram.ui.web.e1) arrayList18.get(i39);
                    if (org.telegram.ui.web.h1.t(e1Var.f38914c, str12) || ((n2Var2 = e1Var.d) != null && (org.telegram.ui.web.h1.t(n2Var2.f39017c, str12) || org.telegram.ui.web.h1.t(e1Var.d.d, str12)))) {
                        arrayList19.add(e1Var);
                    }
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.g1(0, h1Var, arrayList19));
                return;
            case 23:
                org.telegram.ui.web.j2 j2Var = (org.telegram.ui.web.j2) obj5;
                org.telegram.ui.web.i2 i2Var = (org.telegram.ui.web.i2) obj4;
                Bitmap bitmap = (Bitmap) obj3;
                j2Var.getClass();
                if (org.telegram.ui.web.j2.f38973f != null) {
                    if ((i2Var.d > 0 && i2Var.e > 0) || bitmap == null) {
                        z13 = false;
                    }
                    if (bitmap != null) {
                        j2Var.d.put(i2Var.f38962b, bitmap);
                        if (z13) {
                            int i40 = i2Var.d;
                            if (i40 == 0 && i2Var.e == 0) {
                                i2Var.d = bitmap.getWidth();
                                i2Var.e = bitmap.getHeight();
                            } else if (i40 == 0) {
                                i2Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * i2Var.e);
                            } else if (i2Var.e == 0) {
                                i2Var.e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * i2Var.d);
                            }
                        }
                    }
                    ArrayList arrayList20 = (ArrayList) org.telegram.ui.web.j2.f38973f.remove(i2Var.f38962b);
                    if (arrayList20 != null) {
                        int size4 = arrayList20.size();
                        while (i16 < size4) {
                            Object obj8 = arrayList20.get(i16);
                            i16++;
                            Pair pair = (Pair) obj8;
                            ((ImageReceiver) pair.first).setImageBitmap(bitmap);
                            if (z13 && (obj = pair.second) != null) {
                                ((Runnable) obj).run();
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 24:
                ((EglRenderer) obj5).lambda$init$0((EglBase.Context) obj4, (int[]) obj3);
                return;
            case 25:
                ((EglRenderer) obj5).lambda$removeFrameListener$4((CountDownLatch) obj4, (EglRenderer.FrameListener) obj3);
                return;
            case 26:
                ((VideoFileRenderer) obj5).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) obj4, (VideoFrame) obj3);
                return;
            case 27:
                ((tg.x0) obj5).run(new Pair((HashMap) obj3, (ArrayList) obj4));
                return;
            case 28:
                a();
                return;
            default:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj5;
                Utilities.Callback callback = (Utilities.Callback) obj4;
                Utilities.Callback callback2 = (Utilities.Callback) obj3;
                if (tL_error3 != null) {
                    callback.run(tL_error3);
                    return;
                } else {
                    callback2.run(null);
                    return;
                }
        }
    }

    public en0(Object obj, Object obj2, Object obj3, int i10) {
        this.f23977a = i10;
        this.f23978b = obj;
        this.f23979c = obj2;
        this.d = obj3;
    }
}
