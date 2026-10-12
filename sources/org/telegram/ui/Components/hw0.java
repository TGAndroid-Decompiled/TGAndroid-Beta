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
public abstract class hw0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Cells.o2 {
    public static final int[] f26919d2 = {0, 1, 2, 4};
    public static final ts0 f26920e2 = new ts0(0);
    public final NumberTextView A0;
    public int A1;
    public final ja B0;
    public VelocityTracker B1;
    public final ImageView C0;
    public boolean C1;
    public final org.telegram.ui.ActionBar.f2 D0;
    public final tu0 D1;
    public final int E;
    public final ArrayList E0;
    public c50 E1;
    public final long F;
    public final ArrayList F0;
    public final org.telegram.ui.ActionBar.c6 F1;
    public final org.telegram.ui.ActionBar.k G;
    public final ArrayList G0;
    public final NotificationCenter.ObserversGroup G1;
    public final mu0 H;
    public final ArrayList H0;
    public boolean H1;
    public final bw0 I;
    public final xt0 I0;
    public final AnimationNotificationsLocker I1;
    public final vv0 J;
    public final ut0 J0;
    public bl J1;
    public final uv0 K;
    public final org.telegram.ui.Cells.w0 K0;
    public int K1;
    public final uv0 L;
    public AnimatorSet L0;
    public boolean L1;
    public final uv0 M;
    public final bs0 M0;
    public int M1;
    public final ov0 N;
    public final ArrayList N0;
    public AnimatorSet N1;
    public final vu0 O;
    public float O0;
    public final SparseArray O1;
    public final su0 P;
    public final ct P0;
    public long P1;
    public final qu0 Q;
    public final FrameLayout Q0;
    public boolean Q1;
    public final rv0 R;
    public final tt0 R0;
    public int R1;
    public final sv0 S;
    public final int S0;
    public final eu0 S1;
    public final nu0 T;
    public final Paint T0;
    public ai.e9 T1;
    public final ws0 U;
    public boolean U0;
    public float U1;
    public final xs0 V;
    public boolean V0;
    public boolean V1;
    public final ct0 W;
    public zg.n0 W0;
    public SpannableStringBuilder W1;
    public final int[] X0;
    public int X1;
    public int Y0;
    public final HashMap Y1;
    public final SparseArray[] Z0;
    public final HashMap Z1;
    public boolean f26921a;
    public final ru0 f26922a0;
    public int f26923a1;
    public int a2;
    public boolean f26924b;
    public final s4.z f26925b0;
    public boolean f26926b1;
    public int f26927b2;
    public boolean f26928c;
    public final pu0 f26929c0;
    public long f26930c1;
    public final ph f26931c2;
    public boolean d;
    public final ew0 f26932d0;
    public TLRPC.ChatFull f26933d1;
    public int f26934e;
    public final vs0 f26935e0;
    public TLRPC.UserFull f26936e1;
    public int f26937f;
    public final ew0 f26938f0;
    public AnimatorSet f26939f1;
    public final dv0 f26940g0;
    public boolean f26941g1;
    public float h;
    public final dv0 f26942h0;
    public boolean f26943h1;
    public final dv0 f26944i0;
    public boolean f26945i1;
    public final yu0 f26946j0;
    public final long f26947j1;
    public final av0[] f26948k0;
    public boolean f26949k1;
    public final org.telegram.ui.ActionBar.u0 f26950l0;
    public boolean l1;
    public final org.telegram.ui.ActionBar.u0 m0;
    public final int[] f26951m1;
    public float f26952n;
    public final org.telegram.ui.ActionBar.u0 f26953n0;
    public float f26954n1;
    public float f26955o0;
    public boolean f26956o1;
    public float f26957p0;
    public int f26958p1;
    public final TextView f26959q0;
    public int f26960q1;
    public boolean f26961r;
    public final ImageView f26962r0;
    public final ht0 f26963r1;
    public int f26964s;
    public final ik0 f26965s0;
    public float f26966s1;
    public final org.telegram.ui.ActionBar.u0 f26967t0;
    public final wv0[] f26968t1;
    public final org.telegram.ui.ActionBar.u0 f26969u0;
    public final zv0 f26970u1;
    public int v;
    public final org.telegram.ui.ActionBar.u0 f26971v0;
    public final org.telegram.ui.ActionBar.m2 f26972v1;
    public int f26973w;
    public final org.telegram.ui.ActionBar.u0 f26974w0;
    public int f26975w1;
    public final Rect f26976x;
    public int f26977x0;
    public boolean f26978x1;
    public final m10 f26979y;
    public final Drawable f26980y0;
    public boolean f26981y1;
    public boolean f26982z0;
    public int f26983z1;

    public hw0(android.content.Context r40, long r41, org.telegram.ui.Components.zv0 r43, int r44, java.util.ArrayList r45, org.telegram.tgnet.TLRPC.ChatFull r46, org.telegram.tgnet.TLRPC.UserFull r47, int r48, int r49, org.telegram.ui.ActionBar.m2 r50, org.telegram.ui.Components.tu0 r51, int r52, org.telegram.ui.ActionBar.c6 r53, ah.c r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hw0.<init>(android.content.Context, long, org.telegram.ui.Components.zv0, int, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.tgnet.TLRPC$UserFull, int, int, org.telegram.ui.ActionBar.m2, org.telegram.ui.Components.tu0, int, org.telegram.ui.ActionBar.c6, ah.c):void");
    }

