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
public abstract class aw0 extends FrameLayout implements org.telegram.ui.ActionBar.p6, NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Cells.l2 {
    public static final int[] f26632p2 = {0, 1, 2, 4};
    public static final qs0 f26633q2 = new qs0(0);
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
    public final mu0 F1;
    public final org.telegram.ui.ActionBar.k G;
    public final ArrayList G0;
    public t40 G1;
    public final org.telegram.ui.ActionBar.r5 H;
    public final ArrayList H0;
    public final org.telegram.ui.ActionBar.u6 H1;
    public final org.telegram.ui.ActionBar.y5 I;
    public final ArrayList I0;
    public final hh.c I1;
    public final eu0 J;
    public final ArrayList J0;
    public final NotificationCenter.ObserversGroup J1;
    public final uv0 K;
    public final ut0 K0;
    public boolean K1;
    public final ov0 L;
    public final rt0 L0;
    public final AnimationNotificationsLocker L1;
    public final nv0 M;
    public final org.telegram.ui.Cells.v0 M0;
    public org.telegram.ui.g4 M1;
    public final nv0 N;
    public AnimatorSet N0;
    public int N1;
    public final nv0 O;
    public final vr0 O0;
    public boolean O1;
    public final iv0 P;
    public final ArrayList P0;
    public int P1;
    public final ou0 Q;
    public float Q0;
    public AnimatorSet Q1;
    public final lu0 R;
    public final ws R0;
    public final SparseArray R1;
    public final ju0 S;
    public final FrameLayout S0;
    public long S1;
    public final lv0 T;
    public final pt0 T0;
    public boolean T1;
    public final mv0 U;
    public final int U0;
    public int U1;
    public final fu0 V;
    public final Paint V0;
    public final bu0 V1;
    public final us0 W;
    public boolean W0;
    public di.z6 W1;
    public boolean X0;
    public float X1;
    public bh.x0 Y0;
    public boolean Y1;
    public final int[] Z0;
    public SpannableStringBuilder Z1;
    public boolean f26634a;
    public final vs0 f26635a0;
    public int f26636a1;
    public int a2;
    public boolean f26637b;
    public final zs0 f26638b0;
    public final SparseArray[] f26639b1;
    public boolean f26640b2;
    public boolean f26641c;
    public final ku0 f26642c0;
    public int f26643c1;
    public int f26644c2;
    public boolean d;
    public final s4.z f26645d0;
    public boolean f26646d1;
    public int f26647d2;
    public int e;
    public final hu0 f26648e0;
    public long f26649e1;
    public int f26650e2;
    public int f26651f;
    public final xv0 f26652f0;
    public TLRPC.ChatFull f26653f1;
    public int f26654f2;
    public final ts0 f26655g0;
    public TLRPC.UserFull f26656g1;
    public oi.q f26657g2;
    public float h;
    public final xv0 f26658h0;
    public AnimatorSet f26659h1;
    public float f26660h2;
    public final wu0 f26661i0;
    public boolean f26662i1;
    public final RectF f26663i2;
    public final wu0 f26664j0;
    public boolean f26665j1;
    public final HashMap f26666j2;
    public final wu0 f26667k0;
    public boolean f26668k1;
    public final HashMap f26669k2;
    public final ru0 f26670l0;
    public final long l1;
    public int f26671l2;
    public final tu0[] m0;
    public boolean f26672m1;
    public int f26673m2;
    public float f26674n;
    public final org.telegram.ui.ActionBar.w0 f26675n0;
    public boolean f26676n1;
    public int f26677n2;
    public final org.telegram.ui.ActionBar.w0 f26678o0;
    public final int[] f26679o1;
    public int f26680o2;
    public final org.telegram.ui.ActionBar.w0 f26681p0;
    public float f26682p1;
    public float f26683q0;
    public boolean f26684q1;
    public boolean f26685r;
    public float f26686r0;
    public int f26687r1;
    public int f26688s;
    public final TextView f26689s0;
    public int f26690s1;
    public final ImageView f26691t0;
    public final ft0 f26692t1;
    public final ak0 f26693u0;
    public float f26694u1;
    public int v;
    public final org.telegram.ui.ActionBar.w0 f26695v0;
    public final pv0[] f26696v1;
    public int f26697w;
    public final org.telegram.ui.ActionBar.w0 f26698w0;
    public final sv0 f26699w1;
    public final Rect f26700x;
    public final org.telegram.ui.ActionBar.w0 f26701x0;
    public final org.telegram.ui.ActionBar.r2 f26702x1;
    public final c10 f26703y;
    public final org.telegram.ui.ActionBar.w0 f26704y0;
    public int f26705y1;
    public int f26706z0;
    public boolean f26707z1;

    public aw0(android.content.Context r35, long r36, org.telegram.ui.Components.sv0 r38, int r39, java.util.ArrayList r40, org.telegram.tgnet.TLRPC.ChatFull r41, org.telegram.tgnet.TLRPC.UserFull r42, int r43, int r44, org.telegram.ui.ActionBar.r2 r45, org.telegram.ui.Components.mu0 r46, int r47, org.telegram.ui.ActionBar.u6 r48, ch.b r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aw0.<init>(android.content.Context, long, org.telegram.ui.Components.sv0, int, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.tgnet.TLRPC$UserFull, int, int, org.telegram.ui.ActionBar.r2, org.telegram.ui.Components.mu0, int, org.telegram.ui.ActionBar.u6, ch.b):void");
    }

    public static boolean E0(int i10) {
        if ((i10 & (-65536)) == 65536) {
            return true;
        }
        return false;
    }

