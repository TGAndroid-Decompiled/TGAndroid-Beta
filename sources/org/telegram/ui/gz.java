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
public class gz implements NotificationCenter.NotificationCenterDelegate {
    public static final HashSet L = new HashSet();
    public static final HashSet M;
    public i9.s E;
    public final FrameLayout G;
    public final org.telegram.ui.Components.zl0 H;
    public final long I;
    public final long J;
    public HashMap K;
    public final yn f36776a;
    public int f36777b;
    public TLRPC.TL_messages_stickerSet f36778c;
    public boolean f36781n;
    public String v;
    public bj f36786y;
    public boolean d = false;
    public final HashMap f36779e = new HashMap();
    public final HashMap f36780f = new HashMap();
    public final Random h = new Random();
    public int f36782r = -1;
    public long f36783s = 0;
    public final ArrayList f36784w = new ArrayList();
    public final ArrayList f36785x = new ArrayList();
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

    public gz(int i10, FrameLayout frameLayout) {
        this.G = frameLayout;
        this.f36777b = i10;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gz.q(java.lang.String):java.lang.String");
    }

    public final void b() {
        if (!this.d) {
            TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.f36777b).getStickerSetByName("EmojiAnimations");
            this.f36778c = stickerSetByName;
            if (stickerSetByName == null) {
                this.f36778c = MediaDataController.getInstance(this.f36777b).getStickerSetByEmojiOrName("EmojiAnimations");
            }
            if (this.f36778c == null) {
                MediaDataController.getInstance(this.f36777b).loadStickersByEmojiOrName("EmojiAnimations", false, true);
            }
            if (this.f36778c != null) {
                HashMap hashMap = new HashMap();
                for (int i10 = 0; i10 < this.f36778c.documents.size(); i10++) {
                    hashMap.put(Long.valueOf(this.f36778c.documents.get(i10).f20043id), this.f36778c.documents.get(i10));
                }
                for (int i11 = 0; i11 < this.f36778c.packs.size(); i11++) {
                    TLRPC.TL_stickerPack tL_stickerPack = this.f36778c.packs.get(i11);
                    if (!M.contains(tL_stickerPack.emoticon) && tL_stickerPack.documents.size() > 0) {
                        String str = tL_stickerPack.emoticon;
                        HashSet hashSet = L;
                        hashSet.add(str);
                        ArrayList arrayList = new ArrayList();
                        String str2 = tL_stickerPack.emoticon;
                        HashMap hashMap2 = this.f36779e;
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
                ((fz) arrayList.get(i10)).f36445r.onDetachedFromWindow();
                if (((fz) arrayList.get(i10)).f36437j != null) {
                    ((fz) arrayList.get(i10)).f36437j.d(this.G);
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
        bj bjVar;
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
            ArrayList arrayList = (ArrayList) this.f36779e.get(str);
            if (z14 || ((arrayList != null && !arrayList.isEmpty()) || z13)) {
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    ArrayList arrayList2 = this.F;
                    if (i13 < arrayList2.size()) {
                        if (((fz) arrayList2.get(i13)).f36443p == i10) {
                            i14++;
                            if (!z14 && (((fz) arrayList2.get(i13)).f36445r.getLottieAnimation() == null || ((fz) arrayList2.get(i13)).f36445r.getLottieAnimation().y())) {
                                return false;
                            }
                        }
                        if (((fz) arrayList2.get(i13)).f36444q != null && document != null) {
                            if (((fz) arrayList2.get(i13)).f36444q.f20043id == document.f20043id) {
                                i15++;
                            }
                        }
                        i13++;
                    } else if (z10 && z13 && i14 > 0) {
                        org.telegram.ui.Components.rc rcVar = org.telegram.ui.Components.rc.f30330w;
                        if (rcVar != null && rcVar.f30332b == messageObject.getId()) {
                            return false;
                        }
                        TLRPC.InputStickerSet inputStickerSet = messageObject.getInputStickerSet();
                        if (inputStickerSet.short_name != null) {
                            tL_messages_stickerSet = MediaDataController.getInstance(this.f36777b).getStickerSetByName(inputStickerSet.short_name);
                        } else {
                            tL_messages_stickerSet = null;
                        }
                        if (tL_messages_stickerSet == null) {
                            tL_messages_stickerSet = MediaDataController.getInstance(this.f36777b).getStickerSetById(inputStickerSet.f20057id);
                        }
                        if (tL_messages_stickerSet == null) {
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = inputStickerSet;
                            ConnectionsManager.getInstance(this.f36777b).sendRequest(tL_messages_getStickerSet, new no(18, this, messageObject));
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
                            TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.f36777b).getAvailableEffects();
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
                                    if (document2 != null && document2.f20043id == j11) {
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
                                                    bool = (Boolean) hashMap.get(Long.valueOf(document3.f20043id));
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
                        fz fzVar = new fz();
                        fzVar.h = z13;
                        fzVar.f36436i = z14;
                        if (!z14) {
                            fzVar.f36434f = ((random.nextInt() % 101) / 100.0f) * (f7 / 4.0f);
                            fzVar.f36435g = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                        }
                        fzVar.f36443p = i10;
                        fzVar.f36444q = document2;
                        fzVar.f36440m = z12;
                        fzVar.f36445r.setAllowStartAnimation(true);
                        fzVar.f36445r.setAllowLottieVibration(z10);
                        if (SharedConfig.getDevicePerformanceClass() > 1 && BuildVars.DEBUG_VERSION) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        HashMap hashMap2 = this.f36780f;
                        int i18 = i12;
                        if (premiumStickerAnimation == null) {
                            int f11 = f();
                            z16 = z13;
                            boolean z17 = z15;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.f20043id));
                            if (num == null) {
                                intValue3 = 0;
                            } else {
                                intValue3 = num.intValue();
                            }
                            int i19 = intValue3 + 1;
                            hashMap2.put(Long.valueOf(document2.f20043id), Integer.valueOf(i19));
                            ImageLocation forDocument = ImageLocation.getForDocument(document2);
                            fzVar.f36445r.setUniqKeyPrefix(i19 + "_" + fzVar.f36443p + "_");
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
                            fzVar.f36445r.setImage(forDocument, sb2.toString(), null, "tgs", this.f36778c, 1);
                            fzVar.f36445r.setDelegate(new ez(this, fzVar, z10, messageObject));
                            if (fzVar.f36445r.getLottieAnimation() != null) {
                                fzVar.f36445r.getLottieAnimation().N(0, false, true);
                            }
                        } else {
                            z16 = z13;
                            boolean z18 = z15;
                            int f12 = f();
                            if (i15 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.f20043id));
                                if (num2 == null) {
                                    intValue2 = 0;
                                } else {
                                    intValue2 = num2.intValue();
                                }
                                hashMap2.put(Long.valueOf(document2.f20043id), Integer.valueOf((intValue2 + 1) % 4));
                                fzVar.f36445r.setUniqKeyPrefix(intValue2 + "_" + fzVar.f36443p + "_");
                            }
                            fzVar.f36444q = document2;
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
                            fzVar.f36445r.setImage(forDocument2, sb3.toString(), null, "tgs", this.f36778c, 1);
                        }
                        fzVar.f36445r.setLayerNum(Integer.MAX_VALUE);
                        fzVar.f36445r.setAutoRepeat(0);
                        if (fzVar.f36445r.getLottieAnimation() != null) {
                            if (fzVar.h) {
                                fzVar.f36445r.getLottieAnimation().N(0, false, true);
                            }
                            fzVar.f36445r.getLottieAnimation().start();
                        }
                        arrayList2.add(fzVar);
                        fzVar.f36445r.onAttachedToWindow();
                        ImageReceiver imageReceiver = fzVar.f36445r;
                        FrameLayout frameLayout = this.G;
                        imageReceiver.setParentView(frameLayout);
                        frameLayout.invalidate();
                        if (z10 && !z16 && UserConfig.getInstance(this.f36777b).clientUserId != this.I) {
                            int i20 = this.f36782r;
                            if (i20 != 0 && i20 != i10 && (bjVar = this.f36786y) != null) {
                                AndroidUtilities.cancelRunOnUIThread(bjVar);
                                this.f36786y.run();
                            }
                            this.f36782r = i10;
                            this.v = str;
                            long j12 = this.f36783s;
                            ArrayList arrayList4 = this.f36785x;
                            ArrayList arrayList5 = this.f36784w;
                            if (j12 == j3) {
                                this.f36783s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j3));
                                arrayList4.add(Integer.valueOf(i18));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.f36783s));
                                arrayList4.add(Integer.valueOf(i18));
                            }
                            bj bjVar2 = this.f36786y;
                            if (bjVar2 != null) {
                                AndroidUtilities.cancelRunOnUIThread(bjVar2);
                                this.f36786y = null;
                            }
                            bj bjVar3 = new bj(this, 27);
                            this.f36786y = bjVar3;
                            AndroidUtilities.runOnUIThread(bjVar3, 500L);
                        }
                        if (z11) {
                            MessagesController.getInstance(this.f36777b).sendTyping(this.I, this.J, 11, str, 0);
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
            if (this.f36776a != null) {
                long longValue = ((Long) objArr[0]).longValue();
                TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
                if (longValue == j3 && L.contains(tL_sendMessageEmojiInteraction.emoticon)) {
                    int i13 = tL_sendMessageEmojiInteraction.msg_id;
                    if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                        try {
                            JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i14);
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.fd0(this, i13, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                            }
                        } catch (JSONException e7) {
                            e7.printStackTrace();
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.updateInterfaces && (printingStringType = MessagesController.getInstance(this.f36777b).getPrintingStringType(j3, this.J)) != null && printingStringType.intValue() == 5) {
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
                fz fzVar = (fz) this.F.get(i10);
                float f12 = 3.0f;
                if (this.f36776a != null) {
                    fzVar.f36432c = false;
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
                            if (messageObject != null && messageObject.getId() == fzVar.f36443p) {
                                fzVar.f36432c = true;
                                float x10 = childAt.getX() + this.H.getX();
                                float y3 = childAt.getY() + this.H.getY();
                                f10 = childAt.getY();
                                fzVar.d = imageReceiver.getImageWidth();
                                fzVar.f36433e = imageReceiver.getImageHeight();
                                if (fzVar.f36436i && (childAt instanceof org.telegram.ui.Cells.u1)) {
                                    org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                                    float f13 = (f() * AndroidUtilities.density) / 1.3f;
                                    float f14 = f13 / f12;
                                    fzVar.d = f14;
                                    fzVar.f36433e = f14;
                                    float timeX = u1Var2.getTimeX() + x10;
                                    float f15 = f13 / 2.0f;
                                    f7 = 3.0f;
                                    fzVar.f36430a = Utilities.clamp(timeX - f15, AndroidUtilities.displaySize.x - f13, 0.0f);
                                    fzVar.f36431b = (u1Var2.getTimeY() + y3) - f15;
                                } else {
                                    f7 = 3.0f;
                                    if (fzVar.h) {
                                        fzVar.f36430a = imageReceiver.getImageX() + x10;
                                        fzVar.f36431b = imageReceiver.getImageY() + y3;
                                    } else {
                                        float imageX = imageReceiver.getImageX() + x10;
                                        float imageY = imageReceiver.getImageY() + y3;
                                        if (fzVar.f36440m) {
                                            f11 = ((-imageReceiver.getImageWidth()) * 2.0f) + AndroidUtilities.dp(24.0f) + imageX;
                                        } else {
                                            f11 = (-AndroidUtilities.dp(24.0f)) + imageX;
                                        }
                                        fzVar.f36430a = f11;
                                        fzVar.f36431b = imageY - imageReceiver.getImageWidth();
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
                    if (!fzVar.f36432c || fzVar.f36433e + f10 < this.f36776a.f43468q9 || f10 > this.H.getMeasuredHeight() - this.f36776a.f43573ya) {
                        fzVar.f36441n = true;
                    }
                    if (fzVar.h) {
                        float f16 = fzVar.f36433e / 2.0f;
                        if (this.H.getMeasuredHeight() - f10 <= f16) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if ((f10 - this.f36776a.f43468q9) + f16 <= 0.0f) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            fzVar.f36441n = true;
                        }
                    }
                    if (fzVar.f36441n) {
                        float f17 = fzVar.f36442o;
                        if (f17 != 1.0f) {
                            float clamp = Utilities.clamp(f17 + 0.10666667f, 1.0f, 0.0f);
                            fzVar.f36442o = clamp;
                            fzVar.f36445r.setAlpha(1.0f - clamp);
                            this.f36776a.V0.invalidate();
                        }
                    }
                } else {
                    f7 = 3.0f;
                    h(fzVar);
                }
                if (!fzVar.f36439l && fzVar.f36441n) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (fzVar.h && !fzVar.f36436i) {
                        float f18 = fzVar.f36433e;
                        float f19 = 1.49926f * f18;
                        float f20 = 0.0546875f * f19;
                        float f21 = (((f18 / 2.0f) + fzVar.f36431b) - (f19 / 2.0f)) - (0.00279f * f19);
                        if (!fzVar.f36440m) {
                            fzVar.f36445r.setImageCoords(fzVar.f36430a - f20, f21, f19, f19);
                        } else {
                            fzVar.f36445r.setImageCoords(((fzVar.f36430a + fzVar.d) - f19) + f20, f21, f19, f19);
                        }
                        if (!fzVar.f36440m) {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, fzVar.f36445r.getCenterX(), fzVar.f36445r.getCenterY());
                            fzVar.f36445r.draw(canvas);
                            canvas.restore();
                        } else {
                            fzVar.f36445r.draw(canvas);
                        }
                    } else {
                        zg.d dVar = fzVar.f36437j;
                        if (dVar != null) {
                            float f22 = fzVar.f36430a + fzVar.f36434f;
                            float f23 = fzVar.f36431b + fzVar.f36435g;
                            float f24 = fzVar.d * f7;
                            dVar.e((int) f22, (int) f23, (int) (f22 + f24), (int) (f23 + f24));
                            fzVar.f36437j.b(canvas);
                        } else {
                            ImageReceiver imageReceiver2 = fzVar.f36445r;
                            float f25 = fzVar.f36430a + fzVar.f36434f;
                            float f26 = fzVar.f36431b + fzVar.f36435g;
                            float f27 = fzVar.d * f7;
                            imageReceiver2.setImageCoords(f25, f26, f27, f27);
                            if (!fzVar.f36440m) {
                                canvas.save();
                                canvas.scale(-1.0f, 1.0f, fzVar.f36445r.getCenterX(), fzVar.f36445r.getCenterY());
                                fzVar.f36445r.draw(canvas);
                                canvas.restore();
                            } else {
                                fzVar.f36445r.draw(canvas);
                            }
                        }
                    }
                }
                zg.d dVar2 = fzVar.f36437j;
                if (dVar2 != null) {
                    z11 = dVar2.c();
                } else if (fzVar.f36439l && fzVar.f36445r.getLottieAnimation() != null && fzVar.f36445r.getLottieAnimation().f28118a0 >= fzVar.f36445r.getLottieAnimation().f28124e[0] - 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (fzVar.f36442o != 1.0f && !z11 && !z10) {
                    if (fzVar.f36445r.getLottieAnimation() != null && fzVar.f36445r.getLottieAnimation().f28132k0) {
                        fzVar.f36439l = true;
                    } else if (fzVar.f36445r.getLottieAnimation() != null && !fzVar.f36445r.getLottieAnimation().f28132k0) {
                        fzVar.f36445r.getLottieAnimation().N(0, true, false);
                        fzVar.f36445r.getLottieAnimation().start();
                    }
                } else {
                    fz fzVar2 = (fz) this.F.remove(i10);
                    if (fzVar.h && fzVar.f36445r.getLottieAnimation() != null) {
                        fzVar2.f36445r.getLottieAnimation().N(0, true, true);
                    }
                    fzVar2.f36445r.onDetachedFromWindow();
                    zg.d dVar3 = fzVar2.f36437j;
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
        this.f36781n = true;
        b();
        NotificationCenter.getInstance(this.f36777b).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.f36777b).addObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.f36777b).addObserver(this, NotificationCenter.updateInterfaces);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 < arrayList.size()) {
                ((fz) arrayList.get(i10)).f36445r.onAttachedToWindow();
                if (((fz) arrayList.get(i10)).f36437j != null) {
                    ((fz) arrayList.get(i10)).f36437j.f(this.G);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        int i10 = 0;
        this.f36781n = false;
        NotificationCenter.getInstance(this.f36777b).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.f36777b).removeObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.f36777b).removeObserver(this, NotificationCenter.updateInterfaces);
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 < arrayList.size()) {
                ((fz) arrayList.get(i10)).f36445r.onDetachedFromWindow();
                if (((fz) arrayList.get(i10)).f36437j != null) {
                    ((fz) arrayList.get(i10)).f36437j.d(this.G);
                }
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final void l(org.telegram.ui.Cells.u1 u1Var, yn ynVar, boolean z10) {
        TLRPC.Document emojiAnimatedSticker;
        if (!ynVar.v() && u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() >= 0) {
            if (u1Var.getMessageObject().isPremiumSticker() || ynVar.f43326f != null) {
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
                    Integer printingStringType = MessagesController.getInstance(this.f36777b).getPrintingStringType(j3, this.J);
                    if ((printingStringType == null || printingStringType.intValue() != 5) && this.E == null && o9) {
                        org.telegram.ui.Components.rc rcVar = org.telegram.ui.Components.rc.f30330w;
                        if ((rcVar == null || !rcVar.f30340l) && SharedConfig.emojiInteractionsHintCount > 0 && UserConfig.getInstance(this.f36777b).getClientUserId() != ynVar.f43326f.f20184id) {
                            SharedConfig.updateEmojiInteractionsHintCount(SharedConfig.emojiInteractionsHintCount - 1);
                            if (u1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                                emojiAnimatedSticker = u1Var.getMessageObject().getDocument();
                            } else {
                                emojiAnimatedSticker = MediaDataController.getInstance(this.f36777b).getEmojiAnimatedSticker(u1Var.getMessageObject().getStickerEmoji());
                            }
                            org.telegram.ui.Components.vx0 vx0Var = new org.telegram.ui.Components.vx0(ynVar.getParentActivity(), null, 1, -1, emojiAnimatedSticker, ynVar.getResourceProvider());
                            vx0Var.f28927c.setVisibility(8);
                            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("EmojiInteractionTapHint", R.string.EmojiInteractionTapHint, ynVar.f43326f.first_name));
                            TextView textView = vx0Var.f28926b;
                            textView.setText(Emoji.replaceEmoji(replaceTags, textView.getPaint().getFontMetricsInt(), false));
                            textView.setTypeface(null);
                            textView.setMaxLines(3);
                            textView.setSingleLine(false);
                            i9.s sVar = new i9.s(this, org.telegram.ui.Components.rc.g(ynVar, vx0Var, 2750), false, 23);
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
                ynVar.getMessagesStorage().updateMessageCustomParams(j3, u1Var.getMessageObject().messageOwner);
            }
        }
    }

    public final void m(TLRPC.Document document) {
        if (document != null) {
            HashMap hashMap = this.K;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(document.f20043id))) {
                return;
            }
            if (this.K == null) {
                this.K = new HashMap();
            }
            this.K.put(Long.valueOf(document.f20043id), Boolean.TRUE);
            MediaDataController.getInstance(this.f36777b).preloadImage(ImageLocation.getForDocument(document), 2);
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
            if (L.contains(q6) && (arrayList = (ArrayList) this.f36779e.get(q6)) != null && !arrayList.isEmpty()) {
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
        yn ynVar = this.f36776a;
        if (ynVar != null && !MessagesController.getInstance(this.f36777b).premiumFeaturesBlocked() && ynVar.getParentActivity() != null) {
            org.telegram.ui.Components.vx0 vx0Var = new org.telegram.ui.Components.vx0(this.G.getContext(), null, 1, -1, messageObject.getDocument(), ynVar.getResourceProvider());
            vx0Var.f28926b.setText(tL_messages_stickerSet.set.title);
            vx0Var.f28927c.setText(LocaleController.getString(R.string.PremiumStickerTooltip));
            org.telegram.ui.Components.pc pcVar = new org.telegram.ui.Components.pc(ynVar.getParentActivity(), ynVar.getResourceProvider(), true);
            vx0Var.setButton(pcVar);
            pcVar.f29594a = new cu(9, this, messageObject);
            pcVar.e(LocaleController.getString(R.string.ViewAction));
            org.telegram.ui.Components.rc g10 = org.telegram.ui.Components.rc.g(ynVar, vx0Var, 2750);
            g10.f30332b = messageObject.getId();
            g10.j();
        }
    }

    public gz(yn ynVar, FrameLayout frameLayout, org.telegram.ui.Components.zl0 zl0Var, int i10, long j3, long j10) {
        this.f36776a = ynVar;
        this.G = frameLayout;
        this.H = zl0Var;
        this.f36777b = i10;
        this.I = j3;
        this.J = j10;
    }

    public void h(fz fzVar) {
    }

    public void i() {
    }
}
