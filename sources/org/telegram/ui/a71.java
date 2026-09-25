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
public abstract class a71 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static String[] a2;
    public final ArrayList A0;
    public ArrayList A1;
    public final ArrayList B0;
    public ArrayList B1;
    public boolean C0;
    public ArrayList C1;
    public final ArrayList D0;
    public ArrayList D1;
    public int E;
    public final ArrayList E0;
    public ValueAnimator E1;
    public int F;
    public final ArrayList F0;
    public boolean F1;
    public e61 G;
    public final ArrayList G0;
    public boolean G1;
    public y61 H;
    public final ArrayList H0;
    public ValueAnimator H1;
    public boolean I;
    public final ArrayList I0;
    public d51 I1;
    public HashSet J;
    public ArrayList J0;
    public ai.b8 J1;
    public final HashSet K;
    public final ArrayList K0;
    public boolean K1;
    public final Paint L;
    public ArrayList L0;
    public boolean L1;
    public final Paint M;
    public final ArrayList M0;
    public View M1;
    public Drawable N;
    public final boolean N0;
    public int N1;
    public j61 O;
    public boolean O0;
    public int O1;
    public boolean P;
    public Integer P0;
    public long P1;
    public boolean Q;
    public boolean Q0;
    public yh.i8 Q1;
    public boolean R;
    public List R0;
    public final d51 R1;
    public final ArrayList S;
    public j61 S0;
    public final d51 S1;
    public boolean T;
    public boolean T0;
    public Runnable T1;
    public a61 U;
    public float U0;
    public ValueAnimator U1;
    public final int V;
    public final ImageReceiver V0;
    public ValueAnimator V1;
    public final int W;
    public org.telegram.ui.Components.q5 W0;
    public final AnimationNotificationsLocker W1;
    public p51 X0;
    public final Paint X1;
    public final Integer Y0;
    public Integer Y1;
    public final org.telegram.ui.ActionBar.d6 Z0;
    public int f32010a;
    public final u51 f32011a0;
    public float f32012a1;
    public int f32013b;
    public final ci.r6 f32014b0;
    public float f32015b1;
    public int f32016c;
    public final org.telegram.ui.Components.dw[] f32017c0;
    public final org.telegram.ui.ActionBar.m2 f32018c1;
    public int d;
    public org.telegram.ui.Components.dw f32019d0;
    public final int f32020d1;
    public int e;
    public final s51 f32021e0;
    public final y51 f32022e1;
    public int f32023f;
    public final r51 f32024f0;
    public final int f32025f1;
    public final m51 f32026g0;
    public boolean f32027g1;
    public int h;
    public final x51 f32028h0;
    public boolean f32029h1;
    public final n51 f32030i0;
    public ValueAnimator f32031i1;
    public final FrameLayout f32032j0;
    public Drawable f32033j1;
    public final ci.m6 f32034k0;
    public final PorterDuffColorFilter f32035k1;
    public final org.telegram.ui.Components.w9 f32036l0;
    public float l1;
    public final View m0;
    public int f32037m1;
    public int f32038n;
    public final org.telegram.ui.Components.ln f32039n0;
    public org.telegram.ui.Components.o5 f32040n1;
    public final View f32041o0;
    public Rect f32042o1;
    public final z51 f32043p0;
    public View f32044p1;
    public final k61 f32045q0;
    public float f32046q1;
    public int f32047r;
    public final o51 f32048r0;
    public j61 f32049r1;
    public int f32050s;
    public final org.telegram.ui.Components.zk0 f32051s0;
    public Rect f32052s1;
    public final View f32053t0;
    public final OvershootInterpolator f32054t1;
    public int f32055u0;
    public ValueAnimator f32056u1;
    public int v;
    public final ArrayList f32057v0;
    public boolean f32058v1;
    public int f32059w;
    public final SparseIntArray f32060w0;
    public boolean f32061w1;
    public int f32062x;
    public final SparseIntArray f32063x0;
    public boolean f32064x1;
    public int f32065y;
    public final SparseIntArray f32066y0;
    public boolean f32067y1;
    public final SparseIntArray f32068z0;
    public String f32069z1;
    public static final List Z1 = Arrays.asList("😖", "😫", "🫠", "😨", "❓");
    public static final boolean[] f32008b2 = new boolean[4];
    public static final HashMap f32009c2 = new HashMap();

    public a71(org.telegram.ui.ActionBar.m2 m2Var, Context context, boolean z10, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this(m2Var, context, z10, num, i10, true, d6Var, 16);
    }

    public static void D(int i10, org.telegram.ui.Components.w9 w9Var) {
        List list;
        ImageLocation forDocument;
        String str;
        if (w9Var != null) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(i10).getFeaturedEmojiSets());
            Collections.shuffle(arrayList);
            int round = (int) Math.round(Math.random() * 10.0d);
            TLRPC.Document document = null;
            int i11 = 0;
            while (true) {
                int size = arrayList.size();
                list = Z1;
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
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.h6.f19224m6, 0.2f);
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
                w9Var.setLayerNum(7);
                w9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                w9Var.l(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "36_36", svgThumb, document);
            }
        }
    }

    public static void a(a71 a71Var, int i10, int i11) {
        int i12;
        org.telegram.ui.Components.zk0 zk0Var = a71Var.f32051s0;
        o51 o51Var = a71Var.f32048r0;
        View m10 = o51Var.m(i10);
        int L0 = o51Var.L0();
        if ((m10 == null && Math.abs(i10 - L0) > 72.0f) || !SharedConfig.animationsEnabled()) {
            if (o51Var.L0() < i10) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            zk0Var.f30915b = i12;
            zk0Var.c(i10, i11, false, false);
            return;
        }
        ci.m1 m1Var = new ci.m1(a71Var, a71Var.f32028h0.getContext(), 4);
        m1Var.f43111a = i10;
        m1Var.f13094p = i11;
        o51Var.w0(m1Var);
    }

    public static boolean c(a71 a71Var) {
        if (!a71Var.T) {
            ValueAnimator valueAnimator = a71Var.U1;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public int getCacheType() {
        int i10 = 13;
        int i11 = this.W;
        if (i11 != 5 && i11 != 7) {
            if (i11 == 6) {
                return org.telegram.ui.Components.q5.g();
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
        if (this.f32033j1 == null) {
            int i10 = this.W;
            if (i10 != 5 && i10 != 9 && i10 != 10 && i10 != 7) {
                this.f32033j1 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
            } else {
                this.f32033j1 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_filled_blocked).mutate();
            }
            this.f32033j1.setColorFilter(this.f32035k1);
        }
        return this.f32033j1;
    }

    public static ArrayList j(HashSet hashSet, ArrayList arrayList) {
        if (hashSet == null) {
            return arrayList;
        }
        int i10 = 0;
        while (i10 < arrayList.size()) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
            if (document == null || hashSet.contains(Long.valueOf(document.f18342id))) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        return arrayList;
    }

    public static TLRPC.Document k(String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        long j3;
        if (tL_messages_stickerSet == null) {
            return null;
        }
        String fixEmoji = Emoji.fixEmoji(str);
        int i10 = 0;
        while (true) {
            if (i10 < tL_messages_stickerSet.packs.size()) {
                if (!tL_messages_stickerSet.packs.get(i10).documents.isEmpty() && TextUtils.equals(Emoji.fixEmoji(tL_messages_stickerSet.packs.get(i10).emoticon), fixEmoji)) {
                    j3 = tL_messages_stickerSet.packs.get(i10).documents.get(0).longValue();
                    break;
                }
                i10++;
            } else {
                j3 = 0;
                break;
            }
        }
        if (j3 == 0) {
            return null;
        }
        for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
            if (document.f18342id == j3) {
                return document;
            }
        }
        return null;
    }

    public void setBigReactionAnimatedEmoji(org.telegram.ui.Components.q5 q5Var) {
        org.telegram.ui.Components.q5 q5Var2;
        if (this.I && (q5Var2 = this.W0) != q5Var) {
            if (q5Var2 != null) {
                q5Var2.o(this);
            }
            this.W0 = q5Var;
            if (q5Var != null) {
                q5Var.setColorFilter(this.f32035k1);
                this.W0.a(this);
            }
        }
    }

    public static void t(int i10) {
        boolean[] zArr = f32008b2;
        if (!zArr[i10] && MediaDataController.getInstance(i10) != null) {
            zArr[i10] = true;
            MediaDataController.getInstance(i10).checkStickers(5);
            MediaDataController.getInstance(i10).fetchEmojiStatuses(0, true);
            MediaDataController.getInstance(i10).checkReactions();
            MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
            MediaDataController.getInstance(i10).getDefaultEmojiStatuses();
            MediaDataController.getInstance(i10).checkDefaultTopicIcons();
            org.telegram.ui.Components.gx0.f24546x3.fetch(i10, 1, new ai.m(i10, 1));
        }
    }

    public final void A(Long l4) {
        this.K.remove(l4);
        x51 x51Var = this.f32028h0;
        if (x51Var != null) {
            int i10 = 0;
            boolean z10 = false;
            for (int i11 = 0; i11 < x51Var.getChildCount(); i11++) {
                if (x51Var.getChildAt(i11) instanceof j61) {
                    j61 j61Var = (j61) x51Var.getChildAt(i11);
                    org.telegram.ui.Components.z5 z5Var = j61Var.e;
                    if (z5Var != null && z5Var.getDocumentId() == l4.longValue()) {
                        j61Var.f();
                    } else {
                        TLRPC.Document document = j61Var.d;
                        if (document != null && document.f18342id == l4.longValue()) {
                            j61Var.f();
                        }
                    }
                    z10 = true;
                }
            }
            x51Var.invalidate();
            if (!z10) {
                while (true) {
                    ArrayList arrayList = this.f32057v0;
                    if (i10 < arrayList.size()) {
                        long longValue = ((Long) arrayList.get(i10)).longValue();
                        if (longValue == (l4.longValue() * 13) + 62425 || longValue == (l4.longValue() * 13) + 3212) {
                            break;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
                z51 z51Var = this.f32043p0;
                if (z51Var != null) {
                    z51Var.m(i10);
                }
            }
        }
    }

    public final void B(boolean r40, boolean r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a71.B(boolean, boolean, boolean):void");
    }

    public final void C() {
        r51 r51Var = this.f32024f0;
        if (r51Var == null) {
            return;
        }
        if (this.f32067y1) {
            r51Var.clearAnimation();
            r51Var.setVisibility(0);
            r51Var.animate().translationY(0.0f).start();
            return;
        }
        x51 x51Var = this.f32028h0;
        if (x51Var.getChildCount() > 0) {
            View childAt = x51Var.getChildAt(0);
            if (RecyclerView.R(childAt) == this.f32010a && "searchbox".equals(childAt.getTag())) {
                r51Var.setVisibility(0);
                r51Var.setTranslationY(childAt.getY());
                return;
            }
            r51Var.setTranslationY(-AndroidUtilities.dp(52.0f));
            return;
        }
        r51Var.setTranslationY(-AndroidUtilities.dp(52.0f));
    }

    public final void E(float f7) {
        int i10;
        int i11 = -1;
        View view = this.m0;
        if (view != null) {
            float interpolation = org.telegram.ui.Components.rr.f28032g.getInterpolation(w7.q.a((((f7 * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            if (n()) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            view.setScaleY(interpolation * i10);
        }
        org.telegram.ui.Components.ln lnVar = this.f32039n0;
        if (lnVar != null) {
            float a10 = w7.q.a((((f7 * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            lnVar.setAlpha(a10);
            lnVar.setScaleX(a10);
            if (!n()) {
                i11 = 1;
            }
            lnVar.setScaleY(a10 * i11);
        }
        float f10 = 800.0f * f7;
        float f11 = f10 - 40.0f;
        float a11 = w7.q.a(f11 / 700.0f, 0.0f, 1.0f);
        float a12 = w7.q.a((f10 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a13 = w7.q.a(f11 / 750.0f, 0.0f, 1.0f);
        float a14 = w7.q.a((f10 - 30.0f) / 120.0f, 0.0f, 1.0f);
        org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.h;
        float interpolation2 = rrVar.getInterpolation(a11);
        float interpolation3 = rrVar.getInterpolation(a12);
        this.f32014b0.setAlpha(a14);
        this.f32024f0.setAlpha(a14);
        int i12 = 0;
        for (int i13 = 0; i13 < this.f32019d0.f30651b.getChildCount(); i13++) {
            this.f32019d0.f30651b.getChildAt(i13).setAlpha(a14);
        }
        if (this.f32040n1 != null) {
            invalidate();
        }
        float f12 = 1.0f - a14;
        u51 u51Var = this.f32011a0;
        u51Var.setTranslationY(AndroidUtilities.dp(-5.0f) * f12);
        if (lnVar != null) {
            lnVar.setTranslationY(AndroidUtilities.dp(-5.0f) * f12);
        }
        this.f32012a1 = (interpolation2 * 0.85f) + 0.15f;
        this.f32015b1 = (interpolation3 * 0.925f) + 0.075f;
        u51Var.invalidateOutline();
        if (lnVar != null) {
            lnVar.setAlpha(a14);
        }
        s51 s51Var = this.f32021e0;
        s51Var.setAlpha(a14);
        s51Var.setScaleX(Math.min(this.f32012a1, 1.0f));
        float pivotX = s51Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(u51Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(u51Var.getHeight(), 2.0d) + Math.pow(u51Var.getWidth() - pivotX, 2.0d)));
        for (int i14 = 0; i14 < this.f32019d0.f30651b.getChildCount(); i14++) {
            View childAt = this.f32019d0.f30651b.getChildAt(i14);
            if (f7 == 0.0f) {
                childAt.setLayerType(2, null);
            } else if (f7 == 1.0f) {
                childAt.setLayerType(0, null);
            }
            float width = ((childAt.getWidth() / 2.0f) + childAt.getLeft()) - pivotX;
            float height = (childAt.getHeight() / 2.0f) + childAt.getTop();
            if (n()) {
                height = getMeasuredHeight() - height;
            }
            float cascade = AndroidUtilities.cascade(a13, (float) Math.sqrt(com.google.android.gms.internal.vision.e2.x(height, height, 0.4f, width * width)), sqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(cascade)) {
                cascade = 0.0f;
            }
            childAt.setScaleX(cascade);
            childAt.setScaleY(cascade);
        }
        while (true) {
            x51 x51Var = this.f32028h0;
            if (i12 < x51Var.getChildCount()) {
                View childAt2 = x51Var.getChildAt(i12);
                if (childAt2 instanceof j61) {
                    j61 j61Var = (j61) childAt2;
                    float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                    float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                    if (n()) {
                        height2 = getMeasuredHeight() - height2;
                    }
                    float cascade2 = AndroidUtilities.cascade(a13, (float) Math.sqrt(com.google.android.gms.internal.vision.e2.x(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                    if (Float.isNaN(cascade2)) {
                        cascade2 = 0.0f;
                    }
                    j61Var.setAnimatedScale(cascade2);
                }
                i12++;
            } else {
                this.f32034k0.invalidate();
                x51Var.invalidate();
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
        d51 d51Var = this.S1;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.Q)) {
                AndroidUtilities.cancelRunOnUIThread(d51Var);
                AndroidUtilities.runOnUIThread(d51Var);
            }
        } else if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(d51Var);
            AndroidUtilities.runOnUIThread(d51Var);
        } else if (i10 == NotificationCenter.recentEmojiStatusesUpdate) {
            AndroidUtilities.cancelRunOnUIThread(d51Var);
            AndroidUtilities.runOnUIThread(d51Var);
        } else if (i10 == NotificationCenter.groupStickersDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(d51Var);
            AndroidUtilities.runOnUIThread(d51Var);
        } else if (i10 == NotificationCenter.emojiLoaded) {
            ai.i iVar = new ai.i(5);
            x51 x51Var = this.f32028h0;
            AndroidUtilities.forEachViews((RecyclerView) x51Var, (Utilities.Callback<View>) iVar);
            if (x51Var != null) {
                x51Var.invalidate();
            }
        } else if (i10 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == UserConfig.getInstance(this.V).getClientUserId()) {
            AndroidUtilities.cancelRunOnUIThread(d51Var);
            AndroidUtilities.runOnUIThread(d51Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        float scaleY;
        int i10;
        float f7;
        float measuredHeight;
        org.telegram.ui.Components.o5 o5Var = this.f32040n1;
        if (o5Var != null && (num = this.Y0) != null) {
            Rect bounds = o5Var.getBounds();
            View view = this.f32044p1;
            if (view == null) {
                scaleY = 1.0f;
            } else {
                scaleY = view.getScaleY();
            }
            int alpha = this.f32040n1.getAlpha();
            View view2 = this.f32044p1;
            if (view2 == null) {
                bounds.height();
            } else {
                view2.getHeight();
            }
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f32040n1.v = (int) (Math.pow(this.f32011a0.getAlpha(), 0.25d) * alpha * this.l1);
            if (this.f32042o1 == null) {
                this.f32042o1 = new Rect();
            }
            if (scaleY > 1.0f && scaleY < 1.5f) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            float f10 = i10;
            if (scaleY > 1.5f) {
                f7 = (bounds.height() * 0.81f) + 1.0f;
            } else {
                f7 = 0.0f;
            }
            float intValue = num.intValue() + f10;
            float z10 = com.google.android.gms.internal.vision.e2.z(scaleY, 1.0f, bounds.centerY(), -f7);
            boolean n10 = n();
            int i11 = this.f32020d1;
            if (!n10) {
                measuredHeight = AndroidUtilities.dp(i11);
            } else {
                measuredHeight = getMeasuredHeight() - (AndroidUtilities.dp(i11) / 2.0f);
            }
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + z10 + measuredHeight;
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.f32042o1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            org.telegram.ui.Components.o5 o5Var2 = this.f32040n1;
            Rect rect = this.f32042o1;
            int i12 = rect.left;
            Rect rect2 = this.f32042o1;
            o5Var2.setBounds(i12, rect.top, (int) ((rect.width() / scaleY) + i12), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.f32042o1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.f32040n1.draw(canvas);
            org.telegram.ui.Components.o5 o5Var3 = this.f32040n1;
            o5Var3.v = alpha;
            o5Var3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        j61 j61Var = this.f32049r1;
        if (j61Var != null && this.f32052s1 != null && j61Var.E != null) {
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f32049r1.E.setAlpha((int) (this.f32046q1 * 255.0f));
            this.f32049r1.E.setBounds(this.f32052s1);
            this.f32049r1.E.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - this.l1, this.f32025f1, this.f32037m1), PorterDuff.Mode.SRC_IN));
            this.f32049r1.E.draw(canvas);
            canvas.restore();
        }
    }

    public final long f() {
        return Math.max(450L, Math.min(55, this.O1 - this.N1) * 30);
    }

    public final long g() {
        return Math.max(300L, Math.min(45, this.O1 - this.N1) * 25) + f() + 16;
    }

    public yh.i8 getCollectionParticles() {
        if (this.Q1 == null) {
            this.Q1 = new yh.i8(1, 8);
        }
        return this.Q1;
    }

    public long getDialogId() {
        return UserConfig.getInstance(this.V).getClientUserId();
    }

    public float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    public final void h() {
        View view;
        float f7;
        if (this.F1) {
            view = this.f32030i0;
        } else {
            view = this.f32028h0;
        }
        boolean canScrollVertically = view.canScrollVertically(1);
        if (canScrollVertically != this.f32058v1) {
            this.f32058v1 = canScrollVertically;
            ViewPropertyAnimator animate = this.f32041o0.animate();
            if (canScrollVertically) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            org.telegram.messenger.ok.r(animate, f7, 200L);
        }
    }

    public final void i(int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a71.i(int, android.view.View):void");
    }

    public final void l() {
        String str;
        int i10 = this.W;
        if (i10 != 2) {
            StringBuilder sb2 = new StringBuilder("emoji");
            if (i10 != 0 && i10 != 12 && i10 != 9 && i10 != 10) {
                str = "reaction";
            } else {
                str = "status";
            }
            String t10 = a4.a.t(sb2, str, "usehint");
            int i11 = MessagesController.getGlobalMainSettings().getInt(t10, 0);
            if (i11 <= 3) {
                MessagesController.getGlobalMainSettings().edit().putInt(t10, i11 + 1).apply();
            }
        }
    }

    public final boolean n() {
        int i10 = this.W;
        if (i10 != 5 && i10 != 10 && i10 != 12 && i10 != 15) {
            return false;
        }
        return true;
    }

    public final void o(android.view.View r14, org.telegram.ui.Components.z5 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a71.o(android.view.View, org.telegram.ui.Components.z5):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        int i10 = this.V;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.featuredEmojiDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupStickersDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        int i11 = this.W;
        if (i11 == 0 || i11 == 12) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        }
        org.telegram.ui.Components.o5 o5Var = this.f32040n1;
        if (o5Var != null) {
            o5Var.f26922n = this;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setBigReactionAnimatedEmoji(null);
        this.I = false;
        int i10 = this.V;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.featuredEmojiDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        int i11 = this.W;
        if (i11 == 0 || i11 == 12) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        }
        org.telegram.ui.Components.o5 o5Var = this.f32040n1;
        if (o5Var != null) {
            o5Var.f26922n = null;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && this.W == 6) {
            this.f32048r0.y1((getMeasuredWidth() / AndroidUtilities.dp(42.0f)) * 5);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10 = this.Q0;
        int i12 = this.W;
        if (z10 && i12 != 3 && i12 != 4) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f), Integer.MIN_VALUE));
        } else if (i12 == 6) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.displaySize.y * 0.35f), Integer.MIN_VALUE));
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public abstract void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num);

    public final void s(q61 q61Var) {
        Integer num = this.Y1;
        if (num != null) {
            Parcelable parcelable = (Parcelable) f32009c2.get(num);
        }
        this.T1 = q61Var;
        boolean z10 = this.Q0;
        x51 x51Var = this.f32028h0;
        if (!z10) {
            h();
            for (int i10 = 0; i10 < x51Var.getChildCount(); i10++) {
                View childAt = x51Var.getChildAt(i10);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
            }
            return;
        }
        ValueAnimator valueAnimator = this.U1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.U1 = null;
        }
        ValueAnimator valueAnimator2 = this.V1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.V1 = null;
        }
        int i11 = this.W;
        if (i11 != 3 && i11 != 4 && i11 != 6) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.U1 = ofFloat;
            ofFloat.addUpdateListener(new c51(this, 0));
            this.U1.addListener(new xo0(this, 21));
            d51 d51Var = new d51(this, 0);
            zg.e0.f49294f = true;
            zg.e0.e = true;
            zg.e0.f49295g = false;
            if (zg.e0.d) {
                zg.e0.d = false;
            }
            zg.e0.f49293c = d51Var;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.W1.lock();
            this.U1.setDuration(800L);
            x51Var.setLayerType(2, null);
            this.f32024f0.setLayerType(2, null);
            this.f32021e0.setLayerType(2, null);
            this.f32014b0.setLayerType(2, null);
            org.telegram.ui.Components.ln lnVar = this.f32039n0;
            if (lnVar != null) {
                lnVar.setLayerType(2, null);
            }
            View view = this.m0;
            if (view != null) {
                view.setLayerType(2, null);
            }
            this.f32019d0.m(true);
            E(0.0f);
            return;
        }
        h();
        E(1.0f);
    }

    public void setAnimationsEnabled(boolean z10) {
        this.P = z10;
    }

    public void setBackgroundDelegate(a61 a61Var) {
        this.U = a61Var;
    }

    public void setDrawBackground(boolean z10) {
        this.Q0 = z10;
        this.f32011a0.setClipToOutline(z10);
        ci.r6 r6Var = this.f32014b0;
        if (!z10) {
            r6Var.setVisibility(8);
        } else {
            r6Var.setVisibility(0);
        }
    }

    public void setEnterAnimationInProgress(boolean z10) {
        if (this.T != z10) {
            this.T = z10;
            if (!z10) {
                AndroidUtilities.forEachViews((RecyclerView) this.f32028h0, (Utilities.Callback<View>) new ai.i(21));
                for (int i10 = 0; i10 < this.f32019d0.f30651b.getChildCount(); i10++) {
                    View childAt = this.f32019d0.f30651b.getChildAt(i10);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                this.f32019d0.f30651b.invalidate();
            }
        }
    }

    public void setExpireDateHint(int i10) {
        if (i10 <= 0) {
            return;
        }
        this.O0 = true;
        this.P0 = Integer.valueOf(i10);
        B(true, false, true);
    }

    public void setForUser(boolean z10) {
        this.R = z10;
        B(false, false, true);
    }

    public void setForumIconDrawable(Drawable drawable) {
        this.N = drawable;
        j61 j61Var = this.O;
        if (j61Var != null) {
            j61Var.h.setImageBitmap(drawable);
        }
    }

    public void setLongPressEnabled(boolean z10) {
        this.f32029h1 = z10;
    }

    public void setOnLongPressedListener(y61 y61Var) {
        this.H = y61Var;
    }

    public void setRecentReactions(List<zg.o0> list) {
        this.R0 = list;
        B(false, true, true);
    }

    public void setSaveState(int i10) {
        this.Y1 = Integer.valueOf(i10);
    }

    public void setSelected(Long l4) {
        HashSet hashSet = this.K;
        hashSet.clear();
        hashSet.add(l4);
        x51 x51Var = this.f32028h0;
        if (x51Var != null) {
            for (int i10 = 0; i10 < x51Var.getChildCount(); i10++) {
                if (x51Var.getChildAt(i10) instanceof j61) {
                    j61 j61Var = (j61) x51Var.getChildAt(i10);
                    org.telegram.ui.Components.z5 z5Var = j61Var.e;
                    if (z5Var != null) {
                        j61Var.d(hashSet.contains(Long.valueOf(z5Var.getDocumentId())), true);
                    } else {
                        j61Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            x51Var.invalidate();
        }
    }

    public void setSelectedReaction(zg.o0 o0Var) {
        this.J.clear();
        this.J.add(o0Var);
        x51 x51Var = this.f32028h0;
        if (x51Var != null) {
            for (int i10 = 0; i10 < x51Var.getChildCount(); i10++) {
                if (x51Var.getChildAt(i10) instanceof j61) {
                    j61 j61Var = (j61) x51Var.getChildAt(i10);
                    j61Var.d(this.J.contains(j61Var.f34671x), true);
                }
            }
            x51Var.invalidate();
        }
        n51 n51Var = this.f32030i0;
        if (n51Var != null) {
            for (int i11 = 0; i11 < n51Var.getChildCount(); i11++) {
                if (n51Var.getChildAt(i11) instanceof j61) {
                    j61 j61Var2 = (j61) n51Var.getChildAt(i11);
                    j61Var2.d(this.J.contains(j61Var2.f34671x), true);
                }
            }
            n51Var.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<zg.o0> hashSet) {
        this.J = hashSet;
        HashSet hashSet2 = this.K;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != null && ((zg.o0) arrayList.get(i10)).f49398g != 0) {
                hashSet2.add(Long.valueOf(((zg.o0) arrayList.get(i10)).f49398g));
            }
        }
    }

    public boolean u() {
        return false;
    }

    public final void v(String str, boolean z10, boolean z11) {
        long j3;
        d51 d51Var = this.I1;
        if (d51Var != null) {
            AndroidUtilities.cancelRunOnUIThread(d51Var);
            this.I1 = null;
        }
        ai.b8 b8Var = this.J1;
        if (b8Var != null) {
            AndroidUtilities.cancelRunOnUIThread(b8Var);
            this.J1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        k61 k61Var = this.f32045q0;
        r51 r51Var = this.f32024f0;
        if (isEmpty) {
            this.f32064x1 = false;
            this.f32067y1 = false;
            z(false, z10);
            if (r51Var != null) {
                r51Var.d(true);
                p61.a(r51Var, false);
            }
            k61Var.E(true);
            this.f32069z1 = null;
        } else {
            boolean z12 = this.f32064x1;
            boolean z13 = !z12;
            this.f32064x1 = true;
            this.f32067y1 = false;
            if (r51Var != null) {
                r51Var.f36412f.b(2);
            }
            if (!z12) {
                ArrayList arrayList = this.A1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = this.B1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = this.D1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                k61Var.E(false);
            } else if (!str.equals(this.f32069z1)) {
                d51 d51Var2 = new d51(this, 1);
                this.I1 = d51Var2;
                AndroidUtilities.runOnUIThread(d51Var2, 120L);
            }
            this.f32069z1 = str;
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            if (!Arrays.equals(currentKeyboardLanguage, a2)) {
                MediaDataController.getInstance(this.V).fetchNewEmojiKeywords(currentKeyboardLanguage);
            }
            a2 = currentKeyboardLanguage;
            ai.b8 b8Var2 = new ai.b8(this, str, z10, z13, currentKeyboardLanguage, 3);
            this.J1 = b8Var2;
            if (z11) {
                j3 = 425;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(b8Var2, j3);
            if (r51Var != null) {
                r51Var.f36412f.b(2);
                p61.a(r51Var, z10);
            }
        }
        C();
    }

    public final void w(float f7) {
        ValueAnimator valueAnimator = this.f32031i1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f32031i1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f32053t0.getAlpha(), f7 * 0.25f);
        this.f32031i1 = ofFloat;
        ofFloat.addUpdateListener(new c51(this, 2));
        this.f32031i1.setDuration(200L);
        this.f32031i1.setInterpolator(org.telegram.ui.Components.rr.f28031f);
        this.f32031i1.start();
    }

    public final void x(Long l4, boolean z10) {
        boolean z11;
        HashSet hashSet = this.K;
        if (!hashSet.contains(l4)) {
            hashSet.add(l4);
            z11 = true;
        } else {
            hashSet.remove(l4);
            z11 = false;
        }
        x51 x51Var = this.f32028h0;
        if (x51Var != null) {
            for (int i10 = 0; i10 < x51Var.getChildCount(); i10++) {
                if (x51Var.getChildAt(i10) instanceof j61) {
                    j61 j61Var = (j61) x51Var.getChildAt(i10);
                    org.telegram.ui.Components.z5 z5Var = j61Var.e;
                    if (z5Var != null && z5Var.getDocumentId() == l4.longValue()) {
                        j61Var.e(z11, z10);
                    } else {
                        TLRPC.Document document = j61Var.d;
                        if (document != null && document.f18342id == l4.longValue()) {
                            j61Var.e(z11, z10);
                        }
                    }
                }
            }
            x51Var.invalidate();
        }
    }

    public final void y(org.telegram.ui.Components.o5 o5Var, View view) {
        int i10;
        Integer num;
        if (o5Var != null && (num = o5Var.F) != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        this.f32037m1 = i10;
        this.f32040n1 = o5Var;
        this.f32044p1 = view;
        if (this.I && o5Var != null) {
            o5Var.f26922n = this;
        }
        invalidate();
    }

    public final void z(boolean z10, boolean z11) {
        float f7;
        if (this.F1 == z10) {
            return;
        }
        this.F1 = z10;
        x51 x51Var = this.f32028h0;
        x51Var.setVisibility(0);
        n51 n51Var = this.f32030i0;
        n51Var.setVisibility(0);
        ValueAnimator valueAnimator = this.E1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.H1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.H1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.E1 = ofFloat;
        ofFloat.addUpdateListener(new g51(this, z10, 0));
        this.E1.addListener(new t51(this, z10, 0));
        this.E1.setDuration(320L);
        this.E1.setInterpolator(org.telegram.ui.Components.rr.h);
        this.E1.start();
        ViewPropertyAnimator animate = ((View) x51Var.getParent()).animate();
        if (this.F1 && z11) {
            f7 = -AndroidUtilities.dp(36.0f);
        } else {
            f7 = 0.0f;
        }
        org.telegram.messenger.ok.s(animate.translationY(f7).setUpdateListener(new c51(this, 1)), org.telegram.ui.Components.rr.f28031f, 160L);
        if (this.F1 && z11) {
            n51Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        } else {
            n51Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        }
        h();
    }

    public a71(org.telegram.ui.ActionBar.m2 m2Var, Context context, boolean z10, Integer num, int i10, boolean z11, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        this(m2Var, context, z10, num, i10, z11, d6Var, i11, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19391v6, d6Var));
    }

    public a71(org.telegram.ui.ActionBar.m2 r41, android.content.Context r42, boolean r43, java.lang.Integer r44, int r45, boolean r46, org.telegram.ui.ActionBar.d6 r47, int r48, int r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a71.<init>(org.telegram.ui.ActionBar.m2, android.content.Context, boolean, java.lang.Integer, int, boolean, org.telegram.ui.ActionBar.d6, int, int):void");
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.J.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            this.J.add(zg.o0.b(str));
        }
        x51 x51Var = this.f32028h0;
        if (x51Var != null) {
            for (int i11 = 0; i11 < x51Var.getChildCount(); i11++) {
                if (x51Var.getChildAt(i11) instanceof j61) {
                    j61 j61Var = (j61) x51Var.getChildAt(i11);
                    j61Var.d(this.J.contains(j61Var.f34671x), true);
                }
            }
            x51Var.invalidate();
        }
    }

    public void m() {
    }

    public void q() {
    }

    public void setOnRecentClearedListener(z61 z61Var) {
    }

    @Override
    public void setPressed(boolean z10) {
    }

    public void r(j61 j61Var, zg.o0 o0Var) {
    }
}
