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
public abstract class qu0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Cells.l2 {
    public static final int[] Z1 = {0, 1, 2, 4};
    public static final cr0 a2 = new cr0(0);
    public final int A;
    public final ArrayList A0;
    public g40 A1;
    public final long B;
    public final ArrayList B0;
    public final org.telegram.ui.ActionBar.c6 B1;
    public final org.telegram.ui.ActionBar.l C;
    public final ArrayList C0;
    public final NotificationCenter.ObserversGroup C1;
    public final us0 D;
    public final ArrayList D0;
    public boolean D1;
    public final ku0 E;
    public final fs0 E0;
    public final AnimationNotificationsLocker E1;
    public final eu0 F;
    public final cs0 F0;
    public rm F1;
    public final du0 G;
    public final org.telegram.ui.Cells.v0 G0;
    public int G1;
    public final du0 H;
    public AnimatorSet H0;
    public boolean H1;
    public final du0 I;
    public final mq0 I0;
    public int I1;
    public final wt0 J;
    public final ArrayList J0;
    public AnimatorSet J1;
    public final dt0 K;
    public float K0;
    public final SparseArray K1;
    public final at0 L;
    public final fs L0;
    public long L1;
    public final ys0 M;
    public final FrameLayout M0;
    public boolean M1;
    public final zt0 N;
    public final bs0 N0;
    public int N1;
    public final bu0 O;
    public final int O0;
    public final ms0 O1;
    public final vs0 P;
    public final Paint P0;
    public lh.k6 P1;
    public final fr0 Q;
    public boolean Q0;
    public float Q1;
    public final gr0 R;
    public boolean R0;
    public boolean R1;
    public final kr0 S;
    public kg.q0 S0;
    public SpannableStringBuilder S1;
    public final zs0 T;
    public final int[] T0;
    public int T1;
    public final f2.e0 U;
    public int U0;
    public final HashMap U1;
    public final xs0 V;
    public final SparseArray[] V0;
    public final HashMap V1;
    public final nu0 W;
    public int W0;
    public int W1;
    public boolean X0;
    public int X1;
    public long Y0;
    public final dh Y1;
    public TLRPC.ChatFull Z0;
    public boolean f32053a;
    public final er0 f32054a0;
    public TLRPC.UserFull f32055a1;
    public boolean f32056b;
    public final nu0 f32057b0;
    public AnimatorSet f32058b1;
    public boolean f32059c;
    public final lt0 f32060c0;
    public boolean f32061c1;
    public boolean d;
    public final lt0 f32062d0;
    public boolean f32063d1;
    public int f32064e;
    public final lt0 f32065e0;
    public boolean f32066e1;
    public int f32067f;
    public final gt0 f32068f0;
    public final long f32069f1;
    public final it0[] f32070g0;
    public boolean f32071g1;
    public float h;
    public final org.telegram.ui.ActionBar.w0 f32072h0;
    public boolean f32073h1;
    public final org.telegram.ui.ActionBar.w0 f32074i0;
    public final int[] f32075i1;
    public final org.telegram.ui.ActionBar.w0 f32076j0;
    public float f32077j1;
    public float f32078k0;
    public boolean f32079k1;
    public float f32080l0;
    public int l1;
    public final TextView m0;
    public int f32081m1;
    public float f32082n;
    public final ImageView f32083n0;
    public final pr0 f32084n1;
    public final aj0 f32085o0;
    public float f32086o1;
    public final org.telegram.ui.ActionBar.w0 f32087p0;
    public final fu0[] f32088p1;
    public final org.telegram.ui.ActionBar.w0 f32089q0;
    public final iu0 f32090q1;
    public boolean f32091r;
    public final org.telegram.ui.ActionBar.w0 f32092r0;
    public final org.telegram.ui.ActionBar.o2 f32093r1;
    public int f32094s;
    public final org.telegram.ui.ActionBar.w0 f32095s0;
    public int f32096s1;
    public int f32097t0;
    public boolean f32098t1;
    public final Drawable f32099u0;
    public boolean f32100u1;
    public int v;
    public boolean f32101v0;
    public int f32102v1;
    public int f32103w;
    public final NumberTextView f32104w0;
    public int f32105w1;
    public final Rect f32106x;
    public final ea f32107x0;
    public VelocityTracker f32108x1;
    public final p00 f32109y;
    public final ImageView f32110y0;
    public boolean f32111y1;
    public final org.telegram.ui.ActionBar.h2 f32112z0;
    public final bt0 f32113z1;

    public qu0(android.content.Context r40, long r41, org.telegram.ui.Components.iu0 r43, int r44, java.util.ArrayList r45, org.telegram.tgnet.TLRPC.ChatFull r46, org.telegram.tgnet.TLRPC.UserFull r47, int r48, int r49, org.telegram.ui.ActionBar.o2 r50, org.telegram.ui.Components.bt0 r51, int r52, org.telegram.ui.ActionBar.c6 r53, lg.a r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qu0.<init>(android.content.Context, long, org.telegram.ui.Components.iu0, int, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.tgnet.TLRPC$UserFull, int, int, org.telegram.ui.ActionBar.o2, org.telegram.ui.Components.bt0, int, org.telegram.ui.ActionBar.c6, lg.a):void");
    }

