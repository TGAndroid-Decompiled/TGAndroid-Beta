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
    public final org.telegram.ui.Components.ll0 H;
    public final long I;
    public final long J;
    public HashMap K;
    public final co f36839a;
    public int f36840b;
    public TLRPC.TL_messages_stickerSet f36841c;
    public boolean f36844n;
    public String v;
    public dj f36849y;
    public boolean d = false;
    public final HashMap f36842e = new HashMap();
    public final HashMap f36843f = new HashMap();
    public final Random h = new Random();
    public int f36845r = -1;
    public long f36846s = 0;
    public final ArrayList f36847w = new ArrayList();
    public final ArrayList f36848x = new ArrayList();
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
        this.f36840b = i10;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gz.q(java.lang.String):java.lang.String");
    }

    public final void b() {
        if (!this.d) {
            TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.f36840b).getStickerSetByName("EmojiAnimations");
            this.f36841c = stickerSetByName;
            if (stickerSetByName == null) {
                this.f36841c = MediaDataController.getInstance(this.f36840b).getStickerSetByEmojiOrName("EmojiAnimations");
            }
            if (this.f36841c == null) {
                MediaDataController.getInstance(this.f36840b).loadStickersByEmojiOrName("EmojiAnimations", false, true);
            }
            if (this.f36841c != null) {
                HashMap hashMap = new HashMap();
                for (int i10 = 0; i10 < this.f36841c.documents.size(); i10++) {
                    hashMap.put(Long.valueOf(this.f36841c.documents.get(i10).f19902id), this.f36841c.documents.get(i10));
                }
                for (int i11 = 0; i11 < this.f36841c.packs.size(); i11++) {
                    TLRPC.TL_stickerPack tL_stickerPack = this.f36841c.packs.get(i11);
                    if (!M.contains(tL_stickerPack.emoticon) && tL_stickerPack.documents.size() > 0) {
                        String str = tL_stickerPack.emoticon;
                        HashSet hashSet = L;
                        hashSet.add(str);
                        ArrayList arrayList = new ArrayList();
                        String str2 = tL_stickerPack.emoticon;
                        HashMap hashMap2 = this.f36842e;
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
                ((fz) arrayList.get(i10)).f36538r.onDetachedFromWindow();
                if (((fz) arrayList.get(i10)).f36530j != null) {
                    ((fz) arrayList.get(i10)).f36530j.d(this.G);
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
        dj djVar;
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
            ArrayList arrayList = (ArrayList) this.f36842e.get(str);
            if (z14 || ((arrayList != null && !arrayList.isEmpty()) || z13)) {
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    ArrayList arrayList2 = this.F;
                    if (i13 < arrayList2.size()) {
                        if (((fz) arrayList2.get(i13)).f36536p == i10) {
                            i14++;
                            if (!z14 && (((fz) arrayList2.get(i13)).f36538r.getLottieAnimation() == null || ((fz) arrayList2.get(i13)).f36538r.getLottieAnimation().w())) {
                                return false;
                            }
                        }
                        if (((fz) arrayList2.get(i13)).f36537q != null && document != null) {
                            if (((fz) arrayList2.get(i13)).f36537q.f19902id == document.f19902id) {
                                i15++;
                            }
                        }
                        i13++;
                    } else if (z10 && z13 && i14 > 0) {
                        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29698w;
                        if (qcVar != null && qcVar.f29700b == messageObject.getId()) {
                            return false;
                        }
                        TLRPC.InputStickerSet inputStickerSet = messageObject.getInputStickerSet();
                        if (inputStickerSet.short_name != null) {
                            tL_messages_stickerSet = MediaDataController.getInstance(this.f36840b).getStickerSetByName(inputStickerSet.short_name);
                        } else {
                            tL_messages_stickerSet = null;
                        }
                        if (tL_messages_stickerSet == null) {
                            tL_messages_stickerSet = MediaDataController.getInstance(this.f36840b).getStickerSetById(inputStickerSet.f19916id);
                        }
                        if (tL_messages_stickerSet == null) {
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = inputStickerSet;
                            ConnectionsManager.getInstance(this.f36840b).sendRequest(tL_messages_getStickerSet, new ro(18, this, messageObject));
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
                            TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.f36840b).getAvailableEffects();
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
                                    if (document2 != null && document2.f19902id == j11) {
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
                                                    bool = (Boolean) hashMap.get(Long.valueOf(document3.f19902id));
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
                        fzVar.f36529i = z14;
                        if (!z14) {
                            fzVar.f36527f = ((random.nextInt() % 101) / 100.0f) * (f7 / 4.0f);
                            fzVar.f36528g = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                        }
                        fzVar.f36536p = i10;
                        fzVar.f36537q = document2;
                        fzVar.f36533m = z12;
                        fzVar.f36538r.setAllowStartAnimation(true);
                        fzVar.f36538r.setAllowLottieVibration(z10);
                        if (SharedConfig.getDevicePerformanceClass() > 1 && BuildVars.DEBUG_VERSION) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        HashMap hashMap2 = this.f36843f;
                        int i18 = i12;
                        if (premiumStickerAnimation == null) {
                            int f11 = f();
                            z16 = z13;
                            boolean z17 = z15;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.f19902id));
                            if (num == null) {
                                intValue3 = 0;
                            } else {
                                intValue3 = num.intValue();
                            }
                            int i19 = intValue3 + 1;
                            hashMap2.put(Long.valueOf(document2.f19902id), Integer.valueOf(i19));
                            ImageLocation forDocument = ImageLocation.getForDocument(document2);
                            fzVar.f36538r.setUniqKeyPrefix(i19 + "_" + fzVar.f36536p + "_");
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
                            fzVar.f36538r.setImage(forDocument, sb2.toString(), null, "tgs", this.f36841c, 1);
                            fzVar.f36538r.setDelegate(new ez(this, fzVar, z10, messageObject));
                            if (fzVar.f36538r.getLottieAnimation() != null) {
                                fzVar.f36538r.getLottieAnimation().L(0, false, true);
                            }
                        } else {
                            z16 = z13;
                            boolean z18 = z15;
                            int f12 = f();
                            if (i15 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.f19902id));
                                if (num2 == null) {
                                    intValue2 = 0;
                                } else {
                                    intValue2 = num2.intValue();
                                }
                                hashMap2.put(Long.valueOf(document2.f19902id), Integer.valueOf((intValue2 + 1) % 4));
                                fzVar.f36538r.setUniqKeyPrefix(intValue2 + "_" + fzVar.f36536p + "_");
                            }
                            fzVar.f36537q = document2;
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
                            fzVar.f36538r.setImage(forDocument2, sb3.toString(), null, "tgs", this.f36841c, 1);
                        }
                        fzVar.f36538r.setLayerNum(Integer.MAX_VALUE);
                        fzVar.f36538r.setAutoRepeat(0);
                        if (fzVar.f36538r.getLottieAnimation() != null) {
                            if (fzVar.h) {
                                fzVar.f36538r.getLottieAnimation().L(0, false, true);
                            }
                            fzVar.f36538r.getLottieAnimation().start();
                        }
                        arrayList2.add(fzVar);
                        fzVar.f36538r.onAttachedToWindow();
                        ImageReceiver imageReceiver = fzVar.f36538r;
                        FrameLayout frameLayout = this.G;
                        imageReceiver.setParentView(frameLayout);
                        frameLayout.invalidate();
                        if (z10 && !z16 && UserConfig.getInstance(this.f36840b).clientUserId != this.I) {
                            int i20 = this.f36845r;
                            if (i20 != 0 && i20 != i10 && (djVar = this.f36849y) != null) {
                                AndroidUtilities.cancelRunOnUIThread(djVar);
                                this.f36849y.run();
                            }
                            this.f36845r = i10;
                            this.v = str;
                            long j12 = this.f36846s;
                            ArrayList arrayList4 = this.f36848x;
                            ArrayList arrayList5 = this.f36847w;
                            if (j12 == j3) {
                                this.f36846s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j3));
                                arrayList4.add(Integer.valueOf(i18));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.f36846s));
                                arrayList4.add(Integer.valueOf(i18));
                            }
                            dj djVar2 = this.f36849y;
                            if (djVar2 != null) {
                                AndroidUtilities.cancelRunOnUIThread(djVar2);
                                this.f36849y = null;
                            }
                            dj djVar3 = new dj(this, 27);
                            this.f36849y = djVar3;
                            AndroidUtilities.runOnUIThread(djVar3, 500L);
                        }
                        if (z11) {
                            MessagesController.getInstance(this.f36840b).sendTyping(this.I, this.J, 11, str, 0);
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
            if (this.f36839a != null) {
                long longValue = ((Long) objArr[0]).longValue();
                TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
                if (longValue == j3 && L.contains(tL_sendMessageEmojiInteraction.emoticon)) {
                    int i13 = tL_sendMessageEmojiInteraction.msg_id;
                    if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                        try {
                            JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i14);
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.uc0(this, i13, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                            }
                        } catch (JSONException e7) {
                            e7.printStackTrace();
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.updateInterfaces && (printingStringType = MessagesController.getInstance(this.f36840b).getPrintingStringType(j3, this.J)) != null && printingStringType.intValue() == 5) {
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
                if (this.f36839a != null) {
                    fzVar.f36525c = false;
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
                            if (messageObject != null && messageObject.getId() == fzVar.f36536p) {
                                fzVar.f36525c = true;
                                float x10 = childAt.getX() + this.H.getX();
                                float y3 = childAt.getY() + this.H.getY();
                                f10 = childAt.getY();
                                fzVar.d = imageReceiver.getImageWidth();
                                fzVar.f36526e = imageReceiver.getImageHeight();
                                if (fzVar.f36529i && (childAt instanceof org.telegram.ui.Cells.t1)) {
                                    org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                                    float f13 = (f() * AndroidUtilities.density) / 1.3f;
                                    float f14 = f13 / f12;
                                    fzVar.d = f14;
                                    fzVar.f36526e = f14;
                                    float timeX = t1Var2.getTimeX() + x10;
                                    float f15 = f13 / 2.0f;
                                    f7 = 3.0f;
                                    fzVar.f36523a = Utilities.clamp(timeX - f15, AndroidUtilities.displaySize.x - f13, 0.0f);
                                    fzVar.f36524b = (t1Var2.getTimeY() + y3) - f15;
                                } else {
                                    f7 = 3.0f;
                                    if (fzVar.h) {
                                        fzVar.f36523a = imageReceiver.getImageX() + x10;
                                        fzVar.f36524b = imageReceiver.getImageY() + y3;
                                    } else {
                                        float imageX = imageReceiver.getImageX() + x10;
                                        float imageY = imageReceiver.getImageY() + y3;
                                        if (fzVar.f36533m) {
                                            f11 = ((-imageReceiver.getImageWidth()) * 2.0f) + AndroidUtilities.dp(24.0f) + imageX;
                                        } else {
                                            f11 = (-AndroidUtilities.dp(24.0f)) + imageX;
                                        }
                                        fzVar.f36523a = f11;
                                        fzVar.f36524b = imageY - imageReceiver.getImageWidth();
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
                    if (!fzVar.f36525c || fzVar.f36526e + f10 < this.f36839a.f35445s9 || f10 > this.H.getMeasuredHeight() - this.f36839a.Aa) {
                        fzVar.f36534n = true;
                    }
                    if (fzVar.h) {
                        float f16 = fzVar.f36526e / 2.0f;
                        if (this.H.getMeasuredHeight() - f10 <= f16) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if ((f10 - this.f36839a.f35445s9) + f16 <= 0.0f) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            fzVar.f36534n = true;
                        }
                    }
                    if (fzVar.f36534n) {
                        float f17 = fzVar.f36535o;
                        if (f17 != 1.0f) {
                            float clamp = Utilities.clamp(f17 + 0.10666667f, 1.0f, 0.0f);
                            fzVar.f36535o = clamp;
                            fzVar.f36538r.setAlpha(1.0f - clamp);
                            this.f36839a.X0.invalidate();
                        }
                    }
                } else {
                    f7 = 3.0f;
                    h(fzVar);
                }
                if (!fzVar.f36532l && fzVar.f36534n) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (fzVar.h && !fzVar.f36529i) {
                        float f18 = fzVar.f36526e;
                        float f19 = 1.49926f * f18;
                        float f20 = 0.0546875f * f19;
                        float f21 = (((f18 / 2.0f) + fzVar.f36524b) - (f19 / 2.0f)) - (0.00279f * f19);
                        if (!fzVar.f36533m) {
                            fzVar.f36538r.setImageCoords(fzVar.f36523a - f20, f21, f19, f19);
                        } else {
                            fzVar.f36538r.setImageCoords(((fzVar.f36523a + fzVar.d) - f19) + f20, f21, f19, f19);
                        }
                        if (!fzVar.f36533m) {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, fzVar.f36538r.getCenterX(), fzVar.f36538r.getCenterY());
                            fzVar.f36538r.draw(canvas);
                            canvas.restore();
                        } else {
                            fzVar.f36538r.draw(canvas);
                        }
                    } else {
                        ah.e eVar = fzVar.f36530j;
                        if (eVar != null) {
                            float f22 = fzVar.f36523a + fzVar.f36527f;
                            float f23 = fzVar.f36524b + fzVar.f36528g;
                            float f24 = fzVar.d * f7;
                            eVar.e((int) f22, (int) f23, (int) (f22 + f24), (int) (f23 + f24));
                            fzVar.f36530j.b(canvas);
                        } else {
                            ImageReceiver imageReceiver2 = fzVar.f36538r;
                            float f25 = fzVar.f36523a + fzVar.f36527f;
                            float f26 = fzVar.f36524b + fzVar.f36528g;
                            float f27 = fzVar.d * f7;
                            imageReceiver2.setImageCoords(f25, f26, f27, f27);
                            if (!fzVar.f36533m) {
                                canvas.save();
                                canvas.scale(-1.0f, 1.0f, fzVar.f36538r.getCenterX(), fzVar.f36538r.getCenterY());
                                fzVar.f36538r.draw(canvas);
                                canvas.restore();
                            } else {
                                fzVar.f36538r.draw(canvas);
                            }
                        }
                    }
                }
                ah.e eVar2 = fzVar.f36530j;
                if (eVar2 != null) {
                    z11 = eVar2.c();
                } else if (fzVar.f36532l && fzVar.f36538r.getLottieAnimation() != null && fzVar.f36538r.getLottieAnimation().f32580b0 >= fzVar.f36538r.getLottieAnimation().f32584e[0] - 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (fzVar.f36535o != 1.0f && !z11 && !z10) {
                    if (fzVar.f36538r.getLottieAnimation() != null && fzVar.f36538r.getLottieAnimation().f32593l0) {
                        fzVar.f36532l = true;
                    } else if (fzVar.f36538r.getLottieAnimation() != null && !fzVar.f36538r.getLottieAnimation().f32593l0) {
                        fzVar.f36538r.getLottieAnimation().L(0, true, false);
                        fzVar.f36538r.getLottieAnimation().start();
                    }
                } else {
                    fz fzVar2 = (fz) this.F.remove(i10);
                    if (fzVar.h && fzVar.f36538r.getLottieAnimation() != null) {
                        fzVar2.f36538r.getLottieAnimation().L(0, true, true);
                    }
                    fzVar2.f36538r.onDetachedFromWindow();
                    ah.e eVar3 = fzVar2.f36530j;
                    if (eVar3 != null) {
                        eVar3.d(this.G);
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
        this.f36844n = true;
        b();
        NotificationCenter.getInstance(this.f36840b).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.f36840b).addObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.f36840b).addObserver(this, NotificationCenter.updateInterfaces);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 < arrayList.size()) {
                ((fz) arrayList.get(i10)).f36538r.onAttachedToWindow();
                if (((fz) arrayList.get(i10)).f36530j != null) {
                    ((fz) arrayList.get(i10)).f36530j.f(this.G);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        int i10 = 0;
        this.f36844n = false;
        NotificationCenter.getInstance(this.f36840b).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.f36840b).removeObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.f36840b).removeObserver(this, NotificationCenter.updateInterfaces);
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 < arrayList.size()) {
                ((fz) arrayList.get(i10)).f36538r.onDetachedFromWindow();
                if (((fz) arrayList.get(i10)).f36530j != null) {
                    ((fz) arrayList.get(i10)).f36530j.d(this.G);
                }
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final void l(org.telegram.ui.Cells.t1 t1Var, co coVar, boolean z10) {
        TLRPC.Document emojiAnimatedSticker;
        if (!coVar.v() && t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() >= 0) {
            if (t1Var.getMessageObject().isPremiumSticker() || coVar.f35276f != null) {
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
                    Integer printingStringType = MessagesController.getInstance(this.f36840b).getPrintingStringType(j3, this.J);
                    if ((printingStringType == null || printingStringType.intValue() != 5) && this.E == null && o9) {
                        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29698w;
                        if ((qcVar == null || !qcVar.f29708l) && SharedConfig.emojiInteractionsHintCount > 0 && UserConfig.getInstance(this.f36840b).getClientUserId() != coVar.f35276f.f20043id) {
                            SharedConfig.updateEmojiInteractionsHintCount(SharedConfig.emojiInteractionsHintCount - 1);
                            if (t1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                                emojiAnimatedSticker = t1Var.getMessageObject().getDocument();
                            } else {
                                emojiAnimatedSticker = MediaDataController.getInstance(this.f36840b).getEmojiAnimatedSticker(t1Var.getMessageObject().getStickerEmoji());
                            }
                            org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(coVar.getParentActivity(), null, 1, -1, emojiAnimatedSticker, coVar.getResourceProvider());
                            zw0Var.f28461c.setVisibility(8);
                            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("EmojiInteractionTapHint", R.string.EmojiInteractionTapHint, coVar.f35276f.first_name));
                            TextView textView = zw0Var.f28460b;
                            textView.setText(Emoji.replaceEmoji(replaceTags, textView.getPaint().getFontMetricsInt(), false));
                            textView.setTypeface(null);
                            textView.setMaxLines(3);
                            textView.setSingleLine(false);
                            i9.s sVar = new i9.s(this, org.telegram.ui.Components.qc.g(coVar, zw0Var, 2750), false, 23);
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
                coVar.getMessagesStorage().updateMessageCustomParams(j3, t1Var.getMessageObject().messageOwner);
            }
        }
    }

    public final void m(TLRPC.Document document) {
        if (document != null) {
            HashMap hashMap = this.K;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(document.f19902id))) {
                return;
            }
            if (this.K == null) {
                this.K = new HashMap();
            }
            this.K.put(Long.valueOf(document.f19902id), Boolean.TRUE);
            MediaDataController.getInstance(this.f36840b).preloadImage(ImageLocation.getForDocument(document), 2);
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
            if (L.contains(q6) && (arrayList = (ArrayList) this.f36842e.get(q6)) != null && !arrayList.isEmpty()) {
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
        co coVar = this.f36839a;
        if (coVar != null && !MessagesController.getInstance(this.f36840b).premiumFeaturesBlocked() && coVar.getParentActivity() != null) {
            org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(this.G.getContext(), null, 1, -1, messageObject.getDocument(), coVar.getResourceProvider());
            zw0Var.f28460b.setText(tL_messages_stickerSet.set.title);
            zw0Var.f28461c.setText(LocaleController.getString(R.string.PremiumStickerTooltip));
            org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(coVar.getParentActivity(), coVar.getResourceProvider(), true);
            zw0Var.setButton(ocVar);
            ocVar.f29056a = new yt(12, this, messageObject);
            ocVar.e(LocaleController.getString(R.string.ViewAction));
            org.telegram.ui.Components.qc g10 = org.telegram.ui.Components.qc.g(coVar, zw0Var, 2750);
            g10.f29700b = messageObject.getId();
            g10.j();
        }
    }

    public gz(co coVar, FrameLayout frameLayout, org.telegram.ui.Components.ll0 ll0Var, int i10, long j3, long j10) {
        this.f36839a = coVar;
        this.G = frameLayout;
        this.H = ll0Var;
        this.f36840b = i10;
        this.I = j3;
        this.J = j10;
    }

    public void h(fz fzVar) {
    }

    public void i() {
    }
}
