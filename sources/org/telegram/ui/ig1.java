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
public class ig1 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.eh, eh0 {
    public static final HashSet f33680n1 = new HashSet();
    public HashSet A0;
    public boolean B0;
    public boolean C0;
    public org.telegram.ui.Components.hk D0;
    public boolean E;
    public wf1 E0;
    public kf1 F;
    public FrameLayout F0;
    public boolean G;
    public y8 G0;
    public boolean H;
    public ChatObject.Call H0;
    public boolean I;
    public vf1 I0;
    public TLRPC.ChatFull J;
    public boolean J0;
    public boolean K;
    public org.telegram.ui.Components.zk0 K0;
    public org.telegram.ui.Components.t61 L;
    public wy L0;
    public int M;
    public wy M0;
    public tf1 N;
    public boolean N0;
    public mf1 O;
    public final AnimationNotificationsLocker O0;
    public hg1 P;
    public t50 P0;
    public org.telegram.ui.ActionBar.g1 Q;
    public long Q0;
    public org.telegram.ui.ActionBar.g1 R;
    public vh.e R0;
    public org.telegram.ui.ActionBar.g1 S;
    public float S0;
    public org.telegram.ui.ActionBar.g1 T;
    public boolean T0;
    public org.telegram.ui.ActionBar.g1 U;
    public org.telegram.ui.Components.qs U0;
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
    public final long f33681a;
    public final HashSet f33682a0;
    public org.telegram.ui.Components.u81 f33683a1;
    public final ArrayList f33684b;
    public boolean f33685b0;
    public View f33686b1;
    public int f33687c;
    public NumberTextView f33688c0;
    public int f33689c1;
    public pf1 d;
    public org.telegram.ui.ActionBar.w0 f33690d0;
    public int f33691d1;
    public k0 e;
    public org.telegram.ui.ActionBar.w0 f33692e0;
    public int f33693e1;
    public org.telegram.ui.Components.jo f33694f;
    public org.telegram.ui.ActionBar.w0 f33695f0;
    public final zg.e f33696f1;
    public org.telegram.ui.ActionBar.w0 f33697g0;
    public final eh.d f33698g1;
    public org.telegram.ui.Components.h20 h;
    public org.telegram.ui.ActionBar.w0 f33699h0;
    public final eh.d f33700h1;
    public org.telegram.ui.ActionBar.w0 f33701i0;
    public final zg.a f33702i1;
    public org.telegram.ui.ActionBar.g1 f33703j0;
    public zg.k f33704j1;
    public org.telegram.ui.ActionBar.g1 f33705k0;
    public final ArrayList f33706k1;
    public org.telegram.ui.ActionBar.g1 f33707l0;
    public final RectF l1;
    public org.telegram.ui.ActionBar.w0 m0;
    public final RectF f33708m1;
    public yf1 f33709n;
    public RadialProgressView f33710n0;
    public m91 f33711o0;
    public org.telegram.ui.ActionBar.w0 f33712p0;
    public org.telegram.ui.ActionBar.w0 f33713q0;
    public final xf1 f33714r;
    public eg1 f33715r0;
    public final TopicsController f33716s;
    public boolean f33717s0;
    public final boolean f33718t0;
    public final boolean f33719u0;
    public jg1 v;
    public final boolean f33720v0;
    public cx f33721w;
    public final boolean f33722w0;
    public int f33723x;
    public final boolean f33724x0;
    public int f33725y;
    public String f33726y0;
    public boolean f33727z0;

