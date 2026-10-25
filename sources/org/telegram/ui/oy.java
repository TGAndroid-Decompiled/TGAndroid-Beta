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
    public k9.u E;
    public final FrameLayout G;
    public final org.telegram.ui.Components.mm0 H;
    public final long I;
    public final long J;
    public HashMap K;
    public final un f42301a;
    public int f42302b;
    public TLRPC.TL_messages_stickerSet f42303c;
    public boolean f42305n;
    public String v;
    public ui f42310y;
    public boolean d = false;
    public final HashMap e = new HashMap();
    public final HashMap f42304f = new HashMap();
    public final Random h = new Random();
    public int f42306r = -1;
    public long f42307s = 0;
    public final ArrayList f42308w = new ArrayList();
    public final ArrayList f42309x = new ArrayList();
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
        this.f42302b = i10;
    }

    public static boolean a(org.telegram.ui.Cells.s1 s1Var, float f7, int i10) {
        float centerY = s1Var.getPhotoImage().getCenterY() + s1Var.getY();
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
            TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.f42302b).getStickerSetByName("EmojiAnimations");
            this.f42303c = stickerSetByName;
            if (stickerSetByName == null) {
                this.f42303c = MediaDataController.getInstance(this.f42302b).getStickerSetByEmojiOrName("EmojiAnimations");
            }
            if (this.f42303c == null) {
                MediaDataController.getInstance(this.f42302b).loadStickersByEmojiOrName("EmojiAnimations", false, true);
            }
            if (this.f42303c != null) {
                HashMap hashMap = new HashMap();
                for (int i10 = 0; i10 < this.f42303c.documents.size(); i10++) {
                    hashMap.put(Long.valueOf(this.f42303c.documents.get(i10).f22033id), this.f42303c.documents.get(i10));
                }
                for (int i11 = 0; i11 < this.f42303c.packs.size(); i11++) {
                    TLRPC.TL_stickerPack tL_stickerPack = this.f42303c.packs.get(i11);
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
                ((ny) arrayList.get(i10)).f42030r.onDetachedFromWindow();
                if (((ny) arrayList.get(i10)).f42022j != null) {
                    ((ny) arrayList.get(i10)).f42022j.d(this.G);
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
        ui uiVar;
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
                        if (((ny) arrayList2.get(i13)).f42028p == i10) {
                            i14++;
                            if (!z14 && (((ny) arrayList2.get(i13)).f42030r.getLottieAnimation() == null || ((ny) arrayList2.get(i13)).f42030r.getLottieAnimation().y())) {
                                return false;
                            }
                        }
                        if (((ny) arrayList2.get(i13)).f42029q != null && document != null) {
                            if (((ny) arrayList2.get(i13)).f42029q.f22033id == document.f22033id) {
                                i15++;
                            }
                        }
                        i13++;
                    } else if (z10 && z13 && i14 > 0) {
                        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f31880x;
                        if (qcVar != null && qcVar.f31882b == messageObject.getId()) {
                            return false;
                        }
                        TLRPC.InputStickerSet inputStickerSet = messageObject.getInputStickerSet();
                        if (inputStickerSet.short_name != null) {
                            tL_messages_stickerSet = MediaDataController.getInstance(this.f42302b).getStickerSetByName(inputStickerSet.short_name);
                        } else {
                            tL_messages_stickerSet = null;
                        }
                        if (tL_messages_stickerSet == null) {
                            tL_messages_stickerSet = MediaDataController.getInstance(this.f42302b).getStickerSetById(inputStickerSet.f22047id);
                        }
                        if (tL_messages_stickerSet == null) {
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = inputStickerSet;
                            ConnectionsManager.getInstance(this.f42302b).sendRequest(tL_messages_getStickerSet, new z7(26, this, messageObject));
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
                            TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.f42302b).getAvailableEffects();
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
                                    if (document2 != null && document2.f22033id == j12) {
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
                                                    bool = (Boolean) hashMap.get(Long.valueOf(document3.f22033id));
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
                        nyVar.f42021i = z14;
                        if (!z14) {
                            nyVar.f42019f = ((random.nextInt() % 101) / 100.0f) * (f7 / 4.0f);
                            nyVar.f42020g = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                        }
                        nyVar.f42028p = i10;
                        nyVar.f42029q = document2;
                        nyVar.f42025m = z12;
                        nyVar.f42030r.setAllowStartAnimation(true);
                        nyVar.f42030r.setAllowLottieVibration(z10);
                        if (SharedConfig.getDevicePerformanceClass() > 1 && BuildVars.DEBUG_VERSION) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        HashMap hashMap2 = this.f42304f;
                        int i18 = i12;
                        if (premiumStickerAnimation == null) {
                            int f11 = f();
                            z16 = z13;
                            boolean z17 = z15;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.f22033id));
                            if (num == null) {
                                intValue3 = 0;
                            } else {
                                intValue3 = num.intValue();
                            }
                            int i19 = intValue3 + 1;
                            hashMap2.put(Long.valueOf(document2.f22033id), Integer.valueOf(i19));
                            ImageLocation forDocument = ImageLocation.getForDocument(document2);
                            nyVar.f42030r.setUniqKeyPrefix(i19 + "_" + nyVar.f42028p + "_");
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
                            nyVar.f42030r.setImage(forDocument, sb2.toString(), null, "tgs", this.f42303c, 1);
                            nyVar.f42030r.setDelegate(new my(this, nyVar, z10, messageObject));
                            if (nyVar.f42030r.getLottieAnimation() != null) {
                                nyVar.f42030r.getLottieAnimation().N(0, false, true);
                            }
                        } else {
                            z16 = z13;
                            boolean z18 = z15;
                            int f12 = f();
                            if (i15 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.f22033id));
                                if (num2 == null) {
                                    intValue2 = 0;
                                } else {
                                    intValue2 = num2.intValue();
                                }
                                hashMap2.put(Long.valueOf(document2.f22033id), Integer.valueOf((intValue2 + 1) % 4));
                                nyVar.f42030r.setUniqKeyPrefix(intValue2 + "_" + nyVar.f42028p + "_");
                            }
                            nyVar.f42029q = document2;
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
                            nyVar.f42030r.setImage(forDocument2, sb3.toString(), null, "tgs", this.f42303c, 1);
                        }
                        nyVar.f42030r.setLayerNum(Integer.MAX_VALUE);
                        nyVar.f42030r.setAutoRepeat(0);
                        if (nyVar.f42030r.getLottieAnimation() != null) {
                            if (nyVar.h) {
                                nyVar.f42030r.getLottieAnimation().N(0, false, true);
                            }
                            nyVar.f42030r.getLottieAnimation().start();
                        }
                        arrayList2.add(nyVar);
                        nyVar.f42030r.onAttachedToWindow();
                        ImageReceiver imageReceiver = nyVar.f42030r;
                        FrameLayout frameLayout = this.G;
                        imageReceiver.setParentView(frameLayout);
                        frameLayout.invalidate();
                        if (z10 && !z16 && UserConfig.getInstance(this.f42302b).clientUserId != this.I) {
                            int i20 = this.f42306r;
                            if (i20 != 0 && i20 != i10 && (uiVar = this.f42310y) != null) {
                                AndroidUtilities.cancelRunOnUIThread(uiVar);
                                this.f42310y.run();
                            }
                            this.f42306r = i10;
                            this.v = str;
                            int i21 = (this.f42307s > j10 ? 1 : (this.f42307s == j10 ? 0 : -1));
                            ArrayList arrayList4 = this.f42309x;
                            ArrayList arrayList5 = this.f42308w;
                            if (i21 == 0) {
                                this.f42307s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j10));
                                arrayList4.add(Integer.valueOf(i18));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.f42307s));
                                arrayList4.add(Integer.valueOf(i18));
                            }
                            ui uiVar2 = this.f42310y;
                            if (uiVar2 != null) {
                                AndroidUtilities.cancelRunOnUIThread(uiVar2);
                                this.f42310y = null;
                            }
                            ui uiVar3 = new ui(this, 27);
                            this.f42310y = uiVar3;
                            AndroidUtilities.runOnUIThread(uiVar3, 500L);
                        }
                        if (z11) {
                            MessagesController.getInstance(this.f42302b).sendTyping(this.I, this.J, 11, str, 0);
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
            if (this.f42301a != null) {
                long longValue = ((Long) objArr[0]).longValue();
                TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
                if (longValue == j10 && L.contains(tL_sendMessageEmojiInteraction.emoticon)) {
                    int i13 = tL_sendMessageEmojiInteraction.msg_id;
                    if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                        try {
                            JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i14);
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ld0(this, i13, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.updateInterfaces && (printingStringType = MessagesController.getInstance(this.f42302b).getPrintingStringType(j10, this.J)) != null && printingStringType.intValue() == 5) {
            k9.u uVar = this.E;
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
                if (this.f42301a != null) {
                    nyVar.f42018c = false;
                    int i11 = 0;
                    while (true) {
                        if (i11 < this.H.getChildCount()) {
                            View childAt = this.H.getChildAt(i11);
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
                            if (messageObject != null && messageObject.getId() == nyVar.f42028p) {
                                nyVar.f42018c = true;
                                float x9 = childAt.getX() + this.H.getX();
                                float y3 = childAt.getY() + this.H.getY();
                                f10 = childAt.getY();
                                nyVar.d = imageReceiver.getImageWidth();
                                nyVar.e = imageReceiver.getImageHeight();
                                if (nyVar.f42021i && (childAt instanceof org.telegram.ui.Cells.s1)) {
                                    org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                                    float f13 = (f() * AndroidUtilities.density) / 1.3f;
                                    float f14 = f13 / f12;
                                    nyVar.d = f14;
                                    nyVar.e = f14;
                                    float timeX = s1Var2.getTimeX() + x9;
                                    float f15 = f13 / 2.0f;
                                    f7 = f12;
                                    nyVar.f42016a = Utilities.clamp(timeX - f15, AndroidUtilities.displaySize.x - f13, 0.0f);
                                    nyVar.f42017b = (s1Var2.getTimeY() + y3) - f15;
                                } else {
                                    f7 = f12;
                                    if (nyVar.h) {
                                        nyVar.f42016a = imageReceiver.getImageX() + x9;
                                        nyVar.f42017b = imageReceiver.getImageY() + y3;
                                    } else {
                                        float imageX = imageReceiver.getImageX() + x9;
                                        float imageY = imageReceiver.getImageY() + y3;
                                        if (nyVar.f42025m) {
                                            f11 = ((-imageReceiver.getImageWidth()) * 2.0f) + AndroidUtilities.dp(24.0f) + imageX;
                                        } else {
                                            f11 = (-AndroidUtilities.dp(24.0f)) + imageX;
                                        }
                                        nyVar.f42016a = f11;
                                        nyVar.f42017b = imageY - imageReceiver.getImageWidth();
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
                    if (!nyVar.f42018c || nyVar.e + f10 < this.f42301a.E9 || f10 > this.H.getMeasuredHeight() - this.f42301a.Na) {
                        nyVar.f42026n = true;
                    }
                    if (nyVar.h) {
                        float f16 = nyVar.e / 2.0f;
                        if (this.H.getMeasuredHeight() - f10 <= f16) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if ((f10 - this.f42301a.E9) + f16 <= 0.0f) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            nyVar.f42026n = true;
                        }
                    }
                    if (nyVar.f42026n) {
                        float f17 = nyVar.f42027o;
                        if (f17 != 1.0f) {
                            float clamp = Utilities.clamp(f17 + 0.10666667f, 1.0f, 0.0f);
                            nyVar.f42027o = clamp;
                            nyVar.f42030r.setAlpha(1.0f - clamp);
                            this.f42301a.f44292j1.invalidate();
                        }
                    }
                } else {
                    f7 = 3.0f;
                    g(nyVar);
                }
                if (!nyVar.f42024l && nyVar.f42026n) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (nyVar.h && !nyVar.f42021i) {
                        float f18 = nyVar.e;
                        float f19 = 1.49926f * f18;
                        float f20 = 0.0546875f * f19;
                        float f21 = (((f18 / 2.0f) + nyVar.f42017b) - (f19 / 2.0f)) - (0.00279f * f19);
                        if (!nyVar.f42025m) {
                            nyVar.f42030r.setImageCoords(nyVar.f42016a - f20, f21, f19, f19);
                        } else {
                            nyVar.f42030r.setImageCoords(((nyVar.f42016a + nyVar.d) - f19) + f20, f21, f19, f19);
                        }
                        if (!nyVar.f42025m) {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, nyVar.f42030r.getCenterX(), nyVar.f42030r.getCenterY());
                            nyVar.f42030r.draw(canvas);
                            canvas.restore();
                        } else {
                            nyVar.f42030r.draw(canvas);
                        }
                    } else {
                        bh.e eVar = nyVar.f42022j;
                        if (eVar != null) {
                            float f22 = nyVar.f42016a + nyVar.f42019f;
                            float f23 = nyVar.f42017b + nyVar.f42020g;
                            float f24 = nyVar.d * f7;
                            eVar.e((int) f22, (int) f23, (int) (f22 + f24), (int) (f23 + f24));
                            nyVar.f42022j.b(canvas);
                        } else {
                            ImageReceiver imageReceiver2 = nyVar.f42030r;
                            float f25 = nyVar.f42016a + nyVar.f42019f;
                            float f26 = nyVar.f42017b + nyVar.f42020g;
                            float f27 = nyVar.d * f7;
                            imageReceiver2.setImageCoords(f25, f26, f27, f27);
                            if (!nyVar.f42025m) {
                                canvas.save();
                                canvas.scale(-1.0f, 1.0f, nyVar.f42030r.getCenterX(), nyVar.f42030r.getCenterY());
                                nyVar.f42030r.draw(canvas);
                                canvas.restore();
                            } else {
                                nyVar.f42030r.draw(canvas);
                            }
                        }
                    }
                }
                bh.e eVar2 = nyVar.f42022j;
                if (eVar2 != null) {
                    z11 = eVar2.c();
                } else if (nyVar.f42024l && nyVar.f42030r.getLottieAnimation() != null && nyVar.f42030r.getLottieAnimation().f34733a0 >= nyVar.f42030r.getLottieAnimation().e[0] - 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (nyVar.f42027o != 1.0f && !z11 && !z10) {
                    if (nyVar.f42030r.getLottieAnimation() != null && nyVar.f42030r.getLottieAnimation().f34746k0) {
                        nyVar.f42024l = true;
                    } else if (nyVar.f42030r.getLottieAnimation() != null && !nyVar.f42030r.getLottieAnimation().f34746k0) {
                        nyVar.f42030r.getLottieAnimation().N(0, true, false);
                        nyVar.f42030r.getLottieAnimation().start();
                    }
                } else {
                    ny nyVar2 = (ny) this.F.remove(i10);
                    if (nyVar.h && nyVar.f42030r.getLottieAnimation() != null) {
                        nyVar2.f42030r.getLottieAnimation().N(0, true, true);
                    }
                    nyVar2.f42030r.onDetachedFromWindow();
                    bh.e eVar3 = nyVar2.f42022j;
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
        this.f42305n = true;
        b();
        NotificationCenter.getInstance(this.f42302b).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.f42302b).addObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.f42302b).addObserver(this, NotificationCenter.updateInterfaces);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 < arrayList.size()) {
                ((ny) arrayList.get(i10)).f42030r.onAttachedToWindow();
                if (((ny) arrayList.get(i10)).f42022j != null) {
                    ((ny) arrayList.get(i10)).f42022j.f(this.G);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void j() {
        int i10 = 0;
        this.f42305n = false;
        NotificationCenter.getInstance(this.f42302b).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.f42302b).removeObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.f42302b).removeObserver(this, NotificationCenter.updateInterfaces);
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 < arrayList.size()) {
                ((ny) arrayList.get(i10)).f42030r.onDetachedFromWindow();
                if (((ny) arrayList.get(i10)).f42022j != null) {
                    ((ny) arrayList.get(i10)).f42022j.d(this.G);
                }
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final void k(org.telegram.ui.Cells.s1 s1Var, un unVar, boolean z10) {
        TLRPC.Document emojiAnimatedSticker;
        if (!unVar.w() && s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() >= 0) {
            if (s1Var.getMessageObject().isPremiumSticker() || unVar.f44242f != null) {
                boolean n10 = n(s1Var, -1, z10, false);
                if (z10 && n10 && !EmojiData.hasEmojiSupportVibration(s1Var.getMessageObject().getStickerEmoji()) && !s1Var.getMessageObject().isPremiumSticker() && !s1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                    try {
                        s1Var.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                boolean isPremiumSticker = s1Var.getMessageObject().isPremiumSticker();
                long j10 = this.I;
                if (!isPremiumSticker && s1Var.getEffect() == null && (z10 || !s1Var.getMessageObject().isAnimatedEmojiStickerSingle())) {
                    Integer printingStringType = MessagesController.getInstance(this.f42302b).getPrintingStringType(j10, this.J);
                    if ((printingStringType == null || printingStringType.intValue() != 5) && this.E == null && n10) {
                        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f31880x;
                        if ((qcVar == null || !qcVar.f31890m) && SharedConfig.emojiInteractionsHintCount > 0 && UserConfig.getInstance(this.f42302b).getClientUserId() != unVar.f44242f.f22174id) {
                            SharedConfig.updateEmojiInteractionsHintCount(SharedConfig.emojiInteractionsHintCount - 1);
                            if (s1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                                emojiAnimatedSticker = s1Var.getMessageObject().getDocument();
                            } else {
                                emojiAnimatedSticker = MediaDataController.getInstance(this.f42302b).getEmojiAnimatedSticker(s1Var.getMessageObject().getStickerEmoji());
                            }
                            org.telegram.ui.Components.gy0 gy0Var = new org.telegram.ui.Components.gy0(unVar.getParentActivity(), null, 1, -1, emojiAnimatedSticker, unVar.getResourceProvider());
                            gy0Var.f30519c.setVisibility(8);
                            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("EmojiInteractionTapHint", R.string.EmojiInteractionTapHint, unVar.f44242f.first_name));
                            TextView textView = gy0Var.f30518b;
                            textView.setText(Emoji.replaceEmoji(replaceTags, textView.getPaint().getFontMetricsInt(), false));
                            textView.setTypeface(null);
                            textView.setMaxLines(3);
                            textView.setSingleLine(false);
                            k9.u uVar = new k9.u(this, org.telegram.ui.Components.qc.g(unVar, gy0Var, 2750), false, 24);
                            this.E = uVar;
                            AndroidUtilities.runOnUIThread(uVar, 1500L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                s1Var.getMessageObject().forcePlayEffect = false;
                s1Var.getMessageObject().messageOwner.premiumEffectWasPlayed = true;
                unVar.getMessagesStorage().updateMessageCustomParams(j10, s1Var.getMessageObject().messageOwner);
            }
        }
    }

    public final void l(TLRPC.Document document) {
        if (document != null) {
            HashMap hashMap = this.K;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(document.f22033id))) {
                return;
            }
            if (this.K == null) {
                this.K = new HashMap();
            }
            this.K.put(Long.valueOf(document.f22033id), Boolean.TRUE);
            MediaDataController.getInstance(this.f42302b).preloadImage(ImageLocation.getForDocument(document), 2);
        }
    }

    public final void m(org.telegram.ui.Cells.s1 s1Var) {
        ArrayList arrayList;
        MessageObject messageObject = s1Var.getMessageObject();
        if (!messageObject.isPremiumSticker()) {
            String stickerEmoji = messageObject.getStickerEmoji();
            if (stickerEmoji == null) {
                stickerEmoji = messageObject.messageOwner.message;
            }
            String p10 = p(stickerEmoji);
            if (L.contains(p10) && (arrayList = (ArrayList) this.e.get(p10)) != null && !arrayList.isEmpty()) {
                int min = Math.min(1, arrayList.size());
                for (int i10 = 0; i10 < min; i10++) {
                    l((TLRPC.Document) arrayList.get(i10));
                }
            }
        }
    }

    public final boolean n(org.telegram.ui.Cells.s1 s1Var, int i10, boolean z10, boolean z11) {
        if (s1Var != null && this.F.size() <= 12) {
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
                        return d(p(stickerEmoji), s1Var.getMessageObject().getId(), s1Var.getMessageObject().getDocument(), messageObject, i10, z10, z11, imageWidth, imageHeight, s1Var.getMessageObject().isOutOwner());
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
        un unVar = this.f42301a;
        if (unVar != null && !MessagesController.getInstance(this.f42302b).premiumFeaturesBlocked() && unVar.getParentActivity() != null) {
            org.telegram.ui.Components.gy0 gy0Var = new org.telegram.ui.Components.gy0(this.G.getContext(), null, 1, -1, messageObject.getDocument(), unVar.getResourceProvider());
            gy0Var.f30518b.setText(tL_messages_stickerSet.set.title);
            gy0Var.f30519c.setText(LocaleController.getString(R.string.PremiumStickerTooltip));
            org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(unVar.getParentActivity(), unVar.getResourceProvider(), true);
            gy0Var.setButton(ocVar);
            ocVar.f31253b = new org.telegram.ui.Components.c71(28, this, messageObject);
            ocVar.e(LocaleController.getString(R.string.ViewAction));
            org.telegram.ui.Components.qc g7 = org.telegram.ui.Components.qc.g(unVar, gy0Var, 2750);
            g7.f31882b = messageObject.getId();
            g7.j();
        }
    }

    public oy(un unVar, FrameLayout frameLayout, org.telegram.ui.Components.mm0 mm0Var, int i10, long j10, long j11) {
        this.f42301a = unVar;
        this.G = frameLayout;
        this.H = mm0Var;
        this.f42302b = i10;
        this.I = j10;
        this.J = j11;
    }

    public void h() {
    }

    public void g(ny nyVar) {
    }
}
