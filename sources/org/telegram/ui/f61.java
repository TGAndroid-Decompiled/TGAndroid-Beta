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
import org.telegram.messenger.FileLog;
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
public abstract class f61 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.p6 {
    public static String[] f39181b2;
    public final ArrayList A0;
    public String A1;
    public final ArrayList B0;
    public ArrayList B1;
    public boolean C0;
    public ArrayList C1;
    public final ArrayList D0;
    public ArrayList D1;
    public int E;
    public final ArrayList E0;
    public ArrayList E1;
    public int F;
    public final ArrayList F0;
    public ValueAnimator F1;
    public j51 G;
    public final ArrayList G0;
    public boolean G1;
    public d61 H;
    public final ArrayList H0;
    public boolean H1;
    public boolean I;
    public final ArrayList I0;
    public ValueAnimator I1;
    public HashSet J;
    public ArrayList J0;
    public h41 J1;
    public final HashSet K;
    public final ArrayList K0;
    public di.i6 K1;
    public final Paint L;
    public ArrayList L0;
    public boolean L1;
    public final Paint M;
    public final ArrayList M0;
    public boolean M1;
    public Drawable N;
    public final boolean N0;
    public View N1;
    public o51 O;
    public boolean O0;
    public int O1;
    public boolean P;
    public Integer P0;
    public int P1;
    public boolean Q;
    public boolean Q0;
    public long Q1;
    public boolean R;
    public List R0;
    public bi.td R1;
    public final ArrayList S;
    public o51 S0;
    public final h41 S1;
    public boolean T;
    public boolean T0;
    public final h41 T1;
    public f51 U;
    public float U0;
    public Runnable U1;
    public final int V;
    public final ImageReceiver V0;
    public ValueAnimator V1;
    public final int W;
    public org.telegram.ui.Components.t5 W0;
    public ValueAnimator W1;
    public u41 X0;
    public final AnimationNotificationsLocker X1;
    public final Integer Y0;
    public final Paint Y1;
    public final org.telegram.ui.ActionBar.u6 Z0;
    public Integer Z1;
    public int f39184a;
    public final z41 f39185a0;
    public float f39186a1;
    public int f39187b;
    public final fi.f6 f39188b0;
    public float f39189b1;
    public int f39190c;
    public final org.telegram.ui.Components.kw[] f39191c0;
    public final org.telegram.ui.ActionBar.r2 f39192c1;
    public int d;
    public org.telegram.ui.Components.kw f39193d0;
    public final int f39194d1;
    public int e;
    public final x41 f39195e0;
    public final d51 f39196e1;
    public int f39197f;
    public final w41 f39198f0;
    public int f39199f1;
    public final r41 f39200g0;
    public boolean f39201g1;
    public int h;
    public final c51 f39202h0;
    public boolean f39203h1;
    public final s41 f39204i0;
    public ValueAnimator f39205i1;
    public final FrameLayout f39206j0;
    public Drawable f39207j1;
    public final bh.p f39208k0;
    public PorterDuffColorFilter f39209k1;
    public final org.telegram.ui.Components.y9 f39210l0;
    public final boolean l1;
    public final View m0;
    public float f39211m1;
    public int f39212n;
    public final org.telegram.ui.Components.vn f39213n0;
    public int f39214n1;
    public final View f39215o0;
    public org.telegram.ui.Components.r5 f39216o1;
    public final e51 f39217p0;
    public Rect f39218p1;
    public final p51 f39219q0;
    public View f39220q1;
    public int f39221r;
    public final t41 f39222r0;
    public float f39223r1;
    public int f39224s;
    public final org.telegram.ui.Components.ql0 f39225s0;
    public o51 f39226s1;
    public final View f39227t0;
    public Rect f39228t1;
    public int f39229u0;
    public final OvershootInterpolator f39230u1;
    public int v;
    public final ArrayList f39231v0;
    public ValueAnimator f39232v1;
    public int f39233w;
    public final SparseIntArray f39234w0;
    public boolean f39235w1;
    public int f39236x;
    public final SparseIntArray f39237x0;
    public boolean f39238x1;
    public int f39239y;
    public final SparseIntArray f39240y0;
    public boolean f39241y1;
    public final SparseIntArray f39242z0;
    public boolean f39243z1;
    public static final List a2 = Arrays.asList("😖", "😫", "🫠", "😨", "❓");
    public static final boolean[] f39182c2 = new boolean[4];
    public static final HashMap f39183d2 = new HashMap();

