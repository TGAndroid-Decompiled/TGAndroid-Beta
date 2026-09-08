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
public abstract class xu0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Cells.n2 {
    public static final int[] f32700d2 = {0, 1, 2, 4};
    public static final ir0 f32701e2 = new ir0(0);
    public final NumberTextView A0;
    public int A1;
    public final ha B0;
    public VelocityTracker B1;
    public final ImageView C0;
    public boolean C1;
    public final org.telegram.ui.ActionBar.g2 D0;
    public final jt0 D1;
    public final int E;
    public final ArrayList E0;
    public i40 E1;
    public final long F;
    public final ArrayList F0;
    public final org.telegram.ui.ActionBar.f6 F1;
    public final org.telegram.ui.ActionBar.k G;
    public final ArrayList G0;
    public final NotificationCenter.ObserversGroup G1;
    public final ct0 H;
    public final ArrayList H0;
    public boolean H1;
    public final ru0 I;
    public final ns0 I0;
    public final AnimationNotificationsLocker I1;
    public final lu0 J;
    public final ks0 J0;
    public org.telegram.ui.dm J1;
    public final ku0 K;
    public final org.telegram.ui.Cells.w0 K0;
    public int K1;
    public final ku0 L;
    public AnimatorSet L0;
    public boolean L1;
    public final ku0 M;
    public final qq0 M0;
    public int M1;
    public final eu0 N;
    public final ArrayList N0;
    public AnimatorSet N1;
    public final lt0 O;
    public float O0;
    public final SparseArray O1;
    public final it0 P;
    public final js P0;
    public long P1;
    public final gt0 Q;
    public final FrameLayout Q0;
    public boolean Q1;
    public final hu0 R;
    public final js0 R0;
    public int R1;
    public final iu0 S;
    public final int S0;
    public final us0 S1;
    public final dt0 T;
    public final Paint T0;
    public bi.l8 T1;
    public final lr0 U;
    public boolean U0;
    public float U1;
    public final nr0 V;
    public boolean V0;
    public boolean V1;
    public final sr0 W;
    public ah.j1 W0;
    public SpannableStringBuilder W1;
    public final int[] X0;
    public int X1;
    public int Y0;
    public final HashMap Y1;
    public final SparseArray[] Z0;
    public final HashMap Z1;
    public boolean f32702a;
    public final ht0 f32703a0;
    public int f32704a1;
    public int a2;
    public boolean f32705b;
    public final s4.y f32706b0;
    public boolean f32707b1;
    public int f32708b2;
    public boolean f32709c;
    public final ft0 f32710c0;
    public long f32711c1;
    public final lh f32712c2;
    public boolean d;
    public final uu0 f32713d0;
    public TLRPC.ChatFull f32714d1;
    public int f32715e;
    public final kr0 f32716e0;
    public TLRPC.UserFull f32717e1;
    public int f32718f;
    public final uu0 f32719f0;
    public AnimatorSet f32720f1;
    public final tt0 f32721g0;
    public boolean f32722g1;
    public float h;
    public final tt0 f32723h0;
    public boolean f32724h1;
    public final tt0 f32725i0;
    public boolean f32726i1;
    public final ot0 f32727j0;
    public final long f32728j1;
    public final qt0[] f32729k0;
    public boolean f32730k1;
    public final org.telegram.ui.ActionBar.v0 f32731l0;
    public boolean l1;
    public final org.telegram.ui.ActionBar.v0 m0;
    public final int[] f32732m1;
    public float f32733n;
    public final org.telegram.ui.ActionBar.v0 f32734n0;
    public float f32735n1;
    public float f32736o0;
    public boolean f32737o1;
    public float f32738p0;
    public int f32739p1;
    public final TextView f32740q0;
    public int f32741q1;
    public boolean f32742r;
    public final ImageView f32743r0;
    public final xr0 f32744r1;
    public int f32745s;
    public final aj0 f32746s0;
    public float f32747s1;
    public final org.telegram.ui.ActionBar.v0 f32748t0;
    public final mu0[] f32749t1;
    public final org.telegram.ui.ActionBar.v0 f32750u0;
    public final pu0 f32751u1;
    public int v;
    public final org.telegram.ui.ActionBar.v0 f32752v0;
    public final org.telegram.ui.ActionBar.n2 f32753v1;
    public int f32754w;
    public final org.telegram.ui.ActionBar.v0 f32755w0;
    public int f32756w1;
    public final Rect f32757x;
    public int f32758x0;
    public boolean f32759x1;
    public final t00 f32760y;
    public final Drawable f32761y0;
    public boolean f32762y1;
    public boolean f32763z0;
    public int f32764z1;

    public xu0(android.content.Context r40, long r41, org.telegram.ui.Components.pu0 r43, int r44, java.util.ArrayList r45, org.telegram.tgnet.TLRPC.ChatFull r46, org.telegram.tgnet.TLRPC.UserFull r47, int r48, int r49, org.telegram.ui.ActionBar.n2 r50, org.telegram.ui.Components.jt0 r51, int r52, org.telegram.ui.ActionBar.f6 r53, bh.b r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xu0.<init>(android.content.Context, long, org.telegram.ui.Components.pu0, int, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.tgnet.TLRPC$UserFull, int, int, org.telegram.ui.ActionBar.n2, org.telegram.ui.Components.jt0, int, org.telegram.ui.ActionBar.f6, bh.b):void");
    }

