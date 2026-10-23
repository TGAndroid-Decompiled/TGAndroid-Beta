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
public class oy implements NotificationCenter.NotificationCenterDelegate {
    public static final HashSet L = new HashSet();
    public static final HashSet M;
    public j9.u E;
    public final FrameLayout G;
    public final org.telegram.ui.Components.jm0 H;
    public final long I;
    public final long J;
    public HashMap K;
    public final qn f40004a;
    public int f40005b;
    public TLRPC.TL_messages_stickerSet f40006c;
    public boolean f40008n;
    public String v;
    public ti f40013y;
    public boolean d = false;
    public final HashMap e = new HashMap();
    public final HashMap f40007f = new HashMap();
    public final Random h = new Random();
    public int f40009r = -1;
    public long f40010s = 0;
    public final ArrayList f40011w = new ArrayList();
    public final ArrayList f40012x = new ArrayList();
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

    public oy(int i10, FrameLayout frameLayout) {
        this.G = frameLayout;
        this.f40005b = i10;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oy.p(java.lang.String):java.lang.String");
    }

    public final void b() {
        if (!this.d) {
            TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.f40005b).getStickerSetByName("EmojiAnimations");
            this.f40006c = stickerSetByName;
            if (stickerSetByName == null) {
                this.f40006c = MediaDataController.getInstance(this.f40005b).getStickerSetByEmojiOrName("EmojiAnimations");
            }
            if (this.f40006c == null) {
                MediaDataController.getInstance(this.f40005b).loadStickersByEmojiOrName("EmojiAnimations", false, true);
            }
            if (this.f40006c != null) {
                HashMap hashMap = new HashMap();
                for (int i10 = 0; i10 < this.f40006c.documents.size(); i10++) {
                    hashMap.put(Long.valueOf(this.f40006c.documents.get(i10).f20286id), this.f40006c.documents.get(i10));
                }
                for (int i11 = 0; i11 < this.f40006c.packs.size(); i11++) {
                    TLRPC.TL_stickerPack tL_stickerPack = this.f40006c.packs.get(i11);
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
                ((ny) arrayList.get(i10)).f39722r.onDetachedFromWindow();
                if (((ny) arrayList.get(i10)).f39714j != null) {
                    ((ny) arrayList.get(i10)).f39714j.d(this.G);
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
        long j10;
        TLRPC.Document document2;
        int intValue;
        Boolean bool;
        TLRPC.VideoSize premiumStickerAnimation;
        boolean z15;
        boolean z16;
        String str2;
        int intValue2;
        ti tiVar;
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
                        if (((ny) arrayList2.get(i13)).f39720p == i10) {
                            i14++;
                            if (!z14 && (((ny) arrayList2.get(i13)).f39722r.getLottieAnimation() == null || ((ny) arrayList2.get(i13)).f39722r.getLottieAnimation().y())) {
                                return false;
                            }
                        }
                        if (((ny) arrayList2.get(i13)).f39721q != null && document != null) {
                            if (((ny) arrayList2.get(i13)).f39721q.f20286id == document.f20286id) {
                                i15++;
                            }
                        }
                        i13++;
                    } else if (z10 && z13 && i14 > 0) {
                        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29528w;
                        if (qcVar != null && qcVar.f29530b == messageObject.getId()) {
                            return false;
                        }
                        TLRPC.InputStickerSet inputStickerSet = messageObject.getInputStickerSet();
                        if (inputStickerSet.short_name != null) {
                            tL_messages_stickerSet = MediaDataController.getInstance(this.f40005b).getStickerSetByName(inputStickerSet.short_name);
                        } else {
                            tL_messages_stickerSet = null;
                        }
                        if (tL_messages_stickerSet == null) {
                            tL_messages_stickerSet = MediaDataController.getInstance(this.f40005b).getStickerSetById(inputStickerSet.f20300id);
                        }
                        if (tL_messages_stickerSet == null) {
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = inputStickerSet;
                            ConnectionsManager.getInstance(this.f40005b).sendRequest(tL_messages_getStickerSet, new vc(25, this, messageObject));
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
                            TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.f40005b).getAvailableEffects();
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
                                    if (document2 != null && document2.f20286id == j12) {
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
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                            }
                            premiumStickerAnimation = null;
                        } else {
                            random = random2;
                            j10 = 0;
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
                                                    bool = (Boolean) hashMap.get(Long.valueOf(document3.f20286id));
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
                        ny nyVar = new ny();
                        nyVar.h = z13;
                        nyVar.f39713i = z14;
                        if (!z14) {
                            nyVar.f39711f = ((random.nextInt() % 101) / 100.0f) * (f7 / 4.0f);
                            nyVar.f39712g = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                        }
                        nyVar.f39720p = i10;
                        nyVar.f39721q = document2;
                        nyVar.f39717m = z12;
                        nyVar.f39722r.setAllowStartAnimation(true);
                        nyVar.f39722r.setAllowLottieVibration(z10);
                        if (SharedConfig.getDevicePerformanceClass() > 1 && BuildVars.DEBUG_VERSION) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        HashMap hashMap2 = this.f40007f;
                        int i18 = i12;
                        if (premiumStickerAnimation == null) {
                            int f11 = f();
                            z16 = z13;
                            boolean z17 = z15;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.f20286id));
                            if (num == null) {
                                intValue3 = 0;
                            } else {
                                intValue3 = num.intValue();
                            }
                            int i19 = intValue3 + 1;
                            hashMap2.put(Long.valueOf(document2.f20286id), Integer.valueOf(i19));
                            ImageLocation forDocument = ImageLocation.getForDocument(document2);
                            nyVar.f39722r.setUniqKeyPrefix(i19 + "_" + nyVar.f39720p + "_");
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
                            nyVar.f39722r.setImage(forDocument, sb2.toString(), null, "tgs", this.f40006c, 1);
                            nyVar.f39722r.setDelegate(new my(this, nyVar, z10, messageObject));
                            if (nyVar.f39722r.getLottieAnimation() != null) {
                                nyVar.f39722r.getLottieAnimation().N(0, false, true);
                            }
                        } else {
                            z16 = z13;
                            boolean z18 = z15;
                            int f12 = f();
                            if (i15 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.f20286id));
                                if (num2 == null) {
                                    intValue2 = 0;
                                } else {
                                    intValue2 = num2.intValue();
                                }
                                hashMap2.put(Long.valueOf(document2.f20286id), Integer.valueOf((intValue2 + 1) % 4));
                                nyVar.f39722r.setUniqKeyPrefix(intValue2 + "_" + nyVar.f39720p + "_");
                            }
                            nyVar.f39721q = document2;
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
                            nyVar.f39722r.setImage(forDocument2, sb3.toString(), null, "tgs", this.f40006c, 1);
                        }
                        nyVar.f39722r.setLayerNum(Integer.MAX_VALUE);
                        nyVar.f39722r.setAutoRepeat(0);
                        if (nyVar.f39722r.getLottieAnimation() != null) {
                            if (nyVar.h) {
                                nyVar.f39722r.getLottieAnimation().N(0, false, true);
                            }
                            nyVar.f39722r.getLottieAnimation().start();
                        }
                        arrayList2.add(nyVar);
                        nyVar.f39722r.onAttachedToWindow();
                        ImageReceiver imageReceiver = nyVar.f39722r;
                        FrameLayout frameLayout = this.G;
                        imageReceiver.setParentView(frameLayout);
                        frameLayout.invalidate();
                        if (z10 && !z16 && UserConfig.getInstance(this.f40005b).clientUserId != this.I) {
                            int i20 = this.f40009r;
                            if (i20 != 0 && i20 != i10 && (tiVar = this.f40013y) != null) {
                                AndroidUtilities.cancelRunOnUIThread(tiVar);
                                this.f40013y.run();
                            }
                            this.f40009r = i10;
                            this.v = str;
                            int i21 = (this.f40010s > j10 ? 1 : (this.f40010s == j10 ? 0 : -1));
                            ArrayList arrayList4 = this.f40012x;
                            ArrayList arrayList5 = this.f40011w;
                            if (i21 == 0) {
                                this.f40010s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j10));
                                arrayList4.add(Integer.valueOf(i18));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.f40010s));
                                arrayList4.add(Integer.valueOf(i18));
                            }
                            ti tiVar2 = this.f40013y;
                            if (tiVar2 != null) {
                                AndroidUtilities.cancelRunOnUIThread(tiVar2);
                                this.f40013y = null;
                            }
                            ti tiVar3 = new ti(this, 28);
                            this.f40013y = tiVar3;
                            AndroidUtilities.runOnUIThread(tiVar3, 500L);
                        }
                        if (z11) {
                            MessagesController.getInstance(this.f40005b).sendTyping(this.I, this.J, 11, str, 0);
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
        long j10 = this.I;
        if (i10 == i12) {
            if (this.f40004a != null) {
                long longValue = ((Long) objArr[0]).longValue();
                TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
                if (longValue == j10 && L.contains(tL_sendMessageEmojiInteraction.emoticon)) {
                    int i13 = tL_sendMessageEmojiInteraction.msg_id;
                    if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                        try {
                            JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i14);
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.nd0(this, i13, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.updateInterfaces && (printingStringType = MessagesController.getInstance(this.f40005b).getPrintingStringType(j10, this.J)) != null && printingStringType.intValue() == 5) {
            j9.u uVar = this.E;
            if (uVar != null) {
                AndroidUtilities.cancelRunOnUIThread(uVar);
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
                ny nyVar = (ny) this.F.get(i10);
                float f12 = 3.0f;
                if (this.f40004a != null) {
                    nyVar.f39710c = false;
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
                            if (messageObject != null && messageObject.getId() == nyVar.f39720p) {
                                nyVar.f39710c = true;
                                float x10 = childAt.getX() + this.H.getX();
                                float y3 = childAt.getY() + this.H.getY();
                                f10 = childAt.getY();
                                nyVar.d = imageReceiver.getImageWidth();
                                nyVar.e = imageReceiver.getImageHeight();
                                if (nyVar.f39713i && (childAt instanceof org.telegram.ui.Cells.u1)) {
                                    org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                                    float f13 = (f() * AndroidUtilities.density) / 1.3f;
                                    float f14 = f13 / f12;
                                    nyVar.d = f14;
                                    nyVar.e = f14;
                                    float timeX = u1Var2.getTimeX() + x10;
                                    float f15 = f13 / 2.0f;
                                    f7 = f12;
                                    nyVar.f39708a = Utilities.clamp(timeX - f15, AndroidUtilities.displaySize.x - f13, 0.0f);
                                    nyVar.f39709b = (u1Var2.getTimeY() + y3) - f15;
                                } else {
                                    f7 = f12;
                                    if (nyVar.h) {
                                        nyVar.f39708a = imageReceiver.getImageX() + x10;
                                        nyVar.f39709b = imageReceiver.getImageY() + y3;
                                    } else {
                                        float imageX = imageReceiver.getImageX() + x10;
                                        float imageY = imageReceiver.getImageY() + y3;
                                        if (nyVar.f39717m) {
                                            f11 = ((-imageReceiver.getImageWidth()) * 2.0f) + AndroidUtilities.dp(24.0f) + imageX;
                                        } else {
                                            f11 = (-AndroidUtilities.dp(24.0f)) + imageX;
                                        }
                                        nyVar.f39708a = f11;
                                        nyVar.f39709b = imageY - imageReceiver.getImageWidth();
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
                    if (!nyVar.f39710c || nyVar.e + f10 < this.f40004a.f40849s9 || f10 > this.H.getMeasuredHeight() - this.f40004a.Ba) {
                        nyVar.f39718n = true;
                    }
                    if (nyVar.h) {
                        float f16 = nyVar.e / 2.0f;
                        if (this.H.getMeasuredHeight() - f10 <= f16) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if ((f10 - this.f40004a.f40849s9) + f16 <= 0.0f) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            nyVar.f39718n = true;
                        }
                    }
                    if (nyVar.f39718n) {
                        float f17 = nyVar.f39719o;
                        if (f17 != 1.0f) {
                            float clamp = Utilities.clamp(f17 + 0.10666667f, 1.0f, 0.0f);
                            nyVar.f39719o = clamp;
                            nyVar.f39722r.setAlpha(1.0f - clamp);
                            this.f40004a.X0.invalidate();
                        }
                    }
                } else {
                    f7 = 3.0f;
                    g(nyVar);
                }
                if (!nyVar.f39716l && nyVar.f39718n) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (nyVar.h && !nyVar.f39713i) {
                        float f18 = nyVar.e;
                        float f19 = 1.49926f * f18;
                        float f20 = 0.0546875f * f19;
                        float f21 = (((f18 / 2.0f) + nyVar.f39709b) - (f19 / 2.0f)) - (0.00279f * f19);
                        if (!nyVar.f39717m) {
                            nyVar.f39722r.setImageCoords(nyVar.f39708a - f20, f21, f19, f19);
                        } else {
                            nyVar.f39722r.setImageCoords(((nyVar.f39708a + nyVar.d) - f19) + f20, f21, f19, f19);
                        }
                        if (!nyVar.f39717m) {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, nyVar.f39722r.getCenterX(), nyVar.f39722r.getCenterY());
                            nyVar.f39722r.draw(canvas);
                            canvas.restore();
                        } else {
                            nyVar.f39722r.draw(canvas);
                        }
                    } else {
                        ah.e eVar = nyVar.f39714j;
                        if (eVar != null) {
                            float f22 = nyVar.f39708a + nyVar.f39711f;
                            float f23 = nyVar.f39709b + nyVar.f39712g;
                            float f24 = nyVar.d * f7;
                            eVar.e((int) f22, (int) f23, (int) (f22 + f24), (int) (f23 + f24));
                            nyVar.f39714j.b(canvas);
                        } else {
                            ImageReceiver imageReceiver2 = nyVar.f39722r;
                            float f25 = nyVar.f39708a + nyVar.f39711f;
                            float f26 = nyVar.f39709b + nyVar.f39712g;
                            float f27 = nyVar.d * f7;
                            imageReceiver2.setImageCoords(f25, f26, f27, f27);
                            if (!nyVar.f39717m) {
                                canvas.save();
                                canvas.scale(-1.0f, 1.0f, nyVar.f39722r.getCenterX(), nyVar.f39722r.getCenterY());
                                nyVar.f39722r.draw(canvas);
                                canvas.restore();
                            } else {
                                nyVar.f39722r.draw(canvas);
                            }
                        }
                    }
                }
                ah.e eVar2 = nyVar.f39714j;
                if (eVar2 != null) {
                    z11 = eVar2.c();
                } else if (nyVar.f39716l && nyVar.f39722r.getLottieAnimation() != null && nyVar.f39722r.getLottieAnimation().f31269a0 >= nyVar.f39722r.getLottieAnimation().e[0] - 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (nyVar.f39719o != 1.0f && !z11 && !z10) {
                    if (nyVar.f39722r.getLottieAnimation() != null && nyVar.f39722r.getLottieAnimation().f31282k0) {
                        nyVar.f39716l = true;
                    } else if (nyVar.f39722r.getLottieAnimation() != null && !nyVar.f39722r.getLottieAnimation().f31282k0) {
                        nyVar.f39722r.getLottieAnimation().N(0, true, false);
                        nyVar.f39722r.getLottieAnimation().start();
                    }
                } else {
                    ny nyVar2 = (ny) this.F.remove(i10);
                    if (nyVar.h && nyVar.f39722r.getLottieAnimation() != null) {
                        nyVar2.f39722r.getLottieAnimation().N(0, true, true);
                    }
                    nyVar2.f39722r.onDetachedFromWindow();
                    ah.e eVar3 = nyVar2.f39714j;
                    if (eVar3 != null) {
                        eVar3.d(this.G);
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
        this.f40008n = true;
        b();
        NotificationCenter.getInstance(this.f40005b).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.f40005b).addObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.f40005b).addObserver(this, NotificationCenter.updateInterfaces);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 < arrayList.size()) {
                ((ny) arrayList.get(i10)).f39722r.onAttachedToWindow();
                if (((ny) arrayList.get(i10)).f39714j != null) {
                    ((ny) arrayList.get(i10)).f39714j.f(this.G);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void j() {
        int i10 = 0;
        this.f40008n = false;
        NotificationCenter.getInstance(this.f40005b).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.f40005b).removeObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.f40005b).removeObserver(this, NotificationCenter.updateInterfaces);
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 < arrayList.size()) {
                ((ny) arrayList.get(i10)).f39722r.onDetachedFromWindow();
                if (((ny) arrayList.get(i10)).f39714j != null) {
                    ((ny) arrayList.get(i10)).f39714j.d(this.G);
                }
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final void k(org.telegram.ui.Cells.u1 u1Var, qn qnVar, boolean z10) {
        TLRPC.Document emojiAnimatedSticker;
        if (!qnVar.x() && u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() >= 0) {
            if (u1Var.getMessageObject().isPremiumSticker() || qnVar.f40680f != null) {
                boolean n10 = n(u1Var, -1, z10, false);
                if (z10 && n10 && !EmojiData.hasEmojiSupportVibration(u1Var.getMessageObject().getStickerEmoji()) && !u1Var.getMessageObject().isPremiumSticker() && !u1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                    try {
                        u1Var.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                boolean isPremiumSticker = u1Var.getMessageObject().isPremiumSticker();
                long j10 = this.I;
                if (!isPremiumSticker && u1Var.getEffect() == null && (z10 || !u1Var.getMessageObject().isAnimatedEmojiStickerSingle())) {
                    Integer printingStringType = MessagesController.getInstance(this.f40005b).getPrintingStringType(j10, this.J);
                    if ((printingStringType == null || printingStringType.intValue() != 5) && this.E == null && n10) {
                        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29528w;
                        if ((qcVar == null || !qcVar.f29537l) && SharedConfig.emojiInteractionsHintCount > 0 && UserConfig.getInstance(this.f40005b).getClientUserId() != qnVar.f40680f.f20427id) {
                            SharedConfig.updateEmojiInteractionsHintCount(SharedConfig.emojiInteractionsHintCount - 1);
                            if (u1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                                emojiAnimatedSticker = u1Var.getMessageObject().getDocument();
                            } else {
                                emojiAnimatedSticker = MediaDataController.getInstance(this.f40005b).getEmojiAnimatedSticker(u1Var.getMessageObject().getStickerEmoji());
                            }
                            org.telegram.ui.Components.vx0 vx0Var = new org.telegram.ui.Components.vx0(qnVar.getParentActivity(), null, 1, -1, emojiAnimatedSticker, qnVar.getResourceProvider());
                            vx0Var.f28484c.setVisibility(8);
                            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("EmojiInteractionTapHint", R.string.EmojiInteractionTapHint, qnVar.f40680f.first_name));
                            TextView textView = vx0Var.f28483b;
                            textView.setText(Emoji.replaceEmoji(replaceTags, textView.getPaint().getFontMetricsInt(), false));
                            textView.setTypeface(null);
                            textView.setMaxLines(3);
                            textView.setSingleLine(false);
                            j9.u uVar = new j9.u(this, org.telegram.ui.Components.qc.g(qnVar, vx0Var, 2750), false, 24);
                            this.E = uVar;
                            AndroidUtilities.runOnUIThread(uVar, 1500L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                u1Var.getMessageObject().forcePlayEffect = false;
                u1Var.getMessageObject().messageOwner.premiumEffectWasPlayed = true;
                qnVar.getMessagesStorage().updateMessageCustomParams(j10, u1Var.getMessageObject().messageOwner);
            }
        }
    }

    public final void l(TLRPC.Document document) {
        if (document != null) {
            HashMap hashMap = this.K;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(document.f20286id))) {
                return;
            }
            if (this.K == null) {
                this.K = new HashMap();
            }
            this.K.put(Long.valueOf(document.f20286id), Boolean.TRUE);
            MediaDataController.getInstance(this.f40005b).preloadImage(ImageLocation.getForDocument(document), 2);
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
            if (L.contains(p5) && (arrayList = (ArrayList) this.e.get(p5)) != null && !arrayList.isEmpty()) {
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
        qn qnVar = this.f40004a;
        if (qnVar != null && !MessagesController.getInstance(this.f40005b).premiumFeaturesBlocked() && qnVar.getParentActivity() != null) {
            org.telegram.ui.Components.vx0 vx0Var = new org.telegram.ui.Components.vx0(this.G.getContext(), null, 1, -1, messageObject.getDocument(), qnVar.getResourceProvider());
            vx0Var.f28483b.setText(tL_messages_stickerSet.set.title);
            vx0Var.f28484c.setText(LocaleController.getString(R.string.PremiumStickerTooltip));
            org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(qnVar.getParentActivity(), qnVar.getResourceProvider(), true);
            vx0Var.setButton(ocVar);
            ocVar.f28987a = new lt(11, this, messageObject);
            ocVar.e(LocaleController.getString(R.string.ViewAction));
            org.telegram.ui.Components.qc g10 = org.telegram.ui.Components.qc.g(qnVar, vx0Var, 2750);
            g10.f29530b = messageObject.getId();
            g10.j();
        }
    }

    public oy(qn qnVar, FrameLayout frameLayout, org.telegram.ui.Components.jm0 jm0Var, int i10, long j10, long j11) {
        this.f40004a = qnVar;
        this.G = frameLayout;
        this.H = jm0Var;
        this.f40005b = i10;
        this.I = j10;
        this.J = j11;
    }

    public void g(ny nyVar) {
    }

    public void h() {
    }
}