    public static nu0 U(int i10, long j10, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        nu0 nu0Var = new nu0(context, u6Var);
        TextView textView = nu0Var.f31078a;
        if (i10 == 0) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoMediaSecret));
                return nu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoMedia));
            return nu0Var;
        } else if (i10 == 1) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedFilesSecret));
                return nu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedFiles));
            return nu0Var;
        } else if (i10 == 2) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedVoiceSecret));
                return nu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedVoice));
            return nu0Var;
        } else if (i10 == 3) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedLinksSecret));
                return nu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedLinks));
            return nu0Var;
        } else if (i10 == 4) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedAudioSecret));
                return nu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedAudio));
            return nu0Var;
        } else if (i10 == 5) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedGifSecret));
                return nu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoGIFs));
            return nu0Var;
        } else {
            ImageView imageView = nu0Var.f31079b;
            if (i10 == 6) {
                imageView.setImageDrawable(null);
                textView.setText(LocaleController.getString(R.string.NoGroupsInCommon));
                return nu0Var;
            }
            if (i10 == 7) {
                imageView.setImageDrawable(null);
                textView.setText("");
            }
            return nu0Var;
        }
    }

    public static void g(aw0 aw0Var, TL_stories.StoryItem storyItem, di.a7 a7Var) {
        aw0Var.getStoriesController().c(a7Var.f8375a, aw0Var.l1, storyItem);
        AndroidUtilities.runOnUIThread(new t90(18, aw0Var, a7Var), 100L);
    }

    public di.h7 getStoriesController() {
        return MessagesController.getInstance(this.f26702x1.getCurrentAccount()).getStoriesController();
    }

    public static void j(aw0 aw0Var, long j10, int i10, String str) {
        di.v6 B = aw0Var.getStoriesController().B(j10, true);
        int i11 = B.f9260a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        ((di.a7) B.h.get(c10)).f8376b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f9261b);
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

    public static void k(aw0 aw0Var, int i10, TL_stories.StoryItem storyItem, String str) {
        org.telegram.ui.g4 g4Var = new org.telegram.ui.g4(aw0Var, i10, storyItem, 16);
        di.h7 storiesController = aw0Var.getStoriesController();
        long j10 = aw0Var.l1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.c0(i10, j10, arrayList);
        wc.b0(aw0Var.f26702x1).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", 1, str)), LocaleController.getString(R.string.UndoNoCaps), g4Var).j();
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

    public static void m(aw0 aw0Var, long j10, int i10) {
        di.v6 B = aw0Var.getStoriesController().B(j10, true);
        int i11 = B.f9260a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f9261b);
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

    public static void n(aw0 aw0Var, TL_stories.StoryItem storyItem) {
        aw0Var.getStoriesController().o0(aw0Var.l1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        wc.b0(aw0Var.f26702x1).G(R.raw.chats_archived, 5000, LocaleController.formatPluralString("StoryArchived", 1, new Object[0])).j();
    }

    public static void p(aw0 aw0Var, HashSet hashSet, TL_stories.StoryItem storyItem, k80 k80Var, di.a7 a7Var) {
        String formatString;
        long j10 = aw0Var.l1;
        if (hashSet.contains(Integer.valueOf(a7Var.f8375a))) {
            aw0Var.getStoriesController().c(a7Var.f8375a, j10, storyItem);
            formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, a7Var.f8376b);
        } else {
            di.h7 storiesController = aw0Var.getStoriesController();
            int i10 = a7Var.f8375a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.c0(i10, j10, arrayList);
            formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, a7Var.f8376b);
        }
        wc.b0(aw0Var.f26702x1).R(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
        k80Var.u();
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

    private void setPageOverscan(su0 su0Var) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (this.f26640b2 && su0Var != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) su0Var.getLayoutParams()) != null) {
            int i10 = marginLayoutParams.topMargin;
            int i11 = -this.f26647d2;
            if (i10 != i11 || marginLayoutParams.bottomMargin != (-this.f26650e2)) {
                marginLayoutParams.topMargin = i11;
                marginLayoutParams.bottomMargin = -this.f26650e2;
                su0Var.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public void setSearchItemVisibility(int i10) {
        org.telegram.ui.ActionBar.w0 w0Var = this.f26681p0;
        if (w0Var == null) {
            return;
        }
        if (this.H != null) {
            O(true);
        } else {
            w0Var.setVisibility(i10);
        }
    }

    public static void t(tu0 tu0Var, pv0[] pv0VarArr, boolean z10) {
        t90 t90Var;
        if (z10) {
            if (SharedConfig.fastScrollHintCount > 0 && tu0Var.F == null && !tu0Var.H && tu0Var.h.getFastScroll() != null && tu0Var.h.getFastScroll().f32623a0 && tu0Var.h.getFastScroll().getVisibility() == 0 && pv0VarArr[0].e() >= 50) {
                SharedConfig.setFastScrollHintCount(SharedConfig.fastScrollHintCount - 1);
                tu0Var.H = true;
                Context context = tu0Var.getContext();
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                textView.setText(LocaleController.getString(R.string.SharedMediaFastScrollHint));
                textView.setTextSize(1, 14.0f);
                textView.setMaxLines(3);
                int i10 = org.telegram.ui.ActionBar.y6.f23585pf;
                org.telegram.ui.ActionBar.f7.V(textView, i10, null);
                int dp = AndroidUtilities.dp(6.0f);
                int i11 = org.telegram.ui.ActionBar.y6.f23602qf;
                ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.x0(null, i11, false));
                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
                frameLayout.setBackground(c02);
                org.telegram.ui.ActionBar.f7.k(frameLayout, c02, N, null, null);
                frameLayout.addView(textView, gb1.h(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
                ?? view = new View(context);
                view.f32289a = new Random();
                Paint paint = new Paint(1);
                view.f32290b = paint;
                Paint paint2 = new Paint(1);
                view.f32291c = paint2;
                view.f32292f = 1.0f;
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
                frameLayout.addView(view, gb1.h(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                tu0Var.F = frameLayout;
                tu0Var.addView((View) frameLayout, gb1.g(-2.0f, -2));
                tu0Var.F.setAlpha(0.0f);
                tu0Var.F.setScaleX(0.8f);
                tu0Var.F.setScaleY(0.8f);
                tu0Var.F.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                tu0Var.invalidate();
                t90 t90Var2 = new t90(16, tu0Var, frameLayout);
                tu0Var.G = t90Var2;
                AndroidUtilities.runOnUIThread(t90Var2, 4000L);
            }
        } else if (tu0Var.F != null && (t90Var = tu0Var.G) != null) {
            AndroidUtilities.cancelRunOnUIThread(t90Var);
            tu0Var.G.run();
            tu0Var.G = null;
            tu0Var.F = null;
        }
    }

    public static void u(aw0 aw0Var, int i10, boolean z10) {
        tu0[] tu0VarArr = aw0Var.m0;
        if (tu0VarArr[0].E == i10) {
            return;
        }
        tu0 tu0Var = tu0VarArr[1];
        tu0Var.E = i10;
        tu0Var.setVisibility(0);
        aw0Var.t0();
        aw0Var.v1(true);
        aw0Var.f26665j1 = z10;
        aw0Var.S0();
        aw0Var.D(!aw0Var.A0(i10));
        aw0Var.C1(true);
    }

    public static int w(aw0 aw0Var, s4.h0 h0Var) {
        if (h0Var == aw0Var.f26648e0) {
            return 8;
        }
        if (h0Var == aw0Var.f26655g0) {
            return 9;
        }
        for (zv0 zv0Var : aw0Var.f26666j2.values()) {
            if (zv0Var.f35411c == h0Var) {
                return zv0Var.f35409a;
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

    public static int x(aw0 aw0Var, s4.h0 h0Var) {
        if (h0Var == aw0Var.f26652f0) {
            return 8;
        }
        if (h0Var == aw0Var.f26658h0) {
            return 9;
        }
        for (zv0 zv0Var : aw0Var.f26666j2.values()) {
            if (zv0Var.d == h0Var) {
                return zv0Var.f35409a;
            }
        }
        return -1;
    }

    public final void A(yu0 yu0Var, org.telegram.ui.ActionBar.r2 r2Var, long j10, int i10) {
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
        yu0Var.Z(R.drawable.media_share, new kg(this, sb3, r2Var, 22), LocaleController.getString(R.string.StoriesAlbumMenuShareLink), false, true);
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
        org.telegram.ui.ActionBar.w0 w0Var = this.f26695v0;
        if (w0Var != null) {
            if (!this.f26702x1.getMessagesController().isPeerNoForwards(this.l1) && !r0()) {
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
                int i10 = org.telegram.ui.ActionBar.y6.f23767z8;
                org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(p0(i10), 5, -1);
                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
                w0Var.setBackground(g02);
                org.telegram.ui.ActionBar.f7.k(w0Var, g02, null, N, this.H1);
            }
        }
    }

    public final void B(yu0 yu0Var) {
        float f7;
        final View[] viewArr = {yu0Var.Z(R.drawable.msg_zoomin, new Runnable(this) {
            public final aw0 f29973b;

            {
                this.f29973b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        aw0 aw0Var = this.f29973b;
                        aw0Var.getClass();
                        View[] viewArr2 = viewArr;
                        aw0Var.K1(viewArr2[0], viewArr2[1]);
                        return;
                    default:
                        aw0 aw0Var2 = this.f29973b;
                        aw0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        aw0Var2.L1(viewArr3[0], viewArr3[1]);
                        return;
                }
            }
        }, LocaleController.getString(R.string.MediaZoomIn), false, false), yu0Var.Z(R.drawable.msg_zoomout, new Runnable(this) {
            public final aw0 f29973b;

            {
                this.f29973b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        aw0 aw0Var = this.f29973b;
                        aw0Var.getClass();
                        View[] viewArr2 = viewArr;
                        aw0Var.K1(viewArr2[0], viewArr2[1]);
                        return;
                    default:
                        aw0 aw0Var2 = this.f29973b;
                        aw0Var2.getClass();
                        View[] viewArr3 = viewArr;
                        aw0Var2.L1(viewArr3[0], viewArr3[1]);
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
        vs0 vs0Var = this.f26635a0;
        if (vs0Var != null) {
            int dp = AndroidUtilities.dp(48.0f) + this.f26644c2;
            ws wsVar = this.R0;
            if (wsVar != null) {
                i10 = (int) wsVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i10 = 0;
            }
            vs0Var.setPaddingTop(dp + i10);
        }
    }

    public final void C(su0 su0Var, int i10, SparseBooleanArray sparseBooleanArray) {
        int childCount = su0Var.getChildCount();
        c10 c10Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = su0Var.getChildAt(i11);
            if (childAt instanceof c10) {
                c10Var = childAt;
            }
        }
        if (c10Var != null) {
            su0Var.removeView(c10Var);
        }
        getViewTreeObserver().addOnPreDrawListener(new zt0(this, su0Var, sparseBooleanArray, c10Var, i10));
    }

    public boolean C0() {
        return false;
    }

    public final void C1(boolean z10) {
        vs0 vs0Var;
        zs0 zs0Var;
        boolean z11 = true;
        O(true);
        ak0 ak0Var = this.f26693u0;
        if (ak0Var == null) {
            return;
        }
        float f7 = 0.0f;
        if (!this.X0 && (((vs0Var = this.f26635a0) == null || !vs0Var.g()) && ((zs0Var = this.f26638b0) == null || !zs0Var.f41111f))) {
            f7 = Utilities.clamp(this.f26683q0 + this.f26686r0, 1.0f, 0.0f);
        }
        ak0Var.setAlpha(f7);
        if (z10) {
            if (h0(1.0f) <= 0.5f) {
                z11 = false;
            }
            D(z11);
        } else if (this.f26706z0 == 2) {
            if (this.f26686r0 <= 0.1f) {
                z11 = false;
            }
            D(z11);
        } else {
            if (this.f26683q0 >= 0.1f) {
                z11 = false;
            }
            D(z11);
        }
    }

    public final void D(boolean z10) {
        int i10;
        ak0 ak0Var = this.f26693u0;
        if (ak0Var != null && this.Y1 != z10) {
            this.Y1 = z10;
            if (!z10 && ak0Var.getAnimatedDrawable().f34733a0 < 20) {
                ak0Var.getAnimatedDrawable().P(0);
            } else {
                xj0 animatedDrawable = ak0Var.getAnimatedDrawable();
                if (this.Y1) {
                    i10 = 50;
                } else {
                    i10 = 100;
                }
                animatedDrawable.P(i10);
            }
            ak0Var.getAnimatedDrawable().start();
        }
    }

    public boolean D0() {
        return false;
    }

    public final void D1(tu0 tu0Var) {
        boolean z10;
        boolean b12 = tu0Var.h.b1();
        if (b12) {
            tu0Var.h.setSectionsDrawBackground(this.f26640b2);
        }
        if (this.f26640b2 && !b12 && tu0Var.E != 15) {
            z10 = true;
        } else {
            z10 = false;
        }
        tu0Var.setDrawPageBackground(z10);
        if (tu0Var.E == 15) {
            Drawable drawable = tu0Var.O;
            if (drawable == null) {
                drawable = tu0Var.getBackground();
            }
            Drawable e = fi.o6.e(drawable, this.f26702x1.getCurrentAccount(), this.l1, org.telegram.ui.ActionBar.y6.I.q());
            if (!this.f26640b2) {
                tu0Var.setWallpaper(null);
                tu0Var.setBackground(e);
                tu0Var.setOutlineProvider(new ag.v0(18));
                tu0Var.setClipToOutline(true);
                return;
            }
            tu0Var.setBackground(null);
            tu0Var.setClipToOutline(false);
            tu0Var.setWallpaper(e);
            return;
        }
        tu0Var.setClipToOutline(false);
        tu0Var.setBackground(null);
        tu0Var.setWallpaper(null);
    }

    public final void E(int i10) {
        int i11;
        tu0 d02 = d0(this.f26687r1);
        this.f26688s = -1;
        if (d02 != null) {
            d02.h.C0();
            this.f26690s1 = i10;
            d02.f33157n.setVisibility(0);
            if (w0(this.f26687r1)) {
                d02.f33157n.setAdapter(u1(this.f26687r1));
            } else {
                d02.f33157n.setAdapter(this.K);
            }
            su0 su0Var = d02.f33157n;
            int paddingLeft = su0Var.getPaddingLeft();
            su0 su0Var2 = d02.f33157n;
            int g02 = g0(d02.E);
            su0Var2.f32682h3 = g02;
            int paddingRight = d02.f33157n.getPaddingRight();
            su0 su0Var3 = d02.f33157n;
            int f02 = f0(D0());
            su0Var3.f32683i3 = f02;
            su0Var.setPadding(paddingLeft, g02, paddingRight, f02);
            d02.f33158r.z1(i10);
            d02.f33157n.a0();
            int i12 = 0;
            while (true) {
                tu0[] tu0VarArr = this.m0;
                if (i12 >= tu0VarArr.length) {
                    break;
                }
                tu0 tu0Var = tu0VarArr[i12];
                if (tu0Var != null && ((i11 = tu0Var.E) == 0 || w0(i11))) {
                    AndroidUtilities.updateVisibleRows(tu0VarArr[i12].h);
                }
                i12++;
            }
            this.f26684q1 = true;
            if (this.f26687r1 == 0) {
                this.f26696v1[0].g(true);
            }
            this.f26682p1 = 0.0f;
            d1();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.L1.lock();
            ofFloat.addUpdateListener(new tt0(this, d02, 1));
            ofFloat.addListener(new hi.b3(this, w0(d02.E) ? 1 : 0, i10, 2));
            ofFloat.setInterpolator(ds.f27584f);
            ofFloat.setStartDelay(100L);
            ofFloat.setDuration(350L);
            ofFloat.start();
        }
    }

    public final void E1(tu0 tu0Var) {
        boolean z10;
        float f7;
        int i10;
        float f10;
        float f11;
        int i11 = tu0Var.E;
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
        FrameLayout.LayoutParams h = gb1.h(-1, -1.0f, 119, f7, f12, f10, f11);
        h.topMargin = k0(tu0Var.E) + h.topMargin;
        ViewGroup.LayoutParams layoutParams = tu0Var.f33159s.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.leftMargin == h.leftMargin && layoutParams2.topMargin == h.topMargin && layoutParams2.rightMargin == h.rightMargin && layoutParams2.bottomMargin == h.bottomMargin && layoutParams2.gravity == h.gravity) {
                return;
            }
        }
        tu0Var.f33159s.setLayoutParams(h);
    }

    public final boolean F() {
        boolean y02 = y0();
        long j10 = this.l1;
        org.telegram.ui.ActionBar.r2 r2Var = this.f26702x1;
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
            vs0 vs0Var = this.f26635a0;
            if (vs0Var == null || !vs0Var.g()) {
                zs0 zs0Var = this.f26638b0;
                if ((zs0Var == null || !zs0Var.f41111f) && !this.f26684q1 && !this.f26662i1) {
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
            tu0[] tu0VarArr = this.m0;
            if (i10 < tu0VarArr.length) {
                int childCount = tu0VarArr[i10].h.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = tu0VarArr[i10].h.getChildAt(i11);
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
        pv0[] pv0VarArr = this.f26696v1;
        pv0VarArr[i10].f31704a.clear();
        pv0VarArr[i10].f31705b[0].clear();
        pv0VarArr[i10].f31705b[1].clear();
        pv0 pv0Var = pv0VarArr[i10];
        pv0Var.f31710j[0] = i11;
        pv0Var.f31709i[0] = false;
        pv0Var.f31712l = false;
        pv0Var.f31713m = i12;
        pv0Var.f31714n = (pv0Var.e() - i12) - 1;
        pv0 pv0Var2 = pv0VarArr[i10];
        if (pv0Var2.f31714n < 0) {
            pv0Var2.f31714n = 0;
        }
        pv0Var2.f31711k = i11;
        pv0Var2.f31715o = true;
        pv0Var2.f31708g = false;
        pv0Var2.f31716p++;
        tu0 d02 = d0(i10);
        if (d02 != null && d02.h.getAdapter() != null) {
            d02.h.getAdapter().l();
        }
        if (z10) {
            int i13 = 0;
            while (true) {
                tu0[] tu0VarArr = this.m0;
                if (i13 < tu0VarArr.length) {
                    tu0 tu0Var = tu0VarArr[i13];
                    if (tu0Var.E == i10) {
                        tu0Var.f33160w.h1(Math.min(pv0VarArr[i10].e() - 1, pv0VarArr[i10].f31713m), 0);
                    }
                    i13++;
                } else {
                    return;
                }
            }
        }
    }

    public final void G1(float f7) {
        org.telegram.ui.ActionBar.w0 w0Var = this.f26678o0;
        if (w0Var == null) {
            return;
        }
        tu0[] tu0VarArr = this.m0;
        tu0 tu0Var = tu0VarArr[1];
        float f10 = 0.0f;
        if (tu0Var != null && tu0Var.E == 11) {
            f10 = 0.0f + f7;
        }
        int i10 = 0;
        tu0 tu0Var2 = tu0VarArr[0];
        if (tu0Var2 != null && tu0Var2.E == 11) {
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
        tu0 tu0Var;
        tu0[] tu0VarArr = this.m0;
        if (tu0VarArr != null && (tu0Var = tu0VarArr[0]) != null) {
            boolean w02 = w0(tu0Var.E);
            int i10 = this.f26679o1[w02 ? 1 : 0];
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
                final int i12 = f26632p2[i11];
                pv0[] pv0VarArr = this.f26696v1;
                if (!pv0VarArr[i12].h || z10) {
                    long j11 = this.l1;
                    if (!DialogObject.isEncryptedDialog(j11)) {
                        pv0VarArr[i12].h = false;
                        TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
                        if (i12 == 0) {
                            int i13 = pv0VarArr[i12].f31717q;
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
                        org.telegram.ui.ActionBar.r2 r2Var = this.f26702x1;
                        tL_messages_getSearchResultsPositions.peer = r2Var.getMessagesController().getInputPeer(j11);
                        if (i10 != 0 && r2Var.getUserConfig().getClientUserId() == j11) {
                            tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                            tL_messages_getSearchResultsPositions.saved_peer_id = r2Var.getMessagesController().getInputPeer(j10);
                        }
                        final int i14 = pv0VarArr[i12].f31716p;
                        ConnectionsManager.getInstance(r2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(r2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new as0(aw0.this, tL_error, i14, i12, tLObject, 0));
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
        org.telegram.ui.ActionBar.w0 w0Var = this.f26678o0;
        if (w0Var == null) {
            return;
        }
        boolean z10 = true;
        tu0 tu0Var = this.m0[1];
        if (tu0Var == null || tu0Var.E != 11) {
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
        tu0 tu0Var;
        tu0[] tu0VarArr = this.m0;
        if (tu0VarArr == null || (tu0Var = tu0VarArr[0]) == null) {
            return false;
        }
        if (this.f26672m1 && w0(tu0Var.E)) {
            return false;
        }
        boolean w02 = w0(tu0VarArr[0].E);
        int i10 = this.f26679o1[w02 ? 1 : 0];
        if (i10 == e0(w02 ? 1 : 0, i10, false)) {
            return false;
        }
        return true;
    }

    public final void I0(int i10) {
        int i11;
        int i12 = 2;
        pv0[] pv0VarArr = this.f26696v1;
        if (i10 == 0) {
            int i13 = pv0VarArr[0].f31717q;
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
        pv0VarArr[i10].f31708g = true;
        org.telegram.ui.ActionBar.r2 r2Var = this.f26702x1;
        r2Var.getMediaDataController().loadMedia(this.l1, 50, 0, pv0VarArr[i10].f31711k, i11, this.F, 1, r2Var.getClassGuid(), pv0VarArr[i10].f31716p, null, null);
    }

    public final void I1() {
        boolean z10;
        int i10;
        di.z6 z6Var;
        boolean y02 = y0();
        org.telegram.ui.ActionBar.w0 w0Var = this.f26704y0;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f26701x0;
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
                SparseArray[] sparseArrayArr = this.f26639b1;
                if (i12 < sparseArrayArr[0].size()) {
                    MessageObject messageObject = (MessageObject) sparseArrayArr[0].valueAt(i12);
                    hu0 hu0Var = this.f26648e0;
                    if (hu0Var != null && (z6Var = hu0Var.f34830s) != null && !z6Var.m(messageObject.getId())) {
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
        tu0[] tu0VarArr;
        mm0 mm0Var;
        us0 us0Var;
        fu0 fu0Var;
        vs0 vs0Var;
        View[] viewPages;
        for (tu0 tu0Var : this.m0) {
            if (tu0Var != null && tu0Var.getVisibility() == 0) {
                if (tu0Var.O != null) {
                    RectF rectF2 = this.f26663i2;
                    if (jh.k.c(tu0Var, viewGroup, rectF2)) {
                        canvas.save();
                        canvas.translate(rectF2.left, rectF2.top);
                        tu0Var.e(canvas);
                        canvas.restore();
                    }
                }
                if (tu0Var.E == 14 && (vs0Var = this.f26635a0) != null && vs0Var.getParent() == tu0Var) {
                    for (View view : vs0Var.h.getViewPages()) {
                        if ((view instanceof zh.m2) && view.getVisibility() == 0) {
                            zh.h2 h2Var = ((zh.m2) view).f53143f;
                            ih.d.a(h2Var, canvas, rectF, h2Var, viewGroup);
                        }
                    }
                } else {
                    if (tu0Var.E == 12 && (fu0Var = this.V) != null && fu0Var.getParent() == tu0Var) {
                        mm0Var = fu0Var.f45518a.f44468x0;
                    } else if (tu0Var.E == 13 && (us0Var = this.W) != null && us0Var.getParent() == tu0Var) {
                        mm0Var = us0Var.getCurrentListView();
                    } else {
                        mm0Var = tu0Var.h;
                    }
                    if (mm0Var != null && mm0Var.getVisibility() == 0) {
                        ih.d.a(mm0Var, canvas, rectF, mm0Var, viewGroup);
                    }
                }
            }
        }
    }

    public int J0() {
        return 0;
    }

    public void J1(boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aw0.J1(boolean):void");
    }

    public final void K() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aw0.K():void");
    }

    public final Boolean K1(View view, View view2) {
        if (!this.f26684q1) {
            tu0[] tu0VarArr = this.m0;
            boolean z10 = false;
            tu0 tu0Var = tu0VarArr[0];
            if (tu0Var != null) {
                int i10 = tu0Var.E;
                this.f26687r1 = i10;
                boolean w02 = w0(i10);
                int[] iArr = this.f26679o1;
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
                    } else if (j0(tu0VarArr[0].E) >= 5 || E0(tu0VarArr[0].E)) {
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
        ut0 ut0Var = this.K0;
        if (!ut0Var.d(ut0Var.getCurrentTabId())) {
            int firstTabId = ut0Var.getFirstTabId();
            ut0Var.setInitialTabId(firstTabId);
            this.m0[0].E = firstTabId;
            v1(false);
        }
    }

    public final Boolean L1(View view, View view2) {
        if (!this.f26684q1) {
            tu0[] tu0VarArr = this.m0;
            boolean z10 = false;
            tu0 tu0Var = tu0VarArr[0];
            if (tu0Var != null) {
                if (!this.f26672m1 || !w0(tu0Var.E)) {
                    int i10 = tu0VarArr[0].E;
                    this.f26687r1 = i10;
                    boolean w02 = w0(i10);
                    int[] iArr = this.f26679o1;
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
                        } else if (j0(tu0VarArr[0].E) >= 5 || E0(tu0VarArr[0].E)) {
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

    public final void M(org.telegram.ui.Components.tu0 r34, org.telegram.ui.Components.mm0 r35, s4.c0 r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aw0.M(org.telegram.ui.Components.tu0, org.telegram.ui.Components.mm0, s4.c0):void");
    }

    public final void M0() {
        di.z6 z6Var;
        di.z6 z6Var2;
        this.J1.removeAllObservers();
        hu0 hu0Var = this.f26648e0;
        if (hu0Var != null && (z6Var2 = hu0Var.f34830s) != null && z6Var2 != null) {
            z6Var2.z(hu0Var.v);
        }
        ts0 ts0Var = this.f26655g0;
        if (ts0Var != null && (z6Var = ts0Var.f34830s) != null && z6Var != null) {
            z6Var.z(ts0Var.v);
        }
        for (zv0 zv0Var : this.f26666j2.values()) {
            yv0 yv0Var = zv0Var.f35411c;
            di.z6 z6Var3 = yv0Var.f34830s;
            if (z6Var3 != null && z6Var3 != null) {
                z6Var3.z(yv0Var.v);
            }
        }
    }

    public final boolean N(MotionEvent motionEvent) {
        float f7;
        s4.h0 h0Var;
        boolean z10;
        us0 us0Var;
        float f10;
        boolean z11;
        tu0[] tu0VarArr = this.m0;
        int i10 = tu0VarArr[0].E;
        if (i10 == 13 && (us0Var = this.W) != null) {
            View currentView = us0Var.f10019n.getCurrentView();
            if (currentView instanceof ei.r) {
                ei.r rVar = (ei.r) currentView;
                ei.l lVar = rVar.v;
                ei.i iVar = rVar.f10004f;
                if (rVar.f10001a != null && rVar.getParent() != null) {
                    if (!rVar.f10002b || rVar.K) {
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
                                            rVar.f10003c = 0.0f;
                                        } else {
                                            if (z12) {
                                                f10 = org.telegram.messenger.t.y(2.0f, rVar.Q, 1.0f, 1.0f);
                                            } else {
                                                f10 = (1.0f - rVar.Q) / 0.5f;
                                            }
                                            rVar.f10003c = Math.max(0.0f, Math.min(1.0f, f10));
                                        }
                                        float f11 = rVar.f10003c;
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
                                            if (rVar.f10003c == 0.0f) {
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
            if (!this.f26684q1 || this.f26634a) {
                if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                    if (motionEvent.getActionMasked() == 2 && (this.f26634a || this.f26641c)) {
                        int i18 = -1;
                        int i19 = -1;
                        for (int i20 = 0; i20 < motionEvent.getPointerCount(); i20++) {
                            if (this.e == motionEvent.getPointerId(i20)) {
                                i18 = i20;
                            }
                            if (this.f26651f == motionEvent.getPointerId(i20)) {
                                i19 = i20;
                            }
                        }
                        if (i18 != -1 && i19 != -1) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(i19) - motionEvent.getX(i18), motionEvent.getY(i19) - motionEvent.getY(i18))) / this.h;
                            this.f26674n = hypot2;
                            if (!this.f26634a && (hypot2 > 1.01f || hypot2 < 0.99f)) {
                                this.f26634a = true;
                                if (hypot2 > 1.0f) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                this.f26685r = z10;
                                n1(z10);
                            }
                            if (this.f26634a) {
                                boolean z13 = this.f26685r;
                                if ((z13 && this.f26674n < 1.0f) || (!z13 && this.f26674n > 1.0f)) {
                                    this.f26682p1 = 0.0f;
                                } else {
                                    if (z13) {
                                        f7 = org.telegram.messenger.t.y(2.0f, this.f26674n, 1.0f, 1.0f);
                                    } else {
                                        f7 = (1.0f - this.f26674n) / 0.5f;
                                    }
                                    this.f26682p1 = Math.max(0.0f, Math.min(1.0f, f7));
                                }
                                float f12 = this.f26682p1;
                                if (f12 == 1.0f || f12 == 0.0f) {
                                    if (w0(this.f26687r1)) {
                                        h0Var = t1(this.f26687r1);
                                    } else {
                                        h0Var = this.J;
                                    }
                                    if (this.f26682p1 == 1.0f) {
                                        int i21 = this.f26690s1;
                                        int ceil2 = (((int) Math.ceil(this.f26688s / this.f26690s1)) * i21) + ((int) ((this.B1 / (tu0VarArr[0].h.getMeasuredWidth() - ((int) (tu0VarArr[0].h.getMeasuredWidth() / this.f26690s1)))) * (i21 - 1)));
                                        if (ceil2 >= h0Var.h()) {
                                            ceil2 = h0Var.h() - 1;
                                        }
                                        this.f26688s = ceil2;
                                    }
                                    a0();
                                    if (this.f26682p1 == 0.0f) {
                                        this.f26685r = !this.f26685r;
                                    }
                                    n1(this.f26685r);
                                    this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                tu0VarArr[0].h.invalidate();
                                tu0 tu0Var = tu0VarArr[0];
                                if (tu0Var.F != null) {
                                    tu0Var.invalidate();
                                }
                            }
                        } else {
                            this.f26637b = false;
                            this.f26641c = false;
                            this.f26634a = false;
                            a0();
                            return false;
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.e == motionEvent.getPointerId(0) && this.f26651f == motionEvent.getPointerId(1)) || (this.e == motionEvent.getPointerId(1) && this.f26651f == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.f26634a) {
                        this.f26641c = false;
                        this.f26637b = false;
                        this.f26634a = false;
                        a0();
                    }
                } else {
                    if (this.f26637b && !this.f26634a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.f26674n = 1.0f;
                        this.e = motionEvent.getPointerId(0);
                        this.f26651f = motionEvent.getPointerId(1);
                        tu0VarArr[0].h.I0(false);
                        tu0VarArr[0].h.cancelLongPress();
                        tu0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.f26697w = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - tu0VarArr[0].getX());
                        int y10 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - tu0VarArr[0].getY());
                        int i22 = this.f26697w;
                        this.f26688s = -1;
                        int top2 = y10 - tu0VarArr[0].h.getTop();
                        if (getY() != 0.0f && this.E == 1) {
                            top2 = 0;
                        }
                        for (int i23 = 0; i23 < tu0VarArr[0].h.getChildCount(); i23++) {
                            View childAt2 = tu0VarArr[0].h.getChildAt(i23);
                            Rect rect2 = this.f26700x;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i22, top2)) {
                                tu0VarArr[0].h.getClass();
                                this.f26688s = RecyclerView.S(childAt2);
                                this.v = childAt2.getTop();
                            }
                        }
                        if (this.F1.U() && this.f26688s == -1) {
                            this.f26688s = (int) (((this.f26679o1[w0(tu0VarArr[0].E) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i22 / tu0VarArr[0].h.getMeasuredWidth(), 0.0f))) + tu0VarArr[0].f33160w.L0());
                            this.v = 0;
                        }
                        this.f26641c = true;
                    }
                    if (motionEvent.getActionMasked() == 0 && ((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - tu0VarArr[0].getY() > this.f26644c2) {
                        this.f26637b = true;
                    }
                }
                return this.f26634a;
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
        if (messageObject != null && !this.f26684q1) {
            zs0 zs0Var = this.f26638b0;
            if (zs0Var == null || !zs0Var.f41111f) {
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
                        SparseArray[] sparseArrayArr = this.f26639b1;
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            sparseArrayArr[c10].remove(messageObject.getId());
                            if (!messageObject.canDeleteMessage(false, null)) {
                                this.f26643c1--;
                            }
                        } else {
                            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                                sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                                if (!messageObject.canDeleteMessage(false, null)) {
                                    this.f26643c1++;
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
                            if (this.f26643c1 == 0) {
                                i12 = 0;
                            } else {
                                i12 = 8;
                            }
                            this.f26675n0.setVisibility(i12);
                            org.telegram.ui.ActionBar.w0 w0Var = this.f26698w0;
                            if (w0Var != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14 && sparseArrayArr[0].size() == 1) {
                                    i13 = 0;
                                } else {
                                    i13 = 8;
                                }
                                w0Var.setVisibility(i13);
                            }
                            org.telegram.ui.ActionBar.w0 w0Var2 = this.f26695v0;
                            if (w0Var2 != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                                    i15 = 0;
                                }
                                w0Var2.setVisibility(i15);
                            }
                            I1();
                        }
                        this.f26646d1 = false;
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
                    ft0 ft0Var = this.f26692t1;
                    pv0[] pv0VarArr = this.f26696v1;
                    org.telegram.ui.ActionBar.r2 r2Var = this.f26702x1;
                    if (i11 == 0) {
                        pv0 pv0Var = pv0VarArr[i11];
                        int i16 = i10 - pv0Var.f31713m;
                        if (i16 >= 0 && i16 < pv0Var.f31704a.size()) {
                            PhotoViewer.u1().M2(null, r2Var, null);
                            PhotoViewer.u1().d2(pv0VarArr[i11].f31704a, i16, this.l1, this.f26649e1, this.F, ft0Var);
                        }
                    } else if (i11 != 2 && i11 != 4) {
                        if (i11 == 5) {
                            PhotoViewer.u1().M2(null, r2Var, null);
                            int indexOf = pv0VarArr[i11].f31704a.indexOf(messageObject);
                            if (indexOf < 0) {
                                PhotoViewer.u1().d2(org.telegram.messenger.t.l(messageObject), 0, 0L, 0L, 0L, ft0Var);
                            } else {
                                PhotoViewer.u1().d2(pv0VarArr[i11].f31704a, indexOf, this.l1, this.f26649e1, this.F, ft0Var);
                            }
                        } else if (i11 == 1) {
                            if (view instanceof org.telegram.ui.Cells.o7) {
                                org.telegram.ui.Cells.o7 o7Var2 = (org.telegram.ui.Cells.o7) view;
                                TLRPC.Document document = messageObject.getDocument();
                                if (o7Var2.G) {
                                    if (messageObject.canPreviewDocument()) {
                                        PhotoViewer.u1().M2(null, r2Var, null);
                                        int indexOf2 = pv0VarArr[i11].f31704a.indexOf(messageObject);
                                        if (indexOf2 < 0) {
                                            PhotoViewer.u1().d2(org.telegram.messenger.t.l(messageObject), 0, 0L, 0L, 0L, ft0Var);
                                            return;
                                        }
                                        PhotoViewer.u1().d2(pv0VarArr[i11].f31704a, indexOf2, this.l1, this.f26649e1, this.F, ft0Var);
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
                                        dv.I(r2Var, messageObject, this.f26692t1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
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
                            xv0 t12 = t1(i11);
                            if (t12 != null) {
                                z6Var = t12.f34830s;
                            }
                            if (z6Var != null) {
                                di.y9 orCreateStoryViewer = r2Var.getOrCreateStoryViewer();
                                Context context = getContext();
                                int id2 = messageObject.getId();
                                di.q7 a2 = di.q7.a(this.m0[0].h);
                                a2.e = new tv(z6Var, 21);
                                if ((r2Var instanceof ProfileActivity) && ((ProfileActivity) r2Var).f36073s1) {
                                    i14 = AndroidUtilities.dp(68.0f);
                                }
                                a2.f9066s += i14;
                                orCreateStoryViewer.C(context, id2, z6Var, a2);
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
            org.telegram.ui.ActionBar.w0 w0Var = this.f26681p0;
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
        zs0 zs0Var;
        char c10;
        int i11;
        int i12;
        final TL_stories.StoryItem storyItem;
        hu0 hu0Var;
        di.z6 z6Var;
        if (!this.E1) {
            org.telegram.ui.ActionBar.r2 r2Var = this.f26702x1;
            if (r2Var.getParentActivity() != null && messageObject != null && ((zs0Var = this.f26638b0) == null || !zs0Var.f41111f)) {
                AndroidUtilities.hideKeyboard(r2Var.getParentActivity().getCurrentFocus());
                long j10 = this.l1;
                int i13 = 8;
                if (z10 && ((E0(getClosestTab()) || getClosestTab() == 8) && !this.E1)) {
                    if (view instanceof org.telegram.ui.Cells.w7) {
                        org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
                        w7Var.k(w7Var.f25648n, w7Var.f25653r, true);
                    }
                    TL_stories.StoryItem storyItem2 = messageObject.storyItem;
                    if (storyItem2 != null) {
                        HashSet hashSet = new HashSet();
                        ArrayList<Integer> arrayList = storyItem2.albums;
                        if (arrayList != null) {
                            hashSet.addAll(arrayList);
                        }
                        boolean E0 = E0(getClosestTab());
                        k80 I = k80.I(r2Var, view);
                        k80 J = I.J();
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.zt0(I, 26), false);
                        J.k();
                        k80.f(J, getStoriesController().B(j10, true), hashSet, true, new kg(this, storyItem2, I, 21), new di.y2(this, hashSet, storyItem2, I, 10));
                        I.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddToAlbum), new hi.o2(I, J, 9), false);
                        I.k();
                        I.c(R.drawable.msg_select, LocaleController.getString(R.string.StoriesAlbumMenuSelect), new ai.h1(this, messageObject, view, i10, 29), false);
                        if (E0) {
                            int q12 = q1(getClosestTab());
                            String w10 = getStoriesController().w(q12, j10);
                            I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new yr0(this, q12, 0), false);
                            storyItem = storyItem2;
                            I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.StoriesAlbumMenuRemoveFromAlbum), new zr0(this, q12, storyItem, w10, 0), false);
                        } else {
                            storyItem = storyItem2;
                            if (getClosestTab() == 8 && (hu0Var = this.f26648e0) != null && (z6Var = hu0Var.f34830s) != null) {
                                if (z6Var.m(storyItem.f22264id)) {
                                    I.c(R.drawable.chats_unpin, LocaleController.getString(R.string.StoriesAlbumMenuUnpin), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r1) {
                                                case 0:
                                                    aw0 aw0Var = this;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(aw0Var.getContext(), 0, aw0Var.H1);
                                                    alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                    alertDialog$Builder.f22366a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new js0(aw0Var, storyItem));
                                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new qd0(19));
                                                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                                                    e2Var.show();
                                                    e2Var.i();
                                                    return;
                                                case 1:
                                                    aw0 aw0Var2 = this;
                                                    aw0Var2.getClass();
                                                    aw0Var2.Z0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22264id))), false);
                                                    return;
                                                case 2:
                                                    aw0 aw0Var3 = this;
                                                    aw0Var3.getClass();
                                                    aw0Var3.Z0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22264id))), true);
                                                    return;
                                                default:
                                                    aw0.n(this, storyItem);
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
                                                    aw0 aw0Var = this;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(aw0Var.getContext(), 0, aw0Var.H1);
                                                    alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                    alertDialog$Builder.f22366a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new js0(aw0Var, storyItem));
                                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new qd0(19));
                                                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                                                    e2Var.show();
                                                    e2Var.i();
                                                    return;
                                                case 1:
                                                    aw0 aw0Var2 = this;
                                                    aw0Var2.getClass();
                                                    aw0Var2.Z0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22264id))), false);
                                                    return;
                                                case 2:
                                                    aw0 aw0Var3 = this;
                                                    aw0Var3.getClass();
                                                    aw0Var3.Z0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22264id))), true);
                                                    return;
                                                default:
                                                    aw0.n(this, storyItem);
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
                                            aw0 aw0Var = this;
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(aw0Var.getContext(), 0, aw0Var.H1);
                                            alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                            alertDialog$Builder.f22366a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new js0(aw0Var, storyItem));
                                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new qd0(19));
                                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                                            e2Var.show();
                                            e2Var.i();
                                            return;
                                        case 1:
                                            aw0 aw0Var2 = this;
                                            aw0Var2.getClass();
                                            aw0Var2.Z0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22264id))), false);
                                            return;
                                        case 2:
                                            aw0 aw0Var3 = this;
                                            aw0Var3.getClass();
                                            aw0Var3.Z0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22264id))), true);
                                            return;
                                        default:
                                            aw0.n(this, storyItem);
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
                                        aw0 aw0Var = this;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(aw0Var.getContext(), 0, aw0Var.H1);
                                        alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                        alertDialog$Builder.f22366a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new js0(aw0Var, storyItem));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new qd0(19));
                                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                                        e2Var.show();
                                        e2Var.i();
                                        return;
                                    case 1:
                                        aw0 aw0Var2 = this;
                                        aw0Var2.getClass();
                                        aw0Var2.Z0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22264id))), false);
                                        return;
                                    case 2:
                                        aw0 aw0Var3 = this;
                                        aw0Var3.getClass();
                                        aw0Var3.Z0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22264id))), true);
                                        return;
                                    default:
                                        aw0.n(this, storyItem);
                                        return;
                                }
                            }
                        }, true);
                        I.f29848i = 3;
                        I.f29868u = true;
                        I.v = true;
                        I.L = true;
                        I.M = 3;
                        Point point = AndroidUtilities.displaySize;
                        Point point2 = AndroidUtilities.displaySize;
                        int min = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point2.x, point2.y) * 0.4333f) * 3.0f) / 4.0f));
                        I.N = min;
                        I.O = (min * 4) / 3;
                        I.f29867t = true;
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
                    SparseArray[] sparseArrayArr = this.f26639b1;
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.f26643c1++;
                    }
                    if (this.f26643c1 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    this.f26675n0.setVisibility(i11);
                    org.telegram.ui.ActionBar.w0 w0Var = this.f26698w0;
                    if (w0Var != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        } else {
                            i12 = 8;
                        }
                        w0Var.setVisibility(i12);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.f26695v0;
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
                    this.f26646d1 = false;
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
        tu0[] tu0VarArr = this.m0;
        tu0 tu0Var = tu0VarArr[0];
        if (tu0Var != null && tu0VarArr[1] != null) {
            float f10 = 0.0f;
            zs0 zs0Var = this.f26638b0;
            if (zs0Var != null) {
                if (w0(tu0Var.E) && tu0VarArr[0].E != 9) {
                    c10 = 1;
                } else {
                    c10 = 0;
                }
                if (tu0VarArr[1].getVisibility() == 0) {
                    if (w0(tu0VarArr[1].E) && tu0VarArr[1].E != 9) {
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
                        measuredWidth = tu0VarArr[0].getMeasuredWidth();
                    }
                    zs0Var.setTranslationX(measuredWidth);
                } else {
                    zs0Var.setTranslationX(tu0VarArr[c10 ^ 1].getTranslationX());
                    abs = 1.0f - (Math.abs(zs0Var.getTranslationX()) / zs0Var.getMeasuredWidth());
                }
                float f11 = 0.0f;
                for (int i10 = 0; i10 < tu0VarArr.length; i10++) {
                    if (tu0VarArr[i10].getVisibility() == 0) {
                        dt0 dt0Var = tu0VarArr[i10].h;
                        if (dt0Var.getChildCount() == 0) {
                            childAt = null;
                        } else {
                            childAt = dt0Var.getChildAt(0);
                        }
                        if (childAt == null) {
                            R = -1;
                        } else {
                            R = RecyclerView.R(childAt);
                        }
                        if (R == 0) {
                            f7 = childAt.getY() - dt0Var.getPaddingTop();
                        } else if (dt0Var.getChildCount() == 0) {
                            f7 = 0.0f;
                        } else {
                            f7 = -AndroidUtilities.dp(48.0f);
                        }
                        f11 += Utilities.clamp01(1.0f - (tu0VarArr[i10].getTranslationX() / tu0VarArr[i10].getMeasuredWidth())) * f7;
                    }
                }
                float clamp01 = Utilities.clamp01(1.0f - ((-f11) / AndroidUtilities.dpf2(48.0f)));
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
                zs0Var.setAlpha(clamp01);
                zs0Var.setScaleX(lerp);
                zs0Var.setScaleY(lerp);
                zs0Var.setTranslationY(this.N1 + f11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aw0.Q():boolean");
    }

    public final void Q0(float f7) {
        tu0 tu0Var;
        int i10;
        int i11;
        tu0 tu0Var2;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        tu0[] tu0VarArr = this.m0;
        if (i12 != 0 || tu0VarArr[1].getVisibility() == 0) {
            if (this.f26665j1) {
                tu0VarArr[0].setTranslationX((-f7) * tu0Var2.getMeasuredWidth());
                tu0VarArr[1].setTranslationX(tu0VarArr[0].getMeasuredWidth() - (tu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                tu0VarArr[0].setTranslationX(tu0Var.getMeasuredWidth() * f7);
                tu0VarArr[1].setTranslationX((tu0VarArr[0].getMeasuredWidth() * f7) - tu0VarArr[0].getMeasuredWidth());
            }
            T0(getTabProgress());
            float h02 = h0(f7);
            this.f26686r0 = h02;
            int i13 = 4;
            if (h02 != 0.0f && G() && !x0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            this.f26691t0.setVisibility(i10);
            org.telegram.ui.ActionBar.w0 w0Var = this.f26681p0;
            if (w0Var != null && !G()) {
                if (D0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                setSearchItemVisibility(i11);
                this.f26683q0 = 0.0f;
            } else {
                this.f26683q0 = i0(f7);
                H1();
            }
            C1(false);
            if (i12 == 0) {
                tu0 tu0Var3 = tu0VarArr[0];
                tu0VarArr[0] = tu0VarArr[1];
                tu0VarArr[1] = tu0Var3;
                tu0Var3.setVisibility(8);
                if (w0Var != null && this.f26706z0 == 2) {
                    if (D0()) {
                        i13 = 8;
                    }
                    setSearchItemVisibility(i13);
                }
                this.f26706z0 = 0;
                o1();
            }
        }
    }

    public final void R() {
        ws wsVar = this.R0;
        if (wsVar != null) {
            zs0 zs0Var = this.f26638b0;
            float f7 = 0.0f;
            if (zs0Var != null) {
                f7 = 0.0f + (zs0Var.getVisibilityFactor() * AndroidUtilities.dp(38.0f) * (1.0f - Math.abs(zs0Var.getTranslationX() / zs0Var.getMeasuredWidth())));
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
            sparseArrayArr = this.f26639b1;
            if (i10 < 0) {
                break;
            }
            sparseArrayArr[i10].clear();
            i10--;
        }
        this.f26643c1 = 0;
        K0(sparseArrayArr[0]);
        us0 us0Var = this.W;
        if (us0Var != null) {
            us0Var.h();
            us0Var.j();
        }
        k1(false);
        F1(z10);
        lv0 lv0Var = this.T;
        if (lv0Var != null) {
            lv0Var.f30296w.clear();
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
        vv0 vv0Var = this.f26655g0.f34831w;
        if (vv0Var != null) {
            if (z10 && getClosestTab() == 9) {
                z13 = true;
            } else {
                z13 = false;
            }
            vv0Var.b(z13);
        }
        vv0 vv0Var2 = this.f26648e0.f34831w;
        if (vv0Var2 != null) {
            if (z10 && getClosestTab() == 8) {
                z12 = true;
            } else {
                z12 = false;
            }
            vv0Var2.b(z12);
        }
        for (zv0 zv0Var : this.f26666j2.values()) {
            yv0 yv0Var = zv0Var.f35411c;
            if (yv0Var.f34830s != null) {
                vv0 vv0Var3 = yv0Var.f34831w;
                if (z10 && getClosestTab() == zv0Var.f35409a) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                vv0Var3.b(z11);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.f26681p0;
        if (w0Var != null) {
            rt0 rt0Var = this.L0;
            if (rt0Var != null && rt0Var.a() && getSelectedTab() == 11) {
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
            int i12 = org.telegram.ui.ActionBar.y6.f23767z8;
            int p02 = p0(i12);
            int i13 = org.telegram.ui.ActionBar.y6.f23748y8;
            org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(context, null, p02, p0(i13), false, null);
            w0Var2.setIcon(i11);
            w0Var2.setDuplicateParentStateEnabled(false);
            this.D0.addView(w0Var2, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
            this.P0.add(w0Var2);
            ak0 iconView = w0Var2.getIconView();
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
        new org.telegram.ui.p61(r2Var, j10, this.f26679o1[1], new bi.f4(this, j10, i10)).show();
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
        tu0[] tu0VarArr = this.m0;
        motionEvent.offsetLocation(x9 - tu0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - tu0VarArr[0].getY()) - tu0VarArr[0].h.getFastScroll().getY());
        return tu0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public final void W0(org.telegram.ui.ActionBar.r2 r2Var, long j10, int i10) {
        String w10 = getStoriesController().w(i10, j10);
        Context context = r2Var.getContext();
        org.telegram.ui.ActionBar.u6 resourceProvider = r2Var.getResourceProvider();
        j2.c cVar = new j2.c(this, j10, i10, 6);
        Pattern pattern = g5.f28418a;
        g5.Q(context, r2Var, LocaleController.getString(R.string.StoriesAlbumRename), LocaleController.getString(R.string.StoriesAlbumRenameHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), w10, 12, LocaleController.getString(R.string.Rename), resourceProvider, cVar);
    }

    public final boolean X(int i10) {
        pv0[] pv0VarArr = this.f26699w1.f32690n;
        if (pv0VarArr == null) {
            return false;
        }
        pv0[] pv0VarArr2 = this.f26696v1;
        if (i10 == 0) {
            pv0 pv0Var = pv0VarArr2[i10];
            if (!pv0Var.h) {
                int[] iArr = pv0Var.f31707f;
                int[] iArr2 = pv0VarArr[i10].f31707f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = pv0VarArr2[i10].f31707f;
            int[] iArr4 = pv0VarArr[i10].f31707f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        pv0VarArr2[i10].f31704a.addAll(pv0VarArr[i10].f31704a);
        pv0VarArr2[i10].f31706c.addAll(pv0VarArr[i10].f31706c);
        for (Map.Entry entry : pv0VarArr[i10].d.entrySet()) {
            pv0VarArr2[i10].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i11 = 0; i11 < 2; i11++) {
            pv0VarArr2[i10].f31705b[i11] = pv0VarArr[i10].f31705b[i11].clone();
            pv0 pv0Var2 = pv0VarArr2[i10];
            int[] iArr5 = pv0Var2.f31710j;
            pv0 pv0Var3 = pv0VarArr[i10];
            iArr5[i11] = pv0Var3.f31710j[i11];
            pv0Var2.f31709i[i11] = pv0Var3.f31709i[i11];
        }
        pv0VarArr2[i10].e.addAll(pv0VarArr[i10].e);
        return !pv0VarArr[i10].f31704a.isEmpty();
    }

    public final void X0(String str) {
        boolean shouldShowUrlInAlert = AndroidUtilities.shouldShowUrlInAlert(str);
        org.telegram.ui.ActionBar.r2 r2Var = this.f26702x1;
        if (shouldShowUrlInAlert) {
            g5.p0(r2Var, str, true, true);
        } else {
            qf.d.r(r2Var.getParentActivity(), str);
        }
    }

    public final boolean Y(int r28, org.telegram.ui.Components.yu0 r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aw0.Y(int, org.telegram.ui.Components.yu0):boolean");
    }

    public int Y0() {
        return -1;
    }

    public final void Z(int i10, mm0 mm0Var, boolean z10) {
        ArrayList arrayList = this.f26696v1[i10].e;
        int L0 = ((s4.c0) mm0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            zu0 zu0Var = null;
            if (arrayList != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (L0 <= ((zu0) arrayList.get(i11)).f35407b) {
                        zu0Var = (zu0) arrayList.get(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                if (zu0Var == null) {
                    zu0Var = (zu0) ic.a.g(1, arrayList);
                }
            }
            if (zu0Var != null) {
                G0(i10, zu0Var.d, zu0Var.f35407b + 1, z10);
            }
        }
    }

    public final void Z0(ArrayList arrayList, boolean z10) {
        boolean z11;
        boolean z12;
        hu0 hu0Var = this.f26648e0;
        if (hu0Var != null && hu0Var.f34830s != null) {
            org.telegram.ui.ActionBar.r2 r2Var = this.f26702x1;
            if (z10 && arrayList.size() > r2Var.getMessagesController().storiesPinnedToTopCountMax) {
                wc.b0(r2Var).R(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", r2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
                return;
            }
            di.z6 z6Var = hu0Var.f34830s;
            int i10 = z6Var.f9490c;
            ArrayList arrayList2 = z6Var.f9492g;
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
                    tL_togglePinnedToTop.f22277id.addAll(arrayList2);
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
        tu0[] tu0VarArr;
        tu0 tu0Var;
        boolean z10;
        int i10;
        s4.h0 adapter;
        if (this.f26684q1) {
            int i11 = 0;
            while (true) {
                tu0VarArr = this.m0;
                if (i11 < tu0VarArr.length) {
                    tu0Var = tu0VarArr[i11];
                    if (tu0Var.E == this.f26687r1) {
                        break;
                    }
                    i11++;
                } else {
                    tu0Var = null;
                    break;
                }
            }
            if (tu0Var != null) {
                boolean w02 = w0(tu0Var.E);
                float f7 = this.f26682p1;
                float f10 = 1.0f;
                int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                pv0[] pv0VarArr = this.f26696v1;
                if (i12 == 0) {
                    this.f26684q1 = false;
                    int i13 = this.f26690s1;
                    int[] iArr = this.f26679o1;
                    iArr[w02 ? 1 : 0] = i13;
                    if (!w02) {
                        SharedConfig.setMediaColumnsCount(i13);
                    } else if (j0(tu0Var.E) >= 5) {
                        SharedConfig.setStoriesColumnsCount(this.f26690s1);
                    }
                    for (int i14 = 0; i14 < tu0VarArr.length; i14++) {
                        tu0 tu0Var2 = tu0VarArr[i14];
                        if (tu0Var2 != null && tu0Var2.h != null && (((i10 = tu0Var2.E) == 0 || w0(i10)) && (adapter = tu0VarArr[i14].h.getAdapter()) != null)) {
                            int h = adapter.h();
                            if (i14 == 0) {
                                pv0VarArr[0].g(false);
                            }
                            tu0VarArr[i14].f33157n.setVisibility(8);
                            tu0VarArr[i14].f33160w.z1(iArr[w02 ? 1 : 0]);
                            tu0VarArr[i14].h.a0();
                            tu0VarArr[i14].h.invalidate();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(tu0VarArr[i14].h);
                            } else {
                                adapter.l();
                            }
                        }
                    }
                    if (this.f26688s >= 0) {
                        for (int i15 = 0; i15 < tu0VarArr.length; i15++) {
                            tu0 tu0Var3 = tu0VarArr[i15];
                            if (tu0Var3.E == this.f26687r1) {
                                View m10 = tu0Var3.f33158r.m(this.f26688s);
                                if (m10 != null) {
                                    this.v = m10.getTop();
                                }
                                tu0 tu0Var4 = tu0VarArr[i15];
                                tu0Var4.f33160w.h1(this.f26688s, (-tu0Var4.h.getPaddingTop()) + this.v);
                            }
                        }
                        return;
                    }
                    d1();
                } else if (f7 == 0.0f) {
                    this.f26684q1 = false;
                    if (this.f26687r1 == 0) {
                        pv0VarArr[0].g(false);
                    }
                    tu0Var.f33157n.setVisibility(8);
                    tu0Var.h.invalidate();
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
                    ofFloat.addUpdateListener(new tt0(this, tu0Var, 0));
                    ofFloat.addListener(new org.telegram.ui.wi(this, z10, w02 ? 1 : 0, tu0Var));
                    ofFloat.setInterpolator(ds.f27584f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                }
            }
        }
    }

    public final boolean a1(MotionEvent motionEvent, boolean z10) {
        int i10;
        tu0 tu0Var;
        us0 us0Var;
        int i11;
        int i12;
        int closestTab = getClosestTab();
        ut0 ut0Var = this.K0;
        SparseIntArray sparseIntArray = ut0Var.O;
        int i13 = ut0Var.f26298n;
        int i14 = -1;
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i15 = sparseIntArray.get(i13 + i10, -1);
        zs0 zs0Var = this.f26638b0;
        if (zs0Var != null) {
            if (!E0(closestTab) && closestTab != 8) {
                if (E0(i15) || i15 == 8) {
                    i14 = zs0Var.getCurrentAlbumId();
                }
            } else {
                t91 t91Var = zs0Var.f41109b;
                SparseIntArray sparseIntArray2 = t91Var.f32922b0;
                int i16 = t91Var.F;
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
                i15 = r1(i14).f35409a;
            }
        }
        if (i15 >= 0) {
            if (this.f26681p0 != null && !G()) {
                if (D0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                setSearchItemVisibility(i11);
                this.f26683q0 = 0.0f;
            } else {
                this.f26683q0 = i0(0.0f);
                G1(0.0f);
            }
            if ((!this.X0 || getSelectedTab() != 11) && (!F() || !this.E1 || (getClosestTab() != 8 && !E0(getClosestTab())))) {
                tu0[] tu0VarArr = this.m0;
                tu0 tu0Var2 = tu0VarArr[0];
                if (tu0Var2 != null && tu0Var2.E == 13 && (us0Var = this.W) != null) {
                    ei.a aVar = us0Var.f10019n;
                    if (!z10) {
                    }
                }
                tu0 tu0Var3 = tu0VarArr[0];
                vs0 vs0Var = this.f26635a0;
                if (tu0Var3 != null && tu0Var3.E == 14 && vs0Var != null) {
                    zh.v1 v1Var = vs0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.E1 || (tu0Var = tu0VarArr[0]) == null || tu0Var.E != 13) && ((vs0Var == null || !vs0Var.g()) && (zs0Var == null || !zs0Var.f41111f))) {
                    C1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    t0();
                    this.A1 = false;
                    this.f26707z1 = true;
                    this.B1 = (int) motionEvent.getX();
                    setHeaderEnabled(false);
                    ut0Var.setEnabled(false);
                    tu0 tu0Var4 = tu0VarArr[1];
                    tu0Var4.E = i15;
                    tu0Var4.setVisibility(0);
                    this.f26665j1 = z10;
                    v1(true);
                    if (z10) {
                        tu0VarArr[1].setTranslationX(tu0VarArr[0].getMeasuredWidth());
                    } else {
                        tu0VarArr[1].setTranslationX(-tu0VarArr[0].getMeasuredWidth());
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23354d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Jh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Kh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23765z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ih));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23746y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23518m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23682uh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23374e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23355d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23730x7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23653t7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23710w7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23489kd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23715wc));
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
        us0 us0Var;
        if (!y0()) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        if (z10 && (us0Var = this.W) != null) {
            return us0Var.getBotPreviewsSubtitle();
        }
        hu0 hu0Var = this.f26648e0;
        if (hu0Var != null && hu0Var.f34830s != null) {
            i10 = 0;
            i11 = 0;
            for (int i12 = 0; i12 < hu0Var.f34830s.f9493i.size(); i12++) {
                MessageObject messageObject = (MessageObject) hu0Var.f34830s.f9493i.get(i12);
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
        if (h0Var instanceof uv0) {
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
            iv0 iv0Var = this.P;
            if (h0Var == iv0Var) {
                iv0Var.f29384r = null;
            }
        }
    }

    public final tu0 d0(int i10) {
        int i11 = 0;
        while (true) {
            tu0[] tu0VarArr = this.m0;
            if (i11 < tu0VarArr.length) {
                tu0 tu0Var = tu0VarArr[i11];
                if (tu0Var != null && tu0Var.E == i10) {
                    return tu0Var;
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
            tu0[] tu0VarArr = this.m0;
            if (i11 < tu0VarArr.length) {
                dt0 dt0Var = tu0VarArr[i11].h;
                if (dt0Var != null) {
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < dt0Var.getChildCount(); i14++) {
                        View childAt = dt0Var.getChildAt(i14);
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
                        int i15 = tu0VarArr[i11].E;
                        int i16 = -1;
                        if (w0(i15)) {
                            xv0 t12 = t1(i15);
                            if (t12 != null && t12.f34830s != null) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= t12.f34830s.f9493i.size()) {
                                        break;
                                    } else if (i12 == ((MessageObject) t12.f34830s.f9493i.get(i17)).getId()) {
                                        i16 = i17;
                                        break;
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                            i10 = i16;
                        } else if (i15 >= 0) {
                            pv0[] pv0VarArr = this.f26696v1;
                            if (i15 < pv0VarArr.length) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= pv0VarArr[i15].f31704a.size()) {
                                        break;
                                    } else if (i12 == ((MessageObject) pv0VarArr[i15].f31704a.get(i18)).getId()) {
                                        i16 = i18;
                                        break;
                                    } else {
                                        i18++;
                                    }
                                }
                                i10 = pv0VarArr[i15].f31713m + i16;
                            }
                        }
                        if (i16 >= 0) {
                            ((s4.c0) dt0Var.getLayoutManager()).h1(i10, (-tu0VarArr[i11].h.getPaddingTop()) + i13);
                            if (this.f26684q1) {
                                tu0 tu0Var = tu0VarArr[i11];
                                tu0Var.f33158r.h1(i10, (-tu0Var.h.getPaddingTop()) + i13);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aw0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ut0 ut0Var = this.K0;
        if (ut0Var != null) {
            canvas.save();
            canvas.translate(ut0Var.getX(), ut0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        pt0 pt0Var = this.T0;
        if (pt0Var != null) {
            int i10 = pt0Var.U;
            if ((i10 == 3 || i10 == 1) && this.R0 == null) {
                canvas.save();
                canvas.translate(pt0Var.getX(), pt0Var.getY());
                pt0Var.setDrawOverlay(true);
                pt0Var.draw(canvas);
                pt0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i10;
        if (this.f26640b2 && (view instanceof tu0) && this.f26654f2 < this.f26647d2) {
            canvas.save();
            canvas.clipRect(0, -this.f26654f2, getWidth(), getHeight() + this.f26650e2);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        } else if (view == this.T0 && this.R0 == null) {
            canvas.save();
            tu0[] tu0VarArr = this.m0;
            float top = tu0VarArr[0].getTop();
            zs0 zs0Var = this.f26638b0;
            if (zs0Var != null && ((i10 = tu0VarArr[0].E) == 8 || E0(i10))) {
                top -= zs0Var.getVisualHeight();
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
        org.telegram.ui.ActionBar.r2 r2Var = this.f26702x1;
        if (r2Var != null && r2Var.getMessagesController().getStoriesController().I(p2Var.getDialogId())) {
            r2Var.getOrCreateStoryViewer().getClass();
            di.y9 orCreateStoryViewer = r2Var.getOrCreateStoryViewer();
            Context context = r2Var.getContext();
            long dialogId = p2Var.getDialogId();
            di.q7 a2 = di.q7.a((mm0) p2Var.getParent());
            if ((r2Var instanceof ProfileActivity) && ((ProfileActivity) r2Var).f36073s1) {
                i10 = AndroidUtilities.dp(68.0f);
            } else {
                i10 = 0;
            }
            a2.f9066s += i10;
            orCreateStoryViewer.D(context, dialogId, a2);
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
        return Utilities.clamp(i14, 9, (this.f26672m1 && i10 == 1) ? 2 : 2);
    }

    public final void e1(int i10) {
        ut0 ut0Var;
        if (!this.O1 && (ut0Var = this.K0) != null) {
            ut0Var.g(null, i10, ut0Var.P.get(i10));
        }
    }

    public final int f0(boolean z10) {
        int i10;
        int i11 = this.a2 + this.f26650e2;
        if (z10) {
            i10 = AndroidUtilities.dp(52.0f);
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public final void f1(float f7, int i10) {
        int i11;
        ut0 ut0Var = this.K0;
        if (ut0Var != null) {
            if (E0(i10)) {
                i11 = 8;
            } else {
                i11 = i10;
            }
            ut0Var.i(f7, i11);
        }
        zs0 zs0Var = this.f26638b0;
        if (zs0Var != null) {
            t91 t91Var = zs0Var.f41109b;
            if (E0(i10)) {
                t91Var.f(f7, q1(i10));
            } else if (i10 == 8) {
                t91Var.f(f7, 0);
            }
        }
    }

    public final int g0(int i10) {
        int i11;
        int k02 = k0(i10) + AndroidUtilities.dp(54.0f) + this.f26644c2 + this.f26647d2 + this.f26673m2;
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
            tu0[] tu0VarArr = this.m0;
            if (i10 < tu0VarArr.length) {
                tu0 tu0Var = tu0VarArr[i10];
                if (tu0Var.E != 7 || tu0Var.h.getAdapter() == null || tu0VarArr[i10].h.getAdapter().h() == 0 || this.f26702x1.getMessagesController().getStoriesController().f8636j.size() <= 0) {
                    i10++;
                } else {
                    return;
                }
            } else {
                if (this.F == 0) {
                    ku0 ku0Var = this.f26642c0;
                    ku0Var.d = chatFull;
                    ku0Var.e = arrayList;
                }
                J1(true);
                for (int i11 = 0; i11 < tu0VarArr.length; i11++) {
                    tu0 tu0Var2 = tu0VarArr[i11];
                    if (tu0Var2.E == 7 && tu0Var2.h.getAdapter() != null) {
                        AndroidUtilities.notifyDataSetChanged(tu0VarArr[i11].h);
                    }
                }
                return;
            }
        }
    }

    public SparseArray<MessageObject> getActionModeSelected() {
        return this.f26639b1[0];
    }

    public float getBottomButtonStoriesVisibility() {
        tu0 tu0Var;
        tu0 tu0Var2;
        boolean z10;
        boolean z11;
        di.z6 z6Var;
        di.z6 z6Var2;
        float f7 = 1.0f;
        tu0[] tu0VarArr = this.m0;
        if (tu0VarArr == null || (tu0Var = tu0VarArr[0]) == null || (tu0Var2 = tu0VarArr[1]) == null || tu0Var.v == null || tu0Var2.v == null) {
            return 1.0f;
        }
        int i10 = tu0Var.E;
        int i11 = tu0Var2.E;
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
        float visibilityFactor = 1.0f - tu0VarArr[0].v.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - tu0VarArr[1].v.getVisibilityFactor();
        xv0 t12 = t1(tu0VarArr[0].E);
        if (i10 == 8 || (t12 != null && (z6Var2 = t12.f34830s) != null && z6Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        xv0 t13 = t1(i11);
        if (i11 != 8 && (t13 == null || (z6Var = t13.f34830s) == null || z6Var.g() <= 0)) {
            f7 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f7;
        }
        if (!z11) {
            f7 = visibilityFactor;
        }
        return AndroidUtilities.lerp(visibilityFactor, f7, Math.abs(tu0VarArr[0].getTranslationX() / tu0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        tu0[] tu0VarArr = this.m0;
        tu0 tu0Var = tu0VarArr[1];
        if (tu0Var != null && tu0Var.getVisibility() == 0) {
            if (this.f26662i1 && !this.f26668k1) {
                return tu0VarArr[1].E;
            }
            if (Math.abs(tu0VarArr[1].getTranslationX()) < tu0VarArr[1].getMeasuredWidth() / 2.0f) {
                return tu0VarArr[1].E;
            }
        }
        return getSelectedTab();
    }

    public mm0 getCurrentListView() {
        fu0 fu0Var;
        tu0 tu0Var = this.m0[0];
        int i10 = tu0Var.E;
        if (i10 == 13) {
            return this.W.getCurrentListView();
        }
        if (i10 == 14) {
            return this.f26635a0.getCurrentListView();
        }
        if (i10 == 12 && (fu0Var = this.V) != null) {
            return fu0Var.f45518a.f44468x0;
        }
        return tu0Var.h;
    }

    public int getInitialTab() {
        return 0;
    }

    public int getPhotosVideosTypeFilter() {
        return this.f26696v1[0].f31717q;
    }

    public TextView getSaveItem() {
        return this.f26689s0;
    }

    public org.telegram.ui.ActionBar.w0 getSearchItem() {
        return this.f26681p0;
    }

    public ak0 getSearchOptionsItem() {
        return this.f26693u0;
    }

    public int getSelectedTab() {
        int currentTabId = this.K0.getCurrentTabId();
        zs0 zs0Var = this.f26638b0;
        if (zs0Var != null && currentTabId == 8) {
            int currentAlbumId = zs0Var.getCurrentAlbumId();
            if (currentAlbumId == 0) {
                return 8;
            }
            if (currentAlbumId > 0) {
                return r1(currentAlbumId).f35409a;
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
            tu0[] tu0VarArr = this.m0;
            if (i10 < tu0VarArr.length) {
                tu0 tu0Var = tu0VarArr[i10];
                if (tu0Var != null) {
                    f7 = ((1.0f - Math.abs(tu0Var.getTranslationX() / getWidth())) * tu0Var.E) + f7;
                }
                i10++;
            } else {
                return f7;
            }
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.h7> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.h7> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.C0, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23765z6));
        int i10 = org.telegram.ui.ActionBar.y6.f23767z8;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f26675n0, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        org.telegram.ui.ActionBar.w0 w0Var = this.f26698w0;
        if (w0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f26695v0;
        if (w0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        }
        Drawable[] drawableArr = {this.F0};
        int i11 = org.telegram.ui.ActionBar.y6.f23748y8;
        ImageView imageView = this.E0;
        arrayList.add(new org.telegram.ui.ActionBar.h7(imageView, 8, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.D0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23354d6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.K0, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Gh));
        ut0 ut0Var = this.K0;
        arrayList.add(new org.telegram.ui.ActionBar.h7(ut0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Fh));
        arrayList.add(new org.telegram.ui.ActionBar.h7(ut0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Eh));
        arrayList.add(new org.telegram.ui.ActionBar.h7(ut0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Hh));
        pt0 pt0Var = this.T0;
        if (pt0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h7(pt0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23691v7));
            arrayList.add(new org.telegram.ui.ActionBar.h7(pt0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23672u7));
            arrayList.add(new org.telegram.ui.ActionBar.h7(pt0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23747y7));
            arrayList.add(new org.telegram.ui.ActionBar.h7(pt0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.A7));
        }
        final int i12 = 0;
        while (true) {
            tu0[] tu0VarArr = this.m0;
            if (i12 < tu0VarArr.length) {
                org.telegram.ui.ActionBar.g7 g7Var = new org.telegram.ui.ActionBar.g7() {
                    @Override
                    public final void b() {
                        tu0[] tu0VarArr2 = aw0.this.m0;
                        int i13 = i12;
                        dt0 dt0Var = tu0VarArr2[i13].h;
                        if (dt0Var != null) {
                            int childCount = dt0Var.getChildCount();
                            for (int i14 = 0; i14 < childCount; i14++) {
                                View childAt = tu0VarArr2[i13].h.getChildAt(i14);
                                if (childAt instanceof org.telegram.ui.Cells.x7) {
                                    org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) childAt;
                                    for (int i15 = 0; i15 < 6; i15++) {
                                        x7Var.f25717a[i15].e.invalidate();
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
                arrayList.add(new org.telegram.ui.ActionBar.h7(tu0VarArr[i12].h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23634s8));
                arrayList.add(new org.telegram.ui.ActionBar.h7(tu0VarArr[i12].h, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23446i6));
                arrayList.add(new org.telegram.ui.ActionBar.h7(tu0VarArr[i12].v, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23336c7));
                int i13 = org.telegram.ui.ActionBar.y6.f23426h6;
                arrayList.add(new org.telegram.ui.ActionBar.h7(tu0VarArr[i12].h, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i13));
                arrayList.add(new org.telegram.ui.ActionBar.h7(tu0VarArr[i12].h, 0, new Class[]{org.telegram.ui.Cells.ab.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g7Var, org.telegram.ui.ActionBar.y6.f23538n6));
                arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g7Var, org.telegram.ui.ActionBar.y6.O7));
                arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g7Var, org.telegram.ui.ActionBar.y6.P7));
                arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g7Var, org.telegram.ui.ActionBar.y6.Q7));
                arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g7Var, org.telegram.ui.ActionBar.y6.R7));
                arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g7Var, org.telegram.ui.ActionBar.y6.S7));
                arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g7Var, org.telegram.ui.ActionBar.y6.T7));
                arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g7Var, org.telegram.ui.ActionBar.y6.U7));
                int i14 = org.telegram.ui.ActionBar.y6.f23447i7;
                arrayList.add(new org.telegram.ui.ActionBar.h7(tu0VarArr[i12].h, 8192, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i14));
                int i15 = org.telegram.ui.ActionBar.y6.f23483k7;
                arrayList.add(new org.telegram.ui.ActionBar.h7(tu0VarArr[i12].h, 16384, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.h7(tu0VarArr[i12].h, 8, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.zi));
                arrayList.add(new org.telegram.ui.ActionBar.h7(tu0VarArr[i12].h, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i13));
                arrayList.add(new org.telegram.ui.ActionBar.h7(tu0VarArr[i12].h, 8192, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.h7(tu0VarArr[i12].h, 16384, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.h7(tu0VarArr[i12].h, 8192, new Class[]{org.telegram.ui.Cells.r7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.h7(tu0VarArr[i12].h, 16384, new Class[]{org.telegram.ui.Cells.r7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.h7(tu0VarArr[i12].h, 8192, new Class[]{org.telegram.ui.Cells.x7.class}, (Paint) null, (Drawable[]) null, g7Var, i14));
                arrayList.add(new org.telegram.ui.ActionBar.h7(tu0VarArr[i12].h, 16384, new Class[]{org.telegram.ui.Cells.x7.class}, (Paint) null, (Drawable[]) null, g7Var, i15));
                arrayList.add(new org.telegram.ui.ActionBar.h7(tu0VarArr[i12].h, 0, new Class[]{org.telegram.ui.Cells.d2.class}, new String[]{"backgroundPaint"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Lh));
                arrayList.add(new org.telegram.ui.ActionBar.h7(tu0VarArr[i12].h, 8192, new Class[]{org.telegram.ui.Cells.d2.class}, (Paint) null, (Drawable[]) null, g7Var, i14));
                arrayList.add(new org.telegram.ui.ActionBar.h7(tu0VarArr[i12].h, 16384, new Class[]{org.telegram.ui.Cells.d2.class}, (Paint) null, (Drawable[]) null, g7Var, i15));
                arrayList.add(new org.telegram.ui.ActionBar.h7(tu0VarArr[i12].h, 0, (Class[]) null, (Paint) null, new Drawable[]{this.A0}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23316b7));
                arrayList.add(new org.telegram.ui.ActionBar.h7(tu0VarArr[i12].v.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.h7(tu0VarArr[i12].v.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23746y6));
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
        tu0[] tu0VarArr = this.m0;
        tu0 tu0Var = tu0VarArr[1];
        if (tu0Var != null && s0(tu0Var.E)) {
            f10 = 0.0f + f7;
        }
        tu0 tu0Var2 = tu0VarArr[0];
        if (tu0Var2 != null && s0(tu0Var2.E)) {
            return (1.0f - f7) + f10;
        }
        return f10;
    }

    public final void h1(int i10, int i11, int i12, int i13) {
        tu0[] tu0VarArr;
        this.f26640b2 = true;
        this.f26644c2 = i10;
        this.f26647d2 = i11;
        this.f26650e2 = i12;
        this.a2 = i13;
        j1(i10, this.K0);
        j1(i10, this.D0);
        j1(AndroidUtilities.dp(34.0f) + i10, this.R0);
        j1(AndroidUtilities.dp(52.0f) + i10, this.M0);
        j1(AndroidUtilities.dp(4.0f) + i10, this.L0);
        j1(AndroidUtilities.dp(48.0f) + i10, this.f26638b0);
        vs0 vs0Var = this.f26635a0;
        if (vs0Var != null) {
            if (vs0Var.L != i11 || vs0Var.M != i12) {
                vs0Var.L = i11;
                vs0Var.M = i12;
                vs0Var.n();
            }
            B1();
        }
        for (tu0 tu0Var : this.m0) {
            if (tu0Var != null) {
                tu0Var.setClipChildren(false);
                D1(tu0Var);
                setPageOverscan(tu0Var.h);
                setPageOverscan(tu0Var.f33157n);
                int paddingTop = tu0Var.h.getPaddingTop();
                dt0 dt0Var = tu0Var.h;
                int paddingLeft = dt0Var.getPaddingLeft();
                dt0 dt0Var2 = tu0Var.h;
                int g02 = g0(tu0Var.E);
                dt0Var2.f32682h3 = g02;
                int paddingRight = tu0Var.h.getPaddingRight();
                dt0 dt0Var3 = tu0Var.h;
                int f02 = f0(D0());
                dt0Var3.f32683i3 = f02;
                dt0Var.setPadding(paddingLeft, g02, paddingRight, f02);
                int paddingTop2 = paddingTop - tu0Var.h.getPaddingTop();
                if (paddingTop2 != 0) {
                    AndroidUtilities.doOnLayout(tu0Var.h, new es0(tu0Var, paddingTop2, 1));
                }
                tu0Var.v.setPadding(0, i10, 0, i13);
                fu0 fu0Var = this.V;
                if (fu0Var != null && fu0Var.getParent() == tu0Var) {
                    j1(AndroidUtilities.dp(56.0f) + i10, fu0Var);
                }
                us0 us0Var = this.W;
                if (us0Var != null && us0Var.getParent() == tu0Var) {
                    j1(i10, us0Var);
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
        tu0[] tu0VarArr = this.m0;
        tu0 tu0Var = tu0VarArr[1];
        if (tu0Var != null && A0(tu0Var.E) && tu0VarArr[1].E != 11) {
            f10 = 0.0f + f7;
        }
        tu0 tu0Var2 = tu0VarArr[0];
        if (tu0Var2 != null && A0(tu0Var2.E) && tu0VarArr[0].E != 11) {
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
        xv0 t12;
        di.z6 z6Var;
        if (w0(i10) && (t12 = t1(i10)) != null && (z6Var = t12.f34830s) != null) {
            return z6Var.g();
        }
        return 0;
    }

    public final int k0(int i10) {
        float f7;
        zs0 zs0Var = this.f26638b0;
        if (zs0Var != null && (E0(i10) || i10 == 8)) {
            f7 = zs0Var.getVisibilityFactor() * AndroidUtilities.dp(40.0f);
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
            this.Q1.addListener(new org.telegram.ui.jo(20, this, z10));
            this.Q1.start();
            if (z10) {
                I1();
            }
        }
    }

    public final void l1(int r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aw0.l1(int, boolean):void");
    }

    public final void m1(int i10) {
        int q12 = q1(getClosestTab());
        zs0 zs0Var = this.f26638b0;
        if (q12 != i10) {
            if (zs0Var != null) {
                zs0Var.f41109b.d(i10, zs0Var.d.i(i10));
                return;
            }
            return;
        }
        zs0Var.setReorderingAlbums(true);
        zv0 r12 = r1(i10);
        tu0 d02 = d0(r12.f35409a);
        if (d02 == null) {
            return;
        }
        dt0 dt0Var = d02.h;
        for (int i11 = 0; i11 < dt0Var.getChildCount(); i11++) {
            View childAt = dt0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.w7) {
                ((org.telegram.ui.Cells.w7) childAt).l(true, true);
            }
        }
        yv0 yv0Var = r12.f35411c;
        if (yv0Var != null && !yv0Var.f34832x) {
            yv0Var.f34832x = true;
        }
        C1(true);
    }

    public final float n0(int i10, boolean z10) {
        float width = getWidth();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            tu0[] tu0VarArr = this.m0;
            if (i11 >= tu0VarArr.length) {
                break;
            }
            tu0 tu0Var = tu0VarArr[i11];
            if (tu0Var != null) {
                int i13 = tu0Var.E;
                if ((z10 && i10 == 8 && E0(i13)) || i13 == i10) {
                    i12++;
                    width = tu0VarArr[i11].getTranslationX();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aw0.n1(boolean):void");
    }

    public final float o0(int i10, boolean z10) {
        float f7 = 0.0f;
        int i11 = 0;
        while (true) {
            tu0[] tu0VarArr = this.m0;
            if (i11 < tu0VarArr.length) {
                tu0 tu0Var = tu0VarArr[i11];
                if (tu0Var != null) {
                    int i12 = tu0Var.E;
                    if ((z10 && i10 == 8 && E0(i12)) || i12 == i10) {
                        f7 = (1.0f - Math.abs(tu0VarArr[i11].getTranslationX() / getWidth())) + f7;
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
            tu0[] tu0VarArr = this.m0;
            if (i10 < tu0VarArr.length) {
                int childCount = tu0VarArr[i10].h.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = tu0VarArr[i10].h.getChildAt(i11);
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
            tu0[] tu0VarArr = this.m0;
            if (i10 < tu0VarArr.length) {
                dt0 dt0Var = tu0VarArr[i10].h;
                if (dt0Var != null) {
                    dt0Var.getViewTreeObserver().addOnPreDrawListener(new au0(this, i10, 0));
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
        mu0 mu0Var = this.F1;
        if (mu0Var.f() != null) {
            i12 = mu0Var.f().getHeight();
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
            } else if (childAt instanceof tu0) {
                i13 = i10;
                measureChildWithMargins(childAt, i13, 0, View.MeasureSpec.makeMeasureSpec(i12, 1073741824), 0);
                dt0 dt0Var = ((tu0) childAt).h;
                dt0Var.setPadding(0, dt0Var.f32680f3, 0, dt0Var.f32681g3);
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
            org.telegram.ui.ActionBar.r2 r2Var = this.f26702x1;
            if (r2Var.getParentLayout() != null && !((ActionBarLayout) r2Var.getParentLayout()).i() && !Q() && !this.f26634a) {
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
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.f26707z1 && !this.A1) {
                    if (motionEvent.getY() >= AndroidUtilities.dp(90.0f) + this.f26644c2) {
                        this.f26705y1 = motionEvent.getPointerId(0);
                        this.A1 = true;
                        this.B1 = (int) motionEvent.getX();
                        this.C1 = (int) motionEvent.getY();
                        this.D1.clear();
                        return this.f26707z1;
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f26705y1) {
                    int x9 = (int) (motionEvent.getX() - this.B1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.C1);
                    boolean z13 = this.f26707z1;
                    tu0[] tu0VarArr = this.m0;
                    if (z13 && (((z10 = this.f26665j1) && x9 > 0) || (!z10 && x9 < 0))) {
                        if (x9 < 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!a1(motionEvent, z11)) {
                            this.A1 = true;
                            this.f26707z1 = false;
                            tu0VarArr[0].setTranslationX(0.0f);
                            tu0 tu0Var = tu0VarArr[1];
                            if (this.f26665j1) {
                                i11 = tu0VarArr[0].getMeasuredWidth();
                            } else {
                                i11 = -tu0VarArr[0].getMeasuredWidth();
                            }
                            tu0Var.setTranslationX(i11);
                            f1(0.0f, tu0VarArr[1].E);
                            T0(getTabProgress());
                        }
                    }
                    if (this.A1 && !this.f26707z1) {
                        if (Math.abs(x9) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x9) > abs) {
                            if (x9 < 0) {
                                z12 = true;
                            }
                            a1(motionEvent, z12);
                        }
                    } else if (this.f26707z1) {
                        tu0VarArr[0].setTranslationX(x9);
                        if (this.f26665j1) {
                            tu0VarArr[1].setTranslationX(tu0VarArr[0].getMeasuredWidth() + x9);
                        } else {
                            tu0VarArr[1].setTranslationX(x9 - tu0VarArr[0].getMeasuredWidth());
                        }
                        float abs2 = Math.abs(x9) / tu0VarArr[0].getMeasuredWidth();
                        if (!G()) {
                            this.f26683q0 = 0.0f;
                        } else {
                            this.f26683q0 = i0(abs2);
                            G1(abs2);
                            float h02 = h0(abs2);
                            this.f26686r0 = h02;
                            if (h02 != 0.0f && G() && !x0()) {
                                i10 = 0;
                            } else {
                                i10 = 4;
                            }
                            this.f26691t0.setVisibility(i10);
                        }
                        C1(false);
                        f1(abs2, tu0VarArr[1].E);
                        T0(getTabProgress());
                        S0();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f26705y1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    p1(motionEvent);
                }
                return this.f26707z1;
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
        tu0 tu0Var;
        tu0 tu0Var2;
        int measuredWidth2;
        tu0 tu0Var3;
        tu0 tu0Var4;
        boolean z11;
        VelocityTracker velocityTracker = this.D1;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.U0);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f7 = this.D1.getXVelocity();
                f10 = this.D1.getYVelocity();
                if (!this.f26707z1 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
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
            if (this.f26707z1) {
                tu0[] tu0VarArr = this.m0;
                float x9 = tu0VarArr[0].getX();
                this.f26659h1 = new AnimatorSet();
                if (Math.abs(x9) < tu0VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f26668k1 = z10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new e80(this, 20));
                boolean z12 = this.f26668k1;
                Property property = View.TRANSLATION_X;
                if (z12) {
                    measuredWidth = Math.abs(x9);
                    if (this.f26665j1) {
                        this.f26659h1.playTogether(ObjectAnimator.ofFloat(tu0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(tu0VarArr[1], property, tu0Var4.getMeasuredWidth()), ofFloat);
                    } else {
                        this.f26659h1.playTogether(ObjectAnimator.ofFloat(tu0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(tu0VarArr[1], property, -tu0Var3.getMeasuredWidth()), ofFloat);
                    }
                } else {
                    measuredWidth = tu0VarArr[0].getMeasuredWidth() - Math.abs(x9);
                    if (this.f26665j1) {
                        this.f26659h1.playTogether(ObjectAnimator.ofFloat(tu0VarArr[0], property, -tu0Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(tu0VarArr[1], property, 0.0f), ofFloat);
                    } else {
                        this.f26659h1.playTogether(ObjectAnimator.ofFloat(tu0VarArr[0], property, tu0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(tu0VarArr[1], property, 0.0f), ofFloat);
                    }
                }
                this.f26659h1.setInterpolator(f26633q2);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs = Math.abs(f7);
                if (abs > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                this.f26659h1.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                this.f26659h1.addListener(new xt0(this, 1));
                this.f26659h1.start();
                this.f26662i1 = true;
                this.f26707z1 = false;
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
        if (this.f26702x1.getConnectionsManager().getConnectionState() == 3) {
            return true;
        }
        return false;
    }

    public final int q1(int i10) {
        zv0 s12 = s1(i10);
        if (s12 == null) {
            return -1;
        }
        return s12.f35410b;
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
                sparseArrayArr = this.f26639b1;
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

    public final zv0 r1(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.f26666j2;
        zv0 zv0Var = (zv0) hashMap.get(valueOf);
        if (zv0Var == null) {
            zv0 zv0Var2 = new zv0(this, getContext(), i10);
            hashMap.put(Integer.valueOf(i10), zv0Var2);
            this.f26669k2.put(Integer.valueOf(zv0Var2.f35409a), Integer.valueOf(i10));
            return zv0Var2;
        }
        return zv0Var;
    }

    public final boolean s0(int i10) {
        if (i10 != 0) {
            if (((i10 != 8 && !E0(i10)) || !TextUtils.isEmpty(getStoriesHashtag())) && i10 != 9 && i10 != 11 && i10 != 13) {
                if (i10 != 14 || this.f26635a0 == null) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final zv0 s1(int i10) {
        Integer num = (Integer) this.f26669k2.get(Integer.valueOf(i10));
        if (num == null) {
            return null;
        }
        return (zv0) this.f26666j2.get(num);
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        boolean z10;
        int i10;
        TLRPC.ChatFull chatFull2 = this.f26653f1;
        if (chatFull2 != null && chatFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26653f1 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.f26649e1 == 0) {
                this.f26649e1 = -j10;
                int i11 = 0;
                while (true) {
                    pv0[] pv0VarArr = this.f26696v1;
                    if (i11 >= pv0VarArr.length) {
                        break;
                    }
                    if (pv0VarArr[i11].f31705b[1].size() == 0) {
                        pv0 pv0Var = pv0VarArr[i11];
                        pv0Var.f31710j[1] = this.f26653f1.migrated_from_max_id;
                        pv0Var.f31709i[1] = false;
                    }
                    i11++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.f26653f1;
        if (chatFull3 != null && z10 != chatFull3.stories_pinned_available) {
            ut0 ut0Var = this.K0;
            if (ut0Var != null) {
                if (x0()) {
                    i10 = 9;
                } else {
                    i10 = 8;
                }
                ut0Var.setInitialTabId(i10);
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
        this.f26649e1 = j10;
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
            tu0[] tu0VarArr = this.m0;
            if (i15 >= tu0VarArr.length) {
                break;
            }
            tu0VarArr[i15].setTranslationY(this.N1);
            i15++;
        }
        if (this.R0 != null) {
            R();
        } else {
            pt0 pt0Var = this.T0;
            if (pt0Var != null) {
                pt0Var.setTranslationY(AndroidUtilities.dp(48.0f) + i11);
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
        tu0[] tu0VarArr;
        this.f26657g2 = qVar;
        vs0 vs0Var = this.f26635a0;
        if (vs0Var != null) {
            vs0Var.setGlassEngine(qVar);
        }
        for (tu0 tu0Var : this.m0) {
            if (tu0Var != null) {
                tu0Var.h.setCaptureSectionsDecoratorAllowed(true);
                qVar.b(tu0Var.h);
            }
        }
    }

    public void setPagesPaddingBottom(int i10) {
        if (this.a2 != i10) {
            this.a2 = i10;
            tu0[] tu0VarArr = this.m0;
            if (tu0VarArr != null) {
                for (tu0 tu0Var : tu0VarArr) {
                    if (tu0Var != null) {
                        dt0 dt0Var = tu0Var.h;
                        int paddingLeft = dt0Var.getPaddingLeft();
                        dt0 dt0Var2 = tu0Var.h;
                        int i11 = dt0Var2.f32680f3;
                        int paddingRight = dt0Var2.getPaddingRight();
                        dt0 dt0Var3 = tu0Var.h;
                        int f02 = f0(D0());
                        dt0Var3.f32683i3 = f02;
                        dt0Var.setPadding(paddingLeft, i11, paddingRight, f02);
                    }
                }
            }
        }
    }

    public void setPagesVisibleOverscanTop(int i10) {
        if (this.f26654f2 != i10) {
            this.f26654f2 = i10;
            invalidate();
        }
    }

    public void setPinnedToTop(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            int i10 = 0;
            while (true) {
                tu0[] tu0VarArr = this.m0;
                if (i10 < tu0VarArr.length) {
                    z1(tu0VarArr[i10], true);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        boolean z10;
        TLRPC.UserFull userFull2 = this.f26656g1;
        if (userFull2 != null && userFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26656g1 = userFull;
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
            tu0[] tu0VarArr = this.m0;
            if (i11 >= tu0VarArr.length) {
                break;
            }
            int measuredHeight = getMeasuredHeight();
            if (tu0VarArr[i11].E == 8) {
                f7 = 280.0f;
            } else {
                f7 = 120.0f;
            }
            float f10 = (-(measuredHeight - Math.max(i10, AndroidUtilities.dp(f7)))) / 2.0f;
            tu0VarArr[i11].v.setTranslationY(f10);
            tu0VarArr[i11].f33159s.setTranslationY(-f10);
            i11++;
        }
        us0 us0Var = this.W;
        if (us0Var != null) {
            us0Var.setVisibleHeight(i10);
        }
        vs0 vs0Var = this.f26635a0;
        if (vs0Var != null) {
            vs0Var.setVisibleHeight(i10);
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
        this.N0.setInterpolator(ds.f27585g);
        this.N0.addListener(new xt0(this, 0));
        this.N0.start();
    }

    public final xv0 t1(int i10) {
        zv0 s12;
        if (i10 == 8) {
            return this.f26648e0;
        }
        if (i10 == 9) {
            return this.f26655g0;
        }
        if (E0(i10) && (s12 = s1(i10)) != null) {
            return s12.f35411c;
        }
        return null;
    }

    public boolean u0() {
        return false;
    }

    public final xv0 u1(int i10) {
        zv0 s12;
        if (i10 == 8) {
            return this.f26652f0;
        }
        if (i10 == 9) {
            return this.f26658h0;
        }
        if (!E0(i10) || (s12 = s1(i10)) == null) {
            return null;
        }
        return s12.d;
    }

    @Override
    public final void updateColors() {
        tu0[] tu0VarArr;
        try {
            this.I1.a(p0(org.telegram.ui.ActionBar.y6.f23354d6));
            org.telegram.ui.ActionBar.j2 j2Var = this.F0;
            if (j2Var != null) {
                j2Var.a(p0(org.telegram.ui.ActionBar.y6.f23748y8));
            }
            NumberTextView numberTextView = this.C0;
            if (numberTextView != null) {
                numberTextView.setTextColor(p0(org.telegram.ui.ActionBar.y6.f23748y8));
            }
            x1();
            invalidate();
            for (tu0 tu0Var : this.m0) {
                if (tu0Var != null && tu0Var.L) {
                    tu0Var.invalidate();
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
        tu0[] tu0VarArr;
        tu0[] tu0VarArr2;
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
        vs0 vs0Var = this.f26635a0;
        if (vs0Var != null) {
            vs0Var.i();
        }
        int i22 = 0;
        while (true) {
            tu0VarArr = this.m0;
            if (i22 >= tu0VarArr.length) {
                break;
            }
            tu0VarArr[i22].h.C0();
            i22++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tu0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = AndroidUtilities.dp(J0());
        layoutParams.rightMargin = 0;
        layoutParams.leftMargin = 0;
        s4.h0 adapter = tu0VarArr[z10 ? 1 : 0].h.getAdapter();
        s4.h0 h0Var = this.f26648e0;
        s4.z zVar = this.f26645d0;
        if (adapter == h0Var) {
            zVar.h(null);
        }
        boolean z21 = this.X0;
        mu0 mu0Var = this.F1;
        org.telegram.ui.ActionBar.k kVar = this.G;
        String str = "";
        org.telegram.ui.ActionBar.w0 w0Var6 = this.f26681p0;
        iv0 iv0Var = this.P;
        int i23 = 100;
        if (z21 && this.W0) {
            tu0 tu0Var = tu0VarArr[z10 ? 1 : 0];
            if (tu0Var.f33156f == null) {
                tu0Var.f33156f = new s4.w0();
            }
            tu0 tu0Var2 = tu0VarArr[z10 ? 1 : 0];
            s4.w0 w0Var7 = tu0Var2.f33156f;
            mv0 mv0Var = this.U;
            ru0 ru0Var = this.f26670l0;
            wu0 wu0Var = this.f26664j0;
            wu0 wu0Var2 = this.f26667k0;
            wu0 wu0Var3 = this.f26661i0;
            if (z10) {
                int i24 = tu0Var2.E;
                if (i24 != 0) {
                    w0Var5 = w0Var7;
                    if (i24 != 2 && i24 != 5 && i24 != 6 && (i24 != 7 || mu0Var.U())) {
                        if (w0Var6 != null) {
                            str = w0Var6.getSearchField().getText().toString();
                        }
                        int i25 = tu0VarArr[z10 ? 1 : 0].E;
                        if (i25 == 1) {
                            if (wu0Var3 != null) {
                                wu0Var3.G(str, false);
                                if (adapter != wu0Var3) {
                                    c1(adapter);
                                    tu0VarArr[z10 ? 1 : 0].h.setAdapter(wu0Var3);
                                }
                            }
                        } else if (i25 == 3) {
                            if (wu0Var2 != null) {
                                wu0Var2.G(str, false);
                                if (adapter != wu0Var2) {
                                    c1(adapter);
                                    tu0VarArr[z10 ? 1 : 0].h.setAdapter(wu0Var2);
                                }
                            }
                        } else if (i25 == 4) {
                            if (wu0Var != null) {
                                wu0Var.G(str, false);
                                if (adapter != wu0Var) {
                                    c1(adapter);
                                    tu0VarArr[z10 ? 1 : 0].h.setAdapter(wu0Var);
                                }
                            }
                        } else if (i25 == 7) {
                            if (ru0Var != null) {
                                ru0Var.F(str, false);
                                if (adapter != ru0Var) {
                                    c1(adapter);
                                    tu0VarArr[z10 ? 1 : 0].h.setAdapter(ru0Var);
                                }
                            }
                        } else if (i25 == 11) {
                            if (mv0Var != null) {
                                mv0Var.E(this.Y0, str);
                                if (adapter != mv0Var) {
                                    c1(adapter);
                                    tu0VarArr[z10 ? 1 : 0].h.setAdapter(mv0Var);
                                }
                            }
                        } else if (i25 == 15 && iv0Var != null && adapter != iv0Var) {
                            c1(adapter);
                            dt0 dt0Var = tu0VarArr[z10 ? 1 : 0].h;
                            iv0Var.f29384r = dt0Var;
                            dt0Var.setAdapter(iv0Var);
                        }
                    }
                }
                this.X0 = false;
                rt0 rt0Var = this.L0;
                if (rt0Var != null) {
                    rt0Var.g(false);
                }
                this.W0 = false;
                v1(true);
                return;
            }
            w0Var5 = w0Var7;
            if (tu0Var2.h != null) {
                int i26 = tu0Var2.E;
                if (i26 == 1) {
                    if (adapter != wu0Var3) {
                        c1(adapter);
                        tu0VarArr[z10 ? 1 : 0].h.setAdapter(wu0Var3);
                    }
                    wu0Var3.l();
                } else if (i26 == 3) {
                    if (adapter != wu0Var2) {
                        c1(adapter);
                        tu0VarArr[z10 ? 1 : 0].h.setAdapter(wu0Var2);
                    }
                    wu0Var2.l();
                } else if (i26 == 4) {
                    if (adapter != wu0Var) {
                        c1(adapter);
                        tu0VarArr[z10 ? 1 : 0].h.setAdapter(wu0Var);
                    }
                    wu0Var.l();
                } else if (i26 == 7) {
                    if (adapter != ru0Var) {
                        c1(adapter);
                        tu0VarArr[z10 ? 1 : 0].h.setAdapter(ru0Var);
                    }
                    ru0Var.l();
                } else if (i26 == 11) {
                    if (adapter != mv0Var) {
                        c1(adapter);
                        tu0VarArr[z10 ? 1 : 0].h.setAdapter(mv0Var);
                    }
                    mv0Var.l();
                }
            }
            tu0VarArr2 = tu0VarArr;
            w0Var = w0Var6;
            w0Var4 = w0Var5;
            z16 = false;
            i10 = 4;
            z13 = false;
            i14 = 8;
        } else {
            tu0 tu0Var3 = tu0VarArr[z10 ? 1 : 0];
            if (tu0Var3.e == null) {
                tu0Var3.e = new s4.w0();
            }
            tu0 tu0Var4 = tu0VarArr[z10 ? 1 : 0];
            s4.w0 w0Var8 = tu0Var4.e;
            tu0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i27 = tu0VarArr[z10 ? 1 : 0].E;
            if (i27 == 8 || E0(i27)) {
                layoutParams.topMargin = AndroidUtilities.dp(J0());
            }
            dt0 dt0Var2 = tu0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = dt0Var2.getPaddingLeft();
            tu0 tu0Var5 = tu0VarArr[z10 ? 1 : 0];
            tu0VarArr2 = tu0VarArr;
            dt0 dt0Var3 = tu0Var5.h;
            int g02 = g0(tu0Var5.E);
            dt0Var3.f32682h3 = g02;
            int paddingRight = tu0VarArr2[z10 ? 1 : 0].h.getPaddingRight();
            dt0 dt0Var4 = tu0VarArr2[z10 ? 1 : 0].h;
            w0Var = w0Var6;
            int f02 = f0(D0());
            dt0Var4.f32683i3 = f02;
            dt0Var2.setPadding(paddingLeft, g02, paddingRight, f02);
            int i28 = tu0VarArr2[z10 ? 1 : 0].E;
            int[] iArr = this.f26679o1;
            s4.h0 h0Var2 = this.M;
            View view = this.W;
            lv0 lv0Var = this.T;
            lu0 lu0Var = this.R;
            fu0 fu0Var = this.V;
            pv0[] pv0VarArr = this.f26696v1;
            if (i28 == 0) {
                s4.h0 h0Var3 = this.J;
                if (adapter != h0Var3) {
                    c1(adapter);
                    tu0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var3);
                }
                int i29 = -AndroidUtilities.dp(1.0f);
                layoutParams.rightMargin = i29;
                layoutParams.leftMargin = i29;
                pv0 pv0Var = pv0VarArr[0];
                if (pv0Var.h && !pv0Var.e.isEmpty()) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                i23 = iArr[0];
                tu0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.A0);
                pv0 pv0Var2 = pv0VarArr[0];
                if (pv0Var2.f31723x == null) {
                    pv0Var2.f31723x = new s4.w0();
                }
                w0Var2 = pv0VarArr[0].f31723x;
                z13 = z19;
                z11 = false;
            } else {
                if (i28 == 1) {
                    pv0 pv0Var3 = pv0VarArr[1];
                    if (pv0Var3.h && !pv0Var3.e.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (adapter != h0Var2) {
                        c1(adapter);
                        tu0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var2);
                    }
                } else if (i28 == 2) {
                    pv0 pv0Var4 = pv0VarArr[2];
                    if (pv0Var4.h && !pv0Var4.e.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    s4.h0 h0Var4 = this.N;
                    if (adapter != h0Var4) {
                        c1(adapter);
                        tu0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var4);
                    }
                } else {
                    if (i28 == 3) {
                        if (adapter != this.L) {
                            c1(adapter);
                            tu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.L);
                        }
                    } else if (i28 == 4) {
                        pv0 pv0Var5 = pv0VarArr[4];
                        if (pv0Var5.h && !pv0Var5.e.isEmpty()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (adapter != this.O) {
                            c1(adapter);
                            tu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.O);
                        }
                    } else {
                        if (i28 == 5) {
                            if (adapter != this.Q) {
                                c1(adapter);
                                tu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.Q);
                            }
                        } else if (i28 == 15) {
                            if (adapter != iv0Var) {
                                c1(adapter);
                                dt0 dt0Var5 = tu0VarArr2[z10 ? 1 : 0].h;
                                iv0Var.f29384r = dt0Var5;
                                dt0Var5.setAdapter(iv0Var);
                            }
                        } else if (i28 == 6) {
                            if (adapter != lu0Var) {
                                c1(adapter);
                                tu0VarArr2[z10 ? 1 : 0].h.setAdapter(lu0Var);
                            }
                        } else if (i28 == 7) {
                            if (adapter != this.f26642c0) {
                                c1(adapter);
                                tu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.f26642c0);
                            }
                        } else if (w0(i28)) {
                            s4.h0 t12 = t1(tu0VarArr2[z10 ? 1 : 0].E);
                            if (adapter != t12) {
                                c1(adapter);
                                tu0VarArr2[z10 ? 1 : 0].h.setAdapter(t12);
                                tu0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            tu0 tu0Var6 = tu0VarArr2[z10 ? 1 : 0];
                            if (tu0Var6.E != 9) {
                                zVar.h(tu0Var6.h);
                            }
                            i23 = iArr[1];
                        } else {
                            int i30 = tu0VarArr2[z10 ? 1 : 0].E;
                            if (i30 == 10) {
                                if (adapter != this.S) {
                                    c1(adapter);
                                    tu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.S);
                                }
                            } else if (i30 == 11) {
                                if (adapter != lv0Var) {
                                    c1(adapter);
                                    tu0VarArr2[z10 ? 1 : 0].h.setAdapter(lv0Var);
                                    s4.z zVar2 = lv0Var.v;
                                    dt0 dt0Var6 = tu0VarArr2[z10 ? 1 : 0].h;
                                    lv0Var.f30295s = dt0Var6;
                                    zVar2.h(dt0Var6);
                                }
                                w0Var2 = lv0Var.f30294r;
                                z11 = true;
                                z13 = false;
                            } else if (i30 == 12) {
                                if (adapter != null) {
                                    c1(adapter);
                                    tu0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (fu0Var.getParent() != tu0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(fu0Var);
                                    tu0VarArr2[z10 ? 1 : 0].addView(fu0Var, gb1.h(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                    j1(AndroidUtilities.dp(56.0f) + this.f26644c2, fu0Var);
                                }
                            } else if (i30 == 13) {
                                if (adapter != null) {
                                    c1(adapter);
                                    tu0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != tu0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(view);
                                    tu0VarArr2[z10 ? 1 : 0].addView(view);
                                    j1(this.f26644c2, view);
                                }
                            } else if (i30 == 14) {
                                if (adapter != null) {
                                    c1(adapter);
                                    tu0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (vs0Var != null && vs0Var.getParent() != tu0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(vs0Var);
                                    tu0VarArr2[z10 ? 1 : 0].addView(vs0Var);
                                    tu0VarArr2[z10 ? 1 : 0].v.setVisibility(4);
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
            E1(tu0VarArr2[z10 ? 1 : 0]);
            if (z11) {
                tu0VarArr2[z10 ? 1 : 0].h.setSections(false);
                w0Var3 = w0Var2;
            } else {
                dt0 dt0Var7 = tu0VarArr2[z10 ? 1 : 0].h;
                dt0Var7.getClass();
                w0Var3 = w0Var2;
                org.telegram.ui.ActionBar.f7.m(dt0Var7, 20, org.telegram.ui.ActionBar.y6.f23446i6, dt0Var7.f30644n2);
                dt0Var7.U2 = false;
                dt0Var7.H2 = null;
                dt0Var7.I2 = null;
                dt0Var7.L2 = 0.0f;
                dt0Var7.M2 = null;
                dt0Var7.N2 = null;
                dt0Var7.J2 = null;
                dt0Var7.setSectionsRounding(false);
                xl0 xl0Var = dt0Var7.G2;
                if (xl0Var != null) {
                    dt0Var7.q0(xl0Var);
                    dt0Var7.G2 = null;
                }
                ea eaVar = dt0Var7.S2;
                if (eaVar != null) {
                    dt0Var7.q0(eaVar);
                    dt0Var7.S2 = null;
                }
            }
            D1(tu0VarArr2[z10 ? 1 : 0]);
            tu0 tu0Var7 = tu0VarArr2[z10 ? 1 : 0];
            if (tu0Var7.E == 11) {
                tu0Var7.h.setItemAnimator(tu0Var7.d);
            } else {
                tu0Var7.h.setItemAnimator(null);
                if (lv0Var != null && tu0VarArr2[z10 ? 1 : 0].h == lv0Var.f30295s) {
                    s4.z zVar3 = lv0Var.v;
                    lv0Var.f30295s = null;
                    zVar3.h(null);
                }
            }
            if (fu0Var != null && tu0VarArr2[z10 ? 1 : 0].E != 12 && fu0Var.getParent() == tu0VarArr2[z10 ? 1 : 0]) {
                fu0Var.f45518a.onRemoveFromParent();
                tu0VarArr2[z10 ? 1 : 0].removeView(fu0Var);
            }
            if (view != null && tu0VarArr2[z10 ? 1 : 0].E != 13) {
                ViewParent parent = view.getParent();
                tu0 tu0Var8 = tu0VarArr2[z10 ? 1 : 0];
                if (parent == tu0Var8) {
                    tu0Var8.removeView(view);
                }
            }
            if (vs0Var != null && tu0VarArr2[z10 ? 1 : 0].E != 14) {
                ViewParent parent2 = vs0Var.getParent();
                tu0 tu0Var9 = tu0VarArr2[z10 ? 1 : 0];
                if (parent2 == tu0Var9) {
                    tu0Var9.removeView(vs0Var);
                }
            }
            int i31 = tu0VarArr2[z10 ? 1 : 0].E;
            if (i31 == 0 || i31 == 11 || w0(i31) || (i17 = tu0VarArr2[z10 ? 1 : 0].E) == 2 || i17 == 5 || i17 == 6 || ((i17 == 7 && !mu0Var.U()) || (i18 = tu0VarArr2[z10 ? 1 : 0].E) == 10 || i18 == 13 || i18 == 14)) {
                i10 = 4;
                if (z10) {
                    this.f26706z0 = 2;
                } else {
                    this.f26706z0 = 0;
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
                            z18 = kVar.f22772n0;
                        }
                        if (!z18) {
                            if (G()) {
                                this.f26706z0 = 1;
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
                            this.f26683q0 = i0(f7);
                            G1(1.0f - f7);
                            z17 = false;
                        }
                    }
                    z17 = false;
                    this.f26706z0 = 0;
                    this.f26683q0 = 1.0f;
                } else {
                    z17 = false;
                    if (w0Var != null) {
                        i10 = 4;
                        if (w0Var.getVisibility() == 4) {
                            if (G()) {
                                this.f26706z0 = 0;
                                this.f26683q0 = 1.0f;
                                setSearchItemVisibility(0);
                            } else {
                                if (D0()) {
                                    i19 = 8;
                                } else {
                                    i19 = 4;
                                }
                                setSearchItemVisibility(i19);
                                this.f26683q0 = 0.0f;
                            }
                        }
                        C1(z17);
                    }
                }
                i10 = 4;
                C1(z17);
            }
            int i32 = tu0VarArr2[z10 ? 1 : 0].E;
            if (i32 == 6) {
                if (!lu0Var.e && !lu0Var.h && lu0Var.d.isEmpty()) {
                    lu0.E(lu0Var, 0L);
                }
            } else if (i32 != 7) {
                if (w0(i32)) {
                    xv0 t13 = t1(tu0VarArr2[z10 ? 1 : 0].E);
                    if (t13 != null) {
                        di.z6 z6Var = t13.f34830s;
                        t13.P();
                        ot0 ot0Var = tu0VarArr2[z10 ? 1 : 0].v;
                        if (z6Var != null && (z6Var.k() || (q0() && z6Var.g() > 0))) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        ot0Var.e(z14, z10);
                        if (z6Var != null && z6Var.g() > 0 && !B0()) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z13 = z15;
                    }
                } else {
                    int i33 = tu0VarArr2[z10 ? 1 : 0].E;
                    if (i33 != 10 && i33 != 11 && i33 != 12 && i33 != 13 && i33 != 14) {
                        if (i33 == 15) {
                            i33 = 8;
                        }
                        pv0 pv0Var6 = pv0VarArr[i33];
                        if (!pv0Var6.f31708g && !pv0Var6.f31709i[0] && pv0Var6.f31704a.isEmpty()) {
                            pv0VarArr[i33].f31708g = true;
                            h0Var2.l();
                            if (i33 == 0) {
                                int i34 = pv0VarArr[0].f31717q;
                                if (i34 == 1) {
                                    i12 = 6;
                                } else if (i34 == 2) {
                                    i12 = 7;
                                }
                                this.f26702x1.getMediaDataController().loadMedia(this.l1, 50, 0, 0, i12, this.F, 1, this.f26702x1.getClassGuid(), pv0VarArr[i12].f31716p, null, null);
                            }
                            i12 = i33;
                            this.f26702x1.getMediaDataController().loadMedia(this.l1, 50, 0, 0, i12, this.F, 1, this.f26702x1.getClassGuid(), pv0VarArr[i12].f31716p, null, null);
                        }
                    }
                }
            }
            int i35 = tu0VarArr2[z10 ? 1 : 0].E;
            if (i35 != 8 && !E0(i35)) {
                tu0 tu0Var10 = tu0VarArr2[z10 ? 1 : 0];
                if (tu0Var10.E == 9) {
                    if (C0()) {
                        tu0VarArr2[z10 ? 1 : 0].v.f28013b.setVisibility(8);
                        tu0VarArr2[z10 ? 1 : 0].v.f28015f.setVisibility(8);
                    } else {
                        tu0VarArr2[z10 ? 1 : 0].v.f28013b.setVisibility(0);
                        tu0VarArr2[z10 ? 1 : 0].v.setStickerType(11);
                        tu0VarArr2[z10 ? 1 : 0].v.f28015f.setVisibility(0);
                        tu0VarArr2[z10 ? 1 : 0].v.f28015f.h(z(), false);
                    }
                    tu0VarArr2[z10 ? 1 : 0].v.d.setText(LocaleController.getString(R.string.NoArchivedStoriesTitle));
                    z90 z90Var = tu0VarArr2[z10 ? 1 : 0].v.e;
                    if (D0()) {
                        str = LocaleController.getString(R.string.NoArchivedStoriesSubtitle);
                    }
                    z90Var.setText(str);
                    tu0VarArr2[z10 ? 1 : 0].v.f28015f.setOnClickListener(new ur0(this, 4));
                    i14 = 8;
                } else {
                    tu0Var10.v.f28013b.setVisibility(0);
                    tu0VarArr2[z10 ? 1 : 0].v.setStickerType(1);
                    tu0VarArr2[z10 ? 1 : 0].v.d.setText(LocaleController.getString(R.string.NoResult));
                    tu0VarArr2[z10 ? 1 : 0].v.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    i14 = 8;
                    tu0VarArr2[z10 ? 1 : 0].v.f28015f.setVisibility(8);
                }
            } else {
                tu0 tu0Var11 = tu0VarArr2[z10 ? 1 : 0];
                ot0 ot0Var2 = tu0Var11.v;
                boolean E0 = E0(tu0Var11.E);
                int q12 = q1(tu0VarArr2[z10 ? 1 : 0].E);
                y9 y9Var = ot0Var2.f28013b;
                fi.d dVar = ot0Var2.f28015f;
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
                    ot0Var2.setStickerType(11);
                    if (!B0()) {
                        i15 = 0;
                    } else {
                        i15 = 8;
                    }
                    dVar.setVisibility(i15);
                    dVar.h(z(), false);
                }
                if (E0) {
                    ot0Var2.d.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeTitle));
                    ot0Var2.e.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeDescription));
                } else {
                    xh.n nVar = ot0Var2.d;
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
                    z90 z90Var2 = ot0Var2.e;
                    if (D0()) {
                        str = LocaleController.getString(R.string.NoStoriesSubtitle2);
                    }
                    z90Var2.setText(str);
                }
                dVar.setOnClickListener(new bs0(this, E0, q12, 0));
            }
            z16 = false;
            tu0VarArr2[z10 ? 1 : 0].h.setVisibility(0);
            w0Var4 = w0Var3;
        }
        int i36 = i23;
        tu0 tu0Var12 = tu0VarArr2[z10 ? 1 : 0];
        tu0Var12.f33154b = z13;
        z1(tu0Var12, z16);
        tu0VarArr2[z10 ? 1 : 0].f33160w.z1(i36);
        tu0VarArr2[z10 ? 1 : 0].h.a0();
        if (w0Var4 != null) {
            tu0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(w0Var4);
            tu0VarArr2[z10 ? 1 : 0].f33157n.setRecycledViewPool(w0Var4);
        }
        if (this.f26706z0 == 2) {
            org.telegram.ui.ActionBar.r5 r5Var2 = this.H;
            if (r5Var2 != null) {
                z20 = r5Var2.F;
            } else {
                z20 = kVar.f22772n0;
            }
            if (z20) {
                this.B0 = true;
                if (r5Var2 != null) {
                    r5Var2.f(true);
                } else {
                    kVar.g(true);
                }
                this.f26706z0 = 0;
                this.f26683q0 = 0.0f;
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
        if (!g1Var2.getCheckView().f35379a.f26087q && g1Var.getCheckView().f35379a.f26087q) {
            float f7 = -this.f26694u1;
            this.f26694u1 = f7;
            AndroidUtilities.shakeViewSpring(g1Var, f7);
            return;
        }
        g1Var.setChecked(!g1Var.getCheckView().f35379a.f26087q);
        runnable.run();
    }

    public boolean x0() {
        return false;
    }

    public final void x1() {
        if (this.H == null) {
            try {
                int p02 = p0(org.telegram.ui.ActionBar.y6.f23748y8);
                int p03 = p0(org.telegram.ui.ActionBar.y6.f23767z8);
                if (p02 != this.f26677n2 || p03 != this.f26680o2) {
                    this.f26677n2 = p02;
                    this.f26680o2 = p03;
                    org.telegram.ui.ActionBar.w0[] w0VarArr = {this.f26698w0, this.f26695v0, this.f26701x0, this.f26704y0, this.f26675n0};
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
        tu0[] tu0VarArr = this.m0;
        addView(view, Math.max(indexOfChild(tu0VarArr[0]), indexOfChild(tu0VarArr[1])) + 1, gb1.i(-1, 0, 48));
        view.getLayoutParams().height = 0;
    }

    public final boolean y0() {
        TLRPC.User user;
        long j10 = this.l1;
        if (j10 <= 0 || (user = MessagesController.getInstance(this.f26702x1.getCurrentAccount()).getUser(Long.valueOf(j10))) == null || !user.bot) {
            return false;
        }
        return true;
    }

    public final void y1() {
        eu0 eu0Var = this.J;
        if (eu0Var != null) {
            eu0Var.l();
        }
        nv0 nv0Var = this.M;
        if (nv0Var != null) {
            nv0Var.l();
        }
        nv0 nv0Var2 = this.N;
        if (nv0Var2 != null) {
            nv0Var2.l();
        }
        ov0 ov0Var = this.L;
        if (ov0Var != null) {
            ov0Var.X(false);
        }
        nv0 nv0Var3 = this.O;
        if (nv0Var3 != null) {
            nv0Var3.l();
        }
        iv0 iv0Var = this.P;
        if (iv0Var != null) {
            iv0Var.l();
        }
        ou0 ou0Var = this.Q;
        if (ou0Var != null) {
            ou0Var.l();
        }
        hu0 hu0Var = this.f26648e0;
        if (hu0Var != null) {
            hu0Var.l();
        }
        for (zv0 zv0Var : this.f26666j2.values()) {
            zv0Var.f35411c.l();
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
        if (this.f26653f1 != null && (r2Var = this.f26702x1) != null) {
            return ChatObject.isChannelAndNotMegaGroup(r2Var.getMessagesController().getChat(Long.valueOf(this.f26653f1.f22028id)));
        }
        return false;
    }

    public final void z1(tu0 tu0Var, boolean z10) {
        boolean z11;
        Integer num = 1;
        int i10 = 0;
        if (tu0Var.f33154b && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        sl0 fastScroll = tu0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = tu0Var.f33155c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            tu0Var.f33155c.cancel();
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
            tu0Var.f33155c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(num);
        } else if (!z11 && fastScroll.getTag() != null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, property, fastScroll.getAlpha(), 0.0f);
            ofFloat2.addListener(new org.telegram.ui.jo(fastScroll));
            tu0Var.f33155c = ofFloat2;
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
