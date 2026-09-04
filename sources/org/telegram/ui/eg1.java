package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import j$.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;
public class eg1 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.ch, dh0 {
    public static final HashSet f36024n1 = new HashSet();
    public HashSet A0;
    public boolean B0;
    public boolean C0;
    public bi.m6 D0;
    public boolean E;
    public sf1 E0;
    public gf1 F;
    public FrameLayout F0;
    public boolean G;
    public y8 G0;
    public boolean H;
    public ChatObject.Call H0;
    public boolean I;
    public rf1 I0;
    public TLRPC.ChatFull J;
    public boolean J0;
    public boolean K;
    public org.telegram.ui.Components.qk0 K0;
    public org.telegram.ui.Components.f61 L;
    public uy L0;
    public int M;
    public uy M0;
    public pf1 N;
    public boolean N0;
    public if1 O;
    public final AnimationNotificationsLocker O0;
    public dg1 P;
    public t50 P0;
    public org.telegram.ui.ActionBar.f1 Q;
    public long Q0;
    public org.telegram.ui.ActionBar.f1 R;
    public xh.d R0;
    public org.telegram.ui.ActionBar.f1 S;
    public float S0;
    public org.telegram.ui.ActionBar.f1 T;
    public boolean T0;
    public org.telegram.ui.ActionBar.f1 U;
    public org.telegram.ui.Components.js U0;
    public boolean V;
    public final boolean V0;
    public float W;
    public ImageView W0;
    public TL_stories.TL_premium_boostsStatus X;
    public float X0;
    public long Y;
    public ValueAnimator Y0;
    public boolean Z;
    public boolean Z0;
    public final long f36025a;
    public final HashSet f36026a0;
    public org.telegram.ui.Components.h81 f36027a1;
    public final ArrayList f36028b;
    public boolean f36029b0;
    public View f36030b1;
    public int f36031c;
    public NumberTextView f36032c0;
    public int f36033c1;
    public lf1 d;
    public org.telegram.ui.ActionBar.v0 f36034d0;
    public int f36035d1;
    public j0 f36036e;
    public org.telegram.ui.ActionBar.v0 f36037e0;
    public int f36038e1;
    public org.telegram.ui.Components.co f36039f;
    public org.telegram.ui.ActionBar.v0 f36040f0;
    public final bh.f f36041f1;
    public org.telegram.ui.ActionBar.v0 f36042g0;
    public final gh.d f36043g1;
    public org.telegram.ui.Components.y10 h;
    public org.telegram.ui.ActionBar.v0 f36044h0;
    public final gh.d f36045h1;
    public org.telegram.ui.ActionBar.v0 f36046i0;
    public final bh.b f36047i1;
    public org.telegram.ui.ActionBar.f1 f36048j0;
    public bh.l f36049j1;
    public org.telegram.ui.ActionBar.f1 f36050k0;
    public final ArrayList f36051k1;
    public org.telegram.ui.ActionBar.f1 f36052l0;
    public final RectF l1;
    public org.telegram.ui.ActionBar.v0 m0;
    public final RectF f36053m1;
    public uf1 f36054n;
    public RadialProgressView f36055n0;
    public v51 f36056o0;
    public org.telegram.ui.ActionBar.v0 f36057p0;
    public org.telegram.ui.ActionBar.v0 f36058q0;
    public final tf1 f36059r;
    public ag1 f36060r0;
    public final TopicsController f36061s;
    public boolean f36062s0;
    public final boolean f36063t0;
    public final boolean f36064u0;
    public fg1 v;
    public final boolean f36065v0;
    public ax f36066w;
    public final boolean f36067w0;
    public int f36068x;
    public final boolean f36069x0;
    public int f36070y;
    public String f36071y0;
    public boolean f36072z0;

