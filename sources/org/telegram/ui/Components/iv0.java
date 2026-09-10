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
public abstract class iv0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Cells.n2 {
    public static final int[] f24079d2 = {0, 1, 2, 4};
    public static final sr0 f24080e2 = new sr0(0);
    public final NumberTextView A0;
    public int A1;
    public final ga B0;
    public VelocityTracker B1;
    public final ImageView C0;
    public boolean C1;
    public final org.telegram.ui.ActionBar.i2 D0;
    public final tt0 D1;
    public final int E;
    public final ArrayList E0;
    public s40 E1;
    public final long F;
    public final ArrayList F0;
    public final org.telegram.ui.ActionBar.f6 F1;
    public final org.telegram.ui.ActionBar.l G;
    public final ArrayList G0;
    public final NotificationCenter.ObserversGroup G1;
    public final mt0 H;
    public final ArrayList H0;
    public boolean H1;
    public final cv0 I;
    public final xs0 I0;
    public final AnimationNotificationsLocker I1;
    public final wu0 J;
    public final us0 J0;
    public my J1;
    public final vu0 K;
    public final org.telegram.ui.Cells.w0 K0;
    public int K1;
    public final vu0 L;
    public AnimatorSet L0;
    public boolean L1;
    public final vu0 M;
    public final br0 M0;
    public int M1;
    public final ou0 N;
    public final ArrayList N0;
    public AnimatorSet N1;
    public final vt0 O;
    public float O0;
    public final SparseArray O1;
    public final st0 P;
    public final qs P0;
    public long P1;
    public final qt0 Q;
    public final FrameLayout Q0;
    public boolean Q1;
    public final ru0 R;
    public final ts0 R0;
    public int R1;
    public final tu0 S;
    public final int S0;
    public final et0 S1;
    public final nt0 T;
    public final Paint T0;
    public zh.a5 T1;
    public final vr0 U;
    public boolean U0;
    public float U1;
    public final wr0 V;
    public boolean V0;
    public boolean V1;
    public final cs0 W;
    public yg.p0 W0;
    public SpannableStringBuilder W1;
    public final int[] X0;
    public int X1;
    public int Y0;
    public final HashMap Y1;
    public final SparseArray[] Z0;
    public final HashMap Z1;
    public boolean f24081a;
    public final rt0 f24082a0;
    public int f24083a1;
    public int a2;
    public boolean f24084b;
    public final s4.y f24085b0;
    public boolean f24086b1;
    public int f24087b2;
    public boolean f24088c;
    public final pt0 f24089c0;
    public long f24090c1;
    public final nh f24091c2;
    public boolean d;
    public final fv0 f24092d0;
    public TLRPC.ChatFull f24093d1;
    public int e;
    public final ur0 f24094e0;
    public TLRPC.UserFull f24095e1;
    public int f24096f;
    public final fv0 f24097f0;
    public AnimatorSet f24098f1;
    public final du0 f24099g0;
    public boolean f24100g1;
    public float h;
    public final du0 f24101h0;
    public boolean f24102h1;
    public final du0 f24103i0;
    public boolean f24104i1;
    public final yt0 f24105j0;
    public final long f24106j1;
    public final au0[] f24107k0;
    public boolean f24108k1;
    public final org.telegram.ui.ActionBar.w0 f24109l0;
    public boolean l1;
    public final org.telegram.ui.ActionBar.w0 m0;
    public final int[] f24110m1;
    public float f24111n;
    public final org.telegram.ui.ActionBar.w0 f24112n0;
    public float f24113n1;
    public float f24114o0;
    public boolean f24115o1;
    public float f24116p0;
    public int f24117p1;
    public final TextView f24118q0;
    public int f24119q1;
    public boolean f24120r;
    public final ImageView f24121r0;
    public final hs0 f24122r1;
    public int f24123s;
    public final kj0 f24124s0;
    public float f24125s1;
    public final org.telegram.ui.ActionBar.w0 f24126t0;
    public final xu0[] f24127t1;
    public final org.telegram.ui.ActionBar.w0 f24128u0;
    public final av0 f24129u1;
    public int v;
    public final org.telegram.ui.ActionBar.w0 f24130v0;
    public final org.telegram.ui.ActionBar.p2 f24131v1;
    public int f24132w;
    public final org.telegram.ui.ActionBar.w0 f24133w0;
    public int f24134w1;
    public final Rect f24135x;
    public int f24136x0;
    public boolean f24137x1;
    public final a10 f24138y;
    public final Drawable f24139y0;
    public boolean f24140y1;
    public boolean f24141z0;
    public int f24142z1;

    public iv0(android.content.Context r40, long r41, org.telegram.ui.Components.av0 r43, int r44, java.util.ArrayList r45, org.telegram.tgnet.TLRPC.ChatFull r46, org.telegram.tgnet.TLRPC.UserFull r47, int r48, int r49, org.telegram.ui.ActionBar.p2 r50, org.telegram.ui.Components.tt0 r51, int r52, org.telegram.ui.ActionBar.f6 r53, zg.a r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.iv0.<init>(android.content.Context, long, org.telegram.ui.Components.av0, int, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.tgnet.TLRPC$UserFull, int, int, org.telegram.ui.ActionBar.p2, org.telegram.ui.Components.tt0, int, org.telegram.ui.ActionBar.f6, zg.a):void");
    }

