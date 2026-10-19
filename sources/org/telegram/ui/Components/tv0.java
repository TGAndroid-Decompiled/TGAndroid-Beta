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
public abstract class tv0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Cells.n2 {
    public static final int[] f30682d2 = {0, 1, 2, 4};
    public static final fs0 f30683e2 = new fs0(0);
    public final NumberTextView A0;
    public int A1;
    public final ha B0;
    public VelocityTracker B1;
    public final ImageView C0;
    public boolean C1;
    public final org.telegram.ui.ActionBar.g2 D0;
    public final fu0 D1;
    public final int E;
    public final ArrayList E0;
    public r40 E1;
    public final long F;
    public final ArrayList F0;
    public final org.telegram.ui.ActionBar.d6 F1;
    public final org.telegram.ui.ActionBar.k G;
    public final ArrayList G0;
    public final NotificationCenter.ObserversGroup G1;
    public final yt0 H;
    public final ArrayList H0;
    public boolean H1;
    public final nv0 I;
    public final jt0 I0;
    public final AnimationNotificationsLocker I1;
    public final hv0 J;
    public final gt0 J0;
    public org.telegram.ui.i4 J1;
    public final gv0 K;
    public final org.telegram.ui.Cells.w0 K0;
    public int K1;
    public final gv0 L;
    public AnimatorSet L0;
    public boolean L1;
    public final gv0 M;
    public final nr0 M0;
    public int M1;
    public final av0 N;
    public final ArrayList N0;
    public AnimatorSet N1;
    public final hu0 O;
    public float O0;
    public final SparseArray O1;
    public final eu0 P;
    public final us P0;
    public long P1;
    public final cu0 Q;
    public final FrameLayout Q0;
    public boolean Q1;
    public final dv0 R;
    public final ft0 R0;
    public int R1;
    public final ev0 S;
    public final int S0;
    public final qt0 S1;
    public final zt0 T;
    public final Paint T0;
    public ci.a7 T1;
    public final is0 U;
    public boolean U0;
    public float U1;
    public final js0 V;
    public boolean V0;
    public boolean V1;
    public final os0 W;
    public ah.i1 W0;
    public SpannableStringBuilder W1;
    public final int[] X0;
    public int X1;
    public int Y0;
    public final HashMap Y1;
    public final SparseArray[] Z0;
    public final HashMap Z1;
    public boolean f30684a;
    public final du0 f30685a0;
    public int f30686a1;
    public int a2;
    public boolean f30687b;
    public final s4.y f30688b0;
    public boolean f30689b1;
    public int f30690b2;
    public boolean f30691c;
    public final bu0 f30692c0;
    public long f30693c1;
    public final kh f30694c2;
    public boolean d;
    public final qv0 f30695d0;
    public TLRPC.ChatFull f30696d1;
    public int e;
    public final hs0 f30697e0;
    public TLRPC.UserFull f30698e1;
    public int f30699f;
    public final qv0 f30700f0;
    public AnimatorSet f30701f1;
    public final pu0 f30702g0;
    public boolean f30703g1;
    public float h;
    public final pu0 f30704h0;
    public boolean f30705h1;
    public final pu0 f30706i0;
    public boolean f30707i1;
    public final ku0 f30708j0;
    public final long f30709j1;
    public final mu0[] f30710k0;
    public boolean f30711k1;
    public final org.telegram.ui.ActionBar.u0 f30712l0;
    public boolean l1;
    public final org.telegram.ui.ActionBar.u0 m0;
    public final int[] f30713m1;
    public float f30714n;
    public final org.telegram.ui.ActionBar.u0 f30715n0;
    public float f30716n1;
    public float f30717o0;
    public boolean f30718o1;
    public float f30719p0;
    public int f30720p1;
    public final TextView f30721q0;
    public int f30722q1;
    public boolean f30723r;
    public final ImageView f30724r0;
    public final ts0 f30725r1;
    public int f30726s;
    public final xj0 f30727s0;
    public float f30728s1;
    public final org.telegram.ui.ActionBar.u0 f30729t0;
    public final iv0[] f30730t1;
    public final org.telegram.ui.ActionBar.u0 f30731u0;
    public final lv0 f30732u1;
    public int v;
    public final org.telegram.ui.ActionBar.u0 f30733v0;
    public final org.telegram.ui.ActionBar.n2 f30734v1;
    public int f30735w;
    public final org.telegram.ui.ActionBar.u0 f30736w0;
    public int f30737w1;
    public final Rect f30738x;
    public int f30739x0;
    public boolean f30740x1;
    public final b10 f30741y;
    public final Drawable f30742y0;
    public boolean f30743y1;
    public boolean f30744z0;
    public int f30745z1;

    public tv0(android.content.Context r40, long r41, org.telegram.ui.Components.lv0 r43, int r44, java.util.ArrayList r45, org.telegram.tgnet.TLRPC.ChatFull r46, org.telegram.tgnet.TLRPC.UserFull r47, int r48, int r49, org.telegram.ui.ActionBar.n2 r50, org.telegram.ui.Components.fu0 r51, int r52, org.telegram.ui.ActionBar.d6 r53, bh.b r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tv0.<init>(android.content.Context, long, org.telegram.ui.Components.lv0, int, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.tgnet.TLRPC$UserFull, int, int, org.telegram.ui.ActionBar.n2, org.telegram.ui.Components.fu0, int, org.telegram.ui.ActionBar.d6, bh.b):void");
    }

