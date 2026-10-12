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
public class lg1 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.ch, jh0 {
    public static final HashSet f37956n1 = new HashSet();
    public HashSet A0;
    public boolean B0;
    public boolean C0;
    public bi.p6 D0;
    public boolean E;
    public zf1 E0;
    public nf1 F;
    public FrameLayout F0;
    public boolean G;
    public b9 G0;
    public boolean H;
    public ChatObject.Call H0;
    public boolean I;
    public yf1 I0;
    public TLRPC.ChatFull J;
    public boolean J0;
    public boolean K;
    public org.telegram.ui.Components.rl0 K0;
    public org.telegram.ui.Components.i71 L;
    public yy L0;
    public int M;
    public yy M0;
    public wf1 N;
    public boolean N0;
    public pf1 O;
    public final AnimationNotificationsLocker O0;
    public kg1 P;
    public x50 P0;
    public org.telegram.ui.ActionBar.e1 Q;
    public long Q0;
    public org.telegram.ui.ActionBar.e1 R;
    public xh.d R0;
    public org.telegram.ui.ActionBar.e1 S;
    public float S0;
    public org.telegram.ui.ActionBar.e1 T;
    public boolean T0;
    public org.telegram.ui.ActionBar.e1 U;
    public org.telegram.ui.Components.xs U0;
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
    public final long f37957a;
    public final HashSet f37958a0;
    public org.telegram.ui.Components.j91 f37959a1;
    public final ArrayList f37960b;
    public boolean f37961b0;
    public View f37962b1;
    public int f37963c;
    public NumberTextView f37964c0;
    public int f37965c1;
    public sf1 d;
    public org.telegram.ui.ActionBar.u0 f37966d0;
    public int f37967d1;
    public l0 e;
    public org.telegram.ui.ActionBar.u0 f37968e0;
    public int f37969e1;
    public org.telegram.ui.Components.ro f37970f;
    public org.telegram.ui.ActionBar.u0 f37971f0;
    public final bh.f f37972f1;
    public org.telegram.ui.ActionBar.u0 f37973g0;
    public final gh.d f37974g1;
    public org.telegram.ui.Components.l20 h;
    public org.telegram.ui.ActionBar.u0 f37975h0;
    public final gh.d f37976h1;
    public org.telegram.ui.ActionBar.u0 f37977i0;
    public final bh.b f37978i1;
    public org.telegram.ui.ActionBar.e1 f37979j0;
    public bh.l f37980j1;
    public org.telegram.ui.ActionBar.e1 f37981k0;
    public final ArrayList f37982k1;
    public org.telegram.ui.ActionBar.e1 f37983l0;
    public final RectF l1;
    public org.telegram.ui.ActionBar.u0 m0;
    public final RectF f37984m1;
    public bg1 f37985n;
    public RadialProgressView f37986n0;
    public d61 f37987o0;
    public org.telegram.ui.ActionBar.u0 f37988p0;
    public org.telegram.ui.ActionBar.u0 f37989q0;
    public final ag1 f37990r;
    public hg1 f37991r0;
    public final TopicsController f37992s;
    public boolean f37993s0;
    public final boolean f37994t0;
    public final boolean f37995u0;
    public mg1 v;
    public final boolean f37996v0;
    public ex f37997w;
    public final boolean f37998w0;
    public int f37999x;
    public final boolean f38000x0;
    public int f38001y;
    public String f38002y0;
    public boolean f38003z0;

