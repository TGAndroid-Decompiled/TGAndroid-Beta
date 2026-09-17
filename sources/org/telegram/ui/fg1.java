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
public class fg1 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.ah, fh0 {
    public static final HashSet f33635n1 = new HashSet();
    public HashSet A0;
    public boolean B0;
    public boolean C0;
    public ai.d7 D0;
    public boolean E;
    public tf1 E0;
    public hf1 F;
    public FrameLayout F0;
    public boolean G;
    public a9 G0;
    public boolean H;
    public ChatObject.Call H0;
    public boolean I;
    public sf1 I0;
    public TLRPC.ChatFull J;
    public boolean J0;
    public boolean K;
    public org.telegram.ui.Components.rk0 K0;
    public org.telegram.ui.Components.h61 L;
    public wy L0;
    public int M;
    public wy M0;
    public qf1 N;
    public boolean N0;
    public jf1 O;
    public final AnimationNotificationsLocker O0;
    public eg1 P;
    public u50 P0;
    public org.telegram.ui.ActionBar.g1 Q;
    public long Q0;
    public org.telegram.ui.ActionBar.g1 R;
    public wh.d R0;
    public org.telegram.ui.ActionBar.g1 S;
    public float S0;
    public org.telegram.ui.ActionBar.g1 T;
    public boolean T0;
    public org.telegram.ui.ActionBar.g1 U;
    public org.telegram.ui.Components.ks U0;
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
    public final long f33636a;
    public final HashSet f33637a0;
    public org.telegram.ui.Components.i81 f33638a1;
    public final ArrayList f33639b;
    public boolean f33640b0;
    public View f33641b1;
    public int f33642c;
    public NumberTextView f33643c0;
    public int f33644c1;
    public mf1 d;
    public org.telegram.ui.ActionBar.w0 f33645d0;
    public int f33646d1;
    public j0 e;
    public org.telegram.ui.ActionBar.w0 f33647e0;
    public int f33648e1;
    public org.telegram.ui.Components.eo f33649f;
    public org.telegram.ui.ActionBar.w0 f33650f0;
    public final ah.i f33651f1;
    public org.telegram.ui.ActionBar.w0 f33652g0;
    public final fh.d f33653g1;
    public org.telegram.ui.Components.y10 h;
    public org.telegram.ui.ActionBar.w0 f33654h0;
    public final fh.d f33655h1;
    public org.telegram.ui.ActionBar.w0 f33656i0;
    public final ah.c f33657i1;
    public org.telegram.ui.ActionBar.g1 f33658j0;
    public ah.o f33659j1;
    public org.telegram.ui.ActionBar.g1 f33660k0;
    public final ArrayList f33661k1;
    public org.telegram.ui.ActionBar.g1 f33662l0;
    public final RectF l1;
    public org.telegram.ui.ActionBar.w0 m0;
    public final RectF f33663m1;
    public vf1 f33664n;
    public RadialProgressView f33665n0;
    public t41 f33666o0;
    public org.telegram.ui.ActionBar.w0 f33667p0;
    public org.telegram.ui.ActionBar.w0 f33668q0;
    public final uf1 f33669r;
    public bg1 f33670r0;
    public final TopicsController f33671s;
    public boolean f33672s0;
    public final boolean f33673t0;
    public final boolean f33674u0;
    public gg1 v;
    public final boolean f33675v0;
    public cx f33676w;
    public final boolean f33677w0;
    public int f33678x;
    public final boolean f33679x0;
    public int f33680y;
    public String f33681y0;
    public boolean f33682z0;

