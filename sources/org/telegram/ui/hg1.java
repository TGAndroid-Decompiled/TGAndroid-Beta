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
public class hg1 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.gh, fh0 {
    public static final HashSet f38375n1 = new HashSet();
    public HashSet A0;
    public boolean B0;
    public boolean C0;
    public ai.e7 D0;
    public boolean E;
    public vf1 E0;
    public jf1 F;
    public FrameLayout F0;
    public boolean G;
    public a9 G0;
    public boolean H;
    public ChatObject.Call H0;
    public boolean I;
    public uf1 I0;
    public TLRPC.ChatFull J;
    public boolean J0;
    public boolean K;
    public org.telegram.ui.Components.bm0 K0;
    public org.telegram.ui.Components.q71 L;
    public vy L0;
    public int M;
    public vy M0;
    public sf1 N;
    public boolean N0;
    public lf1 O;
    public final AnimationNotificationsLocker O0;
    public gg1 P;
    public s50 P0;
    public org.telegram.ui.ActionBar.e1 Q;
    public long Q0;
    public org.telegram.ui.ActionBar.e1 R;
    public wh.d R0;
    public org.telegram.ui.ActionBar.e1 S;
    public float S0;
    public org.telegram.ui.ActionBar.e1 T;
    public boolean T0;
    public org.telegram.ui.ActionBar.e1 U;
    public org.telegram.ui.Components.ct U0;
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
    public final long f38376a;
    public final HashSet f38377a0;
    public org.telegram.ui.Components.t91 f38378a1;
    public final ArrayList f38379b;
    public boolean f38380b0;
    public View f38381b1;
    public int f38382c;
    public NumberTextView f38383c0;
    public int f38384c1;
    public of1 d;
    public org.telegram.ui.ActionBar.u0 f38385d0;
    public int f38386d1;
    public k0 f38387e;
    public org.telegram.ui.ActionBar.u0 f38388e0;
    public int f38389e1;
    public org.telegram.ui.Components.wo f38390f;
    public org.telegram.ui.ActionBar.u0 f38391f0;
    public final ah.h f38392f1;
    public org.telegram.ui.ActionBar.u0 f38393g0;
    public final fh.d f38394g1;
    public org.telegram.ui.Components.s20 h;
    public org.telegram.ui.ActionBar.u0 f38395h0;
    public final fh.d f38396h1;
    public org.telegram.ui.ActionBar.u0 f38397i0;
    public final ah.c f38398i1;
    public org.telegram.ui.ActionBar.e1 f38399j0;
    public ah.n f38400j1;
    public org.telegram.ui.ActionBar.e1 f38401k0;
    public final ArrayList f38402k1;
    public org.telegram.ui.ActionBar.e1 f38403l0;
    public final RectF l1;
    public org.telegram.ui.ActionBar.u0 m0;
    public final RectF f38404m1;
    public xf1 f38405n;
    public RadialProgressView f38406n0;
    public z51 f38407o0;
    public org.telegram.ui.ActionBar.u0 f38408p0;
    public org.telegram.ui.ActionBar.u0 f38409q0;
    public final wf1 f38410r;
    public dg1 f38411r0;
    public final TopicsController f38412s;
    public boolean f38413s0;
    public final boolean f38414t0;
    public final boolean f38415u0;
    public ig1 v;
    public final boolean f38416v0;
    public bx f38417w;
    public final boolean f38418w0;
    public int f38419x;
    public final boolean f38420x0;
    public int f38421y;
    public String f38422y0;
    public boolean f38423z0;

