package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class as implements Runnable {
    public final int f24613a;
    public final Object f24614b;
    public final Object f24615c;

    public as(int i10, Object obj, Object obj2) {
        this.f24613a = i10;
        this.f24614b = obj;
        this.f24615c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        Bitmap createBitmap;
        boolean z11;
        long j3;
        u70 u70Var;
        org.telegram.ui.ib ibVar;
        ci.x0 x0Var;
        int i10 = this.f24613a;
        boolean z12 = false;
        int i11 = 0;
        Object obj = this.f24615c;
        Object obj2 = this.f24614b;
        switch (i10) {
            case 0:
                es esVar = (es) obj2;
                esVar.getClass();
                ((ci.d) obj).setLoading(false);
                esVar.dismiss();
                return;
            case 1:
                es esVar2 = (es) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    esVar2.f26156b0 = groupcallstreamrtmpurl.url;
                    esVar2.f26157c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(esVar2.f26157c0);
                    esVar2.f26158d0 = spannableStringBuilder;
                    ?? obj3 = new Object();
                    obj3.f31299a |= 256;
                    obj3.f31300b = 0;
                    obj3.f31301c = spannableStringBuilder.length();
                    esVar2.f26158d0.setSpan(new v11(obj3, 0), 0, esVar2.f26158d0.length(), 0);
                    esVar2.f26159e0.N(false);
                    return;
                }
                return;
            case 2:
                ht htVar = (ht) obj2;
                TLObject tLObject2 = (TLObject) obj;
                dt dtVar = htVar.f27141b;
                ArrayList arrayList = htVar.h;
                int i12 = htVar.f27140a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i12).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i12).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList.addAll(popularappbots.users);
                    String str = popularappbots.next_offset;
                    htVar.f27145g = str;
                    if (str == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    htVar.f27143e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    htVar.f27144f = currentTimeMillis;
                    if (!htVar.f27146i) {
                        htVar.f27146i = true;
                        String str2 = htVar.f27145g;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        ArrayList arrayList2 = new ArrayList();
                        for (int i13 = 0; i13 < arrayList.size(); i13 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList.get(i13)).f20189id, arrayList2, i13, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(htVar, messagesStorage, arrayList2, currentTimeMillis, str3, 3));
                    }
                    htVar.f27142c = false;
                    dtVar.run();
                    return;
                }
                htVar.f27145g = null;
                htVar.f27143e = true;
                htVar.f27142c = false;
                dtVar.run();
                return;
            case 3:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new as(4, (gu) obj2, decodeFile));
                return;
            case 4:
                ((gu) obj2).setImage((Bitmap) obj);
                return;
            case 5:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                return;
            case 6:
                MessagesController.getInstance(jw.V(((sv) obj2).f30868a)).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 7:
                MessagesController.getInstance(((ux) obj2).f31657a.f24689c1).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 8:
                TLObject tLObject3 = (TLObject) obj;
                b00 b00Var = ((ux) obj2).f31657a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(b00Var.f24689c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(b00Var.f24689c1).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            case 9:
                sy syVar = (sy) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                syVar.f30893s.f29622f = true;
                b00 b00Var2 = syVar.E;
                if (!b00Var2.f24729p1.contains(Long.valueOf(tL_messages_stickerSet2.set.f20069id))) {
                    b00Var2.f24729p1.add(Long.valueOf(tL_messages_stickerSet2.set.f20069id));
                }
                syVar.a(true);
                return;
            case 10:
                final zy zyVar = (zy) obj2;
                final String str4 = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                b00 b00Var3 = zyVar.f33726a.F;
                if (!Arrays.equals(b00Var3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(b00Var3.f24689c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                b00Var3.W0 = currentKeyboardLanguage;
                ArrayList arrayList3 = new ArrayList();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                Utilities.doCallbacks(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj4;
                        switch (r4) {
                            case 0:
                                zy zyVar2 = zyVar;
                                MediaDataController.getInstance(zyVar2.f33726a.F.f24689c1).searchStickerSets(true, str4, new ai.d5(zyVar2, arrayList5, runnable, 7));
                                return;
                            default:
                                b00 b00Var4 = zyVar.f33726a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(b00Var4.f24689c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i14 = b00Var4.f24689c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i14).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList5;
                                    if (stickerSets != null) {
                                        for (int i15 = 0; i15 < stickerSets.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f20069id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.bi.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new ty(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f20069id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i14).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i16 = 0; i16 < featuredEmojiSets.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f20069id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.bi.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i14).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        if (stickerSet3 != null) {
                                                            arrayList6 = stickerSet3.documents;
                                                        } else {
                                                            arrayList6 = null;
                                                        }
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new ty(stickerSetCovered, arrayList6));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f20069id));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                runnable.run();
                                return;
                        }
                    }
                }, new org.telegram.ui.pc(23, zyVar, str4), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj4;
                        switch (r4) {
                            case 0:
                                zy zyVar2 = zyVar;
                                MediaDataController.getInstance(zyVar2.f33726a.F.f24689c1).searchStickerSets(true, str4, new ai.d5(zyVar2, arrayList4, runnable, 7));
                                return;
                            default:
                                b00 b00Var4 = zyVar.f33726a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(b00Var4.f24689c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i14 = b00Var4.f24689c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i14).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList4;
                                    if (stickerSets != null) {
                                        for (int i15 = 0; i15 < stickerSets.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f20069id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.bi.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new ty(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f20069id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i14).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i16 = 0; i16 < featuredEmojiSets.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f20069id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.bi.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i14).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        if (stickerSet3 != null) {
                                                            arrayList6 = stickerSet3.documents;
                                                        } else {
                                                            arrayList6 = null;
                                                        }
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new ty(stickerSetCovered, arrayList6));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f20069id));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                runnable.run();
                                return;
                        }
                    }
                }, new org.telegram.ui.pc(24, zyVar, arrayList3), new org.telegram.ui.ta(zyVar, str4, arrayList3, arrayList4, arrayList5));
                return;
            case 11:
                ArrayList arrayList6 = (ArrayList) obj;
                az azVar = ((zy) obj2).f33726a;
                azVar.F.V.e(false);
                ArrayList arrayList7 = azVar.f24666r;
                if (arrayList7.size() >= arrayList6.size()) {
                    z12 = true;
                }
                azVar.E = z12;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                azVar.l();
                return;
            case 12:
                ((fz) obj2).F((String) obj, "", true, false, false);
                return;
            case 13:
                fz fzVar = (fz) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                b00 b00Var4 = fzVar.L;
                MessagesController.getInstance(b00Var4.f24689c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i14 = b00Var4.f24689c1;
                MessagesController.getInstance(i14).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i14).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str5 = fzVar.f26542w;
                fzVar.f26542w = null;
                fzVar.F(str5, "", false, false, false);
                return;
            case 14:
                m00 m00Var = (m00) obj2;
                ci.k8 k8Var = (ci.k8) obj;
                m00Var.c();
                m00Var.h(k8Var);
                q00 q00Var = m00Var.J;
                q00Var.f29935h1 = k8Var;
                q00Var.j();
                return;
            case 15:
                ((m00) obj2).J.f29930f1 = (p00) obj;
                return;
            case 16:
                ((t10) obj2).f30939z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 17:
                ((org.telegram.ui.pc) obj2).run((org.telegram.ui.ActionBar.n2) obj);
                return;
            case 18:
                n50 n50Var = (n50) obj2;
                Uri uri = (Uri) obj;
                n50Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) n50Var.f28984a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? n2Var = new org.telegram.ui.ActionBar.n2(bundle);
                        n2Var.f40397e = false;
                        n2Var.f40398f = false;
                        n2Var.f40396c = n50Var;
                        launchActivity.p0(n2Var);
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    n50Var.r(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 19:
                m60 m60Var = (m60) obj2;
                i60 i60Var = (i60) obj;
                u60 u60Var = m60Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                u60Var.S = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, u60Var.Q);
                VideoEditedInfo videoEditedInfo2 = u60Var.S;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = u60Var.M;
                videoEditedInfo2.encryptedFile = u60Var.N;
                videoEditedInfo2.key = u60Var.O;
                videoEditedInfo2.iv = u60Var.P;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = m60Var.f28644a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = u60Var.S;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = u60Var.f31356j1;
                videoEditedInfo3.estimatedDuration = u60Var.f31357k0;
                u60Var.f31356j1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, m60Var.f28644a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (i60Var != null) {
                    photoEntry.ttl = i60Var.f27254c;
                    photoEntry.effectId = i60Var.d;
                }
                g60 g60Var = u60Var.f31360n;
                VideoEditedInfo videoEditedInfo4 = u60Var.S;
                if (i60Var != null && !i60Var.f27252a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (i60Var != null) {
                    i11 = i60Var.f27253b;
                }
                int i15 = i11;
                if (i60Var != null) {
                    j3 = i60Var.f27255e;
                } else {
                    j3 = 0;
                }
                g60Var.r(photoEntry, videoEditedInfo4, z11, i15, 0, false, j3);
                return;
            case 20:
                Bitmap bitmap = (Bitmap) obj;
                m60 m60Var2 = (m60) ((org.telegram.ui.Cells.t6) obj2).f23064b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && m60Var2.A0.size() > 1) {
                    ArrayList arrayList8 = m60Var2.A0;
                    arrayList8.add((Bitmap) hg.c.g(1, arrayList8));
                    return;
                }
                m60Var2.A0.add(bitmap);
                return;
            case 21:
                u70 u70Var2 = (u70) obj2;
                TLObject tLObject4 = (TLObject) obj;
                u70Var2.getClass();
                if (tLObject4 instanceof Vector) {
                    Vector vector = (Vector) tLObject4;
                    if (!vector.objects.isEmpty()) {
                        u70Var2.f31390c.put(Long.valueOf(u70Var2.f31388b.admin_id), (TLRPC.User) vector.objects.get(0));
                        u70Var2.T.l();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                o70 o70Var = (o70) obj2;
                if (((TLRPC.TL_error) obj) == null && (ibVar = (u70Var = o70Var.f29363a.f29713c).f31400j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = u70Var.f31388b;
                    org.telegram.ui.vb vbVar = ibVar.f38644a;
                    ArrayList arrayList9 = vbVar.f42831o0;
                    int size = arrayList9.size();
                    int i16 = vbVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = vbVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.vb.L0(vbVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) vbVar.f42830n0, (HashMap<String, ArrayList<MessageObject>>) vbVar.m0, vbVar.f42821f, vbVar.T, true).contentType >= 0) {
                        vbVar.R0();
                        int size2 = arrayList9.size() - size;
                        if (size2 > 0) {
                            vbVar.C0.N = true;
                            org.telegram.ui.rb rbVar = vbVar.E;
                            rbVar.s(rbVar.h, size2);
                            org.telegram.ui.vb.K0(vbVar);
                        }
                        vbVar.f42846y0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((e80) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(2, editTextBoldCursor));
                return;
            case 24:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.ip) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 25:
                aa0 aa0Var = (aa0) obj2;
                if (aa0Var.O0 == ((ga0) obj)) {
                    aa0Var.performLongClick();
                    aa0Var.O0 = null;
                    aa0Var.M0.d(true);
                    return;
                }
                return;
            case 26:
                ((ca0) obj2).l((ja0) obj, false);
                return;
            case 27:
                eb0 eb0Var = (eb0) obj2;
                if (!((boolean[]) obj)[0] && (x0Var = eb0Var.U) != null) {
                    x0Var.run();
                }
                eb0Var.U = null;
                return;
            case 28:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((gb0) obj2).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(4, editTextBoldCursor2));
                return;
            default:
                zh0 zh0Var = (zh0) obj2;
                Runnable runnable = (Runnable) obj;
                zh0Var.getClass();
                runnable.run();
                zh0Var.f33609a.remove(runnable);
                return;
        }
    }
}