    public static gu0 M(int i10, long j10, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        gu0 gu0Var = new gu0(context, d6Var);
        TextView textView = gu0Var.f26690a;
        if (i10 == 0) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoMediaSecret));
                return gu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoMedia));
            return gu0Var;
        } else if (i10 == 1) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedFilesSecret));
                return gu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedFiles));
            return gu0Var;
        } else if (i10 == 2) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedVoiceSecret));
                return gu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedVoice));
            return gu0Var;
        } else if (i10 == 3) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedLinksSecret));
                return gu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedLinks));
            return gu0Var;
        } else if (i10 == 4) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedAudioSecret));
                return gu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedAudio));
            return gu0Var;
        } else if (i10 == 5) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedGifSecret));
                return gu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoGIFs));
            return gu0Var;
        } else {
            ImageView imageView = gu0Var.f26691b;
            if (i10 == 6) {
                imageView.setImageDrawable(null);
                textView.setText(LocaleController.getString(R.string.NoGroupsInCommon));
                return gu0Var;
            }
            if (i10 == 7) {
                imageView.setImageDrawable(null);
                textView.setText("");
            }
            return gu0Var;
        }
    }

    public static void d(tv0 tv0Var, int i10, TL_stories.StoryItem storyItem, String str) {
        org.telegram.ui.i4 i4Var = new org.telegram.ui.i4(tv0Var, i10, storyItem, 16);
        ci.i7 storiesController = tv0Var.getStoriesController();
        long j10 = tv0Var.f30709j1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.c0(i10, j10, arrayList);
        xc.a0(tv0Var.f30734v1).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", 1, str)), LocaleController.getString(R.string.UndoNoCaps), i4Var).j();
    }

    public static TLRPC.ProfileTab e0(int i10, boolean z10) {
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

    public static int f0(TLRPC.ProfileTab profileTab) {
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

    public ci.i7 getStoriesController() {
        return MessagesController.getInstance(this.f30734v1.getCurrentAccount()).getStoriesController();
    }

    public static void h(tv0 tv0Var, TL_stories.StoryItem storyItem) {
        tv0Var.getStoriesController().o0(tv0Var.f30709j1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        xc.a0(tv0Var.f30734v1).G(R.raw.chats_archived, 5000, LocaleController.formatPluralString("StoryArchived", 1, new Object[0])).j();
    }

    public static void i(tv0 tv0Var, long j10, int i10, String str) {
        ci.w6 B = tv0Var.getStoriesController().B(j10, true);
        int i11 = B.f6120a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        ((ci.b7) B.h.get(c10)).f5254b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f6121b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public static void j(tv0 tv0Var, TL_stories.StoryItem storyItem, ci.b7 b7Var) {
        tv0Var.getStoriesController().c(b7Var.f5253a, tv0Var.f30709j1, storyItem);
        AndroidUtilities.runOnUIThread(new go0(7, tv0Var, b7Var), 100L);
    }

    public static void m(tv0 tv0Var, HashSet hashSet, TL_stories.StoryItem storyItem, i80 i80Var, ci.b7 b7Var) {
        String formatString;
        long j10 = tv0Var.f30709j1;
        if (hashSet.contains(Integer.valueOf(b7Var.f5253a))) {
            tv0Var.getStoriesController().c(b7Var.f5253a, j10, storyItem);
            formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, b7Var.f5254b);
        } else {
            ci.i7 storiesController = tv0Var.getStoriesController();
            int i10 = b7Var.f5253a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.c0(i10, j10, arrayList);
            formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, b7Var.f5254b);
        }
        xc.a0(tv0Var.f30734v1).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
        i80Var.u();
    }

    public static void n(tv0 tv0Var, long j10, int i10) {
        ci.w6 B = tv0Var.getStoriesController().B(j10, true);
        int i11 = B.f6120a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f6121b);
        tL_deleteAlbum.album_id = ((ci.b7) B.h.remove(c10)).f5253a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public static int p(tv0 tv0Var, s4.g0 g0Var) {
        if (g0Var == tv0Var.f30695d0) {
            return 8;
        }
        if (g0Var == tv0Var.f30700f0) {
            return 9;
        }
        for (sv0 sv0Var : tv0Var.Y1.values()) {
            if (sv0Var.d == g0Var) {
                return sv0Var.f30337a;
            }
        }
        return -1;
    }

    public static int q(View view) {
        if (view instanceof org.telegram.ui.Cells.s7) {
            return ((org.telegram.ui.Cells.s7) view).getMessageId();
        }
        if (view instanceof org.telegram.ui.Cells.i7) {
            return ((org.telegram.ui.Cells.i7) view).getMessage().getId();
        }
        if (view instanceof org.telegram.ui.Cells.h7) {
            return ((org.telegram.ui.Cells.h7) view).getMessage().getId();
        }
        return 0;
    }

    public static boolean q0(int i10) {
        if (i10 != 8 && i10 != 9 && !y0(i10)) {
            return false;
        }
        return true;
    }

    public static void r(mu0 mu0Var, iv0[] iv0VarArr, boolean z10) {
        go0 go0Var;
        if (z10) {
            if (SharedConfig.fastScrollHintCount > 0 && mu0Var.G == null && !mu0Var.I && mu0Var.h.getFastScroll() != null && mu0Var.h.getFastScroll().f29308a0 && mu0Var.h.getFastScroll().getVisibility() == 0 && iv0VarArr[0].e() >= 50) {
                SharedConfig.setFastScrollHintCount(SharedConfig.fastScrollHintCount - 1);
                mu0Var.I = true;
                Context context = mu0Var.getContext();
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                textView.setText(LocaleController.getString(R.string.SharedMediaFastScrollHint));
                textView.setTextSize(1, 14.0f);
                textView.setMaxLines(3);
                int i10 = org.telegram.ui.ActionBar.h6.f21216pf;
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
                frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21235qf, false)));
                frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
                ?? view = new View(context);
                view.f27950a = new Random();
                Paint paint = new Paint(1);
                view.f27951b = paint;
                Paint paint2 = new Paint(1);
                view.f27952c = paint2;
                view.f27953f = 1.0f;
                view.h = 0.0f;
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, i10, false), 76));
                paint2.setColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
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
                mu0Var.G = frameLayout;
                mu0Var.addView((View) frameLayout, w7.z5.c(-2.0f, -2));
                mu0Var.G.setAlpha(0.0f);
                mu0Var.G.setScaleX(0.8f);
                mu0Var.G.setScaleY(0.8f);
                mu0Var.G.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                mu0Var.invalidate();
                go0 go0Var2 = new go0(6, mu0Var, frameLayout);
                mu0Var.H = go0Var2;
                AndroidUtilities.runOnUIThread(go0Var2, 4000L);
            }
        } else if (mu0Var.G != null && (go0Var = mu0Var.H) != null) {
            AndroidUtilities.cancelRunOnUIThread(go0Var);
            mu0Var.H.run();
            mu0Var.H = null;
            mu0Var.G = null;
        }
    }

    public static void t(org.telegram.ui.Components.tv0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tv0.t(org.telegram.ui.Components.tv0):void");
    }

    public static void u(tv0 tv0Var, int i10, boolean z10) {
        mu0[] mu0VarArr = tv0Var.f30710k0;
        if (mu0VarArr[0].F == i10) {
            return;
        }
        mu0 mu0Var = mu0VarArr[1];
        mu0Var.F = i10;
        mu0Var.setVisibility(0);
        tv0Var.l0();
        tv0Var.o1(true);
        tv0Var.f30705h1 = z10;
        tv0Var.N0();
        tv0Var.A(!tv0Var.u0(i10), true);
        tv0Var.s1(true);
    }

    public static int v(tv0 tv0Var, s4.g0 g0Var) {
        if (g0Var == tv0Var.f30692c0) {
            return 8;
        }
        if (g0Var == tv0Var.f30697e0) {
            return 9;
        }
        for (sv0 sv0Var : tv0Var.Y1.values()) {
            if (sv0Var.f30339c == g0Var) {
                return sv0Var.f30337a;
            }
        }
        return -1;
    }

    public static boolean y0(int i10) {
        if ((i10 & (-65536)) == 65536) {
            return true;
        }
        return false;
    }

    public final void A(boolean z10, boolean z11) {
        int i10;
        xj0 xj0Var = this.f30727s0;
        if (xj0Var != null && this.V1 != z10) {
            this.V1 = z10;
            if (!z10 && xj0Var.getAnimatedDrawable().f30976a0 < 20) {
                xj0Var.getAnimatedDrawable().P(0);
            } else {
                uj0 animatedDrawable = xj0Var.getAnimatedDrawable();
                if (this.V1) {
                    i10 = 50;
                } else {
                    i10 = 100;
                }
                animatedDrawable.P(i10);
            }
            if (z11) {
                xj0Var.getAnimatedDrawable().start();
            } else {
                xj0Var.getAnimatedDrawable().M(xj0Var.getAnimatedDrawable().f30983f);
            }
        }
    }

    public final void A0(int i10, int i11, int i12, boolean z10) {
        iv0[] iv0VarArr = this.f30730t1;
        iv0VarArr[i10].f27363a.clear();
        iv0VarArr[i10].f27364b[0].clear();
        iv0VarArr[i10].f27364b[1].clear();
        iv0 iv0Var = iv0VarArr[i10];
        iv0Var.f27369j[0] = i11;
        iv0Var.f27368i[0] = false;
        iv0Var.f27371l = false;
        iv0Var.f27372m = i12;
        iv0Var.f27373n = (iv0Var.e() - i12) - 1;
        iv0 iv0Var2 = iv0VarArr[i10];
        if (iv0Var2.f27373n < 0) {
            iv0Var2.f27373n = 0;
        }
        iv0Var2.f27370k = i11;
        iv0Var2.f27374o = true;
        iv0Var2.f27367g = false;
        iv0Var2.f27375p++;
        mu0 W = W(i10);
        if (W != null && W.h.getAdapter() != null) {
            W.h.getAdapter().l();
        }
        if (z10) {
            int i13 = 0;
            while (true) {
                mu0[] mu0VarArr = this.f30710k0;
                if (i13 < mu0VarArr.length) {
                    mu0 mu0Var = mu0VarArr[i13];
                    if (mu0Var.F == i10) {
                        mu0Var.f28614x.h1(Math.min(iv0VarArr[i10].e() - 1, iv0VarArr[i10].f27372m), 0);
                    }
                    i13++;
                } else {
                    return;
                }
            }
        }
    }

    public final Boolean A1(View view, View view2) {
        if (!this.f30718o1) {
            mu0[] mu0VarArr = this.f30710k0;
            boolean z10 = false;
            mu0 mu0Var = mu0VarArr[0];
            if (mu0Var != null) {
                if (!this.f30711k1 || !q0(mu0Var.F)) {
                    int i10 = mu0VarArr[0].F;
                    this.f30720p1 = i10;
                    boolean q02 = q0(i10);
                    int[] iArr = this.f30713m1;
                    int X = X(q02 ? 1 : 0, iArr[q02 ? 1 : 0], false);
                    if (view2 != null && X == X(q02 ? 1 : 0, X, false)) {
                        view2.setEnabled(false);
                        view2.animate().alpha(0.5f).start();
                    }
                    if (iArr[q02 ? 1 : 0] != X) {
                        if (view != null && !view.isEnabled()) {
                            view.setEnabled(true);
                            view.animate().alpha(1.0f).start();
                        }
                        if (!q02) {
                            SharedConfig.setMediaColumnsCount(X);
                        } else if (c0(mu0VarArr[0].F) >= 5 || y0(mu0VarArr[0].F)) {
                            SharedConfig.setStoriesColumnsCount(X);
                        }
                        B(X);
                    }
                    if (X != X(q02 ? 1 : 0, X, false)) {
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

    public final void B(int i10) {
        int i11;
        mu0 W = W(this.f30720p1);
        this.f30726s = -1;
        if (W != null) {
            W.h.B0();
            this.f30722q1 = i10;
            W.f28611r.setVisibility(0);
            if (q0(this.f30720p1)) {
                W.f28611r.setAdapter(n1(this.f30720p1));
            } else {
                W.f28611r.setAdapter(this.I);
            }
            lu0 lu0Var = W.f28611r;
            int paddingLeft = lu0Var.getPaddingLeft();
            lu0 lu0Var2 = W.f28611r;
            int Z = Z(W.F);
            lu0Var2.f28309b3 = Z;
            int paddingRight = W.f28611r.getPaddingRight();
            lu0 lu0Var3 = W.f28611r;
            int Y = Y(x0());
            lu0Var3.f28310c3 = Y;
            lu0Var.setPadding(paddingLeft, Z, paddingRight, Y);
            W.f28612s.y1(i10);
            W.f28611r.a0();
            int i12 = 0;
            while (true) {
                mu0[] mu0VarArr = this.f30710k0;
                if (i12 >= mu0VarArr.length) {
                    break;
                }
                mu0 mu0Var = mu0VarArr[i12];
                if (mu0Var != null && ((i11 = mu0Var.F) == 0 || q0(i11))) {
                    AndroidUtilities.updateVisibleRows(mu0VarArr[i12].h);
                }
                i12++;
            }
            this.f30718o1 = true;
            if (this.f30720p1 == 0) {
                this.f30730t1[0].g(true);
            }
            this.f30716n1 = 0.0f;
            Z0();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.I1.lock();
            ofFloat.addUpdateListener(new it0(this, W, 1));
            ofFloat.addListener(new gi.s2(this, q0(W.F) ? 1 : 0, i10, 2));
            ofFloat.setInterpolator(bs.f25014f);
            ofFloat.setStartDelay(100L);
            ofFloat.setDuration(350L);
            ofFloat.start();
        }
    }

    public final void B0(boolean z10) {
        long j10 = this.F;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0 && !v0()) {
            for (int i11 = 0; i11 < 4; i11++) {
                final int i12 = f30682d2[i11];
                iv0[] iv0VarArr = this.f30730t1;
                if (!iv0VarArr[i12].h || z10) {
                    long j11 = this.f30709j1;
                    if (!DialogObject.isEncryptedDialog(j11)) {
                        iv0VarArr[i12].h = false;
                        TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
                        if (i12 == 0) {
                            int i13 = iv0VarArr[i12].f27376q;
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
                        org.telegram.ui.ActionBar.n2 n2Var = this.f30734v1;
                        tL_messages_getSearchResultsPositions.peer = n2Var.getMessagesController().getInputPeer(j11);
                        if (i10 != 0 && n2Var.getUserConfig().getClientUserId() == j11) {
                            tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                            tL_messages_getSearchResultsPositions.saved_peer_id = n2Var.getMessagesController().getInputPeer(j10);
                        }
                        final int i14 = iv0VarArr[i12].f27375p;
                        ConnectionsManager.getInstance(n2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(n2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new ur0(tv0.this, tL_error, i14, i12, tLObject, 0));
                            }
                        }), n2Var.getClassGuid());
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final boolean C() {
        boolean s02 = s0();
        long j10 = this.f30709j1;
        org.telegram.ui.ActionBar.n2 n2Var = this.f30734v1;
        if (s02) {
            TLRPC.User user = MessagesController.getInstance(n2Var.getCurrentAccount()).getUser(Long.valueOf(j10));
            if (user == null || !user.bot || !user.bot_can_edit) {
                return false;
            }
            return true;
        } else if (!x0() && (n2Var == null || !n2Var.getMessagesController().getStoriesController().h(j10))) {
            return false;
        } else {
            return true;
        }
    }

    public final void C0(int i10) {
        int i11;
        int i12 = 2;
        iv0[] iv0VarArr = this.f30730t1;
        if (i10 == 0) {
            int i13 = iv0VarArr[0].f27376q;
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
        iv0VarArr[i10].f27367g = true;
        org.telegram.ui.ActionBar.n2 n2Var = this.f30734v1;
        n2Var.getMediaDataController().loadMedia(this.f30709j1, 50, 0, iv0VarArr[i10].f27370k, i11, this.F, 1, n2Var.getClassGuid(), iv0VarArr[i10].f27375p, null, null);
    }

    public boolean D() {
        return !(this instanceof h40);
    }

    public int D0() {
        return 0;
    }

    public final boolean E() {
        mu0 mu0Var;
        mu0[] mu0VarArr = this.f30710k0;
        if (mu0VarArr == null || (mu0Var = mu0VarArr[0]) == null) {
            return false;
        }
        if (this.f30711k1 && q0(mu0Var.F)) {
            return false;
        }
        boolean q02 = q0(mu0VarArr[0].F);
        int i10 = this.f30713m1[q02 ? 1 : 0];
        if (i10 == X(q02 ? 1 : 0, i10, false)) {
            return false;
        }
        return true;
    }

    public final void E0(int i10, View view) {
        boolean z10;
        boolean z11;
        String string;
        int i11;
        is0 is0Var;
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
        dv0 dv0Var = this.R;
        SparseArray[] sparseArrayArr = this.Z0;
        org.telegram.ui.ActionBar.n2 n2Var = this.f30734v1;
        boolean z14 = true;
        char c10 = 1;
        if (i10 == 101) {
            boolean q02 = q0(getSelectedTab());
            org.telegram.ui.ActionBar.d6 d6Var = this.F1;
            if (!q02 && getSelectedTab() != 13) {
                if (getSelectedTab() == 11) {
                    SavedMessagesController savedMessagesController = n2Var.getMessagesController().getSavedMessagesController();
                    final ArrayList arrayList = new ArrayList();
                    for (int i15 = 0; i15 < savedMessagesController.allDialogs.size(); i15++) {
                        long j10 = savedMessagesController.allDialogs.get(i15).dialogId;
                        if (dv0Var.f25657w.contains(Long.valueOf(j10))) {
                            arrayList.add(Long.valueOf(j10));
                        }
                    }
                    String str = "";
                    if (!arrayList.isEmpty()) {
                        Long l4 = (Long) arrayList.get(0);
                        long longValue = l4.longValue();
                        if (longValue == n2Var.getUserConfig().getClientUserId()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        int i16 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                        z12 = z13;
                        if (i16 < 0) {
                            TLRPC.Chat chat2 = n2Var.getMessagesController().getChat(Long.valueOf(-longValue));
                            z12 = z13;
                            if (chat2 != null) {
                                str = chat2.title;
                                z12 = z13;
                            }
                        } else if (i16 >= 0) {
                            TLRPC.User user2 = n2Var.getMessagesController().getUser(l4);
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
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, d6Var);
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
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
                    b2Var.R = formatPluralString;
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
                    b2Var.T = formatPluralString2;
                    alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.a2(this) {
                        public final tv0 f32206b;

                        {
                            this.f32206b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i17) {
                            switch (r3) {
                                case 0:
                                    tv0 tv0Var = this.f32206b;
                                    org.telegram.ui.ActionBar.n2 n2Var2 = tv0Var.f30734v1;
                                    ci.i7 storiesController = n2Var2.getMessagesController().getStoriesController();
                                    long j11 = tv0Var.f30709j1;
                                    ArrayList arrayList2 = arrayList;
                                    storiesController.s(j11, arrayList2);
                                    xc.a0(n2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList2.size(), new Object[0])).j();
                                    tv0Var.L(false);
                                    return;
                                default:
                                    tv0 tv0Var2 = this.f32206b;
                                    tv0Var2.getClass();
                                    int i18 = 0;
                                    while (true) {
                                        ArrayList arrayList3 = arrayList;
                                        if (i18 < arrayList3.size()) {
                                            tv0Var2.f30734v1.getMessagesController().deleteSavedDialog(((Long) arrayList3.get(i18)).longValue());
                                            i18++;
                                        } else {
                                            tv0Var2.L(true);
                                            return;
                                        }
                                    }
                            }
                        }
                    });
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    n2Var.showDialog(b2Var);
                    TextView textView = (TextView) b2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21227q7, false));
                        return;
                    }
                    return;
                }
                long j11 = this.f30709j1;
                if (DialogObject.isEncryptedDialog(j11)) {
                    encryptedChat = org.telegram.messenger.g0.l(n2Var.getMessagesController(), j11);
                    user = null;
                    chat = null;
                } else if (DialogObject.isUserDialog(j11)) {
                    user = n2Var.getMessagesController().getUser(Long.valueOf(j11));
                    chat = null;
                    encryptedChat = null;
                } else {
                    chat = n2Var.getMessagesController().getChat(Long.valueOf(-j11));
                    user = null;
                    encryptedChat = null;
                }
                f5.y(n2Var, user, chat, encryptedChat, null, this.f30693c1, null, this.Z0, null, 0, 0, null, new nr0(this, 1), null, this.F1);
            } else if (sparseArrayArr[0] != null) {
                if (s0() && (is0Var = this.U) != null && is0Var.getCurrentList() != null) {
                    ci.t6 currentList = is0Var.getCurrentList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i17 = 0; i17 < sparseArrayArr[0].size(); i17++) {
                        TL_stories.StoryItem storyItem = ((MessageObject) sparseArrayArr[0].valueAt(i17)).storyItem;
                        if (storyItem != null) {
                            arrayList2.add(storyItem.media);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, d6Var);
                        if (arrayList2.size() > 1) {
                            i12 = R.string.DeleteBotPreviewsTitle;
                        } else {
                            i12 = R.string.DeleteBotPreviewTitle;
                        }
                        String string2 = LocaleController.getString(i12);
                        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20604a;
                        b2Var2.R = string2;
                        b2Var2.T = LocaleController.formatPluralString("DeleteBotPreviewsSubtitle", arrayList2.size(), new Object[0]);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new ry(this, currentList, arrayList2, 3));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new tg0(8));
                        b2Var2.show();
                        b2Var2.i();
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
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), 0, d6Var);
                    if (arrayList3.size() > 1) {
                        i11 = R.string.DeleteStoriesTitle;
                    } else {
                        i11 = R.string.DeleteStoryTitle;
                    }
                    String string3 = LocaleController.getString(i11);
                    org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f20604a;
                    b2Var3.R = string3;
                    b2Var3.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList3.size(), new Object[0]);
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2(this) {
                        public final tv0 f32206b;

                        {
                            this.f32206b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.b2 b2Var22, int i172) {
                            switch (r3) {
                                case 0:
                                    tv0 tv0Var = this.f32206b;
                                    org.telegram.ui.ActionBar.n2 n2Var2 = tv0Var.f30734v1;
                                    ci.i7 storiesController = n2Var2.getMessagesController().getStoriesController();
                                    long j112 = tv0Var.f30709j1;
                                    ArrayList arrayList22 = arrayList3;
                                    storiesController.s(j112, arrayList22);
                                    xc.a0(n2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList22.size(), new Object[0])).j();
                                    tv0Var.L(false);
                                    return;
                                default:
                                    tv0 tv0Var2 = this.f32206b;
                                    tv0Var2.getClass();
                                    int i182 = 0;
                                    while (true) {
                                        ArrayList arrayList32 = arrayList3;
                                        if (i182 < arrayList32.size()) {
                                            tv0Var2.f30734v1.getMessagesController().deleteSavedDialog(((Long) arrayList32.get(i182)).longValue());
                                            i182++;
                                        } else {
                                            tv0Var2.L(true);
                                            return;
                                        }
                                    }
                            }
                        }
                    });
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new tg0(9));
                    b2Var3.show();
                    b2Var3.i();
                }
            }
        } else if (i10 == 100) {
            if (this.f30698e1 != null && n2Var.getMessagesController().isUserNoForwards(this.f30698e1)) {
                r40 r40Var = this.E1;
                if (r40Var != null) {
                    r40Var.setText(LocaleController.getString(R.string.ForwardsRestrictedInfoUser));
                    this.E1.f(view, true);
                    return;
                }
                return;
            }
            if (this.f30696d1 != null) {
                TLRPC.Chat chat3 = n2Var.getMessagesController().getChat(Long.valueOf(this.f30696d1.f20276id));
                if (n2Var.getMessagesController().isChatNoForwards(chat3)) {
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
            if (k0()) {
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
            org.telegram.ui.cy cyVar = new org.telegram.ui.cy(bundle);
            cyVar.C2 = new or0(this);
            n2Var.presentFragment(cyVar);
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
                    TLRPC.Chat chat4 = n2Var.getMessagesController().getChat(Long.valueOf(-dialogId));
                    if (chat4 != null && chat4.migrated_to != null) {
                        bundle2.putLong("migrated_to", dialogId);
                        dialogId = -chat4.migrated_to.channel_id;
                    }
                    bundle2.putLong("chat_id", -dialogId);
                }
                bundle2.putInt("message_id", messageObject.getId());
                bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                org.telegram.ui.qn qnVar = new org.telegram.ui.qn(bundle2);
                qnVar.L7 = messageObject.getId();
                long j12 = this.F;
                if (j12 != 0) {
                    og.d.a(qnVar, MessagesStorage.TopicKey.of(dialogId, j12));
                    bundle2.putInt("message_id", messageObject.getId());
                }
                n2Var.presentFragment(qnVar, false);
            }
        } else if (i10 == 103 || i10 == 104) {
            if (getClosestTab() == 8) {
                bu0 bu0Var = this.f30692c0;
                if (bu0Var != null && bu0Var.f29723s != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (int i19 = 0; i19 < sparseArrayArr[0].size(); i19++) {
                        arrayList4.add(Integer.valueOf(((MessageObject) sparseArrayArr[0].valueAt(i19)).getId()));
                    }
                    if (i10 != 103) {
                        z14 = false;
                    }
                    V0(arrayList4, z14);
                    L(false);
                    return;
                }
                return;
            }
            SavedMessagesController savedMessagesController2 = n2Var.getMessagesController().getSavedMessagesController();
            ArrayList<Long> arrayList5 = new ArrayList<>();
            for (int i20 = 0; i20 < savedMessagesController2.allDialogs.size(); i20++) {
                long j13 = savedMessagesController2.allDialogs.get(i20).dialogId;
                if (dv0Var.f25657w.contains(Long.valueOf(j13))) {
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
                n2Var.showDialog(new sg.k0(33, n2Var.getCurrentAccount(), getContext(), n2Var, null));
            } else {
                z11 = true;
                int i21 = 0;
                while (true) {
                    mu0[] mu0VarArr = this.f30710k0;
                    if (i21 >= mu0VarArr.length) {
                        break;
                    }
                    mu0 mu0Var = mu0VarArr[i21];
                    if (mu0Var.F == 11) {
                        mu0Var.f28614x.h1(0, 0);
                        break;
                    }
                    i21++;
                }
            }
            L(z11);
        }
    }

    public final void F() {
        jt0 jt0Var = this.I0;
        if (!jt0Var.e(jt0Var.getCurrentTabId())) {
            int firstTabId = jt0Var.getFirstTabId();
            jt0Var.setInitialTabId(firstTabId);
            this.f30710k0[0].F = firstTabId;
            o1(false);
        }
    }

    public final void G(org.telegram.ui.Components.mu0 r34, org.telegram.ui.Components.im0 r35, s4.b0 r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tv0.G(org.telegram.ui.Components.mu0, org.telegram.ui.Components.im0, s4.b0):void");
    }

    public final boolean H(MotionEvent motionEvent) {
        float f7;
        s4.g0 g0Var;
        boolean z10;
        is0 is0Var;
        float f10;
        boolean z11;
        mu0[] mu0VarArr = this.f30710k0;
        int i10 = mu0VarArr[0].F;
        if (i10 == 13 && (is0Var = this.U) != null) {
            View currentView = is0Var.f8074n.getCurrentView();
            if (currentView instanceof di.r) {
                di.r rVar = (di.r) currentView;
                di.l lVar = rVar.v;
                di.i iVar = rVar.f8059f;
                if (rVar.f8056a != null && rVar.getParent() != null) {
                    if (!rVar.f8057b || rVar.K) {
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
                                            rVar.f8058c = 0.0f;
                                        } else {
                                            if (z12) {
                                                f10 = org.telegram.messenger.g0.x(2.0f, rVar.Q, 1.0f, 1.0f);
                                            } else {
                                                f10 = (1.0f - rVar.Q) / 0.5f;
                                            }
                                            rVar.f8058c = Math.max(0.0f, Math.min(1.0f, f10));
                                        }
                                        float f11 = rVar.f8058c;
                                        int i14 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
                                        if (i14 == 0 || f11 == 0.0f) {
                                            if (i14 == 0) {
                                                int i15 = rVar.e;
                                                int ceil = (((int) Math.ceil(rVar.S / rVar.e)) * i15) + ((int) ((rVar.W.G.f30745z1 / (iVar.getMeasuredWidth() - ((int) (iVar.getMeasuredWidth() / rVar.e)))) * (i15 - 1)));
                                                if (ceil >= lVar.h()) {
                                                    ceil = lVar.h() - 1;
                                                }
                                                rVar.S = ceil;
                                            }
                                            rVar.a();
                                            if (rVar.f8058c == 0.0f) {
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
                                int i17 = y3 + iVar.V2;
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
        if ((i10 == 0 || q0(i10)) && getParent() != null) {
            if (!this.f30718o1 || this.f30684a) {
                if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                    if (motionEvent.getActionMasked() == 2 && (this.f30684a || this.f30691c)) {
                        int i19 = -1;
                        int i20 = -1;
                        for (int i21 = 0; i21 < motionEvent.getPointerCount(); i21++) {
                            if (this.e == motionEvent.getPointerId(i21)) {
                                i19 = i21;
                            }
                            if (this.f30699f == motionEvent.getPointerId(i21)) {
                                i20 = i21;
                            }
                        }
                        if (i19 != -1 && i20 != -1) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(i20) - motionEvent.getX(i19), motionEvent.getY(i20) - motionEvent.getY(i19))) / this.h;
                            this.f30714n = hypot2;
                            if (!this.f30684a && (hypot2 > 1.01f || hypot2 < 0.99f)) {
                                this.f30684a = true;
                                if (hypot2 > 1.0f) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                this.f30723r = z10;
                                g1(z10);
                            }
                            if (this.f30684a) {
                                boolean z13 = this.f30723r;
                                if ((z13 && this.f30714n < 1.0f) || (!z13 && this.f30714n > 1.0f)) {
                                    this.f30716n1 = 0.0f;
                                } else {
                                    if (z13) {
                                        f7 = org.telegram.messenger.g0.x(2.0f, this.f30714n, 1.0f, 1.0f);
                                    } else {
                                        f7 = (1.0f - this.f30714n) / 0.5f;
                                    }
                                    this.f30716n1 = Math.max(0.0f, Math.min(1.0f, f7));
                                }
                                float f12 = this.f30716n1;
                                if (f12 == 1.0f || f12 == 0.0f) {
                                    if (q0(this.f30720p1)) {
                                        g0Var = m1(this.f30720p1);
                                    } else {
                                        g0Var = this.H;
                                    }
                                    if (this.f30716n1 == 1.0f) {
                                        int i22 = this.f30722q1;
                                        int ceil2 = (((int) Math.ceil(this.f30726s / this.f30722q1)) * i22) + ((int) ((this.f30745z1 / (mu0VarArr[0].h.getMeasuredWidth() - ((int) (mu0VarArr[0].h.getMeasuredWidth() / this.f30722q1)))) * (i22 - 1)));
                                        if (ceil2 >= g0Var.h()) {
                                            ceil2 = g0Var.h() - 1;
                                        }
                                        this.f30726s = ceil2;
                                    }
                                    T();
                                    if (this.f30716n1 == 0.0f) {
                                        this.f30723r = !this.f30723r;
                                    }
                                    g1(this.f30723r);
                                    this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                mu0VarArr[0].h.invalidate();
                                mu0 mu0Var = mu0VarArr[0];
                                if (mu0Var.G != null) {
                                    mu0Var.invalidate();
                                }
                            }
                        } else {
                            this.f30687b = false;
                            this.f30691c = false;
                            this.f30684a = false;
                            T();
                            return false;
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.e == motionEvent.getPointerId(0) && this.f30699f == motionEvent.getPointerId(1)) || (this.e == motionEvent.getPointerId(1) && this.f30699f == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.f30684a) {
                        this.f30691c = false;
                        this.f30687b = false;
                        this.f30684a = false;
                        T();
                    }
                } else {
                    if (this.f30687b && !this.f30684a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.f30714n = 1.0f;
                        this.e = motionEvent.getPointerId(0);
                        this.f30699f = motionEvent.getPointerId(1);
                        mu0VarArr[0].h.I0(false);
                        mu0VarArr[0].h.cancelLongPress();
                        mu0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.f30735w = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - mu0VarArr[0].getX());
                        int y10 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - mu0VarArr[0].getY());
                        int i23 = this.f30735w;
                        this.f30726s = -1;
                        int i24 = y10 + mu0VarArr[0].h.V2;
                        if (getY() != 0.0f && this.E == 1) {
                            i24 = 0;
                        }
                        for (int i25 = 0; i25 < mu0VarArr[0].h.getChildCount(); i25++) {
                            View childAt2 = mu0VarArr[0].h.getChildAt(i25);
                            Rect rect2 = this.f30738x;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i23, i24)) {
                                mu0VarArr[0].h.getClass();
                                this.f30726s = RecyclerView.S(childAt2);
                                this.v = childAt2.getTop();
                            }
                        }
                        if (this.D1.T() && this.f30726s == -1) {
                            this.f30726s = (int) (((this.f30713m1[q0(mu0VarArr[0].F) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i23 / mu0VarArr[0].h.getMeasuredWidth(), 0.0f))) + mu0VarArr[0].f28614x.L0());
                            this.v = 0;
                        }
                        this.f30691c = true;
                    }
                    if (motionEvent.getActionMasked() == 0 && ((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - mu0VarArr[0].getY() > 0.0f) {
                        this.f30687b = true;
                    }
                }
                return this.f30684a;
            }
            return true;
        }
        return false;
    }

    public final void H0() {
        ci.a7 a7Var;
        ci.a7 a7Var2;
        this.G1.removeAllObservers();
        bu0 bu0Var = this.f30692c0;
        if (bu0Var != null && (a7Var2 = bu0Var.f29723s) != null && a7Var2 != null) {
            a7Var2.z(bu0Var.v);
        }
        hs0 hs0Var = this.f30697e0;
        if (hs0Var != null && (a7Var = hs0Var.f29723s) != null && a7Var != null) {
            a7Var.z(hs0Var.v);
        }
        for (sv0 sv0Var : this.Y1.values()) {
            rv0 rv0Var = sv0Var.f30339c;
            ci.a7 a7Var3 = rv0Var.f29723s;
            if (a7Var3 != null && a7Var3 != null) {
                a7Var3.z(rv0Var.v);
            }
        }
    }

    public final void I() {
        char c10;
        char c11;
        float abs;
        View childAt;
        int R;
        float f7;
        float measuredWidth;
        mu0[] mu0VarArr = this.f30710k0;
        mu0 mu0Var = mu0VarArr[0];
        if (mu0Var != null && mu0VarArr[1] != null) {
            float f10 = 0.0f;
            os0 os0Var = this.W;
            if (os0Var != null) {
                if (q0(mu0Var.F) && mu0VarArr[0].F != 9) {
                    c10 = 1;
                } else {
                    c10 = 0;
                }
                if (mu0VarArr[1].getVisibility() == 0) {
                    if (q0(mu0VarArr[1].F) && mu0VarArr[1].F != 9) {
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
                        measuredWidth = mu0VarArr[0].getMeasuredWidth();
                    }
                    os0Var.setTranslationX(measuredWidth);
                } else {
                    os0Var.setTranslationX(mu0VarArr[c10 ^ 1].getTranslationX());
                    abs = 1.0f - (Math.abs(os0Var.getTranslationX()) / os0Var.getMeasuredWidth());
                }
                float f11 = 0.0f;
                for (int i10 = 0; i10 < mu0VarArr.length; i10++) {
                    if (mu0VarArr[i10].getVisibility() == 0) {
                        ss0 ss0Var = mu0VarArr[i10].h;
                        if (ss0Var.getChildCount() == 0) {
                            childAt = null;
                        } else {
                            childAt = ss0Var.getChildAt(0);
                        }
                        if (childAt == null) {
                            R = -1;
                        } else {
                            R = RecyclerView.R(childAt);
                        }
                        if (R == 0) {
                            f7 = childAt.getY() - ss0Var.getPaddingTop();
                        } else if (ss0Var.getChildCount() == 0) {
                            f7 = 0.0f;
                        } else {
                            f7 = -AndroidUtilities.dp(48.0f);
                        }
                        f11 += Utilities.clamp01(1.0f - (mu0VarArr[i10].getTranslationX() / mu0VarArr[i10].getMeasuredWidth())) * f7;
                    }
                }
                float clamp01 = Utilities.clamp01(1.0f - ((-f11) / AndroidUtilities.dpf2(48.0f)));
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
                os0Var.setAlpha(clamp01);
                os0Var.setScaleX(lerp);
                os0Var.setScaleY(lerp);
                os0Var.setTranslationY(this.K1 + f11);
                f10 = abs;
            }
            K();
            if (this.U1 != f10) {
                this.U1 = f10;
                p0();
                invalidate();
            }
        }
    }

    public final void I0(int i10, View view, MessageObject messageObject, int i11) {
        TLRPC.WebPage webPage;
        String str;
        char c10;
        int i12;
        int i13;
        if (messageObject != null && !this.f30718o1) {
            os0 os0Var = this.W;
            if (os0Var == null || !os0Var.f36524w) {
                int i14 = 0;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                i14 = 0;
                String str2 = null;
                ci.a7 a7Var = null;
                boolean z15 = true;
                if (this.C1) {
                    int i15 = 8;
                    if (i11 != 8 || C()) {
                        if (messageObject.getDialogId() == this.f30709j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        SparseArray[] sparseArrayArr = this.Z0;
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            sparseArrayArr[c10].remove(messageObject.getId());
                            if (!messageObject.canDeleteMessage(false, null)) {
                                this.f30686a1--;
                            }
                        } else {
                            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                                sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                                if (!messageObject.canDeleteMessage(false, null)) {
                                    this.f30686a1++;
                                }
                            } else {
                                return;
                            }
                        }
                        F0(sparseArrayArr[0]);
                        if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                            d1(false);
                        } else {
                            this.A0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                            if (this.f30686a1 == 0) {
                                i12 = 0;
                            } else {
                                i12 = 8;
                            }
                            this.f30712l0.setVisibility(i12);
                            org.telegram.ui.ActionBar.u0 u0Var = this.f30731u0;
                            if (u0Var != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14 && sparseArrayArr[0].size() == 1) {
                                    i13 = 0;
                                } else {
                                    i13 = 8;
                                }
                                u0Var.setVisibility(i13);
                            }
                            org.telegram.ui.ActionBar.u0 u0Var2 = this.f30729t0;
                            if (u0Var2 != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                                    i15 = 0;
                                }
                                u0Var2.setVisibility(i15);
                            }
                            x1();
                        }
                        this.f30689b1 = false;
                        if (view instanceof org.telegram.ui.Cells.i7) {
                            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z10 = true;
                            }
                            i7Var.b(z10, true);
                        } else if (view instanceof org.telegram.ui.Cells.t7) {
                            org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) < 0) {
                                z15 = false;
                            }
                            t7Var.b(0, z15);
                        } else if (view instanceof org.telegram.ui.Cells.m7) {
                            org.telegram.ui.Cells.m7 m7Var = (org.telegram.ui.Cells.m7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            m7Var.f(z11, true);
                        } else if (view instanceof org.telegram.ui.Cells.h7) {
                            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z12 = true;
                            }
                            h7Var.e(z12, true);
                        } else if (view instanceof org.telegram.ui.Cells.f2) {
                            org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z13 = true;
                            }
                            f2Var.c(z13, true);
                        } else if (view instanceof org.telegram.ui.Cells.s7) {
                            org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z14 = true;
                            }
                            s7Var.i(z14, true);
                        }
                    } else {
                        return;
                    }
                } else {
                    ts0 ts0Var = this.f30725r1;
                    iv0[] iv0VarArr = this.f30730t1;
                    org.telegram.ui.ActionBar.n2 n2Var = this.f30734v1;
                    if (i11 == 0) {
                        iv0 iv0Var = iv0VarArr[i11];
                        int i16 = i10 - iv0Var.f27372m;
                        if (i16 >= 0 && i16 < iv0Var.f27363a.size()) {
                            PhotoViewer.t1().K2(null, n2Var, null);
                            PhotoViewer.t1().b2(iv0VarArr[i11].f27363a, i16, this.f30709j1, this.f30693c1, this.F, ts0Var);
                        }
                    } else if (i11 != 2 && i11 != 4) {
                        if (i11 == 5) {
                            PhotoViewer.t1().K2(null, n2Var, null);
                            int indexOf = iv0VarArr[i11].f27363a.indexOf(messageObject);
                            if (indexOf < 0) {
                                PhotoViewer.t1().b2(org.telegram.messenger.g0.k(messageObject), 0, 0L, 0L, 0L, ts0Var);
                            } else {
                                PhotoViewer.t1().b2(iv0VarArr[i11].f27363a, indexOf, this.f30709j1, this.f30693c1, this.F, ts0Var);
                            }
                        } else if (i11 == 1) {
                            if (view instanceof org.telegram.ui.Cells.i7) {
                                org.telegram.ui.Cells.i7 i7Var2 = (org.telegram.ui.Cells.i7) view;
                                TLRPC.Document document = messageObject.getDocument();
                                if (i7Var2.G) {
                                    if (messageObject.canPreviewDocument()) {
                                        PhotoViewer.t1().K2(null, n2Var, null);
                                        int indexOf2 = iv0VarArr[i11].f27363a.indexOf(messageObject);
                                        if (indexOf2 < 0) {
                                            PhotoViewer.t1().b2(org.telegram.messenger.g0.k(messageObject), 0, 0L, 0L, 0L, ts0Var);
                                            return;
                                        }
                                        PhotoViewer.t1().b2(iv0VarArr[i11].f27363a, indexOf2, this.f30709j1, this.f30693c1, this.F, ts0Var);
                                        return;
                                    }
                                    AndroidUtilities.openDocument(messageObject, n2Var.getParentActivity(), n2Var);
                                } else if (!i7Var2.F) {
                                    MessageObject message = i7Var2.getMessage();
                                    message.putInDownloadsStore = true;
                                    n2Var.getFileLoader().loadFile(document, message, 0, 0);
                                    i7Var2.f(true);
                                } else {
                                    n2Var.getFileLoader().cancelLoadFile(document);
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
                                        LaunchActivity launchActivity = LaunchActivity.H1;
                                        if (launchActivity == null || launchActivity.P() == null || LaunchActivity.H1.P().l(messageObject) == null) {
                                            n2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                            return;
                                        }
                                        return;
                                    }
                                    String str3 = webPage.embed_url;
                                    if (str3 != null && str3.length() != 0) {
                                        cv.J(n2Var, messageObject, this.f30725r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                        return;
                                    }
                                    str = webPage.url;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    ArrayList arrayList = ((org.telegram.ui.Cells.m7) view).E;
                                    if (arrayList.size() > 0) {
                                        str2 = ((CharSequence) arrayList.get(0)).toString();
                                    }
                                    str = str2;
                                }
                                if (str != null) {
                                    T0(str);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        } else if (q0(i11)) {
                            qv0 m12 = m1(i11);
                            if (m12 != null) {
                                a7Var = m12.f29723s;
                            }
                            if (a7Var != null) {
                                ci.aa orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
                                Context context = getContext();
                                int id2 = messageObject.getId();
                                ci.r7 a2 = ci.r7.a(this.f30710k0[0].h);
                                a2.e = new tv(a7Var, 19);
                                if ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).f33709t1) {
                                    i14 = AndroidUtilities.dp(68.0f);
                                }
                                a2.f5929s += i14;
                                orCreateStoryViewer.C(context, id2, a7Var, a2);
                            } else {
                                return;
                            }
                        }
                    } else if (view instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) view).a();
                    }
                }
                r1();
            }
        }
    }

    public final boolean J() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tv0.J():boolean");
    }

    public final boolean J0(MessageObject messageObject, View view, int i10, boolean z10) {
        os0 os0Var;
        char c10;
        int i11;
        int i12;
        final TL_stories.StoryItem storyItem;
        bu0 bu0Var;
        ci.a7 a7Var;
        if (!this.C1) {
            org.telegram.ui.ActionBar.n2 n2Var = this.f30734v1;
            if (n2Var.getParentActivity() != null && messageObject != null && ((os0Var = this.W) == null || !os0Var.f36524w)) {
                AndroidUtilities.hideKeyboard(n2Var.getParentActivity().getCurrentFocus());
                long j10 = this.f30709j1;
                int i13 = 8;
                if (z10 && ((y0(getClosestTab()) || getClosestTab() == 8) && !this.C1)) {
                    if (view instanceof org.telegram.ui.Cells.s7) {
                        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                        s7Var.k(s7Var.f23038n, s7Var.f23043r, true);
                    }
                    TL_stories.StoryItem storyItem2 = messageObject.storyItem;
                    if (storyItem2 != null) {
                        HashSet hashSet = new HashSet();
                        ArrayList<Integer> arrayList = storyItem2.albums;
                        if (arrayList != null) {
                            hashSet.addAll(arrayList);
                        }
                        boolean y02 = y0(getClosestTab());
                        i80 I = i80.I(n2Var, view);
                        i80 J = I.J();
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.st0(I, 26), false);
                        J.k();
                        i80.f(J, getStoriesController().B(j10, true), hashSet, true, new lg(this, storyItem2, I, 20), new ci.z2(this, hashSet, storyItem2, I, 10));
                        I.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddToAlbum), new gi.g2(I, J, 9), false);
                        I.k();
                        I.c(R.drawable.msg_select, LocaleController.getString(R.string.StoriesAlbumMenuSelect), new ai.cb(this, messageObject, view, i10, 25), false);
                        if (y02) {
                            int j12 = j1(getClosestTab());
                            String w9 = getStoriesController().w(j12, j10);
                            I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new e2(this, j12, 11), false);
                            storyItem = storyItem2;
                            I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.StoriesAlbumMenuRemoveFromAlbum), new ai.cb(this, j12, storyItem, w9, 26), false);
                        } else {
                            storyItem = storyItem2;
                            if (getClosestTab() == 8 && (bu0Var = this.f30692c0) != null && (a7Var = bu0Var.f29723s) != null) {
                                if (a7Var.m(storyItem.f20509id)) {
                                    I.c(R.drawable.chats_unpin, LocaleController.getString(R.string.StoriesAlbumMenuUnpin), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r1) {
                                                case 0:
                                                    tv0 tv0Var = this;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tv0Var.getContext(), 0, tv0Var.F1);
                                                    alertDialog$Builder.f20604a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                    alertDialog$Builder.f20604a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new xr0(tv0Var, storyItem));
                                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tg0(10));
                                                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
                                                    b2Var.show();
                                                    b2Var.i();
                                                    return;
                                                case 1:
                                                    tv0 tv0Var2 = this;
                                                    tv0Var2.getClass();
                                                    tv0Var2.V0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20509id))), false);
                                                    return;
                                                case 2:
                                                    tv0 tv0Var3 = this;
                                                    tv0Var3.getClass();
                                                    tv0Var3.V0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20509id))), true);
                                                    return;
                                                default:
                                                    tv0.h(this, storyItem);
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
                                                    tv0 tv0Var = this;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tv0Var.getContext(), 0, tv0Var.F1);
                                                    alertDialog$Builder.f20604a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                    alertDialog$Builder.f20604a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new xr0(tv0Var, storyItem));
                                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tg0(10));
                                                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
                                                    b2Var.show();
                                                    b2Var.i();
                                                    return;
                                                case 1:
                                                    tv0 tv0Var2 = this;
                                                    tv0Var2.getClass();
                                                    tv0Var2.V0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20509id))), false);
                                                    return;
                                                case 2:
                                                    tv0 tv0Var3 = this;
                                                    tv0Var3.getClass();
                                                    tv0Var3.V0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20509id))), true);
                                                    return;
                                                default:
                                                    tv0.h(this, storyItem);
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
                                            tv0 tv0Var = this;
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tv0Var.getContext(), 0, tv0Var.F1);
                                            alertDialog$Builder.f20604a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                            alertDialog$Builder.f20604a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new xr0(tv0Var, storyItem));
                                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tg0(10));
                                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
                                            b2Var.show();
                                            b2Var.i();
                                            return;
                                        case 1:
                                            tv0 tv0Var2 = this;
                                            tv0Var2.getClass();
                                            tv0Var2.V0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20509id))), false);
                                            return;
                                        case 2:
                                            tv0 tv0Var3 = this;
                                            tv0Var3.getClass();
                                            tv0Var3.V0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20509id))), true);
                                            return;
                                        default:
                                            tv0.h(this, storyItem);
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
                                        tv0 tv0Var = this;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tv0Var.getContext(), 0, tv0Var.F1);
                                        alertDialog$Builder.f20604a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                        alertDialog$Builder.f20604a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new xr0(tv0Var, storyItem));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tg0(10));
                                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
                                        b2Var.show();
                                        b2Var.i();
                                        return;
                                    case 1:
                                        tv0 tv0Var2 = this;
                                        tv0Var2.getClass();
                                        tv0Var2.V0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20509id))), false);
                                        return;
                                    case 2:
                                        tv0 tv0Var3 = this;
                                        tv0Var3.getClass();
                                        tv0Var3.V0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20509id))), true);
                                        return;
                                    default:
                                        tv0.h(this, storyItem);
                                        return;
                                }
                            }
                        }, true);
                        I.f27118i = 3;
                        I.f27138u = true;
                        I.v = true;
                        I.L = true;
                        I.M = 3;
                        Point point = AndroidUtilities.displaySize;
                        Point point2 = AndroidUtilities.displaySize;
                        int min = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point2.x, point2.y) * 0.4333f) * 3.0f) / 4.0f));
                        I.N = min;
                        I.O = (min * 4) / 3;
                        I.f27137t = true;
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
                        this.f30686a1++;
                    }
                    if (this.f30686a1 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    this.f30712l0.setVisibility(i11);
                    org.telegram.ui.ActionBar.u0 u0Var = this.f30731u0;
                    if (u0Var != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        } else {
                            i12 = 8;
                        }
                        u0Var.setVisibility(i12);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var2 = this.f30729t0;
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
                    this.f30689b1 = false;
                    if (view instanceof org.telegram.ui.Cells.i7) {
                        ((org.telegram.ui.Cells.i7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.t7) {
                        ((org.telegram.ui.Cells.t7) view).b(i10, true);
                    } else if (view instanceof org.telegram.ui.Cells.m7) {
                        ((org.telegram.ui.Cells.m7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) view).e(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.f2) {
                        ((org.telegram.ui.Cells.f2) view).c(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.s7) {
                        ((org.telegram.ui.Cells.s7) view).i(true, true);
                    }
                    if (!this.C1) {
                        d1(true);
                    }
                    F0(sparseArrayArr[0]);
                    r1();
                    return true;
                }
            }
        }
        return false;
    }

    public final void K() {
        us usVar = this.P0;
        if (usVar != null) {
            os0 os0Var = this.W;
            float f7 = 0.0f;
            if (os0Var != null) {
                f7 = 0.0f + (os0Var.getVisibilityFactor() * AndroidUtilities.dp(38.0f) * (1.0f - Math.abs(os0Var.getTranslationX() / os0Var.getMeasuredWidth())));
            }
            usVar.setTranslationY(this.K1 + f7);
        }
    }

    public boolean K0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return false;
    }

    public final boolean L(boolean z10) {
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
        this.f30686a1 = 0;
        F0(sparseArrayArr[0]);
        is0 is0Var = this.U;
        if (is0Var != null) {
            is0Var.h();
            is0Var.j();
        }
        d1(false);
        u1(z10);
        dv0 dv0Var = this.R;
        if (dv0Var != null) {
            dv0Var.f25657w.clear();
        }
        return true;
    }

    public final void L0(float f7) {
        mu0 mu0Var;
        int i10;
        int i11;
        mu0 mu0Var2;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        mu0[] mu0VarArr = this.f30710k0;
        if (i12 != 0 || mu0VarArr[1].getVisibility() == 0) {
            if (this.f30705h1) {
                mu0VarArr[0].setTranslationX((-f7) * mu0Var2.getMeasuredWidth());
                mu0VarArr[1].setTranslationX(mu0VarArr[0].getMeasuredWidth() - (mu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                mu0VarArr[0].setTranslationX(mu0Var.getMeasuredWidth() * f7);
                mu0VarArr[1].setTranslationX((mu0VarArr[0].getMeasuredWidth() * f7) - mu0VarArr[0].getMeasuredWidth());
            }
            O0(getTabProgress());
            float a02 = a0(f7);
            this.f30719p0 = a02;
            int i13 = 4;
            if (a02 != 0.0f && D() && !r0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            this.f30724r0.setVisibility(i10);
            org.telegram.ui.ActionBar.u0 u0Var = this.f30715n0;
            if (u0Var != null && !D()) {
                if (x0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                u0Var.setVisibility(i11);
                this.f30717o0 = 0.0f;
            } else {
                this.f30717o0 = b0(f7);
                w1();
            }
            s1(false);
            if (i12 == 0) {
                mu0 mu0Var3 = mu0VarArr[0];
                mu0VarArr[0] = mu0VarArr[1];
                mu0VarArr[1] = mu0Var3;
                mu0Var3.setVisibility(8);
                if (u0Var != null && this.f30739x0 == 2) {
                    if (x0()) {
                        i13 = 8;
                    }
                    u0Var.setVisibility(i13);
                }
                this.f30739x0 = 0;
                h1();
            }
        }
    }

    public boolean N() {
        return this instanceof h40;
    }

    public void N0() {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (!x0() && !r0()) {
            z10 = false;
        } else {
            z10 = true;
        }
        ov0 ov0Var = this.f30697e0.f29724w;
        if (ov0Var != null) {
            if (z10 && getClosestTab() == 9) {
                z13 = true;
            } else {
                z13 = false;
            }
            ov0Var.b(z13);
        }
        ov0 ov0Var2 = this.f30692c0.f29724w;
        if (ov0Var2 != null) {
            if (z10 && getClosestTab() == 8) {
                z12 = true;
            } else {
                z12 = false;
            }
            ov0Var2.b(z12);
        }
        for (sv0 sv0Var : this.Y1.values()) {
            rv0 rv0Var = sv0Var.f30339c;
            if (rv0Var.f29723s != null) {
                ov0 ov0Var3 = rv0Var.f29724w;
                if (z10 && getClosestTab() == sv0Var.f30337a) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ov0Var3.b(z11);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.f30715n0;
        if (u0Var != null) {
            gt0 gt0Var = this.J0;
            if (gt0Var != null && gt0Var.a() && getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            u0Var.setSearchFieldHint(LocaleController.getString(i10));
        }
        I();
    }

    public final boolean O(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x10 = (-view.getX()) - getX();
        mu0[] mu0VarArr = this.f30710k0;
        motionEvent.offsetLocation(x10 - mu0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - mu0VarArr[0].getY()) - mu0VarArr[0].h.getFastScroll().getY());
        return mu0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public void O0(float f7) {
        G0();
    }

    public void P(Canvas canvas, float f7, Rect rect, Paint paint) {
        canvas.drawRect(rect, paint);
    }

    public final void Q(Canvas canvas, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            mu0[] mu0VarArr = this.f30710k0;
            if (i10 < mu0VarArr.length) {
                mu0 mu0Var = mu0VarArr[i10];
                if (mu0Var != null && mu0Var.getVisibility() == 0) {
                    for (int i11 = 0; i11 < mu0VarArr[i10].h.getChildCount(); i11++) {
                        View childAt = mu0VarArr[i10].h.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + mu0VarArr[i10].h.V2) {
                            int save = canvas.save();
                            canvas.translate(childAt.getX() + mu0VarArr[i10].getX(), childAt.getY() + mu0VarArr[i10].h.getY() + mu0VarArr[i10].getY() + getY());
                            childAt.draw(canvas);
                            if (arrayList != null && (childAt instanceof hw0)) {
                                arrayList.add((hw0) childAt);
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

    public final void Q0(org.telegram.ui.ActionBar.n2 n2Var, long j10, int i10) {
        new org.telegram.ui.k61(n2Var, j10, this.f30713m1[1], new ai.k4(this, j10, i10)).show();
    }

    public final boolean R(int i10) {
        iv0[] iv0VarArr = this.f30732u1.f28315n;
        if (iv0VarArr == null) {
            return false;
        }
        iv0[] iv0VarArr2 = this.f30730t1;
        if (i10 == 0) {
            iv0 iv0Var = iv0VarArr2[i10];
            if (!iv0Var.h) {
                int[] iArr = iv0Var.f27366f;
                int[] iArr2 = iv0VarArr[i10].f27366f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = iv0VarArr2[i10].f27366f;
            int[] iArr4 = iv0VarArr[i10].f27366f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        iv0VarArr2[i10].f27363a.addAll(iv0VarArr[i10].f27363a);
        iv0VarArr2[i10].f27365c.addAll(iv0VarArr[i10].f27365c);
        for (Map.Entry entry : iv0VarArr[i10].d.entrySet()) {
            iv0VarArr2[i10].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i11 = 0; i11 < 2; i11++) {
            iv0VarArr2[i10].f27364b[i11] = iv0VarArr[i10].f27364b[i11].clone();
            iv0 iv0Var2 = iv0VarArr2[i10];
            int[] iArr5 = iv0Var2.f27369j;
            iv0 iv0Var3 = iv0VarArr[i10];
            iArr5[i11] = iv0Var3.f27369j[i11];
            iv0Var2.f27368i[i11] = iv0Var3.f27368i[i11];
        }
        iv0VarArr2[i10].e.addAll(iv0VarArr[i10].e);
        return !iv0VarArr[i10].f27363a.isEmpty();
    }

    public final void R0(org.telegram.ui.ActionBar.n2 n2Var, long j10, int i10) {
        f5.u0(n2Var, LocaleController.getString(R.string.Delete), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesAlbumMenuDeleteAlbumAsk, getStoriesController().w(i10, j10))), LocaleController.getString(R.string.Delete), true, new ai.zb(this, j10, i10, 8));
    }

    public final void S(int i10, im0 im0Var, boolean z10) {
        ArrayList arrayList = this.f30730t1[i10].e;
        int L0 = ((s4.b0) im0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            ru0 ru0Var = null;
            if (arrayList != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (L0 <= ((ru0) arrayList.get(i11)).f30054b) {
                        ru0Var = (ru0) arrayList.get(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                if (ru0Var == null) {
                    ru0Var = (ru0) i2.e.h(1, arrayList);
                }
            }
            if (ru0Var != null) {
                A0(i10, ru0Var.d, ru0Var.f30054b + 1, z10);
            }
        }
    }

    public final void S0(org.telegram.ui.ActionBar.n2 n2Var, long j10, int i10) {
        String w9 = getStoriesController().w(i10, j10);
        Context context = n2Var.getContext();
        org.telegram.ui.ActionBar.d6 resourceProvider = n2Var.getResourceProvider();
        j2.d dVar = new j2.d(this, j10, i10, 6);
        Pattern pattern = f5.f26101a;
        f5.Q(context, n2Var, LocaleController.getString(R.string.StoriesAlbumRename), LocaleController.getString(R.string.StoriesAlbumRenameHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), w9, 12, LocaleController.getString(R.string.Rename), resourceProvider, dVar);
    }

    public final void T() {
        mu0[] mu0VarArr;
        mu0 mu0Var;
        boolean z10;
        int i10;
        s4.g0 adapter;
        if (this.f30718o1) {
            int i11 = 0;
            while (true) {
                mu0VarArr = this.f30710k0;
                if (i11 < mu0VarArr.length) {
                    mu0Var = mu0VarArr[i11];
                    if (mu0Var.F == this.f30720p1) {
                        break;
                    }
                    i11++;
                } else {
                    mu0Var = null;
                    break;
                }
            }
            if (mu0Var != null) {
                boolean q02 = q0(mu0Var.F);
                float f7 = this.f30716n1;
                float f10 = 1.0f;
                int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                iv0[] iv0VarArr = this.f30730t1;
                if (i12 == 0) {
                    this.f30718o1 = false;
                    int i13 = this.f30722q1;
                    int[] iArr = this.f30713m1;
                    iArr[q02 ? 1 : 0] = i13;
                    if (!q02) {
                        SharedConfig.setMediaColumnsCount(i13);
                    } else if (c0(mu0Var.F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(this.f30722q1);
                    }
                    for (int i14 = 0; i14 < mu0VarArr.length; i14++) {
                        mu0 mu0Var2 = mu0VarArr[i14];
                        if (mu0Var2 != null && mu0Var2.h != null && (((i10 = mu0Var2.F) == 0 || q0(i10)) && (adapter = mu0VarArr[i14].h.getAdapter()) != null)) {
                            int h = adapter.h();
                            if (i14 == 0) {
                                iv0VarArr[0].g(false);
                            }
                            mu0VarArr[i14].f28611r.setVisibility(8);
                            mu0VarArr[i14].f28614x.y1(iArr[q02 ? 1 : 0]);
                            mu0VarArr[i14].h.a0();
                            mu0VarArr[i14].h.invalidate();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(mu0VarArr[i14].h);
                            } else {
                                adapter.l();
                            }
                        }
                    }
                    if (this.f30726s >= 0) {
                        for (int i15 = 0; i15 < mu0VarArr.length; i15++) {
                            mu0 mu0Var3 = mu0VarArr[i15];
                            if (mu0Var3.F == this.f30720p1) {
                                View m10 = mu0Var3.f28612s.m(this.f30726s);
                                if (m10 != null) {
                                    this.v = m10.getTop();
                                }
                                mu0 mu0Var4 = mu0VarArr[i15];
                                mu0Var4.f28614x.h1(this.f30726s, (-mu0Var4.h.getPaddingTop()) + this.v);
                            }
                        }
                        return;
                    }
                    Z0();
                } else if (f7 == 0.0f) {
                    this.f30718o1 = false;
                    if (this.f30720p1 == 0) {
                        iv0VarArr[0].g(false);
                    }
                    mu0Var.f28611r.setVisibility(8);
                    mu0Var.h.invalidate();
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
                    ofFloat.addUpdateListener(new it0(this, mu0Var, 0));
                    ofFloat.addListener(new org.telegram.ui.vi(this, z10, q02 ? 1 : 0, mu0Var));
                    ofFloat.setInterpolator(bs.f25014f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                }
            }
        }
    }

    public final void T0(String str) {
        boolean shouldShowUrlInAlert = AndroidUtilities.shouldShowUrlInAlert(str);
        org.telegram.ui.ActionBar.n2 n2Var = this.f30734v1;
        if (shouldShowUrlInAlert) {
            f5.p0(n2Var, str, true, true);
        } else {
            pf.d.r(n2Var.getParentActivity(), str);
        }
    }

    public final void U(int i10) {
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

    public int U0() {
        return -1;
    }

    public final String V(boolean z10) {
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        is0 is0Var;
        if (!s0()) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        if (z10 && (is0Var = this.U) != null) {
            return is0Var.getBotPreviewsSubtitle();
        }
        bu0 bu0Var = this.f30692c0;
        if (bu0Var != null && bu0Var.f29723s != null) {
            i10 = 0;
            i11 = 0;
            for (int i12 = 0; i12 < bu0Var.f29723s.f5151i.size(); i12++) {
                MessageObject messageObject = (MessageObject) bu0Var.f29723s.f5151i.get(i12);
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

    public final void V0(ArrayList arrayList, boolean z10) {
        boolean z11;
        boolean z12;
        bu0 bu0Var = this.f30692c0;
        if (bu0Var != null && bu0Var.f29723s != null) {
            org.telegram.ui.ActionBar.n2 n2Var = this.f30734v1;
            if (z10 && arrayList.size() > n2Var.getMessagesController().storiesPinnedToTopCountMax) {
                xc.a0(n2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", n2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
                return;
            }
            ci.a7 a7Var = bu0Var.f29723s;
            int i10 = a7Var.f5148c;
            ArrayList arrayList2 = a7Var.f5150g;
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
                    a7Var.d(true);
                    TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                    tL_togglePinnedToTop.f20522id.addAll(arrayList2);
                    tL_togglePinnedToTop.peer = MessagesController.getInstance(i10).getInputPeer(a7Var.d);
                    ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new ci.e6(2));
                }
                z13 = z11;
            }
            if (z13) {
                xc.a0(n2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", n2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
            } else if (z10) {
                xc.a0(n2Var).M(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinned", arrayList.size(), new Object[0])), LocaleController.formatPluralString("StoriesPinnedText", arrayList.size(), new Object[0]), R.raw.ic_pin).j();
            } else {
                xc.a0(n2Var).Q(R.raw.ic_unpin, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesUnpinned", arrayList.size(), new Object[0]))).j();
            }
        }
    }

    public final mu0 W(int i10) {
        int i11 = 0;
        while (true) {
            mu0[] mu0VarArr = this.f30710k0;
            if (i11 < mu0VarArr.length) {
                mu0 mu0Var = mu0VarArr[i11];
                if (mu0Var != null && mu0Var.F == i10) {
                    return mu0Var;
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    public final boolean W0(MotionEvent motionEvent, boolean z10) {
        int i10;
        mu0 mu0Var;
        is0 is0Var;
        int i11;
        int i12;
        int closestTab = getClosestTab();
        jt0 jt0Var = this.I0;
        SparseIntArray sparseIntArray = jt0Var.O;
        int i13 = jt0Var.f24360n;
        int i14 = -1;
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i15 = sparseIntArray.get(i13 + i10, -1);
        os0 os0Var = this.W;
        if (os0Var != null) {
            if (!y0(closestTab) && closestTab != 8) {
                if (y0(i15) || i15 == 8) {
                    i14 = os0Var.getCurrentAlbumId();
                }
            } else {
                c91 c91Var = os0Var.f36521n;
                SparseIntArray sparseIntArray2 = c91Var.f25130b0;
                int i16 = c91Var.F;
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
                i15 = k1(i14).f30337a;
            }
        }
        if (i15 >= 0) {
            org.telegram.ui.ActionBar.u0 u0Var = this.f30715n0;
            if (u0Var != null && !D()) {
                if (x0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                u0Var.setVisibility(i11);
                this.f30717o0 = 0.0f;
            } else {
                this.f30717o0 = b0(0.0f);
                v1(0.0f);
            }
            if ((!this.V0 || getSelectedTab() != 11) && (!C() || !this.C1 || (getClosestTab() != 8 && !y0(getClosestTab())))) {
                mu0[] mu0VarArr = this.f30710k0;
                mu0 mu0Var2 = mu0VarArr[0];
                if (mu0Var2 != null && mu0Var2.F == 13 && (is0Var = this.U) != null) {
                    di.a aVar = is0Var.f8074n;
                    if (!z10) {
                    }
                }
                mu0 mu0Var3 = mu0VarArr[0];
                js0 js0Var = this.V;
                if (mu0Var3 != null && mu0Var3.F == 14 && js0Var != null) {
                    yh.u1 u1Var = js0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.C1 || (mu0Var = mu0VarArr[0]) == null || mu0Var.F != 13) && ((js0Var == null || !js0Var.g()) && (os0Var == null || !os0Var.f36524w))) {
                    s1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    l0();
                    this.f30743y1 = false;
                    this.f30740x1 = true;
                    P0(true);
                    this.f30745z1 = (int) motionEvent.getX();
                    this.G.setEnabled(false);
                    jt0Var.setEnabled(false);
                    mu0 mu0Var4 = mu0VarArr[1];
                    mu0Var4.F = i15;
                    mu0Var4.setVisibility(0);
                    this.f30705h1 = z10;
                    o1(true);
                    if (z10) {
                        mu0VarArr[1].setTranslationX(mu0VarArr[0].getMeasuredWidth());
                    } else {
                        mu0VarArr[1].setTranslationX(-mu0VarArr[0].getMeasuredWidth());
                    }
                    O0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
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
        return Utilities.clamp(i14, 9, (this.f30711k1 && i10 == 1) ? 2 : 2);
    }

    public final int Y(boolean z10) {
        int i10;
        int i11 = this.X1;
        if (z10) {
            i10 = AndroidUtilities.dp(52.0f);
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public final void Y0(s4.g0 g0Var) {
        if (g0Var instanceof nv0) {
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
            av0 av0Var = this.N;
            if (g0Var == av0Var) {
                av0Var.f24712r = null;
            }
        }
    }

    public final int Z(int i10) {
        int i11;
        int d02 = d0(i10) + AndroidUtilities.dp(54.0f) + this.f30690b2;
        if (i10 == 9) {
            i11 = AndroidUtilities.dp(64.0f);
        } else {
            i11 = 0;
        }
        return d02 + i11;
    }

    public final void Z0() {
        int i10;
        int i11 = 0;
        while (true) {
            mu0[] mu0VarArr = this.f30710k0;
            if (i11 < mu0VarArr.length) {
                ss0 ss0Var = mu0VarArr[i11].h;
                if (ss0Var != null) {
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < ss0Var.getChildCount(); i14++) {
                        View childAt = ss0Var.getChildAt(i14);
                        if (childAt instanceof org.telegram.ui.Cells.s7) {
                            org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) childAt;
                            int messageId = s7Var.getMessageId();
                            i13 = s7Var.getTop();
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
                        int i15 = mu0VarArr[i11].F;
                        int i16 = -1;
                        if (q0(i15)) {
                            qv0 m12 = m1(i15);
                            if (m12 != null && m12.f29723s != null) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= m12.f29723s.f5151i.size()) {
                                        break;
                                    } else if (i12 == ((MessageObject) m12.f29723s.f5151i.get(i17)).getId()) {
                                        i16 = i17;
                                        break;
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                            i10 = i16;
                        } else if (i15 >= 0) {
                            iv0[] iv0VarArr = this.f30730t1;
                            if (i15 < iv0VarArr.length) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= iv0VarArr[i15].f27363a.size()) {
                                        break;
                                    } else if (i12 == ((MessageObject) iv0VarArr[i15].f27363a.get(i18)).getId()) {
                                        i16 = i18;
                                        break;
                                    } else {
                                        i18++;
                                    }
                                }
                                i10 = iv0VarArr[i15].f27372m + i16;
                            }
                        }
                        if (i16 >= 0) {
                            ((s4.b0) ss0Var.getLayoutManager()).h1(i10, (-mu0VarArr[i11].h.getPaddingTop()) + i13);
                            if (this.f30718o1) {
                                mu0 mu0Var = mu0VarArr[i11];
                                mu0Var.f28612s.h1(i10, (-mu0Var.h.getPaddingTop()) + i13);
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

    public final float a0(float f7) {
        int i10;
        int i11;
        int i12;
        int i13;
        float f10 = 0.0f;
        if (r0()) {
            return 0.0f;
        }
        mu0[] mu0VarArr = this.f30710k0;
        mu0 mu0Var = mu0VarArr[1];
        js0 js0Var = this.V;
        if (mu0Var != null && ((i12 = mu0Var.F) == 0 || (((i12 == 8 || y0(i12)) && TextUtils.isEmpty(getStoriesHashtag())) || (i13 = mu0VarArr[1].F) == 9 || i13 == 11 || i13 == 13 || (i13 == 14 && js0Var != null)))) {
            f10 = 0.0f + f7;
        }
        mu0 mu0Var2 = mu0VarArr[0];
        if (mu0Var2 != null && ((i10 = mu0Var2.F) == 0 || (((i10 == 8 || y0(i10)) && TextUtils.isEmpty(getStoriesHashtag())) || (i11 = mu0VarArr[0].F) == 9 || i11 == 11 || i11 == 13 || (i11 == 14 && js0Var != null)))) {
            return (1.0f - f7) + f10;
        }
        return f10;
    }

    public final void a1(int i10) {
        jt0 jt0Var;
        if (!this.L1 && (jt0Var = this.I0) != null) {
            jt0Var.h(null, i10, jt0Var.P.get(i10));
        }
    }

    @Override
    public final boolean b() {
        return false;
    }

    public final float b0(float f7) {
        float f10 = 0.0f;
        if (r0()) {
            return 0.0f;
        }
        mu0[] mu0VarArr = this.f30710k0;
        mu0 mu0Var = mu0VarArr[1];
        if (mu0Var != null && u0(mu0Var.F) && mu0VarArr[1].F != 11) {
            f10 = 0.0f + f7;
        }
        mu0 mu0Var2 = mu0VarArr[0];
        if (mu0Var2 != null && u0(mu0Var2.F) && mu0VarArr[0].F != 11) {
            return (1.0f - f7) + f10;
        }
        return f10;
    }

    public final void b1(float f7, int i10) {
        int i11;
        jt0 jt0Var = this.I0;
        if (jt0Var != null) {
            if (y0(i10)) {
                i11 = 8;
            } else {
                i11 = i10;
            }
            jt0Var.j(f7, i11);
        }
        os0 os0Var = this.W;
        if (os0Var != null) {
            c91 c91Var = os0Var.f36521n;
            if (y0(i10)) {
                c91Var.f(f7, j1(i10));
            } else if (i10 == 8) {
                c91Var.f(f7, 0);
            }
        }
    }

    public final int c0(int i10) {
        qv0 m12;
        ci.a7 a7Var;
        if (q0(i10) && (m12 = m1(i10)) != null && (a7Var = m12.f29723s) != null) {
            return a7Var.g();
        }
        return 0;
    }

    public final void c1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i10 = 0;
        while (true) {
            mu0[] mu0VarArr = this.f30710k0;
            if (i10 < mu0VarArr.length) {
                mu0 mu0Var = mu0VarArr[i10];
                if (mu0Var.F != 7 || mu0Var.h.getAdapter() == null || mu0VarArr[i10].h.getAdapter().h() == 0 || this.f30734v1.getMessagesController().getStoriesController().f5499j.size() <= 0) {
                    i10++;
                } else {
                    return;
                }
            } else {
                if (this.F == 0) {
                    du0 du0Var = this.f30685a0;
                    du0Var.d = chatFull;
                    du0Var.e = arrayList;
                }
                y1(true);
                for (int i11 = 0; i11 < mu0VarArr.length; i11++) {
                    mu0 mu0Var2 = mu0VarArr[i11];
                    if (mu0Var2.F == 7 && mu0Var2.h.getAdapter() != null) {
                        AndroidUtilities.notifyDataSetChanged(mu0VarArr[i11].h);
                    }
                }
                return;
            }
        }
    }

    public final int d0(int i10) {
        float f7;
        os0 os0Var = this.W;
        if (os0Var != null && (y0(i10) || i10 == 8)) {
            f7 = os0Var.getVisibilityFactor() * AndroidUtilities.dp(40.0f);
        } else {
            f7 = 0.0f;
        }
        return (int) f7;
    }

    public void d1(boolean z10) {
        float f7;
        if (this.C1 != z10) {
            this.C1 = z10;
            AnimatorSet animatorSet = this.N1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ha haVar = this.B0;
            if (z10) {
                haVar.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.N1 = animatorSet2;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(haVar, View.ALPHA, f7));
            this.N1.setDuration(180L);
            this.N1.addListener(new org.telegram.ui.fo(20, this, z10));
            this.N1.start();
            if (z10) {
                x1();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r42, int r43, java.lang.Object... r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tv0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        jt0 jt0Var = this.I0;
        if (jt0Var != null) {
            canvas.save();
            canvas.translate(jt0Var.getX(), jt0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        ft0 ft0Var = this.R0;
        if (ft0Var != null) {
            int i10 = ft0Var.U;
            if ((i10 == 3 || i10 == 1) && this.P0 == null) {
                canvas.save();
                canvas.translate(ft0Var.getX(), ft0Var.getY());
                ft0Var.setDrawOverlay(true);
                ft0Var.draw(canvas);
                ft0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i10;
        if (view == this.R0 && this.P0 == null) {
            canvas.save();
            mu0[] mu0VarArr = this.f30710k0;
            float top = mu0VarArr[0].getTop();
            os0 os0Var = this.W;
            if (os0Var != null && ((i10 = mu0VarArr[0].F) == 8 || y0(i10))) {
                top -= os0Var.getVisualHeight();
            }
            canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + AndroidUtilities.dp(12.0f));
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e1(int r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tv0.e1(int, boolean):void");
    }

    @Override
    public final void f(org.telegram.ui.Cells.r2 r2Var) {
        int i10;
        org.telegram.ui.ActionBar.n2 n2Var = this.f30734v1;
        if (n2Var != null && n2Var.getMessagesController().getStoriesController().I(r2Var.getDialogId())) {
            n2Var.getOrCreateStoryViewer().getClass();
            ci.aa orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
            Context context = n2Var.getContext();
            long dialogId = r2Var.getDialogId();
            ci.r7 a2 = ci.r7.a((im0) r2Var.getParent());
            if ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).f33709t1) {
                i10 = AndroidUtilities.dp(68.0f);
            } else {
                i10 = 0;
            }
            a2.f5929s += i10;
            orCreateStoryViewer.D(context, dialogId, a2);
        }
    }

    public final void f1(int i10) {
        int j12 = j1(getClosestTab());
        os0 os0Var = this.W;
        if (j12 != i10) {
            if (os0Var != null) {
                os0Var.f36521n.d(i10, os0Var.f36523s.i(i10));
                return;
            }
            return;
        }
        os0Var.setReorderingAlbums(true);
        sv0 k12 = k1(i10);
        mu0 W = W(k12.f30337a);
        if (W == null) {
            return;
        }
        ss0 ss0Var = W.h;
        for (int i11 = 0; i11 < ss0Var.getChildCount(); i11++) {
            View childAt = ss0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.s7) {
                ((org.telegram.ui.Cells.s7) childAt).l(true, true);
            }
        }
        rv0 rv0Var = k12.f30339c;
        if (rv0Var != null && !rv0Var.f29725x) {
            rv0Var.f29725x = true;
        }
        s1(true);
    }

    public final float g0(int i10, boolean z10) {
        float width = getWidth();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            mu0[] mu0VarArr = this.f30710k0;
            if (i11 >= mu0VarArr.length) {
                break;
            }
            mu0 mu0Var = mu0VarArr[i11];
            if (mu0Var != null) {
                int i13 = mu0Var.F;
                if ((z10 && i10 == 8 && y0(i13)) || i13 == i10) {
                    i12++;
                    width = mu0VarArr[i11].getTranslationX();
                }
            }
            i11++;
        }
        if (i12 == 2) {
            return 0.0f;
        }
        return width;
    }

    public final void g1(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tv0.g1(boolean):void");
    }

    public SparseArray<MessageObject> getActionModeSelected() {
        return this.Z0[0];
    }

    public float getBottomButtonStoriesVisibility() {
        mu0 mu0Var;
        mu0 mu0Var2;
        boolean z10;
        boolean z11;
        ci.a7 a7Var;
        ci.a7 a7Var2;
        float f7 = 1.0f;
        mu0[] mu0VarArr = this.f30710k0;
        if (mu0VarArr == null || (mu0Var = mu0VarArr[0]) == null || (mu0Var2 = mu0VarArr[1]) == null || mu0Var.f28613w == null || mu0Var2.f28613w == null) {
            return 1.0f;
        }
        int i10 = mu0Var.F;
        int i11 = mu0Var2.F;
        if (!y0(i10) && i10 != 8) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!y0(i11) && i11 != 8) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z10 && !z11) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - mu0VarArr[0].f28613w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - mu0VarArr[1].f28613w.getVisibilityFactor();
        qv0 m12 = m1(mu0VarArr[0].F);
        if (i10 == 8 || (m12 != null && (a7Var2 = m12.f29723s) != null && a7Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        qv0 m13 = m1(i11);
        if (i11 != 8 && (m13 == null || (a7Var = m13.f29723s) == null || a7Var.g() <= 0)) {
            f7 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f7;
        }
        if (!z11) {
            f7 = visibilityFactor;
        }
        return AndroidUtilities.lerp(visibilityFactor, f7, Math.abs(mu0VarArr[0].getTranslationX() / mu0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        mu0[] mu0VarArr = this.f30710k0;
        mu0 mu0Var = mu0VarArr[1];
        if (mu0Var != null && mu0Var.getVisibility() == 0) {
            if (this.f30703g1 && !this.f30707i1) {
                return mu0VarArr[1].F;
            }
            if (Math.abs(mu0VarArr[1].getTranslationX()) < mu0VarArr[1].getMeasuredWidth() / 2.0f) {
                return mu0VarArr[1].F;
            }
        }
        return getSelectedTab();
    }

    public im0 getCurrentListView() {
        zt0 zt0Var;
        mu0 mu0Var = this.f30710k0[0];
        int i10 = mu0Var.F;
        if (i10 == 13) {
            return this.U.getCurrentListView();
        }
        if (i10 == 14) {
            return this.V.getCurrentListView();
        }
        if (i10 == 12 && (zt0Var = this.T) != null) {
            return zt0Var.f41491a.f40903x0;
        }
        return mu0Var.h;
    }

    public int getInitialTab() {
        return 0;
    }

    public int getPhotosVideosTypeFilter() {
        return this.f30730t1[0].f27376q;
    }

    public TextView getSaveItem() {
        return this.f30721q0;
    }

    public org.telegram.ui.ActionBar.u0 getSearchItem() {
        return this.f30715n0;
    }

    public xj0 getSearchOptionsItem() {
        return this.f30727s0;
    }

    public int getSelectedTab() {
        int currentTabId = this.I0.getCurrentTabId();
        os0 os0Var = this.W;
        if (os0Var != null && currentTabId == 8) {
            int currentAlbumId = os0Var.getCurrentAlbumId();
            if (currentAlbumId == 0) {
                return 8;
            }
            if (currentAlbumId > 0) {
                return k1(currentAlbumId).f30337a;
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
            mu0[] mu0VarArr = this.f30710k0;
            if (i10 < mu0VarArr.length) {
                mu0 mu0Var = mu0VarArr[i10];
                if (mu0Var != null) {
                    f7 = ((1.0f - Math.abs(mu0Var.getTranslationX() / getWidth())) * mu0Var.F) + f7;
                }
                i10++;
            } else {
                return f7;
            }
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.j6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.j6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.A0, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f21394z6));
        org.telegram.ui.ActionBar.u0 u0Var = this.f30712l0;
        xj0 iconView = u0Var.getIconView();
        int i10 = org.telegram.ui.ActionBar.h6.f21379y8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(iconView, 8, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.h6.f21396z8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var, 32, null, null, null, null, i11));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f30731u0;
        if (u0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var2.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var2, 32, null, null, null, null, i11));
        }
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f30729t0;
        if (u0Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var3.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var3, 32, null, null, null, null, i11));
        }
        Drawable[] drawableArr = {this.D0};
        ImageView imageView = this.C0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 8, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 32, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.f20989d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.B0, 1, null, null, null, null, i12));
        jt0 jt0Var = this.I0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(jt0Var, 1, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.h6.f21346wc;
        org.telegram.ui.Cells.w0 w0Var = this.K0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21123kd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(jt0Var, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Gh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(jt0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.Fh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(jt0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.Eh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(jt0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.Hh));
        ft0 ft0Var = this.R0;
        if (ft0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(ft0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21323v7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(ft0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21342w7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(ft0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21306u7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(ft0Var, 33554436, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21286t7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(ft0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21360x7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(ft0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21378y7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(ft0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.A7));
        }
        final int i14 = 0;
        while (true) {
            mu0[] mu0VarArr = this.f30710k0;
            if (i14 < mu0VarArr.length) {
                org.telegram.ui.ActionBar.i6 i6Var = new org.telegram.ui.ActionBar.i6() {
                    @Override
                    public final void b() {
                        mu0[] mu0VarArr2 = tv0.this.f30710k0;
                        int i15 = i14;
                        ss0 ss0Var = mu0VarArr2[i15].h;
                        if (ss0Var != null) {
                            int childCount = ss0Var.getChildCount();
                            for (int i16 = 0; i16 < childCount; i16++) {
                                View childAt = mu0VarArr2[i15].h.getChildAt(i16);
                                if (childAt instanceof org.telegram.ui.Cells.t7) {
                                    org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                                    for (int i17 = 0; i17 < 6; i17++) {
                                        t7Var.f23199a[i17].e.invalidate();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                                    ((org.telegram.ui.Cells.h6) childAt).v(0);
                                } else if (childAt instanceof org.telegram.ui.Cells.va) {
                                    ((org.telegram.ui.Cells.va) childAt).j(0);
                                }
                            }
                        }
                    }

                    @Override
                    public final void a(float f7) {
                    }
                };
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21110k0, null, null, org.telegram.ui.ActionBar.h6.f20990d7));
                bt0 bt0Var = mu0VarArr[i14].v;
                int i15 = org.telegram.ui.ActionBar.h6.f20989d6;
                arrayList.add(new org.telegram.ui.ActionBar.j6(bt0Var, 0, null, null, null, null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f21268s8));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f21078i6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].f28613w, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20971c7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 524288, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.h6.e7));
                int i16 = org.telegram.ui.ActionBar.h6.f21061h6;
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21315uh));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21152m6));
                int i17 = org.telegram.ui.ActionBar.h6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
                int i18 = org.telegram.ui.ActionBar.h6.f21377y6;
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, null, null, -1, i6Var, i18));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, null, null, -1, i6Var, org.telegram.ui.ActionBar.h6.f21172n6));
                Drawable[] drawableArr2 = org.telegram.ui.ActionBar.h6.f21240r0;
                int i19 = org.telegram.ui.ActionBar.h6.J7;
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, null, drawableArr2, null, i19));
                TextPaint[] textPaintArr = org.telegram.ui.ActionBar.h6.B0;
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.h6.D0}, null, -1, null, org.telegram.ui.ActionBar.h6.X8));
                TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.h6.C0;
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.h6.E0}, null, -1, null, org.telegram.ui.ActionBar.h6.Z8));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, drawableArr2, null, i19));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.O7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.P7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.Q7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.R7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.S7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.T7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.U7));
                int i20 = org.telegram.ui.ActionBar.h6.f21394z6;
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 4, new Class[]{gu0.class}, new String[]{"emptyTextView"}, null, null, -1, null, i20));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.A6));
                int i21 = org.telegram.ui.ActionBar.h6.Ih;
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 2048, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"progressView"}, null, null, -1, null, i21));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"statusImageView"}, null, null, -1, null, i21));
                int i22 = org.telegram.ui.ActionBar.h6.f21079i7;
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                int i23 = org.telegram.ui.ActionBar.h6.f21117k7;
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.zi));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Bi));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.h6.f21022f3, null, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.h6.f21039g3, null, null, i20));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.m7.class}, null, null, null, org.telegram.ui.ActionBar.h6.J6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.m7.class}, org.telegram.ui.ActionBar.h6.m0, null, null, org.telegram.ui.ActionBar.h6.K6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Kh));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 32, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Jh));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.n7.class}, null, null, null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 524288, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"textView"}, null, null, -1, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"textView"}, null, null, -1, null, i17));
                int i24 = org.telegram.ui.ActionBar.h6.Lh;
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.t7.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.t7.class}, null, null, i6Var, i22));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.t7.class}, null, null, i6Var, i23));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, i6Var, i22));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, i6Var, i23));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].h, 0, null, null, new Drawable[]{this.f30742y0}, null, org.telegram.ui.ActionBar.h6.f20951b7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].f28613w.d, 4, null, null, null, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.j6(mu0VarArr[i14].f28613w.e, 4, null, null, null, null, i18));
                i14++;
            } else {
                return arrayList;
            }
        }
    }

    public final float h0(int i10, boolean z10) {
        float f7 = 0.0f;
        int i11 = 0;
        while (true) {
            mu0[] mu0VarArr = this.f30710k0;
            if (i11 < mu0VarArr.length) {
                mu0 mu0Var = mu0VarArr[i11];
                if (mu0Var != null) {
                    int i12 = mu0Var.F;
                    if ((z10 && i10 == 8 && y0(i12)) || i12 == i10) {
                        f7 = (1.0f - Math.abs(mu0VarArr[i11].getTranslationX() / getWidth())) + f7;
                    }
                }
                i11++;
            } else {
                return f7;
            }
        }
    }

    public final void h1() {
        int i10 = 0;
        while (true) {
            mu0[] mu0VarArr = this.f30710k0;
            if (i10 < mu0VarArr.length) {
                int childCount = mu0VarArr[i10].h.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = mu0VarArr[i10].h.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.f2) {
                        ImageReceiver photoImage = ((org.telegram.ui.Cells.f2) childAt).getPhotoImage();
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

    public final int i0(int i10) {
        org.telegram.ui.ActionBar.d6 d6Var = this.F1;
        if (d6Var != null) {
            return d6Var.w(i10);
        }
        return org.telegram.ui.ActionBar.h6.x0(null, i10, false);
    }

    public final void i1(MotionEvent motionEvent) {
        float f7;
        float f10;
        boolean z10;
        float measuredWidth;
        mu0 mu0Var;
        mu0 mu0Var2;
        int measuredWidth2;
        mu0 mu0Var3;
        mu0 mu0Var4;
        boolean z11;
        VelocityTracker velocityTracker = this.B1;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.S0);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f7 = this.B1.getXVelocity();
                f10 = this.B1.getYVelocity();
                if (!this.f30740x1 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                    if (f7 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    W0(motionEvent, z11);
                }
            } else {
                f7 = 0.0f;
                f10 = 0.0f;
            }
            if (this.f30740x1) {
                mu0[] mu0VarArr = this.f30710k0;
                float x10 = mu0VarArr[0].getX();
                this.f30701f1 = new AnimatorSet();
                if (Math.abs(x10) < mu0VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f30707i1 = z10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new b80(this, 20));
                boolean z12 = this.f30707i1;
                Property property = View.TRANSLATION_X;
                if (z12) {
                    measuredWidth = Math.abs(x10);
                    if (this.f30705h1) {
                        this.f30701f1.playTogether(ObjectAnimator.ofFloat(mu0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(mu0VarArr[1], property, mu0Var4.getMeasuredWidth()), ofFloat);
                    } else {
                        this.f30701f1.playTogether(ObjectAnimator.ofFloat(mu0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(mu0VarArr[1], property, -mu0Var3.getMeasuredWidth()), ofFloat);
                    }
                } else {
                    measuredWidth = mu0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                    if (this.f30705h1) {
                        this.f30701f1.playTogether(ObjectAnimator.ofFloat(mu0VarArr[0], property, -mu0Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(mu0VarArr[1], property, 0.0f), ofFloat);
                    } else {
                        this.f30701f1.playTogether(ObjectAnimator.ofFloat(mu0VarArr[0], property, mu0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(mu0VarArr[1], property, 0.0f), ofFloat);
                    }
                }
                this.f30701f1.setInterpolator(f30683e2);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs = Math.abs(f7);
                if (abs > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                this.f30701f1.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                this.f30701f1.addListener(new mt0(this, 1));
                this.f30701f1.start();
                this.f30703g1 = true;
                this.f30740x1 = false;
                N0();
            } else {
                this.f30743y1 = false;
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

    public final boolean j0() {
        if (this.f30734v1.getConnectionsManager().getConnectionState() == 3) {
            return true;
        }
        return false;
    }

    public final int j1(int i10) {
        sv0 l1 = l1(i10);
        if (l1 == null) {
            return -1;
        }
        return l1.f30338b;
    }

    public final boolean k0() {
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

    public final sv0 k1(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.Y1;
        sv0 sv0Var = (sv0) hashMap.get(valueOf);
        if (sv0Var == null) {
            sv0 sv0Var2 = new sv0(this, getContext(), i10);
            hashMap.put(Integer.valueOf(i10), sv0Var2);
            this.Z1.put(Integer.valueOf(sv0Var2.f30337a), Integer.valueOf(i10));
            return sv0Var2;
        }
        return sv0Var;
    }

    public final void l0() {
        AndroidUtilities.cancelRunOnUIThread(this.M0);
        org.telegram.ui.Cells.w0 w0Var = this.K0;
        if (w0Var.getTag() == null) {
            return;
        }
        w0Var.setTag(null);
        AnimatorSet animatorSet = this.L0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.L0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.L0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.L0.playTogether(ObjectAnimator.ofFloat(w0Var, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(w0Var, View.TRANSLATION_Y, (-AndroidUtilities.dp(48.0f)) + this.O0));
        this.L0.setInterpolator(bs.f25015g);
        this.L0.addListener(new mt0(this, 0));
        this.L0.start();
    }

    public final sv0 l1(int i10) {
        Integer num = (Integer) this.Z1.get(Integer.valueOf(i10));
        if (num == null) {
            return null;
        }
        return (sv0) this.Y1.get(num);
    }

    public boolean m0() {
        return false;
    }

    public final qv0 m1(int i10) {
        sv0 l1;
        if (i10 == 8) {
            return this.f30692c0;
        }
        if (i10 == 9) {
            return this.f30697e0;
        }
        if (y0(i10) && (l1 = l1(i10)) != null) {
            return l1.f30339c;
        }
        return null;
    }

    public boolean n0() {
        return !(this instanceof h40);
    }

    public final qv0 n1(int i10) {
        sv0 l1;
        if (i10 == 8) {
            return this.f30695d0;
        }
        if (i10 == 9) {
            return this.f30700f0;
        }
        if (!y0(i10) || (l1 = l1(i10)) == null) {
            return null;
        }
        return l1.d;
    }

    public final void o0(ViewGroup viewGroup) {
        mu0[] mu0VarArr;
        for (mu0 mu0Var : this.f30710k0) {
            ss0 ss0Var = mu0Var.h;
            Objects.requireNonNull(ss0Var);
            mu0Var.f28610n = new bh.l(ss0Var, viewGroup, new aq0(ss0Var, 1));
        }
        js0 js0Var = this.V;
        if (js0Var != null) {
            js0Var.S = viewGroup;
            js0Var.R = new ei.m7(js0Var, 1);
        }
    }

    public final void o1(boolean r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tv0.o1(boolean):void");
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i10 = 0;
        while (true) {
            mu0[] mu0VarArr = this.f30710k0;
            if (i10 < mu0VarArr.length) {
                ss0 ss0Var = mu0VarArr[i10].h;
                if (ss0Var != null) {
                    ss0Var.getViewTreeObserver().addOnPreDrawListener(new pt0(this, i10, 0));
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!J() && !this.I0.H && !onTouchEvent(motionEvent)) {
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
        fu0 fu0Var = this.D1;
        if (fu0Var.f() != null) {
            i12 = fu0Var.f().getHeight();
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
            } else if (childAt instanceof mu0) {
                i13 = i10;
                measureChildWithMargins(childAt, i13, 0, View.MeasureSpec.makeMeasureSpec(i12, 1073741824), 0);
                ss0 ss0Var = ((mu0) childAt).h;
                ss0Var.setPadding(0, ss0Var.W2, 0, ss0Var.X2);
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
        if (!this.L1) {
            org.telegram.ui.ActionBar.n2 n2Var = this.f30734v1;
            if (n2Var.getParentLayout() != null && !((ActionBarLayout) n2Var.getParentLayout()).j() && !J() && !this.f30684a) {
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
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.f30740x1 && !this.f30743y1 && motionEvent.getY() >= AndroidUtilities.dp(90.0f)) {
                    this.f30737w1 = motionEvent.getPointerId(0);
                    this.f30743y1 = true;
                    this.f30745z1 = (int) motionEvent.getX();
                    this.A1 = (int) motionEvent.getY();
                    this.B1.clear();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f30737w1) {
                    int x10 = (int) (motionEvent.getX() - this.f30745z1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.A1);
                    boolean z13 = this.f30740x1;
                    mu0[] mu0VarArr = this.f30710k0;
                    if (z13 && (((z10 = this.f30705h1) && x10 > 0) || (!z10 && x10 < 0))) {
                        if (x10 < 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!W0(motionEvent, z11)) {
                            this.f30743y1 = true;
                            this.f30740x1 = false;
                            P0(false);
                            mu0VarArr[0].setTranslationX(0.0f);
                            mu0 mu0Var = mu0VarArr[1];
                            if (this.f30705h1) {
                                i11 = mu0VarArr[0].getMeasuredWidth();
                            } else {
                                i11 = -mu0VarArr[0].getMeasuredWidth();
                            }
                            mu0Var.setTranslationX(i11);
                            b1(0.0f, mu0VarArr[1].F);
                            O0(getTabProgress());
                        }
                    }
                    if (this.f30743y1 && !this.f30740x1) {
                        if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                            if (x10 < 0) {
                                z12 = true;
                            }
                            W0(motionEvent, z12);
                        }
                    } else if (this.f30740x1) {
                        mu0VarArr[0].setTranslationX(x10);
                        if (this.f30705h1) {
                            mu0VarArr[1].setTranslationX(mu0VarArr[0].getMeasuredWidth() + x10);
                        } else {
                            mu0VarArr[1].setTranslationX(x10 - mu0VarArr[0].getMeasuredWidth());
                        }
                        float abs2 = Math.abs(x10) / mu0VarArr[0].getMeasuredWidth();
                        if (!D()) {
                            this.f30717o0 = 0.0f;
                        } else {
                            this.f30717o0 = b0(abs2);
                            v1(abs2);
                            float a02 = a0(abs2);
                            this.f30719p0 = a02;
                            if (a02 != 0.0f && D() && !r0()) {
                                i10 = 0;
                            } else {
                                i10 = 4;
                            }
                            this.f30724r0.setVisibility(i10);
                        }
                        s1(false);
                        b1(abs2, mu0VarArr[1].F);
                        O0(getTabProgress());
                        N0();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f30737w1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    i1(motionEvent);
                }
                return this.f30740x1;
            }
        }
        return false;
    }

    public final void p1() {
        yt0 yt0Var = this.H;
        if (yt0Var != null) {
            yt0Var.l();
        }
        gv0 gv0Var = this.K;
        if (gv0Var != null) {
            gv0Var.l();
        }
        gv0 gv0Var2 = this.L;
        if (gv0Var2 != null) {
            gv0Var2.l();
        }
        hv0 hv0Var = this.J;
        if (hv0Var != null) {
            hv0Var.X(false);
        }
        gv0 gv0Var3 = this.M;
        if (gv0Var3 != null) {
            gv0Var3.l();
        }
        av0 av0Var = this.N;
        if (av0Var != null) {
            av0Var.l();
        }
        hu0 hu0Var = this.O;
        if (hu0Var != null) {
            hu0Var.l();
        }
        bu0 bu0Var = this.f30692c0;
        if (bu0Var != null) {
            bu0Var.l();
        }
        for (sv0 sv0Var : this.Y1.values()) {
            sv0Var.f30339c.l();
        }
    }

    public final void q1(mu0 mu0Var, boolean z10) {
        boolean z11;
        Integer num = 1;
        int i10 = 0;
        if (mu0Var.f28607b && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        pl0 fastScroll = mu0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = mu0Var.f28608c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            mu0Var.f28608c.cancel();
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
            mu0Var.f28608c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(num);
        } else if (!z11 && fastScroll.getTag() != null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, property, fastScroll.getAlpha(), 0.0f);
            ofFloat2.addListener(new org.telegram.ui.fo(fastScroll));
            mu0Var.f28608c = ofFloat2;
            ofFloat2.setDuration(150L).start();
            fastScroll.animate().setListener(null).cancel();
            fastScroll.setTag(null);
        }
    }

    public boolean r0() {
        return false;
    }

    public final void r1() {
        boolean z10;
        float f7;
        org.telegram.ui.ActionBar.u0 u0Var = this.f30729t0;
        if (u0Var != null) {
            if (!this.f30734v1.getMessagesController().isPeerNoForwards(this.f30709j1) && !k0()) {
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
                u0Var.setBackground(org.telegram.ui.ActionBar.h6.g0(i0(org.telegram.ui.ActionBar.h6.f21396z8), 5, -1));
            }
        }
    }

    public final boolean s0() {
        TLRPC.User user;
        long j10 = this.f30709j1;
        if (j10 <= 0 || (user = MessagesController.getInstance(this.f30734v1.getCurrentAccount()).getUser(Long.valueOf(j10))) == null || !user.bot) {
            return false;
        }
        return true;
    }

    public final void s1(boolean z10) {
        js0 js0Var;
        os0 os0Var;
        xj0 xj0Var = this.f30727s0;
        if (xj0Var == null) {
            return;
        }
        float f7 = 0.0f;
        if (!this.V0 && (((js0Var = this.V) == null || !js0Var.g()) && ((os0Var = this.W) == null || !os0Var.f36524w))) {
            f7 = Utilities.clamp(this.f30717o0 + this.f30719p0, 1.0f, 0.0f);
        }
        xj0Var.setAlpha(f7);
        boolean z11 = false;
        if (z10) {
            if (a0(1.0f) > 0.5f) {
                z11 = true;
            }
            A(z11, true);
        } else if (this.f30739x0 == 2) {
            if (this.f30719p0 > 0.1f) {
                z11 = true;
            }
            A(z11, true);
        } else {
            if (this.f30717o0 < 0.1f) {
                z11 = true;
            }
            A(z11, true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        boolean z10;
        int i10;
        TLRPC.ChatFull chatFull2 = this.f30696d1;
        if (chatFull2 != null && chatFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30696d1 = chatFull;
        if (chatFull != null) {
            long j10 = chatFull.migrated_from_chat_id;
            if (j10 != 0 && this.f30693c1 == 0) {
                this.f30693c1 = -j10;
                int i11 = 0;
                while (true) {
                    iv0[] iv0VarArr = this.f30730t1;
                    if (i11 >= iv0VarArr.length) {
                        break;
                    }
                    if (iv0VarArr[i11].f27364b[1].size() == 0) {
                        iv0 iv0Var = iv0VarArr[i11];
                        iv0Var.f27369j[1] = this.f30696d1.migrated_from_max_id;
                        iv0Var.f27368i[1] = false;
                    }
                    i11++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.f30696d1;
        if (chatFull3 != null && z10 != chatFull3.stories_pinned_available) {
            jt0 jt0Var = this.I0;
            if (jt0Var != null) {
                if (r0()) {
                    i10 = 9;
                } else {
                    i10 = 8;
                }
                jt0Var.setInitialTabId(i10);
            }
            y1(true);
            o1(false);
        }
    }

    public void setCommonGroupsCount(int i10) {
        if (this.F == 0) {
            this.X0[6] = i10;
        }
        y1(true);
        F();
    }

    public void setForwardRestrictedHint(r40 r40Var) {
        this.E1 = r40Var;
    }

    public void setMergeDialogId(long j10) {
        this.f30693c1 = j10;
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
        y1(true);
        F();
        if (iArr2[0] >= 0) {
            B0(false);
        }
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.K1 = i11;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            mu0[] mu0VarArr = this.f30710k0;
            if (i15 >= mu0VarArr.length) {
                break;
            }
            mu0VarArr[i15].setTranslationY(this.K1);
            i15++;
        }
        if (this.P0 != null) {
            K();
        } else {
            ft0 ft0Var = this.R0;
            if (ft0Var != null) {
                ft0Var.setTranslationY(AndroidUtilities.dp(48.0f) + i11);
            }
        }
        this.O0 = i11;
        org.telegram.ui.Cells.w0 w0Var = this.K0;
        if (w0Var.getTag() == null) {
            i14 = -AndroidUtilities.dp(48.0f);
        }
        w0Var.setTranslationY(i14 + this.O0);
    }

    public void setPagesPaddingBottom(int i10) {
        if (this.X1 != i10) {
            this.X1 = i10;
            mu0[] mu0VarArr = this.f30710k0;
            if (mu0VarArr != null) {
                for (mu0 mu0Var : mu0VarArr) {
                    if (mu0Var != null) {
                        ss0 ss0Var = mu0Var.h;
                        int paddingLeft = ss0Var.getPaddingLeft();
                        ss0 ss0Var2 = mu0Var.h;
                        int i11 = ss0Var2.W2;
                        int paddingRight = ss0Var2.getPaddingRight();
                        ss0 ss0Var3 = mu0Var.h;
                        int Y = Y(x0());
                        ss0Var3.f28310c3 = Y;
                        ss0Var.setPadding(paddingLeft, i11, paddingRight, Y);
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
                mu0[] mu0VarArr = this.f30710k0;
                if (i10 < mu0VarArr.length) {
                    q1(mu0VarArr[i10], true);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        boolean z10;
        TLRPC.UserFull userFull2 = this.f30698e1;
        if (userFull2 != null && userFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30698e1 = userFull;
        y1(true);
        if (userFull != null && z10 != userFull.stories_pinned_available) {
            a1(8);
        }
    }

    public void setVisibleHeight(int i10) {
        float f7;
        this.M1 = i10;
        int i11 = 0;
        while (true) {
            mu0[] mu0VarArr = this.f30710k0;
            if (i11 >= mu0VarArr.length) {
                break;
            }
            int measuredHeight = getMeasuredHeight();
            if (mu0VarArr[i11].F == 8) {
                f7 = 280.0f;
            } else {
                f7 = 120.0f;
            }
            float f10 = (-(measuredHeight - Math.max(i10, AndroidUtilities.dp(f7)))) / 2.0f;
            mu0VarArr[i11].f28613w.setTranslationY(f10);
            mu0VarArr[i11].v.setTranslationY(-f10);
            i11++;
        }
        is0 is0Var = this.U;
        if (is0Var != null) {
            is0Var.setVisibleHeight(i10);
        }
        js0 js0Var = this.V;
        if (js0Var != null) {
            js0Var.setVisibleHeight(i10);
        }
    }

    public final boolean t0() {
        org.telegram.ui.ActionBar.n2 n2Var;
        if (this.f30696d1 != null && (n2Var = this.f30734v1) != null) {
            return ChatObject.isChannelAndNotMegaGroup(n2Var.getMessagesController().getChat(Long.valueOf(this.f30696d1.f20276id)));
        }
        return false;
    }

    public final void t1(mu0 mu0Var) {
        boolean z10;
        float f7;
        int i10;
        float f10;
        float f11;
        int i11 = mu0Var.F;
        if (i11 != 0 && !q0(i11)) {
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
        d.topMargin = d0(mu0Var.F) + d.topMargin;
        ViewGroup.LayoutParams layoutParams = mu0Var.v.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.leftMargin == d.leftMargin && layoutParams2.topMargin == d.topMargin && layoutParams2.rightMargin == d.rightMargin && layoutParams2.bottomMargin == d.bottomMargin && layoutParams2.gravity == d.gravity) {
                return;
            }
        }
        mu0Var.v.setLayoutParams(d);
    }

    public final boolean u0(int i10) {
        if (i10 == 7) {
            return this.D1.T();
        }
        if (!v0() && i10 != 0 && !q0(i10) && i10 != 2 && i10 != 5 && i10 != 6 && i10 != 11 && i10 != 10 && i10 != 13 && i10 != 14) {
            return true;
        }
        return false;
    }

    public final void u1(boolean z10) {
        int i10 = 0;
        while (true) {
            mu0[] mu0VarArr = this.f30710k0;
            if (i10 < mu0VarArr.length) {
                int childCount = mu0VarArr[i10].h.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = mu0VarArr[i10].h.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.i7) {
                        ((org.telegram.ui.Cells.i7) childAt).b(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.s7) {
                        ((org.telegram.ui.Cells.s7) childAt).i(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.m7) {
                        ((org.telegram.ui.Cells.m7) childAt).f(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) childAt).e(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.f2) {
                        ((org.telegram.ui.Cells.f2) childAt).c(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                        ((org.telegram.ui.Cells.r2) childAt).V(false, z10);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public boolean v0() {
        if (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) {
            return false;
        }
        return true;
    }

    public final void v1(float f7) {
        org.telegram.ui.ActionBar.u0 u0Var = this.m0;
        if (u0Var == null) {
            return;
        }
        mu0[] mu0VarArr = this.f30710k0;
        mu0 mu0Var = mu0VarArr[1];
        float f10 = 0.0f;
        if (mu0Var != null && mu0Var.F == 11) {
            f10 = 0.0f + f7;
        }
        int i10 = 0;
        mu0 mu0Var2 = mu0VarArr[0];
        if (mu0Var2 != null && mu0Var2.F == 11) {
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

    public final SpannableStringBuilder w() {
        if (this.W1 == null) {
            this.W1 = new SpannableStringBuilder();
            if (s0()) {
                this.W1.append((CharSequence) LocaleController.getString(R.string.ProfileBotPreviewEmptyButton));
            } else {
                this.W1.append((CharSequence) "c");
                this.W1.setSpan(new yq(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.W1.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
            }
        }
        return this.W1;
    }

    public boolean w0() {
        return false;
    }

    public final void w1() {
        float f7;
        float f10;
        org.telegram.ui.ActionBar.u0 u0Var = this.m0;
        if (u0Var == null) {
            return;
        }
        boolean z10 = true;
        mu0 mu0Var = this.f30710k0[1];
        if (mu0Var == null || mu0Var.F != 11) {
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

    public final void x(i80 i80Var, org.telegram.ui.ActionBar.n2 n2Var, long j10, int i10) {
        String publicUsername;
        if (j10 > 0) {
            publicUsername = UserObject.getPublicUsername(MessagesController.getInstance(n2Var.getCurrentAccount()).getUser(Long.valueOf(j10)));
        } else {
            publicUsername = ChatObject.getPublicUsername(MessagesController.getInstance(n2Var.getCurrentAccount()).getChat(Long.valueOf(-j10)));
        }
        if (publicUsername == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        a1.g.A(sb2, MessagesController.getInstance(n2Var.getCurrentAccount()).linkPrefix, "/", publicUsername, "/a/");
        sb2.append(i10);
        i80Var.c(R.drawable.media_share, LocaleController.getString(R.string.StoriesAlbumMenuShareLink), new lg(this, sb2.toString(), n2Var, 21), false);
    }

    public boolean x0() {
        return false;
    }

    public final void x1() {
        boolean z10;
        int i10;
        ci.a7 a7Var;
        boolean s02 = s0();
        org.telegram.ui.ActionBar.u0 u0Var = this.f30736w0;
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f30733v0;
        int i11 = 8;
        if (s02) {
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
                    bu0 bu0Var = this.f30692c0;
                    if (bu0Var != null && (a7Var = bu0Var.f29723s) != null && !a7Var.m(messageObject.getId())) {
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
        } else if (y0(getClosestTab())) {
            if (u0Var2 != null) {
                u0Var2.setVisibility(8);
            }
            if (u0Var != null) {
                u0Var.setVisibility(8);
            }
        }
    }

    public final void y(org.telegram.ui.Components.i80 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tv0.y(org.telegram.ui.Components.i80):void");
    }

    public void y1(boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tv0.y1(boolean):void");
    }

    public final void z(lu0 lu0Var, int i10, SparseBooleanArray sparseBooleanArray) {
        int childCount = lu0Var.getChildCount();
        b10 b10Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = lu0Var.getChildAt(i11);
            if (childAt instanceof b10) {
                b10Var = childAt;
            }
        }
        if (b10Var != null) {
            lu0Var.removeView(b10Var);
        }
        getViewTreeObserver().addOnPreDrawListener(new ot0(this, lu0Var, sparseBooleanArray, b10Var, i10));
    }

    public final boolean z0() {
        if (!C() || ((getClosestTab() != 8 && getClosestTab() != 13 && !y0(getClosestTab())) || !this.C1)) {
            js0 js0Var = this.V;
            if (js0Var == null || !js0Var.g()) {
                os0 os0Var = this.W;
                if ((os0Var == null || !os0Var.f36524w) && !this.f30718o1 && !this.f30703g1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final Boolean z1(View view, View view2) {
        if (!this.f30718o1) {
            mu0[] mu0VarArr = this.f30710k0;
            boolean z10 = false;
            mu0 mu0Var = mu0VarArr[0];
            if (mu0Var != null) {
                int i10 = mu0Var.F;
                this.f30720p1 = i10;
                boolean q02 = q0(i10);
                int[] iArr = this.f30713m1;
                int X = X(q02 ? 1 : 0, iArr[q02 ? 1 : 0], true);
                if (view != null && X == X(q02 ? 1 : 0, X, true)) {
                    view.setEnabled(false);
                    view.animate().alpha(0.5f).start();
                }
                if (iArr[q02 ? 1 : 0] != X) {
                    if (view2 != null && !view2.isEnabled()) {
                        view2.setEnabled(true);
                        view2.animate().alpha(1.0f).start();
                    }
                    if (!q02) {
                        SharedConfig.setMediaColumnsCount(X);
                    } else if (c0(mu0VarArr[0].F) >= 5 || y0(mu0VarArr[0].F)) {
                        SharedConfig.setStoriesColumnsCount(X);
                    }
                    B(X);
                }
                if (X != X(q02 ? 1 : 0, X, true)) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
            return null;
        }
        return null;
    }

    public void F0(SparseArray sparseArray) {
    }

    public void G0() {
    }

    public void M0(boolean z10) {
    }

    public void P0(boolean z10) {
    }

    public int X0(int i10) {
        return i10;
    }

    @Override
    public final void a(org.telegram.ui.Cells.r2 r2Var) {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void e(org.telegram.ui.Cells.r2 r2Var) {
    }

    @Override
    public final void g(org.telegram.ui.Cells.r2 r2Var) {
    }

    public void p0() {
    }
}
