package org.telegram.ui.Components;

import android.content.Context;
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
import java.util.List;
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
public final class eo implements Runnable {
    public final int f26637a;
    public final Object f26638b;
    public final Object f26639c;

    public eo(int i10, Object obj, Object obj2) {
        this.f26637a = i10;
        this.f26638b = obj;
        this.f26639c = obj2;
    }

    @Override
    public final void run() {
        boolean z4;
        ns nsVar;
        Bitmap createBitmap;
        boolean z10;
        int i10;
        long j10;
        u60 u60Var;
        org.telegram.ui.eb ebVar;
        int i11 = this.f26637a;
        boolean z11 = false;
        Object obj = this.f26639c;
        Object obj2 = this.f26638b;
        switch (i11) {
            case 0:
                ho.a(((fo) obj2).f26971c);
                ((vf.g) obj).run();
                return;
            case 1:
                ((gp) obj2).f27228b.x((List) obj);
                return;
            case 2:
                ((hp) obj2).f27589b.x((List) obj);
                return;
            case 3:
                ((org.telegram.ui.ActionBar.h3) obj2).dismiss();
                af.g.s((Context) obj, "https://t.me/BotFather?start=deletebot");
                return;
            case 4:
                lr lrVar = (lr) obj2;
                lrVar.getClass();
                ((qh.d) obj).setLoading(false);
                lrVar.dismiss();
                return;
            case 5:
                lr lrVar2 = (lr) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    lrVar2.Y = groupcallstreamrtmpurl.url;
                    lrVar2.Z = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(lrVar2.Z);
                    lrVar2.f28860a0 = spannableStringBuilder;
                    ?? obj3 = new Object();
                    obj3.f30949a |= 256;
                    obj3.f30950b = 0;
                    obj3.f30951c = spannableStringBuilder.length();
                    lrVar2.f28860a0.setSpan(new t01(obj3, 0), 0, lrVar2.f28860a0.length(), 0);
                    lrVar2.f28861b0.N(false);
                    return;
                }
                return;
            case 6:
                qs qsVar = (qs) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ns nsVar2 = qsVar.f30508b;
                ArrayList arrayList = qsVar.h;
                int i12 = qsVar.f30507a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i12).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i12).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList.addAll(popularappbots.users);
                    String str = popularappbots.next_offset;
                    qsVar.f30512g = str;
                    if (str == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    qsVar.f30510e = z4;
                    long currentTimeMillis = System.currentTimeMillis();
                    qsVar.f30511f = currentTimeMillis;
                    if (qsVar.f30513i) {
                        nsVar = nsVar2;
                    } else {
                        qsVar.f30513i = true;
                        String str2 = qsVar.f30512g;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        ArrayList arrayList2 = new ArrayList();
                        int i13 = 0;
                        while (i13 < arrayList.size()) {
                            i13 = android.support.v4.media.a.g(((TLRPC.User) arrayList.get(i13)).f20992id, arrayList2, i13, 1);
                            nsVar2 = nsVar2;
                        }
                        nsVar = nsVar2;
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                        messagesStorage.getStorageQueue().postRunnable(new lh.g1(qsVar, messagesStorage, arrayList2, currentTimeMillis, str3, 11));
                    }
                    qsVar.f30509c = false;
                    nsVar.run();
                    return;
                }
                qsVar.f30512g = null;
                qsVar.f30510e = true;
                qsVar.f30509c = false;
                nsVar2.run();
                return;
            case 7:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new eo(8, (nt) obj2, decodeFile));
                return;
            case 8:
                ((nt) obj2).setImage((Bitmap) obj);
                return;
            case 9:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                return;
            case 10:
                MessagesController.getInstance(ov.U(((xu) obj2).f33176a)).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 11:
                MessagesController.getInstance(((cx) obj2).f26055a.Z0).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 12:
                TLObject tLObject3 = (TLObject) obj;
                mz mzVar = ((cx) obj2).f26055a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(mzVar.Z0).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(mzVar.Z0).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            case 13:
                cy cyVar = (cy) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                cyVar.f26069s.f33215f = true;
                mz mzVar2 = cyVar.B;
                if (!mzVar2.f29304m1.contains(Long.valueOf(tL_messages_stickerSet2.set.f20872id))) {
                    mzVar2.f29304m1.add(Long.valueOf(tL_messages_stickerSet2.set.f20872id));
                }
                cyVar.a(true);
                return;
            case 14:
                final ky kyVar = (ky) obj2;
                final String str4 = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                mz mzVar3 = kyVar.f28513a.C;
                if (!Arrays.equals(mzVar3.T0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(mzVar3.Z0).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                mzVar3.T0 = currentKeyboardLanguage;
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
                                ky kyVar2 = kyVar;
                                MediaDataController.getInstance(kyVar2.f28513a.C.Z0).searchStickerSets(true, str4, new lh.h(kyVar2, arrayList5, runnable, 9));
                                return;
                            default:
                                mz mzVar4 = kyVar.f28513a.C;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(mzVar4.Z0).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i14 = mzVar4.Z0;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i14).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList5;
                                    if (stickerSets != null) {
                                        for (int i15 = 0; i15 < stickerSets.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f20872id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new dy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f20872id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i14).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i16 = 0; i16 < featuredEmojiSets.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f20872id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, translitSafe3)) {
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
                                                        arrayList8.add(new dy(stickerSetCovered, arrayList6));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f20872id));
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
                }, new xk(3, kyVar, str4), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj4;
                        switch (r4) {
                            case 0:
                                ky kyVar2 = kyVar;
                                MediaDataController.getInstance(kyVar2.f28513a.C.Z0).searchStickerSets(true, str4, new lh.h(kyVar2, arrayList4, runnable, 9));
                                return;
                            default:
                                mz mzVar4 = kyVar.f28513a.C;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(mzVar4.Z0).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i14 = mzVar4.Z0;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i14).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList4;
                                    if (stickerSets != null) {
                                        for (int i15 = 0; i15 < stickerSets.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f20872id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new dy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f20872id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i14).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i16 = 0; i16 < featuredEmojiSets.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f20872id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, translitSafe3)) {
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
                                                        arrayList8.add(new dy(stickerSetCovered, arrayList6));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f20872id));
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
                }, new xk(4, kyVar, arrayList3), new mh.f2(kyVar, str4, arrayList3, arrayList4, arrayList5, 4));
                return;
            case 15:
                ArrayList arrayList6 = (ArrayList) obj;
                ly lyVar = ((ky) obj2).f28513a;
                lyVar.C.S.e(false);
                ArrayList arrayList7 = lyVar.f28898r;
                if (arrayList7.size() >= arrayList6.size()) {
                    z11 = true;
                }
                lyVar.B = z11;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                lyVar.l();
                return;
            case 16:
                ((qy) obj2).F((String) obj, "", true, false, false);
                return;
            case 17:
                qy qyVar = (qy) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                mz mzVar4 = qyVar.I;
                MessagesController.getInstance(mzVar4.Z0).putUsers(tL_contacts_resolvedPeer.users, false);
                int i14 = mzVar4.Z0;
                MessagesController.getInstance(i14).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i14).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str5 = qyVar.f30555w;
                qyVar.f30555w = null;
                qyVar.F(str5, "", false, false, false);
                return;
            case 18:
                xz xzVar = (xz) obj2;
                qh.q6 q6Var = (qh.q6) obj;
                xzVar.c();
                xzVar.h(q6Var);
                b00 b00Var = xzVar.G;
                b00Var.f25418h1 = q6Var;
                b00Var.j();
                return;
            case 19:
                ((xz) obj2).G.f25413f1 = (a00) obj;
                return;
            case 20:
                ((d10) obj2).f26114w0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 21:
                ((xk) obj2).run((org.telegram.ui.ActionBar.p2) obj);
                return;
            case 22:
                y40 y40Var = (y40) obj2;
                Uri uri = (Uri) obj;
                y40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) y40Var.f33309a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? p2Var = new org.telegram.ui.ActionBar.p2(bundle);
                        p2Var.f44000e = false;
                        p2Var.f44001f = false;
                        p2Var.f43999c = y40Var;
                        launchActivity.p0(p2Var);
                        return;
                    }
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    y40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 23:
                y50 y50Var = (y50) obj2;
                u50 u50Var = (u50) obj;
                z50 z50Var = y50Var.E0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                z50Var.K = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, z50Var.I);
                VideoEditedInfo videoEditedInfo2 = z50Var.K;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = z50Var.E;
                videoEditedInfo2.encryptedFile = z50Var.F;
                videoEditedInfo2.key = z50Var.G;
                videoEditedInfo2.iv = z50Var.H;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = y50Var.f33358a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = z50Var.K;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = z50Var.W0;
                videoEditedInfo3.estimatedDuration = z50Var.f33775c0;
                z50Var.W0 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, y50Var.f33358a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (u50Var != null) {
                    photoEntry.ttl = u50Var.f31501c;
                    photoEntry.effectId = u50Var.d;
                }
                s50 s50Var = z50Var.f33774c;
                VideoEditedInfo videoEditedInfo4 = z50Var.K;
                if (u50Var != null && !u50Var.f31499a) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (u50Var != null) {
                    i10 = u50Var.f31500b;
                } else {
                    i10 = 0;
                }
                if (u50Var != null) {
                    j10 = u50Var.f31502e;
                } else {
                    j10 = 0;
                }
                s50Var.r(photoEntry, videoEditedInfo4, z10, i10, 0, false, j10);
                return;
            case 24:
                Bitmap bitmap = (Bitmap) obj;
                y50 y50Var2 = (y50) ((m2.b) obj2).f13423b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && y50Var2.f33390x0.size() > 1) {
                    ArrayList arrayList8 = y50Var2.f33390x0;
                    arrayList8.add((Bitmap) l.d.i(1, arrayList8));
                    return;
                }
                y50Var2.f33390x0.add(bitmap);
                return;
            case 25:
                u60 u60Var2 = (u60) obj2;
                TLObject tLObject4 = (TLObject) obj;
                u60Var2.getClass();
                if (tLObject4 instanceof Vector) {
                    Vector vector = (Vector) tLObject4;
                    if (!vector.objects.isEmpty()) {
                        u60Var2.f31510c.put(Long.valueOf(u60Var2.f31508b.admin_id), (TLRPC.User) vector.objects.get(0));
                        u60Var2.Q.l();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                o60 o60Var = (o60) obj2;
                if (((TLRPC.TL_error) obj) == null && (ebVar = (u60Var = o60Var.f29673a.f29993c).f31517g0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = u60Var.f31508b;
                    org.telegram.ui.sb sbVar = ebVar.f36424a;
                    ArrayList arrayList9 = sbVar.f41108p0;
                    int size = arrayList9.size();
                    int i15 = sbVar.F.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = sbVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.sb.L0(sbVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) sbVar.f41107o0, (HashMap<String, ArrayList<MessageObject>>) sbVar.f41106n0, sbVar.f41112s, sbVar.U, true).contentType >= 0) {
                        sbVar.R0();
                        int size2 = arrayList9.size() - size;
                        if (size2 > 0) {
                            sbVar.D0.N = true;
                            org.telegram.ui.ob obVar = sbVar.F;
                            obVar.s(obVar.h, size2);
                            org.telegram.ui.sb.K0(sbVar);
                        }
                        sbVar.f41123z0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((e70) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(3, editTextBoldCursor));
                return;
            case 28:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.ep) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            default:
                a90 a90Var = (a90) obj2;
                if (a90Var.L0 == ((h90) obj)) {
                    a90Var.performLongClick();
                    a90Var.L0 = null;
                    a90Var.J0.d(true);
                    return;
                }
                return;
        }
    }
}
