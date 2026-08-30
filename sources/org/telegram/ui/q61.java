package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public abstract class q61 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static String[] X1;
    public final ArrayList A0;
    public ArrayList A1;
    public int B;
    public final ArrayList B0;
    public ValueAnimator B1;
    public int C;
    public final ArrayList C0;
    public boolean C1;
    public t51 D;
    public final ArrayList D0;
    public boolean D1;
    public o61 E;
    public final ArrayList E0;
    public ValueAnimator E1;
    public boolean F;
    public final ArrayList F0;
    public r41 F1;
    public HashSet G;
    public ArrayList G0;
    public cg.x0 G1;
    public final HashSet H;
    public final ArrayList H0;
    public boolean H1;
    public final Paint I;
    public ArrayList I0;
    public boolean I1;
    public final Paint J;
    public final ArrayList J0;
    public View J1;
    public Drawable K;
    public final boolean K0;
    public int K1;
    public y51 L;
    public boolean L0;
    public int L1;
    public boolean M;
    public Integer M0;
    public long M1;
    public boolean N;
    public boolean N0;
    public lh.wa N1;
    public boolean O;
    public List O0;
    public final r41 O1;
    public final ArrayList P;
    public y51 P0;
    public final r41 P1;
    public boolean Q;
    public boolean Q0;
    public Runnable Q1;
    public p51 R;
    public float R0;
    public ValueAnimator R1;
    public final int S;
    public final ImageReceiver S0;
    public ValueAnimator S1;
    public final int T;
    public org.telegram.ui.Components.l5 T0;
    public final AnimationNotificationsLocker T1;
    public final j51 U;
    public e51 U0;
    public final Paint U1;
    public final eg.i0 V;
    public final Integer V0;
    public Integer V1;
    public final org.telegram.ui.Components.xv[] W;
    public final org.telegram.ui.ActionBar.f6 W0;
    public float X0;
    public float Y0;
    public final org.telegram.ui.ActionBar.p2 Z0;
    public int f37594a;
    public org.telegram.ui.Components.xv f37595a0;
    public final int f37596a1;
    public int f37597b;
    public final h51 f37598b0;
    public final n51 f37599b1;
    public int f37600c;
    public final g51 f37601c0;
    public final int f37602c1;
    public int d;
    public final a51 f37603d0;
    public boolean f37604d1;
    public int e;
    public final m51 f37605e0;
    public boolean f37606e1;
    public int f37607f;
    public final b51 f37608f0;
    public ValueAnimator f37609f1;
    public final FrameLayout f37610g0;
    public Drawable f37611g1;
    public int h;
    public final ah.d f37612h0;
    public final PorterDuffColorFilter f37613h1;
    public final org.telegram.ui.Components.p9 f37614i0;
    public float f37615i1;
    public final View f37616j0;
    public int f37617j1;
    public final org.telegram.ui.Components.hn f37618k0;
    public org.telegram.ui.Components.j5 f37619k1;
    public final View f37620l0;
    public Rect l1;
    public final o51 m0;
    public View f37621m1;
    public int f37622n;
    public final z51 f37623n0;
    public float f37624n1;
    public final c51 f37625o0;
    public y51 f37626o1;
    public final c2.y f37627p0;
    public Rect f37628p1;
    public final View f37629q0;
    public final OvershootInterpolator f37630q1;
    public int f37631r;
    public int f37632r0;
    public ValueAnimator f37633r1;
    public int f37634s;
    public final ArrayList f37635s0;
    public boolean f37636s1;
    public final SparseIntArray f37637t0;
    public boolean f37638t1;
    public final SparseIntArray f37639u0;
    public boolean f37640u1;
    public int v;
    public final SparseIntArray f37641v0;
    public boolean f37642v1;
    public int f37643w;
    public final SparseIntArray f37644w0;
    public String f37645w1;
    public int f37646x;
    public final ArrayList f37647x0;
    public ArrayList f37648x1;
    public int f37649y;
    public final ArrayList f37650y0;
    public ArrayList f37651y1;
    public boolean f37652z0;
    public ArrayList f37653z1;
    public static final List W1 = Arrays.asList("😖", "😫", "🫠", "😨", "❓");
    public static final boolean[] Y1 = new boolean[4];
    public static final HashMap Z1 = new HashMap();

    public q61(org.telegram.ui.ActionBar.p2 p2Var, Context context, boolean z4, Integer num, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this(p2Var, context, z4, num, i10, true, f6Var, 16);
    }

    public static void D(int i10, org.telegram.ui.Components.p9 p9Var) {
        List list;
        ImageLocation forDocument;
        String str;
        if (p9Var != null) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(i10).getFeaturedEmojiSets());
            Collections.shuffle(arrayList);
            int round = (int) Math.round(Math.random() * 10.0d);
            TLRPC.Document document = null;
            int i11 = 0;
            while (true) {
                int size = arrayList.size();
                list = W1;
                if (i11 >= size) {
                    break;
                }
                if ((arrayList.get(i11) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList.get(i11)).documents != null) {
                    ArrayList arrayList2 = new ArrayList(((TLRPC.TL_stickerSetFullCovered) arrayList.get(i11)).documents);
                    Collections.shuffle(arrayList2);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList2.size()) {
                            break;
                        }
                        TLRPC.Document document2 = (TLRPC.Document) arrayList2.get(i12);
                        if (document2 != null && list.contains(MessageObject.findAnimatedEmojiEmoticon(document2, null))) {
                            int i13 = round - 1;
                            if (round <= 0) {
                                round = i13;
                                document = document2;
                                break;
                            }
                            round = i13;
                            document = document2;
                        }
                        i12++;
                    }
                }
                if (document != null && round <= 0) {
                    break;
                }
                i11++;
            }
            if (document == null || round > 0) {
                ArrayList arrayList3 = new ArrayList(MediaDataController.getInstance(i10).getStickerSets(5));
                Collections.shuffle(arrayList3);
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    if (arrayList3.get(i14) != null && ((TLRPC.TL_messages_stickerSet) arrayList3.get(i14)).documents != null) {
                        ArrayList arrayList4 = new ArrayList(((TLRPC.TL_messages_stickerSet) arrayList3.get(i14)).documents);
                        Collections.shuffle(arrayList4);
                        int i15 = 0;
                        while (true) {
                            if (i15 >= arrayList4.size()) {
                                break;
                            }
                            TLRPC.Document document3 = (TLRPC.Document) arrayList4.get(i15);
                            if (document3 != null && list.contains(MessageObject.findAnimatedEmojiEmoticon(document3, null))) {
                                int i16 = round - 1;
                                if (round <= 0) {
                                    round = i16;
                                    document = document3;
                                    break;
                                }
                                round = i16;
                                document = document3;
                            }
                            i15++;
                        }
                    }
                    if (document != null && round <= 0) {
                        break;
                    }
                }
            }
            if (document != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.f20067m6, 0.2f);
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
                p9Var.setLayerNum(7);
                p9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                p9Var.l(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "36_36", svgThumb, document);
            }
        }
    }

    public static void a(q61 q61Var, int i10, int i11) {
        int i12;
        c2.y yVar = q61Var.f37627p0;
        c51 c51Var = q61Var.f37625o0;
        View m9 = c51Var.m(i10);
        int L0 = c51Var.L0();
        if ((m9 == null && Math.abs(i10 - L0) > 72.0f) || !SharedConfig.animationsEnabled()) {
            if (c51Var.L0() < i10) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            yVar.f2031b = i12;
            yVar.c(i10, i11, false, false);
            return;
        }
        org.telegram.ui.Components.dx dxVar = new org.telegram.ui.Components.dx(q61Var, q61Var.f37605e0.getContext(), 3);
        dxVar.f5723a = i10;
        dxVar.f46638p = i11;
        c51Var.w0(dxVar);
    }

    public static boolean c(q61 q61Var) {
        if (!q61Var.Q) {
            ValueAnimator valueAnimator = q61Var.R1;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public int getCacheType() {
        int i10 = 13;
        int i11 = this.T;
        if (i11 != 5 && i11 != 7) {
            if (i11 == 6) {
                return org.telegram.ui.Components.l5.g();
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
        if (this.f37611g1 == null) {
            int i10 = this.T;
            if (i10 != 5 && i10 != 9 && i10 != 10 && i10 != 7) {
                this.f37611g1 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
            } else {
                this.f37611g1 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_filled_blocked).mutate();
            }
            this.f37611g1.setColorFilter(this.f37613h1);
        }
        return this.f37611g1;
    }

    public static ArrayList j(HashSet hashSet, ArrayList arrayList) {
        if (hashSet == null) {
            return arrayList;
        }
        int i10 = 0;
        while (i10 < arrayList.size()) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
            if (document == null || hashSet.contains(Long.valueOf(document.f19190id))) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        return arrayList;
    }

    public static TLRPC.Document k(String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        long j10;
        if (tL_messages_stickerSet == null) {
            return null;
        }
        String fixEmoji = Emoji.fixEmoji(str);
        int i10 = 0;
        while (true) {
            if (i10 < tL_messages_stickerSet.packs.size()) {
                if (!tL_messages_stickerSet.packs.get(i10).documents.isEmpty() && TextUtils.equals(Emoji.fixEmoji(tL_messages_stickerSet.packs.get(i10).emoticon), fixEmoji)) {
                    j10 = tL_messages_stickerSet.packs.get(i10).documents.get(0).longValue();
                    break;
                }
                i10++;
            } else {
                j10 = 0;
                break;
            }
        }
        if (j10 == 0) {
            return null;
        }
        for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
            if (document.f19190id == j10) {
                return document;
            }
        }
        return null;
    }

    public void setBigReactionAnimatedEmoji(org.telegram.ui.Components.l5 l5Var) {
        org.telegram.ui.Components.l5 l5Var2;
        if (this.F && (l5Var2 = this.T0) != l5Var) {
            if (l5Var2 != null) {
                l5Var2.o(this);
            }
            this.T0 = l5Var;
            if (l5Var != null) {
                l5Var.setColorFilter(this.f37613h1);
                this.T0.a(this);
            }
        }
    }

    public static void t(final int i10) {
        boolean[] zArr = Y1;
        if (!zArr[i10] && MediaDataController.getInstance(i10) != null) {
            zArr[i10] = true;
            MediaDataController.getInstance(i10).checkStickers(5);
            MediaDataController.getInstance(i10).fetchEmojiStatuses(0, true);
            MediaDataController.getInstance(i10).checkReactions();
            MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
            MediaDataController.getInstance(i10).getDefaultEmojiStatuses();
            MediaDataController.getInstance(i10).checkDefaultTopicIcons();
            org.telegram.ui.Components.xw0.f30744u3.fetch(i10, 1, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    ArrayList<TLRPC.EmojiGroup> arrayList;
                    TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                    if (tL_messages_emojiGroups != null && (arrayList = tL_messages_emojiGroups.groups) != null) {
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            TLRPC.EmojiGroup emojiGroup = arrayList.get(i11);
                            i11++;
                            l5.h(i10).b(emojiGroup.icon_emoji_id, null);
                        }
                    }
                }
            });
        }
    }

    public final void A(Long l10) {
        this.H.remove(l10);
        m51 m51Var = this.f37605e0;
        if (m51Var != null) {
            int i10 = 0;
            boolean z4 = false;
            for (int i11 = 0; i11 < m51Var.getChildCount(); i11++) {
                if (m51Var.getChildAt(i11) instanceof y51) {
                    y51 y51Var = (y51) m51Var.getChildAt(i11);
                    org.telegram.ui.Components.u5 u5Var = y51Var.e;
                    if (u5Var != null && u5Var.getDocumentId() == l10.longValue()) {
                        y51Var.f();
                    } else {
                        TLRPC.Document document = y51Var.d;
                        if (document != null && document.f19190id == l10.longValue()) {
                            y51Var.f();
                        }
                    }
                    z4 = true;
                }
            }
            m51Var.invalidate();
            if (!z4) {
                while (true) {
                    ArrayList arrayList = this.f37635s0;
                    if (i10 < arrayList.size()) {
                        long longValue = ((Long) arrayList.get(i10)).longValue();
                        if (longValue == (l10.longValue() * 13) + 62425 || longValue == (l10.longValue() * 13) + 3212) {
                            break;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
                o51 o51Var = this.m0;
                if (o51Var != null) {
                    o51Var.m(i10);
                }
            }
        }
    }

    public final void B(boolean r40, boolean r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q61.B(boolean, boolean, boolean):void");
    }

    public final void C() {
        g51 g51Var = this.f37601c0;
        if (g51Var == null) {
            return;
        }
        if (this.f37642v1) {
            g51Var.clearAnimation();
            g51Var.setVisibility(0);
            g51Var.animate().translationY(0.0f).start();
            return;
        }
        m51 m51Var = this.f37605e0;
        if (m51Var.getChildCount() > 0) {
            View childAt = m51Var.getChildAt(0);
            if (RecyclerView.R(childAt) == this.f37594a && "searchbox".equals(childAt.getTag())) {
                g51Var.setVisibility(0);
                g51Var.setTranslationY(childAt.getY());
                return;
            }
            g51Var.setTranslationY(-AndroidUtilities.dp(52.0f));
            return;
        }
        g51Var.setTranslationY(-AndroidUtilities.dp(52.0f));
    }

    public final void E(float f10) {
        int i10;
        int i11 = -1;
        View view = this.f37616j0;
        if (view != null) {
            float interpolation = org.telegram.ui.Components.nr.f27347g.getInterpolation(k7.n.a((((f10 * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            if (n()) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            view.setScaleY(interpolation * i10);
        }
        org.telegram.ui.Components.hn hnVar = this.f37618k0;
        if (hnVar != null) {
            float a2 = k7.n.a((((f10 * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            hnVar.setAlpha(a2);
            hnVar.setScaleX(a2);
            if (!n()) {
                i11 = 1;
            }
            hnVar.setScaleY(a2 * i11);
        }
        float f11 = 800.0f * f10;
        float f12 = f11 - 40.0f;
        float a10 = k7.n.a(f12 / 700.0f, 0.0f, 1.0f);
        float a11 = k7.n.a((f11 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a12 = k7.n.a(f12 / 750.0f, 0.0f, 1.0f);
        float a13 = k7.n.a((f11 - 30.0f) / 120.0f, 0.0f, 1.0f);
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        float interpolation2 = nrVar.getInterpolation(a10);
        float interpolation3 = nrVar.getInterpolation(a11);
        this.V.setAlpha(a13);
        this.f37601c0.setAlpha(a13);
        int i12 = 0;
        for (int i13 = 0; i13 < this.f37595a0.f29253b.getChildCount(); i13++) {
            this.f37595a0.f29253b.getChildAt(i13).setAlpha(a13);
        }
        if (this.f37619k1 != null) {
            invalidate();
        }
        float f13 = 1.0f - a13;
        j51 j51Var = this.U;
        j51Var.setTranslationY(AndroidUtilities.dp(-5.0f) * f13);
        if (hnVar != null) {
            hnVar.setTranslationY(AndroidUtilities.dp(-5.0f) * f13);
        }
        this.X0 = (interpolation2 * 0.85f) + 0.15f;
        this.Y0 = (interpolation3 * 0.925f) + 0.075f;
        j51Var.invalidateOutline();
        if (hnVar != null) {
            hnVar.setAlpha(a13);
        }
        h51 h51Var = this.f37598b0;
        h51Var.setAlpha(a13);
        h51Var.setScaleX(Math.min(this.X0, 1.0f));
        float pivotX = h51Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(j51Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(j51Var.getHeight(), 2.0d) + Math.pow(j51Var.getWidth() - pivotX, 2.0d)));
        for (int i14 = 0; i14 < this.f37595a0.f29253b.getChildCount(); i14++) {
            View childAt = this.f37595a0.f29253b.getChildAt(i14);
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
            float cascade = AndroidUtilities.cascade(a12, (float) Math.sqrt(e2.c.u(height, height, 0.4f, width * width)), sqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(cascade)) {
                cascade = 0.0f;
            }
            childAt.setScaleX(cascade);
            childAt.setScaleY(cascade);
        }
        while (true) {
            m51 m51Var = this.f37605e0;
            if (i12 < m51Var.getChildCount()) {
                View childAt2 = m51Var.getChildAt(i12);
                if (childAt2 instanceof y51) {
                    y51 y51Var = (y51) childAt2;
                    float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                    float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                    if (n()) {
                        height2 = getMeasuredHeight() - height2;
                    }
                    float cascade2 = AndroidUtilities.cascade(a12, (float) Math.sqrt(e2.c.u(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                    if (Float.isNaN(cascade2)) {
                        cascade2 = 0.0f;
                    }
                    y51Var.setAnimatedScale(cascade2);
                }
                i12++;
            } else {
                this.f37612h0.invalidate();
                m51Var.invalidate();
                return;
            }
        }
    }

    public boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.stickersDidLoad;
        r41 r41Var = this.P1;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.N)) {
                AndroidUtilities.cancelRunOnUIThread(r41Var);
                AndroidUtilities.runOnUIThread(r41Var);
            }
        } else if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(r41Var);
            AndroidUtilities.runOnUIThread(r41Var);
        } else if (i10 == NotificationCenter.recentEmojiStatusesUpdate) {
            AndroidUtilities.cancelRunOnUIThread(r41Var);
            AndroidUtilities.runOnUIThread(r41Var);
        } else if (i10 == NotificationCenter.groupStickersDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(r41Var);
            AndroidUtilities.runOnUIThread(r41Var);
        } else if (i10 == NotificationCenter.emojiLoaded) {
            nh.e eVar = new nh.e(19);
            m51 m51Var = this.f37605e0;
            AndroidUtilities.forEachViews((RecyclerView) m51Var, (h5.d) eVar);
            if (m51Var != null) {
                m51Var.invalidate();
            }
        } else if (i10 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == UserConfig.getInstance(this.S).getClientUserId()) {
            AndroidUtilities.cancelRunOnUIThread(r41Var);
            AndroidUtilities.runOnUIThread(r41Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        float scaleY;
        int i10;
        float f10;
        float measuredHeight;
        org.telegram.ui.Components.j5 j5Var = this.f37619k1;
        if (j5Var != null && (num = this.V0) != null) {
            Rect bounds = j5Var.getBounds();
            View view = this.f37621m1;
            if (view == null) {
                scaleY = 1.0f;
            } else {
                scaleY = view.getScaleY();
            }
            int alpha = this.f37619k1.getAlpha();
            View view2 = this.f37621m1;
            if (view2 == null) {
                bounds.height();
            } else {
                view2.getHeight();
            }
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f37619k1.v = (int) (Math.pow(this.U.getAlpha(), 0.25d) * alpha * this.f37615i1);
            if (this.l1 == null) {
                this.l1 = new Rect();
            }
            if (scaleY > 1.0f && scaleY < 1.5f) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            float f11 = i10;
            if (scaleY > 1.5f) {
                f10 = (bounds.height() * 0.81f) + 1.0f;
            } else {
                f10 = 0.0f;
            }
            float intValue = num.intValue() + f11;
            float w10 = e2.c.w(scaleY, 1.0f, bounds.centerY(), -f10);
            boolean n10 = n();
            int i11 = this.f37596a1;
            if (!n10) {
                measuredHeight = AndroidUtilities.dp(i11);
            } else {
                measuredHeight = getMeasuredHeight() - (AndroidUtilities.dp(i11) / 2.0f);
            }
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + w10 + measuredHeight;
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.l1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            org.telegram.ui.Components.j5 j5Var2 = this.f37619k1;
            Rect rect = this.l1;
            int i12 = rect.left;
            Rect rect2 = this.l1;
            j5Var2.setBounds(i12, rect.top, (int) ((rect.width() / scaleY) + i12), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.l1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.f37619k1.draw(canvas);
            org.telegram.ui.Components.j5 j5Var3 = this.f37619k1;
            j5Var3.v = alpha;
            j5Var3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        y51 y51Var = this.f37626o1;
        if (y51Var != null && this.f37628p1 != null && y51Var.B != null) {
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f37626o1.B.setAlpha((int) (this.f37624n1 * 255.0f));
            this.f37626o1.B.setBounds(this.f37628p1);
            this.f37626o1.B.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - this.f37615i1, this.f37602c1, this.f37617j1), PorterDuff.Mode.SRC_IN));
            this.f37626o1.B.draw(canvas);
            canvas.restore();
        }
    }

    public final long f() {
        return Math.max(450L, Math.min(55, this.L1 - this.K1) * 30);
    }

    public final long g() {
        return Math.max(300L, Math.min(45, this.L1 - this.K1) * 25) + f() + 16;
    }

    public lh.wa getCollectionParticles() {
        if (this.N1 == null) {
            this.N1 = new lh.wa(1, 8);
        }
        return this.N1;
    }

    public long getDialogId() {
        return UserConfig.getInstance(this.S).getClientUserId();
    }

    public float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    public final void h() {
        View view;
        float f10;
        if (this.C1) {
            view = this.f37608f0;
        } else {
            view = this.f37605e0;
        }
        boolean canScrollVertically = view.canScrollVertically(1);
        if (canScrollVertically != this.f37636s1) {
            this.f37636s1 = canScrollVertically;
            ViewPropertyAnimator animate = this.f37620l0.animate();
            if (canScrollVertically) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setDuration(200L).start();
        }
    }

    public final void i(int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q61.i(int, android.view.View):void");
    }

    public final void l() {
        String str;
        int i10 = this.T;
        if (i10 != 2) {
            StringBuilder sb = new StringBuilder("emoji");
            if (i10 != 0 && i10 != 12 && i10 != 9 && i10 != 10) {
                str = "reaction";
            } else {
                str = "status";
            }
            String r10 = android.support.v4.media.a.r(sb, str, "usehint");
            int i11 = MessagesController.getGlobalMainSettings().getInt(r10, 0);
            if (i11 <= 3) {
                MessagesController.getGlobalMainSettings().edit().putInt(r10, i11 + 1).apply();
            }
        }
    }

    public final boolean n() {
        int i10 = this.T;
        if (i10 != 5 && i10 != 10 && i10 != 12 && i10 != 15) {
            return false;
        }
        return true;
    }

    public final void o(android.view.View r14, org.telegram.ui.Components.u5 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q61.o(android.view.View, org.telegram.ui.Components.u5):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = true;
        int i10 = this.S;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.featuredEmojiDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupStickersDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        int i11 = this.T;
        if (i11 == 0 || i11 == 12) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        }
        org.telegram.ui.Components.j5 j5Var = this.f37619k1;
        if (j5Var != null) {
            j5Var.f25876n = this;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setBigReactionAnimatedEmoji(null);
        this.F = false;
        int i10 = this.S;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.featuredEmojiDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        int i11 = this.T;
        if (i11 == 0 || i11 == 12) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        }
        org.telegram.ui.Components.j5 j5Var = this.f37619k1;
        if (j5Var != null) {
            j5Var.f25876n = null;
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (z4 && this.T == 6) {
            this.f37625o0.y1((getMeasuredWidth() / AndroidUtilities.dp(42.0f)) * 5);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z4 = this.N0;
        int i12 = this.T;
        if (z4 && i12 != 3 && i12 != 4) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f), Integer.MIN_VALUE));
        } else if (i12 == 6) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.displaySize.y * 0.35f), Integer.MIN_VALUE));
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public abstract void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num);

    public final void s(f61 f61Var) {
        Integer num = this.V1;
        if (num != null) {
            Parcelable parcelable = (Parcelable) Z1.get(num);
        }
        this.Q1 = f61Var;
        boolean z4 = this.N0;
        m51 m51Var = this.f37605e0;
        if (!z4) {
            h();
            for (int i10 = 0; i10 < m51Var.getChildCount(); i10++) {
                View childAt = m51Var.getChildAt(i10);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
            }
            return;
        }
        ValueAnimator valueAnimator = this.R1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.R1 = null;
        }
        ValueAnimator valueAnimator2 = this.S1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.S1 = null;
        }
        int i11 = this.T;
        if (i11 != 3 && i11 != 4 && i11 != 6) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.R1 = ofFloat;
            ofFloat.addUpdateListener(new q41(this, 0));
            this.R1.addListener(new ls0(this, 19));
            r41 r41Var = new r41(this, 0);
            mg.g0.f14006f = true;
            mg.g0.e = true;
            mg.g0.f14007g = false;
            if (mg.g0.d) {
                mg.g0.d = false;
            }
            mg.g0.f14005c = r41Var;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.T1.lock();
            this.R1.setDuration(800L);
            m51Var.setLayerType(2, null);
            this.f37601c0.setLayerType(2, null);
            this.f37598b0.setLayerType(2, null);
            this.V.setLayerType(2, null);
            org.telegram.ui.Components.hn hnVar = this.f37618k0;
            if (hnVar != null) {
                hnVar.setLayerType(2, null);
            }
            View view = this.f37616j0;
            if (view != null) {
                view.setLayerType(2, null);
            }
            this.f37595a0.m(true);
            E(0.0f);
            return;
        }
        h();
        E(1.0f);
    }

    public void setAnimationsEnabled(boolean z4) {
        this.M = z4;
    }

    public void setBackgroundDelegate(p51 p51Var) {
        this.R = p51Var;
    }

    public void setDrawBackground(boolean z4) {
        this.N0 = z4;
        this.U.setClipToOutline(z4);
        eg.i0 i0Var = this.V;
        if (!z4) {
            i0Var.setVisibility(8);
        } else {
            i0Var.setVisibility(0);
        }
    }

    public void setEnterAnimationInProgress(boolean z4) {
        if (this.Q != z4) {
            this.Q = z4;
            if (!z4) {
                AndroidUtilities.forEachViews((RecyclerView) this.f37605e0, (h5.d) new nh.e(14));
                for (int i10 = 0; i10 < this.f37595a0.f29253b.getChildCount(); i10++) {
                    View childAt = this.f37595a0.f29253b.getChildAt(i10);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                this.f37595a0.f29253b.invalidate();
            }
        }
    }

    public void setExpireDateHint(int i10) {
        if (i10 <= 0) {
            return;
        }
        this.L0 = true;
        this.M0 = Integer.valueOf(i10);
        B(true, false, true);
    }

    public void setForUser(boolean z4) {
        this.O = z4;
        B(false, false, true);
    }

    public void setForumIconDrawable(Drawable drawable) {
        this.K = drawable;
        y51 y51Var = this.L;
        if (y51Var != null) {
            y51Var.h.setImageBitmap(drawable);
        }
    }

    public void setLongPressEnabled(boolean z4) {
        this.f37606e1 = z4;
    }

    public void setOnLongPressedListener(o61 o61Var) {
        this.E = o61Var;
    }

    public void setRecentReactions(List<mg.q0> list) {
        this.O0 = list;
        B(false, true, true);
    }

    public void setSaveState(int i10) {
        this.V1 = Integer.valueOf(i10);
    }

    public void setSelected(Long l10) {
        HashSet hashSet = this.H;
        hashSet.clear();
        hashSet.add(l10);
        m51 m51Var = this.f37605e0;
        if (m51Var != null) {
            for (int i10 = 0; i10 < m51Var.getChildCount(); i10++) {
                if (m51Var.getChildAt(i10) instanceof y51) {
                    y51 y51Var = (y51) m51Var.getChildAt(i10);
                    org.telegram.ui.Components.u5 u5Var = y51Var.e;
                    if (u5Var != null) {
                        y51Var.d(hashSet.contains(Long.valueOf(u5Var.getDocumentId())), true);
                    } else {
                        y51Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            m51Var.invalidate();
        }
    }

    public void setSelectedReaction(mg.q0 q0Var) {
        this.G.clear();
        this.G.add(q0Var);
        m51 m51Var = this.f37605e0;
        if (m51Var != null) {
            for (int i10 = 0; i10 < m51Var.getChildCount(); i10++) {
                if (m51Var.getChildAt(i10) instanceof y51) {
                    y51 y51Var = (y51) m51Var.getChildAt(i10);
                    y51Var.d(this.G.contains(y51Var.f40407x), true);
                }
            }
            m51Var.invalidate();
        }
        b51 b51Var = this.f37608f0;
        if (b51Var != null) {
            for (int i11 = 0; i11 < b51Var.getChildCount(); i11++) {
                if (b51Var.getChildAt(i11) instanceof y51) {
                    y51 y51Var2 = (y51) b51Var.getChildAt(i11);
                    y51Var2.d(this.G.contains(y51Var2.f40407x), true);
                }
            }
            b51Var.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<mg.q0> hashSet) {
        this.G = hashSet;
        HashSet hashSet2 = this.H;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != null && ((mg.q0) arrayList.get(i10)).f14108g != 0) {
                hashSet2.add(Long.valueOf(((mg.q0) arrayList.get(i10)).f14108g));
            }
        }
    }

    public boolean u() {
        return false;
    }

    public final void v(String str, boolean z4, boolean z10) {
        long j10;
        r41 r41Var = this.F1;
        if (r41Var != null) {
            AndroidUtilities.cancelRunOnUIThread(r41Var);
            this.F1 = null;
        }
        cg.x0 x0Var = this.G1;
        if (x0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x0Var);
            this.G1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        z51 z51Var = this.f37623n0;
        g51 g51Var = this.f37601c0;
        if (isEmpty) {
            this.f37640u1 = false;
            this.f37642v1 = false;
            z(false, z4);
            if (g51Var != null) {
                g51Var.d(true);
                e61.a(g51Var, false);
            }
            z51Var.E(true);
            this.f37645w1 = null;
        } else {
            boolean z11 = this.f37640u1;
            boolean z12 = !z11;
            this.f37640u1 = true;
            this.f37642v1 = false;
            if (g51Var != null) {
                g51Var.f33905f.b(2);
            }
            if (!z11) {
                ArrayList arrayList = this.f37648x1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = this.f37651y1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = this.A1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                z51Var.E(false);
            } else if (!str.equals(this.f37645w1)) {
                r41 r41Var2 = new r41(this, 1);
                this.F1 = r41Var2;
                AndroidUtilities.runOnUIThread(r41Var2, 120L);
            }
            this.f37645w1 = str;
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            if (!Arrays.equals(currentKeyboardLanguage, X1)) {
                MediaDataController.getInstance(this.S).fetchNewEmojiKeywords(currentKeyboardLanguage);
            }
            X1 = currentKeyboardLanguage;
            cg.x0 x0Var2 = new cg.x0(this, str, z4, z12, currentKeyboardLanguage, 5);
            this.G1 = x0Var2;
            if (z10) {
                j10 = 425;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(x0Var2, j10);
            if (g51Var != null) {
                g51Var.f33905f.b(2);
                e61.a(g51Var, z4);
            }
        }
        C();
    }

    public final void w(float f10) {
        ValueAnimator valueAnimator = this.f37609f1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f37609f1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37629q0.getAlpha(), f10 * 0.25f);
        this.f37609f1 = ofFloat;
        ofFloat.addUpdateListener(new q41(this, 2));
        this.f37609f1.setDuration(200L);
        this.f37609f1.setInterpolator(org.telegram.ui.Components.nr.f27346f);
        this.f37609f1.start();
    }

    public final void x(Long l10, boolean z4) {
        boolean z10;
        HashSet hashSet = this.H;
        if (!hashSet.contains(l10)) {
            hashSet.add(l10);
            z10 = true;
        } else {
            hashSet.remove(l10);
            z10 = false;
        }
        m51 m51Var = this.f37605e0;
        if (m51Var != null) {
            for (int i10 = 0; i10 < m51Var.getChildCount(); i10++) {
                if (m51Var.getChildAt(i10) instanceof y51) {
                    y51 y51Var = (y51) m51Var.getChildAt(i10);
                    org.telegram.ui.Components.u5 u5Var = y51Var.e;
                    if (u5Var != null && u5Var.getDocumentId() == l10.longValue()) {
                        y51Var.e(z10, z4);
                    } else {
                        TLRPC.Document document = y51Var.d;
                        if (document != null && document.f19190id == l10.longValue()) {
                            y51Var.e(z10, z4);
                        }
                    }
                }
            }
            m51Var.invalidate();
        }
    }

    public final void y(org.telegram.ui.Components.j5 j5Var, View view) {
        int i10;
        Integer num;
        if (j5Var != null && (num = j5Var.C) != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        this.f37617j1 = i10;
        this.f37619k1 = j5Var;
        this.f37621m1 = view;
        if (this.F && j5Var != null) {
            j5Var.f25876n = this;
        }
        invalidate();
    }

    public final void z(boolean z4, boolean z10) {
        float f10;
        if (this.C1 == z4) {
            return;
        }
        this.C1 = z4;
        m51 m51Var = this.f37605e0;
        m51Var.setVisibility(0);
        b51 b51Var = this.f37608f0;
        b51Var.setVisibility(0);
        ValueAnimator valueAnimator = this.B1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.E1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.E1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B1 = ofFloat;
        ofFloat.addUpdateListener(new u41(this, z4, 0));
        this.B1.addListener(new i51(this, z4, 0));
        this.B1.setDuration(320L);
        this.B1.setInterpolator(org.telegram.ui.Components.nr.h);
        this.B1.start();
        ViewPropertyAnimator animate = ((View) m51Var.getParent()).animate();
        if (this.C1 && z10) {
            f10 = -AndroidUtilities.dp(36.0f);
        } else {
            f10 = 0.0f;
        }
        b.p(animate.translationY(f10).setUpdateListener(new q41(this, 1)), org.telegram.ui.Components.nr.f27346f, 160L);
        if (this.C1 && z10) {
            b51Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        } else {
            b51Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        }
        h();
    }

    public q61(org.telegram.ui.ActionBar.p2 p2Var, Context context, boolean z4, Integer num, int i10, boolean z10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        this(p2Var, context, z4, num, i10, z10, f6Var, i11, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20225v6, f6Var));
    }

    public q61(org.telegram.ui.ActionBar.p2 r41, android.content.Context r42, boolean r43, java.lang.Integer r44, int r45, boolean r46, org.telegram.ui.ActionBar.f6 r47, int r48, int r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q61.<init>(org.telegram.ui.ActionBar.p2, android.content.Context, boolean, java.lang.Integer, int, boolean, org.telegram.ui.ActionBar.f6, int, int):void");
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.G.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            this.G.add(mg.q0.b(str));
        }
        m51 m51Var = this.f37605e0;
        if (m51Var != null) {
            for (int i11 = 0; i11 < m51Var.getChildCount(); i11++) {
                if (m51Var.getChildAt(i11) instanceof y51) {
                    y51 y51Var = (y51) m51Var.getChildAt(i11);
                    y51Var.d(this.G.contains(y51Var.f40407x), true);
                }
            }
            m51Var.invalidate();
        }
    }

    public void m() {
    }

    public void q() {
    }

    public void setOnRecentClearedListener(p61 p61Var) {
    }

    @Override
    public void setPressed(boolean z4) {
    }

    public void r(y51 y51Var, mg.q0 q0Var) {
    }
}