    public fg1(Bundle bundle) {
        super(bundle);
        this.f33639b = new ArrayList();
        new ArrayList();
        this.f33669r = new uf1(this);
        this.f33678x = 0;
        this.E = true;
        this.G = true;
        this.V = true;
        this.W = 0.0f;
        this.f33637a0 = new HashSet();
        this.B0 = false;
        this.O0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.topicsDidLoaded});
        this.S0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f33661k1 = arrayList;
        RectF rectF = new RectF();
        this.l1 = rectF;
        RectF rectF2 = new RectF();
        this.f33663m1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j3 = this.arguments.getLong("chat_id", 0L);
        this.f33636a = j3;
        this.f33673t0 = this.arguments.getBoolean("for_select", false);
        this.f33674u0 = this.arguments.getBoolean("forward_to", false);
        this.f33679x0 = this.arguments.getBoolean("bot_share_to", false);
        this.f33675v0 = this.arguments.getBoolean("quote", false);
        this.f33677w0 = this.arguments.getBoolean("reply_to", false);
        this.f33681y0 = this.arguments.getString("voicechat", null);
        this.f33682z0 = this.arguments.getBoolean("videochat", false);
        this.f33671s = getMessagesController().getTopicsController();
        this.V0 = true ^ org.telegram.messenger.w1.v("topics_end_reached_", j3, getUserConfig().getPreferences(), false);
        fh.c cVar = new fh.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.f18862d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f33651f1 = new ah.i(false);
            this.f33653g1 = new fh.d(null);
            fh.d dVar = new fh.d(null);
            this.f33655h1 = dVar;
            ah.c cVar2 = new ah.c(dVar);
            this.f33657i1 = cVar2;
            cVar2.f427i = LiteMode.isEnabled(262144);
            return;
        }
        this.f33651f1 = null;
        this.f33653g1 = null;
        this.f33655h1 = null;
        this.f33657i1 = new ah.c(cVar);
    }

    public static org.telegram.ui.ActionBar.o2 E0(MessagesController messagesController, MessagesStorage messagesStorage, Bundle bundle) {
        long j3 = bundle.getLong("chat_id");
        if (j3 != 0) {
            TLRPC.Dialog dialog = messagesController.getDialog(-j3);
            if (dialog != null && dialog.view_forum_as_messages) {
                return new bo(bundle);
            }
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j3);
            if (chatFull == null) {
                chatFull = messagesStorage.loadChatInfo(j3, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.view_forum_as_messages) {
                return new bo(bundle);
            }
        }
        return new fg1(bundle);
    }

    public static org.telegram.ui.ActionBar.o2 F0(LaunchActivity launchActivity, Bundle bundle) {
        return E0(MessagesController.getInstance(launchActivity.O), MessagesStorage.getInstance(launchActivity.O), bundle);
    }

    public static void I0(org.telegram.ui.bo r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fg1.I0(org.telegram.ui.bo):void");
    }

    public static boolean U(fg1 fg1Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(fg1Var.currentAccount).edit();
        edit.putLong("dialog_join_requested_time_" + (-fg1Var.f33636a), System.currentTimeMillis()).commit();
        Activity parentActivity = fg1Var.getParentActivity();
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(fg1Var.g());
        int i10 = org.telegram.ui.Components.g80.f24112r;
        org.telegram.ui.Components.g80.w(parentActivity, fg1Var, org.telegram.ui.Components.vc.a0(fg1Var), isChannelAndNotMegaGroup);
        fg1Var.O0(true);
        return false;
    }

    public static void V(fg1 fg1Var, View view) {
        long j3;
        long j10 = fg1Var.f33636a;
        if (fg1Var.getParentLayout() != null && !((ActionBarLayout) fg1Var.getParentLayout()).y() && (view instanceof cg1)) {
            TLRPC.TL_forumTopic tL_forumTopic = ((cg1) view).N;
            long j11 = -j10;
            boolean isMonoForum = fg1Var.getMessagesController().isMonoForum(j11);
            if (tL_forumTopic == null) {
                j3 = 0;
            } else if (isMonoForum) {
                j3 = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            } else {
                j3 = tL_forumTopic.f18173id;
            }
            long j12 = j3;
            if (fg1Var.f33673t0) {
                gg1 gg1Var = fg1Var.v;
                if (gg1Var != null) {
                    ig1 ig1Var = gg1Var.f33969a;
                    Bundle bundle = new Bundle();
                    lg1 lg1Var = ig1Var.f34564a;
                    bundle.putLong("dialog_id", lg1Var.f35546c);
                    bundle.putLong("topic_id", tL_forumTopic.f18173id);
                    bundle.putBoolean("exception", true);
                    y11 y11Var = new y11(bundle, null);
                    y11Var.f39768r = new tv0(16, ig1Var, tL_forumTopic);
                    lg1Var.presentFragment(y11Var);
                }
                wy wyVar = fg1Var.L0;
                if (wyVar != null) {
                    wyVar.O3(j11, j12, true, fg1Var);
                }
            } else if (fg1Var.f33637a0.size() > 0) {
                fg1Var.N0(view);
            } else {
                if (fg1Var.inPreviewMode && AndroidUtilities.isTablet()) {
                    for (org.telegram.ui.ActionBar.o2 o2Var : fg1Var.getParentLayout().getFragmentStack()) {
                        if (o2Var instanceof wy) {
                            wy wyVar2 = (wy) o2Var;
                            if (wyVar2.h4()) {
                                MessagesStorage.TopicKey topicKey = wyVar2.f39270p2;
                                if (topicKey.dialogId == j11 && topicKey.topicId == j12) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    fg1Var.Q0 = j12;
                    fg1Var.U0(false, false);
                }
                ng.d.m(fg1Var, j10, tL_forumTopic, 0);
            }
        }
    }

    public static boolean W(fg1 fg1Var, View view, float f7) {
        if (fg1Var.f33673t0 || fg1Var.getParentLayout() == null || ((ActionBarLayout) fg1Var.getParentLayout()).y()) {
            return false;
        }
        if (!fg1Var.actionBar.s() && !AndroidUtilities.isTablet() && (view instanceof cg1)) {
            cg1 cg1Var = (cg1) view;
            if (cg1Var.S(f7)) {
                fg1Var.M0(cg1Var);
                fg1Var.N.J0(true);
                fg1Var.N.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        fg1Var.N0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void X(fg1 fg1Var) {
        ViewGroup viewGroup;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                viewGroup = fg1Var.N;
            } else {
                bg1 bg1Var = fg1Var.f33670r0;
                if (bg1Var != null) {
                    viewGroup = bg1Var.V;
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
                    } else if (childAt instanceof org.telegram.ui.Cells.ab) {
                        ((org.telegram.ui.Cells.ab) childAt).j(0);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.k kVar = fg1Var.actionBar;
        if (kVar != null) {
            kVar.E(fg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.G8), true);
            fg1Var.actionBar.F(fg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.E8), false, true);
            fg1Var.actionBar.F(fg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.F8), true, true);
            fg1Var.actionBar.G(fg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.I5), true);
        }
        u50 u50Var = fg1Var.P0;
        if (u50Var != null && Build.VERSION.SDK_INT >= 23) {
            u50Var.setForeground(new ColorDrawable(i0.a.k(fg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18862d6), 100)));
        }
        fg1Var.P0();
    }

    public static void b0(fg1 fg1Var, boolean z10) {
        float f7;
        boolean z11;
        qx qxVar;
        fg1Var.f33672s0 = z10;
        ValueAnimator valueAnimator = fg1Var.Y0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            fg1Var.Y0.cancel();
        }
        if (fg1Var.f33638a1 == null) {
            org.telegram.ui.Components.i81 n10 = fg1Var.f33670r0.n(8, false);
            fg1Var.f33638a1 = n10;
            if (fg1Var.M0 != null) {
                n10.setBackgroundColor(fg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18862d6));
            }
            fg1Var.e.addView(fg1Var.f33638a1, w7.x5.c(44.0f, -1));
        }
        float f10 = fg1Var.W;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        fg1Var.Y0 = ValueAnimator.ofFloat(f10, f7);
        AndroidUtilities.updateViewVisibilityAnimated(fg1Var.f33670r0, false, 1.0f, true);
        wy wyVar = fg1Var.M0;
        if (wyVar != null && (qxVar = wyVar.F3) != null) {
            qxVar.M = !z10;
        }
        if (!z10 && fg1Var.f33670r0.getVisibility() == 0 && fg1Var.f33670r0.getAlpha() == 1.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        fg1Var.Z0 = z11;
        fg1Var.Y0.addUpdateListener(new k21(fg1Var, 16));
        fg1Var.f33670r0.setVisibility(0);
        if (!z10) {
            fg1Var.f33668q0.setVisibility(0);
        } else {
            AndroidUtilities.requestAdjustResize(fg1Var.getParentActivity(), fg1Var.classGuid);
            fg1Var.Q0(false);
        }
        fg1Var.Y0.addListener(new of1(fg1Var, z10, 0));
        fg1Var.Y0.setDuration(200L);
        fg1Var.Y0.setInterpolator(org.telegram.ui.Components.qr.f27380f);
        fg1Var.Y0.start();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
    }

    public final void A0() {
        this.J0 = this.f33671s.isLoading(this.f33636a);
        if (this.D0 != null) {
            ArrayList arrayList = this.f33639b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((wf1) arrayList.get(0)).f39026c != null && ((wf1) arrayList.get(0)).f39026c.f18173id == 1)) {
                this.D0.e(this.J0, this.fragmentBeginToShow);
            }
        }
        qf1 qf1Var = this.N;
        if (qf1Var != null) {
            qf1Var.L0(qf1Var.v1());
        }
        Q0(true);
    }

    public final void B0() {
        int i10;
        float f7;
        float f10;
        wy wyVar = this.M0;
        float f11 = 0.0f;
        if (wyVar != null) {
            int dp = AndroidUtilities.dp(14.0f);
            org.telegram.ui.Components.ks ksVar = wyVar.J1;
            if (ksVar != null) {
                f7 = ksVar.c(dp);
            } else {
                f7 = 0.0f;
            }
            float f12 = f7 + 0.0f;
            org.telegram.ui.Components.ks ksVar2 = this.U0;
            if (ksVar2 != null) {
                float dp2 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.ks ksVar3 = this.M0.J1;
                if (ksVar3 != null) {
                    f10 = ksVar3.getMetadata().f14000c.f14008a;
                } else {
                    f10 = 0.0f;
                }
                ksVar2.setTranslationY(f12 - (f10 * dp2));
                org.telegram.ui.Components.ks ksVar4 = this.U0;
                int dp3 = AndroidUtilities.dp(14.0f);
                int dp4 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.ks ksVar5 = this.M0.J1;
                if (ksVar5 != null) {
                    f11 = ksVar5.getMetadata().f14000c.f14008a;
                }
                f11 = ksVar4.c(AndroidUtilities.lerp(dp3, dp4, f11)) + f12;
            } else {
                f11 = f12;
            }
        } else {
            org.telegram.ui.Components.ks ksVar6 = this.U0;
            if (ksVar6 != null) {
                f11 = 0.0f + ksVar6.c(AndroidUtilities.dp(14.0f));
            }
        }
        int i11 = this.f33648e1 + this.f33644c1;
        if (this.V) {
            i10 = AndroidUtilities.dp(51.0f);
        } else {
            i10 = 0;
        }
        this.N.setPadding(0, (int) f11, 0, i11 + i10);
    }

    public final void C0() {
        this.f33637a0.clear();
        this.actionBar.r();
        AndroidUtilities.updateVisibleRows(this.N);
        R0();
    }

    public final void D0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18446a;
        c2Var.R = pluralString;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            c2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, this.f33671s.findTopic(this.f33636a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            c2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a1.d(this, hashSet, arrayList, runnable, 19));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new bs0(7));
        c2Var.show();
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19100q7));
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
        bundle.putLong("chat_id", this.f33636a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f33649f.getSharedMediaPreloader());
        profileActivity.K4(this.J);
        if (this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f33649f.getAvatarImageView().getImageReceiver().hasImageLoaded() && z10) {
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
            org.telegram.ui.Components.h61 h61Var = this.L;
            if (i10 == 0) {
                i11 = org.telegram.ui.ActionBar.j6.Ae;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.f19100q7;
            }
            h61Var.setTextColorKey(i11);
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
        mf1 mf1Var = this.d;
        if (mf1Var != null) {
            if (z10) {
                mf1Var.setLayerType(2, null);
                mf1Var.setClipChildren(false);
                mf1Var.setClipToPadding(false);
            } else {
                mf1Var.setLayerType(0, null);
                mf1Var.setClipChildren(true);
                mf1Var.setClipToPadding(true);
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
            qf1 qf1Var = this.N;
            if (qf1Var != null) {
                float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, this.S0, 0.05f, 1.0f);
                qf1Var.setPivotX(0.0f);
                qf1Var.setPivotY(0.0f);
                qf1Var.setScaleX(b10);
                qf1Var.setScaleY(b10);
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
        org.telegram.ui.Components.po poVar = new org.telegram.ui.Components.po(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new lf1(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(poVar.f27088f);
        poVar.f27096o = 1;
        long j10 = this.f33636a;
        long j11 = -j10;
        poVar.d(j11, tL_forumTopic.f18173id, null);
        if (ChatObject.canManageTopics(g())) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                g1Var.g(LocaleController.getString(R.string.DialogUnpin), R.drawable.msg_unpin, null);
            } else {
                g1Var.g(LocaleController.getString(R.string.DialogPin), R.drawable.msg_pin, null);
            }
            g1Var.setMinimumWidth(160);
            g1Var.setOnClickListener(new View.OnClickListener(this) {
                public final fg1 f33631b;

                {
                    this.f33631b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            fg1 fg1Var = this.f33631b;
                            fg1Var.C0 = true;
                            fg1Var.N0 = true;
                            TopicsController topicsController = fg1Var.f33671s;
                            long j12 = fg1Var.f33636a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j12, tL_forumTopic2.f18173id, !tL_forumTopic2.pinned, fg1Var);
                            fg1Var.finishPreviewFragment();
                            return;
                        case 1:
                            fg1 fg1Var2 = this.f33631b;
                            fg1Var2.N0 = true;
                            TopicsController topicsController2 = fg1Var2.f33671s;
                            long j13 = fg1Var2.f33636a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j13, tL_forumTopic3.f18173id, true ^ tL_forumTopic3.closed);
                            fg1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f18173id));
                            fg1 fg1Var3 = this.f33631b;
                            fg1Var3.D0(hashSet, new df1(fg1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(g1Var);
        }
        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(getParentActivity(), false, false);
        if (getMessagesController().isDialogMuted(j11, tL_forumTopic.f18173id)) {
            g1Var2.g(LocaleController.getString(R.string.Unmute), R.drawable.msg_mute, null);
        } else {
            g1Var2.g(LocaleController.getString(R.string.Mute), R.drawable.msg_unmute, null);
        }
        g1Var2.setMinimumWidth(160);
        g1Var2.setOnClickListener(new ai.s7(this, tL_forumTopic, (Serializable) r32, b10, 6));
        r32[0].addView(g1Var2);
        if (ChatObject.canManageTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                g1Var3.g(LocaleController.getString(R.string.RestartTopic), R.drawable.msg_topic_restart, null);
            } else {
                g1Var3.g(LocaleController.getString(R.string.CloseTopic), R.drawable.msg_topic_close, null);
            }
            g1Var3.setMinimumWidth(160);
            g1Var3.setOnClickListener(new View.OnClickListener(this) {
                public final fg1 f33631b;

                {
                    this.f33631b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            fg1 fg1Var = this.f33631b;
                            fg1Var.C0 = true;
                            fg1Var.N0 = true;
                            TopicsController topicsController = fg1Var.f33671s;
                            long j12 = fg1Var.f33636a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j12, tL_forumTopic2.f18173id, !tL_forumTopic2.pinned, fg1Var);
                            fg1Var.finishPreviewFragment();
                            return;
                        case 1:
                            fg1 fg1Var2 = this.f33631b;
                            fg1Var2.N0 = true;
                            TopicsController topicsController2 = fg1Var2.f33671s;
                            long j13 = fg1Var2.f33636a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j13, tL_forumTopic3.f18173id, true ^ tL_forumTopic3.closed);
                            fg1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f18173id));
                            fg1 fg1Var3 = this.f33631b;
                            fg1Var3.D0(hashSet, new df1(fg1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(g1Var3);
        }
        if (ChatObject.canDeleteTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(getParentActivity(), false, true);
            g1Var4.g(LocaleController.getPluralString("DeleteTopics", 1), R.drawable.msg_delete, null);
            g1Var4.setIconColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19082p7));
            g1Var4.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19100q7));
            g1Var4.setMinimumWidth(160);
            g1Var4.setOnClickListener(new View.OnClickListener(this) {
                public final fg1 f33631b;

                {
                    this.f33631b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            fg1 fg1Var = this.f33631b;
                            fg1Var.C0 = true;
                            fg1Var.N0 = true;
                            TopicsController topicsController = fg1Var.f33671s;
                            long j12 = fg1Var.f33636a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j12, tL_forumTopic2.f18173id, !tL_forumTopic2.pinned, fg1Var);
                            fg1Var.finishPreviewFragment();
                            return;
                        case 1:
                            fg1 fg1Var2 = this.f33631b;
                            fg1Var2.N0 = true;
                            TopicsController topicsController2 = fg1Var2.f33671s;
                            long j13 = fg1Var2.f33636a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j13, tL_forumTopic3.f18173id, true ^ tL_forumTopic3.closed);
                            fg1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f18173id));
                            fg1 fg1Var3 = this.f33631b;
                            fg1Var3.D0(hashSet, new df1(fg1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(g1Var4);
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
        bo boVar = new bo(w.f.e(j10, "chat_id"));
        if (isMonoForum) {
            j3 = DialogObject.getPeerDialogId(r2Var.N.from_id);
        } else {
            j3 = r2Var.N.f18173id;
        }
        ng.d.a(boVar, MessagesStorage.TopicKey.of(j11, j3));
        presentFragmentAsPreviewWithMenu(boVar, r32[0]);
    }

    public final void N0(View view) {
        cg1 cg1Var;
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
        if ((view instanceof cg1) && (tL_forumTopic = (cg1Var = (cg1) view).N) != null) {
            int i19 = tL_forumTopic.f18173id;
            Integer valueOf = Integer.valueOf(i19);
            HashSet hashSet = this.f33637a0;
            if (!hashSet.remove(valueOf)) {
                hashSet.add(Integer.valueOf(i19));
            }
            cg1Var.V(hashSet.contains(Integer.valueOf(i19)), true);
            MessagesController messagesController = getMessagesController();
            long j3 = this.f33636a;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            if (!hashSet.isEmpty()) {
                if (!this.actionBar.a(null)) {
                    org.telegram.ui.ActionBar.a0 j10 = this.actionBar.j(null);
                    if (this.inPreviewMode) {
                        j10.setBackgroundColor(0);
                        j10.f18450a = false;
                    }
                    NumberTextView numberTextView = new NumberTextView(j10.getContext());
                    this.f33643c0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f33643c0.setTypeface(AndroidUtilities.bold());
                    this.f33643c0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19246y8));
                    j10.addView(this.f33643c0, w7.x5.m(1.0f, 0, -1, 72, 0, 0));
                    this.f33643c0.setOnTouchListener(new gf1(0));
                    this.f33645d0 = j10.g(4, R.drawable.msg_pin, AndroidUtilities.dp(54.0f));
                    this.f33647e0 = j10.g(5, R.drawable.msg_unpin, AndroidUtilities.dp(54.0f));
                    this.f33650f0 = j10.g(6, R.drawable.msg_mute, AndroidUtilities.dp(54.0f));
                    this.f33652g0 = j10.h(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                    org.telegram.ui.ActionBar.w0 h = j10.h(12, R.drawable.msg_archive_hide, LocaleController.getString(R.string.Hide), AndroidUtilities.dp(54.0f));
                    this.f33654h0 = h;
                    h.setVisibility(8);
                    org.telegram.ui.ActionBar.w0 h10 = j10.h(13, R.drawable.msg_archive_show, LocaleController.getString(R.string.Show), AndroidUtilities.dp(54.0f));
                    this.f33656i0 = h10;
                    h10.setVisibility(8);
                    org.telegram.ui.ActionBar.w0 h11 = j10.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(54.0f));
                    this.m0 = h11;
                    this.f33658j0 = h11.e(8, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
                    this.f33660k0 = this.m0.e(9, R.drawable.msg_topic_close, LocaleController.getString(R.string.CloseTopic));
                    this.f33662l0 = this.m0.e(10, R.drawable.msg_topic_restart, LocaleController.getString(R.string.RestartTopic));
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
                    topicsController = this.f33671s;
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
                    this.f33658j0.setVisibility(0);
                    this.f33658j0.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
                } else {
                    this.f33658j0.setVisibility(8);
                }
                if (i21 != 0) {
                    this.B0 = false;
                    this.f33650f0.setIcon(R.drawable.msg_unmute);
                    this.f33650f0.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
                    z10 = true;
                } else {
                    z10 = true;
                    this.B0 = true;
                    this.f33650f0.setIcon(R.drawable.msg_mute);
                    this.f33650f0.setContentDescription(LocaleController.getString(R.string.ChatsMute));
                }
                org.telegram.ui.ActionBar.w0 w0Var = this.f33645d0;
                if (i22 == z10 && i23 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                w0Var.setVisibility(i10);
                org.telegram.ui.ActionBar.w0 w0Var2 = this.f33647e0;
                if (i23 == z10 && i22 == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                w0Var2.setVisibility(i11);
                this.f33643c0.a(hashSet3.size(), z10);
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
                            if (findTopic2.f18173id == 1) {
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
                org.telegram.ui.ActionBar.g1 g1Var = this.f33660k0;
                if (i24 == 0 && i25 > 0) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                g1Var.setVisibility(i12);
                org.telegram.ui.ActionBar.g1 g1Var2 = this.f33660k0;
                if (i25 > 1) {
                    i13 = R.string.CloseTopics;
                } else {
                    i13 = R.string.CloseTopic;
                }
                g1Var2.setText(LocaleController.getString(i13));
                org.telegram.ui.ActionBar.g1 g1Var3 = this.f33662l0;
                if (i25 == 0 && i24 > 0) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                g1Var3.setVisibility(i14);
                org.telegram.ui.ActionBar.g1 g1Var4 = this.f33662l0;
                if (i24 > 1) {
                    i15 = R.string.RestartTopics;
                } else {
                    i15 = R.string.RestartTopic;
                }
                g1Var4.setText(LocaleController.getString(i15));
                org.telegram.ui.ActionBar.w0 w0Var3 = this.f33652g0;
                if (i26 == hashSet3.size()) {
                    i16 = 0;
                } else {
                    i16 = 8;
                }
                w0Var3.setVisibility(i16);
                org.telegram.ui.ActionBar.w0 w0Var4 = this.f33654h0;
                if (i27 == 1 && hashSet3.size() == 1) {
                    i17 = 0;
                } else {
                    i17 = 8;
                }
                w0Var4.setVisibility(i17);
                org.telegram.ui.ActionBar.w0 w0Var5 = this.f33656i0;
                if (i28 == 1 && hashSet3.size() == 1) {
                    i18 = 0;
                } else {
                    i18 = 8;
                }
                w0Var5.setVisibility(i18);
                this.m0.l();
                R0();
                return;
            }
            this.actionBar.r();
        }
    }

    public final void O0(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fg1.O0(boolean):void");
    }

    public final void P0() {
        RadialProgressView radialProgressView = this.f33665n0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.j6.Ae));
        this.h.g();
        t41 t41Var = this.f33666o0;
        int i10 = org.telegram.ui.ActionBar.j6.f18862d6;
        t41Var.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(getThemedColor(i10));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19139s8));
        }
        this.f33670r0.setBackgroundColor(getThemedColor(i10));
    }

    public final void Q0(boolean z10) {
        boolean z11;
        if (this.Q == null) {
            return;
        }
        MessagesController messagesController = getMessagesController();
        long j3 = this.f33636a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        int i10 = 0;
        if (!ChatObject.isNotInChat(getMessagesController().getChat(Long.valueOf(j3))) && ChatObject.canCreateTopic(chat) && !this.f33672s0 && !this.f33673t0 && !this.J0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.K = z11;
        org.telegram.ui.ActionBar.g1 g1Var = this.Q;
        if (!z11) {
            i10 = 8;
        }
        g1Var.setVisibility(i10);
        G0(!this.K, z10);
    }

    public final void R0() {
        boolean z10;
        if (ChatObject.canManageTopics(g()) && !this.f33637a0.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f33640b0 != z10) {
            this.f33640b0 = z10;
            uf1 uf1Var = this.f33669r;
            uf1Var.q(0, uf1Var.h());
        }
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        return false;
    }

    public final void S0(float f7) {
        this.W = f7;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f19194v8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f19246y8;
        kVar.B(i0.a.d(this.W, themedColor, getThemedColor(i10)), false);
        this.actionBar.B(i0.a.d(this.W, getThemedColor(i10), getThemedColor(i10)), true);
        this.actionBar.A(i0.a.d(this.W, getThemedColor(org.telegram.ui.ActionBar.j6.f19158t8), getThemedColor(org.telegram.ui.ActionBar.j6.f19265z8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(i0.a.d(this.W, getThemedColor(org.telegram.ui.ActionBar.j6.f19139s8), getThemedColor(org.telegram.ui.ActionBar.j6.f18862d6)));
        }
        float f10 = 1.0f - f7;
        this.f33649f.getTitleTextView().setAlpha(f10);
        this.f33649f.getSubtitleTextView().setAlpha(f10);
        org.telegram.ui.Components.i81 i81Var = this.f33638a1;
        if (i81Var != null) {
            i81Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
            this.f33638a1.setAlpha(f7);
        }
        this.f33670r0.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
        this.f33670r0.setAlpha(f7);
        if (isInPreviewMode()) {
            this.e.invalidate();
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
        ai.d7 d7Var = this.D0;
        if (d7Var != null && d7Var.e != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
            org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.ic_ab_other, 0);
            oqVar.setSize(AndroidUtilities.dp(16.0f));
            spannableStringBuilder.setSpan(oqVar, 0, 1, 0);
            if (ChatObject.canUserDoAdminAction(g(), 15)) {
                this.D0.e.setText(AndroidUtilities.replaceCharSequence("%s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoTopicsDescription)), spannableStringBuilder));
                return;
            }
            String string = LocaleController.getString(R.string.General);
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.f33636a, 1L);
            if (findTopic != null) {
                string = findTopic.title;
            }
            this.D0.e.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoTopicsDescriptionUser", R.string.NoTopicsDescriptionUser, string)));
        }
    }

    public final void U0(boolean z10, boolean z11) {
        hf1 hf1Var;
        sf1 sf1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z10 && this.N0) {
            z10 = true;
        }
        this.N0 = false;
        TopicsController topicsController = this.f33671s;
        long j3 = this.f33636a;
        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j3);
        if (topics != null) {
            ArrayList arrayList = this.f33639b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            sf1 sf1Var2 = null;
            if (UserObject.isBotForum(this.currentAccount, -j3) && this.f33674u0) {
                arrayList.add(new wf1(3, null));
            }
            for (int i10 = 0; i10 < topics.size(); i10++) {
                HashSet hashSet = this.A0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(topics.get(i10).f18173id))) {
                    arrayList.add(new wf1(0, topics.get(i10)));
                }
            }
            if (!arrayList.isEmpty() && !topicsController.endIsReached(j3) && this.V0) {
                arrayList.add(new wf1(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.K0.b(size + 4);
                z10 = false;
            }
            this.f33678x = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                wf1 wf1Var = (wf1) arrayList.get(i11);
                if (wf1Var != null && (tL_forumTopic = wf1Var.f39026c) != null && tL_forumTopic.hidden) {
                    this.f33678x++;
                }
            }
            qf1 qf1Var = this.N;
            if (qf1Var != null) {
                s4.m0 itemAnimator = qf1Var.getItemAnimator();
                if (z10) {
                    sf1Var = this.I0;
                } else {
                    sf1Var = null;
                }
                if (itemAnimator != sf1Var) {
                    qf1 qf1Var2 = this.N;
                    if (z10) {
                        sf1Var2 = this.I0;
                    }
                    qf1Var2.setItemAnimator(sf1Var2);
                }
            }
            uf1 uf1Var = this.f33669r;
            if (uf1Var != null) {
                uf1Var.E(arrayList2, arrayList);
            }
            if ((this.C0 || size == 0) && (hf1Var = this.F) != null) {
                hf1Var.h1(0, 0);
                this.C0 = false;
            }
        }
        A0();
        T0();
    }

    @Override
    public final long a() {
        return -this.f33636a;
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
        wy wyVar = this.M0;
        if (wyVar != null && wyVar.W) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.f33644c1 = i10;
        wy wyVar2 = this.M0;
        if (wyVar2 != null && wyVar2.W) {
            i11 = AndroidUtilities.dp(64.0f);
        } else {
            i11 = 0;
        }
        this.f33646d1 = i11;
        mf1 mf1Var = new mf1(this, context);
        this.d = mf1Var;
        this.fragmentView = mf1Var;
        mf1Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18862d6));
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
        hg.k0.x(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new pf1(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) {
            public final fg1 f32787b;

            {
                this.f32787b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (r2) {
                    case 0:
                        fg1 fg1Var = this.f32787b;
                        fg1Var.presentFragment(bf1.a0(fg1Var.f33636a, 0L));
                        return;
                    case 1:
                        fg1 fg1Var2 = this.f32787b;
                        fg1Var2.getMessagesController().hidePeerSettingsBar(-fg1Var2.f33636a, null, fg1Var2.g());
                        fg1Var2.O0(false);
                        return;
                    case 2:
                        fg1 fg1Var3 = this.f32787b;
                        if (!fg1Var3.f33672s0) {
                            fg1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f32787b.finishPreviewFragment();
                        return;
                    default:
                        wy wyVar3 = this.f32787b.M0;
                        if (wyVar3 != null && (w0Var = wyVar3.f39241j0) != null) {
                            w0Var.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.a0 n10 = this.actionBar.n();
        if (this.M0 != null) {
            org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
            this.f33667p0 = a2;
            a2.setOnClickListener(new View.OnClickListener(this) {
                public final fg1 f32787b;

                {
                    this.f32787b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.w0 w0Var;
                    switch (r2) {
                        case 0:
                            fg1 fg1Var = this.f32787b;
                            fg1Var.presentFragment(bf1.a0(fg1Var.f33636a, 0L));
                            return;
                        case 1:
                            fg1 fg1Var2 = this.f32787b;
                            fg1Var2.getMessagesController().hidePeerSettingsBar(-fg1Var2.f33636a, null, fg1Var2.g());
                            fg1Var2.O0(false);
                            return;
                        case 2:
                            fg1 fg1Var3 = this.f32787b;
                            if (!fg1Var3.f33672s0) {
                                fg1Var3.H0(false);
                                return;
                            }
                            return;
                        case 3:
                            this.f32787b.finishPreviewFragment();
                            return;
                        default:
                            wy wyVar3 = this.f32787b.M0;
                            if (wyVar3 != null && (w0Var = wyVar3.f39241j0) != null) {
                                w0Var.performClick();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.w0 a10 = n10.a(0, R.drawable.outline_header_search);
            this.f33667p0 = a10;
            a10.F();
            a10.H = new hg.d2(this, 19);
            this.f33667p0.setSearchPaddingStart(56);
            this.f33667p0.setSearchFieldHint(LocaleController.getString(R.string.Search));
            EditTextBoldCursor searchField = this.f33667p0.getSearchField();
            searchField.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.G6));
            searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Si));
            searchField.setCursorColor(getThemedColor(org.telegram.ui.ActionBar.j6.Wd));
        }
        org.telegram.ui.ActionBar.w0 c10 = n10.c(0, R.drawable.ic_ab_other, null);
        this.f33668q0 = c10;
        c10.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.f33668q0.e(1, R.drawable.msg_discussion, LocaleController.getString(R.string.TopicViewAsMessages));
        this.R = this.f33668q0.e(2, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddMember));
        org.telegram.ui.ActionBar.w0 w0Var = this.f33668q0;
        this.T = w0Var.d(14, 0, new org.telegram.ui.Components.yi0(R.raw.boosts, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f)), LocaleController.getString(R.string.BoostingBoostGroupMenu), true, false, w0Var.m0);
        this.Q = this.f33668q0.e(3, R.drawable.msg_topic_create, LocaleController.getString(R.string.CreateTopic));
        this.U = this.f33668q0.e(15, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat));
        this.S = this.f33668q0.f(11, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMegaMenu), null);
        org.telegram.ui.Components.eo eoVar = new org.telegram.ui.Components.eo(context, this, false, this.resourceProvider);
        this.f33649f = eoVar;
        eoVar.getAvatarImageView().setRoundRadius(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.eo eoVar2 = this.f33649f;
        if (!AndroidUtilities.isTablet() && !this.inPreviewMode) {
            z11 = true;
        } else {
            z11 = false;
        }
        eoVar2.setOccupyStatusBar(z11);
        org.telegram.ui.Components.eo eoVar3 = this.f33649f;
        long j3 = -this.f33636a;
        if (j3 < 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        eoVar3.f23609b = z12;
        eoVar3.setClipChildren(false);
        this.actionBar.addView(this.f33649f, 0, w7.x5.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.f33673t0) {
            this.f33649f.getAvatarImageView().setOnClickListener(new a8(this, 3));
        }
        this.N = new qf1(this, context);
        hh.k kVar2 = new hh.k(this.d);
        ViewGroup viewGroup = this.d;
        ah.c cVar = this.f33657i1;
        cVar.f425f = kVar2;
        cVar.f426g = viewGroup;
        qf1 qf1Var = this.N;
        wy wyVar3 = this.M0;
        if (wyVar3 != null) {
            viewGroup = (ViewGroup) wyVar3.getFragmentView();
        }
        qf1 qf1Var2 = this.N;
        Objects.requireNonNull(qf1Var2);
        this.f33659j1 = new ah.o(qf1Var, viewGroup, new x8(qf1Var2, 2));
        this.N.D0(new df1(this, 5));
        SpannableString spannableString = new SpannableString("#");
        ng.c c11 = ng.d.c(getParentActivity(), 0.85f, -1, false);
        c11.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
        spannableString.setSpan(new ImageSpan(c11, 2), 0, 1, 33);
        cx cxVar = new cx(this, AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccSwipeForGeneral), spannableString), AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccReleaseForGeneral), spannableString));
        this.f33676w = cxVar;
        cxVar.b();
        if (this.E) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        this.f33680y = i12;
        cx cxVar2 = this.f33676w;
        if (i12 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        cxVar2.X = z13;
        sf1 sf1Var = new sf1(this);
        this.N.setHideIfEmpty(false);
        sf1Var.f42732m = false;
        sf1Var.C = false;
        qf1 qf1Var3 = this.N;
        this.I0 = sf1Var;
        qf1Var3.setItemAnimator(sf1Var);
        this.N.setOnScrollListener(new if1(this, 1));
        qf1 qf1Var4 = this.N;
        qf1Var4.Y1 = true;
        qf1Var4.Z1 = 0;
        org.telegram.ui.Components.rk0 rk0Var = new org.telegram.ui.Components.rk0(qf1Var4, true);
        this.K0 = rk0Var;
        this.N.setItemsEnterAnimator(rk0Var);
        this.N.setOnItemClickListener(new b31(this, 9));
        this.N.setOnItemLongClickListener(new ef1(this));
        this.N.setOnScrollListener(new if1(this, 2));
        qf1 qf1Var5 = this.N;
        hf1 hf1Var = new hf1(this);
        this.F = hf1Var;
        qf1Var5.setLayoutManager(hf1Var);
        new SparseArray();
        new HashMap();
        this.N.setAdapter(this.f33669r);
        this.N.setClipToPadding(false);
        this.N.j(new if1(this, 0));
        eg1 eg1Var = new eg1(this);
        this.P = eg1Var;
        jf1 jf1Var = new jf1(this, eg1Var);
        this.O = jf1Var;
        jf1Var.e(this.N);
        this.d.addView(this.N, w7.x5.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.N.getLayoutParams()).topMargin = -AndroidUtilities.dp(100.0f);
        org.telegram.ui.Components.y10 y10Var = new org.telegram.ui.Components.y10(getParentActivity(), this.resourceProvider, false);
        this.h = y10Var;
        this.d.addView(y10Var, org.telegram.ui.Components.y10.b());
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final fg1 f32787b;

            {
                this.f32787b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (r2) {
                    case 0:
                        fg1 fg1Var = this.f32787b;
                        fg1Var.presentFragment(bf1.a0(fg1Var.f33636a, 0L));
                        return;
                    case 1:
                        fg1 fg1Var2 = this.f32787b;
                        fg1Var2.getMessagesController().hidePeerSettingsBar(-fg1Var2.f33636a, null, fg1Var2.g());
                        fg1Var2.O0(false);
                        return;
                    case 2:
                        fg1 fg1Var3 = this.f32787b;
                        if (!fg1Var3.f33672s0) {
                            fg1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f32787b.finishPreviewFragment();
                        return;
                    default:
                        wy wyVar32 = this.f32787b.M0;
                        if (wyVar32 != null && (w0Var2 = wyVar32.f39241j0) != null) {
                            w0Var2.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        this.h.f30075c.setImageResource(R.drawable.ic_chatlist_add_2);
        this.h.f30075c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.f30075c.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.h.setContentDescription(LocaleController.getString(R.string.CreateTopic));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        t00Var.setViewType(24);
        t00Var.setVisibility(8);
        t00Var.f27976w = true;
        ?? frameLayout = new FrameLayout(context);
        TextView textView = new TextView(context);
        frameLayout.f38410a = textView;
        if (LocaleController.isRTL) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.oq(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TapToCreateTopicHint));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.TapToCreateTopicHint));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.oq(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19244y6));
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
        this.f33664n = frameLayout;
        textView.setAlpha(0.0f);
        ai.d7 d7Var = new ai.d7(this, context, t00Var);
        this.D0 = d7Var;
        try {
            d7Var.f30673b.getImageReceiver().setAutoRepeat(2);
        } catch (Exception unused) {
        }
        this.D0.e(this.J0, this.fragmentBeginToShow);
        this.D0.d.setText(LocaleController.getString(R.string.NoTopics));
        T0();
        this.f33664n.addView(t00Var);
        this.f33664n.addView(this.D0);
        this.d.addView(this.f33664n);
        this.N.setEmptyView(this.f33664n);
        this.f33666o0 = new t41(context, 7);
        org.telegram.ui.Components.h61 h61Var = new org.telegram.ui.Components.h61(context);
        this.L = h61Var;
        this.f33666o0.addView(h61Var);
        this.d.addView(this.f33666o0, w7.x5.e(-1, 51, 80));
        this.L.setOnClickListener(new kf1(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f33665n0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(22.0f));
        this.f33665n0.setVisibility(4);
        this.f33666o0.addView(this.f33665n0, w7.x5.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.W0 = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.W0.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView2 = this.W0;
        int i13 = org.telegram.ui.ActionBar.j6.f18870de;
        imageView2.setBackground(org.telegram.ui.ActionBar.z5.c(null, org.telegram.ui.ActionBar.z5.b(getThemedColor(i13))));
        this.W0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), PorterDuff.Mode.MULTIPLY));
        this.W0.setScaleType(ImageView.ScaleType.CENTER);
        this.f33666o0.addView(this.W0, w7.x5.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.W0.setOnClickListener(new View.OnClickListener(this) {
            public final fg1 f32787b;

            {
                this.f32787b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (r2) {
                    case 0:
                        fg1 fg1Var = this.f32787b;
                        fg1Var.presentFragment(bf1.a0(fg1Var.f33636a, 0L));
                        return;
                    case 1:
                        fg1 fg1Var2 = this.f32787b;
                        fg1Var2.getMessagesController().hidePeerSettingsBar(-fg1Var2.f33636a, null, fg1Var2.g());
                        fg1Var2.O0(false);
                        return;
                    case 2:
                        fg1 fg1Var3 = this.f32787b;
                        if (!fg1Var3.f33672s0) {
                            fg1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f32787b.finishPreviewFragment();
                        return;
                    default:
                        wy wyVar32 = this.f32787b.M0;
                        if (wyVar32 != null && (w0Var2 = wyVar32.f39241j0) != null) {
                            w0Var2.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        this.W0.setVisibility(8);
        O0(false);
        j0 j0Var = new j0(this, context, 24);
        this.e = j0Var;
        if (this.M0 == null) {
            this.d.addView(j0Var, w7.x5.e(-1, -1, 119));
        }
        bg1 bg1Var = new bg1(this, context);
        this.f33670r0 = bg1Var;
        bg1Var.setVisibility(8);
        this.e.addView(this.f33670r0, w7.x5.d(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        bg1 bg1Var2 = this.f33670r0;
        int i14 = org.telegram.ui.ActionBar.j6.f18862d6;
        bg1Var2.setBackgroundColor(getThemedColor(i14));
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().loadChatInfo(this.f33636a, true, null, true, false, 0);
        org.telegram.ui.Components.ks ksVar = new org.telegram.ui.Components.ks(context);
        this.U0 = ksVar;
        ksVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        ch.d c12 = cVar.c(this.U0, eh.b.o(this.resourceProvider), false);
        c12.q(AndroidUtilities.dp(24.0f));
        c12.p(AndroidUtilities.dp(7.0f));
        this.U0.setBlurredBackground(c12);
        this.U0.setOnAnimatedHeightChangedListener(new df1(this, 0));
        this.d.addView(this.U0, w7.x5.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            wh.d dVar = new wh.d(g10, this);
            this.R0 = dVar;
            this.U0.addView(dVar.c(), w7.x5.n(-1, 40));
            this.U0.h(3, this.R0.c());
            this.U0.g(this.R0.c());
            wh.d dVar2 = this.R0;
            dVar2.f45106m = new ef1(this);
            TLRPC.ChatFull chatFull = this.J;
            dVar2.f45103j = chatFull;
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
        FrameLayout.LayoutParams c13 = w7.x5.c(-2.0f, -1);
        if (this.inPreviewMode) {
            c13.topMargin = AndroidUtilities.statusBarHeight;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, c13);
        }
        y0();
        u50 u50Var = new u50(this, context, 10);
        this.P0 = u50Var;
        if (Build.VERSION.SDK_INT >= 23) {
            u50Var.setForeground(new ColorDrawable(i0.a.k(getThemedColor(i14), 100)));
        }
        this.P0.setFocusable(false);
        this.P0.setImportantForAccessibility(2);
        this.P0.setOnClickListener(new View.OnClickListener(this) {
            public final fg1 f32787b;

            {
                this.f32787b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (r2) {
                    case 0:
                        fg1 fg1Var = this.f32787b;
                        fg1Var.presentFragment(bf1.a0(fg1Var.f33636a, 0L));
                        return;
                    case 1:
                        fg1 fg1Var2 = this.f32787b;
                        fg1Var2.getMessagesController().hidePeerSettingsBar(-fg1Var2.f33636a, null, fg1Var2.g());
                        fg1Var2.O0(false);
                        return;
                    case 2:
                        fg1 fg1Var3 = this.f32787b;
                        if (!fg1Var3.f33672s0) {
                            fg1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f32787b.finishPreviewFragment();
                        return;
                    default:
                        wy wyVar32 = this.f32787b.M0;
                        if (wyVar32 != null && (w0Var2 = wyVar32.f39241j0) != null) {
                            w0Var2.performClick();
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
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) it.next();
                if (o2Var instanceof wy) {
                    wy wyVar4 = (wy) o2Var;
                    if (wyVar4.h4()) {
                        MessagesStorage.TopicKey topicKey = wyVar4.f39270p2;
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
            getMessagesController().getBoostsController().getBoostsStats(j3, new zb(this, 5));
        }
        View view = this.fragmentView;
        ef1 ef1Var = new ef1(this);
        WeakHashMap weakHashMap = r0.i0.f41865a;
        r0.a0.j(view, ef1Var);
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
        long j3 = this.f33636a;
        if (i10 == i12) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.J) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.f18122id == j3) {
                O0(false);
                wh.d dVar = this.R0;
                if (dVar != null) {
                    dVar.f45103j = chatFull2;
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
        return getMessagesController().getChat(Long.valueOf(this.f33636a));
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
        org.telegram.ui.Components.ml0 ml0Var;
        yy0 yy0Var = new yy0(9, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.f18862d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, yy0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19139s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19194v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19158t8));
        bg1 bg1Var = this.f33670r0;
        if (bg1Var != null && (ml0Var = bg1Var.V) != null) {
            org.telegram.ui.Cells.u3.a(arrayList, ml0Var);
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
        if (this.f33672s0) {
            i10 = org.telegram.ui.ActionBar.j6.f18862d6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f19139s8;
        }
        int themedColor = getThemedColor(i10);
        if (this.actionBar.s()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f19212w8);
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
    public final org.telegram.ui.Components.eo n() {
        return this.f33649f;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f33637a0.isEmpty()) {
            if (z10) {
                C0();
                return false;
            }
        } else if (this.f33672s0) {
            if (z10) {
                this.actionBar.v(this.f33667p0.L(false));
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
        long j3 = this.f33636a;
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
        i71.t(this.currentAccount);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j3));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, false);
        }
        Long valueOf = Long.valueOf(j3);
        HashSet hashSet = f33635n1;
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
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f33636a));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, true);
        }
        super.onFragmentDestroy();
        wy wyVar = this.M0;
        if (wyVar != null && wyVar.F3 != null) {
            wyVar.getActionBar().setSearchAvatarImageView(null);
            this.M0.F3.M = true;
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        getMessagesController().getTopicsController().onTopicFragmentPause(this.f33636a);
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        super.onResume();
        TopicsController topicsController = getMessagesController().getTopicsController();
        long j3 = this.f33636a;
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
        qx qxVar;
        u50 u50Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (u50Var = this.P0) != null) {
            if (u50Var.getParent() != null) {
                ((ViewGroup) this.P0.getParent()).removeView(this.P0);
            }
            this.P0.setBackground(null);
        }
        if (z10) {
            z0(false);
        }
        this.O0.unlock();
        if (!z10) {
            if (this.f33673t0 && this.H) {
                removeSelfFromStack();
                wy wyVar = this.L0;
                if (wyVar != null) {
                    wyVar.removeSelfFromStack();
                }
            } else if (this.I) {
                removeSelfFromStack();
                wy wyVar2 = this.M0;
                if (wyVar2 != null && (qxVar = wyVar2.F3) != null && qxVar.c()) {
                    this.M0.F3.a();
                }
            }
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        u50 u50Var = this.P0;
        if (u50Var != null && u50Var.getVisibility() == 0) {
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
        this.N.y0(0);
    }

    @Override
    public final void setPreviewOpenedProgress(float f7) {
        org.telegram.ui.Components.eo eoVar = this.f33649f;
        if (eoVar != null) {
            eoVar.setAlpha(f7);
            this.f33668q0.setAlpha(f7);
            org.telegram.ui.ActionBar.w0 w0Var = this.f33667p0;
            if (w0Var != null) {
                w0Var.setAlpha(f7);
            }
            this.actionBar.getBackButton().setAlpha(f7);
        }
    }

    @Override
    public final void setPreviewReplaceProgress(float f7) {
        org.telegram.ui.Components.eo eoVar = this.f33649f;
        if (eoVar != null) {
            eoVar.setAlpha(f7);
            this.f33649f.setTranslationX((1.0f - f7) * AndroidUtilities.dp(40.0f));
        }
    }

    @Override
    public final fh.d x() {
        return this.f33655h1;
    }

    public final void x0() {
        ah.i iVar;
        View view;
        org.telegram.ui.ActionBar.k kVar;
        float f7;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (iVar = this.f33651f1) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int dp2 = AndroidUtilities.dp(48.0f) + ((int) this.U0.c(AndroidUtilities.dp(14.0f)));
            wy wyVar = this.M0;
            if (wyVar != null) {
                view = wyVar.fragmentView;
            } else {
                view = this.fragmentView;
            }
            if (wyVar != null) {
                kVar = wyVar.getActionBar();
            } else {
                kVar = this.actionBar;
            }
            int measuredHeight = (view.getMeasuredHeight() - this.f33648e1) - AndroidUtilities.dp(8.0f);
            this.l1.set(0.0f, -dp, view.getMeasuredWidth(), kVar.getMeasuredHeight() + dp + dp2);
            RectF rectF = this.f33663m1;
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
            iVar.g(i10, this.f33661k1);
            iVar.e(this.f33659j1, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    @Override
    public final org.telegram.ui.Components.qv0 y() {
        return this.d;
    }

    public final void y0() {
        hf1 hf1Var;
        TopicsController topicsController = this.f33671s;
        long j3 = this.f33636a;
        if (!topicsController.endIsReached(j3) && (hf1Var = this.F) != null) {
            int N0 = hf1Var.N0();
            if (this.f33639b.isEmpty() || N0 >= this.f33669r.h() - 5) {
                topicsController.loadTopics(j3);
            }
            A0();
        }
    }

    public final void z0(boolean z10) {
        String str;
        MessagesController messagesController = getMessagesController();
        long j3 = this.f33636a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j3);
        ChatObject.Call call = this.H0;
        if (call != null && ((str = this.f33681y0) != null || this.f33682z0)) {
            org.telegram.ui.Components.voip.f2.l(chat, str, false, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f33681y0 = null;
            this.f33682z0 = false;
        } else if (this.f33681y0 != null && z10 && chatFull != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.w1.o(R.string.LinkHashExpired, org.telegram.ui.Components.vc.a0(this), R.raw.linkbroken, 36);
            this.f33681y0 = null;
        }
    }

    @Override
    public final void o() {
    }

    @Override
    public final void F(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
    }
}
