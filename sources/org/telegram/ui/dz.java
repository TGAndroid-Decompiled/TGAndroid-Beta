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
public class dz implements NotificationCenter.NotificationCenterDelegate {
    public static final HashSet I = new HashSet();
    public static final HashSet J;
    public az B;
    public final FrameLayout D;
    public final org.telegram.ui.Components.rl0 E;
    public final long F;
    public final long G;
    public HashMap H;
    public final zn f33557a;
    public int f33558b;
    public TLRPC.TL_messages_stickerSet f33559c;
    public boolean f33561n;
    public String v;
    public bj f33566y;
    public boolean d = false;
    public final HashMap e = new HashMap();
    public final HashMap f33560f = new HashMap();
    public final Random h = new Random();
    public int f33562r = -1;
    public long f33563s = 0;
    public final ArrayList f33564w = new ArrayList();
    public final ArrayList f33565x = new ArrayList();
    public final ArrayList C = new ArrayList();

    static {
        HashSet hashSet = new HashSet();
        J = hashSet;
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

    public dz(int i10, FrameLayout frameLayout) {
        this.D = frameLayout;
        this.f33558b = i10;
    }

    public static boolean a(org.telegram.ui.Cells.s1 s1Var, float f10, int i10) {
        float centerY = s1Var.getPhotoImage().getCenterY() + s1Var.getY();
        if (centerY > f10 && centerY < i10) {
            return true;
        }
        return false;
    }

    public static int f() {
        float min;
        float f10;
        if (AndroidUtilities.isTablet()) {
            min = AndroidUtilities.getMinTabletSide();
            f10 = 0.4f;
        } else {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f10 = 0.5f;
        }
        return (int) ((((int) (min * f10)) * 2.0f) / AndroidUtilities.density);
    }

    public static java.lang.String q(java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dz.q(java.lang.String):java.lang.String");
    }

    public final void b() {
        if (!this.d) {
            TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.f33558b).getStickerSetByName("EmojiAnimations");
            this.f33559c = stickerSetByName;
            if (stickerSetByName == null) {
                this.f33559c = MediaDataController.getInstance(this.f33558b).getStickerSetByEmojiOrName("EmojiAnimations");
            }
            if (this.f33559c == null) {
                MediaDataController.getInstance(this.f33558b).loadStickersByEmojiOrName("EmojiAnimations", false, true);
            }
            if (this.f33559c != null) {
                HashMap hashMap = new HashMap();
                for (int i10 = 0; i10 < this.f33559c.documents.size(); i10++) {
                    hashMap.put(Long.valueOf(this.f33559c.documents.get(i10).f19165id), this.f33559c.documents.get(i10));
                }
                for (int i11 = 0; i11 < this.f33559c.packs.size(); i11++) {
                    TLRPC.TL_stickerPack tL_stickerPack = this.f33559c.packs.get(i11);
                    if (!J.contains(tL_stickerPack.emoticon) && tL_stickerPack.documents.size() > 0) {
                        String str = tL_stickerPack.emoticon;
                        HashSet hashSet = I;
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
            ArrayList arrayList = this.C;
            if (i10 < arrayList.size()) {
                ((cz) arrayList.get(i10)).f33273r.onDetachedFromWindow();
                if (((cz) arrayList.get(i10)).f33265j != null) {
                    ((cz) arrayList.get(i10)).f33265j.d(this.D);
                }
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final boolean d(String str, int i10, TLRPC.Document document, MessageObject messageObject, int i11, boolean z4, boolean z10, float f10, float f11, boolean z11) {
        boolean z12;
        boolean z13;
        Random random;
        long j10;
        TLRPC.Document document2;
        int intValue;
        Boolean bool;
        TLRPC.VideoSize premiumStickerAnimation;
        boolean z14;
        boolean z15;
        String str2;
        int intValue2;
        bj bjVar;
        int intValue3;
        String str3;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i12 = i11;
        if (messageObject != null && messageObject.isPremiumSticker()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (messageObject != null && messageObject.getEffect() != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13 || z12 || I.contains(str)) {
            ArrayList arrayList = (ArrayList) this.e.get(str);
            if (z13 || ((arrayList != null && !arrayList.isEmpty()) || z12)) {
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    ArrayList arrayList2 = this.C;
                    if (i13 < arrayList2.size()) {
                        if (((cz) arrayList2.get(i13)).f33271p == i10) {
                            i14++;
                            if (!z13 && (((cz) arrayList2.get(i13)).f33273r.getLottieAnimation() == null || ((cz) arrayList2.get(i13)).f33273r.getLottieAnimation().w())) {
                                return false;
                            }
                        }
                        if (((cz) arrayList2.get(i13)).f33272q != null && document != null) {
                            if (((cz) arrayList2.get(i13)).f33272q.f19165id == document.f19165id) {
                                i15++;
                            }
                        }
                        i13++;
                    } else if (z4 && z12 && i14 > 0) {
                        org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.f25664w;
                        if (icVar != null && icVar.f25666b == messageObject.getId()) {
                            return false;
                        }
                        TLRPC.InputStickerSet inputStickerSet = messageObject.getInputStickerSet();
                        if (inputStickerSet.short_name != null) {
                            tL_messages_stickerSet = MediaDataController.getInstance(this.f33558b).getStickerSetByName(inputStickerSet.short_name);
                        } else {
                            tL_messages_stickerSet = null;
                        }
                        if (tL_messages_stickerSet == null) {
                            tL_messages_stickerSet = MediaDataController.getInstance(this.f33558b).getStickerSetById(inputStickerSet.f19179id);
                        }
                        if (tL_messages_stickerSet == null) {
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = inputStickerSet;
                            ConnectionsManager.getInstance(this.f33558b).sendRequest(tL_messages_getStickerSet, new no(18, this, messageObject));
                            return false;
                        }
                        p(tL_messages_stickerSet, messageObject);
                        return false;
                    } else if (i14 >= 4) {
                        return false;
                    } else {
                        Random random2 = this.h;
                        if (z13) {
                            TLRPC.TL_availableEffect effect = messageObject.getEffect();
                            TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.f33558b).getAvailableEffects();
                            if (availableEffects == null) {
                                return false;
                            }
                            j10 = 0;
                            long j11 = effect.effect_animation_id;
                            if (j11 == 0) {
                                j11 = effect.effect_sticker_id;
                            }
                            random = random2;
                            int i16 = 0;
                            while (true) {
                                if (i16 < availableEffects.documents.size()) {
                                    document2 = availableEffects.documents.get(i16);
                                    long j12 = j11;
                                    if (document2 != null && document2.f19165id == j12) {
                                        break;
                                    }
                                    i16++;
                                    j11 = j12;
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
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                            }
                            premiumStickerAnimation = null;
                        } else {
                            random = random2;
                            j10 = 0;
                            if (z12) {
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
                                                HashMap hashMap = this.H;
                                                if (hashMap != null) {
                                                    bool = (Boolean) hashMap.get(Long.valueOf(document3.f19165id));
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
                        cz czVar = new cz();
                        czVar.h = z12;
                        czVar.f33264i = z13;
                        if (!z13) {
                            czVar.f33262f = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                            czVar.f33263g = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                        }
                        czVar.f33271p = i10;
                        czVar.f33272q = document2;
                        czVar.f33268m = z11;
                        czVar.f33273r.setAllowStartAnimation(true);
                        czVar.f33273r.setAllowLottieVibration(z4);
                        if (SharedConfig.getDevicePerformanceClass() > 1 && BuildVars.DEBUG_VERSION) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        HashMap hashMap2 = this.f33560f;
                        int i18 = i12;
                        if (premiumStickerAnimation == null) {
                            int f12 = f();
                            z15 = z12;
                            boolean z16 = z14;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.f19165id));
                            if (num == null) {
                                intValue3 = 0;
                            } else {
                                intValue3 = num.intValue();
                            }
                            int i19 = intValue3 + 1;
                            hashMap2.put(Long.valueOf(document2.f19165id), Integer.valueOf(i19));
                            ImageLocation forDocument = ImageLocation.getForDocument(document2);
                            czVar.f33273r.setUniqKeyPrefix(i19 + "_" + czVar.f33271p + "_");
                            StringBuilder sb = new StringBuilder();
                            sb.append(f12);
                            sb.append("_");
                            sb.append(f12);
                            if (!z16) {
                                str3 = "";
                            } else {
                                str3 = "_pcache";
                            }
                            sb.append(str3);
                            czVar.f33273r.setImage(forDocument, sb.toString(), null, "tgs", this.f33559c, 1);
                            czVar.f33273r.setDelegate(new bz(this, czVar, z4, messageObject));
                            if (czVar.f33273r.getLottieAnimation() != null) {
                                czVar.f33273r.getLottieAnimation().L(0, false, true);
                            }
                        } else {
                            z15 = z12;
                            boolean z17 = z14;
                            int f13 = f();
                            if (i15 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.f19165id));
                                if (num2 == null) {
                                    intValue2 = 0;
                                } else {
                                    intValue2 = num2.intValue();
                                }
                                hashMap2.put(Long.valueOf(document2.f19165id), Integer.valueOf((intValue2 + 1) % 4));
                                czVar.f33273r.setUniqKeyPrefix(intValue2 + "_" + czVar.f33271p + "_");
                            }
                            czVar.f33272q = document2;
                            ImageLocation forDocument2 = ImageLocation.getForDocument(premiumStickerAnimation, document2);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(f13);
                            sb2.append("_");
                            sb2.append(f13);
                            if (!z17) {
                                str2 = "";
                            } else {
                                str2 = "_pcache";
                            }
                            sb2.append(str2);
                            czVar.f33273r.setImage(forDocument2, sb2.toString(), null, "tgs", this.f33559c, 1);
                        }
                        czVar.f33273r.setLayerNum(Integer.MAX_VALUE);
                        czVar.f33273r.setAutoRepeat(0);
                        if (czVar.f33273r.getLottieAnimation() != null) {
                            if (czVar.h) {
                                czVar.f33273r.getLottieAnimation().L(0, false, true);
                            }
                            czVar.f33273r.getLottieAnimation().start();
                        }
                        arrayList2.add(czVar);
                        czVar.f33273r.onAttachedToWindow();
                        ImageReceiver imageReceiver = czVar.f33273r;
                        FrameLayout frameLayout = this.D;
                        imageReceiver.setParentView(frameLayout);
                        frameLayout.invalidate();
                        if (z4 && !z15 && UserConfig.getInstance(this.f33558b).clientUserId != this.F) {
                            int i20 = this.f33562r;
                            if (i20 != 0 && i20 != i10 && (bjVar = this.f33566y) != null) {
                                AndroidUtilities.cancelRunOnUIThread(bjVar);
                                this.f33566y.run();
                            }
                            this.f33562r = i10;
                            this.v = str;
                            long j13 = this.f33563s;
                            ArrayList arrayList4 = this.f33565x;
                            ArrayList arrayList5 = this.f33564w;
                            if (j13 == j10) {
                                this.f33563s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j10));
                                arrayList4.add(Integer.valueOf(i18));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.f33563s));
                                arrayList4.add(Integer.valueOf(i18));
                            }
                            bj bjVar2 = this.f33566y;
                            if (bjVar2 != null) {
                                AndroidUtilities.cancelRunOnUIThread(bjVar2);
                                this.f33566y = null;
                            }
                            bj bjVar3 = new bj(this, 27);
                            this.f33566y = bjVar3;
                            AndroidUtilities.runOnUIThread(bjVar3, 500L);
                        }
                        if (z10) {
                            MessagesController.getInstance(this.f33558b).sendTyping(this.F, this.G, 11, str, 0);
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
        long j10 = this.F;
        if (i10 == i12) {
            if (this.f33557a != null) {
                long longValue = ((Long) objArr[0]).longValue();
                TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
                if (longValue == j10 && I.contains(tL_sendMessageEmojiInteraction.emoticon)) {
                    int i13 = tL_sendMessageEmojiInteraction.msg_id;
                    if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                        try {
                            JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i14);
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.wc0(this, i13, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.updateInterfaces && (printingStringType = MessagesController.getInstance(this.f33558b).getPrintingStringType(j10, this.G)) != null && printingStringType.intValue() == 5) {
            az azVar = this.B;
            if (azVar != null) {
                AndroidUtilities.cancelRunOnUIThread(azVar);
            }
            this.B = null;
        }
    }

    public final void e(Canvas canvas) {
        float f10;
        boolean z4;
        boolean z10;
        float f11;
        boolean z11;
        boolean z12;
        MessageObject messageObject;
        ImageReceiver imageReceiver;
        float f12;
        if (!this.C.isEmpty()) {
            int i10 = 0;
            while (i10 < this.C.size()) {
                cz czVar = (cz) this.C.get(i10);
                float f13 = 3.0f;
                if (this.f33557a != null) {
                    czVar.f33261c = false;
                    int i11 = 0;
                    while (true) {
                        if (i11 < this.E.getChildCount()) {
                            View childAt = this.E.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.s1) {
                                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                                messageObject = s1Var.getMessageObject();
                                imageReceiver = s1Var.getPhotoImage();
                            } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                                messageObject = v0Var.getMessageObject();
                                imageReceiver = v0Var.getPhotoImage();
                            } else {
                                messageObject = null;
                                imageReceiver = null;
                            }
                            if (messageObject != null && messageObject.getId() == czVar.f33271p) {
                                czVar.f33261c = true;
                                float x10 = childAt.getX() + this.E.getX();
                                float y10 = childAt.getY() + this.E.getY();
                                f11 = childAt.getY();
                                czVar.d = imageReceiver.getImageWidth();
                                czVar.e = imageReceiver.getImageHeight();
                                if (czVar.f33264i && (childAt instanceof org.telegram.ui.Cells.s1)) {
                                    org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                                    float f14 = (f() * AndroidUtilities.density) / 1.3f;
                                    float f15 = f14 / f13;
                                    czVar.d = f15;
                                    czVar.e = f15;
                                    float timeX = s1Var2.getTimeX() + x10;
                                    float f16 = f14 / 2.0f;
                                    f10 = 3.0f;
                                    czVar.f33259a = Utilities.clamp(timeX - f16, AndroidUtilities.displaySize.x - f14, 0.0f);
                                    czVar.f33260b = (s1Var2.getTimeY() + y10) - f16;
                                } else {
                                    f10 = 3.0f;
                                    if (czVar.h) {
                                        czVar.f33259a = imageReceiver.getImageX() + x10;
                                        czVar.f33260b = imageReceiver.getImageY() + y10;
                                    } else {
                                        float imageX = imageReceiver.getImageX() + x10;
                                        float imageY = imageReceiver.getImageY() + y10;
                                        if (czVar.f33268m) {
                                            f12 = ((-imageReceiver.getImageWidth()) * 2.0f) + AndroidUtilities.dp(24.0f) + imageX;
                                        } else {
                                            f12 = (-AndroidUtilities.dp(24.0f)) + imageX;
                                        }
                                        czVar.f33259a = f12;
                                        czVar.f33260b = imageY - imageReceiver.getImageWidth();
                                    }
                                }
                            } else {
                                i11++;
                                f13 = 3.0f;
                            }
                        } else {
                            f10 = 3.0f;
                            f11 = 0.0f;
                            break;
                        }
                    }
                    if (!czVar.f33261c || czVar.e + f11 < this.f33557a.f40707p9 || f11 > this.E.getMeasuredHeight() - this.f33557a.f40810xa) {
                        czVar.f33269n = true;
                    }
                    if (czVar.h) {
                        float f17 = czVar.e / 2.0f;
                        if (this.E.getMeasuredHeight() - f11 <= f17) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((f11 - this.f33557a.f40707p9) + f17 <= 0.0f) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z11 || z12) {
                            czVar.f33269n = true;
                        }
                    }
                    if (czVar.f33269n) {
                        float f18 = czVar.f33270o;
                        if (f18 != 1.0f) {
                            float clamp = Utilities.clamp(f18 + 0.10666667f, 1.0f, 0.0f);
                            czVar.f33270o = clamp;
                            czVar.f33273r.setAlpha(1.0f - clamp);
                            this.f33557a.U0.invalidate();
                        }
                    }
                } else {
                    f10 = 3.0f;
                    h(czVar);
                }
                if (!czVar.f33267l && czVar.f33269n) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    if (czVar.h && !czVar.f33264i) {
                        float f19 = czVar.e;
                        float f20 = 1.49926f * f19;
                        float f21 = 0.0546875f * f20;
                        float f22 = (((f19 / 2.0f) + czVar.f33260b) - (f20 / 2.0f)) - (0.00279f * f20);
                        if (!czVar.f33268m) {
                            czVar.f33273r.setImageCoords(czVar.f33259a - f21, f22, f20, f20);
                        } else {
                            czVar.f33273r.setImageCoords(((czVar.f33259a + czVar.d) - f20) + f21, f22, f20, f20);
                        }
                        if (!czVar.f33268m) {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, czVar.f33273r.getCenterX(), czVar.f33273r.getCenterY());
                            czVar.f33273r.draw(canvas);
                            canvas.restore();
                        } else {
                            czVar.f33273r.draw(canvas);
                        }
                    } else {
                        mg.d dVar = czVar.f33265j;
                        if (dVar != null) {
                            float f23 = czVar.f33259a + czVar.f33262f;
                            float f24 = czVar.f33260b + czVar.f33263g;
                            float f25 = czVar.d * f10;
                            dVar.e((int) f23, (int) f24, (int) (f23 + f25), (int) (f24 + f25));
                            czVar.f33265j.b(canvas);
                        } else {
                            ImageReceiver imageReceiver2 = czVar.f33273r;
                            float f26 = czVar.f33259a + czVar.f33262f;
                            float f27 = czVar.f33260b + czVar.f33263g;
                            float f28 = czVar.d * f10;
                            imageReceiver2.setImageCoords(f26, f27, f28, f28);
                            if (!czVar.f33268m) {
                                canvas.save();
                                canvas.scale(-1.0f, 1.0f, czVar.f33273r.getCenterX(), czVar.f33273r.getCenterY());
                                czVar.f33273r.draw(canvas);
                                canvas.restore();
                            } else {
                                czVar.f33273r.draw(canvas);
                            }
                        }
                    }
                }
                mg.d dVar2 = czVar.f33265j;
                if (dVar2 != null) {
                    z10 = dVar2.c();
                } else if (czVar.f33267l && czVar.f33273r.getLottieAnimation() != null && czVar.f33273r.getLottieAnimation().Y >= czVar.f33273r.getLottieAnimation().e[0] - 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (czVar.f33270o != 1.0f && !z10 && !z4) {
                    if (czVar.f33273r.getLottieAnimation() != null && czVar.f33273r.getLottieAnimation().f25164i0) {
                        czVar.f33267l = true;
                    } else if (czVar.f33273r.getLottieAnimation() != null && !czVar.f33273r.getLottieAnimation().f25164i0) {
                        czVar.f33273r.getLottieAnimation().L(0, true, false);
                        czVar.f33273r.getLottieAnimation().start();
                    }
                } else {
                    cz czVar2 = (cz) this.C.remove(i10);
                    if (czVar.h && czVar.f33273r.getLottieAnimation() != null) {
                        czVar2.f33273r.getLottieAnimation().L(0, true, true);
                    }
                    czVar2.f33273r.onDetachedFromWindow();
                    mg.d dVar3 = czVar2.f33265j;
                    if (dVar3 != null) {
                        dVar3.d(this.D);
                    }
                    i10--;
                }
                i10++;
            }
            if (this.C.isEmpty()) {
                i();
            }
            this.D.invalidate();
        }
    }

    public final boolean g() {
        return this.C.isEmpty();
    }

    public final void j() {
        this.f33561n = true;
        b();
        NotificationCenter.getInstance(this.f33558b).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.f33558b).addObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.f33558b).addObserver(this, NotificationCenter.updateInterfaces);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.C;
            if (i10 < arrayList.size()) {
                ((cz) arrayList.get(i10)).f33273r.onAttachedToWindow();
                if (((cz) arrayList.get(i10)).f33265j != null) {
                    ((cz) arrayList.get(i10)).f33265j.f(this.D);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        int i10 = 0;
        this.f33561n = false;
        NotificationCenter.getInstance(this.f33558b).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.f33558b).removeObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.f33558b).removeObserver(this, NotificationCenter.updateInterfaces);
        while (true) {
            ArrayList arrayList = this.C;
            if (i10 < arrayList.size()) {
                ((cz) arrayList.get(i10)).f33273r.onDetachedFromWindow();
                if (((cz) arrayList.get(i10)).f33265j != null) {
                    ((cz) arrayList.get(i10)).f33265j.d(this.D);
                }
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final void l(org.telegram.ui.Cells.s1 s1Var, zn znVar, boolean z4) {
        TLRPC.Document emojiAnimatedSticker;
        if (!znVar.v() && s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() >= 0) {
            if (s1Var.getMessageObject().isPremiumSticker() || znVar.f40575f != null) {
                boolean o10 = o(s1Var, -1, z4, false);
                if (z4 && o10 && !EmojiData.hasEmojiSupportVibration(s1Var.getMessageObject().getStickerEmoji()) && !s1Var.getMessageObject().isPremiumSticker() && !s1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                    try {
                        s1Var.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                boolean isPremiumSticker = s1Var.getMessageObject().isPremiumSticker();
                long j10 = this.F;
                if (!isPremiumSticker && s1Var.getEffect() == null && (z4 || !s1Var.getMessageObject().isAnimatedEmojiStickerSingle())) {
                    Integer printingStringType = MessagesController.getInstance(this.f33558b).getPrintingStringType(j10, this.G);
                    if ((printingStringType == null || printingStringType.intValue() != 5) && this.B == null && o10) {
                        org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.f25664w;
                        if ((icVar == null || !icVar.f25673l) && SharedConfig.emojiInteractionsHintCount > 0 && UserConfig.getInstance(this.f33558b).getClientUserId() != znVar.f40575f.f19306id) {
                            SharedConfig.updateEmojiInteractionsHintCount(SharedConfig.emojiInteractionsHintCount - 1);
                            if (s1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                                emojiAnimatedSticker = s1Var.getMessageObject().getDocument();
                            } else {
                                emojiAnimatedSticker = MediaDataController.getInstance(this.f33558b).getEmojiAnimatedSticker(s1Var.getMessageObject().getStickerEmoji());
                            }
                            org.telegram.ui.Components.bx0 bx0Var = new org.telegram.ui.Components.bx0(znVar.getParentActivity(), null, 1, -1, emojiAnimatedSticker, znVar.getResourceProvider());
                            bx0Var.f24566c.setVisibility(8);
                            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("EmojiInteractionTapHint", R.string.EmojiInteractionTapHint, znVar.f40575f.first_name));
                            TextView textView = bx0Var.f24565b;
                            textView.setText(Emoji.replaceEmoji(replaceTags, textView.getPaint().getFontMetricsInt(), false));
                            textView.setTypeface(null);
                            textView.setMaxLines(3);
                            textView.setSingleLine(false);
                            az azVar = new az(0, this, org.telegram.ui.Components.ic.g(znVar, bx0Var, 2750));
                            this.B = azVar;
                            AndroidUtilities.runOnUIThread(azVar, 1500L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                s1Var.getMessageObject().forcePlayEffect = false;
                s1Var.getMessageObject().messageOwner.premiumEffectWasPlayed = true;
                znVar.getMessagesStorage().updateMessageCustomParams(j10, s1Var.getMessageObject().messageOwner);
            }
        }
    }

    public final void m(TLRPC.Document document) {
        if (document != null) {
            HashMap hashMap = this.H;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(document.f19165id))) {
                return;
            }
            if (this.H == null) {
                this.H = new HashMap();
            }
            this.H.put(Long.valueOf(document.f19165id), Boolean.TRUE);
            MediaDataController.getInstance(this.f33558b).preloadImage(ImageLocation.getForDocument(document), 2);
        }
    }

    public final void n(org.telegram.ui.Cells.s1 s1Var) {
        ArrayList arrayList;
        MessageObject messageObject = s1Var.getMessageObject();
        if (!messageObject.isPremiumSticker()) {
            String stickerEmoji = messageObject.getStickerEmoji();
            if (stickerEmoji == null) {
                stickerEmoji = messageObject.messageOwner.message;
            }
            String q10 = q(stickerEmoji);
            if (I.contains(q10) && (arrayList = (ArrayList) this.e.get(q10)) != null && !arrayList.isEmpty()) {
                int min = Math.min(1, arrayList.size());
                for (int i10 = 0; i10 < min; i10++) {
                    m((TLRPC.Document) arrayList.get(i10));
                }
            }
        }
    }

    public final boolean o(org.telegram.ui.Cells.s1 s1Var, int i10, boolean z4, boolean z10) {
        if (s1Var != null && this.C.size() <= 12) {
            MessageObject messageObject = s1Var.getMessageObject();
            if (s1Var.getEffect() != null || s1Var.getPhotoImage().hasNotThumb()) {
                String stickerEmoji = messageObject.getStickerEmoji();
                if (stickerEmoji == null) {
                    stickerEmoji = messageObject.messageOwner.message;
                }
                if (s1Var.getEffect() != null || stickerEmoji != null) {
                    float imageHeight = s1Var.getPhotoImage().getImageHeight();
                    float imageWidth = s1Var.getPhotoImage().getImageWidth();
                    if (s1Var.getEffect() != null || (imageHeight > 0.0f && imageWidth > 0.0f)) {
                        return d(q(stickerEmoji), s1Var.getMessageObject().getId(), s1Var.getMessageObject().getDocument(), messageObject, i10, z4, z10, imageWidth, imageHeight, s1Var.getMessageObject().isOutOwner());
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
        zn znVar = this.f33557a;
        if (znVar != null && !MessagesController.getInstance(this.f33558b).premiumFeaturesBlocked() && znVar.getParentActivity() != null) {
            org.telegram.ui.Components.bx0 bx0Var = new org.telegram.ui.Components.bx0(this.D.getContext(), null, 1, -1, messageObject.getDocument(), znVar.getResourceProvider());
            bx0Var.f24565b.setText(tL_messages_stickerSet.set.title);
            bx0Var.f24566c.setText(LocaleController.getString(R.string.PremiumStickerTooltip));
            org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(znVar.getParentActivity(), znVar.getResourceProvider(), true);
            bx0Var.setButton(gcVar);
            gcVar.f25112a = new org.telegram.ui.Components.k41(23, this, messageObject);
            gcVar.e(LocaleController.getString(R.string.ViewAction));
            org.telegram.ui.Components.ic g10 = org.telegram.ui.Components.ic.g(znVar, bx0Var, 2750);
            g10.f25666b = messageObject.getId();
            g10.j();
        }
    }

    public dz(zn znVar, FrameLayout frameLayout, org.telegram.ui.Components.rl0 rl0Var, int i10, long j10, long j11) {
        this.f33557a = znVar;
        this.D = frameLayout;
        this.E = rl0Var;
        this.f33558b = i10;
        this.F = j10;
        this.G = j11;
    }

    public void h(cz czVar) {
    }

    public void i() {
    }
}
