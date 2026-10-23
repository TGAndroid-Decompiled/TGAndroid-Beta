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
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
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
public abstract class xv0 extends FrameLayout implements org.telegram.ui.ActionBar.b6, NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Cells.m2 {
    public static final int[] f32656g2 = {0, 1, 2, 4};
    public static final js0 f32657h2 = new js0(0);
    public final NumberTextView A0;
    public int A1;
    public final ha B0;
    public VelocityTracker B1;
    public final ImageView C0;
    public boolean C1;
    public final org.telegram.ui.ActionBar.h2 D0;
    public final ju0 D1;
    public final int E;
    public final ArrayList E0;
    public r40 E1;
    public final long F;
    public final ArrayList F0;
    public final org.telegram.ui.ActionBar.g6 F1;
    public final org.telegram.ui.ActionBar.k G;
    public final ArrayList G0;
    public final gh.c G1;
    public final cu0 H;
    public final ArrayList H0;
    public final NotificationCenter.ObserversGroup H1;
    public final rv0 I;
    public final nt0 I0;
    public boolean I1;
    public final lv0 J;
    public final kt0 J0;
    public final AnimationNotificationsLocker J1;
    public final kv0 K;
    public final org.telegram.ui.Cells.v0 K0;
    public org.telegram.ui.h4 K1;
    public final kv0 L;
    public AnimatorSet L0;
    public int L1;
    public final kv0 M;
    public final rr0 M0;
    public boolean M1;
    public final ev0 N;
    public final ArrayList N0;
    public int N1;
    public final lu0 O;
    public float O0;
    public AnimatorSet O1;
    public final iu0 P;
    public final us P0;
    public final SparseArray P1;
    public final gu0 Q;
    public final FrameLayout Q0;
    public long Q1;
    public final hv0 R;
    public final jt0 R0;
    public boolean R1;
    public final iv0 S;
    public final int S0;
    public int S1;
    public final du0 T;
    public final Paint T0;
    public final ut0 T1;
    public final ms0 U;
    public boolean U0;
    public ci.z6 U1;
    public final ns0 V;
    public boolean V0;
    public float V1;
    public final ss0 W;
    public ah.i1 W0;
    public boolean W1;
    public final int[] X0;
    public SpannableStringBuilder X1;
    public int Y0;
    public int Y1;
    public final SparseArray[] Z0;
    public final HashMap Z1;
    public boolean f32658a;
    public final hu0 f32659a0;
    public int f32660a1;
    public final HashMap a2;
    public boolean f32661b;
    public final s4.y f32662b0;
    public boolean f32663b1;
    public int f32664b2;
    public boolean f32665c;
    public final fu0 f32666c0;
    public long f32667c1;
    public int f32668c2;
    public boolean d;
    public final uv0 f32669d0;
    public TLRPC.ChatFull f32670d1;
    public final kh f32671d2;
    public int e;
    public final ls0 f32672e0;
    public TLRPC.UserFull f32673e1;
    public int f32674e2;
    public int f32675f;
    public final uv0 f32676f0;
    public AnimatorSet f32677f1;
    public int f32678f2;
    public final tu0 f32679g0;
    public boolean f32680g1;
    public float h;
    public final tu0 f32681h0;
    public boolean f32682h1;
    public final tu0 f32683i0;
    public boolean f32684i1;
    public final ou0 f32685j0;
    public final long f32686j1;
    public final qu0[] f32687k0;
    public boolean f32688k1;
    public final org.telegram.ui.ActionBar.u0 f32689l0;
    public boolean l1;
    public final org.telegram.ui.ActionBar.u0 m0;
    public final int[] f32690m1;
    public float f32691n;
    public final org.telegram.ui.ActionBar.u0 f32692n0;
    public float f32693n1;
    public float f32694o0;
    public boolean f32695o1;
    public float f32696p0;
    public int f32697p1;
    public final TextView f32698q0;
    public int f32699q1;
    public boolean f32700r;
    public final ImageView f32701r0;
    public final xs0 f32702r1;
    public int f32703s;
    public final bk0 f32704s0;
    public float f32705s1;
    public final org.telegram.ui.ActionBar.u0 f32706t0;
    public final mv0[] f32707t1;
    public final org.telegram.ui.ActionBar.u0 f32708u0;
    public final pv0 f32709u1;
    public int v;
    public final org.telegram.ui.ActionBar.u0 f32710v0;
    public final org.telegram.ui.ActionBar.o2 f32711v1;
    public int f32712w;
    public final org.telegram.ui.ActionBar.u0 f32713w0;
    public int f32714w1;
    public final Rect f32715x;
    public int f32716x0;
    public boolean f32717x1;
    public final b10 f32718y;
    public final Drawable f32719y0;
    public boolean f32720y1;
    public boolean f32721z0;
    public int f32722z1;

    public xv0(android.content.Context r40, long r41, org.telegram.ui.Components.pv0 r43, int r44, java.util.ArrayList r45, org.telegram.tgnet.TLRPC.ChatFull r46, org.telegram.tgnet.TLRPC.UserFull r47, int r48, int r49, org.telegram.ui.ActionBar.o2 r50, org.telegram.ui.Components.ju0 r51, int r52, org.telegram.ui.ActionBar.g6 r53, bh.b r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xv0.<init>(android.content.Context, long, org.telegram.ui.Components.pv0, int, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.tgnet.TLRPC$UserFull, int, int, org.telegram.ui.ActionBar.o2, org.telegram.ui.Components.ju0, int, org.telegram.ui.ActionBar.g6, bh.b):void");
    }

