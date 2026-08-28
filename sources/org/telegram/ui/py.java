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
public class py implements NotificationCenter.NotificationCenterDelegate {
    public static final HashSet H = new HashSet();
    public static final HashSet I;
    public fm A;
    public final FrameLayout C;
    public final org.telegram.ui.Components.wk0 D;
    public final long E;
    public final long F;
    public HashMap G;
    public final qn f41616a;
    public int f41617b;
    public TLRPC.TL_messages_stickerSet f41618c;
    public boolean f41621n;
    public String v;
    public ri f41626y;
    public boolean d = false;
    public final HashMap f41619e = new HashMap();
    public final HashMap f41620f = new HashMap();
    public final Random h = new Random();
    public int f41622r = -1;
    public long f41623s = 0;
    public final ArrayList f41624w = new ArrayList();
    public final ArrayList f41625x = new ArrayList();
    public final ArrayList B = new ArrayList();

    static {
        HashSet hashSet = new HashSet();
        I = hashSet;
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

    public py(int i9, FrameLayout frameLayout) {
        this.C = frameLayout;
        this.f41617b = i9;
    }

    public static boolean a(org.telegram.ui.Cells.t1 t1Var, float f10, int i9) {
        float centerY = t1Var.getPhotoImage().getCenterY() + t1Var.getY();
        if (centerY > f10 && centerY < i9) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.q(java.lang.String):java.lang.String");
    }

    public final void b() {
        if (!this.d) {
            TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.f41617b).getStickerSetByName("EmojiAnimations");
            this.f41618c = stickerSetByName;
            if (stickerSetByName == null) {
                this.f41618c = MediaDataController.getInstance(this.f41617b).getStickerSetByEmojiOrName("EmojiAnimations");
            }
            if (this.f41618c == null) {
                MediaDataController.getInstance(this.f41617b).loadStickersByEmojiOrName("EmojiAnimations", false, true);
            }
            if (this.f41618c != null) {
                HashMap hashMap = new HashMap();
                for (int i9 = 0; i9 < this.f41618c.documents.size(); i9++) {
                    hashMap.put(Long.valueOf(this.f41618c.documents.get(i9).f22386id), this.f41618c.documents.get(i9));
                }
                for (int i10 = 0; i10 < this.f41618c.packs.size(); i10++) {
                    TLRPC.TL_stickerPack tL_stickerPack = this.f41618c.packs.get(i10);
                    if (!I.contains(tL_stickerPack.emoticon) && tL_stickerPack.documents.size() > 0) {
                        String str = tL_stickerPack.emoticon;
                        HashSet hashSet = H;
                        hashSet.add(str);
                        ArrayList arrayList = new ArrayList();
                        String str2 = tL_stickerPack.emoticon;
                        HashMap hashMap2 = this.f41619e;
                        hashMap2.put(str2, arrayList);
                        for (int i11 = 0; i11 < tL_stickerPack.documents.size(); i11++) {
                            arrayList.add((TLRPC.Document) hashMap.get(tL_stickerPack.documents.get(i11)));
                        }
                        if (tL_stickerPack.emoticon.equals("❤")) {
                            String[] strArr = {"🧡", "💛", "💚", "💙", "💜", "🖤", "🤍", "🤎"};
                            for (int i12 = 0; i12 < 8; i12++) {
                                String str3 = strArr[i12];
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
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.B;
            if (i9 < arrayList.size()) {
                ((oy) arrayList.get(i9)).f41277r.onDetachedFromWindow();
                if (((oy) arrayList.get(i9)).f41269j != null) {
                    ((oy) arrayList.get(i9)).f41269j.d(this.C);
                }
                i9++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final boolean d(String str, int i9, TLRPC.Document document, MessageObject messageObject, int i10, boolean z10, boolean z11, float f10, float f11, boolean z12) {
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
        ri riVar;
        int intValue3;
        String str3;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i11 = i10;
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
        if (z14 || z13 || H.contains(str)) {
            ArrayList arrayList = (ArrayList) this.f41619e.get(str);
            if (z14 || ((arrayList != null && !arrayList.isEmpty()) || z13)) {
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    ArrayList arrayList2 = this.B;
                    if (i12 < arrayList2.size()) {
                        if (((oy) arrayList2.get(i12)).f41275p == i9) {
                            i13++;
                            if (!z14 && (((oy) arrayList2.get(i12)).f41277r.getLottieAnimation() == null || ((oy) arrayList2.get(i12)).f41277r.getLottieAnimation().w())) {
                                return false;
                            }
                        }
                        if (((oy) arrayList2.get(i12)).f41276q != null && document != null) {
                            if (((oy) arrayList2.get(i12)).f41276q.f22386id == document.f22386id) {
                                i14++;
                            }
                        }
                        i12++;
                    } else if (z10 && z13 && i13 > 0) {
                        org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f28729w;
                        if (gcVar != null && gcVar.f28731b == messageObject.getId()) {
                            return false;
                        }
                        TLRPC.InputStickerSet inputStickerSet = messageObject.getInputStickerSet();
                        if (inputStickerSet.short_name != null) {
                            tL_messages_stickerSet = MediaDataController.getInstance(this.f41617b).getStickerSetByName(inputStickerSet.short_name);
                        } else {
                            tL_messages_stickerSet = null;
                        }
                        if (tL_messages_stickerSet == null) {
                            tL_messages_stickerSet = MediaDataController.getInstance(this.f41617b).getStickerSetById(inputStickerSet.f22400id);
                        }
                        if (tL_messages_stickerSet == null) {
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = inputStickerSet;
                            ConnectionsManager.getInstance(this.f41617b).sendRequest(tL_messages_getStickerSet, new rc(25, this, messageObject));
                            return false;
                        }
                        p(tL_messages_stickerSet, messageObject);
                        return false;
                    } else if (i13 >= 4) {
                        return false;
                    } else {
                        Random random2 = this.h;
                        if (z14) {
                            TLRPC.TL_availableEffect effect = messageObject.getEffect();
                            TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.f41617b).getAvailableEffects();
                            if (availableEffects == null) {
                                return false;
                            }
                            j10 = 0;
                            long j11 = effect.effect_animation_id;
                            if (j11 == 0) {
                                j11 = effect.effect_sticker_id;
                            }
                            random = random2;
                            int i15 = 0;
                            while (true) {
                                if (i15 < availableEffects.documents.size()) {
                                    document2 = availableEffects.documents.get(i15);
                                    long j12 = j11;
                                    if (document2 != null && document2.f22386id == j12) {
                                        break;
                                    }
                                    i15++;
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
                                    if (i11 >= 0 && i11 <= arrayList.size() - 1) {
                                        intValue = i11;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                            TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                                            if (document3 != null) {
                                                HashMap hashMap = this.G;
                                                if (hashMap != null) {
                                                    bool = (Boolean) hashMap.get(Long.valueOf(document3.f22386id));
                                                } else {
                                                    bool = null;
                                                }
                                                if (bool != null && bool.booleanValue()) {
                                                    arrayList3.add(Integer.valueOf(i16));
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
                                    i11 = intValue;
                                } else {
                                    if (i11 < 0 || i11 > arrayList.size() - 1) {
                                        i11 = Math.abs(random.nextInt()) % arrayList.size();
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(i11);
                                }
                                premiumStickerAnimation = null;
                            }
                        }
                        if (document2 == null && premiumStickerAnimation == null) {
                            return false;
                        }
                        oy oyVar = new oy();
                        oyVar.h = z13;
                        oyVar.f41268i = z14;
                        if (!z14) {
                            oyVar.f41266f = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                            oyVar.f41267g = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                        }
                        oyVar.f41275p = i9;
                        oyVar.f41276q = document2;
                        oyVar.f41272m = z12;
                        oyVar.f41277r.setAllowStartAnimation(true);
                        oyVar.f41277r.setAllowLottieVibration(z10);
                        if (SharedConfig.getDevicePerformanceClass() > 1 && BuildVars.DEBUG_VERSION) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        HashMap hashMap2 = this.f41620f;
                        int i17 = i11;
                        if (premiumStickerAnimation == null) {
                            int f12 = f();
                            z16 = z13;
                            boolean z17 = z15;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.f22386id));
                            if (num == null) {
                                intValue3 = 0;
                            } else {
                                intValue3 = num.intValue();
                            }
                            int i18 = intValue3 + 1;
                            hashMap2.put(Long.valueOf(document2.f22386id), Integer.valueOf(i18));
                            ImageLocation forDocument = ImageLocation.getForDocument(document2);
                            oyVar.f41277r.setUniqKeyPrefix(i18 + "_" + oyVar.f41275p + "_");
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(f12);
                            sb2.append("_");
                            sb2.append(f12);
                            if (!z17) {
                                str3 = "";
                            } else {
                                str3 = "_pcache";
                            }
                            sb2.append(str3);
                            oyVar.f41277r.setImage(forDocument, sb2.toString(), null, "tgs", this.f41618c, 1);
                            oyVar.f41277r.setDelegate(new ny(this, oyVar, z10, messageObject));
                            if (oyVar.f41277r.getLottieAnimation() != null) {
                                oyVar.f41277r.getLottieAnimation().L(0, false, true);
                            }
                        } else {
                            z16 = z13;
                            boolean z18 = z15;
                            int f13 = f();
                            if (i14 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.f22386id));
                                if (num2 == null) {
                                    intValue2 = 0;
                                } else {
                                    intValue2 = num2.intValue();
                                }
                                hashMap2.put(Long.valueOf(document2.f22386id), Integer.valueOf((intValue2 + 1) % 4));
                                oyVar.f41277r.setUniqKeyPrefix(intValue2 + "_" + oyVar.f41275p + "_");
                            }
                            oyVar.f41276q = document2;
                            ImageLocation forDocument2 = ImageLocation.getForDocument(premiumStickerAnimation, document2);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(f13);
                            sb3.append("_");
                            sb3.append(f13);
                            if (!z18) {
                                str2 = "";
                            } else {
                                str2 = "_pcache";
                            }
                            sb3.append(str2);
                            oyVar.f41277r.setImage(forDocument2, sb3.toString(), null, "tgs", this.f41618c, 1);
                        }
                        oyVar.f41277r.setLayerNum(Integer.MAX_VALUE);
                        oyVar.f41277r.setAutoRepeat(0);
                        if (oyVar.f41277r.getLottieAnimation() != null) {
                            if (oyVar.h) {
                                oyVar.f41277r.getLottieAnimation().L(0, false, true);
                            }
                            oyVar.f41277r.getLottieAnimation().start();
                        }
                        arrayList2.add(oyVar);
                        oyVar.f41277r.onAttachedToWindow();
                        ImageReceiver imageReceiver = oyVar.f41277r;
                        FrameLayout frameLayout = this.C;
                        imageReceiver.setParentView(frameLayout);
                        frameLayout.invalidate();
                        if (z10 && !z16 && UserConfig.getInstance(this.f41617b).clientUserId != this.E) {
                            int i19 = this.f41622r;
                            if (i19 != 0 && i19 != i9 && (riVar = this.f41626y) != null) {
                                AndroidUtilities.cancelRunOnUIThread(riVar);
                                this.f41626y.run();
                            }
                            this.f41622r = i9;
                            this.v = str;
                            long j13 = this.f41623s;
                            ArrayList arrayList4 = this.f41625x;
                            ArrayList arrayList5 = this.f41624w;
                            if (j13 == j10) {
                                this.f41623s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j10));
                                arrayList4.add(Integer.valueOf(i17));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.f41623s));
                                arrayList4.add(Integer.valueOf(i17));
                            }
                            ri riVar2 = this.f41626y;
                            if (riVar2 != null) {
                                AndroidUtilities.cancelRunOnUIThread(riVar2);
                                this.f41626y = null;
                            }
                            ri riVar3 = new ri(this, 27);
                            this.f41626y = riVar3;
                            AndroidUtilities.runOnUIThread(riVar3, 500L);
                        }
                        if (z11) {
                            MessagesController.getInstance(this.f41617b).sendTyping(this.E, this.F, 11, str, 0);
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
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        Integer printingStringType;
        if (i9 == NotificationCenter.diceStickersDidLoad) {
            if ("EmojiAnimations".equals((String) objArr[0])) {
                b();
                return;
            }
            return;
        }
        int i11 = NotificationCenter.onEmojiInteractionsReceived;
        long j10 = this.E;
        if (i9 == i11) {
            if (this.f41616a != null) {
                long longValue = ((Long) objArr[0]).longValue();
                TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
                if (longValue == j10 && H.contains(tL_sendMessageEmojiInteraction.emoticon)) {
                    int i12 = tL_sendMessageEmojiInteraction.msg_id;
                    if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                        try {
                            JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                            for (int i13 = 0; i13 < jSONArray.length(); i13++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i13);
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ac0(this, i12, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                            }
                        } catch (JSONException e10) {
                            e10.printStackTrace();
                        }
                    }
                }
            }
        } else if (i9 == NotificationCenter.updateInterfaces && (printingStringType = MessagesController.getInstance(this.f41617b).getPrintingStringType(j10, this.F)) != null && printingStringType.intValue() == 5) {
            fm fmVar = this.A;
            if (fmVar != null) {
                AndroidUtilities.cancelRunOnUIThread(fmVar);
            }
            this.A = null;
        }
    }

    public final void e(Canvas canvas) {
        float f10;
        boolean z10;
        boolean z11;
        float f11;
        boolean z12;
        boolean z13;
        MessageObject messageObject;
        ImageReceiver imageReceiver;
        float f12;
        if (!this.B.isEmpty()) {
            int i9 = 0;
            while (i9 < this.B.size()) {
                oy oyVar = (oy) this.B.get(i9);
                float f13 = 3.0f;
                if (this.f41616a != null) {
                    oyVar.f41264c = false;
                    int i10 = 0;
                    while (true) {
                        if (i10 < this.D.getChildCount()) {
                            View childAt = this.D.getChildAt(i10);
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
                            if (messageObject != null && messageObject.getId() == oyVar.f41275p) {
                                oyVar.f41264c = true;
                                float x10 = childAt.getX() + this.D.getX();
                                float y10 = childAt.getY() + this.D.getY();
                                f11 = childAt.getY();
                                oyVar.d = imageReceiver.getImageWidth();
                                oyVar.f41265e = imageReceiver.getImageHeight();
                                if (oyVar.f41268i && (childAt instanceof org.telegram.ui.Cells.t1)) {
                                    org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                                    float f14 = (f() * AndroidUtilities.density) / 1.3f;
                                    float f15 = f14 / f13;
                                    oyVar.d = f15;
                                    oyVar.f41265e = f15;
                                    float timeX = t1Var2.getTimeX() + x10;
                                    float f16 = f14 / 2.0f;
                                    f10 = 3.0f;
                                    oyVar.f41262a = Utilities.clamp(timeX - f16, AndroidUtilities.displaySize.x - f14, 0.0f);
                                    oyVar.f41263b = (t1Var2.getTimeY() + y10) - f16;
                                } else {
                                    f10 = 3.0f;
                                    if (oyVar.h) {
                                        oyVar.f41262a = imageReceiver.getImageX() + x10;
                                        oyVar.f41263b = imageReceiver.getImageY() + y10;
                                    } else {
                                        float imageX = imageReceiver.getImageX() + x10;
                                        float imageY = imageReceiver.getImageY() + y10;
                                        if (oyVar.f41272m) {
                                            f12 = ((-imageReceiver.getImageWidth()) * 2.0f) + AndroidUtilities.dp(24.0f) + imageX;
                                        } else {
                                            f12 = (-AndroidUtilities.dp(24.0f)) + imageX;
                                        }
                                        oyVar.f41262a = f12;
                                        oyVar.f41263b = imageY - imageReceiver.getImageWidth();
                                    }
                                }
                            } else {
                                i10++;
                                f13 = 3.0f;
                            }
                        } else {
                            f10 = 3.0f;
                            f11 = 0.0f;
                            break;
                        }
                    }
                    if (!oyVar.f41264c || oyVar.f41265e + f11 < this.f41616a.o9 || f11 > this.D.getMeasuredHeight() - this.f41616a.f42123wa) {
                        oyVar.f41273n = true;
                    }
                    if (oyVar.h) {
                        float f17 = oyVar.f41265e / 2.0f;
                        if (this.D.getMeasuredHeight() - f11 <= f17) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if ((f11 - this.f41616a.o9) + f17 <= 0.0f) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 || z13) {
                            oyVar.f41273n = true;
                        }
                    }
                    if (oyVar.f41273n) {
                        float f18 = oyVar.f41274o;
                        if (f18 != 1.0f) {
                            float clamp = Utilities.clamp(f18 + 0.10666667f, 1.0f, 0.0f);
                            oyVar.f41274o = clamp;
                            oyVar.f41277r.setAlpha(1.0f - clamp);
                            this.f41616a.T0.invalidate();
                        }
                    }
                } else {
                    f10 = 3.0f;
                    h(oyVar);
                }
                if (!oyVar.f41271l && oyVar.f41273n) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (oyVar.h && !oyVar.f41268i) {
                        float f19 = oyVar.f41265e;
                        float f20 = 1.49926f * f19;
                        float f21 = 0.0546875f * f20;
                        float f22 = (((f19 / 2.0f) + oyVar.f41263b) - (f20 / 2.0f)) - (0.00279f * f20);
                        if (!oyVar.f41272m) {
                            oyVar.f41277r.setImageCoords(oyVar.f41262a - f21, f22, f20, f20);
                        } else {
                            oyVar.f41277r.setImageCoords(((oyVar.f41262a + oyVar.d) - f20) + f21, f22, f20, f20);
                        }
                        if (!oyVar.f41272m) {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, oyVar.f41277r.getCenterX(), oyVar.f41277r.getCenterY());
                            oyVar.f41277r.draw(canvas);
                            canvas.restore();
                        } else {
                            oyVar.f41277r.draw(canvas);
                        }
                    } else {
                        hg.d dVar = oyVar.f41269j;
                        if (dVar != null) {
                            float f23 = oyVar.f41262a + oyVar.f41266f;
                            float f24 = oyVar.f41263b + oyVar.f41267g;
                            float f25 = oyVar.d * f10;
                            dVar.e((int) f23, (int) f24, (int) (f23 + f25), (int) (f24 + f25));
                            oyVar.f41269j.b(canvas);
                        } else {
                            ImageReceiver imageReceiver2 = oyVar.f41277r;
                            float f26 = oyVar.f41262a + oyVar.f41266f;
                            float f27 = oyVar.f41263b + oyVar.f41267g;
                            float f28 = oyVar.d * f10;
                            imageReceiver2.setImageCoords(f26, f27, f28, f28);
                            if (!oyVar.f41272m) {
                                canvas.save();
                                canvas.scale(-1.0f, 1.0f, oyVar.f41277r.getCenterX(), oyVar.f41277r.getCenterY());
                                oyVar.f41277r.draw(canvas);
                                canvas.restore();
                            } else {
                                oyVar.f41277r.draw(canvas);
                            }
                        }
                    }
                }
                hg.d dVar2 = oyVar.f41269j;
                if (dVar2 != null) {
                    z11 = dVar2.c();
                } else if (oyVar.f41271l && oyVar.f41277r.getLottieAnimation() != null && oyVar.f41277r.getLottieAnimation().X >= oyVar.f41277r.getLottieAnimation().f30847e[0] - 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (oyVar.f41274o != 1.0f && !z11 && !z10) {
                    if (oyVar.f41277r.getLottieAnimation() != null && oyVar.f41277r.getLottieAnimation().f30852h0) {
                        oyVar.f41271l = true;
                    } else if (oyVar.f41277r.getLottieAnimation() != null && !oyVar.f41277r.getLottieAnimation().f30852h0) {
                        oyVar.f41277r.getLottieAnimation().L(0, true, false);
                        oyVar.f41277r.getLottieAnimation().start();
                    }
                } else {
                    oy oyVar2 = (oy) this.B.remove(i9);
                    if (oyVar.h && oyVar.f41277r.getLottieAnimation() != null) {
                        oyVar2.f41277r.getLottieAnimation().L(0, true, true);
                    }
                    oyVar2.f41277r.onDetachedFromWindow();
                    hg.d dVar3 = oyVar2.f41269j;
                    if (dVar3 != null) {
                        dVar3.d(this.C);
                    }
                    i9--;
                }
                i9++;
            }
            if (this.B.isEmpty()) {
                i();
            }
            this.C.invalidate();
        }
    }

    public final boolean g() {
        return this.B.isEmpty();
    }

    public final void j() {
        this.f41621n = true;
        b();
        NotificationCenter.getInstance(this.f41617b).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.f41617b).addObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.f41617b).addObserver(this, NotificationCenter.updateInterfaces);
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.B;
            if (i9 < arrayList.size()) {
                ((oy) arrayList.get(i9)).f41277r.onAttachedToWindow();
                if (((oy) arrayList.get(i9)).f41269j != null) {
                    ((oy) arrayList.get(i9)).f41269j.f(this.C);
                }
                i9++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        int i9 = 0;
        this.f41621n = false;
        NotificationCenter.getInstance(this.f41617b).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.f41617b).removeObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.f41617b).removeObserver(this, NotificationCenter.updateInterfaces);
        while (true) {
            ArrayList arrayList = this.B;
            if (i9 < arrayList.size()) {
                ((oy) arrayList.get(i9)).f41277r.onDetachedFromWindow();
                if (((oy) arrayList.get(i9)).f41269j != null) {
                    ((oy) arrayList.get(i9)).f41269j.d(this.C);
                }
                i9++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final void l(org.telegram.ui.Cells.t1 t1Var, qn qnVar, boolean z10) {
        TLRPC.Document emojiAnimatedSticker;
        if (!qnVar.w() && t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() >= 0) {
            if (t1Var.getMessageObject().isPremiumSticker() || qnVar.f41903f != null) {
                boolean o6 = o(t1Var, -1, z10, false);
                if (z10 && o6 && !EmojiData.hasEmojiSupportVibration(t1Var.getMessageObject().getStickerEmoji()) && !t1Var.getMessageObject().isPremiumSticker() && !t1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                    try {
                        t1Var.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                boolean isPremiumSticker = t1Var.getMessageObject().isPremiumSticker();
                long j10 = this.E;
                if (!isPremiumSticker && t1Var.getEffect() == null && (z10 || !t1Var.getMessageObject().isAnimatedEmojiStickerSingle())) {
                    Integer printingStringType = MessagesController.getInstance(this.f41617b).getPrintingStringType(j10, this.F);
                    if ((printingStringType == null || printingStringType.intValue() != 5) && this.A == null && o6) {
                        org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f28729w;
                        if ((gcVar == null || !gcVar.f28739l) && SharedConfig.emojiInteractionsHintCount > 0 && UserConfig.getInstance(this.f41617b).getClientUserId() != qnVar.f41903f.f22527id) {
                            SharedConfig.updateEmojiInteractionsHintCount(SharedConfig.emojiInteractionsHintCount - 1);
                            if (t1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                                emojiAnimatedSticker = t1Var.getMessageObject().getDocument();
                            } else {
                                emojiAnimatedSticker = MediaDataController.getInstance(this.f41617b).getEmojiAnimatedSticker(t1Var.getMessageObject().getStickerEmoji());
                            }
                            org.telegram.ui.Components.iw0 iw0Var = new org.telegram.ui.Components.iw0(qnVar.getParentActivity(), null, 1, -1, emojiAnimatedSticker, qnVar.getResourceProvider());
                            iw0Var.f27467c.setVisibility(8);
                            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("EmojiInteractionTapHint", R.string.EmojiInteractionTapHint, qnVar.f41903f.first_name));
                            TextView textView = iw0Var.f27466b;
                            textView.setText(Emoji.replaceEmoji(replaceTags, textView.getPaint().getFontMetricsInt(), false));
                            textView.setTypeface(null);
                            textView.setMaxLines(3);
                            textView.setSingleLine(false);
                            fm fmVar = new fm(2, this, org.telegram.ui.Components.gc.g(qnVar, iw0Var, 2750));
                            this.A = fmVar;
                            AndroidUtilities.runOnUIThread(fmVar, 1500L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                t1Var.getMessageObject().forcePlayEffect = false;
                t1Var.getMessageObject().messageOwner.premiumEffectWasPlayed = true;
                qnVar.getMessagesStorage().updateMessageCustomParams(j10, t1Var.getMessageObject().messageOwner);
            }
        }
    }

    public final void m(TLRPC.Document document) {
        if (document != null) {
            HashMap hashMap = this.G;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(document.f22386id))) {
                return;
            }
            if (this.G == null) {
                this.G = new HashMap();
            }
            this.G.put(Long.valueOf(document.f22386id), Boolean.TRUE);
            MediaDataController.getInstance(this.f41617b).preloadImage(ImageLocation.getForDocument(document), 2);
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
            if (H.contains(q10) && (arrayList = (ArrayList) this.f41619e.get(q10)) != null && !arrayList.isEmpty()) {
                int min = Math.min(1, arrayList.size());
                for (int i9 = 0; i9 < min; i9++) {
                    m((TLRPC.Document) arrayList.get(i9));
                }
            }
        }
    }

    public final boolean o(org.telegram.ui.Cells.t1 t1Var, int i9, boolean z10, boolean z11) {
        if (t1Var != null && this.B.size() <= 12) {
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
                        return d(q(stickerEmoji), t1Var.getMessageObject().getId(), t1Var.getMessageObject().getDocument(), messageObject, i9, z10, z11, imageWidth, imageHeight, t1Var.getMessageObject().isOutOwner());
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
        qn qnVar = this.f41616a;
        if (qnVar != null && !MessagesController.getInstance(this.f41617b).premiumFeaturesBlocked() && qnVar.getParentActivity() != null) {
            org.telegram.ui.Components.iw0 iw0Var = new org.telegram.ui.Components.iw0(this.C.getContext(), null, 1, -1, messageObject.getDocument(), qnVar.getResourceProvider());
            iw0Var.f27466b.setText(tL_messages_stickerSet.set.title);
            iw0Var.f27467c.setText(LocaleController.getString(R.string.PremiumStickerTooltip));
            org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(qnVar.getParentActivity(), qnVar.getResourceProvider(), true);
            iw0Var.setButton(ecVar);
            ecVar.f27999a = new org.telegram.ui.Components.p61(18, this, messageObject);
            ecVar.e(LocaleController.getString(R.string.ViewAction));
            org.telegram.ui.Components.gc g10 = org.telegram.ui.Components.gc.g(qnVar, iw0Var, 2750);
            g10.f28731b = messageObject.getId();
            g10.j();
        }
    }

    public py(qn qnVar, FrameLayout frameLayout, org.telegram.ui.Components.wk0 wk0Var, int i9, long j10, long j11) {
        this.f41616a = qnVar;
        this.C = frameLayout;
        this.D = wk0Var;
        this.f41617b = i9;
        this.E = j10;
        this.F = j11;
    }

    public void h(oy oyVar) {
    }

    public void i() {
    }
}
