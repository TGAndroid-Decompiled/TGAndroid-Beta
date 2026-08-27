package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public abstract class a61 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static String[] W1;
    public int A;
    public final ArrayList A0;
    public ValueAnimator A1;
    public int B;
    public final ArrayList B0;
    public boolean B1;
    public e51 C;
    public final ArrayList C0;
    public boolean C1;
    public y51 D;
    public final ArrayList D0;
    public ValueAnimator D1;
    public boolean E;
    public final ArrayList E0;
    public e41 E1;
    public HashSet F;
    public ArrayList F0;
    public jh.q5 F1;
    public final HashSet G;
    public final ArrayList G0;
    public boolean G1;
    public final Paint H;
    public ArrayList H0;
    public boolean H1;
    public final Paint I;
    public final ArrayList I0;
    public View I1;
    public Drawable J;
    public final boolean J0;
    public int J1;
    public j51 K;
    public boolean K0;
    public int K1;
    public boolean L;
    public Integer L0;
    public long L1;
    public boolean M;
    public boolean M0;
    public hh.bb M1;
    public boolean N;
    public List N0;
    public final e41 N1;
    public final ArrayList O;
    public j51 O0;
    public final e41 O1;
    public boolean P;
    public boolean P0;
    public Runnable P1;
    public a51 Q;
    public float Q0;
    public ValueAnimator Q1;
    public final int R;
    public final ImageReceiver R0;
    public ValueAnimator R1;
    public final int S;
    public org.telegram.ui.Components.k5 S0;
    public final AnimationNotificationsLocker S1;
    public final u41 T;
    public p41 T0;
    public final Paint T1;
    public final ag.t0 U;
    public final Integer U0;
    public Integer U1;
    public final org.telegram.ui.Components.mv[] V;
    public final org.telegram.ui.ActionBar.c6 V0;
    public org.telegram.ui.Components.mv W;
    public float W0;
    public float X0;
    public final org.telegram.ui.ActionBar.n2 Y0;
    public final int Z0;

    public int f36383a;

    public final s41 f36384a0;

    public final y41 f36385a1;

    public int f36386b;

    public final r41 f36387b0;

    public final int f36388b1;

    public int f36389c;

    public final ag.d f36390c0;

    public boolean f36391c1;
    public int d;

    public final x41 f36392d0;

    public boolean f36393d1;

    public int f36394e;

    public final n41 f36395e0;

    public ValueAnimator f36396e1;

    public int f36397f;

    public final FrameLayout f36398f0;

    public Drawable f36399f1;

    public final ag.y1 f36400g0;

    public final PorterDuffColorFilter f36401g1;
    public int h;

    public final org.telegram.ui.Components.n9 f36402h0;

    public float f36403h1;

    public final View f36404i0;

    public int f36405i1;

    public final org.telegram.ui.Components.zm f36406j0;

    public org.telegram.ui.Components.i5 f36407j1;

    public final View f36408k0;

    public Rect f36409k1;

    public final z41 f36410l0;
    public View l1;
    public final k51 m0;

    public float f36411m1;

    public int f36412n;

    public final o41 f36413n0;

    public j51 f36414n1;

    public final c2.x f36415o0;

    public Rect f36416o1;

    public final View f36417p0;

    public final OvershootInterpolator f36418p1;

    public int f36419q0;

    public ValueAnimator f36420q1;

    public int f36421r;

    public final ArrayList f36422r0;

    public boolean f36423r1;

    public int f36424s;

    public final SparseIntArray f36425s0;

    public boolean f36426s1;

    public final SparseIntArray f36427t0;

    public boolean f36428t1;

    public final SparseIntArray f36429u0;

    public boolean f36430u1;
    public int v;

    public final SparseIntArray f36431v0;

    public String f36432v1;

    public int f36433w;

    public final ArrayList f36434w0;

    public ArrayList f36435w1;

    public int f36436x;

    public final ArrayList f36437x0;

    public ArrayList f36438x1;

    public int f36439y;

    public boolean f36440y0;

    public ArrayList f36441y1;

    public final ArrayList f36442z0;

    public ArrayList f36443z1;
    public static final List V1 = Arrays.asList("😖", "😫", "🫠", "😨", "❓");
    public static final boolean[] X1 = new boolean[4];
    public static final HashMap Y1 = new HashMap();

    public a61(org.telegram.ui.ActionBar.n2 n2Var, Context context, boolean z10, Integer num, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this(n2Var, context, z10, num, i10, true, c6Var, 16);
    }

    public static void D(int i10, org.telegram.ui.Components.n9 n9Var) {
        List list;
        ImageLocation forDocument;
        String str;
        if (n9Var == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(MediaDataController.getInstance(i10).getFeaturedEmojiSets());
        Collections.shuffle(arrayList);
        int iRound = (int) Math.round(Math.random() * 10.0d);
        TLRPC.Document document = null;
        int i11 = 0;
        while (true) {
            int size = arrayList.size();
            list = V1;
            if (i11 >= size) {
                break;
            }
            if ((arrayList.get(i11) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList.get(i11)).documents != null) {
                ArrayList arrayList2 = new ArrayList(((TLRPC.TL_stickerSetFullCovered) arrayList.get(i11)).documents);
                Collections.shuffle(arrayList2);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList2.get(i12);
                    if (document2 != null && list.contains(MessageObject.findAnimatedEmojiEmoticon(document2, null))) {
                        int i13 = iRound - 1;
                        if (iRound <= 0) {
                            iRound = i13;
                            document = document2;
                            break;
                        } else {
                            iRound = i13;
                            document = document2;
                        }
                    }
                }
            }
            if (document != null && iRound <= 0) {
                break;
            } else {
                i11++;
            }
        }
        if (document == null || iRound > 0) {
            ArrayList arrayList3 = new ArrayList(MediaDataController.getInstance(i10).getStickerSets(5));
            Collections.shuffle(arrayList3);
            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                if (arrayList3.get(i14) != null && ((TLRPC.TL_messages_stickerSet) arrayList3.get(i14)).documents != null) {
                    ArrayList arrayList4 = new ArrayList(((TLRPC.TL_messages_stickerSet) arrayList3.get(i14)).documents);
                    Collections.shuffle(arrayList4);
                    for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                        TLRPC.Document document3 = (TLRPC.Document) arrayList4.get(i15);
                        if (document3 != null && list.contains(MessageObject.findAnimatedEmojiEmoticon(document3, null))) {
                            int i16 = iRound - 1;
                            if (iRound <= 0) {
                                iRound = i16;
                                document = document3;
                                break;
                            } else {
                                iRound = i16;
                                document = document3;
                            }
                        }
                    }
                }
                if (document != null && iRound <= 0) {
                    break;
                }
            }
        }
        if (document != null) {
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.f23215m6, 0.2f);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if ("video/webm".equals(document.mime_type)) {
                forDocument = ImageLocation.getForDocument(document);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                str = "36_36_g";
            } else {
                if (svgThumb != null && MessageObject.isAnimatedStickerDocument(document, false)) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                forDocument = ImageLocation.getForDocument(document);
                str = "36_36";
            }
            n9Var.setLayerNum(7);
            n9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
            n9Var.l(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "36_36", svgThumb, document);
        }
    }

    public static void a(a61 a61Var, int i10, int i11) {
        c2.x xVar = a61Var.f36415o0;
        o41 o41Var = a61Var.f36413n0;
        View viewM = o41Var.m(i10);
        int iL0 = o41Var.L0();
        if ((viewM == null && Math.abs(i10 - iL0) > 72.0f) || !SharedConfig.animationsEnabled()) {
            xVar.f2367b = o41Var.L0() < i10 ? 0 : 1;
            xVar.d(i10, i11, false, false);
        } else {
            lh.l1 l1Var = new lh.l1(a61Var, a61Var.f36392d0.getContext(), 4);
            l1Var.f5731a = i10;
            l1Var.f47990p = i11;
            o41Var.w0(l1Var);
        }
    }

    public static boolean c(a61 a61Var) {
        if (a61Var.P) {
            return true;
        }
        ValueAnimator valueAnimator = a61Var.Q1;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public int getCacheType() {
        int i10 = 13;
        int i11 = this.S;
        if (i11 != 5 && i11 != 7) {
            if (i11 == 6) {
                return org.telegram.ui.Components.k5.g();
            }
            if (i11 != 3 && i11 != 4) {
                i10 = 2;
                if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10 && i11 != 2) {
                    return 3;
                }
            }
        }
        return i10;
    }

    public Drawable getPremiumStar() {
        if (this.f36399f1 == null) {
            int i10 = this.S;
            if (i10 == 5 || i10 == 9 || i10 == 10 || i10 == 7) {
                this.f36399f1 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_filled_blocked).mutate();
            } else {
                this.f36399f1 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
            }
            this.f36399f1.setColorFilter(this.f36401g1);
        }
        return this.f36399f1;
    }

    public static ArrayList j(HashSet hashSet, ArrayList arrayList) {
        if (hashSet == null) {
            return arrayList;
        }
        int i10 = 0;
        while (i10 < arrayList.size()) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
            if (document == null || hashSet.contains(Long.valueOf(document.f22386id))) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        return arrayList;
    }

    public static TLRPC.Document k(String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        long jLongValue;
        if (tL_messages_stickerSet == null) {
            return null;
        }
        String strFixEmoji = Emoji.fixEmoji(str);
        int i10 = 0;
        while (true) {
            if (i10 >= tL_messages_stickerSet.packs.size()) {
                jLongValue = 0;
                break;
            }
            if (!tL_messages_stickerSet.packs.get(i10).documents.isEmpty() && TextUtils.equals(Emoji.fixEmoji(tL_messages_stickerSet.packs.get(i10).emoticon), strFixEmoji)) {
                jLongValue = tL_messages_stickerSet.packs.get(i10).documents.get(0).longValue();
                break;
            }
            i10++;
        }
        if (jLongValue == 0) {
            return null;
        }
        for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
            if (document.f22386id == jLongValue) {
                return document;
            }
        }
        return null;
    }

    public void setBigReactionAnimatedEmoji(org.telegram.ui.Components.k5 k5Var) {
        org.telegram.ui.Components.k5 k5Var2;
        if (this.E && (k5Var2 = this.S0) != k5Var) {
            if (k5Var2 != null) {
                k5Var2.o(this);
            }
            this.S0 = k5Var;
            if (k5Var != null) {
                k5Var.setColorFilter(this.f36401g1);
                this.S0.a(this);
            }
        }
    }

    public static void t(final int i10) {
        boolean[] zArr = X1;
        if (zArr[i10] || MediaDataController.getInstance(i10) == null) {
            return;
        }
        zArr[i10] = true;
        MediaDataController.getInstance(i10).checkStickers(5);
        MediaDataController.getInstance(i10).fetchEmojiStatuses(0, true);
        MediaDataController.getInstance(i10).checkReactions();
        MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        MediaDataController.getInstance(i10).getDefaultEmojiStatuses();
        MediaDataController.getInstance(i10).checkDefaultTopicIcons();
        org.telegram.ui.Components.gw0.f28835t3.fetch(i10, 1, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ArrayList<TLRPC.EmojiGroup> arrayList;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups == null || (arrayList = tL_messages_emojiGroups.groups) == null) {
                    return;
                }
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    TLRPC.EmojiGroup emojiGroup = arrayList.get(i11);
                    i11++;
                    k5.h(i10).b(emojiGroup.icon_emoji_id, null);
                }
            }
        });
    }

    public final void A(Long l10) {
        this.G.remove(l10);
        x41 x41Var = this.f36392d0;
        if (x41Var == null) {
            return;
        }
        int i10 = 0;
        boolean z10 = false;
        for (int i11 = 0; i11 < x41Var.getChildCount(); i11++) {
            if (x41Var.getChildAt(i11) instanceof j51) {
                j51 j51Var = (j51) x41Var.getChildAt(i11);
                org.telegram.ui.Components.t5 t5Var = j51Var.f39259e;
                if (t5Var == null || t5Var.getDocumentId() != l10.longValue()) {
                    TLRPC.Document document = j51Var.d;
                    if (document != null && document.f22386id == l10.longValue()) {
                        j51Var.f();
                    }
                } else {
                    j51Var.f();
                }
                z10 = true;
            }
        }
        x41Var.invalidate();
        if (z10) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.f36422r0;
            if (i10 >= arrayList.size()) {
                return;
            }
            long jLongValue = ((Long) arrayList.get(i10)).longValue();
            if (jLongValue == (l10.longValue() * 13) + 62425 || jLongValue == (l10.longValue() * 13) + 3212) {
                z41 z41Var = this.f36410l0;
                if (z41Var != null) {
                    z41Var.m(i10);
                    return;
                }
                return;
            }
            i10++;
        }
    }

    public final void B(boolean z10, boolean z11, boolean z12) {
        SparseIntArray sparseIntArray;
        boolean z13;
        ArrayList arrayList;
        ?? r30;
        TLRPC.TL_emojiList tL_emojiList;
        ArrayList<Long> arrayList2;
        int i10;
        int i11;
        TLRPC.TL_emojiList tL_emojiList2;
        HashSet hashSet;
        ArrayList<TLRPC.EmojiStatus> recentEmojiStatuses;
        TLRPC.InputStickerSet tL_inputStickerSetEmojiDefaultStatuses;
        TLRPC.TL_messages_stickerSet stickerSet;
        ArrayList<TLRPC.EmojiStatus> defaultEmojiStatuses;
        ArrayList<TLRPC.Document> arrayList3;
        int size;
        int i12;
        Long emojiStatusDocumentId;
        ArrayList<TLRPC.EmojiStatus> arrayList4;
        int i13;
        int i14;
        int i15;
        int size2;
        int i16;
        Long emojiStatusDocumentId2;
        int i17;
        int i18;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        long j10;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int size3;
        int i19;
        long j11;
        int i20;
        int size4;
        int i21;
        TL_stars.StarGift starGift;
        SparseIntArray sparseIntArray2;
        SparseIntArray sparseIntArray3;
        ArrayList arrayList7;
        x41 x41Var;
        int i22;
        int i23;
        TLRPC.StickerSetCovered stickerSetCovered;
        TLRPC.StickerSet stickerSet2;
        int i24;
        ArrayList arrayList8;
        MediaDataController mediaDataController;
        boolean zIsPremiumEmojiPack;
        ArrayList<TLRPC.Document> arrayList9;
        TLRPC.InputStickerSet inputStickerSet;
        boolean z14;
        org.telegram.ui.Components.kx kxVar;
        int i25;
        TLRPC.TL_messages_stickerSet stickerSet3;
        TLRPC.InputStickerSet inputStickerSet2;
        ArrayList<TLRPC.Document> arrayList10;
        boolean zIsPremiumEmojiPack2;
        int i26;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        SparseIntArray sparseIntArray4;
        SparseIntArray sparseIntArray5;
        String[][] strArr;
        int length;
        int i27;
        String[] strArr2;
        int length2;
        int i28;
        ArrayList arrayList11;
        ArrayList arrayList12;
        int i29;
        int i30;
        int i31;
        int i32;
        boolean z15;
        int i33;
        int i34;
        TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName;
        ArrayList<Long> arrayList13;
        boolean z16 = !this.L ? false : z11;
        int i35 = this.R;
        MediaDataController mediaDataController2 = MediaDataController.getInstance(i35);
        if (mediaDataController2 == null) {
            return;
        }
        if (z10 || this.H0 == null) {
            this.H0 = new ArrayList(mediaDataController2.getStickerSets(this.M ? 0 : 5));
        }
        ArrayList arrayList14 = this.H0;
        ArrayList arrayList15 = new ArrayList(mediaDataController2.getFeaturedEmojiSets());
        ArrayList arrayList16 = this.f36422r0;
        ArrayList arrayList17 = new ArrayList(arrayList16);
        this.f36419q0 = 0;
        this.f36397f = -1;
        this.f36386b = -1;
        this.f36421r = -1;
        this.f36424s = -1;
        this.f36389c = -1;
        this.h = -1;
        this.f36412n = -1;
        this.v = -1;
        this.f36433w = -1;
        this.f36436x = -1;
        this.f36439y = -1;
        this.A = -1;
        this.B = -1;
        ArrayList arrayList18 = this.f36442z0;
        arrayList18.clear();
        this.G0.clear();
        ArrayList arrayList19 = this.D0;
        arrayList19.clear();
        ArrayList arrayList20 = this.E0;
        arrayList20.clear();
        ArrayList arrayList21 = this.I0;
        arrayList21.clear();
        SparseIntArray sparseIntArray6 = this.f36425s0;
        sparseIntArray6.clear();
        SparseIntArray sparseIntArray7 = this.f36427t0;
        sparseIntArray7.clear();
        SparseIntArray sparseIntArray8 = this.f36429u0;
        sparseIntArray8.clear();
        arrayList16.clear();
        boolean z17 = z16;
        SparseIntArray sparseIntArray9 = this.f36431v0;
        sparseIntArray9.clear();
        this.O.clear();
        ArrayList arrayList22 = this.B0;
        arrayList22.clear();
        SparseIntArray sparseIntArray10 = sparseIntArray9;
        ArrayList arrayList23 = this.C0;
        arrayList23.clear();
        MediaDataController mediaDataController3 = mediaDataController2;
        ArrayList arrayList24 = this.A0;
        arrayList24.clear();
        boolean zIsEmpty = arrayList14.isEmpty();
        ArrayList arrayList25 = arrayList15;
        int i36 = this.S;
        if (zIsEmpty) {
            sparseIntArray = sparseIntArray7;
            if (i36 != 4) {
                this.f36383a = -1;
            }
            z13 = this.J0;
            if (i36 != 5 || i36 == 7) {
                arrayList = arrayList23;
                r30 = z13;
                if (r30 != 0) {
                    this.f36419q0++;
                    arrayList16.add(2L);
                }
                tL_emojiList = MediaDataController.getInstance(i35).replyIconsDefault;
                if (tL_emojiList != null && (arrayList2 = tL_emojiList.document_id) != null && !arrayList2.isEmpty()) {
                    i10 = 0;
                    while (i10 < tL_emojiList.document_id.size()) {
                        arrayList18.add(new org.telegram.ui.Components.t5(tL_emojiList.document_id.get(i10).longValue(), (Paint.FontMetricsInt) null));
                        i10++;
                        tL_emojiList = tL_emojiList;
                    }
                    for (i11 = 0; i11 < arrayList18.size(); i11++) {
                        arrayList16.add(Long.valueOf((((org.telegram.ui.Components.t5) arrayList18.get(i11)).getDocumentId() * 13) + 43223));
                        this.f36419q0++;
                    }
                }
            } else if (i36 != 4) {
                arrayList = arrayList23;
                r30 = z13;
                if (i36 == 6) {
                    if (r30 != 0) {
                        this.f36419q0++;
                        arrayList16.add(2L);
                    }
                    List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(i35).getEnabledReactionsList();
                    for (int i37 = 0; i37 < enabledReactionsList.size(); i37++) {
                        arrayList22.add(enabledReactionsList.get(i37).activate_animation);
                    }
                    for (int i38 = 0; i38 < arrayList22.size(); i38++) {
                        arrayList16.add(Long.valueOf((((TLRPC.Document) arrayList22.get(i38)).f22386id * 13) + 62425));
                        this.f36419q0++;
                    }
                } else if (i36 == 3) {
                    int i39 = this.f36419q0;
                    this.f36419q0 = i39 + 1;
                    this.f36436x = i39;
                    arrayList16.add(12L);
                    int i40 = this.f36419q0;
                    this.f36419q0 = i40 + 1;
                    this.f36433w = i40;
                    arrayList16.add(7L);
                    String str = UserConfig.getInstance(i35).defaultTopicIcons;
                    if (str != null) {
                        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i35).getStickerSetByName(str);
                        stickerSetByEmojiOrName = stickerSetByName == null ? MediaDataController.getInstance(i35).getStickerSetByEmojiOrName(str) : stickerSetByName;
                    } else {
                        stickerSetByEmojiOrName = null;
                    }
                    if (stickerSetByEmojiOrName != null) {
                        if (r30 != 0) {
                            this.f36419q0++;
                            arrayList16.add(2L);
                        }
                        ArrayList<TLRPC.Document> arrayList26 = stickerSetByEmojiOrName.documents;
                        if (arrayList26 != null && !arrayList26.isEmpty()) {
                            int i41 = 0;
                            while (i41 < stickerSetByEmojiOrName.documents.size()) {
                                arrayList18.add(new org.telegram.ui.Components.t5(stickerSetByEmojiOrName.documents.get(i41), (Paint.FontMetricsInt) null));
                                i41++;
                                stickerSetByEmojiOrName = stickerSetByEmojiOrName;
                            }
                        }
                        for (int i42 = 0; i42 < arrayList18.size(); i42++) {
                            arrayList16.add(Long.valueOf((((org.telegram.ui.Components.t5) arrayList18.get(i42)).getDocumentId() * 13) + 43223));
                            this.f36419q0++;
                        }
                    }
                }
            } else if (this.M) {
                r30 = z13;
                arrayList22.addAll(MediaDataController.getInstance(i35).getRecentStickersNoCopy(0));
                int i43 = 0;
                while (i43 < arrayList22.size()) {
                    arrayList16.add(Long.valueOf((((TLRPC.Document) arrayList22.get(i43)).f22386id * 13) + 62425));
                    this.f36419q0++;
                    i43++;
                    arrayList23 = arrayList23;
                }
                arrayList = arrayList23;
            } else {
                arrayList = arrayList23;
                r30 = z13;
                TLRPC.TL_emojiList tL_emojiList3 = this.N ? MediaDataController.getInstance(i35).profileAvatarConstructorDefault : MediaDataController.getInstance(i35).groupAvatarConstructorDefault;
                if (tL_emojiList3 != null && (arrayList13 = tL_emojiList3.document_id) != null && !arrayList13.isEmpty()) {
                    org.telegram.ui.Components.kx kxVar2 = new org.telegram.ui.Components.kx();
                    kxVar2.f30208f = true;
                    kxVar2.f30209g = false;
                    kxVar2.h = true;
                    kxVar2.f30207e = true;
                    kxVar2.f30205b = new TLRPC.TL_stickerSet();
                    kxVar2.f30204a = tL_emojiList3.document_id.get(0);
                    arrayList21.size();
                    arrayList21.add(kxVar2);
                    int i44 = 0;
                    while (i44 < tL_emojiList3.document_id.size()) {
                        arrayList18.add(new org.telegram.ui.Components.t5(tL_emojiList3.document_id.get(i44).longValue(), (Paint.FontMetricsInt) null));
                        i44++;
                        tL_emojiList3 = tL_emojiList3;
                    }
                    for (int i45 = 0; i45 < arrayList18.size(); i45++) {
                        arrayList16.add(Long.valueOf((((org.telegram.ui.Components.t5) arrayList18.get(i45)).getDocumentId() * 13) + 43223));
                        this.f36419q0++;
                    }
                }
            }
            if (this.K0 && i36 != 13 && i36 != 2 && i36 != 11 && i36 != 3 && i36 != 6 && i36 != 8 && i36 != 4 && i36 != 5 && i36 != 7) {
                int i46 = this.f36419q0;
                this.f36419q0 = i46 + 1;
                this.v = i46;
                arrayList16.add(6L);
            }
            if ((i36 != 9 || i36 == 10) && (tL_emojiList2 = MediaDataController.getInstance(i35).restrictedStatusEmojis) != null) {
                hashSet = new HashSet();
                hashSet.addAll(tL_emojiList2.document_id);
            } else {
                hashSet = null;
            }
            if (this.N0 != null) {
                this.d = this.f36419q0;
                arrayList11 = new ArrayList(this.N0);
                if (i36 == 13 || arrayList11.size() <= 8) {
                    if (i36 == 14) {
                        arrayList12 = new ArrayList();
                        i29 = 0;
                        while (i29 < arrayList11.size()) {
                            if (((ig.q0) arrayList11.get(i29)).f11411e) {
                                arrayList12.add((ig.q0) arrayList11.remove(i29));
                                i29--;
                            }
                            i29++;
                        }
                    }
                    if (i36 != 8 || i36 == 11 || i36 == 13) {
                        arrayList19.addAll(arrayList11);
                    } else {
                        for (int i47 = 0; i47 < 16; i47++) {
                            if (!arrayList11.isEmpty()) {
                                arrayList19.add((ig.q0) arrayList11.remove(0));
                            }
                        }
                    }
                    for (i30 = 0; i30 < arrayList19.size(); i30++) {
                        arrayList16 = arrayList16;
                        arrayList16.add(Long.valueOf((((long) ((ig.q0) arrayList19.get(i30)).hashCode()) * 13) - 5632));
                    }
                    int size5 = arrayList19.size() + this.f36419q0;
                    this.f36419q0 = size5;
                    this.f36394e = size5;
                    if (!arrayList11.isEmpty() && i36 != 8 && i36 != 11 && i36 != 13) {
                        i32 = 0;
                        while (true) {
                            if (i32 >= arrayList11.size()) {
                                z15 = true;
                                break;
                            } else {
                                if (((ig.q0) arrayList11.get(i32)).f11413g != 0) {
                                    z15 = false;
                                    break;
                                }
                                i32++;
                            }
                        }
                        if (i36 != 14) {
                            if (!z15) {
                                int i48 = this.f36419q0;
                                this.f36419q0 = i48 + 1;
                                this.f36397f = i48;
                                arrayList16.add(4L);
                            } else if (UserConfig.getInstance(i35).isPremium()) {
                                int i49 = this.f36419q0;
                                this.f36419q0 = i49 + 1;
                                this.h = i49;
                                arrayList16.add(5L);
                            }
                        }
                        this.f36386b = this.f36419q0;
                        arrayList20.addAll(arrayList11);
                        for (i33 = 0; i33 < arrayList20.size(); i33++) {
                            if (z15) {
                                i34 = 4235;
                            } else {
                                i34 = -3142;
                            }
                            arrayList16.add(Long.valueOf((((ig.q0) arrayList20.get(i33)).h * 13) + ((long) i34)));
                        }
                        int size6 = arrayList20.size() + this.f36419q0;
                        this.f36419q0 = size6;
                        this.f36389c = size6;
                    }
                    if (arrayList12 != null && !arrayList12.isEmpty()) {
                        int i50 = this.f36419q0;
                        this.f36419q0 = i50 + 1;
                        this.f36439y = i50;
                        arrayList16.add(8L);
                        this.A = this.f36419q0;
                        this.F0 = arrayList12;
                        for (i31 = 0; i31 < arrayList12.size(); i31++) {
                            arrayList16.add(Long.valueOf(((ig.q0) arrayList12.get(i31)).f11410c * 19));
                        }
                        int size7 = arrayList12.size() + this.f36419q0;
                        this.f36419q0 = size7;
                        this.B = size7;
                    }
                } else {
                    arrayList11.subList(8, arrayList11.size()).clear();
                }
                arrayList12 = null;
                if (i36 != 8) {
                    arrayList19.addAll(arrayList11);
                } else {
                    arrayList19.addAll(arrayList11);
                }
                while (i30 < arrayList19.size()) {
                    arrayList16 = arrayList16;
                    arrayList16.add(Long.valueOf((((long) ((ig.q0) arrayList19.get(i30)).hashCode()) * 13) - 5632));
                }
                int size8 = arrayList19.size() + this.f36419q0;
                this.f36419q0 = size8;
                this.f36394e = size8;
                if (!arrayList11.isEmpty()) {
                    i32 = 0;
                    while (true) {
                        if (i32 >= arrayList11.size()) {
                            z15 = true;
                            break;
                        } else {
                            if (((ig.q0) arrayList11.get(i32)).f11413g != 0) {
                                z15 = false;
                                break;
                            }
                            i32++;
                        }
                    }
                    if (i36 != 14) {
                        if (!z15) {
                            int i410 = this.f36419q0;
                            this.f36419q0 = i410 + 1;
                            this.f36397f = i410;
                            arrayList16.add(4L);
                        } else if (UserConfig.getInstance(i35).isPremium()) {
                            int i411 = this.f36419q0;
                            this.f36419q0 = i411 + 1;
                            this.h = i411;
                            arrayList16.add(5L);
                        }
                    }
                    this.f36386b = this.f36419q0;
                    arrayList20.addAll(arrayList11);
                    while (i33 < arrayList20.size()) {
                        if (z15) {
                            i34 = 4235;
                        } else {
                            i34 = -3142;
                        }
                        arrayList16.add(Long.valueOf((((ig.q0) arrayList20.get(i33)).h * 13) + ((long) i34)));
                    }
                    int size9 = arrayList20.size() + this.f36419q0;
                    this.f36419q0 = size9;
                    this.f36389c = size9;
                }
                if (arrayList12 != null) {
                    int i51 = this.f36419q0;
                    this.f36419q0 = i51 + 1;
                    this.f36439y = i51;
                    arrayList16.add(8L);
                    this.A = this.f36419q0;
                    this.F0 = arrayList12;
                    while (i31 < arrayList12.size()) {
                        arrayList16.add(Long.valueOf(((ig.q0) arrayList12.get(i31)).f11410c * 19));
                    }
                    int size10 = arrayList12.size() + this.f36419q0;
                    this.f36419q0 = size10;
                    this.B = size10;
                }
            } else if (i36 != 0 || i36 == 12 || i36 == 9 || i36 == 10) {
                recentEmojiStatuses = MediaDataController.getInstance(i35).getRecentEmojiStatuses();
                MediaDataController mediaDataController4 = MediaDataController.getInstance(i35);
                if (i36 != 0 || i36 == 12) {
                    tL_inputStickerSetEmojiDefaultStatuses = new TLRPC.TL_inputStickerSetEmojiDefaultStatuses();
                } else {
                    tL_inputStickerSetEmojiDefaultStatuses = new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses();
                }
                stickerSet = mediaDataController4.getStickerSet(tL_inputStickerSetEmojiDefaultStatuses, true);
                if (stickerSet != null) {
                    if (r30 != 0) {
                        this.f36419q0++;
                        arrayList16.add(2L);
                    }
                    if (i36 != 0 || i36 == 12) {
                        defaultEmojiStatuses = MediaDataController.getInstance(i35).getDefaultEmojiStatuses();
                    } else {
                        defaultEmojiStatuses = MediaDataController.getInstance(i35).getDefaultChannelEmojiStatuses();
                    }
                    arrayList3 = stickerSet.documents;
                    if (arrayList3 != null && !arrayList3.isEmpty()) {
                        i18 = 0;
                        while (i18 < Math.min(7, stickerSet.documents.size())) {
                            tL_messages_stickerSet = stickerSet;
                            arrayList18.add(new org.telegram.ui.Components.t5(stickerSet.documents.get(i18), (Paint.FontMetricsInt) null));
                            if (arrayList18.size() + r30 >= 104) {
                                break;
                            }
                            i18++;
                            stickerSet = tL_messages_stickerSet;
                        }
                    }
                    if ((i36 != 0 || i36 == 12) && recentEmojiStatuses != null && !recentEmojiStatuses.isEmpty()) {
                        size = recentEmojiStatuses.size();
                        i12 = 0;
                        while (i12 < size) {
                            TLRPC.EmojiStatus emojiStatus = recentEmojiStatuses.get(i12);
                            i12++;
                            emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(emojiStatus);
                            if (emojiStatusDocumentId != null) {
                                arrayList4 = recentEmojiStatuses;
                                i13 = 0;
                                while (true) {
                                    if (i13 >= arrayList18.size()) {
                                        i14 = size;
                                        arrayList18.add(new org.telegram.ui.Components.t5(emojiStatusDocumentId.longValue(), (Paint.FontMetricsInt) null));
                                        if (arrayList18.size() + r30 < 104) {
                                            recentEmojiStatuses = arrayList4;
                                            size = i14;
                                            break;
                                        }
                                        break;
                                    }
                                    if (((org.telegram.ui.Components.t5) arrayList18.get(i13)).getDocumentId() == emojiStatusDocumentId.longValue()) {
                                        recentEmojiStatuses = arrayList4;
                                        break;
                                    }
                                    i13++;
                                }
                            }
                        }
                    }
                    if (defaultEmojiStatuses != null && !defaultEmojiStatuses.isEmpty()) {
                        size2 = defaultEmojiStatuses.size();
                        i16 = 0;
                        while (i16 < size2) {
                            TLRPC.EmojiStatus emojiStatus2 = defaultEmojiStatuses.get(i16);
                            i16++;
                            emojiStatusDocumentId2 = UserObject.getEmojiStatusDocumentId(emojiStatus2);
                            if (emojiStatusDocumentId2 != null) {
                                i17 = 0;
                                while (true) {
                                    if (i17 >= arrayList18.size()) {
                                        arrayList18.add(new org.telegram.ui.Components.t5(emojiStatusDocumentId2.longValue(), (Paint.FontMetricsInt) null));
                                        if (arrayList18.size() + r30 >= 104) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else if (((org.telegram.ui.Components.t5) arrayList18.get(i17)).getDocumentId() == emojiStatusDocumentId2.longValue()) {
                                        break;
                                    } else {
                                        i17++;
                                    }
                                }
                                defaultEmojiStatuses = defaultEmojiStatuses;
                                size2 = size2;
                            }
                        }
                    }
                    if (arrayList18.size() > 40 - r30 || this.f36440y0) {
                        for (i15 = 0; i15 < arrayList18.size(); i15++) {
                            arrayList16.add(Long.valueOf((((org.telegram.ui.Components.t5) arrayList18.get(i15)).getDocumentId() * 13) + 43223));
                            this.f36419q0++;
                        }
                    } else {
                        for (int i52 = 0; i52 < 39 - r30; i52++) {
                            arrayList16.add(Long.valueOf((((org.telegram.ui.Components.t5) arrayList18.get(i52)).getDocumentId() * 13) + 43223));
                            this.f36419q0++;
                        }
                        arrayList16.add(Long.valueOf((((long) (((arrayList18.size() - 40) + r30) + 1)) * 13) - 5531));
                        e51 e51Var = this.C;
                        if (e51Var != null) {
                            e51Var.f37635a.setText("+" + ((arrayList18.size() - 40) + r30 + 1));
                        }
                        sparseIntArray8.put(this.f36419q0, -1);
                        this.f36419q0++;
                    }
                }
            }
            arrayList24.clear();
            if (i36 != 0 || i36 == 12 || i36 == 9 || i36 == 10) {
                j10 = 322;
                hh.m7 m7VarG = hh.u7.y(i35, false).G(getDialogId(), true);
                m7VarG.a();
                arrayList5 = new ArrayList();
                arrayList6 = m7VarG.f9753l;
                size3 = arrayList6.size();
                i19 = 0;
                while (i19 < size3) {
                    Object obj = arrayList6.get(i19);
                    i19++;
                    starGift = ((TL_stars.SavedStarGift) obj).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList5.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                if (arrayList5.isEmpty()) {
                    j11 = 13334;
                    this.W.l(false);
                } else {
                    int i53 = this.f36419q0;
                    this.f36419q0 = i53 + 1;
                    this.f36412n = i53;
                    arrayList16.add(22L);
                    this.f36421r = this.f36419q0;
                    size4 = arrayList5.size();
                    i21 = 0;
                    while (i21 < size4) {
                        Object obj2 = arrayList5.get(i21);
                        i21++;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                        arrayList16.add(Long.valueOf((tL_starGiftUnique.f22607id * 322) + 13334));
                        this.f36419q0++;
                        arrayList24.add(tL_starGiftUnique);
                    }
                    j11 = 13334;
                    this.f36424s = this.f36419q0;
                    this.W.l(true);
                }
                i20 = 13;
            } else {
                i20 = 13;
                j10 = 322;
                j11 = 13334;
            }
            if (i36 == i20) {
                strArr = EmojiData.dataColored;
                length = strArr.length;
                for (i27 = 0; i27 < length; i27++) {
                    strArr2 = strArr[i27];
                    length2 = strArr2.length;
                    i28 = 0;
                    while (i28 < length2) {
                        String str2 = strArr2[i28];
                        arrayList.add(str2);
                        arrayList16.add(Long.valueOf((((long) str2.hashCode()) * j10) + j11));
                        this.f36419q0++;
                        i28++;
                        strArr = strArr;
                        length = length;
                    }
                }
            }
            if (i36 != 8 && i36 != 13 && i36 != 14) {
                i26 = 0;
                while (i26 < arrayList14.size()) {
                    tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList14.get(i26);
                    if (tL_messages_stickerSet2 != null || tL_messages_stickerSet2.set == null || (((i36 == 5 || i36 == 7) && !MessageObject.isTextColorSet(tL_messages_stickerSet2)) || ((i36 == 10 || i36 == 9) && !tL_messages_stickerSet2.set.channel_emoji_status))) {
                        sparseIntArray4 = sparseIntArray;
                        sparseIntArray5 = sparseIntArray6;
                    } else {
                        TLRPC.StickerSet stickerSet4 = tL_messages_stickerSet2.set;
                        if (!stickerSet4.emojis && !this.M) {
                            sparseIntArray4 = sparseIntArray;
                            sparseIntArray5 = sparseIntArray6;
                        } else if (this.f36437x0.contains(Long.valueOf(stickerSet4.f22407id))) {
                            sparseIntArray4 = sparseIntArray;
                            sparseIntArray5 = sparseIntArray6;
                        } else {
                            sparseIntArray5 = sparseIntArray6;
                            sparseIntArray5.put(this.f36419q0, arrayList21.size());
                            sparseIntArray4 = sparseIntArray;
                            sparseIntArray4.put(arrayList21.size(), this.f36419q0);
                            this.f36419q0++;
                            arrayList16.add(Long.valueOf((tL_messages_stickerSet2.set.f22407id * 13) + 9211));
                            org.telegram.ui.Components.kx kxVar3 = new org.telegram.ui.Components.kx();
                            kxVar3.f30208f = true;
                            kxVar3.f30209g = false;
                            kxVar3.h = true;
                            if (i36 == 4) {
                                kxVar3.f30207e = false;
                            } else {
                                kxVar3.f30207e = !MessageObject.isPremiumEmojiPack(tL_messages_stickerSet2);
                            }
                            kxVar3.f30205b = tL_messages_stickerSet2.set;
                            kxVar3.f30206c = j(hashSet, tL_messages_stickerSet2.documents);
                            arrayList21.size();
                            arrayList21.add(kxVar3);
                            this.f36419q0 = kxVar3.f30206c.size() + this.f36419q0;
                            for (int i54 = 0; i54 < kxVar3.f30206c.size(); i54++) {
                                arrayList16.add(Long.valueOf((((TLRPC.Document) kxVar3.f30206c.get(i54)).f22386id * 13) + 3212));
                            }
                        }
                    }
                    i26++;
                    sparseIntArray6 = sparseIntArray5;
                    sparseIntArray = sparseIntArray4;
                }
            }
            sparseIntArray2 = sparseIntArray;
            sparseIntArray3 = sparseIntArray6;
            if (!this.M && i36 != 8 && i36 != 13 && i36 != 14) {
                i23 = 0;
                while (i23 < arrayList25.size()) {
                    arrayList25 = arrayList25;
                    stickerSetCovered = (TLRPC.StickerSetCovered) arrayList25.get(i23);
                    stickerSet2 = stickerSetCovered.set;
                    i24 = 0;
                    while (true) {
                        if (i24 < arrayList21.size()) {
                            arrayList8 = arrayList21;
                            if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                mediaDataController = mediaDataController3;
                                stickerSet3 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                if (stickerSet3 != null) {
                                    arrayList10 = stickerSet3.documents;
                                    zIsPremiumEmojiPack2 = MessageObject.isPremiumEmojiPack(stickerSet3);
                                    inputStickerSet2 = null;
                                } else {
                                    inputStickerSet2 = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                                    arrayList10 = new ArrayList<>();
                                    zIsPremiumEmojiPack2 = true;
                                }
                                TLRPC.InputStickerSet inputStickerSet3 = inputStickerSet2;
                                arrayList9 = arrayList10;
                                zIsPremiumEmojiPack = zIsPremiumEmojiPack2;
                                inputStickerSet = inputStickerSet3;
                            } else {
                                mediaDataController = mediaDataController3;
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                    arrayList9 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                    zIsPremiumEmojiPack = MessageObject.isPremiumEmojiPack(stickerSetCovered);
                                } else {
                                    zIsPremiumEmojiPack = false;
                                    arrayList9 = null;
                                }
                                inputStickerSet = null;
                            }
                            if (arrayList9 != null && (((i36 != 5 && i36 != 7) || (!arrayList9.isEmpty() && MessageObject.isTextColorEmoji(arrayList9.get(0)))) && ((i36 != 10 && i36 != 9) || stickerSet2.channel_emoji_status))) {
                                arrayList25 = arrayList25;
                                sparseIntArray3.put(this.f36419q0, arrayList8.size());
                                sparseIntArray2.put(arrayList8.size(), this.f36419q0);
                                this.f36419q0++;
                                z14 = zIsPremiumEmojiPack;
                                arrayList16.add(Long.valueOf((stickerSet2.f22407id * 13) + 9211));
                                kxVar = new org.telegram.ui.Components.kx();
                                kxVar.d = inputStickerSet;
                                i23 = i23;
                                kxVar.f30208f = this.f36437x0.contains(Long.valueOf(stickerSet2.f22407id));
                                kxVar.f30209g = true;
                                if (i36 == 4) {
                                    kxVar.f30207e = false;
                                } else {
                                    kxVar.f30207e = !z14;
                                }
                                kxVar.f30205b = stickerSet2;
                                kxVar.f30206c = j(hashSet, arrayList9);
                                arrayList8.size();
                                kxVar.h = this.f36434w0.contains(Long.valueOf(kxVar.f30205b.f22407id));
                                if (kxVar.f30206c.size() > 24 || kxVar.h) {
                                    this.f36419q0 = kxVar.f30206c.size() + this.f36419q0;
                                    for (i25 = 0; i25 < kxVar.f30206c.size(); i25++) {
                                        arrayList16.add(Long.valueOf((((TLRPC.Document) kxVar.f30206c.get(i25)).f22386id * 13) + 3212));
                                    }
                                } else {
                                    this.f36419q0 += 24;
                                    for (int i55 = 0; i55 < 23; i55++) {
                                        arrayList16.add(Long.valueOf((((TLRPC.Document) kxVar.f30206c.get(i55)).f22386id * 13) + 3212));
                                    }
                                    arrayList16.add(Long.valueOf((((long) (kxVar.f30206c.size() - 23)) * 169) + ((stickerSet2.f22407id * 13) - 5531)));
                                    sparseIntArray8.put(this.f36419q0 - 1, arrayList8.size());
                                }
                                if (kxVar.f30208f && i36 != 4 && i36 != 5 && i36 != 7 && i36 != 6) {
                                    sparseIntArray10 = sparseIntArray10;
                                    sparseIntArray10.put(this.f36419q0, arrayList8.size());
                                    this.f36419q0++;
                                    arrayList16.add(Long.valueOf((stickerSet2.f22407id * 13) + 3321));
                                }
                                arrayList8.add(kxVar);
                                break;
                            }
                        } else {
                            arrayList8 = arrayList21;
                            if (((org.telegram.ui.Components.kx) arrayList21.get(i24)).f30205b.f22407id == stickerSet2.f22407id) {
                                mediaDataController = mediaDataController3;
                            } else {
                                i24++;
                                arrayList21 = arrayList8;
                            }
                        }
                        break;
                    }
                    i23++;
                    sparseIntArray10 = sparseIntArray10;
                    arrayList21 = arrayList8;
                    mediaDataController3 = mediaDataController;
                }
            }
            arrayList7 = arrayList21;
            if (i36 != 14 && i36 != 8 && i36 != 13) {
                this.W.p(arrayList7);
            }
            x41Var = this.f36392d0;
            if (z17) {
                x41Var.setItemAnimator(this.f36385a1);
            } else {
                x41Var.setItemAnimator(null);
            }
            if (z12) {
                i22 = 0;
                f2.q.c(new org.telegram.ui.Components.fx(this, arrayList17, 2), false).b(this.f36410l0);
            } else {
                i22 = 0;
                this.f36410l0.l();
            }
            if (x41Var.H1) {
            }
            x41Var.u0(i22);
        }
        sparseIntArray = sparseIntArray7;
        if (i36 == 5 || i36 == 7 || i36 == 8) {
            this.f36383a = -1;
        } else {
            int i56 = this.f36419q0;
            this.f36419q0 = i56 + 1;
            this.f36383a = i56;
            arrayList16.add(9L);
        }
        z13 = this.J0;
        if (i36 != 5) {
            arrayList = arrayList23;
            r30 = z13;
            if (r30 != 0) {
                this.f36419q0++;
                arrayList16.add(2L);
            }
            tL_emojiList = MediaDataController.getInstance(i35).replyIconsDefault;
            if (tL_emojiList != null) {
                i10 = 0;
                while (i10 < tL_emojiList.document_id.size()) {
                    arrayList18.add(new org.telegram.ui.Components.t5(tL_emojiList.document_id.get(i10).longValue(), (Paint.FontMetricsInt) null));
                    i10++;
                    tL_emojiList = tL_emojiList;
                }
                while (i11 < arrayList18.size()) {
                    arrayList16.add(Long.valueOf((((org.telegram.ui.Components.t5) arrayList18.get(i11)).getDocumentId() * 13) + 43223));
                    this.f36419q0++;
                }
            }
        } else {
            arrayList = arrayList23;
            r30 = z13;
            if (r30 != 0) {
                this.f36419q0++;
                arrayList16.add(2L);
            }
            tL_emojiList = MediaDataController.getInstance(i35).replyIconsDefault;
            if (tL_emojiList != null) {
                i10 = 0;
                while (i10 < tL_emojiList.document_id.size()) {
                    arrayList18.add(new org.telegram.ui.Components.t5(tL_emojiList.document_id.get(i10).longValue(), (Paint.FontMetricsInt) null));
                    i10++;
                    tL_emojiList = tL_emojiList;
                }
                while (i11 < arrayList18.size()) {
                    arrayList16.add(Long.valueOf((((org.telegram.ui.Components.t5) arrayList18.get(i11)).getDocumentId() * 13) + 43223));
                    this.f36419q0++;
                }
            }
        }
        if (this.K0) {
            int i412 = this.f36419q0;
            this.f36419q0 = i412 + 1;
            this.v = i412;
            arrayList16.add(6L);
        }
        if (i36 != 9) {
            hashSet = new HashSet();
            hashSet.addAll(tL_emojiList2.document_id);
        } else {
            hashSet = new HashSet();
            hashSet.addAll(tL_emojiList2.document_id);
        }
        if (this.N0 != null) {
            this.d = this.f36419q0;
            arrayList11 = new ArrayList(this.N0);
            if (i36 == 13) {
                if (i36 == 14) {
                    arrayList12 = new ArrayList();
                    i29 = 0;
                    while (i29 < arrayList11.size()) {
                        if (((ig.q0) arrayList11.get(i29)).f11411e) {
                            arrayList12.add((ig.q0) arrayList11.remove(i29));
                            i29--;
                        }
                        i29++;
                    }
                } else {
                    arrayList12 = null;
                }
            } else if (i36 == 14) {
                arrayList12 = new ArrayList();
                i29 = 0;
                while (i29 < arrayList11.size()) {
                    if (((ig.q0) arrayList11.get(i29)).f11411e) {
                        arrayList12.add((ig.q0) arrayList11.remove(i29));
                        i29--;
                    }
                    i29++;
                }
            } else {
                arrayList12 = null;
            }
            if (i36 != 8) {
                arrayList19.addAll(arrayList11);
            } else {
                arrayList19.addAll(arrayList11);
            }
            while (i30 < arrayList19.size()) {
                arrayList16 = arrayList16;
                arrayList16.add(Long.valueOf((((long) ((ig.q0) arrayList19.get(i30)).hashCode()) * 13) - 5632));
            }
            int size11 = arrayList19.size() + this.f36419q0;
            this.f36419q0 = size11;
            this.f36394e = size11;
            if (!arrayList11.isEmpty()) {
                i32 = 0;
                while (true) {
                    if (i32 >= arrayList11.size()) {
                        z15 = true;
                        break;
                    } else {
                        if (((ig.q0) arrayList11.get(i32)).f11413g != 0) {
                            z15 = false;
                            break;
                        }
                        i32++;
                    }
                }
                if (i36 != 14) {
                    if (!z15) {
                        int i413 = this.f36419q0;
                        this.f36419q0 = i413 + 1;
                        this.f36397f = i413;
                        arrayList16.add(4L);
                    } else if (UserConfig.getInstance(i35).isPremium()) {
                        int i414 = this.f36419q0;
                        this.f36419q0 = i414 + 1;
                        this.h = i414;
                        arrayList16.add(5L);
                    }
                }
                this.f36386b = this.f36419q0;
                arrayList20.addAll(arrayList11);
                while (i33 < arrayList20.size()) {
                    if (z15) {
                        i34 = 4235;
                    } else {
                        i34 = -3142;
                    }
                    arrayList16.add(Long.valueOf((((ig.q0) arrayList20.get(i33)).h * 13) + ((long) i34)));
                }
                int size12 = arrayList20.size() + this.f36419q0;
                this.f36419q0 = size12;
                this.f36389c = size12;
            }
            if (arrayList12 != null) {
                int i57 = this.f36419q0;
                this.f36419q0 = i57 + 1;
                this.f36439y = i57;
                arrayList16.add(8L);
                this.A = this.f36419q0;
                this.F0 = arrayList12;
                while (i31 < arrayList12.size()) {
                    arrayList16.add(Long.valueOf(((ig.q0) arrayList12.get(i31)).f11410c * 19));
                }
                int size13 = arrayList12.size() + this.f36419q0;
                this.f36419q0 = size13;
                this.B = size13;
            }
        } else if (i36 != 0) {
            recentEmojiStatuses = MediaDataController.getInstance(i35).getRecentEmojiStatuses();
            MediaDataController mediaDataController5 = MediaDataController.getInstance(i35);
            if (i36 != 0) {
                tL_inputStickerSetEmojiDefaultStatuses = new TLRPC.TL_inputStickerSetEmojiDefaultStatuses();
            } else {
                tL_inputStickerSetEmojiDefaultStatuses = new TLRPC.TL_inputStickerSetEmojiDefaultStatuses();
            }
            stickerSet = mediaDataController5.getStickerSet(tL_inputStickerSetEmojiDefaultStatuses, true);
            if (stickerSet != null) {
                if (r30 != 0) {
                    this.f36419q0++;
                    arrayList16.add(2L);
                }
                if (i36 != 0) {
                    defaultEmojiStatuses = MediaDataController.getInstance(i35).getDefaultEmojiStatuses();
                } else {
                    defaultEmojiStatuses = MediaDataController.getInstance(i35).getDefaultEmojiStatuses();
                }
                arrayList3 = stickerSet.documents;
                if (arrayList3 != null) {
                    i18 = 0;
                    while (i18 < Math.min(7, stickerSet.documents.size())) {
                        tL_messages_stickerSet = stickerSet;
                        arrayList18.add(new org.telegram.ui.Components.t5(stickerSet.documents.get(i18), (Paint.FontMetricsInt) null));
                        if (arrayList18.size() + r30 >= 104) {
                            break;
                            break;
                        } else {
                            i18++;
                            stickerSet = tL_messages_stickerSet;
                        }
                    }
                }
                if (i36 != 0) {
                    size = recentEmojiStatuses.size();
                    i12 = 0;
                    while (i12 < size) {
                        TLRPC.EmojiStatus emojiStatus3 = recentEmojiStatuses.get(i12);
                        i12++;
                        emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(emojiStatus3);
                        if (emojiStatusDocumentId != null) {
                            arrayList4 = recentEmojiStatuses;
                            i13 = 0;
                            while (true) {
                                if (i13 >= arrayList18.size()) {
                                    i14 = size;
                                    arrayList18.add(new org.telegram.ui.Components.t5(emojiStatusDocumentId.longValue(), (Paint.FontMetricsInt) null));
                                    if (arrayList18.size() + r30 < 104) {
                                        recentEmojiStatuses = arrayList4;
                                        size = i14;
                                        break;
                                        break;
                                    }
                                    break;
                                    break;
                                }
                                if (((org.telegram.ui.Components.t5) arrayList18.get(i13)).getDocumentId() == emojiStatusDocumentId.longValue()) {
                                    recentEmojiStatuses = arrayList4;
                                    break;
                                    break;
                                }
                                i13++;
                            }
                        }
                    }
                } else {
                    size = recentEmojiStatuses.size();
                    i12 = 0;
                    while (i12 < size) {
                        TLRPC.EmojiStatus emojiStatus4 = recentEmojiStatuses.get(i12);
                        i12++;
                        emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(emojiStatus4);
                        if (emojiStatusDocumentId != null) {
                            arrayList4 = recentEmojiStatuses;
                            i13 = 0;
                            while (true) {
                                if (i13 >= arrayList18.size()) {
                                    i14 = size;
                                    arrayList18.add(new org.telegram.ui.Components.t5(emojiStatusDocumentId.longValue(), (Paint.FontMetricsInt) null));
                                    if (arrayList18.size() + r30 < 104) {
                                        recentEmojiStatuses = arrayList4;
                                        size = i14;
                                        break;
                                        break;
                                    }
                                    break;
                                    break;
                                }
                                if (((org.telegram.ui.Components.t5) arrayList18.get(i13)).getDocumentId() == emojiStatusDocumentId.longValue()) {
                                    recentEmojiStatuses = arrayList4;
                                    break;
                                    break;
                                }
                                i13++;
                            }
                        }
                    }
                }
                if (defaultEmojiStatuses != null) {
                    size2 = defaultEmojiStatuses.size();
                    i16 = 0;
                    while (i16 < size2) {
                        TLRPC.EmojiStatus emojiStatus5 = defaultEmojiStatuses.get(i16);
                        i16++;
                        emojiStatusDocumentId2 = UserObject.getEmojiStatusDocumentId(emojiStatus5);
                        if (emojiStatusDocumentId2 != null) {
                            i17 = 0;
                            while (true) {
                                if (i17 >= arrayList18.size()) {
                                    arrayList18.add(new org.telegram.ui.Components.t5(emojiStatusDocumentId2.longValue(), (Paint.FontMetricsInt) null));
                                    if (arrayList18.size() + r30 >= 104) {
                                        break;
                                    }
                                    break;
                                    break;
                                }
                                if (((org.telegram.ui.Components.t5) arrayList18.get(i17)).getDocumentId() == emojiStatusDocumentId2.longValue()) {
                                    break;
                                    break;
                                }
                                i17++;
                            }
                            defaultEmojiStatuses = defaultEmojiStatuses;
                            size2 = size2;
                        }
                    }
                }
                if (arrayList18.size() > 40 - r30) {
                    while (i15 < arrayList18.size()) {
                        arrayList16.add(Long.valueOf((((org.telegram.ui.Components.t5) arrayList18.get(i15)).getDocumentId() * 13) + 43223));
                        this.f36419q0++;
                    }
                } else {
                    while (i15 < arrayList18.size()) {
                        arrayList16.add(Long.valueOf((((org.telegram.ui.Components.t5) arrayList18.get(i15)).getDocumentId() * 13) + 43223));
                        this.f36419q0++;
                    }
                }
            }
        } else {
            recentEmojiStatuses = MediaDataController.getInstance(i35).getRecentEmojiStatuses();
            MediaDataController mediaDataController6 = MediaDataController.getInstance(i35);
            if (i36 != 0) {
                tL_inputStickerSetEmojiDefaultStatuses = new TLRPC.TL_inputStickerSetEmojiDefaultStatuses();
            } else {
                tL_inputStickerSetEmojiDefaultStatuses = new TLRPC.TL_inputStickerSetEmojiDefaultStatuses();
            }
            stickerSet = mediaDataController6.getStickerSet(tL_inputStickerSetEmojiDefaultStatuses, true);
            if (stickerSet != null) {
                if (r30 != 0) {
                    this.f36419q0++;
                    arrayList16.add(2L);
                }
                if (i36 != 0) {
                    defaultEmojiStatuses = MediaDataController.getInstance(i35).getDefaultEmojiStatuses();
                } else {
                    defaultEmojiStatuses = MediaDataController.getInstance(i35).getDefaultEmojiStatuses();
                }
                arrayList3 = stickerSet.documents;
                if (arrayList3 != null) {
                    i18 = 0;
                    while (i18 < Math.min(7, stickerSet.documents.size())) {
                        tL_messages_stickerSet = stickerSet;
                        arrayList18.add(new org.telegram.ui.Components.t5(stickerSet.documents.get(i18), (Paint.FontMetricsInt) null));
                        if (arrayList18.size() + r30 >= 104) {
                            break;
                            break;
                        } else {
                            i18++;
                            stickerSet = tL_messages_stickerSet;
                        }
                    }
                }
                if (i36 != 0) {
                    size = recentEmojiStatuses.size();
                    i12 = 0;
                    while (i12 < size) {
                        TLRPC.EmojiStatus emojiStatus6 = recentEmojiStatuses.get(i12);
                        i12++;
                        emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(emojiStatus6);
                        if (emojiStatusDocumentId != null) {
                            arrayList4 = recentEmojiStatuses;
                            i13 = 0;
                            while (true) {
                                if (i13 >= arrayList18.size()) {
                                    i14 = size;
                                    arrayList18.add(new org.telegram.ui.Components.t5(emojiStatusDocumentId.longValue(), (Paint.FontMetricsInt) null));
                                    if (arrayList18.size() + r30 < 104) {
                                        recentEmojiStatuses = arrayList4;
                                        size = i14;
                                        break;
                                        break;
                                    }
                                    break;
                                    break;
                                }
                                if (((org.telegram.ui.Components.t5) arrayList18.get(i13)).getDocumentId() == emojiStatusDocumentId.longValue()) {
                                    recentEmojiStatuses = arrayList4;
                                    break;
                                    break;
                                }
                                i13++;
                            }
                        }
                    }
                } else {
                    size = recentEmojiStatuses.size();
                    i12 = 0;
                    while (i12 < size) {
                        TLRPC.EmojiStatus emojiStatus7 = recentEmojiStatuses.get(i12);
                        i12++;
                        emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(emojiStatus7);
                        if (emojiStatusDocumentId != null) {
                            arrayList4 = recentEmojiStatuses;
                            i13 = 0;
                            while (true) {
                                if (i13 >= arrayList18.size()) {
                                    i14 = size;
                                    arrayList18.add(new org.telegram.ui.Components.t5(emojiStatusDocumentId.longValue(), (Paint.FontMetricsInt) null));
                                    if (arrayList18.size() + r30 < 104) {
                                        recentEmojiStatuses = arrayList4;
                                        size = i14;
                                        break;
                                        break;
                                    }
                                    break;
                                    break;
                                }
                                if (((org.telegram.ui.Components.t5) arrayList18.get(i13)).getDocumentId() == emojiStatusDocumentId.longValue()) {
                                    recentEmojiStatuses = arrayList4;
                                    break;
                                    break;
                                }
                                i13++;
                            }
                        }
                    }
                }
                if (defaultEmojiStatuses != null) {
                    size2 = defaultEmojiStatuses.size();
                    i16 = 0;
                    while (i16 < size2) {
                        TLRPC.EmojiStatus emojiStatus8 = defaultEmojiStatuses.get(i16);
                        i16++;
                        emojiStatusDocumentId2 = UserObject.getEmojiStatusDocumentId(emojiStatus8);
                        if (emojiStatusDocumentId2 != null) {
                            i17 = 0;
                            while (true) {
                                if (i17 >= arrayList18.size()) {
                                    arrayList18.add(new org.telegram.ui.Components.t5(emojiStatusDocumentId2.longValue(), (Paint.FontMetricsInt) null));
                                    if (arrayList18.size() + r30 >= 104) {
                                        break;
                                    }
                                    break;
                                    break;
                                }
                                if (((org.telegram.ui.Components.t5) arrayList18.get(i17)).getDocumentId() == emojiStatusDocumentId2.longValue()) {
                                    break;
                                    break;
                                }
                                i17++;
                            }
                            defaultEmojiStatuses = defaultEmojiStatuses;
                            size2 = size2;
                        }
                    }
                }
                if (arrayList18.size() > 40 - r30) {
                    while (i15 < arrayList18.size()) {
                        arrayList16.add(Long.valueOf((((org.telegram.ui.Components.t5) arrayList18.get(i15)).getDocumentId() * 13) + 43223));
                        this.f36419q0++;
                    }
                } else {
                    while (i15 < arrayList18.size()) {
                        arrayList16.add(Long.valueOf((((org.telegram.ui.Components.t5) arrayList18.get(i15)).getDocumentId() * 13) + 43223));
                        this.f36419q0++;
                    }
                }
            }
        }
        arrayList24.clear();
        if (i36 != 0) {
            j10 = 322;
            hh.m7 m7VarG2 = hh.u7.y(i35, false).G(getDialogId(), true);
            m7VarG2.a();
            arrayList5 = new ArrayList();
            arrayList6 = m7VarG2.f9753l;
            size3 = arrayList6.size();
            i19 = 0;
            while (i19 < size3) {
                Object obj3 = arrayList6.get(i19);
                i19++;
                starGift = ((TL_stars.SavedStarGift) obj3).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    arrayList5.add((TL_stars.TL_starGiftUnique) starGift);
                }
            }
            if (arrayList5.isEmpty()) {
                int i58 = this.f36419q0;
                this.f36419q0 = i58 + 1;
                this.f36412n = i58;
                arrayList16.add(22L);
                this.f36421r = this.f36419q0;
                size4 = arrayList5.size();
                i21 = 0;
                while (i21 < size4) {
                    Object obj4 = arrayList5.get(i21);
                    i21++;
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) obj4;
                    arrayList16.add(Long.valueOf((tL_starGiftUnique2.f22607id * 322) + 13334));
                    this.f36419q0++;
                    arrayList24.add(tL_starGiftUnique2);
                }
                j11 = 13334;
                this.f36424s = this.f36419q0;
                this.W.l(true);
            } else {
                j11 = 13334;
                this.W.l(false);
            }
            i20 = 13;
        } else {
            j10 = 322;
            hh.m7 m7VarG3 = hh.u7.y(i35, false).G(getDialogId(), true);
            m7VarG3.a();
            arrayList5 = new ArrayList();
            arrayList6 = m7VarG3.f9753l;
            size3 = arrayList6.size();
            i19 = 0;
            while (i19 < size3) {
                Object obj5 = arrayList6.get(i19);
                i19++;
                starGift = ((TL_stars.SavedStarGift) obj5).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    arrayList5.add((TL_stars.TL_starGiftUnique) starGift);
                }
            }
            if (arrayList5.isEmpty()) {
                int i59 = this.f36419q0;
                this.f36419q0 = i59 + 1;
                this.f36412n = i59;
                arrayList16.add(22L);
                this.f36421r = this.f36419q0;
                size4 = arrayList5.size();
                i21 = 0;
                while (i21 < size4) {
                    Object obj6 = arrayList5.get(i21);
                    i21++;
                    TL_stars.TL_starGiftUnique tL_starGiftUnique3 = (TL_stars.TL_starGiftUnique) obj6;
                    arrayList16.add(Long.valueOf((tL_starGiftUnique3.f22607id * 322) + 13334));
                    this.f36419q0++;
                    arrayList24.add(tL_starGiftUnique3);
                }
                j11 = 13334;
                this.f36424s = this.f36419q0;
                this.W.l(true);
            } else {
                j11 = 13334;
                this.W.l(false);
            }
            i20 = 13;
        }
        if (i36 == i20) {
            strArr = EmojiData.dataColored;
            length = strArr.length;
            while (i27 < length) {
                strArr2 = strArr[i27];
                length2 = strArr2.length;
                i28 = 0;
                while (i28 < length2) {
                    String str3 = strArr2[i28];
                    arrayList.add(str3);
                    arrayList16.add(Long.valueOf((((long) str3.hashCode()) * j10) + j11));
                    this.f36419q0++;
                    i28++;
                    strArr = strArr;
                    length = length;
                }
            }
        }
        if (i36 != 8) {
            i26 = 0;
            while (i26 < arrayList14.size()) {
                tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList14.get(i26);
                if (tL_messages_stickerSet2 != null) {
                    sparseIntArray4 = sparseIntArray;
                    sparseIntArray5 = sparseIntArray6;
                } else {
                    sparseIntArray4 = sparseIntArray;
                    sparseIntArray5 = sparseIntArray6;
                }
                i26++;
                sparseIntArray6 = sparseIntArray5;
                sparseIntArray = sparseIntArray4;
            }
        }
        sparseIntArray2 = sparseIntArray;
        sparseIntArray3 = sparseIntArray6;
        if (!this.M) {
            i23 = 0;
            while (i23 < arrayList25.size()) {
                arrayList25 = arrayList25;
                stickerSetCovered = (TLRPC.StickerSetCovered) arrayList25.get(i23);
                stickerSet2 = stickerSetCovered.set;
                i24 = 0;
                while (true) {
                    if (i24 < arrayList21.size()) {
                        arrayList8 = arrayList21;
                        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                            mediaDataController = mediaDataController3;
                            stickerSet3 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                            if (stickerSet3 != null) {
                                arrayList10 = stickerSet3.documents;
                                zIsPremiumEmojiPack2 = MessageObject.isPremiumEmojiPack(stickerSet3);
                                inputStickerSet2 = null;
                            } else {
                                inputStickerSet2 = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                                arrayList10 = new ArrayList<>();
                                zIsPremiumEmojiPack2 = true;
                            }
                            TLRPC.InputStickerSet inputStickerSet4 = inputStickerSet2;
                            arrayList9 = arrayList10;
                            zIsPremiumEmojiPack = zIsPremiumEmojiPack2;
                            inputStickerSet = inputStickerSet4;
                        } else {
                            mediaDataController = mediaDataController3;
                            if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                arrayList9 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                zIsPremiumEmojiPack = MessageObject.isPremiumEmojiPack(stickerSetCovered);
                            } else {
                                zIsPremiumEmojiPack = false;
                                arrayList9 = null;
                            }
                            inputStickerSet = null;
                        }
                        if (arrayList9 != null) {
                            arrayList25 = arrayList25;
                            sparseIntArray3.put(this.f36419q0, arrayList8.size());
                            sparseIntArray2.put(arrayList8.size(), this.f36419q0);
                            this.f36419q0++;
                            z14 = zIsPremiumEmojiPack;
                            arrayList16.add(Long.valueOf((stickerSet2.f22407id * 13) + 9211));
                            kxVar = new org.telegram.ui.Components.kx();
                            kxVar.d = inputStickerSet;
                            i23 = i23;
                            kxVar.f30208f = this.f36437x0.contains(Long.valueOf(stickerSet2.f22407id));
                            kxVar.f30209g = true;
                            if (i36 == 4) {
                                kxVar.f30207e = false;
                            } else {
                                kxVar.f30207e = !z14;
                            }
                            kxVar.f30205b = stickerSet2;
                            kxVar.f30206c = j(hashSet, arrayList9);
                            arrayList8.size();
                            kxVar.h = this.f36434w0.contains(Long.valueOf(kxVar.f30205b.f22407id));
                            if (kxVar.f30206c.size() > 24) {
                                this.f36419q0 = kxVar.f30206c.size() + this.f36419q0;
                                while (i25 < kxVar.f30206c.size()) {
                                    arrayList16.add(Long.valueOf((((TLRPC.Document) kxVar.f30206c.get(i25)).f22386id * 13) + 3212));
                                }
                            } else {
                                this.f36419q0 = kxVar.f30206c.size() + this.f36419q0;
                                while (i25 < kxVar.f30206c.size()) {
                                    arrayList16.add(Long.valueOf((((TLRPC.Document) kxVar.f30206c.get(i25)).f22386id * 13) + 3212));
                                }
                            }
                            if (kxVar.f30208f) {
                            }
                            arrayList8.add(kxVar);
                            break;
                            break;
                        }
                    } else {
                        arrayList8 = arrayList21;
                        if (((org.telegram.ui.Components.kx) arrayList21.get(i24)).f30205b.f22407id == stickerSet2.f22407id) {
                            mediaDataController = mediaDataController3;
                        } else {
                            i24++;
                            arrayList21 = arrayList8;
                        }
                    }
                    break;
                    break;
                }
                i23++;
                sparseIntArray10 = sparseIntArray10;
                arrayList21 = arrayList8;
                mediaDataController3 = mediaDataController;
            }
        }
        arrayList7 = arrayList21;
        if (i36 != 14) {
            this.W.p(arrayList7);
        }
        x41Var = this.f36392d0;
        if (z17) {
            x41Var.setItemAnimator(this.f36385a1);
        } else {
            x41Var.setItemAnimator(null);
        }
        if (z12) {
            i22 = 0;
            f2.q.c(new org.telegram.ui.Components.fx(this, arrayList17, 2), false).b(this.f36410l0);
        } else {
            i22 = 0;
            this.f36410l0.l();
        }
        if (x41Var.H1) {
            x41Var.u0(i22);
        }
    }

    public final void C() {
        r41 r41Var = this.f36387b0;
        if (r41Var == null) {
            return;
        }
        if (this.f36430u1) {
            r41Var.clearAnimation();
            r41Var.setVisibility(0);
            r41Var.animate().translationY(0.0f).start();
            return;
        }
        x41 x41Var = this.f36392d0;
        if (x41Var.getChildCount() <= 0) {
            r41Var.setTranslationY(-AndroidUtilities.dp(52.0f));
            return;
        }
        View childAt = x41Var.getChildAt(0);
        if (RecyclerView.R(childAt) != this.f36383a || !"searchbox".equals(childAt.getTag())) {
            r41Var.setTranslationY(-AndroidUtilities.dp(52.0f));
        } else {
            r41Var.setVisibility(0);
            r41Var.setTranslationY(childAt.getY());
        }
    }

    public final void E(float f10) {
        View view = this.f36404i0;
        if (view != null) {
            float interpolation = org.telegram.ui.Components.er.f28123g.getInterpolation(h7.n.a((((f10 * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            view.setScaleY(interpolation * (n() ? -1 : 1));
        }
        org.telegram.ui.Components.zm zmVar = this.f36406j0;
        if (zmVar != null) {
            float fA = h7.n.a((((f10 * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            zmVar.setAlpha(fA);
            zmVar.setScaleX(fA);
            zmVar.setScaleY(fA * (n() ? -1 : 1));
        }
        float f11 = 800.0f * f10;
        float f12 = f11 - 40.0f;
        float fA2 = h7.n.a(f12 / 700.0f, 0.0f, 1.0f);
        float fA3 = h7.n.a((f11 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float fA4 = h7.n.a(f12 / 750.0f, 0.0f, 1.0f);
        float fA5 = h7.n.a((f11 - 30.0f) / 120.0f, 0.0f, 1.0f);
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        float interpolation2 = erVar.getInterpolation(fA2);
        float interpolation3 = erVar.getInterpolation(fA3);
        this.U.setAlpha(fA5);
        this.f36387b0.setAlpha(fA5);
        int i10 = 0;
        for (int i11 = 0; i11 < this.W.f26767b.getChildCount(); i11++) {
            this.W.f26767b.getChildAt(i11).setAlpha(fA5);
        }
        if (this.f36407j1 != null) {
            invalidate();
        }
        float f13 = 1.0f - fA5;
        float fDp = AndroidUtilities.dp(-5.0f) * f13;
        u41 u41Var = this.T;
        u41Var.setTranslationY(fDp);
        if (zmVar != null) {
            zmVar.setTranslationY(AndroidUtilities.dp(-5.0f) * f13);
        }
        this.W0 = (interpolation2 * 0.85f) + 0.15f;
        this.X0 = (interpolation3 * 0.925f) + 0.075f;
        u41Var.invalidateOutline();
        if (zmVar != null) {
            zmVar.setAlpha(fA5);
        }
        s41 s41Var = this.f36384a0;
        s41Var.setAlpha(fA5);
        s41Var.setScaleX(Math.min(this.W0, 1.0f));
        float pivotX = s41Var.getPivotX();
        float fSqrt = (float) Math.sqrt(Math.max(Math.pow(u41Var.getHeight(), 2.0d) + ((double) (pivotX * pivotX)), Math.pow(u41Var.getHeight(), 2.0d) + Math.pow(u41Var.getWidth() - pivotX, 2.0d)));
        for (int i12 = 0; i12 < this.W.f26767b.getChildCount(); i12++) {
            View childAt = this.W.f26767b.getChildAt(i12);
            if (f10 == 0.0f) {
                childAt.setLayerType(2, null);
            } else if (f10 == 1.0f) {
                childAt.setLayerType(0, null);
            }
            float width = ((childAt.getWidth() / 2.0f) + childAt.getLeft()) - pivotX;
            float height = (childAt.getHeight() / 2.0f) + childAt.getTop();
            if (n()) {
                height = getMeasuredHeight() - height;
            }
            float fCascade = AndroidUtilities.cascade(fA4, (float) Math.sqrt(com.google.android.recaptcha.internal.a.x(height, height, 0.4f, width * width)), fSqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(fCascade)) {
                fCascade = 0.0f;
            }
            childAt.setScaleX(fCascade);
            childAt.setScaleY(fCascade);
        }
        while (true) {
            x41 x41Var = this.f36392d0;
            if (i10 >= x41Var.getChildCount()) {
                this.f36400g0.invalidate();
                x41Var.invalidate();
                return;
            }
            View childAt2 = x41Var.getChildAt(i10);
            if (childAt2 instanceof j51) {
                j51 j51Var = (j51) childAt2;
                float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                if (n()) {
                    height2 = getMeasuredHeight() - height2;
                }
                float fCascade2 = AndroidUtilities.cascade(fA4, (float) Math.sqrt(com.google.android.recaptcha.internal.a.x(height2, height2, 0.2f, width2 * width2)), fSqrt, childAt2.getHeight() * 1.75f);
                if (Float.isNaN(fCascade2)) {
                    fCascade2 = 0.0f;
                }
                j51Var.setAnimatedScale(fCascade2);
            }
            i10++;
        }
    }

    public boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.stickersDidLoad;
        e41 e41Var = this.O1;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.M)) {
                AndroidUtilities.cancelRunOnUIThread(e41Var);
                AndroidUtilities.runOnUIThread(e41Var);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(e41Var);
            AndroidUtilities.runOnUIThread(e41Var);
            return;
        }
        if (i10 == NotificationCenter.recentEmojiStatusesUpdate) {
            AndroidUtilities.cancelRunOnUIThread(e41Var);
            AndroidUtilities.runOnUIThread(e41Var);
            return;
        }
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(e41Var);
            AndroidUtilities.runOnUIThread(e41Var);
            return;
        }
        if (i10 != NotificationCenter.emojiLoaded) {
            if (i10 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == UserConfig.getInstance(this.R).getClientUserId()) {
                AndroidUtilities.cancelRunOnUIThread(e41Var);
                AndroidUtilities.runOnUIThread(e41Var);
                return;
            }
            return;
        }
        j4.w0 w0Var = new j4.w0(18);
        x41 x41Var = this.f36392d0;
        AndroidUtilities.forEachViews((RecyclerView) x41Var, (d5.d) w0Var);
        if (x41Var != null) {
            x41Var.invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        org.telegram.ui.Components.i5 i5Var = this.f36407j1;
        if (i5Var != null && (num = this.U0) != null) {
            Rect bounds = i5Var.getBounds();
            View view = this.l1;
            float scaleY = view == null ? 1.0f : view.getScaleY();
            int alpha = this.f36407j1.getAlpha();
            View view2 = this.l1;
            if (view2 == null) {
                bounds.height();
            } else {
                view2.getHeight();
            }
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f36407j1.v = (int) (Math.pow(this.T.getAlpha(), 0.25d) * ((double) alpha) * ((double) this.f36403h1));
            if (this.f36409k1 == null) {
                this.f36409k1 = new Rect();
            }
            float f10 = (scaleY <= 1.0f || scaleY >= 1.5f) ? 0 : 2;
            float fHeight = scaleY > 1.5f ? (bounds.height() * 0.81f) + 1.0f : 0.0f;
            float fIntValue = num.intValue() + f10;
            float fZ = com.google.android.recaptcha.internal.a.z(scaleY, 1.0f, bounds.centerY(), -fHeight);
            boolean zN = n();
            int i10 = this.Z0;
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + fZ + (!zN ? AndroidUtilities.dp(i10) : getMeasuredHeight() - (AndroidUtilities.dp(i10) / 2.0f));
            float fWidth = (bounds.width() * scaleY) / 2.0f;
            float fHeight2 = (bounds.height() * scaleY) / 2.0f;
            this.f36409k1.set((int) (fIntValue - fWidth), (int) (scrimDrawableTranslationY - fHeight2), (int) (fIntValue + fWidth), (int) (scrimDrawableTranslationY + fHeight2));
            org.telegram.ui.Components.i5 i5Var2 = this.f36407j1;
            Rect rect = this.f36409k1;
            int i11 = rect.left;
            int i12 = rect.top;
            int iWidth = (int) ((rect.width() / scaleY) + i11);
            Rect rect2 = this.f36409k1;
            i5Var2.setBounds(i11, i12, iWidth, (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.f36409k1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.f36407j1.draw(canvas);
            org.telegram.ui.Components.i5 i5Var3 = this.f36407j1;
            i5Var3.v = alpha;
            i5Var3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        j51 j51Var = this.f36414n1;
        if (j51Var == null || this.f36416o1 == null || j51Var.A == null) {
            return;
        }
        canvas.save();
        canvas.translate(0.0f, -getTranslationY());
        this.f36414n1.A.setAlpha((int) (this.f36411m1 * 255.0f));
        this.f36414n1.A.setBounds(this.f36416o1);
        this.f36414n1.A.setColorFilter(new PorterDuffColorFilter(i0.b.d(1.0f - this.f36403h1, this.f36388b1, this.f36405i1), PorterDuff.Mode.SRC_IN));
        this.f36414n1.A.draw(canvas);
        canvas.restore();
    }

    public final long f() {
        return Math.max(450L, ((long) Math.min(55, this.K1 - this.J1)) * 30);
    }

    public final long g() {
        return Math.max(300L, ((long) Math.min(45, this.K1 - this.J1)) * 25) + f() + 16;
    }

    public hh.bb getCollectionParticles() {
        if (this.M1 == null) {
            this.M1 = new hh.bb(1, 8);
        }
        return this.M1;
    }

    public long getDialogId() {
        return UserConfig.getInstance(this.R).getClientUserId();
    }

    public float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    public final void h() {
        boolean zCanScrollVertically = (this.B1 ? this.f36395e0 : this.f36392d0).canScrollVertically(1);
        if (zCanScrollVertically != this.f36423r1) {
            this.f36423r1 = zCanScrollVertically;
            this.f36408k0.animate().alpha(zCanScrollVertically ? 1.0f : 0.0f).setDuration(200L).start();
        }
    }

    public final void i(int i10, View view) {
        boolean z10;
        int i11;
        int size;
        Integer numValueOf;
        int i12;
        int size2;
        boolean z11;
        int i13 = this.f36429u0.get(i10);
        Integer numValueOf2 = null;
        if (i13 < 0) {
            if (i13 == -1) {
                return;
            } else {
                return;
            }
        }
        ArrayList arrayList = this.I0;
        if (i13 < arrayList.size()) {
            org.telegram.ui.Components.kx kxVar = (org.telegram.ui.Components.kx) arrayList.get(i13);
            if (kxVar.h) {
                return;
            }
            z11 = i13 + 1 == arrayList.size();
            i12 = this.f36427t0.get(i13);
            this.f36434w0.add(Long.valueOf(kxVar.f30205b.f22407id));
            i11 = 24;
            size = kxVar.h ? kxVar.f30206c.size() : Math.min(24, kxVar.f30206c.size());
            numValueOf = kxVar.f30206c.size() > 24 ? Integer.valueOf(i12 + 1 + size) : null;
            kxVar.h = true;
            size2 = kxVar.f30206c.size();
        } else {
            if (i13 == -1 || (z10 = this.f36440y0)) {
                return;
            }
            int i14 = (this.f36383a != -1 ? 1 : 0) + (this.v != -1 ? 1 : 0);
            boolean z12 = this.J0;
            int i15 = i14 + (z12 ? 1 : 0);
            ArrayList arrayList2 = this.f36442z0;
            int size3 = z10 ? arrayList2.size() : Math.min(38 - (z12 ? 1 : 0), arrayList2.size());
            int size4 = arrayList2.size();
            this.f36440y0 = true;
            i11 = 40;
            size = size3;
            numValueOf = null;
            i12 = i15;
            size2 = size4;
            z11 = false;
        }
        if (size2 > size) {
            numValueOf = Integer.valueOf(i12 + 1 + size);
            numValueOf2 = Integer.valueOf(size2 - size);
        }
        B(false, true, true);
        if (numValueOf == null || numValueOf2 == null) {
            return;
        }
        this.I1 = view;
        this.J1 = numValueOf.intValue();
        this.K1 = numValueOf2.intValue() + numValueOf.intValue();
        this.L1 = SystemClock.elapsedRealtime();
        if (z11) {
            post(new org.telegram.ui.Components.ex(this, numValueOf2.intValue() > i11 / 2 ? 1.5f : 3.5f, numValueOf.intValue(), 1));
        }
    }

    public final void l() {
        int i10 = this.S;
        if (i10 == 2) {
            return;
        }
        String strP = a9.p.p(new StringBuilder("emoji"), (i10 == 0 || i10 == 12 || i10 == 9 || i10 == 10) ? "status" : "reaction", "usehint");
        int i11 = MessagesController.getGlobalMainSettings().getInt(strP, 0);
        if (i11 <= 3) {
            MessagesController.getGlobalMainSettings().edit().putInt(strP, i11 + 1).apply();
        }
    }

    public final boolean n() {
        int i10 = this.S;
        return i10 == 5 || i10 == 10 || i10 == 12 || i10 == 15;
    }

    public final void o(android.view.View r14, org.telegram.ui.Components.t5 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a61.o(android.view.View, org.telegram.ui.Components.t5):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E = true;
        int i10 = this.R;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.featuredEmojiDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupStickersDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        int i11 = this.S;
        if (i11 == 0 || i11 == 12) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        }
        org.telegram.ui.Components.i5 i5Var = this.f36407j1;
        if (i5Var != null) {
            i5Var.f29230n = this;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setBigReactionAnimatedEmoji(null);
        this.E = false;
        int i10 = this.R;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.featuredEmojiDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        int i11 = this.S;
        if (i11 == 0 || i11 == 12) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        }
        org.telegram.ui.Components.i5 i5Var = this.f36407j1;
        if (i5Var != null) {
            i5Var.f29230n = null;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && this.S == 6) {
            this.f36413n0.y1((getMeasuredWidth() / AndroidUtilities.dp(42.0f)) * 5);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10 = this.M0;
        int i12 = this.S;
        if (z10 && i12 != 3 && i12 != 4) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f), Integer.MIN_VALUE));
        } else if (i12 == 6) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.displaySize.y * 0.35f), Integer.MIN_VALUE));
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public abstract void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num);

    public final void s(q51 q51Var) {
        Integer num = this.U1;
        if (num != null) {
        }
        this.P1 = q51Var;
        boolean z10 = this.M0;
        int i10 = 0;
        x41 x41Var = this.f36392d0;
        if (!z10) {
            h();
            while (i10 < x41Var.getChildCount()) {
                View childAt = x41Var.getChildAt(i10);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
                i10++;
            }
            return;
        }
        ValueAnimator valueAnimator = this.Q1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Q1 = null;
        }
        ValueAnimator valueAnimator2 = this.R1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.R1 = null;
        }
        int i11 = this.S;
        if (i11 == 3 || i11 == 4 || i11 == 6) {
            h();
            E(1.0f);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Q1 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new d41(this, i10));
        this.Q1.addListener(new f50(this, 28));
        e41 e41Var = new e41(this, i10);
        ig.g0.f11306f = true;
        ig.g0.f11305e = true;
        ig.g0.f11307g = false;
        if (ig.g0.d) {
            ig.g0.d = false;
        }
        ig.g0.f11304c = e41Var;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.S1.lock();
        this.Q1.setDuration(800L);
        x41Var.setLayerType(2, null);
        this.f36387b0.setLayerType(2, null);
        this.f36384a0.setLayerType(2, null);
        this.U.setLayerType(2, null);
        org.telegram.ui.Components.zm zmVar = this.f36406j0;
        if (zmVar != null) {
            zmVar.setLayerType(2, null);
        }
        View view = this.f36404i0;
        if (view != null) {
            view.setLayerType(2, null);
        }
        this.W.m(true);
        E(0.0f);
    }

    public void setAnimationsEnabled(boolean z10) {
        this.L = z10;
    }

    public void setBackgroundDelegate(a51 a51Var) {
        this.Q = a51Var;
    }

    public void setDrawBackground(boolean z10) {
        this.M0 = z10;
        this.T.setClipToOutline(z10);
        ag.t0 t0Var = this.U;
        if (z10) {
            t0Var.setVisibility(0);
        } else {
            t0Var.setVisibility(8);
        }
    }

    public void setEnterAnimationInProgress(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            if (z10) {
                return;
            }
            AndroidUtilities.forEachViews((RecyclerView) this.f36392d0, (d5.d) new j4.w0(13));
            for (int i10 = 0; i10 < this.W.f26767b.getChildCount(); i10++) {
                View childAt = this.W.f26767b.getChildAt(i10);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
            }
            this.W.f26767b.invalidate();
        }
    }

    public void setExpireDateHint(int i10) {
        if (i10 <= 0) {
            return;
        }
        this.K0 = true;
        this.L0 = Integer.valueOf(i10);
        B(true, false, true);
    }

    public void setForUser(boolean z10) {
        this.N = z10;
        B(false, false, true);
    }

    public void setForumIconDrawable(Drawable drawable) {
        this.J = drawable;
        j51 j51Var = this.K;
        if (j51Var != null) {
            j51Var.h.setImageBitmap(drawable);
        }
    }

    public void setLongPressEnabled(boolean z10) {
        this.f36393d1 = z10;
    }

    public void setOnLongPressedListener(y51 y51Var) {
        this.D = y51Var;
    }

    public void setRecentReactions(List<ig.q0> list) {
        this.N0 = list;
        B(false, true, true);
    }

    public void setSaveState(int i10) {
        this.U1 = Integer.valueOf(i10);
    }

    public void setSelected(Long l10) {
        HashSet hashSet = this.G;
        hashSet.clear();
        hashSet.add(l10);
        x41 x41Var = this.f36392d0;
        if (x41Var != null) {
            for (int i10 = 0; i10 < x41Var.getChildCount(); i10++) {
                if (x41Var.getChildAt(i10) instanceof j51) {
                    j51 j51Var = (j51) x41Var.getChildAt(i10);
                    org.telegram.ui.Components.t5 t5Var = j51Var.f39259e;
                    if (t5Var != null) {
                        j51Var.d(hashSet.contains(Long.valueOf(t5Var.getDocumentId())), true);
                    } else {
                        j51Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            x41Var.invalidate();
        }
    }

    public void setSelectedReaction(ig.q0 q0Var) {
        this.F.clear();
        this.F.add(q0Var);
        x41 x41Var = this.f36392d0;
        if (x41Var != null) {
            for (int i10 = 0; i10 < x41Var.getChildCount(); i10++) {
                if (x41Var.getChildAt(i10) instanceof j51) {
                    j51 j51Var = (j51) x41Var.getChildAt(i10);
                    j51Var.d(this.F.contains(j51Var.f39265x), true);
                }
            }
            x41Var.invalidate();
        }
        n41 n41Var = this.f36395e0;
        if (n41Var != null) {
            for (int i11 = 0; i11 < n41Var.getChildCount(); i11++) {
                if (n41Var.getChildAt(i11) instanceof j51) {
                    j51 j51Var2 = (j51) n41Var.getChildAt(i11);
                    j51Var2.d(this.F.contains(j51Var2.f39265x), true);
                }
            }
            n41Var.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<ig.q0> hashSet) {
        this.F = hashSet;
        HashSet hashSet2 = this.G;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != null && ((ig.q0) arrayList.get(i10)).f11413g != 0) {
                hashSet2.add(Long.valueOf(((ig.q0) arrayList.get(i10)).f11413g));
            }
        }
    }

    public boolean u() {
        return false;
    }

    public final void v(String str, boolean z10, boolean z11) {
        e41 e41Var = this.E1;
        if (e41Var != null) {
            AndroidUtilities.cancelRunOnUIThread(e41Var);
            this.E1 = null;
        }
        jh.q5 q5Var = this.F1;
        if (q5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(q5Var);
            this.F1 = null;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        k51 k51Var = this.m0;
        r41 r41Var = this.f36387b0;
        if (zIsEmpty) {
            this.f36428t1 = false;
            this.f36430u1 = false;
            z(false, z10);
            if (r41Var != null) {
                r41Var.e(true);
                p51.a(r41Var, false);
            }
            k51Var.E(true);
            this.f36432v1 = null;
        } else {
            boolean z12 = this.f36428t1;
            boolean z13 = !z12;
            this.f36428t1 = true;
            this.f36430u1 = false;
            if (r41Var != null) {
                r41Var.f41276f.b(2);
            }
            if (!z12) {
                ArrayList arrayList = this.f36435w1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = this.f36438x1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = this.f36443z1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                k51Var.E(false);
            } else if (!str.equals(this.f36432v1)) {
                e41 e41Var2 = new e41(this, 1);
                this.E1 = e41Var2;
                AndroidUtilities.runOnUIThread(e41Var2, 120L);
            }
            this.f36432v1 = str;
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            if (!Arrays.equals(currentKeyboardLanguage, W1)) {
                MediaDataController.getInstance(this.R).fetchNewEmojiKeywords(currentKeyboardLanguage);
            }
            W1 = currentKeyboardLanguage;
            jh.q5 q5Var2 = new jh.q5(this, str, z10, z13, currentKeyboardLanguage, 3);
            this.F1 = q5Var2;
            AndroidUtilities.runOnUIThread(q5Var2, z11 ? 425L : 0L);
            if (r41Var != null) {
                r41Var.f41276f.b(2);
                p51.a(r41Var, z10);
            }
        }
        C();
    }

    public final void w(float f10) {
        ValueAnimator valueAnimator = this.f36396e1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f36396e1 = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f36417p0.getAlpha(), f10 * 0.25f);
        this.f36396e1 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new d41(this, 2));
        this.f36396e1.setDuration(200L);
        this.f36396e1.setInterpolator(org.telegram.ui.Components.er.f28122f);
        this.f36396e1.start();
    }

    public final void x(Long l10, boolean z10) {
        boolean z11;
        HashSet hashSet = this.G;
        if (hashSet.contains(l10)) {
            hashSet.remove(l10);
            z11 = false;
        } else {
            hashSet.add(l10);
            z11 = true;
        }
        x41 x41Var = this.f36392d0;
        if (x41Var != null) {
            for (int i10 = 0; i10 < x41Var.getChildCount(); i10++) {
                if (x41Var.getChildAt(i10) instanceof j51) {
                    j51 j51Var = (j51) x41Var.getChildAt(i10);
                    org.telegram.ui.Components.t5 t5Var = j51Var.f39259e;
                    if (t5Var == null || t5Var.getDocumentId() != l10.longValue()) {
                        TLRPC.Document document = j51Var.d;
                        if (document != null && document.f22386id == l10.longValue()) {
                            j51Var.e(z11, z10);
                        }
                    } else {
                        j51Var.e(z11, z10);
                    }
                }
            }
            x41Var.invalidate();
        }
    }

    public final void y(org.telegram.ui.Components.i5 i5Var, View view) {
        Integer num;
        this.f36405i1 = (i5Var == null || (num = i5Var.B) == null) ? 0 : num.intValue();
        this.f36407j1 = i5Var;
        this.l1 = view;
        if (this.E && i5Var != null) {
            i5Var.f29230n = this;
        }
        invalidate();
    }

    public final void z(boolean z10, boolean z11) {
        if (this.B1 == z10) {
            return;
        }
        this.B1 = z10;
        x41 x41Var = this.f36392d0;
        int i10 = 0;
        x41Var.setVisibility(0);
        n41 n41Var = this.f36395e0;
        n41Var.setVisibility(0);
        ValueAnimator valueAnimator = this.A1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.D1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.D1 = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A1 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new h41(this, z10, i10));
        this.A1.addListener(new t41(this, z10, i10));
        this.A1.setDuration(320L);
        this.A1.setInterpolator(org.telegram.ui.Components.er.h);
        this.A1.start();
        org.telegram.messenger.rl.o(((View) x41Var.getParent()).animate().translationY((this.B1 && z11) ? -AndroidUtilities.dp(36.0f) : 0.0f).setUpdateListener(new d41(this, 1)), org.telegram.ui.Components.er.f28122f, 160L);
        if (!this.B1 || z11) {
            n41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        } else {
            n41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        }
        h();
    }

    public a61(org.telegram.ui.ActionBar.n2 n2Var, Context context, boolean z10, Integer num, int i10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        this(n2Var, context, z10, num, i10, z11, c6Var, i11, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23373v6, c6Var));
    }

    public a61(org.telegram.ui.ActionBar.n2 n2Var, Context context, boolean z10, Integer num, int i10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var, int i11, int i12) {
        int i13;
        boolean z12;
        int i14;
        int i15;
        float f10;
        org.telegram.ui.Components.er erVar;
        n41 n41Var;
        TextView textView;
        float f11;
        View view;
        Drawable drawable;
        int i16;
        int i17;
        int i18;
        boolean z13;
        Integer num2;
        w41 w41Var;
        boolean z14;
        boolean z15;
        m21 m21Var;
        int i19;
        org.telegram.ui.Components.iv ivVar;
        int i20;
        boolean z16;
        float f12;
        super(context);
        int i21 = i10;
        int i22 = i12;
        this.F = new HashSet();
        this.G = new HashSet();
        Paint paint = new Paint(1);
        this.H = paint;
        Paint paint2 = new Paint(1);
        this.I = paint2;
        this.O = new ArrayList();
        this.R = UserConfig.selectedAccount;
        this.V = new org.telegram.ui.Components.mv[2];
        this.f36422r0 = new ArrayList();
        this.f36425s0 = new SparseIntArray();
        this.f36427t0 = new SparseIntArray();
        this.f36429u0 = new SparseIntArray();
        this.f36431v0 = new SparseIntArray();
        this.f36434w0 = new ArrayList();
        this.f36437x0 = new ArrayList();
        this.f36440y0 = false;
        this.f36442z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.D0 = new ArrayList();
        this.E0 = new ArrayList();
        this.F0 = new ArrayList();
        this.G0 = new ArrayList();
        this.H0 = new ArrayList();
        this.I0 = new ArrayList();
        this.J0 = false;
        this.K0 = false;
        this.M0 = true;
        this.R0 = new ImageReceiver();
        this.f36393d1 = true;
        this.f36403h1 = 1.0f;
        this.f36411m1 = 1.0f;
        this.f36418p1 = new OvershootInterpolator(2.0f);
        this.f36423r1 = false;
        this.f36426s1 = false;
        this.f36428t1 = false;
        this.f36430u1 = false;
        this.B1 = false;
        this.C1 = false;
        this.G1 = false;
        this.H1 = false;
        this.J1 = -1;
        this.K1 = -1;
        this.L1 = -1L;
        this.N1 = new e41(this, 3);
        this.O1 = new e41(this, 4);
        this.S1 = new AnimationNotificationsLocker();
        this.T1 = new Paint();
        this.V0 = c6Var;
        this.S = i21;
        this.J0 = z10;
        this.Y0 = n2Var;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        StringBuilder sb2 = new StringBuilder("emoji");
        sb2.append((i21 == 0 || i21 == 12 || i21 == 9 || i21 == 10) ? "status" : "reaction");
        sb2.append("usehint");
        this.K0 = globalMainSettings.getInt(sb2.toString(), 0) < 3;
        this.f36388b1 = i22;
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var));
        paint2.setColor(i0.b.k(i22, 30));
        this.f36401g1 = new PorterDuffColorFilter(i22, PorterDuff.Mode.SRC_IN);
        this.U0 = num;
        Integer numValueOf = num == null ? null : Integer.valueOf(h7.n.b(num.intValue(), AndroidUtilities.dp(26.0f), AndroidUtilities.dp(292.0f)));
        boolean z17 = numValueOf != null && numValueOf.intValue() > AndroidUtilities.dp(170.0f);
        setFocusableInTouchMode(true);
        if (i21 == 0 || i21 == 12 || i21 == 9 || i21 == 10 || i21 == 2 || i21 == 5 || i21 == 7) {
            this.Z0 = i11;
            setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            setOnTouchListener(new g0(this, 6));
        }
        if (numValueOf != null) {
            View view2 = new View(context);
            this.f36404i0 = view2;
            Drawable drawableMutate = getResources().getDrawable(R.drawable.shadowed_bubble1).mutate();
            drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var), PorterDuff.Mode.MULTIPLY));
            view2.setBackground(drawableMutate);
            addView(view2, h7.z5.d(10, 10.0f, (n() ? 80 : 48) | 3, (numValueOf.intValue() / AndroidUtilities.density) + (z17 ? -12 : 4), n() ? 0 : this.Z0, 0.0f, n() ? this.Z0 : 0));
        }
        ag.t0 t0Var = new ag.t0(this, context, c6Var, 14);
        this.U = t0Var;
        boolean z18 = i21 == 3 || i21 == 4;
        boolean z19 = z18;
        u41 u41Var = new u41(this, context, z18, z19, c6Var, numValueOf);
        Integer num3 = numValueOf;
        this.T = u41Var;
        if (!z19) {
            u41Var.setOutlineProvider(new v41(this, num3));
            u41Var.setClipToOutline(true);
            if (z19) {
                u41Var.setElevation(2.0f);
            }
        }
        if (i21 == 0 || i21 == 12 || i21 == 9 || i21 == 10 || i21 == 2 || i21 == 5 || i21 == 15) {
            u41Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        }
        u41Var.addView(t0Var, h7.z5.c(-1.0f, -1));
        addView(u41Var, h7.z5.d(-1, -1.0f, 119, 0.0f, (i21 == 0 || i21 == 12 || i21 == 9 || i21 == 2 || i21 == 7) ? this.Z0 + 6 : 0.0f, 0.0f, n() ? this.Z0 + 6 : 0.0f));
        if (num3 != null) {
            org.telegram.ui.Components.zm zmVar = new org.telegram.ui.Components.zm(context, 23);
            this.f36406j0 = zmVar;
            Drawable drawable2 = getResources().getDrawable(R.drawable.shadowed_bubble2_half);
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var), PorterDuff.Mode.MULTIPLY));
            zmVar.setBackground(drawable2);
            addView(zmVar, h7.z5.d(17, 9.0f, (n() ? 80 : 48) | 3, (num3.intValue() / AndroidUtilities.density) + (z17 ? -25 : 10), n() ? 0.0f : this.Z0 + 5, 0.0f, n() ? this.Z0 + 14 : 0.0f));
        }
        if (n2Var != null && i21 != 3 && i21 != 6 && i21 != 5 && i21 != 7) {
            i13 = 4;
            if (i21 != 4 && i21 != 9 && i21 != 10 && z11) {
                z12 = true;
            }
            i14 = 0;
            while (i14 < 2) {
                num2 = num3;
                if (i21 != i13) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (i21 == 0 && i21 != 12 && i21 != 9) {
                    if (i21 != 10) {
                        z15 = false;
                    }
                    if (z12) {
                        m21Var = new m21(5, this, n2Var);
                    } else {
                        m21Var = null;
                    }
                    i19 = i21;
                    w41Var = new w41(this, context, c6Var, z14, z15, i19, m21Var, i22, i10);
                    ivVar = w41Var.f30759y;
                    if (ivVar != null) {
                        ivVar.setOnLongClickListener(new v(this, 7));
                    }
                    w41Var.R = false;
                    if (i19 == i13) {
                        w41Var.setAnimatedEmojiCacheType(13);
                    } else {
                        if (i19 != 0 || i19 == 12 || i19 == 2) {
                            i20 = 6;
                        } else {
                            i20 = 5;
                        }
                        w41Var.setAnimatedEmojiCacheType(i20);
                    }
                    if (num2 == null) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    w41Var.K = z16;
                    if (i19 == 6) {
                        f12 = 10.0f;
                    } else {
                        f12 = 5.0f;
                    }
                    w41Var.setPaddingLeft(f12);
                    if (i19 == 14 && i19 != 8 && i19 != 13) {
                        this.T.addView(w41Var, h7.z5.c(36.0f, -1));
                    }
                    this.V[i14] = w41Var;
                    i14++;
                    i22 = i12;
                    i21 = i19;
                    num3 = num2;
                }
                if (z12) {
                    m21Var = new m21(5, this, n2Var);
                } else {
                    m21Var = null;
                }
                i19 = i21;
                w41Var = new w41(this, context, c6Var, z14, z15, i19, m21Var, i22, i10);
                ivVar = w41Var.f30759y;
                if (ivVar != null) {
                    ivVar.setOnLongClickListener(new v(this, 7));
                }
                w41Var.R = false;
                if (i19 == i13) {
                    w41Var.setAnimatedEmojiCacheType(13);
                } else {
                    if (i19 != 0) {
                        i20 = 6;
                    } else {
                        i20 = 6;
                    }
                    w41Var.setAnimatedEmojiCacheType(i20);
                }
                if (num2 == null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                w41Var.K = z16;
                if (i19 == 6) {
                    f12 = 10.0f;
                } else {
                    f12 = 5.0f;
                }
                w41Var.setPaddingLeft(f12);
                if (i19 == 14) {
                }
                this.V[i14] = w41Var;
                i14++;
                i22 = i12;
                i21 = i19;
                num3 = num2;
            }
            Integer num4 = num3;
            i15 = i21;
            org.telegram.ui.Components.mv[] mvVarArr = this.V;
            this.W = mvVarArr[0];
            mvVarArr[1].setVisibility(8);
            s41 s41Var = new s41(context, num4, 1);
            this.f36384a0 = s41Var;
            s41Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23054d7, c6Var));
            if (i15 != 14 || i15 == 8 || i15 == 13) {
                f10 = 1.0f;
            } else {
                f10 = 1.0f;
                this.T.addView(s41Var, h7.z5.d(-1, 1.0f / AndroidUtilities.density, 48, 0.0f, 36.0f, 0.0f, 0.0f));
            }
            AndroidUtilities.updateViewVisibilityAnimated(s41Var, true, f10, false);
            x41 x41Var = new x41(this, context, i15);
            this.f36392d0 = x41Var;
            y41 y41Var = new y41();
            this.f36385a1 = y41Var;
            y41Var.f5842c = 220L;
            y41Var.f5843e = 260L;
            y41Var.f5844f = 160L;
            y41Var.f5845g = 160L;
            y41Var.f5819m = false;
            erVar = org.telegram.ui.Components.er.h;
            y41Var.f5846i = erVar;
            y41Var.C = false;
            x41Var.setItemAnimator(y41Var);
            x41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
            z41 z41Var = new z41(this);
            this.f36410l0 = z41Var;
            x41Var.setAdapter(z41Var);
            o41 o41Var = new o41(this, 1);
            this.f36413n0 = o41Var;
            x41Var.setLayoutManager(o41Var);
            o41Var.O = new m41(this, 0);
            ag.d dVar = new ag.d(context, 29);
            this.f36390c0 = dVar;
            ag.y1 y1Var = new ag.y1(this, context);
            this.f36400g0 = y1Var;
            y1Var.addView(x41Var, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            dVar.addView(y1Var, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            n41Var = new n41(this, context);
            this.f36395e0 = n41Var;
            if (n41Var.getItemAnimator() != null) {
                n41Var.getItemAnimator().n(180L);
                n41Var.getItemAnimator().f5846i = erVar;
            }
            textView = new TextView(context);
            if (i15 == i13) {
                textView.setText(LocaleController.getString(R.string.NoEmojiOrStickersFound));
            } else {
                if (i15 == 0 && i15 != 13 && i15 != 12 && i15 != 11 && i15 != 9) {
                    if (i15 != 10) {
                        if (i15 == 1 || i15 == 2) {
                            textView.setText(LocaleController.getString(R.string.NoReactionsFound));
                        } else if (i15 == 14) {
                            textView.setText(LocaleController.getString(R.string.NoEffectsFound));
                        } else {
                            textView.setText(LocaleController.getString(R.string.NoIconsFound));
                        }
                    }
                }
                textView.setText(LocaleController.getString(R.string.NoEmojiFound));
            }
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Le, c6Var));
            org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
            this.f36402h0 = n9Var;
            FrameLayout frameLayout = new FrameLayout(context);
            this.f36398f0 = frameLayout;
            frameLayout.addView(n9Var, h7.z5.d(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
            frameLayout.addView(textView, h7.z5.d(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
            frameLayout.setVisibility(8);
            frameLayout.setAlpha(0.0f);
            dVar.addView(frameLayout, h7.z5.d(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
            n41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
            k51 k51Var = new k51(this);
            this.m0 = k51Var;
            n41Var.setAdapter(k51Var);
            o41 o41Var2 = new o41(this, 0);
            n41Var.setLayoutManager(o41Var2);
            o41Var2.O = new m41(this, 1);
            n41Var.setVisibility(8);
            dVar.addView(n41Var, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            u41 u41Var2 = this.T;
            if (i15 != 8 || i15 == 13 || i15 == 14) {
                f11 = 0.0f;
            } else {
                f11 = (1.0f / AndroidUtilities.density) + 36.0f;
            }
            u41Var2.addView(dVar, h7.z5.d(-1, -1.0f, 48, 0.0f, f11, 0.0f, 0.0f));
            c2.x xVar = new c2.x(x41Var, o41Var);
            this.f36415o0 = xVar;
            xVar.f2372i = new lh.k1(this, 1);
            xVar.h = new f41(this);
            q41 q41Var = new q41(this, i15, context, c6Var, num);
            x41Var.n1(q41Var, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
            n41Var.n1(q41Var, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
            org.telegram.ui.Components.dm0 dm0Var = new org.telegram.ui.Components.dm0(this, i10, 2);
            x41Var.setOnItemClickListener(dm0Var);
            n41Var.setOnItemClickListener(dm0Var);
            r41 r41Var = new r41(this, context, z11);
            this.f36387b0 = r41Var;
            r41Var.setTranslationY(-AndroidUtilities.dp(52.0f));
            r41Var.setVisibility(4);
            dVar.addView(r41Var, h7.z5.d(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
            s41 s41Var2 = new s41(context, num4, 0);
            Drawable drawable3 = getResources().getDrawable(R.drawable.gradient_top);
            int i23 = org.telegram.ui.ActionBar.g6.G8;
            int iMultiplyAlphaComponent = AndroidUtilities.multiplyAlphaComponent(org.telegram.ui.ActionBar.g6.v0(i23, c6Var), 0.8f);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable3.setColorFilter(new PorterDuffColorFilter(iMultiplyAlphaComponent, mode));
            s41Var2.setBackground(drawable3);
            s41Var2.setAlpha(0.0f);
            this.T.addView(s41Var2, h7.z5.d(-1, 20.0f, 55, 0.0f, (1.0f / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
            view = new View(context);
            this.f36408k0 = view;
            drawable = getResources().getDrawable(R.drawable.gradient_bottom);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i23, c6Var), mode));
            if (i10 == 14) {
                view.setBackground(drawable);
            }
            view.setAlpha(0.0f);
            this.T.addView(view, h7.z5.e(-1, 20, 87));
            View view3 = new View(context);
            this.f36417p0 = view3;
            view3.setAlpha(0.0f);
            view3.setBackgroundColor(-16777216);
            this.T.addView(view3, h7.z5.c(-1.0f, -1));
            i16 = this.R;
            if (MediaDataController.getInstance(i16) == null) {
                MediaDataController.getInstance(i16).checkStickers(5);
                if (i10 == 14) {
                    MessagesController.getInstance(this.R).getAvailableEffects();
                    i17 = 3;
                } else if (i10 != 1 || i10 == 11 || i10 == 2 || i10 == 6 || i10 == 13) {
                    i17 = 3;
                    MediaDataController.getInstance(i16).checkReactions();
                } else if (i10 == 9 || i10 == 10) {
                    i17 = 3;
                    if (MessagesController.getInstance(i16).getMainSettings().getBoolean("resetemojipacks", true)) {
                        MediaDataController.getInstance(i16).loadStickers(5, false, false);
                        MessagesController.getInstance(i16).getMainSettings().edit().putBoolean("resetemojipacks", false).commit();
                    }
                    MediaDataController.getInstance(i16).fetchEmojiStatuses(2, false);
                    MediaDataController.getInstance(i16).loadRestrictedStatusEmojis();
                    MediaDataController.getInstance(i16).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses(), false);
                } else if (i10 == 0 || i10 == 12) {
                    i17 = 3;
                    MediaDataController.getInstance(i16).fetchEmojiStatuses(0, true);
                    MediaDataController.getInstance(i16).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
                } else {
                    i17 = 3;
                    if (i10 == 3) {
                        MediaDataController.getInstance(i16).checkDefaultTopicIcons();
                    } else if (i10 == 4) {
                        MediaDataController.getInstance(i16).loadRecents(0, false, true, false);
                        MediaDataController.getInstance(i16).checkStickers(0);
                    }
                }
                this.R0.setLayerNum(7);
                i18 = this.S;
                if (i18 != i17 || i18 == 4 || i18 == 6) {
                    z13 = true;
                } else {
                    ne.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                    if (cacheOutQueue.f18520b == null) {
                        z13 = true;
                        cacheOutQueue.f18520b = new CountDownLatch(1);
                    } else {
                        z13 = true;
                    }
                    ig.g0.f11307g = z13;
                }
                B(z13, false, z13);
            }
            i17 = 3;
            this.R0.setLayerNum(7);
            i18 = this.S;
            if (i18 != i17) {
                z13 = true;
            } else {
                z13 = true;
            }
            B(z13, false, z13);
        }
        i13 = 4;
        z12 = false;
        i14 = 0;
        while (i14 < 2) {
            num2 = num3;
            if (i21 != i13) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = i21 == 0 ? true : true;
            if (z12) {
                m21Var = new m21(5, this, n2Var);
            } else {
                m21Var = null;
            }
            i19 = i21;
            w41Var = new w41(this, context, c6Var, z14, z15, i19, m21Var, i22, i10);
            ivVar = w41Var.f30759y;
            if (ivVar != null) {
                ivVar.setOnLongClickListener(new v(this, 7));
            }
            w41Var.R = false;
            if (i19 == i13) {
                w41Var.setAnimatedEmojiCacheType(13);
            } else {
                if (i19 != 0) {
                    i20 = 6;
                } else {
                    i20 = 6;
                }
                w41Var.setAnimatedEmojiCacheType(i20);
            }
            if (num2 == null) {
                z16 = true;
            } else {
                z16 = false;
            }
            w41Var.K = z16;
            if (i19 == 6) {
                f12 = 10.0f;
            } else {
                f12 = 5.0f;
            }
            w41Var.setPaddingLeft(f12);
            if (i19 == 14) {
            }
            this.V[i14] = w41Var;
            i14++;
            i22 = i12;
            i21 = i19;
            num3 = num2;
        }
        Integer num5 = num3;
        i15 = i21;
        org.telegram.ui.Components.mv[] mvVarArr2 = this.V;
        this.W = mvVarArr2[0];
        mvVarArr2[1].setVisibility(8);
        s41 s41Var3 = new s41(context, num5, 1);
        this.f36384a0 = s41Var3;
        s41Var3.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23054d7, c6Var));
        if (i15 != 14) {
            f10 = 1.0f;
        } else {
            f10 = 1.0f;
        }
        AndroidUtilities.updateViewVisibilityAnimated(s41Var3, true, f10, false);
        x41 x41Var2 = new x41(this, context, i15);
        this.f36392d0 = x41Var2;
        y41 y41Var2 = new y41();
        this.f36385a1 = y41Var2;
        y41Var2.f5842c = 220L;
        y41Var2.f5843e = 260L;
        y41Var2.f5844f = 160L;
        y41Var2.f5845g = 160L;
        y41Var2.f5819m = false;
        erVar = org.telegram.ui.Components.er.h;
        y41Var2.f5846i = erVar;
        y41Var2.C = false;
        x41Var2.setItemAnimator(y41Var2);
        x41Var2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        z41 z41Var2 = new z41(this);
        this.f36410l0 = z41Var2;
        x41Var2.setAdapter(z41Var2);
        o41 o41Var3 = new o41(this, 1);
        this.f36413n0 = o41Var3;
        x41Var2.setLayoutManager(o41Var3);
        o41Var3.O = new m41(this, 0);
        ag.d dVar2 = new ag.d(context, 29);
        this.f36390c0 = dVar2;
        ag.y1 y1Var2 = new ag.y1(this, context);
        this.f36400g0 = y1Var2;
        y1Var2.addView(x41Var2, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        dVar2.addView(y1Var2, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        n41Var = new n41(this, context);
        this.f36395e0 = n41Var;
        if (n41Var.getItemAnimator() != null) {
            n41Var.getItemAnimator().n(180L);
            n41Var.getItemAnimator().f5846i = erVar;
        }
        textView = new TextView(context);
        if (i15 == i13) {
            textView.setText(LocaleController.getString(R.string.NoEmojiOrStickersFound));
        } else if (i15 == 0) {
            textView.setText(LocaleController.getString(R.string.NoEmojiFound));
        } else {
            textView.setText(LocaleController.getString(R.string.NoEmojiFound));
        }
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Le, c6Var));
        org.telegram.ui.Components.n9 n9Var2 = new org.telegram.ui.Components.n9(context);
        this.f36402h0 = n9Var2;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f36398f0 = frameLayout2;
        frameLayout2.addView(n9Var2, h7.z5.d(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        frameLayout2.addView(textView, h7.z5.d(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
        frameLayout2.setVisibility(8);
        frameLayout2.setAlpha(0.0f);
        dVar2.addView(frameLayout2, h7.z5.d(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        n41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        k51 k51Var2 = new k51(this);
        this.m0 = k51Var2;
        n41Var.setAdapter(k51Var2);
        o41 o41Var4 = new o41(this, 0);
        n41Var.setLayoutManager(o41Var4);
        o41Var4.O = new m41(this, 1);
        n41Var.setVisibility(8);
        dVar2.addView(n41Var, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        u41 u41Var3 = this.T;
        if (i15 != 8) {
            f11 = 0.0f;
        } else {
            f11 = 0.0f;
        }
        u41Var3.addView(dVar2, h7.z5.d(-1, -1.0f, 48, 0.0f, f11, 0.0f, 0.0f));
        c2.x xVar2 = new c2.x(x41Var2, o41Var3);
        this.f36415o0 = xVar2;
        xVar2.f2372i = new lh.k1(this, 1);
        xVar2.h = new f41(this);
        q41 q41Var2 = new q41(this, i15, context, c6Var, num);
        x41Var2.n1(q41Var2, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
        n41Var.n1(q41Var2, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
        org.telegram.ui.Components.dm0 dm0Var2 = new org.telegram.ui.Components.dm0(this, i10, 2);
        x41Var2.setOnItemClickListener(dm0Var2);
        n41Var.setOnItemClickListener(dm0Var2);
        r41 r41Var2 = new r41(this, context, z11);
        this.f36387b0 = r41Var2;
        r41Var2.setTranslationY(-AndroidUtilities.dp(52.0f));
        r41Var2.setVisibility(4);
        dVar2.addView(r41Var2, h7.z5.d(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
        s41 s41Var4 = new s41(context, num5, 0);
        Drawable drawable4 = getResources().getDrawable(R.drawable.gradient_top);
        int i24 = org.telegram.ui.ActionBar.g6.G8;
        int iMultiplyAlphaComponent2 = AndroidUtilities.multiplyAlphaComponent(org.telegram.ui.ActionBar.g6.v0(i24, c6Var), 0.8f);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        drawable4.setColorFilter(new PorterDuffColorFilter(iMultiplyAlphaComponent2, mode2));
        s41Var4.setBackground(drawable4);
        s41Var4.setAlpha(0.0f);
        this.T.addView(s41Var4, h7.z5.d(-1, 20.0f, 55, 0.0f, (1.0f / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
        view = new View(context);
        this.f36408k0 = view;
        drawable = getResources().getDrawable(R.drawable.gradient_bottom);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i24, c6Var), mode2));
        if (i10 == 14) {
            view.setBackground(drawable);
        }
        view.setAlpha(0.0f);
        this.T.addView(view, h7.z5.e(-1, 20, 87));
        View view4 = new View(context);
        this.f36417p0 = view4;
        view4.setAlpha(0.0f);
        view4.setBackgroundColor(-16777216);
        this.T.addView(view4, h7.z5.c(-1.0f, -1));
        i16 = this.R;
        if (MediaDataController.getInstance(i16) == null) {
            MediaDataController.getInstance(i16).checkStickers(5);
            if (i10 == 14) {
                MessagesController.getInstance(this.R).getAvailableEffects();
                i17 = 3;
            } else if (i10 != 1) {
                i17 = 3;
                MediaDataController.getInstance(i16).checkReactions();
            } else {
                i17 = 3;
                MediaDataController.getInstance(i16).checkReactions();
            }
            this.R0.setLayerNum(7);
            i18 = this.S;
            if (i18 != i17) {
                z13 = true;
            } else {
                z13 = true;
            }
            B(z13, false, z13);
        }
        i17 = 3;
        this.R0.setLayerNum(7);
        i18 = this.S;
        if (i18 != i17) {
            z13 = true;
        } else {
            z13 = true;
        }
        B(z13, false, z13);
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.F.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            this.F.add(ig.q0.b(str));
        }
        x41 x41Var = this.f36392d0;
        if (x41Var != null) {
            for (int i11 = 0; i11 < x41Var.getChildCount(); i11++) {
                if (x41Var.getChildAt(i11) instanceof j51) {
                    j51 j51Var = (j51) x41Var.getChildAt(i11);
                    j51Var.d(this.F.contains(j51Var.f39265x), true);
                }
            }
            x41Var.invalidate();
        }
    }

    public void m() {
    }

    public void q() {
    }

    public void setOnRecentClearedListener(z51 z51Var) {
    }

    @Override
    public void setPressed(boolean z10) {
    }

    public void r(j51 j51Var, ig.q0 q0Var) {
    }
}
