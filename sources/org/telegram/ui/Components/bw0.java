package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
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
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
public abstract class bw0 extends FrameLayout implements org.telegram.ui.ActionBar.p6, NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Cells.l2 {
    public static final int[] f26922p2 = {0, 1, 2, 4};
    public static final rs0 f26923q2 = new rs0(0);
    public final Drawable A0;
    public boolean A1;
    public boolean B0;
    public int B1;
    public final NumberTextView C0;
    public int C1;
    public final LinearLayout D0;
    public VelocityTracker D1;
    public final int E;
    public final ImageView E0;
    public boolean E1;
    public final long F;
    public final org.telegram.ui.ActionBar.j2 F0;
    public final nu0 F1;
    public final org.telegram.ui.ActionBar.k G;
    public final ArrayList G0;
    public t40 G1;
    public final org.telegram.ui.ActionBar.r5 H;
    public final ArrayList H0;
    public final org.telegram.ui.ActionBar.u6 H1;
    public final org.telegram.ui.ActionBar.y5 I;
    public final ArrayList I0;
    public final hh.c I1;
    public final fu0 J;
    public final ArrayList J0;
    public final NotificationCenter.ObserversGroup J1;
    public final vv0 K;
    public final vt0 K0;
    public boolean K1;
    public final pv0 L;
    public final st0 L0;
    public final AnimationNotificationsLocker L1;
    public final ov0 M;
    public final org.telegram.ui.Cells.v0 M0;
    public org.telegram.ui.g4 M1;
    public final ov0 N;
    public AnimatorSet N0;
    public int N1;
    public final ov0 O;
    public final wr0 O0;
    public boolean O1;
    public final jv0 P;
    public final ArrayList P0;
    public int P1;
    public final pu0 Q;
    public float Q0;
    public AnimatorSet Q1;
    public final mu0 R;
    public final ws R0;
    public final SparseArray R1;
    public final ku0 S;
    public final FrameLayout S0;
    public long S1;
    public final mv0 T;
    public final qt0 T0;
    public boolean T1;
    public final nv0 U;
    public final int U0;
    public int U1;
    public final gu0 V;
    public final Paint V0;
    public final cu0 V1;
    public final vs0 W;
    public boolean W0;
    public di.z6 W1;
    public boolean X0;
    public float X1;
    public bh.x0 Y0;
    public boolean Y1;
    public final int[] Z0;
    public SpannableStringBuilder Z1;
    public boolean f26924a;
    public final ws0 f26925a0;
    public int f26926a1;
    public int a2;
    public boolean f26927b;
    public final at0 f26928b0;
    public final SparseArray[] f26929b1;
    public boolean f26930b2;
    public boolean f26931c;
    public final lu0 f26932c0;
    public int f26933c1;
    public int f26934c2;
    public boolean d;
    public final s4.z f26935d0;
    public boolean f26936d1;
    public int f26937d2;
    public int e;
    public final iu0 f26938e0;
    public long f26939e1;
    public int f26940e2;
    public int f26941f;
    public final yv0 f26942f0;
    public TLRPC.ChatFull f26943f1;
    public int f26944f2;
    public final us0 f26945g0;
    public TLRPC.UserFull f26946g1;
    public oi.q f26947g2;
    public float h;
    public final yv0 f26948h0;
    public AnimatorSet f26949h1;
    public float f26950h2;
    public final xu0 f26951i0;
    public boolean f26952i1;
    public final RectF f26953i2;
    public final xu0 f26954j0;
    public boolean f26955j1;
    public final HashMap f26956j2;
    public final xu0 f26957k0;
    public boolean f26958k1;
    public final HashMap f26959k2;
    public final su0 f26960l0;
    public final long l1;
    public int f26961l2;
    public final uu0[] m0;
    public boolean f26962m1;
    public int f26963m2;
    public float f26964n;
    public final org.telegram.ui.ActionBar.w0 f26965n0;
    public boolean f26966n1;
    public int f26967n2;
    public final org.telegram.ui.ActionBar.w0 f26968o0;
    public final int[] f26969o1;
    public int f26970o2;
    public final org.telegram.ui.ActionBar.w0 f26971p0;
    public float f26972p1;
    public float f26973q0;
    public boolean f26974q1;
    public boolean f26975r;
    public float f26976r0;
    public int f26977r1;
    public int f26978s;
    public final TextView f26979s0;
    public int f26980s1;
    public final ImageView f26981t0;
    public final gt0 f26982t1;
    public final bk0 f26983u0;
    public float f26984u1;
    public int v;
    public final org.telegram.ui.ActionBar.w0 f26985v0;
    public final qv0[] f26986v1;
    public int f26987w;
    public final org.telegram.ui.ActionBar.w0 f26988w0;
    public final tv0 f26989w1;
    public final Rect f26990x;
    public final org.telegram.ui.ActionBar.w0 f26991x0;
    public final org.telegram.ui.ActionBar.r2 f26992x1;
    public final c10 f26993y;
    public final org.telegram.ui.ActionBar.w0 f26994y0;
    public int f26995y1;
    public int f26996z0;
    public boolean f26997z1;

    public bw0(android.content.Context r35, long r36, org.telegram.ui.Components.tv0 r38, int r39, java.util.ArrayList r40, org.telegram.tgnet.TLRPC.ChatFull r41, org.telegram.tgnet.TLRPC.UserFull r42, int r43, int r44, org.telegram.ui.ActionBar.r2 r45, org.telegram.ui.Components.nu0 r46, int r47, org.telegram.ui.ActionBar.u6 r48, ch.b r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bw0.<init>(android.content.Context, long, org.telegram.ui.Components.tv0, int, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.tgnet.TLRPC$UserFull, int, int, org.telegram.ui.ActionBar.r2, org.telegram.ui.Components.nu0, int, org.telegram.ui.ActionBar.u6, ch.b):void");
    }

    public static boolean E0(int i10) {
        if ((i10 & (-65536)) == 65536) {
            return true;
        }
        return false;
    }