    public hg1(Bundle bundle) {
        super(bundle);
        this.f38379b = new ArrayList();
        new ArrayList();
        this.f38410r = new wf1(this);
        this.f38419x = 0;
        this.E = true;
        this.G = true;
        this.V = true;
        this.W = 0.0f;
        this.f38377a0 = new HashSet();
        this.B0 = false;
        this.O0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.topicsDidLoaded});
        this.S0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f38402k1 = arrayList;
        RectF rectF = new RectF();
        this.l1 = rectF;
        RectF rectF2 = new RectF();
        this.f38404m1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j3 = this.arguments.getLong("chat_id", 0L);
        this.f38376a = j3;
        this.f38414t0 = this.arguments.getBoolean("for_select", false);
        this.f38415u0 = this.arguments.getBoolean("forward_to", false);
        this.f38420x0 = this.arguments.getBoolean("bot_share_to", false);
        this.f38416v0 = this.arguments.getBoolean("quote", false);
        this.f38418w0 = this.arguments.getBoolean("reply_to", false);
        this.f38422y0 = this.arguments.getString("voicechat", null);
        this.f38423z0 = this.arguments.getBoolean("videochat", false);
        this.f38412s = getMessagesController().getTopicsController();
        this.V0 = true ^ org.telegram.messenger.v0.v("topics_end_reached_", j3, getUserConfig().getPreferences(), false);
        fh.c cVar = new fh.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.h6.f20559d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f38392f1 = new ah.h(false);
            this.f38394g1 = new fh.d(null);
            fh.d dVar = new fh.d(null);
            this.f38396h1 = dVar;
            ah.c cVar2 = new ah.c(dVar);
            this.f38398i1 = cVar2;
            cVar2.f549i = LiteMode.isEnabled(262144);
            return;
        }
        this.f38392f1 = null;
        this.f38394g1 = null;
        this.f38396h1 = null;
        this.f38398i1 = new ah.c(cVar);
    }

    public static org.telegram.ui.ActionBar.m2 E0(MessagesController messagesController, MessagesStorage messagesStorage, Bundle bundle) {
        long j3 = bundle.getLong("chat_id");
        if (j3 != 0) {
            TLRPC.Dialog dialog = messagesController.getDialog(-j3);
            if (dialog != null && dialog.view_forum_as_messages) {
                return new eo(bundle);
            }
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j3);
            if (chatFull == null) {
                chatFull = messagesStorage.loadChatInfo(j3, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.view_forum_as_messages) {
                return new eo(bundle);
            }
        }
        return new hg1(bundle);
    }

    public static org.telegram.ui.ActionBar.m2 F0(LaunchActivity launchActivity, Bundle bundle) {
        return E0(MessagesController.getInstance(launchActivity.O), MessagesStorage.getInstance(launchActivity.O), bundle);
    }

    public static void I0(org.telegram.ui.eo r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hg1.I0(org.telegram.ui.eo):void");
    }

    public static boolean U(hg1 hg1Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(hg1Var.currentAccount).edit();
        edit.putLong("dialog_join_requested_time_" + (-hg1Var.f38376a), System.currentTimeMillis()).commit();
        Activity parentActivity = hg1Var.getParentActivity();
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(hg1Var.g());
        int i10 = org.telegram.ui.Components.m90.f28448r;
        org.telegram.ui.Components.m90.y(parentActivity, hg1Var, org.telegram.ui.Components.zc.a0(hg1Var), isChannelAndNotMegaGroup);
        hg1Var.O0(true);
        return false;
    }

    public static void V(hg1 hg1Var, View view) {
        long j3;
        long j10 = hg1Var.f38376a;
        if (hg1Var.getParentLayout() != null && !((ActionBarLayout) hg1Var.getParentLayout()).y() && (view instanceof eg1)) {
            TLRPC.TL_forumTopic tL_forumTopic = ((eg1) view).N;
            long j11 = -j10;
            boolean isMonoForum = hg1Var.getMessagesController().isMonoForum(j11);
            if (tL_forumTopic == null) {
                j3 = 0;
            } else if (isMonoForum) {
                j3 = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            } else {
                j3 = tL_forumTopic.f19854id;
            }
            long j12 = j3;
            if (hg1Var.f38414t0) {
                ig1 ig1Var = hg1Var.v;
                if (ig1Var != null) {
                    kg1 kg1Var = ig1Var.f38903a;
                    Bundle bundle = new Bundle();
                    ng1 ng1Var = kg1Var.f39491a;
                    bundle.putLong("dialog_id", ng1Var.f40411c);
                    bundle.putLong("topic_id", tL_forumTopic.f19854id);
                    bundle.putBoolean("exception", true);
                    x11 x11Var = new x11(bundle, null);
                    x11Var.f43721r = new ns0(18, kg1Var, tL_forumTopic);
                    ng1Var.presentFragment(x11Var);
                }
                vy vyVar = hg1Var.L0;
                if (vyVar != null) {
                    vyVar.L3(j11, j12, true, hg1Var);
                }
            } else if (hg1Var.f38377a0.size() > 0) {
                hg1Var.N0(view);
            } else {
                if (hg1Var.inPreviewMode && AndroidUtilities.isTablet()) {
                    for (org.telegram.ui.ActionBar.m2 m2Var : hg1Var.getParentLayout().getFragmentStack()) {
                        if (m2Var instanceof vy) {
                            vy vyVar2 = (vy) m2Var;
                            if (vyVar2.e4()) {
                                MessagesStorage.TopicKey topicKey = vyVar2.f42958p2;
                                if (topicKey.dialogId == j11 && topicKey.topicId == j12) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    hg1Var.Q0 = j12;
                    hg1Var.U0(false, false);
                }
                ng.d.m(hg1Var, j10, tL_forumTopic, 0);
            }
        }
    }

    public static boolean W(hg1 hg1Var, View view, float f7) {
        if (hg1Var.f38414t0 || hg1Var.getParentLayout() == null || ((ActionBarLayout) hg1Var.getParentLayout()).y()) {
            return false;
        }
        if (!hg1Var.actionBar.u() && !AndroidUtilities.isTablet() && (view instanceof eg1)) {
            eg1 eg1Var = (eg1) view;
            if (eg1Var.S(f7)) {
                hg1Var.M0(eg1Var);
                hg1Var.N.I0(true);
                hg1Var.N.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        hg1Var.N0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void X(hg1 hg1Var) {
        ViewGroup viewGroup;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                viewGroup = hg1Var.N;
            } else {
                dg1 dg1Var = hg1Var.f38411r0;
                if (dg1Var != null) {
                    viewGroup = dg1Var.U;
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
        org.telegram.ui.ActionBar.k kVar = hg1Var.actionBar;
        if (kVar != null) {
            kVar.F(hg1Var.getThemedColor(org.telegram.ui.ActionBar.h6.G8), true);
            hg1Var.actionBar.G(hg1Var.getThemedColor(org.telegram.ui.ActionBar.h6.E8), false, true);
            hg1Var.actionBar.G(hg1Var.getThemedColor(org.telegram.ui.ActionBar.h6.F8), true, true);
            hg1Var.actionBar.H(hg1Var.getThemedColor(org.telegram.ui.ActionBar.h6.I5), true);
        }
        s50 s50Var = hg1Var.P0;
        if (s50Var != null) {
            s50Var.setForeground(new ColorDrawable(i0.a.k(hg1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20559d6), 100)));
        }
        hg1Var.P0();
    }

    public static void b0(hg1 hg1Var, boolean z10) {
        float f7;
        boolean z11;
        px pxVar;
        hg1Var.f38413s0 = z10;
        ValueAnimator valueAnimator = hg1Var.Y0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            hg1Var.Y0.cancel();
        }
        if (hg1Var.f38378a1 == null) {
            org.telegram.ui.Components.t91 n10 = hg1Var.f38411r0.n(8, false);
            hg1Var.f38378a1 = n10;
            if (hg1Var.M0 != null) {
                n10.setBackgroundColor(hg1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20559d6));
            }
            hg1Var.f38387e.addView(hg1Var.f38378a1, w7.w5.d(44.0f, -1));
        }
        float f10 = hg1Var.W;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        hg1Var.Y0 = ValueAnimator.ofFloat(f10, f7);
        AndroidUtilities.updateViewVisibilityAnimated(hg1Var.f38411r0, false, 1.0f, true);
        vy vyVar = hg1Var.M0;
        if (vyVar != null && (pxVar = vyVar.F3) != null) {
            pxVar.M = !z10;
        }
        if (!z10 && hg1Var.f38411r0.getVisibility() == 0 && hg1Var.f38411r0.getAlpha() == 1.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        hg1Var.Z0 = z11;
        hg1Var.Y0.addUpdateListener(new a21(hg1Var, 17));
        hg1Var.f38411r0.setVisibility(0);
        if (!z10) {
            hg1Var.f38409q0.setVisibility(0);
        } else {
            AndroidUtilities.requestAdjustResize(hg1Var.getParentActivity(), hg1Var.classGuid);
            hg1Var.Q0(false);
        }
        hg1Var.Y0.addListener(new qf1(hg1Var, z10, 0));
        hg1Var.Y0.setDuration(200L);
        hg1Var.Y0.setInterpolator(org.telegram.ui.Components.js.f27627f);
        hg1Var.Y0.start();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
    }

    public final void A0() {
        this.J0 = this.f38412s.isLoading(this.f38376a);
        if (this.D0 != null) {
            ArrayList arrayList = this.f38379b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((yf1) arrayList.get(0)).f44469c != null && ((yf1) arrayList.get(0)).f44469c.f19854id == 1)) {
                this.D0.e(this.J0, this.fragmentBeginToShow);
            }
        }
        sf1 sf1Var = this.N;
        if (sf1Var != null) {
            sf1Var.K0(sf1Var.v1());
        }
        Q0(true);
    }

    public final void B0() {
        int i10;
        float f7;
        float f10;
        vy vyVar = this.M0;
        float f11 = 0.0f;
        if (vyVar != null) {
            int dp = AndroidUtilities.dp(14.0f);
            org.telegram.ui.Components.ct ctVar = vyVar.J1;
            if (ctVar != null) {
                f7 = ctVar.c(dp);
            } else {
                f7 = 0.0f;
            }
            float f12 = f7 + 0.0f;
            org.telegram.ui.Components.ct ctVar2 = this.U0;
            if (ctVar2 != null) {
                float dp2 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.ct ctVar3 = this.M0.J1;
                if (ctVar3 != null) {
                    f10 = ctVar3.getMetadata().f16105c.f16115a;
                } else {
                    f10 = 0.0f;
                }
                ctVar2.setTranslationY(f12 - (f10 * dp2));
                org.telegram.ui.Components.ct ctVar4 = this.U0;
                int dp3 = AndroidUtilities.dp(14.0f);
                int dp4 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.ct ctVar5 = this.M0.J1;
                if (ctVar5 != null) {
                    f11 = ctVar5.getMetadata().f16105c.f16115a;
                }
                f11 = ctVar4.c(AndroidUtilities.lerp(dp3, dp4, f11)) + f12;
            } else {
                f11 = f12;
            }
        } else {
            org.telegram.ui.Components.ct ctVar6 = this.U0;
            if (ctVar6 != null) {
                f11 = 0.0f + ctVar6.c(AndroidUtilities.dp(14.0f));
            }
        }
        int i11 = this.f38389e1 + this.f38384c1;
        if (this.V) {
            i10 = AndroidUtilities.dp(51.0f);
        } else {
            i10 = 0;
        }
        this.N.setPadding(0, (int) f11, 0, i11 + i10);
    }

    public final void C0() {
        this.f38377a0.clear();
        this.actionBar.t();
        AndroidUtilities.updateVisibleRows(this.N);
        R0();
    }

    public final void D0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
        a2Var.R = pluralString;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            a2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, this.f38412s.findTopic(this.f38376a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            a2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a1.d(this, hashSet, arrayList, runnable, 19));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new c80(17));
        a2Var.show();
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20799q7));
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
        bundle.putLong("chat_id", this.f38376a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f38390f.getSharedMediaPreloader());
        profileActivity.K4(this.J);
        if (this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f38390f.getAvatarImageView().getImageReceiver().hasImageLoaded() && z10) {
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
            org.telegram.ui.Components.q71 q71Var = this.L;
            if (i10 == 0) {
                i11 = org.telegram.ui.ActionBar.h6.Ae;
            } else {
                i11 = org.telegram.ui.ActionBar.h6.f20799q7;
            }
            q71Var.setTextColorKey(i11);
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
        of1 of1Var = this.d;
        if (of1Var != null) {
            if (z10) {
                of1Var.setLayerType(2, null);
                of1Var.setClipChildren(false);
                of1Var.setClipToPadding(false);
            } else {
                of1Var.setLayerType(0, null);
                of1Var.setClipChildren(true);
                of1Var.setClipToPadding(true);
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
            sf1 sf1Var = this.N;
            if (sf1Var != null) {
                float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, this.S0, 0.05f, 1.0f);
                sf1Var.setPivotX(0.0f);
                sf1Var.setPivotY(0.0f);
                sf1Var.setScaleX(b10);
                sf1Var.setScaleY(b10);
                this.actionBar.setPivotX(0.0f);
                this.actionBar.setPivotY(0.0f);
                this.actionBar.setScaleX(b10);
                this.actionBar.setScaleY(b10);
            }
        }
    }

    public final void M0(org.telegram.ui.Cells.s2 s2Var) {
        long j3;
        try {
            s2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = s2Var.N;
        org.telegram.ui.Components.hp hpVar = new org.telegram.ui.Components.hp(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new nf1(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(hpVar.f26868f);
        hpVar.f26876o = 1;
        long j10 = this.f38376a;
        long j11 = -j10;
        hpVar.d(j11, tL_forumTopic.f19854id, null);
        if (ChatObject.canManageTopics(g())) {
            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                e1Var.g(LocaleController.getString(R.string.DialogUnpin), R.drawable.msg_unpin, null);
            } else {
                e1Var.g(LocaleController.getString(R.string.DialogPin), R.drawable.msg_pin, null);
            }
            e1Var.setMinimumWidth(160);
            e1Var.setOnClickListener(new View.OnClickListener(this) {
                public final hg1 f38365b;

                {
                    this.f38365b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            hg1 hg1Var = this.f38365b;
                            hg1Var.C0 = true;
                            hg1Var.N0 = true;
                            TopicsController topicsController = hg1Var.f38412s;
                            long j12 = hg1Var.f38376a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j12, tL_forumTopic2.f19854id, !tL_forumTopic2.pinned, hg1Var);
                            hg1Var.finishPreviewFragment();
                            return;
                        case 1:
                            hg1 hg1Var2 = this.f38365b;
                            hg1Var2.N0 = true;
                            TopicsController topicsController2 = hg1Var2.f38412s;
                            long j13 = hg1Var2.f38376a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j13, tL_forumTopic3.f19854id, true ^ tL_forumTopic3.closed);
                            hg1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f19854id));
                            hg1 hg1Var3 = this.f38365b;
                            hg1Var3.D0(hashSet, new ff1(hg1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(e1Var);
        }
        org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(getParentActivity(), false, false);
        if (getMessagesController().isDialogMuted(j11, tL_forumTopic.f19854id)) {
            e1Var2.g(LocaleController.getString(R.string.Unmute), R.drawable.msg_mute, null);
        } else {
            e1Var2.g(LocaleController.getString(R.string.Mute), R.drawable.msg_unmute, null);
        }
        e1Var2.setMinimumWidth(160);
        e1Var2.setOnClickListener(new ai.u7(this, tL_forumTopic, (Serializable) r32, b10, 6));
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
                public final hg1 f38365b;

                {
                    this.f38365b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            hg1 hg1Var = this.f38365b;
                            hg1Var.C0 = true;
                            hg1Var.N0 = true;
                            TopicsController topicsController = hg1Var.f38412s;
                            long j12 = hg1Var.f38376a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j12, tL_forumTopic2.f19854id, !tL_forumTopic2.pinned, hg1Var);
                            hg1Var.finishPreviewFragment();
                            return;
                        case 1:
                            hg1 hg1Var2 = this.f38365b;
                            hg1Var2.N0 = true;
                            TopicsController topicsController2 = hg1Var2.f38412s;
                            long j13 = hg1Var2.f38376a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j13, tL_forumTopic3.f19854id, true ^ tL_forumTopic3.closed);
                            hg1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f19854id));
                            hg1 hg1Var3 = this.f38365b;
                            hg1Var3.D0(hashSet, new ff1(hg1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(e1Var3);
        }
        if (ChatObject.canDeleteTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(getParentActivity(), false, true);
            e1Var4.g(LocaleController.getPluralString("DeleteTopics", 1), R.drawable.msg_delete, null);
            e1Var4.setIconColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20780p7));
            e1Var4.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20799q7));
            e1Var4.setMinimumWidth(160);
            e1Var4.setOnClickListener(new View.OnClickListener(this) {
                public final hg1 f38365b;

                {
                    this.f38365b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            hg1 hg1Var = this.f38365b;
                            hg1Var.C0 = true;
                            hg1Var.N0 = true;
                            TopicsController topicsController = hg1Var.f38412s;
                            long j12 = hg1Var.f38376a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j12, tL_forumTopic2.f19854id, !tL_forumTopic2.pinned, hg1Var);
                            hg1Var.finishPreviewFragment();
                            return;
                        case 1:
                            hg1 hg1Var2 = this.f38365b;
                            hg1Var2.N0 = true;
                            TopicsController topicsController2 = hg1Var2.f38412s;
                            long j13 = hg1Var2.f38376a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j13, tL_forumTopic3.f19854id, true ^ tL_forumTopic3.closed);
                            hg1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f19854id));
                            hg1 hg1Var3 = this.f38365b;
                            hg1Var3.D0(hashSet, new ff1(hg1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(e1Var4);
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
            this.parentLayout.getOverlayContainerView().addView(this.P0, w7.w5.d(-1.0f, -1));
        }
        eo eoVar = new eo(sc.v.f(j10, "chat_id"));
        if (isMonoForum) {
            j3 = DialogObject.getPeerDialogId(s2Var.N.from_id);
        } else {
            j3 = s2Var.N.f19854id;
        }
        ng.d.a(eoVar, MessagesStorage.TopicKey.of(j11, j3));
        presentFragmentAsPreviewWithMenu(eoVar, r32[0]);
    }

    public final void N0(View view) {
        eg1 eg1Var;
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
        if ((view instanceof eg1) && (tL_forumTopic = (eg1Var = (eg1) view).N) != null) {
            int i20 = tL_forumTopic.f19854id;
            Integer valueOf = Integer.valueOf(i20);
            HashSet hashSet = this.f38377a0;
            if (!hashSet.remove(valueOf)) {
                hashSet.add(Integer.valueOf(i20));
            }
            eg1Var.V(hashSet.contains(Integer.valueOf(i20)), true);
            MessagesController messagesController = getMessagesController();
            long j3 = this.f38376a;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            if (!hashSet.isEmpty()) {
                if (!this.actionBar.a(null)) {
                    org.telegram.ui.ActionBar.y k10 = this.actionBar.k(null);
                    if (this.inPreviewMode) {
                        k10.setBackgroundColor(0);
                        k10.f21459a = false;
                    }
                    NumberTextView numberTextView = new NumberTextView(k10.getContext());
                    this.f38383c0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f38383c0.setTypeface(AndroidUtilities.bold());
                    this.f38383c0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20947y8));
                    k10.addView(this.f38383c0, w7.w5.m(1.0f, 0, -1, 72, 0, 0));
                    this.f38383c0.setOnTouchListener(new if1(0));
                    this.f38385d0 = k10.g(4, R.drawable.msg_pin, AndroidUtilities.dp(54.0f));
                    this.f38388e0 = k10.g(5, R.drawable.msg_unpin, AndroidUtilities.dp(54.0f));
                    this.f38391f0 = k10.g(6, R.drawable.msg_mute, AndroidUtilities.dp(54.0f));
                    this.f38393g0 = k10.h(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                    org.telegram.ui.ActionBar.u0 h = k10.h(12, R.drawable.msg_archive_hide, LocaleController.getString(R.string.Hide), AndroidUtilities.dp(54.0f));
                    this.f38395h0 = h;
                    h.setVisibility(8);
                    org.telegram.ui.ActionBar.u0 h10 = k10.h(13, R.drawable.msg_archive_show, LocaleController.getString(R.string.Show), AndroidUtilities.dp(54.0f));
                    this.f38397i0 = h10;
                    h10.setVisibility(8);
                    org.telegram.ui.ActionBar.u0 h11 = k10.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(54.0f));
                    this.m0 = h11;
                    this.f38399j0 = h11.e(8, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
                    this.f38401k0 = this.m0.e(9, R.drawable.msg_topic_close, LocaleController.getString(R.string.CloseTopic));
                    this.f38403l0 = this.m0.e(10, R.drawable.msg_topic_restart, LocaleController.getString(R.string.RestartTopic));
                }
                if (this.inPreviewMode) {
                    ((View) this.fragmentView.getParent()).invalidate();
                }
                this.actionBar.P(null, null);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                Iterator it = hashSet.iterator();
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (true) {
                    boolean hasNext = it.hasNext();
                    topicsController = this.f38412s;
                    if (!hasNext) {
                        break;
                    }
                    HashSet hashSet2 = hashSet;
                    long intValue = ((Integer) it.next()).intValue();
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j3, intValue);
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
                    if (getMessagesController().isDialogMuted(-j3, intValue)) {
                        i22++;
                    }
                    hashSet = hashSet2;
                }
                HashSet hashSet3 = hashSet;
                if (i21 > 0) {
                    this.f38399j0.setVisibility(0);
                    this.f38399j0.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
                    i10 = 8;
                } else {
                    i10 = 8;
                    this.f38399j0.setVisibility(8);
                }
                if (i22 != 0) {
                    this.B0 = false;
                    this.f38391f0.setIcon(R.drawable.msg_unmute);
                    this.f38391f0.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
                    z10 = true;
                } else {
                    z10 = true;
                    this.B0 = true;
                    this.f38391f0.setIcon(R.drawable.msg_mute);
                    this.f38391f0.setContentDescription(LocaleController.getString(R.string.ChatsMute));
                }
                org.telegram.ui.ActionBar.u0 u0Var = this.f38385d0;
                if (i23 == z10 && i24 == 0) {
                    i11 = 0;
                } else {
                    i11 = i10;
                }
                u0Var.setVisibility(i11);
                org.telegram.ui.ActionBar.u0 u0Var2 = this.f38388e0;
                if (i24 == z10 && i23 == 0) {
                    i12 = 0;
                } else {
                    i12 = i10;
                }
                u0Var2.setVisibility(i12);
                this.f38383c0.a(hashSet3.size(), z10);
                Iterator it2 = hashSet3.iterator();
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                while (it2.hasNext()) {
                    TLRPC.TL_forumTopic findTopic2 = topicsController.findTopic(j3, ((Integer) it2.next()).intValue());
                    if (findTopic2 != null) {
                        if (ChatObject.canDeleteTopic(this.currentAccount, chat, findTopic2)) {
                            i27++;
                        }
                        if (ChatObject.canManageTopic(this.currentAccount, chat, findTopic2)) {
                            if (findTopic2.f19854id == 1) {
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
                org.telegram.ui.ActionBar.e1 e1Var = this.f38401k0;
                if (i25 == 0 && i26 > 0) {
                    i13 = 0;
                } else {
                    i13 = i10;
                }
                e1Var.setVisibility(i13);
                org.telegram.ui.ActionBar.e1 e1Var2 = this.f38401k0;
                if (i26 > 1) {
                    i14 = R.string.CloseTopics;
                } else {
                    i14 = R.string.CloseTopic;
                }
                e1Var2.setText(LocaleController.getString(i14));
                org.telegram.ui.ActionBar.e1 e1Var3 = this.f38403l0;
                if (i26 == 0 && i25 > 0) {
                    i15 = 0;
                } else {
                    i15 = i10;
                }
                e1Var3.setVisibility(i15);
                org.telegram.ui.ActionBar.e1 e1Var4 = this.f38403l0;
                if (i25 > 1) {
                    i16 = R.string.RestartTopics;
                } else {
                    i16 = R.string.RestartTopic;
                }
                e1Var4.setText(LocaleController.getString(i16));
                org.telegram.ui.ActionBar.u0 u0Var3 = this.f38393g0;
                if (i27 == hashSet3.size()) {
                    i17 = 0;
                } else {
                    i17 = i10;
                }
                u0Var3.setVisibility(i17);
                org.telegram.ui.ActionBar.u0 u0Var4 = this.f38395h0;
                if (i28 == 1 && hashSet3.size() == 1) {
                    i18 = 0;
                } else {
                    i18 = i10;
                }
                u0Var4.setVisibility(i18);
                org.telegram.ui.ActionBar.u0 u0Var5 = this.f38397i0;
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
            this.actionBar.t();
        }
    }

    public final void O0(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hg1.O0(boolean):void");
    }

    public final void P0() {
        RadialProgressView radialProgressView = this.f38406n0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.h6.Ae));
        this.h.g();
        z51 z51Var = this.f38407o0;
        int i10 = org.telegram.ui.ActionBar.h6.f20559d6;
        z51Var.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(getThemedColor(i10));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20839s8));
        }
        this.f38411r0.setBackgroundColor(getThemedColor(i10));
    }

    public final void Q0(boolean z10) {
        boolean z11;
        if (this.Q == null) {
            return;
        }
        MessagesController messagesController = getMessagesController();
        long j3 = this.f38376a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        int i10 = 0;
        if (!ChatObject.isNotInChat(getMessagesController().getChat(Long.valueOf(j3))) && ChatObject.canCreateTopic(chat) && !this.f38413s0 && !this.f38414t0 && !this.J0) {
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
        if (ChatObject.canManageTopics(g()) && !this.f38377a0.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f38380b0 != z10) {
            this.f38380b0 = z10;
            wf1 wf1Var = this.f38410r;
            wf1Var.q(0, wf1Var.h());
        }
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        return false;
    }

    public final void S0(float f7) {
        this.W = f7;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.f20894v8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f20947y8;
        kVar.E(i0.a.d(this.W, themedColor, getThemedColor(i10)), false);
        this.actionBar.E(i0.a.d(this.W, getThemedColor(i10), getThemedColor(i10)), true);
        this.actionBar.D(i0.a.d(this.W, getThemedColor(org.telegram.ui.ActionBar.h6.f20858t8), getThemedColor(org.telegram.ui.ActionBar.h6.f20965z8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(i0.a.d(this.W, getThemedColor(org.telegram.ui.ActionBar.h6.f20839s8), getThemedColor(org.telegram.ui.ActionBar.h6.f20559d6)));
        }
        float f10 = 1.0f - f7;
        this.f38390f.getTitleTextView().setAlpha(f10);
        this.f38390f.getSubtitleTextView().setAlpha(f10);
        org.telegram.ui.Components.t91 t91Var = this.f38378a1;
        if (t91Var != null) {
            t91Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
            this.f38378a1.setAlpha(f7);
        }
        this.f38411r0.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
        this.f38411r0.setAlpha(f7);
        if (isInPreviewMode()) {
            this.f38387e.invalidate();
        }
        this.d.invalidate();
        this.N.setAlpha(f10);
        if (this.Z0) {
            float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, this.W, 0.02f, 0.98f);
            this.N.setScaleX(y3);
            this.N.setScaleY(y3);
        }
    }

    public final void T0() {
        ai.e7 e7Var = this.D0;
        if (e7Var != null && e7Var.f26557e != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
            org.telegram.ui.Components.gr grVar = new org.telegram.ui.Components.gr(R.drawable.ic_ab_other, 0);
            grVar.setSize(AndroidUtilities.dp(16.0f));
            spannableStringBuilder.setSpan(grVar, 0, 1, 0);
            if (ChatObject.canUserDoAdminAction(g(), 15)) {
                this.D0.f26557e.setText(AndroidUtilities.replaceCharSequence("%s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoTopicsDescription)), spannableStringBuilder));
                return;
            }
            String string = LocaleController.getString(R.string.General);
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.f38376a, 1L);
            if (findTopic != null) {
                string = findTopic.title;
            }
            this.D0.f26557e.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoTopicsDescriptionUser", R.string.NoTopicsDescriptionUser, string)));
        }
    }

    public final void U0(boolean z10, boolean z11) {
        jf1 jf1Var;
        uf1 uf1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z10 && this.N0) {
            z10 = true;
        }
        this.N0 = false;
        TopicsController topicsController = this.f38412s;
        long j3 = this.f38376a;
        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j3);
        if (topics != null) {
            ArrayList arrayList = this.f38379b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            uf1 uf1Var2 = null;
            if (UserObject.isBotForum(this.currentAccount, -j3) && this.f38415u0) {
                arrayList.add(new yf1(3, null));
            }
            for (int i10 = 0; i10 < topics.size(); i10++) {
                HashSet hashSet = this.A0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(topics.get(i10).f19854id))) {
                    arrayList.add(new yf1(0, topics.get(i10)));
                }
            }
            if (!arrayList.isEmpty() && !topicsController.endIsReached(j3) && this.V0) {
                arrayList.add(new yf1(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.K0.b(size + 4);
                z10 = false;
            }
            this.f38419x = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                yf1 yf1Var = (yf1) arrayList.get(i11);
                if (yf1Var != null && (tL_forumTopic = yf1Var.f44469c) != null && tL_forumTopic.hidden) {
                    this.f38419x++;
                }
            }
            sf1 sf1Var = this.N;
            if (sf1Var != null) {
                s4.n0 itemAnimator = sf1Var.getItemAnimator();
                if (z10) {
                    uf1Var = this.I0;
                } else {
                    uf1Var = null;
                }
                if (itemAnimator != uf1Var) {
                    sf1 sf1Var2 = this.N;
                    if (z10) {
                        uf1Var2 = this.I0;
                    }
                    sf1Var2.setItemAnimator(uf1Var2);
                }
            }
            wf1 wf1Var = this.f38410r;
            if (wf1Var != null) {
                wf1Var.E(arrayList2, arrayList);
            }
            if ((this.C0 || size == 0) && (jf1Var = this.F) != null) {
                jf1Var.h1(0, 0);
                this.C0 = false;
            }
        }
        A0();
        T0();
    }

    @Override
    public final long a() {
        return -this.f38376a;
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
        vy vyVar = this.M0;
        if (vyVar != null && vyVar.W) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.f38384c1 = i10;
        vy vyVar2 = this.M0;
        if (vyVar2 != null && vyVar2.W) {
            i11 = AndroidUtilities.dp(64.0f);
        } else {
            i11 = 0;
        }
        this.f38386d1 = i11;
        of1 of1Var = new of1(this, context);
        this.d = of1Var;
        this.fragmentView = of1Var;
        of1Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20559d6));
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
        hg.c.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new rf1(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) {
            public final hg1 f37085b;

            {
                this.f37085b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var;
                switch (r2) {
                    case 0:
                        hg1 hg1Var = this.f37085b;
                        hg1Var.presentFragment(df1.a0(hg1Var.f38376a, 0L));
                        return;
                    case 1:
                        hg1 hg1Var2 = this.f37085b;
                        hg1Var2.getMessagesController().hidePeerSettingsBar(-hg1Var2.f38376a, null, hg1Var2.g());
                        hg1Var2.O0(false);
                        return;
                    case 2:
                        hg1 hg1Var3 = this.f37085b;
                        if (!hg1Var3.f38413s0) {
                            hg1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f37085b.finishPreviewFragment();
                        return;
                    default:
                        vy vyVar3 = this.f37085b.M0;
                        if (vyVar3 != null && (u0Var = vyVar3.f42929j0) != null) {
                            u0Var.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.y p5 = this.actionBar.p();
        if (this.M0 != null) {
            org.telegram.ui.ActionBar.u0 a2 = p5.a(0, R.drawable.outline_header_search);
            this.f38408p0 = a2;
            a2.setOnClickListener(new View.OnClickListener(this) {
                public final hg1 f37085b;

                {
                    this.f37085b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.u0 u0Var;
                    switch (r2) {
                        case 0:
                            hg1 hg1Var = this.f37085b;
                            hg1Var.presentFragment(df1.a0(hg1Var.f38376a, 0L));
                            return;
                        case 1:
                            hg1 hg1Var2 = this.f37085b;
                            hg1Var2.getMessagesController().hidePeerSettingsBar(-hg1Var2.f38376a, null, hg1Var2.g());
                            hg1Var2.O0(false);
                            return;
                        case 2:
                            hg1 hg1Var3 = this.f37085b;
                            if (!hg1Var3.f38413s0) {
                                hg1Var3.H0(false);
                                return;
                            }
                            return;
                        case 3:
                            this.f37085b.finishPreviewFragment();
                            return;
                        default:
                            vy vyVar3 = this.f37085b.M0;
                            if (vyVar3 != null && (u0Var = vyVar3.f42929j0) != null) {
                                u0Var.performClick();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.u0 a10 = p5.a(0, R.drawable.outline_header_search);
            this.f38408p0 = a10;
            a10.F();
            a10.H = new hg.e2(this, 18);
            this.f38408p0.setSearchPaddingStart(56);
            this.f38408p0.setSearchFieldHint(LocaleController.getString(R.string.Search));
            EditTextBoldCursor searchField = this.f38408p0.getSearchField();
            searchField.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.G6));
            searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Si));
            searchField.setCursorColor(getThemedColor(org.telegram.ui.ActionBar.h6.Wd));
        }
        org.telegram.ui.ActionBar.u0 c10 = p5.c(0, R.drawable.ic_ab_other, null);
        this.f38409q0 = c10;
        c10.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.f38409q0.e(1, R.drawable.msg_discussion, LocaleController.getString(R.string.TopicViewAsMessages));
        this.R = this.f38409q0.e(2, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddMember));
        org.telegram.ui.ActionBar.u0 u0Var = this.f38409q0;
        this.T = u0Var.d(14, 0, new org.telegram.ui.Components.fk0(R.raw.boosts, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f)), LocaleController.getString(R.string.BoostingBoostGroupMenu), true, false, u0Var.m0);
        this.Q = this.f38409q0.e(3, R.drawable.msg_topic_create, LocaleController.getString(R.string.CreateTopic));
        this.U = this.f38409q0.e(15, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat));
        this.S = this.f38409q0.f(11, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMegaMenu), null);
        org.telegram.ui.Components.wo woVar = new org.telegram.ui.Components.wo(context, this, false, this.resourceProvider);
        this.f38390f = woVar;
        woVar.getAvatarImageView().setRoundRadius(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.wo woVar2 = this.f38390f;
        if (!AndroidUtilities.isTablet() && !this.inPreviewMode) {
            z11 = true;
        } else {
            z11 = false;
        }
        woVar2.setOccupyStatusBar(z11);
        org.telegram.ui.Components.wo woVar3 = this.f38390f;
        long j3 = -this.f38376a;
        if (j3 < 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        woVar3.f32499b = z12;
        woVar3.setClipChildren(false);
        this.actionBar.addView(this.f38390f, 0, w7.w5.a(-1.0f, 56.0f, 0.0f, 86.0f, 0.0f, -2, 51));
        if (!this.f38414t0) {
            this.f38390f.getAvatarImageView().setOnClickListener(new a8(this, 3));
        }
        this.N = new sf1(this, context);
        hh.j jVar = new hh.j(this.d);
        ViewGroup viewGroup = this.d;
        ah.c cVar = this.f38398i1;
        cVar.f547f = jVar;
        cVar.f548g = viewGroup;
        sf1 sf1Var = this.N;
        vy vyVar3 = this.M0;
        if (vyVar3 != null) {
            viewGroup = (ViewGroup) vyVar3.getFragmentView();
        }
        sf1 sf1Var2 = this.N;
        Objects.requireNonNull(sf1Var2);
        this.f38400j1 = new ah.n(sf1Var, viewGroup, new x8(sf1Var2, 2));
        this.N.C0(new ff1(this, 5));
        SpannableString spannableString = new SpannableString("#");
        ng.c c11 = ng.d.c(getParentActivity(), 0.85f, -1, false);
        c11.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
        spannableString.setSpan(new ImageSpan(c11, 2), 0, 1, 33);
        bx bxVar = new bx(this, AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccSwipeForGeneral), spannableString), AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccReleaseForGeneral), spannableString));
        this.f38417w = bxVar;
        bxVar.b();
        if (this.E) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        this.f38421y = i12;
        bx bxVar2 = this.f38417w;
        if (i12 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        bxVar2.X = z13;
        uf1 uf1Var = new uf1(this);
        this.N.setHideIfEmpty(false);
        uf1Var.f47929m = false;
        uf1Var.C = false;
        sf1 sf1Var3 = this.N;
        this.I0 = uf1Var;
        sf1Var3.setItemAnimator(uf1Var);
        this.N.setOnScrollListener(new kf1(this, 1));
        sf1 sf1Var4 = this.N;
        sf1Var4.W1 = true;
        sf1Var4.X1 = 0;
        org.telegram.ui.Components.bm0 bm0Var = new org.telegram.ui.Components.bm0(sf1Var4, true);
        this.K0 = bm0Var;
        this.N.setItemsEnterAnimator(bm0Var);
        this.N.setOnItemClickListener(new d21(this, 11));
        this.N.setOnItemLongClickListener(new gf1(this));
        this.N.setOnScrollListener(new kf1(this, 2));
        sf1 sf1Var5 = this.N;
        jf1 jf1Var = new jf1(this);
        this.F = jf1Var;
        sf1Var5.setLayoutManager(jf1Var);
        new SparseArray();
        new HashMap();
        this.N.setAdapter(this.f38410r);
        this.N.setClipToPadding(false);
        this.N.j(new kf1(this, 0));
        gg1 gg1Var = new gg1(this);
        this.P = gg1Var;
        lf1 lf1Var = new lf1(this, gg1Var);
        this.O = lf1Var;
        lf1Var.e(this.N);
        this.d.addView(this.N, w7.w5.d(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.N.getLayoutParams()).topMargin = -AndroidUtilities.dp(100.0f);
        org.telegram.ui.Components.s20 s20Var = new org.telegram.ui.Components.s20(getParentActivity(), this.resourceProvider, false);
        this.h = s20Var;
        this.d.addView(s20Var, org.telegram.ui.Components.s20.b());
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final hg1 f37085b;

            {
                this.f37085b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var2;
                switch (r2) {
                    case 0:
                        hg1 hg1Var = this.f37085b;
                        hg1Var.presentFragment(df1.a0(hg1Var.f38376a, 0L));
                        return;
                    case 1:
                        hg1 hg1Var2 = this.f37085b;
                        hg1Var2.getMessagesController().hidePeerSettingsBar(-hg1Var2.f38376a, null, hg1Var2.g());
                        hg1Var2.O0(false);
                        return;
                    case 2:
                        hg1 hg1Var3 = this.f37085b;
                        if (!hg1Var3.f38413s0) {
                            hg1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f37085b.finishPreviewFragment();
                        return;
                    default:
                        vy vyVar32 = this.f37085b.M0;
                        if (vyVar32 != null && (u0Var2 = vyVar32.f42929j0) != null) {
                            u0Var2.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        this.h.f30371c.setImageResource(R.drawable.ic_chatlist_add_2);
        this.h.f30371c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.f30371c.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.h.setContentDescription(LocaleController.getString(R.string.CreateTopic));
        org.telegram.ui.Components.m10 m10Var = new org.telegram.ui.Components.m10(context, null);
        m10Var.setViewType(24);
        m10Var.setVisibility(8);
        m10Var.f28355w = true;
        ?? frameLayout = new FrameLayout(context);
        TextView textView = new TextView(context);
        frameLayout.f43926a = textView;
        if (LocaleController.isRTL) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.gr(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TapToCreateTopicHint));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.TapToCreateTopicHint));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.gr(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20945y6));
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
        frameLayout.addView(textView, w7.w5.a(-2.0f, f7, 0.0f, f10, 32.0f, -2, 81));
        this.f38405n = frameLayout;
        textView.setAlpha(0.0f);
        ai.e7 e7Var = new ai.e7(this, context, m10Var);
        this.D0 = e7Var;
        try {
            e7Var.f26555b.getImageReceiver().setAutoRepeat(2);
        } catch (Exception unused) {
        }
        this.D0.e(this.J0, this.fragmentBeginToShow);
        this.D0.d.setText(LocaleController.getString(R.string.NoTopics));
        T0();
        this.f38405n.addView(m10Var);
        this.f38405n.addView(this.D0);
        this.d.addView(this.f38405n);
        this.N.setEmptyView(this.f38405n);
        this.f38407o0 = new z51(context, 6);
        org.telegram.ui.Components.q71 q71Var = new org.telegram.ui.Components.q71(context);
        this.L = q71Var;
        this.f38407o0.addView(q71Var);
        this.d.addView(this.f38407o0, w7.w5.e(-1, 51, 80));
        this.L.setOnClickListener(new mf1(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f38406n0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(22.0f));
        this.f38406n0.setVisibility(4);
        this.f38407o0.addView(this.f38406n0, w7.w5.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.W0 = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.W0.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView2 = this.W0;
        int i13 = org.telegram.ui.ActionBar.h6.f20567de;
        imageView2.setBackground(org.telegram.ui.ActionBar.w5.c(null, org.telegram.ui.ActionBar.w5.b(getThemedColor(i13))));
        this.W0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), PorterDuff.Mode.MULTIPLY));
        this.W0.setScaleType(ImageView.ScaleType.CENTER);
        this.f38407o0.addView(this.W0, w7.w5.a(36.0f, 0.0f, 6.0f, 2.0f, 0.0f, 36, 53));
        this.W0.setOnClickListener(new View.OnClickListener(this) {
            public final hg1 f37085b;

            {
                this.f37085b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var2;
                switch (r2) {
                    case 0:
                        hg1 hg1Var = this.f37085b;
                        hg1Var.presentFragment(df1.a0(hg1Var.f38376a, 0L));
                        return;
                    case 1:
                        hg1 hg1Var2 = this.f37085b;
                        hg1Var2.getMessagesController().hidePeerSettingsBar(-hg1Var2.f38376a, null, hg1Var2.g());
                        hg1Var2.O0(false);
                        return;
                    case 2:
                        hg1 hg1Var3 = this.f37085b;
                        if (!hg1Var3.f38413s0) {
                            hg1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f37085b.finishPreviewFragment();
                        return;
                    default:
                        vy vyVar32 = this.f37085b.M0;
                        if (vyVar32 != null && (u0Var2 = vyVar32.f42929j0) != null) {
                            u0Var2.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        this.W0.setVisibility(8);
        O0(false);
        k0 k0Var = new k0(this, context, 25);
        this.f38387e = k0Var;
        if (this.M0 == null) {
            this.d.addView(k0Var, w7.w5.e(-1, -1, 119));
        }
        dg1 dg1Var = new dg1(this, context);
        this.f38411r0 = dg1Var;
        dg1Var.setVisibility(8);
        this.f38387e.addView(this.f38411r0, w7.w5.a(-1.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 119));
        dg1 dg1Var2 = this.f38411r0;
        int i14 = org.telegram.ui.ActionBar.h6.f20559d6;
        dg1Var2.setBackgroundColor(getThemedColor(i14));
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().loadChatInfo(this.f38376a, true, null, true, false, 0);
        org.telegram.ui.Components.ct ctVar = new org.telegram.ui.Components.ct(context);
        this.U0 = ctVar;
        ctVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        ch.d c12 = cVar.c(this.U0, eh.b.n(this.resourceProvider), false);
        c12.q(AndroidUtilities.dp(24.0f));
        c12.p(AndroidUtilities.dp(7.0f));
        this.U0.setBlurredBackground(c12);
        this.U0.setOnAnimatedHeightChangedListener(new ff1(this, 0));
        this.d.addView(this.U0, w7.w5.a(-2.0f, 0.0f, -14.0f, 0.0f, 0.0f, -1, 48));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            wh.d dVar = new wh.d(g10, this);
            this.R0 = dVar;
            this.U0.addView(dVar.c(), w7.w5.n(-1, 40));
            this.U0.h(3, this.R0.c());
            this.U0.g(this.R0.c());
            wh.d dVar2 = this.R0;
            dVar2.f50631m = new gf1(this);
            TLRPC.ChatFull chatFull = this.J;
            dVar2.f50628j = chatFull;
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
            a9 a9Var = new a9(this, context, this);
            this.G0 = a9Var;
            this.F0.addView(a9Var);
            this.U0.setCallFragmentContextView(this.G0);
        }
        FrameLayout.LayoutParams d = w7.w5.d(-2.0f, -1);
        if (this.inPreviewMode) {
            d.topMargin = AndroidUtilities.statusBarHeight;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, d);
        }
        y0();
        s50 s50Var = new s50(this, context, 10);
        this.P0 = s50Var;
        s50Var.setForeground(new ColorDrawable(i0.a.k(getThemedColor(i14), 100)));
        this.P0.setFocusable(false);
        this.P0.setImportantForAccessibility(2);
        this.P0.setOnClickListener(new View.OnClickListener(this) {
            public final hg1 f37085b;

            {
                this.f37085b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var2;
                switch (r2) {
                    case 0:
                        hg1 hg1Var = this.f37085b;
                        hg1Var.presentFragment(df1.a0(hg1Var.f38376a, 0L));
                        return;
                    case 1:
                        hg1 hg1Var2 = this.f37085b;
                        hg1Var2.getMessagesController().hidePeerSettingsBar(-hg1Var2.f38376a, null, hg1Var2.g());
                        hg1Var2.O0(false);
                        return;
                    case 2:
                        hg1 hg1Var3 = this.f37085b;
                        if (!hg1Var3.f38413s0) {
                            hg1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f37085b.finishPreviewFragment();
                        return;
                    default:
                        vy vyVar32 = this.f37085b.M0;
                        if (vyVar32 != null && (u0Var2 = vyVar32.f42929j0) != null) {
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
                if (m2Var instanceof vy) {
                    vy vyVar4 = (vy) m2Var;
                    if (vyVar4.e4()) {
                        MessagesStorage.TopicKey topicKey = vyVar4.f42958p2;
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
            getMessagesController().getBoostsController().getBoostsStats(j3, new t3(this, 26));
        }
        View view = this.fragmentView;
        gf1 gf1Var = new gf1(this);
        WeakHashMap weakHashMap = r0.i0.f46981a;
        r0.a0.i(view, gf1Var);
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
        long j3 = this.f38376a;
        if (i10 == i12) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.J) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.f19803id == j3) {
                O0(false);
                wh.d dVar = this.R0;
                if (dVar != null) {
                    dVar.f50628j = chatFull2;
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
                a9 a9Var = this.G0;
                if (a9Var != null) {
                    a9Var.a(!this.fragmentBeginToShow);
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
        return getMessagesController().getChat(Long.valueOf(this.f38376a));
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
        org.telegram.ui.Components.wm0 wm0Var;
        yy0 yy0Var = new yy0(9, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.f20559d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, yy0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20839s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f20894v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f20858t8));
        dg1 dg1Var = this.f38411r0;
        if (dg1Var != null && (wm0Var = dg1Var.U) != null) {
            org.telegram.ui.Cells.v3.a(arrayList, wm0Var);
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
        if (this.f38413s0) {
            i10 = org.telegram.ui.ActionBar.h6.f20559d6;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f20839s8;
        }
        int themedColor = getThemedColor(i10);
        if (this.actionBar.u()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.f20912w8);
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
    public final org.telegram.ui.Components.wo o() {
        return this.f38390f;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f38377a0.isEmpty()) {
            if (z10) {
                C0();
                return false;
            }
        } else if (this.f38413s0) {
            if (z10) {
                this.actionBar.x(this.f38408p0.L(false));
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
            kVar.h();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j3 = this.f38376a;
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
        n71.t(this.currentAccount);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j3));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, false);
        }
        Long valueOf = Long.valueOf(j3);
        HashSet hashSet = f38375n1;
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
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f38376a));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, true);
        }
        super.onFragmentDestroy();
        vy vyVar = this.M0;
        if (vyVar != null && vyVar.F3 != null) {
            vyVar.getActionBar().setSearchAvatarImageView(null);
            this.M0.F3.M = true;
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        getMessagesController().getTopicsController().onTopicFragmentPause(this.f38376a);
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        super.onResume();
        TopicsController topicsController = getMessagesController().getTopicsController();
        long j3 = this.f38376a;
        topicsController.onTopicFragmentResume(j3);
        this.G = false;
        AndroidUtilities.updateVisibleRows(this.N);
        this.G = true;
        setBulletinDelegate(new b9(this, 9));
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
        px pxVar;
        s50 s50Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (s50Var = this.P0) != null) {
            if (s50Var.getParent() != null) {
                ((ViewGroup) this.P0.getParent()).removeView(this.P0);
            }
            this.P0.setBackground(null);
        }
        if (z10) {
            z0(false);
        }
        this.O0.unlock();
        if (!z10) {
            if (this.f38414t0 && this.H) {
                removeSelfFromStack();
                vy vyVar = this.L0;
                if (vyVar != null) {
                    vyVar.removeSelfFromStack();
                }
            } else if (this.I) {
                removeSelfFromStack();
                vy vyVar2 = this.M0;
                if (vyVar2 != null && (pxVar = vyVar2.F3) != null && pxVar.c()) {
                    this.M0.F3.a();
                }
            }
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        s50 s50Var = this.P0;
        if (s50Var != null && s50Var.getVisibility() == 0) {
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
    public final void s() {
        this.N.x0(0);
    }

    @Override
    public final void setPreviewOpenedProgress(float f7) {
        org.telegram.ui.Components.wo woVar = this.f38390f;
        if (woVar != null) {
            woVar.setAlpha(f7);
            this.f38409q0.setAlpha(f7);
            org.telegram.ui.ActionBar.u0 u0Var = this.f38408p0;
            if (u0Var != null) {
                u0Var.setAlpha(f7);
            }
            this.actionBar.getBackButton().setAlpha(f7);
        }
    }

    @Override
    public final void setPreviewReplaceProgress(float f7) {
        org.telegram.ui.Components.wo woVar = this.f38390f;
        if (woVar != null) {
            woVar.setAlpha(f7);
            this.f38390f.setTranslationX((1.0f - f7) * AndroidUtilities.dp(40.0f));
        }
    }

    public final void x0() {
        ah.h hVar;
        View view;
        org.telegram.ui.ActionBar.k kVar;
        float f7;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (hVar = this.f38392f1) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int dp2 = AndroidUtilities.dp(48.0f) + ((int) this.U0.c(AndroidUtilities.dp(14.0f)));
            vy vyVar = this.M0;
            if (vyVar != null) {
                view = vyVar.fragmentView;
            } else {
                view = this.fragmentView;
            }
            if (vyVar != null) {
                kVar = vyVar.getActionBar();
            } else {
                kVar = this.actionBar;
            }
            int measuredHeight = (view.getMeasuredHeight() - this.f38389e1) - AndroidUtilities.dp(8.0f);
            this.l1.set(0.0f, -dp, view.getMeasuredWidth(), kVar.getMeasuredHeight() + dp + dp2);
            RectF rectF = this.f38404m1;
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
            hVar.g(i10, this.f38402k1);
            hVar.e(this.f38400j1, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    @Override
    public final fh.d y() {
        return this.f38396h1;
    }

    public final void y0() {
        jf1 jf1Var;
        TopicsController topicsController = this.f38412s;
        long j3 = this.f38376a;
        if (!topicsController.endIsReached(j3) && (jf1Var = this.F) != null) {
            int N0 = jf1Var.N0();
            if (this.f38379b.isEmpty() || N0 >= this.f38410r.h() - 5) {
                topicsController.loadTopics(j3);
            }
            A0();
        }
    }

    @Override
    public final org.telegram.ui.Components.yw0 z() {
        return this.d;
    }

    public final void z0(boolean z10) {
        String str;
        MessagesController messagesController = getMessagesController();
        long j3 = this.f38376a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j3);
        ChatObject.Call call = this.H0;
        if (call != null && ((str = this.f38422y0) != null || this.f38423z0)) {
            org.telegram.ui.Components.voip.g2.l(chat, str, false, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f38422y0 = null;
            this.f38423z0 = false;
        } else if (this.f38422y0 != null && z10 && chatFull != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.v0.q(R.string.LinkHashExpired, org.telegram.ui.Components.zc.a0(this), R.raw.linkbroken, 36);
            this.f38422y0 = null;
        }
    }

    @Override
    public final void p() {
    }

    @Override
    public final void F(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
    }
}
