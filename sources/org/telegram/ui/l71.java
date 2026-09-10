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
public abstract class l71 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    public p61 G;
    public final ArrayList G0;
    public boolean G1;
    public j71 H;
    public final ArrayList H0;
    public ValueAnimator H1;
    public boolean I;
    public final ArrayList I0;
    public p51 I1;
    public HashSet J;
    public ArrayList J0;
    public og.p0 J1;
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
    public u61 O;
    public boolean O0;
    public int O1;
    public boolean P;
    public Integer P0;
    public long P1;
    public boolean Q;
    public boolean Q0;
    public xh.l8 Q1;
    public boolean R;
    public List R0;
    public final p51 R1;
    public final ArrayList S;
    public u61 S0;
    public final p51 S1;
    public boolean T;
    public boolean T0;
    public Runnable T1;
    public l61 U;
    public float U0;
    public ValueAnimator U1;
    public final int V;
    public final ImageReceiver V0;
    public ValueAnimator V1;
    public final int W;
    public org.telegram.ui.Components.p5 W0;
    public final AnimationNotificationsLocker W1;
    public a61 X0;
    public final Paint X1;
    public final Integer Y0;
    public Integer Y1;
    public final org.telegram.ui.ActionBar.f6 Z0;
    public int f34552a;
    public final f61 f34553a0;
    public float f34554a1;
    public int f34555b;
    public final bi.s7 f34556b0;
    public float f34557b1;
    public int f34558c;
    public final org.telegram.ui.Components.gw[] f34559c0;
    public final org.telegram.ui.ActionBar.p2 f34560c1;
    public int d;
    public org.telegram.ui.Components.gw f34561d0;
    public final int f34562d1;
    public int e;
    public final d61 f34563e0;
    public final j61 f34564e1;
    public int f34565f;
    public final c61 f34566f0;
    public final int f34567f1;
    public final bi.l4 f34568g0;
    public boolean f34569g1;
    public int h;
    public final i61 f34570h0;
    public boolean f34571h1;
    public final y51 f34572i0;
    public ValueAnimator f34573i1;
    public final FrameLayout f34574j0;
    public Drawable f34575j1;
    public final bi.n7 f34576k0;
    public final PorterDuffColorFilter f34577k1;
    public final org.telegram.ui.Components.w9 f34578l0;
    public float l1;
    public final View m0;
    public int f34579m1;
    public int f34580n;
    public final org.telegram.ui.Components.qn f34581n0;
    public org.telegram.ui.Components.n5 f34582n1;
    public final View f34583o0;
    public Rect f34584o1;
    public final k61 f34585p0;
    public View f34586p1;
    public final v61 f34587q0;
    public float f34588q1;
    public int f34589r;
    public final z51 f34590r0;
    public u61 f34591r1;
    public int f34592s;
    public final org.telegram.ui.Components.yk0 f34593s0;
    public Rect f34594s1;
    public final View f34595t0;
    public final OvershootInterpolator f34596t1;
    public int f34597u0;
    public ValueAnimator f34598u1;
    public int v;
    public final ArrayList f34599v0;
    public boolean f34600v1;
    public int f34601w;
    public final SparseIntArray f34602w0;
    public boolean f34603w1;
    public int f34604x;
    public final SparseIntArray f34605x0;
    public boolean f34606x1;
    public int f34607y;
    public final SparseIntArray f34608y0;
    public boolean f34609y1;
    public final SparseIntArray f34610z0;
    public String f34611z1;
    public static final List Z1 = Arrays.asList("😖", "😫", "🫠", "😨", "❓");
    public static final boolean[] f34550b2 = new boolean[4];
    public static final HashMap f34551c2 = new HashMap();

    public l71(org.telegram.ui.ActionBar.p2 p2Var, Context context, boolean z10, Integer num, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this(p2Var, context, z10, num, i10, true, f6Var, 16);
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
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.f18091m6, 0.2f);
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

    public static void a(l71 l71Var, int i10, int i11) {
        int i12;
        org.telegram.ui.Components.yk0 yk0Var = l71Var.f34593s0;
        z51 z51Var = l71Var.f34590r0;
        View m10 = z51Var.m(i10);
        int L0 = z51Var.L0();
        if ((m10 == null && Math.abs(i10 - L0) > 72.0f) || !SharedConfig.animationsEnabled()) {
            if (z51Var.L0() < i10) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            yk0Var.f29444b = i12;
            yk0Var.c(i10, i11, false, false);
            return;
        }
        bi.t1 t1Var = new bi.t1(l71Var, l71Var.f34570h0.getContext(), 4);
        t1Var.f41760a = i10;
        t1Var.f10694p = i11;
        z51Var.w0(t1Var);
    }

    public static boolean c(l71 l71Var) {
        if (!l71Var.T) {
            ValueAnimator valueAnimator = l71Var.U1;
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
        if (this.f34575j1 == null) {
            int i10 = this.W;
            if (i10 != 5 && i10 != 9 && i10 != 10 && i10 != 7) {
                this.f34575j1 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
            } else {
                this.f34575j1 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_filled_blocked).mutate();
            }
            this.f34575j1.setColorFilter(this.f34577k1);
        }
        return this.f34575j1;
    }

    public static ArrayList j(HashSet hashSet, ArrayList arrayList) {
        if (hashSet == null) {
            return arrayList;
        }
        int i10 = 0;
        while (i10 < arrayList.size()) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
            if (document == null || hashSet.contains(Long.valueOf(document.f17201id))) {
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
            if (document.f17201id == j3) {
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
                p5Var.setColorFilter(this.f34577k1);
                this.W0.a(this);
            }
        }
    }

    public static void t(final int i10) {
        boolean[] zArr = f34550b2;
        if (!zArr[i10] && MediaDataController.getInstance(i10) != null) {
            zArr[i10] = true;
            MediaDataController.getInstance(i10).checkStickers(5);
            MediaDataController.getInstance(i10).fetchEmojiStatuses(0, true);
            MediaDataController.getInstance(i10).checkReactions();
            MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
            MediaDataController.getInstance(i10).getDefaultEmojiStatuses();
            MediaDataController.getInstance(i10).checkDefaultTopicIcons();
            org.telegram.ui.Components.hx0.f23776x3.fetch(i10, 1, new Utilities.Callback() {
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

    public final void A(Long l4) {
        this.K.remove(l4);
        i61 i61Var = this.f34570h0;
        if (i61Var != null) {
            int i10 = 0;
            boolean z10 = false;
            for (int i11 = 0; i11 < i61Var.getChildCount(); i11++) {
                if (i61Var.getChildAt(i11) instanceof u61) {
                    u61 u61Var = (u61) i61Var.getChildAt(i11);
                    org.telegram.ui.Components.y5 y5Var = u61Var.e;
                    if (y5Var != null && y5Var.getDocumentId() == l4.longValue()) {
                        u61Var.f();
                    } else {
                        TLRPC.Document document = u61Var.d;
                        if (document != null && document.f17201id == l4.longValue()) {
                            u61Var.f();
                        }
                    }
                    z10 = true;
                }
            }
            i61Var.invalidate();
            if (!z10) {
                while (true) {
                    ArrayList arrayList = this.f34599v0;
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
                k61 k61Var = this.f34585p0;
                if (k61Var != null) {
                    k61Var.m(i10);
                }
            }
        }
    }

    public final void B(boolean r40, boolean r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l71.B(boolean, boolean, boolean):void");
    }

    public final void C() {
        c61 c61Var = this.f34566f0;
        if (c61Var == null) {
            return;
        }
        if (this.f34609y1) {
            c61Var.clearAnimation();
            c61Var.setVisibility(0);
            c61Var.animate().translationY(0.0f).start();
            return;
        }
        i61 i61Var = this.f34570h0;
        if (i61Var.getChildCount() > 0) {
            View childAt = i61Var.getChildAt(0);
            if (RecyclerView.R(childAt) == this.f34552a && "searchbox".equals(childAt.getTag())) {
                c61Var.setVisibility(0);
                c61Var.setTranslationY(childAt.getY());
                return;
            }
            c61Var.setTranslationY(-AndroidUtilities.dp(52.0f));
            return;
        }
        c61Var.setTranslationY(-AndroidUtilities.dp(52.0f));
    }

    public final void E(float f7) {
        int i10;
        int i11 = -1;
        View view = this.m0;
        if (view != null) {
            float interpolation = org.telegram.ui.Components.wr.f28820g.getInterpolation(w7.q.a((((f7 * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            if (n()) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            view.setScaleY(interpolation * i10);
        }
        org.telegram.ui.Components.qn qnVar = this.f34581n0;
        if (qnVar != null) {
            float a10 = w7.q.a((((f7 * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            qnVar.setAlpha(a10);
            qnVar.setScaleX(a10);
            if (!n()) {
                i11 = 1;
            }
            qnVar.setScaleY(a10 * i11);
        }
        float f10 = 800.0f * f7;
        float f11 = f10 - 40.0f;
        float a11 = w7.q.a(f11 / 700.0f, 0.0f, 1.0f);
        float a12 = w7.q.a((f10 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a13 = w7.q.a(f11 / 750.0f, 0.0f, 1.0f);
        float a14 = w7.q.a((f10 - 30.0f) / 120.0f, 0.0f, 1.0f);
        org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.h;
        float interpolation2 = wrVar.getInterpolation(a11);
        float interpolation3 = wrVar.getInterpolation(a12);
        this.f34556b0.setAlpha(a14);
        this.f34566f0.setAlpha(a14);
        int i12 = 0;
        for (int i13 = 0; i13 < this.f34561d0.f28802b.getChildCount(); i13++) {
            this.f34561d0.f28802b.getChildAt(i13).setAlpha(a14);
        }
        if (this.f34582n1 != null) {
            invalidate();
        }
        float f12 = 1.0f - a14;
        f61 f61Var = this.f34553a0;
        f61Var.setTranslationY(AndroidUtilities.dp(-5.0f) * f12);
        if (qnVar != null) {
            qnVar.setTranslationY(AndroidUtilities.dp(-5.0f) * f12);
        }
        this.f34554a1 = (interpolation2 * 0.85f) + 0.15f;
        this.f34557b1 = (interpolation3 * 0.925f) + 0.075f;
        f61Var.invalidateOutline();
        if (qnVar != null) {
            qnVar.setAlpha(a14);
        }
        d61 d61Var = this.f34563e0;
        d61Var.setAlpha(a14);
        d61Var.setScaleX(Math.min(this.f34554a1, 1.0f));
        float pivotX = d61Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(f61Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(f61Var.getHeight(), 2.0d) + Math.pow(f61Var.getWidth() - pivotX, 2.0d)));
        for (int i14 = 0; i14 < this.f34561d0.f28802b.getChildCount(); i14++) {
            View childAt = this.f34561d0.f28802b.getChildAt(i14);
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
            i61 i61Var = this.f34570h0;
            if (i12 < i61Var.getChildCount()) {
                View childAt2 = i61Var.getChildAt(i12);
                if (childAt2 instanceof u61) {
                    u61 u61Var = (u61) childAt2;
                    float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                    float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                    if (n()) {
                        height2 = getMeasuredHeight() - height2;
                    }
                    float cascade2 = AndroidUtilities.cascade(a13, (float) Math.sqrt(com.google.android.gms.internal.vision.e2.x(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                    if (Float.isNaN(cascade2)) {
                        cascade2 = 0.0f;
                    }
                    u61Var.setAnimatedScale(cascade2);
                }
                i12++;
            } else {
                this.f34576k0.invalidate();
                i61Var.invalidate();
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
        p51 p51Var = this.S1;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.Q)) {
                AndroidUtilities.cancelRunOnUIThread(p51Var);
                AndroidUtilities.runOnUIThread(p51Var);
            }
        } else if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(p51Var);
            AndroidUtilities.runOnUIThread(p51Var);
        } else if (i10 == NotificationCenter.recentEmojiStatusesUpdate) {
            AndroidUtilities.cancelRunOnUIThread(p51Var);
            AndroidUtilities.runOnUIThread(p51Var);
        } else if (i10 == NotificationCenter.groupStickersDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(p51Var);
            AndroidUtilities.runOnUIThread(p51Var);
        } else if (i10 == NotificationCenter.emojiLoaded) {
            gg.g0 g0Var = new gg.g0(2);
            i61 i61Var = this.f34570h0;
            AndroidUtilities.forEachViews((RecyclerView) i61Var, (e2.h) g0Var);
            if (i61Var != null) {
                i61Var.invalidate();
            }
        } else if (i10 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == UserConfig.getInstance(this.V).getClientUserId()) {
            AndroidUtilities.cancelRunOnUIThread(p51Var);
            AndroidUtilities.runOnUIThread(p51Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        float scaleY;
        int i10;
        float f7;
        float measuredHeight;
        org.telegram.ui.Components.n5 n5Var = this.f34582n1;
        if (n5Var != null && (num = this.Y0) != null) {
            Rect bounds = n5Var.getBounds();
            View view = this.f34586p1;
            if (view == null) {
                scaleY = 1.0f;
            } else {
                scaleY = view.getScaleY();
            }
            int alpha = this.f34582n1.getAlpha();
            View view2 = this.f34586p1;
            if (view2 == null) {
                bounds.height();
            } else {
                view2.getHeight();
            }
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f34582n1.v = (int) (Math.pow(this.f34553a0.getAlpha(), 0.25d) * alpha * this.l1);
            if (this.f34584o1 == null) {
                this.f34584o1 = new Rect();
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
            int i11 = this.f34562d1;
            if (!n10) {
                measuredHeight = AndroidUtilities.dp(i11);
            } else {
                measuredHeight = getMeasuredHeight() - (AndroidUtilities.dp(i11) / 2.0f);
            }
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + z10 + measuredHeight;
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.f34584o1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            org.telegram.ui.Components.n5 n5Var2 = this.f34582n1;
            Rect rect = this.f34584o1;
            int i12 = rect.left;
            Rect rect2 = this.f34584o1;
            n5Var2.setBounds(i12, rect.top, (int) ((rect.width() / scaleY) + i12), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.f34584o1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.f34582n1.draw(canvas);
            org.telegram.ui.Components.n5 n5Var3 = this.f34582n1;
            n5Var3.v = alpha;
            n5Var3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        u61 u61Var = this.f34591r1;
        if (u61Var != null && this.f34594s1 != null && u61Var.E != null) {
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f34591r1.E.setAlpha((int) (this.f34588q1 * 255.0f));
            this.f34591r1.E.setBounds(this.f34594s1);
            this.f34591r1.E.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - this.l1, this.f34567f1, this.f34579m1), PorterDuff.Mode.SRC_IN));
            this.f34591r1.E.draw(canvas);
            canvas.restore();
        }
    }

    public final long f() {
        return Math.max(450L, Math.min(55, this.O1 - this.N1) * 30);
    }

    public final long g() {
        return Math.max(300L, Math.min(45, this.O1 - this.N1) * 25) + f() + 16;
    }

    public xh.l8 getCollectionParticles() {
        if (this.Q1 == null) {
            this.Q1 = new xh.l8(1, 8);
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
            view = this.f34572i0;
        } else {
            view = this.f34570h0;
        }
        boolean canScrollVertically = view.canScrollVertically(1);
        if (canScrollVertically != this.f34600v1) {
            this.f34600v1 = canScrollVertically;
            ViewPropertyAnimator animate = this.f34583o0.animate();
            if (canScrollVertically) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animate.alpha(f7).setDuration(200L).start();
        }
    }

    public final void i(int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l71.i(int, android.view.View):void");
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
            String s10 = a4.a.s(sb2, str, "usehint");
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

    public final void o(android.view.View r14, org.telegram.ui.Components.y5 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l71.o(android.view.View, org.telegram.ui.Components.y5):void");
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
        org.telegram.ui.Components.n5 n5Var = this.f34582n1;
        if (n5Var != null) {
            n5Var.f25413n = this;
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
        org.telegram.ui.Components.n5 n5Var = this.f34582n1;
        if (n5Var != null) {
            n5Var.f25413n = null;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && this.W == 6) {
            this.f34590r0.y1((getMeasuredWidth() / AndroidUtilities.dp(42.0f)) * 5);
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

    public final void s(b71 b71Var) {
        Integer num = this.Y1;
        if (num != null) {
            Parcelable parcelable = (Parcelable) f34551c2.get(num);
        }
        this.T1 = b71Var;
        boolean z10 = this.Q0;
        i61 i61Var = this.f34570h0;
        if (!z10) {
            h();
            for (int i10 = 0; i10 < i61Var.getChildCount(); i10++) {
                View childAt = i61Var.getChildAt(i10);
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
            ofFloat.addUpdateListener(new o51(this, 0));
            this.U1.addListener(new mv0(this, 10));
            p51 p51Var = new p51(this, 0);
            yg.f0.f46998f = true;
            yg.f0.e = true;
            yg.f0.f46999g = false;
            if (yg.f0.d) {
                yg.f0.d = false;
            }
            yg.f0.f46997c = p51Var;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.W1.lock();
            this.U1.setDuration(800L);
            i61Var.setLayerType(2, null);
            this.f34566f0.setLayerType(2, null);
            this.f34563e0.setLayerType(2, null);
            this.f34556b0.setLayerType(2, null);
            org.telegram.ui.Components.qn qnVar = this.f34581n0;
            if (qnVar != null) {
                qnVar.setLayerType(2, null);
            }
            View view = this.m0;
            if (view != null) {
                view.setLayerType(2, null);
            }
            this.f34561d0.m(true);
            E(0.0f);
            return;
        }
        h();
        E(1.0f);
    }

    public void setAnimationsEnabled(boolean z10) {
        this.P = z10;
    }

    public void setBackgroundDelegate(l61 l61Var) {
        this.U = l61Var;
    }

    public void setDrawBackground(boolean z10) {
        this.Q0 = z10;
        this.f34553a0.setClipToOutline(z10);
        bi.s7 s7Var = this.f34556b0;
        if (!z10) {
            s7Var.setVisibility(8);
        } else {
            s7Var.setVisibility(0);
        }
    }

    public void setEnterAnimationInProgress(boolean z10) {
        if (this.T != z10) {
            this.T = z10;
            if (!z10) {
                AndroidUtilities.forEachViews((RecyclerView) this.f34570h0, (e2.h) new gg.g0(26));
                for (int i10 = 0; i10 < this.f34561d0.f28802b.getChildCount(); i10++) {
                    View childAt = this.f34561d0.f28802b.getChildAt(i10);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                this.f34561d0.f28802b.invalidate();
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
        u61 u61Var = this.O;
        if (u61Var != null) {
            u61Var.h.setImageBitmap(drawable);
        }
    }

    public void setLongPressEnabled(boolean z10) {
        this.f34571h1 = z10;
    }

    public void setOnLongPressedListener(j71 j71Var) {
        this.H = j71Var;
    }

    public void setRecentReactions(List<yg.p0> list) {
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
        i61 i61Var = this.f34570h0;
        if (i61Var != null) {
            for (int i10 = 0; i10 < i61Var.getChildCount(); i10++) {
                if (i61Var.getChildAt(i10) instanceof u61) {
                    u61 u61Var = (u61) i61Var.getChildAt(i10);
                    org.telegram.ui.Components.y5 y5Var = u61Var.e;
                    if (y5Var != null) {
                        u61Var.d(hashSet.contains(Long.valueOf(y5Var.getDocumentId())), true);
                    } else {
                        u61Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            i61Var.invalidate();
        }
    }

    public void setSelectedReaction(yg.p0 p0Var) {
        this.J.clear();
        this.J.add(p0Var);
        i61 i61Var = this.f34570h0;
        if (i61Var != null) {
            for (int i10 = 0; i10 < i61Var.getChildCount(); i10++) {
                if (i61Var.getChildAt(i10) instanceof u61) {
                    u61 u61Var = (u61) i61Var.getChildAt(i10);
                    u61Var.d(this.J.contains(u61Var.f37135x), true);
                }
            }
            i61Var.invalidate();
        }
        y51 y51Var = this.f34572i0;
        if (y51Var != null) {
            for (int i11 = 0; i11 < y51Var.getChildCount(); i11++) {
                if (y51Var.getChildAt(i11) instanceof u61) {
                    u61 u61Var2 = (u61) y51Var.getChildAt(i11);
                    u61Var2.d(this.J.contains(u61Var2.f37135x), true);
                }
            }
            y51Var.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<yg.p0> hashSet) {
        this.J = hashSet;
        HashSet hashSet2 = this.K;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != null && ((yg.p0) arrayList.get(i10)).f47102g != 0) {
                hashSet2.add(Long.valueOf(((yg.p0) arrayList.get(i10)).f47102g));
            }
        }
    }

    public boolean u() {
        return false;
    }

    public final void v(String str, boolean z10, boolean z11) {
        long j3;
        p51 p51Var = this.I1;
        if (p51Var != null) {
            AndroidUtilities.cancelRunOnUIThread(p51Var);
            this.I1 = null;
        }
        og.p0 p0Var = this.J1;
        if (p0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(p0Var);
            this.J1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        v61 v61Var = this.f34587q0;
        c61 c61Var = this.f34566f0;
        if (isEmpty) {
            this.f34606x1 = false;
            this.f34609y1 = false;
            z(false, z10);
            if (c61Var != null) {
                c61Var.d(true);
                a71.a(c61Var, false);
            }
            v61Var.E(true);
            this.f34611z1 = null;
        } else {
            boolean z12 = this.f34606x1;
            boolean z13 = !z12;
            this.f34606x1 = true;
            this.f34609y1 = false;
            if (c61Var != null) {
                c61Var.f30815f.b(2);
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
                v61Var.E(false);
            } else if (!str.equals(this.f34611z1)) {
                p51 p51Var2 = new p51(this, 1);
                this.I1 = p51Var2;
                AndroidUtilities.runOnUIThread(p51Var2, 120L);
            }
            this.f34611z1 = str;
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            if (!Arrays.equals(currentKeyboardLanguage, a2)) {
                MediaDataController.getInstance(this.V).fetchNewEmojiKeywords(currentKeyboardLanguage);
            }
            a2 = currentKeyboardLanguage;
            og.p0 p0Var2 = new og.p0(3, this, str, currentKeyboardLanguage, z10, z13);
            this.J1 = p0Var2;
            if (z11) {
                j3 = 425;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(p0Var2, j3);
            if (c61Var != null) {
                c61Var.f30815f.b(2);
                a71.a(c61Var, z10);
            }
        }
        C();
    }

    public final void w(float f7) {
        ValueAnimator valueAnimator = this.f34573i1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f34573i1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f34595t0.getAlpha(), f7 * 0.25f);
        this.f34573i1 = ofFloat;
        ofFloat.addUpdateListener(new o51(this, 2));
        this.f34573i1.setDuration(200L);
        this.f34573i1.setInterpolator(org.telegram.ui.Components.wr.f28819f);
        this.f34573i1.start();
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
        i61 i61Var = this.f34570h0;
        if (i61Var != null) {
            for (int i10 = 0; i10 < i61Var.getChildCount(); i10++) {
                if (i61Var.getChildAt(i10) instanceof u61) {
                    u61 u61Var = (u61) i61Var.getChildAt(i10);
                    org.telegram.ui.Components.y5 y5Var = u61Var.e;
                    if (y5Var != null && y5Var.getDocumentId() == l4.longValue()) {
                        u61Var.e(z11, z10);
                    } else {
                        TLRPC.Document document = u61Var.d;
                        if (document != null && document.f17201id == l4.longValue()) {
                            u61Var.e(z11, z10);
                        }
                    }
                }
            }
            i61Var.invalidate();
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
        this.f34579m1 = i10;
        this.f34582n1 = n5Var;
        this.f34586p1 = view;
        if (this.I && n5Var != null) {
            n5Var.f25413n = this;
        }
        invalidate();
    }

    public final void z(boolean z10, boolean z11) {
        float f7;
        if (this.F1 == z10) {
            return;
        }
        this.F1 = z10;
        i61 i61Var = this.f34570h0;
        i61Var.setVisibility(0);
        y51 y51Var = this.f34572i0;
        y51Var.setVisibility(0);
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
        ofFloat.addUpdateListener(new s51(this, z10, 0));
        this.E1.addListener(new e61(this, z10, 0));
        this.E1.setDuration(320L);
        this.E1.setInterpolator(org.telegram.ui.Components.wr.h);
        this.E1.start();
        ViewPropertyAnimator animate = ((View) i61Var.getParent()).animate();
        if (this.F1 && z11) {
            f7 = -AndroidUtilities.dp(36.0f);
        } else {
            f7 = 0.0f;
        }
        org.telegram.messenger.em.q(animate.translationY(f7).setUpdateListener(new o51(this, 1)), org.telegram.ui.Components.wr.f28819f, 160L);
        if (this.F1 && z11) {
            y51Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        } else {
            y51Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        }
        h();
    }

    public l71(org.telegram.ui.ActionBar.p2 p2Var, Context context, boolean z10, Integer num, int i10, boolean z11, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        this(p2Var, context, z10, num, i10, z11, f6Var, i11, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18254v6, f6Var));
    }

    public l71(org.telegram.ui.ActionBar.p2 r41, android.content.Context r42, boolean r43, java.lang.Integer r44, int r45, boolean r46, org.telegram.ui.ActionBar.f6 r47, int r48, int r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l71.<init>(org.telegram.ui.ActionBar.p2, android.content.Context, boolean, java.lang.Integer, int, boolean, org.telegram.ui.ActionBar.f6, int, int):void");
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.J.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            this.J.add(yg.p0.b(str));
        }
        i61 i61Var = this.f34570h0;
        if (i61Var != null) {
            for (int i11 = 0; i11 < i61Var.getChildCount(); i11++) {
                if (i61Var.getChildAt(i11) instanceof u61) {
                    u61 u61Var = (u61) i61Var.getChildAt(i11);
                    u61Var.d(this.J.contains(u61Var.f37135x), true);
                }
            }
            i61Var.invalidate();
        }
    }

    public void m() {
    }

    public void q() {
    }

    public void setOnRecentClearedListener(k71 k71Var) {
    }

    @Override
    public void setPressed(boolean z10) {
    }

    public void r(u61 u61Var, yg.p0 p0Var) {
    }
}
