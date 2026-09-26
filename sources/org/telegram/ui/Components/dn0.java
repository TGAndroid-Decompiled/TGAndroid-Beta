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
public final class dn0 implements Runnable {
    public final int f23722a;
    public final Object f23723b;
    public final Object f23724c;
    public final Object d;

    public dn0(Object obj, Serializable serializable, ArrayList arrayList, int i10) {
        this.f23722a = i10;
        this.f23723b = obj;
        this.d = serializable;
        this.f23724c = arrayList;
    }

    private final void a() {
        TLRPC.User user;
        TLObject tLObject = (TLObject) this.f23723b;
        MessagesController messagesController = (MessagesController) this.f23724c;
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
        js0 js0Var;
        boolean z10;
        int i10;
        long peerId;
        org.telegram.ui.ActionBar.m2 m2Var;
        int i11;
        char c10;
        int i12;
        TLRPC.Document document;
        boolean z11;
        String str;
        Uri uri;
        String stickerExt;
        int i13;
        int i14;
        int i15;
        String absolutePath;
        String absolutePath2;
        boolean z12;
        org.telegram.ui.web.m2 m2Var2;
        Object obj;
        int i16 = this.f23722a;
        String str2 = null;
        Object obj2 = null;
        Boolean bool = null;
        str2 = null;
        int i17 = 0;
        char c11 = 65535;
        boolean z13 = true;
        Object obj3 = this.d;
        Object obj4 = this.f23724c;
        Object obj5 = this.f23723b;
        switch (i16) {
            case 0:
                jn0 jn0Var = (jn0) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                ArrayList<MessageObject> arrayList2 = (ArrayList) obj3;
                int i18 = jn0Var.d;
                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                    DownloadController.getInstance(i18).onDownloadComplete((MessageObject) arrayList.get(i19));
                }
                if (!arrayList2.isEmpty()) {
                    DownloadController.getInstance(i18).deleteRecentFiles(arrayList2);
                }
                jn0Var.O = false;
                jn0Var.d(true);
                return;
            case 1:
                fo0 fo0Var = (fo0) obj5;
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) obj4;
                z70 z70Var = (z70) obj3;
                if (UserConfig.getInstance(fo0Var.K0.H0).isPremium()) {
                    qyVar.getMessagesController().disableAds(true);
                    fo0Var.T();
                    xc.a0(qyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                } else {
                    new rg.x0((org.telegram.ui.ActionBar.m2) qyVar, 3, true).show();
                }
                z70Var.u();
                return;
            case 2:
                kv0 kv0Var = (kv0) obj5;
                e5.S(kv0Var.getContext(), null, kv0Var.F1, new nr0(kv0Var, (TL_stories.StoryItem) obj4));
                ((z70) obj3).u();
                return;
            case 3:
                kv0 kv0Var2 = (kv0) obj5;
                String str3 = (String) obj4;
                org.telegram.ui.ActionBar.m2 m2Var3 = (org.telegram.ui.ActionBar.m2) obj3;
                nt0 nt0Var = new nt0(kv0Var2.getContext(), str3, str3, kv0Var2.F1, m2Var3);
                if (m2Var3 != null) {
                    m2Var3.showDialog(nt0Var);
                    return;
                } else {
                    nt0Var.show();
                    return;
                }
            case 4:
                ot0 ot0Var = (ot0) obj5;
                kv0 kv0Var3 = ot0Var.d;
                e5.S(kv0Var3.getContext(), kv0Var3.f25866v1, (org.telegram.ui.ActionBar.d6) obj4, new nv(ot0Var, 21));
                ((z70) obj3).u();
                return;
            case 5:
                vt0 vt0Var = (vt0) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject = (TLObject) obj3;
                kv0 kv0Var4 = vt0Var.f29761n;
                int h = vt0Var.h();
                if (tL_error == null) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    kv0Var4.f25866v1.getMessagesController().putChats(messages_chats.chats, false);
                    if (!messages_chats.chats.isEmpty() && messages_chats.chats.size() == 100) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    vt0Var.h = z10;
                    vt0Var.d.addAll(messages_chats.chats);
                } else {
                    vt0Var.h = true;
                }
                int i20 = 0;
                while (true) {
                    du0[] du0VarArr = kv0Var4.f25842k0;
                    if (i20 < du0VarArr.length) {
                        du0 du0Var = du0VarArr[i20];
                        if (du0Var.F == 6 && (js0Var = du0Var.h) != null && (vt0Var.f29760f || h == 0)) {
                            kv0Var4.z(js0Var, 0, null);
                        }
                        i20++;
                    } else {
                        vt0Var.e = false;
                        vt0Var.f29760f = true;
                        vt0Var.l();
                        return;
                    }
                }
                break;
            case 6:
                bu0 bu0Var = (bu0) obj5;
                ArrayList arrayList3 = (ArrayList) obj4;
                org.telegram.ui.ActionBar.m2 m2Var4 = bu0Var.f23107s.f25866v1;
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new dn0((Object) bu0Var, (Object) new ArrayList(), (Object) new ArrayList(), 7));
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
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int size = arrayList3.size();
                int i22 = 0;
                while (i22 < size) {
                    TLObject tLObject2 = (TLObject) arrayList3.get(i22);
                    if (tLObject2 instanceof TLRPC.ChatParticipant) {
                        peerId = ((TLRPC.ChatParticipant) tLObject2).user_id;
                    } else {
                        if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                            peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer);
                        }
                        m2Var = m2Var4;
                        i11 = i21;
                        i22++;
                        i21 = i11;
                        m2Var4 = m2Var;
                        i17 = 0;
                    }
                    TLRPC.User user = m2Var4.getMessagesController().getUser(Long.valueOf(peerId));
                    if (user.f18482id != m2Var4.getUserConfig().getClientUserId()) {
                        String lowerCase2 = UserObject.getUserName(user).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        if (lowerCase2.equals(translitString2)) {
                            translitString2 = null;
                        }
                        char c12 = 0;
                        while (i17 < i21) {
                            m2Var = m2Var4;
                            String str4 = strArr[i17];
                            if (!lowerCase2.startsWith(str4) && !org.telegram.messenger.f0.w(" ", str4, lowerCase2) && (translitString2 == null || (!translitString2.startsWith(str4) && !org.telegram.messenger.f0.w(" ", str4, translitString2)))) {
                                String publicUsername = UserObject.getPublicUsername(user);
                                if (publicUsername != null && publicUsername.startsWith(str4)) {
                                    c10 = 2;
                                } else {
                                    c10 = c12;
                                }
                            } else {
                                c10 = 1;
                            }
                            if (c10 != 0) {
                                i11 = i21;
                                if (c10 == 1) {
                                    arrayList4.add(AndroidUtilities.generateSearchName(user.first_name, user.last_name, str4));
                                } else {
                                    arrayList4.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user), null, "@" + str4));
                                }
                                arrayList5.add(tLObject2);
                                i22++;
                                i21 = i11;
                                m2Var4 = m2Var;
                                i17 = 0;
                            } else {
                                i17++;
                                m2Var4 = m2Var;
                                c12 = c10;
                            }
                        }
                    }
                    m2Var = m2Var4;
                    i11 = i21;
                    i22++;
                    i21 = i11;
                    m2Var4 = m2Var;
                    i17 = 0;
                }
                AndroidUtilities.runOnUIThread(new dn0((Object) bu0Var, (Object) arrayList4, (Object) arrayList5, 7));
                return;
            case 7:
                bu0 bu0Var2 = (bu0) obj5;
                ArrayList arrayList6 = (ArrayList) obj4;
                ArrayList arrayList7 = (ArrayList) obj3;
                kv0 kv0Var5 = bu0Var2.f23107s;
                if (kv0Var5.V0) {
                    bu0Var2.d = arrayList6;
                    bu0Var2.f23106r--;
                    if (!ChatObject.isChannel(bu0Var2.f23105n)) {
                        ArrayList arrayList8 = bu0Var2.e.f9675g;
                        arrayList8.clear();
                        arrayList8.addAll(arrayList7);
                    }
                    if (bu0Var2.f23106r == 0) {
                        int i23 = 0;
                        while (true) {
                            du0[] du0VarArr2 = kv0Var5.f25842k0;
                            if (i23 < du0VarArr2.length) {
                                du0 du0Var2 = du0VarArr2[i23];
                                if (du0Var2.F == 7) {
                                    if (bu0Var2.h == 0) {
                                        du0Var2.f23759w.e(false, true);
                                    } else {
                                        kv0Var5.z(du0Var2.h, 0, null);
                                    }
                                }
                                i23++;
                            }
                        }
                    }
                    bu0Var2.l();
                    return;
                }
                return;
            case 8:
                gu0 gu0Var = (gu0) obj5;
                ArrayList arrayList9 = (ArrayList) obj4;
                gu0Var.getClass();
                String lowerCase3 = ((String) obj3).trim().toLowerCase();
                if (lowerCase3.length() == 0) {
                    AndroidUtilities.runOnUIThread(new xn0(9, gu0Var, new ArrayList()));
                    return;
                }
                String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                if (!lowerCase3.equals(translitString3) && translitString3.length() != 0) {
                    str2 = translitString3;
                }
                if (str2 != null) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                int i24 = i12 + 1;
                String[] strArr2 = new String[i24];
                strArr2[0] = lowerCase3;
                if (str2 != null) {
                    strArr2[1] = str2;
                }
                ArrayList arrayList10 = new ArrayList();
                for (int i25 = 0; i25 < arrayList9.size(); i25++) {
                    MessageObject messageObject = (MessageObject) arrayList9.get(i25);
                    int i26 = 0;
                    while (true) {
                        if (i26 < i24) {
                            String str5 = strArr2[i26];
                            String documentName = messageObject.getDocumentName();
                            if (documentName != null && documentName.length() != 0) {
                                if (documentName.toLowerCase().contains(str5)) {
                                    arrayList10.add(messageObject);
                                } else if (gu0Var.f24590r != 4) {
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
                                        arrayList10.add(messageObject);
                                    }
                                }
                            }
                            i26++;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new xn0(9, gu0Var, arrayList10));
                return;
            case 9:
                gy0 gy0Var = (gy0) obj5;
                String str7 = (String) obj4;
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) obj3;
                if (!gy0Var.isDismissed()) {
                    gy0Var.Z.remove(str7);
                    if (!"application/x-tgsticker".equals(importingSticker.mimeType)) {
                        gy0Var.u0(importingSticker);
                    } else {
                        importingSticker.validated = true;
                        int indexOf = gy0Var.Y.indexOf(importingSticker);
                        if (indexOf >= 0) {
                            s4.c1 K = gy0Var.f24601c.K(indexOf);
                            if (K != null) {
                                ((org.telegram.ui.Cells.f8) K.f42959a).setSticker(importingSticker);
                            }
                        } else {
                            gy0Var.d.l();
                        }
                    }
                    if (gy0Var.Z.isEmpty()) {
                        gy0Var.B0();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                gy0.w((gy0) obj5, (ArrayList) obj4, (Boolean) obj3);
                return;
            case 11:
                gy0.E((gy0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3);
                return;
            case 12:
                gy0.G((gy0) obj5, (String) obj4, (TextView) obj3);
                return;
            case 13:
                gy0 gy0Var2 = (gy0) obj5;
                ArrayList arrayList11 = (ArrayList) obj4;
                ArrayList arrayList12 = (ArrayList) obj3;
                ArrayList arrayList13 = new ArrayList();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                int size2 = arrayList11.size();
                while (true) {
                    if (i17 < size2) {
                        Object obj6 = arrayList11.get(i17);
                        if ((obj6 instanceof Uri) && (stickerExt = MediaController.getStickerExt((uri = (Uri) obj6))) != null) {
                            boolean equals = "tgs".equals(stickerExt);
                            if (bool == null) {
                                bool = Boolean.valueOf(equals);
                            } else if (bool.booleanValue() != equals) {
                                continue;
                            }
                            if (!gy0Var2.isDismissed()) {
                                SendMessagesHelper.ImportingSticker importingSticker2 = new SendMessagesHelper.ImportingSticker();
                                importingSticker2.animated = equals;
                                if (equals) {
                                    i13 = 64;
                                } else {
                                    i13 = 512;
                                }
                                Boolean bool2 = bool;
                                String copyFileToCache = MediaController.copyFileToCache(uri, stickerExt, i13 * 1024);
                                importingSticker2.path = copyFileToCache;
                                if (copyFileToCache != null) {
                                    if (!equals) {
                                        BitmapFactory.decodeFile(copyFileToCache, options);
                                        int i28 = options.outWidth;
                                        if ((i28 == 512 && (i14 = options.outHeight) > 0 && i14 <= 512) || (options.outHeight == 512 && i28 > 0 && i28 <= 512)) {
                                            importingSticker2.mimeType = "image/".concat(stickerExt);
                                            importingSticker2.validated = true;
                                        }
                                    } else {
                                        importingSticker2.mimeType = "application/x-tgsticker";
                                    }
                                    if (arrayList12 != null && arrayList12.size() == size2 && (arrayList12.get(i17) instanceof String)) {
                                        importingSticker2.emoji = (String) arrayList12.get(i17);
                                    } else {
                                        importingSticker2.emoji = "#️⃣";
                                    }
                                    arrayList13.add(importingSticker2);
                                    if (arrayList13.size() >= 200) {
                                        bool = bool2;
                                    }
                                }
                                bool = bool2;
                            } else {
                                return;
                            }
                        }
                        i17++;
                    }
                }
                AndroidUtilities.runOnUIThread(new dn0(gy0Var2, arrayList13, bool, 10));
                return;
            case 14:
                r51 r51Var = (r51) obj5;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                SparseArray sparseArray = r51Var.f27834f;
                ArrayList arrayList14 = r51Var.e;
                ArrayList arrayList15 = r51Var.f27835n;
                SparseArray sparseArray2 = r51Var.d;
                r51Var.f27836r = false;
                if (tL_error2 == null && (tLObject3 instanceof TLRPC.TL_messages_featuredStickers)) {
                    ArrayList<TLRPC.StickerSetCovered> arrayList16 = ((TLRPC.TL_messages_featuredStickers) tLObject3).sets;
                    if (arrayList16.size() < 40) {
                        r51Var.f27837s = true;
                    }
                    if (!arrayList16.isEmpty()) {
                        if (arrayList15.isEmpty()) {
                            int i29 = r51Var.f27838w;
                            r51Var.f27838w = i29 + 1;
                            sparseArray2.put(i29, -1);
                        }
                        arrayList15.addAll(arrayList16);
                        int size3 = arrayList14.size();
                        for (int i30 = 0; i30 < arrayList16.size(); i30++) {
                            TLRPC.StickerSetCovered stickerSetCovered = arrayList16.get(i30);
                            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                                arrayList14.add(stickerSetCovered);
                                sparseArray.put(r51Var.f27838w, stickerSetCovered);
                                int i31 = r51Var.f27838w;
                                r51Var.f27838w = i31 + 1;
                                int i32 = size3 + 1;
                                sparseArray2.put(i31, Integer.valueOf(size3));
                                if (!stickerSetCovered.covers.isEmpty()) {
                                    i15 = (int) Math.ceil(stickerSetCovered.covers.size() / r51Var.v);
                                    for (int i33 = 0; i33 < stickerSetCovered.covers.size(); i33++) {
                                        sparseArray2.put(r51Var.f27838w + i33, stickerSetCovered.covers.get(i33));
                                    }
                                } else {
                                    sparseArray2.put(r51Var.f27838w, stickerSetCovered.cover);
                                    i15 = 1;
                                }
                                int i34 = 0;
                                while (true) {
                                    int i35 = r51Var.v * i15;
                                    if (i34 < i35) {
                                        sparseArray.put(r51Var.f27838w + i34, stickerSetCovered);
                                        i34++;
                                    } else {
                                        r51Var.f27838w = i35 + r51Var.f27838w;
                                        size3 = i32;
                                    }
                                }
                            }
                        }
                        r51Var.l();
                        return;
                    }
                    return;
                }
                r51Var.f27837s = true;
                return;
            case 15:
                b81 b81Var = (b81) obj5;
                Uri uri2 = (Uri) obj4;
                MessageObject messageObject2 = (MessageObject) obj3;
                b81Var.getClass();
                if ("tg".equals(uri2.getScheme())) {
                    int intValue = Utilities.parseInt((CharSequence) uri2.getQueryParameter("account")).intValue();
                    Object parentObject = FileLoader.getInstance(intValue).getParentObject(Utilities.parseInt((CharSequence) uri2.getQueryParameter("rid")).intValue());
                    TLRPC.TL_document tL_document = new TLRPC.TL_document();
                    tL_document.access_hash = Utilities.parseLong(uri2.getQueryParameter("hash")).longValue();
                    tL_document.f18341id = Utilities.parseLong(uri2.getQueryParameter("id")).longValue();
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
                        absolutePath = new File(directory, a4.a.s(sb2, tL_document.f18341id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath = FileLoader.getInstance(intValue).getPathToAttach(tL_document, false).getAbsolutePath();
                    }
                    b81Var.f22914b = new d6(new File(absolutePath), true, tL_document.size, 1, tL_document, null, parentObject, 0L, intValue, true);
                } else {
                    b81Var.f22914b = new d6(new File(uri2.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                }
                b81Var.f22916c = b81Var.f22914b.d[4];
                float f7 = b81Var.h;
                if (f7 != 0.0f) {
                    b81Var.e(messageObject2, f7, b81Var.f22924r);
                    b81Var.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new w71(b81Var, 1));
                return;
            case 16:
                b81 b81Var2 = (b81) obj5;
                r71 r71Var = (r71) obj4;
                MessageObject messageObject3 = (MessageObject) obj3;
                b81Var2.getClass();
                if (r71Var.b()) {
                    b81Var2.f22914b = new d6(new File(r71Var.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                } else {
                    int i36 = UserConfig.selectedAccount;
                    try {
                        i36 = Utilities.parseInt((CharSequence) r71Var.d.getQueryParameter("account")).intValue();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    int i37 = i36;
                    try {
                        obj2 = FileLoader.getInstance(i37).getParentObject(Utilities.parseInt((CharSequence) r71Var.d.getQueryParameter("rid")).intValue());
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    Object obj7 = obj2;
                    TLRPC.Document document2 = r71Var.f27855g;
                    if (FileLoader.getInstance(i37).isLoadingFile(FileLoader.getAttachFileName(document2))) {
                        File directory2 = FileLoader.getDirectory(4);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(document2.dc_id);
                        sb3.append("_");
                        absolutePath2 = new File(directory2, a4.a.s(sb3, document2.f18341id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath2 = FileLoader.getInstance(i37).getPathToAttach(document2, false).getAbsolutePath();
                    }
                    b81Var2.f22914b = new d6(new File(absolutePath2), true, document2.size, 1, document2, null, obj7, 0L, i37, true);
                }
                b81Var2.f22916c = b81Var2.f22914b.d[4];
                float f10 = b81Var2.h;
                if (f10 != 0.0f) {
                    b81Var2.e(messageObject3, f10, b81Var2.f22924r);
                    b81Var2.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new w71(b81Var2, 2));
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
                AndroidUtilities.runOnUIThread((org.telegram.ui.ye) obj3);
                return;
            case 19:
                ((q0.a) obj4).accept(Boolean.valueOf(((org.telegram.ui.web.b1) obj5).d((String[]) obj3)));
                return;
            case 20:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj5;
                String str8 = (String) obj4;
                String str9 = (String) obj3;
                botWebViewContainer$BotWebViewProxy.getClass();
                try {
                    org.telegram.ui.web.b1 b1Var = botWebViewContainer$BotWebViewProxy.f38975a;
                    if (b1Var != null) {
                        boolean z14 = org.telegram.ui.web.b1.P0;
                        b1Var.F(botWebViewContainer$BotWebViewProxy, b1Var.g(), str8, str9);
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
                org.telegram.ui.web.b1 b1Var2 = ((BotWebViewContainer$WebViewProxy) obj5).f38976a;
                if (b1Var2 != null && !b1Var2.f39014o0 && b1Var2.f39000c != null) {
                    if (b1Var2.F0 != null && !TextUtils.equals(b1Var2.getOriginHost(), b1Var2.F0)) {
                        b1Var2.h("onWebEventReceived ignore " + str10);
                        return;
                    }
                    b1Var2.h("onWebEventReceived " + str10 + " " + str11);
                    str10.getClass();
                    switch (str10.hashCode()) {
                        case -1695046810:
                            if (str10.equals("actionBarColor")) {
                                c11 = 0;
                                break;
                            }
                            break;
                        case -462720700:
                            if (str10.equals("navigationBarColor")) {
                                c11 = 1;
                                break;
                            }
                            break;
                        case 479731943:
                            if (str10.equals("oauth_request")) {
                                c11 = 2;
                                break;
                            }
                            break;
                        case 675009138:
                            if (str10.equals("siteName")) {
                                c11 = 3;
                                break;
                            }
                            break;
                        case 997530486:
                            if (str10.equals("allowScroll")) {
                                c11 = 4;
                                break;
                            }
                            break;
                    }
                    switch (c11) {
                        case 0:
                        case 1:
                            try {
                                JSONArray jSONArray = new JSONArray(str11);
                                boolean equals2 = TextUtils.equals(str10, "actionBarColor");
                                int argb = Color.argb((int) Math.round(jSONArray.optDouble(3, 1.0d) * 255.0d), (int) Math.round(jSONArray.optDouble(0)), (int) Math.round(jSONArray.optDouble(1)), (int) Math.round(jSONArray.optDouble(2)));
                                org.telegram.ui.web.y0 y0Var = b1Var2.f38996a;
                                if (y0Var != null) {
                                    if (equals2) {
                                        y0Var.f39280s = true;
                                        y0Var.f39281w = argb;
                                    } else {
                                        y0Var.v = true;
                                        y0Var.f39282x = argb;
                                    }
                                    org.telegram.ui.web.y0.a(y0Var);
                                }
                                b1Var2.f39000c.o(argb, equals2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        case 2:
                            b1Var2.h("oauth_request " + str11);
                            if (b1Var2.f38996a != null) {
                                String originHost = b1Var2.getOriginHost();
                                if (!TextUtils.isEmpty(originHost)) {
                                    try {
                                        String optString = new JSONObject(str11).optString("url");
                                        b1Var2.z("oauth_supported", org.telegram.ui.web.b1.B(1, "version"));
                                        if (!TextUtils.isEmpty(optString)) {
                                            TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                                            tL_messages_requestUrlAuth.url = optString;
                                            int i38 = tL_messages_requestUrlAuth.flags;
                                            tL_messages_requestUrlAuth.in_app_origin = originHost;
                                            tL_messages_requestUrlAuth.flags = i38 | 12;
                                            ConnectionsManager.getInstance(b1Var2.M).sendRequest(tL_messages_requestUrlAuth, new ai.p3(b1Var2, tL_messages_requestUrlAuth, optString, originHost, 14), 2);
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
                            b1Var2.h("siteName " + str11);
                            org.telegram.ui.web.y0 y0Var2 = b1Var2.f38996a;
                            if (y0Var2 != null) {
                                y0Var2.f39279r = str11;
                                org.telegram.ui.web.y0.a(y0Var2);
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
                            if (b1Var2.getParent() instanceof ei.p4) {
                                ei.p4 p4Var = (ei.p4) b1Var2.getParent();
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
                org.telegram.ui.web.f1 f1Var = (org.telegram.ui.web.f1) obj5;
                ArrayList arrayList17 = (ArrayList) obj4;
                String str12 = (String) obj3;
                ArrayList arrayList18 = new ArrayList();
                while (i17 < arrayList17.size()) {
                    org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) arrayList17.get(i17);
                    if (org.telegram.ui.web.f1.t(c1Var.f39040c, str12) || ((m2Var2 = c1Var.d) != null && (org.telegram.ui.web.f1.t(m2Var2.f39145c, str12) || org.telegram.ui.web.f1.t(c1Var.d.d, str12)))) {
                        arrayList18.add(c1Var);
                    }
                    i17++;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.p81(29, f1Var, arrayList18));
                return;
            case 23:
                org.telegram.ui.web.i2 i2Var = (org.telegram.ui.web.i2) obj5;
                org.telegram.ui.web.h2 h2Var = (org.telegram.ui.web.h2) obj4;
                Bitmap bitmap = (Bitmap) obj3;
                i2Var.getClass();
                if (org.telegram.ui.web.i2.f39102f != null) {
                    if ((h2Var.d > 0 && h2Var.e > 0) || bitmap == null) {
                        z13 = false;
                    }
                    if (bitmap != null) {
                        i2Var.d.put(h2Var.f39089b, bitmap);
                        if (z13) {
                            int i39 = h2Var.d;
                            if (i39 == 0 && h2Var.e == 0) {
                                h2Var.d = bitmap.getWidth();
                                h2Var.e = bitmap.getHeight();
                            } else if (i39 == 0) {
                                h2Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * h2Var.e);
                            } else if (h2Var.e == 0) {
                                h2Var.e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * h2Var.d);
                            }
                        }
                    }
                    ArrayList arrayList19 = (ArrayList) org.telegram.ui.web.i2.f39102f.remove(h2Var.f39089b);
                    if (arrayList19 != null) {
                        int size4 = arrayList19.size();
                        while (i17 < size4) {
                            Object obj8 = arrayList19.get(i17);
                            i17++;
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

    public dn0(Object obj, Object obj2, Object obj3, int i10) {
        this.f23722a = i10;
        this.f23723b = obj;
        this.f23724c = obj2;
        this.d = obj3;
    }
}
