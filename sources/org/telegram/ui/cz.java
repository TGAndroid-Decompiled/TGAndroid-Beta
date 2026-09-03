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
public class cz implements NotificationCenter.NotificationCenterDelegate {
    public static final HashSet I = new HashSet();
    public static final HashSet J;
    public zy B;
    public final FrameLayout D;
    public final org.telegram.ui.Components.sl0 E;
    public final long F;
    public final long G;
    public HashMap H;
    public final xn f35903a;
    public int f35904b;
    public TLRPC.TL_messages_stickerSet f35905c;
    public boolean f35908n;
    public String v;
    public zi f35913y;
    public boolean d = false;
    public final HashMap f35906e = new HashMap();
    public final HashMap f35907f = new HashMap();
    public final Random h = new Random();
    public int f35909r = -1;
    public long f35910s = 0;
    public final ArrayList f35911w = new ArrayList();
    public final ArrayList f35912x = new ArrayList();
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

    public cz(int i10, FrameLayout frameLayout) {
        this.D = frameLayout;
        this.f35904b = i10;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cz.q(java.lang.String):java.lang.String");
    }

    public final void b() {
        if (!this.d) {
            TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.f35904b).getStickerSetByName("EmojiAnimations");
            this.f35905c = stickerSetByName;
            if (stickerSetByName == null) {
                this.f35905c = MediaDataController.getInstance(this.f35904b).getStickerSetByEmojiOrName("EmojiAnimations");
            }
            if (this.f35905c == null) {
                MediaDataController.getInstance(this.f35904b).loadStickersByEmojiOrName("EmojiAnimations", false, true);
            }
            if (this.f35905c != null) {
                HashMap hashMap = new HashMap();
                for (int i10 = 0; i10 < this.f35905c.documents.size(); i10++) {
                    hashMap.put(Long.valueOf(this.f35905c.documents.get(i10).f20851id), this.f35905c.documents.get(i10));
                }
                for (int i11 = 0; i11 < this.f35905c.packs.size(); i11++) {
                    TLRPC.TL_stickerPack tL_stickerPack = this.f35905c.packs.get(i11);
                    if (!J.contains(tL_stickerPack.emoticon) && tL_stickerPack.documents.size() > 0) {
                        String str = tL_stickerPack.emoticon;
                        HashSet hashSet = I;
                        hashSet.add(str);
                        ArrayList arrayList = new ArrayList();
                        String str2 = tL_stickerPack.emoticon;
                        HashMap hashMap2 = this.f35906e;
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
                ((bz) arrayList.get(i10)).f35638r.onDetachedFromWindow();
                if (((bz) arrayList.get(i10)).f35630j != null) {
                    ((bz) arrayList.get(i10)).f35630j.d(this.D);
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
            ArrayList arrayList = (ArrayList) this.f35906e.get(str);
            if (z13 || ((arrayList != null && !arrayList.isEmpty()) || z12)) {
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    ArrayList arrayList2 = this.C;
                    if (i13 < arrayList2.size()) {
                        if (((bz) arrayList2.get(i13)).f35636p == i10) {
                            i14++;
                            if (!z13 && (((bz) arrayList2.get(i13)).f35638r.getLottieAnimation() == null || ((bz) arrayList2.get(i13)).f35638r.getLottieAnimation().w())) {
                                return false;
                            }
                        }
                        if (((bz) arrayList2.get(i13)).f35637q != null && document != null) {
                            if (((bz) arrayList2.get(i13)).f35637q.f20851id == document.f20851id) {
                                i15++;
                            }
                        }
                        i13++;
                    } else if (z4 && z12 && i14 > 0) {
                        org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.f27770w;
                        if (icVar != null && icVar.f27772b == messageObject.getId()) {
                            return false;
                        }
                        TLRPC.InputStickerSet inputStickerSet = messageObject.getInputStickerSet();
                        if (inputStickerSet.short_name != null) {
                            tL_messages_stickerSet = MediaDataController.getInstance(this.f35904b).getStickerSetByName(inputStickerSet.short_name);
                        } else {
                            tL_messages_stickerSet = null;
                        }
                        if (tL_messages_stickerSet == null) {
                            tL_messages_stickerSet = MediaDataController.getInstance(this.f35904b).getStickerSetById(inputStickerSet.f20865id);
                        }
                        if (tL_messages_stickerSet == null) {
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = inputStickerSet;
                            ConnectionsManager.getInstance(this.f35904b).sendRequest(tL_messages_getStickerSet, new lo(18, this, messageObject));
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
                            TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.f35904b).getAvailableEffects();
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
                                    if (document2 != null && document2.f20851id == j12) {
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
                                                    bool = (Boolean) hashMap.get(Long.valueOf(document3.f20851id));
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
                        bz bzVar = new bz();
                        bzVar.h = z12;
                        bzVar.f35629i = z13;
                        if (!z13) {
                            bzVar.f35627f = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                            bzVar.f35628g = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                        }
                        bzVar.f35636p = i10;
                        bzVar.f35637q = document2;
                        bzVar.f35633m = z11;
                        bzVar.f35638r.setAllowStartAnimation(true);
                        bzVar.f35638r.setAllowLottieVibration(z4);
                        if (SharedConfig.getDevicePerformanceClass() > 1 && BuildVars.DEBUG_VERSION) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        HashMap hashMap2 = this.f35907f;
                        int i18 = i12;
                        if (premiumStickerAnimation == null) {
                            int f12 = f();
                            z15 = z12;
                            boolean z16 = z14;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.f20851id));
                            if (num == null) {
                                intValue3 = 0;
                            } else {
                                intValue3 = num.intValue();
                            }
                            int i19 = intValue3 + 1;
                            hashMap2.put(Long.valueOf(document2.f20851id), Integer.valueOf(i19));
                            ImageLocation forDocument = ImageLocation.getForDocument(document2);
                            bzVar.f35638r.setUniqKeyPrefix(i19 + "_" + bzVar.f35636p + "_");
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
                            bzVar.f35638r.setImage(forDocument, sb.toString(), null, "tgs", this.f35905c, 1);
                            bzVar.f35638r.setDelegate(new az(this, bzVar, z4, messageObject));
                            if (bzVar.f35638r.getLottieAnimation() != null) {
                                bzVar.f35638r.getLottieAnimation().L(0, false, true);
                            }
                        } else {
                            z15 = z12;
                            boolean z17 = z14;
                            int f13 = f();
                            if (i15 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.f20851id));
                                if (num2 == null) {
                                    intValue2 = 0;
                                } else {
                                    intValue2 = num2.intValue();
                                }
                                hashMap2.put(Long.valueOf(document2.f20851id), Integer.valueOf((intValue2 + 1) % 4));
                                bzVar.f35638r.setUniqKeyPrefix(intValue2 + "_" + bzVar.f35636p + "_");
                            }
                            bzVar.f35637q = document2;
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
                            bzVar.f35638r.setImage(forDocument2, sb2.toString(), null, "tgs", this.f35905c, 1);
                        }
                        bzVar.f35638r.setLayerNum(Integer.MAX_VALUE);
                        bzVar.f35638r.setAutoRepeat(0);
                        if (bzVar.f35638r.getLottieAnimation() != null) {
                            if (bzVar.h) {
                                bzVar.f35638r.getLottieAnimation().L(0, false, true);
                            }
                            bzVar.f35638r.getLottieAnimation().start();
                        }
                        arrayList2.add(bzVar);
                        bzVar.f35638r.onAttachedToWindow();
                        ImageReceiver imageReceiver = bzVar.f35638r;
                        FrameLayout frameLayout = this.D;
                        imageReceiver.setParentView(frameLayout);
                        frameLayout.invalidate();
                        if (z4 && !z15 && UserConfig.getInstance(this.f35904b).clientUserId != this.F) {
                            int i20 = this.f35909r;
                            if (i20 != 0 && i20 != i10 && (ziVar = this.f35913y) != null) {
                                AndroidUtilities.cancelRunOnUIThread(ziVar);
                                this.f35913y.run();
                            }
                            this.f35909r = i10;
                            this.v = str;
                            long j13 = this.f35910s;
                            ArrayList arrayList4 = this.f35912x;
                            ArrayList arrayList5 = this.f35911w;
                            if (j13 == j10) {
                                this.f35910s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j10));
                                arrayList4.add(Integer.valueOf(i18));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.f35910s));
                                arrayList4.add(Integer.valueOf(i18));
                            }
                            zi ziVar2 = this.f35913y;
                            if (ziVar2 != null) {
                                AndroidUtilities.cancelRunOnUIThread(ziVar2);
                                this.f35913y = null;
                            }
                            zi ziVar3 = new zi(this, 27);
                            this.f35913y = ziVar3;
                            AndroidUtilities.runOnUIThread(ziVar3, 500L);
                        }
                        if (z10) {
                            MessagesController.getInstance(this.f35904b).sendTyping(this.F, this.G, 11, str, 0);
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
            if (this.f35903a != null) {
                long longValue = ((Long) objArr[0]).longValue();
                TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
                if (longValue == j10 && I.contains(tL_sendMessageEmojiInteraction.emoticon)) {
                    int i13 = tL_sendMessageEmojiInteraction.msg_id;
                    if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                        try {
                            JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i14);
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.xc0(this, i13, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                            }
                        } catch (JSONException e6) {
                            e6.printStackTrace();
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.updateInterfaces && (printingStringType = MessagesController.getInstance(this.f35904b).getPrintingStringType(j10, this.G)) != null && printingStringType.intValue() == 5) {
            zy zyVar = this.B;
            if (zyVar != null) {
                AndroidUtilities.cancelRunOnUIThread(zyVar);
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
                bz bzVar = (bz) this.C.get(i10);
                float f13 = 3.0f;
                if (this.f35903a != null) {
                    bzVar.f35625c = false;
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
                            if (messageObject != null && messageObject.getId() == bzVar.f35636p) {
                                bzVar.f35625c = true;
                                float x10 = childAt.getX() + this.E.getX();
                                float y10 = childAt.getY() + this.E.getY();
                                f11 = childAt.getY();
                                bzVar.d = imageReceiver.getImageWidth();
                                bzVar.f35626e = imageReceiver.getImageHeight();
                                if (bzVar.f35629i && (childAt instanceof org.telegram.ui.Cells.t1)) {
                                    org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                                    float f14 = (f() * AndroidUtilities.density) / 1.3f;
                                    float f15 = f14 / f13;
                                    bzVar.d = f15;
                                    bzVar.f35626e = f15;
                                    float timeX = t1Var2.getTimeX() + x10;
                                    float f16 = f14 / 2.0f;
                                    f10 = 3.0f;
                                    bzVar.f35623a = Utilities.clamp(timeX - f16, AndroidUtilities.displaySize.x - f14, 0.0f);
                                    bzVar.f35624b = (t1Var2.getTimeY() + y10) - f16;
                                } else {
                                    f10 = 3.0f;
                                    if (bzVar.h) {
                                        bzVar.f35623a = imageReceiver.getImageX() + x10;
                                        bzVar.f35624b = imageReceiver.getImageY() + y10;
                                    } else {
                                        float imageX = imageReceiver.getImageX() + x10;
                                        float imageY = imageReceiver.getImageY() + y10;
                                        if (bzVar.f35633m) {
                                            f12 = ((-imageReceiver.getImageWidth()) * 2.0f) + AndroidUtilities.dp(24.0f) + imageX;
                                        } else {
                                            f12 = (-AndroidUtilities.dp(24.0f)) + imageX;
                                        }
                                        bzVar.f35623a = f12;
                                        bzVar.f35624b = imageY - imageReceiver.getImageWidth();
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
                    if (!bzVar.f35625c || bzVar.f35626e + f11 < this.f35903a.f43288p9 || f11 > this.E.getMeasuredHeight() - this.f35903a.f43391xa) {
                        bzVar.f35634n = true;
                    }
                    if (bzVar.h) {
                        float f17 = bzVar.f35626e / 2.0f;
                        if (this.E.getMeasuredHeight() - f11 <= f17) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((f11 - this.f35903a.f43288p9) + f17 <= 0.0f) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z11 || z12) {
                            bzVar.f35634n = true;
                        }
                    }
                    if (bzVar.f35634n) {
                        float f18 = bzVar.f35635o;
                        if (f18 != 1.0f) {
                            float clamp = Utilities.clamp(f18 + 0.10666667f, 1.0f, 0.0f);
                            bzVar.f35635o = clamp;
                            bzVar.f35638r.setAlpha(1.0f - clamp);
                            this.f35903a.U0.invalidate();
                        }
                    }
                } else {
                    f10 = 3.0f;
                    h(bzVar);
                }
                if (!bzVar.f35632l && bzVar.f35634n) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    if (bzVar.h && !bzVar.f35629i) {
                        float f19 = bzVar.f35626e;
                        float f20 = 1.49926f * f19;
                        float f21 = 0.0546875f * f20;
                        float f22 = (((f19 / 2.0f) + bzVar.f35624b) - (f20 / 2.0f)) - (0.00279f * f20);
                        if (!bzVar.f35633m) {
                            bzVar.f35638r.setImageCoords(bzVar.f35623a - f21, f22, f20, f20);
                        } else {
                            bzVar.f35638r.setImageCoords(((bzVar.f35623a + bzVar.d) - f20) + f21, f22, f20, f20);
                        }
                        if (!bzVar.f35633m) {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, bzVar.f35638r.getCenterX(), bzVar.f35638r.getCenterY());
                            bzVar.f35638r.draw(canvas);
                            canvas.restore();
                        } else {
                            bzVar.f35638r.draw(canvas);
                        }
                    } else {
                        ng.d dVar = bzVar.f35630j;
                        if (dVar != null) {
                            float f23 = bzVar.f35623a + bzVar.f35627f;
                            float f24 = bzVar.f35624b + bzVar.f35628g;
                            float f25 = bzVar.d * f10;
                            dVar.e((int) f23, (int) f24, (int) (f23 + f25), (int) (f24 + f25));
                            bzVar.f35630j.b(canvas);
                        } else {
                            ImageReceiver imageReceiver2 = bzVar.f35638r;
                            float f26 = bzVar.f35623a + bzVar.f35627f;
                            float f27 = bzVar.f35624b + bzVar.f35628g;
                            float f28 = bzVar.d * f10;
                            imageReceiver2.setImageCoords(f26, f27, f28, f28);
                            if (!bzVar.f35633m) {
                                canvas.save();
                                canvas.scale(-1.0f, 1.0f, bzVar.f35638r.getCenterX(), bzVar.f35638r.getCenterY());
                                bzVar.f35638r.draw(canvas);
                                canvas.restore();
                            } else {
                                bzVar.f35638r.draw(canvas);
                            }
                        }
                    }
                }
                ng.d dVar2 = bzVar.f35630j;
                if (dVar2 != null) {
                    z10 = dVar2.c();
                } else if (bzVar.f35632l && bzVar.f35638r.getLottieAnimation() != null && bzVar.f35638r.getLottieAnimation().Y >= bzVar.f35638r.getLottieAnimation().f27524e[0] - 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (bzVar.f35635o != 1.0f && !z10 && !z4) {
                    if (bzVar.f35638r.getLottieAnimation() != null && bzVar.f35638r.getLottieAnimation().f27530i0) {
                        bzVar.f35632l = true;
                    } else if (bzVar.f35638r.getLottieAnimation() != null && !bzVar.f35638r.getLottieAnimation().f27530i0) {
                        bzVar.f35638r.getLottieAnimation().L(0, true, false);
                        bzVar.f35638r.getLottieAnimation().start();
                    }
                } else {
                    bz bzVar2 = (bz) this.C.remove(i10);
                    if (bzVar.h && bzVar.f35638r.getLottieAnimation() != null) {
                        bzVar2.f35638r.getLottieAnimation().L(0, true, true);
                    }
                    bzVar2.f35638r.onDetachedFromWindow();
                    ng.d dVar3 = bzVar2.f35630j;
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
        this.f35908n = true;
        b();
        NotificationCenter.getInstance(this.f35904b).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.f35904b).addObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.f35904b).addObserver(this, NotificationCenter.updateInterfaces);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.C;
            if (i10 < arrayList.size()) {
                ((bz) arrayList.get(i10)).f35638r.onAttachedToWindow();
                if (((bz) arrayList.get(i10)).f35630j != null) {
                    ((bz) arrayList.get(i10)).f35630j.f(this.D);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        int i10 = 0;
        this.f35908n = false;
        NotificationCenter.getInstance(this.f35904b).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.f35904b).removeObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.f35904b).removeObserver(this, NotificationCenter.updateInterfaces);
        while (true) {
            ArrayList arrayList = this.C;
            if (i10 < arrayList.size()) {
                ((bz) arrayList.get(i10)).f35638r.onDetachedFromWindow();
                if (((bz) arrayList.get(i10)).f35630j != null) {
                    ((bz) arrayList.get(i10)).f35630j.d(this.D);
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
        if (!xnVar.w() && t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() >= 0) {
            if (t1Var.getMessageObject().isPremiumSticker() || xnVar.f43156f != null) {
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
                    Integer printingStringType = MessagesController.getInstance(this.f35904b).getPrintingStringType(j10, this.G);
                    if ((printingStringType == null || printingStringType.intValue() != 5) && this.B == null && o10) {
                        org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.f27770w;
                        if ((icVar == null || !icVar.f27780l) && SharedConfig.emojiInteractionsHintCount > 0 && UserConfig.getInstance(this.f35904b).getClientUserId() != xnVar.f43156f.f20992id) {
                            SharedConfig.updateEmojiInteractionsHintCount(SharedConfig.emojiInteractionsHintCount - 1);
                            if (t1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                                emojiAnimatedSticker = t1Var.getMessageObject().getDocument();
                            } else {
                                emojiAnimatedSticker = MediaDataController.getInstance(this.f35904b).getEmojiAnimatedSticker(t1Var.getMessageObject().getStickerEmoji());
                            }
                            org.telegram.ui.Components.bx0 bx0Var = new org.telegram.ui.Components.bx0(xnVar.getParentActivity(), null, 1, -1, emojiAnimatedSticker, xnVar.getResourceProvider());
                            bx0Var.f26546c.setVisibility(8);
                            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("EmojiInteractionTapHint", R.string.EmojiInteractionTapHint, xnVar.f43156f.first_name));
                            TextView textView = bx0Var.f26545b;
                            textView.setText(Emoji.replaceEmoji(replaceTags, textView.getPaint().getFontMetricsInt(), false));
                            textView.setTypeface(null);
                            textView.setMaxLines(3);
                            textView.setSingleLine(false);
                            zy zyVar = new zy(0, this, org.telegram.ui.Components.ic.g(xnVar, bx0Var, 2750));
                            this.B = zyVar;
                            AndroidUtilities.runOnUIThread(zyVar, 1500L);
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
            if (hashMap != null && hashMap.containsKey(Long.valueOf(document.f20851id))) {
                return;
            }
            if (this.H == null) {
                this.H = new HashMap();
            }
            this.H.put(Long.valueOf(document.f20851id), Boolean.TRUE);
            MediaDataController.getInstance(this.f35904b).preloadImage(ImageLocation.getForDocument(document), 2);
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
            if (I.contains(q10) && (arrayList = (ArrayList) this.f35906e.get(q10)) != null && !arrayList.isEmpty()) {
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
        xn xnVar = this.f35903a;
        if (xnVar != null && !MessagesController.getInstance(this.f35904b).premiumFeaturesBlocked() && xnVar.getParentActivity() != null) {
            org.telegram.ui.Components.bx0 bx0Var = new org.telegram.ui.Components.bx0(this.D.getContext(), null, 1, -1, messageObject.getDocument(), xnVar.getResourceProvider());
            bx0Var.f26545b.setText(tL_messages_stickerSet.set.title);
            bx0Var.f26546c.setText(LocaleController.getString(R.string.PremiumStickerTooltip));
            org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(xnVar.getParentActivity(), xnVar.getResourceProvider(), true);
            bx0Var.setButton(gcVar);
            gcVar.f27139a = new org.telegram.ui.Components.q51(22, this, messageObject);
            gcVar.e(LocaleController.getString(R.string.ViewAction));
            org.telegram.ui.Components.ic g10 = org.telegram.ui.Components.ic.g(xnVar, bx0Var, 2750);
            g10.f27772b = messageObject.getId();
            g10.j();
        }
    }

    public cz(xn xnVar, FrameLayout frameLayout, org.telegram.ui.Components.sl0 sl0Var, int i10, long j10, long j11) {
        this.f35903a = xnVar;
        this.D = frameLayout;
        this.E = sl0Var;
        this.f35904b = i10;
        this.F = j10;
        this.G = j11;
    }

    public void h(bz bzVar) {
    }

    public void i() {
    }
}
