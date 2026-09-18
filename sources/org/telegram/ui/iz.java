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
public class iz implements NotificationCenter.NotificationCenterDelegate {
    public static final HashSet L = new HashSet();
    public static final HashSet M;
    public i9.s E;
    public final FrameLayout G;
    public final org.telegram.ui.Components.ml0 H;
    public final long I;
    public final long J;
    public HashMap K;
    public final bo f34721a;
    public int f34722b;
    public TLRPC.TL_messages_stickerSet f34723c;
    public boolean f34725n;
    public String v;
    public ej f34730y;
    public boolean d = false;
    public final HashMap e = new HashMap();
    public final HashMap f34724f = new HashMap();
    public final Random h = new Random();
    public int f34726r = -1;
    public long f34727s = 0;
    public final ArrayList f34728w = new ArrayList();
    public final ArrayList f34729x = new ArrayList();
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

    public iz(int i10, FrameLayout frameLayout) {
        this.G = frameLayout;
        this.f34722b = i10;
    }

    public static boolean a(org.telegram.ui.Cells.t1 t1Var, float f7, int i10) {
        float centerY = t1Var.getPhotoImage().getCenterY() + t1Var.getY();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iz.q(java.lang.String):java.lang.String");
    }

    public final void b() {
        if (!this.d) {
            TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.f34722b).getStickerSetByName("EmojiAnimations");
            this.f34723c = stickerSetByName;
            if (stickerSetByName == null) {
                this.f34723c = MediaDataController.getInstance(this.f34722b).getStickerSetByEmojiOrName("EmojiAnimations");
            }
            if (this.f34723c == null) {
                MediaDataController.getInstance(this.f34722b).loadStickersByEmojiOrName("EmojiAnimations", false, true);
            }
            if (this.f34723c != null) {
                HashMap hashMap = new HashMap();
                for (int i10 = 0; i10 < this.f34723c.documents.size(); i10++) {
                    hashMap.put(Long.valueOf(this.f34723c.documents.get(i10).f18127id), this.f34723c.documents.get(i10));
                }
                for (int i11 = 0; i11 < this.f34723c.packs.size(); i11++) {
                    TLRPC.TL_stickerPack tL_stickerPack = this.f34723c.packs.get(i11);
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
                ((hz) arrayList.get(i10)).f34401r.onDetachedFromWindow();
                if (((hz) arrayList.get(i10)).f34393j != null) {
                    ((hz) arrayList.get(i10)).f34393j.d(this.G);
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
        ej ejVar;
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
                        if (((hz) arrayList2.get(i13)).f34399p == i10) {
                            i14++;
                            if (!z14 && (((hz) arrayList2.get(i13)).f34401r.getLottieAnimation() == null || ((hz) arrayList2.get(i13)).f34401r.getLottieAnimation().y())) {
                                return false;
                            }
                        }
                        if (((hz) arrayList2.get(i13)).f34400q != null && document != null) {
                            if (((hz) arrayList2.get(i13)).f34400q.f18127id == document.f18127id) {
                                i15++;
                            }
                        }
                        i13++;
                    } else if (z10 && z13 && i14 > 0) {
                        org.telegram.ui.Components.oc ocVar = org.telegram.ui.Components.oc.f26698w;
                        if (ocVar != null && ocVar.f26700b == messageObject.getId()) {
                            return false;
                        }
                        TLRPC.InputStickerSet inputStickerSet = messageObject.getInputStickerSet();
                        if (inputStickerSet.short_name != null) {
                            tL_messages_stickerSet = MediaDataController.getInstance(this.f34722b).getStickerSetByName(inputStickerSet.short_name);
                        } else {
                            tL_messages_stickerSet = null;
                        }
                        if (tL_messages_stickerSet == null) {
                            tL_messages_stickerSet = MediaDataController.getInstance(this.f34722b).getStickerSetById(inputStickerSet.f18141id);
                        }
                        if (tL_messages_stickerSet == null) {
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = inputStickerSet;
                            ConnectionsManager.getInstance(this.f34722b).sendRequest(tL_messages_getStickerSet, new qo(18, this, messageObject));
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
                            TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.f34722b).getAvailableEffects();
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
                                    if (document2 != null && document2.f18127id == j11) {
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
                                                    bool = (Boolean) hashMap.get(Long.valueOf(document3.f18127id));
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
                        hz hzVar = new hz();
                        hzVar.h = z13;
                        hzVar.f34392i = z14;
                        if (!z14) {
                            hzVar.f34390f = ((random.nextInt() % 101) / 100.0f) * (f7 / 4.0f);
                            hzVar.f34391g = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                        }
                        hzVar.f34399p = i10;
                        hzVar.f34400q = document2;
                        hzVar.f34396m = z12;
                        hzVar.f34401r.setAllowStartAnimation(true);
                        hzVar.f34401r.setAllowLottieVibration(z10);
                        if (SharedConfig.getDevicePerformanceClass() > 1 && BuildVars.DEBUG_VERSION) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        HashMap hashMap2 = this.f34724f;
                        int i18 = i12;
                        if (premiumStickerAnimation == null) {
                            int f11 = f();
                            z16 = z13;
                            boolean z17 = z15;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.f18127id));
                            if (num == null) {
                                intValue3 = 0;
                            } else {
                                intValue3 = num.intValue();
                            }
                            int i19 = intValue3 + 1;
                            hashMap2.put(Long.valueOf(document2.f18127id), Integer.valueOf(i19));
                            ImageLocation forDocument = ImageLocation.getForDocument(document2);
                            hzVar.f34401r.setUniqKeyPrefix(i19 + "_" + hzVar.f34399p + "_");
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
                            hzVar.f34401r.setImage(forDocument, sb2.toString(), null, "tgs", this.f34723c, 1);
                            hzVar.f34401r.setDelegate(new gz(this, hzVar, z10, messageObject));
                            if (hzVar.f34401r.getLottieAnimation() != null) {
                                hzVar.f34401r.getLottieAnimation().N(0, false, true);
                            }
                        } else {
                            z16 = z13;
                            boolean z18 = z15;
                            int f12 = f();
                            if (i15 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.f18127id));
                                if (num2 == null) {
                                    intValue2 = 0;
                                } else {
                                    intValue2 = num2.intValue();
                                }
                                hashMap2.put(Long.valueOf(document2.f18127id), Integer.valueOf((intValue2 + 1) % 4));
                                hzVar.f34401r.setUniqKeyPrefix(intValue2 + "_" + hzVar.f34399p + "_");
                            }
                            hzVar.f34400q = document2;
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
                            hzVar.f34401r.setImage(forDocument2, sb3.toString(), null, "tgs", this.f34723c, 1);
                        }
                        hzVar.f34401r.setLayerNum(Integer.MAX_VALUE);
                        hzVar.f34401r.setAutoRepeat(0);
                        if (hzVar.f34401r.getLottieAnimation() != null) {
                            if (hzVar.h) {
                                hzVar.f34401r.getLottieAnimation().N(0, false, true);
                            }
                            hzVar.f34401r.getLottieAnimation().start();
                        }
                        arrayList2.add(hzVar);
                        hzVar.f34401r.onAttachedToWindow();
                        ImageReceiver imageReceiver = hzVar.f34401r;
                        FrameLayout frameLayout = this.G;
                        imageReceiver.setParentView(frameLayout);
                        frameLayout.invalidate();
                        if (z10 && !z16 && UserConfig.getInstance(this.f34722b).clientUserId != this.I) {
                            int i20 = this.f34726r;
                            if (i20 != 0 && i20 != i10 && (ejVar = this.f34730y) != null) {
                                AndroidUtilities.cancelRunOnUIThread(ejVar);
                                this.f34730y.run();
                            }
                            this.f34726r = i10;
                            this.v = str;
                            long j12 = this.f34727s;
                            ArrayList arrayList4 = this.f34729x;
                            ArrayList arrayList5 = this.f34728w;
                            if (j12 == j3) {
                                this.f34727s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j3));
                                arrayList4.add(Integer.valueOf(i18));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.f34727s));
                                arrayList4.add(Integer.valueOf(i18));
                            }
                            ej ejVar2 = this.f34730y;
                            if (ejVar2 != null) {
                                AndroidUtilities.cancelRunOnUIThread(ejVar2);
                                this.f34730y = null;
                            }
                            ej ejVar3 = new ej(this, 27);
                            this.f34730y = ejVar3;
                            AndroidUtilities.runOnUIThread(ejVar3, 500L);
                        }
                        if (z11) {
                            MessagesController.getInstance(this.f34722b).sendTyping(this.I, this.J, 11, str, 0);
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
            if (this.f34721a != null) {
                long longValue = ((Long) objArr[0]).longValue();
                TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
                if (longValue == j3 && L.contains(tL_sendMessageEmojiInteraction.emoticon)) {
                    int i13 = tL_sendMessageEmojiInteraction.msg_id;
                    if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                        try {
                            JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i14);
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.tc0(this, i13, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.updateInterfaces && (printingStringType = MessagesController.getInstance(this.f34722b).getPrintingStringType(j3, this.J)) != null && printingStringType.intValue() == 5) {
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
                hz hzVar = (hz) this.F.get(i10);
                float f12 = 3.0f;
                if (this.f34721a != null) {
                    hzVar.f34389c = false;
                    int i11 = 0;
                    while (true) {
                        if (i11 < this.H.getChildCount()) {
                            View childAt = this.H.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.t1) {
                                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                                messageObject = t1Var.getMessageObject();
                                imageReceiver = t1Var.getPhotoImage();
                            } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                                messageObject = w0Var.getMessageObject();
                                imageReceiver = w0Var.getPhotoImage();
                            } else {
                                messageObject = null;
                                imageReceiver = null;
                            }
                            if (messageObject != null && messageObject.getId() == hzVar.f34399p) {
                                hzVar.f34389c = true;
                                float x10 = childAt.getX() + this.H.getX();
                                float y3 = childAt.getY() + this.H.getY();
                                f10 = childAt.getY();
                                hzVar.d = imageReceiver.getImageWidth();
                                hzVar.e = imageReceiver.getImageHeight();
                                if (hzVar.f34392i && (childAt instanceof org.telegram.ui.Cells.t1)) {
                                    org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                                    float f13 = (f() * AndroidUtilities.density) / 1.3f;
                                    float f14 = f13 / f12;
                                    hzVar.d = f14;
                                    hzVar.e = f14;
                                    float timeX = t1Var2.getTimeX() + x10;
                                    float f15 = f13 / 2.0f;
                                    f7 = 3.0f;
                                    hzVar.f34387a = Utilities.clamp(timeX - f15, AndroidUtilities.displaySize.x - f13, 0.0f);
                                    hzVar.f34388b = (t1Var2.getTimeY() + y3) - f15;
                                } else {
                                    f7 = 3.0f;
                                    if (hzVar.h) {
                                        hzVar.f34387a = imageReceiver.getImageX() + x10;
                                        hzVar.f34388b = imageReceiver.getImageY() + y3;
                                    } else {
                                        float imageX = imageReceiver.getImageX() + x10;
                                        float imageY = imageReceiver.getImageY() + y3;
                                        if (hzVar.f34396m) {
                                            f11 = ((-imageReceiver.getImageWidth()) * 2.0f) + AndroidUtilities.dp(24.0f) + imageX;
                                        } else {
                                            f11 = (-AndroidUtilities.dp(24.0f)) + imageX;
                                        }
                                        hzVar.f34387a = f11;
                                        hzVar.f34388b = imageY - imageReceiver.getImageWidth();
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
                    if (!hzVar.f34389c || hzVar.e + f10 < this.f34721a.f32451s9 || f10 > this.H.getMeasuredHeight() - this.f34721a.Aa) {
                        hzVar.f34397n = true;
                    }
                    if (hzVar.h) {
                        float f16 = hzVar.e / 2.0f;
                        if (this.H.getMeasuredHeight() - f10 <= f16) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if ((f10 - this.f34721a.f32451s9) + f16 <= 0.0f) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            hzVar.f34397n = true;
                        }
                    }
                    if (hzVar.f34397n) {
                        float f17 = hzVar.f34398o;
                        if (f17 != 1.0f) {
                            float clamp = Utilities.clamp(f17 + 0.10666667f, 1.0f, 0.0f);
                            hzVar.f34398o = clamp;
                            hzVar.f34401r.setAlpha(1.0f - clamp);
                            this.f34721a.X0.invalidate();
                        }
                    }
                } else {
                    f7 = 3.0f;
                    h(hzVar);
                }
                if (!hzVar.f34395l && hzVar.f34397n) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (hzVar.h && !hzVar.f34392i) {
                        float f18 = hzVar.e;
                        float f19 = 1.49926f * f18;
                        float f20 = 0.0546875f * f19;
                        float f21 = (((f18 / 2.0f) + hzVar.f34388b) - (f19 / 2.0f)) - (0.00279f * f19);
                        if (!hzVar.f34396m) {
                            hzVar.f34401r.setImageCoords(hzVar.f34387a - f20, f21, f19, f19);
                        } else {
                            hzVar.f34401r.setImageCoords(((hzVar.f34387a + hzVar.d) - f19) + f20, f21, f19, f19);
                        }
                        if (!hzVar.f34396m) {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, hzVar.f34401r.getCenterX(), hzVar.f34401r.getCenterY());
                            hzVar.f34401r.draw(canvas);
                            canvas.restore();
                        } else {
                            hzVar.f34401r.draw(canvas);
                        }
                    } else {
                        zg.d dVar = hzVar.f34393j;
                        if (dVar != null) {
                            float f22 = hzVar.f34387a + hzVar.f34390f;
                            float f23 = hzVar.f34388b + hzVar.f34391g;
                            float f24 = hzVar.d * f7;
                            dVar.e((int) f22, (int) f23, (int) (f22 + f24), (int) (f23 + f24));
                            hzVar.f34393j.b(canvas);
                        } else {
                            ImageReceiver imageReceiver2 = hzVar.f34401r;
                            float f25 = hzVar.f34387a + hzVar.f34390f;
                            float f26 = hzVar.f34388b + hzVar.f34391g;
                            float f27 = hzVar.d * f7;
                            imageReceiver2.setImageCoords(f25, f26, f27, f27);
                            if (!hzVar.f34396m) {
                                canvas.save();
                                canvas.scale(-1.0f, 1.0f, hzVar.f34401r.getCenterX(), hzVar.f34401r.getCenterY());
                                hzVar.f34401r.draw(canvas);
                                canvas.restore();
                            } else {
                                hzVar.f34401r.draw(canvas);
                            }
                        }
                    }
                }
                zg.d dVar2 = hzVar.f34393j;
                if (dVar2 != null) {
                    z11 = dVar2.c();
                } else if (hzVar.f34395l && hzVar.f34401r.getLottieAnimation() != null && hzVar.f34401r.getLottieAnimation().f30222a0 >= hzVar.f34401r.getLottieAnimation().e[0] - 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (hzVar.f34398o != 1.0f && !z11 && !z10) {
                    if (hzVar.f34401r.getLottieAnimation() != null && hzVar.f34401r.getLottieAnimation().f30235k0) {
                        hzVar.f34395l = true;
                    } else if (hzVar.f34401r.getLottieAnimation() != null && !hzVar.f34401r.getLottieAnimation().f30235k0) {
                        hzVar.f34401r.getLottieAnimation().N(0, true, false);
                        hzVar.f34401r.getLottieAnimation().start();
                    }
                } else {
                    hz hzVar2 = (hz) this.F.remove(i10);
                    if (hzVar.h && hzVar.f34401r.getLottieAnimation() != null) {
                        hzVar2.f34401r.getLottieAnimation().N(0, true, true);
                    }
                    hzVar2.f34401r.onDetachedFromWindow();
                    zg.d dVar3 = hzVar2.f34393j;
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
        this.f34725n = true;
        b();
        NotificationCenter.getInstance(this.f34722b).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.f34722b).addObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.f34722b).addObserver(this, NotificationCenter.updateInterfaces);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 < arrayList.size()) {
                ((hz) arrayList.get(i10)).f34401r.onAttachedToWindow();
                if (((hz) arrayList.get(i10)).f34393j != null) {
                    ((hz) arrayList.get(i10)).f34393j.f(this.G);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        int i10 = 0;
        this.f34725n = false;
        NotificationCenter.getInstance(this.f34722b).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.f34722b).removeObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.f34722b).removeObserver(this, NotificationCenter.updateInterfaces);
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 < arrayList.size()) {
                ((hz) arrayList.get(i10)).f34401r.onDetachedFromWindow();
                if (((hz) arrayList.get(i10)).f34393j != null) {
                    ((hz) arrayList.get(i10)).f34393j.d(this.G);
                }
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final void l(org.telegram.ui.Cells.t1 t1Var, bo boVar, boolean z10) {
        TLRPC.Document emojiAnimatedSticker;
        if (!boVar.v() && t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() >= 0) {
            if (t1Var.getMessageObject().isPremiumSticker() || boVar.f32281f != null) {
                boolean o9 = o(t1Var, -1, z10, false);
                if (z10 && o9 && !EmojiData.hasEmojiSupportVibration(t1Var.getMessageObject().getStickerEmoji()) && !t1Var.getMessageObject().isPremiumSticker() && !t1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                    try {
                        t1Var.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                boolean isPremiumSticker = t1Var.getMessageObject().isPremiumSticker();
                long j3 = this.I;
                if (!isPremiumSticker && t1Var.getEffect() == null && (z10 || !t1Var.getMessageObject().isAnimatedEmojiStickerSingle())) {
                    Integer printingStringType = MessagesController.getInstance(this.f34722b).getPrintingStringType(j3, this.J);
                    if ((printingStringType == null || printingStringType.intValue() != 5) && this.E == null && o9) {
                        org.telegram.ui.Components.oc ocVar = org.telegram.ui.Components.oc.f26698w;
                        if ((ocVar == null || !ocVar.f26707l) && SharedConfig.emojiInteractionsHintCount > 0 && UserConfig.getInstance(this.f34722b).getClientUserId() != boVar.f32281f.f18268id) {
                            SharedConfig.updateEmojiInteractionsHintCount(SharedConfig.emojiInteractionsHintCount - 1);
                            if (t1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                                emojiAnimatedSticker = t1Var.getMessageObject().getDocument();
                            } else {
                                emojiAnimatedSticker = MediaDataController.getInstance(this.f34722b).getEmojiAnimatedSticker(t1Var.getMessageObject().getStickerEmoji());
                            }
                            org.telegram.ui.Components.bx0 bx0Var = new org.telegram.ui.Components.bx0(boVar.getParentActivity(), null, 1, -1, emojiAnimatedSticker, boVar.getResourceProvider());
                            bx0Var.f25616c.setVisibility(8);
                            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("EmojiInteractionTapHint", R.string.EmojiInteractionTapHint, boVar.f32281f.first_name));
                            TextView textView = bx0Var.f25615b;
                            textView.setText(Emoji.replaceEmoji(replaceTags, textView.getPaint().getFontMetricsInt(), false));
                            textView.setTypeface(null);
                            textView.setMaxLines(3);
                            textView.setSingleLine(false);
                            i9.s sVar = new i9.s(this, org.telegram.ui.Components.oc.g(boVar, bx0Var, 2750), false, 23);
                            this.E = sVar;
                            AndroidUtilities.runOnUIThread(sVar, 1500L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                t1Var.getMessageObject().forcePlayEffect = false;
                t1Var.getMessageObject().messageOwner.premiumEffectWasPlayed = true;
                boVar.getMessagesStorage().updateMessageCustomParams(j3, t1Var.getMessageObject().messageOwner);
            }
        }
    }

    public final void m(TLRPC.Document document) {
        if (document != null) {
            HashMap hashMap = this.K;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(document.f18127id))) {
                return;
            }
            if (this.K == null) {
                this.K = new HashMap();
            }
            this.K.put(Long.valueOf(document.f18127id), Boolean.TRUE);
            MediaDataController.getInstance(this.f34722b).preloadImage(ImageLocation.getForDocument(document), 2);
        }
    }

    public final void n(org.telegram.ui.Cells.t1 t1Var) {
        ArrayList arrayList;
        MessageObject messageObject = t1Var.getMessageObject();
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

    public final boolean o(org.telegram.ui.Cells.t1 t1Var, int i10, boolean z10, boolean z11) {
        if (t1Var != null && this.F.size() <= 12) {
            MessageObject messageObject = t1Var.getMessageObject();
            if (t1Var.getEffect() != null || t1Var.getPhotoImage().hasNotThumb()) {
                String stickerEmoji = messageObject.getStickerEmoji();
                if (stickerEmoji == null) {
                    stickerEmoji = messageObject.messageOwner.message;
                }
                if (t1Var.getEffect() != null || stickerEmoji != null) {
                    float imageHeight = t1Var.getPhotoImage().getImageHeight();
                    float imageWidth = t1Var.getPhotoImage().getImageWidth();
                    if (t1Var.getEffect() != null || (imageHeight > 0.0f && imageWidth > 0.0f)) {
                        return d(q(stickerEmoji), t1Var.getMessageObject().getId(), t1Var.getMessageObject().getDocument(), messageObject, i10, z10, z11, imageWidth, imageHeight, t1Var.getMessageObject().isOutOwner());
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
        bo boVar = this.f34721a;
        if (boVar != null && !MessagesController.getInstance(this.f34722b).premiumFeaturesBlocked() && boVar.getParentActivity() != null) {
            org.telegram.ui.Components.bx0 bx0Var = new org.telegram.ui.Components.bx0(this.G.getContext(), null, 1, -1, messageObject.getDocument(), boVar.getResourceProvider());
            bx0Var.f25615b.setText(tL_messages_stickerSet.set.title);
            bx0Var.f25616c.setText(LocaleController.getString(R.string.PremiumStickerTooltip));
            org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc(boVar.getParentActivity(), boVar.getResourceProvider(), true);
            bx0Var.setButton(mcVar);
            mcVar.f26125a = new mw(6, this, messageObject);
            mcVar.e(LocaleController.getString(R.string.ViewAction));
            org.telegram.ui.Components.oc g10 = org.telegram.ui.Components.oc.g(boVar, bx0Var, 2750);
            g10.f26700b = messageObject.getId();
            g10.j();
        }
    }

    public iz(bo boVar, FrameLayout frameLayout, org.telegram.ui.Components.ml0 ml0Var, int i10, long j3, long j10) {
        this.f34721a = boVar;
        this.G = frameLayout;
        this.H = ml0Var;
        this.f34722b = i10;
        this.I = j3;
        this.J = j10;
    }

    public void h(hz hzVar) {
    }

    public void i() {
    }
}