    public lg1(Bundle bundle) {
        super(bundle);
        this.f37960b = new ArrayList();
        new ArrayList();
        this.f37990r = new ag1(this);
        this.f37999x = 0;
        this.E = true;
        this.G = true;
        this.V = true;
        this.W = 0.0f;
        this.f37958a0 = new HashSet();
        this.B0 = false;
        this.O0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.topicsDidLoaded});
        this.S0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f37982k1 = arrayList;
        RectF rectF = new RectF();
        this.l1 = rectF;
        RectF rectF2 = new RectF();
        this.f37984m1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j10 = this.arguments.getLong("chat_id", 0L);
        this.f37957a = j10;
        this.f37994t0 = this.arguments.getBoolean("for_select", false);
        this.f37995u0 = this.arguments.getBoolean("forward_to", false);
        this.f38000x0 = this.arguments.getBoolean("bot_share_to", false);
        this.f37996v0 = this.arguments.getBoolean("quote", false);
        this.f37998w0 = this.arguments.getBoolean("reply_to", false);
        this.f38002y0 = this.arguments.getString("voicechat", null);
        this.f38003z0 = this.arguments.getBoolean("videochat", false);
        this.f37992s = getMessagesController().getTopicsController();
        this.V0 = true ^ org.telegram.messenger.q.x("topics_end_reached_", j10, getUserConfig().getPreferences(), false);
        gh.c cVar = new gh.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f37972f1 = new bh.f(false);
            this.f37974g1 = new gh.d(null);
            gh.d dVar = new gh.d(null);
            this.f37976h1 = dVar;
            bh.b bVar = new bh.b(dVar);
            this.f37978i1 = bVar;
            bVar.f2747i = LiteMode.isEnabled(262144);
            return;
        }
        this.f37972f1 = null;
        this.f37974g1 = null;
        this.f37976h1 = null;
        this.f37978i1 = new bh.b(cVar);
    }

    public static org.telegram.ui.ActionBar.m2 E0(MessagesController messagesController, MessagesStorage messagesStorage, Bundle bundle) {
        long j10 = bundle.getLong("chat_id");
        if (j10 != 0) {
            TLRPC.Dialog dialog = messagesController.getDialog(-j10);
            if (dialog != null && dialog.view_forum_as_messages) {
                return new fo(bundle);
            }
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j10);
            if (chatFull == null) {
                chatFull = messagesStorage.loadChatInfo(j10, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.view_forum_as_messages) {
                return new fo(bundle);
            }
        }
        return new lg1(bundle);
    }

    public static org.telegram.ui.ActionBar.m2 F0(LaunchActivity launchActivity, Bundle bundle) {
        return E0(MessagesController.getInstance(launchActivity.O), MessagesStorage.getInstance(launchActivity.O), bundle);
    }

    public static void I0(org.telegram.ui.fo r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lg1.I0(org.telegram.ui.fo):void");
    }

    public static boolean U(lg1 lg1Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(lg1Var.currentAccount).edit();
        edit.putLong("dialog_join_requested_time_" + (-lg1Var.f37957a), System.currentTimeMillis()).commit();
        Activity parentActivity = lg1Var.getParentActivity();
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(lg1Var.g());
        int i10 = org.telegram.ui.Components.g90.f25233r;
        org.telegram.ui.Components.g90.y(parentActivity, lg1Var, org.telegram.ui.Components.zc.a0(lg1Var), isChannelAndNotMegaGroup);
        lg1Var.O0(true);
        return false;
    }

    public static void V(lg1 lg1Var, View view) {
        long j10;
        long j11 = lg1Var.f37957a;
        if (lg1Var.getParentLayout() != null && !((ActionBarLayout) lg1Var.getParentLayout()).y() && (view instanceof ig1)) {
            TLRPC.TL_forumTopic tL_forumTopic = ((ig1) view).N;
            long j12 = -j11;
            boolean isMonoForum = lg1Var.getMessagesController().isMonoForum(j12);
            if (tL_forumTopic == null) {
                j10 = 0;
            } else if (isMonoForum) {
                j10 = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            } else {
                j10 = tL_forumTopic.f19268id;
            }
            long j13 = j10;
            if (lg1Var.f37994t0) {
                mg1 mg1Var = lg1Var.v;
                if (mg1Var != null) {
                    og1 og1Var = mg1Var.f38258a;
                    Bundle bundle = new Bundle();
                    rg1 rg1Var = og1Var.f38954a;
                    bundle.putLong("dialog_id", rg1Var.f39797c);
                    bundle.putLong("topic_id", tL_forumTopic.f19268id);
                    bundle.putBoolean("exception", true);
                    c21 c21Var = new c21(bundle, null);
                    c21Var.f34712r = new cs0(21, og1Var, tL_forumTopic);
                    rg1Var.presentFragment(c21Var);
                }
                yy yyVar = lg1Var.L0;
                if (yyVar != null) {
                    yyVar.L3(j12, j13, true, lg1Var);
                }
            } else if (lg1Var.f37958a0.size() > 0) {
                lg1Var.N0(view);
            } else {
                if (lg1Var.inPreviewMode && AndroidUtilities.isTablet()) {
                    for (org.telegram.ui.ActionBar.m2 m2Var : lg1Var.getParentLayout().getFragmentStack()) {
                        if (m2Var instanceof yy) {
                            yy yyVar2 = (yy) m2Var;
                            if (yyVar2.e4()) {
                                MessagesStorage.TopicKey topicKey = yyVar2.f42381p2;
                                if (topicKey.dialogId == j12 && topicKey.topicId == j13) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    lg1Var.Q0 = j13;
                    lg1Var.U0(false, false);
                }
                og.d.m(lg1Var, j11, tL_forumTopic, 0);
            }
        }
    }

    public static boolean W(lg1 lg1Var, View view, float f7) {
        if (lg1Var.f37994t0 || lg1Var.getParentLayout() == null || ((ActionBarLayout) lg1Var.getParentLayout()).y()) {
            return false;
        }
        if (!lg1Var.actionBar.t() && !AndroidUtilities.isTablet() && (view instanceof ig1)) {
            ig1 ig1Var = (ig1) view;
            if (ig1Var.S(f7)) {
                lg1Var.M0(ig1Var);
                lg1Var.N.I0(true);
                lg1Var.N.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        lg1Var.N0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void X(lg1 lg1Var) {
        ViewGroup viewGroup;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                viewGroup = lg1Var.N;
            } else {
                hg1 hg1Var = lg1Var.f37991r0;
                if (hg1Var != null) {
                    viewGroup = hg1Var.U;
                } else {
                    viewGroup = null;
                }
            }
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.i6) {
                        ((org.telegram.ui.Cells.i6) childAt).v(0);
                    } else if (childAt instanceof org.telegram.ui.Cells.s2) {
                        ((org.telegram.ui.Cells.s2) childAt).b0(0, true);
                    } else if (childAt instanceof org.telegram.ui.Cells.xa) {
                        ((org.telegram.ui.Cells.xa) childAt).j(0);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.k kVar = lg1Var.actionBar;
        if (kVar != null) {
            kVar.E(lg1Var.getThemedColor(org.telegram.ui.ActionBar.g6.G8), true);
            lg1Var.actionBar.F(lg1Var.getThemedColor(org.telegram.ui.ActionBar.g6.E8), false, true);
            lg1Var.actionBar.F(lg1Var.getThemedColor(org.telegram.ui.ActionBar.g6.F8), true, true);
            lg1Var.actionBar.G(lg1Var.getThemedColor(org.telegram.ui.ActionBar.g6.I5), true);
        }
        x50 x50Var = lg1Var.P0;
        if (x50Var != null) {
            x50Var.setForeground(new ColorDrawable(i0.a.k(lg1Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6), 100)));
        }
        lg1Var.P0();
    }

    public static void b0(lg1 lg1Var, boolean z10) {
        float f7;
        boolean z11;
        sx sxVar;
        lg1Var.f37993s0 = z10;
        ValueAnimator valueAnimator = lg1Var.Y0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            lg1Var.Y0.cancel();
        }
        if (lg1Var.f37959a1 == null) {
            org.telegram.ui.Components.j91 n10 = lg1Var.f37991r0.n(8, false);
            lg1Var.f37959a1 = n10;
            if (lg1Var.M0 != null) {
                n10.setBackgroundColor(lg1Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
            }
            lg1Var.e.addView(lg1Var.f37959a1, w7.a6.d(44.0f, -1));
        }
        float f10 = lg1Var.W;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        lg1Var.Y0 = ValueAnimator.ofFloat(f10, f7);
        AndroidUtilities.updateViewVisibilityAnimated(lg1Var.f37991r0, false, 1.0f, true);
        yy yyVar = lg1Var.M0;
        if (yyVar != null && (sxVar = yyVar.F3) != null) {
            sxVar.M = !z10;
        }
        if (!z10 && lg1Var.f37991r0.getVisibility() == 0 && lg1Var.f37991r0.getAlpha() == 1.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        lg1Var.Z0 = z11;
        lg1Var.Y0.addUpdateListener(new f21(lg1Var, 17));
        lg1Var.f37991r0.setVisibility(0);
        if (!z10) {
            lg1Var.f37989q0.setVisibility(0);
        } else {
            AndroidUtilities.requestAdjustResize(lg1Var.getParentActivity(), lg1Var.classGuid);
            lg1Var.Q0(false);
        }
        lg1Var.Y0.addListener(new uf1(lg1Var, z10, 0));
        lg1Var.Y0.setDuration(200L);
        lg1Var.Y0.setInterpolator(org.telegram.ui.Components.es.f24771f);
        lg1Var.Y0.start();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
    }

    @Override
    public final org.telegram.ui.Components.ow0 A() {
        return this.d;
    }

    public final void A0() {
        this.J0 = this.f37992s.isLoading(this.f37957a);
        if (this.D0 != null) {
            ArrayList arrayList = this.f37960b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((cg1) arrayList.get(0)).f34947c != null && ((cg1) arrayList.get(0)).f34947c.f19268id == 1)) {
                this.D0.e(this.J0, this.fragmentBeginToShow);
            }
        }
        wf1 wf1Var = this.N;
        if (wf1Var != null) {
            wf1Var.K0(wf1Var.v1());
        }
        Q0(true);
    }

    public final void B0() {
        int i10;
        float f7;
        float f10;
        yy yyVar = this.M0;
        float f11 = 0.0f;
        if (yyVar != null) {
            int dp = AndroidUtilities.dp(14.0f);
            org.telegram.ui.Components.xs xsVar = yyVar.J1;
            if (xsVar != null) {
                f7 = xsVar.c(dp);
            } else {
                f7 = 0.0f;
            }
            float f12 = f7 + 0.0f;
            org.telegram.ui.Components.xs xsVar2 = this.U0;
            if (xsVar2 != null) {
                float dp2 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.xs xsVar3 = this.M0.J1;
                if (xsVar3 != null) {
                    f10 = xsVar3.getMetadata().f16308c.f16316a;
                } else {
                    f10 = 0.0f;
                }
                xsVar2.setTranslationY(f12 - (f10 * dp2));
                org.telegram.ui.Components.xs xsVar4 = this.U0;
                int dp3 = AndroidUtilities.dp(14.0f);
                int dp4 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.xs xsVar5 = this.M0.J1;
                if (xsVar5 != null) {
                    f11 = xsVar5.getMetadata().f16308c.f16316a;
                }
                f11 = xsVar4.c(AndroidUtilities.lerp(dp3, dp4, f11)) + f12;
            } else {
                f11 = f12;
            }
        } else {
            org.telegram.ui.Components.xs xsVar6 = this.U0;
            if (xsVar6 != null) {
                f11 = 0.0f + xsVar6.c(AndroidUtilities.dp(14.0f));
            }
        }
        int i11 = this.f37969e1 + this.f37965c1;
        if (this.V) {
            i10 = AndroidUtilities.dp(51.0f);
        } else {
            i10 = 0;
        }
        this.N.setPadding(0, (int) f11, 0, i11 + i10);
    }

    public final void C0() {
        this.f37958a0.clear();
        this.actionBar.s();
        AndroidUtilities.updateVisibleRows(this.N);
        R0();
    }

    public final void D0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
        a2Var.R = pluralString;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            a2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, this.f37992s.findTopic(this.f37957a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            a2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a1.d(this, hashSet, arrayList, runnable, 19));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ul0(12));
        a2Var.show();
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20139q7));
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
        bundle.putLong("chat_id", this.f37957a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f37970f.getSharedMediaPreloader());
        profileActivity.K4(this.J);
        if (this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f37970f.getAvatarImageView().getImageReceiver().hasImageLoaded() && z10) {
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
            org.telegram.ui.Components.i71 i71Var = this.L;
            if (i10 == 0) {
                i11 = org.telegram.ui.ActionBar.g6.Ae;
            } else {
                i11 = org.telegram.ui.ActionBar.g6.f20139q7;
            }
            i71Var.setTextColorKey(i11);
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
        sf1 sf1Var = this.d;
        if (sf1Var != null) {
            if (z10) {
                sf1Var.setLayerType(2, null);
                sf1Var.setClipChildren(false);
                sf1Var.setClipToPadding(false);
            } else {
                sf1Var.setLayerType(0, null);
                sf1Var.setClipChildren(true);
                sf1Var.setClipToPadding(true);
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
            wf1 wf1Var = this.N;
            if (wf1Var != null) {
                float D = com.google.android.gms.internal.play_billing.k3.D(1.0f, this.S0, 0.05f, 1.0f);
                wf1Var.setPivotX(0.0f);
                wf1Var.setPivotY(0.0f);
                wf1Var.setScaleX(D);
                wf1Var.setScaleY(D);
                this.actionBar.setPivotX(0.0f);
                this.actionBar.setPivotY(0.0f);
                this.actionBar.setScaleX(D);
                this.actionBar.setScaleY(D);
            }
        }
    }

    public final void M0(org.telegram.ui.Cells.s2 s2Var) {
        long j10;
        try {
            s2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = s2Var.N;
        org.telegram.ui.Components.cp cpVar = new org.telegram.ui.Components.cp(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new rf1(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(cpVar.f24156f);
        cpVar.f24164o = 1;
        long j11 = this.f37957a;
        long j12 = -j11;
        cpVar.d(j12, tL_forumTopic.f19268id, null);
        if (ChatObject.canManageTopics(g())) {
            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                e1Var.g(LocaleController.getString(R.string.DialogUnpin), R.drawable.msg_unpin, null);
            } else {
                e1Var.g(LocaleController.getString(R.string.DialogPin), R.drawable.msg_pin, null);
            }
            e1Var.setMinimumWidth(160);
            e1Var.setOnClickListener(new View.OnClickListener(this) {
                public final lg1 f37949b;

                {
                    this.f37949b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            lg1 lg1Var = this.f37949b;
                            lg1Var.C0 = true;
                            lg1Var.N0 = true;
                            TopicsController topicsController = lg1Var.f37992s;
                            long j13 = lg1Var.f37957a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j13, tL_forumTopic2.f19268id, !tL_forumTopic2.pinned, lg1Var);
                            lg1Var.finishPreviewFragment();
                            return;
                        case 1:
                            lg1 lg1Var2 = this.f37949b;
                            lg1Var2.N0 = true;
                            TopicsController topicsController2 = lg1Var2.f37992s;
                            long j14 = lg1Var2.f37957a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j14, tL_forumTopic3.f19268id, true ^ tL_forumTopic3.closed);
                            lg1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f19268id));
                            lg1 lg1Var3 = this.f37949b;
                            lg1Var3.D0(hashSet, new jf1(lg1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(e1Var);
        }
        org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(getParentActivity(), false, false);
        if (getMessagesController().isDialogMuted(j12, tL_forumTopic.f19268id)) {
            e1Var2.g(LocaleController.getString(R.string.Unmute), R.drawable.msg_mute, null);
        } else {
            e1Var2.g(LocaleController.getString(R.string.Mute), R.drawable.msg_unmute, null);
        }
        e1Var2.setMinimumWidth(160);
        e1Var2.setOnClickListener(new bi.f7(this, tL_forumTopic, (Serializable) r32, b10, 6));
        r32[0].addView(e1Var2);
        if (ChatObject.canManageTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                e1Var3.g(LocaleController.getString(R.string.RestartTopic), R.drawable.msg_topic_restart, null);
            } else {
                e1Var3.g(LocaleController.getString(R.string.CloseTopic), R.drawable.msg_topic_close, null);
            }
            e1Var3.setMinimumWidth(160);
            e1Var3.setOnClickListener(new View.OnClickListener(this) {
                public final lg1 f37949b;

                {
                    this.f37949b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            lg1 lg1Var = this.f37949b;
                            lg1Var.C0 = true;
                            lg1Var.N0 = true;
                            TopicsController topicsController = lg1Var.f37992s;
                            long j13 = lg1Var.f37957a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j13, tL_forumTopic2.f19268id, !tL_forumTopic2.pinned, lg1Var);
                            lg1Var.finishPreviewFragment();
                            return;
                        case 1:
                            lg1 lg1Var2 = this.f37949b;
                            lg1Var2.N0 = true;
                            TopicsController topicsController2 = lg1Var2.f37992s;
                            long j14 = lg1Var2.f37957a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j14, tL_forumTopic3.f19268id, true ^ tL_forumTopic3.closed);
                            lg1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f19268id));
                            lg1 lg1Var3 = this.f37949b;
                            lg1Var3.D0(hashSet, new jf1(lg1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(e1Var3);
        }
        if (ChatObject.canDeleteTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(getParentActivity(), false, true);
            e1Var4.g(LocaleController.getPluralString("DeleteTopics", 1), R.drawable.msg_delete, null);
            e1Var4.setIconColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20122p7));
            e1Var4.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20139q7));
            e1Var4.setMinimumWidth(160);
            e1Var4.setOnClickListener(new View.OnClickListener(this) {
                public final lg1 f37949b;

                {
                    this.f37949b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            lg1 lg1Var = this.f37949b;
                            lg1Var.C0 = true;
                            lg1Var.N0 = true;
                            TopicsController topicsController = lg1Var.f37992s;
                            long j13 = lg1Var.f37957a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j13, tL_forumTopic2.f19268id, !tL_forumTopic2.pinned, lg1Var);
                            lg1Var.finishPreviewFragment();
                            return;
                        case 1:
                            lg1 lg1Var2 = this.f37949b;
                            lg1Var2.N0 = true;
                            TopicsController topicsController2 = lg1Var2.f37992s;
                            long j14 = lg1Var2.f37957a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j14, tL_forumTopic3.f19268id, true ^ tL_forumTopic3.closed);
                            lg1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f19268id));
                            lg1 lg1Var3 = this.f37949b;
                            lg1Var3.D0(hashSet, new jf1(lg1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(e1Var4);
        }
        boolean isMonoForum = getMessagesController().isMonoForum(j12);
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
            this.parentLayout.getOverlayContainerView().addView(this.P0, w7.a6.d(-1.0f, -1));
        }
        fo foVar = new fo(t8.b.e(j11, "chat_id"));
        if (isMonoForum) {
            j10 = DialogObject.getPeerDialogId(s2Var.N.from_id);
        } else {
            j10 = s2Var.N.f19268id;
        }
        og.d.a(foVar, MessagesStorage.TopicKey.of(j12, j10));
        presentFragmentAsPreviewWithMenu(foVar, r32[0]);
    }

    public final void N0(View view) {
        ig1 ig1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        TopicsController topicsController;
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        if ((view instanceof ig1) && (tL_forumTopic = (ig1Var = (ig1) view).N) != null) {
            int i20 = tL_forumTopic.f19268id;
            Integer valueOf = Integer.valueOf(i20);
            HashSet hashSet = this.f37958a0;
            if (!hashSet.remove(valueOf)) {
                hashSet.add(Integer.valueOf(i20));
            }
            ig1Var.V(hashSet.contains(Integer.valueOf(i20)), true);
            MessagesController messagesController = getMessagesController();
            long j10 = this.f37957a;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            if (!hashSet.isEmpty()) {
                if (!this.actionBar.a(null)) {
                    org.telegram.ui.ActionBar.y j11 = this.actionBar.j(null);
                    if (this.inPreviewMode) {
                        j11.setBackgroundColor(0);
                        j11.f20816a = false;
                    }
                    NumberTextView numberTextView = new NumberTextView(j11.getContext());
                    this.f37964c0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f37964c0.setTypeface(AndroidUtilities.bold());
                    this.f37964c0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20290y8));
                    j11.addView(this.f37964c0, w7.a6.m(1.0f, 0, -1, 72, 0, 0));
                    this.f37964c0.setOnTouchListener(new mf1(0));
                    this.f37966d0 = j11.g(4, R.drawable.msg_pin, AndroidUtilities.dp(54.0f));
                    this.f37968e0 = j11.g(5, R.drawable.msg_unpin, AndroidUtilities.dp(54.0f));
                    this.f37971f0 = j11.g(6, R.drawable.msg_mute, AndroidUtilities.dp(54.0f));
                    this.f37973g0 = j11.h(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                    org.telegram.ui.ActionBar.u0 h = j11.h(12, R.drawable.msg_archive_hide, LocaleController.getString(R.string.Hide), AndroidUtilities.dp(54.0f));
                    this.f37975h0 = h;
                    h.setVisibility(8);
                    org.telegram.ui.ActionBar.u0 h10 = j11.h(13, R.drawable.msg_archive_show, LocaleController.getString(R.string.Show), AndroidUtilities.dp(54.0f));
                    this.f37977i0 = h10;
                    h10.setVisibility(8);
                    org.telegram.ui.ActionBar.u0 h11 = j11.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(54.0f));
                    this.m0 = h11;
                    this.f37979j0 = h11.e(8, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
                    this.f37981k0 = this.m0.e(9, R.drawable.msg_topic_close, LocaleController.getString(R.string.CloseTopic));
                    this.f37983l0 = this.m0.e(10, R.drawable.msg_topic_restart, LocaleController.getString(R.string.RestartTopic));
                }
                if (this.inPreviewMode) {
                    ((View) this.fragmentView.getParent()).invalidate();
                }
                this.actionBar.O(null, null);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                Iterator it = hashSet.iterator();
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (true) {
                    boolean hasNext = it.hasNext();
                    topicsController = this.f37992s;
                    if (!hasNext) {
                        break;
                    }
                    HashSet hashSet2 = hashSet;
                    long intValue = ((Integer) it.next()).intValue();
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, intValue);
                    if (findTopic != null) {
                        if (findTopic.unread_count != 0) {
                            i21++;
                        }
                        if (ChatObject.canManageTopics(chat) && !findTopic.hidden) {
                            if (findTopic.pinned) {
                                i24++;
                            } else {
                                i23++;
                            }
                        }
                    }
                    if (getMessagesController().isDialogMuted(-j10, intValue)) {
                        i22++;
                    }
                    hashSet = hashSet2;
                }
                HashSet hashSet3 = hashSet;
                if (i21 > 0) {
                    this.f37979j0.setVisibility(0);
                    this.f37979j0.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
                    i10 = 8;
                } else {
                    i10 = 8;
                    this.f37979j0.setVisibility(8);
                }
                if (i22 != 0) {
                    this.B0 = false;
                    this.f37971f0.setIcon(R.drawable.msg_unmute);
                    this.f37971f0.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
                    z10 = true;
                } else {
                    z10 = true;
                    this.B0 = true;
                    this.f37971f0.setIcon(R.drawable.msg_mute);
                    this.f37971f0.setContentDescription(LocaleController.getString(R.string.ChatsMute));
                }
                org.telegram.ui.ActionBar.u0 u0Var = this.f37966d0;
                if (i23 == z10 && i24 == 0) {
                    i11 = 0;
                } else {
                    i11 = i10;
                }
                u0Var.setVisibility(i11);
                org.telegram.ui.ActionBar.u0 u0Var2 = this.f37968e0;
                if (i24 == z10 && i23 == 0) {
                    i12 = 0;
                } else {
                    i12 = i10;
                }
                u0Var2.setVisibility(i12);
                this.f37964c0.a(hashSet3.size(), z10);
                Iterator it2 = hashSet3.iterator();
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                while (it2.hasNext()) {
                    TLRPC.TL_forumTopic findTopic2 = topicsController.findTopic(j10, ((Integer) it2.next()).intValue());
                    if (findTopic2 != null) {
                        if (ChatObject.canDeleteTopic(this.currentAccount, chat, findTopic2)) {
                            i27++;
                        }
                        if (ChatObject.canManageTopic(this.currentAccount, chat, findTopic2)) {
                            if (findTopic2.f19268id == 1) {
                                if (findTopic2.hidden) {
                                    i29++;
                                } else {
                                    i28++;
                                }
                            }
                            if (!findTopic2.hidden) {
                                if (findTopic2.closed) {
                                    i25++;
                                } else {
                                    i26++;
                                }
                            }
                        }
                    }
                }
                org.telegram.ui.ActionBar.e1 e1Var = this.f37981k0;
                if (i25 == 0 && i26 > 0) {
                    i13 = 0;
                } else {
                    i13 = i10;
                }
                e1Var.setVisibility(i13);
                org.telegram.ui.ActionBar.e1 e1Var2 = this.f37981k0;
                if (i26 > 1) {
                    i14 = R.string.CloseTopics;
                } else {
                    i14 = R.string.CloseTopic;
                }
                e1Var2.setText(LocaleController.getString(i14));
                org.telegram.ui.ActionBar.e1 e1Var3 = this.f37983l0;
                if (i26 == 0 && i25 > 0) {
                    i15 = 0;
                } else {
                    i15 = i10;
                }
                e1Var3.setVisibility(i15);
                org.telegram.ui.ActionBar.e1 e1Var4 = this.f37983l0;
                if (i25 > 1) {
                    i16 = R.string.RestartTopics;
                } else {
                    i16 = R.string.RestartTopic;
                }
                e1Var4.setText(LocaleController.getString(i16));
                org.telegram.ui.ActionBar.u0 u0Var3 = this.f37973g0;
                if (i27 == hashSet3.size()) {
                    i17 = 0;
                } else {
                    i17 = i10;
                }
                u0Var3.setVisibility(i17);
                org.telegram.ui.ActionBar.u0 u0Var4 = this.f37975h0;
                if (i28 == 1 && hashSet3.size() == 1) {
                    i18 = 0;
                } else {
                    i18 = i10;
                }
                u0Var4.setVisibility(i18);
                org.telegram.ui.ActionBar.u0 u0Var5 = this.f37977i0;
                if (i29 == 1 && hashSet3.size() == 1) {
                    i19 = 0;
                } else {
                    i19 = i10;
                }
                u0Var5.setVisibility(i19);
                this.m0.l();
                R0();
                return;
            }
            this.actionBar.s();
        }
    }

    public final void O0(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lg1.O0(boolean):void");
    }

    public final void P0() {
        RadialProgressView radialProgressView = this.f37986n0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.g6.Ae));
        this.h.g();
        d61 d61Var = this.f37987o0;
        int i10 = org.telegram.ui.ActionBar.g6.f19901d6;
        d61Var.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(getThemedColor(i10));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20180s8));
        }
        this.f37991r0.setBackgroundColor(getThemedColor(i10));
    }

    public final void Q0(boolean z10) {
        boolean z11;
        if (this.Q == null) {
            return;
        }
        MessagesController messagesController = getMessagesController();
        long j10 = this.f37957a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        int i10 = 0;
        if (!ChatObject.isNotInChat(getMessagesController().getChat(Long.valueOf(j10))) && ChatObject.canCreateTopic(chat) && !this.f37993s0 && !this.f37994t0 && !this.J0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.K = z11;
        org.telegram.ui.ActionBar.e1 e1Var = this.Q;
        if (!z11) {
            i10 = 8;
        }
        e1Var.setVisibility(i10);
        G0(!this.K, z10);
    }

    public final void R0() {
        boolean z10;
        if (ChatObject.canManageTopics(g()) && !this.f37958a0.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f37961b0 != z10) {
            this.f37961b0 = z10;
            ag1 ag1Var = this.f37990r;
            ag1Var.q(0, ag1Var.h());
        }
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        return false;
    }

    public final void S0(float f7) {
        this.W = f7;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.f20235v8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f20290y8;
        kVar.D(i0.a.d(this.W, themedColor, getThemedColor(i10)), false);
        this.actionBar.D(i0.a.d(this.W, getThemedColor(i10), getThemedColor(i10)), true);
        this.actionBar.B(i0.a.d(this.W, getThemedColor(org.telegram.ui.ActionBar.g6.f20199t8), getThemedColor(org.telegram.ui.ActionBar.g6.f20307z8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(i0.a.d(this.W, getThemedColor(org.telegram.ui.ActionBar.g6.f20180s8), getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6)));
        }
        float f10 = 1.0f - f7;
        this.f37970f.getTitleTextView().setAlpha(f10);
        this.f37970f.getSubtitleTextView().setAlpha(f10);
        org.telegram.ui.Components.j91 j91Var = this.f37959a1;
        if (j91Var != null) {
            j91Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
            this.f37959a1.setAlpha(f7);
        }
        this.f37991r0.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
        this.f37991r0.setAlpha(f7);
        if (isInPreviewMode()) {
            this.e.invalidate();
        }
        this.d.invalidate();
        this.N.setAlpha(f10);
        if (this.Z0) {
            float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.W, 0.02f, 0.98f);
            this.N.setScaleX(y3);
            this.N.setScaleY(y3);
        }
    }

    public final void T0() {
        bi.p6 p6Var = this.D0;
        if (p6Var != null && p6Var.e != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
            org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(R.drawable.ic_ab_other, 0);
            brVar.setSize(AndroidUtilities.dp(16.0f));
            spannableStringBuilder.setSpan(brVar, 0, 1, 0);
            if (ChatObject.canUserDoAdminAction(g(), 15)) {
                this.D0.e.setText(AndroidUtilities.replaceCharSequence("%s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoTopicsDescription)), spannableStringBuilder));
                return;
            }
            String string = LocaleController.getString(R.string.General);
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.f37957a, 1L);
            if (findTopic != null) {
                string = findTopic.title;
            }
            this.D0.e.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoTopicsDescriptionUser", R.string.NoTopicsDescriptionUser, string)));
        }
    }

    public final void U0(boolean z10, boolean z11) {
        nf1 nf1Var;
        yf1 yf1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z10 && this.N0) {
            z10 = true;
        }
        this.N0 = false;
        TopicsController topicsController = this.f37992s;
        long j10 = this.f37957a;
        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j10);
        if (topics != null) {
            ArrayList arrayList = this.f37960b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            yf1 yf1Var2 = null;
            if (UserObject.isBotForum(this.currentAccount, -j10) && this.f37995u0) {
                arrayList.add(new cg1(3, null));
            }
            for (int i10 = 0; i10 < topics.size(); i10++) {
                HashSet hashSet = this.A0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(topics.get(i10).f19268id))) {
                    arrayList.add(new cg1(0, topics.get(i10)));
                }
            }
            if (!arrayList.isEmpty() && !topicsController.endIsReached(j10) && this.V0) {
                arrayList.add(new cg1(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.K0.b(size + 4);
                z10 = false;
            }
            this.f37999x = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                cg1 cg1Var = (cg1) arrayList.get(i11);
                if (cg1Var != null && (tL_forumTopic = cg1Var.f34947c) != null && tL_forumTopic.hidden) {
                    this.f37999x++;
                }
            }
            wf1 wf1Var = this.N;
            if (wf1Var != null) {
                s4.l0 itemAnimator = wf1Var.getItemAnimator();
                if (z10) {
                    yf1Var = this.I0;
                } else {
                    yf1Var = null;
                }
                if (itemAnimator != yf1Var) {
                    wf1 wf1Var2 = this.N;
                    if (z10) {
                        yf1Var2 = this.I0;
                    }
                    wf1Var2.setItemAnimator(yf1Var2);
                }
            }
            ag1 ag1Var = this.f37990r;
            if (ag1Var != null) {
                ag1Var.E(arrayList2, arrayList);
            }
            if ((this.C0 || size == 0) && (nf1Var = this.F) != null) {
                nf1Var.h1(0, 0);
                this.C0 = false;
            }
        }
        A0();
        T0();
    }

    @Override
    public final long a() {
        return -this.f37957a;
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
        yy yyVar = this.M0;
        if (yyVar != null && yyVar.W) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.f37965c1 = i10;
        yy yyVar2 = this.M0;
        if (yyVar2 != null && yyVar2.W) {
            i11 = AndroidUtilities.dp(64.0f);
        } else {
            i11 = 0;
        }
        this.f37967d1 = i11;
        sf1 sf1Var = new sf1(this, context);
        this.d = sf1Var;
        this.fragmentView = sf1Var;
        sf1Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
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
        i2.d.v(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new vf1(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) {
            public final lg1 f37109b;

            {
                this.f37109b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var;
                switch (r2) {
                    case 0:
                        lg1 lg1Var = this.f37109b;
                        lg1Var.presentFragment(hf1.a0(lg1Var.f37957a, 0L));
                        return;
                    case 1:
                        lg1 lg1Var2 = this.f37109b;
                        lg1Var2.getMessagesController().hidePeerSettingsBar(-lg1Var2.f37957a, null, lg1Var2.g());
                        lg1Var2.O0(false);
                        return;
                    case 2:
                        lg1 lg1Var3 = this.f37109b;
                        if (!lg1Var3.f37993s0) {
                            lg1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f37109b.finishPreviewFragment();
                        return;
                    default:
                        yy yyVar3 = this.f37109b.M0;
                        if (yyVar3 != null && (u0Var = yyVar3.f42351j0) != null) {
                            u0Var.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
        if (this.M0 != null) {
            org.telegram.ui.ActionBar.u0 a2 = n10.a(0, R.drawable.outline_header_search);
            this.f37988p0 = a2;
            a2.setOnClickListener(new View.OnClickListener(this) {
                public final lg1 f37109b;

                {
                    this.f37109b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.u0 u0Var;
                    switch (r2) {
                        case 0:
                            lg1 lg1Var = this.f37109b;
                            lg1Var.presentFragment(hf1.a0(lg1Var.f37957a, 0L));
                            return;
                        case 1:
                            lg1 lg1Var2 = this.f37109b;
                            lg1Var2.getMessagesController().hidePeerSettingsBar(-lg1Var2.f37957a, null, lg1Var2.g());
                            lg1Var2.O0(false);
                            return;
                        case 2:
                            lg1 lg1Var3 = this.f37109b;
                            if (!lg1Var3.f37993s0) {
                                lg1Var3.H0(false);
                                return;
                            }
                            return;
                        case 3:
                            this.f37109b.finishPreviewFragment();
                            return;
                        default:
                            yy yyVar3 = this.f37109b.M0;
                            if (yyVar3 != null && (u0Var = yyVar3.f42351j0) != null) {
                                u0Var.performClick();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.u0 a10 = n10.a(0, R.drawable.outline_header_search);
            this.f37988p0 = a10;
            a10.F();
            a10.H = new ig.d2(this, 18);
            this.f37988p0.setSearchPaddingStart(56);
            this.f37988p0.setSearchFieldHint(LocaleController.getString(R.string.Search));
            EditTextBoldCursor searchField = this.f37988p0.getSearchField();
            searchField.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.G6));
            searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Si));
            searchField.setCursorColor(getThemedColor(org.telegram.ui.ActionBar.g6.Wd));
        }
        org.telegram.ui.ActionBar.u0 c10 = n10.c(0, R.drawable.ic_ab_other, null);
        this.f37989q0 = c10;
        c10.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.f37989q0.e(1, R.drawable.msg_discussion, LocaleController.getString(R.string.TopicViewAsMessages));
        this.R = this.f37989q0.e(2, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddMember));
        org.telegram.ui.ActionBar.u0 u0Var = this.f37989q0;
        this.T = u0Var.d(14, 0, new org.telegram.ui.Components.yj0(R.raw.boosts, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f)), LocaleController.getString(R.string.BoostingBoostGroupMenu), true, false, u0Var.m0);
        this.Q = this.f37989q0.e(3, R.drawable.msg_topic_create, LocaleController.getString(R.string.CreateTopic));
        this.U = this.f37989q0.e(15, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat));
        this.S = this.f37989q0.f(11, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMegaMenu), null);
        org.telegram.ui.Components.ro roVar = new org.telegram.ui.Components.ro(context, this, false, this.resourceProvider);
        this.f37970f = roVar;
        roVar.getAvatarImageView().setRoundRadius(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.ro roVar2 = this.f37970f;
        if (!AndroidUtilities.isTablet() && !this.inPreviewMode) {
            z11 = true;
        } else {
            z11 = false;
        }
        roVar2.setOccupyStatusBar(z11);
        org.telegram.ui.Components.ro roVar3 = this.f37970f;
        long j10 = -this.f37957a;
        if (j10 < 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        roVar3.f28887b = z12;
        roVar3.setClipChildren(false);
        this.actionBar.addView(this.f37970f, 0, w7.a6.a(-1.0f, 56.0f, 0.0f, 86.0f, 0.0f, -2, 51));
        if (!this.f37994t0) {
            this.f37970f.getAvatarImageView().setOnClickListener(new c8(this, 3));
        }
        this.N = new wf1(this, context);
        ih.j jVar = new ih.j(this.d);
        ViewGroup viewGroup = this.d;
        bh.b bVar = this.f37978i1;
        bVar.f2745f = jVar;
        bVar.f2746g = viewGroup;
        wf1 wf1Var = this.N;
        yy yyVar3 = this.M0;
        if (yyVar3 != null) {
            viewGroup = (ViewGroup) yyVar3.getFragmentView();
        }
        wf1 wf1Var2 = this.N;
        Objects.requireNonNull(wf1Var2);
        this.f37980j1 = new bh.l(wf1Var, viewGroup, new y8(wf1Var2, 2));
        this.N.C0(new jf1(this, 5));
        SpannableString spannableString = new SpannableString("#");
        og.c c11 = og.d.c(getParentActivity(), 0.85f, -1, false);
        c11.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
        spannableString.setSpan(new ImageSpan(c11, 2), 0, 1, 33);
        ex exVar = new ex(this, AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccSwipeForGeneral), spannableString), AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccReleaseForGeneral), spannableString));
        this.f37997w = exVar;
        exVar.b();
        if (this.E) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        this.f38001y = i12;
        ex exVar2 = this.f37997w;
        if (i12 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        exVar2.X = z13;
        yf1 yf1Var = new yf1(this);
        this.N.setHideIfEmpty(false);
        yf1Var.f44872m = false;
        yf1Var.C = false;
        wf1 wf1Var3 = this.N;
        this.I0 = yf1Var;
        wf1Var3.setItemAnimator(yf1Var);
        this.N.setOnScrollListener(new of1(this, 1));
        wf1 wf1Var4 = this.N;
        wf1Var4.W1 = true;
        wf1Var4.X1 = 0;
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(wf1Var4, true);
        this.K0 = rl0Var;
        this.N.setItemsEnterAnimator(rl0Var);
        this.N.setOnItemClickListener(new i21(this, 11));
        this.N.setOnItemLongClickListener(new kf1(this));
        this.N.setOnScrollListener(new of1(this, 2));
        wf1 wf1Var5 = this.N;
        nf1 nf1Var = new nf1(this);
        this.F = nf1Var;
        wf1Var5.setLayoutManager(nf1Var);
        new SparseArray();
        new HashMap();
        this.N.setAdapter(this.f37990r);
        this.N.setClipToPadding(false);
        this.N.j(new of1(this, 0));
        kg1 kg1Var = new kg1(this);
        this.P = kg1Var;
        pf1 pf1Var = new pf1(this, kg1Var);
        this.O = pf1Var;
        pf1Var.d(this.N);
        this.d.addView(this.N, w7.a6.d(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.N.getLayoutParams()).topMargin = -AndroidUtilities.dp(100.0f);
        org.telegram.ui.Components.l20 l20Var = new org.telegram.ui.Components.l20(getParentActivity(), this.resourceProvider, false);
        this.h = l20Var;
        this.d.addView(l20Var, org.telegram.ui.Components.l20.b());
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final lg1 f37109b;

            {
                this.f37109b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var2;
                switch (r2) {
                    case 0:
                        lg1 lg1Var = this.f37109b;
                        lg1Var.presentFragment(hf1.a0(lg1Var.f37957a, 0L));
                        return;
                    case 1:
                        lg1 lg1Var2 = this.f37109b;
                        lg1Var2.getMessagesController().hidePeerSettingsBar(-lg1Var2.f37957a, null, lg1Var2.g());
                        lg1Var2.O0(false);
                        return;
                    case 2:
                        lg1 lg1Var3 = this.f37109b;
                        if (!lg1Var3.f37993s0) {
                            lg1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f37109b.finishPreviewFragment();
                        return;
                    default:
                        yy yyVar32 = this.f37109b.M0;
                        if (yyVar32 != null && (u0Var2 = yyVar32.f42351j0) != null) {
                            u0Var2.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        this.h.f26914c.setImageResource(R.drawable.ic_chatlist_add_2);
        this.h.f26914c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.f26914c.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.h.setContentDescription(LocaleController.getString(R.string.CreateTopic));
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, null);
        f10Var.setViewType(24);
        f10Var.setVisibility(8);
        f10Var.f24856w = true;
        ?? frameLayout = new FrameLayout(context);
        TextView textView = new TextView(context);
        frameLayout.f34536a = textView;
        if (LocaleController.isRTL) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.br(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TapToCreateTopicHint));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.TapToCreateTopicHint));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.br(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20288y6));
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
        frameLayout.addView(textView, w7.a6.a(-2.0f, f7, 0.0f, f10, 32.0f, -2, 81));
        this.f37985n = frameLayout;
        textView.setAlpha(0.0f);
        bi.p6 p6Var = new bi.p6(this, context, f10Var);
        this.D0 = p6Var;
        try {
            p6Var.f30996b.getImageReceiver().setAutoRepeat(2);
        } catch (Exception unused) {
        }
        this.D0.e(this.J0, this.fragmentBeginToShow);
        this.D0.d.setText(LocaleController.getString(R.string.NoTopics));
        T0();
        this.f37985n.addView(f10Var);
        this.f37985n.addView(this.D0);
        this.d.addView(this.f37985n);
        this.N.setEmptyView(this.f37985n);
        this.f37987o0 = new d61(context, 6);
        org.telegram.ui.Components.i71 i71Var = new org.telegram.ui.Components.i71(context);
        this.L = i71Var;
        this.f37987o0.addView(i71Var);
        this.d.addView(this.f37987o0, w7.a6.e(-1, 51, 80));
        this.L.setOnClickListener(new qf1(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f37986n0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(22.0f));
        this.f37986n0.setVisibility(4);
        this.f37987o0.addView(this.f37986n0, w7.a6.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.W0 = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.W0.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView2 = this.W0;
        int i13 = org.telegram.ui.ActionBar.g6.f19907de;
        imageView2.setBackground(org.telegram.ui.ActionBar.w5.c(null, org.telegram.ui.ActionBar.w5.b(getThemedColor(i13))));
        this.W0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), PorterDuff.Mode.MULTIPLY));
        this.W0.setScaleType(ImageView.ScaleType.CENTER);
        this.f37987o0.addView(this.W0, w7.a6.a(36.0f, 0.0f, 6.0f, 2.0f, 0.0f, 36, 53));
        this.W0.setOnClickListener(new View.OnClickListener(this) {
            public final lg1 f37109b;

            {
                this.f37109b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var2;
                switch (r2) {
                    case 0:
                        lg1 lg1Var = this.f37109b;
                        lg1Var.presentFragment(hf1.a0(lg1Var.f37957a, 0L));
                        return;
                    case 1:
                        lg1 lg1Var2 = this.f37109b;
                        lg1Var2.getMessagesController().hidePeerSettingsBar(-lg1Var2.f37957a, null, lg1Var2.g());
                        lg1Var2.O0(false);
                        return;
                    case 2:
                        lg1 lg1Var3 = this.f37109b;
                        if (!lg1Var3.f37993s0) {
                            lg1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f37109b.finishPreviewFragment();
                        return;
                    default:
                        yy yyVar32 = this.f37109b.M0;
                        if (yyVar32 != null && (u0Var2 = yyVar32.f42351j0) != null) {
                            u0Var2.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        this.W0.setVisibility(8);
        O0(false);
        l0 l0Var = new l0(this, context, 25);
        this.e = l0Var;
        if (this.M0 == null) {
            this.d.addView(l0Var, w7.a6.e(-1, -1, 119));
        }
        hg1 hg1Var = new hg1(this, context);
        this.f37991r0 = hg1Var;
        hg1Var.setVisibility(8);
        this.e.addView(this.f37991r0, w7.a6.a(-1.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 119));
        hg1 hg1Var2 = this.f37991r0;
        int i14 = org.telegram.ui.ActionBar.g6.f19901d6;
        hg1Var2.setBackgroundColor(getThemedColor(i14));
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().loadChatInfo(this.f37957a, true, null, true, false, 0);
        org.telegram.ui.Components.xs xsVar = new org.telegram.ui.Components.xs(context);
        this.U0 = xsVar;
        xsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        dh.d c12 = bVar.c(this.U0, fh.b.n(this.resourceProvider), false);
        c12.q(AndroidUtilities.dp(24.0f));
        c12.p(AndroidUtilities.dp(7.0f));
        this.U0.setBlurredBackground(c12);
        this.U0.setOnAnimatedHeightChangedListener(new jf1(this, 0));
        this.d.addView(this.U0, w7.a6.a(-2.0f, 0.0f, -14.0f, 0.0f, 0.0f, -1, 48));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            xh.d dVar = new xh.d(g10, this);
            this.R0 = dVar;
            this.U0.addView(dVar.c(), w7.a6.n(-1, 40));
            this.U0.h(3, this.R0.c());
            this.U0.g(this.R0.c());
            xh.d dVar2 = this.R0;
            dVar2.f48452m = new kf1(this);
            TLRPC.ChatFull chatFull = this.J;
            dVar2.f48449j = chatFull;
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
            b9 b9Var = new b9(this, context, this);
            this.G0 = b9Var;
            this.F0.addView(b9Var);
            this.U0.setCallFragmentContextView(this.G0);
        }
        FrameLayout.LayoutParams d = w7.a6.d(-2.0f, -1);
        if (this.inPreviewMode) {
            d.topMargin = AndroidUtilities.statusBarHeight;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, d);
        }
        y0();
        x50 x50Var = new x50(this, context, 10);
        this.P0 = x50Var;
        x50Var.setForeground(new ColorDrawable(i0.a.k(getThemedColor(i14), 100)));
        this.P0.setFocusable(false);
        this.P0.setImportantForAccessibility(2);
        this.P0.setOnClickListener(new View.OnClickListener(this) {
            public final lg1 f37109b;

            {
                this.f37109b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var2;
                switch (r2) {
                    case 0:
                        lg1 lg1Var = this.f37109b;
                        lg1Var.presentFragment(hf1.a0(lg1Var.f37957a, 0L));
                        return;
                    case 1:
                        lg1 lg1Var2 = this.f37109b;
                        lg1Var2.getMessagesController().hidePeerSettingsBar(-lg1Var2.f37957a, null, lg1Var2.g());
                        lg1Var2.O0(false);
                        return;
                    case 2:
                        lg1 lg1Var3 = this.f37109b;
                        if (!lg1Var3.f37993s0) {
                            lg1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f37109b.finishPreviewFragment();
                        return;
                    default:
                        yy yyVar32 = this.f37109b.M0;
                        if (yyVar32 != null && (u0Var2 = yyVar32.f42351j0) != null) {
                            u0Var2.performClick();
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
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) it.next();
                if (m2Var instanceof yy) {
                    yy yyVar4 = (yy) m2Var;
                    if (yyVar4.e4()) {
                        MessagesStorage.TopicKey topicKey = yyVar4.f42381p2;
                        if (topicKey.dialogId == j10) {
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
            getMessagesController().getBoostsController().getBoostsStats(j10, new v3(this, 26));
        }
        View view = this.fragmentView;
        kf1 kf1Var = new kf1(this);
        WeakHashMap weakHashMap = r0.j0.f43732a;
        r0.b0.i(view, kf1Var);
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
        long j10 = this.f37957a;
        if (i10 == i12) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.J) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.f19217id == j10) {
                O0(false);
                xh.d dVar = this.R0;
                if (dVar != null) {
                    dVar.f48449j = chatFull2;
                    dVar.e(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                z0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i10 == NotificationCenter.storiesUpdated) {
            O0(false);
        } else if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (j10 == (-((Long) objArr[2]).longValue())) {
                this.X = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i10 == NotificationCenter.topicsDidLoaded) {
            if (j10 == ((Long) objArr[0]).longValue()) {
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
                getMessagesController().getTopicsController().sortTopics(j10, false);
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
            if (j10 == l4.longValue()) {
                this.H0 = getMessagesController().getGroupCall(l4.longValue(), false);
                b9 b9Var = this.G0;
                if (b9Var != null) {
                    b9Var.a(!this.fragmentBeginToShow);
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
            if (longValue == (-j10) && !booleanValue) {
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
        return getMessagesController().getChat(Long.valueOf(this.f37957a));
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
        org.telegram.ui.Components.mm0 mm0Var;
        cz0 cz0Var = new cz0(9, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.f19901d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f20180s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f20235v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f20199t8));
        hg1 hg1Var = this.f37991r0;
        if (hg1Var != null && (mm0Var = hg1Var.U) != null) {
            org.telegram.ui.Cells.v3.a(arrayList, mm0Var);
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
        if (this.f37993s0) {
            i10 = org.telegram.ui.ActionBar.g6.f19901d6;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.f20180s8;
        }
        int themedColor = getThemedColor(i10);
        if (this.actionBar.t()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.f20254w8);
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
    public final boolean n() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.ro o() {
        return this.f37970f;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f37958a0.isEmpty()) {
            if (z10) {
                C0();
                return false;
            }
        } else if (this.f37993s0) {
            if (z10) {
                this.actionBar.w(this.f37988p0.L(false));
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
        long j10 = this.f37957a;
        messagesController.loadFullChat(j10, 0, true);
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
        r71.t(this.currentAccount);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, false);
        }
        Long valueOf = Long.valueOf(j10);
        HashSet hashSet = f37956n1;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Long.valueOf(j10));
            TL_account.getNotifyExceptions getnotifyexceptions = new TL_account.getNotifyExceptions();
            TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
            getnotifyexceptions.peer = tL_inputNotifyPeer;
            getnotifyexceptions.flags |= 1;
            tL_inputNotifyPeer.peer = getMessagesController().getInputPeer(-j10);
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
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f37957a));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, true);
        }
        super.onFragmentDestroy();
        yy yyVar = this.M0;
        if (yyVar != null && yyVar.F3 != null) {
            yyVar.getActionBar().setSearchAvatarImageView(null);
            this.M0.F3.M = true;
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        getMessagesController().getTopicsController().onTopicFragmentPause(this.f37957a);
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        super.onResume();
        TopicsController topicsController = getMessagesController().getTopicsController();
        long j10 = this.f37957a;
        topicsController.onTopicFragmentResume(j10);
        this.G = false;
        AndroidUtilities.updateVisibleRows(this.N);
        this.G = true;
        setBulletinDelegate(new c9(this, 9));
        if (this.inPreviewMode && !getMessagesController().isForum(-j10)) {
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
        sx sxVar;
        x50 x50Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (x50Var = this.P0) != null) {
            if (x50Var.getParent() != null) {
                ((ViewGroup) this.P0.getParent()).removeView(this.P0);
            }
            this.P0.setBackground(null);
        }
        if (z10) {
            z0(false);
        }
        this.O0.unlock();
        if (!z10) {
            if (this.f37994t0 && this.H) {
                removeSelfFromStack();
                yy yyVar = this.L0;
                if (yyVar != null) {
                    yyVar.removeSelfFromStack();
                }
            } else if (this.I) {
                removeSelfFromStack();
                yy yyVar2 = this.M0;
                if (yyVar2 != null && (sxVar = yyVar2.F3) != null && sxVar.c()) {
                    this.M0.F3.a();
                }
            }
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        x50 x50Var = this.P0;
        if (x50Var != null && x50Var.getVisibility() == 0) {
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
    public final void setPreviewOpenedProgress(float f7) {
        org.telegram.ui.Components.ro roVar = this.f37970f;
        if (roVar != null) {
            roVar.setAlpha(f7);
            this.f37989q0.setAlpha(f7);
            org.telegram.ui.ActionBar.u0 u0Var = this.f37988p0;
            if (u0Var != null) {
                u0Var.setAlpha(f7);
            }
            this.actionBar.getBackButton().setAlpha(f7);
        }
    }

    @Override
    public final void setPreviewReplaceProgress(float f7) {
        org.telegram.ui.Components.ro roVar = this.f37970f;
        if (roVar != null) {
            roVar.setAlpha(f7);
            this.f37970f.setTranslationX((1.0f - f7) * AndroidUtilities.dp(40.0f));
        }
    }

    @Override
    public final void t() {
        this.N.x0(0);
    }

    public final void x0() {
        bh.f fVar;
        View view;
        org.telegram.ui.ActionBar.k kVar;
        float f7;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f37972f1) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int dp2 = AndroidUtilities.dp(48.0f) + ((int) this.U0.c(AndroidUtilities.dp(14.0f)));
            yy yyVar = this.M0;
            if (yyVar != null) {
                view = yyVar.fragmentView;
            } else {
                view = this.fragmentView;
            }
            if (yyVar != null) {
                kVar = yyVar.getActionBar();
            } else {
                kVar = this.actionBar;
            }
            int measuredHeight = (view.getMeasuredHeight() - this.f37969e1) - AndroidUtilities.dp(8.0f);
            this.l1.set(0.0f, -dp, view.getMeasuredWidth(), kVar.getMeasuredHeight() + dp + dp2);
            RectF rectF = this.f37984m1;
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
            fVar.g(i10, this.f37982k1);
            fVar.e(this.f37980j1, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final void y0() {
        nf1 nf1Var;
        TopicsController topicsController = this.f37992s;
        long j10 = this.f37957a;
        if (!topicsController.endIsReached(j10) && (nf1Var = this.F) != null) {
            int N0 = nf1Var.N0();
            if (this.f37960b.isEmpty() || N0 >= this.f37990r.h() - 5) {
                topicsController.loadTopics(j10);
            }
            A0();
        }
    }

    @Override
    public final gh.d z() {
        return this.f37976h1;
    }

    public final void z0(boolean z10) {
        String str;
        MessagesController messagesController = getMessagesController();
        long j10 = this.f37957a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
        ChatObject.Call call = this.H0;
        if (call != null && ((str = this.f38002y0) != null || this.f38003z0)) {
            org.telegram.ui.Components.voip.d2.l(chat, str, false, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f38002y0 = null;
            this.f38003z0 = false;
        } else if (this.f38002y0 != null && z10 && chatFull != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.q.r(R.string.LinkHashExpired, org.telegram.ui.Components.zc.a0(this), R.raw.linkbroken, 36);
            this.f38002y0 = null;
        }
    }

    @Override
    public final void q() {
    }

    @Override
    public final void j(int i10, int i11, boolean z10, int i12, boolean z11, int i13) {
    }
}
