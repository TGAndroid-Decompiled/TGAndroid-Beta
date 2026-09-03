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
public abstract class yu0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Cells.n2 {
    public static final int[] a2 = {0, 1, 2, 4};
    public static final kr0 f33605b2 = new kr0(0);
    public final org.telegram.ui.ActionBar.i2 A0;
    public final jt0 A1;
    public final int B;
    public final ArrayList B0;
    public m40 B1;
    public final long C;
    public final ArrayList C0;
    public final org.telegram.ui.ActionBar.g6 C1;
    public final org.telegram.ui.ActionBar.k D;
    public final ArrayList D0;
    public final NotificationCenter.ObserversGroup D1;
    public final ct0 E;
    public final ArrayList E0;
    public boolean E1;
    public final su0 F;
    public final ns0 F0;
    public final AnimationNotificationsLocker F1;
    public final mu0 G;
    public final ks0 G0;
    public gy G1;
    public final lu0 H;
    public final org.telegram.ui.Cells.v0 H0;
    public int H1;
    public final lu0 I;
    public AnimatorSet I0;
    public boolean I1;
    public final lu0 J;
    public final uq0 J0;
    public int J1;
    public final eu0 K;
    public final ArrayList K0;
    public AnimatorSet K1;
    public final lt0 L;
    public float L0;
    public final SparseArray L1;
    public final it0 M;
    public final ls M0;
    public long M1;
    public final gt0 N;
    public final FrameLayout N0;
    public boolean N1;
    public final hu0 O;
    public final js0 O0;
    public int O1;
    public final ju0 P;
    public final int P0;
    public final us0 P1;
    public final dt0 Q;
    public final Paint Q0;
    public oh.l6 Q1;
    public final nr0 R;
    public boolean R0;
    public float R1;
    public final or0 S;
    public boolean S0;
    public boolean S1;
    public final sr0 T;
    public ng.q0 T0;
    public SpannableStringBuilder T1;
    public final ht0 U;
    public final int[] U0;
    public int U1;
    public final f2.f0 V;
    public int V0;
    public final HashMap V1;
    public final ft0 W;
    public final SparseArray[] W0;
    public final HashMap W1;
    public int X0;
    public int X1;
    public boolean Y0;
    public int Y1;
    public long Z0;
    public final ah Z1;
    public boolean f33606a;
    public final vu0 f33607a0;
    public TLRPC.ChatFull f33608a1;
    public boolean f33609b;
    public final mr0 f33610b0;
    public TLRPC.UserFull f33611b1;
    public boolean f33612c;
    public final vu0 f33613c0;
    public AnimatorSet f33614c1;
    public boolean d;
    public final tt0 f33615d0;
    public boolean f33616d1;
    public int f33617e;
    public final tt0 f33618e0;
    public boolean f33619e1;
    public int f33620f;
    public final tt0 f33621f0;
    public boolean f33622f1;
    public final ot0 f33623g0;
    public final long f33624g1;
    public float h;
    public final qt0[] f33625h0;
    public boolean f33626h1;
    public final org.telegram.ui.ActionBar.w0 f33627i0;
    public boolean f33628i1;
    public final org.telegram.ui.ActionBar.w0 f33629j0;
    public final int[] f33630j1;
    public final org.telegram.ui.ActionBar.w0 f33631k0;
    public float f33632k1;
    public float f33633l0;
    public boolean l1;
    public float m0;
    public int f33634m1;
    public float f33635n;
    public final TextView f33636n0;
    public int f33637n1;
    public final ImageView f33638o0;
    public final xr0 f33639o1;
    public final kj0 f33640p0;
    public float f33641p1;
    public final org.telegram.ui.ActionBar.w0 f33642q0;
    public final nu0[] f33643q1;
    public boolean f33644r;
    public final org.telegram.ui.ActionBar.w0 f33645r0;
    public final qu0 f33646r1;
    public int f33647s;
    public final org.telegram.ui.ActionBar.w0 f33648s0;
    public final org.telegram.ui.ActionBar.p2 f33649s1;
    public final org.telegram.ui.ActionBar.w0 f33650t0;
    public int f33651t1;
    public int f33652u0;
    public boolean f33653u1;
    public int v;
    public final Drawable f33654v0;
    public boolean f33655v1;
    public int f33656w;
    public boolean f33657w0;
    public int f33658w1;
    public final Rect f33659x;
    public final NumberTextView f33660x0;
    public int f33661x1;
    public final u00 f33662y;
    public final z9 f33663y0;
    public VelocityTracker f33664y1;
    public final ImageView f33665z0;
    public boolean f33666z1;

    public yu0(android.content.Context r40, long r41, org.telegram.ui.Components.qu0 r43, int r44, java.util.ArrayList r45, org.telegram.tgnet.TLRPC.ChatFull r46, org.telegram.tgnet.TLRPC.UserFull r47, int r48, int r49, org.telegram.ui.ActionBar.p2 r50, org.telegram.ui.Components.jt0 r51, int r52, org.telegram.ui.ActionBar.g6 r53, og.a r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yu0.<init>(android.content.Context, long, org.telegram.ui.Components.qu0, int, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.tgnet.TLRPC$UserFull, int, int, org.telegram.ui.ActionBar.p2, org.telegram.ui.Components.jt0, int, org.telegram.ui.ActionBar.g6, og.a):void");
    }