    public static ut0 M(int i10, long j3, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        ut0 ut0Var = new ut0(context, f6Var);
        TextView textView = ut0Var.f27745a;
        if (i10 == 0) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoMediaSecret));
                return ut0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoMedia));
            return ut0Var;
        } else if (i10 == 1) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedFilesSecret));
                return ut0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedFiles));
            return ut0Var;
        } else if (i10 == 2) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedVoiceSecret));
                return ut0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedVoice));
            return ut0Var;
        } else if (i10 == 3) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedLinksSecret));
                return ut0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedLinks));
            return ut0Var;
        } else if (i10 == 4) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedAudioSecret));
                return ut0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedAudio));
            return ut0Var;
        } else if (i10 == 5) {
            if (DialogObject.isEncryptedDialog(j3)) {
                textView.setText(LocaleController.getString(R.string.NoSharedGifSecret));
                return ut0Var;
            }
            textView.setText(LocaleController.getString(R.string.NoGIFs));
            return ut0Var;
        } else {
            ImageView imageView = ut0Var.f27746b;
            if (i10 == 6) {
                imageView.setImageDrawable(null);
                textView.setText(LocaleController.getString(R.string.NoGroupsInCommon));
                return ut0Var;
            }
            if (i10 == 7) {
                imageView.setImageDrawable(null);
                textView.setText("");
            }
            return ut0Var;
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

    public static void g(iv0 iv0Var, int i10, TL_stories.StoryItem storyItem, String str) {
        my myVar = new my(iv0Var, i10, storyItem, 8);
        zh.i5 storiesController = iv0Var.getStoriesController();
        long j3 = iv0Var.f24106j1;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.c0(i10, j3, arrayList);
        wc.a0(iv0Var.f24131v1).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", 1, str)), LocaleController.getString(R.string.UndoNoCaps), myVar).j();
    }

    public zh.i5 getStoriesController() {
        return MessagesController.getInstance(this.f24131v1.getCurrentAccount()).getStoriesController();
    }

    public static void h(iv0 iv0Var, TL_stories.StoryItem storyItem) {
        iv0Var.getStoriesController().o0(iv0Var.f24106j1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        wc.a0(iv0Var.f24131v1).G(R.raw.chats_archived, 5000, LocaleController.formatPluralString("StoryArchived", 1, new Object[0])).j();
    }

    public static void i(iv0 iv0Var, long j3, int i10, String str) {
        zh.w4 B = iv0Var.getStoriesController().B(j3, true);
        int i11 = B.f49003a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        ((zh.b5) B.h.get(c10)).f48309b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f49004b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        B.f(true);
    }

    public static void j(iv0 iv0Var, TL_stories.StoryItem storyItem, zh.b5 b5Var) {
        iv0Var.getStoriesController().c(b5Var.f48308a, iv0Var.f24106j1, storyItem);
        AndroidUtilities.runOnUIThread(new yo0(4, iv0Var, b5Var), 100L);
    }

    public static void m(iv0 iv0Var, HashSet hashSet, TL_stories.StoryItem storyItem, w70 w70Var, zh.b5 b5Var) {
        String formatString;
        long j3 = iv0Var.f24106j1;
        if (hashSet.contains(Integer.valueOf(b5Var.f48308a))) {
            iv0Var.getStoriesController().c(b5Var.f48308a, j3, storyItem);
            formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, b5Var.f48309b);
        } else {
            zh.i5 storiesController = iv0Var.getStoriesController();
            int i10 = b5Var.f48308a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.c0(i10, j3, arrayList);
            formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, b5Var.f48309b);
        }
        wc.a0(iv0Var.f24131v1).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(formatString)).j();
        w70Var.u();
    }

    public static void n(iv0 iv0Var, long j3, int i10) {
        zh.w4 B = iv0Var.getStoriesController().B(j3, true);
        int i11 = B.f49003a;
        int c10 = B.c(i10);
        if (c10 == -1) {
            return;
        }
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.f49004b);
        tL_deleteAlbum.album_id = ((zh.b5) B.h.remove(c10)).f48308a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_deleteAlbum, null);
        B.f(true);
    }

    public static int p(View view) {
        if (view instanceof org.telegram.ui.Cells.u7) {
            return ((org.telegram.ui.Cells.u7) view).getMessageId();
        }
        if (view instanceof org.telegram.ui.Cells.l7) {
            return ((org.telegram.ui.Cells.l7) view).getMessage().getId();
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            return ((org.telegram.ui.Cells.k7) view).getMessage().getId();
        }
        return 0;
    }

    public static boolean p0(int i10) {
        if (i10 != 8 && i10 != 9 && !w0(i10)) {
            return false;
        }
        return true;
    }

    public static void q(au0 au0Var, xu0[] xu0VarArr, boolean z10) {
        yo0 yo0Var;
        if (z10) {
            if (SharedConfig.fastScrollHintCount > 0 && au0Var.G == null && !au0Var.I && au0Var.h.getFastScroll() != null && au0Var.h.getFastScroll().f22156a0 && au0Var.h.getFastScroll().getVisibility() == 0 && xu0VarArr[0].e() >= 50) {
                SharedConfig.setFastScrollHintCount(SharedConfig.fastScrollHintCount - 1);
                au0Var.I = true;
                Context context = au0Var.getContext();
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                textView.setText(LocaleController.getString(R.string.SharedMediaFastScrollHint));
                textView.setTextSize(1, 14.0f);
                textView.setMaxLines(3);
                int i10 = org.telegram.ui.ActionBar.j6.f18152pf;
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18170qf, false)));
                frameLayout.addView(textView, w7.a6.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
                ?? view = new View(context);
                view.f29478a = new Random();
                Paint paint = new Paint(1);
                view.f29479b = paint;
                Paint paint2 = new Paint(1);
                view.f29480c = paint2;
                view.f29481f = 1.0f;
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
                view.e = paint4;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                paint4.setXfermode(new PorterDuffXfermode(mode));
                frameLayout.addView(view, w7.a6.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                au0Var.G = frameLayout;
                au0Var.addView((View) frameLayout, w7.a6.c(-2.0f, -2));
                au0Var.G.setAlpha(0.0f);
                au0Var.G.setScaleX(0.8f);
                au0Var.G.setScaleY(0.8f);
                au0Var.G.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                au0Var.invalidate();
                yo0 yo0Var2 = new yo0(3, au0Var, frameLayout);
                au0Var.H = yo0Var2;
                AndroidUtilities.runOnUIThread(yo0Var2, 4000L);
            }
        } else if (au0Var.G != null && (yo0Var = au0Var.H) != null) {
            AndroidUtilities.cancelRunOnUIThread(yo0Var);
            au0Var.H.run();
            au0Var.H = null;
            au0Var.G = null;
        }
    }

    public static void s(org.telegram.ui.Components.iv0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.iv0.s(org.telegram.ui.Components.iv0):void");
    }

    public static void t(iv0 iv0Var, int i10, boolean z10) {
        au0[] au0VarArr = iv0Var.f24107k0;
        if (au0VarArr[0].F == i10) {
            return;
        }
        au0 au0Var = au0VarArr[1];
        au0Var.F = i10;
        au0Var.setVisibility(0);
        iv0Var.k0();
        iv0Var.m1(true);
        iv0Var.f24102h1 = z10;
        iv0Var.L0();
        iv0Var.A(!iv0Var.s0(i10), true);
        iv0Var.q1(true);
    }

    public static int u(iv0 iv0Var, s4.h0 h0Var) {
        if (h0Var == iv0Var.f24089c0) {
            return 8;
        }
        if (h0Var == iv0Var.f24094e0) {
            return 9;
        }
        for (hv0 hv0Var : iv0Var.Y1.values()) {
            if (hv0Var.f23767c == h0Var) {
                return hv0Var.f23765a;
            }
        }
        return -1;
    }

    public static int v(iv0 iv0Var, s4.h0 h0Var) {
        if (h0Var == iv0Var.f24092d0) {
            return 8;
        }
        if (h0Var == iv0Var.f24097f0) {
            return 9;
        }
        for (hv0 hv0Var : iv0Var.Y1.values()) {
            if (hv0Var.d == h0Var) {
                return hv0Var.f23765a;
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
        kj0 kj0Var = this.f24124s0;
        if (kj0Var != null && this.V1 != z10) {
            this.V1 = z10;
            if (!z10 && kj0Var.getAnimatedDrawable().f23648b0 < 20) {
                kj0Var.getAnimatedDrawable().P(0);
            } else {
                hj0 animatedDrawable = kj0Var.getAnimatedDrawable();
                if (this.V1) {
                    i10 = 50;
                } else {
                    i10 = 100;
                }
                animatedDrawable.P(i10);
            }
            if (z11) {
                kj0Var.getAnimatedDrawable().start();
            } else {
                kj0Var.getAnimatedDrawable().M(kj0Var.getAnimatedDrawable().f23653f);
            }
        }
    }

    public final void A0(int i10) {
        int i11;
        xu0[] xu0VarArr = this.f24127t1;
        if (i10 == 0) {
            int i12 = xu0VarArr[0].f29169q;
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
        xu0VarArr[i10].f29160g = true;
        org.telegram.ui.ActionBar.p2 p2Var = this.f24131v1;
        p2Var.getMediaDataController().loadMedia(this.f24106j1, 50, 0, xu0VarArr[i10].f29163k, i11, this.F, 1, p2Var.getClassGuid(), xu0VarArr[i10].f29168p, null, null);
    }

    public final void B(int i10) {
        int i11;
        au0 W = W(this.f24117p1);
        this.f24123s = -1;
        if (W != null) {
            W.h.B0();
            this.f24119q1 = i10;
            W.f21595r.setVisibility(0);
            if (p0(this.f24117p1)) {
                W.f21595r.setAdapter(l1(this.f24117p1));
            } else {
                W.f21595r.setAdapter(this.I);
            }
            zt0 zt0Var = W.f21595r;
            int paddingLeft = zt0Var.getPaddingLeft();
            zt0 zt0Var2 = W.f21595r;
            int Z = Z(W.F);
            zt0Var2.f29808d3 = Z;
            int paddingRight = W.f21595r.getPaddingRight();
            zt0 zt0Var3 = W.f21595r;
            int Y = Y(v0());
            zt0Var3.f29809e3 = Y;
            zt0Var.setPadding(paddingLeft, Z, paddingRight, Y);
            W.f21596s.y1(i10);
            W.f21595r.a0();
            int i12 = 0;
            while (true) {
                au0[] au0VarArr = this.f24107k0;
                if (i12 >= au0VarArr.length) {
                    break;
                }
                au0 au0Var = au0VarArr[i12];
                if (au0Var != null && ((i11 = au0Var.F) == 0 || p0(i11))) {
                    AndroidUtilities.updateVisibleRows(au0VarArr[i12].h);
                }
                i12++;
            }
            this.f24115o1 = true;
            if (this.f24117p1 == 0) {
                this.f24127t1[0].g(true);
            }
            this.f24113n1 = 0.0f;
            X0();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.I1.lock();
            ofFloat.addUpdateListener(new ws0(this, W, 1));
            ofFloat.addListener(new di.b3(this, p0(W.F) ? 1 : 0, i10, 2));
            ofFloat.setInterpolator(wr.f28819f);
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
        long j3 = this.f24106j1;
        org.telegram.ui.ActionBar.p2 p2Var = this.f24131v1;
        if (r02) {
            TLRPC.User user = MessagesController.getInstance(p2Var.getCurrentAccount()).getUser(Long.valueOf(j3));
            if (user == null || !user.bot || !user.bot_can_edit) {
                return false;
            }
            return true;
        } else if (!v0() && (p2Var == null || !p2Var.getMessagesController().getStoriesController().h(j3))) {
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
        vr0 vr0Var;
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
        ru0 ru0Var = this.R;
        SparseArray[] sparseArrayArr = this.Z0;
        org.telegram.ui.ActionBar.p2 p2Var = this.f24131v1;
        boolean z13 = true;
        char c10 = 1;
        if (i10 == 101) {
            boolean p02 = p0(getSelectedTab());
            org.telegram.ui.ActionBar.f6 f6Var = this.F1;
            if (!p02 && getSelectedTab() != 13) {
                if (getSelectedTab() == 11) {
                    SavedMessagesController savedMessagesController = p2Var.getMessagesController().getSavedMessagesController();
                    final ArrayList arrayList = new ArrayList();
                    for (int i15 = 0; i15 < savedMessagesController.allDialogs.size(); i15++) {
                        long j3 = savedMessagesController.allDialogs.get(i15).dialogId;
                        if (ru0Var.f26760w.contains(Long.valueOf(j3))) {
                            arrayList.add(Long.valueOf(j3));
                        }
                    }
                    String str = "";
                    if (!arrayList.isEmpty()) {
                        Long l4 = (Long) arrayList.get(0);
                        long longValue = l4.longValue();
                        if (longValue == p2Var.getUserConfig().getClientUserId()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        int i16 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                        if (i16 < 0) {
                            TLRPC.Chat chat2 = p2Var.getMessagesController().getChat(Long.valueOf(-longValue));
                            if (chat2 != null) {
                                str = chat2.title;
                            }
                        } else if (i16 >= 0 && (user2 = p2Var.getMessagesController().getUser(l4)) != null) {
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
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                    d2Var.R = formatPluralString;
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
                    d2Var.T = formatPluralString2;
                    alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.c2(this) {
                        public final iv0 f24492b;

                        {
                            this.f24492b = this;
                        }

                        @Override
                        public final void f(org.telegram.ui.ActionBar.d2 d2Var2, int i17) {
                            switch (r3) {
                                case 0:
                                    iv0 iv0Var = this.f24492b;
                                    org.telegram.ui.ActionBar.p2 p2Var2 = iv0Var.f24131v1;
                                    zh.i5 storiesController = p2Var2.getMessagesController().getStoriesController();
                                    long j10 = iv0Var.f24106j1;
                                    ArrayList arrayList2 = arrayList;
                                    storiesController.s(j10, arrayList2);
                                    wc.a0(p2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList2.size(), new Object[0])).j();
                                    iv0Var.L(false);
                                    return;
                                default:
                                    iv0 iv0Var2 = this.f24492b;
                                    iv0Var2.getClass();
                                    int i18 = 0;
                                    while (true) {
                                        ArrayList arrayList3 = arrayList;
                                        if (i18 < arrayList3.size()) {
                                            iv0Var2.f24131v1.getMessagesController().deleteSavedDialog(((Long) arrayList3.get(i18)).longValue());
                                            i18++;
                                        } else {
                                            iv0Var2.L(true);
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
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
                        return;
                    }
                    return;
                }
                long j10 = this.f24106j1;
                if (DialogObject.isEncryptedDialog(j10)) {
                    encryptedChat = org.telegram.messenger.a2.m(p2Var.getMessagesController(), j10);
                    user = null;
                    chat = null;
                } else if (DialogObject.isUserDialog(j10)) {
                    user = p2Var.getMessagesController().getUser(Long.valueOf(j10));
                    chat = null;
                    encryptedChat = null;
                } else {
                    chat = p2Var.getMessagesController().getChat(Long.valueOf(-j10));
                    user = null;
                    encryptedChat = null;
                }
                d5.z(p2Var, user, chat, encryptedChat, null, this.f24090c1, null, this.Z0, null, 0, 0, null, new br0(this, 1), null, this.F1);
            } else if (sparseArrayArr[0] != null) {
                if (r0() && (vr0Var = this.U) != null && vr0Var.getCurrentList() != null) {
                    zh.s4 currentList = vr0Var.getCurrentList();
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
                        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f17528a;
                        d2Var2.R = string2;
                        d2Var2.T = LocaleController.formatPluralString("DeleteBotPreviewsSubtitle", arrayList2.size(), new Object[0]);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new androidx.car.app.utils.a(this, currentList, arrayList2, 29));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new gp0(3));
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
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), 0, f6Var);
                    if (arrayList3.size() > 1) {
                        i11 = R.string.DeleteStoriesTitle;
                    } else {
                        i11 = R.string.DeleteStoryTitle;
                    }
                    String string3 = LocaleController.getString(i11);
                    org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.f17528a;
                    d2Var3.R = string3;
                    d2Var3.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList3.size(), new Object[0]);
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2(this) {
                        public final iv0 f24492b;

                        {
                            this.f24492b = this;
                        }

                        @Override
                        public final void f(org.telegram.ui.ActionBar.d2 d2Var22, int i172) {
                            switch (r3) {
                                case 0:
                                    iv0 iv0Var = this.f24492b;
                                    org.telegram.ui.ActionBar.p2 p2Var2 = iv0Var.f24131v1;
                                    zh.i5 storiesController = p2Var2.getMessagesController().getStoriesController();
                                    long j102 = iv0Var.f24106j1;
                                    ArrayList arrayList22 = arrayList3;
                                    storiesController.s(j102, arrayList22);
                                    wc.a0(p2Var2).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList22.size(), new Object[0])).j();
                                    iv0Var.L(false);
                                    return;
                                default:
                                    iv0 iv0Var2 = this.f24492b;
                                    iv0Var2.getClass();
                                    int i182 = 0;
                                    while (true) {
                                        ArrayList arrayList32 = arrayList3;
                                        if (i182 < arrayList32.size()) {
                                            iv0Var2.f24131v1.getMessagesController().deleteSavedDialog(((Long) arrayList32.get(i182)).longValue());
                                            i182++;
                                        } else {
                                            iv0Var2.L(true);
                                            return;
                                        }
                                    }
                            }
                        }
                    });
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new gp0(4));
                    d2Var3.show();
                    d2Var3.h();
                }
            }
        } else if (i10 == 100) {
            if (this.f24095e1 != null && p2Var.getMessagesController().isUserNoForwards(this.f24095e1)) {
                s40 s40Var = this.E1;
                if (s40Var != null) {
                    s40Var.setText(LocaleController.getString(R.string.ForwardsRestrictedInfoUser));
                    this.E1.f(view, true);
                    return;
                }
                return;
            }
            if (this.f24093d1 != null) {
                TLRPC.Chat chat3 = p2Var.getMessagesController().getChat(Long.valueOf(this.f24093d1.f17196id));
                if (p2Var.getMessagesController().isChatNoForwards(chat3)) {
                    s40 s40Var2 = this.E1;
                    if (s40Var2 != null) {
                        if (ChatObject.isChannel(chat3) && !chat3.megagroup) {
                            string = LocaleController.getString(R.string.ForwardsRestrictedInfoChannel);
                        } else {
                            string = LocaleController.getString(R.string.ForwardsRestrictedInfoGroup);
                        }
                        s40Var2.setText(string);
                        this.E1.f(view, true);
                        return;
                    }
                    return;
                }
            }
            if (j0()) {
                s40 s40Var3 = this.E1;
                if (s40Var3 != null) {
                    s40Var3.setText(LocaleController.getString("ForwardsRestrictedInfoBot", R.string.ForwardsRestrictedInfoBot));
                    this.E1.f(view, true);
                    return;
                }
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("canSelectTopics", true);
            bundle.putInt("dialogsType", 3);
            org.telegram.ui.wy wyVar = new org.telegram.ui.wy(bundle);
            wyVar.C2 = new cr0(this);
            p2Var.presentFragment(wyVar);
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
                    TLRPC.Chat chat4 = p2Var.getMessagesController().getChat(Long.valueOf(-dialogId));
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
                    mg.d.a(eoVar, MessagesStorage.TopicKey.of(dialogId, j11));
                    bundle2.putInt("message_id", messageObject.getId());
                }
                p2Var.presentFragment(eoVar, false);
            }
        } else if (i10 == 103 || i10 == 104) {
            if (getClosestTab() == 8) {
                pt0 pt0Var = this.f24089c0;
                if (pt0Var != null && pt0Var.f23089s != null) {
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
            SavedMessagesController savedMessagesController2 = p2Var.getMessagesController().getSavedMessagesController();
            ArrayList<Long> arrayList5 = new ArrayList<>();
            for (int i20 = 0; i20 < savedMessagesController2.allDialogs.size(); i20++) {
                long j12 = savedMessagesController2.allDialogs.get(i20).dialogId;
                if (ru0Var.f26760w.contains(Long.valueOf(j12))) {
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
                p2Var.showDialog(new qg.k0(33, p2Var.getCurrentAccount(), getContext(), p2Var, null));
            } else {
                z11 = true;
                int i21 = 0;
                while (true) {
                    au0[] au0VarArr = this.f24107k0;
                    if (i21 >= au0VarArr.length) {
                        break;
                    }
                    au0 au0Var = au0VarArr[i21];
                    if (au0Var.F == 11) {
                        au0Var.f21598x.h1(0, 0);
                        break;
                    }
                    i21++;
                }
            }
            L(z11);
        }
    }

    public boolean D() {
        return !(this instanceof i40);
    }

    public final boolean E() {
        au0 au0Var;
        au0[] au0VarArr = this.f24107k0;
        if (au0VarArr == null || (au0Var = au0VarArr[0]) == null) {
            return false;
        }
        if (this.f24108k1 && p0(au0Var.F)) {
            return false;
        }
        boolean p02 = p0(au0VarArr[0].F);
        int i10 = this.f24110m1[p02 ? 1 : 0];
        if (i10 == X(p02 ? 1 : 0, i10, false)) {
            return false;
        }
        return true;
    }

    public final void F() {
        xs0 xs0Var = this.I0;
        if (!xs0Var.d(xs0Var.getCurrentTabId())) {
            int firstTabId = xs0Var.getFirstTabId();
            xs0Var.setInitialTabId(firstTabId);
            this.f24107k0[0].F = firstTabId;
            m1(false);
        }
    }

    public final void F0() {
        zh.a5 a5Var;
        zh.a5 a5Var2;
        this.G1.removeAllObservers();
        pt0 pt0Var = this.f24089c0;
        if (pt0Var != null && (a5Var2 = pt0Var.f23089s) != null && a5Var2 != null) {
            a5Var2.z(pt0Var.v);
        }
        ur0 ur0Var = this.f24094e0;
        if (ur0Var != null && (a5Var = ur0Var.f23089s) != null && a5Var != null) {
            a5Var.z(ur0Var.v);
        }
        for (hv0 hv0Var : this.Y1.values()) {
            gv0 gv0Var = hv0Var.f23767c;
            zh.a5 a5Var3 = gv0Var.f23089s;
            if (a5Var3 != null && a5Var3 != null) {
                a5Var3.z(gv0Var.v);
            }
        }
    }

    public final void G(au0 au0Var, vl0 vl0Var, s4.c0 c0Var) {
        int abs;
        int h;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        s4.c1 K;
        MessageObject messageObject;
        zh.a5 a5Var;
        if (!this.f24115o1 && this.J1 == null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (vl0Var.getFastScroll() == null || !vl0Var.getFastScroll().f22171n || currentTimeMillis - au0Var.f21590a >= 300) {
                au0Var.f21590a = currentTimeMillis;
                if ((!this.V0 || !this.U0 || au0Var.F == 11) && au0Var.F != 7) {
                    int L0 = c0Var.L0();
                    if (L0 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(c0Var.N0() - L0) + 1;
                    }
                    if (vl0Var.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = vl0Var.getAdapter().h();
                    }
                    int i15 = au0Var.F;
                    int[] iArr = this.f24110m1;
                    xu0[] xu0VarArr = this.f24127t1;
                    if (i15 == 0 || i15 == 1 || i15 == 2 || i15 == 4) {
                        h = xu0VarArr[i15].d() + xu0VarArr[i15].f29156a.size();
                        xu0 xu0Var = xu0VarArr[i15];
                        if (xu0Var.h && xu0Var.e.size() > 2 && au0Var.F == 0 && xu0VarArr[i15].f29156a.size() != 0) {
                            if (i15 == 0) {
                                i10 = iArr[0];
                            } else {
                                i10 = 1;
                            }
                            float f7 = i10;
                            int measuredHeight = (int) ((vl0Var.getMeasuredHeight() / (vl0Var.getMeasuredWidth() / f7)) * f7 * 1.5f);
                            if (measuredHeight < 100) {
                                measuredHeight = 100;
                            }
                            if (measuredHeight < ((fu0) xu0VarArr[i15].e.get(1)).f23084b) {
                                measuredHeight = ((fu0) xu0VarArr[i15].e.get(1)).f23084b;
                            }
                            if ((L0 > h && L0 - h > measuredHeight) || ((i11 = L0 + abs) < xu0VarArr[i15].f29165m && xu0VarArr[0].f29165m - i11 > measuredHeight)) {
                                my myVar = new my(this, i15, vl0Var, 10);
                                this.J1 = myVar;
                                AndroidUtilities.runOnUIThread(myVar);
                                return;
                            }
                        }
                    }
                    int i16 = au0Var.F;
                    if (i16 != 7) {
                        if (p0(i16)) {
                            fv0 k12 = k1(au0Var.F);
                            if (k12 != null && (a5Var = k12.f23089s) != null && L0 + abs > a5Var.i() - iArr[1]) {
                                k12.P();
                                return;
                            }
                            return;
                        }
                        int i17 = au0Var.F;
                        if (i17 == 6) {
                            if (abs > 0) {
                                st0 st0Var = this.P;
                                boolean z10 = st0Var.h;
                                ArrayList arrayList = st0Var.d;
                                if (!z10 && !st0Var.e && !arrayList.isEmpty() && L0 + abs >= h - 5) {
                                    st0.E(st0Var, ((TLRPC.Chat) hc.b.i(1, arrayList)).f17195id);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.p2 p2Var = this.f24131v1;
                        if (i17 == 11) {
                            int i18 = -1;
                            for (int i19 = 0; i19 < au0Var.h.getChildCount(); i19++) {
                                View childAt = au0Var.h.getChildAt(i19);
                                au0Var.h.getClass();
                                i18 = Math.max(RecyclerView.R(childAt), i18);
                            }
                            s4.h0 adapter = au0Var.h.getAdapter();
                            tu0 tu0Var = this.S;
                            if (adapter == tu0Var) {
                                if (i18 + 1 >= tu0Var.h.size() + tu0Var.e.size() && !tu0Var.f27491s && !tu0Var.f27490r) {
                                    tu0Var.f27490r = true;
                                    tu0Var.F();
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
                            if (abs + L0 > h - i12 || xu0VarArr[i13].f29167o) {
                                xu0 xu0Var2 = xu0VarArr[i13];
                                if (!xu0Var2.f29160g) {
                                    if (i17 == 0) {
                                        int i20 = xu0VarArr[0].f29169q;
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
                                    boolean[] zArr = xu0Var2.f29161i;
                                    if (!zArr[0]) {
                                        xu0Var2.f29160g = true;
                                        p2Var.getMediaDataController().loadMedia(this.f24106j1, 50, xu0VarArr[i13].f29162j[0], 0, i14, this.F, 1, p2Var.getClassGuid(), xu0VarArr[i13].f29168p, null, null);
                                    } else if (this.f24090c1 != 0 && !zArr[1]) {
                                        xu0Var2.f29160g = true;
                                        p2Var.getMediaDataController().loadMedia(this.f24090c1, 50, xu0VarArr[i13].f29162j[1], 0, i14, this.F, 1, p2Var.getClassGuid(), xu0VarArr[i13].f29168p, null, null);
                                    }
                                }
                            }
                            int i21 = xu0VarArr[i13].f29165m;
                            if (i13 == 0) {
                                i21 = this.H.L(0);
                            }
                            if (L0 - i21 < i12 + 1) {
                                xu0 xu0Var3 = xu0VarArr[i13];
                                if (!xu0Var3.f29160g && !xu0Var3.f29164l && !xu0Var3.f29167o) {
                                    A0(au0Var.F);
                                }
                            }
                            au0 au0Var2 = this.f24107k0[0];
                            if (au0Var2.h == vl0Var) {
                                int i22 = au0Var2.F;
                                if ((i22 == 0 || i22 == 5) && L0 != -1 && (K = vl0Var.K(L0)) != null) {
                                    int i23 = K.f41613f;
                                    if (i23 == 0 || i23 == 12) {
                                        View view = K.f41610a;
                                        boolean z11 = view instanceof org.telegram.ui.Cells.v7;
                                        org.telegram.ui.Cells.w0 w0Var = this.K0;
                                        if (z11) {
                                            org.telegram.ui.Cells.v7 v7Var = (org.telegram.ui.Cells.v7) view;
                                            if (v7Var.e <= 0) {
                                                messageObject = null;
                                            } else {
                                                messageObject = v7Var.f20560b[0];
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
        if (messageObject != null && !this.f24115o1) {
            cs0 cs0Var = this.W;
            if (cs0Var == null || !cs0Var.f33253w) {
                int i14 = 0;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                i14 = 0;
                String str2 = null;
                zh.a5 a5Var = null;
                boolean z15 = true;
                if (this.C1) {
                    int i15 = 8;
                    if (i11 != 8 || C()) {
                        if (messageObject.getDialogId() == this.f24106j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        SparseArray[] sparseArrayArr = this.Z0;
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            sparseArrayArr[c10].remove(messageObject.getId());
                            if (!messageObject.canDeleteMessage(false, null)) {
                                this.f24083a1--;
                            }
                        } else {
                            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                                sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                                if (!messageObject.canDeleteMessage(false, null)) {
                                    this.f24083a1++;
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
                            if (this.f24083a1 == 0) {
                                i12 = 0;
                            } else {
                                i12 = 8;
                            }
                            this.f24109l0.setVisibility(i12);
                            org.telegram.ui.ActionBar.w0 w0Var = this.f24128u0;
                            if (w0Var != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14 && sparseArrayArr[0].size() == 1) {
                                    i13 = 0;
                                } else {
                                    i13 = 8;
                                }
                                w0Var.setVisibility(i13);
                            }
                            org.telegram.ui.ActionBar.w0 w0Var2 = this.f24126t0;
                            if (w0Var2 != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                                    i15 = 0;
                                }
                                w0Var2.setVisibility(i15);
                            }
                            u1();
                        }
                        this.f24086b1 = false;
                        if (view instanceof org.telegram.ui.Cells.l7) {
                            org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z10 = true;
                            }
                            l7Var.b(z10, true);
                        } else if (view instanceof org.telegram.ui.Cells.v7) {
                            org.telegram.ui.Cells.v7 v7Var = (org.telegram.ui.Cells.v7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) < 0) {
                                z15 = false;
                            }
                            v7Var.b(0, z15);
                        } else if (view instanceof org.telegram.ui.Cells.o7) {
                            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            o7Var.f(z11, true);
                        } else if (view instanceof org.telegram.ui.Cells.k7) {
                            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z12 = true;
                            }
                            k7Var.e(z12, true);
                        } else if (view instanceof org.telegram.ui.Cells.e2) {
                            org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z13 = true;
                            }
                            e2Var.c(z13, true);
                        } else if (view instanceof org.telegram.ui.Cells.u7) {
                            org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z14 = true;
                            }
                            u7Var.i(z14, true);
                        }
                    } else {
                        return;
                    }
                } else {
                    hs0 hs0Var = this.f24122r1;
                    xu0[] xu0VarArr = this.f24127t1;
                    org.telegram.ui.ActionBar.p2 p2Var = this.f24131v1;
                    if (i11 == 0) {
                        xu0 xu0Var = xu0VarArr[i11];
                        int i16 = i10 - xu0Var.f29165m;
                        if (i16 >= 0 && i16 < xu0Var.f29156a.size()) {
                            PhotoViewer.t1().K2(null, p2Var, null);
                            PhotoViewer.t1().a2(xu0VarArr[i11].f29156a, i16, this.f24106j1, this.f24090c1, this.F, hs0Var);
                        }
                    } else if (i11 != 2 && i11 != 4) {
                        if (i11 == 5) {
                            PhotoViewer.t1().K2(null, p2Var, null);
                            int indexOf = xu0VarArr[i11].f29156a.indexOf(messageObject);
                            if (indexOf < 0) {
                                PhotoViewer.t1().a2(org.telegram.messenger.a2.l(messageObject), 0, 0L, 0L, 0L, hs0Var);
                            } else {
                                PhotoViewer.t1().a2(xu0VarArr[i11].f29156a, indexOf, this.f24106j1, this.f24090c1, this.F, hs0Var);
                            }
                        } else if (i11 == 1) {
                            if (view instanceof org.telegram.ui.Cells.l7) {
                                org.telegram.ui.Cells.l7 l7Var2 = (org.telegram.ui.Cells.l7) view;
                                TLRPC.Document document = messageObject.getDocument();
                                if (l7Var2.G) {
                                    if (messageObject.canPreviewDocument()) {
                                        PhotoViewer.t1().K2(null, p2Var, null);
                                        int indexOf2 = xu0VarArr[i11].f29156a.indexOf(messageObject);
                                        if (indexOf2 < 0) {
                                            PhotoViewer.t1().a2(org.telegram.messenger.a2.l(messageObject), 0, 0L, 0L, 0L, hs0Var);
                                            return;
                                        }
                                        PhotoViewer.t1().a2(xu0VarArr[i11].f29156a, indexOf2, this.f24106j1, this.f24090c1, this.F, hs0Var);
                                        return;
                                    }
                                    AndroidUtilities.openDocument(messageObject, p2Var.getParentActivity(), p2Var);
                                } else if (!l7Var2.F) {
                                    MessageObject message = l7Var2.getMessage();
                                    message.putInDownloadsStore = true;
                                    p2Var.getFileLoader().loadFile(document, message, 0, 0);
                                    l7Var2.f(true);
                                } else {
                                    p2Var.getFileLoader().cancelLoadFile(document);
                                    l7Var2.f(true);
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
                                            p2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                            return;
                                        }
                                        return;
                                    }
                                    String str3 = webPage.embed_url;
                                    if (str3 != null && str3.length() != 0) {
                                        zu.J(p2Var, messageObject, this.f24122r1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                        return;
                                    }
                                    str = webPage.url;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    ArrayList arrayList = ((org.telegram.ui.Cells.o7) view).E;
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
                            fv0 k12 = k1(i11);
                            if (k12 != null) {
                                a5Var = k12.f23089s;
                            }
                            if (a5Var != null) {
                                zh.u7 orCreateStoryViewer = p2Var.getOrCreateStoryViewer();
                                Context context = getContext();
                                int id2 = messageObject.getId();
                                zh.s5 a2 = zh.s5.a(this.f24107k0[0].h);
                                a2.e = new pv(a5Var, 18);
                                if ((p2Var instanceof ProfileActivity) && ((ProfileActivity) p2Var).f30477s1) {
                                    i14 = AndroidUtilities.dp(68.0f);
                                }
                                a2.f48871s += i14;
                                orCreateStoryViewer.C(context, id2, a5Var, a2);
                            } else {
                                return;
                            }
                        }
                    } else if (view instanceof org.telegram.ui.Cells.k7) {
                        ((org.telegram.ui.Cells.k7) view).a();
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
        vr0 vr0Var;
        float f10;
        boolean z11;
        au0[] au0VarArr = this.f24107k0;
        int i10 = au0VarArr[0].F;
        if (i10 == 13 && (vr0Var = this.U) != null) {
            View currentView = vr0Var.f446n.getCurrentView();
            if (currentView instanceof ai.a0) {
                ai.a0 a0Var = (ai.a0) currentView;
                ai.r rVar = a0Var.v;
                ai.o oVar = a0Var.f414f;
                if (a0Var.f411a != null && a0Var.getParent() != null) {
                    if (!a0Var.f412b || a0Var.K) {
                        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                            if (motionEvent.getActionMasked() == 2 && (a0Var.K || a0Var.M)) {
                                int i11 = -1;
                                int i12 = -1;
                                for (int i13 = 0; i13 < motionEvent.getPointerCount(); i13++) {
                                    if (a0Var.N == motionEvent.getPointerId(i13)) {
                                        i11 = i13;
                                    }
                                    if (a0Var.O == motionEvent.getPointerId(i13)) {
                                        i12 = i13;
                                    }
                                }
                                if (i11 != -1 && i12 != -1) {
                                    float hypot = ((float) Math.hypot(motionEvent.getX(i12) - motionEvent.getX(i11), motionEvent.getY(i12) - motionEvent.getY(i11))) / a0Var.P;
                                    a0Var.Q = hypot;
                                    if (!a0Var.K && (hypot > 1.01f || hypot < 0.99f)) {
                                        a0Var.K = true;
                                        if (hypot > 1.0f) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        a0Var.R = z11;
                                        a0Var.b(z11);
                                    }
                                    if (a0Var.K) {
                                        boolean z12 = a0Var.R;
                                        if ((z12 && a0Var.Q < 1.0f) || (!z12 && a0Var.Q > 1.0f)) {
                                            a0Var.f413c = 0.0f;
                                        } else {
                                            if (z12) {
                                                f10 = org.telegram.messenger.a2.y(2.0f, a0Var.Q, 1.0f, 1.0f);
                                            } else {
                                                f10 = (1.0f - a0Var.Q) / 0.5f;
                                            }
                                            a0Var.f413c = Math.max(0.0f, Math.min(1.0f, f10));
                                        }
                                        float f11 = a0Var.f413c;
                                        int i14 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
                                        if (i14 == 0 || f11 == 0.0f) {
                                            if (i14 == 0) {
                                                int i15 = a0Var.e;
                                                int ceil = (((int) Math.ceil(a0Var.S / a0Var.e)) * i15) + ((int) ((a0Var.W.G.f24142z1 / (oVar.getMeasuredWidth() - ((int) (oVar.getMeasuredWidth() / a0Var.e)))) * (i15 - 1)));
                                                if (ceil >= rVar.h()) {
                                                    ceil = rVar.h() - 1;
                                                }
                                                a0Var.S = ceil;
                                            }
                                            a0Var.a();
                                            if (a0Var.f413c == 0.0f) {
                                                a0Var.R = !a0Var.R;
                                            }
                                            a0Var.b(a0Var.R);
                                            a0Var.P = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                        }
                                        oVar.invalidate();
                                    }
                                } else {
                                    a0Var.L = false;
                                    a0Var.M = false;
                                    a0Var.K = false;
                                    a0Var.a();
                                    return false;
                                }
                            } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((a0Var.N == motionEvent.getPointerId(0) && a0Var.O == motionEvent.getPointerId(1)) || (a0Var.N == motionEvent.getPointerId(1) && a0Var.O == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && a0Var.K) {
                                a0Var.M = false;
                                a0Var.L = false;
                                a0Var.K = false;
                                a0Var.a();
                            }
                        } else {
                            if (a0Var.L && !a0Var.K && motionEvent.getPointerCount() == 2) {
                                a0Var.P = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                a0Var.Q = 1.0f;
                                a0Var.N = motionEvent.getPointerId(0);
                                a0Var.O = motionEvent.getPointerId(1);
                                oVar.I0(false);
                                oVar.cancelLongPress();
                                oVar.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                View view = (View) a0Var.getParent();
                                a0Var.U = (int) ((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - a0Var.getX());
                                int y3 = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - a0Var.getY());
                                int i16 = a0Var.U;
                                Rect rect = a0Var.V;
                                a0Var.S = -1;
                                int i17 = y3 + oVar.X2;
                                for (int i18 = 0; i18 < oVar.getChildCount(); i18++) {
                                    View childAt = oVar.getChildAt(i18);
                                    childAt.getHitRect(rect);
                                    if (rect.contains(i16, i17)) {
                                        a0Var.S = RecyclerView.S(childAt);
                                        a0Var.T = childAt.getTop();
                                    }
                                }
                                a0Var.M = true;
                            }
                            if (motionEvent.getActionMasked() == 0 && (motionEvent.getY() - ((View) a0Var.getParent()).getY()) - a0Var.getY() > 0.0f) {
                                a0Var.L = true;
                            }
                        }
                        return a0Var.K;
                    }
                    return true;
                }
            }
            return false;
        }
        if ((i10 == 0 || p0(i10)) && getParent() != null) {
            if (!this.f24115o1 || this.f24081a) {
                if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
                    if (motionEvent.getActionMasked() == 2 && (this.f24081a || this.f24088c)) {
                        int i19 = -1;
                        int i20 = -1;
                        for (int i21 = 0; i21 < motionEvent.getPointerCount(); i21++) {
                            if (this.e == motionEvent.getPointerId(i21)) {
                                i19 = i21;
                            }
                            if (this.f24096f == motionEvent.getPointerId(i21)) {
                                i20 = i21;
                            }
                        }
                        if (i19 != -1 && i20 != -1) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(i20) - motionEvent.getX(i19), motionEvent.getY(i20) - motionEvent.getY(i19))) / this.h;
                            this.f24111n = hypot2;
                            if (!this.f24081a && (hypot2 > 1.01f || hypot2 < 0.99f)) {
                                this.f24081a = true;
                                if (hypot2 > 1.0f) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                this.f24120r = z10;
                                e1(z10);
                            }
                            if (this.f24081a) {
                                boolean z13 = this.f24120r;
                                if ((z13 && this.f24111n < 1.0f) || (!z13 && this.f24111n > 1.0f)) {
                                    this.f24113n1 = 0.0f;
                                } else {
                                    if (z13) {
                                        f7 = org.telegram.messenger.a2.y(2.0f, this.f24111n, 1.0f, 1.0f);
                                    } else {
                                        f7 = (1.0f - this.f24111n) / 0.5f;
                                    }
                                    this.f24113n1 = Math.max(0.0f, Math.min(1.0f, f7));
                                }
                                float f12 = this.f24113n1;
                                if (f12 == 1.0f || f12 == 0.0f) {
                                    if (p0(this.f24117p1)) {
                                        h0Var = k1(this.f24117p1);
                                    } else {
                                        h0Var = this.H;
                                    }
                                    if (this.f24113n1 == 1.0f) {
                                        int i22 = this.f24119q1;
                                        int ceil2 = (((int) Math.ceil(this.f24123s / this.f24119q1)) * i22) + ((int) ((this.f24142z1 / (au0VarArr[0].h.getMeasuredWidth() - ((int) (au0VarArr[0].h.getMeasuredWidth() / this.f24119q1)))) * (i22 - 1)));
                                        if (ceil2 >= h0Var.h()) {
                                            ceil2 = h0Var.h() - 1;
                                        }
                                        this.f24123s = ceil2;
                                    }
                                    T();
                                    if (this.f24113n1 == 0.0f) {
                                        this.f24120r = !this.f24120r;
                                    }
                                    e1(this.f24120r);
                                    this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                au0VarArr[0].h.invalidate();
                                au0 au0Var = au0VarArr[0];
                                if (au0Var.G != null) {
                                    au0Var.invalidate();
                                }
                            }
                        } else {
                            this.f24084b = false;
                            this.f24088c = false;
                            this.f24081a = false;
                            T();
                            return false;
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.e == motionEvent.getPointerId(0) && this.f24096f == motionEvent.getPointerId(1)) || (this.e == motionEvent.getPointerId(1) && this.f24096f == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.f24081a) {
                        this.f24088c = false;
                        this.f24084b = false;
                        this.f24081a = false;
                        T();
                    }
                } else {
                    if (this.f24084b && !this.f24081a && motionEvent.getPointerCount() == 2) {
                        this.h = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.f24111n = 1.0f;
                        this.e = motionEvent.getPointerId(0);
                        this.f24096f = motionEvent.getPointerId(1);
                        au0VarArr[0].h.I0(false);
                        au0VarArr[0].h.cancelLongPress();
                        au0VarArr[0].h.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.f24132w = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - au0VarArr[0].getX());
                        int y10 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - au0VarArr[0].getY());
                        int i23 = this.f24132w;
                        this.f24123s = -1;
                        int i24 = y10 + au0VarArr[0].h.X2;
                        if (getY() != 0.0f && this.E == 1) {
                            i24 = 0;
                        }
                        for (int i25 = 0; i25 < au0VarArr[0].h.getChildCount(); i25++) {
                            View childAt2 = au0VarArr[0].h.getChildAt(i25);
                            Rect rect2 = this.f24135x;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i23, i24)) {
                                au0VarArr[0].h.getClass();
                                this.f24123s = RecyclerView.S(childAt2);
                                this.v = childAt2.getTop();
                            }
                        }
                        if (this.D1.T() && this.f24123s == -1) {
                            this.f24123s = (int) (((this.f24110m1[p0(au0VarArr[0].F) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i23 / au0VarArr[0].h.getMeasuredWidth(), 0.0f))) + au0VarArr[0].f21598x.L0());
                            this.v = 0;
                        }
                        this.f24088c = true;
                    }
                    if (motionEvent.getActionMasked() == 0 && ((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - au0VarArr[0].getY() > 0.0f) {
                        this.f24084b = true;
                    }
                }
                return this.f24081a;
            }
            return true;
        }
        return false;
    }

    public final boolean H0(MessageObject messageObject, View view, int i10, boolean z10) {
        cs0 cs0Var;
        char c10;
        int i11;
        int i12;
        final TL_stories.StoryItem storyItem;
        pt0 pt0Var;
        zh.a5 a5Var;
        if (!this.C1) {
            org.telegram.ui.ActionBar.p2 p2Var = this.f24131v1;
            if (p2Var.getParentActivity() != null && messageObject != null && ((cs0Var = this.W) == null || !cs0Var.f33253w)) {
                AndroidUtilities.hideKeyboard(p2Var.getParentActivity().getCurrentFocus());
                long j3 = this.f24106j1;
                int i13 = 8;
                if (z10 && ((w0(getClosestTab()) || getClosestTab() == 8) && !this.C1)) {
                    if (view instanceof org.telegram.ui.Cells.u7) {
                        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                        u7Var.k(u7Var.f20509n, u7Var.f20514r, true);
                    }
                    TL_stories.StoryItem storyItem2 = messageObject.storyItem;
                    if (storyItem2 != null) {
                        HashSet hashSet = new HashSet();
                        ArrayList<Integer> arrayList = storyItem2.albums;
                        if (arrayList != null) {
                            hashSet.addAll(arrayList);
                        }
                        boolean w02 = w0(getClosestTab());
                        w70 I = w70.I(p2Var, view);
                        w70 J = I.J();
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new org.telegram.ui.mu0(I, 25), false);
                        J.k();
                        w70.f(J, getStoriesController().B(j3, true), hashSet, true, new gf(this, storyItem2, I, 21), new gg.u1(this, hashSet, storyItem2, I, 7));
                        I.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddToAlbum), new di.p2(I, J, 9), false);
                        I.k();
                        I.c(R.drawable.msg_select, LocaleController.getString(R.string.StoriesAlbumMenuSelect), new di.q(this, messageObject, view, i10, 23), false);
                        if (w02) {
                            int h12 = h1(getClosestTab());
                            String w10 = getStoriesController().w(h12, j3);
                            I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new zd(this, h12, 6), false);
                            storyItem = storyItem2;
                            I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.StoriesAlbumMenuRemoveFromAlbum), new di.q(this, h12, storyItem, w10, 24), false);
                        } else {
                            storyItem = storyItem2;
                            if (getClosestTab() == 8 && (pt0Var = this.f24089c0) != null && (a5Var = pt0Var.f23089s) != null) {
                                if (a5Var.m(storyItem.f17435id)) {
                                    I.c(R.drawable.chats_unpin, LocaleController.getString(R.string.StoriesAlbumMenuUnpin), new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r1) {
                                                case 0:
                                                    iv0 iv0Var = this;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(iv0Var.getContext(), 0, iv0Var.F1);
                                                    alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                    alertDialog$Builder.f17528a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kr0(iv0Var, storyItem));
                                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new gp0(5));
                                                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                                                    d2Var.show();
                                                    d2Var.h();
                                                    return;
                                                case 1:
                                                    iv0 iv0Var2 = this;
                                                    iv0Var2.getClass();
                                                    iv0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f17435id))), false);
                                                    return;
                                                case 2:
                                                    iv0 iv0Var3 = this;
                                                    iv0Var3.getClass();
                                                    iv0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f17435id))), true);
                                                    return;
                                                default:
                                                    iv0.h(this, storyItem);
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
                                                    iv0 iv0Var = this;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(iv0Var.getContext(), 0, iv0Var.F1);
                                                    alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                                    alertDialog$Builder.f17528a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kr0(iv0Var, storyItem));
                                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new gp0(5));
                                                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                                                    d2Var.show();
                                                    d2Var.h();
                                                    return;
                                                case 1:
                                                    iv0 iv0Var2 = this;
                                                    iv0Var2.getClass();
                                                    iv0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f17435id))), false);
                                                    return;
                                                case 2:
                                                    iv0 iv0Var3 = this;
                                                    iv0Var3.getClass();
                                                    iv0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f17435id))), true);
                                                    return;
                                                default:
                                                    iv0.h(this, storyItem);
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
                                            iv0 iv0Var = this;
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(iv0Var.getContext(), 0, iv0Var.F1);
                                            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                            alertDialog$Builder.f17528a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kr0(iv0Var, storyItem));
                                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new gp0(5));
                                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                                            d2Var.show();
                                            d2Var.h();
                                            return;
                                        case 1:
                                            iv0 iv0Var2 = this;
                                            iv0Var2.getClass();
                                            iv0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f17435id))), false);
                                            return;
                                        case 2:
                                            iv0 iv0Var3 = this;
                                            iv0Var3.getClass();
                                            iv0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f17435id))), true);
                                            return;
                                        default:
                                            iv0.h(this, storyItem);
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
                                        iv0 iv0Var = this;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(iv0Var.getContext(), 0, iv0Var.F1);
                                        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.DeleteStoryTitle);
                                        alertDialog$Builder.f17528a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kr0(iv0Var, storyItem));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new gp0(5));
                                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                                        d2Var.show();
                                        d2Var.h();
                                        return;
                                    case 1:
                                        iv0 iv0Var2 = this;
                                        iv0Var2.getClass();
                                        iv0Var2.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f17435id))), false);
                                        return;
                                    case 2:
                                        iv0 iv0Var3 = this;
                                        iv0Var3.getClass();
                                        iv0Var3.T0(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.f17435id))), true);
                                        return;
                                    default:
                                        iv0.h(this, storyItem);
                                        return;
                                }
                            }
                        }, true);
                        I.f28683i = 3;
                        I.f28703u = true;
                        I.v = true;
                        I.L = true;
                        I.M = 3;
                        Point point = AndroidUtilities.displaySize;
                        Point point2 = AndroidUtilities.displaySize;
                        int min = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point2.x, point2.y) * 0.4333f) * 3.0f) / 4.0f));
                        I.N = min;
                        I.O = (min * 4) / 3;
                        I.f28702t = true;
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
                        this.f24083a1++;
                    }
                    if (this.f24083a1 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    this.f24109l0.setVisibility(i11);
                    org.telegram.ui.ActionBar.w0 w0Var = this.f24128u0;
                    if (w0Var != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i12 = 0;
                        } else {
                            i12 = 8;
                        }
                        w0Var.setVisibility(i12);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.f24126t0;
                    if (w0Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i13 = 0;
                        }
                        w0Var2.setVisibility(i13);
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
                    this.f24086b1 = false;
                    if (view instanceof org.telegram.ui.Cells.l7) {
                        ((org.telegram.ui.Cells.l7) view).b(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.v7) {
                        ((org.telegram.ui.Cells.v7) view).b(i10, true);
                    } else if (view instanceof org.telegram.ui.Cells.o7) {
                        ((org.telegram.ui.Cells.o7) view).f(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.k7) {
                        ((org.telegram.ui.Cells.k7) view).e(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.e2) {
                        ((org.telegram.ui.Cells.e2) view).c(true, true);
                    } else if (view instanceof org.telegram.ui.Cells.u7) {
                        ((org.telegram.ui.Cells.u7) view).i(true, true);
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
        au0[] au0VarArr = this.f24107k0;
        au0 au0Var = au0VarArr[0];
        if (au0Var != null && au0VarArr[1] != null) {
            float f10 = 0.0f;
            cs0 cs0Var = this.W;
            if (cs0Var != null) {
                if (p0(au0Var.F) && au0VarArr[0].F != 9) {
                    c10 = 1;
                } else {
                    c10 = 0;
                }
                if (au0VarArr[1].getVisibility() == 0) {
                    if (p0(au0VarArr[1].F) && au0VarArr[1].F != 9) {
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
                        measuredWidth = au0VarArr[0].getMeasuredWidth();
                    }
                    cs0Var.setTranslationX(measuredWidth);
                } else {
                    cs0Var.setTranslationX(au0VarArr[c10 ^ 1].getTranslationX());
                    abs = 1.0f - (Math.abs(cs0Var.getTranslationX()) / cs0Var.getMeasuredWidth());
                }
                float f11 = 0.0f;
                for (int i10 = 0; i10 < au0VarArr.length; i10++) {
                    if (au0VarArr[i10].getVisibility() == 0) {
                        gs0 gs0Var = au0VarArr[i10].h;
                        if (gs0Var.getChildCount() == 0) {
                            childAt = null;
                        } else {
                            childAt = gs0Var.getChildAt(0);
                        }
                        if (childAt == null) {
                            R = -1;
                        } else {
                            R = RecyclerView.R(childAt);
                        }
                        if (R == 0) {
                            f7 = childAt.getY() - gs0Var.getPaddingTop();
                        } else if (gs0Var.getChildCount() == 0) {
                            f7 = 0.0f;
                        } else {
                            f7 = -AndroidUtilities.dp(48.0f);
                        }
                        f11 += Utilities.clamp01(1.0f - (au0VarArr[i10].getTranslationX() / au0VarArr[i10].getMeasuredWidth())) * f7;
                    }
                }
                float clamp01 = Utilities.clamp01(1.0f - ((-f11) / AndroidUtilities.dpf2(48.0f)));
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
                cs0Var.setAlpha(clamp01);
                cs0Var.setScaleX(lerp);
                cs0Var.setScaleY(lerp);
                cs0Var.setTranslationY(this.K1 + f11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.iv0.J():boolean");
    }

    public final void J0(float f7) {
        int i10;
        int i11;
        au0[] au0VarArr = this.f24107k0;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i12 != 0 || au0VarArr[1].getVisibility() == 0) {
            if (this.f24102h1) {
                au0 au0Var = au0VarArr[0];
                au0Var.setTranslationX((-f7) * au0Var.getMeasuredWidth());
                au0VarArr[1].setTranslationX(au0VarArr[0].getMeasuredWidth() - (au0VarArr[0].getMeasuredWidth() * f7));
            } else {
                au0 au0Var2 = au0VarArr[0];
                au0Var2.setTranslationX(au0Var2.getMeasuredWidth() * f7);
                au0VarArr[1].setTranslationX((au0VarArr[0].getMeasuredWidth() * f7) - au0VarArr[0].getMeasuredWidth());
            }
            M0(getTabProgress());
            float a02 = a0(f7);
            this.f24116p0 = a02;
            int i13 = 4;
            if (a02 != 0.0f && D() && !q0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            this.f24121r0.setVisibility(i10);
            org.telegram.ui.ActionBar.w0 w0Var = this.f24112n0;
            if (w0Var != null && !D()) {
                if (v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                w0Var.setVisibility(i11);
                this.f24114o0 = 0.0f;
            } else {
                this.f24114o0 = b0(f7);
                t1();
            }
            q1(false);
            if (i12 == 0) {
                au0 au0Var3 = au0VarArr[0];
                au0VarArr[0] = au0VarArr[1];
                au0VarArr[1] = au0Var3;
                au0Var3.setVisibility(8);
                if (w0Var != null && this.f24136x0 == 2) {
                    if (v0()) {
                        i13 = 8;
                    }
                    w0Var.setVisibility(i13);
                }
                this.f24136x0 = 0;
                f1();
            }
        }
    }

    public final void K() {
        qs qsVar = this.P0;
        if (qsVar != null) {
            cs0 cs0Var = this.W;
            float f7 = 0.0f;
            if (cs0Var != null) {
                f7 = 0.0f + (cs0Var.getVisibilityFactor() * AndroidUtilities.dp(38.0f) * (1.0f - Math.abs(cs0Var.getTranslationX() / cs0Var.getMeasuredWidth())));
            }
            qsVar.setTranslationY(this.K1 + f7);
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
        this.f24083a1 = 0;
        D0(sparseArrayArr[0]);
        vr0 vr0Var = this.U;
        if (vr0Var != null) {
            vr0Var.h();
            vr0Var.j();
        }
        b1(false);
        r1(z10);
        ru0 ru0Var = this.R;
        if (ru0Var != null) {
            ru0Var.f26760w.clear();
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
        dv0 dv0Var = this.f24094e0.f23090w;
        if (dv0Var != null) {
            if (z10 && getClosestTab() == 9) {
                z13 = true;
            } else {
                z13 = false;
            }
            dv0Var.b(z13);
        }
        dv0 dv0Var2 = this.f24089c0.f23090w;
        if (dv0Var2 != null) {
            if (z10 && getClosestTab() == 8) {
                z12 = true;
            } else {
                z12 = false;
            }
            dv0Var2.b(z12);
        }
        for (hv0 hv0Var : this.Y1.values()) {
            gv0 gv0Var = hv0Var.f23767c;
            if (gv0Var.f23089s != null) {
                dv0 dv0Var3 = gv0Var.f23090w;
                if (z10 && getClosestTab() == hv0Var.f23765a) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                dv0Var3.b(z11);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.f24112n0;
        if (w0Var != null) {
            us0 us0Var = this.J0;
            if (us0Var != null && us0Var.a() && getSelectedTab() == 11) {
                i10 = R.string.SavedTagSearchHint;
            } else {
                i10 = R.string.Search;
            }
            w0Var.setSearchFieldHint(LocaleController.getString(i10));
        }
        I();
    }

    public void M0(float f7) {
        E0();
    }

    public boolean N() {
        return this instanceof i40;
    }

    public final boolean O(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x10 = (-view.getX()) - getX();
        au0[] au0VarArr = this.f24107k0;
        motionEvent.offsetLocation(x10 - au0VarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - au0VarArr[0].getY()) - au0VarArr[0].h.getFastScroll().getY());
        return au0VarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public final void O0(org.telegram.ui.ActionBar.p2 p2Var, long j3, int i10) {
        new org.telegram.ui.z71(p2Var, j3, this.f24110m1[1], new sc(this, j3, i10)).show();
    }

    public void P(Canvas canvas, float f7, Rect rect, Paint paint) {
        canvas.drawRect(rect, paint);
    }

    public final void P0(org.telegram.ui.ActionBar.p2 p2Var, long j3, int i10) {
        d5.v0(p2Var, LocaleController.getString(R.string.Delete), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesAlbumMenuDeleteAlbumAsk, getStoriesController().w(i10, j3))), LocaleController.getString(R.string.Delete), true, new org.telegram.messenger.t5(this, j3, i10, 6));
    }

    public final void Q(Canvas canvas, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            au0[] au0VarArr = this.f24107k0;
            if (i10 < au0VarArr.length) {
                au0 au0Var = au0VarArr[i10];
                if (au0Var != null && au0Var.getVisibility() == 0) {
                    for (int i11 = 0; i11 < au0VarArr[i10].h.getChildCount(); i11++) {
                        View childAt = au0VarArr[i10].h.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + au0VarArr[i10].h.X2) {
                            int save = canvas.save();
                            canvas.translate(childAt.getX() + au0VarArr[i10].getX(), childAt.getY() + au0VarArr[i10].h.getY() + au0VarArr[i10].getY() + getY());
                            childAt.draw(canvas);
                            if (arrayList != null && (childAt instanceof xv0)) {
                                arrayList.add((xv0) childAt);
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

    public final void Q0(org.telegram.ui.ActionBar.p2 p2Var, long j3, int i10) {
        String w10 = getStoriesController().w(i10, j3);
        Context context = p2Var.getContext();
        org.telegram.ui.ActionBar.f6 resourceProvider = p2Var.getResourceProvider();
        j2.c cVar = new j2.c(this, j3, i10);
        Pattern pattern = d5.f22289a;
        d5.R(context, p2Var, LocaleController.getString(R.string.StoriesAlbumRename), LocaleController.getString(R.string.StoriesAlbumRenameHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), w10, 12, LocaleController.getString(R.string.Rename), resourceProvider, cVar);
    }

    public final boolean R(int i10) {
        xu0[] xu0VarArr = this.f24129u1.f21614n;
        if (xu0VarArr == null) {
            return false;
        }
        xu0[] xu0VarArr2 = this.f24127t1;
        if (i10 == 0) {
            xu0 xu0Var = xu0VarArr2[i10];
            if (!xu0Var.h) {
                int[] iArr = xu0Var.f29159f;
                int[] iArr2 = xu0VarArr[i10].f29159f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = xu0VarArr2[i10].f29159f;
            int[] iArr4 = xu0VarArr[i10].f29159f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        xu0VarArr2[i10].f29156a.addAll(xu0VarArr[i10].f29156a);
        xu0VarArr2[i10].f29158c.addAll(xu0VarArr[i10].f29158c);
        for (Map.Entry entry : xu0VarArr[i10].d.entrySet()) {
            xu0VarArr2[i10].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i11 = 0; i11 < 2; i11++) {
            xu0VarArr2[i10].f29157b[i11] = xu0VarArr[i10].f29157b[i11].clone();
            xu0 xu0Var2 = xu0VarArr2[i10];
            int[] iArr5 = xu0Var2.f29162j;
            xu0 xu0Var3 = xu0VarArr[i10];
            iArr5[i11] = xu0Var3.f29162j[i11];
            xu0Var2.f29161i[i11] = xu0Var3.f29161i[i11];
        }
        xu0VarArr2[i10].e.addAll(xu0VarArr[i10].e);
        return !xu0VarArr[i10].f29156a.isEmpty();
    }

    public final void R0(String str) {
        boolean shouldShowUrlInAlert = AndroidUtilities.shouldShowUrlInAlert(str);
        org.telegram.ui.ActionBar.p2 p2Var = this.f24131v1;
        if (shouldShowUrlInAlert) {
            d5.q0(p2Var, str, true, true);
        } else {
            nf.f.s(p2Var.getParentActivity(), str);
        }
    }

    public final void S(int i10, vl0 vl0Var, boolean z10) {
        ArrayList arrayList = this.f24127t1[i10].e;
        int L0 = ((s4.c0) vl0Var.getLayoutManager()).L0();
        if (L0 >= 0) {
            fu0 fu0Var = null;
            if (arrayList != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (L0 <= ((fu0) arrayList.get(i11)).f23084b) {
                        fu0Var = (fu0) arrayList.get(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                if (fu0Var == null) {
                    fu0Var = (fu0) hc.b.i(1, arrayList);
                }
            }
            if (fu0Var != null) {
                y0(i10, fu0Var.d, fu0Var.f23084b + 1, z10);
            }
        }
    }

    public int S0() {
        return -1;
    }

    public final void T() {
        au0[] au0VarArr;
        au0 au0Var;
        boolean z10;
        int i10;
        s4.h0 adapter;
        if (this.f24115o1) {
            int i11 = 0;
            while (true) {
                au0VarArr = this.f24107k0;
                if (i11 < au0VarArr.length) {
                    au0Var = au0VarArr[i11];
                    if (au0Var.F == this.f24117p1) {
                        break;
                    }
                    i11++;
                } else {
                    au0Var = null;
                    break;
                }
            }
            if (au0Var != null) {
                boolean p02 = p0(au0Var.F);
                float f7 = this.f24113n1;
                xu0[] xu0VarArr = this.f24127t1;
                float f10 = 1.0f;
                if (f7 == 1.0f) {
                    this.f24115o1 = false;
                    int i12 = this.f24119q1;
                    int[] iArr = this.f24110m1;
                    iArr[p02 ? 1 : 0] = i12;
                    if (!p02) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (c0(au0Var.F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(this.f24119q1);
                    }
                    for (int i13 = 0; i13 < au0VarArr.length; i13++) {
                        au0 au0Var2 = au0VarArr[i13];
                        if (au0Var2 != null && au0Var2.h != null && (((i10 = au0Var2.F) == 0 || p0(i10)) && (adapter = au0VarArr[i13].h.getAdapter()) != null)) {
                            int h = adapter.h();
                            if (i13 == 0) {
                                xu0VarArr[0].g(false);
                            }
                            au0VarArr[i13].f21595r.setVisibility(8);
                            au0VarArr[i13].f21598x.y1(iArr[p02 ? 1 : 0]);
                            au0VarArr[i13].h.a0();
                            au0VarArr[i13].h.invalidate();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(au0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                    }
                    if (this.f24123s >= 0) {
                        for (int i14 = 0; i14 < au0VarArr.length; i14++) {
                            au0 au0Var3 = au0VarArr[i14];
                            if (au0Var3.F == this.f24117p1) {
                                View m10 = au0Var3.f21596s.m(this.f24123s);
                                if (m10 != null) {
                                    this.v = m10.getTop();
                                }
                                au0 au0Var4 = au0VarArr[i14];
                                au0Var4.f21598x.h1(this.f24123s, (-au0Var4.h.getPaddingTop()) + this.v);
                            }
                        }
                        return;
                    }
                    X0();
                } else if (f7 == 0.0f) {
                    this.f24115o1 = false;
                    if (this.f24117p1 == 0) {
                        xu0VarArr[0].g(false);
                    }
                    au0Var.f21595r.setVisibility(8);
                    au0Var.h.invalidate();
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
                    ofFloat.addUpdateListener(new ws0(this, au0Var, 0));
                    ofFloat.addListener(new org.telegram.ui.gj(this, z10, p02 ? 1 : 0, au0Var));
                    ofFloat.setInterpolator(wr.f28819f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                }
            }
        }
    }

    public final void T0(ArrayList arrayList, boolean z10) {
        boolean z11;
        boolean z12;
        pt0 pt0Var = this.f24089c0;
        if (pt0Var != null && pt0Var.f23089s != null) {
            org.telegram.ui.ActionBar.p2 p2Var = this.f24131v1;
            if (z10 && arrayList.size() > p2Var.getMessagesController().storiesPinnedToTopCountMax) {
                wc.a0(p2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", p2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
                return;
            }
            zh.a5 a5Var = pt0Var.f23089s;
            int i10 = a5Var.f48237c;
            ArrayList arrayList2 = a5Var.f48239g;
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
                    a5Var.d(true);
                    TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                    tL_togglePinnedToTop.f17448id.addAll(arrayList2);
                    tL_togglePinnedToTop.peer = MessagesController.getInstance(i10).getInputPeer(a5Var.d);
                    ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new bi.g1(20));
                }
                z13 = z11;
            }
            if (z13) {
                wc.a0(p2Var).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", p2Var.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).j();
            } else if (z10) {
                wc.a0(p2Var).M(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinned", arrayList.size(), new Object[0])), LocaleController.formatPluralString("StoriesPinnedText", arrayList.size(), new Object[0]), R.raw.ic_pin).j();
            } else {
                wc.a0(p2Var).Q(R.raw.ic_unpin, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesUnpinned", arrayList.size(), new Object[0]))).j();
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
        au0 au0Var;
        vr0 vr0Var;
        int i11;
        int i12;
        int closestTab = getClosestTab();
        xs0 xs0Var = this.I0;
        SparseIntArray sparseIntArray = xs0Var.O;
        int i13 = xs0Var.f21267n;
        int i14 = -1;
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i15 = sparseIntArray.get(i13 + i10, -1);
        cs0 cs0Var = this.W;
        if (cs0Var != null) {
            if (!w0(closestTab) && closestTab != 8) {
                if (w0(i15) || i15 == 8) {
                    i14 = cs0Var.getCurrentAlbumId();
                }
            } else {
                u81 u81Var = cs0Var.f33250n;
                SparseIntArray sparseIntArray2 = u81Var.f27617b0;
                int i16 = u81Var.F;
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
                i15 = i1(i14).f23765a;
            }
        }
        if (i15 >= 0) {
            org.telegram.ui.ActionBar.w0 w0Var = this.f24112n0;
            if (w0Var != null && !D()) {
                if (v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                w0Var.setVisibility(i11);
                this.f24114o0 = 0.0f;
            } else {
                this.f24114o0 = b0(0.0f);
                s1(0.0f);
            }
            if ((!this.V0 || getSelectedTab() != 11) && (!C() || !this.C1 || (getClosestTab() != 8 && !w0(getClosestTab())))) {
                au0[] au0VarArr = this.f24107k0;
                au0 au0Var2 = au0VarArr[0];
                if (au0Var2 != null && au0Var2.F == 13 && (vr0Var = this.U) != null) {
                    ai.c cVar = vr0Var.f446n;
                    if (!z10) {
                    }
                }
                au0 au0Var3 = au0VarArr[0];
                wr0 wr0Var = this.V;
                if (au0Var3 != null && au0Var3.F == 14 && wr0Var != null) {
                    wh.v1 v1Var = wr0Var.h;
                    if (!z10) {
                    }
                }
                if ((!this.C1 || (au0Var = au0VarArr[0]) == null || au0Var.F != 13) && ((wr0Var == null || !wr0Var.g()) && (cs0Var == null || !cs0Var.f33253w))) {
                    q1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    k0();
                    this.f24140y1 = false;
                    this.f24137x1 = true;
                    N0(true);
                    this.f24142z1 = (int) motionEvent.getX();
                    this.G.setEnabled(false);
                    xs0Var.setEnabled(false);
                    au0 au0Var4 = au0VarArr[1];
                    au0Var4.F = i15;
                    au0Var4.setVisibility(0);
                    this.f24102h1 = z10;
                    m1(true);
                    if (z10) {
                        au0VarArr[1].setTranslationX(au0VarArr[0].getMeasuredWidth());
                    } else {
                        au0VarArr[1].setTranslationX(-au0VarArr[0].getMeasuredWidth());
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
        vr0 vr0Var;
        if (!r0()) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        if (z10 && (vr0Var = this.U) != null) {
            return vr0Var.getBotPreviewsSubtitle();
        }
        pt0 pt0Var = this.f24089c0;
        if (pt0Var != null && pt0Var.f23089s != null) {
            i10 = 0;
            i11 = 0;
            for (int i12 = 0; i12 < pt0Var.f23089s.f48240i.size(); i12++) {
                MessageObject messageObject = (MessageObject) pt0Var.f23089s.f48240i.get(i12);
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

    public final au0 W(int i10) {
        int i11 = 0;
        while (true) {
            au0[] au0VarArr = this.f24107k0;
            if (i11 < au0VarArr.length) {
                au0 au0Var = au0VarArr[i11];
                if (au0Var != null && au0Var.F == i10) {
                    return au0Var;
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    public final void W0(s4.h0 h0Var) {
        if (h0Var instanceof cv0) {
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
            ou0 ou0Var = this.N;
            if (h0Var == ou0Var) {
                ou0Var.f25917r = null;
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
        return Utilities.clamp(i14, 9, (this.f24108k1 && i10 == 1) ? 2 : 2);
    }

    public final void X0() {
        int i10;
        int i11 = 0;
        while (true) {
            au0[] au0VarArr = this.f24107k0;
            if (i11 < au0VarArr.length) {
                gs0 gs0Var = au0VarArr[i11].h;
                if (gs0Var != null) {
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < gs0Var.getChildCount(); i14++) {
                        View childAt = gs0Var.getChildAt(i14);
                        if (childAt instanceof org.telegram.ui.Cells.u7) {
                            org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) childAt;
                            int messageId = u7Var.getMessageId();
                            i13 = u7Var.getTop();
                            i12 = messageId;
                        }
                        if (childAt instanceof org.telegram.ui.Cells.l7) {
                            org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) childAt;
                            int id2 = l7Var.getMessage().getId();
                            i13 = l7Var.getTop();
                            i12 = id2;
                        }
                        if (childAt instanceof org.telegram.ui.Cells.k7) {
                            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) childAt;
                            i12 = k7Var.getMessage().getId();
                            i13 = k7Var.getTop();
                        }
                        if (i12 != 0) {
                            break;
                        }
                    }
                    if (i12 != 0) {
                        int i15 = au0VarArr[i11].F;
                        int i16 = -1;
                        if (p0(i15)) {
                            fv0 k12 = k1(i15);
                            if (k12 != null && k12.f23089s != null) {
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= k12.f23089s.f48240i.size()) {
                                        break;
                                    } else if (i12 == ((MessageObject) k12.f23089s.f48240i.get(i17)).getId()) {
                                        i16 = i17;
                                        break;
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                            i10 = i16;
                        } else if (i15 >= 0) {
                            xu0[] xu0VarArr = this.f24127t1;
                            if (i15 < xu0VarArr.length) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= xu0VarArr[i15].f29156a.size()) {
                                        break;
                                    } else if (i12 == ((MessageObject) xu0VarArr[i15].f29156a.get(i18)).getId()) {
                                        i16 = i18;
                                        break;
                                    } else {
                                        i18++;
                                    }
                                }
                                i10 = xu0VarArr[i15].f29165m + i16;
                            }
                        }
                        if (i16 >= 0) {
                            ((s4.c0) gs0Var.getLayoutManager()).h1(i10, (-au0VarArr[i11].h.getPaddingTop()) + i13);
                            if (this.f24115o1) {
                                au0 au0Var = au0VarArr[i11];
                                au0Var.f21596s.h1(i10, (-au0Var.h.getPaddingTop()) + i13);
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
        xs0 xs0Var;
        if (!this.L1 && (xs0Var = this.I0) != null) {
            xs0Var.h(null, i10, xs0Var.P.get(i10));
        }
    }

    public final int Z(int i10) {
        float f7;
        int i11;
        int dp = AndroidUtilities.dp(54.0f) + this.f24087b2;
        cs0 cs0Var = this.W;
        if (cs0Var != null && (w0(i10) || i10 == 8)) {
            f7 = cs0Var.getVisibilityFactor() * AndroidUtilities.dp(40.0f);
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
        xs0 xs0Var = this.I0;
        if (xs0Var != null) {
            if (w0(i10)) {
                i11 = 8;
            } else {
                i11 = i10;
            }
            xs0Var.j(f7, i11);
        }
        cs0 cs0Var = this.W;
        if (cs0Var != null) {
            u81 u81Var = cs0Var.f33250n;
            if (w0(i10)) {
                u81Var.f(f7, h1(i10));
            } else if (i10 == 8) {
                u81Var.f(f7, 0);
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
        au0[] au0VarArr = this.f24107k0;
        au0 au0Var = au0VarArr[1];
        wr0 wr0Var = this.V;
        if (au0Var != null && ((i12 = au0Var.F) == 0 || (((i12 == 8 || w0(i12)) && TextUtils.isEmpty(getStoriesHashtag())) || (i13 = au0VarArr[1].F) == 9 || i13 == 11 || i13 == 13 || (i13 == 14 && wr0Var != null)))) {
            f10 = 0.0f + f7;
        }
        au0 au0Var2 = au0VarArr[0];
        if (au0Var2 != null && ((i10 = au0Var2.F) == 0 || (((i10 == 8 || w0(i10)) && TextUtils.isEmpty(getStoriesHashtag())) || (i11 = au0VarArr[0].F) == 9 || i11 == 11 || i11 == 13 || (i11 == 14 && wr0Var != null)))) {
            return (1.0f - f7) + f10;
        }
        return f10;
    }

    public final void a1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i10 = 0;
        while (true) {
            au0[] au0VarArr = this.f24107k0;
            if (i10 < au0VarArr.length) {
                au0 au0Var = au0VarArr[i10];
                if (au0Var.F != 7 || au0Var.h.getAdapter() == null || au0VarArr[i10].h.getAdapter().h() == 0 || this.f24131v1.getMessagesController().getStoriesController().f48505j.size() <= 0) {
                    i10++;
                } else {
                    return;
                }
            } else {
                if (this.F == 0) {
                    rt0 rt0Var = this.f24082a0;
                    rt0Var.d = chatFull;
                    rt0Var.e = arrayList;
                }
                v1(true);
                for (int i11 = 0; i11 < au0VarArr.length; i11++) {
                    au0 au0Var2 = au0VarArr[i11];
                    if (au0Var2.F == 7 && au0Var2.h.getAdapter() != null) {
                        AndroidUtilities.notifyDataSetChanged(au0VarArr[i11].h);
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
        au0[] au0VarArr = this.f24107k0;
        au0 au0Var = au0VarArr[1];
        if (au0Var != null && s0(au0Var.F) && au0VarArr[1].F != 11) {
            f10 = 0.0f + f7;
        }
        au0 au0Var2 = au0VarArr[0];
        if (au0Var2 != null && s0(au0Var2.F) && au0VarArr[0].F != 11) {
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
            ga gaVar = this.B0;
            if (z10) {
                gaVar.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.N1 = animatorSet2;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(gaVar, View.ALPHA, f7));
            this.N1.setDuration(180L);
            this.N1.addListener(new yo(15, this, z10));
            this.N1.start();
            if (z10) {
                u1();
            }
        }
    }

    public final int c0(int i10) {
        fv0 k12;
        zh.a5 a5Var;
        if (p0(i10) && (k12 = k1(i10)) != null && (a5Var = k12.f23089s) != null) {
            return a5Var.g();
        }
        return 0;
    }

    public final void c1(int r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.iv0.c1(int, boolean):void");
    }

    public final void d1(int i10) {
        int h12 = h1(getClosestTab());
        cs0 cs0Var = this.W;
        if (h12 != i10) {
            if (cs0Var != null) {
                cs0Var.f33250n.d(i10, cs0Var.f33252s.i(i10));
                return;
            }
            return;
        }
        cs0Var.setReorderingAlbums(true);
        hv0 i12 = i1(i10);
        au0 W = W(i12.f23765a);
        if (W == null) {
            return;
        }
        gs0 gs0Var = W.h;
        for (int i11 = 0; i11 < gs0Var.getChildCount(); i11++) {
            View childAt = gs0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.u7) {
                ((org.telegram.ui.Cells.u7) childAt).l(true, true);
            }
        }
        gv0 gv0Var = i12.f23767c;
        if (gv0Var != null && !gv0Var.f23091x) {
            gv0Var.f23091x = true;
        }
        q1(true);
    }

    @Override
    public final void didReceivedNotification(int r42, int r43, java.lang.Object... r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.iv0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        xs0 xs0Var = this.I0;
        if (xs0Var != null) {
            canvas.save();
            canvas.translate(xs0Var.getX(), xs0Var.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        ts0 ts0Var = this.R0;
        if (ts0Var != null) {
            int i10 = ts0Var.T;
            if ((i10 == 3 || i10 == 1) && this.P0 == null) {
                canvas.save();
                canvas.translate(ts0Var.getX(), ts0Var.getY());
                ts0Var.setDrawOverlay(true);
                ts0Var.draw(canvas);
                ts0Var.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int i10;
        if (view == this.R0 && this.P0 == null) {
            canvas.save();
            au0[] au0VarArr = this.f24107k0;
            float top = au0VarArr[0].getTop();
            cs0 cs0Var = this.W;
            if (cs0Var != null && ((i10 = au0VarArr[0].F) == 8 || w0(i10))) {
                top -= cs0Var.getVisualHeight();
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
        org.telegram.ui.ActionBar.p2 p2Var = this.f24131v1;
        if (p2Var != null && p2Var.getMessagesController().getStoriesController().I(r2Var.getDialogId())) {
            p2Var.getOrCreateStoryViewer().getClass();
            zh.u7 orCreateStoryViewer = p2Var.getOrCreateStoryViewer();
            Context context = p2Var.getContext();
            long dialogId = r2Var.getDialogId();
            zh.s5 a2 = zh.s5.a((vl0) r2Var.getParent());
            if ((p2Var instanceof ProfileActivity) && ((ProfileActivity) p2Var).f30477s1) {
                i10 = AndroidUtilities.dp(68.0f);
            } else {
                i10 = 0;
            }
            a2.f48871s += i10;
            orCreateStoryViewer.D(context, dialogId, a2);
        }
    }

    public final void e1(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.iv0.e1(boolean):void");
    }

    public final float f0(int i10, boolean z10) {
        float width = getWidth();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            au0[] au0VarArr = this.f24107k0;
            if (i11 >= au0VarArr.length) {
                break;
            }
            au0 au0Var = au0VarArr[i11];
            if (au0Var != null) {
                int i13 = au0Var.F;
                if ((z10 && i10 == 8 && w0(i13)) || i13 == i10) {
                    i12++;
                    width = au0VarArr[i11].getTranslationX();
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
            au0[] au0VarArr = this.f24107k0;
            if (i10 < au0VarArr.length) {
                int childCount = au0VarArr[i10].h.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = au0VarArr[i10].h.getChildAt(i11);
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
            au0[] au0VarArr = this.f24107k0;
            if (i11 < au0VarArr.length) {
                au0 au0Var = au0VarArr[i11];
                if (au0Var != null) {
                    int i12 = au0Var.F;
                    if ((z10 && i10 == 8 && w0(i12)) || i12 == i10) {
                        f7 = (1.0f - Math.abs(au0VarArr[i11].getTranslationX() / getWidth())) + f7;
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
        au0 au0Var;
        au0 au0Var2;
        int measuredWidth2;
        au0 au0Var3;
        au0 au0Var4;
        boolean z11;
        VelocityTracker velocityTracker = this.B1;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.S0);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f7 = this.B1.getXVelocity();
                f10 = this.B1.getYVelocity();
                if (!this.f24137x1 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
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
            if (this.f24137x1) {
                au0[] au0VarArr = this.f24107k0;
                float x10 = au0VarArr[0].getX();
                this.f24098f1 = new AnimatorSet();
                if (Math.abs(x10) < au0VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f24104i1 = z10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new q70(this, 19));
                boolean z12 = this.f24104i1;
                Property property = View.TRANSLATION_X;
                if (z12) {
                    measuredWidth = Math.abs(x10);
                    if (this.f24102h1) {
                        this.f24098f1.playTogether(ObjectAnimator.ofFloat(au0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(au0VarArr[1], property, au0Var4.getMeasuredWidth()), ofFloat);
                    } else {
                        this.f24098f1.playTogether(ObjectAnimator.ofFloat(au0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(au0VarArr[1], property, -au0Var3.getMeasuredWidth()), ofFloat);
                    }
                } else {
                    measuredWidth = au0VarArr[0].getMeasuredWidth() - Math.abs(x10);
                    if (this.f24102h1) {
                        this.f24098f1.playTogether(ObjectAnimator.ofFloat(au0VarArr[0], property, -au0Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(au0VarArr[1], property, 0.0f), ofFloat);
                    } else {
                        this.f24098f1.playTogether(ObjectAnimator.ofFloat(au0VarArr[0], property, au0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(au0VarArr[1], property, 0.0f), ofFloat);
                    }
                }
                this.f24098f1.setInterpolator(f24080e2);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs = Math.abs(f7);
                if (abs > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                this.f24098f1.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                this.f24098f1.addListener(new at0(this, 1));
                this.f24098f1.start();
                this.f24100g1 = true;
                this.f24137x1 = false;
                L0();
            } else {
                this.f24140y1 = false;
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
        au0 au0Var;
        au0 au0Var2;
        boolean z10;
        boolean z11;
        zh.a5 a5Var;
        zh.a5 a5Var2;
        float f7 = 1.0f;
        au0[] au0VarArr = this.f24107k0;
        if (au0VarArr == null || (au0Var = au0VarArr[0]) == null || (au0Var2 = au0VarArr[1]) == null || au0Var.f21597w == null || au0Var2.f21597w == null) {
            return 1.0f;
        }
        int i10 = au0Var.F;
        int i11 = au0Var2.F;
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
        float visibilityFactor = 1.0f - au0VarArr[0].f21597w.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - au0VarArr[1].f21597w.getVisibilityFactor();
        fv0 k12 = k1(au0VarArr[0].F);
        if (i10 == 8 || (k12 != null && (a5Var2 = k12.f23089s) != null && a5Var2.g() > 0)) {
            visibilityFactor = 1.0f;
        }
        fv0 k13 = k1(i11);
        if (i11 != 8 && (k13 == null || (a5Var = k13.f23089s) == null || a5Var.g() <= 0)) {
            f7 = visibilityFactor2;
        }
        if (!z10) {
            visibilityFactor = f7;
        }
        if (!z11) {
            f7 = visibilityFactor;
        }
        return AndroidUtilities.lerp(visibilityFactor, f7, Math.abs(au0VarArr[0].getTranslationX() / au0VarArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        au0[] au0VarArr = this.f24107k0;
        au0 au0Var = au0VarArr[1];
        if (au0Var != null && au0Var.getVisibility() == 0) {
            if (this.f24100g1 && !this.f24104i1) {
                return au0VarArr[1].F;
            }
            if (Math.abs(au0VarArr[1].getTranslationX()) < au0VarArr[1].getMeasuredWidth() / 2.0f) {
                return au0VarArr[1].F;
            }
        }
        return getSelectedTab();
    }

    public vl0 getCurrentListView() {
        nt0 nt0Var;
        au0 au0Var = this.f24107k0[0];
        int i10 = au0Var.F;
        if (i10 == 13) {
            return this.U.getCurrentListView();
        }
        if (i10 == 14) {
            return this.V.getCurrentListView();
        }
        if (i10 == 12 && (nt0Var = this.T) != null) {
            return nt0Var.f33142a.f32542x0;
        }
        return au0Var.h;
    }

    public int getInitialTab() {
        return 0;
    }

    public int getPhotosVideosTypeFilter() {
        return this.f24127t1[0].f29169q;
    }

    public TextView getSaveItem() {
        return this.f24118q0;
    }

    public org.telegram.ui.ActionBar.w0 getSearchItem() {
        return this.f24112n0;
    }

    public kj0 getSearchOptionsItem() {
        return this.f24124s0;
    }

    public int getSelectedTab() {
        int currentTabId = this.I0.getCurrentTabId();
        cs0 cs0Var = this.W;
        if (cs0Var != null && currentTabId == 8) {
            int currentAlbumId = cs0Var.getCurrentAlbumId();
            if (currentAlbumId == 0) {
                return 8;
            }
            if (currentAlbumId > 0) {
                return i1(currentAlbumId).f23765a;
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
            au0[] au0VarArr = this.f24107k0;
            if (i10 < au0VarArr.length) {
                au0 au0Var = au0VarArr[i10];
                if (au0Var != null) {
                    f7 = ((1.0f - Math.abs(au0Var.getTranslationX() / getWidth())) * au0Var.F) + f7;
                }
                i10++;
            } else {
                return f7;
            }
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.A0, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f18325z6));
        org.telegram.ui.ActionBar.w0 w0Var = this.f24109l0;
        kj0 iconView = w0Var.getIconView();
        int i10 = org.telegram.ui.ActionBar.j6.f18308y8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(iconView, 8, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.f18327z8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var, 32, null, null, null, null, i11));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f24128u0;
        if (w0Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var2.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var2, 32, null, null, null, null, i11));
        }
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f24126t0;
        if (w0Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var3.getIconView(), 8, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var3, 32, null, null, null, null, i11));
        }
        Drawable[] drawableArr = {this.D0};
        ImageView imageView = this.C0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 8, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 32, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.f17928d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B0, 1, null, null, null, null, i12));
        xs0 xs0Var = this.I0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(xs0Var, 1, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.wc;
        org.telegram.ui.Cells.w0 w0Var4 = this.K0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var4, 0, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var4, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f18062kd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(xs0Var, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Gh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(xs0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.Fh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(xs0Var.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.Eh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(xs0Var.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.Hh));
        ts0 ts0Var = this.R0;
        if (ts0Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(ts0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18255v7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(ts0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18272w7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(ts0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18237u7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(ts0Var, 33554436, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18219t7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(ts0Var, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18290x7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(ts0Var, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18307y7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(ts0Var, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A7));
        }
        final int i14 = 0;
        while (true) {
            au0[] au0VarArr = this.f24107k0;
            if (i14 < au0VarArr.length) {
                org.telegram.ui.ActionBar.k6 k6Var = new org.telegram.ui.ActionBar.k6() {
                    @Override
                    public final void b() {
                        au0[] au0VarArr2 = iv0.this.f24107k0;
                        int i15 = i14;
                        gs0 gs0Var = au0VarArr2[i15].h;
                        if (gs0Var != null) {
                            int childCount = gs0Var.getChildCount();
                            for (int i16 = 0; i16 < childCount; i16++) {
                                View childAt = au0VarArr2[i15].h.getChildAt(i16);
                                if (childAt instanceof org.telegram.ui.Cells.v7) {
                                    org.telegram.ui.Cells.v7 v7Var = (org.telegram.ui.Cells.v7) childAt;
                                    for (int i17 = 0; i17 < 6; i17++) {
                                        v7Var.f20559a[i17].e.invalidate();
                                    }
                                } else if (childAt instanceof org.telegram.ui.Cells.j6) {
                                    ((org.telegram.ui.Cells.j6) childAt).u(0);
                                } else if (childAt instanceof org.telegram.ui.Cells.bb) {
                                    ((org.telegram.ui.Cells.bb) childAt).j(0);
                                }
                            }
                        }
                    }

                    @Override
                    public final void a(float f7) {
                    }
                };
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
                ps0 ps0Var = au0VarArr[i14].v;
                int i15 = org.telegram.ui.ActionBar.j6.f17928d6;
                arrayList.add(new org.telegram.ui.ActionBar.l6(ps0Var, 0, null, null, null, null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f18201s8));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].f21597w, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f17911c7));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 524288, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f7));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
                int i16 = org.telegram.ui.ActionBar.j6.f17999h6;
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18247uh));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18091m6));
                int i17 = org.telegram.ui.ActionBar.j6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
                int i18 = org.telegram.ui.ActionBar.j6.f18306y6;
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"statusColor"}, null, null, -1, k6Var, i18));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"statusOnlineColor"}, null, null, -1, k6Var, org.telegram.ui.ActionBar.j6.f18110n6));
                Drawable[] drawableArr2 = org.telegram.ui.ActionBar.j6.f18174r0;
                int i19 = org.telegram.ui.ActionBar.j6.J7;
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.bb.class}, null, drawableArr2, null, i19));
                TextPaint[] textPaintArr = org.telegram.ui.ActionBar.j6.B0;
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.j6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.j6.D0}, null, -1, null, org.telegram.ui.ActionBar.j6.X8));
                TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.j6.C0;
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.j6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.j6.E0}, null, -1, null, org.telegram.ui.ActionBar.j6.Z8));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.j6.class}, null, drawableArr2, null, i19));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.O7));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.P7));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.Q7));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.R7));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.S7));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.T7));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, k6Var, org.telegram.ui.ActionBar.j6.U7));
                int i20 = org.telegram.ui.ActionBar.j6.f18325z6;
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 4, new Class[]{ut0.class}, new String[]{"emptyTextView"}, null, null, -1, null, i20));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
                int i21 = org.telegram.ui.ActionBar.j6.Ih;
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 2048, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"progressView"}, null, null, -1, null, i21));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"statusImageView"}, null, null, -1, null, i21));
                int i22 = org.telegram.ui.ActionBar.j6.f18018i7;
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                int i23 = org.telegram.ui.ActionBar.j6.f18056k7;
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 8, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.zi));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Bi));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.k7.class}, org.telegram.ui.ActionBar.j6.f17961f3, null, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 4, new Class[]{org.telegram.ui.Cells.k7.class}, org.telegram.ui.ActionBar.j6.f17979g3, null, null, i20));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"checkBox"}, null, null, -1, null, i22));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"checkBox"}, null, null, -1, null, i23));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.o7.class}, null, null, null, org.telegram.ui.ActionBar.j6.J6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.o7.class}, org.telegram.ui.ActionBar.j6.m0, null, null, org.telegram.ui.ActionBar.j6.K6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Kh));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 32, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Jh));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 524304, new Class[]{org.telegram.ui.Cells.p7.class}, null, null, null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 524288, new Class[]{org.telegram.ui.Cells.p7.class}, new String[]{"textView"}, null, null, -1, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.p7.class}, new String[]{"textView"}, null, null, -1, null, i17));
                int i24 = org.telegram.ui.ActionBar.j6.Lh;
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.v7.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.v7.class}, null, null, k6Var, i22));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.v7.class}, null, null, k6Var, i23));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, new Class[]{org.telegram.ui.Cells.e2.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i24));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 8192, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, k6Var, i22));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 16384, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, k6Var, i23));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].h, 0, null, null, new Drawable[]{this.f24139y0}, null, org.telegram.ui.ActionBar.j6.f17892b7));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].f21597w.d, 4, null, null, null, null, i17));
                arrayList.add(new org.telegram.ui.ActionBar.l6(au0VarArr[i14].f21597w.e, 4, null, null, null, null, i18));
                i14++;
            } else {
                return arrayList;
            }
        }
    }

    public final int h0(int i10) {
        org.telegram.ui.ActionBar.f6 f6Var = this.F1;
        if (f6Var != null) {
            return f6Var.F0(i10);
        }
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    public final int h1(int i10) {
        hv0 j12 = j1(i10);
        if (j12 == null) {
            return -1;
        }
        return j12.f23766b;
    }

    public final boolean i0() {
        if (this.f24131v1.getConnectionsManager().getConnectionState() == 3) {
            return true;
        }
        return false;
    }

    public final hv0 i1(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.Y1;
        hv0 hv0Var = (hv0) hashMap.get(valueOf);
        if (hv0Var == null) {
            hv0 hv0Var2 = new hv0(this, getContext(), i10);
            hashMap.put(Integer.valueOf(i10), hv0Var2);
            this.Z1.put(Integer.valueOf(hv0Var2.f23765a), Integer.valueOf(i10));
            return hv0Var2;
        }
        return hv0Var;
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

    public final hv0 j1(int i10) {
        Integer num = (Integer) this.Z1.get(Integer.valueOf(i10));
        if (num == null) {
            return null;
        }
        return (hv0) this.Y1.get(num);
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
        this.L0.setInterpolator(wr.f28820g);
        this.L0.addListener(new at0(this, 0));
        this.L0.start();
    }

    public final fv0 k1(int i10) {
        hv0 j12;
        if (i10 == 8) {
            return this.f24089c0;
        }
        if (i10 == 9) {
            return this.f24094e0;
        }
        if (w0(i10) && (j12 = j1(i10)) != null) {
            return j12.f23767c;
        }
        return null;
    }

    public boolean l0() {
        return false;
    }

    public final fv0 l1(int i10) {
        hv0 j12;
        if (i10 == 8) {
            return this.f24092d0;
        }
        if (i10 == 9) {
            return this.f24097f0;
        }
        if (!w0(i10) || (j12 = j1(i10)) == null) {
            return null;
        }
        return j12.d;
    }

    public boolean m0() {
        return !(this instanceof i40);
    }

    public final void m1(boolean z10) {
        au0[] au0VarArr;
        au0[] au0VarArr2;
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
        xu0[] xu0VarArr;
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
        wr0 wr0Var = this.V;
        if (wr0Var != null) {
            wr0Var.i();
        }
        int i22 = 0;
        while (true) {
            au0VarArr = this.f24107k0;
            if (i22 >= au0VarArr.length) {
                break;
            }
            au0VarArr[i22].h.B0();
            i22++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) au0VarArr[z10 ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = AndroidUtilities.dp(B0());
        s4.h0 adapter = au0VarArr[z10 ? 1 : 0].h.getAdapter();
        s4.h0 h0Var = this.f24089c0;
        s4.y yVar = this.f24085b0;
        if (adapter == h0Var) {
            yVar.d(null);
        }
        boolean z23 = this.V0;
        tt0 tt0Var = this.D1;
        String str4 = "";
        ou0 ou0Var = this.N;
        org.telegram.ui.ActionBar.w0 w0Var = this.f24112n0;
        int i23 = 100;
        if (z23 && this.U0) {
            au0 au0Var = au0VarArr[z10 ? 1 : 0];
            if (au0Var.f21593f == null) {
                au0Var.f21593f = new s4.u0();
            }
            au0 au0Var2 = au0VarArr[z10 ? 1 : 0];
            u0Var2 = au0Var2.f21593f;
            tu0 tu0Var = this.S;
            yt0 yt0Var = this.f24105j0;
            du0 du0Var = this.f24101h0;
            du0 du0Var2 = this.f24103i0;
            du0 du0Var3 = this.f24099g0;
            if (z10) {
                int i24 = au0Var2.F;
                if (i24 != 0 && i24 != 2 && i24 != 5 && i24 != 6 && (i24 != 7 || tt0Var.T())) {
                    if (w0Var != null) {
                        str4 = w0Var.getSearchField().getText().toString();
                    }
                    int i25 = au0VarArr[z10 ? 1 : 0].F;
                    if (i25 == 1) {
                        if (du0Var3 != null) {
                            du0Var3.G(str4, false);
                            if (adapter != du0Var3) {
                                W0(adapter);
                                au0VarArr[z10 ? 1 : 0].h.setAdapter(du0Var3);
                            }
                        }
                    } else if (i25 == 3) {
                        if (du0Var2 != null) {
                            du0Var2.G(str4, false);
                            if (adapter != du0Var2) {
                                W0(adapter);
                                au0VarArr[z10 ? 1 : 0].h.setAdapter(du0Var2);
                            }
                        }
                    } else if (i25 == 4) {
                        if (du0Var != null) {
                            du0Var.G(str4, false);
                            if (adapter != du0Var) {
                                W0(adapter);
                                au0VarArr[z10 ? 1 : 0].h.setAdapter(du0Var);
                            }
                        }
                    } else if (i25 == 7) {
                        if (yt0Var != null) {
                            yt0Var.F(str4, false);
                            if (adapter != yt0Var) {
                                W0(adapter);
                                au0VarArr[z10 ? 1 : 0].h.setAdapter(yt0Var);
                            }
                        }
                    } else if (i25 == 11) {
                        if (tu0Var != null) {
                            tu0Var.E(this.W0, str4);
                            if (adapter != tu0Var) {
                                W0(adapter);
                                au0VarArr[z10 ? 1 : 0].h.setAdapter(tu0Var);
                            }
                        }
                    } else if (i25 == 15 && ou0Var != null && adapter != ou0Var) {
                        W0(adapter);
                        gs0 gs0Var = au0VarArr[z10 ? 1 : 0].h;
                        ou0Var.f25917r = gs0Var;
                        gs0Var.setAdapter(ou0Var);
                    }
                } else {
                    this.V0 = false;
                    us0 us0Var = this.J0;
                    if (us0Var != null) {
                        us0Var.g(false);
                    }
                    this.U0 = false;
                    m1(true);
                    return;
                }
            } else if (au0Var2.h != null) {
                int i26 = au0Var2.F;
                if (i26 == 1) {
                    if (adapter != du0Var3) {
                        W0(adapter);
                        au0VarArr[z10 ? 1 : 0].h.setAdapter(du0Var3);
                    }
                    du0Var3.l();
                } else if (i26 == 3) {
                    if (adapter != du0Var2) {
                        W0(adapter);
                        au0VarArr[z10 ? 1 : 0].h.setAdapter(du0Var2);
                    }
                    du0Var2.l();
                } else if (i26 == 4) {
                    if (adapter != du0Var) {
                        W0(adapter);
                        au0VarArr[z10 ? 1 : 0].h.setAdapter(du0Var);
                    }
                    du0Var.l();
                } else if (i26 == 7) {
                    if (adapter != yt0Var) {
                        W0(adapter);
                        au0VarArr[z10 ? 1 : 0].h.setAdapter(yt0Var);
                    }
                    yt0Var.l();
                } else if (i26 == 11) {
                    if (adapter != tu0Var) {
                        W0(adapter);
                        au0VarArr[z10 ? 1 : 0].h.setAdapter(tu0Var);
                    }
                    tu0Var.l();
                }
            }
            au0VarArr2 = au0VarArr;
            z20 = false;
            z19 = false;
            i16 = 100;
        } else {
            au0 au0Var3 = au0VarArr[z10 ? 1 : 0];
            if (au0Var3.e == null) {
                au0Var3.e = new s4.u0();
            }
            au0 au0Var4 = au0VarArr[z10 ? 1 : 0];
            s4.u0 u0Var3 = au0Var4.e;
            au0Var4.h.setPinnedHeaderShadowDrawable(null);
            int i27 = au0VarArr[z10 ? 1 : 0].F;
            if (i27 == 8 || w0(i27)) {
                layoutParams.topMargin = AndroidUtilities.dp(B0());
            }
            gs0 gs0Var2 = au0VarArr[z10 ? 1 : 0].h;
            int paddingLeft = gs0Var2.getPaddingLeft();
            au0 au0Var5 = au0VarArr[z10 ? 1 : 0];
            gs0 gs0Var3 = au0Var5.h;
            int Z = Z(au0Var5.F);
            gs0Var3.f29808d3 = Z;
            int paddingRight = au0VarArr[z10 ? 1 : 0].h.getPaddingRight();
            au0VarArr2 = au0VarArr;
            gs0 gs0Var4 = au0VarArr2[z10 ? 1 : 0].h;
            int Y = Y(v0());
            gs0Var4.f29809e3 = Y;
            gs0Var2.setPadding(paddingLeft, Z, paddingRight, Y);
            int i28 = au0VarArr2[z10 ? 1 : 0].F;
            int[] iArr = this.f24110m1;
            s4.h0 h0Var2 = this.K;
            View view = this.U;
            nt0 nt0Var = this.T;
            ru0 ru0Var = this.R;
            st0 st0Var = this.P;
            xu0[] xu0VarArr2 = this.f24127t1;
            if (i28 == 0) {
                s4.h0 h0Var3 = this.H;
                if (adapter != h0Var3) {
                    W0(adapter);
                    au0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var3);
                }
                int i29 = -AndroidUtilities.dp(1.0f);
                layoutParams.rightMargin = i29;
                layoutParams.leftMargin = i29;
                xu0 xu0Var = xu0VarArr2[0];
                if (xu0Var.h && !xu0Var.e.isEmpty()) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                i23 = iArr[0];
                au0VarArr2[z10 ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.f24139y0);
                xu0 xu0Var2 = xu0VarArr2[0];
                if (xu0Var2.f29175x == null) {
                    xu0Var2.f29175x = new s4.u0();
                }
                z13 = z22;
                u0Var = xu0VarArr2[0].f29175x;
                z11 = false;
            } else {
                if (i28 == 1) {
                    xu0 xu0Var3 = xu0VarArr2[1];
                    if (xu0Var3.h && !xu0Var3.e.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (adapter != h0Var2) {
                        W0(adapter);
                        au0VarArr2[z10 ? 1 : 0].h.setAdapter(h0Var2);
                    }
                } else if (i28 == 2) {
                    xu0 xu0Var4 = xu0VarArr2[2];
                    if (xu0Var4.h && !xu0Var4.e.isEmpty()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (adapter != this.L) {
                        W0(adapter);
                        au0VarArr2[z10 ? 1 : 0].h.setAdapter(this.L);
                    }
                } else {
                    if (i28 == 3) {
                        if (adapter != this.J) {
                            W0(adapter);
                            au0VarArr2[z10 ? 1 : 0].h.setAdapter(this.J);
                        }
                    } else if (i28 == 4) {
                        xu0 xu0Var5 = xu0VarArr2[4];
                        if (xu0Var5.h && !xu0Var5.e.isEmpty()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (adapter != this.M) {
                            W0(adapter);
                            au0VarArr2[z10 ? 1 : 0].h.setAdapter(this.M);
                        }
                    } else {
                        if (i28 == 5) {
                            if (adapter != this.O) {
                                W0(adapter);
                                au0VarArr2[z10 ? 1 : 0].h.setAdapter(this.O);
                            }
                        } else if (i28 == 15) {
                            if (adapter != ou0Var) {
                                W0(adapter);
                                gs0 gs0Var5 = au0VarArr2[z10 ? 1 : 0].h;
                                ou0Var.f25917r = gs0Var5;
                                gs0Var5.setAdapter(ou0Var);
                            }
                        } else if (i28 == 6) {
                            if (adapter != st0Var) {
                                W0(adapter);
                                au0VarArr2[z10 ? 1 : 0].h.setAdapter(st0Var);
                            }
                        } else if (i28 == 7) {
                            if (adapter != this.f24082a0) {
                                W0(adapter);
                                au0VarArr2[z10 ? 1 : 0].h.setAdapter(this.f24082a0);
                            }
                        } else if (p0(i28)) {
                            s4.h0 k12 = k1(au0VarArr2[z10 ? 1 : 0].F);
                            if (adapter != k12) {
                                W0(adapter);
                                au0VarArr2[z10 ? 1 : 0].h.setAdapter(k12);
                                au0VarArr2[z10 ? 1 : 0].h.getClass();
                            }
                            au0 au0Var6 = au0VarArr2[z10 ? 1 : 0];
                            if (au0Var6.F != 9) {
                                yVar.d(au0Var6.h);
                            }
                            i23 = iArr[1];
                        } else {
                            int i30 = au0VarArr2[z10 ? 1 : 0].F;
                            if (i30 == 10) {
                                if (adapter != this.Q) {
                                    W0(adapter);
                                    au0VarArr2[z10 ? 1 : 0].h.setAdapter(this.Q);
                                }
                            } else if (i30 == 11) {
                                if (adapter != ru0Var) {
                                    W0(adapter);
                                    au0VarArr2[z10 ? 1 : 0].h.setAdapter(ru0Var);
                                    s4.y yVar2 = ru0Var.v;
                                    gs0 gs0Var6 = au0VarArr2[z10 ? 1 : 0].h;
                                    ru0Var.f26759s = gs0Var6;
                                    yVar2.d(gs0Var6);
                                }
                                u0Var = ru0Var.f26758r;
                                z11 = true;
                                z13 = false;
                            } else if (i30 == 12) {
                                if (adapter != null) {
                                    W0(adapter);
                                    au0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (nt0Var.getParent() != au0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(nt0Var);
                                    au0VarArr2[z10 ? 1 : 0].addView(nt0Var, w7.a6.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                }
                            } else if (i30 == 13) {
                                if (adapter != null) {
                                    W0(adapter);
                                    au0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != au0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(view);
                                    au0VarArr2[z10 ? 1 : 0].addView(view);
                                }
                            } else if (i30 == 14) {
                                if (adapter != null) {
                                    W0(adapter);
                                    au0VarArr2[z10 ? 1 : 0].h.setAdapter(null);
                                }
                                if (wr0Var != null && wr0Var.getParent() != au0VarArr2[z10 ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(wr0Var);
                                    au0VarArr2[z10 ? 1 : 0].addView(wr0Var);
                                    au0VarArr2[z10 ? 1 : 0].f21597w.setVisibility(4);
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
            int i31 = au0VarArr2[z10 ? 1 : 0].F;
            if (i31 != 0 && !p0(i31)) {
                z14 = false;
            } else {
                z14 = true;
            }
            ps0 ps0Var = au0VarArr2[z10 ? 1 : 0].v;
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
            ps0Var.setLayoutParams(w7.a6.d(-1, -1.0f, 119, f7, f12, f10, f11));
            if (z11) {
                au0VarArr2[z10 ? 1 : 0].h.setSections(false);
            } else {
                gs0 gs0Var7 = au0VarArr2[z10 ? 1 : 0].h;
                gs0Var7.getClass();
                gs0Var7.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, gs0Var7.f27987p2));
                gs0Var7.I2 = null;
                gs0Var7.L2 = 0.0f;
                gs0Var7.M2 = null;
                gs0Var7.N2 = null;
                gs0Var7.J2 = null;
                hl0 hl0Var = gs0Var7.H2;
                if (hl0Var != null) {
                    gs0Var7.p0(hl0Var);
                    gs0Var7.H2 = null;
                }
            }
            au0 au0Var7 = au0VarArr2[z10 ? 1 : 0];
            int i32 = au0Var7.F;
            org.telegram.ui.ActionBar.p2 p2Var = this.f24131v1;
            if (i32 == 15) {
                z15 = z13;
                xu0VarArr = xu0VarArr2;
                str = "";
                au0Var7.setBackground(bi.e8.e(au0Var7.getBackground(), p2Var.getCurrentAccount(), this.f24106j1, org.telegram.ui.ActionBar.j6.I.q()));
                au0VarArr2[z10 ? 1 : 0].setOutlineProvider(new bi.g(13));
                au0VarArr2[z10 ? 1 : 0].setClipToOutline(true);
                r52 = 0;
            } else {
                z15 = z13;
                xu0VarArr = xu0VarArr2;
                str = "";
                au0Var7.setClipToOutline(false);
                r52 = 0;
                au0VarArr2[z10 ? 1 : 0].setBackground(null);
            }
            au0 au0Var8 = au0VarArr2[z10 ? 1 : 0];
            if (au0Var8.F == 11) {
                au0Var8.h.setItemAnimator(au0Var8.d);
            } else {
                au0Var8.h.setItemAnimator(r52);
                if (ru0Var != null && au0VarArr2[z10 ? 1 : 0].h == ru0Var.f26759s) {
                    s4.y yVar3 = ru0Var.v;
                    ru0Var.f26759s = r52;
                    yVar3.d(r52);
                }
            }
            if (nt0Var != null && au0VarArr2[z10 ? 1 : 0].F != 12 && nt0Var.getParent() == au0VarArr2[z10 ? 1 : 0]) {
                nt0Var.f33142a.onRemoveFromParent();
                au0VarArr2[z10 ? 1 : 0].removeView(nt0Var);
            }
            if (view != null && au0VarArr2[z10 ? 1 : 0].F != 13) {
                ViewParent parent = view.getParent();
                au0 au0Var9 = au0VarArr2[z10 ? 1 : 0];
                if (parent == au0Var9) {
                    au0Var9.removeView(view);
                }
            }
            if (wr0Var != null && au0VarArr2[z10 ? 1 : 0].F != 14) {
                ViewParent parent2 = wr0Var.getParent();
                au0 au0Var10 = au0VarArr2[z10 ? 1 : 0];
                if (parent2 == au0Var10) {
                    au0Var10.removeView(wr0Var);
                }
            }
            int i33 = au0VarArr2[z10 ? 1 : 0].F;
            if (i33 != 0 && i33 != 11 && !p0(i33) && (i17 = au0VarArr2[z10 ? 1 : 0].F) != 2 && i17 != 5 && i17 != 6 && ((i17 != 7 || tt0Var.T()) && (i18 = au0VarArr2[z10 ? 1 : 0].F) != 10 && i18 != 13 && i18 != 14)) {
                if (z10) {
                    if (w0Var != null && w0Var.getVisibility() == 4 && !this.G.f18389n0) {
                        if (D()) {
                            this.f24136x0 = 1;
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
                        this.f24114o0 = b0(f13);
                        s1(1.0f - f13);
                        z21 = false;
                    } else {
                        z21 = false;
                        this.f24136x0 = 0;
                        this.f24114o0 = 1.0f;
                    }
                } else {
                    z21 = false;
                    if (w0Var != null) {
                        if (w0Var.getVisibility() == 4) {
                            if (D()) {
                                this.f24136x0 = 0;
                                this.f24114o0 = 1.0f;
                                w0Var.setVisibility(0);
                            } else {
                                if (v0()) {
                                    i19 = 8;
                                } else {
                                    i19 = 4;
                                }
                                w0Var.setVisibility(i19);
                                this.f24114o0 = 0.0f;
                            }
                        }
                        q1(z21);
                    }
                }
                q1(z21);
            } else if (z10) {
                this.f24136x0 = 2;
            } else {
                this.f24136x0 = 0;
                if (w0Var != null) {
                    if (!v0() && !this.V0) {
                        i11 = 4;
                    } else {
                        i11 = 8;
                    }
                    w0Var.setVisibility(i11);
                }
            }
            int i34 = au0VarArr2[z10 ? 1 : 0].F;
            if (i34 == 6) {
                if (!st0Var.e && !st0Var.h && st0Var.d.isEmpty()) {
                    st0.E(st0Var, 0L);
                }
            } else if (i34 != 7) {
                if (p0(i34)) {
                    fv0 k13 = k1(au0VarArr2[z10 ? 1 : 0].F);
                    if (k13 != null) {
                        zh.a5 a5Var = k13.f23089s;
                        k13.P();
                        rs0 rs0Var = au0VarArr2[z10 ? 1 : 0].f21597w;
                        if (a5Var != null && (a5Var.k() || (i0() && a5Var.g() > 0))) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        rs0Var.e(z17, z10);
                        if (a5Var != null && a5Var.g() > 0 && !t0()) {
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
                    int i35 = au0VarArr2[z10 ? 1 : 0].F;
                    if (i35 != 10 && i35 != 11 && i35 != 12 && i35 != 13 && i35 != 14) {
                        if (i35 == 15) {
                            i35 = 8;
                        }
                        xu0 xu0Var6 = xu0VarArr[i35];
                        if (!xu0Var6.f29160g && !xu0Var6.f29161i[0] && xu0Var6.f29156a.isEmpty()) {
                            xu0VarArr[i35].f29160g = true;
                            h0Var2.l();
                            if (i35 == 0) {
                                int i36 = xu0VarArr[0].f29169q;
                                if (i36 == 1) {
                                    i12 = 6;
                                } else if (i36 == 2) {
                                    i12 = 7;
                                }
                                p2Var.getMediaDataController().loadMedia(this.f24106j1, 50, 0, 0, i12, this.F, 1, p2Var.getClassGuid(), xu0VarArr[i12].f29168p, null, null);
                            }
                            i12 = i35;
                            p2Var.getMediaDataController().loadMedia(this.f24106j1, 50, 0, 0, i12, this.F, 1, p2Var.getClassGuid(), xu0VarArr[i12].f29168p, null, null);
                        }
                    }
                }
            }
            int i37 = au0VarArr2[z10 ? 1 : 0].F;
            if (i37 != 8 && !w0(i37)) {
                au0 au0Var11 = au0VarArr2[z10 ? 1 : 0];
                if (au0Var11.F == 9) {
                    if (u0()) {
                        au0VarArr2[z10 ? 1 : 0].f21597w.f24510b.setVisibility(8);
                        au0VarArr2[z10 ? 1 : 0].f21597w.f24512f.setVisibility(8);
                    } else {
                        au0VarArr2[z10 ? 1 : 0].f21597w.f24510b.setVisibility(0);
                        au0VarArr2[z10 ? 1 : 0].f21597w.setStickerType(11);
                        au0VarArr2[z10 ? 1 : 0].f21597w.f24512f.setVisibility(0);
                        au0VarArr2[z10 ? 1 : 0].f21597w.f24512f.h(w());
                    }
                    au0VarArr2[z10 ? 1 : 0].f21597w.d.setText(LocaleController.getString(R.string.NoArchivedStoriesTitle));
                    m90 m90Var = au0VarArr2[z10 ? 1 : 0].f21597w.e;
                    if (v0()) {
                        str3 = LocaleController.getString(R.string.NoArchivedStoriesSubtitle);
                    } else {
                        str3 = str;
                    }
                    m90Var.setText(str3);
                    au0VarArr2[z10 ? 1 : 0].f21597w.f24512f.setOnClickListener(new dr0(this, 7));
                } else {
                    au0Var11.f21597w.f24510b.setVisibility(0);
                    au0VarArr2[z10 ? 1 : 0].f21597w.setStickerType(1);
                    au0VarArr2[z10 ? 1 : 0].f21597w.d.setText(LocaleController.getString(R.string.NoResult));
                    au0VarArr2[z10 ? 1 : 0].f21597w.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    au0VarArr2[z10 ? 1 : 0].f21597w.f24512f.setVisibility(8);
                }
            } else {
                au0 au0Var12 = au0VarArr2[z10 ? 1 : 0];
                rs0 rs0Var2 = au0Var12.f21597w;
                boolean w02 = w0(au0Var12.F);
                int h12 = h1(au0VarArr2[z10 ? 1 : 0].F);
                w9 w9Var = rs0Var2.f24510b;
                bi.d dVar = rs0Var2.f24512f;
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
                    rs0Var2.setStickerType(11);
                    if (!t0()) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    dVar.setVisibility(i14);
                    dVar.h(w());
                }
                if (w02) {
                    rs0Var2.d.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeTitle));
                    rs0Var2.e.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeDescription));
                } else {
                    uh.o oVar = rs0Var2.d;
                    if (!t0()) {
                        if (v0()) {
                            i15 = R.string.NoPublicStoriesTitle2;
                        } else {
                            i15 = R.string.NoStoriesTitle;
                        }
                    } else {
                        i15 = R.string.NoHashtagStoriesTitle;
                    }
                    oVar.setText(LocaleController.getString(i15));
                    m90 m90Var2 = rs0Var2.e;
                    if (v0()) {
                        str2 = LocaleController.getString(R.string.NoStoriesSubtitle2);
                    } else {
                        str2 = str;
                    }
                    m90Var2.setText(str2);
                }
                dVar.setOnClickListener(new fr0(this, w02, h12, 0));
            }
            z19 = false;
            au0VarArr2[z10 ? 1 : 0].h.setVisibility(0);
            i16 = i23;
            z20 = z15;
            u0Var2 = u0Var4;
        }
        au0 au0Var13 = au0VarArr2[z10 ? 1 : 0];
        au0Var13.f21591b = z20;
        o1(au0Var13, z19);
        au0VarArr2[z10 ? 1 : 0].f21598x.y1(i16);
        au0VarArr2[z10 ? 1 : 0].h.a0();
        if (u0Var2 != null) {
            au0VarArr2[z10 ? 1 : 0].h.setRecycledViewPool(u0Var2);
            au0VarArr2[z10 ? 1 : 0].f21595r.setRecycledViewPool(u0Var2);
        }
        if (this.f24136x0 == 2) {
            org.telegram.ui.ActionBar.l lVar = this.G;
            if (lVar.f18389n0) {
                this.f24141z0 = true;
                lVar.h(true);
                this.f24136x0 = 0;
                this.f24114o0 = 0.0f;
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
        au0[] au0VarArr;
        for (au0 au0Var : this.f24107k0) {
            gs0 gs0Var = au0Var.h;
            Objects.requireNonNull(gs0Var);
            au0Var.f21594n = new zg.k(gs0Var, viewGroup, new iw(gs0Var, 4));
        }
        wr0 wr0Var = this.V;
        if (wr0Var != null) {
            wr0Var.S = viewGroup;
            wr0Var.R = new bi.a9(wr0Var, 1);
        }
    }

    public final void n1() {
        mt0 mt0Var = this.H;
        if (mt0Var != null) {
            mt0Var.l();
        }
        vu0 vu0Var = this.K;
        if (vu0Var != null) {
            vu0Var.l();
        }
        vu0 vu0Var2 = this.L;
        if (vu0Var2 != null) {
            vu0Var2.l();
        }
        wu0 wu0Var = this.J;
        if (wu0Var != null) {
            wu0Var.X(false);
        }
        vu0 vu0Var3 = this.M;
        if (vu0Var3 != null) {
            vu0Var3.l();
        }
        ou0 ou0Var = this.N;
        if (ou0Var != null) {
            ou0Var.l();
        }
        vt0 vt0Var = this.O;
        if (vt0Var != null) {
            vt0Var.l();
        }
        pt0 pt0Var = this.f24089c0;
        if (pt0Var != null) {
            pt0Var.l();
        }
        for (hv0 hv0Var : this.Y1.values()) {
            hv0Var.f23767c.l();
        }
    }

    public final void o1(au0 au0Var, boolean z10) {
        boolean z11;
        Integer num = 1;
        int i10 = 0;
        if (au0Var.f21591b && this.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        cl0 fastScroll = au0Var.h.getFastScroll();
        ObjectAnimator objectAnimator = au0Var.f21592c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            au0Var.f21592c.cancel();
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
            au0Var.f21592c = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(num);
        } else if (!z11 && fastScroll.getTag() != null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, property, fastScroll.getAlpha(), 0.0f);
            ofFloat2.addListener(new yo(fastScroll));
            au0Var.f21592c = ofFloat2;
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
            au0[] au0VarArr = this.f24107k0;
            if (i10 < au0VarArr.length) {
                gs0 gs0Var = au0VarArr[i10].h;
                if (gs0Var != null) {
                    gs0Var.getViewTreeObserver().addOnPreDrawListener(new dt0(this, i10, 0));
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
        tt0 tt0Var = this.D1;
        if (tt0Var.f() != null) {
            i12 = tt0Var.f().getHeight();
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
            } else if (childAt instanceof au0) {
                i13 = i10;
                measureChildWithMargins(childAt, i13, 0, View.MeasureSpec.makeMeasureSpec(i12, 1073741824), 0);
                gs0 gs0Var = ((au0) childAt).h;
                gs0Var.setPadding(0, gs0Var.Y2, 0, gs0Var.Z2);
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
            org.telegram.ui.ActionBar.p2 p2Var = this.f24131v1;
            if (p2Var.getParentLayout() != null && !((ActionBarLayout) p2Var.getParentLayout()).j() && !J() && !this.f24081a) {
                if (motionEvent != null) {
                    if (this.B1 == null) {
                        this.B1 = VelocityTracker.obtain();
                    }
                    this.B1.addMovement(motionEvent);
                    s40 s40Var = this.E1;
                    if (s40Var != null) {
                        s40Var.b(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.f24137x1 && !this.f24140y1 && motionEvent.getY() >= AndroidUtilities.dp(90.0f)) {
                    this.f24134w1 = motionEvent.getPointerId(0);
                    this.f24140y1 = true;
                    this.f24142z1 = (int) motionEvent.getX();
                    this.A1 = (int) motionEvent.getY();
                    this.B1.clear();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f24134w1) {
                    int x10 = (int) (motionEvent.getX() - this.f24142z1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.A1);
                    boolean z13 = this.f24137x1;
                    au0[] au0VarArr = this.f24107k0;
                    if (z13 && (((z10 = this.f24102h1) && x10 > 0) || (!z10 && x10 < 0))) {
                        if (x10 < 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!U0(motionEvent, z11)) {
                            this.f24140y1 = true;
                            this.f24137x1 = false;
                            N0(false);
                            au0VarArr[0].setTranslationX(0.0f);
                            au0 au0Var = au0VarArr[1];
                            if (this.f24102h1) {
                                i11 = au0VarArr[0].getMeasuredWidth();
                            } else {
                                i11 = -au0VarArr[0].getMeasuredWidth();
                            }
                            au0Var.setTranslationX(i11);
                            Z0(0.0f, au0VarArr[1].F);
                            M0(getTabProgress());
                        }
                    }
                    if (this.f24140y1 && !this.f24137x1) {
                        if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                            if (x10 < 0) {
                                z12 = true;
                            }
                            U0(motionEvent, z12);
                        }
                    } else if (this.f24137x1) {
                        au0VarArr[0].setTranslationX(x10);
                        if (this.f24102h1) {
                            au0VarArr[1].setTranslationX(au0VarArr[0].getMeasuredWidth() + x10);
                        } else {
                            au0VarArr[1].setTranslationX(x10 - au0VarArr[0].getMeasuredWidth());
                        }
                        float abs2 = Math.abs(x10) / au0VarArr[0].getMeasuredWidth();
                        if (!D()) {
                            this.f24114o0 = 0.0f;
                        } else {
                            this.f24114o0 = b0(abs2);
                            s1(abs2);
                            float a02 = a0(abs2);
                            this.f24116p0 = a02;
                            if (a02 != 0.0f && D() && !q0()) {
                                i10 = 0;
                            } else {
                                i10 = 4;
                            }
                            this.f24121r0.setVisibility(i10);
                        }
                        q1(false);
                        Z0(abs2, au0VarArr[1].F);
                        M0(getTabProgress());
                        L0();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f24134w1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    g1(motionEvent);
                }
                return this.f24137x1;
            }
        }
        return false;
    }

    public final void p1() {
        boolean z10;
        float f7;
        org.telegram.ui.ActionBar.w0 w0Var = this.f24126t0;
        if (w0Var != null) {
            if (!this.f24131v1.getMessagesController().isPeerNoForwards(this.f24106j1) && !j0()) {
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
                w0Var.setBackground(org.telegram.ui.ActionBar.j6.f0(h0(org.telegram.ui.ActionBar.j6.f18327z8), 5, -1));
            }
        }
    }

    public boolean q0() {
        return false;
    }

    public final void q1(boolean z10) {
        wr0 wr0Var;
        cs0 cs0Var;
        kj0 kj0Var = this.f24124s0;
        if (kj0Var == null) {
            return;
        }
        float f7 = 0.0f;
        if (!this.V0 && (((wr0Var = this.V) == null || !wr0Var.g()) && ((cs0Var = this.W) == null || !cs0Var.f33253w))) {
            f7 = Utilities.clamp(this.f24114o0 + this.f24116p0, 1.0f, 0.0f);
        }
        kj0Var.setAlpha(f7);
        boolean z11 = false;
        if (z10) {
            if (a0(1.0f) > 0.5f) {
                z11 = true;
            }
            A(z11, true);
        } else if (this.f24136x0 == 2) {
            if (this.f24116p0 > 0.1f) {
                z11 = true;
            }
            A(z11, true);
        } else {
            if (this.f24114o0 < 0.1f) {
                z11 = true;
            }
            A(z11, true);
        }
    }

    public final boolean r0() {
        TLRPC.User user;
        long j3 = this.f24106j1;
        if (j3 <= 0 || (user = MessagesController.getInstance(this.f24131v1.getCurrentAccount()).getUser(Long.valueOf(j3))) == null || !user.bot) {
            return false;
        }
        return true;
    }

    public final void r1(boolean z10) {
        int i10 = 0;
        while (true) {
            au0[] au0VarArr = this.f24107k0;
            if (i10 < au0VarArr.length) {
                int childCount = au0VarArr[i10].h.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = au0VarArr[i10].h.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.l7) {
                        ((org.telegram.ui.Cells.l7) childAt).b(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.u7) {
                        ((org.telegram.ui.Cells.u7) childAt).i(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.o7) {
                        ((org.telegram.ui.Cells.o7) childAt).f(false, z10);
                    } else if (childAt instanceof org.telegram.ui.Cells.k7) {
                        ((org.telegram.ui.Cells.k7) childAt).e(false, z10);
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
        org.telegram.ui.ActionBar.w0 w0Var = this.m0;
        if (w0Var == null) {
            return;
        }
        au0[] au0VarArr = this.f24107k0;
        au0 au0Var = au0VarArr[1];
        float f10 = 0.0f;
        if (au0Var != null && au0Var.F == 11) {
            f10 = 0.0f + f7;
        }
        int i10 = 0;
        au0 au0Var2 = au0VarArr[0];
        if (au0Var2 != null && au0Var2.F == 11) {
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

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        boolean z10;
        int i10;
        TLRPC.ChatFull chatFull2 = this.f24093d1;
        if (chatFull2 != null && chatFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f24093d1 = chatFull;
        if (chatFull != null) {
            long j3 = chatFull.migrated_from_chat_id;
            if (j3 != 0 && this.f24090c1 == 0) {
                this.f24090c1 = -j3;
                int i11 = 0;
                while (true) {
                    xu0[] xu0VarArr = this.f24127t1;
                    if (i11 >= xu0VarArr.length) {
                        break;
                    }
                    if (xu0VarArr[i11].f29157b[1].size() == 0) {
                        xu0 xu0Var = xu0VarArr[i11];
                        xu0Var.f29162j[1] = this.f24093d1.migrated_from_max_id;
                        xu0Var.f29161i[1] = false;
                    }
                    i11++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.f24093d1;
        if (chatFull3 != null && z10 != chatFull3.stories_pinned_available) {
            xs0 xs0Var = this.I0;
            if (xs0Var != null) {
                if (q0()) {
                    i10 = 9;
                } else {
                    i10 = 8;
                }
                xs0Var.setInitialTabId(i10);
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

    public void setForwardRestrictedHint(s40 s40Var) {
        this.E1 = s40Var;
    }

    public void setMergeDialogId(long j3) {
        this.f24090c1 = j3;
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
            au0[] au0VarArr = this.f24107k0;
            if (i15 >= au0VarArr.length) {
                break;
            }
            au0VarArr[i15].setTranslationY(this.K1);
            i15++;
        }
        if (this.P0 != null) {
            K();
        } else {
            ts0 ts0Var = this.R0;
            if (ts0Var != null) {
                ts0Var.setTranslationY(AndroidUtilities.dp(48.0f) + i11);
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
            au0[] au0VarArr = this.f24107k0;
            if (au0VarArr != null) {
                for (au0 au0Var : au0VarArr) {
                    if (au0Var != null) {
                        gs0 gs0Var = au0Var.h;
                        int paddingLeft = gs0Var.getPaddingLeft();
                        gs0 gs0Var2 = au0Var.h;
                        int i11 = gs0Var2.Y2;
                        int paddingRight = gs0Var2.getPaddingRight();
                        gs0 gs0Var3 = au0Var.h;
                        int Y = Y(v0());
                        gs0Var3.f29809e3 = Y;
                        gs0Var.setPadding(paddingLeft, i11, paddingRight, Y);
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
                au0[] au0VarArr = this.f24107k0;
                if (i10 < au0VarArr.length) {
                    o1(au0VarArr[i10], true);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        boolean z10;
        TLRPC.UserFull userFull2 = this.f24095e1;
        if (userFull2 != null && userFull2.stories_pinned_available) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f24095e1 = userFull;
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
            au0[] au0VarArr = this.f24107k0;
            if (i11 >= au0VarArr.length) {
                break;
            }
            int measuredHeight = getMeasuredHeight();
            if (au0VarArr[i11].F == 8) {
                f7 = 280.0f;
            } else {
                f7 = 120.0f;
            }
            float f10 = (-(measuredHeight - Math.max(i10, AndroidUtilities.dp(f7)))) / 2.0f;
            au0VarArr[i11].f21597w.setTranslationY(f10);
            au0VarArr[i11].v.setTranslationY(-f10);
            i11++;
        }
        vr0 vr0Var = this.U;
        if (vr0Var != null) {
            vr0Var.setVisibleHeight(i10);
        }
        wr0 wr0Var = this.V;
        if (wr0Var != null) {
            wr0Var.setVisibleHeight(i10);
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
        org.telegram.ui.ActionBar.w0 w0Var = this.m0;
        if (w0Var == null) {
            return;
        }
        boolean z10 = true;
        au0 au0Var = this.f24107k0[1];
        z10 = (au0Var == null || au0Var.F != 11) ? false : false;
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
        scaleX.scaleY(f11).withEndAction(new ai.j(28, this, z10)).setDuration(420L).setInterpolator(wr.h).start();
    }

    public boolean u0() {
        return false;
    }

    public final void u1() {
        boolean z10;
        int i10;
        zh.a5 a5Var;
        boolean r02 = r0();
        org.telegram.ui.ActionBar.w0 w0Var = this.f24133w0;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f24130v0;
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
                SparseArray[] sparseArrayArr = this.Z0;
                if (i12 < sparseArrayArr[0].size()) {
                    MessageObject messageObject = (MessageObject) sparseArrayArr[0].valueAt(i12);
                    pt0 pt0Var = this.f24089c0;
                    if (pt0Var != null && (a5Var = pt0Var.f23089s) != null && !a5Var.m(messageObject.getId())) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.iv0.v1(boolean):void");
    }

    public final SpannableStringBuilder w() {
        if (this.W1 == null) {
            this.W1 = new SpannableStringBuilder();
            if (r0()) {
                this.W1.append((CharSequence) LocaleController.getString(R.string.ProfileBotPreviewEmptyButton));
            } else {
                this.W1.append((CharSequence) "c");
                this.W1.setSpan(new uq(R.drawable.filled_premium_camera, 0), 0, 1, 33);
                this.W1.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
            }
        }
        return this.W1;
    }

    public final Boolean w1(View view, View view2) {
        if (!this.f24115o1) {
            au0[] au0VarArr = this.f24107k0;
            boolean z10 = false;
            au0 au0Var = au0VarArr[0];
            if (au0Var != null) {
                int i10 = au0Var.F;
                this.f24117p1 = i10;
                boolean p02 = p0(i10);
                int[] iArr = this.f24110m1;
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
                    } else if (c0(au0VarArr[0].F) >= 5 || w0(au0VarArr[0].F)) {
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

    public final void x(w70 w70Var, org.telegram.ui.ActionBar.p2 p2Var, long j3, int i10) {
        String publicUsername;
        if (j3 > 0) {
            publicUsername = UserObject.getPublicUsername(MessagesController.getInstance(p2Var.getCurrentAccount()).getUser(Long.valueOf(j3)));
        } else {
            publicUsername = ChatObject.getPublicUsername(MessagesController.getInstance(p2Var.getCurrentAccount()).getChat(Long.valueOf(-j3)));
        }
        if (publicUsername == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("https://");
        a4.a.z(sb2, MessagesController.getInstance(p2Var.getCurrentAccount()).linkPrefix, "/", publicUsername, "/a/");
        sb2.append(i10);
        w70Var.c(R.drawable.media_share, LocaleController.getString(R.string.StoriesAlbumMenuShareLink), new gf(this, sb2.toString(), p2Var, 22), false);
    }

    public final boolean x0() {
        if (!C() || ((getClosestTab() != 8 && getClosestTab() != 13 && !w0(getClosestTab())) || !this.C1)) {
            wr0 wr0Var = this.V;
            if (wr0Var == null || !wr0Var.g()) {
                cs0 cs0Var = this.W;
                if ((cs0Var == null || !cs0Var.f33253w) && !this.f24115o1 && !this.f24100g1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final Boolean x1(View view, View view2) {
        if (!this.f24115o1) {
            au0[] au0VarArr = this.f24107k0;
            boolean z10 = false;
            au0 au0Var = au0VarArr[0];
            if (au0Var != null) {
                if (!this.f24108k1 || !p0(au0Var.F)) {
                    int i10 = au0VarArr[0].F;
                    this.f24117p1 = i10;
                    boolean p02 = p0(i10);
                    int[] iArr = this.f24110m1;
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
                        } else if (c0(au0VarArr[0].F) >= 5 || w0(au0VarArr[0].F)) {
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

    public final void y(org.telegram.ui.Components.w70 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.iv0.y(org.telegram.ui.Components.w70):void");
    }

    public final void y0(int i10, int i11, int i12, boolean z10) {
        xu0[] xu0VarArr = this.f24127t1;
        xu0VarArr[i10].f29156a.clear();
        xu0VarArr[i10].f29157b[0].clear();
        xu0VarArr[i10].f29157b[1].clear();
        xu0 xu0Var = xu0VarArr[i10];
        xu0Var.f29162j[0] = i11;
        xu0Var.f29161i[0] = false;
        xu0Var.f29164l = false;
        xu0Var.f29165m = i12;
        xu0Var.f29166n = (xu0Var.e() - i12) - 1;
        xu0 xu0Var2 = xu0VarArr[i10];
        if (xu0Var2.f29166n < 0) {
            xu0Var2.f29166n = 0;
        }
        xu0Var2.f29163k = i11;
        xu0Var2.f29167o = true;
        xu0Var2.f29160g = false;
        xu0Var2.f29168p++;
        au0 W = W(i10);
        if (W != null && W.h.getAdapter() != null) {
            W.h.getAdapter().l();
        }
        if (z10) {
            int i13 = 0;
            while (true) {
                au0[] au0VarArr = this.f24107k0;
                if (i13 < au0VarArr.length) {
                    au0 au0Var = au0VarArr[i13];
                    if (au0Var.F == i10) {
                        au0Var.f21598x.h1(Math.min(xu0VarArr[i10].e() - 1, xu0VarArr[i10].f29165m), 0);
                    }
                    i13++;
                } else {
                    return;
                }
            }
        }
    }

    public final void z(zt0 zt0Var, int i10, SparseBooleanArray sparseBooleanArray) {
        int childCount = zt0Var.getChildCount();
        a10 a10Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = zt0Var.getChildAt(i11);
            if (childAt instanceof a10) {
                a10Var = childAt;
            }
        }
        if (a10Var != null) {
            zt0Var.removeView(a10Var);
        }
        getViewTreeObserver().addOnPreDrawListener(new ct0(this, zt0Var, sparseBooleanArray, a10Var, i10));
    }

    public final void z0(boolean z10) {
        long j3 = this.F;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i10 == 0 && !t0()) {
            for (int i11 = 0; i11 < 4; i11++) {
                final int i12 = f24079d2[i11];
                xu0[] xu0VarArr = this.f24127t1;
                if (!xu0VarArr[i12].h || z10) {
                    long j10 = this.f24106j1;
                    if (!DialogObject.isEncryptedDialog(j10)) {
                        xu0VarArr[i12].h = false;
                        TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
                        if (i12 == 0) {
                            int i13 = xu0VarArr[i12].f29169q;
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
                        org.telegram.ui.ActionBar.p2 p2Var = this.f24131v1;
                        tL_messages_getSearchResultsPositions.peer = p2Var.getMessagesController().getInputPeer(j10);
                        if (i10 != 0 && p2Var.getUserConfig().getClientUserId() == j10) {
                            tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                            tL_messages_getSearchResultsPositions.saved_peer_id = p2Var.getMessagesController().getInputPeer(j3);
                        }
                        final int i14 = xu0VarArr[i12].f29168p;
                        ConnectionsManager.getInstance(p2Var.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(p2Var.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new ir0(iv0.this, tL_error, i14, i12, tLObject, 0));
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