    public static ct0 M(int i10, long j10, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        ct0 ct0Var = new ct0(context, c6Var);
        TextView textView = ct0Var.f27568a;
        if (i10 == 0) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoMediaSecret));
                return ct0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoMedia));
            return ct0Var;
        } else if (i10 == 1) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedFilesSecret));
                return ct0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedFiles));
            return ct0Var;
        } else if (i10 == 2) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedVoiceSecret));
                return ct0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedVoice));
            return ct0Var;
        } else if (i10 == 3) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedLinksSecret));
                return ct0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedLinks));
            return ct0Var;
        } else if (i10 == 4) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedAudioSecret));
                return ct0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedAudio));
            return ct0Var;
        } else if (i10 == 5) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedGifSecret));
                return ct0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoGIFs));
            return ct0Var;
        } else {
            ImageView imageView = ct0Var.f27569b;
            if (i10 == 6) {
                imageView.setImageDrawable(null);
                textView.setText(LocaleController.getString(R.string.NoGroupsInCommon));
                return ct0Var;
            }
            if (i10 == 7) {
                imageView.setImageDrawable(null);
                textView.setText("");
            }
            return ct0Var;
        }
    }

    public static TLRPC.ProfileTab d0(int i10, boolean z10) {
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

    public static void g(qu0 qu0Var, int i10, TL_stories.StoryItem storyItem, String str) {
        rm rmVar = new rm(qu0Var, i10, storyItem, 10);
        lh.s6 storiesController = qu0Var.getStoriesController();
        long j10 = qu0Var.f32069f1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.c0(i10, j10, arrayList);
        tc.a0(qu0Var.f32093r1).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", 1, str)), LocaleController.getString(R.string.UndoNoCaps), rmVar).j();
    }

    public lh.s6 getStoriesController() {
        return MessagesController.getInstance(this.f32093r1.getCurrentAccount()).getStoriesController();
    }

    public static void h(qu0 qu0Var, TL_stories.StoryItem storyItem) {
        qu0Var.getStoriesController().o0(qu0Var.f32069f1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        tc.a0(qu0Var.f32093r1).G(R.raw.chats_archived, 5000, LocaleController.formatPluralString("StoryArchived", 1, new Object[0])).j();
    }

    public static void i(qu0 qu0Var, long j10, int i10, String str) {
        lh.g6 B = qu0Var.getStoriesController().B(j10, true);
        int i11 = B.f15634a;
        int c3 = B.c(i10);
        if (c3 == -1) {
            return;
        }
        ((lh.l6) B.h.get(c3)).f15894b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f15635b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public static void j(qu0 qu0Var, TL_stories.StoryItem storyItem, lh.l6 l6Var) {
        qu0Var.getStoriesController().c(l6Var.f15893a, qu0Var.f32069f1, storyItem);
        AndroidUtilities.runOnUIThread(new ii0(10, qu0Var, l6Var), 100L);
    }

    public static void k(int i10, TL_stories.StoryItem storyItem, qu0 qu0Var) {
        qu0Var.getStoriesController().c(i10, qu0Var.f32069f1, storyItem);
    }

    public static void m(qu0 qu0Var, HashSet hashSet, TL_stories.StoryItem storyItem, j70 j70Var, lh.l6 l6Var) {
        String formatString;
        long j10 = qu0Var.f32069f1;
        if (hashSet.contains(Integer.valueOf(l6Var.f15893a))) {
            qu0Var.getStoriesController().c(l6Var.f15893a, j10, storyItem);
            formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, l6Var.f15894b);
        } else {
            lh.s6 storiesController = qu0Var.getStoriesController();
            int i10 = l6Var.f15893a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.c0(i10, j10, arrayList);
            formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, l6Var.f15894b);
        }
        tc.a0(qu0Var.f32093r1).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
        j70Var.u();
    }

    public static void n(qu0 qu0Var, long j10, int i10) {
        lh.g6 B = qu0Var.getStoriesController().B(j10, true);
        int i11 = B.f15634a;
        int c3 = B.c(i10);
        if (c3 == -1) {
            return;
        }
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f15635b);
        tL_deleteAlbum.album_id = ((lh.l6) B.h.remove(c3)).f15893a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public static int p(View view) {
        if (view instanceof org.telegram.ui.Cells.p7) {
            return ((org.telegram.ui.Cells.p7) view).getMessageId();
        }
        if (view instanceof org.telegram.ui.Cells.g7) {
            return ((org.telegram.ui.Cells.g7) view).getMessage().getId();
        }
        if (view instanceof org.telegram.ui.Cells.f7) {
            return ((org.telegram.ui.Cells.f7) view).getMessage().getId();
        }
        return 0;
    }

    public static boolean p0(int i10) {
        if (i10 != 8 && i10 != 9 && !w0(i10)) {
            return false;
        }
        return true;
    }

    public static void q(it0 it0Var, fu0[] fu0VarArr, boolean z10) {
        ii0 ii0Var;
        if (z10) {
            if (SharedConfig.fastScrollHintCount > 0 && it0Var.C == null && !it0Var.E && it0Var.h.getFastScroll() != null && it0Var.h.getFastScroll().T && it0Var.h.getFastScroll().getVisibility() == 0 && fu0VarArr[0].e() >= 50) {
                SharedConfig.setFastScrollHintCount(SharedConfig.fastScrollHintCount - 1);
                it0Var.E = true;
                Context context = it0Var.getContext();
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                textView.setText(LocaleController.getString(R.string.SharedMediaFastScrollHint));
                textView.setTextSize(1, 14.0f);
                textView.setMaxLines(3);
                int i10 = org.telegram.ui.ActionBar.g6.pf;
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
                frameLayout.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23301qf, false)));
                frameLayout.addView(textView, i7.f6.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
                ?? view = new View(context);
                view.f29794a = new Random();
                Paint paint = new Paint(1);
                view.f29795b = paint;
                Paint paint2 = new Paint(1);
                view.f29796c = paint2;
                view.f29798f = 1.0f;
                view.h = 0.0f;
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, i10, false), 76));
                paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
                Paint paint3 = new Paint();
                view.d = paint3;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint3.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint3.setXfermode(new PorterDuffXfermode(mode));
                Paint paint4 = new Paint();
                view.f29797e = paint4;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                paint4.setXfermode(new PorterDuffXfermode(mode));
                frameLayout.addView(view, i7.f6.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                it0Var.C = frameLayout;
                it0Var.addView((View) frameLayout, i7.f6.c(-2.0f, -2));
                it0Var.C.setAlpha(0.0f);
                it0Var.C.setScaleX(0.8f);
                it0Var.C.setScaleY(0.8f);
                it0Var.C.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                it0Var.invalidate();
                ii0 ii0Var2 = new ii0(9, it0Var, frameLayout);
                it0Var.D = ii0Var2;
                AndroidUtilities.runOnUIThread(ii0Var2, 4000L);
            }
        } else if (it0Var.C != null && (ii0Var = it0Var.D) != null) {
            AndroidUtilities.cancelRunOnUIThread(ii0Var);
            it0Var.D.run();
            it0Var.D = null;
            it0Var.C = null;
        }
    }

    public static void s(org.telegram.ui.Components.qu0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qu0.s(org.telegram.ui.Components.qu0):void");
    }

    public static void t(qu0 qu0Var, int i10, boolean z10) {
        it0[] it0VarArr = qu0Var.f32070g0;
        if (it0VarArr[0].B == i10) {
            return;
        }
        it0 it0Var = it0VarArr[1];
        it0Var.B = i10;
        it0Var.setVisibility(0);
        qu0Var.k0();
        qu0Var.m1(true);
        qu0Var.f32063d1 = z10;
        qu0Var.L0();
        qu0Var.A(!qu0Var.s0(i10), true);
        qu0Var.q1(true);
    }

    public static int u(qu0 qu0Var, f2.p0 p0Var) {
        if (p0Var == qu0Var.V) {
            return 8;
        }
        if (p0Var == qu0Var.f32054a0) {
            return 9;
        }
        for (pu0 pu0Var : qu0Var.U1.values()) {
            if (pu0Var.f31775c == p0Var) {
                return pu0Var.f31773a;
            }
        }
        return -1;
    }

    public static int v(qu0 qu0Var, f2.p0 p0Var) {
        if (p0Var == qu0Var.W) {
            return 8;
        }
        if (p0Var == qu0Var.f32057b0) {
            return 9;
        }
        for (pu0 pu0Var : qu0Var.U1.values()) {
            if (pu0Var.d == p0Var) {
                return pu0Var.f31773a;
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

    public final void A(boolean z10, boolean z11) {
        int i10;
        aj0 aj0Var = this.f32085o0;
        if (aj0Var != null && this.R1 != z10) {
            this.R1 = z10;
            if (!z10 && aj0Var.getAnimatedDrawable().X < 20) {
                aj0Var.getAnimatedDrawable().N(0);
            } else {
                xi0 animatedDrawable = aj0Var.getAnimatedDrawable();
                if (this.R1) {
                    i10 = 50;
                } else {
                    i10 = 100;
                }
                animatedDrawable.N(i10);
            }
            if (z11) {
                aj0Var.getAnimatedDrawable().start();
            } else {
                aj0Var.getAnimatedDrawable().K(aj0Var.getAnimatedDrawable().f34739f);
            }
        }
    }

    public final void A0(int i10) {
        int i11;
        fu0[] fu0VarArr = this.f32088p1;
        if (i10 == 0) {
            int i12 = fu0VarArr[0].f28548q;
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
        fu0VarArr[i10].f28539g = true;
        org.telegram.ui.ActionBar.o2 o2Var = this.f32093r1;
        o2Var.getMediaDataController().loadMedia(this.f32069f1, 50, 0, fu0VarArr[i10].f28542k, i11, this.B, 1, o2Var.getClassGuid(), fu0VarArr[i10].f28547p, null, null);
    }

    public final void B(int i10) {
        int i11;
        it0 W = W(this.l1);
        this.f32094s = -1;
        if (W != null) {
            W.h.B0();
            this.f32081m1 = i10;
            W.f29469r.setVisibility(0);
            if (p0(this.l1)) {
                W.f29469r.setAdapter(l1(this.l1));
            } else {
                W.f29469r.setAdapter(this.E);
            }
            ht0 ht0Var = W.f29469r;
            int paddingLeft = ht0Var.getPaddingLeft();
            ht0 ht0Var2 = W.f29469r;
            int Z = Z(W.B);
            ht0Var2.Z2 = Z;
            int paddingRight = W.f29469r.getPaddingRight();
            ht0 ht0Var3 = W.f29469r;
            int Y = Y(v0());
            ht0Var3.f29229a3 = Y;
            ht0Var.setPadding(paddingLeft, Z, paddingRight, Y);
            W.f29470s.y1(i10);
            W.f29469r.a0();
            int i12 = 0;
            while (true) {
                it0[] it0VarArr = this.f32070g0;
                if (i12 >= it0VarArr.length) {
                    break;
                }
                it0 it0Var = it0VarArr[i12];
                if (it0Var != null && ((i11 = it0Var.B) == 0 || p0(i11))) {
                    AndroidUtilities.updateVisibleRows(it0VarArr[i12].h);
                }
                i12++;
            }
            this.f32079k1 = true;
            if (this.l1 == 0) {
                this.f32088p1[0].g(true);
            }
            this.f32077j1 = 0.0f;
            X0();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.E1.lock();
            ofFloat.addUpdateListener(new es0(this, W, 1));
            ofFloat.addListener(new m20(this, p0(W.B) ? 1 : 0, i10, 1));
            ofFloat.setInterpolator(jr.f29800f);
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
        long j10 = this.f32069f1;
        org.telegram.ui.ActionBar.o2 o2Var = this.f32093r1;
        if (r02) {
            TLRPC.User user = MessagesController.getInstance(o2Var.getCurrentAccount()).getUser(Long.valueOf(j10));
            if (user == null || !user.bot || !user.bot_can_edit) {
                return false;
            }
            return true;
        } else if (!v0() && (o2Var == null || !o2Var.getMessagesController().getStoriesController().h(j10))) {
            return false;
        } else {
            return true;
        }
    }

    public final void C0(int i10, View view) {
        boolean z10;
        String string;
        int i11;
        fr0 fr0Var;
        int i12;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z11;
        String formatPluralString;
        String formatPluralString2;
        int i13;
        int i14;
        TLRPC.User user2;
        zt0 zt0Var = this.N;
        SparseArray[] sparseArrayArr = this.V0;
        org.telegram.ui.ActionBar.o2 o2Var = this.f32093r1;
        boolean z12 = true;
        char c3 = 1;
        if (i10 == 101) {
            boolean p02 = p0(getSelectedTab());
            org.telegram.ui.ActionBar.c6 c6Var = this.B1;
            if (!p02 && getSelectedTab() != 13) {
                if (getSelectedTab() == 11) {
                    SavedMessagesController savedMessagesController = o2Var.getMessagesController().getSavedMessagesController();
                    final ArrayList arrayList = new ArrayList();
                    for (int i15 = 0; i15 < savedMessagesController.allDialogs.size(); i15++) {
                        long j10 = savedMessagesController.allDialogs.get(i15).dialogId;
                        if (zt0Var.f35420w.contains(Long.valueOf(j10))) {
                            arrayList.add(Long.valueOf(j10));
                        }
                    }
                    String str = "";
                    if (!arrayList.isEmpty()) {
                        Long l10 = (Long) arrayList.get(0);
                        long longValue = l10.longValue();
                        if (longValue == o2Var.getUserConfig().getClientUserId()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        int i16 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                        if (i16 < 0) {
                            TLRPC.Chat chat2 = o2Var.getMessagesController().getChat(Long.valueOf(-longValue));
                            if (chat2 != null) {
                                str = chat2.title;
                            }
                        } else if (i16 >= 0 && (user2 = o2Var.getMessagesController().getUser(l10)) != null) {
                            str = UserObject.isAnonymous(user2) ? LocaleController.getString(R.string.AnonymousForward) : UserObject.getUserName(user2);
                        }
                    } else {
                        z11 = false;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, c6Var);
                    if (arrayList.size() == 1) {
                        if (z11) {
                            i14 = R.string.ClearHistoryMyNotesTitle;
                        } else {
                            i14 = R.string.ClearHistoryTitleSingle2;
                        }
                        formatPluralString = LocaleController.formatString(i14, str);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("ClearHistoryTitleMultiple", arrayList.size(), new Object[0]);
                    }
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                    c2Var.N = formatPluralString;
                    if (arrayList.size() == 1) {
                        if (z11) {
                            i13 = R.string.ClearHistoryMyNotesMessage;
                        } else {
                            i13 = R.string.ClearHistoryMessageSingle;
                        }
                        formatPluralString2 = LocaleController.formatString(i13, str);
                    } else {
                        formatPluralString2 = LocaleController.formatPluralString("ClearHistoryMessageMultiple", arrayList.size(), new Object[0]);
                    }
                    c2Var.P = formatPluralString2;
                    alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.b2(this) {
                        public final qu0 f33027b;

                        {
                            this.f33027b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i17) {
                            switch (r3) {
                                case 0:
                                    qu0 qu0Var = this.f33027b;
                                    org.telegram.ui.ActionBar.o2 o2Var2 = qu0Var.f32093r1;
                                    lh.s6 storiesController = o2Var2.getMessagesController().getStoriesController();
                                    long j11 = qu0Var.f32069f1;
                                    ArrayList arrayList2 = arrayList;
                                    storiesController.s(j11, arrayList2);
                                    tc.a0(o2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList2.size(), new Object[0])).j();
                                    qu0Var.L(false);
                                    return;
                                default:
                                    qu0 qu0Var2 = this.f33027b;
                                    qu0Var2.getClass();
                                    int i18 = 0;
                                    while (true) {
                                        ArrayList arrayList3 = arrayList;
                                        if (i18 < arrayList3.size()) {
                                            qu0Var2.f32093r1.getMessagesController().deleteSavedDialog(((Long) arrayList3.get(i18)).longValue());
                                            i18++;
                                        } else {
                                            qu0Var2.L(true);
                                            return;
                                        }
                                    }
                            }
                        }
                    });
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    o2Var.showDialog(c2Var);
                    TextView textView = (TextView) c2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                        return;
                    }
                    return;
                }
                long j11 = this.f32069f1;
                if (DialogObject.isEncryptedDialog(j11)) {
                    encryptedChat = org.telegram.messenger.x3.p(o2Var.getMessagesController(), j11);
                    user = null;
                    chat = null;
                } else if (DialogObject.isUserDialog(j11)) {
                    user = o2Var.getMessagesController().getUser(Long.valueOf(j11));
                    chat = null;
                    encryptedChat = null;
                } else {
                    chat = o2Var.getMessagesController().getChat(Long.valueOf(-j11));
                    user = null;
                    encryptedChat = null;
                }
                c5.z(o2Var, user, chat, encryptedChat, null, this.Y0, null, this.V0, null, 0, 0, null, new mq0(this, 1), null, this.B1);
            } else if (sparseArrayArr[0] != null) {
                if (r0() && (fr0Var = this.Q) != null && fr0Var.getCurrentList() != null) {
                    lh.c6 currentList = fr0Var.getCurrentList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i17 = 0; i17 < sparseArrayArr[0].size(); i17++) {
                        TL_stories.StoryItem storyItem = ((MessageObject) sparseArrayArr[0].valueAt(i17)).storyItem;
                        if (storyItem != null) {
                            arrayList2.add(storyItem.media);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, c6Var);
                        if (arrayList2.size() > 1) {
                            i12 = R.string.DeleteBotPreviewsTitle;
                        } else {
                            i12 = R.string.DeleteBotPreviewTitle;
                        }
                        String string2 = LocaleController.getString(i12);
                        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22714a;
                        c2Var2.N = string2;
                        c2Var2.P = LocaleController.formatPluralString("DeleteBotPreviewsSubtitle", arrayList2.size(), new Object[0]);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new androidx.car.app.utils.a(this, currentList, arrayList2, 28));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new xo0(1));
                        c2Var2.show();
                        c2Var2.h();
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
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), 0, c6Var);
                    if (arrayList3.size() > 1) {
                        i11 = R.string.DeleteStoriesTitle;
                    } else {
                        i11 = R.string.DeleteStoryTitle;
                    }
                    String string3 = LocaleController.getString(i11);
                    org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.f22714a;
                    c2Var3.N = string3;
                    c2Var3.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList3.size(), new Object[0]);
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(this) {
                        public final qu0 f33027b;

                        {
                            this.f33027b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.c2 c2Var22, int i172) {
                            switch (r3) {
                                case 0:
                                    qu0 qu0Var = this.f33027b;
                                    org.telegram.ui.ActionBar.o2 o2Var2 = qu0Var.f32093r1;
                                    lh.s6 storiesController = o2Var2.getMessagesController().getStoriesController();
                                    long j112 = qu0Var.f32069f1;
                                    ArrayList arrayList22 = arrayList3;
                                    storiesController.s(j112, arrayList22);
                                    tc.a0(o2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList22.size(), new Object[0])).j();
                                    qu0Var.L(false);
                                    return;
                                default:
                                    qu0 qu0Var2 = this.f33027b;
                                    qu0Var2.getClass();
                                    int i182 = 0;
                                    while (true) {
                                        ArrayList arrayList32 = arrayList3;
                                        if (i182 < arrayList32.size()) {
                                            qu0Var2.f32093r1.getMessagesController().deleteSavedDialog(((Long) arrayList32.get(i182)).longValue());
                                            i182++;
                                        } else {
                                            qu0Var2.L(true);
                                            return;
                                        }
                                    }
                            }
                        }
                    });
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new xo0(2));
                    c2Var3.show();
                    c2Var3.h();
                }
            }
        } else if (i10 == 100) {
            if (this.f32055a1 != null && o2Var.getMessagesController().isUserNoForwards(this.f32055a1)) {
                g40 g40Var = this.A1;
                if (g40Var != null) {
                    g40Var.setText(LocaleController.getString(R.string.ForwardsRestrictedInfoUser));
                    this.A1.f(view, true);
                    return;
                }
                return;
            }
            if (this.Z0 != null) {
                TLRPC.Chat chat3 = o2Var.getMessagesController().getChat(Long.valueOf(this.Z0.f22393id));
                if (o2Var.getMessagesController().isChatNoForwards(chat3)) {
                    g40 g40Var2 = this.A1;
                    if (g40Var2 != null) {
                        if (ChatObject.isChannel(chat3) && !chat3.megagroup) {
                            string = LocaleController.getString(R.string.ForwardsRestrictedInfoChannel);
                        } else {
                            string = LocaleController.getString(R.string.ForwardsRestrictedInfoGroup);
                        }
                        g40Var2.setText(string);
                        this.A1.f(view, true);
                        return;
                    }
                    return;
                }
            }
            if (j0()) {
                g40 g40Var3 = this.A1;
                if (g40Var3 != null) {
                    g40Var3.setText(LocaleController.getString("ForwardsRestrictedInfoBot", R.string.ForwardsRestrictedInfoBot));
                    this.A1.f(view, true);
                    return;
                }
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("canSelectTopics", true);
            bundle.putInt("dialogsType", 3);
            org.telegram.ui.fy fyVar = new org.telegram.ui.fy(bundle);
            fyVar.f38379y2 = new nq0(this);
            o2Var.presentFragment(fyVar);
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
                    TLRPC.Chat chat4 = o2Var.getMessagesController().getChat(Long.valueOf(-dialogId));
                    if (chat4 != null && chat4.migrated_to != null) {
                        bundle2.putLong("migrated_to", dialogId);
                        dialogId = -chat4.migrated_to.channel_id;
                    }
                    bundle2.putLong("chat_id", -dialogId);
                }
                bundle2.putInt("message_id", messageObject.getId());
                bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                org.telegram.ui.tn tnVar = new org.telegram.ui.tn(bundle2);
                tnVar.H7 = messageObject.getId();
                long j12 = this.B;
                if (j12 != 0) {
                    yf.d.a(tnVar, MessagesStorage.TopicKey.of(dialogId, j12));
                    bundle2.putInt("message_id", messageObject.getId());
                }
                o2Var.presentFragment(tnVar, false);
            }
        } else if (i10 == 103 || i10 == 104) {
            if (getClosestTab() == 8) {
                xs0 xs0Var = this.V;
                if (xs0Var != null && xs0Var.f31151s != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (int i19 = 0; i19 < sparseArrayArr[0].size(); i19++) {
                        arrayList4.add(Integer.valueOf(((MessageObject) sparseArrayArr[0].valueAt(i19)).getId()));
                    }
                    if (i10 != 103) {
                        z12 = false;
                    }
                    T0(arrayList4, z12);
                    L(false);
                    return;
                }
                return;
            }
            SavedMessagesController savedMessagesController2 = o2Var.getMessagesController().getSavedMessagesController();
            ArrayList<Long> arrayList5 = new ArrayList<>();
            for (int i20 = 0; i20 < savedMessagesController2.allDialogs.size(); i20++) {
                long j13 = savedMessagesController2.allDialogs.get(i20).dialogId;
                if (zt0Var.f35420w.contains(Long.valueOf(j13))) {
                    arrayList5.add(Long.valueOf(j13));
                }
            }
            if (i10 == 103) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!savedMessagesController2.updatePinned(arrayList5, z10, true)) {
                o2Var.showDialog(new cg.v0(33, o2Var.getCurrentAccount(), getContext(), o2Var, null));
            } else {
                int i21 = 0;
                while (true) {
                    it0[] it0VarArr = this.f32070g0;
                    if (i21 >= it0VarArr.length) {
                        break;
                    }
                    it0 it0Var = it0VarArr[i21];
                    if (it0Var.B == 11) {
                        it0Var.f29472x.h1(0, 0);
                        break;
                    }
                    i21++;
                }
            }
            L(true);
        }
    }

    public boolean D() {
        return !(this instanceof w30);
    }

    public final boolean E() {
        it0 it0Var;
        it0[] it0VarArr = this.f32070g0;
        if (it0VarArr == null || (it0Var = it0VarArr[0]) == null) {
            return false;
        }
        if (this.f32071g1 && p0(it0Var.B)) {
            return false;
        }
        boolean p02 = p0(it0VarArr[0].B);
        int i10 = this.f32075i1[p02 ? 1 : 0];
        if (i10 == X(p02 ? 1 : 0, i10, false)) {
            return false;
        }
        return true;
    }

    public final void F() {
        fs0 fs0Var = this.E0;
        if (!fs0Var.d(fs0Var.getCurrentTabId())) {
            int firstTabId = fs0Var.getFirstTabId();
            fs0Var.setInitialTabId(firstTabId);
            this.f32070g0[0].B = firstTabId;
            m1(false);
        }
    }

    public final void F0() {
        lh.k6 k6Var;
        lh.k6 k6Var2;
        this.C1.removeAllObservers();
        xs0 xs0Var = this.V;
        if (xs0Var != null && (k6Var2 = xs0Var.f31151s) != null && k6Var2 != null) {
            k6Var2.z(xs0Var.v);
        }
        er0 er0Var = this.f32054a0;
        if (er0Var != null && (k6Var = er0Var.f31151s) != null && k6Var != null) {
            k6Var.z(er0Var.v);
        }
        for (pu0 pu0Var : this.U1.values()) {
            ou0 ou0Var = pu0Var.f31775c;
            lh.k6 k6Var3 = ou0Var.f31151s;
            if (k6Var3 != null && k6Var3 != null) {
                k6Var3.z(ou0Var.v);
            }
        }
    }

    public final void G(it0 it0Var, jl0 jl0Var, f2.j0 j0Var) {
        int abs;
        int h;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        f2.n1 K;
        MessageObject messageObject;
        lh.k6 k6Var;
        if (!this.f32079k1 && this.F1 == null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (jl0Var.getFastScroll() == null || !jl0Var.getFastScroll().f32680n || currentTimeMillis - it0Var.f29463a >= 300) {
                it0Var.f29463a = currentTimeMillis;
                if ((!this.R0 || !this.Q0 || it0Var.B == 11) && it0Var.B != 7) {
                    int L0 = j0Var.L0();
                    if (L0 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(j0Var.N0() - L0) + 1;
                    }
                    if (jl0Var.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = jl0Var.getAdapter().h();
                    }
                    int i15 = it0Var.B;
                    int[] iArr = this.f32075i1;
                    fu0[] fu0VarArr = this.f32088p1;
                    if (i15 == 0 || i15 == 1 || i15 == 2 || i15 == 4) {
                        h = fu0VarArr[i15].d() + fu0VarArr[i15].f28534a.size();
                        fu0 fu0Var = fu0VarArr[i15];
                        if (fu0Var.h && fu0Var.f28537e.size() > 2 && it0Var.B == 0 && fu0VarArr[i15].f28534a.size() != 0) {
                            if (i15 == 0) {
                                i10 = iArr[0];
                            } else {
                                i10 = 1;
                            }
                            float f9 = i10;
                            int measuredHeight = (int) ((jl0Var.getMeasuredHeight() / (jl0Var.getMeasuredWidth() / f9)) * f9 * 1.5f);
                            if (measuredHeight < 100) {
                                measuredHeight = 100;
                            }
                            if (measuredHeight < ((nt0) fu0VarArr[i15].f28537e.get(1)).f31136b) {
                                measuredHeight = ((nt0) fu0VarArr[i15].f28537e.get(1)).f31136b;
                            }
                            if ((L0 > h && L0 - h > measuredHeight) || ((i11 = L0 + abs) < fu0VarArr[i15].f28544m && fu0VarArr[0].f28544m - i11 > measuredHeight)) {
                                rm rmVar = new rm(this, i15, jl0Var, 12);
                                this.F1 = rmVar;
                                AndroidUtilities.runOnUIThread(rmVar);
                                return;
                            }
                        }
                    }
                    int i16 = it0Var.B;
                    if (i16 != 7) {
                        if (p0(i16)) {
                            nu0 k12 = k1(it0Var.B);
                            if (k12 != null && (k6Var = k12.f31151s) != null && L0 + abs > k6Var.i() - iArr[1]) {
                                k12.P();
                                return;
                            }
                            return;
                        }
                        int i17 = it0Var.B;
                        if (i17 == 6) {
                            if (abs > 0) {
                                at0 at0Var = this.L;
                                boolean z10 = at0Var.h;
                                ArrayList arrayList = at0Var.d;
                                if (!z10 && !at0Var.f26879e && !arrayList.isEmpty() && L0 + abs >= h - 5) {
                                    at0.E(at0Var, ((TLRPC.Chat) j7.l1.i(1, arrayList)).f22392id);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.o2 o2Var = this.f32093r1;
                        if (i17 == 11) {
                            int i18 = -1;
                            for (int i19 = 0; i19 < it0Var.h.getChildCount(); i19++) {
                                View childAt = it0Var.h.getChildAt(i19);
                                it0Var.h.getClass();
                                i18 = Math.max(RecyclerView.R(childAt), i18);
                            }
                            f2.p0 adapter = it0Var.h.getAdapter();
                            bu0 bu0Var = this.O;
                            if (adapter == bu0Var) {
                                if (i18 + 1 >= bu0Var.h.size() + bu0Var.f27228e.size() && !bu0Var.f27232s && !bu0Var.f27231r) {
                                    bu0Var.f27231r = true;
                                    bu0Var.F();
                                }
                            } else if (i18 + 1 >= o2Var.getMessagesController().getSavedMessagesController().getLoadedCount()) {
                                o2Var.getMessagesController().getSavedMessagesController().loadDialogs(false);
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
                            if (abs + L0 > h - i12 || fu0VarArr[i13].f28546o) {
                                fu0 fu0Var2 = fu0VarArr[i13];
                                if (!fu0Var2.f28539g) {
                                    if (i17 == 0) {
                                        int i20 = fu0VarArr[0].f28548q;
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
                                    boolean[] zArr = fu0Var2.f28540i;
                                    if (!zArr[0]) {
                                        fu0Var2.f28539g = true;
                                        o2Var.getMediaDataController().loadMedia(this.f32069f1, 50, fu0VarArr[i13].f28541j[0], 0, i14, this.B, 1, o2Var.getClassGuid(), fu0VarArr[i13].f28547p, null, null);
                                    } else if (this.Y0 != 0 && !zArr[1]) {
                                        fu0Var2.f28539g = true;
                                        o2Var.getMediaDataController().loadMedia(this.Y0, 50, fu0VarArr[i13].f28541j[1], 0, i14, this.B, 1, o2Var.getClassGuid(), fu0VarArr[i13].f28547p, null, null);
                                    }
                                }
                            }
                            int i21 = fu0VarArr[i13].f28544m;
                            if (i13 == 0) {
                                i21 = this.D.L(0);
                            }
                            if (L0 - i21 < i12 + 1) {
                                fu0 fu0Var3 = fu0VarArr[i13];
                                if (!fu0Var3.f28539g && !fu0Var3.f28543l && !fu0Var3.f28546o) {
                                    A0(it0Var.B);
                                }
                            }
                            it0 it0Var2 = this.f32070g0[0];
                            if (it0Var2.h == jl0Var) {
                                int i22 = it0Var2.B;
                                if ((i22 == 0 || i22 == 5) && L0 != -1 && (K = jl0Var.K(L0)) != null) {
                                    int i23 = K.f6436f;
                                    if (i23 == 0 || i23 == 12) {
                                        View view = K.f6432a;
                                        boolean z11 = view instanceof org.telegram.ui.Cells.q7;
                                        org.telegram.ui.Cells.v0 v0Var = this.G0;
                                        if (z11) {
                                            org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) view;
                                            if (q7Var.f25075e <= 0) {
                                                messageObject = null;
                                            } else {
                                                messageObject = q7Var.f25073b[0];
                                            }
                                            if (messageObject != null) {
                                                v0Var.T(messageObject.messageOwner.date, false, true);
                                            }
                                        } else if (view instanceof org.telegram.ui.Cells.d2) {
                                            v0Var.T(((org.telegram.ui.Cells.d2) view).getDate(), false, true);
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
        if (messageObject != null && !this.f32079k1) {
            kr0 kr0Var = this.S;
            if (kr0Var == null || !kr0Var.f44689w) {
                int i14 = 0;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                i14 = 0;
                String str2 = null;
                lh.k6 k6Var = null;
                boolean z15 = true;
                if (this.f32111y1) {
                    int i15 = 8;
                    if (i11 != 8 || C()) {
                        if (messageObject.getDialogId() == this.f32069f1) {
                            c3 = 0;
                        } else {
                            c3 = 1;
                        }
                        SparseArray[] sparseArrayArr = this.V0;
                        if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0) {
                            sparseArrayArr[c3].remove(messageObject.getId());
                            if (!messageObject.canDeleteMessage(false, null)) {
                                this.W0--;
                            }
                        } else {
                            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                                sparseArrayArr[c3].put(messageObject.getId(), messageObject);
                                if (!messageObject.canDeleteMessage(false, null)) {
                                    this.W0++;
                                }
                            } else {
                                return;
                            }
                        }
                        D0(sparseArrayArr[0]);
                        if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                            b1(false);
                        } else {
                            this.f32104w0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                            if (this.W0 == 0) {
                                i12 = 0;
                            } else {
                                i12 = 8;
                            }
                            this.f32072h0.setVisibility(i12);
                            org.telegram.ui.ActionBar.w0 w0Var = this.f32089q0;
                            if (w0Var != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14 && sparseArrayArr[0].size() == 1) {
                                    i13 = 0;
                                } else {
                                    i13 = 8;
                                }
                                w0Var.setVisibility(i13);
                            }
                            org.telegram.ui.ActionBar.w0 w0Var2 = this.f32087p0;
                            if (w0Var2 != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                                    i15 = 0;
                                }
                                w0Var2.setVisibility(i15);
                            }
                            u1();
                        }
                        this.X0 = false;
                        if (view instanceof org.telegram.ui.Cells.g7) {
                            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                            if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0) {
                                z10 = true;
                            }
                            g7Var.b(z10, true);
                        } else if (view instanceof org.telegram.ui.Cells.q7) {
                            org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) view;
                            if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) < 0) {
                                z15 = false;
                            }
                            q7Var.b(0, z15);
                        } else if (view instanceof org.telegram.ui.Cells.j7) {
                            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                            if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            j7Var.f(z11, true);
                        } else if (view instanceof org.telegram.ui.Cells.f7) {
                            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                            if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0) {
                                z12 = true;
                            }
                            f7Var.e(z12, true);
                        } else if (view instanceof org.telegram.ui.Cells.d2) {
                            org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
                            if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0) {
                                z13 = true;
                            }
                            d2Var.c(z13, true);
                        } else if (view instanceof org.telegram.ui.Cells.p7) {
                            org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
                            if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0) {
                                z14 = true;
                            }
                            p7Var.i(z14, true);
                        }
                    } else {
                        return;
                    }
                } else {
                    pr0 pr0Var = this.f32084n1;
                    fu0[] fu0VarArr = this.f32088p1;
                    org.telegram.ui.ActionBar.o2 o2Var = this.f32093r1;
                    if (i11 == 0) {
                        fu0 fu0Var = fu0VarArr[i11];
                        int i16 = i10 - fu0Var.f28544m;
                        if (i16 >= 0 && i16 < fu0Var.f28534a.size()) {
                            PhotoViewer.t1().K2(null, o2Var, null);
                            PhotoViewer.t1().a2(fu0VarArr[i11].f28534a, i16, this.f32069f1, this.Y0, this.B, pr0Var);
                        }
                    } else if (i11 != 2 && i11 != 4) {
                        if (i11 == 5) {
                            PhotoViewer.t1().K2(null, o2Var, null);
                            int indexOf = fu0VarArr[i11].f28534a.indexOf(messageObject);
                            if (indexOf < 0) {
                                PhotoViewer.t1().a2(org.telegram.messenger.x3.n(messageObject), 0, 0L, 0L, 0L, pr0Var);
                            } else {
                                PhotoViewer.t1().a2(fu0VarArr[i11].f28534a, indexOf, this.f32069f1, this.Y0, this.B, pr0Var);
                            }
                        } else if (i11 == 1) {
                            if (view instanceof org.telegram.ui.Cells.g7) {
                                org.telegram.ui.Cells.g7 g7Var2 = (org.telegram.ui.Cells.g7) view;
                                TLRPC.Document document = messageObject.getDocument();
                                if (g7Var2.C) {
                                    if (messageObject.canPreviewDocument()) {
                                        PhotoViewer.t1().K2(null, o2Var, null);
                                        int indexOf2 = fu0VarArr[i11].f28534a.indexOf(messageObject);
                                        if (indexOf2 < 0) {
                                            PhotoViewer.t1().a2(org.telegram.messenger.x3.n(messageObject), 0, 0L, 0L, 0L, pr0Var);
                                            return;
                                        }
                                        PhotoViewer.t1().a2(fu0VarArr[i11].f28534a, indexOf2, this.f32069f1, this.Y0, this.B, pr0Var);
                                        return;
                                    }
                                    AndroidUtilities.openDocument(messageObject, o2Var.getParentActivity(), o2Var);
                                } else if (!g7Var2.B) {
                                    MessageObject message = g7Var2.getMessage();
                                    message.putInDownloadsStore = true;
                                    o2Var.getFileLoader().loadFile(document, message, 0, 0);
                                    g7Var2.f(true);
                                } else {
                                    o2Var.getFileLoader().cancelLoadFile(document);
                                    g7Var2.f(true);
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
                                        LaunchActivity launchActivity = LaunchActivity.C1;
                                        if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().k(messageObject) == null) {
                                            o2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                            return;
                                        }
                                        return;
                                    }
                                    String str3 = webPage.embed_url;
                                    if (str3 != null && str3.length() != 0) {
                                        mu.I(o2Var, messageObject, this.f32084n1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                        return;
                                    }
                                    str = webPage.url;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    ArrayList arrayList = ((org.telegram.ui.Cells.j7) view).A;
                                    if (arrayList.size() > 0) {
                                        str2 = ((CharSequence) arrayList.get(0)).toString();
                                    }
                                    str = str2;
                                }
                                if (str != null) {
                                    R0(str);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                        } else if (p0(i11)) {
                            nu0 k12 = k1(i11);
                            if (k12 != null) {
                                k6Var = k12.f31151s;
                            }
                            if (k6Var != null) {
                                lh.i9 orCreateStoryViewer = o2Var.getOrCreateStoryViewer();
                                Context context = getContext();
                                int id2 = messageObject.getId();
                                lh.b7 a10 = lh.b7.a(this.f32070g0[0].h);
                                a10.f15404e = new cv(k6Var, 18);
                                if ((o2Var instanceof ProfileActivity) && ((ProfileActivity) o2Var).f36084o1) {
                                    i14 = AndroidUtilities.dp(68.0f);
                                }
                                a10.f15408s += i14;
                                orCreateStoryViewer.C(context, id2, k6Var, a10);
                            } else {
                                return;
                            }
                        }
                    } else if (view instanceof org.telegram.ui.Cells.f7) {
                        ((org.telegram.ui.Cells.f7) view).a();
                    }
                }
                p1();
            }
        }
    }

    public final boolean H(MotionEvent motionEvent) {
        float f9;
        f2.p0 p0Var;
        boolean z10;
        fr0 fr0Var;
        float f10;
        boolean z11;
        it0[] it0VarArr = this.f32070g0;
        int i10 = it0VarArr[0].B;
        if (i10 == 13 && (fr0Var = this.Q) != null) {
            View currentView = fr0Var.f17061n.getCurrentView();
            if (currentView instanceof mh.r) {
                mh.r rVar = (mh.r) currentView;
                mh.l lVar = rVar.v;
                mh.i iVar = rVar.f17045f;
                if (rVar.f17041a != null && rVar.getParent() != null) {
                    if (!rVar.f17042b || rVar.G) {
                        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                            if (motionEvent.getActionMasked() == 2 && (rVar.G || rVar.I)) {
                                int i11 = -1;
                                int i12 = -1;
                                for (int i13 = 0; i13 < motionEvent.getPointerCount(); i13++) {
                                    if (rVar.J == motionEvent.getPointerId(i13)) {
                                        i11 = i13;
                                    }
                                    if (rVar.K == motionEvent.getPointerId(i13)) {
                                        i12 = i13;
                                    }
                                }
                                if (i11 != -1 && i12 != -1) {
                                    float hypot = ((float) Math.hypot(motionEvent.getX(i12) - motionEvent.getX(i11), motionEvent.getY(i12) - motionEvent.getY(i11))) / rVar.L;
                                    rVar.M = hypot;
                                    if (!rVar.G && (hypot > 1.01f || hypot < 0.99f)) {
                                        rVar.G = true;
                                        if (hypot > 1.0f) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        rVar.N = z11;
                                        rVar.b(z11);
                                    }
                                    if (rVar.G) {
                                        boolean z12 = rVar.N;
                                        if ((z12 && rVar.M < 1.0f) || (!z12 && rVar.M > 1.0f)) {
                                            rVar.f17043c = 0.0f;
                                        } else {
                                            if (z12) {
                                                f10 = org.telegram.messenger.x3.a(2.0f, rVar.M, 1.0f, 1.0f);
                                            } else {
                                                f10 = (1.0f - rVar.M) / 0.5f;
                                            }
                                            rVar.f17043c = Math.max(0.0f, Math.min(1.0f, f10));
                                        }
                                        float f11 = rVar.f17043c;
                                        int i14 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
                                        if (i14 == 0 || f11 == 0.0f) {
                                            if (i14 == 0) {
                                                int i15 = rVar.f17044e;
                                                int ceil = (((int) Math.ceil(rVar.O / rVar.f17044e)) * i15) + ((int) ((rVar.S.C.f32102v1 / (iVar.getMeasuredWidth() - ((int) (iVar.getMeasuredWidth() / rVar.f17044e)))) * (i15 - 1)));
                                                if (ceil >= lVar.h()) {
                                                    ceil = lVar.h() - 1;
                                                }
                                                rVar.O = ceil;
                                            }
                                            rVar.a();
                                            if (rVar.f17043c == 0.0f) {
                                                rVar.N = !rVar.N;
                                            }
                                            rVar.b(rVar.N);
                                            rVar.L = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                        }
                                        iVar.invalidate();
                                    }
                                } else {
                                    rVar.H = false;
                                    rVar.I = false;
                                    rVar.G = false;
                                    rVar.a();
                                    return false;
                                }
                            } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((rVar.J == motionEvent.getPointerId(0) && rVar.K == motionEvent.getPointerId(1)) || (rVar.J == motionEvent.getPointerId(1) && rVar.K == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && rVar.G) {
                                rVar.I = false;
                                rVar.H = false;
                                rVar.G = false;
                                rVar.a();
                            }
                        } else {
                            if (rVar.H && !rVar.G && motionEvent.getPointerCount() == 2) {
                                rVar.L = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                rVar.M = 1.0f;
                                rVar.J = motionEvent.getPointerId(0);
                                rVar.K = motionEvent.getPointerId(1);
                                iVar.I0(false);
                                iVar.cancelLongPress();
                                iVar.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                View view = (View) rVar.getParent();
                                rVar.Q = (int) ((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - rVar.getX());
                                int y8 = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - rVar.getY());
                                int i16 = rVar.Q;
                                Rect rect = rVar.R;
                                rVar.O = -1;
                                int i17 = y8 + iVar.T2;
                                for (int i18 = 0; i18 < iVar.getChildCount(); i18++) {
                                    View childAt = iVar.getChildAt(i18);
                                    childAt.getHitRect(rect);
                                    if (rect.contains(i16, i17)) {
                                        rVar.O = RecyclerView.S(childAt);
                                        rVar.P = childAt.getTop();
                                    }
                                }
                                rVar.I = true;
                            }
                            if (motionEvent.getActionMasked() == 0 && (motionEvent.getY() - ((View) rVar.getParent()).getY()) - rVar.getY() > 0.0f) {
                                rVar.H = true;
                            }
                        }
                        return rVar.G;
                    }
                    return true;
                }
            }
            return false;
        }
        if ((i10 == 0 || p0(i10)) && getParent() != null) {
            if (!this.f32079k1 || this.f32053a) {
                if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                    if (motionEvent.getActionMasked() == 2 && (this.f32053a || this.f32059c)) {
                        int i19 = -1;
                        int i20 = -1;
                        for (int i21 = 0; i21 < motionEvent.getPointerCount(); i21++) {
                            if (this.f32064e == motionEvent.getPointerId(i21)) {
                                i19 = i21;
                            }
                            if (this.f32067f == motionEvent.getPointerId(i21)) {
                                i20 = i21;
                            }
                        }
                        if (i19 != -1 && i20 != -1) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(i20) - motionEvent.getX(i19), motionEvent.getY(i20) - motionEvent.getY(i19))) / this.h;
                            this.f32082n = hypot2;
                            if (!this.f32053a && (hypot2 > 1.01f || hypot2 < 0.99f)) {
                                this.f32053a = true;
                                if (hypot2 > 1.0f) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                this.f32091r = z10;
                                e1(z10);
                            }
                            if (this.f32053a) {
                                boolean z13 = this.f32091r;
                                if ((z13 && this.f32082n < 1.0f) || (!z13 && this.f32082n > 1.0f)) {
                                    this.f32077j1 = 0.0f;
                                } else {
                                    if (z13) {
                                        f9 = org.telegram.messenger.x3.a(2.0f, this.f32082n, 1.0f, 1.0f);
                                    } else {
                                        f9 = (1.0f - this.f32082n) / 0.5f;
                                    }
                                    this.f32077j1 = Math.max(0.0f, Math.min(1.0f, f9));
                                }
                                float f12 = this.f32077j1;
                                if (f12 == 1.0f || f12 == 0.0f) {
                                    if (p0(this.l1)) {
                                        p0Var = k1(this.l1);
                                    } else {
                                        p0Var = this.D;
                                    }
                                    if (this.f32077j1 == 1.0f) {
                                        int i22 = this.f32081m1;
                                        int ceil2 = (((int) Math.ceil(this.f32094s / this.f32081m1)) * i22) + ((int) ((this.f32102v1 / (it0VarArr[0].h.getMeasuredWidth() - ((int) (it0VarArr[0].h.getMeasuredWidth() / this.f32081m1)))) * (i22 - 1)));
                                        if (ceil2 >= p0Var.h()) {
                                            ceil2 = p0Var.h() - 1;
                                        }
                                        this.f32094s = ceil2;
                                    }
                                    T();
                                    if (this.f32077j1 == 0.0f) {
                                        this.f32091r = !this.f32091r;
                                    }
                                    e1(this.f32091r);
                                    this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                it0VarArr[0].h.invalidate();
                                it0 it0Var = it0VarArr[0];
                                if (it0Var.C != null) {
                                    it0Var.invalidate();
                                }
                            }
                        } else {
                            this.f32056b = false;
                            this.f32059c = false;
                            this.f32053a = false;
                            T();
                            return false;
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.f32064e == motionEvent.getPointerId(0) && this.f32067f == motionEvent.getPointerId(1)) || (this.f32064e == motionEvent.getPointerId(1) && this.f32067f == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.f32053a) {
                        this.f32059c = false;
                        this.f32056b = false;
                        this.f32053a = false;
                        T();
                    }
                } else {
                    if (this.f32056b && !this.f32053a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.f32082n = 1.0f;
                        this.f32064e = motionEvent.getPointerId(0);
                        this.f32067f = motionEvent.getPointerId(1);
                        it0VarArr[0].h.I0(false);
                        it0VarArr[0].h.cancelLongPress();
                        it0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.f32103w = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - it0VarArr[0].getX());
                        int y10 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - it0VarArr[0].getY());
                        int i23 = this.f32103w;
                        this.f32094s = -1;
                        int i24 = y10 + it0VarArr[0].h.T2;
                        if (getY() != 0.0f && this.A == 1) {
                            i24 = 0;
                        }
                        for (int i25 = 0; i25 < it0VarArr[0].h.getChildCount(); i25++) {
                            View childAt2 = it0VarArr[0].h.getChildAt(i25);
                            Rect rect2 = this.f32106x;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i23, i24)) {
                                it0VarArr[0].h.getClass();
                                this.f32094s = RecyclerView.S(childAt2);
                                this.v = childAt2.getTop();
                            }
                        }
                        if (this.f32113z1.T() && this.f32094s == -1) {
                            this.f32094s = (int) (((this.f32075i1[p0(it0VarArr[0].B) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i23 / it0VarArr[0].h.getMeasuredWidth(), 0.0f))) + it0VarArr[0].f29472x.L0());
                            this.v = 0;
                        }
                        this.f32059c = true;
                    }
                    if (motionEvent.getActionMasked() == 0 && ((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - it0VarArr[0].getY() > 0.0f) {
                        this.f32056b = true;
                    }
                }
                return this.f32053a;
            }
            return true;
        }
        return false;
    }

    public final boolean H0(MessageObject messageObject, View view, int i10, boolean z10) {
        kr0 kr0Var;
        char c3;
        int i11;
        int i12;
        final TL_stories.StoryItem storyItem;
        xs0 xs0Var;
        lh.k6 k6Var;
        if (!this.f32111y1) {
            org.telegram.ui.ActionBar.o2 o2Var = this.f32093r1;
            if (o2Var.getParentActivity() != null && messageObject != null && ((kr0Var = this.S) == null || !kr0Var.f44689w)) {
                AndroidUtilities.hideKeyboard(o2Var.getParentActivity().getCurrentFocus());
                long j10 = this.f32069f1;
                int i13 = 8;
                if (z10 && ((w0(getClosestTab()) || getClosestTab() == 8) && !this.f32111y1)) {
                    if (view instanceof org.telegram.ui.Cells.p7) {
                        org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
                        p7Var.k(p7Var.f24991n, p7Var.f24996r, true);
                    }
                    TL_stories.StoryItem storyItem2 = messageObject.storyItem;
                    if (storyItem2 != null) {
                        HashSet hashSet = new HashSet();
                        ArrayList<Integer> arrayList = storyItem2.albums;
                        if (arrayList != null) {
                            hashSet.addAll(arrayList);
                        }
                        boolean w02 = w0(getClosestTab());
                        j70 I = j70.I(o2Var, view);
                        j70 J = I.J();
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.it0(I, 25), false);
                        J.k();
                        j70.f(J, getStoriesController().B(j10, true), hashSet, true, new g(this, storyItem2, I, 23), new eg.d1(this, hashSet, storyItem2, I, 11));
                        I.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddToAlbum), new ih.z2(I, J, 7), false);
                        I.k();
                        I.c(R.drawable.msg_select, LocaleController.getString(R.string.StoriesAlbumMenuSelect), new ag.z1(this, messageObject, view, i10, 22), false);
                        if (w02) {
                            int h12 = h1(getClosestTab());
                            String w10 = getStoriesController().w(h12, j10);
                            I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new i8(this, h12, 8), false);
                            storyItem = storyItem2;
                            I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.StoriesAlbumMenuRemoveFromAlbum), new ag.z1(this, h12, storyItem, w10, 23), false);
                        } else {
                            storyItem = storyItem2;
                            if (getClosestTab() == 8 && (xs0Var = this.V) != null && (k6Var = xs0Var.f31151s) != null) {
                                if (k6Var.m(storyItem.f22629id)) {
                                    I.c(R.drawable.chats_unpin, LocaleController.getString(R.string.StoriesAlbumMenuUnpin), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r1) {
                                                case 0:
                                                    qu0 qu0Var = this;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qu0Var.getContext(), 0, qu0Var.B1);
                                                    alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.DeleteStoryTitle);
                                                    alertDialog$Builder.f22714a.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new uq0(qu0Var, storyItem));
                                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new xo0(3));
                                                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                                                    c2Var.show();
                                                    c2Var.h();
                                                    return;
                                                case 1:
                                                    qu0 qu0Var2 = this;
                                                    qu0Var2.getClass();
                                                    qu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22629id))), false);
                                                    return;
                                                case 2:
                                                    qu0 qu0Var3 = this;
                                                    qu0Var3.getClass();
                                                    qu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22629id))), true);
                                                    return;
                                                default:
                                                    qu0.h(this, storyItem);
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
                                                    qu0 qu0Var = this;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qu0Var.getContext(), 0, qu0Var.B1);
                                                    alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.DeleteStoryTitle);
                                                    alertDialog$Builder.f22714a.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new uq0(qu0Var, storyItem));
                                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new xo0(3));
                                                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                                                    c2Var.show();
                                                    c2Var.h();
                                                    return;
                                                case 1:
                                                    qu0 qu0Var2 = this;
                                                    qu0Var2.getClass();
                                                    qu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22629id))), false);
                                                    return;
                                                case 2:
                                                    qu0 qu0Var3 = this;
                                                    qu0Var3.getClass();
                                                    qu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22629id))), true);
                                                    return;
                                                default:
                                                    qu0.h(this, storyItem);
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
                                            qu0 qu0Var = this;
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qu0Var.getContext(), 0, qu0Var.B1);
                                            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.DeleteStoryTitle);
                                            alertDialog$Builder.f22714a.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new uq0(qu0Var, storyItem));
                                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new xo0(3));
                                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                                            c2Var.show();
                                            c2Var.h();
                                            return;
                                        case 1:
                                            qu0 qu0Var2 = this;
                                            qu0Var2.getClass();
                                            qu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22629id))), false);
                                            return;
                                        case 2:
                                            qu0 qu0Var3 = this;
                                            qu0Var3.getClass();
                                            qu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22629id))), true);
                                            return;
                                        default:
                                            qu0.h(this, storyItem);
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
                                        qu0 qu0Var = this;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qu0Var.getContext(), 0, qu0Var.B1);
                                        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.DeleteStoryTitle);
                                        alertDialog$Builder.f22714a.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new uq0(qu0Var, storyItem));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new xo0(3));
                                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                                        c2Var.show();
                                        c2Var.h();
                                        return;
                                    case 1:
                                        qu0 qu0Var2 = this;
                                        qu0Var2.getClass();
                                        qu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22629id))), false);
                                        return;
                                    case 2:
                                        qu0 qu0Var3 = this;
                                        qu0Var3.getClass();
                                        qu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22629id))), true);
                                        return;
                                    default:
                                        qu0.h(this, storyItem);
                                        return;
                                }
                            }
                        }, true);
                        I.f29582i = 3;
                        I.f29602u = true;
                        I.v = true;
                        I.L = true;
                        I.M = 3;
                        Point point = AndroidUtilities.displaySize;
                        Point point2 = AndroidUtilities.displaySize;
                        int min = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point2.x, point2.y) * 0.4333f) * 3.0f) / 4.0f));
                        I.N = min;
                        I.O = (min * 4) / 3;
                        I.f29601t = true;
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
                    SparseArray[] sparseArrayArr = this.V0;
                    sparseArrayArr[c3].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.W0++;
                    }
                    if (this.W0 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    this.f32072h0.setVisibility(i11);
                    org.telegram.ui.ActionBar.w0 w0Var = this.f32089q0;
                    if (w0Var != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        } else {
                            i12 = 8;
                        }
                        w0Var.setVisibility(i12);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.f32087p0;
                    if (w0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i13 = 0;
                        }
                        w0Var2.setVisibility(i13);
                    }
                    this.f32104w0.a(1, false);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    int i14 = 0;
                    while (true) {
                        ArrayList arrayList3 = this.J0;
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
                    this.X0 = false;
                    if (view instanceof org.telegram.ui.Cells.g7) {
                        ((org.telegram.ui.Cells.g7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.q7) {
                        ((org.telegram.ui.Cells.q7) view).b(i10, true);
                    } else if (view instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.f7) {
                        ((org.telegram.ui.Cells.f7) view).e(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.d2) {
                        ((org.telegram.ui.Cells.d2) view).c(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.p7) {
                        ((org.telegram.ui.Cells.p7) view).i(true, true);
                    }
                    if (!this.f32111y1) {
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
        char c6;
        float abs;
        View childAt;
        int R;
        float f9;
        float measuredWidth;
        it0[] it0VarArr = this.f32070g0;
        it0 it0Var = it0VarArr[0];
        if (it0Var != null && it0VarArr[1] != null) {
            float f10 = 0.0f;
            kr0 kr0Var = this.S;
            if (kr0Var != null) {
                if (p0(it0Var.B) && it0VarArr[0].B != 9) {
                    c3 = 1;
                } else {
                    c3 = 0;
                }
                if (it0VarArr[1].getVisibility() == 0) {
                    if (p0(it0VarArr[1].B) && it0VarArr[1].B != 9) {
                        c6 = 1;
                    } else {
                        c6 = 0;
                    }
                } else {
                    c6 = c3;
                }
                if (c3 == c6) {
                    if (c3 != 0) {
                        abs = 1.0f;
                    } else {
                        abs = 0.0f;
                    }
                    if (c3 != 0) {
                        measuredWidth = 0.0f;
                    } else {
                        measuredWidth = it0VarArr[0].getMeasuredWidth();
                    }
                    kr0Var.setTranslationX(measuredWidth);
                } else {
                    kr0Var.setTranslationX(it0VarArr[c3 ^ 1].getTranslationX());
                    abs = 1.0f - (Math.abs(kr0Var.getTranslationX()) / kr0Var.getMeasuredWidth());
                }
                float f11 = 0.0f;
                for (int i10 = 0; i10 < it0VarArr.length; i10++) {
                    if (it0VarArr[i10].getVisibility() == 0) {
                        or0 or0Var = it0VarArr[i10].h;
                        if (or0Var.getChildCount() == 0) {
                            childAt = null;
                        } else {
                            childAt = or0Var.getChildAt(0);
                        }
                        if (childAt == null) {
                            R = -1;
                        } else {
                            R = RecyclerView.R(childAt);
                        }
                        if (R == 0) {
                            f9 = childAt.getY() - or0Var.getPaddingTop();
                        } else if (or0Var.getChildCount() == 0) {
                            f9 = 0.0f;
                        } else {
                            f9 = -AndroidUtilities.dp(48.0f);
                        }
                        f11 += Utilities.clamp01(1.0f - (it0VarArr[i10].getTranslationX() / it0VarArr[i10].getMeasuredWidth())) * f9;
                    }
                }
                float clamp01 = Utilities.clamp01(1.0f - ((-f11) / AndroidUtilities.dpf2(48.0f)));
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
                kr0Var.setAlpha(clamp01);
                kr0Var.setScaleX(lerp);
                kr0Var.setScaleY(lerp);
                kr0Var.setTranslationY(this.G1 + f11);
                f10 = abs;
            }
            K();
            if (this.Q1 != f10) {
                this.Q1 = f10;
                o0();
                invalidate();
            }
        }
    }

    public boolean I0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return false;
    }

    public final boolean J() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qu0.J():boolean");
    }

    public final void J0(float f9) {
        int i10;
        int i11;
        it0[] it0VarArr = this.f32070g0;
        int i12 = (f9 > 1.0f ? 1 : (f9 == 1.0f ? 0 : -1));
        if (i12 != 0 || it0VarArr[1].getVisibility() == 0) {
            if (this.f32063d1) {
                it0 it0Var = it0VarArr[0];
                it0Var.setTranslationX((-f9) * it0Var.getMeasuredWidth());
                it0VarArr[1].setTranslationX(it0VarArr[0].getMeasuredWidth() - (it0VarArr[0].getMeasuredWidth() * f9));
            } else {
                it0 it0Var2 = it0VarArr[0];
                it0Var2.setTranslationX(it0Var2.getMeasuredWidth() * f9);
                it0VarArr[1].setTranslationX((it0VarArr[0].getMeasuredWidth() * f9) - it0VarArr[0].getMeasuredWidth());
            }
            M0(getTabProgress());
            float a02 = a0(f9);
            this.f32080l0 = a02;
            int i13 = 4;
            if (a02 != 0.0f && D() && !q0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            this.f32083n0.setVisibility(i10);
            org.telegram.ui.ActionBar.w0 w0Var = this.f32076j0;
            if (w0Var != null && !D()) {
                if (v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                w0Var.setVisibility(i11);
                this.f32078k0 = 0.0f;
            } else {
                this.f32078k0 = b0(f9);
                t1();
            }
            q1(false);
            if (i12 == 0) {
                it0 it0Var3 = it0VarArr[0];
                it0VarArr[0] = it0VarArr[1];
                it0VarArr[1] = it0Var3;
                it0Var3.setVisibility(8);
                if (w0Var != null && this.f32097t0 == 2) {
                    if (v0()) {
                        i13 = 8;
                    }
                    w0Var.setVisibility(i13);
                }
                this.f32097t0 = 0;
                f1();
            }
        }
    }

    public final void K() {
        fs fsVar = this.L0;
        if (fsVar != null) {
            kr0 kr0Var = this.S;
            float f9 = 0.0f;
            if (kr0Var != null) {
                f9 = 0.0f + (kr0Var.getVisibilityFactor() * AndroidUtilities.dp(38.0f) * (1.0f - Math.abs(kr0Var.getTranslationX() / kr0Var.getMeasuredWidth())));
            }
            fsVar.setTranslationY(this.G1 + f9);
        }
    }

    public final boolean L(boolean z10) {
        SparseArray[] sparseArrayArr;
        if (!this.f32111y1) {
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
        fr0 fr0Var = this.Q;
        if (fr0Var != null) {
            fr0Var.h();
            fr0Var.j();
        }
        b1(false);
        r1(z10);
        zt0 zt0Var = this.N;
        if (zt0Var != null) {
            zt0Var.f35420w.clear();
        }
        return true;
    }

    public void L0() {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (!v0() && !q0()) {
            z10 = false;
        } else {
            z10 = true;
        }
        lu0 lu0Var = this.f32054a0.f31152w;
        if (lu0Var != null) {
            if (z10 && getClosestTab() == 9) {
                z13 = true;
            } else {
                z13 = false;
            }
            lu0Var.b(z13);
        }
        lu0 lu0Var2 = this.V.f31152w;
        if (lu0Var2 != null) {
            if (z10 && getClosestTab() == 8) {
                z12 = true;
            } else {
                z12 = false;
            }
            lu0Var2.b(z12);
        }
        for (pu0 pu0Var : this.U1.values()) {
            ou0 ou0Var = pu0Var.f31775c;
            if (ou0Var.f31151s != null) {
                lu0 lu0Var3 = ou0Var.f31152w;
                if (z10 && getClosestTab() == pu0Var.f31773a) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                lu0Var3.b(z11);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.f32076j0;
        if (w0Var != null) {
            cs0 cs0Var = this.F0;
            if (cs0Var != null && cs0Var.a() && getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            w0Var.setSearchFieldHint(LocaleController.getString(i10));
        }
        I();
    }

    public void M0(float f9) {
        E0();
    }

    public boolean N() {
        return this instanceof w30;
    }

    public final boolean O(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x4 = (-view.getX()) - getX();
        it0[] it0VarArr = this.f32070g0;
        motionEvent.offsetLocation(x4 - it0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - it0VarArr[0].getY()) - it0VarArr[0].h.getFastScroll().getY());
        return it0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public final void O0(org.telegram.ui.ActionBar.o2 o2Var, long j10, int i10) {
        new org.telegram.ui.q61(o2Var, j10, this.f32075i1[1], new pc(this, j10, i10)).show();
    }

    public void P(Canvas canvas, float f9, Rect rect, Paint paint) {
        canvas.drawRect(rect, paint);
    }

    public final void P0(org.telegram.ui.ActionBar.o2 o2Var, long j10, int i10) {
        c5.v0(o2Var, LocaleController.getString(R.string.Delete), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesAlbumMenuDeleteAlbumAsk, getStoriesController().w(i10, j10))), LocaleController.getString(R.string.Delete), true, new jh.z8(this, j10, i10, 8));
    }

    public final void Q(Canvas canvas, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            it0[] it0VarArr = this.f32070g0;
            if (i10 < it0VarArr.length) {
                it0 it0Var = it0VarArr[i10];
                if (it0Var != null && it0Var.getVisibility() == 0) {
                    for (int i11 = 0; i11 < it0VarArr[i10].h.getChildCount(); i11++) {
                        View childAt = it0VarArr[i10].h.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + it0VarArr[i10].h.T2) {
                            int save = canvas.save();
                            canvas.translate(childAt.getX() + it0VarArr[i10].getX(), childAt.getY() + it0VarArr[i10].h.getY() + it0VarArr[i10].getY() + getY());
                            childAt.draw(canvas);
                            if (arrayList != null && (childAt instanceof ev0)) {
                                arrayList.add((ev0) childAt);
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

    public final void Q0(org.telegram.ui.ActionBar.o2 o2Var, long j10, int i10) {
        String w10 = getStoriesController().w(i10, j10);
        Context context = o2Var.getContext();
        org.telegram.ui.ActionBar.c6 resourceProvider = o2Var.getResourceProvider();
        k3.e eVar = new k3.e(this, j10, i10);
        Pattern pattern = c5.f27308a;
        c5.R(context, o2Var, LocaleController.getString(R.string.StoriesAlbumRename), LocaleController.getString(R.string.StoriesAlbumRenameHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), w10, 12, LocaleController.getString(R.string.Rename), resourceProvider, eVar);
    }

    public final boolean R(int i10) {
        fu0[] fu0VarArr = this.f32090q1.f29480n;
        if (fu0VarArr == null) {
            return false;
        }
        fu0[] fu0VarArr2 = this.f32088p1;
        if (i10 == 0) {
            fu0 fu0Var = fu0VarArr2[i10];
            if (!fu0Var.h) {
                int[] iArr = fu0Var.f28538f;
                int[] iArr2 = fu0VarArr[i10].f28538f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = fu0VarArr2[i10].f28538f;
            int[] iArr4 = fu0VarArr[i10].f28538f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        fu0VarArr2[i10].f28534a.addAll(fu0VarArr[i10].f28534a);
        fu0VarArr2[i10].f28536c.addAll(fu0VarArr[i10].f28536c);
        for (Map.Entry entry : fu0VarArr[i10].d.entrySet()) {
            fu0VarArr2[i10].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i11 = 0; i11 < 2; i11++) {
            fu0VarArr2[i10].f28535b[i11] = fu0VarArr[i10].f28535b[i11].clone();
            fu0 fu0Var2 = fu0VarArr2[i10];
            int[] iArr5 = fu0Var2.f28541j;
            fu0 fu0Var3 = fu0VarArr[i10];
            iArr5[i11] = fu0Var3.f28541j[i11];
            fu0Var2.f28540i[i11] = fu0Var3.f28540i[i11];
        }
        fu0VarArr2[i10].f28537e.addAll(fu0VarArr[i10].f28537e);
        return !fu0VarArr[i10].f28534a.isEmpty();
    }

    public final void R0(String str) {
        boolean shouldShowUrlInAlert = AndroidUtilities.shouldShowUrlInAlert(str);
        org.telegram.ui.ActionBar.o2 o2Var = this.f32093r1;
        if (shouldShowUrlInAlert) {
            c5.q0(o2Var, str, true, true);
        } else {
            ye.d.s(o2Var.getParentActivity(), str);
        }
    }

    public final void S(int i10, jl0 jl0Var, boolean z10) {
        ArrayList arrayList = this.f32088p1[i10].f28537e;
        int L0 = ((f2.j0) jl0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            nt0 nt0Var = null;
            if (arrayList != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (L0 <= ((nt0) arrayList.get(i11)).f31136b) {
                        nt0Var = (nt0) arrayList.get(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                if (nt0Var == null) {
                    nt0Var = (nt0) j7.l1.i(1, arrayList);
                }
            }
            if (nt0Var != null) {
                y0(i10, nt0Var.d, nt0Var.f31136b + 1, z10);
            }
        }
    }

    public int S0() {
        return -1;
    }

    public final void T() {
        it0[] it0VarArr;
        it0 it0Var;
        boolean z10;
        int i10;
        f2.p0 adapter;
        if (this.f32079k1) {
            int i11 = 0;
            while (true) {
                it0VarArr = this.f32070g0;
                if (i11 < it0VarArr.length) {
                    it0Var = it0VarArr[i11];
                    if (it0Var.B == this.l1) {
                        break;
                    }
                    i11++;
                } else {
                    it0Var = null;
                    break;
                }
            }
            if (it0Var != null) {
                boolean p02 = p0(it0Var.B);
                float f9 = this.f32077j1;
                fu0[] fu0VarArr = this.f32088p1;
                float f10 = 1.0f;
                if (f9 == 1.0f) {
                    this.f32079k1 = false;
                    int i12 = this.f32081m1;
                    int[] iArr = this.f32075i1;
                    iArr[p02 ? 1 : 0] = i12;
                    if (!p02) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (c0(it0Var.B) >= 5) {
                        SharedConfig.setStoriesColumnsCount(this.f32081m1);
                    }
                    for (int i13 = 0; i13 < it0VarArr.length; i13++) {
                        it0 it0Var2 = it0VarArr[i13];
                        if (it0Var2 != null && it0Var2.h != null && (((i10 = it0Var2.B) == 0 || p0(i10)) && (adapter = it0VarArr[i13].h.getAdapter()) != null)) {
                            int h = adapter.h();
                            if (i13 == 0) {
                                fu0VarArr[0].g(false);
                            }
                            it0VarArr[i13].f29469r.setVisibility(8);
                            it0VarArr[i13].f29472x.y1(iArr[p02 ? 1 : 0]);
                            it0VarArr[i13].h.a0();
                            it0VarArr[i13].h.invalidate();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(it0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                    }
                    if (this.f32094s >= 0) {
                        for (int i14 = 0; i14 < it0VarArr.length; i14++) {
                            it0 it0Var3 = it0VarArr[i14];
                            if (it0Var3.B == this.l1) {
                                View m10 = it0Var3.f29470s.m(this.f32094s);
                                if (m10 != null) {
                                    this.v = m10.getTop();
                                }
                                it0 it0Var4 = it0VarArr[i14];
                                it0Var4.f29472x.h1(this.f32094s, (-it0Var4.h.getPaddingTop()) + this.v);
                            }
                        }
                        return;
                    }
                    X0();
                } else if (f9 == 0.0f) {
                    this.f32079k1 = false;
                    if (this.l1 == 0) {
                        fu0VarArr[0].g(false);
                    }
                    it0Var.f29469r.setVisibility(8);
                    it0Var.h.invalidate();
                } else {
                    if (f9 > 0.2f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, f10);
                    ofFloat.addUpdateListener(new es0(this, it0Var, 0));
                    ofFloat.addListener(new org.telegram.ui.vi(this, z10, p02 ? 1 : 0, it0Var));
                    ofFloat.setInterpolator(jr.f29800f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                }
            }
        }
    }

    public final void T0(ArrayList arrayList, boolean z10) {
        boolean z11;
        boolean z12;
        xs0 xs0Var = this.V;
        if (xs0Var != null && xs0Var.f31151s != null) {
            org.telegram.ui.ActionBar.o2 o2Var = this.f32093r1;
            if (z10 && arrayList.size() > o2Var.getMessagesController().storiesPinnedToTopCountMax) {
                tc.a0(o2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", o2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
                return;
            }
            lh.k6 k6Var = xs0Var.f31151s;
            int i10 = k6Var.f15834c;
            ArrayList arrayList2 = k6Var.f15837g;
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
                    k6Var.d(true);
                    TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                    tL_togglePinnedToTop.f22642id.addAll(arrayList2);
                    tL_togglePinnedToTop.peer = MessagesController.getInstance(i10).getInputPeer(k6Var.d);
                    ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new lh.o5(2));
                }
                z13 = z11;
            }
            if (z13) {
                tc.a0(o2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", o2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
            } else if (z10) {
                tc.a0(o2Var).M(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinned", arrayList.size(), new Object[0])), LocaleController.formatPluralString("StoriesPinnedText", arrayList.size(), new Object[0]), R.raw.ic_pin).j();
            } else {
                tc.a0(o2Var).Q(R.raw.ic_unpin, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesUnpinned", arrayList.size(), new Object[0]))).j();
            }
        }
    }

    public final void U(int i10) {
        ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i10 == 0) {
            if (!AndroidUtilities.isTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 2) {
                this.f32104w0.setTextSize(18);
            } else {
                this.f32104w0.setTextSize(20);
            }
        }
        if (i10 == 0) {
            this.D.l();
        }
    }

    public final boolean U0(MotionEvent motionEvent, boolean z10) {
        int i10;
        it0 it0Var;
        fr0 fr0Var;
        int i11;
        int i12;
        int closestTab = getClosestTab();
        fs0 fs0Var = this.E0;
        SparseIntArray sparseIntArray = fs0Var.K;
        int i13 = fs0Var.f26538n;
        int i14 = -1;
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i15 = sparseIntArray.get(i13 + i10, -1);
        kr0 kr0Var = this.S;
        if (kr0Var != null) {
            if (!w0(closestTab) && closestTab != 8) {
                if (w0(i15) || i15 == 8) {
                    i14 = kr0Var.getCurrentAlbumId();
                }
            } else {
                y71 y71Var = kr0Var.f44686n;
                SparseIntArray sparseIntArray2 = y71Var.U;
                int i16 = y71Var.B;
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
                i15 = i1(i14).f31773a;
            }
        }
        if (i15 >= 0) {
            org.telegram.ui.ActionBar.w0 w0Var = this.f32076j0;
            if (w0Var != null && !D()) {
                if (v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                w0Var.setVisibility(i11);
                this.f32078k0 = 0.0f;
            } else {
                this.f32078k0 = b0(0.0f);
                s1(0.0f);
            }
            if ((!this.R0 || getSelectedTab() != 11) && (!C() || !this.f32111y1 || (getClosestTab() != 8 && !w0(getClosestTab())))) {
                it0[] it0VarArr = this.f32070g0;
                it0 it0Var2 = it0VarArr[0];
                if (it0Var2 != null && it0Var2.B == 13 && (fr0Var = this.Q) != null) {
                    mh.a aVar = fr0Var.f17061n;
                    if (!z10) {
                    }
                }
                it0 it0Var3 = it0VarArr[0];
                gr0 gr0Var = this.R;
                if (it0Var3 != null && it0Var3.B == 14 && gr0Var != null) {
                    ih.r2 r2Var = gr0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.f32111y1 || (it0Var = it0VarArr[0]) == null || it0Var.B != 13) && ((gr0Var == null || !gr0Var.g()) && (kr0Var == null || !kr0Var.f44689w))) {
                    q1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    k0();
                    this.f32100u1 = false;
                    this.f32098t1 = true;
                    N0(true);
                    this.f32102v1 = (int) motionEvent.getX();
                    this.C.setEnabled(false);
                    fs0Var.setEnabled(false);
                    it0 it0Var4 = it0VarArr[1];
                    it0Var4.B = i15;
                    it0Var4.setVisibility(0);
                    this.f32063d1 = z10;
                    m1(true);
                    if (z10) {
                        it0VarArr[1].setTranslationX(it0VarArr[0].getMeasuredWidth());
                    } else {
                        it0VarArr[1].setTranslationX(-it0VarArr[0].getMeasuredWidth());
                    }
                    M0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    public final String V(boolean z10) {
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        fr0 fr0Var;
        if (!r0()) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        if (z10 && (fr0Var = this.Q) != null) {
            return fr0Var.getBotPreviewsSubtitle();
        }
        xs0 xs0Var = this.V;
        if (xs0Var != null && xs0Var.f31151s != null) {
            i10 = 0;
            i11 = 0;
            for (int i12 = 0; i12 < xs0Var.f31151s.f15838i.size(); i12++) {
                MessageObject messageObject = (MessageObject) xs0Var.f31151s.f15838i.get(i12);
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

    public final it0 W(int i10) {
        int i11 = 0;
        while (true) {
            it0[] it0VarArr = this.f32070g0;
            if (i11 < it0VarArr.length) {
                it0 it0Var = it0VarArr[i11];
                if (it0Var != null && it0Var.B == i10) {
                    return it0Var;
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    public final void W0(f2.p0 p0Var) {
        if (p0Var instanceof ku0) {
            ArrayList arrayList = this.A0;
            ArrayList arrayList2 = this.B0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        } else if (p0Var == this.I) {
            ArrayList arrayList3 = this.C0;
            ArrayList arrayList4 = this.D0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
        } else {
            wt0 wt0Var = this.J;
            if (p0Var == wt0Var) {
                wt0Var.f34492r = null;
            }
        }
    }

    public final int X(int i10, int i11, boolean z10) {
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
        return Utilities.clamp(i14, 9, (this.f32071g1 && i10 == 1) ? 2 : 2);
    }

    public final void X0() {
        int i10;
        int i11 = 0;
        while (true) {
            it0[] it0VarArr = this.f32070g0;
            if (i11 < it0VarArr.length) {
                or0 or0Var = it0VarArr[i11].h;
                if (or0Var != null) {
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < or0Var.getChildCount(); i14++) {
                        View childAt = or0Var.getChildAt(i14);
                        if (childAt instanceof org.telegram.ui.Cells.p7) {
                            org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) childAt;
                            int messageId = p7Var.getMessageId();
                            i13 = p7Var.getTop();
                            i12 = messageId;
                        }
                        if (childAt instanceof org.telegram.ui.Cells.g7) {
                            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                            int id2 = g7Var.getMessage().getId();
                            i13 = g7Var.getTop();
                            i12 = id2;
                        }
                        if (childAt instanceof org.telegram.ui.Cells.f7) {
                            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) childAt;
                            i12 = f7Var.getMessage().getId();
                            i13 = f7Var.getTop();
                        }
                        if (i12 != 0) {
                            break;
                        }
                    }
                    if (i12 != 0) {
                        int i15 = it0VarArr[i11].B;
                        int i16 = -1;
                        if (p0(i15)) {
                            nu0 k12 = k1(i15);
                            if (k12 != null && k12.f31151s != null) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= k12.f31151s.f15838i.size()) {
                                        break;
                                    } else if (i12 == ((MessageObject) k12.f31151s.f15838i.get(i17)).getId()) {
                                        i16 = i17;
                                        break;
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                            i10 = i16;
                        } else if (i15 >= 0) {
                            fu0[] fu0VarArr = this.f32088p1;
                            if (i15 < fu0VarArr.length) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= fu0VarArr[i15].f28534a.size()) {
                                        break;
                                    } else if (i12 == ((MessageObject) fu0VarArr[i15].f28534a.get(i18)).getId()) {
                                        i16 = i18;
                                        break;
                                    } else {
                                        i18++;
                                    }
                                }
                                i10 = fu0VarArr[i15].f28544m + i16;
                            }
                        }
                        if (i16 >= 0) {
                            ((f2.j0) or0Var.getLayoutManager()).h1(i10, (-it0VarArr[i11].h.getPaddingTop()) + i13);
                            if (this.f32079k1) {
                                it0 it0Var = it0VarArr[i11];
                                it0Var.f29470s.h1(i10, (-it0Var.h.getPaddingTop()) + i13);
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

    public final int Y(boolean z10) {
        int i10;
        int i11 = this.T1;
        if (z10) {
            i10 = AndroidUtilities.dp(52.0f);
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public final void Y0(int i10) {
        fs0 fs0Var;
        if (!this.H1 && (fs0Var = this.E0) != null) {
            fs0Var.h(null, i10, fs0Var.L.get(i10));
        }
    }

    public final int Z(int i10) {
        float f9;
        int i11;
        int dp = AndroidUtilities.dp(54.0f) + this.X1;
        kr0 kr0Var = this.S;
        if (kr0Var != null && (w0(i10) || i10 == 8)) {
            f9 = kr0Var.getVisibilityFactor() * AndroidUtilities.dp(40.0f);
        } else {
            f9 = 0.0f;
        }
        int i12 = dp + ((int) f9);
        if (i10 == 9) {
            i11 = AndroidUtilities.dp(64.0f);
        } else {
            i11 = 0;
        }
        return i12 + i11;
    }

    public final void Z0(float f9, int i10) {
        int i11;
        fs0 fs0Var = this.E0;
        if (fs0Var != null) {
            if (w0(i10)) {
                i11 = 8;
            } else {
                i11 = i10;
            }
            fs0Var.j(f9, i11);
        }
        kr0 kr0Var = this.S;
        if (kr0Var != null) {
            y71 y71Var = kr0Var.f44686n;
            if (w0(i10)) {
                y71Var.f(f9, h1(i10));
            } else if (i10 == 8) {
                y71Var.f(f9, 0);
            }
        }
    }

    public final float a0(float f9) {
        int i10;
        int i11;
        int i12;
        int i13;
        float f10 = 0.0f;
        if (q0()) {
            return 0.0f;
        }
        it0[] it0VarArr = this.f32070g0;
        it0 it0Var = it0VarArr[1];
        gr0 gr0Var = this.R;
        if (it0Var != null && ((i12 = it0Var.B) == 0 || (((i12 == 8 || w0(i12)) && TextUtils.isEmpty(getStoriesHashtag())) || (i13 = it0VarArr[1].B) == 9 || i13 == 11 || i13 == 13 || (i13 == 14 && gr0Var != null)))) {
            f10 = 0.0f + f9;
        }
        it0 it0Var2 = it0VarArr[0];
        if (it0Var2 != null && ((i10 = it0Var2.B) == 0 || (((i10 == 8 || w0(i10)) && TextUtils.isEmpty(getStoriesHashtag())) || (i11 = it0VarArr[0].B) == 9 || i11 == 11 || i11 == 13 || (i11 == 14 && gr0Var != null)))) {
            return (1.0f - f9) + f10;
        }
        return f10;
    }

    public final void a1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i10 = 0;
        while (true) {
            it0[] it0VarArr = this.f32070g0;
            if (i10 < it0VarArr.length) {
                it0 it0Var = it0VarArr[i10];
                if (it0Var.B != 7 || it0Var.h.getAdapter() == null || it0VarArr[i10].h.getAdapter().h() == 0 || this.f32093r1.getMessagesController().getStoriesController().f16225j.size() <= 0) {
                    i10++;
                } else {
                    return;
                }
            } else {
                if (this.B == 0) {
                    zs0 zs0Var = this.T;
                    zs0Var.d = chatFull;
                    zs0Var.f35412e = arrayList;
                }
                v1(true);
                for (int i11 = 0; i11 < it0VarArr.length; i11++) {
                    it0 it0Var2 = it0VarArr[i11];
                    if (it0Var2.B == 7 && it0Var2.h.getAdapter() != null) {
                        AndroidUtilities.notifyDataSetChanged(it0VarArr[i11].h);
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

    public final float b0(float f9) {
        float f10 = 0.0f;
        if (q0()) {
            return 0.0f;
        }
        it0[] it0VarArr = this.f32070g0;
        it0 it0Var = it0VarArr[1];
        if (it0Var != null && s0(it0Var.B) && it0VarArr[1].B != 11) {
            f10 = 0.0f + f9;
        }
        it0 it0Var2 = it0VarArr[0];
        if (it0Var2 != null && s0(it0Var2.B) && it0VarArr[0].B != 11) {
            return (1.0f - f9) + f10;
        }
        return f10;
    }

    public void b1(boolean z10) {
        float f9;
        if (this.f32111y1 != z10) {
            this.f32111y1 = z10;
            AnimatorSet animatorSet = this.J1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ea eaVar = this.f32107x0;
            if (z10) {
                eaVar.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.J1 = animatorSet2;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(eaVar, View.ALPHA, f9));
            this.J1.setDuration(180L);
            this.J1.addListener(new z9(19, this, z10));
            this.J1.start();
            if (z10) {
                u1();
            }
        }
    }

    public final int c0(int i10) {
        nu0 k12;
        lh.k6 k6Var;
        if (p0(i10) && (k12 = k1(i10)) != null && (k6Var = k12.f31151s) != null) {
            return k6Var.g();
        }
        return 0;
    }

    public final void c1(int r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qu0.c1(int, boolean):void");
    }

    public final void d1(int i10) {
        int h12 = h1(getClosestTab());
        kr0 kr0Var = this.S;
        if (h12 != i10) {
            if (kr0Var != null) {
                kr0Var.f44686n.d(i10, kr0Var.f44688s.i(i10));
                return;
            }
            return;
        }
        kr0Var.setReorderingAlbums(true);
        pu0 i12 = i1(i10);
        it0 W = W(i12.f31773a);
        if (W == null) {
            return;
        }
        or0 or0Var = W.h;
        for (int i11 = 0; i11 < or0Var.getChildCount(); i11++) {
            View childAt = or0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.p7) {
                ((org.telegram.ui.Cells.p7) childAt).l(true, true);
            }
        }
        ou0 ou0Var = i12.f31775c;
        if (ou0Var != null && !ou0Var.f31153x) {
            ou0Var.f31153x = true;
        }
        q1(true);
    }

    @Override
    public final void didReceivedNotification(int r42, int r43, java.lang.Object... r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qu0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        fs0 fs0Var = this.E0;
        if (fs0Var != null) {
            canvas.save();
            canvas.translate(fs0Var.getX(), fs0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        bs0 bs0Var = this.N0;
        if (bs0Var != null) {
            int i10 = bs0Var.P;
            if ((i10 == 3 || i10 == 1) && this.L0 == null) {
                canvas.save();
                canvas.translate(bs0Var.getX(), bs0Var.getY());
                bs0Var.setDrawOverlay(true);
                bs0Var.draw(canvas);
                bs0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i10;
        if (view == this.N0 && this.L0 == null) {
            canvas.save();
            it0[] it0VarArr = this.f32070g0;
            float top = it0VarArr[0].getTop();
            kr0 kr0Var = this.S;
            if (kr0Var != null && ((i10 = it0VarArr[0].B) == 8 || w0(i10))) {
                top -= kr0Var.getVisualHeight();
            }
            canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + AndroidUtilities.dp(12.0f));
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void e(org.telegram.ui.Cells.p2 p2Var) {
        int i10;
        org.telegram.ui.ActionBar.o2 o2Var = this.f32093r1;
        if (o2Var != null && o2Var.getMessagesController().getStoriesController().I(p2Var.getDialogId())) {
            o2Var.getOrCreateStoryViewer().getClass();
            lh.i9 orCreateStoryViewer = o2Var.getOrCreateStoryViewer();
            Context context = o2Var.getContext();
            long dialogId = p2Var.getDialogId();
            lh.b7 a10 = lh.b7.a((jl0) p2Var.getParent());
            if ((o2Var instanceof ProfileActivity) && ((ProfileActivity) o2Var).f36084o1) {
                i10 = AndroidUtilities.dp(68.0f);
            } else {
                i10 = 0;
            }
            a10.f15408s += i10;
            orCreateStoryViewer.D(context, dialogId, a10);
        }
    }

    public final void e1(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qu0.e1(boolean):void");
    }

    public final float f0(int i10, boolean z10) {
        float width = getWidth();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            it0[] it0VarArr = this.f32070g0;
            if (i11 >= it0VarArr.length) {
                break;
            }
            it0 it0Var = it0VarArr[i11];
            if (it0Var != null) {
                int i13 = it0Var.B;
                if ((z10 && i10 == 8 && w0(i13)) || i13 == i10) {
                    i12++;
                    width = it0VarArr[i11].getTranslationX();
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
            it0[] it0VarArr = this.f32070g0;
            if (i10 < it0VarArr.length) {
                int childCount = it0VarArr[i10].h.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = it0VarArr[i10].h.getChildAt(i11);
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

    public final float g0(int i10, boolean z10) {
        float f9 = 0.0f;
        int i11 = 0;
        while (true) {
            it0[] it0VarArr = this.f32070g0;
            if (i11 < it0VarArr.length) {
                it0 it0Var = it0VarArr[i11];
                if (it0Var != null) {
                    int i12 = it0Var.B;
                    if ((z10 && i10 == 8 && w0(i12)) || i12 == i10) {
                        f9 = (1.0f - Math.abs(it0VarArr[i11].getTranslationX() / getWidth())) + f9;
                    }
                }
                i11++;
            } else {
                return f9;
            }
        }
    }

    public final void g1(MotionEvent motionEvent) {
        float f9;
        float f10;
        boolean z10;
        float measuredWidth;
        it0 it0Var;
        it0 it0Var2;
        int measuredWidth2;
        it0 it0Var3;
        it0 it0Var4;
        boolean z11;
        VelocityTracker velocityTracker = this.f32108x1;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.O0);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f9 = this.f32108x1.getXVelocity();
                f10 = this.f32108x1.getYVelocity();
                if (!this.f32098t1 && Math.abs(f9) >= 3000.0f && Math.abs(f9) > Math.abs(f10)) {
                    if (f9 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    U0(motionEvent, z11);
                }
            } else {
                f9 = 0.0f;
                f10 = 0.0f;
            }
            if (this.f32098t1) {
                it0[] it0VarArr = this.f32070g0;
                float x4 = it0VarArr[0].getX();
                this.f32058b1 = new AnimatorSet();
                if (Math.abs(x4) < it0VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f9) < 3500.0f || Math.abs(f9) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f32066e1 = z10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new d70(this, 19));
                boolean z12 = this.f32066e1;
                Property property = View.TRANSLATION_X;
                if (z12) {
                    measuredWidth = Math.abs(x4);
                    if (this.f32063d1) {
                        this.f32058b1.playTogether(ObjectAnimator.ofFloat(it0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(it0VarArr[1], property, it0Var4.getMeasuredWidth()), ofFloat);
                    } else {
                        this.f32058b1.playTogether(ObjectAnimator.ofFloat(it0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(it0VarArr[1], property, -it0Var3.getMeasuredWidth()), ofFloat);
                    }
                } else {
                    measuredWidth = it0VarArr[0].getMeasuredWidth() - Math.abs(x4);
                    if (this.f32063d1) {
                        this.f32058b1.playTogether(ObjectAnimator.ofFloat(it0VarArr[0], property, -it0Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(it0VarArr[1], property, 0.0f), ofFloat);
                    } else {
                        this.f32058b1.playTogether(ObjectAnimator.ofFloat(it0VarArr[0], property, it0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(it0VarArr[1], property, 0.0f), ofFloat);
                    }
                }
                this.f32058b1.setInterpolator(a2);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs = Math.abs(f9);
                if (abs > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                this.f32058b1.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                this.f32058b1.addListener(new is0(this, 1));
                this.f32058b1.start();
                this.f32061c1 = true;
                this.f32098t1 = false;
                L0();
            } else {
                this.f32100u1 = false;
                this.C.setEnabled(true);
                this.E0.setEnabled(true);
            }
            VelocityTracker velocityTracker2 = this.f32108x1;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f32108x1 = null;
            }
        }
    }

    public SparseArray<MessageObject> getActionModeSelected() {
        return this.V0[0];
    }

    public float getBottomButtonStoriesVisibility() {
        it0 it0Var;
        it0 it0Var2;
        boolean z10;
        boolean z11;
        lh.k6 k6Var;
        lh.k6 k6Var2;
        float f9 = 1.0f;
        it0[] it0VarArr = this.f32070g0;
        if (it0VarArr == null || (it0Var = it0VarArr[0]) == null || (it0Var2 = it0VarArr[1]) == null || it0Var.f29471w == null || it0Var2.f29471w == null) {
            return 1.0f;
        }
        int i10 = it0Var.B;
        int i11 = it0Var2.B;
        if (!w0(i10) && i10 != 8) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!w0(i11) && i11 != 8) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z10 && !z11) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - it0VarArr[0].f29471w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - it0VarArr[1].f29471w.getVisibilityFactor();
        nu0 k12 = k1(it0VarArr[0].B);
        if (i10 == 8 || (k12 != null && (k6Var2 = k12.f31151s) != null && k6Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        nu0 k13 = k1(i11);
        if (i11 != 8 && (k13 == null || (k6Var = k13.f31151s) == null || k6Var.g() <= 0)) {
            f9 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f9;
        }
        if (!z11) {
            f9 = visibilityFactor;
        }
        return AndroidUtilities.lerp(visibilityFactor, f9, Math.abs(it0VarArr[0].getTranslationX() / it0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        it0[] it0VarArr = this.f32070g0;
        it0 it0Var = it0VarArr[1];
        if (it0Var != null && it0Var.getVisibility() == 0) {
            if (this.f32061c1 && !this.f32066e1) {
                return it0VarArr[1].B;
            }
            if (Math.abs(it0VarArr[1].getTranslationX()) < it0VarArr[1].getMeasuredWidth() / 2.0f) {
                return it0VarArr[1].B;
            }
        }
        return getSelectedTab();
    }

    public jl0 getCurrentListView() {
        vs0 vs0Var;
        it0 it0Var = this.f32070g0[0];
        int i10 = it0Var.B;
        if (i10 == 13) {
            return this.Q.getCurrentListView();
        }
        if (i10 == 14) {
            return this.R.getCurrentListView();
        }
        if (i10 == 12 && (vs0Var = this.P) != null) {
            return vs0Var.f43683a.f42973t0;
        }
        return it0Var.h;
    }

    public int getInitialTab() {
        return 0;
    }

    public int getPhotosVideosTypeFilter() {
        return this.f32088p1[0].f28548q;
    }

    public TextView getSaveItem() {
        return this.m0;
    }

    public org.telegram.ui.ActionBar.w0 getSearchItem() {
        return this.f32076j0;
    }

    public aj0 getSearchOptionsItem() {
        return this.f32085o0;
    }

    public int getSelectedTab() {
        int currentTabId = this.E0.getCurrentTabId();
        kr0 kr0Var = this.S;
        if (kr0Var != null && currentTabId == 8) {
            int currentAlbumId = kr0Var.getCurrentAlbumId();
            if (currentAlbumId == 0) {
                return 8;
            }
            if (currentAlbumId > 0) {
                return i1(currentAlbumId).f31773a;
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
        float f9 = 0.0f;
        int i10 = 0;
        while (true) {
            it0[] it0VarArr = this.f32070g0;
            if (i10 < it0VarArr.length) {
                it0 it0Var = it0VarArr[i10];
                if (it0Var != null) {
                    f9 = ((1.0f - Math.abs(it0Var.getTranslationX() / getWidth())) * it0Var.B) + f9;
                }
                i10++;
            } else {
                return f9;
            }
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32104w0, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23450z6));
        org.telegram.ui.ActionBar.w0 w0Var = this.f32072h0;
        aj0 iconView = w0Var.getIconView();
        int i10 = org.telegram.ui.ActionBar.g6.y8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(iconView, 8, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.f23452z8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var, 32, null, null, null, null, i11));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f32089q0;
        if (w0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var2.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var2, 32, null, null, null, null, i11));
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f32087p0;
        if (w0Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var3.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var3, 32, null, null, null, null, i11));
        }
        Drawable[] drawableArr = {this.f32112z0};
        ImageView imageView = this.f32110y0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 8, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 32, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.f23062d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32107x0, 1, null, null, null, null, i12));
        fs0 fs0Var = this.E0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(fs0Var, 1, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.f23407wc;
        org.telegram.ui.Cells.v0 v0Var = this.G0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var, 0, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23195kd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(fs0Var, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Gh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(fs0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.Fh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(fs0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.Eh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(fs0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.Hh));
        bs0 bs0Var = this.N0;
        if (bs0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(bs0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23384v7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(bs0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23402w7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(bs0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23366u7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(bs0Var, 33554436, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23347t7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(bs0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23419x7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(bs0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23434y7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(bs0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A7));
        }
        final int i14 = 0;
        while (true) {
            it0[] it0VarArr = this.f32070g0;
            if (i14 < it0VarArr.length) {
                org.telegram.ui.ActionBar.h6 h6Var = new org.telegram.ui.ActionBar.h6() {
                    @Override
                    public final void b() {
                        it0[] it0VarArr2 = qu0.this.f32070g0;
                        int i15 = i14;
                        or0 or0Var = it0VarArr2[i15].h;
                        if (or0Var != null) {
                            int childCount = or0Var.getChildCount();
                            for (int i16 = 0; i16 < childCount; i16++) {
                                View childAt = it0VarArr2[i15].h.getChildAt(i16);
                                if (childAt instanceof org.telegram.ui.Cells.q7) {
                                    org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) childAt;
                                    for (int i17 = 0; i17 < 6; i17++) {
                                        q7Var.f25072a[i17].f24704e.invalidate();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.f6) {
                                    ((org.telegram.ui.Cells.f6) childAt).u(0);
                                } else if (childAt instanceof org.telegram.ui.Cells.sa) {
                                    ((org.telegram.ui.Cells.sa) childAt).j(0);
                                }
                            }
                        }
                    }

                    @Override
                    public final void a(float f9) {
                    }
                };
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
                xr0 xr0Var = it0VarArr[i14].v;
                int i15 = org.telegram.ui.ActionBar.g6.f23062d6;
                arrayList.add(new org.telegram.ui.ActionBar.i6(xr0Var, 0, null, null, null, null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].f29471w, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23045c7));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 524288, new Class[]{org.telegram.ui.Cells.s3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23100f7));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.s3.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23081e7));
                int i16 = org.telegram.ui.ActionBar.g6.f23134h6;
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23376uh));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23223m6));
                int i17 = org.telegram.ui.ActionBar.g6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
                int i18 = org.telegram.ui.ActionBar.g6.f23433y6;
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusColor"}, null, null, -1, h6Var, i18));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusOnlineColor"}, null, null, -1, h6Var, org.telegram.ui.ActionBar.g6.f23241n6));
                Drawable[] drawableArr2 = org.telegram.ui.ActionBar.g6.f23305r0;
                int i19 = org.telegram.ui.ActionBar.g6.J7;
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.sa.class}, null, drawableArr2, null, i19));
                TextPaint[] textPaintArr = org.telegram.ui.ActionBar.g6.B0;
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.f6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.g6.D0}, null, -1, null, org.telegram.ui.ActionBar.g6.X8));
                TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.g6.C0;
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.f6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.g6.E0}, null, -1, null, org.telegram.ui.ActionBar.g6.Z8));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.f6.class}, null, drawableArr2, null, i19));
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.O7));
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.P7));
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.Q7));
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.R7));
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.S7));
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.T7));
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, org.telegram.ui.ActionBar.g6.U7));
                int i20 = org.telegram.ui.ActionBar.g6.f23450z6;
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 4, new Class[]{ct0.class}, new String[]{"emptyTextView"}, null, null, -1, null, i20));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
                int i21 = org.telegram.ui.ActionBar.g6.Ih;
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 2048, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"progressView"}, null, null, -1, null, i21));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"statusImageView"}, null, null, -1, null, i21));
                int i22 = org.telegram.ui.ActionBar.g6.f23153i7;
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                int i23 = org.telegram.ui.ActionBar.g6.f23190k7;
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.zi));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Bi));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.f7.class}, org.telegram.ui.ActionBar.g6.f23096f3, null, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.f7.class}, org.telegram.ui.ActionBar.g6.f23114g3, null, null, i20));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.j7.class}, null, null, null, org.telegram.ui.ActionBar.g6.J6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.j7.class}, org.telegram.ui.ActionBar.g6.m0, null, null, org.telegram.ui.ActionBar.g6.K6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Kh));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 32, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Jh));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.k7.class}, null, null, null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 524288, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"textView"}, null, null, -1, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"textView"}, null, null, -1, null, i17));
                int i24 = org.telegram.ui.ActionBar.g6.Lh;
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.q7.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.q7.class}, null, null, h6Var, i22));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.q7.class}, null, null, h6Var, i23));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.d2.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.d2.class}, null, null, h6Var, i22));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.d2.class}, null, null, h6Var, i23));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].h, 0, null, null, new Drawable[]{this.f32099u0}, null, org.telegram.ui.ActionBar.g6.f23028b7));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].f29471w.d, 4, null, null, null, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.i6(it0VarArr[i14].f29471w.f32122e, 4, null, null, null, null, i18));
                i14++;
            } else {
                return arrayList;
            }
        }
    }

    public final int h0(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var = this.B1;
        if (c6Var != null) {
            return c6Var.C0(i10);
        }
        return org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    public final int h1(int i10) {
        pu0 j12 = j1(i10);
        if (j12 == null) {
            return -1;
        }
        return j12.f31774b;
    }

    public final boolean i0() {
        if (this.f32093r1.getConnectionsManager().getConnectionState() == 3) {
            return true;
        }
        return false;
    }

    public final pu0 i1(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.U1;
        pu0 pu0Var = (pu0) hashMap.get(valueOf);
        if (pu0Var == null) {
            pu0 pu0Var2 = new pu0(this, getContext(), i10);
            hashMap.put(Integer.valueOf(i10), pu0Var2);
            this.V1.put(Integer.valueOf(pu0Var2.f31773a), Integer.valueOf(i10));
            return pu0Var2;
        }
        return pu0Var;
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

    public final pu0 j1(int i10) {
        Integer num = (Integer) this.V1.get(Integer.valueOf(i10));
        if (num == null) {
            return null;
        }
        return (pu0) this.U1.get(num);
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
        this.H0.playTogether(ObjectAnimator.ofFloat(v0Var, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(v0Var, View.TRANSLATION_Y, (-AndroidUtilities.dp(48.0f)) + this.K0));
        this.H0.setInterpolator(jr.f29801g);
        this.H0.addListener(new is0(this, 0));
        this.H0.start();
    }

    public final nu0 k1(int i10) {
        pu0 j12;
        if (i10 == 8) {
            return this.V;
        }
        if (i10 == 9) {
            return this.f32054a0;
        }
        if (w0(i10) && (j12 = j1(i10)) != null) {
            return j12.f31775c;
        }
        return null;
    }

    public boolean l0() {
        return false;
    }

    public final nu0 l1(int i10) {
        pu0 j12;
        if (i10 == 8) {
            return this.W;
        }
        if (i10 == 9) {
            return this.f32057b0;
        }
        if (!w0(i10) || (j12 = j1(i10)) == null) {
            return null;
        }
        return j12.d;
    }

    public boolean m0() {
        return !(this instanceof w30);
    }

    public final void m1(boolean z10) {
        it0[] it0VarArr;
        it0[] it0VarArr2;
        f2.c1 c1Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        float f9;
        int i10;
        float f10;
        float f11;
        boolean z15;
        fu0[] fu0VarArr;
        String str;
        ?? r52;
        int i11;
        int i12;
        boolean z16;
        boolean z17;
        boolean z18;
        int i13;
        int i14;
        int i15;
        String str2;
        boolean z19;
        int i16;
        boolean z20;
        f2.c1 c1Var2;
        String str3;
        int i17;
        int i18;
        boolean z21;
        int i19;
        int i20;
        boolean z22;
        int i21;
        gr0 gr0Var = this.R;
        if (gr0Var != null) {
            gr0Var.i();
        }
        int i22 = 0;
        while (true) {
            it0VarArr = this.f32070g0;
            if (i22 >= it0VarArr.length) {
                break;
            }
            it0VarArr[i22].h.B0();
            i22++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) it0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = AndroidUtilities.dp(B0());
        f2.p0 adapter = it0VarArr[z10 ? 1 : 0].h.getAdapter();
        f2.p0 p0Var = this.V;
        f2.e0 e0Var = this.U;
        if (adapter == p0Var) {
            e0Var.d(null);
        }
        boolean z23 = this.R0;
        bt0 bt0Var = this.f32113z1;
        String str4 = "";
        wt0 wt0Var = this.J;
        org.telegram.ui.ActionBar.w0 w0Var = this.f32076j0;
        int i23 = 100;
        if (z23 && this.Q0) {
            it0 it0Var = it0VarArr[z10 ? 1 : 0];
            if (it0Var.f29467f == null) {
                it0Var.f29467f = new f2.c1();
            }
            it0 it0Var2 = it0VarArr[z10 ? 1 : 0];
            c1Var2 = it0Var2.f29467f;
            bu0 bu0Var = this.O;
            gt0 gt0Var = this.f32068f0;
            lt0 lt0Var = this.f32062d0;
            lt0 lt0Var2 = this.f32065e0;
            lt0 lt0Var3 = this.f32060c0;
            if (z10) {
                int i24 = it0Var2.B;
                if (i24 != 0 && i24 != 2 && i24 != 5 && i24 != 6 && (i24 != 7 || bt0Var.T())) {
                    if (w0Var != null) {
                        str4 = w0Var.getSearchField().getText().toString();
                    }
                    int i25 = it0VarArr[z10 ? 1 : 0].B;
                    if (i25 == 1) {
                        if (lt0Var3 != null) {
                            lt0Var3.G(str4, false);
                            if (adapter != lt0Var3) {
                                W0(adapter);
                                it0VarArr[z10 ? 1 : 0].h.setAdapter(lt0Var3);
                            }
                        }
                    } else if (i25 == 3) {
                        if (lt0Var2 != null) {
                            lt0Var2.G(str4, false);
                            if (adapter != lt0Var2) {
                                W0(adapter);
                                it0VarArr[z10 ? 1 : 0].h.setAdapter(lt0Var2);
                            }
                        }
                    } else if (i25 == 4) {
                        if (lt0Var != null) {
                            lt0Var.G(str4, false);
                            if (adapter != lt0Var) {
                                W0(adapter);
                                it0VarArr[z10 ? 1 : 0].h.setAdapter(lt0Var);
                            }
                        }
                    } else if (i25 == 7) {
                        if (gt0Var != null) {
                            gt0Var.F(str4, false);
                            if (adapter != gt0Var) {
                                W0(adapter);
                                it0VarArr[z10 ? 1 : 0].h.setAdapter(gt0Var);
                            }
                        }
                    } else if (i25 == 11) {
                        if (bu0Var != null) {
                            bu0Var.E(this.S0, str4);
                            if (adapter != bu0Var) {
                                W0(adapter);
                                it0VarArr[z10 ? 1 : 0].h.setAdapter(bu0Var);
                            }
                        }
                    } else if (i25 == 15 && wt0Var != null && adapter != wt0Var) {
                        W0(adapter);
                        or0 or0Var = it0VarArr[z10 ? 1 : 0].h;
                        wt0Var.f34492r = or0Var;
                        or0Var.setAdapter(wt0Var);
                    }
                } else {
                    this.R0 = false;
                    cs0 cs0Var = this.F0;
                    if (cs0Var != null) {
                        cs0Var.g(false);
                    }
                    this.Q0 = false;
                    m1(true);
                    return;
                }
            } else if (it0Var2.h != null) {
                int i26 = it0Var2.B;
                if (i26 == 1) {
                    if (adapter != lt0Var3) {
                        W0(adapter);
                        it0VarArr[z10 ? 1 : 0].h.setAdapter(lt0Var3);
                    }
                    lt0Var3.l();
                } else if (i26 == 3) {
                    if (adapter != lt0Var2) {
                        W0(adapter);
                        it0VarArr[z10 ? 1 : 0].h.setAdapter(lt0Var2);
                    }
                    lt0Var2.l();
                } else if (i26 == 4) {
                    if (adapter != lt0Var) {
                        W0(adapter);
                        it0VarArr[z10 ? 1 : 0].h.setAdapter(lt0Var);
                    }
                    lt0Var.l();
                } else if (i26 == 7) {
                    if (adapter != gt0Var) {
                        W0(adapter);
                        it0VarArr[z10 ? 1 : 0].h.setAdapter(gt0Var);
                    }
                    gt0Var.l();
                } else if (i26 == 11) {
                    if (adapter != bu0Var) {
                        W0(adapter);
                        it0VarArr[z10 ? 1 : 0].h.setAdapter(bu0Var);
                    }
                    bu0Var.l();
                }
            }
            it0VarArr2 = it0VarArr;
            z20 = false;
            z19 = false;
            i16 = 100;
        } else {
            it0 it0Var3 = it0VarArr[z10 ? 1 : 0];
            if (it0Var3.f29466e == null) {
                it0Var3.f29466e = new f2.c1();
            }
            it0 it0Var4 = it0VarArr[z10 ? 1 : 0];
            f2.c1 c1Var3 = it0Var4.f29466e;
            it0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i27 = it0VarArr[z10 ? 1 : 0].B;
            if (i27 == 8 || w0(i27)) {
                layoutParams.topMargin = AndroidUtilities.dp(B0());
            }
            or0 or0Var2 = it0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = or0Var2.getPaddingLeft();
            it0 it0Var5 = it0VarArr[z10 ? 1 : 0];
            or0 or0Var3 = it0Var5.h;
            int Z = Z(it0Var5.B);
            or0Var3.Z2 = Z;
            int paddingRight = it0VarArr[z10 ? 1 : 0].h.getPaddingRight();
            it0VarArr2 = it0VarArr;
            or0 or0Var4 = it0VarArr2[z10 ? 1 : 0].h;
            int Y = Y(v0());
            or0Var4.f29229a3 = Y;
            or0Var2.setPadding(paddingLeft, Z, paddingRight, Y);
            int i28 = it0VarArr2[z10 ? 1 : 0].B;
            int[] iArr = this.f32075i1;
            f2.p0 p0Var2 = this.G;
            View view = this.Q;
            vs0 vs0Var = this.P;
            zt0 zt0Var = this.N;
            at0 at0Var = this.L;
            fu0[] fu0VarArr2 = this.f32088p1;
            if (i28 == 0) {
                f2.p0 p0Var3 = this.D;
                if (adapter != p0Var3) {
                    W0(adapter);
                    it0VarArr2[z10 ? 1 : 0].h.setAdapter(p0Var3);
                }
                int i29 = -AndroidUtilities.dp(1.0f);
                layoutParams.rightMargin = i29;
                layoutParams.leftMargin = i29;
                fu0 fu0Var = fu0VarArr2[0];
                if (fu0Var.h && !fu0Var.f28537e.isEmpty()) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                i23 = iArr[0];
                it0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.f32099u0);
                fu0 fu0Var2 = fu0VarArr2[0];
                if (fu0Var2.f28554x == null) {
                    fu0Var2.f28554x = new f2.c1();
                }
                z13 = z22;
                c1Var = fu0VarArr2[0].f28554x;
                z11 = false;
            } else {
                if (i28 == 1) {
                    fu0 fu0Var3 = fu0VarArr2[1];
                    if (fu0Var3.h && !fu0Var3.f28537e.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (adapter != p0Var2) {
                        W0(adapter);
                        it0VarArr2[z10 ? 1 : 0].h.setAdapter(p0Var2);
                    }
                } else if (i28 == 2) {
                    fu0 fu0Var4 = fu0VarArr2[2];
                    if (fu0Var4.h && !fu0Var4.f28537e.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (adapter != this.H) {
                        W0(adapter);
                        it0VarArr2[z10 ? 1 : 0].h.setAdapter(this.H);
                    }
                } else {
                    if (i28 == 3) {
                        if (adapter != this.F) {
                            W0(adapter);
                            it0VarArr2[z10 ? 1 : 0].h.setAdapter(this.F);
                        }
                    } else if (i28 == 4) {
                        fu0 fu0Var5 = fu0VarArr2[4];
                        if (fu0Var5.h && !fu0Var5.f28537e.isEmpty()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (adapter != this.I) {
                            W0(adapter);
                            it0VarArr2[z10 ? 1 : 0].h.setAdapter(this.I);
                        }
                    } else {
                        if (i28 == 5) {
                            if (adapter != this.K) {
                                W0(adapter);
                                it0VarArr2[z10 ? 1 : 0].h.setAdapter(this.K);
                            }
                        } else if (i28 == 15) {
                            if (adapter != wt0Var) {
                                W0(adapter);
                                or0 or0Var5 = it0VarArr2[z10 ? 1 : 0].h;
                                wt0Var.f34492r = or0Var5;
                                or0Var5.setAdapter(wt0Var);
                            }
                        } else if (i28 == 6) {
                            if (adapter != at0Var) {
                                W0(adapter);
                                it0VarArr2[z10 ? 1 : 0].h.setAdapter(at0Var);
                            }
                        } else if (i28 == 7) {
                            if (adapter != this.T) {
                                W0(adapter);
                                it0VarArr2[z10 ? 1 : 0].h.setAdapter(this.T);
                            }
                        } else if (p0(i28)) {
                            f2.p0 k12 = k1(it0VarArr2[z10 ? 1 : 0].B);
                            if (adapter != k12) {
                                W0(adapter);
                                it0VarArr2[z10 ? 1 : 0].h.setAdapter(k12);
                                it0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            it0 it0Var6 = it0VarArr2[z10 ? 1 : 0];
                            if (it0Var6.B != 9) {
                                e0Var.d(it0Var6.h);
                            }
                            i23 = iArr[1];
                        } else {
                            int i30 = it0VarArr2[z10 ? 1 : 0].B;
                            if (i30 == 10) {
                                if (adapter != this.M) {
                                    W0(adapter);
                                    it0VarArr2[z10 ? 1 : 0].h.setAdapter(this.M);
                                }
                            } else if (i30 == 11) {
                                if (adapter != zt0Var) {
                                    W0(adapter);
                                    it0VarArr2[z10 ? 1 : 0].h.setAdapter(zt0Var);
                                    f2.e0 e0Var2 = zt0Var.v;
                                    or0 or0Var6 = it0VarArr2[z10 ? 1 : 0].h;
                                    zt0Var.f35419s = or0Var6;
                                    e0Var2.d(or0Var6);
                                }
                                c1Var = zt0Var.f35418r;
                                z11 = true;
                                z13 = false;
                            } else if (i30 == 12) {
                                if (adapter != null) {
                                    W0(adapter);
                                    it0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (vs0Var.getParent() != it0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(vs0Var);
                                    it0VarArr2[z10 ? 1 : 0].addView(vs0Var, i7.f6.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                }
                            } else if (i30 == 13) {
                                if (adapter != null) {
                                    W0(adapter);
                                    it0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != it0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(view);
                                    it0VarArr2[z10 ? 1 : 0].addView(view);
                                }
                            } else if (i30 == 14) {
                                if (adapter != null) {
                                    W0(adapter);
                                    it0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (gr0Var != null && gr0Var.getParent() != it0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(gr0Var);
                                    it0VarArr2[z10 ? 1 : 0].addView(gr0Var);
                                    it0VarArr2[z10 ? 1 : 0].f29471w.setVisibility(4);
                                }
                            }
                        }
                        c1Var = c1Var3;
                        z11 = false;
                        z13 = false;
                    }
                    c1Var = c1Var3;
                    z11 = true;
                    z13 = false;
                }
                z13 = z12;
                c1Var = c1Var3;
                z11 = true;
            }
            int i31 = it0VarArr2[z10 ? 1 : 0].B;
            if (i31 != 0 && !p0(i31)) {
                z14 = false;
            } else {
                z14 = true;
            }
            xr0 xr0Var = it0VarArr2[z10 ? 1 : 0].v;
            if (z14) {
                f9 = 0.0f;
            } else {
                f9 = 12.0f;
            }
            if (z14) {
                i10 = 8;
            } else {
                i10 = 12;
            }
            f2.c1 c1Var4 = c1Var;
            float f12 = i10 + 48;
            if (z14) {
                f10 = 0.0f;
            } else {
                f10 = 12.0f;
            }
            if (z14) {
                f11 = 0.0f;
            } else {
                f11 = 12.0f;
            }
            xr0Var.setLayoutParams(i7.f6.d(-1, -1.0f, 119, f9, f12, f10, f11));
            if (z11) {
                it0VarArr2[z10 ? 1 : 0].h.setSections(false);
            } else {
                or0 or0Var7 = it0VarArr2[z10 ? 1 : 0].h;
                or0Var7.getClass();
                or0Var7.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, or0Var7.f29709l2));
                or0Var7.E2 = null;
                or0Var7.H2 = 0.0f;
                or0Var7.I2 = null;
                or0Var7.J2 = null;
                or0Var7.F2 = null;
                xk0 xk0Var = or0Var7.D2;
                if (xk0Var != null) {
                    or0Var7.p0(xk0Var);
                    or0Var7.D2 = null;
                }
            }
            it0 it0Var7 = it0VarArr2[z10 ? 1 : 0];
            int i32 = it0Var7.B;
            org.telegram.ui.ActionBar.o2 o2Var = this.f32093r1;
            if (i32 == 15) {
                z15 = z13;
                fu0VarArr = fu0VarArr2;
                str = "";
                it0Var7.setBackground(nh.f6.e(it0Var7.getBackground(), o2Var.getCurrentAccount(), this.f32069f1, org.telegram.ui.ActionBar.g6.I.q()));
                it0VarArr2[z10 ? 1 : 0].setOutlineProvider(new eg.k1(14));
                it0VarArr2[z10 ? 1 : 0].setClipToOutline(true);
                r52 = 0;
            } else {
                z15 = z13;
                fu0VarArr = fu0VarArr2;
                str = "";
                it0Var7.setClipToOutline(false);
                r52 = 0;
                it0VarArr2[z10 ? 1 : 0].setBackground(null);
            }
            it0 it0Var8 = it0VarArr2[z10 ? 1 : 0];
            if (it0Var8.B == 11) {
                it0Var8.h.setItemAnimator(it0Var8.d);
            } else {
                it0Var8.h.setItemAnimator(r52);
                if (zt0Var != null && it0VarArr2[z10 ? 1 : 0].h == zt0Var.f35419s) {
                    f2.e0 e0Var3 = zt0Var.v;
                    zt0Var.f35419s = r52;
                    e0Var3.d(r52);
                }
            }
            if (vs0Var != null && it0VarArr2[z10 ? 1 : 0].B != 12 && vs0Var.getParent() == it0VarArr2[z10 ? 1 : 0]) {
                vs0Var.f43683a.onRemoveFromParent();
                it0VarArr2[z10 ? 1 : 0].removeView(vs0Var);
            }
            if (view != null && it0VarArr2[z10 ? 1 : 0].B != 13) {
                ViewParent parent = view.getParent();
                it0 it0Var9 = it0VarArr2[z10 ? 1 : 0];
                if (parent == it0Var9) {
                    it0Var9.removeView(view);
                }
            }
            if (gr0Var != null && it0VarArr2[z10 ? 1 : 0].B != 14) {
                ViewParent parent2 = gr0Var.getParent();
                it0 it0Var10 = it0VarArr2[z10 ? 1 : 0];
                if (parent2 == it0Var10) {
                    it0Var10.removeView(gr0Var);
                }
            }
            int i33 = it0VarArr2[z10 ? 1 : 0].B;
            if (i33 != 0 && i33 != 11 && !p0(i33) && (i17 = it0VarArr2[z10 ? 1 : 0].B) != 2 && i17 != 5 && i17 != 6 && ((i17 != 7 || bt0Var.T()) && (i18 = it0VarArr2[z10 ? 1 : 0].B) != 10 && i18 != 13 && i18 != 14)) {
                if (z10) {
                    if (w0Var != null && w0Var.getVisibility() == 4 && !this.C.f23612j0) {
                        if (D()) {
                            this.f32097t0 = 1;
                            w0Var.setVisibility(0);
                        } else {
                            if (v0()) {
                                i20 = 8;
                            } else {
                                i20 = 4;
                            }
                            w0Var.setVisibility(i20);
                        }
                        float f13 = z10 ? 1.0f : 0.0f;
                        this.f32078k0 = b0(f13);
                        s1(1.0f - f13);
                        z21 = false;
                    } else {
                        z21 = false;
                        this.f32097t0 = 0;
                        this.f32078k0 = 1.0f;
                    }
                } else {
                    z21 = false;
                    if (w0Var != null) {
                        if (w0Var.getVisibility() == 4) {
                            if (D()) {
                                this.f32097t0 = 0;
                                this.f32078k0 = 1.0f;
                                w0Var.setVisibility(0);
                            } else {
                                if (v0()) {
                                    i19 = 8;
                                } else {
                                    i19 = 4;
                                }
                                w0Var.setVisibility(i19);
                                this.f32078k0 = 0.0f;
                            }
                        }
                        q1(z21);
                    }
                }
                q1(z21);
            } else if (z10) {
                this.f32097t0 = 2;
            } else {
                this.f32097t0 = 0;
                if (w0Var != null) {
                    if (!v0() && !this.R0) {
                        i11 = 4;
                    } else {
                        i11 = 8;
                    }
                    w0Var.setVisibility(i11);
                }
            }
            int i34 = it0VarArr2[z10 ? 1 : 0].B;
            if (i34 == 6) {
                if (!at0Var.f26879e && !at0Var.h && at0Var.d.isEmpty()) {
                    at0.E(at0Var, 0L);
                }
            } else if (i34 != 7) {
                if (p0(i34)) {
                    nu0 k13 = k1(it0VarArr2[z10 ? 1 : 0].B);
                    if (k13 != null) {
                        lh.k6 k6Var = k13.f31151s;
                        k13.P();
                        zr0 zr0Var = it0VarArr2[z10 ? 1 : 0].f29471w;
                        if (k6Var != null && (k6Var.k() || (i0() && k6Var.g() > 0))) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zr0Var.e(z17, z10);
                        if (k6Var != null && k6Var.g() > 0 && !t0()) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z16 = z18;
                    } else {
                        z16 = z15;
                    }
                    z15 = z16;
                } else {
                    int i35 = it0VarArr2[z10 ? 1 : 0].B;
                    if (i35 != 10 && i35 != 11 && i35 != 12 && i35 != 13 && i35 != 14) {
                        if (i35 == 15) {
                            i35 = 8;
                        }
                        fu0 fu0Var6 = fu0VarArr[i35];
                        if (!fu0Var6.f28539g && !fu0Var6.f28540i[0] && fu0Var6.f28534a.isEmpty()) {
                            fu0VarArr[i35].f28539g = true;
                            p0Var2.l();
                            if (i35 == 0) {
                                int i36 = fu0VarArr[0].f28548q;
                                if (i36 == 1) {
                                    i12 = 6;
                                } else if (i36 == 2) {
                                    i12 = 7;
                                }
                                o2Var.getMediaDataController().loadMedia(this.f32069f1, 50, 0, 0, i12, this.B, 1, o2Var.getClassGuid(), fu0VarArr[i12].f28547p, null, null);
                            }
                            i12 = i35;
                            o2Var.getMediaDataController().loadMedia(this.f32069f1, 50, 0, 0, i12, this.B, 1, o2Var.getClassGuid(), fu0VarArr[i12].f28547p, null, null);
                        }
                    }
                }
            }
            int i37 = it0VarArr2[z10 ? 1 : 0].B;
            if (i37 != 8 && !w0(i37)) {
                it0 it0Var11 = it0VarArr2[z10 ? 1 : 0];
                if (it0Var11.B == 9) {
                    if (u0()) {
                        it0VarArr2[z10 ? 1 : 0].f29471w.f32120b.setVisibility(8);
                        it0VarArr2[z10 ? 1 : 0].f29471w.f32123f.setVisibility(8);
                    } else {
                        it0VarArr2[z10 ? 1 : 0].f29471w.f32120b.setVisibility(0);
                        it0VarArr2[z10 ? 1 : 0].f29471w.setStickerType(11);
                        it0VarArr2[z10 ? 1 : 0].f29471w.f32123f.setVisibility(0);
                        it0VarArr2[z10 ? 1 : 0].f29471w.f32123f.h(w());
                    }
                    it0VarArr2[z10 ? 1 : 0].f29471w.d.setText(LocaleController.getString(R.string.NoArchivedStoriesTitle));
                    y80 y80Var = it0VarArr2[z10 ? 1 : 0].f29471w.f32122e;
                    if (v0()) {
                        str3 = LocaleController.getString(R.string.NoArchivedStoriesSubtitle);
                    } else {
                        str3 = str;
                    }
                    y80Var.setText(str3);
                    it0VarArr2[z10 ? 1 : 0].f29471w.f32123f.setOnClickListener(new oq0(this, 7));
                } else {
                    it0Var11.f29471w.f32120b.setVisibility(0);
                    it0VarArr2[z10 ? 1 : 0].f29471w.setStickerType(1);
                    it0VarArr2[z10 ? 1 : 0].f29471w.d.setText(LocaleController.getString(R.string.NoResult));
                    it0VarArr2[z10 ? 1 : 0].f29471w.f32122e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    it0VarArr2[z10 ? 1 : 0].f29471w.f32123f.setVisibility(8);
                }
            } else {
                it0 it0Var12 = it0VarArr2[z10 ? 1 : 0];
                zr0 zr0Var2 = it0Var12.f29471w;
                boolean w02 = w0(it0Var12.B);
                int h12 = h1(it0VarArr2[z10 ? 1 : 0].B);
                t9 t9Var = zr0Var2.f32120b;
                nh.d dVar = zr0Var2.f32123f;
                if (!w02 && !u0() && !r0()) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                t9Var.setVisibility(i13);
                if (w02) {
                    dVar.setVisibility(0);
                    dVar.h(LocaleController.getString(R.string.StoriesAlbumAddToAlbum));
                } else if (u0()) {
                    dVar.setVisibility(8);
                } else {
                    zr0Var2.setStickerType(11);
                    if (!t0()) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    dVar.setVisibility(i14);
                    dVar.h(w());
                }
                if (w02) {
                    zr0Var2.d.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeTitle));
                    zr0Var2.f32122e.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeDescription));
                } else {
                    gh.s sVar = zr0Var2.d;
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
                    y80 y80Var2 = zr0Var2.f32122e;
                    if (v0()) {
                        str2 = LocaleController.getString(R.string.NoStoriesSubtitle2);
                    } else {
                        str2 = str;
                    }
                    y80Var2.setText(str2);
                }
                dVar.setOnClickListener(new ih.q2(this, w02, h12, 1));
            }
            z19 = false;
            it0VarArr2[z10 ? 1 : 0].h.setVisibility(0);
            i16 = i23;
            z20 = z15;
            c1Var2 = c1Var4;
        }
        it0 it0Var13 = it0VarArr2[z10 ? 1 : 0];
        it0Var13.f29464b = z20;
        o1(it0Var13, z19);
        it0VarArr2[z10 ? 1 : 0].f29472x.y1(i16);
        it0VarArr2[z10 ? 1 : 0].h.a0();
        if (c1Var2 != null) {
            it0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(c1Var2);
            it0VarArr2[z10 ? 1 : 0].f29469r.setRecycledViewPool(c1Var2);
        }
        if (this.f32097t0 == 2) {
            org.telegram.ui.ActionBar.l lVar = this.C;
            if (lVar.f23612j0) {
                this.f32101v0 = true;
                lVar.h(true);
                this.f32097t0 = 0;
                this.f32078k0 = 0.0f;
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
        it0[] it0VarArr;
        for (it0 it0Var : this.f32070g0) {
            or0 or0Var = it0Var.h;
            Objects.requireNonNull(or0Var);
            it0Var.f29468n = new lg.k(or0Var, viewGroup, new vv(or0Var, 4));
        }
        gr0 gr0Var = this.R;
        if (gr0Var != null) {
            gr0Var.O = viewGroup;
            gr0Var.N = new ih.o2(gr0Var, 0);
        }
    }

    public final void n1() {
        us0 us0Var = this.D;
        if (us0Var != null) {
            us0Var.l();
        }
        du0 du0Var = this.G;
        if (du0Var != null) {
            du0Var.l();
        }
        du0 du0Var2 = this.H;
        if (du0Var2 != null) {
            du0Var2.l();
        }
        eu0 eu0Var = this.F;
        if (eu0Var != null) {
            eu0Var.X(false);
        }
        du0 du0Var3 = this.I;
        if (du0Var3 != null) {
            du0Var3.l();
        }
        wt0 wt0Var = this.J;
        if (wt0Var != null) {
            wt0Var.l();
        }
        dt0 dt0Var = this.K;
        if (dt0Var != null) {
            dt0Var.l();
        }
        xs0 xs0Var = this.V;
        if (xs0Var != null) {
            xs0Var.l();
        }
        for (pu0 pu0Var : this.U1.values()) {
            pu0Var.f31775c.l();
        }
    }

    public final void o1(it0 it0Var, boolean z10) {
        boolean z11;
        Integer num = 1;
        int i10 = 0;
        if (it0Var.f29464b && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        sk0 fastScroll = it0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = it0Var.f29465c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            it0Var.f29465c.cancel();
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
            it0Var.f29465c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(num);
        } else if (!z11 && fastScroll.getTag() != null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, property, fastScroll.getAlpha(), 0.0f);
            ofFloat2.addListener(new z9(fastScroll));
            it0Var.f29465c = ofFloat2;
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
            it0[] it0VarArr = this.f32070g0;
            if (i10 < it0VarArr.length) {
                or0 or0Var = it0VarArr[i10].h;
                if (or0Var != null) {
                    or0Var.getViewTreeObserver().addOnPreDrawListener(new ls0(this, i10, 0));
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!J() && !this.E0.D && !onTouchEvent(motionEvent)) {
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
        bt0 bt0Var = this.f32113z1;
        if (bt0Var.f() != null) {
            i12 = bt0Var.f().getHeight();
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
            } else if (childAt instanceof it0) {
                i13 = i10;
                measureChildWithMargins(childAt, i13, 0, View.MeasureSpec.makeMeasureSpec(i12, 1073741824), 0);
                or0 or0Var = ((it0) childAt).h;
                or0Var.setPadding(0, or0Var.U2, 0, or0Var.V2);
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
        if (!this.H1) {
            org.telegram.ui.ActionBar.o2 o2Var = this.f32093r1;
            if (o2Var.getParentLayout() != null && !((ActionBarLayout) o2Var.getParentLayout()).j() && !J() && !this.f32053a) {
                if (motionEvent != null) {
                    if (this.f32108x1 == null) {
                        this.f32108x1 = VelocityTracker.obtain();
                    }
                    this.f32108x1.addMovement(motionEvent);
                    g40 g40Var = this.A1;
                    if (g40Var != null) {
                        g40Var.b(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.f32098t1 && !this.f32100u1 && motionEvent.getY() >= AndroidUtilities.dp(90.0f)) {
                    this.f32096s1 = motionEvent.getPointerId(0);
                    this.f32100u1 = true;
                    this.f32102v1 = (int) motionEvent.getX();
                    this.f32105w1 = (int) motionEvent.getY();
                    this.f32108x1.clear();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f32096s1) {
                    int x4 = (int) (motionEvent.getX() - this.f32102v1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.f32105w1);
                    boolean z13 = this.f32098t1;
                    it0[] it0VarArr = this.f32070g0;
                    if (z13 && (((z10 = this.f32063d1) && x4 > 0) || (!z10 && x4 < 0))) {
                        if (x4 < 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!U0(motionEvent, z11)) {
                            this.f32100u1 = true;
                            this.f32098t1 = false;
                            N0(false);
                            it0VarArr[0].setTranslationX(0.0f);
                            it0 it0Var = it0VarArr[1];
                            if (this.f32063d1) {
                                i11 = it0VarArr[0].getMeasuredWidth();
                            } else {
                                i11 = -it0VarArr[0].getMeasuredWidth();
                            }
                            it0Var.setTranslationX(i11);
                            Z0(0.0f, it0VarArr[1].B);
                            M0(getTabProgress());
                        }
                    }
                    if (this.f32100u1 && !this.f32098t1) {
                        if (Math.abs(x4) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x4) > abs) {
                            if (x4 < 0) {
                                z12 = true;
                            }
                            U0(motionEvent, z12);
                        }
                    } else if (this.f32098t1) {
                        it0VarArr[0].setTranslationX(x4);
                        if (this.f32063d1) {
                            it0VarArr[1].setTranslationX(it0VarArr[0].getMeasuredWidth() + x4);
                        } else {
                            it0VarArr[1].setTranslationX(x4 - it0VarArr[0].getMeasuredWidth());
                        }
                        float abs2 = Math.abs(x4) / it0VarArr[0].getMeasuredWidth();
                        if (!D()) {
                            this.f32078k0 = 0.0f;
                        } else {
                            this.f32078k0 = b0(abs2);
                            s1(abs2);
                            float a02 = a0(abs2);
                            this.f32080l0 = a02;
                            if (a02 != 0.0f && D() && !q0()) {
                                i10 = 0;
                            } else {
                                i10 = 4;
                            }
                            this.f32083n0.setVisibility(i10);
                        }
                        q1(false);
                        Z0(abs2, it0VarArr[1].B);
                        M0(getTabProgress());
                        L0();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f32096s1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    g1(motionEvent);
                }
                return this.f32098t1;
            }
        }
        return false;
    }

    public final void p1() {
        boolean z10;
        float f9;
        org.telegram.ui.ActionBar.w0 w0Var = this.f32087p0;
        if (w0Var != null) {
            if (!this.f32093r1.getMessagesController().isPeerNoForwards(this.f32069f1) && !j0()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                f9 = 0.5f;
            } else {
                f9 = 1.0f;
            }
            w0Var.setAlpha(f9);
            if (z10 && w0Var.getBackground() != null) {
                w0Var.setBackground(null);
            } else if (!z10 && w0Var.getBackground() == null) {
                w0Var.setBackground(org.telegram.ui.ActionBar.g6.f0(h0(org.telegram.ui.ActionBar.g6.f23452z8), 5, -1));
            }
        }
    }

    public boolean q0() {
        return false;
    }

    public final void q1(boolean z10) {
        gr0 gr0Var;
        kr0 kr0Var;
        aj0 aj0Var = this.f32085o0;
        if (aj0Var == null) {
            return;
        }
        float f9 = 0.0f;
        if (!this.R0 && (((gr0Var = this.R) == null || !gr0Var.g()) && ((kr0Var = this.S) == null || !kr0Var.f44689w))) {
            f9 = Utilities.clamp(this.f32078k0 + this.f32080l0, 1.0f, 0.0f);
        }
        aj0Var.setAlpha(f9);
        boolean z11 = false;
        if (z10) {
            if (a0(1.0f) > 0.5f) {
                z11 = true;
            }
            A(z11, true);
        } else if (this.f32097t0 == 2) {
            if (this.f32080l0 > 0.1f) {
                z11 = true;
            }
            A(z11, true);
        } else {
            if (this.f32078k0 < 0.1f) {
                z11 = true;
            }
            A(z11, true);
        }
    }

    public final boolean r0() {
        TLRPC.User user;
        long j10 = this.f32069f1;
        if (j10 <= 0 || (user = MessagesController.getInstance(this.f32093r1.getCurrentAccount()).getUser(Long.valueOf(j10))) == null || !user.bot) {
            return false;
        }
        return true;
    }

    public final void r1(boolean z10) {
        int i10 = 0;
        while (true) {
            it0[] it0VarArr = this.f32070g0;
            if (i10 < it0VarArr.length) {
                int childCount = it0VarArr[i10].h.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = it0VarArr[i10].h.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.g7) {
                        ((org.telegram.ui.Cells.g7) childAt).b(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.p7) {
                        ((org.telegram.ui.Cells.p7) childAt).i(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) childAt).f(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.f7) {
                        ((org.telegram.ui.Cells.f7) childAt).e(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.d2) {
                        ((org.telegram.ui.Cells.d2) childAt).c(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.p2) {
                        ((org.telegram.ui.Cells.p2) childAt).V(false, z10);
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
            return this.f32113z1.T();
        }
        if (!t0() && i10 != 0 && !p0(i10) && i10 != 2 && i10 != 5 && i10 != 6 && i10 != 11 && i10 != 10 && i10 != 13 && i10 != 14) {
            return true;
        }
        return false;
    }

    public final void s1(float f9) {
        org.telegram.ui.ActionBar.w0 w0Var = this.f32074i0;
        if (w0Var == null) {
            return;
        }
        it0[] it0VarArr = this.f32070g0;
        it0 it0Var = it0VarArr[1];
        float f10 = 0.0f;
        if (it0Var != null && it0Var.B == 11) {
            f10 = 0.0f + f9;
        }
        int i10 = 0;
        it0 it0Var2 = it0VarArr[0];
        if (it0Var2 != null && it0Var2.B == 11) {
            f10 += 1.0f - f9;
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

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        boolean z10;
        int i10;
        TLRPC.ChatFull chatFull2 = this.Z0;
        if (chatFull2 != null && chatFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Z0 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.Y0 == 0) {
                this.Y0 = -j10;
                int i11 = 0;
                while (true) {
                    fu0[] fu0VarArr = this.f32088p1;
                    if (i11 >= fu0VarArr.length) {
                        break;
                    }
                    if (fu0VarArr[i11].f28535b[1].size() == 0) {
                        fu0 fu0Var = fu0VarArr[i11];
                        fu0Var.f28541j[1] = this.Z0.migrated_from_max_id;
                        fu0Var.f28540i[1] = false;
                    }
                    i11++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.Z0;
        if (chatFull3 != null && z10 != chatFull3.stories_pinned_available) {
            fs0 fs0Var = this.E0;
            if (fs0Var != null) {
                if (q0()) {
                    i10 = 9;
                } else {
                    i10 = 8;
                }
                fs0Var.setInitialTabId(i10);
            }
            v1(true);
            m1(false);
        }
    }

    public void setCommonGroupsCount(int i10) {
        if (this.B == 0) {
            this.T0[6] = i10;
        }
        v1(true);
        F();
    }

    public void setForwardRestrictedHint(g40 g40Var) {
        this.A1 = g40Var;
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
        this.G1 = i11;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            it0[] it0VarArr = this.f32070g0;
            if (i15 >= it0VarArr.length) {
                break;
            }
            it0VarArr[i15].setTranslationY(this.G1);
            i15++;
        }
        if (this.L0 != null) {
            K();
        } else {
            bs0 bs0Var = this.N0;
            if (bs0Var != null) {
                bs0Var.setTranslationY(AndroidUtilities.dp(48.0f) + i11);
            }
        }
        this.K0 = i11;
        org.telegram.ui.Cells.v0 v0Var = this.G0;
        if (v0Var.getTag() == null) {
            i14 = -AndroidUtilities.dp(48.0f);
        }
        v0Var.setTranslationY(i14 + this.K0);
    }

    public void setPagesPaddingBottom(int i10) {
        if (this.T1 != i10) {
            this.T1 = i10;
            it0[] it0VarArr = this.f32070g0;
            if (it0VarArr != null) {
                for (it0 it0Var : it0VarArr) {
                    if (it0Var != null) {
                        or0 or0Var = it0Var.h;
                        int paddingLeft = or0Var.getPaddingLeft();
                        or0 or0Var2 = it0Var.h;
                        int i11 = or0Var2.U2;
                        int paddingRight = or0Var2.getPaddingRight();
                        or0 or0Var3 = it0Var.h;
                        int Y = Y(v0());
                        or0Var3.f29229a3 = Y;
                        or0Var.setPadding(paddingLeft, i11, paddingRight, Y);
                    }
                }
            }
        }
    }

    public void setPinnedToTop(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            int i10 = 0;
            while (true) {
                it0[] it0VarArr = this.f32070g0;
                if (i10 < it0VarArr.length) {
                    o1(it0VarArr[i10], true);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        boolean z10;
        TLRPC.UserFull userFull2 = this.f32055a1;
        if (userFull2 != null && userFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32055a1 = userFull;
        v1(true);
        if (userFull != null && z10 != userFull.stories_pinned_available) {
            Y0(8);
        }
    }

    public void setVisibleHeight(int i10) {
        float f9;
        this.I1 = i10;
        int i11 = 0;
        while (true) {
            it0[] it0VarArr = this.f32070g0;
            if (i11 >= it0VarArr.length) {
                break;
            }
            int measuredHeight = getMeasuredHeight();
            if (it0VarArr[i11].B == 8) {
                f9 = 280.0f;
            } else {
                f9 = 120.0f;
            }
            float f10 = (-(measuredHeight - Math.max(i10, AndroidUtilities.dp(f9)))) / 2.0f;
            it0VarArr[i11].f29471w.setTranslationY(f10);
            it0VarArr[i11].v.setTranslationY(-f10);
            i11++;
        }
        fr0 fr0Var = this.Q;
        if (fr0Var != null) {
            fr0Var.setVisibleHeight(i10);
        }
        gr0 gr0Var = this.R;
        if (gr0Var != null) {
            gr0Var.setVisibleHeight(i10);
        }
    }

    public boolean t0() {
        if (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) {
            return false;
        }
        return true;
    }

    public final void t1() {
        float f9;
        float f10;
        org.telegram.ui.ActionBar.w0 w0Var = this.f32074i0;
        if (w0Var == null) {
            return;
        }
        boolean z10 = true;
        it0 it0Var = this.f32070g0[1];
        z10 = (it0Var == null || it0Var.B != 11) ? false : false;
        if (z10) {
            w0Var.setVisibility(0);
        }
        ViewPropertyAnimator animate = w0Var.animate();
        float f11 = 1.0f;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f9);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.85f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f10);
        if (!z10) {
            f11 = 0.85f;
        }
        scaleX.scaleY(f11).withEndAction(new p90(2, this, z10)).setDuration(420L).setInterpolator(jr.h).start();
    }

    public boolean u0() {
        return false;
    }

    public final void u1() {
        boolean z10;
        int i10;
        lh.k6 k6Var;
        boolean r02 = r0();
        org.telegram.ui.ActionBar.w0 w0Var = this.f32095s0;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f32092r0;
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
                SparseArray[] sparseArrayArr = this.V0;
                if (i12 < sparseArrayArr[0].size()) {
                    MessageObject messageObject = (MessageObject) sparseArrayArr[0].valueAt(i12);
                    xs0 xs0Var = this.V;
                    if (xs0Var != null && (k6Var = xs0Var.f31151s) != null && !k6Var.m(messageObject.getId())) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qu0.v1(boolean):void");
    }

    public final SpannableStringBuilder w() {
        if (this.S1 == null) {
            this.S1 = new SpannableStringBuilder();
            if (r0()) {
                this.S1.append((CharSequence) LocaleController.getString(R.string.ProfileBotPreviewEmptyButton));
            } else {
                this.S1.append((CharSequence) "c");
                this.S1.setSpan(new iq(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.S1.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
            }
        }
        return this.S1;
    }

    public final Boolean w1(View view, View view2) {
        if (!this.f32079k1) {
            it0[] it0VarArr = this.f32070g0;
            boolean z10 = false;
            it0 it0Var = it0VarArr[0];
            if (it0Var != null) {
                int i10 = it0Var.B;
                this.l1 = i10;
                boolean p02 = p0(i10);
                int[] iArr = this.f32075i1;
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
                    } else if (c0(it0VarArr[0].B) >= 5 || w0(it0VarArr[0].B)) {
                        SharedConfig.setStoriesColumnsCount(X);
                    }
                    B(X);
                }
                if (X != X(p02 ? 1 : 0, X, true)) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
            return null;
        }
        return null;
    }

    public final void x(j70 j70Var, org.telegram.ui.ActionBar.o2 o2Var, long j10, int i10) {
        String publicUsername;
        if (j10 > 0) {
            publicUsername = UserObject.getPublicUsername(MessagesController.getInstance(o2Var.getCurrentAccount()).getUser(Long.valueOf(j10)));
        } else {
            publicUsername = ChatObject.getPublicUsername(MessagesController.getInstance(o2Var.getCurrentAccount()).getChat(Long.valueOf(-j10)));
        }
        if (publicUsername == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        org.telegram.ui.th.w(sb2, MessagesController.getInstance(o2Var.getCurrentAccount()).linkPrefix, "/", publicUsername, "/a/");
        sb2.append(i10);
        j70Var.c(R.drawable.media_share, LocaleController.getString(R.string.StoriesAlbumMenuShareLink), new g(this, sb2.toString(), o2Var, 24), false);
    }

    public final boolean x0() {
        if (!C() || ((getClosestTab() != 8 && getClosestTab() != 13 && !w0(getClosestTab())) || !this.f32111y1)) {
            gr0 gr0Var = this.R;
            if (gr0Var == null || !gr0Var.g()) {
                kr0 kr0Var = this.S;
                if ((kr0Var == null || !kr0Var.f44689w) && !this.f32079k1 && !this.f32061c1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final Boolean x1(View view, View view2) {
        if (!this.f32079k1) {
            it0[] it0VarArr = this.f32070g0;
            boolean z10 = false;
            it0 it0Var = it0VarArr[0];
            if (it0Var != null) {
                if (!this.f32071g1 || !p0(it0Var.B)) {
                    int i10 = it0VarArr[0].B;
                    this.l1 = i10;
                    boolean p02 = p0(i10);
                    int[] iArr = this.f32075i1;
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
                        } else if (c0(it0VarArr[0].B) >= 5 || w0(it0VarArr[0].B)) {
                            SharedConfig.setStoriesColumnsCount(X);
                        }
                        B(X);
                    }
                    if (X != X(p02 ? 1 : 0, X, false)) {
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

    public final void y(org.telegram.ui.Components.j70 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qu0.y(org.telegram.ui.Components.j70):void");
    }

    public final void y0(int i10, int i11, int i12, boolean z10) {
        fu0[] fu0VarArr = this.f32088p1;
        fu0VarArr[i10].f28534a.clear();
        fu0VarArr[i10].f28535b[0].clear();
        fu0VarArr[i10].f28535b[1].clear();
        fu0 fu0Var = fu0VarArr[i10];
        fu0Var.f28541j[0] = i11;
        fu0Var.f28540i[0] = false;
        fu0Var.f28543l = false;
        fu0Var.f28544m = i12;
        fu0Var.f28545n = (fu0Var.e() - i12) - 1;
        fu0 fu0Var2 = fu0VarArr[i10];
        if (fu0Var2.f28545n < 0) {
            fu0Var2.f28545n = 0;
        }
        fu0Var2.f28542k = i11;
        fu0Var2.f28546o = true;
        fu0Var2.f28539g = false;
        fu0Var2.f28547p++;
        it0 W = W(i10);
        if (W != null && W.h.getAdapter() != null) {
            W.h.getAdapter().l();
        }
        if (z10) {
            int i13 = 0;
            while (true) {
                it0[] it0VarArr = this.f32070g0;
                if (i13 < it0VarArr.length) {
                    it0 it0Var = it0VarArr[i13];
                    if (it0Var.B == i10) {
                        it0Var.f29472x.h1(Math.min(fu0VarArr[i10].e() - 1, fu0VarArr[i10].f28544m), 0);
                    }
                    i13++;
                } else {
                    return;
                }
            }
        }
    }

    public final void z(ht0 ht0Var, int i10, SparseBooleanArray sparseBooleanArray) {
        int childCount = ht0Var.getChildCount();
        p00 p00Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = ht0Var.getChildAt(i11);
            if (childAt instanceof p00) {
                p00Var = childAt;
            }
        }
        if (p00Var != null) {
            ht0Var.removeView(p00Var);
        }
        getViewTreeObserver().addOnPreDrawListener(new ks0(this, ht0Var, sparseBooleanArray, p00Var, i10));
    }

    public final void z0(boolean z10) {
        long j10 = this.B;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0 && !t0()) {
            for (int i11 = 0; i11 < 4; i11++) {
                final int i12 = Z1[i11];
                fu0[] fu0VarArr = this.f32088p1;
                if (!fu0VarArr[i12].h || z10) {
                    long j11 = this.f32069f1;
                    if (!DialogObject.isEncryptedDialog(j11)) {
                        fu0VarArr[i12].h = false;
                        TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
                        if (i12 == 0) {
                            int i13 = fu0VarArr[i12].f28548q;
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
                        org.telegram.ui.ActionBar.o2 o2Var = this.f32093r1;
                        tL_messages_getSearchResultsPositions.peer = o2Var.getMessagesController().getInputPeer(j11);
                        if (i10 != 0 && o2Var.getUserConfig().getClientUserId() == j11) {
                            tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                            tL_messages_getSearchResultsPositions.saved_peer_id = o2Var.getMessagesController().getInputPeer(j10);
                        }
                        final int i14 = fu0VarArr[i12].f28547p;
                        ConnectionsManager.getInstance(o2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(o2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new sq0(qu0.this, tL_error, i14, i12, tLObject, 0));
                            }
                        }), o2Var.getClassGuid());
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