    public static uu0 M(int i10, long j3, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        uu0 uu0Var = new uu0(context, c6Var);
        TextView textView = uu0Var.f31263a;
        if (i10 == 0) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoMediaSecret));
                return uu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoMedia));
            return uu0Var;
        } else if (i10 == 1) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedFilesSecret));
                return uu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedFiles));
            return uu0Var;
        } else if (i10 == 2) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedVoiceSecret));
                return uu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedVoice));
            return uu0Var;
        } else if (i10 == 3) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedLinksSecret));
                return uu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedLinks));
            return uu0Var;
        } else if (i10 == 4) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedAudioSecret));
                return uu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedAudio));
            return uu0Var;
        } else if (i10 == 5) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedGifSecret));
                return uu0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoGIFs));
            return uu0Var;
        } else {
            ImageView imageView = uu0Var.f31264b;
            if (i10 == 6) {
                imageView.setImageDrawable(null);
                textView.setText(LocaleController.getString(R.string.NoGroupsInCommon));
                return uu0Var;
            }
            if (i10 == 7) {
                imageView.setImageDrawable(null);
                textView.setText("");
            }
            return uu0Var;
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

    public static void e(hw0 hw0Var, int i10, TL_stories.StoryItem storyItem, String str) {
        bl blVar = new bl(hw0Var, i10, storyItem, 11);
        ai.m9 storiesController = hw0Var.getStoriesController();
        long j3 = hw0Var.f26947j1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.c0(i10, j3, arrayList);
        zc.a0(hw0Var.f26972v1).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", 1, str)), LocaleController.getString(R.string.UndoNoCaps), blVar).j();
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

    public ai.m9 getStoriesController() {
        return MessagesController.getInstance(this.f26972v1.getCurrentAccount()).getStoriesController();
    }

    public static void h(hw0 hw0Var, TL_stories.StoryItem storyItem) {
        hw0Var.getStoriesController().o0(hw0Var.f26947j1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        zc.a0(hw0Var.f26972v1).G(R.raw.chats_archived, 5000, LocaleController.formatPluralString("StoryArchived", 1, new Object[0])).j();
    }

    public static void i(hw0 hw0Var, long j3, int i10, String str) {
        ai.y8 B = hw0Var.getStoriesController().B(j3, true);
        int i11 = B.f1951a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        ((ai.f9) B.h.get(c10)).f1032b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f1952b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public static void j(hw0 hw0Var, TL_stories.StoryItem storyItem, ai.f9 f9Var) {
        hw0Var.getStoriesController().c(f9Var.f1031a, hw0Var.f26947j1, storyItem);
        AndroidUtilities.runOnUIThread(new sj0(10, hw0Var, f9Var), 100L);
    }

    public static void m(hw0 hw0Var, HashSet hashSet, TL_stories.StoryItem storyItem, s80 s80Var, ai.f9 f9Var) {
        String formatString;
        long j3 = hw0Var.f26947j1;
        if (hashSet.contains(Integer.valueOf(f9Var.f1031a))) {
            hw0Var.getStoriesController().c(f9Var.f1031a, j3, storyItem);
            formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, f9Var.f1032b);
        } else {
            ai.m9 storiesController = hw0Var.getStoriesController();
            int i10 = f9Var.f1031a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.c0(i10, j3, arrayList);
            formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, f9Var.f1032b);
        }
        zc.a0(hw0Var.f26972v1).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
        s80Var.u();
    }

    public static void n(hw0 hw0Var, long j3, int i10) {
        ai.y8 B = hw0Var.getStoriesController().B(j3, true);
        int i11 = B.f1951a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f1952b);
        tL_deleteAlbum.album_id = ((ai.f9) B.h.remove(c10)).f1031a;
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

    public static void q(av0 av0Var, wv0[] wv0VarArr, boolean z10) {
        sj0 sj0Var;
        if (z10) {
            if (SharedConfig.fastScrollHintCount > 0 && av0Var.G == null && !av0Var.I && av0Var.h.getFastScroll() != null && av0Var.h.getFastScroll().f25393a0 && av0Var.h.getFastScroll().getVisibility() == 0 && wv0VarArr[0].e() >= 50) {
                SharedConfig.setFastScrollHintCount(SharedConfig.fastScrollHintCount - 1);
                av0Var.I = true;
                Context context = av0Var.getContext();
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                textView.setText(LocaleController.getString(R.string.SharedMediaFastScrollHint));
                textView.setTextSize(1, 14.0f);
                textView.setMaxLines(3);
                int i10 = org.telegram.ui.ActionBar.h6.f20788pf;
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
                frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20807qf, false)));
                frameLayout.addView(textView, w7.w5.a(-2.0f, 46.0f, 8.0f, 8.0f, 8.0f, -2, 16));
                ?? view = new View(context);
                view.f33154a = new Random();
                Paint paint = new Paint(1);
                view.f33155b = paint;
                Paint paint2 = new Paint(1);
                view.f33156c = paint2;
                view.f33158f = 1.0f;
                view.h = 0.0f;
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, i10, false), 76));
                paint2.setColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
                Paint paint3 = new Paint();
                view.d = paint3;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint3.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint3.setXfermode(new PorterDuffXfermode(mode));
                Paint paint4 = new Paint();
                view.f33157e = paint4;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                paint4.setXfermode(new PorterDuffXfermode(mode));
                frameLayout.addView(view, w7.w5.a(32.0f, 8.0f, 8.0f, 8.0f, 8.0f, 29, 0));
                av0Var.G = frameLayout;
                av0Var.addView((View) frameLayout, w7.w5.d(-2.0f, -2));
                av0Var.G.setAlpha(0.0f);
                av0Var.G.setScaleX(0.8f);
                av0Var.G.setScaleY(0.8f);
                av0Var.G.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                av0Var.invalidate();
                sj0 sj0Var2 = new sj0(9, av0Var, frameLayout);
                av0Var.H = sj0Var2;
                AndroidUtilities.runOnUIThread(sj0Var2, 4000L);
            }
        } else if (av0Var.G != null && (sj0Var = av0Var.H) != null) {
            AndroidUtilities.cancelRunOnUIThread(sj0Var);
            av0Var.H.run();
            av0Var.H = null;
            av0Var.G = null;
        }
    }

    public static void s(org.telegram.ui.Components.hw0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hw0.s(org.telegram.ui.Components.hw0):void");
    }

    public static void t(hw0 hw0Var, int i10, boolean z10) {
        av0[] av0VarArr = hw0Var.f26948k0;
        if (av0VarArr[0].F == i10) {
            return;
        }
        av0 av0Var = av0VarArr[1];
        av0Var.F = i10;
        av0Var.setVisibility(0);
        hw0Var.k0();
        hw0Var.m1(true);
        hw0Var.f26943h1 = z10;
        hw0Var.L0();
        hw0Var.A(!hw0Var.s0(i10), true);
        hw0Var.q1(true);
    }

    public static int u(hw0 hw0Var, s4.i0 i0Var) {
        if (i0Var == hw0Var.f26929c0) {
            return 8;
        }
        if (i0Var == hw0Var.f26935e0) {
            return 9;
        }
        for (gw0 gw0Var : hw0Var.Y1.values()) {
            if (gw0Var.f26541c == i0Var) {
                return gw0Var.f26539a;
            }
        }
        return -1;
    }

    public static int v(hw0 hw0Var, s4.i0 i0Var) {
        if (i0Var == hw0Var.f26932d0) {
            return 8;
        }
        if (i0Var == hw0Var.f26938f0) {
            return 9;
        }
        for (gw0 gw0Var : hw0Var.Y1.values()) {
            if (gw0Var.d == i0Var) {
                return gw0Var.f26539a;
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
        ik0 ik0Var = this.f26965s0;
        if (ik0Var != null && this.V1 != z10) {
            this.V1 = z10;
            if (!z10 && ik0Var.getAnimatedDrawable().f26101a0 < 20) {
                ik0Var.getAnimatedDrawable().P(0);
            } else {
                fk0 animatedDrawable = ik0Var.getAnimatedDrawable();
                if (this.V1) {
                    i10 = 50;
                } else {
                    i10 = 100;
                }
                animatedDrawable.P(i10);
            }
            if (z11) {
                ik0Var.getAnimatedDrawable().start();
            } else {
                ik0Var.getAnimatedDrawable().M(ik0Var.getAnimatedDrawable().f26109f);
            }
        }
    }

    public final void A0(int i10) {
        int i11;
        int i12 = 2;
        wv0[] wv0VarArr = this.f26968t1;
        if (i10 == 0) {
            int i13 = wv0VarArr[0].f32567q;
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
        wv0VarArr[i10].f32558g = true;
        org.telegram.ui.ActionBar.m2 m2Var = this.f26972v1;
        m2Var.getMediaDataController().loadMedia(this.f26947j1, 50, 0, wv0VarArr[i10].f32561k, i11, this.F, 1, m2Var.getClassGuid(), wv0VarArr[i10].f32566p, null, null);
    }

    public final void B(int i10) {
        int i11;
        av0 W = W(this.f26958p1);
        this.f26964s = -1;
        if (W != null) {
            W.h.B0();
            this.f26960q1 = i10;
            W.f24500r.setVisibility(0);
            if (p0(this.f26958p1)) {
                W.f24500r.setAdapter(l1(this.f26958p1));
            } else {
                W.f24500r.setAdapter(this.I);
            }
            zu0 zu0Var = W.f24500r;
            int paddingLeft = zu0Var.getPaddingLeft();
            zu0 zu0Var2 = W.f24500r;
            int Z = Z(W.F);
            zu0Var2.f33493b3 = Z;
            int paddingRight = W.f24500r.getPaddingRight();
            zu0 zu0Var3 = W.f24500r;
            int Y = Y(v0());
            zu0Var3.f33494c3 = Y;
            zu0Var.setPadding(paddingLeft, Z, paddingRight, Y);
            W.f24501s.y1(i10);
            W.f24500r.a0();
            int i12 = 0;
            while (true) {
                av0[] av0VarArr = this.f26948k0;
                if (i12 >= av0VarArr.length) {
                    break;
                }
                av0 av0Var = av0VarArr[i12];
                if (av0Var != null && ((i11 = av0Var.F) == 0 || p0(i11))) {
                    AndroidUtilities.updateVisibleRows(av0VarArr[i12].h);
                }
                i12++;
            }
            this.f26956o1 = true;
            if (this.f26958p1 == 0) {
                this.f26968t1[0].g(true);
            }
            this.f26954n1 = 0.0f;
            X0();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.I1.lock();
            ofFloat.addUpdateListener(new wt0(this, W, 1));
            ofFloat.addListener(new ei.y2(this, p0(W.F) ? 1 : 0, i10, 2));
            ofFloat.setInterpolator(js.f27627f);
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
        long j3 = this.f26947j1;
        org.telegram.ui.ActionBar.m2 m2Var = this.f26972v1;
        if (r02) {
            TLRPC.User user = MessagesController.getInstance(m2Var.getCurrentAccount()).getUser(Long.valueOf(j3));
            if (user == null || !user.bot || !user.bot_can_edit) {
                return false;
            }
            return true;
        } else if (!v0() && (m2Var == null || !m2Var.getMessagesController().getStoriesController().h(j3))) {
            return false;
        } else {
            return true;
        }
    }

    public final void C0(int i10, View view) {
        boolean z10;
        String string;
        int i11;
        ws0 ws0Var;
        int i12;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z11;
        String formatPluralString;
        String formatPluralString2;
        int i13;
        int i14;
        boolean z12;
        rv0 rv0Var = this.R;
        SparseArray[] sparseArrayArr = this.Z0;
        org.telegram.ui.ActionBar.m2 m2Var = this.f26972v1;
        boolean z13 = true;
        char c10 = 1;
        if (i10 == 101) {
            boolean p02 = p0(getSelectedTab());
            org.telegram.ui.ActionBar.c6 c6Var = this.F1;
            if (!p02 && getSelectedTab() != 13) {
                if (getSelectedTab() == 11) {
                    SavedMessagesController savedMessagesController = m2Var.getMessagesController().getSavedMessagesController();
                    final ArrayList arrayList = new ArrayList();
                    for (int i15 = 0; i15 < savedMessagesController.allDialogs.size(); i15++) {
                        long j3 = savedMessagesController.allDialogs.get(i15).dialogId;
                        if (rv0Var.f30257w.contains(Long.valueOf(j3))) {
                            arrayList.add(Long.valueOf(j3));
                        }
                    }
                    String str = "";
                    if (!arrayList.isEmpty()) {
                        Long l4 = (Long) arrayList.get(0);
                        long longValue = l4.longValue();
                        if (longValue == m2Var.getUserConfig().getClientUserId()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        int i16 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                        z11 = z12;
                        if (i16 < 0) {
                            TLRPC.Chat chat2 = m2Var.getMessagesController().getChat(Long.valueOf(-longValue));
                            z11 = z12;
                            if (chat2 != null) {
                                str = chat2.title;
                                z11 = z12;
                            }
                        } else if (i16 >= 0) {
                            TLRPC.User user2 = m2Var.getMessagesController().getUser(l4);
                            z11 = z12;
                            if (user2 != null) {
                                if (UserObject.isAnonymous(user2)) {
                                    str = LocaleController.getString(R.string.AnonymousForward);
                                    z11 = z12;
                                } else {
                                    str = UserObject.getUserName(user2);
                                    z11 = z12;
                                }
                            }
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
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
                    a2Var.R = formatPluralString;
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
                    a2Var.T = formatPluralString2;
                    alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.z1(this) {
                        public final hw0 f27936b;

                        {
                            this.f27936b = this;
                        }

                        @Override
                        public final void f(org.telegram.ui.ActionBar.a2 a2Var2, int i17) {
                            switch (r3) {
                                case 0:
                                    hw0 hw0Var = this.f27936b;
                                    org.telegram.ui.ActionBar.m2 m2Var2 = hw0Var.f26972v1;
                                    ai.m9 storiesController = m2Var2.getMessagesController().getStoriesController();
                                    long j10 = hw0Var.f26947j1;
                                    ArrayList arrayList2 = arrayList;
                                    storiesController.s(j10, arrayList2);
                                    zc.a0(m2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList2.size(), new Object[0])).j();
                                    hw0Var.L(false);
                                    return;
                                default:
                                    hw0 hw0Var2 = this.f27936b;
                                    hw0Var2.getClass();
                                    int i18 = 0;
                                    while (true) {
                                        ArrayList arrayList3 = arrayList;
                                        if (i18 < arrayList3.size()) {
                                            hw0Var2.f26972v1.getMessagesController().deleteSavedDialog(((Long) arrayList3.get(i18)).longValue());
                                            i18++;
                                        } else {
                                            hw0Var2.L(true);
                                            return;
                                        }
                                    }
                            }
                        }
                    });
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    m2Var.showDialog(a2Var);
                    TextView textView = (TextView) a2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20799q7, false));
                        return;
                    }
                    return;
                }
                long j10 = this.f26947j1;
                if (DialogObject.isEncryptedDialog(j10)) {
                    encryptedChat = org.telegram.messenger.v0.l(m2Var.getMessagesController(), j10);
                    user = null;
                    chat = null;
                } else if (DialogObject.isUserDialog(j10)) {
                    user = m2Var.getMessagesController().getUser(Long.valueOf(j10));
                    chat = null;
                    encryptedChat = null;
                } else {
                    chat = m2Var.getMessagesController().getChat(Long.valueOf(-j10));
                    user = null;
                    encryptedChat = null;
                }
                g5.y(m2Var, user, chat, encryptedChat, null, this.f26930c1, null, this.Z0, null, 0, 0, null, new bs0(this, 1), null, this.F1);
            } else if (sparseArrayArr[0] != null) {
                if (r0() && (ws0Var = this.U) != null && ws0Var.getCurrentList() != null) {
                    ai.v8 currentList = ws0Var.getCurrentList();
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
                        org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f20141a;
                        a2Var2.R = string2;
                        a2Var2.T = LocaleController.formatPluralString("DeleteBotPreviewsSubtitle", arrayList2.size(), new Object[0]);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new uz(this, currentList, arrayList2, 2));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new je0(12));
                        a2Var2.show();
                        a2Var2.h();
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
                    org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder3.f20141a;
                    a2Var3.R = string3;
                    a2Var3.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList3.size(), new Object[0]);
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1(this) {
                        public final hw0 f27936b;

                        {
                            this.f27936b = this;
                        }

                        @Override
                        public final void f(org.telegram.ui.ActionBar.a2 a2Var22, int i172) {
                            switch (r3) {
                                case 0:
                                    hw0 hw0Var = this.f27936b;
                                    org.telegram.ui.ActionBar.m2 m2Var2 = hw0Var.f26972v1;
                                    ai.m9 storiesController = m2Var2.getMessagesController().getStoriesController();
                                    long j102 = hw0Var.f26947j1;
                                    ArrayList arrayList22 = arrayList3;
                                    storiesController.s(j102, arrayList22);
                                    zc.a0(m2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList22.size(), new Object[0])).j();
                                    hw0Var.L(false);
                                    return;
                                default:
                                    hw0 hw0Var2 = this.f27936b;
                                    hw0Var2.getClass();
                                    int i182 = 0;
                                    while (true) {
                                        ArrayList arrayList32 = arrayList3;
                                        if (i182 < arrayList32.size()) {
                                            hw0Var2.f26972v1.getMessagesController().deleteSavedDialog(((Long) arrayList32.get(i182)).longValue());
                                            i182++;
                                        } else {
                                            hw0Var2.L(true);
                                            return;
                                        }
                                    }
                            }
                        }
                    });
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new je0(13));
                    a2Var3.show();
                    a2Var3.h();
                }
            }
        } else if (i10 == 100) {
            if (this.f26936e1 != null && m2Var.getMessagesController().isUserNoForwards(this.f26936e1)) {
                c50 c50Var = this.E1;
                if (c50Var != null) {
                    c50Var.setText(LocaleController.getString(R.string.ForwardsRestrictedInfoUser));
                    this.E1.f(view, true);
                    return;
                }
                return;
            }
            if (this.f26933d1 != null) {
                TLRPC.Chat chat3 = m2Var.getMessagesController().getChat(Long.valueOf(this.f26933d1.f19803id));
                if (m2Var.getMessagesController().isChatNoForwards(chat3)) {
                    c50 c50Var2 = this.E1;
                    if (c50Var2 != null) {
                        if (ChatObject.isChannel(chat3) && !chat3.megagroup) {
                            string = LocaleController.getString(R.string.ForwardsRestrictedInfoChannel);
                        } else {
                            string = LocaleController.getString(R.string.ForwardsRestrictedInfoGroup);
                        }
                        c50Var2.setText(string);
                        this.E1.f(view, true);
                        return;
                    }
                    return;
                }
            }
            if (j0()) {
                c50 c50Var3 = this.E1;
                if (c50Var3 != null) {
                    c50Var3.setText(LocaleController.getString("ForwardsRestrictedInfoBot", R.string.ForwardsRestrictedInfoBot));
                    this.E1.f(view, true);
                    return;
                }
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("canSelectTopics", true);
            bundle.putInt("dialogsType", 3);
            org.telegram.ui.vy vyVar = new org.telegram.ui.vy(bundle);
            vyVar.C2 = new cs0(this);
            m2Var.presentFragment(vyVar);
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
                    TLRPC.Chat chat4 = m2Var.getMessagesController().getChat(Long.valueOf(-dialogId));
                    if (chat4 != null && chat4.migrated_to != null) {
                        bundle2.putLong("migrated_to", dialogId);
                        dialogId = -chat4.migrated_to.channel_id;
                    }
                    bundle2.putLong("chat_id", -dialogId);
                }
                bundle2.putInt("message_id", messageObject.getId());
                bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                org.telegram.ui.eo eoVar = new org.telegram.ui.eo(bundle2);
                eoVar.L7 = messageObject.getId();
                long j11 = this.F;
                if (j11 != 0) {
                    ng.d.a(eoVar, MessagesStorage.TopicKey.of(dialogId, j11));
                    bundle2.putInt("message_id", messageObject.getId());
                }
                m2Var.presentFragment(eoVar, false);
            }
        } else if (i10 == 103 || i10 == 104) {
            if (getClosestTab() == 8) {
                pu0 pu0Var = this.f26929c0;
                if (pu0Var != null && pu0Var.f25795s != null) {
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
            SavedMessagesController savedMessagesController2 = m2Var.getMessagesController().getSavedMessagesController();
            ArrayList<Long> arrayList5 = new ArrayList<>();
            for (int i20 = 0; i20 < savedMessagesController2.allDialogs.size(); i20++) {
                long j12 = savedMessagesController2.allDialogs.get(i20).dialogId;
                if (rv0Var.f30257w.contains(Long.valueOf(j12))) {
                    arrayList5.add(Long.valueOf(j12));
                }
            }
            if (i10 == 103) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!savedMessagesController2.updatePinned(arrayList5, z10, true)) {
                m2Var.showDialog(new rg.j0(33, m2Var.getCurrentAccount(), getContext(), m2Var, null));
            } else {
                int i21 = 0;
                while (true) {
                    av0[] av0VarArr = this.f26948k0;
                    if (i21 >= av0VarArr.length) {
                        break;
                    }
                    av0 av0Var = av0VarArr[i21];
                    if (av0Var.F == 11) {
                        av0Var.f24503x.h1(0, 0);
                        break;
                    }
                    i21++;
                }
            }
            L(true);
        }
    }

    public boolean D() {
        return !(this instanceof s40);
    }

    public final boolean E() {
        av0 av0Var;
        av0[] av0VarArr = this.f26948k0;
        if (av0VarArr == null || (av0Var = av0VarArr[0]) == null) {
            return false;
        }
        if (this.f26949k1 && p0(av0Var.F)) {
            return false;
        }
        boolean p02 = p0(av0VarArr[0].F);
        int i10 = this.f26951m1[p02 ? 1 : 0];
        if (i10 == X(p02 ? 1 : 0, i10, false)) {
            return false;
        }
        return true;
    }

    public final void F() {
        xt0 xt0Var = this.I0;
        if (!xt0Var.d(xt0Var.getCurrentTabId())) {
            int firstTabId = xt0Var.getFirstTabId();
            xt0Var.setInitialTabId(firstTabId);
            this.f26948k0[0].F = firstTabId;
            m1(false);
        }
    }

    public final void F0() {
        ai.e9 e9Var;
        ai.e9 e9Var2;
        this.G1.removeAllObservers();
        pu0 pu0Var = this.f26929c0;
        if (pu0Var != null && (e9Var2 = pu0Var.f25795s) != null && e9Var2 != null) {
            e9Var2.z(pu0Var.v);
        }
        vs0 vs0Var = this.f26935e0;
        if (vs0Var != null && (e9Var = vs0Var.f25795s) != null && e9Var != null) {
            e9Var.z(vs0Var.v);
        }
        for (gw0 gw0Var : this.Y1.values()) {
            fw0 fw0Var = gw0Var.f26541c;
            ai.e9 e9Var3 = fw0Var.f25795s;
            if (e9Var3 != null && e9Var3 != null) {
                e9Var3.z(fw0Var.v);
            }
        }
    }

    public final void G(org.telegram.ui.Components.av0 r34, org.telegram.ui.Components.wm0 r35, s4.d0 r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hw0.G(org.telegram.ui.Components.av0, org.telegram.ui.Components.wm0, s4.d0):void");
    }

    public final void G0(int i10, View view, MessageObject messageObject, int i11) {
        TLRPC.WebPage webPage;
        String str;
        char c10;
        int i12;
        int i13;
        if (messageObject != null && !this.f26956o1) {
            ct0 ct0Var = this.W;
            if (ct0Var == null || !ct0Var.f36309w) {
                int i14 = 0;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                i14 = 0;
                String str2 = null;
                ai.e9 e9Var = null;
                boolean z15 = true;
                if (this.C1) {
                    int i15 = 8;
                    if (i11 != 8 || C()) {
                        if (messageObject.getDialogId() == this.f26947j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        SparseArray[] sparseArrayArr = this.Z0;
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            sparseArrayArr[c10].remove(messageObject.getId());
                            if (!messageObject.canDeleteMessage(false, null)) {
                                this.f26923a1--;
                            }
                        } else {
                            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                                sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                                if (!messageObject.canDeleteMessage(false, null)) {
                                    this.f26923a1++;
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
                            if (this.f26923a1 == 0) {
                                i12 = 0;
                            } else {
                                i12 = 8;
                            }
                            this.f26950l0.setVisibility(i12);
                            org.telegram.ui.ActionBar.u0 u0Var = this.f26969u0;
                            if (u0Var != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14 && sparseArrayArr[0].size() == 1) {
                                    i13 = 0;
                                } else {
                                    i13 = 8;
                                }
                                u0Var.setVisibility(i13);
                            }
                            org.telegram.ui.ActionBar.u0 u0Var2 = this.f26967t0;
                            if (u0Var2 != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                                    i15 = 0;
                                }
                                u0Var2.setVisibility(i15);
                            }
                            u1();
                        }
                        this.f26926b1 = false;
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
                        } else if (view instanceof org.telegram.ui.Cells.f2) {
                            org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z13 = true;
                            }
                            f2Var.c(z13, true);
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
                    ht0 ht0Var = this.f26963r1;
                    wv0[] wv0VarArr = this.f26968t1;
                    org.telegram.ui.ActionBar.m2 m2Var = this.f26972v1;
                    if (i11 == 0) {
                        wv0 wv0Var = wv0VarArr[i11];
                        int i16 = i10 - wv0Var.f32563m;
                        if (i16 >= 0 && i16 < wv0Var.f32553a.size()) {
                            PhotoViewer.t1().K2(null, m2Var, null);
                            PhotoViewer.t1().b2(wv0VarArr[i11].f32553a, i16, this.f26947j1, this.f26930c1, this.F, ht0Var);
                        }
                    } else if (i11 != 2 && i11 != 4) {
                        if (i11 == 5) {
                            PhotoViewer.t1().K2(null, m2Var, null);
                            int indexOf = wv0VarArr[i11].f32553a.indexOf(messageObject);
                            if (indexOf < 0) {
                                PhotoViewer.t1().b2(org.telegram.messenger.v0.k(messageObject), 0, 0L, 0L, 0L, ht0Var);
                            } else {
                                PhotoViewer.t1().b2(wv0VarArr[i11].f32553a, indexOf, this.f26947j1, this.f26930c1, this.F, ht0Var);
                            }
                        } else if (i11 == 1) {
                            if (view instanceof org.telegram.ui.Cells.j7) {
                                org.telegram.ui.Cells.j7 j7Var2 = (org.telegram.ui.Cells.j7) view;
                                TLRPC.Document document = messageObject.getDocument();
                                if (j7Var2.G) {
                                    if (messageObject.canPreviewDocument()) {
                                        PhotoViewer.t1().K2(null, m2Var, null);
                                        int indexOf2 = wv0VarArr[i11].f32553a.indexOf(messageObject);
                                        if (indexOf2 < 0) {
                                            PhotoViewer.t1().b2(org.telegram.messenger.v0.k(messageObject), 0, 0L, 0L, 0L, ht0Var);
                                            return;
                                        }
                                        PhotoViewer.t1().b2(wv0VarArr[i11].f32553a, indexOf2, this.f26947j1, this.f26930c1, this.F, ht0Var);
                                        return;
                                    }
                                    AndroidUtilities.openDocument(messageObject, m2Var.getParentActivity(), m2Var);
                                } else if (!j7Var2.F) {
                                    MessageObject message = j7Var2.getMessage();
                                    message.putInDownloadsStore = true;
                                    m2Var.getFileLoader().loadFile(document, message, 0, 0);
                                    j7Var2.f(true);
                                } else {
                                    m2Var.getFileLoader().cancelLoadFile(document);
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
                                            m2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                            return;
                                        }
                                        return;
                                    }
                                    String str3 = webPage.embed_url;
                                    if (str3 != null && str3.length() != 0) {
                                        ov.J(m2Var, messageObject, this.f26963r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
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
                            ew0 k12 = k1(i11);
                            if (k12 != null) {
                                e9Var = k12.f25795s;
                            }
                            if (e9Var != null) {
                                ai.kc orCreateStoryViewer = m2Var.getOrCreateStoryViewer();
                                Context context = getContext();
                                int id2 = messageObject.getId();
                                ai.v9 a2 = ai.v9.a(this.f26948k0[0].h);
                                a2.f1830e = new ew(e9Var, 19);
                                if ((m2Var instanceof ProfileActivity) && ((ProfileActivity) m2Var).f34176s1) {
                                    i14 = AndroidUtilities.dp(68.0f);
                                }
                                a2.f1834s += i14;
                                orCreateStoryViewer.C(context, id2, e9Var, a2);
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
        s4.i0 i0Var;
        boolean z10;
        ws0 ws0Var;
        float f10;
        boolean z11;
        av0[] av0VarArr = this.f26948k0;
        int i10 = av0VarArr[0].F;
        if (i10 == 13 && (ws0Var = this.U) != null) {
            View currentView = ws0Var.f3944n.getCurrentView();
            if (currentView instanceof bi.u) {
                bi.u uVar = (bi.u) currentView;
                bi.m mVar = uVar.v;
                bi.j jVar = uVar.f3926f;
                if (uVar.f3922a != null && uVar.getParent() != null) {
                    if (!uVar.f3923b || uVar.K) {
                        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                            if (motionEvent.getActionMasked() == 2 && (uVar.K || uVar.M)) {
                                int i11 = -1;
                                int i12 = -1;
                                for (int i13 = 0; i13 < motionEvent.getPointerCount(); i13++) {
                                    if (uVar.N == motionEvent.getPointerId(i13)) {
                                        i11 = i13;
                                    }
                                    if (uVar.O == motionEvent.getPointerId(i13)) {
                                        i12 = i13;
                                    }
                                }
                                if (i11 != -1 && i12 != -1) {
                                    float hypot = ((float) Math.hypot(motionEvent.getX(i12) - motionEvent.getX(i11), motionEvent.getY(i12) - motionEvent.getY(i11))) / uVar.P;
                                    uVar.Q = hypot;
                                    if (!uVar.K && (hypot > 1.01f || hypot < 0.99f)) {
                                        uVar.K = true;
                                        if (hypot > 1.0f) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        uVar.R = z11;
                                        uVar.b(z11);
                                    }
                                    if (uVar.K) {
                                        boolean z12 = uVar.R;
                                        if ((z12 && uVar.Q < 1.0f) || (!z12 && uVar.Q > 1.0f)) {
                                            uVar.f3924c = 0.0f;
                                        } else {
                                            if (z12) {
                                                f10 = org.telegram.messenger.v0.y(2.0f, uVar.Q, 1.0f, 1.0f);
                                            } else {
                                                f10 = (1.0f - uVar.Q) / 0.5f;
                                            }
                                            uVar.f3924c = Math.max(0.0f, Math.min(1.0f, f10));
                                        }
                                        float f11 = uVar.f3924c;
                                        int i14 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
                                        if (i14 == 0 || f11 == 0.0f) {
                                            if (i14 == 0) {
                                                int i15 = uVar.f3925e;
                                                int ceil = (((int) Math.ceil(uVar.S / uVar.f3925e)) * i15) + ((int) ((uVar.W.G.f26983z1 / (jVar.getMeasuredWidth() - ((int) (jVar.getMeasuredWidth() / uVar.f3925e)))) * (i15 - 1)));
                                                if (ceil >= mVar.h()) {
                                                    ceil = mVar.h() - 1;
                                                }
                                                uVar.S = ceil;
                                            }
                                            uVar.a();
                                            if (uVar.f3924c == 0.0f) {
                                                uVar.R = !uVar.R;
                                            }
                                            uVar.b(uVar.R);
                                            uVar.P = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                        }
                                        jVar.invalidate();
                                    }
                                } else {
                                    uVar.L = false;
                                    uVar.M = false;
                                    uVar.K = false;
                                    uVar.a();
                                    return false;
                                }
                            } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((uVar.N == motionEvent.getPointerId(0) && uVar.O == motionEvent.getPointerId(1)) || (uVar.N == motionEvent.getPointerId(1) && uVar.O == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && uVar.K) {
                                uVar.M = false;
                                uVar.L = false;
                                uVar.K = false;
                                uVar.a();
                            }
                        } else {
                            if (uVar.L && !uVar.K && motionEvent.getPointerCount() == 2) {
                                uVar.P = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                uVar.Q = 1.0f;
                                uVar.N = motionEvent.getPointerId(0);
                                uVar.O = motionEvent.getPointerId(1);
                                jVar.I0(false);
                                jVar.cancelLongPress();
                                jVar.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                View view = (View) uVar.getParent();
                                uVar.U = (int) ((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - uVar.getX());
                                int y3 = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - uVar.getY());
                                int i16 = uVar.U;
                                Rect rect = uVar.V;
                                uVar.S = -1;
                                int i17 = y3 + jVar.V2;
                                for (int i18 = 0; i18 < jVar.getChildCount(); i18++) {
                                    View childAt = jVar.getChildAt(i18);
                                    childAt.getHitRect(rect);
                                    if (rect.contains(i16, i17)) {
                                        uVar.S = RecyclerView.S(childAt);
                                        uVar.T = childAt.getTop();
                                    }
                                }
                                uVar.M = true;
                            }
                            if (motionEvent.getActionMasked() == 0 && (motionEvent.getY() - ((View) uVar.getParent()).getY()) - uVar.getY() > 0.0f) {
                                uVar.L = true;
                            }
                        }
                        return uVar.K;
                    }
                    return true;
                }
            }
            return false;
        }
        if ((i10 == 0 || p0(i10)) && getParent() != null) {
            if (!this.f26956o1 || this.f26921a) {
                if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                    if (motionEvent.getActionMasked() == 2 && (this.f26921a || this.f26928c)) {
                        int i19 = -1;
                        int i20 = -1;
                        for (int i21 = 0; i21 < motionEvent.getPointerCount(); i21++) {
                            if (this.f26934e == motionEvent.getPointerId(i21)) {
                                i19 = i21;
                            }
                            if (this.f26937f == motionEvent.getPointerId(i21)) {
                                i20 = i21;
                            }
                        }
                        if (i19 != -1 && i20 != -1) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(i20) - motionEvent.getX(i19), motionEvent.getY(i20) - motionEvent.getY(i19))) / this.h;
                            this.f26952n = hypot2;
                            if (!this.f26921a && (hypot2 > 1.01f || hypot2 < 0.99f)) {
                                this.f26921a = true;
                                if (hypot2 > 1.0f) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                this.f26961r = z10;
                                e1(z10);
                            }
                            if (this.f26921a) {
                                boolean z13 = this.f26961r;
                                if ((z13 && this.f26952n < 1.0f) || (!z13 && this.f26952n > 1.0f)) {
                                    this.f26954n1 = 0.0f;
                                } else {
                                    if (z13) {
                                        f7 = org.telegram.messenger.v0.y(2.0f, this.f26952n, 1.0f, 1.0f);
                                    } else {
                                        f7 = (1.0f - this.f26952n) / 0.5f;
                                    }
                                    this.f26954n1 = Math.max(0.0f, Math.min(1.0f, f7));
                                }
                                float f12 = this.f26954n1;
                                if (f12 == 1.0f || f12 == 0.0f) {
                                    if (p0(this.f26958p1)) {
                                        i0Var = k1(this.f26958p1);
                                    } else {
                                        i0Var = this.H;
                                    }
                                    if (this.f26954n1 == 1.0f) {
                                        int i22 = this.f26960q1;
                                        int ceil2 = (((int) Math.ceil(this.f26964s / this.f26960q1)) * i22) + ((int) ((this.f26983z1 / (av0VarArr[0].h.getMeasuredWidth() - ((int) (av0VarArr[0].h.getMeasuredWidth() / this.f26960q1)))) * (i22 - 1)));
                                        if (ceil2 >= i0Var.h()) {
                                            ceil2 = i0Var.h() - 1;
                                        }
                                        this.f26964s = ceil2;
                                    }
                                    T();
                                    if (this.f26954n1 == 0.0f) {
                                        this.f26961r = !this.f26961r;
                                    }
                                    e1(this.f26961r);
                                    this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                av0VarArr[0].h.invalidate();
                                av0 av0Var = av0VarArr[0];
                                if (av0Var.G != null) {
                                    av0Var.invalidate();
                                }
                            }
                        } else {
                            this.f26924b = false;
                            this.f26928c = false;
                            this.f26921a = false;
                            T();
                            return false;
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.f26934e == motionEvent.getPointerId(0) && this.f26937f == motionEvent.getPointerId(1)) || (this.f26934e == motionEvent.getPointerId(1) && this.f26937f == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.f26921a) {
                        this.f26928c = false;
                        this.f26924b = false;
                        this.f26921a = false;
                        T();
                    }
                } else {
                    if (this.f26924b && !this.f26921a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.f26952n = 1.0f;
                        this.f26934e = motionEvent.getPointerId(0);
                        this.f26937f = motionEvent.getPointerId(1);
                        av0VarArr[0].h.I0(false);
                        av0VarArr[0].h.cancelLongPress();
                        av0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.f26973w = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - av0VarArr[0].getX());
                        int y10 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - av0VarArr[0].getY());
                        int i23 = this.f26973w;
                        this.f26964s = -1;
                        int i24 = y10 + av0VarArr[0].h.V2;
                        if (getY() != 0.0f && this.E == 1) {
                            i24 = 0;
                        }
                        for (int i25 = 0; i25 < av0VarArr[0].h.getChildCount(); i25++) {
                            View childAt2 = av0VarArr[0].h.getChildAt(i25);
                            Rect rect2 = this.f26976x;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i23, i24)) {
                                av0VarArr[0].h.getClass();
                                this.f26964s = RecyclerView.S(childAt2);
                                this.v = childAt2.getTop();
                            }
                        }
                        if (this.D1.T() && this.f26964s == -1) {
                            this.f26964s = (int) (((this.f26951m1[p0(av0VarArr[0].F) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i23 / av0VarArr[0].h.getMeasuredWidth(), 0.0f))) + av0VarArr[0].f24503x.L0());
                            this.v = 0;
                        }
                        this.f26928c = true;
                    }
                    if (motionEvent.getActionMasked() == 0 && ((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - av0VarArr[0].getY() > 0.0f) {
                        this.f26924b = true;
                    }
                }
                return this.f26921a;
            }
            return true;
        }
        return false;
    }

    public final boolean H0(MessageObject messageObject, View view, int i10, boolean z10) {
        ct0 ct0Var;
        char c10;
        int i11;
        int i12;
        final TL_stories.StoryItem storyItem;
        int i13;
        pu0 pu0Var;
        ai.e9 e9Var;
        if (!this.C1) {
            org.telegram.ui.ActionBar.m2 m2Var = this.f26972v1;
            if (m2Var.getParentActivity() != null && messageObject != null && ((ct0Var = this.W) == null || !ct0Var.f36309w)) {
                AndroidUtilities.hideKeyboard(m2Var.getParentActivity().getCurrentFocus());
                long j3 = this.f26947j1;
                int i14 = 8;
                if (z10 && ((w0(getClosestTab()) || getClosestTab() == 8) && !this.C1)) {
                    if (view instanceof org.telegram.ui.Cells.t7) {
                        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                        t7Var.k(t7Var.f22850n, t7Var.f22855r, true);
                    }
                    TL_stories.StoryItem storyItem2 = messageObject.storyItem;
                    if (storyItem2 != null) {
                        HashSet hashSet = new HashSet();
                        ArrayList<Integer> arrayList = storyItem2.albums;
                        if (arrayList != null) {
                            hashSet.addAll(arrayList);
                        }
                        boolean w02 = w0(getClosestTab());
                        s80 I = s80.I(m2Var, view);
                        s80 J = I.J();
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.pu0(I, 26), false);
                        J.k();
                        s80.f(J, getStoriesController().B(j3, true), hashSet, true, new mh0(this, storyItem2, I, 3), new ai.f4(this, hashSet, storyItem2, I, 10));
                        I.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddToAlbum), new ei.m2(I, J, 9), false);
                        I.k();
                        I.c(R.drawable.msg_select, LocaleController.getString(R.string.StoriesAlbumMenuSelect), new ai.d9(this, messageObject, view, i10, 24), false);
                        if (w02) {
                            int h12 = h1(getClosestTab());
                            String w10 = getStoriesController().w(h12, j3);
                            I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new nd(this, h12, 8), false);
                            storyItem = storyItem2;
                            I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.StoriesAlbumMenuRemoveFromAlbum), new ai.d9(this, h12, storyItem, w10, 25), false);
                            i13 = 3;
                        } else {
                            storyItem = storyItem2;
                            if (getClosestTab() == 8 && (pu0Var = this.f26929c0) != null && (e9Var = pu0Var.f25795s) != null) {
                                if (e9Var.m(storyItem.f20041id)) {
                                    I.c(R.drawable.chats_unpin, LocaleController.getString(R.string.StoriesAlbumMenuUnpin), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r1) {
                                                case 0:
                                                    hw0 hw0Var = this;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hw0Var.getContext(), 0, hw0Var.F1);
                                                    alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                    alertDialog$Builder.f20141a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ls0(hw0Var, storyItem));
                                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new je0(14));
                                                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
                                                    a2Var.show();
                                                    a2Var.h();
                                                    return;
                                                case 1:
                                                    hw0 hw0Var2 = this;
                                                    hw0Var2.getClass();
                                                    hw0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20041id))), false);
                                                    return;
                                                case 2:
                                                    hw0 hw0Var3 = this;
                                                    hw0Var3.getClass();
                                                    hw0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20041id))), true);
                                                    return;
                                                default:
                                                    hw0.h(this, storyItem);
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
                                                    hw0 hw0Var = this;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hw0Var.getContext(), 0, hw0Var.F1);
                                                    alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                    alertDialog$Builder.f20141a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ls0(hw0Var, storyItem));
                                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new je0(14));
                                                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
                                                    a2Var.show();
                                                    a2Var.h();
                                                    return;
                                                case 1:
                                                    hw0 hw0Var2 = this;
                                                    hw0Var2.getClass();
                                                    hw0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20041id))), false);
                                                    return;
                                                case 2:
                                                    hw0 hw0Var3 = this;
                                                    hw0Var3.getClass();
                                                    hw0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20041id))), true);
                                                    return;
                                                default:
                                                    hw0.h(this, storyItem);
                                                    return;
                                            }
                                        }
                                    }, false);
                                }
                            }
                            i13 = 3;
                            I.c(R.drawable.msg_archive, LocaleController.getString(R.string.StoriesAlbumMenuArchive), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r1) {
                                        case 0:
                                            hw0 hw0Var = this;
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hw0Var.getContext(), 0, hw0Var.F1);
                                            alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                            alertDialog$Builder.f20141a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ls0(hw0Var, storyItem));
                                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new je0(14));
                                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
                                            a2Var.show();
                                            a2Var.h();
                                            return;
                                        case 1:
                                            hw0 hw0Var2 = this;
                                            hw0Var2.getClass();
                                            hw0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20041id))), false);
                                            return;
                                        case 2:
                                            hw0 hw0Var3 = this;
                                            hw0Var3.getClass();
                                            hw0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20041id))), true);
                                            return;
                                        default:
                                            hw0.h(this, storyItem);
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
                                        hw0 hw0Var = this;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hw0Var.getContext(), 0, hw0Var.F1);
                                        alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                        alertDialog$Builder.f20141a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ls0(hw0Var, storyItem));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new je0(14));
                                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
                                        a2Var.show();
                                        a2Var.h();
                                        return;
                                    case 1:
                                        hw0 hw0Var2 = this;
                                        hw0Var2.getClass();
                                        hw0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20041id))), false);
                                        return;
                                    case 2:
                                        hw0 hw0Var3 = this;
                                        hw0Var3.getClass();
                                        hw0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f20041id))), true);
                                        return;
                                    default:
                                        hw0.h(this, storyItem);
                                        return;
                                }
                            }
                        }, true);
                        I.f30454i = i13;
                        I.f30474u = true;
                        I.v = true;
                        I.L = true;
                        I.M = i13;
                        Point point = AndroidUtilities.displaySize;
                        Point point2 = AndroidUtilities.displaySize;
                        int min = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point2.x, point2.y) * 0.4333f) * 3.0f) / 4.0f));
                        I.N = min;
                        I.O = (min * 4) / i13;
                        I.f30473t = true;
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
                        this.f26923a1++;
                    }
                    if (this.f26923a1 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    this.f26950l0.setVisibility(i11);
                    org.telegram.ui.ActionBar.u0 u0Var = this.f26969u0;
                    if (u0Var != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        } else {
                            i12 = 8;
                        }
                        u0Var.setVisibility(i12);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var2 = this.f26967t0;
                    if (u0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i14 = 0;
                        }
                        u0Var2.setVisibility(i14);
                    }
                    this.A0.a(1, false);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    int i15 = 0;
                    while (true) {
                        ArrayList arrayList3 = this.N0;
                        if (i15 >= arrayList3.size()) {
                            break;
                        }
                        View view2 = (View) arrayList3.get(i15);
                        AndroidUtilities.clearDrawableAnimation(view2);
                        arrayList2.add(ObjectAnimator.ofFloat(view2, View.SCALE_Y, 0.1f, 1.0f));
                        i15++;
                    }
                    animatorSet.playTogether(arrayList2);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    this.f26926b1 = false;
                    if (view instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.u7) {
                        ((org.telegram.ui.Cells.u7) view).b(i10, true);
                    } else if (view instanceof org.telegram.ui.Cells.n7) {
                        ((org.telegram.ui.Cells.n7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.i7) {
                        ((org.telegram.ui.Cells.i7) view).e(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.f2) {
                        ((org.telegram.ui.Cells.f2) view).c(true, true);
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
        av0[] av0VarArr = this.f26948k0;
        av0 av0Var = av0VarArr[0];
        if (av0Var != null && av0VarArr[1] != null) {
            float f10 = 0.0f;
            ct0 ct0Var = this.W;
            if (ct0Var != null) {
                if (p0(av0Var.F) && av0VarArr[0].F != 9) {
                    c10 = 1;
                } else {
                    c10 = 0;
                }
                if (av0VarArr[1].getVisibility() == 0) {
                    if (p0(av0VarArr[1].F) && av0VarArr[1].F != 9) {
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
                        measuredWidth = av0VarArr[0].getMeasuredWidth();
                    }
                    ct0Var.setTranslationX(measuredWidth);
                } else {
                    ct0Var.setTranslationX(av0VarArr[c10 ^ 1].getTranslationX());
                    abs = 1.0f - (Math.abs(ct0Var.getTranslationX()) / ct0Var.getMeasuredWidth());
                }
                float f11 = 0.0f;
                for (int i10 = 0; i10 < av0VarArr.length; i10++) {
                    if (av0VarArr[i10].getVisibility() == 0) {
                        gt0 gt0Var = av0VarArr[i10].h;
                        if (gt0Var.getChildCount() == 0) {
                            childAt = null;
                        } else {
                            childAt = gt0Var.getChildAt(0);
                        }
                        if (childAt == null) {
                            R = -1;
                        } else {
                            R = RecyclerView.R(childAt);
                        }
                        if (R == 0) {
                            f7 = childAt.getY() - gt0Var.getPaddingTop();
                        } else if (gt0Var.getChildCount() == 0) {
                            f7 = 0.0f;
                        } else {
                            f7 = -AndroidUtilities.dp(48.0f);
                        }
                        f11 += Utilities.clamp01(1.0f - (av0VarArr[i10].getTranslationX() / av0VarArr[i10].getMeasuredWidth())) * f7;
                    }
                }
                float clamp01 = Utilities.clamp01(1.0f - ((-f11) / AndroidUtilities.dpf2(48.0f)));
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
                ct0Var.setAlpha(clamp01);
                ct0Var.setScaleX(lerp);
                ct0Var.setScaleY(lerp);
                ct0Var.setTranslationY(this.K1 + f11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hw0.J():boolean");
    }

    public final void J0(float f7) {
        av0 av0Var;
        int i10;
        int i11;
        av0 av0Var2;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        av0[] av0VarArr = this.f26948k0;
        if (i12 != 0 || av0VarArr[1].getVisibility() == 0) {
            if (this.f26943h1) {
                av0VarArr[0].setTranslationX((-f7) * av0Var2.getMeasuredWidth());
                av0VarArr[1].setTranslationX(av0VarArr[0].getMeasuredWidth() - (av0VarArr[0].getMeasuredWidth() * f7));
            } else {
                av0VarArr[0].setTranslationX(av0Var.getMeasuredWidth() * f7);
                av0VarArr[1].setTranslationX((av0VarArr[0].getMeasuredWidth() * f7) - av0VarArr[0].getMeasuredWidth());
            }
            M0(getTabProgress());
            float a02 = a0(f7);
            this.f26957p0 = a02;
            int i13 = 4;
            if (a02 != 0.0f && D() && !q0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            this.f26962r0.setVisibility(i10);
            org.telegram.ui.ActionBar.u0 u0Var = this.f26953n0;
            if (u0Var != null && !D()) {
                if (v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                u0Var.setVisibility(i11);
                this.f26955o0 = 0.0f;
            } else {
                this.f26955o0 = b0(f7);
                t1();
            }
            q1(false);
            if (i12 == 0) {
                av0 av0Var3 = av0VarArr[0];
                av0VarArr[0] = av0VarArr[1];
                av0VarArr[1] = av0Var3;
                av0Var3.setVisibility(8);
                if (u0Var != null && this.f26977x0 == 2) {
                    if (v0()) {
                        i13 = 8;
                    }
                    u0Var.setVisibility(i13);
                }
                this.f26977x0 = 0;
                f1();
            }
        }
    }

    public final void K() {
        ct ctVar = this.P0;
        if (ctVar != null) {
            ct0 ct0Var = this.W;
            float f7 = 0.0f;
            if (ct0Var != null) {
                f7 = 0.0f + (ct0Var.getVisibilityFactor() * AndroidUtilities.dp(38.0f) * (1.0f - Math.abs(ct0Var.getTranslationX() / ct0Var.getMeasuredWidth())));
            }
            ctVar.setTranslationY(this.K1 + f7);
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
        this.f26923a1 = 0;
        D0(sparseArrayArr[0]);
        ws0 ws0Var = this.U;
        if (ws0Var != null) {
            ws0Var.h();
            ws0Var.j();
        }
        b1(false);
        r1(z10);
        rv0 rv0Var = this.R;
        if (rv0Var != null) {
            rv0Var.f30257w.clear();
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
        cw0 cw0Var = this.f26935e0.f25796w;
        if (cw0Var != null) {
            if (z10 && getClosestTab() == 9) {
                z13 = true;
            } else {
                z13 = false;
            }
            cw0Var.b(z13);
        }
        cw0 cw0Var2 = this.f26929c0.f25796w;
        if (cw0Var2 != null) {
            if (z10 && getClosestTab() == 8) {
                z12 = true;
            } else {
                z12 = false;
            }
            cw0Var2.b(z12);
        }
        for (gw0 gw0Var : this.Y1.values()) {
            fw0 fw0Var = gw0Var.f26541c;
            if (fw0Var.f25795s != null) {
                cw0 cw0Var3 = fw0Var.f25796w;
                if (z10 && getClosestTab() == gw0Var.f26539a) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                cw0Var3.b(z11);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.f26953n0;
        if (u0Var != null) {
            ut0 ut0Var = this.J0;
            if (ut0Var != null && ut0Var.a() && getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            u0Var.setSearchFieldHint(LocaleController.getString(i10));
        }
        I();
    }

    public void M0(float f7) {
        E0();
    }

    public boolean N() {
        return this instanceof s40;
    }

    public final boolean O(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x10 = (-view.getX()) - getX();
        av0[] av0VarArr = this.f26948k0;
        motionEvent.offsetLocation(x10 - av0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - av0VarArr[0].getY()) - av0VarArr[0].h.getFastScroll().getY());
        return av0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public final void O0(org.telegram.ui.ActionBar.m2 m2Var, long j3, int i10) {
        new org.telegram.ui.a81(m2Var, j3, this.f26951m1[1], new vc(this, j3, i10)).show();
    }

    public void P(Canvas canvas, float f7, Rect rect, Paint paint) {
        canvas.drawRect(rect, paint);
    }

    public final void P0(org.telegram.ui.ActionBar.m2 m2Var, long j3, int i10) {
        g5.u0(m2Var, LocaleController.getString(R.string.Delete), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesAlbumMenuDeleteAlbumAsk, getStoriesController().w(i10, j3))), LocaleController.getString(R.string.Delete), true, new ai.b8(this, j3, i10, 7));
    }

    public final void Q(Canvas canvas, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            av0[] av0VarArr = this.f26948k0;
            if (i10 < av0VarArr.length) {
                av0 av0Var = av0VarArr[i10];
                if (av0Var != null && av0Var.getVisibility() == 0) {
                    for (int i11 = 0; i11 < av0VarArr[i10].h.getChildCount(); i11++) {
                        View childAt = av0VarArr[i10].h.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + av0VarArr[i10].h.V2) {
                            int save = canvas.save();
                            canvas.translate(childAt.getX() + av0VarArr[i10].getX(), childAt.getY() + av0VarArr[i10].h.getY() + av0VarArr[i10].getY() + getY());
                            childAt.draw(canvas);
                            if (arrayList != null && (childAt instanceof vw0)) {
                                arrayList.add((vw0) childAt);
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

    public final void Q0(org.telegram.ui.ActionBar.m2 m2Var, long j3, int i10) {
        String w10 = getStoriesController().w(i10, j3);
        Context context = m2Var.getContext();
        org.telegram.ui.ActionBar.c6 resourceProvider = m2Var.getResourceProvider();
        j2.d dVar = new j2.d(this, j3, i10, 6);
        Pattern pattern = g5.f26280a;
        g5.Q(context, m2Var, LocaleController.getString(R.string.StoriesAlbumRename), LocaleController.getString(R.string.StoriesAlbumRenameHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), w10, 12, LocaleController.getString(R.string.Rename), resourceProvider, dVar);
    }

    public final boolean R(int i10) {
        wv0[] wv0VarArr = this.f26970u1.f33501n;
        if (wv0VarArr == null) {
            return false;
        }
        wv0[] wv0VarArr2 = this.f26968t1;
        if (i10 == 0) {
            wv0 wv0Var = wv0VarArr2[i10];
            if (!wv0Var.h) {
                int[] iArr = wv0Var.f32557f;
                int[] iArr2 = wv0VarArr[i10].f32557f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = wv0VarArr2[i10].f32557f;
            int[] iArr4 = wv0VarArr[i10].f32557f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        wv0VarArr2[i10].f32553a.addAll(wv0VarArr[i10].f32553a);
        wv0VarArr2[i10].f32555c.addAll(wv0VarArr[i10].f32555c);
        for (Map.Entry entry : wv0VarArr[i10].d.entrySet()) {
            wv0VarArr2[i10].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i11 = 0; i11 < 2; i11++) {
            wv0VarArr2[i10].f32554b[i11] = wv0VarArr[i10].f32554b[i11].clone();
            wv0 wv0Var2 = wv0VarArr2[i10];
            int[] iArr5 = wv0Var2.f32560j;
            wv0 wv0Var3 = wv0VarArr[i10];
            iArr5[i11] = wv0Var3.f32560j[i11];
            wv0Var2.f32559i[i11] = wv0Var3.f32559i[i11];
        }
        wv0VarArr2[i10].f32556e.addAll(wv0VarArr[i10].f32556e);
        return !wv0VarArr[i10].f32553a.isEmpty();
    }

    public final void R0(String str) {
        boolean shouldShowUrlInAlert = AndroidUtilities.shouldShowUrlInAlert(str);
        org.telegram.ui.ActionBar.m2 m2Var = this.f26972v1;
        if (shouldShowUrlInAlert) {
            g5.p0(m2Var, str, true, true);
        } else {
            of.f.s(m2Var.getParentActivity(), str);
        }
    }

    public final void S(int i10, wm0 wm0Var, boolean z10) {
        ArrayList arrayList = this.f26968t1[i10].f32556e;
        int L0 = ((s4.d0) wm0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            fv0 fv0Var = null;
            if (arrayList != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (L0 <= ((fv0) arrayList.get(i11)).f26179b) {
                        fv0Var = (fv0) arrayList.get(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                if (fv0Var == null) {
                    fv0Var = (fv0) hg.c.h(1, arrayList);
                }
            }
            if (fv0Var != null) {
                y0(i10, fv0Var.d, fv0Var.f26179b + 1, z10);
            }
        }
    }

    public int S0() {
        return -1;
    }

    public final void T() {
        av0[] av0VarArr;
        av0 av0Var;
        boolean z10;
        int i10;
        s4.i0 adapter;
        if (this.f26956o1) {
            int i11 = 0;
            while (true) {
                av0VarArr = this.f26948k0;
                if (i11 < av0VarArr.length) {
                    av0Var = av0VarArr[i11];
                    if (av0Var.F == this.f26958p1) {
                        break;
                    }
                    i11++;
                } else {
                    av0Var = null;
                    break;
                }
            }
            if (av0Var != null) {
                boolean p02 = p0(av0Var.F);
                float f7 = this.f26954n1;
                float f10 = 1.0f;
                int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                wv0[] wv0VarArr = this.f26968t1;
                if (i12 == 0) {
                    this.f26956o1 = false;
                    int i13 = this.f26960q1;
                    int[] iArr = this.f26951m1;
                    iArr[p02 ? 1 : 0] = i13;
                    if (!p02) {
                        SharedConfig.setMediaColumnsCount(i13);
                    } else if (c0(av0Var.F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(this.f26960q1);
                    }
                    for (int i14 = 0; i14 < av0VarArr.length; i14++) {
                        av0 av0Var2 = av0VarArr[i14];
                        if (av0Var2 != null && av0Var2.h != null && (((i10 = av0Var2.F) == 0 || p0(i10)) && (adapter = av0VarArr[i14].h.getAdapter()) != null)) {
                            int h = adapter.h();
                            if (i14 == 0) {
                                wv0VarArr[0].g(false);
                            }
                            av0VarArr[i14].f24500r.setVisibility(8);
                            av0VarArr[i14].f24503x.y1(iArr[p02 ? 1 : 0]);
                            av0VarArr[i14].h.a0();
                            av0VarArr[i14].h.invalidate();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(av0VarArr[i14].h);
                            } else {
                                adapter.l();
                            }
                        }
                    }
                    if (this.f26964s >= 0) {
                        for (int i15 = 0; i15 < av0VarArr.length; i15++) {
                            av0 av0Var3 = av0VarArr[i15];
                            if (av0Var3.F == this.f26958p1) {
                                View m10 = av0Var3.f24501s.m(this.f26964s);
                                if (m10 != null) {
                                    this.v = m10.getTop();
                                }
                                av0 av0Var4 = av0VarArr[i15];
                                av0Var4.f24503x.h1(this.f26964s, (-av0Var4.h.getPaddingTop()) + this.v);
                            }
                        }
                        return;
                    }
                    X0();
                } else if (f7 == 0.0f) {
                    this.f26956o1 = false;
                    if (this.f26958p1 == 0) {
                        wv0VarArr[0].g(false);
                    }
                    av0Var.f24500r.setVisibility(8);
                    av0Var.h.invalidate();
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
                    ofFloat.addUpdateListener(new wt0(this, av0Var, 0));
                    ofFloat.addListener(new org.telegram.ui.ij(this, z10, p02 ? 1 : 0, av0Var));
                    ofFloat.setInterpolator(js.f27627f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                }
            }
        }
    }

    public final void T0(ArrayList arrayList, boolean z10) {
        boolean z11;
        boolean z12;
        pu0 pu0Var = this.f26929c0;
        if (pu0Var != null && pu0Var.f25795s != null) {
            org.telegram.ui.ActionBar.m2 m2Var = this.f26972v1;
            if (z10 && arrayList.size() > m2Var.getMessagesController().storiesPinnedToTopCountMax) {
                zc.a0(m2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", m2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
                return;
            }
            ai.e9 e9Var = pu0Var.f25795s;
            int i10 = e9Var.f893c;
            ArrayList arrayList2 = e9Var.f896g;
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
                    e9Var.d(true);
                    TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                    tL_togglePinnedToTop.f20054id.addAll(arrayList2);
                    tL_togglePinnedToTop.peer = MessagesController.getInstance(i10).getInputPeer(e9Var.d);
                    ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new ai.v7(2));
                }
                z13 = z11;
            }
            if (z13) {
                zc.a0(m2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", m2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
            } else if (z10) {
                zc.a0(m2Var).M(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinned", arrayList.size(), new Object[0])), LocaleController.formatPluralString("StoriesPinnedText", arrayList.size(), new Object[0]), R.raw.ic_pin).j();
            } else {
                zc.a0(m2Var).Q(R.raw.ic_unpin, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesUnpinned", arrayList.size(), new Object[0]))).j();
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
        av0 av0Var;
        ws0 ws0Var;
        int i11;
        int i12;
        int closestTab = getClosestTab();
        xt0 xt0Var = this.I0;
        SparseIntArray sparseIntArray = xt0Var.O;
        int i13 = xt0Var.f24098n;
        int i14 = -1;
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i15 = sparseIntArray.get(i13 + i10, -1);
        ct0 ct0Var = this.W;
        if (ct0Var != null) {
            if (!w0(closestTab) && closestTab != 8) {
                if (w0(i15) || i15 == 8) {
                    i14 = ct0Var.getCurrentAlbumId();
                }
            } else {
                t91 t91Var = ct0Var.f36306n;
                SparseIntArray sparseIntArray2 = t91Var.f30803b0;
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
                i15 = i1(i14).f26539a;
            }
        }
        if (i15 >= 0) {
            org.telegram.ui.ActionBar.u0 u0Var = this.f26953n0;
            if (u0Var != null && !D()) {
                if (v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                u0Var.setVisibility(i11);
                this.f26955o0 = 0.0f;
            } else {
                this.f26955o0 = b0(0.0f);
                s1(0.0f);
            }
            if ((!this.V0 || getSelectedTab() != 11) && (!C() || !this.C1 || (getClosestTab() != 8 && !w0(getClosestTab())))) {
                av0[] av0VarArr = this.f26948k0;
                av0 av0Var2 = av0VarArr[0];
                if (av0Var2 != null && av0Var2.F == 13 && (ws0Var = this.U) != null) {
                    bi.a aVar = ws0Var.f3944n;
                    if (!z10) {
                    }
                }
                av0 av0Var3 = av0VarArr[0];
                xs0 xs0Var = this.V;
                if (av0Var3 != null && av0Var3.F == 14 && xs0Var != null) {
                    xh.w1 w1Var = xs0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.C1 || (av0Var = av0VarArr[0]) == null || av0Var.F != 13) && ((xs0Var == null || !xs0Var.g()) && (ct0Var == null || !ct0Var.f36309w))) {
                    q1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    k0();
                    this.f26981y1 = false;
                    this.f26978x1 = true;
                    N0(true);
                    this.f26983z1 = (int) motionEvent.getX();
                    this.G.setEnabled(false);
                    xt0Var.setEnabled(false);
                    av0 av0Var4 = av0VarArr[1];
                    av0Var4.F = i15;
                    av0Var4.setVisibility(0);
                    this.f26943h1 = z10;
                    m1(true);
                    if (z10) {
                        av0VarArr[1].setTranslationX(av0VarArr[0].getMeasuredWidth());
                    } else {
                        av0VarArr[1].setTranslationX(-av0VarArr[0].getMeasuredWidth());
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
        ws0 ws0Var;
        if (!r0()) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        if (z10 && (ws0Var = this.U) != null) {
            return ws0Var.getBotPreviewsSubtitle();
        }
        pu0 pu0Var = this.f26929c0;
        if (pu0Var != null && pu0Var.f25795s != null) {
            i10 = 0;
            i11 = 0;
            for (int i12 = 0; i12 < pu0Var.f25795s.f897i.size(); i12++) {
                MessageObject messageObject = (MessageObject) pu0Var.f25795s.f897i.get(i12);
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

    public final av0 W(int i10) {
        int i11 = 0;
        while (true) {
            av0[] av0VarArr = this.f26948k0;
            if (i11 < av0VarArr.length) {
                av0 av0Var = av0VarArr[i11];
                if (av0Var != null && av0Var.F == i10) {
                    return av0Var;
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    public final void W0(s4.i0 i0Var) {
        if (i0Var instanceof bw0) {
            ArrayList arrayList = this.E0;
            ArrayList arrayList2 = this.F0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        } else if (i0Var == this.M) {
            ArrayList arrayList3 = this.G0;
            ArrayList arrayList4 = this.H0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
        } else {
            ov0 ov0Var = this.N;
            if (i0Var == ov0Var) {
                ov0Var.f29310r = null;
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
        return Utilities.clamp(i14, 9, (this.f26949k1 && i10 == 1) ? 2 : 2);
    }

    public final void X0() {
        int i10;
        int i11 = 0;
        while (true) {
            av0[] av0VarArr = this.f26948k0;
            if (i11 < av0VarArr.length) {
                gt0 gt0Var = av0VarArr[i11].h;
                if (gt0Var != null) {
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < gt0Var.getChildCount(); i14++) {
                        View childAt = gt0Var.getChildAt(i14);
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
                        int i15 = av0VarArr[i11].F;
                        int i16 = -1;
                        if (p0(i15)) {
                            ew0 k12 = k1(i15);
                            if (k12 != null && k12.f25795s != null) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= k12.f25795s.f897i.size()) {
                                        break;
                                    } else if (i12 == ((MessageObject) k12.f25795s.f897i.get(i17)).getId()) {
                                        i16 = i17;
                                        break;
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                            i10 = i16;
                        } else if (i15 >= 0) {
                            wv0[] wv0VarArr = this.f26968t1;
                            if (i15 < wv0VarArr.length) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= wv0VarArr[i15].f32553a.size()) {
                                        break;
                                    } else if (i12 == ((MessageObject) wv0VarArr[i15].f32553a.get(i18)).getId()) {
                                        i16 = i18;
                                        break;
                                    } else {
                                        i18++;
                                    }
                                }
                                i10 = wv0VarArr[i15].f32563m + i16;
                            }
                        }
                        if (i16 >= 0) {
                            ((s4.d0) gt0Var.getLayoutManager()).h1(i10, (-av0VarArr[i11].h.getPaddingTop()) + i13);
                            if (this.f26956o1) {
                                av0 av0Var = av0VarArr[i11];
                                av0Var.f24501s.h1(i10, (-av0Var.h.getPaddingTop()) + i13);
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
        xt0 xt0Var;
        if (!this.L1 && (xt0Var = this.I0) != null) {
            xt0Var.h(null, i10, xt0Var.P.get(i10));
        }
    }

    public final int Z(int i10) {
        float f7;
        int i11;
        int dp = AndroidUtilities.dp(54.0f) + this.f26927b2;
        ct0 ct0Var = this.W;
        if (ct0Var != null && (w0(i10) || i10 == 8)) {
            f7 = ct0Var.getVisibilityFactor() * AndroidUtilities.dp(40.0f);
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
        xt0 xt0Var = this.I0;
        if (xt0Var != null) {
            if (w0(i10)) {
                i11 = 8;
            } else {
                i11 = i10;
            }
            xt0Var.j(f7, i11);
        }
        ct0 ct0Var = this.W;
        if (ct0Var != null) {
            t91 t91Var = ct0Var.f36306n;
            if (w0(i10)) {
                t91Var.f(f7, h1(i10));
            } else if (i10 == 8) {
                t91Var.f(f7, 0);
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
        av0[] av0VarArr = this.f26948k0;
        av0 av0Var = av0VarArr[1];
        xs0 xs0Var = this.V;
        if (av0Var != null && ((i12 = av0Var.F) == 0 || (((i12 == 8 || w0(i12)) && TextUtils.isEmpty(getStoriesHashtag())) || (i13 = av0VarArr[1].F) == 9 || i13 == 11 || i13 == 13 || (i13 == 14 && xs0Var != null)))) {
            f10 = 0.0f + f7;
        }
        av0 av0Var2 = av0VarArr[0];
        if (av0Var2 != null && ((i10 = av0Var2.F) == 0 || (((i10 == 8 || w0(i10)) && TextUtils.isEmpty(getStoriesHashtag())) || (i11 = av0VarArr[0].F) == 9 || i11 == 11 || i11 == 13 || (i11 == 14 && xs0Var != null)))) {
            return (1.0f - f7) + f10;
        }
        return f10;
    }

    public final void a1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i10 = 0;
        while (true) {
            av0[] av0VarArr = this.f26948k0;
            if (i10 < av0VarArr.length) {
                av0 av0Var = av0VarArr[i10];
                if (av0Var.F != 7 || av0Var.h.getAdapter() == null || av0VarArr[i10].h.getAdapter().h() == 0 || this.f26972v1.getMessagesController().getStoriesController().f1411j.size() <= 0) {
                    i10++;
                } else {
                    return;
                }
            } else {
                if (this.F == 0) {
                    ru0 ru0Var = this.f26922a0;
                    ru0Var.d = chatFull;
                    ru0Var.f30246e = arrayList;
                }
                v1(true);
                for (int i11 = 0; i11 < av0VarArr.length; i11++) {
                    av0 av0Var2 = av0VarArr[i11];
                    if (av0Var2.F == 7 && av0Var2.h.getAdapter() != null) {
                        AndroidUtilities.notifyDataSetChanged(av0VarArr[i11].h);
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
        av0[] av0VarArr = this.f26948k0;
        av0 av0Var = av0VarArr[1];
        if (av0Var != null && s0(av0Var.F) && av0VarArr[1].F != 11) {
            f10 = 0.0f + f7;
        }
        av0 av0Var2 = av0VarArr[0];
        if (av0Var2 != null && s0(av0Var2.F) && av0VarArr[0].F != 11) {
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
            ja jaVar = this.B0;
            if (z10) {
                jaVar.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.N1 = animatorSet2;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(jaVar, View.ALPHA, f7));
            this.N1.setDuration(180L);
            this.N1.addListener(new ea(19, this, z10));
            this.N1.start();
            if (z10) {
                u1();
            }
        }
    }

    public final int c0(int i10) {
        ew0 k12;
        ai.e9 e9Var;
        if (p0(i10) && (k12 = k1(i10)) != null && (e9Var = k12.f25795s) != null) {
            return e9Var.g();
        }
        return 0;
    }

    public final void c1(int r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hw0.c1(int, boolean):void");
    }

    public final void d1(int i10) {
        int h12 = h1(getClosestTab());
        ct0 ct0Var = this.W;
        if (h12 != i10) {
            if (ct0Var != null) {
                ct0Var.f36306n.d(i10, ct0Var.f36308s.i(i10));
                return;
            }
            return;
        }
        ct0Var.setReorderingAlbums(true);
        gw0 i12 = i1(i10);
        av0 W = W(i12.f26539a);
        if (W == null) {
            return;
        }
        gt0 gt0Var = W.h;
        for (int i11 = 0; i11 < gt0Var.getChildCount(); i11++) {
            View childAt = gt0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.t7) {
                ((org.telegram.ui.Cells.t7) childAt).l(true, true);
            }
        }
        fw0 fw0Var = i12.f26541c;
        if (fw0Var != null && !fw0Var.f25797x) {
            fw0Var.f25797x = true;
        }
        q1(true);
    }

    @Override
    public final void didReceivedNotification(int r42, int r43, java.lang.Object... r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hw0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        xt0 xt0Var = this.I0;
        if (xt0Var != null) {
            canvas.save();
            canvas.translate(xt0Var.getX(), xt0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        tt0 tt0Var = this.R0;
        if (tt0Var != null) {
            int i10 = tt0Var.U;
            if ((i10 == 3 || i10 == 1) && this.P0 == null) {
                canvas.save();
                canvas.translate(tt0Var.getX(), tt0Var.getY());
                tt0Var.setDrawOverlay(true);
                tt0Var.draw(canvas);
                tt0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int i10;
        if (view == this.R0 && this.P0 == null) {
            canvas.save();
            av0[] av0VarArr = this.f26948k0;
            float top = av0VarArr[0].getTop();
            ct0 ct0Var = this.W;
            if (ct0Var != null && ((i10 = av0VarArr[0].F) == 8 || w0(i10))) {
                top -= ct0Var.getVisualHeight();
            }
            canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + AndroidUtilities.dp(12.0f));
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e1(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hw0.e1(boolean):void");
    }

    @Override
    public final void f(org.telegram.ui.Cells.s2 s2Var) {
        int i10;
        org.telegram.ui.ActionBar.m2 m2Var = this.f26972v1;
        if (m2Var != null && m2Var.getMessagesController().getStoriesController().I(s2Var.getDialogId())) {
            m2Var.getOrCreateStoryViewer().getClass();
            ai.kc orCreateStoryViewer = m2Var.getOrCreateStoryViewer();
            Context context = m2Var.getContext();
            long dialogId = s2Var.getDialogId();
            ai.v9 a2 = ai.v9.a((wm0) s2Var.getParent());
            if ((m2Var instanceof ProfileActivity) && ((ProfileActivity) m2Var).f34176s1) {
                i10 = AndroidUtilities.dp(68.0f);
            } else {
                i10 = 0;
            }
            a2.f1834s += i10;
            orCreateStoryViewer.D(context, dialogId, a2);
        }
    }

    public final float f0(int i10, boolean z10) {
        float width = getWidth();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            av0[] av0VarArr = this.f26948k0;
            if (i11 >= av0VarArr.length) {
                break;
            }
            av0 av0Var = av0VarArr[i11];
            if (av0Var != null) {
                int i13 = av0Var.F;
                if ((z10 && i10 == 8 && w0(i13)) || i13 == i10) {
                    i12++;
                    width = av0VarArr[i11].getTranslationX();
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
            av0[] av0VarArr = this.f26948k0;
            if (i10 < av0VarArr.length) {
                int childCount = av0VarArr[i10].h.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = av0VarArr[i10].h.getChildAt(i11);
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

    public final float g0(int i10, boolean z10) {
        float f7 = 0.0f;
        int i11 = 0;
        while (true) {
            av0[] av0VarArr = this.f26948k0;
            if (i11 < av0VarArr.length) {
                av0 av0Var = av0VarArr[i11];
                if (av0Var != null) {
                    int i12 = av0Var.F;
                    if ((z10 && i10 == 8 && w0(i12)) || i12 == i10) {
                        f7 = (1.0f - Math.abs(av0VarArr[i11].getTranslationX() / getWidth())) + f7;
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
        av0 av0Var;
        av0 av0Var2;
        int measuredWidth2;
        av0 av0Var3;
        av0 av0Var4;
        boolean z11;
        VelocityTracker velocityTracker = this.B1;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.S0);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f7 = this.B1.getXVelocity();
                f10 = this.B1.getYVelocity();
                if (!this.f26978x1 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
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
            if (this.f26978x1) {
                av0[] av0VarArr = this.f26948k0;
                float x10 = av0VarArr[0].getX();
                this.f26939f1 = new AnimatorSet();
                if (Math.abs(x10) < av0VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f26945i1 = z10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new m80(this, 20));
                boolean z12 = this.f26945i1;
                Property property = View.TRANSLATION_X;
                if (z12) {
                    measuredWidth = Math.abs(x10);
                    if (this.f26943h1) {
                        this.f26939f1.playTogether(ObjectAnimator.ofFloat(av0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(av0VarArr[1], property, av0Var4.getMeasuredWidth()), ofFloat);
                    } else {
                        this.f26939f1.playTogether(ObjectAnimator.ofFloat(av0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(av0VarArr[1], property, -av0Var3.getMeasuredWidth()), ofFloat);
                    }
                } else {
                    measuredWidth = av0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                    if (this.f26943h1) {
                        this.f26939f1.playTogether(ObjectAnimator.ofFloat(av0VarArr[0], property, -av0Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(av0VarArr[1], property, 0.0f), ofFloat);
                    } else {
                        this.f26939f1.playTogether(ObjectAnimator.ofFloat(av0VarArr[0], property, av0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(av0VarArr[1], property, 0.0f), ofFloat);
                    }
                }
                this.f26939f1.setInterpolator(f26920e2);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs = Math.abs(f7);
                if (abs > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                this.f26939f1.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                this.f26939f1.addListener(new au0(this, 1));
                this.f26939f1.start();
                this.f26941g1 = true;
                this.f26978x1 = false;
                L0();
            } else {
                this.f26981y1 = false;
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
        av0 av0Var;
        av0 av0Var2;
        boolean z10;
        boolean z11;
        ai.e9 e9Var;
        ai.e9 e9Var2;
        float f7 = 1.0f;
        av0[] av0VarArr = this.f26948k0;
        if (av0VarArr == null || (av0Var = av0VarArr[0]) == null || (av0Var2 = av0VarArr[1]) == null || av0Var.f24502w == null || av0Var2.f24502w == null) {
            return 1.0f;
        }
        int i10 = av0Var.F;
        int i11 = av0Var2.F;
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
        float visibilityFactor = 1.0f - av0VarArr[0].f24502w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - av0VarArr[1].f24502w.getVisibilityFactor();
        ew0 k12 = k1(av0VarArr[0].F);
        if (i10 == 8 || (k12 != null && (e9Var2 = k12.f25795s) != null && e9Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        ew0 k13 = k1(i11);
        if (i11 != 8 && (k13 == null || (e9Var = k13.f25795s) == null || e9Var.g() <= 0)) {
            f7 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f7;
        }
        if (!z11) {
            f7 = visibilityFactor;
        }
        return AndroidUtilities.lerp(visibilityFactor, f7, Math.abs(av0VarArr[0].getTranslationX() / av0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        av0[] av0VarArr = this.f26948k0;
        av0 av0Var = av0VarArr[1];
        if (av0Var != null && av0Var.getVisibility() == 0) {
            if (this.f26941g1 && !this.f26945i1) {
                return av0VarArr[1].F;
            }
            if (Math.abs(av0VarArr[1].getTranslationX()) < av0VarArr[1].getMeasuredWidth() / 2.0f) {
                return av0VarArr[1].F;
            }
        }
        return getSelectedTab();
    }

    public wm0 getCurrentListView() {
        nu0 nu0Var;
        av0 av0Var = this.f26948k0[0];
        int i10 = av0Var.F;
        if (i10 == 13) {
            return this.U.getCurrentListView();
        }
        if (i10 == 14) {
            return this.V.getCurrentListView();
        }
        if (i10 == 12 && (nu0Var = this.T) != null) {
            return nu0Var.f38105a.f37478x0;
        }
        return av0Var.h;
    }

    public int getInitialTab() {
        return 0;
    }

    public int getPhotosVideosTypeFilter() {
        return this.f26968t1[0].f32567q;
    }

    public TextView getSaveItem() {
        return this.f26959q0;
    }

    public org.telegram.ui.ActionBar.u0 getSearchItem() {
        return this.f26953n0;
    }

    public ik0 getSearchOptionsItem() {
        return this.f26965s0;
    }

    public int getSelectedTab() {
        int currentTabId = this.I0.getCurrentTabId();
        ct0 ct0Var = this.W;
        if (ct0Var != null && currentTabId == 8) {
            int currentAlbumId = ct0Var.getCurrentAlbumId();
            if (currentAlbumId == 0) {
                return 8;
            }
            if (currentAlbumId > 0) {
                return i1(currentAlbumId).f26539a;
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
            av0[] av0VarArr = this.f26948k0;
            if (i10 < av0VarArr.length) {
                av0 av0Var = av0VarArr[i10];
                if (av0Var != null) {
                    f7 = ((1.0f - Math.abs(av0Var.getTranslationX() / getWidth())) * av0Var.F) + f7;
                }
                i10++;
            } else {
                return f7;
            }
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.j6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.j6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.A0, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20963z6));
        org.telegram.ui.ActionBar.u0 u0Var = this.f26950l0;
        ik0 iconView = u0Var.getIconView();
        int i10 = org.telegram.ui.ActionBar.h6.f20947y8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(iconView, 8, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.h6.f20965z8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var, 32, null, null, null, null, i11));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f26969u0;
        if (u0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var2.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var2, 32, null, null, null, null, i11));
        }
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f26967t0;
        if (u0Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var3.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var3, 32, null, null, null, null, i11));
        }
        Drawable[] drawableArr = {this.D0};
        ImageView imageView = this.C0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 8, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 32, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.f20559d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.B0, 1, null, null, null, null, i12));
        xt0 xt0Var = this.I0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(xt0Var, 1, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.h6.f20916wc;
        org.telegram.ui.Cells.w0 w0Var = this.K0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20694kd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(xt0Var, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Gh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(xt0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.Fh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(xt0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.Eh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(xt0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.Hh));
        tt0 tt0Var = this.R0;
        if (tt0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(tt0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20893v7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(tt0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20911w7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(tt0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20875u7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(tt0Var, 33554436, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20857t7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(tt0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20930x7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(tt0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20946y7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(tt0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.A7));
        }
        final int i14 = 0;
        while (true) {
            av0[] av0VarArr = this.f26948k0;
            if (i14 < av0VarArr.length) {
                org.telegram.ui.ActionBar.i6 i6Var = new org.telegram.ui.ActionBar.i6() {
                    @Override
                    public final void b() {
                        av0[] av0VarArr2 = hw0.this.f26948k0;
                        int i15 = i14;
                        gt0 gt0Var = av0VarArr2[i15].h;
                        if (gt0Var != null) {
                            int childCount = gt0Var.getChildCount();
                            for (int i16 = 0; i16 < childCount; i16++) {
                                View childAt = av0VarArr2[i15].h.getChildAt(i16);
                                if (childAt instanceof org.telegram.ui.Cells.u7) {
                                    org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) childAt;
                                    for (int i17 = 0; i17 < 6; i17++) {
                                        u7Var.f23282a[i17].f22453e.invalidate();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.i6) {
                                    ((org.telegram.ui.Cells.i6) childAt).v(0);
                                } else if (childAt instanceof org.telegram.ui.Cells.xa) {
                                    ((org.telegram.ui.Cells.xa) childAt).j(0);
                                }
                            }
                        }
                    }

                    @Override
                    public final void a(float f7) {
                    }
                };
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f20681k0, null, null, org.telegram.ui.ActionBar.h6.f20560d7));
                pt0 pt0Var = av0VarArr[i14].v;
                int i15 = org.telegram.ui.ActionBar.h6.f20559d6;
                arrayList.add(new org.telegram.ui.ActionBar.j6(pt0Var, 0, null, null, null, null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f20839s8));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f20650i6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].f24502w, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20543c7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 524288, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.h6.e7));
                int i16 = org.telegram.ui.ActionBar.h6.f20631h6;
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20885uh));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20724m6));
                int i17 = org.telegram.ui.ActionBar.h6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
                int i18 = org.telegram.ui.ActionBar.h6.f20945y6;
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"statusColor"}, null, null, -1, i6Var, i18));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"statusOnlineColor"}, null, null, -1, i6Var, org.telegram.ui.ActionBar.h6.f20744n6));
                Drawable[] drawableArr2 = org.telegram.ui.ActionBar.h6.f20812r0;
                int i19 = org.telegram.ui.ActionBar.h6.J7;
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.xa.class}, null, drawableArr2, null, i19));
                TextPaint[] textPaintArr = org.telegram.ui.ActionBar.h6.B0;
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.i6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.h6.D0}, null, -1, null, org.telegram.ui.ActionBar.h6.X8));
                TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.h6.C0;
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.i6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.h6.E0}, null, -1, null, org.telegram.ui.ActionBar.h6.Z8));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.i6.class}, null, drawableArr2, null, i19));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.O7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.P7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.Q7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.R7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.S7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.T7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.U7));
                int i20 = org.telegram.ui.ActionBar.h6.f20963z6;
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 4, new Class[]{uu0.class}, new String[]{"emptyTextView"}, null, null, -1, null, i20));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.A6));
                int i21 = org.telegram.ui.ActionBar.h6.Ih;
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 2048, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"progressView"}, null, null, -1, null, i21));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"statusImageView"}, null, null, -1, null, i21));
                int i22 = org.telegram.ui.ActionBar.h6.f20651i7;
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                int i23 = org.telegram.ui.ActionBar.h6.f20688k7;
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.zi));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Bi));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, org.telegram.ui.ActionBar.h6.f20593f3, null, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.i7.class}, org.telegram.ui.ActionBar.h6.f20612g3, null, null, i20));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.n7.class}, null, null, null, org.telegram.ui.ActionBar.h6.J6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.n7.class}, org.telegram.ui.ActionBar.h6.m0, null, null, org.telegram.ui.ActionBar.h6.K6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Kh));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 32, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Jh));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.o7.class}, null, null, null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 524288, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"textView"}, null, null, -1, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"textView"}, null, null, -1, null, i17));
                int i24 = org.telegram.ui.ActionBar.h6.Lh;
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.u7.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.u7.class}, null, null, i6Var, i22));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.u7.class}, null, null, i6Var, i23));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, i6Var, i22));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, i6Var, i23));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].h, 0, null, null, new Drawable[]{this.f26980y0}, null, org.telegram.ui.ActionBar.h6.f20523b7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].f24502w.d, 4, null, null, null, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.j6(av0VarArr[i14].f24502w.f26557e, 4, null, null, null, null, i18));
                i14++;
            } else {
                return arrayList;
            }
        }
    }

    public final int h0(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var = this.F1;
        if (c6Var != null) {
            return c6Var.x0(i10);
        }
        return org.telegram.ui.ActionBar.h6.x0(null, i10, false);
    }

    public final int h1(int i10) {
        gw0 j12 = j1(i10);
        if (j12 == null) {
            return -1;
        }
        return j12.f26540b;
    }

    public final boolean i0() {
        if (this.f26972v1.getConnectionsManager().getConnectionState() == 3) {
            return true;
        }
        return false;
    }

    public final gw0 i1(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.Y1;
        gw0 gw0Var = (gw0) hashMap.get(valueOf);
        if (gw0Var == null) {
            gw0 gw0Var2 = new gw0(this, getContext(), i10);
            hashMap.put(Integer.valueOf(i10), gw0Var2);
            this.Z1.put(Integer.valueOf(gw0Var2.f26539a), Integer.valueOf(i10));
            return gw0Var2;
        }
        return gw0Var;
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

    public final gw0 j1(int i10) {
        Integer num = (Integer) this.Z1.get(Integer.valueOf(i10));
        if (num == null) {
            return null;
        }
        return (gw0) this.Y1.get(num);
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
        this.L0.setInterpolator(js.f27628g);
        this.L0.addListener(new au0(this, 0));
        this.L0.start();
    }

    public final ew0 k1(int i10) {
        gw0 j12;
        if (i10 == 8) {
            return this.f26929c0;
        }
        if (i10 == 9) {
            return this.f26935e0;
        }
        if (w0(i10) && (j12 = j1(i10)) != null) {
            return j12.f26541c;
        }
        return null;
    }

    public boolean l0() {
        return false;
    }

    public final ew0 l1(int i10) {
        gw0 j12;
        if (i10 == 8) {
            return this.f26932d0;
        }
        if (i10 == 9) {
            return this.f26938f0;
        }
        if (!w0(i10) || (j12 = j1(i10)) == null) {
            return null;
        }
        return j12.d;
    }

    public boolean m0() {
        return !(this instanceof s40);
    }

    public final void m1(boolean z10) {
        av0[] av0VarArr;
        av0[] av0VarArr2;
        s4.v0 v0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        float f7;
        int i10;
        float f10;
        float f11;
        boolean z15;
        wv0[] wv0VarArr;
        String str;
        ?? r52;
        int i11;
        int i12;
        int i13;
        boolean z16;
        boolean z17;
        boolean z18;
        int i14;
        int i15;
        int i16;
        int i17;
        String str2;
        boolean z19;
        boolean z20;
        s4.v0 v0Var2;
        String str3;
        int i18;
        int i19;
        boolean z21;
        int i20;
        int i21;
        boolean z22;
        int i22;
        xs0 xs0Var = this.V;
        if (xs0Var != null) {
            xs0Var.i();
        }
        int i23 = 0;
        while (true) {
            av0VarArr = this.f26948k0;
            if (i23 >= av0VarArr.length) {
                break;
            }
            av0VarArr[i23].h.B0();
            i23++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) av0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = AndroidUtilities.dp(B0());
        s4.i0 adapter = av0VarArr[z10 ? 1 : 0].h.getAdapter();
        s4.i0 i0Var = this.f26929c0;
        s4.z zVar = this.f26925b0;
        if (adapter == i0Var) {
            zVar.e(null);
        }
        boolean z23 = this.V0;
        tu0 tu0Var = this.D1;
        String str4 = "";
        ov0 ov0Var = this.N;
        org.telegram.ui.ActionBar.u0 u0Var = this.f26953n0;
        int i24 = 100;
        if (z23 && this.U0) {
            av0 av0Var = av0VarArr[z10 ? 1 : 0];
            if (av0Var.f24498f == null) {
                av0Var.f24498f = new s4.v0();
            }
            av0 av0Var2 = av0VarArr[z10 ? 1 : 0];
            v0Var2 = av0Var2.f24498f;
            sv0 sv0Var = this.S;
            yu0 yu0Var = this.f26946j0;
            dv0 dv0Var = this.f26942h0;
            dv0 dv0Var2 = this.f26944i0;
            dv0 dv0Var3 = this.f26940g0;
            if (z10) {
                int i25 = av0Var2.F;
                if (i25 != 0 && i25 != 2 && i25 != 5 && i25 != 6 && (i25 != 7 || tu0Var.T())) {
                    if (u0Var != null) {
                        str4 = u0Var.getSearchField().getText().toString();
                    }
                    int i26 = av0VarArr[z10 ? 1 : 0].F;
                    if (i26 == 1) {
                        if (dv0Var3 != null) {
                            dv0Var3.G(str4, false);
                            if (adapter != dv0Var3) {
                                W0(adapter);
                                av0VarArr[z10 ? 1 : 0].h.setAdapter(dv0Var3);
                            }
                        }
                    } else if (i26 == 3) {
                        if (dv0Var2 != null) {
                            dv0Var2.G(str4, false);
                            if (adapter != dv0Var2) {
                                W0(adapter);
                                av0VarArr[z10 ? 1 : 0].h.setAdapter(dv0Var2);
                            }
                        }
                    } else if (i26 == 4) {
                        if (dv0Var != null) {
                            dv0Var.G(str4, false);
                            if (adapter != dv0Var) {
                                W0(adapter);
                                av0VarArr[z10 ? 1 : 0].h.setAdapter(dv0Var);
                            }
                        }
                    } else if (i26 == 7) {
                        if (yu0Var != null) {
                            yu0Var.F(str4, false);
                            if (adapter != yu0Var) {
                                W0(adapter);
                                av0VarArr[z10 ? 1 : 0].h.setAdapter(yu0Var);
                            }
                        }
                    } else if (i26 == 11) {
                        if (sv0Var != null) {
                            sv0Var.E(this.W0, str4);
                            if (adapter != sv0Var) {
                                W0(adapter);
                                av0VarArr[z10 ? 1 : 0].h.setAdapter(sv0Var);
                            }
                        }
                    } else if (i26 == 15 && ov0Var != null && adapter != ov0Var) {
                        W0(adapter);
                        gt0 gt0Var = av0VarArr[z10 ? 1 : 0].h;
                        ov0Var.f29310r = gt0Var;
                        gt0Var.setAdapter(ov0Var);
                    }
                } else {
                    this.V0 = false;
                    ut0 ut0Var = this.J0;
                    if (ut0Var != null) {
                        ut0Var.g(false);
                    }
                    this.U0 = false;
                    m1(true);
                    return;
                }
            } else if (av0Var2.h != null) {
                int i27 = av0Var2.F;
                if (i27 == 1) {
                    if (adapter != dv0Var3) {
                        W0(adapter);
                        av0VarArr[z10 ? 1 : 0].h.setAdapter(dv0Var3);
                    }
                    dv0Var3.l();
                } else if (i27 == 3) {
                    if (adapter != dv0Var2) {
                        W0(adapter);
                        av0VarArr[z10 ? 1 : 0].h.setAdapter(dv0Var2);
                    }
                    dv0Var2.l();
                } else if (i27 == 4) {
                    if (adapter != dv0Var) {
                        W0(adapter);
                        av0VarArr[z10 ? 1 : 0].h.setAdapter(dv0Var);
                    }
                    dv0Var.l();
                } else if (i27 == 7) {
                    if (adapter != yu0Var) {
                        W0(adapter);
                        av0VarArr[z10 ? 1 : 0].h.setAdapter(yu0Var);
                    }
                    yu0Var.l();
                } else if (i27 == 11) {
                    if (adapter != sv0Var) {
                        W0(adapter);
                        av0VarArr[z10 ? 1 : 0].h.setAdapter(sv0Var);
                    }
                    sv0Var.l();
                }
            }
            av0VarArr2 = av0VarArr;
            z20 = false;
            z19 = false;
            i11 = 4;
            i15 = 8;
        } else {
            av0 av0Var3 = av0VarArr[z10 ? 1 : 0];
            if (av0Var3.f24497e == null) {
                av0Var3.f24497e = new s4.v0();
            }
            av0 av0Var4 = av0VarArr[z10 ? 1 : 0];
            s4.v0 v0Var3 = av0Var4.f24497e;
            av0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i28 = av0VarArr[z10 ? 1 : 0].F;
            if (i28 == 8 || w0(i28)) {
                layoutParams.topMargin = AndroidUtilities.dp(B0());
            }
            gt0 gt0Var2 = av0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = gt0Var2.getPaddingLeft();
            av0 av0Var5 = av0VarArr[z10 ? 1 : 0];
            gt0 gt0Var3 = av0Var5.h;
            int Z = Z(av0Var5.F);
            gt0Var3.f33493b3 = Z;
            int paddingRight = av0VarArr[z10 ? 1 : 0].h.getPaddingRight();
            av0VarArr2 = av0VarArr;
            gt0 gt0Var4 = av0VarArr2[z10 ? 1 : 0].h;
            int Y = Y(v0());
            gt0Var4.f33494c3 = Y;
            gt0Var2.setPadding(paddingLeft, Z, paddingRight, Y);
            int i29 = av0VarArr2[z10 ? 1 : 0].F;
            int[] iArr = this.f26951m1;
            s4.i0 i0Var2 = this.K;
            View view = this.U;
            nu0 nu0Var = this.T;
            rv0 rv0Var = this.R;
            su0 su0Var = this.P;
            wv0[] wv0VarArr2 = this.f26968t1;
            if (i29 == 0) {
                s4.i0 i0Var3 = this.H;
                if (adapter != i0Var3) {
                    W0(adapter);
                    av0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var3);
                }
                int i30 = -AndroidUtilities.dp(1.0f);
                layoutParams.rightMargin = i30;
                layoutParams.leftMargin = i30;
                wv0 wv0Var = wv0VarArr2[0];
                if (wv0Var.h && !wv0Var.f32556e.isEmpty()) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                i24 = iArr[0];
                av0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.f26980y0);
                wv0 wv0Var2 = wv0VarArr2[0];
                if (wv0Var2.f32573x == null) {
                    wv0Var2.f32573x = new s4.v0();
                }
                z13 = z22;
                v0Var = wv0VarArr2[0].f32573x;
                z11 = false;
            } else {
                if (i29 == 1) {
                    wv0 wv0Var3 = wv0VarArr2[1];
                    if (wv0Var3.h && !wv0Var3.f32556e.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (adapter != i0Var2) {
                        W0(adapter);
                        av0VarArr2[z10 ? 1 : 0].h.setAdapter(i0Var2);
                    }
                } else if (i29 == 2) {
                    wv0 wv0Var4 = wv0VarArr2[2];
                    if (wv0Var4.h && !wv0Var4.f32556e.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (adapter != this.L) {
                        W0(adapter);
                        av0VarArr2[z10 ? 1 : 0].h.setAdapter(this.L);
                    }
                } else {
                    if (i29 == 3) {
                        if (adapter != this.J) {
                            W0(adapter);
                            av0VarArr2[z10 ? 1 : 0].h.setAdapter(this.J);
                        }
                    } else if (i29 == 4) {
                        wv0 wv0Var5 = wv0VarArr2[4];
                        if (wv0Var5.h && !wv0Var5.f32556e.isEmpty()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (adapter != this.M) {
                            W0(adapter);
                            av0VarArr2[z10 ? 1 : 0].h.setAdapter(this.M);
                        }
                    } else {
                        if (i29 == 5) {
                            if (adapter != this.O) {
                                W0(adapter);
                                av0VarArr2[z10 ? 1 : 0].h.setAdapter(this.O);
                            }
                        } else if (i29 == 15) {
                            if (adapter != ov0Var) {
                                W0(adapter);
                                gt0 gt0Var5 = av0VarArr2[z10 ? 1 : 0].h;
                                ov0Var.f29310r = gt0Var5;
                                gt0Var5.setAdapter(ov0Var);
                            }
                        } else if (i29 == 6) {
                            if (adapter != su0Var) {
                                W0(adapter);
                                av0VarArr2[z10 ? 1 : 0].h.setAdapter(su0Var);
                            }
                        } else if (i29 == 7) {
                            if (adapter != this.f26922a0) {
                                W0(adapter);
                                av0VarArr2[z10 ? 1 : 0].h.setAdapter(this.f26922a0);
                            }
                        } else if (p0(i29)) {
                            s4.i0 k12 = k1(av0VarArr2[z10 ? 1 : 0].F);
                            if (adapter != k12) {
                                W0(adapter);
                                av0VarArr2[z10 ? 1 : 0].h.setAdapter(k12);
                                av0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            av0 av0Var6 = av0VarArr2[z10 ? 1 : 0];
                            if (av0Var6.F != 9) {
                                zVar.e(av0Var6.h);
                            }
                            i24 = iArr[1];
                        } else {
                            int i31 = av0VarArr2[z10 ? 1 : 0].F;
                            if (i31 == 10) {
                                if (adapter != this.Q) {
                                    W0(adapter);
                                    av0VarArr2[z10 ? 1 : 0].h.setAdapter(this.Q);
                                }
                            } else if (i31 == 11) {
                                if (adapter != rv0Var) {
                                    W0(adapter);
                                    av0VarArr2[z10 ? 1 : 0].h.setAdapter(rv0Var);
                                    s4.z zVar2 = rv0Var.v;
                                    gt0 gt0Var6 = av0VarArr2[z10 ? 1 : 0].h;
                                    rv0Var.f30256s = gt0Var6;
                                    zVar2.e(gt0Var6);
                                }
                                v0Var = rv0Var.f30255r;
                                z11 = true;
                                z13 = false;
                            } else if (i31 == 12) {
                                if (adapter != null) {
                                    W0(adapter);
                                    av0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (nu0Var.getParent() != av0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(nu0Var);
                                    av0VarArr2[z10 ? 1 : 0].addView(nu0Var, w7.w5.a(-1.0f, 0.0f, 56.0f, 0.0f, 0.0f, -1, 119));
                                }
                            } else if (i31 == 13) {
                                if (adapter != null) {
                                    W0(adapter);
                                    av0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != av0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(view);
                                    av0VarArr2[z10 ? 1 : 0].addView(view);
                                }
                            } else if (i31 == 14) {
                                if (adapter != null) {
                                    W0(adapter);
                                    av0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (xs0Var != null && xs0Var.getParent() != av0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(xs0Var);
                                    av0VarArr2[z10 ? 1 : 0].addView(xs0Var);
                                    av0VarArr2[z10 ? 1 : 0].f24502w.setVisibility(4);
                                }
                            }
                        }
                        v0Var = v0Var3;
                        z11 = false;
                        z13 = false;
                    }
                    v0Var = v0Var3;
                    z11 = true;
                    z13 = false;
                }
                z13 = z12;
                v0Var = v0Var3;
                z11 = true;
            }
            int i32 = av0VarArr2[z10 ? 1 : 0].F;
            if (i32 != 0 && !p0(i32)) {
                z14 = false;
            } else {
                z14 = true;
            }
            pt0 pt0Var = av0VarArr2[z10 ? 1 : 0].v;
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
            s4.v0 v0Var4 = v0Var;
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
            pt0Var.setLayoutParams(w7.w5.a(-1.0f, f7, f12, f10, f11, -1, 119));
            if (z11) {
                av0VarArr2[z10 ? 1 : 0].h.setSections(false);
            } else {
                gt0 gt0Var7 = av0VarArr2[z10 ? 1 : 0].h;
                gt0Var7.getClass();
                gt0Var7.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20650i6, gt0Var7.f32467n2));
                gt0Var7.G2 = null;
                gt0Var7.J2 = 0.0f;
                gt0Var7.K2 = null;
                gt0Var7.L2 = null;
                gt0Var7.H2 = null;
                im0 im0Var = gt0Var7.F2;
                if (im0Var != null) {
                    gt0Var7.p0(im0Var);
                    gt0Var7.F2 = null;
                }
            }
            av0 av0Var7 = av0VarArr2[z10 ? 1 : 0];
            int i33 = av0Var7.F;
            org.telegram.ui.ActionBar.m2 m2Var = this.f26972v1;
            if (i33 == 15) {
                z15 = z13;
                wv0VarArr = wv0VarArr2;
                str = "";
                av0Var7.setBackground(ci.b7.e(av0Var7.getBackground(), m2Var.getCurrentAccount(), this.f26947j1, org.telegram.ui.ActionBar.h6.I.q()));
                av0VarArr2[z10 ? 1 : 0].setOutlineProvider(new ai.l2(16));
                av0VarArr2[z10 ? 1 : 0].setClipToOutline(true);
                r52 = 0;
            } else {
                z15 = z13;
                wv0VarArr = wv0VarArr2;
                str = "";
                av0Var7.setClipToOutline(false);
                r52 = 0;
                av0VarArr2[z10 ? 1 : 0].setBackground(null);
            }
            av0 av0Var8 = av0VarArr2[z10 ? 1 : 0];
            if (av0Var8.F == 11) {
                av0Var8.h.setItemAnimator(av0Var8.d);
            } else {
                av0Var8.h.setItemAnimator(r52);
                if (rv0Var != null && av0VarArr2[z10 ? 1 : 0].h == rv0Var.f30256s) {
                    s4.z zVar3 = rv0Var.v;
                    rv0Var.f30256s = r52;
                    zVar3.e(r52);
                }
            }
            if (nu0Var != null && av0VarArr2[z10 ? 1 : 0].F != 12 && nu0Var.getParent() == av0VarArr2[z10 ? 1 : 0]) {
                nu0Var.f38105a.onRemoveFromParent();
                av0VarArr2[z10 ? 1 : 0].removeView(nu0Var);
            }
            if (view != null && av0VarArr2[z10 ? 1 : 0].F != 13) {
                ViewParent parent = view.getParent();
                av0 av0Var9 = av0VarArr2[z10 ? 1 : 0];
                if (parent == av0Var9) {
                    av0Var9.removeView(view);
                }
            }
            if (xs0Var != null && av0VarArr2[z10 ? 1 : 0].F != 14) {
                ViewParent parent2 = xs0Var.getParent();
                av0 av0Var10 = av0VarArr2[z10 ? 1 : 0];
                if (parent2 == av0Var10) {
                    av0Var10.removeView(xs0Var);
                }
            }
            int i34 = av0VarArr2[z10 ? 1 : 0].F;
            if (i34 == 0 || i34 == 11 || p0(i34) || (i18 = av0VarArr2[z10 ? 1 : 0].F) == 2 || i18 == 5 || i18 == 6 || ((i18 == 7 && !tu0Var.T()) || (i19 = av0VarArr2[z10 ? 1 : 0].F) == 10 || i19 == 13 || i19 == 14)) {
                i11 = 4;
                if (z10) {
                    this.f26977x0 = 2;
                } else {
                    this.f26977x0 = 0;
                    if (u0Var != null) {
                        if (!v0() && !this.V0) {
                            i12 = 4;
                        } else {
                            i12 = 8;
                        }
                        u0Var.setVisibility(i12);
                    }
                }
            } else {
                if (z10) {
                    if (u0Var != null && u0Var.getVisibility() == 4 && !this.G.f21060n0) {
                        if (D()) {
                            this.f26977x0 = 1;
                            u0Var.setVisibility(0);
                        } else {
                            if (v0()) {
                                i21 = 8;
                            } else {
                                i21 = 4;
                            }
                            u0Var.setVisibility(i21);
                        }
                        float f13 = z10 ? 1.0f : 0.0f;
                        this.f26955o0 = b0(f13);
                        s1(1.0f - f13);
                        z21 = false;
                    } else {
                        z21 = false;
                        this.f26977x0 = 0;
                        this.f26955o0 = 1.0f;
                    }
                } else {
                    z21 = false;
                    if (u0Var != null) {
                        i11 = 4;
                        if (u0Var.getVisibility() == 4) {
                            if (D()) {
                                this.f26977x0 = 0;
                                this.f26955o0 = 1.0f;
                                u0Var.setVisibility(0);
                            } else {
                                if (v0()) {
                                    i20 = 8;
                                } else {
                                    i20 = 4;
                                }
                                u0Var.setVisibility(i20);
                                this.f26955o0 = 0.0f;
                            }
                        }
                        q1(z21);
                    }
                }
                i11 = 4;
                q1(z21);
            }
            int i35 = av0VarArr2[z10 ? 1 : 0].F;
            if (i35 == 6) {
                if (!su0Var.f30676e && !su0Var.h && su0Var.d.isEmpty()) {
                    su0.E(su0Var, 0L);
                }
            } else if (i35 != 7) {
                if (p0(i35)) {
                    ew0 k13 = k1(av0VarArr2[z10 ? 1 : 0].F);
                    if (k13 != null) {
                        ai.e9 e9Var = k13.f25795s;
                        k13.P();
                        rt0 rt0Var = av0VarArr2[z10 ? 1 : 0].f24502w;
                        if (e9Var != null && (e9Var.k() || (i0() && e9Var.g() > 0))) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        rt0Var.e(z17, z10);
                        if (e9Var != null && e9Var.g() > 0 && !t0()) {
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
                    int i36 = av0VarArr2[z10 ? 1 : 0].F;
                    if (i36 != 10 && i36 != 11 && i36 != 12 && i36 != 13 && i36 != 14) {
                        if (i36 == 15) {
                            i36 = 8;
                        }
                        wv0 wv0Var6 = wv0VarArr[i36];
                        if (!wv0Var6.f32558g && !wv0Var6.f32559i[0] && wv0Var6.f32553a.isEmpty()) {
                            wv0VarArr[i36].f32558g = true;
                            i0Var2.l();
                            if (i36 == 0) {
                                int i37 = wv0VarArr[0].f32567q;
                                if (i37 == 1) {
                                    i13 = 6;
                                } else if (i37 == 2) {
                                    i13 = 7;
                                }
                                m2Var.getMediaDataController().loadMedia(this.f26947j1, 50, 0, 0, i13, this.F, 1, m2Var.getClassGuid(), wv0VarArr[i13].f32566p, null, null);
                            }
                            i13 = i36;
                            m2Var.getMediaDataController().loadMedia(this.f26947j1, 50, 0, 0, i13, this.F, 1, m2Var.getClassGuid(), wv0VarArr[i13].f32566p, null, null);
                        }
                    }
                }
            }
            int i38 = av0VarArr2[z10 ? 1 : 0].F;
            if (i38 != 8 && !w0(i38)) {
                av0 av0Var11 = av0VarArr2[z10 ? 1 : 0];
                if (av0Var11.F == 9) {
                    if (u0()) {
                        av0VarArr2[z10 ? 1 : 0].f24502w.f26555b.setVisibility(8);
                        av0VarArr2[z10 ? 1 : 0].f24502w.f26558f.setVisibility(8);
                    } else {
                        av0VarArr2[z10 ? 1 : 0].f24502w.f26555b.setVisibility(0);
                        av0VarArr2[z10 ? 1 : 0].f24502w.setStickerType(11);
                        av0VarArr2[z10 ? 1 : 0].f24502w.f26558f.setVisibility(0);
                        av0VarArr2[z10 ? 1 : 0].f24502w.f26558f.h(w());
                    }
                    av0VarArr2[z10 ? 1 : 0].f24502w.d.setText(LocaleController.getString(R.string.NoArchivedStoriesTitle));
                    ia0 ia0Var = av0VarArr2[z10 ? 1 : 0].f24502w.f26557e;
                    if (v0()) {
                        str3 = LocaleController.getString(R.string.NoArchivedStoriesSubtitle);
                    } else {
                        str3 = str;
                    }
                    ia0Var.setText(str3);
                    av0VarArr2[z10 ? 1 : 0].f24502w.f26558f.setOnClickListener(new ds0(this, 7));
                    i15 = 8;
                } else {
                    av0Var11.f24502w.f26555b.setVisibility(0);
                    av0VarArr2[z10 ? 1 : 0].f24502w.setStickerType(1);
                    av0VarArr2[z10 ? 1 : 0].f24502w.d.setText(LocaleController.getString(R.string.NoResult));
                    av0VarArr2[z10 ? 1 : 0].f24502w.f26557e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    i15 = 8;
                    av0VarArr2[z10 ? 1 : 0].f24502w.f26558f.setVisibility(8);
                }
            } else {
                av0 av0Var12 = av0VarArr2[z10 ? 1 : 0];
                rt0 rt0Var2 = av0Var12.f24502w;
                boolean w02 = w0(av0Var12.F);
                int h12 = h1(av0VarArr2[z10 ? 1 : 0].F);
                y9 y9Var = rt0Var2.f26555b;
                ci.d dVar = rt0Var2.f26558f;
                if (!w02 && !u0() && !r0()) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                y9Var.setVisibility(i14);
                if (w02) {
                    dVar.setVisibility(0);
                    dVar.h(LocaleController.getString(R.string.StoriesAlbumAddToAlbum));
                    i15 = 8;
                } else if (u0()) {
                    i15 = 8;
                    dVar.setVisibility(8);
                } else {
                    i15 = 8;
                    rt0Var2.setStickerType(11);
                    if (!t0()) {
                        i16 = 0;
                    } else {
                        i16 = 8;
                    }
                    dVar.setVisibility(i16);
                    dVar.h(w());
                }
                if (w02) {
                    rt0Var2.d.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeTitle));
                    rt0Var2.f26557e.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeDescription));
                } else {
                    vh.n nVar = rt0Var2.d;
                    if (!t0()) {
                        if (v0()) {
                            i17 = R.string.NoPublicStoriesTitle2;
                        } else {
                            i17 = R.string.NoStoriesTitle;
                        }
                    } else {
                        i17 = R.string.NoHashtagStoriesTitle;
                    }
                    nVar.setText(LocaleController.getString(i17));
                    ia0 ia0Var2 = rt0Var2.f26557e;
                    if (v0()) {
                        str2 = LocaleController.getString(R.string.NoStoriesSubtitle2);
                    } else {
                        str2 = str;
                    }
                    ia0Var2.setText(str2);
                }
                dVar.setOnClickListener(new fs0(this, w02, h12, 0));
            }
            z19 = false;
            av0VarArr2[z10 ? 1 : 0].h.setVisibility(0);
            z20 = z15;
            v0Var2 = v0Var4;
        }
        int i39 = i24;
        av0 av0Var13 = av0VarArr2[z10 ? 1 : 0];
        av0Var13.f24495b = z20;
        o1(av0Var13, z19);
        av0VarArr2[z10 ? 1 : 0].f24503x.y1(i39);
        av0VarArr2[z10 ? 1 : 0].h.a0();
        if (v0Var2 != null) {
            av0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(v0Var2);
            av0VarArr2[z10 ? 1 : 0].f24500r.setRecycledViewPool(v0Var2);
        }
        if (this.f26977x0 == 2) {
            org.telegram.ui.ActionBar.k kVar = this.G;
            if (kVar.f21060n0) {
                this.f26982z0 = true;
                kVar.i(true);
                this.f26977x0 = 0;
                this.f26955o0 = 0.0f;
                if (u0Var != null) {
                    if (v0()) {
                        i22 = i15;
                    } else {
                        i22 = i11;
                    }
                    u0Var.setVisibility(i22);
                }
                q1(false);
            }
        }
    }

    public final void n0(ViewGroup viewGroup) {
        av0[] av0VarArr;
        for (av0 av0Var : this.f26948k0) {
            gt0 gt0Var = av0Var.h;
            Objects.requireNonNull(gt0Var);
            av0Var.f24499n = new ah.n(gt0Var, viewGroup, new pq0(gt0Var, 1));
        }
        xs0 xs0Var = this.V;
        if (xs0Var != null) {
            xs0Var.S = viewGroup;
            xs0Var.R = new ci.w7(xs0Var, 1);
        }
    }

    public final void n1() {
        mu0 mu0Var = this.H;
        if (mu0Var != null) {
            mu0Var.l();
        }
        uv0 uv0Var = this.K;
        if (uv0Var != null) {
            uv0Var.l();
        }
        uv0 uv0Var2 = this.L;
        if (uv0Var2 != null) {
            uv0Var2.l();
        }
        vv0 vv0Var = this.J;
        if (vv0Var != null) {
            vv0Var.X(false);
        }
        uv0 uv0Var3 = this.M;
        if (uv0Var3 != null) {
            uv0Var3.l();
        }
        ov0 ov0Var = this.N;
        if (ov0Var != null) {
            ov0Var.l();
        }
        vu0 vu0Var = this.O;
        if (vu0Var != null) {
            vu0Var.l();
        }
        pu0 pu0Var = this.f26929c0;
        if (pu0Var != null) {
            pu0Var.l();
        }
        for (gw0 gw0Var : this.Y1.values()) {
            gw0Var.f26541c.l();
        }
    }

    public final void o1(av0 av0Var, boolean z10) {
        boolean z11;
        Integer num = 1;
        int i10 = 0;
        if (av0Var.f24495b && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        dm0 fastScroll = av0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = av0Var.f24496c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            av0Var.f24496c.cancel();
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
            av0Var.f24496c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(num);
        } else if (!z11 && fastScroll.getTag() != null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, property, fastScroll.getAlpha(), 0.0f);
            ofFloat2.addListener(new ea(fastScroll));
            av0Var.f24496c = ofFloat2;
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
            av0[] av0VarArr = this.f26948k0;
            if (i10 < av0VarArr.length) {
                gt0 gt0Var = av0VarArr[i10].h;
                if (gt0Var != null) {
                    gt0Var.getViewTreeObserver().addOnPreDrawListener(new du0(this, i10, 0));
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
        tu0 tu0Var = this.D1;
        if (tu0Var.f() != null) {
            i12 = tu0Var.f().getHeight();
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
            } else if (childAt instanceof av0) {
                i13 = i10;
                measureChildWithMargins(childAt, i13, 0, View.MeasureSpec.makeMeasureSpec(i12, 1073741824), 0);
                gt0 gt0Var = ((av0) childAt).h;
                gt0Var.setPadding(0, gt0Var.W2, 0, gt0Var.X2);
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
            org.telegram.ui.ActionBar.m2 m2Var = this.f26972v1;
            if (m2Var.getParentLayout() != null && !((ActionBarLayout) m2Var.getParentLayout()).j() && !J() && !this.f26921a) {
                if (motionEvent != null) {
                    if (this.B1 == null) {
                        this.B1 = VelocityTracker.obtain();
                    }
                    this.B1.addMovement(motionEvent);
                    c50 c50Var = this.E1;
                    if (c50Var != null) {
                        c50Var.b(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.f26978x1 && !this.f26981y1 && motionEvent.getY() >= AndroidUtilities.dp(90.0f)) {
                    this.f26975w1 = motionEvent.getPointerId(0);
                    this.f26981y1 = true;
                    this.f26983z1 = (int) motionEvent.getX();
                    this.A1 = (int) motionEvent.getY();
                    this.B1.clear();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f26975w1) {
                    int x10 = (int) (motionEvent.getX() - this.f26983z1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.A1);
                    boolean z13 = this.f26978x1;
                    av0[] av0VarArr = this.f26948k0;
                    if (z13 && (((z10 = this.f26943h1) && x10 > 0) || (!z10 && x10 < 0))) {
                        if (x10 < 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!U0(motionEvent, z11)) {
                            this.f26981y1 = true;
                            this.f26978x1 = false;
                            N0(false);
                            av0VarArr[0].setTranslationX(0.0f);
                            av0 av0Var = av0VarArr[1];
                            if (this.f26943h1) {
                                i11 = av0VarArr[0].getMeasuredWidth();
                            } else {
                                i11 = -av0VarArr[0].getMeasuredWidth();
                            }
                            av0Var.setTranslationX(i11);
                            Z0(0.0f, av0VarArr[1].F);
                            M0(getTabProgress());
                        }
                    }
                    if (this.f26981y1 && !this.f26978x1) {
                        if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                            if (x10 < 0) {
                                z12 = true;
                            }
                            U0(motionEvent, z12);
                        }
                    } else if (this.f26978x1) {
                        av0VarArr[0].setTranslationX(x10);
                        if (this.f26943h1) {
                            av0VarArr[1].setTranslationX(av0VarArr[0].getMeasuredWidth() + x10);
                        } else {
                            av0VarArr[1].setTranslationX(x10 - av0VarArr[0].getMeasuredWidth());
                        }
                        float abs2 = Math.abs(x10) / av0VarArr[0].getMeasuredWidth();
                        if (!D()) {
                            this.f26955o0 = 0.0f;
                        } else {
                            this.f26955o0 = b0(abs2);
                            s1(abs2);
                            float a02 = a0(abs2);
                            this.f26957p0 = a02;
                            if (a02 != 0.0f && D() && !q0()) {
                                i10 = 0;
                            } else {
                                i10 = 4;
                            }
                            this.f26962r0.setVisibility(i10);
                        }
                        q1(false);
                        Z0(abs2, av0VarArr[1].F);
                        M0(getTabProgress());
                        L0();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f26975w1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    g1(motionEvent);
                }
                return this.f26978x1;
            }
        }
        return false;
    }

    public final void p1() {
        boolean z10;
        float f7;
        org.telegram.ui.ActionBar.u0 u0Var = this.f26967t0;
        if (u0Var != null) {
            if (!this.f26972v1.getMessagesController().isPeerNoForwards(this.f26947j1) && !j0()) {
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
                u0Var.setBackground(org.telegram.ui.ActionBar.h6.g0(h0(org.telegram.ui.ActionBar.h6.f20965z8), 5, -1));
            }
        }
    }

    public boolean q0() {
        return false;
    }

    public final void q1(boolean z10) {
        xs0 xs0Var;
        ct0 ct0Var;
        ik0 ik0Var = this.f26965s0;
        if (ik0Var == null) {
            return;
        }
        float f7 = 0.0f;
        if (!this.V0 && (((xs0Var = this.V) == null || !xs0Var.g()) && ((ct0Var = this.W) == null || !ct0Var.f36309w))) {
            f7 = Utilities.clamp(this.f26955o0 + this.f26957p0, 1.0f, 0.0f);
        }
        ik0Var.setAlpha(f7);
        boolean z11 = false;
        if (z10) {
            if (a0(1.0f) > 0.5f) {
                z11 = true;
            }
            A(z11, true);
        } else if (this.f26977x0 == 2) {
            if (this.f26957p0 > 0.1f) {
                z11 = true;
            }
            A(z11, true);
        } else {
            if (this.f26955o0 < 0.1f) {
                z11 = true;
            }
            A(z11, true);
        }
    }

    public final boolean r0() {
        TLRPC.User user;
        long j3 = this.f26947j1;
        if (j3 <= 0 || (user = MessagesController.getInstance(this.f26972v1.getCurrentAccount()).getUser(Long.valueOf(j3))) == null || !user.bot) {
            return false;
        }
        return true;
    }

    public final void r1(boolean z10) {
        int i10 = 0;
        while (true) {
            av0[] av0VarArr = this.f26948k0;
            if (i10 < av0VarArr.length) {
                int childCount = av0VarArr[i10].h.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = av0VarArr[i10].h.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) childAt).b(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.t7) {
                        ((org.telegram.ui.Cells.t7) childAt).i(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.n7) {
                        ((org.telegram.ui.Cells.n7) childAt).f(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.i7) {
                        ((org.telegram.ui.Cells.i7) childAt).e(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.f2) {
                        ((org.telegram.ui.Cells.f2) childAt).c(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.s2) {
                        ((org.telegram.ui.Cells.s2) childAt).V(false, z10);
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
        org.telegram.ui.ActionBar.u0 u0Var = this.m0;
        if (u0Var == null) {
            return;
        }
        av0[] av0VarArr = this.f26948k0;
        av0 av0Var = av0VarArr[1];
        float f10 = 0.0f;
        if (av0Var != null && av0Var.F == 11) {
            f10 = 0.0f + f7;
        }
        int i10 = 0;
        av0 av0Var2 = av0VarArr[0];
        if (av0Var2 != null && av0Var2.F == 11) {
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

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        boolean z10;
        int i10;
        TLRPC.ChatFull chatFull2 = this.f26933d1;
        if (chatFull2 != null && chatFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26933d1 = chatFull;
        if (chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.f26930c1 == 0) {
                this.f26930c1 = -j3;
                int i11 = 0;
                while (true) {
                    wv0[] wv0VarArr = this.f26968t1;
                    if (i11 >= wv0VarArr.length) {
                        break;
                    }
                    if (wv0VarArr[i11].f32554b[1].size() == 0) {
                        wv0 wv0Var = wv0VarArr[i11];
                        wv0Var.f32560j[1] = this.f26933d1.migrated_from_max_id;
                        wv0Var.f32559i[1] = false;
                    }
                    i11++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.f26933d1;
        if (chatFull3 != null && z10 != chatFull3.stories_pinned_available) {
            xt0 xt0Var = this.I0;
            if (xt0Var != null) {
                if (q0()) {
                    i10 = 9;
                } else {
                    i10 = 8;
                }
                xt0Var.setInitialTabId(i10);
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

    public void setForwardRestrictedHint(c50 c50Var) {
        this.E1 = c50Var;
    }

    public void setMergeDialogId(long j3) {
        this.f26930c1 = j3;
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
            av0[] av0VarArr = this.f26948k0;
            if (i15 >= av0VarArr.length) {
                break;
            }
            av0VarArr[i15].setTranslationY(this.K1);
            i15++;
        }
        if (this.P0 != null) {
            K();
        } else {
            tt0 tt0Var = this.R0;
            if (tt0Var != null) {
                tt0Var.setTranslationY(AndroidUtilities.dp(48.0f) + i11);
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
            av0[] av0VarArr = this.f26948k0;
            if (av0VarArr != null) {
                for (av0 av0Var : av0VarArr) {
                    if (av0Var != null) {
                        gt0 gt0Var = av0Var.h;
                        int paddingLeft = gt0Var.getPaddingLeft();
                        gt0 gt0Var2 = av0Var.h;
                        int i11 = gt0Var2.W2;
                        int paddingRight = gt0Var2.getPaddingRight();
                        gt0 gt0Var3 = av0Var.h;
                        int Y = Y(v0());
                        gt0Var3.f33494c3 = Y;
                        gt0Var.setPadding(paddingLeft, i11, paddingRight, Y);
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
                av0[] av0VarArr = this.f26948k0;
                if (i10 < av0VarArr.length) {
                    o1(av0VarArr[i10], true);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        boolean z10;
        TLRPC.UserFull userFull2 = this.f26936e1;
        if (userFull2 != null && userFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26936e1 = userFull;
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
            av0[] av0VarArr = this.f26948k0;
            if (i11 >= av0VarArr.length) {
                break;
            }
            int measuredHeight = getMeasuredHeight();
            if (av0VarArr[i11].F == 8) {
                f7 = 280.0f;
            } else {
                f7 = 120.0f;
            }
            float f10 = (-(measuredHeight - Math.max(i10, AndroidUtilities.dp(f7)))) / 2.0f;
            av0VarArr[i11].f24502w.setTranslationY(f10);
            av0VarArr[i11].v.setTranslationY(-f10);
            i11++;
        }
        ws0 ws0Var = this.U;
        if (ws0Var != null) {
            ws0Var.setVisibleHeight(i10);
        }
        xs0 xs0Var = this.V;
        if (xs0Var != null) {
            xs0Var.setVisibleHeight(i10);
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
        org.telegram.ui.ActionBar.u0 u0Var = this.m0;
        if (u0Var == null) {
            return;
        }
        boolean z10 = true;
        av0 av0Var = this.f26948k0[1];
        if (av0Var == null || av0Var.F != 11) {
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
        scaleX.scaleY(f11).withEndAction(new js0(0, this, z10)).setDuration(420L).setInterpolator(js.h).start();
    }

    public boolean u0() {
        return false;
    }

    public final void u1() {
        boolean z10;
        int i10;
        ai.e9 e9Var;
        boolean r02 = r0();
        org.telegram.ui.ActionBar.u0 u0Var = this.f26974w0;
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f26971v0;
        int i11 = 8;
        if (r02) {
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
                    pu0 pu0Var = this.f26929c0;
                    if (pu0Var != null && (e9Var = pu0Var.f25795s) != null && !e9Var.m(messageObject.getId())) {
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
        } else if (w0(getClosestTab())) {
            if (u0Var2 != null) {
                u0Var2.setVisibility(8);
            }
            if (u0Var != null) {
                u0Var.setVisibility(8);
            }
        }
    }

    public boolean v0() {
        return false;
    }

    public void v1(boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hw0.v1(boolean):void");
    }

    public final SpannableStringBuilder w() {
        if (this.W1 == null) {
            this.W1 = new SpannableStringBuilder();
            if (r0()) {
                this.W1.append((CharSequence) LocaleController.getString(R.string.ProfileBotPreviewEmptyButton));
            } else {
                this.W1.append((CharSequence) "c");
                this.W1.setSpan(new gr(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.W1.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
            }
        }
        return this.W1;
    }

    public final Boolean w1(View view, View view2) {
        if (!this.f26956o1) {
            av0[] av0VarArr = this.f26948k0;
            boolean z10 = false;
            av0 av0Var = av0VarArr[0];
            if (av0Var != null) {
                int i10 = av0Var.F;
                this.f26958p1 = i10;
                boolean p02 = p0(i10);
                int[] iArr = this.f26951m1;
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
                    } else if (c0(av0VarArr[0].F) >= 5 || w0(av0VarArr[0].F)) {
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

    public final void x(s80 s80Var, org.telegram.ui.ActionBar.m2 m2Var, long j3, int i10) {
        String publicUsername;
        if (j3 > 0) {
            publicUsername = UserObject.getPublicUsername(MessagesController.getInstance(m2Var.getCurrentAccount()).getUser(Long.valueOf(j3)));
        } else {
            publicUsername = ChatObject.getPublicUsername(MessagesController.getInstance(m2Var.getCurrentAccount()).getChat(Long.valueOf(-j3)));
        }
        if (publicUsername == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        a1.g.A(sb2, MessagesController.getInstance(m2Var.getCurrentAccount()).linkPrefix, "/", publicUsername, "/a/");
        sb2.append(i10);
        s80Var.c(R.drawable.media_share, LocaleController.getString(R.string.StoriesAlbumMenuShareLink), new mh0(this, sb2.toString(), m2Var, 4), false);
    }

    public final boolean x0() {
        if (!C() || ((getClosestTab() != 8 && getClosestTab() != 13 && !w0(getClosestTab())) || !this.C1)) {
            xs0 xs0Var = this.V;
            if (xs0Var == null || !xs0Var.g()) {
                ct0 ct0Var = this.W;
                if ((ct0Var == null || !ct0Var.f36309w) && !this.f26956o1 && !this.f26941g1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final Boolean x1(View view, View view2) {
        if (!this.f26956o1) {
            av0[] av0VarArr = this.f26948k0;
            boolean z10 = false;
            av0 av0Var = av0VarArr[0];
            if (av0Var != null) {
                if (!this.f26949k1 || !p0(av0Var.F)) {
                    int i10 = av0VarArr[0].F;
                    this.f26958p1 = i10;
                    boolean p02 = p0(i10);
                    int[] iArr = this.f26951m1;
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
                        } else if (c0(av0VarArr[0].F) >= 5 || w0(av0VarArr[0].F)) {
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

    public final void y(org.telegram.ui.Components.s80 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hw0.y(org.telegram.ui.Components.s80):void");
    }

    public final void y0(int i10, int i11, int i12, boolean z10) {
        wv0[] wv0VarArr = this.f26968t1;
        wv0VarArr[i10].f32553a.clear();
        wv0VarArr[i10].f32554b[0].clear();
        wv0VarArr[i10].f32554b[1].clear();
        wv0 wv0Var = wv0VarArr[i10];
        wv0Var.f32560j[0] = i11;
        wv0Var.f32559i[0] = false;
        wv0Var.f32562l = false;
        wv0Var.f32563m = i12;
        wv0Var.f32564n = (wv0Var.e() - i12) - 1;
        wv0 wv0Var2 = wv0VarArr[i10];
        if (wv0Var2.f32564n < 0) {
            wv0Var2.f32564n = 0;
        }
        wv0Var2.f32561k = i11;
        wv0Var2.f32565o = true;
        wv0Var2.f32558g = false;
        wv0Var2.f32566p++;
        av0 W = W(i10);
        if (W != null && W.h.getAdapter() != null) {
            W.h.getAdapter().l();
        }
        if (z10) {
            int i13 = 0;
            while (true) {
                av0[] av0VarArr = this.f26948k0;
                if (i13 < av0VarArr.length) {
                    av0 av0Var = av0VarArr[i13];
                    if (av0Var.F == i10) {
                        av0Var.f24503x.h1(Math.min(wv0VarArr[i10].e() - 1, wv0VarArr[i10].f32563m), 0);
                    }
                    i13++;
                } else {
                    return;
                }
            }
        }
    }

    public final void z(zu0 zu0Var, int i10, SparseBooleanArray sparseBooleanArray) {
        int childCount = zu0Var.getChildCount();
        m10 m10Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = zu0Var.getChildAt(i11);
            if (childAt instanceof m10) {
                m10Var = childAt;
            }
        }
        if (m10Var != null) {
            zu0Var.removeView(m10Var);
        }
        getViewTreeObserver().addOnPreDrawListener(new cu0(this, zu0Var, sparseBooleanArray, m10Var, i10));
    }

    public final void z0(boolean z10) {
        long j3 = this.F;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i10 == 0 && !t0()) {
            for (int i11 = 0; i11 < 4; i11++) {
                final int i12 = f26919d2[i11];
                wv0[] wv0VarArr = this.f26968t1;
                if (!wv0VarArr[i12].h || z10) {
                    long j10 = this.f26947j1;
                    if (!DialogObject.isEncryptedDialog(j10)) {
                        wv0VarArr[i12].h = false;
                        TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
                        if (i12 == 0) {
                            int i13 = wv0VarArr[i12].f32567q;
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
                        org.telegram.ui.ActionBar.m2 m2Var = this.f26972v1;
                        tL_messages_getSearchResultsPositions.peer = m2Var.getMessagesController().getInputPeer(j10);
                        if (i10 != 0 && m2Var.getUserConfig().getClientUserId() == j10) {
                            tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                            tL_messages_getSearchResultsPositions.saved_peer_id = m2Var.getMessagesController().getInputPeer(j3);
                        }
                        final int i14 = wv0VarArr[i12].f32566p;
                        ConnectionsManager.getInstance(m2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(m2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new is0(hw0.this, tL_error, i14, i12, tLObject, 0));
                            }
                        }), m2Var.getClassGuid());
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
    public final void a(org.telegram.ui.Cells.s2 s2Var) {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void d(org.telegram.ui.Cells.s2 s2Var) {
    }

    @Override
    public final void g(org.telegram.ui.Cells.s2 s2Var) {
    }

    public void o0() {
    }
}
