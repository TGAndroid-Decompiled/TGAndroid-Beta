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
public abstract class eu0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Cells.n2 {
    public static final int[] Z1 = {0, 1, 2, 4};
    public static final rq0 a2 = new rq0(0);
    public final int A;
    public final ArrayList A0;
    public s30 A1;
    public final long B;
    public final ArrayList B0;
    public final org.telegram.ui.ActionBar.b6 B1;
    public final org.telegram.ui.ActionBar.k C;
    public final ArrayList C0;
    public final NotificationCenter.ObserversGroup C1;
    public final js0 D;
    public final ArrayList D0;
    public boolean D1;
    public final yt0 E;
    public final ur0 E0;
    public final AnimationNotificationsLocker E1;
    public final st0 F;
    public final rr0 F0;
    public org.telegram.ui.rl F1;
    public final rt0 G;
    public final org.telegram.ui.Cells.w0 G0;
    public int G1;
    public final rt0 H;
    public AnimatorSet H0;
    public boolean H1;
    public final rt0 I;
    public final aq0 I0;
    public int I1;
    public final lt0 J;
    public final ArrayList J0;
    public AnimatorSet J1;
    public final ss0 K;
    public float K0;
    public final SparseArray K1;
    public final ps0 L;
    public final bs L0;
    public long L1;
    public final ns0 M;
    public final FrameLayout M0;
    public boolean M1;
    public final ot0 N;
    public final qr0 N0;
    public int N1;
    public final pt0 O;
    public final int O0;
    public final bs0 O1;
    public final ks0 P;
    public final Paint P0;
    public ih.n6 P1;
    public final uq0 Q;
    public boolean Q0;
    public float Q1;
    public final vq0 R;
    public boolean R0;
    public boolean R1;
    public final zq0 S;
    public hg.r0 S0;
    public SpannableStringBuilder S1;
    public final os0 T;
    public final int[] T0;
    public int T1;
    public final f2.h0 U;
    public int U0;
    public final HashMap U1;
    public final ms0 V;
    public final SparseArray[] V0;
    public final HashMap V1;
    public final bu0 W;
    public int W0;
    public int W1;
    public boolean X0;
    public int X1;
    public long Y0;
    public final ah Y1;
    public TLRPC.ChatFull Z0;
    public boolean f28120a;
    public final tq0 f28121a0;
    public TLRPC.UserFull f28122a1;
    public boolean f28123b;
    public final bu0 f28124b0;
    public AnimatorSet f28125b1;
    public boolean f28126c;
    public final at0 f28127c0;
    public boolean f28128c1;
    public boolean d;
    public final at0 f28129d0;
    public boolean f28130d1;
    public int f28131e;
    public final at0 f28132e0;
    public boolean f28133e1;
    public int f28134f;
    public final vs0 f28135f0;
    public final long f28136f1;
    public final xs0[] f28137g0;
    public boolean f28138g1;
    public float h;
    public final org.telegram.ui.ActionBar.w0 f28139h0;
    public boolean f28140h1;
    public final org.telegram.ui.ActionBar.w0 f28141i0;
    public final int[] f28142i1;
    public final org.telegram.ui.ActionBar.w0 f28143j0;
    public float f28144j1;
    public float f28145k0;
    public boolean f28146k1;
    public float f28147l0;
    public int l1;
    public final TextView m0;
    public int f28148m1;
    public float f28149n;
    public final ImageView f28150n0;
    public final er0 f28151n1;
    public final pi0 f28152o0;
    public float f28153o1;
    public final org.telegram.ui.ActionBar.w0 f28154p0;
    public final tt0[] f28155p1;
    public final org.telegram.ui.ActionBar.w0 f28156q0;
    public final wt0 f28157q1;
    public boolean f28158r;
    public final org.telegram.ui.ActionBar.w0 f28159r0;
    public final org.telegram.ui.ActionBar.o2 f28160r1;
    public int f28161s;
    public final org.telegram.ui.ActionBar.w0 f28162s0;
    public int f28163s1;
    public int f28164t0;
    public boolean f28165t1;
    public final Drawable f28166u0;
    public boolean f28167u1;
    public int v;
    public boolean f28168v0;
    public int f28169v1;
    public int f28170w;
    public final NumberTextView f28171w0;
    public int f28172w1;
    public final Rect f28173x;
    public final z9 f28174x0;
    public VelocityTracker f28175x1;
    public final e00 f28176y;
    public final ImageView f28177y0;
    public boolean f28178y1;
    public final org.telegram.ui.ActionBar.h2 f28179z0;
    public final qs0 f28180z1;

    public eu0(android.content.Context r40, long r41, org.telegram.ui.Components.wt0 r43, int r44, java.util.ArrayList r45, org.telegram.tgnet.TLRPC.ChatFull r46, org.telegram.tgnet.TLRPC.UserFull r47, int r48, int r49, org.telegram.ui.ActionBar.o2 r50, org.telegram.ui.Components.qs0 r51, int r52, org.telegram.ui.ActionBar.b6 r53, ig.a r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.eu0.<init>(android.content.Context, long, org.telegram.ui.Components.wt0, int, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.tgnet.TLRPC$UserFull, int, int, org.telegram.ui.ActionBar.o2, org.telegram.ui.Components.qs0, int, org.telegram.ui.ActionBar.b6, ig.a):void");
    }