    public f61(org.telegram.ui.ActionBar.r2 r2Var, Context context, boolean z10, Integer num, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        this(r2Var, context, z10, num, i10, true, u6Var, 16);
    }

    public static void D(int i10, org.telegram.ui.Components.y9 y9Var) {
        List list;
        ImageLocation forDocument;
        String str;
        if (y9Var != null) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(i10).getFeaturedEmojiSets());
            Collections.shuffle(arrayList);
            int round = (int) Math.round(Math.random() * 10.0d);
            TLRPC.Document document = null;
            int i11 = 0;
            while (true) {
                int size = arrayList.size();
                list = a2;
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
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.y6.f23521m6, 0.2f);
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
                y9Var.setLayerNum(7);
                y9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                y9Var.l(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "36_36", svgThumb, document);
            }
        }
    }

    public static void a(f61 f61Var, int i10, int i11) {
        int i12;
        org.telegram.ui.Components.ql0 ql0Var = f61Var.f39225s0;
        t41 t41Var = f61Var.f39222r0;
        View m10 = t41Var.m(i10);
        int L0 = t41Var.L0();
        if ((m10 == null && Math.abs(i10 - L0) > 72.0f) || !SharedConfig.animationsEnabled()) {
            if (t41Var.L0() < i10) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            ql0Var.f31934b = i12;
            ql0Var.c(i10, i11, false, false);
            return;
        }
        fi.k1 k1Var = new fi.k1(f61Var, f61Var.f39202h0.getContext(), 4);
        k1Var.f47715a = i10;
        k1Var.f18555p = i11;
        t41Var.w0(k1Var);
    }

    public static boolean c(f61 f61Var) {
        if (!f61Var.T) {
            ValueAnimator valueAnimator = f61Var.V1;
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
                return org.telegram.ui.Components.t5.g();
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
        if (this.f39207j1 == null) {
            int i10 = this.W;
            if (i10 != 5 && i10 != 9 && i10 != 10 && i10 != 7) {
                this.f39207j1 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
            } else {
                this.f39207j1 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_filled_blocked).mutate();
            }
            this.f39207j1.setColorFilter(this.f39209k1);
        }
        return this.f39207j1;
    }

    public static ArrayList j(HashSet hashSet, ArrayList arrayList) {
        if (hashSet == null) {
            return arrayList;
        }
        int i10 = 0;
        while (i10 < arrayList.size()) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
            if (document == null || hashSet.contains(Long.valueOf(document.f22034id))) {
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
            if (document.f22034id == j10) {
                return document;
            }
        }
        return null;
    }

    public void setBigReactionAnimatedEmoji(org.telegram.ui.Components.t5 t5Var) {
        org.telegram.ui.Components.t5 t5Var2;
        if (this.I && (t5Var2 = this.W0) != t5Var) {
            if (t5Var2 != null) {
                t5Var2.o(this);
            }
            this.W0 = t5Var;
            if (t5Var != null) {
                t5Var.setColorFilter(this.f39209k1);
                this.W0.a(this);
            }
        }
    }

    public static void t(int i10) {
        boolean[] zArr = f39182c2;
        if (!zArr[i10] && MediaDataController.getInstance(i10) != null) {
            zArr[i10] = true;
            MediaDataController.getInstance(i10).checkStickers(5);
            MediaDataController.getInstance(i10).fetchEmojiStatuses(0, true);
            MediaDataController.getInstance(i10).checkReactions();
            MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
            MediaDataController.getInstance(i10).getDefaultEmojiStatuses();
            MediaDataController.getInstance(i10).checkDefaultTopicIcons();
            org.telegram.ui.Components.cy0.F3.fetch(i10, 1, new di.g(i10, 1));
        }
    }

    public final void A(Long l4) {
        this.K.remove(l4);
        c51 c51Var = this.f39202h0;
        if (c51Var != null) {
            int i10 = 0;
            boolean z10 = false;
            for (int i11 = 0; i11 < c51Var.getChildCount(); i11++) {
                if (c51Var.getChildAt(i11) instanceof o51) {
                    o51 o51Var = (o51) c51Var.getChildAt(i11);
                    org.telegram.ui.Components.c6 c6Var = o51Var.e;
                    if (c6Var != null && c6Var.getDocumentId() == l4.longValue()) {
                        o51Var.f();
                    } else {
                        TLRPC.Document document = o51Var.d;
                        if (document != null && document.f22034id == l4.longValue()) {
                            o51Var.f();
                        }
                    }
                    z10 = true;
                }
            }
            c51Var.invalidate();
            if (!z10) {
                while (true) {
                    ArrayList arrayList = this.f39231v0;
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
                e51 e51Var = this.f39217p0;
                if (e51Var != null) {
                    e51Var.m(i10);
                }
            }
        }
    }

    public final void B(boolean r40, boolean r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f61.B(boolean, boolean, boolean):void");
    }

    public final void C() {
        w41 w41Var = this.f39198f0;
        if (w41Var == null) {
            return;
        }
        if (this.f39243z1) {
            w41Var.clearAnimation();
            w41Var.setVisibility(0);
            w41Var.animate().translationY(0.0f).start();
            return;
        }
        c51 c51Var = this.f39202h0;
        if (c51Var.getChildCount() > 0) {
            View childAt = c51Var.getChildAt(0);
            if (RecyclerView.R(childAt) == this.f39184a && "searchbox".equals(childAt.getTag())) {
                w41Var.setVisibility(0);
                w41Var.setTranslationY(childAt.getY());
                return;
            }
            w41Var.setTranslationY(-AndroidUtilities.dp(52.0f));
            return;
        }
        w41Var.setTranslationY(-AndroidUtilities.dp(52.0f));
    }

    public final void E(float f7) {
        int i10;
        int i11 = -1;
        View view = this.m0;
        if (view != null) {
            float interpolation = org.telegram.ui.Components.ds.f27531g.getInterpolation(a8.ee.a((((f7 * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            if (n()) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            view.setScaleY(interpolation * i10);
        }
        org.telegram.ui.Components.vn vnVar = this.f39213n0;
        if (vnVar != null) {
            float a10 = a8.ee.a((((f7 * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            vnVar.setAlpha(a10);
            vnVar.setScaleX(a10);
            if (!n()) {
                i11 = 1;
            }
            vnVar.setScaleY(a10 * i11);
        }
        float f10 = 800.0f * f7;
        float f11 = f10 - 40.0f;
        float a11 = a8.ee.a(f11 / 700.0f, 0.0f, 1.0f);
        float a12 = a8.ee.a((f10 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a13 = a8.ee.a(f11 / 750.0f, 0.0f, 1.0f);
        float a14 = a8.ee.a((f10 - 30.0f) / 120.0f, 0.0f, 1.0f);
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        float interpolation2 = dsVar.getInterpolation(a11);
        float interpolation3 = dsVar.getInterpolation(a12);
        this.f39188b0.setAlpha(a14);
        this.f39198f0.setAlpha(a14);
        int i12 = 0;
        for (int i13 = 0; i13 < this.f39193d0.f33435b.getChildCount(); i13++) {
            this.f39193d0.f33435b.getChildAt(i13).setAlpha(a14);
        }
        if (this.f39216o1 != null) {
            invalidate();
        }
        float f12 = 1.0f - a14;
        z41 z41Var = this.f39185a0;
        z41Var.setTranslationY(AndroidUtilities.dp(-5.0f) * f12);
        if (vnVar != null) {
            vnVar.setTranslationY(AndroidUtilities.dp(-5.0f) * f12);
        }
        this.f39186a1 = (interpolation2 * 0.85f) + 0.15f;
        this.f39189b1 = (interpolation3 * 0.925f) + 0.075f;
        z41Var.invalidateOutline();
        if (vnVar != null) {
            vnVar.setAlpha(a14);
        }
        x41 x41Var = this.f39195e0;
        x41Var.setAlpha(a14);
        x41Var.setScaleX(Math.min(this.f39186a1, 1.0f));
        float pivotX = x41Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(z41Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(z41Var.getHeight(), 2.0d) + Math.pow(z41Var.getWidth() - pivotX, 2.0d)));
        for (int i14 = 0; i14 < this.f39193d0.f33435b.getChildCount(); i14++) {
            View childAt = this.f39193d0.f33435b.getChildAt(i14);
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
            float cascade = AndroidUtilities.cascade(a13, (float) Math.sqrt(c3.h0.u(height, height, 0.4f, width * width)), sqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(cascade)) {
                cascade = 0.0f;
            }
            childAt.setScaleX(cascade);
            childAt.setScaleY(cascade);
        }
        while (true) {
            c51 c51Var = this.f39202h0;
            if (i12 < c51Var.getChildCount()) {
                View childAt2 = c51Var.getChildAt(i12);
                if (childAt2 instanceof o51) {
                    o51 o51Var = (o51) childAt2;
                    float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                    float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                    if (n()) {
                        height2 = getMeasuredHeight() - height2;
                    }
                    float cascade2 = AndroidUtilities.cascade(a13, (float) Math.sqrt(c3.h0.u(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                    if (Float.isNaN(cascade2)) {
                        cascade2 = 0.0f;
                    }
                    o51Var.setAnimatedScale(cascade2);
                }
                i12++;
            } else {
                this.f39208k0.invalidate();
                c51Var.invalidate();
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
        h41 h41Var = this.T1;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.Q)) {
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
            di.e eVar = new di.e(5);
            c51 c51Var = this.f39202h0;
            AndroidUtilities.forEachViews((RecyclerView) c51Var, (Utilities.Callback<View>) eVar);
            if (c51Var != null) {
                c51Var.invalidate();
            }
        } else if (i10 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == UserConfig.getInstance(this.V).getClientUserId()) {
            AndroidUtilities.cancelRunOnUIThread(h41Var);
            AndroidUtilities.runOnUIThread(h41Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        float scaleY;
        int i10;
        float f7;
        float measuredHeight;
        org.telegram.ui.Components.r5 r5Var = this.f39216o1;
        if (r5Var != null && (num = this.Y0) != null) {
            Rect bounds = r5Var.getBounds();
            View view = this.f39220q1;
            if (view == null) {
                scaleY = 1.0f;
            } else {
                scaleY = view.getScaleY();
            }
            int alpha = this.f39216o1.getAlpha();
            View view2 = this.f39220q1;
            if (view2 == null) {
                bounds.height();
            } else {
                view2.getHeight();
            }
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f39216o1.v = (int) (Math.pow(this.f39185a0.getAlpha(), 0.25d) * alpha * this.f39211m1);
            if (this.f39218p1 == null) {
                this.f39218p1 = new Rect();
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
            float z10 = c3.h0.z(scaleY, 1.0f, bounds.centerY(), -f7);
            boolean n10 = n();
            int i11 = this.f39194d1;
            if (!n10) {
                measuredHeight = AndroidUtilities.dp(i11);
            } else {
                measuredHeight = getMeasuredHeight() - (AndroidUtilities.dp(i11) / 2.0f);
            }
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + z10 + measuredHeight;
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.f39218p1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            org.telegram.ui.Components.r5 r5Var2 = this.f39216o1;
            Rect rect = this.f39218p1;
            int i12 = rect.left;
            Rect rect2 = this.f39218p1;
            r5Var2.setBounds(i12, rect.top, (int) ((rect.width() / scaleY) + i12), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.f39218p1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.f39216o1.draw(canvas);
            org.telegram.ui.Components.r5 r5Var3 = this.f39216o1;
            r5Var3.v = alpha;
            r5Var3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        o51 o51Var = this.f39226s1;
        if (o51Var != null && this.f39228t1 != null && o51Var.E != null) {
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f39226s1.E.setAlpha((int) (this.f39223r1 * 255.0f));
            this.f39226s1.E.setBounds(this.f39228t1);
            this.f39226s1.E.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - this.f39211m1, this.f39199f1, this.f39214n1), PorterDuff.Mode.SRC_IN));
            this.f39226s1.E.draw(canvas);
            canvas.restore();
        }
    }

    public final long f() {
        return Math.max(450L, Math.min(55, this.P1 - this.O1) * 30);
    }

    public final long g() {
        return Math.max(300L, Math.min(45, this.P1 - this.O1) * 25) + f() + 16;
    }

    public bi.td getCollectionParticles() {
        if (this.R1 == null) {
            this.R1 = new bi.td(1, 8);
        }
        return this.R1;
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
        if (this.G1) {
            view = this.f39204i0;
        } else {
            view = this.f39202h0;
        }
        boolean canScrollVertically = view.canScrollVertically(1);
        if (canScrollVertically != this.f39235w1) {
            this.f39235w1 = canScrollVertically;
            ViewPropertyAnimator animate = this.f39215o0.animate();
            if (canScrollVertically) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            org.telegram.messenger.wh.p(animate, f7, 200L);
        }
    }

    public final void i(int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f61.i(int, android.view.View):void");
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
            String s10 = a1.g.s(sb2, str, "usehint");
            int i11 = MessagesController.getGlobalMainSettings().getInt(s10, 0);
            if (i11 <= 3) {
                MessagesController.getGlobalMainSettings().edit().putInt(s10, i11 + 1).apply();
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

    public final void o(android.view.View r15, org.telegram.ui.Components.c6 r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f61.o(android.view.View, org.telegram.ui.Components.c6):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        int i10 = this.V;
        NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.featuredEmojiDidLoad);
        NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.groupStickersDidLoad);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.emojiLoaded);
        int i11 = this.W;
        if (i11 == 0 || i11 == 12) {
            NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.starUserGiftsLoaded);
        }
        org.telegram.ui.Components.r5 r5Var = this.f39216o1;
        if (r5Var != null) {
            r5Var.f32124n = this;
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
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        }
        org.telegram.ui.Components.r5 r5Var = this.f39216o1;
        if (r5Var != null) {
            r5Var.f32124n = null;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && this.W == 6) {
            this.f39222r0.z1((getMeasuredWidth() / AndroidUtilities.dp(42.0f)) * 5);
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

    public final void s(v51 v51Var) {
        Integer num = this.Z1;
        if (num != null) {
            Parcelable parcelable = (Parcelable) f39183d2.get(num);
        }
        this.U1 = v51Var;
        boolean z10 = this.Q0;
        c51 c51Var = this.f39202h0;
        if (!z10) {
            h();
            for (int i10 = 0; i10 < c51Var.getChildCount(); i10++) {
                View childAt = c51Var.getChildAt(i10);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
            }
            return;
        }
        ValueAnimator valueAnimator = this.V1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.V1 = null;
        }
        ValueAnimator valueAnimator2 = this.W1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.W1 = null;
        }
        int i11 = this.W;
        if (i11 != 3 && i11 != 4 && i11 != 6) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.V1 = ofFloat;
            ofFloat.addUpdateListener(new g41(this, 0));
            this.V1.addListener(new k50(this, 28));
            h41 h41Var = new h41(this, 0);
            bh.m0.f4084f = true;
            bh.m0.e = true;
            bh.m0.f4085g = false;
            if (bh.m0.d) {
                bh.m0.d = false;
            }
            bh.m0.f4083c = h41Var;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.X1.lock();
            this.V1.setDuration(800L);
            c51Var.setLayerType(2, null);
            this.f39198f0.setLayerType(2, null);
            this.f39195e0.setLayerType(2, null);
            this.f39188b0.setLayerType(2, null);
            org.telegram.ui.Components.vn vnVar = this.f39213n0;
            if (vnVar != null) {
                vnVar.setLayerType(2, null);
            }
            View view = this.m0;
            if (view != null) {
                view.setLayerType(2, null);
            }
            this.f39193d0.m(true);
            E(0.0f);
            return;
        }
        h();
        E(1.0f);
    }

    public void setAnimationsEnabled(boolean z10) {
        this.P = z10;
    }

    public void setBackgroundDelegate(f51 f51Var) {
        this.U = f51Var;
    }

    public void setDrawBackground(boolean z10) {
        this.Q0 = z10;
        this.f39185a0.setClipToOutline(z10);
        fi.f6 f6Var = this.f39188b0;
        if (!z10) {
            f6Var.setVisibility(8);
        } else {
            f6Var.setVisibility(0);
        }
    }

    public void setEnterAnimationInProgress(boolean z10) {
        if (this.T != z10) {
            this.T = z10;
            if (!z10) {
                AndroidUtilities.forEachViews((RecyclerView) this.f39202h0, (Utilities.Callback<View>) new di.e(21));
                for (int i10 = 0; i10 < this.f39193d0.f33435b.getChildCount(); i10++) {
                    View childAt = this.f39193d0.f33435b.getChildAt(i10);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                this.f39193d0.f33435b.invalidate();
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
        o51 o51Var = this.O;
        if (o51Var != null) {
            o51Var.h.setImageBitmap(drawable);
        }
    }

    public void setLongPressEnabled(boolean z10) {
        this.f39203h1 = z10;
    }

    public void setOnLongPressedListener(d61 d61Var) {
        this.H = d61Var;
    }

    public void setRecentReactions(List<bh.x0> list) {
        this.R0 = list;
        B(false, true, true);
    }

    public void setSaveState(int i10) {
        this.Z1 = Integer.valueOf(i10);
    }

    public void setSelected(Long l4) {
        HashSet hashSet = this.K;
        hashSet.clear();
        hashSet.add(l4);
        c51 c51Var = this.f39202h0;
        if (c51Var != null) {
            for (int i10 = 0; i10 < c51Var.getChildCount(); i10++) {
                if (c51Var.getChildAt(i10) instanceof o51) {
                    o51 o51Var = (o51) c51Var.getChildAt(i10);
                    org.telegram.ui.Components.c6 c6Var = o51Var.e;
                    if (c6Var != null) {
                        o51Var.d(hashSet.contains(Long.valueOf(c6Var.getDocumentId())), true);
                    } else {
                        o51Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            c51Var.invalidate();
        }
    }

    public void setSelectedReaction(bh.x0 x0Var) {
        this.J.clear();
        this.J.add(x0Var);
        c51 c51Var = this.f39202h0;
        if (c51Var != null) {
            for (int i10 = 0; i10 < c51Var.getChildCount(); i10++) {
                if (c51Var.getChildAt(i10) instanceof o51) {
                    o51 o51Var = (o51) c51Var.getChildAt(i10);
                    o51Var.d(this.J.contains(o51Var.f41982x), true);
                }
            }
            c51Var.invalidate();
        }
        s41 s41Var = this.f39204i0;
        if (s41Var != null) {
            for (int i11 = 0; i11 < s41Var.getChildCount(); i11++) {
                if (s41Var.getChildAt(i11) instanceof o51) {
                    o51 o51Var2 = (o51) s41Var.getChildAt(i11);
                    o51Var2.d(this.J.contains(o51Var2.f41982x), true);
                }
            }
            s41Var.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<bh.x0> hashSet) {
        this.J = hashSet;
        HashSet hashSet2 = this.K;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != null && ((bh.x0) arrayList.get(i10)).f4209g != 0) {
                hashSet2.add(Long.valueOf(((bh.x0) arrayList.get(i10)).f4209g));
            }
        }
    }

    public boolean u() {
        return false;
    }

    @Override
    public final void updateColors() {
        int w02;
        try {
            if (!this.l1 || (w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23693v6, this.Z0)) == this.f39199f1) {
                return;
            }
            this.f39199f1 = w02;
            this.M.setColor(i0.a.o(w02, 30));
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.f39199f1, PorterDuff.Mode.SRC_IN);
            this.f39209k1 = porterDuffColorFilter;
            org.telegram.ui.Components.t5 t5Var = this.W0;
            if (t5Var != null) {
                t5Var.setColorFilter(porterDuffColorFilter);
            }
            c51 c51Var = this.f39202h0;
            if (c51Var != null) {
                c51Var.invalidate();
            }
            s41 s41Var = this.f39204i0;
            if (s41Var != null) {
                s41Var.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void v(String str, boolean z10, boolean z11) {
        long j10;
        h41 h41Var = this.J1;
        if (h41Var != null) {
            AndroidUtilities.cancelRunOnUIThread(h41Var);
            this.J1 = null;
        }
        di.i6 i6Var = this.K1;
        if (i6Var != null) {
            AndroidUtilities.cancelRunOnUIThread(i6Var);
            this.K1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        p51 p51Var = this.f39219q0;
        w41 w41Var = this.f39198f0;
        if (isEmpty) {
            this.f39241y1 = false;
            this.f39243z1 = false;
            z(false, z10);
            if (w41Var != null) {
                w41Var.d(true);
                u51.a(w41Var, false);
            }
            p51Var.E(true);
            this.A1 = null;
        } else {
            boolean z12 = this.f39241y1;
            boolean z13 = !z12;
            this.f39241y1 = true;
            this.f39243z1 = false;
            if (w41Var != null) {
                w41Var.f43882f.b(2);
            }
            if (!z12) {
                ArrayList arrayList = this.B1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = this.C1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = this.E1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                p51Var.E(false);
            } else if (!str.equals(this.A1)) {
                h41 h41Var2 = new h41(this, 1);
                this.J1 = h41Var2;
                AndroidUtilities.runOnUIThread(h41Var2, 120L);
            }
            this.A1 = str;
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            if (!Arrays.equals(currentKeyboardLanguage, f39181b2)) {
                MediaDataController.getInstance(this.V).fetchNewEmojiKeywords(currentKeyboardLanguage);
            }
            f39181b2 = currentKeyboardLanguage;
            di.i6 i6Var2 = new di.i6(this, str, z10, z13, currentKeyboardLanguage, 4);
            this.K1 = i6Var2;
            if (z11) {
                j10 = 425;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(i6Var2, j10);
            if (w41Var != null) {
                w41Var.f43882f.b(2);
                u51.a(w41Var, z10);
            }
        }
        C();
    }

    public final void w(float f7) {
        ValueAnimator valueAnimator = this.f39205i1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f39205i1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f39227t0.getAlpha(), f7 * 0.25f);
        this.f39205i1 = ofFloat;
        ofFloat.addUpdateListener(new g41(this, 2));
        this.f39205i1.setDuration(200L);
        this.f39205i1.setInterpolator(org.telegram.ui.Components.ds.f27530f);
        this.f39205i1.start();
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
        c51 c51Var = this.f39202h0;
        if (c51Var != null) {
            for (int i10 = 0; i10 < c51Var.getChildCount(); i10++) {
                if (c51Var.getChildAt(i10) instanceof o51) {
                    o51 o51Var = (o51) c51Var.getChildAt(i10);
                    org.telegram.ui.Components.c6 c6Var = o51Var.e;
                    if (c6Var != null && c6Var.getDocumentId() == l4.longValue()) {
                        o51Var.e(z11, z10);
                    } else {
                        TLRPC.Document document = o51Var.d;
                        if (document != null && document.f22034id == l4.longValue()) {
                            o51Var.e(z11, z10);
                        }
                    }
                }
            }
            c51Var.invalidate();
        }
    }

    public final void y(org.telegram.ui.Components.r5 r5Var, View view) {
        int i10;
        Integer num;
        if (r5Var != null && (num = r5Var.F) != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        this.f39214n1 = i10;
        this.f39216o1 = r5Var;
        this.f39220q1 = view;
        if (this.I && r5Var != null) {
            r5Var.f32124n = this;
        }
        invalidate();
    }

    public final void z(boolean z10, boolean z11) {
        float f7;
        if (this.G1 == z10) {
            return;
        }
        this.G1 = z10;
        c51 c51Var = this.f39202h0;
        c51Var.setVisibility(0);
        s41 s41Var = this.f39204i0;
        s41Var.setVisibility(0);
        ValueAnimator valueAnimator = this.F1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.I1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.I1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.F1 = ofFloat;
        ofFloat.addUpdateListener(new k41(this, z10, 0));
        this.F1.addListener(new y41(this, z10, 0));
        this.F1.setDuration(320L);
        this.F1.setInterpolator(org.telegram.ui.Components.ds.h);
        this.F1.start();
        ViewPropertyAnimator animate = ((View) c51Var.getParent()).animate();
        if (this.G1 && z11) {
            f7 = -AndroidUtilities.dp(36.0f);
        } else {
            f7 = 0.0f;
        }
        org.telegram.messenger.wh.q(animate.translationY(f7).setUpdateListener(new g41(this, 1)), org.telegram.ui.Components.ds.f27530f, 160L);
        if (this.G1 && z11) {
            s41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        } else {
            s41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        }
        h();
    }

    public f61(org.telegram.ui.ActionBar.r2 r2Var, Context context, boolean z10, Integer num, int i10, boolean z11, org.telegram.ui.ActionBar.u6 u6Var, int i11) {
        this(r2Var, context, z10, num, i10, z11, u6Var, i11, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23693v6, u6Var));
    }

    public f61(org.telegram.ui.ActionBar.r2 r42, android.content.Context r43, boolean r44, java.lang.Integer r45, int r46, boolean r47, org.telegram.ui.ActionBar.u6 r48, int r49, int r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f61.<init>(org.telegram.ui.ActionBar.r2, android.content.Context, boolean, java.lang.Integer, int, boolean, org.telegram.ui.ActionBar.u6, int, int):void");
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.J.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            this.J.add(bh.x0.b(str));
        }
        c51 c51Var = this.f39202h0;
        if (c51Var != null) {
            for (int i11 = 0; i11 < c51Var.getChildCount(); i11++) {
                if (c51Var.getChildAt(i11) instanceof o51) {
                    o51 o51Var = (o51) c51Var.getChildAt(i11);
                    o51Var.d(this.J.contains(o51Var.f41982x), true);
                }
            }
            c51Var.invalidate();
        }
    }

    public void m() {
    }

    public void q() {
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setOnRecentClearedListener(e61 e61Var) {
    }

    @Override
    public void setPressed(boolean z10) {
    }

    public void r(o51 o51Var, bh.x0 x0Var) {
    }
}
