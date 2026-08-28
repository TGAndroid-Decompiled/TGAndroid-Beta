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
public final class zq implements Runnable {
    public final int f35357a;
    public final Object f35358b;
    public final Object f35359c;

    public zq(int i9, Object obj, Object obj2) {
        this.f35357a = i9;
        this.f35358b = obj;
        this.f35359c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        Bitmap createBitmap;
        boolean z11;
        int i9;
        long j10;
        a60 a60Var;
        org.telegram.ui.bb bbVar;
        gh.u5 u5Var;
        int i10 = this.f35357a;
        boolean z12 = false;
        Object obj = this.f35359c;
        Object obj2 = this.f35358b;
        switch (i10) {
            case 0:
                cr crVar = (cr) obj2;
                crVar.getClass();
                ((kh.d) obj).setLoading(false);
                crVar.dismiss();
                return;
            case 1:
                cr crVar2 = (cr) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    crVar2.X = groupcallstreamrtmpurl.url;
                    crVar2.Y = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(crVar2.Y);
                    crVar2.Z = spannableStringBuilder;
                    ?? obj3 = new Object();
                    obj3.f34062a |= 256;
                    obj3.f34063b = 0;
                    obj3.f34064c = spannableStringBuilder.length();
                    crVar2.Z.setSpan(new wz0(obj3, 0), 0, crVar2.Z.length(), 0);
                    crVar2.f27556a0.N(false);
                    return;
                }
                return;
            case 2:
                gs gsVar = (gs) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ds dsVar = gsVar.f28856b;
                ArrayList arrayList = gsVar.h;
                int i11 = gsVar.f28855a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i11).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i11).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList.addAll(popularappbots.users);
                    String str = popularappbots.next_offset;
                    gsVar.f28860g = str;
                    if (str == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    gsVar.f28858e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    gsVar.f28859f = currentTimeMillis;
                    if (!gsVar.f28861i) {
                        gsVar.f28861i = true;
                        String str2 = gsVar.f28860g;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        ArrayList arrayList2 = new ArrayList();
                        for (int i12 = 0; i12 < arrayList.size(); i12 = aa.d.g(((TLRPC.User) arrayList.get(i12)).f22527id, arrayList2, i12, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
                        messagesStorage.getStorageQueue().postRunnable(new fh.m1(gsVar, messagesStorage, arrayList2, currentTimeMillis, str3, 11));
                    }
                    gsVar.f28857c = false;
                    dsVar.run();
                    return;
                }
                gsVar.f28860g = null;
                gsVar.f28858e = true;
                gsVar.f28857c = false;
                dsVar.run();
                return;
            case 3:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new zq(4, (bt) obj2, decodeFile));
                return;
            case 4:
                ((bt) obj2).setImage((Bitmap) obj);
                return;
            case 5:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                return;
            case 6:
                MessagesController.getInstance(dv.T(((mu) obj2).f30919a)).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 7:
                MessagesController.getInstance(((pw) obj2).f31767a.Y0).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 8:
                TLObject tLObject3 = (TLObject) obj;
                wy wyVar = ((pw) obj2).f31767a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(wyVar.Y0).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(wyVar.Y0).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            case 9:
                nx nxVar = (nx) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                nxVar.f31200s.f29868f = true;
                wy wyVar2 = nxVar.A;
                if (!wyVar2.l1.contains(Long.valueOf(tL_messages_stickerSet2.set.f22407id))) {
                    wyVar2.l1.add(Long.valueOf(tL_messages_stickerSet2.set.f22407id));
                }
                nxVar.a(true);
                return;
            case 10:
                final ux uxVar = (ux) obj2;
                final String str4 = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                wy wyVar3 = uxVar.f33157a.B;
                if (!Arrays.equals(wyVar3.S0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(wyVar3.Y0).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                wyVar3.S0 = currentKeyboardLanguage;
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
                                ux uxVar2 = uxVar;
                                MediaDataController.getInstance(uxVar2.f33157a.B.Y0).searchStickerSets(true, str4, new fh.i(uxVar2, arrayList5, runnable, 9));
                                return;
                            default:
                                wy wyVar4 = uxVar.f33157a.B;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(wyVar4.Y0).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i13 = wyVar4.Y0;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i13).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList5;
                                    if (stickerSets != null) {
                                        for (int i14 = 0; i14 < stickerSets.size(); i14++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i14);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f22407id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.l0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new ox(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f22407id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i13).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i15 = 0; i15 < featuredEmojiSets.size(); i15++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i15);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f22407id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.l0.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i13).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        if (stickerSet3 != null) {
                                                            arrayList6 = stickerSet3.documents;
                                                        } else {
                                                            arrayList6 = null;
                                                        }
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new ox(stickerSetCovered, arrayList6));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f22407id));
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
                }, new org.telegram.ui.df(18, uxVar, str4), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj4;
                        switch (r4) {
                            case 0:
                                ux uxVar2 = uxVar;
                                MediaDataController.getInstance(uxVar2.f33157a.B.Y0).searchStickerSets(true, str4, new fh.i(uxVar2, arrayList4, runnable, 9));
                                return;
                            default:
                                wy wyVar4 = uxVar.f33157a.B;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(wyVar4.Y0).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i13 = wyVar4.Y0;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i13).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList4;
                                    if (stickerSets != null) {
                                        for (int i14 = 0; i14 < stickerSets.size(); i14++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i14);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f22407id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.l0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new ox(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f22407id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i13).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i15 = 0; i15 < featuredEmojiSets.size(); i15++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i15);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f22407id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.l0.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i13).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        if (stickerSet3 != null) {
                                                            arrayList6 = stickerSet3.documents;
                                                        } else {
                                                            arrayList6 = null;
                                                        }
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new ox(stickerSetCovered, arrayList6));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f22407id));
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
                }, new org.telegram.ui.df(19, uxVar, arrayList3), new gh.i2(uxVar, str4, arrayList3, arrayList4, arrayList5, 4));
                return;
            case 11:
                ArrayList arrayList6 = (ArrayList) obj;
                vx vxVar = ((ux) obj2).f33157a;
                vxVar.B.R.e(false);
                ArrayList arrayList7 = vxVar.f34016r;
                if (arrayList7.size() >= arrayList6.size()) {
                    z12 = true;
                }
                vxVar.A = z12;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                vxVar.l();
                return;
            case 12:
                ((ay) obj2).F((String) obj, "", true, false, false);
                return;
            case 13:
                ay ayVar = (ay) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                wy wyVar4 = ayVar.H;
                MessagesController.getInstance(wyVar4.Y0).putUsers(tL_contacts_resolvedPeer.users, false);
                int i13 = wyVar4.Y0;
                MessagesController.getInstance(i13).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i13).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str5 = ayVar.f26923w;
                ayVar.f26923w = null;
                ayVar.F(str5, "", false, false, false);
                return;
            case 14:
                hz hzVar = (hz) obj2;
                kh.z7 z7Var = (kh.z7) obj;
                hzVar.c();
                hzVar.h(z7Var);
                lz lzVar = hzVar.F;
                lzVar.f30607h1 = z7Var;
                lzVar.j();
                return;
            case 15:
                ((hz) obj2).F.f30602f1 = (kz) obj;
                return;
            case 16:
                ((n00) obj2).f30978v0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 17:
                ((org.telegram.ui.df) obj2).run((org.telegram.ui.ActionBar.o2) obj);
                return;
            case 18:
                e40 e40Var = (e40) obj2;
                Uri uri = (Uri) obj;
                e40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) e40Var.f27909a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? o2Var = new org.telegram.ui.ActionBar.o2(bundle);
                        o2Var.f40207e = false;
                        o2Var.f40208f = false;
                        o2Var.f40206c = e40Var;
                        launchActivity.p0(o2Var);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    e40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 19:
                e50 e50Var = (e50) obj2;
                z40 z40Var = (z40) obj;
                f50 f50Var = e50Var.D0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                f50Var.J = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, f50Var.H);
                VideoEditedInfo videoEditedInfo2 = f50Var.J;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = f50Var.D;
                videoEditedInfo2.encryptedFile = f50Var.E;
                videoEditedInfo2.key = f50Var.F;
                videoEditedInfo2.iv = f50Var.G;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = e50Var.f27924a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = f50Var.J;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = f50Var.V0;
                videoEditedInfo3.estimatedDuration = f50Var.f28275b0;
                f50Var.V0 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, e50Var.f27924a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (z40Var != null) {
                    photoEntry.ttl = z40Var.f35183c;
                    photoEntry.effectId = z40Var.d;
                }
                x40 x40Var = f50Var.f28276c;
                VideoEditedInfo videoEditedInfo4 = f50Var.J;
                if (z40Var != null && !z40Var.f35181a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z40Var != null) {
                    i9 = z40Var.f35182b;
                } else {
                    i9 = 0;
                }
                if (z40Var != null) {
                    j10 = z40Var.f35184e;
                } else {
                    j10 = 0;
                }
                x40Var.r(photoEntry, videoEditedInfo4, z11, i9, 0, false, j10);
                return;
            case 20:
                Bitmap bitmap = (Bitmap) obj;
                e50 e50Var2 = (e50) ((m.i3) obj2).f16977b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && e50Var2.f27954w0.size() > 1) {
                    ArrayList arrayList8 = e50Var2.f27954w0;
                    arrayList8.add((Bitmap) j3.r0.j(1, arrayList8));
                    return;
                }
                e50Var2.f27954w0.add(bitmap);
                return;
            case 21:
                a60 a60Var2 = (a60) obj2;
                TLObject tLObject4 = (TLObject) obj;
                a60Var2.getClass();
                if (tLObject4 instanceof Vector) {
                    Vector vector = (Vector) tLObject4;
                    if (!vector.objects.isEmpty()) {
                        a60Var2.f26679c.put(Long.valueOf(a60Var2.f26677b.admin_id), (TLRPC.User) vector.objects.get(0));
                        a60Var2.P.l();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                u50 u50Var = (u50) obj2;
                if (((TLRPC.TL_error) obj) == null && (bbVar = (a60Var = u50Var.f32924a.f33265c).f26685f0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = a60Var.f26677b;
                    org.telegram.ui.pb pbVar = bbVar.f36807a;
                    ArrayList arrayList9 = pbVar.f41413o0;
                    int size = arrayList9.size();
                    int i14 = pbVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = pbVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.pb.L0(pbVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) pbVar.f41412n0, (HashMap<String, ArrayList<MessageObject>>) pbVar.m0, pbVar.f41418s, pbVar.T, true).contentType >= 0) {
                        pbVar.R0();
                        int size2 = arrayList9.size() - size;
                        if (size2 > 0) {
                            pbVar.C0.N = true;
                            org.telegram.ui.lb lbVar = pbVar.E;
                            lbVar.s(lbVar.h, size2);
                            org.telegram.ui.pb.K0(pbVar);
                        }
                        pbVar.f41428y0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((k60) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new p1(3, editTextBoldCursor));
                return;
            case 24:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.vo) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 25:
                g80 g80Var = (g80) obj2;
                if (g80Var.K0 == ((m80) obj)) {
                    g80Var.performLongClick();
                    g80Var.K0 = null;
                    g80Var.I0.d(true);
                    return;
                }
                return;
            case 26:
                ((i80) obj2).l((p80) obj, false);
                return;
            case 27:
                k90 k90Var = (k90) obj2;
                if (!((boolean[]) obj)[0] && (u5Var = k90Var.Q) != null) {
                    u5Var.run();
                }
                k90Var.Q = null;
                return;
            case 28:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((m90) obj2).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new p1(5, editTextBoldCursor2));
                return;
            default:
                i8.i0 i0Var = (i8.i0) obj2;
                Runnable runnable = (Runnable) obj;
                i0Var.getClass();
                runnable.run();
                i0Var.f10991a.remove(runnable);
                return;
        }
    }
}