    public eg1(Bundle bundle) {
        super(bundle);
        this.f36028b = new ArrayList();
        new ArrayList();
        this.f36059r = new tf1(this);
        this.f36068x = 0;
        this.E = true;
        this.G = true;
        this.V = true;
        this.W = 0.0f;
        this.f36026a0 = new HashSet();
        this.B0 = false;
        this.O0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.topicsDidLoaded});
        this.S0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f36051k1 = arrayList;
        RectF rectF = new RectF();
        this.l1 = rectF;
        RectF rectF2 = new RectF();
        this.f36053m1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j3 = this.arguments.getLong("chat_id", 0L);
        this.f36025a = j3;
        this.f36063t0 = this.arguments.getBoolean("for_select", false);
        this.f36064u0 = this.arguments.getBoolean("forward_to", false);
        this.f36069x0 = this.arguments.getBoolean("bot_share_to", false);
        this.f36065v0 = this.arguments.getBoolean("quote", false);
        this.f36067w0 = this.arguments.getBoolean("reply_to", false);
        this.f36071y0 = this.arguments.getString("voicechat", null);
        this.f36072z0 = this.arguments.getBoolean("videochat", false);
        this.f36061s = getMessagesController().getTopicsController();
        this.V0 = true ^ org.telegram.messenger.w1.v("topics_end_reached_", j3, getUserConfig().getPreferences(), false);
        gh.c cVar = new gh.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f36041f1 = new bh.f(false);
            this.f36043g1 = new gh.d(null);
            gh.d dVar = new gh.d(null);
            this.f36045h1 = dVar;
            bh.b bVar = new bh.b(dVar);
            this.f36047i1 = bVar;
            bVar.f2654f = LiteMode.isEnabled(262144);
            return;
        }
        this.f36041f1 = null;
        this.f36043g1 = null;
        this.f36045h1 = null;
        this.f36047i1 = new bh.b(cVar);
    }

    public static org.telegram.ui.ActionBar.n2 E0(MessagesController messagesController, MessagesStorage messagesStorage, Bundle bundle) {
        long j3 = bundle.getLong("chat_id");
        if (j3 != 0) {
            TLRPC.Dialog dialog = messagesController.getDialog(-j3);
            if (dialog != null && dialog.view_forum_as_messages) {
                return new co(bundle);
            }
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j3);
            if (chatFull == null) {
                chatFull = messagesStorage.loadChatInfo(j3, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.view_forum_as_messages) {
                return new co(bundle);
            }
        }
        return new eg1(bundle);
    }

    public static org.telegram.ui.ActionBar.n2 F0(LaunchActivity launchActivity, Bundle bundle) {
        return E0(MessagesController.getInstance(launchActivity.O), MessagesStorage.getInstance(launchActivity.O), bundle);
    }

    public static void I0(org.telegram.ui.co r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eg1.I0(org.telegram.ui.co):void");
    }

    public static boolean U(eg1 eg1Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(eg1Var.currentAccount).edit();
        edit.putLong("dialog_join_requested_time_" + (-eg1Var.f36025a), System.currentTimeMillis()).commit();
        Activity parentActivity = eg1Var.getParentActivity();
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(eg1Var.g());
        int i10 = org.telegram.ui.Components.g80.f26320r;
        org.telegram.ui.Components.g80.w(parentActivity, eg1Var, org.telegram.ui.Components.yc.a0(eg1Var), isChannelAndNotMegaGroup);
        eg1Var.O0(true);
        return false;
    }

    public static void V(eg1 eg1Var, View view) {
        long j3;
        long j10 = eg1Var.f36025a;
        if (eg1Var.getParentLayout() != null && !((ActionBarLayout) eg1Var.getParentLayout()).y() && (view instanceof bg1)) {
            TLRPC.TL_forumTopic tL_forumTopic = ((bg1) view).N;
            long j11 = -j10;
            boolean isMonoForum = eg1Var.getMessagesController().isMonoForum(j11);
            if (tL_forumTopic == null) {
                j3 = 0;
            } else if (isMonoForum) {
                j3 = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            } else {
                j3 = tL_forumTopic.f19921id;
            }
            long j12 = j3;
            if (eg1Var.f36063t0) {
                fg1 fg1Var = eg1Var.v;
                if (fg1Var != null) {
                    hg1 hg1Var = fg1Var.f36403a;
                    Bundle bundle = new Bundle();
                    kg1 kg1Var = hg1Var.f36997a;
                    bundle.putLong("dialog_id", kg1Var.f38065c);
                    bundle.putLong("topic_id", tL_forumTopic.f19921id);
                    bundle.putBoolean("exception", true);
                    y11 y11Var = new y11(bundle, null);
                    y11Var.f42957r = new qv0(17, hg1Var, tL_forumTopic);
                    kg1Var.presentFragment(y11Var);
                }
                uy uyVar = eg1Var.L0;
                if (uyVar != null) {
                    uyVar.O3(j11, j12, true, eg1Var);
                }
            } else if (eg1Var.f36026a0.size() > 0) {
                eg1Var.N0(view);
            } else {
                if (eg1Var.inPreviewMode && AndroidUtilities.isTablet()) {
                    for (org.telegram.ui.ActionBar.n2 n2Var : eg1Var.getParentLayout().getFragmentStack()) {
                        if (n2Var instanceof uy) {
                            uy uyVar2 = (uy) n2Var;
                            if (uyVar2.h4()) {
                                MessagesStorage.TopicKey topicKey = uyVar2.f41314p2;
                                if (topicKey.dialogId == j11 && topicKey.topicId == j12) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    eg1Var.Q0 = j12;
                    eg1Var.U0(false, false);
                }
                og.d.m(eg1Var, j10, tL_forumTopic, 0);
            }
        }
    }

    public static boolean W(eg1 eg1Var, View view, float f7) {
        if (eg1Var.f36063t0 || eg1Var.getParentLayout() == null || ((ActionBarLayout) eg1Var.getParentLayout()).y()) {
            return false;
        }
        if (!eg1Var.actionBar.s() && !AndroidUtilities.isTablet() && (view instanceof bg1)) {
            bg1 bg1Var = (bg1) view;
            if (bg1Var.S(f7)) {
                eg1Var.M0(bg1Var);
                eg1Var.N.I0(true);
                eg1Var.N.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        eg1Var.N0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void X(eg1 eg1Var) {
        ViewGroup viewGroup;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                viewGroup = eg1Var.N;
            } else {
                ag1 ag1Var = eg1Var.f36060r0;
                if (ag1Var != null) {
                    viewGroup = ag1Var.U;
                } else {
                    viewGroup = null;
                }
            }
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.h6) {
                        ((org.telegram.ui.Cells.h6) childAt).u(0);
                    } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                        ((org.telegram.ui.Cells.r2) childAt).b0(0, true);
                    } else if (childAt instanceof org.telegram.ui.Cells.za) {
                        ((org.telegram.ui.Cells.za) childAt).j(0);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.k kVar = eg1Var.actionBar;
        if (kVar != null) {
            kVar.D(eg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.G8), true);
            eg1Var.actionBar.F(eg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.E8), false, true);
            eg1Var.actionBar.F(eg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.F8), true, true);
            eg1Var.actionBar.G(eg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.I5), true);
        }
        t50 t50Var = eg1Var.P0;
        if (t50Var != null && Build.VERSION.SDK_INT >= 23) {
            t50Var.setForeground(new ColorDrawable(i0.a.k(eg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6), 100)));
        }
        eg1Var.P0();
    }

    public static void b0(eg1 eg1Var, boolean z10) {
        float f7;
        boolean z11;
        ox oxVar;
        eg1Var.f36062s0 = z10;
        ValueAnimator valueAnimator = eg1Var.Y0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            eg1Var.Y0.cancel();
        }
        if (eg1Var.f36027a1 == null) {
            org.telegram.ui.Components.h81 n10 = eg1Var.f36060r0.n(8, false);
            eg1Var.f36027a1 = n10;
            if (eg1Var.M0 != null) {
                n10.setBackgroundColor(eg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6));
            }
            eg1Var.f36036e.addView(eg1Var.f36027a1, w7.x5.c(44.0f, -1));
        }
        float f10 = eg1Var.W;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        eg1Var.Y0 = ValueAnimator.ofFloat(f10, f7);
        AndroidUtilities.updateViewVisibilityAnimated(eg1Var.f36060r0, false, 1.0f, true);
        uy uyVar = eg1Var.M0;
        if (uyVar != null && (oxVar = uyVar.F3) != null) {
            oxVar.M = !z10;
        }
        if (!z10 && eg1Var.f36060r0.getVisibility() == 0 && eg1Var.f36060r0.getAlpha() == 1.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        eg1Var.Z0 = z11;
        eg1Var.Y0.addUpdateListener(new b21(eg1Var, 17));
        eg1Var.f36060r0.setVisibility(0);
        if (!z10) {
            eg1Var.f36058q0.setVisibility(0);
        } else {
            AndroidUtilities.requestAdjustResize(eg1Var.getParentActivity(), eg1Var.classGuid);
            eg1Var.Q0(false);
        }
        eg1Var.Y0.addListener(new nf1(eg1Var, z10, 0));
        eg1Var.Y0.setDuration(200L);
        eg1Var.Y0.setInterpolator(org.telegram.ui.Components.pr.f29466f);
        eg1Var.Y0.start();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
    }

    public final void A0() {
        this.J0 = this.f36061s.isLoading(this.f36025a);
        if (this.D0 != null) {
            ArrayList arrayList = this.f36028b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((vf1) arrayList.get(0)).f41533c != null && ((vf1) arrayList.get(0)).f41533c.f19921id == 1)) {
                this.D0.e(this.J0, this.fragmentBeginToShow);
            }
        }
        pf1 pf1Var = this.N;
        if (pf1Var != null) {
            pf1Var.J0(pf1Var.t1());
        }
        Q0(true);
    }

    public final void B0() {
        int i10;
        float f7;
        float f10;
        uy uyVar = this.M0;
        float f11 = 0.0f;
        if (uyVar != null) {
            int dp = AndroidUtilities.dp(14.0f);
            org.telegram.ui.Components.js jsVar = uyVar.J1;
            if (jsVar != null) {
                f7 = jsVar.c(dp);
            } else {
                f7 = 0.0f;
            }
            float f12 = f7 + 0.0f;
            org.telegram.ui.Components.js jsVar2 = this.U0;
            if (jsVar2 != null) {
                float dp2 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.js jsVar3 = this.M0.J1;
                if (jsVar3 != null) {
                    f10 = jsVar3.getMetadata().f15386c.f15396a;
                } else {
                    f10 = 0.0f;
                }
                jsVar2.setTranslationY(f12 - (f10 * dp2));
                org.telegram.ui.Components.js jsVar4 = this.U0;
                int dp3 = AndroidUtilities.dp(14.0f);
                int dp4 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.js jsVar5 = this.M0.J1;
                if (jsVar5 != null) {
                    f11 = jsVar5.getMetadata().f15386c.f15396a;
                }
                f11 = jsVar4.c(AndroidUtilities.lerp(dp3, dp4, f11)) + f12;
            } else {
                f11 = f12;
            }
        } else {
            org.telegram.ui.Components.js jsVar6 = this.U0;
            if (jsVar6 != null) {
                f11 = 0.0f + jsVar6.c(AndroidUtilities.dp(14.0f));
            }
        }
        int i11 = this.f36038e1 + this.f36033c1;
        if (this.V) {
            i10 = AndroidUtilities.dp(51.0f);
        } else {
            i10 = 0;
        }
        this.N.setPadding(0, (int) f11, 0, i11 + i10);
    }

    public final void C0() {
        this.f36026a0.clear();
        this.actionBar.r();
        AndroidUtilities.updateVisibleRows(this.N);
        R0();
    }

    public final void D0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
        b2Var.R = pluralString;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            b2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, this.f36061s.findTopic(this.f36025a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            b2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a1.d(this, hashSet, arrayList, runnable, 19));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new sw0(4));
        b2Var.show();
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20898q7));
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void G0(boolean z10, boolean z11) {
        boolean z12 = true;
        this.h.e(!z10, (this.fragmentBeginToShow && z11) ? false : false);
    }

    public final void H0(boolean z10) {
        int i10;
        TLRPC.Chat g10;
        TLRPC.ChatPhoto chatPhoto;
        if (z10 && (g10 = g()) != null && ((chatPhoto = g10.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z10 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.f36025a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f36039f.getSharedMediaPreloader());
        profileActivity.K4(this.J);
        if (this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f36039f.getAvatarImageView().getImageReceiver().hasImageLoaded() && z10) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        profileActivity.N4(i10);
        presentFragment(profileActivity);
    }

    @Override
    public final long I() {
        return 0L;
    }

    public final void J0(int i10) {
        int i11;
        int i12;
        if (this.M != i10) {
            this.M = i10;
            org.telegram.ui.Components.f61 f61Var = this.L;
            if (i10 == 0) {
                i11 = org.telegram.ui.ActionBar.j6.Ae;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.f20898q7;
            }
            f61Var.setTextColorKey(i11);
            ImageView imageView = this.W0;
            if (i10 == 1) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            imageView.setVisibility(i12);
            O0(false);
        }
    }

    public final void K0(boolean z10) {
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            return;
        }
        lf1 lf1Var = this.d;
        if (lf1Var != null) {
            if (z10) {
                lf1Var.setLayerType(2, null);
                lf1Var.setClipChildren(false);
                lf1Var.setClipToPadding(false);
            } else {
                lf1Var.setLayerType(0, null);
                lf1Var.setClipChildren(true);
                lf1Var.setClipToPadding(true);
            }
        }
        this.d.requestLayout();
        this.actionBar.requestLayout();
    }

    public final void L0(float f7) {
        if (SharedConfig.getDevicePerformanceClass() != 0) {
            this.S0 = f7;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            pf1 pf1Var = this.N;
            if (pf1Var != null) {
                float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, this.S0, 0.05f, 1.0f);
                pf1Var.setPivotX(0.0f);
                pf1Var.setPivotY(0.0f);
                pf1Var.setScaleX(b10);
                pf1Var.setScaleY(b10);
                this.actionBar.setPivotX(0.0f);
                this.actionBar.setPivotY(0.0f);
                this.actionBar.setScaleX(b10);
                this.actionBar.setScaleY(b10);
            }
        }
    }

    public final void M0(org.telegram.ui.Cells.r2 r2Var) {
        long j3;
        try {
            r2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = r2Var.N;
        org.telegram.ui.Components.oo ooVar = new org.telegram.ui.Components.oo(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new kf1(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(ooVar.f29140f);
        ooVar.f29148o = 1;
        long j10 = this.f36025a;
        long j11 = -j10;
        ooVar.d(j11, tL_forumTopic.f19921id, null);
        if (ChatObject.canManageTopics(g())) {
            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                f1Var.g(LocaleController.getString(R.string.DialogUnpin), R.drawable.msg_unpin, null);
            } else {
                f1Var.g(LocaleController.getString(R.string.DialogPin), R.drawable.msg_pin, null);
            }
            f1Var.setMinimumWidth(160);
            f1Var.setOnClickListener(new View.OnClickListener(this) {
                public final eg1 f36019b;

                {
                    this.f36019b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            eg1 eg1Var = this.f36019b;
                            eg1Var.C0 = true;
                            eg1Var.N0 = true;
                            TopicsController topicsController = eg1Var.f36061s;
                            long j12 = eg1Var.f36025a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j12, tL_forumTopic2.f19921id, !tL_forumTopic2.pinned, eg1Var);
                            eg1Var.finishPreviewFragment();
                            return;
                        case 1:
                            eg1 eg1Var2 = this.f36019b;
                            eg1Var2.N0 = true;
                            TopicsController topicsController2 = eg1Var2.f36061s;
                            long j13 = eg1Var2.f36025a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j13, tL_forumTopic3.f19921id, true ^ tL_forumTopic3.closed);
                            eg1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f19921id));
                            eg1 eg1Var3 = this.f36019b;
                            eg1Var3.D0(hashSet, new cf1(eg1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(f1Var);
        }
        org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(getParentActivity(), false, false);
        if (getMessagesController().isDialogMuted(j11, tL_forumTopic.f19921id)) {
            f1Var2.g(LocaleController.getString(R.string.Unmute), R.drawable.msg_mute, null);
        } else {
            f1Var2.g(LocaleController.getString(R.string.Mute), R.drawable.msg_unmute, null);
        }
        f1Var2.setMinimumWidth(160);
        f1Var2.setOnClickListener(new bi.b7(this, tL_forumTopic, (Serializable) r32, b10, 6));
        r32[0].addView(f1Var2);
        if (ChatObject.canManageTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                f1Var3.g(LocaleController.getString(R.string.RestartTopic), R.drawable.msg_topic_restart, null);
            } else {
                f1Var3.g(LocaleController.getString(R.string.CloseTopic), R.drawable.msg_topic_close, null);
            }
            f1Var3.setMinimumWidth(160);
            f1Var3.setOnClickListener(new View.OnClickListener(this) {
                public final eg1 f36019b;

                {
                    this.f36019b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            eg1 eg1Var = this.f36019b;
                            eg1Var.C0 = true;
                            eg1Var.N0 = true;
                            TopicsController topicsController = eg1Var.f36061s;
                            long j12 = eg1Var.f36025a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j12, tL_forumTopic2.f19921id, !tL_forumTopic2.pinned, eg1Var);
                            eg1Var.finishPreviewFragment();
                            return;
                        case 1:
                            eg1 eg1Var2 = this.f36019b;
                            eg1Var2.N0 = true;
                            TopicsController topicsController2 = eg1Var2.f36061s;
                            long j13 = eg1Var2.f36025a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j13, tL_forumTopic3.f19921id, true ^ tL_forumTopic3.closed);
                            eg1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f19921id));
                            eg1 eg1Var3 = this.f36019b;
                            eg1Var3.D0(hashSet, new cf1(eg1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(f1Var3);
        }
        if (ChatObject.canDeleteTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(getParentActivity(), false, true);
            f1Var4.g(LocaleController.getPluralString("DeleteTopics", 1), R.drawable.msg_delete, null);
            f1Var4.setIconColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20880p7));
            f1Var4.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20898q7));
            f1Var4.setMinimumWidth(160);
            f1Var4.setOnClickListener(new View.OnClickListener(this) {
                public final eg1 f36019b;

                {
                    this.f36019b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            eg1 eg1Var = this.f36019b;
                            eg1Var.C0 = true;
                            eg1Var.N0 = true;
                            TopicsController topicsController = eg1Var.f36061s;
                            long j12 = eg1Var.f36025a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j12, tL_forumTopic2.f19921id, !tL_forumTopic2.pinned, eg1Var);
                            eg1Var.finishPreviewFragment();
                            return;
                        case 1:
                            eg1 eg1Var2 = this.f36019b;
                            eg1Var2.N0 = true;
                            TopicsController topicsController2 = eg1Var2.f36061s;
                            long j13 = eg1Var2.f36025a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j13, tL_forumTopic3.f19921id, true ^ tL_forumTopic3.closed);
                            eg1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f19921id));
                            eg1 eg1Var3 = this.f36019b;
                            eg1Var3.D0(hashSet, new cf1(eg1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(f1Var4);
        }
        boolean isMonoForum = getMessagesController().isMonoForum(j11);
        if (this.P0 != null && this.parentLayout != null) {
            int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 6.0f);
            int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 6.0f);
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(0.16666667f, 0.16666667f);
            this.parentLayout.getView().draw(canvas);
            Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
            this.P0.setBackground(new BitmapDrawable(createBitmap));
            this.P0.setAlpha(0.0f);
            if (this.P0.getParent() != null) {
                ((ViewGroup) this.P0.getParent()).removeView(this.P0);
            }
            this.parentLayout.getOverlayContainerView().addView(this.P0, w7.x5.c(-1.0f, -1));
        }
        co coVar = new co(w.f.e(j10, "chat_id"));
        if (isMonoForum) {
            j3 = DialogObject.getPeerDialogId(r2Var.N.from_id);
        } else {
            j3 = r2Var.N.f19921id;
        }
        og.d.a(coVar, MessagesStorage.TopicKey.of(j11, j3));
        presentFragmentAsPreviewWithMenu(coVar, r32[0]);
    }

    public final void N0(View view) {
        bg1 bg1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        TopicsController topicsController;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if ((view instanceof bg1) && (tL_forumTopic = (bg1Var = (bg1) view).N) != null) {
            int i19 = tL_forumTopic.f19921id;
            Integer valueOf = Integer.valueOf(i19);
            HashSet hashSet = this.f36026a0;
            if (!hashSet.remove(valueOf)) {
                hashSet.add(Integer.valueOf(i19));
            }
            bg1Var.V(hashSet.contains(Integer.valueOf(i19)), true);
            MessagesController messagesController = getMessagesController();
            long j3 = this.f36025a;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            if (!hashSet.isEmpty()) {
                if (!this.actionBar.a(null)) {
                    org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
                    if (this.inPreviewMode) {
                        j10.setBackgroundColor(0);
                        j10.f21545a = false;
                    }
                    NumberTextView numberTextView = new NumberTextView(j10.getContext());
                    this.f36032c0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f36032c0.setTypeface(AndroidUtilities.bold());
                    this.f36032c0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f21044y8));
                    j10.addView(this.f36032c0, w7.x5.m(1.0f, 0, -1, 72, 0, 0));
                    this.f36032c0.setOnTouchListener(new ff1(0));
                    this.f36034d0 = j10.g(4, R.drawable.msg_pin, AndroidUtilities.dp(54.0f));
                    this.f36037e0 = j10.g(5, R.drawable.msg_unpin, AndroidUtilities.dp(54.0f));
                    this.f36040f0 = j10.g(6, R.drawable.msg_mute, AndroidUtilities.dp(54.0f));
                    this.f36042g0 = j10.h(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                    org.telegram.ui.ActionBar.v0 h = j10.h(12, R.drawable.msg_archive_hide, LocaleController.getString(R.string.Hide), AndroidUtilities.dp(54.0f));
                    this.f36044h0 = h;
                    h.setVisibility(8);
                    org.telegram.ui.ActionBar.v0 h10 = j10.h(13, R.drawable.msg_archive_show, LocaleController.getString(R.string.Show), AndroidUtilities.dp(54.0f));
                    this.f36046i0 = h10;
                    h10.setVisibility(8);
                    org.telegram.ui.ActionBar.v0 h11 = j10.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(54.0f));
                    this.m0 = h11;
                    this.f36048j0 = h11.e(8, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
                    this.f36050k0 = this.m0.e(9, R.drawable.msg_topic_close, LocaleController.getString(R.string.CloseTopic));
                    this.f36052l0 = this.m0.e(10, R.drawable.msg_topic_restart, LocaleController.getString(R.string.RestartTopic));
                }
                if (this.inPreviewMode) {
                    ((View) this.fragmentView.getParent()).invalidate();
                }
                this.actionBar.O(null, null);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                Iterator it = hashSet.iterator();
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                while (true) {
                    boolean hasNext = it.hasNext();
                    topicsController = this.f36061s;
                    if (!hasNext) {
                        break;
                    }
                    HashSet hashSet2 = hashSet;
                    long intValue = ((Integer) it.next()).intValue();
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j3, intValue);
                    if (findTopic != null) {
                        if (findTopic.unread_count != 0) {
                            i20++;
                        }
                        if (ChatObject.canManageTopics(chat) && !findTopic.hidden) {
                            if (findTopic.pinned) {
                                i23++;
                            } else {
                                i22++;
                            }
                        }
                    }
                    if (getMessagesController().isDialogMuted(-j3, intValue)) {
                        i21++;
                    }
                    hashSet = hashSet2;
                }
                HashSet hashSet3 = hashSet;
                if (i20 > 0) {
                    this.f36048j0.setVisibility(0);
                    this.f36048j0.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
                } else {
                    this.f36048j0.setVisibility(8);
                }
                if (i21 != 0) {
                    this.B0 = false;
                    this.f36040f0.setIcon(R.drawable.msg_unmute);
                    this.f36040f0.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
                    z10 = true;
                } else {
                    z10 = true;
                    this.B0 = true;
                    this.f36040f0.setIcon(R.drawable.msg_mute);
                    this.f36040f0.setContentDescription(LocaleController.getString(R.string.ChatsMute));
                }
                org.telegram.ui.ActionBar.v0 v0Var = this.f36034d0;
                if (i22 == z10 && i23 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                v0Var.setVisibility(i10);
                org.telegram.ui.ActionBar.v0 v0Var2 = this.f36037e0;
                if (i23 == z10 && i22 == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                v0Var2.setVisibility(i11);
                this.f36032c0.a(hashSet3.size(), z10);
                Iterator it2 = hashSet3.iterator();
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                while (it2.hasNext()) {
                    TLRPC.TL_forumTopic findTopic2 = topicsController.findTopic(j3, ((Integer) it2.next()).intValue());
                    if (findTopic2 != null) {
                        if (ChatObject.canDeleteTopic(this.currentAccount, chat, findTopic2)) {
                            i26++;
                        }
                        if (ChatObject.canManageTopic(this.currentAccount, chat, findTopic2)) {
                            if (findTopic2.f19921id == 1) {
                                if (findTopic2.hidden) {
                                    i28++;
                                } else {
                                    i27++;
                                }
                            }
                            if (!findTopic2.hidden) {
                                if (findTopic2.closed) {
                                    i24++;
                                } else {
                                    i25++;
                                }
                            }
                        }
                    }
                }
                org.telegram.ui.ActionBar.f1 f1Var = this.f36050k0;
                if (i24 == 0 && i25 > 0) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                f1Var.setVisibility(i12);
                org.telegram.ui.ActionBar.f1 f1Var2 = this.f36050k0;
                if (i25 > 1) {
                    i13 = R.string.CloseTopics;
                } else {
                    i13 = R.string.CloseTopic;
                }
                f1Var2.setText(LocaleController.getString(i13));
                org.telegram.ui.ActionBar.f1 f1Var3 = this.f36052l0;
                if (i25 == 0 && i24 > 0) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                f1Var3.setVisibility(i14);
                org.telegram.ui.ActionBar.f1 f1Var4 = this.f36052l0;
                if (i24 > 1) {
                    i15 = R.string.RestartTopics;
                } else {
                    i15 = R.string.RestartTopic;
                }
                f1Var4.setText(LocaleController.getString(i15));
                org.telegram.ui.ActionBar.v0 v0Var3 = this.f36042g0;
                if (i26 == hashSet3.size()) {
                    i16 = 0;
                } else {
                    i16 = 8;
                }
                v0Var3.setVisibility(i16);
                org.telegram.ui.ActionBar.v0 v0Var4 = this.f36044h0;
                if (i27 == 1 && hashSet3.size() == 1) {
                    i17 = 0;
                } else {
                    i17 = 8;
                }
                v0Var4.setVisibility(i17);
                org.telegram.ui.ActionBar.v0 v0Var5 = this.f36046i0;
                if (i28 == 1 && hashSet3.size() == 1) {
                    i18 = 0;
                } else {
                    i18 = 8;
                }
                v0Var5.setVisibility(i18);
                this.m0.l();
                R0();
                return;
            }
            this.actionBar.r();
        }
    }

    public final void O0(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eg1.O0(boolean):void");
    }

    public final void P0() {
        RadialProgressView radialProgressView = this.f36055n0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.j6.Ae));
        this.h.g();
        v51 v51Var = this.f36056o0;
        int i10 = org.telegram.ui.ActionBar.j6.f20663d6;
        v51Var.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(getThemedColor(i10));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20937s8));
        }
        this.f36060r0.setBackgroundColor(getThemedColor(i10));
    }

    public final void Q0(boolean z10) {
        boolean z11;
        if (this.Q == null) {
            return;
        }
        MessagesController messagesController = getMessagesController();
        long j3 = this.f36025a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        int i10 = 0;
        if (!ChatObject.isNotInChat(getMessagesController().getChat(Long.valueOf(j3))) && ChatObject.canCreateTopic(chat) && !this.f36062s0 && !this.f36063t0 && !this.J0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.K = z11;
        org.telegram.ui.ActionBar.f1 f1Var = this.Q;
        if (!z11) {
            i10 = 8;
        }
        f1Var.setVisibility(i10);
        G0(!this.K, z10);
    }

    public final void R0() {
        boolean z10;
        if (ChatObject.canManageTopics(g()) && !this.f36026a0.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f36029b0 != z10) {
            this.f36029b0 = z10;
            tf1 tf1Var = this.f36059r;
            tf1Var.q(0, tf1Var.h());
        }
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        return false;
    }

    public final void S0(float f7) {
        this.W = f7;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f20992v8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f21044y8;
        kVar.C(i0.a.d(this.W, themedColor, getThemedColor(i10)), false);
        this.actionBar.C(i0.a.d(this.W, getThemedColor(i10), getThemedColor(i10)), true);
        this.actionBar.B(i0.a.d(this.W, getThemedColor(org.telegram.ui.ActionBar.j6.f20956t8), getThemedColor(org.telegram.ui.ActionBar.j6.f21063z8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(i0.a.d(this.W, getThemedColor(org.telegram.ui.ActionBar.j6.f20937s8), getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6)));
        }
        float f10 = 1.0f - f7;
        this.f36039f.getTitleTextView().setAlpha(f10);
        this.f36039f.getSubtitleTextView().setAlpha(f10);
        org.telegram.ui.Components.h81 h81Var = this.f36027a1;
        if (h81Var != null) {
            h81Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
            this.f36027a1.setAlpha(f7);
        }
        this.f36060r0.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
        this.f36060r0.setAlpha(f7);
        if (isInPreviewMode()) {
            this.f36036e.invalidate();
        }
        this.d.invalidate();
        this.N.setAlpha(f10);
        if (this.Z0) {
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.W, 0.02f, 0.98f);
            this.N.setScaleX(z10);
            this.N.setScaleY(z10);
        }
    }

    public final void T0() {
        bi.m6 m6Var = this.D0;
        if (m6Var != null && m6Var.f32755e != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
            org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(R.drawable.ic_ab_other, 0);
            nqVar.setSize(AndroidUtilities.dp(16.0f));
            spannableStringBuilder.setSpan(nqVar, 0, 1, 0);
            if (ChatObject.canUserDoAdminAction(g(), 15)) {
                this.D0.f32755e.setText(AndroidUtilities.replaceCharSequence("%s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoTopicsDescription)), spannableStringBuilder));
                return;
            }
            String string = LocaleController.getString(R.string.General);
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.f36025a, 1L);
            if (findTopic != null) {
                string = findTopic.title;
            }
            this.D0.f32755e.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoTopicsDescriptionUser", R.string.NoTopicsDescriptionUser, string)));
        }
    }

    public final void U0(boolean z10, boolean z11) {
        gf1 gf1Var;
        rf1 rf1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z10 && this.N0) {
            z10 = true;
        }
        this.N0 = false;
        TopicsController topicsController = this.f36061s;
        long j3 = this.f36025a;
        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j3);
        if (topics != null) {
            ArrayList arrayList = this.f36028b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            rf1 rf1Var2 = null;
            if (UserObject.isBotForum(this.currentAccount, -j3) && this.f36064u0) {
                arrayList.add(new vf1(3, null));
            }
            for (int i10 = 0; i10 < topics.size(); i10++) {
                HashSet hashSet = this.A0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(topics.get(i10).f19921id))) {
                    arrayList.add(new vf1(0, topics.get(i10)));
                }
            }
            if (!arrayList.isEmpty() && !topicsController.endIsReached(j3) && this.V0) {
                arrayList.add(new vf1(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.K0.b(size + 4);
                z10 = false;
            }
            this.f36068x = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                vf1 vf1Var = (vf1) arrayList.get(i11);
                if (vf1Var != null && (tL_forumTopic = vf1Var.f41533c) != null && tL_forumTopic.hidden) {
                    this.f36068x++;
                }
            }
            pf1 pf1Var = this.N;
            if (pf1Var != null) {
                s4.m0 itemAnimator = pf1Var.getItemAnimator();
                if (z10) {
                    rf1Var = this.I0;
                } else {
                    rf1Var = null;
                }
                if (itemAnimator != rf1Var) {
                    pf1 pf1Var2 = this.N;
                    if (z10) {
                        rf1Var2 = this.I0;
                    }
                    pf1Var2.setItemAnimator(rf1Var2);
                }
            }
            tf1 tf1Var = this.f36059r;
            if (tf1Var != null) {
                tf1Var.E(arrayList2, arrayList);
            }
            if ((this.C0 || size == 0) && (gf1Var = this.F) != null) {
                gf1Var.h1(0, 0);
                this.C0 = false;
            }
        }
        A0();
        T0();
    }

    @Override
    public final long a() {
        return -this.f36025a;
    }

    @Override
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        boolean z13;
        SpannableStringBuilder spannableStringBuilder;
        float f7;
        float f10;
        uy uyVar = this.M0;
        if (uyVar != null && uyVar.W) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.f36033c1 = i10;
        uy uyVar2 = this.M0;
        if (uyVar2 != null && uyVar2.W) {
            i11 = AndroidUtilities.dp(64.0f);
        } else {
            i11 = 0;
        }
        this.f36035d1 = i11;
        lf1 lf1Var = new lf1(this, context);
        this.d = lf1Var;
        this.fragmentView = lf1Var;
        lf1Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6));
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (!AndroidUtilities.isTablet() && !this.inPreviewMode) {
            z10 = true;
        } else {
            z10 = false;
        }
        kVar.setOccupyStatusBar(z10);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        i2.g.x(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new of1(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) {
            public final eg1 f34789b;

            {
                this.f34789b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.v0 v0Var;
                switch (r2) {
                    case 0:
                        eg1 eg1Var = this.f34789b;
                        eg1Var.presentFragment(af1.a0(eg1Var.f36025a, 0L));
                        return;
                    case 1:
                        eg1 eg1Var2 = this.f34789b;
                        eg1Var2.getMessagesController().hidePeerSettingsBar(-eg1Var2.f36025a, null, eg1Var2.g());
                        eg1Var2.O0(false);
                        return;
                    case 2:
                        eg1 eg1Var3 = this.f34789b;
                        if (!eg1Var3.f36062s0) {
                            eg1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f34789b.finishPreviewFragment();
                        return;
                    default:
                        uy uyVar3 = this.f34789b.M0;
                        if (uyVar3 != null && (v0Var = uyVar3.f41285j0) != null) {
                            v0Var.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        if (this.M0 != null) {
            org.telegram.ui.ActionBar.v0 a2 = n10.a(0, R.drawable.outline_header_search);
            this.f36057p0 = a2;
            a2.setOnClickListener(new View.OnClickListener(this) {
                public final eg1 f34789b;

                {
                    this.f34789b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.v0 v0Var;
                    switch (r2) {
                        case 0:
                            eg1 eg1Var = this.f34789b;
                            eg1Var.presentFragment(af1.a0(eg1Var.f36025a, 0L));
                            return;
                        case 1:
                            eg1 eg1Var2 = this.f34789b;
                            eg1Var2.getMessagesController().hidePeerSettingsBar(-eg1Var2.f36025a, null, eg1Var2.g());
                            eg1Var2.O0(false);
                            return;
                        case 2:
                            eg1 eg1Var3 = this.f34789b;
                            if (!eg1Var3.f36062s0) {
                                eg1Var3.H0(false);
                                return;
                            }
                            return;
                        case 3:
                            this.f34789b.finishPreviewFragment();
                            return;
                        default:
                            uy uyVar3 = this.f34789b.M0;
                            if (uyVar3 != null && (v0Var = uyVar3.f41285j0) != null) {
                                v0Var.performClick();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.v0 a10 = n10.a(0, R.drawable.outline_header_search);
            this.f36057p0 = a10;
            a10.F();
            a10.H = new ig.d2(this, 18);
            this.f36057p0.setSearchPaddingStart(56);
            this.f36057p0.setSearchFieldHint(LocaleController.getString(R.string.Search));
            EditTextBoldCursor searchField = this.f36057p0.getSearchField();
            searchField.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.G6));
            searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Si));
            searchField.setCursorColor(getThemedColor(org.telegram.ui.ActionBar.j6.Wd));
        }
        org.telegram.ui.ActionBar.v0 c10 = n10.c(0, R.drawable.ic_ab_other, null);
        this.f36058q0 = c10;
        c10.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.f36058q0.e(1, R.drawable.msg_discussion, LocaleController.getString(R.string.TopicViewAsMessages));
        this.R = this.f36058q0.e(2, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddMember));
        org.telegram.ui.ActionBar.v0 v0Var = this.f36058q0;
        this.T = v0Var.d(14, 0, new org.telegram.ui.Components.xi0(R.raw.boosts, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f)), LocaleController.getString(R.string.BoostingBoostGroupMenu), true, false, v0Var.m0);
        this.Q = this.f36058q0.e(3, R.drawable.msg_topic_create, LocaleController.getString(R.string.CreateTopic));
        this.U = this.f36058q0.e(15, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat));
        this.S = this.f36058q0.f(11, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMegaMenu), null);
        org.telegram.ui.Components.co coVar = new org.telegram.ui.Components.co(context, this, false, this.resourceProvider);
        this.f36039f = coVar;
        coVar.getAvatarImageView().setRoundRadius(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.co coVar2 = this.f36039f;
        if (!AndroidUtilities.isTablet() && !this.inPreviewMode) {
            z11 = true;
        } else {
            z11 = false;
        }
        coVar2.setOccupyStatusBar(z11);
        org.telegram.ui.Components.co coVar3 = this.f36039f;
        long j3 = -this.f36025a;
        if (j3 < 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        coVar3.f25040b = z12;
        coVar3.setClipChildren(false);
        this.actionBar.addView(this.f36039f, 0, w7.x5.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.f36063t0) {
            this.f36039f.getAvatarImageView().setOnClickListener(new y7(this, 3));
        }
        this.N = new pf1(this, context);
        ih.k kVar2 = new ih.k(this.d);
        ViewGroup viewGroup = this.d;
        bh.b bVar = this.f36047i1;
        bVar.d = kVar2;
        bVar.f2653e = viewGroup;
        pf1 pf1Var = this.N;
        uy uyVar3 = this.M0;
        if (uyVar3 != null) {
            viewGroup = (ViewGroup) uyVar3.getFragmentView();
        }
        pf1 pf1Var2 = this.N;
        Objects.requireNonNull(pf1Var2);
        this.f36049j1 = new bh.l(pf1Var, viewGroup, new v8(pf1Var2, 2));
        this.N.C0(new cf1(this, 5));
        SpannableString spannableString = new SpannableString("#");
        og.c c11 = og.d.c(getParentActivity(), 0.85f, -1, false);
        c11.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
        spannableString.setSpan(new ImageSpan(c11, 2), 0, 1, 33);
        ax axVar = new ax(this, AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccSwipeForGeneral), spannableString), AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccReleaseForGeneral), spannableString));
        this.f36066w = axVar;
        axVar.b();
        if (this.E) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        this.f36070y = i12;
        ax axVar2 = this.f36066w;
        if (i12 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        axVar2.X = z13;
        rf1 rf1Var = new rf1(this);
        this.N.setHideIfEmpty(false);
        rf1Var.f45777m = false;
        rf1Var.C = false;
        pf1 pf1Var3 = this.N;
        this.I0 = rf1Var;
        pf1Var3.setItemAnimator(rf1Var);
        this.N.setOnScrollListener(new hf1(this, 1));
        pf1 pf1Var4 = this.N;
        pf1Var4.Y1 = true;
        pf1Var4.Z1 = 0;
        org.telegram.ui.Components.qk0 qk0Var = new org.telegram.ui.Components.qk0(pf1Var4, true);
        this.K0 = qk0Var;
        this.N.setItemsEnterAnimator(qk0Var);
        this.N.setOnItemClickListener(new b31(this, 9));
        this.N.setOnItemLongClickListener(new df1(this));
        this.N.setOnScrollListener(new hf1(this, 2));
        pf1 pf1Var5 = this.N;
        gf1 gf1Var = new gf1(this);
        this.F = gf1Var;
        pf1Var5.setLayoutManager(gf1Var);
        new SparseArray();
        new HashMap();
        this.N.setAdapter(this.f36059r);
        this.N.setClipToPadding(false);
        this.N.j(new hf1(this, 0));
        dg1 dg1Var = new dg1(this);
        this.P = dg1Var;
        if1 if1Var = new if1(this, dg1Var);
        this.O = if1Var;
        if1Var.d(this.N);
        this.d.addView(this.N, w7.x5.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.N.getLayoutParams()).topMargin = -AndroidUtilities.dp(100.0f);
        org.telegram.ui.Components.y10 y10Var = new org.telegram.ui.Components.y10(getParentActivity(), this.resourceProvider, false);
        this.h = y10Var;
        this.d.addView(y10Var, org.telegram.ui.Components.y10.b());
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final eg1 f34789b;

            {
                this.f34789b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.v0 v0Var2;
                switch (r2) {
                    case 0:
                        eg1 eg1Var = this.f34789b;
                        eg1Var.presentFragment(af1.a0(eg1Var.f36025a, 0L));
                        return;
                    case 1:
                        eg1 eg1Var2 = this.f34789b;
                        eg1Var2.getMessagesController().hidePeerSettingsBar(-eg1Var2.f36025a, null, eg1Var2.g());
                        eg1Var2.O0(false);
                        return;
                    case 2:
                        eg1 eg1Var3 = this.f34789b;
                        if (!eg1Var3.f36062s0) {
                            eg1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f34789b.finishPreviewFragment();
                        return;
                    default:
                        uy uyVar32 = this.f34789b.M0;
                        if (uyVar32 != null && (v0Var2 = uyVar32.f41285j0) != null) {
                            v0Var2.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        this.h.f32812c.setImageResource(R.drawable.ic_chatlist_add_2);
        this.h.f32812c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.f32812c.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.h.setContentDescription(LocaleController.getString(R.string.CreateTopic));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        t00Var.setViewType(24);
        t00Var.setVisibility(8);
        t00Var.f30465w = true;
        ?? frameLayout = new FrameLayout(context);
        TextView textView = new TextView(context);
        frameLayout.f41085a = textView;
        if (LocaleController.isRTL) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.nq(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TapToCreateTopicHint));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.TapToCreateTopicHint));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.nq(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f21042y6));
        boolean z14 = LocaleController.isRTL;
        if (z14) {
            f7 = 72.0f;
        } else {
            f7 = 32.0f;
        }
        if (z14) {
            f10 = 32.0f;
        } else {
            f10 = 72.0f;
        }
        frameLayout.addView(textView, w7.x5.d(-2, -2.0f, 81, f7, 0.0f, f10, 32.0f));
        this.f36054n = frameLayout;
        textView.setAlpha(0.0f);
        bi.m6 m6Var = new bi.m6(this, context, t00Var);
        this.D0 = m6Var;
        try {
            m6Var.f32753b.getImageReceiver().setAutoRepeat(2);
        } catch (Exception unused) {
        }
        this.D0.e(this.J0, this.fragmentBeginToShow);
        this.D0.d.setText(LocaleController.getString(R.string.NoTopics));
        T0();
        this.f36054n.addView(t00Var);
        this.f36054n.addView(this.D0);
        this.d.addView(this.f36054n);
        this.N.setEmptyView(this.f36054n);
        this.f36056o0 = new v51(context, 6);
        org.telegram.ui.Components.f61 f61Var = new org.telegram.ui.Components.f61(context);
        this.L = f61Var;
        this.f36056o0.addView(f61Var);
        this.d.addView(this.f36056o0, w7.x5.e(-1, 51, 80));
        this.L.setOnClickListener(new jf1(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f36055n0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(22.0f));
        this.f36055n0.setVisibility(4);
        this.f36056o0.addView(this.f36055n0, w7.x5.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.W0 = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.W0.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView2 = this.W0;
        int i13 = org.telegram.ui.ActionBar.j6.f20671de;
        imageView2.setBackground(org.telegram.ui.ActionBar.y5.c(null, org.telegram.ui.ActionBar.y5.b(getThemedColor(i13))));
        this.W0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), PorterDuff.Mode.MULTIPLY));
        this.W0.setScaleType(ImageView.ScaleType.CENTER);
        this.f36056o0.addView(this.W0, w7.x5.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.W0.setOnClickListener(new View.OnClickListener(this) {
            public final eg1 f34789b;

            {
                this.f34789b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.v0 v0Var2;
                switch (r2) {
                    case 0:
                        eg1 eg1Var = this.f34789b;
                        eg1Var.presentFragment(af1.a0(eg1Var.f36025a, 0L));
                        return;
                    case 1:
                        eg1 eg1Var2 = this.f34789b;
                        eg1Var2.getMessagesController().hidePeerSettingsBar(-eg1Var2.f36025a, null, eg1Var2.g());
                        eg1Var2.O0(false);
                        return;
                    case 2:
                        eg1 eg1Var3 = this.f34789b;
                        if (!eg1Var3.f36062s0) {
                            eg1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f34789b.finishPreviewFragment();
                        return;
                    default:
                        uy uyVar32 = this.f34789b.M0;
                        if (uyVar32 != null && (v0Var2 = uyVar32.f41285j0) != null) {
                            v0Var2.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        this.W0.setVisibility(8);
        O0(false);
        j0 j0Var = new j0(this, context, 25);
        this.f36036e = j0Var;
        if (this.M0 == null) {
            this.d.addView(j0Var, w7.x5.e(-1, -1, 119));
        }
        ag1 ag1Var = new ag1(this, context);
        this.f36060r0 = ag1Var;
        ag1Var.setVisibility(8);
        this.f36036e.addView(this.f36060r0, w7.x5.d(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        ag1 ag1Var2 = this.f36060r0;
        int i14 = org.telegram.ui.ActionBar.j6.f20663d6;
        ag1Var2.setBackgroundColor(getThemedColor(i14));
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().loadChatInfo(this.f36025a, true, null, true, false, 0);
        org.telegram.ui.Components.js jsVar = new org.telegram.ui.Components.js(context);
        this.U0 = jsVar;
        jsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        dh.d c12 = bVar.c(this.U0, fh.b.n(this.resourceProvider), false);
        c12.p(AndroidUtilities.dp(24.0f));
        c12.o(AndroidUtilities.dp(7.0f));
        this.U0.setBlurredBackground(c12);
        this.U0.setOnAnimatedHeightChangedListener(new cf1(this, 0));
        this.d.addView(this.U0, w7.x5.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            xh.d dVar = new xh.d(g10, this);
            this.R0 = dVar;
            this.U0.addView(dVar.c(), w7.x5.n(-1, 40));
            this.U0.h(3, this.R0.c());
            this.U0.g(this.R0.c());
            xh.d dVar2 = this.R0;
            dVar2.f49410m = new df1(this);
            TLRPC.ChatFull chatFull = this.J;
            dVar2.f49407j = chatFull;
            if (chatFull != null) {
                dVar2.e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        if (!this.inPreviewMode) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.F0 = frameLayout2;
            this.U0.addView(frameLayout2);
            this.U0.h(4, this.F0);
            this.U0.g(this.F0);
            this.U0.i(this.F0, true, false);
            y8 y8Var = new y8(this, context, this);
            this.G0 = y8Var;
            this.F0.addView(y8Var);
            this.U0.setCallFragmentContextView(this.G0);
        }
        FrameLayout.LayoutParams c13 = w7.x5.c(-2.0f, -1);
        if (this.inPreviewMode) {
            c13.topMargin = AndroidUtilities.statusBarHeight;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, c13);
        }
        y0();
        t50 t50Var = new t50(this, context, 10);
        this.P0 = t50Var;
        if (Build.VERSION.SDK_INT >= 23) {
            t50Var.setForeground(new ColorDrawable(i0.a.k(getThemedColor(i14), 100)));
        }
        this.P0.setFocusable(false);
        this.P0.setImportantForAccessibility(2);
        this.P0.setOnClickListener(new View.OnClickListener(this) {
            public final eg1 f34789b;

            {
                this.f34789b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.v0 v0Var2;
                switch (r2) {
                    case 0:
                        eg1 eg1Var = this.f34789b;
                        eg1Var.presentFragment(af1.a0(eg1Var.f36025a, 0L));
                        return;
                    case 1:
                        eg1 eg1Var2 = this.f34789b;
                        eg1Var2.getMessagesController().hidePeerSettingsBar(-eg1Var2.f36025a, null, eg1Var2.g());
                        eg1Var2.O0(false);
                        return;
                    case 2:
                        eg1 eg1Var3 = this.f34789b;
                        if (!eg1Var3.f36062s0) {
                            eg1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f34789b.finishPreviewFragment();
                        return;
                    default:
                        uy uyVar32 = this.f34789b.M0;
                        if (uyVar32 != null && (v0Var2 = uyVar32.f41285j0) != null) {
                            v0Var2.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        this.P0.setFitsSystemWindows(true);
        this.V = true;
        if (this.inPreviewMode && AndroidUtilities.isTablet()) {
            Iterator it = getParentLayout().getFragmentStack().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) it.next();
                if (n2Var instanceof uy) {
                    uy uyVar4 = (uy) n2Var;
                    if (uyVar4.h4()) {
                        MessagesStorage.TopicKey topicKey = uyVar4.f41314p2;
                        if (topicKey.dialogId == j3) {
                            this.Q0 = topicKey.topicId;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            U0(false, false);
        }
        O0(false);
        P0();
        if (ChatObject.isBoostSupported(g())) {
            getMessagesController().getBoostsController().getBoostsStats(j3, new xb(this, 5));
        }
        View view = this.fragmentView;
        df1 df1Var = new df1(this);
        WeakHashMap weakHashMap = r0.i0.f44697a;
        r0.a0.j(view, df1Var);
        return this.fragmentView;
    }

    @Override
    public final long d() {
        return 0L;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i12 = NotificationCenter.chatInfoDidLoad;
        long j3 = this.f36025a;
        if (i10 == i12) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.J) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.f19870id == j3) {
                O0(false);
                xh.d dVar = this.R0;
                if (dVar != null) {
                    dVar.f49407j = chatFull2;
                    dVar.e(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                z0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i10 == NotificationCenter.storiesUpdated) {
            O0(false);
        } else if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (j3 == (-((Long) objArr[2]).longValue())) {
                this.X = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i10 == NotificationCenter.topicsDidLoaded) {
            if (j3 == ((Long) objArr[0]).longValue()) {
                U0(false, true);
                if (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue()) {
                    y0();
                }
                A0();
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (intValue == MessagesController.UPDATE_MASK_CHAT) {
                O0(false);
            }
            if ((intValue & MessagesController.UPDATE_MASK_SELECT_DIALOG) > 0) {
                getMessagesController().getTopicsController().sortTopics(j3, false);
                boolean canScrollVertically = this.N.canScrollVertically(-1);
                U0(true, false);
                if (!canScrollVertically) {
                    this.F.n0(0);
                }
            }
        } else if (i10 == NotificationCenter.dialogsNeedReload) {
            U0(false, false);
        } else if (i10 == NotificationCenter.groupCallUpdated) {
            Long l4 = (Long) objArr[0];
            if (j3 == l4.longValue()) {
                this.H0 = getMessagesController().getGroupCall(l4.longValue(), false);
                y8 y8Var = this.G0;
                if (y8Var != null) {
                    y8Var.a(!this.fragmentBeginToShow);
                }
                z0(false);
            }
        } else if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            U0(false, false);
            O0(true);
        } else if (i10 != NotificationCenter.chatSwitchedForum && i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
        if (i10 == NotificationCenter.openedChatChanged && getParentActivity() != null && this.inPreviewMode && AndroidUtilities.isTablet()) {
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            long longValue = ((Long) objArr[0]).longValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            if (longValue == (-j3) && !booleanValue) {
                if (this.Q0 != longValue2) {
                    this.Q0 = longValue2;
                    U0(false, false);
                }
            } else if (this.Q0 != 0) {
                this.Q0 = 0L;
                U0(false, false);
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final TLRPC.Chat g() {
        return getMessagesController().getChat(Long.valueOf(this.f36025a));
    }

    @Override
    public final ChatObject.Call getGroupCall() {
        ChatObject.Call call = this.H0;
        if (call != null && (call.call instanceof TLRPC.TL_groupCall)) {
            return call;
        }
        return null;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.Components.ll0 ll0Var;
        xy0 xy0Var = new xy0(9, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.f20663d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20937s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20992v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20956t8));
        ag1 ag1Var = this.f36060r0;
        if (ag1Var != null && (ll0Var = ag1Var.U) != null) {
            org.telegram.ui.Cells.u3.a(arrayList, ll0Var);
        }
        return arrayList;
    }

    @Override
    public final TLRPC.User i() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        int i10;
        if (this.f36062s0) {
            i10 = org.telegram.ui.ActionBar.j6.f20663d6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f20937s8;
        }
        int themedColor = getThemedColor(i10);
        if (this.actionBar.s()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f21010w8);
        }
        if (i0.a.f(themedColor) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.co n() {
        return this.f36039f;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f36026a0.isEmpty()) {
            if (z10) {
                C0();
                return false;
            }
        } else if (this.f36062s0) {
            if (z10) {
                this.actionBar.v(this.f36057p0.L(false));
            }
        } else {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.h(true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j3 = this.f36025a;
        messagesController.loadFullChat(j3, 0, true);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.topicsDidLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupCallUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatSwitchedForum);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.openedChatChanged);
        U0(false, false);
        j71.t(this.currentAccount);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j3));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, false);
        }
        Long valueOf = Long.valueOf(j3);
        HashSet hashSet = f36024n1;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Long.valueOf(j3));
            TL_account.getNotifyExceptions getnotifyexceptions = new TL_account.getNotifyExceptions();
            TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
            getnotifyexceptions.peer = tL_inputNotifyPeer;
            getnotifyexceptions.flags |= 1;
            tL_inputNotifyPeer.peer = getMessagesController().getInputPeer(-j3);
            getConnectionsManager().sendRequest(getnotifyexceptions, null);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        this.O0.unlock();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.topicsDidLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupCallUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatSwitchedForum);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.openedChatChanged);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f36025a));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, true);
        }
        super.onFragmentDestroy();
        uy uyVar = this.M0;
        if (uyVar != null && uyVar.F3 != null) {
            uyVar.getActionBar().setSearchAvatarImageView(null);
            this.M0.F3.M = true;
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        getMessagesController().getTopicsController().onTopicFragmentPause(this.f36025a);
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        super.onResume();
        TopicsController topicsController = getMessagesController().getTopicsController();
        long j3 = this.f36025a;
        topicsController.onTopicFragmentResume(j3);
        this.G = false;
        AndroidUtilities.updateVisibleRows(this.N);
        this.G = true;
        setBulletinDelegate(new z8(this, 9));
        if (this.inPreviewMode && !getMessagesController().isForum(-j3)) {
            finishFragment();
        }
    }

    @Override
    public final void onSlideProgress(boolean z10, float f7) {
        if (SharedConfig.getDevicePerformanceClass() != 0 && this.T0) {
            L0(f7);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        ox oxVar;
        t50 t50Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (t50Var = this.P0) != null) {
            if (t50Var.getParent() != null) {
                ((ViewGroup) this.P0.getParent()).removeView(this.P0);
            }
            this.P0.setBackground(null);
        }
        if (z10) {
            z0(false);
        }
        this.O0.unlock();
        if (!z10) {
            if (this.f36063t0 && this.H) {
                removeSelfFromStack();
                uy uyVar = this.L0;
                if (uyVar != null) {
                    uyVar.removeSelfFromStack();
                }
            } else if (this.I) {
                removeSelfFromStack();
                uy uyVar2 = this.M0;
                if (uyVar2 != null && (oxVar = uyVar2.F3) != null && oxVar.c()) {
                    this.M0.F3.a();
                }
            }
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        t50 t50Var = this.P0;
        if (t50Var != null && t50Var.getVisibility() == 0) {
            if (z10) {
                this.P0.setAlpha(1.0f - f7);
            } else {
                this.P0.setAlpha(f7);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.O0.lock();
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.T0 = true;
            K0(true);
            return;
        }
        this.T0 = false;
        K0(false);
        L0(1.0f);
    }

    @Override
    public final void r() {
        this.N.x0(0);
    }

    @Override
    public final void setPreviewOpenedProgress(float f7) {
        org.telegram.ui.Components.co coVar = this.f36039f;
        if (coVar != null) {
            coVar.setAlpha(f7);
            this.f36058q0.setAlpha(f7);
            org.telegram.ui.ActionBar.v0 v0Var = this.f36057p0;
            if (v0Var != null) {
                v0Var.setAlpha(f7);
            }
            this.actionBar.getBackButton().setAlpha(f7);
        }
    }

    @Override
    public final void setPreviewReplaceProgress(float f7) {
        org.telegram.ui.Components.co coVar = this.f36039f;
        if (coVar != null) {
            coVar.setAlpha(f7);
            this.f36039f.setTranslationX((1.0f - f7) * AndroidUtilities.dp(40.0f));
        }
    }

    @Override
    public final gh.d x() {
        return this.f36045h1;
    }

    public final void x0() {
        bh.f fVar;
        View view;
        org.telegram.ui.ActionBar.k kVar;
        float f7;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f36041f1) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int dp2 = AndroidUtilities.dp(48.0f) + ((int) this.U0.c(AndroidUtilities.dp(14.0f)));
            uy uyVar = this.M0;
            if (uyVar != null) {
                view = uyVar.fragmentView;
            } else {
                view = this.fragmentView;
            }
            if (uyVar != null) {
                kVar = uyVar.getActionBar();
            } else {
                kVar = this.actionBar;
            }
            int measuredHeight = (view.getMeasuredHeight() - this.f36038e1) - AndroidUtilities.dp(8.0f);
            this.l1.set(0.0f, -dp, view.getMeasuredWidth(), kVar.getMeasuredHeight() + dp + dp2);
            RectF rectF = this.f36053m1;
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), view.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            if (this.M0 != null) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            fVar.g(i10, this.f36051k1);
            fVar.e(this.f36049j1, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    @Override
    public final org.telegram.ui.Components.ov0 y() {
        return this.d;
    }

    public final void y0() {
        gf1 gf1Var;
        TopicsController topicsController = this.f36061s;
        long j3 = this.f36025a;
        if (!topicsController.endIsReached(j3) && (gf1Var = this.F) != null) {
            int N0 = gf1Var.N0();
            if (this.f36028b.isEmpty() || N0 >= this.f36059r.h() - 5) {
                topicsController.loadTopics(j3);
            }
            A0();
        }
    }

    public final void z0(boolean z10) {
        String str;
        MessagesController messagesController = getMessagesController();
        long j3 = this.f36025a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j3);
        ChatObject.Call call = this.H0;
        if (call != null && ((str = this.f36071y0) != null || this.f36072z0)) {
            org.telegram.ui.Components.voip.d2.l(chat, str, false, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f36071y0 = null;
            this.f36072z0 = false;
        } else if (this.f36071y0 != null && z10 && chatFull != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.w1.o(R.string.LinkHashExpired, org.telegram.ui.Components.yc.a0(this), R.raw.linkbroken, 36);
            this.f36071y0 = null;
        }
    }

    @Override
    public final void o() {
    }

    @Override
    public final void F(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
    }
}