    public static kt0 M(int i10, long j10, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        kt0 kt0Var = new kt0(context, g6Var);
        TextView textView = kt0Var.f28495a;
        if (i10 == 0) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoMediaSecret));
                return kt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoMedia));
            return kt0Var;
        } else if (i10 == 1) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedFilesSecret));
                return kt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedFiles));
            return kt0Var;
        } else if (i10 == 2) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedVoiceSecret));
                return kt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedVoice));
            return kt0Var;
        } else if (i10 == 3) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedLinksSecret));
                return kt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedLinks));
            return kt0Var;
        } else if (i10 == 4) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedAudioSecret));
                return kt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedAudio));
            return kt0Var;
        } else if (i10 == 5) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedGifSecret));
                return kt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoGIFs));
            return kt0Var;
        } else {
            ImageView imageView = kt0Var.f28496b;
            if (i10 == 6) {
                imageView.setImageDrawable(null);
                textView.setText(LocaleController.getString(R.string.NoGroupsInCommon));
                return kt0Var;
            }
            if (i10 == 7) {
                imageView.setImageDrawable(null);
                textView.setText("");
            }
            return kt0Var;
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

    public static void g(yu0 yu0Var, int i10, TL_stories.StoryItem storyItem, String str) {
        gy gyVar = new gy(yu0Var, i10, storyItem, 8);
        oh.t6 storiesController = yu0Var.getStoriesController();
        long j10 = yu0Var.f33624g1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.c0(i10, j10, arrayList);
        qc.a0(yu0Var.f33649s1).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", 1, str)), LocaleController.getString(R.string.UndoNoCaps), gyVar).j();
    }

    public oh.t6 getStoriesController() {
        return MessagesController.getInstance(this.f33649s1.getCurrentAccount()).getStoriesController();
    }

    public static void h(yu0 yu0Var, TL_stories.StoryItem storyItem) {
        yu0Var.getStoriesController().o0(yu0Var.f33624g1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        qc.a0(yu0Var.f33649s1).G(R.raw.chats_archived, 5000, LocaleController.formatPluralString("StoryArchived", 1, new Object[0])).j();
    }

    public static void i(yu0 yu0Var, long j10, int i10, String str) {
        oh.h6 B = yu0Var.getStoriesController().B(j10, true);
        int i11 = B.f17186a;
        int c3 = B.c(i10);
        if (c3 == -1) {
            return;
        }
        ((oh.m6) B.h.get(c3)).f17442b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f17187b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public static void j(yu0 yu0Var, TL_stories.StoryItem storyItem, oh.m6 m6Var) {
        yu0Var.getStoriesController().c(m6Var.f17441a, yu0Var.f33624g1, storyItem);
        AndroidUtilities.runOnUIThread(new b90(17, yu0Var, m6Var), 100L);
    }

    public static void k(int i10, TL_stories.StoryItem storyItem, yu0 yu0Var) {
        yu0Var.getStoriesController().c(i10, yu0Var.f33624g1, storyItem);
    }

    public static void m(yu0 yu0Var, HashSet hashSet, TL_stories.StoryItem storyItem, q70 q70Var, oh.m6 m6Var) {
        String formatString;
        long j10 = yu0Var.f33624g1;
        if (hashSet.contains(Integer.valueOf(m6Var.f17441a))) {
            yu0Var.getStoriesController().c(m6Var.f17441a, j10, storyItem);
            formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, m6Var.f17442b);
        } else {
            oh.t6 storiesController = yu0Var.getStoriesController();
            int i10 = m6Var.f17441a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.c0(i10, j10, arrayList);
            formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, m6Var.f17442b);
        }
        qc.a0(yu0Var.f33649s1).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
        q70Var.u();
    }

    public static void n(yu0 yu0Var, long j10, int i10) {
        oh.h6 B = yu0Var.getStoriesController().B(j10, true);
        int i11 = B.f17186a;
        int c3 = B.c(i10);
        if (c3 == -1) {
            return;
        }
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f17187b);
        tL_deleteAlbum.album_id = ((oh.m6) B.h.remove(c3)).f17441a;
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

    public static void q(qt0 qt0Var, nu0[] nu0VarArr, boolean z4) {
        b90 b90Var;
        if (z4) {
            if (SharedConfig.fastScrollHintCount > 0 && qt0Var.D == null && !qt0Var.F && qt0Var.h.getFastScroll() != null && qt0Var.h.getFastScroll().U && qt0Var.h.getFastScroll().getVisibility() == 0 && nu0VarArr[0].e() >= 50) {
                SharedConfig.setFastScrollHintCount(SharedConfig.fastScrollHintCount - 1);
                qt0Var.F = true;
                Context context = qt0Var.getContext();
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                textView.setText(LocaleController.getString(R.string.SharedMediaFastScrollHint));
                textView.setTextSize(1, 14.0f);
                textView.setMaxLines(3);
                int i10 = org.telegram.ui.ActionBar.k6.f21886pf;
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
                frameLayout.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21904qf, false)));
                frameLayout.addView(textView, k7.c6.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
                ?? view = new View(context);
                view.f30870a = new Random();
                Paint paint = new Paint(1);
                view.f30871b = paint;
                Paint paint2 = new Paint(1);
                view.f30872c = paint2;
                view.f30874f = 1.0f;
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
                view.f30873e = paint4;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                paint4.setXfermode(new PorterDuffXfermode(mode));
                frameLayout.addView(view, k7.c6.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                qt0Var.D = frameLayout;
                qt0Var.addView((View) frameLayout, k7.c6.c(-2.0f, -2));
                qt0Var.D.setAlpha(0.0f);
                qt0Var.D.setScaleX(0.8f);
                qt0Var.D.setScaleY(0.8f);
                qt0Var.D.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                qt0Var.invalidate();
                b90 b90Var2 = new b90(16, qt0Var, frameLayout);
                qt0Var.E = b90Var2;
                AndroidUtilities.runOnUIThread(b90Var2, 4000L);
            }
        } else if (qt0Var.D != null && (b90Var = qt0Var.E) != null) {
            AndroidUtilities.cancelRunOnUIThread(b90Var);
            qt0Var.E.run();
            qt0Var.E = null;
            qt0Var.D = null;
        }
    }

    public static void s(org.telegram.ui.Components.yu0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yu0.s(org.telegram.ui.Components.yu0):void");
    }

    public static void t(yu0 yu0Var, int i10, boolean z4) {
        qt0[] qt0VarArr = yu0Var.f33625h0;
        if (qt0VarArr[0].C == i10) {
            return;
        }
        qt0 qt0Var = qt0VarArr[1];
        qt0Var.C = i10;
        qt0Var.setVisibility(0);
        yu0Var.k0();
        yu0Var.m1(true);
        yu0Var.f33619e1 = z4;
        yu0Var.L0();
        yu0Var.A(!yu0Var.s0(i10), true);
        yu0Var.q1(true);
    }

    public static int u(yu0 yu0Var, f2.p0 p0Var) {
        if (p0Var == yu0Var.W) {
            return 8;
        }
        if (p0Var == yu0Var.f33610b0) {
            return 9;
        }
        for (xu0 xu0Var : yu0Var.V1.values()) {
            if (xu0Var.f33179c == p0Var) {
                return xu0Var.f33177a;
            }
        }
        return -1;
    }

    public static int v(yu0 yu0Var, f2.p0 p0Var) {
        if (p0Var == yu0Var.f33607a0) {
            return 8;
        }
        if (p0Var == yu0Var.f33613c0) {
            return 9;
        }
        for (xu0 xu0Var : yu0Var.V1.values()) {
            if (xu0Var.d == p0Var) {
                return xu0Var.f33177a;
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
        kj0 kj0Var = this.f33640p0;
        if (kj0Var != null && this.S1 != z4) {
            this.S1 = z4;
            if (!z4 && kj0Var.getAnimatedDrawable().Y < 20) {
                kj0Var.getAnimatedDrawable().N(0);
            } else {
                hj0 animatedDrawable = kj0Var.getAnimatedDrawable();
                if (this.S1) {
                    i10 = 50;
                } else {
                    i10 = 100;
                }
                animatedDrawable.N(i10);
            }
            if (z10) {
                kj0Var.getAnimatedDrawable().start();
            } else {
                kj0Var.getAnimatedDrawable().K(kj0Var.getAnimatedDrawable().f27526f);
            }
        }
    }

    public final void A0(int i10) {
        int i11;
        nu0[] nu0VarArr = this.f33643q1;
        if (i10 == 0) {
            int i12 = nu0VarArr[0].f29594q;
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
        nu0VarArr[i10].f29585g = true;
        org.telegram.ui.ActionBar.p2 p2Var = this.f33649s1;
        p2Var.getMediaDataController().loadMedia(this.f33624g1, 50, 0, nu0VarArr[i10].f29588k, i11, this.C, 1, p2Var.getClassGuid(), nu0VarArr[i10].f29593p, null, null);
    }

    public final void B(int i10) {
        int i11;
        qt0 W = W(this.f33634m1);
        this.f33647s = -1;
        if (W != null) {
            W.h.B0();
            this.f33637n1 = i10;
            W.f30522r.setVisibility(0);
            if (p0(this.f33634m1)) {
                W.f30522r.setAdapter(l1(this.f33634m1));
            } else {
                W.f30522r.setAdapter(this.F);
            }
            pt0 pt0Var = W.f30522r;
            int paddingLeft = pt0Var.getPaddingLeft();
            pt0 pt0Var2 = W.f30522r;
            int Z = Z(W.C);
            pt0Var2.f30186a3 = Z;
            int paddingRight = W.f30522r.getPaddingRight();
            pt0 pt0Var3 = W.f30522r;
            int Y = Y(v0());
            pt0Var3.f30187b3 = Y;
            pt0Var.setPadding(paddingLeft, Z, paddingRight, Y);
            W.f30523s.y1(i10);
            W.f30522r.a0();
            int i12 = 0;
            while (true) {
                qt0[] qt0VarArr = this.f33625h0;
                if (i12 >= qt0VarArr.length) {
                    break;
                }
                qt0 qt0Var = qt0VarArr[i12];
                if (qt0Var != null && ((i11 = qt0Var.C) == 0 || p0(i11))) {
                    AndroidUtilities.updateVisibleRows(qt0VarArr[i12].h);
                }
                i12++;
            }
            this.l1 = true;
            if (this.f33634m1 == 0) {
                this.f33643q1[0].g(true);
            }
            this.f33632k1 = 0.0f;
            X0();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.F1.lock();
            ofFloat.addUpdateListener(new ms0(this, W, 1));
            ofFloat.addListener(new s20(this, p0(W.C) ? 1 : 0, i10, 1));
            ofFloat.setInterpolator(pr.f30168f);
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
        long j10 = this.f33624g1;
        org.telegram.ui.ActionBar.p2 p2Var = this.f33649s1;
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
        nr0 nr0Var;
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
        hu0 hu0Var = this.O;
        SparseArray[] sparseArrayArr = this.W0;
        org.telegram.ui.ActionBar.p2 p2Var = this.f33649s1;
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
                        if (hu0Var.f27635w.contains(Long.valueOf(j10))) {
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
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
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
                        public final yu0 f25682b;

                        {
                            this.f25682b = this;
                        }

                        @Override
                        public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i17) {
                            switch (r3) {
                                case 0:
                                    yu0 yu0Var = this.f25682b;
                                    org.telegram.ui.ActionBar.p2 p2Var2 = yu0Var.f33649s1;
                                    oh.t6 storiesController = p2Var2.getMessagesController().getStoriesController();
                                    long j11 = yu0Var.f33624g1;
                                    ArrayList arrayList2 = arrayList;
                                    storiesController.s(j11, arrayList2);
                                    qc.a0(p2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList2.size(), new Object[0])).j();
                                    yu0Var.L(false);
                                    return;
                                default:
                                    yu0 yu0Var2 = this.f25682b;
                                    yu0Var2.getClass();
                                    int i18 = 0;
                                    while (true) {
                                        ArrayList arrayList3 = arrayList;
                                        if (i18 < arrayList3.size()) {
                                            yu0Var2.f33649s1.getMessagesController().deleteSavedDialog(((Long) arrayList3.get(i18)).longValue());
                                            i18++;
                                        } else {
                                            yu0Var2.L(true);
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
                        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
                        return;
                    }
                    return;
                }
                long j11 = this.f33624g1;
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
                z4.z(p2Var, user, chat, encryptedChat, null, this.Z0, null, this.W0, null, 0, 0, null, new uq0(this, 1), null, this.C1);
            } else if (sparseArrayArr[0] != null) {
                if (r0() && (nr0Var = this.R) != null && nr0Var.getCurrentList() != null) {
                    oh.d6 currentList = nr0Var.getCurrentList();
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
                        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f21168a;
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
                    org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.f21168a;
                    d2Var3.O = string3;
                    d2Var3.Q = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList3.size(), new Object[0]);
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2(this) {
                        public final yu0 f25682b;

                        {
                            this.f25682b = this;
                        }

                        @Override
                        public final void j(org.telegram.ui.ActionBar.d2 d2Var22, int i172) {
                            switch (r3) {
                                case 0:
                                    yu0 yu0Var = this.f25682b;
                                    org.telegram.ui.ActionBar.p2 p2Var2 = yu0Var.f33649s1;
                                    oh.t6 storiesController = p2Var2.getMessagesController().getStoriesController();
                                    long j112 = yu0Var.f33624g1;
                                    ArrayList arrayList22 = arrayList3;
                                    storiesController.s(j112, arrayList22);
                                    qc.a0(p2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList22.size(), new Object[0])).j();
                                    yu0Var.L(false);
                                    return;
                                default:
                                    yu0 yu0Var2 = this.f25682b;
                                    yu0Var2.getClass();
                                    int i182 = 0;
                                    while (true) {
                                        ArrayList arrayList32 = arrayList3;
                                        if (i182 < arrayList32.size()) {
                                            yu0Var2.f33649s1.getMessagesController().deleteSavedDialog(((Long) arrayList32.get(i182)).longValue());
                                            i182++;
                                        } else {
                                            yu0Var2.L(true);
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
            if (this.f33611b1 != null && p2Var.getMessagesController().isUserNoForwards(this.f33611b1)) {
                m40 m40Var = this.B1;
                if (m40Var != null) {
                    m40Var.setText(LocaleController.getString(R.string.ForwardsRestrictedInfoUser));
                    this.B1.f(view, true);
                    return;
                }
                return;
            }
            if (this.f33608a1 != null) {
                TLRPC.Chat chat3 = p2Var.getMessagesController().getChat(Long.valueOf(this.f33608a1.f20846id));
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
            pyVar.f40278z2 = new vq0(this);
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
                ft0 ft0Var = this.W;
                if (ft0Var != null && ft0Var.f32551s != null) {
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
                if (hu0Var.f27635w.contains(Long.valueOf(j13))) {
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
                    qt0[] qt0VarArr = this.f33625h0;
                    if (i21 >= qt0VarArr.length) {
                        break;
                    }
                    qt0 qt0Var = qt0VarArr[i21];
                    if (qt0Var.C == 11) {
                        qt0Var.f30525x.h1(0, 0);
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
        qt0 qt0Var;
        qt0[] qt0VarArr = this.f33625h0;
        if (qt0VarArr == null || (qt0Var = qt0VarArr[0]) == null) {
            return false;
        }
        if (this.f33626h1 && p0(qt0Var.C)) {
            return false;
        }
        boolean p02 = p0(qt0VarArr[0].C);
        int i10 = this.f33630j1[p02 ? 1 : 0];
        if (i10 == X(p02 ? 1 : 0, i10, false)) {
            return false;
        }
        return true;
    }

    public final void F() {
        ns0 ns0Var = this.F0;
        if (!ns0Var.d(ns0Var.getCurrentTabId())) {
            int firstTabId = ns0Var.getFirstTabId();
            ns0Var.setInitialTabId(firstTabId);
            this.f33625h0[0].C = firstTabId;
            m1(false);
        }
    }

    public final void F0() {
        oh.l6 l6Var;
        oh.l6 l6Var2;
        this.D1.removeAllObservers();
        ft0 ft0Var = this.W;
        if (ft0Var != null && (l6Var2 = ft0Var.f32551s) != null && l6Var2 != null) {
            l6Var2.z(ft0Var.v);
        }
        mr0 mr0Var = this.f33610b0;
        if (mr0Var != null && (l6Var = mr0Var.f32551s) != null && l6Var != null) {
            l6Var.z(mr0Var.v);
        }
        for (xu0 xu0Var : this.V1.values()) {
            wu0 wu0Var = xu0Var.f33179c;
            oh.l6 l6Var3 = wu0Var.f32551s;
            if (l6Var3 != null && l6Var3 != null) {
                l6Var3.z(wu0Var.v);
            }
        }
    }

    public final void G(qt0 qt0Var, sl0 sl0Var, f2.j0 j0Var) {
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
            if (sl0Var.getFastScroll() == null || !sl0Var.getFastScroll().f25653n || currentTimeMillis - qt0Var.f30516a >= 300) {
                qt0Var.f30516a = currentTimeMillis;
                if ((!this.S0 || !this.R0 || qt0Var.C == 11) && qt0Var.C != 7) {
                    int L0 = j0Var.L0();
                    if (L0 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(j0Var.N0() - L0) + 1;
                    }
                    if (sl0Var.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = sl0Var.getAdapter().h();
                    }
                    int i15 = qt0Var.C;
                    int[] iArr = this.f33630j1;
                    nu0[] nu0VarArr = this.f33643q1;
                    if (i15 == 0 || i15 == 1 || i15 == 2 || i15 == 4) {
                        h = nu0VarArr[i15].d() + nu0VarArr[i15].f29580a.size();
                        nu0 nu0Var = nu0VarArr[i15];
                        if (nu0Var.h && nu0Var.f29583e.size() > 2 && qt0Var.C == 0 && nu0VarArr[i15].f29580a.size() != 0) {
                            if (i15 == 0) {
                                i10 = iArr[0];
                            } else {
                                i10 = 1;
                            }
                            float f10 = i10;
                            int measuredHeight = (int) ((sl0Var.getMeasuredHeight() / (sl0Var.getMeasuredWidth() / f10)) * f10 * 1.5f);
                            if (measuredHeight < 100) {
                                measuredHeight = 100;
                            }
                            if (measuredHeight < ((vt0) nu0VarArr[i15].f29583e.get(1)).f32539b) {
                                measuredHeight = ((vt0) nu0VarArr[i15].f29583e.get(1)).f32539b;
                            }
                            if ((L0 > h && L0 - h > measuredHeight) || ((i11 = L0 + abs) < nu0VarArr[i15].f29590m && nu0VarArr[0].f29590m - i11 > measuredHeight)) {
                                gy gyVar = new gy(this, i15, sl0Var, 10);
                                this.G1 = gyVar;
                                AndroidUtilities.runOnUIThread(gyVar);
                                return;
                            }
                        }
                    }
                    int i16 = qt0Var.C;
                    if (i16 != 7) {
                        if (p0(i16)) {
                            vu0 k12 = k1(qt0Var.C);
                            if (k12 != null && (l6Var = k12.f32551s) != null && L0 + abs > l6Var.i() - iArr[1]) {
                                k12.P();
                                return;
                            }
                            return;
                        }
                        int i17 = qt0Var.C;
                        if (i17 == 6) {
                            if (abs > 0) {
                                it0 it0Var = this.M;
                                boolean z4 = it0Var.h;
                                ArrayList arrayList = it0Var.d;
                                if (!z4 && !it0Var.f27898e && !arrayList.isEmpty() && L0 + abs >= h - 5) {
                                    it0.E(it0Var, ((TLRPC.Chat) l.d.i(1, arrayList)).f20845id);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.p2 p2Var = this.f33649s1;
                        if (i17 == 11) {
                            int i18 = -1;
                            for (int i19 = 0; i19 < qt0Var.h.getChildCount(); i19++) {
                                View childAt = qt0Var.h.getChildAt(i19);
                                qt0Var.h.getClass();
                                i18 = Math.max(RecyclerView.R(childAt), i18);
                            }
                            f2.p0 adapter = qt0Var.h.getAdapter();
                            ju0 ju0Var = this.P;
                            if (adapter == ju0Var) {
                                if (i18 + 1 >= ju0Var.h.size() + ju0Var.f28183e.size() && !ju0Var.f28187s && !ju0Var.f28186r) {
                                    ju0Var.f28186r = true;
                                    ju0Var.F();
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
                            if (abs + L0 > h - i12 || nu0VarArr[i13].f29592o) {
                                nu0 nu0Var2 = nu0VarArr[i13];
                                if (!nu0Var2.f29585g) {
                                    if (i17 == 0) {
                                        int i20 = nu0VarArr[0].f29594q;
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
                                    boolean[] zArr = nu0Var2.f29586i;
                                    if (!zArr[0]) {
                                        nu0Var2.f29585g = true;
                                        p2Var.getMediaDataController().loadMedia(this.f33624g1, 50, nu0VarArr[i13].f29587j[0], 0, i14, this.C, 1, p2Var.getClassGuid(), nu0VarArr[i13].f29593p, null, null);
                                    } else if (this.Z0 != 0 && !zArr[1]) {
                                        nu0Var2.f29585g = true;
                                        p2Var.getMediaDataController().loadMedia(this.Z0, 50, nu0VarArr[i13].f29587j[1], 0, i14, this.C, 1, p2Var.getClassGuid(), nu0VarArr[i13].f29593p, null, null);
                                    }
                                }
                            }
                            int i21 = nu0VarArr[i13].f29590m;
                            if (i13 == 0) {
                                i21 = this.E.L(0);
                            }
                            if (L0 - i21 < i12 + 1) {
                                nu0 nu0Var3 = nu0VarArr[i13];
                                if (!nu0Var3.f29585g && !nu0Var3.f29589l && !nu0Var3.f29592o) {
                                    A0(qt0Var.C);
                                }
                            }
                            qt0 qt0Var2 = this.f33625h0[0];
                            if (qt0Var2.h == sl0Var) {
                                int i22 = qt0Var2.C;
                                if ((i22 == 0 || i22 == 5) && L0 != -1 && (K = sl0Var.K(L0)) != null) {
                                    int i23 = K.f5879f;
                                    if (i23 == 0 || i23 == 12) {
                                        View view = K.f5875a;
                                        boolean z10 = view instanceof org.telegram.ui.Cells.s7;
                                        org.telegram.ui.Cells.v0 v0Var = this.H0;
                                        if (z10) {
                                            org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                                            if (s7Var.f23747e <= 0) {
                                                messageObject = null;
                                            } else {
                                                messageObject = s7Var.f23745b[0];
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
            sr0 sr0Var = this.T;
            if (sr0Var == null || !sr0Var.f40300w) {
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
                if (this.f33666z1) {
                    int i15 = 8;
                    if (i11 != 8 || C()) {
                        if (messageObject.getDialogId() == this.f33624g1) {
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
                            this.f33660x0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                            if (this.X0 == 0) {
                                i12 = 0;
                            } else {
                                i12 = 8;
                            }
                            this.f33627i0.setVisibility(i12);
                            org.telegram.ui.ActionBar.w0 w0Var = this.f33645r0;
                            if (w0Var != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14 && sparseArrayArr[0].size() == 1) {
                                    i13 = 0;
                                } else {
                                    i13 = 8;
                                }
                                w0Var.setVisibility(i13);
                            }
                            org.telegram.ui.ActionBar.w0 w0Var2 = this.f33642q0;
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
                    xr0 xr0Var = this.f33639o1;
                    nu0[] nu0VarArr = this.f33643q1;
                    org.telegram.ui.ActionBar.p2 p2Var = this.f33649s1;
                    if (i11 == 0) {
                        nu0 nu0Var = nu0VarArr[i11];
                        int i16 = i10 - nu0Var.f29590m;
                        if (i16 >= 0 && i16 < nu0Var.f29580a.size()) {
                            PhotoViewer.t1().K2(null, p2Var, null);
                            PhotoViewer.t1().a2(nu0VarArr[i11].f29580a, i16, this.f33624g1, this.Z0, this.C, xr0Var);
                        }
                    } else if (i11 != 2 && i11 != 4) {
                        if (i11 == 5) {
                            PhotoViewer.t1().K2(null, p2Var, null);
                            int indexOf = nu0VarArr[i11].f29580a.indexOf(messageObject);
                            if (indexOf < 0) {
                                PhotoViewer.t1().a2(org.telegram.messenger.y3.m(messageObject), 0, 0L, 0L, 0L, xr0Var);
                            } else {
                                PhotoViewer.t1().a2(nu0VarArr[i11].f29580a, indexOf, this.f33624g1, this.Z0, this.C, xr0Var);
                            }
                        } else if (i11 == 1) {
                            if (view instanceof org.telegram.ui.Cells.i7) {
                                org.telegram.ui.Cells.i7 i7Var2 = (org.telegram.ui.Cells.i7) view;
                                TLRPC.Document document = messageObject.getDocument();
                                if (i7Var2.D) {
                                    if (messageObject.canPreviewDocument()) {
                                        PhotoViewer.t1().K2(null, p2Var, null);
                                        int indexOf2 = nu0VarArr[i11].f29580a.indexOf(messageObject);
                                        if (indexOf2 < 0) {
                                            PhotoViewer.t1().a2(org.telegram.messenger.y3.m(messageObject), 0, 0L, 0L, 0L, xr0Var);
                                            return;
                                        }
                                        PhotoViewer.t1().a2(nu0VarArr[i11].f29580a, indexOf2, this.f33624g1, this.Z0, this.C, xr0Var);
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
                                        ru.I(p2Var, messageObject, this.f33639o1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
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
                            vu0 k12 = k1(i11);
                            if (k12 != null) {
                                l6Var = k12.f32551s;
                            }
                            if (l6Var != null) {
                                oh.i9 orCreateStoryViewer = p2Var.getOrCreateStoryViewer();
                                Context context = getContext();
                                int id2 = messageObject.getId();
                                oh.c7 a10 = oh.c7.a(this.f33625h0[0].h);
                                a10.f16946e = new hv(l6Var, 18);
                                if ((p2Var instanceof ProfileActivity) && ((ProfileActivity) p2Var).f34667p1) {
                                    i14 = AndroidUtilities.dp(68.0f);
                                }
                                a10.f16950s += i14;
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
        nr0 nr0Var;
        float f11;
        boolean z10;
        qt0[] qt0VarArr = this.f33625h0;
        int i10 = qt0VarArr[0].C;
        if (i10 == 13 && (nr0Var = this.R) != null) {
            View currentView = nr0Var.f44442n.getCurrentView();
            if (currentView instanceof ph.l) {
                ph.l lVar = (ph.l) currentView;
                ph.g gVar = lVar.v;
                ph.e eVar = lVar.f44426f;
                if (lVar.f44422a != null && lVar.getParent() != null) {
                    if (!lVar.f44423b || lVar.H) {
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
                                            lVar.f44424c = 0.0f;
                                        } else {
                                            if (z11) {
                                                f11 = org.telegram.messenger.y3.a(2.0f, lVar.N, 1.0f, 1.0f);
                                            } else {
                                                f11 = (1.0f - lVar.N) / 0.5f;
                                            }
                                            lVar.f44424c = Math.max(0.0f, Math.min(1.0f, f11));
                                        }
                                        float f12 = lVar.f44424c;
                                        int i14 = (f12 > 1.0f ? 1 : (f12 == 1.0f ? 0 : -1));
                                        if (i14 == 0 || f12 == 0.0f) {
                                            if (i14 == 0) {
                                                int i15 = lVar.f44425e;
                                                int ceil = (((int) Math.ceil(lVar.P / lVar.f44425e)) * i15) + ((int) ((lVar.T.D.f33658w1 / (eVar.getMeasuredWidth() - ((int) (eVar.getMeasuredWidth() / lVar.f44425e)))) * (i15 - 1)));
                                                if (ceil >= gVar.h()) {
                                                    ceil = gVar.h() - 1;
                                                }
                                                lVar.P = ceil;
                                            }
                                            lVar.a();
                                            if (lVar.f44424c == 0.0f) {
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
            if (!this.l1 || this.f33606a) {
                if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                    if (motionEvent.getActionMasked() == 2 && (this.f33606a || this.f33612c)) {
                        int i19 = -1;
                        int i20 = -1;
                        for (int i21 = 0; i21 < motionEvent.getPointerCount(); i21++) {
                            if (this.f33617e == motionEvent.getPointerId(i21)) {
                                i19 = i21;
                            }
                            if (this.f33620f == motionEvent.getPointerId(i21)) {
                                i20 = i21;
                            }
                        }
                        if (i19 != -1 && i20 != -1) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(i20) - motionEvent.getX(i19), motionEvent.getY(i20) - motionEvent.getY(i19))) / this.h;
                            this.f33635n = hypot2;
                            if (!this.f33606a && (hypot2 > 1.01f || hypot2 < 0.99f)) {
                                this.f33606a = true;
                                if (hypot2 > 1.0f) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                this.f33644r = z4;
                                e1(z4);
                            }
                            if (this.f33606a) {
                                boolean z12 = this.f33644r;
                                if ((z12 && this.f33635n < 1.0f) || (!z12 && this.f33635n > 1.0f)) {
                                    this.f33632k1 = 0.0f;
                                } else {
                                    if (z12) {
                                        f10 = org.telegram.messenger.y3.a(2.0f, this.f33635n, 1.0f, 1.0f);
                                    } else {
                                        f10 = (1.0f - this.f33635n) / 0.5f;
                                    }
                                    this.f33632k1 = Math.max(0.0f, Math.min(1.0f, f10));
                                }
                                float f13 = this.f33632k1;
                                if (f13 == 1.0f || f13 == 0.0f) {
                                    if (p0(this.f33634m1)) {
                                        p0Var = k1(this.f33634m1);
                                    } else {
                                        p0Var = this.E;
                                    }
                                    if (this.f33632k1 == 1.0f) {
                                        int i22 = this.f33637n1;
                                        int ceil2 = (((int) Math.ceil(this.f33647s / this.f33637n1)) * i22) + ((int) ((this.f33658w1 / (qt0VarArr[0].h.getMeasuredWidth() - ((int) (qt0VarArr[0].h.getMeasuredWidth() / this.f33637n1)))) * (i22 - 1)));
                                        if (ceil2 >= p0Var.h()) {
                                            ceil2 = p0Var.h() - 1;
                                        }
                                        this.f33647s = ceil2;
                                    }
                                    T();
                                    if (this.f33632k1 == 0.0f) {
                                        this.f33644r = !this.f33644r;
                                    }
                                    e1(this.f33644r);
                                    this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                qt0VarArr[0].h.invalidate();
                                qt0 qt0Var = qt0VarArr[0];
                                if (qt0Var.D != null) {
                                    qt0Var.invalidate();
                                }
                            }
                        } else {
                            this.f33609b = false;
                            this.f33612c = false;
                            this.f33606a = false;
                            T();
                            return false;
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.f33617e == motionEvent.getPointerId(0) && this.f33620f == motionEvent.getPointerId(1)) || (this.f33617e == motionEvent.getPointerId(1) && this.f33620f == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.f33606a) {
                        this.f33612c = false;
                        this.f33609b = false;
                        this.f33606a = false;
                        T();
                    }
                } else {
                    if (this.f33609b && !this.f33606a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.f33635n = 1.0f;
                        this.f33617e = motionEvent.getPointerId(0);
                        this.f33620f = motionEvent.getPointerId(1);
                        qt0VarArr[0].h.I0(false);
                        qt0VarArr[0].h.cancelLongPress();
                        qt0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.f33656w = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - qt0VarArr[0].getX());
                        int y11 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - qt0VarArr[0].getY());
                        int i23 = this.f33656w;
                        this.f33647s = -1;
                        int i24 = y11 + qt0VarArr[0].h.U2;
                        if (getY() != 0.0f && this.B == 1) {
                            i24 = 0;
                        }
                        for (int i25 = 0; i25 < qt0VarArr[0].h.getChildCount(); i25++) {
                            View childAt2 = qt0VarArr[0].h.getChildAt(i25);
                            Rect rect2 = this.f33659x;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i23, i24)) {
                                qt0VarArr[0].h.getClass();
                                this.f33647s = RecyclerView.S(childAt2);
                                this.v = childAt2.getTop();
                            }
                        }
                        if (this.A1.T() && this.f33647s == -1) {
                            this.f33647s = (int) (((this.f33630j1[p0(qt0VarArr[0].C) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i23 / qt0VarArr[0].h.getMeasuredWidth(), 0.0f))) + qt0VarArr[0].f30525x.L0());
                            this.v = 0;
                        }
                        this.f33612c = true;
                    }
                    if (motionEvent.getActionMasked() == 0 && ((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - qt0VarArr[0].getY() > 0.0f) {
                        this.f33609b = true;
                    }
                }
                return this.f33606a;
            }
            return true;
        }
        return false;
    }

    public final boolean H0(MessageObject messageObject, View view, int i10, boolean z4) {
        sr0 sr0Var;
        char c3;
        int i11;
        int i12;
        final TL_stories.StoryItem storyItem;
        ft0 ft0Var;
        oh.l6 l6Var;
        if (!this.f33666z1) {
            org.telegram.ui.ActionBar.p2 p2Var = this.f33649s1;
            if (p2Var.getParentActivity() != null && messageObject != null && ((sr0Var = this.T) == null || !sr0Var.f40300w)) {
                AndroidUtilities.hideKeyboard(p2Var.getParentActivity().getCurrentFocus());
                long j10 = this.f33624g1;
                int i13 = 8;
                if (z4 && ((w0(getClosestTab()) || getClosestTab() == 8) && !this.f33666z1)) {
                    if (view instanceof org.telegram.ui.Cells.r7) {
                        org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
                        r7Var.k(r7Var.f23576n, r7Var.f23581r, true);
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
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.yt0(I, 25), false);
                        J.k();
                        q70.f(J, getStoriesController().B(j10, true), hashSet, true, new jp(this, storyItem2, I, 16), new hg.c1(this, hashSet, storyItem2, I, 11));
                        I.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddToAlbum), new lh.y2(I, J, 7), false);
                        I.k();
                        I.c(R.drawable.msg_select, LocaleController.getString(R.string.StoriesAlbumMenuSelect), new dg.u1(this, messageObject, view, i10, 22), false);
                        if (w02) {
                            int h12 = h1(getClosestTab());
                            String w10 = getStoriesController().w(h12, j10);
                            I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new im(this, h12, 5), false);
                            storyItem = storyItem2;
                            I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.StoriesAlbumMenuRemoveFromAlbum), new dg.u1(this, h12, storyItem, w10, 23), false);
                        } else {
                            storyItem = storyItem2;
                            if (getClosestTab() == 8 && (ft0Var = this.W) != null && (l6Var = ft0Var.f32551s) != null) {
                                if (l6Var.m(storyItem.f21082id)) {
                                    I.c(R.drawable.chats_unpin, LocaleController.getString(R.string.StoriesAlbumMenuUnpin), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r1) {
                                                case 0:
                                                    yu0 yu0Var = this;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yu0Var.getContext(), 0, yu0Var.C1);
                                                    alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.DeleteStoryTitle);
                                                    alertDialog$Builder.f21168a.Q = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new cr0(yu0Var, storyItem));
                                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mh0(8));
                                                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                                                    d2Var.show();
                                                    d2Var.h();
                                                    return;
                                                case 1:
                                                    yu0 yu0Var2 = this;
                                                    yu0Var2.getClass();
                                                    yu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f21082id))), false);
                                                    return;
                                                case 2:
                                                    yu0 yu0Var3 = this;
                                                    yu0Var3.getClass();
                                                    yu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f21082id))), true);
                                                    return;
                                                default:
                                                    yu0.h(this, storyItem);
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
                                                    yu0 yu0Var = this;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yu0Var.getContext(), 0, yu0Var.C1);
                                                    alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.DeleteStoryTitle);
                                                    alertDialog$Builder.f21168a.Q = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new cr0(yu0Var, storyItem));
                                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mh0(8));
                                                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                                                    d2Var.show();
                                                    d2Var.h();
                                                    return;
                                                case 1:
                                                    yu0 yu0Var2 = this;
                                                    yu0Var2.getClass();
                                                    yu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f21082id))), false);
                                                    return;
                                                case 2:
                                                    yu0 yu0Var3 = this;
                                                    yu0Var3.getClass();
                                                    yu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f21082id))), true);
                                                    return;
                                                default:
                                                    yu0.h(this, storyItem);
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
                                            yu0 yu0Var = this;
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yu0Var.getContext(), 0, yu0Var.C1);
                                            alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.DeleteStoryTitle);
                                            alertDialog$Builder.f21168a.Q = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new cr0(yu0Var, storyItem));
                                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mh0(8));
                                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                                            d2Var.show();
                                            d2Var.h();
                                            return;
                                        case 1:
                                            yu0 yu0Var2 = this;
                                            yu0Var2.getClass();
                                            yu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f21082id))), false);
                                            return;
                                        case 2:
                                            yu0 yu0Var3 = this;
                                            yu0Var3.getClass();
                                            yu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f21082id))), true);
                                            return;
                                        default:
                                            yu0.h(this, storyItem);
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
                                        yu0 yu0Var = this;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yu0Var.getContext(), 0, yu0Var.C1);
                                        alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.DeleteStoryTitle);
                                        alertDialog$Builder.f21168a.Q = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new cr0(yu0Var, storyItem));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mh0(8));
                                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                                        d2Var.show();
                                        d2Var.h();
                                        return;
                                    case 1:
                                        yu0 yu0Var2 = this;
                                        yu0Var2.getClass();
                                        yu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f21082id))), false);
                                        return;
                                    case 2:
                                        yu0 yu0Var3 = this;
                                        yu0Var3.getClass();
                                        yu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f21082id))), true);
                                        return;
                                    default:
                                        yu0.h(this, storyItem);
                                        return;
                                }
                            }
                        }, true);
                        I.f30315i = 3;
                        I.f30335u = true;
                        I.v = true;
                        I.L = true;
                        I.M = 3;
                        Point point = AndroidUtilities.displaySize;
                        Point point2 = AndroidUtilities.displaySize;
                        int min = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point2.x, point2.y) * 0.4333f) * 3.0f) / 4.0f));
                        I.N = min;
                        I.O = (min * 4) / 3;
                        I.f30334t = true;
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
                    this.f33627i0.setVisibility(i11);
                    org.telegram.ui.ActionBar.w0 w0Var = this.f33645r0;
                    if (w0Var != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        } else {
                            i12 = 8;
                        }
                        w0Var.setVisibility(i12);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.f33642q0;
                    if (w0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i13 = 0;
                        }
                        w0Var2.setVisibility(i13);
                    }
                    this.f33660x0.a(1, false);
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
                    if (!this.f33666z1) {
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
        qt0[] qt0VarArr = this.f33625h0;
        qt0 qt0Var = qt0VarArr[0];
        if (qt0Var != null && qt0VarArr[1] != null) {
            float f11 = 0.0f;
            sr0 sr0Var = this.T;
            if (sr0Var != null) {
                if (p0(qt0Var.C) && qt0VarArr[0].C != 9) {
                    c3 = 1;
                } else {
                    c3 = 0;
                }
                if (qt0VarArr[1].getVisibility() == 0) {
                    if (p0(qt0VarArr[1].C) && qt0VarArr[1].C != 9) {
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
                        measuredWidth = qt0VarArr[0].getMeasuredWidth();
                    }
                    sr0Var.setTranslationX(measuredWidth);
                } else {
                    sr0Var.setTranslationX(qt0VarArr[c3 ^ 1].getTranslationX());
                    abs = 1.0f - (Math.abs(sr0Var.getTranslationX()) / sr0Var.getMeasuredWidth());
                }
                float f12 = 0.0f;
                for (int i10 = 0; i10 < qt0VarArr.length; i10++) {
                    if (qt0VarArr[i10].getVisibility() == 0) {
                        wr0 wr0Var = qt0VarArr[i10].h;
                        if (wr0Var.getChildCount() == 0) {
                            childAt = null;
                        } else {
                            childAt = wr0Var.getChildAt(0);
                        }
                        if (childAt == null) {
                            R = -1;
                        } else {
                            R = RecyclerView.R(childAt);
                        }
                        if (R == 0) {
                            f10 = childAt.getY() - wr0Var.getPaddingTop();
                        } else if (wr0Var.getChildCount() == 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = -AndroidUtilities.dp(48.0f);
                        }
                        f12 += Utilities.clamp01(1.0f - (qt0VarArr[i10].getTranslationX() / qt0VarArr[i10].getMeasuredWidth())) * f10;
                    }
                }
                float clamp01 = Utilities.clamp01(1.0f - ((-f12) / AndroidUtilities.dpf2(48.0f)));
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
                sr0Var.setAlpha(clamp01);
                sr0Var.setScaleX(lerp);
                sr0Var.setScaleY(lerp);
                sr0Var.setTranslationY(this.H1 + f12);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yu0.J():boolean");
    }

    public final void J0(float f10) {
        int i10;
        int i11;
        qt0[] qt0VarArr = this.f33625h0;
        int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i12 != 0 || qt0VarArr[1].getVisibility() == 0) {
            if (this.f33619e1) {
                qt0 qt0Var = qt0VarArr[0];
                qt0Var.setTranslationX((-f10) * qt0Var.getMeasuredWidth());
                qt0VarArr[1].setTranslationX(qt0VarArr[0].getMeasuredWidth() - (qt0VarArr[0].getMeasuredWidth() * f10));
            } else {
                qt0 qt0Var2 = qt0VarArr[0];
                qt0Var2.setTranslationX(qt0Var2.getMeasuredWidth() * f10);
                qt0VarArr[1].setTranslationX((qt0VarArr[0].getMeasuredWidth() * f10) - qt0VarArr[0].getMeasuredWidth());
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
            this.f33638o0.setVisibility(i10);
            org.telegram.ui.ActionBar.w0 w0Var = this.f33631k0;
            if (w0Var != null && !D()) {
                if (v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                w0Var.setVisibility(i11);
                this.f33633l0 = 0.0f;
            } else {
                this.f33633l0 = b0(f10);
                t1();
            }
            q1(false);
            if (i12 == 0) {
                qt0 qt0Var3 = qt0VarArr[0];
                qt0VarArr[0] = qt0VarArr[1];
                qt0VarArr[1] = qt0Var3;
                qt0Var3.setVisibility(8);
                if (w0Var != null && this.f33652u0 == 2) {
                    if (v0()) {
                        i13 = 8;
                    }
                    w0Var.setVisibility(i13);
                }
                this.f33652u0 = 0;
                f1();
            }
        }
    }

    public final void K() {
        ls lsVar = this.M0;
        if (lsVar != null) {
            sr0 sr0Var = this.T;
            float f10 = 0.0f;
            if (sr0Var != null) {
                f10 = 0.0f + (sr0Var.getVisibilityFactor() * AndroidUtilities.dp(38.0f) * (1.0f - Math.abs(sr0Var.getTranslationX() / sr0Var.getMeasuredWidth())));
            }
            lsVar.setTranslationY(this.H1 + f10);
        }
    }

    public final boolean L(boolean z4) {
        SparseArray[] sparseArrayArr;
        if (!this.f33666z1) {
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
        nr0 nr0Var = this.R;
        if (nr0Var != null) {
            nr0Var.h();
            nr0Var.j();
        }
        b1(false);
        r1(z4);
        hu0 hu0Var = this.O;
        if (hu0Var != null) {
            hu0Var.f27635w.clear();
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
        tu0 tu0Var = this.f33610b0.f32552w;
        if (tu0Var != null) {
            if (z4 && getClosestTab() == 9) {
                z12 = true;
            } else {
                z12 = false;
            }
            tu0Var.b(z12);
        }
        tu0 tu0Var2 = this.W.f32552w;
        if (tu0Var2 != null) {
            if (z4 && getClosestTab() == 8) {
                z11 = true;
            } else {
                z11 = false;
            }
            tu0Var2.b(z11);
        }
        for (xu0 xu0Var : this.V1.values()) {
            wu0 wu0Var = xu0Var.f33179c;
            if (wu0Var.f32551s != null) {
                tu0 tu0Var3 = wu0Var.f32552w;
                if (z4 && getClosestTab() == xu0Var.f33177a) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tu0Var3.b(z10);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.f33631k0;
        if (w0Var != null) {
            ks0 ks0Var = this.G0;
            if (ks0Var != null && ks0Var.a() && getSelectedTab() == 11) {
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
        qt0[] qt0VarArr = this.f33625h0;
        motionEvent.offsetLocation(x10 - qt0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - qt0VarArr[0].getY()) - qt0VarArr[0].h.getFastScroll().getY());
        return qt0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public final void O0(org.telegram.ui.ActionBar.p2 p2Var, long j10, int i10) {
        new org.telegram.ui.k71(p2Var, j10, this.f33630j1[1], new mc(this, j10, i10)).show();
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
            qt0[] qt0VarArr = this.f33625h0;
            if (i10 < qt0VarArr.length) {
                qt0 qt0Var = qt0VarArr[i10];
                if (qt0Var != null && qt0Var.getVisibility() == 0) {
                    for (int i11 = 0; i11 < qt0VarArr[i10].h.getChildCount(); i11++) {
                        View childAt = qt0VarArr[i10].h.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + qt0VarArr[i10].h.U2) {
                            int save = canvas.save();
                            canvas.translate(childAt.getX() + qt0VarArr[i10].getX(), childAt.getY() + qt0VarArr[i10].h.getY() + qt0VarArr[i10].getY() + getY());
                            childAt.draw(canvas);
                            if (arrayList != null && (childAt instanceof mv0)) {
                                arrayList.add((mv0) childAt);
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
        Pattern pattern = z4.f33754a;
        z4.R(context, p2Var, LocaleController.getString(R.string.StoriesAlbumRename), LocaleController.getString(R.string.StoriesAlbumRenameHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), w10, 12, LocaleController.getString(R.string.Rename), resourceProvider, dVar);
    }

    public final boolean R(int i10) {
        nu0[] nu0VarArr = this.f33646r1.f30533n;
        if (nu0VarArr == null) {
            return false;
        }
        nu0[] nu0VarArr2 = this.f33643q1;
        if (i10 == 0) {
            nu0 nu0Var = nu0VarArr2[i10];
            if (!nu0Var.h) {
                int[] iArr = nu0Var.f29584f;
                int[] iArr2 = nu0VarArr[i10].f29584f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = nu0VarArr2[i10].f29584f;
            int[] iArr4 = nu0VarArr[i10].f29584f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        nu0VarArr2[i10].f29580a.addAll(nu0VarArr[i10].f29580a);
        nu0VarArr2[i10].f29582c.addAll(nu0VarArr[i10].f29582c);
        for (Map.Entry entry : nu0VarArr[i10].d.entrySet()) {
            nu0VarArr2[i10].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i11 = 0; i11 < 2; i11++) {
            nu0VarArr2[i10].f29581b[i11] = nu0VarArr[i10].f29581b[i11].clone();
            nu0 nu0Var2 = nu0VarArr2[i10];
            int[] iArr5 = nu0Var2.f29587j;
            nu0 nu0Var3 = nu0VarArr[i10];
            iArr5[i11] = nu0Var3.f29587j[i11];
            nu0Var2.f29586i[i11] = nu0Var3.f29586i[i11];
        }
        nu0VarArr2[i10].f29583e.addAll(nu0VarArr[i10].f29583e);
        return !nu0VarArr[i10].f29580a.isEmpty();
    }

    public final void R0(String str) {
        boolean shouldShowUrlInAlert = AndroidUtilities.shouldShowUrlInAlert(str);
        org.telegram.ui.ActionBar.p2 p2Var = this.f33649s1;
        if (shouldShowUrlInAlert) {
            z4.q0(p2Var, str, true, true);
        } else {
            af.g.s(p2Var.getParentActivity(), str);
        }
    }

    public final void S(int i10, sl0 sl0Var, boolean z4) {
        ArrayList arrayList = this.f33643q1[i10].f29583e;
        int L0 = ((f2.j0) sl0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            vt0 vt0Var = null;
            if (arrayList != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (L0 <= ((vt0) arrayList.get(i11)).f32539b) {
                        vt0Var = (vt0) arrayList.get(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                if (vt0Var == null) {
                    vt0Var = (vt0) l.d.i(1, arrayList);
                }
            }
            if (vt0Var != null) {
                y0(i10, vt0Var.d, vt0Var.f32539b + 1, z4);
            }
        }
    }

    public int S0() {
        return -1;
    }

    public final void T() {
        qt0[] qt0VarArr;
        qt0 qt0Var;
        boolean z4;
        int i10;
        f2.p0 adapter;
        if (this.l1) {
            int i11 = 0;
            while (true) {
                qt0VarArr = this.f33625h0;
                if (i11 < qt0VarArr.length) {
                    qt0Var = qt0VarArr[i11];
                    if (qt0Var.C == this.f33634m1) {
                        break;
                    }
                    i11++;
                } else {
                    qt0Var = null;
                    break;
                }
            }
            if (qt0Var != null) {
                boolean p02 = p0(qt0Var.C);
                float f10 = this.f33632k1;
                nu0[] nu0VarArr = this.f33643q1;
                float f11 = 1.0f;
                if (f10 == 1.0f) {
                    this.l1 = false;
                    int i12 = this.f33637n1;
                    int[] iArr = this.f33630j1;
                    iArr[p02 ? 1 : 0] = i12;
                    if (!p02) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (c0(qt0Var.C) >= 5) {
                        SharedConfig.setStoriesColumnsCount(this.f33637n1);
                    }
                    for (int i13 = 0; i13 < qt0VarArr.length; i13++) {
                        qt0 qt0Var2 = qt0VarArr[i13];
                        if (qt0Var2 != null && qt0Var2.h != null && (((i10 = qt0Var2.C) == 0 || p0(i10)) && (adapter = qt0VarArr[i13].h.getAdapter()) != null)) {
                            int h = adapter.h();
                            if (i13 == 0) {
                                nu0VarArr[0].g(false);
                            }
                            qt0VarArr[i13].f30522r.setVisibility(8);
                            qt0VarArr[i13].f30525x.y1(iArr[p02 ? 1 : 0]);
                            qt0VarArr[i13].h.a0();
                            qt0VarArr[i13].h.invalidate();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(qt0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                    }
                    if (this.f33647s >= 0) {
                        for (int i14 = 0; i14 < qt0VarArr.length; i14++) {
                            qt0 qt0Var3 = qt0VarArr[i14];
                            if (qt0Var3.C == this.f33634m1) {
                                View m9 = qt0Var3.f30523s.m(this.f33647s);
                                if (m9 != null) {
                                    this.v = m9.getTop();
                                }
                                qt0 qt0Var4 = qt0VarArr[i14];
                                qt0Var4.f30525x.h1(this.f33647s, (-qt0Var4.h.getPaddingTop()) + this.v);
                            }
                        }
                        return;
                    }
                    X0();
                } else if (f10 == 0.0f) {
                    this.l1 = false;
                    if (this.f33634m1 == 0) {
                        nu0VarArr[0].g(false);
                    }
                    qt0Var.f30522r.setVisibility(8);
                    qt0Var.h.invalidate();
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
                    ofFloat.addUpdateListener(new ms0(this, qt0Var, 0));
                    ofFloat.addListener(new org.telegram.ui.aj(this, z4, p02 ? 1 : 0, qt0Var));
                    ofFloat.setInterpolator(pr.f30168f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                }
            }
        }
    }

    public final void T0(ArrayList arrayList, boolean z4) {
        boolean z10;
        boolean z11;
        ft0 ft0Var = this.W;
        if (ft0Var != null && ft0Var.f32551s != null) {
            org.telegram.ui.ActionBar.p2 p2Var = this.f33649s1;
            if (z4 && arrayList.size() > p2Var.getMessagesController().storiesPinnedToTopCountMax) {
                qc.a0(p2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", p2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
                return;
            }
            oh.l6 l6Var = ft0Var.f32551s;
            int i10 = l6Var.f17400c;
            ArrayList arrayList2 = l6Var.f17403g;
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
                    tL_togglePinnedToTop.f21095id.addAll(arrayList2);
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
                this.f33660x0.setTextSize(18);
            } else {
                this.f33660x0.setTextSize(20);
            }
        }
        if (i10 == 0) {
            this.E.l();
        }
    }

    public final boolean U0(MotionEvent motionEvent, boolean z4) {
        int i10;
        qt0 qt0Var;
        nr0 nr0Var;
        int i11;
        int i12;
        int closestTab = getClosestTab();
        ns0 ns0Var = this.F0;
        SparseIntArray sparseIntArray = ns0Var.L;
        int i13 = ns0Var.f25028n;
        int i14 = -1;
        if (z4) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i15 = sparseIntArray.get(i13 + i10, -1);
        sr0 sr0Var = this.T;
        if (sr0Var != null) {
            if (!w0(closestTab) && closestTab != 8) {
                if (w0(i15) || i15 == 8) {
                    i14 = sr0Var.getCurrentAlbumId();
                }
            } else {
                k81 k81Var = sr0Var.f40297n;
                SparseIntArray sparseIntArray2 = k81Var.V;
                int i16 = k81Var.C;
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
                i15 = i1(i14).f33177a;
            }
        }
        if (i15 >= 0) {
            org.telegram.ui.ActionBar.w0 w0Var = this.f33631k0;
            if (w0Var != null && !D()) {
                if (v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                w0Var.setVisibility(i11);
                this.f33633l0 = 0.0f;
            } else {
                this.f33633l0 = b0(0.0f);
                s1(0.0f);
            }
            if ((!this.S0 || getSelectedTab() != 11) && (!C() || !this.f33666z1 || (getClosestTab() != 8 && !w0(getClosestTab())))) {
                qt0[] qt0VarArr = this.f33625h0;
                qt0 qt0Var2 = qt0VarArr[0];
                if (qt0Var2 != null && qt0Var2.C == 13 && (nr0Var = this.R) != null) {
                    org.telegram.ui.o11 o11Var = nr0Var.f44442n;
                    if (!z4) {
                    }
                }
                qt0 qt0Var3 = qt0VarArr[0];
                or0 or0Var = this.S;
                if (qt0Var3 != null && qt0Var3.C == 14 && or0Var != null) {
                    lh.q2 q2Var = or0Var.h;
                    if (!z4) {
                    }
                }
                if ((!this.f33666z1 || (qt0Var = qt0VarArr[0]) == null || qt0Var.C != 13) && ((or0Var == null || !or0Var.g()) && (sr0Var == null || !sr0Var.f40300w))) {
                    q1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    k0();
                    this.f33655v1 = false;
                    this.f33653u1 = true;
                    N0(true);
                    this.f33658w1 = (int) motionEvent.getX();
                    this.D.setEnabled(false);
                    ns0Var.setEnabled(false);
                    qt0 qt0Var4 = qt0VarArr[1];
                    qt0Var4.C = i15;
                    qt0Var4.setVisibility(0);
                    this.f33619e1 = z4;
                    m1(true);
                    if (z4) {
                        qt0VarArr[1].setTranslationX(qt0VarArr[0].getMeasuredWidth());
                    } else {
                        qt0VarArr[1].setTranslationX(-qt0VarArr[0].getMeasuredWidth());
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
        nr0 nr0Var;
        if (!r0()) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        if (z4 && (nr0Var = this.R) != null) {
            return nr0Var.getBotPreviewsSubtitle();
        }
        ft0 ft0Var = this.W;
        if (ft0Var != null && ft0Var.f32551s != null) {
            i10 = 0;
            i11 = 0;
            for (int i12 = 0; i12 < ft0Var.f32551s.f17404i.size(); i12++) {
                MessageObject messageObject = (MessageObject) ft0Var.f32551s.f17404i.get(i12);
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

    public final qt0 W(int i10) {
        int i11 = 0;
        while (true) {
            qt0[] qt0VarArr = this.f33625h0;
            if (i11 < qt0VarArr.length) {
                qt0 qt0Var = qt0VarArr[i11];
                if (qt0Var != null && qt0Var.C == i10) {
                    return qt0Var;
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    public final void W0(f2.p0 p0Var) {
        if (p0Var instanceof su0) {
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
            eu0 eu0Var = this.K;
            if (p0Var == eu0Var) {
                eu0Var.f26667r = null;
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
        return Utilities.clamp(i14, 9, (this.f33626h1 && i10 == 1) ? 2 : 2);
    }

    public final void X0() {
        int i10;
        int i11 = 0;
        while (true) {
            qt0[] qt0VarArr = this.f33625h0;
            if (i11 < qt0VarArr.length) {
                wr0 wr0Var = qt0VarArr[i11].h;
                if (wr0Var != null) {
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < wr0Var.getChildCount(); i14++) {
                        View childAt = wr0Var.getChildAt(i14);
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
                        int i15 = qt0VarArr[i11].C;
                        int i16 = -1;
                        if (p0(i15)) {
                            vu0 k12 = k1(i15);
                            if (k12 != null && k12.f32551s != null) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= k12.f32551s.f17404i.size()) {
                                        break;
                                    } else if (i12 == ((MessageObject) k12.f32551s.f17404i.get(i17)).getId()) {
                                        i16 = i17;
                                        break;
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                            i10 = i16;
                        } else if (i15 >= 0) {
                            nu0[] nu0VarArr = this.f33643q1;
                            if (i15 < nu0VarArr.length) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= nu0VarArr[i15].f29580a.size()) {
                                        break;
                                    } else if (i12 == ((MessageObject) nu0VarArr[i15].f29580a.get(i18)).getId()) {
                                        i16 = i18;
                                        break;
                                    } else {
                                        i18++;
                                    }
                                }
                                i10 = nu0VarArr[i15].f29590m + i16;
                            }
                        }
                        if (i16 >= 0) {
                            ((f2.j0) wr0Var.getLayoutManager()).h1(i10, (-qt0VarArr[i11].h.getPaddingTop()) + i13);
                            if (this.l1) {
                                qt0 qt0Var = qt0VarArr[i11];
                                qt0Var.f30523s.h1(i10, (-qt0Var.h.getPaddingTop()) + i13);
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
        ns0 ns0Var;
        if (!this.I1 && (ns0Var = this.F0) != null) {
            ns0Var.h(null, i10, ns0Var.M.get(i10));
        }
    }

    public final int Z(int i10) {
        float f10;
        int i11;
        int dp = AndroidUtilities.dp(54.0f) + this.Y1;
        sr0 sr0Var = this.T;
        if (sr0Var != null && (w0(i10) || i10 == 8)) {
            f10 = sr0Var.getVisibilityFactor() * AndroidUtilities.dp(40.0f);
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
        ns0 ns0Var = this.F0;
        if (ns0Var != null) {
            if (w0(i10)) {
                i11 = 8;
            } else {
                i11 = i10;
            }
            ns0Var.j(f10, i11);
        }
        sr0 sr0Var = this.T;
        if (sr0Var != null) {
            k81 k81Var = sr0Var.f40297n;
            if (w0(i10)) {
                k81Var.f(f10, h1(i10));
            } else if (i10 == 8) {
                k81Var.f(f10, 0);
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
        qt0[] qt0VarArr = this.f33625h0;
        qt0 qt0Var = qt0VarArr[1];
        or0 or0Var = this.S;
        if (qt0Var != null && ((i12 = qt0Var.C) == 0 || (((i12 == 8 || w0(i12)) && TextUtils.isEmpty(getStoriesHashtag())) || (i13 = qt0VarArr[1].C) == 9 || i13 == 11 || i13 == 13 || (i13 == 14 && or0Var != null)))) {
            f11 = 0.0f + f10;
        }
        qt0 qt0Var2 = qt0VarArr[0];
        if (qt0Var2 != null && ((i10 = qt0Var2.C) == 0 || (((i10 == 8 || w0(i10)) && TextUtils.isEmpty(getStoriesHashtag())) || (i11 = qt0VarArr[0].C) == 9 || i11 == 11 || i11 == 13 || (i11 == 14 && or0Var != null)))) {
            return (1.0f - f10) + f11;
        }
        return f11;
    }

    public final void a1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i10 = 0;
        while (true) {
            qt0[] qt0VarArr = this.f33625h0;
            if (i10 < qt0VarArr.length) {
                qt0 qt0Var = qt0VarArr[i10];
                if (qt0Var.C != 7 || qt0Var.h.getAdapter() == null || qt0VarArr[i10].h.getAdapter().h() == 0 || this.f33649s1.getMessagesController().getStoriesController().f17779j.size() <= 0) {
                    i10++;
                } else {
                    return;
                }
            } else {
                if (this.C == 0) {
                    ht0 ht0Var = this.U;
                    ht0Var.d = chatFull;
                    ht0Var.f27625e = arrayList;
                }
                v1(true);
                for (int i11 = 0; i11 < qt0VarArr.length; i11++) {
                    qt0 qt0Var2 = qt0VarArr[i11];
                    if (qt0Var2.C == 7 && qt0Var2.h.getAdapter() != null) {
                        AndroidUtilities.notifyDataSetChanged(qt0VarArr[i11].h);
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
        qt0[] qt0VarArr = this.f33625h0;
        qt0 qt0Var = qt0VarArr[1];
        if (qt0Var != null && s0(qt0Var.C) && qt0VarArr[1].C != 11) {
            f11 = 0.0f + f10;
        }
        qt0 qt0Var2 = qt0VarArr[0];
        if (qt0Var2 != null && s0(qt0Var2.C) && qt0VarArr[0].C != 11) {
            return (1.0f - f10) + f11;
        }
        return f11;
    }

    public void b1(boolean z4) {
        float f10;
        if (this.f33666z1 != z4) {
            this.f33666z1 = z4;
            AnimatorSet animatorSet = this.K1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            z9 z9Var = this.f33663y0;
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
        vu0 k12;
        oh.l6 l6Var;
        if (p0(i10) && (k12 = k1(i10)) != null && (l6Var = k12.f32551s) != null) {
            return l6Var.g();
        }
        return 0;
    }

    public final void c1(int r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yu0.c1(int, boolean):void");
    }

    public final void d1(int i10) {
        int h12 = h1(getClosestTab());
        sr0 sr0Var = this.T;
        if (h12 != i10) {
            if (sr0Var != null) {
                sr0Var.f40297n.d(i10, sr0Var.f40299s.i(i10));
                return;
            }
            return;
        }
        sr0Var.setReorderingAlbums(true);
        xu0 i12 = i1(i10);
        qt0 W = W(i12.f33177a);
        if (W == null) {
            return;
        }
        wr0 wr0Var = W.h;
        for (int i11 = 0; i11 < wr0Var.getChildCount(); i11++) {
            View childAt = wr0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.r7) {
                ((org.telegram.ui.Cells.r7) childAt).l(true, true);
            }
        }
        wu0 wu0Var = i12.f33179c;
        if (wu0Var != null && !wu0Var.f32553x) {
            wu0Var.f32553x = true;
        }
        q1(true);
    }

    @Override
    public final void didReceivedNotification(int r42, int r43, java.lang.Object... r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yu0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ns0 ns0Var = this.F0;
        if (ns0Var != null) {
            canvas.save();
            canvas.translate(ns0Var.getX(), ns0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        js0 js0Var = this.O0;
        if (js0Var != null) {
            int i10 = js0Var.Q;
            if ((i10 == 3 || i10 == 1) && this.M0 == null) {
                canvas.save();
                canvas.translate(js0Var.getX(), js0Var.getY());
                js0Var.setDrawOverlay(true);
                js0Var.draw(canvas);
                js0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i10;
        if (view == this.O0 && this.M0 == null) {
            canvas.save();
            qt0[] qt0VarArr = this.f33625h0;
            float top = qt0VarArr[0].getTop();
            sr0 sr0Var = this.T;
            if (sr0Var != null && ((i10 = qt0VarArr[0].C) == 8 || w0(i10))) {
                top -= sr0Var.getVisualHeight();
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
        org.telegram.ui.ActionBar.p2 p2Var = this.f33649s1;
        if (p2Var != null && p2Var.getMessagesController().getStoriesController().I(r2Var.getDialogId())) {
            p2Var.getOrCreateStoryViewer().getClass();
            oh.i9 orCreateStoryViewer = p2Var.getOrCreateStoryViewer();
            Context context = p2Var.getContext();
            long dialogId = r2Var.getDialogId();
            oh.c7 a10 = oh.c7.a((sl0) r2Var.getParent());
            if ((p2Var instanceof ProfileActivity) && ((ProfileActivity) p2Var).f34667p1) {
                i10 = AndroidUtilities.dp(68.0f);
            } else {
                i10 = 0;
            }
            a10.f16950s += i10;
            orCreateStoryViewer.D(context, dialogId, a10);
        }
    }

    public final void e1(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yu0.e1(boolean):void");
    }

    public final float f0(int i10, boolean z4) {
        float width = getWidth();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            qt0[] qt0VarArr = this.f33625h0;
            if (i11 >= qt0VarArr.length) {
                break;
            }
            qt0 qt0Var = qt0VarArr[i11];
            if (qt0Var != null) {
                int i13 = qt0Var.C;
                if ((z4 && i10 == 8 && w0(i13)) || i13 == i10) {
                    i12++;
                    width = qt0VarArr[i11].getTranslationX();
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
            qt0[] qt0VarArr = this.f33625h0;
            if (i10 < qt0VarArr.length) {
                int childCount = qt0VarArr[i10].h.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = qt0VarArr[i10].h.getChildAt(i11);
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
            qt0[] qt0VarArr = this.f33625h0;
            if (i11 < qt0VarArr.length) {
                qt0 qt0Var = qt0VarArr[i11];
                if (qt0Var != null) {
                    int i12 = qt0Var.C;
                    if ((z4 && i10 == 8 && w0(i12)) || i12 == i10) {
                        f10 = (1.0f - Math.abs(qt0VarArr[i11].getTranslationX() / getWidth())) + f10;
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
        qt0 qt0Var;
        qt0 qt0Var2;
        int measuredWidth2;
        qt0 qt0Var3;
        qt0 qt0Var4;
        boolean z10;
        VelocityTracker velocityTracker = this.f33664y1;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.P0);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f10 = this.f33664y1.getXVelocity();
                f11 = this.f33664y1.getYVelocity();
                if (!this.f33653u1 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
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
            if (this.f33653u1) {
                qt0[] qt0VarArr = this.f33625h0;
                float x10 = qt0VarArr[0].getX();
                this.f33614c1 = new AnimatorSet();
                if (Math.abs(x10) < qt0VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f33622f1 = z4;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new k70(this, 19));
                boolean z11 = this.f33622f1;
                Property property = View.TRANSLATION_X;
                if (z11) {
                    measuredWidth = Math.abs(x10);
                    if (this.f33619e1) {
                        this.f33614c1.playTogether(ObjectAnimator.ofFloat(qt0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(qt0VarArr[1], property, qt0Var4.getMeasuredWidth()), ofFloat);
                    } else {
                        this.f33614c1.playTogether(ObjectAnimator.ofFloat(qt0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(qt0VarArr[1], property, -qt0Var3.getMeasuredWidth()), ofFloat);
                    }
                } else {
                    measuredWidth = qt0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                    if (this.f33619e1) {
                        this.f33614c1.playTogether(ObjectAnimator.ofFloat(qt0VarArr[0], property, -qt0Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(qt0VarArr[1], property, 0.0f), ofFloat);
                    } else {
                        this.f33614c1.playTogether(ObjectAnimator.ofFloat(qt0VarArr[0], property, qt0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(qt0VarArr[1], property, 0.0f), ofFloat);
                    }
                }
                this.f33614c1.setInterpolator(f33605b2);
                int measuredWidth3 = getMeasuredWidth();
                float f12 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f12) + f12;
                float abs = Math.abs(f10);
                if (abs > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                this.f33614c1.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                this.f33614c1.addListener(new qs0(this, 1));
                this.f33614c1.start();
                this.f33616d1 = true;
                this.f33653u1 = false;
                L0();
            } else {
                this.f33655v1 = false;
                this.D.setEnabled(true);
                this.F0.setEnabled(true);
            }
            VelocityTracker velocityTracker2 = this.f33664y1;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f33664y1 = null;
            }
        }
    }

    public SparseArray<MessageObject> getActionModeSelected() {
        return this.W0[0];
    }

    public float getBottomButtonStoriesVisibility() {
        qt0 qt0Var;
        qt0 qt0Var2;
        boolean z4;
        boolean z10;
        oh.l6 l6Var;
        oh.l6 l6Var2;
        float f10 = 1.0f;
        qt0[] qt0VarArr = this.f33625h0;
        if (qt0VarArr == null || (qt0Var = qt0VarArr[0]) == null || (qt0Var2 = qt0VarArr[1]) == null || qt0Var.f30524w == null || qt0Var2.f30524w == null) {
            return 1.0f;
        }
        int i10 = qt0Var.C;
        int i11 = qt0Var2.C;
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
        float visibilityFactor = 1.0f - qt0VarArr[0].f30524w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - qt0VarArr[1].f30524w.getVisibilityFactor();
        vu0 k12 = k1(qt0VarArr[0].C);
        if (i10 == 8 || (k12 != null && (l6Var2 = k12.f32551s) != null && l6Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        vu0 k13 = k1(i11);
        if (i11 != 8 && (k13 == null || (l6Var = k13.f32551s) == null || l6Var.g() <= 0)) {
            f10 = visibilityFactor2;
        }
        if (!z4) {
            visibilityFactor = f10;
        }
        if (!z10) {
            f10 = visibilityFactor;
        }
        return AndroidUtilities.lerp(visibilityFactor, f10, Math.abs(qt0VarArr[0].getTranslationX() / qt0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        qt0[] qt0VarArr = this.f33625h0;
        qt0 qt0Var = qt0VarArr[1];
        if (qt0Var != null && qt0Var.getVisibility() == 0) {
            if (this.f33616d1 && !this.f33622f1) {
                return qt0VarArr[1].C;
            }
            if (Math.abs(qt0VarArr[1].getTranslationX()) < qt0VarArr[1].getMeasuredWidth() / 2.0f) {
                return qt0VarArr[1].C;
            }
        }
        return getSelectedTab();
    }

    public sl0 getCurrentListView() {
        dt0 dt0Var;
        qt0 qt0Var = this.f33625h0[0];
        int i10 = qt0Var.C;
        if (i10 == 13) {
            return this.R.getCurrentListView();
        }
        if (i10 == 14) {
            return this.S.getCurrentListView();
        }
        if (i10 == 12 && (dt0Var = this.Q) != null) {
            return dt0Var.f43986a.f43340u0;
        }
        return qt0Var.h;
    }

    public int getInitialTab() {
        return 0;
    }

    public int getPhotosVideosTypeFilter() {
        return this.f33643q1[0].f29594q;
    }

    public TextView getSaveItem() {
        return this.f33636n0;
    }

    public org.telegram.ui.ActionBar.w0 getSearchItem() {
        return this.f33631k0;
    }

    public kj0 getSearchOptionsItem() {
        return this.f33640p0;
    }

    public int getSelectedTab() {
        int currentTabId = this.F0.getCurrentTabId();
        sr0 sr0Var = this.T;
        if (sr0Var != null && currentTabId == 8) {
            int currentAlbumId = sr0Var.getCurrentAlbumId();
            if (currentAlbumId == 0) {
                return 8;
            }
            if (currentAlbumId > 0) {
                return i1(currentAlbumId).f33177a;
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
            qt0[] qt0VarArr = this.f33625h0;
            if (i10 < qt0VarArr.length) {
                qt0 qt0Var = qt0VarArr[i10];
                if (qt0Var != null) {
                    f10 = ((1.0f - Math.abs(qt0Var.getTranslationX() / getWidth())) * qt0Var.C) + f10;
                }
                i10++;
            } else {
                return f10;
            }
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.m6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.m6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f33660x0, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.f22055z6));
        org.telegram.ui.ActionBar.w0 w0Var = this.f33627i0;
        kj0 iconView = w0Var.getIconView();
        int i10 = org.telegram.ui.ActionBar.k6.f22040y8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(iconView, 8, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.f22057z8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(w0Var, 32, null, null, null, null, i11));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f33645r0;
        if (w0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(w0Var2.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.m6(w0Var2, 32, null, null, null, null, i11));
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f33642q0;
        if (w0Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(w0Var3.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.m6(w0Var3, 32, null, null, null, null, i11));
        }
        Drawable[] drawableArr = {this.A0};
        ImageView imageView = this.f33665z0;
        arrayList.add(new org.telegram.ui.ActionBar.m6(imageView, 8, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(imageView, 32, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.f21661d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f33663y0, 1, null, null, null, null, i12));
        ns0 ns0Var = this.F0;
        arrayList.add(new org.telegram.ui.ActionBar.m6(ns0Var, 1, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.k6.f22006wc;
        org.telegram.ui.Cells.v0 v0Var = this.H0;
        arrayList.add(new org.telegram.ui.ActionBar.m6(v0Var, 0, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(v0Var, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21794kd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(ns0Var, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Gh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(ns0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.k6.Fh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(ns0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.k6.Eh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(ns0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.k6.Hh));
        js0 js0Var = this.O0;
        if (js0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(js0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21982v7));
            arrayList.add(new org.telegram.ui.ActionBar.m6(js0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f22001w7));
            arrayList.add(new org.telegram.ui.ActionBar.m6(js0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21964u7));
            arrayList.add(new org.telegram.ui.ActionBar.m6(js0Var, 33554436, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21947t7));
            arrayList.add(new org.telegram.ui.ActionBar.m6(js0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f22020x7));
            arrayList.add(new org.telegram.ui.ActionBar.m6(js0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f22039y7));
            arrayList.add(new org.telegram.ui.ActionBar.m6(js0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.A7));
        }
        final int i14 = 0;
        while (true) {
            qt0[] qt0VarArr = this.f33625h0;
            if (i14 < qt0VarArr.length) {
                org.telegram.ui.ActionBar.l6 l6Var = new org.telegram.ui.ActionBar.l6() {
                    @Override
                    public final void b() {
                        qt0[] qt0VarArr2 = yu0.this.f33625h0;
                        int i15 = i14;
                        wr0 wr0Var = qt0VarArr2[i15].h;
                        if (wr0Var != null) {
                            int childCount = wr0Var.getChildCount();
                            for (int i16 = 0; i16 < childCount; i16++) {
                                View childAt = qt0VarArr2[i15].h.getChildAt(i16);
                                if (childAt instanceof org.telegram.ui.Cells.s7) {
                                    org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) childAt;
                                    for (int i17 = 0; i17 < 6; i17++) {
                                        s7Var.f23744a[i17].f23308e.invalidate();
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
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21781k0, null, null, org.telegram.ui.ActionBar.k6.f21662d7));
                fs0 fs0Var = qt0VarArr[i14].v;
                int i15 = org.telegram.ui.ActionBar.k6.f21661d6;
                arrayList.add(new org.telegram.ui.ActionBar.m6(fs0Var, 0, null, null, null, null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.f21932s8));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21752i6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].f30524w, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.f21644c7));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 524288, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21699f7));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21680e7));
                int i16 = org.telegram.ui.ActionBar.k6.f21734h6;
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21974uh));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21823m6));
                int i17 = org.telegram.ui.ActionBar.k6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
                int i18 = org.telegram.ui.ActionBar.k6.f22038y6;
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, null, null, -1, l6Var, i18));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, null, null, -1, l6Var, org.telegram.ui.ActionBar.k6.f21841n6));
                Drawable[] drawableArr2 = org.telegram.ui.ActionBar.k6.f21908r0;
                int i19 = org.telegram.ui.ActionBar.k6.J7;
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, null, drawableArr2, null, i19));
                TextPaint[] textPaintArr = org.telegram.ui.ActionBar.k6.B0;
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.k6.D0}, null, -1, null, org.telegram.ui.ActionBar.k6.X8));
                TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.k6.C0;
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.k6.E0}, null, -1, null, org.telegram.ui.ActionBar.k6.Z8));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, drawableArr2, null, i19));
                arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, l6Var, org.telegram.ui.ActionBar.k6.O7));
                arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, l6Var, org.telegram.ui.ActionBar.k6.P7));
                arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, l6Var, org.telegram.ui.ActionBar.k6.Q7));
                arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, l6Var, org.telegram.ui.ActionBar.k6.R7));
                arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, l6Var, org.telegram.ui.ActionBar.k6.S7));
                arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, l6Var, org.telegram.ui.ActionBar.k6.T7));
                arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, l6Var, org.telegram.ui.ActionBar.k6.U7));
                int i20 = org.telegram.ui.ActionBar.k6.f22055z6;
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 4, new Class[]{kt0.class}, new String[]{"emptyTextView"}, null, null, -1, null, i20));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.A6));
                int i21 = org.telegram.ui.ActionBar.k6.Ih;
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 2048, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"progressView"}, null, null, -1, null, i21));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"statusImageView"}, null, null, -1, null, i21));
                int i22 = org.telegram.ui.ActionBar.k6.f21753i7;
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                int i23 = org.telegram.ui.ActionBar.k6.f21788k7;
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.zi));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Bi));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.k6.f21695f3, null, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.k6.f21713g3, null, null, i20));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.l7.class}, null, null, null, org.telegram.ui.ActionBar.k6.J6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.l7.class}, org.telegram.ui.ActionBar.k6.m0, null, null, org.telegram.ui.ActionBar.k6.K6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Kh));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 32, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Jh));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.m7.class}, null, null, null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 524288, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"textView"}, null, null, -1, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"textView"}, null, null, -1, null, i17));
                int i24 = org.telegram.ui.ActionBar.k6.Lh;
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.s7.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.s7.class}, null, null, l6Var, i22));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.s7.class}, null, null, l6Var, i23));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.e2.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, l6Var, i22));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, l6Var, i23));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].h, 0, null, null, new Drawable[]{this.f33654v0}, null, org.telegram.ui.ActionBar.k6.f21626b7));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].f30524w.d, 4, null, null, null, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.m6(qt0VarArr[i14].f30524w.f34033e, 4, null, null, null, null, i18));
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
        xu0 j12 = j1(i10);
        if (j12 == null) {
            return -1;
        }
        return j12.f33178b;
    }

    public final boolean i0() {
        if (this.f33649s1.getConnectionsManager().getConnectionState() == 3) {
            return true;
        }
        return false;
    }

    public final xu0 i1(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.V1;
        xu0 xu0Var = (xu0) hashMap.get(valueOf);
        if (xu0Var == null) {
            xu0 xu0Var2 = new xu0(this, getContext(), i10);
            hashMap.put(Integer.valueOf(i10), xu0Var2);
            this.W1.put(Integer.valueOf(xu0Var2.f33177a), Integer.valueOf(i10));
            return xu0Var2;
        }
        return xu0Var;
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

    public final xu0 j1(int i10) {
        Integer num = (Integer) this.W1.get(Integer.valueOf(i10));
        if (num == null) {
            return null;
        }
        return (xu0) this.V1.get(num);
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
        this.I0.setInterpolator(pr.f30169g);
        this.I0.addListener(new qs0(this, 0));
        this.I0.start();
    }

    public final vu0 k1(int i10) {
        xu0 j12;
        if (i10 == 8) {
            return this.W;
        }
        if (i10 == 9) {
            return this.f33610b0;
        }
        if (w0(i10) && (j12 = j1(i10)) != null) {
            return j12.f33179c;
        }
        return null;
    }

    public boolean l0() {
        return false;
    }

    public final vu0 l1(int i10) {
        xu0 j12;
        if (i10 == 8) {
            return this.f33607a0;
        }
        if (i10 == 9) {
            return this.f33613c0;
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
        qt0[] qt0VarArr;
        qt0[] qt0VarArr2;
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
        nu0[] nu0VarArr;
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
        or0 or0Var = this.S;
        if (or0Var != null) {
            or0Var.i();
        }
        int i22 = 0;
        while (true) {
            qt0VarArr = this.f33625h0;
            if (i22 >= qt0VarArr.length) {
                break;
            }
            qt0VarArr[i22].h.B0();
            i22++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qt0VarArr[z4 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = AndroidUtilities.dp(B0());
        f2.p0 adapter = qt0VarArr[z4 ? 1 : 0].h.getAdapter();
        f2.p0 p0Var = this.W;
        f2.f0 f0Var = this.V;
        if (adapter == p0Var) {
            f0Var.d(null);
        }
        boolean z22 = this.S0;
        jt0 jt0Var = this.A1;
        String str4 = "";
        eu0 eu0Var = this.K;
        org.telegram.ui.ActionBar.w0 w0Var = this.f33631k0;
        int i23 = 100;
        if (z22 && this.R0) {
            qt0 qt0Var = qt0VarArr[z4 ? 1 : 0];
            if (qt0Var.f30520f == null) {
                qt0Var.f30520f = new f2.c1();
            }
            qt0 qt0Var2 = qt0VarArr[z4 ? 1 : 0];
            c1Var2 = qt0Var2.f30520f;
            ju0 ju0Var = this.P;
            ot0 ot0Var = this.f33623g0;
            tt0 tt0Var = this.f33618e0;
            tt0 tt0Var2 = this.f33621f0;
            tt0 tt0Var3 = this.f33615d0;
            if (z4) {
                int i24 = qt0Var2.C;
                if (i24 != 0 && i24 != 2 && i24 != 5 && i24 != 6 && (i24 != 7 || jt0Var.T())) {
                    if (w0Var != null) {
                        str4 = w0Var.getSearchField().getText().toString();
                    }
                    int i25 = qt0VarArr[z4 ? 1 : 0].C;
                    if (i25 == 1) {
                        if (tt0Var3 != null) {
                            tt0Var3.G(str4, false);
                            if (adapter != tt0Var3) {
                                W0(adapter);
                                qt0VarArr[z4 ? 1 : 0].h.setAdapter(tt0Var3);
                            }
                        }
                    } else if (i25 == 3) {
                        if (tt0Var2 != null) {
                            tt0Var2.G(str4, false);
                            if (adapter != tt0Var2) {
                                W0(adapter);
                                qt0VarArr[z4 ? 1 : 0].h.setAdapter(tt0Var2);
                            }
                        }
                    } else if (i25 == 4) {
                        if (tt0Var != null) {
                            tt0Var.G(str4, false);
                            if (adapter != tt0Var) {
                                W0(adapter);
                                qt0VarArr[z4 ? 1 : 0].h.setAdapter(tt0Var);
                            }
                        }
                    } else if (i25 == 7) {
                        if (ot0Var != null) {
                            ot0Var.F(str4, false);
                            if (adapter != ot0Var) {
                                W0(adapter);
                                qt0VarArr[z4 ? 1 : 0].h.setAdapter(ot0Var);
                            }
                        }
                    } else if (i25 == 11) {
                        if (ju0Var != null) {
                            ju0Var.E(this.T0, str4);
                            if (adapter != ju0Var) {
                                W0(adapter);
                                qt0VarArr[z4 ? 1 : 0].h.setAdapter(ju0Var);
                            }
                        }
                    } else if (i25 == 15 && eu0Var != null && adapter != eu0Var) {
                        W0(adapter);
                        wr0 wr0Var = qt0VarArr[z4 ? 1 : 0].h;
                        eu0Var.f26667r = wr0Var;
                        wr0Var.setAdapter(eu0Var);
                    }
                } else {
                    this.S0 = false;
                    ks0 ks0Var = this.G0;
                    if (ks0Var != null) {
                        ks0Var.g(false);
                    }
                    this.R0 = false;
                    m1(true);
                    return;
                }
            } else if (qt0Var2.h != null) {
                int i26 = qt0Var2.C;
                if (i26 == 1) {
                    if (adapter != tt0Var3) {
                        W0(adapter);
                        qt0VarArr[z4 ? 1 : 0].h.setAdapter(tt0Var3);
                    }
                    tt0Var3.l();
                } else if (i26 == 3) {
                    if (adapter != tt0Var2) {
                        W0(adapter);
                        qt0VarArr[z4 ? 1 : 0].h.setAdapter(tt0Var2);
                    }
                    tt0Var2.l();
                } else if (i26 == 4) {
                    if (adapter != tt0Var) {
                        W0(adapter);
                        qt0VarArr[z4 ? 1 : 0].h.setAdapter(tt0Var);
                    }
                    tt0Var.l();
                } else if (i26 == 7) {
                    if (adapter != ot0Var) {
                        W0(adapter);
                        qt0VarArr[z4 ? 1 : 0].h.setAdapter(ot0Var);
                    }
                    ot0Var.l();
                } else if (i26 == 11) {
                    if (adapter != ju0Var) {
                        W0(adapter);
                        qt0VarArr[z4 ? 1 : 0].h.setAdapter(ju0Var);
                    }
                    ju0Var.l();
                }
            }
            qt0VarArr2 = qt0VarArr;
            z19 = false;
            z18 = false;
            i16 = 100;
        } else {
            qt0 qt0Var3 = qt0VarArr[z4 ? 1 : 0];
            if (qt0Var3.f30519e == null) {
                qt0Var3.f30519e = new f2.c1();
            }
            qt0 qt0Var4 = qt0VarArr[z4 ? 1 : 0];
            f2.c1 c1Var3 = qt0Var4.f30519e;
            qt0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i27 = qt0VarArr[z4 ? 1 : 0].C;
            if (i27 == 8 || w0(i27)) {
                layoutParams.topMargin = AndroidUtilities.dp(B0());
            }
            wr0 wr0Var2 = qt0VarArr[z4 ? 1 : 0].h;
            int paddingLeft = wr0Var2.getPaddingLeft();
            qt0 qt0Var5 = qt0VarArr[z4 ? 1 : 0];
            wr0 wr0Var3 = qt0Var5.h;
            int Z = Z(qt0Var5.C);
            wr0Var3.f30186a3 = Z;
            int paddingRight = qt0VarArr[z4 ? 1 : 0].h.getPaddingRight();
            qt0VarArr2 = qt0VarArr;
            wr0 wr0Var4 = qt0VarArr2[z4 ? 1 : 0].h;
            int Y = Y(v0());
            wr0Var4.f30187b3 = Y;
            wr0Var2.setPadding(paddingLeft, Z, paddingRight, Y);
            int i28 = qt0VarArr2[z4 ? 1 : 0].C;
            int[] iArr = this.f33630j1;
            f2.p0 p0Var2 = this.H;
            View view = this.R;
            dt0 dt0Var = this.Q;
            hu0 hu0Var = this.O;
            it0 it0Var = this.M;
            nu0[] nu0VarArr2 = this.f33643q1;
            if (i28 == 0) {
                f2.p0 p0Var3 = this.E;
                if (adapter != p0Var3) {
                    W0(adapter);
                    qt0VarArr2[z4 ? 1 : 0].h.setAdapter(p0Var3);
                }
                int i29 = -AndroidUtilities.dp(1.0f);
                layoutParams.rightMargin = i29;
                layoutParams.leftMargin = i29;
                nu0 nu0Var = nu0VarArr2[0];
                if (nu0Var.h && !nu0Var.f29583e.isEmpty()) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                i23 = iArr[0];
                qt0VarArr2[z4 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.f33654v0);
                nu0 nu0Var2 = nu0VarArr2[0];
                if (nu0Var2.f29600x == null) {
                    nu0Var2.f29600x = new f2.c1();
                }
                z12 = z21;
                c1Var = nu0VarArr2[0].f29600x;
                z10 = false;
            } else {
                if (i28 == 1) {
                    nu0 nu0Var3 = nu0VarArr2[1];
                    if (nu0Var3.h && !nu0Var3.f29583e.isEmpty()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (adapter != p0Var2) {
                        W0(adapter);
                        qt0VarArr2[z4 ? 1 : 0].h.setAdapter(p0Var2);
                    }
                } else if (i28 == 2) {
                    nu0 nu0Var4 = nu0VarArr2[2];
                    if (nu0Var4.h && !nu0Var4.f29583e.isEmpty()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (adapter != this.I) {
                        W0(adapter);
                        qt0VarArr2[z4 ? 1 : 0].h.setAdapter(this.I);
                    }
                } else {
                    if (i28 == 3) {
                        if (adapter != this.G) {
                            W0(adapter);
                            qt0VarArr2[z4 ? 1 : 0].h.setAdapter(this.G);
                        }
                    } else if (i28 == 4) {
                        nu0 nu0Var5 = nu0VarArr2[4];
                        if (nu0Var5.h && !nu0Var5.f29583e.isEmpty()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (adapter != this.J) {
                            W0(adapter);
                            qt0VarArr2[z4 ? 1 : 0].h.setAdapter(this.J);
                        }
                    } else {
                        if (i28 == 5) {
                            if (adapter != this.L) {
                                W0(adapter);
                                qt0VarArr2[z4 ? 1 : 0].h.setAdapter(this.L);
                            }
                        } else if (i28 == 15) {
                            if (adapter != eu0Var) {
                                W0(adapter);
                                wr0 wr0Var5 = qt0VarArr2[z4 ? 1 : 0].h;
                                eu0Var.f26667r = wr0Var5;
                                wr0Var5.setAdapter(eu0Var);
                            }
                        } else if (i28 == 6) {
                            if (adapter != it0Var) {
                                W0(adapter);
                                qt0VarArr2[z4 ? 1 : 0].h.setAdapter(it0Var);
                            }
                        } else if (i28 == 7) {
                            if (adapter != this.U) {
                                W0(adapter);
                                qt0VarArr2[z4 ? 1 : 0].h.setAdapter(this.U);
                            }
                        } else if (p0(i28)) {
                            f2.p0 k12 = k1(qt0VarArr2[z4 ? 1 : 0].C);
                            if (adapter != k12) {
                                W0(adapter);
                                qt0VarArr2[z4 ? 1 : 0].h.setAdapter(k12);
                                qt0VarArr2[z4 ? 1 : 0].h.getClass();
                            }
                            qt0 qt0Var6 = qt0VarArr2[z4 ? 1 : 0];
                            if (qt0Var6.C != 9) {
                                f0Var.d(qt0Var6.h);
                            }
                            i23 = iArr[1];
                        } else {
                            int i30 = qt0VarArr2[z4 ? 1 : 0].C;
                            if (i30 == 10) {
                                if (adapter != this.N) {
                                    W0(adapter);
                                    qt0VarArr2[z4 ? 1 : 0].h.setAdapter(this.N);
                                }
                            } else if (i30 == 11) {
                                if (adapter != hu0Var) {
                                    W0(adapter);
                                    qt0VarArr2[z4 ? 1 : 0].h.setAdapter(hu0Var);
                                    f2.f0 f0Var2 = hu0Var.v;
                                    wr0 wr0Var6 = qt0VarArr2[z4 ? 1 : 0].h;
                                    hu0Var.f27634s = wr0Var6;
                                    f0Var2.d(wr0Var6);
                                }
                                c1Var = hu0Var.f27633r;
                                z10 = true;
                                z12 = false;
                            } else if (i30 == 12) {
                                if (adapter != null) {
                                    W0(adapter);
                                    qt0VarArr2[z4 ? 1 : 0].h.setAdapter(null);
                                }
                                if (dt0Var.getParent() != qt0VarArr2[z4 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(dt0Var);
                                    qt0VarArr2[z4 ? 1 : 0].addView(dt0Var, k7.c6.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                }
                            } else if (i30 == 13) {
                                if (adapter != null) {
                                    W0(adapter);
                                    qt0VarArr2[z4 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != qt0VarArr2[z4 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(view);
                                    qt0VarArr2[z4 ? 1 : 0].addView(view);
                                }
                            } else if (i30 == 14) {
                                if (adapter != null) {
                                    W0(adapter);
                                    qt0VarArr2[z4 ? 1 : 0].h.setAdapter(null);
                                }
                                if (or0Var != null && or0Var.getParent() != qt0VarArr2[z4 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(or0Var);
                                    qt0VarArr2[z4 ? 1 : 0].addView(or0Var);
                                    qt0VarArr2[z4 ? 1 : 0].f30524w.setVisibility(4);
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
            int i31 = qt0VarArr2[z4 ? 1 : 0].C;
            if (i31 != 0 && !p0(i31)) {
                z13 = false;
            } else {
                z13 = true;
            }
            fs0 fs0Var = qt0VarArr2[z4 ? 1 : 0].v;
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
            fs0Var.setLayoutParams(k7.c6.d(-1, -1.0f, 119, f10, f13, f11, f12));
            if (z10) {
                qt0VarArr2[z4 ? 1 : 0].h.setSections(false);
            } else {
                wr0 wr0Var7 = qt0VarArr2[z4 ? 1 : 0].h;
                wr0Var7.getClass();
                wr0Var7.setSelectorDrawableColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21752i6, wr0Var7.f31106m2));
                wr0Var7.F2 = null;
                wr0Var7.I2 = 0.0f;
                wr0Var7.J2 = null;
                wr0Var7.K2 = null;
                wr0Var7.G2 = null;
                gl0 gl0Var = wr0Var7.E2;
                if (gl0Var != null) {
                    wr0Var7.p0(gl0Var);
                    wr0Var7.E2 = null;
                }
            }
            qt0 qt0Var7 = qt0VarArr2[z4 ? 1 : 0];
            int i32 = qt0Var7.C;
            org.telegram.ui.ActionBar.p2 p2Var = this.f33649s1;
            if (i32 == 15) {
                z14 = z12;
                nu0VarArr = nu0VarArr2;
                str = "";
                qt0Var7.setBackground(qh.i5.e(qt0Var7.getBackground(), p2Var.getCurrentAccount(), this.f33624g1, org.telegram.ui.ActionBar.k6.I.q()));
                qt0VarArr2[z4 ? 1 : 0].setOutlineProvider(new hg.j1(12));
                qt0VarArr2[z4 ? 1 : 0].setClipToOutline(true);
                r52 = 0;
            } else {
                z14 = z12;
                nu0VarArr = nu0VarArr2;
                str = "";
                qt0Var7.setClipToOutline(false);
                r52 = 0;
                qt0VarArr2[z4 ? 1 : 0].setBackground(null);
            }
            qt0 qt0Var8 = qt0VarArr2[z4 ? 1 : 0];
            if (qt0Var8.C == 11) {
                qt0Var8.h.setItemAnimator(qt0Var8.d);
            } else {
                qt0Var8.h.setItemAnimator(r52);
                if (hu0Var != null && qt0VarArr2[z4 ? 1 : 0].h == hu0Var.f27634s) {
                    f2.f0 f0Var3 = hu0Var.v;
                    hu0Var.f27634s = r52;
                    f0Var3.d(r52);
                }
            }
            if (dt0Var != null && qt0VarArr2[z4 ? 1 : 0].C != 12 && dt0Var.getParent() == qt0VarArr2[z4 ? 1 : 0]) {
                dt0Var.f43986a.onRemoveFromParent();
                qt0VarArr2[z4 ? 1 : 0].removeView(dt0Var);
            }
            if (view != null && qt0VarArr2[z4 ? 1 : 0].C != 13) {
                ViewParent parent = view.getParent();
                qt0 qt0Var9 = qt0VarArr2[z4 ? 1 : 0];
                if (parent == qt0Var9) {
                    qt0Var9.removeView(view);
                }
            }
            if (or0Var != null && qt0VarArr2[z4 ? 1 : 0].C != 14) {
                ViewParent parent2 = or0Var.getParent();
                qt0 qt0Var10 = qt0VarArr2[z4 ? 1 : 0];
                if (parent2 == qt0Var10) {
                    qt0Var10.removeView(or0Var);
                }
            }
            int i33 = qt0VarArr2[z4 ? 1 : 0].C;
            if (i33 != 0 && i33 != 11 && !p0(i33) && (i17 = qt0VarArr2[z4 ? 1 : 0].C) != 2 && i17 != 5 && i17 != 6 && ((i17 != 7 || jt0Var.T()) && (i18 = qt0VarArr2[z4 ? 1 : 0].C) != 10 && i18 != 13 && i18 != 14)) {
                if (z4) {
                    if (w0Var != null && w0Var.getVisibility() == 4 && !this.D.f21548k0) {
                        if (D()) {
                            this.f33652u0 = 1;
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
                        this.f33633l0 = b0(f14);
                        s1(1.0f - f14);
                        z20 = false;
                    } else {
                        z20 = false;
                        this.f33652u0 = 0;
                        this.f33633l0 = 1.0f;
                    }
                } else {
                    z20 = false;
                    if (w0Var != null) {
                        if (w0Var.getVisibility() == 4) {
                            if (D()) {
                                this.f33652u0 = 0;
                                this.f33633l0 = 1.0f;
                                w0Var.setVisibility(0);
                            } else {
                                if (v0()) {
                                    i19 = 8;
                                } else {
                                    i19 = 4;
                                }
                                w0Var.setVisibility(i19);
                                this.f33633l0 = 0.0f;
                            }
                        }
                        q1(z20);
                    }
                }
                q1(z20);
            } else if (z4) {
                this.f33652u0 = 2;
            } else {
                this.f33652u0 = 0;
                if (w0Var != null) {
                    if (!v0() && !this.S0) {
                        i11 = 4;
                    } else {
                        i11 = 8;
                    }
                    w0Var.setVisibility(i11);
                }
            }
            int i34 = qt0VarArr2[z4 ? 1 : 0].C;
            if (i34 == 6) {
                if (!it0Var.f27898e && !it0Var.h && it0Var.d.isEmpty()) {
                    it0.E(it0Var, 0L);
                }
            } else if (i34 != 7) {
                if (p0(i34)) {
                    vu0 k13 = k1(qt0VarArr2[z4 ? 1 : 0].C);
                    if (k13 != null) {
                        oh.l6 l6Var = k13.f32551s;
                        k13.P();
                        hs0 hs0Var = qt0VarArr2[z4 ? 1 : 0].f30524w;
                        if (l6Var != null && (l6Var.k() || (i0() && l6Var.g() > 0))) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        hs0Var.e(z16, z4);
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
                    int i35 = qt0VarArr2[z4 ? 1 : 0].C;
                    if (i35 != 10 && i35 != 11 && i35 != 12 && i35 != 13 && i35 != 14) {
                        if (i35 == 15) {
                            i35 = 8;
                        }
                        nu0 nu0Var6 = nu0VarArr[i35];
                        if (!nu0Var6.f29585g && !nu0Var6.f29586i[0] && nu0Var6.f29580a.isEmpty()) {
                            nu0VarArr[i35].f29585g = true;
                            p0Var2.l();
                            if (i35 == 0) {
                                int i36 = nu0VarArr[0].f29594q;
                                if (i36 == 1) {
                                    i12 = 6;
                                } else if (i36 == 2) {
                                    i12 = 7;
                                }
                                p2Var.getMediaDataController().loadMedia(this.f33624g1, 50, 0, 0, i12, this.C, 1, p2Var.getClassGuid(), nu0VarArr[i12].f29593p, null, null);
                            }
                            i12 = i35;
                            p2Var.getMediaDataController().loadMedia(this.f33624g1, 50, 0, 0, i12, this.C, 1, p2Var.getClassGuid(), nu0VarArr[i12].f29593p, null, null);
                        }
                    }
                }
            }
            int i37 = qt0VarArr2[z4 ? 1 : 0].C;
            if (i37 != 8 && !w0(i37)) {
                qt0 qt0Var11 = qt0VarArr2[z4 ? 1 : 0];
                if (qt0Var11.C == 9) {
                    if (u0()) {
                        qt0VarArr2[z4 ? 1 : 0].f30524w.f34031b.setVisibility(8);
                        qt0VarArr2[z4 ? 1 : 0].f30524w.f34034f.setVisibility(8);
                    } else {
                        qt0VarArr2[z4 ? 1 : 0].f30524w.f34031b.setVisibility(0);
                        qt0VarArr2[z4 ? 1 : 0].f30524w.setStickerType(11);
                        qt0VarArr2[z4 ? 1 : 0].f30524w.f34034f.setVisibility(0);
                        qt0VarArr2[z4 ? 1 : 0].f30524w.f34034f.h(w());
                    }
                    qt0VarArr2[z4 ? 1 : 0].f30524w.d.setText(LocaleController.getString(R.string.NoArchivedStoriesTitle));
                    g90 g90Var = qt0VarArr2[z4 ? 1 : 0].f30524w.f34033e;
                    if (v0()) {
                        str3 = LocaleController.getString(R.string.NoArchivedStoriesSubtitle);
                    } else {
                        str3 = str;
                    }
                    g90Var.setText(str3);
                    qt0VarArr2[z4 ? 1 : 0].f30524w.f34034f.setOnClickListener(new wq0(this, 7));
                } else {
                    qt0Var11.f30524w.f34031b.setVisibility(0);
                    qt0VarArr2[z4 ? 1 : 0].f30524w.setStickerType(1);
                    qt0VarArr2[z4 ? 1 : 0].f30524w.d.setText(LocaleController.getString(R.string.NoResult));
                    qt0VarArr2[z4 ? 1 : 0].f30524w.f34033e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    qt0VarArr2[z4 ? 1 : 0].f30524w.f34034f.setVisibility(8);
                }
            } else {
                qt0 qt0Var12 = qt0VarArr2[z4 ? 1 : 0];
                hs0 hs0Var2 = qt0Var12.f30524w;
                boolean w02 = w0(qt0Var12.C);
                int h12 = h1(qt0VarArr2[z4 ? 1 : 0].C);
                p9 p9Var = hs0Var2.f34031b;
                qh.d dVar = hs0Var2.f34034f;
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
                    hs0Var2.setStickerType(11);
                    if (!t0()) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    dVar.setVisibility(i14);
                    dVar.h(w());
                }
                if (w02) {
                    hs0Var2.d.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeTitle));
                    hs0Var2.f34033e.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeDescription));
                } else {
                    jh.s sVar = hs0Var2.d;
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
                    g90 g90Var2 = hs0Var2.f34033e;
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
            qt0VarArr2[z4 ? 1 : 0].h.setVisibility(0);
            i16 = i23;
            z19 = z14;
            c1Var2 = c1Var4;
        }
        qt0 qt0Var13 = qt0VarArr2[z4 ? 1 : 0];
        qt0Var13.f30517b = z19;
        o1(qt0Var13, z18);
        qt0VarArr2[z4 ? 1 : 0].f30525x.y1(i16);
        qt0VarArr2[z4 ? 1 : 0].h.a0();
        if (c1Var2 != null) {
            qt0VarArr2[z4 ? 1 : 0].h.setRecycledViewPool(c1Var2);
            qt0VarArr2[z4 ? 1 : 0].f30522r.setRecycledViewPool(c1Var2);
        }
        if (this.f33652u0 == 2) {
            org.telegram.ui.ActionBar.k kVar = this.D;
            if (kVar.f21548k0) {
                this.f33657w0 = true;
                kVar.h(true);
                this.f33652u0 = 0;
                this.f33633l0 = 0.0f;
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
        qt0[] qt0VarArr;
        for (qt0 qt0Var : this.f33625h0) {
            wr0 wr0Var = qt0Var.h;
            Objects.requireNonNull(wr0Var);
            qt0Var.f30521n = new og.k(wr0Var, viewGroup, new bw(wr0Var, 4));
        }
        or0 or0Var = this.S;
        if (or0Var != null) {
            or0Var.P = viewGroup;
            or0Var.O = new lh.n2(or0Var, 0);
        }
    }

    public final void n1() {
        ct0 ct0Var = this.E;
        if (ct0Var != null) {
            ct0Var.l();
        }
        lu0 lu0Var = this.H;
        if (lu0Var != null) {
            lu0Var.l();
        }
        lu0 lu0Var2 = this.I;
        if (lu0Var2 != null) {
            lu0Var2.l();
        }
        mu0 mu0Var = this.G;
        if (mu0Var != null) {
            mu0Var.X(false);
        }
        lu0 lu0Var3 = this.J;
        if (lu0Var3 != null) {
            lu0Var3.l();
        }
        eu0 eu0Var = this.K;
        if (eu0Var != null) {
            eu0Var.l();
        }
        lt0 lt0Var = this.L;
        if (lt0Var != null) {
            lt0Var.l();
        }
        ft0 ft0Var = this.W;
        if (ft0Var != null) {
            ft0Var.l();
        }
        for (xu0 xu0Var : this.V1.values()) {
            xu0Var.f33179c.l();
        }
    }

    public final void o1(qt0 qt0Var, boolean z4) {
        boolean z10;
        Integer num = 1;
        int i10 = 0;
        if (qt0Var.f30517b && this.d) {
            z10 = true;
        } else {
            z10 = false;
        }
        bl0 fastScroll = qt0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = qt0Var.f30518c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            qt0Var.f30518c.cancel();
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
            qt0Var.f30518c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(num);
        } else if (!z10 && fastScroll.getTag() != null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, property, fastScroll.getAlpha(), 0.0f);
            ofFloat2.addListener(new x20(fastScroll));
            qt0Var.f30518c = ofFloat2;
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
            qt0[] qt0VarArr = this.f33625h0;
            if (i10 < qt0VarArr.length) {
                wr0 wr0Var = qt0VarArr[i10].h;
                if (wr0Var != null) {
                    wr0Var.getViewTreeObserver().addOnPreDrawListener(new ts0(this, i10, 0));
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
        jt0 jt0Var = this.A1;
        if (jt0Var.f() != null) {
            i12 = jt0Var.f().getHeight();
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
            } else if (childAt instanceof qt0) {
                i13 = i10;
                measureChildWithMargins(childAt, i13, 0, View.MeasureSpec.makeMeasureSpec(i12, 1073741824), 0);
                wr0 wr0Var = ((qt0) childAt).h;
                wr0Var.setPadding(0, wr0Var.V2, 0, wr0Var.W2);
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
            org.telegram.ui.ActionBar.p2 p2Var = this.f33649s1;
            if (p2Var.getParentLayout() != null && !((ActionBarLayout) p2Var.getParentLayout()).j() && !J() && !this.f33606a) {
                if (motionEvent != null) {
                    if (this.f33664y1 == null) {
                        this.f33664y1 = VelocityTracker.obtain();
                    }
                    this.f33664y1.addMovement(motionEvent);
                    m40 m40Var = this.B1;
                    if (m40Var != null) {
                        m40Var.b(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.f33653u1 && !this.f33655v1 && motionEvent.getY() >= AndroidUtilities.dp(90.0f)) {
                    this.f33651t1 = motionEvent.getPointerId(0);
                    this.f33655v1 = true;
                    this.f33658w1 = (int) motionEvent.getX();
                    this.f33661x1 = (int) motionEvent.getY();
                    this.f33664y1.clear();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f33651t1) {
                    int x10 = (int) (motionEvent.getX() - this.f33658w1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.f33661x1);
                    boolean z12 = this.f33653u1;
                    qt0[] qt0VarArr = this.f33625h0;
                    if (z12 && (((z4 = this.f33619e1) && x10 > 0) || (!z4 && x10 < 0))) {
                        if (x10 < 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!U0(motionEvent, z10)) {
                            this.f33655v1 = true;
                            this.f33653u1 = false;
                            N0(false);
                            qt0VarArr[0].setTranslationX(0.0f);
                            qt0 qt0Var = qt0VarArr[1];
                            if (this.f33619e1) {
                                i11 = qt0VarArr[0].getMeasuredWidth();
                            } else {
                                i11 = -qt0VarArr[0].getMeasuredWidth();
                            }
                            qt0Var.setTranslationX(i11);
                            Z0(0.0f, qt0VarArr[1].C);
                            M0(getTabProgress());
                        }
                    }
                    if (this.f33655v1 && !this.f33653u1) {
                        if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                            if (x10 < 0) {
                                z11 = true;
                            }
                            U0(motionEvent, z11);
                        }
                    } else if (this.f33653u1) {
                        qt0VarArr[0].setTranslationX(x10);
                        if (this.f33619e1) {
                            qt0VarArr[1].setTranslationX(qt0VarArr[0].getMeasuredWidth() + x10);
                        } else {
                            qt0VarArr[1].setTranslationX(x10 - qt0VarArr[0].getMeasuredWidth());
                        }
                        float abs2 = Math.abs(x10) / qt0VarArr[0].getMeasuredWidth();
                        if (!D()) {
                            this.f33633l0 = 0.0f;
                        } else {
                            this.f33633l0 = b0(abs2);
                            s1(abs2);
                            float a02 = a0(abs2);
                            this.m0 = a02;
                            if (a02 != 0.0f && D() && !q0()) {
                                i10 = 0;
                            } else {
                                i10 = 4;
                            }
                            this.f33638o0.setVisibility(i10);
                        }
                        q1(false);
                        Z0(abs2, qt0VarArr[1].C);
                        M0(getTabProgress());
                        L0();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f33651t1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    g1(motionEvent);
                }
                return this.f33653u1;
            }
        }
        return false;
    }

    public final void p1() {
        boolean z4;
        float f10;
        org.telegram.ui.ActionBar.w0 w0Var = this.f33642q0;
        if (w0Var != null) {
            if (!this.f33649s1.getMessagesController().isPeerNoForwards(this.f33624g1) && !j0()) {
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
                w0Var.setBackground(org.telegram.ui.ActionBar.k6.f0(h0(org.telegram.ui.ActionBar.k6.f22057z8), 5, -1));
            }
        }
    }

    public boolean q0() {
        return false;
    }

    public final void q1(boolean z4) {
        or0 or0Var;
        sr0 sr0Var;
        kj0 kj0Var = this.f33640p0;
        if (kj0Var == null) {
            return;
        }
        float f10 = 0.0f;
        if (!this.S0 && (((or0Var = this.S) == null || !or0Var.g()) && ((sr0Var = this.T) == null || !sr0Var.f40300w))) {
            f10 = Utilities.clamp(this.f33633l0 + this.m0, 1.0f, 0.0f);
        }
        kj0Var.setAlpha(f10);
        boolean z10 = false;
        if (z4) {
            if (a0(1.0f) > 0.5f) {
                z10 = true;
            }
            A(z10, true);
        } else if (this.f33652u0 == 2) {
            if (this.m0 > 0.1f) {
                z10 = true;
            }
            A(z10, true);
        } else {
            if (this.f33633l0 < 0.1f) {
                z10 = true;
            }
            A(z10, true);
        }
    }

    public final boolean r0() {
        TLRPC.User user;
        long j10 = this.f33624g1;
        if (j10 <= 0 || (user = MessagesController.getInstance(this.f33649s1.getCurrentAccount()).getUser(Long.valueOf(j10))) == null || !user.bot) {
            return false;
        }
        return true;
    }

    public final void r1(boolean z4) {
        int i10 = 0;
        while (true) {
            qt0[] qt0VarArr = this.f33625h0;
            if (i10 < qt0VarArr.length) {
                int childCount = qt0VarArr[i10].h.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = qt0VarArr[i10].h.getChildAt(i11);
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
        org.telegram.ui.ActionBar.w0 w0Var = this.f33629j0;
        if (w0Var == null) {
            return;
        }
        qt0[] qt0VarArr = this.f33625h0;
        qt0 qt0Var = qt0VarArr[1];
        float f11 = 0.0f;
        if (qt0Var != null && qt0Var.C == 11) {
            f11 = 0.0f + f10;
        }
        int i10 = 0;
        qt0 qt0Var2 = qt0VarArr[0];
        if (qt0Var2 != null && qt0Var2.C == 11) {
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
        TLRPC.ChatFull chatFull2 = this.f33608a1;
        if (chatFull2 != null && chatFull2.stories_pinned_available) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f33608a1 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.Z0 == 0) {
                this.Z0 = -j10;
                int i11 = 0;
                while (true) {
                    nu0[] nu0VarArr = this.f33643q1;
                    if (i11 >= nu0VarArr.length) {
                        break;
                    }
                    if (nu0VarArr[i11].f29581b[1].size() == 0) {
                        nu0 nu0Var = nu0VarArr[i11];
                        nu0Var.f29587j[1] = this.f33608a1.migrated_from_max_id;
                        nu0Var.f29586i[1] = false;
                    }
                    i11++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.f33608a1;
        if (chatFull3 != null && z4 != chatFull3.stories_pinned_available) {
            ns0 ns0Var = this.F0;
            if (ns0Var != null) {
                if (q0()) {
                    i10 = 9;
                } else {
                    i10 = 8;
                }
                ns0Var.setInitialTabId(i10);
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
            qt0[] qt0VarArr = this.f33625h0;
            if (i15 >= qt0VarArr.length) {
                break;
            }
            qt0VarArr[i15].setTranslationY(this.H1);
            i15++;
        }
        if (this.M0 != null) {
            K();
        } else {
            js0 js0Var = this.O0;
            if (js0Var != null) {
                js0Var.setTranslationY(AndroidUtilities.dp(48.0f) + i11);
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
            qt0[] qt0VarArr = this.f33625h0;
            if (qt0VarArr != null) {
                for (qt0 qt0Var : qt0VarArr) {
                    if (qt0Var != null) {
                        wr0 wr0Var = qt0Var.h;
                        int paddingLeft = wr0Var.getPaddingLeft();
                        wr0 wr0Var2 = qt0Var.h;
                        int i11 = wr0Var2.V2;
                        int paddingRight = wr0Var2.getPaddingRight();
                        wr0 wr0Var3 = qt0Var.h;
                        int Y = Y(v0());
                        wr0Var3.f30187b3 = Y;
                        wr0Var.setPadding(paddingLeft, i11, paddingRight, Y);
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
                qt0[] qt0VarArr = this.f33625h0;
                if (i10 < qt0VarArr.length) {
                    o1(qt0VarArr[i10], true);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        boolean z4;
        TLRPC.UserFull userFull2 = this.f33611b1;
        if (userFull2 != null && userFull2.stories_pinned_available) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f33611b1 = userFull;
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
            qt0[] qt0VarArr = this.f33625h0;
            if (i11 >= qt0VarArr.length) {
                break;
            }
            int measuredHeight = getMeasuredHeight();
            if (qt0VarArr[i11].C == 8) {
                f10 = 280.0f;
            } else {
                f10 = 120.0f;
            }
            float f11 = (-(measuredHeight - Math.max(i10, AndroidUtilities.dp(f10)))) / 2.0f;
            qt0VarArr[i11].f30524w.setTranslationY(f11);
            qt0VarArr[i11].v.setTranslationY(-f11);
            i11++;
        }
        nr0 nr0Var = this.R;
        if (nr0Var != null) {
            nr0Var.setVisibleHeight(i10);
        }
        or0 or0Var = this.S;
        if (or0Var != null) {
            or0Var.setVisibleHeight(i10);
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
        org.telegram.ui.ActionBar.w0 w0Var = this.f33629j0;
        if (w0Var == null) {
            return;
        }
        boolean z4 = true;
        qt0 qt0Var = this.f33625h0[1];
        z4 = (qt0Var == null || qt0Var.C != 11) ? false : false;
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
        org.telegram.ui.ActionBar.w0 w0Var = this.f33650t0;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f33648s0;
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
                    ft0 ft0Var = this.W;
                    if (ft0Var != null && (l6Var = ft0Var.f32551s) != null && !l6Var.m(messageObject.getId())) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yu0.v1(boolean):void");
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
            qt0[] qt0VarArr = this.f33625h0;
            boolean z4 = false;
            qt0 qt0Var = qt0VarArr[0];
            if (qt0Var != null) {
                int i10 = qt0Var.C;
                this.f33634m1 = i10;
                boolean p02 = p0(i10);
                int[] iArr = this.f33630j1;
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
                    } else if (c0(qt0VarArr[0].C) >= 5 || w0(qt0VarArr[0].C)) {
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
        if (!C() || ((getClosestTab() != 8 && getClosestTab() != 13 && !w0(getClosestTab())) || !this.f33666z1)) {
            or0 or0Var = this.S;
            if (or0Var == null || !or0Var.g()) {
                sr0 sr0Var = this.T;
                if ((sr0Var == null || !sr0Var.f40300w) && !this.l1 && !this.f33616d1) {
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
            qt0[] qt0VarArr = this.f33625h0;
            boolean z4 = false;
            qt0 qt0Var = qt0VarArr[0];
            if (qt0Var != null) {
                if (!this.f33626h1 || !p0(qt0Var.C)) {
                    int i10 = qt0VarArr[0].C;
                    this.f33634m1 = i10;
                    boolean p02 = p0(i10);
                    int[] iArr = this.f33630j1;
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
                        } else if (c0(qt0VarArr[0].C) >= 5 || w0(qt0VarArr[0].C)) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yu0.y(org.telegram.ui.Components.q70):void");
    }

    public final void y0(int i10, int i11, int i12, boolean z4) {
        nu0[] nu0VarArr = this.f33643q1;
        nu0VarArr[i10].f29580a.clear();
        nu0VarArr[i10].f29581b[0].clear();
        nu0VarArr[i10].f29581b[1].clear();
        nu0 nu0Var = nu0VarArr[i10];
        nu0Var.f29587j[0] = i11;
        nu0Var.f29586i[0] = false;
        nu0Var.f29589l = false;
        nu0Var.f29590m = i12;
        nu0Var.f29591n = (nu0Var.e() - i12) - 1;
        nu0 nu0Var2 = nu0VarArr[i10];
        if (nu0Var2.f29591n < 0) {
            nu0Var2.f29591n = 0;
        }
        nu0Var2.f29588k = i11;
        nu0Var2.f29592o = true;
        nu0Var2.f29585g = false;
        nu0Var2.f29593p++;
        qt0 W = W(i10);
        if (W != null && W.h.getAdapter() != null) {
            W.h.getAdapter().l();
        }
        if (z4) {
            int i13 = 0;
            while (true) {
                qt0[] qt0VarArr = this.f33625h0;
                if (i13 < qt0VarArr.length) {
                    qt0 qt0Var = qt0VarArr[i13];
                    if (qt0Var.C == i10) {
                        qt0Var.f30525x.h1(Math.min(nu0VarArr[i10].e() - 1, nu0VarArr[i10].f29590m), 0);
                    }
                    i13++;
                } else {
                    return;
                }
            }
        }
    }

    public final void z(pt0 pt0Var, int i10, SparseBooleanArray sparseBooleanArray) {
        int childCount = pt0Var.getChildCount();
        u00 u00Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = pt0Var.getChildAt(i11);
            if (childAt instanceof u00) {
                u00Var = childAt;
            }
        }
        if (u00Var != null) {
            pt0Var.removeView(u00Var);
        }
        getViewTreeObserver().addOnPreDrawListener(new ss0(this, pt0Var, sparseBooleanArray, u00Var, i10));
    }

    public final void z0(boolean z4) {
        long j10 = this.C;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0 && !t0()) {
            for (int i11 = 0; i11 < 4; i11++) {
                final int i12 = a2[i11];
                nu0[] nu0VarArr = this.f33643q1;
                if (!nu0VarArr[i12].h || z4) {
                    long j11 = this.f33624g1;
                    if (!DialogObject.isEncryptedDialog(j11)) {
                        nu0VarArr[i12].h = false;
                        TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
                        if (i12 == 0) {
                            int i13 = nu0VarArr[i12].f29594q;
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
                        org.telegram.ui.ActionBar.p2 p2Var = this.f33649s1;
                        tL_messages_getSearchResultsPositions.peer = p2Var.getMessagesController().getInputPeer(j11);
                        if (i10 != 0 && p2Var.getUserConfig().getClientUserId() == j11) {
                            tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                            tL_messages_getSearchResultsPositions.saved_peer_id = p2Var.getMessagesController().getInputPeer(j10);
                        }
                        final int i14 = nu0VarArr[i12].f29593p;
                        ConnectionsManager.getInstance(p2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(p2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new ar0(yu0.this, tL_error, i14, i12, tLObject, 0));
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
