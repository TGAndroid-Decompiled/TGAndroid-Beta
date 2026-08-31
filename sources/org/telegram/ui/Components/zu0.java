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
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
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
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
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
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController;
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
public abstract class zu0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Cells.n2 {
    public static final int[] a2 = {0, 1, 2, 4};
    public static final lr0 f33960b2 = new lr0(0);
    public final org.telegram.ui.ActionBar.i2 A0;
    public final kt0 A1;
    public final int B;
    public final ArrayList B0;
    public m40 B1;
    public final long C;
    public final ArrayList C0;
    public final org.telegram.ui.ActionBar.g6 C1;
    public final org.telegram.ui.ActionBar.k D;
    public final ArrayList D0;
    public final NotificationCenter.ObserversGroup D1;
    public final dt0 E;
    public final ArrayList E0;
    public boolean E1;
    public final tu0 F;
    public final os0 F0;
    public final AnimationNotificationsLocker F1;
    public final nu0 G;
    public final ls0 G0;
    public gy G1;
    public final mu0 H;
    public final org.telegram.ui.Cells.v0 H0;
    public int H1;
    public final mu0 I;
    public AnimatorSet I0;
    public boolean I1;
    public final mu0 J;
    public final vq0 J0;
    public int J1;
    public final fu0 K;
    public final ArrayList K0;
    public AnimatorSet K1;
    public final mt0 L;
    public float L0;
    public final SparseArray L1;
    public final jt0 M;
    public final ls M0;
    public long M1;
    public final ht0 N;
    public final FrameLayout N0;
    public boolean N1;
    public final iu0 O;
    public final ks0 O0;
    public int O1;
    public final ku0 P;
    public final int P0;
    public final vs0 P1;
    public final et0 Q;
    public final Paint Q0;
    public oh.l6 Q1;
    public final or0 R;
    public boolean R0;
    public float R1;
    public final pr0 S;
    public boolean S0;
    public boolean S1;
    public final tr0 T;
    public ng.q0 T0;
    public SpannableStringBuilder T1;
    public final it0 U;
    public final int[] U0;
    public int U1;
    public final f2.f0 V;
    public int V0;
    public final HashMap V1;
    public final gt0 W;
    public final SparseArray[] W0;
    public final HashMap W1;
    public int X0;
    public int X1;
    public boolean Y0;
    public int Y1;
    public long Z0;
    public final ah Z1;
    public boolean f33961a;
    public final wu0 f33962a0;
    public TLRPC.ChatFull f33963a1;
    public boolean f33964b;
    public final nr0 f33965b0;
    public TLRPC.UserFull f33966b1;
    public boolean f33967c;
    public final wu0 f33968c0;
    public AnimatorSet f33969c1;
    public boolean d;
    public final ut0 f33970d0;
    public boolean f33971d1;
    public int f33972e;
    public final ut0 f33973e0;
    public boolean f33974e1;
    public int f33975f;
    public final ut0 f33976f0;
    public boolean f33977f1;
    public final pt0 f33978g0;
    public final long f33979g1;
    public float h;
    public final rt0[] f33980h0;
    public boolean f33981h1;
    public final org.telegram.ui.ActionBar.w0 f33982i0;
    public boolean f33983i1;
    public final org.telegram.ui.ActionBar.w0 f33984j0;
    public final int[] f33985j1;
    public final org.telegram.ui.ActionBar.w0 f33986k0;
    public float f33987k1;
    public float f33988l0;
    public boolean l1;
    public float m0;
    public int f33989m1;
    public float f33990n;
    public final TextView f33991n0;
    public int f33992n1;
    public final ImageView f33993o0;
    public final yr0 f33994o1;
    public final lj0 f33995p0;
    public float f33996p1;
    public final org.telegram.ui.ActionBar.w0 f33997q0;
    public final ou0[] f33998q1;
    public boolean f33999r;
    public final org.telegram.ui.ActionBar.w0 f34000r0;
    public final ru0 f34001r1;
    public int f34002s;
    public final org.telegram.ui.ActionBar.w0 f34003s0;
    public final org.telegram.ui.ActionBar.p2 f34004s1;
    public final org.telegram.ui.ActionBar.w0 f34005t0;
    public int f34006t1;
    public int f34007u0;
    public boolean f34008u1;
    public int v;
    public final Drawable f34009v0;
    public boolean f34010v1;
    public int f34011w;
    public boolean f34012w0;
    public int f34013w1;
    public final Rect f34014x;
    public final NumberTextView f34015x0;
    public int f34016x1;
    public final u00 f34017y;
    public final z9 f34018y0;
    public VelocityTracker f34019y1;
    public final ImageView f34020z0;
    public boolean f34021z1;

    public zu0(android.content.Context r40, long r41, org.telegram.ui.Components.ru0 r43, int r44, java.util.ArrayList r45, org.telegram.tgnet.TLRPC.ChatFull r46, org.telegram.tgnet.TLRPC.UserFull r47, int r48, int r49, org.telegram.ui.ActionBar.p2 r50, org.telegram.ui.Components.kt0 r51, int r52, org.telegram.ui.ActionBar.g6 r53, og.a r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zu0.<init>(android.content.Context, long, org.telegram.ui.Components.ru0, int, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.tgnet.TLRPC$UserFull, int, int, org.telegram.ui.ActionBar.p2, org.telegram.ui.Components.kt0, int, org.telegram.ui.ActionBar.g6, og.a):void");
    }