    public static rs0 M(int i9, long j10, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        rs0 rs0Var = new rs0(context, b6Var);
        TextView textView = rs0Var.f32282a;
        if (i9 == 0) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoMediaSecret));
                return rs0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoMedia));
            return rs0Var;
        } else if (i9 == 1) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedFilesSecret));
                return rs0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedFiles));
            return rs0Var;
        } else if (i9 == 2) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedVoiceSecret));
                return rs0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedVoice));
            return rs0Var;
        } else if (i9 == 3) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedLinksSecret));
                return rs0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedLinks));
            return rs0Var;
        } else if (i9 == 4) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedAudioSecret));
                return rs0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedAudio));
            return rs0Var;
        } else if (i9 == 5) {
            if (DialogObject.isEncryptedDialog(j10)) {
                textView.setText(LocaleController.getString(R.string.NoSharedGifSecret));
                return rs0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoGIFs));
            return rs0Var;
        } else {
            ImageView imageView = rs0Var.f32283b;
            if (i9 == 6) {
                imageView.setImageDrawable(null);
                textView.setText(LocaleController.getString(R.string.NoGroupsInCommon));
                return rs0Var;
            }
            if (i9 == 7) {
                imageView.setImageDrawable(null);
                textView.setText("");
            }
            return rs0Var;
        }
    }

    public static TLRPC.ProfileTab d0(int i9, boolean z10) {
        if (i9 != 8 && i9 != 14 && !z10) {
            return null;
        }
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            if (i9 != 5) {
                                if (i9 != 8) {
                                    if (i9 != 14) {
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

    public static void g(eu0 eu0Var, int i9, TL_stories.StoryItem storyItem, String str) {
        org.telegram.ui.rl rlVar = new org.telegram.ui.rl(eu0Var, i9, storyItem, 11);
        ih.v6 storiesController = eu0Var.getStoriesController();
        long j10 = eu0Var.f28136f1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.c0(i9, j10, arrayList);
        oc.a0(eu0Var.f28160r1).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", 1, str)), LocaleController.getString(R.string.UndoNoCaps), rlVar).j();
    }

    public ih.v6 getStoriesController() {
        return MessagesController.getInstance(this.f28160r1.getCurrentAccount()).getStoriesController();
    }

    public static void h(eu0 eu0Var, TL_stories.StoryItem storyItem) {
        eu0Var.getStoriesController().o0(eu0Var.f28136f1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        oc.a0(eu0Var.f28160r1).G(R.raw.chats_archived, 5000, LocaleController.formatPluralString("StoryArchived", 1, new Object[0])).j();
    }

    public static void i(eu0 eu0Var, long j10, int i9, String str) {
        ih.j6 B = eu0Var.getStoriesController().B(j10, true);
        int i10 = B.f11631a;
        int c10 = B.c(i9);
        if (c10 == -1) {
            return;
        }
        ((ih.o6) B.h.get(c10)).f11902b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = MessagesController.getInstance(i10).getInputPeer(B.f11632b);
        tL_updateAlbum.album_id = i9;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i10).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public static void j(eu0 eu0Var, TL_stories.StoryItem storyItem, ih.o6 o6Var) {
        eu0Var.getStoriesController().c(o6Var.f11901a, eu0Var.f28136f1, storyItem);
        AndroidUtilities.runOnUIThread(new jg0(13, eu0Var, o6Var), 100L);
    }

    public static void m(eu0 eu0Var, HashSet hashSet, TL_stories.StoryItem storyItem, x60 x60Var, ih.o6 o6Var) {
        String formatString;
        long j10 = eu0Var.f28136f1;
        if (hashSet.contains(Integer.valueOf(o6Var.f11901a))) {
            eu0Var.getStoriesController().c(o6Var.f11901a, j10, storyItem);
            formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, o6Var.f11902b);
        } else {
            ih.v6 storiesController = eu0Var.getStoriesController();
            int i9 = o6Var.f11901a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.c0(i9, j10, arrayList);
            formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, o6Var.f11902b);
        }
        oc.a0(eu0Var.f28160r1).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
        x60Var.u();
    }

    public static void n(eu0 eu0Var, long j10, int i9) {
        ih.j6 B = eu0Var.getStoriesController().B(j10, true);
        int i10 = B.f11631a;
        int c10 = B.c(i9);
        if (c10 == -1) {
            return;
        }
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = MessagesController.getInstance(i10).getInputPeer(B.f11632b);
        tL_deleteAlbum.album_id = ((ih.o6) B.h.remove(c10)).f11901a;
        ConnectionsManager.getInstance(i10).sendRequest(tL_deleteAlbum, null);
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

    public static boolean p0(int i9) {
        if (i9 != 8 && i9 != 9 && !w0(i9)) {
            return false;
        }
        return true;
    }

    public static void q(xs0 xs0Var, tt0[] tt0VarArr, boolean z10) {
        jg0 jg0Var;
        if (z10) {
            if (SharedConfig.fastScrollHintCount > 0 && xs0Var.C == null && !xs0Var.E && xs0Var.h.getFastScroll() != null && xs0Var.h.getFastScroll().T && xs0Var.h.getFastScroll().getVisibility() == 0 && tt0VarArr[0].e() >= 50) {
                SharedConfig.setFastScrollHintCount(SharedConfig.fastScrollHintCount - 1);
                xs0Var.E = true;
                Context context = xs0Var.getContext();
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                textView.setText(LocaleController.getString(R.string.SharedMediaFastScrollHint));
                textView.setTextSize(1, 14.0f);
                textView.setMaxLines(3);
                int i9 = org.telegram.ui.ActionBar.f6.f23219pf;
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
                frameLayout.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23238qf, false)));
                frameLayout.addView(textView, g7.e6.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
                ?? view = new View(context);
                view.f34734a = new Random();
                Paint paint = new Paint(1);
                view.f34735b = paint;
                Paint paint2 = new Paint(1);
                view.f34736c = paint2;
                view.f34738f = 1.0f;
                view.h = 0.0f;
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, i9, false), 76));
                paint2.setColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
                Paint paint3 = new Paint();
                view.d = paint3;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint3.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint3.setXfermode(new PorterDuffXfermode(mode));
                Paint paint4 = new Paint();
                view.f34737e = paint4;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                paint4.setXfermode(new PorterDuffXfermode(mode));
                frameLayout.addView(view, g7.e6.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                xs0Var.C = frameLayout;
                xs0Var.addView((View) frameLayout, g7.e6.c(-2.0f, -2));
                xs0Var.C.setAlpha(0.0f);
                xs0Var.C.setScaleX(0.8f);
                xs0Var.C.setScaleY(0.8f);
                xs0Var.C.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                xs0Var.invalidate();
                jg0 jg0Var2 = new jg0(12, xs0Var, frameLayout);
                xs0Var.D = jg0Var2;
                AndroidUtilities.runOnUIThread(jg0Var2, 4000L);
            }
        } else if (xs0Var.C != null && (jg0Var = xs0Var.D) != null) {
            AndroidUtilities.cancelRunOnUIThread(jg0Var);
            xs0Var.D.run();
            xs0Var.D = null;
            xs0Var.C = null;
        }
    }

    public static void s(org.telegram.ui.Components.eu0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.eu0.s(org.telegram.ui.Components.eu0):void");
    }

    public static void t(eu0 eu0Var, int i9, boolean z10) {
        xs0[] xs0VarArr = eu0Var.f28137g0;
        if (xs0VarArr[0].B == i9) {
            return;
        }
        xs0 xs0Var = xs0VarArr[1];
        xs0Var.B = i9;
        xs0Var.setVisibility(0);
        eu0Var.k0();
        eu0Var.m1(true);
        eu0Var.f28130d1 = z10;
        eu0Var.L0();
        eu0Var.A(!eu0Var.s0(i9), true);
        eu0Var.q1(true);
    }

    public static int u(eu0 eu0Var, f2.r0 r0Var) {
        if (r0Var == eu0Var.V) {
            return 8;
        }
        if (r0Var == eu0Var.f28121a0) {
            return 9;
        }
        for (du0 du0Var : eu0Var.U1.values()) {
            if (du0Var.f27812c == r0Var) {
                return du0Var.f27810a;
            }
        }
        return -1;
    }

    public static int v(eu0 eu0Var, f2.r0 r0Var) {
        if (r0Var == eu0Var.W) {
            return 8;
        }
        if (r0Var == eu0Var.f28124b0) {
            return 9;
        }
        for (du0 du0Var : eu0Var.U1.values()) {
            if (du0Var.d == r0Var) {
                return du0Var.f27810a;
            }
        }
        return -1;
    }

    public static boolean w0(int i9) {
        if ((i9 & (-65536)) == 65536) {
            return true;
        }
        return false;
    }

    public final void A(boolean z10, boolean z11) {
        int i9;
        pi0 pi0Var = this.f28152o0;
        if (pi0Var != null && this.R1 != z10) {
            this.R1 = z10;
            if (!z10 && pi0Var.getAnimatedDrawable().X < 20) {
                pi0Var.getAnimatedDrawable().N(0);
            } else {
                mi0 animatedDrawable = pi0Var.getAnimatedDrawable();
                if (this.R1) {
                    i9 = 50;
                } else {
                    i9 = 100;
                }
                animatedDrawable.N(i9);
            }
            if (z11) {
                pi0Var.getAnimatedDrawable().start();
            } else {
                pi0Var.getAnimatedDrawable().K(pi0Var.getAnimatedDrawable().f30849f);
            }
        }
    }

    public final void A0(int i9) {
        int i10;
        tt0[] tt0VarArr = this.f28155p1;
        if (i9 == 0) {
            int i11 = tt0VarArr[0].f32802q;
            if (i11 == 1) {
                i10 = 6;
            } else if (i11 == 2) {
                i10 = 7;
            } else {
                i10 = 0;
            }
        } else if (i9 == 1) {
            i10 = 1;
        } else if (i9 == 2) {
            i10 = 2;
        } else if (i9 == 4) {
            i10 = 4;
        } else if (i9 == 5) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        tt0VarArr[i9].f32793g = true;
        org.telegram.ui.ActionBar.o2 o2Var = this.f28160r1;
        o2Var.getMediaDataController().loadMedia(this.f28136f1, 50, 0, tt0VarArr[i9].f32796k, i10, this.B, 1, o2Var.getClassGuid(), tt0VarArr[i9].f32801p, null, null);
    }

    public final void B(int i9) {
        int i10;
        xs0 W = W(this.l1);
        this.f28161s = -1;
        if (W != null) {
            W.h.B0();
            this.f28148m1 = i9;
            W.f34761r.setVisibility(0);
            if (p0(this.l1)) {
                W.f34761r.setAdapter(l1(this.l1));
            } else {
                W.f34761r.setAdapter(this.E);
            }
            ws0 ws0Var = W.f34761r;
            int paddingLeft = ws0Var.getPaddingLeft();
            ws0 ws0Var2 = W.f34761r;
            int Z = Z(W.B);
            ws0Var2.Z2 = Z;
            int paddingRight = W.f34761r.getPaddingRight();
            ws0 ws0Var3 = W.f34761r;
            int Y = Y(v0());
            ws0Var3.a3 = Y;
            ws0Var.setPadding(paddingLeft, Z, paddingRight, Y);
            W.f34762s.y1(i9);
            W.f34761r.a0();
            int i11 = 0;
            while (true) {
                xs0[] xs0VarArr = this.f28137g0;
                if (i11 >= xs0VarArr.length) {
                    break;
                }
                xs0 xs0Var = xs0VarArr[i11];
                if (xs0Var != null && ((i10 = xs0Var.B) == 0 || p0(i10))) {
                    AndroidUtilities.updateVisibleRows(xs0VarArr[i11].h);
                }
                i11++;
            }
            this.f28146k1 = true;
            if (this.l1 == 0) {
                this.f28155p1[0].g(true);
            }
            this.f28144j1 = 0.0f;
            X0();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.E1.lock();
            ofFloat.addUpdateListener(new tr0(this, W, 1));
            ofFloat.addListener(new mh.r2(this, p0(W.B) ? 1 : 0, i9, 2));
            ofFloat.setInterpolator(gr.f28844f);
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
        long j10 = this.f28136f1;
        org.telegram.ui.ActionBar.o2 o2Var = this.f28160r1;
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

    public final void C0(int i9, View view) {
        boolean z10;
        boolean z11;
        String string;
        int i10;
        uq0 uq0Var;
        int i11;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z12;
        String formatPluralString;
        String formatPluralString2;
        int i12;
        int i13;
        TLRPC.User user2;
        ot0 ot0Var = this.N;
        SparseArray[] sparseArrayArr = this.V0;
        org.telegram.ui.ActionBar.o2 o2Var = this.f28160r1;
        boolean z13 = true;
        char c10 = 1;
        if (i9 == 101) {
            boolean p02 = p0(getSelectedTab());
            org.telegram.ui.ActionBar.b6 b6Var = this.B1;
            if (!p02 && getSelectedTab() != 13) {
                if (getSelectedTab() == 11) {
                    SavedMessagesController savedMessagesController = o2Var.getMessagesController().getSavedMessagesController();
                    final ArrayList arrayList = new ArrayList();
                    for (int i14 = 0; i14 < savedMessagesController.allDialogs.size(); i14++) {
                        long j10 = savedMessagesController.allDialogs.get(i14).dialogId;
                        if (ot0Var.f31445w.contains(Long.valueOf(j10))) {
                            arrayList.add(Long.valueOf(j10));
                        }
                    }
                    String str = "";
                    if (!arrayList.isEmpty()) {
                        Long l10 = (Long) arrayList.get(0);
                        long longValue = l10.longValue();
                        if (longValue == o2Var.getUserConfig().getClientUserId()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        int i15 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                        if (i15 < 0) {
                            TLRPC.Chat chat2 = o2Var.getMessagesController().getChat(Long.valueOf(-longValue));
                            if (chat2 != null) {
                                str = chat2.title;
                            }
                        } else if (i15 >= 0 && (user2 = o2Var.getMessagesController().getUser(l10)) != null) {
                            str = UserObject.isAnonymous(user2) ? LocaleController.getString(R.string.AnonymousForward) : UserObject.getUserName(user2);
                        }
                    } else {
                        z12 = false;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, b6Var);
                    if (arrayList.size() == 1) {
                        if (z12) {
                            i13 = R.string.ClearHistoryMyNotesTitle;
                        } else {
                            i13 = R.string.ClearHistoryTitleSingle2;
                        }
                        formatPluralString = LocaleController.formatString(i13, str);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("ClearHistoryTitleMultiple", arrayList.size(), new Object[0]);
                    }
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                    c2Var.N = formatPluralString;
                    if (arrayList.size() == 1) {
                        if (z12) {
                            i12 = R.string.ClearHistoryMyNotesMessage;
                        } else {
                            i12 = R.string.ClearHistoryMessageSingle;
                        }
                        formatPluralString2 = LocaleController.formatString(i12, str);
                    } else {
                        formatPluralString2 = LocaleController.formatPluralString("ClearHistoryMessageMultiple", arrayList.size(), new Object[0]);
                    }
                    c2Var.P = formatPluralString2;
                    alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.b2(this) {
                        public final eu0 f29507b;

                        {
                            this.f29507b = this;
                        }

                        @Override
                        public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i16) {
                            switch (r3) {
                                case 0:
                                    eu0 eu0Var = this.f29507b;
                                    org.telegram.ui.ActionBar.o2 o2Var2 = eu0Var.f28160r1;
                                    ih.v6 storiesController = o2Var2.getMessagesController().getStoriesController();
                                    long j11 = eu0Var.f28136f1;
                                    ArrayList arrayList2 = arrayList;
                                    storiesController.s(j11, arrayList2);
                                    oc.a0(o2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList2.size(), new Object[0])).j();
                                    eu0Var.L(false);
                                    return;
                                default:
                                    eu0 eu0Var2 = this.f29507b;
                                    eu0Var2.getClass();
                                    int i17 = 0;
                                    while (true) {
                                        ArrayList arrayList3 = arrayList;
                                        if (i17 < arrayList3.size()) {
                                            eu0Var2.f28160r1.getMessagesController().deleteSavedDialog(((Long) arrayList3.get(i17)).longValue());
                                            i17++;
                                        } else {
                                            eu0Var2.L(true);
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
                        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                        return;
                    }
                    return;
                }
                long j11 = this.f28136f1;
                if (DialogObject.isEncryptedDialog(j11)) {
                    encryptedChat = org.telegram.messenger.l0.l(o2Var.getMessagesController(), j11);
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
                y4.z(o2Var, user, chat, encryptedChat, null, this.Y0, null, this.V0, null, 0, 0, null, new aq0(this, 1), null, this.B1);
            } else if (sparseArrayArr[0] != null) {
                if (r0() && (uq0Var = this.Q) != null && uq0Var.getCurrentList() != null) {
                    ih.f6 currentList = uq0Var.getCurrentList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i16 = 0; i16 < sparseArrayArr[0].size(); i16++) {
                        TL_stories.StoryItem storyItem = ((MessageObject) sparseArrayArr[0].valueAt(i16)).storyItem;
                        if (storyItem != null) {
                            arrayList2.add(storyItem.media);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, b6Var);
                        if (arrayList2.size() > 1) {
                            i11 = R.string.DeleteBotPreviewsTitle;
                        } else {
                            i11 = R.string.DeleteBotPreviewTitle;
                        }
                        String string2 = LocaleController.getString(i11);
                        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
                        c2Var2.N = string2;
                        c2Var2.P = LocaleController.formatPluralString("DeleteBotPreviewsSubtitle", arrayList2.size(), new Object[0]);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new hq0(this, currentList, arrayList2, 0));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new if0(7));
                        c2Var2.show();
                        c2Var2.h();
                        return;
                    }
                    return;
                }
                final ArrayList arrayList3 = new ArrayList();
                for (int i17 = 0; i17 < sparseArrayArr[0].size(); i17++) {
                    TL_stories.StoryItem storyItem2 = ((MessageObject) sparseArrayArr[0].valueAt(i17)).storyItem;
                    if (storyItem2 != null) {
                        arrayList3.add(storyItem2);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), 0, b6Var);
                    if (arrayList3.size() > 1) {
                        i10 = R.string.DeleteStoriesTitle;
                    } else {
                        i10 = R.string.DeleteStoryTitle;
                    }
                    String string3 = LocaleController.getString(i10);
                    org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.f22702a;
                    c2Var3.N = string3;
                    c2Var3.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList3.size(), new Object[0]);
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(this) {
                        public final eu0 f29507b;

                        {
                            this.f29507b = this;
                        }

                        @Override
                        public final void f(org.telegram.ui.ActionBar.c2 c2Var22, int i162) {
                            switch (r3) {
                                case 0:
                                    eu0 eu0Var = this.f29507b;
                                    org.telegram.ui.ActionBar.o2 o2Var2 = eu0Var.f28160r1;
                                    ih.v6 storiesController = o2Var2.getMessagesController().getStoriesController();
                                    long j112 = eu0Var.f28136f1;
                                    ArrayList arrayList22 = arrayList3;
                                    storiesController.s(j112, arrayList22);
                                    oc.a0(o2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList22.size(), new Object[0])).j();
                                    eu0Var.L(false);
                                    return;
                                default:
                                    eu0 eu0Var2 = this.f29507b;
                                    eu0Var2.getClass();
                                    int i172 = 0;
                                    while (true) {
                                        ArrayList arrayList32 = arrayList3;
                                        if (i172 < arrayList32.size()) {
                                            eu0Var2.f28160r1.getMessagesController().deleteSavedDialog(((Long) arrayList32.get(i172)).longValue());
                                            i172++;
                                        } else {
                                            eu0Var2.L(true);
                                            return;
                                        }
                                    }
                            }
                        }
                    });
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new if0(8));
                    c2Var3.show();
                    c2Var3.h();
                }
            }
        } else if (i9 == 100) {
            if (this.f28122a1 != null && o2Var.getMessagesController().isUserNoForwards(this.f28122a1)) {
                s30 s30Var = this.A1;
                if (s30Var != null) {
                    s30Var.setText(LocaleController.getString(R.string.ForwardsRestrictedInfoUser));
                    this.A1.f(view, true);
                    return;
                }
                return;
            }
            if (this.Z0 != null) {
                TLRPC.Chat chat3 = o2Var.getMessagesController().getChat(Long.valueOf(this.Z0.f22381id));
                if (o2Var.getMessagesController().isChatNoForwards(chat3)) {
                    s30 s30Var2 = this.A1;
                    if (s30Var2 != null) {
                        if (ChatObject.isChannel(chat3) && !chat3.megagroup) {
                            string = LocaleController.getString(R.string.ForwardsRestrictedInfoChannel);
                        } else {
                            string = LocaleController.getString(R.string.ForwardsRestrictedInfoGroup);
                        }
                        s30Var2.setText(string);
                        this.A1.f(view, true);
                        return;
                    }
                    return;
                }
            }
            if (j0()) {
                s30 s30Var3 = this.A1;
                if (s30Var3 != null) {
                    s30Var3.setText(LocaleController.getString("ForwardsRestrictedInfoBot", R.string.ForwardsRestrictedInfoBot));
                    this.A1.f(view, true);
                    return;
                }
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("canSelectTopics", true);
            bundle.putInt("dialogsType", 3);
            org.telegram.ui.dy dyVar = new org.telegram.ui.dy(bundle);
            dyVar.f37752y2 = new bq0(this);
            o2Var.presentFragment(dyVar);
        } else if (i9 == 102) {
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
                org.telegram.ui.qn qnVar = new org.telegram.ui.qn(bundle2);
                qnVar.H7 = messageObject.getId();
                long j12 = this.B;
                if (j12 != 0) {
                    vf.c.a(qnVar, MessagesStorage.TopicKey.of(dialogId, j12));
                    bundle2.putInt("message_id", messageObject.getId());
                }
                o2Var.presentFragment(qnVar, false);
            }
        } else if (i9 == 103 || i9 == 104) {
            if (getClosestTab() == 8) {
                ms0 ms0Var = this.V;
                if (ms0Var != null && ms0Var.f27281s != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (int i18 = 0; i18 < sparseArrayArr[0].size(); i18++) {
                        arrayList4.add(Integer.valueOf(((MessageObject) sparseArrayArr[0].valueAt(i18)).getId()));
                    }
                    if (i9 != 103) {
                        z13 = false;
                    }
                    T0(arrayList4, z13);
                    L(false);
                    return;
                }
                return;
            }
            SavedMessagesController savedMessagesController2 = o2Var.getMessagesController().getSavedMessagesController();
            ArrayList<Long> arrayList5 = new ArrayList<>();
            for (int i19 = 0; i19 < savedMessagesController2.allDialogs.size(); i19++) {
                long j13 = savedMessagesController2.allDialogs.get(i19).dialogId;
                if (ot0Var.f31445w.contains(Long.valueOf(j13))) {
                    arrayList5.add(Long.valueOf(j13));
                }
            }
            if (i9 == 103) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!savedMessagesController2.updatePinned(arrayList5, z10, true)) {
                z11 = true;
                o2Var.showDialog(new zf.j0(33, o2Var.getCurrentAccount(), getContext(), o2Var, null));
            } else {
                z11 = true;
                int i20 = 0;
                while (true) {
                    xs0[] xs0VarArr = this.f28137g0;
                    if (i20 >= xs0VarArr.length) {
                        break;
                    }
                    xs0 xs0Var = xs0VarArr[i20];
                    if (xs0Var.B == 11) {
                        xs0Var.f34764x.h1(0, 0);
                        break;
                    }
                    i20++;
                }
            }
            L(z11);
        }
    }

    public boolean D() {
        return !(this instanceof i30);
    }

    public final boolean E() {
        xs0 xs0Var;
        xs0[] xs0VarArr = this.f28137g0;
        if (xs0VarArr == null || (xs0Var = xs0VarArr[0]) == null) {
            return false;
        }
        if (this.f28138g1 && p0(xs0Var.B)) {
            return false;
        }
        boolean p02 = p0(xs0VarArr[0].B);
        int i9 = this.f28142i1[p02 ? 1 : 0];
        if (i9 == X(p02 ? 1 : 0, i9, false)) {
            return false;
        }
        return true;
    }

    public final void F() {
        ur0 ur0Var = this.E0;
        if (!ur0Var.e(ur0Var.getCurrentTabId())) {
            int firstTabId = ur0Var.getFirstTabId();
            ur0Var.setInitialTabId(firstTabId);
            this.f28137g0[0].B = firstTabId;
            m1(false);
        }
    }

    public final void F0() {
        ih.n6 n6Var;
        ih.n6 n6Var2;
        this.C1.removeAllObservers();
        ms0 ms0Var = this.V;
        if (ms0Var != null && (n6Var2 = ms0Var.f27281s) != null && n6Var2 != null) {
            n6Var2.z(ms0Var.v);
        }
        tq0 tq0Var = this.f28121a0;
        if (tq0Var != null && (n6Var = tq0Var.f27281s) != null && n6Var != null) {
            n6Var.z(tq0Var.v);
        }
        for (du0 du0Var : this.U1.values()) {
            cu0 cu0Var = du0Var.f27812c;
            ih.n6 n6Var3 = cu0Var.f27281s;
            if (n6Var3 != null && n6Var3 != null) {
                n6Var3.z(cu0Var.v);
            }
        }
    }

    public final void G(xs0 xs0Var, wk0 wk0Var, f2.m0 m0Var) {
        int abs;
        int h;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        f2.q1 K;
        MessageObject messageObject;
        ih.n6 n6Var;
        if (!this.f28146k1 && this.F1 == null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (wk0Var.getFastScroll() == null || !wk0Var.getFastScroll().f28480n || currentTimeMillis - xs0Var.f34755a >= 300) {
                xs0Var.f34755a = currentTimeMillis;
                if ((!this.R0 || !this.Q0 || xs0Var.B == 11) && xs0Var.B != 7) {
                    int L0 = m0Var.L0();
                    if (L0 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(m0Var.N0() - L0) + 1;
                    }
                    if (wk0Var.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = wk0Var.getAdapter().h();
                    }
                    int i14 = xs0Var.B;
                    int[] iArr = this.f28142i1;
                    tt0[] tt0VarArr = this.f28155p1;
                    if (i14 == 0 || i14 == 1 || i14 == 2 || i14 == 4) {
                        h = tt0VarArr[i14].d() + tt0VarArr[i14].f32788a.size();
                        tt0 tt0Var = tt0VarArr[i14];
                        if (tt0Var.h && tt0Var.f32791e.size() > 2 && xs0Var.B == 0 && tt0VarArr[i14].f32788a.size() != 0) {
                            if (i14 == 0) {
                                i9 = iArr[0];
                            } else {
                                i9 = 1;
                            }
                            float f10 = i9;
                            int measuredHeight = (int) ((wk0Var.getMeasuredHeight() / (wk0Var.getMeasuredWidth() / f10)) * f10 * 1.5f);
                            if (measuredHeight < 100) {
                                measuredHeight = 100;
                            }
                            if (measuredHeight < ((ct0) tt0VarArr[i14].f32791e.get(1)).f27566b) {
                                measuredHeight = ((ct0) tt0VarArr[i14].f32791e.get(1)).f27566b;
                            }
                            if ((L0 > h && L0 - h > measuredHeight) || ((i10 = L0 + abs) < tt0VarArr[i14].f32798m && tt0VarArr[0].f32798m - i10 > measuredHeight)) {
                                org.telegram.ui.rl rlVar = new org.telegram.ui.rl(this, i14, wk0Var, 13);
                                this.F1 = rlVar;
                                AndroidUtilities.runOnUIThread(rlVar);
                                return;
                            }
                        }
                    }
                    int i15 = xs0Var.B;
                    if (i15 != 7) {
                        if (p0(i15)) {
                            bu0 k12 = k1(xs0Var.B);
                            if (k12 != null && (n6Var = k12.f27281s) != null && L0 + abs > n6Var.i() - iArr[1]) {
                                k12.P();
                                return;
                            }
                            return;
                        }
                        int i16 = xs0Var.B;
                        if (i16 == 6) {
                            if (abs > 0) {
                                ps0 ps0Var = this.L;
                                boolean z10 = ps0Var.h;
                                ArrayList arrayList = ps0Var.d;
                                if (!z10 && !ps0Var.f31747e && !arrayList.isEmpty() && L0 + abs >= h - 5) {
                                    ps0.E(ps0Var, ((TLRPC.Chat) j3.r0.j(1, arrayList)).f22380id);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.o2 o2Var = this.f28160r1;
                        if (i16 == 11) {
                            int i17 = -1;
                            for (int i18 = 0; i18 < xs0Var.h.getChildCount(); i18++) {
                                View childAt = xs0Var.h.getChildAt(i18);
                                xs0Var.h.getClass();
                                i17 = Math.max(RecyclerView.R(childAt), i17);
                            }
                            f2.r0 adapter = xs0Var.h.getAdapter();
                            pt0 pt0Var = this.O;
                            if (adapter == pt0Var) {
                                if (i17 + 1 >= pt0Var.h.size() + pt0Var.f31753e.size() && !pt0Var.f31757s && !pt0Var.f31756r) {
                                    pt0Var.f31756r = true;
                                    pt0Var.F();
                                }
                            } else if (i17 + 1 >= o2Var.getMessagesController().getSavedMessagesController().getLoadedCount()) {
                                o2Var.getMessagesController().getSavedMessagesController().loadDialogs(false);
                            }
                        } else if (i16 != 10 && i16 != 12 && i16 != 13 && i16 != 14) {
                            if (i16 == 0) {
                                i11 = 3;
                            } else if (i16 == 5) {
                                i11 = 10;
                            } else {
                                i11 = 6;
                            }
                            if (i16 == 15) {
                                i12 = 8;
                            } else {
                                i12 = i16;
                            }
                            if (abs + L0 > h - i11 || tt0VarArr[i12].f32800o) {
                                tt0 tt0Var2 = tt0VarArr[i12];
                                if (!tt0Var2.f32793g) {
                                    if (i16 == 0) {
                                        int i19 = tt0VarArr[0].f32802q;
                                        if (i19 == 1) {
                                            i13 = 6;
                                        } else if (i19 == 2) {
                                            i13 = 7;
                                        } else {
                                            i13 = 0;
                                        }
                                    } else if (i16 == 1) {
                                        i13 = 1;
                                    } else if (i16 == 2) {
                                        i13 = 2;
                                    } else if (i16 == 4) {
                                        i13 = 4;
                                    } else if (i16 == 5) {
                                        i13 = 5;
                                    } else if (i16 == 15) {
                                        i13 = 8;
                                    } else {
                                        i13 = 3;
                                    }
                                    boolean[] zArr = tt0Var2.f32794i;
                                    if (!zArr[0]) {
                                        tt0Var2.f32793g = true;
                                        o2Var.getMediaDataController().loadMedia(this.f28136f1, 50, tt0VarArr[i12].f32795j[0], 0, i13, this.B, 1, o2Var.getClassGuid(), tt0VarArr[i12].f32801p, null, null);
                                    } else if (this.Y0 != 0 && !zArr[1]) {
                                        tt0Var2.f32793g = true;
                                        o2Var.getMediaDataController().loadMedia(this.Y0, 50, tt0VarArr[i12].f32795j[1], 0, i13, this.B, 1, o2Var.getClassGuid(), tt0VarArr[i12].f32801p, null, null);
                                    }
                                }
                            }
                            int i20 = tt0VarArr[i12].f32798m;
                            if (i12 == 0) {
                                i20 = this.D.L(0);
                            }
                            if (L0 - i20 < i11 + 1) {
                                tt0 tt0Var3 = tt0VarArr[i12];
                                if (!tt0Var3.f32793g && !tt0Var3.f32797l && !tt0Var3.f32800o) {
                                    A0(xs0Var.B);
                                }
                            }
                            xs0 xs0Var2 = this.f28137g0[0];
                            if (xs0Var2.h == wk0Var) {
                                int i21 = xs0Var2.B;
                                if ((i21 == 0 || i21 == 5) && L0 != -1 && (K = wk0Var.K(L0)) != null) {
                                    int i22 = K.f5505f;
                                    if (i22 == 0 || i22 == 12) {
                                        View view = K.f5501a;
                                        boolean z11 = view instanceof org.telegram.ui.Cells.s7;
                                        org.telegram.ui.Cells.w0 w0Var = this.G0;
                                        if (z11) {
                                            org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                                            if (s7Var.f25283e <= 0) {
                                                messageObject = null;
                                            } else {
                                                messageObject = s7Var.f25281b[0];
                                            }
                                            if (messageObject != null) {
                                                w0Var.S(messageObject.messageOwner.date, false, true);
                                            }
                                        } else if (view instanceof org.telegram.ui.Cells.e2) {
                                            w0Var.S(((org.telegram.ui.Cells.e2) view).getDate(), false, true);
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

    public final void G0(int i9, View view, MessageObject messageObject, int i10) {
        TLRPC.WebPage webPage;
        String str;
        char c10;
        int i11;
        int i12;
        if (messageObject != null && !this.f28146k1) {
            zq0 zq0Var = this.S;
            if (zq0Var == null || !zq0Var.f44304w) {
                int i13 = 0;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                i13 = 0;
                String str2 = null;
                ih.n6 n6Var = null;
                boolean z15 = true;
                if (this.f28178y1) {
                    int i14 = 8;
                    if (i10 != 8 || C()) {
                        if (messageObject.getDialogId() == this.f28136f1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        SparseArray[] sparseArrayArr = this.V0;
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            sparseArrayArr[c10].remove(messageObject.getId());
                            if (!messageObject.canDeleteMessage(false, null)) {
                                this.W0--;
                            }
                        } else {
                            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                                sparseArrayArr[c10].put(messageObject.getId(), messageObject);
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
                            this.f28171w0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                            if (this.W0 == 0) {
                                i11 = 0;
                            } else {
                                i11 = 8;
                            }
                            this.f28139h0.setVisibility(i11);
                            org.telegram.ui.ActionBar.w0 w0Var = this.f28156q0;
                            if (w0Var != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14 && sparseArrayArr[0].size() == 1) {
                                    i12 = 0;
                                } else {
                                    i12 = 8;
                                }
                                w0Var.setVisibility(i12);
                            }
                            org.telegram.ui.ActionBar.w0 w0Var2 = this.f28154p0;
                            if (w0Var2 != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                                    i14 = 0;
                                }
                                w0Var2.setVisibility(i14);
                            }
                            u1();
                        }
                        this.X0 = false;
                        if (view instanceof org.telegram.ui.Cells.i7) {
                            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z10 = true;
                            }
                            i7Var.b(z10, true);
                        } else if (view instanceof org.telegram.ui.Cells.s7) {
                            org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) < 0) {
                                z15 = false;
                            }
                            s7Var.b(0, z15);
                        } else if (view instanceof org.telegram.ui.Cells.l7) {
                            org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            l7Var.f(z11, true);
                        } else if (view instanceof org.telegram.ui.Cells.h7) {
                            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z12 = true;
                            }
                            h7Var.e(z12, true);
                        } else if (view instanceof org.telegram.ui.Cells.e2) {
                            org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z13 = true;
                            }
                            e2Var.c(z13, true);
                        } else if (view instanceof org.telegram.ui.Cells.r7) {
                            org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z14 = true;
                            }
                            r7Var.i(z14, true);
                        }
                    } else {
                        return;
                    }
                } else {
                    er0 er0Var = this.f28151n1;
                    tt0[] tt0VarArr = this.f28155p1;
                    org.telegram.ui.ActionBar.o2 o2Var = this.f28160r1;
                    if (i10 == 0) {
                        tt0 tt0Var = tt0VarArr[i10];
                        int i15 = i9 - tt0Var.f32798m;
                        if (i15 >= 0 && i15 < tt0Var.f32788a.size()) {
                            PhotoViewer.t1().K2(null, o2Var, null);
                            PhotoViewer.t1().a2(tt0VarArr[i10].f32788a, i15, this.f28136f1, this.Y0, this.B, er0Var);
                        }
                    } else if (i10 != 2 && i10 != 4) {
                        if (i10 == 5) {
                            PhotoViewer.t1().K2(null, o2Var, null);
                            int indexOf = tt0VarArr[i10].f32788a.indexOf(messageObject);
                            if (indexOf < 0) {
                                PhotoViewer.t1().a2(org.telegram.messenger.l0.k(messageObject), 0, 0L, 0L, 0L, er0Var);
                            } else {
                                PhotoViewer.t1().a2(tt0VarArr[i10].f32788a, indexOf, this.f28136f1, this.Y0, this.B, er0Var);
                            }
                        } else if (i10 == 1) {
                            if (view instanceof org.telegram.ui.Cells.i7) {
                                org.telegram.ui.Cells.i7 i7Var2 = (org.telegram.ui.Cells.i7) view;
                                TLRPC.Document document = messageObject.getDocument();
                                if (i7Var2.C) {
                                    if (messageObject.canPreviewDocument()) {
                                        PhotoViewer.t1().K2(null, o2Var, null);
                                        int indexOf2 = tt0VarArr[i10].f32788a.indexOf(messageObject);
                                        if (indexOf2 < 0) {
                                            PhotoViewer.t1().a2(org.telegram.messenger.l0.k(messageObject), 0, 0L, 0L, 0L, er0Var);
                                            return;
                                        }
                                        PhotoViewer.t1().a2(tt0VarArr[i10].f32788a, indexOf2, this.f28136f1, this.Y0, this.B, er0Var);
                                        return;
                                    }
                                    AndroidUtilities.openDocument(messageObject, o2Var.getParentActivity(), o2Var);
                                } else if (!i7Var2.B) {
                                    MessageObject message = i7Var2.getMessage();
                                    message.putInDownloadsStore = true;
                                    o2Var.getFileLoader().loadFile(document, message, 0, 0);
                                    i7Var2.f(true);
                                } else {
                                    o2Var.getFileLoader().cancelLoadFile(document);
                                    i7Var2.f(true);
                                }
                            }
                        } else if (i10 == 3) {
                            try {
                                if (MessageObject.getMedia(messageObject.messageOwner) != null) {
                                    webPage = MessageObject.getMedia(messageObject.messageOwner).webpage;
                                } else {
                                    webPage = null;
                                }
                                if (webPage != null && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                                    if (webPage.cached_page != null) {
                                        LaunchActivity launchActivity = LaunchActivity.C1;
                                        if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().l(messageObject) == null) {
                                            o2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                            return;
                                        }
                                        return;
                                    }
                                    String str3 = webPage.embed_url;
                                    if (str3 != null && str3.length() != 0) {
                                        gu.I(o2Var, messageObject, this.f28151n1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                        return;
                                    }
                                    str = webPage.url;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    ArrayList arrayList = ((org.telegram.ui.Cells.l7) view).A;
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
                        } else if (p0(i10)) {
                            bu0 k12 = k1(i10);
                            if (k12 != null) {
                                n6Var = k12.f27281s;
                            }
                            if (n6Var != null) {
                                ih.m9 orCreateStoryViewer = o2Var.getOrCreateStoryViewer();
                                Context context = getContext();
                                int id2 = messageObject.getId();
                                ih.e7 a3 = ih.e7.a(this.f28137g0[0].h);
                                a3.f11370e = new wu(n6Var, 18);
                                if ((o2Var instanceof ProfileActivity) && ((ProfileActivity) o2Var).f36019o1) {
                                    i13 = AndroidUtilities.dp(68.0f);
                                }
                                a3.f11374s += i13;
                                orCreateStoryViewer.C(context, id2, n6Var, a3);
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
        f2.r0 r0Var;
        boolean z10;
        uq0 uq0Var;
        float f11;
        boolean z11;
        xs0[] xs0VarArr = this.f28137g0;
        int i9 = xs0VarArr[0].B;
        if (i9 == 13 && (uq0Var = this.Q) != null) {
            View currentView = uq0Var.f14383n.getCurrentView();
            if (currentView instanceof jh.q) {
                jh.q qVar = (jh.q) currentView;
                jh.l lVar = qVar.v;
                jh.i iVar = qVar.f14367f;
                if (qVar.f14363a != null && qVar.getParent() != null) {
                    if (!qVar.f14364b || qVar.G) {
                        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                            if (motionEvent.getActionMasked() == 2 && (qVar.G || qVar.I)) {
                                int i10 = -1;
                                int i11 = -1;
                                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                                    if (qVar.J == motionEvent.getPointerId(i12)) {
                                        i10 = i12;
                                    }
                                    if (qVar.K == motionEvent.getPointerId(i12)) {
                                        i11 = i12;
                                    }
                                }
                                if (i10 != -1 && i11 != -1) {
                                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / qVar.L;
                                    qVar.M = hypot;
                                    if (!qVar.G && (hypot > 1.01f || hypot < 0.99f)) {
                                        qVar.G = true;
                                        if (hypot > 1.0f) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        qVar.N = z11;
                                        qVar.b(z11);
                                    }
                                    if (qVar.G) {
                                        boolean z12 = qVar.N;
                                        if ((z12 && qVar.M < 1.0f) || (!z12 && qVar.M > 1.0f)) {
                                            qVar.f14365c = 0.0f;
                                        } else {
                                            if (z12) {
                                                f11 = org.telegram.messenger.l0.a(2.0f, qVar.M, 1.0f, 1.0f);
                                            } else {
                                                f11 = (1.0f - qVar.M) / 0.5f;
                                            }
                                            qVar.f14365c = Math.max(0.0f, Math.min(1.0f, f11));
                                        }
                                        float f12 = qVar.f14365c;
                                        int i13 = (f12 > 1.0f ? 1 : (f12 == 1.0f ? 0 : -1));
                                        if (i13 == 0 || f12 == 0.0f) {
                                            if (i13 == 0) {
                                                int i14 = qVar.f14366e;
                                                int ceil = (((int) Math.ceil(qVar.O / qVar.f14366e)) * i14) + ((int) ((qVar.S.C.f28169v1 / (iVar.getMeasuredWidth() - ((int) (iVar.getMeasuredWidth() / qVar.f14366e)))) * (i14 - 1)));
                                                if (ceil >= lVar.h()) {
                                                    ceil = lVar.h() - 1;
                                                }
                                                qVar.O = ceil;
                                            }
                                            qVar.a();
                                            if (qVar.f14365c == 0.0f) {
                                                qVar.N = !qVar.N;
                                            }
                                            qVar.b(qVar.N);
                                            qVar.L = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                        }
                                        iVar.invalidate();
                                    }
                                } else {
                                    qVar.H = false;
                                    qVar.I = false;
                                    qVar.G = false;
                                    qVar.a();
                                    return false;
                                }
                            } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((qVar.J == motionEvent.getPointerId(0) && qVar.K == motionEvent.getPointerId(1)) || (qVar.J == motionEvent.getPointerId(1) && qVar.K == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && qVar.G) {
                                qVar.I = false;
                                qVar.H = false;
                                qVar.G = false;
                                qVar.a();
                            }
                        } else {
                            if (qVar.H && !qVar.G && motionEvent.getPointerCount() == 2) {
                                qVar.L = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                qVar.M = 1.0f;
                                qVar.J = motionEvent.getPointerId(0);
                                qVar.K = motionEvent.getPointerId(1);
                                iVar.I0(false);
                                iVar.cancelLongPress();
                                iVar.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                View view = (View) qVar.getParent();
                                qVar.Q = (int) ((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - qVar.getX());
                                int y10 = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - qVar.getY());
                                int i15 = qVar.Q;
                                Rect rect = qVar.R;
                                qVar.O = -1;
                                int i16 = y10 + iVar.T2;
                                for (int i17 = 0; i17 < iVar.getChildCount(); i17++) {
                                    View childAt = iVar.getChildAt(i17);
                                    childAt.getHitRect(rect);
                                    if (rect.contains(i15, i16)) {
                                        qVar.O = RecyclerView.S(childAt);
                                        qVar.P = childAt.getTop();
                                    }
                                }
                                qVar.I = true;
                            }
                            if (motionEvent.getActionMasked() == 0 && (motionEvent.getY() - ((View) qVar.getParent()).getY()) - qVar.getY() > 0.0f) {
                                qVar.H = true;
                            }
                        }
                        return qVar.G;
                    }
                    return true;
                }
            }
            return false;
        }
        if ((i9 == 0 || p0(i9)) && getParent() != null) {
            if (!this.f28146k1 || this.f28120a) {
                if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                    if (motionEvent.getActionMasked() == 2 && (this.f28120a || this.f28126c)) {
                        int i18 = -1;
                        int i19 = -1;
                        for (int i20 = 0; i20 < motionEvent.getPointerCount(); i20++) {
                            if (this.f28131e == motionEvent.getPointerId(i20)) {
                                i18 = i20;
                            }
                            if (this.f28134f == motionEvent.getPointerId(i20)) {
                                i19 = i20;
                            }
                        }
                        if (i18 != -1 && i19 != -1) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(i19) - motionEvent.getX(i18), motionEvent.getY(i19) - motionEvent.getY(i18))) / this.h;
                            this.f28149n = hypot2;
                            if (!this.f28120a && (hypot2 > 1.01f || hypot2 < 0.99f)) {
                                this.f28120a = true;
                                if (hypot2 > 1.0f) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                this.f28158r = z10;
                                e1(z10);
                            }
                            if (this.f28120a) {
                                boolean z13 = this.f28158r;
                                if ((z13 && this.f28149n < 1.0f) || (!z13 && this.f28149n > 1.0f)) {
                                    this.f28144j1 = 0.0f;
                                } else {
                                    if (z13) {
                                        f10 = org.telegram.messenger.l0.a(2.0f, this.f28149n, 1.0f, 1.0f);
                                    } else {
                                        f10 = (1.0f - this.f28149n) / 0.5f;
                                    }
                                    this.f28144j1 = Math.max(0.0f, Math.min(1.0f, f10));
                                }
                                float f13 = this.f28144j1;
                                if (f13 == 1.0f || f13 == 0.0f) {
                                    if (p0(this.l1)) {
                                        r0Var = k1(this.l1);
                                    } else {
                                        r0Var = this.D;
                                    }
                                    if (this.f28144j1 == 1.0f) {
                                        int i21 = this.f28148m1;
                                        int ceil2 = (((int) Math.ceil(this.f28161s / this.f28148m1)) * i21) + ((int) ((this.f28169v1 / (xs0VarArr[0].h.getMeasuredWidth() - ((int) (xs0VarArr[0].h.getMeasuredWidth() / this.f28148m1)))) * (i21 - 1)));
                                        if (ceil2 >= r0Var.h()) {
                                            ceil2 = r0Var.h() - 1;
                                        }
                                        this.f28161s = ceil2;
                                    }
                                    T();
                                    if (this.f28144j1 == 0.0f) {
                                        this.f28158r = !this.f28158r;
                                    }
                                    e1(this.f28158r);
                                    this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                xs0VarArr[0].h.invalidate();
                                xs0 xs0Var = xs0VarArr[0];
                                if (xs0Var.C != null) {
                                    xs0Var.invalidate();
                                }
                            }
                        } else {
                            this.f28123b = false;
                            this.f28126c = false;
                            this.f28120a = false;
                            T();
                            return false;
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.f28131e == motionEvent.getPointerId(0) && this.f28134f == motionEvent.getPointerId(1)) || (this.f28131e == motionEvent.getPointerId(1) && this.f28134f == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.f28120a) {
                        this.f28126c = false;
                        this.f28123b = false;
                        this.f28120a = false;
                        T();
                    }
                } else {
                    if (this.f28123b && !this.f28120a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.f28149n = 1.0f;
                        this.f28131e = motionEvent.getPointerId(0);
                        this.f28134f = motionEvent.getPointerId(1);
                        xs0VarArr[0].h.I0(false);
                        xs0VarArr[0].h.cancelLongPress();
                        xs0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.f28170w = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - xs0VarArr[0].getX());
                        int y11 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - xs0VarArr[0].getY());
                        int i22 = this.f28170w;
                        this.f28161s = -1;
                        int i23 = y11 + xs0VarArr[0].h.T2;
                        if (getY() != 0.0f && this.A == 1) {
                            i23 = 0;
                        }
                        for (int i24 = 0; i24 < xs0VarArr[0].h.getChildCount(); i24++) {
                            View childAt2 = xs0VarArr[0].h.getChildAt(i24);
                            Rect rect2 = this.f28173x;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i22, i23)) {
                                xs0VarArr[0].h.getClass();
                                this.f28161s = RecyclerView.S(childAt2);
                                this.v = childAt2.getTop();
                            }
                        }
                        if (this.f28180z1.S() && this.f28161s == -1) {
                            this.f28161s = (int) (((this.f28142i1[p0(xs0VarArr[0].B) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i22 / xs0VarArr[0].h.getMeasuredWidth(), 0.0f))) + xs0VarArr[0].f34764x.L0());
                            this.v = 0;
                        }
                        this.f28126c = true;
                    }
                    if (motionEvent.getActionMasked() == 0 && ((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - xs0VarArr[0].getY() > 0.0f) {
                        this.f28123b = true;
                    }
                }
                return this.f28120a;
            }
            return true;
        }
        return false;
    }

    public final boolean H0(MessageObject messageObject, View view, int i9, boolean z10) {
        zq0 zq0Var;
        char c10;
        int i10;
        int i11;
        final TL_stories.StoryItem storyItem;
        ms0 ms0Var;
        ih.n6 n6Var;
        if (!this.f28178y1) {
            org.telegram.ui.ActionBar.o2 o2Var = this.f28160r1;
            if (o2Var.getParentActivity() != null && messageObject != null && ((zq0Var = this.S) == null || !zq0Var.f44304w)) {
                AndroidUtilities.hideKeyboard(o2Var.getParentActivity().getCurrentFocus());
                long j10 = this.f28136f1;
                int i12 = 8;
                if (z10 && ((w0(getClosestTab()) || getClosestTab() == 8) && !this.f28178y1)) {
                    if (view instanceof org.telegram.ui.Cells.r7) {
                        org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
                        r7Var.k(r7Var.f25107n, r7Var.f25112r, true);
                    }
                    TL_stories.StoryItem storyItem2 = messageObject.storyItem;
                    if (storyItem2 != null) {
                        HashSet hashSet = new HashSet();
                        ArrayList<Integer> arrayList = storyItem2.albums;
                        if (arrayList != null) {
                            hashSet.addAll(arrayList);
                        }
                        boolean w02 = w0(getClosestTab());
                        x60 I = x60.I(o2Var, view);
                        x60 J = I.J();
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.kt0(I, 25), false);
                        J.k();
                        x60.f(J, getStoriesController().B(j10, true), hashSet, true, new ue0(this, storyItem2, I, 4), new bg.j1(this, hashSet, storyItem2, I, 11));
                        I.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddToAlbum), new fh.k3(I, J, 8), false);
                        I.k();
                        I.c(R.drawable.msg_select, LocaleController.getString(R.string.StoriesAlbumMenuSelect), new c3.d(this, messageObject, view, i9, 23), false);
                        if (w02) {
                            int h12 = h1(getClosestTab());
                            String w8 = getStoriesController().w(h12, j10);
                            I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new qd(this, h12, 6), false);
                            storyItem = storyItem2;
                            I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.StoriesAlbumMenuRemoveFromAlbum), new c3.d(this, h12, storyItem, w8, 24), false);
                        } else {
                            storyItem = storyItem2;
                            if (getClosestTab() == 8 && (ms0Var = this.V) != null && (n6Var = ms0Var.f27281s) != null) {
                                if (n6Var.m(storyItem.f22617id)) {
                                    I.c(R.drawable.chats_unpin, LocaleController.getString(R.string.StoriesAlbumMenuUnpin), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r1) {
                                                case 0:
                                                    eu0 eu0Var = this;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eu0Var.getContext(), 0, eu0Var.B1);
                                                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DeleteStoryTitle);
                                                    alertDialog$Builder.f22702a.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new jq0(eu0Var, storyItem));
                                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new if0(9));
                                                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                                                    c2Var.show();
                                                    c2Var.h();
                                                    return;
                                                case 1:
                                                    eu0 eu0Var2 = this;
                                                    eu0Var2.getClass();
                                                    eu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22617id))), false);
                                                    return;
                                                case 2:
                                                    eu0 eu0Var3 = this;
                                                    eu0Var3.getClass();
                                                    eu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22617id))), true);
                                                    return;
                                                default:
                                                    eu0.h(this, storyItem);
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
                                                    eu0 eu0Var = this;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eu0Var.getContext(), 0, eu0Var.B1);
                                                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DeleteStoryTitle);
                                                    alertDialog$Builder.f22702a.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new jq0(eu0Var, storyItem));
                                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new if0(9));
                                                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                                                    c2Var.show();
                                                    c2Var.h();
                                                    return;
                                                case 1:
                                                    eu0 eu0Var2 = this;
                                                    eu0Var2.getClass();
                                                    eu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22617id))), false);
                                                    return;
                                                case 2:
                                                    eu0 eu0Var3 = this;
                                                    eu0Var3.getClass();
                                                    eu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22617id))), true);
                                                    return;
                                                default:
                                                    eu0.h(this, storyItem);
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
                                            eu0 eu0Var = this;
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eu0Var.getContext(), 0, eu0Var.B1);
                                            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DeleteStoryTitle);
                                            alertDialog$Builder.f22702a.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new jq0(eu0Var, storyItem));
                                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new if0(9));
                                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                                            c2Var.show();
                                            c2Var.h();
                                            return;
                                        case 1:
                                            eu0 eu0Var2 = this;
                                            eu0Var2.getClass();
                                            eu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22617id))), false);
                                            return;
                                        case 2:
                                            eu0 eu0Var3 = this;
                                            eu0Var3.getClass();
                                            eu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22617id))), true);
                                            return;
                                        default:
                                            eu0.h(this, storyItem);
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
                                        eu0 eu0Var = this;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eu0Var.getContext(), 0, eu0Var.B1);
                                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DeleteStoryTitle);
                                        alertDialog$Builder.f22702a.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new jq0(eu0Var, storyItem));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new if0(9));
                                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                                        c2Var.show();
                                        c2Var.h();
                                        return;
                                    case 1:
                                        eu0 eu0Var2 = this;
                                        eu0Var2.getClass();
                                        eu0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22617id))), false);
                                        return;
                                    case 2:
                                        eu0 eu0Var3 = this;
                                        eu0Var3.getClass();
                                        eu0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f22617id))), true);
                                        return;
                                    default:
                                        eu0.h(this, storyItem);
                                        return;
                                }
                            }
                        }, true);
                        I.f34562i = 3;
                        I.f34582u = true;
                        I.v = true;
                        I.L = true;
                        I.M = 3;
                        Point point = AndroidUtilities.displaySize;
                        Point point2 = AndroidUtilities.displaySize;
                        int min = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point2.x, point2.y) * 0.4333f) * 3.0f) / 4.0f));
                        I.N = min;
                        I.O = (min * 4) / 3;
                        I.f34581t = true;
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
                    SparseArray[] sparseArrayArr = this.V0;
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.W0++;
                    }
                    if (this.W0 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    this.f28139h0.setVisibility(i10);
                    org.telegram.ui.ActionBar.w0 w0Var = this.f28156q0;
                    if (w0Var != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        w0Var.setVisibility(i11);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.f28154p0;
                    if (w0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        }
                        w0Var2.setVisibility(i12);
                    }
                    this.f28171w0.a(1, false);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList3 = this.J0;
                        if (i13 >= arrayList3.size()) {
                            break;
                        }
                        View view2 = (View) arrayList3.get(i13);
                        AndroidUtilities.clearDrawableAnimation(view2);
                        arrayList2.add(ObjectAnimator.ofFloat(view2, View.SCALE_Y, 0.1f, 1.0f));
                        i13++;
                    }
                    animatorSet.playTogether(arrayList2);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    this.X0 = false;
                    if (view instanceof org.telegram.ui.Cells.i7) {
                        ((org.telegram.ui.Cells.i7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.s7) {
                        ((org.telegram.ui.Cells.s7) view).b(i9, true);
                    } else if (view instanceof org.telegram.ui.Cells.l7) {
                        ((org.telegram.ui.Cells.l7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) view).e(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.e2) {
                        ((org.telegram.ui.Cells.e2) view).c(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.r7) {
                        ((org.telegram.ui.Cells.r7) view).i(true, true);
                    }
                    if (!this.f28178y1) {
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
        float f10;
        float measuredWidth;
        xs0[] xs0VarArr = this.f28137g0;
        xs0 xs0Var = xs0VarArr[0];
        if (xs0Var != null && xs0VarArr[1] != null) {
            float f11 = 0.0f;
            zq0 zq0Var = this.S;
            if (zq0Var != null) {
                if (p0(xs0Var.B) && xs0VarArr[0].B != 9) {
                    c10 = 1;
                } else {
                    c10 = 0;
                }
                if (xs0VarArr[1].getVisibility() == 0) {
                    if (p0(xs0VarArr[1].B) && xs0VarArr[1].B != 9) {
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
                        measuredWidth = xs0VarArr[0].getMeasuredWidth();
                    }
                    zq0Var.setTranslationX(measuredWidth);
                } else {
                    zq0Var.setTranslationX(xs0VarArr[c10 ^ 1].getTranslationX());
                    abs = 1.0f - (Math.abs(zq0Var.getTranslationX()) / zq0Var.getMeasuredWidth());
                }
                float f12 = 0.0f;
                for (int i9 = 0; i9 < xs0VarArr.length; i9++) {
                    if (xs0VarArr[i9].getVisibility() == 0) {
                        dr0 dr0Var = xs0VarArr[i9].h;
                        if (dr0Var.getChildCount() == 0) {
                            childAt = null;
                        } else {
                            childAt = dr0Var.getChildAt(0);
                        }
                        if (childAt == null) {
                            R = -1;
                        } else {
                            R = RecyclerView.R(childAt);
                        }
                        if (R == 0) {
                            f10 = childAt.getY() - dr0Var.getPaddingTop();
                        } else if (dr0Var.getChildCount() == 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = -AndroidUtilities.dp(48.0f);
                        }
                        f12 += Utilities.clamp01(1.0f - (xs0VarArr[i9].getTranslationX() / xs0VarArr[i9].getMeasuredWidth())) * f10;
                    }
                }
                float clamp01 = Utilities.clamp01(1.0f - ((-f12) / AndroidUtilities.dpf2(48.0f)));
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
                zq0Var.setAlpha(clamp01);
                zq0Var.setScaleX(lerp);
                zq0Var.setScaleY(lerp);
                zq0Var.setTranslationY(this.G1 + f12);
                f11 = abs;
            }
            K();
            if (this.Q1 != f11) {
                this.Q1 = f11;
                o0();
                invalidate();
            }
        }
    }

    public boolean I0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return false;
    }

    public final boolean J() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.eu0.J():boolean");
    }

    public final void J0(float f10) {
        int i9;
        int i10;
        xs0[] xs0VarArr = this.f28137g0;
        int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i11 != 0 || xs0VarArr[1].getVisibility() == 0) {
            if (this.f28130d1) {
                xs0 xs0Var = xs0VarArr[0];
                xs0Var.setTranslationX((-f10) * xs0Var.getMeasuredWidth());
                xs0VarArr[1].setTranslationX(xs0VarArr[0].getMeasuredWidth() - (xs0VarArr[0].getMeasuredWidth() * f10));
            } else {
                xs0 xs0Var2 = xs0VarArr[0];
                xs0Var2.setTranslationX(xs0Var2.getMeasuredWidth() * f10);
                xs0VarArr[1].setTranslationX((xs0VarArr[0].getMeasuredWidth() * f10) - xs0VarArr[0].getMeasuredWidth());
            }
            M0(getTabProgress());
            float a02 = a0(f10);
            this.f28147l0 = a02;
            int i12 = 4;
            if (a02 != 0.0f && D() && !q0()) {
                i9 = 0;
            } else {
                i9 = 4;
            }
            this.f28150n0.setVisibility(i9);
            org.telegram.ui.ActionBar.w0 w0Var = this.f28143j0;
            if (w0Var != null && !D()) {
                if (v0()) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                w0Var.setVisibility(i10);
                this.f28145k0 = 0.0f;
            } else {
                this.f28145k0 = b0(f10);
                t1();
            }
            q1(false);
            if (i11 == 0) {
                xs0 xs0Var3 = xs0VarArr[0];
                xs0VarArr[0] = xs0VarArr[1];
                xs0VarArr[1] = xs0Var3;
                xs0Var3.setVisibility(8);
                if (w0Var != null && this.f28164t0 == 2) {
                    if (v0()) {
                        i12 = 8;
                    }
                    w0Var.setVisibility(i12);
                }
                this.f28164t0 = 0;
                f1();
            }
        }
    }

    public final void K() {
        bs bsVar = this.L0;
        if (bsVar != null) {
            zq0 zq0Var = this.S;
            float f10 = 0.0f;
            if (zq0Var != null) {
                f10 = 0.0f + (zq0Var.getVisibilityFactor() * AndroidUtilities.dp(38.0f) * (1.0f - Math.abs(zq0Var.getTranslationX() / zq0Var.getMeasuredWidth())));
            }
            bsVar.setTranslationY(this.G1 + f10);
        }
    }

    public final boolean L(boolean z10) {
        SparseArray[] sparseArrayArr;
        if (!this.f28178y1) {
            return false;
        }
        int i9 = 1;
        while (true) {
            sparseArrayArr = this.V0;
            if (i9 < 0) {
                break;
            }
            sparseArrayArr[i9].clear();
            i9--;
        }
        this.W0 = 0;
        D0(sparseArrayArr[0]);
        uq0 uq0Var = this.Q;
        if (uq0Var != null) {
            uq0Var.h();
            uq0Var.j();
        }
        b1(false);
        r1(z10);
        ot0 ot0Var = this.N;
        if (ot0Var != null) {
            ot0Var.f31445w.clear();
        }
        return true;
    }

    public void L0() {
        boolean z10;
        int i9;
        boolean z11;
        boolean z12;
        boolean z13;
        if (!v0() && !q0()) {
            z10 = false;
        } else {
            z10 = true;
        }
        zt0 zt0Var = this.f28121a0.f27282w;
        if (zt0Var != null) {
            if (z10 && getClosestTab() == 9) {
                z13 = true;
            } else {
                z13 = false;
            }
            zt0Var.b(z13);
        }
        zt0 zt0Var2 = this.V.f27282w;
        if (zt0Var2 != null) {
            if (z10 && getClosestTab() == 8) {
                z12 = true;
            } else {
                z12 = false;
            }
            zt0Var2.b(z12);
        }
        for (du0 du0Var : this.U1.values()) {
            cu0 cu0Var = du0Var.f27812c;
            if (cu0Var.f27281s != null) {
                zt0 zt0Var3 = cu0Var.f27282w;
                if (z10 && getClosestTab() == du0Var.f27810a) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zt0Var3.b(z11);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.f28143j0;
        if (w0Var != null) {
            rr0 rr0Var = this.F0;
            if (rr0Var != null && rr0Var.a() && getSelectedTab() == 11) {
                i9 = R.string.SavedTagSearchHint;
            } else {
                i9 = R.string.Search;
            }
            w0Var.setSearchFieldHint(LocaleController.getString(i9));
        }
        I();
    }

    public void M0(float f10) {
        E0();
    }

    public boolean N() {
        return this instanceof i30;
    }

    public final boolean O(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x10 = (-view.getX()) - getX();
        xs0[] xs0VarArr = this.f28137g0;
        motionEvent.offsetLocation(x10 - xs0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - xs0VarArr[0].getY()) - xs0VarArr[0].h.getFastScroll().getY());
        return xs0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public final void O0(org.telegram.ui.ActionBar.o2 o2Var, long j10, int i9) {
        new org.telegram.ui.o61(o2Var, j10, this.f28142i1[1], new kc(this, j10, i9)).show();
    }

    public void P(Canvas canvas, float f10, Rect rect, Paint paint) {
        canvas.drawRect(rect, paint);
    }

    public final void P0(org.telegram.ui.ActionBar.o2 o2Var, long j10, int i9) {
        y4.v0(o2Var, LocaleController.getString(R.string.Delete), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesAlbumMenuDeleteAlbumAsk, getStoriesController().w(i9, j10))), LocaleController.getString(R.string.Delete), true, new gh.e9(this, j10, i9, 8));
    }

    public final void Q(Canvas canvas, ArrayList arrayList) {
        int i9 = 0;
        while (true) {
            xs0[] xs0VarArr = this.f28137g0;
            if (i9 < xs0VarArr.length) {
                xs0 xs0Var = xs0VarArr[i9];
                if (xs0Var != null && xs0Var.getVisibility() == 0) {
                    for (int i10 = 0; i10 < xs0VarArr[i9].h.getChildCount(); i10++) {
                        View childAt = xs0VarArr[i9].h.getChildAt(i10);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + xs0VarArr[i9].h.T2) {
                            int save = canvas.save();
                            canvas.translate(childAt.getX() + xs0VarArr[i9].getX(), childAt.getY() + xs0VarArr[i9].h.getY() + xs0VarArr[i9].getY() + getY());
                            childAt.draw(canvas);
                            if (arrayList != null && (childAt instanceof uu0)) {
                                arrayList.add((uu0) childAt);
                            }
                            canvas.restoreToCount(save);
                        }
                    }
                }
                i9++;
            } else {
                return;
            }
        }
    }

    public final void Q0(org.telegram.ui.ActionBar.o2 o2Var, long j10, int i9) {
        String w8 = getStoriesController().w(i9, j10);
        Context context = o2Var.getContext();
        org.telegram.ui.ActionBar.b6 resourceProvider = o2Var.getResourceProvider();
        i3.e eVar = new i3.e(this, j10, i9);
        Pattern pattern = y4.f34847a;
        y4.R(context, o2Var, LocaleController.getString(R.string.StoriesAlbumRename), LocaleController.getString(R.string.StoriesAlbumRenameHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), w8, 12, LocaleController.getString(R.string.Rename), resourceProvider, eVar);
    }

    public final boolean R(int i9) {
        tt0[] tt0VarArr = this.f28157q1.f34366n;
        if (tt0VarArr == null) {
            return false;
        }
        tt0[] tt0VarArr2 = this.f28155p1;
        if (i9 == 0) {
            tt0 tt0Var = tt0VarArr2[i9];
            if (!tt0Var.h) {
                int[] iArr = tt0Var.f32792f;
                int[] iArr2 = tt0VarArr[i9].f32792f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = tt0VarArr2[i9].f32792f;
            int[] iArr4 = tt0VarArr[i9].f32792f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        tt0VarArr2[i9].f32788a.addAll(tt0VarArr[i9].f32788a);
        tt0VarArr2[i9].f32790c.addAll(tt0VarArr[i9].f32790c);
        for (Map.Entry entry : tt0VarArr[i9].d.entrySet()) {
            tt0VarArr2[i9].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i10 = 0; i10 < 2; i10++) {
            tt0VarArr2[i9].f32789b[i10] = tt0VarArr[i9].f32789b[i10].clone();
            tt0 tt0Var2 = tt0VarArr2[i9];
            int[] iArr5 = tt0Var2.f32795j;
            tt0 tt0Var3 = tt0VarArr[i9];
            iArr5[i10] = tt0Var3.f32795j[i10];
            tt0Var2.f32794i[i10] = tt0Var3.f32794i[i10];
        }
        tt0VarArr2[i9].f32791e.addAll(tt0VarArr[i9].f32791e);
        return !tt0VarArr[i9].f32788a.isEmpty();
    }

    public final void R0(String str) {
        boolean shouldShowUrlInAlert = AndroidUtilities.shouldShowUrlInAlert(str);
        org.telegram.ui.ActionBar.o2 o2Var = this.f28160r1;
        if (shouldShowUrlInAlert) {
            y4.q0(o2Var, str, true, true);
        } else {
            ve.e.s(o2Var.getParentActivity(), str);
        }
    }

    public final void S(int i9, wk0 wk0Var, boolean z10) {
        ArrayList arrayList = this.f28155p1[i9].f32791e;
        int L0 = ((f2.m0) wk0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            ct0 ct0Var = null;
            if (arrayList != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    } else if (L0 <= ((ct0) arrayList.get(i10)).f27566b) {
                        ct0Var = (ct0) arrayList.get(i10);
                        break;
                    } else {
                        i10++;
                    }
                }
                if (ct0Var == null) {
                    ct0Var = (ct0) j3.r0.j(1, arrayList);
                }
            }
            if (ct0Var != null) {
                y0(i9, ct0Var.d, ct0Var.f27566b + 1, z10);
            }
        }
    }

    public int S0() {
        return -1;
    }

    public final void T() {
        xs0[] xs0VarArr;
        xs0 xs0Var;
        boolean z10;
        int i9;
        f2.r0 adapter;
        if (this.f28146k1) {
            int i10 = 0;
            while (true) {
                xs0VarArr = this.f28137g0;
                if (i10 < xs0VarArr.length) {
                    xs0Var = xs0VarArr[i10];
                    if (xs0Var.B == this.l1) {
                        break;
                    }
                    i10++;
                } else {
                    xs0Var = null;
                    break;
                }
            }
            if (xs0Var != null) {
                boolean p02 = p0(xs0Var.B);
                float f10 = this.f28144j1;
                tt0[] tt0VarArr = this.f28155p1;
                float f11 = 1.0f;
                if (f10 == 1.0f) {
                    this.f28146k1 = false;
                    int i11 = this.f28148m1;
                    int[] iArr = this.f28142i1;
                    iArr[p02 ? 1 : 0] = i11;
                    if (!p02) {
                        SharedConfig.setMediaColumnsCount(i11);
                    } else if (c0(xs0Var.B) >= 5) {
                        SharedConfig.setStoriesColumnsCount(this.f28148m1);
                    }
                    for (int i12 = 0; i12 < xs0VarArr.length; i12++) {
                        xs0 xs0Var2 = xs0VarArr[i12];
                        if (xs0Var2 != null && xs0Var2.h != null && (((i9 = xs0Var2.B) == 0 || p0(i9)) && (adapter = xs0VarArr[i12].h.getAdapter()) != null)) {
                            int h = adapter.h();
                            if (i12 == 0) {
                                tt0VarArr[0].g(false);
                            }
                            xs0VarArr[i12].f34761r.setVisibility(8);
                            xs0VarArr[i12].f34764x.y1(iArr[p02 ? 1 : 0]);
                            xs0VarArr[i12].h.a0();
                            xs0VarArr[i12].h.invalidate();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(xs0VarArr[i12].h);
                            } else {
                                adapter.l();
                            }
                        }
                    }
                    if (this.f28161s >= 0) {
                        for (int i13 = 0; i13 < xs0VarArr.length; i13++) {
                            xs0 xs0Var3 = xs0VarArr[i13];
                            if (xs0Var3.B == this.l1) {
                                View m10 = xs0Var3.f34762s.m(this.f28161s);
                                if (m10 != null) {
                                    this.v = m10.getTop();
                                }
                                xs0 xs0Var4 = xs0VarArr[i13];
                                xs0Var4.f34764x.h1(this.f28161s, (-xs0Var4.h.getPaddingTop()) + this.v);
                            }
                        }
                        return;
                    }
                    X0();
                } else if (f10 == 0.0f) {
                    this.f28146k1 = false;
                    if (this.l1 == 0) {
                        tt0VarArr[0].g(false);
                    }
                    xs0Var.f34761r.setVisibility(8);
                    xs0Var.h.invalidate();
                } else {
                    if (f10 > 0.2f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        f11 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
                    ofFloat.addUpdateListener(new tr0(this, xs0Var, 0));
                    ofFloat.addListener(new org.telegram.ui.si(this, z10, p02 ? 1 : 0, xs0Var));
                    ofFloat.setInterpolator(gr.f28844f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                }
            }
        }
    }

    public final void T0(ArrayList arrayList, boolean z10) {
        boolean z11;
        boolean z12;
        ms0 ms0Var = this.V;
        if (ms0Var != null && ms0Var.f27281s != null) {
            org.telegram.ui.ActionBar.o2 o2Var = this.f28160r1;
            if (z10 && arrayList.size() > o2Var.getMessagesController().storiesPinnedToTopCountMax) {
                oc.a0(o2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", o2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
                return;
            }
            ih.n6 n6Var = ms0Var.f27281s;
            int i9 = n6Var.f11847c;
            ArrayList arrayList2 = n6Var.f11850g;
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
            if (arrayList3.size() > MessagesController.getInstance(i9).storiesPinnedToTopCountMax) {
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
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList2.size()) {
                            break;
                        } else if (arrayList2.get(i10) != arrayList3.get(i10)) {
                            z12 = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (z12) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList3);
                    n6Var.d(true);
                    TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                    tL_togglePinnedToTop.f22630id.addAll(arrayList2);
                    tL_togglePinnedToTop.peer = MessagesController.getInstance(i9).getInputPeer(n6Var.d);
                    ConnectionsManager.getInstance(i9).sendRequest(tL_togglePinnedToTop, new ih.q5(2));
                }
                z13 = z11;
            }
            if (z13) {
                oc.a0(o2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", o2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
            } else if (z10) {
                oc.a0(o2Var).M(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinned", arrayList.size(), new Object[0])), LocaleController.formatPluralString("StoriesPinnedText", arrayList.size(), new Object[0]), R.raw.ic_pin).j();
            } else {
                oc.a0(o2Var).Q(R.raw.ic_unpin, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesUnpinned", arrayList.size(), new Object[0]))).j();
            }
        }
    }

    public final void U(int i9) {
        ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i9 == 0) {
            if (!AndroidUtilities.isTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 2) {
                this.f28171w0.setTextSize(18);
            } else {
                this.f28171w0.setTextSize(20);
            }
        }
        if (i9 == 0) {
            this.D.l();
        }
    }

    public final boolean U0(MotionEvent motionEvent, boolean z10) {
        int i9;
        xs0 xs0Var;
        uq0 uq0Var;
        int i10;
        int i11;
        int closestTab = getClosestTab();
        ur0 ur0Var = this.E0;
        SparseIntArray sparseIntArray = ur0Var.K;
        int i12 = ur0Var.f26527n;
        int i13 = -1;
        if (z10) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        int i14 = sparseIntArray.get(i12 + i9, -1);
        zq0 zq0Var = this.S;
        if (zq0Var != null) {
            if (!w0(closestTab) && closestTab != 8) {
                if (w0(i14) || i14 == 8) {
                    i13 = zq0Var.getCurrentAlbumId();
                }
            } else {
                m71 m71Var = zq0Var.f44301n;
                SparseIntArray sparseIntArray2 = m71Var.U;
                int i15 = m71Var.B;
                if (z10) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                i13 = sparseIntArray2.get(i15 + i11, -1);
            }
            if (i13 == 0) {
                i14 = 8;
            } else if (i13 > 0) {
                i14 = i1(i13).f27810a;
            }
        }
        if (i14 >= 0) {
            org.telegram.ui.ActionBar.w0 w0Var = this.f28143j0;
            if (w0Var != null && !D()) {
                if (v0()) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                w0Var.setVisibility(i10);
                this.f28145k0 = 0.0f;
            } else {
                this.f28145k0 = b0(0.0f);
                s1(0.0f);
            }
            if ((!this.R0 || getSelectedTab() != 11) && (!C() || !this.f28178y1 || (getClosestTab() != 8 && !w0(getClosestTab())))) {
                xs0[] xs0VarArr = this.f28137g0;
                xs0 xs0Var2 = xs0VarArr[0];
                if (xs0Var2 != null && xs0Var2.B == 13 && (uq0Var = this.Q) != null) {
                    jh.a aVar = uq0Var.f14383n;
                    if (!z10) {
                    }
                }
                xs0 xs0Var3 = xs0VarArr[0];
                vq0 vq0Var = this.R;
                if (xs0Var3 != null && xs0Var3.B == 14 && vq0Var != null) {
                    fh.c3 c3Var = vq0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.f28178y1 || (xs0Var = xs0VarArr[0]) == null || xs0Var.B != 13) && ((vq0Var == null || !vq0Var.g()) && (zq0Var == null || !zq0Var.f44304w))) {
                    q1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    k0();
                    this.f28167u1 = false;
                    this.f28165t1 = true;
                    N0(true);
                    this.f28169v1 = (int) motionEvent.getX();
                    this.C.setEnabled(false);
                    ur0Var.setEnabled(false);
                    xs0 xs0Var4 = xs0VarArr[1];
                    xs0Var4.B = i14;
                    xs0Var4.setVisibility(0);
                    this.f28130d1 = z10;
                    m1(true);
                    if (z10) {
                        xs0VarArr[1].setTranslationX(xs0VarArr[0].getMeasuredWidth());
                    } else {
                        xs0VarArr[1].setTranslationX(-xs0VarArr[0].getMeasuredWidth());
                    }
                    M0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    public final String V(boolean z10) {
        int i9;
        int i10;
        TLRPC.MessageMedia messageMedia;
        uq0 uq0Var;
        if (!r0()) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        if (z10 && (uq0Var = this.Q) != null) {
            return uq0Var.getBotPreviewsSubtitle();
        }
        ms0 ms0Var = this.V;
        if (ms0Var != null && ms0Var.f27281s != null) {
            i9 = 0;
            i10 = 0;
            for (int i11 = 0; i11 < ms0Var.f27281s.f11851i.size(); i11++) {
                MessageObject messageObject = (MessageObject) ms0Var.f27281s.f11851i.get(i11);
                TL_stories.StoryItem storyItem = messageObject.storyItem;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    if (MessageObject.isVideoDocument(messageMedia.document)) {
                        i10++;
                    } else if (messageObject.storyItem.media.photo != null) {
                        i9++;
                    }
                }
            }
        } else {
            i9 = 0;
            i10 = 0;
        }
        if (i9 == 0 && i10 == 0) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        StringBuilder sb2 = new StringBuilder();
        if (i9 > 0) {
            sb2.append(LocaleController.formatPluralString("Images", i9, new Object[0]));
        }
        if (i10 > 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(LocaleController.formatPluralString("Videos", i10, new Object[0]));
        }
        return sb2.toString();
    }

    public final xs0 W(int i9) {
        int i10 = 0;
        while (true) {
            xs0[] xs0VarArr = this.f28137g0;
            if (i10 < xs0VarArr.length) {
                xs0 xs0Var = xs0VarArr[i10];
                if (xs0Var != null && xs0Var.B == i9) {
                    return xs0Var;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final void W0(f2.r0 r0Var) {
        if (r0Var instanceof yt0) {
            ArrayList arrayList = this.A0;
            ArrayList arrayList2 = this.B0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        } else if (r0Var == this.I) {
            ArrayList arrayList3 = this.C0;
            ArrayList arrayList4 = this.D0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
        } else {
            lt0 lt0Var = this.J;
            if (r0Var == lt0Var) {
                lt0Var.f30549r = null;
            }
        }
    }

    public final int X(int i9, int i10, boolean z10) {
        int i11;
        int i12 = 1;
        if (!z10) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        int i13 = i10 + i11;
        if (i13 > 6) {
            if (!z10) {
                i13 = 9;
            } else {
                i13 = 6;
            }
        }
        return Utilities.clamp(i13, 9, (this.f28138g1 && i9 == 1) ? 2 : 2);
    }

    public final void X0() {
        int i9;
        int i10 = 0;
        while (true) {
            xs0[] xs0VarArr = this.f28137g0;
            if (i10 < xs0VarArr.length) {
                dr0 dr0Var = xs0VarArr[i10].h;
                if (dr0Var != null) {
                    int i11 = 0;
                    int i12 = 0;
                    for (int i13 = 0; i13 < dr0Var.getChildCount(); i13++) {
                        View childAt = dr0Var.getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.r7) {
                            org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) childAt;
                            int messageId = r7Var.getMessageId();
                            i12 = r7Var.getTop();
                            i11 = messageId;
                        }
                        if (childAt instanceof org.telegram.ui.Cells.i7) {
                            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) childAt;
                            int id2 = i7Var.getMessage().getId();
                            i12 = i7Var.getTop();
                            i11 = id2;
                        }
                        if (childAt instanceof org.telegram.ui.Cells.h7) {
                            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                            i11 = h7Var.getMessage().getId();
                            i12 = h7Var.getTop();
                        }
                        if (i11 != 0) {
                            break;
                        }
                    }
                    if (i11 != 0) {
                        int i14 = xs0VarArr[i10].B;
                        int i15 = -1;
                        if (p0(i14)) {
                            bu0 k12 = k1(i14);
                            if (k12 != null && k12.f27281s != null) {
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= k12.f27281s.f11851i.size()) {
                                        break;
                                    } else if (i11 == ((MessageObject) k12.f27281s.f11851i.get(i16)).getId()) {
                                        i15 = i16;
                                        break;
                                    } else {
                                        i16++;
                                    }
                                }
                            }
                            i9 = i15;
                        } else if (i14 >= 0) {
                            tt0[] tt0VarArr = this.f28155p1;
                            if (i14 < tt0VarArr.length) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= tt0VarArr[i14].f32788a.size()) {
                                        break;
                                    } else if (i11 == ((MessageObject) tt0VarArr[i14].f32788a.get(i17)).getId()) {
                                        i15 = i17;
                                        break;
                                    } else {
                                        i17++;
                                    }
                                }
                                i9 = tt0VarArr[i14].f32798m + i15;
                            }
                        }
                        if (i15 >= 0) {
                            ((f2.m0) dr0Var.getLayoutManager()).h1(i9, (-xs0VarArr[i10].h.getPaddingTop()) + i12);
                            if (this.f28146k1) {
                                xs0 xs0Var = xs0VarArr[i10];
                                xs0Var.f34762s.h1(i9, (-xs0Var.h.getPaddingTop()) + i12);
                            }
                        }
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final int Y(boolean z10) {
        int i9;
        int i10 = this.T1;
        if (z10) {
            i9 = AndroidUtilities.dp(52.0f);
        } else {
            i9 = 0;
        }
        return i10 + i9;
    }

    public final void Y0(int i9) {
        ur0 ur0Var;
        if (!this.H1 && (ur0Var = this.E0) != null) {
            ur0Var.h(null, i9, ur0Var.L.get(i9));
        }
    }

    public final int Z(int i9) {
        float f10;
        int i10;
        int dp = AndroidUtilities.dp(54.0f) + this.X1;
        zq0 zq0Var = this.S;
        if (zq0Var != null && (w0(i9) || i9 == 8)) {
            f10 = zq0Var.getVisibilityFactor() * AndroidUtilities.dp(40.0f);
        } else {
            f10 = 0.0f;
        }
        int i11 = dp + ((int) f10);
        if (i9 == 9) {
            i10 = AndroidUtilities.dp(64.0f);
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public final void Z0(float f10, int i9) {
        int i10;
        ur0 ur0Var = this.E0;
        if (ur0Var != null) {
            if (w0(i9)) {
                i10 = 8;
            } else {
                i10 = i9;
            }
            ur0Var.j(f10, i10);
        }
        zq0 zq0Var = this.S;
        if (zq0Var != null) {
            m71 m71Var = zq0Var.f44301n;
            if (w0(i9)) {
                m71Var.f(f10, h1(i9));
            } else if (i9 == 8) {
                m71Var.f(f10, 0);
            }
        }
    }

    public final float a0(float f10) {
        int i9;
        int i10;
        int i11;
        int i12;
        float f11 = 0.0f;
        if (q0()) {
            return 0.0f;
        }
        xs0[] xs0VarArr = this.f28137g0;
        xs0 xs0Var = xs0VarArr[1];
        vq0 vq0Var = this.R;
        if (xs0Var != null && ((i11 = xs0Var.B) == 0 || (((i11 == 8 || w0(i11)) && TextUtils.isEmpty(getStoriesHashtag())) || (i12 = xs0VarArr[1].B) == 9 || i12 == 11 || i12 == 13 || (i12 == 14 && vq0Var != null)))) {
            f11 = 0.0f + f10;
        }
        xs0 xs0Var2 = xs0VarArr[0];
        if (xs0Var2 != null && ((i9 = xs0Var2.B) == 0 || (((i9 == 8 || w0(i9)) && TextUtils.isEmpty(getStoriesHashtag())) || (i10 = xs0VarArr[0].B) == 9 || i10 == 11 || i10 == 13 || (i10 == 14 && vq0Var != null)))) {
            return (1.0f - f10) + f11;
        }
        return f11;
    }

    public final void a1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i9 = 0;
        while (true) {
            xs0[] xs0VarArr = this.f28137g0;
            if (i9 < xs0VarArr.length) {
                xs0 xs0Var = xs0VarArr[i9];
                if (xs0Var.B != 7 || xs0Var.h.getAdapter() == null || xs0VarArr[i9].h.getAdapter().h() == 0 || this.f28160r1.getMessagesController().getStoriesController().f12243j.size() <= 0) {
                    i9++;
                } else {
                    return;
                }
            } else {
                if (this.B == 0) {
                    os0 os0Var = this.T;
                    os0Var.d = chatFull;
                    os0Var.f31437e = arrayList;
                }
                v1(true);
                for (int i10 = 0; i10 < xs0VarArr.length; i10++) {
                    xs0 xs0Var2 = xs0VarArr[i10];
                    if (xs0Var2.B == 7 && xs0Var2.h.getAdapter() != null) {
                        AndroidUtilities.notifyDataSetChanged(xs0VarArr[i10].h);
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
        xs0[] xs0VarArr = this.f28137g0;
        xs0 xs0Var = xs0VarArr[1];
        if (xs0Var != null && s0(xs0Var.B) && xs0VarArr[1].B != 11) {
            f11 = 0.0f + f10;
        }
        xs0 xs0Var2 = xs0VarArr[0];
        if (xs0Var2 != null && s0(xs0Var2.B) && xs0VarArr[0].B != 11) {
            return (1.0f - f10) + f11;
        }
        return f11;
    }

    public void b1(boolean z10) {
        float f10;
        if (this.f28178y1 != z10) {
            this.f28178y1 = z10;
            AnimatorSet animatorSet = this.J1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            z9 z9Var = this.f28174x0;
            if (z10) {
                z9Var.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.J1 = animatorSet2;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(z9Var, View.ALPHA, f10));
            this.J1.setDuration(180L);
            this.J1.addListener(new u9(19, this, z10));
            this.J1.start();
            if (z10) {
                u1();
            }
        }
    }

    public final int c0(int i9) {
        bu0 k12;
        ih.n6 n6Var;
        if (p0(i9) && (k12 = k1(i9)) != null && (n6Var = k12.f27281s) != null) {
            return n6Var.g();
        }
        return 0;
    }

    public final void c1(int r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.eu0.c1(int, boolean):void");
    }

    public final void d1(int i9) {
        int h12 = h1(getClosestTab());
        zq0 zq0Var = this.S;
        if (h12 != i9) {
            if (zq0Var != null) {
                zq0Var.f44301n.d(i9, zq0Var.f44303s.i(i9));
                return;
            }
            return;
        }
        zq0Var.setReorderingAlbums(true);
        du0 i12 = i1(i9);
        xs0 W = W(i12.f27810a);
        if (W == null) {
            return;
        }
        dr0 dr0Var = W.h;
        for (int i10 = 0; i10 < dr0Var.getChildCount(); i10++) {
            View childAt = dr0Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.r7) {
                ((org.telegram.ui.Cells.r7) childAt).l(true, true);
            }
        }
        cu0 cu0Var = i12.f27812c;
        if (cu0Var != null && !cu0Var.f27283x) {
            cu0Var.f27283x = true;
        }
        q1(true);
    }

    @Override
    public final void didReceivedNotification(int r42, int r43, java.lang.Object... r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.eu0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ur0 ur0Var = this.E0;
        if (ur0Var != null) {
            canvas.save();
            canvas.translate(ur0Var.getX(), ur0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        qr0 qr0Var = this.N0;
        if (qr0Var != null) {
            int i9 = qr0Var.P;
            if ((i9 == 3 || i9 == 1) && this.L0 == null) {
                canvas.save();
                canvas.translate(qr0Var.getX(), qr0Var.getY());
                qr0Var.setDrawOverlay(true);
                qr0Var.draw(canvas);
                qr0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i9;
        if (view == this.N0 && this.L0 == null) {
            canvas.save();
            xs0[] xs0VarArr = this.f28137g0;
            float top = xs0VarArr[0].getTop();
            zq0 zq0Var = this.S;
            if (zq0Var != null && ((i9 = xs0VarArr[0].B) == 8 || w0(i9))) {
                top -= zq0Var.getVisualHeight();
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
        int i9;
        org.telegram.ui.ActionBar.o2 o2Var = this.f28160r1;
        if (o2Var != null && o2Var.getMessagesController().getStoriesController().I(r2Var.getDialogId())) {
            o2Var.getOrCreateStoryViewer().getClass();
            ih.m9 orCreateStoryViewer = o2Var.getOrCreateStoryViewer();
            Context context = o2Var.getContext();
            long dialogId = r2Var.getDialogId();
            ih.e7 a3 = ih.e7.a((wk0) r2Var.getParent());
            if ((o2Var instanceof ProfileActivity) && ((ProfileActivity) o2Var).f36019o1) {
                i9 = AndroidUtilities.dp(68.0f);
            } else {
                i9 = 0;
            }
            a3.f11374s += i9;
            orCreateStoryViewer.D(context, dialogId, a3);
        }
    }

    public final void e1(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.eu0.e1(boolean):void");
    }

    public final float f0(int i9, boolean z10) {
        float width = getWidth();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            xs0[] xs0VarArr = this.f28137g0;
            if (i10 >= xs0VarArr.length) {
                break;
            }
            xs0 xs0Var = xs0VarArr[i10];
            if (xs0Var != null) {
                int i12 = xs0Var.B;
                if ((z10 && i9 == 8 && w0(i12)) || i12 == i9) {
                    i11++;
                    width = xs0VarArr[i10].getTranslationX();
                }
            }
            i10++;
        }
        if (i11 == 2) {
            return 0.0f;
        }
        return width;
    }

    public final void f1() {
        int i9 = 0;
        while (true) {
            xs0[] xs0VarArr = this.f28137g0;
            if (i9 < xs0VarArr.length) {
                int childCount = xs0VarArr[i9].h.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = xs0VarArr[i9].h.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.e2) {
                        ImageReceiver photoImage = ((org.telegram.ui.Cells.e2) childAt).getPhotoImage();
                        if (i9 == 0) {
                            photoImage.setAllowStartAnimation(true);
                            photoImage.startAnimation();
                        } else {
                            photoImage.setAllowStartAnimation(false);
                            photoImage.stopAnimation();
                        }
                    }
                }
                i9++;
            } else {
                return;
            }
        }
    }

    public final float g0(int i9, boolean z10) {
        float f10 = 0.0f;
        int i10 = 0;
        while (true) {
            xs0[] xs0VarArr = this.f28137g0;
            if (i10 < xs0VarArr.length) {
                xs0 xs0Var = xs0VarArr[i10];
                if (xs0Var != null) {
                    int i11 = xs0Var.B;
                    if ((z10 && i9 == 8 && w0(i11)) || i11 == i9) {
                        f10 = (1.0f - Math.abs(xs0VarArr[i10].getTranslationX() / getWidth())) + f10;
                    }
                }
                i10++;
            } else {
                return f10;
            }
        }
    }

    public final void g1(MotionEvent motionEvent) {
        float f10;
        float f11;
        boolean z10;
        float measuredWidth;
        xs0 xs0Var;
        xs0 xs0Var2;
        int measuredWidth2;
        xs0 xs0Var3;
        xs0 xs0Var4;
        boolean z11;
        VelocityTracker velocityTracker = this.f28175x1;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.O0);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f10 = this.f28175x1.getXVelocity();
                f11 = this.f28175x1.getYVelocity();
                if (!this.f28165t1 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                    if (f10 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    U0(motionEvent, z11);
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (this.f28165t1) {
                xs0[] xs0VarArr = this.f28137g0;
                float x10 = xs0VarArr[0].getX();
                this.f28125b1 = new AnimatorSet();
                if (Math.abs(x10) < xs0VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f28133e1 = z10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new q60(this, 19));
                boolean z12 = this.f28133e1;
                Property property = View.TRANSLATION_X;
                if (z12) {
                    measuredWidth = Math.abs(x10);
                    if (this.f28130d1) {
                        this.f28125b1.playTogether(ObjectAnimator.ofFloat(xs0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(xs0VarArr[1], property, xs0Var4.getMeasuredWidth()), ofFloat);
                    } else {
                        this.f28125b1.playTogether(ObjectAnimator.ofFloat(xs0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(xs0VarArr[1], property, -xs0Var3.getMeasuredWidth()), ofFloat);
                    }
                } else {
                    measuredWidth = xs0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                    if (this.f28130d1) {
                        this.f28125b1.playTogether(ObjectAnimator.ofFloat(xs0VarArr[0], property, -xs0Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(xs0VarArr[1], property, 0.0f), ofFloat);
                    } else {
                        this.f28125b1.playTogether(ObjectAnimator.ofFloat(xs0VarArr[0], property, xs0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(xs0VarArr[1], property, 0.0f), ofFloat);
                    }
                }
                this.f28125b1.setInterpolator(a2);
                int measuredWidth3 = getMeasuredWidth();
                float f12 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f12) + f12;
                float abs = Math.abs(f10);
                if (abs > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                this.f28125b1.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                this.f28125b1.addListener(new xr0(this, 1));
                this.f28125b1.start();
                this.f28128c1 = true;
                this.f28165t1 = false;
                L0();
            } else {
                this.f28167u1 = false;
                this.C.setEnabled(true);
                this.E0.setEnabled(true);
            }
            VelocityTracker velocityTracker2 = this.f28175x1;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f28175x1 = null;
            }
        }
    }

    public SparseArray<MessageObject> getActionModeSelected() {
        return this.V0[0];
    }

    public float getBottomButtonStoriesVisibility() {
        xs0 xs0Var;
        xs0 xs0Var2;
        boolean z10;
        boolean z11;
        ih.n6 n6Var;
        ih.n6 n6Var2;
        float f10 = 1.0f;
        xs0[] xs0VarArr = this.f28137g0;
        if (xs0VarArr == null || (xs0Var = xs0VarArr[0]) == null || (xs0Var2 = xs0VarArr[1]) == null || xs0Var.f34763w == null || xs0Var2.f34763w == null) {
            return 1.0f;
        }
        int i9 = xs0Var.B;
        int i10 = xs0Var2.B;
        if (!w0(i9) && i9 != 8) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!w0(i10) && i10 != 8) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z10 && !z11) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - xs0VarArr[0].f34763w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - xs0VarArr[1].f34763w.getVisibilityFactor();
        bu0 k12 = k1(xs0VarArr[0].B);
        if (i9 == 8 || (k12 != null && (n6Var2 = k12.f27281s) != null && n6Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        bu0 k13 = k1(i10);
        if (i10 != 8 && (k13 == null || (n6Var = k13.f27281s) == null || n6Var.g() <= 0)) {
            f10 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f10;
        }
        if (!z11) {
            f10 = visibilityFactor;
        }
        return AndroidUtilities.lerp(visibilityFactor, f10, Math.abs(xs0VarArr[0].getTranslationX() / xs0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        xs0[] xs0VarArr = this.f28137g0;
        xs0 xs0Var = xs0VarArr[1];
        if (xs0Var != null && xs0Var.getVisibility() == 0) {
            if (this.f28128c1 && !this.f28133e1) {
                return xs0VarArr[1].B;
            }
            if (Math.abs(xs0VarArr[1].getTranslationX()) < xs0VarArr[1].getMeasuredWidth() / 2.0f) {
                return xs0VarArr[1].B;
            }
        }
        return getSelectedTab();
    }

    public wk0 getCurrentListView() {
        ks0 ks0Var;
        xs0 xs0Var = this.f28137g0[0];
        int i9 = xs0Var.B;
        if (i9 == 13) {
            return this.Q.getCurrentListView();
        }
        if (i9 == 14) {
            return this.R.getCurrentListView();
        }
        if (i9 == 12 && (ks0Var = this.P) != null) {
            return ks0Var.f42731a.f42077t0;
        }
        return xs0Var.h;
    }

    public int getInitialTab() {
        return 0;
    }

    public int getPhotosVideosTypeFilter() {
        return this.f28155p1[0].f32802q;
    }

    public TextView getSaveItem() {
        return this.m0;
    }

    public org.telegram.ui.ActionBar.w0 getSearchItem() {
        return this.f28143j0;
    }

    public pi0 getSearchOptionsItem() {
        return this.f28152o0;
    }

    public int getSelectedTab() {
        int currentTabId = this.E0.getCurrentTabId();
        zq0 zq0Var = this.S;
        if (zq0Var != null && currentTabId == 8) {
            int currentAlbumId = zq0Var.getCurrentAlbumId();
            if (currentAlbumId == 0) {
                return 8;
            }
            if (currentAlbumId > 0) {
                return i1(currentAlbumId).f27810a;
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
        int i9 = 0;
        while (true) {
            xs0[] xs0VarArr = this.f28137g0;
            if (i9 < xs0VarArr.length) {
                xs0 xs0Var = xs0VarArr[i9];
                if (xs0Var != null) {
                    f10 = ((1.0f - Math.abs(xs0Var.getTranslationX() / getWidth())) * xs0Var.B) + f10;
                }
                i9++;
            } else {
                return f10;
            }
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.h6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.h6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f28171w0, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.f23386z6));
        org.telegram.ui.ActionBar.w0 w0Var = this.f28139h0;
        pi0 iconView = w0Var.getIconView();
        int i9 = org.telegram.ui.ActionBar.f6.f23371y8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(iconView, 8, null, null, null, null, i9));
        int i10 = org.telegram.ui.ActionBar.f6.f23388z8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var, 32, null, null, null, null, i10));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f28156q0;
        if (w0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var2.getIconView(), 8, null, null, null, null, i9));
            arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var2, 32, null, null, null, null, i10));
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f28154p0;
        if (w0Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var3.getIconView(), 8, null, null, null, null, i9));
            arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var3, 32, null, null, null, null, i10));
        }
        Drawable[] drawableArr = {this.f28179z0};
        ImageView imageView = this.f28177y0;
        arrayList.add(new org.telegram.ui.ActionBar.h6(imageView, 8, null, null, drawableArr, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(imageView, 32, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.f6.f23001d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f28174x0, 1, null, null, null, null, i11));
        ur0 ur0Var = this.E0;
        arrayList.add(new org.telegram.ui.ActionBar.h6(ur0Var, 1, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.f6.f23339wc;
        org.telegram.ui.Cells.w0 w0Var4 = this.G0;
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var4, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var4, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f23133kd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ur0Var, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Gh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ur0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.f6.Fh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ur0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.f6.Eh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(ur0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.f6.Hh));
        qr0 qr0Var = this.N0;
        if (qr0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(qr0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23320v7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(qr0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23335w7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(qr0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23304u7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(qr0Var, 33554436, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23286t7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(qr0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23352x7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(qr0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23370y7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(qr0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.A7));
        }
        final int i13 = 0;
        while (true) {
            xs0[] xs0VarArr = this.f28137g0;
            if (i13 < xs0VarArr.length) {
                org.telegram.ui.ActionBar.g6 g6Var = new org.telegram.ui.ActionBar.g6() {
                    @Override
                    public final void b() {
                        xs0[] xs0VarArr2 = eu0.this.f28137g0;
                        int i14 = i13;
                        dr0 dr0Var = xs0VarArr2[i14].h;
                        if (dr0Var != null) {
                            int childCount = dr0Var.getChildCount();
                            for (int i15 = 0; i15 < childCount; i15++) {
                                View childAt = xs0VarArr2[i14].h.getChildAt(i15);
                                if (childAt instanceof org.telegram.ui.Cells.s7) {
                                    org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) childAt;
                                    for (int i16 = 0; i16 < 6; i16++) {
                                        s7Var.f25280a[i16].f24835e.invalidate();
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
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
                mr0 mr0Var = xs0VarArr[i13].v;
                int i14 = org.telegram.ui.ActionBar.f6.f23001d6;
                arrayList.add(new org.telegram.ui.ActionBar.h6(mr0Var, 0, null, null, null, null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].f34763w, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.f22984c7));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 524288, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23038f7));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 524304, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23020e7));
                int i15 = org.telegram.ui.ActionBar.f6.f23073h6;
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 4, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.uh));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23162m6));
                int i16 = org.telegram.ui.ActionBar.f6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"nameTextView"}, null, null, -1, null, i16));
                int i17 = org.telegram.ui.ActionBar.f6.f23369y6;
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, null, null, -1, g6Var, i17));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, null, null, -1, g6Var, org.telegram.ui.ActionBar.f6.f23179n6));
                Drawable[] drawableArr2 = org.telegram.ui.ActionBar.f6.f23242r0;
                int i18 = org.telegram.ui.ActionBar.f6.J7;
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.va.class}, null, drawableArr2, null, i18));
                TextPaint[] textPaintArr = org.telegram.ui.ActionBar.f6.B0;
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.f6.D0}, null, -1, null, org.telegram.ui.ActionBar.f6.X8));
                TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.f6.C0;
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.f6.E0}, null, -1, null, org.telegram.ui.ActionBar.f6.Z8));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.h6.class}, null, drawableArr2, null, i18));
                arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.O7));
                arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.P7));
                arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.Q7));
                arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.R7));
                arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.S7));
                arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.T7));
                arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, org.telegram.ui.ActionBar.f6.U7));
                int i19 = org.telegram.ui.ActionBar.f6.f23386z6;
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 4, new Class[]{rs0.class}, new String[]{"emptyTextView"}, null, null, -1, null, i19));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"nameTextView"}, null, null, -1, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.A6));
                int i20 = org.telegram.ui.ActionBar.f6.Ih;
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 2048, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"progressView"}, null, null, -1, null, i20));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"statusImageView"}, null, null, -1, null, i20));
                int i21 = org.telegram.ui.ActionBar.f6.f23093i7;
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i21));
                int i22 = org.telegram.ui.ActionBar.f6.f23128k7;
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.zi));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Bi));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, i21));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.f6.f23034f3, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.f6.f23052g3, null, null, i19));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 8192, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, null, null, -1, null, i21));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 16384, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.l7.class}, null, null, null, org.telegram.ui.ActionBar.f6.J6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.l7.class}, org.telegram.ui.ActionBar.f6.m0, null, null, org.telegram.ui.ActionBar.f6.K6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Kh));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 32, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Jh));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 524304, new Class[]{org.telegram.ui.Cells.m7.class}, null, null, null, i14));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 524288, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"textView"}, null, null, -1, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"textView"}, null, null, -1, null, i16));
                int i23 = org.telegram.ui.ActionBar.f6.Lh;
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.s7.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i23));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 8192, new Class[]{org.telegram.ui.Cells.s7.class}, null, null, g6Var, i21));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 16384, new Class[]{org.telegram.ui.Cells.s7.class}, null, null, g6Var, i22));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, new Class[]{org.telegram.ui.Cells.e2.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i23));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 8192, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, g6Var, i21));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 16384, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, g6Var, i22));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].h, 0, null, null, new Drawable[]{this.f28166u0}, null, org.telegram.ui.ActionBar.f6.f22966b7));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].f34763w.d, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.h6(xs0VarArr[i13].f34763w.f28885e, 4, null, null, null, null, i17));
                i13++;
            } else {
                return arrayList;
            }
        }
    }

    public final int h0(int i9) {
        org.telegram.ui.ActionBar.b6 b6Var = this.B1;
        if (b6Var != null) {
            return b6Var.N0(i9);
        }
        return org.telegram.ui.ActionBar.f6.w0(null, i9, false);
    }

    public final int h1(int i9) {
        du0 j12 = j1(i9);
        if (j12 == null) {
            return -1;
        }
        return j12.f27811b;
    }

    public final boolean i0() {
        if (this.f28160r1.getConnectionsManager().getConnectionState() == 3) {
            return true;
        }
        return false;
    }

    public final du0 i1(int i9) {
        Integer valueOf = Integer.valueOf(i9);
        HashMap hashMap = this.U1;
        du0 du0Var = (du0) hashMap.get(valueOf);
        if (du0Var == null) {
            du0 du0Var2 = new du0(this, getContext(), i9);
            hashMap.put(Integer.valueOf(i9), du0Var2);
            this.V1.put(Integer.valueOf(du0Var2.f27810a), Integer.valueOf(i9));
            return du0Var2;
        }
        return du0Var;
    }

    public final boolean j0() {
        SparseArray[] sparseArrayArr;
        MessageObject messageObject;
        TLRPC.Message message;
        boolean z10 = false;
        for (int i9 = 1; i9 >= 0; i9--) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                sparseArrayArr = this.V0;
                if (i10 >= sparseArrayArr[i9].size()) {
                    break;
                }
                arrayList.add(Integer.valueOf(sparseArrayArr[i9].keyAt(i10)));
                i10++;
            }
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                Object obj = arrayList.get(i11);
                i11++;
                Integer num = (Integer) obj;
                if (num.intValue() > 0 && (messageObject = (MessageObject) sparseArrayArr[i9].get(num.intValue())) != null && (message = messageObject.messageOwner) != null && message.noforwards) {
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

    public final du0 j1(int i9) {
        Integer num = (Integer) this.V1.get(Integer.valueOf(i9));
        if (num == null) {
            return null;
        }
        return (du0) this.U1.get(num);
    }

    public final void k0() {
        AndroidUtilities.cancelRunOnUIThread(this.I0);
        org.telegram.ui.Cells.w0 w0Var = this.G0;
        if (w0Var.getTag() == null) {
            return;
        }
        w0Var.setTag(null);
        AnimatorSet animatorSet = this.H0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.H0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.H0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.H0.playTogether(ObjectAnimator.ofFloat(w0Var, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(w0Var, View.TRANSLATION_Y, (-AndroidUtilities.dp(48.0f)) + this.K0));
        this.H0.setInterpolator(gr.f28845g);
        this.H0.addListener(new xr0(this, 0));
        this.H0.start();
    }

    public final bu0 k1(int i9) {
        du0 j12;
        if (i9 == 8) {
            return this.V;
        }
        if (i9 == 9) {
            return this.f28121a0;
        }
        if (w0(i9) && (j12 = j1(i9)) != null) {
            return j12.f27812c;
        }
        return null;
    }

    public boolean l0() {
        return false;
    }

    public final bu0 l1(int i9) {
        du0 j12;
        if (i9 == 8) {
            return this.W;
        }
        if (i9 == 9) {
            return this.f28124b0;
        }
        if (!w0(i9) || (j12 = j1(i9)) == null) {
            return null;
        }
        return j12.d;
    }

    public boolean m0() {
        return !(this instanceof i30);
    }

    public final void m1(boolean z10) {
        xs0[] xs0VarArr;
        xs0[] xs0VarArr2;
        f2.f1 f1Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        float f10;
        int i9;
        float f11;
        float f12;
        boolean z15;
        tt0[] tt0VarArr;
        String str;
        ?? r52;
        int i10;
        int i11;
        boolean z16;
        boolean z17;
        boolean z18;
        int i12;
        int i13;
        int i14;
        String str2;
        boolean z19;
        int i15;
        boolean z20;
        f2.f1 f1Var2;
        String str3;
        int i16;
        int i17;
        boolean z21;
        int i18;
        int i19;
        boolean z22;
        int i20;
        vq0 vq0Var = this.R;
        if (vq0Var != null) {
            vq0Var.i();
        }
        int i21 = 0;
        while (true) {
            xs0VarArr = this.f28137g0;
            if (i21 >= xs0VarArr.length) {
                break;
            }
            xs0VarArr[i21].h.B0();
            i21++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) xs0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = AndroidUtilities.dp(B0());
        f2.r0 adapter = xs0VarArr[z10 ? 1 : 0].h.getAdapter();
        f2.r0 r0Var = this.V;
        f2.h0 h0Var = this.U;
        if (adapter == r0Var) {
            h0Var.d(null);
        }
        boolean z23 = this.R0;
        qs0 qs0Var = this.f28180z1;
        String str4 = "";
        lt0 lt0Var = this.J;
        org.telegram.ui.ActionBar.w0 w0Var = this.f28143j0;
        int i22 = 100;
        if (z23 && this.Q0) {
            xs0 xs0Var = xs0VarArr[z10 ? 1 : 0];
            if (xs0Var.f34759f == null) {
                xs0Var.f34759f = new f2.f1();
            }
            xs0 xs0Var2 = xs0VarArr[z10 ? 1 : 0];
            f1Var2 = xs0Var2.f34759f;
            pt0 pt0Var = this.O;
            vs0 vs0Var = this.f28135f0;
            at0 at0Var = this.f28129d0;
            at0 at0Var2 = this.f28132e0;
            at0 at0Var3 = this.f28127c0;
            if (z10) {
                int i23 = xs0Var2.B;
                if (i23 != 0 && i23 != 2 && i23 != 5 && i23 != 6 && (i23 != 7 || qs0Var.S())) {
                    if (w0Var != null) {
                        str4 = w0Var.getSearchField().getText().toString();
                    }
                    int i24 = xs0VarArr[z10 ? 1 : 0].B;
                    if (i24 == 1) {
                        if (at0Var3 != null) {
                            at0Var3.G(str4, false);
                            if (adapter != at0Var3) {
                                W0(adapter);
                                xs0VarArr[z10 ? 1 : 0].h.setAdapter(at0Var3);
                            }
                        }
                    } else if (i24 == 3) {
                        if (at0Var2 != null) {
                            at0Var2.G(str4, false);
                            if (adapter != at0Var2) {
                                W0(adapter);
                                xs0VarArr[z10 ? 1 : 0].h.setAdapter(at0Var2);
                            }
                        }
                    } else if (i24 == 4) {
                        if (at0Var != null) {
                            at0Var.G(str4, false);
                            if (adapter != at0Var) {
                                W0(adapter);
                                xs0VarArr[z10 ? 1 : 0].h.setAdapter(at0Var);
                            }
                        }
                    } else if (i24 == 7) {
                        if (vs0Var != null) {
                            vs0Var.F(str4, false);
                            if (adapter != vs0Var) {
                                W0(adapter);
                                xs0VarArr[z10 ? 1 : 0].h.setAdapter(vs0Var);
                            }
                        }
                    } else if (i24 == 11) {
                        if (pt0Var != null) {
                            pt0Var.E(this.S0, str4);
                            if (adapter != pt0Var) {
                                W0(adapter);
                                xs0VarArr[z10 ? 1 : 0].h.setAdapter(pt0Var);
                            }
                        }
                    } else if (i24 == 15 && lt0Var != null && adapter != lt0Var) {
                        W0(adapter);
                        dr0 dr0Var = xs0VarArr[z10 ? 1 : 0].h;
                        lt0Var.f30549r = dr0Var;
                        dr0Var.setAdapter(lt0Var);
                    }
                } else {
                    this.R0 = false;
                    rr0 rr0Var = this.F0;
                    if (rr0Var != null) {
                        rr0Var.g(false);
                    }
                    this.Q0 = false;
                    m1(true);
                    return;
                }
            } else if (xs0Var2.h != null) {
                int i25 = xs0Var2.B;
                if (i25 == 1) {
                    if (adapter != at0Var3) {
                        W0(adapter);
                        xs0VarArr[z10 ? 1 : 0].h.setAdapter(at0Var3);
                    }
                    at0Var3.l();
                } else if (i25 == 3) {
                    if (adapter != at0Var2) {
                        W0(adapter);
                        xs0VarArr[z10 ? 1 : 0].h.setAdapter(at0Var2);
                    }
                    at0Var2.l();
                } else if (i25 == 4) {
                    if (adapter != at0Var) {
                        W0(adapter);
                        xs0VarArr[z10 ? 1 : 0].h.setAdapter(at0Var);
                    }
                    at0Var.l();
                } else if (i25 == 7) {
                    if (adapter != vs0Var) {
                        W0(adapter);
                        xs0VarArr[z10 ? 1 : 0].h.setAdapter(vs0Var);
                    }
                    vs0Var.l();
                } else if (i25 == 11) {
                    if (adapter != pt0Var) {
                        W0(adapter);
                        xs0VarArr[z10 ? 1 : 0].h.setAdapter(pt0Var);
                    }
                    pt0Var.l();
                }
            }
            xs0VarArr2 = xs0VarArr;
            z20 = false;
            z19 = false;
            i15 = 100;
        } else {
            xs0 xs0Var3 = xs0VarArr[z10 ? 1 : 0];
            if (xs0Var3.f34758e == null) {
                xs0Var3.f34758e = new f2.f1();
            }
            xs0 xs0Var4 = xs0VarArr[z10 ? 1 : 0];
            f2.f1 f1Var3 = xs0Var4.f34758e;
            xs0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i26 = xs0VarArr[z10 ? 1 : 0].B;
            if (i26 == 8 || w0(i26)) {
                layoutParams.topMargin = AndroidUtilities.dp(B0());
            }
            dr0 dr0Var2 = xs0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = dr0Var2.getPaddingLeft();
            xs0 xs0Var5 = xs0VarArr[z10 ? 1 : 0];
            dr0 dr0Var3 = xs0Var5.h;
            int Z = Z(xs0Var5.B);
            dr0Var3.Z2 = Z;
            int paddingRight = xs0VarArr[z10 ? 1 : 0].h.getPaddingRight();
            xs0VarArr2 = xs0VarArr;
            dr0 dr0Var4 = xs0VarArr2[z10 ? 1 : 0].h;
            int Y = Y(v0());
            dr0Var4.a3 = Y;
            dr0Var2.setPadding(paddingLeft, Z, paddingRight, Y);
            int i27 = xs0VarArr2[z10 ? 1 : 0].B;
            int[] iArr = this.f28142i1;
            f2.r0 r0Var2 = this.G;
            View view = this.Q;
            ks0 ks0Var = this.P;
            ot0 ot0Var = this.N;
            ps0 ps0Var = this.L;
            tt0[] tt0VarArr2 = this.f28155p1;
            if (i27 == 0) {
                f2.r0 r0Var3 = this.D;
                if (adapter != r0Var3) {
                    W0(adapter);
                    xs0VarArr2[z10 ? 1 : 0].h.setAdapter(r0Var3);
                }
                int i28 = -AndroidUtilities.dp(1.0f);
                layoutParams.rightMargin = i28;
                layoutParams.leftMargin = i28;
                tt0 tt0Var = tt0VarArr2[0];
                if (tt0Var.h && !tt0Var.f32791e.isEmpty()) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                i22 = iArr[0];
                xs0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.f28166u0);
                tt0 tt0Var2 = tt0VarArr2[0];
                if (tt0Var2.f32808x == null) {
                    tt0Var2.f32808x = new f2.f1();
                }
                z13 = z22;
                f1Var = tt0VarArr2[0].f32808x;
                z11 = false;
            } else {
                if (i27 == 1) {
                    tt0 tt0Var3 = tt0VarArr2[1];
                    if (tt0Var3.h && !tt0Var3.f32791e.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (adapter != r0Var2) {
                        W0(adapter);
                        xs0VarArr2[z10 ? 1 : 0].h.setAdapter(r0Var2);
                    }
                } else if (i27 == 2) {
                    tt0 tt0Var4 = tt0VarArr2[2];
                    if (tt0Var4.h && !tt0Var4.f32791e.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (adapter != this.H) {
                        W0(adapter);
                        xs0VarArr2[z10 ? 1 : 0].h.setAdapter(this.H);
                    }
                } else {
                    if (i27 == 3) {
                        if (adapter != this.F) {
                            W0(adapter);
                            xs0VarArr2[z10 ? 1 : 0].h.setAdapter(this.F);
                        }
                    } else if (i27 == 4) {
                        tt0 tt0Var5 = tt0VarArr2[4];
                        if (tt0Var5.h && !tt0Var5.f32791e.isEmpty()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (adapter != this.I) {
                            W0(adapter);
                            xs0VarArr2[z10 ? 1 : 0].h.setAdapter(this.I);
                        }
                    } else {
                        if (i27 == 5) {
                            if (adapter != this.K) {
                                W0(adapter);
                                xs0VarArr2[z10 ? 1 : 0].h.setAdapter(this.K);
                            }
                        } else if (i27 == 15) {
                            if (adapter != lt0Var) {
                                W0(adapter);
                                dr0 dr0Var5 = xs0VarArr2[z10 ? 1 : 0].h;
                                lt0Var.f30549r = dr0Var5;
                                dr0Var5.setAdapter(lt0Var);
                            }
                        } else if (i27 == 6) {
                            if (adapter != ps0Var) {
                                W0(adapter);
                                xs0VarArr2[z10 ? 1 : 0].h.setAdapter(ps0Var);
                            }
                        } else if (i27 == 7) {
                            if (adapter != this.T) {
                                W0(adapter);
                                xs0VarArr2[z10 ? 1 : 0].h.setAdapter(this.T);
                            }
                        } else if (p0(i27)) {
                            f2.r0 k12 = k1(xs0VarArr2[z10 ? 1 : 0].B);
                            if (adapter != k12) {
                                W0(adapter);
                                xs0VarArr2[z10 ? 1 : 0].h.setAdapter(k12);
                                xs0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            xs0 xs0Var6 = xs0VarArr2[z10 ? 1 : 0];
                            if (xs0Var6.B != 9) {
                                h0Var.d(xs0Var6.h);
                            }
                            i22 = iArr[1];
                        } else {
                            int i29 = xs0VarArr2[z10 ? 1 : 0].B;
                            if (i29 == 10) {
                                if (adapter != this.M) {
                                    W0(adapter);
                                    xs0VarArr2[z10 ? 1 : 0].h.setAdapter(this.M);
                                }
                            } else if (i29 == 11) {
                                if (adapter != ot0Var) {
                                    W0(adapter);
                                    xs0VarArr2[z10 ? 1 : 0].h.setAdapter(ot0Var);
                                    f2.h0 h0Var2 = ot0Var.v;
                                    dr0 dr0Var6 = xs0VarArr2[z10 ? 1 : 0].h;
                                    ot0Var.f31444s = dr0Var6;
                                    h0Var2.d(dr0Var6);
                                }
                                f1Var = ot0Var.f31443r;
                                z11 = true;
                                z13 = false;
                            } else if (i29 == 12) {
                                if (adapter != null) {
                                    W0(adapter);
                                    xs0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (ks0Var.getParent() != xs0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(ks0Var);
                                    xs0VarArr2[z10 ? 1 : 0].addView(ks0Var, g7.e6.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                }
                            } else if (i29 == 13) {
                                if (adapter != null) {
                                    W0(adapter);
                                    xs0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != xs0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(view);
                                    xs0VarArr2[z10 ? 1 : 0].addView(view);
                                }
                            } else if (i29 == 14) {
                                if (adapter != null) {
                                    W0(adapter);
                                    xs0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (vq0Var != null && vq0Var.getParent() != xs0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(vq0Var);
                                    xs0VarArr2[z10 ? 1 : 0].addView(vq0Var);
                                    xs0VarArr2[z10 ? 1 : 0].f34763w.setVisibility(4);
                                }
                            }
                        }
                        f1Var = f1Var3;
                        z11 = false;
                        z13 = false;
                    }
                    f1Var = f1Var3;
                    z11 = true;
                    z13 = false;
                }
                z13 = z12;
                f1Var = f1Var3;
                z11 = true;
            }
            int i30 = xs0VarArr2[z10 ? 1 : 0].B;
            if (i30 != 0 && !p0(i30)) {
                z14 = false;
            } else {
                z14 = true;
            }
            mr0 mr0Var = xs0VarArr2[z10 ? 1 : 0].v;
            if (z14) {
                f10 = 0.0f;
            } else {
                f10 = 12.0f;
            }
            if (z14) {
                i9 = 8;
            } else {
                i9 = 12;
            }
            f2.f1 f1Var4 = f1Var;
            float f13 = i9 + 48;
            if (z14) {
                f11 = 0.0f;
            } else {
                f11 = 12.0f;
            }
            if (z14) {
                f12 = 0.0f;
            } else {
                f12 = 12.0f;
            }
            mr0Var.setLayoutParams(g7.e6.d(-1, -1.0f, 119, f10, f13, f11, f12));
            if (z11) {
                xs0VarArr2[z10 ? 1 : 0].h.setSections(false);
            } else {
                dr0 dr0Var7 = xs0VarArr2[z10 ? 1 : 0].h;
                dr0Var7.getClass();
                dr0Var7.setSelectorDrawableColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, dr0Var7.f34260l2));
                dr0Var7.E2 = null;
                dr0Var7.H2 = 0.0f;
                dr0Var7.I2 = null;
                dr0Var7.J2 = null;
                dr0Var7.F2 = null;
                kk0 kk0Var = dr0Var7.D2;
                if (kk0Var != null) {
                    dr0Var7.p0(kk0Var);
                    dr0Var7.D2 = null;
                }
            }
            xs0 xs0Var7 = xs0VarArr2[z10 ? 1 : 0];
            int i31 = xs0Var7.B;
            org.telegram.ui.ActionBar.o2 o2Var = this.f28160r1;
            if (i31 == 15) {
                z15 = z13;
                tt0VarArr = tt0VarArr2;
                str = "";
                xs0Var7.setBackground(kh.r6.e(xs0Var7.getBackground(), o2Var.getCurrentAccount(), this.f28136f1, org.telegram.ui.ActionBar.f6.I.q()));
                xs0VarArr2[z10 ? 1 : 0].setOutlineProvider(new bg.q1(14));
                xs0VarArr2[z10 ? 1 : 0].setClipToOutline(true);
                r52 = 0;
            } else {
                z15 = z13;
                tt0VarArr = tt0VarArr2;
                str = "";
                xs0Var7.setClipToOutline(false);
                r52 = 0;
                xs0VarArr2[z10 ? 1 : 0].setBackground(null);
            }
            xs0 xs0Var8 = xs0VarArr2[z10 ? 1 : 0];
            if (xs0Var8.B == 11) {
                xs0Var8.h.setItemAnimator(xs0Var8.d);
            } else {
                xs0Var8.h.setItemAnimator(r52);
                if (ot0Var != null && xs0VarArr2[z10 ? 1 : 0].h == ot0Var.f31444s) {
                    f2.h0 h0Var3 = ot0Var.v;
                    ot0Var.f31444s = r52;
                    h0Var3.d(r52);
                }
            }
            if (ks0Var != null && xs0VarArr2[z10 ? 1 : 0].B != 12 && ks0Var.getParent() == xs0VarArr2[z10 ? 1 : 0]) {
                ks0Var.f42731a.onRemoveFromParent();
                xs0VarArr2[z10 ? 1 : 0].removeView(ks0Var);
            }
            if (view != null && xs0VarArr2[z10 ? 1 : 0].B != 13) {
                ViewParent parent = view.getParent();
                xs0 xs0Var9 = xs0VarArr2[z10 ? 1 : 0];
                if (parent == xs0Var9) {
                    xs0Var9.removeView(view);
                }
            }
            if (vq0Var != null && xs0VarArr2[z10 ? 1 : 0].B != 14) {
                ViewParent parent2 = vq0Var.getParent();
                xs0 xs0Var10 = xs0VarArr2[z10 ? 1 : 0];
                if (parent2 == xs0Var10) {
                    xs0Var10.removeView(vq0Var);
                }
            }
            int i32 = xs0VarArr2[z10 ? 1 : 0].B;
            if (i32 != 0 && i32 != 11 && !p0(i32) && (i16 = xs0VarArr2[z10 ? 1 : 0].B) != 2 && i16 != 5 && i16 != 6 && ((i16 != 7 || qs0Var.S()) && (i17 = xs0VarArr2[z10 ? 1 : 0].B) != 10 && i17 != 13 && i17 != 14)) {
                if (z10) {
                    if (w0Var != null && w0Var.getVisibility() == 4 && !this.C.f23577j0) {
                        if (D()) {
                            this.f28164t0 = 1;
                            w0Var.setVisibility(0);
                        } else {
                            if (v0()) {
                                i19 = 8;
                            } else {
                                i19 = 4;
                            }
                            w0Var.setVisibility(i19);
                        }
                        float f14 = z10 ? 1.0f : 0.0f;
                        this.f28145k0 = b0(f14);
                        s1(1.0f - f14);
                        z21 = false;
                    } else {
                        z21 = false;
                        this.f28164t0 = 0;
                        this.f28145k0 = 1.0f;
                    }
                } else {
                    z21 = false;
                    if (w0Var != null) {
                        if (w0Var.getVisibility() == 4) {
                            if (D()) {
                                this.f28164t0 = 0;
                                this.f28145k0 = 1.0f;
                                w0Var.setVisibility(0);
                            } else {
                                if (v0()) {
                                    i18 = 8;
                                } else {
                                    i18 = 4;
                                }
                                w0Var.setVisibility(i18);
                                this.f28145k0 = 0.0f;
                            }
                        }
                        q1(z21);
                    }
                }
                q1(z21);
            } else if (z10) {
                this.f28164t0 = 2;
            } else {
                this.f28164t0 = 0;
                if (w0Var != null) {
                    if (!v0() && !this.R0) {
                        i10 = 4;
                    } else {
                        i10 = 8;
                    }
                    w0Var.setVisibility(i10);
                }
            }
            int i33 = xs0VarArr2[z10 ? 1 : 0].B;
            if (i33 == 6) {
                if (!ps0Var.f31747e && !ps0Var.h && ps0Var.d.isEmpty()) {
                    ps0.E(ps0Var, 0L);
                }
            } else if (i33 != 7) {
                if (p0(i33)) {
                    bu0 k13 = k1(xs0VarArr2[z10 ? 1 : 0].B);
                    if (k13 != null) {
                        ih.n6 n6Var = k13.f27281s;
                        k13.P();
                        or0 or0Var = xs0VarArr2[z10 ? 1 : 0].f34763w;
                        if (n6Var != null && (n6Var.k() || (i0() && n6Var.g() > 0))) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        or0Var.e(z17, z10);
                        if (n6Var != null && n6Var.g() > 0 && !t0()) {
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
                    int i34 = xs0VarArr2[z10 ? 1 : 0].B;
                    if (i34 != 10 && i34 != 11 && i34 != 12 && i34 != 13 && i34 != 14) {
                        if (i34 == 15) {
                            i34 = 8;
                        }
                        tt0 tt0Var6 = tt0VarArr[i34];
                        if (!tt0Var6.f32793g && !tt0Var6.f32794i[0] && tt0Var6.f32788a.isEmpty()) {
                            tt0VarArr[i34].f32793g = true;
                            r0Var2.l();
                            if (i34 == 0) {
                                int i35 = tt0VarArr[0].f32802q;
                                if (i35 == 1) {
                                    i11 = 6;
                                } else if (i35 == 2) {
                                    i11 = 7;
                                }
                                o2Var.getMediaDataController().loadMedia(this.f28136f1, 50, 0, 0, i11, this.B, 1, o2Var.getClassGuid(), tt0VarArr[i11].f32801p, null, null);
                            }
                            i11 = i34;
                            o2Var.getMediaDataController().loadMedia(this.f28136f1, 50, 0, 0, i11, this.B, 1, o2Var.getClassGuid(), tt0VarArr[i11].f32801p, null, null);
                        }
                    }
                }
            }
            int i36 = xs0VarArr2[z10 ? 1 : 0].B;
            if (i36 != 8 && !w0(i36)) {
                xs0 xs0Var11 = xs0VarArr2[z10 ? 1 : 0];
                if (xs0Var11.B == 9) {
                    if (u0()) {
                        xs0VarArr2[z10 ? 1 : 0].f34763w.f28883b.setVisibility(8);
                        xs0VarArr2[z10 ? 1 : 0].f34763w.f28886f.setVisibility(8);
                    } else {
                        xs0VarArr2[z10 ? 1 : 0].f34763w.f28883b.setVisibility(0);
                        xs0VarArr2[z10 ? 1 : 0].f34763w.setStickerType(11);
                        xs0VarArr2[z10 ? 1 : 0].f34763w.f28886f.setVisibility(0);
                        xs0VarArr2[z10 ? 1 : 0].f34763w.f28886f.h(w());
                    }
                    xs0VarArr2[z10 ? 1 : 0].f34763w.d.setText(LocaleController.getString(R.string.NoArchivedStoriesTitle));
                    l80 l80Var = xs0VarArr2[z10 ? 1 : 0].f34763w.f28885e;
                    if (v0()) {
                        str3 = LocaleController.getString(R.string.NoArchivedStoriesSubtitle);
                    } else {
                        str3 = str;
                    }
                    l80Var.setText(str3);
                    xs0VarArr2[z10 ? 1 : 0].f34763w.f28886f.setOnClickListener(new cq0(this, 7));
                } else {
                    xs0Var11.f34763w.f28883b.setVisibility(0);
                    xs0VarArr2[z10 ? 1 : 0].f34763w.setStickerType(1);
                    xs0VarArr2[z10 ? 1 : 0].f34763w.d.setText(LocaleController.getString(R.string.NoResult));
                    xs0VarArr2[z10 ? 1 : 0].f34763w.f28885e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    xs0VarArr2[z10 ? 1 : 0].f34763w.f28886f.setVisibility(8);
                }
            } else {
                xs0 xs0Var12 = xs0VarArr2[z10 ? 1 : 0];
                or0 or0Var2 = xs0Var12.f34763w;
                boolean w02 = w0(xs0Var12.B);
                int h12 = h1(xs0VarArr2[z10 ? 1 : 0].B);
                o9 o9Var = or0Var2.f28883b;
                kh.d dVar = or0Var2.f28886f;
                if (!w02 && !u0() && !r0()) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                o9Var.setVisibility(i12);
                if (w02) {
                    dVar.setVisibility(0);
                    dVar.h(LocaleController.getString(R.string.StoriesAlbumAddToAlbum));
                } else if (u0()) {
                    dVar.setVisibility(8);
                } else {
                    or0Var2.setStickerType(11);
                    if (!t0()) {
                        i13 = 0;
                    } else {
                        i13 = 8;
                    }
                    dVar.setVisibility(i13);
                    dVar.h(w());
                }
                if (w02) {
                    or0Var2.d.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeTitle));
                    or0Var2.f28885e.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeDescription));
                } else {
                    dh.u uVar = or0Var2.d;
                    if (!t0()) {
                        if (v0()) {
                            i14 = R.string.NoPublicStoriesTitle2;
                        } else {
                            i14 = R.string.NoStoriesTitle;
                        }
                    } else {
                        i14 = R.string.NoHashtagStoriesTitle;
                    }
                    uVar.setText(LocaleController.getString(i14));
                    l80 l80Var2 = or0Var2.f28885e;
                    if (v0()) {
                        str2 = LocaleController.getString(R.string.NoStoriesSubtitle2);
                    } else {
                        str2 = str;
                    }
                    l80Var2.setText(str2);
                }
                dVar.setOnClickListener(new fh.b3(this, w02, h12, 1));
            }
            z19 = false;
            xs0VarArr2[z10 ? 1 : 0].h.setVisibility(0);
            i15 = i22;
            z20 = z15;
            f1Var2 = f1Var4;
        }
        xs0 xs0Var13 = xs0VarArr2[z10 ? 1 : 0];
        xs0Var13.f34756b = z20;
        o1(xs0Var13, z19);
        xs0VarArr2[z10 ? 1 : 0].f34764x.y1(i15);
        xs0VarArr2[z10 ? 1 : 0].h.a0();
        if (f1Var2 != null) {
            xs0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(f1Var2);
            xs0VarArr2[z10 ? 1 : 0].f34761r.setRecycledViewPool(f1Var2);
        }
        if (this.f28164t0 == 2) {
            org.telegram.ui.ActionBar.k kVar = this.C;
            if (kVar.f23577j0) {
                this.f28168v0 = true;
                kVar.h(true);
                this.f28164t0 = 0;
                this.f28145k0 = 0.0f;
                if (w0Var != null) {
                    if (v0()) {
                        i20 = 8;
                    } else {
                        i20 = 4;
                    }
                    w0Var.setVisibility(i20);
                }
                q1(false);
            }
        }
    }

    public final void n0(ViewGroup viewGroup) {
        xs0[] xs0VarArr;
        for (xs0 xs0Var : this.f28137g0) {
            dr0 dr0Var = xs0Var.h;
            Objects.requireNonNull(dr0Var);
            xs0Var.f34760n = new ig.k(dr0Var, viewGroup, new pv(dr0Var, 4));
        }
        vq0 vq0Var = this.R;
        if (vq0Var != null) {
            vq0Var.O = viewGroup;
            vq0Var.N = new fh.x2(vq0Var, 0);
        }
    }

    public final void n1() {
        js0 js0Var = this.D;
        if (js0Var != null) {
            js0Var.l();
        }
        rt0 rt0Var = this.G;
        if (rt0Var != null) {
            rt0Var.l();
        }
        rt0 rt0Var2 = this.H;
        if (rt0Var2 != null) {
            rt0Var2.l();
        }
        st0 st0Var = this.F;
        if (st0Var != null) {
            st0Var.X(false);
        }
        rt0 rt0Var3 = this.I;
        if (rt0Var3 != null) {
            rt0Var3.l();
        }
        lt0 lt0Var = this.J;
        if (lt0Var != null) {
            lt0Var.l();
        }
        ss0 ss0Var = this.K;
        if (ss0Var != null) {
            ss0Var.l();
        }
        ms0 ms0Var = this.V;
        if (ms0Var != null) {
            ms0Var.l();
        }
        for (du0 du0Var : this.U1.values()) {
            du0Var.f27812c.l();
        }
    }

    public final void o1(xs0 xs0Var, boolean z10) {
        boolean z11;
        Integer num = 1;
        int i9 = 0;
        if (xs0Var.f34756b && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        fk0 fastScroll = xs0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = xs0Var.f34757c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            xs0Var.f34757c.cancel();
        }
        if (!z10) {
            fastScroll.animate().setListener(null).cancel();
            if (!z11) {
                i9 = 8;
            }
            fastScroll.setVisibility(i9);
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
            xs0Var.f34757c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(num);
        } else if (!z11 && fastScroll.getTag() != null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, property, fastScroll.getAlpha(), 0.0f);
            ofFloat2.addListener(new u9(fastScroll));
            xs0Var.f34757c = ofFloat2;
            ofFloat2.setDuration(150L).start();
            fastScroll.animate().setListener(null).cancel();
            fastScroll.setTag(null);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i9 = 0;
        while (true) {
            xs0[] xs0VarArr = this.f28137g0;
            if (i9 < xs0VarArr.length) {
                dr0 dr0Var = xs0VarArr[i9].h;
                if (dr0Var != null) {
                    dr0Var.getViewTreeObserver().addOnPreDrawListener(new as0(this, i9, 0));
                }
                i9++;
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
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i9);
        qs0 qs0Var = this.f28180z1;
        if (qs0Var.f() != null) {
            i11 = qs0Var.f().getHeight();
        } else {
            i11 = 0;
        }
        if (i11 == 0) {
            i11 = View.MeasureSpec.getSize(i10);
        }
        setMeasuredDimension(size, i11);
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            if (childAt == null || childAt.getVisibility() == 8) {
                i12 = i9;
            } else if (childAt instanceof xs0) {
                i12 = i9;
                measureChildWithMargins(childAt, i12, 0, View.MeasureSpec.makeMeasureSpec(i11, 1073741824), 0);
                dr0 dr0Var = ((xs0) childAt).h;
                dr0Var.setPadding(0, dr0Var.U2, 0, dr0Var.V2);
            } else {
                i12 = i9;
                i13 = i10;
                measureChildWithMargins(childAt, i12, 0, i13, 0);
                i14++;
                i9 = i12;
                i10 = i13;
            }
            i13 = i10;
            i14++;
            i9 = i12;
            i10 = i13;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i9;
        boolean z10;
        boolean z11;
        int i10;
        boolean z12 = false;
        if (!this.H1) {
            org.telegram.ui.ActionBar.o2 o2Var = this.f28160r1;
            if (o2Var.getParentLayout() != null && !((ActionBarLayout) o2Var.getParentLayout()).j() && !J() && !this.f28120a) {
                if (motionEvent != null) {
                    if (this.f28175x1 == null) {
                        this.f28175x1 = VelocityTracker.obtain();
                    }
                    this.f28175x1.addMovement(motionEvent);
                    s30 s30Var = this.A1;
                    if (s30Var != null) {
                        s30Var.b(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.f28165t1 && !this.f28167u1 && motionEvent.getY() >= AndroidUtilities.dp(90.0f)) {
                    this.f28163s1 = motionEvent.getPointerId(0);
                    this.f28167u1 = true;
                    this.f28169v1 = (int) motionEvent.getX();
                    this.f28172w1 = (int) motionEvent.getY();
                    this.f28175x1.clear();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f28163s1) {
                    int x10 = (int) (motionEvent.getX() - this.f28169v1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.f28172w1);
                    boolean z13 = this.f28165t1;
                    xs0[] xs0VarArr = this.f28137g0;
                    if (z13 && (((z10 = this.f28130d1) && x10 > 0) || (!z10 && x10 < 0))) {
                        if (x10 < 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!U0(motionEvent, z11)) {
                            this.f28167u1 = true;
                            this.f28165t1 = false;
                            N0(false);
                            xs0VarArr[0].setTranslationX(0.0f);
                            xs0 xs0Var = xs0VarArr[1];
                            if (this.f28130d1) {
                                i10 = xs0VarArr[0].getMeasuredWidth();
                            } else {
                                i10 = -xs0VarArr[0].getMeasuredWidth();
                            }
                            xs0Var.setTranslationX(i10);
                            Z0(0.0f, xs0VarArr[1].B);
                            M0(getTabProgress());
                        }
                    }
                    if (this.f28167u1 && !this.f28165t1) {
                        if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                            if (x10 < 0) {
                                z12 = true;
                            }
                            U0(motionEvent, z12);
                        }
                    } else if (this.f28165t1) {
                        xs0VarArr[0].setTranslationX(x10);
                        if (this.f28130d1) {
                            xs0VarArr[1].setTranslationX(xs0VarArr[0].getMeasuredWidth() + x10);
                        } else {
                            xs0VarArr[1].setTranslationX(x10 - xs0VarArr[0].getMeasuredWidth());
                        }
                        float abs2 = Math.abs(x10) / xs0VarArr[0].getMeasuredWidth();
                        if (!D()) {
                            this.f28145k0 = 0.0f;
                        } else {
                            this.f28145k0 = b0(abs2);
                            s1(abs2);
                            float a02 = a0(abs2);
                            this.f28147l0 = a02;
                            if (a02 != 0.0f && D() && !q0()) {
                                i9 = 0;
                            } else {
                                i9 = 4;
                            }
                            this.f28150n0.setVisibility(i9);
                        }
                        q1(false);
                        Z0(abs2, xs0VarArr[1].B);
                        M0(getTabProgress());
                        L0();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f28163s1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    g1(motionEvent);
                }
                return this.f28165t1;
            }
        }
        return false;
    }

    public final void p1() {
        boolean z10;
        float f10;
        org.telegram.ui.ActionBar.w0 w0Var = this.f28154p0;
        if (w0Var != null) {
            if (!this.f28160r1.getMessagesController().isPeerNoForwards(this.f28136f1) && !j0()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                f10 = 0.5f;
            } else {
                f10 = 1.0f;
            }
            w0Var.setAlpha(f10);
            if (z10 && w0Var.getBackground() != null) {
                w0Var.setBackground(null);
            } else if (!z10 && w0Var.getBackground() == null) {
                w0Var.setBackground(org.telegram.ui.ActionBar.f6.f0(h0(org.telegram.ui.ActionBar.f6.f23388z8), 5, -1));
            }
        }
    }

    public boolean q0() {
        return false;
    }

    public final void q1(boolean z10) {
        vq0 vq0Var;
        zq0 zq0Var;
        pi0 pi0Var = this.f28152o0;
        if (pi0Var == null) {
            return;
        }
        float f10 = 0.0f;
        if (!this.R0 && (((vq0Var = this.R) == null || !vq0Var.g()) && ((zq0Var = this.S) == null || !zq0Var.f44304w))) {
            f10 = Utilities.clamp(this.f28145k0 + this.f28147l0, 1.0f, 0.0f);
        }
        pi0Var.setAlpha(f10);
        boolean z11 = false;
        if (z10) {
            if (a0(1.0f) > 0.5f) {
                z11 = true;
            }
            A(z11, true);
        } else if (this.f28164t0 == 2) {
            if (this.f28147l0 > 0.1f) {
                z11 = true;
            }
            A(z11, true);
        } else {
            if (this.f28145k0 < 0.1f) {
                z11 = true;
            }
            A(z11, true);
        }
    }

    public final boolean r0() {
        TLRPC.User user;
        long j10 = this.f28136f1;
        if (j10 <= 0 || (user = MessagesController.getInstance(this.f28160r1.getCurrentAccount()).getUser(Long.valueOf(j10))) == null || !user.bot) {
            return false;
        }
        return true;
    }

    public final void r1(boolean z10) {
        int i9 = 0;
        while (true) {
            xs0[] xs0VarArr = this.f28137g0;
            if (i9 < xs0VarArr.length) {
                int childCount = xs0VarArr[i9].h.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = xs0VarArr[i9].h.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.i7) {
                        ((org.telegram.ui.Cells.i7) childAt).b(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.r7) {
                        ((org.telegram.ui.Cells.r7) childAt).i(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.l7) {
                        ((org.telegram.ui.Cells.l7) childAt).f(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.h7) {
                        ((org.telegram.ui.Cells.h7) childAt).e(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.e2) {
                        ((org.telegram.ui.Cells.e2) childAt).c(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                        ((org.telegram.ui.Cells.r2) childAt).U(false, z10);
                    }
                }
                i9++;
            } else {
                return;
            }
        }
    }

    public final boolean s0(int i9) {
        if (i9 == 7) {
            return this.f28180z1.S();
        }
        if (!t0() && i9 != 0 && !p0(i9) && i9 != 2 && i9 != 5 && i9 != 6 && i9 != 11 && i9 != 10 && i9 != 13 && i9 != 14) {
            return true;
        }
        return false;
    }

    public final void s1(float f10) {
        org.telegram.ui.ActionBar.w0 w0Var = this.f28141i0;
        if (w0Var == null) {
            return;
        }
        xs0[] xs0VarArr = this.f28137g0;
        xs0 xs0Var = xs0VarArr[1];
        float f11 = 0.0f;
        if (xs0Var != null && xs0Var.B == 11) {
            f11 = 0.0f + f10;
        }
        int i9 = 0;
        xs0 xs0Var2 = xs0VarArr[0];
        if (xs0Var2 != null && xs0Var2.B == 11) {
            f11 += 1.0f - f10;
        }
        w0Var.setAlpha(f11);
        float f12 = (0.15f * f11) + 0.85f;
        w0Var.setScaleX(f12);
        w0Var.setScaleY(f12);
        if (f11 <= 0.01f) {
            i9 = 8;
        }
        w0Var.setVisibility(i9);
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        boolean z10;
        int i9;
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
                int i10 = 0;
                while (true) {
                    tt0[] tt0VarArr = this.f28155p1;
                    if (i10 >= tt0VarArr.length) {
                        break;
                    }
                    if (tt0VarArr[i10].f32789b[1].size() == 0) {
                        tt0 tt0Var = tt0VarArr[i10];
                        tt0Var.f32795j[1] = this.Z0.migrated_from_max_id;
                        tt0Var.f32794i[1] = false;
                    }
                    i10++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.Z0;
        if (chatFull3 != null && z10 != chatFull3.stories_pinned_available) {
            ur0 ur0Var = this.E0;
            if (ur0Var != null) {
                if (q0()) {
                    i9 = 9;
                } else {
                    i9 = 8;
                }
                ur0Var.setInitialTabId(i9);
            }
            v1(true);
            m1(false);
        }
    }

    public void setCommonGroupsCount(int i9) {
        if (this.B == 0) {
            this.T0[6] = i9;
        }
        v1(true);
        F();
    }

    public void setForwardRestrictedHint(s30 s30Var) {
        this.A1 = s30Var;
    }

    public void setMergeDialogId(long j10) {
        this.Y0 = j10;
    }

    public void setNewMediaCounts(int[] iArr) {
        int[] iArr2;
        int i9 = 0;
        while (true) {
            iArr2 = this.T0;
            if (i9 > 6 || iArr2[i9] >= 0) {
                break;
            }
            i9++;
        }
        System.arraycopy(iArr, 0, iArr2, 0, 6);
        v1(true);
        F();
        if (iArr2[0] >= 0) {
            z0(false);
        }
    }

    @Override
    public final void setPadding(int i9, int i10, int i11, int i12) {
        this.G1 = i10;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            xs0[] xs0VarArr = this.f28137g0;
            if (i14 >= xs0VarArr.length) {
                break;
            }
            xs0VarArr[i14].setTranslationY(this.G1);
            i14++;
        }
        if (this.L0 != null) {
            K();
        } else {
            qr0 qr0Var = this.N0;
            if (qr0Var != null) {
                qr0Var.setTranslationY(AndroidUtilities.dp(48.0f) + i10);
            }
        }
        this.K0 = i10;
        org.telegram.ui.Cells.w0 w0Var = this.G0;
        if (w0Var.getTag() == null) {
            i13 = -AndroidUtilities.dp(48.0f);
        }
        w0Var.setTranslationY(i13 + this.K0);
    }

    public void setPagesPaddingBottom(int i9) {
        if (this.T1 != i9) {
            this.T1 = i9;
            xs0[] xs0VarArr = this.f28137g0;
            if (xs0VarArr != null) {
                for (xs0 xs0Var : xs0VarArr) {
                    if (xs0Var != null) {
                        dr0 dr0Var = xs0Var.h;
                        int paddingLeft = dr0Var.getPaddingLeft();
                        dr0 dr0Var2 = xs0Var.h;
                        int i10 = dr0Var2.U2;
                        int paddingRight = dr0Var2.getPaddingRight();
                        dr0 dr0Var3 = xs0Var.h;
                        int Y = Y(v0());
                        dr0Var3.a3 = Y;
                        dr0Var.setPadding(paddingLeft, i10, paddingRight, Y);
                    }
                }
            }
        }
    }

    public void setPinnedToTop(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            int i9 = 0;
            while (true) {
                xs0[] xs0VarArr = this.f28137g0;
                if (i9 < xs0VarArr.length) {
                    o1(xs0VarArr[i9], true);
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        boolean z10;
        TLRPC.UserFull userFull2 = this.f28122a1;
        if (userFull2 != null && userFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28122a1 = userFull;
        v1(true);
        if (userFull != null && z10 != userFull.stories_pinned_available) {
            Y0(8);
        }
    }

    public void setVisibleHeight(int i9) {
        float f10;
        this.I1 = i9;
        int i10 = 0;
        while (true) {
            xs0[] xs0VarArr = this.f28137g0;
            if (i10 >= xs0VarArr.length) {
                break;
            }
            int measuredHeight = getMeasuredHeight();
            if (xs0VarArr[i10].B == 8) {
                f10 = 280.0f;
            } else {
                f10 = 120.0f;
            }
            float f11 = (-(measuredHeight - Math.max(i9, AndroidUtilities.dp(f10)))) / 2.0f;
            xs0VarArr[i10].f34763w.setTranslationY(f11);
            xs0VarArr[i10].v.setTranslationY(-f11);
            i10++;
        }
        uq0 uq0Var = this.Q;
        if (uq0Var != null) {
            uq0Var.setVisibleHeight(i9);
        }
        vq0 vq0Var = this.R;
        if (vq0Var != null) {
            vq0Var.setVisibleHeight(i9);
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
        org.telegram.ui.ActionBar.w0 w0Var = this.f28141i0;
        if (w0Var == null) {
            return;
        }
        boolean z10 = true;
        xs0 xs0Var = this.f28137g0[1];
        z10 = (xs0Var == null || xs0Var.B != 11) ? false : false;
        if (z10) {
            w0Var.setVisibility(0);
        }
        ViewPropertyAnimator animate = w0Var.animate();
        float f12 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f10);
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.85f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f11);
        if (!z10) {
            f12 = 0.85f;
        }
        scaleX.scaleY(f12).withEndAction(new a50(3, this, z10)).setDuration(420L).setInterpolator(gr.h).start();
    }

    public boolean u0() {
        return false;
    }

    public final void u1() {
        boolean z10;
        int i9;
        ih.n6 n6Var;
        boolean r02 = r0();
        org.telegram.ui.ActionBar.w0 w0Var = this.f28162s0;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f28159r0;
        int i10 = 8;
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
            int i11 = 0;
            while (true) {
                SparseArray[] sparseArrayArr = this.V0;
                if (i11 < sparseArrayArr[0].size()) {
                    MessageObject messageObject = (MessageObject) sparseArrayArr[0].valueAt(i11);
                    ms0 ms0Var = this.V;
                    if (ms0Var != null && (n6Var = ms0Var.f27281s) != null && !n6Var.m(messageObject.getId())) {
                        z10 = true;
                        break;
                    }
                    i11++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (w0Var2 != null) {
                if (z10) {
                    i9 = 0;
                } else {
                    i9 = 8;
                }
                w0Var2.setVisibility(i9);
            }
            if (w0Var != null) {
                if (!z10) {
                    i10 = 0;
                }
                w0Var.setVisibility(i10);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.eu0.v1(boolean):void");
    }

    public final SpannableStringBuilder w() {
        if (this.S1 == null) {
            this.S1 = new SpannableStringBuilder();
            if (r0()) {
                this.S1.append((CharSequence) LocaleController.getString(R.string.ProfileBotPreviewEmptyButton));
            } else {
                this.S1.append((CharSequence) "c");
                this.S1.setSpan(new eq(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.S1.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
            }
        }
        return this.S1;
    }

    public final Boolean w1(View view, View view2) {
        if (!this.f28146k1) {
            xs0[] xs0VarArr = this.f28137g0;
            boolean z10 = false;
            xs0 xs0Var = xs0VarArr[0];
            if (xs0Var != null) {
                int i9 = xs0Var.B;
                this.l1 = i9;
                boolean p02 = p0(i9);
                int[] iArr = this.f28142i1;
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
                    } else if (c0(xs0VarArr[0].B) >= 5 || w0(xs0VarArr[0].B)) {
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

    public final void x(x60 x60Var, org.telegram.ui.ActionBar.o2 o2Var, long j10, int i9) {
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
        j3.r0.A(sb2, MessagesController.getInstance(o2Var.getCurrentAccount()).linkPrefix, "/", publicUsername, "/a/");
        sb2.append(i9);
        x60Var.c(R.drawable.media_share, LocaleController.getString(R.string.StoriesAlbumMenuShareLink), new ue0(this, sb2.toString(), o2Var, 5), false);
    }

    public final boolean x0() {
        if (!C() || ((getClosestTab() != 8 && getClosestTab() != 13 && !w0(getClosestTab())) || !this.f28178y1)) {
            vq0 vq0Var = this.R;
            if (vq0Var == null || !vq0Var.g()) {
                zq0 zq0Var = this.S;
                if ((zq0Var == null || !zq0Var.f44304w) && !this.f28146k1 && !this.f28128c1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final Boolean x1(View view, View view2) {
        if (!this.f28146k1) {
            xs0[] xs0VarArr = this.f28137g0;
            boolean z10 = false;
            xs0 xs0Var = xs0VarArr[0];
            if (xs0Var != null) {
                if (!this.f28138g1 || !p0(xs0Var.B)) {
                    int i9 = xs0VarArr[0].B;
                    this.l1 = i9;
                    boolean p02 = p0(i9);
                    int[] iArr = this.f28142i1;
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
                        } else if (c0(xs0VarArr[0].B) >= 5 || w0(xs0VarArr[0].B)) {
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

    public final void y(org.telegram.ui.Components.x60 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.eu0.y(org.telegram.ui.Components.x60):void");
    }

    public final void y0(int i9, int i10, int i11, boolean z10) {
        tt0[] tt0VarArr = this.f28155p1;
        tt0VarArr[i9].f32788a.clear();
        tt0VarArr[i9].f32789b[0].clear();
        tt0VarArr[i9].f32789b[1].clear();
        tt0 tt0Var = tt0VarArr[i9];
        tt0Var.f32795j[0] = i10;
        tt0Var.f32794i[0] = false;
        tt0Var.f32797l = false;
        tt0Var.f32798m = i11;
        tt0Var.f32799n = (tt0Var.e() - i11) - 1;
        tt0 tt0Var2 = tt0VarArr[i9];
        if (tt0Var2.f32799n < 0) {
            tt0Var2.f32799n = 0;
        }
        tt0Var2.f32796k = i10;
        tt0Var2.f32800o = true;
        tt0Var2.f32793g = false;
        tt0Var2.f32801p++;
        xs0 W = W(i9);
        if (W != null && W.h.getAdapter() != null) {
            W.h.getAdapter().l();
        }
        if (z10) {
            int i12 = 0;
            while (true) {
                xs0[] xs0VarArr = this.f28137g0;
                if (i12 < xs0VarArr.length) {
                    xs0 xs0Var = xs0VarArr[i12];
                    if (xs0Var.B == i9) {
                        xs0Var.f34764x.h1(Math.min(tt0VarArr[i9].e() - 1, tt0VarArr[i9].f32798m), 0);
                    }
                    i12++;
                } else {
                    return;
                }
            }
        }
    }

    public final void z(ws0 ws0Var, int i9, SparseBooleanArray sparseBooleanArray) {
        int childCount = ws0Var.getChildCount();
        e00 e00Var = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ws0Var.getChildAt(i10);
            if (childAt instanceof e00) {
                e00Var = childAt;
            }
        }
        if (e00Var != null) {
            ws0Var.removeView(e00Var);
        }
        getViewTreeObserver().addOnPreDrawListener(new zr0(this, ws0Var, sparseBooleanArray, e00Var, i9));
    }

    public final void z0(boolean z10) {
        long j10 = this.B;
        int i9 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i9 == 0 && !t0()) {
            for (int i10 = 0; i10 < 4; i10++) {
                final int i11 = Z1[i10];
                tt0[] tt0VarArr = this.f28155p1;
                if (!tt0VarArr[i11].h || z10) {
                    long j11 = this.f28136f1;
                    if (!DialogObject.isEncryptedDialog(j11)) {
                        tt0VarArr[i11].h = false;
                        TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
                        if (i11 == 0) {
                            int i12 = tt0VarArr[i11].f32802q;
                            if (i12 == 1) {
                                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotos();
                            } else if (i12 == 2) {
                                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterVideo();
                            } else {
                                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
                            }
                        } else if (i11 == 1) {
                            tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterDocument();
                        } else if (i11 == 2) {
                            tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterRoundVoice();
                        } else {
                            tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterMusic();
                        }
                        tL_messages_getSearchResultsPositions.limit = 100;
                        org.telegram.ui.ActionBar.o2 o2Var = this.f28160r1;
                        tL_messages_getSearchResultsPositions.peer = o2Var.getMessagesController().getInputPeer(j11);
                        if (i9 != 0 && o2Var.getUserConfig().getClientUserId() == j11) {
                            tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                            tL_messages_getSearchResultsPositions.saved_peer_id = o2Var.getMessagesController().getInputPeer(j10);
                        }
                        final int i13 = tt0VarArr[i11].f32801p;
                        ConnectionsManager.getInstance(o2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(o2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new gq0(eu0.this, tL_error, i13, i11, tLObject, 0));
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

    public int V0(int i9) {
        return i9;
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
