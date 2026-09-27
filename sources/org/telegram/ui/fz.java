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
    public final org.telegram.ui.Components.yl0 H;
    public final long I;
    public final long J;
    public HashMap K;
    public final xn f33657a;
    public int f33658b;
    public TLRPC.TL_messages_stickerSet f33659c;
    public boolean f33661n;
    public String v;
    public cj f33666y;
    public boolean d = false;
    public final HashMap e = new HashMap();
    public final HashMap f33660f = new HashMap();
    public final Random h = new Random();
    public int f33662r = -1;
    public long f33663s = 0;
    public final ArrayList f33664w = new ArrayList();
    public final ArrayList f33665x = new ArrayList();
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
        this.f33658b = i10;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fz.q(java.lang.String):java.lang.String");
    }

    public final void b() {
        if (!this.d) {
            TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.f33658b).getStickerSetByName("EmojiAnimations");
            this.f33659c = stickerSetByName;
            if (stickerSetByName == null) {
                this.f33659c = MediaDataController.getInstance(this.f33658b).getStickerSetByEmojiOrName("EmojiAnimations");
            }
            if (this.f33659c == null) {
                MediaDataController.getInstance(this.f33658b).loadStickersByEmojiOrName("EmojiAnimations", false, true);
            }
            if (this.f33659c != null) {
                HashMap hashMap = new HashMap();
                for (int i10 = 0; i10 < this.f33659c.documents.size(); i10++) {
                    hashMap.put(Long.valueOf(this.f33659c.documents.get(i10).f18335id), this.f33659c.documents.get(i10));
                }
                for (int i11 = 0; i11 < this.f33659c.packs.size(); i11++) {
                    TLRPC.TL_stickerPack tL_stickerPack = this.f33659c.packs.get(i11);
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
                ((ez) arrayList.get(i10)).f33366r.onDetachedFromWindow();
                if (((ez) arrayList.get(i10)).f33358j != null) {
                    ((ez) arrayList.get(i10)).f33358j.d(this.G);
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
            ArrayList arrayList = (ArrayList) this.e.get(str);
            if (z14 || ((arrayList != null && !arrayList.isEmpty()) || z13)) {
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    ArrayList arrayList2 = this.F;
                    if (i13 < arrayList2.size()) {
                        if (((ez) arrayList2.get(i13)).f33364p == i10) {
                            i14++;
                            if (!z14 && (((ez) arrayList2.get(i13)).f33366r.getLottieAnimation() == null || ((ez) arrayList2.get(i13)).f33366r.getLottieAnimation().y())) {
                                return false;
                            }
                        }
                        if (((ez) arrayList2.get(i13)).f33365q != null && document != null) {
                            if (((ez) arrayList2.get(i13)).f33365q.f18335id == document.f18335id) {
                                i15++;
                            }
                        }
                        i13++;
                    } else if (z10 && z13 && i14 > 0) {
                        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f27684w;
                        if (qcVar != null && qcVar.f27686b == messageObject.getId()) {
                            return false;
                        }
                        TLRPC.InputStickerSet inputStickerSet = messageObject.getInputStickerSet();
                        if (inputStickerSet.short_name != null) {
                            tL_messages_stickerSet = MediaDataController.getInstance(this.f33658b).getStickerSetByName(inputStickerSet.short_name);
                        } else {
                            tL_messages_stickerSet = null;
                        }
                        if (tL_messages_stickerSet == null) {
                            tL_messages_stickerSet = MediaDataController.getInstance(this.f33658b).getStickerSetById(inputStickerSet.f18349id);
                        }
                        if (tL_messages_stickerSet == null) {
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = inputStickerSet;
                            ConnectionsManager.getInstance(this.f33658b).sendRequest(tL_messages_getStickerSet, new mo(18, this, messageObject));
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
                            TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.f33658b).getAvailableEffects();
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
                                    if (document2 != null && document2.f18335id == j11) {
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
                                                    bool = (Boolean) hashMap.get(Long.valueOf(document3.f18335id));
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
                        ezVar.f33357i = z14;
                        if (!z14) {
                            ezVar.f33355f = ((random.nextInt() % 101) / 100.0f) * (f7 / 4.0f);
                            ezVar.f33356g = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                        }
                        ezVar.f33364p = i10;
                        ezVar.f33365q = document2;
                        ezVar.f33361m = z12;
                        ezVar.f33366r.setAllowStartAnimation(true);
                        ezVar.f33366r.setAllowLottieVibration(z10);
                        if (SharedConfig.getDevicePerformanceClass() > 1 && BuildVars.DEBUG_VERSION) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        HashMap hashMap2 = this.f33660f;
                        int i18 = i12;
                        if (premiumStickerAnimation == null) {
                            int f11 = f();
                            z16 = z13;
                            boolean z17 = z15;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.f18335id));
                            if (num == null) {
                                intValue3 = 0;
                            } else {
                                intValue3 = num.intValue();
                            }
                            int i19 = intValue3 + 1;
                            hashMap2.put(Long.valueOf(document2.f18335id), Integer.valueOf(i19));
                            ImageLocation forDocument = ImageLocation.getForDocument(document2);
                            ezVar.f33366r.setUniqKeyPrefix(i19 + "_" + ezVar.f33364p + "_");
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
                            ezVar.f33366r.setImage(forDocument, sb2.toString(), null, "tgs", this.f33659c, 1);
                            ezVar.f33366r.setDelegate(new dz(this, ezVar, z10, messageObject));
                            if (ezVar.f33366r.getLottieAnimation() != null) {
                                ezVar.f33366r.getLottieAnimation().N(0, false, true);
                            }
                        } else {
                            z16 = z13;
                            boolean z18 = z15;
                            int f12 = f();
                            if (i15 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.f18335id));
                                if (num2 == null) {
                                    intValue2 = 0;
                                } else {
                                    intValue2 = num2.intValue();
                                }
                                hashMap2.put(Long.valueOf(document2.f18335id), Integer.valueOf((intValue2 + 1) % 4));
                                ezVar.f33366r.setUniqKeyPrefix(intValue2 + "_" + ezVar.f33364p + "_");
                            }
                            ezVar.f33365q = document2;
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
                            ezVar.f33366r.setImage(forDocument2, sb3.toString(), null, "tgs", this.f33659c, 1);
                        }
                        ezVar.f33366r.setLayerNum(Integer.MAX_VALUE);
                        ezVar.f33366r.setAutoRepeat(0);
                        if (ezVar.f33366r.getLottieAnimation() != null) {
                            if (ezVar.h) {
                                ezVar.f33366r.getLottieAnimation().N(0, false, true);
                            }
                            ezVar.f33366r.getLottieAnimation().start();
                        }
                        arrayList2.add(ezVar);
                        ezVar.f33366r.onAttachedToWindow();
                        ImageReceiver imageReceiver = ezVar.f33366r;
                        FrameLayout frameLayout = this.G;
                        imageReceiver.setParentView(frameLayout);
                        frameLayout.invalidate();
                        if (z10 && !z16 && UserConfig.getInstance(this.f33658b).clientUserId != this.I) {
                            int i20 = this.f33662r;
                            if (i20 != 0 && i20 != i10 && (cjVar = this.f33666y) != null) {
                                AndroidUtilities.cancelRunOnUIThread(cjVar);
                                this.f33666y.run();
                            }
                            this.f33662r = i10;
                            this.v = str;
                            long j12 = this.f33663s;
                            ArrayList arrayList4 = this.f33665x;
                            ArrayList arrayList5 = this.f33664w;
                            if (j12 == j3) {
                                this.f33663s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j3));
                                arrayList4.add(Integer.valueOf(i18));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.f33663s));
                                arrayList4.add(Integer.valueOf(i18));
                            }
                            cj cjVar2 = this.f33666y;
                            if (cjVar2 != null) {
                                AndroidUtilities.cancelRunOnUIThread(cjVar2);
                                this.f33666y = null;
                            }
                            cj cjVar3 = new cj(this, 27);
                            this.f33666y = cjVar3;
                            AndroidUtilities.runOnUIThread(cjVar3, 500L);
                        }
                        if (z11) {
                            MessagesController.getInstance(this.f33658b).sendTyping(this.I, this.J, 11, str, 0);
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
            if (this.f33657a != null) {
                long longValue = ((Long) objArr[0]).longValue();
                TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
                if (longValue == j3 && L.contains(tL_sendMessageEmojiInteraction.emoticon)) {
                    int i13 = tL_sendMessageEmojiInteraction.msg_id;
                    if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                        try {
                            JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i14);
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.dd0(this, i13, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.updateInterfaces && (printingStringType = MessagesController.getInstance(this.f33658b).getPrintingStringType(j3, this.J)) != null && printingStringType.intValue() == 5) {
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
                if (this.f33657a != null) {
                    ezVar.f33354c = false;
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
                            if (messageObject != null && messageObject.getId() == ezVar.f33364p) {
                                ezVar.f33354c = true;
                                float x10 = childAt.getX() + this.H.getX();
                                float y3 = childAt.getY() + this.H.getY();
                                f10 = childAt.getY();
                                ezVar.d = imageReceiver.getImageWidth();
                                ezVar.e = imageReceiver.getImageHeight();
                                if (ezVar.f33357i && (childAt instanceof org.telegram.ui.Cells.u1)) {
                                    org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                                    float f13 = (f() * AndroidUtilities.density) / 1.3f;
                                    float f14 = f13 / f12;
                                    ezVar.d = f14;
                                    ezVar.e = f14;
                                    float timeX = u1Var2.getTimeX() + x10;
                                    float f15 = f13 / 2.0f;
                                    f7 = 3.0f;
                                    ezVar.f33352a = Utilities.clamp(timeX - f15, AndroidUtilities.displaySize.x - f13, 0.0f);
                                    ezVar.f33353b = (u1Var2.getTimeY() + y3) - f15;
                                } else {
                                    f7 = 3.0f;
                                    if (ezVar.h) {
                                        ezVar.f33352a = imageReceiver.getImageX() + x10;
                                        ezVar.f33353b = imageReceiver.getImageY() + y3;
                                    } else {
                                        float imageX = imageReceiver.getImageX() + x10;
                                        float imageY = imageReceiver.getImageY() + y3;
                                        if (ezVar.f33361m) {
                                            f11 = ((-imageReceiver.getImageWidth()) * 2.0f) + AndroidUtilities.dp(24.0f) + imageX;
                                        } else {
                                            f11 = (-AndroidUtilities.dp(24.0f)) + imageX;
                                        }
                                        ezVar.f33352a = f11;
                                        ezVar.f33353b = imageY - imageReceiver.getImageWidth();
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
                    if (!ezVar.f33354c || ezVar.e + f10 < this.f33657a.f39922s9 || f10 > this.H.getMeasuredHeight() - this.f33657a.Aa) {
                        ezVar.f33362n = true;
                    }
                    if (ezVar.h) {
                        float f16 = ezVar.e / 2.0f;
                        if (this.H.getMeasuredHeight() - f10 <= f16) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if ((f10 - this.f33657a.f39922s9) + f16 <= 0.0f) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            ezVar.f33362n = true;
                        }
                    }
                    if (ezVar.f33362n) {
                        float f17 = ezVar.f33363o;
                        if (f17 != 1.0f) {
                            float clamp = Utilities.clamp(f17 + 0.10666667f, 1.0f, 0.0f);
                            ezVar.f33363o = clamp;
                            ezVar.f33366r.setAlpha(1.0f - clamp);
                            this.f33657a.X0.invalidate();
                        }
                    }
                } else {
                    f7 = 3.0f;
                    h(ezVar);
                }
                if (!ezVar.f33360l && ezVar.f33362n) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (ezVar.h && !ezVar.f33357i) {
                        float f18 = ezVar.e;
                        float f19 = 1.49926f * f18;
                        float f20 = 0.0546875f * f19;
                        float f21 = (((f18 / 2.0f) + ezVar.f33353b) - (f19 / 2.0f)) - (0.00279f * f19);
                        if (!ezVar.f33361m) {
                            ezVar.f33366r.setImageCoords(ezVar.f33352a - f20, f21, f19, f19);
                        } else {
                            ezVar.f33366r.setImageCoords(((ezVar.f33352a + ezVar.d) - f19) + f20, f21, f19, f19);
                        }
                        if (!ezVar.f33361m) {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, ezVar.f33366r.getCenterX(), ezVar.f33366r.getCenterY());
                            ezVar.f33366r.draw(canvas);
                            canvas.restore();
                        } else {
                            ezVar.f33366r.draw(canvas);
                        }
                    } else {
                        zg.d dVar = ezVar.f33358j;
                        if (dVar != null) {
                            float f22 = ezVar.f33352a + ezVar.f33355f;
                            float f23 = ezVar.f33353b + ezVar.f33356g;
                            float f24 = ezVar.d * f7;
                            dVar.e((int) f22, (int) f23, (int) (f22 + f24), (int) (f23 + f24));
                            ezVar.f33358j.b(canvas);
                        } else {
                            ImageReceiver imageReceiver2 = ezVar.f33366r;
                            float f25 = ezVar.f33352a + ezVar.f33355f;
                            float f26 = ezVar.f33353b + ezVar.f33356g;
                            float f27 = ezVar.d * f7;
                            imageReceiver2.setImageCoords(f25, f26, f27, f27);
                            if (!ezVar.f33361m) {
                                canvas.save();
                                canvas.scale(-1.0f, 1.0f, ezVar.f33366r.getCenterX(), ezVar.f33366r.getCenterY());
                                ezVar.f33366r.draw(canvas);
                                canvas.restore();
                            } else {
                                ezVar.f33366r.draw(canvas);
                            }
                        }
                    }
                }
                zg.d dVar2 = ezVar.f33358j;
                if (dVar2 != null) {
                    z11 = dVar2.c();
                } else if (ezVar.f33360l && ezVar.f33366r.getLottieAnimation() != null && ezVar.f33366r.getLottieAnimation().f25746a0 >= ezVar.f33366r.getLottieAnimation().e[0] - 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (ezVar.f33363o != 1.0f && !z11 && !z10) {
                    if (ezVar.f33366r.getLottieAnimation() != null && ezVar.f33366r.getLottieAnimation().f25759k0) {
                        ezVar.f33360l = true;
                    } else if (ezVar.f33366r.getLottieAnimation() != null && !ezVar.f33366r.getLottieAnimation().f25759k0) {
                        ezVar.f33366r.getLottieAnimation().N(0, true, false);
                        ezVar.f33366r.getLottieAnimation().start();
                    }
                } else {
                    ez ezVar2 = (ez) this.F.remove(i10);
                    if (ezVar.h && ezVar.f33366r.getLottieAnimation() != null) {
                        ezVar2.f33366r.getLottieAnimation().N(0, true, true);
                    }
                    ezVar2.f33366r.onDetachedFromWindow();
                    zg.d dVar3 = ezVar2.f33358j;
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
        this.f33661n = true;
        b();
        NotificationCenter.getInstance(this.f33658b).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.f33658b).addObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.f33658b).addObserver(this, NotificationCenter.updateInterfaces);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 < arrayList.size()) {
                ((ez) arrayList.get(i10)).f33366r.onAttachedToWindow();
                if (((ez) arrayList.get(i10)).f33358j != null) {
                    ((ez) arrayList.get(i10)).f33358j.f(this.G);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        int i10 = 0;
        this.f33661n = false;
        NotificationCenter.getInstance(this.f33658b).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.f33658b).removeObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.f33658b).removeObserver(this, NotificationCenter.updateInterfaces);
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 < arrayList.size()) {
                ((ez) arrayList.get(i10)).f33366r.onDetachedFromWindow();
                if (((ez) arrayList.get(i10)).f33358j != null) {
                    ((ez) arrayList.get(i10)).f33358j.d(this.G);
                }
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final void l(org.telegram.ui.Cells.u1 u1Var, xn xnVar, boolean z10) {
        TLRPC.Document emojiAnimatedSticker;
        if (!xnVar.v() && u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() >= 0) {
            if (u1Var.getMessageObject().isPremiumSticker() || xnVar.f39752f != null) {
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
                    Integer printingStringType = MessagesController.getInstance(this.f33658b).getPrintingStringType(j3, this.J);
                    if ((printingStringType == null || printingStringType.intValue() != 5) && this.E == null && o9) {
                        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f27684w;
                        if ((qcVar == null || !qcVar.f27693l) && SharedConfig.emojiInteractionsHintCount > 0 && UserConfig.getInstance(this.f33658b).getClientUserId() != xnVar.f39752f.f18476id) {
                            SharedConfig.updateEmojiInteractionsHintCount(SharedConfig.emojiInteractionsHintCount - 1);
                            if (u1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                                emojiAnimatedSticker = u1Var.getMessageObject().getDocument();
                            } else {
                                emojiAnimatedSticker = MediaDataController.getInstance(this.f33658b).getEmojiAnimatedSticker(u1Var.getMessageObject().getStickerEmoji());
                            }
                            org.telegram.ui.Components.mx0 mx0Var = new org.telegram.ui.Components.mx0(xnVar.getParentActivity(), null, 1, -1, emojiAnimatedSticker, xnVar.getResourceProvider());
                            mx0Var.f26423c.setVisibility(8);
                            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("EmojiInteractionTapHint", R.string.EmojiInteractionTapHint, xnVar.f39752f.first_name));
                            TextView textView = mx0Var.f26422b;
                            textView.setText(Emoji.replaceEmoji(replaceTags, textView.getPaint().getFontMetricsInt(), false));
                            textView.setTypeface(null);
                            textView.setMaxLines(3);
                            textView.setSingleLine(false);
                            i9.s sVar = new i9.s(this, org.telegram.ui.Components.qc.g(xnVar, mx0Var, 2750), false, 23);
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
                xnVar.getMessagesStorage().updateMessageCustomParams(j3, u1Var.getMessageObject().messageOwner);
            }
        }
    }

    public final void m(TLRPC.Document document) {
        if (document != null) {
            HashMap hashMap = this.K;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(document.f18335id))) {
                return;
            }
            if (this.K == null) {
                this.K = new HashMap();
            }
            this.K.put(Long.valueOf(document.f18335id), Boolean.TRUE);
            MediaDataController.getInstance(this.f33658b).preloadImage(ImageLocation.getForDocument(document), 2);
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
        xn xnVar = this.f33657a;
        if (xnVar != null && !MessagesController.getInstance(this.f33658b).premiumFeaturesBlocked() && xnVar.getParentActivity() != null) {
            org.telegram.ui.Components.mx0 mx0Var = new org.telegram.ui.Components.mx0(this.G.getContext(), null, 1, -1, messageObject.getDocument(), xnVar.getResourceProvider());
            mx0Var.f26422b.setText(tL_messages_stickerSet.set.title);
            mx0Var.f26423c.setText(LocaleController.getString(R.string.PremiumStickerTooltip));
            org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(xnVar.getParentActivity(), xnVar.getResourceProvider(), true);
            mx0Var.setButton(ocVar);
            ocVar.f27063a = new tv(7, this, messageObject);
            ocVar.e(LocaleController.getString(R.string.ViewAction));
            org.telegram.ui.Components.qc g10 = org.telegram.ui.Components.qc.g(xnVar, mx0Var, 2750);
            g10.f27686b = messageObject.getId();
            g10.j();
        }
    }

    public fz(xn xnVar, FrameLayout frameLayout, org.telegram.ui.Components.yl0 yl0Var, int i10, long j3, long j10) {
        this.f33657a = xnVar;
        this.G = frameLayout;
        this.H = yl0Var;
        this.f33658b = i10;
        this.I = j3;
        this.J = j10;
    }

    public void h(ez ezVar) {
    }

    public void i() {
    }
}