    public static ku0 N(int i10, long j10, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        ku0 ku0Var = new ku0(context, g6Var);
        TextView textView = ku0Var.f28153a;
        if (i10 == 0) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoMediaSecret));
                return ku0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoMedia));
            return ku0Var;
        } else if (i10 == 1) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedFilesSecret));
                return ku0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedFiles));
            return ku0Var;
        } else if (i10 == 2) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedVoiceSecret));
                return ku0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedVoice));
            return ku0Var;
        } else if (i10 == 3) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedLinksSecret));
                return ku0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedLinks));
            return ku0Var;
        } else if (i10 == 4) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedAudioSecret));
                return ku0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedAudio));
            return ku0Var;
        } else if (i10 == 5) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedGifSecret));
                return ku0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoGIFs));
            return ku0Var;
        } else {
            ImageView imageView = ku0Var.f28154b;
            if (i10 == 6) {
                imageView.setImageDrawable(null);
                textView.setText(LocaleController.getString(R.string.NoGroupsInCommon));
                return ku0Var;
            }
            if (i10 == 7) {
                imageView.setImageDrawable(null);
                textView.setText("");
            }
            return ku0Var;
        }
    }

    public static TLRPC.ProfileTab f0(int i10, boolean z10) {
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

    public static void g(xv0 xv0Var, int i10, TL_stories.StoryItem storyItem, String str) {
        org.telegram.ui.h4 h4Var = new org.telegram.ui.h4(xv0Var, i10, storyItem, 16);
        ci.h7 storiesController = xv0Var.getStoriesController();
        long j10 = xv0Var.f32686j1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.c0(i10, j10, arrayList);
        xc.a0(xv0Var.f32711v1).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", 1, str)), LocaleController.getString(R.string.UndoNoCaps), h4Var).j();
    }

    public static int g0(TLRPC.ProfileTab profileTab) {
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

    public ci.h7 getStoriesController() {
        return MessagesController.getInstance(this.f32711v1.getCurrentAccount()).getStoriesController();
    }

    public static void h(xv0 xv0Var, TL_stories.StoryItem storyItem) {
        xv0Var.getStoriesController().o0(xv0Var.f32686j1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        xc.a0(xv0Var.f32711v1).G(R.raw.chats_archived, 5000, LocaleController.formatPluralString("StoryArchived", 1, new Object[0])).j();
    }

    public static void i(xv0 xv0Var, long j10, int i10, String str) {
        ci.v6 B = xv0Var.getStoriesController().B(j10, true);
        int i11 = B.f6023a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        ((ci.a7) B.h.get(c10)).f5153b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f6024b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public static void j(xv0 xv0Var, TL_stories.StoryItem storyItem, ci.a7 a7Var) {
        xv0Var.getStoriesController().c(a7Var.f5152a, xv0Var.f32686j1, storyItem);
        AndroidUtilities.runOnUIThread(new ko0(7, xv0Var, a7Var), 100L);
    }

    public static void m(xv0 xv0Var, HashSet hashSet, TL_stories.StoryItem storyItem, j80 j80Var, ci.a7 a7Var) {
        String formatString;
        long j10 = xv0Var.f32686j1;
        if (hashSet.contains(Integer.valueOf(a7Var.f5152a))) {
            xv0Var.getStoriesController().c(a7Var.f5152a, j10, storyItem);
            formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, a7Var.f5153b);
        } else {
            ci.h7 storiesController = xv0Var.getStoriesController();
            int i10 = a7Var.f5152a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.c0(i10, j10, arrayList);
            formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, a7Var.f5153b);
        }
        xc.a0(xv0Var.f32711v1).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
        j80Var.u();
    }

    public static void n(xv0 xv0Var, long j10, int i10) {
        ci.v6 B = xv0Var.getStoriesController().B(j10, true);
        int i11 = B.f6023a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f6024b);
        tL_deleteAlbum.album_id = ((ci.a7) B.h.remove(c10)).f5152a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public static int p(xv0 xv0Var, s4.g0 g0Var) {
        if (g0Var == xv0Var.f32669d0) {
            return 8;
        }
        if (g0Var == xv0Var.f32676f0) {
            return 9;
        }
        for (wv0 wv0Var : xv0Var.Z1.values()) {
            if (wv0Var.d == g0Var) {
                return wv0Var.f32355a;
            }
        }
        return -1;
    }

    public static int q(View view) {
        if (view instanceof org.telegram.ui.Cells.s7) {
            return ((org.telegram.ui.Cells.s7) view).getMessageId();
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            return ((org.telegram.ui.Cells.k7) view).getMessage().getId();
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            return ((org.telegram.ui.Cells.j7) view).getMessage().getId();
        }
        return 0;
    }

    public static void r(qu0 qu0Var, mv0[] mv0VarArr, boolean z10) {
        ko0 ko0Var;
        if (z10) {
            if (SharedConfig.fastScrollHintCount > 0 && qu0Var.G == null && !qu0Var.I && qu0Var.h.getFastScroll() != null && qu0Var.h.getFastScroll().f30821a0 && qu0Var.h.getFastScroll().getVisibility() == 0 && mv0VarArr[0].e() >= 50) {
                SharedConfig.setFastScrollHintCount(SharedConfig.fastScrollHintCount - 1);
                qu0Var.I = true;
                Context context = qu0Var.getContext();
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                textView.setText(LocaleController.getString(R.string.SharedMediaFastScrollHint));
                textView.setTextSize(1, 14.0f);
                textView.setMaxLines(3);
                int i10 = org.telegram.ui.ActionBar.k6.f21410pf;
                org.telegram.ui.ActionBar.r6.W(textView, i10, null);
                int dp = AndroidUtilities.dp(6.0f);
                int i11 = org.telegram.ui.ActionBar.k6.f21429qf;
                ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.x0(null, i11, false));
                org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
                frameLayout.setBackground(c02);
                org.telegram.ui.ActionBar.r6.k(frameLayout, c02, O, null, null);
                frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
                ?? view = new View(context);
                view.f29296a = new Random();
                Paint paint = new Paint(1);
                view.f29297b = paint;
                Paint paint2 = new Paint(1);
                view.f29298c = paint2;
                view.f29299f = 1.0f;
                view.h = 0.0f;
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i10, false), 76));
                paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
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
                frameLayout.addView(view, w7.z5.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                qu0Var.G = frameLayout;
                qu0Var.addView((View) frameLayout, w7.z5.c(-2.0f, -2));
                qu0Var.G.setAlpha(0.0f);
                qu0Var.G.setScaleX(0.8f);
                qu0Var.G.setScaleY(0.8f);
                qu0Var.G.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                qu0Var.invalidate();
                ko0 ko0Var2 = new ko0(6, qu0Var, frameLayout);
                qu0Var.H = ko0Var2;
                AndroidUtilities.runOnUIThread(ko0Var2, 4000L);
            }
        } else if (qu0Var.G != null && (ko0Var = qu0Var.H) != null) {
            AndroidUtilities.cancelRunOnUIThread(ko0Var);
            qu0Var.H.run();
            qu0Var.H = null;
            qu0Var.G = null;
        }
    }

    public static boolean r0(int i10) {
        if (i10 != 8 && i10 != 9 && !z0(i10)) {
            return false;
        }
        return true;
    }

    public static void t(org.telegram.ui.Components.xv0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xv0.t(org.telegram.ui.Components.xv0):void");
    }

    public static void u(xv0 xv0Var, int i10, boolean z10) {
        qu0[] qu0VarArr = xv0Var.f32687k0;
        if (qu0VarArr[0].F == i10) {
            return;
        }
        qu0 qu0Var = qu0VarArr[1];
        qu0Var.F = i10;
        qu0Var.setVisibility(0);
        xv0Var.m0();
        xv0Var.p1(true);
        xv0Var.f32682h1 = z10;
        xv0Var.O0();
        xv0Var.A(!xv0Var.v0(i10), true);
        xv0Var.u1(true);
    }

    public static int v(xv0 xv0Var, s4.g0 g0Var) {
        if (g0Var == xv0Var.f32666c0) {
            return 8;
        }
        if (g0Var == xv0Var.f32672e0) {
            return 9;
        }
        for (wv0 wv0Var : xv0Var.Z1.values()) {
            if (wv0Var.f32357c == g0Var) {
                return wv0Var.f32355a;
            }
        }
        return -1;
    }

    public static boolean z0(int i10) {
        if ((i10 & (-65536)) == 65536) {
            return true;
        }
        return false;
    }

    public final void A(boolean z10, boolean z11) {
        int i10;
        bk0 bk0Var = this.f32704s0;
        if (bk0Var != null && this.W1 != z10) {
            this.W1 = z10;
            if (!z10 && bk0Var.getAnimatedDrawable().f32933a0 < 20) {
                bk0Var.getAnimatedDrawable().P(0);
            } else {
                yj0 animatedDrawable = bk0Var.getAnimatedDrawable();
                if (this.W1) {
                    i10 = 50;
                } else {
                    i10 = 100;
                }
                animatedDrawable.P(i10);
            }
            if (z11) {
                bk0Var.getAnimatedDrawable().start();
            } else {
                bk0Var.getAnimatedDrawable().M(bk0Var.getAnimatedDrawable().f32940f);
            }
        }
    }

    public final boolean A0() {
        if (!D() || ((getClosestTab() != 8 && getClosestTab() != 13 && !z0(getClosestTab())) || !this.C1)) {
            ns0 ns0Var = this.V;
            if (ns0Var == null || !ns0Var.g()) {
                ss0 ss0Var = this.W;
                if ((ss0Var == null || !ss0Var.f38040w) && !this.f32695o1 && !this.f32680g1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public void A1(boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xv0.A1(boolean):void");
    }

    public final void B(int i10) {
        int i11;
        qu0 X = X(this.f32697p1);
        this.f32703s = -1;
        if (X != null) {
            X.h.B0();
            this.f32699q1 = i10;
            X.f30004r.setVisibility(0);
            if (r0(this.f32697p1)) {
                X.f30004r.setAdapter(o1(this.f32697p1));
            } else {
                X.f30004r.setAdapter(this.I);
            }
            pu0 pu0Var = X.f30004r;
            int paddingLeft = pu0Var.getPaddingLeft();
            pu0 pu0Var2 = X.f30004r;
            int a02 = a0(X.F);
            pu0Var2.f29671e3 = a02;
            int paddingRight = X.f30004r.getPaddingRight();
            pu0 pu0Var3 = X.f30004r;
            int Z = Z(y0());
            pu0Var3.f29672f3 = Z;
            pu0Var.setPadding(paddingLeft, a02, paddingRight, Z);
            X.f30005s.y1(i10);
            X.f30004r.a0();
            int i12 = 0;
            while (true) {
                qu0[] qu0VarArr = this.f32687k0;
                if (i12 >= qu0VarArr.length) {
                    break;
                }
                qu0 qu0Var = qu0VarArr[i12];
                if (qu0Var != null && ((i11 = qu0Var.F) == 0 || r0(i11))) {
                    AndroidUtilities.updateVisibleRows(qu0VarArr[i12].h);
                }
                i12++;
            }
            this.f32695o1 = true;
            if (this.f32697p1 == 0) {
                this.f32707t1[0].g(true);
            }
            this.f32693n1 = 0.0f;
            a1();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J1.lock();
            ofFloat.addUpdateListener(new mt0(this, X, 1));
            ofFloat.addListener(new gi.s2(this, r0(X.F) ? 1 : 0, i10, 2));
            ofFloat.setInterpolator(bs.f25133f);
            ofFloat.setStartDelay(100L);
            ofFloat.setDuration(350L);
            ofFloat.start();
        }
    }

    public final void B0(int i10, int i11, int i12, boolean z10) {
        mv0[] mv0VarArr = this.f32707t1;
        mv0VarArr[i10].f28757a.clear();
        mv0VarArr[i10].f28758b[0].clear();
        mv0VarArr[i10].f28758b[1].clear();
        mv0 mv0Var = mv0VarArr[i10];
        mv0Var.f28763j[0] = i11;
        mv0Var.f28762i[0] = false;
        mv0Var.f28765l = false;
        mv0Var.f28766m = i12;
        mv0Var.f28767n = (mv0Var.e() - i12) - 1;
        mv0 mv0Var2 = mv0VarArr[i10];
        if (mv0Var2.f28767n < 0) {
            mv0Var2.f28767n = 0;
        }
        mv0Var2.f28764k = i11;
        mv0Var2.f28768o = true;
        mv0Var2.f28761g = false;
        mv0Var2.f28769p++;
        qu0 X = X(i10);
        if (X != null && X.h.getAdapter() != null) {
            X.h.getAdapter().l();
        }
        if (z10) {
            int i13 = 0;
            while (true) {
                qu0[] qu0VarArr = this.f32687k0;
                if (i13 < qu0VarArr.length) {
                    qu0 qu0Var = qu0VarArr[i13];
                    if (qu0Var.F == i10) {
                        qu0Var.f30007x.h1(Math.min(mv0VarArr[i10].e() - 1, mv0VarArr[i10].f28766m), 0);
                    }
                    i13++;
                } else {
                    return;
                }
            }
        }
    }

    public final Boolean B1(View view, View view2) {
        if (!this.f32695o1) {
            qu0[] qu0VarArr = this.f32687k0;
            boolean z10 = false;
            qu0 qu0Var = qu0VarArr[0];
            if (qu0Var != null) {
                int i10 = qu0Var.F;
                this.f32697p1 = i10;
                boolean r02 = r0(i10);
                int[] iArr = this.f32690m1;
                int Y = Y(r02 ? 1 : 0, iArr[r02 ? 1 : 0], true);
                if (view != null && Y == Y(r02 ? 1 : 0, Y, true)) {
                    view.setEnabled(false);
                    view.animate().alpha(0.5f).start();
                }
                if (iArr[r02 ? 1 : 0] != Y) {
                    if (view2 != null && !view2.isEnabled()) {
                        view2.setEnabled(true);
                        view2.animate().alpha(1.0f).start();
                    }
                    if (!r02) {
                        SharedConfig.setMediaColumnsCount(Y);
                    } else if (d0(qu0VarArr[0].F) >= 5 || z0(qu0VarArr[0].F)) {
                        SharedConfig.setStoriesColumnsCount(Y);
                    }
                    B(Y);
                }
                if (Y != Y(r02 ? 1 : 0, Y, true)) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
            return null;
        }
        return null;
    }

    public final void C(org.telegram.ui.ActionBar.u0 u0Var) {
        if (u0Var != null) {
            bk0 iconView = u0Var.getIconView();
            org.telegram.ui.ActionBar.g6 g6Var = this.F1;
            if (iconView != null) {
                org.telegram.ui.ActionBar.r6.t(u0Var.getIconView(), org.telegram.ui.ActionBar.k6.f21573y8, g6Var, PorterDuff.Mode.SRC_IN);
            }
            if (u0Var.getBackground() != null) {
                Drawable background = u0Var.getBackground();
                org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.f21590z8);
                u0Var.setBackground(background);
                org.telegram.ui.ActionBar.r6.k(u0Var, background, null, O, g6Var);
            }
        }
    }

    public final void C0(boolean z10) {
        long j10 = this.F;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0 && !w0()) {
            for (int i11 = 0; i11 < 4; i11++) {
                final int i12 = f32656g2[i11];
                mv0[] mv0VarArr = this.f32707t1;
                if (!mv0VarArr[i12].h || z10) {
                    long j11 = this.f32686j1;
                    if (!DialogObject.isEncryptedDialog(j11)) {
                        mv0VarArr[i12].h = false;
                        TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
                        if (i12 == 0) {
                            int i13 = mv0VarArr[i12].f28770q;
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
                        org.telegram.ui.ActionBar.o2 o2Var = this.f32711v1;
                        tL_messages_getSearchResultsPositions.peer = o2Var.getMessagesController().getInputPeer(j11);
                        if (i10 != 0 && o2Var.getUserConfig().getClientUserId() == j11) {
                            tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                            tL_messages_getSearchResultsPositions.saved_peer_id = o2Var.getMessagesController().getInputPeer(j10);
                        }
                        final int i14 = mv0VarArr[i12].f28769p;
                        ConnectionsManager.getInstance(o2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(o2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new yr0(xv0.this, tL_error, i14, i12, tLObject, 0));
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

    public final Boolean C1(View view, View view2) {
        if (!this.f32695o1) {
            qu0[] qu0VarArr = this.f32687k0;
            boolean z10 = false;
            qu0 qu0Var = qu0VarArr[0];
            if (qu0Var != null) {
                if (!this.f32688k1 || !r0(qu0Var.F)) {
                    int i10 = qu0VarArr[0].F;
                    this.f32697p1 = i10;
                    boolean r02 = r0(i10);
                    int[] iArr = this.f32690m1;
                    int Y = Y(r02 ? 1 : 0, iArr[r02 ? 1 : 0], false);
                    if (view2 != null && Y == Y(r02 ? 1 : 0, Y, false)) {
                        view2.setEnabled(false);
                        view2.animate().alpha(0.5f).start();
                    }
                    if (iArr[r02 ? 1 : 0] != Y) {
                        if (view != null && !view.isEnabled()) {
                            view.setEnabled(true);
                            view.animate().alpha(1.0f).start();
                        }
                        if (!r02) {
                            SharedConfig.setMediaColumnsCount(Y);
                        } else if (d0(qu0VarArr[0].F) >= 5 || z0(qu0VarArr[0].F)) {
                            SharedConfig.setStoriesColumnsCount(Y);
                        }
                        B(Y);
                    }
                    if (Y != Y(r02 ? 1 : 0, Y, false)) {
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

    public final boolean D() {
        boolean t02 = t0();
        long j10 = this.f32686j1;
        org.telegram.ui.ActionBar.o2 o2Var = this.f32711v1;
        if (t02) {
            TLRPC.User user = MessagesController.getInstance(o2Var.getCurrentAccount()).getUser(Long.valueOf(j10));
            if (user == null || !user.bot || !user.bot_can_edit) {
                return false;
            }
            return true;
        } else if (!y0() && (o2Var == null || !o2Var.getMessagesController().getStoriesController().h(j10))) {
            return false;
        } else {
            return true;
        }
    }

    public final void D0(int i10) {
        int i11;
        int i12 = 2;
        mv0[] mv0VarArr = this.f32707t1;
        if (i10 == 0) {
            int i13 = mv0VarArr[0].f28770q;
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
        mv0VarArr[i10].f28761g = true;
        org.telegram.ui.ActionBar.o2 o2Var = this.f32711v1;
        o2Var.getMediaDataController().loadMedia(this.f32686j1, 50, 0, mv0VarArr[i10].f28764k, i11, this.F, 1, o2Var.getClassGuid(), mv0VarArr[i10].f28769p, null, null);
    }

    public boolean E() {
        return !(this instanceof h40);
    }

    public int E0() {
        return 0;
    }

    public final boolean F() {
        qu0 qu0Var;
        qu0[] qu0VarArr = this.f32687k0;
        if (qu0VarArr == null || (qu0Var = qu0VarArr[0]) == null) {
            return false;
        }
        if (this.f32688k1 && r0(qu0Var.F)) {
            return false;
        }
        boolean r02 = r0(qu0VarArr[0].F);
        int i10 = this.f32690m1[r02 ? 1 : 0];
        if (i10 == Y(r02 ? 1 : 0, i10, false)) {
            return false;
        }
        return true;
    }

    public final void F0(int i10, View view) {
        boolean z10;
        boolean z11;
        String string;
        int i11;
        ms0 ms0Var;
        int i12;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z12;
        String formatPluralString;
        String formatPluralString2;
        int i13;
        int i14;
        boolean z13;
        hv0 hv0Var = this.R;
        SparseArray[] sparseArrayArr = this.Z0;
        org.telegram.ui.ActionBar.o2 o2Var = this.f32711v1;
        boolean z14 = true;
        char c10 = 1;
        if (i10 == 101) {
            boolean r02 = r0(getSelectedTab());
            org.telegram.ui.ActionBar.g6 g6Var = this.F1;
            if (!r02 && getSelectedTab() != 13) {
                if (getSelectedTab() == 11) {
                    SavedMessagesController savedMessagesController = o2Var.getMessagesController().getSavedMessagesController();
                    final ArrayList arrayList = new ArrayList();
                    for (int i15 = 0; i15 < savedMessagesController.allDialogs.size(); i15++) {
                        long j10 = savedMessagesController.allDialogs.get(i15).dialogId;
                        if (hv0Var.f27062w.contains(Long.valueOf(j10))) {
                            arrayList.add(Long.valueOf(j10));
                        }
                    }
                    String str = "";
                    if (!arrayList.isEmpty()) {
                        Long l4 = (Long) arrayList.get(0);
                        long longValue = l4.longValue();
                        if (longValue == o2Var.getUserConfig().getClientUserId()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        int i16 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                        z12 = z13;
                        if (i16 < 0) {
                            TLRPC.Chat chat2 = o2Var.getMessagesController().getChat(Long.valueOf(-longValue));
                            z12 = z13;
                            if (chat2 != null) {
                                str = chat2.title;
                                z12 = z13;
                            }
                        } else if (i16 >= 0) {
                            TLRPC.User user2 = o2Var.getMessagesController().getUser(l4);
                            z12 = z13;
                            if (user2 != null) {
                                if (UserObject.isAnonymous(user2)) {
                                    str = LocaleController.getString(R.string.AnonymousForward);
                                    z12 = z13;
                                } else {
                                    str = UserObject.getUserName(user2);
                                    z12 = z13;
                                }
                            }
                        }
                    } else {
                        z12 = false;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, g6Var);
                    if (arrayList.size() == 1) {
                        if (z12) {
                            i14 = R.string.ClearHistoryMyNotesTitle;
                        } else {
                            i14 = R.string.ClearHistoryTitleSingle2;
                        }
                        formatPluralString = LocaleController.formatString(i14, str);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("ClearHistoryTitleMultiple", arrayList.size(), new Object[0]);
                    }
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                    c2Var.R = formatPluralString;
                    if (arrayList.size() == 1) {
                        if (z12) {
                            i13 = R.string.ClearHistoryMyNotesMessage;
                        } else {
                            i13 = R.string.ClearHistoryMessageSingle;
                        }
                        formatPluralString2 = LocaleController.formatString(i13, str);
                    } else {
                        formatPluralString2 = LocaleController.formatPluralString("ClearHistoryMessageMultiple", arrayList.size(), new Object[0]);
                    }
                    c2Var.T = formatPluralString2;
                    alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.z1(this) {
                        public final xv0 f24836b;

                        {
                            this.f24836b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i17) {
                            switch (r3) {
                                case 0:
                                    xv0 xv0Var = this.f24836b;
                                    org.telegram.ui.ActionBar.o2 o2Var2 = xv0Var.f32711v1;
                                    ci.h7 storiesController = o2Var2.getMessagesController().getStoriesController();
                                    long j11 = xv0Var.f32686j1;
                                    ArrayList arrayList2 = arrayList;
                                    storiesController.s(j11, arrayList2);
                                    xc.a0(o2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList2.size(), new Object[0])).j();
                                    xv0Var.M(false);
                                    return;
                                default:
                                    xv0 xv0Var2 = this.f24836b;
                                    xv0Var2.getClass();
                                    int i18 = 0;
                                    while (true) {
                                        ArrayList arrayList3 = arrayList;
                                        if (i18 < arrayList3.size()) {
                                            xv0Var2.f32711v1.getMessagesController().deleteSavedDialog(((Long) arrayList3.get(i18)).longValue());
                                            i18++;
                                        } else {
                                            xv0Var2.M(true);
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
                        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, null);
                        return;
                    }
                    return;
                }
                long j11 = this.f32686j1;
                if (DialogObject.isEncryptedDialog(j11)) {
                    encryptedChat = org.telegram.messenger.v0.l(o2Var.getMessagesController(), j11);
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
                f5.z(o2Var, user, chat, encryptedChat, null, this.f32667c1, null, this.Z0, null, 0, 0, null, new rr0(this, 1), null, this.F1);
            } else if (sparseArrayArr[0] != null) {
                if (t0() && (ms0Var = this.U) != null && ms0Var.getCurrentList() != null) {
                    ci.s6 currentList = ms0Var.getCurrentList();
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
                        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20678a;
                        c2Var2.R = string2;
                        c2Var2.T = LocaleController.formatPluralString("DeleteBotPreviewsSubtitle", arrayList2.size(), new Object[0]);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new ry(this, currentList, arrayList2, 3));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new ud0(16));
                        c2Var2.show();
                        c2Var2.i();
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
                    org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.f20678a;
                    c2Var3.R = string3;
                    c2Var3.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList3.size(), new Object[0]);
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1(this) {
                        public final xv0 f24836b;

                        {
                            this.f24836b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.c2 c2Var22, int i172) {
                            switch (r3) {
                                case 0:
                                    xv0 xv0Var = this.f24836b;
                                    org.telegram.ui.ActionBar.o2 o2Var2 = xv0Var.f32711v1;
                                    ci.h7 storiesController = o2Var2.getMessagesController().getStoriesController();
                                    long j112 = xv0Var.f32686j1;
                                    ArrayList arrayList22 = arrayList3;
                                    storiesController.s(j112, arrayList22);
                                    xc.a0(o2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList22.size(), new Object[0])).j();
                                    xv0Var.M(false);
                                    return;
                                default:
                                    xv0 xv0Var2 = this.f24836b;
                                    xv0Var2.getClass();
                                    int i182 = 0;
                                    while (true) {
                                        ArrayList arrayList32 = arrayList3;
                                        if (i182 < arrayList32.size()) {
                                            xv0Var2.f32711v1.getMessagesController().deleteSavedDialog(((Long) arrayList32.get(i182)).longValue());
                                            i182++;
                                        } else {
                                            xv0Var2.M(true);
                                            return;
                                        }
                                    }
                            }
                        }
                    });
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new ud0(17));
                    c2Var3.show();
                    c2Var3.i();
                }
            }
        } else if (i10 == 100) {
            if (this.f32673e1 != null && o2Var.getMessagesController().isUserNoForwards(this.f32673e1)) {
                r40 r40Var = this.E1;
                if (r40Var != null) {
                    r40Var.setText(LocaleController.getString(R.string.ForwardsRestrictedInfoUser));
                    this.E1.f(view, true);
                    return;
                }
                return;
            }
            if (this.f32670d1 != null) {
                TLRPC.Chat chat3 = o2Var.getMessagesController().getChat(Long.valueOf(this.f32670d1.f20344id));
                if (o2Var.getMessagesController().isChatNoForwards(chat3)) {
                    r40 r40Var2 = this.E1;
                    if (r40Var2 != null) {
                        if (ChatObject.isChannel(chat3) && !chat3.megagroup) {
                            string = LocaleController.getString(R.string.ForwardsRestrictedInfoChannel);
                        } else {
                            string = LocaleController.getString(R.string.ForwardsRestrictedInfoGroup);
                        }
                        r40Var2.setText(string);
                        this.E1.f(view, true);
                        return;
                    }
                    return;
                }
            }
            if (l0()) {
                r40 r40Var3 = this.E1;
                if (r40Var3 != null) {
                    r40Var3.setText(LocaleController.getString("ForwardsRestrictedInfoBot", R.string.ForwardsRestrictedInfoBot));
                    this.E1.f(view, true);
                    return;
                }
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("canSelectTopics", true);
            bundle.putInt("dialogsType", 3);
            org.telegram.ui.ey eyVar = new org.telegram.ui.ey(bundle);
            eyVar.C2 = new sr0(this);
            o2Var.presentFragment(eyVar);
        } else if (i10 == 102) {
            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 1) {
                if (sparseArrayArr[0].size() == 1) {
                    c10 = 0;
                }
                MessageObject messageObject = (MessageObject) sparseArrayArr[c10].valueAt(0);
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
                org.telegram.ui.sn snVar = new org.telegram.ui.sn(bundle2);
                snVar.X7 = messageObject.getId();
                long j12 = this.F;
                if (j12 != 0) {
                    og.d.a(snVar, MessagesStorage.TopicKey.of(dialogId, j12));
                    bundle2.putInt("message_id", messageObject.getId());
                }
                o2Var.presentFragment(snVar, false);
            }
        } else if (i10 == 103 || i10 == 104) {
            if (getClosestTab() == 8) {
                fu0 fu0Var = this.f32666c0;
                if (fu0Var != null && fu0Var.f31223s != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (int i19 = 0; i19 < sparseArrayArr[0].size(); i19++) {
                        arrayList4.add(Integer.valueOf(((MessageObject) sparseArrayArr[0].valueAt(i19)).getId()));
                    }
                    if (i10 != 103) {
                        z14 = false;
                    }
                    W0(arrayList4, z14);
                    M(false);
                    return;
                }
                return;
            }
            SavedMessagesController savedMessagesController2 = o2Var.getMessagesController().getSavedMessagesController();
            ArrayList<Long> arrayList5 = new ArrayList<>();
            for (int i20 = 0; i20 < savedMessagesController2.allDialogs.size(); i20++) {
                long j13 = savedMessagesController2.allDialogs.get(i20).dialogId;
                if (hv0Var.f27062w.contains(Long.valueOf(j13))) {
                    arrayList5.add(Long.valueOf(j13));
                }
            }
            if (i10 == 103) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!savedMessagesController2.updatePinned(arrayList5, z10, true)) {
                z11 = true;
                o2Var.showDialog(new sg.j0(33, o2Var.getCurrentAccount(), getContext(), o2Var, null));
            } else {
                z11 = true;
                int i21 = 0;
                while (true) {
                    qu0[] qu0VarArr = this.f32687k0;
                    if (i21 >= qu0VarArr.length) {
                        break;
                    }
                    qu0 qu0Var = qu0VarArr[i21];
                    if (qu0Var.F == 11) {
                        qu0Var.f30007x.h1(0, 0);
                        break;
                    }
                    i21++;
                }
            }
            M(z11);
        }
    }

    public final void G() {
        nt0 nt0Var = this.I0;
        if (!nt0Var.d(nt0Var.getCurrentTabId())) {
            int firstTabId = nt0Var.getFirstTabId();
            nt0Var.setInitialTabId(firstTabId);
            this.f32687k0[0].F = firstTabId;
            p1(false);
        }
    }

    public final void H(org.telegram.ui.Components.qu0 r34, org.telegram.ui.Components.mm0 r35, s4.b0 r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xv0.H(org.telegram.ui.Components.qu0, org.telegram.ui.Components.mm0, s4.b0):void");
    }

    public final boolean I(MotionEvent motionEvent) {
        float f7;
        s4.g0 g0Var;
        boolean z10;
        ms0 ms0Var;
        float f10;
        boolean z11;
        qu0[] qu0VarArr = this.f32687k0;
        int i10 = qu0VarArr[0].F;
        if (i10 == 13 && (ms0Var = this.U) != null) {
            View currentView = ms0Var.f8079n.getCurrentView();
            if (currentView instanceof di.r) {
                di.r rVar = (di.r) currentView;
                di.l lVar = rVar.v;
                di.i iVar = rVar.f8064f;
                if (rVar.f8061a != null && rVar.getParent() != null) {
                    if (!rVar.f8062b || rVar.K) {
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
                                            rVar.f8063c = 0.0f;
                                        } else {
                                            if (z12) {
                                                f10 = org.telegram.messenger.v0.y(2.0f, rVar.Q, 1.0f, 1.0f);
                                            } else {
                                                f10 = (1.0f - rVar.Q) / 0.5f;
                                            }
                                            rVar.f8063c = Math.max(0.0f, Math.min(1.0f, f10));
                                        }
                                        float f11 = rVar.f8063c;
                                        int i14 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
                                        if (i14 == 0 || f11 == 0.0f) {
                                            if (i14 == 0) {
                                                int i15 = rVar.e;
                                                int ceil = (((int) Math.ceil(rVar.S / rVar.e)) * i15) + ((int) ((rVar.W.G.f32722z1 / (iVar.getMeasuredWidth() - ((int) (iVar.getMeasuredWidth() / rVar.e)))) * (i15 - 1)));
                                                if (ceil >= lVar.h()) {
                                                    ceil = lVar.h() - 1;
                                                }
                                                rVar.S = ceil;
                                            }
                                            rVar.a();
                                            if (rVar.f8063c == 0.0f) {
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
                                int i17 = y3 + iVar.Y2;
                                for (int i18 = 0; i18 < iVar.getChildCount(); i18++) {
                                    View childAt = iVar.getChildAt(i18);
                                    childAt.getHitRect(rect);
                                    if (rect.contains(i16, i17)) {
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
        if ((i10 == 0 || r0(i10)) && getParent() != null) {
            if (!this.f32695o1 || this.f32658a) {
                if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                    if (motionEvent.getActionMasked() == 2 && (this.f32658a || this.f32665c)) {
                        int i19 = -1;
                        int i20 = -1;
                        for (int i21 = 0; i21 < motionEvent.getPointerCount(); i21++) {
                            if (this.e == motionEvent.getPointerId(i21)) {
                                i19 = i21;
                            }
                            if (this.f32675f == motionEvent.getPointerId(i21)) {
                                i20 = i21;
                            }
                        }
                        if (i19 != -1 && i20 != -1) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(i20) - motionEvent.getX(i19), motionEvent.getY(i20) - motionEvent.getY(i19))) / this.h;
                            this.f32691n = hypot2;
                            if (!this.f32658a && (hypot2 > 1.01f || hypot2 < 0.99f)) {
                                this.f32658a = true;
                                if (hypot2 > 1.0f) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                this.f32700r = z10;
                                h1(z10);
                            }
                            if (this.f32658a) {
                                boolean z13 = this.f32700r;
                                if ((z13 && this.f32691n < 1.0f) || (!z13 && this.f32691n > 1.0f)) {
                                    this.f32693n1 = 0.0f;
                                } else {
                                    if (z13) {
                                        f7 = org.telegram.messenger.v0.y(2.0f, this.f32691n, 1.0f, 1.0f);
                                    } else {
                                        f7 = (1.0f - this.f32691n) / 0.5f;
                                    }
                                    this.f32693n1 = Math.max(0.0f, Math.min(1.0f, f7));
                                }
                                float f12 = this.f32693n1;
                                if (f12 == 1.0f || f12 == 0.0f) {
                                    if (r0(this.f32697p1)) {
                                        g0Var = n1(this.f32697p1);
                                    } else {
                                        g0Var = this.H;
                                    }
                                    if (this.f32693n1 == 1.0f) {
                                        int i22 = this.f32699q1;
                                        int ceil2 = (((int) Math.ceil(this.f32703s / this.f32699q1)) * i22) + ((int) ((this.f32722z1 / (qu0VarArr[0].h.getMeasuredWidth() - ((int) (qu0VarArr[0].h.getMeasuredWidth() / this.f32699q1)))) * (i22 - 1)));
                                        if (ceil2 >= g0Var.h()) {
                                            ceil2 = g0Var.h() - 1;
                                        }
                                        this.f32703s = ceil2;
                                    }
                                    U();
                                    if (this.f32693n1 == 0.0f) {
                                        this.f32700r = !this.f32700r;
                                    }
                                    h1(this.f32700r);
                                    this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                qu0VarArr[0].h.invalidate();
                                qu0 qu0Var = qu0VarArr[0];
                                if (qu0Var.G != null) {
                                    qu0Var.invalidate();
                                }
                            }
                        } else {
                            this.f32661b = false;
                            this.f32665c = false;
                            this.f32658a = false;
                            U();
                            return false;
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.e == motionEvent.getPointerId(0) && this.f32675f == motionEvent.getPointerId(1)) || (this.e == motionEvent.getPointerId(1) && this.f32675f == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.f32658a) {
                        this.f32665c = false;
                        this.f32661b = false;
                        this.f32658a = false;
                        U();
                    }
                } else {
                    if (this.f32661b && !this.f32658a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.f32691n = 1.0f;
                        this.e = motionEvent.getPointerId(0);
                        this.f32675f = motionEvent.getPointerId(1);
                        qu0VarArr[0].h.I0(false);
                        qu0VarArr[0].h.cancelLongPress();
                        qu0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.f32712w = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - qu0VarArr[0].getX());
                        int y10 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - qu0VarArr[0].getY());
                        int i23 = this.f32712w;
                        this.f32703s = -1;
                        int i24 = y10 + qu0VarArr[0].h.Y2;
                        if (getY() != 0.0f && this.E == 1) {
                            i24 = 0;
                        }
                        for (int i25 = 0; i25 < qu0VarArr[0].h.getChildCount(); i25++) {
                            View childAt2 = qu0VarArr[0].h.getChildAt(i25);
                            Rect rect2 = this.f32715x;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i23, i24)) {
                                qu0VarArr[0].h.getClass();
                                this.f32703s = RecyclerView.S(childAt2);
                                this.v = childAt2.getTop();
                            }
                        }
                        if (this.D1.T() && this.f32703s == -1) {
                            this.f32703s = (int) (((this.f32690m1[r0(qu0VarArr[0].F) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i23 / qu0VarArr[0].h.getMeasuredWidth(), 0.0f))) + qu0VarArr[0].f30007x.L0());
                            this.v = 0;
                        }
                        this.f32665c = true;
                    }
                    if (motionEvent.getActionMasked() == 0 && ((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - qu0VarArr[0].getY() > 0.0f) {
                        this.f32661b = true;
                    }
                }
                return this.f32658a;
            }
            return true;
        }
        return false;
    }

    public final void I0() {
        ci.z6 z6Var;
        ci.z6 z6Var2;
        this.H1.removeAllObservers();
        fu0 fu0Var = this.f32666c0;
        if (fu0Var != null && (z6Var2 = fu0Var.f31223s) != null && z6Var2 != null) {
            z6Var2.z(fu0Var.v);
        }
        ls0 ls0Var = this.f32672e0;
        if (ls0Var != null && (z6Var = ls0Var.f31223s) != null && z6Var != null) {
            z6Var.z(ls0Var.v);
        }
        for (wv0 wv0Var : this.Z1.values()) {
            vv0 vv0Var = wv0Var.f32357c;
            ci.z6 z6Var3 = vv0Var.f31223s;
            if (z6Var3 != null && z6Var3 != null) {
                z6Var3.z(vv0Var.v);
            }
        }
    }

    public final void J() {
        char c10;
        char c11;
        float abs;
        View childAt;
        int R;
        float f7;
        float measuredWidth;
        qu0[] qu0VarArr = this.f32687k0;
        qu0 qu0Var = qu0VarArr[0];
        if (qu0Var != null && qu0VarArr[1] != null) {
            float f10 = 0.0f;
            ss0 ss0Var = this.W;
            if (ss0Var != null) {
                if (r0(qu0Var.F) && qu0VarArr[0].F != 9) {
                    c10 = 1;
                } else {
                    c10 = 0;
                }
                if (qu0VarArr[1].getVisibility() == 0) {
                    if (r0(qu0VarArr[1].F) && qu0VarArr[1].F != 9) {
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
                        measuredWidth = qu0VarArr[0].getMeasuredWidth();
                    }
                    ss0Var.setTranslationX(measuredWidth);
                } else {
                    ss0Var.setTranslationX(qu0VarArr[c10 ^ 1].getTranslationX());
                    abs = 1.0f - (Math.abs(ss0Var.getTranslationX()) / ss0Var.getMeasuredWidth());
                }
                float f11 = 0.0f;
                for (int i10 = 0; i10 < qu0VarArr.length; i10++) {
                    if (qu0VarArr[i10].getVisibility() == 0) {
                        ws0 ws0Var = qu0VarArr[i10].h;
                        if (ws0Var.getChildCount() == 0) {
                            childAt = null;
                        } else {
                            childAt = ws0Var.getChildAt(0);
                        }
                        if (childAt == null) {
                            R = -1;
                        } else {
                            R = RecyclerView.R(childAt);
                        }
                        if (R == 0) {
                            f7 = childAt.getY() - ws0Var.getPaddingTop();
                        } else if (ws0Var.getChildCount() == 0) {
                            f7 = 0.0f;
                        } else {
                            f7 = -AndroidUtilities.dp(48.0f);
                        }
                        f11 += Utilities.clamp01(1.0f - (qu0VarArr[i10].getTranslationX() / qu0VarArr[i10].getMeasuredWidth())) * f7;
                    }
                }
                float clamp01 = Utilities.clamp01(1.0f - ((-f11) / AndroidUtilities.dpf2(48.0f)));
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
                ss0Var.setAlpha(clamp01);
                ss0Var.setScaleX(lerp);
                ss0Var.setScaleY(lerp);
                ss0Var.setTranslationY(this.L1 + f11);
                f10 = abs;
            }
            L();
            if (this.V1 != f10) {
                this.V1 = f10;
                q0();
                invalidate();
            }
        }
    }

    public final void J0(int i10, View view, MessageObject messageObject, int i11) {
        TLRPC.WebPage webPage;
        String str;
        char c10;
        int i12;
        int i13;
        boolean z10;
        if (messageObject != null && !this.f32695o1) {
            ss0 ss0Var = this.W;
            if (ss0Var == null || !ss0Var.f38040w) {
                int i14 = 0;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                i14 = 0;
                String str2 = null;
                ci.z6 z6Var = null;
                if (this.C1) {
                    int i15 = 8;
                    if (i11 != 8 || D()) {
                        if (messageObject.getDialogId() == this.f32686j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        SparseArray[] sparseArrayArr = this.Z0;
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            sparseArrayArr[c10].remove(messageObject.getId());
                            if (!messageObject.canDeleteMessage(false, null)) {
                                this.f32660a1--;
                            }
                        } else {
                            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                                sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                                if (!messageObject.canDeleteMessage(false, null)) {
                                    this.f32660a1++;
                                }
                            } else {
                                return;
                            }
                        }
                        G0(sparseArrayArr[0]);
                        if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                            e1(false);
                        } else {
                            this.A0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                            if (this.f32660a1 == 0) {
                                i12 = 0;
                            } else {
                                i12 = 8;
                            }
                            this.f32689l0.setVisibility(i12);
                            org.telegram.ui.ActionBar.u0 u0Var = this.f32708u0;
                            if (u0Var != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14 && sparseArrayArr[0].size() == 1) {
                                    i13 = 0;
                                } else {
                                    i13 = 8;
                                }
                                u0Var.setVisibility(i13);
                            }
                            org.telegram.ui.ActionBar.u0 u0Var2 = this.f32706t0;
                            if (u0Var2 != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                                    i15 = 0;
                                }
                                u0Var2.setVisibility(i15);
                            }
                            z1();
                        }
                        this.f32663b1 = false;
                        if (view instanceof org.telegram.ui.Cells.k7) {
                            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            k7Var.b(z11, true);
                        } else if (view instanceof org.telegram.ui.Cells.t7) {
                            org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            t7Var.b(0, z10, true);
                        } else if (view instanceof org.telegram.ui.Cells.n7) {
                            org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z12 = true;
                            }
                            n7Var.f(z12, true);
                        } else if (view instanceof org.telegram.ui.Cells.j7) {
                            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z13 = true;
                            }
                            j7Var.e(z13, true);
                        } else if (view instanceof org.telegram.ui.Cells.e2) {
                            org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z14 = true;
                            }
                            e2Var.c(z14, true);
                        } else if (view instanceof org.telegram.ui.Cells.s7) {
                            org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z15 = true;
                            }
                            s7Var.i(z15, true);
                        }
                    } else {
                        return;
                    }
                } else {
                    xs0 xs0Var = this.f32702r1;
                    mv0[] mv0VarArr = this.f32707t1;
                    org.telegram.ui.ActionBar.o2 o2Var = this.f32711v1;
                    if (i11 == 0) {
                        mv0 mv0Var = mv0VarArr[i11];
                        int i16 = i10 - mv0Var.f28766m;
                        if (i16 >= 0 && i16 < mv0Var.f28757a.size()) {
                            PhotoViewer.u1().M2(null, o2Var, null);
                            PhotoViewer.u1().d2(mv0VarArr[i11].f28757a, i16, this.f32686j1, this.f32667c1, this.F, xs0Var);
                        }
                    } else if (i11 != 2 && i11 != 4) {
                        if (i11 == 5) {
                            PhotoViewer.u1().M2(null, o2Var, null);
                            int indexOf = mv0VarArr[i11].f28757a.indexOf(messageObject);
                            if (indexOf < 0) {
                                PhotoViewer.u1().d2(org.telegram.messenger.v0.k(messageObject), 0, 0L, 0L, 0L, xs0Var);
                            } else {
                                PhotoViewer.u1().d2(mv0VarArr[i11].f28757a, indexOf, this.f32686j1, this.f32667c1, this.F, xs0Var);
                            }
                        } else if (i11 == 1) {
                            if (view instanceof org.telegram.ui.Cells.k7) {
                                org.telegram.ui.Cells.k7 k7Var2 = (org.telegram.ui.Cells.k7) view;
                                TLRPC.Document document = messageObject.getDocument();
                                if (k7Var2.G) {
                                    if (messageObject.canPreviewDocument()) {
                                        PhotoViewer.u1().M2(null, o2Var, null);
                                        int indexOf2 = mv0VarArr[i11].f28757a.indexOf(messageObject);
                                        if (indexOf2 < 0) {
                                            PhotoViewer.u1().d2(org.telegram.messenger.v0.k(messageObject), 0, 0L, 0L, 0L, xs0Var);
                                            return;
                                        }
                                        PhotoViewer.u1().d2(mv0VarArr[i11].f28757a, indexOf2, this.f32686j1, this.f32667c1, this.F, xs0Var);
                                        return;
                                    }
                                    AndroidUtilities.openDocument(messageObject, o2Var.getParentActivity(), o2Var);
                                } else if (!k7Var2.F) {
                                    MessageObject message = k7Var2.getMessage();
                                    message.putInDownloadsStore = true;
                                    o2Var.getFileLoader().loadFile(document, message, 0, 0);
                                    k7Var2.f(true);
                                } else {
                                    o2Var.getFileLoader().cancelLoadFile(document);
                                    k7Var2.f(true);
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
                                        LaunchActivity launchActivity = LaunchActivity.J1;
                                        if (launchActivity == null || launchActivity.P() == null || LaunchActivity.J1.P().l(messageObject) == null) {
                                            o2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                            return;
                                        }
                                        return;
                                    }
                                    String str3 = webPage.embed_url;
                                    if (str3 != null && str3.length() != 0) {
                                        cv.I(o2Var, messageObject, this.f32702r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                        return;
                                    }
                                    str = webPage.url;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    ArrayList arrayList = ((org.telegram.ui.Cells.n7) view).E;
                                    if (arrayList.size() > 0) {
                                        str2 = ((CharSequence) arrayList.get(0)).toString();
                                    }
                                    str = str2;
                                }
                                if (str != null) {
                                    U0(str);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        } else if (r0(i11)) {
                            uv0 n12 = n1(i11);
                            if (n12 != null) {
                                z6Var = n12.f31223s;
                            }
                            if (z6Var != null) {
                                ci.z9 orCreateStoryViewer = o2Var.getOrCreateStoryViewer();
                                Context context = getContext();
                                int id2 = messageObject.getId();
                                ci.q7 a2 = ci.q7.a(this.f32687k0[0].h);
                                a2.e = new tv(z6Var, 19);
                                if ((o2Var instanceof ProfileActivity) && ((ProfileActivity) o2Var).f34017t1) {
                                    i14 = AndroidUtilities.dp(68.0f);
                                }
                                a2.f5797s += i14;
                                orCreateStoryViewer.C(context, id2, z6Var, a2);
                            } else {
                                return;
                            }
                        }
                    } else if (view instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) view).a();
                    }
                }
                t1();
            }
        }
    }

    public final boolean K() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xv0.K():boolean");
    }

    public final boolean K0(MessageObject messageObject, View view, int i10, boolean z10) {
        ss0 ss0Var;
        char c10;
        int i11;
        int i12;
        final TL_stories.StoryItem storyItem;
        fu0 fu0Var;
        ci.z6 z6Var;
        if (!this.C1) {
            org.telegram.ui.ActionBar.o2 o2Var = this.f32711v1;
            if (o2Var.getParentActivity() != null && messageObject != null && ((ss0Var = this.W) == null || !ss0Var.f38040w)) {
                AndroidUtilities.hideKeyboard(o2Var.getParentActivity().getCurrentFocus());
                long j10 = this.f32686j1;
                int i13 = 8;
                if (z10 && ((z0(getClosestTab()) || getClosestTab() == 8) && !this.C1)) {
                    if (view instanceof org.telegram.ui.Cells.s7) {
                        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                        s7Var.k(s7Var.f23275n, s7Var.f23280r, true);
                    }
                    TL_stories.StoryItem storyItem2 = messageObject.storyItem;
                    if (storyItem2 != null) {
                        HashSet hashSet = new HashSet();
                        ArrayList<Integer> arrayList = storyItem2.albums;
                        if (arrayList != null) {
                            hashSet.addAll(arrayList);
                        }
                        boolean z02 = z0(getClosestTab());
                        j80 I = j80.I(o2Var, view);
                        j80 J = I.J();
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.vt0(I, 26), false);
                        J.k();
                        j80.f(J, getStoriesController().B(j10, true), hashSet, true, new lg(this, storyItem2, I, 20), new ci.y2(this, hashSet, storyItem2, I, 10));
                        I.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddToAlbum), new gi.g2(I, J, 9), false);
                        I.k();
                        I.c(R.drawable.msg_select, LocaleController.getString(R.string.StoriesAlbumMenuSelect), new ai.db(this, messageObject, view, i10, 26), false);
                        if (z02) {
                            int k12 = k1(getClosestTab());
                            String w9 = getStoriesController().w(k12, j10);
                            I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new d2(this, k12, 11), false);
                            storyItem = storyItem2;
                            I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.StoriesAlbumMenuRemoveFromAlbum), new ai.db(this, k12, storyItem, w9, 27), false);
                        } else {
                            storyItem = storyItem2;
                            if (getClosestTab() == 8 && (fu0Var = this.f32666c0) != null && (z6Var = fu0Var.f31223s) != null) {
                                if (z6Var.m(storyItem.f20577id)) {
                                    I.c(R.drawable.chats_unpin, LocaleController.getString(R.string.StoriesAlbumMenuUnpin), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r1) {
                                                case 0:
                                                    xv0 xv0Var = this;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xv0Var.getContext(), 0, xv0Var.F1);
                                                    alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                    alertDialog$Builder.f20678a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new bs0(xv0Var, storyItem));
                                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ud0(18));
                                                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                                                    c2Var.show();
                                                    c2Var.i();
                                                    return;
                                                case 1:
                                                    xv0 xv0Var2 = this;
                                                    xv0Var2.getClass();
                                                    xv0Var2.W0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20577id))), false);
                                                    return;
                                                case 2:
                                                    xv0 xv0Var3 = this;
                                                    xv0Var3.getClass();
                                                    xv0Var3.W0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20577id))), true);
                                                    return;
                                                default:
                                                    xv0.h(this, storyItem);
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
                                                    xv0 xv0Var = this;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xv0Var.getContext(), 0, xv0Var.F1);
                                                    alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                    alertDialog$Builder.f20678a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new bs0(xv0Var, storyItem));
                                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ud0(18));
                                                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                                                    c2Var.show();
                                                    c2Var.i();
                                                    return;
                                                case 1:
                                                    xv0 xv0Var2 = this;
                                                    xv0Var2.getClass();
                                                    xv0Var2.W0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20577id))), false);
                                                    return;
                                                case 2:
                                                    xv0 xv0Var3 = this;
                                                    xv0Var3.getClass();
                                                    xv0Var3.W0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20577id))), true);
                                                    return;
                                                default:
                                                    xv0.h(this, storyItem);
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
                                            xv0 xv0Var = this;
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xv0Var.getContext(), 0, xv0Var.F1);
                                            alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                            alertDialog$Builder.f20678a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new bs0(xv0Var, storyItem));
                                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ud0(18));
                                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                                            c2Var.show();
                                            c2Var.i();
                                            return;
                                        case 1:
                                            xv0 xv0Var2 = this;
                                            xv0Var2.getClass();
                                            xv0Var2.W0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20577id))), false);
                                            return;
                                        case 2:
                                            xv0 xv0Var3 = this;
                                            xv0Var3.getClass();
                                            xv0Var3.W0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20577id))), true);
                                            return;
                                        default:
                                            xv0.h(this, storyItem);
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
                                        xv0 xv0Var = this;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xv0Var.getContext(), 0, xv0Var.F1);
                                        alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                        alertDialog$Builder.f20678a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new bs0(xv0Var, storyItem));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ud0(18));
                                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                                        c2Var.show();
                                        c2Var.i();
                                        return;
                                    case 1:
                                        xv0 xv0Var2 = this;
                                        xv0Var2.getClass();
                                        xv0Var2.W0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20577id))), false);
                                        return;
                                    case 2:
                                        xv0 xv0Var3 = this;
                                        xv0Var3.getClass();
                                        xv0Var3.W0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20577id))), true);
                                        return;
                                    default:
                                        xv0.h(this, storyItem);
                                        return;
                                }
                            }
                        }, true);
                        I.f27562i = 3;
                        I.f27582u = true;
                        I.v = true;
                        I.L = true;
                        I.M = 3;
                        Point point = AndroidUtilities.displaySize;
                        Point point2 = AndroidUtilities.displaySize;
                        int min = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point2.x, point2.y) * 0.4333f) * 3.0f) / 4.0f));
                        I.N = min;
                        I.O = (min * 4) / 3;
                        I.f27581t = true;
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
                    SparseArray[] sparseArrayArr = this.Z0;
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.f32660a1++;
                    }
                    if (this.f32660a1 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    this.f32689l0.setVisibility(i11);
                    org.telegram.ui.ActionBar.u0 u0Var = this.f32708u0;
                    if (u0Var != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        } else {
                            i12 = 8;
                        }
                        u0Var.setVisibility(i12);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var2 = this.f32706t0;
                    if (u0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i13 = 0;
                        }
                        u0Var2.setVisibility(i13);
                    }
                    this.A0.a(1, false);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    int i14 = 0;
                    while (true) {
                        ArrayList arrayList3 = this.N0;
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
                    this.f32663b1 = false;
                    if (view instanceof org.telegram.ui.Cells.k7) {
                        ((org.telegram.ui.Cells.k7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.t7) {
                        ((org.telegram.ui.Cells.t7) view).b(i10, true, true);
                    } else if (view instanceof org.telegram.ui.Cells.n7) {
                        ((org.telegram.ui.Cells.n7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) view).e(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.e2) {
                        ((org.telegram.ui.Cells.e2) view).c(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.s7) {
                        ((org.telegram.ui.Cells.s7) view).i(true, true);
                    }
                    if (!this.C1) {
                        e1(true);
                    }
                    G0(sparseArrayArr[0]);
                    t1();
                    return true;
                }
            }
        }
        return false;
    }

    public final void L() {
        us usVar = this.P0;
        if (usVar != null) {
            ss0 ss0Var = this.W;
            float f7 = 0.0f;
            if (ss0Var != null) {
                f7 = 0.0f + (ss0Var.getVisibilityFactor() * AndroidUtilities.dp(38.0f) * (1.0f - Math.abs(ss0Var.getTranslationX() / ss0Var.getMeasuredWidth())));
            }
            usVar.setTranslationY(this.L1 + f7);
        }
    }

    public boolean L0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return false;
    }

    public final boolean M(boolean z10) {
        SparseArray[] sparseArrayArr;
        if (!this.C1) {
            return false;
        }
        int i10 = 1;
        while (true) {
            sparseArrayArr = this.Z0;
            if (i10 < 0) {
                break;
            }
            sparseArrayArr[i10].clear();
            i10--;
        }
        this.f32660a1 = 0;
        G0(sparseArrayArr[0]);
        ms0 ms0Var = this.U;
        if (ms0Var != null) {
            ms0Var.h();
            ms0Var.j();
        }
        e1(false);
        w1(z10);
        hv0 hv0Var = this.R;
        if (hv0Var != null) {
            hv0Var.f27062w.clear();
        }
        return true;
    }

    public final void M0(float f7) {
        qu0 qu0Var;
        int i10;
        int i11;
        qu0 qu0Var2;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        qu0[] qu0VarArr = this.f32687k0;
        if (i12 != 0 || qu0VarArr[1].getVisibility() == 0) {
            if (this.f32682h1) {
                qu0VarArr[0].setTranslationX((-f7) * qu0Var2.getMeasuredWidth());
                qu0VarArr[1].setTranslationX(qu0VarArr[0].getMeasuredWidth() - (qu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                qu0VarArr[0].setTranslationX(qu0Var.getMeasuredWidth() * f7);
                qu0VarArr[1].setTranslationX((qu0VarArr[0].getMeasuredWidth() * f7) - qu0VarArr[0].getMeasuredWidth());
            }
            P0(getTabProgress());
            float b02 = b0(f7);
            this.f32696p0 = b02;
            int i13 = 4;
            if (b02 != 0.0f && E() && !s0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            this.f32701r0.setVisibility(i10);
            org.telegram.ui.ActionBar.u0 u0Var = this.f32692n0;
            if (u0Var != null && !E()) {
                if (y0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                u0Var.setVisibility(i11);
                this.f32694o0 = 0.0f;
            } else {
                this.f32694o0 = c0(f7);
                y1();
            }
            u1(false);
            if (i12 == 0) {
                qu0 qu0Var3 = qu0VarArr[0];
                qu0VarArr[0] = qu0VarArr[1];
                qu0VarArr[1] = qu0Var3;
                qu0Var3.setVisibility(8);
                if (u0Var != null && this.f32716x0 == 2) {
                    if (y0()) {
                        i13 = 8;
                    }
                    u0Var.setVisibility(i13);
                }
                this.f32716x0 = 0;
                i1();
            }
        }
    }

    public boolean O() {
        return this instanceof h40;
    }

    public void O0() {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (!y0() && !s0()) {
            z10 = false;
        } else {
            z10 = true;
        }
        sv0 sv0Var = this.f32672e0.f31224w;
        if (sv0Var != null) {
            if (z10 && getClosestTab() == 9) {
                z13 = true;
            } else {
                z13 = false;
            }
            sv0Var.b(z13);
        }
        sv0 sv0Var2 = this.f32666c0.f31224w;
        if (sv0Var2 != null) {
            if (z10 && getClosestTab() == 8) {
                z12 = true;
            } else {
                z12 = false;
            }
            sv0Var2.b(z12);
        }
        for (wv0 wv0Var : this.Z1.values()) {
            vv0 vv0Var = wv0Var.f32357c;
            if (vv0Var.f31223s != null) {
                sv0 sv0Var3 = vv0Var.f31224w;
                if (z10 && getClosestTab() == wv0Var.f32355a) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                sv0Var3.b(z11);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.f32692n0;
        if (u0Var != null) {
            kt0 kt0Var = this.J0;
            if (kt0Var != null && kt0Var.a() && getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            u0Var.setSearchFieldHint(LocaleController.getString(i10));
        }
        J();
    }

    public final boolean P(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x10 = (-view.getX()) - getX();
        qu0[] qu0VarArr = this.f32687k0;
        motionEvent.offsetLocation(x10 - qu0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - qu0VarArr[0].getY()) - qu0VarArr[0].h.getFastScroll().getY());
        return qu0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public void P0(float f7) {
        H0();
    }

    public void Q(Canvas canvas, float f7, Rect rect, Paint paint) {
        canvas.drawRect(rect, paint);
    }

    public final void R(Canvas canvas, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            qu0[] qu0VarArr = this.f32687k0;
            if (i10 < qu0VarArr.length) {
                qu0 qu0Var = qu0VarArr[i10];
                if (qu0Var != null && qu0Var.getVisibility() == 0) {
                    for (int i11 = 0; i11 < qu0VarArr[i10].h.getChildCount(); i11++) {
                        View childAt = qu0VarArr[i10].h.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + qu0VarArr[i10].h.Y2) {
                            int save = canvas.save();
                            canvas.translate(childAt.getX() + qu0VarArr[i10].getX(), childAt.getY() + qu0VarArr[i10].h.getY() + qu0VarArr[i10].getY() + getY());
                            childAt.draw(canvas);
                            if (arrayList != null && (childAt instanceof lw0)) {
                                arrayList.add((lw0) childAt);
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

    public final void R0(org.telegram.ui.ActionBar.o2 o2Var, long j10, int i10) {
        new org.telegram.ui.o61(o2Var, j10, this.f32690m1[1], new ai.k4(this, j10, i10)).show();
    }

    public final boolean S(int i10) {
        mv0[] mv0VarArr = this.f32709u1.f29677n;
        if (mv0VarArr == null) {
            return false;
        }
        mv0[] mv0VarArr2 = this.f32707t1;
        if (i10 == 0) {
            mv0 mv0Var = mv0VarArr2[i10];
            if (!mv0Var.h) {
                int[] iArr = mv0Var.f28760f;
                int[] iArr2 = mv0VarArr[i10].f28760f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = mv0VarArr2[i10].f28760f;
            int[] iArr4 = mv0VarArr[i10].f28760f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        mv0VarArr2[i10].f28757a.addAll(mv0VarArr[i10].f28757a);
        mv0VarArr2[i10].f28759c.addAll(mv0VarArr[i10].f28759c);
        for (Map.Entry entry : mv0VarArr[i10].d.entrySet()) {
            mv0VarArr2[i10].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i11 = 0; i11 < 2; i11++) {
            mv0VarArr2[i10].f28758b[i11] = mv0VarArr[i10].f28758b[i11].clone();
            mv0 mv0Var2 = mv0VarArr2[i10];
            int[] iArr5 = mv0Var2.f28763j;
            mv0 mv0Var3 = mv0VarArr[i10];
            iArr5[i11] = mv0Var3.f28763j[i11];
            mv0Var2.f28762i[i11] = mv0Var3.f28762i[i11];
        }
        mv0VarArr2[i10].e.addAll(mv0VarArr[i10].e);
        return !mv0VarArr[i10].f28757a.isEmpty();
    }

    public final void S0(org.telegram.ui.ActionBar.o2 o2Var, long j10, int i10) {
        f5.v0(o2Var, LocaleController.getString(R.string.Delete), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesAlbumMenuDeleteAlbumAsk, getStoriesController().w(i10, j10))), LocaleController.getString(R.string.Delete), true, new ai.ac(this, j10, i10, 8));
    }

    public final void T(int i10, mm0 mm0Var, boolean z10) {
        ArrayList arrayList = this.f32707t1[i10].e;
        int L0 = ((s4.b0) mm0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            vu0 vu0Var = null;
            if (arrayList != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (L0 <= ((vu0) arrayList.get(i11)).f32055b) {
                        vu0Var = (vu0) arrayList.get(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                if (vu0Var == null) {
                    vu0Var = (vu0) i2.o1.i(1, arrayList);
                }
            }
            if (vu0Var != null) {
                B0(i10, vu0Var.d, vu0Var.f32055b + 1, z10);
            }
        }
    }

    public final void T0(org.telegram.ui.ActionBar.o2 o2Var, long j10, int i10) {
        String w9 = getStoriesController().w(i10, j10);
        Context context = o2Var.getContext();
        org.telegram.ui.ActionBar.g6 resourceProvider = o2Var.getResourceProvider();
        j2.c cVar = new j2.c(this, j10, i10, 6);
        Pattern pattern = f5.f26167a;
        f5.R(context, o2Var, LocaleController.getString(R.string.StoriesAlbumRename), LocaleController.getString(R.string.StoriesAlbumRenameHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), w9, 12, LocaleController.getString(R.string.Rename), resourceProvider, cVar);
    }

    public final void U() {
        qu0[] qu0VarArr;
        qu0 qu0Var;
        boolean z10;
        int i10;
        s4.g0 adapter;
        if (this.f32695o1) {
            int i11 = 0;
            while (true) {
                qu0VarArr = this.f32687k0;
                if (i11 < qu0VarArr.length) {
                    qu0Var = qu0VarArr[i11];
                    if (qu0Var.F == this.f32697p1) {
                        break;
                    }
                    i11++;
                } else {
                    qu0Var = null;
                    break;
                }
            }
            if (qu0Var != null) {
                boolean r02 = r0(qu0Var.F);
                float f7 = this.f32693n1;
                float f10 = 1.0f;
                int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                mv0[] mv0VarArr = this.f32707t1;
                if (i12 == 0) {
                    this.f32695o1 = false;
                    int i13 = this.f32699q1;
                    int[] iArr = this.f32690m1;
                    iArr[r02 ? 1 : 0] = i13;
                    if (!r02) {
                        SharedConfig.setMediaColumnsCount(i13);
                    } else if (d0(qu0Var.F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(this.f32699q1);
                    }
                    for (int i14 = 0; i14 < qu0VarArr.length; i14++) {
                        qu0 qu0Var2 = qu0VarArr[i14];
                        if (qu0Var2 != null && qu0Var2.h != null && (((i10 = qu0Var2.F) == 0 || r0(i10)) && (adapter = qu0VarArr[i14].h.getAdapter()) != null)) {
                            int h = adapter.h();
                            if (i14 == 0) {
                                mv0VarArr[0].g(false);
                            }
                            qu0VarArr[i14].f30004r.setVisibility(8);
                            qu0VarArr[i14].f30007x.y1(iArr[r02 ? 1 : 0]);
                            qu0VarArr[i14].h.a0();
                            qu0VarArr[i14].h.invalidate();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(qu0VarArr[i14].h);
                            } else {
                                adapter.l();
                            }
                        }
                    }
                    if (this.f32703s >= 0) {
                        for (int i15 = 0; i15 < qu0VarArr.length; i15++) {
                            qu0 qu0Var3 = qu0VarArr[i15];
                            if (qu0Var3.F == this.f32697p1) {
                                View m10 = qu0Var3.f30005s.m(this.f32703s);
                                if (m10 != null) {
                                    this.v = m10.getTop();
                                }
                                qu0 qu0Var4 = qu0VarArr[i15];
                                qu0Var4.f30007x.h1(this.f32703s, (-qu0Var4.h.getPaddingTop()) + this.v);
                            }
                        }
                        return;
                    }
                    a1();
                } else if (f7 == 0.0f) {
                    this.f32695o1 = false;
                    if (this.f32697p1 == 0) {
                        mv0VarArr[0].g(false);
                    }
                    qu0Var.f30004r.setVisibility(8);
                    qu0Var.h.invalidate();
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
                    ofFloat.addUpdateListener(new mt0(this, qu0Var, 0));
                    ofFloat.addListener(new org.telegram.ui.vi(this, z10, r02 ? 1 : 0, qu0Var));
                    ofFloat.setInterpolator(bs.f25133f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                }
            }
        }
    }

    public final void U0(String str) {
        boolean shouldShowUrlInAlert = AndroidUtilities.shouldShowUrlInAlert(str);
        org.telegram.ui.ActionBar.o2 o2Var = this.f32711v1;
        if (shouldShowUrlInAlert) {
            f5.q0(o2Var, str, true, true);
        } else {
            pf.d.r(o2Var.getParentActivity(), str);
        }
    }

    public final void V(int i10) {
        ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i10 == 0) {
            if (!AndroidUtilities.isTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 2) {
                this.A0.setTextSize(18);
            } else {
                this.A0.setTextSize(20);
            }
        }
        if (i10 == 0) {
            this.H.l();
        }
    }

    public int V0() {
        return -1;
    }

    public final String W(boolean z10) {
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        ms0 ms0Var;
        if (!t0()) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        if (z10 && (ms0Var = this.U) != null) {
            return ms0Var.getBotPreviewsSubtitle();
        }
        fu0 fu0Var = this.f32666c0;
        if (fu0Var != null && fu0Var.f31223s != null) {
            i10 = 0;
            i11 = 0;
            for (int i12 = 0; i12 < fu0Var.f31223s.f6193i.size(); i12++) {
                MessageObject messageObject = (MessageObject) fu0Var.f31223s.f6193i.get(i12);
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

    public final void W0(ArrayList arrayList, boolean z10) {
        boolean z11;
        boolean z12;
        fu0 fu0Var = this.f32666c0;
        if (fu0Var != null && fu0Var.f31223s != null) {
            org.telegram.ui.ActionBar.o2 o2Var = this.f32711v1;
            if (z10 && arrayList.size() > o2Var.getMessagesController().storiesPinnedToTopCountMax) {
                xc.a0(o2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", o2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
                return;
            }
            ci.z6 z6Var = fu0Var.f31223s;
            int i10 = z6Var.f6190c;
            ArrayList arrayList2 = z6Var.f6192g;
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
                    tL_togglePinnedToTop.f20590id.addAll(arrayList2);
                    tL_togglePinnedToTop.peer = MessagesController.getInstance(i10).getInputPeer(z6Var.d);
                    ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new ci.d6(2));
                }
                z13 = z11;
            }
            if (z13) {
                xc.a0(o2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", o2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
            } else if (z10) {
                xc.a0(o2Var).M(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinned", arrayList.size(), new Object[0])), LocaleController.formatPluralString("StoriesPinnedText", arrayList.size(), new Object[0]), R.raw.ic_pin).j();
            } else {
                xc.a0(o2Var).Q(R.raw.ic_unpin, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesUnpinned", arrayList.size(), new Object[0]))).j();
            }
        }
    }

    public final qu0 X(int i10) {
        int i11 = 0;
        while (true) {
            qu0[] qu0VarArr = this.f32687k0;
            if (i11 < qu0VarArr.length) {
                qu0 qu0Var = qu0VarArr[i11];
                if (qu0Var != null && qu0Var.F == i10) {
                    return qu0Var;
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    public final boolean X0(MotionEvent motionEvent, boolean z10) {
        int i10;
        qu0 qu0Var;
        ms0 ms0Var;
        int i11;
        int i12;
        int closestTab = getClosestTab();
        nt0 nt0Var = this.I0;
        SparseIntArray sparseIntArray = nt0Var.O;
        int i13 = nt0Var.f24507n;
        int i14 = -1;
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i15 = sparseIntArray.get(i13 + i10, -1);
        ss0 ss0Var = this.W;
        if (ss0Var != null) {
            if (!z0(closestTab) && closestTab != 8) {
                if (z0(i15) || i15 == 8) {
                    i14 = ss0Var.getCurrentAlbumId();
                }
            } else {
                k91 k91Var = ss0Var.f38037n;
                SparseIntArray sparseIntArray2 = k91Var.f27963b0;
                int i16 = k91Var.F;
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
                i15 = l1(i14).f32355a;
            }
        }
        if (i15 >= 0) {
            org.telegram.ui.ActionBar.u0 u0Var = this.f32692n0;
            if (u0Var != null && !E()) {
                if (y0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                u0Var.setVisibility(i11);
                this.f32694o0 = 0.0f;
            } else {
                this.f32694o0 = c0(0.0f);
                x1(0.0f);
            }
            if ((!this.V0 || getSelectedTab() != 11) && (!D() || !this.C1 || (getClosestTab() != 8 && !z0(getClosestTab())))) {
                qu0[] qu0VarArr = this.f32687k0;
                qu0 qu0Var2 = qu0VarArr[0];
                if (qu0Var2 != null && qu0Var2.F == 13 && (ms0Var = this.U) != null) {
                    di.a aVar = ms0Var.f8079n;
                    if (!z10) {
                    }
                }
                qu0 qu0Var3 = qu0VarArr[0];
                ns0 ns0Var = this.V;
                if (qu0Var3 != null && qu0Var3.F == 14 && ns0Var != null) {
                    yh.u1 u1Var = ns0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.C1 || (qu0Var = qu0VarArr[0]) == null || qu0Var.F != 13) && ((ns0Var == null || !ns0Var.g()) && (ss0Var == null || !ss0Var.f38040w))) {
                    u1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    m0();
                    this.f32720y1 = false;
                    this.f32717x1 = true;
                    Q0(true);
                    this.f32722z1 = (int) motionEvent.getX();
                    this.G.setEnabled(false);
                    nt0Var.setEnabled(false);
                    qu0 qu0Var4 = qu0VarArr[1];
                    qu0Var4.F = i15;
                    qu0Var4.setVisibility(0);
                    this.f32682h1 = z10;
                    p1(true);
                    if (z10) {
                        qu0VarArr[1].setTranslationX(qu0VarArr[0].getMeasuredWidth());
                    } else {
                        qu0VarArr[1].setTranslationX(-qu0VarArr[0].getMeasuredWidth());
                    }
                    P0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    public final int Y(int i10, int i11, boolean z10) {
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
        return Utilities.clamp(i14, 9, (this.f32688k1 && i10 == 1) ? 2 : 2);
    }

    public final int Z(boolean z10) {
        int i10;
        int i11 = this.Y1;
        if (z10) {
            i10 = AndroidUtilities.dp(52.0f);
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public final void Z0(s4.g0 g0Var) {
        if (g0Var instanceof rv0) {
            ArrayList arrayList = this.E0;
            ArrayList arrayList2 = this.F0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        } else if (g0Var == this.M) {
            ArrayList arrayList3 = this.G0;
            ArrayList arrayList4 = this.H0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
        } else {
            ev0 ev0Var = this.N;
            if (g0Var == ev0Var) {
                ev0Var.f26083r = null;
            }
        }
    }

    public final int a0(int i10) {
        int i11;
        int e02 = e0(i10) + AndroidUtilities.dp(54.0f) + this.f32668c2;
        if (i10 == 9) {
            i11 = AndroidUtilities.dp(64.0f);
        } else {
            i11 = 0;
        }
        return e02 + i11;
    }

    public final void a1() {
        int i10;
        int i11 = 0;
        while (true) {
            qu0[] qu0VarArr = this.f32687k0;
            if (i11 < qu0VarArr.length) {
                ws0 ws0Var = qu0VarArr[i11].h;
                if (ws0Var != null) {
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < ws0Var.getChildCount(); i14++) {
                        View childAt = ws0Var.getChildAt(i14);
                        if (childAt instanceof org.telegram.ui.Cells.s7) {
                            org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) childAt;
                            int messageId = s7Var.getMessageId();
                            i13 = s7Var.getTop();
                            i12 = messageId;
                        }
                        if (childAt instanceof org.telegram.ui.Cells.k7) {
                            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) childAt;
                            int id2 = k7Var.getMessage().getId();
                            i13 = k7Var.getTop();
                            i12 = id2;
                        }
                        if (childAt instanceof org.telegram.ui.Cells.j7) {
                            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) childAt;
                            i12 = j7Var.getMessage().getId();
                            i13 = j7Var.getTop();
                        }
                        if (i12 != 0) {
                            break;
                        }
                    }
                    if (i12 != 0) {
                        int i15 = qu0VarArr[i11].F;
                        int i16 = -1;
                        if (r0(i15)) {
                            uv0 n12 = n1(i15);
                            if (n12 != null && n12.f31223s != null) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= n12.f31223s.f6193i.size()) {
                                        break;
                                    } else if (i12 == ((MessageObject) n12.f31223s.f6193i.get(i17)).getId()) {
                                        i16 = i17;
                                        break;
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                            i10 = i16;
                        } else if (i15 >= 0) {
                            mv0[] mv0VarArr = this.f32707t1;
                            if (i15 < mv0VarArr.length) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= mv0VarArr[i15].f28757a.size()) {
                                        break;
                                    } else if (i12 == ((MessageObject) mv0VarArr[i15].f28757a.get(i18)).getId()) {
                                        i16 = i18;
                                        break;
                                    } else {
                                        i18++;
                                    }
                                }
                                i10 = mv0VarArr[i15].f28766m + i16;
                            }
                        }
                        if (i16 >= 0) {
                            ((s4.b0) ws0Var.getLayoutManager()).h1(i10, (-qu0VarArr[i11].h.getPaddingTop()) + i13);
                            if (this.f32695o1) {
                                qu0 qu0Var = qu0VarArr[i11];
                                qu0Var.f30005s.h1(i10, (-qu0Var.h.getPaddingTop()) + i13);
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
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Lh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21183d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Kh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21588z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ih));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21571y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21346m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21509uh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21184d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21554x7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21480t7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21536w7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21317kd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21540wc));
    }

    @Override
    public final boolean b() {
        return false;
    }

    public final float b0(float f7) {
        int i10;
        int i11;
        int i12;
        int i13;
        float f10 = 0.0f;
        if (s0()) {
            return 0.0f;
        }
        qu0[] qu0VarArr = this.f32687k0;
        qu0 qu0Var = qu0VarArr[1];
        ns0 ns0Var = this.V;
        if (qu0Var != null && ((i12 = qu0Var.F) == 0 || (((i12 == 8 || z0(i12)) && TextUtils.isEmpty(getStoriesHashtag())) || (i13 = qu0VarArr[1].F) == 9 || i13 == 11 || i13 == 13 || (i13 == 14 && ns0Var != null)))) {
            f10 = 0.0f + f7;
        }
        qu0 qu0Var2 = qu0VarArr[0];
        if (qu0Var2 != null && ((i10 = qu0Var2.F) == 0 || (((i10 == 8 || z0(i10)) && TextUtils.isEmpty(getStoriesHashtag())) || (i11 = qu0VarArr[0].F) == 9 || i11 == 11 || i11 == 13 || (i11 == 14 && ns0Var != null)))) {
            return (1.0f - f7) + f10;
        }
        return f10;
    }

    public final void b1(int i10) {
        nt0 nt0Var;
        if (!this.M1 && (nt0Var = this.I0) != null) {
            nt0Var.g(null, i10, nt0Var.P.get(i10));
        }
    }

    public final float c0(float f7) {
        float f10 = 0.0f;
        if (s0()) {
            return 0.0f;
        }
        qu0[] qu0VarArr = this.f32687k0;
        qu0 qu0Var = qu0VarArr[1];
        if (qu0Var != null && v0(qu0Var.F) && qu0VarArr[1].F != 11) {
            f10 = 0.0f + f7;
        }
        qu0 qu0Var2 = qu0VarArr[0];
        if (qu0Var2 != null && v0(qu0Var2.F) && qu0VarArr[0].F != 11) {
            return (1.0f - f7) + f10;
        }
        return f10;
    }

    public final void c1(float f7, int i10) {
        int i11;
        nt0 nt0Var = this.I0;
        if (nt0Var != null) {
            if (z0(i10)) {
                i11 = 8;
            } else {
                i11 = i10;
            }
            nt0Var.i(f7, i11);
        }
        ss0 ss0Var = this.W;
        if (ss0Var != null) {
            k91 k91Var = ss0Var.f38037n;
            if (z0(i10)) {
                k91Var.f(f7, k1(i10));
            } else if (i10 == 8) {
                k91Var.f(f7, 0);
            }
        }
    }

    public final int d0(int i10) {
        uv0 n12;
        ci.z6 z6Var;
        if (r0(i10) && (n12 = n1(i10)) != null && (z6Var = n12.f31223s) != null) {
            return z6Var.g();
        }
        return 0;
    }

    public final void d1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i10 = 0;
        while (true) {
            qu0[] qu0VarArr = this.f32687k0;
            if (i10 < qu0VarArr.length) {
                qu0 qu0Var = qu0VarArr[i10];
                if (qu0Var.F != 7 || qu0Var.h.getAdapter() == null || qu0VarArr[i10].h.getAdapter().h() == 0 || this.f32711v1.getMessagesController().getStoriesController().f5405j.size() <= 0) {
                    i10++;
                } else {
                    return;
                }
            } else {
                if (this.F == 0) {
                    hu0 hu0Var = this.f32659a0;
                    hu0Var.d = chatFull;
                    hu0Var.e = arrayList;
                }
                A1(true);
                for (int i11 = 0; i11 < qu0VarArr.length; i11++) {
                    qu0 qu0Var2 = qu0VarArr[i11];
                    if (qu0Var2.F == 7 && qu0Var2.h.getAdapter() != null) {
                        AndroidUtilities.notifyDataSetChanged(qu0VarArr[i11].h);
                    }
                }
                return;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r42, int r43, java.lang.Object... r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xv0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        nt0 nt0Var = this.I0;
        if (nt0Var != null) {
            canvas.save();
            canvas.translate(nt0Var.getX(), nt0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        jt0 jt0Var = this.R0;
        if (jt0Var != null) {
            int i10 = jt0Var.U;
            if ((i10 == 3 || i10 == 1) && this.P0 == null) {
                canvas.save();
                canvas.translate(jt0Var.getX(), jt0Var.getY());
                jt0Var.setDrawOverlay(true);
                jt0Var.draw(canvas);
                jt0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i10;
        if (view == this.R0 && this.P0 == null) {
            canvas.save();
            qu0[] qu0VarArr = this.f32687k0;
            float top = qu0VarArr[0].getTop();
            ss0 ss0Var = this.W;
            if (ss0Var != null && ((i10 = qu0VarArr[0].F) == 8 || z0(i10))) {
                top -= ss0Var.getVisualHeight();
            }
            canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + AndroidUtilities.dp(12.0f));
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void e(org.telegram.ui.Cells.q2 q2Var) {
        int i10;
        org.telegram.ui.ActionBar.o2 o2Var = this.f32711v1;
        if (o2Var != null && o2Var.getMessagesController().getStoriesController().I(q2Var.getDialogId())) {
            o2Var.getOrCreateStoryViewer().getClass();
            ci.z9 orCreateStoryViewer = o2Var.getOrCreateStoryViewer();
            Context context = o2Var.getContext();
            long dialogId = q2Var.getDialogId();
            ci.q7 a2 = ci.q7.a((mm0) q2Var.getParent());
            if ((o2Var instanceof ProfileActivity) && ((ProfileActivity) o2Var).f34017t1) {
                i10 = AndroidUtilities.dp(68.0f);
            } else {
                i10 = 0;
            }
            a2.f5797s += i10;
            orCreateStoryViewer.D(context, dialogId, a2);
        }
    }

    public final int e0(int i10) {
        float f7;
        ss0 ss0Var = this.W;
        if (ss0Var != null && (z0(i10) || i10 == 8)) {
            f7 = ss0Var.getVisibilityFactor() * AndroidUtilities.dp(40.0f);
        } else {
            f7 = 0.0f;
        }
        return (int) f7;
    }

    public void e1(boolean z10) {
        float f7;
        if (this.C1 != z10) {
            this.C1 = z10;
            AnimatorSet animatorSet = this.O1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ha haVar = this.B0;
            if (z10) {
                haVar.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.O1 = animatorSet2;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(haVar, View.ALPHA, f7));
            this.O1.setDuration(180L);
            this.O1.addListener(new org.telegram.ui.ho(20, this, z10));
            this.O1.start();
            if (z10) {
                z1();
            }
        }
    }

    public final void f1(int r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xv0.f1(int, boolean):void");
    }

    public final void g1(int i10) {
        int k12 = k1(getClosestTab());
        ss0 ss0Var = this.W;
        if (k12 != i10) {
            if (ss0Var != null) {
                ss0Var.f38037n.d(i10, ss0Var.f38039s.i(i10));
                return;
            }
            return;
        }
        ss0Var.setReorderingAlbums(true);
        wv0 l1 = l1(i10);
        qu0 X = X(l1.f32355a);
        if (X == null) {
            return;
        }
        ws0 ws0Var = X.h;
        for (int i11 = 0; i11 < ws0Var.getChildCount(); i11++) {
            View childAt = ws0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.s7) {
                ((org.telegram.ui.Cells.s7) childAt).l(true, true);
            }
        }
        vv0 vv0Var = l1.f32357c;
        if (vv0Var != null && !vv0Var.f31225x) {
            vv0Var.f31225x = true;
        }
        u1(true);
    }

    public SparseArray<MessageObject> getActionModeSelected() {
        return this.Z0[0];
    }

    public float getBottomButtonStoriesVisibility() {
        qu0 qu0Var;
        qu0 qu0Var2;
        boolean z10;
        boolean z11;
        ci.z6 z6Var;
        ci.z6 z6Var2;
        float f7 = 1.0f;
        qu0[] qu0VarArr = this.f32687k0;
        if (qu0VarArr == null || (qu0Var = qu0VarArr[0]) == null || (qu0Var2 = qu0VarArr[1]) == null || qu0Var.f30006w == null || qu0Var2.f30006w == null) {
            return 1.0f;
        }
        int i10 = qu0Var.F;
        int i11 = qu0Var2.F;
        if (!z0(i10) && i10 != 8) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z0(i11) && i11 != 8) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z10 && !z11) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - qu0VarArr[0].f30006w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - qu0VarArr[1].f30006w.getVisibilityFactor();
        uv0 n12 = n1(qu0VarArr[0].F);
        if (i10 == 8 || (n12 != null && (z6Var2 = n12.f31223s) != null && z6Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        uv0 n13 = n1(i11);
        if (i11 != 8 && (n13 == null || (z6Var = n13.f31223s) == null || z6Var.g() <= 0)) {
            f7 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f7;
        }
        if (!z11) {
            f7 = visibilityFactor;
        }
        return AndroidUtilities.lerp(visibilityFactor, f7, Math.abs(qu0VarArr[0].getTranslationX() / qu0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        qu0[] qu0VarArr = this.f32687k0;
        qu0 qu0Var = qu0VarArr[1];
        if (qu0Var != null && qu0Var.getVisibility() == 0) {
            if (this.f32680g1 && !this.f32684i1) {
                return qu0VarArr[1].F;
            }
            if (Math.abs(qu0VarArr[1].getTranslationX()) < qu0VarArr[1].getMeasuredWidth() / 2.0f) {
                return qu0VarArr[1].F;
            }
        }
        return getSelectedTab();
    }

    public mm0 getCurrentListView() {
        du0 du0Var;
        qu0 qu0Var = this.f32687k0[0];
        int i10 = qu0Var.F;
        if (i10 == 13) {
            return this.U.getCurrentListView();
        }
        if (i10 == 14) {
            return this.V.getCurrentListView();
        }
        if (i10 == 12 && (du0Var = this.T) != null) {
            return du0Var.f42477a.f41737x0;
        }
        return qu0Var.h;
    }

    public int getInitialTab() {
        return 0;
    }

    public int getPhotosVideosTypeFilter() {
        return this.f32707t1[0].f28770q;
    }

    public TextView getSaveItem() {
        return this.f32698q0;
    }

    public org.telegram.ui.ActionBar.u0 getSearchItem() {
        return this.f32692n0;
    }

    public bk0 getSearchOptionsItem() {
        return this.f32704s0;
    }

    public int getSelectedTab() {
        int currentTabId = this.I0.getCurrentTabId();
        ss0 ss0Var = this.W;
        if (ss0Var != null && currentTabId == 8) {
            int currentAlbumId = ss0Var.getCurrentAlbumId();
            if (currentAlbumId == 0) {
                return 8;
            }
            if (currentAlbumId > 0) {
                return l1(currentAlbumId).f32355a;
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
            qu0[] qu0VarArr = this.f32687k0;
            if (i10 < qu0VarArr.length) {
                qu0 qu0Var = qu0VarArr[i10];
                if (qu0Var != null) {
                    f7 = ((1.0f - Math.abs(qu0Var.getTranslationX() / getWidth())) * qu0Var.F) + f7;
                }
                i10++;
            } else {
                return f7;
            }
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21588z6));
        int i10 = org.telegram.ui.ActionBar.k6.f21590z8;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f32689l0, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        org.telegram.ui.ActionBar.u0 u0Var = this.f32708u0;
        if (u0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f32706t0;
        if (u0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        }
        Drawable[] drawableArr = {this.D0};
        int i11 = org.telegram.ui.ActionBar.k6.f21573y8;
        ImageView imageView = this.C0;
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 8, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.B0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21183d6));
        int i12 = org.telegram.ui.ActionBar.k6.Gh;
        nt0 nt0Var = this.I0;
        arrayList.add(new org.telegram.ui.ActionBar.t6(nt0Var, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(nt0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Fh));
        arrayList.add(new org.telegram.ui.ActionBar.t6(nt0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Eh));
        arrayList.add(new org.telegram.ui.ActionBar.t6(nt0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Hh));
        jt0 jt0Var = this.R0;
        if (jt0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(jt0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21517v7));
            arrayList.add(new org.telegram.ui.ActionBar.t6(jt0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21500u7));
            arrayList.add(new org.telegram.ui.ActionBar.t6(jt0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21572y7));
            arrayList.add(new org.telegram.ui.ActionBar.t6(jt0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.A7));
        }
        final int i13 = 0;
        while (true) {
            qu0[] qu0VarArr = this.f32687k0;
            if (i13 < qu0VarArr.length) {
                org.telegram.ui.ActionBar.s6 s6Var = new org.telegram.ui.ActionBar.s6() {
                    @Override
                    public final void b() {
                        qu0[] qu0VarArr2 = xv0.this.f32687k0;
                        int i14 = i13;
                        ws0 ws0Var = qu0VarArr2[i14].h;
                        if (ws0Var != null) {
                            int childCount = ws0Var.getChildCount();
                            for (int i15 = 0; i15 < childCount; i15++) {
                                View childAt = qu0VarArr2[i14].h.getChildAt(i15);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                                    for (int i16 = 0; i16 < 6; i16++) {
                                        t7Var.f23704a[i16].e.invalidate();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.i6) {
                                    ((org.telegram.ui.Cells.i6) childAt).u(0);
                                } else if (childAt instanceof org.telegram.ui.Cells.wa) {
                                    ((org.telegram.ui.Cells.wa) childAt).i(0);
                                }
                            }
                        }
                    }

                    @Override
                    public final void a(float f7) {
                    }
                };
                arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21462s8));
                arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21272i6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].f30006w, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21165c7));
                int i14 = org.telegram.ui.ActionBar.k6.f21255h6;
                arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.wa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.f21366n6));
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.O7));
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.P7));
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.Q7));
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.R7));
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.S7));
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.T7));
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.U7));
                int i15 = org.telegram.ui.ActionBar.k6.f21273i7;
                arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i15));
                int i16 = org.telegram.ui.ActionBar.k6.f21311k7;
                arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 8, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.zi));
                arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 8192, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 16384, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 8192, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 16384, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 8192, new Class[]{org.telegram.ui.Cells.t7.class}, (Paint) null, (Drawable[]) null, s6Var, i15));
                arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 16384, new Class[]{org.telegram.ui.Cells.t7.class}, (Paint) null, (Drawable[]) null, s6Var, i16));
                arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.e2.class}, new String[]{"backgroundPaint"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Lh));
                arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 8192, new Class[]{org.telegram.ui.Cells.e2.class}, (Paint) null, (Drawable[]) null, s6Var, i15));
                arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 16384, new Class[]{org.telegram.ui.Cells.e2.class}, (Paint) null, (Drawable[]) null, s6Var, i16));
                arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].h, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f32719y0}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21145b7));
                arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].f30006w.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(qu0VarArr[i13].f30006w.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21571y6));
                i13++;
            } else {
                return arrayList;
            }
        }
    }

    public final float h0(int i10, boolean z10) {
        float width = getWidth();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            qu0[] qu0VarArr = this.f32687k0;
            if (i11 >= qu0VarArr.length) {
                break;
            }
            qu0 qu0Var = qu0VarArr[i11];
            if (qu0Var != null) {
                int i13 = qu0Var.F;
                if ((z10 && i10 == 8 && z0(i13)) || i13 == i10) {
                    i12++;
                    width = qu0VarArr[i11].getTranslationX();
                }
            }
            i11++;
        }
        if (i12 == 2) {
            return 0.0f;
        }
        return width;
    }

    public final void h1(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xv0.h1(boolean):void");
    }

    public final float i0(int i10, boolean z10) {
        float f7 = 0.0f;
        int i11 = 0;
        while (true) {
            qu0[] qu0VarArr = this.f32687k0;
            if (i11 < qu0VarArr.length) {
                qu0 qu0Var = qu0VarArr[i11];
                if (qu0Var != null) {
                    int i12 = qu0Var.F;
                    if ((z10 && i10 == 8 && z0(i12)) || i12 == i10) {
                        f7 = (1.0f - Math.abs(qu0VarArr[i11].getTranslationX() / getWidth())) + f7;
                    }
                }
                i11++;
            } else {
                return f7;
            }
        }
    }

    public final void i1() {
        int i10 = 0;
        while (true) {
            qu0[] qu0VarArr = this.f32687k0;
            if (i10 < qu0VarArr.length) {
                int childCount = qu0VarArr[i10].h.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = qu0VarArr[i10].h.getChildAt(i11);
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

    public final int j0(int i10) {
        org.telegram.ui.ActionBar.g6 g6Var = this.F1;
        if (g6Var != null) {
            return g6Var.g(i10);
        }
        return org.telegram.ui.ActionBar.k6.x0(null, i10, false);
    }

    public final void j1(MotionEvent motionEvent) {
        float f7;
        float f10;
        boolean z10;
        float measuredWidth;
        qu0 qu0Var;
        qu0 qu0Var2;
        int measuredWidth2;
        qu0 qu0Var3;
        qu0 qu0Var4;
        boolean z11;
        VelocityTracker velocityTracker = this.B1;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.S0);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f7 = this.B1.getXVelocity();
                f10 = this.B1.getYVelocity();
                if (!this.f32717x1 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                    if (f7 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    X0(motionEvent, z11);
                }
            } else {
                f7 = 0.0f;
                f10 = 0.0f;
            }
            if (this.f32717x1) {
                qu0[] qu0VarArr = this.f32687k0;
                float x10 = qu0VarArr[0].getX();
                this.f32677f1 = new AnimatorSet();
                if (Math.abs(x10) < qu0VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f32684i1 = z10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new d80(this, 20));
                boolean z12 = this.f32684i1;
                Property property = View.TRANSLATION_X;
                if (z12) {
                    measuredWidth = Math.abs(x10);
                    if (this.f32682h1) {
                        this.f32677f1.playTogether(ObjectAnimator.ofFloat(qu0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(qu0VarArr[1], property, qu0Var4.getMeasuredWidth()), ofFloat);
                    } else {
                        this.f32677f1.playTogether(ObjectAnimator.ofFloat(qu0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(qu0VarArr[1], property, -qu0Var3.getMeasuredWidth()), ofFloat);
                    }
                } else {
                    measuredWidth = qu0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                    if (this.f32682h1) {
                        this.f32677f1.playTogether(ObjectAnimator.ofFloat(qu0VarArr[0], property, -qu0Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(qu0VarArr[1], property, 0.0f), ofFloat);
                    } else {
                        this.f32677f1.playTogether(ObjectAnimator.ofFloat(qu0VarArr[0], property, qu0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(qu0VarArr[1], property, 0.0f), ofFloat);
                    }
                }
                this.f32677f1.setInterpolator(f32657h2);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs = Math.abs(f7);
                if (abs > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                this.f32677f1.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                this.f32677f1.addListener(new qt0(this, 1));
                this.f32677f1.start();
                this.f32680g1 = true;
                this.f32717x1 = false;
                O0();
            } else {
                this.f32720y1 = false;
                this.G.setEnabled(true);
                this.I0.setEnabled(true);
            }
            VelocityTracker velocityTracker2 = this.B1;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.B1 = null;
            }
        }
    }

    public final boolean k0() {
        if (this.f32711v1.getConnectionsManager().getConnectionState() == 3) {
            return true;
        }
        return false;
    }

    public final int k1(int i10) {
        wv0 m12 = m1(i10);
        if (m12 == null) {
            return -1;
        }
        return m12.f32356b;
    }

    public final boolean l0() {
        SparseArray[] sparseArrayArr;
        MessageObject messageObject;
        TLRPC.Message message;
        boolean z10 = false;
        for (int i10 = 1; i10 >= 0; i10--) {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            while (true) {
                sparseArrayArr = this.Z0;
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

    public final wv0 l1(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.Z1;
        wv0 wv0Var = (wv0) hashMap.get(valueOf);
        if (wv0Var == null) {
            wv0 wv0Var2 = new wv0(this, getContext(), i10);
            hashMap.put(Integer.valueOf(i10), wv0Var2);
            this.a2.put(Integer.valueOf(wv0Var2.f32355a), Integer.valueOf(i10));
            return wv0Var2;
        }
        return wv0Var;
    }

    public final void m0() {
        AndroidUtilities.cancelRunOnUIThread(this.M0);
        org.telegram.ui.Cells.v0 v0Var = this.K0;
        if (v0Var.getTag() == null) {
            return;
        }
        v0Var.setTag(null);
        AnimatorSet animatorSet = this.L0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.L0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.L0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.L0.playTogether(ObjectAnimator.ofFloat(v0Var, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(v0Var, View.TRANSLATION_Y, (-AndroidUtilities.dp(48.0f)) + this.O0));
        this.L0.setInterpolator(bs.f25134g);
        this.L0.addListener(new qt0(this, 0));
        this.L0.start();
    }

    public final wv0 m1(int i10) {
        Integer num = (Integer) this.a2.get(Integer.valueOf(i10));
        if (num == null) {
            return null;
        }
        return (wv0) this.Z1.get(num);
    }

    public boolean n0() {
        return false;
    }

    public final uv0 n1(int i10) {
        wv0 m12;
        if (i10 == 8) {
            return this.f32666c0;
        }
        if (i10 == 9) {
            return this.f32672e0;
        }
        if (z0(i10) && (m12 = m1(i10)) != null) {
            return m12.f32357c;
        }
        return null;
    }

    public boolean o0() {
        return !(this instanceof h40);
    }

    public final uv0 o1(int i10) {
        wv0 m12;
        if (i10 == 8) {
            return this.f32669d0;
        }
        if (i10 == 9) {
            return this.f32676f0;
        }
        if (!z0(i10) || (m12 = m1(i10)) == null) {
            return null;
        }
        return m12.d;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i10 = 0;
        while (true) {
            qu0[] qu0VarArr = this.f32687k0;
            if (i10 < qu0VarArr.length) {
                ws0 ws0Var = qu0VarArr[i10].h;
                if (ws0Var != null) {
                    ws0Var.getViewTreeObserver().addOnPreDrawListener(new tt0(this, i10, 0));
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!K() && !this.I0.H && !onTouchEvent(motionEvent)) {
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
        ju0 ju0Var = this.D1;
        if (ju0Var.f() != null) {
            i12 = ju0Var.f().getHeight();
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
            } else if (childAt instanceof qu0) {
                i13 = i10;
                measureChildWithMargins(childAt, i13, 0, View.MeasureSpec.makeMeasureSpec(i12, 1073741824), 0);
                ws0 ws0Var = ((qu0) childAt).h;
                ws0Var.setPadding(0, ws0Var.Z2, 0, ws0Var.f27257a3);
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
        if (!this.M1) {
            org.telegram.ui.ActionBar.o2 o2Var = this.f32711v1;
            if (o2Var.getParentLayout() != null && !((ActionBarLayout) o2Var.getParentLayout()).i() && !K() && !this.f32658a) {
                if (motionEvent != null) {
                    if (this.B1 == null) {
                        this.B1 = VelocityTracker.obtain();
                    }
                    this.B1.addMovement(motionEvent);
                    r40 r40Var = this.E1;
                    if (r40Var != null) {
                        r40Var.b(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.f32717x1 && !this.f32720y1 && motionEvent.getY() >= AndroidUtilities.dp(90.0f)) {
                    this.f32714w1 = motionEvent.getPointerId(0);
                    this.f32720y1 = true;
                    this.f32722z1 = (int) motionEvent.getX();
                    this.A1 = (int) motionEvent.getY();
                    this.B1.clear();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f32714w1) {
                    int x10 = (int) (motionEvent.getX() - this.f32722z1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.A1);
                    boolean z13 = this.f32717x1;
                    qu0[] qu0VarArr = this.f32687k0;
                    if (z13 && (((z10 = this.f32682h1) && x10 > 0) || (!z10 && x10 < 0))) {
                        if (x10 < 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!X0(motionEvent, z11)) {
                            this.f32720y1 = true;
                            this.f32717x1 = false;
                            Q0(false);
                            qu0VarArr[0].setTranslationX(0.0f);
                            qu0 qu0Var = qu0VarArr[1];
                            if (this.f32682h1) {
                                i11 = qu0VarArr[0].getMeasuredWidth();
                            } else {
                                i11 = -qu0VarArr[0].getMeasuredWidth();
                            }
                            qu0Var.setTranslationX(i11);
                            c1(0.0f, qu0VarArr[1].F);
                            P0(getTabProgress());
                        }
                    }
                    if (this.f32720y1 && !this.f32717x1) {
                        if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                            if (x10 < 0) {
                                z12 = true;
                            }
                            X0(motionEvent, z12);
                        }
                    } else if (this.f32717x1) {
                        qu0VarArr[0].setTranslationX(x10);
                        if (this.f32682h1) {
                            qu0VarArr[1].setTranslationX(qu0VarArr[0].getMeasuredWidth() + x10);
                        } else {
                            qu0VarArr[1].setTranslationX(x10 - qu0VarArr[0].getMeasuredWidth());
                        }
                        float abs2 = Math.abs(x10) / qu0VarArr[0].getMeasuredWidth();
                        if (!E()) {
                            this.f32694o0 = 0.0f;
                        } else {
                            this.f32694o0 = c0(abs2);
                            x1(abs2);
                            float b02 = b0(abs2);
                            this.f32696p0 = b02;
                            if (b02 != 0.0f && E() && !s0()) {
                                i10 = 0;
                            } else {
                                i10 = 4;
                            }
                            this.f32701r0.setVisibility(i10);
                        }
                        u1(false);
                        c1(abs2, qu0VarArr[1].F);
                        P0(getTabProgress());
                        O0();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f32714w1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    j1(motionEvent);
                }
                return this.f32717x1;
            }
        }
        return false;
    }

    public final void p0(ViewGroup viewGroup) {
        qu0[] qu0VarArr;
        for (qu0 qu0Var : this.f32687k0) {
            ws0 ws0Var = qu0Var.h;
            Objects.requireNonNull(ws0Var);
            qu0Var.f30003n = new bh.l(ws0Var, viewGroup, new fq0(ws0Var, 1));
        }
        ns0 ns0Var = this.V;
        if (ns0Var != null) {
            ns0Var.T = viewGroup;
            ns0Var.S = new ei.m7(ns0Var, 1);
        }
    }

    public final void p1(boolean r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xv0.p1(boolean):void");
    }

    public final void q1() {
        try {
            int j02 = j0(org.telegram.ui.ActionBar.k6.f21573y8);
            int j03 = j0(org.telegram.ui.ActionBar.k6.f21590z8);
            if (j02 != this.f32674e2 || j03 != this.f32678f2) {
                this.f32674e2 = j02;
                this.f32678f2 = j03;
                org.telegram.ui.ActionBar.u0[] u0VarArr = {this.f32708u0, this.f32706t0, this.f32710v0, this.f32713w0, this.f32689l0};
                for (int i10 = 0; i10 < 5; i10++) {
                    org.telegram.ui.ActionBar.u0 u0Var = u0VarArr[i10];
                    if (u0Var != null) {
                        u0Var.setIconColor(j02);
                        if (u0Var.getBackground() != null) {
                            org.telegram.ui.ActionBar.k6.E1(u0Var.getBackground(), j03, true);
                        }
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void r1() {
        cu0 cu0Var = this.H;
        if (cu0Var != null) {
            cu0Var.l();
        }
        kv0 kv0Var = this.K;
        if (kv0Var != null) {
            kv0Var.l();
        }
        kv0 kv0Var2 = this.L;
        if (kv0Var2 != null) {
            kv0Var2.l();
        }
        lv0 lv0Var = this.J;
        if (lv0Var != null) {
            lv0Var.X(false);
        }
        kv0 kv0Var3 = this.M;
        if (kv0Var3 != null) {
            kv0Var3.l();
        }
        ev0 ev0Var = this.N;
        if (ev0Var != null) {
            ev0Var.l();
        }
        lu0 lu0Var = this.O;
        if (lu0Var != null) {
            lu0Var.l();
        }
        fu0 fu0Var = this.f32666c0;
        if (fu0Var != null) {
            fu0Var.l();
        }
        for (wv0 wv0Var : this.Z1.values()) {
            wv0Var.f32357c.l();
        }
    }

    public boolean s0() {
        return false;
    }

    public final void s1(qu0 qu0Var, boolean z10) {
        boolean z11;
        Integer num = 1;
        int i10 = 0;
        if (qu0Var.f30000b && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        tl0 fastScroll = qu0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = qu0Var.f30001c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            qu0Var.f30001c.cancel();
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
            qu0Var.f30001c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(num);
        } else if (!z11 && fastScroll.getTag() != null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, property, fastScroll.getAlpha(), 0.0f);
            ofFloat2.addListener(new org.telegram.ui.ho(fastScroll));
            qu0Var.f30001c = ofFloat2;
            ofFloat2.setDuration(150L).start();
            fastScroll.animate().setListener(null).cancel();
            fastScroll.setTag(null);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        boolean z10;
        int i10;
        TLRPC.ChatFull chatFull2 = this.f32670d1;
        if (chatFull2 != null && chatFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32670d1 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.f32667c1 == 0) {
                this.f32667c1 = -j10;
                int i11 = 0;
                while (true) {
                    mv0[] mv0VarArr = this.f32707t1;
                    if (i11 >= mv0VarArr.length) {
                        break;
                    }
                    if (mv0VarArr[i11].f28758b[1].size() == 0) {
                        mv0 mv0Var = mv0VarArr[i11];
                        mv0Var.f28763j[1] = this.f32670d1.migrated_from_max_id;
                        mv0Var.f28762i[1] = false;
                    }
                    i11++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.f32670d1;
        if (chatFull3 != null && z10 != chatFull3.stories_pinned_available) {
            nt0 nt0Var = this.I0;
            if (nt0Var != null) {
                if (s0()) {
                    i10 = 9;
                } else {
                    i10 = 8;
                }
                nt0Var.setInitialTabId(i10);
            }
            A1(true);
            p1(false);
        }
    }

    public void setCommonGroupsCount(int i10) {
        if (this.F == 0) {
            this.X0[6] = i10;
        }
        A1(true);
        G();
    }

    public void setForwardRestrictedHint(r40 r40Var) {
        this.E1 = r40Var;
    }

    public void setMergeDialogId(long j10) {
        this.f32667c1 = j10;
    }

    public void setNewMediaCounts(int[] iArr) {
        int[] iArr2;
        int i10 = 0;
        while (true) {
            iArr2 = this.X0;
            if (i10 > 6 || iArr2[i10] >= 0) {
                break;
            }
            i10++;
        }
        System.arraycopy(iArr, 0, iArr2, 0, 6);
        A1(true);
        G();
        if (iArr2[0] >= 0) {
            C0(false);
        }
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.L1 = i11;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            qu0[] qu0VarArr = this.f32687k0;
            if (i15 >= qu0VarArr.length) {
                break;
            }
            qu0VarArr[i15].setTranslationY(this.L1);
            i15++;
        }
        if (this.P0 != null) {
            L();
        } else {
            jt0 jt0Var = this.R0;
            if (jt0Var != null) {
                jt0Var.setTranslationY(AndroidUtilities.dp(48.0f) + i11);
            }
        }
        this.O0 = i11;
        org.telegram.ui.Cells.v0 v0Var = this.K0;
        if (v0Var.getTag() == null) {
            i14 = -AndroidUtilities.dp(48.0f);
        }
        v0Var.setTranslationY(i14 + this.O0);
    }

    public void setPagesPaddingBottom(int i10) {
        if (this.Y1 != i10) {
            this.Y1 = i10;
            qu0[] qu0VarArr = this.f32687k0;
            if (qu0VarArr != null) {
                for (qu0 qu0Var : qu0VarArr) {
                    if (qu0Var != null) {
                        ws0 ws0Var = qu0Var.h;
                        int paddingLeft = ws0Var.getPaddingLeft();
                        ws0 ws0Var2 = qu0Var.h;
                        int i11 = ws0Var2.Z2;
                        int paddingRight = ws0Var2.getPaddingRight();
                        ws0 ws0Var3 = qu0Var.h;
                        int Z = Z(y0());
                        ws0Var3.f29672f3 = Z;
                        ws0Var.setPadding(paddingLeft, i11, paddingRight, Z);
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
                qu0[] qu0VarArr = this.f32687k0;
                if (i10 < qu0VarArr.length) {
                    s1(qu0VarArr[i10], true);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        boolean z10;
        TLRPC.UserFull userFull2 = this.f32673e1;
        if (userFull2 != null && userFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32673e1 = userFull;
        A1(true);
        if (userFull != null && z10 != userFull.stories_pinned_available) {
            b1(8);
        }
    }

    public void setVisibleHeight(int i10) {
        float f7;
        this.N1 = i10;
        int i11 = 0;
        while (true) {
            qu0[] qu0VarArr = this.f32687k0;
            if (i11 >= qu0VarArr.length) {
                break;
            }
            int measuredHeight = getMeasuredHeight();
            if (qu0VarArr[i11].F == 8) {
                f7 = 280.0f;
            } else {
                f7 = 120.0f;
            }
            float f10 = (-(measuredHeight - Math.max(i10, AndroidUtilities.dp(f7)))) / 2.0f;
            qu0VarArr[i11].f30006w.setTranslationY(f10);
            qu0VarArr[i11].v.setTranslationY(-f10);
            i11++;
        }
        ms0 ms0Var = this.U;
        if (ms0Var != null) {
            ms0Var.setVisibleHeight(i10);
        }
        ns0 ns0Var = this.V;
        if (ns0Var != null) {
            ns0Var.setVisibleHeight(i10);
        }
    }

    public final boolean t0() {
        TLRPC.User user;
        long j10 = this.f32686j1;
        if (j10 <= 0 || (user = MessagesController.getInstance(this.f32711v1.getCurrentAccount()).getUser(Long.valueOf(j10))) == null || !user.bot) {
            return false;
        }
        return true;
    }

    public final void t1() {
        boolean z10;
        float f7;
        org.telegram.ui.ActionBar.u0 u0Var = this.f32706t0;
        if (u0Var != null) {
            if (!this.f32711v1.getMessagesController().isPeerNoForwards(this.f32686j1) && !l0()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                f7 = 0.5f;
            } else {
                f7 = 1.0f;
            }
            u0Var.setAlpha(f7);
            if (z10 && u0Var.getBackground() != null) {
                u0Var.setBackground(null);
            } else if (!z10 && u0Var.getBackground() == null) {
                int i10 = org.telegram.ui.ActionBar.k6.f21590z8;
                org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(j0(i10), 5, -1);
                org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
                u0Var.setBackground(g02);
                org.telegram.ui.ActionBar.r6.k(u0Var, g02, null, O, this.F1);
            }
        }
    }

    public final boolean u0() {
        org.telegram.ui.ActionBar.o2 o2Var;
        if (this.f32670d1 != null && (o2Var = this.f32711v1) != null) {
            return ChatObject.isChannelAndNotMegaGroup(o2Var.getMessagesController().getChat(Long.valueOf(this.f32670d1.f20344id)));
        }
        return false;
    }

    public final void u1(boolean z10) {
        ns0 ns0Var;
        ss0 ss0Var;
        bk0 bk0Var = this.f32704s0;
        if (bk0Var == null) {
            return;
        }
        float f7 = 0.0f;
        if (!this.V0 && (((ns0Var = this.V) == null || !ns0Var.g()) && ((ss0Var = this.W) == null || !ss0Var.f38040w))) {
            f7 = Utilities.clamp(this.f32694o0 + this.f32696p0, 1.0f, 0.0f);
        }
        bk0Var.setAlpha(f7);
        boolean z11 = false;
        if (z10) {
            if (b0(1.0f) > 0.5f) {
                z11 = true;
            }
            A(z11, true);
        } else if (this.f32716x0 == 2) {
            if (this.f32696p0 > 0.1f) {
                z11 = true;
            }
            A(z11, true);
        } else {
            if (this.f32694o0 < 0.1f) {
                z11 = true;
            }
            A(z11, true);
        }
    }

    @Override
    public final void updateColors() {
        try {
            this.G1.a(j0(org.telegram.ui.ActionBar.k6.f21183d6));
            org.telegram.ui.ActionBar.h2 h2Var = this.D0;
            if (h2Var != null) {
                h2Var.a(j0(org.telegram.ui.ActionBar.k6.f21573y8));
            }
            NumberTextView numberTextView = this.A0;
            if (numberTextView != null) {
                numberTextView.setTextColor(j0(org.telegram.ui.ActionBar.k6.f21573y8));
            }
            q1();
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final boolean v0(int i10) {
        if (i10 == 7) {
            return this.D1.T();
        }
        if (!w0() && i10 != 0 && !r0(i10) && i10 != 2 && i10 != 5 && i10 != 6 && i10 != 11 && i10 != 10 && i10 != 13 && i10 != 14) {
            return true;
        }
        return false;
    }

    public final void v1(qu0 qu0Var) {
        boolean z10;
        float f7;
        int i10;
        float f10;
        float f11;
        int i11 = qu0Var.F;
        if (i11 != 0 && !r0(i11)) {
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
        FrameLayout.LayoutParams d = w7.z5.d(-1, -1.0f, 119, f7, f12, f10, f11);
        d.topMargin = e0(qu0Var.F) + d.topMargin;
        ViewGroup.LayoutParams layoutParams = qu0Var.v.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.leftMargin == d.leftMargin && layoutParams2.topMargin == d.topMargin && layoutParams2.rightMargin == d.rightMargin && layoutParams2.bottomMargin == d.bottomMargin && layoutParams2.gravity == d.gravity) {
                return;
            }
        }
        qu0Var.v.setLayoutParams(d);
    }

    public final SpannableStringBuilder w() {
        if (this.X1 == null) {
            this.X1 = new SpannableStringBuilder();
            if (t0()) {
                this.X1.append((CharSequence) LocaleController.getString(R.string.ProfileBotPreviewEmptyButton));
            } else {
                this.X1.append((CharSequence) "c");
                this.X1.setSpan(new xq(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.X1.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
            }
        }
        return this.X1;
    }

    public boolean w0() {
        if (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) {
            return false;
        }
        return true;
    }

    public final void w1(boolean z10) {
        int i10 = 0;
        while (true) {
            qu0[] qu0VarArr = this.f32687k0;
            if (i10 < qu0VarArr.length) {
                int childCount = qu0VarArr[i10].h.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = qu0VarArr[i10].h.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.k7) {
                        ((org.telegram.ui.Cells.k7) childAt).b(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.s7) {
                        ((org.telegram.ui.Cells.s7) childAt).i(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.n7) {
                        ((org.telegram.ui.Cells.n7) childAt).f(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) childAt).e(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.e2) {
                        ((org.telegram.ui.Cells.e2) childAt).c(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.q2) {
                        ((org.telegram.ui.Cells.q2) childAt).U(false, z10);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void x(j80 j80Var, org.telegram.ui.ActionBar.o2 o2Var, long j10, int i10) {
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
        a1.g.A(sb2, MessagesController.getInstance(o2Var.getCurrentAccount()).linkPrefix, "/", publicUsername, "/a/");
        sb2.append(i10);
        j80Var.c(R.drawable.media_share, LocaleController.getString(R.string.StoriesAlbumMenuShareLink), new lg(this, sb2.toString(), o2Var, 21), false);
    }

    public boolean x0() {
        return false;
    }

    public final void x1(float f7) {
        org.telegram.ui.ActionBar.u0 u0Var = this.m0;
        if (u0Var == null) {
            return;
        }
        qu0[] qu0VarArr = this.f32687k0;
        qu0 qu0Var = qu0VarArr[1];
        float f10 = 0.0f;
        if (qu0Var != null && qu0Var.F == 11) {
            f10 = 0.0f + f7;
        }
        int i10 = 0;
        qu0 qu0Var2 = qu0VarArr[0];
        if (qu0Var2 != null && qu0Var2.F == 11) {
            f10 += 1.0f - f7;
        }
        u0Var.setAlpha(f10);
        float f11 = (0.15f * f10) + 0.85f;
        u0Var.setScaleX(f11);
        u0Var.setScaleY(f11);
        if (f10 <= 0.01f) {
            i10 = 8;
        }
        u0Var.setVisibility(i10);
    }

    public final void y(org.telegram.ui.Components.j80 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xv0.y(org.telegram.ui.Components.j80):void");
    }

    public boolean y0() {
        return false;
    }

    public final void y1() {
        float f7;
        float f10;
        org.telegram.ui.ActionBar.u0 u0Var = this.m0;
        if (u0Var == null) {
            return;
        }
        boolean z10 = true;
        qu0 qu0Var = this.f32687k0[1];
        if (qu0Var == null || qu0Var.F != 11) {
            z10 = false;
        }
        if (z10) {
            u0Var.setVisibility(0);
        }
        ViewPropertyAnimator animate = u0Var.animate();
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
        scaleX.scaleY(f11).withEndAction(new b60(3, this, z10)).setDuration(420L).setInterpolator(bs.h).start();
    }

    public final void z(pu0 pu0Var, int i10, SparseBooleanArray sparseBooleanArray) {
        int childCount = pu0Var.getChildCount();
        b10 b10Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = pu0Var.getChildAt(i11);
            if (childAt instanceof b10) {
                b10Var = childAt;
            }
        }
        if (b10Var != null) {
            pu0Var.removeView(b10Var);
        }
        getViewTreeObserver().addOnPreDrawListener(new st0(this, pu0Var, sparseBooleanArray, b10Var, i10));
    }

    public final void z1() {
        boolean z10;
        int i10;
        ci.z6 z6Var;
        boolean t02 = t0();
        org.telegram.ui.ActionBar.u0 u0Var = this.f32713w0;
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f32710v0;
        int i11 = 8;
        if (t02) {
            if (u0Var2 != null) {
                u0Var2.setVisibility(8);
            }
            if (u0Var != null) {
                u0Var.setVisibility(8);
            }
        } else if (getClosestTab() == 9) {
            if (u0Var2 != null) {
                u0Var2.setVisibility(8);
            }
            if (u0Var != null) {
                u0Var.setVisibility(8);
            }
        } else if (getClosestTab() == 8) {
            int i12 = 0;
            while (true) {
                SparseArray[] sparseArrayArr = this.Z0;
                if (i12 < sparseArrayArr[0].size()) {
                    MessageObject messageObject = (MessageObject) sparseArrayArr[0].valueAt(i12);
                    fu0 fu0Var = this.f32666c0;
                    if (fu0Var != null && (z6Var = fu0Var.f31223s) != null && !z6Var.m(messageObject.getId())) {
                        z10 = true;
                        break;
                    }
                    i12++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (u0Var2 != null) {
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                u0Var2.setVisibility(i10);
            }
            if (u0Var != null) {
                if (!z10) {
                    i11 = 0;
                }
                u0Var.setVisibility(i11);
            }
        } else if (z0(getClosestTab())) {
            if (u0Var2 != null) {
                u0Var2.setVisibility(8);
            }
            if (u0Var != null) {
                u0Var.setVisibility(8);
            }
        }
    }

    public void G0(SparseArray sparseArray) {
    }

    public void H0() {
    }

    public void N0(boolean z10) {
    }

    public void Q0(boolean z10) {
    }

    public int Y0(int i10) {
        return i10;
    }

    @Override
    public final void a(org.telegram.ui.Cells.q2 q2Var) {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void d(org.telegram.ui.Cells.q2 q2Var) {
    }

    @Override
    public final void f(org.telegram.ui.Cells.q2 q2Var) {
    }

    public void q0() {
    }
}
