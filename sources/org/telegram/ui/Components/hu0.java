package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Pair;
import android.util.Property;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;

public abstract class hu0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Cells.l2 {
    public static final int[] Z1 = {0, 1, 2, 4};
    public static final sq0 a2 = new sq0(0);
    public final int A;
    public final ArrayList A0;
    public x30 A1;
    public final long B;
    public final ArrayList B0;
    public final org.telegram.ui.ActionBar.c6 B1;
    public final org.telegram.ui.ActionBar.k C;
    public final ArrayList C0;
    public final NotificationCenter.ObserversGroup C1;
    public final ls0 D;
    public final ArrayList D0;
    public boolean D1;
    public final bu0 E;
    public final vr0 E0;
    public final AnimationNotificationsLocker E1;
    public final vt0 F;
    public final sr0 F0;
    public km F1;
    public final ut0 G;
    public final org.telegram.ui.Cells.v0 G0;
    public int G1;
    public final ut0 H;
    public AnimatorSet H0;
    public boolean H1;
    public final ut0 I;
    public final bq0 I0;
    public int I1;
    public final nt0 J;
    public final ArrayList J0;
    public AnimatorSet J1;
    public final us0 K;
    public float K0;
    public final SparseArray K1;
    public final rs0 L;
    public final zr L0;
    public long L1;
    public final ps0 M;
    public final FrameLayout M0;
    public boolean M1;
    public final qt0 N;
    public final rr0 N0;
    public int N1;
    public final st0 O;
    public final int O0;
    public final cs0 O1;
    public final ms0 P;
    public final Paint P0;
    public jh.j6 P1;
    public final vq0 Q;
    public boolean Q0;
    public float Q1;
    public final wq0 R;
    public boolean R0;
    public boolean R1;
    public final ar0 S;
    public ig.q0 S0;
    public SpannableStringBuilder S1;
    public final qs0 T;
    public final int[] T0;
    public int T1;
    public final f2.f0 U;
    public int U0;
    public final HashMap U1;
    public final os0 V;
    public final SparseArray[] V0;
    public final HashMap V1;
    public final eu0 W;
    public int W0;
    public int W1;
    public boolean X0;
    public int X1;
    public long Y0;
    public final wg Y1;
    public TLRPC.ChatFull Z0;

    public boolean f29105a;

    public final uq0 f29106a0;

    public TLRPC.UserFull f29107a1;

    public boolean f29108b;

    public final eu0 f29109b0;

    public AnimatorSet f29110b1;

    public boolean f29111c;

    public final ct0 f29112c0;

    public boolean f29113c1;
    public boolean d;

    public final ct0 f29114d0;

    public boolean f29115d1;

    public int f29116e;

    public final ct0 f29117e0;

    public boolean f29118e1;

    public int f29119f;

    public final xs0 f29120f0;

    public final long f29121f1;

    public final zs0[] f29122g0;

    public boolean f29123g1;
    public float h;

    public final org.telegram.ui.ActionBar.v0 f29124h0;

    public boolean f29125h1;

    public final org.telegram.ui.ActionBar.v0 f29126i0;

    public final int[] f29127i1;

    public final org.telegram.ui.ActionBar.v0 f29128j0;

    public float f29129j1;

    public float f29130k0;

    public boolean f29131k1;

    public float f29132l0;
    public int l1;
    public final TextView m0;

    public int f29133m1;

    public float f29134n;

    public final ImageView f29135n0;

    public final fr0 f29136n1;

    public final ri0 f29137o0;

    public float f29138o1;

    public final org.telegram.ui.ActionBar.v0 f29139p0;

    public final wt0[] f29140p1;

    public final org.telegram.ui.ActionBar.v0 f29141q0;

    public final zt0 f29142q1;

    public boolean f29143r;

    public final org.telegram.ui.ActionBar.v0 f29144r0;

    public final org.telegram.ui.ActionBar.n2 f29145r1;

    public int f29146s;

    public final org.telegram.ui.ActionBar.v0 f29147s0;

    public int f29148s1;

    public int f29149t0;

    public boolean f29150t1;

    public final Drawable f29151u0;

    public boolean f29152u1;
    public int v;

    public boolean f29153v0;

    public int f29154v1;

    public int f29155w;

    public final NumberTextView f29156w0;

    public int f29157w1;

    public final Rect f29158x;

    public final x9 f29159x0;

    public VelocityTracker f29160x1;

    public final h00 f29161y;

    public final ImageView f29162y0;

    public boolean f29163y1;

    public final org.telegram.ui.ActionBar.g2 f29164z0;

    public final ss0 f29165z1;

    public hu0(Context context, long j10, zt0 zt0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, org.telegram.ui.ActionBar.n2 n2Var, ss0 ss0Var, int i13, org.telegram.ui.ActionBar.c6 c6Var, jg.a aVar) {
        char c10;
        TLRPC.ProfileTab profileTab;
        int i14;
        wt0[] wt0VarArr;
        int iS0;
        int iS1;
        int i15;
        sr0 sr0Var;
        vr0 vr0Var;
        int currentTabId;
        vr0 vr0Var2;
        int i16;
        int i17;
        qt0 qt0Var;
        float f10;
        Context context2;
        org.telegram.ui.ActionBar.v0 v0Var;
        org.telegram.ui.ActionBar.n2 n2Var2;
        zu0 zu0Var;
        ?? x9Var;
        int i18;
        int i19;
        qs0 qs0Var;
        ?? r10;
        org.telegram.ui.ActionBar.c6 c6Var2;
        hu0 hu0Var;
        zr zrVar;
        int iC;
        ?? r11;
        int top;
        int iL0;
        int i20;
        zs0[] zs0VarArr;
        ar0 ar0Var;
        boolean zN;
        ?? r12;
        ar0 ar0Var2;
        long j11;
        int i21;
        int i22;
        br0 br0Var;
        cr0 cr0Var;
        zs0 zs0Var;
        cr0 cr0Var2;
        org.telegram.ui.ActionBar.z zVarN;
        sr0 sr0Var2;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        TL_bots.BotInfo botInfo;
        super(context);
        hu0 hu0Var2 = this;
        TLRPC.ChatFull chatFull2 = chatFull;
        hu0Var2.f29158x = new Rect();
        hu0Var2.f29122g0 = new zs0[2];
        hu0Var2.A0 = new ArrayList(10);
        hu0Var2.B0 = new ArrayList(10);
        hu0Var2.C0 = new ArrayList(10);
        hu0Var2.D0 = new ArrayList(10);
        hu0Var2.I0 = new bq0(hu0Var2, 2);
        hu0Var2.J0 = new ArrayList();
        hu0Var2.P0 = new Paint();
        hu0Var2.V0 = new SparseArray[]{new SparseArray(), new SparseArray()};
        hu0Var2.f29123g1 = false;
        hu0Var2.f29125h1 = false;
        hu0Var2.f29127i1 = new int[]{3, 3};
        hu0Var2.f29136n1 = new fr0(hu0Var2);
        hu0Var2.f29138o1 = -5.0f;
        hu0Var2.f29140p1 = new wt0[9];
        hu0Var2.E1 = new AnimationNotificationsLocker();
        hu0Var2.K1 = new SparseArray();
        hu0Var2.N1 = -1;
        hu0Var2.O1 = new cs0(hu0Var2);
        hu0Var2.Q1 = 0.0f;
        hu0Var2.U1 = new HashMap();
        hu0Var2.V1 = new HashMap();
        og.c cVar = new og.c();
        cVar.a(hu0Var2.h0(org.telegram.ui.ActionBar.g6.f23053d6));
        ?? aVar2 = aVar == null ? new jg.a(cVar) : aVar;
        hu0Var2.A = i13;
        hu0Var2.B1 = c6Var;
        h00 h00Var = new h00(context);
        hu0Var2.f29161y = h00Var;
        h00Var.setIsSingleCell(true);
        TLRPC.User user = n2Var.getMessagesController().getUser(Long.valueOf(j10));
        hu0Var2.f29142q1 = zt0Var;
        hu0Var2.f29165z1 = ss0Var;
        int[] iArr = zt0Var.f35350c;
        long j12 = zt0Var.f35355s;
        hu0Var2.B = j12;
        int[] iArr2 = {iArr[0], iArr[1], iArr[2], iArr[3], iArr[4], iArr[5], j12 == 0 ? i10 : 0, iArr[7], iArr[8]};
        hu0Var2.T0 = iArr2;
        if (userFull == null) {
            if (chatFull2 != null) {
                profileTab = chatFull2.main_tab;
            } else {
                c10 = 5;
                profileTab = null;
            }
            if (i11 != 14 || i11 == 10 || i11 == 11 || i11 == 6) {
                hu0Var2.U0 = i11;
            } else if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                hu0Var2.U0 = 13;
            } else if (userFull != null && (botInfo = userFull.bot_info) != null && botInfo.has_preview_medias) {
                hu0Var2.U0 = 8;
            } else if ((profileTab instanceof TLRPC.TL_profileTabPosts) && ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || hu0Var2.v0()))) {
                hu0Var2.U0 = 8;
            } else if (!(profileTab instanceof TLRPC.TL_profileTabGifts) || ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0))) {
                if (profileTab instanceof TLRPC.TL_profileTabFiles) {
                    int i31 = iArr2[1];
                    i26 = -1;
                    if (i31 == -1 || i31 > 0) {
                        hu0Var2.U0 = 1;
                    }
                } else {
                    i26 = -1;
                }
                if ((profileTab instanceof TLRPC.TL_profileTabGifs) && ((i30 = iArr2[c10]) == i26 || i30 > 0)) {
                    hu0Var2.U0 = 5;
                } else if ((profileTab instanceof TLRPC.TL_profileTabLinks) && ((i29 = iArr2[3]) == i26 || i29 > 0)) {
                    hu0Var2.U0 = 3;
                } else if ((profileTab instanceof TLRPC.TL_profileTabMusic) && ((i28 = iArr2[4]) == i26 || i28 > 0)) {
                    hu0Var2.U0 = 4;
                } else if ((profileTab instanceof TLRPC.TL_profileTabVoice) && ((i27 = iArr2[2]) == i26 || i27 > 0)) {
                    hu0Var2.U0 = 2;
                } else if ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || hu0Var2.v0())) {
                    hu0Var2.U0 = hu0Var2.getInitialTab();
                } else if ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0)) {
                    int i32 = -1;
                    if (i11 == -1 || j12 != 0) {
                        int i33 = 0;
                        while (true) {
                            int[] iArr3 = hu0Var2.T0;
                            if (i33 >= iArr3.length) {
                                break;
                            }
                            int i34 = iArr3[i33];
                            if (i34 == i32 || i34 > 0) {
                                hu0Var2.U0 = i33;
                                break;
                            } else {
                                i33++;
                                i32 = -1;
                            }
                        }
                    } else {
                        hu0Var2.U0 = i11;
                    }
                } else {
                    hu0Var2.U0 = 14;
                }
            } else {
                hu0Var2.U0 = 14;
            }
            hu0Var2.M0(i11);
            hu0Var2.Z0 = chatFull2;
            hu0Var2.f29107a1 = userFull;
            if (chatFull2 != null) {
                hu0Var2.Y0 = -chatFull2.migrated_from_chat_id;
            }
            hu0Var2.f29121f1 = j10;
            i14 = 0;
            while (true) {
                wt0VarArr = hu0Var2.f29140p1;
                if (i14 < wt0VarArr.length) {
                    break;
                }
                wt0VarArr[i14] = new wt0();
                int[] iArr4 = hu0Var2.f29140p1[i14].f34332j;
                if (DialogObject.isEncryptedDialog(hu0Var2.f29121f1)) {
                    i25 = Integer.MIN_VALUE;
                } else {
                    i25 = Integer.MAX_VALUE;
                }
                iArr4[0] = i25;
                hu0Var2.f29140p1[i14].f34332j[1] = Integer.MAX_VALUE;
                hu0Var2.R(i14);
                if (hu0Var2.Y0 == 0 && hu0Var2.Z0 != null && hu0Var2.f29140p1[i14].f34326b[1].size() == 0) {
                    wt0 wt0Var = hu0Var2.f29140p1[i14];
                    wt0Var.f34332j[1] = hu0Var2.Z0.migrated_from_max_id;
                    wt0Var.f34331i[1] = false;
                }
                i14++;
            }
            hu0Var2.f29145r1 = n2Var;
            hu0Var2.C = n2Var.getActionBar();
            int[] iArr5 = hu0Var2.f29127i1;
            if (hu0Var2.S0() <= 0) {
                iS0 = SharedConfig.mediaColumnsCount;
            } else {
                iS0 = hu0Var2.S0();
            }
            iArr5[0] = iS0;
            int[] iArr6 = hu0Var2.f29127i1;
            if (hu0Var2.S0() <= 0) {
                iS1 = SharedConfig.storiesColumnsCount;
            } else {
                iS1 = hu0Var2.S0();
            }
            iArr6[1] = iS1;
            hu0Var2.C1 = n2Var.getNotificationCenter().createObserversGroup(hu0Var2).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.storiesUpdated).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.savedMessagesDialogsUpdate).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.starUserGiftsLoaded).add(NotificationCenter.updatedChatRanks).add(NotificationCenter.didUpdatePollResults);
            for (i15 = 0; i15 < 10; i15++) {
                if (i11 == 4) {
                    qr0 qr0Var = new qr0(hu0Var2, context);
                    qr0Var.P.c();
                    hu0Var2.C0.add(qr0Var);
                }
            }
            hu0Var2.O0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            hu0Var2.R0 = false;
            hu0Var2.S0 = null;
            sr0Var = hu0Var2.F0;
            if (sr0Var != null) {
                sr0Var.g(false);
            }
            hu0Var2.Q0 = false;
            Drawable drawable = context.getResources().getDrawable(R.drawable.photos_header_shadow);
            hu0Var2.f29151u0 = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(hu0Var2.h0(org.telegram.ui.ActionBar.g6.f23018b7), PorterDuff.Mode.MULTIPLY));
            vr0Var = hu0Var2.E0;
            if (vr0Var != null) {
                currentTabId = vr0Var.getCurrentTabId();
            } else {
                currentTabId = i11;
            }
            vr0Var2 = new vr0(hu0Var2, context, hu0Var2.B1);
            i16 = hu0Var2.U0;
            if (i16 != -1) {
                vr0Var2.setInitialTabId(i16);
                hu0Var2.U0 = -1;
            }
            vr0Var2.U = 320L;
            int i35 = org.telegram.ui.ActionBar.g6.Fh;
            int i36 = org.telegram.ui.ActionBar.g6.Eh;
            vr0Var2.H = i35;
            vr0Var2.I = i36;
            vr0Var2.d();
            vr0Var2.setUseMinimalWidth(true);
            vr0Var2.setDelegate(new xr0(hu0Var2));
            hu0Var2.E0 = vr0Var2;
            for (i17 = 1; i17 >= 0; i17--) {
                hu0Var2.V0[i17].clear();
            }
            hu0Var2.W0 = 0;
            hu0Var2.J0.clear();
            qt0Var = hu0Var2.N;
            if (qt0Var != null) {
                qt0Var.f31979w.clear();
            }
            if (!(hu0Var2 instanceof n30)) {
                zVarN = hu0Var2.C.n();
                zVarN.addOnLayoutChangeListener(new wr0(hu0Var2));
                if (hu0Var2.f29121f1 == hu0Var2.f29145r1.getUserConfig().getClientUserId() && (hu0Var2.f29145r1 instanceof o90) && hu0Var2.D()) {
                    hu0Var2.f29126i0 = zVarN.a(11, R.drawable.outline_header_search);
                }
                org.telegram.ui.ActionBar.v0 v0VarA = zVarN.a(0, 0);
                v0VarA.F();
                v0VarA.D = new ds0(hu0Var2);
                hu0Var2.f29128j0 = v0VarA;
                v0VarA.setTranslationY(AndroidUtilities.dp(10.0f));
                sr0Var2 = hu0Var2.F0;
                if (sr0Var2 == null && sr0Var2.a() && hu0Var2.getSelectedTab() == 11) {
                    i23 = R.string.SavedTagSearchHint;
                } else {
                    i23 = R.string.Search;
                }
                v0VarA.setSearchFieldHint(LocaleController.getString(i23));
                v0VarA.setContentDescription(LocaleController.getString("Search", R.string.Search));
                if (hu0Var2.v0()) {
                    i24 = 8;
                } else {
                    i24 = 4;
                }
                v0VarA.setVisibility(i24);
            }
            ImageView imageView = new ImageView(context);
            hu0Var2.f29135n0 = imageView;
            imageView.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
            imageView.setTranslationY(AndroidUtilities.dp(10.0f));
            imageView.setVisibility(4);
            if (!hu0Var2.q0() || hu0Var2.t0()) {
                f10 = 2.0f;
            } else {
                hu0Var2.C.addView(imageView, h7.z5.e(48, 56, 85));
                ri0 ri0Var = new ri0(context);
                hu0Var2.f29137o0 = ri0Var;
                ri0Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                ri0Var.e(R.raw.options_to_search, 24, 24);
                ri0Var.getAnimatedDrawable().B *= 2.0f;
                ri0Var.getAnimatedDrawable().h = true;
                f10 = 2.0f;
                ri0Var.setColorFilter(new PorterDuffColorFilter(hu0Var2.h0(org.telegram.ui.ActionBar.g6.f23425y8), PorterDuff.Mode.SRC_IN));
                ri0Var.setVisibility(8);
                hu0Var2.C.addView(ri0Var, h7.z5.e(48, 56, 85));
            }
            context2 = context;
            imageView.setOnClickListener(new ks0(hu0Var2, j10, c6Var, context));
            v0Var = hu0Var2.f29128j0;
            if (v0Var != null) {
                EditTextBoldCursor searchField = v0Var.getSearchField();
                int i37 = org.telegram.ui.ActionBar.g6.G6;
                searchField.setTextColor(hu0Var2.h0(i37));
                searchField.setHintTextColor(hu0Var2.h0(org.telegram.ui.ActionBar.g6.Si));
                searchField.setCursorColor(hu0Var2.h0(i37));
            }
            hu0Var2.f29149t0 = 0;
            n2Var2 = hu0Var2.f29145r1;
            if (n2Var2 == null && (n2Var2.getFragmentView() instanceof zu0)) {
                zu0Var = (zu0) hu0Var2.f29145r1.getFragmentView();
            } else {
                zu0Var = null;
            }
            x9Var = new x9(context2, zu0Var);
            hu0Var2.f29159x0 = x9Var;
            x9Var.setBackgroundColor(hu0Var2.h0(org.telegram.ui.ActionBar.g6.f22999a7));
            x9Var.setAlpha(0.0f);
            x9Var.setClickable(true);
            x9Var.setVisibility(4);
            ImageView imageView2 = new ImageView(context2);
            hu0Var2.f29162y0 = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(true);
            hu0Var2.f29164z0 = g2Var;
            imageView2.setImageDrawable(g2Var);
            i18 = org.telegram.ui.ActionBar.g6.f23425y8;
            g2Var.a(hu0Var2.h0(i18));
            i19 = org.telegram.ui.ActionBar.g6.f23443z8;
            imageView2.setBackground(org.telegram.ui.ActionBar.g6.e0(hu0Var2.h0(i19), 1));
            imageView2.setContentDescription(LocaleController.getString("Close", R.string.Close));
            x9Var.addView(imageView2, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
            hu0Var2.J0.add(imageView2);
            imageView2.setOnClickListener(new dq0(hu0Var2, 0));
            NumberTextView numberTextView = new NumberTextView(context2);
            hu0Var2.f29156w0 = numberTextView;
            numberTextView.setTextSize(18);
            numberTextView.setTypeface(AndroidUtilities.bold());
            numberTextView.setTextColor(hu0Var2.h0(i18));
            x9Var.addView(numberTextView, h7.z5.m(1.0f, 0, -1, 18, 0, 0));
            hu0Var2.J0.add(numberTextView);
            if (!DialogObject.isEncryptedDialog(hu0Var2.f29121f1)) {
                if (!hu0Var2.v0()) {
                    org.telegram.ui.ActionBar.v0 v0Var2 = new org.telegram.ui.ActionBar.v0(context2, hu0Var2.h0(i19), hu0Var2.h0(i18), false);
                    hu0Var2.f29141q0 = v0Var2;
                    v0Var2.setIcon(R.drawable.msg_message);
                    v0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrGoToMessage));
                    v0Var2.setDuplicateParentStateEnabled(false);
                    x9Var.addView(v0Var2, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                    hu0Var2.J0.add(v0Var2);
                    v0Var2.setOnClickListener(new dq0(hu0Var2, 1));
                    org.telegram.ui.ActionBar.v0 v0Var3 = new org.telegram.ui.ActionBar.v0(context2, hu0Var2.h0(i19), hu0Var2.h0(i18), false);
                    hu0Var2.f29139p0 = v0Var3;
                    v0Var3.setIcon(R.drawable.msg_forward);
                    v0Var3.setContentDescription(LocaleController.getString(R.string.Forward));
                    v0Var3.setDuplicateParentStateEnabled(false);
                    x9Var.addView(v0Var3, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                    hu0Var2.J0.add(v0Var3);
                    v0Var3.setOnClickListener(new dq0(hu0Var2, 2));
                }
                org.telegram.ui.ActionBar.v0 v0Var4 = new org.telegram.ui.ActionBar.v0(context2, hu0Var2.h0(i19), hu0Var2.h0(i18), false);
                hu0Var2.f29144r0 = v0Var4;
                v0Var4.setIcon(R.drawable.msg_pin);
                v0Var4.setContentDescription(LocaleController.getString(R.string.PinMessage));
                v0Var4.setDuplicateParentStateEnabled(false);
                v0Var4.setVisibility(8);
                x9Var.addView(v0Var4, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                hu0Var2.J0.add(v0Var4);
                v0Var4.setOnClickListener(new dq0(hu0Var2, 3));
                org.telegram.ui.ActionBar.v0 v0Var5 = new org.telegram.ui.ActionBar.v0(context2, hu0Var2.h0(i19), hu0Var2.h0(i18), false);
                hu0Var2.f29147s0 = v0Var5;
                v0Var5.setIcon(R.drawable.msg_unpin);
                v0Var5.setContentDescription(LocaleController.getString(R.string.UnpinMessage));
                v0Var5.setDuplicateParentStateEnabled(false);
                v0Var5.setVisibility(8);
                x9Var.addView(v0Var5, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                hu0Var2.J0.add(v0Var5);
                v0Var5.setOnClickListener(new dq0(hu0Var2, 4));
                hu0Var2.p1();
            }
            org.telegram.ui.ActionBar.v0 v0Var6 = new org.telegram.ui.ActionBar.v0(context2, hu0Var2.h0(i19), hu0Var2.h0(i18), false);
            hu0Var2.f29124h0 = v0Var6;
            v0Var6.setIcon(R.drawable.msg_delete);
            v0Var6.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
            v0Var6.setDuplicateParentStateEnabled(false);
            x9Var.addView(v0Var6, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
            hu0Var2.J0.add(v0Var6);
            v0Var6.setOnClickListener(new dq0(hu0Var2, 5));
            hu0Var2.D = new ls0(hu0Var2, context2);
            hu0Var2.E = new bu0(hu0Var2, context2);
            hu0Var2.G = new ut0(hu0Var2, context2, 1);
            hu0Var2.H = new ut0(hu0Var2, context2, 2);
            hu0Var2.I = new ut0(hu0Var2, context2, 4);
            hu0Var2.J = new nt0(hu0Var2, context2, hu0Var2.f29145r1.getCurrentAccount(), hu0Var2.f29145r1.getResourceProvider());
            hu0Var2.K = new us0(hu0Var2, context2);
            hu0Var2.f29112c0 = new ct0(hu0Var2, context2, 1);
            hu0Var2.f29114d0 = new ct0(hu0Var2, context2, 4);
            hu0Var2.f29117e0 = new ct0(hu0Var2, context2, 3);
            hu0Var2.f29120f0 = new xs0(hu0Var2, context2);
            hu0Var2.L = new rs0(hu0Var2, context2);
            hu0Var2.M = new ps0(hu0Var2, context2);
            hu0Var2.N = new qt0(hu0Var2, context2);
            hu0Var2.O = new st0(hu0Var2, context2);
            if (!hu0Var2.v0() && !hu0Var2.l0() && hu0Var2.B == 0) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", hu0Var2.f29145r1.getUserConfig().getClientUserId());
                bundle.putInt("chatMode", 3);
                ms0 ms0Var = new ms0(hu0Var2, context2, hu0Var2.f29145r1.getParentLayout(), bundle);
                hu0Var2.P = ms0Var;
                long j13 = hu0Var2.f29121f1;
                org.telegram.ui.sn snVar = ms0Var.f42977a;
                snVar.Z3 = j13;
                snVar.La = true;
                ms0Var.setClipToOutline(true);
                ms0Var.setOutlineProvider(new ns0());
            }
            qs0Var = new qs0(hu0Var2, context2);
            hu0Var2.T = qs0Var;
            if (hu0Var2.B == 0) {
                qs0Var.f31970e = arrayList;
                qs0Var.d = currentTabId != 7 ? null : chatFull2;
            }
            hu0Var2.V = new os0(hu0Var2, context2);
            hu0Var2.U = new f2.f0(new tq0(hu0Var2));
            hu0Var2.W = new eu0(hu0Var2, context2, false);
            hu0Var2.f29106a0 = new uq0(hu0Var2, context2);
            hu0Var2.f29109b0 = new eu0(hu0Var2, context2, true);
            hu0Var2.F = new vt0(hu0Var2, context2);
            if (hu0Var2.r0()) {
                if (hu0Var2.f29145r1 instanceof ProfileActivity) {
                    TextView textView = new TextView(context2);
                    hu0Var2.m0 = textView;
                    textView.setText(LocaleController.getString(R.string.Save).toUpperCase());
                    textView.setTypeface(AndroidUtilities.bold());
                    int i38 = org.telegram.ui.ActionBar.g6.Oh;
                    textView.setTextColor(hu0Var2.h0(i38));
                    textView.setTextSize(1, 15.0f);
                    textView.setGravity(17);
                    textView.setBackground(org.telegram.ui.ActionBar.g6.e0(org.telegram.ui.ActionBar.g6.l1(0.15f, hu0Var2.h0(i38)), 3));
                    textView.setPadding(AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(19.0f), 0);
                    hu0Var2.C.addView(textView, h7.z5.e(-2, 56, 85));
                    textView.setOnClickListener(new dq0(hu0Var2, 6));
                    textView.setVisibility(8);
                    textView.setAlpha(0.0f);
                    textView.setScaleX(0.4f);
                    textView.setScaleY(0.4f);
                    org.telegram.ui.ActionBar.n2 n2Var3 = hu0Var2.f29145r1;
                    r10 = 0;
                    c6Var2 = c6Var;
                    wq0 wq0Var = new wq0(n2Var3.getCurrentAccount(), ((ProfileActivity) hu0Var2.f29145r1).a(), context2, n2Var3, c6Var2, hu0Var2);
                    hu0Var.R = wq0Var;
                    int iDp = AndroidUtilities.dp(48.0f);
                    zrVar = hu0Var.L0;
                    if (zrVar != null) {
                        context2 = context2;
                        hu0Var = hu0Var2;
                        iC = (int) zrVar.c(0.0f);
                    } else {
                        context2 = context2;
                        hu0Var = hu0Var2;
                        iC = 0;
                    }
                    wq0Var.setPaddingTop(iDp + iC);
                    hu0Var.S = new ar0(hu0Var, context2, zu0Var, hu0Var.getStoriesController().B(hu0Var.f29121f1, true), new zq0(hu0Var, context2, n2Var, c6Var2));
                    r11 = hu0Var;
                }
                r11.setWillNotDraw(false);
                top = 0;
                iL0 = -1;
                i20 = 0;
                while (true) {
                    zs0VarArr = r11.f29122g0;
                    if (i20 < zs0VarArr.length) {
                        break;
                    }
                    if (i20 == 0 || (zs0Var = zs0VarArr[i20]) == null || (cr0Var2 = zs0Var.f35343x) == null) {
                        i21 = top;
                        i22 = iL0;
                    } else {
                        iL0 = cr0Var2.L0();
                        if (iL0 != r11.f29122g0[i20].f35343x.B() - 1) {
                            lk0 lk0Var = (lk0) r11.f29122g0[i20].h.K(iL0);
                            if (lk0Var != null) {
                                top = lk0Var.f5789a.getTop();
                            } else {
                                iL0 = -1;
                            }
                            i21 = top;
                            i22 = iL0;
                        } else {
                            i21 = top;
                            i22 = -1;
                        }
                    }
                    br0Var = new br0(r11, context2);
                    r11.addView(br0Var, h7.z5.d(-1, -1.0f, 51, 0.0f, r11.B0(), 0.0f, 0.0f));
                    if (i20 == 1) {
                        br0Var.setTranslationX(AndroidUtilities.displaySize.x);
                    }
                    r11.f29122g0[i20] = br0Var;
                    cr0Var = new cr0(r11, br0Var);
                    br0Var.f35343x = cr0Var;
                    cr0Var.z1(new dr0(r11, br0Var));
                    r11.f29122g0[i20].d = new f2.l();
                    r11.f29122g0[i20].d.n(280L);
                    r11.f29122g0[i20].d.o(er.h);
                    zs0 zs0Var2 = r11.f29122g0[i20];
                    zs0Var2.d.f5819m = false;
                    zs0Var2.h = new er0(r11, context2, br0Var, cr0Var);
                    r11.f29122g0[i20].h.setFastScrollEnabled(1);
                    r11.f29122g0[i20].h.setScrollingTouchSlop(1);
                    r11.f29122g0[i20].h.setPinnedSectionOffsetY(-AndroidUtilities.dp(f10));
                    r11.f29122g0[i20].h.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
                    r11.f29122g0[i20].h.setItemAnimator(r10);
                    r11.f29122g0[i20].h.setClipToPadding(false);
                    r11.f29122g0[i20].h.setSectionsType(2);
                    r11.f29122g0[i20].h.setLayoutManager(cr0Var);
                    zs0 zs0Var3 = r11.f29122g0[i20];
                    zs0Var3.addView(zs0Var3.h, h7.z5.c(-1.0f, -1));
                    r11.f29122g0[i20].f35340r = new ys0(context2, r10);
                    zs0 zs0Var4 = r11.f29122g0[i20];
                    ys0 ys0Var = zs0Var4.f35340r;
                    gr0 gr0Var = new gr0(r11);
                    zs0Var4.f35341s = gr0Var;
                    ys0Var.setLayoutManager(gr0Var);
                    zs0 zs0Var5 = r11.f29122g0[i20];
                    zs0Var5.addView(zs0Var5.f35340r, h7.z5.c(-1.0f, -1));
                    r11.f29122g0[i20].f35340r.setVisibility(8);
                    r11.f29122g0[i20].f35340r.i(new hr0(br0Var));
                    r11.f29122g0[i20].h.i(new ir0(r11, br0Var));
                    r11.f29122g0[i20].h.setOnItemClickListener(new hh.c3(r11, br0Var, context2, j10, c6Var2, 2));
                    r11.f29122g0[i20].h.setOnScrollListener(new kr0(r11, br0Var, cr0Var));
                    r11.f29122g0[i20].h.setOnItemLongClickListener(new lr0(r11, br0Var));
                    if (i20 == 0 && i22 != -1) {
                        cr0Var.h1(i22, i21);
                    }
                    r11.f29122g0[i20].f35344y = new mr0(context2, r11.f29122g0[i20].h);
                    r11.f29122g0[i20].f35344y.setVisibility(8);
                    r11.f29122g0[i20].h.D0(r11.f29122g0[i20].f35344y, h7.z5.c(-1.0f, -1));
                    r11.f29122g0[i20].v = new nr0(r11, context2, br0Var);
                    r11.f29122g0[i20].v.g();
                    r11.f29122g0[i20].v.setClipToOutline(true);
                    r11.f29122g0[i20].v.setOutlineProvider(new or0());
                    if (i20 != 0) {
                        r11.f29122g0[i20].setVisibility(8);
                    }
                    zs0 zs0Var6 = r11.f29122g0[i20];
                    zs0Var6.f35342w = new pr0(r11, context2, zs0Var6.v);
                    r11.f29122g0[i20].f35342w.d(8, false);
                    r11.f29122g0[i20].f35342w.setAnimateLayoutChange(true);
                    zs0 zs0Var7 = r11.f29122g0[i20];
                    zs0Var7.addView(zs0Var7.f35342w, h7.z5.c(-1.0f, -1));
                    r11.f29122g0[i20].f35342w.setOnTouchListener(new kh.e(23));
                    r11.f29122g0[i20].f35342w.e(true, false);
                    r11.f29122g0[i20].f35342w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                    r11.f29122g0[i20].f35342w.f29507f.setVisibility(8);
                    r11.f29122g0[i20].f35342w.f29506e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    r11.f29122g0[i20].f35342w.f29507f.setVisibility(8);
                    r11.f29122g0[i20].f35342w.addView(r11.f29122g0[i20].v, h7.z5.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                    r11.f29122g0[i20].h.setEmptyView(r11.f29122g0[i20].f35342w);
                    r11.f29122g0[i20].h.m1(0, true);
                    zs0[] zs0VarArr2 = r11.f29122g0;
                    zs0VarArr2[i20].A = new c2.x(zs0VarArr2[i20].h, r11.f29122g0[i20].f35343x);
                    i20++;
                    c6Var2 = c6Var;
                    top = i21;
                    iL0 = i22;
                }
                ar0Var = r11.S;
                if (ar0Var != null) {
                    r11.addView(ar0Var, h7.z5.d(-1, 42.0f, 48, 0.0f, 48.0f, 0.0f, 0.0f));
                }
                org.telegram.ui.Cells.v0 v0Var7 = new org.telegram.ui.Cells.v0(context2);
                r11.G0 = v0Var7;
                v0Var7.T((int) (System.currentTimeMillis() / 1000), false, false);
                v0Var7.setAlpha(0.0f);
                v0Var7.V(org.telegram.ui.ActionBar.g6.f23395wc, org.telegram.ui.ActionBar.g6.f23187kd);
                v0Var7.setTranslationY(-AndroidUtilities.dp(48.0f));
                r11.addView(v0Var7, h7.z5.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
                zN = r11.N();
                r12 = r11;
                if (!zN) {
                    ?? zrVar2 = new zr(context2);
                    r11.L0 = zrVar2;
                    zrVar2.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
                    lg.d dVarB = aVar2.b(zrVar2, ng.c.m(c6Var));
                    dVarB.p(AndroidUtilities.dp(24.0f));
                    dVarB.o(AndroidUtilities.dp(7.0f));
                    zrVar2.setBlurredBackground(dVarB);
                    FrameLayout frameLayout = new FrameLayout(context2);
                    r11.M0 = frameLayout;
                    zrVar2.addView(frameLayout);
                    zrVar2.i(frameLayout, true, false);
                    zrVar2.setOnAnimatedHeightChangedListener(new bq0(r11, 0));
                    rr0 rr0Var = new rr0(r11, context2, n2Var, this, c6Var);
                    r11.N0 = rr0Var;
                    frameLayout.addView(rr0Var);
                    zrVar2.setCallFragmentContextView(rr0Var);
                    r11.addView(zrVar2, h7.z5.d(-1, -2.0f, 48, 0.0f, 34.0f, 0.0f, 0.0f));
                    rr0Var.setDelegate(new cq0(r11));
                    lg.d dVarB2 = aVar2.b(r11.E0, ng.c.m(c6Var));
                    dVarB2.p(AndroidUtilities.dp(18.0f));
                    dVarB2.o(AndroidUtilities.dp(6.666f));
                    r11.E0.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
                    r11.E0.setClipToPadding(false);
                    r11.E0.setBackground(r10);
                    r11.E0.setBlurredBackground(dVarB2);
                    r11.E0.setOpen(false);
                    r11.addView(r11.E0, h7.z5.d(-2, 50.0f, 49, -2.0f, 0.0f, -2.0f, 0.0f));
                    Context context3 = r11.getContext();
                    org.telegram.ui.ActionBar.n2 n2Var4 = r11.f29145r1;
                    int currentAccount = n2Var4.getCurrentAccount();
                    if (r11.l0()) {
                        j11 = 0;
                    } else {
                        j11 = r11.f29121f1;
                    }
                    ?? r47 = r11;
                    ?? sr0Var3 = new sr0(currentAccount, j11, context3, n2Var4, c6Var, r47);
                    ?? r13 = r47;
                    r13.F0 = sr0Var3;
                    sr0Var3.d(aVar2, ng.c.m(c6Var));
                    sr0Var3.setShown(0.0f);
                    r13.addView(sr0Var3, h7.z5.d(-1, 38.0f, 51, 0.0f, 4.0f, 0.0f, 0.0f));
                    r13.addView(r13.f29159x0, h7.z5.e(-1, 48, 51));
                    r12 = r13;
                }
                r12.v1(false);
                r12.m1(false);
                if (r12.T0[0] >= 0) {
                    r12.z0(false);
                }
                ar0Var2 = r12.S;
                if (ar0Var2 != null && i12 > 0) {
                    ar0Var2.setInitialTabId(i12);
                }
                r12.Y1 = new wg(r12, 2);
            }
            hu0Var2.Q = new vq0(hu0Var2, context2, hu0Var2.f29145r1, hu0Var2.f29121f1);
            c6Var2 = c6Var;
            r10 = 0;
            r11 = hu0Var2;
            r11.setWillNotDraw(false);
            top = 0;
            iL0 = -1;
            i20 = 0;
            while (true) {
                zs0VarArr = r11.f29122g0;
                if (i20 < zs0VarArr.length) {
                    break;
                    break;
                }
                if (i20 == 0) {
                    i21 = top;
                    i22 = iL0;
                } else {
                    i21 = top;
                    i22 = iL0;
                }
                br0Var = new br0(r11, context2);
                r11.addView(br0Var, h7.z5.d(-1, -1.0f, 51, 0.0f, r11.B0(), 0.0f, 0.0f));
                if (i20 == 1) {
                    br0Var.setTranslationX(AndroidUtilities.displaySize.x);
                }
                r11.f29122g0[i20] = br0Var;
                cr0Var = new cr0(r11, br0Var);
                br0Var.f35343x = cr0Var;
                cr0Var.z1(new dr0(r11, br0Var));
                r11.f29122g0[i20].d = new f2.l();
                r11.f29122g0[i20].d.n(280L);
                r11.f29122g0[i20].d.o(er.h);
                zs0 zs0Var8 = r11.f29122g0[i20];
                zs0Var8.d.f5819m = false;
                zs0Var8.h = new er0(r11, context2, br0Var, cr0Var);
                r11.f29122g0[i20].h.setFastScrollEnabled(1);
                r11.f29122g0[i20].h.setScrollingTouchSlop(1);
                r11.f29122g0[i20].h.setPinnedSectionOffsetY(-AndroidUtilities.dp(f10));
                r11.f29122g0[i20].h.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
                r11.f29122g0[i20].h.setItemAnimator(r10);
                r11.f29122g0[i20].h.setClipToPadding(false);
                r11.f29122g0[i20].h.setSectionsType(2);
                r11.f29122g0[i20].h.setLayoutManager(cr0Var);
                zs0 zs0Var9 = r11.f29122g0[i20];
                zs0Var9.addView(zs0Var9.h, h7.z5.c(-1.0f, -1));
                r11.f29122g0[i20].f35340r = new ys0(context2, r10);
                zs0 zs0Var10 = r11.f29122g0[i20];
                ys0 ys0Var2 = zs0Var10.f35340r;
                gr0 gr0Var2 = new gr0(r11);
                zs0Var10.f35341s = gr0Var2;
                ys0Var2.setLayoutManager(gr0Var2);
                zs0 zs0Var11 = r11.f29122g0[i20];
                zs0Var11.addView(zs0Var11.f35340r, h7.z5.c(-1.0f, -1));
                r11.f29122g0[i20].f35340r.setVisibility(8);
                r11.f29122g0[i20].f35340r.i(new hr0(br0Var));
                r11.f29122g0[i20].h.i(new ir0(r11, br0Var));
                r11.f29122g0[i20].h.setOnItemClickListener(new hh.c3(r11, br0Var, context2, j10, c6Var2, 2));
                r11.f29122g0[i20].h.setOnScrollListener(new kr0(r11, br0Var, cr0Var));
                r11.f29122g0[i20].h.setOnItemLongClickListener(new lr0(r11, br0Var));
                if (i20 == 0) {
                    cr0Var.h1(i22, i21);
                }
                r11.f29122g0[i20].f35344y = new mr0(context2, r11.f29122g0[i20].h);
                r11.f29122g0[i20].f35344y.setVisibility(8);
                r11.f29122g0[i20].h.D0(r11.f29122g0[i20].f35344y, h7.z5.c(-1.0f, -1));
                r11.f29122g0[i20].v = new nr0(r11, context2, br0Var);
                r11.f29122g0[i20].v.g();
                r11.f29122g0[i20].v.setClipToOutline(true);
                r11.f29122g0[i20].v.setOutlineProvider(new or0());
                if (i20 != 0) {
                    r11.f29122g0[i20].setVisibility(8);
                }
                zs0 zs0Var12 = r11.f29122g0[i20];
                zs0Var12.f35342w = new pr0(r11, context2, zs0Var12.v);
                r11.f29122g0[i20].f35342w.d(8, false);
                r11.f29122g0[i20].f35342w.setAnimateLayoutChange(true);
                zs0 zs0Var13 = r11.f29122g0[i20];
                zs0Var13.addView(zs0Var13.f35342w, h7.z5.c(-1.0f, -1));
                r11.f29122g0[i20].f35342w.setOnTouchListener(new kh.e(23));
                r11.f29122g0[i20].f35342w.e(true, false);
                r11.f29122g0[i20].f35342w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                r11.f29122g0[i20].f35342w.f29507f.setVisibility(8);
                r11.f29122g0[i20].f35342w.f29506e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                r11.f29122g0[i20].f35342w.f29507f.setVisibility(8);
                r11.f29122g0[i20].f35342w.addView(r11.f29122g0[i20].v, h7.z5.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                r11.f29122g0[i20].h.setEmptyView(r11.f29122g0[i20].f35342w);
                r11.f29122g0[i20].h.m1(0, true);
                zs0[] zs0VarArr3 = r11.f29122g0;
                zs0VarArr3[i20].A = new c2.x(zs0VarArr3[i20].h, r11.f29122g0[i20].f35343x);
                i20++;
                c6Var2 = c6Var;
                top = i21;
                iL0 = i22;
            }
            ar0Var = r11.S;
            if (ar0Var != null) {
                r11.addView(ar0Var, h7.z5.d(-1, 42.0f, 48, 0.0f, 48.0f, 0.0f, 0.0f));
            }
            org.telegram.ui.Cells.v0 v0Var8 = new org.telegram.ui.Cells.v0(context2);
            r11.G0 = v0Var8;
            v0Var8.T((int) (System.currentTimeMillis() / 1000), false, false);
            v0Var8.setAlpha(0.0f);
            v0Var8.V(org.telegram.ui.ActionBar.g6.f23395wc, org.telegram.ui.ActionBar.g6.f23187kd);
            v0Var8.setTranslationY(-AndroidUtilities.dp(48.0f));
            r11.addView(v0Var8, h7.z5.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
            zN = r11.N();
            r12 = r11;
            if (!zN) {
                ?? zrVar3 = new zr(context2);
                r11.L0 = zrVar3;
                zrVar3.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
                lg.d dVarB3 = aVar2.b(zrVar3, ng.c.m(c6Var));
                dVarB3.p(AndroidUtilities.dp(24.0f));
                dVarB3.o(AndroidUtilities.dp(7.0f));
                zrVar3.setBlurredBackground(dVarB3);
                FrameLayout frameLayout2 = new FrameLayout(context2);
                r11.M0 = frameLayout2;
                zrVar3.addView(frameLayout2);
                zrVar3.i(frameLayout2, true, false);
                zrVar3.setOnAnimatedHeightChangedListener(new bq0(r11, 0));
                rr0 rr0Var2 = new rr0(r11, context2, n2Var, this, c6Var);
                r11.N0 = rr0Var2;
                frameLayout2.addView(rr0Var2);
                zrVar3.setCallFragmentContextView(rr0Var2);
                r11.addView(zrVar3, h7.z5.d(-1, -2.0f, 48, 0.0f, 34.0f, 0.0f, 0.0f));
                rr0Var2.setDelegate(new cq0(r11));
                lg.d dVarB4 = aVar2.b(r11.E0, ng.c.m(c6Var));
                dVarB4.p(AndroidUtilities.dp(18.0f));
                dVarB4.o(AndroidUtilities.dp(6.666f));
                r11.E0.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
                r11.E0.setClipToPadding(false);
                r11.E0.setBackground(r10);
                r11.E0.setBlurredBackground(dVarB4);
                r11.E0.setOpen(false);
                r11.addView(r11.E0, h7.z5.d(-2, 50.0f, 49, -2.0f, 0.0f, -2.0f, 0.0f));
                Context context4 = r11.getContext();
                org.telegram.ui.ActionBar.n2 n2Var5 = r11.f29145r1;
                int currentAccount2 = n2Var5.getCurrentAccount();
                if (r11.l0()) {
                    j11 = 0;
                } else {
                    j11 = r11.f29121f1;
                }
                ?? r48 = r11;
                ?? sr0Var4 = new sr0(currentAccount2, j11, context4, n2Var5, c6Var, r48);
                ?? r14 = r48;
                r14.F0 = sr0Var4;
                sr0Var4.d(aVar2, ng.c.m(c6Var));
                sr0Var4.setShown(0.0f);
                r14.addView(sr0Var4, h7.z5.d(-1, 38.0f, 51, 0.0f, 4.0f, 0.0f, 0.0f));
                r14.addView(r14.f29159x0, h7.z5.e(-1, 48, 51));
                r12 = r14;
            }
            r12.v1(false);
            r12.m1(false);
            if (r12.T0[0] >= 0) {
                r12.z0(false);
            }
            ar0Var2 = r12.S;
            if (ar0Var2 != null) {
                ar0Var2.setInitialTabId(i12);
            }
            r12.Y1 = new wg(r12, 2);
        }
        profileTab = userFull.main_tab;
        c10 = 5;
        if (i11 != 14) {
            hu0Var2.U0 = i11;
        } else {
            hu0Var2.U0 = i11;
        }
        hu0Var2.M0(i11);
        hu0Var2.Z0 = chatFull2;
        hu0Var2.f29107a1 = userFull;
        if (chatFull2 != null) {
            hu0Var2.Y0 = -chatFull2.migrated_from_chat_id;
        }
        hu0Var2.f29121f1 = j10;
        i14 = 0;
        while (true) {
            wt0VarArr = hu0Var2.f29140p1;
            if (i14 < wt0VarArr.length) {
                break;
                break;
            }
            wt0VarArr[i14] = new wt0();
            int[] iArr7 = hu0Var2.f29140p1[i14].f34332j;
            if (DialogObject.isEncryptedDialog(hu0Var2.f29121f1)) {
                i25 = Integer.MIN_VALUE;
            } else {
                i25 = Integer.MAX_VALUE;
            }
            iArr7[0] = i25;
            hu0Var2.f29140p1[i14].f34332j[1] = Integer.MAX_VALUE;
            hu0Var2.R(i14);
            if (hu0Var2.Y0 == 0) {
            }
            i14++;
        }
        hu0Var2.f29145r1 = n2Var;
        hu0Var2.C = n2Var.getActionBar();
        int[] iArr8 = hu0Var2.f29127i1;
        if (hu0Var2.S0() <= 0) {
            iS0 = SharedConfig.mediaColumnsCount;
        } else {
            iS0 = hu0Var2.S0();
        }
        iArr8[0] = iS0;
        int[] iArr9 = hu0Var2.f29127i1;
        if (hu0Var2.S0() <= 0) {
            iS1 = SharedConfig.storiesColumnsCount;
        } else {
            iS1 = hu0Var2.S0();
        }
        iArr9[1] = iS1;
        hu0Var2.C1 = n2Var.getNotificationCenter().createObserversGroup(hu0Var2).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.storiesUpdated).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.savedMessagesDialogsUpdate).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.starUserGiftsLoaded).add(NotificationCenter.updatedChatRanks).add(NotificationCenter.didUpdatePollResults);
        while (i15 < 10) {
            if (i11 == 4) {
                qr0 qr0Var2 = new qr0(hu0Var2, context);
                qr0Var2.P.c();
                hu0Var2.C0.add(qr0Var2);
            }
        }
        hu0Var2.O0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        hu0Var2.R0 = false;
        hu0Var2.S0 = null;
        sr0Var = hu0Var2.F0;
        if (sr0Var != null) {
            sr0Var.g(false);
        }
        hu0Var2.Q0 = false;
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.photos_header_shadow);
        hu0Var2.f29151u0 = drawable2;
        drawable2.setColorFilter(new PorterDuffColorFilter(hu0Var2.h0(org.telegram.ui.ActionBar.g6.f23018b7), PorterDuff.Mode.MULTIPLY));
        vr0Var = hu0Var2.E0;
        if (vr0Var != null) {
            currentTabId = vr0Var.getCurrentTabId();
        } else {
            currentTabId = i11;
        }
        vr0Var2 = new vr0(hu0Var2, context, hu0Var2.B1);
        i16 = hu0Var2.U0;
        if (i16 != -1) {
            vr0Var2.setInitialTabId(i16);
            hu0Var2.U0 = -1;
        }
        vr0Var2.U = 320L;
        int i39 = org.telegram.ui.ActionBar.g6.Fh;
        int i310 = org.telegram.ui.ActionBar.g6.Eh;
        vr0Var2.H = i39;
        vr0Var2.I = i310;
        vr0Var2.d();
        vr0Var2.setUseMinimalWidth(true);
        vr0Var2.setDelegate(new xr0(hu0Var2));
        hu0Var2.E0 = vr0Var2;
        while (i17 >= 0) {
            hu0Var2.V0[i17].clear();
        }
        hu0Var2.W0 = 0;
        hu0Var2.J0.clear();
        qt0Var = hu0Var2.N;
        if (qt0Var != null) {
            qt0Var.f31979w.clear();
        }
        if (!(hu0Var2 instanceof n30)) {
            zVarN = hu0Var2.C.n();
            zVarN.addOnLayoutChangeListener(new wr0(hu0Var2));
            if (hu0Var2.f29121f1 == hu0Var2.f29145r1.getUserConfig().getClientUserId()) {
                hu0Var2.f29126i0 = zVarN.a(11, R.drawable.outline_header_search);
            }
            org.telegram.ui.ActionBar.v0 v0VarA2 = zVarN.a(0, 0);
            v0VarA2.F();
            v0VarA2.D = new ds0(hu0Var2);
            hu0Var2.f29128j0 = v0VarA2;
            v0VarA2.setTranslationY(AndroidUtilities.dp(10.0f));
            sr0Var2 = hu0Var2.F0;
            if (sr0Var2 == null) {
                i23 = R.string.Search;
            } else {
                i23 = R.string.Search;
            }
            v0VarA2.setSearchFieldHint(LocaleController.getString(i23));
            v0VarA2.setContentDescription(LocaleController.getString("Search", R.string.Search));
            if (hu0Var2.v0()) {
                i24 = 8;
            } else {
                i24 = 4;
            }
            v0VarA2.setVisibility(i24);
        }
        ImageView imageView3 = new ImageView(context);
        hu0Var2.f29135n0 = imageView3;
        imageView3.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        imageView3.setTranslationY(AndroidUtilities.dp(10.0f));
        imageView3.setVisibility(4);
        if (hu0Var2.q0()) {
            f10 = 2.0f;
        } else {
            f10 = 2.0f;
        }
        context2 = context;
        imageView3.setOnClickListener(new ks0(hu0Var2, j10, c6Var, context));
        v0Var = hu0Var2.f29128j0;
        if (v0Var != null) {
            EditTextBoldCursor searchField2 = v0Var.getSearchField();
            int i311 = org.telegram.ui.ActionBar.g6.G6;
            searchField2.setTextColor(hu0Var2.h0(i311));
            searchField2.setHintTextColor(hu0Var2.h0(org.telegram.ui.ActionBar.g6.Si));
            searchField2.setCursorColor(hu0Var2.h0(i311));
        }
        hu0Var2.f29149t0 = 0;
        n2Var2 = hu0Var2.f29145r1;
        if (n2Var2 == null) {
            zu0Var = null;
        } else {
            zu0Var = null;
        }
        x9Var = new x9(context2, zu0Var);
        hu0Var2.f29159x0 = x9Var;
        x9Var.setBackgroundColor(hu0Var2.h0(org.telegram.ui.ActionBar.g6.f22999a7));
        x9Var.setAlpha(0.0f);
        x9Var.setClickable(true);
        x9Var.setVisibility(4);
        ImageView imageView4 = new ImageView(context2);
        hu0Var2.f29162y0 = imageView4;
        imageView4.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.g2 g2Var2 = new org.telegram.ui.ActionBar.g2(true);
        hu0Var2.f29164z0 = g2Var2;
        imageView4.setImageDrawable(g2Var2);
        i18 = org.telegram.ui.ActionBar.g6.f23425y8;
        g2Var2.a(hu0Var2.h0(i18));
        i19 = org.telegram.ui.ActionBar.g6.f23443z8;
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.e0(hu0Var2.h0(i19), 1));
        imageView4.setContentDescription(LocaleController.getString("Close", R.string.Close));
        x9Var.addView(imageView4, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        hu0Var2.J0.add(imageView4);
        imageView4.setOnClickListener(new dq0(hu0Var2, 0));
        NumberTextView numberTextView2 = new NumberTextView(context2);
        hu0Var2.f29156w0 = numberTextView2;
        numberTextView2.setTextSize(18);
        numberTextView2.setTypeface(AndroidUtilities.bold());
        numberTextView2.setTextColor(hu0Var2.h0(i18));
        x9Var.addView(numberTextView2, h7.z5.m(1.0f, 0, -1, 18, 0, 0));
        hu0Var2.J0.add(numberTextView2);
        if (!DialogObject.isEncryptedDialog(hu0Var2.f29121f1)) {
            if (!hu0Var2.v0()) {
                org.telegram.ui.ActionBar.v0 v0Var9 = new org.telegram.ui.ActionBar.v0(context2, hu0Var2.h0(i19), hu0Var2.h0(i18), false);
                hu0Var2.f29141q0 = v0Var9;
                v0Var9.setIcon(R.drawable.msg_message);
                v0Var9.setContentDescription(LocaleController.getString(R.string.AccDescrGoToMessage));
                v0Var9.setDuplicateParentStateEnabled(false);
                x9Var.addView(v0Var9, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                hu0Var2.J0.add(v0Var9);
                v0Var9.setOnClickListener(new dq0(hu0Var2, 1));
                org.telegram.ui.ActionBar.v0 v0Var10 = new org.telegram.ui.ActionBar.v0(context2, hu0Var2.h0(i19), hu0Var2.h0(i18), false);
                hu0Var2.f29139p0 = v0Var10;
                v0Var10.setIcon(R.drawable.msg_forward);
                v0Var10.setContentDescription(LocaleController.getString(R.string.Forward));
                v0Var10.setDuplicateParentStateEnabled(false);
                x9Var.addView(v0Var10, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                hu0Var2.J0.add(v0Var10);
                v0Var10.setOnClickListener(new dq0(hu0Var2, 2));
            }
            org.telegram.ui.ActionBar.v0 v0Var11 = new org.telegram.ui.ActionBar.v0(context2, hu0Var2.h0(i19), hu0Var2.h0(i18), false);
            hu0Var2.f29144r0 = v0Var11;
            v0Var11.setIcon(R.drawable.msg_pin);
            v0Var11.setContentDescription(LocaleController.getString(R.string.PinMessage));
            v0Var11.setDuplicateParentStateEnabled(false);
            v0Var11.setVisibility(8);
            x9Var.addView(v0Var11, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
            hu0Var2.J0.add(v0Var11);
            v0Var11.setOnClickListener(new dq0(hu0Var2, 3));
            org.telegram.ui.ActionBar.v0 v0Var12 = new org.telegram.ui.ActionBar.v0(context2, hu0Var2.h0(i19), hu0Var2.h0(i18), false);
            hu0Var2.f29147s0 = v0Var12;
            v0Var12.setIcon(R.drawable.msg_unpin);
            v0Var12.setContentDescription(LocaleController.getString(R.string.UnpinMessage));
            v0Var12.setDuplicateParentStateEnabled(false);
            v0Var12.setVisibility(8);
            x9Var.addView(v0Var12, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
            hu0Var2.J0.add(v0Var12);
            v0Var12.setOnClickListener(new dq0(hu0Var2, 4));
            hu0Var2.p1();
        }
        org.telegram.ui.ActionBar.v0 v0Var13 = new org.telegram.ui.ActionBar.v0(context2, hu0Var2.h0(i19), hu0Var2.h0(i18), false);
        hu0Var2.f29124h0 = v0Var13;
        v0Var13.setIcon(R.drawable.msg_delete);
        v0Var13.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        v0Var13.setDuplicateParentStateEnabled(false);
        x9Var.addView(v0Var13, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        hu0Var2.J0.add(v0Var13);
        v0Var13.setOnClickListener(new dq0(hu0Var2, 5));
        hu0Var2.D = new ls0(hu0Var2, context2);
        hu0Var2.E = new bu0(hu0Var2, context2);
        hu0Var2.G = new ut0(hu0Var2, context2, 1);
        hu0Var2.H = new ut0(hu0Var2, context2, 2);
        hu0Var2.I = new ut0(hu0Var2, context2, 4);
        hu0Var2.J = new nt0(hu0Var2, context2, hu0Var2.f29145r1.getCurrentAccount(), hu0Var2.f29145r1.getResourceProvider());
        hu0Var2.K = new us0(hu0Var2, context2);
        hu0Var2.f29112c0 = new ct0(hu0Var2, context2, 1);
        hu0Var2.f29114d0 = new ct0(hu0Var2, context2, 4);
        hu0Var2.f29117e0 = new ct0(hu0Var2, context2, 3);
        hu0Var2.f29120f0 = new xs0(hu0Var2, context2);
        hu0Var2.L = new rs0(hu0Var2, context2);
        hu0Var2.M = new ps0(hu0Var2, context2);
        hu0Var2.N = new qt0(hu0Var2, context2);
        hu0Var2.O = new st0(hu0Var2, context2);
        if (!hu0Var2.v0()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", hu0Var2.f29145r1.getUserConfig().getClientUserId());
            bundle2.putInt("chatMode", 3);
            ms0 ms0Var2 = new ms0(hu0Var2, context2, hu0Var2.f29145r1.getParentLayout(), bundle2);
            hu0Var2.P = ms0Var2;
            long j14 = hu0Var2.f29121f1;
            org.telegram.ui.sn snVar2 = ms0Var2.f42977a;
            snVar2.Z3 = j14;
            snVar2.La = true;
            ms0Var2.setClipToOutline(true);
            ms0Var2.setOutlineProvider(new ns0());
        }
        qs0Var = new qs0(hu0Var2, context2);
        hu0Var2.T = qs0Var;
        if (hu0Var2.B == 0) {
            qs0Var.f31970e = arrayList;
            qs0Var.d = currentTabId != 7 ? null : chatFull2;
        }
        hu0Var2.V = new os0(hu0Var2, context2);
        hu0Var2.U = new f2.f0(new tq0(hu0Var2));
        hu0Var2.W = new eu0(hu0Var2, context2, false);
        hu0Var2.f29106a0 = new uq0(hu0Var2, context2);
        hu0Var2.f29109b0 = new eu0(hu0Var2, context2, true);
        hu0Var2.F = new vt0(hu0Var2, context2);
        if (hu0Var2.r0()) {
            if (hu0Var2.f29145r1 instanceof ProfileActivity) {
                TextView textView2 = new TextView(context2);
                hu0Var2.m0 = textView2;
                textView2.setText(LocaleController.getString(R.string.Save).toUpperCase());
                textView2.setTypeface(AndroidUtilities.bold());
                int i312 = org.telegram.ui.ActionBar.g6.Oh;
                textView2.setTextColor(hu0Var2.h0(i312));
                textView2.setTextSize(1, 15.0f);
                textView2.setGravity(17);
                textView2.setBackground(org.telegram.ui.ActionBar.g6.e0(org.telegram.ui.ActionBar.g6.l1(0.15f, hu0Var2.h0(i312)), 3));
                textView2.setPadding(AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(19.0f), 0);
                hu0Var2.C.addView(textView2, h7.z5.e(-2, 56, 85));
                textView2.setOnClickListener(new dq0(hu0Var2, 6));
                textView2.setVisibility(8);
                textView2.setAlpha(0.0f);
                textView2.setScaleX(0.4f);
                textView2.setScaleY(0.4f);
                org.telegram.ui.ActionBar.n2 n2Var6 = hu0Var2.f29145r1;
                r10 = 0;
                c6Var2 = c6Var;
                wq0 wq0Var2 = new wq0(n2Var6.getCurrentAccount(), ((ProfileActivity) hu0Var2.f29145r1).a(), context2, n2Var6, c6Var2, hu0Var2);
                hu0Var.R = wq0Var2;
                int iDp2 = AndroidUtilities.dp(48.0f);
                zrVar = hu0Var.L0;
                if (zrVar != null) {
                    context2 = context2;
                    hu0Var = hu0Var2;
                    iC = (int) zrVar.c(0.0f);
                } else {
                    context2 = context2;
                    hu0Var = hu0Var2;
                    iC = 0;
                }
                wq0Var2.setPaddingTop(iDp2 + iC);
                hu0Var.S = new ar0(hu0Var, context2, zu0Var, hu0Var.getStoriesController().B(hu0Var.f29121f1, true), new zq0(hu0Var, context2, n2Var, c6Var2));
                r11 = hu0Var;
            }
            r11.setWillNotDraw(false);
            top = 0;
            iL0 = -1;
            i20 = 0;
            while (true) {
                zs0VarArr = r11.f29122g0;
                if (i20 < zs0VarArr.length) {
                    break;
                    break;
                }
                if (i20 == 0) {
                    i21 = top;
                    i22 = iL0;
                } else {
                    i21 = top;
                    i22 = iL0;
                }
                br0Var = new br0(r11, context2);
                r11.addView(br0Var, h7.z5.d(-1, -1.0f, 51, 0.0f, r11.B0(), 0.0f, 0.0f));
                if (i20 == 1) {
                    br0Var.setTranslationX(AndroidUtilities.displaySize.x);
                }
                r11.f29122g0[i20] = br0Var;
                cr0Var = new cr0(r11, br0Var);
                br0Var.f35343x = cr0Var;
                cr0Var.z1(new dr0(r11, br0Var));
                r11.f29122g0[i20].d = new f2.l();
                r11.f29122g0[i20].d.n(280L);
                r11.f29122g0[i20].d.o(er.h);
                zs0 zs0Var14 = r11.f29122g0[i20];
                zs0Var14.d.f5819m = false;
                zs0Var14.h = new er0(r11, context2, br0Var, cr0Var);
                r11.f29122g0[i20].h.setFastScrollEnabled(1);
                r11.f29122g0[i20].h.setScrollingTouchSlop(1);
                r11.f29122g0[i20].h.setPinnedSectionOffsetY(-AndroidUtilities.dp(f10));
                r11.f29122g0[i20].h.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
                r11.f29122g0[i20].h.setItemAnimator(r10);
                r11.f29122g0[i20].h.setClipToPadding(false);
                r11.f29122g0[i20].h.setSectionsType(2);
                r11.f29122g0[i20].h.setLayoutManager(cr0Var);
                zs0 zs0Var15 = r11.f29122g0[i20];
                zs0Var15.addView(zs0Var15.h, h7.z5.c(-1.0f, -1));
                r11.f29122g0[i20].f35340r = new ys0(context2, r10);
                zs0 zs0Var16 = r11.f29122g0[i20];
                ys0 ys0Var3 = zs0Var16.f35340r;
                gr0 gr0Var3 = new gr0(r11);
                zs0Var16.f35341s = gr0Var3;
                ys0Var3.setLayoutManager(gr0Var3);
                zs0 zs0Var17 = r11.f29122g0[i20];
                zs0Var17.addView(zs0Var17.f35340r, h7.z5.c(-1.0f, -1));
                r11.f29122g0[i20].f35340r.setVisibility(8);
                r11.f29122g0[i20].f35340r.i(new hr0(br0Var));
                r11.f29122g0[i20].h.i(new ir0(r11, br0Var));
                r11.f29122g0[i20].h.setOnItemClickListener(new hh.c3(r11, br0Var, context2, j10, c6Var2, 2));
                r11.f29122g0[i20].h.setOnScrollListener(new kr0(r11, br0Var, cr0Var));
                r11.f29122g0[i20].h.setOnItemLongClickListener(new lr0(r11, br0Var));
                if (i20 == 0) {
                    cr0Var.h1(i22, i21);
                }
                r11.f29122g0[i20].f35344y = new mr0(context2, r11.f29122g0[i20].h);
                r11.f29122g0[i20].f35344y.setVisibility(8);
                r11.f29122g0[i20].h.D0(r11.f29122g0[i20].f35344y, h7.z5.c(-1.0f, -1));
                r11.f29122g0[i20].v = new nr0(r11, context2, br0Var);
                r11.f29122g0[i20].v.g();
                r11.f29122g0[i20].v.setClipToOutline(true);
                r11.f29122g0[i20].v.setOutlineProvider(new or0());
                if (i20 != 0) {
                    r11.f29122g0[i20].setVisibility(8);
                }
                zs0 zs0Var18 = r11.f29122g0[i20];
                zs0Var18.f35342w = new pr0(r11, context2, zs0Var18.v);
                r11.f29122g0[i20].f35342w.d(8, false);
                r11.f29122g0[i20].f35342w.setAnimateLayoutChange(true);
                zs0 zs0Var19 = r11.f29122g0[i20];
                zs0Var19.addView(zs0Var19.f35342w, h7.z5.c(-1.0f, -1));
                r11.f29122g0[i20].f35342w.setOnTouchListener(new kh.e(23));
                r11.f29122g0[i20].f35342w.e(true, false);
                r11.f29122g0[i20].f35342w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                r11.f29122g0[i20].f35342w.f29507f.setVisibility(8);
                r11.f29122g0[i20].f35342w.f29506e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                r11.f29122g0[i20].f35342w.f29507f.setVisibility(8);
                r11.f29122g0[i20].f35342w.addView(r11.f29122g0[i20].v, h7.z5.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                r11.f29122g0[i20].h.setEmptyView(r11.f29122g0[i20].f35342w);
                r11.f29122g0[i20].h.m1(0, true);
                zs0[] zs0VarArr4 = r11.f29122g0;
                zs0VarArr4[i20].A = new c2.x(zs0VarArr4[i20].h, r11.f29122g0[i20].f35343x);
                i20++;
                c6Var2 = c6Var;
                top = i21;
                iL0 = i22;
            }
            ar0Var = r11.S;
            if (ar0Var != null) {
                r11.addView(ar0Var, h7.z5.d(-1, 42.0f, 48, 0.0f, 48.0f, 0.0f, 0.0f));
            }
            org.telegram.ui.Cells.v0 v0Var14 = new org.telegram.ui.Cells.v0(context2);
            r11.G0 = v0Var14;
            v0Var14.T((int) (System.currentTimeMillis() / 1000), false, false);
            v0Var14.setAlpha(0.0f);
            v0Var14.V(org.telegram.ui.ActionBar.g6.f23395wc, org.telegram.ui.ActionBar.g6.f23187kd);
            v0Var14.setTranslationY(-AndroidUtilities.dp(48.0f));
            r11.addView(v0Var14, h7.z5.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
            zN = r11.N();
            r12 = r11;
            if (!zN) {
                ?? zrVar4 = new zr(context2);
                r11.L0 = zrVar4;
                zrVar4.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
                lg.d dVarB5 = aVar2.b(zrVar4, ng.c.m(c6Var));
                dVarB5.p(AndroidUtilities.dp(24.0f));
                dVarB5.o(AndroidUtilities.dp(7.0f));
                zrVar4.setBlurredBackground(dVarB5);
                FrameLayout frameLayout3 = new FrameLayout(context2);
                r11.M0 = frameLayout3;
                zrVar4.addView(frameLayout3);
                zrVar4.i(frameLayout3, true, false);
                zrVar4.setOnAnimatedHeightChangedListener(new bq0(r11, 0));
                rr0 rr0Var3 = new rr0(r11, context2, n2Var, this, c6Var);
                r11.N0 = rr0Var3;
                frameLayout3.addView(rr0Var3);
                zrVar4.setCallFragmentContextView(rr0Var3);
                r11.addView(zrVar4, h7.z5.d(-1, -2.0f, 48, 0.0f, 34.0f, 0.0f, 0.0f));
                rr0Var3.setDelegate(new cq0(r11));
                lg.d dVarB6 = aVar2.b(r11.E0, ng.c.m(c6Var));
                dVarB6.p(AndroidUtilities.dp(18.0f));
                dVarB6.o(AndroidUtilities.dp(6.666f));
                r11.E0.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
                r11.E0.setClipToPadding(false);
                r11.E0.setBackground(r10);
                r11.E0.setBlurredBackground(dVarB6);
                r11.E0.setOpen(false);
                r11.addView(r11.E0, h7.z5.d(-2, 50.0f, 49, -2.0f, 0.0f, -2.0f, 0.0f));
                Context context5 = r11.getContext();
                org.telegram.ui.ActionBar.n2 n2Var7 = r11.f29145r1;
                int currentAccount3 = n2Var7.getCurrentAccount();
                if (r11.l0()) {
                    j11 = 0;
                } else {
                    j11 = r11.f29121f1;
                }
                ?? r49 = r11;
                ?? sr0Var5 = new sr0(currentAccount3, j11, context5, n2Var7, c6Var, r49);
                ?? r15 = r49;
                r15.F0 = sr0Var5;
                sr0Var5.d(aVar2, ng.c.m(c6Var));
                sr0Var5.setShown(0.0f);
                r15.addView(sr0Var5, h7.z5.d(-1, 38.0f, 51, 0.0f, 4.0f, 0.0f, 0.0f));
                r15.addView(r15.f29159x0, h7.z5.e(-1, 48, 51));
                r12 = r15;
            }
            r12.v1(false);
            r12.m1(false);
            if (r12.T0[0] >= 0) {
                r12.z0(false);
            }
            ar0Var2 = r12.S;
            if (ar0Var2 != null) {
                ar0Var2.setInitialTabId(i12);
            }
            r12.Y1 = new wg(r12, 2);
        }
        hu0Var2.Q = new vq0(hu0Var2, context2, hu0Var2.f29145r1, hu0Var2.f29121f1);
        c6Var2 = c6Var;
        r10 = 0;
        r11 = hu0Var2;
        r11.setWillNotDraw(false);
        top = 0;
        iL0 = -1;
        i20 = 0;
        while (true) {
            zs0VarArr = r11.f29122g0;
            if (i20 < zs0VarArr.length) {
                break;
                break;
            }
            if (i20 == 0) {
                i21 = top;
                i22 = iL0;
            } else {
                i21 = top;
                i22 = iL0;
            }
            br0Var = new br0(r11, context2);
            r11.addView(br0Var, h7.z5.d(-1, -1.0f, 51, 0.0f, r11.B0(), 0.0f, 0.0f));
            if (i20 == 1) {
                br0Var.setTranslationX(AndroidUtilities.displaySize.x);
            }
            r11.f29122g0[i20] = br0Var;
            cr0Var = new cr0(r11, br0Var);
            br0Var.f35343x = cr0Var;
            cr0Var.z1(new dr0(r11, br0Var));
            r11.f29122g0[i20].d = new f2.l();
            r11.f29122g0[i20].d.n(280L);
            r11.f29122g0[i20].d.o(er.h);
            zs0 zs0Var110 = r11.f29122g0[i20];
            zs0Var110.d.f5819m = false;
            zs0Var110.h = new er0(r11, context2, br0Var, cr0Var);
            r11.f29122g0[i20].h.setFastScrollEnabled(1);
            r11.f29122g0[i20].h.setScrollingTouchSlop(1);
            r11.f29122g0[i20].h.setPinnedSectionOffsetY(-AndroidUtilities.dp(f10));
            r11.f29122g0[i20].h.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
            r11.f29122g0[i20].h.setItemAnimator(r10);
            r11.f29122g0[i20].h.setClipToPadding(false);
            r11.f29122g0[i20].h.setSectionsType(2);
            r11.f29122g0[i20].h.setLayoutManager(cr0Var);
            zs0 zs0Var111 = r11.f29122g0[i20];
            zs0Var111.addView(zs0Var111.h, h7.z5.c(-1.0f, -1));
            r11.f29122g0[i20].f35340r = new ys0(context2, r10);
            zs0 zs0Var112 = r11.f29122g0[i20];
            ys0 ys0Var4 = zs0Var112.f35340r;
            gr0 gr0Var4 = new gr0(r11);
            zs0Var112.f35341s = gr0Var4;
            ys0Var4.setLayoutManager(gr0Var4);
            zs0 zs0Var113 = r11.f29122g0[i20];
            zs0Var113.addView(zs0Var113.f35340r, h7.z5.c(-1.0f, -1));
            r11.f29122g0[i20].f35340r.setVisibility(8);
            r11.f29122g0[i20].f35340r.i(new hr0(br0Var));
            r11.f29122g0[i20].h.i(new ir0(r11, br0Var));
            r11.f29122g0[i20].h.setOnItemClickListener(new hh.c3(r11, br0Var, context2, j10, c6Var2, 2));
            r11.f29122g0[i20].h.setOnScrollListener(new kr0(r11, br0Var, cr0Var));
            r11.f29122g0[i20].h.setOnItemLongClickListener(new lr0(r11, br0Var));
            if (i20 == 0) {
                cr0Var.h1(i22, i21);
            }
            r11.f29122g0[i20].f35344y = new mr0(context2, r11.f29122g0[i20].h);
            r11.f29122g0[i20].f35344y.setVisibility(8);
            r11.f29122g0[i20].h.D0(r11.f29122g0[i20].f35344y, h7.z5.c(-1.0f, -1));
            r11.f29122g0[i20].v = new nr0(r11, context2, br0Var);
            r11.f29122g0[i20].v.g();
            r11.f29122g0[i20].v.setClipToOutline(true);
            r11.f29122g0[i20].v.setOutlineProvider(new or0());
            if (i20 != 0) {
                r11.f29122g0[i20].setVisibility(8);
            }
            zs0 zs0Var114 = r11.f29122g0[i20];
            zs0Var114.f35342w = new pr0(r11, context2, zs0Var114.v);
            r11.f29122g0[i20].f35342w.d(8, false);
            r11.f29122g0[i20].f35342w.setAnimateLayoutChange(true);
            zs0 zs0Var115 = r11.f29122g0[i20];
            zs0Var115.addView(zs0Var115.f35342w, h7.z5.c(-1.0f, -1));
            r11.f29122g0[i20].f35342w.setOnTouchListener(new kh.e(23));
            r11.f29122g0[i20].f35342w.e(true, false);
            r11.f29122g0[i20].f35342w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
            r11.f29122g0[i20].f35342w.f29507f.setVisibility(8);
            r11.f29122g0[i20].f35342w.f29506e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            r11.f29122g0[i20].f35342w.f29507f.setVisibility(8);
            r11.f29122g0[i20].f35342w.addView(r11.f29122g0[i20].v, h7.z5.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
            r11.f29122g0[i20].h.setEmptyView(r11.f29122g0[i20].f35342w);
            r11.f29122g0[i20].h.m1(0, true);
            zs0[] zs0VarArr5 = r11.f29122g0;
            zs0VarArr5[i20].A = new c2.x(zs0VarArr5[i20].h, r11.f29122g0[i20].f35343x);
            i20++;
            c6Var2 = c6Var;
            top = i21;
            iL0 = i22;
        }
        ar0Var = r11.S;
        if (ar0Var != null) {
            r11.addView(ar0Var, h7.z5.d(-1, 42.0f, 48, 0.0f, 48.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Cells.v0 v0Var15 = new org.telegram.ui.Cells.v0(context2);
        r11.G0 = v0Var15;
        v0Var15.T((int) (System.currentTimeMillis() / 1000), false, false);
        v0Var15.setAlpha(0.0f);
        v0Var15.V(org.telegram.ui.ActionBar.g6.f23395wc, org.telegram.ui.ActionBar.g6.f23187kd);
        v0Var15.setTranslationY(-AndroidUtilities.dp(48.0f));
        r11.addView(v0Var15, h7.z5.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
        zN = r11.N();
        r12 = r11;
        if (!zN) {
            ?? zrVar5 = new zr(context2);
            r11.L0 = zrVar5;
            zrVar5.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
            lg.d dVarB7 = aVar2.b(zrVar5, ng.c.m(c6Var));
            dVarB7.p(AndroidUtilities.dp(24.0f));
            dVarB7.o(AndroidUtilities.dp(7.0f));
            zrVar5.setBlurredBackground(dVarB7);
            FrameLayout frameLayout4 = new FrameLayout(context2);
            r11.M0 = frameLayout4;
            zrVar5.addView(frameLayout4);
            zrVar5.i(frameLayout4, true, false);
            zrVar5.setOnAnimatedHeightChangedListener(new bq0(r11, 0));
            rr0 rr0Var4 = new rr0(r11, context2, n2Var, this, c6Var);
            r11.N0 = rr0Var4;
            frameLayout4.addView(rr0Var4);
            zrVar5.setCallFragmentContextView(rr0Var4);
            r11.addView(zrVar5, h7.z5.d(-1, -2.0f, 48, 0.0f, 34.0f, 0.0f, 0.0f));
            rr0Var4.setDelegate(new cq0(r11));
            lg.d dVarB8 = aVar2.b(r11.E0, ng.c.m(c6Var));
            dVarB8.p(AndroidUtilities.dp(18.0f));
            dVarB8.o(AndroidUtilities.dp(6.666f));
            r11.E0.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
            r11.E0.setClipToPadding(false);
            r11.E0.setBackground(r10);
            r11.E0.setBlurredBackground(dVarB8);
            r11.E0.setOpen(false);
            r11.addView(r11.E0, h7.z5.d(-2, 50.0f, 49, -2.0f, 0.0f, -2.0f, 0.0f));
            Context context6 = r11.getContext();
            org.telegram.ui.ActionBar.n2 n2Var8 = r11.f29145r1;
            int currentAccount4 = n2Var8.getCurrentAccount();
            if (r11.l0()) {
                j11 = 0;
            } else {
                j11 = r11.f29121f1;
            }
            ?? r410 = r11;
            ?? sr0Var6 = new sr0(currentAccount4, j11, context6, n2Var8, c6Var, r410);
            ?? r16 = r410;
            r16.F0 = sr0Var6;
            sr0Var6.d(aVar2, ng.c.m(c6Var));
            sr0Var6.setShown(0.0f);
            r16.addView(sr0Var6, h7.z5.d(-1, 38.0f, 51, 0.0f, 4.0f, 0.0f, 0.0f));
            r16.addView(r16.f29159x0, h7.z5.e(-1, 48, 51));
            r12 = r16;
        }
        r12.v1(false);
        r12.m1(false);
        if (r12.T0[0] >= 0) {
            r12.z0(false);
        }
        ar0Var2 = r12.S;
        if (ar0Var2 != null) {
            ar0Var2.setInitialTabId(i12);
        }
        r12.Y1 = new wg(r12, 2);
    }

    public static ts0 M(int i10, long j10, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        ts0 ts0Var = new ts0(context, c6Var);
        TextView textView = ts0Var.f32872a;
        if (i10 == 0) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoMediaSecret));
                return ts0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoMedia));
            return ts0Var;
        }
        if (i10 == 1) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedFilesSecret));
                return ts0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedFiles));
            return ts0Var;
        }
        if (i10 == 2) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedVoiceSecret));
                return ts0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedVoice));
            return ts0Var;
        }
        if (i10 == 3) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedLinksSecret));
                return ts0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedLinks));
            return ts0Var;
        }
        if (i10 == 4) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedAudioSecret));
                return ts0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedAudio));
            return ts0Var;
        }
        if (i10 == 5) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedGifSecret));
                return ts0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoGIFs));
            return ts0Var;
        }
        ImageView imageView = ts0Var.f32873b;
        if (i10 == 6) {
            imageView.setImageDrawable(null);
            textView.setText(LocaleController.getString(R.string.NoGroupsInCommon));
            return ts0Var;
        }
        if (i10 == 7) {
            imageView.setImageDrawable(null);
            textView.setText("");
        }
        return ts0Var;
    }

    public static TLRPC.ProfileTab d0(int i10, boolean z10) {
        if (i10 != 8 && i10 != 14 && !z10) {
            return null;
        }
        if (i10 == 0) {
            return new TLRPC.TL_profileTabMedia();
        }
        if (i10 == 1) {
            return new TLRPC.TL_profileTabFiles();
        }
        if (i10 == 2) {
            return new TLRPC.TL_profileTabVoice();
        }
        if (i10 == 3) {
            return new TLRPC.TL_profileTabLinks();
        }
        if (i10 == 4) {
            return new TLRPC.TL_profileTabMusic();
        }
        if (i10 == 5) {
            return new TLRPC.TL_profileTabGifs();
        }
        if (i10 == 8) {
            return new TLRPC.TL_profileTabPosts();
        }
        if (i10 != 14) {
            return null;
        }
        return new TLRPC.TL_profileTabGifts();
    }

    public static int e0(TLRPC.ProfileTab profileTab) {
        if (profileTab instanceof TLRPC.TL_profileTabPosts) {
            return 8;
        }
        if (profileTab instanceof TLRPC.TL_profileTabMedia) {
            return 0;
        }
        if (profileTab instanceof TLRPC.TL_profileTabGifts) {
            return 14;
        }
        if (profileTab instanceof TLRPC.TL_profileTabMusic) {
            return 4;
        }
        if (profileTab instanceof TLRPC.TL_profileTabVoice) {
            return 2;
        }
        if (profileTab instanceof TLRPC.TL_profileTabLinks) {
            return 3;
        }
        if (profileTab instanceof TLRPC.TL_profileTabFiles) {
            return 1;
        }
        return profileTab instanceof TLRPC.TL_profileTabGifs ? 5 : -1;
    }

    public static void g(hu0 hu0Var, int i10, TL_stories.StoryItem storyItem, String str) {
        km kmVar = new km(hu0Var, i10, storyItem, 10);
        jh.s6 storiesController = hu0Var.getStoriesController();
        long j10 = hu0Var.f29121f1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.c0(i10, j10, arrayList);
        mc.a0(hu0Var.f29145r1).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", 1, str)), LocaleController.getString(R.string.UndoNoCaps), kmVar).j();
    }

    public jh.s6 getStoriesController() {
        return MessagesController.getInstance(this.f29145r1.getCurrentAccount()).getStoriesController();
    }

    public static void h(hu0 hu0Var, TL_stories.StoryItem storyItem) {
        hu0Var.getStoriesController().o0(hu0Var.f29121f1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        mc.a0(hu0Var.f29145r1).G(R.raw.chats_archived, 5000, LocaleController.formatPluralString("StoryArchived", 1, new Object[0])).j();
    }

    public static void i(hu0 hu0Var, long j10, int i10, String str) {
        jh.f6 f6VarB = hu0Var.getStoriesController().B(j10, true);
        int i11 = f6VarB.f13323a;
        int iC = f6VarB.c(i10);
        if (iC == -1) {
            return;
        }
        ((jh.k6) f6VarB.h.get(iC)).f13589b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(f6VarB.f13324b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        f6VarB.f(true);
    }

    public static void j(hu0 hu0Var, TL_stories.StoryItem storyItem, jh.k6 k6Var) {
        hu0Var.getStoriesController().c(k6Var.f13588a, hu0Var.f29121f1, storyItem);
        AndroidUtilities.runOnUIThread(new lg0(13, hu0Var, k6Var), 100L);
    }

    public static void m(hu0 hu0Var, HashSet hashSet, TL_stories.StoryItem storyItem, b70 b70Var, jh.k6 k6Var) {
        String string;
        long j10 = hu0Var.f29121f1;
        if (hashSet.contains(Integer.valueOf(k6Var.f13588a))) {
            hu0Var.getStoriesController().c(k6Var.f13588a, j10, storyItem);
            string = LocaleController.formatString(R.string.StoryAddedToAlbumX, k6Var.f13589b);
        } else {
            jh.s6 storiesController = hu0Var.getStoriesController();
            int i10 = k6Var.f13588a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.c0(i10, j10, arrayList);
            string = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, k6Var.f13589b);
        }
        mc.a0(hu0Var.f29145r1).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(string)).j();
        b70Var.u();
    }

    public static void n(hu0 hu0Var, long j10, int i10) {
        jh.f6 f6VarB = hu0Var.getStoriesController().B(j10, true);
        int i11 = f6VarB.f13323a;
        int iC = f6VarB.c(i10);
        if (iC == -1) {
            return;
        }
        jh.k6 k6Var = (jh.k6) f6VarB.h.remove(iC);
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = MessagesController.getInstance(i11).getInputPeer(f6VarB.f13324b);
        tL_deleteAlbum.album_id = k6Var.f13588a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_deleteAlbum, null);
        f6VarB.f(true);
    }

    public static int p(View view) {
        if (view instanceof org.telegram.ui.Cells.o7) {
            return ((org.telegram.ui.Cells.o7) view).getMessageId();
        }
        if (view instanceof org.telegram.ui.Cells.f7) {
            return ((org.telegram.ui.Cells.f7) view).getMessage().getId();
        }
        if (view instanceof org.telegram.ui.Cells.e7) {
            return ((org.telegram.ui.Cells.e7) view).getMessage().getId();
        }
        return 0;
    }

    public static boolean p0(int i10) {
        return i10 == 8 || i10 == 9 || w0(i10);
    }

    public static void q(zs0 zs0Var, wt0[] wt0VarArr, boolean z10) {
        lg0 lg0Var;
        if (!z10) {
            if (zs0Var.C == null || (lg0Var = zs0Var.D) == null) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(lg0Var);
            zs0Var.D.run();
            zs0Var.D = null;
            zs0Var.C = null;
            return;
        }
        if (SharedConfig.fastScrollHintCount <= 0 || zs0Var.C != null || zs0Var.E || zs0Var.h.getFastScroll() == null || !zs0Var.h.getFastScroll().T || zs0Var.h.getFastScroll().getVisibility() != 0 || wt0VarArr[0].e() < 50) {
            return;
        }
        SharedConfig.setFastScrollHintCount(SharedConfig.fastScrollHintCount - 1);
        zs0Var.E = true;
        Context context = zs0Var.getContext();
        zp0 zp0Var = new zp0(context);
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SharedMediaFastScrollHint));
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        int i10 = org.telegram.ui.ActionBar.g6.f23274pf;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        zp0Var.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23291qf, false)));
        zp0Var.addView(textView, h7.z5.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
        yp0 yp0Var = new yp0(context);
        yp0Var.f34941a = new Random();
        Paint paint = new Paint(1);
        yp0Var.f34942b = paint;
        Paint paint2 = new Paint(1);
        yp0Var.f34943c = paint2;
        yp0Var.f34945f = 1.0f;
        yp0Var.h = 0.0f;
        paint.setColor(i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, i10, false), 76));
        paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        Paint paint3 = new Paint();
        yp0Var.d = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        yp0Var.f34944e = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        zp0Var.addView(yp0Var, h7.z5.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
        zs0Var.C = zp0Var;
        zs0Var.addView(zp0Var, h7.z5.c(-2.0f, -2));
        zs0Var.C.setAlpha(0.0f);
        zs0Var.C.setScaleX(0.8f);
        zs0Var.C.setScaleY(0.8f);
        zs0Var.C.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        zs0Var.invalidate();
        lg0 lg0Var2 = new lg0(12, zs0Var, zp0Var);
        zs0Var.D = lg0Var2;
        AndroidUtilities.runOnUIThread(lg0Var2, 4000L);
    }

    public static void s(hu0 hu0Var) {
        hu0 hu0Var2;
        Bitmap bitmapCreateBitmap;
        long j10 = hu0Var.f29121f1;
        wt0[] wt0VarArr = hu0Var.f29140p1;
        zs0 zs0VarW = hu0Var.W(0);
        if (zs0VarW == null || zs0VarW.getMeasuredHeight() <= 0 || zs0VarW.getMeasuredWidth() <= 0) {
            hu0Var2 = hu0Var;
        } else {
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(zs0VarW.getMeasuredWidth(), zs0VarW.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            } catch (Exception e9) {
                FileLog.e(e9);
                bitmapCreateBitmap = null;
            }
            Bitmap bitmap = bitmapCreateBitmap;
            if (bitmap != null) {
                hu0Var.D1 = true;
                zs0VarW.h.draw(new Canvas(bitmap));
                View view = new View(zs0VarW.getContext());
                view.setBackground(new BitmapDrawable(bitmap));
                zs0VarW.addView(view);
                hu0Var2 = hu0Var;
                view.animate().alpha(0.0f).setDuration(200L).setListener(new ls(hu0Var2, view, zs0VarW, bitmap, 1)).start();
                zs0VarW.h.setAlpha(0.0f);
                zs0VarW.h.animate().alpha(1.0f).setUpdateListener(new v60(zs0VarW, 20)).setDuration(200L).start();
            } else {
                hu0Var2 = hu0Var;
            }
        }
        zt0 zt0Var = hu0Var2.f29142q1;
        int[] iArr = zt0Var.f35350c;
        ArrayList arrayList = zt0Var.f35353n[0].f34325a;
        wt0 wt0Var = wt0VarArr[0];
        int[] iArr2 = wt0Var.f34329f;
        iArr2[1] = 0;
        int i10 = wt0Var.f34339q;
        if (i10 == 0) {
            iArr2[0] = iArr[0];
        } else if (i10 == 1) {
            iArr2[0] = iArr[6];
        } else {
            iArr2[0] = iArr[7];
        }
        wt0Var.h = false;
        hu0Var2.y0(0, DialogObject.isEncryptedDialog(j10) ? Integer.MIN_VALUE : Integer.MAX_VALUE, 0, true);
        hu0Var2.z0(false);
        hu0Var2.f29165z1.R();
        boolean zIsEncryptedDialog = DialogObject.isEncryptedDialog(j10);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            MessageObject messageObject = (MessageObject) arrayList.get(i11);
            wt0 wt0Var2 = wt0VarArr[0];
            int i12 = wt0Var2.f34339q;
            if (i12 == 0) {
                wt0Var2.a(messageObject, 0, false, zIsEncryptedDialog);
            } else if (i12 == 1) {
                if (messageObject.isPhoto()) {
                    wt0VarArr[0].a(messageObject, 0, false, zIsEncryptedDialog);
                }
            } else if (!messageObject.isPhoto()) {
                wt0VarArr[0].a(messageObject, 0, false, zIsEncryptedDialog);
            }
        }
    }

    public static void t(hu0 hu0Var, int i10, boolean z10) {
        zs0[] zs0VarArr = hu0Var.f29122g0;
        if (zs0VarArr[0].B == i10) {
            return;
        }
        zs0 zs0Var = zs0VarArr[1];
        zs0Var.B = i10;
        zs0Var.setVisibility(0);
        hu0Var.k0();
        hu0Var.m1(true);
        hu0Var.f29115d1 = z10;
        hu0Var.L0();
        hu0Var.A(!hu0Var.s0(i10), true);
        hu0Var.q1(true);
    }

    public static int u(hu0 hu0Var, f2.q0 q0Var) {
        if (q0Var == hu0Var.V) {
            return 8;
        }
        if (q0Var == hu0Var.f29106a0) {
            return 9;
        }
        for (gu0 gu0Var : hu0Var.U1.values()) {
            if (gu0Var.f28827c == q0Var) {
                return gu0Var.f28825a;
            }
        }
        return -1;
    }

    public static int v(hu0 hu0Var, f2.q0 q0Var) {
        if (q0Var == hu0Var.W) {
            return 8;
        }
        if (q0Var == hu0Var.f29109b0) {
            return 9;
        }
        for (gu0 gu0Var : hu0Var.U1.values()) {
            if (gu0Var.d == q0Var) {
                return gu0Var.f28825a;
            }
        }
        return -1;
    }

    public static boolean w0(int i10) {
        return (i10 & (-65536)) == 65536;
    }

    public final void A(boolean z10, boolean z11) {
        ri0 ri0Var = this.f29137o0;
        if (ri0Var == null || this.R1 == z10) {
            return;
        }
        this.R1 = z10;
        if (z10 || ri0Var.getAnimatedDrawable().X >= 20) {
            ri0Var.getAnimatedDrawable().N(this.R1 ? 50 : 100);
        } else {
            ri0Var.getAnimatedDrawable().N(0);
        }
        if (z11) {
            ri0Var.getAnimatedDrawable().start();
        } else {
            ri0Var.getAnimatedDrawable().K(ri0Var.getAnimatedDrawable().f31314f);
        }
    }

    public final void A0(int i10) {
        int i11;
        wt0[] wt0VarArr = this.f29140p1;
        if (i10 == 0) {
            int i12 = wt0VarArr[0].f34339q;
            if (i12 == 1) {
                i11 = 6;
            } else {
                i11 = i12 == 2 ? 7 : 0;
            }
        } else if (i10 == 1) {
            i11 = 1;
        } else if (i10 == 2) {
            i11 = 2;
        } else if (i10 == 4) {
            i11 = 4;
        } else {
            i11 = i10 == 5 ? 5 : 3;
        }
        wt0VarArr[i10].f34330g = true;
        org.telegram.ui.ActionBar.n2 n2Var = this.f29145r1;
        n2Var.getMediaDataController().loadMedia(this.f29121f1, 50, 0, wt0VarArr[i10].f34333k, i11, this.B, 1, n2Var.getClassGuid(), wt0VarArr[i10].f34338p, null, null);
    }

    public final void B(int i10) {
        int i11;
        zs0 zs0VarW = W(this.l1);
        this.f29146s = -1;
        if (zs0VarW != null) {
            zs0VarW.h.B0();
            this.f29133m1 = i10;
            zs0VarW.f35340r.setVisibility(0);
            if (p0(this.l1)) {
                zs0VarW.f35340r.setAdapter(l1(this.l1));
            } else {
                zs0VarW.f35340r.setAdapter(this.E);
            }
            ys0 ys0Var = zs0VarW.f35340r;
            int paddingLeft = ys0Var.getPaddingLeft();
            ys0 ys0Var2 = zs0VarW.f35340r;
            int iZ = Z(zs0VarW.B);
            ys0Var2.Z2 = iZ;
            int paddingRight = zs0VarW.f35340r.getPaddingRight();
            ys0 ys0Var3 = zs0VarW.f35340r;
            int iY = Y(v0());
            ys0Var3.a3 = iY;
            ys0Var.setPadding(paddingLeft, iZ, paddingRight, iY);
            zs0VarW.f35341s.y1(i10);
            zs0VarW.f35340r.a0();
            int i12 = 0;
            while (true) {
                zs0[] zs0VarArr = this.f29122g0;
                if (i12 >= zs0VarArr.length) {
                    break;
                }
                zs0 zs0Var = zs0VarArr[i12];
                if (zs0Var != null && ((i11 = zs0Var.B) == 0 || p0(i11))) {
                    AndroidUtilities.updateVisibleRows(zs0VarArr[i12].h);
                }
                i12++;
            }
            int i13 = 1;
            this.f29131k1 = true;
            if (this.l1 == 0) {
                this.f29140p1[0].g(true);
            }
            this.f29129j1 = 0.0f;
            X0();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.E1.lock();
            valueAnimatorOfFloat.addUpdateListener(new ur0(this, zs0VarW, i13));
            valueAnimatorOfFloat.addListener(new nh.q2(this, p0(zs0VarW.B) ? 1 : 0, i10, 2));
            valueAnimatorOfFloat.setInterpolator(er.f28122f);
            valueAnimatorOfFloat.setStartDelay(100L);
            valueAnimatorOfFloat.setDuration(350L);
            valueAnimatorOfFloat.start();
        }
    }

    public int B0() {
        return 0;
    }

    public final boolean C() {
        boolean zR0 = r0();
        long j10 = this.f29121f1;
        org.telegram.ui.ActionBar.n2 n2Var = this.f29145r1;
        if (!zR0) {
            return v0() || (n2Var != null && n2Var.getMessagesController().getStoriesController().h(j10));
        }
        TLRPC.User user = MessagesController.getInstance(n2Var.getCurrentAccount()).getUser(Long.valueOf(j10));
        return user != null && user.bot && user.bot_can_edit;
    }

    public final void C0(int i10, View view) {
        vq0 vq0Var;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChatN;
        boolean z10;
        TLRPC.User user2;
        qt0 qt0Var = this.N;
        SparseArray[] sparseArrayArr = this.V0;
        org.telegram.ui.ActionBar.n2 n2Var = this.f29145r1;
        boolean z11 = true;
        final int i11 = 0;
        if (i10 != 101) {
            if (i10 == 100) {
                if (this.f29107a1 != null && n2Var.getMessagesController().isUserNoForwards(this.f29107a1)) {
                    x30 x30Var = this.A1;
                    if (x30Var != null) {
                        x30Var.setText(LocaleController.getString(R.string.ForwardsRestrictedInfoUser));
                        this.A1.f(view, true);
                        return;
                    }
                    return;
                }
                if (this.Z0 != null) {
                    TLRPC.Chat chat2 = n2Var.getMessagesController().getChat(Long.valueOf(this.Z0.f22381id));
                    if (n2Var.getMessagesController().isChatNoForwards(chat2)) {
                        x30 x30Var2 = this.A1;
                        if (x30Var2 != null) {
                            x30Var2.setText((!ChatObject.isChannel(chat2) || chat2.megagroup) ? LocaleController.getString(R.string.ForwardsRestrictedInfoGroup) : LocaleController.getString(R.string.ForwardsRestrictedInfoChannel));
                            this.A1.f(view, true);
                            return;
                        }
                        return;
                    }
                }
                if (j0()) {
                    x30 x30Var3 = this.A1;
                    if (x30Var3 != null) {
                        x30Var3.setText(LocaleController.getString("ForwardsRestrictedInfoBot", R.string.ForwardsRestrictedInfoBot));
                        this.A1.f(view, true);
                        return;
                    }
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("canSelectTopics", true);
                bundle.putInt("dialogsType", 3);
                org.telegram.ui.gy gyVar = new org.telegram.ui.gy(bundle);
                gyVar.f38621y2 = new cq0(this);
                n2Var.presentFragment(gyVar);
                return;
            }
            if (i10 == 102) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() != 1) {
                    return;
                }
                MessageObject messageObject = (MessageObject) sparseArrayArr[sparseArrayArr[0].size() == 1 ? (char) 0 : (char) 1].valueAt(0);
                Bundle bundle2 = new Bundle();
                long dialogId = messageObject.getDialogId();
                if (DialogObject.isEncryptedDialog(dialogId)) {
                    bundle2.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
                } else if (DialogObject.isUserDialog(dialogId)) {
                    bundle2.putLong("user_id", dialogId);
                } else {
                    TLRPC.Chat chat3 = n2Var.getMessagesController().getChat(Long.valueOf(-dialogId));
                    if (chat3 != null && chat3.migrated_to != null) {
                        bundle2.putLong("migrated_to", dialogId);
                        dialogId = -chat3.migrated_to.channel_id;
                    }
                    bundle2.putLong("chat_id", -dialogId);
                }
                bundle2.putInt("message_id", messageObject.getId());
                bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                org.telegram.ui.rn rnVar = new org.telegram.ui.rn(bundle2);
                rnVar.H7 = messageObject.getId();
                long j10 = this.B;
                if (j10 != 0) {
                    wf.c.a(rnVar, MessagesStorage.TopicKey.of(dialogId, j10));
                    bundle2.putInt("message_id", messageObject.getId());
                }
                n2Var.presentFragment(rnVar, false);
                return;
            }
            if (i10 == 103 || i10 == 104) {
                if (getClosestTab() == 8) {
                    os0 os0Var = this.V;
                    if (os0Var == null || os0Var.f28155s == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < sparseArrayArr[0].size(); i12++) {
                        arrayList.add(Integer.valueOf(((MessageObject) sparseArrayArr[0].valueAt(i12)).getId()));
                    }
                    T0(arrayList, i10 == 103);
                    L(false);
                    return;
                }
                SavedMessagesController savedMessagesController = n2Var.getMessagesController().getSavedMessagesController();
                ArrayList<Long> arrayList2 = new ArrayList<>();
                for (int i13 = 0; i13 < savedMessagesController.allDialogs.size(); i13++) {
                    long j11 = savedMessagesController.allDialogs.get(i13).dialogId;
                    if (qt0Var.f31979w.contains(Long.valueOf(j11))) {
                        arrayList2.add(Long.valueOf(j11));
                    }
                }
                if (savedMessagesController.updatePinned(arrayList2, i10 == 103, true)) {
                    int i14 = 0;
                    while (true) {
                        zs0[] zs0VarArr = this.f29122g0;
                        if (i14 >= zs0VarArr.length) {
                            break;
                        }
                        zs0 zs0Var = zs0VarArr[i14];
                        if (zs0Var.B == 11) {
                            zs0Var.f35343x.h1(0, 0);
                            break;
                        }
                        i14++;
                    }
                } else {
                    n2Var.showDialog(new ag.i1(33, n2Var.getCurrentAccount(), getContext(), n2Var, null));
                }
                L(true);
                return;
            }
            return;
        }
        boolean zP0 = p0(getSelectedTab());
        int i15 = 13;
        org.telegram.ui.ActionBar.c6 c6Var = this.B1;
        if (zP0 || getSelectedTab() == 13) {
            if (sparseArrayArr[0] != null) {
                if (!r0() || (vq0Var = this.Q) == null || vq0Var.getCurrentList() == null) {
                    final ArrayList arrayList3 = new ArrayList();
                    for (int i16 = 0; i16 < sparseArrayArr[0].size(); i16++) {
                        TL_stories.StoryItem storyItem = ((MessageObject) sparseArrayArr[0].valueAt(i16)).storyItem;
                        if (storyItem != null) {
                            arrayList3.add(storyItem);
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, c6Var);
                    String string = LocaleController.getString(arrayList3.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                    b2Var.N = string;
                    b2Var.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList3.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2(this) {

                        public final hu0 f29799b;

                        {
                            this.f29799b = this;
                        }

                        @Override
                        public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i17) {
                            switch (i11) {
                                case 0:
                                    hu0 hu0Var = this.f29799b;
                                    org.telegram.ui.ActionBar.n2 n2Var2 = hu0Var.f29145r1;
                                    jh.s6 storiesController = n2Var2.getMessagesController().getStoriesController();
                                    long j12 = hu0Var.f29121f1;
                                    ArrayList arrayList4 = arrayList3;
                                    storiesController.s(j12, arrayList4);
                                    mc.a0(n2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList4.size(), new Object[0])).j();
                                    hu0Var.L(false);
                                    break;
                                default:
                                    hu0 hu0Var2 = this.f29799b;
                                    hu0Var2.getClass();
                                    int i18 = 0;
                                    while (true) {
                                        ArrayList arrayList5 = arrayList3;
                                        if (i18 >= arrayList5.size()) {
                                            hu0Var2.L(true);
                                        } else {
                                            hu0Var2.f29145r1.getMessagesController().deleteSavedDialog(((Long) arrayList5.get(i18)).longValue());
                                            i18++;
                                        }
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pc0(i15));
                    b2Var.show();
                    b2Var.h();
                    return;
                }
                jh.b6 currentList = vq0Var.getCurrentList();
                ArrayList arrayList4 = new ArrayList();
                for (int i17 = 0; i17 < sparseArrayArr[0].size(); i17++) {
                    TL_stories.StoryItem storyItem2 = ((MessageObject) sparseArrayArr[0].valueAt(i17)).storyItem;
                    if (storyItem2 != null) {
                        arrayList4.add(storyItem2.media);
                    }
                }
                if (arrayList4.isEmpty()) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, c6Var);
                String string2 = LocaleController.getString(arrayList4.size() > 1 ? R.string.DeleteBotPreviewsTitle : R.string.DeleteBotPreviewTitle);
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
                b2Var2.N = string2;
                b2Var2.P = LocaleController.formatPluralString("DeleteBotPreviewsSubtitle", arrayList4.size(), new Object[0]);
                alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new iq0(this, currentList, arrayList4, i11));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new pc0(12));
                b2Var2.show();
                b2Var2.h();
                return;
            }
            return;
        }
        if (getSelectedTab() != 11) {
            long j12 = this.f29121f1;
            if (DialogObject.isEncryptedDialog(j12)) {
                encryptedChatN = org.telegram.messenger.y1.n(n2Var.getMessagesController(), j12);
                user = null;
                chat = null;
            } else if (DialogObject.isUserDialog(j12)) {
                user = n2Var.getMessagesController().getUser(Long.valueOf(j12));
                chat = null;
                encryptedChatN = null;
            } else {
                chat = n2Var.getMessagesController().getChat(Long.valueOf(-j12));
                user = null;
                encryptedChatN = null;
            }
            y4.z(n2Var, user, chat, encryptedChatN, null, this.Y0, null, this.V0, null, 0, 0, null, new bq0(this, z11 ? 1 : 0), null, this.B1);
            return;
        }
        SavedMessagesController savedMessagesController2 = n2Var.getMessagesController().getSavedMessagesController();
        final ArrayList arrayList5 = new ArrayList();
        for (int i18 = 0; i18 < savedMessagesController2.allDialogs.size(); i18++) {
            long j13 = savedMessagesController2.allDialogs.get(i18).dialogId;
            if (qt0Var.f31979w.contains(Long.valueOf(j13))) {
                arrayList5.add(Long.valueOf(j13));
            }
        }
        String string3 = "";
        if (arrayList5.isEmpty()) {
            z10 = false;
        } else {
            Long l10 = (Long) arrayList5.get(0);
            long jLongValue = l10.longValue();
            z10 = jLongValue == n2Var.getUserConfig().getClientUserId();
            if (jLongValue < 0) {
                TLRPC.Chat chat4 = n2Var.getMessagesController().getChat(Long.valueOf(-jLongValue));
                if (chat4 != null) {
                    string3 = chat4.title;
                }
            } else if (jLongValue >= 0 && (user2 = n2Var.getMessagesController().getUser(l10)) != null) {
                string3 = UserObject.isAnonymous(user2) ? LocaleController.getString(R.string.AnonymousForward) : UserObject.getUserName(user2);
            }
        }
        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), 0, c6Var);
        String string4 = arrayList5.size() == 1 ? LocaleController.formatString(z10 ? R.string.ClearHistoryMyNotesTitle : R.string.ClearHistoryTitleSingle2, string3) : LocaleController.formatPluralString("ClearHistoryTitleMultiple", arrayList5.size(), new Object[0]);
        org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f22702a;
        b2Var3.N = string4;
        b2Var3.P = arrayList5.size() == 1 ? LocaleController.formatString(z10 ? R.string.ClearHistoryMyNotesMessage : R.string.ClearHistoryMessageSingle, string3) : LocaleController.formatPluralString("ClearHistoryMessageMultiple", arrayList5.size(), new Object[0]);
        String string5 = LocaleController.getString(R.string.Remove);
        final int i19 = z11 ? 1 : 0;
        alertDialog$Builder3.k(string5, new org.telegram.ui.ActionBar.a2(this) {

            public final hu0 f29799b;

            {
                this.f29799b = this;
            }

            @Override
            public final void f(org.telegram.ui.ActionBar.b2 b2Var4, int i110) {
                switch (i19) {
                    case 0:
                        hu0 hu0Var = this.f29799b;
                        org.telegram.ui.ActionBar.n2 n2Var2 = hu0Var.f29145r1;
                        jh.s6 storiesController = n2Var2.getMessagesController().getStoriesController();
                        long j14 = hu0Var.f29121f1;
                        ArrayList arrayList6 = arrayList5;
                        storiesController.s(j14, arrayList6);
                        mc.a0(n2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList6.size(), new Object[0])).j();
                        hu0Var.L(false);
                        break;
                    default:
                        hu0 hu0Var2 = this.f29799b;
                        hu0Var2.getClass();
                        int i111 = 0;
                        while (true) {
                            ArrayList arrayList7 = arrayList5;
                            if (i111 >= arrayList7.size()) {
                                hu0Var2.L(true);
                            } else {
                                hu0Var2.f29145r1.getMessagesController().deleteSavedDialog(((Long) arrayList7.get(i111)).longValue());
                                i111++;
                            }
                            break;
                        }
                        break;
                }
            }
        });
        alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
        n2Var.showDialog(b2Var3);
        TextView textView = (TextView) b2Var3.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
        }
    }

    public boolean D() {
        return !(this instanceof n30);
    }

    public final boolean E() {
        zs0 zs0Var;
        zs0[] zs0VarArr = this.f29122g0;
        if (zs0VarArr == null || (zs0Var = zs0VarArr[0]) == null) {
            return false;
        }
        if (this.f29123g1 && p0(zs0Var.B)) {
            return false;
        }
        boolean zP0 = p0(zs0VarArr[0].B);
        int i10 = this.f29127i1[zP0 ? 1 : 0];
        return i10 != X(zP0 ? 1 : 0, i10, false);
    }

    public final void F() {
        vr0 vr0Var = this.E0;
        if (vr0Var.e(vr0Var.getCurrentTabId())) {
            return;
        }
        int firstTabId = vr0Var.getFirstTabId();
        vr0Var.setInitialTabId(firstTabId);
        this.f29122g0[0].B = firstTabId;
        m1(false);
    }

    public final void F0() {
        jh.j6 j6Var;
        jh.j6 j6Var2;
        this.C1.removeAllObservers();
        os0 os0Var = this.V;
        if (os0Var != null && (j6Var2 = os0Var.f28155s) != null && j6Var2 != null) {
            j6Var2.z(os0Var.v);
        }
        uq0 uq0Var = this.f29106a0;
        if (uq0Var != null && (j6Var = uq0Var.f28155s) != null && j6Var != null) {
            j6Var.z(uq0Var.v);
        }
        Iterator it = this.U1.values().iterator();
        while (it.hasNext()) {
            fu0 fu0Var = ((gu0) it.next()).f28827c;
            jh.j6 j6Var3 = fu0Var.f28155s;
            if (j6Var3 != null && j6Var3 != null) {
                j6Var3.z(fu0Var.v);
            }
        }
    }

    public final void G(zs0 zs0Var, zk0 zk0Var, f2.k0 k0Var) {
        int i10;
        int i11;
        f2.o1 o1VarK;
        jh.j6 j6Var;
        if (this.f29131k1 || this.F1 != null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (zk0Var.getFastScroll() == null || !zk0Var.getFastScroll().f29396n || jCurrentTimeMillis - zs0Var.f35334a >= 300) {
            zs0Var.f35334a = jCurrentTimeMillis;
            if ((this.R0 && this.Q0 && zs0Var.B != 11) || zs0Var.B == 7) {
                return;
            }
            int iL0 = k0Var.L0();
            int iAbs = iL0 == -1 ? 0 : Math.abs(k0Var.N0() - iL0) + 1;
            int iH = zk0Var.getAdapter() == null ? 0 : zk0Var.getAdapter().h();
            int i12 = zs0Var.B;
            int[] iArr = this.f29127i1;
            wt0[] wt0VarArr = this.f29140p1;
            if (i12 == 0 || i12 == 1 || i12 == 2 || i12 == 4) {
                iH = wt0VarArr[i12].d() + wt0VarArr[i12].f34325a.size();
                wt0 wt0Var = wt0VarArr[i12];
                if (wt0Var.h && wt0Var.f34328e.size() > 2 && zs0Var.B == 0 && wt0VarArr[i12].f34325a.size() != 0) {
                    float f10 = i12 == 0 ? iArr[0] : 1;
                    int measuredHeight = (int) ((zk0Var.getMeasuredHeight() / (zk0Var.getMeasuredWidth() / f10)) * f10 * 1.5f);
                    if (measuredHeight < 100) {
                        measuredHeight = 100;
                    }
                    if (measuredHeight < ((et0) wt0VarArr[i12].f34328e.get(1)).f28150b) {
                        measuredHeight = ((et0) wt0VarArr[i12].f34328e.get(1)).f28150b;
                    }
                    if ((iL0 > iH && iL0 - iH > measuredHeight) || ((i10 = iL0 + iAbs) < wt0VarArr[i12].f34335m && wt0VarArr[0].f34335m - i10 > measuredHeight)) {
                        km kmVar = new km(this, i12, zk0Var, 12);
                        this.F1 = kmVar;
                        AndroidUtilities.runOnUIThread(kmVar);
                        return;
                    }
                }
            }
            int i13 = zs0Var.B;
            if (i13 == 7) {
                return;
            }
            if (p0(i13)) {
                eu0 eu0VarK1 = k1(zs0Var.B);
                if (eu0VarK1 == null || (j6Var = eu0VarK1.f28155s) == null || iL0 + iAbs <= j6Var.i() - iArr[1]) {
                    return;
                }
                eu0VarK1.P();
                return;
            }
            int i14 = zs0Var.B;
            if (i14 == 6) {
                if (iAbs > 0) {
                    rs0 rs0Var = this.L;
                    boolean z10 = rs0Var.h;
                    ArrayList arrayList = rs0Var.d;
                    if (z10 || rs0Var.f32261e || arrayList.isEmpty() || iL0 + iAbs < iH - 5) {
                        return;
                    }
                    rs0.E(rs0Var, ((TLRPC.Chat) i0.a.i(1, arrayList)).f22380id);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.n2 n2Var = this.f29145r1;
            if (i14 == 11) {
                int iMax = -1;
                for (int i15 = 0; i15 < zs0Var.h.getChildCount(); i15++) {
                    View childAt = zs0Var.h.getChildAt(i15);
                    zs0Var.h.getClass();
                    iMax = Math.max(RecyclerView.R(childAt), iMax);
                }
                f2.q0 adapter = zs0Var.h.getAdapter();
                st0 st0Var = this.O;
                if (adapter != st0Var) {
                    if (iMax + 1 >= n2Var.getMessagesController().getSavedMessagesController().getLoadedCount()) {
                        n2Var.getMessagesController().getSavedMessagesController().loadDialogs(false);
                        return;
                    }
                    return;
                } else {
                    if (iMax + 1 < st0Var.h.size() + st0Var.f32559e.size() || st0Var.f32563s || st0Var.f32562r) {
                        return;
                    }
                    st0Var.f32562r = true;
                    st0Var.F();
                    return;
                }
            }
            if (i14 == 10 || i14 == 12 || i14 == 13 || i14 == 14) {
                return;
            }
            int i16 = i14 == 0 ? 3 : i14 == 5 ? 10 : 6;
            int i17 = i14 == 15 ? 8 : i14;
            if (iAbs + iL0 > iH - i16 || wt0VarArr[i17].f34337o) {
                wt0 wt0Var2 = wt0VarArr[i17];
                if (!wt0Var2.f34330g) {
                    if (i14 == 0) {
                        int i18 = wt0VarArr[0].f34339q;
                        i11 = i18 == 1 ? 6 : i18 == 2 ? 7 : 0;
                    } else if (i14 == 1) {
                        i11 = 1;
                    } else if (i14 == 2) {
                        i11 = 2;
                    } else if (i14 == 4) {
                        i11 = 4;
                    } else if (i14 == 5) {
                        i11 = 5;
                    } else {
                        i11 = i14 == 15 ? 8 : 3;
                    }
                    boolean[] zArr = wt0Var2.f34331i;
                    if (!zArr[0]) {
                        wt0Var2.f34330g = true;
                        n2Var.getMediaDataController().loadMedia(this.f29121f1, 50, wt0VarArr[i17].f34332j[0], 0, i11, this.B, 1, n2Var.getClassGuid(), wt0VarArr[i17].f34338p, null, null);
                    } else if (this.Y0 != 0 && !zArr[1]) {
                        wt0Var2.f34330g = true;
                        n2Var.getMediaDataController().loadMedia(this.Y0, 50, wt0VarArr[i17].f34332j[1], 0, i11, this.B, 1, n2Var.getClassGuid(), wt0VarArr[i17].f34338p, null, null);
                    }
                }
            }
            int iL = wt0VarArr[i17].f34335m;
            if (i17 == 0) {
                iL = this.D.L(0);
            }
            if (iL0 - iL < i16 + 1) {
                wt0 wt0Var3 = wt0VarArr[i17];
                if (!wt0Var3.f34330g && !wt0Var3.f34334l && !wt0Var3.f34337o) {
                    A0(zs0Var.B);
                }
            }
            zs0 zs0Var2 = this.f29122g0[0];
            if (zs0Var2.h == zk0Var) {
                int i19 = zs0Var2.B;
                if ((i19 != 0 && i19 != 5) || iL0 == -1 || (o1VarK = zk0Var.K(iL0)) == null) {
                    return;
                }
                int i20 = o1VarK.f5793f;
                if (i20 == 0 || i20 == 12) {
                    View view = o1VarK.f5789a;
                    boolean z11 = view instanceof org.telegram.ui.Cells.p7;
                    org.telegram.ui.Cells.v0 v0Var = this.G0;
                    if (!z11) {
                        if (view instanceof org.telegram.ui.Cells.d2) {
                            v0Var.T(((org.telegram.ui.Cells.d2) view).getDate(), false, true);
                        }
                    } else {
                        org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
                        MessageObject messageObject = p7Var.f24995e <= 0 ? null : p7Var.f24993b[0];
                        if (messageObject != null) {
                            v0Var.T(messageObject.messageOwner.date, false, true);
                        }
                    }
                }
            }
        }
    }

    public final void G0(int i10, View view, MessageObject messageObject, int i11) {
        String str;
        if (messageObject == null || this.f29131k1) {
            return;
        }
        ar0 ar0Var = this.S;
        if (ar0Var == null || !ar0Var.f44658w) {
            int iDp = 0;
            iDp = 0;
            String string = null;
            if (this.f29163y1) {
                int i12 = 8;
                if (i11 == 8 && !C()) {
                    return;
                }
                char c10 = messageObject.getDialogId() == this.f29121f1 ? (char) 0 : (char) 1;
                SparseArray[] sparseArrayArr = this.V0;
                if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                    sparseArrayArr[c10].remove(messageObject.getId());
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.W0--;
                    }
                } else {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() >= 100) {
                        return;
                    }
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.W0++;
                    }
                }
                D0(sparseArrayArr[0]);
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    b1(false);
                } else {
                    this.f29156w0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    this.f29124h0.setVisibility(this.W0 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.v0 v0Var = this.f29141q0;
                    if (v0Var != null) {
                        v0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14 || sparseArrayArr[0].size() != 1) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var2 = this.f29139p0;
                    if (v0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        }
                        v0Var2.setVisibility(i12);
                    }
                    u1();
                }
                this.X0 = false;
                if (view instanceof org.telegram.ui.Cells.f7) {
                    ((org.telegram.ui.Cells.f7) view).b(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.p7) {
                    ((org.telegram.ui.Cells.p7) view).b(0, sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0);
                } else if (view instanceof org.telegram.ui.Cells.i7) {
                    ((org.telegram.ui.Cells.i7) view).f(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.e7) {
                    ((org.telegram.ui.Cells.e7) view).e(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.d2) {
                    ((org.telegram.ui.Cells.d2) view).c(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof org.telegram.ui.Cells.o7) {
                    ((org.telegram.ui.Cells.o7) view).i(sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0, true);
                }
            } else {
                fr0 fr0Var = this.f29136n1;
                wt0[] wt0VarArr = this.f29140p1;
                org.telegram.ui.ActionBar.n2 n2Var = this.f29145r1;
                if (i11 == 0) {
                    wt0 wt0Var = wt0VarArr[i11];
                    int i13 = i10 - wt0Var.f34335m;
                    if (i13 >= 0 && i13 < wt0Var.f34325a.size()) {
                        PhotoViewer.t1().K2(null, n2Var, null);
                        PhotoViewer.t1().a2(wt0VarArr[i11].f34325a, i13, this.f29121f1, this.Y0, this.B, fr0Var);
                    }
                } else if (i11 == 2 || i11 == 4) {
                    if (view instanceof org.telegram.ui.Cells.e7) {
                        ((org.telegram.ui.Cells.e7) view).a();
                    }
                } else if (i11 == 5) {
                    PhotoViewer.t1().K2(null, n2Var, null);
                    int iIndexOf = wt0VarArr[i11].f34325a.indexOf(messageObject);
                    if (iIndexOf < 0) {
                        PhotoViewer.t1().a2(org.telegram.messenger.y1.m(messageObject), 0, 0L, 0L, 0L, fr0Var);
                    } else {
                        PhotoViewer.t1().a2(wt0VarArr[i11].f34325a, iIndexOf, this.f29121f1, this.Y0, this.B, fr0Var);
                    }
                } else if (i11 == 1) {
                    if (view instanceof org.telegram.ui.Cells.f7) {
                        org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                        TLRPC.Document document = messageObject.getDocument();
                        if (f7Var.C) {
                            if (messageObject.canPreviewDocument()) {
                                PhotoViewer.t1().K2(null, n2Var, null);
                                int iIndexOf2 = wt0VarArr[i11].f34325a.indexOf(messageObject);
                                if (iIndexOf2 < 0) {
                                    PhotoViewer.t1().a2(org.telegram.messenger.y1.m(messageObject), 0, 0L, 0L, 0L, fr0Var);
                                    return;
                                } else {
                                    PhotoViewer.t1().a2(wt0VarArr[i11].f34325a, iIndexOf2, this.f29121f1, this.Y0, this.B, fr0Var);
                                    return;
                                }
                            }
                            AndroidUtilities.openDocument(messageObject, n2Var.getParentActivity(), n2Var);
                        } else if (f7Var.B) {
                            n2Var.getFileLoader().cancelLoadFile(document);
                            f7Var.f(true);
                        } else {
                            MessageObject message = f7Var.getMessage();
                            message.putInDownloadsStore = true;
                            n2Var.getFileLoader().loadFile(document, message, 0, 0);
                            f7Var.f(true);
                        }
                    }
                } else if (i11 == 3) {
                    try {
                        TLRPC.WebPage webPage = MessageObject.getMedia(messageObject.messageOwner) != null ? MessageObject.getMedia(messageObject.messageOwner).webpage : null;
                        if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                            str = null;
                        } else {
                            if (webPage.cached_page != null) {
                                LaunchActivity launchActivity = LaunchActivity.C1;
                                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().l(messageObject) == null) {
                                    n2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                    return;
                                }
                                return;
                            }
                            String str2 = webPage.embed_url;
                            if (str2 != null && str2.length() != 0) {
                                fu.J(n2Var, messageObject, this.f29136n1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                return;
                            }
                            str = webPage.url;
                        }
                        if (str == null) {
                            ArrayList arrayList = ((org.telegram.ui.Cells.i7) view).A;
                            if (arrayList.size() > 0) {
                                string = ((CharSequence) arrayList.get(0)).toString();
                            }
                            str = string;
                        }
                        if (str != null) {
                            R0(str);
                        }
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                } else if (p0(i11)) {
                    eu0 eu0VarK1 = k1(i11);
                    jh.j6 j6Var = eu0VarK1 != null ? eu0VarK1.f28155s : null;
                    if (j6Var == null) {
                        return;
                    }
                    jh.i9 orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
                    Context context = getContext();
                    int id2 = messageObject.getId();
                    jh.b7 b7VarA = jh.b7.a(this.f29122g0[0].h);
                    b7VarA.f13121e = new vu(j6Var, 18);
                    if ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).f36022o1) {
                        iDp = AndroidUtilities.dp(68.0f);
                    }
                    b7VarA.f13125s += iDp;
                    orCreateStoryViewer.C(context, id2, j6Var, b7VarA);
                }
            }
            p1();
        }
    }

    public final boolean H(MotionEvent motionEvent) {
        vq0 vq0Var;
        zs0[] zs0VarArr = this.f29122g0;
        int i10 = zs0VarArr[0].B;
        if (i10 == 13 && (vq0Var = this.Q) != null) {
            View currentView = vq0Var.f15234n.getCurrentView();
            if (currentView instanceof kh.r) {
                kh.r rVar = (kh.r) currentView;
                kh.m mVar = rVar.v;
                kh.j jVar = rVar.f15218f;
                if (rVar.f15214a != null && rVar.getParent() != null) {
                    if (!rVar.f15215b || rVar.G) {
                        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                            if (rVar.H && !rVar.G && motionEvent.getPointerCount() == 2) {
                                rVar.L = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                rVar.M = 1.0f;
                                rVar.J = motionEvent.getPointerId(0);
                                rVar.K = motionEvent.getPointerId(1);
                                jVar.I0(false);
                                jVar.cancelLongPress();
                                jVar.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                View view = (View) rVar.getParent();
                                rVar.Q = (int) ((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - rVar.getX());
                                int y10 = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - rVar.getY());
                                int i11 = rVar.Q;
                                Rect rect = rVar.R;
                                rVar.O = -1;
                                int i12 = y10 + jVar.T2;
                                for (int i13 = 0; i13 < jVar.getChildCount(); i13++) {
                                    View childAt = jVar.getChildAt(i13);
                                    childAt.getHitRect(rect);
                                    if (rect.contains(i11, i12)) {
                                        rVar.O = RecyclerView.S(childAt);
                                        rVar.P = childAt.getTop();
                                    }
                                }
                                rVar.I = true;
                            }
                            if (motionEvent.getActionMasked() == 0) {
                                if ((motionEvent.getY() - ((View) rVar.getParent()).getY()) - rVar.getY() > 0.0f) {
                                    rVar.H = true;
                                }
                            }
                        } else if (motionEvent.getActionMasked() == 2 && (rVar.G || rVar.I)) {
                            int i14 = -1;
                            int i15 = -1;
                            for (int i16 = 0; i16 < motionEvent.getPointerCount(); i16++) {
                                if (rVar.J == motionEvent.getPointerId(i16)) {
                                    i14 = i16;
                                }
                                if (rVar.K == motionEvent.getPointerId(i16)) {
                                    i15 = i16;
                                }
                            }
                            if (i14 == -1 || i15 == -1) {
                                rVar.H = false;
                                rVar.I = false;
                                rVar.G = false;
                                rVar.a();
                                return false;
                            }
                            float fHypot = ((float) Math.hypot(motionEvent.getX(i15) - motionEvent.getX(i14), motionEvent.getY(i15) - motionEvent.getY(i14))) / rVar.L;
                            rVar.M = fHypot;
                            if (!rVar.G && (fHypot > 1.01f || fHypot < 0.99f)) {
                                rVar.G = true;
                                boolean z10 = fHypot > 1.0f;
                                rVar.N = z10;
                                rVar.b(z10);
                            }
                            if (rVar.G) {
                                boolean z11 = rVar.N;
                                if ((!z11 || rVar.M >= 1.0f) && (z11 || rVar.M <= 1.0f)) {
                                    rVar.f15216c = Math.max(0.0f, Math.min(1.0f, z11 ? org.telegram.messenger.y1.a(2.0f, rVar.M, 1.0f, 1.0f) : (1.0f - rVar.M) / 0.5f));
                                } else {
                                    rVar.f15216c = 0.0f;
                                }
                                float f10 = rVar.f15216c;
                                if (f10 == 1.0f || f10 == 0.0f) {
                                    if (f10 == 1.0f) {
                                        int iCeil = (int) Math.ceil(rVar.O / rVar.f15217e);
                                        float measuredWidth = rVar.S.C.f29154v1 / (jVar.getMeasuredWidth() - ((int) (jVar.getMeasuredWidth() / rVar.f15217e)));
                                        int i17 = rVar.f15217e;
                                        int iH = (iCeil * i17) + ((int) (measuredWidth * (i17 - 1)));
                                        if (iH >= mVar.h()) {
                                            iH = mVar.h() - 1;
                                        }
                                        rVar.O = iH;
                                    }
                                    rVar.a();
                                    if (rVar.f15216c == 0.0f) {
                                        rVar.N = !rVar.N;
                                    }
                                    rVar.b(rVar.N);
                                    rVar.L = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                jVar.invalidate();
                            }
                        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((rVar.J == motionEvent.getPointerId(0) && rVar.K == motionEvent.getPointerId(1)) || (rVar.J == motionEvent.getPointerId(1) && rVar.K == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && rVar.G) {
                            rVar.I = false;
                            rVar.H = false;
                            rVar.G = false;
                            rVar.a();
                        }
                        return rVar.G;
                    }
                    return true;
                }
            }
            return false;
        }
        if ((i10 == 0 || p0(i10)) && getParent() != null) {
            if (!this.f29131k1 || this.f29105a) {
                if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                    if (this.f29108b && !this.f29105a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.f29134n = 1.0f;
                        this.f29116e = motionEvent.getPointerId(0);
                        this.f29119f = motionEvent.getPointerId(1);
                        zs0VarArr[0].h.I0(false);
                        zs0VarArr[0].h.cancelLongPress();
                        zs0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.f29155w = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - zs0VarArr[0].getX());
                        int y11 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - zs0VarArr[0].getY());
                        int i18 = this.f29155w;
                        this.f29146s = -1;
                        int i19 = y11 + zs0VarArr[0].h.T2;
                        if (getY() != 0.0f && this.A == 1) {
                            i19 = 0;
                        }
                        for (int i20 = 0; i20 < zs0VarArr[0].h.getChildCount(); i20++) {
                            View childAt2 = zs0VarArr[0].h.getChildAt(i20);
                            Rect rect2 = this.f29158x;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i18, i19)) {
                                zs0VarArr[0].h.getClass();
                                this.f29146s = RecyclerView.S(childAt2);
                                this.v = childAt2.getTop();
                            }
                        }
                        if (this.f29165z1.T() && this.f29146s == -1) {
                            this.f29146s = (int) (((this.f29127i1[p0(zs0VarArr[0].B) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i18 / zs0VarArr[0].h.getMeasuredWidth(), 0.0f))) + zs0VarArr[0].f35343x.L0());
                            this.v = 0;
                        }
                        this.f29111c = true;
                    }
                    if (motionEvent.getActionMasked() == 0) {
                        if (((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - zs0VarArr[0].getY() > 0.0f) {
                            this.f29108b = true;
                        }
                    }
                } else if (motionEvent.getActionMasked() == 2 && (this.f29105a || this.f29111c)) {
                    int i21 = -1;
                    int i22 = -1;
                    for (int i23 = 0; i23 < motionEvent.getPointerCount(); i23++) {
                        if (this.f29116e == motionEvent.getPointerId(i23)) {
                            i21 = i23;
                        }
                        if (this.f29119f == motionEvent.getPointerId(i23)) {
                            i22 = i23;
                        }
                    }
                    if (i21 == -1 || i22 == -1) {
                        this.f29108b = false;
                        this.f29111c = false;
                        this.f29105a = false;
                        T();
                        return false;
                    }
                    float fHypot2 = ((float) Math.hypot(motionEvent.getX(i22) - motionEvent.getX(i21), motionEvent.getY(i22) - motionEvent.getY(i21))) / this.h;
                    this.f29134n = fHypot2;
                    if (!this.f29105a && (fHypot2 > 1.01f || fHypot2 < 0.99f)) {
                        this.f29105a = true;
                        boolean z12 = fHypot2 > 1.0f;
                        this.f29143r = z12;
                        e1(z12);
                    }
                    if (this.f29105a) {
                        boolean z13 = this.f29143r;
                        if ((!z13 || this.f29134n >= 1.0f) && (z13 || this.f29134n <= 1.0f)) {
                            this.f29129j1 = Math.max(0.0f, Math.min(1.0f, z13 ? org.telegram.messenger.y1.a(2.0f, this.f29134n, 1.0f, 1.0f) : (1.0f - this.f29134n) / 0.5f));
                        } else {
                            this.f29129j1 = 0.0f;
                        }
                        float f11 = this.f29129j1;
                        if (f11 == 1.0f || f11 == 0.0f) {
                            f2.q0 q0VarK1 = p0(this.l1) ? k1(this.l1) : this.D;
                            if (this.f29129j1 == 1.0f) {
                                int iCeil2 = (int) Math.ceil(this.f29146s / this.f29133m1);
                                float measuredWidth2 = this.f29154v1 / (zs0VarArr[0].h.getMeasuredWidth() - ((int) (zs0VarArr[0].h.getMeasuredWidth() / this.f29133m1)));
                                int i24 = this.f29133m1;
                                int iH2 = (iCeil2 * i24) + ((int) (measuredWidth2 * (i24 - 1)));
                                if (iH2 >= q0VarK1.h()) {
                                    iH2 = q0VarK1.h() - 1;
                                }
                                this.f29146s = iH2;
                            }
                            T();
                            if (this.f29129j1 == 0.0f) {
                                this.f29143r = !this.f29143r;
                            }
                            e1(this.f29143r);
                            this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        }
                        zs0VarArr[0].h.invalidate();
                        zs0 zs0Var = zs0VarArr[0];
                        if (zs0Var.C != null) {
                            zs0Var.invalidate();
                        }
                    }
                } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.f29116e == motionEvent.getPointerId(0) && this.f29119f == motionEvent.getPointerId(1)) || (this.f29116e == motionEvent.getPointerId(1) && this.f29119f == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.f29105a) {
                    this.f29111c = false;
                    this.f29108b = false;
                    this.f29105a = false;
                    T();
                }
                return this.f29105a;
            }
            return true;
        }
        return false;
    }

    public final boolean H0(MessageObject messageObject, View view, int i10, boolean z10) {
        ar0 ar0Var;
        final TL_stories.StoryItem storyItem;
        os0 os0Var;
        jh.j6 j6Var;
        final int i11 = 0;
        if (!this.f29163y1) {
            org.telegram.ui.ActionBar.n2 n2Var = this.f29145r1;
            if (n2Var.getParentActivity() != null && messageObject != null && ((ar0Var = this.S) == null || !ar0Var.f44658w)) {
                AndroidUtilities.hideKeyboard(n2Var.getParentActivity().getCurrentFocus());
                long j10 = this.f29121f1;
                int i12 = 8;
                final int i13 = 1;
                if (!z10 || (!(w0(getClosestTab()) || getClosestTab() == 8) || this.f29163y1)) {
                    char c10 = messageObject.getDialogId() == j10 ? (char) 0 : (char) 1;
                    SparseArray[] sparseArrayArr = this.V0;
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.W0++;
                    }
                    this.f29124h0.setVisibility(this.W0 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.v0 v0Var = this.f29141q0;
                    if (v0Var != null) {
                        v0Var.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var2 = this.f29139p0;
                    if (v0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        }
                        v0Var2.setVisibility(i12);
                    }
                    this.f29156w0.a(1, false);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    int i14 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.J0;
                        if (i14 >= arrayList2.size()) {
                            break;
                        }
                        View view2 = (View) arrayList2.get(i14);
                        AndroidUtilities.clearDrawableAnimation(view2);
                        arrayList.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                        i14++;
                    }
                    animatorSet.playTogether(arrayList);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    this.X0 = false;
                    if (view instanceof org.telegram.ui.Cells.f7) {
                        ((org.telegram.ui.Cells.f7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.p7) {
                        ((org.telegram.ui.Cells.p7) view).b(i10, true);
                    } else if (view instanceof org.telegram.ui.Cells.i7) {
                        ((org.telegram.ui.Cells.i7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.e7) {
                        ((org.telegram.ui.Cells.e7) view).e(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.d2) {
                        ((org.telegram.ui.Cells.d2) view).c(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.o7) {
                        ((org.telegram.ui.Cells.o7) view).i(true, true);
                    }
                    if (!this.f29163y1) {
                        b1(true);
                    }
                    D0(sparseArrayArr[0]);
                    p1();
                    return true;
                }
                if (view instanceof org.telegram.ui.Cells.o7) {
                    org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                    o7Var.k(o7Var.f24799n, o7Var.f24804r, true);
                }
                TL_stories.StoryItem storyItem2 = messageObject.storyItem;
                if (storyItem2 != null) {
                    HashSet hashSet = new HashSet();
                    ArrayList<Integer> arrayList3 = storyItem2.albums;
                    if (arrayList3 != null) {
                        hashSet.addAll(arrayList3);
                    }
                    boolean zW0 = w0(getClosestTab());
                    b70 b70VarI = b70.I(n2Var, view);
                    b70 b70VarJ = b70VarI.J();
                    b70VarJ.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.lt0(b70VarI, 25), false);
                    b70VarJ.k();
                    b70.f(b70VarJ, getStoriesController().B(j10, true), hashSet, true, new org.telegram.ui.ActionBar.i3(this, storyItem2, b70VarI, 28), new cg.e1(this, hashSet, storyItem2, b70VarI, 11));
                    b70VarI.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddToAlbum), new gh.f3(b70VarI, b70VarJ, i12), false);
                    b70VarI.k();
                    b70VarI.c(R.drawable.msg_select, LocaleController.getString(R.string.StoriesAlbumMenuSelect), new ag.k0(this, messageObject, view, i10, 22), false);
                    final int i15 = 3;
                    if (zW0) {
                        int iH1 = h1(getClosestTab());
                        String strW = getStoriesController().w(iH1, j10);
                        b70VarI.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new xl(this, iH1, 5), false);
                        storyItem = storyItem2;
                        b70VarI.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.StoriesAlbumMenuRemoveFromAlbum), new ag.k0(this, iH1, storyItem, strW, 23), false);
                    } else {
                        if (getClosestTab() == 8 && (os0Var = this.V) != null && (j6Var = os0Var.f28155s) != null) {
                            if (j6Var.m(storyItem.f22617id)) {
                                storyItem = storyItem2;
                                b70VarI.c(R.drawable.chats_unpin, LocaleController.getString(R.string.StoriesAlbumMenuUnpin), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                hu0 hu0Var = this;
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hu0Var.getContext(), 0, hu0Var.B1);
                                                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DeleteStoryTitle);
                                                alertDialog$Builder.f22702a.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kq0(hu0Var, storyItem));
                                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pc0(14));
                                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                                                b2Var.show();
                                                b2Var.h();
                                                break;
                                            case 1:
                                                hu0 hu0Var2 = this;
                                                hu0Var2.getClass();
                                                hu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22617id))), false);
                                                break;
                                            case 2:
                                                hu0 hu0Var3 = this;
                                                hu0Var3.getClass();
                                                hu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22617id))), true);
                                                break;
                                            default:
                                                hu0.h(this, storyItem);
                                                break;
                                        }
                                    }
                                }, false);
                            } else {
                                storyItem = storyItem2;
                                final int i16 = 2;
                                b70VarI.c(R.drawable.chats_pin, LocaleController.getString(R.string.StoriesAlbumMenuPin), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i16) {
                                            case 0:
                                                hu0 hu0Var = this;
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hu0Var.getContext(), 0, hu0Var.B1);
                                                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DeleteStoryTitle);
                                                alertDialog$Builder.f22702a.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kq0(hu0Var, storyItem));
                                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pc0(14));
                                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                                                b2Var.show();
                                                b2Var.h();
                                                break;
                                            case 1:
                                                hu0 hu0Var2 = this;
                                                hu0Var2.getClass();
                                                hu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22617id))), false);
                                                break;
                                            case 2:
                                                hu0 hu0Var3 = this;
                                                hu0Var3.getClass();
                                                hu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22617id))), true);
                                                break;
                                            default:
                                                hu0.h(this, storyItem);
                                                break;
                                        }
                                    }
                                }, false);
                            }
                        }
                        storyItem = storyItem2;
                        storyItem = storyItem2;
                        storyItem = storyItem2;
                        b70VarI.c(R.drawable.msg_archive, LocaleController.getString(R.string.StoriesAlbumMenuArchive), new Runnable() {
                            @Override
                            public final void run() {
                                switch (i15) {
                                    case 0:
                                        hu0 hu0Var = this;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hu0Var.getContext(), 0, hu0Var.B1);
                                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DeleteStoryTitle);
                                        alertDialog$Builder.f22702a.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kq0(hu0Var, storyItem));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pc0(14));
                                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                                        b2Var.show();
                                        b2Var.h();
                                        break;
                                    case 1:
                                        hu0 hu0Var2 = this;
                                        hu0Var2.getClass();
                                        hu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22617id))), false);
                                        break;
                                    case 2:
                                        hu0 hu0Var3 = this;
                                        hu0Var3.getClass();
                                        hu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22617id))), true);
                                        break;
                                    default:
                                        hu0.h(this, storyItem);
                                        break;
                                }
                            }
                        }, false);
                    }
                    b70VarI.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() {
                        @Override
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    hu0 hu0Var = this;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hu0Var.getContext(), 0, hu0Var.B1);
                                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DeleteStoryTitle);
                                    alertDialog$Builder.f22702a.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kq0(hu0Var, storyItem));
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pc0(14));
                                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                                    b2Var.show();
                                    b2Var.h();
                                    break;
                                case 1:
                                    hu0 hu0Var2 = this;
                                    hu0Var2.getClass();
                                    hu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22617id))), false);
                                    break;
                                case 2:
                                    hu0 hu0Var3 = this;
                                    hu0Var3.getClass();
                                    hu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22617id))), true);
                                    break;
                                default:
                                    hu0.h(this, storyItem);
                                    break;
                            }
                        }
                    }, true);
                    b70VarI.f26974i = 3;
                    b70VarI.f26994u = true;
                    b70VarI.v = true;
                    b70VarI.L = true;
                    b70VarI.M = 3;
                    Point point = AndroidUtilities.displaySize;
                    int iMin = (int) (Math.min(point.x, point.y) * 0.6777f);
                    Point point2 = AndroidUtilities.displaySize;
                    int iMin2 = Math.min(iMin, (int) (((Math.max(point2.x, point2.y) * 0.4333f) * 3.0f) / 4.0f));
                    b70VarI.N = iMin2;
                    b70VarI.O = (iMin2 * 4) / 3;
                    b70VarI.f26993t = true;
                    b70VarI.P = true;
                    b70VarI.W = true;
                    b70VarI.Z();
                    return true;
                }
            }
        }
        return false;
    }

    public final void I() {
        float fAbs;
        zs0[] zs0VarArr = this.f29122g0;
        zs0 zs0Var = zs0VarArr[0];
        if (zs0Var == null || zs0VarArr[1] == null) {
            return;
        }
        float f10 = 0.0f;
        ar0 ar0Var = this.S;
        if (ar0Var != null) {
            char c10 = (!p0(zs0Var.B) || zs0VarArr[0].B == 9) ? (char) 0 : (char) 1;
            if (c10 == (zs0VarArr[1].getVisibility() == 0 ? (!p0(zs0VarArr[1].B) || zs0VarArr[1].B == 9) ? (char) 0 : (char) 1 : c10)) {
                fAbs = c10 != 0 ? 1.0f : 0.0f;
                ar0Var.setTranslationX(c10 != 0 ? 0.0f : zs0VarArr[0].getMeasuredWidth());
            } else {
                ar0Var.setTranslationX(zs0VarArr[c10 ^ 1].getTranslationX());
                fAbs = 1.0f - (Math.abs(ar0Var.getTranslationX()) / ar0Var.getMeasuredWidth());
            }
            float fClamp01 = 0.0f;
            for (int i10 = 0; i10 < zs0VarArr.length; i10++) {
                if (zs0VarArr[i10].getVisibility() == 0) {
                    er0 er0Var = zs0VarArr[i10].h;
                    View childAt = er0Var.getChildCount() == 0 ? null : er0Var.getChildAt(0);
                    fClamp01 += Utilities.clamp01(1.0f - (zs0VarArr[i10].getTranslationX() / zs0VarArr[i10].getMeasuredWidth())) * ((childAt == null ? -1 : RecyclerView.R(childAt)) == 0 ? childAt.getY() - er0Var.getPaddingTop() : er0Var.getChildCount() == 0 ? 0.0f : -AndroidUtilities.dp(48.0f));
                }
            }
            float fClamp02 = Utilities.clamp01(1.0f - ((-fClamp01) / AndroidUtilities.dpf2(48.0f)));
            float fLerp = AndroidUtilities.lerp(0.9f, 1.0f, fClamp02);
            ar0Var.setAlpha(fClamp02);
            ar0Var.setScaleX(fLerp);
            ar0Var.setScaleY(fLerp);
            ar0Var.setTranslationY(this.G1 + fClamp01);
            f10 = fAbs;
        }
        K();
        if (this.Q1 != f10) {
            this.Q1 = f10;
            o0();
            invalidate();
        }
    }

    public boolean I0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return false;
    }

    public final boolean J() {
        AnimatorSet animatorSet;
        if (!this.f29113c1) {
            return false;
        }
        boolean z10 = this.f29118e1;
        zs0[] zs0VarArr = this.f29122g0;
        if (z10) {
            if (Math.abs(zs0VarArr[0].getTranslationX()) < 1.0f) {
                zs0VarArr[0].setTranslationX(0.0f);
                zs0VarArr[1].setTranslationX(zs0VarArr[0].getMeasuredWidth() * (this.f29115d1 ? 1 : -1));
                animatorSet = this.f29110b1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f29110b1 = null;
                }
                this.f29113c1 = false;
            }
        } else if (Math.abs(zs0VarArr[1].getTranslationX()) < 1.0f) {
            zs0 zs0Var = zs0VarArr[0];
            zs0Var.setTranslationX(zs0Var.getMeasuredWidth() * (this.f29115d1 ? -1 : 1));
            zs0VarArr[1].setTranslationX(0.0f);
            animatorSet = this.f29110b1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f29110b1 = null;
            }
            this.f29113c1 = false;
        }
        M0(getTabProgress());
        return this.f29113c1;
    }

    public final void J0(float f10) {
        zs0[] zs0VarArr = this.f29122g0;
        if (f10 != 1.0f || zs0VarArr[1].getVisibility() == 0) {
            if (this.f29115d1) {
                zs0 zs0Var = zs0VarArr[0];
                zs0Var.setTranslationX((-f10) * zs0Var.getMeasuredWidth());
                zs0VarArr[1].setTranslationX(zs0VarArr[0].getMeasuredWidth() - (zs0VarArr[0].getMeasuredWidth() * f10));
            } else {
                zs0 zs0Var2 = zs0VarArr[0];
                zs0Var2.setTranslationX(zs0Var2.getMeasuredWidth() * f10);
                zs0VarArr[1].setTranslationX((zs0VarArr[0].getMeasuredWidth() * f10) - zs0VarArr[0].getMeasuredWidth());
            }
            M0(getTabProgress());
            float fA0 = a0(f10);
            this.f29132l0 = fA0;
            this.f29135n0.setVisibility((fA0 == 0.0f || !D() || q0()) ? 4 : 0);
            org.telegram.ui.ActionBar.v0 v0Var = this.f29128j0;
            if (v0Var == null || D()) {
                this.f29130k0 = b0(f10);
                t1();
            } else {
                v0Var.setVisibility(v0() ? 8 : 4);
                this.f29130k0 = 0.0f;
            }
            q1(false);
            if (f10 == 1.0f) {
                zs0 zs0Var3 = zs0VarArr[0];
                zs0VarArr[0] = zs0VarArr[1];
                zs0VarArr[1] = zs0Var3;
                zs0Var3.setVisibility(8);
                if (v0Var != null && this.f29149t0 == 2) {
                    v0Var.setVisibility(v0() ? 8 : 4);
                }
                this.f29149t0 = 0;
                f1();
            }
        }
    }

    public final void K() {
        zr zrVar = this.L0;
        if (zrVar != null) {
            ar0 ar0Var = this.S;
            float visibilityFactor = 0.0f;
            if (ar0Var != null) {
                visibilityFactor = 0.0f + (ar0Var.getVisibilityFactor() * AndroidUtilities.dp(38.0f) * (1.0f - Math.abs(ar0Var.getTranslationX() / ar0Var.getMeasuredWidth())));
            }
            zrVar.setTranslationY(this.G1 + visibilityFactor);
        }
    }

    public final boolean L(boolean z10) {
        SparseArray[] sparseArrayArr;
        if (!this.f29163y1) {
            return false;
        }
        int i10 = 1;
        while (true) {
            sparseArrayArr = this.V0;
            if (i10 < 0) {
                break;
            }
            sparseArrayArr[i10].clear();
            i10--;
        }
        this.W0 = 0;
        D0(sparseArrayArr[0]);
        vq0 vq0Var = this.Q;
        if (vq0Var != null) {
            vq0Var.h();
            vq0Var.j();
        }
        b1(false);
        r1(z10);
        qt0 qt0Var = this.N;
        if (qt0Var != null) {
            qt0Var.f31979w.clear();
        }
        return true;
    }

    public void L0() {
        boolean z10 = v0() || q0();
        cu0 cu0Var = this.f29106a0.f28156w;
        if (cu0Var != null) {
            cu0Var.b(z10 && getClosestTab() == 9);
        }
        cu0 cu0Var2 = this.V.f28156w;
        if (cu0Var2 != null) {
            cu0Var2.b(z10 && getClosestTab() == 8);
        }
        for (gu0 gu0Var : this.U1.values()) {
            fu0 fu0Var = gu0Var.f28827c;
            if (fu0Var.f28155s != null) {
                fu0Var.f28156w.b(z10 && getClosestTab() == gu0Var.f28825a);
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.f29128j0;
        if (v0Var != null) {
            sr0 sr0Var = this.F0;
            v0Var.setSearchFieldHint(LocaleController.getString((sr0Var != null && sr0Var.a() && getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
        I();
    }

    public void M0(float f10) {
        E0();
    }

    public boolean N() {
        return this instanceof n30;
    }

    public final boolean O(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x8 = (-view.getX()) - getX();
        zs0[] zs0VarArr = this.f29122g0;
        motionEvent.offsetLocation(x8 - zs0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - zs0VarArr[0].getY()) - zs0VarArr[0].h.getFastScroll().getY());
        return zs0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public final void O0(org.telegram.ui.ActionBar.n2 n2Var, long j10, int i10) {
        new org.telegram.ui.n61(n2Var, j10, this.f29127i1[1], new ic(this, j10, i10)).show();
    }

    public void P(Canvas canvas, float f10, Rect rect, Paint paint) {
        canvas.drawRect(rect, paint);
    }

    public final void P0(org.telegram.ui.ActionBar.n2 n2Var, long j10, int i10) {
        y4.v0(n2Var, LocaleController.getString(R.string.Delete), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesAlbumMenuDeleteAlbumAsk, getStoriesController().w(i10, j10))), LocaleController.getString(R.string.Delete), true, new hh.d9(this, j10, i10, 8));
    }

    public final void Q(Canvas canvas, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            zs0[] zs0VarArr = this.f29122g0;
            if (i10 >= zs0VarArr.length) {
                return;
            }
            zs0 zs0Var = zs0VarArr[i10];
            if (zs0Var != null && zs0Var.getVisibility() == 0) {
                for (int i11 = 0; i11 < zs0VarArr[i10].h.getChildCount(); i11++) {
                    View childAt = zs0VarArr[i10].h.getChildAt(i11);
                    if (childAt.getY() < AndroidUtilities.dp(100.0f) + zs0VarArr[i10].h.T2) {
                        int iSave = canvas.save();
                        canvas.translate(childAt.getX() + zs0VarArr[i10].getX(), childAt.getY() + zs0VarArr[i10].h.getY() + zs0VarArr[i10].getY() + getY());
                        childAt.draw(canvas);
                        if (arrayList != null && (childAt instanceof wu0)) {
                            arrayList.add((wu0) childAt);
                        }
                        canvas.restoreToCount(iSave);
                    }
                }
            }
            i10++;
        }
    }

    public final void Q0(org.telegram.ui.ActionBar.n2 n2Var, long j10, int i10) {
        String strW = getStoriesController().w(i10, j10);
        Context context = n2Var.getContext();
        org.telegram.ui.ActionBar.c6 resourceProvider = n2Var.getResourceProvider();
        i3.e eVar = new i3.e(this, j10, i10);
        Pattern pattern = y4.f34802a;
        y4.R(context, n2Var, LocaleController.getString(R.string.StoriesAlbumRename), LocaleController.getString(R.string.StoriesAlbumRenameHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), strW, 12, LocaleController.getString(R.string.Rename), resourceProvider, eVar);
    }

    public final boolean R(int i10) {
        wt0[] wt0VarArr = this.f29142q1.f35353n;
        if (wt0VarArr == null) {
            return false;
        }
        wt0[] wt0VarArr2 = this.f29140p1;
        if (i10 == 0) {
            wt0 wt0Var = wt0VarArr2[i10];
            if (!wt0Var.h) {
                int[] iArr = wt0Var.f34329f;
                int[] iArr2 = wt0VarArr[i10].f34329f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = wt0VarArr2[i10].f34329f;
            int[] iArr4 = wt0VarArr[i10].f34329f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        wt0VarArr2[i10].f34325a.addAll(wt0VarArr[i10].f34325a);
        wt0VarArr2[i10].f34327c.addAll(wt0VarArr[i10].f34327c);
        for (Map.Entry entry : wt0VarArr[i10].d.entrySet()) {
            wt0VarArr2[i10].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i11 = 0; i11 < 2; i11++) {
            wt0VarArr2[i10].f34326b[i11] = wt0VarArr[i10].f34326b[i11].clone();
            wt0 wt0Var2 = wt0VarArr2[i10];
            int[] iArr5 = wt0Var2.f34332j;
            wt0 wt0Var3 = wt0VarArr[i10];
            iArr5[i11] = wt0Var3.f34332j[i11];
            wt0Var2.f34331i[i11] = wt0Var3.f34331i[i11];
        }
        wt0VarArr2[i10].f34328e.addAll(wt0VarArr[i10].f34328e);
        return !wt0VarArr[i10].f34325a.isEmpty();
    }

    public final void R0(String str) {
        boolean zShouldShowUrlInAlert = AndroidUtilities.shouldShowUrlInAlert(str);
        org.telegram.ui.ActionBar.n2 n2Var = this.f29145r1;
        if (zShouldShowUrlInAlert) {
            y4.q0(n2Var, str, true, true);
        } else {
            we.e.s(n2Var.getParentActivity(), str);
        }
    }

    public final void S(int i10, zk0 zk0Var, boolean z10) {
        ArrayList arrayList = this.f29140p1[i10].f34328e;
        int iL0 = ((f2.k0) zk0Var.getLayoutManager()).L0();
        if (iL0 >= 0) {
            et0 et0Var = null;
            if (arrayList != null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (iL0 <= ((et0) arrayList.get(i11)).f28150b) {
                        et0Var = (et0) arrayList.get(i11);
                        break;
                    }
                }
                if (et0Var == null) {
                    et0Var = (et0) i0.a.i(1, arrayList);
                }
            }
            if (et0Var != null) {
                y0(i10, et0Var.d, et0Var.f28150b + 1, z10);
            }
        }
    }

    public int S0() {
        return -1;
    }

    public final void T() {
        zs0[] zs0VarArr;
        zs0 zs0Var;
        int i10;
        f2.q0 adapter;
        if (this.f29131k1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                zs0VarArr = this.f29122g0;
                if (i12 >= zs0VarArr.length) {
                    zs0Var = null;
                    break;
                }
                zs0Var = zs0VarArr[i12];
                if (zs0Var.B == this.l1) {
                    break;
                } else {
                    i12++;
                }
            }
            if (zs0Var != null) {
                boolean zP0 = p0(zs0Var.B);
                float f10 = this.f29129j1;
                wt0[] wt0VarArr = this.f29140p1;
                if (f10 != 1.0f) {
                    if (f10 == 0.0f) {
                        this.f29131k1 = false;
                        if (this.l1 == 0) {
                            wt0VarArr[0].g(false);
                        }
                        zs0Var.f35340r.setVisibility(8);
                        zs0Var.h.invalidate();
                        return;
                    }
                    boolean z10 = f10 > 0.2f;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
                    valueAnimatorOfFloat.addUpdateListener(new ur0(this, zs0Var, i11));
                    valueAnimatorOfFloat.addListener(new org.telegram.ui.ui(this, z10, zP0 ? 1 : 0, zs0Var));
                    valueAnimatorOfFloat.setInterpolator(er.f28122f);
                    valueAnimatorOfFloat.setDuration(200L);
                    valueAnimatorOfFloat.start();
                    return;
                }
                this.f29131k1 = false;
                int i13 = this.f29133m1;
                int[] iArr = this.f29127i1;
                iArr[zP0 ? 1 : 0] = i13;
                if (!zP0) {
                    SharedConfig.setMediaColumnsCount(i13);
                } else if (c0(zs0Var.B) >= 5) {
                    SharedConfig.setStoriesColumnsCount(this.f29133m1);
                }
                for (int i14 = 0; i14 < zs0VarArr.length; i14++) {
                    zs0 zs0Var2 = zs0VarArr[i14];
                    if (zs0Var2 != null && zs0Var2.h != null && (((i10 = zs0Var2.B) == 0 || p0(i10)) && (adapter = zs0VarArr[i14].h.getAdapter()) != null)) {
                        int iH = adapter.h();
                        if (i14 == 0) {
                            wt0VarArr[0].g(false);
                        }
                        zs0VarArr[i14].f35340r.setVisibility(8);
                        zs0VarArr[i14].f35343x.y1(iArr[zP0 ? 1 : 0]);
                        zs0VarArr[i14].h.a0();
                        zs0VarArr[i14].h.invalidate();
                        if (adapter.h() == iH) {
                            AndroidUtilities.updateVisibleRows(zs0VarArr[i14].h);
                        } else {
                            adapter.l();
                        }
                    }
                }
                if (this.f29146s < 0) {
                    X0();
                    return;
                }
                while (i11 < zs0VarArr.length) {
                    zs0 zs0Var3 = zs0VarArr[i11];
                    if (zs0Var3.B == this.l1) {
                        View viewM = zs0Var3.f35341s.m(this.f29146s);
                        if (viewM != null) {
                            this.v = viewM.getTop();
                        }
                        zs0 zs0Var4 = zs0VarArr[i11];
                        zs0Var4.f35343x.h1(this.f29146s, (-zs0Var4.h.getPaddingTop()) + this.v);
                    }
                    i11++;
                }
            }
        }
    }

    public final void T0(ArrayList arrayList, boolean z10) {
        os0 os0Var = this.V;
        if (os0Var == null || os0Var.f28155s == null) {
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f29145r1;
        if (z10 && arrayList.size() > n2Var.getMessagesController().storiesPinnedToTopCountMax) {
            mc.a0(n2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", n2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
            return;
        }
        jh.j6 j6Var = os0Var.f28155s;
        int i10 = j6Var.f13536c;
        ArrayList arrayList2 = j6Var.f13539g;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        boolean z11 = true;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Integer num = (Integer) arrayList.get(size);
            num.getClass();
            if (z10 && !arrayList3.contains(num)) {
                arrayList3.add(0, num);
            } else if (!z10 && arrayList3.contains(num)) {
                arrayList3.remove(num);
            }
        }
        boolean z12 = arrayList3.size() > MessagesController.getInstance(i10).storiesPinnedToTopCountMax;
        if (!z12) {
            boolean z13 = arrayList2.size() != arrayList3.size();
            if (!z13) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (arrayList2.get(i11) != arrayList3.get(i11)) {
                        z13 = true;
                        break;
                    }
                }
            }
            if (z13) {
                arrayList2.clear();
                arrayList2.addAll(arrayList3);
                j6Var.d(true);
                TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                tL_togglePinnedToTop.f22630id.addAll(arrayList2);
                tL_togglePinnedToTop.peer = MessagesController.getInstance(i10).getInputPeer(j6Var.d);
                ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new jh.m5(2));
            }
            z11 = z12;
        }
        if (z11) {
            mc.a0(n2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", n2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
        } else if (z10) {
            mc.a0(n2Var).M(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinned", arrayList.size(), new Object[0])), LocaleController.formatPluralString("StoriesPinnedText", arrayList.size(), new Object[0]), R.raw.ic_pin).j();
        } else {
            mc.a0(n2Var).Q(R.raw.ic_unpin, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesUnpinned", arrayList.size(), new Object[0]))).j();
        }
    }

    public final void U(int i10) {
        ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i10 == 0) {
            if (AndroidUtilities.isTablet() || ApplicationLoader.applicationContext.getResources().getConfiguration().orientation != 2) {
                this.f29156w0.setTextSize(20);
            } else {
                this.f29156w0.setTextSize(18);
            }
        }
        if (i10 == 0) {
            this.D.l();
        }
    }

    public final boolean U0(MotionEvent motionEvent, boolean z10) {
        zs0 zs0Var;
        zs0 zs0Var2;
        vq0 vq0Var;
        int closestTab = getClosestTab();
        vr0 vr0Var = this.E0;
        int currentAlbumId = -1;
        int i10 = vr0Var.K.get(vr0Var.f26523n + (z10 ? 1 : -1), -1);
        ar0 ar0Var = this.S;
        if (ar0Var != null) {
            if (w0(closestTab) || closestTab == 8) {
                o71 o71Var = ar0Var.f44655n;
                currentAlbumId = o71Var.U.get(o71Var.B + (z10 ? 1 : -1), -1);
            } else if (w0(i10) || i10 == 8) {
                currentAlbumId = ar0Var.getCurrentAlbumId();
            }
            if (currentAlbumId == 0) {
                i10 = 8;
            } else if (currentAlbumId > 0) {
                i10 = i1(currentAlbumId).f28825a;
            }
        }
        if (i10 >= 0) {
            org.telegram.ui.ActionBar.v0 v0Var = this.f29128j0;
            if (v0Var == null || D()) {
                this.f29130k0 = b0(0.0f);
                s1(0.0f);
            } else {
                v0Var.setVisibility(v0() ? 8 : 4);
                this.f29130k0 = 0.0f;
            }
            if ((!this.R0 || getSelectedTab() != 11) && (!C() || !this.f29163y1 || (getClosestTab() != 8 && !w0(getClosestTab())))) {
                zs0[] zs0VarArr = this.f29122g0;
                zs0 zs0Var3 = zs0VarArr[0];
                if (zs0Var3 == null || zs0Var3.B != 13 || (vq0Var = this.Q) == null) {
                    zs0Var = zs0VarArr[0];
                    wq0 wq0Var = this.R;
                    if (zs0Var == null && zs0Var.B == 14 && wq0Var != null) {
                        gh.x2 x2Var = wq0Var.h;
                        if (!z10 ? x2Var.getCurrentPosition() <= 0 : x2Var.getCurrentPosition() >= wq0Var.f7200e.d().size()) {
                            if (this.f29163y1) {
                                q1(false);
                                getParent().requestDisallowInterceptTouchEvent(true);
                                k0();
                                this.f29152u1 = false;
                                this.f29150t1 = true;
                                N0(true);
                                this.f29154v1 = (int) motionEvent.getX();
                                this.C.setEnabled(false);
                                vr0Var.setEnabled(false);
                                zs0 zs0Var4 = zs0VarArr[1];
                                zs0Var4.B = i10;
                                zs0Var4.setVisibility(0);
                                this.f29115d1 = z10;
                                m1(true);
                                if (z10) {
                                    zs0VarArr[1].setTranslationX(zs0VarArr[0].getMeasuredWidth());
                                } else {
                                    zs0VarArr[1].setTranslationX(-zs0VarArr[0].getMeasuredWidth());
                                }
                                M0(getTabProgress());
                                return true;
                            }
                            q1(false);
                            getParent().requestDisallowInterceptTouchEvent(true);
                            k0();
                            this.f29152u1 = false;
                            this.f29150t1 = true;
                            N0(true);
                            this.f29154v1 = (int) motionEvent.getX();
                            this.C.setEnabled(false);
                            vr0Var.setEnabled(false);
                            zs0 zs0Var5 = zs0VarArr[1];
                            zs0Var5.B = i10;
                            zs0Var5.setVisibility(0);
                            this.f29115d1 = z10;
                            m1(true);
                            if (z10) {
                                zs0VarArr[1].setTranslationX(zs0VarArr[0].getMeasuredWidth());
                            } else {
                                zs0VarArr[1].setTranslationX(-zs0VarArr[0].getMeasuredWidth());
                            }
                            M0(getTabProgress());
                            return true;
                        }
                    } else if ((this.f29163y1 || (zs0Var2 = zs0VarArr[0]) == null || zs0Var2.B != 13) && ((wq0Var == null || !wq0Var.g()) && (ar0Var == null || !ar0Var.f44658w))) {
                        q1(false);
                        getParent().requestDisallowInterceptTouchEvent(true);
                        k0();
                        this.f29152u1 = false;
                        this.f29150t1 = true;
                        N0(true);
                        this.f29154v1 = (int) motionEvent.getX();
                        this.C.setEnabled(false);
                        vr0Var.setEnabled(false);
                        zs0 zs0Var6 = zs0VarArr[1];
                        zs0Var6.B = i10;
                        zs0Var6.setVisibility(0);
                        this.f29115d1 = z10;
                        m1(true);
                        if (z10) {
                            zs0VarArr[1].setTranslationX(zs0VarArr[0].getMeasuredWidth());
                        } else {
                            zs0VarArr[1].setTranslationX(-zs0VarArr[0].getMeasuredWidth());
                        }
                        M0(getTabProgress());
                        return true;
                    }
                } else {
                    kh.a aVar = vq0Var.f15234n;
                    if (!z10 ? aVar.getCurrentPosition() == 0 : aVar.getCurrentPosition() == vq0Var.f15233f.size()) {
                        zs0Var = zs0VarArr[0];
                        wq0 wq0Var2 = this.R;
                        if (zs0Var == null) {
                            if (this.f29163y1) {
                                q1(false);
                                getParent().requestDisallowInterceptTouchEvent(true);
                                k0();
                                this.f29152u1 = false;
                                this.f29150t1 = true;
                                N0(true);
                                this.f29154v1 = (int) motionEvent.getX();
                                this.C.setEnabled(false);
                                vr0Var.setEnabled(false);
                                zs0 zs0Var7 = zs0VarArr[1];
                                zs0Var7.B = i10;
                                zs0Var7.setVisibility(0);
                                this.f29115d1 = z10;
                                m1(true);
                                if (z10) {
                                    zs0VarArr[1].setTranslationX(zs0VarArr[0].getMeasuredWidth());
                                } else {
                                    zs0VarArr[1].setTranslationX(-zs0VarArr[0].getMeasuredWidth());
                                }
                                M0(getTabProgress());
                                return true;
                            }
                            q1(false);
                            getParent().requestDisallowInterceptTouchEvent(true);
                            k0();
                            this.f29152u1 = false;
                            this.f29150t1 = true;
                            N0(true);
                            this.f29154v1 = (int) motionEvent.getX();
                            this.C.setEnabled(false);
                            vr0Var.setEnabled(false);
                            zs0 zs0Var8 = zs0VarArr[1];
                            zs0Var8.B = i10;
                            zs0Var8.setVisibility(0);
                            this.f29115d1 = z10;
                            m1(true);
                            if (z10) {
                                zs0VarArr[1].setTranslationX(zs0VarArr[0].getMeasuredWidth());
                            } else {
                                zs0VarArr[1].setTranslationX(-zs0VarArr[0].getMeasuredWidth());
                            }
                            M0(getTabProgress());
                            return true;
                        }
                        if (this.f29163y1) {
                            q1(false);
                            getParent().requestDisallowInterceptTouchEvent(true);
                            k0();
                            this.f29152u1 = false;
                            this.f29150t1 = true;
                            N0(true);
                            this.f29154v1 = (int) motionEvent.getX();
                            this.C.setEnabled(false);
                            vr0Var.setEnabled(false);
                            zs0 zs0Var9 = zs0VarArr[1];
                            zs0Var9.B = i10;
                            zs0Var9.setVisibility(0);
                            this.f29115d1 = z10;
                            m1(true);
                            if (z10) {
                                zs0VarArr[1].setTranslationX(zs0VarArr[0].getMeasuredWidth());
                            } else {
                                zs0VarArr[1].setTranslationX(-zs0VarArr[0].getMeasuredWidth());
                            }
                            M0(getTabProgress());
                            return true;
                        }
                        q1(false);
                        getParent().requestDisallowInterceptTouchEvent(true);
                        k0();
                        this.f29152u1 = false;
                        this.f29150t1 = true;
                        N0(true);
                        this.f29154v1 = (int) motionEvent.getX();
                        this.C.setEnabled(false);
                        vr0Var.setEnabled(false);
                        zs0 zs0Var10 = zs0VarArr[1];
                        zs0Var10.B = i10;
                        zs0Var10.setVisibility(0);
                        this.f29115d1 = z10;
                        m1(true);
                        if (z10) {
                            zs0VarArr[1].setTranslationX(zs0VarArr[0].getMeasuredWidth());
                        } else {
                            zs0VarArr[1].setTranslationX(-zs0VarArr[0].getMeasuredWidth());
                        }
                        M0(getTabProgress());
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String V(boolean z10) {
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        vq0 vq0Var;
        if (!r0()) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        if (z10 && (vq0Var = this.Q) != null) {
            return vq0Var.getBotPreviewsSubtitle();
        }
        os0 os0Var = this.V;
        if (os0Var == null || os0Var.f28155s == null) {
            i10 = 0;
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
            for (int i12 = 0; i12 < os0Var.f28155s.f13540i.size(); i12++) {
                MessageObject messageObject = (MessageObject) os0Var.f28155s.f13540i.get(i12);
                TL_stories.StoryItem storyItem = messageObject.storyItem;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    if (MessageObject.isVideoDocument(messageMedia.document)) {
                        i11++;
                    } else if (messageObject.storyItem.media.photo != null) {
                        i10++;
                    }
                }
            }
        }
        if (i10 == 0 && i11 == 0) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        StringBuilder sb2 = new StringBuilder();
        if (i10 > 0) {
            sb2.append(LocaleController.formatPluralString("Images", i10, new Object[0]));
        }
        if (i11 > 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(LocaleController.formatPluralString("Videos", i11, new Object[0]));
        }
        return sb2.toString();
    }

    public final zs0 W(int i10) {
        int i11 = 0;
        while (true) {
            zs0[] zs0VarArr = this.f29122g0;
            if (i11 >= zs0VarArr.length) {
                return null;
            }
            zs0 zs0Var = zs0VarArr[i11];
            if (zs0Var != null && zs0Var.B == i10) {
                return zs0Var;
            }
            i11++;
        }
    }

    public final void W0(f2.q0 q0Var) {
        if (q0Var instanceof bu0) {
            ArrayList arrayList = this.A0;
            ArrayList arrayList2 = this.B0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            return;
        }
        if (q0Var == this.I) {
            ArrayList arrayList3 = this.C0;
            ArrayList arrayList4 = this.D0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
            return;
        }
        nt0 nt0Var = this.J;
        if (q0Var == nt0Var) {
            nt0Var.f31033r = null;
        }
    }

    public final int X(int i10, int i11, boolean z10) {
        int i12 = i11 + (!z10 ? 1 : -1);
        if (i12 > 6) {
            i12 = !z10 ? 9 : 6;
        }
        return Utilities.clamp(i12, 9, (this.f29123g1 && i10 == 1) ? 1 : 2);
    }

    public final void X0() {
        int i10;
        int i11 = 0;
        while (true) {
            zs0[] zs0VarArr = this.f29122g0;
            if (i11 >= zs0VarArr.length) {
                return;
            }
            er0 er0Var = zs0VarArr[i11].h;
            if (er0Var != null) {
                int id2 = 0;
                int top = 0;
                for (int i12 = 0; i12 < er0Var.getChildCount(); i12++) {
                    View childAt = er0Var.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.o7) {
                        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt;
                        int messageId = o7Var.getMessageId();
                        top = o7Var.getTop();
                        id2 = messageId;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.f7) {
                        org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) childAt;
                        int id3 = f7Var.getMessage().getId();
                        top = f7Var.getTop();
                        id2 = id3;
                    }
                    if (childAt instanceof org.telegram.ui.Cells.e7) {
                        org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) childAt;
                        id2 = e7Var.getMessage().getId();
                        top = e7Var.getTop();
                    }
                    if (id2 != 0) {
                        break;
                    }
                }
                if (id2 != 0) {
                    int i13 = zs0VarArr[i11].B;
                    int i14 = -1;
                    if (p0(i13)) {
                        eu0 eu0VarK1 = k1(i13);
                        if (eu0VarK1 != null && eu0VarK1.f28155s != null) {
                            for (int i15 = 0; i15 < eu0VarK1.f28155s.f13540i.size(); i15++) {
                                if (id2 == ((MessageObject) eu0VarK1.f28155s.f13540i.get(i15)).getId()) {
                                    i14 = i15;
                                    break;
                                }
                            }
                        }
                        i10 = i14;
                    } else if (i13 >= 0) {
                        wt0[] wt0VarArr = this.f29140p1;
                        if (i13 < wt0VarArr.length) {
                            for (int i16 = 0; i16 < wt0VarArr[i13].f34325a.size(); i16++) {
                                if (id2 == ((MessageObject) wt0VarArr[i13].f34325a.get(i16)).getId()) {
                                    i14 = i16;
                                    break;
                                }
                            }
                            i10 = wt0VarArr[i13].f34335m + i14;
                        }
                    }
                    if (i14 >= 0) {
                        ((f2.k0) er0Var.getLayoutManager()).h1(i10, (-zs0VarArr[i11].h.getPaddingTop()) + top);
                        if (this.f29131k1) {
                            zs0 zs0Var = zs0VarArr[i11];
                            zs0Var.f35341s.h1(i10, (-zs0Var.h.getPaddingTop()) + top);
                        }
                    }
                }
            }
            i11++;
        }
    }

    public final int Y(boolean z10) {
        return this.T1 + (z10 ? AndroidUtilities.dp(52.0f) : 0);
    }

    public final void Y0(int i10) {
        vr0 vr0Var;
        if (this.H1 || (vr0Var = this.E0) == null) {
            return;
        }
        vr0Var.h(null, i10, vr0Var.L.get(i10));
    }

    public final int Z(int i10) {
        int iDp = AndroidUtilities.dp(54.0f) + this.X1;
        ar0 ar0Var = this.S;
        return iDp + ((int) ((ar0Var == null || !(w0(i10) || i10 == 8)) ? 0.0f : ar0Var.getVisibilityFactor() * AndroidUtilities.dp(40.0f))) + (i10 == 9 ? AndroidUtilities.dp(64.0f) : 0);
    }

    public final void Z0(float f10, int i10) {
        vr0 vr0Var = this.E0;
        if (vr0Var != null) {
            vr0Var.j(f10, w0(i10) ? 8 : i10);
        }
        ar0 ar0Var = this.S;
        if (ar0Var != null) {
            o71 o71Var = ar0Var.f44655n;
            if (w0(i10)) {
                o71Var.f(f10, h1(i10));
            } else if (i10 == 8) {
                o71Var.f(f10, 0);
            }
        }
    }

    public final float a0(float f10) {
        int i10;
        int i11;
        int i12;
        int i13;
        float f11 = 0.0f;
        if (q0()) {
            return 0.0f;
        }
        zs0[] zs0VarArr = this.f29122g0;
        zs0 zs0Var = zs0VarArr[1];
        wq0 wq0Var = this.R;
        if (zs0Var != null && ((i12 = zs0Var.B) == 0 || (((i12 == 8 || w0(i12)) && TextUtils.isEmpty(getStoriesHashtag())) || (i13 = zs0VarArr[1].B) == 9 || i13 == 11 || i13 == 13 || (i13 == 14 && wq0Var != null)))) {
            f11 = 0.0f + f10;
        }
        zs0 zs0Var2 = zs0VarArr[0];
        return (zs0Var2 == null || !((i10 = zs0Var2.B) == 0 || (((i10 == 8 || w0(i10)) && TextUtils.isEmpty(getStoriesHashtag())) || (i11 = zs0VarArr[0].B) == 9 || i11 == 11 || i11 == 13 || (i11 == 14 && wq0Var != null)))) ? f11 : (1.0f - f10) + f11;
    }

    public final void a1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i10 = 0;
        while (true) {
            zs0[] zs0VarArr = this.f29122g0;
            if (i10 >= zs0VarArr.length) {
                if (this.B == 0) {
                    qs0 qs0Var = this.T;
                    qs0Var.d = chatFull;
                    qs0Var.f31970e = arrayList;
                }
                v1(true);
                for (int i11 = 0; i11 < zs0VarArr.length; i11++) {
                    zs0 zs0Var = zs0VarArr[i11];
                    if (zs0Var.B == 7 && zs0Var.h.getAdapter() != null) {
                        AndroidUtilities.notifyDataSetChanged(zs0VarArr[i11].h);
                    }
                }
                return;
            }
            zs0 zs0Var2 = zs0VarArr[i10];
            if (zs0Var2.B == 7 && zs0Var2.h.getAdapter() != null && zs0VarArr[i10].h.getAdapter().h() != 0 && this.f29145r1.getMessagesController().getStoriesController().f13962j.size() > 0) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override
    public final boolean b() {
        return false;
    }

    public final float b0(float f10) {
        float f11 = 0.0f;
        if (q0()) {
            return 0.0f;
        }
        zs0[] zs0VarArr = this.f29122g0;
        zs0 zs0Var = zs0VarArr[1];
        if (zs0Var != null && s0(zs0Var.B) && zs0VarArr[1].B != 11) {
            f11 = 0.0f + f10;
        }
        zs0 zs0Var2 = zs0VarArr[0];
        return (zs0Var2 == null || !s0(zs0Var2.B) || zs0VarArr[0].B == 11) ? f11 : (1.0f - f10) + f11;
    }

    public void b1(boolean z10) {
        if (this.f29163y1 == z10) {
            return;
        }
        this.f29163y1 = z10;
        AnimatorSet animatorSet = this.J1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        x9 x9Var = this.f29159x0;
        if (z10) {
            x9Var.setVisibility(0);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.J1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(x9Var, (Property<x9, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.J1.setDuration(180L);
        this.J1.addListener(new org.telegram.ui.go(20, this, z10));
        this.J1.start();
        if (z10) {
            u1();
        }
    }

    public final int c0(int i10) {
        eu0 eu0VarK1;
        jh.j6 j6Var;
        if (!p0(i10) || (eu0VarK1 = k1(i10)) == null || (j6Var = eu0VarK1.f28155s) == null) {
            return 0;
        }
        return j6Var.g();
    }

    public final void c1(int i10, boolean z10) {
        int i11;
        zs0 zs0VarW;
        if (z10 && getY() != 0.0f && this.A == 1) {
            return;
        }
        if (z10 && p0(i10) && c0(i10) <= 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.f29121f1);
        bundle.putLong("topic_id", this.B);
        wt0[] wt0VarArr = this.f29140p1;
        if (!z10 || (zs0VarW = W(0)) == null) {
            i11 = 0;
        } else {
            ArrayList arrayList = wt0VarArr[0].f34328e;
            int iL0 = zs0VarW.f35343x.L0();
            if (iL0 >= 0) {
                et0 et0Var = null;
                if (arrayList != null) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        if (iL0 <= ((et0) arrayList.get(i12)).f28150b) {
                            et0Var = (et0) arrayList.get(i12);
                            break;
                        }
                    }
                    if (et0Var == null) {
                        et0Var = (et0) i0.a.i(1, arrayList);
                    }
                }
                if (et0Var != null) {
                    i11 = et0Var.f28151c;
                } else {
                    i11 = 0;
                }
            } else {
                i11 = 0;
            }
        }
        if (i10 == 9) {
            bundle.putInt("type", 3);
        } else if (i10 == 8) {
            bundle.putInt("type", 2);
        } else {
            bundle.putInt("type", 1);
        }
        org.telegram.ui.h8 h8Var = new org.telegram.ui.h8(wt0VarArr[0].f34339q, i11, bundle);
        h8Var.I = new o0.b(this, 10);
        this.f29145r1.presentFragment(h8Var);
    }

    public final void d1(int i10) {
        int iH1 = h1(getClosestTab());
        ar0 ar0Var = this.S;
        if (iH1 != i10) {
            if (ar0Var != null) {
                ar0Var.f44655n.d(i10, ar0Var.f44657s.i(i10));
                return;
            }
            return;
        }
        ar0Var.setReorderingAlbums(true);
        gu0 gu0VarI1 = i1(i10);
        zs0 zs0VarW = W(gu0VarI1.f28825a);
        if (zs0VarW == null) {
            return;
        }
        er0 er0Var = zs0VarW.h;
        for (int i11 = 0; i11 < er0Var.getChildCount(); i11++) {
            View childAt = er0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.o7) {
                ((org.telegram.ui.Cells.o7) childAt).l(true, true);
            }
        }
        fu0 fu0Var = gu0VarI1.f28827c;
        if (fu0Var != null && !fu0Var.f28157x) {
            fu0Var.f28157x = true;
        }
        q1(true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        er0 er0Var;
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        TL_stories.StoryViews storyViews;
        int i12;
        f2.q0 q0Var;
        int i13;
        boolean z10;
        int i14;
        ArrayList arrayList;
        int size;
        int i15;
        int i16;
        boolean z11;
        ls0 ls0Var;
        int i17;
        er0 er0Var2;
        int i18;
        int iH;
        er0 er0Var3;
        int i19 = NotificationCenter.mediaDidLoad;
        f2.q0 q0Var2 = this.K;
        ut0 ut0Var = this.I;
        vt0 vt0Var = this.F;
        ut0 ut0Var2 = this.H;
        ut0 ut0Var3 = this.G;
        org.telegram.ui.ActionBar.n2 n2Var = this.f29145r1;
        nt0 nt0Var = this.J;
        ls0 ls0Var2 = this.D;
        long j10 = this.f29121f1;
        zs0[] zs0VarArr = this.f29122g0;
        wt0[] wt0VarArr = this.f29140p1;
        if (i10 == i19) {
            long jLongValue = ((Long) objArr[0]).longValue();
            int iIntValue = ((Integer) objArr[3]).intValue();
            int iIntValue2 = ((Integer) objArr[7]).intValue();
            int iIntValue3 = ((Integer) objArr[4]).intValue();
            boolean zBooleanValue = ((Boolean) objArr[6]).booleanValue();
            if (iIntValue3 == 6 || iIntValue3 == 7) {
                iIntValue3 = 0;
            }
            if (iIntValue != n2Var.getClassGuid() || iIntValue2 != wt0VarArr[iIntValue3].f34338p) {
                if (this.f29142q1 == null || !wt0VarArr[iIntValue3].f34325a.isEmpty() || wt0VarArr[iIntValue3].f34337o || !R(iIntValue3)) {
                    return;
                }
                if (iIntValue3 == 0) {
                    q0Var2 = ls0Var2;
                } else if (iIntValue3 == 1) {
                    q0Var2 = ut0Var3;
                } else if (iIntValue3 == 2) {
                    q0Var2 = ut0Var2;
                } else if (iIntValue3 == 3) {
                    q0Var2 = vt0Var;
                } else if (iIntValue3 == 4) {
                    q0Var2 = ut0Var;
                } else if (iIntValue3 != 5) {
                    q0Var2 = iIntValue3 == 15 ? nt0Var : null;
                }
                if (q0Var2 != null) {
                    for (int i20 = 0; i20 < zs0VarArr.length; i20++) {
                        zs0 zs0Var = zs0VarArr[i20];
                        if (zs0Var != null && (er0Var2 = zs0Var.h) != null && er0Var2.getAdapter() == q0Var2) {
                            zs0VarArr[i20].h.B0();
                        }
                    }
                    q0Var2.l();
                }
                this.X0 = true;
                return;
            }
            ArrayList arrayList2 = (ArrayList) objArr[2];
            boolean zIsEncryptedDialog = DialogObject.isEncryptedDialog(j10);
            int i21 = jLongValue == j10 ? 0 : 1;
            if (iIntValue3 != 0 && iIntValue3 != 1 && iIntValue3 != 2 && iIntValue3 != 4) {
                wt0VarArr[iIntValue3].f34329f[i21] = ((Integer) objArr[1]).intValue();
            }
            if (iIntValue3 == 0) {
                i18 = iIntValue3;
                q0Var2 = ls0Var2;
            } else if (iIntValue3 == 1) {
                i18 = iIntValue3;
                q0Var2 = ut0Var3;
            } else if (iIntValue3 == 2) {
                i18 = iIntValue3;
                q0Var2 = ut0Var2;
            } else if (iIntValue3 == 3) {
                i18 = iIntValue3;
                q0Var2 = vt0Var;
            } else if (iIntValue3 == 4) {
                i18 = iIntValue3;
                q0Var2 = ut0Var;
            } else if (iIntValue3 == 5) {
                i18 = iIntValue3;
            } else if (iIntValue3 == 15) {
                q0Var2 = nt0Var;
                i18 = 8;
            } else {
                i18 = iIntValue3;
                q0Var2 = null;
            }
            int size2 = wt0VarArr[i18].f34325a.size();
            if (q0Var2 != null) {
                iH = q0Var2.h();
                if (q0Var2 instanceof vk0) {
                    ((vk0) q0Var2).L();
                }
            } else {
                iH = 0;
            }
            wt0VarArr[i18].f34330g = false;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            if (zBooleanValue) {
                ?? r13 = 1;
                int size3 = arrayList2.size() - 1;
                while (size3 >= 0) {
                    MessageObject messageObject2 = (MessageObject) arrayList2.get(size3);
                    if (wt0VarArr[i18].a(messageObject2, i21, r13, zIsEncryptedDialog)) {
                        sparseBooleanArray.put(messageObject2.getId(), r13);
                        wt0 wt0Var = wt0VarArr[i18];
                        int i22 = wt0Var.f34335m - r13;
                        wt0Var.f34335m = i22;
                        if (i22 < 0) {
                            wt0Var.f34335m = 0;
                        }
                    }
                    size3--;
                    r13 = 1;
                }
                wt0VarArr[i18].f34334l = ((Boolean) objArr[5]).booleanValue();
                wt0 wt0Var2 = wt0VarArr[i18];
                if (wt0Var2.f34334l) {
                    wt0Var2.f34335m = 0;
                }
            } else {
                for (int i23 = 0; i23 < arrayList2.size(); i23++) {
                    MessageObject messageObject3 = (MessageObject) arrayList2.get(i23);
                    if (wt0VarArr[i18].a(messageObject3, i21, false, zIsEncryptedDialog)) {
                        sparseBooleanArray.put(messageObject3.getId(), true);
                        wt0 wt0Var3 = wt0VarArr[i18];
                        int i24 = wt0Var3.f34336n - 1;
                        wt0Var3.f34336n = i24;
                        if (i24 < 0) {
                            wt0Var3.f34336n = 0;
                        }
                    }
                }
                wt0 wt0Var4 = wt0VarArr[i18];
                if (wt0Var4.f34337o && wt0Var4.f34325a.size() > 0) {
                    wt0 wt0Var5 = wt0VarArr[i18];
                    wt0Var5.f34333k = ((MessageObject) wt0Var5.f34325a.get(0)).getId();
                }
                wt0VarArr[i18].f34331i[i21] = ((Boolean) objArr[5]).booleanValue();
                wt0 wt0Var6 = wt0VarArr[i18];
                if (wt0Var6.f34331i[i21]) {
                    int size4 = wt0Var6.f34326b[i21].size();
                    if (i21 == 0) {
                        size4 += wt0VarArr[i18].f34335m;
                    }
                    wt0VarArr[i18].f34329f[i21] = size4;
                }
            }
            if (!zBooleanValue && i21 == 0) {
                wt0 wt0Var7 = wt0VarArr[i18];
                if (wt0Var7.f34331i[i21] && this.Y0 != 0) {
                    wt0Var7.f34330g = true;
                    n2Var.getMediaDataController().loadMedia(this.Y0, 50, wt0VarArr[i18].f34332j[1], 0, i18, this.B, 1, n2Var.getClassGuid(), wt0VarArr[i18].f34338p, null, null);
                }
            }
            int i25 = i18;
            if (q0Var2 != null) {
                ys0 ys0Var = null;
                for (int i26 = 0; i26 < zs0VarArr.length; i26++) {
                    zs0 zs0Var2 = zs0VarArr[i26];
                    if (zs0Var2 != null && (er0Var3 = zs0Var2.h) != null && er0Var3.getAdapter() == q0Var2) {
                        ys0 ys0Var2 = zs0VarArr[i26].h;
                        ys0Var2.B0();
                        ys0Var = ys0Var2;
                    }
                }
                int iH2 = q0Var2.h();
                if (q0Var2 != ls0Var2) {
                    try {
                        q0Var2.l();
                    } catch (Throwable unused) {
                    }
                } else if (ls0Var2.h() == iH) {
                    AndroidUtilities.updateVisibleRows(ys0Var);
                } else {
                    ls0Var2.l();
                }
                if (!wt0VarArr[i25].f34325a.isEmpty() || wt0VarArr[i25].f34330g) {
                    if (ys0Var != null && (q0Var2 == ls0Var2 || iH2 >= iH)) {
                        z(ys0Var, iH, sparseBooleanArray);
                    }
                } else if (ys0Var != null) {
                    z(ys0Var, iH, sparseBooleanArray);
                }
                if (ys0Var != null && !wt0VarArr[i25].f34337o) {
                    if (size2 == 0) {
                        for (int i27 = 0; i27 < 2; i27++) {
                            if (zs0VarArr[i27].B == 0) {
                                ((f2.k0) ys0Var.getLayoutManager()).h1(ls0Var2.L(0), 0);
                            }
                        }
                    } else {
                        X0();
                    }
                }
            }
            wt0 wt0Var8 = wt0VarArr[i25];
            if (wt0Var8.f34337o) {
                if (wt0Var8.f34325a.size() == 0) {
                    A0(i25);
                } else {
                    wt0VarArr[i25].f34337o = false;
                }
            }
            this.X0 = true;
            return;
        }
        if (i10 == NotificationCenter.messagesDeleted) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            TLRPC.Chat chat = DialogObject.isChatDialog(j10) ? n2Var.getMessagesController().getChat(Long.valueOf(-j10)) : null;
            long jLongValue2 = ((Long) objArr[1]).longValue();
            if (ChatObject.isChannel(chat)) {
                if (jLongValue2 == 0 && this.Y0 != 0) {
                    i14 = 1;
                } else if (jLongValue2 != chat.f22380id) {
                    return;
                }
                arrayList = (ArrayList) objArr[0];
                size = arrayList.size();
                i15 = -1;
                i16 = 0;
                z11 = false;
                while (i16 < size) {
                    ls0 ls0Var3 = ls0Var2;
                    i17 = 0;
                    while (i17 < wt0VarArr.length) {
                        ArrayList arrayList3 = arrayList;
                        if (wt0VarArr[i17].b(((Integer) arrayList.get(i16)).intValue(), i14) != null) {
                            i15 = i17;
                            z11 = true;
                        }
                        i17++;
                        arrayList = arrayList3;
                    }
                    i16++;
                    ls0Var2 = ls0Var3;
                }
                ls0Var = ls0Var2;
                if (z11) {
                    this.X0 = true;
                    if (ls0Var != null) {
                        ls0Var.l();
                    }
                    if (ut0Var3 != null) {
                        ut0Var3.l();
                    }
                    if (ut0Var2 != null) {
                        ut0Var2.l();
                    }
                    if (vt0Var != null) {
                        vt0Var.X(false);
                    }
                    if (ut0Var != null) {
                        ut0Var.l();
                    }
                    if (nt0Var != null) {
                        nt0Var.l();
                    }
                    if (q0Var2 != null) {
                        q0Var2.l();
                    }
                    if (i15 != 0 || i15 == 1 || i15 == 2 || i15 == 4) {
                        z0(true);
                    }
                }
                W(i15);
                return;
            }
            if (jLongValue2 != 0) {
                return;
            }
            i14 = 0;
            arrayList = (ArrayList) objArr[0];
            size = arrayList.size();
            i15 = -1;
            i16 = 0;
            z11 = false;
            while (i16 < size) {
                ls0 ls0Var4 = ls0Var2;
                i17 = 0;
                while (i17 < wt0VarArr.length) {
                    ArrayList arrayList4 = arrayList;
                    if (wt0VarArr[i17].b(((Integer) arrayList.get(i16)).intValue(), i14) != null) {
                        i15 = i17;
                        z11 = true;
                    }
                    i17++;
                    arrayList = arrayList4;
                }
                i16++;
                ls0Var2 = ls0Var4;
            }
            ls0Var = ls0Var2;
            if (z11) {
                this.X0 = true;
                if (ls0Var != null) {
                    ls0Var.l();
                }
                if (ut0Var3 != null) {
                    ut0Var3.l();
                }
                if (ut0Var2 != null) {
                    ut0Var2.l();
                }
                if (vt0Var != null) {
                    vt0Var.X(false);
                }
                if (ut0Var != null) {
                    ut0Var.l();
                }
                if (nt0Var != null) {
                    nt0Var.l();
                }
                if (q0Var2 != null) {
                    q0Var2.l();
                }
                if (i15 != 0) {
                    z0(true);
                } else {
                    z0(true);
                }
            }
            W(i15);
            return;
        }
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == j10) {
                ArrayList arrayList5 = (ArrayList) objArr[1];
                boolean zIsEncryptedDialog2 = DialogObject.isEncryptedDialog(j10);
                int i28 = 0;
                boolean z12 = false;
                while (i28 < arrayList5.size()) {
                    MessageObject messageObject4 = (MessageObject) arrayList5.get(i28);
                    ArrayList arrayList6 = arrayList5;
                    if (MessageObject.getMedia(messageObject4.messageOwner) == null || messageObject4.needDrawBluredPreview()) {
                        i13 = i28;
                    } else {
                        int mediaType = MediaDataController.getMediaType(messageObject4.messageOwner);
                        i13 = i28;
                        if (mediaType == -1) {
                            return;
                        }
                        wt0 wt0Var9 = wt0VarArr[mediaType];
                        if (wt0Var9.f34334l) {
                            if (wt0Var9.a(messageObject4, messageObject4.getDialogId() == j10 ? 0 : 1, true, zIsEncryptedDialog2)) {
                                this.T0[mediaType] = 1;
                                z10 = true;
                            }
                            i28 = i13 + 1;
                            z12 = z10;
                            arrayList5 = arrayList6;
                        }
                        z10 = z12;
                        i28 = i13 + 1;
                        z12 = z10;
                        arrayList5 = arrayList6;
                    }
                    z10 = z12;
                    i28 = i13 + 1;
                    z12 = z10;
                    arrayList5 = arrayList6;
                }
                boolean z13 = z12;
                int i29 = 1;
                if (z13) {
                    this.X0 = true;
                    int i30 = 0;
                    while (i30 < zs0VarArr.length) {
                        int i31 = zs0VarArr[i30].B;
                        if (i31 == 0) {
                            q0Var = ls0Var2;
                        } else if (i31 == i29) {
                            q0Var = ut0Var3;
                        } else if (i31 == 2) {
                            q0Var = ut0Var2;
                        } else {
                            if (i31 == 3) {
                                q0Var = vt0Var;
                            } else if (i31 == 4) {
                                q0Var = ut0Var;
                            } else if (i31 == 5) {
                                q0Var = q0Var2;
                            } else {
                                q0Var = i31 == 15 ? nt0Var : null;
                            }
                            if (q0Var != null) {
                                q0Var.h();
                                ls0Var2.l();
                                ut0Var3.l();
                                ut0Var2.l();
                                vt0Var.X(false);
                                ut0Var.l();
                                nt0Var.l();
                                q0Var2.l();
                            }
                            i30++;
                            i29 = 1;
                        }
                        if (q0Var != null) {
                            q0Var.h();
                            ls0Var2.l();
                            ut0Var3.l();
                            ut0Var2.l();
                            vt0Var.X(false);
                            ut0Var.l();
                            nt0Var.l();
                            q0Var2.l();
                        }
                        i30++;
                        i29 = 1;
                    }
                    v1(true);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messageReceivedByServer) {
            if (((Boolean) objArr[6]).booleanValue()) {
                return;
            }
            Integer num = (Integer) objArr[0];
            Integer num2 = (Integer) objArr[1];
            Long l10 = (Long) objArr[3];
            if (l10.longValue() == j10 || l10.longValue() == this.Y0) {
                int i32 = l10.longValue() == j10 ? 0 : 1;
                for (wt0 wt0Var10 : wt0VarArr) {
                    wt0Var10.f(i32, num.intValue(), num2.intValue());
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidStart || i10 == NotificationCenter.messagePlayingPlayStateChanged || i10 == NotificationCenter.messagePlayingDidReset) {
            if (i10 != NotificationCenter.messagePlayingDidReset && i10 != NotificationCenter.messagePlayingPlayStateChanged) {
                if (((MessageObject) objArr[0]).eventId != 0) {
                    return;
                }
                for (int i33 = 0; i33 < zs0VarArr.length; i33++) {
                    int childCount = zs0VarArr[i33].h.getChildCount();
                    for (int i34 = 0; i34 < childCount; i34++) {
                        View childAt = zs0VarArr[i33].h.getChildAt(i34);
                        if (childAt instanceof org.telegram.ui.Cells.e7) {
                            org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) childAt;
                            if (e7Var.getMessage() != null) {
                                e7Var.g(false, true);
                            }
                        }
                    }
                }
                return;
            }
            for (int i35 = 0; i35 < zs0VarArr.length; i35++) {
                zs0 zs0Var3 = zs0VarArr[i35];
                if (zs0Var3 != null && (er0Var = zs0Var3.h) != null) {
                    int childCount2 = er0Var.getChildCount();
                    for (int i36 = 0; i36 < childCount2; i36++) {
                        View childAt2 = zs0VarArr[i35].h.getChildAt(i36);
                        if (childAt2 instanceof org.telegram.ui.Cells.e7) {
                            org.telegram.ui.Cells.e7 e7Var2 = (org.telegram.ui.Cells.e7) childAt2;
                            if (e7Var2.getMessage() != null) {
                                e7Var2.g(false, true);
                            }
                        }
                    }
                }
            }
            return;
        }
        if (i10 == NotificationCenter.storiesListUpdated) {
            jh.j6 j6Var = (jh.j6) objArr[0];
            os0 os0Var = this.V;
            if (os0Var == null || j6Var != os0Var.f28155s) {
                uq0 uq0Var = this.f29106a0;
                if (uq0Var == null || j6Var != uq0Var.f28155s) {
                    Iterator it = this.U1.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i12 = -1;
                            break;
                        }
                        gu0 gu0Var = (gu0) it.next();
                        if (gu0Var.f28827c.f28155s == j6Var) {
                            i12 = gu0Var.f28825a;
                            break;
                        }
                    }
                } else {
                    i12 = 9;
                }
            } else {
                i12 = 8;
            }
            zs0 zs0VarW = W(i12);
            if (zs0VarW != null) {
                if (zs0VarW.f35335b != (j6Var.g() > 0)) {
                    zs0VarW.f35335b = j6Var.g() > 0;
                    o1(zs0VarW, true);
                }
            }
            if (zs0VarW != null) {
                AndroidUtilities.notifyDataSetChanged(zs0VarW.h);
                if (zs0VarW.h.getLayoutManager() instanceof f2.k0) {
                    zk0 zk0Var = zs0VarW.h;
                    G(zs0VarW, zk0Var, (f2.k0) zk0Var.getLayoutManager());
                }
            }
            ss0 ss0Var = this.f29165z1;
            if (ss0Var != null) {
                ss0Var.R();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.storiesUpdated) {
            for (zs0 zs0Var4 : zs0VarArr) {
                if (zs0Var4 != null && zs0Var4.h != null && p0(zs0Var4.B)) {
                    if (!r0() || zs0Var4.h.getAdapter() == null) {
                        for (int i37 = 0; i37 < zs0Var4.h.getChildCount(); i37++) {
                            View childAt3 = zs0Var4.h.getChildAt(i37);
                            if (childAt3 instanceof org.telegram.ui.Cells.o7) {
                                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt3;
                                i6 i6Var = o7Var.J;
                                if (!o7Var.W || (messageObject = o7Var.f24799n) == null || (storyItem = messageObject.storyItem) == null || (storyViews = storyItem.views) == null) {
                                    o7Var.H = false;
                                    i6Var.q("", false, true);
                                } else {
                                    int i38 = storyViews.views_count;
                                    o7Var.H = i38 > 0;
                                    i6Var.q(AndroidUtilities.formatWholeNumber(i38, 0), true, true);
                                }
                            }
                        }
                    } else {
                        AndroidUtilities.notifyDataSetChanged(zs0Var4.h);
                    }
                }
            }
            return;
        }
        if (i10 == NotificationCenter.channelRecommendationsLoaded) {
            if (((Long) objArr[0]).longValue() == j10) {
                this.M.E(true);
                v1(true);
                F();
                return;
            }
            return;
        }
        int i39 = NotificationCenter.savedMessagesDialogsUpdate;
        qt0 qt0Var = this.N;
        if (i10 == i39) {
            if (j10 == 0 || j10 == n2Var.getUserConfig().getClientUserId()) {
                qt0Var.F(true);
                v1(true);
                F();
                L0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.dialogsNeedReload) {
            qt0Var.F(true);
            return;
        }
        if (i10 == NotificationCenter.starUserGiftsLoaded) {
            if (((Long) objArr[0]).longValue() == j10) {
                v1(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updatedChatRanks) {
            long jLongValue3 = ((Long) objArr[0]).longValue();
            long jLongValue4 = ((Long) objArr[1]).longValue();
            if (j10 != (-jLongValue3)) {
                return;
            }
            String str = (String) objArr[2];
            qs0 qs0Var = this.T;
            if (qs0Var != null) {
                TLRPC.ChatFull chatFull = qs0Var.d;
                if (chatFull != null && chatFull.participants != null) {
                    for (int i40 = 0; i40 < qs0Var.d.participants.participants.size(); i40++) {
                        qs0Var.d.participants.participants.get(i40).setRank(jLongValue4, str);
                    }
                }
                for (zs0 zs0Var5 : zs0VarArr) {
                    if (zs0Var5.B == 7) {
                        AndroidUtilities.updateVisibleRows(zs0Var5.h);
                    }
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.didUpdatePollResults) {
            long jLongValue5 = ((Long) objArr[0]).longValue();
            TLRPC.TL_poll tL_poll = (TLRPC.TL_poll) objArr[1];
            TLRPC.PollResults pollResults = (TLRPC.PollResults) objArr[2];
            for (int i41 = 0; i41 < zs0VarArr.length; i41++) {
                if (zs0VarArr[i41].h.getAdapter() == nt0Var) {
                    er0 er0Var4 = zs0VarArr[i41].h;
                    ArrayList arrayList7 = nt0Var.f31032n;
                    for (int i42 = 0; i42 < arrayList7.size(); i42++) {
                        MessageObject messageObject5 = (MessageObject) arrayList7.get(i42);
                        if (messageObject5 != null && messageObject5.getPollId() == jLongValue5) {
                            TLRPC.MessageMedia messageMedia = messageObject5.messageOwner.media;
                            if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                                if (tL_poll != null) {
                                    tL_messageMediaPoll.poll = tL_poll;
                                }
                                MessageObject.updatePollResults(tL_messageMediaPoll, pollResults);
                                nt0Var.m(i42);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        vr0 vr0Var = this.E0;
        if (vr0Var != null) {
            canvas.save();
            canvas.translate(vr0Var.getX(), vr0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        rr0 rr0Var = this.N0;
        if (rr0Var != null) {
            int i10 = rr0Var.P;
            if ((i10 == 3 || i10 == 1) && this.L0 == null) {
                canvas.save();
                canvas.translate(rr0Var.getX(), rr0Var.getY());
                rr0Var.setDrawOverlay(true);
                rr0Var.draw(canvas);
                rr0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i10;
        if (view != this.N0 || this.L0 != null) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        zs0[] zs0VarArr = this.f29122g0;
        float top = zs0VarArr[0].getTop();
        ar0 ar0Var = this.S;
        if (ar0Var != null && ((i10 = zs0VarArr[0].B) == 8 || w0(i10))) {
            top -= ar0Var.getVisualHeight();
        }
        canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + AndroidUtilities.dp(12.0f));
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return zDrawChild;
    }

    @Override
    public final void e(org.telegram.ui.Cells.p2 p2Var) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f29145r1;
        if (n2Var != null && n2Var.getMessagesController().getStoriesController().I(p2Var.getDialogId())) {
            n2Var.getOrCreateStoryViewer().getClass();
            jh.i9 orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
            Context context = n2Var.getContext();
            long dialogId = p2Var.getDialogId();
            jh.b7 b7VarA = jh.b7.a((zk0) p2Var.getParent());
            b7VarA.f13125s += ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).f36022o1) ? AndroidUtilities.dp(68.0f) : 0;
            orCreateStoryViewer.D(context, dialogId, b7VarA);
        }
    }

    public final void e1(boolean z10) {
        zs0[] zs0VarArr;
        zs0 zs0Var;
        if (this.f29131k1) {
            return;
        }
        int i10 = 0;
        while (true) {
            zs0VarArr = this.f29122g0;
            if (i10 >= zs0VarArr.length) {
                zs0Var = null;
                break;
            }
            int i11 = zs0VarArr[i10].B;
            if (i11 == 0 || p0(i11)) {
                zs0Var = zs0VarArr[i10];
                break;
            }
            i10++;
        }
        if (zs0Var != null) {
            int i12 = zs0Var.B;
            this.l1 = i12;
            boolean zP0 = p0(i12);
            int[] iArr = this.f29127i1;
            int iX = X(zP0 ? 1 : 0, iArr[zP0 ? 1 : 0], z10);
            this.f29133m1 = iX;
            if (iX != iArr[zP0 ? 1 : 0]) {
                if (this.f29123g1 && p0(this.l1)) {
                    return;
                }
                zs0Var.f35340r.setVisibility(0);
                if (p0(this.l1)) {
                    zs0Var.f35340r.setAdapter(l1(this.l1));
                } else {
                    zs0Var.f35340r.setAdapter(this.E);
                }
                ys0 ys0Var = zs0Var.f35340r;
                ys0Var.setPadding(ys0Var.getPaddingLeft(), Z(this.l1), zs0Var.f35340r.getPaddingRight(), Y(v0()));
                zs0Var.f35341s.y1(iX);
                zs0Var.f35340r.a0();
                zs0Var.f35341s.O = new tr0(this, zs0Var, 0);
                AndroidUtilities.updateVisibleRows(zs0Var.h);
                this.f29131k1 = true;
                if (this.l1 == 0) {
                    this.f29140p1[0].g(true);
                }
                this.f29129j1 = 0.0f;
                if (this.f29146s < 0) {
                    X0();
                    return;
                }
                for (zs0 zs0Var2 : zs0VarArr) {
                    if (zs0Var2.B == this.l1) {
                        zs0Var2.f35341s.h1(this.f29146s, this.v - zs0Var2.f35340r.getPaddingTop());
                    }
                }
            }
        }
    }

    public final float f0(int i10, boolean z10) {
        float width = getWidth();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            zs0[] zs0VarArr = this.f29122g0;
            if (i11 >= zs0VarArr.length) {
                break;
            }
            zs0 zs0Var = zs0VarArr[i11];
            if (zs0Var != null) {
                int i13 = zs0Var.B;
                if ((z10 && i10 == 8 && w0(i13)) || i13 == i10) {
                    i12++;
                    width = zs0VarArr[i11].getTranslationX();
                }
            }
            i11++;
        }
        if (i12 == 2) {
            return 0.0f;
        }
        return width;
    }

    public final void f1() {
        int i10 = 0;
        while (true) {
            zs0[] zs0VarArr = this.f29122g0;
            if (i10 >= zs0VarArr.length) {
                return;
            }
            int childCount = zs0VarArr[i10].h.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = zs0VarArr[i10].h.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.d2) {
                    ImageReceiver photoImage = ((org.telegram.ui.Cells.d2) childAt).getPhotoImage();
                    if (i10 == 0) {
                        photoImage.setAllowStartAnimation(true);
                        photoImage.startAnimation();
                    } else {
                        photoImage.setAllowStartAnimation(false);
                        photoImage.stopAnimation();
                    }
                }
            }
            i10++;
        }
    }

    public final float g0(int i10, boolean z10) {
        float fAbs = 0.0f;
        int i11 = 0;
        while (true) {
            zs0[] zs0VarArr = this.f29122g0;
            if (i11 >= zs0VarArr.length) {
                return fAbs;
            }
            zs0 zs0Var = zs0VarArr[i11];
            if (zs0Var != null) {
                int i12 = zs0Var.B;
                if ((z10 && i10 == 8 && w0(i12)) || i12 == i10) {
                    fAbs = (1.0f - Math.abs(zs0VarArr[i11].getTranslationX() / getWidth())) + fAbs;
                }
            }
            i11++;
        }
    }

    public final void g1(MotionEvent motionEvent) {
        float xVelocity;
        float yVelocity;
        float measuredWidth;
        VelocityTracker velocityTracker = this.f29160x1;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.computeCurrentVelocity(1000, this.O0);
        int i10 = 1;
        if (motionEvent == null || motionEvent.getAction() == 3) {
            xVelocity = 0.0f;
            yVelocity = 0.0f;
        } else {
            xVelocity = this.f29160x1.getXVelocity();
            yVelocity = this.f29160x1.getYVelocity();
            if (!this.f29150t1 && Math.abs(xVelocity) >= 3000.0f && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                U0(motionEvent, xVelocity < 0.0f);
            }
        }
        if (this.f29150t1) {
            zs0[] zs0VarArr = this.f29122g0;
            float x8 = zs0VarArr[0].getX();
            this.f29110b1 = new AnimatorSet();
            this.f29118e1 = Math.abs(x8) < ((float) zs0VarArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(xVelocity) < 3500.0f || Math.abs(xVelocity) < Math.abs(yVelocity));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new v60(this, 19));
            boolean z10 = this.f29118e1;
            Property property = View.TRANSLATION_X;
            if (z10) {
                measuredWidth = Math.abs(x8);
                if (this.f29115d1) {
                    AnimatorSet animatorSet = this.f29110b1;
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(zs0VarArr[0], (Property<zs0, Float>) property, 0.0f);
                    zs0 zs0Var = zs0VarArr[1];
                    animatorSet.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(zs0Var, (Property<zs0, Float>) property, zs0Var.getMeasuredWidth()), valueAnimatorOfFloat);
                } else {
                    AnimatorSet animatorSet2 = this.f29110b1;
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(zs0VarArr[0], (Property<zs0, Float>) property, 0.0f);
                    zs0 zs0Var2 = zs0VarArr[1];
                    animatorSet2.playTogether(objectAnimatorOfFloat2, ObjectAnimator.ofFloat(zs0Var2, (Property<zs0, Float>) property, -zs0Var2.getMeasuredWidth()), valueAnimatorOfFloat);
                }
            } else {
                measuredWidth = zs0VarArr[0].getMeasuredWidth() - Math.abs(x8);
                if (this.f29115d1) {
                    AnimatorSet animatorSet3 = this.f29110b1;
                    zs0 zs0Var3 = zs0VarArr[0];
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(zs0Var3, (Property<zs0, Float>) property, -zs0Var3.getMeasuredWidth()), ObjectAnimator.ofFloat(zs0VarArr[1], (Property<zs0, Float>) property, 0.0f), valueAnimatorOfFloat);
                } else {
                    AnimatorSet animatorSet4 = this.f29110b1;
                    zs0 zs0Var4 = zs0VarArr[0];
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(zs0Var4, (Property<zs0, Float>) property, zs0Var4.getMeasuredWidth()), ObjectAnimator.ofFloat(zs0VarArr[1], (Property<zs0, Float>) property, 0.0f), valueAnimatorOfFloat);
                }
            }
            this.f29110b1.setInterpolator(a2);
            int measuredWidth2 = getMeasuredWidth();
            float f10 = measuredWidth2 / 2;
            float fDistanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f10) + f10;
            float fAbs = Math.abs(xVelocity);
            this.f29110b1.setDuration(Math.max(150, Math.min(fAbs > 0.0f ? Math.round(Math.abs(fDistanceInfluenceForSnapDuration / fAbs) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.f29110b1.addListener(new yr0(this, i10));
            this.f29110b1.start();
            this.f29113c1 = true;
            this.f29150t1 = false;
            L0();
        } else {
            this.f29152u1 = false;
            this.C.setEnabled(true);
            this.E0.setEnabled(true);
        }
        VelocityTracker velocityTracker2 = this.f29160x1;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.f29160x1 = null;
        }
    }

    public SparseArray<MessageObject> getActionModeSelected() {
        return this.V0[0];
    }

    public float getBottomButtonStoriesVisibility() {
        zs0 zs0Var;
        zs0 zs0Var2;
        jh.j6 j6Var;
        jh.j6 j6Var2;
        float f10 = 1.0f;
        zs0[] zs0VarArr = this.f29122g0;
        if (zs0VarArr == null || (zs0Var = zs0VarArr[0]) == null || (zs0Var2 = zs0VarArr[1]) == null || zs0Var.f35342w == null || zs0Var2.f35342w == null) {
            return 1.0f;
        }
        int i10 = zs0Var.B;
        int i11 = zs0Var2.B;
        boolean z10 = w0(i10) || i10 == 8;
        boolean z11 = w0(i11) || i11 == 8;
        if (!z10 && !z11) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - zs0VarArr[0].f35342w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - zs0VarArr[1].f35342w.getVisibilityFactor();
        eu0 eu0VarK1 = k1(zs0VarArr[0].B);
        if (i10 == 8 || (eu0VarK1 != null && (j6Var2 = eu0VarK1.f28155s) != null && j6Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        eu0 eu0VarK2 = k1(i11);
        if (i11 != 8 && (eu0VarK2 == null || (j6Var = eu0VarK2.f28155s) == null || j6Var.g() <= 0)) {
            f10 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f10;
        }
        if (!z11) {
            f10 = visibilityFactor;
        }
        return AndroidUtilities.lerp(visibilityFactor, f10, Math.abs(zs0VarArr[0].getTranslationX() / zs0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        zs0[] zs0VarArr = this.f29122g0;
        zs0 zs0Var = zs0VarArr[1];
        if (zs0Var != null && zs0Var.getVisibility() == 0) {
            if (this.f29113c1 && !this.f29118e1) {
                return zs0VarArr[1].B;
            }
            if (Math.abs(zs0VarArr[1].getTranslationX()) < zs0VarArr[1].getMeasuredWidth() / 2.0f) {
                return zs0VarArr[1].B;
            }
        }
        return getSelectedTab();
    }

    public zk0 getCurrentListView() {
        ms0 ms0Var;
        zs0 zs0Var = this.f29122g0[0];
        int i10 = zs0Var.B;
        if (i10 == 13) {
            return this.Q.getCurrentListView();
        }
        if (i10 == 14) {
            return this.R.getCurrentListView();
        }
        return (i10 != 12 || (ms0Var = this.P) == null) ? zs0Var.h : ms0Var.f42977a.f42213t0;
    }

    public int getInitialTab() {
        return 0;
    }

    public int getPhotosVideosTypeFilter() {
        return this.f29140p1[0].f34339q;
    }

    public TextView getSaveItem() {
        return this.m0;
    }

    public org.telegram.ui.ActionBar.v0 getSearchItem() {
        return this.f29128j0;
    }

    public ri0 getSearchOptionsItem() {
        return this.f29137o0;
    }

    public int getSelectedTab() {
        int currentTabId = this.E0.getCurrentTabId();
        ar0 ar0Var = this.S;
        if (ar0Var == null || currentTabId != 8) {
            return currentTabId;
        }
        int currentAlbumId = ar0Var.getCurrentAlbumId();
        if (currentAlbumId == 0) {
            return 8;
        }
        return currentAlbumId > 0 ? i1(currentAlbumId).f28825a : currentTabId;
    }

    public TL_stories.MediaArea getStoriesArea() {
        return null;
    }

    public String getStoriesHashtag() {
        return null;
    }

    public String getStoriesHashtagUsername() {
        return null;
    }

    @Deprecated
    public float getTabProgress() {
        float fAbs = 0.0f;
        int i10 = 0;
        while (true) {
            zs0[] zs0VarArr = this.f29122g0;
            if (i10 >= zs0VarArr.length) {
                return fAbs;
            }
            zs0 zs0Var = zs0VarArr[i10];
            if (zs0Var != null) {
                fAbs = ((1.0f - Math.abs(zs0Var.getTranslationX() / getWidth())) * zs0Var.B) + fAbs;
            }
            i10++;
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f29156w0, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23441z6));
        org.telegram.ui.ActionBar.v0 v0Var = this.f29124h0;
        ri0 iconView = v0Var.getIconView();
        int i10 = org.telegram.ui.ActionBar.g6.f23425y8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(iconView, 8, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.f23443z8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var, 32, null, null, null, null, i11));
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f29141q0;
        if (v0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var2.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var2, 32, null, null, null, null, i11));
        }
        org.telegram.ui.ActionBar.v0 v0Var3 = this.f29139p0;
        if (v0Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var3.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var3, 32, null, null, null, null, i11));
        }
        Drawable[] drawableArr = {this.f29164z0};
        ImageView imageView = this.f29162y0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 8, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 32, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f29159x0, 1, null, null, null, null, i12));
        vr0 vr0Var = this.E0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(vr0Var, 1, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.f23395wc;
        org.telegram.ui.Cells.v0 v0Var4 = this.G0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var4, 0, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var4, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23187kd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(vr0Var, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Gh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(vr0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.Fh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(vr0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.Eh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(vr0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.Hh));
        rr0 rr0Var = this.N0;
        if (rr0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(rr0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23374v7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(rr0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23392w7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(rr0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23358u7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(rr0Var, 33554436, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23340t7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(rr0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23407x7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(rr0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23424y7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(rr0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A7));
        }
        final int i14 = 0;
        while (true) {
            zs0[] zs0VarArr = this.f29122g0;
            if (i14 >= zs0VarArr.length) {
                return arrayList;
            }
            org.telegram.ui.ActionBar.h6 h6Var = new org.telegram.ui.ActionBar.h6() {
                @Override
                public final void b() {
                    zs0[] zs0VarArr2 = this.f31962a.f29122g0;
                    int i15 = i14;
                    er0 er0Var = zs0VarArr2[i15].h;
                    if (er0Var != null) {
                        int childCount = er0Var.getChildCount();
                        for (int i16 = 0; i16 < childCount; i16++) {
                            View childAt = zs0VarArr2[i15].h.getChildAt(i16);
                            if (childAt instanceof org.telegram.ui.Cells.p7) {
                                org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) childAt;
                                for (int i17 = 0; i17 < 6; i17++) {
                                    p7Var.f24992a[i17].f24624e.invalidate();
                                }
                            } else if (childAt instanceof org.telegram.ui.Cells.e6) {
                                ((org.telegram.ui.Cells.e6) childAt).v(0);
                            } else if (childAt instanceof org.telegram.ui.Cells.sa) {
                                ((org.telegram.ui.Cells.sa) childAt).j(0);
                            }
                        }
                    }
                }

                @Override
                public final void a(float f10) {
                }
            };
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
            nr0 nr0Var = zs0VarArr[i14].v;
            int i15 = org.telegram.ui.ActionBar.g6.f23053d6;
            arrayList.add(new org.telegram.ui.ActionBar.i6(nr0Var, 0, null, null, null, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].f35342w, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23037c7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 524288, new Class[]{org.telegram.ui.Cells.s3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23091f7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.s3.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23073e7));
            int i16 = org.telegram.ui.ActionBar.g6.f23125h6;
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.uh));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23215m6));
            int i17 = org.telegram.ui.ActionBar.g6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
            int i18 = org.telegram.ui.ActionBar.g6.f23423y6;
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusColor"}, null, null, -1, h6Var, i18));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusOnlineColor"}, null, null, -1, h6Var, org.telegram.ui.ActionBar.g6.f23234n6));
            Drawable[] drawableArr2 = org.telegram.ui.ActionBar.g6.f23295r0;
            int i19 = org.telegram.ui.ActionBar.g6.J7;
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.sa.class}, null, drawableArr2, null, i19));
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.g6.B0;
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.e6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.g6.D0}, null, -1, null, org.telegram.ui.ActionBar.g6.X8));
            TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.g6.C0;
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.e6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.g6.E0}, null, -1, null, org.telegram.ui.ActionBar.g6.Z8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.e6.class}, null, drawableArr2, null, i19));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.O7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.P7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.Q7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.R7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.S7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.T7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.U7));
            int i20 = org.telegram.ui.ActionBar.g6.f23441z6;
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 4, new Class[]{ts0.class}, new String[]{"emptyTextView"}, null, null, -1, null, i20));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
            int i21 = org.telegram.ui.ActionBar.g6.Ih;
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 2048, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"progressView"}, null, null, -1, null, i21));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"statusImageView"}, null, null, -1, null, i21));
            int i22 = org.telegram.ui.ActionBar.g6.f23145i7;
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            int i23 = org.telegram.ui.ActionBar.g6.f23182k7;
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.zi));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Bi));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.e7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.e7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.e7.class}, org.telegram.ui.ActionBar.g6.f23087f3, null, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.e7.class}, org.telegram.ui.ActionBar.g6.f23105g3, null, null, i20));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.i7.class}, null, null, null, org.telegram.ui.ActionBar.g6.J6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.i7.class}, org.telegram.ui.ActionBar.g6.m0, null, null, org.telegram.ui.ActionBar.g6.K6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Kh));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 32, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Jh));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.j7.class}, null, null, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 524288, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"textView"}, null, null, -1, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"textView"}, null, null, -1, null, i17));
            int i24 = org.telegram.ui.ActionBar.g6.Lh;
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.p7.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.p7.class}, null, null, h6Var, i22));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.p7.class}, null, null, h6Var, i23));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.d2.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.d2.class}, null, null, h6Var, i22));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.d2.class}, null, null, h6Var, i23));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].h, 0, null, null, new Drawable[]{this.f29151u0}, null, org.telegram.ui.ActionBar.g6.f23018b7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].f35342w.d, 4, null, null, null, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.i6(zs0VarArr[i14].f35342w.f29506e, 4, null, null, null, null, i18));
            i14++;
        }
    }

    public final int h0(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var = this.B1;
        return c6Var != null ? c6Var.N0(i10) : org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    public final int h1(int i10) {
        gu0 gu0VarJ1 = j1(i10);
        if (gu0VarJ1 == null) {
            return -1;
        }
        return gu0VarJ1.f28826b;
    }

    public final boolean i0() {
        return this.f29145r1.getConnectionsManager().getConnectionState() == 3;
    }

    public final gu0 i1(int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        HashMap map = this.U1;
        gu0 gu0Var = (gu0) map.get(numValueOf);
        if (gu0Var != null) {
            return gu0Var;
        }
        gu0 gu0Var2 = new gu0(this, getContext(), i10);
        map.put(Integer.valueOf(i10), gu0Var2);
        this.V1.put(Integer.valueOf(gu0Var2.f28825a), Integer.valueOf(i10));
        return gu0Var2;
    }

    public final boolean j0() {
        SparseArray[] sparseArrayArr;
        MessageObject messageObject;
        TLRPC.Message message;
        boolean z10 = false;
        for (int i10 = 1; i10 >= 0; i10--) {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            while (true) {
                sparseArrayArr = this.V0;
                if (i11 >= sparseArrayArr[i10].size()) {
                    break;
                }
                arrayList.add(Integer.valueOf(sparseArrayArr[i10].keyAt(i11)));
                i11++;
            }
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                Integer num = (Integer) obj;
                if (num.intValue() > 0 && (messageObject = (MessageObject) sparseArrayArr[i10].get(num.intValue())) != null && (message = messageObject.messageOwner) != null && message.noforwards) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                return z10;
            }
        }
        return z10;
    }

    public final gu0 j1(int i10) {
        Integer num = (Integer) this.V1.get(Integer.valueOf(i10));
        if (num == null) {
            return null;
        }
        return (gu0) this.U1.get(num);
    }

    public final void k0() {
        AndroidUtilities.cancelRunOnUIThread(this.I0);
        org.telegram.ui.Cells.v0 v0Var = this.G0;
        if (v0Var.getTag() == null) {
            return;
        }
        v0Var.setTag(null);
        AnimatorSet animatorSet = this.H0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.H0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.H0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.H0.playTogether(ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.Cells.v0, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.Cells.v0, Float>) View.TRANSLATION_Y, (-AndroidUtilities.dp(48.0f)) + this.K0));
        this.H0.setInterpolator(er.f28123g);
        this.H0.addListener(new yr0(this, 0));
        this.H0.start();
    }

    public final eu0 k1(int i10) {
        gu0 gu0VarJ1;
        if (i10 == 8) {
            return this.V;
        }
        if (i10 == 9) {
            return this.f29106a0;
        }
        if (!w0(i10) || (gu0VarJ1 = j1(i10)) == null) {
            return null;
        }
        return gu0VarJ1.f28827c;
    }

    public boolean l0() {
        return false;
    }

    public final eu0 l1(int i10) {
        gu0 gu0VarJ1;
        if (i10 == 8) {
            return this.W;
        }
        if (i10 == 9) {
            return this.f29109b0;
        }
        if (!w0(i10) || (gu0VarJ1 = j1(i10)) == null) {
            return null;
        }
        return gu0VarJ1.d;
    }

    public boolean m0() {
        return !(this instanceof n30);
    }

    public final void m1(boolean z10) {
        zs0[] zs0VarArr;
        zs0[] zs0VarArr2;
        f2.d1 d1Var;
        boolean z11;
        boolean z12;
        boolean z13;
        ?? r10;
        int i10;
        boolean z14;
        int i11;
        boolean z15;
        int i12;
        boolean z16;
        f2.d1 d1Var2;
        int i13;
        int i14;
        boolean z17;
        wq0 wq0Var = this.R;
        if (wq0Var != null) {
            wq0Var.i();
        }
        int i15 = 0;
        while (true) {
            zs0VarArr = this.f29122g0;
            if (i15 >= zs0VarArr.length) {
                break;
            }
            zs0VarArr[i15].h.B0();
            i15++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) zs0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = AndroidUtilities.dp(B0());
        f2.q0 adapter = zs0VarArr[z10 ? 1 : 0].h.getAdapter();
        f2.q0 q0Var = this.V;
        f2.f0 f0Var = this.U;
        if (adapter == q0Var) {
            f0Var.d(null);
        }
        boolean z18 = this.R0;
        ss0 ss0Var = this.f29165z1;
        String string = "";
        nt0 nt0Var = this.J;
        org.telegram.ui.ActionBar.v0 v0Var = this.f29128j0;
        int i16 = 100;
        if (z18 && this.Q0) {
            zs0 zs0Var = zs0VarArr[z10 ? 1 : 0];
            if (zs0Var.f35338f == null) {
                zs0Var.f35338f = new f2.d1();
            }
            zs0 zs0Var2 = zs0VarArr[z10 ? 1 : 0];
            d1Var2 = zs0Var2.f35338f;
            st0 st0Var = this.O;
            xs0 xs0Var = this.f29120f0;
            ct0 ct0Var = this.f29114d0;
            ct0 ct0Var2 = this.f29117e0;
            ct0 ct0Var3 = this.f29112c0;
            if (z10) {
                int i17 = zs0Var2.B;
                if (i17 == 0 || i17 == 2 || i17 == 5 || i17 == 6 || (i17 == 7 && !ss0Var.T())) {
                    this.R0 = false;
                    sr0 sr0Var = this.F0;
                    if (sr0Var != null) {
                        sr0Var.g(false);
                    }
                    this.Q0 = false;
                    m1(true);
                    return;
                }
                string = v0Var != null ? v0Var.getSearchField().getText().toString() : "";
                int i18 = zs0VarArr[z10 ? 1 : 0].B;
                if (i18 == 1) {
                    if (ct0Var3 != null) {
                        ct0Var3.G(string, false);
                        if (adapter != ct0Var3) {
                            W0(adapter);
                            zs0VarArr[z10 ? 1 : 0].h.setAdapter(ct0Var3);
                        }
                    }
                } else if (i18 == 3) {
                    if (ct0Var2 != null) {
                        ct0Var2.G(string, false);
                        if (adapter != ct0Var2) {
                            W0(adapter);
                            zs0VarArr[z10 ? 1 : 0].h.setAdapter(ct0Var2);
                        }
                    }
                } else if (i18 == 4) {
                    if (ct0Var != null) {
                        ct0Var.G(string, false);
                        if (adapter != ct0Var) {
                            W0(adapter);
                            zs0VarArr[z10 ? 1 : 0].h.setAdapter(ct0Var);
                        }
                    }
                } else if (i18 == 7) {
                    if (xs0Var != null) {
                        xs0Var.F(string, false);
                        if (adapter != xs0Var) {
                            W0(adapter);
                            zs0VarArr[z10 ? 1 : 0].h.setAdapter(xs0Var);
                        }
                    }
                } else if (i18 == 11) {
                    if (st0Var != null) {
                        st0Var.E(this.S0, string);
                        if (adapter != st0Var) {
                            W0(adapter);
                            zs0VarArr[z10 ? 1 : 0].h.setAdapter(st0Var);
                        }
                    }
                } else if (i18 == 15 && nt0Var != null && adapter != nt0Var) {
                    W0(adapter);
                    er0 er0Var = zs0VarArr[z10 ? 1 : 0].h;
                    nt0Var.f31033r = er0Var;
                    er0Var.setAdapter(nt0Var);
                }
            } else if (zs0Var2.h != null) {
                int i19 = zs0Var2.B;
                if (i19 == 1) {
                    if (adapter != ct0Var3) {
                        W0(adapter);
                        zs0VarArr[z10 ? 1 : 0].h.setAdapter(ct0Var3);
                    }
                    ct0Var3.l();
                } else if (i19 == 3) {
                    if (adapter != ct0Var2) {
                        W0(adapter);
                        zs0VarArr[z10 ? 1 : 0].h.setAdapter(ct0Var2);
                    }
                    ct0Var2.l();
                } else if (i19 == 4) {
                    if (adapter != ct0Var) {
                        W0(adapter);
                        zs0VarArr[z10 ? 1 : 0].h.setAdapter(ct0Var);
                    }
                    ct0Var.l();
                } else if (i19 == 7) {
                    if (adapter != xs0Var) {
                        W0(adapter);
                        zs0VarArr[z10 ? 1 : 0].h.setAdapter(xs0Var);
                    }
                    xs0Var.l();
                } else if (i19 == 11) {
                    if (adapter != st0Var) {
                        W0(adapter);
                        zs0VarArr[z10 ? 1 : 0].h.setAdapter(st0Var);
                    }
                    st0Var.l();
                }
            }
            zs0VarArr2 = zs0VarArr;
            z16 = false;
            z15 = false;
            i12 = 100;
        } else {
            zs0 zs0Var3 = zs0VarArr[z10 ? 1 : 0];
            if (zs0Var3.f35337e == null) {
                zs0Var3.f35337e = new f2.d1();
            }
            zs0 zs0Var4 = zs0VarArr[z10 ? 1 : 0];
            f2.d1 d1Var3 = zs0Var4.f35337e;
            zs0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i20 = zs0VarArr[z10 ? 1 : 0].B;
            if (i20 == 8 || w0(i20)) {
                layoutParams.topMargin = AndroidUtilities.dp(B0());
            }
            er0 er0Var2 = zs0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = er0Var2.getPaddingLeft();
            zs0 zs0Var5 = zs0VarArr[z10 ? 1 : 0];
            er0 er0Var3 = zs0Var5.h;
            int iZ = Z(zs0Var5.B);
            er0Var3.Z2 = iZ;
            int paddingRight = zs0VarArr[z10 ? 1 : 0].h.getPaddingRight();
            zs0VarArr2 = zs0VarArr;
            er0 er0Var4 = zs0VarArr2[z10 ? 1 : 0].h;
            int iY = Y(v0());
            er0Var4.a3 = iY;
            er0Var2.setPadding(paddingLeft, iZ, paddingRight, iY);
            int i21 = zs0VarArr2[z10 ? 1 : 0].B;
            int[] iArr = this.f29127i1;
            f2.q0 q0Var2 = this.G;
            View view = this.Q;
            ms0 ms0Var = this.P;
            qt0 qt0Var = this.N;
            rs0 rs0Var = this.L;
            wt0[] wt0VarArr = this.f29140p1;
            if (i21 == 0) {
                f2.q0 q0Var3 = this.D;
                if (adapter != q0Var3) {
                    W0(adapter);
                    zs0VarArr2[z10 ? 1 : 0].h.setAdapter(q0Var3);
                }
                int i22 = -AndroidUtilities.dp(1.0f);
                layoutParams.rightMargin = i22;
                layoutParams.leftMargin = i22;
                wt0 wt0Var = wt0VarArr[0];
                boolean z19 = wt0Var.h && !wt0Var.f34328e.isEmpty();
                i16 = iArr[0];
                zs0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.f29151u0);
                wt0 wt0Var2 = wt0VarArr[0];
                if (wt0Var2.f34345x == null) {
                    wt0Var2.f34345x = new f2.d1();
                }
                z13 = z19;
                d1Var = wt0VarArr[0].f34345x;
                z11 = false;
            } else {
                if (i21 == 1) {
                    wt0 wt0Var3 = wt0VarArr[1];
                    z12 = wt0Var3.h && !wt0Var3.f34328e.isEmpty();
                    if (adapter != q0Var2) {
                        W0(adapter);
                        zs0VarArr2[z10 ? 1 : 0].h.setAdapter(q0Var2);
                    }
                } else if (i21 == 2) {
                    wt0 wt0Var4 = wt0VarArr[2];
                    z12 = wt0Var4.h && !wt0Var4.f34328e.isEmpty();
                    if (adapter != this.H) {
                        W0(adapter);
                        zs0VarArr2[z10 ? 1 : 0].h.setAdapter(this.H);
                    }
                } else {
                    if (i21 == 3) {
                        if (adapter != this.F) {
                            W0(adapter);
                            zs0VarArr2[z10 ? 1 : 0].h.setAdapter(this.F);
                        }
                    } else if (i21 == 4) {
                        wt0 wt0Var5 = wt0VarArr[4];
                        z12 = wt0Var5.h && !wt0Var5.f34328e.isEmpty();
                        if (adapter != this.I) {
                            W0(adapter);
                            zs0VarArr2[z10 ? 1 : 0].h.setAdapter(this.I);
                        }
                    } else {
                        if (i21 == 5) {
                            if (adapter != this.K) {
                                W0(adapter);
                                zs0VarArr2[z10 ? 1 : 0].h.setAdapter(this.K);
                            }
                        } else if (i21 == 15) {
                            if (adapter != nt0Var) {
                                W0(adapter);
                                er0 er0Var5 = zs0VarArr2[z10 ? 1 : 0].h;
                                nt0Var.f31033r = er0Var5;
                                er0Var5.setAdapter(nt0Var);
                            }
                        } else if (i21 == 6) {
                            if (adapter != rs0Var) {
                                W0(adapter);
                                zs0VarArr2[z10 ? 1 : 0].h.setAdapter(rs0Var);
                            }
                        } else if (i21 == 7) {
                            if (adapter != this.T) {
                                W0(adapter);
                                zs0VarArr2[z10 ? 1 : 0].h.setAdapter(this.T);
                            }
                        } else if (p0(i21)) {
                            f2.q0 q0VarK1 = k1(zs0VarArr2[z10 ? 1 : 0].B);
                            if (adapter != q0VarK1) {
                                W0(adapter);
                                zs0VarArr2[z10 ? 1 : 0].h.setAdapter(q0VarK1);
                                zs0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            zs0 zs0Var6 = zs0VarArr2[z10 ? 1 : 0];
                            if (zs0Var6.B != 9) {
                                f0Var.d(zs0Var6.h);
                            }
                            i16 = iArr[1];
                        } else {
                            int i23 = zs0VarArr2[z10 ? 1 : 0].B;
                            if (i23 == 10) {
                                if (adapter != this.M) {
                                    W0(adapter);
                                    zs0VarArr2[z10 ? 1 : 0].h.setAdapter(this.M);
                                }
                            } else if (i23 == 11) {
                                if (adapter != qt0Var) {
                                    W0(adapter);
                                    zs0VarArr2[z10 ? 1 : 0].h.setAdapter(qt0Var);
                                    f2.f0 f0Var2 = qt0Var.v;
                                    er0 er0Var6 = zs0VarArr2[z10 ? 1 : 0].h;
                                    qt0Var.f31978s = er0Var6;
                                    f0Var2.d(er0Var6);
                                }
                                d1Var = qt0Var.f31977r;
                            } else if (i23 == 12) {
                                if (adapter != null) {
                                    W0(adapter);
                                    zs0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (ms0Var.getParent() != zs0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(ms0Var);
                                    zs0VarArr2[z10 ? 1 : 0].addView(ms0Var, h7.z5.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                }
                            } else if (i23 == 13) {
                                if (adapter != null) {
                                    W0(adapter);
                                    zs0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != zs0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(view);
                                    zs0VarArr2[z10 ? 1 : 0].addView(view);
                                }
                            } else if (i23 == 14) {
                                if (adapter != null) {
                                    W0(adapter);
                                    zs0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (wq0Var != null && wq0Var.getParent() != zs0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(wq0Var);
                                    zs0VarArr2[z10 ? 1 : 0].addView(wq0Var);
                                    zs0VarArr2[z10 ? 1 : 0].f35342w.setVisibility(4);
                                }
                            }
                            z11 = true;
                            z13 = false;
                        }
                        d1Var = d1Var3;
                        z11 = false;
                        z13 = false;
                    }
                    d1Var = d1Var3;
                    z11 = true;
                    z13 = false;
                }
                z13 = z12;
                d1Var = d1Var3;
                z11 = true;
            }
            int i24 = zs0VarArr2[z10 ? 1 : 0].B;
            boolean z20 = i24 == 0 || p0(i24);
            f2.d1 d1Var4 = d1Var;
            zs0VarArr2[z10 ? 1 : 0].v.setLayoutParams(h7.z5.d(-1, -1.0f, 119, z20 ? 0.0f : 12.0f, (z20 ? 8 : 12) + 48, z20 ? 0.0f : 12.0f, z20 ? 0.0f : 12.0f));
            if (z11) {
                zs0VarArr2[z10 ? 1 : 0].h.setSections(false);
            } else {
                er0 er0Var7 = zs0VarArr2[z10 ? 1 : 0].h;
                er0Var7.getClass();
                er0Var7.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, er0Var7.f35277l2));
                er0Var7.E2 = null;
                er0Var7.H2 = 0.0f;
                er0Var7.I2 = null;
                er0Var7.J2 = null;
                er0Var7.F2 = null;
                nk0 nk0Var = er0Var7.D2;
                if (nk0Var != null) {
                    er0Var7.p0(nk0Var);
                    er0Var7.D2 = null;
                }
            }
            zs0 zs0Var7 = zs0VarArr2[z10 ? 1 : 0];
            int i25 = zs0Var7.B;
            org.telegram.ui.ActionBar.n2 n2Var = this.f29145r1;
            if (i25 == 15) {
                zs0Var7.setBackground(lh.q6.e(zs0Var7.getBackground(), n2Var.getCurrentAccount(), this.f29121f1, org.telegram.ui.ActionBar.g6.I.q()));
                zs0VarArr2[z10 ? 1 : 0].setOutlineProvider(new cg.l1(14));
                zs0VarArr2[z10 ? 1 : 0].setClipToOutline(true);
                r10 = 0;
            } else {
                zs0Var7.setClipToOutline(false);
                r10 = 0;
                zs0VarArr2[z10 ? 1 : 0].setBackground(null);
            }
            zs0 zs0Var8 = zs0VarArr2[z10 ? 1 : 0];
            if (zs0Var8.B == 11) {
                zs0Var8.h.setItemAnimator(zs0Var8.d);
            } else {
                zs0Var8.h.setItemAnimator(r10);
                if (qt0Var != null && zs0VarArr2[z10 ? 1 : 0].h == qt0Var.f31978s) {
                    f2.f0 f0Var3 = qt0Var.v;
                    qt0Var.f31978s = r10;
                    f0Var3.d(r10);
                }
            }
            if (ms0Var != null && zs0VarArr2[z10 ? 1 : 0].B != 12 && ms0Var.getParent() == zs0VarArr2[z10 ? 1 : 0]) {
                ms0Var.f42977a.onRemoveFromParent();
                zs0VarArr2[z10 ? 1 : 0].removeView(ms0Var);
            }
            if (view != null && zs0VarArr2[z10 ? 1 : 0].B != 13) {
                ViewParent parent = view.getParent();
                zs0 zs0Var9 = zs0VarArr2[z10 ? 1 : 0];
                if (parent == zs0Var9) {
                    zs0Var9.removeView(view);
                }
            }
            if (wq0Var != null && zs0VarArr2[z10 ? 1 : 0].B != 14) {
                ViewParent parent2 = wq0Var.getParent();
                zs0 zs0Var10 = zs0VarArr2[z10 ? 1 : 0];
                if (parent2 == zs0Var10) {
                    zs0Var10.removeView(wq0Var);
                }
            }
            int i26 = zs0VarArr2[z10 ? 1 : 0].B;
            if (i26 != 0 && i26 != 11 && !p0(i26) && (i13 = zs0VarArr2[z10 ? 1 : 0].B) != 2 && i13 != 5 && i13 != 6 && ((i13 != 7 || ss0Var.T()) && (i14 = zs0VarArr2[z10 ? 1 : 0].B) != 10 && i14 != 13 && i14 != 14)) {
                if (!z10) {
                    z17 = false;
                    if (v0Var != null) {
                        if (v0Var.getVisibility() == 4) {
                            if (D()) {
                                this.f29149t0 = 0;
                                this.f29130k0 = 1.0f;
                                v0Var.setVisibility(0);
                            } else {
                                v0Var.setVisibility(v0() ? 8 : 4);
                                this.f29130k0 = 0.0f;
                            }
                        }
                    }
                    q1(z17);
                } else if (v0Var == null || v0Var.getVisibility() != 4 || this.C.f23578j0) {
                    z17 = false;
                    this.f29149t0 = 0;
                    this.f29130k0 = 1.0f;
                } else {
                    if (D()) {
                        this.f29149t0 = 1;
                        v0Var.setVisibility(0);
                    } else {
                        v0Var.setVisibility(v0() ? 8 : 4);
                    }
                    float f10 = z10 ? 1.0f : 0.0f;
                    this.f29130k0 = b0(f10);
                    s1(1.0f - f10);
                    z17 = false;
                }
                q1(z17);
            } else if (z10) {
                this.f29149t0 = 2;
            } else {
                this.f29149t0 = 0;
                if (v0Var != null) {
                    v0Var.setVisibility((v0() || this.R0) ? 8 : 4);
                }
            }
            int i27 = zs0VarArr2[z10 ? 1 : 0].B;
            if (i27 == 6) {
                if (!rs0Var.f32261e && !rs0Var.h && rs0Var.d.isEmpty()) {
                    rs0.E(rs0Var, 0L);
                }
            } else if (i27 != 7) {
                if (p0(i27)) {
                    eu0 eu0VarK1 = k1(zs0VarArr2[z10 ? 1 : 0].B);
                    if (eu0VarK1 != null) {
                        jh.j6 j6Var = eu0VarK1.f28155s;
                        eu0VarK1.P();
                        zs0VarArr2[z10 ? 1 : 0].f35342w.e(j6Var != null && (j6Var.k() || (i0() && j6Var.g() > 0)), z10);
                        z14 = (j6Var == null || j6Var.g() <= 0 || t0()) ? false : true;
                    } else {
                        z14 = z13;
                    }
                    z13 = z14;
                } else {
                    int i28 = zs0VarArr2[z10 ? 1 : 0].B;
                    if (i28 != 10 && i28 != 11 && i28 != 12 && i28 != 13 && i28 != 14) {
                        if (i28 == 15) {
                            i28 = 8;
                        }
                        wt0 wt0Var6 = wt0VarArr[i28];
                        if (!wt0Var6.f34330g && !wt0Var6.f34331i[0] && wt0Var6.f34325a.isEmpty()) {
                            wt0VarArr[i28].f34330g = true;
                            q0Var2.l();
                            if (i28 != 0) {
                                i10 = i28;
                            } else {
                                int i29 = wt0VarArr[0].f34339q;
                                if (i29 == 1) {
                                    i10 = 6;
                                } else if (i29 == 2) {
                                    i10 = 7;
                                } else {
                                    i10 = i28;
                                }
                            }
                            n2Var.getMediaDataController().loadMedia(this.f29121f1, 50, 0, 0, i10, this.B, 1, n2Var.getClassGuid(), wt0VarArr[i10].f34338p, null, null);
                        }
                    }
                }
            }
            int i30 = zs0VarArr2[z10 ? 1 : 0].B;
            if (i30 == 8 || w0(i30)) {
                zs0 zs0Var11 = zs0VarArr2[z10 ? 1 : 0];
                pr0 pr0Var = zs0Var11.f35342w;
                boolean zW0 = w0(zs0Var11.B);
                int iH1 = h1(zs0VarArr2[z10 ? 1 : 0].B);
                n9 n9Var = pr0Var.f29504b;
                lh.d dVar = pr0Var.f29507f;
                n9Var.setVisibility((zW0 || u0() || r0()) ? 8 : 0);
                if (zW0) {
                    dVar.setVisibility(0);
                    dVar.h(LocaleController.getString(R.string.StoriesAlbumAddToAlbum));
                } else if (u0()) {
                    dVar.setVisibility(8);
                } else {
                    pr0Var.setStickerType(11);
                    dVar.setVisibility(!t0() ? 0 : 8);
                    dVar.h(w());
                }
                if (zW0) {
                    pr0Var.d.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeTitle));
                    pr0Var.f29506e.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeDescription));
                } else {
                    eh.s sVar = pr0Var.d;
                    if (t0()) {
                        i11 = R.string.NoHashtagStoriesTitle;
                    } else {
                        i11 = v0() ? R.string.NoPublicStoriesTitle2 : R.string.NoStoriesTitle;
                    }
                    sVar.setText(LocaleController.getString(i11));
                    pr0Var.f29506e.setText(v0() ? LocaleController.getString(R.string.NoStoriesSubtitle2) : string);
                }
                dVar.setOnClickListener(new gh.w2(this, zW0, iH1, 1));
            } else {
                zs0 zs0Var12 = zs0VarArr2[z10 ? 1 : 0];
                if (zs0Var12.B == 9) {
                    if (u0()) {
                        zs0VarArr2[z10 ? 1 : 0].f35342w.f29504b.setVisibility(8);
                        zs0VarArr2[z10 ? 1 : 0].f35342w.f29507f.setVisibility(8);
                    } else {
                        zs0VarArr2[z10 ? 1 : 0].f35342w.f29504b.setVisibility(0);
                        zs0VarArr2[z10 ? 1 : 0].f35342w.setStickerType(11);
                        zs0VarArr2[z10 ? 1 : 0].f35342w.f29507f.setVisibility(0);
                        zs0VarArr2[z10 ? 1 : 0].f35342w.f29507f.h(w());
                    }
                    zs0VarArr2[z10 ? 1 : 0].f35342w.d.setText(LocaleController.getString(R.string.NoArchivedStoriesTitle));
                    zs0VarArr2[z10 ? 1 : 0].f35342w.f29506e.setText(v0() ? LocaleController.getString(R.string.NoArchivedStoriesSubtitle) : "");
                    zs0VarArr2[z10 ? 1 : 0].f35342w.f29507f.setOnClickListener(new dq0(this, 7));
                } else {
                    zs0Var12.f35342w.f29504b.setVisibility(0);
                    zs0VarArr2[z10 ? 1 : 0].f35342w.setStickerType(1);
                    zs0VarArr2[z10 ? 1 : 0].f35342w.d.setText(LocaleController.getString(R.string.NoResult));
                    zs0VarArr2[z10 ? 1 : 0].f35342w.f29506e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    zs0VarArr2[z10 ? 1 : 0].f35342w.f29507f.setVisibility(8);
                }
            }
            z15 = false;
            zs0VarArr2[z10 ? 1 : 0].h.setVisibility(0);
            i12 = i16;
            z16 = z13;
            d1Var2 = d1Var4;
        }
        zs0 zs0Var13 = zs0VarArr2[z10 ? 1 : 0];
        zs0Var13.f35335b = z16;
        o1(zs0Var13, z15);
        zs0VarArr2[z10 ? 1 : 0].f35343x.y1(i12);
        zs0VarArr2[z10 ? 1 : 0].h.a0();
        if (d1Var2 != null) {
            zs0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(d1Var2);
            zs0VarArr2[z10 ? 1 : 0].f35340r.setRecycledViewPool(d1Var2);
        }
        if (this.f29149t0 == 2) {
            org.telegram.ui.ActionBar.k kVar = this.C;
            if (kVar.f23578j0) {
                this.f29153v0 = true;
                kVar.h(true);
                this.f29149t0 = 0;
                this.f29130k0 = 0.0f;
                if (v0Var != null) {
                    v0Var.setVisibility(v0() ? 8 : 4);
                }
                q1(false);
            }
        }
    }

    public final void n0(ViewGroup viewGroup) {
        for (zs0 zs0Var : this.f29122g0) {
            er0 er0Var = zs0Var.h;
            Objects.requireNonNull(er0Var);
            zs0Var.f35339n = new jg.k(er0Var, viewGroup, new ov(er0Var, 4));
        }
        wq0 wq0Var = this.R;
        if (wq0Var != null) {
            wq0Var.O = viewGroup;
            wq0Var.N = new gh.s2(wq0Var, 0);
        }
    }

    public final void n1() {
        ls0 ls0Var = this.D;
        if (ls0Var != null) {
            ls0Var.l();
        }
        ut0 ut0Var = this.G;
        if (ut0Var != null) {
            ut0Var.l();
        }
        ut0 ut0Var2 = this.H;
        if (ut0Var2 != null) {
            ut0Var2.l();
        }
        vt0 vt0Var = this.F;
        if (vt0Var != null) {
            vt0Var.X(false);
        }
        ut0 ut0Var3 = this.I;
        if (ut0Var3 != null) {
            ut0Var3.l();
        }
        nt0 nt0Var = this.J;
        if (nt0Var != null) {
            nt0Var.l();
        }
        us0 us0Var = this.K;
        if (us0Var != null) {
            us0Var.l();
        }
        os0 os0Var = this.V;
        if (os0Var != null) {
            os0Var.l();
        }
        Iterator it = this.U1.values().iterator();
        while (it.hasNext()) {
            ((gu0) it.next()).f28827c.l();
        }
    }

    public final void o1(zs0 zs0Var, boolean z10) {
        Integer num = 1;
        boolean z11 = zs0Var.f35335b && this.d;
        ik0 fastScroll = zs0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = zs0Var.f35336c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            zs0Var.f35336c.cancel();
        }
        if (!z10) {
            fastScroll.animate().setListener(null).cancel();
            fastScroll.setVisibility(z11 ? 0 : 8);
            fastScroll.setTag(z11 ? 1 : null);
            fastScroll.setAlpha(1.0f);
            fastScroll.setScaleX(1.0f);
            fastScroll.setScaleY(1.0f);
            return;
        }
        Property property = View.ALPHA;
        if (z11 && fastScroll.getTag() == null) {
            fastScroll.animate().setListener(null).cancel();
            if (fastScroll.getVisibility() != 0) {
                fastScroll.setVisibility(0);
                fastScroll.setAlpha(0.0f);
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(fastScroll, (Property<ik0, Float>) property, fastScroll.getAlpha(), 1.0f);
            zs0Var.f35336c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(150L).start();
            fastScroll.setTag(num);
            return;
        }
        if (z11 || fastScroll.getTag() == null) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(fastScroll, (Property<ik0, Float>) property, fastScroll.getAlpha(), 0.0f);
        objectAnimatorOfFloat2.addListener(new org.telegram.ui.go(fastScroll));
        zs0Var.f35336c = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setDuration(150L).start();
        fastScroll.animate().setListener(null).cancel();
        fastScroll.setTag(null);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i10 = 0;
        while (true) {
            zs0[] zs0VarArr = this.f29122g0;
            if (i10 >= zs0VarArr.length) {
                return;
            }
            er0 er0Var = zs0VarArr[i10].h;
            if (er0Var != null) {
                er0Var.getViewTreeObserver().addOnPreDrawListener(new bs0(this, i10, 0));
            }
            i10++;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return J() || this.E0.D || onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        ss0 ss0Var = this.f29165z1;
        int height = ss0Var.f() != null ? ss0Var.f().getHeight() : 0;
        if (height == 0) {
            height = View.MeasureSpec.getSize(i11);
        }
        setMeasuredDimension(size, height);
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            if (childAt == null || childAt.getVisibility() == 8) {
                i12 = i10;
            } else {
                if (childAt instanceof zs0) {
                    i12 = i10;
                    measureChildWithMargins(childAt, i12, 0, View.MeasureSpec.makeMeasureSpec(height, 1073741824), 0);
                    er0 er0Var = ((zs0) childAt).h;
                    er0Var.setPadding(0, er0Var.U2, 0, er0Var.V2);
                } else {
                    i12 = i10;
                    i13 = i11;
                    measureChildWithMargins(childAt, i12, 0, i13, 0);
                }
                i14++;
                i10 = i12;
                i11 = i13;
            }
            i13 = i11;
            i14++;
            i10 = i12;
            i11 = i13;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (!this.H1) {
            org.telegram.ui.ActionBar.n2 n2Var = this.f29145r1;
            if (n2Var.getParentLayout() != null && !((ActionBarLayout) n2Var.getParentLayout()).j() && !J() && !this.f29105a) {
                if (motionEvent != null) {
                    if (this.f29160x1 == null) {
                        this.f29160x1 = VelocityTracker.obtain();
                    }
                    this.f29160x1.addMovement(motionEvent);
                    x30 x30Var = this.A1;
                    if (x30Var != null) {
                        x30Var.b(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.f29150t1 && !this.f29152u1 && motionEvent.getY() >= AndroidUtilities.dp(90.0f)) {
                    this.f29148s1 = motionEvent.getPointerId(0);
                    this.f29152u1 = true;
                    this.f29154v1 = (int) motionEvent.getX();
                    this.f29157w1 = (int) motionEvent.getY();
                    this.f29160x1.clear();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f29148s1) {
                    int x8 = (int) (motionEvent.getX() - this.f29154v1);
                    int iAbs = Math.abs(((int) motionEvent.getY()) - this.f29157w1);
                    boolean z11 = this.f29150t1;
                    zs0[] zs0VarArr = this.f29122g0;
                    if (z11 && (((z10 = this.f29115d1) && x8 > 0) || (!z10 && x8 < 0))) {
                        if (!U0(motionEvent, x8 < 0)) {
                            this.f29152u1 = true;
                            this.f29150t1 = false;
                            N0(false);
                            zs0VarArr[0].setTranslationX(0.0f);
                            zs0VarArr[1].setTranslationX(this.f29115d1 ? zs0VarArr[0].getMeasuredWidth() : -zs0VarArr[0].getMeasuredWidth());
                            Z0(0.0f, zs0VarArr[1].B);
                            M0(getTabProgress());
                        }
                    }
                    if (!this.f29152u1 || this.f29150t1) {
                        if (this.f29150t1) {
                            zs0VarArr[0].setTranslationX(x8);
                            if (this.f29115d1) {
                                zs0VarArr[1].setTranslationX(zs0VarArr[0].getMeasuredWidth() + x8);
                            } else {
                                zs0VarArr[1].setTranslationX(x8 - zs0VarArr[0].getMeasuredWidth());
                            }
                            float fAbs = Math.abs(x8) / zs0VarArr[0].getMeasuredWidth();
                            if (D()) {
                                this.f29130k0 = b0(fAbs);
                                s1(fAbs);
                                float fA0 = a0(fAbs);
                                this.f29132l0 = fA0;
                                this.f29135n0.setVisibility((fA0 == 0.0f || !D() || q0()) ? 4 : 0);
                            } else {
                                this.f29130k0 = 0.0f;
                            }
                            q1(false);
                            Z0(fAbs, zs0VarArr[1].B);
                            M0(getTabProgress());
                            L0();
                        }
                    } else if (Math.abs(x8) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x8) > iAbs) {
                        U0(motionEvent, x8 < 0);
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f29148s1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    g1(motionEvent);
                }
                return this.f29150t1;
            }
        }
        return false;
    }

    public final void p1() {
        org.telegram.ui.ActionBar.v0 v0Var = this.f29139p0;
        if (v0Var == null) {
            return;
        }
        boolean z10 = this.f29145r1.getMessagesController().isPeerNoForwards(this.f29121f1) || j0();
        v0Var.setAlpha(z10 ? 0.5f : 1.0f);
        if (z10 && v0Var.getBackground() != null) {
            v0Var.setBackground(null);
        } else {
            if (z10 || v0Var.getBackground() != null) {
                return;
            }
            v0Var.setBackground(org.telegram.ui.ActionBar.g6.f0(h0(org.telegram.ui.ActionBar.g6.f23443z8), 5, -1));
        }
    }

    public boolean q0() {
        return false;
    }

    public final void q1(boolean z10) {
        wq0 wq0Var;
        ar0 ar0Var;
        ri0 ri0Var = this.f29137o0;
        if (ri0Var == null) {
            return;
        }
        float fClamp = 0.0f;
        if (!this.R0 && (((wq0Var = this.R) == null || !wq0Var.g()) && ((ar0Var = this.S) == null || !ar0Var.f44658w))) {
            fClamp = Utilities.clamp(this.f29130k0 + this.f29132l0, 1.0f, 0.0f);
        }
        ri0Var.setAlpha(fClamp);
        if (z10) {
            A(a0(1.0f) > 0.5f, true);
        } else if (this.f29149t0 == 2) {
            A(this.f29132l0 > 0.1f, true);
        } else {
            A(this.f29130k0 < 0.1f, true);
        }
    }

    public final boolean r0() {
        TLRPC.User user;
        long j10 = this.f29121f1;
        return j10 > 0 && (user = MessagesController.getInstance(this.f29145r1.getCurrentAccount()).getUser(Long.valueOf(j10))) != null && user.bot;
    }

    public final void r1(boolean z10) {
        int i10 = 0;
        while (true) {
            zs0[] zs0VarArr = this.f29122g0;
            if (i10 >= zs0VarArr.length) {
                return;
            }
            int childCount = zs0VarArr[i10].h.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = zs0VarArr[i10].h.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.f7) {
                    ((org.telegram.ui.Cells.f7) childAt).b(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.o7) {
                    ((org.telegram.ui.Cells.o7) childAt).i(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.i7) {
                    ((org.telegram.ui.Cells.i7) childAt).f(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.e7) {
                    ((org.telegram.ui.Cells.e7) childAt).e(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.d2) {
                    ((org.telegram.ui.Cells.d2) childAt).c(false, z10);
                } else if (childAt instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) childAt).V(false, z10);
                }
            }
            i10++;
        }
    }

    public final boolean s0(int i10) {
        if (i10 == 7) {
            return this.f29165z1.T();
        }
        return (t0() || i10 == 0 || p0(i10) || i10 == 2 || i10 == 5 || i10 == 6 || i10 == 11 || i10 == 10 || i10 == 13 || i10 == 14) ? false : true;
    }

    public final void s1(float f10) {
        org.telegram.ui.ActionBar.v0 v0Var = this.f29126i0;
        if (v0Var == null) {
            return;
        }
        zs0[] zs0VarArr = this.f29122g0;
        zs0 zs0Var = zs0VarArr[1];
        float f11 = 0.0f;
        if (zs0Var != null && zs0Var.B == 11) {
            f11 = 0.0f + f10;
        }
        zs0 zs0Var2 = zs0VarArr[0];
        if (zs0Var2 != null && zs0Var2.B == 11) {
            f11 += 1.0f - f10;
        }
        v0Var.setAlpha(f11);
        float f12 = (0.15f * f11) + 0.85f;
        v0Var.setScaleX(f12);
        v0Var.setScaleY(f12);
        v0Var.setVisibility(f11 <= 0.01f ? 8 : 0);
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        TLRPC.ChatFull chatFull2 = this.Z0;
        boolean z10 = chatFull2 != null && chatFull2.stories_pinned_available;
        this.Z0 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.Y0 == 0) {
                this.Y0 = -j10;
                int i10 = 0;
                while (true) {
                    wt0[] wt0VarArr = this.f29140p1;
                    if (i10 >= wt0VarArr.length) {
                        break;
                    }
                    if (wt0VarArr[i10].f34326b[1].size() == 0) {
                        wt0 wt0Var = wt0VarArr[i10];
                        wt0Var.f34332j[1] = this.Z0.migrated_from_max_id;
                        wt0Var.f34331i[1] = false;
                    }
                    i10++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.Z0;
        if (chatFull3 == null || z10 == chatFull3.stories_pinned_available) {
            return;
        }
        vr0 vr0Var = this.E0;
        if (vr0Var != null) {
            vr0Var.setInitialTabId(q0() ? 9 : 8);
        }
        v1(true);
        m1(false);
    }

    public void setCommonGroupsCount(int i10) {
        if (this.B == 0) {
            this.T0[6] = i10;
        }
        v1(true);
        F();
    }

    public void setForwardRestrictedHint(x30 x30Var) {
        this.A1 = x30Var;
    }

    public void setMergeDialogId(long j10) {
        this.Y0 = j10;
    }

    public void setNewMediaCounts(int[] iArr) {
        int[] iArr2;
        int i10 = 0;
        while (true) {
            iArr2 = this.T0;
            if (i10 > 6 || iArr2[i10] >= 0) {
                break;
            } else {
                i10++;
            }
        }
        System.arraycopy(iArr, 0, iArr2, 0, 6);
        v1(true);
        F();
        if (iArr2[0] >= 0) {
            z0(false);
        }
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.G1 = i11;
        int i14 = 0;
        while (true) {
            zs0[] zs0VarArr = this.f29122g0;
            if (i14 >= zs0VarArr.length) {
                break;
            }
            zs0VarArr[i14].setTranslationY(this.G1);
            i14++;
        }
        if (this.L0 != null) {
            K();
        } else {
            rr0 rr0Var = this.N0;
            if (rr0Var != null) {
                rr0Var.setTranslationY(AndroidUtilities.dp(48.0f) + i11);
            }
        }
        this.K0 = i11;
        org.telegram.ui.Cells.v0 v0Var = this.G0;
        v0Var.setTranslationY((v0Var.getTag() == null ? -AndroidUtilities.dp(48.0f) : 0) + this.K0);
    }

    public void setPagesPaddingBottom(int i10) {
        if (this.T1 != i10) {
            this.T1 = i10;
            zs0[] zs0VarArr = this.f29122g0;
            if (zs0VarArr != null) {
                for (zs0 zs0Var : zs0VarArr) {
                    if (zs0Var != null) {
                        er0 er0Var = zs0Var.h;
                        int paddingLeft = er0Var.getPaddingLeft();
                        er0 er0Var2 = zs0Var.h;
                        int i11 = er0Var2.U2;
                        int paddingRight = er0Var2.getPaddingRight();
                        er0 er0Var3 = zs0Var.h;
                        int iY = Y(v0());
                        er0Var3.a3 = iY;
                        er0Var.setPadding(paddingLeft, i11, paddingRight, iY);
                    }
                }
            }
        }
    }

    public void setPinnedToTop(boolean z10) {
        if (this.d == z10) {
            return;
        }
        this.d = z10;
        int i10 = 0;
        while (true) {
            zs0[] zs0VarArr = this.f29122g0;
            if (i10 >= zs0VarArr.length) {
                return;
            }
            o1(zs0VarArr[i10], true);
            i10++;
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        TLRPC.UserFull userFull2 = this.f29107a1;
        boolean z10 = userFull2 != null && userFull2.stories_pinned_available;
        this.f29107a1 = userFull;
        v1(true);
        if (userFull == null || z10 == userFull.stories_pinned_available) {
            return;
        }
        Y0(8);
    }

    public void setVisibleHeight(int i10) {
        this.I1 = i10;
        int i11 = 0;
        while (true) {
            zs0[] zs0VarArr = this.f29122g0;
            if (i11 >= zs0VarArr.length) {
                break;
            }
            float f10 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(zs0VarArr[i11].B == 8 ? 280.0f : 120.0f)))) / 2.0f;
            zs0VarArr[i11].f35342w.setTranslationY(f10);
            zs0VarArr[i11].v.setTranslationY(-f10);
            i11++;
        }
        vq0 vq0Var = this.Q;
        if (vq0Var != null) {
            vq0Var.setVisibleHeight(i10);
        }
        wq0 wq0Var = this.R;
        if (wq0Var != null) {
            wq0Var.setVisibleHeight(i10);
        }
    }

    public boolean t0() {
        return (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) ? false : true;
    }

    public final void t1() {
        org.telegram.ui.ActionBar.v0 v0Var = this.f29126i0;
        if (v0Var == null) {
            return;
        }
        zs0 zs0Var = this.f29122g0[1];
        boolean z10 = zs0Var != null && zs0Var.B == 11;
        if (z10) {
            v0Var.setVisibility(0);
        }
        v0Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.85f).scaleY(z10 ? 1.0f : 0.85f).withEndAction(new f50(3, this, z10)).setDuration(420L).setInterpolator(er.h).start();
    }

    public boolean u0() {
        return false;
    }

    public final void u1() {
        boolean z10;
        jh.j6 j6Var;
        boolean zR0 = r0();
        org.telegram.ui.ActionBar.v0 v0Var = this.f29147s0;
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f29144r0;
        if (zR0) {
            if (v0Var2 != null) {
                v0Var2.setVisibility(8);
            }
            if (v0Var != null) {
                v0Var.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() == 9) {
            if (v0Var2 != null) {
                v0Var2.setVisibility(8);
            }
            if (v0Var != null) {
                v0Var.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() != 8) {
            if (w0(getClosestTab())) {
                if (v0Var2 != null) {
                    v0Var2.setVisibility(8);
                }
                if (v0Var != null) {
                    v0Var.setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray[] sparseArrayArr = this.V0;
            if (i10 >= sparseArrayArr[0].size()) {
                z10 = false;
                break;
            }
            MessageObject messageObject = (MessageObject) sparseArrayArr[0].valueAt(i10);
            os0 os0Var = this.V;
            if (os0Var != null && (j6Var = os0Var.f28155s) != null && !j6Var.m(messageObject.getId())) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (v0Var2 != null) {
            v0Var2.setVisibility(z10 ? 0 : 8);
        }
        if (v0Var != null) {
            v0Var.setVisibility(z10 ? 8 : 0);
        }
    }

    public boolean v0() {
        return false;
    }

    public void v1(boolean z10) {
        char c10;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.ProfileTab profileTab;
        TLRPC.ProfileTab profileTab2;
        boolean z11;
        int i10;
        boolean z12;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z13;
        int i15;
        boolean zV0;
        qs0 qs0Var;
        boolean z14;
        int[] iArr;
        int[] iArr2;
        boolean z15;
        boolean z16;
        vr0 vr0Var;
        int selectedTab;
        SparseArray sparseArrayG;
        ArrayList arrayList;
        TLRPC.UserFull userFull2;
        TLRPC.ChatFull chatFull2;
        Integer num;
        vr0 vr0Var2;
        boolean z17;
        int i16;
        int size;
        int i17;
        Pair pair;
        int iE0;
        int i18;
        boolean z18;
        int i19;
        Integer numValueOf;
        int i20;
        Boolean bool;
        String string;
        String str;
        int i21;
        String string2;
        HashMap map;
        hh.m7 m7Var;
        ArrayList arrayList2;
        String str2;
        Pair pair2;
        ArrayList arrayList3;
        int i22;
        wq0 wq0Var;
        SpannableStringBuilder spannableStringBuilder;
        int i23;
        char c11;
        int i24;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        boolean z19;
        int i25;
        int i26;
        boolean z20;
        int i27;
        int i28;
        boolean z21;
        int i29;
        int i30;
        int i31;
        boolean z22;
        int i32;
        boolean z23;
        int i33;
        int i34;
        boolean z24;
        int i35;
        int i36;
        boolean z25;
        int i37;
        int i38;
        boolean z26;
        int i39;
        boolean z27;
        int i40;
        int i41;
        boolean z28;
        int i42;
        int i43;
        boolean z29;
        TLRPC.UserFull userFull3;
        TLRPC.ChatFull chatFull3;
        TLRPC.UserFull userFull4;
        TL_bots.BotInfo botInfo;
        zt0 zt0Var;
        vr0 vr0Var3 = this.E0;
        if (vr0Var3 == null) {
            return;
        }
        boolean z30 = !this.f29165z1.r() ? false : z10;
        boolean z31 = (this.P == null || (zt0Var = this.f29142q1) == null || !zt0Var.f35352f) ? false : true;
        org.telegram.ui.ActionBar.n2 n2Var = this.f29145r1;
        long j10 = this.f29121f1;
        if (j10 <= 0 || n2Var == null) {
            c10 = 4;
            user = null;
        } else {
            c10 = 4;
            user = n2Var.getMessagesController().getUser(Long.valueOf(j10));
        }
        boolean z32 = user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        boolean z33 = (user == null || !user.bot || user.bot_can_edit || (userFull4 = this.f29107a1) == null || (botInfo = userFull4.bot_info) == null || !botInfo.has_preview_medias || z32) ? false : true;
        boolean z34 = (DialogObject.isUserDialog(j10) || DialogObject.isChatDialog(j10)) && !DialogObject.isEncryptedDialog(j10) && (((userFull = this.f29107a1) != null && userFull.stories_pinned_available) || (((chatFull = this.Z0) != null && chatFull.stories_pinned_available) || v0())) && m0();
        wq0 wq0Var2 = this.R;
        boolean z35 = wq0Var2 != null && (((userFull3 = this.f29107a1) != null && userFull3.stargifts_count > 0) || ((chatFull3 = this.Z0) != null && chatFull3.stargifts_count > 0));
        boolean z36 = z33;
        TLRPC.ChatFull chatFull4 = this.Z0;
        if (chatFull4 == null) {
            TLRPC.UserFull userFull5 = this.f29107a1;
            if (userFull5 != null) {
                profileTab2 = userFull5.main_tab;
            } else {
                profileTab = null;
            }
            z11 = z30;
            if (this.M1 != vr0Var3.f26522j0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (!z34 || z36) {
                z12 = true;
            } else {
                z12 = false;
            }
            i11 = i10;
            if (z12 != vr0Var3.e(8)) {
                i12 = i11 + 1;
            } else {
                i12 = i11;
            }
            if (z32 != vr0Var3.e(13)) {
                i12++;
            }
            i13 = i12;
            if (t0() != vr0Var3.e(8)) {
                i14 = i13 + 1;
            } else {
                i14 = i13;
            }
            if (z35 != vr0Var3.e(14)) {
                if (wq0Var2 == null && z35) {
                    z13 = z31;
                    i15 = 14;
                    if (this.L1 != wq0Var2.getLastEmojisHash()) {
                        i14++;
                    }
                }
                zV0 = v0();
                qs0Var = this.T;
                z14 = z35;
                iArr = this.T0;
                if (zV0) {
                    iArr2 = iArr;
                    z15 = false;
                    z16 = false;
                } else {
                    if (qs0Var.d == null) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    iArr2 = iArr;
                    i25 = i14;
                    if (z19 == vr0Var3.e(7)) {
                        i26 = i25 + 1;
                    } else {
                        i26 = i25;
                    }
                    if (iArr2[0] <= 0) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    i27 = i26;
                    if (z20 == vr0Var3.e(0)) {
                        i28 = i27 + 1;
                    } else {
                        i28 = i27;
                    }
                    if (iArr2[1] <= 0) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    i29 = i28;
                    if (z21 == vr0Var3.e(1)) {
                        i30 = i29 + 1;
                    } else {
                        i30 = i29;
                    }
                    if (DialogObject.isEncryptedDialog(j10)) {
                        i31 = i30;
                        if (iArr2[4] <= 0) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        if (z22 == vr0Var3.e(4)) {
                            i32 = i31 + 1;
                        } else {
                            i32 = i31;
                        }
                    } else {
                        if (iArr2[3] <= 0) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        i40 = i30;
                        if (z27 == vr0Var3.e(3)) {
                            i41 = i40 + 1;
                        } else {
                            i41 = i40;
                        }
                        if (iArr2[c10] <= 0) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        i42 = i41;
                        if (z28 == vr0Var3.e(4)) {
                            i43 = i42 + 1;
                        } else {
                            i43 = i42;
                        }
                        if (iArr2[8] <= 0) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        i31 = i43;
                        if (z29 == vr0Var3.e(15)) {
                            i32 = i31 + 1;
                        } else {
                            i32 = i31;
                        }
                    }
                    if (iArr2[2] <= 0) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    i33 = i32;
                    if (z23 == vr0Var3.e(2)) {
                        i34 = i33 + 1;
                    } else {
                        i34 = i33;
                    }
                    if (iArr2[5] <= 0) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    i35 = i34;
                    if (z24 == vr0Var3.e(5)) {
                        i36 = i35 + 1;
                    } else {
                        i36 = i35;
                    }
                    if (iArr2[6] <= 0) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    i37 = i36;
                    if (z25 == vr0Var3.e(6)) {
                        i38 = i37 + 1;
                    } else {
                        i38 = i37;
                    }
                    z26 = !this.M.d.isEmpty();
                    i39 = i38;
                    if (z26 != vr0Var3.e(10)) {
                        i14 = i39 + 1;
                    } else {
                        i14 = i39;
                    }
                    if (l0() || n2Var.getMessagesController().getSavedMessagesController().unsupported || !n2Var.getMessagesController().getSavedMessagesController().hasDialogs()) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    z16 = z26;
                    if (z15 != vr0Var3.e(11)) {
                        i14++;
                    }
                    if (z13 != vr0Var3.e(12)) {
                        i14++;
                    }
                }
                if (i14 > 0) {
                    if (z11) {
                        TransitionSet transitionSet = new TransitionSet();
                        transitionSet.setOrdering(0);
                        transitionSet.addTransition(new ag.u0(3));
                        transitionSet.setDuration(200L);
                        TransitionManager.beginDelayedTransition(vr0Var3.getTabsContainer(), transitionSet);
                        vr0Var3.Q = vr0Var3.v;
                        vr0Var3.R = vr0Var3.f26526w;
                    }
                    sparseArrayG = vr0Var3.g();
                    if (i14 > 3) {
                        sparseArrayG = null;
                    }
                    arrayList = new ArrayList();
                    if (t0()) {
                        arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                        vr0Var3.U = 420L;
                    }
                    if (z36) {
                        arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                    } else if ((DialogObject.isUserDialog(j10) || DialogObject.isChatDialog(j10)) && !DialogObject.isEncryptedDialog(j10) && ((((userFull2 = this.f29107a1) != null && userFull2.stories_pinned_available) || (((chatFull2 = this.Z0) != null && chatFull2.stories_pinned_available) || v0())) && m0())) {
                        if (q0()) {
                            arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                            vr0Var3.U = 420L;
                        } else {
                            arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                            if (v0()) {
                                arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                            }
                        }
                    }
                    if (z14) {
                        Integer numValueOf2 = Integer.valueOf(i15);
                        string2 = LocaleController.getString(R.string.ProfileGifts);
                        map = gh.d4.P;
                        m7Var = wq0Var2.d;
                        if (m7Var == null) {
                            wq0Var = wq0Var2;
                            num = 0;
                            vr0Var2 = vr0Var3;
                            z17 = z13;
                            str2 = string2;
                            charSequence = "";
                        } else {
                            z17 = z13;
                            arrayList2 = m7Var.f9753l;
                            str2 = string2;
                            num = 0;
                            vr0Var2 = vr0Var3;
                            pair2 = new Pair(Integer.valueOf(UserConfig.selectedAccount), Long.valueOf(wq0Var2.f7199c));
                            if (!arrayList2.isEmpty()) {
                                HashSet hashSet = new HashSet();
                                arrayList3 = new ArrayList();
                                i22 = 0;
                                while (true) {
                                    wq0Var = wq0Var2;
                                    if (arrayList3.size() >= 3 || i22 >= arrayList2.size()) {
                                        break;
                                    }
                                    TLRPC.Document document = ((TL_stars.SavedStarGift) arrayList2.get(i22)).gift.getDocument();
                                    if (document == null) {
                                        i24 = i22;
                                    } else {
                                        i24 = i22;
                                        if (!hashSet.contains(Long.valueOf(document.f22386id))) {
                                            hashSet.add(Long.valueOf(document.f22386id));
                                            arrayList3.add(document);
                                        }
                                    }
                                    i22 = i24 + 1;
                                    wq0Var2 = wq0Var;
                                }
                                if (arrayList3.isEmpty()) {
                                    spannableStringBuilder = new SpannableStringBuilder(" ");
                                    i23 = 0;
                                    while (i23 < arrayList3.size()) {
                                        TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i23);
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(MessageObject.getEmoji(document2));
                                        spannableStringBuilder2.setSpan(new t5(document2, 0.9f, (Paint.FontMetricsInt) null), 0, spannableStringBuilder2.length(), 33);
                                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                                        i23++;
                                        arrayList3 = arrayList3;
                                    }
                                    c11 = 0;
                                    map.put(pair2, spannableStringBuilder);
                                    charSequence3 = spannableStringBuilder;
                                }
                                CharSequence[] charSequenceArr = new CharSequence[2];
                                charSequenceArr[c11] = str2;
                                charSequenceArr[1] = charSequence3;
                                arrayList.add(new Pair(numValueOf2, TextUtils.concat(charSequenceArr)));
                                this.L1 = wq0Var.getLastEmojisHash();
                            } else if (m7Var.f9750i || (charSequence2 = (CharSequence) map.get(pair2)) == null) {
                                wq0Var = wq0Var2;
                            } else {
                                wq0Var = wq0Var2;
                                charSequence = charSequence2;
                            }
                            charSequence = "";
                        }
                        c11 = 0;
                        charSequence3 = charSequence;
                        CharSequence[] charSequenceArr2 = new CharSequence[2];
                        charSequenceArr2[c11] = str2;
                        charSequenceArr2[1] = charSequence3;
                        arrayList.add(new Pair(numValueOf2, TextUtils.concat(charSequenceArr2)));
                        this.L1 = wq0Var.getLastEmojisHash();
                    } else {
                        num = 0;
                        vr0Var2 = vr0Var3;
                        z17 = z13;
                    }
                    if (z32) {
                        arrayList.add(new Pair(13, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                    }
                    if (!v0()) {
                        if (z15) {
                            arrayList.add(new Pair(11, LocaleController.getString(R.string.SavedDialogsTab)));
                        }
                        if (qs0Var.d != null) {
                            arrayList.add(new Pair(7, LocaleController.getString(R.string.GroupMembers)));
                        }
                        if (iArr2[0] > 0) {
                            if (iArr2[1] != 0 && iArr2[2] == 0 && iArr2[3] == 0 && iArr2[4] == 0 && iArr2[5] == 0 && iArr2[6] == 0 && qs0Var.d == null) {
                                arrayList.add(new Pair(num, LocaleController.getString(R.string.SharedMediaTabFull2)));
                            } else {
                                arrayList.add(new Pair(num, LocaleController.getString(R.string.SharedMediaTab2)));
                            }
                        }
                        if (z17) {
                            arrayList.add(new Pair(12, LocaleController.getString(R.string.SavedMessagesTab2)));
                            MessagesController.getGlobalMainSettings().edit().putInt("savedhint", 3).apply();
                        }
                        if (iArr2[1] > 0) {
                            arrayList.add(new Pair(1, LocaleController.getString(R.string.SharedFilesTab2)));
                        }
                        if (!DialogObject.isEncryptedDialog(j10)) {
                            if (iArr2[3] > 0) {
                                arrayList.add(new Pair(3, LocaleController.getString(R.string.SharedLinksTab2)));
                            }
                            if (iArr2[4] > 0) {
                                arrayList.add(new Pair(4, LocaleController.getString(R.string.SharedMusicTab2)));
                            }
                            if (iArr2[8] > 0) {
                                arrayList.add(new Pair(15, LocaleController.getString(R.string.SharedPollTab)));
                            }
                        } else if (iArr2[4] > 0) {
                            arrayList.add(new Pair(4, LocaleController.getString(R.string.SharedMusicTab2)));
                        }
                        if (iArr2[2] > 0) {
                            arrayList.add(new Pair(2, LocaleController.getString(R.string.SharedVoiceTab2)));
                        }
                        if (iArr2[5] > 0) {
                            arrayList.add(new Pair(5, LocaleController.getString(R.string.SharedGIFsTab2)));
                        }
                        if (iArr2[6] > 0) {
                            arrayList.add(new Pair(6, LocaleController.getString(R.string.SharedGroupsTab2)));
                        }
                        if (z16) {
                            if (j10 > 0) {
                                i21 = R.string.SimilarBotsTab;
                            } else {
                                i21 = R.string.SimilarChannelsTab;
                            }
                            arrayList.add(new Pair(10, LocaleController.getString(i21)));
                        }
                    }
                    vr0Var = vr0Var2;
                    if (vr0Var.f26522j0) {
                        z18 = this.Z0 instanceof TLRPC.TL_channelFull;
                        for (i19 = 0; i19 < 15; i19++) {
                            if (d0(i19, z18) != null) {
                                numValueOf = Integer.valueOf(i19);
                                i20 = 0;
                                while (true) {
                                    if (i20 < arrayList.size()) {
                                        bool = Boolean.FALSE;
                                        break;
                                    } else {
                                        if (((Pair) arrayList.get(i20)).first == numValueOf) {
                                            bool = Boolean.TRUE;
                                            break;
                                        }
                                        i20++;
                                    }
                                }
                                if (!bool.booleanValue()) {
                                    Integer numValueOf3 = Integer.valueOf(i19);
                                    if (i19 != 0) {
                                        string = LocaleController.getString(R.string.SharedMediaTabFull2);
                                    } else if (i19 != 1) {
                                        string = LocaleController.getString(R.string.SharedFilesTab2);
                                    } else if (i19 != 2) {
                                        string = LocaleController.getString(R.string.SharedVoiceTab2);
                                    } else if (i19 != 3) {
                                        string = LocaleController.getString(R.string.SharedLinksTab2);
                                    } else if (i19 != 4) {
                                        string = LocaleController.getString(R.string.SharedMusicTab2);
                                    } else if (i19 != 5) {
                                        string = LocaleController.getString(R.string.SharedGIFsTab2);
                                    } else if (i19 != 8) {
                                        if (i19 != 14) {
                                            str = null;
                                        } else {
                                            string = LocaleController.getString(R.string.ProfileGifts);
                                        }
                                        arrayList.add(new Pair(numValueOf3, str));
                                    } else {
                                        string = LocaleController.getString(R.string.ProfileStories);
                                    }
                                    str = string;
                                    arrayList.add(new Pair(numValueOf3, str));
                                }
                            }
                        }
                    }
                    if (profileTab != null) {
                        iE0 = e0(profileTab);
                        i18 = 0;
                        while (true) {
                            if (i18 < arrayList.size()) {
                                i18 = -1;
                                break;
                            } else if (((Integer) ((Pair) arrayList.get(i18)).first).intValue() == iE0) {
                                break;
                            } else {
                                i18++;
                            }
                        }
                        if (i18 >= 0) {
                            i16 = 0;
                            arrayList.add(0, (Pair) arrayList.remove(i18));
                        } else {
                            i16 = 0;
                        }
                    } else {
                        i16 = 0;
                    }
                    if (!arrayList.isEmpty()) {
                        this.N1 = ((Integer) ((Pair) arrayList.get(i16)).first).intValue();
                    }
                    size = arrayList.size();
                    i17 = 0;
                    while (i17 < size) {
                        Object obj = arrayList.get(i17);
                        i17++;
                        pair = (Pair) obj;
                        if (!vr0Var.e(((Integer) pair.first).intValue())) {
                            vr0Var.a(((Integer) pair.first).intValue(), (CharSequence) pair.second, sparseArrayG);
                        }
                    }
                } else {
                    vr0Var = vr0Var3;
                }
                selectedTab = getSelectedTab();
                if (selectedTab >= 0) {
                    this.f29122g0[0].B = selectedTab;
                }
                this.M1 = vr0Var.f26522j0;
                vr0Var.c();
                L0();
                I();
            }
            i14++;
            z13 = z31;
            i15 = 14;
            zV0 = v0();
            qs0Var = this.T;
            z14 = z35;
            iArr = this.T0;
            if (zV0) {
                if (qs0Var.d == null) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                iArr2 = iArr;
                i25 = i14;
                if (z19 == vr0Var3.e(7)) {
                    i26 = i25 + 1;
                } else {
                    i26 = i25;
                }
                if (iArr2[0] <= 0) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                i27 = i26;
                if (z20 == vr0Var3.e(0)) {
                    i28 = i27 + 1;
                } else {
                    i28 = i27;
                }
                if (iArr2[1] <= 0) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                i29 = i28;
                if (z21 == vr0Var3.e(1)) {
                    i30 = i29 + 1;
                } else {
                    i30 = i29;
                }
                if (DialogObject.isEncryptedDialog(j10)) {
                    if (iArr2[3] <= 0) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    i40 = i30;
                    if (z27 == vr0Var3.e(3)) {
                        i41 = i40 + 1;
                    } else {
                        i41 = i40;
                    }
                    if (iArr2[c10] <= 0) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    i42 = i41;
                    if (z28 == vr0Var3.e(4)) {
                        i43 = i42 + 1;
                    } else {
                        i43 = i42;
                    }
                    if (iArr2[8] <= 0) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    i31 = i43;
                    if (z29 == vr0Var3.e(15)) {
                        i32 = i31 + 1;
                    } else {
                        i32 = i31;
                    }
                } else {
                    i31 = i30;
                    if (iArr2[4] <= 0) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    if (z22 == vr0Var3.e(4)) {
                        i32 = i31 + 1;
                    } else {
                        i32 = i31;
                    }
                }
                if (iArr2[2] <= 0) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                i33 = i32;
                if (z23 == vr0Var3.e(2)) {
                    i34 = i33 + 1;
                } else {
                    i34 = i33;
                }
                if (iArr2[5] <= 0) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                i35 = i34;
                if (z24 == vr0Var3.e(5)) {
                    i36 = i35 + 1;
                } else {
                    i36 = i35;
                }
                if (iArr2[6] <= 0) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                i37 = i36;
                if (z25 == vr0Var3.e(6)) {
                    i38 = i37 + 1;
                } else {
                    i38 = i37;
                }
                z26 = !this.M.d.isEmpty();
                i39 = i38;
                if (z26 != vr0Var3.e(10)) {
                    i14 = i39 + 1;
                } else {
                    i14 = i39;
                }
                if (l0()) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                z16 = z26;
                if (z15 != vr0Var3.e(11)) {
                    i14++;
                }
                if (z13 != vr0Var3.e(12)) {
                    i14++;
                }
            } else {
                iArr2 = iArr;
                z15 = false;
                z16 = false;
            }
            if (i14 > 0) {
                if (z11) {
                    TransitionSet transitionSet2 = new TransitionSet();
                    transitionSet2.setOrdering(0);
                    transitionSet2.addTransition(new ag.u0(3));
                    transitionSet2.setDuration(200L);
                    TransitionManager.beginDelayedTransition(vr0Var3.getTabsContainer(), transitionSet2);
                    vr0Var3.Q = vr0Var3.v;
                    vr0Var3.R = vr0Var3.f26526w;
                }
                sparseArrayG = vr0Var3.g();
                if (i14 > 3) {
                    sparseArrayG = null;
                }
                arrayList = new ArrayList();
                if (t0()) {
                    arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                    vr0Var3.U = 420L;
                }
                if (z36) {
                    arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                } else if (DialogObject.isUserDialog(j10)) {
                    if (q0()) {
                        arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                        vr0Var3.U = 420L;
                    } else {
                        arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                        if (v0()) {
                            arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                        }
                    }
                } else if (q0()) {
                    arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                    vr0Var3.U = 420L;
                } else {
                    arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                    if (v0()) {
                        arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                    }
                }
                if (z14) {
                    Integer numValueOf4 = Integer.valueOf(i15);
                    string2 = LocaleController.getString(R.string.ProfileGifts);
                    map = gh.d4.P;
                    m7Var = wq0Var2.d;
                    if (m7Var == null) {
                        wq0Var = wq0Var2;
                        num = 0;
                        vr0Var2 = vr0Var3;
                        z17 = z13;
                        str2 = string2;
                        charSequence = "";
                    } else {
                        z17 = z13;
                        arrayList2 = m7Var.f9753l;
                        str2 = string2;
                        num = 0;
                        vr0Var2 = vr0Var3;
                        pair2 = new Pair(Integer.valueOf(UserConfig.selectedAccount), Long.valueOf(wq0Var2.f7199c));
                        if (!arrayList2.isEmpty()) {
                            if (m7Var.f9750i) {
                            }
                            wq0Var = wq0Var2;
                        } else {
                            HashSet hashSet2 = new HashSet();
                            arrayList3 = new ArrayList();
                            i22 = 0;
                            while (true) {
                                wq0Var = wq0Var2;
                                if (arrayList3.size() >= 3) {
                                    break;
                                }
                                break;
                                break;
                                i22 = i24 + 1;
                                wq0Var2 = wq0Var;
                            }
                            if (arrayList3.isEmpty()) {
                                spannableStringBuilder = new SpannableStringBuilder(" ");
                                i23 = 0;
                                while (i23 < arrayList3.size()) {
                                    TLRPC.Document document3 = (TLRPC.Document) arrayList3.get(i23);
                                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(MessageObject.getEmoji(document3));
                                    spannableStringBuilder3.setSpan(new t5(document3, 0.9f, (Paint.FontMetricsInt) null), 0, spannableStringBuilder3.length(), 33);
                                    spannableStringBuilder.append((CharSequence) spannableStringBuilder3);
                                    i23++;
                                    arrayList3 = arrayList3;
                                }
                                c11 = 0;
                                map.put(pair2, spannableStringBuilder);
                                charSequence3 = spannableStringBuilder;
                            }
                            CharSequence[] charSequenceArr3 = new CharSequence[2];
                            charSequenceArr3[c11] = str2;
                            charSequenceArr3[1] = charSequence3;
                            arrayList.add(new Pair(numValueOf4, TextUtils.concat(charSequenceArr3)));
                            this.L1 = wq0Var.getLastEmojisHash();
                        }
                        charSequence = "";
                    }
                    c11 = 0;
                    charSequence3 = charSequence;
                    CharSequence[] charSequenceArr4 = new CharSequence[2];
                    charSequenceArr4[c11] = str2;
                    charSequenceArr4[1] = charSequence3;
                    arrayList.add(new Pair(numValueOf4, TextUtils.concat(charSequenceArr4)));
                    this.L1 = wq0Var.getLastEmojisHash();
                } else {
                    num = 0;
                    vr0Var2 = vr0Var3;
                    z17 = z13;
                }
                if (z32) {
                    arrayList.add(new Pair(13, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                }
                if (!v0()) {
                    if (z15) {
                        arrayList.add(new Pair(11, LocaleController.getString(R.string.SavedDialogsTab)));
                    }
                    if (qs0Var.d != null) {
                        arrayList.add(new Pair(7, LocaleController.getString(R.string.GroupMembers)));
                    }
                    if (iArr2[0] > 0) {
                        if (iArr2[1] != 0) {
                            arrayList.add(new Pair(num, LocaleController.getString(R.string.SharedMediaTab2)));
                        } else {
                            arrayList.add(new Pair(num, LocaleController.getString(R.string.SharedMediaTab2)));
                        }
                    }
                    if (z17) {
                        arrayList.add(new Pair(12, LocaleController.getString(R.string.SavedMessagesTab2)));
                        MessagesController.getGlobalMainSettings().edit().putInt("savedhint", 3).apply();
                    }
                    if (iArr2[1] > 0) {
                        arrayList.add(new Pair(1, LocaleController.getString(R.string.SharedFilesTab2)));
                    }
                    if (!DialogObject.isEncryptedDialog(j10)) {
                        if (iArr2[3] > 0) {
                            arrayList.add(new Pair(3, LocaleController.getString(R.string.SharedLinksTab2)));
                        }
                        if (iArr2[4] > 0) {
                            arrayList.add(new Pair(4, LocaleController.getString(R.string.SharedMusicTab2)));
                        }
                        if (iArr2[8] > 0) {
                            arrayList.add(new Pair(15, LocaleController.getString(R.string.SharedPollTab)));
                        }
                    } else if (iArr2[4] > 0) {
                        arrayList.add(new Pair(4, LocaleController.getString(R.string.SharedMusicTab2)));
                    }
                    if (iArr2[2] > 0) {
                        arrayList.add(new Pair(2, LocaleController.getString(R.string.SharedVoiceTab2)));
                    }
                    if (iArr2[5] > 0) {
                        arrayList.add(new Pair(5, LocaleController.getString(R.string.SharedGIFsTab2)));
                    }
                    if (iArr2[6] > 0) {
                        arrayList.add(new Pair(6, LocaleController.getString(R.string.SharedGroupsTab2)));
                    }
                    if (z16) {
                        if (j10 > 0) {
                            i21 = R.string.SimilarBotsTab;
                        } else {
                            i21 = R.string.SimilarChannelsTab;
                        }
                        arrayList.add(new Pair(10, LocaleController.getString(i21)));
                    }
                }
                vr0Var = vr0Var2;
                if (vr0Var.f26522j0) {
                    z18 = this.Z0 instanceof TLRPC.TL_channelFull;
                    while (i19 < 15) {
                        if (d0(i19, z18) != null) {
                            numValueOf = Integer.valueOf(i19);
                            i20 = 0;
                            while (true) {
                                if (i20 < arrayList.size()) {
                                    bool = Boolean.FALSE;
                                    break;
                                } else {
                                    if (((Pair) arrayList.get(i20)).first == numValueOf) {
                                        bool = Boolean.TRUE;
                                        break;
                                    }
                                    i20++;
                                }
                            }
                            if (!bool.booleanValue()) {
                                Integer numValueOf5 = Integer.valueOf(i19);
                                if (i19 != 0) {
                                    string = LocaleController.getString(R.string.SharedMediaTabFull2);
                                } else if (i19 != 1) {
                                    string = LocaleController.getString(R.string.SharedFilesTab2);
                                } else if (i19 != 2) {
                                    string = LocaleController.getString(R.string.SharedVoiceTab2);
                                } else if (i19 != 3) {
                                    string = LocaleController.getString(R.string.SharedLinksTab2);
                                } else if (i19 != 4) {
                                    string = LocaleController.getString(R.string.SharedMusicTab2);
                                } else if (i19 != 5) {
                                    string = LocaleController.getString(R.string.SharedGIFsTab2);
                                } else if (i19 != 8) {
                                    if (i19 != 14) {
                                        str = null;
                                    } else {
                                        string = LocaleController.getString(R.string.ProfileGifts);
                                    }
                                    arrayList.add(new Pair(numValueOf5, str));
                                } else {
                                    string = LocaleController.getString(R.string.ProfileStories);
                                }
                                str = string;
                                arrayList.add(new Pair(numValueOf5, str));
                            }
                        }
                    }
                }
                if (profileTab != null) {
                    iE0 = e0(profileTab);
                    i18 = 0;
                    while (true) {
                        if (i18 < arrayList.size()) {
                            i18 = -1;
                            break;
                        } else {
                            if (((Integer) ((Pair) arrayList.get(i18)).first).intValue() == iE0) {
                                break;
                                break;
                            }
                            i18++;
                        }
                    }
                    if (i18 >= 0) {
                        i16 = 0;
                        arrayList.add(0, (Pair) arrayList.remove(i18));
                    } else {
                        i16 = 0;
                    }
                } else {
                    i16 = 0;
                }
                if (!arrayList.isEmpty()) {
                    this.N1 = ((Integer) ((Pair) arrayList.get(i16)).first).intValue();
                }
                size = arrayList.size();
                i17 = 0;
                while (i17 < size) {
                    Object obj2 = arrayList.get(i17);
                    i17++;
                    pair = (Pair) obj2;
                    if (!vr0Var.e(((Integer) pair.first).intValue())) {
                        vr0Var.a(((Integer) pair.first).intValue(), (CharSequence) pair.second, sparseArrayG);
                    }
                }
            } else {
                vr0Var = vr0Var3;
            }
            selectedTab = getSelectedTab();
            if (selectedTab >= 0) {
                this.f29122g0[0].B = selectedTab;
            }
            this.M1 = vr0Var.f26522j0;
            vr0Var.c();
            L0();
            I();
        }
        profileTab2 = chatFull4.main_tab;
        profileTab = profileTab2;
        z11 = z30;
        if (this.M1 != vr0Var3.f26522j0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (z34) {
            z12 = true;
        } else {
            z12 = true;
        }
        i11 = i10;
        if (z12 != vr0Var3.e(8)) {
            i12 = i11 + 1;
        } else {
            i12 = i11;
        }
        if (z32 != vr0Var3.e(13)) {
            i12++;
        }
        i13 = i12;
        if (t0() != vr0Var3.e(8)) {
            i14 = i13 + 1;
        } else {
            i14 = i13;
        }
        if (z35 != vr0Var3.e(14)) {
            if (wq0Var2 == null) {
            }
            zV0 = v0();
            qs0Var = this.T;
            z14 = z35;
            iArr = this.T0;
            if (zV0) {
                if (qs0Var.d == null) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                iArr2 = iArr;
                i25 = i14;
                if (z19 == vr0Var3.e(7)) {
                    i26 = i25 + 1;
                } else {
                    i26 = i25;
                }
                if (iArr2[0] <= 0) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                i27 = i26;
                if (z20 == vr0Var3.e(0)) {
                    i28 = i27 + 1;
                } else {
                    i28 = i27;
                }
                if (iArr2[1] <= 0) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                i29 = i28;
                if (z21 == vr0Var3.e(1)) {
                    i30 = i29 + 1;
                } else {
                    i30 = i29;
                }
                if (DialogObject.isEncryptedDialog(j10)) {
                    if (iArr2[3] <= 0) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    i40 = i30;
                    if (z27 == vr0Var3.e(3)) {
                        i41 = i40 + 1;
                    } else {
                        i41 = i40;
                    }
                    if (iArr2[c10] <= 0) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    i42 = i41;
                    if (z28 == vr0Var3.e(4)) {
                        i43 = i42 + 1;
                    } else {
                        i43 = i42;
                    }
                    if (iArr2[8] <= 0) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    i31 = i43;
                    if (z29 == vr0Var3.e(15)) {
                        i32 = i31 + 1;
                    } else {
                        i32 = i31;
                    }
                } else {
                    i31 = i30;
                    if (iArr2[4] <= 0) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    if (z22 == vr0Var3.e(4)) {
                        i32 = i31 + 1;
                    } else {
                        i32 = i31;
                    }
                }
                if (iArr2[2] <= 0) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                i33 = i32;
                if (z23 == vr0Var3.e(2)) {
                    i34 = i33 + 1;
                } else {
                    i34 = i33;
                }
                if (iArr2[5] <= 0) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                i35 = i34;
                if (z24 == vr0Var3.e(5)) {
                    i36 = i35 + 1;
                } else {
                    i36 = i35;
                }
                if (iArr2[6] <= 0) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                i37 = i36;
                if (z25 == vr0Var3.e(6)) {
                    i38 = i37 + 1;
                } else {
                    i38 = i37;
                }
                z26 = !this.M.d.isEmpty();
                i39 = i38;
                if (z26 != vr0Var3.e(10)) {
                    i14 = i39 + 1;
                } else {
                    i14 = i39;
                }
                if (l0()) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                z16 = z26;
                if (z15 != vr0Var3.e(11)) {
                    i14++;
                }
                if (z13 != vr0Var3.e(12)) {
                    i14++;
                }
            } else {
                iArr2 = iArr;
                z15 = false;
                z16 = false;
            }
            if (i14 > 0) {
                if (z11) {
                    TransitionSet transitionSet3 = new TransitionSet();
                    transitionSet3.setOrdering(0);
                    transitionSet3.addTransition(new ag.u0(3));
                    transitionSet3.setDuration(200L);
                    TransitionManager.beginDelayedTransition(vr0Var3.getTabsContainer(), transitionSet3);
                    vr0Var3.Q = vr0Var3.v;
                    vr0Var3.R = vr0Var3.f26526w;
                }
                sparseArrayG = vr0Var3.g();
                if (i14 > 3) {
                    sparseArrayG = null;
                }
                arrayList = new ArrayList();
                if (t0()) {
                    arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                    vr0Var3.U = 420L;
                }
                if (z36) {
                    arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                } else if (DialogObject.isUserDialog(j10)) {
                    if (q0()) {
                        arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                        vr0Var3.U = 420L;
                    } else {
                        arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                        if (v0()) {
                            arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                        }
                    }
                } else if (q0()) {
                    arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                    vr0Var3.U = 420L;
                } else {
                    arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                    if (v0()) {
                        arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                    }
                }
                if (z14) {
                    Integer numValueOf6 = Integer.valueOf(i15);
                    string2 = LocaleController.getString(R.string.ProfileGifts);
                    map = gh.d4.P;
                    m7Var = wq0Var2.d;
                    if (m7Var == null) {
                        wq0Var = wq0Var2;
                        num = 0;
                        vr0Var2 = vr0Var3;
                        z17 = z13;
                        str2 = string2;
                        charSequence = "";
                    } else {
                        z17 = z13;
                        arrayList2 = m7Var.f9753l;
                        str2 = string2;
                        num = 0;
                        vr0Var2 = vr0Var3;
                        pair2 = new Pair(Integer.valueOf(UserConfig.selectedAccount), Long.valueOf(wq0Var2.f7199c));
                        if (!arrayList2.isEmpty()) {
                            if (m7Var.f9750i) {
                            }
                            wq0Var = wq0Var2;
                        } else {
                            HashSet hashSet3 = new HashSet();
                            arrayList3 = new ArrayList();
                            i22 = 0;
                            while (true) {
                                wq0Var = wq0Var2;
                                if (arrayList3.size() >= 3) {
                                    break;
                                    break;
                                } else {
                                    break;
                                    break;
                                }
                                i22 = i24 + 1;
                                wq0Var2 = wq0Var;
                            }
                            if (arrayList3.isEmpty()) {
                                spannableStringBuilder = new SpannableStringBuilder(" ");
                                i23 = 0;
                                while (i23 < arrayList3.size()) {
                                    TLRPC.Document document4 = (TLRPC.Document) arrayList3.get(i23);
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(MessageObject.getEmoji(document4));
                                    spannableStringBuilder4.setSpan(new t5(document4, 0.9f, (Paint.FontMetricsInt) null), 0, spannableStringBuilder4.length(), 33);
                                    spannableStringBuilder.append((CharSequence) spannableStringBuilder4);
                                    i23++;
                                    arrayList3 = arrayList3;
                                }
                                c11 = 0;
                                map.put(pair2, spannableStringBuilder);
                                charSequence3 = spannableStringBuilder;
                            }
                            CharSequence[] charSequenceArr5 = new CharSequence[2];
                            charSequenceArr5[c11] = str2;
                            charSequenceArr5[1] = charSequence3;
                            arrayList.add(new Pair(numValueOf6, TextUtils.concat(charSequenceArr5)));
                            this.L1 = wq0Var.getLastEmojisHash();
                        }
                        charSequence = "";
                    }
                    c11 = 0;
                    charSequence3 = charSequence;
                    CharSequence[] charSequenceArr6 = new CharSequence[2];
                    charSequenceArr6[c11] = str2;
                    charSequenceArr6[1] = charSequence3;
                    arrayList.add(new Pair(numValueOf6, TextUtils.concat(charSequenceArr6)));
                    this.L1 = wq0Var.getLastEmojisHash();
                } else {
                    num = 0;
                    vr0Var2 = vr0Var3;
                    z17 = z13;
                }
                if (z32) {
                    arrayList.add(new Pair(13, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                }
                if (!v0()) {
                    if (z15) {
                        arrayList.add(new Pair(11, LocaleController.getString(R.string.SavedDialogsTab)));
                    }
                    if (qs0Var.d != null) {
                        arrayList.add(new Pair(7, LocaleController.getString(R.string.GroupMembers)));
                    }
                    if (iArr2[0] > 0) {
                        if (iArr2[1] != 0) {
                            arrayList.add(new Pair(num, LocaleController.getString(R.string.SharedMediaTab2)));
                        } else {
                            arrayList.add(new Pair(num, LocaleController.getString(R.string.SharedMediaTab2)));
                        }
                    }
                    if (z17) {
                        arrayList.add(new Pair(12, LocaleController.getString(R.string.SavedMessagesTab2)));
                        MessagesController.getGlobalMainSettings().edit().putInt("savedhint", 3).apply();
                    }
                    if (iArr2[1] > 0) {
                        arrayList.add(new Pair(1, LocaleController.getString(R.string.SharedFilesTab2)));
                    }
                    if (!DialogObject.isEncryptedDialog(j10)) {
                        if (iArr2[3] > 0) {
                            arrayList.add(new Pair(3, LocaleController.getString(R.string.SharedLinksTab2)));
                        }
                        if (iArr2[4] > 0) {
                            arrayList.add(new Pair(4, LocaleController.getString(R.string.SharedMusicTab2)));
                        }
                        if (iArr2[8] > 0) {
                            arrayList.add(new Pair(15, LocaleController.getString(R.string.SharedPollTab)));
                        }
                    } else if (iArr2[4] > 0) {
                        arrayList.add(new Pair(4, LocaleController.getString(R.string.SharedMusicTab2)));
                    }
                    if (iArr2[2] > 0) {
                        arrayList.add(new Pair(2, LocaleController.getString(R.string.SharedVoiceTab2)));
                    }
                    if (iArr2[5] > 0) {
                        arrayList.add(new Pair(5, LocaleController.getString(R.string.SharedGIFsTab2)));
                    }
                    if (iArr2[6] > 0) {
                        arrayList.add(new Pair(6, LocaleController.getString(R.string.SharedGroupsTab2)));
                    }
                    if (z16) {
                        if (j10 > 0) {
                            i21 = R.string.SimilarBotsTab;
                        } else {
                            i21 = R.string.SimilarChannelsTab;
                        }
                        arrayList.add(new Pair(10, LocaleController.getString(i21)));
                    }
                }
                vr0Var = vr0Var2;
                if (vr0Var.f26522j0) {
                    z18 = this.Z0 instanceof TLRPC.TL_channelFull;
                    while (i19 < 15) {
                        if (d0(i19, z18) != null) {
                            numValueOf = Integer.valueOf(i19);
                            i20 = 0;
                            while (true) {
                                if (i20 < arrayList.size()) {
                                    bool = Boolean.FALSE;
                                    break;
                                } else {
                                    if (((Pair) arrayList.get(i20)).first == numValueOf) {
                                        bool = Boolean.TRUE;
                                        break;
                                    }
                                    i20++;
                                }
                            }
                            if (!bool.booleanValue()) {
                                Integer numValueOf7 = Integer.valueOf(i19);
                                if (i19 != 0) {
                                    string = LocaleController.getString(R.string.SharedMediaTabFull2);
                                } else if (i19 != 1) {
                                    string = LocaleController.getString(R.string.SharedFilesTab2);
                                } else if (i19 != 2) {
                                    string = LocaleController.getString(R.string.SharedVoiceTab2);
                                } else if (i19 != 3) {
                                    string = LocaleController.getString(R.string.SharedLinksTab2);
                                } else if (i19 != 4) {
                                    string = LocaleController.getString(R.string.SharedMusicTab2);
                                } else if (i19 != 5) {
                                    string = LocaleController.getString(R.string.SharedGIFsTab2);
                                } else if (i19 != 8) {
                                    if (i19 != 14) {
                                        str = null;
                                    } else {
                                        string = LocaleController.getString(R.string.ProfileGifts);
                                    }
                                    arrayList.add(new Pair(numValueOf7, str));
                                } else {
                                    string = LocaleController.getString(R.string.ProfileStories);
                                }
                                str = string;
                                arrayList.add(new Pair(numValueOf7, str));
                            }
                        }
                    }
                }
                if (profileTab != null) {
                    iE0 = e0(profileTab);
                    i18 = 0;
                    while (true) {
                        if (i18 < arrayList.size()) {
                            i18 = -1;
                            break;
                        } else {
                            if (((Integer) ((Pair) arrayList.get(i18)).first).intValue() == iE0) {
                                break;
                                break;
                            }
                            i18++;
                        }
                    }
                    if (i18 >= 0) {
                        i16 = 0;
                        arrayList.add(0, (Pair) arrayList.remove(i18));
                    } else {
                        i16 = 0;
                    }
                } else {
                    i16 = 0;
                }
                if (!arrayList.isEmpty()) {
                    this.N1 = ((Integer) ((Pair) arrayList.get(i16)).first).intValue();
                }
                size = arrayList.size();
                i17 = 0;
                while (i17 < size) {
                    Object obj3 = arrayList.get(i17);
                    i17++;
                    pair = (Pair) obj3;
                    if (!vr0Var.e(((Integer) pair.first).intValue())) {
                        vr0Var.a(((Integer) pair.first).intValue(), (CharSequence) pair.second, sparseArrayG);
                    }
                }
            } else {
                vr0Var = vr0Var3;
            }
            selectedTab = getSelectedTab();
            if (selectedTab >= 0) {
                this.f29122g0[0].B = selectedTab;
            }
            this.M1 = vr0Var.f26522j0;
            vr0Var.c();
            L0();
            I();
        }
        i14++;
        z13 = z31;
        i15 = 14;
        zV0 = v0();
        qs0Var = this.T;
        z14 = z35;
        iArr = this.T0;
        if (zV0) {
            if (qs0Var.d == null) {
                z19 = true;
            } else {
                z19 = false;
            }
            iArr2 = iArr;
            i25 = i14;
            if (z19 == vr0Var3.e(7)) {
                i26 = i25 + 1;
            } else {
                i26 = i25;
            }
            if (iArr2[0] <= 0) {
                z20 = true;
            } else {
                z20 = false;
            }
            i27 = i26;
            if (z20 == vr0Var3.e(0)) {
                i28 = i27 + 1;
            } else {
                i28 = i27;
            }
            if (iArr2[1] <= 0) {
                z21 = true;
            } else {
                z21 = false;
            }
            i29 = i28;
            if (z21 == vr0Var3.e(1)) {
                i30 = i29 + 1;
            } else {
                i30 = i29;
            }
            if (DialogObject.isEncryptedDialog(j10)) {
                if (iArr2[3] <= 0) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                i40 = i30;
                if (z27 == vr0Var3.e(3)) {
                    i41 = i40 + 1;
                } else {
                    i41 = i40;
                }
                if (iArr2[c10] <= 0) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                i42 = i41;
                if (z28 == vr0Var3.e(4)) {
                    i43 = i42 + 1;
                } else {
                    i43 = i42;
                }
                if (iArr2[8] <= 0) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                i31 = i43;
                if (z29 == vr0Var3.e(15)) {
                    i32 = i31 + 1;
                } else {
                    i32 = i31;
                }
            } else {
                i31 = i30;
                if (iArr2[4] <= 0) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                if (z22 == vr0Var3.e(4)) {
                    i32 = i31 + 1;
                } else {
                    i32 = i31;
                }
            }
            if (iArr2[2] <= 0) {
                z23 = true;
            } else {
                z23 = false;
            }
            i33 = i32;
            if (z23 == vr0Var3.e(2)) {
                i34 = i33 + 1;
            } else {
                i34 = i33;
            }
            if (iArr2[5] <= 0) {
                z24 = true;
            } else {
                z24 = false;
            }
            i35 = i34;
            if (z24 == vr0Var3.e(5)) {
                i36 = i35 + 1;
            } else {
                i36 = i35;
            }
            if (iArr2[6] <= 0) {
                z25 = true;
            } else {
                z25 = false;
            }
            i37 = i36;
            if (z25 == vr0Var3.e(6)) {
                i38 = i37 + 1;
            } else {
                i38 = i37;
            }
            z26 = !this.M.d.isEmpty();
            i39 = i38;
            if (z26 != vr0Var3.e(10)) {
                i14 = i39 + 1;
            } else {
                i14 = i39;
            }
            if (l0()) {
                z15 = false;
            } else {
                z15 = false;
            }
            z16 = z26;
            if (z15 != vr0Var3.e(11)) {
                i14++;
            }
            if (z13 != vr0Var3.e(12)) {
                i14++;
            }
        } else {
            iArr2 = iArr;
            z15 = false;
            z16 = false;
        }
        if (i14 > 0) {
            if (z11) {
                TransitionSet transitionSet4 = new TransitionSet();
                transitionSet4.setOrdering(0);
                transitionSet4.addTransition(new ag.u0(3));
                transitionSet4.setDuration(200L);
                TransitionManager.beginDelayedTransition(vr0Var3.getTabsContainer(), transitionSet4);
                vr0Var3.Q = vr0Var3.v;
                vr0Var3.R = vr0Var3.f26526w;
            }
            sparseArrayG = vr0Var3.g();
            if (i14 > 3) {
                sparseArrayG = null;
            }
            arrayList = new ArrayList();
            if (t0()) {
                arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                vr0Var3.U = 420L;
            }
            if (z36) {
                arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileBotPreviewTab)));
            } else if (DialogObject.isUserDialog(j10)) {
                if (q0()) {
                    arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                    vr0Var3.U = 420L;
                } else {
                    arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                    if (v0()) {
                        arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                    }
                }
            } else if (q0()) {
                arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                vr0Var3.U = 420L;
            } else {
                arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                if (v0()) {
                    arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                }
            }
            if (z14) {
                Integer numValueOf8 = Integer.valueOf(i15);
                string2 = LocaleController.getString(R.string.ProfileGifts);
                map = gh.d4.P;
                m7Var = wq0Var2.d;
                if (m7Var == null) {
                    wq0Var = wq0Var2;
                    num = 0;
                    vr0Var2 = vr0Var3;
                    z17 = z13;
                    str2 = string2;
                    charSequence = "";
                } else {
                    z17 = z13;
                    arrayList2 = m7Var.f9753l;
                    str2 = string2;
                    num = 0;
                    vr0Var2 = vr0Var3;
                    pair2 = new Pair(Integer.valueOf(UserConfig.selectedAccount), Long.valueOf(wq0Var2.f7199c));
                    if (!arrayList2.isEmpty()) {
                        if (m7Var.f9750i) {
                        }
                        wq0Var = wq0Var2;
                    } else {
                        HashSet hashSet4 = new HashSet();
                        arrayList3 = new ArrayList();
                        i22 = 0;
                        while (true) {
                            wq0Var = wq0Var2;
                            if (arrayList3.size() >= 3) {
                                break;
                                break;
                            } else {
                                break;
                                break;
                            }
                            i22 = i24 + 1;
                            wq0Var2 = wq0Var;
                        }
                        if (arrayList3.isEmpty()) {
                            spannableStringBuilder = new SpannableStringBuilder(" ");
                            i23 = 0;
                            while (i23 < arrayList3.size()) {
                                TLRPC.Document document5 = (TLRPC.Document) arrayList3.get(i23);
                                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(MessageObject.getEmoji(document5));
                                spannableStringBuilder5.setSpan(new t5(document5, 0.9f, (Paint.FontMetricsInt) null), 0, spannableStringBuilder5.length(), 33);
                                spannableStringBuilder.append((CharSequence) spannableStringBuilder5);
                                i23++;
                                arrayList3 = arrayList3;
                            }
                            c11 = 0;
                            map.put(pair2, spannableStringBuilder);
                            charSequence3 = spannableStringBuilder;
                        }
                        CharSequence[] charSequenceArr7 = new CharSequence[2];
                        charSequenceArr7[c11] = str2;
                        charSequenceArr7[1] = charSequence3;
                        arrayList.add(new Pair(numValueOf8, TextUtils.concat(charSequenceArr7)));
                        this.L1 = wq0Var.getLastEmojisHash();
                    }
                    charSequence = "";
                }
                c11 = 0;
                charSequence3 = charSequence;
                CharSequence[] charSequenceArr8 = new CharSequence[2];
                charSequenceArr8[c11] = str2;
                charSequenceArr8[1] = charSequence3;
                arrayList.add(new Pair(numValueOf8, TextUtils.concat(charSequenceArr8)));
                this.L1 = wq0Var.getLastEmojisHash();
            } else {
                num = 0;
                vr0Var2 = vr0Var3;
                z17 = z13;
            }
            if (z32) {
                arrayList.add(new Pair(13, LocaleController.getString(R.string.ProfileBotPreviewTab)));
            }
            if (!v0()) {
                if (z15) {
                    arrayList.add(new Pair(11, LocaleController.getString(R.string.SavedDialogsTab)));
                }
                if (qs0Var.d != null) {
                    arrayList.add(new Pair(7, LocaleController.getString(R.string.GroupMembers)));
                }
                if (iArr2[0] > 0) {
                    if (iArr2[1] != 0) {
                        arrayList.add(new Pair(num, LocaleController.getString(R.string.SharedMediaTab2)));
                    } else {
                        arrayList.add(new Pair(num, LocaleController.getString(R.string.SharedMediaTab2)));
                    }
                }
                if (z17) {
                    arrayList.add(new Pair(12, LocaleController.getString(R.string.SavedMessagesTab2)));
                    MessagesController.getGlobalMainSettings().edit().putInt("savedhint", 3).apply();
                }
                if (iArr2[1] > 0) {
                    arrayList.add(new Pair(1, LocaleController.getString(R.string.SharedFilesTab2)));
                }
                if (!DialogObject.isEncryptedDialog(j10)) {
                    if (iArr2[3] > 0) {
                        arrayList.add(new Pair(3, LocaleController.getString(R.string.SharedLinksTab2)));
                    }
                    if (iArr2[4] > 0) {
                        arrayList.add(new Pair(4, LocaleController.getString(R.string.SharedMusicTab2)));
                    }
                    if (iArr2[8] > 0) {
                        arrayList.add(new Pair(15, LocaleController.getString(R.string.SharedPollTab)));
                    }
                } else if (iArr2[4] > 0) {
                    arrayList.add(new Pair(4, LocaleController.getString(R.string.SharedMusicTab2)));
                }
                if (iArr2[2] > 0) {
                    arrayList.add(new Pair(2, LocaleController.getString(R.string.SharedVoiceTab2)));
                }
                if (iArr2[5] > 0) {
                    arrayList.add(new Pair(5, LocaleController.getString(R.string.SharedGIFsTab2)));
                }
                if (iArr2[6] > 0) {
                    arrayList.add(new Pair(6, LocaleController.getString(R.string.SharedGroupsTab2)));
                }
                if (z16) {
                    if (j10 > 0) {
                        i21 = R.string.SimilarBotsTab;
                    } else {
                        i21 = R.string.SimilarChannelsTab;
                    }
                    arrayList.add(new Pair(10, LocaleController.getString(i21)));
                }
            }
            vr0Var = vr0Var2;
            if (vr0Var.f26522j0) {
                z18 = this.Z0 instanceof TLRPC.TL_channelFull;
                while (i19 < 15) {
                    if (d0(i19, z18) != null) {
                        numValueOf = Integer.valueOf(i19);
                        i20 = 0;
                        while (true) {
                            if (i20 < arrayList.size()) {
                                bool = Boolean.FALSE;
                                break;
                            } else {
                                if (((Pair) arrayList.get(i20)).first == numValueOf) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                i20++;
                            }
                        }
                        if (!bool.booleanValue()) {
                            Integer numValueOf9 = Integer.valueOf(i19);
                            if (i19 != 0) {
                                string = LocaleController.getString(R.string.SharedMediaTabFull2);
                            } else if (i19 != 1) {
                                string = LocaleController.getString(R.string.SharedFilesTab2);
                            } else if (i19 != 2) {
                                string = LocaleController.getString(R.string.SharedVoiceTab2);
                            } else if (i19 != 3) {
                                string = LocaleController.getString(R.string.SharedLinksTab2);
                            } else if (i19 != 4) {
                                string = LocaleController.getString(R.string.SharedMusicTab2);
                            } else if (i19 != 5) {
                                string = LocaleController.getString(R.string.SharedGIFsTab2);
                            } else if (i19 != 8) {
                                if (i19 != 14) {
                                    str = null;
                                } else {
                                    string = LocaleController.getString(R.string.ProfileGifts);
                                }
                                arrayList.add(new Pair(numValueOf9, str));
                            } else {
                                string = LocaleController.getString(R.string.ProfileStories);
                            }
                            str = string;
                            arrayList.add(new Pair(numValueOf9, str));
                        }
                    }
                }
            }
            if (profileTab != null) {
                iE0 = e0(profileTab);
                i18 = 0;
                while (true) {
                    if (i18 < arrayList.size()) {
                        i18 = -1;
                        break;
                    } else {
                        if (((Integer) ((Pair) arrayList.get(i18)).first).intValue() == iE0) {
                            break;
                            break;
                        }
                        i18++;
                    }
                }
                if (i18 >= 0) {
                    i16 = 0;
                    arrayList.add(0, (Pair) arrayList.remove(i18));
                } else {
                    i16 = 0;
                }
            } else {
                i16 = 0;
            }
            if (!arrayList.isEmpty()) {
                this.N1 = ((Integer) ((Pair) arrayList.get(i16)).first).intValue();
            }
            size = arrayList.size();
            i17 = 0;
            while (i17 < size) {
                Object obj4 = arrayList.get(i17);
                i17++;
                pair = (Pair) obj4;
                if (!vr0Var.e(((Integer) pair.first).intValue())) {
                    vr0Var.a(((Integer) pair.first).intValue(), (CharSequence) pair.second, sparseArrayG);
                }
            }
        } else {
            vr0Var = vr0Var3;
        }
        selectedTab = getSelectedTab();
        if (selectedTab >= 0) {
            this.f29122g0[0].B = selectedTab;
        }
        this.M1 = vr0Var.f26522j0;
        vr0Var.c();
        L0();
        I();
    }

    public final SpannableStringBuilder w() {
        if (this.S1 == null) {
            this.S1 = new SpannableStringBuilder();
            if (r0()) {
                this.S1.append((CharSequence) LocaleController.getString(R.string.ProfileBotPreviewEmptyButton));
            } else {
                this.S1.append((CharSequence) "c");
                this.S1.setSpan(new cq(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.S1.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
            }
        }
        return this.S1;
    }

    public final Boolean w1(View view, View view2) {
        if (this.f29131k1) {
            return null;
        }
        zs0[] zs0VarArr = this.f29122g0;
        zs0 zs0Var = zs0VarArr[0];
        if (zs0Var == null) {
            return null;
        }
        int i10 = zs0Var.B;
        this.l1 = i10;
        boolean zP0 = p0(i10);
        int[] iArr = this.f29127i1;
        int iX = X(zP0 ? 1 : 0, iArr[zP0 ? 1 : 0], true);
        if (view != null && iX == X(zP0 ? 1 : 0, iX, true)) {
            view.setEnabled(false);
            view.animate().alpha(0.5f).start();
        }
        if (iArr[zP0 ? 1 : 0] != iX) {
            if (view2 != null && !view2.isEnabled()) {
                view2.setEnabled(true);
                view2.animate().alpha(1.0f).start();
            }
            if (!zP0) {
                SharedConfig.setMediaColumnsCount(iX);
            } else if (c0(zs0VarArr[0].B) >= 5 || w0(zs0VarArr[0].B)) {
                SharedConfig.setStoriesColumnsCount(iX);
            }
            B(iX);
        }
        return Boolean.valueOf(iX != X(zP0 ? 1 : 0, iX, true));
    }

    public final void x(b70 b70Var, org.telegram.ui.ActionBar.n2 n2Var, long j10, int i10) {
        String publicUsername = j10 > 0 ? UserObject.getPublicUsername(MessagesController.getInstance(n2Var.getCurrentAccount()).getUser(Long.valueOf(j10))) : ChatObject.getPublicUsername(MessagesController.getInstance(n2Var.getCurrentAccount()).getChat(Long.valueOf(-j10)));
        if (publicUsername == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        i0.a.z(sb2, MessagesController.getInstance(n2Var.getCurrentAccount()).linkPrefix, "/", publicUsername, "/a/");
        sb2.append(i10);
        b70Var.c(R.drawable.media_share, LocaleController.getString(R.string.StoriesAlbumMenuShareLink), new org.telegram.ui.ActionBar.i3((KeyEvent.Callback) this, (Object) sb2.toString(), n2Var, 29), false);
    }

    public final boolean x0() {
        if (C() && ((getClosestTab() == 8 || getClosestTab() == 13 || w0(getClosestTab())) && this.f29163y1)) {
            return false;
        }
        wq0 wq0Var = this.R;
        if (wq0Var != null && wq0Var.g()) {
            return false;
        }
        ar0 ar0Var = this.S;
        return ((ar0Var != null && ar0Var.f44658w) || this.f29131k1 || this.f29113c1) ? false : true;
    }

    public final Boolean x1(View view, View view2) {
        if (this.f29131k1) {
            return null;
        }
        zs0[] zs0VarArr = this.f29122g0;
        zs0 zs0Var = zs0VarArr[0];
        if (zs0Var == null) {
            return null;
        }
        if (this.f29123g1 && p0(zs0Var.B)) {
            return null;
        }
        int i10 = zs0VarArr[0].B;
        this.l1 = i10;
        boolean zP0 = p0(i10);
        int[] iArr = this.f29127i1;
        int iX = X(zP0 ? 1 : 0, iArr[zP0 ? 1 : 0], false);
        if (view2 != null && iX == X(zP0 ? 1 : 0, iX, false)) {
            view2.setEnabled(false);
            view2.animate().alpha(0.5f).start();
        }
        if (iArr[zP0 ? 1 : 0] != iX) {
            if (view != null && !view.isEnabled()) {
                view.setEnabled(true);
                view.animate().alpha(1.0f).start();
            }
            if (!zP0) {
                SharedConfig.setMediaColumnsCount(iX);
            } else if (c0(zs0VarArr[0].B) >= 5 || w0(zs0VarArr[0].B)) {
                SharedConfig.setStoriesColumnsCount(iX);
            }
            B(iX);
        }
        return Boolean.valueOf(iX != X(zP0 ? 1 : 0, iX, false));
    }

    public final void y(b70 b70Var) {
        zs0 zs0Var;
        int iX = b70Var.x();
        final int i10 = 0;
        b70Var.c(R.drawable.msg_zoomin, LocaleController.getString(R.string.MediaZoomIn), new Runnable(this) {

            public final hu0 f30736b;

            {
                this.f30736b = this;
            }

            @Override
            public final void run() {
                switch (i10) {
                    case 0:
                        hu0 hu0Var = this.f30736b;
                        hu0Var.getClass();
                        View[] viewArr = viewArr;
                        hu0Var.w1(viewArr[0], viewArr[1]);
                        break;
                    default:
                        hu0 hu0Var2 = this.f30736b;
                        hu0Var2.getClass();
                        View[] viewArr2 = viewArr;
                        hu0Var2.x1(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, false);
        final int i11 = 1;
        b70Var.c(R.drawable.msg_zoomout, LocaleController.getString(R.string.MediaZoomOut), new Runnable(this) {

            public final hu0 f30736b;

            {
                this.f30736b = this;
            }

            @Override
            public final void run() {
                switch (i11) {
                    case 0:
                        hu0 hu0Var = this.f30736b;
                        hu0Var.getClass();
                        View[] viewArr = viewArr;
                        hu0Var.w1(viewArr[0], viewArr[1]);
                        break;
                    default:
                        hu0 hu0Var2 = this.f30736b;
                        hu0Var2.getClass();
                        View[] viewArr2 = viewArr;
                        hu0Var2.x1(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, false);
        final View[] viewArr = {b70Var.w(iX), b70Var.w(iX + 1)};
        zs0[] zs0VarArr = this.f29122g0;
        if (zs0VarArr == null || (zs0Var = zs0VarArr[0]) == null) {
            viewArr[0].setEnabled(false);
            viewArr[0].setAlpha(0.5f);
        } else {
            boolean zP0 = p0(zs0Var.B);
            int i12 = this.f29127i1[zP0 ? 1 : 0];
            if (i12 == X(zP0 ? 1 : 0, i12, true)) {
                viewArr[0].setEnabled(false);
                viewArr[0].setAlpha(0.5f);
            }
        }
        if (E()) {
            return;
        }
        viewArr[1].setEnabled(false);
        viewArr[1].setAlpha(0.5f);
    }

    public final void y0(int i10, int i11, int i12, boolean z10) {
        wt0[] wt0VarArr = this.f29140p1;
        wt0VarArr[i10].f34325a.clear();
        wt0VarArr[i10].f34326b[0].clear();
        wt0VarArr[i10].f34326b[1].clear();
        wt0 wt0Var = wt0VarArr[i10];
        wt0Var.f34332j[0] = i11;
        wt0Var.f34331i[0] = false;
        wt0Var.f34334l = false;
        wt0Var.f34335m = i12;
        wt0Var.f34336n = (wt0Var.e() - i12) - 1;
        wt0 wt0Var2 = wt0VarArr[i10];
        if (wt0Var2.f34336n < 0) {
            wt0Var2.f34336n = 0;
        }
        wt0Var2.f34333k = i11;
        wt0Var2.f34337o = true;
        wt0Var2.f34330g = false;
        wt0Var2.f34338p++;
        zs0 zs0VarW = W(i10);
        if (zs0VarW != null && zs0VarW.h.getAdapter() != null) {
            zs0VarW.h.getAdapter().l();
        }
        if (!z10) {
            return;
        }
        int i13 = 0;
        while (true) {
            zs0[] zs0VarArr = this.f29122g0;
            if (i13 >= zs0VarArr.length) {
                return;
            }
            zs0 zs0Var = zs0VarArr[i13];
            if (zs0Var.B == i10) {
                zs0Var.f35343x.h1(Math.min(wt0VarArr[i10].e() - 1, wt0VarArr[i10].f34335m), 0);
            }
            i13++;
        }
    }

    public final void z(ys0 ys0Var, int i10, SparseBooleanArray sparseBooleanArray) {
        int childCount = ys0Var.getChildCount();
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = ys0Var.getChildAt(i11);
            if (childAt instanceof h00) {
                view = childAt;
            }
        }
        if (view != null) {
            ys0Var.removeView(view);
        }
        getViewTreeObserver().addOnPreDrawListener(new as0(this, ys0Var, sparseBooleanArray, (h00) view, i10));
    }

    public final void z0(boolean z10) {
        long j10 = this.B;
        if (j10 != 0 || t0()) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            final int i11 = Z1[i10];
            wt0[] wt0VarArr = this.f29140p1;
            if (wt0VarArr[i11].h && !z10) {
                return;
            }
            long j11 = this.f29121f1;
            if (DialogObject.isEncryptedDialog(j11)) {
                return;
            }
            wt0VarArr[i11].h = false;
            TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
            if (i11 == 0) {
                int i12 = wt0VarArr[i11].f34339q;
                if (i12 == 1) {
                    tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotos();
                } else if (i12 == 2) {
                    tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterVideo();
                } else {
                    tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
                }
            } else if (i11 == 1) {
                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterDocument();
            } else if (i11 == 2) {
                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterRoundVoice();
            } else {
                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterMusic();
            }
            tL_messages_getSearchResultsPositions.limit = 100;
            org.telegram.ui.ActionBar.n2 n2Var = this.f29145r1;
            tL_messages_getSearchResultsPositions.peer = n2Var.getMessagesController().getInputPeer(j11);
            if (j10 != 0 && n2Var.getUserConfig().getClientUserId() == j11) {
                tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                tL_messages_getSearchResultsPositions.saved_peer_id = n2Var.getMessagesController().getInputPeer(j10);
            }
            final int i13 = wt0VarArr[i11].f34338p;
            ConnectionsManager.getInstance(n2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(n2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    AndroidUtilities.runOnUIThread(new hq0(this.f26806a, tL_error, i13, i11, tLObject, 0));
                }
            }), n2Var.getClassGuid());
        }
    }

    public void D0(SparseArray sparseArray) {
    }

    public void E0() {
    }

    public void K0(boolean z10) {
    }

    public void N0(boolean z10) {
    }

    public int V0(int i10) {
        return i10;
    }

    @Override
    public final void a(org.telegram.ui.Cells.p2 p2Var) {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void d(org.telegram.ui.Cells.p2 p2Var) {
    }

    @Override
    public final void f(org.telegram.ui.Cells.p2 p2Var) {
    }

    public void o0() {
    }
}
