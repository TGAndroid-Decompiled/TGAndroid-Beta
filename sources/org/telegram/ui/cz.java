package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public class cz implements NotificationCenter.NotificationCenterDelegate {
    public static final HashSet L = new HashSet();
    public static final HashSet M;
    public i9.s E;
    public final FrameLayout G;
    public final org.telegram.ui.Components.xl0 H;
    public final long I;
    public final long J;
    public HashMap K;
    public final wn f32819a;
    public int f32820b;
    public TLRPC.TL_messages_stickerSet f32821c;
    public boolean f32823n;
    public String v;
    public aj f32828y;
    public boolean d = false;
    public final HashMap e = new HashMap();
    public final HashMap f32822f = new HashMap();
    public final Random h = new Random();
    public int f32824r = -1;
    public long f32825s = 0;
    public final ArrayList f32826w = new ArrayList();
    public final ArrayList f32827x = new ArrayList();
    public final ArrayList F = new ArrayList();

    static {
        HashSet hashSet = new HashSet();
        M = hashSet;
        hashSet.add("0⃣");
        hashSet.add("1⃣");
        hashSet.add("2⃣");
        hashSet.add("3⃣");
        hashSet.add("4⃣");
        hashSet.add("5⃣");
        hashSet.add("6⃣");
        hashSet.add("7⃣");
        hashSet.add("8⃣");
        hashSet.add("9⃣");
    }

    public cz(int i10, FrameLayout frameLayout) {
        this.G = frameLayout;
        this.f32820b = i10;
    }

    public static boolean a(org.telegram.ui.Cells.u1 u1Var, float f7, int i10) {
        float centerY = u1Var.getPhotoImage().getCenterY() + u1Var.getY();
        if (centerY > f7 && centerY < i10) {
            return true;
        }
        return false;
    }

    public static int f() {
        float min;
        float f7;
        if (AndroidUtilities.isTablet()) {
            min = AndroidUtilities.getMinTabletSide();
            f7 = 0.4f;
        } else {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f7 = 0.5f;
        }
        return (int) ((((int) (min * f7)) * 2.0f) / AndroidUtilities.density);
    }

    public static java.lang.String q(java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cz.q(java.lang.String):java.lang.String");
    }

    public final void b() {
        if (!this.d) {
            TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.f32820b).getStickerSetByName("EmojiAnimations");
            this.f32821c = stickerSetByName;
            if (stickerSetByName == null) {
                this.f32821c = MediaDataController.getInstance(this.f32820b).getStickerSetByEmojiOrName("EmojiAnimations");
            }
            if (this.f32821c == null) {
                MediaDataController.getInstance(this.f32820b).loadStickersByEmojiOrName("EmojiAnimations", false, true);
            }
            if (this.f32821c != null) {
                HashMap hashMap = new HashMap();
                for (int i10 = 0; i10 < this.f32821c.documents.size(); i10++) {
                    hashMap.put(Long.valueOf(this.f32821c.documents.get(i10).f18341id), this.f32821c.documents.get(i10));
                }
                for (int i11 = 0; i11 < this.f32821c.packs.size(); i11++) {
                    TLRPC.TL_stickerPack tL_stickerPack = this.f32821c.packs.get(i11);
                    if (!M.contains(tL_stickerPack.emoticon) && tL_stickerPack.documents.size() > 0) {
                        String str = tL_stickerPack.emoticon;
                        HashSet hashSet = L;
                        hashSet.add(str);
                        ArrayList arrayList = new ArrayList();
                        String str2 = tL_stickerPack.emoticon;
                        HashMap hashMap2 = this.e;
                        hashMap2.put(str2, arrayList);
                        for (int i12 = 0; i12 < tL_stickerPack.documents.size(); i12++) {
                            arrayList.add((TLRPC.Document) hashMap.get(tL_stickerPack.documents.get(i12)));
                        }
                        if (tL_stickerPack.emoticon.equals("❤")) {
                            String[] strArr = {"🧡", "💛", "💚", "💙", "💜", "🖤", "🤍", "🤎"};
                            for (int i13 = 0; i13 < 8; i13++) {
                                String str3 = strArr[i13];
                                hashSet.add(str3);
                                hashMap2.put(str3, arrayList);
                            }
                        }
                    }
                }
                this.d = true;
            }
        }
    }

    public final void c() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 < arrayList.size()) {
                ((bz) arrayList.get(i10)).f32525r.onDetachedFromWindow();
                if (((bz) arrayList.get(i10)).f32517j != null) {
                    ((bz) arrayList.get(i10)).f32517j.d(this.G);
                }
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final boolean d(String str, int i10, TLRPC.Document document, MessageObject messageObject, int i11, boolean z10, boolean z11, float f7, float f10, boolean z12) {
        boolean z13;
        boolean z14;
        Random random;
        long j3;
        TLRPC.Document document2;
        int intValue;
        Boolean bool;
        TLRPC.VideoSize premiumStickerAnimation;
        boolean z15;
        boolean z16;
        String str2;
        int intValue2;
        aj ajVar;
        int intValue3;
        String str3;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i12 = i11;
        if (messageObject != null && messageObject.isPremiumSticker()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (messageObject != null && messageObject.getEffect() != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14 || z13 || L.contains(str)) {
            ArrayList arrayList = (ArrayList) this.e.get(str);
            if (z14 || ((arrayList != null && !arrayList.isEmpty()) || z13)) {
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    ArrayList arrayList2 = this.F;
                    if (i13 < arrayList2.size()) {
                        if (((bz) arrayList2.get(i13)).f32523p == i10) {
                            i14++;
                            if (!z14 && (((bz) arrayList2.get(i13)).f32525r.getLottieAnimation() == null || ((bz) arrayList2.get(i13)).f32525r.getLottieAnimation().y())) {
                                return false;
                            }
                        }
                        if (((bz) arrayList2.get(i13)).f32524q != null && document != null) {
                            if (((bz) arrayList2.get(i13)).f32524q.f18341id == document.f18341id) {
                                i15++;
                            }
                        }
                        i13++;
                    } else if (z10 && z13 && i14 > 0) {
                        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f27628w;
                        if (qcVar != null && qcVar.f27630b == messageObject.getId()) {
                            return false;
                        }
                        TLRPC.InputStickerSet inputStickerSet = messageObject.getInputStickerSet();
                        if (inputStickerSet.short_name != null) {
                            tL_messages_stickerSet = MediaDataController.getInstance(this.f32820b).getStickerSetByName(inputStickerSet.short_name);
                        } else {
                            tL_messages_stickerSet = null;
                        }
                        if (tL_messages_stickerSet == null) {
                            tL_messages_stickerSet = MediaDataController.getInstance(this.f32820b).getStickerSetById(inputStickerSet.f18355id);
                        }
                        if (tL_messages_stickerSet == null) {
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = inputStickerSet;
                            ConnectionsManager.getInstance(this.f32820b).sendRequest(tL_messages_getStickerSet, new lo(18, this, messageObject));
                            return false;
                        }
                        p(tL_messages_stickerSet, messageObject);
                        return false;
                    } else if (i14 >= 4) {
                        return false;
                    } else {
                        Random random2 = this.h;
                        if (z14) {
                            TLRPC.TL_availableEffect effect = messageObject.getEffect();
                            TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.f32820b).getAvailableEffects();
                            if (availableEffects == null) {
                                return false;
                            }
                            j3 = 0;
                            long j10 = effect.effect_animation_id;
                            if (j10 == 0) {
                                j10 = effect.effect_sticker_id;
                            }
                            random = random2;
                            int i16 = 0;
                            while (true) {
                                if (i16 < availableEffects.documents.size()) {
                                    document2 = availableEffects.documents.get(i16);
                                    long j11 = j10;
                                    if (document2 != null && document2.f18341id == j11) {
                                        break;
                                    }
                                    i16++;
                                    j10 = j11;
                                } else {
                                    document2 = null;
                                    break;
                                }
                            }
                            if (document2 == null) {
                                return false;
                            }
                            if (effect.effect_sticker_id != 0) {
                                premiumStickerAnimation = MessageObject.getPremiumStickerAnimation(document2);
                                if (premiumStickerAnimation != null) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                            }
                            premiumStickerAnimation = null;
                        } else {
                            random = random2;
                            j3 = 0;
                            if (z13) {
                                document2 = messageObject.getDocument();
                                premiumStickerAnimation = messageObject.getPremiumStickerAnimation();
                            } else {
                                if (messageObject != null && messageObject.isAnimatedAnimatedEmoji()) {
                                    if (i12 >= 0 && i12 <= arrayList.size() - 1) {
                                        intValue = i12;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                            TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i17);
                                            if (document3 != null) {
                                                HashMap hashMap = this.K;
                                                if (hashMap != null) {
                                                    bool = (Boolean) hashMap.get(Long.valueOf(document3.f18341id));
                                                } else {
                                                    bool = null;
                                                }
                                                if (bool != null && bool.booleanValue()) {
                                                    arrayList3.add(Integer.valueOf(i17));
                                                }
                                            }
                                        }
                                        if (arrayList3.isEmpty()) {
                                            intValue = Math.abs(random.nextInt()) % arrayList.size();
                                        } else {
                                            intValue = ((Integer) arrayList3.get(Math.abs(random.nextInt()) % arrayList3.size())).intValue();
                                        }
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(intValue);
                                    i12 = intValue;
                                } else {
                                    if (i12 < 0 || i12 > arrayList.size() - 1) {
                                        i12 = Math.abs(random.nextInt()) % arrayList.size();
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(i12);
                                }
                                premiumStickerAnimation = null;
                            }
                        }
                        if (document2 == null && premiumStickerAnimation == null) {
                            return false;
                        }
                        bz bzVar = new bz();
                        bzVar.h = z13;
                        bzVar.f32516i = z14;
                        if (!z14) {
                            bzVar.f32514f = ((random.nextInt() % 101) / 100.0f) * (f7 / 4.0f);
                            bzVar.f32515g = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                        }
                        bzVar.f32523p = i10;
                        bzVar.f32524q = document2;
                        bzVar.f32520m = z12;
                        bzVar.f32525r.setAllowStartAnimation(true);
                        bzVar.f32525r.setAllowLottieVibration(z10);
                        if (SharedConfig.getDevicePerformanceClass() > 1 && BuildVars.DEBUG_VERSION) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        HashMap hashMap2 = this.f32822f;
                        int i18 = i12;
                        if (premiumStickerAnimation == null) {
                            int f11 = f();
                            z16 = z13;
                            boolean z17 = z15;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.f18341id));
                            if (num == null) {
                                intValue3 = 0;
                            } else {
                                intValue3 = num.intValue();
                            }
                            int i19 = intValue3 + 1;
                            hashMap2.put(Long.valueOf(document2.f18341id), Integer.valueOf(i19));
                            ImageLocation forDocument = ImageLocation.getForDocument(document2);
                            bzVar.f32525r.setUniqKeyPrefix(i19 + "_" + bzVar.f32523p + "_");
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(f11);
                            sb2.append("_");
                            sb2.append(f11);
                            if (!z17) {
                                str3 = "";
                            } else {
                                str3 = "_pcache";
                            }
                            sb2.append(str3);
                            bzVar.f32525r.setImage(forDocument, sb2.toString(), null, "tgs", this.f32821c, 1);
                            bzVar.f32525r.setDelegate(new az(this, bzVar, z10, messageObject));
                            if (bzVar.f32525r.getLottieAnimation() != null) {
                                bzVar.f32525r.getLottieAnimation().N(0, false, true);
                            }
                        } else {
                            z16 = z13;
                            boolean z18 = z15;
                            int f12 = f();
                            if (i15 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.f18341id));
                                if (num2 == null) {
                                    intValue2 = 0;
                                } else {
                                    intValue2 = num2.intValue();
                                }
                                hashMap2.put(Long.valueOf(document2.f18341id), Integer.valueOf((intValue2 + 1) % 4));
                                bzVar.f32525r.setUniqKeyPrefix(intValue2 + "_" + bzVar.f32523p + "_");
                            }
                            bzVar.f32524q = document2;
                            ImageLocation forDocument2 = ImageLocation.getForDocument(premiumStickerAnimation, document2);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(f12);
                            sb3.append("_");
                            sb3.append(f12);
                            if (!z18) {
                                str2 = "";
                            } else {
                                str2 = "_pcache";
                            }
                            sb3.append(str2);
                            bzVar.f32525r.setImage(forDocument2, sb3.toString(), null, "tgs", this.f32821c, 1);
                        }
                        bzVar.f32525r.setLayerNum(Integer.MAX_VALUE);
                        bzVar.f32525r.setAutoRepeat(0);
                        if (bzVar.f32525r.getLottieAnimation() != null) {
                            if (bzVar.h) {
                                bzVar.f32525r.getLottieAnimation().N(0, false, true);
                            }
                            bzVar.f32525r.getLottieAnimation().start();
                        }
                        arrayList2.add(bzVar);
                        bzVar.f32525r.onAttachedToWindow();
                        ImageReceiver imageReceiver = bzVar.f32525r;
                        FrameLayout frameLayout = this.G;
                        imageReceiver.setParentView(frameLayout);
                        frameLayout.invalidate();
                        if (z10 && !z16 && UserConfig.getInstance(this.f32820b).clientUserId != this.I) {
                            int i20 = this.f32824r;
                            if (i20 != 0 && i20 != i10 && (ajVar = this.f32828y) != null) {
                                AndroidUtilities.cancelRunOnUIThread(ajVar);
                                this.f32828y.run();
                            }
                            this.f32824r = i10;
                            this.v = str;
                            long j12 = this.f32825s;
                            ArrayList arrayList4 = this.f32827x;
                            ArrayList arrayList5 = this.f32826w;
                            if (j12 == j3) {
                                this.f32825s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j3));
                                arrayList4.add(Integer.valueOf(i18));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.f32825s));
                                arrayList4.add(Integer.valueOf(i18));
                            }
                            aj ajVar2 = this.f32828y;
                            if (ajVar2 != null) {
                                AndroidUtilities.cancelRunOnUIThread(ajVar2);
                                this.f32828y = null;
                            }
                            aj ajVar3 = new aj(this, 27);
                            this.f32828y = ajVar3;
                            AndroidUtilities.runOnUIThread(ajVar3, 500L);
                        }
                        if (z11) {
                            MessagesController.getInstance(this.f32820b).sendTyping(this.I, this.J, 11, str, 0);
                            return true;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Integer printingStringType;
        if (i10 == NotificationCenter.diceStickersDidLoad) {
            if ("EmojiAnimations".equals((String) objArr[0])) {
                b();
                return;
            }
            return;
        }
        int i12 = NotificationCenter.onEmojiInteractionsReceived;
        long j3 = this.I;
        if (i10 == i12) {
            if (this.f32819a != null) {
                long longValue = ((Long) objArr[0]).longValue();
                TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
                if (longValue == j3 && L.contains(tL_sendMessageEmojiInteraction.emoticon)) {
                    int i13 = tL_sendMessageEmojiInteraction.msg_id;
                    if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                        try {
                            JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i14);
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ed0(this, i13, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.updateInterfaces && (printingStringType = MessagesController.getInstance(this.f32820b).getPrintingStringType(j3, this.J)) != null && printingStringType.intValue() == 5) {
            i9.s sVar = this.E;
            if (sVar != null) {
                AndroidUtilities.cancelRunOnUIThread(sVar);
            }
            this.E = null;
        }
    }

    public final void e(Canvas canvas) {
        float f7;
        boolean z10;
        boolean z11;
        float f10;
        boolean z12;
        boolean z13;
        MessageObject messageObject;
        ImageReceiver imageReceiver;
        float f11;
        if (!this.F.isEmpty()) {
            int i10 = 0;
            while (i10 < this.F.size()) {
                bz bzVar = (bz) this.F.get(i10);
                float f12 = 3.0f;
                if (this.f32819a != null) {
                    bzVar.f32513c = false;
                    int i11 = 0;
                    while (true) {
                        if (i11 < this.H.getChildCount()) {
                            View childAt = this.H.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.u1) {
                                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                                messageObject = u1Var.getMessageObject();
                                imageReceiver = u1Var.getPhotoImage();
                            } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                                messageObject = w0Var.getMessageObject();
                                imageReceiver = w0Var.getPhotoImage();
                            } else {
                                messageObject = null;
                                imageReceiver = null;
                            }
                            if (messageObject != null && messageObject.getId() == bzVar.f32523p) {
                                bzVar.f32513c = true;
                                float x10 = childAt.getX() + this.H.getX();
                                float y3 = childAt.getY() + this.H.getY();
                                f10 = childAt.getY();
                                bzVar.d = imageReceiver.getImageWidth();
                                bzVar.e = imageReceiver.getImageHeight();
                                if (bzVar.f32516i && (childAt instanceof org.telegram.ui.Cells.u1)) {
                                    org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                                    float f13 = (f() * AndroidUtilities.density) / 1.3f;
                                    float f14 = f13 / f12;
                                    bzVar.d = f14;
                                    bzVar.e = f14;
                                    float timeX = u1Var2.getTimeX() + x10;
                                    float f15 = f13 / 2.0f;
                                    f7 = 3.0f;
                                    bzVar.f32511a = Utilities.clamp(timeX - f15, AndroidUtilities.displaySize.x - f13, 0.0f);
                                    bzVar.f32512b = (u1Var2.getTimeY() + y3) - f15;
                                } else {
                                    f7 = 3.0f;
                                    if (bzVar.h) {
                                        bzVar.f32511a = imageReceiver.getImageX() + x10;
                                        bzVar.f32512b = imageReceiver.getImageY() + y3;
                                    } else {
                                        float imageX = imageReceiver.getImageX() + x10;
                                        float imageY = imageReceiver.getImageY() + y3;
                                        if (bzVar.f32520m) {
                                            f11 = ((-imageReceiver.getImageWidth()) * 2.0f) + AndroidUtilities.dp(24.0f) + imageX;
                                        } else {
                                            f11 = (-AndroidUtilities.dp(24.0f)) + imageX;
                                        }
                                        bzVar.f32511a = f11;
                                        bzVar.f32512b = imageY - imageReceiver.getImageWidth();
                                    }
                                }
                            } else {
                                i11++;
                                f12 = 3.0f;
                            }
                        } else {
                            f7 = 3.0f;
                            f10 = 0.0f;
                            break;
                        }
                    }
                    if (!bzVar.f32513c || bzVar.e + f10 < this.f32819a.f39639s9 || f10 > this.H.getMeasuredHeight() - this.f32819a.Aa) {
                        bzVar.f32521n = true;
                    }
                    if (bzVar.h) {
                        float f16 = bzVar.e / 2.0f;
                        if (this.H.getMeasuredHeight() - f10 <= f16) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if ((f10 - this.f32819a.f39639s9) + f16 <= 0.0f) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            bzVar.f32521n = true;
                        }
                    }
                    if (bzVar.f32521n) {
                        float f17 = bzVar.f32522o;
                        if (f17 != 1.0f) {
                            float clamp = Utilities.clamp(f17 + 0.10666667f, 1.0f, 0.0f);
                            bzVar.f32522o = clamp;
                            bzVar.f32525r.setAlpha(1.0f - clamp);
                            this.f32819a.X0.invalidate();
                        }
                    }
                } else {
                    f7 = 3.0f;
                    h(bzVar);
                }
                if (!bzVar.f32519l && bzVar.f32521n) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (bzVar.h && !bzVar.f32516i) {
                        float f18 = bzVar.e;
                        float f19 = 1.49926f * f18;
                        float f20 = 0.0546875f * f19;
                        float f21 = (((f18 / 2.0f) + bzVar.f32512b) - (f19 / 2.0f)) - (0.00279f * f19);
                        if (!bzVar.f32520m) {
                            bzVar.f32525r.setImageCoords(bzVar.f32511a - f20, f21, f19, f19);
                        } else {
                            bzVar.f32525r.setImageCoords(((bzVar.f32511a + bzVar.d) - f19) + f20, f21, f19, f19);
                        }
                        if (!bzVar.f32520m) {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, bzVar.f32525r.getCenterX(), bzVar.f32525r.getCenterY());
                            bzVar.f32525r.draw(canvas);
                            canvas.restore();
                        } else {
                            bzVar.f32525r.draw(canvas);
                        }
                    } else {
                        zg.d dVar = bzVar.f32517j;
                        if (dVar != null) {
                            float f22 = bzVar.f32511a + bzVar.f32514f;
                            float f23 = bzVar.f32512b + bzVar.f32515g;
                            float f24 = bzVar.d * f7;
                            dVar.e((int) f22, (int) f23, (int) (f22 + f24), (int) (f23 + f24));
                            bzVar.f32517j.b(canvas);
                        } else {
                            ImageReceiver imageReceiver2 = bzVar.f32525r;
                            float f25 = bzVar.f32511a + bzVar.f32514f;
                            float f26 = bzVar.f32512b + bzVar.f32515g;
                            float f27 = bzVar.d * f7;
                            imageReceiver2.setImageCoords(f25, f26, f27, f27);
                            if (!bzVar.f32520m) {
                                canvas.save();
                                canvas.scale(-1.0f, 1.0f, bzVar.f32525r.getCenterX(), bzVar.f32525r.getCenterY());
                                bzVar.f32525r.draw(canvas);
                                canvas.restore();
                            } else {
                                bzVar.f32525r.draw(canvas);
                            }
                        }
                    }
                }
                zg.d dVar2 = bzVar.f32517j;
                if (dVar2 != null) {
                    z11 = dVar2.c();
                } else if (bzVar.f32519l && bzVar.f32525r.getLottieAnimation() != null && bzVar.f32525r.getLottieAnimation().f25422a0 >= bzVar.f32525r.getLottieAnimation().e[0] - 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (bzVar.f32522o != 1.0f && !z11 && !z10) {
                    if (bzVar.f32525r.getLottieAnimation() != null && bzVar.f32525r.getLottieAnimation().f25435k0) {
                        bzVar.f32519l = true;
                    } else if (bzVar.f32525r.getLottieAnimation() != null && !bzVar.f32525r.getLottieAnimation().f25435k0) {
                        bzVar.f32525r.getLottieAnimation().N(0, true, false);
                        bzVar.f32525r.getLottieAnimation().start();
                    }
                } else {
                    bz bzVar2 = (bz) this.F.remove(i10);
                    if (bzVar.h && bzVar.f32525r.getLottieAnimation() != null) {
                        bzVar2.f32525r.getLottieAnimation().N(0, true, true);
                    }
                    bzVar2.f32525r.onDetachedFromWindow();
                    zg.d dVar3 = bzVar2.f32517j;
                    if (dVar3 != null) {
                        dVar3.d(this.G);
                    }
                    i10--;
                }
                i10++;
            }
            if (this.F.isEmpty()) {
                i();
            }
            this.G.invalidate();
        }
    }

    public final boolean g() {
        return this.F.isEmpty();
    }

    public final void j() {
        this.f32823n = true;
        b();
        NotificationCenter.getInstance(this.f32820b).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.f32820b).addObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.f32820b).addObserver(this, NotificationCenter.updateInterfaces);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 < arrayList.size()) {
                ((bz) arrayList.get(i10)).f32525r.onAttachedToWindow();
                if (((bz) arrayList.get(i10)).f32517j != null) {
                    ((bz) arrayList.get(i10)).f32517j.f(this.G);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        int i10 = 0;
        this.f32823n = false;
        NotificationCenter.getInstance(this.f32820b).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.f32820b).removeObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.f32820b).removeObserver(this, NotificationCenter.updateInterfaces);
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 < arrayList.size()) {
                ((bz) arrayList.get(i10)).f32525r.onDetachedFromWindow();
                if (((bz) arrayList.get(i10)).f32517j != null) {
                    ((bz) arrayList.get(i10)).f32517j.d(this.G);
                }
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final void l(org.telegram.ui.Cells.u1 u1Var, wn wnVar, boolean z10) {
        TLRPC.Document emojiAnimatedSticker;
        if (!wnVar.v() && u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() >= 0) {
            if (u1Var.getMessageObject().isPremiumSticker() || wnVar.f39470f != null) {
                boolean o9 = o(u1Var, -1, z10, false);
                if (z10 && o9 && !EmojiData.hasEmojiSupportVibration(u1Var.getMessageObject().getStickerEmoji()) && !u1Var.getMessageObject().isPremiumSticker() && !u1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                    try {
                        u1Var.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                boolean isPremiumSticker = u1Var.getMessageObject().isPremiumSticker();
                long j3 = this.I;
                if (!isPremiumSticker && u1Var.getEffect() == null && (z10 || !u1Var.getMessageObject().isAnimatedEmojiStickerSingle())) {
                    Integer printingStringType = MessagesController.getInstance(this.f32820b).getPrintingStringType(j3, this.J);
                    if ((printingStringType == null || printingStringType.intValue() != 5) && this.E == null && o9) {
                        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f27628w;
                        if ((qcVar == null || !qcVar.f27637l) && SharedConfig.emojiInteractionsHintCount > 0 && UserConfig.getInstance(this.f32820b).getClientUserId() != wnVar.f39470f.f18482id) {
                            SharedConfig.updateEmojiInteractionsHintCount(SharedConfig.emojiInteractionsHintCount - 1);
                            if (u1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                                emojiAnimatedSticker = u1Var.getMessageObject().getDocument();
                            } else {
                                emojiAnimatedSticker = MediaDataController.getInstance(this.f32820b).getEmojiAnimatedSticker(u1Var.getMessageObject().getStickerEmoji());
                            }
                            org.telegram.ui.Components.lx0 lx0Var = new org.telegram.ui.Components.lx0(wnVar.getParentActivity(), null, 1, -1, emojiAnimatedSticker, wnVar.getResourceProvider());
                            lx0Var.f26355c.setVisibility(8);
                            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("EmojiInteractionTapHint", R.string.EmojiInteractionTapHint, wnVar.f39470f.first_name));
                            TextView textView = lx0Var.f26354b;
                            textView.setText(Emoji.replaceEmoji(replaceTags, textView.getPaint().getFontMetricsInt(), false));
                            textView.setTypeface(null);
                            textView.setMaxLines(3);
                            textView.setSingleLine(false);
                            i9.s sVar = new i9.s(this, org.telegram.ui.Components.qc.g(wnVar, lx0Var, 2750), false, 23);
                            this.E = sVar;
                            AndroidUtilities.runOnUIThread(sVar, 1500L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                u1Var.getMessageObject().forcePlayEffect = false;
                u1Var.getMessageObject().messageOwner.premiumEffectWasPlayed = true;
                wnVar.getMessagesStorage().updateMessageCustomParams(j3, u1Var.getMessageObject().messageOwner);
            }
        }
    }

    public final void m(TLRPC.Document document) {
        if (document != null) {
            HashMap hashMap = this.K;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(document.f18341id))) {
                return;
            }
            if (this.K == null) {
                this.K = new HashMap();
            }
            this.K.put(Long.valueOf(document.f18341id), Boolean.TRUE);
            MediaDataController.getInstance(this.f32820b).preloadImage(ImageLocation.getForDocument(document), 2);
        }
    }

    public final void n(org.telegram.ui.Cells.u1 u1Var) {
        ArrayList arrayList;
        MessageObject messageObject = u1Var.getMessageObject();
        if (!messageObject.isPremiumSticker()) {
            String stickerEmoji = messageObject.getStickerEmoji();
            if (stickerEmoji == null) {
                stickerEmoji = messageObject.messageOwner.message;
            }
            String q6 = q(stickerEmoji);
            if (L.contains(q6) && (arrayList = (ArrayList) this.e.get(q6)) != null && !arrayList.isEmpty()) {
                int min = Math.min(1, arrayList.size());
                for (int i10 = 0; i10 < min; i10++) {
                    m((TLRPC.Document) arrayList.get(i10));
                }
            }
        }
    }

    public final boolean o(org.telegram.ui.Cells.u1 u1Var, int i10, boolean z10, boolean z11) {
        if (u1Var != null && this.F.size() <= 12) {
            MessageObject messageObject = u1Var.getMessageObject();
            if (u1Var.getEffect() != null || u1Var.getPhotoImage().hasNotThumb()) {
                String stickerEmoji = messageObject.getStickerEmoji();
                if (stickerEmoji == null) {
                    stickerEmoji = messageObject.messageOwner.message;
                }
                if (u1Var.getEffect() != null || stickerEmoji != null) {
                    float imageHeight = u1Var.getPhotoImage().getImageHeight();
                    float imageWidth = u1Var.getPhotoImage().getImageWidth();
                    if (u1Var.getEffect() != null || (imageHeight > 0.0f && imageWidth > 0.0f)) {
                        return d(q(stickerEmoji), u1Var.getMessageObject().getId(), u1Var.getMessageObject().getDocument(), messageObject, i10, z10, z11, imageWidth, imageHeight, u1Var.getMessageObject().isOutOwner());
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void p(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, MessageObject messageObject) {
        wn wnVar = this.f32819a;
        if (wnVar != null && !MessagesController.getInstance(this.f32820b).premiumFeaturesBlocked() && wnVar.getParentActivity() != null) {
            org.telegram.ui.Components.lx0 lx0Var = new org.telegram.ui.Components.lx0(this.G.getContext(), null, 1, -1, messageObject.getDocument(), wnVar.getResourceProvider());
            lx0Var.f26354b.setText(tL_messages_stickerSet.set.title);
            lx0Var.f26355c.setText(LocaleController.getString(R.string.PremiumStickerTooltip));
            org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(wnVar.getParentActivity(), wnVar.getResourceProvider(), true);
            lx0Var.setButton(ocVar);
            ocVar.f27028a = new tt(11, this, messageObject);
            ocVar.e(LocaleController.getString(R.string.ViewAction));
            org.telegram.ui.Components.qc g10 = org.telegram.ui.Components.qc.g(wnVar, lx0Var, 2750);
            g10.f27630b = messageObject.getId();
            g10.j();
        }
    }

    public cz(wn wnVar, FrameLayout frameLayout, org.telegram.ui.Components.xl0 xl0Var, int i10, long j3, long j10) {
        this.f32819a = wnVar;
        this.G = frameLayout;
        this.H = xl0Var;
        this.f32820b = i10;
        this.I = j3;
        this.J = j10;
    }

    public void h(bz bzVar) {
    }

    public void i() {
    }
}