    public static lt0 M(int i10, long j10, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        lt0 lt0Var = new lt0(context, g6Var);
        TextView textView = lt0Var.f28821a;
        if (i10 == 0) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoMediaSecret));
                return lt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoMedia));
            return lt0Var;
        } else if (i10 == 1) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedFilesSecret));
                return lt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedFiles));
            return lt0Var;
        } else if (i10 == 2) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedVoiceSecret));
                return lt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedVoice));
            return lt0Var;
        } else if (i10 == 3) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedLinksSecret));
                return lt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedLinks));
            return lt0Var;
        } else if (i10 == 4) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedAudioSecret));
                return lt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedAudio));
            return lt0Var;
        } else if (i10 == 5) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedGifSecret));
                return lt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoGIFs));
            return lt0Var;
        } else {
            ImageView imageView = lt0Var.f28822b;
            if (i10 == 6) {
                imageView.setImageDrawable(null);
                textView.setText(LocaleController.getString(R.string.NoGroupsInCommon));
                return lt0Var;
            }
            if (i10 == 7) {
                imageView.setImageDrawable(null);
                textView.setText("");
            }
            return lt0Var;
        }
    }

    public static TLRPC.ProfileTab d0(int i10, boolean z4) {
        if (i10 != 8 && i10 != 14 && !z4) {
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
        if (profileTab instanceof TLRPC.TL_profileTabGifs) {
            return 5;
        }
        return -1;
    }

    public static void g(zu0 zu0Var, int i10, TL_stories.StoryItem storyItem, String str) {
        gy gyVar = new gy(zu0Var, i10, storyItem, 8);
        oh.t6 storiesController = zu0Var.getStoriesController();
        long j10 = zu0Var.f33979g1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.c0(i10, j10, arrayList);
        qc.a0(zu0Var.f34004s1).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", 1, str)), LocaleController.getString(R.string.UndoNoCaps), gyVar).j();
    }

    public oh.t6 getStoriesController() {
        return MessagesController.getInstance(this.f34004s1.getCurrentAccount()).getStoriesController();
    }

    public static void h(zu0 zu0Var, TL_stories.StoryItem storyItem) {
        zu0Var.getStoriesController().o0(zu0Var.f33979g1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        qc.a0(zu0Var.f34004s1).G(R.raw.chats_archived, 5000, LocaleController.formatPluralString("StoryArchived", 1, new Object[0])).j();
    }

    public static void i(zu0 zu0Var, long j10, int i10, String str) {
        oh.h6 B = zu0Var.getStoriesController().B(j10, true);
        int i11 = B.f17184a;
        int c3 = B.c(i10);
        if (c3 == -1) {
            return;
        }
        ((oh.m6) B.h.get(c3)).f17440b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f17185b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public static void j(zu0 zu0Var, TL_stories.StoryItem storyItem, oh.m6 m6Var) {
        zu0Var.getStoriesController().c(m6Var.f17439a, zu0Var.f33979g1, storyItem);
        AndroidUtilities.runOnUIThread(new a90(18, zu0Var, m6Var), 100L);
    }

    public static void k(int i10, TL_stories.StoryItem storyItem, zu0 zu0Var) {
        zu0Var.getStoriesController().c(i10, zu0Var.f33979g1, storyItem);
    }

    public static void m(zu0 zu0Var, HashSet hashSet, TL_stories.StoryItem storyItem, q70 q70Var, oh.m6 m6Var) {
        String formatString;
        long j10 = zu0Var.f33979g1;
        if (hashSet.contains(Integer.valueOf(m6Var.f17439a))) {
            zu0Var.getStoriesController().c(m6Var.f17439a, j10, storyItem);
            formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, m6Var.f17440b);
        } else {
            oh.t6 storiesController = zu0Var.getStoriesController();
            int i10 = m6Var.f17439a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.c0(i10, j10, arrayList);
            formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, m6Var.f17440b);
        }
        qc.a0(zu0Var.f34004s1).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
        q70Var.u();
    }

    public static void n(zu0 zu0Var, long j10, int i10) {
        oh.h6 B = zu0Var.getStoriesController().B(j10, true);
        int i11 = B.f17184a;
        int c3 = B.c(i10);
        if (c3 == -1) {
            return;
        }
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f17185b);
        tL_deleteAlbum.album_id = ((oh.m6) B.h.remove(c3)).f17439a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public static int p(View view) {
        if (view instanceof org.telegram.ui.Cells.r7) {
            return ((org.telegram.ui.Cells.r7) view).getMessageId();
        }
        if (view instanceof org.telegram.ui.Cells.i7) {
            return ((org.telegram.ui.Cells.i7) view).getMessage().getId();
        }
        if (view instanceof org.telegram.ui.Cells.h7) {
            return ((org.telegram.ui.Cells.h7) view).getMessage().getId();
        }
        return 0;
    }

    public static boolean p0(int i10) {
        if (i10 != 8 && i10 != 9 && !w0(i10)) {
            return false;
        }
        return true;
    }

    public static void q(rt0 rt0Var, ou0[] ou0VarArr, boolean z4) {
        a90 a90Var;
        if (z4) {
            if (SharedConfig.fastScrollHintCount > 0 && rt0Var.D == null && !rt0Var.F && rt0Var.h.getFastScroll() != null && rt0Var.h.getFastScroll().U && rt0Var.h.getFastScroll().getVisibility() == 0 && ou0VarArr[0].e() >= 50) {
                SharedConfig.setFastScrollHintCount(SharedConfig.fastScrollHintCount - 1);
                rt0Var.F = true;
                Context context = rt0Var.getContext();
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                textView.setText(LocaleController.getString(R.string.SharedMediaFastScrollHint));
                textView.setTextSize(1, 14.0f);
                textView.setMaxLines(3);
                int i10 = org.telegram.ui.ActionBar.k6.f21884pf;
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
                frameLayout.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21902qf, false)));
                frameLayout.addView(textView, k7.c6.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
                ?? view = new View(context);
                view.f31151a = new Random();
                Paint paint = new Paint(1);
                view.f31152b = paint;
                Paint paint2 = new Paint(1);
                view.f31153c = paint2;
                view.f31155f = 1.0f;
                view.h = 0.0f;
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, i10, false), 76));
                paint2.setColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
                Paint paint3 = new Paint();
                view.d = paint3;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint3.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint3.setXfermode(new PorterDuffXfermode(mode));
                Paint paint4 = new Paint();
                view.f31154e = paint4;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                paint4.setXfermode(new PorterDuffXfermode(mode));
                frameLayout.addView(view, k7.c6.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                rt0Var.D = frameLayout;
                rt0Var.addView((View) frameLayout, k7.c6.c(-2.0f, -2));
                rt0Var.D.setAlpha(0.0f);
                rt0Var.D.setScaleX(0.8f);
                rt0Var.D.setScaleY(0.8f);
                rt0Var.D.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                rt0Var.invalidate();
                a90 a90Var2 = new a90(17, rt0Var, frameLayout);
                rt0Var.E = a90Var2;
                AndroidUtilities.runOnUIThread(a90Var2, 4000L);
            }
        } else if (rt0Var.D != null && (a90Var = rt0Var.E) != null) {
            AndroidUtilities.cancelRunOnUIThread(a90Var);
            rt0Var.E.run();
            rt0Var.E = null;
            rt0Var.D = null;
        }
    }

    public static void s(org.telegram.ui.Components.zu0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zu0.s(org.telegram.ui.Components.zu0):void");
    }

    public static void t(zu0 zu0Var, int i10, boolean z4) {
        rt0[] rt0VarArr = zu0Var.f33980h0;
        if (rt0VarArr[0].C == i10) {
            return;
        }
        rt0 rt0Var = rt0VarArr[1];
        rt0Var.C = i10;
        rt0Var.setVisibility(0);
        zu0Var.k0();
        zu0Var.m1(true);
        zu0Var.f33974e1 = z4;
        zu0Var.L0();
        zu0Var.A(!zu0Var.s0(i10), true);
        zu0Var.q1(true);
    }

    public static int u(zu0 zu0Var, f2.p0 p0Var) {
        if (p0Var == zu0Var.W) {
            return 8;
        }
        if (p0Var == zu0Var.f33965b0) {
            return 9;
        }
        for (yu0 yu0Var : zu0Var.V1.values()) {
            if (yu0Var.f33581c == p0Var) {
                return yu0Var.f33579a;
            }
        }
        return -1;
    }

    public static int v(zu0 zu0Var, f2.p0 p0Var) {
        if (p0Var == zu0Var.f33962a0) {
            return 8;
        }
        if (p0Var == zu0Var.f33968c0) {
            return 9;
        }
        for (yu0 yu0Var : zu0Var.V1.values()) {
            if (yu0Var.d == p0Var) {
                return yu0Var.f33579a;
            }
        }
        return -1;
    }

    public static boolean w0(int i10) {
        if ((i10 & (-65536)) == 65536) {
            return true;
        }
        return false;
    }

    public final void A(boolean z4, boolean z10) {
        int i10;
        lj0 lj0Var = this.f33995p0;
        if (lj0Var != null && this.S1 != z4) {
            this.S1 = z4;
            if (!z4 && lj0Var.getAnimatedDrawable().Y < 20) {
                lj0Var.getAnimatedDrawable().N(0);
            } else {
                ij0 animatedDrawable = lj0Var.getAnimatedDrawable();
                if (this.S1) {
                    i10 = 50;
                } else {
                    i10 = 100;
                }
                animatedDrawable.N(i10);
            }
            if (z10) {
                lj0Var.getAnimatedDrawable().start();
            } else {
                lj0Var.getAnimatedDrawable().K(lj0Var.getAnimatedDrawable().f27819f);
            }
        }
    }

    public final void A0(int i10) {
        int i11;
        ou0[] ou0VarArr = this.f33998q1;
        if (i10 == 0) {
            int i12 = ou0VarArr[0].f29865q;
            if (i12 == 1) {
                i11 = 6;
            } else if (i12 == 2) {
                i11 = 7;
            } else {
                i11 = 0;
            }
        } else if (i10 == 1) {
            i11 = 1;
        } else if (i10 == 2) {
            i11 = 2;
        } else if (i10 == 4) {
            i11 = 4;
        } else if (i10 == 5) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        ou0VarArr[i10].f29856g = true;
        org.telegram.ui.ActionBar.p2 p2Var = this.f34004s1;
        p2Var.getMediaDataController().loadMedia(this.f33979g1, 50, 0, ou0VarArr[i10].f29859k, i11, this.C, 1, p2Var.getClassGuid(), ou0VarArr[i10].f29864p, null, null);
    }

    public final void B(int i10) {
        int i11;
        rt0 W = W(this.f33989m1);
        this.f34002s = -1;
        if (W != null) {
            W.h.B0();
            this.f33992n1 = i10;
            W.f30850r.setVisibility(0);
            if (p0(this.f33989m1)) {
                W.f30850r.setAdapter(l1(this.f33989m1));
            } else {
                W.f30850r.setAdapter(this.F);
            }
            qt0 qt0Var = W.f30850r;
            int paddingLeft = qt0Var.getPaddingLeft();
            qt0 qt0Var2 = W.f30850r;
            int Z = Z(W.C);
            qt0Var2.f30477a3 = Z;
            int paddingRight = W.f30850r.getPaddingRight();
            qt0 qt0Var3 = W.f30850r;
            int Y = Y(v0());
            qt0Var3.f30478b3 = Y;
            qt0Var.setPadding(paddingLeft, Z, paddingRight, Y);
            W.f30851s.y1(i10);
            W.f30850r.a0();
            int i12 = 0;
            while (true) {
                rt0[] rt0VarArr = this.f33980h0;
                if (i12 >= rt0VarArr.length) {
                    break;
                }
                rt0 rt0Var = rt0VarArr[i12];
                if (rt0Var != null && ((i11 = rt0Var.C) == 0 || p0(i11))) {
                    AndroidUtilities.updateVisibleRows(rt0VarArr[i12].h);
                }
                i12++;
            }
            this.l1 = true;
            if (this.f33989m1 == 0) {
                this.f33998q1[0].g(true);
            }
            this.f33987k1 = 0.0f;
            X0();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.F1.lock();
            ofFloat.addUpdateListener(new ns0(this, W, 1));
            ofFloat.addListener(new s20(this, p0(W.C) ? 1 : 0, i10, 1));
            ofFloat.setInterpolator(pr.f30183f);
            ofFloat.setStartDelay(100L);
            ofFloat.setDuration(350L);
            ofFloat.start();
        }
    }

    public int B0() {
        return 0;
    }

    public final boolean C() {
        boolean r02 = r0();
        long j10 = this.f33979g1;
        org.telegram.ui.ActionBar.p2 p2Var = this.f34004s1;
        if (r02) {
            TLRPC.User user = MessagesController.getInstance(p2Var.getCurrentAccount()).getUser(Long.valueOf(j10));
            if (user == null || !user.bot || !user.bot_can_edit) {
                return false;
            }
            return true;
        } else if (!v0() && (p2Var == null || !p2Var.getMessagesController().getStoriesController().h(j10))) {
            return false;
        } else {
            return true;
        }
    }

    public final void C0(int i10, View view) {
        boolean z4;
        String string;
        int i11;
        or0 or0Var;
        int i12;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z10;
        String formatPluralString;
        String formatPluralString2;
        int i13;
        int i14;
        TLRPC.User user2;
        iu0 iu0Var = this.O;
        SparseArray[] sparseArrayArr = this.W0;
        org.telegram.ui.ActionBar.p2 p2Var = this.f34004s1;
        boolean z11 = true;
        char c3 = 1;
        if (i10 == 101) {
            boolean p02 = p0(getSelectedTab());
            org.telegram.ui.ActionBar.g6 g6Var = this.C1;
            if (!p02 && getSelectedTab() != 13) {
                if (getSelectedTab() == 11) {
                    SavedMessagesController savedMessagesController = p2Var.getMessagesController().getSavedMessagesController();
                    final ArrayList arrayList = new ArrayList();
                    for (int i15 = 0; i15 < savedMessagesController.allDialogs.size(); i15++) {
                        long j10 = savedMessagesController.allDialogs.get(i15).dialogId;
                        if (iu0Var.f27912w.contains(Long.valueOf(j10))) {
                            arrayList.add(Long.valueOf(j10));
                        }
                    }
                    String str = "";
                    if (!arrayList.isEmpty()) {
                        Long l10 = (Long) arrayList.get(0);
                        long longValue = l10.longValue();
                        if (longValue == p2Var.getUserConfig().getClientUserId()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i16 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                        if (i16 < 0) {
                            TLRPC.Chat chat2 = p2Var.getMessagesController().getChat(Long.valueOf(-longValue));
                            if (chat2 != null) {
                                str = chat2.title;
                            }
                        } else if (i16 >= 0 && (user2 = p2Var.getMessagesController().getUser(l10)) != null) {
                            str = UserObject.isAnonymous(user2) ? LocaleController.getString(R.string.AnonymousForward) : UserObject.getUserName(user2);
                        }
                    } else {
                        z10 = false;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, g6Var);
                    if (arrayList.size() == 1) {
                        if (z10) {
                            i14 = R.string.ClearHistoryMyNotesTitle;
                        } else {
                            i14 = R.string.ClearHistoryTitleSingle2;
                        }
                        formatPluralString = LocaleController.formatString(i14, str);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("ClearHistoryTitleMultiple", arrayList.size(), new Object[0]);
                    }
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                    d2Var.O = formatPluralString;
                    if (arrayList.size() == 1) {
                        if (z10) {
                            i13 = R.string.ClearHistoryMyNotesMessage;
                        } else {
                            i13 = R.string.ClearHistoryMessageSingle;
                        }
                        formatPluralString2 = LocaleController.formatString(i13, str);
                    } else {
                        formatPluralString2 = LocaleController.formatPluralString("ClearHistoryMessageMultiple", arrayList.size(), new Object[0]);
                    }
                    d2Var.Q = formatPluralString2;
                    alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.c2(this) {
                        public final zu0 f26077b;

                        {
                            this.f26077b = this;
                        }

                        @Override
                        public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i17) {
                            switch (r3) {
                                case 0:
                                    zu0 zu0Var = this.f26077b;
                                    org.telegram.ui.ActionBar.p2 p2Var2 = zu0Var.f34004s1;
                                    oh.t6 storiesController = p2Var2.getMessagesController().getStoriesController();
                                    long j11 = zu0Var.f33979g1;
                                    ArrayList arrayList2 = arrayList;
                                    storiesController.s(j11, arrayList2);
                                    qc.a0(p2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList2.size(), new Object[0])).j();
                                    zu0Var.L(false);
                                    return;
                                default:
                                    zu0 zu0Var2 = this.f26077b;
                                    zu0Var2.getClass();
                                    int i18 = 0;
                                    while (true) {
                                        ArrayList arrayList3 = arrayList;
                                        if (i18 < arrayList3.size()) {
                                            zu0Var2.f34004s1.getMessagesController().deleteSavedDialog(((Long) arrayList3.get(i18)).longValue());
                                            i18++;
                                        } else {
                                            zu0Var2.L(true);
                                            return;
                                        }
                                    }
                            }
                        }
                    });
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    p2Var.showDialog(d2Var);
                    TextView textView = (TextView) d2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21895q7, false));
                        return;
                    }
                    return;
                }
                long j11 = this.f33979g1;
                if (DialogObject.isEncryptedDialog(j11)) {
                    encryptedChat = org.telegram.messenger.y3.n(p2Var.getMessagesController(), j11);
                    user = null;
                    chat = null;
                } else if (DialogObject.isUserDialog(j11)) {
                    user = p2Var.getMessagesController().getUser(Long.valueOf(j11));
                    chat = null;
                    encryptedChat = null;
                } else {
                    chat = p2Var.getMessagesController().getChat(Long.valueOf(-j11));
                    user = null;
                    encryptedChat = null;
                }
                z4.z(p2Var, user, chat, encryptedChat, null, this.Z0, null, this.W0, null, 0, 0, null, new vq0(this, 1), null, this.C1);
            } else if (sparseArrayArr[0] != null) {
                if (r0() && (or0Var = this.R) != null && or0Var.getCurrentList() != null) {
                    oh.d6 currentList = or0Var.getCurrentList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i17 = 0; i17 < sparseArrayArr[0].size(); i17++) {
                        TL_stories.StoryItem storyItem = ((MessageObject) sparseArrayArr[0].valueAt(i17)).storyItem;
                        if (storyItem != null) {
                            arrayList2.add(storyItem.media);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, g6Var);
                        if (arrayList2.size() > 1) {
                            i12 = R.string.DeleteBotPreviewsTitle;
                        } else {
                            i12 = R.string.DeleteBotPreviewTitle;
                        }
                        String string2 = LocaleController.getString(i12);
                        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f21166a;
                        d2Var2.O = string2;
                        d2Var2.Q = LocaleController.formatPluralString("DeleteBotPreviewsSubtitle", arrayList2.size(), new Object[0]);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new androidx.car.app.utils.a(this, currentList, arrayList2, 26));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new mh0(6));
                        d2Var2.show();
                        d2Var2.h();
                        return;
                    }
                    return;
                }
                final ArrayList arrayList3 = new ArrayList();
                for (int i18 = 0; i18 < sparseArrayArr[0].size(); i18++) {
                    TL_stories.StoryItem storyItem2 = ((MessageObject) sparseArrayArr[0].valueAt(i18)).storyItem;
                    if (storyItem2 != null) {
                        arrayList3.add(storyItem2);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), 0, g6Var);
                    if (arrayList3.size() > 1) {
                        i11 = R.string.DeleteStoriesTitle;
                    } else {
                        i11 = R.string.DeleteStoryTitle;
                    }
                    String string3 = LocaleController.getString(i11);
                    org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.f21166a;
                    d2Var3.O = string3;
                    d2Var3.Q = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList3.size(), new Object[0]);
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2(this) {
                        public final zu0 f26077b;

                        {
                            this.f26077b = this;
                        }

                        @Override
                        public final void j(org.telegram.ui.ActionBar.d2 d2Var22, int i172) {
                            switch (r3) {
                                case 0:
                                    zu0 zu0Var = this.f26077b;
                                    org.telegram.ui.ActionBar.p2 p2Var2 = zu0Var.f34004s1;
                                    oh.t6 storiesController = p2Var2.getMessagesController().getStoriesController();
                                    long j112 = zu0Var.f33979g1;
                                    ArrayList arrayList22 = arrayList3;
                                    storiesController.s(j112, arrayList22);
                                    qc.a0(p2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList22.size(), new Object[0])).j();
                                    zu0Var.L(false);
                                    return;
                                default:
                                    zu0 zu0Var2 = this.f26077b;
                                    zu0Var2.getClass();
                                    int i182 = 0;
                                    while (true) {
                                        ArrayList arrayList32 = arrayList3;
                                        if (i182 < arrayList32.size()) {
                                            zu0Var2.f34004s1.getMessagesController().deleteSavedDialog(((Long) arrayList32.get(i182)).longValue());
                                            i182++;
                                        } else {
                                            zu0Var2.L(true);
                                            return;
                                        }
                                    }
                            }
                        }
                    });
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new mh0(7));
                    d2Var3.show();
                    d2Var3.h();
                }
            }
        } else if (i10 == 100) {
            if (this.f33966b1 != null && p2Var.getMessagesController().isUserNoForwards(this.f33966b1)) {
                m40 m40Var = this.B1;
                if (m40Var != null) {
                    m40Var.setText(LocaleController.getString(R.string.ForwardsRestrictedInfoUser));
                    this.B1.f(view, true);
                    return;
                }
                return;
            }
            if (this.f33963a1 != null) {
                TLRPC.Chat chat3 = p2Var.getMessagesController().getChat(Long.valueOf(this.f33963a1.f20844id));
                if (p2Var.getMessagesController().isChatNoForwards(chat3)) {
                    m40 m40Var2 = this.B1;
                    if (m40Var2 != null) {
                        if (ChatObject.isChannel(chat3) && !chat3.megagroup) {
                            string = LocaleController.getString(R.string.ForwardsRestrictedInfoChannel);
                        } else {
                            string = LocaleController.getString(R.string.ForwardsRestrictedInfoGroup);
                        }
                        m40Var2.setText(string);
                        this.B1.f(view, true);
                        return;
                    }
                    return;
                }
            }
            if (j0()) {
                m40 m40Var3 = this.B1;
                if (m40Var3 != null) {
                    m40Var3.setText(LocaleController.getString("ForwardsRestrictedInfoBot", R.string.ForwardsRestrictedInfoBot));
                    this.B1.f(view, true);
                    return;
                }
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("canSelectTopics", true);
            bundle.putInt("dialogsType", 3);
            org.telegram.ui.py pyVar = new org.telegram.ui.py(bundle);
            pyVar.f40308z2 = new wq0(this);
            p2Var.presentFragment(pyVar);
        } else if (i10 == 102) {
            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 1) {
                if (sparseArrayArr[0].size() == 1) {
                    c3 = 0;
                }
                MessageObject messageObject = (MessageObject) sparseArrayArr[c3].valueAt(0);
                Bundle bundle2 = new Bundle();
                long dialogId = messageObject.getDialogId();
                if (DialogObject.isEncryptedDialog(dialogId)) {
                    bundle2.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
                } else if (DialogObject.isUserDialog(dialogId)) {
                    bundle2.putLong("user_id", dialogId);
                } else {
                    TLRPC.Chat chat4 = p2Var.getMessagesController().getChat(Long.valueOf(-dialogId));
                    if (chat4 != null && chat4.migrated_to != null) {
                        bundle2.putLong("migrated_to", dialogId);
                        dialogId = -chat4.migrated_to.channel_id;
                    }
                    bundle2.putLong("chat_id", -dialogId);
                }
                bundle2.putInt("message_id", messageObject.getId());
                bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                org.telegram.ui.xn xnVar = new org.telegram.ui.xn(bundle2);
                xnVar.I7 = messageObject.getId();
                long j12 = this.C;
                if (j12 != 0) {
                    bg.e.a(xnVar, MessagesStorage.TopicKey.of(dialogId, j12));
                    bundle2.putInt("message_id", messageObject.getId());
                }
                p2Var.presentFragment(xnVar, false);
            }
        } else if (i10 == 103 || i10 == 104) {
            if (getClosestTab() == 8) {
                gt0 gt0Var = this.W;
                if (gt0Var != null && gt0Var.f32857s != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (int i19 = 0; i19 < sparseArrayArr[0].size(); i19++) {
                        arrayList4.add(Integer.valueOf(((MessageObject) sparseArrayArr[0].valueAt(i19)).getId()));
                    }
                    if (i10 != 103) {
                        z11 = false;
                    }
                    T0(arrayList4, z11);
                    L(false);
                    return;
                }
                return;
            }
            SavedMessagesController savedMessagesController2 = p2Var.getMessagesController().getSavedMessagesController();
            ArrayList<Long> arrayList5 = new ArrayList<>();
            for (int i20 = 0; i20 < savedMessagesController2.allDialogs.size(); i20++) {
                long j13 = savedMessagesController2.allDialogs.get(i20).dialogId;
                if (iu0Var.f27912w.contains(Long.valueOf(j13))) {
                    arrayList5.add(Long.valueOf(j13));
                }
            }
            if (i10 == 103) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!savedMessagesController2.updatePinned(arrayList5, z4, true)) {
                p2Var.showDialog(new fg.v0(33, p2Var.getCurrentAccount(), getContext(), p2Var, null));
            } else {
                int i21 = 0;
                while (true) {
                    rt0[] rt0VarArr = this.f33980h0;
                    if (i21 >= rt0VarArr.length) {
                        break;
                    }
                    rt0 rt0Var = rt0VarArr[i21];
                    if (rt0Var.C == 11) {
                        rt0Var.f30853x.h1(0, 0);
                        break;
                    }
                    i21++;
                }
            }
            L(true);
        }
    }

    public boolean D() {
        return !(this instanceof c40);
    }

    public final boolean E() {
        rt0 rt0Var;
        rt0[] rt0VarArr = this.f33980h0;
        if (rt0VarArr == null || (rt0Var = rt0VarArr[0]) == null) {
            return false;
        }
        if (this.f33981h1 && p0(rt0Var.C)) {
            return false;
        }
        boolean p02 = p0(rt0VarArr[0].C);
        int i10 = this.f33985j1[p02 ? 1 : 0];
        if (i10 == X(p02 ? 1 : 0, i10, false)) {
            return false;
        }
        return true;
    }

    public final void F() {
        os0 os0Var = this.F0;
        if (!os0Var.d(os0Var.getCurrentTabId())) {
            int firstTabId = os0Var.getFirstTabId();
            os0Var.setInitialTabId(firstTabId);
            this.f33980h0[0].C = firstTabId;
            m1(false);
        }
    }

    public final void F0() {
        oh.l6 l6Var;
        oh.l6 l6Var2;
        this.D1.removeAllObservers();
        gt0 gt0Var = this.W;
        if (gt0Var != null && (l6Var2 = gt0Var.f32857s) != null && l6Var2 != null) {
            l6Var2.z(gt0Var.v);
        }
        nr0 nr0Var = this.f33965b0;
        if (nr0Var != null && (l6Var = nr0Var.f32857s) != null && l6Var != null) {
            l6Var.z(nr0Var.v);
        }
        for (yu0 yu0Var : this.V1.values()) {
            xu0 xu0Var = yu0Var.f33581c;
            oh.l6 l6Var3 = xu0Var.f32857s;
            if (l6Var3 != null && l6Var3 != null) {
                l6Var3.z(xu0Var.v);
            }
        }
    }

    public final void G(rt0 rt0Var, tl0 tl0Var, f2.j0 j0Var) {
        int abs;
        int h;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        f2.m1 K;
        MessageObject messageObject;
        oh.l6 l6Var;
        if (!this.l1 && this.G1 == null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (tl0Var.getFastScroll() == null || !tl0Var.getFastScroll().f26044n || currentTimeMillis - rt0Var.f30844a >= 300) {
                rt0Var.f30844a = currentTimeMillis;
                if ((!this.S0 || !this.R0 || rt0Var.C == 11) && rt0Var.C != 7) {
                    int L0 = j0Var.L0();
                    if (L0 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(j0Var.N0() - L0) + 1;
                    }
                    if (tl0Var.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = tl0Var.getAdapter().h();
                    }
                    int i15 = rt0Var.C;
                    int[] iArr = this.f33985j1;
                    ou0[] ou0VarArr = this.f33998q1;
                    if (i15 == 0 || i15 == 1 || i15 == 2 || i15 == 4) {
                        h = ou0VarArr[i15].d() + ou0VarArr[i15].f29851a.size();
                        ou0 ou0Var = ou0VarArr[i15];
                        if (ou0Var.h && ou0Var.f29854e.size() > 2 && rt0Var.C == 0 && ou0VarArr[i15].f29851a.size() != 0) {
                            if (i15 == 0) {
                                i10 = iArr[0];
                            } else {
                                i10 = 1;
                            }
                            float f10 = i10;
                            int measuredHeight = (int) ((tl0Var.getMeasuredHeight() / (tl0Var.getMeasuredWidth() / f10)) * f10 * 1.5f);
                            if (measuredHeight < 100) {
                                measuredHeight = 100;
                            }
                            if (measuredHeight < ((wt0) ou0VarArr[i15].f29854e.get(1)).f32847b) {
                                measuredHeight = ((wt0) ou0VarArr[i15].f29854e.get(1)).f32847b;
                            }
                            if ((L0 > h && L0 - h > measuredHeight) || ((i11 = L0 + abs) < ou0VarArr[i15].f29861m && ou0VarArr[0].f29861m - i11 > measuredHeight)) {
                                gy gyVar = new gy(this, i15, tl0Var, 10);
                                this.G1 = gyVar;
                                AndroidUtilities.runOnUIThread(gyVar);
                                return;
                            }
                        }
                    }
                    int i16 = rt0Var.C;
                    if (i16 != 7) {
                        if (p0(i16)) {
                            wu0 k12 = k1(rt0Var.C);
                            if (k12 != null && (l6Var = k12.f32857s) != null && L0 + abs > l6Var.i() - iArr[1]) {
                                k12.P();
                                return;
                            }
                            return;
                        }
                        int i17 = rt0Var.C;
                        if (i17 == 6) {
                            if (abs > 0) {
                                jt0 jt0Var = this.M;
                                boolean z4 = jt0Var.h;
                                ArrayList arrayList = jt0Var.d;
                                if (!z4 && !jt0Var.f28201e && !arrayList.isEmpty() && L0 + abs >= h - 5) {
                                    jt0.E(jt0Var, ((TLRPC.Chat) l.d.i(1, arrayList)).f20843id);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.p2 p2Var = this.f34004s1;
                        if (i17 == 11) {
                            int i18 = -1;
                            for (int i19 = 0; i19 < rt0Var.h.getChildCount(); i19++) {
                                View childAt = rt0Var.h.getChildAt(i19);
                                rt0Var.h.getClass();
                                i18 = Math.max(RecyclerView.R(childAt), i18);
                            }
                            f2.p0 adapter = rt0Var.h.getAdapter();
                            ku0 ku0Var = this.P;
                            if (adapter == ku0Var) {
                                if (i18 + 1 >= ku0Var.h.size() + ku0Var.f28453e.size() && !ku0Var.f28457s && !ku0Var.f28456r) {
                                    ku0Var.f28456r = true;
                                    ku0Var.F();
                                }
                            } else if (i18 + 1 >= p2Var.getMessagesController().getSavedMessagesController().getLoadedCount()) {
                                p2Var.getMessagesController().getSavedMessagesController().loadDialogs(false);
                            }
                        } else if (i17 != 10 && i17 != 12 && i17 != 13 && i17 != 14) {
                            if (i17 == 0) {
                                i12 = 3;
                            } else if (i17 == 5) {
                                i12 = 10;
                            } else {
                                i12 = 6;
                            }
                            if (i17 == 15) {
                                i13 = 8;
                            } else {
                                i13 = i17;
                            }
                            if (abs + L0 > h - i12 || ou0VarArr[i13].f29863o) {
                                ou0 ou0Var2 = ou0VarArr[i13];
                                if (!ou0Var2.f29856g) {
                                    if (i17 == 0) {
                                        int i20 = ou0VarArr[0].f29865q;
                                        if (i20 == 1) {
                                            i14 = 6;
                                        } else if (i20 == 2) {
                                            i14 = 7;
                                        } else {
                                            i14 = 0;
                                        }
                                    } else if (i17 == 1) {
                                        i14 = 1;
                                    } else if (i17 == 2) {
                                        i14 = 2;
                                    } else if (i17 == 4) {
                                        i14 = 4;
                                    } else if (i17 == 5) {
                                        i14 = 5;
                                    } else if (i17 == 15) {
                                        i14 = 8;
                                    } else {
                                        i14 = 3;
                                    }
                                    boolean[] zArr = ou0Var2.f29857i;
                                    if (!zArr[0]) {
                                        ou0Var2.f29856g = true;
                                        p2Var.getMediaDataController().loadMedia(this.f33979g1, 50, ou0VarArr[i13].f29858j[0], 0, i14, this.C, 1, p2Var.getClassGuid(), ou0VarArr[i13].f29864p, null, null);
                                    } else if (this.Z0 != 0 && !zArr[1]) {
                                        ou0Var2.f29856g = true;
                                        p2Var.getMediaDataController().loadMedia(this.Z0, 50, ou0VarArr[i13].f29858j[1], 0, i14, this.C, 1, p2Var.getClassGuid(), ou0VarArr[i13].f29864p, null, null);
                                    }
                                }
                            }
                            int i21 = ou0VarArr[i13].f29861m;
                            if (i13 == 0) {
                                i21 = this.E.L(0);
                            }
                            if (L0 - i21 < i12 + 1) {
                                ou0 ou0Var3 = ou0VarArr[i13];
                                if (!ou0Var3.f29856g && !ou0Var3.f29860l && !ou0Var3.f29863o) {
                                    A0(rt0Var.C);
                                }
                            }
                            rt0 rt0Var2 = this.f33980h0[0];
                            if (rt0Var2.h == tl0Var) {
                                int i22 = rt0Var2.C;
                                if ((i22 == 0 || i22 == 5) && L0 != -1 && (K = tl0Var.K(L0)) != null) {
                                    int i23 = K.f5879f;
                                    if (i23 == 0 || i23 == 12) {
                                        View view = K.f5875a;
                                        boolean z10 = view instanceof org.telegram.ui.Cells.s7;
                                        org.telegram.ui.Cells.v0 v0Var = this.H0;
                                        if (z10) {
                                            org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                                            if (s7Var.f23745e <= 0) {
                                                messageObject = null;
                                            } else {
                                                messageObject = s7Var.f23743b[0];
                                            }
                                            if (messageObject != null) {
                                                v0Var.T(messageObject.messageOwner.date, false, true);
                                            }
                                        } else if (view instanceof org.telegram.ui.Cells.e2) {
                                            v0Var.T(((org.telegram.ui.Cells.e2) view).getDate(), false, true);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void G0(int i10, View view, MessageObject messageObject, int i11) {
        TLRPC.WebPage webPage;
        String str;
        char c3;
        int i12;
        int i13;
        if (messageObject != null && !this.l1) {
            tr0 tr0Var = this.T;
            if (tr0Var == null || !tr0Var.f38934w) {
                int i14 = 0;
                boolean z4 = false;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                i14 = 0;
                String str2 = null;
                oh.l6 l6Var = null;
                boolean z14 = true;
                if (this.f34021z1) {
                    int i15 = 8;
                    if (i11 != 8 || C()) {
                        if (messageObject.getDialogId() == this.f33979g1) {
                            c3 = 0;
                        } else {
                            c3 = 1;
                        }
                        SparseArray[] sparseArrayArr = this.W0;
                        if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0) {
                            sparseArrayArr[c3].remove(messageObject.getId());
                            if (!messageObject.canDeleteMessage(false, null)) {
                                this.X0--;
                            }
                        } else {
                            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                                sparseArrayArr[c3].put(messageObject.getId(), messageObject);
                                if (!messageObject.canDeleteMessage(false, null)) {
                                    this.X0++;
                                }
                            } else {
                                return;
                            }
                        }
                        D0(sparseArrayArr[0]);
                        if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                            b1(false);
                        } else {
                            this.f34015x0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                            if (this.X0 == 0) {
                                i12 = 0;
                            } else {
                                i12 = 8;
                            }
                            this.f33982i0.setVisibility(i12);
                            org.telegram.ui.ActionBar.w0 w0Var = this.f34000r0;
                            if (w0Var != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14 && sparseArrayArr[0].size() == 1) {
                                    i13 = 0;
                                } else {
                                    i13 = 8;
                                }
                                w0Var.setVisibility(i13);
                            }
                            org.telegram.ui.ActionBar.w0 w0Var2 = this.f33997q0;
                            if (w0Var2 != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                                    i15 = 0;
                                }
                                w0Var2.setVisibility(i15);
                            }
                            u1();
                        }
                        this.Y0 = false;
                        if (view instanceof org.telegram.ui.Cells.i7) {
                            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                            if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0) {
                                z4 = true;
                            }
                            i7Var.b(z4, true);
                        } else if (view instanceof org.telegram.ui.Cells.s7) {
                            org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                            if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) < 0) {
                                z14 = false;
                            }
                            s7Var.b(0, z14);
                        } else if (view instanceof org.telegram.ui.Cells.l7) {
                            org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                            if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0) {
                                z10 = true;
                            }
                            l7Var.f(z10, true);
                        } else if (view instanceof org.telegram.ui.Cells.h7) {
                            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                            if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            h7Var.e(z11, true);
                        } else if (view instanceof org.telegram.ui.Cells.e2) {
                            org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                            if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0) {
                                z12 = true;
                            }
                            e2Var.c(z12, true);
                        } else if (view instanceof org.telegram.ui.Cells.r7) {
                            org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
                            if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0) {
                                z13 = true;
                            }
                            r7Var.i(z13, true);
                        }
                    } else {
                        return;
                    }
                } else {
                    yr0 yr0Var = this.f33994o1;
                    ou0[] ou0VarArr = this.f33998q1;
                    org.telegram.ui.ActionBar.p2 p2Var = this.f34004s1;
                    if (i11 == 0) {
                        ou0 ou0Var = ou0VarArr[i11];
                        int i16 = i10 - ou0Var.f29861m;
                        if (i16 >= 0 && i16 < ou0Var.f29851a.size()) {
                            PhotoViewer.t1().K2(null, p2Var, null);
                            PhotoViewer.t1().a2(ou0VarArr[i11].f29851a, i16, this.f33979g1, this.Z0, this.C, yr0Var);
                        }
                    } else if (i11 != 2 && i11 != 4) {
                        if (i11 == 5) {
                            PhotoViewer.t1().K2(null, p2Var, null);
                            int indexOf = ou0VarArr[i11].f29851a.indexOf(messageObject);
                            if (indexOf < 0) {
                                PhotoViewer.t1().a2(org.telegram.messenger.y3.m(messageObject), 0, 0L, 0L, 0L, yr0Var);
                            } else {
                                PhotoViewer.t1().a2(ou0VarArr[i11].f29851a, indexOf, this.f33979g1, this.Z0, this.C, yr0Var);
                            }
                        } else if (i11 == 1) {
                            if (view instanceof org.telegram.ui.Cells.i7) {
                                org.telegram.ui.Cells.i7 i7Var2 = (org.telegram.ui.Cells.i7) view;
                                TLRPC.Document document = messageObject.getDocument();
                                if (i7Var2.D) {
                                    if (messageObject.canPreviewDocument()) {
                                        PhotoViewer.t1().K2(null, p2Var, null);
                                        int indexOf2 = ou0VarArr[i11].f29851a.indexOf(messageObject);
                                        if (indexOf2 < 0) {
                                            PhotoViewer.t1().a2(org.telegram.messenger.y3.m(messageObject), 0, 0L, 0L, 0L, yr0Var);
                                            return;
                                        }
                                        PhotoViewer.t1().a2(ou0VarArr[i11].f29851a, indexOf2, this.f33979g1, this.Z0, this.C, yr0Var);
                                        return;
                                    }
                                    AndroidUtilities.openDocument(messageObject, p2Var.getParentActivity(), p2Var);
                                } else if (!i7Var2.C) {
                                    MessageObject message = i7Var2.getMessage();
                                    message.putInDownloadsStore = true;
                                    p2Var.getFileLoader().loadFile(document, message, 0, 0);
                                    i7Var2.f(true);
                                } else {
                                    p2Var.getFileLoader().cancelLoadFile(document);
                                    i7Var2.f(true);
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
                                        LaunchActivity launchActivity = LaunchActivity.D1;
                                        if (launchActivity == null || launchActivity.P() == null || LaunchActivity.D1.P().k(messageObject) == null) {
                                            p2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                            return;
                                        }
                                        return;
                                    }
                                    String str3 = webPage.embed_url;
                                    if (str3 != null && str3.length() != 0) {
                                        ru.I(p2Var, messageObject, this.f33994o1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                        return;
                                    }
                                    str = webPage.url;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    ArrayList arrayList = ((org.telegram.ui.Cells.l7) view).B;
                                    if (arrayList.size() > 0) {
                                        str2 = ((CharSequence) arrayList.get(0)).toString();
                                    }
                                    str = str2;
                                }
                                if (str != null) {
                                    R0(str);
                                }
                            } catch (Exception e6) {
                                FileLog.e(e6);
                            }
                        } else if (p0(i11)) {
                            wu0 k12 = k1(i11);
                            if (k12 != null) {
                                l6Var = k12.f32857s;
                            }
                            if (l6Var != null) {
                                oh.i9 orCreateStoryViewer = p2Var.getOrCreateStoryViewer();
                                Context context = getContext();
                                int id2 = messageObject.getId();
                                oh.c7 a10 = oh.c7.a(this.f33980h0[0].h);
                                a10.f16944e = new hv(l6Var, 18);
                                if ((p2Var instanceof ProfileActivity) && ((ProfileActivity) p2Var).f34667p1) {
                                    i14 = AndroidUtilities.dp(68.0f);
                                }
                                a10.f16948s += i14;
                                orCreateStoryViewer.C(context, id2, l6Var, a10);
                            } else {
                                return;
                            }
                        }
                    } else if (view instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) view).a();
                    }
                }
                p1();
            }
        }
    }

    public final boolean H(MotionEvent motionEvent) {
        float f10;
        f2.p0 p0Var;
        boolean z4;
        or0 or0Var;
        float f11;
        boolean z10;
        rt0[] rt0VarArr = this.f33980h0;
        int i10 = rt0VarArr[0].C;
        if (i10 == 13 && (or0Var = this.R) != null) {
            View currentView = or0Var.f44411n.getCurrentView();
            if (currentView instanceof ph.l) {
                ph.l lVar = (ph.l) currentView;
                ph.g gVar = lVar.v;
                ph.e eVar = lVar.f44395f;
                if (lVar.f44391a != null && lVar.getParent() != null) {
                    if (!lVar.f44392b || lVar.H) {
                        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                            if (motionEvent.getActionMasked() == 2 && (lVar.H || lVar.J)) {
                                int i11 = -1;
                                int i12 = -1;
                                for (int i13 = 0; i13 < motionEvent.getPointerCount(); i13++) {
                                    if (lVar.K == motionEvent.getPointerId(i13)) {
                                        i11 = i13;
                                    }
                                    if (lVar.L == motionEvent.getPointerId(i13)) {
                                        i12 = i13;
                                    }
                                }
                                if (i11 != -1 && i12 != -1) {
                                    float hypot = ((float) Math.hypot(motionEvent.getX(i12) - motionEvent.getX(i11), motionEvent.getY(i12) - motionEvent.getY(i11))) / lVar.M;
                                    lVar.N = hypot;
                                    if (!lVar.H && (hypot > 1.01f || hypot < 0.99f)) {
                                        lVar.H = true;
                                        if (hypot > 1.0f) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        lVar.O = z10;
                                        lVar.b(z10);
                                    }
                                    if (lVar.H) {
                                        boolean z11 = lVar.O;
                                        if ((z11 && lVar.N < 1.0f) || (!z11 && lVar.N > 1.0f)) {
                                            lVar.f44393c = 0.0f;
                                        } else {
                                            if (z11) {
                                                f11 = org.telegram.messenger.y3.a(2.0f, lVar.N, 1.0f, 1.0f);
                                            } else {
                                                f11 = (1.0f - lVar.N) / 0.5f;
                                            }
                                            lVar.f44393c = Math.max(0.0f, Math.min(1.0f, f11));
                                        }
                                        float f12 = lVar.f44393c;
                                        int i14 = (f12 > 1.0f ? 1 : (f12 == 1.0f ? 0 : -1));
                                        if (i14 == 0 || f12 == 0.0f) {
                                            if (i14 == 0) {
                                                int i15 = lVar.f44394e;
                                                int ceil = (((int) Math.ceil(lVar.P / lVar.f44394e)) * i15) + ((int) ((lVar.T.D.f34013w1 / (eVar.getMeasuredWidth() - ((int) (eVar.getMeasuredWidth() / lVar.f44394e)))) * (i15 - 1)));
                                                if (ceil >= gVar.h()) {
                                                    ceil = gVar.h() - 1;
                                                }
                                                lVar.P = ceil;
                                            }
                                            lVar.a();
                                            if (lVar.f44393c == 0.0f) {
                                                lVar.O = !lVar.O;
                                            }
                                            lVar.b(lVar.O);
                                            lVar.M = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                        }
                                        eVar.invalidate();
                                    }
                                } else {
                                    lVar.I = false;
                                    lVar.J = false;
                                    lVar.H = false;
                                    lVar.a();
                                    return false;
                                }
                            } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((lVar.K == motionEvent.getPointerId(0) && lVar.L == motionEvent.getPointerId(1)) || (lVar.K == motionEvent.getPointerId(1) && lVar.L == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && lVar.H) {
                                lVar.J = false;
                                lVar.I = false;
                                lVar.H = false;
                                lVar.a();
                            }
                        } else {
                            if (lVar.I && !lVar.H && motionEvent.getPointerCount() == 2) {
                                lVar.M = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                lVar.N = 1.0f;
                                lVar.K = motionEvent.getPointerId(0);
                                lVar.L = motionEvent.getPointerId(1);
                                eVar.I0(false);
                                eVar.cancelLongPress();
                                eVar.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                View view = (View) lVar.getParent();
                                lVar.R = (int) ((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - lVar.getX());
                                int y10 = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - lVar.getY());
                                int i16 = lVar.R;
                                Rect rect = lVar.S;
                                lVar.P = -1;
                                int i17 = y10 + eVar.U2;
                                for (int i18 = 0; i18 < eVar.getChildCount(); i18++) {
                                    View childAt = eVar.getChildAt(i18);
                                    childAt.getHitRect(rect);
                                    if (rect.contains(i16, i17)) {
                                        lVar.P = RecyclerView.S(childAt);
                                        lVar.Q = childAt.getTop();
                                    }
                                }
                                lVar.J = true;
                            }
                            if (motionEvent.getActionMasked() == 0 && (motionEvent.getY() - ((View) lVar.getParent()).getY()) - lVar.getY() > 0.0f) {
                                lVar.I = true;
                            }
                        }
                        return lVar.H;
                    }
                    return true;
                }
            }
            return false;
        }
        if ((i10 == 0 || p0(i10)) && getParent() != null) {
            if (!this.l1 || this.f33961a) {
                if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                    if (motionEvent.getActionMasked() == 2 && (this.f33961a || this.f33967c)) {
                        int i19 = -1;
                        int i20 = -1;
                        for (int i21 = 0; i21 < motionEvent.getPointerCount(); i21++) {
                            if (this.f33972e == motionEvent.getPointerId(i21)) {
                                i19 = i21;
                            }
                            if (this.f33975f == motionEvent.getPointerId(i21)) {
                                i20 = i21;
                            }
                        }
                        if (i19 != -1 && i20 != -1) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(i20) - motionEvent.getX(i19), motionEvent.getY(i20) - motionEvent.getY(i19))) / this.h;
                            this.f33990n = hypot2;
                            if (!this.f33961a && (hypot2 > 1.01f || hypot2 < 0.99f)) {
                                this.f33961a = true;
                                if (hypot2 > 1.0f) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                this.f33999r = z4;
                                e1(z4);
                            }
                            if (this.f33961a) {
                                boolean z12 = this.f33999r;
                                if ((z12 && this.f33990n < 1.0f) || (!z12 && this.f33990n > 1.0f)) {
                                    this.f33987k1 = 0.0f;
                                } else {
                                    if (z12) {
                                        f10 = org.telegram.messenger.y3.a(2.0f, this.f33990n, 1.0f, 1.0f);
                                    } else {
                                        f10 = (1.0f - this.f33990n) / 0.5f;
                                    }
                                    this.f33987k1 = Math.max(0.0f, Math.min(1.0f, f10));
                                }
                                float f13 = this.f33987k1;
                                if (f13 == 1.0f || f13 == 0.0f) {
                                    if (p0(this.f33989m1)) {
                                        p0Var = k1(this.f33989m1);
                                    } else {
                                        p0Var = this.E;
                                    }
                                    if (this.f33987k1 == 1.0f) {
                                        int i22 = this.f33992n1;
                                        int ceil2 = (((int) Math.ceil(this.f34002s / this.f33992n1)) * i22) + ((int) ((this.f34013w1 / (rt0VarArr[0].h.getMeasuredWidth() - ((int) (rt0VarArr[0].h.getMeasuredWidth() / this.f33992n1)))) * (i22 - 1)));
                                        if (ceil2 >= p0Var.h()) {
                                            ceil2 = p0Var.h() - 1;
                                        }
                                        this.f34002s = ceil2;
                                    }
                                    T();
                                    if (this.f33987k1 == 0.0f) {
                                        this.f33999r = !this.f33999r;
                                    }
                                    e1(this.f33999r);
                                    this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                rt0VarArr[0].h.invalidate();
                                rt0 rt0Var = rt0VarArr[0];
                                if (rt0Var.D != null) {
                                    rt0Var.invalidate();
                                }
                            }
                        } else {
                            this.f33964b = false;
                            this.f33967c = false;
                            this.f33961a = false;
                            T();
                            return false;
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.f33972e == motionEvent.getPointerId(0) && this.f33975f == motionEvent.getPointerId(1)) || (this.f33972e == motionEvent.getPointerId(1) && this.f33975f == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.f33961a) {
                        this.f33967c = false;
                        this.f33964b = false;
                        this.f33961a = false;
                        T();
                    }
                } else {
                    if (this.f33964b && !this.f33961a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.f33990n = 1.0f;
                        this.f33972e = motionEvent.getPointerId(0);
                        this.f33975f = motionEvent.getPointerId(1);
                        rt0VarArr[0].h.I0(false);
                        rt0VarArr[0].h.cancelLongPress();
                        rt0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.f34011w = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - rt0VarArr[0].getX());
                        int y11 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - rt0VarArr[0].getY());
                        int i23 = this.f34011w;
                        this.f34002s = -1;
                        int i24 = y11 + rt0VarArr[0].h.U2;
                        if (getY() != 0.0f && this.B == 1) {
                            i24 = 0;
                        }
                        for (int i25 = 0; i25 < rt0VarArr[0].h.getChildCount(); i25++) {
                            View childAt2 = rt0VarArr[0].h.getChildAt(i25);
                            Rect rect2 = this.f34014x;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i23, i24)) {
                                rt0VarArr[0].h.getClass();
                                this.f34002s = RecyclerView.S(childAt2);
                                this.v = childAt2.getTop();
                            }
                        }
                        if (this.A1.T() && this.f34002s == -1) {
                            this.f34002s = (int) (((this.f33985j1[p0(rt0VarArr[0].C) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i23 / rt0VarArr[0].h.getMeasuredWidth(), 0.0f))) + rt0VarArr[0].f30853x.L0());
                            this.v = 0;
                        }
                        this.f33967c = true;
                    }
                    if (motionEvent.getActionMasked() == 0 && ((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - rt0VarArr[0].getY() > 0.0f) {
                        this.f33964b = true;
                    }
                }
                return this.f33961a;
            }
            return true;
        }
        return false;
    }

    public final boolean H0(MessageObject messageObject, View view, int i10, boolean z4) {
        tr0 tr0Var;
        char c3;
        int i11;
        int i12;
        final TL_stories.StoryItem storyItem;
        gt0 gt0Var;
        oh.l6 l6Var;
        if (!this.f34021z1) {
            org.telegram.ui.ActionBar.p2 p2Var = this.f34004s1;
            if (p2Var.getParentActivity() != null && messageObject != null && ((tr0Var = this.T) == null || !tr0Var.f38934w)) {
                AndroidUtilities.hideKeyboard(p2Var.getParentActivity().getCurrentFocus());
                long j10 = this.f33979g1;
                int i13 = 8;
                if (z4 && ((w0(getClosestTab()) || getClosestTab() == 8) && !this.f34021z1)) {
                    if (view instanceof org.telegram.ui.Cells.r7) {
                        org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
                        r7Var.k(r7Var.f23574n, r7Var.f23579r, true);
                    }
                    TL_stories.StoryItem storyItem2 = messageObject.storyItem;
                    if (storyItem2 != null) {
                        HashSet hashSet = new HashSet();
                        ArrayList<Integer> arrayList = storyItem2.albums;
                        if (arrayList != null) {
                            hashSet.addAll(arrayList);
                        }
                        boolean w02 = w0(getClosestTab());
                        q70 I = q70.I(p2Var, view);
                        q70 J = I.J();
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.tt0(I, 25), false);
                        J.k();
                        q70.f(J, getStoriesController().B(j10, true), hashSet, true, new jp(this, storyItem2, I, 16), new hg.c1(this, hashSet, storyItem2, I, 11));
                        I.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddToAlbum), new lh.y2(I, J, 7), false);
                        I.k();
                        I.c(R.drawable.msg_select, LocaleController.getString(R.string.StoriesAlbumMenuSelect), new dg.u1(this, messageObject, view, i10, 22), false);
                        if (w02) {
                            int h12 = h1(getClosestTab());
                            String w10 = getStoriesController().w(h12, j10);
                            I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new jm(this, h12, 5), false);
                            storyItem = storyItem2;
                            I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.StoriesAlbumMenuRemoveFromAlbum), new dg.u1(this, h12, storyItem, w10, 23), false);
                        } else {
                            storyItem = storyItem2;
                            if (getClosestTab() == 8 && (gt0Var = this.W) != null && (l6Var = gt0Var.f32857s) != null) {
                                if (l6Var.m(storyItem.f21080id)) {
                                    I.c(R.drawable.chats_unpin, LocaleController.getString(R.string.StoriesAlbumMenuUnpin), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r1) {
                                                case 0:
                                                    zu0 zu0Var = this;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zu0Var.getContext(), 0, zu0Var.C1);
                                                    alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.DeleteStoryTitle);
                                                    alertDialog$Builder.f21166a.Q = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new dr0(zu0Var, storyItem));
                                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mh0(8));
                                                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                                                    d2Var.show();
                                                    d2Var.h();
                                                    return;
                                                case 1:
                                                    zu0 zu0Var2 = this;
                                                    zu0Var2.getClass();
                                                    zu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f21080id))), false);
                                                    return;
                                                case 2:
                                                    zu0 zu0Var3 = this;
                                                    zu0Var3.getClass();
                                                    zu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f21080id))), true);
                                                    return;
                                                default:
                                                    zu0.h(this, storyItem);
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
                                                    zu0 zu0Var = this;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zu0Var.getContext(), 0, zu0Var.C1);
                                                    alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.DeleteStoryTitle);
                                                    alertDialog$Builder.f21166a.Q = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new dr0(zu0Var, storyItem));
                                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mh0(8));
                                                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                                                    d2Var.show();
                                                    d2Var.h();
                                                    return;
                                                case 1:
                                                    zu0 zu0Var2 = this;
                                                    zu0Var2.getClass();
                                                    zu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f21080id))), false);
                                                    return;
                                                case 2:
                                                    zu0 zu0Var3 = this;
                                                    zu0Var3.getClass();
                                                    zu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f21080id))), true);
                                                    return;
                                                default:
                                                    zu0.h(this, storyItem);
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
                                            zu0 zu0Var = this;
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zu0Var.getContext(), 0, zu0Var.C1);
                                            alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.DeleteStoryTitle);
                                            alertDialog$Builder.f21166a.Q = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new dr0(zu0Var, storyItem));
                                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mh0(8));
                                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                                            d2Var.show();
                                            d2Var.h();
                                            return;
                                        case 1:
                                            zu0 zu0Var2 = this;
                                            zu0Var2.getClass();
                                            zu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f21080id))), false);
                                            return;
                                        case 2:
                                            zu0 zu0Var3 = this;
                                            zu0Var3.getClass();
                                            zu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f21080id))), true);
                                            return;
                                        default:
                                            zu0.h(this, storyItem);
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
                                        zu0 zu0Var = this;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zu0Var.getContext(), 0, zu0Var.C1);
                                        alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.DeleteStoryTitle);
                                        alertDialog$Builder.f21166a.Q = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new dr0(zu0Var, storyItem));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mh0(8));
                                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                                        d2Var.show();
                                        d2Var.h();
                                        return;
                                    case 1:
                                        zu0 zu0Var2 = this;
                                        zu0Var2.getClass();
                                        zu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f21080id))), false);
                                        return;
                                    case 2:
                                        zu0 zu0Var3 = this;
                                        zu0Var3.getClass();
                                        zu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f21080id))), true);
                                        return;
                                    default:
                                        zu0.h(this, storyItem);
                                        return;
                                }
                            }
                        }, true);
                        I.f30311i = 3;
                        I.f30331u = true;
                        I.v = true;
                        I.L = true;
                        I.M = 3;
                        Point point = AndroidUtilities.displaySize;
                        Point point2 = AndroidUtilities.displaySize;
                        int min = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point2.x, point2.y) * 0.4333f) * 3.0f) / 4.0f));
                        I.N = min;
                        I.O = (min * 4) / 3;
                        I.f30330t = true;
                        I.P = true;
                        I.W = true;
                        I.Z();
                        return true;
                    }
                } else {
                    if (messageObject.getDialogId() == j10) {
                        c3 = 0;
                    } else {
                        c3 = 1;
                    }
                    SparseArray[] sparseArrayArr = this.W0;
                    sparseArrayArr[c3].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.X0++;
                    }
                    if (this.X0 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    this.f33982i0.setVisibility(i11);
                    org.telegram.ui.ActionBar.w0 w0Var = this.f34000r0;
                    if (w0Var != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        } else {
                            i12 = 8;
                        }
                        w0Var.setVisibility(i12);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.f33997q0;
                    if (w0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i13 = 0;
                        }
                        w0Var2.setVisibility(i13);
                    }
                    this.f34015x0.a(1, false);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    int i14 = 0;
                    while (true) {
                        ArrayList arrayList3 = this.K0;
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
                    this.Y0 = false;
                    if (view instanceof org.telegram.ui.Cells.i7) {
                        ((org.telegram.ui.Cells.i7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.s7) {
                        ((org.telegram.ui.Cells.s7) view).b(i10, true);
                    } else if (view instanceof org.telegram.ui.Cells.l7) {
                        ((org.telegram.ui.Cells.l7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) view).e(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.e2) {
                        ((org.telegram.ui.Cells.e2) view).c(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.r7) {
                        ((org.telegram.ui.Cells.r7) view).i(true, true);
                    }
                    if (!this.f34021z1) {
                        b1(true);
                    }
                    D0(sparseArrayArr[0]);
                    p1();
                    return true;
                }
            }
        }
        return false;
    }

    public final void I() {
        char c3;
        char c10;
        float abs;
        View childAt;
        int R;
        float f10;
        float measuredWidth;
        rt0[] rt0VarArr = this.f33980h0;
        rt0 rt0Var = rt0VarArr[0];
        if (rt0Var != null && rt0VarArr[1] != null) {
            float f11 = 0.0f;
            tr0 tr0Var = this.T;
            if (tr0Var != null) {
                if (p0(rt0Var.C) && rt0VarArr[0].C != 9) {
                    c3 = 1;
                } else {
                    c3 = 0;
                }
                if (rt0VarArr[1].getVisibility() == 0) {
                    if (p0(rt0VarArr[1].C) && rt0VarArr[1].C != 9) {
                        c10 = 1;
                    } else {
                        c10 = 0;
                    }
                } else {
                    c10 = c3;
                }
                if (c3 == c10) {
                    if (c3 != 0) {
                        abs = 1.0f;
                    } else {
                        abs = 0.0f;
                    }
                    if (c3 != 0) {
                        measuredWidth = 0.0f;
                    } else {
                        measuredWidth = rt0VarArr[0].getMeasuredWidth();
                    }
                    tr0Var.setTranslationX(measuredWidth);
                } else {
                    tr0Var.setTranslationX(rt0VarArr[c3 ^ 1].getTranslationX());
                    abs = 1.0f - (Math.abs(tr0Var.getTranslationX()) / tr0Var.getMeasuredWidth());
                }
                float f12 = 0.0f;
                for (int i10 = 0; i10 < rt0VarArr.length; i10++) {
                    if (rt0VarArr[i10].getVisibility() == 0) {
                        xr0 xr0Var = rt0VarArr[i10].h;
                        if (xr0Var.getChildCount() == 0) {
                            childAt = null;
                        } else {
                            childAt = xr0Var.getChildAt(0);
                        }
                        if (childAt == null) {
                            R = -1;
                        } else {
                            R = RecyclerView.R(childAt);
                        }
                        if (R == 0) {
                            f10 = childAt.getY() - xr0Var.getPaddingTop();
                        } else if (xr0Var.getChildCount() == 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = -AndroidUtilities.dp(48.0f);
                        }
                        f12 += Utilities.clamp01(1.0f - (rt0VarArr[i10].getTranslationX() / rt0VarArr[i10].getMeasuredWidth())) * f10;
                    }
                }
                float clamp01 = Utilities.clamp01(1.0f - ((-f12) / AndroidUtilities.dpf2(48.0f)));
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
                tr0Var.setAlpha(clamp01);
                tr0Var.setScaleX(lerp);
                tr0Var.setScaleY(lerp);
                tr0Var.setTranslationY(this.H1 + f12);
                f11 = abs;
            }
            K();
            if (this.R1 != f11) {
                this.R1 = f11;
                o0();
                invalidate();
            }
        }
    }

    public boolean I0(TLRPC.ChatParticipant chatParticipant, boolean z4, View view) {
        return false;
    }

    public final boolean J() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zu0.J():boolean");
    }

    public final void J0(float f10) {
        int i10;
        int i11;
        rt0[] rt0VarArr = this.f33980h0;
        int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i12 != 0 || rt0VarArr[1].getVisibility() == 0) {
            if (this.f33974e1) {
                rt0 rt0Var = rt0VarArr[0];
                rt0Var.setTranslationX((-f10) * rt0Var.getMeasuredWidth());
                rt0VarArr[1].setTranslationX(rt0VarArr[0].getMeasuredWidth() - (rt0VarArr[0].getMeasuredWidth() * f10));
            } else {
                rt0 rt0Var2 = rt0VarArr[0];
                rt0Var2.setTranslationX(rt0Var2.getMeasuredWidth() * f10);
                rt0VarArr[1].setTranslationX((rt0VarArr[0].getMeasuredWidth() * f10) - rt0VarArr[0].getMeasuredWidth());
            }
            M0(getTabProgress());
            float a02 = a0(f10);
            this.m0 = a02;
            int i13 = 4;
            if (a02 != 0.0f && D() && !q0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            this.f33993o0.setVisibility(i10);
            org.telegram.ui.ActionBar.w0 w0Var = this.f33986k0;
            if (w0Var != null && !D()) {
                if (v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                w0Var.setVisibility(i11);
                this.f33988l0 = 0.0f;
            } else {
                this.f33988l0 = b0(f10);
                t1();
            }
            q1(false);
            if (i12 == 0) {
                rt0 rt0Var3 = rt0VarArr[0];
                rt0VarArr[0] = rt0VarArr[1];
                rt0VarArr[1] = rt0Var3;
                rt0Var3.setVisibility(8);
                if (w0Var != null && this.f34007u0 == 2) {
                    if (v0()) {
                        i13 = 8;
                    }
                    w0Var.setVisibility(i13);
                }
                this.f34007u0 = 0;
                f1();
            }
        }
    }

    public final void K() {
        ls lsVar = this.M0;
        if (lsVar != null) {
            tr0 tr0Var = this.T;
            float f10 = 0.0f;
            if (tr0Var != null) {
                f10 = 0.0f + (tr0Var.getVisibilityFactor() * AndroidUtilities.dp(38.0f) * (1.0f - Math.abs(tr0Var.getTranslationX() / tr0Var.getMeasuredWidth())));
            }
            lsVar.setTranslationY(this.H1 + f10);
        }
    }

    public final boolean L(boolean z4) {
        SparseArray[] sparseArrayArr;
        if (!this.f34021z1) {
            return false;
        }
        int i10 = 1;
        while (true) {
            sparseArrayArr = this.W0;
            if (i10 < 0) {
                break;
            }
            sparseArrayArr[i10].clear();
            i10--;
        }
        this.X0 = 0;
        D0(sparseArrayArr[0]);
        or0 or0Var = this.R;
        if (or0Var != null) {
            or0Var.h();
            or0Var.j();
        }
        b1(false);
        r1(z4);
        iu0 iu0Var = this.O;
        if (iu0Var != null) {
            iu0Var.f27912w.clear();
        }
        return true;
    }

    public void L0() {
        boolean z4;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        if (!v0() && !q0()) {
            z4 = false;
        } else {
            z4 = true;
        }
        uu0 uu0Var = this.f33965b0.f32858w;
        if (uu0Var != null) {
            if (z4 && getClosestTab() == 9) {
                z12 = true;
            } else {
                z12 = false;
            }
            uu0Var.b(z12);
        }
        uu0 uu0Var2 = this.W.f32858w;
        if (uu0Var2 != null) {
            if (z4 && getClosestTab() == 8) {
                z11 = true;
            } else {
                z11 = false;
            }
            uu0Var2.b(z11);
        }
        for (yu0 yu0Var : this.V1.values()) {
            xu0 xu0Var = yu0Var.f33581c;
            if (xu0Var.f32857s != null) {
                uu0 uu0Var3 = xu0Var.f32858w;
                if (z4 && getClosestTab() == yu0Var.f33579a) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                uu0Var3.b(z10);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.f33986k0;
        if (w0Var != null) {
            ls0 ls0Var = this.G0;
            if (ls0Var != null && ls0Var.a() && getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            w0Var.setSearchFieldHint(LocaleController.getString(i10));
        }
        I();
    }

    public void M0(float f10) {
        E0();
    }

    public boolean N() {
        return this instanceof c40;
    }

    public final boolean O(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x10 = (-view.getX()) - getX();
        rt0[] rt0VarArr = this.f33980h0;
        motionEvent.offsetLocation(x10 - rt0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - rt0VarArr[0].getY()) - rt0VarArr[0].h.getFastScroll().getY());
        return rt0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public final void O0(org.telegram.ui.ActionBar.p2 p2Var, long j10, int i10) {
        new org.telegram.ui.f71(p2Var, j10, this.f33985j1[1], new mc(this, j10, i10)).show();
    }

    public void P(Canvas canvas, float f10, Rect rect, Paint paint) {
        canvas.drawRect(rect, paint);
    }

    public final void P0(org.telegram.ui.ActionBar.p2 p2Var, long j10, int i10) {
        z4.v0(p2Var, LocaleController.getString(R.string.Delete), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesAlbumMenuDeleteAlbumAsk, getStoriesController().w(i10, j10))), LocaleController.getString(R.string.Delete), true, new mh.a9(this, j10, i10, 8));
    }

    public final void Q(Canvas canvas, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            rt0[] rt0VarArr = this.f33980h0;
            if (i10 < rt0VarArr.length) {
                rt0 rt0Var = rt0VarArr[i10];
                if (rt0Var != null && rt0Var.getVisibility() == 0) {
                    for (int i11 = 0; i11 < rt0VarArr[i10].h.getChildCount(); i11++) {
                        View childAt = rt0VarArr[i10].h.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + rt0VarArr[i10].h.U2) {
                            int save = canvas.save();
                            canvas.translate(childAt.getX() + rt0VarArr[i10].getX(), childAt.getY() + rt0VarArr[i10].h.getY() + rt0VarArr[i10].getY() + getY());
                            childAt.draw(canvas);
                            if (arrayList != null && (childAt instanceof nv0)) {
                                arrayList.add((nv0) childAt);
                            }
                            canvas.restoreToCount(save);
                        }
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void Q0(org.telegram.ui.ActionBar.p2 p2Var, long j10, int i10) {
        String w10 = getStoriesController().w(i10, j10);
        Context context = p2Var.getContext();
        org.telegram.ui.ActionBar.g6 resourceProvider = p2Var.getResourceProvider();
        k3.d dVar = new k3.d(this, j10, i10);
        Pattern pattern = z4.f33718a;
        z4.R(context, p2Var, LocaleController.getString(R.string.StoriesAlbumRename), LocaleController.getString(R.string.StoriesAlbumRenameHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), w10, 12, LocaleController.getString(R.string.Rename), resourceProvider, dVar);
    }

    public final boolean R(int i10) {
        ou0[] ou0VarArr = this.f34001r1.f30870n;
        if (ou0VarArr == null) {
            return false;
        }
        ou0[] ou0VarArr2 = this.f33998q1;
        if (i10 == 0) {
            ou0 ou0Var = ou0VarArr2[i10];
            if (!ou0Var.h) {
                int[] iArr = ou0Var.f29855f;
                int[] iArr2 = ou0VarArr[i10].f29855f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = ou0VarArr2[i10].f29855f;
            int[] iArr4 = ou0VarArr[i10].f29855f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        ou0VarArr2[i10].f29851a.addAll(ou0VarArr[i10].f29851a);
        ou0VarArr2[i10].f29853c.addAll(ou0VarArr[i10].f29853c);
        for (Map.Entry entry : ou0VarArr[i10].d.entrySet()) {
            ou0VarArr2[i10].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i11 = 0; i11 < 2; i11++) {
            ou0VarArr2[i10].f29852b[i11] = ou0VarArr[i10].f29852b[i11].clone();
            ou0 ou0Var2 = ou0VarArr2[i10];
            int[] iArr5 = ou0Var2.f29858j;
            ou0 ou0Var3 = ou0VarArr[i10];
            iArr5[i11] = ou0Var3.f29858j[i11];
            ou0Var2.f29857i[i11] = ou0Var3.f29857i[i11];
        }
        ou0VarArr2[i10].f29854e.addAll(ou0VarArr[i10].f29854e);
        return !ou0VarArr[i10].f29851a.isEmpty();
    }

    public final void R0(String str) {
        boolean shouldShowUrlInAlert = AndroidUtilities.shouldShowUrlInAlert(str);
        org.telegram.ui.ActionBar.p2 p2Var = this.f34004s1;
        if (shouldShowUrlInAlert) {
            z4.q0(p2Var, str, true, true);
        } else {
            af.g.s(p2Var.getParentActivity(), str);
        }
    }

    public final void S(int i10, tl0 tl0Var, boolean z4) {
        ArrayList arrayList = this.f33998q1[i10].f29854e;
        int L0 = ((f2.j0) tl0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            wt0 wt0Var = null;
            if (arrayList != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (L0 <= ((wt0) arrayList.get(i11)).f32847b) {
                        wt0Var = (wt0) arrayList.get(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                if (wt0Var == null) {
                    wt0Var = (wt0) l.d.i(1, arrayList);
                }
            }
            if (wt0Var != null) {
                y0(i10, wt0Var.d, wt0Var.f32847b + 1, z4);
            }
        }
    }

    public int S0() {
        return -1;
    }

    public final void T() {
        rt0[] rt0VarArr;
        rt0 rt0Var;
        boolean z4;
        int i10;
        f2.p0 adapter;
        if (this.l1) {
            int i11 = 0;
            while (true) {
                rt0VarArr = this.f33980h0;
                if (i11 < rt0VarArr.length) {
                    rt0Var = rt0VarArr[i11];
                    if (rt0Var.C == this.f33989m1) {
                        break;
                    }
                    i11++;
                } else {
                    rt0Var = null;
                    break;
                }
            }
            if (rt0Var != null) {
                boolean p02 = p0(rt0Var.C);
                float f10 = this.f33987k1;
                ou0[] ou0VarArr = this.f33998q1;
                float f11 = 1.0f;
                if (f10 == 1.0f) {
                    this.l1 = false;
                    int i12 = this.f33992n1;
                    int[] iArr = this.f33985j1;
                    iArr[p02 ? 1 : 0] = i12;
                    if (!p02) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (c0(rt0Var.C) >= 5) {
                        SharedConfig.setStoriesColumnsCount(this.f33992n1);
                    }
                    for (int i13 = 0; i13 < rt0VarArr.length; i13++) {
                        rt0 rt0Var2 = rt0VarArr[i13];
                        if (rt0Var2 != null && rt0Var2.h != null && (((i10 = rt0Var2.C) == 0 || p0(i10)) && (adapter = rt0VarArr[i13].h.getAdapter()) != null)) {
                            int h = adapter.h();
                            if (i13 == 0) {
                                ou0VarArr[0].g(false);
                            }
                            rt0VarArr[i13].f30850r.setVisibility(8);
                            rt0VarArr[i13].f30853x.y1(iArr[p02 ? 1 : 0]);
                            rt0VarArr[i13].h.a0();
                            rt0VarArr[i13].h.invalidate();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(rt0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                    }
                    if (this.f34002s >= 0) {
                        for (int i14 = 0; i14 < rt0VarArr.length; i14++) {
                            rt0 rt0Var3 = rt0VarArr[i14];
                            if (rt0Var3.C == this.f33989m1) {
                                View m9 = rt0Var3.f30851s.m(this.f34002s);
                                if (m9 != null) {
                                    this.v = m9.getTop();
                                }
                                rt0 rt0Var4 = rt0VarArr[i14];
                                rt0Var4.f30853x.h1(this.f34002s, (-rt0Var4.h.getPaddingTop()) + this.v);
                            }
                        }
                        return;
                    }
                    X0();
                } else if (f10 == 0.0f) {
                    this.l1 = false;
                    if (this.f33989m1 == 0) {
                        ou0VarArr[0].g(false);
                    }
                    rt0Var.f30850r.setVisibility(8);
                    rt0Var.h.invalidate();
                } else {
                    if (f10 > 0.2f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        f11 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
                    ofFloat.addUpdateListener(new ns0(this, rt0Var, 0));
                    ofFloat.addListener(new org.telegram.ui.aj(this, z4, p02 ? 1 : 0, rt0Var));
                    ofFloat.setInterpolator(pr.f30183f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                }
            }
        }
    }

    public final void T0(ArrayList arrayList, boolean z4) {
        boolean z10;
        boolean z11;
        gt0 gt0Var = this.W;
        if (gt0Var != null && gt0Var.f32857s != null) {
            org.telegram.ui.ActionBar.p2 p2Var = this.f34004s1;
            if (z4 && arrayList.size() > p2Var.getMessagesController().storiesPinnedToTopCountMax) {
                qc.a0(p2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", p2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
                return;
            }
            oh.l6 l6Var = gt0Var.f32857s;
            int i10 = l6Var.f17398c;
            ArrayList arrayList2 = l6Var.f17401g;
            ArrayList arrayList3 = new ArrayList(arrayList2);
            boolean z12 = true;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Integer num = (Integer) arrayList.get(size);
                num.getClass();
                if (z4 && !arrayList3.contains(num)) {
                    arrayList3.add(0, num);
                } else if (!z4 && arrayList3.contains(num)) {
                    arrayList3.remove(num);
                }
            }
            if (arrayList3.size() > MessagesController.getInstance(i10).storiesPinnedToTopCountMax) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (arrayList2.size() != arrayList3.size()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList2.size()) {
                            break;
                        } else if (arrayList2.get(i11) != arrayList3.get(i11)) {
                            z11 = true;
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                if (z11) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList3);
                    l6Var.d(true);
                    TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                    tL_togglePinnedToTop.f21093id.addAll(arrayList2);
                    tL_togglePinnedToTop.peer = MessagesController.getInstance(i10).getInputPeer(l6Var.d);
                    ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new oh.p5(2));
                }
                z12 = z10;
            }
            if (z12) {
                qc.a0(p2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", p2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
            } else if (z4) {
                qc.a0(p2Var).M(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinned", arrayList.size(), new Object[0])), LocaleController.formatPluralString("StoriesPinnedText", arrayList.size(), new Object[0]), R.raw.ic_pin).j();
            } else {
                qc.a0(p2Var).Q(R.raw.ic_unpin, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesUnpinned", arrayList.size(), new Object[0]))).j();
            }
        }
    }

    public final void U(int i10) {
        ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i10 == 0) {
            if (!AndroidUtilities.isTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 2) {
                this.f34015x0.setTextSize(18);
            } else {
                this.f34015x0.setTextSize(20);
            }
        }
        if (i10 == 0) {
            this.E.l();
        }
    }

    public final boolean U0(MotionEvent motionEvent, boolean z4) {
        int i10;
        rt0 rt0Var;
        or0 or0Var;
        int i11;
        int i12;
        int closestTab = getClosestTab();
        os0 os0Var = this.F0;
        SparseIntArray sparseIntArray = os0Var.L;
        int i13 = os0Var.f25026n;
        int i14 = -1;
        if (z4) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i15 = sparseIntArray.get(i13 + i10, -1);
        tr0 tr0Var = this.T;
        if (tr0Var != null) {
            if (!w0(closestTab) && closestTab != 8) {
                if (w0(i15) || i15 == 8) {
                    i14 = tr0Var.getCurrentAlbumId();
                }
            } else {
                l81 l81Var = tr0Var.f38931n;
                SparseIntArray sparseIntArray2 = l81Var.V;
                int i16 = l81Var.C;
                if (z4) {
                    i12 = 1;
                } else {
                    i12 = -1;
                }
                i14 = sparseIntArray2.get(i16 + i12, -1);
            }
            if (i14 == 0) {
                i15 = 8;
            } else if (i14 > 0) {
                i15 = i1(i14).f33579a;
            }
        }
        if (i15 >= 0) {
            org.telegram.ui.ActionBar.w0 w0Var = this.f33986k0;
            if (w0Var != null && !D()) {
                if (v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                w0Var.setVisibility(i11);
                this.f33988l0 = 0.0f;
            } else {
                this.f33988l0 = b0(0.0f);
                s1(0.0f);
            }
            if ((!this.S0 || getSelectedTab() != 11) && (!C() || !this.f34021z1 || (getClosestTab() != 8 && !w0(getClosestTab())))) {
                rt0[] rt0VarArr = this.f33980h0;
                rt0 rt0Var2 = rt0VarArr[0];
                if (rt0Var2 != null && rt0Var2.C == 13 && (or0Var = this.R) != null) {
                    org.telegram.ui.k11 k11Var = or0Var.f44411n;
                    if (!z4) {
                    }
                }
                rt0 rt0Var3 = rt0VarArr[0];
                pr0 pr0Var = this.S;
                if (rt0Var3 != null && rt0Var3.C == 14 && pr0Var != null) {
                    lh.q2 q2Var = pr0Var.h;
                    if (!z4) {
                    }
                }
                if ((!this.f34021z1 || (rt0Var = rt0VarArr[0]) == null || rt0Var.C != 13) && ((pr0Var == null || !pr0Var.g()) && (tr0Var == null || !tr0Var.f38934w))) {
                    q1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    k0();
                    this.f34010v1 = false;
                    this.f34008u1 = true;
                    N0(true);
                    this.f34013w1 = (int) motionEvent.getX();
                    this.D.setEnabled(false);
                    os0Var.setEnabled(false);
                    rt0 rt0Var4 = rt0VarArr[1];
                    rt0Var4.C = i15;
                    rt0Var4.setVisibility(0);
                    this.f33974e1 = z4;
                    m1(true);
                    if (z4) {
                        rt0VarArr[1].setTranslationX(rt0VarArr[0].getMeasuredWidth());
                    } else {
                        rt0VarArr[1].setTranslationX(-rt0VarArr[0].getMeasuredWidth());
                    }
                    M0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    public final String V(boolean z4) {
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        or0 or0Var;
        if (!r0()) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        if (z4 && (or0Var = this.R) != null) {
            return or0Var.getBotPreviewsSubtitle();
        }
        gt0 gt0Var = this.W;
        if (gt0Var != null && gt0Var.f32857s != null) {
            i10 = 0;
            i11 = 0;
            for (int i12 = 0; i12 < gt0Var.f32857s.f17402i.size(); i12++) {
                MessageObject messageObject = (MessageObject) gt0Var.f32857s.f17402i.get(i12);
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
        StringBuilder sb = new StringBuilder();
        if (i10 > 0) {
            sb.append(LocaleController.formatPluralString("Images", i10, new Object[0]));
        }
        if (i11 > 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.formatPluralString("Videos", i11, new Object[0]));
        }
        return sb.toString();
    }

    public final rt0 W(int i10) {
        int i11 = 0;
        while (true) {
            rt0[] rt0VarArr = this.f33980h0;
            if (i11 < rt0VarArr.length) {
                rt0 rt0Var = rt0VarArr[i11];
                if (rt0Var != null && rt0Var.C == i10) {
                    return rt0Var;
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    public final void W0(f2.p0 p0Var) {
        if (p0Var instanceof tu0) {
            ArrayList arrayList = this.B0;
            ArrayList arrayList2 = this.C0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        } else if (p0Var == this.J) {
            ArrayList arrayList3 = this.D0;
            ArrayList arrayList4 = this.E0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
        } else {
            fu0 fu0Var = this.K;
            if (p0Var == fu0Var) {
                fu0Var.f27016r = null;
            }
        }
    }

    public final int X(int i10, int i11, boolean z4) {
        int i12;
        int i13 = 1;
        if (!z4) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        int i14 = i11 + i12;
        if (i14 > 6) {
            if (!z4) {
                i14 = 9;
            } else {
                i14 = 6;
            }
        }
        return Utilities.clamp(i14, 9, (this.f33981h1 && i10 == 1) ? 2 : 2);
    }

    public final void X0() {
        int i10;
        int i11 = 0;
        while (true) {
            rt0[] rt0VarArr = this.f33980h0;
            if (i11 < rt0VarArr.length) {
                xr0 xr0Var = rt0VarArr[i11].h;
                if (xr0Var != null) {
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < xr0Var.getChildCount(); i14++) {
                        View childAt = xr0Var.getChildAt(i14);
                        if (childAt instanceof org.telegram.ui.Cells.r7) {
                            org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) childAt;
                            int messageId = r7Var.getMessageId();
                            i13 = r7Var.getTop();
                            i12 = messageId;
                        }
                        if (childAt instanceof org.telegram.ui.Cells.i7) {
                            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) childAt;
                            int id2 = i7Var.getMessage().getId();
                            i13 = i7Var.getTop();
                            i12 = id2;
                        }
                        if (childAt instanceof org.telegram.ui.Cells.h7) {
                            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                            i12 = h7Var.getMessage().getId();
                            i13 = h7Var.getTop();
                        }
                        if (i12 != 0) {
                            break;
                        }
                    }
                    if (i12 != 0) {
                        int i15 = rt0VarArr[i11].C;
                        int i16 = -1;
                        if (p0(i15)) {
                            wu0 k12 = k1(i15);
                            if (k12 != null && k12.f32857s != null) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= k12.f32857s.f17402i.size()) {
                                        break;
                                    } else if (i12 == ((MessageObject) k12.f32857s.f17402i.get(i17)).getId()) {
                                        i16 = i17;
                                        break;
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                            i10 = i16;
                        } else if (i15 >= 0) {
                            ou0[] ou0VarArr = this.f33998q1;
                            if (i15 < ou0VarArr.length) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= ou0VarArr[i15].f29851a.size()) {
                                        break;
                                    } else if (i12 == ((MessageObject) ou0VarArr[i15].f29851a.get(i18)).getId()) {
                                        i16 = i18;
                                        break;
                                    } else {
                                        i18++;
                                    }
                                }
                                i10 = ou0VarArr[i15].f29861m + i16;
                            }
                        }
                        if (i16 >= 0) {
                            ((f2.j0) xr0Var.getLayoutManager()).h1(i10, (-rt0VarArr[i11].h.getPaddingTop()) + i13);
                            if (this.l1) {
                                rt0 rt0Var = rt0VarArr[i11];
                                rt0Var.f30851s.h1(i10, (-rt0Var.h.getPaddingTop()) + i13);
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

    public final int Y(boolean z4) {
        int i10;
        int i11 = this.U1;
        if (z4) {
            i10 = AndroidUtilities.dp(52.0f);
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public final void Y0(int i10) {
        os0 os0Var;
        if (!this.I1 && (os0Var = this.F0) != null) {
            os0Var.h(null, i10, os0Var.M.get(i10));
        }
    }

    public final int Z(int i10) {
        float f10;
        int i11;
        int dp = AndroidUtilities.dp(54.0f) + this.Y1;
        tr0 tr0Var = this.T;
        if (tr0Var != null && (w0(i10) || i10 == 8)) {
            f10 = tr0Var.getVisibilityFactor() * AndroidUtilities.dp(40.0f);
        } else {
            f10 = 0.0f;
        }
        int i12 = dp + ((int) f10);
        if (i10 == 9) {
            i11 = AndroidUtilities.dp(64.0f);
        } else {
            i11 = 0;
        }
        return i12 + i11;
    }

    public final void Z0(float f10, int i10) {
        int i11;
        os0 os0Var = this.F0;
        if (os0Var != null) {
            if (w0(i10)) {
                i11 = 8;
            } else {
                i11 = i10;
            }
            os0Var.j(f10, i11);
        }
        tr0 tr0Var = this.T;
        if (tr0Var != null) {
            l81 l81Var = tr0Var.f38931n;
            if (w0(i10)) {
                l81Var.f(f10, h1(i10));
            } else if (i10 == 8) {
                l81Var.f(f10, 0);
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
        rt0[] rt0VarArr = this.f33980h0;
        rt0 rt0Var = rt0VarArr[1];
        pr0 pr0Var = this.S;
        if (rt0Var != null && ((i12 = rt0Var.C) == 0 || (((i12 == 8 || w0(i12)) && TextUtils.isEmpty(getStoriesHashtag())) || (i13 = rt0VarArr[1].C) == 9 || i13 == 11 || i13 == 13 || (i13 == 14 && pr0Var != null)))) {
            f11 = 0.0f + f10;
        }
        rt0 rt0Var2 = rt0VarArr[0];
        if (rt0Var2 != null && ((i10 = rt0Var2.C) == 0 || (((i10 == 8 || w0(i10)) && TextUtils.isEmpty(getStoriesHashtag())) || (i11 = rt0VarArr[0].C) == 9 || i11 == 11 || i11 == 13 || (i11 == 14 && pr0Var != null)))) {
            return (1.0f - f10) + f11;
        }
        return f11;
    }

    public final void a1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i10 = 0;
        while (true) {
            rt0[] rt0VarArr = this.f33980h0;
            if (i10 < rt0VarArr.length) {
                rt0 rt0Var = rt0VarArr[i10];
                if (rt0Var.C != 7 || rt0Var.h.getAdapter() == null || rt0VarArr[i10].h.getAdapter().h() == 0 || this.f34004s1.getMessagesController().getStoriesController().f17777j.size() <= 0) {
                    i10++;
                } else {
                    return;
                }
            } else {
                if (this.C == 0) {
                    it0 it0Var = this.U;
                    it0Var.d = chatFull;
                    it0Var.f27902e = arrayList;
                }
                v1(true);
                for (int i11 = 0; i11 < rt0VarArr.length; i11++) {
                    rt0 rt0Var2 = rt0VarArr[i11];
                    if (rt0Var2.C == 7 && rt0Var2.h.getAdapter() != null) {
                        AndroidUtilities.notifyDataSetChanged(rt0VarArr[i11].h);
                    }
                }
                return;
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
        rt0[] rt0VarArr = this.f33980h0;
        rt0 rt0Var = rt0VarArr[1];
        if (rt0Var != null && s0(rt0Var.C) && rt0VarArr[1].C != 11) {
            f11 = 0.0f + f10;
        }
        rt0 rt0Var2 = rt0VarArr[0];
        if (rt0Var2 != null && s0(rt0Var2.C) && rt0VarArr[0].C != 11) {
            return (1.0f - f10) + f11;
        }
        return f11;
    }

    public void b1(boolean z4) {
        float f10;
        if (this.f34021z1 != z4) {
            this.f34021z1 = z4;
            AnimatorSet animatorSet = this.K1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            z9 z9Var = this.f34018y0;
            if (z4) {
                z9Var.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.K1 = animatorSet2;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(z9Var, View.ALPHA, f10));
            this.K1.setDuration(180L);
            this.K1.addListener(new x20(9, this, z4));
            this.K1.start();
            if (z4) {
                u1();
            }
        }
    }

    public final int c0(int i10) {
        wu0 k12;
        oh.l6 l6Var;
        if (p0(i10) && (k12 = k1(i10)) != null && (l6Var = k12.f32857s) != null) {
            return l6Var.g();
        }
        return 0;
    }

    public final void c1(int r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zu0.c1(int, boolean):void");
    }

    public final void d1(int i10) {
        int h12 = h1(getClosestTab());
        tr0 tr0Var = this.T;
        if (h12 != i10) {
            if (tr0Var != null) {
                tr0Var.f38931n.d(i10, tr0Var.f38933s.i(i10));
                return;
            }
            return;
        }
        tr0Var.setReorderingAlbums(true);
        yu0 i12 = i1(i10);
        rt0 W = W(i12.f33579a);
        if (W == null) {
            return;
        }
        xr0 xr0Var = W.h;
        for (int i11 = 0; i11 < xr0Var.getChildCount(); i11++) {
            View childAt = xr0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.r7) {
                ((org.telegram.ui.Cells.r7) childAt).l(true, true);
            }
        }
        xu0 xu0Var = i12.f33581c;
        if (xu0Var != null && !xu0Var.f32859x) {
            xu0Var.f32859x = true;
        }
        q1(true);
    }

    @Override
    public final void didReceivedNotification(int r42, int r43, java.lang.Object... r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zu0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        os0 os0Var = this.F0;
        if (os0Var != null) {
            canvas.save();
            canvas.translate(os0Var.getX(), os0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        ks0 ks0Var = this.O0;
        if (ks0Var != null) {
            int i10 = ks0Var.Q;
            if ((i10 == 3 || i10 == 1) && this.M0 == null) {
                canvas.save();
                canvas.translate(ks0Var.getX(), ks0Var.getY());
                ks0Var.setDrawOverlay(true);
                ks0Var.draw(canvas);
                ks0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i10;
        if (view == this.O0 && this.M0 == null) {
            canvas.save();
            rt0[] rt0VarArr = this.f33980h0;
            float top = rt0VarArr[0].getTop();
            tr0 tr0Var = this.T;
            if (tr0Var != null && ((i10 = rt0VarArr[0].C) == 8 || w0(i10))) {
                top -= tr0Var.getVisualHeight();
            }
            canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + AndroidUtilities.dp(12.0f));
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void e(org.telegram.ui.Cells.r2 r2Var) {
        int i10;
        org.telegram.ui.ActionBar.p2 p2Var = this.f34004s1;
        if (p2Var != null && p2Var.getMessagesController().getStoriesController().I(r2Var.getDialogId())) {
            p2Var.getOrCreateStoryViewer().getClass();
            oh.i9 orCreateStoryViewer = p2Var.getOrCreateStoryViewer();
            Context context = p2Var.getContext();
            long dialogId = r2Var.getDialogId();
            oh.c7 a10 = oh.c7.a((tl0) r2Var.getParent());
            if ((p2Var instanceof ProfileActivity) && ((ProfileActivity) p2Var).f34667p1) {
                i10 = AndroidUtilities.dp(68.0f);
            } else {
                i10 = 0;
            }
            a10.f16948s += i10;
            orCreateStoryViewer.D(context, dialogId, a10);
        }
    }

    public final void e1(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zu0.e1(boolean):void");
    }

    public final float f0(int i10, boolean z4) {
        float width = getWidth();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            rt0[] rt0VarArr = this.f33980h0;
            if (i11 >= rt0VarArr.length) {
                break;
            }
            rt0 rt0Var = rt0VarArr[i11];
            if (rt0Var != null) {
                int i13 = rt0Var.C;
                if ((z4 && i10 == 8 && w0(i13)) || i13 == i10) {
                    i12++;
                    width = rt0VarArr[i11].getTranslationX();
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
            rt0[] rt0VarArr = this.f33980h0;
            if (i10 < rt0VarArr.length) {
                int childCount = rt0VarArr[i10].h.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = rt0VarArr[i10].h.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.e2) {
                        ImageReceiver photoImage = ((org.telegram.ui.Cells.e2) childAt).getPhotoImage();
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

    public final float g0(int i10, boolean z4) {
        float f10 = 0.0f;
        int i11 = 0;
        while (true) {
            rt0[] rt0VarArr = this.f33980h0;
            if (i11 < rt0VarArr.length) {
                rt0 rt0Var = rt0VarArr[i11];
                if (rt0Var != null) {
                    int i12 = rt0Var.C;
                    if ((z4 && i10 == 8 && w0(i12)) || i12 == i10) {
                        f10 = (1.0f - Math.abs(rt0VarArr[i11].getTranslationX() / getWidth())) + f10;
                    }
                }
                i11++;
            } else {
                return f10;
            }
        }
    }

    public final void g1(MotionEvent motionEvent) {
        float f10;
        float f11;
        boolean z4;
        float measuredWidth;
        rt0 rt0Var;
        rt0 rt0Var2;
        int measuredWidth2;
        rt0 rt0Var3;
        rt0 rt0Var4;
        boolean z10;
        VelocityTracker velocityTracker = this.f34019y1;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.P0);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f10 = this.f34019y1.getXVelocity();
                f11 = this.f34019y1.getYVelocity();
                if (!this.f34008u1 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                    if (f10 < 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    U0(motionEvent, z10);
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (this.f34008u1) {
                rt0[] rt0VarArr = this.f33980h0;
                float x10 = rt0VarArr[0].getX();
                this.f33969c1 = new AnimatorSet();
                if (Math.abs(x10) < rt0VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f33977f1 = z4;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new k70(this, 19));
                boolean z11 = this.f33977f1;
                Property property = View.TRANSLATION_X;
                if (z11) {
                    measuredWidth = Math.abs(x10);
                    if (this.f33974e1) {
                        this.f33969c1.playTogether(ObjectAnimator.ofFloat(rt0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(rt0VarArr[1], property, rt0Var4.getMeasuredWidth()), ofFloat);
                    } else {
                        this.f33969c1.playTogether(ObjectAnimator.ofFloat(rt0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(rt0VarArr[1], property, -rt0Var3.getMeasuredWidth()), ofFloat);
                    }
                } else {
                    measuredWidth = rt0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                    if (this.f33974e1) {
                        this.f33969c1.playTogether(ObjectAnimator.ofFloat(rt0VarArr[0], property, -rt0Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(rt0VarArr[1], property, 0.0f), ofFloat);
                    } else {
                        this.f33969c1.playTogether(ObjectAnimator.ofFloat(rt0VarArr[0], property, rt0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(rt0VarArr[1], property, 0.0f), ofFloat);
                    }
                }
                this.f33969c1.setInterpolator(f33960b2);
                int measuredWidth3 = getMeasuredWidth();
                float f12 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f12) + f12;
                float abs = Math.abs(f10);
                if (abs > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                this.f33969c1.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                this.f33969c1.addListener(new rs0(this, 1));
                this.f33969c1.start();
                this.f33971d1 = true;
                this.f34008u1 = false;
                L0();
            } else {
                this.f34010v1 = false;
                this.D.setEnabled(true);
                this.F0.setEnabled(true);
            }
            VelocityTracker velocityTracker2 = this.f34019y1;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f34019y1 = null;
            }
        }
    }

    public SparseArray<MessageObject> getActionModeSelected() {
        return this.W0[0];
    }

    public float getBottomButtonStoriesVisibility() {
        rt0 rt0Var;
        rt0 rt0Var2;
        boolean z4;
        boolean z10;
        oh.l6 l6Var;
        oh.l6 l6Var2;
        float f10 = 1.0f;
        rt0[] rt0VarArr = this.f33980h0;
        if (rt0VarArr == null || (rt0Var = rt0VarArr[0]) == null || (rt0Var2 = rt0VarArr[1]) == null || rt0Var.f30852w == null || rt0Var2.f30852w == null) {
            return 1.0f;
        }
        int i10 = rt0Var.C;
        int i11 = rt0Var2.C;
        if (!w0(i10) && i10 != 8) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!w0(i11) && i11 != 8) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z4 && !z10) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - rt0VarArr[0].f30852w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - rt0VarArr[1].f30852w.getVisibilityFactor();
        wu0 k12 = k1(rt0VarArr[0].C);
        if (i10 == 8 || (k12 != null && (l6Var2 = k12.f32857s) != null && l6Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        wu0 k13 = k1(i11);
        if (i11 != 8 && (k13 == null || (l6Var = k13.f32857s) == null || l6Var.g() <= 0)) {
            f10 = visibilityFactor2;
        }
        if (!z4) {
            visibilityFactor = f10;
        }
        if (!z10) {
            f10 = visibilityFactor;
        }
        return AndroidUtilities.lerp(visibilityFactor, f10, Math.abs(rt0VarArr[0].getTranslationX() / rt0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        rt0[] rt0VarArr = this.f33980h0;
        rt0 rt0Var = rt0VarArr[1];
        if (rt0Var != null && rt0Var.getVisibility() == 0) {
            if (this.f33971d1 && !this.f33977f1) {
                return rt0VarArr[1].C;
            }
            if (Math.abs(rt0VarArr[1].getTranslationX()) < rt0VarArr[1].getMeasuredWidth() / 2.0f) {
                return rt0VarArr[1].C;
            }
        }
        return getSelectedTab();
    }

    public tl0 getCurrentListView() {
        et0 et0Var;
        rt0 rt0Var = this.f33980h0[0];
        int i10 = rt0Var.C;
        if (i10 == 13) {
            return this.R.getCurrentListView();
        }
        if (i10 == 14) {
            return this.S.getCurrentListView();
        }
        if (i10 == 12 && (et0Var = this.Q) != null) {
            return et0Var.f43958a.f43362u0;
        }
        return rt0Var.h;
    }

    public int getInitialTab() {
        return 0;
    }

    public int getPhotosVideosTypeFilter() {
        return this.f33998q1[0].f29865q;
    }

    public TextView getSaveItem() {
        return this.f33991n0;
    }

    public org.telegram.ui.ActionBar.w0 getSearchItem() {
        return this.f33986k0;
    }

    public lj0 getSearchOptionsItem() {
        return this.f33995p0;
    }

    public int getSelectedTab() {
        int currentTabId = this.F0.getCurrentTabId();
        tr0 tr0Var = this.T;
        if (tr0Var != null && currentTabId == 8) {
            int currentAlbumId = tr0Var.getCurrentAlbumId();
            if (currentAlbumId == 0) {
                return 8;
            }
            if (currentAlbumId > 0) {
                return i1(currentAlbumId).f33579a;
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
        float f10 = 0.0f;
        int i10 = 0;
        while (true) {
            rt0[] rt0VarArr = this.f33980h0;
            if (i10 < rt0VarArr.length) {
                rt0 rt0Var = rt0VarArr[i10];
                if (rt0Var != null) {
                    f10 = ((1.0f - Math.abs(rt0Var.getTranslationX() / getWidth())) * rt0Var.C) + f10;
                }
                i10++;
            } else {
                return f10;
            }
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.m6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.m6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34015x0, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.f22053z6));
        org.telegram.ui.ActionBar.w0 w0Var = this.f33982i0;
        lj0 iconView = w0Var.getIconView();
        int i10 = org.telegram.ui.ActionBar.k6.f22038y8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(iconView, 8, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.f22055z8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(w0Var, 32, null, null, null, null, i11));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f34000r0;
        if (w0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(w0Var2.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.m6(w0Var2, 32, null, null, null, null, i11));
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f33997q0;
        if (w0Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(w0Var3.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.m6(w0Var3, 32, null, null, null, null, i11));
        }
        Drawable[] drawableArr = {this.A0};
        ImageView imageView = this.f34020z0;
        arrayList.add(new org.telegram.ui.ActionBar.m6(imageView, 8, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(imageView, 32, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.f21659d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34018y0, 1, null, null, null, null, i12));
        os0 os0Var = this.F0;
        arrayList.add(new org.telegram.ui.ActionBar.m6(os0Var, 1, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.k6.f22004wc;
        org.telegram.ui.Cells.v0 v0Var = this.H0;
        arrayList.add(new org.telegram.ui.ActionBar.m6(v0Var, 0, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(v0Var, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21792kd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(os0Var, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Gh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(os0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.k6.Fh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(os0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.k6.Eh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(os0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.k6.Hh));
        ks0 ks0Var = this.O0;
        if (ks0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(ks0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21980v7));
            arrayList.add(new org.telegram.ui.ActionBar.m6(ks0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21999w7));
            arrayList.add(new org.telegram.ui.ActionBar.m6(ks0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21962u7));
            arrayList.add(new org.telegram.ui.ActionBar.m6(ks0Var, 33554436, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21945t7));
            arrayList.add(new org.telegram.ui.ActionBar.m6(ks0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f22018x7));
            arrayList.add(new org.telegram.ui.ActionBar.m6(ks0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f22037y7));
            arrayList.add(new org.telegram.ui.ActionBar.m6(ks0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.A7));
        }
        final int i14 = 0;
        while (true) {
            rt0[] rt0VarArr = this.f33980h0;
            if (i14 < rt0VarArr.length) {
                org.telegram.ui.ActionBar.l6 l6Var = new org.telegram.ui.ActionBar.l6() {
                    @Override
                    public final void b() {
                        rt0[] rt0VarArr2 = zu0.this.f33980h0;
                        int i15 = i14;
                        xr0 xr0Var = rt0VarArr2[i15].h;
                        if (xr0Var != null) {
                            int childCount = xr0Var.getChildCount();
                            for (int i16 = 0; i16 < childCount; i16++) {
                                View childAt = rt0VarArr2[i15].h.getChildAt(i16);
                                if (childAt instanceof org.telegram.ui.Cells.s7) {
                                    org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) childAt;
                                    for (int i17 = 0; i17 < 6; i17++) {
                                        s7Var.f23742a[i17].f23306e.invalidate();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                                    ((org.telegram.ui.Cells.h6) childAt).u(0);
                                } else if (childAt instanceof org.telegram.ui.Cells.va) {
                                    ((org.telegram.ui.Cells.va) childAt).j(0);
                                }
                            }
                        }
                    }

                    @Override
                    public final void a(float f10) {
                    }
                };
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21779k0, null, null, org.telegram.ui.ActionBar.k6.f21660d7));
                gs0 gs0Var = rt0VarArr[i14].v;
                int i15 = org.telegram.ui.ActionBar.k6.f21659d6;
                arrayList.add(new org.telegram.ui.ActionBar.m6(gs0Var, 0, null, null, null, null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.f21930s8));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21750i6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].f30852w, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.f21642c7));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 524288, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21697f7));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21678e7));
                int i16 = org.telegram.ui.ActionBar.k6.f21732h6;
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21972uh));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21821m6));
                int i17 = org.telegram.ui.ActionBar.k6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
                int i18 = org.telegram.ui.ActionBar.k6.f22036y6;
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, null, null, -1, l6Var, i18));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, null, null, -1, l6Var, org.telegram.ui.ActionBar.k6.f21839n6));
                Drawable[] drawableArr2 = org.telegram.ui.ActionBar.k6.f21906r0;
                int i19 = org.telegram.ui.ActionBar.k6.J7;
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, null, drawableArr2, null, i19));
                TextPaint[] textPaintArr = org.telegram.ui.ActionBar.k6.B0;
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.k6.D0}, null, -1, null, org.telegram.ui.ActionBar.k6.X8));
                TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.k6.C0;
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.k6.E0}, null, -1, null, org.telegram.ui.ActionBar.k6.Z8));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, drawableArr2, null, i19));
                arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, l6Var, org.telegram.ui.ActionBar.k6.O7));
                arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, l6Var, org.telegram.ui.ActionBar.k6.P7));
                arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, l6Var, org.telegram.ui.ActionBar.k6.Q7));
                arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, l6Var, org.telegram.ui.ActionBar.k6.R7));
                arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, l6Var, org.telegram.ui.ActionBar.k6.S7));
                arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, l6Var, org.telegram.ui.ActionBar.k6.T7));
                arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, l6Var, org.telegram.ui.ActionBar.k6.U7));
                int i20 = org.telegram.ui.ActionBar.k6.f22053z6;
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 4, new Class[]{lt0.class}, new String[]{"emptyTextView"}, null, null, -1, null, i20));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.A6));
                int i21 = org.telegram.ui.ActionBar.k6.Ih;
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 2048, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"progressView"}, null, null, -1, null, i21));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"statusImageView"}, null, null, -1, null, i21));
                int i22 = org.telegram.ui.ActionBar.k6.f21751i7;
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                int i23 = org.telegram.ui.ActionBar.k6.f21786k7;
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.zi));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Bi));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.k6.f21693f3, null, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.k6.f21711g3, null, null, i20));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.l7.class}, null, null, null, org.telegram.ui.ActionBar.k6.J6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.l7.class}, org.telegram.ui.ActionBar.k6.m0, null, null, org.telegram.ui.ActionBar.k6.K6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Kh));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 32, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Jh));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.m7.class}, null, null, null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 524288, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"textView"}, null, null, -1, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"textView"}, null, null, -1, null, i17));
                int i24 = org.telegram.ui.ActionBar.k6.Lh;
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.s7.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.s7.class}, null, null, l6Var, i22));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.s7.class}, null, null, l6Var, i23));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.e2.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, l6Var, i22));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, l6Var, i23));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].h, 0, null, null, new Drawable[]{this.f34009v0}, null, org.telegram.ui.ActionBar.k6.f21624b7));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].f30852w.d, 4, null, null, null, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.m6(rt0VarArr[i14].f30852w.f25364e, 4, null, null, null, null, i18));
                i14++;
            } else {
                return arrayList;
            }
        }
    }

    public final int h0(int i10) {
        org.telegram.ui.ActionBar.g6 g6Var = this.C1;
        if (g6Var != null) {
            return g6Var.B0(i10);
        }
        return org.telegram.ui.ActionBar.k6.w0(null, i10, false);
    }

    public final int h1(int i10) {
        yu0 j12 = j1(i10);
        if (j12 == null) {
            return -1;
        }
        return j12.f33580b;
    }

    public final boolean i0() {
        if (this.f34004s1.getConnectionsManager().getConnectionState() == 3) {
            return true;
        }
        return false;
    }

    public final yu0 i1(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.V1;
        yu0 yu0Var = (yu0) hashMap.get(valueOf);
        if (yu0Var == null) {
            yu0 yu0Var2 = new yu0(this, getContext(), i10);
            hashMap.put(Integer.valueOf(i10), yu0Var2);
            this.W1.put(Integer.valueOf(yu0Var2.f33579a), Integer.valueOf(i10));
            return yu0Var2;
        }
        return yu0Var;
    }

    public final boolean j0() {
        SparseArray[] sparseArrayArr;
        MessageObject messageObject;
        TLRPC.Message message;
        boolean z4 = false;
        for (int i10 = 1; i10 >= 0; i10--) {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            while (true) {
                sparseArrayArr = this.W0;
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
                    z4 = true;
                    break;
                }
            }
            if (z4) {
                return z4;
            }
        }
        return z4;
    }

    public final yu0 j1(int i10) {
        Integer num = (Integer) this.W1.get(Integer.valueOf(i10));
        if (num == null) {
            return null;
        }
        return (yu0) this.V1.get(num);
    }

    public final void k0() {
        AndroidUtilities.cancelRunOnUIThread(this.J0);
        org.telegram.ui.Cells.v0 v0Var = this.H0;
        if (v0Var.getTag() == null) {
            return;
        }
        v0Var.setTag(null);
        AnimatorSet animatorSet = this.I0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.I0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.I0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.I0.playTogether(ObjectAnimator.ofFloat(v0Var, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(v0Var, View.TRANSLATION_Y, (-AndroidUtilities.dp(48.0f)) + this.L0));
        this.I0.setInterpolator(pr.f30184g);
        this.I0.addListener(new rs0(this, 0));
        this.I0.start();
    }

    public final wu0 k1(int i10) {
        yu0 j12;
        if (i10 == 8) {
            return this.W;
        }
        if (i10 == 9) {
            return this.f33965b0;
        }
        if (w0(i10) && (j12 = j1(i10)) != null) {
            return j12.f33581c;
        }
        return null;
    }

    public boolean l0() {
        return false;
    }

    public final wu0 l1(int i10) {
        yu0 j12;
        if (i10 == 8) {
            return this.f33962a0;
        }
        if (i10 == 9) {
            return this.f33968c0;
        }
        if (!w0(i10) || (j12 = j1(i10)) == null) {
            return null;
        }
        return j12.d;
    }

    public boolean m0() {
        return !(this instanceof c40);
    }

    public final void m1(boolean z4) {
        rt0[] rt0VarArr;
        rt0[] rt0VarArr2;
        f2.c1 c1Var;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f10;
        int i10;
        float f11;
        float f12;
        boolean z14;
        ou0[] ou0VarArr;
        String str;
        ?? r52;
        int i11;
        int i12;
        boolean z15;
        boolean z16;
        boolean z17;
        int i13;
        int i14;
        int i15;
        String str2;
        boolean z18;
        int i16;
        boolean z19;
        f2.c1 c1Var2;
        String str3;
        int i17;
        int i18;
        boolean z20;
        int i19;
        int i20;
        boolean z21;
        int i21;
        pr0 pr0Var = this.S;
        if (pr0Var != null) {
            pr0Var.i();
        }
        int i22 = 0;
        while (true) {
            rt0VarArr = this.f33980h0;
            if (i22 >= rt0VarArr.length) {
                break;
            }
            rt0VarArr[i22].h.B0();
            i22++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rt0VarArr[z4 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = AndroidUtilities.dp(B0());
        f2.p0 adapter = rt0VarArr[z4 ? 1 : 0].h.getAdapter();
        f2.p0 p0Var = this.W;
        f2.f0 f0Var = this.V;
        if (adapter == p0Var) {
            f0Var.d(null);
        }
        boolean z22 = this.S0;
        kt0 kt0Var = this.A1;
        String str4 = "";
        fu0 fu0Var = this.K;
        org.telegram.ui.ActionBar.w0 w0Var = this.f33986k0;
        int i23 = 100;
        if (z22 && this.R0) {
            rt0 rt0Var = rt0VarArr[z4 ? 1 : 0];
            if (rt0Var.f30848f == null) {
                rt0Var.f30848f = new f2.c1();
            }
            rt0 rt0Var2 = rt0VarArr[z4 ? 1 : 0];
            c1Var2 = rt0Var2.f30848f;
            ku0 ku0Var = this.P;
            pt0 pt0Var = this.f33978g0;
            ut0 ut0Var = this.f33973e0;
            ut0 ut0Var2 = this.f33976f0;
            ut0 ut0Var3 = this.f33970d0;
            if (z4) {
                int i24 = rt0Var2.C;
                if (i24 != 0 && i24 != 2 && i24 != 5 && i24 != 6 && (i24 != 7 || kt0Var.T())) {
                    if (w0Var != null) {
                        str4 = w0Var.getSearchField().getText().toString();
                    }
                    int i25 = rt0VarArr[z4 ? 1 : 0].C;
                    if (i25 == 1) {
                        if (ut0Var3 != null) {
                            ut0Var3.G(str4, false);
                            if (adapter != ut0Var3) {
                                W0(adapter);
                                rt0VarArr[z4 ? 1 : 0].h.setAdapter(ut0Var3);
                            }
                        }
                    } else if (i25 == 3) {
                        if (ut0Var2 != null) {
                            ut0Var2.G(str4, false);
                            if (adapter != ut0Var2) {
                                W0(adapter);
                                rt0VarArr[z4 ? 1 : 0].h.setAdapter(ut0Var2);
                            }
                        }
                    } else if (i25 == 4) {
                        if (ut0Var != null) {
                            ut0Var.G(str4, false);
                            if (adapter != ut0Var) {
                                W0(adapter);
                                rt0VarArr[z4 ? 1 : 0].h.setAdapter(ut0Var);
                            }
                        }
                    } else if (i25 == 7) {
                        if (pt0Var != null) {
                            pt0Var.F(str4, false);
                            if (adapter != pt0Var) {
                                W0(adapter);
                                rt0VarArr[z4 ? 1 : 0].h.setAdapter(pt0Var);
                            }
                        }
                    } else if (i25 == 11) {
                        if (ku0Var != null) {
                            ku0Var.E(this.T0, str4);
                            if (adapter != ku0Var) {
                                W0(adapter);
                                rt0VarArr[z4 ? 1 : 0].h.setAdapter(ku0Var);
                            }
                        }
                    } else if (i25 == 15 && fu0Var != null && adapter != fu0Var) {
                        W0(adapter);
                        xr0 xr0Var = rt0VarArr[z4 ? 1 : 0].h;
                        fu0Var.f27016r = xr0Var;
                        xr0Var.setAdapter(fu0Var);
                    }
                } else {
                    this.S0 = false;
                    ls0 ls0Var = this.G0;
                    if (ls0Var != null) {
                        ls0Var.g(false);
                    }
                    this.R0 = false;
                    m1(true);
                    return;
                }
            } else if (rt0Var2.h != null) {
                int i26 = rt0Var2.C;
                if (i26 == 1) {
                    if (adapter != ut0Var3) {
                        W0(adapter);
                        rt0VarArr[z4 ? 1 : 0].h.setAdapter(ut0Var3);
                    }
                    ut0Var3.l();
                } else if (i26 == 3) {
                    if (adapter != ut0Var2) {
                        W0(adapter);
                        rt0VarArr[z4 ? 1 : 0].h.setAdapter(ut0Var2);
                    }
                    ut0Var2.l();
                } else if (i26 == 4) {
                    if (adapter != ut0Var) {
                        W0(adapter);
                        rt0VarArr[z4 ? 1 : 0].h.setAdapter(ut0Var);
                    }
                    ut0Var.l();
                } else if (i26 == 7) {
                    if (adapter != pt0Var) {
                        W0(adapter);
                        rt0VarArr[z4 ? 1 : 0].h.setAdapter(pt0Var);
                    }
                    pt0Var.l();
                } else if (i26 == 11) {
                    if (adapter != ku0Var) {
                        W0(adapter);
                        rt0VarArr[z4 ? 1 : 0].h.setAdapter(ku0Var);
                    }
                    ku0Var.l();
                }
            }
            rt0VarArr2 = rt0VarArr;
            z19 = false;
            z18 = false;
            i16 = 100;
        } else {
            rt0 rt0Var3 = rt0VarArr[z4 ? 1 : 0];
            if (rt0Var3.f30847e == null) {
                rt0Var3.f30847e = new f2.c1();
            }
            rt0 rt0Var4 = rt0VarArr[z4 ? 1 : 0];
            f2.c1 c1Var3 = rt0Var4.f30847e;
            rt0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i27 = rt0VarArr[z4 ? 1 : 0].C;
            if (i27 == 8 || w0(i27)) {
                layoutParams.topMargin = AndroidUtilities.dp(B0());
            }
            xr0 xr0Var2 = rt0VarArr[z4 ? 1 : 0].h;
            int paddingLeft = xr0Var2.getPaddingLeft();
            rt0 rt0Var5 = rt0VarArr[z4 ? 1 : 0];
            xr0 xr0Var3 = rt0Var5.h;
            int Z = Z(rt0Var5.C);
            xr0Var3.f30477a3 = Z;
            int paddingRight = rt0VarArr[z4 ? 1 : 0].h.getPaddingRight();
            rt0VarArr2 = rt0VarArr;
            xr0 xr0Var4 = rt0VarArr2[z4 ? 1 : 0].h;
            int Y = Y(v0());
            xr0Var4.f30478b3 = Y;
            xr0Var2.setPadding(paddingLeft, Z, paddingRight, Y);
            int i28 = rt0VarArr2[z4 ? 1 : 0].C;
            int[] iArr = this.f33985j1;
            f2.p0 p0Var2 = this.H;
            View view = this.R;
            et0 et0Var = this.Q;
            iu0 iu0Var = this.O;
            jt0 jt0Var = this.M;
            ou0[] ou0VarArr2 = this.f33998q1;
            if (i28 == 0) {
                f2.p0 p0Var3 = this.E;
                if (adapter != p0Var3) {
                    W0(adapter);
                    rt0VarArr2[z4 ? 1 : 0].h.setAdapter(p0Var3);
                }
                int i29 = -AndroidUtilities.dp(1.0f);
                layoutParams.rightMargin = i29;
                layoutParams.leftMargin = i29;
                ou0 ou0Var = ou0VarArr2[0];
                if (ou0Var.h && !ou0Var.f29854e.isEmpty()) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                i23 = iArr[0];
                rt0VarArr2[z4 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.f34009v0);
                ou0 ou0Var2 = ou0VarArr2[0];
                if (ou0Var2.f29871x == null) {
                    ou0Var2.f29871x = new f2.c1();
                }
                z12 = z21;
                c1Var = ou0VarArr2[0].f29871x;
                z10 = false;
            } else {
                if (i28 == 1) {
                    ou0 ou0Var3 = ou0VarArr2[1];
                    if (ou0Var3.h && !ou0Var3.f29854e.isEmpty()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (adapter != p0Var2) {
                        W0(adapter);
                        rt0VarArr2[z4 ? 1 : 0].h.setAdapter(p0Var2);
                    }
                } else if (i28 == 2) {
                    ou0 ou0Var4 = ou0VarArr2[2];
                    if (ou0Var4.h && !ou0Var4.f29854e.isEmpty()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (adapter != this.I) {
                        W0(adapter);
                        rt0VarArr2[z4 ? 1 : 0].h.setAdapter(this.I);
                    }
                } else {
                    if (i28 == 3) {
                        if (adapter != this.G) {
                            W0(adapter);
                            rt0VarArr2[z4 ? 1 : 0].h.setAdapter(this.G);
                        }
                    } else if (i28 == 4) {
                        ou0 ou0Var5 = ou0VarArr2[4];
                        if (ou0Var5.h && !ou0Var5.f29854e.isEmpty()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (adapter != this.J) {
                            W0(adapter);
                            rt0VarArr2[z4 ? 1 : 0].h.setAdapter(this.J);
                        }
                    } else {
                        if (i28 == 5) {
                            if (adapter != this.L) {
                                W0(adapter);
                                rt0VarArr2[z4 ? 1 : 0].h.setAdapter(this.L);
                            }
                        } else if (i28 == 15) {
                            if (adapter != fu0Var) {
                                W0(adapter);
                                xr0 xr0Var5 = rt0VarArr2[z4 ? 1 : 0].h;
                                fu0Var.f27016r = xr0Var5;
                                xr0Var5.setAdapter(fu0Var);
                            }
                        } else if (i28 == 6) {
                            if (adapter != jt0Var) {
                                W0(adapter);
                                rt0VarArr2[z4 ? 1 : 0].h.setAdapter(jt0Var);
                            }
                        } else if (i28 == 7) {
                            if (adapter != this.U) {
                                W0(adapter);
                                rt0VarArr2[z4 ? 1 : 0].h.setAdapter(this.U);
                            }
                        } else if (p0(i28)) {
                            f2.p0 k12 = k1(rt0VarArr2[z4 ? 1 : 0].C);
                            if (adapter != k12) {
                                W0(adapter);
                                rt0VarArr2[z4 ? 1 : 0].h.setAdapter(k12);
                                rt0VarArr2[z4 ? 1 : 0].h.getClass();
                            }
                            rt0 rt0Var6 = rt0VarArr2[z4 ? 1 : 0];
                            if (rt0Var6.C != 9) {
                                f0Var.d(rt0Var6.h);
                            }
                            i23 = iArr[1];
                        } else {
                            int i30 = rt0VarArr2[z4 ? 1 : 0].C;
                            if (i30 == 10) {
                                if (adapter != this.N) {
                                    W0(adapter);
                                    rt0VarArr2[z4 ? 1 : 0].h.setAdapter(this.N);
                                }
                            } else if (i30 == 11) {
                                if (adapter != iu0Var) {
                                    W0(adapter);
                                    rt0VarArr2[z4 ? 1 : 0].h.setAdapter(iu0Var);
                                    f2.f0 f0Var2 = iu0Var.v;
                                    xr0 xr0Var6 = rt0VarArr2[z4 ? 1 : 0].h;
                                    iu0Var.f27911s = xr0Var6;
                                    f0Var2.d(xr0Var6);
                                }
                                c1Var = iu0Var.f27910r;
                                z10 = true;
                                z12 = false;
                            } else if (i30 == 12) {
                                if (adapter != null) {
                                    W0(adapter);
                                    rt0VarArr2[z4 ? 1 : 0].h.setAdapter(null);
                                }
                                if (et0Var.getParent() != rt0VarArr2[z4 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(et0Var);
                                    rt0VarArr2[z4 ? 1 : 0].addView(et0Var, k7.c6.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                }
                            } else if (i30 == 13) {
                                if (adapter != null) {
                                    W0(adapter);
                                    rt0VarArr2[z4 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != rt0VarArr2[z4 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(view);
                                    rt0VarArr2[z4 ? 1 : 0].addView(view);
                                }
                            } else if (i30 == 14) {
                                if (adapter != null) {
                                    W0(adapter);
                                    rt0VarArr2[z4 ? 1 : 0].h.setAdapter(null);
                                }
                                if (pr0Var != null && pr0Var.getParent() != rt0VarArr2[z4 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(pr0Var);
                                    rt0VarArr2[z4 ? 1 : 0].addView(pr0Var);
                                    rt0VarArr2[z4 ? 1 : 0].f30852w.setVisibility(4);
                                }
                            }
                        }
                        c1Var = c1Var3;
                        z10 = false;
                        z12 = false;
                    }
                    c1Var = c1Var3;
                    z10 = true;
                    z12 = false;
                }
                z12 = z11;
                c1Var = c1Var3;
                z10 = true;
            }
            int i31 = rt0VarArr2[z4 ? 1 : 0].C;
            if (i31 != 0 && !p0(i31)) {
                z13 = false;
            } else {
                z13 = true;
            }
            gs0 gs0Var = rt0VarArr2[z4 ? 1 : 0].v;
            if (z13) {
                f10 = 0.0f;
            } else {
                f10 = 12.0f;
            }
            if (z13) {
                i10 = 8;
            } else {
                i10 = 12;
            }
            f2.c1 c1Var4 = c1Var;
            float f13 = i10 + 48;
            if (z13) {
                f11 = 0.0f;
            } else {
                f11 = 12.0f;
            }
            if (z13) {
                f12 = 0.0f;
            } else {
                f12 = 12.0f;
            }
            gs0Var.setLayoutParams(k7.c6.d(-1, -1.0f, 119, f10, f13, f11, f12));
            if (z10) {
                rt0VarArr2[z4 ? 1 : 0].h.setSections(false);
            } else {
                xr0 xr0Var7 = rt0VarArr2[z4 ? 1 : 0].h;
                xr0Var7.getClass();
                xr0Var7.setSelectorDrawableColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21750i6, xr0Var7.f31383m2));
                xr0Var7.F2 = null;
                xr0Var7.I2 = 0.0f;
                xr0Var7.J2 = null;
                xr0Var7.K2 = null;
                xr0Var7.G2 = null;
                hl0 hl0Var = xr0Var7.E2;
                if (hl0Var != null) {
                    xr0Var7.p0(hl0Var);
                    xr0Var7.E2 = null;
                }
            }
            rt0 rt0Var7 = rt0VarArr2[z4 ? 1 : 0];
            int i32 = rt0Var7.C;
            org.telegram.ui.ActionBar.p2 p2Var = this.f34004s1;
            if (i32 == 15) {
                z14 = z12;
                ou0VarArr = ou0VarArr2;
                str = "";
                rt0Var7.setBackground(qh.j5.e(rt0Var7.getBackground(), p2Var.getCurrentAccount(), this.f33979g1, org.telegram.ui.ActionBar.k6.I.q()));
                rt0VarArr2[z4 ? 1 : 0].setOutlineProvider(new hg.j1(12));
                rt0VarArr2[z4 ? 1 : 0].setClipToOutline(true);
                r52 = 0;
            } else {
                z14 = z12;
                ou0VarArr = ou0VarArr2;
                str = "";
                rt0Var7.setClipToOutline(false);
                r52 = 0;
                rt0VarArr2[z4 ? 1 : 0].setBackground(null);
            }
            rt0 rt0Var8 = rt0VarArr2[z4 ? 1 : 0];
            if (rt0Var8.C == 11) {
                rt0Var8.h.setItemAnimator(rt0Var8.d);
            } else {
                rt0Var8.h.setItemAnimator(r52);
                if (iu0Var != null && rt0VarArr2[z4 ? 1 : 0].h == iu0Var.f27911s) {
                    f2.f0 f0Var3 = iu0Var.v;
                    iu0Var.f27911s = r52;
                    f0Var3.d(r52);
                }
            }
            if (et0Var != null && rt0VarArr2[z4 ? 1 : 0].C != 12 && et0Var.getParent() == rt0VarArr2[z4 ? 1 : 0]) {
                et0Var.f43958a.onRemoveFromParent();
                rt0VarArr2[z4 ? 1 : 0].removeView(et0Var);
            }
            if (view != null && rt0VarArr2[z4 ? 1 : 0].C != 13) {
                ViewParent parent = view.getParent();
                rt0 rt0Var9 = rt0VarArr2[z4 ? 1 : 0];
                if (parent == rt0Var9) {
                    rt0Var9.removeView(view);
                }
            }
            if (pr0Var != null && rt0VarArr2[z4 ? 1 : 0].C != 14) {
                ViewParent parent2 = pr0Var.getParent();
                rt0 rt0Var10 = rt0VarArr2[z4 ? 1 : 0];
                if (parent2 == rt0Var10) {
                    rt0Var10.removeView(pr0Var);
                }
            }
            int i33 = rt0VarArr2[z4 ? 1 : 0].C;
            if (i33 != 0 && i33 != 11 && !p0(i33) && (i17 = rt0VarArr2[z4 ? 1 : 0].C) != 2 && i17 != 5 && i17 != 6 && ((i17 != 7 || kt0Var.T()) && (i18 = rt0VarArr2[z4 ? 1 : 0].C) != 10 && i18 != 13 && i18 != 14)) {
                if (z4) {
                    if (w0Var != null && w0Var.getVisibility() == 4 && !this.D.f21546k0) {
                        if (D()) {
                            this.f34007u0 = 1;
                            w0Var.setVisibility(0);
                        } else {
                            if (v0()) {
                                i20 = 8;
                            } else {
                                i20 = 4;
                            }
                            w0Var.setVisibility(i20);
                        }
                        float f14 = z4 ? 1.0f : 0.0f;
                        this.f33988l0 = b0(f14);
                        s1(1.0f - f14);
                        z20 = false;
                    } else {
                        z20 = false;
                        this.f34007u0 = 0;
                        this.f33988l0 = 1.0f;
                    }
                } else {
                    z20 = false;
                    if (w0Var != null) {
                        if (w0Var.getVisibility() == 4) {
                            if (D()) {
                                this.f34007u0 = 0;
                                this.f33988l0 = 1.0f;
                                w0Var.setVisibility(0);
                            } else {
                                if (v0()) {
                                    i19 = 8;
                                } else {
                                    i19 = 4;
                                }
                                w0Var.setVisibility(i19);
                                this.f33988l0 = 0.0f;
                            }
                        }
                        q1(z20);
                    }
                }
                q1(z20);
            } else if (z4) {
                this.f34007u0 = 2;
            } else {
                this.f34007u0 = 0;
                if (w0Var != null) {
                    if (!v0() && !this.S0) {
                        i11 = 4;
                    } else {
                        i11 = 8;
                    }
                    w0Var.setVisibility(i11);
                }
            }
            int i34 = rt0VarArr2[z4 ? 1 : 0].C;
            if (i34 == 6) {
                if (!jt0Var.f28201e && !jt0Var.h && jt0Var.d.isEmpty()) {
                    jt0.E(jt0Var, 0L);
                }
            } else if (i34 != 7) {
                if (p0(i34)) {
                    wu0 k13 = k1(rt0VarArr2[z4 ? 1 : 0].C);
                    if (k13 != null) {
                        oh.l6 l6Var = k13.f32857s;
                        k13.P();
                        is0 is0Var = rt0VarArr2[z4 ? 1 : 0].f30852w;
                        if (l6Var != null && (l6Var.k() || (i0() && l6Var.g() > 0))) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        is0Var.e(z16, z4);
                        if (l6Var != null && l6Var.g() > 0 && !t0()) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z15 = z17;
                    } else {
                        z15 = z14;
                    }
                    z14 = z15;
                } else {
                    int i35 = rt0VarArr2[z4 ? 1 : 0].C;
                    if (i35 != 10 && i35 != 11 && i35 != 12 && i35 != 13 && i35 != 14) {
                        if (i35 == 15) {
                            i35 = 8;
                        }
                        ou0 ou0Var6 = ou0VarArr[i35];
                        if (!ou0Var6.f29856g && !ou0Var6.f29857i[0] && ou0Var6.f29851a.isEmpty()) {
                            ou0VarArr[i35].f29856g = true;
                            p0Var2.l();
                            if (i35 == 0) {
                                int i36 = ou0VarArr[0].f29865q;
                                if (i36 == 1) {
                                    i12 = 6;
                                } else if (i36 == 2) {
                                    i12 = 7;
                                }
                                p2Var.getMediaDataController().loadMedia(this.f33979g1, 50, 0, 0, i12, this.C, 1, p2Var.getClassGuid(), ou0VarArr[i12].f29864p, null, null);
                            }
                            i12 = i35;
                            p2Var.getMediaDataController().loadMedia(this.f33979g1, 50, 0, 0, i12, this.C, 1, p2Var.getClassGuid(), ou0VarArr[i12].f29864p, null, null);
                        }
                    }
                }
            }
            int i37 = rt0VarArr2[z4 ? 1 : 0].C;
            if (i37 != 8 && !w0(i37)) {
                rt0 rt0Var11 = rt0VarArr2[z4 ? 1 : 0];
                if (rt0Var11.C == 9) {
                    if (u0()) {
                        rt0VarArr2[z4 ? 1 : 0].f30852w.f25362b.setVisibility(8);
                        rt0VarArr2[z4 ? 1 : 0].f30852w.f25365f.setVisibility(8);
                    } else {
                        rt0VarArr2[z4 ? 1 : 0].f30852w.f25362b.setVisibility(0);
                        rt0VarArr2[z4 ? 1 : 0].f30852w.setStickerType(11);
                        rt0VarArr2[z4 ? 1 : 0].f30852w.f25365f.setVisibility(0);
                        rt0VarArr2[z4 ? 1 : 0].f30852w.f25365f.h(w());
                    }
                    rt0VarArr2[z4 ? 1 : 0].f30852w.d.setText(LocaleController.getString(R.string.NoArchivedStoriesTitle));
                    g90 g90Var = rt0VarArr2[z4 ? 1 : 0].f30852w.f25364e;
                    if (v0()) {
                        str3 = LocaleController.getString(R.string.NoArchivedStoriesSubtitle);
                    } else {
                        str3 = str;
                    }
                    g90Var.setText(str3);
                    rt0VarArr2[z4 ? 1 : 0].f30852w.f25365f.setOnClickListener(new xq0(this, 7));
                } else {
                    rt0Var11.f30852w.f25362b.setVisibility(0);
                    rt0VarArr2[z4 ? 1 : 0].f30852w.setStickerType(1);
                    rt0VarArr2[z4 ? 1 : 0].f30852w.d.setText(LocaleController.getString(R.string.NoResult));
                    rt0VarArr2[z4 ? 1 : 0].f30852w.f25364e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    rt0VarArr2[z4 ? 1 : 0].f30852w.f25365f.setVisibility(8);
                }
            } else {
                rt0 rt0Var12 = rt0VarArr2[z4 ? 1 : 0];
                is0 is0Var2 = rt0Var12.f30852w;
                boolean w02 = w0(rt0Var12.C);
                int h12 = h1(rt0VarArr2[z4 ? 1 : 0].C);
                p9 p9Var = is0Var2.f25362b;
                qh.d dVar = is0Var2.f25365f;
                if (!w02 && !u0() && !r0()) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                p9Var.setVisibility(i13);
                if (w02) {
                    dVar.setVisibility(0);
                    dVar.h(LocaleController.getString(R.string.StoriesAlbumAddToAlbum));
                } else if (u0()) {
                    dVar.setVisibility(8);
                } else {
                    is0Var2.setStickerType(11);
                    if (!t0()) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    dVar.setVisibility(i14);
                    dVar.h(w());
                }
                if (w02) {
                    is0Var2.d.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeTitle));
                    is0Var2.f25364e.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeDescription));
                } else {
                    jh.s sVar = is0Var2.d;
                    if (!t0()) {
                        if (v0()) {
                            i15 = R.string.NoPublicStoriesTitle2;
                        } else {
                            i15 = R.string.NoStoriesTitle;
                        }
                    } else {
                        i15 = R.string.NoHashtagStoriesTitle;
                    }
                    sVar.setText(LocaleController.getString(i15));
                    g90 g90Var2 = is0Var2.f25364e;
                    if (v0()) {
                        str2 = LocaleController.getString(R.string.NoStoriesSubtitle2);
                    } else {
                        str2 = str;
                    }
                    g90Var2.setText(str2);
                }
                dVar.setOnClickListener(new lh.p2(this, w02, h12, 1));
            }
            z18 = false;
            rt0VarArr2[z4 ? 1 : 0].h.setVisibility(0);
            i16 = i23;
            z19 = z14;
            c1Var2 = c1Var4;
        }
        rt0 rt0Var13 = rt0VarArr2[z4 ? 1 : 0];
        rt0Var13.f30845b = z19;
        o1(rt0Var13, z18);
        rt0VarArr2[z4 ? 1 : 0].f30853x.y1(i16);
        rt0VarArr2[z4 ? 1 : 0].h.a0();
        if (c1Var2 != null) {
            rt0VarArr2[z4 ? 1 : 0].h.setRecycledViewPool(c1Var2);
            rt0VarArr2[z4 ? 1 : 0].f30850r.setRecycledViewPool(c1Var2);
        }
        if (this.f34007u0 == 2) {
            org.telegram.ui.ActionBar.k kVar = this.D;
            if (kVar.f21546k0) {
                this.f34012w0 = true;
                kVar.h(true);
                this.f34007u0 = 0;
                this.f33988l0 = 0.0f;
                if (w0Var != null) {
                    if (v0()) {
                        i21 = 8;
                    } else {
                        i21 = 4;
                    }
                    w0Var.setVisibility(i21);
                }
                q1(false);
            }
        }
    }

    public final void n0(ViewGroup viewGroup) {
        rt0[] rt0VarArr;
        for (rt0 rt0Var : this.f33980h0) {
            xr0 xr0Var = rt0Var.h;
            Objects.requireNonNull(xr0Var);
            rt0Var.f30849n = new og.k(xr0Var, viewGroup, new bw(xr0Var, 4));
        }
        pr0 pr0Var = this.S;
        if (pr0Var != null) {
            pr0Var.P = viewGroup;
            pr0Var.O = new lh.n2(pr0Var, 0);
        }
    }

    public final void n1() {
        dt0 dt0Var = this.E;
        if (dt0Var != null) {
            dt0Var.l();
        }
        mu0 mu0Var = this.H;
        if (mu0Var != null) {
            mu0Var.l();
        }
        mu0 mu0Var2 = this.I;
        if (mu0Var2 != null) {
            mu0Var2.l();
        }
        nu0 nu0Var = this.G;
        if (nu0Var != null) {
            nu0Var.X(false);
        }
        mu0 mu0Var3 = this.J;
        if (mu0Var3 != null) {
            mu0Var3.l();
        }
        fu0 fu0Var = this.K;
        if (fu0Var != null) {
            fu0Var.l();
        }
        mt0 mt0Var = this.L;
        if (mt0Var != null) {
            mt0Var.l();
        }
        gt0 gt0Var = this.W;
        if (gt0Var != null) {
            gt0Var.l();
        }
        for (yu0 yu0Var : this.V1.values()) {
            yu0Var.f33581c.l();
        }
    }

    public final void o1(rt0 rt0Var, boolean z4) {
        boolean z10;
        Integer num = 1;
        int i10 = 0;
        if (rt0Var.f30845b && this.d) {
            z10 = true;
        } else {
            z10 = false;
        }
        cl0 fastScroll = rt0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = rt0Var.f30846c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            rt0Var.f30846c.cancel();
        }
        if (!z4) {
            fastScroll.animate().setListener(null).cancel();
            if (!z10) {
                i10 = 8;
            }
            fastScroll.setVisibility(i10);
            if (!z10) {
                num = null;
            }
            fastScroll.setTag(num);
            fastScroll.setAlpha(1.0f);
            fastScroll.setScaleX(1.0f);
            fastScroll.setScaleY(1.0f);
            return;
        }
        Property property = View.ALPHA;
        if (z10 && fastScroll.getTag() == null) {
            fastScroll.animate().setListener(null).cancel();
            if (fastScroll.getVisibility() != 0) {
                fastScroll.setVisibility(0);
                fastScroll.setAlpha(0.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fastScroll, property, fastScroll.getAlpha(), 1.0f);
            rt0Var.f30846c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(num);
        } else if (!z10 && fastScroll.getTag() != null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, property, fastScroll.getAlpha(), 0.0f);
            ofFloat2.addListener(new x20(fastScroll));
            rt0Var.f30846c = ofFloat2;
            ofFloat2.setDuration(150L).start();
            fastScroll.animate().setListener(null).cancel();
            fastScroll.setTag(null);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i10 = 0;
        while (true) {
            rt0[] rt0VarArr = this.f33980h0;
            if (i10 < rt0VarArr.length) {
                xr0 xr0Var = rt0VarArr[i10].h;
                if (xr0Var != null) {
                    xr0Var.getViewTreeObserver().addOnPreDrawListener(new us0(this, i10, 0));
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!J() && !this.F0.E && !onTouchEvent(motionEvent)) {
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
        kt0 kt0Var = this.A1;
        if (kt0Var.f() != null) {
            i12 = kt0Var.f().getHeight();
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
            } else if (childAt instanceof rt0) {
                i13 = i10;
                measureChildWithMargins(childAt, i13, 0, View.MeasureSpec.makeMeasureSpec(i12, 1073741824), 0);
                xr0 xr0Var = ((rt0) childAt).h;
                xr0Var.setPadding(0, xr0Var.V2, 0, xr0Var.W2);
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
        boolean z4;
        boolean z10;
        int i11;
        boolean z11 = false;
        if (!this.I1) {
            org.telegram.ui.ActionBar.p2 p2Var = this.f34004s1;
            if (p2Var.getParentLayout() != null && !((ActionBarLayout) p2Var.getParentLayout()).j() && !J() && !this.f33961a) {
                if (motionEvent != null) {
                    if (this.f34019y1 == null) {
                        this.f34019y1 = VelocityTracker.obtain();
                    }
                    this.f34019y1.addMovement(motionEvent);
                    m40 m40Var = this.B1;
                    if (m40Var != null) {
                        m40Var.b(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.f34008u1 && !this.f34010v1 && motionEvent.getY() >= AndroidUtilities.dp(90.0f)) {
                    this.f34006t1 = motionEvent.getPointerId(0);
                    this.f34010v1 = true;
                    this.f34013w1 = (int) motionEvent.getX();
                    this.f34016x1 = (int) motionEvent.getY();
                    this.f34019y1.clear();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f34006t1) {
                    int x10 = (int) (motionEvent.getX() - this.f34013w1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.f34016x1);
                    boolean z12 = this.f34008u1;
                    rt0[] rt0VarArr = this.f33980h0;
                    if (z12 && (((z4 = this.f33974e1) && x10 > 0) || (!z4 && x10 < 0))) {
                        if (x10 < 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!U0(motionEvent, z10)) {
                            this.f34010v1 = true;
                            this.f34008u1 = false;
                            N0(false);
                            rt0VarArr[0].setTranslationX(0.0f);
                            rt0 rt0Var = rt0VarArr[1];
                            if (this.f33974e1) {
                                i11 = rt0VarArr[0].getMeasuredWidth();
                            } else {
                                i11 = -rt0VarArr[0].getMeasuredWidth();
                            }
                            rt0Var.setTranslationX(i11);
                            Z0(0.0f, rt0VarArr[1].C);
                            M0(getTabProgress());
                        }
                    }
                    if (this.f34010v1 && !this.f34008u1) {
                        if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                            if (x10 < 0) {
                                z11 = true;
                            }
                            U0(motionEvent, z11);
                        }
                    } else if (this.f34008u1) {
                        rt0VarArr[0].setTranslationX(x10);
                        if (this.f33974e1) {
                            rt0VarArr[1].setTranslationX(rt0VarArr[0].getMeasuredWidth() + x10);
                        } else {
                            rt0VarArr[1].setTranslationX(x10 - rt0VarArr[0].getMeasuredWidth());
                        }
                        float abs2 = Math.abs(x10) / rt0VarArr[0].getMeasuredWidth();
                        if (!D()) {
                            this.f33988l0 = 0.0f;
                        } else {
                            this.f33988l0 = b0(abs2);
                            s1(abs2);
                            float a02 = a0(abs2);
                            this.m0 = a02;
                            if (a02 != 0.0f && D() && !q0()) {
                                i10 = 0;
                            } else {
                                i10 = 4;
                            }
                            this.f33993o0.setVisibility(i10);
                        }
                        q1(false);
                        Z0(abs2, rt0VarArr[1].C);
                        M0(getTabProgress());
                        L0();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f34006t1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    g1(motionEvent);
                }
                return this.f34008u1;
            }
        }
        return false;
    }

    public final void p1() {
        boolean z4;
        float f10;
        org.telegram.ui.ActionBar.w0 w0Var = this.f33997q0;
        if (w0Var != null) {
            if (!this.f34004s1.getMessagesController().isPeerNoForwards(this.f33979g1) && !j0()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4) {
                f10 = 0.5f;
            } else {
                f10 = 1.0f;
            }
            w0Var.setAlpha(f10);
            if (z4 && w0Var.getBackground() != null) {
                w0Var.setBackground(null);
            } else if (!z4 && w0Var.getBackground() == null) {
                w0Var.setBackground(org.telegram.ui.ActionBar.k6.f0(h0(org.telegram.ui.ActionBar.k6.f22055z8), 5, -1));
            }
        }
    }

    public boolean q0() {
        return false;
    }

    public final void q1(boolean z4) {
        pr0 pr0Var;
        tr0 tr0Var;
        lj0 lj0Var = this.f33995p0;
        if (lj0Var == null) {
            return;
        }
        float f10 = 0.0f;
        if (!this.S0 && (((pr0Var = this.S) == null || !pr0Var.g()) && ((tr0Var = this.T) == null || !tr0Var.f38934w))) {
            f10 = Utilities.clamp(this.f33988l0 + this.m0, 1.0f, 0.0f);
        }
        lj0Var.setAlpha(f10);
        boolean z10 = false;
        if (z4) {
            if (a0(1.0f) > 0.5f) {
                z10 = true;
            }
            A(z10, true);
        } else if (this.f34007u0 == 2) {
            if (this.m0 > 0.1f) {
                z10 = true;
            }
            A(z10, true);
        } else {
            if (this.f33988l0 < 0.1f) {
                z10 = true;
            }
            A(z10, true);
        }
    }

    public final boolean r0() {
        TLRPC.User user;
        long j10 = this.f33979g1;
        if (j10 <= 0 || (user = MessagesController.getInstance(this.f34004s1.getCurrentAccount()).getUser(Long.valueOf(j10))) == null || !user.bot) {
            return false;
        }
        return true;
    }

    public final void r1(boolean z4) {
        int i10 = 0;
        while (true) {
            rt0[] rt0VarArr = this.f33980h0;
            if (i10 < rt0VarArr.length) {
                int childCount = rt0VarArr[i10].h.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = rt0VarArr[i10].h.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.i7) {
                        ((org.telegram.ui.Cells.i7) childAt).b(false, z4);
                    } else if (childAt instanceof org.telegram.ui.Cells.r7) {
                        ((org.telegram.ui.Cells.r7) childAt).i(false, z4);
                    } else if (childAt instanceof org.telegram.ui.Cells.l7) {
                        ((org.telegram.ui.Cells.l7) childAt).f(false, z4);
                    } else if (childAt instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) childAt).e(false, z4);
                    } else if (childAt instanceof org.telegram.ui.Cells.e2) {
                        ((org.telegram.ui.Cells.e2) childAt).c(false, z4);
                    } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                        ((org.telegram.ui.Cells.r2) childAt).V(false, z4);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final boolean s0(int i10) {
        if (i10 == 7) {
            return this.A1.T();
        }
        if (!t0() && i10 != 0 && !p0(i10) && i10 != 2 && i10 != 5 && i10 != 6 && i10 != 11 && i10 != 10 && i10 != 13 && i10 != 14) {
            return true;
        }
        return false;
    }

    public final void s1(float f10) {
        org.telegram.ui.ActionBar.w0 w0Var = this.f33984j0;
        if (w0Var == null) {
            return;
        }
        rt0[] rt0VarArr = this.f33980h0;
        rt0 rt0Var = rt0VarArr[1];
        float f11 = 0.0f;
        if (rt0Var != null && rt0Var.C == 11) {
            f11 = 0.0f + f10;
        }
        int i10 = 0;
        rt0 rt0Var2 = rt0VarArr[0];
        if (rt0Var2 != null && rt0Var2.C == 11) {
            f11 += 1.0f - f10;
        }
        w0Var.setAlpha(f11);
        float f12 = (0.15f * f11) + 0.85f;
        w0Var.setScaleX(f12);
        w0Var.setScaleY(f12);
        if (f11 <= 0.01f) {
            i10 = 8;
        }
        w0Var.setVisibility(i10);
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        boolean z4;
        int i10;
        TLRPC.ChatFull chatFull2 = this.f33963a1;
        if (chatFull2 != null && chatFull2.stories_pinned_available) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f33963a1 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.Z0 == 0) {
                this.Z0 = -j10;
                int i11 = 0;
                while (true) {
                    ou0[] ou0VarArr = this.f33998q1;
                    if (i11 >= ou0VarArr.length) {
                        break;
                    }
                    if (ou0VarArr[i11].f29852b[1].size() == 0) {
                        ou0 ou0Var = ou0VarArr[i11];
                        ou0Var.f29858j[1] = this.f33963a1.migrated_from_max_id;
                        ou0Var.f29857i[1] = false;
                    }
                    i11++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.f33963a1;
        if (chatFull3 != null && z4 != chatFull3.stories_pinned_available) {
            os0 os0Var = this.F0;
            if (os0Var != null) {
                if (q0()) {
                    i10 = 9;
                } else {
                    i10 = 8;
                }
                os0Var.setInitialTabId(i10);
            }
            v1(true);
            m1(false);
        }
    }

    public void setCommonGroupsCount(int i10) {
        if (this.C == 0) {
            this.U0[6] = i10;
        }
        v1(true);
        F();
    }

    public void setForwardRestrictedHint(m40 m40Var) {
        this.B1 = m40Var;
    }

    public void setMergeDialogId(long j10) {
        this.Z0 = j10;
    }

    public void setNewMediaCounts(int[] iArr) {
        int[] iArr2;
        int i10 = 0;
        while (true) {
            iArr2 = this.U0;
            if (i10 > 6 || iArr2[i10] >= 0) {
                break;
            }
            i10++;
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
        this.H1 = i11;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            rt0[] rt0VarArr = this.f33980h0;
            if (i15 >= rt0VarArr.length) {
                break;
            }
            rt0VarArr[i15].setTranslationY(this.H1);
            i15++;
        }
        if (this.M0 != null) {
            K();
        } else {
            ks0 ks0Var = this.O0;
            if (ks0Var != null) {
                ks0Var.setTranslationY(AndroidUtilities.dp(48.0f) + i11);
            }
        }
        this.L0 = i11;
        org.telegram.ui.Cells.v0 v0Var = this.H0;
        if (v0Var.getTag() == null) {
            i14 = -AndroidUtilities.dp(48.0f);
        }
        v0Var.setTranslationY(i14 + this.L0);
    }

    public void setPagesPaddingBottom(int i10) {
        if (this.U1 != i10) {
            this.U1 = i10;
            rt0[] rt0VarArr = this.f33980h0;
            if (rt0VarArr != null) {
                for (rt0 rt0Var : rt0VarArr) {
                    if (rt0Var != null) {
                        xr0 xr0Var = rt0Var.h;
                        int paddingLeft = xr0Var.getPaddingLeft();
                        xr0 xr0Var2 = rt0Var.h;
                        int i11 = xr0Var2.V2;
                        int paddingRight = xr0Var2.getPaddingRight();
                        xr0 xr0Var3 = rt0Var.h;
                        int Y = Y(v0());
                        xr0Var3.f30478b3 = Y;
                        xr0Var.setPadding(paddingLeft, i11, paddingRight, Y);
                    }
                }
            }
        }
    }

    public void setPinnedToTop(boolean z4) {
        if (this.d != z4) {
            this.d = z4;
            int i10 = 0;
            while (true) {
                rt0[] rt0VarArr = this.f33980h0;
                if (i10 < rt0VarArr.length) {
                    o1(rt0VarArr[i10], true);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        boolean z4;
        TLRPC.UserFull userFull2 = this.f33966b1;
        if (userFull2 != null && userFull2.stories_pinned_available) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f33966b1 = userFull;
        v1(true);
        if (userFull != null && z4 != userFull.stories_pinned_available) {
            Y0(8);
        }
    }

    public void setVisibleHeight(int i10) {
        float f10;
        this.J1 = i10;
        int i11 = 0;
        while (true) {
            rt0[] rt0VarArr = this.f33980h0;
            if (i11 >= rt0VarArr.length) {
                break;
            }
            int measuredHeight = getMeasuredHeight();
            if (rt0VarArr[i11].C == 8) {
                f10 = 280.0f;
            } else {
                f10 = 120.0f;
            }
            float f11 = (-(measuredHeight - Math.max(i10, AndroidUtilities.dp(f10)))) / 2.0f;
            rt0VarArr[i11].f30852w.setTranslationY(f11);
            rt0VarArr[i11].v.setTranslationY(-f11);
            i11++;
        }
        or0 or0Var = this.R;
        if (or0Var != null) {
            or0Var.setVisibleHeight(i10);
        }
        pr0 pr0Var = this.S;
        if (pr0Var != null) {
            pr0Var.setVisibleHeight(i10);
        }
    }

    public boolean t0() {
        if (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) {
            return false;
        }
        return true;
    }

    public final void t1() {
        float f10;
        float f11;
        org.telegram.ui.ActionBar.w0 w0Var = this.f33984j0;
        if (w0Var == null) {
            return;
        }
        boolean z4 = true;
        rt0 rt0Var = this.f33980h0[1];
        z4 = (rt0Var == null || rt0Var.C != 11) ? false : false;
        if (z4) {
            w0Var.setVisibility(0);
        }
        ViewPropertyAnimator animate = w0Var.animate();
        float f12 = 1.0f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f10);
        if (z4) {
            f11 = 1.0f;
        } else {
            f11 = 0.85f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f11);
        if (!z4) {
            f12 = 0.85f;
        }
        scaleX.scaleY(f12).withEndAction(new kh.f(26, this, z4)).setDuration(420L).setInterpolator(pr.h).start();
    }

    public boolean u0() {
        return false;
    }

    public final void u1() {
        boolean z4;
        int i10;
        oh.l6 l6Var;
        boolean r02 = r0();
        org.telegram.ui.ActionBar.w0 w0Var = this.f34005t0;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f34003s0;
        int i11 = 8;
        if (r02) {
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
                SparseArray[] sparseArrayArr = this.W0;
                if (i12 < sparseArrayArr[0].size()) {
                    MessageObject messageObject = (MessageObject) sparseArrayArr[0].valueAt(i12);
                    gt0 gt0Var = this.W;
                    if (gt0Var != null && (l6Var = gt0Var.f32857s) != null && !l6Var.m(messageObject.getId())) {
                        z4 = true;
                        break;
                    }
                    i12++;
                } else {
                    z4 = false;
                    break;
                }
            }
            if (w0Var2 != null) {
                if (z4) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                w0Var2.setVisibility(i10);
            }
            if (w0Var != null) {
                if (!z4) {
                    i11 = 0;
                }
                w0Var.setVisibility(i11);
            }
        } else if (w0(getClosestTab())) {
            if (w0Var2 != null) {
                w0Var2.setVisibility(8);
            }
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
        }
    }

    public boolean v0() {
        return false;
    }

    public void v1(boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zu0.v1(boolean):void");
    }

    public final SpannableStringBuilder w() {
        if (this.T1 == null) {
            this.T1 = new SpannableStringBuilder();
            if (r0()) {
                this.T1.append((CharSequence) LocaleController.getString(R.string.ProfileBotPreviewEmptyButton));
            } else {
                this.T1.append((CharSequence) "c");
                this.T1.setSpan(new oq(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.T1.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
            }
        }
        return this.T1;
    }

    public final Boolean w1(View view, View view2) {
        if (!this.l1) {
            rt0[] rt0VarArr = this.f33980h0;
            boolean z4 = false;
            rt0 rt0Var = rt0VarArr[0];
            if (rt0Var != null) {
                int i10 = rt0Var.C;
                this.f33989m1 = i10;
                boolean p02 = p0(i10);
                int[] iArr = this.f33985j1;
                int X = X(p02 ? 1 : 0, iArr[p02 ? 1 : 0], true);
                if (view != null && X == X(p02 ? 1 : 0, X, true)) {
                    view.setEnabled(false);
                    view.animate().alpha(0.5f).start();
                }
                if (iArr[p02 ? 1 : 0] != X) {
                    if (view2 != null && !view2.isEnabled()) {
                        view2.setEnabled(true);
                        view2.animate().alpha(1.0f).start();
                    }
                    if (!p02) {
                        SharedConfig.setMediaColumnsCount(X);
                    } else if (c0(rt0VarArr[0].C) >= 5 || w0(rt0VarArr[0].C)) {
                        SharedConfig.setStoriesColumnsCount(X);
                    }
                    B(X);
                }
                if (X != X(p02 ? 1 : 0, X, true)) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            }
            return null;
        }
        return null;
    }

    public final void x(q70 q70Var, org.telegram.ui.ActionBar.p2 p2Var, long j10, int i10) {
        String publicUsername;
        if (j10 > 0) {
            publicUsername = UserObject.getPublicUsername(MessagesController.getInstance(p2Var.getCurrentAccount()).getUser(Long.valueOf(j10)));
        } else {
            publicUsername = ChatObject.getPublicUsername(MessagesController.getInstance(p2Var.getCurrentAccount()).getChat(Long.valueOf(-j10)));
        }
        if (publicUsername == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("https://");
        org.telegram.ui.yh.w(sb, MessagesController.getInstance(p2Var.getCurrentAccount()).linkPrefix, "/", publicUsername, "/a/");
        sb.append(i10);
        q70Var.c(R.drawable.media_share, LocaleController.getString(R.string.StoriesAlbumMenuShareLink), new jp(this, sb.toString(), p2Var, 17), false);
    }

    public final boolean x0() {
        if (!C() || ((getClosestTab() != 8 && getClosestTab() != 13 && !w0(getClosestTab())) || !this.f34021z1)) {
            pr0 pr0Var = this.S;
            if (pr0Var == null || !pr0Var.g()) {
                tr0 tr0Var = this.T;
                if ((tr0Var == null || !tr0Var.f38934w) && !this.l1 && !this.f33971d1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final Boolean x1(View view, View view2) {
        if (!this.l1) {
            rt0[] rt0VarArr = this.f33980h0;
            boolean z4 = false;
            rt0 rt0Var = rt0VarArr[0];
            if (rt0Var != null) {
                if (!this.f33981h1 || !p0(rt0Var.C)) {
                    int i10 = rt0VarArr[0].C;
                    this.f33989m1 = i10;
                    boolean p02 = p0(i10);
                    int[] iArr = this.f33985j1;
                    int X = X(p02 ? 1 : 0, iArr[p02 ? 1 : 0], false);
                    if (view2 != null && X == X(p02 ? 1 : 0, X, false)) {
                        view2.setEnabled(false);
                        view2.animate().alpha(0.5f).start();
                    }
                    if (iArr[p02 ? 1 : 0] != X) {
                        if (view != null && !view.isEnabled()) {
                            view.setEnabled(true);
                            view.animate().alpha(1.0f).start();
                        }
                        if (!p02) {
                            SharedConfig.setMediaColumnsCount(X);
                        } else if (c0(rt0VarArr[0].C) >= 5 || w0(rt0VarArr[0].C)) {
                            SharedConfig.setStoriesColumnsCount(X);
                        }
                        B(X);
                    }
                    if (X != X(p02 ? 1 : 0, X, false)) {
                        z4 = true;
                    }
                    return Boolean.valueOf(z4);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void y(org.telegram.ui.Components.q70 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zu0.y(org.telegram.ui.Components.q70):void");
    }

    public final void y0(int i10, int i11, int i12, boolean z4) {
        ou0[] ou0VarArr = this.f33998q1;
        ou0VarArr[i10].f29851a.clear();
        ou0VarArr[i10].f29852b[0].clear();
        ou0VarArr[i10].f29852b[1].clear();
        ou0 ou0Var = ou0VarArr[i10];
        ou0Var.f29858j[0] = i11;
        ou0Var.f29857i[0] = false;
        ou0Var.f29860l = false;
        ou0Var.f29861m = i12;
        ou0Var.f29862n = (ou0Var.e() - i12) - 1;
        ou0 ou0Var2 = ou0VarArr[i10];
        if (ou0Var2.f29862n < 0) {
            ou0Var2.f29862n = 0;
        }
        ou0Var2.f29859k = i11;
        ou0Var2.f29863o = true;
        ou0Var2.f29856g = false;
        ou0Var2.f29864p++;
        rt0 W = W(i10);
        if (W != null && W.h.getAdapter() != null) {
            W.h.getAdapter().l();
        }
        if (z4) {
            int i13 = 0;
            while (true) {
                rt0[] rt0VarArr = this.f33980h0;
                if (i13 < rt0VarArr.length) {
                    rt0 rt0Var = rt0VarArr[i13];
                    if (rt0Var.C == i10) {
                        rt0Var.f30853x.h1(Math.min(ou0VarArr[i10].e() - 1, ou0VarArr[i10].f29861m), 0);
                    }
                    i13++;
                } else {
                    return;
                }
            }
        }
    }

    public final void z(qt0 qt0Var, int i10, SparseBooleanArray sparseBooleanArray) {
        int childCount = qt0Var.getChildCount();
        u00 u00Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = qt0Var.getChildAt(i11);
            if (childAt instanceof u00) {
                u00Var = childAt;
            }
        }
        if (u00Var != null) {
            qt0Var.removeView(u00Var);
        }
        getViewTreeObserver().addOnPreDrawListener(new ts0(this, qt0Var, sparseBooleanArray, u00Var, i10));
    }

    public final void z0(boolean z4) {
        long j10 = this.C;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0 && !t0()) {
            for (int i11 = 0; i11 < 4; i11++) {
                final int i12 = a2[i11];
                ou0[] ou0VarArr = this.f33998q1;
                if (!ou0VarArr[i12].h || z4) {
                    long j11 = this.f33979g1;
                    if (!DialogObject.isEncryptedDialog(j11)) {
                        ou0VarArr[i12].h = false;
                        TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
                        if (i12 == 0) {
                            int i13 = ou0VarArr[i12].f29865q;
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
                        org.telegram.ui.ActionBar.p2 p2Var = this.f34004s1;
                        tL_messages_getSearchResultsPositions.peer = p2Var.getMessagesController().getInputPeer(j11);
                        if (i10 != 0 && p2Var.getUserConfig().getClientUserId() == j11) {
                            tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                            tL_messages_getSearchResultsPositions.saved_peer_id = p2Var.getMessagesController().getInputPeer(j10);
                        }
                        final int i14 = ou0VarArr[i12].f29864p;
                        ConnectionsManager.getInstance(p2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(p2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new br0(zu0.this, tL_error, i14, i12, tLObject, 0));
                            }
                        }), p2Var.getClassGuid());
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void D0(SparseArray sparseArray) {
    }

    public void E0() {
    }

    public void K0(boolean z4) {
    }

    public void N0(boolean z4) {
    }

    public int V0(int i10) {
        return i10;
    }

    @Override
    public final void a(org.telegram.ui.Cells.r2 r2Var) {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void d(org.telegram.ui.Cells.r2 r2Var) {
    }

    @Override
    public final void f(org.telegram.ui.Cells.r2 r2Var) {
    }

    public void o0() {
    }
}
