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
public abstract class a61 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.b6 {
    public static String[] f35601b2;
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
    public e51 G;
    public final ArrayList G0;
    public boolean G1;
    public y51 H;
    public final ArrayList H0;
    public boolean H1;
    public boolean I;
    public final ArrayList I0;
    public ValueAnimator I1;
    public HashSet J;
    public ArrayList J0;
    public c41 J1;
    public final HashSet K;
    public final ArrayList K0;
    public ci.i6 K1;
    public final Paint L;
    public ArrayList L0;
    public boolean L1;
    public final Paint M;
    public final ArrayList M0;
    public boolean M1;
    public Drawable N;
    public final boolean N0;
    public View N1;
    public j51 O;
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
    public ai.ee R1;
    public final ArrayList S;
    public j51 S0;
    public final c41 S1;
    public boolean T;
    public boolean T0;
    public final c41 T1;
    public a51 U;
    public float U0;
    public Runnable U1;
    public final int V;
    public final ImageReceiver V0;
    public ValueAnimator V1;
    public final int W;
    public org.telegram.ui.Components.p5 W0;
    public ValueAnimator W1;
    public p41 X0;
    public final AnimationNotificationsLocker X1;
    public final Integer Y0;
    public final Paint Y1;
    public final org.telegram.ui.ActionBar.g6 Z0;
    public Integer Z1;
    public int f35604a;
    public final u41 f35605a0;
    public float f35606a1;
    public int f35607b;
    public final ei.g6 f35608b0;
    public float f35609b1;
    public int f35610c;
    public final org.telegram.ui.Components.iw[] f35611c0;
    public final org.telegram.ui.ActionBar.o2 f35612c1;
    public int d;
    public org.telegram.ui.Components.iw f35613d0;
    public final int f35614d1;
    public int e;
    public final s41 f35615e0;
    public final y41 f35616e1;
    public int f35617f;
    public final r41 f35618f0;
    public int f35619f1;
    public final m41 f35620g0;
    public boolean f35621g1;
    public int h;
    public final x41 f35622h0;
    public boolean f35623h1;
    public final n41 f35624i0;
    public ValueAnimator f35625i1;
    public final FrameLayout f35626j0;
    public Drawable f35627j1;
    public final ah.v f35628k0;
    public PorterDuffColorFilter f35629k1;
    public final org.telegram.ui.Components.u9 f35630l0;
    public final boolean l1;
    public final View m0;
    public float f35631m1;
    public int f35632n;
    public final org.telegram.ui.Components.sn f35633n0;
    public int f35634n1;
    public final View f35635o0;
    public org.telegram.ui.Components.n5 f35636o1;
    public final z41 f35637p0;
    public Rect f35638p1;
    public final k51 f35639q0;
    public View f35640q1;
    public int f35641r;
    public final o41 f35642r0;
    public float f35643r1;
    public int f35644s;
    public final org.telegram.ui.Components.ol0 f35645s0;
    public j51 f35646s1;
    public final View f35647t0;
    public Rect f35648t1;
    public int f35649u0;
    public final OvershootInterpolator f35650u1;
    public int v;
    public final ArrayList f35651v0;
    public ValueAnimator f35652v1;
    public int f35653w;
    public final SparseIntArray f35654w0;
    public boolean f35655w1;
    public int f35656x;
    public final SparseIntArray f35657x0;
    public boolean f35658x1;
    public int f35659y;
    public final SparseIntArray f35660y0;
    public boolean f35661y1;
    public final SparseIntArray f35662z0;
    public boolean f35663z1;
    public static final List a2 = Arrays.asList("😖", "😫", "🫠", "😨", "❓");
    public static final boolean[] f35602c2 = new boolean[4];
    public static final HashMap f35603d2 = new HashMap();

    public a61(org.telegram.ui.ActionBar.o2 o2Var, Context context, boolean z10, Integer num, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this(o2Var, context, z10, num, i10, true, g6Var, 16);
    }