    public static kt0 M(int i10, long j3, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        kt0 kt0Var = new kt0(context, f6Var);
        TextView textView = kt0Var.f27926a;
        if (i10 == 0) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoMediaSecret));
                return kt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoMedia));
            return kt0Var;
        } else if (i10 == 1) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedFilesSecret));
                return kt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedFiles));
            return kt0Var;
        } else if (i10 == 2) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedVoiceSecret));
                return kt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedVoice));
            return kt0Var;
        } else if (i10 == 3) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedLinksSecret));
                return kt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedLinks));
            return kt0Var;
        } else if (i10 == 4) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedAudioSecret));
                return kt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedAudio));
            return kt0Var;
        } else if (i10 == 5) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedGifSecret));
                return kt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoGIFs));
            return kt0Var;
        } else {
            ImageView imageView = kt0Var.f27927b;
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

    public static void g(xu0 xu0Var, int i10, TL_stories.StoryItem storyItem, String str) {
        org.telegram.ui.dm dmVar = new org.telegram.ui.dm(xu0Var, i10, storyItem, 11);
        bi.u8 storiesController = xu0Var.getStoriesController();
        long j3 = xu0Var.f32728j1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.c0(i10, j3, arrayList);
        yc.a0(xu0Var.f32753v1).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", 1, str)), LocaleController.getString(R.string.UndoNoCaps), dmVar).j();
    }

    public bi.u8 getStoriesController() {
        return MessagesController.getInstance(this.f32753v1.getCurrentAccount()).getStoriesController();
    }

    public static void h(xu0 xu0Var, TL_stories.StoryItem storyItem) {
        xu0Var.getStoriesController().o0(xu0Var.f32728j1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        yc.a0(xu0Var.f32753v1).G(R.raw.chats_archived, 5000, LocaleController.formatPluralString("StoryArchived", 1, new Object[0])).j();
    }

    public static void i(xu0 xu0Var, long j3, int i10, String str) {
        bi.f8 B = xu0Var.getStoriesController().B(j3, true);
        int i11 = B.f3006a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        ((bi.m8) B.h.get(c10)).f3349b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f3007b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public static void j(xu0 xu0Var, TL_stories.StoryItem storyItem, bi.m8 m8Var) {
        xu0Var.getStoriesController().c(m8Var.f3348a, xu0Var.f32728j1, storyItem);
        AndroidUtilities.runOnUIThread(new jn0(7, xu0Var, m8Var), 100L);
    }

    public static void m(xu0 xu0Var, HashSet hashSet, TL_stories.StoryItem storyItem, n70 n70Var, bi.m8 m8Var) {
        String formatString;
        long j3 = xu0Var.f32728j1;
        if (hashSet.contains(Integer.valueOf(m8Var.f3348a))) {
            xu0Var.getStoriesController().c(m8Var.f3348a, j3, storyItem);
            formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, m8Var.f3349b);
        } else {
            bi.u8 storiesController = xu0Var.getStoriesController();
            int i10 = m8Var.f3348a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.c0(i10, j3, arrayList);
            formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, m8Var.f3349b);
        }
        yc.a0(xu0Var.f32753v1).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
        n70Var.u();
    }

    public static void n(xu0 xu0Var, long j3, int i10) {
        bi.f8 B = xu0Var.getStoriesController().B(j3, true);
        int i11 = B.f3006a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f3007b);
        tL_deleteAlbum.album_id = ((bi.m8) B.h.remove(c10)).f3348a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public static int p(View view) {
        if (view instanceof org.telegram.ui.Cells.t7) {
            return ((org.telegram.ui.Cells.t7) view).getMessageId();
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            return ((org.telegram.ui.Cells.j7) view).getMessage().getId();
        }
        if (view instanceof org.telegram.ui.Cells.i7) {
            return ((org.telegram.ui.Cells.i7) view).getMessage().getId();
        }
        return 0;
    }

    public static boolean p0(int i10) {
        if (i10 != 8 && i10 != 9 && !w0(i10)) {
            return false;
        }
        return true;
    }

    public static void q(qt0 qt0Var, mu0[] mu0VarArr, boolean z10) {
        jn0 jn0Var;
        if (z10) {
            if (SharedConfig.fastScrollHintCount > 0 && qt0Var.G == null && !qt0Var.I && qt0Var.h.getFastScroll() != null && qt0Var.h.getFastScroll().f30353a0 && qt0Var.h.getFastScroll().getVisibility() == 0 && mu0VarArr[0].e() >= 50) {
                SharedConfig.setFastScrollHintCount(SharedConfig.fastScrollHintCount - 1);
                qt0Var.I = true;
                Context context = qt0Var.getContext();
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                textView.setText(LocaleController.getString(R.string.SharedMediaFastScrollHint));
                textView.setTextSize(1, 14.0f);
                textView.setMaxLines(3);
                int i10 = org.telegram.ui.ActionBar.j6.f20915pf;
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20933qf, false)));
                frameLayout.addView(textView, w7.x5.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
                ?? view = new View(context);
                view.f28874a = new Random();
                Paint paint = new Paint(1);
                view.f28875b = paint;
                Paint paint2 = new Paint(1);
                view.f28876c = paint2;
                view.f28878f = 1.0f;
                view.h = 0.0f;
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i10, false), 76));
                paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                Paint paint3 = new Paint();
                view.d = paint3;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint3.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint3.setXfermode(new PorterDuffXfermode(mode));
                Paint paint4 = new Paint();
                view.f28877e = paint4;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                paint4.setXfermode(new PorterDuffXfermode(mode));
                frameLayout.addView(view, w7.x5.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                qt0Var.G = frameLayout;
                qt0Var.addView((View) frameLayout, w7.x5.c(-2.0f, -2));
                qt0Var.G.setAlpha(0.0f);
                qt0Var.G.setScaleX(0.8f);
                qt0Var.G.setScaleY(0.8f);
                qt0Var.G.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                qt0Var.invalidate();
                jn0 jn0Var2 = new jn0(6, qt0Var, frameLayout);
                qt0Var.H = jn0Var2;
                AndroidUtilities.runOnUIThread(jn0Var2, 4000L);
            }
        } else if (qt0Var.G != null && (jn0Var = qt0Var.H) != null) {
            AndroidUtilities.cancelRunOnUIThread(jn0Var);
            qt0Var.H.run();
            qt0Var.H = null;
            qt0Var.G = null;
        }
    }

    public static void s(org.telegram.ui.Components.xu0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xu0.s(org.telegram.ui.Components.xu0):void");
    }

    public static void t(xu0 xu0Var, int i10, boolean z10) {
        qt0[] qt0VarArr = xu0Var.f32729k0;
        if (qt0VarArr[0].F == i10) {
            return;
        }
        qt0 qt0Var = qt0VarArr[1];
        qt0Var.F = i10;
        qt0Var.setVisibility(0);
        xu0Var.k0();
        xu0Var.m1(true);
        xu0Var.f32724h1 = z10;
        xu0Var.L0();
        xu0Var.A(!xu0Var.s0(i10), true);
        xu0Var.q1(true);
    }

    public static int u(xu0 xu0Var, s4.h0 h0Var) {
        if (h0Var == xu0Var.f32710c0) {
            return 8;
        }
        if (h0Var == xu0Var.f32716e0) {
            return 9;
        }
        for (wu0 wu0Var : xu0Var.Y1.values()) {
            if (wu0Var.f32371c == h0Var) {
                return wu0Var.f32369a;
            }
        }
        return -1;
    }

    public static int v(xu0 xu0Var, s4.h0 h0Var) {
        if (h0Var == xu0Var.f32713d0) {
            return 8;
        }
        if (h0Var == xu0Var.f32719f0) {
            return 9;
        }
        for (wu0 wu0Var : xu0Var.Y1.values()) {
            if (wu0Var.d == h0Var) {
                return wu0Var.f32369a;
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
        aj0 aj0Var = this.f32746s0;
        if (aj0Var != null && this.V1 != z10) {
            this.V1 = z10;
            if (!z10 && aj0Var.getAnimatedDrawable().f32580b0 < 20) {
                aj0Var.getAnimatedDrawable().N(0);
            } else {
                xi0 animatedDrawable = aj0Var.getAnimatedDrawable();
                if (this.V1) {
                    i10 = 50;
                } else {
                    i10 = 100;
                }
                animatedDrawable.N(i10);
            }
            if (z11) {
                aj0Var.getAnimatedDrawable().start();
            } else {
                aj0Var.getAnimatedDrawable().K(aj0Var.getAnimatedDrawable().f32586f);
            }
        }
    }

    public final void A0(int i10) {
        int i11;
        mu0[] mu0VarArr = this.f32749t1;
        if (i10 == 0) {
            int i12 = mu0VarArr[0].f28557q;
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
        mu0VarArr[i10].f28548g = true;
        org.telegram.ui.ActionBar.n2 n2Var = this.f32753v1;
        n2Var.getMediaDataController().loadMedia(this.f32728j1, 50, 0, mu0VarArr[i10].f28551k, i11, this.F, 1, n2Var.getClassGuid(), mu0VarArr[i10].f28556p, null, null);
    }

    public final void B(int i10) {
        int i11;
        qt0 W = W(this.f32739p1);
        this.f32745s = -1;
        if (W != null) {
            W.h.B0();
            this.f32741q1 = i10;
            W.f29848r.setVisibility(0);
            if (p0(this.f32739p1)) {
                W.f29848r.setAdapter(l1(this.f32739p1));
            } else {
                W.f29848r.setAdapter(this.I);
            }
            pt0 pt0Var = W.f29848r;
            int paddingLeft = pt0Var.getPaddingLeft();
            pt0 pt0Var2 = W.f29848r;
            int Z = Z(W.F);
            pt0Var2.f29515d3 = Z;
            int paddingRight = W.f29848r.getPaddingRight();
            pt0 pt0Var3 = W.f29848r;
            int Y = Y(v0());
            pt0Var3.f29516e3 = Y;
            pt0Var.setPadding(paddingLeft, Z, paddingRight, Y);
            W.f29849s.y1(i10);
            W.f29848r.a0();
            int i12 = 0;
            while (true) {
                qt0[] qt0VarArr = this.f32729k0;
                if (i12 >= qt0VarArr.length) {
                    break;
                }
                qt0 qt0Var = qt0VarArr[i12];
                if (qt0Var != null && ((i11 = qt0Var.F) == 0 || p0(i11))) {
                    AndroidUtilities.updateVisibleRows(qt0VarArr[i12].h);
                }
                i12++;
            }
            this.f32737o1 = true;
            if (this.f32739p1 == 0) {
                this.f32749t1[0].g(true);
            }
            this.f32735n1 = 0.0f;
            X0();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.I1.lock();
            ofFloat.addUpdateListener(new ms0(this, W, 1));
            ofFloat.addListener(new fi.y2(this, p0(W.F) ? 1 : 0, i10, 2));
            ofFloat.setInterpolator(pr.f29493f);
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
        long j3 = this.f32728j1;
        org.telegram.ui.ActionBar.n2 n2Var = this.f32753v1;
        if (r02) {
            TLRPC.User user = MessagesController.getInstance(n2Var.getCurrentAccount()).getUser(Long.valueOf(j3));
            if (user == null || !user.bot || !user.bot_can_edit) {
                return false;
            }
            return true;
        } else if (!v0() && (n2Var == null || !n2Var.getMessagesController().getStoriesController().h(j3))) {
            return false;
        } else {
            return true;
        }
    }

    public final void C0(int i10, View view) {
        boolean z10;
        boolean z11;
        String string;
        int i11;
        lr0 lr0Var;
        int i12;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z12;
        String formatPluralString;
        String formatPluralString2;
        int i13;
        int i14;
        TLRPC.User user2;
        hu0 hu0Var = this.R;
        SparseArray[] sparseArrayArr = this.Z0;
        org.telegram.ui.ActionBar.n2 n2Var = this.f32753v1;
        boolean z13 = true;
        char c10 = 1;
        if (i10 == 101) {
            boolean p02 = p0(getSelectedTab());
            org.telegram.ui.ActionBar.f6 f6Var = this.F1;
            if (!p02 && getSelectedTab() != 13) {
                if (getSelectedTab() == 11) {
                    SavedMessagesController savedMessagesController = n2Var.getMessagesController().getSavedMessagesController();
                    final ArrayList arrayList = new ArrayList();
                    for (int i15 = 0; i15 < savedMessagesController.allDialogs.size(); i15++) {
                        long j3 = savedMessagesController.allDialogs.get(i15).dialogId;
                        if (hu0Var.f26891w.contains(Long.valueOf(j3))) {
                            arrayList.add(Long.valueOf(j3));
                        }
                    }
                    String str = "";
                    if (!arrayList.isEmpty()) {
                        Long l4 = (Long) arrayList.get(0);
                        long longValue = l4.longValue();
                        if (longValue == n2Var.getUserConfig().getClientUserId()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        int i16 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                        if (i16 < 0) {
                            TLRPC.Chat chat2 = n2Var.getMessagesController().getChat(Long.valueOf(-longValue));
                            if (chat2 != null) {
                                str = chat2.title;
                            }
                        } else if (i16 >= 0 && (user2 = n2Var.getMessagesController().getUser(l4)) != null) {
                            str = UserObject.isAnonymous(user2) ? LocaleController.getString(R.string.AnonymousForward) : UserObject.getUserName(user2);
                        }
                    } else {
                        z12 = false;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, f6Var);
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
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
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
                        public final xu0 f33016b;

                        {
                            this.f33016b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i17) {
                            switch (r3) {
                                case 0:
                                    xu0 xu0Var = this.f33016b;
                                    org.telegram.ui.ActionBar.n2 n2Var2 = xu0Var.f32753v1;
                                    bi.u8 storiesController = n2Var2.getMessagesController().getStoriesController();
                                    long j10 = xu0Var.f32728j1;
                                    ArrayList arrayList2 = arrayList;
                                    storiesController.s(j10, arrayList2);
                                    yc.a0(n2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList2.size(), new Object[0])).j();
                                    xu0Var.L(false);
                                    return;
                                default:
                                    xu0 xu0Var2 = this.f33016b;
                                    xu0Var2.getClass();
                                    int i18 = 0;
                                    while (true) {
                                        ArrayList arrayList3 = arrayList;
                                        if (i18 < arrayList3.size()) {
                                            xu0Var2.f32753v1.getMessagesController().deleteSavedDialog(((Long) arrayList3.get(i18)).longValue());
                                            i18++;
                                        } else {
                                            xu0Var2.L(true);
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
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20925q7, false));
                        return;
                    }
                    return;
                }
                long j10 = this.f32728j1;
                if (DialogObject.isEncryptedDialog(j10)) {
                    encryptedChat = org.telegram.messenger.w1.m(n2Var.getMessagesController(), j10);
                    user = null;
                    chat = null;
                } else if (DialogObject.isUserDialog(j10)) {
                    user = n2Var.getMessagesController().getUser(Long.valueOf(j10));
                    chat = null;
                    encryptedChat = null;
                } else {
                    chat = n2Var.getMessagesController().getChat(Long.valueOf(-j10));
                    user = null;
                    encryptedChat = null;
                }
                e5.z(n2Var, user, chat, encryptedChat, null, this.f32711c1, null, this.Z0, null, 0, 0, null, new qq0(this, 1), null, this.F1);
            } else if (sparseArrayArr[0] != null) {
                if (r0() && (lr0Var = this.U) != null && lr0Var.getCurrentList() != null) {
                    bi.b8 currentList = lr0Var.getCurrentList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i17 = 0; i17 < sparseArrayArr[0].size(); i17++) {
                        TL_stories.StoryItem storyItem = ((MessageObject) sparseArrayArr[0].valueAt(i17)).storyItem;
                        if (storyItem != null) {
                            arrayList2.add(storyItem.media);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, f6Var);
                        if (arrayList2.size() > 1) {
                            i12 = R.string.DeleteBotPreviewsTitle;
                        } else {
                            i12 = R.string.DeleteBotPreviewTitle;
                        }
                        String string2 = LocaleController.getString(i12);
                        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20225a;
                        b2Var2.R = string2;
                        b2Var2.T = LocaleController.formatPluralString("DeleteBotPreviewsSubtitle", arrayList2.size(), new Object[0]);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new s50(this, currentList, arrayList2, 1));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new wo0(2));
                        b2Var2.show();
                        b2Var2.h();
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
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), 0, f6Var);
                    if (arrayList3.size() > 1) {
                        i11 = R.string.DeleteStoriesTitle;
                    } else {
                        i11 = R.string.DeleteStoryTitle;
                    }
                    String string3 = LocaleController.getString(i11);
                    org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f20225a;
                    b2Var3.R = string3;
                    b2Var3.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList3.size(), new Object[0]);
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2(this) {
                        public final xu0 f33016b;

                        {
                            this.f33016b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.b2 b2Var22, int i172) {
                            switch (r3) {
                                case 0:
                                    xu0 xu0Var = this.f33016b;
                                    org.telegram.ui.ActionBar.n2 n2Var2 = xu0Var.f32753v1;
                                    bi.u8 storiesController = n2Var2.getMessagesController().getStoriesController();
                                    long j102 = xu0Var.f32728j1;
                                    ArrayList arrayList22 = arrayList3;
                                    storiesController.s(j102, arrayList22);
                                    yc.a0(n2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList22.size(), new Object[0])).j();
                                    xu0Var.L(false);
                                    return;
                                default:
                                    xu0 xu0Var2 = this.f33016b;
                                    xu0Var2.getClass();
                                    int i182 = 0;
                                    while (true) {
                                        ArrayList arrayList32 = arrayList3;
                                        if (i182 < arrayList32.size()) {
                                            xu0Var2.f32753v1.getMessagesController().deleteSavedDialog(((Long) arrayList32.get(i182)).longValue());
                                            i182++;
                                        } else {
                                            xu0Var2.L(true);
                                            return;
                                        }
                                    }
                            }
                        }
                    });
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new wo0(3));
                    b2Var3.show();
                    b2Var3.h();
                }
            }
        } else if (i10 == 100) {
            if (this.f32717e1 != null && n2Var.getMessagesController().isUserNoForwards(this.f32717e1)) {
                i40 i40Var = this.E1;
                if (i40Var != null) {
                    i40Var.setText(LocaleController.getString(R.string.ForwardsRestrictedInfoUser));
                    this.E1.f(view, true);
                    return;
                }
                return;
            }
            if (this.f32714d1 != null) {
                TLRPC.Chat chat3 = n2Var.getMessagesController().getChat(Long.valueOf(this.f32714d1.f19897id));
                if (n2Var.getMessagesController().isChatNoForwards(chat3)) {
                    i40 i40Var2 = this.E1;
                    if (i40Var2 != null) {
                        if (ChatObject.isChannel(chat3) && !chat3.megagroup) {
                            string = LocaleController.getString(R.string.ForwardsRestrictedInfoChannel);
                        } else {
                            string = LocaleController.getString(R.string.ForwardsRestrictedInfoGroup);
                        }
                        i40Var2.setText(string);
                        this.E1.f(view, true);
                        return;
                    }
                    return;
                }
            }
            if (j0()) {
                i40 i40Var3 = this.E1;
                if (i40Var3 != null) {
                    i40Var3.setText(LocaleController.getString("ForwardsRestrictedInfoBot", R.string.ForwardsRestrictedInfoBot));
                    this.E1.f(view, true);
                    return;
                }
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("canSelectTopics", true);
            bundle.putInt("dialogsType", 3);
            org.telegram.ui.uy uyVar = new org.telegram.ui.uy(bundle);
            uyVar.C2 = new rq0(this);
            n2Var.presentFragment(uyVar);
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
                org.telegram.ui.co coVar = new org.telegram.ui.co(bundle2);
                coVar.L7 = messageObject.getId();
                long j11 = this.F;
                if (j11 != 0) {
                    og.d.a(coVar, MessagesStorage.TopicKey.of(dialogId, j11));
                    bundle2.putInt("message_id", messageObject.getId());
                }
                n2Var.presentFragment(coVar, false);
            }
        } else if (i10 == 103 || i10 == 104) {
            if (getClosestTab() == 8) {
                ft0 ft0Var = this.f32710c0;
                if (ft0Var != null && ft0Var.f31011s != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (int i19 = 0; i19 < sparseArrayArr[0].size(); i19++) {
                        arrayList4.add(Integer.valueOf(((MessageObject) sparseArrayArr[0].valueAt(i19)).getId()));
                    }
                    if (i10 != 103) {
                        z13 = false;
                    }
                    T0(arrayList4, z13);
                    L(false);
                    return;
                }
                return;
            }
            SavedMessagesController savedMessagesController2 = n2Var.getMessagesController().getSavedMessagesController();
            ArrayList<Long> arrayList5 = new ArrayList<>();
            for (int i20 = 0; i20 < savedMessagesController2.allDialogs.size(); i20++) {
                long j12 = savedMessagesController2.allDialogs.get(i20).dialogId;
                if (hu0Var.f26891w.contains(Long.valueOf(j12))) {
                    arrayList5.add(Long.valueOf(j12));
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
                    qt0[] qt0VarArr = this.f32729k0;
                    if (i21 >= qt0VarArr.length) {
                        break;
                    }
                    qt0 qt0Var = qt0VarArr[i21];
                    if (qt0Var.F == 11) {
                        qt0Var.f29851x.h1(0, 0);
                        break;
                    }
                    i21++;
                }
            }
            L(z11);
        }
    }

    public boolean D() {
        return !(this instanceof y30);
    }

    public final boolean E() {
        qt0 qt0Var;
        qt0[] qt0VarArr = this.f32729k0;
        if (qt0VarArr == null || (qt0Var = qt0VarArr[0]) == null) {
            return false;
        }
        if (this.f32730k1 && p0(qt0Var.F)) {
            return false;
        }
        boolean p02 = p0(qt0VarArr[0].F);
        int i10 = this.f32732m1[p02 ? 1 : 0];
        if (i10 == X(p02 ? 1 : 0, i10, false)) {
            return false;
        }
        return true;
    }

    public final void F() {
        ns0 ns0Var = this.I0;
        if (!ns0Var.e(ns0Var.getCurrentTabId())) {
            int firstTabId = ns0Var.getFirstTabId();
            ns0Var.setInitialTabId(firstTabId);
            this.f32729k0[0].F = firstTabId;
            m1(false);
        }
    }

    public final void F0() {
        bi.l8 l8Var;
        bi.l8 l8Var2;
        this.G1.removeAllObservers();
        ft0 ft0Var = this.f32710c0;
        if (ft0Var != null && (l8Var2 = ft0Var.f31011s) != null && l8Var2 != null) {
            l8Var2.z(ft0Var.v);
        }
        kr0 kr0Var = this.f32716e0;
        if (kr0Var != null && (l8Var = kr0Var.f31011s) != null && l8Var != null) {
            l8Var.z(kr0Var.v);
        }
        for (wu0 wu0Var : this.Y1.values()) {
            vu0 vu0Var = wu0Var.f32371c;
            bi.l8 l8Var3 = vu0Var.f31011s;
            if (l8Var3 != null && l8Var3 != null) {
                l8Var3.z(vu0Var.v);
            }
        }
    }

    public final void G(qt0 qt0Var, ll0 ll0Var, s4.c0 c0Var) {
        int abs;
        int h;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        s4.c1 K;
        MessageObject messageObject;
        bi.l8 l8Var;
        if (!this.f32737o1 && this.J1 == null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (ll0Var.getFastScroll() == null || !ll0Var.getFastScroll().f30369n || currentTimeMillis - qt0Var.f29842a >= 300) {
                qt0Var.f29842a = currentTimeMillis;
                if ((!this.V0 || !this.U0 || qt0Var.F == 11) && qt0Var.F != 7) {
                    int L0 = c0Var.L0();
                    if (L0 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(c0Var.N0() - L0) + 1;
                    }
                    if (ll0Var.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = ll0Var.getAdapter().h();
                    }
                    int i15 = qt0Var.F;
                    int[] iArr = this.f32732m1;
                    mu0[] mu0VarArr = this.f32749t1;
                    if (i15 == 0 || i15 == 1 || i15 == 2 || i15 == 4) {
                        h = mu0VarArr[i15].d() + mu0VarArr[i15].f28543a.size();
                        mu0 mu0Var = mu0VarArr[i15];
                        if (mu0Var.h && mu0Var.f28546e.size() > 2 && qt0Var.F == 0 && mu0VarArr[i15].f28543a.size() != 0) {
                            if (i15 == 0) {
                                i10 = iArr[0];
                            } else {
                                i10 = 1;
                            }
                            float f7 = i10;
                            int measuredHeight = (int) ((ll0Var.getMeasuredHeight() / (ll0Var.getMeasuredWidth() / f7)) * f7 * 1.5f);
                            if (measuredHeight < 100) {
                                measuredHeight = 100;
                            }
                            if (measuredHeight < ((vt0) mu0VarArr[i15].f28546e.get(1)).f32006b) {
                                measuredHeight = ((vt0) mu0VarArr[i15].f28546e.get(1)).f32006b;
                            }
                            if ((L0 > h && L0 - h > measuredHeight) || ((i11 = L0 + abs) < mu0VarArr[i15].f28553m && mu0VarArr[0].f28553m - i11 > measuredHeight)) {
                                org.telegram.ui.dm dmVar = new org.telegram.ui.dm(this, i15, ll0Var, 13);
                                this.J1 = dmVar;
                                AndroidUtilities.runOnUIThread(dmVar);
                                return;
                            }
                        }
                    }
                    int i16 = qt0Var.F;
                    if (i16 != 7) {
                        if (p0(i16)) {
                            uu0 k12 = k1(qt0Var.F);
                            if (k12 != null && (l8Var = k12.f31011s) != null && L0 + abs > l8Var.i() - iArr[1]) {
                                k12.P();
                                return;
                            }
                            return;
                        }
                        int i17 = qt0Var.F;
                        if (i17 == 6) {
                            if (abs > 0) {
                                it0 it0Var = this.P;
                                boolean z10 = it0Var.h;
                                ArrayList arrayList = it0Var.d;
                                if (!z10 && !it0Var.f27282e && !arrayList.isEmpty() && L0 + abs >= h - 5) {
                                    it0.E(it0Var, ((TLRPC.Chat) i2.g.h(1, arrayList)).f19896id);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.n2 n2Var = this.f32753v1;
                        if (i17 == 11) {
                            int i18 = -1;
                            for (int i19 = 0; i19 < qt0Var.h.getChildCount(); i19++) {
                                View childAt = qt0Var.h.getChildAt(i19);
                                qt0Var.h.getClass();
                                i18 = Math.max(RecyclerView.R(childAt), i18);
                            }
                            s4.h0 adapter = qt0Var.h.getAdapter();
                            iu0 iu0Var = this.S;
                            if (adapter == iu0Var) {
                                if (i18 + 1 >= iu0Var.h.size() + iu0Var.f27286e.size() && !iu0Var.f27290s && !iu0Var.f27289r) {
                                    iu0Var.f27289r = true;
                                    iu0Var.F();
                                }
                            } else if (i18 + 1 >= n2Var.getMessagesController().getSavedMessagesController().getLoadedCount()) {
                                n2Var.getMessagesController().getSavedMessagesController().loadDialogs(false);
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
                            if (abs + L0 > h - i12 || mu0VarArr[i13].f28555o) {
                                mu0 mu0Var2 = mu0VarArr[i13];
                                if (!mu0Var2.f28548g) {
                                    if (i17 == 0) {
                                        int i20 = mu0VarArr[0].f28557q;
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
                                    boolean[] zArr = mu0Var2.f28549i;
                                    if (!zArr[0]) {
                                        mu0Var2.f28548g = true;
                                        n2Var.getMediaDataController().loadMedia(this.f32728j1, 50, mu0VarArr[i13].f28550j[0], 0, i14, this.F, 1, n2Var.getClassGuid(), mu0VarArr[i13].f28556p, null, null);
                                    } else if (this.f32711c1 != 0 && !zArr[1]) {
                                        mu0Var2.f28548g = true;
                                        n2Var.getMediaDataController().loadMedia(this.f32711c1, 50, mu0VarArr[i13].f28550j[1], 0, i14, this.F, 1, n2Var.getClassGuid(), mu0VarArr[i13].f28556p, null, null);
                                    }
                                }
                            }
                            int i21 = mu0VarArr[i13].f28553m;
                            if (i13 == 0) {
                                i21 = this.H.L(0);
                            }
                            if (L0 - i21 < i12 + 1) {
                                mu0 mu0Var3 = mu0VarArr[i13];
                                if (!mu0Var3.f28548g && !mu0Var3.f28552l && !mu0Var3.f28555o) {
                                    A0(qt0Var.F);
                                }
                            }
                            qt0 qt0Var2 = this.f32729k0[0];
                            if (qt0Var2.h == ll0Var) {
                                int i22 = qt0Var2.F;
                                if ((i22 == 0 || i22 == 5) && L0 != -1 && (K = ll0Var.K(L0)) != null) {
                                    int i23 = K.f45770f;
                                    if (i23 == 0 || i23 == 12) {
                                        View view = K.f45766a;
                                        boolean z11 = view instanceof org.telegram.ui.Cells.u7;
                                        org.telegram.ui.Cells.w0 w0Var = this.K0;
                                        if (z11) {
                                            org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                                            if (u7Var.f23367e <= 0) {
                                                messageObject = null;
                                            } else {
                                                messageObject = u7Var.f23365b[0];
                                            }
                                            if (messageObject != null) {
                                                w0Var.T(messageObject.messageOwner.date, false, true);
                                            }
                                        } else if (view instanceof org.telegram.ui.Cells.e2) {
                                            w0Var.T(((org.telegram.ui.Cells.e2) view).getDate(), false, true);
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
        char c10;
        int i12;
        int i13;
        if (messageObject != null && !this.f32737o1) {
            sr0 sr0Var = this.W;
            if (sr0Var == null || !sr0Var.f35656w) {
                int i14 = 0;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                i14 = 0;
                String str2 = null;
                bi.l8 l8Var = null;
                boolean z15 = true;
                if (this.C1) {
                    int i15 = 8;
                    if (i11 != 8 || C()) {
                        if (messageObject.getDialogId() == this.f32728j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        SparseArray[] sparseArrayArr = this.Z0;
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            sparseArrayArr[c10].remove(messageObject.getId());
                            if (!messageObject.canDeleteMessage(false, null)) {
                                this.f32704a1--;
                            }
                        } else {
                            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                                sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                                if (!messageObject.canDeleteMessage(false, null)) {
                                    this.f32704a1++;
                                }
                            } else {
                                return;
                            }
                        }
                        D0(sparseArrayArr[0]);
                        if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                            b1(false);
                        } else {
                            this.A0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                            if (this.f32704a1 == 0) {
                                i12 = 0;
                            } else {
                                i12 = 8;
                            }
                            this.f32731l0.setVisibility(i12);
                            org.telegram.ui.ActionBar.v0 v0Var = this.f32750u0;
                            if (v0Var != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14 && sparseArrayArr[0].size() == 1) {
                                    i13 = 0;
                                } else {
                                    i13 = 8;
                                }
                                v0Var.setVisibility(i13);
                            }
                            org.telegram.ui.ActionBar.v0 v0Var2 = this.f32748t0;
                            if (v0Var2 != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                                    i15 = 0;
                                }
                                v0Var2.setVisibility(i15);
                            }
                            u1();
                        }
                        this.f32707b1 = false;
                        if (view instanceof org.telegram.ui.Cells.j7) {
                            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z10 = true;
                            }
                            j7Var.b(z10, true);
                        } else if (view instanceof org.telegram.ui.Cells.u7) {
                            org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) < 0) {
                                z15 = false;
                            }
                            u7Var.b(0, z15);
                        } else if (view instanceof org.telegram.ui.Cells.n7) {
                            org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            n7Var.f(z11, true);
                        } else if (view instanceof org.telegram.ui.Cells.i7) {
                            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z12 = true;
                            }
                            i7Var.e(z12, true);
                        } else if (view instanceof org.telegram.ui.Cells.e2) {
                            org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z13 = true;
                            }
                            e2Var.c(z13, true);
                        } else if (view instanceof org.telegram.ui.Cells.t7) {
                            org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z14 = true;
                            }
                            t7Var.i(z14, true);
                        }
                    } else {
                        return;
                    }
                } else {
                    xr0 xr0Var = this.f32744r1;
                    mu0[] mu0VarArr = this.f32749t1;
                    org.telegram.ui.ActionBar.n2 n2Var = this.f32753v1;
                    if (i11 == 0) {
                        mu0 mu0Var = mu0VarArr[i11];
                        int i16 = i10 - mu0Var.f28553m;
                        if (i16 >= 0 && i16 < mu0Var.f28543a.size()) {
                            PhotoViewer.t1().K2(null, n2Var, null);
                            PhotoViewer.t1().a2(mu0VarArr[i11].f28543a, i16, this.f32728j1, this.f32711c1, this.F, xr0Var);
                        }
                    } else if (i11 != 2 && i11 != 4) {
                        if (i11 == 5) {
                            PhotoViewer.t1().K2(null, n2Var, null);
                            int indexOf = mu0VarArr[i11].f28543a.indexOf(messageObject);
                            if (indexOf < 0) {
                                PhotoViewer.t1().a2(org.telegram.messenger.w1.l(messageObject), 0, 0L, 0L, 0L, xr0Var);
                            } else {
                                PhotoViewer.t1().a2(mu0VarArr[i11].f28543a, indexOf, this.f32728j1, this.f32711c1, this.F, xr0Var);
                            }
                        } else if (i11 == 1) {
                            if (view instanceof org.telegram.ui.Cells.j7) {
                                org.telegram.ui.Cells.j7 j7Var2 = (org.telegram.ui.Cells.j7) view;
                                TLRPC.Document document = messageObject.getDocument();
                                if (j7Var2.G) {
                                    if (messageObject.canPreviewDocument()) {
                                        PhotoViewer.t1().K2(null, n2Var, null);
                                        int indexOf2 = mu0VarArr[i11].f28543a.indexOf(messageObject);
                                        if (indexOf2 < 0) {
                                            PhotoViewer.t1().a2(org.telegram.messenger.w1.l(messageObject), 0, 0L, 0L, 0L, xr0Var);
                                            return;
                                        }
                                        PhotoViewer.t1().a2(mu0VarArr[i11].f28543a, indexOf2, this.f32728j1, this.f32711c1, this.F, xr0Var);
                                        return;
                                    }
                                    AndroidUtilities.openDocument(messageObject, n2Var.getParentActivity(), n2Var);
                                } else if (!j7Var2.F) {
                                    MessageObject message = j7Var2.getMessage();
                                    message.putInDownloadsStore = true;
                                    n2Var.getFileLoader().loadFile(document, message, 0, 0);
                                    j7Var2.f(true);
                                } else {
                                    n2Var.getFileLoader().cancelLoadFile(document);
                                    j7Var2.f(true);
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
                                        LaunchActivity launchActivity = LaunchActivity.G1;
                                        if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                                            n2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                            return;
                                        }
                                        return;
                                    }
                                    String str3 = webPage.embed_url;
                                    if (str3 != null && str3.length() != 0) {
                                        tu.J(n2Var, messageObject, this.f32744r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
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
                                    R0(str);
                                }
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                        } else if (p0(i11)) {
                            uu0 k12 = k1(i11);
                            if (k12 != null) {
                                l8Var = k12.f31011s;
                            }
                            if (l8Var != null) {
                                bi.pb orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
                                Context context = getContext();
                                int id2 = messageObject.getId();
                                bi.d9 a2 = bi.d9.a(this.f32729k0[0].h);
                                a2.f2898e = new kv(l8Var, 18);
                                if ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).f34011s1) {
                                    i14 = AndroidUtilities.dp(68.0f);
                                }
                                a2.f2902s += i14;
                                orCreateStoryViewer.C(context, id2, l8Var, a2);
                            } else {
                                return;
                            }
                        }
                    } else if (view instanceof org.telegram.ui.Cells.i7) {
                        ((org.telegram.ui.Cells.i7) view).a();
                    }
                }
                p1();
            }
        }
    }

    public final boolean H(MotionEvent motionEvent) {
        float f7;
        s4.h0 h0Var;
        boolean z10;
        lr0 lr0Var;
        float f10;
        boolean z11;
        qt0[] qt0VarArr = this.f32729k0;
        int i10 = qt0VarArr[0].F;
        if (i10 == 13 && (lr0Var = this.U) != null) {
            View currentView = lr0Var.f4880n.getCurrentView();
            if (currentView instanceof ci.t) {
                ci.t tVar = (ci.t) currentView;
                ci.l lVar = tVar.v;
                ci.i iVar = tVar.f4862f;
                if (tVar.f4858a != null && tVar.getParent() != null) {
                    if (!tVar.f4859b || tVar.K) {
                        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                            if (motionEvent.getActionMasked() == 2 && (tVar.K || tVar.M)) {
                                int i11 = -1;
                                int i12 = -1;
                                for (int i13 = 0; i13 < motionEvent.getPointerCount(); i13++) {
                                    if (tVar.N == motionEvent.getPointerId(i13)) {
                                        i11 = i13;
                                    }
                                    if (tVar.O == motionEvent.getPointerId(i13)) {
                                        i12 = i13;
                                    }
                                }
                                if (i11 != -1 && i12 != -1) {
                                    float hypot = ((float) Math.hypot(motionEvent.getX(i12) - motionEvent.getX(i11), motionEvent.getY(i12) - motionEvent.getY(i11))) / tVar.P;
                                    tVar.Q = hypot;
                                    if (!tVar.K && (hypot > 1.01f || hypot < 0.99f)) {
                                        tVar.K = true;
                                        if (hypot > 1.0f) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        tVar.R = z11;
                                        tVar.b(z11);
                                    }
                                    if (tVar.K) {
                                        boolean z12 = tVar.R;
                                        if ((z12 && tVar.Q < 1.0f) || (!z12 && tVar.Q > 1.0f)) {
                                            tVar.f4860c = 0.0f;
                                        } else {
                                            if (z12) {
                                                f10 = org.telegram.messenger.w1.y(2.0f, tVar.Q, 1.0f, 1.0f);
                                            } else {
                                                f10 = (1.0f - tVar.Q) / 0.5f;
                                            }
                                            tVar.f4860c = Math.max(0.0f, Math.min(1.0f, f10));
                                        }
                                        float f11 = tVar.f4860c;
                                        int i14 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
                                        if (i14 == 0 || f11 == 0.0f) {
                                            if (i14 == 0) {
                                                int i15 = tVar.f4861e;
                                                int ceil = (((int) Math.ceil(tVar.S / tVar.f4861e)) * i15) + ((int) ((tVar.W.G.f32764z1 / (iVar.getMeasuredWidth() - ((int) (iVar.getMeasuredWidth() / tVar.f4861e)))) * (i15 - 1)));
                                                if (ceil >= lVar.h()) {
                                                    ceil = lVar.h() - 1;
                                                }
                                                tVar.S = ceil;
                                            }
                                            tVar.a();
                                            if (tVar.f4860c == 0.0f) {
                                                tVar.R = !tVar.R;
                                            }
                                            tVar.b(tVar.R);
                                            tVar.P = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                        }
                                        iVar.invalidate();
                                    }
                                } else {
                                    tVar.L = false;
                                    tVar.M = false;
                                    tVar.K = false;
                                    tVar.a();
                                    return false;
                                }
                            } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((tVar.N == motionEvent.getPointerId(0) && tVar.O == motionEvent.getPointerId(1)) || (tVar.N == motionEvent.getPointerId(1) && tVar.O == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && tVar.K) {
                                tVar.M = false;
                                tVar.L = false;
                                tVar.K = false;
                                tVar.a();
                            }
                        } else {
                            if (tVar.L && !tVar.K && motionEvent.getPointerCount() == 2) {
                                tVar.P = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                tVar.Q = 1.0f;
                                tVar.N = motionEvent.getPointerId(0);
                                tVar.O = motionEvent.getPointerId(1);
                                iVar.I0(false);
                                iVar.cancelLongPress();
                                iVar.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                View view = (View) tVar.getParent();
                                tVar.U = (int) ((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - tVar.getX());
                                int y3 = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - tVar.getY());
                                int i16 = tVar.U;
                                Rect rect = tVar.V;
                                tVar.S = -1;
                                int i17 = y3 + iVar.X2;
                                for (int i18 = 0; i18 < iVar.getChildCount(); i18++) {
                                    View childAt = iVar.getChildAt(i18);
                                    childAt.getHitRect(rect);
                                    if (rect.contains(i16, i17)) {
                                        tVar.S = RecyclerView.S(childAt);
                                        tVar.T = childAt.getTop();
                                    }
                                }
                                tVar.M = true;
                            }
                            if (motionEvent.getActionMasked() == 0 && (motionEvent.getY() - ((View) tVar.getParent()).getY()) - tVar.getY() > 0.0f) {
                                tVar.L = true;
                            }
                        }
                        return tVar.K;
                    }
                    return true;
                }
            }
            return false;
        }
        if ((i10 == 0 || p0(i10)) && getParent() != null) {
            if (!this.f32737o1 || this.f32702a) {
                if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                    if (motionEvent.getActionMasked() == 2 && (this.f32702a || this.f32709c)) {
                        int i19 = -1;
                        int i20 = -1;
                        for (int i21 = 0; i21 < motionEvent.getPointerCount(); i21++) {
                            if (this.f32715e == motionEvent.getPointerId(i21)) {
                                i19 = i21;
                            }
                            if (this.f32718f == motionEvent.getPointerId(i21)) {
                                i20 = i21;
                            }
                        }
                        if (i19 != -1 && i20 != -1) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(i20) - motionEvent.getX(i19), motionEvent.getY(i20) - motionEvent.getY(i19))) / this.h;
                            this.f32733n = hypot2;
                            if (!this.f32702a && (hypot2 > 1.01f || hypot2 < 0.99f)) {
                                this.f32702a = true;
                                if (hypot2 > 1.0f) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                this.f32742r = z10;
                                e1(z10);
                            }
                            if (this.f32702a) {
                                boolean z13 = this.f32742r;
                                if ((z13 && this.f32733n < 1.0f) || (!z13 && this.f32733n > 1.0f)) {
                                    this.f32735n1 = 0.0f;
                                } else {
                                    if (z13) {
                                        f7 = org.telegram.messenger.w1.y(2.0f, this.f32733n, 1.0f, 1.0f);
                                    } else {
                                        f7 = (1.0f - this.f32733n) / 0.5f;
                                    }
                                    this.f32735n1 = Math.max(0.0f, Math.min(1.0f, f7));
                                }
                                float f12 = this.f32735n1;
                                if (f12 == 1.0f || f12 == 0.0f) {
                                    if (p0(this.f32739p1)) {
                                        h0Var = k1(this.f32739p1);
                                    } else {
                                        h0Var = this.H;
                                    }
                                    if (this.f32735n1 == 1.0f) {
                                        int i22 = this.f32741q1;
                                        int ceil2 = (((int) Math.ceil(this.f32745s / this.f32741q1)) * i22) + ((int) ((this.f32764z1 / (qt0VarArr[0].h.getMeasuredWidth() - ((int) (qt0VarArr[0].h.getMeasuredWidth() / this.f32741q1)))) * (i22 - 1)));
                                        if (ceil2 >= h0Var.h()) {
                                            ceil2 = h0Var.h() - 1;
                                        }
                                        this.f32745s = ceil2;
                                    }
                                    T();
                                    if (this.f32735n1 == 0.0f) {
                                        this.f32742r = !this.f32742r;
                                    }
                                    e1(this.f32742r);
                                    this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                qt0VarArr[0].h.invalidate();
                                qt0 qt0Var = qt0VarArr[0];
                                if (qt0Var.G != null) {
                                    qt0Var.invalidate();
                                }
                            }
                        } else {
                            this.f32705b = false;
                            this.f32709c = false;
                            this.f32702a = false;
                            T();
                            return false;
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.f32715e == motionEvent.getPointerId(0) && this.f32718f == motionEvent.getPointerId(1)) || (this.f32715e == motionEvent.getPointerId(1) && this.f32718f == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.f32702a) {
                        this.f32709c = false;
                        this.f32705b = false;
                        this.f32702a = false;
                        T();
                    }
                } else {
                    if (this.f32705b && !this.f32702a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.f32733n = 1.0f;
                        this.f32715e = motionEvent.getPointerId(0);
                        this.f32718f = motionEvent.getPointerId(1);
                        qt0VarArr[0].h.I0(false);
                        qt0VarArr[0].h.cancelLongPress();
                        qt0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.f32754w = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - qt0VarArr[0].getX());
                        int y10 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - qt0VarArr[0].getY());
                        int i23 = this.f32754w;
                        this.f32745s = -1;
                        int i24 = y10 + qt0VarArr[0].h.X2;
                        if (getY() != 0.0f && this.E == 1) {
                            i24 = 0;
                        }
                        for (int i25 = 0; i25 < qt0VarArr[0].h.getChildCount(); i25++) {
                            View childAt2 = qt0VarArr[0].h.getChildAt(i25);
                            Rect rect2 = this.f32757x;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i23, i24)) {
                                qt0VarArr[0].h.getClass();
                                this.f32745s = RecyclerView.S(childAt2);
                                this.v = childAt2.getTop();
                            }
                        }
                        if (this.D1.T() && this.f32745s == -1) {
                            this.f32745s = (int) (((this.f32732m1[p0(qt0VarArr[0].F) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i23 / qt0VarArr[0].h.getMeasuredWidth(), 0.0f))) + qt0VarArr[0].f29851x.L0());
                            this.v = 0;
                        }
                        this.f32709c = true;
                    }
                    if (motionEvent.getActionMasked() == 0 && ((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - qt0VarArr[0].getY() > 0.0f) {
                        this.f32705b = true;
                    }
                }
                return this.f32702a;
            }
            return true;
        }
        return false;
    }

    public final boolean H0(MessageObject messageObject, View view, int i10, boolean z10) {
        sr0 sr0Var;
        char c10;
        int i11;
        int i12;
        final TL_stories.StoryItem storyItem;
        ft0 ft0Var;
        bi.l8 l8Var;
        if (!this.C1) {
            org.telegram.ui.ActionBar.n2 n2Var = this.f32753v1;
            if (n2Var.getParentActivity() != null && messageObject != null && ((sr0Var = this.W) == null || !sr0Var.f35656w)) {
                AndroidUtilities.hideKeyboard(n2Var.getParentActivity().getCurrentFocus());
                long j3 = this.f32728j1;
                int i13 = 8;
                if (z10 && ((w0(getClosestTab()) || getClosestTab() == 8) && !this.C1)) {
                    if (view instanceof org.telegram.ui.Cells.t7) {
                        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                        t7Var.k(t7Var.f23302n, t7Var.f23307r, true);
                    }
                    TL_stories.StoryItem storyItem2 = messageObject.storyItem;
                    if (storyItem2 != null) {
                        HashSet hashSet = new HashSet();
                        ArrayList<Integer> arrayList = storyItem2.albums;
                        if (arrayList != null) {
                            hashSet.addAll(arrayList);
                        }
                        boolean w02 = w0(getClosestTab());
                        n70 I = n70.I(n2Var, view);
                        n70 J = I.J();
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.lu0(I, 25), false);
                        J.k();
                        n70.f(J, getStoriesController().B(j3, true), hashSet, true, new org.telegram.ui.ActionBar.p(this, storyItem2, I, 29), new bi.r3(this, hashSet, storyItem2, I, 9));
                        I.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddToAlbum), new fi.m2(I, J, 9), false);
                        I.k();
                        I.c(R.drawable.msg_select, LocaleController.getString(R.string.StoriesAlbumMenuSelect), new bi.k8(this, messageObject, view, i10, 23), false);
                        if (w02) {
                            int h12 = h1(getClosestTab());
                            String w10 = getStoriesController().w(h12, j3);
                            I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new m8(this, h12, 8), false);
                            storyItem = storyItem2;
                            I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.StoriesAlbumMenuRemoveFromAlbum), new bi.k8(this, h12, storyItem, w10, 24), false);
                        } else {
                            storyItem = storyItem2;
                            if (getClosestTab() == 8 && (ft0Var = this.f32710c0) != null && (l8Var = ft0Var.f31011s) != null) {
                                if (l8Var.m(storyItem.f20134id)) {
                                    I.c(R.drawable.chats_unpin, LocaleController.getString(R.string.StoriesAlbumMenuUnpin), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r1) {
                                                case 0:
                                                    xu0 xu0Var = this;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xu0Var.getContext(), 0, xu0Var.F1);
                                                    alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                    alertDialog$Builder.f20225a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new zq0(xu0Var, storyItem));
                                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new wo0(4));
                                                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                                                    b2Var.show();
                                                    b2Var.h();
                                                    return;
                                                case 1:
                                                    xu0 xu0Var2 = this;
                                                    xu0Var2.getClass();
                                                    xu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20134id))), false);
                                                    return;
                                                case 2:
                                                    xu0 xu0Var3 = this;
                                                    xu0Var3.getClass();
                                                    xu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20134id))), true);
                                                    return;
                                                default:
                                                    xu0.h(this, storyItem);
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
                                                    xu0 xu0Var = this;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xu0Var.getContext(), 0, xu0Var.F1);
                                                    alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                    alertDialog$Builder.f20225a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new zq0(xu0Var, storyItem));
                                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new wo0(4));
                                                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                                                    b2Var.show();
                                                    b2Var.h();
                                                    return;
                                                case 1:
                                                    xu0 xu0Var2 = this;
                                                    xu0Var2.getClass();
                                                    xu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20134id))), false);
                                                    return;
                                                case 2:
                                                    xu0 xu0Var3 = this;
                                                    xu0Var3.getClass();
                                                    xu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20134id))), true);
                                                    return;
                                                default:
                                                    xu0.h(this, storyItem);
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
                                            xu0 xu0Var = this;
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xu0Var.getContext(), 0, xu0Var.F1);
                                            alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                            alertDialog$Builder.f20225a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new zq0(xu0Var, storyItem));
                                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new wo0(4));
                                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                                            b2Var.show();
                                            b2Var.h();
                                            return;
                                        case 1:
                                            xu0 xu0Var2 = this;
                                            xu0Var2.getClass();
                                            xu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20134id))), false);
                                            return;
                                        case 2:
                                            xu0 xu0Var3 = this;
                                            xu0Var3.getClass();
                                            xu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20134id))), true);
                                            return;
                                        default:
                                            xu0.h(this, storyItem);
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
                                        xu0 xu0Var = this;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xu0Var.getContext(), 0, xu0Var.F1);
                                        alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                        alertDialog$Builder.f20225a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new zq0(xu0Var, storyItem));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new wo0(4));
                                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                                        b2Var.show();
                                        b2Var.h();
                                        return;
                                    case 1:
                                        xu0 xu0Var2 = this;
                                        xu0Var2.getClass();
                                        xu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20134id))), false);
                                        return;
                                    case 2:
                                        xu0 xu0Var3 = this;
                                        xu0Var3.getClass();
                                        xu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20134id))), true);
                                        return;
                                    default:
                                        xu0.h(this, storyItem);
                                        return;
                                }
                            }
                        }, true);
                        I.f28669i = 3;
                        I.f28689u = true;
                        I.v = true;
                        I.L = true;
                        I.M = 3;
                        Point point = AndroidUtilities.displaySize;
                        Point point2 = AndroidUtilities.displaySize;
                        int min = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point2.x, point2.y) * 0.4333f) * 3.0f) / 4.0f));
                        I.N = min;
                        I.O = (min * 4) / 3;
                        I.f28688t = true;
                        I.P = true;
                        I.W = true;
                        I.Z();
                        return true;
                    }
                } else {
                    if (messageObject.getDialogId() == j3) {
                        c10 = 0;
                    } else {
                        c10 = 1;
                    }
                    SparseArray[] sparseArrayArr = this.Z0;
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.f32704a1++;
                    }
                    if (this.f32704a1 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    this.f32731l0.setVisibility(i11);
                    org.telegram.ui.ActionBar.v0 v0Var = this.f32750u0;
                    if (v0Var != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        } else {
                            i12 = 8;
                        }
                        v0Var.setVisibility(i12);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var2 = this.f32748t0;
                    if (v0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i13 = 0;
                        }
                        v0Var2.setVisibility(i13);
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
                    this.f32707b1 = false;
                    if (view instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.u7) {
                        ((org.telegram.ui.Cells.u7) view).b(i10, true);
                    } else if (view instanceof org.telegram.ui.Cells.n7) {
                        ((org.telegram.ui.Cells.n7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.i7) {
                        ((org.telegram.ui.Cells.i7) view).e(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.e2) {
                        ((org.telegram.ui.Cells.e2) view).c(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.t7) {
                        ((org.telegram.ui.Cells.t7) view).i(true, true);
                    }
                    if (!this.C1) {
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
        char c10;
        char c11;
        float abs;
        View childAt;
        int R;
        float f7;
        float measuredWidth;
        qt0[] qt0VarArr = this.f32729k0;
        qt0 qt0Var = qt0VarArr[0];
        if (qt0Var != null && qt0VarArr[1] != null) {
            float f10 = 0.0f;
            sr0 sr0Var = this.W;
            if (sr0Var != null) {
                if (p0(qt0Var.F) && qt0VarArr[0].F != 9) {
                    c10 = 1;
                } else {
                    c10 = 0;
                }
                if (qt0VarArr[1].getVisibility() == 0) {
                    if (p0(qt0VarArr[1].F) && qt0VarArr[1].F != 9) {
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
                        measuredWidth = qt0VarArr[0].getMeasuredWidth();
                    }
                    sr0Var.setTranslationX(measuredWidth);
                } else {
                    sr0Var.setTranslationX(qt0VarArr[c10 ^ 1].getTranslationX());
                    abs = 1.0f - (Math.abs(sr0Var.getTranslationX()) / sr0Var.getMeasuredWidth());
                }
                float f11 = 0.0f;
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
                            f7 = childAt.getY() - wr0Var.getPaddingTop();
                        } else if (wr0Var.getChildCount() == 0) {
                            f7 = 0.0f;
                        } else {
                            f7 = -AndroidUtilities.dp(48.0f);
                        }
                        f11 += Utilities.clamp01(1.0f - (qt0VarArr[i10].getTranslationX() / qt0VarArr[i10].getMeasuredWidth())) * f7;
                    }
                }
                float clamp01 = Utilities.clamp01(1.0f - ((-f11) / AndroidUtilities.dpf2(48.0f)));
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
                sr0Var.setAlpha(clamp01);
                sr0Var.setScaleX(lerp);
                sr0Var.setScaleY(lerp);
                sr0Var.setTranslationY(this.K1 + f11);
                f10 = abs;
            }
            K();
            if (this.U1 != f10) {
                this.U1 = f10;
                o0();
                invalidate();
            }
        }
    }

    public boolean I0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return false;
    }

    public final boolean J() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xu0.J():boolean");
    }

    public final void J0(float f7) {
        int i10;
        int i11;
        qt0[] qt0VarArr = this.f32729k0;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i12 != 0 || qt0VarArr[1].getVisibility() == 0) {
            if (this.f32724h1) {
                qt0 qt0Var = qt0VarArr[0];
                qt0Var.setTranslationX((-f7) * qt0Var.getMeasuredWidth());
                qt0VarArr[1].setTranslationX(qt0VarArr[0].getMeasuredWidth() - (qt0VarArr[0].getMeasuredWidth() * f7));
            } else {
                qt0 qt0Var2 = qt0VarArr[0];
                qt0Var2.setTranslationX(qt0Var2.getMeasuredWidth() * f7);
                qt0VarArr[1].setTranslationX((qt0VarArr[0].getMeasuredWidth() * f7) - qt0VarArr[0].getMeasuredWidth());
            }
            M0(getTabProgress());
            float a02 = a0(f7);
            this.f32738p0 = a02;
            int i13 = 4;
            if (a02 != 0.0f && D() && !q0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            this.f32743r0.setVisibility(i10);
            org.telegram.ui.ActionBar.v0 v0Var = this.f32734n0;
            if (v0Var != null && !D()) {
                if (v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                v0Var.setVisibility(i11);
                this.f32736o0 = 0.0f;
            } else {
                this.f32736o0 = b0(f7);
                t1();
            }
            q1(false);
            if (i12 == 0) {
                qt0 qt0Var3 = qt0VarArr[0];
                qt0VarArr[0] = qt0VarArr[1];
                qt0VarArr[1] = qt0Var3;
                qt0Var3.setVisibility(8);
                if (v0Var != null && this.f32758x0 == 2) {
                    if (v0()) {
                        i13 = 8;
                    }
                    v0Var.setVisibility(i13);
                }
                this.f32758x0 = 0;
                f1();
            }
        }
    }

    public final void K() {
        js jsVar = this.P0;
        if (jsVar != null) {
            sr0 sr0Var = this.W;
            float f7 = 0.0f;
            if (sr0Var != null) {
                f7 = 0.0f + (sr0Var.getVisibilityFactor() * AndroidUtilities.dp(38.0f) * (1.0f - Math.abs(sr0Var.getTranslationX() / sr0Var.getMeasuredWidth())));
            }
            jsVar.setTranslationY(this.K1 + f7);
        }
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
        this.f32704a1 = 0;
        D0(sparseArrayArr[0]);
        lr0 lr0Var = this.U;
        if (lr0Var != null) {
            lr0Var.h();
            lr0Var.j();
        }
        b1(false);
        r1(z10);
        hu0 hu0Var = this.R;
        if (hu0Var != null) {
            hu0Var.f26891w.clear();
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
        su0 su0Var = this.f32716e0.f31012w;
        if (su0Var != null) {
            if (z10 && getClosestTab() == 9) {
                z13 = true;
            } else {
                z13 = false;
            }
            su0Var.b(z13);
        }
        su0 su0Var2 = this.f32710c0.f31012w;
        if (su0Var2 != null) {
            if (z10 && getClosestTab() == 8) {
                z12 = true;
            } else {
                z12 = false;
            }
            su0Var2.b(z12);
        }
        for (wu0 wu0Var : this.Y1.values()) {
            vu0 vu0Var = wu0Var.f32371c;
            if (vu0Var.f31011s != null) {
                su0 su0Var3 = vu0Var.f31012w;
                if (z10 && getClosestTab() == wu0Var.f32369a) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                su0Var3.b(z11);
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.f32734n0;
        if (v0Var != null) {
            ks0 ks0Var = this.J0;
            if (ks0Var != null && ks0Var.a() && getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            v0Var.setSearchFieldHint(LocaleController.getString(i10));
        }
        I();
    }

    public void M0(float f7) {
        E0();
    }

    public boolean N() {
        return this instanceof y30;
    }

    public final boolean O(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x10 = (-view.getX()) - getX();
        qt0[] qt0VarArr = this.f32729k0;
        motionEvent.offsetLocation(x10 - qt0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - qt0VarArr[0].getY()) - qt0VarArr[0].h.getFastScroll().getY());
        return qt0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public final void O0(org.telegram.ui.ActionBar.n2 n2Var, long j3, int i10) {
        new org.telegram.ui.w71(n2Var, j3, this.f32732m1[1], new tc(this, j3, i10)).show();
    }

    public void P(Canvas canvas, float f7, Rect rect, Paint paint) {
        canvas.drawRect(rect, paint);
    }

    public final void P0(org.telegram.ui.ActionBar.n2 n2Var, long j3, int i10) {
        e5.v0(n2Var, LocaleController.getString(R.string.Delete), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesAlbumMenuDeleteAlbumAsk, getStoriesController().w(i10, j3))), LocaleController.getString(R.string.Delete), true, new bi.h7(this, j3, i10, 7));
    }

    public final void Q(Canvas canvas, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            qt0[] qt0VarArr = this.f32729k0;
            if (i10 < qt0VarArr.length) {
                qt0 qt0Var = qt0VarArr[i10];
                if (qt0Var != null && qt0Var.getVisibility() == 0) {
                    for (int i11 = 0; i11 < qt0VarArr[i10].h.getChildCount(); i11++) {
                        View childAt = qt0VarArr[i10].h.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + qt0VarArr[i10].h.X2) {
                            int save = canvas.save();
                            canvas.translate(childAt.getX() + qt0VarArr[i10].getX(), childAt.getY() + qt0VarArr[i10].h.getY() + qt0VarArr[i10].getY() + getY());
                            childAt.draw(canvas);
                            if (arrayList != null && (childAt instanceof lv0)) {
                                arrayList.add((lv0) childAt);
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

    public final void Q0(org.telegram.ui.ActionBar.n2 n2Var, long j3, int i10) {
        String w10 = getStoriesController().w(i10, j3);
        Context context = n2Var.getContext();
        org.telegram.ui.ActionBar.f6 resourceProvider = n2Var.getResourceProvider();
        j2.d dVar = new j2.d(this, j3, i10);
        Pattern pattern = e5.f25584a;
        e5.R(context, n2Var, LocaleController.getString(R.string.StoriesAlbumRename), LocaleController.getString(R.string.StoriesAlbumRenameHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), w10, 12, LocaleController.getString(R.string.Rename), resourceProvider, dVar);
    }

    public final boolean R(int i10) {
        mu0[] mu0VarArr = this.f32751u1.f29523n;
        if (mu0VarArr == null) {
            return false;
        }
        mu0[] mu0VarArr2 = this.f32749t1;
        if (i10 == 0) {
            mu0 mu0Var = mu0VarArr2[i10];
            if (!mu0Var.h) {
                int[] iArr = mu0Var.f28547f;
                int[] iArr2 = mu0VarArr[i10].f28547f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = mu0VarArr2[i10].f28547f;
            int[] iArr4 = mu0VarArr[i10].f28547f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        mu0VarArr2[i10].f28543a.addAll(mu0VarArr[i10].f28543a);
        mu0VarArr2[i10].f28545c.addAll(mu0VarArr[i10].f28545c);
        for (Map.Entry entry : mu0VarArr[i10].d.entrySet()) {
            mu0VarArr2[i10].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i11 = 0; i11 < 2; i11++) {
            mu0VarArr2[i10].f28544b[i11] = mu0VarArr[i10].f28544b[i11].clone();
            mu0 mu0Var2 = mu0VarArr2[i10];
            int[] iArr5 = mu0Var2.f28550j;
            mu0 mu0Var3 = mu0VarArr[i10];
            iArr5[i11] = mu0Var3.f28550j[i11];
            mu0Var2.f28549i[i11] = mu0Var3.f28549i[i11];
        }
        mu0VarArr2[i10].f28546e.addAll(mu0VarArr[i10].f28546e);
        return !mu0VarArr[i10].f28543a.isEmpty();
    }

    public final void R0(String str) {
        boolean shouldShowUrlInAlert = AndroidUtilities.shouldShowUrlInAlert(str);
        org.telegram.ui.ActionBar.n2 n2Var = this.f32753v1;
        if (shouldShowUrlInAlert) {
            e5.q0(n2Var, str, true, true);
        } else {
            of.f.s(n2Var.getParentActivity(), str);
        }
    }

    public final void S(int i10, ll0 ll0Var, boolean z10) {
        ArrayList arrayList = this.f32749t1[i10].f28546e;
        int L0 = ((s4.c0) ll0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            vt0 vt0Var = null;
            if (arrayList != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (L0 <= ((vt0) arrayList.get(i11)).f32006b) {
                        vt0Var = (vt0) arrayList.get(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                if (vt0Var == null) {
                    vt0Var = (vt0) i2.g.h(1, arrayList);
                }
            }
            if (vt0Var != null) {
                y0(i10, vt0Var.d, vt0Var.f32006b + 1, z10);
            }
        }
    }

    public int S0() {
        return -1;
    }

    public final void T() {
        qt0[] qt0VarArr;
        qt0 qt0Var;
        boolean z10;
        int i10;
        s4.h0 adapter;
        if (this.f32737o1) {
            int i11 = 0;
            while (true) {
                qt0VarArr = this.f32729k0;
                if (i11 < qt0VarArr.length) {
                    qt0Var = qt0VarArr[i11];
                    if (qt0Var.F == this.f32739p1) {
                        break;
                    }
                    i11++;
                } else {
                    qt0Var = null;
                    break;
                }
            }
            if (qt0Var != null) {
                boolean p02 = p0(qt0Var.F);
                float f7 = this.f32735n1;
                mu0[] mu0VarArr = this.f32749t1;
                float f10 = 1.0f;
                if (f7 == 1.0f) {
                    this.f32737o1 = false;
                    int i12 = this.f32741q1;
                    int[] iArr = this.f32732m1;
                    iArr[p02 ? 1 : 0] = i12;
                    if (!p02) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (c0(qt0Var.F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(this.f32741q1);
                    }
                    for (int i13 = 0; i13 < qt0VarArr.length; i13++) {
                        qt0 qt0Var2 = qt0VarArr[i13];
                        if (qt0Var2 != null && qt0Var2.h != null && (((i10 = qt0Var2.F) == 0 || p0(i10)) && (adapter = qt0VarArr[i13].h.getAdapter()) != null)) {
                            int h = adapter.h();
                            if (i13 == 0) {
                                mu0VarArr[0].g(false);
                            }
                            qt0VarArr[i13].f29848r.setVisibility(8);
                            qt0VarArr[i13].f29851x.y1(iArr[p02 ? 1 : 0]);
                            qt0VarArr[i13].h.a0();
                            qt0VarArr[i13].h.invalidate();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(qt0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                    }
                    if (this.f32745s >= 0) {
                        for (int i14 = 0; i14 < qt0VarArr.length; i14++) {
                            qt0 qt0Var3 = qt0VarArr[i14];
                            if (qt0Var3.F == this.f32739p1) {
                                View m10 = qt0Var3.f29849s.m(this.f32745s);
                                if (m10 != null) {
                                    this.v = m10.getTop();
                                }
                                qt0 qt0Var4 = qt0VarArr[i14];
                                qt0Var4.f29851x.h1(this.f32745s, (-qt0Var4.h.getPaddingTop()) + this.v);
                            }
                        }
                        return;
                    }
                    X0();
                } else if (f7 == 0.0f) {
                    this.f32737o1 = false;
                    if (this.f32739p1 == 0) {
                        mu0VarArr[0].g(false);
                    }
                    qt0Var.f29848r.setVisibility(8);
                    qt0Var.h.invalidate();
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
                    ofFloat.addUpdateListener(new ms0(this, qt0Var, 0));
                    ofFloat.addListener(new org.telegram.ui.ej(this, z10, p02 ? 1 : 0, qt0Var));
                    ofFloat.setInterpolator(pr.f29493f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                }
            }
        }
    }

    public final void T0(ArrayList arrayList, boolean z10) {
        boolean z11;
        boolean z12;
        ft0 ft0Var = this.f32710c0;
        if (ft0Var != null && ft0Var.f31011s != null) {
            org.telegram.ui.ActionBar.n2 n2Var = this.f32753v1;
            if (z10 && arrayList.size() > n2Var.getMessagesController().storiesPinnedToTopCountMax) {
                yc.a0(n2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", n2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
                return;
            }
            bi.l8 l8Var = ft0Var.f31011s;
            int i10 = l8Var.f3298c;
            ArrayList arrayList2 = l8Var.f3301g;
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
                    l8Var.d(true);
                    TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                    tL_togglePinnedToTop.f20147id.addAll(arrayList2);
                    tL_togglePinnedToTop.peer = MessagesController.getInstance(i10).getInputPeer(l8Var.d);
                    ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new bi.c7(2));
                }
                z13 = z11;
            }
            if (z13) {
                yc.a0(n2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", n2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
            } else if (z10) {
                yc.a0(n2Var).M(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinned", arrayList.size(), new Object[0])), LocaleController.formatPluralString("StoriesPinnedText", arrayList.size(), new Object[0]), R.raw.ic_pin).j();
            } else {
                yc.a0(n2Var).Q(R.raw.ic_unpin, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesUnpinned", arrayList.size(), new Object[0]))).j();
            }
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

    public final boolean U0(MotionEvent motionEvent, boolean z10) {
        int i10;
        qt0 qt0Var;
        lr0 lr0Var;
        int i11;
        int i12;
        int closestTab = getClosestTab();
        ns0 ns0Var = this.I0;
        SparseIntArray sparseIntArray = ns0Var.O;
        int i13 = ns0Var.f24158n;
        int i14 = -1;
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i15 = sparseIntArray.get(i13 + i10, -1);
        sr0 sr0Var = this.W;
        if (sr0Var != null) {
            if (!w0(closestTab) && closestTab != 8) {
                if (w0(i15) || i15 == 8) {
                    i14 = sr0Var.getCurrentAlbumId();
                }
            } else {
                h81 h81Var = sr0Var.f35653n;
                SparseIntArray sparseIntArray2 = h81Var.f26662b0;
                int i16 = h81Var.F;
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
                i15 = i1(i14).f32369a;
            }
        }
        if (i15 >= 0) {
            org.telegram.ui.ActionBar.v0 v0Var = this.f32734n0;
            if (v0Var != null && !D()) {
                if (v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                v0Var.setVisibility(i11);
                this.f32736o0 = 0.0f;
            } else {
                this.f32736o0 = b0(0.0f);
                s1(0.0f);
            }
            if ((!this.V0 || getSelectedTab() != 11) && (!C() || !this.C1 || (getClosestTab() != 8 && !w0(getClosestTab())))) {
                qt0[] qt0VarArr = this.f32729k0;
                qt0 qt0Var2 = qt0VarArr[0];
                if (qt0Var2 != null && qt0Var2.F == 13 && (lr0Var = this.U) != null) {
                    ci.a aVar = lr0Var.f4880n;
                    if (!z10) {
                    }
                }
                qt0 qt0Var3 = qt0VarArr[0];
                nr0 nr0Var = this.V;
                if (qt0Var3 != null && qt0Var3.F == 14 && nr0Var != null) {
                    yh.v1 v1Var = nr0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.C1 || (qt0Var = qt0VarArr[0]) == null || qt0Var.F != 13) && ((nr0Var == null || !nr0Var.g()) && (sr0Var == null || !sr0Var.f35656w))) {
                    q1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    k0();
                    this.f32762y1 = false;
                    this.f32759x1 = true;
                    N0(true);
                    this.f32764z1 = (int) motionEvent.getX();
                    this.G.setEnabled(false);
                    ns0Var.setEnabled(false);
                    qt0 qt0Var4 = qt0VarArr[1];
                    qt0Var4.F = i15;
                    qt0Var4.setVisibility(0);
                    this.f32724h1 = z10;
                    m1(true);
                    if (z10) {
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

    public final String V(boolean z10) {
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        lr0 lr0Var;
        if (!r0()) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        if (z10 && (lr0Var = this.U) != null) {
            return lr0Var.getBotPreviewsSubtitle();
        }
        ft0 ft0Var = this.f32710c0;
        if (ft0Var != null && ft0Var.f31011s != null) {
            i10 = 0;
            i11 = 0;
            for (int i12 = 0; i12 < ft0Var.f31011s.f3302i.size(); i12++) {
                MessageObject messageObject = (MessageObject) ft0Var.f31011s.f3302i.get(i12);
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

    public final qt0 W(int i10) {
        int i11 = 0;
        while (true) {
            qt0[] qt0VarArr = this.f32729k0;
            if (i11 < qt0VarArr.length) {
                qt0 qt0Var = qt0VarArr[i11];
                if (qt0Var != null && qt0Var.F == i10) {
                    return qt0Var;
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    public final void W0(s4.h0 h0Var) {
        if (h0Var instanceof ru0) {
            ArrayList arrayList = this.E0;
            ArrayList arrayList2 = this.F0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        } else if (h0Var == this.M) {
            ArrayList arrayList3 = this.G0;
            ArrayList arrayList4 = this.H0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
        } else {
            eu0 eu0Var = this.N;
            if (h0Var == eu0Var) {
                eu0Var.f25817r = null;
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
        return Utilities.clamp(i14, 9, (this.f32730k1 && i10 == 1) ? 2 : 2);
    }

    public final void X0() {
        int i10;
        int i11 = 0;
        while (true) {
            qt0[] qt0VarArr = this.f32729k0;
            if (i11 < qt0VarArr.length) {
                wr0 wr0Var = qt0VarArr[i11].h;
                if (wr0Var != null) {
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < wr0Var.getChildCount(); i14++) {
                        View childAt = wr0Var.getChildAt(i14);
                        if (childAt instanceof org.telegram.ui.Cells.t7) {
                            org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                            int messageId = t7Var.getMessageId();
                            i13 = t7Var.getTop();
                            i12 = messageId;
                        }
                        if (childAt instanceof org.telegram.ui.Cells.j7) {
                            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) childAt;
                            int id2 = j7Var.getMessage().getId();
                            i13 = j7Var.getTop();
                            i12 = id2;
                        }
                        if (childAt instanceof org.telegram.ui.Cells.i7) {
                            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) childAt;
                            i12 = i7Var.getMessage().getId();
                            i13 = i7Var.getTop();
                        }
                        if (i12 != 0) {
                            break;
                        }
                    }
                    if (i12 != 0) {
                        int i15 = qt0VarArr[i11].F;
                        int i16 = -1;
                        if (p0(i15)) {
                            uu0 k12 = k1(i15);
                            if (k12 != null && k12.f31011s != null) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= k12.f31011s.f3302i.size()) {
                                        break;
                                    } else if (i12 == ((MessageObject) k12.f31011s.f3302i.get(i17)).getId()) {
                                        i16 = i17;
                                        break;
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                            i10 = i16;
                        } else if (i15 >= 0) {
                            mu0[] mu0VarArr = this.f32749t1;
                            if (i15 < mu0VarArr.length) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= mu0VarArr[i15].f28543a.size()) {
                                        break;
                                    } else if (i12 == ((MessageObject) mu0VarArr[i15].f28543a.get(i18)).getId()) {
                                        i16 = i18;
                                        break;
                                    } else {
                                        i18++;
                                    }
                                }
                                i10 = mu0VarArr[i15].f28553m + i16;
                            }
                        }
                        if (i16 >= 0) {
                            ((s4.c0) wr0Var.getLayoutManager()).h1(i10, (-qt0VarArr[i11].h.getPaddingTop()) + i13);
                            if (this.f32737o1) {
                                qt0 qt0Var = qt0VarArr[i11];
                                qt0Var.f29849s.h1(i10, (-qt0Var.h.getPaddingTop()) + i13);
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
        int i11 = this.X1;
        if (z10) {
            i10 = AndroidUtilities.dp(52.0f);
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public final void Y0(int i10) {
        ns0 ns0Var;
        if (!this.L1 && (ns0Var = this.I0) != null) {
            ns0Var.h(null, i10, ns0Var.P.get(i10));
        }
    }

    public final int Z(int i10) {
        float f7;
        int i11;
        int dp = AndroidUtilities.dp(54.0f) + this.f32708b2;
        sr0 sr0Var = this.W;
        if (sr0Var != null && (w0(i10) || i10 == 8)) {
            f7 = sr0Var.getVisibilityFactor() * AndroidUtilities.dp(40.0f);
        } else {
            f7 = 0.0f;
        }
        int i12 = dp + ((int) f7);
        if (i10 == 9) {
            i11 = AndroidUtilities.dp(64.0f);
        } else {
            i11 = 0;
        }
        return i12 + i11;
    }

    public final void Z0(float f7, int i10) {
        int i11;
        ns0 ns0Var = this.I0;
        if (ns0Var != null) {
            if (w0(i10)) {
                i11 = 8;
            } else {
                i11 = i10;
            }
            ns0Var.j(f7, i11);
        }
        sr0 sr0Var = this.W;
        if (sr0Var != null) {
            h81 h81Var = sr0Var.f35653n;
            if (w0(i10)) {
                h81Var.f(f7, h1(i10));
            } else if (i10 == 8) {
                h81Var.f(f7, 0);
            }
        }
    }

    public final float a0(float f7) {
        int i10;
        int i11;
        int i12;
        int i13;
        float f10 = 0.0f;
        if (q0()) {
            return 0.0f;
        }
        qt0[] qt0VarArr = this.f32729k0;
        qt0 qt0Var = qt0VarArr[1];
        nr0 nr0Var = this.V;
        if (qt0Var != null && ((i12 = qt0Var.F) == 0 || (((i12 == 8 || w0(i12)) && TextUtils.isEmpty(getStoriesHashtag())) || (i13 = qt0VarArr[1].F) == 9 || i13 == 11 || i13 == 13 || (i13 == 14 && nr0Var != null)))) {
            f10 = 0.0f + f7;
        }
        qt0 qt0Var2 = qt0VarArr[0];
        if (qt0Var2 != null && ((i10 = qt0Var2.F) == 0 || (((i10 == 8 || w0(i10)) && TextUtils.isEmpty(getStoriesHashtag())) || (i11 = qt0VarArr[0].F) == 9 || i11 == 11 || i11 == 13 || (i11 == 14 && nr0Var != null)))) {
            return (1.0f - f7) + f10;
        }
        return f10;
    }

    public final void a1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i10 = 0;
        while (true) {
            qt0[] qt0VarArr = this.f32729k0;
            if (i10 < qt0VarArr.length) {
                qt0 qt0Var = qt0VarArr[i10];
                if (qt0Var.F != 7 || qt0Var.h.getAdapter() == null || qt0VarArr[i10].h.getAdapter().h() == 0 || this.f32753v1.getMessagesController().getStoriesController().f3839j.size() <= 0) {
                    i10++;
                } else {
                    return;
                }
            } else {
                if (this.F == 0) {
                    ht0 ht0Var = this.f32703a0;
                    ht0Var.d = chatFull;
                    ht0Var.f26872e = arrayList;
                }
                v1(true);
                for (int i11 = 0; i11 < qt0VarArr.length; i11++) {
                    qt0 qt0Var2 = qt0VarArr[i11];
                    if (qt0Var2.F == 7 && qt0Var2.h.getAdapter() != null) {
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

    public final float b0(float f7) {
        float f10 = 0.0f;
        if (q0()) {
            return 0.0f;
        }
        qt0[] qt0VarArr = this.f32729k0;
        qt0 qt0Var = qt0VarArr[1];
        if (qt0Var != null && s0(qt0Var.F) && qt0VarArr[1].F != 11) {
            f10 = 0.0f + f7;
        }
        qt0 qt0Var2 = qt0VarArr[0];
        if (qt0Var2 != null && s0(qt0Var2.F) && qt0VarArr[0].F != 11) {
            return (1.0f - f7) + f10;
        }
        return f10;
    }

    public void b1(boolean z10) {
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
            this.N1.addListener(new org.telegram.ui.to(20, this, z10));
            this.N1.start();
            if (z10) {
                u1();
            }
        }
    }

    public final int c0(int i10) {
        uu0 k12;
        bi.l8 l8Var;
        if (p0(i10) && (k12 = k1(i10)) != null && (l8Var = k12.f31011s) != null) {
            return l8Var.g();
        }
        return 0;
    }

    public final void c1(int r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xu0.c1(int, boolean):void");
    }

    public final void d1(int i10) {
        int h12 = h1(getClosestTab());
        sr0 sr0Var = this.W;
        if (h12 != i10) {
            if (sr0Var != null) {
                sr0Var.f35653n.d(i10, sr0Var.f35655s.i(i10));
                return;
            }
            return;
        }
        sr0Var.setReorderingAlbums(true);
        wu0 i12 = i1(i10);
        qt0 W = W(i12.f32369a);
        if (W == null) {
            return;
        }
        wr0 wr0Var = W.h;
        for (int i11 = 0; i11 < wr0Var.getChildCount(); i11++) {
            View childAt = wr0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.t7) {
                ((org.telegram.ui.Cells.t7) childAt).l(true, true);
            }
        }
        vu0 vu0Var = i12.f32371c;
        if (vu0Var != null && !vu0Var.f31013x) {
            vu0Var.f31013x = true;
        }
        q1(true);
    }

    @Override
    public final void didReceivedNotification(int r42, int r43, java.lang.Object... r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xu0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ns0 ns0Var = this.I0;
        if (ns0Var != null) {
            canvas.save();
            canvas.translate(ns0Var.getX(), ns0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        js0 js0Var = this.R0;
        if (js0Var != null) {
            int i10 = js0Var.T;
            if ((i10 == 3 || i10 == 1) && this.P0 == null) {
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int i10;
        if (view == this.R0 && this.P0 == null) {
            canvas.save();
            qt0[] qt0VarArr = this.f32729k0;
            float top = qt0VarArr[0].getTop();
            sr0 sr0Var = this.W;
            if (sr0Var != null && ((i10 = qt0VarArr[0].F) == 8 || w0(i10))) {
                top -= sr0Var.getVisualHeight();
            }
            canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + AndroidUtilities.dp(12.0f));
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void e(org.telegram.ui.Cells.r2 r2Var) {
        int i10;
        org.telegram.ui.ActionBar.n2 n2Var = this.f32753v1;
        if (n2Var != null && n2Var.getMessagesController().getStoriesController().I(r2Var.getDialogId())) {
            n2Var.getOrCreateStoryViewer().getClass();
            bi.pb orCreateStoryViewer = n2Var.getOrCreateStoryViewer();
            Context context = n2Var.getContext();
            long dialogId = r2Var.getDialogId();
            bi.d9 a2 = bi.d9.a((ll0) r2Var.getParent());
            if ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).f34011s1) {
                i10 = AndroidUtilities.dp(68.0f);
            } else {
                i10 = 0;
            }
            a2.f2902s += i10;
            orCreateStoryViewer.D(context, dialogId, a2);
        }
    }

    public final void e1(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xu0.e1(boolean):void");
    }

    public final float f0(int i10, boolean z10) {
        float width = getWidth();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            qt0[] qt0VarArr = this.f32729k0;
            if (i11 >= qt0VarArr.length) {
                break;
            }
            qt0 qt0Var = qt0VarArr[i11];
            if (qt0Var != null) {
                int i13 = qt0Var.F;
                if ((z10 && i10 == 8 && w0(i13)) || i13 == i10) {
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
            qt0[] qt0VarArr = this.f32729k0;
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

    public final float g0(int i10, boolean z10) {
        float f7 = 0.0f;
        int i11 = 0;
        while (true) {
            qt0[] qt0VarArr = this.f32729k0;
            if (i11 < qt0VarArr.length) {
                qt0 qt0Var = qt0VarArr[i11];
                if (qt0Var != null) {
                    int i12 = qt0Var.F;
                    if ((z10 && i10 == 8 && w0(i12)) || i12 == i10) {
                        f7 = (1.0f - Math.abs(qt0VarArr[i11].getTranslationX() / getWidth())) + f7;
                    }
                }
                i11++;
            } else {
                return f7;
            }
        }
    }

    public final void g1(MotionEvent motionEvent) {
        float f7;
        float f10;
        boolean z10;
        float measuredWidth;
        qt0 qt0Var;
        qt0 qt0Var2;
        int measuredWidth2;
        qt0 qt0Var3;
        qt0 qt0Var4;
        boolean z11;
        VelocityTracker velocityTracker = this.B1;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.S0);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f7 = this.B1.getXVelocity();
                f10 = this.B1.getYVelocity();
                if (!this.f32759x1 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                    if (f7 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    U0(motionEvent, z11);
                }
            } else {
                f7 = 0.0f;
                f10 = 0.0f;
            }
            if (this.f32759x1) {
                qt0[] qt0VarArr = this.f32729k0;
                float x10 = qt0VarArr[0].getX();
                this.f32720f1 = new AnimatorSet();
                if (Math.abs(x10) < qt0VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f32726i1 = z10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new h70(this, 19));
                boolean z12 = this.f32726i1;
                Property property = View.TRANSLATION_X;
                if (z12) {
                    measuredWidth = Math.abs(x10);
                    if (this.f32724h1) {
                        this.f32720f1.playTogether(ObjectAnimator.ofFloat(qt0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(qt0VarArr[1], property, qt0Var4.getMeasuredWidth()), ofFloat);
                    } else {
                        this.f32720f1.playTogether(ObjectAnimator.ofFloat(qt0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(qt0VarArr[1], property, -qt0Var3.getMeasuredWidth()), ofFloat);
                    }
                } else {
                    measuredWidth = qt0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                    if (this.f32724h1) {
                        this.f32720f1.playTogether(ObjectAnimator.ofFloat(qt0VarArr[0], property, -qt0Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(qt0VarArr[1], property, 0.0f), ofFloat);
                    } else {
                        this.f32720f1.playTogether(ObjectAnimator.ofFloat(qt0VarArr[0], property, qt0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(qt0VarArr[1], property, 0.0f), ofFloat);
                    }
                }
                this.f32720f1.setInterpolator(f32701e2);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs = Math.abs(f7);
                if (abs > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                this.f32720f1.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                this.f32720f1.addListener(new qs0(this, 1));
                this.f32720f1.start();
                this.f32722g1 = true;
                this.f32759x1 = false;
                L0();
            } else {
                this.f32762y1 = false;
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

    public SparseArray<MessageObject> getActionModeSelected() {
        return this.Z0[0];
    }

    public float getBottomButtonStoriesVisibility() {
        qt0 qt0Var;
        qt0 qt0Var2;
        boolean z10;
        boolean z11;
        bi.l8 l8Var;
        bi.l8 l8Var2;
        float f7 = 1.0f;
        qt0[] qt0VarArr = this.f32729k0;
        if (qt0VarArr == null || (qt0Var = qt0VarArr[0]) == null || (qt0Var2 = qt0VarArr[1]) == null || qt0Var.f29850w == null || qt0Var2.f29850w == null) {
            return 1.0f;
        }
        int i10 = qt0Var.F;
        int i11 = qt0Var2.F;
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
        float visibilityFactor = 1.0f - qt0VarArr[0].f29850w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - qt0VarArr[1].f29850w.getVisibilityFactor();
        uu0 k12 = k1(qt0VarArr[0].F);
        if (i10 == 8 || (k12 != null && (l8Var2 = k12.f31011s) != null && l8Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        uu0 k13 = k1(i11);
        if (i11 != 8 && (k13 == null || (l8Var = k13.f31011s) == null || l8Var.g() <= 0)) {
            f7 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f7;
        }
        if (!z11) {
            f7 = visibilityFactor;
        }
        return AndroidUtilities.lerp(visibilityFactor, f7, Math.abs(qt0VarArr[0].getTranslationX() / qt0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        qt0[] qt0VarArr = this.f32729k0;
        qt0 qt0Var = qt0VarArr[1];
        if (qt0Var != null && qt0Var.getVisibility() == 0) {
            if (this.f32722g1 && !this.f32726i1) {
                return qt0VarArr[1].F;
            }
            if (Math.abs(qt0VarArr[1].getTranslationX()) < qt0VarArr[1].getMeasuredWidth() / 2.0f) {
                return qt0VarArr[1].F;
            }
        }
        return getSelectedTab();
    }

    public ll0 getCurrentListView() {
        dt0 dt0Var;
        qt0 qt0Var = this.f32729k0[0];
        int i10 = qt0Var.F;
        if (i10 == 13) {
            return this.U.getCurrentListView();
        }
        if (i10 == 14) {
            return this.V.getCurrentListView();
        }
        if (i10 == 12 && (dt0Var = this.T) != null) {
            return dt0Var.f36464a.f35500x0;
        }
        return qt0Var.h;
    }

    public int getInitialTab() {
        return 0;
    }

    public int getPhotosVideosTypeFilter() {
        return this.f32749t1[0].f28557q;
    }

    public TextView getSaveItem() {
        return this.f32740q0;
    }

    public org.telegram.ui.ActionBar.v0 getSearchItem() {
        return this.f32734n0;
    }

    public aj0 getSearchOptionsItem() {
        return this.f32746s0;
    }

    public int getSelectedTab() {
        int currentTabId = this.I0.getCurrentTabId();
        sr0 sr0Var = this.W;
        if (sr0Var != null && currentTabId == 8) {
            int currentAlbumId = sr0Var.getCurrentAlbumId();
            if (currentAlbumId == 0) {
                return 8;
            }
            if (currentAlbumId > 0) {
                return i1(currentAlbumId).f32369a;
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
            qt0[] qt0VarArr = this.f32729k0;
            if (i10 < qt0VarArr.length) {
                qt0 qt0Var = qt0VarArr[i10];
                if (qt0Var != null) {
                    f7 = ((1.0f - Math.abs(qt0Var.getTranslationX() / getWidth())) * qt0Var.F) + f7;
                }
                i10++;
            } else {
                return f7;
            }
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.A0, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f21088z6));
        org.telegram.ui.ActionBar.v0 v0Var = this.f32731l0;
        aj0 iconView = v0Var.getIconView();
        int i10 = org.telegram.ui.ActionBar.j6.f21071y8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(iconView, 8, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.f21090z8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var, 32, null, null, null, null, i11));
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f32750u0;
        if (v0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var2.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var2, 32, null, null, null, null, i11));
        }
        org.telegram.ui.ActionBar.v0 v0Var3 = this.f32748t0;
        if (v0Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var3.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var3, 32, null, null, null, null, i11));
        }
        Drawable[] drawableArr = {this.D0};
        ImageView imageView = this.C0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 8, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 32, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.f20690d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B0, 1, null, null, null, null, i12));
        ns0 ns0Var = this.I0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ns0Var, 1, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.wc;
        org.telegram.ui.Cells.w0 w0Var = this.K0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var, 0, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20825kd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ns0Var, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Gh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ns0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.Fh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ns0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.Eh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ns0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.Hh));
        js0 js0Var = this.R0;
        if (js0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(js0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f21018v7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(js0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f21036w7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(js0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f21000u7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(js0Var, 33554436, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20982t7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(js0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f21053x7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(js0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f21070y7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(js0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A7));
        }
        final int i14 = 0;
        while (true) {
            qt0[] qt0VarArr = this.f32729k0;
            if (i14 < qt0VarArr.length) {
                org.telegram.ui.ActionBar.k6 k6Var = new org.telegram.ui.ActionBar.k6() {
                    @Override
                    public final void b() {
                        qt0[] qt0VarArr2 = xu0.this.f32729k0;
                        int i15 = i14;
                        wr0 wr0Var = qt0VarArr2[i15].h;
                        if (wr0Var != null) {
                            int childCount = wr0Var.getChildCount();
                            for (int i16 = 0; i16 < childCount; i16++) {
                                View childAt = qt0VarArr2[i15].h.getChildAt(i16);
                                if (childAt instanceof org.telegram.ui.Cells.u7) {
                                    org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) childAt;
                                    for (int i17 = 0; i17 < 6; i17++) {
                                        u7Var.f23364a[i17].f22521e.invalidate();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                                    ((org.telegram.ui.Cells.h6) childAt).u(0);
                                } else if (childAt instanceof org.telegram.ui.Cells.za) {
                                    ((org.telegram.ui.Cells.za) childAt).j(0);
                                }
                            }
                        }
                    }

                    @Override
                    public final void a(float f7) {
                    }
                };
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20812k0, null, null, org.telegram.ui.ActionBar.j6.f20691d7));
                fs0 fs0Var = qt0VarArr[i14].v;
                int i15 = org.telegram.ui.ActionBar.j6.f20690d6;
                arrayList.add(new org.telegram.ui.ActionBar.l6(fs0Var, 0, null, null, null, null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20964s8));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f20780i6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].f29850w, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f20673c7));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 524288, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f7));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
                int i16 = org.telegram.ui.ActionBar.j6.f20762h6;
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f21010uh));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20854m6));
                int i17 = org.telegram.ui.ActionBar.j6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
                int i18 = org.telegram.ui.ActionBar.j6.f21069y6;
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusColor"}, null, null, -1, k6Var, i18));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusOnlineColor"}, null, null, -1, k6Var, org.telegram.ui.ActionBar.j6.f20873n6));
                Drawable[] drawableArr2 = org.telegram.ui.ActionBar.j6.f20937r0;
                int i19 = org.telegram.ui.ActionBar.j6.J7;
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.za.class}, null, drawableArr2, null, i19));
                TextPaint[] textPaintArr = org.telegram.ui.ActionBar.j6.B0;
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.j6.D0}, null, -1, null, org.telegram.ui.ActionBar.j6.X8));
                TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.j6.C0;
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.j6.E0}, null, -1, null, org.telegram.ui.ActionBar.j6.Z8));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, drawableArr2, null, i19));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.O7));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.P7));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.Q7));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.R7));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.S7));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.T7));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.U7));
                int i20 = org.telegram.ui.ActionBar.j6.f21088z6;
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 4, new Class[]{kt0.class}, new String[]{"emptyTextView"}, null, null, -1, null, i20));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
                int i21 = org.telegram.ui.ActionBar.j6.Ih;
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 2048, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"progressView"}, null, null, -1, null, i21));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"statusImageView"}, null, null, -1, null, i21));
                int i22 = org.telegram.ui.ActionBar.j6.f20781i7;
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                int i23 = org.telegram.ui.ActionBar.j6.f20819k7;
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.zi));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Bi));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, org.telegram.ui.ActionBar.j6.f20724f3, null, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, org.telegram.ui.ActionBar.j6.f20742g3, null, null, i20));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.n7.class}, null, null, null, org.telegram.ui.ActionBar.j6.J6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.n7.class}, org.telegram.ui.ActionBar.j6.m0, null, null, org.telegram.ui.ActionBar.j6.K6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Kh));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 32, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Jh));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.o7.class}, null, null, null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 524288, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"textView"}, null, null, -1, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"textView"}, null, null, -1, null, i17));
                int i24 = org.telegram.ui.ActionBar.j6.Lh;
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.u7.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.u7.class}, null, null, k6Var, i22));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.u7.class}, null, null, k6Var, i23));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.e2.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, k6Var, i22));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, k6Var, i23));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].h, 0, null, null, new Drawable[]{this.f32761y0}, null, org.telegram.ui.ActionBar.j6.f20654b7));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].f29850w.d, 4, null, null, null, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.l6(qt0VarArr[i14].f29850w.f32782e, 4, null, null, null, null, i18));
                i14++;
            } else {
                return arrayList;
            }
        }
    }

    public final int h0(int i10) {
        org.telegram.ui.ActionBar.f6 f6Var = this.F1;
        if (f6Var != null) {
            return f6Var.G0(i10);
        }
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    public final int h1(int i10) {
        wu0 j12 = j1(i10);
        if (j12 == null) {
            return -1;
        }
        return j12.f32370b;
    }

    public final boolean i0() {
        if (this.f32753v1.getConnectionsManager().getConnectionState() == 3) {
            return true;
        }
        return false;
    }

    public final wu0 i1(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.Y1;
        wu0 wu0Var = (wu0) hashMap.get(valueOf);
        if (wu0Var == null) {
            wu0 wu0Var2 = new wu0(this, getContext(), i10);
            hashMap.put(Integer.valueOf(i10), wu0Var2);
            this.Z1.put(Integer.valueOf(wu0Var2.f32369a), Integer.valueOf(i10));
            return wu0Var2;
        }
        return wu0Var;
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

    public final wu0 j1(int i10) {
        Integer num = (Integer) this.Z1.get(Integer.valueOf(i10));
        if (num == null) {
            return null;
        }
        return (wu0) this.Y1.get(num);
    }

    public final void k0() {
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
        this.L0.setInterpolator(pr.f29494g);
        this.L0.addListener(new qs0(this, 0));
        this.L0.start();
    }

    public final uu0 k1(int i10) {
        wu0 j12;
        if (i10 == 8) {
            return this.f32710c0;
        }
        if (i10 == 9) {
            return this.f32716e0;
        }
        if (w0(i10) && (j12 = j1(i10)) != null) {
            return j12.f32371c;
        }
        return null;
    }

    public boolean l0() {
        return false;
    }

    public final uu0 l1(int i10) {
        wu0 j12;
        if (i10 == 8) {
            return this.f32713d0;
        }
        if (i10 == 9) {
            return this.f32719f0;
        }
        if (!w0(i10) || (j12 = j1(i10)) == null) {
            return null;
        }
        return j12.d;
    }

    public boolean m0() {
        return !(this instanceof y30);
    }

    public final void m1(boolean z10) {
        qt0[] qt0VarArr;
        qt0[] qt0VarArr2;
        s4.u0 u0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        float f7;
        int i10;
        float f10;
        float f11;
        boolean z15;
        mu0[] mu0VarArr;
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
        s4.u0 u0Var2;
        String str3;
        int i17;
        int i18;
        boolean z21;
        int i19;
        int i20;
        boolean z22;
        int i21;
        nr0 nr0Var = this.V;
        if (nr0Var != null) {
            nr0Var.i();
        }
        int i22 = 0;
        while (true) {
            qt0VarArr = this.f32729k0;
            if (i22 >= qt0VarArr.length) {
                break;
            }
            qt0VarArr[i22].h.B0();
            i22++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qt0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = AndroidUtilities.dp(B0());
        s4.h0 adapter = qt0VarArr[z10 ? 1 : 0].h.getAdapter();
        s4.h0 h0Var = this.f32710c0;
        s4.y yVar = this.f32706b0;
        if (adapter == h0Var) {
            yVar.d(null);
        }
        boolean z23 = this.V0;
        jt0 jt0Var = this.D1;
        String str4 = "";
        eu0 eu0Var = this.N;
        org.telegram.ui.ActionBar.v0 v0Var = this.f32734n0;
        int i23 = 100;
        if (z23 && this.U0) {
            qt0 qt0Var = qt0VarArr[z10 ? 1 : 0];
            if (qt0Var.f29846f == null) {
                qt0Var.f29846f = new s4.u0();
            }
            qt0 qt0Var2 = qt0VarArr[z10 ? 1 : 0];
            u0Var2 = qt0Var2.f29846f;
            iu0 iu0Var = this.S;
            ot0 ot0Var = this.f32727j0;
            tt0 tt0Var = this.f32723h0;
            tt0 tt0Var2 = this.f32725i0;
            tt0 tt0Var3 = this.f32721g0;
            if (z10) {
                int i24 = qt0Var2.F;
                if (i24 != 0 && i24 != 2 && i24 != 5 && i24 != 6 && (i24 != 7 || jt0Var.T())) {
                    if (v0Var != null) {
                        str4 = v0Var.getSearchField().getText().toString();
                    }
                    int i25 = qt0VarArr[z10 ? 1 : 0].F;
                    if (i25 == 1) {
                        if (tt0Var3 != null) {
                            tt0Var3.G(str4, false);
                            if (adapter != tt0Var3) {
                                W0(adapter);
                                qt0VarArr[z10 ? 1 : 0].h.setAdapter(tt0Var3);
                            }
                        }
                    } else if (i25 == 3) {
                        if (tt0Var2 != null) {
                            tt0Var2.G(str4, false);
                            if (adapter != tt0Var2) {
                                W0(adapter);
                                qt0VarArr[z10 ? 1 : 0].h.setAdapter(tt0Var2);
                            }
                        }
                    } else if (i25 == 4) {
                        if (tt0Var != null) {
                            tt0Var.G(str4, false);
                            if (adapter != tt0Var) {
                                W0(adapter);
                                qt0VarArr[z10 ? 1 : 0].h.setAdapter(tt0Var);
                            }
                        }
                    } else if (i25 == 7) {
                        if (ot0Var != null) {
                            ot0Var.F(str4, false);
                            if (adapter != ot0Var) {
                                W0(adapter);
                                qt0VarArr[z10 ? 1 : 0].h.setAdapter(ot0Var);
                            }
                        }
                    } else if (i25 == 11) {
                        if (iu0Var != null) {
                            iu0Var.E(this.W0, str4);
                            if (adapter != iu0Var) {
                                W0(adapter);
                                qt0VarArr[z10 ? 1 : 0].h.setAdapter(iu0Var);
                            }
                        }
                    } else if (i25 == 15 && eu0Var != null && adapter != eu0Var) {
                        W0(adapter);
                        wr0 wr0Var = qt0VarArr[z10 ? 1 : 0].h;
                        eu0Var.f25817r = wr0Var;
                        wr0Var.setAdapter(eu0Var);
                    }
                } else {
                    this.V0 = false;
                    ks0 ks0Var = this.J0;
                    if (ks0Var != null) {
                        ks0Var.g(false);
                    }
                    this.U0 = false;
                    m1(true);
                    return;
                }
            } else if (qt0Var2.h != null) {
                int i26 = qt0Var2.F;
                if (i26 == 1) {
                    if (adapter != tt0Var3) {
                        W0(adapter);
                        qt0VarArr[z10 ? 1 : 0].h.setAdapter(tt0Var3);
                    }
                    tt0Var3.l();
                } else if (i26 == 3) {
                    if (adapter != tt0Var2) {
                        W0(adapter);
                        qt0VarArr[z10 ? 1 : 0].h.setAdapter(tt0Var2);
                    }
                    tt0Var2.l();
                } else if (i26 == 4) {
                    if (adapter != tt0Var) {
                        W0(adapter);
                        qt0VarArr[z10 ? 1 : 0].h.setAdapter(tt0Var);
                    }
                    tt0Var.l();
                } else if (i26 == 7) {
                    if (adapter != ot0Var) {
                        W0(adapter);
                        qt0VarArr[z10 ? 1 : 0].h.setAdapter(ot0Var);
                    }
                    ot0Var.l();
                } else if (i26 == 11) {
                    if (adapter != iu0Var) {
                        W0(adapter);
                        qt0VarArr[z10 ? 1 : 0].h.setAdapter(iu0Var);
                    }
                    iu0Var.l();
                }
            }
            qt0VarArr2 = qt0VarArr;
            z20 = false;
            z19 = false;
            i16 = 100;
        } else {
            qt0 qt0Var3 = qt0VarArr[z10 ? 1 : 0];
            if (qt0Var3.f29845e == null) {
                qt0Var3.f29845e = new s4.u0();
            }
            qt0 qt0Var4 = qt0VarArr[z10 ? 1 : 0];
            s4.u0 u0Var3 = qt0Var4.f29845e;
            qt0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i27 = qt0VarArr[z10 ? 1 : 0].F;
            if (i27 == 8 || w0(i27)) {
                layoutParams.topMargin = AndroidUtilities.dp(B0());
            }
            wr0 wr0Var2 = qt0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = wr0Var2.getPaddingLeft();
            qt0 qt0Var5 = qt0VarArr[z10 ? 1 : 0];
            wr0 wr0Var3 = qt0Var5.h;
            int Z = Z(qt0Var5.F);
            wr0Var3.f29515d3 = Z;
            int paddingRight = qt0VarArr[z10 ? 1 : 0].h.getPaddingRight();
            qt0VarArr2 = qt0VarArr;
            wr0 wr0Var4 = qt0VarArr2[z10 ? 1 : 0].h;
            int Y = Y(v0());
            wr0Var4.f29516e3 = Y;
            wr0Var2.setPadding(paddingLeft, Z, paddingRight, Y);
            int i28 = qt0VarArr2[z10 ? 1 : 0].F;
            int[] iArr = this.f32732m1;
            s4.h0 h0Var2 = this.K;
            View view = this.U;
            dt0 dt0Var = this.T;
            hu0 hu0Var = this.R;
            it0 it0Var = this.P;
            mu0[] mu0VarArr2 = this.f32749t1;
            if (i28 == 0) {
                s4.h0 h0Var3 = this.H;
                if (adapter != h0Var3) {
                    W0(adapter);
                    qt0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var3);
                }
                int i29 = -AndroidUtilities.dp(1.0f);
                layoutParams.rightMargin = i29;
                layoutParams.leftMargin = i29;
                mu0 mu0Var = mu0VarArr2[0];
                if (mu0Var.h && !mu0Var.f28546e.isEmpty()) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                i23 = iArr[0];
                qt0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.f32761y0);
                mu0 mu0Var2 = mu0VarArr2[0];
                if (mu0Var2.f28563x == null) {
                    mu0Var2.f28563x = new s4.u0();
                }
                z13 = z22;
                u0Var = mu0VarArr2[0].f28563x;
                z11 = false;
            } else {
                if (i28 == 1) {
                    mu0 mu0Var3 = mu0VarArr2[1];
                    if (mu0Var3.h && !mu0Var3.f28546e.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (adapter != h0Var2) {
                        W0(adapter);
                        qt0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var2);
                    }
                } else if (i28 == 2) {
                    mu0 mu0Var4 = mu0VarArr2[2];
                    if (mu0Var4.h && !mu0Var4.f28546e.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (adapter != this.L) {
                        W0(adapter);
                        qt0VarArr2[z10 ? 1 : 0].h.setAdapter(this.L);
                    }
                } else {
                    if (i28 == 3) {
                        if (adapter != this.J) {
                            W0(adapter);
                            qt0VarArr2[z10 ? 1 : 0].h.setAdapter(this.J);
                        }
                    } else if (i28 == 4) {
                        mu0 mu0Var5 = mu0VarArr2[4];
                        if (mu0Var5.h && !mu0Var5.f28546e.isEmpty()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (adapter != this.M) {
                            W0(adapter);
                            qt0VarArr2[z10 ? 1 : 0].h.setAdapter(this.M);
                        }
                    } else {
                        if (i28 == 5) {
                            if (adapter != this.O) {
                                W0(adapter);
                                qt0VarArr2[z10 ? 1 : 0].h.setAdapter(this.O);
                            }
                        } else if (i28 == 15) {
                            if (adapter != eu0Var) {
                                W0(adapter);
                                wr0 wr0Var5 = qt0VarArr2[z10 ? 1 : 0].h;
                                eu0Var.f25817r = wr0Var5;
                                wr0Var5.setAdapter(eu0Var);
                            }
                        } else if (i28 == 6) {
                            if (adapter != it0Var) {
                                W0(adapter);
                                qt0VarArr2[z10 ? 1 : 0].h.setAdapter(it0Var);
                            }
                        } else if (i28 == 7) {
                            if (adapter != this.f32703a0) {
                                W0(adapter);
                                qt0VarArr2[z10 ? 1 : 0].h.setAdapter(this.f32703a0);
                            }
                        } else if (p0(i28)) {
                            s4.h0 k12 = k1(qt0VarArr2[z10 ? 1 : 0].F);
                            if (adapter != k12) {
                                W0(adapter);
                                qt0VarArr2[z10 ? 1 : 0].h.setAdapter(k12);
                                qt0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            qt0 qt0Var6 = qt0VarArr2[z10 ? 1 : 0];
                            if (qt0Var6.F != 9) {
                                yVar.d(qt0Var6.h);
                            }
                            i23 = iArr[1];
                        } else {
                            int i30 = qt0VarArr2[z10 ? 1 : 0].F;
                            if (i30 == 10) {
                                if (adapter != this.Q) {
                                    W0(adapter);
                                    qt0VarArr2[z10 ? 1 : 0].h.setAdapter(this.Q);
                                }
                            } else if (i30 == 11) {
                                if (adapter != hu0Var) {
                                    W0(adapter);
                                    qt0VarArr2[z10 ? 1 : 0].h.setAdapter(hu0Var);
                                    s4.y yVar2 = hu0Var.v;
                                    wr0 wr0Var6 = qt0VarArr2[z10 ? 1 : 0].h;
                                    hu0Var.f26890s = wr0Var6;
                                    yVar2.d(wr0Var6);
                                }
                                u0Var = hu0Var.f26889r;
                                z11 = true;
                                z13 = false;
                            } else if (i30 == 12) {
                                if (adapter != null) {
                                    W0(adapter);
                                    qt0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (dt0Var.getParent() != qt0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(dt0Var);
                                    qt0VarArr2[z10 ? 1 : 0].addView(dt0Var, w7.x5.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                }
                            } else if (i30 == 13) {
                                if (adapter != null) {
                                    W0(adapter);
                                    qt0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != qt0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(view);
                                    qt0VarArr2[z10 ? 1 : 0].addView(view);
                                }
                            } else if (i30 == 14) {
                                if (adapter != null) {
                                    W0(adapter);
                                    qt0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (nr0Var != null && nr0Var.getParent() != qt0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(nr0Var);
                                    qt0VarArr2[z10 ? 1 : 0].addView(nr0Var);
                                    qt0VarArr2[z10 ? 1 : 0].f29850w.setVisibility(4);
                                }
                            }
                        }
                        u0Var = u0Var3;
                        z11 = false;
                        z13 = false;
                    }
                    u0Var = u0Var3;
                    z11 = true;
                    z13 = false;
                }
                z13 = z12;
                u0Var = u0Var3;
                z11 = true;
            }
            int i31 = qt0VarArr2[z10 ? 1 : 0].F;
            if (i31 != 0 && !p0(i31)) {
                z14 = false;
            } else {
                z14 = true;
            }
            fs0 fs0Var = qt0VarArr2[z10 ? 1 : 0].v;
            if (z14) {
                f7 = 0.0f;
            } else {
                f7 = 12.0f;
            }
            if (z14) {
                i10 = 8;
            } else {
                i10 = 12;
            }
            s4.u0 u0Var4 = u0Var;
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
            fs0Var.setLayoutParams(w7.x5.d(-1, -1.0f, 119, f7, f12, f10, f11));
            if (z11) {
                qt0VarArr2[z10 ? 1 : 0].h.setSections(false);
            } else {
                wr0 wr0Var7 = qt0VarArr2[z10 ? 1 : 0].h;
                wr0Var7.getClass();
                wr0Var7.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20780i6, wr0Var7.f28251p2));
                wr0Var7.I2 = null;
                wr0Var7.L2 = 0.0f;
                wr0Var7.M2 = null;
                wr0Var7.N2 = null;
                wr0Var7.J2 = null;
                xk0 xk0Var = wr0Var7.H2;
                if (xk0Var != null) {
                    wr0Var7.p0(xk0Var);
                    wr0Var7.H2 = null;
                }
            }
            qt0 qt0Var7 = qt0VarArr2[z10 ? 1 : 0];
            int i32 = qt0Var7.F;
            org.telegram.ui.ActionBar.n2 n2Var = this.f32753v1;
            if (i32 == 15) {
                z15 = z13;
                mu0VarArr = mu0VarArr2;
                str = "";
                qt0Var7.setBackground(di.d7.e(qt0Var7.getBackground(), n2Var.getCurrentAccount(), this.f32728j1, org.telegram.ui.ActionBar.j6.I.q()));
                qt0VarArr2[z10 ? 1 : 0].setOutlineProvider(new bi.z1(14));
                qt0VarArr2[z10 ? 1 : 0].setClipToOutline(true);
                r52 = 0;
            } else {
                z15 = z13;
                mu0VarArr = mu0VarArr2;
                str = "";
                qt0Var7.setClipToOutline(false);
                r52 = 0;
                qt0VarArr2[z10 ? 1 : 0].setBackground(null);
            }
            qt0 qt0Var8 = qt0VarArr2[z10 ? 1 : 0];
            if (qt0Var8.F == 11) {
                qt0Var8.h.setItemAnimator(qt0Var8.d);
            } else {
                qt0Var8.h.setItemAnimator(r52);
                if (hu0Var != null && qt0VarArr2[z10 ? 1 : 0].h == hu0Var.f26890s) {
                    s4.y yVar3 = hu0Var.v;
                    hu0Var.f26890s = r52;
                    yVar3.d(r52);
                }
            }
            if (dt0Var != null && qt0VarArr2[z10 ? 1 : 0].F != 12 && dt0Var.getParent() == qt0VarArr2[z10 ? 1 : 0]) {
                dt0Var.f36464a.onRemoveFromParent();
                qt0VarArr2[z10 ? 1 : 0].removeView(dt0Var);
            }
            if (view != null && qt0VarArr2[z10 ? 1 : 0].F != 13) {
                ViewParent parent = view.getParent();
                qt0 qt0Var9 = qt0VarArr2[z10 ? 1 : 0];
                if (parent == qt0Var9) {
                    qt0Var9.removeView(view);
                }
            }
            if (nr0Var != null && qt0VarArr2[z10 ? 1 : 0].F != 14) {
                ViewParent parent2 = nr0Var.getParent();
                qt0 qt0Var10 = qt0VarArr2[z10 ? 1 : 0];
                if (parent2 == qt0Var10) {
                    qt0Var10.removeView(nr0Var);
                }
            }
            int i33 = qt0VarArr2[z10 ? 1 : 0].F;
            if (i33 != 0 && i33 != 11 && !p0(i33) && (i17 = qt0VarArr2[z10 ? 1 : 0].F) != 2 && i17 != 5 && i17 != 6 && ((i17 != 7 || jt0Var.T()) && (i18 = qt0VarArr2[z10 ? 1 : 0].F) != 10 && i18 != 13 && i18 != 14)) {
                if (z10) {
                    if (v0Var != null && v0Var.getVisibility() == 4 && !this.G.f21130n0) {
                        if (D()) {
                            this.f32758x0 = 1;
                            v0Var.setVisibility(0);
                        } else {
                            if (v0()) {
                                i20 = 8;
                            } else {
                                i20 = 4;
                            }
                            v0Var.setVisibility(i20);
                        }
                        float f13 = z10 ? 1.0f : 0.0f;
                        this.f32736o0 = b0(f13);
                        s1(1.0f - f13);
                        z21 = false;
                    } else {
                        z21 = false;
                        this.f32758x0 = 0;
                        this.f32736o0 = 1.0f;
                    }
                } else {
                    z21 = false;
                    if (v0Var != null) {
                        if (v0Var.getVisibility() == 4) {
                            if (D()) {
                                this.f32758x0 = 0;
                                this.f32736o0 = 1.0f;
                                v0Var.setVisibility(0);
                            } else {
                                if (v0()) {
                                    i19 = 8;
                                } else {
                                    i19 = 4;
                                }
                                v0Var.setVisibility(i19);
                                this.f32736o0 = 0.0f;
                            }
                        }
                        q1(z21);
                    }
                }
                q1(z21);
            } else if (z10) {
                this.f32758x0 = 2;
            } else {
                this.f32758x0 = 0;
                if (v0Var != null) {
                    if (!v0() && !this.V0) {
                        i11 = 4;
                    } else {
                        i11 = 8;
                    }
                    v0Var.setVisibility(i11);
                }
            }
            int i34 = qt0VarArr2[z10 ? 1 : 0].F;
            if (i34 == 6) {
                if (!it0Var.f27282e && !it0Var.h && it0Var.d.isEmpty()) {
                    it0.E(it0Var, 0L);
                }
            } else if (i34 != 7) {
                if (p0(i34)) {
                    uu0 k13 = k1(qt0VarArr2[z10 ? 1 : 0].F);
                    if (k13 != null) {
                        bi.l8 l8Var = k13.f31011s;
                        k13.P();
                        hs0 hs0Var = qt0VarArr2[z10 ? 1 : 0].f29850w;
                        if (l8Var != null && (l8Var.k() || (i0() && l8Var.g() > 0))) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        hs0Var.e(z17, z10);
                        if (l8Var != null && l8Var.g() > 0 && !t0()) {
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
                    int i35 = qt0VarArr2[z10 ? 1 : 0].F;
                    if (i35 != 10 && i35 != 11 && i35 != 12 && i35 != 13 && i35 != 14) {
                        if (i35 == 15) {
                            i35 = 8;
                        }
                        mu0 mu0Var6 = mu0VarArr[i35];
                        if (!mu0Var6.f28548g && !mu0Var6.f28549i[0] && mu0Var6.f28543a.isEmpty()) {
                            mu0VarArr[i35].f28548g = true;
                            h0Var2.l();
                            if (i35 == 0) {
                                int i36 = mu0VarArr[0].f28557q;
                                if (i36 == 1) {
                                    i12 = 6;
                                } else if (i36 == 2) {
                                    i12 = 7;
                                }
                                n2Var.getMediaDataController().loadMedia(this.f32728j1, 50, 0, 0, i12, this.F, 1, n2Var.getClassGuid(), mu0VarArr[i12].f28556p, null, null);
                            }
                            i12 = i35;
                            n2Var.getMediaDataController().loadMedia(this.f32728j1, 50, 0, 0, i12, this.F, 1, n2Var.getClassGuid(), mu0VarArr[i12].f28556p, null, null);
                        }
                    }
                }
            }
            int i37 = qt0VarArr2[z10 ? 1 : 0].F;
            if (i37 != 8 && !w0(i37)) {
                qt0 qt0Var11 = qt0VarArr2[z10 ? 1 : 0];
                if (qt0Var11.F == 9) {
                    if (u0()) {
                        qt0VarArr2[z10 ? 1 : 0].f29850w.f32780b.setVisibility(8);
                        qt0VarArr2[z10 ? 1 : 0].f29850w.f32783f.setVisibility(8);
                    } else {
                        qt0VarArr2[z10 ? 1 : 0].f29850w.f32780b.setVisibility(0);
                        qt0VarArr2[z10 ? 1 : 0].f29850w.setStickerType(11);
                        qt0VarArr2[z10 ? 1 : 0].f29850w.f32783f.setVisibility(0);
                        qt0VarArr2[z10 ? 1 : 0].f29850w.f32783f.h(w());
                    }
                    qt0VarArr2[z10 ? 1 : 0].f29850w.d.setText(LocaleController.getString(R.string.NoArchivedStoriesTitle));
                    d90 d90Var = qt0VarArr2[z10 ? 1 : 0].f29850w.f32782e;
                    if (v0()) {
                        str3 = LocaleController.getString(R.string.NoArchivedStoriesSubtitle);
                    } else {
                        str3 = str;
                    }
                    d90Var.setText(str3);
                    qt0VarArr2[z10 ? 1 : 0].f29850w.f32783f.setOnClickListener(new sq0(this, 7));
                } else {
                    qt0Var11.f29850w.f32780b.setVisibility(0);
                    qt0VarArr2[z10 ? 1 : 0].f29850w.setStickerType(1);
                    qt0VarArr2[z10 ? 1 : 0].f29850w.d.setText(LocaleController.getString(R.string.NoResult));
                    qt0VarArr2[z10 ? 1 : 0].f29850w.f32782e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    qt0VarArr2[z10 ? 1 : 0].f29850w.f32783f.setVisibility(8);
                }
            } else {
                qt0 qt0Var12 = qt0VarArr2[z10 ? 1 : 0];
                hs0 hs0Var2 = qt0Var12.f29850w;
                boolean w02 = w0(qt0Var12.F);
                int h12 = h1(qt0VarArr2[z10 ? 1 : 0].F);
                x9 x9Var = hs0Var2.f32780b;
                di.d dVar = hs0Var2.f32783f;
                if (!w02 && !u0() && !r0()) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                x9Var.setVisibility(i13);
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
                    hs0Var2.f32782e.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeDescription));
                } else {
                    wh.p pVar = hs0Var2.d;
                    if (!t0()) {
                        if (v0()) {
                            i15 = R.string.NoPublicStoriesTitle2;
                        } else {
                            i15 = R.string.NoStoriesTitle;
                        }
                    } else {
                        i15 = R.string.NoHashtagStoriesTitle;
                    }
                    pVar.setText(LocaleController.getString(i15));
                    d90 d90Var2 = hs0Var2.f32782e;
                    if (v0()) {
                        str2 = LocaleController.getString(R.string.NoStoriesSubtitle2);
                    } else {
                        str2 = str;
                    }
                    d90Var2.setText(str2);
                }
                dVar.setOnClickListener(new uq0(this, w02, h12, 0));
            }
            z19 = false;
            qt0VarArr2[z10 ? 1 : 0].h.setVisibility(0);
            i16 = i23;
            z20 = z15;
            u0Var2 = u0Var4;
        }
        qt0 qt0Var13 = qt0VarArr2[z10 ? 1 : 0];
        qt0Var13.f29843b = z20;
        o1(qt0Var13, z19);
        qt0VarArr2[z10 ? 1 : 0].f29851x.y1(i16);
        qt0VarArr2[z10 ? 1 : 0].h.a0();
        if (u0Var2 != null) {
            qt0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(u0Var2);
            qt0VarArr2[z10 ? 1 : 0].f29848r.setRecycledViewPool(u0Var2);
        }
        if (this.f32758x0 == 2) {
            org.telegram.ui.ActionBar.k kVar = this.G;
            if (kVar.f21130n0) {
                this.f32763z0 = true;
                kVar.h(true);
                this.f32758x0 = 0;
                this.f32736o0 = 0.0f;
                if (v0Var != null) {
                    if (v0()) {
                        i21 = 8;
                    } else {
                        i21 = 4;
                    }
                    v0Var.setVisibility(i21);
                }
                q1(false);
            }
        }
    }

    public final void n0(ViewGroup viewGroup) {
        qt0[] qt0VarArr;
        for (qt0 qt0Var : this.f32729k0) {
            wr0 wr0Var = qt0Var.h;
            Objects.requireNonNull(wr0Var);
            qt0Var.f29847n = new bh.l(wr0Var, viewGroup, new dw(wr0Var, 4));
        }
        nr0 nr0Var = this.V;
        if (nr0Var != null) {
            nr0Var.S = viewGroup;
            nr0Var.R = new di.z7(nr0Var, 1);
        }
    }

    public final void n1() {
        ct0 ct0Var = this.H;
        if (ct0Var != null) {
            ct0Var.l();
        }
        ku0 ku0Var = this.K;
        if (ku0Var != null) {
            ku0Var.l();
        }
        ku0 ku0Var2 = this.L;
        if (ku0Var2 != null) {
            ku0Var2.l();
        }
        lu0 lu0Var = this.J;
        if (lu0Var != null) {
            lu0Var.X(false);
        }
        ku0 ku0Var3 = this.M;
        if (ku0Var3 != null) {
            ku0Var3.l();
        }
        eu0 eu0Var = this.N;
        if (eu0Var != null) {
            eu0Var.l();
        }
        lt0 lt0Var = this.O;
        if (lt0Var != null) {
            lt0Var.l();
        }
        ft0 ft0Var = this.f32710c0;
        if (ft0Var != null) {
            ft0Var.l();
        }
        for (wu0 wu0Var : this.Y1.values()) {
            wu0Var.f32371c.l();
        }
    }

    public final void o1(qt0 qt0Var, boolean z10) {
        boolean z11;
        Integer num = 1;
        int i10 = 0;
        if (qt0Var.f29843b && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        sk0 fastScroll = qt0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = qt0Var.f29844c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            qt0Var.f29844c.cancel();
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
            qt0Var.f29844c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(num);
        } else if (!z11 && fastScroll.getTag() != null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, property, fastScroll.getAlpha(), 0.0f);
            ofFloat2.addListener(new org.telegram.ui.to(fastScroll));
            qt0Var.f29844c = ofFloat2;
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
            qt0[] qt0VarArr = this.f32729k0;
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
        jt0 jt0Var = this.D1;
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
                wr0Var.setPadding(0, wr0Var.Y2, 0, wr0Var.Z2);
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
            org.telegram.ui.ActionBar.n2 n2Var = this.f32753v1;
            if (n2Var.getParentLayout() != null && !((ActionBarLayout) n2Var.getParentLayout()).j() && !J() && !this.f32702a) {
                if (motionEvent != null) {
                    if (this.B1 == null) {
                        this.B1 = VelocityTracker.obtain();
                    }
                    this.B1.addMovement(motionEvent);
                    i40 i40Var = this.E1;
                    if (i40Var != null) {
                        i40Var.b(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.f32759x1 && !this.f32762y1 && motionEvent.getY() >= AndroidUtilities.dp(90.0f)) {
                    this.f32756w1 = motionEvent.getPointerId(0);
                    this.f32762y1 = true;
                    this.f32764z1 = (int) motionEvent.getX();
                    this.A1 = (int) motionEvent.getY();
                    this.B1.clear();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f32756w1) {
                    int x10 = (int) (motionEvent.getX() - this.f32764z1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.A1);
                    boolean z13 = this.f32759x1;
                    qt0[] qt0VarArr = this.f32729k0;
                    if (z13 && (((z10 = this.f32724h1) && x10 > 0) || (!z10 && x10 < 0))) {
                        if (x10 < 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!U0(motionEvent, z11)) {
                            this.f32762y1 = true;
                            this.f32759x1 = false;
                            N0(false);
                            qt0VarArr[0].setTranslationX(0.0f);
                            qt0 qt0Var = qt0VarArr[1];
                            if (this.f32724h1) {
                                i11 = qt0VarArr[0].getMeasuredWidth();
                            } else {
                                i11 = -qt0VarArr[0].getMeasuredWidth();
                            }
                            qt0Var.setTranslationX(i11);
                            Z0(0.0f, qt0VarArr[1].F);
                            M0(getTabProgress());
                        }
                    }
                    if (this.f32762y1 && !this.f32759x1) {
                        if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                            if (x10 < 0) {
                                z12 = true;
                            }
                            U0(motionEvent, z12);
                        }
                    } else if (this.f32759x1) {
                        qt0VarArr[0].setTranslationX(x10);
                        if (this.f32724h1) {
                            qt0VarArr[1].setTranslationX(qt0VarArr[0].getMeasuredWidth() + x10);
                        } else {
                            qt0VarArr[1].setTranslationX(x10 - qt0VarArr[0].getMeasuredWidth());
                        }
                        float abs2 = Math.abs(x10) / qt0VarArr[0].getMeasuredWidth();
                        if (!D()) {
                            this.f32736o0 = 0.0f;
                        } else {
                            this.f32736o0 = b0(abs2);
                            s1(abs2);
                            float a02 = a0(abs2);
                            this.f32738p0 = a02;
                            if (a02 != 0.0f && D() && !q0()) {
                                i10 = 0;
                            } else {
                                i10 = 4;
                            }
                            this.f32743r0.setVisibility(i10);
                        }
                        q1(false);
                        Z0(abs2, qt0VarArr[1].F);
                        M0(getTabProgress());
                        L0();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f32756w1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    g1(motionEvent);
                }
                return this.f32759x1;
            }
        }
        return false;
    }

    public final void p1() {
        boolean z10;
        float f7;
        org.telegram.ui.ActionBar.v0 v0Var = this.f32748t0;
        if (v0Var != null) {
            if (!this.f32753v1.getMessagesController().isPeerNoForwards(this.f32728j1) && !j0()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                f7 = 0.5f;
            } else {
                f7 = 1.0f;
            }
            v0Var.setAlpha(f7);
            if (z10 && v0Var.getBackground() != null) {
                v0Var.setBackground(null);
            } else if (!z10 && v0Var.getBackground() == null) {
                v0Var.setBackground(org.telegram.ui.ActionBar.j6.f0(h0(org.telegram.ui.ActionBar.j6.f21090z8), 5, -1));
            }
        }
    }

    public boolean q0() {
        return false;
    }

    public final void q1(boolean z10) {
        nr0 nr0Var;
        sr0 sr0Var;
        aj0 aj0Var = this.f32746s0;
        if (aj0Var == null) {
            return;
        }
        float f7 = 0.0f;
        if (!this.V0 && (((nr0Var = this.V) == null || !nr0Var.g()) && ((sr0Var = this.W) == null || !sr0Var.f35656w))) {
            f7 = Utilities.clamp(this.f32736o0 + this.f32738p0, 1.0f, 0.0f);
        }
        aj0Var.setAlpha(f7);
        boolean z11 = false;
        if (z10) {
            if (a0(1.0f) > 0.5f) {
                z11 = true;
            }
            A(z11, true);
        } else if (this.f32758x0 == 2) {
            if (this.f32738p0 > 0.1f) {
                z11 = true;
            }
            A(z11, true);
        } else {
            if (this.f32736o0 < 0.1f) {
                z11 = true;
            }
            A(z11, true);
        }
    }

    public final boolean r0() {
        TLRPC.User user;
        long j3 = this.f32728j1;
        if (j3 <= 0 || (user = MessagesController.getInstance(this.f32753v1.getCurrentAccount()).getUser(Long.valueOf(j3))) == null || !user.bot) {
            return false;
        }
        return true;
    }

    public final void r1(boolean z10) {
        int i10 = 0;
        while (true) {
            qt0[] qt0VarArr = this.f32729k0;
            if (i10 < qt0VarArr.length) {
                int childCount = qt0VarArr[i10].h.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = qt0VarArr[i10].h.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) childAt).b(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.t7) {
                        ((org.telegram.ui.Cells.t7) childAt).i(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.n7) {
                        ((org.telegram.ui.Cells.n7) childAt).f(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.i7) {
                        ((org.telegram.ui.Cells.i7) childAt).e(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.e2) {
                        ((org.telegram.ui.Cells.e2) childAt).c(false, z10);
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

    public final boolean s0(int i10) {
        if (i10 == 7) {
            return this.D1.T();
        }
        if (!t0() && i10 != 0 && !p0(i10) && i10 != 2 && i10 != 5 && i10 != 6 && i10 != 11 && i10 != 10 && i10 != 13 && i10 != 14) {
            return true;
        }
        return false;
    }

    public final void s1(float f7) {
        org.telegram.ui.ActionBar.v0 v0Var = this.m0;
        if (v0Var == null) {
            return;
        }
        qt0[] qt0VarArr = this.f32729k0;
        qt0 qt0Var = qt0VarArr[1];
        float f10 = 0.0f;
        if (qt0Var != null && qt0Var.F == 11) {
            f10 = 0.0f + f7;
        }
        int i10 = 0;
        qt0 qt0Var2 = qt0VarArr[0];
        if (qt0Var2 != null && qt0Var2.F == 11) {
            f10 += 1.0f - f7;
        }
        v0Var.setAlpha(f10);
        float f11 = (0.15f * f10) + 0.85f;
        v0Var.setScaleX(f11);
        v0Var.setScaleY(f11);
        if (f10 <= 0.01f) {
            i10 = 8;
        }
        v0Var.setVisibility(i10);
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        boolean z10;
        int i10;
        TLRPC.ChatFull chatFull2 = this.f32714d1;
        if (chatFull2 != null && chatFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32714d1 = chatFull;
        if (chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.f32711c1 == 0) {
                this.f32711c1 = -j3;
                int i11 = 0;
                while (true) {
                    mu0[] mu0VarArr = this.f32749t1;
                    if (i11 >= mu0VarArr.length) {
                        break;
                    }
                    if (mu0VarArr[i11].f28544b[1].size() == 0) {
                        mu0 mu0Var = mu0VarArr[i11];
                        mu0Var.f28550j[1] = this.f32714d1.migrated_from_max_id;
                        mu0Var.f28549i[1] = false;
                    }
                    i11++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.f32714d1;
        if (chatFull3 != null && z10 != chatFull3.stories_pinned_available) {
            ns0 ns0Var = this.I0;
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
        if (this.F == 0) {
            this.X0[6] = i10;
        }
        v1(true);
        F();
    }

    public void setForwardRestrictedHint(i40 i40Var) {
        this.E1 = i40Var;
    }

    public void setMergeDialogId(long j3) {
        this.f32711c1 = j3;
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
        v1(true);
        F();
        if (iArr2[0] >= 0) {
            z0(false);
        }
    }

    @Override
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.K1 = i11;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            qt0[] qt0VarArr = this.f32729k0;
            if (i15 >= qt0VarArr.length) {
                break;
            }
            qt0VarArr[i15].setTranslationY(this.K1);
            i15++;
        }
        if (this.P0 != null) {
            K();
        } else {
            js0 js0Var = this.R0;
            if (js0Var != null) {
                js0Var.setTranslationY(AndroidUtilities.dp(48.0f) + i11);
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
            qt0[] qt0VarArr = this.f32729k0;
            if (qt0VarArr != null) {
                for (qt0 qt0Var : qt0VarArr) {
                    if (qt0Var != null) {
                        wr0 wr0Var = qt0Var.h;
                        int paddingLeft = wr0Var.getPaddingLeft();
                        wr0 wr0Var2 = qt0Var.h;
                        int i11 = wr0Var2.Y2;
                        int paddingRight = wr0Var2.getPaddingRight();
                        wr0 wr0Var3 = qt0Var.h;
                        int Y = Y(v0());
                        wr0Var3.f29516e3 = Y;
                        wr0Var.setPadding(paddingLeft, i11, paddingRight, Y);
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
                qt0[] qt0VarArr = this.f32729k0;
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
        boolean z10;
        TLRPC.UserFull userFull2 = this.f32717e1;
        if (userFull2 != null && userFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32717e1 = userFull;
        v1(true);
        if (userFull != null && z10 != userFull.stories_pinned_available) {
            Y0(8);
        }
    }

    public void setVisibleHeight(int i10) {
        float f7;
        this.M1 = i10;
        int i11 = 0;
        while (true) {
            qt0[] qt0VarArr = this.f32729k0;
            if (i11 >= qt0VarArr.length) {
                break;
            }
            int measuredHeight = getMeasuredHeight();
            if (qt0VarArr[i11].F == 8) {
                f7 = 280.0f;
            } else {
                f7 = 120.0f;
            }
            float f10 = (-(measuredHeight - Math.max(i10, AndroidUtilities.dp(f7)))) / 2.0f;
            qt0VarArr[i11].f29850w.setTranslationY(f10);
            qt0VarArr[i11].v.setTranslationY(-f10);
            i11++;
        }
        lr0 lr0Var = this.U;
        if (lr0Var != null) {
            lr0Var.setVisibleHeight(i10);
        }
        nr0 nr0Var = this.V;
        if (nr0Var != null) {
            nr0Var.setVisibleHeight(i10);
        }
    }

    public boolean t0() {
        if (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) {
            return false;
        }
        return true;
    }

    public final void t1() {
        float f7;
        float f10;
        org.telegram.ui.ActionBar.v0 v0Var = this.m0;
        if (v0Var == null) {
            return;
        }
        boolean z10 = true;
        qt0 qt0Var = this.f32729k0[1];
        z10 = (qt0Var == null || qt0Var.F != 11) ? false : false;
        if (z10) {
            v0Var.setVisibility(0);
        }
        ViewPropertyAnimator animate = v0Var.animate();
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
        scaleX.scaleY(f11).withEndAction(new ah.u(29, this, z10)).setDuration(420L).setInterpolator(pr.h).start();
    }

    public boolean u0() {
        return false;
    }

    public final void u1() {
        boolean z10;
        int i10;
        bi.l8 l8Var;
        boolean r02 = r0();
        org.telegram.ui.ActionBar.v0 v0Var = this.f32755w0;
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f32752v0;
        int i11 = 8;
        if (r02) {
            if (v0Var2 != null) {
                v0Var2.setVisibility(8);
            }
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
        } else if (getClosestTab() == 9) {
            if (v0Var2 != null) {
                v0Var2.setVisibility(8);
            }
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
        } else if (getClosestTab() == 8) {
            int i12 = 0;
            while (true) {
                SparseArray[] sparseArrayArr = this.Z0;
                if (i12 < sparseArrayArr[0].size()) {
                    MessageObject messageObject = (MessageObject) sparseArrayArr[0].valueAt(i12);
                    ft0 ft0Var = this.f32710c0;
                    if (ft0Var != null && (l8Var = ft0Var.f31011s) != null && !l8Var.m(messageObject.getId())) {
                        z10 = true;
                        break;
                    }
                    i12++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (v0Var2 != null) {
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                v0Var2.setVisibility(i10);
            }
            if (v0Var != null) {
                if (!z10) {
                    i11 = 0;
                }
                v0Var.setVisibility(i11);
            }
        } else if (w0(getClosestTab())) {
            if (v0Var2 != null) {
                v0Var2.setVisibility(8);
            }
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
        }
    }

    public boolean v0() {
        return false;
    }

    public void v1(boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xu0.v1(boolean):void");
    }

    public final SpannableStringBuilder w() {
        if (this.W1 == null) {
            this.W1 = new SpannableStringBuilder();
            if (r0()) {
                this.W1.append((CharSequence) LocaleController.getString(R.string.ProfileBotPreviewEmptyButton));
            } else {
                this.W1.append((CharSequence) "c");
                this.W1.setSpan(new nq(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.W1.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
            }
        }
        return this.W1;
    }

    public final Boolean w1(View view, View view2) {
        if (!this.f32737o1) {
            qt0[] qt0VarArr = this.f32729k0;
            boolean z10 = false;
            qt0 qt0Var = qt0VarArr[0];
            if (qt0Var != null) {
                int i10 = qt0Var.F;
                this.f32739p1 = i10;
                boolean p02 = p0(i10);
                int[] iArr = this.f32732m1;
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
                    } else if (c0(qt0VarArr[0].F) >= 5 || w0(qt0VarArr[0].F)) {
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

    public final void x(n70 n70Var, org.telegram.ui.ActionBar.n2 n2Var, long j3, int i10) {
        String publicUsername;
        if (j3 > 0) {
            publicUsername = UserObject.getPublicUsername(MessagesController.getInstance(n2Var.getCurrentAccount()).getUser(Long.valueOf(j3)));
        } else {
            publicUsername = ChatObject.getPublicUsername(MessagesController.getInstance(n2Var.getCurrentAccount()).getChat(Long.valueOf(-j3)));
        }
        if (publicUsername == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        a4.a.z(sb2, MessagesController.getInstance(n2Var.getCurrentAccount()).linkPrefix, "/", publicUsername, "/a/");
        sb2.append(i10);
        n70Var.c(R.drawable.media_share, LocaleController.getString(R.string.StoriesAlbumMenuShareLink), new er0(this, sb2.toString(), n2Var, 0), false);
    }

    public final boolean x0() {
        if (!C() || ((getClosestTab() != 8 && getClosestTab() != 13 && !w0(getClosestTab())) || !this.C1)) {
            nr0 nr0Var = this.V;
            if (nr0Var == null || !nr0Var.g()) {
                sr0 sr0Var = this.W;
                if ((sr0Var == null || !sr0Var.f35656w) && !this.f32737o1 && !this.f32722g1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final Boolean x1(View view, View view2) {
        if (!this.f32737o1) {
            qt0[] qt0VarArr = this.f32729k0;
            boolean z10 = false;
            qt0 qt0Var = qt0VarArr[0];
            if (qt0Var != null) {
                if (!this.f32730k1 || !p0(qt0Var.F)) {
                    int i10 = qt0VarArr[0].F;
                    this.f32739p1 = i10;
                    boolean p02 = p0(i10);
                    int[] iArr = this.f32732m1;
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
                        } else if (c0(qt0VarArr[0].F) >= 5 || w0(qt0VarArr[0].F)) {
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

    public final void y(org.telegram.ui.Components.n70 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xu0.y(org.telegram.ui.Components.n70):void");
    }

    public final void y0(int i10, int i11, int i12, boolean z10) {
        mu0[] mu0VarArr = this.f32749t1;
        mu0VarArr[i10].f28543a.clear();
        mu0VarArr[i10].f28544b[0].clear();
        mu0VarArr[i10].f28544b[1].clear();
        mu0 mu0Var = mu0VarArr[i10];
        mu0Var.f28550j[0] = i11;
        mu0Var.f28549i[0] = false;
        mu0Var.f28552l = false;
        mu0Var.f28553m = i12;
        mu0Var.f28554n = (mu0Var.e() - i12) - 1;
        mu0 mu0Var2 = mu0VarArr[i10];
        if (mu0Var2.f28554n < 0) {
            mu0Var2.f28554n = 0;
        }
        mu0Var2.f28551k = i11;
        mu0Var2.f28555o = true;
        mu0Var2.f28548g = false;
        mu0Var2.f28556p++;
        qt0 W = W(i10);
        if (W != null && W.h.getAdapter() != null) {
            W.h.getAdapter().l();
        }
        if (z10) {
            int i13 = 0;
            while (true) {
                qt0[] qt0VarArr = this.f32729k0;
                if (i13 < qt0VarArr.length) {
                    qt0 qt0Var = qt0VarArr[i13];
                    if (qt0Var.F == i10) {
                        qt0Var.f29851x.h1(Math.min(mu0VarArr[i10].e() - 1, mu0VarArr[i10].f28553m), 0);
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
        t00 t00Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = pt0Var.getChildAt(i11);
            if (childAt instanceof t00) {
                t00Var = childAt;
            }
        }
        if (t00Var != null) {
            pt0Var.removeView(t00Var);
        }
        getViewTreeObserver().addOnPreDrawListener(new ss0(this, pt0Var, sparseBooleanArray, t00Var, i10));
    }

    public final void z0(boolean z10) {
        long j3 = this.F;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i10 == 0 && !t0()) {
            for (int i11 = 0; i11 < 4; i11++) {
                final int i12 = f32700d2[i11];
                mu0[] mu0VarArr = this.f32749t1;
                if (!mu0VarArr[i12].h || z10) {
                    long j10 = this.f32728j1;
                    if (!DialogObject.isEncryptedDialog(j10)) {
                        mu0VarArr[i12].h = false;
                        TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
                        if (i12 == 0) {
                            int i13 = mu0VarArr[i12].f28557q;
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
                        org.telegram.ui.ActionBar.n2 n2Var = this.f32753v1;
                        tL_messages_getSearchResultsPositions.peer = n2Var.getMessagesController().getInputPeer(j10);
                        if (i10 != 0 && n2Var.getUserConfig().getClientUserId() == j10) {
                            tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                            tL_messages_getSearchResultsPositions.saved_peer_id = n2Var.getMessagesController().getInputPeer(j3);
                        }
                        final int i14 = mu0VarArr[i12].f28556p;
                        ConnectionsManager.getInstance(n2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(n2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new xq0(xu0.this, tL_error, i14, i12, tLObject, 0));
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
