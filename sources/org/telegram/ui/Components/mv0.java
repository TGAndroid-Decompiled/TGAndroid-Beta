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
public abstract class mv0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Cells.o2 {
    public static final int[] f26397d2 = {0, 1, 2, 4};
    public static final xr0 f26398e2 = new xr0(0);
    public final NumberTextView A0;
    public int A1;
    public final ia B0;
    public VelocityTracker B1;
    public final ImageView C0;
    public boolean C1;
    public final org.telegram.ui.ActionBar.f2 D0;
    public final yt0 D1;
    public final int E;
    public final ArrayList E0;
    public m40 E1;
    public final long F;
    public final ArrayList F0;
    public final org.telegram.ui.ActionBar.d6 F1;
    public final org.telegram.ui.ActionBar.k G;
    public final ArrayList G0;
    public final NotificationCenter.ObserversGroup G1;
    public final rt0 H;
    public final ArrayList H0;
    public boolean H1;
    public final gv0 I;
    public final ct0 I0;
    public final AnimationNotificationsLocker I1;
    public final av0 J;
    public final zs0 J0;
    public zm J1;
    public final zu0 K;
    public final org.telegram.ui.Cells.w0 K0;
    public int K1;
    public final zu0 L;
    public AnimatorSet L0;
    public boolean L1;
    public final zu0 M;
    public final gr0 M0;
    public int M1;
    public final tu0 N;
    public final ArrayList N0;
    public AnimatorSet N1;
    public final au0 O;
    public float O0;
    public final SparseArray O1;
    public final xt0 P;
    public final ns P0;
    public long P1;
    public final vt0 Q;
    public final FrameLayout Q0;
    public boolean Q1;
    public final wu0 R;
    public final ys0 R0;
    public int R1;
    public final xu0 S;
    public final int S0;
    public final jt0 S1;
    public final st0 T;
    public final Paint T0;
    public ai.d9 T1;
    public final as0 U;
    public boolean U0;
    public float U1;
    public final cs0 V;
    public boolean V0;
    public boolean V1;
    public final hs0 W;
    public zg.o0 W0;
    public SpannableStringBuilder W1;
    public final int[] X0;
    public int X1;
    public int Y0;
    public final HashMap Y1;
    public final SparseArray[] Z0;
    public final HashMap Z1;
    public boolean f26399a;
    public final wt0 f26400a0;
    public int f26401a1;
    public int a2;
    public boolean f26402b;
    public final s4.y f26403b0;
    public boolean f26404b1;
    public int f26405b2;
    public boolean f26406c;
    public final ut0 f26407c0;
    public long f26408c1;
    public final mh f26409c2;
    public boolean d;
    public final jv0 f26410d0;
    public TLRPC.ChatFull f26411d1;
    public int e;
    public final zr0 f26412e0;
    public TLRPC.UserFull f26413e1;
    public int f26414f;
    public final jv0 f26415f0;
    public AnimatorSet f26416f1;
    public final iu0 f26417g0;
    public boolean f26418g1;
    public float h;
    public final iu0 f26419h0;
    public boolean f26420h1;
    public final iu0 f26421i0;
    public boolean f26422i1;
    public final du0 f26423j0;
    public final long f26424j1;
    public final fu0[] f26425k0;
    public boolean f26426k1;
    public final org.telegram.ui.ActionBar.u0 f26427l0;
    public boolean l1;
    public final org.telegram.ui.ActionBar.u0 m0;
    public final int[] f26428m1;
    public float f26429n;
    public final org.telegram.ui.ActionBar.u0 f26430n0;
    public float f26431n1;
    public float f26432o0;
    public boolean f26433o1;
    public float f26434p0;
    public int f26435p1;
    public final TextView f26436q0;
    public int f26437q1;
    public boolean f26438r;
    public final ImageView f26439r0;
    public final ms0 f26440r1;
    public int f26441s;
    public final oj0 f26442s0;
    public float f26443s1;
    public final org.telegram.ui.ActionBar.u0 f26444t0;
    public final bv0[] f26445t1;
    public final org.telegram.ui.ActionBar.u0 f26446u0;
    public final ev0 f26447u1;
    public int v;
    public final org.telegram.ui.ActionBar.u0 f26448v0;
    public final org.telegram.ui.ActionBar.m2 f26449v1;
    public int f26450w;
    public final org.telegram.ui.ActionBar.u0 f26451w0;
    public int f26452w1;
    public final Rect f26453x;
    public int f26454x0;
    public boolean f26455x1;
    public final w00 f26456y;
    public final Drawable f26457y0;
    public boolean f26458y1;
    public boolean f26459z0;
    public int f26460z1;

    public mv0(android.content.Context r40, long r41, org.telegram.ui.Components.ev0 r43, int r44, java.util.ArrayList r45, org.telegram.tgnet.TLRPC.ChatFull r46, org.telegram.tgnet.TLRPC.UserFull r47, int r48, int r49, org.telegram.ui.ActionBar.m2 r50, org.telegram.ui.Components.yt0 r51, int r52, org.telegram.ui.ActionBar.d6 r53, ah.c r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mv0.<init>(android.content.Context, long, org.telegram.ui.Components.ev0, int, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.tgnet.TLRPC$UserFull, int, int, org.telegram.ui.ActionBar.m2, org.telegram.ui.Components.yt0, int, org.telegram.ui.ActionBar.d6, ah.c):void");
    }

