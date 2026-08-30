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
public class bz implements NotificationCenter.NotificationCenterDelegate {
    public static final HashSet I = new HashSet();
    public static final HashSet J;
    public yy B;
    public final FrameLayout D;
    public final org.telegram.ui.Components.sl0 E;
    public final long F;
    public final long G;
    public HashMap H;
    public final xn f33048a;
    public int f33049b;
    public TLRPC.TL_messages_stickerSet f33050c;
    public boolean f33052n;
    public String v;
    public zi f33057y;
    public boolean d = false;
    public final HashMap e = new HashMap();
    public final HashMap f33051f = new HashMap();
    public final Random h = new Random();
    public int f33053r = -1;
    public long f33054s = 0;
    public final ArrayList f33055w = new ArrayList();
    public final ArrayList f33056x = new ArrayList();
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

    public bz(int i10, FrameLayout frameLayout) {
        this.D = frameLayout;
        this.f33049b = i10;
    }

    public static boolean a(org.telegram.ui.Cells.t1 t1Var, float f10, int i10) {
        float centerY = t1Var.getPhotoImage().getCenterY() + t1Var.getY();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bz.q(java.lang.String):java.lang.String");
    }

    public final void b() {
        if (!this.d) {
            TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.f33049b).getStickerSetByName("EmojiAnimations");
            this.f33050c = stickerSetByName;
            if (stickerSetByName == null) {
                this.f33050c = MediaDataController.getInstance(this.f33049b).getStickerSetByEmojiOrName("EmojiAnimations");
            }
            if (this.f33050c == null) {
                MediaDataController.getInstance(this.f33049b).loadStickersByEmojiOrName("EmojiAnimations", false, true);
            }
            if (this.f33050c != null) {
                HashMap hashMap = new HashMap();
                for (int i10 = 0; i10 < this.f33050c.documents.size(); i10++) {
                    hashMap.put(Long.valueOf(this.f33050c.documents.get(i10).f19190id), this.f33050c.documents.get(i10));
                }
                for (int i11 = 0; i11 < this.f33050c.packs.size(); i11++) {
                    TLRPC.TL_stickerPack tL_stickerPack = this.f33050c.packs.get(i11);
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
                ((az) arrayList.get(i10)).f32741r.onDetachedFromWindow();
                if (((az) arrayList.get(i10)).f32733j != null) {
                    ((az) arrayList.get(i10)).f32733j.d(this.D);
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
        zi ziVar;
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
                        if (((az) arrayList2.get(i13)).f32739p == i10) {
                            i14++;
                            if (!z13 && (((az) arrayList2.get(i13)).f32741r.getLottieAnimation() == null || ((az) arrayList2.get(i13)).f32741r.getLottieAnimation().w())) {
                                return false;
                            }
                        }
                        if (((az) arrayList2.get(i13)).f32740q != null && document != null) {
                            if (((az) arrayList2.get(i13)).f32740q.f19190id == document.f19190id) {
                                i15++;
                            }
                        }
                        i13++;
                    } else if (z4 && z12 && i14 > 0) {
                        org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.f25665w;
                        if (icVar != null && icVar.f25667b == messageObject.getId()) {
                            return false;
                        }
                        TLRPC.InputStickerSet inputStickerSet = messageObject.getInputStickerSet();
                        if (inputStickerSet.short_name != null) {
                            tL_messages_stickerSet = MediaDataController.getInstance(this.f33049b).getStickerSetByName(inputStickerSet.short_name);
                        } else {
                            tL_messages_stickerSet = null;
                        }
                        if (tL_messages_stickerSet == null) {
                            tL_messages_stickerSet = MediaDataController.getInstance(this.f33049b).getStickerSetById(inputStickerSet.f19204id);
                        }
                        if (tL_messages_stickerSet == null) {
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = inputStickerSet;
                            ConnectionsManager.getInstance(this.f33049b).sendRequest(tL_messages_getStickerSet, new lo(18, this, messageObject));
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
                            TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.f33049b).getAvailableEffects();
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
                                    if (document2 != null && document2.f19190id == j12) {
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
                                                    bool = (Boolean) hashMap.get(Long.valueOf(document3.f19190id));
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
                        az azVar = new az();
                        azVar.h = z12;
                        azVar.f32732i = z13;
                        if (!z13) {
                            azVar.f32730f = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                            azVar.f32731g = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                        }
                        azVar.f32739p = i10;
                        azVar.f32740q = document2;
                        azVar.f32736m = z11;
                        azVar.f32741r.setAllowStartAnimation(true);
                        azVar.f32741r.setAllowLottieVibration(z4);
                        if (SharedConfig.getDevicePerformanceClass() > 1 && BuildVars.DEBUG_VERSION) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        HashMap hashMap2 = this.f33051f;
                        int i18 = i12;
                        if (premiumStickerAnimation == null) {
                            int f12 = f();
                            z15 = z12;
                            boolean z16 = z14;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.f19190id));
                            if (num == null) {
                                intValue3 = 0;
                            } else {
                                intValue3 = num.intValue();
                            }
                            int i19 = intValue3 + 1;
                            hashMap2.put(Long.valueOf(document2.f19190id), Integer.valueOf(i19));
                            ImageLocation forDocument = ImageLocation.getForDocument(document2);
                            azVar.f32741r.setUniqKeyPrefix(i19 + "_" + azVar.f32739p + "_");
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
                            azVar.f32741r.setImage(forDocument, sb.toString(), null, "tgs", this.f33050c, 1);
                            azVar.f32741r.setDelegate(new zy(this, azVar, z4, messageObject));
                            if (azVar.f32741r.getLottieAnimation() != null) {
                                azVar.f32741r.getLottieAnimation().L(0, false, true);
                            }
                        } else {
                            z15 = z12;
                            boolean z17 = z14;
                            int f13 = f();
                            if (i15 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.f19190id));
                                if (num2 == null) {
                                    intValue2 = 0;
                                } else {
                                    intValue2 = num2.intValue();
                                }
                                hashMap2.put(Long.valueOf(document2.f19190id), Integer.valueOf((intValue2 + 1) % 4));
                                azVar.f32741r.setUniqKeyPrefix(intValue2 + "_" + azVar.f32739p + "_");
                            }
                            azVar.f32740q = document2;
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
                            azVar.f32741r.setImage(forDocument2, sb2.toString(), null, "tgs", this.f33050c, 1);
                        }
                        azVar.f32741r.setLayerNum(Integer.MAX_VALUE);
                        azVar.f32741r.setAutoRepeat(0);
                        if (azVar.f32741r.getLottieAnimation() != null) {
                            if (azVar.h) {
                                azVar.f32741r.getLottieAnimation().L(0, false, true);
                            }
                            azVar.f32741r.getLottieAnimation().start();
                        }
                        arrayList2.add(azVar);
                        azVar.f32741r.onAttachedToWindow();
                        ImageReceiver imageReceiver = azVar.f32741r;
                        FrameLayout frameLayout = this.D;
                        imageReceiver.setParentView(frameLayout);
                        frameLayout.invalidate();
                        if (z4 && !z15 && UserConfig.getInstance(this.f33049b).clientUserId != this.F) {
                            int i20 = this.f33053r;
                            if (i20 != 0 && i20 != i10 && (ziVar = this.f33057y) != null) {
                                AndroidUtilities.cancelRunOnUIThread(ziVar);
                                this.f33057y.run();
                            }
                            this.f33053r = i10;
                            this.v = str;
                            long j13 = this.f33054s;
                            ArrayList arrayList4 = this.f33056x;
                            ArrayList arrayList5 = this.f33055w;
                            if (j13 == j10) {
                                this.f33054s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j10));
                                arrayList4.add(Integer.valueOf(i18));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.f33054s));
                                arrayList4.add(Integer.valueOf(i18));
                            }
                            zi ziVar2 = this.f33057y;
                            if (ziVar2 != null) {
                                AndroidUtilities.cancelRunOnUIThread(ziVar2);
                                this.f33057y = null;
                            }
                            zi ziVar3 = new zi(this, 27);
                            this.f33057y = ziVar3;
                            AndroidUtilities.runOnUIThread(ziVar3, 500L);
                        }
                        if (z10) {
                            MessagesController.getInstance(this.f33049b).sendTyping(this.F, this.G, 11, str, 0);
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
            if (this.f33048a != null) {
                long longValue = ((Long) objArr[0]).longValue();
                TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
                if (longValue == j10 && I.contains(tL_sendMessageEmojiInteraction.emoticon)) {
                    int i13 = tL_sendMessageEmojiInteraction.msg_id;
                    if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                        try {
                            JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i14);
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vc0(this, i13, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.updateInterfaces && (printingStringType = MessagesController.getInstance(this.f33049b).getPrintingStringType(j10, this.G)) != null && printingStringType.intValue() == 5) {
            yy yyVar = this.B;
            if (yyVar != null) {
                AndroidUtilities.cancelRunOnUIThread(yyVar);
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
                az azVar = (az) this.C.get(i10);
                float f13 = 3.0f;
                if (this.f33048a != null) {
                    azVar.f32729c = false;
                    int i11 = 0;
                    while (true) {
                        if (i11 < this.E.getChildCount()) {
                            View childAt = this.E.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.t1) {
                                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                                messageObject = t1Var.getMessageObject();
                                imageReceiver = t1Var.getPhotoImage();
                            } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                                messageObject = v0Var.getMessageObject();
                                imageReceiver = v0Var.getPhotoImage();
                            } else {
                                messageObject = null;
                                imageReceiver = null;
                            }
                            if (messageObject != null && messageObject.getId() == azVar.f32739p) {
                                azVar.f32729c = true;
                                float x10 = childAt.getX() + this.E.getX();
                                float y10 = childAt.getY() + this.E.getY();
                                f11 = childAt.getY();
                                azVar.d = imageReceiver.getImageWidth();
                                azVar.e = imageReceiver.getImageHeight();
                                if (azVar.f32732i && (childAt instanceof org.telegram.ui.Cells.t1)) {
                                    org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                                    float f14 = (f() * AndroidUtilities.density) / 1.3f;
                                    float f15 = f14 / f13;
                                    azVar.d = f15;
                                    azVar.e = f15;
                                    float timeX = t1Var2.getTimeX() + x10;
                                    float f16 = f14 / 2.0f;
                                    f10 = 3.0f;
                                    azVar.f32727a = Utilities.clamp(timeX - f16, AndroidUtilities.displaySize.x - f14, 0.0f);
                                    azVar.f32728b = (t1Var2.getTimeY() + y10) - f16;
                                } else {
                                    f10 = 3.0f;
                                    if (azVar.h) {
                                        azVar.f32727a = imageReceiver.getImageX() + x10;
                                        azVar.f32728b = imageReceiver.getImageY() + y10;
                                    } else {
                                        float imageX = imageReceiver.getImageX() + x10;
                                        float imageY = imageReceiver.getImageY() + y10;
                                        if (azVar.f32736m) {
                                            f12 = ((-imageReceiver.getImageWidth()) * 2.0f) + AndroidUtilities.dp(24.0f) + imageX;
                                        } else {
                                            f12 = (-AndroidUtilities.dp(24.0f)) + imageX;
                                        }
                                        azVar.f32727a = f12;
                                        azVar.f32728b = imageY - imageReceiver.getImageWidth();
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
                    if (!azVar.f32729c || azVar.e + f11 < this.f33048a.f40141p9 || f11 > this.E.getMeasuredHeight() - this.f33048a.f40244xa) {
                        azVar.f32737n = true;
                    }
                    if (azVar.h) {
                        float f17 = azVar.e / 2.0f;
                        if (this.E.getMeasuredHeight() - f11 <= f17) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((f11 - this.f33048a.f40141p9) + f17 <= 0.0f) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z11 || z12) {
                            azVar.f32737n = true;
                        }
                    }
                    if (azVar.f32737n) {
                        float f18 = azVar.f32738o;
                        if (f18 != 1.0f) {
                            float clamp = Utilities.clamp(f18 + 0.10666667f, 1.0f, 0.0f);
                            azVar.f32738o = clamp;
                            azVar.f32741r.setAlpha(1.0f - clamp);
                            this.f33048a.U0.invalidate();
                        }
                    }
                } else {
                    f10 = 3.0f;
                    h(azVar);
                }
                if (!azVar.f32735l && azVar.f32737n) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    if (azVar.h && !azVar.f32732i) {
                        float f19 = azVar.e;
                        float f20 = 1.49926f * f19;
                        float f21 = 0.0546875f * f20;
                        float f22 = (((f19 / 2.0f) + azVar.f32728b) - (f20 / 2.0f)) - (0.00279f * f20);
                        if (!azVar.f32736m) {
                            azVar.f32741r.setImageCoords(azVar.f32727a - f21, f22, f20, f20);
                        } else {
                            azVar.f32741r.setImageCoords(((azVar.f32727a + azVar.d) - f20) + f21, f22, f20, f20);
                        }
                        if (!azVar.f32736m) {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, azVar.f32741r.getCenterX(), azVar.f32741r.getCenterY());
                            azVar.f32741r.draw(canvas);
                            canvas.restore();
                        } else {
                            azVar.f32741r.draw(canvas);
                        }
                    } else {
                        mg.d dVar = azVar.f32733j;
                        if (dVar != null) {
                            float f23 = azVar.f32727a + azVar.f32730f;
                            float f24 = azVar.f32728b + azVar.f32731g;
                            float f25 = azVar.d * f10;
                            dVar.e((int) f23, (int) f24, (int) (f23 + f25), (int) (f24 + f25));
                            azVar.f32733j.b(canvas);
                        } else {
                            ImageReceiver imageReceiver2 = azVar.f32741r;
                            float f26 = azVar.f32727a + azVar.f32730f;
                            float f27 = azVar.f32728b + azVar.f32731g;
                            float f28 = azVar.d * f10;
                            imageReceiver2.setImageCoords(f26, f27, f28, f28);
                            if (!azVar.f32736m) {
                                canvas.save();
                                canvas.scale(-1.0f, 1.0f, azVar.f32741r.getCenterX(), azVar.f32741r.getCenterY());
                                azVar.f32741r.draw(canvas);
                                canvas.restore();
                            } else {
                                azVar.f32741r.draw(canvas);
                            }
                        }
                    }
                }
                mg.d dVar2 = azVar.f32733j;
                if (dVar2 != null) {
                    z10 = dVar2.c();
                } else if (azVar.f32735l && azVar.f32741r.getLottieAnimation() != null && azVar.f32741r.getLottieAnimation().Y >= azVar.f32741r.getLottieAnimation().e[0] - 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (azVar.f32738o != 1.0f && !z10 && !z4) {
                    if (azVar.f32741r.getLottieAnimation() != null && azVar.f32741r.getLottieAnimation().f25158i0) {
                        azVar.f32735l = true;
                    } else if (azVar.f32741r.getLottieAnimation() != null && !azVar.f32741r.getLottieAnimation().f25158i0) {
                        azVar.f32741r.getLottieAnimation().L(0, true, false);
                        azVar.f32741r.getLottieAnimation().start();
                    }
                } else {
                    az azVar2 = (az) this.C.remove(i10);
                    if (azVar.h && azVar.f32741r.getLottieAnimation() != null) {
                        azVar2.f32741r.getLottieAnimation().L(0, true, true);
                    }
                    azVar2.f32741r.onDetachedFromWindow();
                    mg.d dVar3 = azVar2.f32733j;
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
        this.f33052n = true;
        b();
        NotificationCenter.getInstance(this.f33049b).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.f33049b).addObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.f33049b).addObserver(this, NotificationCenter.updateInterfaces);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.C;
            if (i10 < arrayList.size()) {
                ((az) arrayList.get(i10)).f32741r.onAttachedToWindow();
                if (((az) arrayList.get(i10)).f32733j != null) {
                    ((az) arrayList.get(i10)).f32733j.f(this.D);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        int i10 = 0;
        this.f33052n = false;
        NotificationCenter.getInstance(this.f33049b).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.f33049b).removeObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.f33049b).removeObserver(this, NotificationCenter.updateInterfaces);
        while (true) {
            ArrayList arrayList = this.C;
            if (i10 < arrayList.size()) {
                ((az) arrayList.get(i10)).f32741r.onDetachedFromWindow();
                if (((az) arrayList.get(i10)).f32733j != null) {
                    ((az) arrayList.get(i10)).f32733j.d(this.D);
                }
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final void l(org.telegram.ui.Cells.t1 t1Var, xn xnVar, boolean z4) {
        TLRPC.Document emojiAnimatedSticker;
        if (!xnVar.v() && t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() >= 0) {
            if (t1Var.getMessageObject().isPremiumSticker() || xnVar.f40009f != null) {
                boolean o10 = o(t1Var, -1, z4, false);
                if (z4 && o10 && !EmojiData.hasEmojiSupportVibration(t1Var.getMessageObject().getStickerEmoji()) && !t1Var.getMessageObject().isPremiumSticker() && !t1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                    try {
                        t1Var.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                boolean isPremiumSticker = t1Var.getMessageObject().isPremiumSticker();
                long j10 = this.F;
                if (!isPremiumSticker && t1Var.getEffect() == null && (z4 || !t1Var.getMessageObject().isAnimatedEmojiStickerSingle())) {
                    Integer printingStringType = MessagesController.getInstance(this.f33049b).getPrintingStringType(j10, this.G);
                    if ((printingStringType == null || printingStringType.intValue() != 5) && this.B == null && o10) {
                        org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.f25665w;
                        if ((icVar == null || !icVar.f25674l) && SharedConfig.emojiInteractionsHintCount > 0 && UserConfig.getInstance(this.f33049b).getClientUserId() != xnVar.f40009f.f19331id) {
                            SharedConfig.updateEmojiInteractionsHintCount(SharedConfig.emojiInteractionsHintCount - 1);
                            if (t1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                                emojiAnimatedSticker = t1Var.getMessageObject().getDocument();
                            } else {
                                emojiAnimatedSticker = MediaDataController.getInstance(this.f33049b).getEmojiAnimatedSticker(t1Var.getMessageObject().getStickerEmoji());
                            }
                            org.telegram.ui.Components.bx0 bx0Var = new org.telegram.ui.Components.bx0(xnVar.getParentActivity(), null, 1, -1, emojiAnimatedSticker, xnVar.getResourceProvider());
                            bx0Var.f24551c.setVisibility(8);
                            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("EmojiInteractionTapHint", R.string.EmojiInteractionTapHint, xnVar.f40009f.first_name));
                            TextView textView = bx0Var.f24550b;
                            textView.setText(Emoji.replaceEmoji(replaceTags, textView.getPaint().getFontMetricsInt(), false));
                            textView.setTypeface(null);
                            textView.setMaxLines(3);
                            textView.setSingleLine(false);
                            yy yyVar = new yy(0, this, org.telegram.ui.Components.ic.g(xnVar, bx0Var, 2750));
                            this.B = yyVar;
                            AndroidUtilities.runOnUIThread(yyVar, 1500L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                t1Var.getMessageObject().forcePlayEffect = false;
                t1Var.getMessageObject().messageOwner.premiumEffectWasPlayed = true;
                xnVar.getMessagesStorage().updateMessageCustomParams(j10, t1Var.getMessageObject().messageOwner);
            }
        }
    }

    public final void m(TLRPC.Document document) {
        if (document != null) {
            HashMap hashMap = this.H;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(document.f19190id))) {
                return;
            }
            if (this.H == null) {
                this.H = new HashMap();
            }
            this.H.put(Long.valueOf(document.f19190id), Boolean.TRUE);
            MediaDataController.getInstance(this.f33049b).preloadImage(ImageLocation.getForDocument(document), 2);
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
            String q10 = q(stickerEmoji);
            if (I.contains(q10) && (arrayList = (ArrayList) this.e.get(q10)) != null && !arrayList.isEmpty()) {
                int min = Math.min(1, arrayList.size());
                for (int i10 = 0; i10 < min; i10++) {
                    m((TLRPC.Document) arrayList.get(i10));
                }
            }
        }
    }

    public final boolean o(org.telegram.ui.Cells.t1 t1Var, int i10, boolean z4, boolean z10) {
        if (t1Var != null && this.C.size() <= 12) {
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
                        return d(q(stickerEmoji), t1Var.getMessageObject().getId(), t1Var.getMessageObject().getDocument(), messageObject, i10, z4, z10, imageWidth, imageHeight, t1Var.getMessageObject().isOutOwner());
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
        xn xnVar = this.f33048a;
        if (xnVar != null && !MessagesController.getInstance(this.f33049b).premiumFeaturesBlocked() && xnVar.getParentActivity() != null) {
            org.telegram.ui.Components.bx0 bx0Var = new org.telegram.ui.Components.bx0(this.D.getContext(), null, 1, -1, messageObject.getDocument(), xnVar.getResourceProvider());
            bx0Var.f24550b.setText(tL_messages_stickerSet.set.title);
            bx0Var.f24551c.setText(LocaleController.getString(R.string.PremiumStickerTooltip));
            org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(xnVar.getParentActivity(), xnVar.getResourceProvider(), true);
            bx0Var.setButton(gcVar);
            gcVar.f25097a = new org.telegram.ui.Components.k41(24, this, messageObject);
            gcVar.e(LocaleController.getString(R.string.ViewAction));
            org.telegram.ui.Components.ic g10 = org.telegram.ui.Components.ic.g(xnVar, bx0Var, 2750);
            g10.f25667b = messageObject.getId();
            g10.j();
        }
    }

    public bz(xn xnVar, FrameLayout frameLayout, org.telegram.ui.Components.sl0 sl0Var, int i10, long j10, long j11) {
        this.f33048a = xnVar;
        this.D = frameLayout;
        this.E = sl0Var;
        this.f33049b = i10;
        this.F = j10;
        this.G = j11;
    }

    public void h(az azVar) {
    }

    public void i() {
    }
}
