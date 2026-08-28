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
public abstract class b61 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static String[] W1;
    public int A;
    public final ArrayList A0;
    public ValueAnimator A1;
    public int B;
    public final ArrayList B0;
    public boolean B1;
    public f51 C;
    public final ArrayList C0;
    public boolean C1;
    public z51 D;
    public final ArrayList D0;
    public ValueAnimator D1;
    public boolean E;
    public final ArrayList E0;
    public f41 E1;
    public HashSet F;
    public ArrayList F0;
    public ih.u5 F1;
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
    public k51 K;
    public boolean K0;
    public int K1;
    public boolean L;
    public Integer L0;
    public long L1;
    public boolean M;
    public boolean M0;
    public gh.bb M1;
    public boolean N;
    public List N0;
    public final f41 N1;
    public final ArrayList O;
    public k51 O0;
    public final f41 O1;
    public boolean P;
    public boolean P0;
    public Runnable P1;
    public b51 Q;
    public float Q0;
    public ValueAnimator Q1;
    public final int R;
    public final ImageReceiver R0;
    public ValueAnimator R1;
    public final int S;
    public org.telegram.ui.Components.k5 S0;
    public final AnimationNotificationsLocker S1;
    public final v41 T;
    public q41 T0;
    public final Paint T1;
    public final kh.h6 U;
    public final Integer U0;
    public Integer U1;
    public final org.telegram.ui.Components.nv[] V;
    public final org.telegram.ui.ActionBar.b6 V0;
    public org.telegram.ui.Components.nv W;
    public float W0;
    public float X0;
    public final org.telegram.ui.ActionBar.o2 Y0;
    public final int Z0;
    public int f36660a;
    public final t41 f36661a0;
    public final z41 f36662a1;
    public int f36663b;
    public final s41 f36664b0;
    public final int f36665b1;
    public int f36666c;
    public final dh.g f36667c0;
    public boolean f36668c1;
    public int d;
    public final y41 f36669d0;
    public boolean f36670d1;
    public int f36671e;
    public final o41 f36672e0;
    public ValueAnimator f36673e1;
    public int f36674f;
    public final FrameLayout f36675f0;
    public Drawable f36676f1;
    public final fh.v f36677g0;
    public final PorterDuffColorFilter f36678g1;
    public int h;
    public final org.telegram.ui.Components.o9 f36679h0;
    public float f36680h1;
    public final View f36681i0;
    public int f36682i1;
    public final org.telegram.ui.Components.an f36683j0;
    public org.telegram.ui.Components.i5 f36684j1;
    public final View f36685k0;
    public Rect f36686k1;
    public final a51 f36687l0;
    public View l1;
    public final l51 m0;
    public float f36688m1;
    public int f36689n;
    public final p41 f36690n0;
    public k51 f36691n1;
    public final c2.y f36692o0;
    public Rect f36693o1;
    public final View f36694p0;
    public final OvershootInterpolator f36695p1;
    public int f36696q0;
    public ValueAnimator f36697q1;
    public int f36698r;
    public final ArrayList f36699r0;
    public boolean f36700r1;
    public int f36701s;
    public final SparseIntArray f36702s0;
    public boolean f36703s1;
    public final SparseIntArray f36704t0;
    public boolean f36705t1;
    public final SparseIntArray f36706u0;
    public boolean f36707u1;
    public int v;
    public final SparseIntArray f36708v0;
    public String f36709v1;
    public int f36710w;
    public final ArrayList f36711w0;
    public ArrayList f36712w1;
    public int f36713x;
    public final ArrayList f36714x0;
    public ArrayList f36715x1;
    public int f36716y;
    public boolean f36717y0;
    public ArrayList f36718y1;
    public final ArrayList f36719z0;
    public ArrayList f36720z1;
    public static final List V1 = Arrays.asList("😖", "😫", "🫠", "😨", "❓");
    public static final boolean[] X1 = new boolean[4];
    public static final HashMap Y1 = new HashMap();

    public b61(org.telegram.ui.ActionBar.o2 o2Var, Context context, boolean z10, Integer num, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        this(o2Var, context, z10, num, i9, true, b6Var, 16);
    }

    public static void D(int i9, org.telegram.ui.Components.o9 o9Var) {
        List list;
        ImageLocation forDocument;
        String str;
        if (o9Var != null) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(i9).getFeaturedEmojiSets());
            Collections.shuffle(arrayList);
            int round = (int) Math.round(Math.random() * 10.0d);
            TLRPC.Document document = null;
            int i10 = 0;
            while (true) {
                int size = arrayList.size();
                list = V1;
                if (i10 >= size) {
                    break;
                }
                if ((arrayList.get(i10) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList.get(i10)).documents != null) {
                    ArrayList arrayList2 = new ArrayList(((TLRPC.TL_stickerSetFullCovered) arrayList.get(i10)).documents);
                    Collections.shuffle(arrayList2);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList2.size()) {
                            break;
                        }
                        TLRPC.Document document2 = (TLRPC.Document) arrayList2.get(i11);
                        if (document2 != null && list.contains(MessageObject.findAnimatedEmojiEmoticon(document2, null))) {
                            int i12 = round - 1;
                            if (round <= 0) {
                                round = i12;
                                document = document2;
                                break;
                            }
                            round = i12;
                            document = document2;
                        }
                        i11++;
                    }
                }
                if (document != null && round <= 0) {
                    break;
                }
                i10++;
            }
            if (document == null || round > 0) {
                ArrayList arrayList3 = new ArrayList(MediaDataController.getInstance(i9).getStickerSets(5));
                Collections.shuffle(arrayList3);
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    if (arrayList3.get(i13) != null && ((TLRPC.TL_messages_stickerSet) arrayList3.get(i13)).documents != null) {
                        ArrayList arrayList4 = new ArrayList(((TLRPC.TL_messages_stickerSet) arrayList3.get(i13)).documents);
                        Collections.shuffle(arrayList4);
                        int i14 = 0;
                        while (true) {
                            if (i14 >= arrayList4.size()) {
                                break;
                            }
                            TLRPC.Document document3 = (TLRPC.Document) arrayList4.get(i14);
                            if (document3 != null && list.contains(MessageObject.findAnimatedEmojiEmoticon(document3, null))) {
                                int i15 = round - 1;
                                if (round <= 0) {
                                    round = i15;
                                    document = document3;
                                    break;
                                }
                                round = i15;
                                document = document3;
                            }
                            i14++;
                        }
                    }
                    if (document != null && round <= 0) {
                        break;
                    }
                }
            }
            if (document != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.f6.f23162m6, 0.2f);
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
                o9Var.setLayerNum(7);
                o9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                o9Var.l(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "36_36", svgThumb, document);
            }
        }
    }

    public static void a(b61 b61Var, int i9, int i10) {
        int i11;
        c2.y yVar = b61Var.f36692o0;
        p41 p41Var = b61Var.f36690n0;
        View m10 = p41Var.m(i9);
        int L0 = p41Var.L0();
        if ((m10 == null && Math.abs(i9 - L0) > 72.0f) || !SharedConfig.animationsEnabled()) {
            if (p41Var.L0() < i9) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            yVar.f2255b = i11;
            yVar.c(i9, i10, false, false);
            return;
        }
        kh.n1 n1Var = new kh.n1(b61Var, b61Var.f36669d0.getContext(), 4);
        n1Var.f5443a = i9;
        n1Var.f47269p = i10;
        p41Var.w0(n1Var);
    }

    public static boolean c(b61 b61Var) {
        if (!b61Var.P) {
            ValueAnimator valueAnimator = b61Var.Q1;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public int getCacheType() {
        int i9 = 13;
        int i10 = this.S;
        if (i10 != 5 && i10 != 7) {
            if (i10 == 6) {
                return org.telegram.ui.Components.k5.g();
            }
            if (i10 != 3 && i10 != 4) {
                i9 = 2;
                if (i10 != 0 && i10 != 12 && i10 != 9 && i10 != 10 && i10 != 2) {
                    return 3;
                }
            }
        }
        return i9;
    }

    public Drawable getPremiumStar() {
        if (this.f36676f1 == null) {
            int i9 = this.S;
            if (i9 != 5 && i9 != 9 && i9 != 10 && i9 != 7) {
                this.f36676f1 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
            } else {
                this.f36676f1 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_filled_blocked).mutate();
            }
            this.f36676f1.setColorFilter(this.f36678g1);
        }
        return this.f36676f1;
    }

    public static ArrayList j(HashSet hashSet, ArrayList arrayList) {
        if (hashSet == null) {
            return arrayList;
        }
        int i9 = 0;
        while (i9 < arrayList.size()) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i9);
            if (document == null || hashSet.contains(Long.valueOf(document.f22386id))) {
                arrayList.remove(i9);
                i9--;
            }
            i9++;
        }
        return arrayList;
    }

    public static TLRPC.Document k(String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        long j10;
        if (tL_messages_stickerSet == null) {
            return null;
        }
        String fixEmoji = Emoji.fixEmoji(str);
        int i9 = 0;
        while (true) {
            if (i9 < tL_messages_stickerSet.packs.size()) {
                if (!tL_messages_stickerSet.packs.get(i9).documents.isEmpty() && TextUtils.equals(Emoji.fixEmoji(tL_messages_stickerSet.packs.get(i9).emoticon), fixEmoji)) {
                    j10 = tL_messages_stickerSet.packs.get(i9).documents.get(0).longValue();
                    break;
                }
                i9++;
            } else {
                j10 = 0;
                break;
            }
        }
        if (j10 == 0) {
            return null;
        }
        for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(i10);
            if (document.f22386id == j10) {
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
                k5Var.setColorFilter(this.f36678g1);
                this.S0.a(this);
            }
        }
    }

    public static void t(final int i9) {
        boolean[] zArr = X1;
        if (!zArr[i9] && MediaDataController.getInstance(i9) != null) {
            zArr[i9] = true;
            MediaDataController.getInstance(i9).checkStickers(5);
            MediaDataController.getInstance(i9).fetchEmojiStatuses(0, true);
            MediaDataController.getInstance(i9).checkReactions();
            MediaDataController.getInstance(i9).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
            MediaDataController.getInstance(i9).getDefaultEmojiStatuses();
            MediaDataController.getInstance(i9).checkDefaultTopicIcons();
            org.telegram.ui.Components.ew0.f28191t3.fetch(i9, 1, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    ArrayList<TLRPC.EmojiGroup> arrayList;
                    TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                    if (tL_messages_emojiGroups != null && (arrayList = tL_messages_emojiGroups.groups) != null) {
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            TLRPC.EmojiGroup emojiGroup = arrayList.get(i10);
                            i10++;
                            k5.h(i9).b(emojiGroup.icon_emoji_id, null);
                        }
                    }
                }
            });
        }
    }

    public final void A(Long l10) {
        this.G.remove(l10);
        y41 y41Var = this.f36669d0;
        if (y41Var != null) {
            int i9 = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < y41Var.getChildCount(); i10++) {
                if (y41Var.getChildAt(i10) instanceof k51) {
                    k51 k51Var = (k51) y41Var.getChildAt(i10);
                    org.telegram.ui.Components.t5 t5Var = k51Var.f39713e;
                    if (t5Var != null && t5Var.getDocumentId() == l10.longValue()) {
                        k51Var.f();
                    } else {
                        TLRPC.Document document = k51Var.d;
                        if (document != null && document.f22386id == l10.longValue()) {
                            k51Var.f();
                        }
                    }
                    z10 = true;
                }
            }
            y41Var.invalidate();
            if (!z10) {
                while (true) {
                    ArrayList arrayList = this.f36699r0;
                    if (i9 < arrayList.size()) {
                        long longValue = ((Long) arrayList.get(i9)).longValue();
                        if (longValue == (l10.longValue() * 13) + 62425 || longValue == (l10.longValue() * 13) + 3212) {
                            break;
                        }
                        i9++;
                    } else {
                        return;
                    }
                }
                a51 a51Var = this.f36687l0;
                if (a51Var != null) {
                    a51Var.m(i9);
                }
            }
        }
    }

    public final void B(boolean r40, boolean r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b61.B(boolean, boolean, boolean):void");
    }

    public final void C() {
        s41 s41Var = this.f36664b0;
        if (s41Var == null) {
            return;
        }
        if (this.f36707u1) {
            s41Var.clearAnimation();
            s41Var.setVisibility(0);
            s41Var.animate().translationY(0.0f).start();
            return;
        }
        y41 y41Var = this.f36669d0;
        if (y41Var.getChildCount() > 0) {
            View childAt = y41Var.getChildAt(0);
            if (RecyclerView.R(childAt) == this.f36660a && "searchbox".equals(childAt.getTag())) {
                s41Var.setVisibility(0);
                s41Var.setTranslationY(childAt.getY());
                return;
            }
            s41Var.setTranslationY(-AndroidUtilities.dp(52.0f));
            return;
        }
        s41Var.setTranslationY(-AndroidUtilities.dp(52.0f));
    }

    public final void E(float f10) {
        int i9;
        int i10 = -1;
        View view = this.f36681i0;
        if (view != null) {
            float interpolation = org.telegram.ui.Components.gr.f28845g.getInterpolation(g7.n.a((((f10 * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            if (n()) {
                i9 = -1;
            } else {
                i9 = 1;
            }
            view.setScaleY(interpolation * i9);
        }
        org.telegram.ui.Components.an anVar = this.f36683j0;
        if (anVar != null) {
            float a2 = g7.n.a((((f10 * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            anVar.setAlpha(a2);
            anVar.setScaleX(a2);
            if (!n()) {
                i10 = 1;
            }
            anVar.setScaleY(a2 * i10);
        }
        float f11 = 800.0f * f10;
        float f12 = f11 - 40.0f;
        float a3 = g7.n.a(f12 / 700.0f, 0.0f, 1.0f);
        float a10 = g7.n.a((f11 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a11 = g7.n.a(f12 / 750.0f, 0.0f, 1.0f);
        float a12 = g7.n.a((f11 - 30.0f) / 120.0f, 0.0f, 1.0f);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        float interpolation2 = grVar.getInterpolation(a3);
        float interpolation3 = grVar.getInterpolation(a10);
        this.U.setAlpha(a12);
        this.f36664b0.setAlpha(a12);
        int i11 = 0;
        for (int i12 = 0; i12 < this.W.f34720b.getChildCount(); i12++) {
            this.W.f34720b.getChildAt(i12).setAlpha(a12);
        }
        if (this.f36684j1 != null) {
            invalidate();
        }
        float f13 = 1.0f - a12;
        v41 v41Var = this.T;
        v41Var.setTranslationY(AndroidUtilities.dp(-5.0f) * f13);
        if (anVar != null) {
            anVar.setTranslationY(AndroidUtilities.dp(-5.0f) * f13);
        }
        this.W0 = (interpolation2 * 0.85f) + 0.15f;
        this.X0 = (interpolation3 * 0.925f) + 0.075f;
        v41Var.invalidateOutline();
        if (anVar != null) {
            anVar.setAlpha(a12);
        }
        t41 t41Var = this.f36661a0;
        t41Var.setAlpha(a12);
        t41Var.setScaleX(Math.min(this.W0, 1.0f));
        float pivotX = t41Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(v41Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(v41Var.getHeight(), 2.0d) + Math.pow(v41Var.getWidth() - pivotX, 2.0d)));
        for (int i13 = 0; i13 < this.W.f34720b.getChildCount(); i13++) {
            View childAt = this.W.f34720b.getChildAt(i13);
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
            float cascade = AndroidUtilities.cascade(a11, (float) Math.sqrt(e2.c.x(height, height, 0.4f, width * width)), sqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(cascade)) {
                cascade = 0.0f;
            }
            childAt.setScaleX(cascade);
            childAt.setScaleY(cascade);
        }
        while (true) {
            y41 y41Var = this.f36669d0;
            if (i11 < y41Var.getChildCount()) {
                View childAt2 = y41Var.getChildAt(i11);
                if (childAt2 instanceof k51) {
                    k51 k51Var = (k51) childAt2;
                    float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                    float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                    if (n()) {
                        height2 = getMeasuredHeight() - height2;
                    }
                    float cascade2 = AndroidUtilities.cascade(a11, (float) Math.sqrt(e2.c.x(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                    if (Float.isNaN(cascade2)) {
                        cascade2 = 0.0f;
                    }
                    k51Var.setAnimatedScale(cascade2);
                }
                i11++;
            } else {
                this.f36677g0.invalidate();
                y41Var.invalidate();
                return;
            }
        }
    }

    public boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return true;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.stickersDidLoad;
        f41 f41Var = this.O1;
        if (i9 == i11) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.M)) {
                AndroidUtilities.cancelRunOnUIThread(f41Var);
                AndroidUtilities.runOnUIThread(f41Var);
            }
        } else if (i9 == NotificationCenter.featuredEmojiDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(f41Var);
            AndroidUtilities.runOnUIThread(f41Var);
        } else if (i9 == NotificationCenter.recentEmojiStatusesUpdate) {
            AndroidUtilities.cancelRunOnUIThread(f41Var);
            AndroidUtilities.runOnUIThread(f41Var);
        } else if (i9 == NotificationCenter.groupStickersDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(f41Var);
            AndroidUtilities.runOnUIThread(f41Var);
        } else if (i9 == NotificationCenter.emojiLoaded) {
            ih.e eVar = new ih.e(18);
            y41 y41Var = this.f36669d0;
            AndroidUtilities.forEachViews((RecyclerView) y41Var, (d5.d) eVar);
            if (y41Var != null) {
                y41Var.invalidate();
            }
        } else if (i9 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == UserConfig.getInstance(this.R).getClientUserId()) {
            AndroidUtilities.cancelRunOnUIThread(f41Var);
            AndroidUtilities.runOnUIThread(f41Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        float scaleY;
        int i9;
        float f10;
        float measuredHeight;
        org.telegram.ui.Components.i5 i5Var = this.f36684j1;
        if (i5Var != null && (num = this.U0) != null) {
            Rect bounds = i5Var.getBounds();
            View view = this.l1;
            if (view == null) {
                scaleY = 1.0f;
            } else {
                scaleY = view.getScaleY();
            }
            int alpha = this.f36684j1.getAlpha();
            View view2 = this.l1;
            if (view2 == null) {
                bounds.height();
            } else {
                view2.getHeight();
            }
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f36684j1.v = (int) (Math.pow(this.T.getAlpha(), 0.25d) * alpha * this.f36680h1);
            if (this.f36686k1 == null) {
                this.f36686k1 = new Rect();
            }
            if (scaleY > 1.0f && scaleY < 1.5f) {
                i9 = 2;
            } else {
                i9 = 0;
            }
            float f11 = i9;
            if (scaleY > 1.5f) {
                f10 = (bounds.height() * 0.81f) + 1.0f;
            } else {
                f10 = 0.0f;
            }
            float intValue = num.intValue() + f11;
            float z10 = e2.c.z(scaleY, 1.0f, bounds.centerY(), -f10);
            boolean n10 = n();
            int i10 = this.Z0;
            if (!n10) {
                measuredHeight = AndroidUtilities.dp(i10);
            } else {
                measuredHeight = getMeasuredHeight() - (AndroidUtilities.dp(i10) / 2.0f);
            }
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + z10 + measuredHeight;
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.f36686k1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            org.telegram.ui.Components.i5 i5Var2 = this.f36684j1;
            Rect rect = this.f36686k1;
            int i11 = rect.left;
            Rect rect2 = this.f36686k1;
            i5Var2.setBounds(i11, rect.top, (int) ((rect.width() / scaleY) + i11), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.f36686k1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.f36684j1.draw(canvas);
            org.telegram.ui.Components.i5 i5Var3 = this.f36684j1;
            i5Var3.v = alpha;
            i5Var3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        k51 k51Var = this.f36691n1;
        if (k51Var != null && this.f36693o1 != null && k51Var.A != null) {
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f36691n1.A.setAlpha((int) (this.f36688m1 * 255.0f));
            this.f36691n1.A.setBounds(this.f36693o1);
            this.f36691n1.A.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - this.f36680h1, this.f36665b1, this.f36682i1), PorterDuff.Mode.SRC_IN));
            this.f36691n1.A.draw(canvas);
            canvas.restore();
        }
    }

    public final long f() {
        return Math.max(450L, Math.min(55, this.K1 - this.J1) * 30);
    }

    public final long g() {
        return Math.max(300L, Math.min(45, this.K1 - this.J1) * 25) + f() + 16;
    }

    public gh.bb getCollectionParticles() {
        if (this.M1 == null) {
            this.M1 = new gh.bb(1, 8);
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
        float f10;
        if (this.B1) {
            view = this.f36672e0;
        } else {
            view = this.f36669d0;
        }
        boolean canScrollVertically = view.canScrollVertically(1);
        if (canScrollVertically != this.f36700r1) {
            this.f36700r1 = canScrollVertically;
            ViewPropertyAnimator animate = this.f36685k0.animate();
            if (canScrollVertically) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setDuration(200L).start();
        }
    }

    public final void i(int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b61.i(int, android.view.View):void");
    }

    public final void l() {
        String str;
        int i9 = this.S;
        if (i9 != 2) {
            StringBuilder sb2 = new StringBuilder("emoji");
            if (i9 != 0 && i9 != 12 && i9 != 9 && i9 != 10) {
                str = "reaction";
            } else {
                str = "status";
            }
            String r10 = aa.d.r(sb2, str, "usehint");
            int i10 = MessagesController.getGlobalMainSettings().getInt(r10, 0);
            if (i10 <= 3) {
                MessagesController.getGlobalMainSettings().edit().putInt(r10, i10 + 1).apply();
            }
        }
    }

    public final boolean n() {
        int i9 = this.S;
        if (i9 != 5 && i9 != 10 && i9 != 12 && i9 != 15) {
            return false;
        }
        return true;
    }

    public final void o(android.view.View r14, org.telegram.ui.Components.t5 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b61.o(android.view.View, org.telegram.ui.Components.t5):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E = true;
        int i9 = this.R;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.featuredEmojiDidLoad);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.groupStickersDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        int i10 = this.S;
        if (i10 == 0 || i10 == 12) {
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        }
        org.telegram.ui.Components.i5 i5Var = this.f36684j1;
        if (i5Var != null) {
            i5Var.f29320n = this;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setBigReactionAnimatedEmoji(null);
        this.E = false;
        int i9 = this.R;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.featuredEmojiDidLoad);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        int i10 = this.S;
        if (i10 == 0 || i10 == 12) {
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        }
        org.telegram.ui.Components.i5 i5Var = this.f36684j1;
        if (i5Var != null) {
            i5Var.f29320n = null;
        }
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        if (z10 && this.S == 6) {
            this.f36690n0.y1((getMeasuredWidth() / AndroidUtilities.dp(42.0f)) * 5);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        boolean z10 = this.M0;
        int i11 = this.S;
        if (z10 && i11 != 3 && i11 != 4) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f), Integer.MIN_VALUE));
        } else if (i11 == 6) {
            super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.displaySize.y * 0.35f), Integer.MIN_VALUE));
        } else {
            super.onMeasure(i9, i10);
        }
    }

    public abstract void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num);

    public final void s(r51 r51Var) {
        Integer num = this.U1;
        if (num != null) {
            Parcelable parcelable = (Parcelable) Y1.get(num);
        }
        this.P1 = r51Var;
        boolean z10 = this.M0;
        y41 y41Var = this.f36669d0;
        if (!z10) {
            h();
            for (int i9 = 0; i9 < y41Var.getChildCount(); i9++) {
                View childAt = y41Var.getChildAt(i9);
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
        int i10 = this.S;
        if (i10 != 3 && i10 != 4 && i10 != 6) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.Q1 = ofFloat;
            ofFloat.addUpdateListener(new e41(this, 0));
            this.Q1.addListener(new bc0(this, 26));
            f41 f41Var = new f41(this, 0);
            hg.h0.f10612f = true;
            hg.h0.f10611e = true;
            hg.h0.f10613g = false;
            if (hg.h0.d) {
                hg.h0.d = false;
            }
            hg.h0.f10610c = f41Var;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.S1.lock();
            this.Q1.setDuration(800L);
            y41Var.setLayerType(2, null);
            this.f36664b0.setLayerType(2, null);
            this.f36661a0.setLayerType(2, null);
            this.U.setLayerType(2, null);
            org.telegram.ui.Components.an anVar = this.f36683j0;
            if (anVar != null) {
                anVar.setLayerType(2, null);
            }
            View view = this.f36681i0;
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

    public void setBackgroundDelegate(b51 b51Var) {
        this.Q = b51Var;
    }

    public void setDrawBackground(boolean z10) {
        this.M0 = z10;
        this.T.setClipToOutline(z10);
        kh.h6 h6Var = this.U;
        if (!z10) {
            h6Var.setVisibility(8);
        } else {
            h6Var.setVisibility(0);
        }
    }

    public void setEnterAnimationInProgress(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            if (!z10) {
                AndroidUtilities.forEachViews((RecyclerView) this.f36669d0, (d5.d) new ih.e(13));
                for (int i9 = 0; i9 < this.W.f34720b.getChildCount(); i9++) {
                    View childAt = this.W.f34720b.getChildAt(i9);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                this.W.f34720b.invalidate();
            }
        }
    }

    public void setExpireDateHint(int i9) {
        if (i9 <= 0) {
            return;
        }
        this.K0 = true;
        this.L0 = Integer.valueOf(i9);
        B(true, false, true);
    }

    public void setForUser(boolean z10) {
        this.N = z10;
        B(false, false, true);
    }

    public void setForumIconDrawable(Drawable drawable) {
        this.J = drawable;
        k51 k51Var = this.K;
        if (k51Var != null) {
            k51Var.h.setImageBitmap(drawable);
        }
    }

    public void setLongPressEnabled(boolean z10) {
        this.f36670d1 = z10;
    }

    public void setOnLongPressedListener(z51 z51Var) {
        this.D = z51Var;
    }

    public void setRecentReactions(List<hg.r0> list) {
        this.N0 = list;
        B(false, true, true);
    }

    public void setSaveState(int i9) {
        this.U1 = Integer.valueOf(i9);
    }

    public void setSelected(Long l10) {
        HashSet hashSet = this.G;
        hashSet.clear();
        hashSet.add(l10);
        y41 y41Var = this.f36669d0;
        if (y41Var != null) {
            for (int i9 = 0; i9 < y41Var.getChildCount(); i9++) {
                if (y41Var.getChildAt(i9) instanceof k51) {
                    k51 k51Var = (k51) y41Var.getChildAt(i9);
                    org.telegram.ui.Components.t5 t5Var = k51Var.f39713e;
                    if (t5Var != null) {
                        k51Var.d(hashSet.contains(Long.valueOf(t5Var.getDocumentId())), true);
                    } else {
                        k51Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            y41Var.invalidate();
        }
    }

    public void setSelectedReaction(hg.r0 r0Var) {
        this.F.clear();
        this.F.add(r0Var);
        y41 y41Var = this.f36669d0;
        if (y41Var != null) {
            for (int i9 = 0; i9 < y41Var.getChildCount(); i9++) {
                if (y41Var.getChildAt(i9) instanceof k51) {
                    k51 k51Var = (k51) y41Var.getChildAt(i9);
                    k51Var.d(this.F.contains(k51Var.f39719x), true);
                }
            }
            y41Var.invalidate();
        }
        o41 o41Var = this.f36672e0;
        if (o41Var != null) {
            for (int i10 = 0; i10 < o41Var.getChildCount(); i10++) {
                if (o41Var.getChildAt(i10) instanceof k51) {
                    k51 k51Var2 = (k51) o41Var.getChildAt(i10);
                    k51Var2.d(this.F.contains(k51Var2.f39719x), true);
                }
            }
            o41Var.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<hg.r0> hashSet) {
        this.F = hashSet;
        HashSet hashSet2 = this.G;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if (arrayList.get(i9) != null && ((hg.r0) arrayList.get(i9)).f10718g != 0) {
                hashSet2.add(Long.valueOf(((hg.r0) arrayList.get(i9)).f10718g));
            }
        }
    }

    public boolean u() {
        return false;
    }

    public final void v(String str, boolean z10, boolean z11) {
        long j10;
        f41 f41Var = this.E1;
        if (f41Var != null) {
            AndroidUtilities.cancelRunOnUIThread(f41Var);
            this.E1 = null;
        }
        ih.u5 u5Var = this.F1;
        if (u5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(u5Var);
            this.F1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        l51 l51Var = this.m0;
        s41 s41Var = this.f36664b0;
        if (isEmpty) {
            this.f36705t1 = false;
            this.f36707u1 = false;
            z(false, z10);
            if (s41Var != null) {
                s41Var.e(true);
                q51.a(s41Var, false);
            }
            l51Var.E(true);
            this.f36709v1 = null;
        } else {
            boolean z12 = this.f36705t1;
            boolean z13 = !z12;
            this.f36705t1 = true;
            this.f36707u1 = false;
            if (s41Var != null) {
                s41Var.f41686f.b(2);
            }
            if (!z12) {
                ArrayList arrayList = this.f36712w1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = this.f36715x1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = this.f36720z1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                l51Var.E(false);
            } else if (!str.equals(this.f36709v1)) {
                f41 f41Var2 = new f41(this, 1);
                this.E1 = f41Var2;
                AndroidUtilities.runOnUIThread(f41Var2, 120L);
            }
            this.f36709v1 = str;
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            if (!Arrays.equals(currentKeyboardLanguage, W1)) {
                MediaDataController.getInstance(this.R).fetchNewEmojiKeywords(currentKeyboardLanguage);
            }
            W1 = currentKeyboardLanguage;
            ih.u5 u5Var2 = new ih.u5(this, str, z10, z13, currentKeyboardLanguage, 3);
            this.F1 = u5Var2;
            if (z11) {
                j10 = 425;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(u5Var2, j10);
            if (s41Var != null) {
                s41Var.f41686f.b(2);
                q51.a(s41Var, z10);
            }
        }
        C();
    }

    public final void w(float f10) {
        ValueAnimator valueAnimator = this.f36673e1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f36673e1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f36694p0.getAlpha(), f10 * 0.25f);
        this.f36673e1 = ofFloat;
        ofFloat.addUpdateListener(new e41(this, 2));
        this.f36673e1.setDuration(200L);
        this.f36673e1.setInterpolator(org.telegram.ui.Components.gr.f28844f);
        this.f36673e1.start();
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
        y41 y41Var = this.f36669d0;
        if (y41Var != null) {
            for (int i9 = 0; i9 < y41Var.getChildCount(); i9++) {
                if (y41Var.getChildAt(i9) instanceof k51) {
                    k51 k51Var = (k51) y41Var.getChildAt(i9);
                    org.telegram.ui.Components.t5 t5Var = k51Var.f39713e;
                    if (t5Var != null && t5Var.getDocumentId() == l10.longValue()) {
                        k51Var.e(z11, z10);
                    } else {
                        TLRPC.Document document = k51Var.d;
                        if (document != null && document.f22386id == l10.longValue()) {
                            k51Var.e(z11, z10);
                        }
                    }
                }
            }
            y41Var.invalidate();
        }
    }

    public final void y(org.telegram.ui.Components.i5 i5Var, View view) {
        int i9;
        Integer num;
        if (i5Var != null && (num = i5Var.B) != null) {
            i9 = num.intValue();
        } else {
            i9 = 0;
        }
        this.f36682i1 = i9;
        this.f36684j1 = i5Var;
        this.l1 = view;
        if (this.E && i5Var != null) {
            i5Var.f29320n = this;
        }
        invalidate();
    }

    public final void z(boolean z10, boolean z11) {
        float f10;
        if (this.B1 == z10) {
            return;
        }
        this.B1 = z10;
        y41 y41Var = this.f36669d0;
        y41Var.setVisibility(0);
        o41 o41Var = this.f36672e0;
        o41Var.setVisibility(0);
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
        ofFloat.addUpdateListener(new i41(this, z10, 0));
        this.A1.addListener(new u41(this, z10, 0));
        this.A1.setDuration(320L);
        this.A1.setInterpolator(org.telegram.ui.Components.gr.h);
        this.A1.start();
        ViewPropertyAnimator animate = ((View) y41Var.getParent()).animate();
        if (this.B1 && z11) {
            f10 = -AndroidUtilities.dp(36.0f);
        } else {
            f10 = 0.0f;
        }
        org.telegram.messenger.ll.r(animate.translationY(f10).setUpdateListener(new e41(this, 1)), org.telegram.ui.Components.gr.f28844f, 160L);
        if (this.B1 && z11) {
            o41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        } else {
            o41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        }
        h();
    }

    public b61(org.telegram.ui.ActionBar.o2 o2Var, Context context, boolean z10, Integer num, int i9, boolean z11, org.telegram.ui.ActionBar.b6 b6Var, int i10) {
        this(o2Var, context, z10, num, i9, z11, b6Var, i10, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23319v6, b6Var));
    }

    public b61(org.telegram.ui.ActionBar.o2 r41, android.content.Context r42, boolean r43, java.lang.Integer r44, int r45, boolean r46, org.telegram.ui.ActionBar.b6 r47, int r48, int r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b61.<init>(org.telegram.ui.ActionBar.o2, android.content.Context, boolean, java.lang.Integer, int, boolean, org.telegram.ui.ActionBar.b6, int, int):void");
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.F.clear();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            String str = arrayList.get(i9);
            i9++;
            this.F.add(hg.r0.b(str));
        }
        y41 y41Var = this.f36669d0;
        if (y41Var != null) {
            for (int i10 = 0; i10 < y41Var.getChildCount(); i10++) {
                if (y41Var.getChildAt(i10) instanceof k51) {
                    k51 k51Var = (k51) y41Var.getChildAt(i10);
                    k51Var.d(this.F.contains(k51Var.f39719x), true);
                }
            }
            y41Var.invalidate();
        }
    }

    public void m() {
    }

    public void q() {
    }

    public void setOnRecentClearedListener(a61 a61Var) {
    }

    @Override
    public void setPressed(boolean z10) {
    }

    public void r(k51 k51Var, hg.r0 r0Var) {
    }
}
