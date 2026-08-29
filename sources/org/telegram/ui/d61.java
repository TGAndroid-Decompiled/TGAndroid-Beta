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
public abstract class d61 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static String[] W1;
    public int A;
    public final ArrayList A0;
    public ValueAnimator A1;
    public int B;
    public final ArrayList B0;
    public boolean B1;
    public h51 C;
    public final ArrayList C0;
    public boolean C1;
    public b61 D;
    public final ArrayList D0;
    public ValueAnimator D1;
    public boolean E;
    public final ArrayList E0;
    public h41 E1;
    public HashSet F;
    public ArrayList F0;
    public ag.z0 F1;
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
    public m51 K;
    public boolean K0;
    public int K1;
    public boolean L;
    public Integer L0;
    public long L1;
    public boolean M;
    public boolean M0;
    public jh.va M1;
    public boolean N;
    public List N0;
    public final h41 N1;
    public final ArrayList O;
    public m51 O0;
    public final h41 O1;
    public boolean P;
    public boolean P0;
    public Runnable P1;
    public d51 Q;
    public float Q0;
    public ValueAnimator Q1;
    public final int R;
    public final ImageReceiver R0;
    public ValueAnimator R1;
    public final int S;
    public org.telegram.ui.Components.p5 S0;
    public final AnimationNotificationsLocker S1;
    public final x41 T;
    public s41 T0;
    public final Paint T1;
    public final cg.i0 U;
    public final Integer U0;
    public Integer U1;
    public final org.telegram.ui.Components.tv[] V;
    public final org.telegram.ui.ActionBar.c6 V0;
    public org.telegram.ui.Components.tv W;
    public float W0;
    public float X0;
    public final org.telegram.ui.ActionBar.o2 Y0;
    public final int Z0;
    public int f37317a;
    public final v41 f37318a0;
    public final b51 f37319a1;
    public int f37320b;
    public final u41 f37321b0;
    public final int f37322b1;
    public int f37323c;
    public final n31 f37324c0;
    public boolean f37325c1;
    public int d;
    public final a51 f37326d0;
    public boolean f37327d1;
    public int f37328e;
    public final q41 f37329e0;
    public ValueAnimator f37330e1;
    public int f37331f;
    public final FrameLayout f37332f0;
    public Drawable f37333f1;
    public final bg.d1 f37334g0;
    public final PorterDuffColorFilter f37335g1;
    public int h;
    public final org.telegram.ui.Components.t9 f37336h0;
    public float f37337h1;
    public final View f37338i0;
    public int f37339i1;
    public final org.telegram.ui.Components.fn f37340j0;
    public org.telegram.ui.Components.n5 f37341j1;
    public final View f37342k0;
    public Rect f37343k1;
    public final c51 f37344l0;
    public View l1;
    public final n51 m0;
    public float f37345m1;
    public int f37346n;
    public final r41 f37347n0;
    public m51 f37348n1;
    public final c2.z f37349o0;
    public Rect f37350o1;
    public final View f37351p0;
    public final OvershootInterpolator f37352p1;
    public int f37353q0;
    public ValueAnimator f37354q1;
    public int f37355r;
    public final ArrayList f37356r0;
    public boolean f37357r1;
    public int f37358s;
    public final SparseIntArray f37359s0;
    public boolean f37360s1;
    public final SparseIntArray f37361t0;
    public boolean f37362t1;
    public final SparseIntArray f37363u0;
    public boolean f37364u1;
    public int v;
    public final SparseIntArray f37365v0;
    public String f37366v1;
    public int f37367w;
    public final ArrayList f37368w0;
    public ArrayList f37369w1;
    public int f37370x;
    public final ArrayList f37371x0;
    public ArrayList f37372x1;
    public int f37373y;
    public boolean f37374y0;
    public ArrayList f37375y1;
    public final ArrayList f37376z0;
    public ArrayList f37377z1;
    public static final List V1 = Arrays.asList("😖", "😫", "🫠", "😨", "❓");
    public static final boolean[] X1 = new boolean[4];
    public static final HashMap Y1 = new HashMap();

    public d61(org.telegram.ui.ActionBar.o2 o2Var, Context context, boolean z10, Integer num, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this(o2Var, context, z10, num, i10, true, c6Var, 16);
    }

    public static void D(int i10, org.telegram.ui.Components.t9 t9Var) {
        List list;
        ImageLocation forDocument;
        String str;
        if (t9Var != null) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(i10).getFeaturedEmojiSets());
            Collections.shuffle(arrayList);
            int round = (int) Math.round(Math.random() * 10.0d);
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
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.f23223m6, 0.2f);
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
                t9Var.setLayerNum(7);
                t9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                t9Var.l(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "36_36", svgThumb, document);
            }
        }
    }

    public static void a(d61 d61Var, int i10, int i11) {
        int i12;
        c2.z zVar = d61Var.f37349o0;
        r41 r41Var = d61Var.f37347n0;
        View m10 = r41Var.m(i10);
        int L0 = r41Var.L0();
        if ((m10 == null && Math.abs(i10 - L0) > 72.0f) || !SharedConfig.animationsEnabled()) {
            if (r41Var.L0() < i10) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            zVar.f2933b = i12;
            zVar.c(i10, i11, false, false);
            return;
        }
        nh.k1 k1Var = new nh.k1(d61Var, d61Var.f37326d0.getContext(), 4);
        k1Var.f6373a = i10;
        k1Var.f49306p = i11;
        r41Var.w0(k1Var);
    }

    public static boolean c(d61 d61Var) {
        if (!d61Var.P) {
            ValueAnimator valueAnimator = d61Var.Q1;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public int getCacheType() {
        int i10 = 13;
        int i11 = this.S;
        if (i11 != 5 && i11 != 7) {
            if (i11 == 6) {
                return org.telegram.ui.Components.p5.g();
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
        if (this.f37333f1 == null) {
            int i10 = this.S;
            if (i10 != 5 && i10 != 9 && i10 != 10 && i10 != 7) {
                this.f37333f1 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
            } else {
                this.f37333f1 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_filled_blocked).mutate();
            }
            this.f37333f1.setColorFilter(this.f37335g1);
        }
        return this.f37333f1;
    }

    public static ArrayList j(HashSet hashSet, ArrayList arrayList) {
        if (hashSet == null) {
            return arrayList;
        }
        int i10 = 0;
        while (i10 < arrayList.size()) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
            if (document == null || hashSet.contains(Long.valueOf(document.f22398id))) {
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
            if (document.f22398id == j10) {
                return document;
            }
        }
        return null;
    }

    public void setBigReactionAnimatedEmoji(org.telegram.ui.Components.p5 p5Var) {
        org.telegram.ui.Components.p5 p5Var2;
        if (this.E && (p5Var2 = this.S0) != p5Var) {
            if (p5Var2 != null) {
                p5Var2.o(this);
            }
            this.S0 = p5Var;
            if (p5Var != null) {
                p5Var.setColorFilter(this.f37335g1);
                this.S0.a(this);
            }
        }
    }

    public static void t(final int i10) {
        boolean[] zArr = X1;
        if (!zArr[i10] && MediaDataController.getInstance(i10) != null) {
            zArr[i10] = true;
            MediaDataController.getInstance(i10).checkStickers(5);
            MediaDataController.getInstance(i10).fetchEmojiStatuses(0, true);
            MediaDataController.getInstance(i10).checkReactions();
            MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
            MediaDataController.getInstance(i10).getDefaultEmojiStatuses();
            MediaDataController.getInstance(i10).checkDefaultTopicIcons();
            org.telegram.ui.Components.ow0.f31488t3.fetch(i10, 1, new Utilities.Callback() {
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
                            p5.h(i10).b(emojiGroup.icon_emoji_id, null);
                        }
                    }
                }
            });
        }
    }

    public final void A(Long l10) {
        this.G.remove(l10);
        a51 a51Var = this.f37326d0;
        if (a51Var != null) {
            int i10 = 0;
            boolean z10 = false;
            for (int i11 = 0; i11 < a51Var.getChildCount(); i11++) {
                if (a51Var.getChildAt(i11) instanceof m51) {
                    m51 m51Var = (m51) a51Var.getChildAt(i11);
                    org.telegram.ui.Components.y5 y5Var = m51Var.f40429e;
                    if (y5Var != null && y5Var.getDocumentId() == l10.longValue()) {
                        m51Var.f();
                    } else {
                        TLRPC.Document document = m51Var.d;
                        if (document != null && document.f22398id == l10.longValue()) {
                            m51Var.f();
                        }
                    }
                    z10 = true;
                }
            }
            a51Var.invalidate();
            if (!z10) {
                while (true) {
                    ArrayList arrayList = this.f37356r0;
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
                c51 c51Var = this.f37344l0;
                if (c51Var != null) {
                    c51Var.m(i10);
                }
            }
        }
    }

    public final void B(boolean r40, boolean r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d61.B(boolean, boolean, boolean):void");
    }

    public final void C() {
        u41 u41Var = this.f37321b0;
        if (u41Var == null) {
            return;
        }
        if (this.f37364u1) {
            u41Var.clearAnimation();
            u41Var.setVisibility(0);
            u41Var.animate().translationY(0.0f).start();
            return;
        }
        a51 a51Var = this.f37326d0;
        if (a51Var.getChildCount() > 0) {
            View childAt = a51Var.getChildAt(0);
            if (RecyclerView.R(childAt) == this.f37317a && "searchbox".equals(childAt.getTag())) {
                u41Var.setVisibility(0);
                u41Var.setTranslationY(childAt.getY());
                return;
            }
            u41Var.setTranslationY(-AndroidUtilities.dp(52.0f));
            return;
        }
        u41Var.setTranslationY(-AndroidUtilities.dp(52.0f));
    }

    public final void E(float f9) {
        int i10;
        int i11 = -1;
        View view = this.f37338i0;
        if (view != null) {
            float interpolation = org.telegram.ui.Components.jr.f29801g.getInterpolation(i7.w.a((((f9 * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            if (n()) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            view.setScaleY(interpolation * i10);
        }
        org.telegram.ui.Components.fn fnVar = this.f37340j0;
        if (fnVar != null) {
            float a2 = i7.w.a((((f9 * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            fnVar.setAlpha(a2);
            fnVar.setScaleX(a2);
            if (!n()) {
                i11 = 1;
            }
            fnVar.setScaleY(a2 * i11);
        }
        float f10 = 800.0f * f9;
        float f11 = f10 - 40.0f;
        float a10 = i7.w.a(f11 / 700.0f, 0.0f, 1.0f);
        float a11 = i7.w.a((f10 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a12 = i7.w.a(f11 / 750.0f, 0.0f, 1.0f);
        float a13 = i7.w.a((f10 - 30.0f) / 120.0f, 0.0f, 1.0f);
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
        float interpolation2 = jrVar.getInterpolation(a10);
        float interpolation3 = jrVar.getInterpolation(a11);
        this.U.setAlpha(a13);
        this.f37321b0.setAlpha(a13);
        int i12 = 0;
        for (int i13 = 0; i13 < this.W.f30108b.getChildCount(); i13++) {
            this.W.f30108b.getChildAt(i13).setAlpha(a13);
        }
        if (this.f37341j1 != null) {
            invalidate();
        }
        float f12 = 1.0f - a13;
        x41 x41Var = this.T;
        x41Var.setTranslationY(AndroidUtilities.dp(-5.0f) * f12);
        if (fnVar != null) {
            fnVar.setTranslationY(AndroidUtilities.dp(-5.0f) * f12);
        }
        this.W0 = (interpolation2 * 0.85f) + 0.15f;
        this.X0 = (interpolation3 * 0.925f) + 0.075f;
        x41Var.invalidateOutline();
        if (fnVar != null) {
            fnVar.setAlpha(a13);
        }
        v41 v41Var = this.f37318a0;
        v41Var.setAlpha(a13);
        v41Var.setScaleX(Math.min(this.W0, 1.0f));
        float pivotX = v41Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(x41Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(x41Var.getHeight(), 2.0d) + Math.pow(x41Var.getWidth() - pivotX, 2.0d)));
        for (int i14 = 0; i14 < this.W.f30108b.getChildCount(); i14++) {
            View childAt = this.W.f30108b.getChildAt(i14);
            if (f9 == 0.0f) {
                childAt.setLayerType(2, null);
            } else if (f9 == 1.0f) {
                childAt.setLayerType(0, null);
            }
            float width = ((childAt.getWidth() / 2.0f) + childAt.getLeft()) - pivotX;
            float height = (childAt.getHeight() / 2.0f) + childAt.getTop();
            if (n()) {
                height = getMeasuredHeight() - height;
            }
            float cascade = AndroidUtilities.cascade(a12, (float) Math.sqrt(com.google.android.recaptcha.internal.a.x(height, height, 0.4f, width * width)), sqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(cascade)) {
                cascade = 0.0f;
            }
            childAt.setScaleX(cascade);
            childAt.setScaleY(cascade);
        }
        while (true) {
            a51 a51Var = this.f37326d0;
            if (i12 < a51Var.getChildCount()) {
                View childAt2 = a51Var.getChildAt(i12);
                if (childAt2 instanceof m51) {
                    m51 m51Var = (m51) childAt2;
                    float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                    float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                    if (n()) {
                        height2 = getMeasuredHeight() - height2;
                    }
                    float cascade2 = AndroidUtilities.cascade(a12, (float) Math.sqrt(com.google.android.recaptcha.internal.a.x(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                    if (Float.isNaN(cascade2)) {
                        cascade2 = 0.0f;
                    }
                    m51Var.setAnimatedScale(cascade2);
                }
                i12++;
            } else {
                this.f37334g0.invalidate();
                a51Var.invalidate();
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
        h41 h41Var = this.O1;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.M)) {
                AndroidUtilities.cancelRunOnUIThread(h41Var);
                AndroidUtilities.runOnUIThread(h41Var);
            }
        } else if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(h41Var);
            AndroidUtilities.runOnUIThread(h41Var);
        } else if (i10 == NotificationCenter.recentEmojiStatusesUpdate) {
            AndroidUtilities.cancelRunOnUIThread(h41Var);
            AndroidUtilities.runOnUIThread(h41Var);
        } else if (i10 == NotificationCenter.groupStickersDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(h41Var);
            AndroidUtilities.runOnUIThread(h41Var);
        } else if (i10 == NotificationCenter.emojiLoaded) {
            l4.x0 x0Var = new l4.x0(18);
            a51 a51Var = this.f37326d0;
            AndroidUtilities.forEachViews((RecyclerView) a51Var, (f5.d) x0Var);
            if (a51Var != null) {
                a51Var.invalidate();
            }
        } else if (i10 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == UserConfig.getInstance(this.R).getClientUserId()) {
            AndroidUtilities.cancelRunOnUIThread(h41Var);
            AndroidUtilities.runOnUIThread(h41Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        float scaleY;
        int i10;
        float f9;
        float measuredHeight;
        org.telegram.ui.Components.n5 n5Var = this.f37341j1;
        if (n5Var != null && (num = this.U0) != null) {
            Rect bounds = n5Var.getBounds();
            View view = this.l1;
            if (view == null) {
                scaleY = 1.0f;
            } else {
                scaleY = view.getScaleY();
            }
            int alpha = this.f37341j1.getAlpha();
            View view2 = this.l1;
            if (view2 == null) {
                bounds.height();
            } else {
                view2.getHeight();
            }
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f37341j1.v = (int) (Math.pow(this.T.getAlpha(), 0.25d) * alpha * this.f37337h1);
            if (this.f37343k1 == null) {
                this.f37343k1 = new Rect();
            }
            if (scaleY > 1.0f && scaleY < 1.5f) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            float f10 = i10;
            if (scaleY > 1.5f) {
                f9 = (bounds.height() * 0.81f) + 1.0f;
            } else {
                f9 = 0.0f;
            }
            float intValue = num.intValue() + f10;
            float z10 = com.google.android.recaptcha.internal.a.z(scaleY, 1.0f, bounds.centerY(), -f9);
            boolean n10 = n();
            int i11 = this.Z0;
            if (!n10) {
                measuredHeight = AndroidUtilities.dp(i11);
            } else {
                measuredHeight = getMeasuredHeight() - (AndroidUtilities.dp(i11) / 2.0f);
            }
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + z10 + measuredHeight;
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.f37343k1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            org.telegram.ui.Components.n5 n5Var2 = this.f37341j1;
            Rect rect = this.f37343k1;
            int i12 = rect.left;
            Rect rect2 = this.f37343k1;
            n5Var2.setBounds(i12, rect.top, (int) ((rect.width() / scaleY) + i12), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.f37343k1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.f37341j1.draw(canvas);
            org.telegram.ui.Components.n5 n5Var3 = this.f37341j1;
            n5Var3.v = alpha;
            n5Var3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        m51 m51Var = this.f37348n1;
        if (m51Var != null && this.f37350o1 != null && m51Var.A != null) {
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f37348n1.A.setAlpha((int) (this.f37345m1 * 255.0f));
            this.f37348n1.A.setBounds(this.f37350o1);
            this.f37348n1.A.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - this.f37337h1, this.f37322b1, this.f37339i1), PorterDuff.Mode.SRC_IN));
            this.f37348n1.A.draw(canvas);
            canvas.restore();
        }
    }

    public final long f() {
        return Math.max(450L, Math.min(55, this.K1 - this.J1) * 30);
    }

    public final long g() {
        return Math.max(300L, Math.min(45, this.K1 - this.J1) * 25) + f() + 16;
    }

    public jh.va getCollectionParticles() {
        if (this.M1 == null) {
            this.M1 = new jh.va(1, 8);
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
        View view;
        float f9;
        if (this.B1) {
            view = this.f37329e0;
        } else {
            view = this.f37326d0;
        }
        boolean canScrollVertically = view.canScrollVertically(1);
        if (canScrollVertically != this.f37357r1) {
            this.f37357r1 = canScrollVertically;
            ViewPropertyAnimator animate = this.f37342k0.animate();
            if (canScrollVertically) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            animate.alpha(f9).setDuration(200L).start();
        }
    }

    public final void i(int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d61.i(int, android.view.View):void");
    }

    public final void l() {
        String str;
        int i10 = this.S;
        if (i10 != 2) {
            StringBuilder sb2 = new StringBuilder("emoji");
            if (i10 != 0 && i10 != 12 && i10 != 9 && i10 != 10) {
                str = "reaction";
            } else {
                str = "status";
            }
            String q6 = a4.w.q(sb2, str, "usehint");
            int i11 = MessagesController.getGlobalMainSettings().getInt(q6, 0);
            if (i11 <= 3) {
                MessagesController.getGlobalMainSettings().edit().putInt(q6, i11 + 1).apply();
            }
        }
    }

    public final boolean n() {
        int i10 = this.S;
        if (i10 != 5 && i10 != 10 && i10 != 12 && i10 != 15) {
            return false;
        }
        return true;
    }

    public final void o(android.view.View r14, org.telegram.ui.Components.y5 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d61.o(android.view.View, org.telegram.ui.Components.y5):void");
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
        org.telegram.ui.Components.n5 n5Var = this.f37341j1;
        if (n5Var != null) {
            n5Var.f30850n = this;
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
        org.telegram.ui.Components.n5 n5Var = this.f37341j1;
        if (n5Var != null) {
            n5Var.f30850n = null;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && this.S == 6) {
            this.f37347n0.y1((getMeasuredWidth() / AndroidUtilities.dp(42.0f)) * 5);
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

    public final void s(t51 t51Var) {
        Integer num = this.U1;
        if (num != null) {
            Parcelable parcelable = (Parcelable) Y1.get(num);
        }
        this.P1 = t51Var;
        boolean z10 = this.M0;
        a51 a51Var = this.f37326d0;
        if (!z10) {
            h();
            for (int i10 = 0; i10 < a51Var.getChildCount(); i10++) {
                View childAt = a51Var.getChildAt(i10);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
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
        if (i11 != 3 && i11 != 4 && i11 != 6) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.Q1 = ofFloat;
            ofFloat.addUpdateListener(new g41(this, 0));
            this.Q1.addListener(new e50(this, 28));
            h41 h41Var = new h41(this, 0);
            kg.g0.f13719f = true;
            kg.g0.f13718e = true;
            kg.g0.f13720g = false;
            if (kg.g0.d) {
                kg.g0.d = false;
            }
            kg.g0.f13717c = h41Var;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.S1.lock();
            this.Q1.setDuration(800L);
            a51Var.setLayerType(2, null);
            this.f37321b0.setLayerType(2, null);
            this.f37318a0.setLayerType(2, null);
            this.U.setLayerType(2, null);
            org.telegram.ui.Components.fn fnVar = this.f37340j0;
            if (fnVar != null) {
                fnVar.setLayerType(2, null);
            }
            View view = this.f37338i0;
            if (view != null) {
                view.setLayerType(2, null);
            }
            this.W.m(true);
            E(0.0f);
            return;
        }
        h();
        E(1.0f);
    }

    public void setAnimationsEnabled(boolean z10) {
        this.L = z10;
    }

    public void setBackgroundDelegate(d51 d51Var) {
        this.Q = d51Var;
    }

    public void setDrawBackground(boolean z10) {
        this.M0 = z10;
        this.T.setClipToOutline(z10);
        cg.i0 i0Var = this.U;
        if (!z10) {
            i0Var.setVisibility(8);
        } else {
            i0Var.setVisibility(0);
        }
    }

    public void setEnterAnimationInProgress(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            if (!z10) {
                AndroidUtilities.forEachViews((RecyclerView) this.f37326d0, (f5.d) new l4.x0(13));
                for (int i10 = 0; i10 < this.W.f30108b.getChildCount(); i10++) {
                    View childAt = this.W.f30108b.getChildAt(i10);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                this.W.f30108b.invalidate();
            }
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
        m51 m51Var = this.K;
        if (m51Var != null) {
            m51Var.h.setImageBitmap(drawable);
        }
    }

    public void setLongPressEnabled(boolean z10) {
        this.f37327d1 = z10;
    }

    public void setOnLongPressedListener(b61 b61Var) {
        this.D = b61Var;
    }

    public void setRecentReactions(List<kg.q0> list) {
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
        a51 a51Var = this.f37326d0;
        if (a51Var != null) {
            for (int i10 = 0; i10 < a51Var.getChildCount(); i10++) {
                if (a51Var.getChildAt(i10) instanceof m51) {
                    m51 m51Var = (m51) a51Var.getChildAt(i10);
                    org.telegram.ui.Components.y5 y5Var = m51Var.f40429e;
                    if (y5Var != null) {
                        m51Var.d(hashSet.contains(Long.valueOf(y5Var.getDocumentId())), true);
                    } else {
                        m51Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            a51Var.invalidate();
        }
    }

    public void setSelectedReaction(kg.q0 q0Var) {
        this.F.clear();
        this.F.add(q0Var);
        a51 a51Var = this.f37326d0;
        if (a51Var != null) {
            for (int i10 = 0; i10 < a51Var.getChildCount(); i10++) {
                if (a51Var.getChildAt(i10) instanceof m51) {
                    m51 m51Var = (m51) a51Var.getChildAt(i10);
                    m51Var.d(this.F.contains(m51Var.f40435x), true);
                }
            }
            a51Var.invalidate();
        }
        q41 q41Var = this.f37329e0;
        if (q41Var != null) {
            for (int i11 = 0; i11 < q41Var.getChildCount(); i11++) {
                if (q41Var.getChildAt(i11) instanceof m51) {
                    m51 m51Var2 = (m51) q41Var.getChildAt(i11);
                    m51Var2.d(this.F.contains(m51Var2.f40435x), true);
                }
            }
            q41Var.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<kg.q0> hashSet) {
        this.F = hashSet;
        HashSet hashSet2 = this.G;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != null && ((kg.q0) arrayList.get(i10)).f13826g != 0) {
                hashSet2.add(Long.valueOf(((kg.q0) arrayList.get(i10)).f13826g));
            }
        }
    }

    public boolean u() {
        return false;
    }

    public final void v(String str, boolean z10, boolean z11) {
        long j10;
        h41 h41Var = this.E1;
        if (h41Var != null) {
            AndroidUtilities.cancelRunOnUIThread(h41Var);
            this.E1 = null;
        }
        ag.z0 z0Var = this.F1;
        if (z0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(z0Var);
            this.F1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        n51 n51Var = this.m0;
        u41 u41Var = this.f37321b0;
        if (isEmpty) {
            this.f37362t1 = false;
            this.f37364u1 = false;
            z(false, z10);
            if (u41Var != null) {
                u41Var.d(true);
                s51.a(u41Var, false);
            }
            n51Var.E(true);
            this.f37366v1 = null;
        } else {
            boolean z12 = this.f37362t1;
            boolean z13 = !z12;
            this.f37362t1 = true;
            this.f37364u1 = false;
            if (u41Var != null) {
                u41Var.f42275f.b(2);
            }
            if (!z12) {
                ArrayList arrayList = this.f37369w1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = this.f37372x1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = this.f37377z1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                n51Var.E(false);
            } else if (!str.equals(this.f37366v1)) {
                h41 h41Var2 = new h41(this, 1);
                this.E1 = h41Var2;
                AndroidUtilities.runOnUIThread(h41Var2, 120L);
            }
            this.f37366v1 = str;
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            if (!Arrays.equals(currentKeyboardLanguage, W1)) {
                MediaDataController.getInstance(this.R).fetchNewEmojiKeywords(currentKeyboardLanguage);
            }
            W1 = currentKeyboardLanguage;
            ag.z0 z0Var2 = new ag.z0(this, str, z10, z13, currentKeyboardLanguage, 5);
            this.F1 = z0Var2;
            if (z11) {
                j10 = 425;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(z0Var2, j10);
            if (u41Var != null) {
                u41Var.f42275f.b(2);
                s51.a(u41Var, z10);
            }
        }
        C();
    }

    public final void w(float f9) {
        ValueAnimator valueAnimator = this.f37330e1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f37330e1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37351p0.getAlpha(), f9 * 0.25f);
        this.f37330e1 = ofFloat;
        ofFloat.addUpdateListener(new g41(this, 2));
        this.f37330e1.setDuration(200L);
        this.f37330e1.setInterpolator(org.telegram.ui.Components.jr.f29800f);
        this.f37330e1.start();
    }

    public final void x(Long l10, boolean z10) {
        boolean z11;
        HashSet hashSet = this.G;
        if (!hashSet.contains(l10)) {
            hashSet.add(l10);
            z11 = true;
        } else {
            hashSet.remove(l10);
            z11 = false;
        }
        a51 a51Var = this.f37326d0;
        if (a51Var != null) {
            for (int i10 = 0; i10 < a51Var.getChildCount(); i10++) {
                if (a51Var.getChildAt(i10) instanceof m51) {
                    m51 m51Var = (m51) a51Var.getChildAt(i10);
                    org.telegram.ui.Components.y5 y5Var = m51Var.f40429e;
                    if (y5Var != null && y5Var.getDocumentId() == l10.longValue()) {
                        m51Var.e(z11, z10);
                    } else {
                        TLRPC.Document document = m51Var.d;
                        if (document != null && document.f22398id == l10.longValue()) {
                            m51Var.e(z11, z10);
                        }
                    }
                }
            }
            a51Var.invalidate();
        }
    }

    public final void y(org.telegram.ui.Components.n5 n5Var, View view) {
        int i10;
        Integer num;
        if (n5Var != null && (num = n5Var.B) != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        this.f37339i1 = i10;
        this.f37341j1 = n5Var;
        this.l1 = view;
        if (this.E && n5Var != null) {
            n5Var.f30850n = this;
        }
        invalidate();
    }

    public final void z(boolean z10, boolean z11) {
        float f9;
        if (this.B1 == z10) {
            return;
        }
        this.B1 = z10;
        a51 a51Var = this.f37326d0;
        a51Var.setVisibility(0);
        q41 q41Var = this.f37329e0;
        q41Var.setVisibility(0);
        ValueAnimator valueAnimator = this.A1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.D1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.D1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A1 = ofFloat;
        ofFloat.addUpdateListener(new k41(this, z10, 0));
        this.A1.addListener(new w41(this, z10, 0));
        this.A1.setDuration(320L);
        this.A1.setInterpolator(org.telegram.ui.Components.jr.h);
        this.A1.start();
        ViewPropertyAnimator animate = ((View) a51Var.getParent()).animate();
        if (this.B1 && z11) {
            f9 = -AndroidUtilities.dp(36.0f);
        } else {
            f9 = 0.0f;
        }
        b.q(animate.translationY(f9).setUpdateListener(new g41(this, 1)), org.telegram.ui.Components.jr.f29800f, 160L);
        if (this.B1 && z11) {
            q41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        } else {
            q41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        }
        h();
    }

    public d61(org.telegram.ui.ActionBar.o2 o2Var, Context context, boolean z10, Integer num, int i10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        this(o2Var, context, z10, num, i10, z11, c6Var, i11, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23383v6, c6Var));
    }

    public d61(org.telegram.ui.ActionBar.o2 r41, android.content.Context r42, boolean r43, java.lang.Integer r44, int r45, boolean r46, org.telegram.ui.ActionBar.c6 r47, int r48, int r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d61.<init>(org.telegram.ui.ActionBar.o2, android.content.Context, boolean, java.lang.Integer, int, boolean, org.telegram.ui.ActionBar.c6, int, int):void");
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.F.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            this.F.add(kg.q0.b(str));
        }
        a51 a51Var = this.f37326d0;
        if (a51Var != null) {
            for (int i11 = 0; i11 < a51Var.getChildCount(); i11++) {
                if (a51Var.getChildAt(i11) instanceof m51) {
                    m51 m51Var = (m51) a51Var.getChildAt(i11);
                    m51Var.d(this.F.contains(m51Var.f40435x), true);
                }
            }
            a51Var.invalidate();
        }
    }

    public void m() {
    }

    public void q() {
    }

    public void setOnRecentClearedListener(c61 c61Var) {
    }

    @Override
    public void setPressed(boolean z10) {
    }

    public void r(m51 m51Var, kg.q0 q0Var) {
    }
}
