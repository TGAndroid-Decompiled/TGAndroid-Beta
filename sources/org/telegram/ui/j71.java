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
public abstract class j71 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    public n61 G;
    public final ArrayList G0;
    public boolean G1;
    public h71 H;
    public final ArrayList H0;
    public ValueAnimator H1;
    public boolean I;
    public final ArrayList I0;
    public m51 I1;
    public HashSet J;
    public ArrayList J0;
    public bi.i7 J1;
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
    public s61 O;
    public boolean O0;
    public int O1;
    public boolean P;
    public Integer P0;
    public long P1;
    public boolean Q;
    public boolean Q0;
    public zh.h8 Q1;
    public boolean R;
    public List R0;
    public final m51 R1;
    public final ArrayList S;
    public s61 S0;
    public final m51 S1;
    public boolean T;
    public boolean T0;
    public Runnable T1;
    public j61 U;
    public float U0;
    public ValueAnimator U1;
    public final int V;
    public final ImageReceiver V0;
    public ValueAnimator V1;
    public final int W;
    public org.telegram.ui.Components.q5 W0;
    public final AnimationNotificationsLocker W1;
    public y51 X0;
    public final Paint X1;
    public final Integer Y0;
    public Integer Y1;
    public final org.telegram.ui.ActionBar.f6 Z0;
    public int f37627a;
    public final d61 f37628a0;
    public float f37629a1;
    public int f37630b;
    public final di.r6 f37631b0;
    public float f37632b1;
    public int f37633c;
    public final org.telegram.ui.Components.bw[] f37634c0;
    public final org.telegram.ui.ActionBar.n2 f37635c1;
    public int d;
    public org.telegram.ui.Components.bw f37636d0;
    public final int f37637d1;
    public int f37638e;
    public final b61 f37639e0;
    public final h61 f37640e1;
    public int f37641f;
    public final a61 f37642f0;
    public final int f37643f1;
    public final v51 f37644g0;
    public boolean f37645g1;
    public int h;
    public final g61 f37646h0;
    public boolean f37647h1;
    public final w51 f37648i0;
    public ValueAnimator f37649i1;
    public final FrameLayout f37650j0;
    public Drawable f37651j1;
    public final ah.w f37652k0;
    public final PorterDuffColorFilter f37653k1;
    public final org.telegram.ui.Components.x9 f37654l0;
    public float l1;
    public final View m0;
    public int f37655m1;
    public int f37656n;
    public final org.telegram.ui.Components.jn f37657n0;
    public org.telegram.ui.Components.o5 f37658n1;
    public final View f37659o0;
    public Rect f37660o1;
    public final i61 f37661p0;
    public View f37662p1;
    public final t61 f37663q0;
    public float f37664q1;
    public int f37665r;
    public final x51 f37666r0;
    public s61 f37667r1;
    public int f37668s;
    public final org.telegram.ui.Components.ok0 f37669s0;
    public Rect f37670s1;
    public final View f37671t0;
    public final OvershootInterpolator f37672t1;
    public int f37673u0;
    public ValueAnimator f37674u1;
    public int v;
    public final ArrayList f37675v0;
    public boolean f37676v1;
    public int f37677w;
    public final SparseIntArray f37678w0;
    public boolean f37679w1;
    public int f37680x;
    public final SparseIntArray f37681x0;
    public boolean f37682x1;
    public int f37683y;
    public final SparseIntArray f37684y0;
    public boolean f37685y1;
    public final SparseIntArray f37686z0;
    public String f37687z1;
    public static final List Z1 = Arrays.asList("😖", "😫", "🫠", "😨", "❓");
    public static final boolean[] f37625b2 = new boolean[4];
    public static final HashMap f37626c2 = new HashMap();

    public j71(org.telegram.ui.ActionBar.n2 n2Var, Context context, boolean z10, Integer num, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this(n2Var, context, z10, num, i10, true, f6Var, 16);
    }

    public static void D(int i10, org.telegram.ui.Components.x9 x9Var) {
        List list;
        ImageLocation forDocument;
        String str;
        if (x9Var != null) {
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
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.f20827m6, 0.2f);
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
                x9Var.setLayerNum(7);
                x9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                x9Var.l(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "36_36", svgThumb, document);
            }
        }
    }

    public static void a(j71 j71Var, int i10, int i11) {
        int i12;
        org.telegram.ui.Components.ok0 ok0Var = j71Var.f37669s0;
        x51 x51Var = j71Var.f37666r0;
        View m10 = x51Var.m(i10);
        int L0 = x51Var.L0();
        if ((m10 == null && Math.abs(i10 - L0) > 72.0f) || !SharedConfig.animationsEnabled()) {
            if (x51Var.L0() < i10) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            ok0Var.f29098b = i12;
            ok0Var.c(i10, i11, false, false);
            return;
        }
        di.m1 m1Var = new di.m1(j71Var, j71Var.f37646h0.getContext(), 4);
        m1Var.f45906a = i10;
        m1Var.f15042p = i11;
        x51Var.w0(m1Var);
    }

    public static boolean c(j71 j71Var) {
        if (!j71Var.T) {
            ValueAnimator valueAnimator = j71Var.U1;
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
        if (this.f37651j1 == null) {
            int i10 = this.W;
            if (i10 != 5 && i10 != 9 && i10 != 10 && i10 != 7) {
                this.f37651j1 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
            } else {
                this.f37651j1 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_filled_blocked).mutate();
            }
            this.f37651j1.setColorFilter(this.f37653k1);
        }
        return this.f37651j1;
    }

    public static ArrayList j(HashSet hashSet, ArrayList arrayList) {
        if (hashSet == null) {
            return arrayList;
        }
        int i10 = 0;
        while (i10 < arrayList.size()) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
            if (document == null || hashSet.contains(Long.valueOf(document.f19875id))) {
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
            if (document.f19875id == j3) {
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
                q5Var.setColorFilter(this.f37653k1);
                this.W0.a(this);
            }
        }
    }

    public static void t(final int i10) {
        boolean[] zArr = f37625b2;
        if (!zArr[i10] && MediaDataController.getInstance(i10) != null) {
            zArr[i10] = true;
            MediaDataController.getInstance(i10).checkStickers(5);
            MediaDataController.getInstance(i10).fetchEmojiStatuses(0, true);
            MediaDataController.getInstance(i10).checkReactions();
            MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
            MediaDataController.getInstance(i10).getDefaultEmojiStatuses();
            MediaDataController.getInstance(i10).checkDefaultTopicIcons();
            org.telegram.ui.Components.vw0.f31993x3.fetch(i10, 1, new Utilities.Callback() {
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
                            q5.h(i10).b(emojiGroup.icon_emoji_id, null);
                        }
                    }
                }
            });
        }
    }

    public final void A(Long l4) {
        this.K.remove(l4);
        g61 g61Var = this.f37646h0;
        if (g61Var != null) {
            int i10 = 0;
            boolean z10 = false;
            for (int i11 = 0; i11 < g61Var.getChildCount(); i11++) {
                if (g61Var.getChildAt(i11) instanceof s61) {
                    s61 s61Var = (s61) g61Var.getChildAt(i11);
                    org.telegram.ui.Components.z5 z5Var = s61Var.f40318e;
                    if (z5Var != null && z5Var.getDocumentId() == l4.longValue()) {
                        s61Var.f();
                    } else {
                        TLRPC.Document document = s61Var.d;
                        if (document != null && document.f19875id == l4.longValue()) {
                            s61Var.f();
                        }
                    }
                    z10 = true;
                }
            }
            g61Var.invalidate();
            if (!z10) {
                while (true) {
                    ArrayList arrayList = this.f37675v0;
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
                i61 i61Var = this.f37661p0;
                if (i61Var != null) {
                    i61Var.m(i10);
                }
            }
        }
    }

    public final void B(boolean r40, boolean r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j71.B(boolean, boolean, boolean):void");
    }

    public final void C() {
        a61 a61Var = this.f37642f0;
        if (a61Var == null) {
            return;
        }
        if (this.f37685y1) {
            a61Var.clearAnimation();
            a61Var.setVisibility(0);
            a61Var.animate().translationY(0.0f).start();
            return;
        }
        g61 g61Var = this.f37646h0;
        if (g61Var.getChildCount() > 0) {
            View childAt = g61Var.getChildAt(0);
            if (RecyclerView.R(childAt) == this.f37627a && "searchbox".equals(childAt.getTag())) {
                a61Var.setVisibility(0);
                a61Var.setTranslationY(childAt.getY());
                return;
            }
            a61Var.setTranslationY(-AndroidUtilities.dp(52.0f));
            return;
        }
        a61Var.setTranslationY(-AndroidUtilities.dp(52.0f));
    }

    public final void E(float f7) {
        int i10;
        int i11 = -1;
        View view = this.m0;
        if (view != null) {
            float interpolation = org.telegram.ui.Components.pr.f29467g.getInterpolation(w7.p.a((((f7 * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            if (n()) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            view.setScaleY(interpolation * i10);
        }
        org.telegram.ui.Components.jn jnVar = this.f37657n0;
        if (jnVar != null) {
            float a10 = w7.p.a((((f7 * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            jnVar.setAlpha(a10);
            jnVar.setScaleX(a10);
            if (!n()) {
                i11 = 1;
            }
            jnVar.setScaleY(a10 * i11);
        }
        float f10 = 800.0f * f7;
        float f11 = f10 - 40.0f;
        float a11 = w7.p.a(f11 / 700.0f, 0.0f, 1.0f);
        float a12 = w7.p.a((f10 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a13 = w7.p.a(f11 / 750.0f, 0.0f, 1.0f);
        float a14 = w7.p.a((f10 - 30.0f) / 120.0f, 0.0f, 1.0f);
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        float interpolation2 = prVar.getInterpolation(a11);
        float interpolation3 = prVar.getInterpolation(a12);
        this.f37631b0.setAlpha(a14);
        this.f37642f0.setAlpha(a14);
        int i12 = 0;
        for (int i13 = 0; i13 < this.f37636d0.f28470b.getChildCount(); i13++) {
            this.f37636d0.f28470b.getChildAt(i13).setAlpha(a14);
        }
        if (this.f37658n1 != null) {
            invalidate();
        }
        float f12 = 1.0f - a14;
        d61 d61Var = this.f37628a0;
        d61Var.setTranslationY(AndroidUtilities.dp(-5.0f) * f12);
        if (jnVar != null) {
            jnVar.setTranslationY(AndroidUtilities.dp(-5.0f) * f12);
        }
        this.f37629a1 = (interpolation2 * 0.85f) + 0.15f;
        this.f37632b1 = (interpolation3 * 0.925f) + 0.075f;
        d61Var.invalidateOutline();
        if (jnVar != null) {
            jnVar.setAlpha(a14);
        }
        b61 b61Var = this.f37639e0;
        b61Var.setAlpha(a14);
        b61Var.setScaleX(Math.min(this.f37629a1, 1.0f));
        float pivotX = b61Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(d61Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(d61Var.getHeight(), 2.0d) + Math.pow(d61Var.getWidth() - pivotX, 2.0d)));
        for (int i14 = 0; i14 < this.f37636d0.f28470b.getChildCount(); i14++) {
            View childAt = this.f37636d0.f28470b.getChildAt(i14);
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
            g61 g61Var = this.f37646h0;
            if (i12 < g61Var.getChildCount()) {
                View childAt2 = g61Var.getChildAt(i12);
                if (childAt2 instanceof s61) {
                    s61 s61Var = (s61) childAt2;
                    float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                    float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                    if (n()) {
                        height2 = getMeasuredHeight() - height2;
                    }
                    float cascade2 = AndroidUtilities.cascade(a13, (float) Math.sqrt(com.google.android.gms.internal.vision.e2.x(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                    if (Float.isNaN(cascade2)) {
                        cascade2 = 0.0f;
                    }
                    s61Var.setAnimatedScale(cascade2);
                }
                i12++;
            } else {
                this.f37652k0.invalidate();
                g61Var.invalidate();
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
        m51 m51Var = this.S1;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.Q)) {
                AndroidUtilities.cancelRunOnUIThread(m51Var);
                AndroidUtilities.runOnUIThread(m51Var);
            }
        } else if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(m51Var);
            AndroidUtilities.runOnUIThread(m51Var);
        } else if (i10 == NotificationCenter.recentEmojiStatusesUpdate) {
            AndroidUtilities.cancelRunOnUIThread(m51Var);
            AndroidUtilities.runOnUIThread(m51Var);
        } else if (i10 == NotificationCenter.groupStickersDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(m51Var);
            AndroidUtilities.runOnUIThread(m51Var);
        } else if (i10 == NotificationCenter.emojiLoaded) {
            bi.f fVar = new bi.f(19);
            g61 g61Var = this.f37646h0;
            AndroidUtilities.forEachViews((RecyclerView) g61Var, (e2.h) fVar);
            if (g61Var != null) {
                g61Var.invalidate();
            }
        } else if (i10 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == UserConfig.getInstance(this.V).getClientUserId()) {
            AndroidUtilities.cancelRunOnUIThread(m51Var);
            AndroidUtilities.runOnUIThread(m51Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        float scaleY;
        int i10;
        float f7;
        float measuredHeight;
        org.telegram.ui.Components.o5 o5Var = this.f37658n1;
        if (o5Var != null && (num = this.Y0) != null) {
            Rect bounds = o5Var.getBounds();
            View view = this.f37662p1;
            if (view == null) {
                scaleY = 1.0f;
            } else {
                scaleY = view.getScaleY();
            }
            int alpha = this.f37658n1.getAlpha();
            View view2 = this.f37662p1;
            if (view2 == null) {
                bounds.height();
            } else {
                view2.getHeight();
            }
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f37658n1.v = (int) (Math.pow(this.f37628a0.getAlpha(), 0.25d) * alpha * this.l1);
            if (this.f37660o1 == null) {
                this.f37660o1 = new Rect();
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
            int i11 = this.f37637d1;
            if (!n10) {
                measuredHeight = AndroidUtilities.dp(i11);
            } else {
                measuredHeight = getMeasuredHeight() - (AndroidUtilities.dp(i11) / 2.0f);
            }
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + z10 + measuredHeight;
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.f37660o1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            org.telegram.ui.Components.o5 o5Var2 = this.f37658n1;
            Rect rect = this.f37660o1;
            int i12 = rect.left;
            Rect rect2 = this.f37660o1;
            o5Var2.setBounds(i12, rect.top, (int) ((rect.width() / scaleY) + i12), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.f37660o1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.f37658n1.draw(canvas);
            org.telegram.ui.Components.o5 o5Var3 = this.f37658n1;
            o5Var3.v = alpha;
            o5Var3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        s61 s61Var = this.f37667r1;
        if (s61Var != null && this.f37670s1 != null && s61Var.E != null) {
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f37667r1.E.setAlpha((int) (this.f37664q1 * 255.0f));
            this.f37667r1.E.setBounds(this.f37670s1);
            this.f37667r1.E.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - this.l1, this.f37643f1, this.f37655m1), PorterDuff.Mode.SRC_IN));
            this.f37667r1.E.draw(canvas);
            canvas.restore();
        }
    }

    public final long f() {
        return Math.max(450L, Math.min(55, this.O1 - this.N1) * 30);
    }

    public final long g() {
        return Math.max(300L, Math.min(45, this.O1 - this.N1) * 25) + f() + 16;
    }

    public zh.h8 getCollectionParticles() {
        if (this.Q1 == null) {
            this.Q1 = new zh.h8(1, 8);
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
            view = this.f37648i0;
        } else {
            view = this.f37646h0;
        }
        boolean canScrollVertically = view.canScrollVertically(1);
        if (canScrollVertically != this.f37676v1) {
            this.f37676v1 = canScrollVertically;
            ViewPropertyAnimator animate = this.f37659o0.animate();
            if (canScrollVertically) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animate.alpha(f7).setDuration(200L).start();
        }
    }

    public final void i(int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j71.i(int, android.view.View):void");
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

    public final void o(android.view.View r14, org.telegram.ui.Components.z5 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j71.o(android.view.View, org.telegram.ui.Components.z5):void");
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
        org.telegram.ui.Components.o5 o5Var = this.f37658n1;
        if (o5Var != null) {
            o5Var.f28962n = this;
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
        org.telegram.ui.Components.o5 o5Var = this.f37658n1;
        if (o5Var != null) {
            o5Var.f28962n = null;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && this.W == 6) {
            this.f37666r0.y1((getMeasuredWidth() / AndroidUtilities.dp(42.0f)) * 5);
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

    public final void s(z61 z61Var) {
        Integer num = this.Y1;
        if (num != null) {
            Parcelable parcelable = (Parcelable) f37626c2.get(num);
        }
        this.T1 = z61Var;
        boolean z10 = this.Q0;
        g61 g61Var = this.f37646h0;
        if (!z10) {
            h();
            for (int i10 = 0; i10 < g61Var.getChildCount(); i10++) {
                View childAt = g61Var.getChildAt(i10);
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
            ofFloat.addUpdateListener(new l51(this, 0));
            this.U1.addListener(new gk0(this, 23));
            m51 m51Var = new m51(this, 0);
            ah.y0.f723f = true;
            ah.y0.f722e = true;
            ah.y0.f724g = false;
            if (ah.y0.d) {
                ah.y0.d = false;
            }
            ah.y0.f721c = m51Var;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.W1.lock();
            this.U1.setDuration(800L);
            g61Var.setLayerType(2, null);
            this.f37642f0.setLayerType(2, null);
            this.f37639e0.setLayerType(2, null);
            this.f37631b0.setLayerType(2, null);
            org.telegram.ui.Components.jn jnVar = this.f37657n0;
            if (jnVar != null) {
                jnVar.setLayerType(2, null);
            }
            View view = this.m0;
            if (view != null) {
                view.setLayerType(2, null);
            }
            this.f37636d0.m(true);
            E(0.0f);
            return;
        }
        h();
        E(1.0f);
    }

    public void setAnimationsEnabled(boolean z10) {
        this.P = z10;
    }

    public void setBackgroundDelegate(j61 j61Var) {
        this.U = j61Var;
    }

    public void setDrawBackground(boolean z10) {
        this.Q0 = z10;
        this.f37628a0.setClipToOutline(z10);
        di.r6 r6Var = this.f37631b0;
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
                AndroidUtilities.forEachViews((RecyclerView) this.f37646h0, (e2.h) new bi.f(29));
                for (int i10 = 0; i10 < this.f37636d0.f28470b.getChildCount(); i10++) {
                    View childAt = this.f37636d0.f28470b.getChildAt(i10);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                this.f37636d0.f28470b.invalidate();
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
        s61 s61Var = this.O;
        if (s61Var != null) {
            s61Var.h.setImageBitmap(drawable);
        }
    }

    public void setLongPressEnabled(boolean z10) {
        this.f37647h1 = z10;
    }

    public void setOnLongPressedListener(h71 h71Var) {
        this.H = h71Var;
    }

    public void setRecentReactions(List<ah.j1> list) {
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
        g61 g61Var = this.f37646h0;
        if (g61Var != null) {
            for (int i10 = 0; i10 < g61Var.getChildCount(); i10++) {
                if (g61Var.getChildAt(i10) instanceof s61) {
                    s61 s61Var = (s61) g61Var.getChildAt(i10);
                    org.telegram.ui.Components.z5 z5Var = s61Var.f40318e;
                    if (z5Var != null) {
                        s61Var.d(hashSet.contains(Long.valueOf(z5Var.getDocumentId())), true);
                    } else {
                        s61Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            g61Var.invalidate();
        }
    }

    public void setSelectedReaction(ah.j1 j1Var) {
        this.J.clear();
        this.J.add(j1Var);
        g61 g61Var = this.f37646h0;
        if (g61Var != null) {
            for (int i10 = 0; i10 < g61Var.getChildCount(); i10++) {
                if (g61Var.getChildAt(i10) instanceof s61) {
                    s61 s61Var = (s61) g61Var.getChildAt(i10);
                    s61Var.d(this.J.contains(s61Var.f40324x), true);
                }
            }
            g61Var.invalidate();
        }
        w51 w51Var = this.f37648i0;
        if (w51Var != null) {
            for (int i11 = 0; i11 < w51Var.getChildCount(); i11++) {
                if (w51Var.getChildAt(i11) instanceof s61) {
                    s61 s61Var2 = (s61) w51Var.getChildAt(i11);
                    s61Var2.d(this.J.contains(s61Var2.f40324x), true);
                }
            }
            w51Var.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<ah.j1> hashSet) {
        this.J = hashSet;
        HashSet hashSet2 = this.K;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != null && ((ah.j1) arrayList.get(i10)).f598g != 0) {
                hashSet2.add(Long.valueOf(((ah.j1) arrayList.get(i10)).f598g));
            }
        }
    }

    public boolean u() {
        return false;
    }

    public final void v(String str, boolean z10, boolean z11) {
        long j3;
        m51 m51Var = this.I1;
        if (m51Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m51Var);
            this.I1 = null;
        }
        bi.i7 i7Var = this.J1;
        if (i7Var != null) {
            AndroidUtilities.cancelRunOnUIThread(i7Var);
            this.J1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        t61 t61Var = this.f37663q0;
        a61 a61Var = this.f37642f0;
        if (isEmpty) {
            this.f37682x1 = false;
            this.f37685y1 = false;
            z(false, z10);
            if (a61Var != null) {
                a61Var.e(true);
                y61.a(a61Var, false);
            }
            t61Var.E(true);
            this.f37687z1 = null;
        } else {
            boolean z12 = this.f37682x1;
            boolean z13 = !z12;
            this.f37682x1 = true;
            this.f37685y1 = false;
            if (a61Var != null) {
                a61Var.f43004f.b(2);
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
                t61Var.E(false);
            } else if (!str.equals(this.f37687z1)) {
                m51 m51Var2 = new m51(this, 1);
                this.I1 = m51Var2;
                AndroidUtilities.runOnUIThread(m51Var2, 120L);
            }
            this.f37687z1 = str;
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            if (!Arrays.equals(currentKeyboardLanguage, a2)) {
                MediaDataController.getInstance(this.V).fetchNewEmojiKeywords(currentKeyboardLanguage);
            }
            a2 = currentKeyboardLanguage;
            bi.i7 i7Var2 = new bi.i7(this, str, z10, z13, currentKeyboardLanguage, 3);
            this.J1 = i7Var2;
            if (z11) {
                j3 = 425;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(i7Var2, j3);
            if (a61Var != null) {
                a61Var.f43004f.b(2);
                y61.a(a61Var, z10);
            }
        }
        C();
    }

    public final void w(float f7) {
        ValueAnimator valueAnimator = this.f37649i1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f37649i1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37671t0.getAlpha(), f7 * 0.25f);
        this.f37649i1 = ofFloat;
        ofFloat.addUpdateListener(new l51(this, 2));
        this.f37649i1.setDuration(200L);
        this.f37649i1.setInterpolator(org.telegram.ui.Components.pr.f29466f);
        this.f37649i1.start();
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
        g61 g61Var = this.f37646h0;
        if (g61Var != null) {
            for (int i10 = 0; i10 < g61Var.getChildCount(); i10++) {
                if (g61Var.getChildAt(i10) instanceof s61) {
                    s61 s61Var = (s61) g61Var.getChildAt(i10);
                    org.telegram.ui.Components.z5 z5Var = s61Var.f40318e;
                    if (z5Var != null && z5Var.getDocumentId() == l4.longValue()) {
                        s61Var.e(z11, z10);
                    } else {
                        TLRPC.Document document = s61Var.d;
                        if (document != null && document.f19875id == l4.longValue()) {
                            s61Var.e(z11, z10);
                        }
                    }
                }
            }
            g61Var.invalidate();
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
        this.f37655m1 = i10;
        this.f37658n1 = o5Var;
        this.f37662p1 = view;
        if (this.I && o5Var != null) {
            o5Var.f28962n = this;
        }
        invalidate();
    }

    public final void z(boolean z10, boolean z11) {
        float f7;
        if (this.F1 == z10) {
            return;
        }
        this.F1 = z10;
        g61 g61Var = this.f37646h0;
        g61Var.setVisibility(0);
        w51 w51Var = this.f37648i0;
        w51Var.setVisibility(0);
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
        ofFloat.addUpdateListener(new p51(this, z10, 0));
        this.E1.addListener(new c61(this, z10, 0));
        this.E1.setDuration(320L);
        this.E1.setInterpolator(org.telegram.ui.Components.pr.h);
        this.E1.start();
        ViewPropertyAnimator animate = ((View) g61Var.getParent()).animate();
        if (this.F1 && z11) {
            f7 = -AndroidUtilities.dp(36.0f);
        } else {
            f7 = 0.0f;
        }
        org.telegram.messenger.vl.q(animate.translationY(f7).setUpdateListener(new l51(this, 1)), org.telegram.ui.Components.pr.f29466f, 160L);
        if (this.F1 && z11) {
            w51Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        } else {
            w51Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        }
        h();
    }

    public j71(org.telegram.ui.ActionBar.n2 n2Var, Context context, boolean z10, Integer num, int i10, boolean z11, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        this(n2Var, context, z10, num, i10, z11, f6Var, i11, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20990v6, f6Var));
    }

    public j71(org.telegram.ui.ActionBar.n2 r41, android.content.Context r42, boolean r43, java.lang.Integer r44, int r45, boolean r46, org.telegram.ui.ActionBar.f6 r47, int r48, int r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j71.<init>(org.telegram.ui.ActionBar.n2, android.content.Context, boolean, java.lang.Integer, int, boolean, org.telegram.ui.ActionBar.f6, int, int):void");
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.J.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            this.J.add(ah.j1.b(str));
        }
        g61 g61Var = this.f37646h0;
        if (g61Var != null) {
            for (int i11 = 0; i11 < g61Var.getChildCount(); i11++) {
                if (g61Var.getChildAt(i11) instanceof s61) {
                    s61 s61Var = (s61) g61Var.getChildAt(i11);
                    s61Var.d(this.J.contains(s61Var.f40324x), true);
                }
            }
            g61Var.invalidate();
        }
    }

    public void m() {
    }

    public void q() {
    }

    public void setOnRecentClearedListener(i71 i71Var) {
    }

    @Override
    public void setPressed(boolean z10) {
    }

    public void r(s61 s61Var, ah.j1 j1Var) {
    }
}