    public static zt0 M(int i10, long j3, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        zt0 zt0Var = new zt0(context, d6Var);
        TextView textView = zt0Var.f31060a;
        if (i10 == 0) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoMediaSecret));
                return zt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoMedia));
            return zt0Var;
        } else if (i10 == 1) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedFilesSecret));
                return zt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedFiles));
            return zt0Var;
        } else if (i10 == 2) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedVoiceSecret));
                return zt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedVoice));
            return zt0Var;
        } else if (i10 == 3) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedLinksSecret));
                return zt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedLinks));
            return zt0Var;
        } else if (i10 == 4) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedAudioSecret));
                return zt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedAudio));
            return zt0Var;
        } else if (i10 == 5) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedGifSecret));
                return zt0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoGIFs));
            return zt0Var;
        } else {
            ImageView imageView = zt0Var.f31061b;
            if (i10 == 6) {
                imageView.setImageDrawable(null);
                textView.setText(LocaleController.getString(R.string.NoGroupsInCommon));
                return zt0Var;
            }
            if (i10 == 7) {
                imageView.setImageDrawable(null);
                textView.setText("");
            }
            return zt0Var;
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

    public static void g(mv0 mv0Var, int i10, TL_stories.StoryItem storyItem, String str) {
        zm zmVar = new zm(mv0Var, i10, storyItem, 10);
        ai.l9 storiesController = mv0Var.getStoriesController();
        long j3 = mv0Var.f26424j1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.c0(i10, j3, arrayList);
        yc.a0(mv0Var.f26449v1).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", 1, str)), LocaleController.getString(R.string.UndoNoCaps), zmVar).j();
    }

    public ai.l9 getStoriesController() {
        return MessagesController.getInstance(this.f26449v1.getCurrentAccount()).getStoriesController();
    }

    public static void h(mv0 mv0Var, TL_stories.StoryItem storyItem) {
        mv0Var.getStoriesController().o0(mv0Var.f26424j1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        yc.a0(mv0Var.f26449v1).G(R.raw.chats_archived, 5000, LocaleController.formatPluralString("StoryArchived", 1, new Object[0])).j();
    }

    public static void i(mv0 mv0Var, long j3, int i10, String str) {
        ai.x8 B = mv0Var.getStoriesController().B(j3, true);
        int i11 = B.f1705a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        ((ai.e9) B.h.get(c10)).f855b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f1706b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public static void j(mv0 mv0Var, TL_stories.StoryItem storyItem, ai.e9 e9Var) {
        mv0Var.getStoriesController().c(e9Var.f854a, mv0Var.f26424j1, storyItem);
        AndroidUtilities.runOnUIThread(new zn0(6, mv0Var, e9Var), 100L);
    }

    public static void m(mv0 mv0Var, HashSet hashSet, TL_stories.StoryItem storyItem, b80 b80Var, ai.e9 e9Var) {
        String formatString;
        long j3 = mv0Var.f26424j1;
        if (hashSet.contains(Integer.valueOf(e9Var.f854a))) {
            mv0Var.getStoriesController().c(e9Var.f854a, j3, storyItem);
            formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, e9Var.f855b);
        } else {
            ai.l9 storiesController = mv0Var.getStoriesController();
            int i10 = e9Var.f854a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.c0(i10, j3, arrayList);
            formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, e9Var.f855b);
        }
        yc.a0(mv0Var.f26449v1).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
        b80Var.u();
    }

    public static void n(mv0 mv0Var, long j3, int i10) {
        ai.x8 B = mv0Var.getStoriesController().B(j3, true);
        int i11 = B.f1705a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f1706b);
        tL_deleteAlbum.album_id = ((ai.e9) B.h.remove(c10)).f854a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public static int p(View view) {
        if (view instanceof org.telegram.ui.Cells.t7) {
            return ((org.telegram.ui.Cells.t7) view).getMessageId();
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            return ((org.telegram.ui.Cells.k7) view).getMessage().getId();
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            return ((org.telegram.ui.Cells.j7) view).getMessage().getId();
        }
        return 0;
    }

    public static boolean p0(int i10) {
        if (i10 != 8 && i10 != 9 && !w0(i10)) {
            return false;
        }
        return true;
    }

    public static void q(fu0 fu0Var, bv0[] bv0VarArr, boolean z10) {
        zn0 zn0Var;
        if (z10) {
            if (SharedConfig.fastScrollHintCount > 0 && fu0Var.G == null && !fu0Var.I && fu0Var.h.getFastScroll() != null && fu0Var.h.getFastScroll().f24594a0 && fu0Var.h.getFastScroll().getVisibility() == 0 && bv0VarArr[0].e() >= 50) {
                SharedConfig.setFastScrollHintCount(SharedConfig.fastScrollHintCount - 1);
                fu0Var.I = true;
                Context context = fu0Var.getContext();
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                textView.setText(LocaleController.getString(R.string.SharedMediaFastScrollHint));
                textView.setTextSize(1, 14.0f);
                textView.setMaxLines(3);
                int i10 = org.telegram.ui.ActionBar.h6.f19304pf;
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
                frameLayout.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19323qf, false)));
                frameLayout.addView(textView, w7.y5.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
                ?? view = new View(context);
                view.f23707a = new Random();
                Paint paint = new Paint(1);
                view.f23708b = paint;
                Paint paint2 = new Paint(1);
                view.f23709c = paint2;
                view.f23710f = 1.0f;
                view.h = 0.0f;
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, i10, false), 76));
                paint2.setColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
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
                frameLayout.addView(view, w7.y5.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                fu0Var.G = frameLayout;
                fu0Var.addView((View) frameLayout, w7.y5.c(-2.0f, -2));
                fu0Var.G.setAlpha(0.0f);
                fu0Var.G.setScaleX(0.8f);
                fu0Var.G.setScaleY(0.8f);
                fu0Var.G.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                fu0Var.invalidate();
                zn0 zn0Var2 = new zn0(5, fu0Var, frameLayout);
                fu0Var.H = zn0Var2;
                AndroidUtilities.runOnUIThread(zn0Var2, 4000L);
            }
        } else if (fu0Var.G != null && (zn0Var = fu0Var.H) != null) {
            AndroidUtilities.cancelRunOnUIThread(zn0Var);
            fu0Var.H.run();
            fu0Var.H = null;
            fu0Var.G = null;
        }
    }

    public static void s(org.telegram.ui.Components.mv0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mv0.s(org.telegram.ui.Components.mv0):void");
    }

    public static void t(mv0 mv0Var, int i10, boolean z10) {
        fu0[] fu0VarArr = mv0Var.f26425k0;
        if (fu0VarArr[0].F == i10) {
            return;
        }
        fu0 fu0Var = fu0VarArr[1];
        fu0Var.F = i10;
        fu0Var.setVisibility(0);
        mv0Var.k0();
        mv0Var.m1(true);
        mv0Var.f26420h1 = z10;
        mv0Var.L0();
        mv0Var.A(!mv0Var.s0(i10), true);
        mv0Var.q1(true);
    }

    public static int u(mv0 mv0Var, s4.h0 h0Var) {
        if (h0Var == mv0Var.f26407c0) {
            return 8;
        }
        if (h0Var == mv0Var.f26412e0) {
            return 9;
        }
        for (lv0 lv0Var : mv0Var.Y1.values()) {
            if (lv0Var.f26128c == h0Var) {
                return lv0Var.f26126a;
            }
        }
        return -1;
    }

    public static int v(mv0 mv0Var, s4.h0 h0Var) {
        if (h0Var == mv0Var.f26410d0) {
            return 8;
        }
        if (h0Var == mv0Var.f26415f0) {
            return 9;
        }
        for (lv0 lv0Var : mv0Var.Y1.values()) {
            if (lv0Var.d == h0Var) {
                return lv0Var.f26126a;
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
        oj0 oj0Var = this.f26442s0;
        if (oj0Var != null && this.V1 != z10) {
            this.V1 = z10;
            if (!z10 && oj0Var.getAnimatedDrawable().f26008a0 < 20) {
                oj0Var.getAnimatedDrawable().P(0);
            } else {
                lj0 animatedDrawable = oj0Var.getAnimatedDrawable();
                if (this.V1) {
                    i10 = 50;
                } else {
                    i10 = 100;
                }
                animatedDrawable.P(i10);
            }
            if (z11) {
                oj0Var.getAnimatedDrawable().start();
            } else {
                oj0Var.getAnimatedDrawable().M(oj0Var.getAnimatedDrawable().f26015f);
            }
        }
    }

    public final void A0(int i10) {
        int i11;
        bv0[] bv0VarArr = this.f26445t1;
        if (i10 == 0) {
            int i12 = bv0VarArr[0].f23028q;
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
        bv0VarArr[i10].f23019g = true;
        org.telegram.ui.ActionBar.m2 m2Var = this.f26449v1;
        m2Var.getMediaDataController().loadMedia(this.f26424j1, 50, 0, bv0VarArr[i10].f23022k, i11, this.F, 1, m2Var.getClassGuid(), bv0VarArr[i10].f23027p, null, null);
    }

    public final void B(int i10) {
        int i11;
        fu0 W = W(this.f26435p1);
        this.f26441s = -1;
        if (W != null) {
            W.h.C0();
            this.f26437q1 = i10;
            W.f24356r.setVisibility(0);
            if (p0(this.f26435p1)) {
                W.f24356r.setAdapter(l1(this.f26435p1));
            } else {
                W.f24356r.setAdapter(this.I);
            }
            eu0 eu0Var = W.f24356r;
            int paddingLeft = eu0Var.getPaddingLeft();
            eu0 eu0Var2 = W.f24356r;
            int Z = Z(W.F);
            eu0Var2.f24048k3 = Z;
            int paddingRight = W.f24356r.getPaddingRight();
            eu0 eu0Var3 = W.f24356r;
            int Y = Y(v0());
            eu0Var3.f24049l3 = Y;
            eu0Var.setPadding(paddingLeft, Z, paddingRight, Y);
            W.f24357s.y1(i10);
            W.f24356r.a0();
            int i12 = 0;
            while (true) {
                fu0[] fu0VarArr = this.f26425k0;
                if (i12 >= fu0VarArr.length) {
                    break;
                }
                fu0 fu0Var = fu0VarArr[i12];
                if (fu0Var != null && ((i11 = fu0Var.F) == 0 || p0(i11))) {
                    AndroidUtilities.updateVisibleRows(fu0VarArr[i12].h);
                }
                i12++;
            }
            this.f26433o1 = true;
            if (this.f26435p1 == 0) {
                this.f26445t1[0].g(true);
            }
            this.f26431n1 = 0.0f;
            X0();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.I1.lock();
            ofFloat.addUpdateListener(new bt0(this, W, 1));
            ofFloat.addListener(new ei.y2(this, p0(W.F) ? 1 : 0, i10, 2));
            ofFloat.setInterpolator(tr.f28636f);
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
        long j3 = this.f26424j1;
        org.telegram.ui.ActionBar.m2 m2Var = this.f26449v1;
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
        as0 as0Var;
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
        wu0 wu0Var = this.R;
        SparseArray[] sparseArrayArr = this.Z0;
        org.telegram.ui.ActionBar.m2 m2Var = this.f26449v1;
        boolean z12 = true;
        char c10 = 1;
        if (i10 == 101) {
            boolean p02 = p0(getSelectedTab());
            org.telegram.ui.ActionBar.d6 d6Var = this.F1;
            if (!p02 && getSelectedTab() != 13) {
                if (getSelectedTab() == 11) {
                    SavedMessagesController savedMessagesController = m2Var.getMessagesController().getSavedMessagesController();
                    final ArrayList arrayList = new ArrayList();
                    for (int i15 = 0; i15 < savedMessagesController.allDialogs.size(); i15++) {
                        long j3 = savedMessagesController.allDialogs.get(i15).dialogId;
                        if (wu0Var.f30063w.contains(Long.valueOf(j3))) {
                            arrayList.add(Long.valueOf(j3));
                        }
                    }
                    String str = "";
                    if (!arrayList.isEmpty()) {
                        Long l4 = (Long) arrayList.get(0);
                        long longValue = l4.longValue();
                        if (longValue == m2Var.getUserConfig().getClientUserId()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        int i16 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                        if (i16 < 0) {
                            TLRPC.Chat chat2 = m2Var.getMessagesController().getChat(Long.valueOf(-longValue));
                            if (chat2 != null) {
                                str = chat2.title;
                            }
                        } else if (i16 >= 0 && (user2 = m2Var.getMessagesController().getUser(l4)) != null) {
                            str = UserObject.isAnonymous(user2) ? LocaleController.getString(R.string.AnonymousForward) : UserObject.getUserName(user2);
                        }
                    } else {
                        z11 = false;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, d6Var);
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
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18678a;
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
                        public final mv0 f27167b;

                        {
                            this.f27167b = this;
                        }

                        @Override
                        public final void f(org.telegram.ui.ActionBar.a2 a2Var2, int i17) {
                            switch (r3) {
                                case 0:
                                    mv0 mv0Var = this.f27167b;
                                    org.telegram.ui.ActionBar.m2 m2Var2 = mv0Var.f26449v1;
                                    ai.l9 storiesController = m2Var2.getMessagesController().getStoriesController();
                                    long j10 = mv0Var.f26424j1;
                                    ArrayList arrayList2 = arrayList;
                                    storiesController.s(j10, arrayList2);
                                    yc.a0(m2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList2.size(), new Object[0])).j();
                                    mv0Var.L(false);
                                    return;
                                default:
                                    mv0 mv0Var2 = this.f27167b;
                                    mv0Var2.getClass();
                                    int i18 = 0;
                                    while (true) {
                                        ArrayList arrayList3 = arrayList;
                                        if (i18 < arrayList3.size()) {
                                            mv0Var2.f26449v1.getMessagesController().deleteSavedDialog(((Long) arrayList3.get(i18)).longValue());
                                            i18++;
                                        } else {
                                            mv0Var2.L(true);
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
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19315q7, false));
                        return;
                    }
                    return;
                }
                long j10 = this.f26424j1;
                if (DialogObject.isEncryptedDialog(j10)) {
                    encryptedChat = org.telegram.messenger.f0.l(m2Var.getMessagesController(), j10);
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
                e5.z(m2Var, user, chat, encryptedChat, null, this.f26408c1, null, this.Z0, null, 0, 0, null, new gr0(this, 1), null, this.F1);
            } else if (sparseArrayArr[0] != null) {
                if (r0() && (as0Var = this.U) != null && as0Var.getCurrentList() != null) {
                    ai.u8 currentList = as0Var.getCurrentList();
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
                        org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f18678a;
                        a2Var2.R = string2;
                        a2Var2.T = LocaleController.formatPluralString("DeleteBotPreviewsSubtitle", arrayList2.size(), new Object[0]);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new v50(this, currentList, arrayList2, 1));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new ia0(20));
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
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), 0, d6Var);
                    if (arrayList3.size() > 1) {
                        i11 = R.string.DeleteStoriesTitle;
                    } else {
                        i11 = R.string.DeleteStoryTitle;
                    }
                    String string3 = LocaleController.getString(i11);
                    org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder3.f18678a;
                    a2Var3.R = string3;
                    a2Var3.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList3.size(), new Object[0]);
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1(this) {
                        public final mv0 f27167b;

                        {
                            this.f27167b = this;
                        }

                        @Override
                        public final void f(org.telegram.ui.ActionBar.a2 a2Var22, int i172) {
                            switch (r3) {
                                case 0:
                                    mv0 mv0Var = this.f27167b;
                                    org.telegram.ui.ActionBar.m2 m2Var2 = mv0Var.f26449v1;
                                    ai.l9 storiesController = m2Var2.getMessagesController().getStoriesController();
                                    long j102 = mv0Var.f26424j1;
                                    ArrayList arrayList22 = arrayList3;
                                    storiesController.s(j102, arrayList22);
                                    yc.a0(m2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList22.size(), new Object[0])).j();
                                    mv0Var.L(false);
                                    return;
                                default:
                                    mv0 mv0Var2 = this.f27167b;
                                    mv0Var2.getClass();
                                    int i182 = 0;
                                    while (true) {
                                        ArrayList arrayList32 = arrayList3;
                                        if (i182 < arrayList32.size()) {
                                            mv0Var2.f26449v1.getMessagesController().deleteSavedDialog(((Long) arrayList32.get(i182)).longValue());
                                            i182++;
                                        } else {
                                            mv0Var2.L(true);
                                            return;
                                        }
                                    }
                            }
                        }
                    });
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new ia0(21));
                    a2Var3.show();
                    a2Var3.h();
                }
            }
        } else if (i10 == 100) {
            if (this.f26413e1 != null && m2Var.getMessagesController().isUserNoForwards(this.f26413e1)) {
                m40 m40Var = this.E1;
                if (m40Var != null) {
                    m40Var.setText(LocaleController.getString(R.string.ForwardsRestrictedInfoUser));
                    this.E1.f(view, true);
                    return;
                }
                return;
            }
            if (this.f26411d1 != null) {
                TLRPC.Chat chat3 = m2Var.getMessagesController().getChat(Long.valueOf(this.f26411d1.f18353id));
                if (m2Var.getMessagesController().isChatNoForwards(chat3)) {
                    m40 m40Var2 = this.E1;
                    if (m40Var2 != null) {
                        if (ChatObject.isChannel(chat3) && !chat3.megagroup) {
                            string = LocaleController.getString(R.string.ForwardsRestrictedInfoChannel);
                        } else {
                            string = LocaleController.getString(R.string.ForwardsRestrictedInfoGroup);
                        }
                        m40Var2.setText(string);
                        this.E1.f(view, true);
                        return;
                    }
                    return;
                }
            }
            if (j0()) {
                m40 m40Var3 = this.E1;
                if (m40Var3 != null) {
                    m40Var3.setText(LocaleController.getString("ForwardsRestrictedInfoBot", R.string.ForwardsRestrictedInfoBot));
                    this.E1.f(view, true);
                    return;
                }
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("canSelectTopics", true);
            bundle.putInt("dialogsType", 3);
            org.telegram.ui.qy qyVar = new org.telegram.ui.qy(bundle);
            qyVar.C2 = new hr0(this);
            m2Var.presentFragment(qyVar);
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
                org.telegram.ui.wn wnVar = new org.telegram.ui.wn(bundle2);
                wnVar.L7 = messageObject.getId();
                long j11 = this.F;
                if (j11 != 0) {
                    ng.d.a(wnVar, MessagesStorage.TopicKey.of(dialogId, j11));
                    bundle2.putInt("message_id", messageObject.getId());
                }
                m2Var.presentFragment(wnVar, false);
            }
        } else if (i10 == 103 || i10 == 104) {
            if (getClosestTab() == 8) {
                ut0 ut0Var = this.f26407c0;
                if (ut0Var != null && ut0Var.f25553s != null) {
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
            SavedMessagesController savedMessagesController2 = m2Var.getMessagesController().getSavedMessagesController();
            ArrayList<Long> arrayList5 = new ArrayList<>();
            for (int i20 = 0; i20 < savedMessagesController2.allDialogs.size(); i20++) {
                long j12 = savedMessagesController2.allDialogs.get(i20).dialogId;
                if (wu0Var.f30063w.contains(Long.valueOf(j12))) {
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
                    fu0[] fu0VarArr = this.f26425k0;
                    if (i21 >= fu0VarArr.length) {
                        break;
                    }
                    fu0 fu0Var = fu0VarArr[i21];
                    if (fu0Var.F == 11) {
                        fu0Var.f24359x.h1(0, 0);
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
        fu0 fu0Var;
        fu0[] fu0VarArr = this.f26425k0;
        if (fu0VarArr == null || (fu0Var = fu0VarArr[0]) == null) {
            return false;
        }
        if (this.f26426k1 && p0(fu0Var.F)) {
            return false;
        }
        boolean p02 = p0(fu0VarArr[0].F);
        int i10 = this.f26428m1[p02 ? 1 : 0];
        if (i10 == X(p02 ? 1 : 0, i10, false)) {
            return false;
        }
        return true;
    }

    public final void F() {
        ct0 ct0Var = this.I0;
        if (!ct0Var.d(ct0Var.getCurrentTabId())) {
            int firstTabId = ct0Var.getFirstTabId();
            ct0Var.setInitialTabId(firstTabId);
            this.f26425k0[0].F = firstTabId;
            m1(false);
        }
    }

    public final void F0() {
        ai.d9 d9Var;
        ai.d9 d9Var2;
        this.G1.removeAllObservers();
        ut0 ut0Var = this.f26407c0;
        if (ut0Var != null && (d9Var2 = ut0Var.f25553s) != null && d9Var2 != null) {
            d9Var2.z(ut0Var.v);
        }
        zr0 zr0Var = this.f26412e0;
        if (zr0Var != null && (d9Var = zr0Var.f25553s) != null && d9Var != null) {
            d9Var.z(zr0Var.v);
        }
        for (lv0 lv0Var : this.Y1.values()) {
            kv0 kv0Var = lv0Var.f26128c;
            ai.d9 d9Var3 = kv0Var.f25553s;
            if (d9Var3 != null && d9Var3 != null) {
                d9Var3.z(kv0Var.v);
            }
        }
    }

    public final void G(fu0 fu0Var, zl0 zl0Var, s4.c0 c0Var) {
        int abs;
        int h;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        s4.c1 K;
        MessageObject messageObject;
        ai.d9 d9Var;
        if (!this.f26433o1 && this.J1 == null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (zl0Var.getFastScroll() == null || !zl0Var.getFastScroll().f24609n || currentTimeMillis - fu0Var.f24351a >= 300) {
                fu0Var.f24351a = currentTimeMillis;
                if ((!this.V0 || !this.U0 || fu0Var.F == 11) && fu0Var.F != 7) {
                    int L0 = c0Var.L0();
                    if (L0 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(c0Var.N0() - L0) + 1;
                    }
                    if (zl0Var.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = zl0Var.getAdapter().h();
                    }
                    int i15 = fu0Var.F;
                    int[] iArr = this.f26428m1;
                    bv0[] bv0VarArr = this.f26445t1;
                    if (i15 == 0 || i15 == 1 || i15 == 2 || i15 == 4) {
                        h = bv0VarArr[i15].d() + bv0VarArr[i15].f23015a.size();
                        bv0 bv0Var = bv0VarArr[i15];
                        if (bv0Var.h && bv0Var.e.size() > 2 && fu0Var.F == 0 && bv0VarArr[i15].f23015a.size() != 0) {
                            if (i15 == 0) {
                                i10 = iArr[0];
                            } else {
                                i10 = 1;
                            }
                            float f7 = i10;
                            int measuredHeight = (int) ((zl0Var.getMeasuredHeight() / (zl0Var.getMeasuredWidth() / f7)) * f7 * 1.5f);
                            if (measuredHeight < 100) {
                                measuredHeight = 100;
                            }
                            if (measuredHeight < ((ku0) bv0VarArr[i15].e.get(1)).f25827b) {
                                measuredHeight = ((ku0) bv0VarArr[i15].e.get(1)).f25827b;
                            }
                            if ((L0 > h && L0 - h > measuredHeight) || ((i11 = L0 + abs) < bv0VarArr[i15].f23024m && bv0VarArr[0].f23024m - i11 > measuredHeight)) {
                                zm zmVar = new zm(this, i15, zl0Var, 12);
                                this.J1 = zmVar;
                                AndroidUtilities.runOnUIThread(zmVar);
                                return;
                            }
                        }
                    }
                    int i16 = fu0Var.F;
                    if (i16 != 7) {
                        if (p0(i16)) {
                            jv0 k12 = k1(fu0Var.F);
                            if (k12 != null && (d9Var = k12.f25553s) != null && L0 + abs > d9Var.i() - iArr[1]) {
                                k12.O();
                                return;
                            }
                            return;
                        }
                        int i17 = fu0Var.F;
                        if (i17 == 6) {
                            if (abs > 0) {
                                xt0 xt0Var = this.P;
                                boolean z10 = xt0Var.h;
                                ArrayList arrayList = xt0Var.d;
                                if (!z10 && !xt0Var.e && !arrayList.isEmpty() && L0 + abs >= h - 5) {
                                    xt0.E(xt0Var, ((TLRPC.Chat) hg.c.g(1, arrayList)).f18352id);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.m2 m2Var = this.f26449v1;
                        if (i17 == 11) {
                            int i18 = -1;
                            for (int i19 = 0; i19 < fu0Var.h.getChildCount(); i19++) {
                                View childAt = fu0Var.h.getChildAt(i19);
                                fu0Var.h.getClass();
                                i18 = Math.max(RecyclerView.R(childAt), i18);
                            }
                            s4.h0 adapter = fu0Var.h.getAdapter();
                            xu0 xu0Var = this.S;
                            if (adapter == xu0Var) {
                                if (i18 + 1 >= xu0Var.h.size() + xu0Var.e.size() && !xu0Var.f30511s && !xu0Var.f30510r) {
                                    xu0Var.f30510r = true;
                                    xu0Var.F();
                                }
                            } else if (i18 + 1 >= m2Var.getMessagesController().getSavedMessagesController().getLoadedCount()) {
                                m2Var.getMessagesController().getSavedMessagesController().loadDialogs(false);
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
                            if (abs + L0 > h - i12 || bv0VarArr[i13].f23026o) {
                                bv0 bv0Var2 = bv0VarArr[i13];
                                if (!bv0Var2.f23019g) {
                                    if (i17 == 0) {
                                        int i20 = bv0VarArr[0].f23028q;
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
                                    boolean[] zArr = bv0Var2.f23020i;
                                    if (!zArr[0]) {
                                        bv0Var2.f23019g = true;
                                        m2Var.getMediaDataController().loadMedia(this.f26424j1, 50, bv0VarArr[i13].f23021j[0], 0, i14, this.F, 1, m2Var.getClassGuid(), bv0VarArr[i13].f23027p, null, null);
                                    } else if (this.f26408c1 != 0 && !zArr[1]) {
                                        bv0Var2.f23019g = true;
                                        m2Var.getMediaDataController().loadMedia(this.f26408c1, 50, bv0VarArr[i13].f23021j[1], 0, i14, this.F, 1, m2Var.getClassGuid(), bv0VarArr[i13].f23027p, null, null);
                                    }
                                }
                            }
                            bv0 bv0Var3 = bv0VarArr[i13];
                            int i21 = bv0Var3.f23024m;
                            if (i13 == 0) {
                                i21 = this.H.f24679f.f26445t1[0].f23024m;
                            }
                            if (L0 - i21 < i12 + 1 && !bv0Var3.f23019g && !bv0Var3.f23023l && !bv0Var3.f23026o) {
                                A0(fu0Var.F);
                            }
                            fu0 fu0Var2 = this.f26425k0[0];
                            if (fu0Var2.h == zl0Var) {
                                int i22 = fu0Var2.F;
                                if ((i22 == 0 || i22 == 5) && L0 != -1 && (K = zl0Var.K(L0)) != null) {
                                    int i23 = K.f43071f;
                                    if (i23 == 0 || i23 == 12) {
                                        View view = K.f43068a;
                                        boolean z11 = view instanceof org.telegram.ui.Cells.u7;
                                        org.telegram.ui.Cells.w0 w0Var = this.K0;
                                        if (z11) {
                                            org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                                            if (u7Var.e <= 0) {
                                                messageObject = null;
                                            } else {
                                                messageObject = u7Var.f21679b[0];
                                            }
                                            if (messageObject != null) {
                                                w0Var.T(messageObject.messageOwner.date, false, true);
                                            }
                                        } else if (view instanceof org.telegram.ui.Cells.f2) {
                                            w0Var.T(((org.telegram.ui.Cells.f2) view).getDate(), false, true);
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
        if (messageObject != null && !this.f26433o1) {
            hs0 hs0Var = this.W;
            if (hs0Var == null || !hs0Var.f37665w) {
                int i14 = 0;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                i14 = 0;
                String str2 = null;
                ai.d9 d9Var = null;
                boolean z15 = true;
                if (this.C1) {
                    int i15 = 8;
                    if (i11 != 8 || C()) {
                        if (messageObject.getDialogId() == this.f26424j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        SparseArray[] sparseArrayArr = this.Z0;
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            sparseArrayArr[c10].remove(messageObject.getId());
                            if (!messageObject.canDeleteMessage(false, null)) {
                                this.f26401a1--;
                            }
                        } else {
                            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                                sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                                if (!messageObject.canDeleteMessage(false, null)) {
                                    this.f26401a1++;
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
                            if (this.f26401a1 == 0) {
                                i12 = 0;
                            } else {
                                i12 = 8;
                            }
                            this.f26427l0.setVisibility(i12);
                            org.telegram.ui.ActionBar.u0 u0Var = this.f26446u0;
                            if (u0Var != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14 && sparseArrayArr[0].size() == 1) {
                                    i13 = 0;
                                } else {
                                    i13 = 8;
                                }
                                u0Var.setVisibility(i13);
                            }
                            org.telegram.ui.ActionBar.u0 u0Var2 = this.f26444t0;
                            if (u0Var2 != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                                    i15 = 0;
                                }
                                u0Var2.setVisibility(i15);
                            }
                            u1();
                        }
                        this.f26404b1 = false;
                        if (view instanceof org.telegram.ui.Cells.k7) {
                            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z10 = true;
                            }
                            k7Var.b(z10, true);
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
                        } else if (view instanceof org.telegram.ui.Cells.j7) {
                            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z12 = true;
                            }
                            j7Var.e(z12, true);
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
                    ms0 ms0Var = this.f26440r1;
                    bv0[] bv0VarArr = this.f26445t1;
                    org.telegram.ui.ActionBar.m2 m2Var = this.f26449v1;
                    if (i11 == 0) {
                        bv0 bv0Var = bv0VarArr[i11];
                        int i16 = i10 - bv0Var.f23024m;
                        if (i16 >= 0 && i16 < bv0Var.f23015a.size()) {
                            PhotoViewer.t1().J2(null, m2Var, null);
                            PhotoViewer.t1().a2(bv0VarArr[i11].f23015a, i16, this.f26424j1, this.f26408c1, this.F, ms0Var);
                        }
                    } else if (i11 != 2 && i11 != 4) {
                        if (i11 == 5) {
                            PhotoViewer.t1().J2(null, m2Var, null);
                            int indexOf = bv0VarArr[i11].f23015a.indexOf(messageObject);
                            if (indexOf < 0) {
                                PhotoViewer.t1().a2(org.telegram.messenger.f0.k(messageObject), 0, 0L, 0L, 0L, ms0Var);
                            } else {
                                PhotoViewer.t1().a2(bv0VarArr[i11].f23015a, indexOf, this.f26424j1, this.f26408c1, this.F, ms0Var);
                            }
                        } else if (i11 == 1) {
                            if (view instanceof org.telegram.ui.Cells.k7) {
                                org.telegram.ui.Cells.k7 k7Var2 = (org.telegram.ui.Cells.k7) view;
                                TLRPC.Document document = messageObject.getDocument();
                                if (k7Var2.G) {
                                    if (messageObject.canPreviewDocument()) {
                                        PhotoViewer.t1().J2(null, m2Var, null);
                                        int indexOf2 = bv0VarArr[i11].f23015a.indexOf(messageObject);
                                        if (indexOf2 < 0) {
                                            PhotoViewer.t1().a2(org.telegram.messenger.f0.k(messageObject), 0, 0L, 0L, 0L, ms0Var);
                                            return;
                                        }
                                        PhotoViewer.t1().a2(bv0VarArr[i11].f23015a, indexOf2, this.f26424j1, this.f26408c1, this.F, ms0Var);
                                        return;
                                    }
                                    AndroidUtilities.openDocument(messageObject, m2Var.getParentActivity(), m2Var);
                                } else if (!k7Var2.F) {
                                    MessageObject message = k7Var2.getMessage();
                                    message.putInDownloadsStore = true;
                                    m2Var.getFileLoader().loadFile(document, message, 0, 0);
                                    k7Var2.f(true);
                                } else {
                                    m2Var.getFileLoader().cancelLoadFile(document);
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
                                        LaunchActivity launchActivity = LaunchActivity.G1;
                                        if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                                            m2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                            return;
                                        }
                                        return;
                                    }
                                    String str3 = webPage.embed_url;
                                    if (str3 != null && str3.length() != 0) {
                                        yu.J(m2Var, messageObject, this.f26440r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
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
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        } else if (p0(i11)) {
                            jv0 k12 = k1(i11);
                            if (k12 != null) {
                                d9Var = k12.f25553s;
                            }
                            if (d9Var != null) {
                                ai.jc orCreateStoryViewer = m2Var.getOrCreateStoryViewer();
                                Context context = getContext();
                                int id2 = messageObject.getId();
                                ai.u9 a2 = ai.u9.a(this.f26425k0[0].h);
                                a2.e = new ov(d9Var, 19);
                                if ((m2Var instanceof ProfileActivity) && ((ProfileActivity) m2Var).f31725s1) {
                                    i14 = AndroidUtilities.dp(68.0f);
                                }
                                a2.f1592s += i14;
                                orCreateStoryViewer.C(context, id2, d9Var, a2);
                            } else {
                                return;
                            }
                        }
                    } else if (view instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) view).a();
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
        as0 as0Var;
        float f10;
        boolean z11;
        fu0[] fu0VarArr = this.f26425k0;
        int i10 = fu0VarArr[0].F;
        if (i10 == 13 && (as0Var = this.U) != null) {
            View currentView = as0Var.f3610n.getCurrentView();
            if (currentView instanceof bi.u) {
                bi.u uVar = (bi.u) currentView;
                bi.m mVar = uVar.v;
                bi.j jVar = uVar.f3593f;
                if (uVar.f3590a != null && uVar.getParent() != null) {
                    if (!uVar.f3591b || uVar.K) {
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
                                            uVar.f3592c = 0.0f;
                                        } else {
                                            if (z12) {
                                                f10 = org.telegram.messenger.f0.x(2.0f, uVar.Q, 1.0f, 1.0f);
                                            } else {
                                                f10 = (1.0f - uVar.Q) / 0.5f;
                                            }
                                            uVar.f3592c = Math.max(0.0f, Math.min(1.0f, f10));
                                        }
                                        float f11 = uVar.f3592c;
                                        int i14 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
                                        if (i14 == 0 || f11 == 0.0f) {
                                            if (i14 == 0) {
                                                int i15 = uVar.e;
                                                int ceil = (((int) Math.ceil(uVar.S / uVar.e)) * i15) + ((int) ((uVar.W.G.f26460z1 / (jVar.getMeasuredWidth() - ((int) (jVar.getMeasuredWidth() / uVar.e)))) * (i15 - 1)));
                                                if (ceil >= mVar.h()) {
                                                    ceil = mVar.h() - 1;
                                                }
                                                uVar.S = ceil;
                                            }
                                            uVar.a();
                                            if (uVar.f3592c == 0.0f) {
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
                                jVar.J0(false);
                                jVar.cancelLongPress();
                                jVar.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                View view = (View) uVar.getParent();
                                uVar.U = (int) ((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - uVar.getX());
                                int y3 = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - uVar.getY());
                                int i16 = uVar.U;
                                Rect rect = uVar.V;
                                uVar.S = -1;
                                int i17 = y3 + jVar.f25382e3;
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
            if (!this.f26433o1 || this.f26399a) {
                if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                    if (motionEvent.getActionMasked() == 2 && (this.f26399a || this.f26406c)) {
                        int i19 = -1;
                        int i20 = -1;
                        for (int i21 = 0; i21 < motionEvent.getPointerCount(); i21++) {
                            if (this.e == motionEvent.getPointerId(i21)) {
                                i19 = i21;
                            }
                            if (this.f26414f == motionEvent.getPointerId(i21)) {
                                i20 = i21;
                            }
                        }
                        if (i19 != -1 && i20 != -1) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(i20) - motionEvent.getX(i19), motionEvent.getY(i20) - motionEvent.getY(i19))) / this.h;
                            this.f26429n = hypot2;
                            if (!this.f26399a && (hypot2 > 1.01f || hypot2 < 0.99f)) {
                                this.f26399a = true;
                                if (hypot2 > 1.0f) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                this.f26438r = z10;
                                e1(z10);
                            }
                            if (this.f26399a) {
                                boolean z13 = this.f26438r;
                                if ((z13 && this.f26429n < 1.0f) || (!z13 && this.f26429n > 1.0f)) {
                                    this.f26431n1 = 0.0f;
                                } else {
                                    if (z13) {
                                        f7 = org.telegram.messenger.f0.x(2.0f, this.f26429n, 1.0f, 1.0f);
                                    } else {
                                        f7 = (1.0f - this.f26429n) / 0.5f;
                                    }
                                    this.f26431n1 = Math.max(0.0f, Math.min(1.0f, f7));
                                }
                                float f12 = this.f26431n1;
                                if (f12 == 1.0f || f12 == 0.0f) {
                                    if (p0(this.f26435p1)) {
                                        h0Var = k1(this.f26435p1);
                                    } else {
                                        h0Var = this.H;
                                    }
                                    if (this.f26431n1 == 1.0f) {
                                        int i22 = this.f26437q1;
                                        int ceil2 = (((int) Math.ceil(this.f26441s / this.f26437q1)) * i22) + ((int) ((this.f26460z1 / (fu0VarArr[0].h.getMeasuredWidth() - ((int) (fu0VarArr[0].h.getMeasuredWidth() / this.f26437q1)))) * (i22 - 1)));
                                        if (ceil2 >= h0Var.h()) {
                                            ceil2 = h0Var.h() - 1;
                                        }
                                        this.f26441s = ceil2;
                                    }
                                    T();
                                    if (this.f26431n1 == 0.0f) {
                                        this.f26438r = !this.f26438r;
                                    }
                                    e1(this.f26438r);
                                    this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                fu0VarArr[0].h.invalidate();
                                fu0 fu0Var = fu0VarArr[0];
                                if (fu0Var.G != null) {
                                    fu0Var.invalidate();
                                }
                            }
                        } else {
                            this.f26402b = false;
                            this.f26406c = false;
                            this.f26399a = false;
                            T();
                            return false;
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.e == motionEvent.getPointerId(0) && this.f26414f == motionEvent.getPointerId(1)) || (this.e == motionEvent.getPointerId(1) && this.f26414f == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.f26399a) {
                        this.f26406c = false;
                        this.f26402b = false;
                        this.f26399a = false;
                        T();
                    }
                } else {
                    if (this.f26402b && !this.f26399a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.f26429n = 1.0f;
                        this.e = motionEvent.getPointerId(0);
                        this.f26414f = motionEvent.getPointerId(1);
                        fu0VarArr[0].h.J0(false);
                        fu0VarArr[0].h.cancelLongPress();
                        fu0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.f26450w = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - fu0VarArr[0].getX());
                        int y10 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - fu0VarArr[0].getY());
                        int i23 = this.f26450w;
                        this.f26441s = -1;
                        int i24 = y10 + fu0VarArr[0].h.f25382e3;
                        if (getY() != 0.0f && this.E == 1) {
                            i24 = 0;
                        }
                        for (int i25 = 0; i25 < fu0VarArr[0].h.getChildCount(); i25++) {
                            View childAt2 = fu0VarArr[0].h.getChildAt(i25);
                            Rect rect2 = this.f26453x;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i23, i24)) {
                                fu0VarArr[0].h.getClass();
                                this.f26441s = RecyclerView.S(childAt2);
                                this.v = childAt2.getTop();
                            }
                        }
                        if (this.D1.T() && this.f26441s == -1) {
                            this.f26441s = (int) (((this.f26428m1[p0(fu0VarArr[0].F) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i23 / fu0VarArr[0].h.getMeasuredWidth(), 0.0f))) + fu0VarArr[0].f24359x.L0());
                            this.v = 0;
                        }
                        this.f26406c = true;
                    }
                    if (motionEvent.getActionMasked() == 0 && ((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - fu0VarArr[0].getY() > 0.0f) {
                        this.f26402b = true;
                    }
                }
                return this.f26399a;
            }
            return true;
        }
        return false;
    }

    public final boolean H0(MessageObject messageObject, View view, int i10, boolean z10) {
        hs0 hs0Var;
        char c10;
        int i11;
        int i12;
        int i13;
        final TL_stories.StoryItem storyItem;
        ut0 ut0Var;
        ai.d9 d9Var;
        if (!this.C1) {
            org.telegram.ui.ActionBar.m2 m2Var = this.f26449v1;
            if (m2Var.getParentActivity() != null && messageObject != null && ((hs0Var = this.W) == null || !hs0Var.f37665w)) {
                AndroidUtilities.hideKeyboard(m2Var.getParentActivity().getCurrentFocus());
                long j3 = this.f26424j1;
                if (z10 && ((w0(getClosestTab()) || getClosestTab() == 8) && !this.C1)) {
                    if (view instanceof org.telegram.ui.Cells.t7) {
                        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                        t7Var.k(t7Var.f21248n, t7Var.f21253r, true);
                    }
                    TL_stories.StoryItem storyItem2 = messageObject.storyItem;
                    if (storyItem2 != null) {
                        HashSet hashSet = new HashSet();
                        ArrayList<Integer> arrayList = storyItem2.albums;
                        if (arrayList != null) {
                            hashSet.addAll(arrayList);
                        }
                        boolean w02 = w0(getClosestTab());
                        b80 I = b80.I(m2Var, view);
                        b80 J = I.J();
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.eu0(I, 25), false);
                        J.k();
                        b80.f(J, getStoriesController().B(j3, true), hashSet, true, new fn0(this, storyItem2, I, 2), new ai.e4(this, hashSet, storyItem2, I, 10));
                        I.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddToAlbum), new ei.m2(I, J, 9), false);
                        I.k();
                        I.c(R.drawable.msg_select, LocaleController.getString(R.string.StoriesAlbumMenuSelect), new ai.c9(this, messageObject, view, i10, 23), false);
                        if (w02) {
                            int h12 = h1(getClosestTab());
                            String w10 = getStoriesController().w(h12, j3);
                            I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new md(this, h12, 7), false);
                            storyItem = storyItem2;
                            I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.StoriesAlbumMenuRemoveFromAlbum), new ai.c9(this, h12, storyItem, w10, 24), false);
                        } else {
                            storyItem = storyItem2;
                            if (getClosestTab() == 8 && (ut0Var = this.f26407c0) != null && (d9Var = ut0Var.f25553s) != null) {
                                if (d9Var.m(storyItem.f18587id)) {
                                    I.c(R.drawable.chats_unpin, LocaleController.getString(R.string.StoriesAlbumMenuUnpin), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r1) {
                                                case 0:
                                                    mv0 mv0Var = this;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mv0Var.getContext(), 0, mv0Var.F1);
                                                    alertDialog$Builder.f18678a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                    alertDialog$Builder.f18678a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new pr0(mv0Var, storyItem));
                                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ia0(22));
                                                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18678a;
                                                    a2Var.show();
                                                    a2Var.h();
                                                    return;
                                                case 1:
                                                    mv0 mv0Var2 = this;
                                                    mv0Var2.getClass();
                                                    mv0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f18587id))), false);
                                                    return;
                                                case 2:
                                                    mv0 mv0Var3 = this;
                                                    mv0Var3.getClass();
                                                    mv0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f18587id))), true);
                                                    return;
                                                default:
                                                    mv0.h(this, storyItem);
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
                                                    mv0 mv0Var = this;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mv0Var.getContext(), 0, mv0Var.F1);
                                                    alertDialog$Builder.f18678a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                    alertDialog$Builder.f18678a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new pr0(mv0Var, storyItem));
                                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ia0(22));
                                                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18678a;
                                                    a2Var.show();
                                                    a2Var.h();
                                                    return;
                                                case 1:
                                                    mv0 mv0Var2 = this;
                                                    mv0Var2.getClass();
                                                    mv0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f18587id))), false);
                                                    return;
                                                case 2:
                                                    mv0 mv0Var3 = this;
                                                    mv0Var3.getClass();
                                                    mv0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f18587id))), true);
                                                    return;
                                                default:
                                                    mv0.h(this, storyItem);
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
                                            mv0 mv0Var = this;
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mv0Var.getContext(), 0, mv0Var.F1);
                                            alertDialog$Builder.f18678a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                            alertDialog$Builder.f18678a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new pr0(mv0Var, storyItem));
                                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ia0(22));
                                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18678a;
                                            a2Var.show();
                                            a2Var.h();
                                            return;
                                        case 1:
                                            mv0 mv0Var2 = this;
                                            mv0Var2.getClass();
                                            mv0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f18587id))), false);
                                            return;
                                        case 2:
                                            mv0 mv0Var3 = this;
                                            mv0Var3.getClass();
                                            mv0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f18587id))), true);
                                            return;
                                        default:
                                            mv0.h(this, storyItem);
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
                                        mv0 mv0Var = this;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mv0Var.getContext(), 0, mv0Var.F1);
                                        alertDialog$Builder.f18678a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                        alertDialog$Builder.f18678a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new pr0(mv0Var, storyItem));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ia0(22));
                                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18678a;
                                        a2Var.show();
                                        a2Var.h();
                                        return;
                                    case 1:
                                        mv0 mv0Var2 = this;
                                        mv0Var2.getClass();
                                        mv0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f18587id))), false);
                                        return;
                                    case 2:
                                        mv0 mv0Var3 = this;
                                        mv0Var3.getClass();
                                        mv0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f18587id))), true);
                                        return;
                                    default:
                                        mv0.h(this, storyItem);
                                        return;
                                }
                            }
                        }, true);
                        I.f22854i = 3;
                        I.f22874u = true;
                        I.v = true;
                        I.L = true;
                        I.M = 3;
                        Point point = AndroidUtilities.displaySize;
                        Point point2 = AndroidUtilities.displaySize;
                        int min = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point2.x, point2.y) * 0.4333f) * 3.0f) / 4.0f));
                        I.N = min;
                        I.O = (min * 4) / 3;
                        I.f22873t = true;
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
                        this.f26401a1++;
                    }
                    if (this.f26401a1 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    this.f26427l0.setVisibility(i11);
                    org.telegram.ui.ActionBar.u0 u0Var = this.f26446u0;
                    if (u0Var != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i13 = 0;
                        } else {
                            i13 = 8;
                        }
                        u0Var.setVisibility(i13);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var2 = this.f26444t0;
                    if (u0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        } else {
                            i12 = 8;
                        }
                        u0Var2.setVisibility(i12);
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
                    this.f26404b1 = false;
                    if (view instanceof org.telegram.ui.Cells.k7) {
                        ((org.telegram.ui.Cells.k7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.u7) {
                        ((org.telegram.ui.Cells.u7) view).b(i10, true);
                    } else if (view instanceof org.telegram.ui.Cells.n7) {
                        ((org.telegram.ui.Cells.n7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) view).e(true, true);
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
        fu0[] fu0VarArr = this.f26425k0;
        fu0 fu0Var = fu0VarArr[0];
        if (fu0Var != null && fu0VarArr[1] != null) {
            float f10 = 0.0f;
            hs0 hs0Var = this.W;
            if (hs0Var != null) {
                if (p0(fu0Var.F) && fu0VarArr[0].F != 9) {
                    c10 = 1;
                } else {
                    c10 = 0;
                }
                if (fu0VarArr[1].getVisibility() == 0) {
                    if (p0(fu0VarArr[1].F) && fu0VarArr[1].F != 9) {
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
                        measuredWidth = fu0VarArr[0].getMeasuredWidth();
                    }
                    hs0Var.setTranslationX(measuredWidth);
                } else {
                    hs0Var.setTranslationX(fu0VarArr[c10 ^ 1].getTranslationX());
                    abs = 1.0f - (Math.abs(hs0Var.getTranslationX()) / hs0Var.getMeasuredWidth());
                }
                float f11 = 0.0f;
                for (int i10 = 0; i10 < fu0VarArr.length; i10++) {
                    if (fu0VarArr[i10].getVisibility() == 0) {
                        ls0 ls0Var = fu0VarArr[i10].h;
                        if (ls0Var.getChildCount() == 0) {
                            childAt = null;
                        } else {
                            childAt = ls0Var.getChildAt(0);
                        }
                        if (childAt == null) {
                            R = -1;
                        } else {
                            R = RecyclerView.R(childAt);
                        }
                        if (R == 0) {
                            f7 = childAt.getY() - ls0Var.getPaddingTop();
                        } else if (ls0Var.getChildCount() == 0) {
                            f7 = 0.0f;
                        } else {
                            f7 = -AndroidUtilities.dp(48.0f);
                        }
                        f11 += Utilities.clamp01(1.0f - (fu0VarArr[i10].getTranslationX() / fu0VarArr[i10].getMeasuredWidth())) * f7;
                    }
                }
                float clamp01 = Utilities.clamp01(1.0f - ((-f11) / AndroidUtilities.dpf2(48.0f)));
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
                hs0Var.setAlpha(clamp01);
                hs0Var.setScaleX(lerp);
                hs0Var.setScaleY(lerp);
                hs0Var.setTranslationY(this.K1 + f11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mv0.J():boolean");
    }

    public final void J0(float f7) {
        int i10;
        int i11;
        fu0[] fu0VarArr = this.f26425k0;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i12 != 0 || fu0VarArr[1].getVisibility() == 0) {
            if (this.f26420h1) {
                fu0 fu0Var = fu0VarArr[0];
                fu0Var.setTranslationX((-f7) * fu0Var.getMeasuredWidth());
                fu0VarArr[1].setTranslationX(fu0VarArr[0].getMeasuredWidth() - (fu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                fu0 fu0Var2 = fu0VarArr[0];
                fu0Var2.setTranslationX(fu0Var2.getMeasuredWidth() * f7);
                fu0VarArr[1].setTranslationX((fu0VarArr[0].getMeasuredWidth() * f7) - fu0VarArr[0].getMeasuredWidth());
            }
            M0(getTabProgress());
            float a02 = a0(f7);
            this.f26434p0 = a02;
            int i13 = 4;
            if (a02 != 0.0f && D() && !q0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            this.f26439r0.setVisibility(i10);
            org.telegram.ui.ActionBar.u0 u0Var = this.f26430n0;
            if (u0Var != null && !D()) {
                if (v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                u0Var.setVisibility(i11);
                this.f26432o0 = 0.0f;
            } else {
                this.f26432o0 = b0(f7);
                t1();
            }
            q1(false);
            if (i12 == 0) {
                fu0 fu0Var3 = fu0VarArr[0];
                fu0VarArr[0] = fu0VarArr[1];
                fu0VarArr[1] = fu0Var3;
                fu0Var3.setVisibility(8);
                if (u0Var != null && this.f26454x0 == 2) {
                    if (v0()) {
                        i13 = 8;
                    }
                    u0Var.setVisibility(i13);
                }
                this.f26454x0 = 0;
                f1();
            }
        }
    }

    public final void K() {
        ns nsVar = this.P0;
        if (nsVar != null) {
            hs0 hs0Var = this.W;
            float f7 = 0.0f;
            if (hs0Var != null) {
                f7 = 0.0f + (hs0Var.getVisibilityFactor() * AndroidUtilities.dp(38.0f) * (1.0f - Math.abs(hs0Var.getTranslationX() / hs0Var.getMeasuredWidth())));
            }
            nsVar.setTranslationY(this.K1 + f7);
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
        this.f26401a1 = 0;
        D0(sparseArrayArr[0]);
        as0 as0Var = this.U;
        if (as0Var != null) {
            as0Var.h();
            as0Var.j();
        }
        b1(false);
        r1(z10);
        wu0 wu0Var = this.R;
        if (wu0Var != null) {
            wu0Var.f30063w.clear();
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
        hv0 hv0Var = this.f26412e0.f25554w;
        if (hv0Var != null) {
            if (z10 && getClosestTab() == 9) {
                z13 = true;
            } else {
                z13 = false;
            }
            hv0Var.b(z13);
        }
        hv0 hv0Var2 = this.f26407c0.f25554w;
        if (hv0Var2 != null) {
            if (z10 && getClosestTab() == 8) {
                z12 = true;
            } else {
                z12 = false;
            }
            hv0Var2.b(z12);
        }
        for (lv0 lv0Var : this.Y1.values()) {
            kv0 kv0Var = lv0Var.f26128c;
            if (kv0Var.f25553s != null) {
                hv0 hv0Var3 = kv0Var.f25554w;
                if (z10 && getClosestTab() == lv0Var.f26126a) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                hv0Var3.b(z11);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.f26430n0;
        if (u0Var != null) {
            zs0 zs0Var = this.J0;
            if (zs0Var != null && zs0Var.a() && getSelectedTab() == 11) {
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
        return this instanceof c40;
    }

    public final boolean O(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x10 = (-view.getX()) - getX();
        fu0[] fu0VarArr = this.f26425k0;
        motionEvent.offsetLocation(x10 - fu0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - fu0VarArr[0].getY()) - fu0VarArr[0].h.getFastScroll().getY());
        return fu0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public final void O0(org.telegram.ui.ActionBar.m2 m2Var, long j3, int i10) {
        new org.telegram.ui.n71(m2Var, j3, this.f26428m1[1], new uc(this, j3, i10)).show();
    }

    public void P(Canvas canvas, float f7, Rect rect, Paint paint) {
        canvas.drawRect(rect, paint);
    }

    public final void P0(org.telegram.ui.ActionBar.m2 m2Var, long j3, int i10) {
        e5.v0(m2Var, LocaleController.getString(R.string.Delete), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesAlbumMenuDeleteAlbumAsk, getStoriesController().w(i10, j3))), LocaleController.getString(R.string.Delete), true, new ai.a8(this, j3, i10, 7));
    }

    public final void Q(Canvas canvas, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            fu0[] fu0VarArr = this.f26425k0;
            if (i10 < fu0VarArr.length) {
                fu0 fu0Var = fu0VarArr[i10];
                if (fu0Var != null && fu0Var.getVisibility() == 0) {
                    for (int i11 = 0; i11 < fu0VarArr[i10].h.getChildCount(); i11++) {
                        View childAt = fu0VarArr[i10].h.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + fu0VarArr[i10].h.f25382e3) {
                            int save = canvas.save();
                            canvas.translate(childAt.getX() + fu0VarArr[i10].getX(), childAt.getY() + fu0VarArr[i10].h.getY() + fu0VarArr[i10].getY() + getY());
                            childAt.draw(canvas);
                            if (arrayList != null && (childAt instanceof aw0)) {
                                arrayList.add((aw0) childAt);
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
        org.telegram.ui.ActionBar.d6 resourceProvider = m2Var.getResourceProvider();
        j2.d dVar = new j2.d(this, j3, i10, 6);
        Pattern pattern = e5.f23842a;
        e5.R(context, m2Var, LocaleController.getString(R.string.StoriesAlbumRename), LocaleController.getString(R.string.StoriesAlbumRenameHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), w10, 12, LocaleController.getString(R.string.Rename), resourceProvider, dVar);
    }

    public final boolean R(int i10) {
        bv0[] bv0VarArr = this.f26447u1.f24055n;
        if (bv0VarArr == null) {
            return false;
        }
        bv0[] bv0VarArr2 = this.f26445t1;
        if (i10 == 0) {
            bv0 bv0Var = bv0VarArr2[i10];
            if (!bv0Var.h) {
                int[] iArr = bv0Var.f23018f;
                int[] iArr2 = bv0VarArr[i10].f23018f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = bv0VarArr2[i10].f23018f;
            int[] iArr4 = bv0VarArr[i10].f23018f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        bv0VarArr2[i10].f23015a.addAll(bv0VarArr[i10].f23015a);
        bv0VarArr2[i10].f23017c.addAll(bv0VarArr[i10].f23017c);
        for (Map.Entry entry : bv0VarArr[i10].d.entrySet()) {
            bv0VarArr2[i10].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i11 = 0; i11 < 2; i11++) {
            bv0VarArr2[i10].f23016b[i11] = bv0VarArr[i10].f23016b[i11].clone();
            bv0 bv0Var2 = bv0VarArr2[i10];
            int[] iArr5 = bv0Var2.f23021j;
            bv0 bv0Var3 = bv0VarArr[i10];
            iArr5[i11] = bv0Var3.f23021j[i11];
            bv0Var2.f23020i[i11] = bv0Var3.f23020i[i11];
        }
        bv0VarArr2[i10].e.addAll(bv0VarArr[i10].e);
        return !bv0VarArr[i10].f23015a.isEmpty();
    }

    public final void R0(String str) {
        boolean shouldShowUrlInAlert = AndroidUtilities.shouldShowUrlInAlert(str);
        org.telegram.ui.ActionBar.m2 m2Var = this.f26449v1;
        if (shouldShowUrlInAlert) {
            e5.q0(m2Var, str, true, true);
        } else {
            nf.f.s(m2Var.getParentActivity(), str);
        }
    }

    public final void S(int i10, zl0 zl0Var, boolean z10) {
        ArrayList arrayList = this.f26445t1[i10].e;
        int L0 = ((s4.c0) zl0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            ku0 ku0Var = null;
            if (arrayList != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (L0 <= ((ku0) arrayList.get(i11)).f25827b) {
                        ku0Var = (ku0) arrayList.get(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                if (ku0Var == null) {
                    ku0Var = (ku0) hg.c.g(1, arrayList);
                }
            }
            if (ku0Var != null) {
                y0(i10, ku0Var.d, ku0Var.f25827b + 1, z10);
            }
        }
    }

    public int S0() {
        return -1;
    }

    public final void T() {
        fu0[] fu0VarArr;
        fu0 fu0Var;
        boolean z10;
        int i10;
        s4.h0 adapter;
        if (this.f26433o1) {
            int i11 = 0;
            while (true) {
                fu0VarArr = this.f26425k0;
                if (i11 < fu0VarArr.length) {
                    fu0Var = fu0VarArr[i11];
                    if (fu0Var.F == this.f26435p1) {
                        break;
                    }
                    i11++;
                } else {
                    fu0Var = null;
                    break;
                }
            }
            if (fu0Var != null) {
                boolean p02 = p0(fu0Var.F);
                float f7 = this.f26431n1;
                bv0[] bv0VarArr = this.f26445t1;
                float f10 = 1.0f;
                if (f7 == 1.0f) {
                    this.f26433o1 = false;
                    int i12 = this.f26437q1;
                    int[] iArr = this.f26428m1;
                    iArr[p02 ? 1 : 0] = i12;
                    if (!p02) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (c0(fu0Var.F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(this.f26437q1);
                    }
                    for (int i13 = 0; i13 < fu0VarArr.length; i13++) {
                        fu0 fu0Var2 = fu0VarArr[i13];
                        if (fu0Var2 != null && fu0Var2.h != null && (((i10 = fu0Var2.F) == 0 || p0(i10)) && (adapter = fu0VarArr[i13].h.getAdapter()) != null)) {
                            int h = adapter.h();
                            if (i13 == 0) {
                                bv0VarArr[0].g(false);
                            }
                            fu0VarArr[i13].f24356r.setVisibility(8);
                            fu0VarArr[i13].f24359x.y1(iArr[p02 ? 1 : 0]);
                            fu0VarArr[i13].h.a0();
                            fu0VarArr[i13].h.invalidate();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(fu0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                    }
                    if (this.f26441s >= 0) {
                        for (int i14 = 0; i14 < fu0VarArr.length; i14++) {
                            fu0 fu0Var3 = fu0VarArr[i14];
                            if (fu0Var3.F == this.f26435p1) {
                                View m10 = fu0Var3.f24357s.m(this.f26441s);
                                if (m10 != null) {
                                    this.v = m10.getTop();
                                }
                                fu0 fu0Var4 = fu0VarArr[i14];
                                fu0Var4.f24359x.h1(this.f26441s, (-fu0Var4.h.getPaddingTop()) + this.v);
                            }
                        }
                        return;
                    }
                    X0();
                } else if (f7 == 0.0f) {
                    this.f26433o1 = false;
                    if (this.f26435p1 == 0) {
                        bv0VarArr[0].g(false);
                    }
                    fu0Var.f24356r.setVisibility(8);
                    fu0Var.h.invalidate();
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
                    ofFloat.addUpdateListener(new bt0(this, fu0Var, 0));
                    ofFloat.addListener(new org.telegram.ui.bj(this, z10, p02 ? 1 : 0, fu0Var));
                    ofFloat.setInterpolator(tr.f28636f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                }
            }
        }
    }

    public final void T0(ArrayList arrayList, boolean z10) {
        boolean z11;
        boolean z12;
        ut0 ut0Var = this.f26407c0;
        if (ut0Var != null && ut0Var.f25553s != null) {
            org.telegram.ui.ActionBar.m2 m2Var = this.f26449v1;
            if (z10 && arrayList.size() > m2Var.getMessagesController().storiesPinnedToTopCountMax) {
                yc.a0(m2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", m2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
                return;
            }
            ai.d9 d9Var = ut0Var.f25553s;
            int i10 = d9Var.f722c;
            ArrayList arrayList2 = d9Var.f724g;
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
                    d9Var.d(true);
                    TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                    tL_togglePinnedToTop.f18600id.addAll(arrayList2);
                    tL_togglePinnedToTop.peer = MessagesController.getInstance(i10).getInputPeer(d9Var.d);
                    ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new ai.u7(2));
                }
                z13 = z11;
            }
            if (z13) {
                yc.a0(m2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", m2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
            } else if (z10) {
                yc.a0(m2Var).M(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinned", arrayList.size(), new Object[0])), LocaleController.formatPluralString("StoriesPinnedText", arrayList.size(), new Object[0]), R.raw.ic_pin).j();
            } else {
                yc.a0(m2Var).Q(R.raw.ic_unpin, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesUnpinned", arrayList.size(), new Object[0]))).j();
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
        fu0 fu0Var;
        as0 as0Var;
        int i11;
        int i12;
        int closestTab = getClosestTab();
        ct0 ct0Var = this.I0;
        SparseIntArray sparseIntArray = ct0Var.O;
        int i13 = ct0Var.f22426n;
        int i14 = -1;
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i15 = sparseIntArray.get(i13 + i10, -1);
        hs0 hs0Var = this.W;
        if (hs0Var != null) {
            if (!w0(closestTab) && closestTab != 8) {
                if (w0(i15) || i15 == 8) {
                    i14 = hs0Var.getCurrentAlbumId();
                }
            } else {
                x81 x81Var = hs0Var.f37662n;
                SparseIntArray sparseIntArray2 = x81Var.f30182b0;
                int i16 = x81Var.F;
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
                i15 = i1(i14).f26126a;
            }
        }
        if (i15 >= 0) {
            org.telegram.ui.ActionBar.u0 u0Var = this.f26430n0;
            if (u0Var != null && !D()) {
                if (v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                u0Var.setVisibility(i11);
                this.f26432o0 = 0.0f;
            } else {
                this.f26432o0 = b0(0.0f);
                s1(0.0f);
            }
            if ((!this.V0 || getSelectedTab() != 11) && (!C() || !this.C1 || (getClosestTab() != 8 && !w0(getClosestTab())))) {
                fu0[] fu0VarArr = this.f26425k0;
                fu0 fu0Var2 = fu0VarArr[0];
                if (fu0Var2 != null && fu0Var2.F == 13 && (as0Var = this.U) != null) {
                    bi.a aVar = as0Var.f3610n;
                    if (!z10) {
                    }
                }
                fu0 fu0Var3 = fu0VarArr[0];
                cs0 cs0Var = this.V;
                if (fu0Var3 != null && fu0Var3.F == 14 && cs0Var != null) {
                    xh.x1 x1Var = cs0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.C1 || (fu0Var = fu0VarArr[0]) == null || fu0Var.F != 13) && ((cs0Var == null || !cs0Var.g()) && (hs0Var == null || !hs0Var.f37665w))) {
                    q1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    k0();
                    this.f26458y1 = false;
                    this.f26455x1 = true;
                    N0(true);
                    this.f26460z1 = (int) motionEvent.getX();
                    this.G.setEnabled(false);
                    ct0Var.setEnabled(false);
                    fu0 fu0Var4 = fu0VarArr[1];
                    fu0Var4.F = i15;
                    fu0Var4.setVisibility(0);
                    this.f26420h1 = z10;
                    m1(true);
                    if (z10) {
                        fu0VarArr[1].setTranslationX(fu0VarArr[0].getMeasuredWidth());
                    } else {
                        fu0VarArr[1].setTranslationX(-fu0VarArr[0].getMeasuredWidth());
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
        as0 as0Var;
        if (!r0()) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        if (z10 && (as0Var = this.U) != null) {
            return as0Var.getBotPreviewsSubtitle();
        }
        ut0 ut0Var = this.f26407c0;
        if (ut0Var != null && ut0Var.f25553s != null) {
            i10 = 0;
            i11 = 0;
            for (int i12 = 0; i12 < ut0Var.f25553s.f725i.size(); i12++) {
                MessageObject messageObject = (MessageObject) ut0Var.f25553s.f725i.get(i12);
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

    public final fu0 W(int i10) {
        int i11 = 0;
        while (true) {
            fu0[] fu0VarArr = this.f26425k0;
            if (i11 < fu0VarArr.length) {
                fu0 fu0Var = fu0VarArr[i11];
                if (fu0Var != null && fu0Var.F == i10) {
                    return fu0Var;
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    public final void W0(s4.h0 h0Var) {
        if (h0Var instanceof gv0) {
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
            tu0 tu0Var = this.N;
            if (h0Var == tu0Var) {
                tu0Var.f28661r = null;
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
        return Utilities.clamp(i14, 9, (this.f26426k1 && i10 == 1) ? 2 : 2);
    }

    public final void X0() {
        int i10;
        int i11 = 0;
        while (true) {
            fu0[] fu0VarArr = this.f26425k0;
            if (i11 < fu0VarArr.length) {
                ls0 ls0Var = fu0VarArr[i11].h;
                if (ls0Var != null) {
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < ls0Var.getChildCount(); i14++) {
                        View childAt = ls0Var.getChildAt(i14);
                        if (childAt instanceof org.telegram.ui.Cells.t7) {
                            org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                            int messageId = t7Var.getMessageId();
                            i13 = t7Var.getTop();
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
                        int i15 = fu0VarArr[i11].F;
                        int i16 = -1;
                        if (p0(i15)) {
                            jv0 k12 = k1(i15);
                            if (k12 != null && k12.f25553s != null) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= k12.f25553s.f725i.size()) {
                                        break;
                                    } else if (i12 == ((MessageObject) k12.f25553s.f725i.get(i17)).getId()) {
                                        i16 = i17;
                                        break;
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                            i10 = i16;
                        } else if (i15 >= 0) {
                            bv0[] bv0VarArr = this.f26445t1;
                            if (i15 < bv0VarArr.length) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= bv0VarArr[i15].f23015a.size()) {
                                        break;
                                    } else if (i12 == ((MessageObject) bv0VarArr[i15].f23015a.get(i18)).getId()) {
                                        i16 = i18;
                                        break;
                                    } else {
                                        i18++;
                                    }
                                }
                                i10 = bv0VarArr[i15].f23024m + i16;
                            }
                        }
                        if (i16 >= 0) {
                            ((s4.c0) ls0Var.getLayoutManager()).h1(i10, (-fu0VarArr[i11].h.getPaddingTop()) + i13);
                            if (this.f26433o1) {
                                fu0 fu0Var = fu0VarArr[i11];
                                fu0Var.f24357s.h1(i10, (-fu0Var.h.getPaddingTop()) + i13);
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
        ct0 ct0Var;
        if (!this.L1 && (ct0Var = this.I0) != null) {
            ct0Var.h(null, i10, ct0Var.P.get(i10));
        }
    }

    public final int Z(int i10) {
        float f7;
        int i11;
        int dp = AndroidUtilities.dp(54.0f) + this.f26405b2;
        hs0 hs0Var = this.W;
        if (hs0Var != null && (w0(i10) || i10 == 8)) {
            f7 = hs0Var.getVisibilityFactor() * AndroidUtilities.dp(40.0f);
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
        ct0 ct0Var = this.I0;
        if (ct0Var != null) {
            if (w0(i10)) {
                i11 = 8;
            } else {
                i11 = i10;
            }
            ct0Var.j(f7, i11);
        }
        hs0 hs0Var = this.W;
        if (hs0Var != null) {
            x81 x81Var = hs0Var.f37662n;
            if (w0(i10)) {
                x81Var.f(f7, h1(i10));
            } else if (i10 == 8) {
                x81Var.f(f7, 0);
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
        fu0[] fu0VarArr = this.f26425k0;
        fu0 fu0Var = fu0VarArr[1];
        cs0 cs0Var = this.V;
        if (fu0Var != null && ((i12 = fu0Var.F) == 0 || (((i12 == 8 || w0(i12)) && TextUtils.isEmpty(getStoriesHashtag())) || (i13 = fu0VarArr[1].F) == 9 || i13 == 11 || i13 == 13 || (i13 == 14 && cs0Var != null)))) {
            f10 = 0.0f + f7;
        }
        fu0 fu0Var2 = fu0VarArr[0];
        if (fu0Var2 != null && ((i10 = fu0Var2.F) == 0 || (((i10 == 8 || w0(i10)) && TextUtils.isEmpty(getStoriesHashtag())) || (i11 = fu0VarArr[0].F) == 9 || i11 == 11 || i11 == 13 || (i11 == 14 && cs0Var != null)))) {
            return (1.0f - f7) + f10;
        }
        return f10;
    }

    public final void a1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i10 = 0;
        while (true) {
            fu0[] fu0VarArr = this.f26425k0;
            if (i10 < fu0VarArr.length) {
                fu0 fu0Var = fu0VarArr[i10];
                if (fu0Var.F != 7 || fu0Var.h.getAdapter() == null || fu0VarArr[i10].h.getAdapter().h() == 0 || this.f26449v1.getMessagesController().getStoriesController().f1200j.size() <= 0) {
                    i10++;
                } else {
                    return;
                }
            } else {
                if (this.F == 0) {
                    wt0 wt0Var = this.f26400a0;
                    wt0Var.d = chatFull;
                    wt0Var.e = arrayList;
                }
                v1(true);
                for (int i11 = 0; i11 < fu0VarArr.length; i11++) {
                    fu0 fu0Var2 = fu0VarArr[i11];
                    if (fu0Var2.F == 7 && fu0Var2.h.getAdapter() != null) {
                        AndroidUtilities.notifyDataSetChanged(fu0VarArr[i11].h);
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
        fu0[] fu0VarArr = this.f26425k0;
        fu0 fu0Var = fu0VarArr[1];
        if (fu0Var != null && s0(fu0Var.F) && fu0VarArr[1].F != 11) {
            f10 = 0.0f + f7;
        }
        fu0 fu0Var2 = fu0VarArr[0];
        if (fu0Var2 != null && s0(fu0Var2.F) && fu0VarArr[0].F != 11) {
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
            ia iaVar = this.B0;
            if (z10) {
                iaVar.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.N1 = animatorSet2;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(iaVar, View.ALPHA, f7));
            this.N1.setDuration(180L);
            this.N1.addListener(new da(19, this, z10));
            this.N1.start();
            if (z10) {
                u1();
            }
        }
    }

    public final int c0(int i10) {
        jv0 k12;
        ai.d9 d9Var;
        if (p0(i10) && (k12 = k1(i10)) != null && (d9Var = k12.f25553s) != null) {
            return d9Var.g();
        }
        return 0;
    }

    public final void c1(int r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mv0.c1(int, boolean):void");
    }

    public final void d1(int i10) {
        int h12 = h1(getClosestTab());
        hs0 hs0Var = this.W;
        if (h12 != i10) {
            if (hs0Var != null) {
                hs0Var.f37662n.d(i10, hs0Var.f37664s.i(i10));
                return;
            }
            return;
        }
        hs0Var.setReorderingAlbums(true);
        lv0 i12 = i1(i10);
        fu0 W = W(i12.f26126a);
        if (W == null) {
            return;
        }
        ls0 ls0Var = W.h;
        for (int i11 = 0; i11 < ls0Var.getChildCount(); i11++) {
            View childAt = ls0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.t7) {
                ((org.telegram.ui.Cells.t7) childAt).l(true, true);
            }
        }
        kv0 kv0Var = i12.f26128c;
        if (kv0Var != null && !kv0Var.f25555x) {
            kv0Var.f25555x = true;
        }
        q1(true);
    }

    @Override
    public final void didReceivedNotification(int r42, int r43, java.lang.Object... r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mv0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ct0 ct0Var = this.I0;
        if (ct0Var != null) {
            canvas.save();
            canvas.translate(ct0Var.getX(), ct0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        ys0 ys0Var = this.R0;
        if (ys0Var != null) {
            int i10 = ys0Var.T;
            if ((i10 == 3 || i10 == 1) && this.P0 == null) {
                canvas.save();
                canvas.translate(ys0Var.getX(), ys0Var.getY());
                ys0Var.setDrawOverlay(true);
                ys0Var.draw(canvas);
                ys0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int i10;
        if (view == this.R0 && this.P0 == null) {
            canvas.save();
            fu0[] fu0VarArr = this.f26425k0;
            float top = fu0VarArr[0].getTop();
            hs0 hs0Var = this.W;
            if (hs0Var != null && ((i10 = fu0VarArr[0].F) == 8 || w0(i10))) {
                top -= hs0Var.getVisualHeight();
            }
            canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + AndroidUtilities.dp(12.0f));
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void e(org.telegram.ui.Cells.s2 s2Var) {
        int i10;
        org.telegram.ui.ActionBar.m2 m2Var = this.f26449v1;
        if (m2Var != null && m2Var.getMessagesController().getStoriesController().I(s2Var.getDialogId())) {
            m2Var.getOrCreateStoryViewer().getClass();
            ai.jc orCreateStoryViewer = m2Var.getOrCreateStoryViewer();
            Context context = m2Var.getContext();
            long dialogId = s2Var.getDialogId();
            ai.u9 a2 = ai.u9.a((zl0) s2Var.getParent());
            if ((m2Var instanceof ProfileActivity) && ((ProfileActivity) m2Var).f31725s1) {
                i10 = AndroidUtilities.dp(68.0f);
            } else {
                i10 = 0;
            }
            a2.f1592s += i10;
            orCreateStoryViewer.D(context, dialogId, a2);
        }
    }

    public final void e1(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mv0.e1(boolean):void");
    }

    public final float f0(int i10, boolean z10) {
        float width = getWidth();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            fu0[] fu0VarArr = this.f26425k0;
            if (i11 >= fu0VarArr.length) {
                break;
            }
            fu0 fu0Var = fu0VarArr[i11];
            if (fu0Var != null) {
                int i13 = fu0Var.F;
                if ((z10 && i10 == 8 && w0(i13)) || i13 == i10) {
                    i12++;
                    width = fu0VarArr[i11].getTranslationX();
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
            fu0[] fu0VarArr = this.f26425k0;
            if (i10 < fu0VarArr.length) {
                int childCount = fu0VarArr[i10].h.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = fu0VarArr[i10].h.getChildAt(i11);
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
            fu0[] fu0VarArr = this.f26425k0;
            if (i11 < fu0VarArr.length) {
                fu0 fu0Var = fu0VarArr[i11];
                if (fu0Var != null) {
                    int i12 = fu0Var.F;
                    if ((z10 && i10 == 8 && w0(i12)) || i12 == i10) {
                        f7 = (1.0f - Math.abs(fu0VarArr[i11].getTranslationX() / getWidth())) + f7;
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
        fu0 fu0Var;
        fu0 fu0Var2;
        int measuredWidth2;
        fu0 fu0Var3;
        fu0 fu0Var4;
        boolean z11;
        VelocityTracker velocityTracker = this.B1;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.S0);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f7 = this.B1.getXVelocity();
                f10 = this.B1.getYVelocity();
                if (!this.f26455x1 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
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
            if (this.f26455x1) {
                fu0[] fu0VarArr = this.f26425k0;
                float x10 = fu0VarArr[0].getX();
                this.f26416f1 = new AnimatorSet();
                if (Math.abs(x10) < fu0VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f26422i1 = z10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new v70(this, 19));
                boolean z12 = this.f26422i1;
                Property property = View.TRANSLATION_X;
                if (z12) {
                    measuredWidth = Math.abs(x10);
                    if (this.f26420h1) {
                        this.f26416f1.playTogether(ObjectAnimator.ofFloat(fu0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(fu0VarArr[1], property, fu0Var4.getMeasuredWidth()), ofFloat);
                    } else {
                        this.f26416f1.playTogether(ObjectAnimator.ofFloat(fu0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(fu0VarArr[1], property, -fu0Var3.getMeasuredWidth()), ofFloat);
                    }
                } else {
                    measuredWidth = fu0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                    if (this.f26420h1) {
                        this.f26416f1.playTogether(ObjectAnimator.ofFloat(fu0VarArr[0], property, -fu0Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(fu0VarArr[1], property, 0.0f), ofFloat);
                    } else {
                        this.f26416f1.playTogether(ObjectAnimator.ofFloat(fu0VarArr[0], property, fu0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(fu0VarArr[1], property, 0.0f), ofFloat);
                    }
                }
                this.f26416f1.setInterpolator(f26398e2);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs = Math.abs(f7);
                if (abs > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                this.f26416f1.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                this.f26416f1.addListener(new ft0(this, 1));
                this.f26416f1.start();
                this.f26418g1 = true;
                this.f26455x1 = false;
                L0();
            } else {
                this.f26458y1 = false;
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
        fu0 fu0Var;
        fu0 fu0Var2;
        boolean z10;
        boolean z11;
        ai.d9 d9Var;
        ai.d9 d9Var2;
        float f7 = 1.0f;
        fu0[] fu0VarArr = this.f26425k0;
        if (fu0VarArr == null || (fu0Var = fu0VarArr[0]) == null || (fu0Var2 = fu0VarArr[1]) == null || fu0Var.f24358w == null || fu0Var2.f24358w == null) {
            return 1.0f;
        }
        int i10 = fu0Var.F;
        int i11 = fu0Var2.F;
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
        float visibilityFactor = 1.0f - fu0VarArr[0].f24358w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - fu0VarArr[1].f24358w.getVisibilityFactor();
        jv0 k12 = k1(fu0VarArr[0].F);
        if (i10 == 8 || (k12 != null && (d9Var2 = k12.f25553s) != null && d9Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        jv0 k13 = k1(i11);
        if (i11 != 8 && (k13 == null || (d9Var = k13.f25553s) == null || d9Var.g() <= 0)) {
            f7 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f7;
        }
        if (!z11) {
            f7 = visibilityFactor;
        }
        return AndroidUtilities.lerp(visibilityFactor, f7, Math.abs(fu0VarArr[0].getTranslationX() / fu0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        fu0[] fu0VarArr = this.f26425k0;
        fu0 fu0Var = fu0VarArr[1];
        if (fu0Var != null && fu0Var.getVisibility() == 0) {
            if (this.f26418g1 && !this.f26422i1) {
                return fu0VarArr[1].F;
            }
            if (Math.abs(fu0VarArr[1].getTranslationX()) < fu0VarArr[1].getMeasuredWidth() / 2.0f) {
                return fu0VarArr[1].F;
            }
        }
        return getSelectedTab();
    }

    public zl0 getCurrentListView() {
        st0 st0Var;
        fu0 fu0Var = this.f26425k0[0];
        int i10 = fu0Var.F;
        if (i10 == 13) {
            return this.U.getCurrentListView();
        }
        if (i10 == 14) {
            return this.V.getCurrentListView();
        }
        if (i10 == 12 && (st0Var = this.T) != null) {
            return st0Var.f40301a.f39788x0;
        }
        return fu0Var.h;
    }

    public int getInitialTab() {
        return 0;
    }

    public int getPhotosVideosTypeFilter() {
        return this.f26445t1[0].f23028q;
    }

    public TextView getSaveItem() {
        return this.f26436q0;
    }

    public org.telegram.ui.ActionBar.u0 getSearchItem() {
        return this.f26430n0;
    }

    public oj0 getSearchOptionsItem() {
        return this.f26442s0;
    }

    public int getSelectedTab() {
        int currentTabId = this.I0.getCurrentTabId();
        hs0 hs0Var = this.W;
        if (hs0Var != null && currentTabId == 8) {
            int currentAlbumId = hs0Var.getCurrentAlbumId();
            if (currentAlbumId == 0) {
                return 8;
            }
            if (currentAlbumId > 0) {
                return i1(currentAlbumId).f26126a;
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
            fu0[] fu0VarArr = this.f26425k0;
            if (i10 < fu0VarArr.length) {
                fu0 fu0Var = fu0VarArr[i10];
                if (fu0Var != null) {
                    f7 = ((1.0f - Math.abs(fu0Var.getTranslationX() / getWidth())) * fu0Var.F) + f7;
                }
                i10++;
            } else {
                return f7;
            }
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.j6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.j6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.A0, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f19478z6));
        org.telegram.ui.ActionBar.u0 u0Var = this.f26427l0;
        oj0 iconView = u0Var.getIconView();
        int i10 = org.telegram.ui.ActionBar.h6.f19461y8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(iconView, 8, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.h6.f19480z8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var, 32, null, null, null, null, i11));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f26446u0;
        if (u0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var2.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var2, 32, null, null, null, null, i11));
        }
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f26444t0;
        if (u0Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var3.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var3, 32, null, null, null, null, i11));
        }
        Drawable[] drawableArr = {this.D0};
        ImageView imageView = this.C0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 8, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 32, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.f19076d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.B0, 1, null, null, null, null, i12));
        ct0 ct0Var = this.I0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(ct0Var, 1, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.h6.wc;
        org.telegram.ui.Cells.w0 w0Var = this.K0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f19210kd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ct0Var, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Gh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ct0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.Fh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ct0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.Eh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ct0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.Hh));
        ys0 ys0Var = this.R0;
        if (ys0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(ys0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19408v7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(ys0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19426w7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(ys0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19390u7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(ys0Var, 33554436, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19372t7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(ys0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19443x7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(ys0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19460y7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(ys0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.A7));
        }
        final int i14 = 0;
        while (true) {
            fu0[] fu0VarArr = this.f26425k0;
            if (i14 < fu0VarArr.length) {
                org.telegram.ui.ActionBar.i6 i6Var = new org.telegram.ui.ActionBar.i6() {
                    @Override
                    public final void b() {
                        fu0[] fu0VarArr2 = mv0.this.f26425k0;
                        int i15 = i14;
                        ls0 ls0Var = fu0VarArr2[i15].h;
                        if (ls0Var != null) {
                            int childCount = ls0Var.getChildCount();
                            for (int i16 = 0; i16 < childCount; i16++) {
                                View childAt = fu0VarArr2[i15].h.getChildAt(i16);
                                if (childAt instanceof org.telegram.ui.Cells.u7) {
                                    org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) childAt;
                                    for (int i17 = 0; i17 < 6; i17++) {
                                        u7Var.f21678a[i17].e.invalidate();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.i6) {
                                    ((org.telegram.ui.Cells.i6) childAt).u(0);
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
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f19197k0, null, null, org.telegram.ui.ActionBar.h6.f19077d7));
                us0 us0Var = fu0VarArr[i14].v;
                int i15 = org.telegram.ui.ActionBar.h6.f19076d6;
                arrayList.add(new org.telegram.ui.ActionBar.j6(us0Var, 0, null, null, null, null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f19354s8));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f19165i6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].f24358w, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f19059c7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 524288, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.h6.e7));
                int i16 = org.telegram.ui.ActionBar.h6.f19147h6;
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19400uh));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19240m6));
                int i17 = org.telegram.ui.ActionBar.h6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
                int i18 = org.telegram.ui.ActionBar.h6.f19459y6;
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusColor"}, null, null, -1, i6Var, i18));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusOnlineColor"}, null, null, -1, i6Var, org.telegram.ui.ActionBar.h6.f19260n6));
                Drawable[] drawableArr2 = org.telegram.ui.ActionBar.h6.f19327r0;
                int i19 = org.telegram.ui.ActionBar.h6.J7;
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.za.class}, null, drawableArr2, null, i19));
                TextPaint[] textPaintArr = org.telegram.ui.ActionBar.h6.B0;
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.i6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.h6.D0}, null, -1, null, org.telegram.ui.ActionBar.h6.X8));
                TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.h6.C0;
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.i6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.h6.E0}, null, -1, null, org.telegram.ui.ActionBar.h6.Z8));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.i6.class}, null, drawableArr2, null, i19));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.O7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.P7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.Q7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.R7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.S7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.T7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, org.telegram.ui.ActionBar.h6.U7));
                int i20 = org.telegram.ui.ActionBar.h6.f19478z6;
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 4, new Class[]{zt0.class}, new String[]{"emptyTextView"}, null, null, -1, null, i20));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.A6));
                int i21 = org.telegram.ui.ActionBar.h6.Ih;
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 2048, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"progressView"}, null, null, -1, null, i21));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"statusImageView"}, null, null, -1, null, i21));
                int i22 = org.telegram.ui.ActionBar.h6.f19166i7;
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                int i23 = org.telegram.ui.ActionBar.h6.f19204k7;
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.zi));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Bi));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.j7.class}, org.telegram.ui.ActionBar.h6.f19109f3, null, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.j7.class}, org.telegram.ui.ActionBar.h6.f19127g3, null, null, i20));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.n7.class}, null, null, null, org.telegram.ui.ActionBar.h6.J6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.n7.class}, org.telegram.ui.ActionBar.h6.m0, null, null, org.telegram.ui.ActionBar.h6.K6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Kh));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 32, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Jh));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.o7.class}, null, null, null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 524288, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"textView"}, null, null, -1, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"textView"}, null, null, -1, null, i17));
                int i24 = org.telegram.ui.ActionBar.h6.Lh;
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.u7.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.u7.class}, null, null, i6Var, i22));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.u7.class}, null, null, i6Var, i23));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, i6Var, i22));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, i6Var, i23));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].h, 0, null, null, new Drawable[]{this.f26457y0}, null, org.telegram.ui.ActionBar.h6.f19040b7));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].f24358w.d, 4, null, null, null, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.j6(fu0VarArr[i14].f24358w.e, 4, null, null, null, null, i18));
                i14++;
            } else {
                return arrayList;
            }
        }
    }

    public final int h0(int i10) {
        org.telegram.ui.ActionBar.d6 d6Var = this.F1;
        if (d6Var != null) {
            return d6Var.G0(i10);
        }
        return org.telegram.ui.ActionBar.h6.w0(null, i10, false);
    }

    public final int h1(int i10) {
        lv0 j12 = j1(i10);
        if (j12 == null) {
            return -1;
        }
        return j12.f26127b;
    }

    public final boolean i0() {
        if (this.f26449v1.getConnectionsManager().getConnectionState() == 3) {
            return true;
        }
        return false;
    }

    public final lv0 i1(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.Y1;
        lv0 lv0Var = (lv0) hashMap.get(valueOf);
        if (lv0Var == null) {
            lv0 lv0Var2 = new lv0(this, getContext(), i10);
            hashMap.put(Integer.valueOf(i10), lv0Var2);
            this.Z1.put(Integer.valueOf(lv0Var2.f26126a), Integer.valueOf(i10));
            return lv0Var2;
        }
        return lv0Var;
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

    public final lv0 j1(int i10) {
        Integer num = (Integer) this.Z1.get(Integer.valueOf(i10));
        if (num == null) {
            return null;
        }
        return (lv0) this.Y1.get(num);
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
        this.L0.setInterpolator(tr.f28637g);
        this.L0.addListener(new ft0(this, 0));
        this.L0.start();
    }

    public final jv0 k1(int i10) {
        lv0 j12;
        if (i10 == 8) {
            return this.f26407c0;
        }
        if (i10 == 9) {
            return this.f26412e0;
        }
        if (w0(i10) && (j12 = j1(i10)) != null) {
            return j12.f26128c;
        }
        return null;
    }

    public boolean l0() {
        return false;
    }

    public final jv0 l1(int i10) {
        lv0 j12;
        if (i10 == 8) {
            return this.f26410d0;
        }
        if (i10 == 9) {
            return this.f26415f0;
        }
        if (!w0(i10) || (j12 = j1(i10)) == null) {
            return null;
        }
        return j12.d;
    }

    public boolean m0() {
        return !(this instanceof c40);
    }

    public final void m1(boolean z10) {
        fu0[] fu0VarArr;
        fu0[] fu0VarArr2;
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
        bv0[] bv0VarArr;
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
        cs0 cs0Var = this.V;
        if (cs0Var != null) {
            cs0Var.i();
        }
        int i22 = 0;
        while (true) {
            fu0VarArr = this.f26425k0;
            if (i22 >= fu0VarArr.length) {
                break;
            }
            fu0VarArr[i22].h.C0();
            i22++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fu0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = AndroidUtilities.dp(B0());
        s4.h0 adapter = fu0VarArr[z10 ? 1 : 0].h.getAdapter();
        s4.h0 h0Var = this.f26407c0;
        s4.y yVar = this.f26403b0;
        if (adapter == h0Var) {
            yVar.e(null);
        }
        boolean z23 = this.V0;
        yt0 yt0Var = this.D1;
        String str4 = "";
        tu0 tu0Var = this.N;
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f26430n0;
        int i23 = 100;
        if (z23 && this.U0) {
            fu0 fu0Var = fu0VarArr[z10 ? 1 : 0];
            if (fu0Var.f24354f == null) {
                fu0Var.f24354f = new s4.u0();
            }
            fu0 fu0Var2 = fu0VarArr[z10 ? 1 : 0];
            u0Var2 = fu0Var2.f24354f;
            xu0 xu0Var = this.S;
            du0 du0Var = this.f26423j0;
            iu0 iu0Var = this.f26419h0;
            iu0 iu0Var2 = this.f26421i0;
            iu0 iu0Var3 = this.f26417g0;
            if (z10) {
                int i24 = fu0Var2.F;
                if (i24 != 0 && i24 != 2 && i24 != 5 && i24 != 6 && (i24 != 7 || yt0Var.T())) {
                    if (u0Var3 != null) {
                        str4 = u0Var3.getSearchField().getText().toString();
                    }
                    int i25 = fu0VarArr[z10 ? 1 : 0].F;
                    if (i25 == 1) {
                        if (iu0Var3 != null) {
                            iu0Var3.G(str4, false);
                            if (adapter != iu0Var3) {
                                W0(adapter);
                                fu0VarArr[z10 ? 1 : 0].h.setAdapter(iu0Var3);
                            }
                        }
                    } else if (i25 == 3) {
                        if (iu0Var2 != null) {
                            iu0Var2.G(str4, false);
                            if (adapter != iu0Var2) {
                                W0(adapter);
                                fu0VarArr[z10 ? 1 : 0].h.setAdapter(iu0Var2);
                            }
                        }
                    } else if (i25 == 4) {
                        if (iu0Var != null) {
                            iu0Var.G(str4, false);
                            if (adapter != iu0Var) {
                                W0(adapter);
                                fu0VarArr[z10 ? 1 : 0].h.setAdapter(iu0Var);
                            }
                        }
                    } else if (i25 == 7) {
                        if (du0Var != null) {
                            du0Var.F(str4, false);
                            if (adapter != du0Var) {
                                W0(adapter);
                                fu0VarArr[z10 ? 1 : 0].h.setAdapter(du0Var);
                            }
                        }
                    } else if (i25 == 11) {
                        if (xu0Var != null) {
                            xu0Var.E(this.W0, str4);
                            if (adapter != xu0Var) {
                                W0(adapter);
                                fu0VarArr[z10 ? 1 : 0].h.setAdapter(xu0Var);
                            }
                        }
                    } else if (i25 == 15 && tu0Var != null && adapter != tu0Var) {
                        W0(adapter);
                        ls0 ls0Var = fu0VarArr[z10 ? 1 : 0].h;
                        tu0Var.f28661r = ls0Var;
                        ls0Var.setAdapter(tu0Var);
                    }
                } else {
                    this.V0 = false;
                    zs0 zs0Var = this.J0;
                    if (zs0Var != null) {
                        zs0Var.g(false);
                    }
                    this.U0 = false;
                    m1(true);
                    return;
                }
            } else if (fu0Var2.h != null) {
                int i26 = fu0Var2.F;
                if (i26 == 1) {
                    if (adapter != iu0Var3) {
                        W0(adapter);
                        fu0VarArr[z10 ? 1 : 0].h.setAdapter(iu0Var3);
                    }
                    iu0Var3.l();
                } else if (i26 == 3) {
                    if (adapter != iu0Var2) {
                        W0(adapter);
                        fu0VarArr[z10 ? 1 : 0].h.setAdapter(iu0Var2);
                    }
                    iu0Var2.l();
                } else if (i26 == 4) {
                    if (adapter != iu0Var) {
                        W0(adapter);
                        fu0VarArr[z10 ? 1 : 0].h.setAdapter(iu0Var);
                    }
                    iu0Var.l();
                } else if (i26 == 7) {
                    if (adapter != du0Var) {
                        W0(adapter);
                        fu0VarArr[z10 ? 1 : 0].h.setAdapter(du0Var);
                    }
                    du0Var.l();
                } else if (i26 == 11) {
                    if (adapter != xu0Var) {
                        W0(adapter);
                        fu0VarArr[z10 ? 1 : 0].h.setAdapter(xu0Var);
                    }
                    xu0Var.l();
                }
            }
            fu0VarArr2 = fu0VarArr;
            z20 = false;
            z19 = false;
            i16 = 100;
        } else {
            fu0 fu0Var3 = fu0VarArr[z10 ? 1 : 0];
            if (fu0Var3.e == null) {
                fu0Var3.e = new s4.u0();
            }
            fu0 fu0Var4 = fu0VarArr[z10 ? 1 : 0];
            s4.u0 u0Var4 = fu0Var4.e;
            fu0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i27 = fu0VarArr[z10 ? 1 : 0].F;
            if (i27 == 8 || w0(i27)) {
                layoutParams.topMargin = AndroidUtilities.dp(B0());
            }
            ls0 ls0Var2 = fu0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = ls0Var2.getPaddingLeft();
            fu0 fu0Var5 = fu0VarArr[z10 ? 1 : 0];
            ls0 ls0Var3 = fu0Var5.h;
            int Z = Z(fu0Var5.F);
            ls0Var3.f24048k3 = Z;
            int paddingRight = fu0VarArr[z10 ? 1 : 0].h.getPaddingRight();
            fu0VarArr2 = fu0VarArr;
            ls0 ls0Var4 = fu0VarArr2[z10 ? 1 : 0].h;
            int Y = Y(v0());
            ls0Var4.f24049l3 = Y;
            ls0Var2.setPadding(paddingLeft, Z, paddingRight, Y);
            int i28 = fu0VarArr2[z10 ? 1 : 0].F;
            int[] iArr = this.f26428m1;
            s4.h0 h0Var2 = this.K;
            View view = this.U;
            st0 st0Var = this.T;
            wu0 wu0Var = this.R;
            xt0 xt0Var = this.P;
            bv0[] bv0VarArr2 = this.f26445t1;
            if (i28 == 0) {
                s4.h0 h0Var3 = this.H;
                if (adapter != h0Var3) {
                    W0(adapter);
                    fu0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var3);
                }
                int i29 = -AndroidUtilities.dp(1.0f);
                layoutParams.rightMargin = i29;
                layoutParams.leftMargin = i29;
                bv0 bv0Var = bv0VarArr2[0];
                if (bv0Var.h && !bv0Var.e.isEmpty()) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                i23 = iArr[0];
                fu0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.f26457y0);
                bv0 bv0Var2 = bv0VarArr2[0];
                if (bv0Var2.f23034x == null) {
                    bv0Var2.f23034x = new s4.u0();
                }
                z13 = z22;
                u0Var = bv0VarArr2[0].f23034x;
                z11 = false;
            } else {
                if (i28 == 1) {
                    bv0 bv0Var3 = bv0VarArr2[1];
                    if (bv0Var3.h && !bv0Var3.e.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (adapter != h0Var2) {
                        W0(adapter);
                        fu0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var2);
                    }
                } else if (i28 == 2) {
                    bv0 bv0Var4 = bv0VarArr2[2];
                    if (bv0Var4.h && !bv0Var4.e.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (adapter != this.L) {
                        W0(adapter);
                        fu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.L);
                    }
                } else {
                    if (i28 == 3) {
                        if (adapter != this.J) {
                            W0(adapter);
                            fu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.J);
                        }
                    } else if (i28 == 4) {
                        bv0 bv0Var5 = bv0VarArr2[4];
                        if (bv0Var5.h && !bv0Var5.e.isEmpty()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (adapter != this.M) {
                            W0(adapter);
                            fu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.M);
                        }
                    } else {
                        if (i28 == 5) {
                            if (adapter != this.O) {
                                W0(adapter);
                                fu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.O);
                            }
                        } else if (i28 == 15) {
                            if (adapter != tu0Var) {
                                W0(adapter);
                                ls0 ls0Var5 = fu0VarArr2[z10 ? 1 : 0].h;
                                tu0Var.f28661r = ls0Var5;
                                ls0Var5.setAdapter(tu0Var);
                            }
                        } else if (i28 == 6) {
                            if (adapter != xt0Var) {
                                W0(adapter);
                                fu0VarArr2[z10 ? 1 : 0].h.setAdapter(xt0Var);
                            }
                        } else if (i28 == 7) {
                            if (adapter != this.f26400a0) {
                                W0(adapter);
                                fu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.f26400a0);
                            }
                        } else if (p0(i28)) {
                            s4.h0 k12 = k1(fu0VarArr2[z10 ? 1 : 0].F);
                            if (adapter != k12) {
                                W0(adapter);
                                fu0VarArr2[z10 ? 1 : 0].h.setAdapter(k12);
                                fu0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            fu0 fu0Var6 = fu0VarArr2[z10 ? 1 : 0];
                            if (fu0Var6.F != 9) {
                                yVar.e(fu0Var6.h);
                            }
                            i23 = iArr[1];
                        } else {
                            int i30 = fu0VarArr2[z10 ? 1 : 0].F;
                            if (i30 == 10) {
                                if (adapter != this.Q) {
                                    W0(adapter);
                                    fu0VarArr2[z10 ? 1 : 0].h.setAdapter(this.Q);
                                }
                            } else if (i30 == 11) {
                                if (adapter != wu0Var) {
                                    W0(adapter);
                                    fu0VarArr2[z10 ? 1 : 0].h.setAdapter(wu0Var);
                                    s4.y yVar2 = wu0Var.v;
                                    ls0 ls0Var6 = fu0VarArr2[z10 ? 1 : 0].h;
                                    wu0Var.f30062s = ls0Var6;
                                    yVar2.e(ls0Var6);
                                }
                                u0Var = wu0Var.f30061r;
                                z11 = true;
                                z13 = false;
                            } else if (i30 == 12) {
                                if (adapter != null) {
                                    W0(adapter);
                                    fu0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (st0Var.getParent() != fu0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(st0Var);
                                    fu0VarArr2[z10 ? 1 : 0].addView(st0Var, w7.y5.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                }
                            } else if (i30 == 13) {
                                if (adapter != null) {
                                    W0(adapter);
                                    fu0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != fu0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(view);
                                    fu0VarArr2[z10 ? 1 : 0].addView(view);
                                }
                            } else if (i30 == 14) {
                                if (adapter != null) {
                                    W0(adapter);
                                    fu0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (cs0Var != null && cs0Var.getParent() != fu0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(cs0Var);
                                    fu0VarArr2[z10 ? 1 : 0].addView(cs0Var);
                                    fu0VarArr2[z10 ? 1 : 0].f24358w.setVisibility(4);
                                }
                            }
                        }
                        u0Var = u0Var4;
                        z11 = false;
                        z13 = false;
                    }
                    u0Var = u0Var4;
                    z11 = true;
                    z13 = false;
                }
                z13 = z12;
                u0Var = u0Var4;
                z11 = true;
            }
            int i31 = fu0VarArr2[z10 ? 1 : 0].F;
            if (i31 != 0 && !p0(i31)) {
                z14 = false;
            } else {
                z14 = true;
            }
            us0 us0Var = fu0VarArr2[z10 ? 1 : 0].v;
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
            s4.u0 u0Var5 = u0Var;
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
            us0Var.setLayoutParams(w7.y5.d(-1, -1.0f, 119, f7, f12, f10, f11));
            if (z11) {
                fu0VarArr2[z10 ? 1 : 0].h.setSections(false);
            } else {
                ls0 ls0Var7 = fu0VarArr2[z10 ? 1 : 0].h;
                ls0Var7.getClass();
                ls0Var7.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19165i6, ls0Var7.f31015p2));
                ls0Var7.T2 = false;
                ls0Var7.I2 = null;
                ls0Var7.J2 = null;
                ls0Var7.M2 = 0.0f;
                ls0Var7.N2 = null;
                ls0Var7.O2 = null;
                ls0Var7.K2 = null;
                ll0 ll0Var = ls0Var7.H2;
                if (ll0Var != null) {
                    ls0Var7.q0(ll0Var);
                    ls0Var7.H2 = null;
                }
                ba baVar = ls0Var7.R2;
                if (baVar != null) {
                    ls0Var7.q0(baVar);
                    ls0Var7.R2 = null;
                }
            }
            fu0 fu0Var7 = fu0VarArr2[z10 ? 1 : 0];
            int i32 = fu0Var7.F;
            org.telegram.ui.ActionBar.m2 m2Var = this.f26449v1;
            if (i32 == 15) {
                z15 = z13;
                bv0VarArr = bv0VarArr2;
                str = "";
                fu0Var7.setBackground(ci.b7.e(fu0Var7.getBackground(), m2Var.getCurrentAccount(), this.f26424j1, org.telegram.ui.ActionBar.h6.I.q()));
                fu0VarArr2[z10 ? 1 : 0].setOutlineProvider(new ai.k2(16));
                fu0VarArr2[z10 ? 1 : 0].setClipToOutline(true);
                r52 = 0;
            } else {
                z15 = z13;
                bv0VarArr = bv0VarArr2;
                str = "";
                fu0Var7.setClipToOutline(false);
                r52 = 0;
                fu0VarArr2[z10 ? 1 : 0].setBackground(null);
            }
            fu0 fu0Var8 = fu0VarArr2[z10 ? 1 : 0];
            if (fu0Var8.F == 11) {
                fu0Var8.h.setItemAnimator(fu0Var8.d);
            } else {
                fu0Var8.h.setItemAnimator(r52);
                if (wu0Var != null && fu0VarArr2[z10 ? 1 : 0].h == wu0Var.f30062s) {
                    s4.y yVar3 = wu0Var.v;
                    wu0Var.f30062s = r52;
                    yVar3.e(r52);
                }
            }
            if (st0Var != null && fu0VarArr2[z10 ? 1 : 0].F != 12 && st0Var.getParent() == fu0VarArr2[z10 ? 1 : 0]) {
                st0Var.f40301a.onRemoveFromParent();
                fu0VarArr2[z10 ? 1 : 0].removeView(st0Var);
            }
            if (view != null && fu0VarArr2[z10 ? 1 : 0].F != 13) {
                ViewParent parent = view.getParent();
                fu0 fu0Var9 = fu0VarArr2[z10 ? 1 : 0];
                if (parent == fu0Var9) {
                    fu0Var9.removeView(view);
                }
            }
            if (cs0Var != null && fu0VarArr2[z10 ? 1 : 0].F != 14) {
                ViewParent parent2 = cs0Var.getParent();
                fu0 fu0Var10 = fu0VarArr2[z10 ? 1 : 0];
                if (parent2 == fu0Var10) {
                    fu0Var10.removeView(cs0Var);
                }
            }
            int i33 = fu0VarArr2[z10 ? 1 : 0].F;
            if (i33 != 0 && i33 != 11 && !p0(i33) && (i17 = fu0VarArr2[z10 ? 1 : 0].F) != 2 && i17 != 5 && i17 != 6 && ((i17 != 7 || yt0Var.T()) && (i18 = fu0VarArr2[z10 ? 1 : 0].F) != 10 && i18 != 13 && i18 != 14)) {
                if (z10) {
                    if (u0Var3 != null && u0Var3.getVisibility() == 4 && !this.G.f19572n0) {
                        if (D()) {
                            this.f26454x0 = 1;
                            u0Var3.setVisibility(0);
                        } else {
                            if (v0()) {
                                i20 = 8;
                            } else {
                                i20 = 4;
                            }
                            u0Var3.setVisibility(i20);
                        }
                        float f13 = z10 ? 1.0f : 0.0f;
                        this.f26432o0 = b0(f13);
                        s1(1.0f - f13);
                        z21 = false;
                    } else {
                        z21 = false;
                        this.f26454x0 = 0;
                        this.f26432o0 = 1.0f;
                    }
                } else {
                    z21 = false;
                    if (u0Var3 != null) {
                        if (u0Var3.getVisibility() == 4) {
                            if (D()) {
                                this.f26454x0 = 0;
                                this.f26432o0 = 1.0f;
                                u0Var3.setVisibility(0);
                            } else {
                                if (v0()) {
                                    i19 = 8;
                                } else {
                                    i19 = 4;
                                }
                                u0Var3.setVisibility(i19);
                                this.f26432o0 = 0.0f;
                            }
                        }
                        q1(z21);
                    }
                }
                q1(z21);
            } else if (z10) {
                this.f26454x0 = 2;
            } else {
                this.f26454x0 = 0;
                if (u0Var3 != null) {
                    if (!v0() && !this.V0) {
                        i11 = 4;
                    } else {
                        i11 = 8;
                    }
                    u0Var3.setVisibility(i11);
                }
            }
            int i34 = fu0VarArr2[z10 ? 1 : 0].F;
            if (i34 == 6) {
                if (!xt0Var.e && !xt0Var.h && xt0Var.d.isEmpty()) {
                    xt0.E(xt0Var, 0L);
                }
            } else if (i34 != 7) {
                if (p0(i34)) {
                    jv0 k13 = k1(fu0VarArr2[z10 ? 1 : 0].F);
                    if (k13 != null) {
                        ai.d9 d9Var = k13.f25553s;
                        k13.O();
                        ws0 ws0Var = fu0VarArr2[z10 ? 1 : 0].f24358w;
                        if (d9Var != null && (d9Var.k() || (i0() && d9Var.g() > 0))) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        ws0Var.e(z17, z10);
                        if (d9Var != null && d9Var.g() > 0 && !t0()) {
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
                    int i35 = fu0VarArr2[z10 ? 1 : 0].F;
                    if (i35 != 10 && i35 != 11 && i35 != 12 && i35 != 13 && i35 != 14) {
                        if (i35 == 15) {
                            i35 = 8;
                        }
                        bv0 bv0Var6 = bv0VarArr[i35];
                        if (!bv0Var6.f23019g && !bv0Var6.f23020i[0] && bv0Var6.f23015a.isEmpty()) {
                            bv0VarArr[i35].f23019g = true;
                            h0Var2.l();
                            if (i35 == 0) {
                                int i36 = bv0VarArr[0].f23028q;
                                if (i36 == 1) {
                                    i12 = 6;
                                } else if (i36 == 2) {
                                    i12 = 7;
                                }
                                m2Var.getMediaDataController().loadMedia(this.f26424j1, 50, 0, 0, i12, this.F, 1, m2Var.getClassGuid(), bv0VarArr[i12].f23027p, null, null);
                            }
                            i12 = i35;
                            m2Var.getMediaDataController().loadMedia(this.f26424j1, 50, 0, 0, i12, this.F, 1, m2Var.getClassGuid(), bv0VarArr[i12].f23027p, null, null);
                        }
                    }
                }
            }
            int i37 = fu0VarArr2[z10 ? 1 : 0].F;
            if (i37 != 8 && !w0(i37)) {
                fu0 fu0Var11 = fu0VarArr2[z10 ? 1 : 0];
                if (fu0Var11.F == 9) {
                    if (u0()) {
                        fu0VarArr2[z10 ? 1 : 0].f24358w.f26144b.setVisibility(8);
                        fu0VarArr2[z10 ? 1 : 0].f24358w.f26146f.setVisibility(8);
                    } else {
                        fu0VarArr2[z10 ? 1 : 0].f24358w.f26144b.setVisibility(0);
                        fu0VarArr2[z10 ? 1 : 0].f24358w.setStickerType(11);
                        fu0VarArr2[z10 ? 1 : 0].f24358w.f26146f.setVisibility(0);
                        fu0VarArr2[z10 ? 1 : 0].f24358w.f26146f.h(w());
                    }
                    fu0VarArr2[z10 ? 1 : 0].f24358w.d.setText(LocaleController.getString(R.string.NoArchivedStoriesTitle));
                    q90 q90Var = fu0VarArr2[z10 ? 1 : 0].f24358w.e;
                    if (v0()) {
                        str3 = LocaleController.getString(R.string.NoArchivedStoriesSubtitle);
                    } else {
                        str3 = str;
                    }
                    q90Var.setText(str3);
                    fu0VarArr2[z10 ? 1 : 0].f24358w.f26146f.setOnClickListener(new ir0(this, 7));
                } else {
                    fu0Var11.f24358w.f26144b.setVisibility(0);
                    fu0VarArr2[z10 ? 1 : 0].f24358w.setStickerType(1);
                    fu0VarArr2[z10 ? 1 : 0].f24358w.d.setText(LocaleController.getString(R.string.NoResult));
                    fu0VarArr2[z10 ? 1 : 0].f24358w.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    fu0VarArr2[z10 ? 1 : 0].f24358w.f26146f.setVisibility(8);
                }
            } else {
                fu0 fu0Var12 = fu0VarArr2[z10 ? 1 : 0];
                ws0 ws0Var2 = fu0Var12.f24358w;
                boolean w02 = w0(fu0Var12.F);
                int h12 = h1(fu0VarArr2[z10 ? 1 : 0].F);
                w9 w9Var = ws0Var2.f26144b;
                ci.d dVar = ws0Var2.f26146f;
                if (!w02 && !u0() && !r0()) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                w9Var.setVisibility(i13);
                if (w02) {
                    dVar.setVisibility(0);
                    dVar.h(LocaleController.getString(R.string.StoriesAlbumAddToAlbum));
                } else if (u0()) {
                    dVar.setVisibility(8);
                } else {
                    ws0Var2.setStickerType(11);
                    if (!t0()) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    dVar.setVisibility(i14);
                    dVar.h(w());
                }
                if (w02) {
                    ws0Var2.d.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeTitle));
                    ws0Var2.e.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeDescription));
                } else {
                    vh.n nVar = ws0Var2.d;
                    if (!t0()) {
                        if (v0()) {
                            i15 = R.string.NoPublicStoriesTitle2;
                        } else {
                            i15 = R.string.NoStoriesTitle;
                        }
                    } else {
                        i15 = R.string.NoHashtagStoriesTitle;
                    }
                    nVar.setText(LocaleController.getString(i15));
                    q90 q90Var2 = ws0Var2.e;
                    if (v0()) {
                        str2 = LocaleController.getString(R.string.NoStoriesSubtitle2);
                    } else {
                        str2 = str;
                    }
                    q90Var2.setText(str2);
                }
                dVar.setOnClickListener(new kr0(this, w02, h12, 0));
            }
            z19 = false;
            fu0VarArr2[z10 ? 1 : 0].h.setVisibility(0);
            i16 = i23;
            z20 = z15;
            u0Var2 = u0Var5;
        }
        fu0 fu0Var13 = fu0VarArr2[z10 ? 1 : 0];
        fu0Var13.f24352b = z20;
        o1(fu0Var13, z19);
        fu0VarArr2[z10 ? 1 : 0].f24359x.y1(i16);
        fu0VarArr2[z10 ? 1 : 0].h.a0();
        if (u0Var2 != null) {
            fu0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(u0Var2);
            fu0VarArr2[z10 ? 1 : 0].f24356r.setRecycledViewPool(u0Var2);
        }
        if (this.f26454x0 == 2) {
            org.telegram.ui.ActionBar.k kVar = this.G;
            if (kVar.f19572n0) {
                this.f26459z0 = true;
                kVar.h(true);
                this.f26454x0 = 0;
                this.f26432o0 = 0.0f;
                if (u0Var3 != null) {
                    if (v0()) {
                        i21 = 8;
                    } else {
                        i21 = 4;
                    }
                    u0Var3.setVisibility(i21);
                }
                q1(false);
            }
        }
    }

    public final void n0(ViewGroup viewGroup) {
        fu0[] fu0VarArr;
        for (fu0 fu0Var : this.f26425k0) {
            ls0 ls0Var = fu0Var.h;
            Objects.requireNonNull(ls0Var);
            fu0Var.f24355n = new ah.n(ls0Var, viewGroup, new up0(ls0Var, 1));
        }
        cs0 cs0Var = this.V;
        if (cs0Var != null) {
            cs0Var.S = viewGroup;
            cs0Var.R = new ci.w7(cs0Var, 1);
        }
    }

    public final void n1() {
        rt0 rt0Var = this.H;
        if (rt0Var != null) {
            rt0Var.l();
        }
        zu0 zu0Var = this.K;
        if (zu0Var != null) {
            zu0Var.l();
        }
        zu0 zu0Var2 = this.L;
        if (zu0Var2 != null) {
            zu0Var2.l();
        }
        av0 av0Var = this.J;
        if (av0Var != null) {
            av0Var.X(false);
        }
        zu0 zu0Var3 = this.M;
        if (zu0Var3 != null) {
            zu0Var3.l();
        }
        tu0 tu0Var = this.N;
        if (tu0Var != null) {
            tu0Var.l();
        }
        au0 au0Var = this.O;
        if (au0Var != null) {
            au0Var.l();
        }
        ut0 ut0Var = this.f26407c0;
        if (ut0Var != null) {
            ut0Var.l();
        }
        for (lv0 lv0Var : this.Y1.values()) {
            lv0Var.f26128c.l();
        }
    }

    public final void o1(fu0 fu0Var, boolean z10) {
        boolean z11;
        Integer num = 1;
        int i10 = 0;
        if (fu0Var.f24352b && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        gl0 fastScroll = fu0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = fu0Var.f24353c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            fu0Var.f24353c.cancel();
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
            fu0Var.f24353c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(num);
        } else if (!z11 && fastScroll.getTag() != null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, property, fastScroll.getAlpha(), 0.0f);
            ofFloat2.addListener(new da(fastScroll));
            fu0Var.f24353c = ofFloat2;
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
            fu0[] fu0VarArr = this.f26425k0;
            if (i10 < fu0VarArr.length) {
                ls0 ls0Var = fu0VarArr[i10].h;
                if (ls0Var != null) {
                    ls0Var.getViewTreeObserver().addOnPreDrawListener(new it0(this, i10, 0));
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
        yt0 yt0Var = this.D1;
        if (yt0Var.f() != null) {
            i12 = yt0Var.f().getHeight();
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
            } else if (childAt instanceof fu0) {
                i13 = i10;
                measureChildWithMargins(childAt, i13, 0, View.MeasureSpec.makeMeasureSpec(i12, 1073741824), 0);
                ls0 ls0Var = ((fu0) childAt).h;
                ls0Var.setPadding(0, ls0Var.f25383f3, 0, ls0Var.f25384g3);
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
            org.telegram.ui.ActionBar.m2 m2Var = this.f26449v1;
            if (m2Var.getParentLayout() != null && !((ActionBarLayout) m2Var.getParentLayout()).j() && !J() && !this.f26399a) {
                if (motionEvent != null) {
                    if (this.B1 == null) {
                        this.B1 = VelocityTracker.obtain();
                    }
                    this.B1.addMovement(motionEvent);
                    m40 m40Var = this.E1;
                    if (m40Var != null) {
                        m40Var.b(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.f26455x1 && !this.f26458y1 && motionEvent.getY() >= AndroidUtilities.dp(90.0f)) {
                    this.f26452w1 = motionEvent.getPointerId(0);
                    this.f26458y1 = true;
                    this.f26460z1 = (int) motionEvent.getX();
                    this.A1 = (int) motionEvent.getY();
                    this.B1.clear();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f26452w1) {
                    int x10 = (int) (motionEvent.getX() - this.f26460z1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.A1);
                    boolean z13 = this.f26455x1;
                    fu0[] fu0VarArr = this.f26425k0;
                    if (z13 && (((z10 = this.f26420h1) && x10 > 0) || (!z10 && x10 < 0))) {
                        if (x10 < 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!U0(motionEvent, z11)) {
                            this.f26458y1 = true;
                            this.f26455x1 = false;
                            N0(false);
                            fu0VarArr[0].setTranslationX(0.0f);
                            fu0 fu0Var = fu0VarArr[1];
                            if (this.f26420h1) {
                                i11 = fu0VarArr[0].getMeasuredWidth();
                            } else {
                                i11 = -fu0VarArr[0].getMeasuredWidth();
                            }
                            fu0Var.setTranslationX(i11);
                            Z0(0.0f, fu0VarArr[1].F);
                            M0(getTabProgress());
                        }
                    }
                    if (this.f26458y1 && !this.f26455x1) {
                        if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                            if (x10 < 0) {
                                z12 = true;
                            }
                            U0(motionEvent, z12);
                        }
                    } else if (this.f26455x1) {
                        fu0VarArr[0].setTranslationX(x10);
                        if (this.f26420h1) {
                            fu0VarArr[1].setTranslationX(fu0VarArr[0].getMeasuredWidth() + x10);
                        } else {
                            fu0VarArr[1].setTranslationX(x10 - fu0VarArr[0].getMeasuredWidth());
                        }
                        float abs2 = Math.abs(x10) / fu0VarArr[0].getMeasuredWidth();
                        if (!D()) {
                            this.f26432o0 = 0.0f;
                        } else {
                            this.f26432o0 = b0(abs2);
                            s1(abs2);
                            float a02 = a0(abs2);
                            this.f26434p0 = a02;
                            if (a02 != 0.0f && D() && !q0()) {
                                i10 = 0;
                            } else {
                                i10 = 4;
                            }
                            this.f26439r0.setVisibility(i10);
                        }
                        q1(false);
                        Z0(abs2, fu0VarArr[1].F);
                        M0(getTabProgress());
                        L0();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f26452w1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    g1(motionEvent);
                }
                return this.f26455x1;
            }
        }
        return false;
    }

    public final void p1() {
        boolean z10;
        float f7;
        org.telegram.ui.ActionBar.u0 u0Var = this.f26444t0;
        if (u0Var != null) {
            if (!this.f26449v1.getMessagesController().isPeerNoForwards(this.f26424j1) && !j0()) {
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
                u0Var.setBackground(org.telegram.ui.ActionBar.h6.f0(h0(org.telegram.ui.ActionBar.h6.f19480z8), 5, -1));
            }
        }
    }

    public boolean q0() {
        return false;
    }

    public final void q1(boolean z10) {
        cs0 cs0Var;
        hs0 hs0Var;
        oj0 oj0Var = this.f26442s0;
        if (oj0Var == null) {
            return;
        }
        float f7 = 0.0f;
        if (!this.V0 && (((cs0Var = this.V) == null || !cs0Var.g()) && ((hs0Var = this.W) == null || !hs0Var.f37665w))) {
            f7 = Utilities.clamp(this.f26432o0 + this.f26434p0, 1.0f, 0.0f);
        }
        oj0Var.setAlpha(f7);
        boolean z11 = false;
        if (z10) {
            if (a0(1.0f) > 0.5f) {
                z11 = true;
            }
            A(z11, true);
        } else if (this.f26454x0 == 2) {
            if (this.f26434p0 > 0.1f) {
                z11 = true;
            }
            A(z11, true);
        } else {
            if (this.f26432o0 < 0.1f) {
                z11 = true;
            }
            A(z11, true);
        }
    }

    public final boolean r0() {
        TLRPC.User user;
        long j3 = this.f26424j1;
        if (j3 <= 0 || (user = MessagesController.getInstance(this.f26449v1.getCurrentAccount()).getUser(Long.valueOf(j3))) == null || !user.bot) {
            return false;
        }
        return true;
    }

    public final void r1(boolean z10) {
        int i10 = 0;
        while (true) {
            fu0[] fu0VarArr = this.f26425k0;
            if (i10 < fu0VarArr.length) {
                int childCount = fu0VarArr[i10].h.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = fu0VarArr[i10].h.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.k7) {
                        ((org.telegram.ui.Cells.k7) childAt).b(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.t7) {
                        ((org.telegram.ui.Cells.t7) childAt).i(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.n7) {
                        ((org.telegram.ui.Cells.n7) childAt).f(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.j7) {
                        ((org.telegram.ui.Cells.j7) childAt).e(false, z10);
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
        fu0[] fu0VarArr = this.f26425k0;
        fu0 fu0Var = fu0VarArr[1];
        float f10 = 0.0f;
        if (fu0Var != null && fu0Var.F == 11) {
            f10 = 0.0f + f7;
        }
        int i10 = 0;
        fu0 fu0Var2 = fu0VarArr[0];
        if (fu0Var2 != null && fu0Var2.F == 11) {
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
        TLRPC.ChatFull chatFull2 = this.f26411d1;
        if (chatFull2 != null && chatFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26411d1 = chatFull;
        if (chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.f26408c1 == 0) {
                this.f26408c1 = -j3;
                int i11 = 0;
                while (true) {
                    bv0[] bv0VarArr = this.f26445t1;
                    if (i11 >= bv0VarArr.length) {
                        break;
                    }
                    if (bv0VarArr[i11].f23016b[1].size() == 0) {
                        bv0 bv0Var = bv0VarArr[i11];
                        bv0Var.f23021j[1] = this.f26411d1.migrated_from_max_id;
                        bv0Var.f23020i[1] = false;
                    }
                    i11++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.f26411d1;
        if (chatFull3 != null && z10 != chatFull3.stories_pinned_available) {
            ct0 ct0Var = this.I0;
            if (ct0Var != null) {
                if (q0()) {
                    i10 = 9;
                } else {
                    i10 = 8;
                }
                ct0Var.setInitialTabId(i10);
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

    public void setForwardRestrictedHint(m40 m40Var) {
        this.E1 = m40Var;
    }

    public void setMergeDialogId(long j3) {
        this.f26408c1 = j3;
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
            fu0[] fu0VarArr = this.f26425k0;
            if (i15 >= fu0VarArr.length) {
                break;
            }
            fu0VarArr[i15].setTranslationY(this.K1);
            i15++;
        }
        if (this.P0 != null) {
            K();
        } else {
            ys0 ys0Var = this.R0;
            if (ys0Var != null) {
                ys0Var.setTranslationY(AndroidUtilities.dp(48.0f) + i11);
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
            fu0[] fu0VarArr = this.f26425k0;
            if (fu0VarArr != null) {
                for (fu0 fu0Var : fu0VarArr) {
                    if (fu0Var != null) {
                        ls0 ls0Var = fu0Var.h;
                        int paddingLeft = ls0Var.getPaddingLeft();
                        ls0 ls0Var2 = fu0Var.h;
                        int i11 = ls0Var2.f25383f3;
                        int paddingRight = ls0Var2.getPaddingRight();
                        ls0 ls0Var3 = fu0Var.h;
                        int Y = Y(v0());
                        ls0Var3.f24049l3 = Y;
                        ls0Var.setPadding(paddingLeft, i11, paddingRight, Y);
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
                fu0[] fu0VarArr = this.f26425k0;
                if (i10 < fu0VarArr.length) {
                    o1(fu0VarArr[i10], true);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        boolean z10;
        TLRPC.UserFull userFull2 = this.f26413e1;
        if (userFull2 != null && userFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26413e1 = userFull;
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
            fu0[] fu0VarArr = this.f26425k0;
            if (i11 >= fu0VarArr.length) {
                break;
            }
            int measuredHeight = getMeasuredHeight();
            if (fu0VarArr[i11].F == 8) {
                f7 = 280.0f;
            } else {
                f7 = 120.0f;
            }
            float f10 = (-(measuredHeight - Math.max(i10, AndroidUtilities.dp(f7)))) / 2.0f;
            fu0VarArr[i11].f24358w.setTranslationY(f10);
            fu0VarArr[i11].v.setTranslationY(-f10);
            i11++;
        }
        as0 as0Var = this.U;
        if (as0Var != null) {
            as0Var.setVisibleHeight(i10);
        }
        cs0 cs0Var = this.V;
        if (cs0Var != null) {
            cs0Var.setVisibleHeight(i10);
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
        fu0 fu0Var = this.f26425k0[1];
        z10 = (fu0Var == null || fu0Var.F != 11) ? false : false;
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
        scaleX.scaleY(f11).withEndAction(new bi.f(29, this, z10)).setDuration(420L).setInterpolator(tr.h).start();
    }

    public boolean u0() {
        return false;
    }

    public final void u1() {
        boolean z10;
        int i10;
        ai.d9 d9Var;
        boolean r02 = r0();
        org.telegram.ui.ActionBar.u0 u0Var = this.f26451w0;
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f26448v0;
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
                    ut0 ut0Var = this.f26407c0;
                    if (ut0Var != null && (d9Var = ut0Var.f25553s) != null && !d9Var.m(messageObject.getId())) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mv0.v1(boolean):void");
    }

    public final SpannableStringBuilder w() {
        if (this.W1 == null) {
            this.W1 = new SpannableStringBuilder();
            if (r0()) {
                this.W1.append((CharSequence) LocaleController.getString(R.string.ProfileBotPreviewEmptyButton));
            } else {
                this.W1.append((CharSequence) "c");
                this.W1.setSpan(new rq(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.W1.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
            }
        }
        return this.W1;
    }

    public final Boolean w1(View view, View view2) {
        if (!this.f26433o1) {
            fu0[] fu0VarArr = this.f26425k0;
            boolean z10 = false;
            fu0 fu0Var = fu0VarArr[0];
            if (fu0Var != null) {
                int i10 = fu0Var.F;
                this.f26435p1 = i10;
                boolean p02 = p0(i10);
                int[] iArr = this.f26428m1;
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
                    } else if (c0(fu0VarArr[0].F) >= 5 || w0(fu0VarArr[0].F)) {
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

    public final void x(b80 b80Var, org.telegram.ui.ActionBar.m2 m2Var, long j3, int i10) {
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
        a4.a.A(sb2, MessagesController.getInstance(m2Var.getCurrentAccount()).linkPrefix, "/", publicUsername, "/a/");
        sb2.append(i10);
        b80Var.c(R.drawable.media_share, LocaleController.getString(R.string.StoriesAlbumMenuShareLink), new fn0(this, sb2.toString(), m2Var, 3), false);
    }

    public final boolean x0() {
        if (!C() || ((getClosestTab() != 8 && getClosestTab() != 13 && !w0(getClosestTab())) || !this.C1)) {
            cs0 cs0Var = this.V;
            if (cs0Var == null || !cs0Var.g()) {
                hs0 hs0Var = this.W;
                if ((hs0Var == null || !hs0Var.f37665w) && !this.f26433o1 && !this.f26418g1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final Boolean x1(View view, View view2) {
        if (!this.f26433o1) {
            fu0[] fu0VarArr = this.f26425k0;
            boolean z10 = false;
            fu0 fu0Var = fu0VarArr[0];
            if (fu0Var != null) {
                if (!this.f26426k1 || !p0(fu0Var.F)) {
                    int i10 = fu0VarArr[0].F;
                    this.f26435p1 = i10;
                    boolean p02 = p0(i10);
                    int[] iArr = this.f26428m1;
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
                        } else if (c0(fu0VarArr[0].F) >= 5 || w0(fu0VarArr[0].F)) {
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

    public final void y(org.telegram.ui.Components.b80 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mv0.y(org.telegram.ui.Components.b80):void");
    }

    public final void y0(int i10, int i11, int i12, boolean z10) {
        bv0[] bv0VarArr = this.f26445t1;
        bv0VarArr[i10].f23015a.clear();
        bv0VarArr[i10].f23016b[0].clear();
        bv0VarArr[i10].f23016b[1].clear();
        bv0 bv0Var = bv0VarArr[i10];
        bv0Var.f23021j[0] = i11;
        bv0Var.f23020i[0] = false;
        bv0Var.f23023l = false;
        bv0Var.f23024m = i12;
        bv0Var.f23025n = (bv0Var.e() - i12) - 1;
        bv0 bv0Var2 = bv0VarArr[i10];
        if (bv0Var2.f23025n < 0) {
            bv0Var2.f23025n = 0;
        }
        bv0Var2.f23022k = i11;
        bv0Var2.f23026o = true;
        bv0Var2.f23019g = false;
        bv0Var2.f23027p++;
        fu0 W = W(i10);
        if (W != null && W.h.getAdapter() != null) {
            W.h.getAdapter().l();
        }
        if (z10) {
            int i13 = 0;
            while (true) {
                fu0[] fu0VarArr = this.f26425k0;
                if (i13 < fu0VarArr.length) {
                    fu0 fu0Var = fu0VarArr[i13];
                    if (fu0Var.F == i10) {
                        fu0Var.f24359x.h1(Math.min(bv0VarArr[i10].e() - 1, bv0VarArr[i10].f23024m), 0);
                    }
                    i13++;
                } else {
                    return;
                }
            }
        }
    }

    public final void z(eu0 eu0Var, int i10, SparseBooleanArray sparseBooleanArray) {
        int childCount = eu0Var.getChildCount();
        w00 w00Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = eu0Var.getChildAt(i11);
            if (childAt instanceof w00) {
                w00Var = childAt;
            }
        }
        if (w00Var != null) {
            eu0Var.removeView(w00Var);
        }
        getViewTreeObserver().addOnPreDrawListener(new ht0(this, eu0Var, sparseBooleanArray, w00Var, i10));
    }

    public final void z0(boolean z10) {
        long j3 = this.F;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i10 == 0 && !t0()) {
            for (int i11 = 0; i11 < 4; i11++) {
                final int i12 = f26397d2[i11];
                bv0[] bv0VarArr = this.f26445t1;
                if (!bv0VarArr[i12].h || z10) {
                    long j10 = this.f26424j1;
                    if (!DialogObject.isEncryptedDialog(j10)) {
                        bv0VarArr[i12].h = false;
                        TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
                        if (i12 == 0) {
                            int i13 = bv0VarArr[i12].f23028q;
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
                        org.telegram.ui.ActionBar.m2 m2Var = this.f26449v1;
                        tL_messages_getSearchResultsPositions.peer = m2Var.getMessagesController().getInputPeer(j10);
                        if (i10 != 0 && m2Var.getUserConfig().getClientUserId() == j10) {
                            tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                            tL_messages_getSearchResultsPositions.saved_peer_id = m2Var.getMessagesController().getInputPeer(j3);
                        }
                        final int i14 = bv0VarArr[i12].f23027p;
                        ConnectionsManager.getInstance(m2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(m2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new nr0(mv0.this, tL_error, i14, i12, tLObject, 0));
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
    public final void f(org.telegram.ui.Cells.s2 s2Var) {
    }

    public void o0() {
    }
}