    public static ou0 U(int i10, long j10, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        ou0 ou0Var = new ou0(context, u6Var);
        TextView textView = ou0Var.f31387a;
        if (i10 == 0) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoMediaSecret));
                return ou0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoMedia));
            return ou0Var;
        } else if (i10 == 1) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedFilesSecret));
                return ou0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedFiles));
            return ou0Var;
        } else if (i10 == 2) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedVoiceSecret));
                return ou0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedVoice));
            return ou0Var;
        } else if (i10 == 3) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedLinksSecret));
                return ou0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedLinks));
            return ou0Var;
        } else if (i10 == 4) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedAudioSecret));
                return ou0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedAudio));
            return ou0Var;
        } else if (i10 == 5) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedGifSecret));
                return ou0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoGIFs));
            return ou0Var;
        } else {
            ImageView imageView = ou0Var.f31388b;
            if (i10 == 6) {
                imageView.setImageDrawable(null);
                textView.setText(LocaleController.getString(R.string.NoGroupsInCommon));
                return ou0Var;
            }
            if (i10 == 7) {
                imageView.setImageDrawable(null);
                textView.setText("");
            }
            return ou0Var;
        }
    }

    public static void g(bw0 bw0Var, TL_stories.StoryItem storyItem, di.a7 a7Var) {
        bw0Var.getStoriesController().c(a7Var.f8375a, bw0Var.l1, storyItem);
        AndroidUtilities.runOnUIThread(new u90(18, bw0Var, a7Var), 100L);
    }

    public di.h7 getStoriesController() {
        return MessagesController.getInstance(this.f26992x1.getCurrentAccount()).getStoriesController();
    }

    public static void j(bw0 bw0Var, long j10, int i10, String str) {
        di.v6 B = bw0Var.getStoriesController().B(j10, true);
        int i11 = B.f9259a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        ((di.a7) B.h.get(c10)).f8376b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f9260b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public static void j1(int i10, View view) {
        if (view != null && (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams.topMargin != i10) {
                marginLayoutParams.topMargin = i10;
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public static void k(bw0 bw0Var, int i10, TL_stories.StoryItem storyItem, String str) {
        org.telegram.ui.g4 g4Var = new org.telegram.ui.g4(bw0Var, i10, storyItem, 16);
        di.h7 storiesController = bw0Var.getStoriesController();
        long j10 = bw0Var.l1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.f0(i10, j10, arrayList);
        wc.b0(bw0Var.f26992x1).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", 1, str)), LocaleController.getString(R.string.UndoNoCaps), g4Var).j();
    }

    public static TLRPC.ProfileTab l0(int i10, boolean z10) {
        if (i10 != 8 && i10 != 14 && !z10) {
            return null;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                if (i10 != 8) {
                                    if (i10 != 14) {
                                        return null;
                                    }
                                    return new TLRPC.TL_profileTabGifts();
                                }
                                return new TLRPC.TL_profileTabPosts();
                            }
                            return new TLRPC.TL_profileTabGifs();
                        }
                        return new TLRPC.TL_profileTabMusic();
                    }
                    return new TLRPC.TL_profileTabLinks();
                }
                return new TLRPC.TL_profileTabVoice();
            }
            return new TLRPC.TL_profileTabFiles();
        }
        return new TLRPC.TL_profileTabMedia();
    }

    public static void m(bw0 bw0Var, long j10, int i10) {
        di.v6 B = bw0Var.getStoriesController().B(j10, true);
        int i11 = B.f9259a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f9260b);
        tL_deleteAlbum.album_id = ((di.a7) B.h.remove(c10)).f8375a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public static int m0(TLRPC.ProfileTab profileTab) {
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
        if (profileTab instanceof TLRPC.TL_profileTabGifs) {
            return 5;
        }
        return -1;
    }

    public static void n(bw0 bw0Var, TL_stories.StoryItem storyItem) {
        bw0Var.getStoriesController().r0(bw0Var.l1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        wc.b0(bw0Var.f26992x1).G(R.raw.chats_archived, 5000, LocaleController.formatPluralString("StoryArchived", 1, new Object[0])).j();
    }

    public static void p(bw0 bw0Var, HashSet hashSet, TL_stories.StoryItem storyItem, l80 l80Var, di.a7 a7Var) {
        String formatString;
        long j10 = bw0Var.l1;
        if (hashSet.contains(Integer.valueOf(a7Var.f8375a))) {
            bw0Var.getStoriesController().c(a7Var.f8375a, j10, storyItem);
            formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, a7Var.f8376b);
        } else {
            di.h7 storiesController = bw0Var.getStoriesController();
            int i10 = a7Var.f8375a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.f0(i10, j10, arrayList);
            formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, a7Var.f8376b);
        }
        wc.b0(bw0Var.f26992x1).R(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
        l80Var.u();
    }

    public static int r(View view) {
        if (view instanceof org.telegram.ui.Cells.w7) {
            return ((org.telegram.ui.Cells.w7) view).getMessageId();
        }
        if (view instanceof org.telegram.ui.Cells.o7) {
            return ((org.telegram.ui.Cells.o7) view).getMessage().getId();
        }
        if (view instanceof org.telegram.ui.Cells.n7) {
            return ((org.telegram.ui.Cells.n7) view).getMessage().getId();
        }
        return 0;
    }

    public void setHeaderEnabled(boolean z10) {
        org.telegram.ui.ActionBar.r5 r5Var = this.H;
        if (r5Var != null) {
            r5Var.setEnabled(z10);
        } else {
            this.G.setEnabled(z10);
        }
    }

    private void setPageOverscan(tu0 tu0Var) {
        if (this.f26930b2 && tu0Var != null) {
            tu0Var.f33154j3 = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tu0Var.getLayoutParams();
            if (marginLayoutParams != null) {
                int i10 = marginLayoutParams.topMargin;
                int i11 = -this.f26937d2;
                if (i10 != i11 || marginLayoutParams.bottomMargin != (-this.f26940e2)) {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.bottomMargin = -this.f26940e2;
                    tu0Var.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    public void setSearchItemVisibility(int i10) {
        org.telegram.ui.ActionBar.w0 w0Var = this.f26971p0;
        if (w0Var == null) {
            return;
        }
        if (this.H != null) {
            O(true);
        } else {
            w0Var.setVisibility(i10);
        }
    }

    public static void t(uu0 uu0Var, qv0[] qv0VarArr, boolean z10) {
        u90 u90Var;
        if (z10) {
            if (SharedConfig.fastScrollHintCount > 0 && uu0Var.F == null && !uu0Var.H && uu0Var.h.getFastScroll() != null && uu0Var.h.getFastScroll().f33081a0 && uu0Var.h.getFastScroll().getVisibility() == 0 && qv0VarArr[0].e() >= 50) {
                SharedConfig.setFastScrollHintCount(SharedConfig.fastScrollHintCount - 1);
                uu0Var.H = true;
                Context context = uu0Var.getContext();
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                textView.setText(LocaleController.getString(R.string.SharedMediaFastScrollHint));
                textView.setTextSize(1, 14.0f);
                textView.setMaxLines(3);
                int i10 = org.telegram.ui.ActionBar.y6.f23588pf;
                org.telegram.ui.ActionBar.f7.V(textView, i10, null);
                int dp = AndroidUtilities.dp(6.0f);
                int i11 = org.telegram.ui.ActionBar.y6.f23605qf;
                ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.x0(null, i11, false));
                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
                frameLayout.setBackground(c02);
                org.telegram.ui.ActionBar.f7.k(frameLayout, c02, N, null, null);
                frameLayout.addView(textView, kb1.h(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
                ?? view = new View(context);
                view.f32660a = new Random();
                Paint paint = new Paint(1);
                view.f32661b = paint;
                Paint paint2 = new Paint(1);
                view.f32662c = paint2;
                view.f32663f = 1.0f;
                view.h = 0.0f;
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i10, false), 76));
                paint2.setColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
                Paint paint3 = new Paint();
                view.d = paint3;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint3.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint3.setXfermode(new PorterDuffXfermode(mode));
                Paint paint4 = new Paint();
                view.e = paint4;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                paint4.setXfermode(new PorterDuffXfermode(mode));
                frameLayout.addView(view, kb1.h(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                uu0Var.F = frameLayout;
                uu0Var.addView((View) frameLayout, kb1.g(-2.0f, -2));
                uu0Var.F.setAlpha(0.0f);
                uu0Var.F.setScaleX(0.8f);
                uu0Var.F.setScaleY(0.8f);
                uu0Var.F.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                uu0Var.invalidate();
                u90 u90Var2 = new u90(16, uu0Var, frameLayout);
                uu0Var.G = u90Var2;
                AndroidUtilities.runOnUIThread(u90Var2, 4000L);
            }
        } else if (uu0Var.F != null && (u90Var = uu0Var.G) != null) {
            AndroidUtilities.cancelRunOnUIThread(u90Var);
            uu0Var.G.run();
            uu0Var.G = null;
            uu0Var.F = null;
        }
    }

    public static void u(bw0 bw0Var, int i10, boolean z10) {
        uu0[] uu0VarArr = bw0Var.m0;
        if (uu0VarArr[0].E == i10) {
            return;
        }
        uu0 uu0Var = uu0VarArr[1];
        uu0Var.E = i10;
        uu0Var.setVisibility(0);
        bw0Var.t0();
        bw0Var.v1(true);
        bw0Var.f26955j1 = z10;
        bw0Var.S0();
        bw0Var.D(!bw0Var.A0(i10));
        bw0Var.C1(true);
    }

    public static int w(bw0 bw0Var, s4.h0 h0Var) {
        if (h0Var == bw0Var.f26938e0) {
            return 8;
        }
        if (h0Var == bw0Var.f26945g0) {
            return 9;
        }
        for (aw0 aw0Var : bw0Var.f26956j2.values()) {
            if (aw0Var.f26684c == h0Var) {
                return aw0Var.f26682a;
            }
        }
        return -1;
    }

    public static boolean w0(int i10) {
        if (i10 != 8 && i10 != 9 && !E0(i10)) {
            return false;
        }
        return true;
    }

    public static int x(bw0 bw0Var, s4.h0 h0Var) {
        if (h0Var == bw0Var.f26942f0) {
            return 8;
        }
        if (h0Var == bw0Var.f26948h0) {
            return 9;
        }
        for (aw0 aw0Var : bw0Var.f26956j2.values()) {
            if (aw0Var.d == h0Var) {
                return aw0Var.f26682a;
            }
        }
        return -1;
    }

    public final void A(zu0 zu0Var, org.telegram.ui.ActionBar.r2 r2Var, long j10, int i10) {
        String publicUsername;
        if (j10 > 0) {
            publicUsername = UserObject.getPublicUsername(MessagesController.getInstance(r2Var.getCurrentAccount()).getUser(Long.valueOf(j10)));
        } else {
            publicUsername = ChatObject.getPublicUsername(MessagesController.getInstance(r2Var.getCurrentAccount()).getChat(Long.valueOf(-j10)));
        }
        if (publicUsername == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        c3.h0.r(sb2, MessagesController.getInstance(r2Var.getCurrentAccount()).linkPrefix, "/", publicUsername, "/a/");
        sb2.append(i10);
        String sb3 = sb2.toString();
        zu0Var.Z(R.drawable.media_share, new kg(this, sb3, r2Var, 22), LocaleController.getString(R.string.StoriesAlbumMenuShareLink), false, true);
    }

    public final boolean A0(int i10) {
        if (i10 == 7) {
            return this.F1.U();
        }
        if (!B0() && i10 != 0 && !w0(i10) && i10 != 2 && i10 != 5 && i10 != 6 && i10 != 11 && i10 != 10 && i10 != 13 && i10 != 14 && i10 != 15) {
            return true;
        }
        return false;
    }

    public final void A1() {
        boolean z10;
        float f7;
        org.telegram.ui.ActionBar.w0 w0Var = this.f26985v0;
        if (w0Var != null) {
            if (!this.f26992x1.getMessagesController().isPeerNoForwards(this.l1) && !r0()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                f7 = 0.5f;
            } else {
                f7 = 1.0f;
            }
            w0Var.setAlpha(f7);
            if (z10 && w0Var.getBackground() != null) {
                w0Var.setBackground(null);
            } else if (!z10 && w0Var.getBackground() == null) {
                int i10 = org.telegram.ui.ActionBar.y6.f23770z8;
                org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(p0(i10), 5, -1);
                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
                w0Var.setBackground(g02);
                org.telegram.ui.ActionBar.f7.k(w0Var, g02, null, N, this.H1);
            }
        }
    }

    public final void B(zu0 zu0Var) {
        float f7;
        final View[] viewArr = {zu0Var.Z(R.drawable.msg_zoomin, new Runnable(this) {
            public final bw0 f30299b;

            {
                this.f30299b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        bw0 bw0Var = this.f30299b;
                        bw0Var.getClass();
                        View[] viewArr2 = viewArr;
                        bw0Var.K1(viewArr2[0], viewArr2[1]);
                        return;
                    default:
                        bw0 bw0Var2 = this.f30299b;
                        bw0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        bw0Var2.L1(viewArr3[0], viewArr3[1]);
                        return;
                }
            }
        }, LocaleController.getString(R.string.MediaZoomIn), false, false), zu0Var.Z(R.drawable.msg_zoomout, new Runnable(this) {
            public final bw0 f30299b;

            {
                this.f30299b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        bw0 bw0Var = this.f30299b;
                        bw0Var.getClass();
                        View[] viewArr2 = viewArr;
                        bw0Var.K1(viewArr2[0], viewArr2[1]);
                        return;
                    default:
                        bw0 bw0Var2 = this.f30299b;
                        bw0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        bw0Var2.L1(viewArr3[0], viewArr3[1]);
                        return;
                }
            }
        }, LocaleController.getString(R.string.MediaZoomOut), false, false)};
        View view = viewArr[0];
        float f10 = 0.5f;
        if (view != null) {
            view.setEnabled(H());
            View view2 = viewArr[0];
            if (H()) {
                f7 = 1.0f;
            } else {
                f7 = 0.5f;
            }
            view2.setAlpha(f7);
        }
        View view3 = viewArr[1];
        if (view3 != null) {
            view3.setEnabled(I());
            View view4 = viewArr[1];
            if (I()) {
                f10 = 1.0f;
            }
            view4.setAlpha(f10);
        }
    }

    public boolean B0() {
        if (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) {
            return false;
        }
        return true;
    }

    public final void B1() {
        int i10;
        ws0 ws0Var = this.f26925a0;
        if (ws0Var != null) {
            int dp = AndroidUtilities.dp(48.0f) + this.f26934c2;
            ws wsVar = this.R0;
            if (wsVar != null) {
                i10 = (int) wsVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i10 = 0;
            }
            ws0Var.setPaddingTop(dp + i10);
        }
    }

    public final void C(tu0 tu0Var, int i10, SparseBooleanArray sparseBooleanArray) {
        int childCount = tu0Var.getChildCount();
        c10 c10Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = tu0Var.getChildAt(i11);
            if (childAt instanceof c10) {
                c10Var = childAt;
            }
        }
        if (c10Var != null) {
            tu0Var.removeView(c10Var);
        }
        getViewTreeObserver().addOnPreDrawListener(new au0(this, tu0Var, sparseBooleanArray, c10Var, i10));
    }

    public boolean C0() {
        return false;
    }

    public final void C1(boolean z10) {
        ws0 ws0Var;
        at0 at0Var;
        boolean z11 = true;
        O(true);
        bk0 bk0Var = this.f26983u0;
        if (bk0Var == null) {
            return;
        }
        float f7 = 0.0f;
        if (!this.X0 && (((ws0Var = this.f26925a0) == null || !ws0Var.g()) && ((at0Var = this.f26928b0) == null || !at0Var.f41611f))) {
            f7 = Utilities.clamp(this.f26973q0 + this.f26976r0, 1.0f, 0.0f);
        }
        bk0Var.setAlpha(f7);
        if (z10) {
            if (h0(1.0f) <= 0.5f) {
                z11 = false;
            }
            D(z11);
        } else if (this.f26996z0 == 2) {
            if (this.f26976r0 <= 0.1f) {
                z11 = false;
            }
            D(z11);
        } else {
            if (this.f26973q0 >= 0.1f) {
                z11 = false;
            }
            D(z11);
        }
    }

    public final void D(boolean z10) {
        int i10;
        bk0 bk0Var = this.f26983u0;
        if (bk0Var != null && this.Y1 != z10) {
            this.Y1 = z10;
            if (!z10 && bk0Var.getAnimatedDrawable().f35067a0 < 20) {
                bk0Var.getAnimatedDrawable().P(0);
            } else {
                yj0 animatedDrawable = bk0Var.getAnimatedDrawable();
                if (this.Y1) {
                    i10 = 50;
                } else {
                    i10 = 100;
                }
                animatedDrawable.P(i10);
            }
            bk0Var.getAnimatedDrawable().start();
        }
    }

    public boolean D0() {
        return false;
    }

    public final void D1(uu0 uu0Var) {
        boolean z10;
        boolean b12 = uu0Var.h.b1();
        if (b12) {
            uu0Var.h.setSectionsDrawBackground(this.f26930b2);
        }
        if (this.f26930b2 && !b12 && uu0Var.E != 15) {
            z10 = true;
        } else {
            z10 = false;
        }
        uu0Var.setDrawPageBackground(z10);
        if (uu0Var.E == 15) {
            Drawable drawable = uu0Var.O;
            if (drawable == null) {
                drawable = uu0Var.getBackground();
            }
            Drawable e = fi.o6.e(drawable, this.f26992x1.getCurrentAccount(), this.l1, org.telegram.ui.ActionBar.y6.I.q());
            if (!this.f26930b2) {
                uu0Var.setWallpaper(null);
                uu0Var.setBackground(e);
                uu0Var.setOutlineProvider(new ag.v0(18));
                uu0Var.setClipToOutline(true);
                return;
            }
            uu0Var.setBackground(null);
            uu0Var.setClipToOutline(false);
            uu0Var.setWallpaper(e);
            return;
        }
        uu0Var.setClipToOutline(false);
        uu0Var.setBackground(null);
        uu0Var.setWallpaper(null);
    }

    public final void E(int i10) {
        int i11;
        uu0 d02 = d0(this.f26977r1);
        this.f26978s = -1;
        if (d02 != null) {
            d02.h.C0();
            this.f26980s1 = i10;
            d02.f33468n.setVisibility(0);
            if (w0(this.f26977r1)) {
                d02.f33468n.setAdapter(u1(this.f26977r1));
            } else {
                d02.f33468n.setAdapter(this.K);
            }
            tu0 tu0Var = d02.f33468n;
            int paddingLeft = tu0Var.getPaddingLeft();
            tu0 tu0Var2 = d02.f33468n;
            int g02 = g0(d02.E);
            tu0Var2.f33152h3 = g02;
            int paddingRight = d02.f33468n.getPaddingRight();
            tu0 tu0Var3 = d02.f33468n;
            int f02 = f0(D0());
            tu0Var3.f33153i3 = f02;
            tu0Var.setPadding(paddingLeft, g02, paddingRight, f02);
            d02.f33469r.z1(i10);
            d02.f33468n.a0();
            int i12 = 0;
            while (true) {
                uu0[] uu0VarArr = this.m0;
                if (i12 >= uu0VarArr.length) {
                    break;
                }
                uu0 uu0Var = uu0VarArr[i12];
                if (uu0Var != null && ((i11 = uu0Var.E) == 0 || w0(i11))) {
                    AndroidUtilities.updateVisibleRows(uu0VarArr[i12].h);
                }
                i12++;
            }
            this.f26974q1 = true;
            if (this.f26977r1 == 0) {
                this.f26986v1[0].g(true);
            }
            this.f26972p1 = 0.0f;
            d1();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.L1.lock();
            ofFloat.addUpdateListener(new ut0(this, d02, 1));
            ofFloat.addListener(new hi.b3(this, w0(d02.E) ? 1 : 0, i10, 2));
            ofFloat.setInterpolator(ds.f27530f);
            ofFloat.setStartDelay(100L);
            ofFloat.setDuration(350L);
            ofFloat.start();
        }
    }

    public final void E1(uu0 uu0Var) {
        boolean z10;
        float f7;
        int i10;
        float f10;
        float f11;
        int i11 = uu0Var.E;
        if (i11 != 0 && !w0(i11)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 12.0f;
        }
        if (z10) {
            i10 = 8;
        } else {
            i10 = 12;
        }
        float f12 = i10 + 48;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 12.0f;
        }
        if (z10) {
            f11 = 0.0f;
        } else {
            f11 = 12.0f;
        }
        FrameLayout.LayoutParams h = kb1.h(-1, -1.0f, 119, f7, f12, f10, f11);
        h.topMargin = k0(uu0Var.E) + h.topMargin;
        ViewGroup.LayoutParams layoutParams = uu0Var.f33470s.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.leftMargin == h.leftMargin && layoutParams2.topMargin == h.topMargin && layoutParams2.rightMargin == h.rightMargin && layoutParams2.bottomMargin == h.bottomMargin && layoutParams2.gravity == h.gravity) {
                return;
            }
        }
        uu0Var.f33470s.setLayoutParams(h);
    }

    public final boolean F() {
        boolean y02 = y0();
        long j10 = this.l1;
        org.telegram.ui.ActionBar.r2 r2Var = this.f26992x1;
        if (y02) {
            TLRPC.User user = MessagesController.getInstance(r2Var.getCurrentAccount()).getUser(Long.valueOf(j10));
            if (user == null || !user.bot || !user.bot_can_edit) {
                return false;
            }
            return true;
        } else if (!D0() && (r2Var == null || !r2Var.getMessagesController().getStoriesController().h(j10))) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean F0() {
        if (!F() || ((getClosestTab() != 8 && getClosestTab() != 13 && !E0(getClosestTab())) || !this.E1)) {
            ws0 ws0Var = this.f26925a0;
            if (ws0Var == null || !ws0Var.g()) {
                at0 at0Var = this.f26928b0;
                if ((at0Var == null || !at0Var.f41611f) && !this.f26974q1 && !this.f26952i1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void F1(boolean z10) {
        int i10 = 0;
        while (true) {
            uu0[] uu0VarArr = this.m0;
            if (i10 < uu0VarArr.length) {
                int childCount = uu0VarArr[i10].h.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = uu0VarArr[i10].h.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.o7) {
                        ((org.telegram.ui.Cells.o7) childAt).b(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.w7) {
                        ((org.telegram.ui.Cells.w7) childAt).i(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.r7) {
                        ((org.telegram.ui.Cells.r7) childAt).f(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.n7) {
                        ((org.telegram.ui.Cells.n7) childAt).e(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.d2) {
                        ((org.telegram.ui.Cells.d2) childAt).c(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.p2) {
                        ((org.telegram.ui.Cells.p2) childAt).U(false, z10);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public boolean G() {
        return !(this instanceof j40);
    }

    public final void G0(int i10, int i11, int i12, boolean z10) {
        qv0[] qv0VarArr = this.f26986v1;
        qv0VarArr[i10].f32033a.clear();
        qv0VarArr[i10].f32034b[0].clear();
        qv0VarArr[i10].f32034b[1].clear();
        qv0 qv0Var = qv0VarArr[i10];
        qv0Var.f32039j[0] = i11;
        qv0Var.f32038i[0] = false;
        qv0Var.f32041l = false;
        qv0Var.f32042m = i12;
        qv0Var.f32043n = (qv0Var.e() - i12) - 1;
        qv0 qv0Var2 = qv0VarArr[i10];
        if (qv0Var2.f32043n < 0) {
            qv0Var2.f32043n = 0;
        }
        qv0Var2.f32040k = i11;
        qv0Var2.f32044o = true;
        qv0Var2.f32037g = false;
        qv0Var2.f32045p++;
        uu0 d02 = d0(i10);
        if (d02 != null && d02.h.getAdapter() != null) {
            d02.h.getAdapter().l();
        }
        if (z10) {
            int i13 = 0;
            while (true) {
                uu0[] uu0VarArr = this.m0;
                if (i13 < uu0VarArr.length) {
                    uu0 uu0Var = uu0VarArr[i13];
                    if (uu0Var.E == i10) {
                        uu0Var.f33471w.h1(Math.min(qv0VarArr[i10].e() - 1, qv0VarArr[i10].f32042m), 0);
                    }
                    i13++;
                } else {
                    return;
                }
            }
        }
    }

    public final void G1(float f7) {
        org.telegram.ui.ActionBar.w0 w0Var = this.f26968o0;
        if (w0Var == null) {
            return;
        }
        uu0[] uu0VarArr = this.m0;
        uu0 uu0Var = uu0VarArr[1];
        float f10 = 0.0f;
        if (uu0Var != null && uu0Var.E == 11) {
            f10 = 0.0f + f7;
        }
        int i10 = 0;
        uu0 uu0Var2 = uu0VarArr[0];
        if (uu0Var2 != null && uu0Var2.E == 11) {
            f10 += 1.0f - f7;
        }
        w0Var.setAlpha(f10);
        float f11 = (0.15f * f10) + 0.85f;
        w0Var.setScaleX(f11);
        w0Var.setScaleY(f11);
        if (f10 <= 0.01f) {
            i10 = 8;
        }
        w0Var.setVisibility(i10);
    }

    public final boolean H() {
        uu0 uu0Var;
        uu0[] uu0VarArr = this.m0;
        if (uu0VarArr != null && (uu0Var = uu0VarArr[0]) != null) {
            boolean w02 = w0(uu0Var.E);
            int i10 = this.f26969o1[w02 ? 1 : 0];
            if (i10 != e0(w02 ? 1 : 0, i10, true)) {
                return true;
            }
        }
        return false;
    }

    public final void H0(boolean z10) {
        long j10 = this.F;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0 && !B0()) {
            for (int i11 = 0; i11 < 4; i11++) {
                final int i12 = f26922p2[i11];
                qv0[] qv0VarArr = this.f26986v1;
                if (!qv0VarArr[i12].h || z10) {
                    long j11 = this.l1;
                    if (!DialogObject.isEncryptedDialog(j11)) {
                        qv0VarArr[i12].h = false;
                        TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
                        if (i12 == 0) {
                            int i13 = qv0VarArr[i12].f32046q;
                            if (i13 == 1) {
                                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotos();
                            } else if (i13 == 2) {
                                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterVideo();
                            } else {
                                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
                            }
                        } else if (i12 == 1) {
                            tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterDocument();
                        } else if (i12 == 2) {
                            tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterRoundVoice();
                        } else {
                            tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterMusic();
                        }
                        tL_messages_getSearchResultsPositions.limit = 100;
                        org.telegram.ui.ActionBar.r2 r2Var = this.f26992x1;
                        tL_messages_getSearchResultsPositions.peer = r2Var.getMessagesController().getInputPeer(j11);
                        if (i10 != 0 && r2Var.getUserConfig().getClientUserId() == j11) {
                            tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                            tL_messages_getSearchResultsPositions.saved_peer_id = r2Var.getMessagesController().getInputPeer(j10);
                        }
                        final int i14 = qv0VarArr[i12].f32045p;
                        ConnectionsManager.getInstance(r2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(r2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new bs0(bw0.this, tL_error, i14, i12, tLObject, 0));
                            }
                        }), r2Var.getClassGuid());
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void H1() {
        float f7;
        float f10;
        org.telegram.ui.ActionBar.w0 w0Var = this.f26968o0;
        if (w0Var == null) {
            return;
        }
        boolean z10 = true;
        uu0 uu0Var = this.m0[1];
        if (uu0Var == null || uu0Var.E != 11) {
            z10 = false;
        }
        if (z10) {
            w0Var.setVisibility(0);
        }
        ViewPropertyAnimator animate = w0Var.animate();
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f7);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.85f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f10);
        if (!z10) {
            f11 = 0.85f;
        }
        scaleX.scaleY(f11).withEndAction(new d60(3, this, z10)).setDuration(420L).setInterpolator(ds.h).start();
    }

    public final boolean I() {
        uu0 uu0Var;
        uu0[] uu0VarArr = this.m0;
        if (uu0VarArr == null || (uu0Var = uu0VarArr[0]) == null) {
            return false;
        }
        if (this.f26962m1 && w0(uu0Var.E)) {
            return false;
        }
        boolean w02 = w0(uu0VarArr[0].E);
        int i10 = this.f26969o1[w02 ? 1 : 0];
        if (i10 == e0(w02 ? 1 : 0, i10, false)) {
            return false;
        }
        return true;
    }

    public final void I0(int i10) {
        int i11;
        int i12 = 2;
        qv0[] qv0VarArr = this.f26986v1;
        if (i10 == 0) {
            int i13 = qv0VarArr[0].f32046q;
            if (i13 == 1) {
                i12 = 6;
            } else if (i13 == 2) {
                i12 = 7;
            } else {
                i11 = 0;
            }
            i11 = i12;
        } else if (i10 == 1) {
            i11 = 1;
        } else {
            if (i10 != 2) {
                i12 = 4;
                if (i10 != 4) {
                    i12 = 5;
                    if (i10 != 5) {
                        i12 = 3;
                    }
                }
            }
            i11 = i12;
        }
        qv0VarArr[i10].f32037g = true;
        org.telegram.ui.ActionBar.r2 r2Var = this.f26992x1;
        r2Var.getMediaDataController().loadMedia(this.l1, 50, 0, qv0VarArr[i10].f32040k, i11, this.F, 1, r2Var.getClassGuid(), qv0VarArr[i10].f32045p, null, null);
    }

    public final void I1() {
        boolean z10;
        int i10;
        di.z6 z6Var;
        boolean y02 = y0();
        org.telegram.ui.ActionBar.w0 w0Var = this.f26994y0;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f26991x0;
        int i11 = 8;
        if (y02) {
            if (w0Var2 != null) {
                w0Var2.setVisibility(8);
            }
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
        } else if (getClosestTab() == 9) {
            if (w0Var2 != null) {
                w0Var2.setVisibility(8);
            }
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
        } else if (getClosestTab() == 8) {
            int i12 = 0;
            while (true) {
                SparseArray[] sparseArrayArr = this.f26929b1;
                if (i12 < sparseArrayArr[0].size()) {
                    MessageObject messageObject = (MessageObject) sparseArrayArr[0].valueAt(i12);
                    iu0 iu0Var = this.f26938e0;
                    if (iu0Var != null && (z6Var = iu0Var.f35173s) != null && !z6Var.m(messageObject.getId())) {
                        z10 = true;
                        break;
                    }
                    i12++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (w0Var2 != null) {
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                w0Var2.setVisibility(i10);
            }
            if (w0Var != null) {
                if (!z10) {
                    i11 = 0;
                }
                w0Var.setVisibility(i11);
            }
        } else if (E0(getClosestTab())) {
            if (w0Var2 != null) {
                w0Var2.setVisibility(8);
            }
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
        }
    }

    public final void J(Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        uu0[] uu0VarArr;
        nm0 nm0Var;
        vs0 vs0Var;
        gu0 gu0Var;
        ws0 ws0Var;
        View[] viewPages;
        for (uu0 uu0Var : this.m0) {
            if (uu0Var != null && uu0Var.getVisibility() == 0) {
                if (uu0Var.O != null) {
                    RectF rectF2 = this.f26953i2;
                    if (jh.k.c(uu0Var, viewGroup, rectF2)) {
                        canvas.save();
                        canvas.translate(rectF2.left, rectF2.top);
                        uu0Var.e(canvas);
                        canvas.restore();
                    }
                }
                if (uu0Var.E == 14 && (ws0Var = this.f26925a0) != null && ws0Var.getParent() == uu0Var) {
                    for (View view : ws0Var.h.getViewPages()) {
                        if ((view instanceof zh.m2) && view.getVisibility() == 0) {
                            zh.h2 h2Var = ((zh.m2) view).f53204f;
                            ih.d.a(h2Var, canvas, rectF, h2Var, viewGroup);
                        }
                    }
                } else {
                    if (uu0Var.E == 12 && (gu0Var = this.V) != null && gu0Var.getParent() == uu0Var) {
                        nm0Var = gu0Var.f46049a.f45339x0;
                    } else if (uu0Var.E == 13 && (vs0Var = this.W) != null && vs0Var.getParent() == uu0Var) {
                        nm0Var = vs0Var.getCurrentListView();
                    } else {
                        nm0Var = uu0Var.h;
                    }
                    if (nm0Var != null && nm0Var.getVisibility() == 0) {
                        ih.d.a(nm0Var, canvas, rectF, nm0Var, viewGroup);
                    }
                }
            }
        }
    }

    public int J0() {
        return 0;
    }

    public void J1(boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bw0.J1(boolean):void");
    }

    public final void K() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bw0.K():void");
    }

    public final Boolean K1(View view, View view2) {
        if (!this.f26974q1) {
            uu0[] uu0VarArr = this.m0;
            boolean z10 = false;
            uu0 uu0Var = uu0VarArr[0];
            if (uu0Var != null) {
                int i10 = uu0Var.E;
                this.f26977r1 = i10;
                boolean w02 = w0(i10);
                int[] iArr = this.f26969o1;
                int e02 = e0(w02 ? 1 : 0, iArr[w02 ? 1 : 0], true);
                if (view != null && e02 == e0(w02 ? 1 : 0, e02, true)) {
                    view.setEnabled(false);
                    view.animate().alpha(0.5f).start();
                }
                if (iArr[w02 ? 1 : 0] != e02) {
                    if (view2 != null && !view2.isEnabled()) {
                        view2.setEnabled(true);
                        view2.animate().alpha(1.0f).start();
                    }
                    if (!w02) {
                        SharedConfig.setMediaColumnsCount(e02);
                    } else if (j0(uu0VarArr[0].E) >= 5 || E0(uu0VarArr[0].E)) {
                        SharedConfig.setStoriesColumnsCount(e02);
                    }
                    E(e02);
                }
                if (e02 != e0(w02 ? 1 : 0, e02, true)) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
            return null;
        }
        return null;
    }

    public final void L() {
        vt0 vt0Var = this.K0;
        if (!vt0Var.d(vt0Var.getCurrentTabId())) {
            int firstTabId = vt0Var.getFirstTabId();
            vt0Var.setInitialTabId(firstTabId);
            this.m0[0].E = firstTabId;
            v1(false);
        }
    }

    public final Boolean L1(View view, View view2) {
        if (!this.f26974q1) {
            uu0[] uu0VarArr = this.m0;
            boolean z10 = false;
            uu0 uu0Var = uu0VarArr[0];
            if (uu0Var != null) {
                if (!this.f26962m1 || !w0(uu0Var.E)) {
                    int i10 = uu0VarArr[0].E;
                    this.f26977r1 = i10;
                    boolean w02 = w0(i10);
                    int[] iArr = this.f26969o1;
                    int e02 = e0(w02 ? 1 : 0, iArr[w02 ? 1 : 0], false);
                    if (view2 != null && e02 == e0(w02 ? 1 : 0, e02, false)) {
                        view2.setEnabled(false);
                        view2.animate().alpha(0.5f).start();
                    }
                    if (iArr[w02 ? 1 : 0] != e02) {
                        if (view != null && !view.isEnabled()) {
                            view.setEnabled(true);
                            view.animate().alpha(1.0f).start();
                        }
                        if (!w02) {
                            SharedConfig.setMediaColumnsCount(e02);
                        } else if (j0(uu0VarArr[0].E) >= 5 || E0(uu0VarArr[0].E)) {
                            SharedConfig.setStoriesColumnsCount(e02);
                        }
                        E(e02);
                    }
                    if (e02 != e0(w02 ? 1 : 0, e02, false)) {
                        z10 = true;
                    }
                    return Boolean.valueOf(z10);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void M(org.telegram.ui.Components.uu0 r34, org.telegram.ui.Components.nm0 r35, s4.c0 r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bw0.M(org.telegram.ui.Components.uu0, org.telegram.ui.Components.nm0, s4.c0):void");
    }

    public final void M0() {
        di.z6 z6Var;
        di.z6 z6Var2;
        this.J1.removeAllObservers();
        iu0 iu0Var = this.f26938e0;
        if (iu0Var != null && (z6Var2 = iu0Var.f35173s) != null && z6Var2 != null) {
            z6Var2.z(iu0Var.v);
        }
        us0 us0Var = this.f26945g0;
        if (us0Var != null && (z6Var = us0Var.f35173s) != null && z6Var != null) {
            z6Var.z(us0Var.v);
        }
        for (aw0 aw0Var : this.f26956j2.values()) {
            zv0 zv0Var = aw0Var.f26684c;
            di.z6 z6Var3 = zv0Var.f35173s;
            if (z6Var3 != null && z6Var3 != null) {
                z6Var3.z(zv0Var.v);
            }
        }
    }

    public final boolean N(MotionEvent motionEvent) {
        float f7;
        s4.h0 h0Var;
        boolean z10;
        vs0 vs0Var;
        float f10;
        boolean z11;
        uu0[] uu0VarArr = this.m0;
        int i10 = uu0VarArr[0].E;
        if (i10 == 13 && (vs0Var = this.W) != null) {
            View currentView = vs0Var.f10018n.getCurrentView();
            if (currentView instanceof ei.r) {
                ei.r rVar = (ei.r) currentView;
                ei.l lVar = rVar.v;
                ei.i iVar = rVar.f10003f;
                if (rVar.f10000a != null && rVar.getParent() != null) {
                    if (!rVar.f10001b || rVar.K) {
                        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                            if (motionEvent.getActionMasked() == 2 && (rVar.K || rVar.M)) {
                                int i11 = -1;
                                int i12 = -1;
                                for (int i13 = 0; i13 < motionEvent.getPointerCount(); i13++) {
                                    if (rVar.N == motionEvent.getPointerId(i13)) {
                                        i11 = i13;
                                    }
                                    if (rVar.O == motionEvent.getPointerId(i13)) {
                                        i12 = i13;
                                    }
                                }
                                if (i11 != -1 && i12 != -1) {
                                    float hypot = ((float) Math.hypot(motionEvent.getX(i12) - motionEvent.getX(i11), motionEvent.getY(i12) - motionEvent.getY(i11))) / rVar.P;
                                    rVar.Q = hypot;
                                    if (!rVar.K && (hypot > 1.01f || hypot < 0.99f)) {
                                        rVar.K = true;
                                        if (hypot > 1.0f) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        rVar.R = z11;
                                        rVar.b(z11);
                                    }
                                    if (rVar.K) {
                                        boolean z12 = rVar.R;
                                        if ((z12 && rVar.Q < 1.0f) || (!z12 && rVar.Q > 1.0f)) {
                                            rVar.f10002c = 0.0f;
                                        } else {
                                            if (z12) {
                                                f10 = org.telegram.messenger.t.y(2.0f, rVar.Q, 1.0f, 1.0f);
                                            } else {
                                                f10 = (1.0f - rVar.Q) / 0.5f;
                                            }
                                            rVar.f10002c = Math.max(0.0f, Math.min(1.0f, f10));
                                        }
                                        float f11 = rVar.f10002c;
                                        int i14 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
                                        if (i14 == 0 || f11 == 0.0f) {
                                            if (i14 == 0) {
                                                int i15 = rVar.e;
                                                int ceil = (((int) Math.ceil(rVar.S / rVar.e)) * i15) + ((int) ((rVar.W.G.B1 / (iVar.getMeasuredWidth() - ((int) (iVar.getMeasuredWidth() / rVar.e)))) * (i15 - 1)));
                                                if (ceil >= lVar.h()) {
                                                    ceil = lVar.h() - 1;
                                                }
                                                rVar.S = ceil;
                                            }
                                            rVar.a();
                                            if (rVar.f10002c == 0.0f) {
                                                rVar.R = !rVar.R;
                                            }
                                            rVar.b(rVar.R);
                                            rVar.P = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                        }
                                        iVar.invalidate();
                                    }
                                } else {
                                    rVar.L = false;
                                    rVar.M = false;
                                    rVar.K = false;
                                    rVar.a();
                                    return false;
                                }
                            } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((rVar.N == motionEvent.getPointerId(0) && rVar.O == motionEvent.getPointerId(1)) || (rVar.N == motionEvent.getPointerId(1) && rVar.O == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && rVar.K) {
                                rVar.M = false;
                                rVar.L = false;
                                rVar.K = false;
                                rVar.a();
                            }
                        } else {
                            if (rVar.L && !rVar.K && motionEvent.getPointerCount() == 2) {
                                rVar.P = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                rVar.Q = 1.0f;
                                rVar.N = motionEvent.getPointerId(0);
                                rVar.O = motionEvent.getPointerId(1);
                                iVar.I0(false);
                                iVar.cancelLongPress();
                                iVar.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                View view = (View) rVar.getParent();
                                rVar.U = (int) ((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - rVar.getX());
                                int y3 = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - rVar.getY());
                                int i16 = rVar.U;
                                Rect rect = rVar.V;
                                rVar.S = -1;
                                int top = y3 - iVar.getTop();
                                for (int i17 = 0; i17 < iVar.getChildCount(); i17++) {
                                    View childAt = iVar.getChildAt(i17);
                                    childAt.getHitRect(rect);
                                    if (rect.contains(i16, top)) {
                                        rVar.S = RecyclerView.S(childAt);
                                        rVar.T = childAt.getTop();
                                    }
                                }
                                rVar.M = true;
                            }
                            if (motionEvent.getActionMasked() == 0 && (motionEvent.getY() - ((View) rVar.getParent()).getY()) - rVar.getY() > 0.0f) {
                                rVar.L = true;
                            }
                        }
                        return rVar.K;
                    }
                    return true;
                }
            }
            return false;
        }
        if ((i10 == 0 || w0(i10)) && getParent() != null) {
            if (!this.f26974q1 || this.f26924a) {
                if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                    if (motionEvent.getActionMasked() == 2 && (this.f26924a || this.f26931c)) {
                        int i18 = -1;
                        int i19 = -1;
                        for (int i20 = 0; i20 < motionEvent.getPointerCount(); i20++) {
                            if (this.e == motionEvent.getPointerId(i20)) {
                                i18 = i20;
                            }
                            if (this.f26941f == motionEvent.getPointerId(i20)) {
                                i19 = i20;
                            }
                        }
                        if (i18 != -1 && i19 != -1) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(i19) - motionEvent.getX(i18), motionEvent.getY(i19) - motionEvent.getY(i18))) / this.h;
                            this.f26964n = hypot2;
                            if (!this.f26924a && (hypot2 > 1.01f || hypot2 < 0.99f)) {
                                this.f26924a = true;
                                if (hypot2 > 1.0f) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                this.f26975r = z10;
                                n1(z10);
                            }
                            if (this.f26924a) {
                                boolean z13 = this.f26975r;
                                if ((z13 && this.f26964n < 1.0f) || (!z13 && this.f26964n > 1.0f)) {
                                    this.f26972p1 = 0.0f;
                                } else {
                                    if (z13) {
                                        f7 = org.telegram.messenger.t.y(2.0f, this.f26964n, 1.0f, 1.0f);
                                    } else {
                                        f7 = (1.0f - this.f26964n) / 0.5f;
                                    }
                                    this.f26972p1 = Math.max(0.0f, Math.min(1.0f, f7));
                                }
                                float f12 = this.f26972p1;
                                if (f12 == 1.0f || f12 == 0.0f) {
                                    if (w0(this.f26977r1)) {
                                        h0Var = t1(this.f26977r1);
                                    } else {
                                        h0Var = this.J;
                                    }
                                    if (this.f26972p1 == 1.0f) {
                                        int i21 = this.f26980s1;
                                        int ceil2 = (((int) Math.ceil(this.f26978s / this.f26980s1)) * i21) + ((int) ((this.B1 / (uu0VarArr[0].h.getMeasuredWidth() - ((int) (uu0VarArr[0].h.getMeasuredWidth() / this.f26980s1)))) * (i21 - 1)));
                                        if (ceil2 >= h0Var.h()) {
                                            ceil2 = h0Var.h() - 1;
                                        }
                                        this.f26978s = ceil2;
                                    }
                                    a0();
                                    if (this.f26972p1 == 0.0f) {
                                        this.f26975r = !this.f26975r;
                                    }
                                    n1(this.f26975r);
                                    this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                uu0VarArr[0].h.invalidate();
                                uu0 uu0Var = uu0VarArr[0];
                                if (uu0Var.F != null) {
                                    uu0Var.invalidate();
                                }
                            }
                        } else {
                            this.f26927b = false;
                            this.f26931c = false;
                            this.f26924a = false;
                            a0();
                            return false;
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.e == motionEvent.getPointerId(0) && this.f26941f == motionEvent.getPointerId(1)) || (this.e == motionEvent.getPointerId(1) && this.f26941f == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.f26924a) {
                        this.f26931c = false;
                        this.f26927b = false;
                        this.f26924a = false;
                        a0();
                    }
                } else {
                    if (this.f26927b && !this.f26924a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.f26964n = 1.0f;
                        this.e = motionEvent.getPointerId(0);
                        this.f26941f = motionEvent.getPointerId(1);
                        uu0VarArr[0].h.I0(false);
                        uu0VarArr[0].h.cancelLongPress();
                        uu0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.f26987w = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - uu0VarArr[0].getX());
                        int y10 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - uu0VarArr[0].getY());
                        int i22 = this.f26987w;
                        this.f26978s = -1;
                        int top2 = y10 - uu0VarArr[0].h.getTop();
                        if (getY() != 0.0f && this.E == 1) {
                            top2 = 0;
                        }
                        for (int i23 = 0; i23 < uu0VarArr[0].h.getChildCount(); i23++) {
                            View childAt2 = uu0VarArr[0].h.getChildAt(i23);
                            Rect rect2 = this.f26990x;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i22, top2)) {
                                uu0VarArr[0].h.getClass();
                                this.f26978s = RecyclerView.S(childAt2);
                                this.v = childAt2.getTop();
                            }
                        }
                        if (this.F1.U() && this.f26978s == -1) {
                            this.f26978s = (int) (((this.f26969o1[w0(uu0VarArr[0].E) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i22 / uu0VarArr[0].h.getMeasuredWidth(), 0.0f))) + uu0VarArr[0].f33471w.L0());
                            this.v = 0;
                        }
                        this.f26931c = true;
                    }
                    if (motionEvent.getActionMasked() == 0 && ((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - uu0VarArr[0].getY() > this.f26934c2) {
                        this.f26927b = true;
                    }
                }
                return this.f26924a;
            }
            return true;
        }
        return false;
    }

    public final void N0(int i10, View view, MessageObject messageObject, int i11) {
        TLRPC.WebPage webPage;
        String str;
        char c10;
        int i12;
        int i13;
        boolean z10;
        if (messageObject != null && !this.f26974q1) {
            at0 at0Var = this.f26928b0;
            if (at0Var == null || !at0Var.f41611f) {
                int i14 = 0;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                i14 = 0;
                String str2 = null;
                di.z6 z6Var = null;
                if (this.E1) {
                    int i15 = 8;
                    if (i11 != 8 || F()) {
                        if (messageObject.getDialogId() == this.l1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        SparseArray[] sparseArrayArr = this.f26929b1;
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            sparseArrayArr[c10].remove(messageObject.getId());
                            if (!messageObject.canDeleteMessage(false, null)) {
                                this.f26933c1--;
                            }
                        } else {
                            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                                sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                                if (!messageObject.canDeleteMessage(false, null)) {
                                    this.f26933c1++;
                                }
                            } else {
                                return;
                            }
                        }
                        K0(sparseArrayArr[0]);
                        if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                            k1(false);
                        } else {
                            i1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                            if (this.f26933c1 == 0) {
                                i12 = 0;
                            } else {
                                i12 = 8;
                            }
                            this.f26965n0.setVisibility(i12);
                            org.telegram.ui.ActionBar.w0 w0Var = this.f26988w0;
                            if (w0Var != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14 && sparseArrayArr[0].size() == 1) {
                                    i13 = 0;
                                } else {
                                    i13 = 8;
                                }
                                w0Var.setVisibility(i13);
                            }
                            org.telegram.ui.ActionBar.w0 w0Var2 = this.f26985v0;
                            if (w0Var2 != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                                    i15 = 0;
                                }
                                w0Var2.setVisibility(i15);
                            }
                            I1();
                        }
                        this.f26936d1 = false;
                        if (view instanceof org.telegram.ui.Cells.o7) {
                            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            o7Var.b(z11, true);
                        } else if (view instanceof org.telegram.ui.Cells.x7) {
                            org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            x7Var.b(0, z10, true);
                        } else if (view instanceof org.telegram.ui.Cells.r7) {
                            org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z12 = true;
                            }
                            r7Var.f(z12, true);
                        } else if (view instanceof org.telegram.ui.Cells.n7) {
                            org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z13 = true;
                            }
                            n7Var.e(z13, true);
                        } else if (view instanceof org.telegram.ui.Cells.d2) {
                            org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z14 = true;
                            }
                            d2Var.c(z14, true);
                        } else if (view instanceof org.telegram.ui.Cells.w7) {
                            org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z15 = true;
                            }
                            w7Var.i(z15, true);
                        }
                    } else {
                        return;
                    }
                } else {
                    gt0 gt0Var = this.f26982t1;
                    qv0[] qv0VarArr = this.f26986v1;
                    org.telegram.ui.ActionBar.r2 r2Var = this.f26992x1;
                    if (i11 == 0) {
                        qv0 qv0Var = qv0VarArr[i11];
                        int i16 = i10 - qv0Var.f32042m;
                        if (i16 >= 0 && i16 < qv0Var.f32033a.size()) {
                            PhotoViewer.v1().N2(null, r2Var, null);
                            PhotoViewer.v1().e2(qv0VarArr[i11].f32033a, i16, this.l1, this.f26939e1, this.F, gt0Var);
                        }
                    } else if (i11 != 2 && i11 != 4) {
                        if (i11 == 5) {
                            PhotoViewer.v1().N2(null, r2Var, null);
                            int indexOf = qv0VarArr[i11].f32033a.indexOf(messageObject);
                            if (indexOf < 0) {
                                PhotoViewer.v1().e2(org.telegram.messenger.t.l(messageObject), 0, 0L, 0L, 0L, gt0Var);
                            } else {
                                PhotoViewer.v1().e2(qv0VarArr[i11].f32033a, indexOf, this.l1, this.f26939e1, this.F, gt0Var);
                            }
                        } else if (i11 == 1) {
                            if (view instanceof org.telegram.ui.Cells.o7) {
                                org.telegram.ui.Cells.o7 o7Var2 = (org.telegram.ui.Cells.o7) view;
                                TLRPC.Document document = messageObject.getDocument();
                                if (o7Var2.G) {
                                    if (messageObject.canPreviewDocument()) {
                                        PhotoViewer.v1().N2(null, r2Var, null);
                                        int indexOf2 = qv0VarArr[i11].f32033a.indexOf(messageObject);
                                        if (indexOf2 < 0) {
                                            PhotoViewer.v1().e2(org.telegram.messenger.t.l(messageObject), 0, 0L, 0L, 0L, gt0Var);
                                            return;
                                        }
                                        PhotoViewer.v1().e2(qv0VarArr[i11].f32033a, indexOf2, this.l1, this.f26939e1, this.F, gt0Var);
                                        return;
                                    }
                                    AndroidUtilities.openDocument(messageObject, r2Var.getParentActivity(), r2Var);
                                } else if (!o7Var2.F) {
                                    MessageObject message = o7Var2.getMessage();
                                    message.putInDownloadsStore = true;
                                    r2Var.getFileLoader().loadFile(document, message, 0, 0);
                                    o7Var2.f(true);
                                } else {
                                    r2Var.getFileLoader().cancelLoadFile(document);
                                    o7Var2.f(true);
                                }
                            }
                        } else if (i11 == 3) {
                            try {
                                if (MessageObject.getMedia(messageObject.messageOwner) != null) {
                                    webPage = MessageObject.getMedia(messageObject.messageOwner).webpage;
                                } else {
                                    webPage = null;
                                }
                                if (webPage != null && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                                    if (webPage.cached_page != null) {
                                        LaunchActivity launchActivity = LaunchActivity.I1;
                                        if (launchActivity == null || launchActivity.P() == null || LaunchActivity.I1.P().l(messageObject) == null) {
                                            r2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                            return;
                                        }
                                        return;
                                    }
                                    String str3 = webPage.embed_url;
                                    if (str3 != null && str3.length() != 0) {
                                        dv.I(r2Var, messageObject, this.f26982t1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                        return;
                                    }
                                    str = webPage.url;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    ArrayList arrayList = ((org.telegram.ui.Cells.r7) view).E;
                                    if (arrayList.size() > 0) {
                                        str2 = ((CharSequence) arrayList.get(0)).toString();
                                    }
                                    str = str2;
                                }
                                if (str != null) {
                                    X0(str);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        } else if (w0(i11)) {
                            yv0 t12 = t1(i11);
                            if (t12 != null) {
                                z6Var = t12.f35173s;
                            }
                            if (z6Var != null) {
                                di.y9 orCreateStoryViewer = r2Var.getOrCreateStoryViewer();
                                Context context = getContext();
                                int id2 = messageObject.getId();
                                di.q7 a2 = di.q7.a(this.m0[0].h);
                                a2.e = new tv(z6Var, 21);
                                if ((r2Var instanceof ProfileActivity) && ((ProfileActivity) r2Var).f36100s1) {
                                    i14 = AndroidUtilities.dp(68.0f);
                                }
                                a2.f9065s += i14;
                                orCreateStoryViewer.D(context, id2, z6Var, a2);
                            } else {
                                return;
                            }
                        }
                    } else if (view instanceof org.telegram.ui.Cells.n7) {
                        ((org.telegram.ui.Cells.n7) view).a();
                    }
                }
                A1();
            }
        }
    }

    public final void O(boolean z10) {
        boolean z11;
        if (this.H != null) {
            int closestTab = getClosestTab();
            boolean z12 = false;
            org.telegram.ui.ActionBar.w0 w0Var = this.f26971p0;
            if (w0Var != null) {
                if (G() && (A0(closestTab) || (closestTab == 11 && u0()))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ((org.telegram.ui.ActionBar.y5) w0Var).Y(z11, z10);
            }
            org.telegram.ui.ActionBar.y5 y5Var = this.I;
            if (y5Var != null) {
                if (G() && !x0() && s0(closestTab)) {
                    z12 = true;
                }
                y5Var.Y(z12, z10);
            }
        }
    }

    public final boolean O0(MessageObject messageObject, View view, int i10, boolean z10) {
        at0 at0Var;
        char c10;
        int i11;
        int i12;
        final TL_stories.StoryItem storyItem;
        iu0 iu0Var;
        di.z6 z6Var;
        if (!this.E1) {
            org.telegram.ui.ActionBar.r2 r2Var = this.f26992x1;
            if (r2Var.getParentActivity() != null && messageObject != null && ((at0Var = this.f26928b0) == null || !at0Var.f41611f)) {
                AndroidUtilities.hideKeyboard(r2Var.getParentActivity().getCurrentFocus());
                long j10 = this.l1;
                int i13 = 8;
                if (z10 && ((E0(getClosestTab()) || getClosestTab() == 8) && !this.E1)) {
                    if (view instanceof org.telegram.ui.Cells.w7) {
                        org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
                        w7Var.k(w7Var.f25652n, w7Var.f25657r, true);
                    }
                    TL_stories.StoryItem storyItem2 = messageObject.storyItem;
                    if (storyItem2 != null) {
                        HashSet hashSet = new HashSet();
                        ArrayList<Integer> arrayList = storyItem2.albums;
                        if (arrayList != null) {
                            hashSet.addAll(arrayList);
                        }
                        boolean E0 = E0(getClosestTab());
                        l80 I = l80.I(r2Var, view);
                        l80 J = I.J();
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.bu0(I, 26), false);
                        J.k();
                        l80.f(J, getStoriesController().B(j10, true), hashSet, true, new kg(this, storyItem2, I, 21), new di.y2(this, hashSet, storyItem2, I, 10));
                        I.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddToAlbum), new hi.o2(I, J, 9), false);
                        I.k();
                        I.c(R.drawable.msg_select, LocaleController.getString(R.string.StoriesAlbumMenuSelect), new ai.h1(this, messageObject, view, i10, 29), false);
                        if (E0) {
                            int q12 = q1(getClosestTab());
                            String w10 = getStoriesController().w(q12, j10);
                            I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new zr0(this, q12, 0), false);
                            storyItem = storyItem2;
                            I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.StoriesAlbumMenuRemoveFromAlbum), new as0(this, q12, storyItem, w10, 0), false);
                        } else {
                            storyItem = storyItem2;
                            if (getClosestTab() == 8 && (iu0Var = this.f26938e0) != null && (z6Var = iu0Var.f35173s) != null) {
                                if (z6Var.m(storyItem.f22267id)) {
                                    I.c(R.drawable.chats_unpin, LocaleController.getString(R.string.StoriesAlbumMenuUnpin), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r1) {
                                                case 0:
                                                    bw0 bw0Var = this;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bw0Var.getContext(), 0, bw0Var.H1);
                                                    alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                    alertDialog$Builder.f22369a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ks0(bw0Var, storyItem));
                                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new rd0(19));
                                                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                                                    e2Var.show();
                                                    e2Var.i();
                                                    return;
                                                case 1:
                                                    bw0 bw0Var2 = this;
                                                    bw0Var2.getClass();
                                                    bw0Var2.Z0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22267id))), false);
                                                    return;
                                                case 2:
                                                    bw0 bw0Var3 = this;
                                                    bw0Var3.getClass();
                                                    bw0Var3.Z0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22267id))), true);
                                                    return;
                                                default:
                                                    bw0.n(this, storyItem);
                                                    return;
                                            }
                                        }
                                    }, false);
                                } else {
                                    I.c(R.drawable.chats_pin, LocaleController.getString(R.string.StoriesAlbumMenuPin), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r1) {
                                                case 0:
                                                    bw0 bw0Var = this;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bw0Var.getContext(), 0, bw0Var.H1);
                                                    alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                    alertDialog$Builder.f22369a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ks0(bw0Var, storyItem));
                                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new rd0(19));
                                                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                                                    e2Var.show();
                                                    e2Var.i();
                                                    return;
                                                case 1:
                                                    bw0 bw0Var2 = this;
                                                    bw0Var2.getClass();
                                                    bw0Var2.Z0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22267id))), false);
                                                    return;
                                                case 2:
                                                    bw0 bw0Var3 = this;
                                                    bw0Var3.getClass();
                                                    bw0Var3.Z0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22267id))), true);
                                                    return;
                                                default:
                                                    bw0.n(this, storyItem);
                                                    return;
                                            }
                                        }
                                    }, false);
                                }
                            }
                            I.c(R.drawable.msg_archive, LocaleController.getString(R.string.StoriesAlbumMenuArchive), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r1) {
                                        case 0:
                                            bw0 bw0Var = this;
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bw0Var.getContext(), 0, bw0Var.H1);
                                            alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                            alertDialog$Builder.f22369a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ks0(bw0Var, storyItem));
                                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new rd0(19));
                                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                                            e2Var.show();
                                            e2Var.i();
                                            return;
                                        case 1:
                                            bw0 bw0Var2 = this;
                                            bw0Var2.getClass();
                                            bw0Var2.Z0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22267id))), false);
                                            return;
                                        case 2:
                                            bw0 bw0Var3 = this;
                                            bw0Var3.getClass();
                                            bw0Var3.Z0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22267id))), true);
                                            return;
                                        default:
                                            bw0.n(this, storyItem);
                                            return;
                                    }
                                }
                            }, false);
                        }
                        I.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r1) {
                                    case 0:
                                        bw0 bw0Var = this;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bw0Var.getContext(), 0, bw0Var.H1);
                                        alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                        alertDialog$Builder.f22369a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ks0(bw0Var, storyItem));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new rd0(19));
                                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                                        e2Var.show();
                                        e2Var.i();
                                        return;
                                    case 1:
                                        bw0 bw0Var2 = this;
                                        bw0Var2.getClass();
                                        bw0Var2.Z0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22267id))), false);
                                        return;
                                    case 2:
                                        bw0 bw0Var3 = this;
                                        bw0Var3.getClass();
                                        bw0Var3.Z0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22267id))), true);
                                        return;
                                    default:
                                        bw0.n(this, storyItem);
                                        return;
                                }
                            }
                        }, true);
                        I.f30150i = 3;
                        I.f30170u = true;
                        I.v = true;
                        I.L = true;
                        I.M = 3;
                        Point point = AndroidUtilities.displaySize;
                        Point point2 = AndroidUtilities.displaySize;
                        int min = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point2.x, point2.y) * 0.4333f) * 3.0f) / 4.0f));
                        I.N = min;
                        I.O = (min * 4) / 3;
                        I.f30169t = true;
                        I.P = true;
                        I.W = true;
                        I.Z();
                        return true;
                    }
                } else {
                    if (messageObject.getDialogId() == j10) {
                        c10 = 0;
                    } else {
                        c10 = 1;
                    }
                    SparseArray[] sparseArrayArr = this.f26929b1;
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.f26933c1++;
                    }
                    if (this.f26933c1 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    this.f26965n0.setVisibility(i11);
                    org.telegram.ui.ActionBar.w0 w0Var = this.f26988w0;
                    if (w0Var != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        } else {
                            i12 = 8;
                        }
                        w0Var.setVisibility(i12);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.f26985v0;
                    if (w0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i13 = 0;
                        }
                        w0Var2.setVisibility(i13);
                    }
                    i1(1, false);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    int i14 = 0;
                    while (true) {
                        ArrayList arrayList3 = this.P0;
                        if (i14 >= arrayList3.size()) {
                            break;
                        }
                        View view2 = (View) arrayList3.get(i14);
                        AndroidUtilities.clearDrawableAnimation(view2);
                        arrayList2.add(ObjectAnimator.ofFloat(view2, View.SCALE_Y, 0.1f, 1.0f));
                        i14++;
                    }
                    animatorSet.playTogether(arrayList2);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    this.f26936d1 = false;
                    if (view instanceof org.telegram.ui.Cells.o7) {
                        ((org.telegram.ui.Cells.o7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.x7) {
                        ((org.telegram.ui.Cells.x7) view).b(i10, true, true);
                    } else if (view instanceof org.telegram.ui.Cells.r7) {
                        ((org.telegram.ui.Cells.r7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.n7) {
                        ((org.telegram.ui.Cells.n7) view).e(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.d2) {
                        ((org.telegram.ui.Cells.d2) view).c(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.w7) {
                        ((org.telegram.ui.Cells.w7) view).i(true, true);
                    }
                    if (!this.E1) {
                        k1(true);
                    }
                    K0(sparseArrayArr[0]);
                    A1();
                    return true;
                }
            }
        }
        return false;
    }

    public final void P() {
        char c10;
        char c11;
        float abs;
        View childAt;
        int R;
        float f7;
        float measuredWidth;
        uu0[] uu0VarArr = this.m0;
        uu0 uu0Var = uu0VarArr[0];
        if (uu0Var != null && uu0VarArr[1] != null) {
            float f10 = 0.0f;
            at0 at0Var = this.f26928b0;
            if (at0Var != null) {
                if (w0(uu0Var.E) && uu0VarArr[0].E != 9) {
                    c10 = 1;
                } else {
                    c10 = 0;
                }
                if (uu0VarArr[1].getVisibility() == 0) {
                    if (w0(uu0VarArr[1].E) && uu0VarArr[1].E != 9) {
                        c11 = 1;
                    } else {
                        c11 = 0;
                    }
                } else {
                    c11 = c10;
                }
                if (c10 == c11) {
                    if (c10 != 0) {
                        abs = 1.0f;
                    } else {
                        abs = 0.0f;
                    }
                    if (c10 != 0) {
                        measuredWidth = 0.0f;
                    } else {
                        measuredWidth = uu0VarArr[0].getMeasuredWidth();
                    }
                    at0Var.setTranslationX(measuredWidth);
                } else {
                    at0Var.setTranslationX(uu0VarArr[c10 ^ 1].getTranslationX());
                    abs = 1.0f - (Math.abs(at0Var.getTranslationX()) / at0Var.getMeasuredWidth());
                }
                float f11 = 0.0f;
                for (int i10 = 0; i10 < uu0VarArr.length; i10++) {
                    if (uu0VarArr[i10].getVisibility() == 0) {
                        et0 et0Var = uu0VarArr[i10].h;
                        if (et0Var.getChildCount() == 0) {
                            childAt = null;
                        } else {
                            childAt = et0Var.getChildAt(0);
                        }
                        if (childAt == null) {
                            R = -1;
                        } else {
                            R = RecyclerView.R(childAt);
                        }
                        if (R == 0) {
                            f7 = childAt.getY() - et0Var.getPaddingTop();
                        } else if (et0Var.getChildCount() == 0) {
                            f7 = 0.0f;
                        } else {
                            f7 = -AndroidUtilities.dp(48.0f);
                        }
                        f11 += Utilities.clamp01(1.0f - (uu0VarArr[i10].getTranslationX() / uu0VarArr[i10].getMeasuredWidth())) * f7;
                    }
                }
                float clamp01 = Utilities.clamp01(1.0f - ((-f11) / AndroidUtilities.dpf2(48.0f)));
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
                at0Var.setAlpha(clamp01);
                at0Var.setScaleX(lerp);
                at0Var.setScaleY(lerp);
                at0Var.setTranslationY(this.N1 + f11);
                f10 = abs;
            }
            R();
            if (this.X1 != f10) {
                this.X1 = f10;
                invalidate();
            }
        }
    }

    public boolean P0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return false;
    }

    public final boolean Q() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bw0.Q():boolean");
    }

    public final void Q0(float f7) {
        uu0 uu0Var;
        int i10;
        int i11;
        uu0 uu0Var2;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        uu0[] uu0VarArr = this.m0;
        if (i12 != 0 || uu0VarArr[1].getVisibility() == 0) {
            if (this.f26955j1) {
                uu0VarArr[0].setTranslationX((-f7) * uu0Var2.getMeasuredWidth());
                uu0VarArr[1].setTranslationX(uu0VarArr[0].getMeasuredWidth() - (uu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                uu0VarArr[0].setTranslationX(uu0Var.getMeasuredWidth() * f7);
                uu0VarArr[1].setTranslationX((uu0VarArr[0].getMeasuredWidth() * f7) - uu0VarArr[0].getMeasuredWidth());
            }
            T0(getTabProgress());
            float h02 = h0(f7);
            this.f26976r0 = h02;
            int i13 = 4;
            if (h02 != 0.0f && G() && !x0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            this.f26981t0.setVisibility(i10);
            org.telegram.ui.ActionBar.w0 w0Var = this.f26971p0;
            if (w0Var != null && !G()) {
                if (D0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                setSearchItemVisibility(i11);
                this.f26973q0 = 0.0f;
            } else {
                this.f26973q0 = i0(f7);
                H1();
            }
            C1(false);
            if (i12 == 0) {
                uu0 uu0Var3 = uu0VarArr[0];
                uu0VarArr[0] = uu0VarArr[1];
                uu0VarArr[1] = uu0Var3;
                uu0Var3.setVisibility(8);
                if (w0Var != null && this.f26996z0 == 2) {
                    if (D0()) {
                        i13 = 8;
                    }
                    setSearchItemVisibility(i13);
                }
                this.f26996z0 = 0;
                o1();
            }
        }
    }

    public final void R() {
        ws wsVar = this.R0;
        if (wsVar != null) {
            at0 at0Var = this.f26928b0;
            float f7 = 0.0f;
            if (at0Var != null) {
                f7 = 0.0f + (at0Var.getVisibilityFactor() * AndroidUtilities.dp(38.0f) * (1.0f - Math.abs(at0Var.getTranslationX() / at0Var.getMeasuredWidth())));
            }
            wsVar.setTranslationY(this.N1 + f7);
        }
    }

    public final boolean S(boolean z10) {
        SparseArray[] sparseArrayArr;
        if (!this.E1) {
            return false;
        }
        int i10 = 1;
        while (true) {
            sparseArrayArr = this.f26929b1;
            if (i10 < 0) {
                break;
            }
            sparseArrayArr[i10].clear();
            i10--;
        }
        this.f26933c1 = 0;
        K0(sparseArrayArr[0]);
        vs0 vs0Var = this.W;
        if (vs0Var != null) {
            vs0Var.h();
            vs0Var.j();
        }
        k1(false);
        F1(z10);
        mv0 mv0Var = this.T;
        if (mv0Var != null) {
            mv0Var.f30641w.clear();
        }
        return true;
    }

    public void S0() {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (!D0() && !x0()) {
            z10 = false;
        } else {
            z10 = true;
        }
        wv0 wv0Var = this.f26945g0.f35174w;
        if (wv0Var != null) {
            if (z10 && getClosestTab() == 9) {
                z13 = true;
            } else {
                z13 = false;
            }
            wv0Var.b(z13);
        }
        wv0 wv0Var2 = this.f26938e0.f35174w;
        if (wv0Var2 != null) {
            if (z10 && getClosestTab() == 8) {
                z12 = true;
            } else {
                z12 = false;
            }
            wv0Var2.b(z12);
        }
        for (aw0 aw0Var : this.f26956j2.values()) {
            zv0 zv0Var = aw0Var.f26684c;
            if (zv0Var.f35173s != null) {
                wv0 wv0Var3 = zv0Var.f35174w;
                if (z10 && getClosestTab() == aw0Var.f26682a) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                wv0Var3.b(z11);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.f26971p0;
        if (w0Var != null) {
            st0 st0Var = this.L0;
            if (st0Var != null && st0Var.a() && getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            w0Var.setSearchFieldHint(LocaleController.getString(i10));
        }
        P();
        O(true);
    }

    public final org.telegram.ui.ActionBar.w0 T(Context context, int i10, int i11, String str) {
        org.telegram.ui.ActionBar.w0 w0Var;
        org.telegram.ui.ActionBar.r5 r5Var = this.H;
        if (r5Var != null) {
            w0Var = r5Var.h().a(i10, i11);
        } else {
            int i12 = org.telegram.ui.ActionBar.y6.f23770z8;
            int p02 = p0(i12);
            int i13 = org.telegram.ui.ActionBar.y6.f23751y8;
            org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(context, null, p02, p0(i13), false, null);
            w0Var2.setIcon(i11);
            w0Var2.setDuplicateParentStateEnabled(false);
            this.D0.addView(w0Var2, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
            this.P0.add(w0Var2);
            bk0 iconView = w0Var2.getIconView();
            org.telegram.ui.ActionBar.u6 u6Var = this.H1;
            if (iconView != null) {
                org.telegram.ui.ActionBar.f7.t(w0Var2.getIconView(), i13, u6Var, PorterDuff.Mode.SRC_IN);
            }
            if (w0Var2.getBackground() != null) {
                Drawable background = w0Var2.getBackground();
                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
                w0Var2.setBackground(background);
                org.telegram.ui.ActionBar.f7.k(w0Var2, background, null, N, u6Var);
            }
            w0Var = w0Var2;
        }
        w0Var.setContentDescription(str);
        w0Var.setOnClickListener(new ai.w(this, i10, 19));
        return w0Var;
    }

    public void T0(float f7) {
        L0();
    }

    public final void U0(org.telegram.ui.ActionBar.r2 r2Var, long j10, int i10) {
        new org.telegram.ui.s61(r2Var, j10, this.f26969o1[1], new bi.f4(this, j10, i10)).show();
    }

    public boolean V() {
        return this instanceof j40;
    }

    public final void V0(org.telegram.ui.ActionBar.r2 r2Var, long j10, int i10) {
        g5.u0(r2Var, LocaleController.getString(R.string.Delete), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesAlbumMenuDeleteAlbumAsk, getStoriesController().w(i10, j10))), LocaleController.getString(R.string.Delete), true, new bi.ga(this, j10, i10, 8));
    }

    public final boolean W(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x9 = (-view.getX()) - getX();
        uu0[] uu0VarArr = this.m0;
        motionEvent.offsetLocation(x9 - uu0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - uu0VarArr[0].getY()) - uu0VarArr[0].h.getFastScroll().getY());
        return uu0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public final void W0(org.telegram.ui.ActionBar.r2 r2Var, long j10, int i10) {
        String w10 = getStoriesController().w(i10, j10);
        Context context = r2Var.getContext();
        org.telegram.ui.ActionBar.u6 resourceProvider = r2Var.getResourceProvider();
        j2.c cVar = new j2.c(this, j10, i10, 6);
        Pattern pattern = g5.f28387a;
        g5.Q(context, r2Var, LocaleController.getString(R.string.StoriesAlbumRename), LocaleController.getString(R.string.StoriesAlbumRenameHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), w10, 12, LocaleController.getString(R.string.Rename), resourceProvider, cVar);
    }

    public final boolean X(int i10) {
        qv0[] qv0VarArr = this.f26989w1.f33161n;
        if (qv0VarArr == null) {
            return false;
        }
        qv0[] qv0VarArr2 = this.f26986v1;
        if (i10 == 0) {
            qv0 qv0Var = qv0VarArr2[i10];
            if (!qv0Var.h) {
                int[] iArr = qv0Var.f32036f;
                int[] iArr2 = qv0VarArr[i10].f32036f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = qv0VarArr2[i10].f32036f;
            int[] iArr4 = qv0VarArr[i10].f32036f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        qv0VarArr2[i10].f32033a.addAll(qv0VarArr[i10].f32033a);
        qv0VarArr2[i10].f32035c.addAll(qv0VarArr[i10].f32035c);
        for (Map.Entry entry : qv0VarArr[i10].d.entrySet()) {
            qv0VarArr2[i10].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i11 = 0; i11 < 2; i11++) {
            qv0VarArr2[i10].f32034b[i11] = qv0VarArr[i10].f32034b[i11].clone();
            qv0 qv0Var2 = qv0VarArr2[i10];
            int[] iArr5 = qv0Var2.f32039j;
            qv0 qv0Var3 = qv0VarArr[i10];
            iArr5[i11] = qv0Var3.f32039j[i11];
            qv0Var2.f32038i[i11] = qv0Var3.f32038i[i11];
        }
        qv0VarArr2[i10].e.addAll(qv0VarArr[i10].e);
        return !qv0VarArr[i10].f32033a.isEmpty();
    }

    public final void X0(String str) {
        boolean shouldShowUrlInAlert = AndroidUtilities.shouldShowUrlInAlert(str);
        org.telegram.ui.ActionBar.r2 r2Var = this.f26992x1;
        if (shouldShowUrlInAlert) {
            g5.p0(r2Var, str, true, true);
        } else {
            qf.d.r(r2Var.getParentActivity(), str);
        }
    }

    public final boolean Y(int r28, org.telegram.ui.Components.zu0 r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bw0.Y(int, org.telegram.ui.Components.zu0):boolean");
    }

    public int Y0() {
        return -1;
    }

    public final void Z(int i10, nm0 nm0Var, boolean z10) {
        ArrayList arrayList = this.f26986v1[i10].e;
        int L0 = ((s4.c0) nm0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            av0 av0Var = null;
            if (arrayList != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (L0 <= ((av0) arrayList.get(i11)).f26671b) {
                        av0Var = (av0) arrayList.get(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                if (av0Var == null) {
                    av0Var = (av0) ic.a.g(1, arrayList);
                }
            }
            if (av0Var != null) {
                G0(i10, av0Var.d, av0Var.f26671b + 1, z10);
            }
        }
    }

    public final void Z0(ArrayList arrayList, boolean z10) {
        boolean z11;
        boolean z12;
        iu0 iu0Var = this.f26938e0;
        if (iu0Var != null && iu0Var.f35173s != null) {
            org.telegram.ui.ActionBar.r2 r2Var = this.f26992x1;
            if (z10 && arrayList.size() > r2Var.getMessagesController().storiesPinnedToTopCountMax) {
                wc.b0(r2Var).R(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", r2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
                return;
            }
            di.z6 z6Var = iu0Var.f35173s;
            int i10 = z6Var.f9489c;
            ArrayList arrayList2 = z6Var.f9491g;
            ArrayList arrayList3 = new ArrayList(arrayList2);
            boolean z13 = true;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Integer num = (Integer) arrayList.get(size);
                num.getClass();
                if (z10 && !arrayList3.contains(num)) {
                    arrayList3.add(0, num);
                } else if (!z10 && arrayList3.contains(num)) {
                    arrayList3.remove(num);
                }
            }
            if (arrayList3.size() > MessagesController.getInstance(i10).storiesPinnedToTopCountMax) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                if (arrayList2.size() != arrayList3.size()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList2.size()) {
                            break;
                        } else if (arrayList2.get(i11) != arrayList3.get(i11)) {
                            z12 = true;
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                if (z12) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList3);
                    z6Var.d(true);
                    TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                    tL_togglePinnedToTop.f22280id.addAll(arrayList2);
                    tL_togglePinnedToTop.peer = MessagesController.getInstance(i10).getInputPeer(z6Var.d);
                    ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new di.d6(2));
                }
                z13 = z11;
            }
            if (z13) {
                wc.b0(r2Var).R(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", r2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
            } else if (z10) {
                wc.b0(r2Var).M(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinned", arrayList.size(), new Object[0])), LocaleController.formatPluralString("StoriesPinnedText", arrayList.size(), new Object[0]), R.raw.ic_pin).j();
            } else {
                wc.b0(r2Var).R(R.raw.ic_unpin, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesUnpinned", arrayList.size(), new Object[0]))).j();
            }
        }
    }

    public final void a0() {
        uu0[] uu0VarArr;
        uu0 uu0Var;
        boolean z10;
        int i10;
        s4.h0 adapter;
        if (this.f26974q1) {
            int i11 = 0;
            while (true) {
                uu0VarArr = this.m0;
                if (i11 < uu0VarArr.length) {
                    uu0Var = uu0VarArr[i11];
                    if (uu0Var.E == this.f26977r1) {
                        break;
                    }
                    i11++;
                } else {
                    uu0Var = null;
                    break;
                }
            }
            if (uu0Var != null) {
                boolean w02 = w0(uu0Var.E);
                float f7 = this.f26972p1;
                float f10 = 1.0f;
                int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                qv0[] qv0VarArr = this.f26986v1;
                if (i12 == 0) {
                    this.f26974q1 = false;
                    int i13 = this.f26980s1;
                    int[] iArr = this.f26969o1;
                    iArr[w02 ? 1 : 0] = i13;
                    if (!w02) {
                        SharedConfig.setMediaColumnsCount(i13);
                    } else if (j0(uu0Var.E) >= 5) {
                        SharedConfig.setStoriesColumnsCount(this.f26980s1);
                    }
                    for (int i14 = 0; i14 < uu0VarArr.length; i14++) {
                        uu0 uu0Var2 = uu0VarArr[i14];
                        if (uu0Var2 != null && uu0Var2.h != null && (((i10 = uu0Var2.E) == 0 || w0(i10)) && (adapter = uu0VarArr[i14].h.getAdapter()) != null)) {
                            int h = adapter.h();
                            if (i14 == 0) {
                                qv0VarArr[0].g(false);
                            }
                            uu0VarArr[i14].f33468n.setVisibility(8);
                            uu0VarArr[i14].f33471w.z1(iArr[w02 ? 1 : 0]);
                            uu0VarArr[i14].h.a0();
                            uu0VarArr[i14].h.invalidate();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(uu0VarArr[i14].h);
                            } else {
                                adapter.l();
                            }
                        }
                    }
                    if (this.f26978s >= 0) {
                        for (int i15 = 0; i15 < uu0VarArr.length; i15++) {
                            uu0 uu0Var3 = uu0VarArr[i15];
                            if (uu0Var3.E == this.f26977r1) {
                                View m10 = uu0Var3.f33469r.m(this.f26978s);
                                if (m10 != null) {
                                    this.v = m10.getTop();
                                }
                                uu0 uu0Var4 = uu0VarArr[i15];
                                uu0Var4.f33471w.h1(this.f26978s, (-uu0Var4.h.getPaddingTop()) + this.v);
                            }
                        }
                        return;
                    }
                    d1();
                } else if (f7 == 0.0f) {
                    this.f26974q1 = false;
                    if (this.f26977r1 == 0) {
                        qv0VarArr[0].g(false);
                    }
                    uu0Var.f33468n.setVisibility(8);
                    uu0Var.h.invalidate();
                } else {
                    if (f7 > 0.2f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f10);
                    ofFloat.addUpdateListener(new ut0(this, uu0Var, 0));
                    ofFloat.addListener(new org.telegram.ui.zi(this, z10, w02 ? 1 : 0, uu0Var));
                    ofFloat.setInterpolator(ds.f27530f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                }
            }
        }
    }

    public final boolean a1(MotionEvent motionEvent, boolean z10) {
        int i10;
        uu0 uu0Var;
        vs0 vs0Var;
        int i11;
        int i12;
        int closestTab = getClosestTab();
        vt0 vt0Var = this.K0;
        SparseIntArray sparseIntArray = vt0Var.O;
        int i13 = vt0Var.f26302n;
        int i14 = -1;
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i15 = sparseIntArray.get(i13 + i10, -1);
        at0 at0Var = this.f26928b0;
        if (at0Var != null) {
            if (!E0(closestTab) && closestTab != 8) {
                if (E0(i15) || i15 == 8) {
                    i14 = at0Var.getCurrentAlbumId();
                }
            } else {
                u91 u91Var = at0Var.f41609b;
                SparseIntArray sparseIntArray2 = u91Var.f33299b0;
                int i16 = u91Var.F;
                if (z10) {
                    i12 = 1;
                } else {
                    i12 = -1;
                }
                i14 = sparseIntArray2.get(i16 + i12, -1);
            }
            if (i14 == 0) {
                i15 = 8;
            } else if (i14 > 0) {
                i15 = r1(i14).f26682a;
            }
        }
        if (i15 >= 0) {
            if (this.f26971p0 != null && !G()) {
                if (D0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                setSearchItemVisibility(i11);
                this.f26973q0 = 0.0f;
            } else {
                this.f26973q0 = i0(0.0f);
                G1(0.0f);
            }
            if ((!this.X0 || getSelectedTab() != 11) && (!F() || !this.E1 || (getClosestTab() != 8 && !E0(getClosestTab())))) {
                uu0[] uu0VarArr = this.m0;
                uu0 uu0Var2 = uu0VarArr[0];
                if (uu0Var2 != null && uu0Var2.E == 13 && (vs0Var = this.W) != null) {
                    ei.a aVar = vs0Var.f10018n;
                    if (!z10) {
                    }
                }
                uu0 uu0Var3 = uu0VarArr[0];
                ws0 ws0Var = this.f26925a0;
                if (uu0Var3 != null && uu0Var3.E == 14 && ws0Var != null) {
                    zh.v1 v1Var = ws0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.E1 || (uu0Var = uu0VarArr[0]) == null || uu0Var.E != 13) && ((ws0Var == null || !ws0Var.g()) && (at0Var == null || !at0Var.f41611f))) {
                    C1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    t0();
                    this.A1 = false;
                    this.f26997z1 = true;
                    this.B1 = (int) motionEvent.getX();
                    setHeaderEnabled(false);
                    vt0Var.setEnabled(false);
                    uu0 uu0Var4 = uu0VarArr[1];
                    uu0Var4.E = i15;
                    uu0Var4.setVisibility(0);
                    this.f26955j1 = z10;
                    v1(true);
                    if (z10) {
                        uu0VarArr[1].setTranslationX(uu0VarArr[0].getMeasuredWidth());
                    } else {
                        uu0VarArr[1].setTranslationX(-uu0VarArr[0].getMeasuredWidth());
                    }
                    T0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Lh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23357d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Jh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Kh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23768z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ih));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23749y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23521m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23685uh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23377e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23358d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23733x7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23656t7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23713w7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23492kd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23718wc));
    }

    @Override
    public final boolean b() {
        return false;
    }

    public final void b0(int i10) {
        ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i10 == 0) {
            if (!AndroidUtilities.isTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 2) {
                this.C0.setTextSize(18);
            } else {
                this.C0.setTextSize(20);
            }
        }
        if (i10 == 0) {
            this.J.l();
        }
    }

    public final String c0(boolean z10) {
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        vs0 vs0Var;
        if (!y0()) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        if (z10 && (vs0Var = this.W) != null) {
            return vs0Var.getBotPreviewsSubtitle();
        }
        iu0 iu0Var = this.f26938e0;
        if (iu0Var != null && iu0Var.f35173s != null) {
            i10 = 0;
            i11 = 0;
            for (int i12 = 0; i12 < iu0Var.f35173s.f9492i.size(); i12++) {
                MessageObject messageObject = (MessageObject) iu0Var.f35173s.f9492i.get(i12);
                TL_stories.StoryItem storyItem = messageObject.storyItem;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    if (MessageObject.isVideoDocument(messageMedia.document)) {
                        i11++;
                    } else if (messageObject.storyItem.media.photo != null) {
                        i10++;
                    }
                }
            }
        } else {
            i10 = 0;
            i11 = 0;
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

    public final void c1(s4.h0 h0Var) {
        if (h0Var instanceof vv0) {
            ArrayList arrayList = this.G0;
            ArrayList arrayList2 = this.H0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        } else if (h0Var == this.O) {
            ArrayList arrayList3 = this.I0;
            ArrayList arrayList4 = this.J0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
        } else {
            jv0 jv0Var = this.P;
            if (h0Var == jv0Var) {
                jv0Var.f29773r = null;
            }
        }
    }

    public final uu0 d0(int i10) {
        int i11 = 0;
        while (true) {
            uu0[] uu0VarArr = this.m0;
            if (i11 < uu0VarArr.length) {
                uu0 uu0Var = uu0VarArr[i11];
                if (uu0Var != null && uu0Var.E == i10) {
                    return uu0Var;
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    public final void d1() {
        int i10;
        int i11 = 0;
        while (true) {
            uu0[] uu0VarArr = this.m0;
            if (i11 < uu0VarArr.length) {
                et0 et0Var = uu0VarArr[i11].h;
                if (et0Var != null) {
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < et0Var.getChildCount(); i14++) {
                        View childAt = et0Var.getChildAt(i14);
                        if (childAt instanceof org.telegram.ui.Cells.w7) {
                            org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) childAt;
                            int messageId = w7Var.getMessageId();
                            i13 = w7Var.getTop();
                            i12 = messageId;
                        }
                        if (childAt instanceof org.telegram.ui.Cells.o7) {
                            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt;
                            int id2 = o7Var.getMessage().getId();
                            i13 = o7Var.getTop();
                            i12 = id2;
                        }
                        if (childAt instanceof org.telegram.ui.Cells.n7) {
                            org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) childAt;
                            i12 = n7Var.getMessage().getId();
                            i13 = n7Var.getTop();
                        }
                        if (i12 != 0) {
                            break;
                        }
                    }
                    if (i12 != 0) {
                        int i15 = uu0VarArr[i11].E;
                        int i16 = -1;
                        if (w0(i15)) {
                            yv0 t12 = t1(i15);
                            if (t12 != null && t12.f35173s != null) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= t12.f35173s.f9492i.size()) {
                                        break;
                                    } else if (i12 == ((MessageObject) t12.f35173s.f9492i.get(i17)).getId()) {
                                        i16 = i17;
                                        break;
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                            i10 = i16;
                        } else if (i15 >= 0) {
                            qv0[] qv0VarArr = this.f26986v1;
                            if (i15 < qv0VarArr.length) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= qv0VarArr[i15].f32033a.size()) {
                                        break;
                                    } else if (i12 == ((MessageObject) qv0VarArr[i15].f32033a.get(i18)).getId()) {
                                        i16 = i18;
                                        break;
                                    } else {
                                        i18++;
                                    }
                                }
                                i10 = qv0VarArr[i15].f32042m + i16;
                            }
                        }
                        if (i16 >= 0) {
                            ((s4.c0) et0Var.getLayoutManager()).h1(i10, (-uu0VarArr[i11].h.getPaddingTop()) + i13);
                            if (this.f26974q1) {
                                uu0 uu0Var = uu0VarArr[i11];
                                uu0Var.f33469r.h1(i10, (-uu0Var.h.getPaddingTop()) + i13);
                            }
                        }
                    }
                }
                i11++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r42, int r43, java.lang.Object... r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bw0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        vt0 vt0Var = this.K0;
        if (vt0Var != null) {
            canvas.save();
            canvas.translate(vt0Var.getX(), vt0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        qt0 qt0Var = this.T0;
        if (qt0Var != null) {
            int i10 = qt0Var.U;
            if ((i10 == 3 || i10 == 1) && this.R0 == null) {
                canvas.save();
                canvas.translate(qt0Var.getX(), qt0Var.getY());
                qt0Var.setDrawOverlay(true);
                qt0Var.draw(canvas);
                qt0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i10;
        if (this.f26930b2 && (view instanceof uu0) && this.f26944f2 < this.f26937d2) {
            canvas.save();
            canvas.clipRect(0, -this.f26944f2, getWidth(), getHeight() + this.f26940e2);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        } else if (view == this.T0 && this.R0 == null) {
            canvas.save();
            uu0[] uu0VarArr = this.m0;
            float top = uu0VarArr[0].getTop();
            at0 at0Var = this.f26928b0;
            if (at0Var != null && ((i10 = uu0VarArr[0].E) == 8 || E0(i10))) {
                top -= at0Var.getVisualHeight();
            }
            canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + AndroidUtilities.dp(12.0f));
            boolean drawChild2 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild2;
        } else {
            return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public final void e(org.telegram.ui.Cells.p2 p2Var) {
        int i10;
        org.telegram.ui.ActionBar.r2 r2Var = this.f26992x1;
        if (r2Var != null && r2Var.getMessagesController().getStoriesController().K(p2Var.getDialogId())) {
            r2Var.getOrCreateStoryViewer().getClass();
            di.y9 orCreateStoryViewer = r2Var.getOrCreateStoryViewer();
            Context context = r2Var.getContext();
            long dialogId = p2Var.getDialogId();
            di.q7 a2 = di.q7.a((nm0) p2Var.getParent());
            if ((r2Var instanceof ProfileActivity) && ((ProfileActivity) r2Var).f36100s1) {
                i10 = AndroidUtilities.dp(68.0f);
            } else {
                i10 = 0;
            }
            a2.f9065s += i10;
            orCreateStoryViewer.E(context, dialogId, a2);
        }
    }

    public final int e0(int i10, int i11, boolean z10) {
        int i12;
        int i13 = 1;
        if (!z10) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        int i14 = i11 + i12;
        if (i14 > 6) {
            if (!z10) {
                i14 = 9;
            } else {
                i14 = 6;
            }
        }
        return Utilities.clamp(i14, 9, (this.f26962m1 && i10 == 1) ? 2 : 2);
    }

    public final void e1(int i10) {
        vt0 vt0Var;
        if (!this.O1 && (vt0Var = this.K0) != null) {
            vt0Var.g(null, i10, vt0Var.P.get(i10));
        }
    }

    public final int f0(boolean z10) {
        int i10;
        int i11 = this.a2 + this.f26940e2;
        if (z10) {
            i10 = AndroidUtilities.dp(52.0f);
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public final void f1(float f7, int i10) {
        int i11;
        vt0 vt0Var = this.K0;
        if (vt0Var != null) {
            if (E0(i10)) {
                i11 = 8;
            } else {
                i11 = i10;
            }
            vt0Var.i(f7, i11);
        }
        at0 at0Var = this.f26928b0;
        if (at0Var != null) {
            u91 u91Var = at0Var.f41609b;
            if (E0(i10)) {
                u91Var.f(f7, q1(i10));
            } else if (i10 == 8) {
                u91Var.f(f7, 0);
            }
        }
    }

    public final int g0(int i10) {
        int i11;
        int k02 = k0(i10) + AndroidUtilities.dp(54.0f) + this.f26934c2 + this.f26937d2 + this.f26963m2;
        if (i10 == 9) {
            i11 = AndroidUtilities.dp(64.0f);
        } else {
            i11 = 0;
        }
        return k02 + i11;
    }

    public final void g1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i10 = 0;
        while (true) {
            uu0[] uu0VarArr = this.m0;
            if (i10 < uu0VarArr.length) {
                uu0 uu0Var = uu0VarArr[i10];
                if (uu0Var.E != 7 || uu0Var.h.getAdapter() == null || uu0VarArr[i10].h.getAdapter().h() == 0 || this.f26992x1.getMessagesController().getStoriesController().f8635j.size() <= 0) {
                    i10++;
                } else {
                    return;
                }
            } else {
                if (this.F == 0) {
                    lu0 lu0Var = this.f26932c0;
                    lu0Var.d = chatFull;
                    lu0Var.e = arrayList;
                }
                J1(true);
                for (int i11 = 0; i11 < uu0VarArr.length; i11++) {
                    uu0 uu0Var2 = uu0VarArr[i11];
                    if (uu0Var2.E == 7 && uu0Var2.h.getAdapter() != null) {
                        AndroidUtilities.notifyDataSetChanged(uu0VarArr[i11].h);
                    }
                }
                return;
            }
        }
    }

    public SparseArray<MessageObject> getActionModeSelected() {
        return this.f26929b1[0];
    }

    public float getBottomButtonStoriesVisibility() {
        uu0 uu0Var;
        uu0 uu0Var2;
        boolean z10;
        boolean z11;
        di.z6 z6Var;
        di.z6 z6Var2;
        float f7 = 1.0f;
        uu0[] uu0VarArr = this.m0;
        if (uu0VarArr == null || (uu0Var = uu0VarArr[0]) == null || (uu0Var2 = uu0VarArr[1]) == null || uu0Var.v == null || uu0Var2.v == null) {
            return 1.0f;
        }
        int i10 = uu0Var.E;
        int i11 = uu0Var2.E;
        if (!E0(i10) && i10 != 8) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!E0(i11) && i11 != 8) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z10 && !z11) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - uu0VarArr[0].v.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - uu0VarArr[1].v.getVisibilityFactor();
        yv0 t12 = t1(uu0VarArr[0].E);
        if (i10 == 8 || (t12 != null && (z6Var2 = t12.f35173s) != null && z6Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        yv0 t13 = t1(i11);
        if (i11 != 8 && (t13 == null || (z6Var = t13.f35173s) == null || z6Var.g() <= 0)) {
            f7 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f7;
        }
        if (!z11) {
            f7 = visibilityFactor;
        }
        return AndroidUtilities.lerp(visibilityFactor, f7, Math.abs(uu0VarArr[0].getTranslationX() / uu0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        uu0[] uu0VarArr = this.m0;
        uu0 uu0Var = uu0VarArr[1];
        if (uu0Var != null && uu0Var.getVisibility() == 0) {
            if (this.f26952i1 && !this.f26958k1) {
                return uu0VarArr[1].E;
            }
            if (Math.abs(uu0VarArr[1].getTranslationX()) < uu0VarArr[1].getMeasuredWidth() / 2.0f) {
                return uu0VarArr[1].E;
            }
        }
        return getSelectedTab();
    }

    public nm0 getCurrentListView() {
        gu0 gu0Var;
        uu0 uu0Var = this.m0[0];
        int i10 = uu0Var.E;
        if (i10 == 13) {
            return this.W.getCurrentListView();
        }
        if (i10 == 14) {
            return this.f26925a0.getCurrentListView();
        }
        if (i10 == 12 && (gu0Var = this.V) != null) {
            return gu0Var.f46049a.f45339x0;
        }
        return uu0Var.h;
    }

    public int getInitialTab() {
        return 0;
    }

    public int getPhotosVideosTypeFilter() {
        return this.f26986v1[0].f32046q;
    }

    public TextView getSaveItem() {
        return this.f26979s0;
    }

    public org.telegram.ui.ActionBar.w0 getSearchItem() {
        return this.f26971p0;
    }

    public bk0 getSearchOptionsItem() {
        return this.f26983u0;
    }

    public int getSelectedTab() {
        int currentTabId = this.K0.getCurrentTabId();
        at0 at0Var = this.f26928b0;
        if (at0Var != null && currentTabId == 8) {
            int currentAlbumId = at0Var.getCurrentAlbumId();
            if (currentAlbumId == 0) {
                return 8;
            }
            if (currentAlbumId > 0) {
                return r1(currentAlbumId).f26682a;
            }
            return currentTabId;
        }
        return currentTabId;
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
        float f7 = 0.0f;
        int i10 = 0;
        while (true) {
            uu0[] uu0VarArr = this.m0;
            if (i10 < uu0VarArr.length) {
                uu0 uu0Var = uu0VarArr[i10];
                if (uu0Var != null) {
                    f7 = ((1.0f - Math.abs(uu0Var.getTranslationX() / getWidth())) * uu0Var.E) + f7;
                }
                i10++;
            } else {
                return f7;
            }
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.h7> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.h7> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.C0, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23768z6));
        int i10 = org.telegram.ui.ActionBar.y6.f23770z8;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f26965n0, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        org.telegram.ui.ActionBar.w0 w0Var = this.f26988w0;
        if (w0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f26985v0;
        if (w0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        }
        Drawable[] drawableArr = {this.F0};
        int i11 = org.telegram.ui.ActionBar.y6.f23751y8;
        ImageView imageView = this.E0;
        arrayList.add(new org.telegram.ui.ActionBar.h7(imageView, 8, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.D0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23357d6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.K0, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Gh));
        vt0 vt0Var = this.K0;
        arrayList.add(new org.telegram.ui.ActionBar.h7(vt0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Fh));
        arrayList.add(new org.telegram.ui.ActionBar.h7(vt0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Eh));
        arrayList.add(new org.telegram.ui.ActionBar.h7(vt0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Hh));
        qt0 qt0Var = this.T0;
        if (qt0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h7(qt0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23694v7));
            arrayList.add(new org.telegram.ui.ActionBar.h7(qt0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23675u7));
            arrayList.add(new org.telegram.ui.ActionBar.h7(qt0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23750y7));
            arrayList.add(new org.telegram.ui.ActionBar.h7(qt0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.A7));
        }
        final int i12 = 0;
        while (true) {
            uu0[] uu0VarArr = this.m0;
            if (i12 < uu0VarArr.length) {
                org.telegram.ui.ActionBar.g7 g7Var = new org.telegram.ui.ActionBar.g7() {
                    @Override
                    public final void b() {
                        uu0[] uu0VarArr2 = bw0.this.m0;
                        int i13 = i12;
                        et0 et0Var = uu0VarArr2[i13].h;
                        if (et0Var != null) {
                            int childCount = et0Var.getChildCount();
                            for (int i14 = 0; i14 < childCount; i14++) {
                                View childAt = uu0VarArr2[i13].h.getChildAt(i14);
                                if (childAt instanceof org.telegram.ui.Cells.x7) {
                                    org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) childAt;
                                    for (int i15 = 0; i15 < 6; i15++) {
                                        x7Var.f25721a[i15].e.invalidate();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.m6) {
                                    ((org.telegram.ui.Cells.m6) childAt).t(0);
                                } else if (childAt instanceof org.telegram.ui.Cells.ab) {
                                    ((org.telegram.ui.Cells.ab) childAt).i(0);
                                }
                            }
                        }
                    }

                    @Override
                    public final void a(float f7) {
                    }
                };
                arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23637s8));
                arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23449i6));
                arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].v, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23339c7));
                int i13 = org.telegram.ui.ActionBar.y6.f23429h6;
                arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i13));
                arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 0, new Class[]{org.telegram.ui.Cells.ab.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g7Var, org.telegram.ui.ActionBar.y6.f23541n6));
                arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g7Var, org.telegram.ui.ActionBar.y6.O7));
                arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g7Var, org.telegram.ui.ActionBar.y6.P7));
                arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g7Var, org.telegram.ui.ActionBar.y6.Q7));
                arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g7Var, org.telegram.ui.ActionBar.y6.R7));
                arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g7Var, org.telegram.ui.ActionBar.y6.S7));
                arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g7Var, org.telegram.ui.ActionBar.y6.T7));
                arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g7Var, org.telegram.ui.ActionBar.y6.U7));
                int i14 = org.telegram.ui.ActionBar.y6.f23450i7;
                arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 8192, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i14));
                int i15 = org.telegram.ui.ActionBar.y6.f23486k7;
                arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 16384, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 8, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.zi));
                arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i13));
                arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 8192, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 16384, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 8192, new Class[]{org.telegram.ui.Cells.r7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 16384, new Class[]{org.telegram.ui.Cells.r7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 8192, new Class[]{org.telegram.ui.Cells.x7.class}, (Paint) null, (Drawable[]) null, g7Var, i14));
                arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 16384, new Class[]{org.telegram.ui.Cells.x7.class}, (Paint) null, (Drawable[]) null, g7Var, i15));
                arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 0, new Class[]{org.telegram.ui.Cells.d2.class}, new String[]{"backgroundPaint"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Lh));
                arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 8192, new Class[]{org.telegram.ui.Cells.d2.class}, (Paint) null, (Drawable[]) null, g7Var, i14));
                arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 16384, new Class[]{org.telegram.ui.Cells.d2.class}, (Paint) null, (Drawable[]) null, g7Var, i15));
                arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].h, 0, (Class[]) null, (Paint) null, new Drawable[]{this.A0}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23319b7));
                arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].v.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.h7(uu0VarArr[i12].v.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23749y6));
                i12++;
            } else {
                return arrayList;
            }
        }
    }

    public final float h0(float f7) {
        float f10 = 0.0f;
        if (x0()) {
            return 0.0f;
        }
        uu0[] uu0VarArr = this.m0;
        uu0 uu0Var = uu0VarArr[1];
        if (uu0Var != null && s0(uu0Var.E)) {
            f10 = 0.0f + f7;
        }
        uu0 uu0Var2 = uu0VarArr[0];
        if (uu0Var2 != null && s0(uu0Var2.E)) {
            return (1.0f - f7) + f10;
        }
        return f10;
    }

    public final void h1(int i10, int i11, int i12, int i13) {
        uu0[] uu0VarArr;
        this.f26930b2 = true;
        this.f26934c2 = i10;
        this.f26937d2 = i11;
        this.f26940e2 = i12;
        this.a2 = i13;
        j1(i10, this.K0);
        j1(i10, this.D0);
        j1(AndroidUtilities.dp(34.0f) + i10, this.R0);
        j1(AndroidUtilities.dp(52.0f) + i10, this.M0);
        j1(AndroidUtilities.dp(4.0f) + i10, this.L0);
        j1(AndroidUtilities.dp(48.0f) + i10, this.f26928b0);
        ws0 ws0Var = this.f26925a0;
        if (ws0Var != null) {
            if (ws0Var.L != i11 || ws0Var.M != i12) {
                ws0Var.L = i11;
                ws0Var.M = i12;
                ws0Var.n();
            }
            B1();
        }
        for (uu0 uu0Var : this.m0) {
            if (uu0Var != null) {
                uu0Var.setClipChildren(false);
                D1(uu0Var);
                setPageOverscan(uu0Var.h);
                setPageOverscan(uu0Var.f33468n);
                int paddingTop = uu0Var.h.getPaddingTop();
                et0 et0Var = uu0Var.h;
                int paddingLeft = et0Var.getPaddingLeft();
                et0 et0Var2 = uu0Var.h;
                int g02 = g0(uu0Var.E);
                et0Var2.f33152h3 = g02;
                int paddingRight = uu0Var.h.getPaddingRight();
                et0 et0Var3 = uu0Var.h;
                int f02 = f0(D0());
                et0Var3.f33153i3 = f02;
                et0Var.setPadding(paddingLeft, g02, paddingRight, f02);
                int paddingTop2 = paddingTop - uu0Var.h.getPaddingTop();
                if (paddingTop2 != 0) {
                    AndroidUtilities.doOnLayout(uu0Var.h, new fs0(uu0Var, paddingTop2, 1));
                }
                uu0Var.v.setPadding(0, i10, 0, i13);
                gu0 gu0Var = this.V;
                if (gu0Var != null && gu0Var.getParent() == uu0Var) {
                    j1(AndroidUtilities.dp(56.0f) + i10, gu0Var);
                }
                vs0 vs0Var = this.W;
                if (vs0Var != null && vs0Var.getParent() == uu0Var) {
                    j1(i10, vs0Var);
                }
            }
        }
        setClipChildren(false);
        requestLayout();
        invalidate();
    }

    public final float i0(float f7) {
        float f10 = 0.0f;
        if (x0()) {
            return 0.0f;
        }
        uu0[] uu0VarArr = this.m0;
        uu0 uu0Var = uu0VarArr[1];
        if (uu0Var != null && A0(uu0Var.E) && uu0VarArr[1].E != 11) {
            f10 = 0.0f + f7;
        }
        uu0 uu0Var2 = uu0VarArr[0];
        if (uu0Var2 != null && A0(uu0Var2.E) && uu0VarArr[0].E != 11) {
            return (1.0f - f7) + f10;
        }
        return f10;
    }

    public final void i1(int i10, boolean z10) {
        this.C0.a(i10, z10);
        org.telegram.ui.ActionBar.r5 r5Var = this.H;
        if (r5Var != null) {
            r5Var.t(i10, z10);
        }
    }

    public final int j0(int i10) {
        yv0 t12;
        di.z6 z6Var;
        if (w0(i10) && (t12 = t1(i10)) != null && (z6Var = t12.f35173s) != null) {
            return z6Var.g();
        }
        return 0;
    }

    public final int k0(int i10) {
        float f7;
        at0 at0Var = this.f26928b0;
        if (at0Var != null && (E0(i10) || i10 == 8)) {
            f7 = at0Var.getVisibilityFactor() * AndroidUtilities.dp(40.0f);
        } else {
            f7 = 0.0f;
        }
        return (int) f7;
    }

    public void k1(boolean z10) {
        float f7;
        if (this.E1 != z10) {
            this.E1 = z10;
            org.telegram.ui.ActionBar.r5 r5Var = this.H;
            if (r5Var != null) {
                if (z10) {
                    I1();
                    r5Var.x();
                } else {
                    r5Var.n();
                }
                O(true);
                return;
            }
            AnimatorSet animatorSet = this.Q1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            LinearLayout linearLayout = this.D0;
            if (z10) {
                linearLayout.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.Q1 = animatorSet2;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(linearLayout, View.ALPHA, f7));
            this.Q1.setDuration(180L);
            this.Q1.addListener(new org.telegram.ui.lo(20, this, z10));
            this.Q1.start();
            if (z10) {
                I1();
            }
        }
    }

    public final void l1(int r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bw0.l1(int, boolean):void");
    }

    public final void m1(int i10) {
        int q12 = q1(getClosestTab());
        at0 at0Var = this.f26928b0;
        if (q12 != i10) {
            if (at0Var != null) {
                at0Var.f41609b.d(i10, at0Var.d.i(i10));
                return;
            }
            return;
        }
        at0Var.setReorderingAlbums(true);
        aw0 r12 = r1(i10);
        uu0 d02 = d0(r12.f26682a);
        if (d02 == null) {
            return;
        }
        et0 et0Var = d02.h;
        for (int i11 = 0; i11 < et0Var.getChildCount(); i11++) {
            View childAt = et0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.w7) {
                ((org.telegram.ui.Cells.w7) childAt).l(true, true);
            }
        }
        zv0 zv0Var = r12.f26684c;
        if (zv0Var != null && !zv0Var.f35175x) {
            zv0Var.f35175x = true;
        }
        C1(true);
    }

    public final float n0(int i10, boolean z10) {
        float width = getWidth();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            uu0[] uu0VarArr = this.m0;
            if (i11 >= uu0VarArr.length) {
                break;
            }
            uu0 uu0Var = uu0VarArr[i11];
            if (uu0Var != null) {
                int i13 = uu0Var.E;
                if ((z10 && i10 == 8 && E0(i13)) || i13 == i10) {
                    i12++;
                    width = uu0VarArr[i11].getTranslationX();
                }
            }
            i11++;
        }
        if (i12 == 2) {
            return 0.0f;
        }
        return width;
    }

    public final void n1(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bw0.n1(boolean):void");
    }

    public final float o0(int i10, boolean z10) {
        float f7 = 0.0f;
        int i11 = 0;
        while (true) {
            uu0[] uu0VarArr = this.m0;
            if (i11 < uu0VarArr.length) {
                uu0 uu0Var = uu0VarArr[i11];
                if (uu0Var != null) {
                    int i12 = uu0Var.E;
                    if ((z10 && i10 == 8 && E0(i12)) || i12 == i10) {
                        f7 = (1.0f - Math.abs(uu0VarArr[i11].getTranslationX() / getWidth())) + f7;
                    }
                }
                i11++;
            } else {
                return f7;
            }
        }
    }

    public final void o1() {
        int i10 = 0;
        while (true) {
            uu0[] uu0VarArr = this.m0;
            if (i10 < uu0VarArr.length) {
                int childCount = uu0VarArr[i10].h.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = uu0VarArr[i10].h.getChildAt(i11);
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
            } else {
                return;
            }
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i10 = 0;
        while (true) {
            uu0[] uu0VarArr = this.m0;
            if (i10 < uu0VarArr.length) {
                et0 et0Var = uu0VarArr[i10].h;
                if (et0Var != null) {
                    et0Var.getViewTreeObserver().addOnPreDrawListener(new bu0(this, i10, 0));
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!Q() && !this.K0.H && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i10);
        nu0 nu0Var = this.F1;
        if (nu0Var.f() != null) {
            i12 = nu0Var.f().getHeight();
        } else {
            i12 = 0;
        }
        if (i12 == 0) {
            i12 = View.MeasureSpec.getSize(i11);
        }
        setMeasuredDimension(size, i12);
        int childCount = getChildCount();
        int i15 = 0;
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            if (childAt == null || childAt.getVisibility() == 8) {
                i13 = i10;
            } else if (childAt instanceof uu0) {
                i13 = i10;
                measureChildWithMargins(childAt, i13, 0, View.MeasureSpec.makeMeasureSpec(i12, 1073741824), 0);
                et0 et0Var = ((uu0) childAt).h;
                et0Var.setPadding(0, et0Var.f33150f3, 0, et0Var.f33151g3);
            } else {
                i13 = i10;
                i14 = i11;
                measureChildWithMargins(childAt, i13, 0, i14, 0);
                i15++;
                i10 = i13;
                i11 = i14;
            }
            i14 = i11;
            i15++;
            i10 = i13;
            i11 = i14;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        boolean z12 = false;
        if (!this.O1) {
            org.telegram.ui.ActionBar.r2 r2Var = this.f26992x1;
            if (r2Var.getParentLayout() != null && !((ActionBarLayout) r2Var.getParentLayout()).i() && !Q() && !this.f26924a) {
                if (motionEvent != null) {
                    if (this.D1 == null) {
                        this.D1 = VelocityTracker.obtain();
                    }
                    this.D1.addMovement(motionEvent);
                    t40 t40Var = this.G1;
                    if (t40Var != null) {
                        t40Var.b(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.f26997z1 && !this.A1) {
                    if (motionEvent.getY() >= AndroidUtilities.dp(90.0f) + this.f26934c2) {
                        this.f26995y1 = motionEvent.getPointerId(0);
                        this.A1 = true;
                        this.B1 = (int) motionEvent.getX();
                        this.C1 = (int) motionEvent.getY();
                        this.D1.clear();
                        return this.f26997z1;
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f26995y1) {
                    int x9 = (int) (motionEvent.getX() - this.B1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.C1);
                    boolean z13 = this.f26997z1;
                    uu0[] uu0VarArr = this.m0;
                    if (z13 && (((z10 = this.f26955j1) && x9 > 0) || (!z10 && x9 < 0))) {
                        if (x9 < 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!a1(motionEvent, z11)) {
                            this.A1 = true;
                            this.f26997z1 = false;
                            uu0VarArr[0].setTranslationX(0.0f);
                            uu0 uu0Var = uu0VarArr[1];
                            if (this.f26955j1) {
                                i11 = uu0VarArr[0].getMeasuredWidth();
                            } else {
                                i11 = -uu0VarArr[0].getMeasuredWidth();
                            }
                            uu0Var.setTranslationX(i11);
                            f1(0.0f, uu0VarArr[1].E);
                            T0(getTabProgress());
                        }
                    }
                    if (this.A1 && !this.f26997z1) {
                        if (Math.abs(x9) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x9) > abs) {
                            if (x9 < 0) {
                                z12 = true;
                            }
                            a1(motionEvent, z12);
                        }
                    } else if (this.f26997z1) {
                        uu0VarArr[0].setTranslationX(x9);
                        if (this.f26955j1) {
                            uu0VarArr[1].setTranslationX(uu0VarArr[0].getMeasuredWidth() + x9);
                        } else {
                            uu0VarArr[1].setTranslationX(x9 - uu0VarArr[0].getMeasuredWidth());
                        }
                        float abs2 = Math.abs(x9) / uu0VarArr[0].getMeasuredWidth();
                        if (!G()) {
                            this.f26973q0 = 0.0f;
                        } else {
                            this.f26973q0 = i0(abs2);
                            G1(abs2);
                            float h02 = h0(abs2);
                            this.f26976r0 = h02;
                            if (h02 != 0.0f && G() && !x0()) {
                                i10 = 0;
                            } else {
                                i10 = 4;
                            }
                            this.f26981t0.setVisibility(i10);
                        }
                        C1(false);
                        f1(abs2, uu0VarArr[1].E);
                        T0(getTabProgress());
                        S0();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f26995y1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    p1(motionEvent);
                }
                return this.f26997z1;
            }
        }
        return false;
    }

    public final int p0(int i10) {
        org.telegram.ui.ActionBar.u6 u6Var = this.H1;
        if (u6Var != null) {
            return u6Var.g(i10);
        }
        return org.telegram.ui.ActionBar.y6.x0(null, i10, false);
    }

    public final void p1(MotionEvent motionEvent) {
        float f7;
        float f10;
        boolean z10;
        float measuredWidth;
        uu0 uu0Var;
        uu0 uu0Var2;
        int measuredWidth2;
        uu0 uu0Var3;
        uu0 uu0Var4;
        boolean z11;
        VelocityTracker velocityTracker = this.D1;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.U0);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f7 = this.D1.getXVelocity();
                f10 = this.D1.getYVelocity();
                if (!this.f26997z1 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                    if (f7 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a1(motionEvent, z11);
                }
            } else {
                f7 = 0.0f;
                f10 = 0.0f;
            }
            if (this.f26997z1) {
                uu0[] uu0VarArr = this.m0;
                float x9 = uu0VarArr[0].getX();
                this.f26949h1 = new AnimatorSet();
                if (Math.abs(x9) < uu0VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f26958k1 = z10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new f80(this, 20));
                boolean z12 = this.f26958k1;
                Property property = View.TRANSLATION_X;
                if (z12) {
                    measuredWidth = Math.abs(x9);
                    if (this.f26955j1) {
                        this.f26949h1.playTogether(ObjectAnimator.ofFloat(uu0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(uu0VarArr[1], property, uu0Var4.getMeasuredWidth()), ofFloat);
                    } else {
                        this.f26949h1.playTogether(ObjectAnimator.ofFloat(uu0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(uu0VarArr[1], property, -uu0Var3.getMeasuredWidth()), ofFloat);
                    }
                } else {
                    measuredWidth = uu0VarArr[0].getMeasuredWidth() - Math.abs(x9);
                    if (this.f26955j1) {
                        this.f26949h1.playTogether(ObjectAnimator.ofFloat(uu0VarArr[0], property, -uu0Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(uu0VarArr[1], property, 0.0f), ofFloat);
                    } else {
                        this.f26949h1.playTogether(ObjectAnimator.ofFloat(uu0VarArr[0], property, uu0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(uu0VarArr[1], property, 0.0f), ofFloat);
                    }
                }
                this.f26949h1.setInterpolator(f26923q2);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs = Math.abs(f7);
                if (abs > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                this.f26949h1.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                this.f26949h1.addListener(new yt0(this, 1));
                this.f26949h1.start();
                this.f26952i1 = true;
                this.f26997z1 = false;
                S0();
            } else {
                this.A1 = false;
                setHeaderEnabled(true);
                this.K0.setEnabled(true);
            }
            VelocityTracker velocityTracker2 = this.D1;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.D1 = null;
            }
        }
    }

    public final boolean q0() {
        if (this.f26992x1.getConnectionsManager().getConnectionState() == 3) {
            return true;
        }
        return false;
    }

    public final int q1(int i10) {
        aw0 s12 = s1(i10);
        if (s12 == null) {
            return -1;
        }
        return s12.f26683b;
    }

    public final boolean r0() {
        SparseArray[] sparseArrayArr;
        MessageObject messageObject;
        TLRPC.Message message;
        boolean z10 = false;
        for (int i10 = 1; i10 >= 0; i10--) {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            while (true) {
                sparseArrayArr = this.f26929b1;
                if (i11 >= sparseArrayArr[i10].size()) {
                    break;
                }
                arrayList.add(Integer.valueOf(sparseArrayArr[i10].keyAt(i11)));
                i11++;
            }
            int size = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    break;
                }
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

    public final aw0 r1(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.f26956j2;
        aw0 aw0Var = (aw0) hashMap.get(valueOf);
        if (aw0Var == null) {
            aw0 aw0Var2 = new aw0(this, getContext(), i10);
            hashMap.put(Integer.valueOf(i10), aw0Var2);
            this.f26959k2.put(Integer.valueOf(aw0Var2.f26682a), Integer.valueOf(i10));
            return aw0Var2;
        }
        return aw0Var;
    }

    public final boolean s0(int i10) {
        if (i10 != 0) {
            if (((i10 != 8 && !E0(i10)) || !TextUtils.isEmpty(getStoriesHashtag())) && i10 != 9 && i10 != 11 && i10 != 13) {
                if (i10 != 14 || this.f26925a0 == null) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final aw0 s1(int i10) {
        Integer num = (Integer) this.f26959k2.get(Integer.valueOf(i10));
        if (num == null) {
            return null;
        }
        return (aw0) this.f26956j2.get(num);
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        boolean z10;
        int i10;
        TLRPC.ChatFull chatFull2 = this.f26943f1;
        if (chatFull2 != null && chatFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26943f1 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.f26939e1 == 0) {
                this.f26939e1 = -j10;
                int i11 = 0;
                while (true) {
                    qv0[] qv0VarArr = this.f26986v1;
                    if (i11 >= qv0VarArr.length) {
                        break;
                    }
                    if (qv0VarArr[i11].f32034b[1].size() == 0) {
                        qv0 qv0Var = qv0VarArr[i11];
                        qv0Var.f32039j[1] = this.f26943f1.migrated_from_max_id;
                        qv0Var.f32038i[1] = false;
                    }
                    i11++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.f26943f1;
        if (chatFull3 != null && z10 != chatFull3.stories_pinned_available) {
            vt0 vt0Var = this.K0;
            if (vt0Var != null) {
                if (x0()) {
                    i10 = 9;
                } else {
                    i10 = 8;
                }
                vt0Var.setInitialTabId(i10);
            }
            J1(true);
            v1(false);
        }
    }

    public void setCommonGroupsCount(int i10) {
        if (this.F == 0) {
            this.Z0[6] = i10;
        }
        J1(true);
        L();
    }

    public void setForwardRestrictedHint(t40 t40Var) {
        this.G1 = t40Var;
    }

    public void setMergeDialogId(long j10) {
        this.f26939e1 = j10;
    }

    public void setNewMediaCounts(int[] iArr) {
        int[] iArr2;
        int i10 = 0;
        while (true) {
            iArr2 = this.Z0;
            if (i10 > 6 || iArr2[i10] >= 0) {
                break;
            }
            i10++;
        }
        System.arraycopy(iArr, 0, iArr2, 0, 6);
        J1(true);
        L();
        if (iArr2[0] >= 0) {
            H0(false);
        }
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.N1 = i11;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            uu0[] uu0VarArr = this.m0;
            if (i15 >= uu0VarArr.length) {
                break;
            }
            uu0VarArr[i15].setTranslationY(this.N1);
            i15++;
        }
        if (this.R0 != null) {
            R();
        } else {
            qt0 qt0Var = this.T0;
            if (qt0Var != null) {
                qt0Var.setTranslationY(AndroidUtilities.dp(48.0f) + i11);
            }
        }
        this.Q0 = i11;
        org.telegram.ui.Cells.v0 v0Var = this.M0;
        if (v0Var.getTag() == null) {
            i14 = -AndroidUtilities.dp(48.0f);
        }
        v0Var.setTranslationY(i14 + this.Q0);
    }

    public void setPagesGlassEngine(oi.q qVar) {
        uu0[] uu0VarArr;
        this.f26947g2 = qVar;
        ws0 ws0Var = this.f26925a0;
        if (ws0Var != null) {
            ws0Var.setGlassEngine(qVar);
        }
        for (uu0 uu0Var : this.m0) {
            if (uu0Var != null) {
                uu0Var.h.setCaptureSectionsDecoratorAllowed(true);
                qVar.b(uu0Var.h);
            }
        }
    }

    public void setPagesPaddingBottom(int i10) {
        if (this.a2 != i10) {
            this.a2 = i10;
            uu0[] uu0VarArr = this.m0;
            if (uu0VarArr != null) {
                for (uu0 uu0Var : uu0VarArr) {
                    if (uu0Var != null) {
                        et0 et0Var = uu0Var.h;
                        int paddingLeft = et0Var.getPaddingLeft();
                        et0 et0Var2 = uu0Var.h;
                        int i11 = et0Var2.f33150f3;
                        int paddingRight = et0Var2.getPaddingRight();
                        et0 et0Var3 = uu0Var.h;
                        int f02 = f0(D0());
                        et0Var3.f33153i3 = f02;
                        et0Var.setPadding(paddingLeft, i11, paddingRight, f02);
                    }
                }
            }
        }
    }

    public void setPagesVisibleOverscanTop(int i10) {
        if (this.f26944f2 != i10) {
            this.f26944f2 = i10;
            invalidate();
        }
    }

    public void setPinnedToTop(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            int i10 = 0;
            while (true) {
                uu0[] uu0VarArr = this.m0;
                if (i10 < uu0VarArr.length) {
                    z1(uu0VarArr[i10], true);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        boolean z10;
        TLRPC.UserFull userFull2 = this.f26946g1;
        if (userFull2 != null && userFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26946g1 = userFull;
        J1(true);
        if (userFull != null && z10 != userFull.stories_pinned_available) {
            e1(8);
        }
    }

    public void setVisibleHeight(int i10) {
        float f7;
        this.P1 = i10;
        int i11 = 0;
        while (true) {
            uu0[] uu0VarArr = this.m0;
            if (i11 >= uu0VarArr.length) {
                break;
            }
            int measuredHeight = getMeasuredHeight();
            if (uu0VarArr[i11].E == 8) {
                f7 = 280.0f;
            } else {
                f7 = 120.0f;
            }
            float f10 = (-(measuredHeight - Math.max(i10, AndroidUtilities.dp(f7)))) / 2.0f;
            uu0VarArr[i11].v.setTranslationY(f10);
            uu0VarArr[i11].f33470s.setTranslationY(-f10);
            i11++;
        }
        vs0 vs0Var = this.W;
        if (vs0Var != null) {
            vs0Var.setVisibleHeight(i10);
        }
        ws0 ws0Var = this.f26925a0;
        if (ws0Var != null) {
            ws0Var.setVisibleHeight(i10);
        }
    }

    public final void t0() {
        AndroidUtilities.cancelRunOnUIThread(this.O0);
        org.telegram.ui.Cells.v0 v0Var = this.M0;
        if (v0Var.getTag() == null) {
            return;
        }
        v0Var.setTag(null);
        AnimatorSet animatorSet = this.N0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.N0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.N0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.N0.playTogether(ObjectAnimator.ofFloat(v0Var, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(v0Var, View.TRANSLATION_Y, (-AndroidUtilities.dp(48.0f)) + this.Q0));
        this.N0.setInterpolator(ds.f27531g);
        this.N0.addListener(new yt0(this, 0));
        this.N0.start();
    }

    public final yv0 t1(int i10) {
        aw0 s12;
        if (i10 == 8) {
            return this.f26938e0;
        }
        if (i10 == 9) {
            return this.f26945g0;
        }
        if (E0(i10) && (s12 = s1(i10)) != null) {
            return s12.f26684c;
        }
        return null;
    }

    public boolean u0() {
        return false;
    }

    public final yv0 u1(int i10) {
        aw0 s12;
        if (i10 == 8) {
            return this.f26942f0;
        }
        if (i10 == 9) {
            return this.f26948h0;
        }
        if (!E0(i10) || (s12 = s1(i10)) == null) {
            return null;
        }
        return s12.d;
    }

    @Override
    public final void updateColors() {
        uu0[] uu0VarArr;
        try {
            this.I1.a(p0(org.telegram.ui.ActionBar.y6.f23357d6));
            org.telegram.ui.ActionBar.j2 j2Var = this.F0;
            if (j2Var != null) {
                j2Var.a(p0(org.telegram.ui.ActionBar.y6.f23751y8));
            }
            NumberTextView numberTextView = this.C0;
            if (numberTextView != null) {
                numberTextView.setTextColor(p0(org.telegram.ui.ActionBar.y6.f23751y8));
            }
            x1();
            invalidate();
            for (uu0 uu0Var : this.m0) {
                if (uu0Var != null && uu0Var.L) {
                    uu0Var.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public boolean v0() {
        return !(this instanceof j40);
    }

    public final void v1(boolean z10) {
        uu0[] uu0VarArr;
        uu0[] uu0VarArr2;
        org.telegram.ui.ActionBar.w0 w0Var;
        s4.w0 w0Var2;
        boolean z11;
        boolean z12;
        boolean z13;
        s4.w0 w0Var3;
        int i10;
        int i11;
        int i12;
        boolean z14;
        boolean z15;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z16;
        s4.w0 w0Var4;
        int i17;
        int i18;
        boolean z17;
        int i19;
        boolean z18;
        int i20;
        boolean z19;
        boolean z20;
        int i21;
        s4.w0 w0Var5;
        ws0 ws0Var = this.f26925a0;
        if (ws0Var != null) {
            ws0Var.i();
        }
        int i22 = 0;
        while (true) {
            uu0VarArr = this.m0;
            if (i22 >= uu0VarArr.length) {
                break;
            }
            uu0VarArr[i22].h.C0();
            i22++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) uu0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = AndroidUtilities.dp(J0());
        layoutParams.rightMargin = 0;
        layoutParams.leftMargin = 0;
        s4.h0 adapter = uu0VarArr[z10 ? 1 : 0].h.getAdapter();
        s4.h0 h0Var = this.f26938e0;
        s4.z zVar = this.f26935d0;
        if (adapter == h0Var) {
            zVar.h(null);
        }
        boolean z21 = this.X0;
        nu0 nu0Var = this.F1;
        org.telegram.ui.ActionBar.k kVar = this.G;
        String str = "";
        org.telegram.ui.ActionBar.w0 w0Var6 = this.f26971p0;
        jv0 jv0Var = this.P;
        int i23 = 100;
        if (z21 && this.W0) {
            uu0 uu0Var = uu0VarArr[z10 ? 1 : 0];
            if (uu0Var.f33467f == null) {
                uu0Var.f33467f = new s4.w0();
            }
            uu0 uu0Var2 = uu0VarArr[z10 ? 1 : 0];
            s4.w0 w0Var7 = uu0Var2.f33467f;
            nv0 nv0Var = this.U;
            su0 su0Var = this.f26960l0;
            xu0 xu0Var = this.f26954j0;
            xu0 xu0Var2 = this.f26957k0;
            xu0 xu0Var3 = this.f26951i0;
            if (z10) {
                int i24 = uu0Var2.E;
                if (i24 != 0) {
                    w0Var5 = w0Var7;
                    if (i24 != 2 && i24 != 5 && i24 != 6 && (i24 != 7 || nu0Var.U())) {
                        if (w0Var6 != null) {
                            str = w0Var6.getSearchField().getText().toString();
                        }
                        int i25 = uu0VarArr[z10 ? 1 : 0].E;
                        if (i25 == 1) {
                            if (xu0Var3 != null) {
                                xu0Var3.G(str, false);
                                if (adapter != xu0Var3) {
                                    c1(adapter);
                                    uu0VarArr[z10 ? 1 : 0].h.setAdapter(xu0Var3);
                                }
                            }
                        } else if (i25 == 3) {
                            if (xu0Var2 != null) {
                                xu0Var2.G(str, false);
                                if (adapter != xu0Var2) {
                                    c1(adapter);
                                    uu0VarArr[z10 ? 1 : 0].h.setAdapter(xu0Var2);
                                }
                            }
                        } else if (i25 == 4) {
                            if (xu0Var != null) {
                                xu0Var.G(str, false);
                                if (adapter != xu0Var) {
                                    c1(adapter);
                                    uu0VarArr[z10 ? 1 : 0].h.setAdapter(xu0Var);
                                }
                            }
                        } else if (i25 == 7) {
                            if (su0Var != null) {
                                su0Var.F(str, false);
                                if (adapter != su0Var) {
                                    c1(adapter);
                                    uu0VarArr[z10 ? 1 : 0].h.setAdapter(su0Var);
                                }
                            }
                        } else if (i25 == 11) {
                            if (nv0Var != null) {
                                nv0Var.E(this.Y0, str);
                                if (adapter != nv0Var) {
                                    c1(adapter);
                                    uu0VarArr[z10 ? 1 : 0].h.setAdapter(nv0Var);
                                }
                            }
                        } else if (i25 == 15 && jv0Var != null && adapter != jv0Var) {
                            c1(adapter);
                            et0 et0Var = uu0VarArr[z10 ? 1 : 0].h;
                            jv0Var.f29773r = et0Var;
                            et0Var.setAdapter(jv0Var);
                        }
                    }
                }
                this.X0 = false;
                st0 st0Var = this.L0;
                if (st0Var != null) {
                    st0Var.g(false);
                }
                this.W0 = false;
                v1(true);
                return;
            }
            w0Var5 = w0Var7;
            if (uu0Var2.h != null) {
                int i26 = uu0Var2.E;
                if (i26 == 1) {
                    if (adapter != xu0Var3) {
                        c1(adapter);
                        uu0VarArr[z10 ? 1 : 0].h.setAdapter(xu0Var3);
                    }
                    xu0Var3.l();
                } else if (i26 == 3) {
                    if (adapter != xu0Var2) {
                        c1(adapter);
                        uu0VarArr[z10 ? 1 : 0].h.setAdapter(xu0Var2);
                    }
                    xu0Var2.l();
                } else if (i26 == 4) {
                    if (adapter != xu0Var) {
                        c1(adapter);
                        uu0VarArr[z10 ? 1 : 0].h.setAdapter(xu0Var);
                    }
                    xu0Var.l();
                } else if (i26 == 7) {
                    if (adapter != su0Var) {
                        c1(adapter);
                        uu0VarArr[z10 ? 1 : 0].h.setAdapter(su0Var);
                    }
                    su0Var.l();
                } else if (i26 == 11) {
                    if (adapter != nv0Var) {
                        c1(adapter);
                        uu0VarArr[z10 ? 1 : 0].h.setAdapter(nv0Var);
                    }
                    nv0Var.l();
                }
            }
            uu0VarArr2 = uu0VarArr;
            w0Var = w0Var6;
            w0Var4 = w0Var5;
            z16 = false;
            i10 = 4;
            z13 = false;
            i14 = 8;
        } else {
            uu0 uu0Var3 = uu0VarArr[z10 ? 1 : 0];
            if (uu0Var3.e == null) {
                uu0Var3.e = new s4.w0();
            }
            uu0 uu0Var4 = uu0VarArr[z10 ? 1 : 0];
            s4.w0 w0Var8 = uu0Var4.e;
            uu0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i27 = uu0VarArr[z10 ? 1 : 0].E;
            if (i27 == 8 || E0(i27)) {
                layoutParams.topMargin = AndroidUtilities.dp(J0());
            }
            et0 et0Var2 = uu0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = et0Var2.getPaddingLeft();
            uu0 uu0Var5 = uu0VarArr[z10 ? 1 : 0];
            uu0VarArr2 = uu0VarArr;
            et0 et0Var3 = uu0Var5.h;
            int g02 = g0(uu0Var5.E);
            et0Var3.f33152h3 = g02;
            int paddingRight = uu0VarArr2[z10 ? 1 : 0].h.getPaddingRight();
            et0 et0Var4 = uu0VarArr2[z10 ? 1 : 0].h;
            w0Var = w0Var6;
            int f02 = f0(D0());
            et0Var4.f33153i3 = f02;
            et0Var2.setPadding(paddingLeft, g02, paddingRight, f02);
            int i28 = uu0VarArr2[z10 ? 1 : 0].E;
            int[] iArr = this.f26969o1;
            s4.h0 h0Var2 = this.M;
            View view = this.W;
            mv0 mv0Var = this.T;
            mu0 mu0Var = this.R;
            gu0 gu0Var = this.V;
            qv0[] qv0VarArr = this.f26986v1;
            if (i28 == 0) {
                s4.h0 h0Var3 = this.J;
                if (adapter != h0Var3) {
                    c1(adapter);
                    uu0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var3);
                }
                int i29 = -AndroidUtilities.dp(1.0f);
                layoutParams.rightMargin = i29;
                layoutParams.leftMargin = i29;
                qv0 qv0Var = qv0VarArr[0];
                if (qv0Var.h && !qv0Var.e.isEmpty()) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                i23 = iArr[0];
                uu0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.A0);
                qv0 qv0Var2 = qv0VarArr[0];
                if (qv0Var2.f32052x == null) {
                    qv0Var2.f32052x = new s4.w0();
                }
                w0Var2 = qv0VarArr[0].f32052x;
                z13 = z19;
                z11 = false;
            } else {
                if (i28 == 1) {
                    qv0 qv0Var3 = qv0VarArr[1];
                    if (qv0Var3.h && !qv0Var3.e.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (adapter != h0Var2) {
                        c1(adapter);
                        uu0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var2);
                    }
                } else if (i28 == 2) {
                    qv0 qv0Var4 = qv0VarArr[2];
                    if (qv0Var4.h && !qv0Var4.e.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    s4.h0 h0Var4 = this.N;
                    if (adapter != h0Var4) {
                        c1(adapter);
                        uu0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var4);
                    }
                } else {
                    if (i28 == 3) {
                        if (adapter != this.L) {
                            c1(adapter);
                            uu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.L);
                        }
                    } else if (i28 == 4) {
                        qv0 qv0Var5 = qv0VarArr[4];
                        if (qv0Var5.h && !qv0Var5.e.isEmpty()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (adapter != this.O) {
                            c1(adapter);
                            uu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.O);
                        }
                    } else {
                        if (i28 == 5) {
                            if (adapter != this.Q) {
                                c1(adapter);
                                uu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.Q);
                            }
                        } else if (i28 == 15) {
                            if (adapter != jv0Var) {
                                c1(adapter);
                                et0 et0Var5 = uu0VarArr2[z10 ? 1 : 0].h;
                                jv0Var.f29773r = et0Var5;
                                et0Var5.setAdapter(jv0Var);
                            }
                        } else if (i28 == 6) {
                            if (adapter != mu0Var) {
                                c1(adapter);
                                uu0VarArr2[z10 ? 1 : 0].h.setAdapter(mu0Var);
                            }
                        } else if (i28 == 7) {
                            if (adapter != this.f26932c0) {
                                c1(adapter);
                                uu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.f26932c0);
                            }
                        } else if (w0(i28)) {
                            s4.h0 t12 = t1(uu0VarArr2[z10 ? 1 : 0].E);
                            if (adapter != t12) {
                                c1(adapter);
                                uu0VarArr2[z10 ? 1 : 0].h.setAdapter(t12);
                                uu0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            uu0 uu0Var6 = uu0VarArr2[z10 ? 1 : 0];
                            if (uu0Var6.E != 9) {
                                zVar.h(uu0Var6.h);
                            }
                            i23 = iArr[1];
                        } else {
                            int i30 = uu0VarArr2[z10 ? 1 : 0].E;
                            if (i30 == 10) {
                                if (adapter != this.S) {
                                    c1(adapter);
                                    uu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.S);
                                }
                            } else if (i30 == 11) {
                                if (adapter != mv0Var) {
                                    c1(adapter);
                                    uu0VarArr2[z10 ? 1 : 0].h.setAdapter(mv0Var);
                                    s4.z zVar2 = mv0Var.v;
                                    et0 et0Var6 = uu0VarArr2[z10 ? 1 : 0].h;
                                    mv0Var.f30640s = et0Var6;
                                    zVar2.h(et0Var6);
                                }
                                w0Var2 = mv0Var.f30639r;
                                z11 = true;
                                z13 = false;
                            } else if (i30 == 12) {
                                if (adapter != null) {
                                    c1(adapter);
                                    uu0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (gu0Var.getParent() != uu0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(gu0Var);
                                    uu0VarArr2[z10 ? 1 : 0].addView(gu0Var, kb1.h(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                    j1(AndroidUtilities.dp(56.0f) + this.f26934c2, gu0Var);
                                }
                            } else if (i30 == 13) {
                                if (adapter != null) {
                                    c1(adapter);
                                    uu0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != uu0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(view);
                                    uu0VarArr2[z10 ? 1 : 0].addView(view);
                                    j1(this.f26934c2, view);
                                }
                            } else if (i30 == 14) {
                                if (adapter != null) {
                                    c1(adapter);
                                    uu0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (ws0Var != null && ws0Var.getParent() != uu0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(ws0Var);
                                    uu0VarArr2[z10 ? 1 : 0].addView(ws0Var);
                                    uu0VarArr2[z10 ? 1 : 0].v.setVisibility(4);
                                }
                            }
                        }
                        w0Var2 = w0Var8;
                        z11 = false;
                        z13 = false;
                    }
                    w0Var2 = w0Var8;
                    z11 = true;
                    z13 = false;
                }
                z13 = z12;
                w0Var2 = w0Var8;
                z11 = true;
            }
            E1(uu0VarArr2[z10 ? 1 : 0]);
            if (z11) {
                uu0VarArr2[z10 ? 1 : 0].h.setSections(false);
                w0Var3 = w0Var2;
            } else {
                et0 et0Var7 = uu0VarArr2[z10 ? 1 : 0].h;
                et0Var7.getClass();
                w0Var3 = w0Var2;
                org.telegram.ui.ActionBar.f7.m(et0Var7, 20, org.telegram.ui.ActionBar.y6.f23449i6, et0Var7.f30988n2);
                et0Var7.U2 = false;
                et0Var7.H2 = null;
                et0Var7.I2 = null;
                et0Var7.L2 = 0.0f;
                et0Var7.M2 = null;
                et0Var7.N2 = null;
                et0Var7.J2 = null;
                et0Var7.setSectionsRounding(false);
                yl0 yl0Var = et0Var7.G2;
                if (yl0Var != null) {
                    et0Var7.q0(yl0Var);
                    et0Var7.G2 = null;
                }
                ea eaVar = et0Var7.S2;
                if (eaVar != null) {
                    et0Var7.q0(eaVar);
                    et0Var7.S2 = null;
                }
            }
            D1(uu0VarArr2[z10 ? 1 : 0]);
            uu0 uu0Var7 = uu0VarArr2[z10 ? 1 : 0];
            if (uu0Var7.E == 11) {
                uu0Var7.h.setItemAnimator(uu0Var7.d);
            } else {
                uu0Var7.h.setItemAnimator(null);
                if (mv0Var != null && uu0VarArr2[z10 ? 1 : 0].h == mv0Var.f30640s) {
                    s4.z zVar3 = mv0Var.v;
                    mv0Var.f30640s = null;
                    zVar3.h(null);
                }
            }
            if (gu0Var != null && uu0VarArr2[z10 ? 1 : 0].E != 12 && gu0Var.getParent() == uu0VarArr2[z10 ? 1 : 0]) {
                gu0Var.f46049a.onRemoveFromParent();
                uu0VarArr2[z10 ? 1 : 0].removeView(gu0Var);
            }
            if (view != null && uu0VarArr2[z10 ? 1 : 0].E != 13) {
                ViewParent parent = view.getParent();
                uu0 uu0Var8 = uu0VarArr2[z10 ? 1 : 0];
                if (parent == uu0Var8) {
                    uu0Var8.removeView(view);
                }
            }
            if (ws0Var != null && uu0VarArr2[z10 ? 1 : 0].E != 14) {
                ViewParent parent2 = ws0Var.getParent();
                uu0 uu0Var9 = uu0VarArr2[z10 ? 1 : 0];
                if (parent2 == uu0Var9) {
                    uu0Var9.removeView(ws0Var);
                }
            }
            int i31 = uu0VarArr2[z10 ? 1 : 0].E;
            if (i31 == 0 || i31 == 11 || w0(i31) || (i17 = uu0VarArr2[z10 ? 1 : 0].E) == 2 || i17 == 5 || i17 == 6 || ((i17 == 7 && !nu0Var.U()) || (i18 = uu0VarArr2[z10 ? 1 : 0].E) == 10 || i18 == 13 || i18 == 14)) {
                i10 = 4;
                if (z10) {
                    this.f26996z0 = 2;
                } else {
                    this.f26996z0 = 0;
                    if (w0Var != null) {
                        if (!D0() && !this.X0) {
                            i11 = 4;
                        } else {
                            i11 = 8;
                        }
                        setSearchItemVisibility(i11);
                    }
                }
            } else {
                if (z10) {
                    if (w0Var != null && w0Var.getVisibility() == 4) {
                        org.telegram.ui.ActionBar.r5 r5Var = this.H;
                        if (r5Var != null) {
                            z18 = r5Var.F;
                        } else {
                            z18 = kVar.f22775n0;
                        }
                        if (!z18) {
                            if (G()) {
                                this.f26996z0 = 1;
                                setSearchItemVisibility(0);
                            } else {
                                if (D0()) {
                                    i20 = 8;
                                } else {
                                    i20 = 4;
                                }
                                setSearchItemVisibility(i20);
                            }
                            float f7 = z10 ? 1.0f : 0.0f;
                            this.f26973q0 = i0(f7);
                            G1(1.0f - f7);
                            z17 = false;
                        }
                    }
                    z17 = false;
                    this.f26996z0 = 0;
                    this.f26973q0 = 1.0f;
                } else {
                    z17 = false;
                    if (w0Var != null) {
                        i10 = 4;
                        if (w0Var.getVisibility() == 4) {
                            if (G()) {
                                this.f26996z0 = 0;
                                this.f26973q0 = 1.0f;
                                setSearchItemVisibility(0);
                            } else {
                                if (D0()) {
                                    i19 = 8;
                                } else {
                                    i19 = 4;
                                }
                                setSearchItemVisibility(i19);
                                this.f26973q0 = 0.0f;
                            }
                        }
                        C1(z17);
                    }
                }
                i10 = 4;
                C1(z17);
            }
            int i32 = uu0VarArr2[z10 ? 1 : 0].E;
            if (i32 == 6) {
                if (!mu0Var.e && !mu0Var.h && mu0Var.d.isEmpty()) {
                    mu0.E(mu0Var, 0L);
                }
            } else if (i32 != 7) {
                if (w0(i32)) {
                    yv0 t13 = t1(uu0VarArr2[z10 ? 1 : 0].E);
                    if (t13 != null) {
                        di.z6 z6Var = t13.f35173s;
                        t13.P();
                        pt0 pt0Var = uu0VarArr2[z10 ? 1 : 0].v;
                        if (z6Var != null && (z6Var.k() || (q0() && z6Var.g() > 0))) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        pt0Var.e(z14, z10);
                        if (z6Var != null && z6Var.g() > 0 && !B0()) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z13 = z15;
                    }
                } else {
                    int i33 = uu0VarArr2[z10 ? 1 : 0].E;
                    if (i33 != 10 && i33 != 11 && i33 != 12 && i33 != 13 && i33 != 14) {
                        if (i33 == 15) {
                            i33 = 8;
                        }
                        qv0 qv0Var6 = qv0VarArr[i33];
                        if (!qv0Var6.f32037g && !qv0Var6.f32038i[0] && qv0Var6.f32033a.isEmpty()) {
                            qv0VarArr[i33].f32037g = true;
                            h0Var2.l();
                            if (i33 == 0) {
                                int i34 = qv0VarArr[0].f32046q;
                                if (i34 == 1) {
                                    i12 = 6;
                                } else if (i34 == 2) {
                                    i12 = 7;
                                }
                                this.f26992x1.getMediaDataController().loadMedia(this.l1, 50, 0, 0, i12, this.F, 1, this.f26992x1.getClassGuid(), qv0VarArr[i12].f32045p, null, null);
                            }
                            i12 = i33;
                            this.f26992x1.getMediaDataController().loadMedia(this.l1, 50, 0, 0, i12, this.F, 1, this.f26992x1.getClassGuid(), qv0VarArr[i12].f32045p, null, null);
                        }
                    }
                }
            }
            int i35 = uu0VarArr2[z10 ? 1 : 0].E;
            if (i35 != 8 && !E0(i35)) {
                uu0 uu0Var10 = uu0VarArr2[z10 ? 1 : 0];
                if (uu0Var10.E == 9) {
                    if (C0()) {
                        uu0VarArr2[z10 ? 1 : 0].v.f28313b.setVisibility(8);
                        uu0VarArr2[z10 ? 1 : 0].v.f28315f.setVisibility(8);
                    } else {
                        uu0VarArr2[z10 ? 1 : 0].v.f28313b.setVisibility(0);
                        uu0VarArr2[z10 ? 1 : 0].v.setStickerType(11);
                        uu0VarArr2[z10 ? 1 : 0].v.f28315f.setVisibility(0);
                        uu0VarArr2[z10 ? 1 : 0].v.f28315f.h(z(), false);
                    }
                    uu0VarArr2[z10 ? 1 : 0].v.d.setText(LocaleController.getString(R.string.NoArchivedStoriesTitle));
                    aa0 aa0Var = uu0VarArr2[z10 ? 1 : 0].v.e;
                    if (D0()) {
                        str = LocaleController.getString(R.string.NoArchivedStoriesSubtitle);
                    }
                    aa0Var.setText(str);
                    uu0VarArr2[z10 ? 1 : 0].v.f28315f.setOnClickListener(new vr0(this, 4));
                    i14 = 8;
                } else {
                    uu0Var10.v.f28313b.setVisibility(0);
                    uu0VarArr2[z10 ? 1 : 0].v.setStickerType(1);
                    uu0VarArr2[z10 ? 1 : 0].v.d.setText(LocaleController.getString(R.string.NoResult));
                    uu0VarArr2[z10 ? 1 : 0].v.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    i14 = 8;
                    uu0VarArr2[z10 ? 1 : 0].v.f28315f.setVisibility(8);
                }
            } else {
                uu0 uu0Var11 = uu0VarArr2[z10 ? 1 : 0];
                pt0 pt0Var2 = uu0Var11.v;
                boolean E0 = E0(uu0Var11.E);
                int q12 = q1(uu0VarArr2[z10 ? 1 : 0].E);
                y9 y9Var = pt0Var2.f28313b;
                fi.d dVar = pt0Var2.f28315f;
                if (!E0 && !C0() && !y0()) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                y9Var.setVisibility(i13);
                if (E0) {
                    dVar.setVisibility(0);
                    dVar.h(LocaleController.getString(R.string.StoriesAlbumAddToAlbum), false);
                    i14 = 8;
                } else if (C0()) {
                    i14 = 8;
                    dVar.setVisibility(8);
                } else {
                    i14 = 8;
                    pt0Var2.setStickerType(11);
                    if (!B0()) {
                        i15 = 0;
                    } else {
                        i15 = 8;
                    }
                    dVar.setVisibility(i15);
                    dVar.h(z(), false);
                }
                if (E0) {
                    pt0Var2.d.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeTitle));
                    pt0Var2.e.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeDescription));
                } else {
                    xh.n nVar = pt0Var2.d;
                    if (!B0()) {
                        if (D0()) {
                            i16 = R.string.NoPublicStoriesTitle2;
                        } else {
                            i16 = R.string.NoStoriesTitle;
                        }
                    } else {
                        i16 = R.string.NoHashtagStoriesTitle;
                    }
                    nVar.setText(LocaleController.getString(i16));
                    aa0 aa0Var2 = pt0Var2.e;
                    if (D0()) {
                        str = LocaleController.getString(R.string.NoStoriesSubtitle2);
                    }
                    aa0Var2.setText(str);
                }
                dVar.setOnClickListener(new cs0(this, E0, q12, 0));
            }
            z16 = false;
            uu0VarArr2[z10 ? 1 : 0].h.setVisibility(0);
            w0Var4 = w0Var3;
        }
        int i36 = i23;
        uu0 uu0Var12 = uu0VarArr2[z10 ? 1 : 0];
        uu0Var12.f33465b = z13;
        z1(uu0Var12, z16);
        uu0VarArr2[z10 ? 1 : 0].f33471w.z1(i36);
        uu0VarArr2[z10 ? 1 : 0].h.a0();
        if (w0Var4 != null) {
            uu0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(w0Var4);
            uu0VarArr2[z10 ? 1 : 0].f33468n.setRecycledViewPool(w0Var4);
        }
        if (this.f26996z0 == 2) {
            org.telegram.ui.ActionBar.r5 r5Var2 = this.H;
            if (r5Var2 != null) {
                z20 = r5Var2.F;
            } else {
                z20 = kVar.f22775n0;
            }
            if (z20) {
                this.B0 = true;
                if (r5Var2 != null) {
                    r5Var2.f(true);
                } else {
                    kVar.g(true);
                }
                this.f26996z0 = 0;
                this.f26973q0 = 0.0f;
                if (w0Var != null) {
                    if (D0()) {
                        i21 = i14;
                    } else {
                        i21 = i10;
                    }
                    setSearchItemVisibility(i21);
                }
                C1(false);
            }
        }
    }

    public final void w1(org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2, Runnable runnable) {
        if (this.K1) {
            return;
        }
        if (!g1Var2.getCheckView().f26634a.f26091q && g1Var.getCheckView().f26634a.f26091q) {
            float f7 = -this.f26984u1;
            this.f26984u1 = f7;
            AndroidUtilities.shakeViewSpring(g1Var, f7);
            return;
        }
        g1Var.setChecked(!g1Var.getCheckView().f26634a.f26091q);
        runnable.run();
    }

    public boolean x0() {
        return false;
    }

    public final void x1() {
        if (this.H == null) {
            try {
                int p02 = p0(org.telegram.ui.ActionBar.y6.f23751y8);
                int p03 = p0(org.telegram.ui.ActionBar.y6.f23770z8);
                if (p02 != this.f26967n2 || p03 != this.f26970o2) {
                    this.f26967n2 = p02;
                    this.f26970o2 = p03;
                    org.telegram.ui.ActionBar.w0[] w0VarArr = {this.f26988w0, this.f26985v0, this.f26991x0, this.f26994y0, this.f26965n0};
                    for (int i10 = 0; i10 < 5; i10++) {
                        org.telegram.ui.ActionBar.w0 w0Var = w0VarArr[i10];
                        if (w0Var != null) {
                            w0Var.setIconColor(p02);
                            if (w0Var.getBackground() != null) {
                                org.telegram.ui.ActionBar.y6.E1(w0Var.getBackground(), p03, true);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void y(View view) {
        uu0[] uu0VarArr = this.m0;
        addView(view, Math.max(indexOfChild(uu0VarArr[0]), indexOfChild(uu0VarArr[1])) + 1, kb1.i(-1, 0, 48));
        view.getLayoutParams().height = 0;
    }

    public final boolean y0() {
        TLRPC.User user;
        long j10 = this.l1;
        if (j10 <= 0 || (user = MessagesController.getInstance(this.f26992x1.getCurrentAccount()).getUser(Long.valueOf(j10))) == null || !user.bot) {
            return false;
        }
        return true;
    }

    public final void y1() {
        fu0 fu0Var = this.J;
        if (fu0Var != null) {
            fu0Var.l();
        }
        ov0 ov0Var = this.M;
        if (ov0Var != null) {
            ov0Var.l();
        }
        ov0 ov0Var2 = this.N;
        if (ov0Var2 != null) {
            ov0Var2.l();
        }
        pv0 pv0Var = this.L;
        if (pv0Var != null) {
            pv0Var.X(false);
        }
        ov0 ov0Var3 = this.O;
        if (ov0Var3 != null) {
            ov0Var3.l();
        }
        jv0 jv0Var = this.P;
        if (jv0Var != null) {
            jv0Var.l();
        }
        pu0 pu0Var = this.Q;
        if (pu0Var != null) {
            pu0Var.l();
        }
        iu0 iu0Var = this.f26938e0;
        if (iu0Var != null) {
            iu0Var.l();
        }
        for (aw0 aw0Var : this.f26956j2.values()) {
            aw0Var.f26684c.l();
        }
    }

    public final SpannableStringBuilder z() {
        if (this.Z1 == null) {
            this.Z1 = new SpannableStringBuilder();
            if (y0()) {
                this.Z1.append((CharSequence) LocaleController.getString(R.string.ProfileBotPreviewEmptyButton));
            } else {
                this.Z1.append((CharSequence) "c");
                this.Z1.setSpan(new zq(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.Z1.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
            }
        }
        return this.Z1;
    }

    public final boolean z0() {
        org.telegram.ui.ActionBar.r2 r2Var;
        if (this.f26943f1 != null && (r2Var = this.f26992x1) != null) {
            return ChatObject.isChannelAndNotMegaGroup(r2Var.getMessagesController().getChat(Long.valueOf(this.f26943f1.f22029id)));
        }
        return false;
    }

    public final void z1(uu0 uu0Var, boolean z10) {
        boolean z11;
        Integer num = 1;
        int i10 = 0;
        if (uu0Var.f33465b && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        tl0 fastScroll = uu0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = uu0Var.f33466c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            uu0Var.f33466c.cancel();
        }
        if (!z10) {
            fastScroll.animate().setListener(null).cancel();
            if (!z11) {
                i10 = 8;
            }
            fastScroll.setVisibility(i10);
            if (!z11) {
                num = null;
            }
            fastScroll.setTag(num);
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
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fastScroll, property, fastScroll.getAlpha(), 1.0f);
            uu0Var.f33466c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(num);
        } else if (!z11 && fastScroll.getTag() != null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, property, fastScroll.getAlpha(), 0.0f);
            ofFloat2.addListener(new org.telegram.ui.lo(fastScroll));
            uu0Var.f33466c = ofFloat2;
            ofFloat2.setDuration(150L).start();
            fastScroll.animate().setListener(null).cancel();
            fastScroll.setTag(null);
        }
    }

    public void L0() {
    }

    @Override
    public final void c() {
    }

    public void K0(SparseArray sparseArray) {
    }

    public void R0(boolean z10) {
    }

    @Override
    public final void a(org.telegram.ui.Cells.p2 p2Var) {
    }

    public int b1(int i10) {
        return i10;
    }

    @Override
    public final void d(org.telegram.ui.Cells.p2 p2Var) {
    }

    @Override
    public final void f(org.telegram.ui.Cells.p2 p2Var) {
    }
}