    public ig1(Bundle bundle) {
        super(bundle);
        this.f33684b = new ArrayList();
        new ArrayList();
        this.f33714r = new xf1(this);
        this.f33723x = 0;
        this.E = true;
        this.G = true;
        this.V = true;
        this.W = 0.0f;
        this.f33682a0 = new HashSet();
        this.B0 = false;
        this.O0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.topicsDidLoaded});
        this.S0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f33706k1 = arrayList;
        RectF rectF = new RectF();
        this.l1 = rectF;
        RectF rectF2 = new RectF();
        this.f33708m1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j3 = this.arguments.getLong("chat_id", 0L);
        this.f33681a = j3;
        this.f33718t0 = this.arguments.getBoolean("for_select", false);
        this.f33719u0 = this.arguments.getBoolean("forward_to", false);
        this.f33724x0 = this.arguments.getBoolean("bot_share_to", false);
        this.f33720v0 = this.arguments.getBoolean("quote", false);
        this.f33722w0 = this.arguments.getBoolean("reply_to", false);
        this.f33726y0 = this.arguments.getString("voicechat", null);
        this.f33727z0 = this.arguments.getBoolean("videochat", false);
        this.f33716s = getMessagesController().getTopicsController();
        this.V0 = true ^ org.telegram.messenger.a2.v("topics_end_reached_", j3, getUserConfig().getPreferences(), false);
        eh.c cVar = new eh.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f33696f1 = new zg.e(false);
            this.f33698g1 = new eh.d(null);
            eh.d dVar = new eh.d(null);
            this.f33700h1 = dVar;
            zg.a aVar = new zg.a(dVar);
            this.f33702i1 = aVar;
            aVar.f48083f = LiteMode.isEnabled(262144);
            return;
        }
        this.f33696f1 = null;
        this.f33698g1 = null;
        this.f33700h1 = null;
        this.f33702i1 = new zg.a(cVar);
    }

    public static org.telegram.ui.ActionBar.p2 E0(MessagesController messagesController, MessagesStorage messagesStorage, Bundle bundle) {
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
        return new ig1(bundle);
    }

    public static org.telegram.ui.ActionBar.p2 F0(LaunchActivity launchActivity, Bundle bundle) {
        return E0(MessagesController.getInstance(launchActivity.O), MessagesStorage.getInstance(launchActivity.O), bundle);
    }

    public static void I0(org.telegram.ui.eo r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ig1.I0(org.telegram.ui.eo):void");
    }

    public static boolean U(ig1 ig1Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(ig1Var.currentAccount).edit();
        edit.putLong("dialog_join_requested_time_" + (-ig1Var.f33681a), System.currentTimeMillis()).commit();
        Activity parentActivity = ig1Var.getParentActivity();
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(ig1Var.g());
        int i10 = org.telegram.ui.Components.q80.f26337r;
        org.telegram.ui.Components.q80.w(parentActivity, ig1Var, org.telegram.ui.Components.wc.a0(ig1Var), isChannelAndNotMegaGroup);
        ig1Var.O0(true);
        return false;
    }

    public static void V(ig1 ig1Var, View view) {
        long j3;
        long j10 = ig1Var.f33681a;
        if (ig1Var.getParentLayout() != null && !((ActionBarLayout) ig1Var.getParentLayout()).y() && (view instanceof fg1)) {
            TLRPC.TL_forumTopic tL_forumTopic = ((fg1) view).N;
            long j11 = -j10;
            boolean isMonoForum = ig1Var.getMessagesController().isMonoForum(j11);
            if (tL_forumTopic == null) {
                j3 = 0;
            } else if (isMonoForum) {
                j3 = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            } else {
                j3 = tL_forumTopic.f17247id;
            }
            long j12 = j3;
            if (ig1Var.f33718t0) {
                jg1 jg1Var = ig1Var.v;
                if (jg1Var != null) {
                    lg1 lg1Var = jg1Var.f34099a;
                    Bundle bundle = new Bundle();
                    og1 og1Var = lg1Var.f34714a;
                    bundle.putLong("dialog_id", og1Var.f35494c);
                    bundle.putLong("topic_id", tL_forumTopic.f17247id);
                    bundle.putBoolean("exception", true);
                    c21 c21Var = new c21(bundle, null);
                    c21Var.f31504r = new fz0(12, lg1Var, tL_forumTopic);
                    og1Var.presentFragment(c21Var);
                }
                wy wyVar = ig1Var.L0;
                if (wyVar != null) {
                    wyVar.O3(j11, j12, true, ig1Var);
                }
            } else if (ig1Var.f33682a0.size() > 0) {
                ig1Var.N0(view);
            } else {
                if (ig1Var.inPreviewMode && AndroidUtilities.isTablet()) {
                    for (org.telegram.ui.ActionBar.p2 p2Var : ig1Var.getParentLayout().getFragmentStack()) {
                        if (p2Var instanceof wy) {
                            wy wyVar2 = (wy) p2Var;
                            if (wyVar2.h4()) {
                                MessagesStorage.TopicKey topicKey = wyVar2.f38486p2;
                                if (topicKey.dialogId == j11 && topicKey.topicId == j12) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    ig1Var.Q0 = j12;
                    ig1Var.U0(false, false);
                }
                mg.d.m(ig1Var, j10, tL_forumTopic, 0);
            }
        }
    }

    public static boolean W(ig1 ig1Var, View view, float f7) {
        if (ig1Var.f33718t0 || ig1Var.getParentLayout() == null || ((ActionBarLayout) ig1Var.getParentLayout()).y()) {
            return false;
        }
        if (!ig1Var.actionBar.s() && !AndroidUtilities.isTablet() && (view instanceof fg1)) {
            fg1 fg1Var = (fg1) view;
            if (fg1Var.S(f7)) {
                ig1Var.M0(fg1Var);
                ig1Var.N.I0(true);
                ig1Var.N.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        ig1Var.N0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void X(ig1 ig1Var) {
        ViewGroup viewGroup;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                viewGroup = ig1Var.N;
            } else {
                eg1 eg1Var = ig1Var.f33715r0;
                if (eg1Var != null) {
                    viewGroup = eg1Var.U;
                } else {
                    viewGroup = null;
                }
            }
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.j6) {
                        ((org.telegram.ui.Cells.j6) childAt).u(0);
                    } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                        ((org.telegram.ui.Cells.r2) childAt).b0(0, true);
                    } else if (childAt instanceof org.telegram.ui.Cells.bb) {
                        ((org.telegram.ui.Cells.bb) childAt).j(0);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.l lVar = ig1Var.actionBar;
        if (lVar != null) {
            lVar.D(ig1Var.getThemedColor(org.telegram.ui.ActionBar.j6.G8), true);
            ig1Var.actionBar.E(ig1Var.getThemedColor(org.telegram.ui.ActionBar.j6.E8), false, true);
            ig1Var.actionBar.E(ig1Var.getThemedColor(org.telegram.ui.ActionBar.j6.F8), true, true);
            ig1Var.actionBar.F(ig1Var.getThemedColor(org.telegram.ui.ActionBar.j6.I5), true);
        }
        t50 t50Var = ig1Var.P0;
        if (t50Var != null && Build.VERSION.SDK_INT >= 23) {
            t50Var.setForeground(new ColorDrawable(i0.a.k(ig1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6), 100)));
        }
        ig1Var.P0();
    }

    public static void b0(ig1 ig1Var, boolean z10) {
        float f7;
        boolean z11;
        qx qxVar;
        ig1Var.f33717s0 = z10;
        ValueAnimator valueAnimator = ig1Var.Y0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ig1Var.Y0.cancel();
        }
        if (ig1Var.f33683a1 == null) {
            org.telegram.ui.Components.u81 n10 = ig1Var.f33715r0.n(8, false);
            ig1Var.f33683a1 = n10;
            if (ig1Var.M0 != null) {
                n10.setBackgroundColor(ig1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
            }
            ig1Var.e.addView(ig1Var.f33683a1, w7.a6.c(44.0f, -1));
        }
        float f10 = ig1Var.W;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ig1Var.Y0 = ValueAnimator.ofFloat(f10, f7);
        AndroidUtilities.updateViewVisibilityAnimated(ig1Var.f33715r0, false, 1.0f, true);
        wy wyVar = ig1Var.M0;
        if (wyVar != null && (qxVar = wyVar.F3) != null) {
            qxVar.M = !z10;
        }
        if (!z10 && ig1Var.f33715r0.getVisibility() == 0 && ig1Var.f33715r0.getAlpha() == 1.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        ig1Var.Z0 = z11;
        ig1Var.Y0.addUpdateListener(new f21(ig1Var, 17));
        ig1Var.f33715r0.setVisibility(0);
        if (!z10) {
            ig1Var.f33713q0.setVisibility(0);
        } else {
            AndroidUtilities.requestAdjustResize(ig1Var.getParentActivity(), ig1Var.classGuid);
            ig1Var.Q0(false);
        }
        ig1Var.Y0.addListener(new rf1(ig1Var, z10, 0));
        ig1Var.Y0.setDuration(200L);
        ig1Var.Y0.setInterpolator(org.telegram.ui.Components.wr.f28819f);
        ig1Var.Y0.start();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
    }

    public final void A0() {
        this.J0 = this.f33716s.isLoading(this.f33681a);
        if (this.D0 != null) {
            ArrayList arrayList = this.f33684b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((zf1) arrayList.get(0)).f39309c != null && ((zf1) arrayList.get(0)).f39309c.f17247id == 1)) {
                this.D0.e(this.J0, this.fragmentBeginToShow);
            }
        }
        tf1 tf1Var = this.N;
        if (tf1Var != null) {
            tf1Var.J0(tf1Var.t1());
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
            org.telegram.ui.Components.qs qsVar = wyVar.J1;
            if (qsVar != null) {
                f7 = qsVar.c(dp);
            } else {
                f7 = 0.0f;
            }
            float f12 = f7 + 0.0f;
            org.telegram.ui.Components.qs qsVar2 = this.U0;
            if (qsVar2 != null) {
                float dp2 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.qs qsVar3 = this.M0.J1;
                if (qsVar3 != null) {
                    f10 = qsVar3.getMetadata().f12885c.f12893a;
                } else {
                    f10 = 0.0f;
                }
                qsVar2.setTranslationY(f12 - (f10 * dp2));
                org.telegram.ui.Components.qs qsVar4 = this.U0;
                int dp3 = AndroidUtilities.dp(14.0f);
                int dp4 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.qs qsVar5 = this.M0.J1;
                if (qsVar5 != null) {
                    f11 = qsVar5.getMetadata().f12885c.f12893a;
                }
                f11 = qsVar4.c(AndroidUtilities.lerp(dp3, dp4, f11)) + f12;
            } else {
                f11 = f12;
            }
        } else {
            org.telegram.ui.Components.qs qsVar6 = this.U0;
            if (qsVar6 != null) {
                f11 = 0.0f + qsVar6.c(AndroidUtilities.dp(14.0f));
            }
        }
        int i11 = this.f33693e1 + this.f33689c1;
        if (this.V) {
            i10 = AndroidUtilities.dp(51.0f);
        } else {
            i10 = 0;
        }
        this.N.setPadding(0, (int) f11, 0, i11 + i10);
    }

    public final void C0() {
        this.f33682a0.clear();
        this.actionBar.r();
        AndroidUtilities.updateVisibleRows(this.N);
        R0();
    }

    public final void D0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2Var.R = pluralString;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            d2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, this.f33716s.findTopic(this.f33681a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            d2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a1.d(this, hashSet, arrayList, runnable, 19));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new js0(5));
        d2Var.show();
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18162q7));
        }
    }

    @Override
    public final boolean F() {
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
        bundle.putLong("chat_id", this.f33681a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f33694f.getSharedMediaPreloader());
        profileActivity.K4(this.J);
        if (this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f33694f.getAvatarImageView().getImageReceiver().hasImageLoaded() && z10) {
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
            org.telegram.ui.Components.t61 t61Var = this.L;
            if (i10 == 0) {
                i11 = org.telegram.ui.ActionBar.j6.Ae;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.f18162q7;
            }
            t61Var.setTextColorKey(i11);
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
        pf1 pf1Var = this.d;
        if (pf1Var != null) {
            if (z10) {
                pf1Var.setLayerType(2, null);
                pf1Var.setClipChildren(false);
                pf1Var.setClipToPadding(false);
            } else {
                pf1Var.setLayerType(0, null);
                pf1Var.setClipChildren(true);
                pf1Var.setClipToPadding(true);
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
            tf1 tf1Var = this.N;
            if (tf1Var != null) {
                float a2 = com.google.android.gms.internal.vision.e2.a(1.0f, this.S0, 0.05f, 1.0f);
                tf1Var.setPivotX(0.0f);
                tf1Var.setPivotY(0.0f);
                tf1Var.setScaleX(a2);
                tf1Var.setScaleY(a2);
                this.actionBar.setPivotX(0.0f);
                this.actionBar.setPivotY(0.0f);
                this.actionBar.setScaleX(a2);
                this.actionBar.setScaleY(a2);
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
        org.telegram.ui.Components.uo uoVar = new org.telegram.ui.Components.uo(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new of1(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(uoVar.f27727f);
        uoVar.f27735o = 1;
        long j10 = this.f33681a;
        long j11 = -j10;
        uoVar.d(j11, tL_forumTopic.f17247id, null);
        if (ChatObject.canManageTopics(g())) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                g1Var.g(LocaleController.getString(R.string.DialogUnpin), R.drawable.msg_unpin, null);
            } else {
                g1Var.g(LocaleController.getString(R.string.DialogPin), R.drawable.msg_pin, null);
            }
            g1Var.setMinimumWidth(160);
            g1Var.setOnClickListener(new View.OnClickListener(this) {
                public final ig1 f33673b;

                {
                    this.f33673b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            ig1 ig1Var = this.f33673b;
                            ig1Var.C0 = true;
                            ig1Var.N0 = true;
                            TopicsController topicsController = ig1Var.f33716s;
                            long j12 = ig1Var.f33681a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j12, tL_forumTopic2.f17247id, !tL_forumTopic2.pinned, ig1Var);
                            ig1Var.finishPreviewFragment();
                            return;
                        case 1:
                            ig1 ig1Var2 = this.f33673b;
                            ig1Var2.N0 = true;
                            TopicsController topicsController2 = ig1Var2.f33716s;
                            long j13 = ig1Var2.f33681a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j13, tL_forumTopic3.f17247id, true ^ tL_forumTopic3.closed);
                            ig1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f17247id));
                            ig1 ig1Var3 = this.f33673b;
                            ig1Var3.D0(hashSet, new gf1(ig1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(g1Var);
        }
        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(getParentActivity(), false, false);
        if (getMessagesController().isDialogMuted(j11, tL_forumTopic.f17247id)) {
            g1Var2.g(LocaleController.getString(R.string.Unmute), R.drawable.msg_mute, null);
        } else {
            g1Var2.g(LocaleController.getString(R.string.Mute), R.drawable.msg_unmute, null);
        }
        g1Var2.setMinimumWidth(160);
        g1Var2.setOnClickListener(new cb(this, tL_forumTopic, (Serializable) r32, b10, 5));
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
                public final ig1 f33673b;

                {
                    this.f33673b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            ig1 ig1Var = this.f33673b;
                            ig1Var.C0 = true;
                            ig1Var.N0 = true;
                            TopicsController topicsController = ig1Var.f33716s;
                            long j12 = ig1Var.f33681a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j12, tL_forumTopic2.f17247id, !tL_forumTopic2.pinned, ig1Var);
                            ig1Var.finishPreviewFragment();
                            return;
                        case 1:
                            ig1 ig1Var2 = this.f33673b;
                            ig1Var2.N0 = true;
                            TopicsController topicsController2 = ig1Var2.f33716s;
                            long j13 = ig1Var2.f33681a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j13, tL_forumTopic3.f17247id, true ^ tL_forumTopic3.closed);
                            ig1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f17247id));
                            ig1 ig1Var3 = this.f33673b;
                            ig1Var3.D0(hashSet, new gf1(ig1Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(g1Var3);
        }
        if (ChatObject.canDeleteTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(getParentActivity(), false, true);
            g1Var4.g(LocaleController.getPluralString("DeleteTopics", 1), R.drawable.msg_delete, null);
            g1Var4.setIconColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18144p7));
            g1Var4.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18162q7));
            g1Var4.setMinimumWidth(160);
            g1Var4.setOnClickListener(new View.OnClickListener(this) {
                public final ig1 f33673b;

                {
                    this.f33673b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            ig1 ig1Var = this.f33673b;
                            ig1Var.C0 = true;
                            ig1Var.N0 = true;
                            TopicsController topicsController = ig1Var.f33716s;
                            long j12 = ig1Var.f33681a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.pinTopic(j12, tL_forumTopic2.f17247id, !tL_forumTopic2.pinned, ig1Var);
                            ig1Var.finishPreviewFragment();
                            return;
                        case 1:
                            ig1 ig1Var2 = this.f33673b;
                            ig1Var2.N0 = true;
                            TopicsController topicsController2 = ig1Var2.f33716s;
                            long j13 = ig1Var2.f33681a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsController2.toggleCloseTopic(j13, tL_forumTopic3.f17247id, true ^ tL_forumTopic3.closed);
                            ig1Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f17247id));
                            ig1 ig1Var3 = this.f33673b;
                            ig1Var3.D0(hashSet, new gf1(ig1Var3, 3));
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
            this.parentLayout.getOverlayContainerView().addView(this.P0, w7.a6.c(-1.0f, -1));
        }
        eo eoVar = new eo(w.f.e(j10, "chat_id"));
        if (isMonoForum) {
            j3 = DialogObject.getPeerDialogId(r2Var.N.from_id);
        } else {
            j3 = r2Var.N.f17247id;
        }
        mg.d.a(eoVar, MessagesStorage.TopicKey.of(j11, j3));
        presentFragmentAsPreviewWithMenu(eoVar, r32[0]);
    }

    public final void N0(View view) {
        fg1 fg1Var;
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
        if ((view instanceof fg1) && (tL_forumTopic = (fg1Var = (fg1) view).N) != null) {
            int i19 = tL_forumTopic.f17247id;
            Integer valueOf = Integer.valueOf(i19);
            HashSet hashSet = this.f33682a0;
            if (!hashSet.remove(valueOf)) {
                hashSet.add(Integer.valueOf(i19));
            }
            fg1Var.V(hashSet.contains(Integer.valueOf(i19)), true);
            MessagesController messagesController = getMessagesController();
            long j3 = this.f33681a;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            if (!hashSet.isEmpty()) {
                if (!this.actionBar.a(null)) {
                    org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
                    if (this.inPreviewMode) {
                        j10.setBackgroundColor(0);
                        j10.f18792a = false;
                    }
                    NumberTextView numberTextView = new NumberTextView(j10.getContext());
                    this.f33688c0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f33688c0.setTypeface(AndroidUtilities.bold());
                    this.f33688c0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18308y8));
                    j10.addView(this.f33688c0, w7.a6.m(1.0f, 0, -1, 72, 0, 0));
                    this.f33688c0.setOnTouchListener(new jf1(0));
                    this.f33690d0 = j10.g(4, R.drawable.msg_pin, AndroidUtilities.dp(54.0f));
                    this.f33692e0 = j10.g(5, R.drawable.msg_unpin, AndroidUtilities.dp(54.0f));
                    this.f33695f0 = j10.g(6, R.drawable.msg_mute, AndroidUtilities.dp(54.0f));
                    this.f33697g0 = j10.h(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                    org.telegram.ui.ActionBar.w0 h = j10.h(12, R.drawable.msg_archive_hide, LocaleController.getString(R.string.Hide), AndroidUtilities.dp(54.0f));
                    this.f33699h0 = h;
                    h.setVisibility(8);
                    org.telegram.ui.ActionBar.w0 h10 = j10.h(13, R.drawable.msg_archive_show, LocaleController.getString(R.string.Show), AndroidUtilities.dp(54.0f));
                    this.f33701i0 = h10;
                    h10.setVisibility(8);
                    org.telegram.ui.ActionBar.w0 h11 = j10.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(54.0f));
                    this.m0 = h11;
                    this.f33703j0 = h11.e(8, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
                    this.f33705k0 = this.m0.e(9, R.drawable.msg_topic_close, LocaleController.getString(R.string.CloseTopic));
                    this.f33707l0 = this.m0.e(10, R.drawable.msg_topic_restart, LocaleController.getString(R.string.RestartTopic));
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
                    topicsController = this.f33716s;
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
                    this.f33703j0.setVisibility(0);
                    this.f33703j0.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
                } else {
                    this.f33703j0.setVisibility(8);
                }
                if (i21 != 0) {
                    this.B0 = false;
                    this.f33695f0.setIcon(R.drawable.msg_unmute);
                    this.f33695f0.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
                    z10 = true;
                } else {
                    z10 = true;
                    this.B0 = true;
                    this.f33695f0.setIcon(R.drawable.msg_mute);
                    this.f33695f0.setContentDescription(LocaleController.getString(R.string.ChatsMute));
                }
                org.telegram.ui.ActionBar.w0 w0Var = this.f33690d0;
                if (i22 == z10 && i23 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                w0Var.setVisibility(i10);
                org.telegram.ui.ActionBar.w0 w0Var2 = this.f33692e0;
                if (i23 == z10 && i22 == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                w0Var2.setVisibility(i11);
                this.f33688c0.a(hashSet3.size(), z10);
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
                            if (findTopic2.f17247id == 1) {
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
                org.telegram.ui.ActionBar.g1 g1Var = this.f33705k0;
                if (i24 == 0 && i25 > 0) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                g1Var.setVisibility(i12);
                org.telegram.ui.ActionBar.g1 g1Var2 = this.f33705k0;
                if (i25 > 1) {
                    i13 = R.string.CloseTopics;
                } else {
                    i13 = R.string.CloseTopic;
                }
                g1Var2.setText(LocaleController.getString(i13));
                org.telegram.ui.ActionBar.g1 g1Var3 = this.f33707l0;
                if (i25 == 0 && i24 > 0) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                g1Var3.setVisibility(i14);
                org.telegram.ui.ActionBar.g1 g1Var4 = this.f33707l0;
                if (i24 > 1) {
                    i15 = R.string.RestartTopics;
                } else {
                    i15 = R.string.RestartTopic;
                }
                g1Var4.setText(LocaleController.getString(i15));
                org.telegram.ui.ActionBar.w0 w0Var3 = this.f33697g0;
                if (i26 == hashSet3.size()) {
                    i16 = 0;
                } else {
                    i16 = 8;
                }
                w0Var3.setVisibility(i16);
                org.telegram.ui.ActionBar.w0 w0Var4 = this.f33699h0;
                if (i27 == 1 && hashSet3.size() == 1) {
                    i17 = 0;
                } else {
                    i17 = 8;
                }
                w0Var4.setVisibility(i17);
                org.telegram.ui.ActionBar.w0 w0Var5 = this.f33701i0;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ig1.O0(boolean):void");
    }

    public final void P0() {
        RadialProgressView radialProgressView = this.f33710n0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.j6.Ae));
        this.h.g();
        m91 m91Var = this.f33711o0;
        int i10 = org.telegram.ui.ActionBar.j6.f17928d6;
        m91Var.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(getThemedColor(i10));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18201s8));
        }
        this.f33715r0.setBackgroundColor(getThemedColor(i10));
    }

    public final void Q0(boolean z10) {
        boolean z11;
        if (this.Q == null) {
            return;
        }
        MessagesController messagesController = getMessagesController();
        long j3 = this.f33681a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        int i10 = 0;
        if (!ChatObject.isNotInChat(getMessagesController().getChat(Long.valueOf(j3))) && ChatObject.canCreateTopic(chat) && !this.f33717s0 && !this.f33718t0 && !this.J0) {
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
        if (ChatObject.canManageTopics(g()) && !this.f33682a0.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f33685b0 != z10) {
            this.f33685b0 = z10;
            xf1 xf1Var = this.f33714r;
            xf1Var.q(0, xf1Var.h());
        }
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        return false;
    }

    public final void S0(float f7) {
        this.W = f7;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f18256v8);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f18308y8;
        lVar.C(i0.a.d(this.W, themedColor, getThemedColor(i10)), false);
        this.actionBar.C(i0.a.d(this.W, getThemedColor(i10), getThemedColor(i10)), true);
        this.actionBar.A(i0.a.d(this.W, getThemedColor(org.telegram.ui.ActionBar.j6.f18220t8), getThemedColor(org.telegram.ui.ActionBar.j6.f18327z8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(i0.a.d(this.W, getThemedColor(org.telegram.ui.ActionBar.j6.f18201s8), getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6)));
        }
        float f10 = 1.0f - f7;
        this.f33694f.getTitleTextView().setAlpha(f10);
        this.f33694f.getSubtitleTextView().setAlpha(f10);
        org.telegram.ui.Components.u81 u81Var = this.f33683a1;
        if (u81Var != null) {
            u81Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
            this.f33683a1.setAlpha(f7);
        }
        this.f33715r0.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
        this.f33715r0.setAlpha(f7);
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
        org.telegram.ui.Components.hk hkVar = this.D0;
        if (hkVar != null && hkVar.e != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
            org.telegram.ui.Components.uq uqVar = new org.telegram.ui.Components.uq(R.drawable.ic_ab_other, 0);
            uqVar.setSize(AndroidUtilities.dp(16.0f));
            spannableStringBuilder.setSpan(uqVar, 0, 1, 0);
            if (ChatObject.canUserDoAdminAction(g(), 15)) {
                this.D0.e.setText(AndroidUtilities.replaceCharSequence("%s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoTopicsDescription)), spannableStringBuilder));
                return;
            }
            String string = LocaleController.getString(R.string.General);
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.f33681a, 1L);
            if (findTopic != null) {
                string = findTopic.title;
            }
            this.D0.e.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoTopicsDescriptionUser", R.string.NoTopicsDescriptionUser, string)));
        }
    }

    public final void U0(boolean z10, boolean z11) {
        kf1 kf1Var;
        vf1 vf1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z10 && this.N0) {
            z10 = true;
        }
        this.N0 = false;
        TopicsController topicsController = this.f33716s;
        long j3 = this.f33681a;
        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j3);
        if (topics != null) {
            ArrayList arrayList = this.f33684b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            vf1 vf1Var2 = null;
            if (UserObject.isBotForum(this.currentAccount, -j3) && this.f33719u0) {
                arrayList.add(new zf1(3, null));
            }
            for (int i10 = 0; i10 < topics.size(); i10++) {
                HashSet hashSet = this.A0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(topics.get(i10).f17247id))) {
                    arrayList.add(new zf1(0, topics.get(i10)));
                }
            }
            if (!arrayList.isEmpty() && !topicsController.endIsReached(j3) && this.V0) {
                arrayList.add(new zf1(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.K0.b(size + 4);
                z10 = false;
            }
            this.f33723x = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                zf1 zf1Var = (zf1) arrayList.get(i11);
                if (zf1Var != null && (tL_forumTopic = zf1Var.f39309c) != null && tL_forumTopic.hidden) {
                    this.f33723x++;
                }
            }
            tf1 tf1Var = this.N;
            if (tf1Var != null) {
                s4.m0 itemAnimator = tf1Var.getItemAnimator();
                if (z10) {
                    vf1Var = this.I0;
                } else {
                    vf1Var = null;
                }
                if (itemAnimator != vf1Var) {
                    tf1 tf1Var2 = this.N;
                    if (z10) {
                        vf1Var2 = this.I0;
                    }
                    tf1Var2.setItemAnimator(vf1Var2);
                }
            }
            xf1 xf1Var = this.f33714r;
            if (xf1Var != null) {
                xf1Var.E(arrayList2, arrayList);
            }
            if ((this.C0 || size == 0) && (kf1Var = this.F) != null) {
                kf1Var.h1(0, 0);
                this.C0 = false;
            }
        }
        A0();
        T0();
    }

    @Override
    public final long a() {
        return -this.f33681a;
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
        this.f33689c1 = i10;
        wy wyVar2 = this.M0;
        if (wyVar2 != null && wyVar2.W) {
            i11 = AndroidUtilities.dp(64.0f);
        } else {
            i11 = 0;
        }
        this.f33691d1 = i11;
        pf1 pf1Var = new pf1(this, context);
        this.d = pf1Var;
        this.fragmentView = pf1Var;
        pf1Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (!AndroidUtilities.isTablet() && !this.inPreviewMode) {
            z10 = true;
        } else {
            z10 = false;
        }
        lVar.setOccupyStatusBar(z10);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        com.google.android.gms.internal.vision.e2.t(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new sf1(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) {
            public final ig1 f32809b;

            {
                this.f32809b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (r2) {
                    case 0:
                        ig1 ig1Var = this.f32809b;
                        ig1Var.presentFragment(ef1.a0(ig1Var.f33681a, 0L));
                        return;
                    case 1:
                        ig1 ig1Var2 = this.f32809b;
                        ig1Var2.getMessagesController().hidePeerSettingsBar(-ig1Var2.f33681a, null, ig1Var2.g());
                        ig1Var2.O0(false);
                        return;
                    case 2:
                        ig1 ig1Var3 = this.f32809b;
                        if (!ig1Var3.f33717s0) {
                            ig1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f32809b.finishPreviewFragment();
                        return;
                    default:
                        wy wyVar3 = this.f32809b.M0;
                        if (wyVar3 != null && (w0Var = wyVar3.f38457j0) != null) {
                            w0Var.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        if (this.M0 != null) {
            org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
            this.f33712p0 = a2;
            a2.setOnClickListener(new View.OnClickListener(this) {
                public final ig1 f32809b;

                {
                    this.f32809b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.w0 w0Var;
                    switch (r2) {
                        case 0:
                            ig1 ig1Var = this.f32809b;
                            ig1Var.presentFragment(ef1.a0(ig1Var.f33681a, 0L));
                            return;
                        case 1:
                            ig1 ig1Var2 = this.f32809b;
                            ig1Var2.getMessagesController().hidePeerSettingsBar(-ig1Var2.f33681a, null, ig1Var2.g());
                            ig1Var2.O0(false);
                            return;
                        case 2:
                            ig1 ig1Var3 = this.f32809b;
                            if (!ig1Var3.f33717s0) {
                                ig1Var3.H0(false);
                                return;
                            }
                            return;
                        case 3:
                            this.f32809b.finishPreviewFragment();
                            return;
                        default:
                            wy wyVar3 = this.f32809b.M0;
                            if (wyVar3 != null && (w0Var = wyVar3.f38457j0) != null) {
                                w0Var.performClick();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.w0 a10 = n10.a(0, R.drawable.outline_header_search);
            this.f33712p0 = a10;
            a10.F();
            a10.H = new gg.m2(this, 18);
            this.f33712p0.setSearchPaddingStart(56);
            this.f33712p0.setSearchFieldHint(LocaleController.getString(R.string.Search));
            EditTextBoldCursor searchField = this.f33712p0.getSearchField();
            searchField.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.G6));
            searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Si));
            searchField.setCursorColor(getThemedColor(org.telegram.ui.ActionBar.j6.Wd));
        }
        org.telegram.ui.ActionBar.w0 c10 = n10.c(0, R.drawable.ic_ab_other, null);
        this.f33713q0 = c10;
        c10.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.f33713q0.e(1, R.drawable.msg_discussion, LocaleController.getString(R.string.TopicViewAsMessages));
        this.R = this.f33713q0.e(2, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddMember));
        org.telegram.ui.ActionBar.w0 w0Var = this.f33713q0;
        this.T = w0Var.d(14, 0, new org.telegram.ui.Components.hj0(R.raw.boosts, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f)), LocaleController.getString(R.string.BoostingBoostGroupMenu), true, false, w0Var.m0);
        this.Q = this.f33713q0.e(3, R.drawable.msg_topic_create, LocaleController.getString(R.string.CreateTopic));
        this.U = this.f33713q0.e(15, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat));
        this.S = this.f33713q0.f(11, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMegaMenu), null);
        org.telegram.ui.Components.jo joVar = new org.telegram.ui.Components.jo(context, this, false, this.resourceProvider);
        this.f33694f = joVar;
        joVar.getAvatarImageView().setRoundRadius(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.jo joVar2 = this.f33694f;
        if (!AndroidUtilities.isTablet() && !this.inPreviewMode) {
            z11 = true;
        } else {
            z11 = false;
        }
        joVar2.setOccupyStatusBar(z11);
        org.telegram.ui.Components.jo joVar3 = this.f33694f;
        long j3 = -this.f33681a;
        if (j3 < 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        joVar3.f24455b = z12;
        joVar3.setClipChildren(false);
        this.actionBar.addView(this.f33694f, 0, w7.a6.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.f33718t0) {
            this.f33694f.getAvatarImageView().setOnClickListener(new y7(this, 3));
        }
        this.N = new tf1(this, context);
        gh.k kVar = new gh.k(this.d);
        ViewGroup viewGroup = this.d;
        zg.a aVar = this.f33702i1;
        aVar.d = kVar;
        aVar.e = viewGroup;
        tf1 tf1Var = this.N;
        wy wyVar3 = this.M0;
        if (wyVar3 != null) {
            viewGroup = (ViewGroup) wyVar3.getFragmentView();
        }
        tf1 tf1Var2 = this.N;
        Objects.requireNonNull(tf1Var2);
        this.f33704j1 = new zg.k(tf1Var, viewGroup, new v8(tf1Var2, 2));
        this.N.C0(new gf1(this, 5));
        SpannableString spannableString = new SpannableString("#");
        mg.c c11 = mg.d.c(getParentActivity(), 0.85f, -1, false);
        c11.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
        spannableString.setSpan(new ImageSpan(c11, 2), 0, 1, 33);
        cx cxVar = new cx(this, AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccSwipeForGeneral), spannableString), AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccReleaseForGeneral), spannableString));
        this.f33721w = cxVar;
        cxVar.b();
        if (this.E) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        this.f33725y = i12;
        cx cxVar2 = this.f33721w;
        if (i12 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        cxVar2.X = z13;
        vf1 vf1Var = new vf1(this);
        this.N.setHideIfEmpty(false);
        vf1Var.f41645m = false;
        vf1Var.C = false;
        tf1 tf1Var3 = this.N;
        this.I0 = vf1Var;
        tf1Var3.setItemAnimator(vf1Var);
        this.N.setOnScrollListener(new lf1(this, 1));
        tf1 tf1Var4 = this.N;
        tf1Var4.Y1 = true;
        tf1Var4.Z1 = 0;
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(tf1Var4, true);
        this.K0 = zk0Var;
        this.N.setItemsEnterAnimator(zk0Var);
        this.N.setOnItemClickListener(new f31(this, 9));
        this.N.setOnItemLongClickListener(new hf1(this));
        this.N.setOnScrollListener(new lf1(this, 2));
        tf1 tf1Var5 = this.N;
        kf1 kf1Var = new kf1(this);
        this.F = kf1Var;
        tf1Var5.setLayoutManager(kf1Var);
        new SparseArray();
        new HashMap();
        this.N.setAdapter(this.f33714r);
        this.N.setClipToPadding(false);
        this.N.j(new lf1(this, 0));
        hg1 hg1Var = new hg1(this);
        this.P = hg1Var;
        mf1 mf1Var = new mf1(this, hg1Var);
        this.O = mf1Var;
        mf1Var.d(this.N);
        this.d.addView(this.N, w7.a6.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.N.getLayoutParams()).topMargin = -AndroidUtilities.dp(100.0f);
        org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(getParentActivity(), this.resourceProvider, false);
        this.h = h20Var;
        this.d.addView(h20Var, org.telegram.ui.Components.h20.b());
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final ig1 f32809b;

            {
                this.f32809b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (r2) {
                    case 0:
                        ig1 ig1Var = this.f32809b;
                        ig1Var.presentFragment(ef1.a0(ig1Var.f33681a, 0L));
                        return;
                    case 1:
                        ig1 ig1Var2 = this.f32809b;
                        ig1Var2.getMessagesController().hidePeerSettingsBar(-ig1Var2.f33681a, null, ig1Var2.g());
                        ig1Var2.O0(false);
                        return;
                    case 2:
                        ig1 ig1Var3 = this.f32809b;
                        if (!ig1Var3.f33717s0) {
                            ig1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f32809b.finishPreviewFragment();
                        return;
                    default:
                        wy wyVar32 = this.f32809b.M0;
                        if (wyVar32 != null && (w0Var2 = wyVar32.f38457j0) != null) {
                            w0Var2.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        this.h.f23496c.setImageResource(R.drawable.ic_chatlist_add_2);
        this.h.f23496c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.f23496c.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.h.setContentDescription(LocaleController.getString(R.string.CreateTopic));
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, null);
        a10Var.setViewType(24);
        a10Var.setVisibility(8);
        a10Var.f21345w = true;
        ?? frameLayout = new FrameLayout(context);
        TextView textView = new TextView(context);
        frameLayout.f38992a = textView;
        if (LocaleController.isRTL) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.uq(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TapToCreateTopicHint));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.TapToCreateTopicHint));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.uq(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18306y6));
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
        frameLayout.addView(textView, w7.a6.d(-2, -2.0f, 81, f7, 0.0f, f10, 32.0f));
        this.f33709n = frameLayout;
        textView.setAlpha(0.0f);
        org.telegram.ui.Components.hk hkVar = new org.telegram.ui.Components.hk(this, context, a10Var);
        this.D0 = hkVar;
        try {
            hkVar.f24510b.getImageReceiver().setAutoRepeat(2);
        } catch (Exception unused) {
        }
        this.D0.e(this.J0, this.fragmentBeginToShow);
        this.D0.d.setText(LocaleController.getString(R.string.NoTopics));
        T0();
        this.f33709n.addView(a10Var);
        this.f33709n.addView(this.D0);
        this.d.addView(this.f33709n);
        this.N.setEmptyView(this.f33709n);
        this.f33711o0 = new m91(context, 5);
        org.telegram.ui.Components.t61 t61Var = new org.telegram.ui.Components.t61(context);
        this.L = t61Var;
        this.f33711o0.addView(t61Var);
        this.d.addView(this.f33711o0, w7.a6.e(-1, 51, 80));
        this.L.setOnClickListener(new nf1(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f33710n0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(22.0f));
        this.f33710n0.setVisibility(4);
        this.f33711o0.addView(this.f33710n0, w7.a6.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.W0 = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.W0.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView2 = this.W0;
        int i13 = org.telegram.ui.ActionBar.j6.f17936de;
        imageView2.setBackground(org.telegram.ui.ActionBar.z5.c(null, org.telegram.ui.ActionBar.z5.b(getThemedColor(i13))));
        this.W0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), PorterDuff.Mode.MULTIPLY));
        this.W0.setScaleType(ImageView.ScaleType.CENTER);
        this.f33711o0.addView(this.W0, w7.a6.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.W0.setOnClickListener(new View.OnClickListener(this) {
            public final ig1 f32809b;

            {
                this.f32809b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (r2) {
                    case 0:
                        ig1 ig1Var = this.f32809b;
                        ig1Var.presentFragment(ef1.a0(ig1Var.f33681a, 0L));
                        return;
                    case 1:
                        ig1 ig1Var2 = this.f32809b;
                        ig1Var2.getMessagesController().hidePeerSettingsBar(-ig1Var2.f33681a, null, ig1Var2.g());
                        ig1Var2.O0(false);
                        return;
                    case 2:
                        ig1 ig1Var3 = this.f32809b;
                        if (!ig1Var3.f33717s0) {
                            ig1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f32809b.finishPreviewFragment();
                        return;
                    default:
                        wy wyVar32 = this.f32809b.M0;
                        if (wyVar32 != null && (w0Var2 = wyVar32.f38457j0) != null) {
                            w0Var2.performClick();
                            return;
                        }
                        return;
                }
            }
        });
        this.W0.setVisibility(8);
        O0(false);
        k0 k0Var = new k0(this, context, 25);
        this.e = k0Var;
        if (this.M0 == null) {
            this.d.addView(k0Var, w7.a6.e(-1, -1, 119));
        }
        eg1 eg1Var = new eg1(this, context);
        this.f33715r0 = eg1Var;
        eg1Var.setVisibility(8);
        this.e.addView(this.f33715r0, w7.a6.d(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        eg1 eg1Var2 = this.f33715r0;
        int i14 = org.telegram.ui.ActionBar.j6.f17928d6;
        eg1Var2.setBackgroundColor(getThemedColor(i14));
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().loadChatInfo(this.f33681a, true, null, true, false, 0);
        org.telegram.ui.Components.qs qsVar = new org.telegram.ui.Components.qs(context);
        this.U0 = qsVar;
        qsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        bh.d c12 = aVar.c(this.U0, dh.c.n(this.resourceProvider), false);
        c12.p(AndroidUtilities.dp(24.0f));
        c12.o(AndroidUtilities.dp(7.0f));
        this.U0.setBlurredBackground(c12);
        this.U0.setOnAnimatedHeightChangedListener(new gf1(this, 0));
        this.d.addView(this.U0, w7.a6.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            vh.e eVar = new vh.e(g10, this);
            this.R0 = eVar;
            this.U0.addView(eVar.c(), w7.a6.n(-1, 40));
            this.U0.h(3, this.R0.c());
            this.U0.g(this.R0.c());
            vh.e eVar2 = this.R0;
            eVar2.f43369m = new hf1(this);
            TLRPC.ChatFull chatFull = this.J;
            eVar2.f43366j = chatFull;
            if (chatFull != null) {
                eVar2.e(chatFull.requests_pending, chatFull.recent_requesters, false);
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
        FrameLayout.LayoutParams c13 = w7.a6.c(-2.0f, -1);
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
            public final ig1 f32809b;

            {
                this.f32809b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (r2) {
                    case 0:
                        ig1 ig1Var = this.f32809b;
                        ig1Var.presentFragment(ef1.a0(ig1Var.f33681a, 0L));
                        return;
                    case 1:
                        ig1 ig1Var2 = this.f32809b;
                        ig1Var2.getMessagesController().hidePeerSettingsBar(-ig1Var2.f33681a, null, ig1Var2.g());
                        ig1Var2.O0(false);
                        return;
                    case 2:
                        ig1 ig1Var3 = this.f32809b;
                        if (!ig1Var3.f33717s0) {
                            ig1Var3.H0(false);
                            return;
                        }
                        return;
                    case 3:
                        this.f32809b.finishPreviewFragment();
                        return;
                    default:
                        wy wyVar32 = this.f32809b.M0;
                        if (wyVar32 != null && (w0Var2 = wyVar32.f38457j0) != null) {
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
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) it.next();
                if (p2Var instanceof wy) {
                    wy wyVar4 = (wy) p2Var;
                    if (wyVar4.h4()) {
                        MessagesStorage.TopicKey topicKey = wyVar4.f38486p2;
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
        hf1 hf1Var = new hf1(this);
        WeakHashMap weakHashMap = r0.i0.f41062a;
        r0.a0.j(view, hf1Var);
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
        long j3 = this.f33681a;
        if (i10 == i12) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.J) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.f17196id == j3) {
                O0(false);
                vh.e eVar = this.R0;
                if (eVar != null) {
                    eVar.f43366j = chatFull2;
                    eVar.e(chatFull2.requests_pending, chatFull2.recent_requesters, true);
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
        return getMessagesController().getChat(Long.valueOf(this.f33681a));
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
        org.telegram.ui.Components.vl0 vl0Var;
        zy0 zy0Var = new zy0(9, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.f17928d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, zy0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f18201s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        eg1 eg1Var = this.f33715r0;
        if (eg1Var != null && (vl0Var = eg1Var.U) != null) {
            org.telegram.ui.Cells.u3.a(arrayList, vl0Var);
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
        if (this.f33717s0) {
            i10 = org.telegram.ui.ActionBar.j6.f17928d6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f18201s8;
        }
        int themedColor = getThemedColor(i10);
        if (this.actionBar.s()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f18273w8);
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
    public final org.telegram.ui.Components.jo n() {
        return this.f33694f;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f33682a0.isEmpty()) {
            if (z10) {
                C0();
                return false;
            }
        } else if (this.f33717s0) {
            if (z10) {
                this.actionBar.v(this.f33712p0.L(false));
            }
        } else {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.h(true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j3 = this.f33681a;
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
        l71.t(this.currentAccount);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j3));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, false);
        }
        Long valueOf = Long.valueOf(j3);
        HashSet hashSet = f33680n1;
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
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f33681a));
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
        getMessagesController().getTopicsController().onTopicFragmentPause(this.f33681a);
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        super.onResume();
        TopicsController topicsController = getMessagesController().getTopicsController();
        long j3 = this.f33681a;
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
        qx qxVar;
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
            if (this.f33718t0 && this.H) {
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
        org.telegram.ui.Components.jo joVar = this.f33694f;
        if (joVar != null) {
            joVar.setAlpha(f7);
            this.f33713q0.setAlpha(f7);
            org.telegram.ui.ActionBar.w0 w0Var = this.f33712p0;
            if (w0Var != null) {
                w0Var.setAlpha(f7);
            }
            this.actionBar.getBackButton().setAlpha(f7);
        }
    }

    @Override
    public final void setPreviewReplaceProgress(float f7) {
        org.telegram.ui.Components.jo joVar = this.f33694f;
        if (joVar != null) {
            joVar.setAlpha(f7);
            this.f33694f.setTranslationX((1.0f - f7) * AndroidUtilities.dp(40.0f));
        }
    }

    @Override
    public final eh.d x() {
        return this.f33700h1;
    }

    public final void x0() {
        zg.e eVar;
        View view;
        org.telegram.ui.ActionBar.l lVar;
        float f7;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.f33696f1) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int dp2 = AndroidUtilities.dp(48.0f) + ((int) this.U0.c(AndroidUtilities.dp(14.0f)));
            wy wyVar = this.M0;
            if (wyVar != null) {
                view = wyVar.fragmentView;
            } else {
                view = this.fragmentView;
            }
            if (wyVar != null) {
                lVar = wyVar.getActionBar();
            } else {
                lVar = this.actionBar;
            }
            int measuredHeight = (view.getMeasuredHeight() - this.f33693e1) - AndroidUtilities.dp(8.0f);
            this.l1.set(0.0f, -dp, view.getMeasuredWidth(), lVar.getMeasuredHeight() + dp + dp2);
            RectF rectF = this.f33708m1;
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
            eVar.g(i10, this.f33706k1);
            eVar.e(this.f33704j1, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    @Override
    public final org.telegram.ui.Components.aw0 y() {
        return this.d;
    }

    public final void y0() {
        kf1 kf1Var;
        TopicsController topicsController = this.f33716s;
        long j3 = this.f33681a;
        if (!topicsController.endIsReached(j3) && (kf1Var = this.F) != null) {
            int N0 = kf1Var.N0();
            if (this.f33684b.isEmpty() || N0 >= this.f33714r.h() - 5) {
                topicsController.loadTopics(j3);
            }
            A0();
        }
    }

    public final void z0(boolean z10) {
        String str;
        MessagesController messagesController = getMessagesController();
        long j3 = this.f33681a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j3);
        ChatObject.Call call = this.H0;
        if (call != null && ((str = this.f33726y0) != null || this.f33727z0)) {
            org.telegram.ui.Components.voip.e2.l(chat, str, false, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f33726y0 = null;
            this.f33727z0 = false;
        } else if (this.f33726y0 != null && z10 && chatFull != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.a2.o(R.string.LinkHashExpired, org.telegram.ui.Components.wc.a0(this), R.raw.linkbroken, 36);
            this.f33726y0 = null;
        }
    }

    @Override
    public final void o() {
    }

    @Override
    public final void E(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
    }
}
