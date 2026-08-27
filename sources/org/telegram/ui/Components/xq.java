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

public final class xq implements Runnable {

    public final int f34678a;

    public final Object f34679b;

    public final Object f34680c;

    public xq(int i10, Object obj, Object obj2) {
        this.f34678a = i10;
        this.f34679b = obj;
        this.f34680c = obj2;
    }

    @Override
    public final void run() {
        f60 f60Var;
        org.telegram.ui.cb cbVar;
        hh.t5 t5Var;
        int i10 = this.f34678a;
        int i11 = 4;
        int i12 = 5;
        int i13 = 3;
        Object[] objArr = 0;
        final int i14 = 1;
        Object obj = this.f34680c;
        Object obj2 = this.f34679b;
        switch (i10) {
            case 0:
                ar arVar = (ar) obj2;
                arVar.getClass();
                ((lh.d) obj).setLoading(false);
                arVar.dismiss();
                break;
            case 1:
                ar arVar2 = (ar) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    arVar2.X = groupcallstreamrtmpurl.url;
                    arVar2.Y = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(arVar2.Y);
                    arVar2.Z = spannableStringBuilder;
                    xz0 xz0Var = new xz0();
                    xz0Var.f34734a |= 256;
                    xz0Var.f34735b = 0;
                    xz0Var.f34736c = spannableStringBuilder.length();
                    arVar2.Z.setSpan(new yz0(xz0Var, 0), 0, arVar2.Z.length(), 0);
                    arVar2.f26809a0.N(false);
                    break;
                }
                break;
            case 2:
                es esVar = (es) obj2;
                TLObject tLObject2 = (TLObject) obj;
                bs bsVar = esVar.f28138b;
                ArrayList arrayList = esVar.h;
                int i15 = esVar.f28137a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i15).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i15).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList.addAll(popularappbots.users);
                    String str = popularappbots.next_offset;
                    esVar.f28142g = str;
                    esVar.f28140e = str == null;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    esVar.f28141f = jCurrentTimeMillis;
                    if (!esVar.f28143i) {
                        esVar.f28143i = true;
                        String str2 = esVar.f28142g;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        ArrayList arrayList2 = new ArrayList();
                        for (int iF = 0; iF < arrayList.size(); iF = com.google.android.recaptcha.internal.a.f(((TLRPC.User) arrayList.get(iF)).f22527id, arrayList2, iF, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i15);
                        messagesStorage.getStorageQueue().postRunnable(new gh.k1(esVar, messagesStorage, arrayList2, jCurrentTimeMillis, str3, 11));
                    }
                    esVar.f28139c = false;
                    bsVar.run();
                } else {
                    esVar.f28142g = null;
                    esVar.f28140e = true;
                    esVar.f28139c = false;
                    bsVar.run();
                }
                break;
            case 3:
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile((String) obj);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Paint paint = new Paint(3);
                canvas.translate(bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                float fMax = Math.max(bitmapCreateBitmap.getWidth() / bitmapDecodeFile.getWidth(), bitmapCreateBitmap.getHeight() / bitmapDecodeFile.getHeight());
                canvas.scale(fMax, fMax);
                canvas.drawBitmap(bitmapDecodeFile, (-bitmapDecodeFile.getWidth()) / 2.0f, (-bitmapDecodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new xq(i11, (at) obj2, bitmapDecodeFile));
                break;
            case 4:
                ((at) obj2).setImage((Bitmap) obj);
                break;
            case 5:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                break;
            case 6:
                MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) ((lu) obj2).f30465a).currentAccount).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 7:
                MessagesController.getInstance(((pw) obj2).f31672a.Y0).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 8:
                TLObject tLObject3 = (TLObject) obj;
                yy yyVar = ((pw) obj2).f31672a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(yyVar.Y0).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(yyVar.Y0).replaceStickerSet(tL_messages_stickerSet);
                }
                break;
            case 9:
                ox oxVar = (ox) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                oxVar.f31430s.f30208f = true;
                yy yyVar2 = oxVar.A;
                if (!yyVar2.l1.contains(Long.valueOf(tL_messages_stickerSet2.set.f22407id))) {
                    yyVar2.l1.add(Long.valueOf(tL_messages_stickerSet2.set.f22407id));
                }
                oxVar.a(true);
                break;
            case 10:
                final vx vxVar = (vx) obj2;
                final String str4 = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                yy yyVar3 = vxVar.f34062a.B;
                if (!Arrays.equals(yyVar3.S0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(yyVar3.Y0).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                yyVar3.S0 = currentKeyboardLanguage;
                ArrayList arrayList3 = new ArrayList();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                final Object[] objArr2 = objArr == true ? 1 : 0;
                Utilities.doCallbacks(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj3;
                        switch (objArr2) {
                            case 0:
                                vx vxVar2 = vxVar;
                                MediaDataController.getInstance(vxVar2.f34062a.B.Y0).searchStickerSets(true, str4, new gh.i(vxVar2, arrayList5, runnable, 9));
                                break;
                            default:
                                yy yyVar4 = vxVar.f34062a.B;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(yyVar4.Y0).isPremium()) {
                                    String strTranslitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i16 = yyVar4.Y0;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i16).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList5;
                                    if (stickerSets != null) {
                                        for (int i17 = 0; i17 < stickerSets.size(); i17++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i17);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f22407id))) {
                                                String strTranslitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (strTranslitSafe2.startsWith(strTranslitSafe) || org.telegram.messenger.y1.x(" ", strTranslitSafe, strTranslitSafe2)) {
                                                    arrayList8.add(new px(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f22407id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i16).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i18 = 0; i18 < featuredEmojiSets.size(); i18++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i18);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f22407id))) {
                                                String strTranslitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (strTranslitSafe3.startsWith(strTranslitSafe) || org.telegram.messenger.y1.x(" ", strTranslitSafe, strTranslitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i16).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList6 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new px(stickerSetCovered, arrayList6));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f22407id));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                runnable.run();
                                break;
                        }
                    }
                }, new org.telegram.ui.df(18, vxVar, str4), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj3;
                        switch (i14) {
                            case 0:
                                vx vxVar2 = vxVar;
                                MediaDataController.getInstance(vxVar2.f34062a.B.Y0).searchStickerSets(true, str4, new gh.i(vxVar2, arrayList4, runnable, 9));
                                break;
                            default:
                                yy yyVar4 = vxVar.f34062a.B;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(yyVar4.Y0).isPremium()) {
                                    String strTranslitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i16 = yyVar4.Y0;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i16).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList4;
                                    if (stickerSets != null) {
                                        for (int i17 = 0; i17 < stickerSets.size(); i17++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i17);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f22407id))) {
                                                String strTranslitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (strTranslitSafe2.startsWith(strTranslitSafe) || org.telegram.messenger.y1.x(" ", strTranslitSafe, strTranslitSafe2)) {
                                                    arrayList8.add(new px(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f22407id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i16).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i18 = 0; i18 < featuredEmojiSets.size(); i18++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i18);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f22407id))) {
                                                String strTranslitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (strTranslitSafe3.startsWith(strTranslitSafe) || org.telegram.messenger.y1.x(" ", strTranslitSafe, strTranslitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i16).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList6 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new px(stickerSetCovered, arrayList6));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f22407id));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                runnable.run();
                                break;
                        }
                    }
                }, new org.telegram.ui.df(19, vxVar, arrayList3), new hh.i2(vxVar, str4, arrayList3, arrayList4, arrayList5, 4));
                break;
            case 11:
                ArrayList arrayList6 = (ArrayList) obj;
                wx wxVar = ((vx) obj2).f34062a;
                wxVar.B.R.e(false);
                ArrayList arrayList7 = wxVar.f34358r;
                wxVar.A = arrayList7.size() >= arrayList6.size();
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                wxVar.l();
                break;
            case 12:
                ((cy) obj2).F((String) obj, "", true, false, false);
                break;
            case 13:
                cy cyVar = (cy) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                yy yyVar4 = cyVar.H;
                MessagesController.getInstance(yyVar4.Y0).putUsers(tL_contacts_resolvedPeer.users, false);
                int i16 = yyVar4.Y0;
                MessagesController.getInstance(i16).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i16).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str5 = cyVar.f27568w;
                cyVar.f27568w = null;
                cyVar.F(str5, "", false, false, false);
                break;
            case 14:
                jz jzVar = (jz) obj2;
                lh.y7 y7Var = (lh.y7) obj;
                jzVar.c();
                jzVar.h(y7Var);
                nz nzVar = jzVar.F;
                nzVar.f31084h1 = y7Var;
                nzVar.j();
                break;
            case 15:
                ((jz) obj2).F.f31079f1 = (mz) obj;
                break;
            case 16:
                ((q00) obj2).f31742v0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                break;
            case 17:
                ((org.telegram.ui.df) obj2).run((org.telegram.ui.ActionBar.n2) obj);
                break;
            case 18:
                j40 j40Var = (j40) obj2;
                Uri uri = (Uri) obj;
                j40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) j40Var.f29569a.getParentActivity();
                    if (launchActivity != null) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        org.telegram.ui.mp0 mp0Var = new org.telegram.ui.mp0(bundle);
                        mp0Var.f40578e = false;
                        mp0Var.f40579f = false;
                        mp0Var.f40577c = j40Var;
                        launchActivity.p0(mp0Var);
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                    j40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
                break;
            case 19:
                j50 j50Var = (j50) obj2;
                e50 e50Var = (e50) obj;
                k50 k50Var = j50Var.D0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                k50Var.J = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, k50Var.H);
                VideoEditedInfo videoEditedInfo2 = k50Var.J;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = k50Var.D;
                videoEditedInfo2.encryptedFile = k50Var.E;
                videoEditedInfo2.key = k50Var.F;
                videoEditedInfo2.iv = k50Var.G;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = j50Var.f29594a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = k50Var.J;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = k50Var.V0;
                videoEditedInfo3.estimatedDuration = k50Var.f29970b0;
                k50Var.V0 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, j50Var.f29594a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (e50Var != null) {
                    photoEntry.ttl = e50Var.f27953c;
                    photoEntry.effectId = e50Var.d;
                }
                k50Var.f29971c.s(photoEntry, k50Var.J, e50Var == null || e50Var.f27951a, e50Var != null ? e50Var.f27952b : 0, 0, false, e50Var != null ? e50Var.f27954e : 0L);
                break;
            case 20:
                Bitmap bitmap = (Bitmap) obj;
                j50 j50Var2 = (j50) ((m.i3) obj2).f17352b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && j50Var2.f29624w0.size() > 1) {
                    ArrayList arrayList8 = j50Var2.f29624w0;
                    arrayList8.add((Bitmap) i0.a.i(1, arrayList8));
                } else {
                    j50Var2.f29624w0.add(bitmap);
                }
                break;
            case 21:
                f60 f60Var2 = (f60) obj2;
                TLObject tLObject4 = (TLObject) obj;
                f60Var2.getClass();
                if (tLObject4 instanceof Vector) {
                    Vector vector = (Vector) tLObject4;
                    if (!vector.objects.isEmpty()) {
                        f60Var2.f28273c.put(Long.valueOf(f60Var2.f28271b.admin_id), (TLRPC.User) vector.objects.get(0));
                        f60Var2.P.l();
                        break;
                    }
                }
                break;
            case 22:
                z50 z50Var = (z50) obj2;
                if (((TLRPC.TL_error) obj) == null && (cbVar = (f60Var = z50Var.f35155a.f26642c).f28279f0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = f60Var.f28271b;
                    org.telegram.ui.qb qbVar = cbVar.f37041a;
                    ArrayList arrayList9 = qbVar.f41609o0;
                    int size = arrayList9.size();
                    int i17 = qbVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = qbVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(((org.telegram.ui.ActionBar.n2) qbVar).currentAccount, tL_channelAdminLogEvent, (ArrayList<MessageObject>) qbVar.f41608n0, (HashMap<String, ArrayList<MessageObject>>) qbVar.m0, qbVar.f41614s, qbVar.T, true).contentType >= 0) {
                        qbVar.R0();
                        int size2 = arrayList9.size() - size;
                        if (size2 > 0) {
                            qbVar.C0.N = true;
                            org.telegram.ui.mb mbVar = qbVar.E;
                            mbVar.s(mbVar.h, size2);
                            org.telegram.ui.qb.K0(qbVar);
                        }
                        qbVar.f41624y0.remove(tL_chatInviteExported.link);
                        break;
                    }
                }
                break;
            case 23:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((p60) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new p1(i13, editTextBoldCursor));
                break;
            case 24:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.xo) obj).presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 25:
                k80 k80Var = (k80) obj2;
                if (k80Var.K0 == ((q80) obj)) {
                    k80Var.performLongClick();
                    k80Var.K0 = null;
                    k80Var.I0.d(true);
                }
                break;
            case 26:
                ((m80) obj2).l((t80) obj, false);
                break;
            case 27:
                o90 o90Var = (o90) obj2;
                if (!((boolean[]) obj)[0] && (t5Var = o90Var.Q) != null) {
                    t5Var.run();
                }
                o90Var.Q = null;
                break;
            case 28:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((q90) obj2).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new p1(i12, editTextBoldCursor2));
                break;
            default:
                m5.o oVar = (m5.o) obj2;
                Runnable runnable = (Runnable) obj;
                oVar.getClass();
                runnable.run();
                ((HashMap) oVar.f17823b).remove(runnable);
                break;
        }
    }
}
