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
public class fz implements NotificationCenter.NotificationCenterDelegate {
    public static final HashSet L = new HashSet();
    public static final HashSet M;
    public i9.s E;
    public final FrameLayout G;
    public final org.telegram.ui.Components.rm0 H;
    public final long I;
    public final long J;
    public HashMap K;
    public final zn f37763a;
    public int f37764b;
    public TLRPC.TL_messages_stickerSet f37765c;
    public boolean f37768n;
    public String v;
    public cj f37773y;
    public boolean d = false;
    public final HashMap f37766e = new HashMap();
    public final HashMap f37767f = new HashMap();
    public final Random h = new Random();
    public int f37769r = -1;
    public long f37770s = 0;
    public final ArrayList f37771w = new ArrayList();
    public final ArrayList f37772x = new ArrayList();
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

    public fz(int i10, FrameLayout frameLayout) {
        this.G = frameLayout;
        this.f37764b = i10;
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

    public static java.lang.String p(java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fz.p(java.lang.String):java.lang.String");
    }

    public final void b() {
        if (!this.d) {
            TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.f37764b).getStickerSetByName("EmojiAnimations");
            this.f37765c = stickerSetByName;
            if (stickerSetByName == null) {
                this.f37765c = MediaDataController.getInstance(this.f37764b).getStickerSetByEmojiOrName("EmojiAnimations");
            }
            if (this.f37765c == null) {
                MediaDataController.getInstance(this.f37764b).loadStickersByEmojiOrName("EmojiAnimations", false, true);
            }
            if (this.f37765c != null) {
                HashMap hashMap = new HashMap();
                for (int i10 = 0; i10 < this.f37765c.documents.size(); i10++) {
                    hashMap.put(Long.valueOf(this.f37765c.documents.get(i10).f20048id), this.f37765c.documents.get(i10));
                }
                for (int i11 = 0; i11 < this.f37765c.packs.size(); i11++) {
                    TLRPC.TL_stickerPack tL_stickerPack = this.f37765c.packs.get(i11);
                    if (!M.contains(tL_stickerPack.emoticon) && tL_stickerPack.documents.size() > 0) {
                        String str = tL_stickerPack.emoticon;
                        HashSet hashSet = L;
                        hashSet.add(str);
                        ArrayList arrayList = new ArrayList();
                        String str2 = tL_stickerPack.emoticon;
                        HashMap hashMap2 = this.f37766e;
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
                ((ez) arrayList.get(i10)).f37446r.onDetachedFromWindow();
                if (((ez) arrayList.get(i10)).f37438j != null) {
                    ((ez) arrayList.get(i10)).f37438j.d(this.G);
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
        cj cjVar;
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
            ArrayList arrayList = (ArrayList) this.f37766e.get(str);
            if (z14 || ((arrayList != null && !arrayList.isEmpty()) || z13)) {
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    ArrayList arrayList2 = this.F;
                    if (i13 < arrayList2.size()) {
                        if (((ez) arrayList2.get(i13)).f37444p == i10) {
                            i14++;
                            if (!z14 && (((ez) arrayList2.get(i13)).f37446r.getLottieAnimation() == null || ((ez) arrayList2.get(i13)).f37446r.getLottieAnimation().y())) {
                                return false;
                            }
                        }
                        if (((ez) arrayList2.get(i13)).f37445q != null && document != null) {
                            if (((ez) arrayList2.get(i13)).f37445q.f20048id == document.f20048id) {
                                i15++;
                            }
                        }
                        i13++;
                    } else if (z10 && z13 && i14 > 0) {
                        org.telegram.ui.Components.tc tcVar = org.telegram.ui.Components.tc.f31088w;
                        if (tcVar != null && tcVar.f31090b == messageObject.getId()) {
                            return false;
                        }
                        TLRPC.InputStickerSet inputStickerSet = messageObject.getInputStickerSet();
                        if (inputStickerSet.short_name != null) {
                            tL_messages_stickerSet = MediaDataController.getInstance(this.f37764b).getStickerSetByName(inputStickerSet.short_name);
                        } else {
                            tL_messages_stickerSet = null;
                        }
                        if (tL_messages_stickerSet == null) {
                            tL_messages_stickerSet = MediaDataController.getInstance(this.f37764b).getStickerSetById(inputStickerSet.f20062id);
                        }
                        if (tL_messages_stickerSet == null) {
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = inputStickerSet;
                            ConnectionsManager.getInstance(this.f37764b).sendRequest(tL_messages_getStickerSet, new oo(18, this, messageObject));
                            return false;
                        }
                        o(tL_messages_stickerSet, messageObject);
                        return false;
                    } else if (i14 >= 4) {
                        return false;
                    } else {
                        Random random2 = this.h;
                        if (z14) {
                            TLRPC.TL_availableEffect effect = messageObject.getEffect();
                            TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.f37764b).getAvailableEffects();
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
                                    if (document2 != null && document2.f20048id == j11) {
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
                                                    bool = (Boolean) hashMap.get(Long.valueOf(document3.f20048id));
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
                        ez ezVar = new ez();
                        ezVar.h = z13;
                        ezVar.f37437i = z14;
                        if (!z14) {
                            ezVar.f37435f = ((random.nextInt() % 101) / 100.0f) * (f7 / 4.0f);
                            ezVar.f37436g = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                        }
                        ezVar.f37444p = i10;
                        ezVar.f37445q = document2;
                        ezVar.f37441m = z12;
                        ezVar.f37446r.setAllowStartAnimation(true);
                        ezVar.f37446r.setAllowLottieVibration(z10);
                        if (SharedConfig.getDevicePerformanceClass() > 1 && BuildVars.DEBUG_VERSION) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        HashMap hashMap2 = this.f37767f;
                        int i18 = i12;
                        if (premiumStickerAnimation == null) {
                            int f11 = f();
                            z16 = z13;
                            boolean z17 = z15;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.f20048id));
                            if (num == null) {
                                intValue3 = 0;
                            } else {
                                intValue3 = num.intValue();
                            }
                            int i19 = intValue3 + 1;
                            hashMap2.put(Long.valueOf(document2.f20048id), Integer.valueOf(i19));
                            ImageLocation forDocument = ImageLocation.getForDocument(document2);
                            ezVar.f37446r.setUniqKeyPrefix(i19 + "_" + ezVar.f37444p + "_");
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
                            ezVar.f37446r.setImage(forDocument, sb2.toString(), null, "tgs", this.f37765c, 1);
                            ezVar.f37446r.setDelegate(new dz(this, ezVar, z10, messageObject));
                            if (ezVar.f37446r.getLottieAnimation() != null) {
                                ezVar.f37446r.getLottieAnimation().N(0, false, true);
                            }
                        } else {
                            z16 = z13;
                            boolean z18 = z15;
                            int f12 = f();
                            if (i15 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.f20048id));
                                if (num2 == null) {
                                    intValue2 = 0;
                                } else {
                                    intValue2 = num2.intValue();
                                }
                                hashMap2.put(Long.valueOf(document2.f20048id), Integer.valueOf((intValue2 + 1) % 4));
                                ezVar.f37446r.setUniqKeyPrefix(intValue2 + "_" + ezVar.f37444p + "_");
                            }
                            ezVar.f37445q = document2;
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
                            ezVar.f37446r.setImage(forDocument2, sb3.toString(), null, "tgs", this.f37765c, 1);
                        }
                        ezVar.f37446r.setLayerNum(Integer.MAX_VALUE);
                        ezVar.f37446r.setAutoRepeat(0);
                        if (ezVar.f37446r.getLottieAnimation() != null) {
                            if (ezVar.h) {
                                ezVar.f37446r.getLottieAnimation().N(0, false, true);
                            }
                            ezVar.f37446r.getLottieAnimation().start();
                        }
                        arrayList2.add(ezVar);
                        ezVar.f37446r.onAttachedToWindow();
                        ImageReceiver imageReceiver = ezVar.f37446r;
                        FrameLayout frameLayout = this.G;
                        imageReceiver.setParentView(frameLayout);
                        frameLayout.invalidate();
                        if (z10 && !z16 && UserConfig.getInstance(this.f37764b).clientUserId != this.I) {
                            int i20 = this.f37769r;
                            if (i20 != 0 && i20 != i10 && (cjVar = this.f37773y) != null) {
                                AndroidUtilities.cancelRunOnUIThread(cjVar);
                                this.f37773y.run();
                            }
                            this.f37769r = i10;
                            this.v = str;
                            int i21 = (this.f37770s > j3 ? 1 : (this.f37770s == j3 ? 0 : -1));
                            ArrayList arrayList4 = this.f37772x;
                            ArrayList arrayList5 = this.f37771w;
                            if (i21 == 0) {
                                this.f37770s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j3));
                                arrayList4.add(Integer.valueOf(i18));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.f37770s));
                                arrayList4.add(Integer.valueOf(i18));
                            }
                            cj cjVar2 = this.f37773y;
                            if (cjVar2 != null) {
                                AndroidUtilities.cancelRunOnUIThread(cjVar2);
                                this.f37773y = null;
                            }
                            cj cjVar3 = new cj(this, 28);
                            this.f37773y = cjVar3;
                            AndroidUtilities.runOnUIThread(cjVar3, 500L);
                        }
                        if (z11) {
                            MessagesController.getInstance(this.f37764b).sendTyping(this.I, this.J, 11, str, 0);
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
            if (this.f37763a != null) {
                long longValue = ((Long) objArr[0]).longValue();
                TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
                if (longValue == j3 && L.contains(tL_sendMessageEmojiInteraction.emoticon)) {
                    int i13 = tL_sendMessageEmojiInteraction.msg_id;
                    if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                        try {
                            JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i14);
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ud0(this, i13, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                            }
                        } catch (JSONException e7) {
                            e7.printStackTrace();
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.updateInterfaces && (printingStringType = MessagesController.getInstance(this.f37764b).getPrintingStringType(j3, this.J)) != null && printingStringType.intValue() == 5) {
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
                ez ezVar = (ez) this.F.get(i10);
                float f12 = 3.0f;
                if (this.f37763a != null) {
                    ezVar.f37433c = false;
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
                            if (messageObject != null && messageObject.getId() == ezVar.f37444p) {
                                ezVar.f37433c = true;
                                float x10 = childAt.getX() + this.H.getX();
                                float y3 = childAt.getY() + this.H.getY();
                                f10 = childAt.getY();
                                ezVar.d = imageReceiver.getImageWidth();
                                ezVar.f37434e = imageReceiver.getImageHeight();
                                if (ezVar.f37437i && (childAt instanceof org.telegram.ui.Cells.u1)) {
                                    org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                                    float f13 = (f() * AndroidUtilities.density) / 1.3f;
                                    float f14 = f13 / f12;
                                    ezVar.d = f14;
                                    ezVar.f37434e = f14;
                                    float timeX = u1Var2.getTimeX() + x10;
                                    float f15 = f13 / 2.0f;
                                    f7 = f12;
                                    ezVar.f37431a = Utilities.clamp(timeX - f15, AndroidUtilities.displaySize.x - f13, 0.0f);
                                    ezVar.f37432b = (u1Var2.getTimeY() + y3) - f15;
                                } else {
                                    f7 = f12;
                                    if (ezVar.h) {
                                        ezVar.f37431a = imageReceiver.getImageX() + x10;
                                        ezVar.f37432b = imageReceiver.getImageY() + y3;
                                    } else {
                                        float imageX = imageReceiver.getImageX() + x10;
                                        float imageY = imageReceiver.getImageY() + y3;
                                        if (ezVar.f37441m) {
                                            f11 = ((-imageReceiver.getImageWidth()) * 2.0f) + AndroidUtilities.dp(24.0f) + imageX;
                                        } else {
                                            f11 = (-AndroidUtilities.dp(24.0f)) + imageX;
                                        }
                                        ezVar.f37431a = f11;
                                        ezVar.f37432b = imageY - imageReceiver.getImageWidth();
                                    }
                                }
                            } else {
                                i11++;
                                f12 = f12;
                            }
                        } else {
                            f7 = f12;
                            f10 = 0.0f;
                            break;
                        }
                    }
                    if (!ezVar.f37433c || ezVar.f37434e + f10 < this.f37763a.f44978s9 || f10 > this.H.getMeasuredHeight() - this.f37763a.Ba) {
                        ezVar.f37442n = true;
                    }
                    if (ezVar.h) {
                        float f16 = ezVar.f37434e / 2.0f;
                        if (this.H.getMeasuredHeight() - f10 <= f16) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if ((f10 - this.f37763a.f44978s9) + f16 <= 0.0f) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            ezVar.f37442n = true;
                        }
                    }
                    if (ezVar.f37442n) {
                        float f17 = ezVar.f37443o;
                        if (f17 != 1.0f) {
                            float clamp = Utilities.clamp(f17 + 0.10666667f, 1.0f, 0.0f);
                            ezVar.f37443o = clamp;
                            ezVar.f37446r.setAlpha(1.0f - clamp);
                            this.f37763a.X0.invalidate();
                        }
                    }
                } else {
                    f7 = 3.0f;
                    g(ezVar);
                }
                if (!ezVar.f37440l && ezVar.f37442n) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (ezVar.h && !ezVar.f37437i) {
                        float f18 = ezVar.f37434e;
                        float f19 = 1.49926f * f18;
                        float f20 = 0.0546875f * f19;
                        float f21 = (((f18 / 2.0f) + ezVar.f37432b) - (f19 / 2.0f)) - (0.00279f * f19);
                        if (!ezVar.f37441m) {
                            ezVar.f37446r.setImageCoords(ezVar.f37431a - f20, f21, f19, f19);
                        } else {
                            ezVar.f37446r.setImageCoords(((ezVar.f37431a + ezVar.d) - f19) + f20, f21, f19, f19);
                        }
                        if (!ezVar.f37441m) {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, ezVar.f37446r.getCenterX(), ezVar.f37446r.getCenterY());
                            ezVar.f37446r.draw(canvas);
                            canvas.restore();
                        } else {
                            ezVar.f37446r.draw(canvas);
                        }
                    } else {
                        zg.d dVar = ezVar.f37438j;
                        if (dVar != null) {
                            float f22 = ezVar.f37431a + ezVar.f37435f;
                            float f23 = ezVar.f37432b + ezVar.f37436g;
                            float f24 = ezVar.d * f7;
                            dVar.e((int) f22, (int) f23, (int) (f22 + f24), (int) (f23 + f24));
                            ezVar.f37438j.b(canvas);
                        } else {
                            ImageReceiver imageReceiver2 = ezVar.f37446r;
                            float f25 = ezVar.f37431a + ezVar.f37435f;
                            float f26 = ezVar.f37432b + ezVar.f37436g;
                            float f27 = ezVar.d * f7;
                            imageReceiver2.setImageCoords(f25, f26, f27, f27);
                            if (!ezVar.f37441m) {
                                canvas.save();
                                canvas.scale(-1.0f, 1.0f, ezVar.f37446r.getCenterX(), ezVar.f37446r.getCenterY());
                                ezVar.f37446r.draw(canvas);
                                canvas.restore();
                            } else {
                                ezVar.f37446r.draw(canvas);
                            }
                        }
                    }
                }
                zg.d dVar2 = ezVar.f37438j;
                if (dVar2 != null) {
                    z11 = dVar2.c();
                } else if (ezVar.f37440l && ezVar.f37446r.getLottieAnimation() != null && ezVar.f37446r.getLottieAnimation().f25726a0 >= ezVar.f37446r.getLottieAnimation().f25732e[0] - 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (ezVar.f37443o != 1.0f && !z11 && !z10) {
                    if (ezVar.f37446r.getLottieAnimation() != null && ezVar.f37446r.getLottieAnimation().f25740k0) {
                        ezVar.f37440l = true;
                    } else if (ezVar.f37446r.getLottieAnimation() != null && !ezVar.f37446r.getLottieAnimation().f25740k0) {
                        ezVar.f37446r.getLottieAnimation().N(0, true, false);
                        ezVar.f37446r.getLottieAnimation().start();
                    }
                } else {
                    ez ezVar2 = (ez) this.F.remove(i10);
                    if (ezVar.h && ezVar.f37446r.getLottieAnimation() != null) {
                        ezVar2.f37446r.getLottieAnimation().N(0, true, true);
                    }
                    ezVar2.f37446r.onDetachedFromWindow();
                    zg.d dVar3 = ezVar2.f37438j;
                    if (dVar3 != null) {
                        dVar3.d(this.G);
                    }
                    i10--;
                }
                i10++;
            }
            if (this.F.isEmpty()) {
                h();
            }
            this.G.invalidate();
        }
    }

    public final void i() {
        this.f37768n = true;
        b();
        NotificationCenter.getInstance(this.f37764b).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.f37764b).addObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.f37764b).addObserver(this, NotificationCenter.updateInterfaces);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 < arrayList.size()) {
                ((ez) arrayList.get(i10)).f37446r.onAttachedToWindow();
                if (((ez) arrayList.get(i10)).f37438j != null) {
                    ((ez) arrayList.get(i10)).f37438j.f(this.G);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void j() {
        int i10 = 0;
        this.f37768n = false;
        NotificationCenter.getInstance(this.f37764b).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.f37764b).removeObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.f37764b).removeObserver(this, NotificationCenter.updateInterfaces);
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 < arrayList.size()) {
                ((ez) arrayList.get(i10)).f37446r.onDetachedFromWindow();
                if (((ez) arrayList.get(i10)).f37438j != null) {
                    ((ez) arrayList.get(i10)).f37438j.d(this.G);
                }
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final void k(org.telegram.ui.Cells.u1 u1Var, zn znVar, boolean z10) {
        TLRPC.Document emojiAnimatedSticker;
        if (!znVar.v() && u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() >= 0) {
            if (u1Var.getMessageObject().isPremiumSticker() || znVar.f44809f != null) {
                boolean n10 = n(u1Var, -1, z10, false);
                if (z10 && n10 && !EmojiData.hasEmojiSupportVibration(u1Var.getMessageObject().getStickerEmoji()) && !u1Var.getMessageObject().isPremiumSticker() && !u1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                    try {
                        u1Var.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                boolean isPremiumSticker = u1Var.getMessageObject().isPremiumSticker();
                long j3 = this.I;
                if (!isPremiumSticker && u1Var.getEffect() == null && (z10 || !u1Var.getMessageObject().isAnimatedEmojiStickerSingle())) {
                    Integer printingStringType = MessagesController.getInstance(this.f37764b).getPrintingStringType(j3, this.J);
                    if ((printingStringType == null || printingStringType.intValue() != 5) && this.E == null && n10) {
                        org.telegram.ui.Components.tc tcVar = org.telegram.ui.Components.tc.f31088w;
                        if ((tcVar == null || !tcVar.f31098l) && SharedConfig.emojiInteractionsHintCount > 0 && UserConfig.getInstance(this.f37764b).getClientUserId() != znVar.f44809f.f20189id) {
                            SharedConfig.updateEmojiInteractionsHintCount(SharedConfig.emojiInteractionsHintCount - 1);
                            if (u1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                                emojiAnimatedSticker = u1Var.getMessageObject().getDocument();
                            } else {
                                emojiAnimatedSticker = MediaDataController.getInstance(this.f37764b).getEmojiAnimatedSticker(u1Var.getMessageObject().getStickerEmoji());
                            }
                            org.telegram.ui.Components.dy0 dy0Var = new org.telegram.ui.Components.dy0(znVar.getParentActivity(), null, 1, -1, emojiAnimatedSticker, znVar.getResourceProvider());
                            dy0Var.f29756c.setVisibility(8);
                            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("EmojiInteractionTapHint", R.string.EmojiInteractionTapHint, znVar.f44809f.first_name));
                            TextView textView = dy0Var.f29755b;
                            textView.setText(Emoji.replaceEmoji(replaceTags, textView.getPaint().getFontMetricsInt(), false));
                            textView.setTypeface(null);
                            textView.setMaxLines(3);
                            textView.setSingleLine(false);
                            i9.s sVar = new i9.s(this, org.telegram.ui.Components.tc.g(znVar, dy0Var, 2750), false, 24);
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
                znVar.getMessagesStorage().updateMessageCustomParams(j3, u1Var.getMessageObject().messageOwner);
            }
        }
    }

    public final void l(TLRPC.Document document) {
        if (document != null) {
            HashMap hashMap = this.K;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(document.f20048id))) {
                return;
            }
            if (this.K == null) {
                this.K = new HashMap();
            }
            this.K.put(Long.valueOf(document.f20048id), Boolean.TRUE);
            MediaDataController.getInstance(this.f37764b).preloadImage(ImageLocation.getForDocument(document), 2);
        }
    }

    public final void m(org.telegram.ui.Cells.u1 u1Var) {
        ArrayList arrayList;
        MessageObject messageObject = u1Var.getMessageObject();
        if (!messageObject.isPremiumSticker()) {
            String stickerEmoji = messageObject.getStickerEmoji();
            if (stickerEmoji == null) {
                stickerEmoji = messageObject.messageOwner.message;
            }
            String p5 = p(stickerEmoji);
            if (L.contains(p5) && (arrayList = (ArrayList) this.f37766e.get(p5)) != null && !arrayList.isEmpty()) {
                int min = Math.min(1, arrayList.size());
                for (int i10 = 0; i10 < min; i10++) {
                    l((TLRPC.Document) arrayList.get(i10));
                }
            }
        }
    }

    public final boolean n(org.telegram.ui.Cells.u1 u1Var, int i10, boolean z10, boolean z11) {
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
                        return d(p(stickerEmoji), u1Var.getMessageObject().getId(), u1Var.getMessageObject().getDocument(), messageObject, i10, z10, z11, imageWidth, imageHeight, u1Var.getMessageObject().isOutOwner());
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void o(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, MessageObject messageObject) {
        zn znVar = this.f37763a;
        if (znVar != null && !MessagesController.getInstance(this.f37764b).premiumFeaturesBlocked() && znVar.getParentActivity() != null) {
            org.telegram.ui.Components.dy0 dy0Var = new org.telegram.ui.Components.dy0(this.G.getContext(), null, 1, -1, messageObject.getDocument(), znVar.getResourceProvider());
            dy0Var.f29755b.setText(tL_messages_stickerSet.set.title);
            dy0Var.f29756c.setText(LocaleController.getString(R.string.PremiumStickerTooltip));
            org.telegram.ui.Components.rc rcVar = new org.telegram.ui.Components.rc(znVar.getParentActivity(), znVar.getResourceProvider(), true);
            dy0Var.setButton(rcVar);
            rcVar.f30443a = new org.telegram.ui.Components.fa1(17, this, messageObject);
            rcVar.e(LocaleController.getString(R.string.ViewAction));
            org.telegram.ui.Components.tc g10 = org.telegram.ui.Components.tc.g(znVar, dy0Var, 2750);
            g10.f31090b = messageObject.getId();
            g10.j();
        }
    }

    public fz(zn znVar, FrameLayout frameLayout, org.telegram.ui.Components.rm0 rm0Var, int i10, long j3, long j10) {
        this.f37763a = znVar;
        this.G = frameLayout;
        this.H = rm0Var;
        this.f37764b = i10;
        this.I = j3;
        this.J = j10;
    }

    public void g(ez ezVar) {
    }

    public void h() {
    }
}