    public static void D(int i10, org.telegram.ui.Components.u9 u9Var) {
        List list;
        ImageLocation forDocument;
        String str;
        if (u9Var != null) {
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
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.k6.f21347m6, 0.2f);
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
                u9Var.setLayerNum(7);
                u9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                u9Var.l(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "36_36", svgThumb, document);
            }
        }
    }

    public static void a(a61 a61Var, int i10, int i11) {
        int i12;
        org.telegram.ui.Components.ol0 ol0Var = a61Var.f35645s0;
        o41 o41Var = a61Var.f35642r0;
        View m10 = o41Var.m(i10);
        int L0 = o41Var.L0();
        if ((m10 == null && Math.abs(i10 - L0) > 72.0f) || !SharedConfig.animationsEnabled()) {
            if (o41Var.L0() < i10) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            ol0Var.f29317b = i12;
            ol0Var.c(i10, i11, false, false);
            return;
        }
        ei.l1 l1Var = new ei.l1(a61Var, a61Var.f35622h0.getContext(), 4);
        l1Var.f46483a = i10;
        l1Var.f16207p = i11;
        o41Var.w0(l1Var);
    }

    public static boolean c(a61 a61Var) {
        if (!a61Var.T) {
            ValueAnimator valueAnimator = a61Var.V1;
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
        if (this.f35627j1 == null) {
            int i10 = this.W;
            if (i10 != 5 && i10 != 9 && i10 != 10 && i10 != 7) {
                this.f35627j1 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
            } else {
                this.f35627j1 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_filled_blocked).mutate();
            }
            this.f35627j1.setColorFilter(this.f35629k1);
        }
        return this.f35627j1;
    }

    public static ArrayList j(HashSet hashSet, ArrayList arrayList) {
        if (hashSet == null) {
            return arrayList;
        }
        int i10 = 0;
        while (i10 < arrayList.size()) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
            if (document == null || hashSet.contains(Long.valueOf(document.f20350id))) {
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
            if (document.f20350id == j10) {
                return document;
            }
        }
        return null;
    }

    public void setBigReactionAnimatedEmoji(org.telegram.ui.Components.p5 p5Var) {
        org.telegram.ui.Components.p5 p5Var2;
        if (this.I && (p5Var2 = this.W0) != p5Var) {
            if (p5Var2 != null) {
                p5Var2.o(this);
            }
            this.W0 = p5Var;
            if (p5Var != null) {
                p5Var.setColorFilter(this.f35629k1);
                this.W0.a(this);
            }
        }
    }

    public static void t(int i10) {
        boolean[] zArr = f35602c2;
        if (!zArr[i10] && MediaDataController.getInstance(i10) != null) {
            zArr[i10] = true;
            MediaDataController.getInstance(i10).checkStickers(5);
            MediaDataController.getInstance(i10).fetchEmojiStatuses(0, true);
            MediaDataController.getInstance(i10).checkReactions();
            MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
            MediaDataController.getInstance(i10).getDefaultEmojiStatuses();
            MediaDataController.getInstance(i10).checkDefaultTopicIcons();
            org.telegram.ui.Components.tx0.y3.fetch(i10, 1, new ci.g(i10, 1));
        }
    }

    public final void A(Long l4) {
        this.K.remove(l4);
        x41 x41Var = this.f35622h0;
        if (x41Var != null) {
            int i10 = 0;
            boolean z10 = false;
            for (int i11 = 0; i11 < x41Var.getChildCount(); i11++) {
                if (x41Var.getChildAt(i11) instanceof j51) {
                    j51 j51Var = (j51) x41Var.getChildAt(i11);
                    org.telegram.ui.Components.y5 y5Var = j51Var.e;
                    if (y5Var != null && y5Var.getDocumentId() == l4.longValue()) {
                        j51Var.f();
                    } else {
                        TLRPC.Document document = j51Var.d;
                        if (document != null && document.f20350id == l4.longValue()) {
                            j51Var.f();
                        }
                    }
                    z10 = true;
                }
            }
            x41Var.invalidate();
            if (!z10) {
                while (true) {
                    ArrayList arrayList = this.f35651v0;
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
                z41 z41Var = this.f35637p0;
                if (z41Var != null) {
                    z41Var.m(i10);
                }
            }
        }
    }

    public final void B(boolean r40, boolean r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a61.B(boolean, boolean, boolean):void");
    }

    public final void C() {
        r41 r41Var = this.f35618f0;
        if (r41Var == null) {
            return;
        }
        if (this.f35663z1) {
            r41Var.clearAnimation();
            r41Var.setVisibility(0);
            r41Var.animate().translationY(0.0f).start();
            return;
        }
        x41 x41Var = this.f35622h0;
        if (x41Var.getChildCount() > 0) {
            View childAt = x41Var.getChildAt(0);
            if (RecyclerView.R(childAt) == this.f35604a && "searchbox".equals(childAt.getTag())) {
                r41Var.setVisibility(0);
                r41Var.setTranslationY(childAt.getY());
                return;
            }
            r41Var.setTranslationY(-AndroidUtilities.dp(52.0f));
            return;
        }
        r41Var.setTranslationY(-AndroidUtilities.dp(52.0f));
    }

    public final void E(float f7) {
        int i10;
        int i11 = -1;
        View view = this.m0;
        if (view != null) {
            float interpolation = org.telegram.ui.Components.zr.f33338g.getInterpolation(w7.r.a((((f7 * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            if (n()) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            view.setScaleY(interpolation * i10);
        }
        org.telegram.ui.Components.sn snVar = this.f35633n0;
        if (snVar != null) {
            float a10 = w7.r.a((((f7 * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            snVar.setAlpha(a10);
            snVar.setScaleX(a10);
            if (!n()) {
                i11 = 1;
            }
            snVar.setScaleY(a10 * i11);
        }
        float f10 = 800.0f * f7;
        float f11 = f10 - 40.0f;
        float a11 = w7.r.a(f11 / 700.0f, 0.0f, 1.0f);
        float a12 = w7.r.a((f10 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a13 = w7.r.a(f11 / 750.0f, 0.0f, 1.0f);
        float a14 = w7.r.a((f10 - 30.0f) / 120.0f, 0.0f, 1.0f);
        org.telegram.ui.Components.zr zrVar = org.telegram.ui.Components.zr.h;
        float interpolation2 = zrVar.getInterpolation(a11);
        float interpolation3 = zrVar.getInterpolation(a12);
        this.f35608b0.setAlpha(a14);
        this.f35618f0.setAlpha(a14);
        int i12 = 0;
        for (int i13 = 0; i13 < this.f35613d0.f28979b.getChildCount(); i13++) {
            this.f35613d0.f28979b.getChildAt(i13).setAlpha(a14);
        }
        if (this.f35636o1 != null) {
            invalidate();
        }
        float f12 = 1.0f - a14;
        u41 u41Var = this.f35605a0;
        u41Var.setTranslationY(AndroidUtilities.dp(-5.0f) * f12);
        if (snVar != null) {
            snVar.setTranslationY(AndroidUtilities.dp(-5.0f) * f12);
        }
        this.f35606a1 = (interpolation2 * 0.85f) + 0.15f;
        this.f35609b1 = (interpolation3 * 0.925f) + 0.075f;
        u41Var.invalidateOutline();
        if (snVar != null) {
            snVar.setAlpha(a14);
        }
        s41 s41Var = this.f35615e0;
        s41Var.setAlpha(a14);
        s41Var.setScaleX(Math.min(this.f35606a1, 1.0f));
        float pivotX = s41Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(u41Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(u41Var.getHeight(), 2.0d) + Math.pow(u41Var.getWidth() - pivotX, 2.0d)));
        for (int i14 = 0; i14 < this.f35613d0.f28979b.getChildCount(); i14++) {
            View childAt = this.f35613d0.f28979b.getChildAt(i14);
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
            float cascade = AndroidUtilities.cascade(a13, (float) Math.sqrt(com.google.android.gms.internal.play_billing.k3.t(height, height, 0.4f, width * width)), sqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(cascade)) {
                cascade = 0.0f;
            }
            childAt.setScaleX(cascade);
            childAt.setScaleY(cascade);
        }
        while (true) {
            x41 x41Var = this.f35622h0;
            if (i12 < x41Var.getChildCount()) {
                View childAt2 = x41Var.getChildAt(i12);
                if (childAt2 instanceof j51) {
                    j51 j51Var = (j51) childAt2;
                    float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                    float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                    if (n()) {
                        height2 = getMeasuredHeight() - height2;
                    }
                    float cascade2 = AndroidUtilities.cascade(a13, (float) Math.sqrt(com.google.android.gms.internal.play_billing.k3.t(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                    if (Float.isNaN(cascade2)) {
                        cascade2 = 0.0f;
                    }
                    j51Var.setAnimatedScale(cascade2);
                }
                i12++;
            } else {
                this.f35628k0.invalidate();
                x41Var.invalidate();
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
        c41 c41Var = this.T1;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.Q)) {
                AndroidUtilities.cancelRunOnUIThread(c41Var);
                AndroidUtilities.runOnUIThread(c41Var);
            }
        } else if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(c41Var);
            AndroidUtilities.runOnUIThread(c41Var);
        } else if (i10 == NotificationCenter.recentEmojiStatusesUpdate) {
            AndroidUtilities.cancelRunOnUIThread(c41Var);
            AndroidUtilities.runOnUIThread(c41Var);
        } else if (i10 == NotificationCenter.groupStickersDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(c41Var);
            AndroidUtilities.runOnUIThread(c41Var);
        } else if (i10 == NotificationCenter.emojiLoaded) {
            ci.e eVar = new ci.e(5);
            x41 x41Var = this.f35622h0;
            AndroidUtilities.forEachViews((RecyclerView) x41Var, (Utilities.Callback<View>) eVar);
            if (x41Var != null) {
                x41Var.invalidate();
            }
        } else if (i10 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == UserConfig.getInstance(this.V).getClientUserId()) {
            AndroidUtilities.cancelRunOnUIThread(c41Var);
            AndroidUtilities.runOnUIThread(c41Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        float scaleY;
        int i10;
        float f7;
        float measuredHeight;
        org.telegram.ui.Components.n5 n5Var = this.f35636o1;
        if (n5Var != null && (num = this.Y0) != null) {
            Rect bounds = n5Var.getBounds();
            View view = this.f35640q1;
            if (view == null) {
                scaleY = 1.0f;
            } else {
                scaleY = view.getScaleY();
            }
            int alpha = this.f35636o1.getAlpha();
            View view2 = this.f35640q1;
            if (view2 == null) {
                bounds.height();
            } else {
                view2.getHeight();
            }
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f35636o1.v = (int) (Math.pow(this.f35605a0.getAlpha(), 0.25d) * alpha * this.f35631m1);
            if (this.f35638p1 == null) {
                this.f35638p1 = new Rect();
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
            float y3 = com.google.android.gms.internal.play_billing.k3.y(scaleY, 1.0f, bounds.centerY(), -f7);
            boolean n10 = n();
            int i11 = this.f35614d1;
            if (!n10) {
                measuredHeight = AndroidUtilities.dp(i11);
            } else {
                measuredHeight = getMeasuredHeight() - (AndroidUtilities.dp(i11) / 2.0f);
            }
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + y3 + measuredHeight;
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.f35638p1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            org.telegram.ui.Components.n5 n5Var2 = this.f35636o1;
            Rect rect = this.f35638p1;
            int i12 = rect.left;
            Rect rect2 = this.f35638p1;
            n5Var2.setBounds(i12, rect.top, (int) ((rect.width() / scaleY) + i12), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.f35638p1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.f35636o1.draw(canvas);
            org.telegram.ui.Components.n5 n5Var3 = this.f35636o1;
            n5Var3.v = alpha;
            n5Var3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        j51 j51Var = this.f35646s1;
        if (j51Var != null && this.f35648t1 != null && j51Var.E != null) {
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f35646s1.E.setAlpha((int) (this.f35643r1 * 255.0f));
            this.f35646s1.E.setBounds(this.f35648t1);
            this.f35646s1.E.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - this.f35631m1, this.f35619f1, this.f35634n1), PorterDuff.Mode.SRC_IN));
            this.f35646s1.E.draw(canvas);
            canvas.restore();
        }
    }

    public final long f() {
        return Math.max(450L, Math.min(55, this.P1 - this.O1) * 30);
    }

    public final long g() {
        return Math.max(300L, Math.min(45, this.P1 - this.O1) * 25) + f() + 16;
    }

    public ai.ee getCollectionParticles() {
        if (this.R1 == null) {
            this.R1 = new ai.ee(1, 8);
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
            view = this.f35624i0;
        } else {
            view = this.f35622h0;
        }
        boolean canScrollVertically = view.canScrollVertically(1);
        if (canScrollVertically != this.f35655w1) {
            this.f35655w1 = canScrollVertically;
            ViewPropertyAnimator animate = this.f35635o0.animate();
            if (canScrollVertically) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            org.telegram.messenger.tl.s(animate, f7, 200L);
        }
    }

    public final void i(int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a61.i(int, android.view.View):void");
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

    public final void o(android.view.View r15, org.telegram.ui.Components.y5 r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a61.o(android.view.View, org.telegram.ui.Components.y5):void");
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
        org.telegram.ui.Components.n5 n5Var = this.f35636o1;
        if (n5Var != null) {
            n5Var.f28783n = this;
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
        org.telegram.ui.Components.n5 n5Var = this.f35636o1;
        if (n5Var != null) {
            n5Var.f28783n = null;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && this.W == 6) {
            this.f35642r0.y1((getMeasuredWidth() / AndroidUtilities.dp(42.0f)) * 5);
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

    public final void s(q51 q51Var) {
        Integer num = this.Z1;
        if (num != null) {
            Parcelable parcelable = (Parcelable) f35603d2.get(num);
        }
        this.U1 = q51Var;
        boolean z10 = this.Q0;
        x41 x41Var = this.f35622h0;
        if (!z10) {
            h();
            for (int i10 = 0; i10 < x41Var.getChildCount(); i10++) {
                View childAt = x41Var.getChildAt(i10);
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
            ofFloat.addUpdateListener(new b41(this, 0));
            this.V1.addListener(new v70(this, 26));
            c41 c41Var = new c41(this, 0);
            ah.x0.f904f = true;
            ah.x0.e = true;
            ah.x0.f905g = false;
            if (ah.x0.d) {
                ah.x0.d = false;
            }
            ah.x0.f903c = c41Var;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.X1.lock();
            this.V1.setDuration(800L);
            x41Var.setLayerType(2, null);
            this.f35618f0.setLayerType(2, null);
            this.f35615e0.setLayerType(2, null);
            this.f35608b0.setLayerType(2, null);
            org.telegram.ui.Components.sn snVar = this.f35633n0;
            if (snVar != null) {
                snVar.setLayerType(2, null);
            }
            View view = this.m0;
            if (view != null) {
                view.setLayerType(2, null);
            }
            this.f35613d0.m(true);
            E(0.0f);
            return;
        }
        h();
        E(1.0f);
    }

    public void setAnimationsEnabled(boolean z10) {
        this.P = z10;
    }

    public void setBackgroundDelegate(a51 a51Var) {
        this.U = a51Var;
    }

    public void setDrawBackground(boolean z10) {
        this.Q0 = z10;
        this.f35605a0.setClipToOutline(z10);
        ei.g6 g6Var = this.f35608b0;
        if (!z10) {
            g6Var.setVisibility(8);
        } else {
            g6Var.setVisibility(0);
        }
    }

    public void setEnterAnimationInProgress(boolean z10) {
        if (this.T != z10) {
            this.T = z10;
            if (!z10) {
                AndroidUtilities.forEachViews((RecyclerView) this.f35622h0, (Utilities.Callback<View>) new ci.e(21));
                for (int i10 = 0; i10 < this.f35613d0.f28979b.getChildCount(); i10++) {
                    View childAt = this.f35613d0.f28979b.getChildAt(i10);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                this.f35613d0.f28979b.invalidate();
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
        j51 j51Var = this.O;
        if (j51Var != null) {
            j51Var.h.setImageBitmap(drawable);
        }
    }

    public void setLongPressEnabled(boolean z10) {
        this.f35623h1 = z10;
    }

    public void setOnLongPressedListener(y51 y51Var) {
        this.H = y51Var;
    }

    public void setRecentReactions(List<ah.i1> list) {
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
        x41 x41Var = this.f35622h0;
        if (x41Var != null) {
            for (int i10 = 0; i10 < x41Var.getChildCount(); i10++) {
                if (x41Var.getChildAt(i10) instanceof j51) {
                    j51 j51Var = (j51) x41Var.getChildAt(i10);
                    org.telegram.ui.Components.y5 y5Var = j51Var.e;
                    if (y5Var != null) {
                        j51Var.d(hashSet.contains(Long.valueOf(y5Var.getDocumentId())), true);
                    } else {
                        j51Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            x41Var.invalidate();
        }
    }

    public void setSelectedReaction(ah.i1 i1Var) {
        this.J.clear();
        this.J.add(i1Var);
        x41 x41Var = this.f35622h0;
        if (x41Var != null) {
            for (int i10 = 0; i10 < x41Var.getChildCount(); i10++) {
                if (x41Var.getChildAt(i10) instanceof j51) {
                    j51 j51Var = (j51) x41Var.getChildAt(i10);
                    j51Var.d(this.J.contains(j51Var.f38470x), true);
                }
            }
            x41Var.invalidate();
        }
        n41 n41Var = this.f35624i0;
        if (n41Var != null) {
            for (int i11 = 0; i11 < n41Var.getChildCount(); i11++) {
                if (n41Var.getChildAt(i11) instanceof j51) {
                    j51 j51Var2 = (j51) n41Var.getChildAt(i11);
                    j51Var2.d(this.J.contains(j51Var2.f38470x), true);
                }
            }
            n41Var.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<ah.i1> hashSet) {
        this.J = hashSet;
        HashSet hashSet2 = this.K;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != null && ((ah.i1) arrayList.get(i10)).f785g != 0) {
                hashSet2.add(Long.valueOf(((ah.i1) arrayList.get(i10)).f785g));
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
            if (!this.l1 || (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21517v6, this.Z0)) == this.f35619f1) {
                return;
            }
            this.f35619f1 = w02;
            this.M.setColor(i0.a.o(w02, 30));
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.f35619f1, PorterDuff.Mode.SRC_IN);
            this.f35629k1 = porterDuffColorFilter;
            org.telegram.ui.Components.p5 p5Var = this.W0;
            if (p5Var != null) {
                p5Var.setColorFilter(porterDuffColorFilter);
            }
            x41 x41Var = this.f35622h0;
            if (x41Var != null) {
                x41Var.invalidate();
            }
            n41 n41Var = this.f35624i0;
            if (n41Var != null) {
                n41Var.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void v(String str, boolean z10, boolean z11) {
        long j10;
        c41 c41Var = this.J1;
        if (c41Var != null) {
            AndroidUtilities.cancelRunOnUIThread(c41Var);
            this.J1 = null;
        }
        ci.i6 i6Var = this.K1;
        if (i6Var != null) {
            AndroidUtilities.cancelRunOnUIThread(i6Var);
            this.K1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        k51 k51Var = this.f35639q0;
        r41 r41Var = this.f35618f0;
        if (isEmpty) {
            this.f35661y1 = false;
            this.f35663z1 = false;
            z(false, z10);
            if (r41Var != null) {
                r41Var.d(true);
                p51.a(r41Var, false);
            }
            k51Var.E(true);
            this.A1 = null;
        } else {
            boolean z12 = this.f35661y1;
            boolean z13 = !z12;
            this.f35661y1 = true;
            this.f35663z1 = false;
            if (r41Var != null) {
                r41Var.f40338f.b(2);
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
                k51Var.E(false);
            } else if (!str.equals(this.A1)) {
                c41 c41Var2 = new c41(this, 1);
                this.J1 = c41Var2;
                AndroidUtilities.runOnUIThread(c41Var2, 120L);
            }
            this.A1 = str;
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            if (!Arrays.equals(currentKeyboardLanguage, f35601b2)) {
                MediaDataController.getInstance(this.V).fetchNewEmojiKeywords(currentKeyboardLanguage);
            }
            f35601b2 = currentKeyboardLanguage;
            ci.i6 i6Var2 = new ci.i6(this, str, z10, z13, currentKeyboardLanguage, 4);
            this.K1 = i6Var2;
            if (z11) {
                j10 = 425;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(i6Var2, j10);
            if (r41Var != null) {
                r41Var.f40338f.b(2);
                p51.a(r41Var, z10);
            }
        }
        C();
    }

    public final void w(float f7) {
        ValueAnimator valueAnimator = this.f35625i1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f35625i1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f35647t0.getAlpha(), f7 * 0.25f);
        this.f35625i1 = ofFloat;
        ofFloat.addUpdateListener(new b41(this, 2));
        this.f35625i1.setDuration(200L);
        this.f35625i1.setInterpolator(org.telegram.ui.Components.zr.f33337f);
        this.f35625i1.start();
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
        x41 x41Var = this.f35622h0;
        if (x41Var != null) {
            for (int i10 = 0; i10 < x41Var.getChildCount(); i10++) {
                if (x41Var.getChildAt(i10) instanceof j51) {
                    j51 j51Var = (j51) x41Var.getChildAt(i10);
                    org.telegram.ui.Components.y5 y5Var = j51Var.e;
                    if (y5Var != null && y5Var.getDocumentId() == l4.longValue()) {
                        j51Var.e(z11, z10);
                    } else {
                        TLRPC.Document document = j51Var.d;
                        if (document != null && document.f20350id == l4.longValue()) {
                            j51Var.e(z11, z10);
                        }
                    }
                }
            }
            x41Var.invalidate();
        }
    }

    public final void y(org.telegram.ui.Components.n5 n5Var, View view) {
        int i10;
        Integer num;
        if (n5Var != null && (num = n5Var.F) != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        this.f35634n1 = i10;
        this.f35636o1 = n5Var;
        this.f35640q1 = view;
        if (this.I && n5Var != null) {
            n5Var.f28783n = this;
        }
        invalidate();
    }

    public final void z(boolean z10, boolean z11) {
        float f7;
        if (this.G1 == z10) {
            return;
        }
        this.G1 = z10;
        x41 x41Var = this.f35622h0;
        x41Var.setVisibility(0);
        n41 n41Var = this.f35624i0;
        n41Var.setVisibility(0);
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
        ofFloat.addUpdateListener(new f41(this, z10, 0));
        this.F1.addListener(new t41(this, z10, 0));
        this.F1.setDuration(320L);
        this.F1.setInterpolator(org.telegram.ui.Components.zr.h);
        this.F1.start();
        ViewPropertyAnimator animate = ((View) x41Var.getParent()).animate();
        if (this.G1 && z11) {
            f7 = -AndroidUtilities.dp(36.0f);
        } else {
            f7 = 0.0f;
        }
        org.telegram.messenger.tl.t(animate.translationY(f7).setUpdateListener(new b41(this, 1)), org.telegram.ui.Components.zr.f33337f, 160L);
        if (this.G1 && z11) {
            n41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        } else {
            n41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        }
        h();
    }

    public a61(org.telegram.ui.ActionBar.o2 o2Var, Context context, boolean z10, Integer num, int i10, boolean z11, org.telegram.ui.ActionBar.g6 g6Var, int i11) {
        this(o2Var, context, z10, num, i10, z11, g6Var, i11, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21517v6, g6Var));
    }

    public a61(org.telegram.ui.ActionBar.o2 r42, android.content.Context r43, boolean r44, java.lang.Integer r45, int r46, boolean r47, org.telegram.ui.ActionBar.g6 r48, int r49, int r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a61.<init>(org.telegram.ui.ActionBar.o2, android.content.Context, boolean, java.lang.Integer, int, boolean, org.telegram.ui.ActionBar.g6, int, int):void");
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.J.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            this.J.add(ah.i1.b(str));
        }
        x41 x41Var = this.f35622h0;
        if (x41Var != null) {
            for (int i11 = 0; i11 < x41Var.getChildCount(); i11++) {
                if (x41Var.getChildAt(i11) instanceof j51) {
                    j51 j51Var = (j51) x41Var.getChildAt(i11);
                    j51Var.d(this.J.contains(j51Var.f38470x), true);
                }
            }
            x41Var.invalidate();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
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

    public void r(j51 j51Var, ah.i1 i1Var) {
    }
}
